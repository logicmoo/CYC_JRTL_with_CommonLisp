package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class genl_predicates extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.genl_predicates";
    public static final String myFingerPrint = "7a487269490a959e8a8822b6e7f1a7d89971370e1bc7e14485fe27ff86b5b654";
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 21640L)
    private static SubLSymbol $sbhl_arg_type_alist$;
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 22088L)
    private static SubLSymbol $sbhl_arg_type_genls_stores$;
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47494L)
    private static SubLSymbol $cached_candidate_genl_preds_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47611L)
    private static SubLSymbol $cached_candidate_genl_preds_in_mt_caching_state$;
    private static final SubLSymbol $sym0$FORT_P;
    private static final SubLObject $const1$genlPreds;
    private static final SubLSymbol $sym2$GENL_PREDICATES;
    private static final SubLList $list3;
    private static final SubLString $str4$Returns_the_local_genlPreds_of_PR;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$MIN_GENL_PREDICATES;
    private static final SubLString $str8$Returns_the_most_specific_local_g;
    private static final SubLObject $const9$genlInverse;
    private static final SubLSymbol $sym10$GENL_INVERSES;
    private static final SubLString $str11$Returns_the_local_genlInverses_of;
    private static final SubLSymbol $sym12$MIN_GENL_INVERSES;
    private static final SubLString $str13$Returns_the_most_specific_local_g;
    private static final SubLSymbol $sym14$NOT_GENL_PREDICATES;
    private static final SubLString $str15$Returns_the_local_negated_genlPre;
    private static final SubLSymbol $sym16$MAX_NOT_GENL_PREDICATES;
    private static final SubLString $str17$Returns_the_most_general_local_ne;
    private static final SubLSymbol $sym18$NOT_GENL_INVERSES;
    private static final SubLSymbol $sym19$MAX_NOT_GENL_INVERSES;
    private static final SubLSymbol $sym20$SPEC_PREDICATES;
    private static final SubLString $str21$Returns_the_specPreds_of_PRED;
    private static final SubLSymbol $sym22$MAX_SPEC_PREDICATES;
    private static final SubLString $str23$Returns_the_most_general_specPred;
    private static final SubLSymbol $sym24$SPEC_INVERSES;
    private static final SubLString $str25$Returns_the_specInverses_of_PRED;
    private static final SubLSymbol $sym26$MAX_SPEC_INVERSES;
    private static final SubLString $str27$Returns_the_most_general_specInve;
    private static final SubLSymbol $sym28$NOT_SPEC_PREDICATES;
    private static final SubLString $str29$Returns_the_negated_specPreds_of_;
    private static final SubLSymbol $sym30$MIN_NOT_SPEC_PREDICATES;
    private static final SubLString $str31$Returns_the_most_specific_negated;
    private static final SubLSymbol $sym32$NOT_SPEC_INVERSES;
    private static final SubLSymbol $sym33$MIN_NOT_SPEC_INVERSES;
    private static final SubLSymbol $sym34$GENL_PREDICATE_SIBLINGS;
    private static final SubLString $str35$Returns_the_direct___genlPreds_of;
    private static final SubLSymbol $sym36$GENL_INVERSE_SIBLINGS;
    private static final SubLString $str37$Returns_the_direct___genlInverse_;
    private static final SubLSymbol $sym38$SPEC_PREDICATE_SIBLINGS;
    private static final SubLString $str39$Returns_the_direct_spec_preds_of_;
    private static final SubLSymbol $sym40$SPEC_INVERSE_SIBLINGS;
    private static final SubLString $str41$Returns_the_direct_spec_inverses_;
    private static final SubLSymbol $sym42$GENL_PREDICATE_ROOTS;
    private static final SubLString $str43$Returns_the_most_general_genlPred;
    private static final SubLSymbol $sym44$GENL_INVERSE_ROOTS;
    private static final SubLString $str45$Returns_the_most_general_genlInve;
    private static final SubLSymbol $sym46$ALL_GENL_PREDICATES;
    private static final SubLString $str47$Returns_all_genlPreds_of_predicat;
    private static final SubLSymbol $kw48$DEPTH;
    private static final SubLSymbol $kw49$STACK;
    private static final SubLSymbol $kw50$QUEUE;
    private static final SubLSymbol $sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw52$ERROR;
    private static final SubLString $str53$_A_is_not_a__A;
    private static final SubLSymbol $sym54$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw55$CERROR;
    private static final SubLString $str56$continue_anyway;
    private static final SubLSymbol $kw57$WARN;
    private static final SubLString $str58$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str59$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str60$attempting_to_bind_direction_link;
    private static final SubLString $str61$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym62$ALL_GENL_INVERSES;
    private static final SubLString $str63$Returns_all_genlInverses_of_predi;
    private static final SubLSymbol $sym64$ALL_SPEC_PREDICATES;
    private static final SubLString $str65$Returns_all_predicates_having_PRE;
    private static final SubLSymbol $sym66$ALL_SPEC_INVERSES;
    private static final SubLString $str67$Returns_all_predicates_having_PRE;
    private static final SubLObject $const68$InverseBinaryPredicateFn;
    private static final SubLSymbol $sym69$EL_FORT_P;
    private static final SubLSymbol $sym70$LISTP;
    private static final SubLSymbol $sym71$ALL_GENL_PREDS_AMONG;
    private static final SubLList $list72;
    private static final SubLString $str73$Returns_those_genlPreds_of_PRED_t;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$ALL_NOT_GENL_PREDICATES;
    private static final SubLString $str76$Returns_all_negated_genlPreds_of_;
    private static final SubLSymbol $sym77$ALL_NOT_GENL_INVERSES;
    private static final SubLSymbol $sym78$ALL_NOT_SPEC_PREDICATES;
    private static final SubLString $str79$Returns_all_negated_specPreds_of_;
    private static final SubLSymbol $sym80$ALL_NOT_SPEC_INVERSES;
    private static final SubLString $str81$Returns_all_predicates_having_PRE;
    private static final SubLSymbol $sym82$UNION_ALL_GENL_PREDICATES;
    private static final SubLList $list83;
    private static final SubLString $str84$Returns_all_genl_predicates_of_ea;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$UNION_ALL_SPEC_PREDICATES;
    private static final SubLString $str87$Returns_all_spec_predicates_of_ea;
    private static final SubLSymbol $sym88$UNION_ALL_GENL_INVERSES;
    private static final SubLString $str89$Returns_all_genl_inverses_of_each;
    private static final SubLSymbol $sym90$UNION_ALL_SPEC_INVERSES;
    private static final SubLString $str91$Returns_all_specs_of_each_predica;
    private static final SubLSymbol $sym92$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym93$MAP_ALL_GENL_PREDS;
    private static final SubLList $list94;
    private static final SubLString $str95$Apply_FN_to_each_genlPred_of_PRED;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$SOME_ALL_GENL_PREDS;
    private static final SubLString $str98$Apply_FN_to_each_genlPred_of_PRED;
    private static final SubLSymbol $sym99$SOME_ALL_GENL_INVERSES;
    private static final SubLSymbol $sym100$MAP_ALL_SPEC_PREDS;
    private static final SubLSymbol $sym101$SOME_ALL_SPEC_PREDS;
    private static final SubLSymbol $sym102$INTEGERP;
    private static final SubLObject $const103$genls;
    private static final SubLSymbol $sym104$GATHER_IF_SEARCHED_ARG_CONSTRAINTS;
    private static final SubLSymbol $sym105$ALL_SPEC_PREDS_WRT_TYPE;
    private static final SubLList $list106;
    private static final SubLString $str107$Returns_those_all_spec_preds_of_P;
    private static final SubLList $list108;
    private static final SubLObject $const109$isa;
    private static final SubLSymbol $sym110$ALL_SPEC_PREDS_WRT_ARG;
    private static final SubLList $list111;
    private static final SubLString $str112$Returns_those_all_spec_preds_of_P;
    private static final SubLList $list113;
    private static final SubLList $list114;
    private static final SubLSymbol $sym115$CLET;
    private static final SubLSymbol $sym116$_SBHL_ARG_TYPE_ALIST_;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$SBHL_INITIALIZE_ARG_TYPE_GENLS_STORES;
    private static final SubLSymbol $sym119$SBHL_ARG_TYPES_ALIST_SATISFIED_P;
    private static final SubLObject $const120$typedGenlPreds;
    private static final SubLSymbol $kw121$GAF;
    private static final SubLSymbol $kw122$TRUE;
    private static final SubLObject $const123$typedGenlInverse;
    private static final SubLObject $const124$True_JustificationTruth;
    private static final SubLSymbol $kw125$OLD;
    private static final SubLSymbol $kw126$RESOURCE;
    private static final SubLSymbol $sym127$MIN_PREDICATES;
    private static final SubLString $str128$Returns_the_most_specific_predica;
    private static final SubLSymbol $sym129$MAX_PREDICATES;
    private static final SubLString $str130$Returns_the_most_general_predicat;
    private static final SubLSymbol $sym131$MIN_CEILING_PREDICATES;
    private static final SubLList $list132;
    private static final SubLString $str133$Returns_the_most_specific_common_;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$MAX_FLOOR_PREDICATES;
    private static final SubLString $str136$Returns_the_most_general_common_s;
    private static final SubLSymbol $sym137$GENL_PREDICATE_;
    private static final SubLList $list138;
    private static final SubLString $str139$Is_GENL_a_genlPred_of_SPEC______a;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const143$EverythingPSC;
    private static final SubLSymbol $sym144$SPEC_PREDICATE_;
    private static final SubLList $list145;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$GENL_INVERSE_;
    private static final SubLString $str148$Is_GENL_a_genlInverse_of_SPEC____;
    private static final SubLSymbol $sym149$SPEC_INVERSE_;
    private static final SubLSymbol $sym150$ANY_GENL_PREDICATE_;
    private static final SubLList $list151;
    private static final SubLString $str152$Returns_T_iff__genl_predicate__SP;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$NOT_GENL_PREDICATE_;
    private static final SubLList $list155;
    private static final SubLString $str156$Is_NOT_GENL_known_to_be_not_a_gen;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$NOT_GENL_INVERSE_;
    private static final SubLString $str159$Is_NOT_GENL_a_negated_genlInverse;
    private static final SubLSymbol $sym160$ANY_NOT_GENL_PREDICATE_;
    private static final SubLList $list161;
    private static final SubLString $str162$Is_any_predicate_in_NOT_GENLS_not;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$HLMT_P;
    private static final SubLSymbol $sym165$TV_P;
    private static final SubLSymbol $sym166$INTERSECTING_PREDICATES_;
    private static final SubLList $list167;
    private static final SubLString $str168$Does_the_extension_of_PRED1_inclu;
    private static final SubLList $list169;
    private static final SubLSymbol $sym170$WHY_GENL_PREDICATE_;
    private static final SubLList $list171;
    private static final SubLString $str172$A_justification_of__genlPreds_SPE;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$WHY_NOT_GENL_PREDICATE_;
    private static final SubLString $str175$A_justification_of__not__genlPred;
    private static final SubLSymbol $sym176$WHY_GENL_INVERSE_;
    private static final SubLList $list177;
    private static final SubLString $str178$A_justification_of__genlInverse_P;
    private static final SubLList $list179;
    private static final SubLObject $const180$genlMt;
    private static final SubLSymbol $sym181$WHY_NOT_GENL_INVERSE_;
    private static final SubLString $str182$A_justification_of__not__genlInve;
    private static final SubLSymbol $kw183$ASSERTION;
    private static final SubLSymbol $sym184$MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS;
    private static final SubLList $list185;
    private static final SubLString $str186$_return_listp__In_what__most_genl;
    private static final SubLSymbol $sym187$MAX_FLOOR_MTS_OF_GENL_INVERSE_PATHS;
    private static final SubLList $list188;
    private static final SubLString $str189$In_what__most_genl__mts_is_GENL_I;
    private static final SubLList $list190;
    private static final SubLSymbol $sym191$CACHED_CANDIDATE_GENL_PREDS;
    private static final SubLSymbol $sym192$_CACHED_CANDIDATE_GENL_PREDS_CACHING_STATE_;
    private static final SubLInteger $int193$512;
    private static final SubLInteger $int194$64;
    private static final SubLSymbol $sym195$CACHED_CANDIDATE_GENL_PREDS_IN_MT;
    private static final SubLSymbol $sym196$_CACHED_CANDIDATE_GENL_PREDS_IN_MT_CACHING_STATE_;
    private static final SubLSymbol $kw197$ISA;
    private static final SubLSymbol $kw198$GENL;
    private static final SubLSymbol $sym199$CANDIDATE_PREDS_FOR_ARG_ISA;
    private static final SubLSymbol $sym200$CANDIDATE_PREDS_FOR_ARG_GENL;
    private static final SubLSymbol $sym201$MAX;
    private static final SubLSymbol $sym202$ARITY;
    private static final SubLSymbol $sym203$GENL_PREDICATE_AFTER_ADDING;
    private static final SubLSymbol $sym204$ADD_GENL_PREDICATE;
    private static final SubLSymbol $sym205$GENL_INVERSE_AFTER_ADDING;
    private static final SubLSymbol $sym206$ADD_GENL_INVERSE;
    private static final SubLSymbol $sym207$REMOVE_GENL_PREDICATE;
    private static final SubLSymbol $sym208$REMOVE_GENL_INVERSE;
    private static final SubLSymbol $sym209$GENL_PREDICATE_AFTER_REMOVING;
    private static final SubLSymbol $sym210$GENL_INVERSE_AFTER_REMOVING;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 800L)
    public static SubLObject genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 1358L)
    public static SubLObject min_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 1626L)
    public static SubLObject genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 1875L)
    public static SubLObject min_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_min_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 2146L)
    public static SubLObject not_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 2434L)
    public static SubLObject max_not_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 2716L)
    public static SubLObject not_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 2975L)
    public static SubLObject max_not_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_max_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 3255L)
    public static SubLObject spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 3521L)
    public static SubLObject max_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 3785L)
    public static SubLObject spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 4029L)
    public static SubLObject max_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_max_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 4294L)
    public static SubLObject not_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 4583L)
    public static SubLObject min_not_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 4859L)
    public static SubLObject not_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 5127L)
    public static SubLObject min_not_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_min_backward_false_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 5403L)
    public static SubLObject genl_predicate_siblings(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 5709L)
    public static SubLObject genl_inverse_siblings(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_siblings_forward(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 6008L)
    public static SubLObject spec_predicate_siblings(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 6302L)
    public static SubLObject spec_inverse_siblings(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_link_methods.sbhl_siblings_backward(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 6603L)
    public static SubLObject genl_predicate_roots(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return max_predicates(all_genl_predicates(pred, mt, tv), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 6859L)
    public static SubLObject genl_inverse_roots(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return max_predicates(all_genl_inverses(pred, mt, tv), mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 7101L)
    public static SubLObject all_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 7506L)
    public static SubLObject all_genl_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)genl_predicates.NIL;
        final SubLObject deck_type = (SubLObject)genl_predicates.$kw50$QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = (SubLObject)genl_predicates.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject tv_var = tv;
                    final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((genl_predicates.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((genl_predicates.NIL != tv_var) ? genl_predicates.$sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (genl_predicates.NIL != tv_var && genl_predicates.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && genl_predicates.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)genl_predicates.$kw52$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)genl_predicates.ONE_INTEGER, (SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)genl_predicates.$kw55$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)genl_predicates.ONE_INTEGER, (SubLObject)genl_predicates.$str56$continue_anyway, (SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)genl_predicates.$kw57$WARN)) {
                                Errors.warn((SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)genl_predicates.$str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)genl_predicates.$str56$continue_anyway, (SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genl_predicates.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), thread);
                            if (genl_predicates.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || genl_predicates.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genl_predicates.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)genl_predicates.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); genl_predicates.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$10 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject genl_pred = node_var_$10;
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            preds = (SubLObject)ConsesLow.cons(genl_pred, preds);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds));
                                            SubLObject module_var = (SubLObject)genl_predicates.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (genl_predicates.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((genl_predicates.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(genl_predicates.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$10);
                                                    if (genl_predicates.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED));
                                                        if (genl_predicates.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED));
                                                            if (genl_predicates.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); genl_predicates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$14 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (genl_predicates.NIL != mt_relevance_macros.relevant_mtP(mt_$14)) {
                                                                        final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$14, thread);
                                                                            SubLObject iteration_state_$16;
                                                                            for (iteration_state_$16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); genl_predicates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$16); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next(iteration_state_$16)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv_$17 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$16);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (genl_predicates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$17)) {
                                                                                    final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$17, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (genl_predicates.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)genl_predicates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); genl_predicates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (genl_predicates.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && genl_predicates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)genl_predicates.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)genl_predicates.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)genl_predicates.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (genl_predicates.NIL != csome_list_var) {
                                                                                                if (genl_predicates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)genl_predicates.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)genl_predicates.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)genl_predicates.$str59$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$8, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$16);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$7, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)genl_predicates.FIVE_INTEGER, (SubLObject)genl_predicates.$str60$attempting_to_bind_direction_link, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (genl_predicates.NIL != obsolete.cnat_p(node, (SubLObject)genl_predicates.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$19;
                                                        final SubLObject new_list = cdolist_list_var_$19 = ((genl_predicates.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)genl_predicates.NIL;
                                                        generating_fn = cdolist_list_var_$19.first();
                                                        while (genl_predicates.NIL != cdolist_list_var_$19) {
                                                            final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (genl_predicates.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)genl_predicates.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); genl_predicates.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (genl_predicates.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && genl_predicates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)genl_predicates.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)genl_predicates.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)genl_predicates.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (genl_predicates.NIL != csome_list_var2) {
                                                                        if (genl_predicates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)genl_predicates.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)genl_predicates.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)genl_predicates.$str59$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$9, thread);
                                                            }
                                                            cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                                            generating_fn = cdolist_list_var_$19.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$6, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$7, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)genl_predicates.TWO_INTEGER, (SubLObject)genl_predicates.$str61$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED)), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$6, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 7756L)
    public static SubLObject all_genl_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return all_genl_predicates(pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 7858L)
    public static SubLObject all_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 8162L)
    public static SubLObject all_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 8502L)
    public static SubLObject all_spec_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return all_spec_predicates(pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 8604L)
    public static SubLObject all_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 8916L)
    public static SubLObject all_spec_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)genl_predicates.NIL;
        final SubLObject deck_type = (SubLObject)genl_predicates.$kw50$QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = (SubLObject)genl_predicates.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$22 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject tv_var = tv;
                    final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((genl_predicates.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((genl_predicates.NIL != tv_var) ? genl_predicates.$sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (genl_predicates.NIL != tv_var && genl_predicates.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && genl_predicates.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)genl_predicates.$kw52$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)genl_predicates.ONE_INTEGER, (SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)genl_predicates.$kw55$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)genl_predicates.ONE_INTEGER, (SubLObject)genl_predicates.$str56$continue_anyway, (SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)genl_predicates.$kw57$WARN)) {
                                Errors.warn((SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)genl_predicates.$str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)genl_predicates.$str56$continue_anyway, (SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$27 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genl_predicates.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), thread);
                            if (genl_predicates.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || genl_predicates.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$26 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genl_predicates.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)genl_predicates.UNPROVIDED);
                                    for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); genl_predicates.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$31 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        final SubLObject spec_pred = node_var_$31;
                                        final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            preds = (SubLObject)ConsesLow.cons(spec_pred, preds);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds));
                                            SubLObject module_var = (SubLObject)genl_predicates.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (genl_predicates.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((genl_predicates.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(genl_predicates.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$31);
                                                    if (genl_predicates.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED));
                                                        if (genl_predicates.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED));
                                                            if (genl_predicates.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); genl_predicates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$35 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (genl_predicates.NIL != mt_relevance_macros.relevant_mtP(mt_$35)) {
                                                                        final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$35, thread);
                                                                            SubLObject iteration_state_$37;
                                                                            for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); genl_predicates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv_$38 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (genl_predicates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$38)) {
                                                                                    final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$38, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (genl_predicates.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)genl_predicates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); genl_predicates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (genl_predicates.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && genl_predicates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)genl_predicates.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)genl_predicates.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)genl_predicates.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (genl_predicates.NIL != csome_list_var) {
                                                                                                if (genl_predicates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)genl_predicates.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)genl_predicates.UNPROVIDED);
                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)genl_predicates.$str59$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$29, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$28, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)genl_predicates.FIVE_INTEGER, (SubLObject)genl_predicates.$str60$attempting_to_bind_direction_link, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (genl_predicates.NIL != obsolete.cnat_p(node, (SubLObject)genl_predicates.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$40;
                                                        final SubLObject new_list = cdolist_list_var_$40 = ((genl_predicates.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)genl_predicates.NIL;
                                                        generating_fn = cdolist_list_var_$40.first();
                                                        while (genl_predicates.NIL != cdolist_list_var_$40) {
                                                            final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (genl_predicates.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)genl_predicates.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); genl_predicates.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (genl_predicates.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && genl_predicates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)genl_predicates.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)genl_predicates.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)genl_predicates.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (genl_predicates.NIL != csome_list_var2) {
                                                                        if (genl_predicates.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)genl_predicates.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)genl_predicates.UNPROVIDED);
                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)genl_predicates.$str59$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$30, thread);
                                                            }
                                                            cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                                                            generating_fn = cdolist_list_var_$40.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$27, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$27, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$26, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$28, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$26, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$25, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)genl_predicates.TWO_INTEGER, (SubLObject)genl_predicates.$str61$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED)), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$27, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$25, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$24, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$24, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$23, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$22, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 9166L)
    public static SubLObject inverse_binary_predicates(final SubLObject binary_pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return conses_high.intersection(spec_inverses(binary_pred, mt, tv), genl_inverses(binary_pred, mt, tv), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 9367L)
    public static SubLObject best_inverse_binary_predicate(final SubLObject binary_pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        final SubLObject inverse_binary_predicates = inverse_binary_predicates(binary_pred, mt, tv);
        if (genl_predicates.NIL == inverse_binary_predicates) {
            return (SubLObject)genl_predicates.NIL;
        }
        if (genl_predicates.NIL != list_utilities.singletonP(inverse_binary_predicates)) {
            return inverse_binary_predicates.first();
        }
        SubLObject non_inverse_binary_predicate_fn_nats = (SubLObject)genl_predicates.NIL;
        SubLObject cdolist_list_var = inverse_binary_predicates;
        SubLObject inverse_binary_predicate = (SubLObject)genl_predicates.NIL;
        inverse_binary_predicate = cdolist_list_var.first();
        while (genl_predicates.NIL != cdolist_list_var) {
            if (genl_predicates.NIL == narts_high.nart_with_functor_p(genl_predicates.$const68$InverseBinaryPredicateFn, inverse_binary_predicate)) {
                non_inverse_binary_predicate_fn_nats = (SubLObject)ConsesLow.cons(inverse_binary_predicate, non_inverse_binary_predicate_fn_nats);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inverse_binary_predicate = cdolist_list_var.first();
        }
        if (genl_predicates.NIL == non_inverse_binary_predicate_fn_nats) {
            return inverse_binary_predicates.first();
        }
        return non_inverse_binary_predicate_fn_nats.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 10130L)
    public static SubLObject all_proper_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.delete(pred, all_genl_predicates(pred, mt, tv), Symbols.symbol_function((SubLObject)genl_predicates.EQL), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 10381L)
    public static SubLObject all_proper_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.delete(pred, all_genl_inverses(pred, mt, tv), Symbols.symbol_function((SubLObject)genl_predicates.EQL), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 10662L)
    public static SubLObject all_proper_genl_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.delete(pred, all_genl_predicates_and_inverses(pred, mt, tv), Symbols.symbol_function((SubLObject)genl_predicates.EQL), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 10942L)
    public static SubLObject all_proper_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.delete(pred, all_spec_predicates(pred, mt, tv), Symbols.symbol_function((SubLObject)genl_predicates.EQL), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 11177L)
    public static SubLObject all_proper_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.delete(pred, all_spec_inverses(pred, mt, tv), Symbols.symbol_function((SubLObject)genl_predicates.EQL), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 11456L)
    public static SubLObject all_proper_spec_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.delete(pred, all_spec_predicates_and_inverses(pred, mt, tv), Symbols.symbol_function((SubLObject)genl_predicates.EQL), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 11779L)
    public static SubLObject all_genl_preds_among(final SubLObject pred, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym69$EL_FORT_P);
        enforceType(candidates, genl_predicates.$sym70$LISTP);
        return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, candidates, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 12137L)
    public static SubLObject all_spec_predicates_among(final SubLObject genl_pred, final SubLObject spec_candidates, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), genl_pred, spec_candidates, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 12423L)
    public static SubLObject all_genl_inverses_among(final SubLObject pred, final SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, candidates, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 12671L)
    public static SubLObject all_spec_inverses_among(final SubLObject genl_pred, final SubLObject spec_candidates, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return keyhash_utilities.fast_intersection(all_spec_inverses(genl_pred, mt, tv), spec_candidates, Symbols.symbol_function((SubLObject)genl_predicates.EQ), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 13142L)
    public static SubLObject all_not_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 13478L)
    public static SubLObject all_not_genl_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return all_not_genl_predicates(pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 13580L)
    public static SubLObject all_not_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_forward_false_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 13901L)
    public static SubLObject all_not_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 14225L)
    public static SubLObject all_not_spec_preds(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return all_not_spec_predicates(pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 14327L)
    public static SubLObject all_not_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        return sbhl_search_implied_relations.sbhl_all_implied_backward_false_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 14661L)
    public static SubLObject union_all_genl_predicates(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(preds, genl_predicates.$sym70$LISTP);
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), preds, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 14955L)
    public static SubLObject union_all_spec_predicates(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(preds, genl_predicates.$sym70$LISTP);
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), preds, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 15239L)
    public static SubLObject union_all_genl_inverses(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(preds, genl_predicates.$sym70$LISTP);
        return sbhl_search_methods.sbhl_union_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), preds, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 15520L)
    public static SubLObject union_all_spec_inverses(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(preds, genl_predicates.$sym70$LISTP);
        return sbhl_search_methods.sbhl_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), preds, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 15794L)
    public static SubLObject union_all_spec_predicates_and_inverses(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)genl_predicates.NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_result$.bind((SubLObject)genl_predicates.NIL, thread);
            try {
                sbhl_search_methods.sbhl_simply_union_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), preds, mt, tv);
            }
            finally {
                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                }
            }
        }
        finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 16111L)
    public static SubLObject map_all_genl_preds(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        enforceType(fn, genl_predicates.$sym92$FUNCTION_SPEC_P);
        sbhl_search_methods.sbhl_map_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, fn, mt, tv);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 16511L)
    public static SubLObject some_all_genl_preds(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        enforceType(fn, genl_predicates.$sym92$FUNCTION_SPEC_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, fn, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 16810L)
    public static SubLObject some_all_genl_inverses(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        enforceType(fn, genl_predicates.$sym92$FUNCTION_SPEC_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, fn, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 17114L)
    public static SubLObject some_all_genl_preds_and_inverses(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_methods.sbhl_simply_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, fn, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 17392L)
    public static SubLObject map_all_spec_preds(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        enforceType(fn, genl_predicates.$sym92$FUNCTION_SPEC_P);
        sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, fn, mt, tv);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 17647L)
    public static SubLObject map_spec_preds(final SubLObject pred, final SubLObject fn, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return map_all_spec_preds(pred, fn, mt, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 17778L)
    public static SubLObject map_all_spec_preds_and_inverses(final SubLObject fn, final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        sbhl_search_methods.sbhl_simply_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, fn, mt, tv);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 18087L)
    public static SubLObject some_all_spec_preds(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        enforceType(fn, genl_predicates.$sym92$FUNCTION_SPEC_P);
        return sbhl_search_methods.sbhl_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, fn, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 18386L)
    public static SubLObject some_all_spec_preds_and_inverses(final SubLObject pred, final SubLObject fn, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, fn, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 18571L)
    public static SubLObject count_all_genl_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.length(all_genl_predicates(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 18697L)
    public static SubLObject count_all_genl_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.length(all_genl_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 18819L)
    public static SubLObject count_all_genl_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.length(all_genl_predicates_and_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 18971L)
    public static SubLObject count_all_spec_predicates(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.length(all_spec_predicates(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 19097L)
    public static SubLObject count_all_spec_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.length(all_spec_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 19219L)
    public static SubLObject count_all_spec_predicates_and_inverses(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return Sequences.length(all_spec_predicates_and_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 19371L)
    public static SubLObject all_spec_preds_wrt_type(final SubLObject pred, final SubLObject col, final SubLObject arg, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        enforceType(col, genl_predicates.$sym0$FORT_P);
        enforceType(arg, genl_predicates.$sym102$INTEGERP);
        if (genl_predicates.NIL != fort_types_interface.predicateP(pred) && genl_predicates.NIL != fort_types_interface.collectionP(col) && genl_predicates.NIL != subl_promotions.memberP(arg, czer_vars.$arg_positions$.getGlobalValue(), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED)) {
            SubLObject result = (SubLObject)genl_predicates.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$45 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$46 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const103$genls), col, mt, tv);
                                            }
                                            finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$47, thread);
                                            }
                                            final SubLObject _prev_bind_0_$48 = sbhl_search_vars.$sbhl_access_arg$.currentBinding(thread);
                                            final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_access_arg$.bind(arg, thread);
                                                sbhl_search_vars.$sbhl_result$.bind((SubLObject)genl_predicates.NIL, thread);
                                                try {
                                                    sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, (SubLObject)genl_predicates.$sym104$GATHER_IF_SEARCHED_ARG_CONSTRAINTS, mt, tv);
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                                        final SubLObject _values = Values.getValuesAsVector();
                                                        result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                        Values.restoreValuesFromVector(_values);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_2, thread);
                                                sbhl_search_vars.$sbhl_access_arg$.rebind(_prev_bind_0_$48, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_$46, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$45, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$44, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                        final SubLObject _values5 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values5);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 20207L)
    public static SubLObject all_spec_preds_wrt_arg(final SubLObject pred, final SubLObject fort, final SubLObject arg, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        enforceType(fort, genl_predicates.$sym0$FORT_P);
        enforceType(arg, genl_predicates.$sym102$INTEGERP);
        if (genl_predicates.NIL != fort_types_interface.predicateP(pred) && genl_predicates.NIL != forts.fort_p(fort) && genl_predicates.NIL != subl_promotions.memberP(arg, czer_vars.$arg_positions$.getGlobalValue(), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED)) {
            SubLObject result = (SubLObject)genl_predicates.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$54 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$55 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$56 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            final SubLObject _prev_bind_0_$57 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                                sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const109$isa), fort, mt, tv);
                                                if (genl_predicates.NIL != fort_types_interface.collectionP(fort)) {
                                                    sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const103$genls), fort, mt, tv);
                                                }
                                            }
                                            finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$57, thread);
                                            }
                                            final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_access_arg$.currentBinding(thread);
                                            final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_access_arg$.bind(arg, thread);
                                                sbhl_search_vars.$sbhl_result$.bind((SubLObject)genl_predicates.NIL, thread);
                                                try {
                                                    sbhl_search_methods.sbhl_map_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, (SubLObject)genl_predicates.$sym104$GATHER_IF_SEARCHED_ARG_CONSTRAINTS, mt, tv);
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                                        final SubLObject _values = Values.getValuesAsVector();
                                                        result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                        Values.restoreValuesFromVector(_values);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_2, thread);
                                                sbhl_search_vars.$sbhl_access_arg$.rebind(_prev_bind_0_$58, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_$56, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$55, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$54, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                        final SubLObject _values5 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values5);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 21083L)
    public static SubLObject gather_if_searched_arg_constraints(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_isas = kb_accessors.argn_isa(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), (SubLObject)genl_predicates.UNPROVIDED);
        SubLObject noP = Types.sublisp_null(arg_isas);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
            if (genl_predicates.NIL == noP) {
                SubLObject csome_list_var;
                SubLObject arg_isa;
                for (csome_list_var = arg_isas, arg_isa = (SubLObject)genl_predicates.NIL, arg_isa = csome_list_var.first(); genl_predicates.NIL == noP && genl_predicates.NIL != csome_list_var; noP = (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == sbhl_marking_utilities.sbhl_marked_node_p(arg_isa, (SubLObject)genl_predicates.UNPROVIDED)), csome_list_var = csome_list_var.rest(), arg_isa = csome_list_var.first()) {}
            }
            if (genl_predicates.NIL == noP) {
                SubLObject csome_list_var;
                SubLObject arg_genl;
                for (csome_list_var = kb_accessors.argn_genl(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), (SubLObject)genl_predicates.UNPROVIDED), arg_genl = (SubLObject)genl_predicates.NIL, arg_genl = csome_list_var.first(); genl_predicates.NIL == noP && genl_predicates.NIL != csome_list_var; noP = (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == sbhl_marking_utilities.sbhl_marked_node_p(arg_genl, (SubLObject)genl_predicates.UNPROVIDED)), csome_list_var = csome_list_var.rest(), arg_genl = csome_list_var.first()) {}
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        if (genl_predicates.NIL == noP) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue((SubLObject)ConsesLow.cons(pred, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 21806L)
    public static SubLObject get_sbhl_arg_type_alist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return genl_predicates.$sbhl_arg_type_alist$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 21922L)
    public static SubLObject with_sbhl_arg_type_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject alist = (SubLObject)genl_predicates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)genl_predicates.$list114);
        alist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)genl_predicates.$sym115$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)genl_predicates.$sym116$_SBHL_ARG_TYPE_ALIST_, alist)), ConsesLow.append(body, (SubLObject)genl_predicates.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 22249L)
    public static SubLObject get_sbhl_arg_type_store(final SubLObject key_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup(genl_predicates.$sbhl_arg_type_genls_stores$.getDynamicValue(thread), key_list, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 22418L)
    public static SubLObject with_new_sbhl_arg_type_genls_stores(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject alist = (SubLObject)genl_predicates.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)genl_predicates.$list114);
        alist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)genl_predicates.$sym115$CLET, (SubLObject)genl_predicates.$list117, (SubLObject)ConsesLow.list((SubLObject)genl_predicates.$sym118$SBHL_INITIALIZE_ARG_TYPE_GENLS_STORES, alist), ConsesLow.append(body, (SubLObject)genl_predicates.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 22790L)
    public static SubLObject sbhl_initialize_arg_type_genls_stores(final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = alist;
        SubLObject arg_info = (SubLObject)genl_predicates.NIL;
        arg_info = cdolist_list_var.first();
        while (genl_predicates.NIL != cdolist_list_var) {
            final SubLObject arg = arg_info.first();
            SubLObject cdolist_list_var_$64 = conses_high.second(arg_info);
            SubLObject constraints = (SubLObject)genl_predicates.NIL;
            constraints = cdolist_list_var_$64.first();
            while (genl_predicates.NIL != cdolist_list_var_$64) {
                final SubLObject constraint_pred = constraints.first();
                SubLObject cdolist_list_var_$65 = constraints.rest();
                SubLObject constraint_col = (SubLObject)genl_predicates.NIL;
                constraint_col = cdolist_list_var_$65.first();
                while (genl_predicates.NIL != cdolist_list_var_$65) {
                    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const103$genls), constraint_col, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                            dictionary.dictionary_enter(genl_predicates.$sbhl_arg_type_genls_stores$.getDynamicValue(thread), (SubLObject)ConsesLow.list(arg, constraint_pred, constraint_col), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                        finally {
                            final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                    constraint_col = cdolist_list_var_$65.first();
                }
                cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                constraints = cdolist_list_var_$64.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_info = cdolist_list_var.first();
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 23409L)
    public static SubLObject sbhl_arg_types_alist_satisfied_p(final SubLObject pred) {
        SubLObject failP = (SubLObject)genl_predicates.NIL;
        if (genl_predicates.NIL == failP) {
            SubLObject csome_list_var = get_sbhl_arg_type_alist();
            SubLObject arg_info = (SubLObject)genl_predicates.NIL;
            arg_info = csome_list_var.first();
            while (genl_predicates.NIL == failP && genl_predicates.NIL != csome_list_var) {
                SubLObject arg_constraint_arg;
                final SubLObject arg = arg_constraint_arg = arg_info.first();
                if (genl_predicates.NIL != sbhl_search_vars.genl_inverse_mode_p() && (arg.numE((SubLObject)genl_predicates.ONE_INTEGER) || arg.numE((SubLObject)genl_predicates.TWO_INTEGER))) {
                    arg_constraint_arg = misc_utilities.other_binary_arg(arg);
                }
                if (genl_predicates.NIL == failP) {
                    SubLObject csome_list_var_$67 = conses_high.second(arg_info);
                    SubLObject constraints = (SubLObject)genl_predicates.NIL;
                    constraints = csome_list_var_$67.first();
                    while (genl_predicates.NIL == failP && genl_predicates.NIL != csome_list_var_$67) {
                        final SubLObject constraint_pred = constraints.first();
                        final SubLObject constraint_cols = constraints.rest();
                        SubLObject constraints_$68 = (SubLObject)genl_predicates.NIL;
                        SubLObject successP = (SubLObject)genl_predicates.NIL;
                        final SubLObject pcase_var = constraint_pred;
                        if (pcase_var.eql(genl_predicates.$const109$isa)) {
                            constraints_$68 = kb_accessors.argn_isa(pred, arg_constraint_arg, (SubLObject)genl_predicates.UNPROVIDED);
                        }
                        else if (pcase_var.eql(genl_predicates.$const103$genls)) {
                            constraints_$68 = kb_accessors.argn_genl(pred, arg_constraint_arg, (SubLObject)genl_predicates.UNPROVIDED);
                        }
                        if (genl_predicates.NIL == constraints_$68) {
                            successP = (SubLObject)genl_predicates.T;
                        }
                        else if (genl_predicates.NIL == successP) {
                            SubLObject csome_list_var_$68 = constraint_cols;
                            SubLObject col = (SubLObject)genl_predicates.NIL;
                            col = csome_list_var_$68.first();
                            while (genl_predicates.NIL == successP && genl_predicates.NIL != csome_list_var_$68) {
                                final SubLObject store_key = (SubLObject)ConsesLow.list(arg, constraint_pred, col);
                                if (genl_predicates.NIL == successP) {
                                    SubLObject csome_list_var_$69 = constraints_$68;
                                    SubLObject arg_constraint = (SubLObject)genl_predicates.NIL;
                                    arg_constraint = csome_list_var_$69.first();
                                    while (genl_predicates.NIL == successP && genl_predicates.NIL != csome_list_var_$69) {
                                        if (genl_predicates.NIL != sbhl_marking_utilities.sbhl_marked_node_p(arg_constraint, get_sbhl_arg_type_store(store_key))) {
                                            successP = (SubLObject)genl_predicates.T;
                                        }
                                        csome_list_var_$69 = csome_list_var_$69.rest();
                                        arg_constraint = csome_list_var_$69.first();
                                    }
                                }
                                csome_list_var_$68 = csome_list_var_$68.rest();
                                col = csome_list_var_$68.first();
                            }
                        }
                        if (genl_predicates.NIL == successP) {
                            failP = (SubLObject)genl_predicates.T;
                        }
                        csome_list_var_$67 = csome_list_var_$67.rest();
                        constraints = csome_list_var_$67.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                arg_info = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 24619L)
    public static SubLObject leaf_predicates_wrt_arg_type(final SubLObject pred, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)genl_predicates.NIL;
        final SubLObject _prev_bind_0 = genl_predicates.$sbhl_arg_type_alist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = genl_predicates.$sbhl_arg_type_genls_stores$.currentBinding(thread);
        try {
            genl_predicates.$sbhl_arg_type_alist$.bind(alist, thread);
            genl_predicates.$sbhl_arg_type_genls_stores$.bind(dictionary.new_dictionary((SubLObject)genl_predicates.EQUAL, (SubLObject)genl_predicates.UNPROVIDED), thread);
            sbhl_initialize_arg_type_genls_stores(alist);
            result = sbhl_search_utilities.sbhl_min_backward_true_nodes_such_that(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, (SubLObject)genl_predicates.$sym119$SBHL_ARG_TYPES_ALIST_SATISFIED_P, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
        }
        finally {
            genl_predicates.$sbhl_arg_type_genls_stores$.rebind(_prev_bind_2, thread);
            genl_predicates.$sbhl_arg_type_alist$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 25087L)
    public static SubLObject sbhl_add_leaf_predicates_to_result(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (genl_predicates.NIL != sbhl_search_vars.genl_inverse_mode_p()) {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_pushnew(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), (SubLObject)genl_predicates.UNPROVIDED), thread);
        }
        else {
            sbhl_search_vars.$sbhl_result$.setDynamicValue(list_utilities.assoc_pushnew(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), node, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread), (SubLObject)genl_predicates.UNPROVIDED), thread);
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 25420L)
    public static SubLObject pred_is_typed_spec_pred_p(final SubLObject node, final SubLObject parent) {
        SubLObject doneP = (SubLObject)genl_predicates.NIL;
        if (sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED).eql(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds))) {
            final SubLObject pred_var = genl_predicates.$const120$typedGenlPreds;
            if (genl_predicates.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, (SubLObject)genl_predicates.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, (SubLObject)genl_predicates.ONE_INTEGER, pred_var);
                SubLObject done_var = doneP;
                final SubLObject token_var = (SubLObject)genl_predicates.NIL;
                while (genl_predicates.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (genl_predicates.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)genl_predicates.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)genl_predicates.$kw121$GAF, (SubLObject)genl_predicates.$kw122$TRUE, (SubLObject)genl_predicates.NIL);
                            SubLObject done_var_$71 = doneP;
                            final SubLObject token_var_$72 = (SubLObject)genl_predicates.NIL;
                            while (genl_predicates.NIL == done_var_$71) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$72);
                                final SubLObject valid_$73 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$72.eql(ass));
                                if (genl_predicates.NIL != valid_$73 && parent.eql(conses_high.third(assertions_high.gaf_formula(ass)))) {
                                    doneP = (SubLObject)genl_predicates.T;
                                }
                                done_var_$71 = (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == valid_$73 || genl_predicates.NIL != doneP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)genl_predicates.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (genl_predicates.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == valid || genl_predicates.NIL != doneP);
                }
            }
        }
        else {
            final SubLObject pred_var = genl_predicates.$const123$typedGenlInverse;
            if (genl_predicates.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, (SubLObject)genl_predicates.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, (SubLObject)genl_predicates.ONE_INTEGER, pred_var);
                SubLObject done_var = doneP;
                final SubLObject token_var = (SubLObject)genl_predicates.NIL;
                while (genl_predicates.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (genl_predicates.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)genl_predicates.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)genl_predicates.$kw121$GAF, (SubLObject)genl_predicates.$kw122$TRUE, (SubLObject)genl_predicates.NIL);
                            SubLObject done_var_$72 = doneP;
                            final SubLObject token_var_$73 = (SubLObject)genl_predicates.NIL;
                            while (genl_predicates.NIL == done_var_$72) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$73);
                                final SubLObject valid_$74 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$73.eql(ass));
                                if (genl_predicates.NIL != valid_$74 && parent.eql(conses_high.third(assertions_high.gaf_formula(ass)))) {
                                    doneP = (SubLObject)genl_predicates.T;
                                }
                                done_var_$72 = (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == valid_$74 || genl_predicates.NIL != doneP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)genl_predicates.T);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (genl_predicates.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == valid || genl_predicates.NIL != doneP);
                }
            }
        }
        return doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 25912L)
    public static SubLObject typed_spec_predicates_wrt_arg_type(final SubLObject pred, final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)genl_predicates.NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_result$.bind((SubLObject)genl_predicates.NIL, thread);
            try {
                final SubLObject _prev_bind_0_$77 = genl_predicates.$sbhl_arg_type_alist$.currentBinding(thread);
                final SubLObject _prev_bind_2 = genl_predicates.$sbhl_arg_type_genls_stores$.currentBinding(thread);
                try {
                    genl_predicates.$sbhl_arg_type_alist$.bind(alist, thread);
                    genl_predicates.$sbhl_arg_type_genls_stores$.bind(dictionary.new_dictionary((SubLObject)genl_predicates.EQUAL, (SubLObject)genl_predicates.UNPROVIDED), thread);
                    sbhl_initialize_arg_type_genls_stores(alist);
                    final SubLObject _prev_bind_0_$78 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$79 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genl_predicates.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), thread);
                        final SubLObject tv_var = (SubLObject)genl_predicates.NIL;
                        final SubLObject _prev_bind_0_$79 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$80 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((genl_predicates.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((genl_predicates.NIL != tv_var) ? genl_predicates.$sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (genl_predicates.NIL != tv_var && genl_predicates.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && genl_predicates.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)genl_predicates.$kw52$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)genl_predicates.ONE_INTEGER, (SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)genl_predicates.$kw55$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)genl_predicates.ONE_INTEGER, (SubLObject)genl_predicates.$str56$continue_anyway, (SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)genl_predicates.$kw57$WARN)) {
                                    Errors.warn((SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)genl_predicates.$str58$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)genl_predicates.$str56$continue_anyway, (SubLObject)genl_predicates.$str53$_A_is_not_a__A, tv_var, (SubLObject)genl_predicates.$sym54$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$84 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_truth$.bind(genl_predicates.$const124$True_JustificationTruth, thread);
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED)), thread);
                                final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                final SubLObject _prev_bind_0_$81 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind((source == genl_predicates.$kw125$OLD) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                    final SubLObject _prev_bind_0_$82 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_gather_space$.bind((source == genl_predicates.$kw125$OLD) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                        final SubLObject _prev_bind_0_$83 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$85 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        final SubLObject _prev_bind_3_$90 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        final SubLObject _prev_bind_4_$91 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_finishedP$.bind((SubLObject)genl_predicates.NIL, thread);
                                            sbhl_search_vars.$sbhl_stop_search_pathP$.bind((SubLObject)genl_predicates.NIL, thread);
                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind((SubLObject)genl_predicates.NIL, thread);
                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.bind((SubLObject)genl_predicates.NIL, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genl_predicates.NIL, thread);
                                            final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                            SubLObject needs_to_releaseP = (SubLObject)genl_predicates.NIL;
                                            try {
                                                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                leaf_predicates_mark_and_sweep(pred);
                                            }
                                            finally {
                                                if (genl_predicates.NIL != needs_to_releaseP) {
                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$91, thread);
                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$90, thread);
                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$85, thread);
                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$82, thread);
                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$83, thread);
                                        }
                                        if (source == genl_predicates.$kw126$RESOURCE) {
                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                        }
                                    }
                                    finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$82, thread);
                                    }
                                    if (source == genl_predicates.$kw126$RESOURCE) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                }
                                finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$81, thread);
                                }
                            }
                            finally {
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$84, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$81, thread);
                                sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$80, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$80, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$79, thread);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$79, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$78, thread);
                    }
                }
                finally {
                    genl_predicates.$sbhl_arg_type_genls_stores$.rebind(_prev_bind_2, thread);
                    genl_predicates.$sbhl_arg_type_alist$.rebind(_prev_bind_0_$77, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                }
            }
        }
        finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 26402L)
    public static SubLObject leaf_predicates_mark_and_sweep(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (genl_predicates.NIL == sbhl_marking_utilities.sbhl_marked_node_p(node, (SubLObject)genl_predicates.UNPROVIDED)) {
            sbhl_marking_utilities.sbhl_mark_node(node, (SubLObject)genl_predicates.UNPROVIDED);
            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED));
            SubLObject rest;
            SubLObject module_var;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject node_$93;
            SubLObject d_link;
            SubLObject mt_links;
            SubLObject iteration_state;
            SubLObject mt;
            SubLObject tv_links;
            SubLObject _prev_bind_0_$94;
            SubLObject iteration_state_$95;
            SubLObject tv;
            SubLObject link_nodes;
            SubLObject _prev_bind_0_$95;
            SubLObject sol;
            SubLObject set_contents_var;
            SubLObject basis_object;
            SubLObject state;
            SubLObject link_node;
            SubLObject csome_list_var;
            SubLObject link_node2;
            SubLObject new_list;
            SubLObject rest_$97;
            SubLObject generating_fn;
            SubLObject _prev_bind_0_$96;
            SubLObject sol2;
            SubLObject link_nodes2;
            SubLObject set_contents_var2;
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject link_node3;
            SubLObject csome_list_var2;
            SubLObject link_node4;
            for (rest = (SubLObject)genl_predicates.NIL, rest = accessible_modules; genl_predicates.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && genl_predicates.NIL != rest; rest = rest.rest()) {
                module_var = rest.first();
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((genl_predicates.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(genl_predicates.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                    node_$93 = function_terms.naut_to_nart(node);
                    if (genl_predicates.NIL != sbhl_link_vars.sbhl_node_object_p(node_$93)) {
                        d_link = sbhl_graphs.get_sbhl_graph_link(node_$93, sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED));
                        if (genl_predicates.NIL != d_link) {
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED));
                            if (genl_predicates.NIL != mt_links) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); genl_predicates.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && genl_predicates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (genl_predicates.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                        _prev_bind_0_$94 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                            for (iteration_state_$95 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); genl_predicates.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && genl_predicates.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$95); iteration_state_$95 = dictionary_contents.do_dictionary_contents_next(iteration_state_$95)) {
                                                thread.resetMultipleValues();
                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$95);
                                                link_nodes = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (genl_predicates.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                    _prev_bind_0_$95 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                        sol = link_nodes;
                                                        if (genl_predicates.NIL != set.set_p(sol)) {
                                                            set_contents_var = set.do_set_internal(sol);
                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)genl_predicates.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); genl_predicates.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && genl_predicates.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                if (genl_predicates.NIL != set_contents.do_set_contents_element_validP(state, link_node) && genl_predicates.NIL != sbhl_arg_types_alist_satisfied_p(link_node)) {
                                                                    if (genl_predicates.NIL != pred_is_typed_spec_pred_p(link_node, node)) {
                                                                        sbhl_add_leaf_predicates_to_result(link_node);
                                                                    }
                                                                    leaf_predicates_mark_and_sweep(link_node);
                                                                }
                                                            }
                                                        }
                                                        else if (sol.isList()) {
                                                            if (genl_predicates.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                                                csome_list_var = sol;
                                                                link_node2 = (SubLObject)genl_predicates.NIL;
                                                                link_node2 = csome_list_var.first();
                                                                while (genl_predicates.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && genl_predicates.NIL != csome_list_var) {
                                                                    if (genl_predicates.NIL != sbhl_arg_types_alist_satisfied_p(link_node2)) {
                                                                        if (genl_predicates.NIL != pred_is_typed_spec_pred_p(link_node2, node)) {
                                                                            sbhl_add_leaf_predicates_to_result(link_node2);
                                                                        }
                                                                        leaf_predicates_mark_and_sweep(link_node2);
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    link_node2 = csome_list_var.first();
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)genl_predicates.$str59$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$95, thread);
                                                    }
                                                }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$95);
                                        }
                                        finally {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$94, thread);
                                        }
                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_error((SubLObject)genl_predicates.FIVE_INTEGER, (SubLObject)genl_predicates.$str60$attempting_to_bind_direction_link, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                        }
                    }
                    else if (genl_predicates.NIL != obsolete.cnat_p(node_$93, (SubLObject)genl_predicates.UNPROVIDED)) {
                        new_list = ((genl_predicates.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)genl_predicates.UNPROVIDED)));
                        for (rest_$97 = (SubLObject)genl_predicates.NIL, rest_$97 = new_list; genl_predicates.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && genl_predicates.NIL != rest_$97; rest_$97 = rest_$97.rest()) {
                            generating_fn = rest_$97.first();
                            _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node_$93));
                                if (genl_predicates.NIL != set.set_p(sol2)) {
                                    set_contents_var2 = set.do_set_internal(sol2);
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)genl_predicates.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); genl_predicates.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && genl_predicates.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if (genl_predicates.NIL != set_contents.do_set_contents_element_validP(state2, link_node3) && genl_predicates.NIL != sbhl_arg_types_alist_satisfied_p(link_node3)) {
                                            if (genl_predicates.NIL != pred_is_typed_spec_pred_p(link_node3, node)) {
                                                sbhl_add_leaf_predicates_to_result(link_node3);
                                            }
                                            leaf_predicates_mark_and_sweep(link_node3);
                                        }
                                    }
                                }
                                else if (sol2.isList()) {
                                    if (genl_predicates.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread)) {
                                        csome_list_var2 = sol2;
                                        link_node4 = (SubLObject)genl_predicates.NIL;
                                        link_node4 = csome_list_var2.first();
                                        while (genl_predicates.NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread) && genl_predicates.NIL != csome_list_var2) {
                                            if (genl_predicates.NIL != sbhl_arg_types_alist_satisfied_p(link_node4)) {
                                                if (genl_predicates.NIL != pred_is_typed_spec_pred_p(link_node4, node)) {
                                                    sbhl_add_leaf_predicates_to_result(link_node4);
                                                }
                                                leaf_predicates_mark_and_sweep(link_node4);
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            link_node4 = csome_list_var2.first();
                                        }
                                    }
                                }
                                else {
                                    Errors.error((SubLObject)genl_predicates.$str59$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                }
                            }
                            finally {
                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$96, thread);
                            }
                        }
                    }
                }
                finally {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 26864L)
    public static SubLObject min_predicates(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(preds, genl_predicates.$sym70$LISTP);
        return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), preds, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 27129L)
    public static SubLObject max_predicates(final SubLObject preds, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(preds, genl_predicates.$sym70$LISTP);
        return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), preds, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 27371L)
    public static SubLObject min_ceiling_predicates(final SubLObject preds, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == genl_predicates.UNPROVIDED) {
            candidates = (SubLObject)genl_predicates.NIL;
        }
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(preds, genl_predicates.$sym70$LISTP);
        return sbhl_search_methods.sbhl_min_ceilings(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), preds, candidates, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 27694L)
    public static SubLObject max_floor_predicates(final SubLObject preds, SubLObject candidates, SubLObject mt, SubLObject tv) {
        if (candidates == genl_predicates.UNPROVIDED) {
            candidates = (SubLObject)genl_predicates.NIL;
        }
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(preds, genl_predicates.$sym70$LISTP);
        if (genl_predicates.NIL != list_utilities.doubletonP(preds)) {
            SubLObject pred1 = (SubLObject)genl_predicates.NIL;
            SubLObject pred2 = (SubLObject)genl_predicates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(preds, preds, (SubLObject)genl_predicates.$list134);
            pred1 = preds.first();
            SubLObject current = preds.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, preds, (SubLObject)genl_predicates.$list134);
            pred2 = current.first();
            current = current.rest();
            if (genl_predicates.NIL == current) {
                if (pred1.eql(pred2)) {
                    return (SubLObject)ConsesLow.list(pred1);
                }
                final SubLObject pred1_specsP = some_spec_predicate_or_inverse_somewhereP(pred1);
                final SubLObject pred2_specsP = some_spec_predicate_or_inverse_somewhereP(pred2);
                if (genl_predicates.NIL == pred1_specsP && genl_predicates.NIL == pred2_specsP) {
                    return (SubLObject)genl_predicates.NIL;
                }
                if (genl_predicates.NIL == pred1_specsP) {
                    if (genl_predicates.NIL != genl_predicateP(pred1, pred2, mt, tv)) {
                        return (SubLObject)ConsesLow.list(pred1);
                    }
                    return (SubLObject)genl_predicates.NIL;
                }
                else if (genl_predicates.NIL == pred2_specsP) {
                    if (genl_predicates.NIL != genl_predicateP(pred2, pred1, mt, tv)) {
                        return (SubLObject)ConsesLow.list(pred2);
                    }
                    return (SubLObject)genl_predicates.NIL;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(preds, (SubLObject)genl_predicates.$list134);
            }
        }
        return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), preds, candidates, mt, tv, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 28631L)
    public static SubLObject some_spec_predicate_or_inverse_somewhereP(final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL != somewhere_cache.some_pred_assertion_somewhereP(genl_predicates.$const1$genlPreds, pred, (SubLObject)genl_predicates.TWO_INTEGER, (SubLObject)genl_predicates.UNPROVIDED) || genl_predicates.NIL != somewhere_cache.some_pred_assertion_somewhereP(genl_predicates.$const9$genlInverse, pred, (SubLObject)genl_predicates.TWO_INTEGER, (SubLObject)genl_predicates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 29068L)
    public static SubLObject genl_predicateP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(genl, genl_predicates.$sym0$FORT_P);
        if (!spec.eql(genl) && genl_predicates.NIL == some_spec_predicate_or_inverse_somewhereP(genl)) {
            return (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 29700L)
    public static SubLObject genl_predicate_in_any_mtP(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)genl_predicates.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genl_predicates.$sym142$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(genl_predicates.$const143$EverythingPSC, thread);
            result = genl_predicateP(spec, genl, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 29939L)
    public static SubLObject genl_predP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return genl_predicateP(spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 30043L)
    public static SubLObject spec_predP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return genl_predicateP(spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 30147L)
    public static SubLObject proper_genl_predP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == kb_utilities.kbeq(spec, genl) && genl_predicates.NIL != genl_predicateP(spec, genl, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 30289L)
    public static SubLObject proper_spec_predP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == kb_utilities.kbeq(spec, genl) && genl_predicates.NIL != genl_predicateP(spec, genl, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 30432L)
    public static SubLObject spec_predicateP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(genl, genl_predicates.$sym0$FORT_P);
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        return genl_predicateP(spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 30698L)
    public static SubLObject genl_inverseP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(genl, genl_predicates.$sym0$FORT_P);
        if (!spec.eql(genl) && genl_predicates.NIL == some_spec_predicate_or_inverse_somewhereP(genl)) {
            return (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 31163L)
    public static SubLObject spec_inverseP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(genl, genl_predicates.$sym0$FORT_P);
        return genl_inverseP(spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 31426L)
    public static SubLObject genl_predicate_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), genl, spec, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 31761L)
    public static SubLObject genl_inverse_ofP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_methods.sbhl_inverse_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), genl, spec, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 32050L)
    public static SubLObject any_genl_predicateP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(v_genls, genl_predicates.$sym70$LISTP);
        return (SubLObject)((genl_predicates.NIL == v_genls) ? genl_predicates.NIL : ((genl_predicates.NIL != list_utilities.singletonP(v_genls)) ? genl_predicateP(spec, v_genls.first(), mt, tv) : sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), spec, v_genls, mt, tv)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 32619L)
    public static SubLObject any_genl_predP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return any_genl_predicateP(spec, v_genls, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 32733L)
    public static SubLObject any_genl_predicate_in_any_mtP(final SubLObject spec, final SubLObject v_genls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)genl_predicates.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)genl_predicates.$sym142$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(genl_predicates.$const143$EverythingPSC, thread);
            result = any_genl_predicateP(spec, v_genls, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 32982L)
    public static SubLObject any_genl_inverseP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return (SubLObject)((genl_predicates.NIL == v_genls) ? genl_predicates.NIL : ((genl_predicates.NIL != list_utilities.singletonP(v_genls)) ? genl_inverseP(spec, v_genls.first(), mt, tv) : sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), spec, v_genls, mt, tv)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 33363L)
    public static SubLObject not_genl_predicateP(final SubLObject spec, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(not_genl, genl_predicates.$sym0$FORT_P);
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), spec, not_genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 33766L)
    public static SubLObject not_genl_predP(final SubLObject spec, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return not_genl_predicateP(spec, not_genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 33878L)
    public static SubLObject not_spec_predicateP(final SubLObject genl, final SubLObject spec, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return not_genl_predicateP(spec, genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 33987L)
    public static SubLObject argue_not_genl_predicateP(final SubLObject pred, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, not_genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 34330L)
    public static SubLObject not_genl_inverseP(final SubLObject spec, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(not_genl, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), spec, not_genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 34670L)
    public static SubLObject not_spec_inverseP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return not_genl_inverseP(spec, genl, mt, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 34769L)
    public static SubLObject argue_not_genl_inverseP(final SubLObject pred, final SubLObject not_genl, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_implied_relations.sbhl_argumentation_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, not_genl, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 35108L)
    public static SubLObject any_not_genl_predicateP(final SubLObject pred, final SubLObject not_genls, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        enforceType(not_genls, genl_predicates.$sym70$LISTP);
        return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_with_any_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, not_genls, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 35529L)
    public static SubLObject random_genl_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_genl_predicates(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 35785L)
    public static SubLObject random_spec_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_spec_predicates(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 36005L)
    public static SubLObject random_proper_genl_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_genl_predicates(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 36239L)
    public static SubLObject random_proper_spec_predicate_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_spec_predicates(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 36473L)
    public static SubLObject random_genl_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_genl_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 36689L)
    public static SubLObject random_spec_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_spec_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 36905L)
    public static SubLObject random_proper_genl_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_genl_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 37135L)
    public static SubLObject random_proper_spec_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_spec_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 37365L)
    public static SubLObject random_genl_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_genl_predicates_and_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 37609L)
    public static SubLObject random_spec_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_spec_predicates_and_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 37853L)
    public static SubLObject random_proper_genl_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_genl_predicates_and_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 38111L)
    public static SubLObject random_proper_spec_predicate_or_inverse_of(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        assert genl_predicates.NIL != forts.fort_p(pred) : pred;
        if (genl_predicates.NIL != mt && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == hlmt.hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (genl_predicates.NIL != tv && !genl_predicates.assertionsDisabledInClass && genl_predicates.NIL == enumeration_types.tv_p(tv)) {
            throw new AssertionError(tv);
        }
        return list_utilities.random_element(all_proper_spec_predicates_and_inverses(pred, mt, tv));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 38369L)
    public static SubLObject any_spec_predP(final SubLObject pred, final SubLObject spec_preds, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return (SubLObject)((genl_predicates.NIL == spec_preds) ? genl_predicates.NIL : ((genl_predicates.NIL != list_utilities.singletonP(spec_preds)) ? genl_predicateP(spec_preds.first(), pred, mt, tv) : sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), spec_preds, pred, mt, tv)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 38791L)
    public static SubLObject any_spec_inverseP(final SubLObject pred, final SubLObject spec_inverses, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return (SubLObject)((genl_predicates.NIL == spec_inverses) ? genl_predicates.NIL : ((genl_predicates.NIL != list_utilities.singletonP(spec_inverses)) ? genl_inverseP(spec_inverses.first(), pred, mt, tv) : sbhl_search_methods.sbhl_any_with_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), spec_inverses, pred, mt, tv)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 39191L)
    public static SubLObject some_genl_pred_or_inverseP(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return some_genl_pred_or_inverseP_int(pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 39454L)
    public static SubLObject some_genl_pred_or_inverseP_int(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL != sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED) || genl_predicates.NIL != sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 39791L)
    public static SubLObject some_spec_pred_or_inverseP(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return some_spec_pred_or_inverseP_int(pred, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 40063L)
    public static SubLObject some_spec_pred_or_inverseP_int(final SubLObject pred, SubLObject mt, SubLObject tv) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL != sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED) || genl_predicates.NIL != sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt, tv, (SubLObject)genl_predicates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 40413L)
    public static SubLObject intersecting_predicatesP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred1, genl_predicates.$sym0$FORT_P);
        enforceType(pred2, genl_predicates.$sym0$FORT_P);
        return predicates_intersectP(pred1, pred2, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 40745L)
    public static SubLObject predicates_intersectP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (genl_predicates.NIL != fort_types_interface.predicateP(pred1) && genl_predicates.NIL != fort_types_interface.predicateP(pred2)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL != genl_predicateP(pred1, pred2, mt, (SubLObject)genl_predicates.UNPROVIDED) || genl_predicates.NIL != genl_predicateP(pred2, pred1, mt, (SubLObject)genl_predicates.UNPROVIDED) || genl_predicates.NIL != negation_predicate.not_negation_predicateP(pred1, pred2, mt, (SubLObject)genl_predicates.UNPROVIDED));
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 41082L)
    public static SubLObject preds_intersectP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return predicates_intersectP(pred1, pred2, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 41195L)
    public static SubLObject why_genl_predicateP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        if (behavior == genl_predicates.UNPROVIDED) {
            behavior = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(genl, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), spec, genl, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 41550L)
    public static SubLObject why_not_genl_predicateP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        if (behavior == genl_predicates.UNPROVIDED) {
            behavior = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(genl, genl_predicates.$sym0$FORT_P);
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), spec, genl, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 41868L)
    public static SubLObject why_genl_inverseP(final SubLObject pred, final SubLObject genl_inverse, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        if (behavior == genl_predicates.UNPROVIDED) {
            behavior = (SubLObject)genl_predicates.NIL;
        }
        enforceType(pred, genl_predicates.$sym0$FORT_P);
        enforceType(genl_inverse, genl_predicates.$sym0$FORT_P);
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, genl_inverse, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 42196L)
    public static SubLObject why_spec_inverseP(final SubLObject pred, final SubLObject spec_inverse, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        if (behavior == genl_predicates.UNPROVIDED) {
            behavior = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), spec_inverse, pred, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 42427L)
    public static SubLObject why_not_genl_inverseP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        if (behavior == genl_predicates.UNPROVIDED) {
            behavior = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(genl, genl_predicates.$sym0$FORT_P);
        return sbhl_search_implied_relations.why_sbhl_implied_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const180$genlMt), spec, genl, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 42741L)
    public static SubLObject why_some_genl_predicate_amongP(final SubLObject spec, final SubLObject v_genls, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        if (behavior == genl_predicates.UNPROVIDED) {
            behavior = (SubLObject)genl_predicates.$kw183$ASSERTION;
        }
        return sbhl_search_methods.why_some_sbhl_predicate_relation_among_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), spec, v_genls, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 43017L)
    public static SubLObject why_some_genl_inverse_amongP(final SubLObject spec, final SubLObject genl_invs, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        if (behavior == genl_predicates.UNPROVIDED) {
            behavior = (SubLObject)genl_predicates.$kw183$ASSERTION;
        }
        return sbhl_search_methods.why_some_sbhl_predicate_relation_among_p(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), spec, genl_invs, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 43299L)
    public static SubLObject max_floor_mts_of_genl_predicate_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(genl, genl_predicates.$sym0$FORT_P);
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), spec, genl, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 43848L)
    public static SubLObject max_floor_mts_of_genl_pred_paths(final SubLObject spec, final SubLObject genl) {
        return max_floor_mts_of_genl_predicate_paths(spec, genl, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 43974L)
    public static SubLObject min_mts_of_genl_predicate_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), spec, genl, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 44231L)
    public static SubLObject min_mts_of_genl_pred_paths(final SubLObject spec, final SubLObject genl, SubLObject tv) {
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return min_mts_of_genl_predicate_paths(spec, genl, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 44362L)
    public static SubLObject max_floor_mts_of_not_genl_predicate_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), not_genl, spec, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 44710L)
    public static SubLObject min_mts_of_not_genl_predicate_paths(final SubLObject spec, final SubLObject not_genl, SubLObject tv) {
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), not_genl, spec, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 45048L)
    public static SubLObject max_floor_mts_of_genl_inverse_paths(final SubLObject spec, final SubLObject genl_inverse, SubLObject tv) {
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        enforceType(spec, genl_predicates.$sym0$FORT_P);
        enforceType(genl_inverse, genl_predicates.$sym0$FORT_P);
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), spec, genl_inverse, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 45406L)
    public static SubLObject min_mts_of_genl_inverse_paths(final SubLObject spec, final SubLObject genl_inverse, SubLObject tv) {
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), spec, genl_inverse, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 45690L)
    public static SubLObject max_floor_mts_of_not_genl_inverse_paths(final SubLObject spec, final SubLObject not_genl_inverse, SubLObject tv) {
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), not_genl_inverse, spec, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 46045L)
    public static SubLObject min_mts_of_not_genl_inverse_paths(final SubLObject spec, final SubLObject not_genl_inverse, SubLObject tv) {
        if (tv == genl_predicates.UNPROVIDED) {
            tv = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_inverse_paths(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), not_genl_inverse, spec, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 46390L)
    public static SubLObject min_candidate_genl_preds(final SubLObject pred, SubLObject omit, SubLObject mt) {
        if (omit == genl_predicates.UNPROVIDED) {
            omit = (SubLObject)genl_predicates.NIL;
        }
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return min_preds_wrt_arg_types(min_predicates(conses_high.set_difference(Sequences.remove(pred, candidate_genl_preds(pred, mt), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED), omit, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED), mt, (SubLObject)genl_predicates.UNPROVIDED), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 46908L)
    public static SubLObject cached_min_candidate_genl_preds(final SubLObject pred, SubLObject omit) {
        if (omit == genl_predicates.UNPROVIDED) {
            omit = (SubLObject)genl_predicates.NIL;
        }
        return min_preds_wrt_arg_types(min_predicates(conses_high.set_difference(Sequences.remove(pred, cached_candidate_genl_preds(pred), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED), omit, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED), (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47186L)
    public static SubLObject cached_min_candidate_genl_preds_in_mt(final SubLObject pred, final SubLObject mt, SubLObject omit) {
        if (omit == genl_predicates.UNPROVIDED) {
            omit = (SubLObject)genl_predicates.NIL;
        }
        return min_preds_wrt_arg_types(min_predicates(conses_high.set_difference(Sequences.remove(pred, cached_candidate_genl_preds_in_mt(pred, mt), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED), omit, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED), mt, (SubLObject)genl_predicates.UNPROVIDED), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47494L)
    public static SubLObject clear_cached_candidate_genl_preds() {
        final SubLObject cs = genl_predicates.$cached_candidate_genl_preds_caching_state$.getGlobalValue();
        if (genl_predicates.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47494L)
    public static SubLObject remove_cached_candidate_genl_preds(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(genl_predicates.$cached_candidate_genl_preds_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47494L)
    public static SubLObject cached_candidate_genl_preds_internal(final SubLObject pred) {
        return candidate_genl_preds(pred, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47494L)
    public static SubLObject cached_candidate_genl_preds(final SubLObject pred) {
        SubLObject caching_state = genl_predicates.$cached_candidate_genl_preds_caching_state$.getGlobalValue();
        if (genl_predicates.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)genl_predicates.$sym191$CACHED_CANDIDATE_GENL_PREDS, (SubLObject)genl_predicates.$sym192$_CACHED_CANDIDATE_GENL_PREDS_CACHING_STATE_, (SubLObject)genl_predicates.$int193$512, (SubLObject)genl_predicates.EQL, (SubLObject)genl_predicates.ONE_INTEGER, (SubLObject)genl_predicates.$int194$64);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_candidate_genl_preds_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)genl_predicates.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47611L)
    public static SubLObject clear_cached_candidate_genl_preds_in_mt() {
        final SubLObject cs = genl_predicates.$cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue();
        if (genl_predicates.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47611L)
    public static SubLObject remove_cached_candidate_genl_preds_in_mt(final SubLObject pred, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(genl_predicates.$cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred, mt), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47611L)
    public static SubLObject cached_candidate_genl_preds_in_mt_internal(final SubLObject pred, final SubLObject mt) {
        return candidate_genl_preds(pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47611L)
    public static SubLObject cached_candidate_genl_preds_in_mt(final SubLObject pred, final SubLObject mt) {
        SubLObject caching_state = genl_predicates.$cached_candidate_genl_preds_in_mt_caching_state$.getGlobalValue();
        if (genl_predicates.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)genl_predicates.$sym195$CACHED_CANDIDATE_GENL_PREDS_IN_MT, (SubLObject)genl_predicates.$sym196$_CACHED_CANDIDATE_GENL_PREDS_IN_MT_CACHING_STATE_, (SubLObject)genl_predicates.$int193$512, (SubLObject)genl_predicates.EQL, (SubLObject)genl_predicates.TWO_INTEGER, (SubLObject)genl_predicates.$int194$64);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)genl_predicates.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)genl_predicates.NIL;
            collision = cdolist_list_var.first();
            while (genl_predicates.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl_predicates.NIL != cached_args && genl_predicates.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_candidate_genl_preds_in_mt_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 47740L)
    public static SubLObject candidate_genl_preds(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (genl_predicates.NIL != fort_types_interface.predicateP(pred)) {
            final SubLObject v_arity = arity.arity(pred);
            final SubLObject pos_arityP = (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL != v_arity && v_arity.numG((SubLObject)genl_predicates.ZERO_INTEGER));
            SubLObject result = (SubLObject)genl_predicates.NIL;
            if (genl_predicates.NIL == v_arity || genl_predicates.NIL != el_utilities.valid_arity_p(v_arity)) {}
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_referent$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_referent$.bind(v_arity, thread);
                if (genl_predicates.NIL != pos_arityP) {
                    final SubLObject arg_isas = kb_accessors.argn_isa(pred, (SubLObject)genl_predicates.ONE_INTEGER, (SubLObject)genl_predicates.UNPROVIDED);
                    final SubLObject _prev_bind_0_$99 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$100 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                SubLObject cdolist_list_var = arg_isas;
                                SubLObject arg_isa = (SubLObject)genl_predicates.NIL;
                                arg_isa = cdolist_list_var.first();
                                while (genl_predicates.NIL != cdolist_list_var) {
                                    sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const103$genls), arg_isa, mt, (SubLObject)genl_predicates.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg_isa = cdolist_list_var.first();
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$100, thread);
                            }
                            SubLObject cdolist_list_var2 = arg_isas;
                            SubLObject arg_isa2 = (SubLObject)genl_predicates.NIL;
                            arg_isa2 = cdolist_list_var2.first();
                            while (genl_predicates.NIL != cdolist_list_var2) {
                                result = ConsesLow.nconc(result, candidate_preds_for_arg_type(arg_isa2, (SubLObject)genl_predicates.ONE_INTEGER, (SubLObject)genl_predicates.$kw197$ISA, mt));
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                arg_isa2 = cdolist_list_var2.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$101 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$99, thread);
                    }
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    SubLObject arg;
                    SubLObject arg_isas2;
                    SubLObject _prev_bind_0_$102;
                    SubLObject _prev_bind_0_$103;
                    SubLObject cdolist_list_var3;
                    SubLObject arg_isa3;
                    SubLObject cdolist_list_var4;
                    SubLObject arg_isa4;
                    SubLObject _prev_bind_0_$104;
                    SubLObject _values2;
                    for (cdotimes_end_var = Numbers.subtract(v_arity, (SubLObject)genl_predicates.ONE_INTEGER), n = (SubLObject)genl_predicates.NIL, n = (SubLObject)genl_predicates.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)genl_predicates.ONE_INTEGER)) {
                        if (genl_predicates.NIL != result) {
                            arg = Numbers.add((SubLObject)genl_predicates.TWO_INTEGER, n);
                            arg_isas2 = kb_accessors.argn_isa(pred, arg, (SubLObject)genl_predicates.UNPROVIDED);
                            _prev_bind_0_$102 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    _prev_bind_0_$103 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                        cdolist_list_var3 = arg_isas2;
                                        arg_isa3 = (SubLObject)genl_predicates.NIL;
                                        arg_isa3 = cdolist_list_var3.first();
                                        while (genl_predicates.NIL != cdolist_list_var3) {
                                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const103$genls), arg_isa3, mt, (SubLObject)genl_predicates.UNPROVIDED);
                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                            arg_isa3 = cdolist_list_var3.first();
                                        }
                                    }
                                    finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$103, thread);
                                    }
                                    cdolist_list_var4 = arg_isas2;
                                    arg_isa4 = (SubLObject)genl_predicates.NIL;
                                    arg_isa4 = cdolist_list_var4.first();
                                    while (genl_predicates.NIL != cdolist_list_var4) {
                                        result = keyhash_utilities.intersect_forts(result, candidate_preds_for_arg_type(arg_isa4, arg, (SubLObject)genl_predicates.$kw197$ISA, mt));
                                        cdolist_list_var4 = cdolist_list_var4.rest();
                                        arg_isa4 = cdolist_list_var4.first();
                                    }
                                }
                                finally {
                                    _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                        _values2 = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$104, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$102, thread);
                            }
                        }
                    }
                }
                final SubLObject args_isas = kb_accessors.args_isa(pred, (SubLObject)genl_predicates.UNPROVIDED);
                if (genl_predicates.NIL != args_isas) {
                    final SubLObject _prev_bind_0_$105 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$106 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                SubLObject cdolist_list_var = args_isas;
                                SubLObject arg_isa = (SubLObject)genl_predicates.NIL;
                                arg_isa = cdolist_list_var.first();
                                while (genl_predicates.NIL != cdolist_list_var) {
                                    sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const103$genls), arg_isa, mt, (SubLObject)genl_predicates.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg_isa = cdolist_list_var.first();
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$106, thread);
                            }
                            SubLObject cdolist_list_var2 = args_isas;
                            SubLObject arg_isa2 = (SubLObject)genl_predicates.NIL;
                            arg_isa2 = cdolist_list_var2.first();
                            while (genl_predicates.NIL != cdolist_list_var2) {
                                if (genl_predicates.NIL != pos_arityP) {
                                    result = keyhash_utilities.intersect_forts(result, candidate_preds_for_arg_type(arg_isa2, (SubLObject)genl_predicates.ZERO_INTEGER, (SubLObject)genl_predicates.$kw197$ISA, (SubLObject)genl_predicates.UNPROVIDED));
                                }
                                else {
                                    result = ConsesLow.nconc(result, candidate_preds_for_arg_type(arg_isa2, (SubLObject)genl_predicates.ZERO_INTEGER, (SubLObject)genl_predicates.$kw197$ISA, mt));
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                arg_isa2 = cdolist_list_var2.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$105, thread);
                    }
                }
                SubLObject cdotimes_end_var;
                SubLObject cdolist_list_var4;
                SubLObject arg2;
                SubLObject arg_genls;
                SubLObject _prev_bind_0_$108;
                SubLObject _prev_bind_0_$109;
                SubLObject arg_genl;
                SubLObject cdolist_list_var5;
                SubLObject arg_genl2;
                SubLObject _prev_bind_0_$110;
                SubLObject _values4;
                for (cdotimes_end_var = Numbers.add((SubLObject)genl_predicates.ONE_INTEGER, (SubLObject)((genl_predicates.NIL != pos_arityP) ? v_arity : genl_predicates.ZERO_INTEGER)), arg2 = (SubLObject)genl_predicates.NIL, arg2 = (SubLObject)genl_predicates.ZERO_INTEGER; arg2.numL(cdotimes_end_var); arg2 = Numbers.add(arg2, (SubLObject)genl_predicates.ONE_INTEGER)) {
                    if (genl_predicates.NIL != result) {
                        arg_genls = kb_accessors.argn_genl(pred, arg2, (SubLObject)genl_predicates.UNPROVIDED);
                        if (genl_predicates.NIL != arg_genls) {
                            _prev_bind_0_$108 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    _prev_bind_0_$109 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                        cdolist_list_var4 = arg_genls;
                                        arg_genl = (SubLObject)genl_predicates.NIL;
                                        arg_genl = cdolist_list_var4.first();
                                        while (genl_predicates.NIL != cdolist_list_var4) {
                                            sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(genl_predicates.$const103$genls), arg_genl, mt, (SubLObject)genl_predicates.UNPROVIDED);
                                            cdolist_list_var4 = cdolist_list_var4.rest();
                                            arg_genl = cdolist_list_var4.first();
                                        }
                                    }
                                    finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$109, thread);
                                    }
                                    cdolist_list_var5 = arg_genls;
                                    arg_genl2 = (SubLObject)genl_predicates.NIL;
                                    arg_genl2 = cdolist_list_var5.first();
                                    while (genl_predicates.NIL != cdolist_list_var5) {
                                        result = keyhash_utilities.intersect_forts(result, candidate_preds_for_arg_type(arg_genl2, arg2, (SubLObject)genl_predicates.$kw198$GENL, mt));
                                        cdolist_list_var5 = cdolist_list_var5.rest();
                                        arg_genl2 = cdolist_list_var5.first();
                                    }
                                }
                                finally {
                                    _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                                        _values4 = Values.getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$108, thread);
                            }
                        }
                    }
                }
            }
            finally {
                sbhl_search_vars.$sbhl_referent$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 49967L)
    public static SubLObject candidate_preds_for_arg_type(final SubLObject col, final SubLObject arg, SubLObject type, SubLObject mt) {
        if (type == genl_predicates.UNPROVIDED) {
            type = (SubLObject)genl_predicates.$kw197$ISA;
        }
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)genl_predicates.NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_access_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_access_arg$.bind(arg, thread);
            sbhl_search_vars.$sbhl_result$.bind((SubLObject)genl_predicates.NIL, thread);
            try {
                final SubLObject pcase_var = type;
                if (pcase_var.eql((SubLObject)genl_predicates.$kw197$ISA)) {
                    genls.map_all_genls((SubLObject)genl_predicates.$sym199$CANDIDATE_PREDS_FOR_ARG_ISA, col, mt, (SubLObject)genl_predicates.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)genl_predicates.$kw198$GENL)) {
                    genls.map_all_genls((SubLObject)genl_predicates.$sym200$CANDIDATE_PREDS_FOR_ARG_GENL, col, mt, (SubLObject)genl_predicates.UNPROVIDED);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)genl_predicates.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                }
            }
        }
        finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_access_arg$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 50288L)
    public static SubLObject candidate_preds_for_arg_isa(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = kb_accessors.argn_isa_of(col, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), (SubLObject)genl_predicates.UNPROVIDED);
        SubLObject pred = (SubLObject)genl_predicates.NIL;
        pred = cdolist_list_var.first();
        while (genl_predicates.NIL != cdolist_list_var) {
            if (genl_predicates.NIL != fort_types_interface.predicateP(pred)) {
                SubLObject not_okP = (SubLObject)SubLObjectFactory.makeBoolean(!sbhl_search_vars.$sbhl_referent$.getDynamicValue(thread).eql(arity.arity(pred)));
                if (genl_predicates.NIL == not_okP) {
                    SubLObject csome_list_var;
                    SubLObject arg_isa;
                    for (csome_list_var = kb_accessors.argn_isa(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), mt_relevance_macros.$mt$.getDynamicValue(thread)), arg_isa = (SubLObject)genl_predicates.NIL, arg_isa = csome_list_var.first(); genl_predicates.NIL == not_okP && genl_predicates.NIL != csome_list_var; not_okP = (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == sbhl_marking_utilities.sbhl_marked_in_target_space_p(arg_isa)), csome_list_var = csome_list_var.rest(), arg_isa = csome_list_var.first()) {}
                }
                if (genl_predicates.NIL == not_okP) {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue((SubLObject)ConsesLow.cons(pred, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 50767L)
    public static SubLObject candidate_preds_for_arg_genl(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = kb_accessors.argn_genl_of(col, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), (SubLObject)genl_predicates.UNPROVIDED);
        SubLObject pred = (SubLObject)genl_predicates.NIL;
        pred = cdolist_list_var.first();
        while (genl_predicates.NIL != cdolist_list_var) {
            if (genl_predicates.NIL != fort_types_interface.predicateP(pred)) {
                SubLObject not_okP = (SubLObject)genl_predicates.NIL;
                if (genl_predicates.NIL == not_okP) {
                    SubLObject csome_list_var;
                    SubLObject arg_genl;
                    for (csome_list_var = kb_accessors.argn_genl(pred, sbhl_search_vars.$sbhl_access_arg$.getDynamicValue(thread), (SubLObject)genl_predicates.UNPROVIDED), arg_genl = (SubLObject)genl_predicates.NIL, arg_genl = csome_list_var.first(); genl_predicates.NIL == not_okP && genl_predicates.NIL != csome_list_var; not_okP = (SubLObject)SubLObjectFactory.makeBoolean(genl_predicates.NIL == sbhl_marking_utilities.sbhl_marked_in_target_space_p(arg_genl)), csome_list_var = csome_list_var.rest(), arg_genl = csome_list_var.first()) {}
                }
                if (genl_predicates.NIL == not_okP) {
                    sbhl_search_vars.$sbhl_result$.setDynamicValue((SubLObject)ConsesLow.cons(pred, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 51127L)
    public static SubLObject min_preds_wrt_arg_types(final SubLObject preds, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return min_preds_wrt_arg_genl(min_preds_wrt_arg_isa(preds, mt), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 51336L)
    public static SubLObject min_preds_wrt_arg_isa(final SubLObject preds, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (genl_predicates.NIL != preds) {
            SubLObject result = (SubLObject)genl_predicates.NIL;
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject table = Hashtables.make_hash_table(Sequences.length(preds), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                SubLObject v_arity;
                SubLObject n;
                SubLObject arg_isas;
                SubLObject cdolist_list_var;
                SubLObject pred;
                SubLObject cdolist_list_var_$112;
                SubLObject col;
                SubLObject item_var;
                SubLObject cdolist_list_var_$113;
                SubLObject min_col;
                for (v_arity = Sequences.creduce((SubLObject)genl_predicates.$sym201$MAX, Mapping.mapcar((SubLObject)genl_predicates.$sym202$ARITY, preds), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED), n = (SubLObject)genl_predicates.NIL, n = (SubLObject)genl_predicates.ZERO_INTEGER; n.numL(v_arity); n = Numbers.add(n, (SubLObject)genl_predicates.ONE_INTEGER)) {
                    arg_isas = (SubLObject)genl_predicates.NIL;
                    cdolist_list_var = preds;
                    pred = (SubLObject)genl_predicates.NIL;
                    pred = cdolist_list_var.first();
                    while (genl_predicates.NIL != cdolist_list_var) {
                        cdolist_list_var_$112 = kb_accessors.argn_isa(pred, n, mt);
                        col = (SubLObject)genl_predicates.NIL;
                        col = cdolist_list_var_$112.first();
                        while (genl_predicates.NIL != cdolist_list_var_$112) {
                            hash_table_utilities.push_hash(col, pred, table);
                            item_var = col;
                            if (genl_predicates.NIL == conses_high.member(item_var, arg_isas, Symbols.symbol_function((SubLObject)genl_predicates.EQL), Symbols.symbol_function((SubLObject)genl_predicates.IDENTITY))) {
                                arg_isas = (SubLObject)ConsesLow.cons(item_var, arg_isas);
                            }
                            cdolist_list_var_$112 = cdolist_list_var_$112.rest();
                            col = cdolist_list_var_$112.first();
                        }
                        cdolist_list_var_$113 = kb_accessors.args_isa(pred, mt);
                        col = (SubLObject)genl_predicates.NIL;
                        col = cdolist_list_var_$113.first();
                        while (genl_predicates.NIL != cdolist_list_var_$113) {
                            hash_table_utilities.push_hash(col, pred, table);
                            item_var = col;
                            if (genl_predicates.NIL == conses_high.member(item_var, arg_isas, Symbols.symbol_function((SubLObject)genl_predicates.EQL), Symbols.symbol_function((SubLObject)genl_predicates.IDENTITY))) {
                                arg_isas = (SubLObject)ConsesLow.cons(item_var, arg_isas);
                            }
                            cdolist_list_var_$113 = cdolist_list_var_$113.rest();
                            col = cdolist_list_var_$113.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    }
                    cdolist_list_var = genls.min_cols(arg_isas, mt, (SubLObject)genl_predicates.UNPROVIDED);
                    min_col = (SubLObject)genl_predicates.NIL;
                    min_col = cdolist_list_var.first();
                    while (genl_predicates.NIL != cdolist_list_var) {
                        result = ConsesLow.nconc(result, Hashtables.gethash(min_col, table, (SubLObject)genl_predicates.UNPROVIDED));
                        cdolist_list_var = cdolist_list_var.rest();
                        min_col = cdolist_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return list_utilities.remove_duplicate_forts(result);
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 52054L)
    public static SubLObject min_preds_wrt_arg_genl(final SubLObject preds, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (genl_predicates.NIL != preds) {
            SubLObject result = (SubLObject)genl_predicates.NIL;
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject table = Hashtables.make_hash_table(Sequences.length(preds), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED);
                SubLObject v_arity;
                SubLObject n;
                SubLObject arg_genls;
                SubLObject cdolist_list_var;
                SubLObject pred;
                SubLObject pred_argn_genls;
                SubLObject cdolist_list_var_$114;
                SubLObject col;
                SubLObject item_var;
                SubLObject pred_args_genls;
                SubLObject cdolist_list_var_$115;
                SubLObject min_col;
                for (v_arity = Sequences.creduce((SubLObject)genl_predicates.$sym201$MAX, Mapping.mapcar((SubLObject)genl_predicates.$sym202$ARITY, preds), (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED, (SubLObject)genl_predicates.UNPROVIDED), n = (SubLObject)genl_predicates.NIL, n = (SubLObject)genl_predicates.ZERO_INTEGER; n.numL(v_arity); n = Numbers.add(n, (SubLObject)genl_predicates.ONE_INTEGER)) {
                    arg_genls = (SubLObject)genl_predicates.NIL;
                    cdolist_list_var = preds;
                    pred = (SubLObject)genl_predicates.NIL;
                    pred = cdolist_list_var.first();
                    while (genl_predicates.NIL != cdolist_list_var) {
                        pred_argn_genls = kb_accessors.argn_genl(pred, n, mt);
                        if (genl_predicates.NIL != pred_argn_genls) {
                            cdolist_list_var_$114 = pred_argn_genls;
                            col = (SubLObject)genl_predicates.NIL;
                            col = cdolist_list_var_$114.first();
                            while (genl_predicates.NIL != cdolist_list_var_$114) {
                                hash_table_utilities.push_hash(col, pred, table);
                                item_var = col;
                                if (genl_predicates.NIL == conses_high.member(item_var, arg_genls, Symbols.symbol_function((SubLObject)genl_predicates.EQL), Symbols.symbol_function((SubLObject)genl_predicates.IDENTITY))) {
                                    arg_genls = (SubLObject)ConsesLow.cons(item_var, arg_genls);
                                }
                                cdolist_list_var_$114 = cdolist_list_var_$114.rest();
                                col = cdolist_list_var_$114.first();
                            }
                        }
                        else {
                            result = (SubLObject)ConsesLow.cons(pred, result);
                        }
                        pred_args_genls = kb_accessors.args_genl(pred, mt);
                        if (genl_predicates.NIL != pred_args_genls) {
                            cdolist_list_var_$115 = pred_args_genls;
                            col = (SubLObject)genl_predicates.NIL;
                            col = cdolist_list_var_$115.first();
                            while (genl_predicates.NIL != cdolist_list_var_$115) {
                                hash_table_utilities.push_hash(col, pred, table);
                                item_var = col;
                                if (genl_predicates.NIL == conses_high.member(item_var, arg_genls, Symbols.symbol_function((SubLObject)genl_predicates.EQL), Symbols.symbol_function((SubLObject)genl_predicates.IDENTITY))) {
                                    arg_genls = (SubLObject)ConsesLow.cons(item_var, arg_genls);
                                }
                                cdolist_list_var_$115 = cdolist_list_var_$115.rest();
                                col = cdolist_list_var_$115.first();
                            }
                        }
                        else {
                            result = (SubLObject)ConsesLow.cons(pred, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    }
                    cdolist_list_var = genls.min_cols(arg_genls, mt, (SubLObject)genl_predicates.UNPROVIDED);
                    min_col = (SubLObject)genl_predicates.NIL;
                    min_col = cdolist_list_var.first();
                    while (genl_predicates.NIL != cdolist_list_var) {
                        result = ConsesLow.nconc(result, Hashtables.gethash(min_col, table, (SubLObject)genl_predicates.UNPROVIDED));
                        cdolist_list_var = cdolist_list_var.rest();
                        min_col = cdolist_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return list_utilities.remove_duplicate_forts(result);
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 52993L)
    public static SubLObject genl_predicate_mts(final SubLObject pred) {
        return kb_accessors.pred_mts(pred, genl_predicates.$const1$genlPreds, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 53279L)
    public static SubLObject genl_predicate_forward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_forward_mts(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 53481L)
    public static SubLObject genl_predicate_backward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_backward_mts(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 53685L)
    public static SubLObject asserted_genl_predicatesP(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 53914L)
    public static SubLObject asserted_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 54130L)
    public static SubLObject asserted_not_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 54352L)
    public static SubLObject supported_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 54571L)
    public static SubLObject supported_not_genl_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 54796L)
    public static SubLObject asserted_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 55022L)
    public static SubLObject asserted_not_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 55252L)
    public static SubLObject supported_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 55479L)
    public static SubLObject supported_not_spec_predicates(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 55712L)
    public static SubLObject genl_inverse_mts(final SubLObject pred) {
        return kb_accessors.pred_mts(pred, genl_predicates.$const9$genlInverse, (SubLObject)genl_predicates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 55883L)
    public static SubLObject genl_inverse_forward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_forward_mts(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 56083L)
    public static SubLObject genl_inverse_backward_mts(final SubLObject pred) {
        return sbhl_link_methods.sbhl_backward_mts(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 56285L)
    public static SubLObject asserted_genl_inversesP(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 56512L)
    public static SubLObject asserted_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 56726L)
    public static SubLObject asserted_not_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 56946L)
    public static SubLObject supported_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 57163L)
    public static SubLObject supported_not_genl_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 57386L)
    public static SubLObject asserted_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_inverse_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 57610L)
    public static SubLObject asserted_not_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_inverse_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 57838L)
    public static SubLObject supported_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_inverse_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 58063L)
    public static SubLObject supported_not_spec_inverses(final SubLObject pred, SubLObject mt) {
        if (mt == genl_predicates.UNPROVIDED) {
            mt = (SubLObject)genl_predicates.NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_inverse_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 58294L)
    public static SubLObject genl_predicate_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 58803L)
    public static SubLObject add_genl_predicate(SubLObject source, final SubLObject assertion) {
        genl_predicate_after_adding(source, assertion);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 58984L)
    public static SubLObject genl_inverse_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse));
        sbhl_cache.sbhl_cache_addition_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 59295L)
    public static SubLObject add_genl_inverse(SubLObject source, final SubLObject assertion) {
        genl_inverse_after_adding(source, assertion);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 59472L)
    public static SubLObject remove_genl_predicate(SubLObject source, final SubLObject assertion) {
        genl_predicate_after_removing(source, assertion);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 59733L)
    public static SubLObject remove_genl_inverse(SubLObject source, final SubLObject assertion) {
        genl_inverse_after_removing(source, assertion);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 59922L)
    public static SubLObject genl_predicate_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 60243L)
    public static SubLObject genl_inverse_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse));
        sbhl_cache.sbhl_cache_removal_maintainence(assertion);
        after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 60564L)
    public static SubLObject clear_predicate_graph() {
        clear_genl_predicate_graph();
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 60843L)
    public static SubLObject clear_genl_predicate_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds));
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 60960L)
    public static SubLObject clear_genl_inverse_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse));
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 61077L)
    public static SubLObject clear_node_genl_predicate_links(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genl_predicates.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), pred);
            SubLObject mt = (SubLObject)genl_predicates.NIL;
            mt = cdolist_list_var.first();
            while (genl_predicates.NIL != cdolist_list_var) {
                if (genl_predicates.NIL != fort_types_interface.predicateP(pred)) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(pred, mt, (SubLObject)genl_predicates.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 61343L)
    public static SubLObject clear_node_genl_inverse_links(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genl_predicates.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), pred);
            SubLObject mt = (SubLObject)genl_predicates.NIL;
            mt = cdolist_list_var.first();
            while (genl_predicates.NIL != cdolist_list_var) {
                if (genl_predicates.NIL != fort_types_interface.predicateP(pred)) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(pred, mt, (SubLObject)genl_predicates.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 61611L)
    public static SubLObject reset_genl_predicate_links(final SubLObject pred) {
        final SubLObject mts = genl_predicate_mts(pred);
        clear_node_genl_predicate_links(pred);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = (SubLObject)genl_predicates.NIL;
        mt = cdolist_list_var.first();
        while (genl_predicates.NIL != cdolist_list_var) {
            if (genl_predicates.NIL != fort_types_interface.predicateP(pred)) {
                reset_genl_predicate_links_in_mt(pred, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 61859L)
    public static SubLObject reset_genl_inverse_links(final SubLObject pred) {
        final SubLObject mts = genl_inverse_mts(pred);
        clear_node_genl_inverse_links(pred);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = (SubLObject)genl_predicates.NIL;
        mt = cdolist_list_var.first();
        while (genl_predicates.NIL != cdolist_list_var) {
            if (genl_predicates.NIL != fort_types_interface.predicateP(pred)) {
                reset_genl_inverse_links_in_mt(pred, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 62099L)
    public static SubLObject reset_predicate_genls_links_in_mt(final SubLObject pred, final SubLObject mt) {
        return reset_genl_predicate_links_in_mt(pred, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 62211L)
    public static SubLObject reset_genl_predicate_links_in_mt(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genl_predicates.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds), thread);
            sbhl_link_methods.sbhl_recompute_links(pred, mt, (SubLObject)genl_predicates.UNPROVIDED);
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 62376L)
    public static SubLObject reset_genl_inverse_links_in_mt(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)genl_predicates.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse), thread);
            sbhl_link_methods.sbhl_recompute_links(pred, mt, (SubLObject)genl_predicates.UNPROVIDED);
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 62541L)
    public static SubLObject reset_predicate_graph(SubLObject clearP) {
        if (clearP == genl_predicates.UNPROVIDED) {
            clearP = (SubLObject)genl_predicates.T;
        }
        reset_genl_predicate_graph(clearP);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 62653L)
    public static SubLObject reset_genl_predicate_graph(SubLObject clearP) {
        if (clearP == genl_predicates.UNPROVIDED) {
            clearP = (SubLObject)genl_predicates.T;
        }
        if (genl_predicates.NIL != clearP) {
            clear_genl_predicate_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const1$genlPreds));
        return (SubLObject)genl_predicates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/genl-predicates.lisp", position = 62844L)
    public static SubLObject reset_genl_inverse_graph(SubLObject clearP) {
        if (clearP == genl_predicates.UNPROVIDED) {
            clearP = (SubLObject)genl_predicates.T;
        }
        if (genl_predicates.NIL != clearP) {
            clear_genl_predicate_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module(genl_predicates.$const9$genlInverse));
        return (SubLObject)genl_predicates.NIL;
    }
    
    public static SubLObject declare_genl_predicates_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicates", "GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_genl_predicates", "MIN-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_inverses", "GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_genl_inverses", "MIN-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "not_genl_predicates", "NOT-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_not_genl_predicates", "MAX-NOT-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "not_genl_inverses", "NOT-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_not_genl_inverses", "MAX-NOT-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "spec_predicates", "SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_spec_predicates", "MAX-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "spec_inverses", "SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_spec_inverses", "MAX-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "not_spec_predicates", "NOT-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_not_spec_predicates", "MIN-NOT-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "not_spec_inverses", "NOT-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_not_spec_inverses", "MIN-NOT-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicate_siblings", "GENL-PREDICATE-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_inverse_siblings", "GENL-INVERSE-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "spec_predicate_siblings", "SPEC-PREDICATE-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "spec_inverse_siblings", "SPEC-INVERSE-SIBLINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicate_roots", "GENL-PREDICATE-ROOTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_inverse_roots", "GENL-INVERSE-ROOTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_genl_predicates", "ALL-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_genl_predicates_and_inverses", "ALL-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_genl_preds", "ALL-GENL-PREDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_genl_inverses", "ALL-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_spec_predicates", "ALL-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_spec_preds", "ALL-SPEC-PREDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_spec_inverses", "ALL-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_spec_predicates_and_inverses", "ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "inverse_binary_predicates", "INVERSE-BINARY-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "best_inverse_binary_predicate", "BEST-INVERSE-BINARY-PREDICATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_proper_genl_predicates", "ALL-PROPER-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_proper_genl_inverses", "ALL-PROPER-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_proper_genl_predicates_and_inverses", "ALL-PROPER-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_proper_spec_predicates", "ALL-PROPER-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_proper_spec_inverses", "ALL-PROPER-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_proper_spec_predicates_and_inverses", "ALL-PROPER-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_genl_preds_among", "ALL-GENL-PREDS-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_spec_predicates_among", "ALL-SPEC-PREDICATES-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_genl_inverses_among", "ALL-GENL-INVERSES-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_spec_inverses_among", "ALL-SPEC-INVERSES-AMONG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_not_genl_predicates", "ALL-NOT-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_not_genl_preds", "ALL-NOT-GENL-PREDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_not_genl_inverses", "ALL-NOT-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_not_spec_predicates", "ALL-NOT-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_not_spec_preds", "ALL-NOT-SPEC-PREDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_not_spec_inverses", "ALL-NOT-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "union_all_genl_predicates", "UNION-ALL-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "union_all_spec_predicates", "UNION-ALL-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "union_all_genl_inverses", "UNION-ALL-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "union_all_spec_inverses", "UNION-ALL-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "union_all_spec_predicates_and_inverses", "UNION-ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "map_all_genl_preds", "MAP-ALL-GENL-PREDS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "some_all_genl_preds", "SOME-ALL-GENL-PREDS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "some_all_genl_inverses", "SOME-ALL-GENL-INVERSES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "some_all_genl_preds_and_inverses", "SOME-ALL-GENL-PREDS-AND-INVERSES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "map_all_spec_preds", "MAP-ALL-SPEC-PREDS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "map_spec_preds", "MAP-SPEC-PREDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "map_all_spec_preds_and_inverses", "MAP-ALL-SPEC-PREDS-AND-INVERSES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "some_all_spec_preds", "SOME-ALL-SPEC-PREDS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "some_all_spec_preds_and_inverses", "SOME-ALL-SPEC-PREDS-AND-INVERSES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "count_all_genl_predicates", "COUNT-ALL-GENL-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "count_all_genl_inverses", "COUNT-ALL-GENL-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "count_all_genl_predicates_and_inverses", "COUNT-ALL-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "count_all_spec_predicates", "COUNT-ALL-SPEC-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "count_all_spec_inverses", "COUNT-ALL-SPEC-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "count_all_spec_predicates_and_inverses", "COUNT-ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_spec_preds_wrt_type", "ALL-SPEC-PREDS-WRT-TYPE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "all_spec_preds_wrt_arg", "ALL-SPEC-PREDS-WRT-ARG", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "gather_if_searched_arg_constraints", "GATHER-IF-SEARCHED-ARG-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "get_sbhl_arg_type_alist", "GET-SBHL-ARG-TYPE-ALIST", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.genl_predicates", "with_sbhl_arg_type_alist", "WITH-SBHL-ARG-TYPE-ALIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "get_sbhl_arg_type_store", "GET-SBHL-ARG-TYPE-STORE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.genl_predicates", "with_new_sbhl_arg_type_genls_stores", "WITH-NEW-SBHL-ARG-TYPE-GENLS-STORES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "sbhl_initialize_arg_type_genls_stores", "SBHL-INITIALIZE-ARG-TYPE-GENLS-STORES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "sbhl_arg_types_alist_satisfied_p", "SBHL-ARG-TYPES-ALIST-SATISFIED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "leaf_predicates_wrt_arg_type", "LEAF-PREDICATES-WRT-ARG-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "sbhl_add_leaf_predicates_to_result", "SBHL-ADD-LEAF-PREDICATES-TO-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "pred_is_typed_spec_pred_p", "PRED-IS-TYPED-SPEC-PRED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "typed_spec_predicates_wrt_arg_type", "TYPED-SPEC-PREDICATES-WRT-ARG-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "leaf_predicates_mark_and_sweep", "LEAF-PREDICATES-MARK-AND-SWEEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_predicates", "MIN-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_predicates", "MAX-PREDICATES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_ceiling_predicates", "MIN-CEILING-PREDICATES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_floor_predicates", "MAX-FLOOR-PREDICATES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "some_spec_predicate_or_inverse_somewhereP", "SOME-SPEC-PREDICATE-OR-INVERSE-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicateP", "GENL-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicate_in_any_mtP", "GENL-PREDICATE-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predP", "GENL-PRED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "spec_predP", "SPEC-PRED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "proper_genl_predP", "PROPER-GENL-PRED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "proper_spec_predP", "PROPER-SPEC-PRED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "spec_predicateP", "SPEC-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_inverseP", "GENL-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "spec_inverseP", "SPEC-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicate_ofP", "GENL-PREDICATE-OF?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_inverse_ofP", "GENL-INVERSE-OF?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "any_genl_predicateP", "ANY-GENL-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "any_genl_predP", "ANY-GENL-PRED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "any_genl_predicate_in_any_mtP", "ANY-GENL-PREDICATE-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "any_genl_inverseP", "ANY-GENL-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "not_genl_predicateP", "NOT-GENL-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "not_genl_predP", "NOT-GENL-PRED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "not_spec_predicateP", "NOT-SPEC-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "argue_not_genl_predicateP", "ARGUE-NOT-GENL-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "not_genl_inverseP", "NOT-GENL-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "not_spec_inverseP", "NOT-SPEC-INVERSE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "argue_not_genl_inverseP", "ARGUE-NOT-GENL-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "any_not_genl_predicateP", "ANY-NOT-GENL-PREDICATE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_genl_predicate_of", "RANDOM-GENL-PREDICATE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_spec_predicate_of", "RANDOM-SPEC-PREDICATE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_proper_genl_predicate_of", "RANDOM-PROPER-GENL-PREDICATE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_proper_spec_predicate_of", "RANDOM-PROPER-SPEC-PREDICATE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_genl_inverse_of", "RANDOM-GENL-INVERSE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_spec_inverse_of", "RANDOM-SPEC-INVERSE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_proper_genl_inverse_of", "RANDOM-PROPER-GENL-INVERSE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_proper_spec_inverse_of", "RANDOM-PROPER-SPEC-INVERSE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_genl_predicate_or_inverse_of", "RANDOM-GENL-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_spec_predicate_or_inverse_of", "RANDOM-SPEC-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_proper_genl_predicate_or_inverse_of", "RANDOM-PROPER-GENL-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "random_proper_spec_predicate_or_inverse_of", "RANDOM-PROPER-SPEC-PREDICATE-OR-INVERSE-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "any_spec_predP", "ANY-SPEC-PRED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "any_spec_inverseP", "ANY-SPEC-INVERSE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "some_genl_pred_or_inverseP", "SOME-GENL-PRED-OR-INVERSE?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "some_genl_pred_or_inverseP_int", "SOME-GENL-PRED-OR-INVERSE?-INT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "some_spec_pred_or_inverseP", "SOME-SPEC-PRED-OR-INVERSE?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "some_spec_pred_or_inverseP_int", "SOME-SPEC-PRED-OR-INVERSE?-INT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "intersecting_predicatesP", "INTERSECTING-PREDICATES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "predicates_intersectP", "PREDICATES-INTERSECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "preds_intersectP", "PREDS-INTERSECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "why_genl_predicateP", "WHY-GENL-PREDICATE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "why_not_genl_predicateP", "WHY-NOT-GENL-PREDICATE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "why_genl_inverseP", "WHY-GENL-INVERSE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "why_spec_inverseP", "WHY-SPEC-INVERSE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "why_not_genl_inverseP", "WHY-NOT-GENL-INVERSE?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "why_some_genl_predicate_amongP", "WHY-SOME-GENL-PREDICATE-AMONG?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "why_some_genl_inverse_amongP", "WHY-SOME-GENL-INVERSE-AMONG?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_floor_mts_of_genl_predicate_paths", "MAX-FLOOR-MTS-OF-GENL-PREDICATE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_floor_mts_of_genl_pred_paths", "MAX-FLOOR-MTS-OF-GENL-PRED-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_mts_of_genl_predicate_paths", "MIN-MTS-OF-GENL-PREDICATE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_mts_of_genl_pred_paths", "MIN-MTS-OF-GENL-PRED-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_floor_mts_of_not_genl_predicate_paths", "MAX-FLOOR-MTS-OF-NOT-GENL-PREDICATE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_mts_of_not_genl_predicate_paths", "MIN-MTS-OF-NOT-GENL-PREDICATE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_floor_mts_of_genl_inverse_paths", "MAX-FLOOR-MTS-OF-GENL-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_mts_of_genl_inverse_paths", "MIN-MTS-OF-GENL-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "max_floor_mts_of_not_genl_inverse_paths", "MAX-FLOOR-MTS-OF-NOT-GENL-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_mts_of_not_genl_inverse_paths", "MIN-MTS-OF-NOT-GENL-INVERSE-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_candidate_genl_preds", "MIN-CANDIDATE-GENL-PREDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "cached_min_candidate_genl_preds", "CACHED-MIN-CANDIDATE-GENL-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "cached_min_candidate_genl_preds_in_mt", "CACHED-MIN-CANDIDATE-GENL-PREDS-IN-MT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "clear_cached_candidate_genl_preds", "CLEAR-CACHED-CANDIDATE-GENL-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "remove_cached_candidate_genl_preds", "REMOVE-CACHED-CANDIDATE-GENL-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "cached_candidate_genl_preds_internal", "CACHED-CANDIDATE-GENL-PREDS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "cached_candidate_genl_preds", "CACHED-CANDIDATE-GENL-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "clear_cached_candidate_genl_preds_in_mt", "CLEAR-CACHED-CANDIDATE-GENL-PREDS-IN-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "remove_cached_candidate_genl_preds_in_mt", "REMOVE-CACHED-CANDIDATE-GENL-PREDS-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "cached_candidate_genl_preds_in_mt_internal", "CACHED-CANDIDATE-GENL-PREDS-IN-MT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "cached_candidate_genl_preds_in_mt", "CACHED-CANDIDATE-GENL-PREDS-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "candidate_genl_preds", "CANDIDATE-GENL-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "candidate_preds_for_arg_type", "CANDIDATE-PREDS-FOR-ARG-TYPE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "candidate_preds_for_arg_isa", "CANDIDATE-PREDS-FOR-ARG-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "candidate_preds_for_arg_genl", "CANDIDATE-PREDS-FOR-ARG-GENL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_preds_wrt_arg_types", "MIN-PREDS-WRT-ARG-TYPES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_preds_wrt_arg_isa", "MIN-PREDS-WRT-ARG-ISA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "min_preds_wrt_arg_genl", "MIN-PREDS-WRT-ARG-GENL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicate_mts", "GENL-PREDICATE-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicate_forward_mts", "GENL-PREDICATE-FORWARD-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicate_backward_mts", "GENL-PREDICATE-BACKWARD-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "asserted_genl_predicatesP", "ASSERTED-GENL-PREDICATES?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "asserted_genl_predicates", "ASSERTED-GENL-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "asserted_not_genl_predicates", "ASSERTED-NOT-GENL-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "supported_genl_predicates", "SUPPORTED-GENL-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "supported_not_genl_predicates", "SUPPORTED-NOT-GENL-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "asserted_spec_predicates", "ASSERTED-SPEC-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "asserted_not_spec_predicates", "ASSERTED-NOT-SPEC-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "supported_spec_predicates", "SUPPORTED-SPEC-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "supported_not_spec_predicates", "SUPPORTED-NOT-SPEC-PREDICATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_inverse_mts", "GENL-INVERSE-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_inverse_forward_mts", "GENL-INVERSE-FORWARD-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_inverse_backward_mts", "GENL-INVERSE-BACKWARD-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "asserted_genl_inversesP", "ASSERTED-GENL-INVERSES?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "asserted_genl_inverses", "ASSERTED-GENL-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "asserted_not_genl_inverses", "ASSERTED-NOT-GENL-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "supported_genl_inverses", "SUPPORTED-GENL-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "supported_not_genl_inverses", "SUPPORTED-NOT-GENL-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "asserted_spec_inverses", "ASSERTED-SPEC-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "asserted_not_spec_inverses", "ASSERTED-NOT-SPEC-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "supported_spec_inverses", "SUPPORTED-SPEC-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "supported_not_spec_inverses", "SUPPORTED-NOT-SPEC-INVERSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicate_after_adding", "GENL-PREDICATE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "add_genl_predicate", "ADD-GENL-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_inverse_after_adding", "GENL-INVERSE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "add_genl_inverse", "ADD-GENL-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "remove_genl_predicate", "REMOVE-GENL-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "remove_genl_inverse", "REMOVE-GENL-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_predicate_after_removing", "GENL-PREDICATE-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "genl_inverse_after_removing", "GENL-INVERSE-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "clear_predicate_graph", "CLEAR-PREDICATE-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "clear_genl_predicate_graph", "CLEAR-GENL-PREDICATE-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "clear_genl_inverse_graph", "CLEAR-GENL-INVERSE-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "clear_node_genl_predicate_links", "CLEAR-NODE-GENL-PREDICATE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "clear_node_genl_inverse_links", "CLEAR-NODE-GENL-INVERSE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "reset_genl_predicate_links", "RESET-GENL-PREDICATE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "reset_genl_inverse_links", "RESET-GENL-INVERSE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "reset_predicate_genls_links_in_mt", "RESET-PREDICATE-GENLS-LINKS-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "reset_genl_predicate_links_in_mt", "RESET-GENL-PREDICATE-LINKS-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "reset_genl_inverse_links_in_mt", "RESET-GENL-INVERSE-LINKS-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "reset_predicate_graph", "RESET-PREDICATE-GRAPH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "reset_genl_predicate_graph", "RESET-GENL-PREDICATE-GRAPH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.genl_predicates", "reset_genl_inverse_graph", "RESET-GENL-INVERSE-GRAPH", 0, 1, false);
        return (SubLObject)genl_predicates.NIL;
    }
    
    public static SubLObject init_genl_predicates_file() {
        genl_predicates.$sbhl_arg_type_alist$ = SubLFiles.defparameter("*SBHL-ARG-TYPE-ALIST*", (SubLObject)genl_predicates.NIL);
        genl_predicates.$sbhl_arg_type_genls_stores$ = SubLFiles.defparameter("*SBHL-ARG-TYPE-GENLS-STORES*", (SubLObject)genl_predicates.NIL);
        genl_predicates.$cached_candidate_genl_preds_caching_state$ = SubLFiles.deflexical("*CACHED-CANDIDATE-GENL-PREDS-CACHING-STATE*", (SubLObject)genl_predicates.NIL);
        genl_predicates.$cached_candidate_genl_preds_in_mt_caching_state$ = SubLFiles.deflexical("*CACHED-CANDIDATE-GENL-PREDS-IN-MT-CACHING-STATE*", (SubLObject)genl_predicates.NIL);
        return (SubLObject)genl_predicates.NIL;
    }
    
    public static SubLObject setup_genl_predicates_file() {
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym2$GENL_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str4$Returns_the_local_genlPreds_of_PR, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym7$MIN_GENL_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str8$Returns_the_most_specific_local_g, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym10$GENL_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str11$Returns_the_local_genlInverses_of, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym12$MIN_GENL_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str13$Returns_the_most_specific_local_g, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym14$NOT_GENL_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str15$Returns_the_local_negated_genlPre, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym16$MAX_NOT_GENL_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str17$Returns_the_most_general_local_ne, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym18$NOT_GENL_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str15$Returns_the_local_negated_genlPre, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym19$MAX_NOT_GENL_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str17$Returns_the_most_general_local_ne, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym20$SPEC_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str21$Returns_the_specPreds_of_PRED, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym22$MAX_SPEC_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str23$Returns_the_most_general_specPred, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym24$SPEC_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str25$Returns_the_specInverses_of_PRED, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym26$MAX_SPEC_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str27$Returns_the_most_general_specInve, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym28$NOT_SPEC_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str29$Returns_the_negated_specPreds_of_, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym30$MIN_NOT_SPEC_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str31$Returns_the_most_specific_negated, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym32$NOT_SPEC_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str31$Returns_the_most_specific_negated, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym33$MIN_NOT_SPEC_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str31$Returns_the_most_specific_negated, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym34$GENL_PREDICATE_SIBLINGS, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str35$Returns_the_direct___genlPreds_of, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym36$GENL_INVERSE_SIBLINGS, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str37$Returns_the_direct___genlInverse_, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym38$SPEC_PREDICATE_SIBLINGS, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str39$Returns_the_direct_spec_preds_of_, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym40$SPEC_INVERSE_SIBLINGS, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str41$Returns_the_direct_spec_inverses_, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym42$GENL_PREDICATE_ROOTS, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str43$Returns_the_most_general_genlPred, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym44$GENL_INVERSE_ROOTS, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str45$Returns_the_most_general_genlInve, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym46$ALL_GENL_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str47$Returns_all_genlPreds_of_predicat, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym62$ALL_GENL_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str63$Returns_all_genlInverses_of_predi, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym64$ALL_SPEC_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str65$Returns_all_predicates_having_PRE, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym66$ALL_SPEC_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str67$Returns_all_predicates_having_PRE, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym71$ALL_GENL_PREDS_AMONG, (SubLObject)genl_predicates.$list72, (SubLObject)genl_predicates.$str73$Returns_those_genlPreds_of_PRED_t, (SubLObject)genl_predicates.$list74, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym75$ALL_NOT_GENL_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str76$Returns_all_negated_genlPreds_of_, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym77$ALL_NOT_GENL_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str76$Returns_all_negated_genlPreds_of_, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym78$ALL_NOT_SPEC_PREDICATES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str79$Returns_all_negated_specPreds_of_, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym80$ALL_NOT_SPEC_INVERSES, (SubLObject)genl_predicates.$list3, (SubLObject)genl_predicates.$str81$Returns_all_predicates_having_PRE, (SubLObject)genl_predicates.$list5, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym82$UNION_ALL_GENL_PREDICATES, (SubLObject)genl_predicates.$list83, (SubLObject)genl_predicates.$str84$Returns_all_genl_predicates_of_ea, (SubLObject)genl_predicates.$list85, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym86$UNION_ALL_SPEC_PREDICATES, (SubLObject)genl_predicates.$list83, (SubLObject)genl_predicates.$str87$Returns_all_spec_predicates_of_ea, (SubLObject)genl_predicates.$list85, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym88$UNION_ALL_GENL_INVERSES, (SubLObject)genl_predicates.$list83, (SubLObject)genl_predicates.$str89$Returns_all_genl_inverses_of_each, (SubLObject)genl_predicates.$list85, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym90$UNION_ALL_SPEC_INVERSES, (SubLObject)genl_predicates.$list83, (SubLObject)genl_predicates.$str91$Returns_all_specs_of_each_predica, (SubLObject)genl_predicates.$list85, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym93$MAP_ALL_GENL_PREDS, (SubLObject)genl_predicates.$list94, (SubLObject)genl_predicates.$str95$Apply_FN_to_each_genlPred_of_PRED, (SubLObject)genl_predicates.$list96, (SubLObject)genl_predicates.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym97$SOME_ALL_GENL_PREDS, (SubLObject)genl_predicates.$list94, (SubLObject)genl_predicates.$str98$Apply_FN_to_each_genlPred_of_PRED, (SubLObject)genl_predicates.$list96, (SubLObject)genl_predicates.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym99$SOME_ALL_GENL_INVERSES, (SubLObject)genl_predicates.$list94, (SubLObject)genl_predicates.$str98$Apply_FN_to_each_genlPred_of_PRED, (SubLObject)genl_predicates.$list96, (SubLObject)genl_predicates.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym100$MAP_ALL_SPEC_PREDS, (SubLObject)genl_predicates.$list94, (SubLObject)genl_predicates.$str95$Apply_FN_to_each_genlPred_of_PRED, (SubLObject)genl_predicates.$list96, (SubLObject)genl_predicates.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym101$SOME_ALL_SPEC_PREDS, (SubLObject)genl_predicates.$list94, (SubLObject)genl_predicates.$str98$Apply_FN_to_each_genlPred_of_PRED, (SubLObject)genl_predicates.$list96, (SubLObject)genl_predicates.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym105$ALL_SPEC_PREDS_WRT_TYPE, (SubLObject)genl_predicates.$list106, (SubLObject)genl_predicates.$str107$Returns_those_all_spec_preds_of_P, (SubLObject)genl_predicates.$list108, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym110$ALL_SPEC_PREDS_WRT_ARG, (SubLObject)genl_predicates.$list111, (SubLObject)genl_predicates.$str112$Returns_those_all_spec_preds_of_P, (SubLObject)genl_predicates.$list113, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym127$MIN_PREDICATES, (SubLObject)genl_predicates.$list83, (SubLObject)genl_predicates.$str128$Returns_the_most_specific_predica, (SubLObject)genl_predicates.$list85, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym129$MAX_PREDICATES, (SubLObject)genl_predicates.$list83, (SubLObject)genl_predicates.$str130$Returns_the_most_general_predicat, (SubLObject)genl_predicates.$list85, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym131$MIN_CEILING_PREDICATES, (SubLObject)genl_predicates.$list132, (SubLObject)genl_predicates.$str133$Returns_the_most_specific_common_, (SubLObject)genl_predicates.$list85, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym135$MAX_FLOOR_PREDICATES, (SubLObject)genl_predicates.$list132, (SubLObject)genl_predicates.$str136$Returns_the_most_general_common_s, (SubLObject)genl_predicates.$list85, (SubLObject)genl_predicates.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym137$GENL_PREDICATE_, (SubLObject)genl_predicates.$list138, (SubLObject)genl_predicates.$str139$Is_GENL_a_genlPred_of_SPEC______a, (SubLObject)genl_predicates.$list140, (SubLObject)genl_predicates.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym144$SPEC_PREDICATE_, (SubLObject)genl_predicates.$list145, (SubLObject)genl_predicates.$str139$Is_GENL_a_genlPred_of_SPEC______a, (SubLObject)genl_predicates.$list146, (SubLObject)genl_predicates.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym147$GENL_INVERSE_, (SubLObject)genl_predicates.$list138, (SubLObject)genl_predicates.$str148$Is_GENL_a_genlInverse_of_SPEC____, (SubLObject)genl_predicates.$list140, (SubLObject)genl_predicates.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym149$SPEC_INVERSE_, (SubLObject)genl_predicates.$list145, (SubLObject)genl_predicates.$str148$Is_GENL_a_genlInverse_of_SPEC____, (SubLObject)genl_predicates.$list140, (SubLObject)genl_predicates.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym150$ANY_GENL_PREDICATE_, (SubLObject)genl_predicates.$list151, (SubLObject)genl_predicates.$str152$Returns_T_iff__genl_predicate__SP, (SubLObject)genl_predicates.$list153, (SubLObject)genl_predicates.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym154$NOT_GENL_PREDICATE_, (SubLObject)genl_predicates.$list155, (SubLObject)genl_predicates.$str156$Is_NOT_GENL_known_to_be_not_a_gen, (SubLObject)genl_predicates.$list157, (SubLObject)genl_predicates.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym158$NOT_GENL_INVERSE_, (SubLObject)genl_predicates.$list155, (SubLObject)genl_predicates.$str159$Is_NOT_GENL_a_negated_genlInverse, (SubLObject)genl_predicates.$list157, (SubLObject)genl_predicates.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym160$ANY_NOT_GENL_PREDICATE_, (SubLObject)genl_predicates.$list161, (SubLObject)genl_predicates.$str162$Is_any_predicate_in_NOT_GENLS_not, (SubLObject)genl_predicates.$list163, (SubLObject)genl_predicates.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym166$INTERSECTING_PREDICATES_, (SubLObject)genl_predicates.$list167, (SubLObject)genl_predicates.$str168$Does_the_extension_of_PRED1_inclu, (SubLObject)genl_predicates.$list169, (SubLObject)genl_predicates.$list141);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym170$WHY_GENL_PREDICATE_, (SubLObject)genl_predicates.$list171, (SubLObject)genl_predicates.$str172$A_justification_of__genlPreds_SPE, (SubLObject)genl_predicates.$list140, (SubLObject)genl_predicates.$list173);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym174$WHY_NOT_GENL_PREDICATE_, (SubLObject)genl_predicates.$list171, (SubLObject)genl_predicates.$str175$A_justification_of__not__genlPred, (SubLObject)genl_predicates.$list140, (SubLObject)genl_predicates.$list173);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym176$WHY_GENL_INVERSE_, (SubLObject)genl_predicates.$list177, (SubLObject)genl_predicates.$str178$A_justification_of__genlInverse_P, (SubLObject)genl_predicates.$list179, (SubLObject)genl_predicates.$list173);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym181$WHY_NOT_GENL_INVERSE_, (SubLObject)genl_predicates.$list171, (SubLObject)genl_predicates.$str182$A_justification_of__not__genlInve, (SubLObject)genl_predicates.$list140, (SubLObject)genl_predicates.$list173);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym184$MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS, (SubLObject)genl_predicates.$list185, (SubLObject)genl_predicates.$str186$_return_listp__In_what__most_genl, (SubLObject)genl_predicates.$list140, (SubLObject)genl_predicates.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)genl_predicates.$sym187$MAX_FLOOR_MTS_OF_GENL_INVERSE_PATHS, (SubLObject)genl_predicates.$list188, (SubLObject)genl_predicates.$str189$In_what__most_genl__mts_is_GENL_I, (SubLObject)genl_predicates.$list190, (SubLObject)genl_predicates.NIL);
        memoization_state.note_globally_cached_function((SubLObject)genl_predicates.$sym191$CACHED_CANDIDATE_GENL_PREDS);
        memoization_state.note_globally_cached_function((SubLObject)genl_predicates.$sym195$CACHED_CANDIDATE_GENL_PREDS_IN_MT);
        utilities_macros.register_kb_function((SubLObject)genl_predicates.$sym203$GENL_PREDICATE_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)genl_predicates.$sym204$ADD_GENL_PREDICATE);
        utilities_macros.register_kb_function((SubLObject)genl_predicates.$sym205$GENL_INVERSE_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)genl_predicates.$sym206$ADD_GENL_INVERSE);
        utilities_macros.register_kb_function((SubLObject)genl_predicates.$sym207$REMOVE_GENL_PREDICATE);
        utilities_macros.register_kb_function((SubLObject)genl_predicates.$sym208$REMOVE_GENL_INVERSE);
        utilities_macros.register_kb_function((SubLObject)genl_predicates.$sym209$GENL_PREDICATE_AFTER_REMOVING);
        utilities_macros.register_kb_function((SubLObject)genl_predicates.$sym210$GENL_INVERSE_AFTER_REMOVING);
        return (SubLObject)genl_predicates.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_genl_predicates_file();
    }
    
    @Override
	public void initializeVariables() {
        init_genl_predicates_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_genl_predicates_file();
    }
    
    static {
        me = (SubLFile)new genl_predicates();
        genl_predicates.$sbhl_arg_type_alist$ = null;
        genl_predicates.$sbhl_arg_type_genls_stores$ = null;
        genl_predicates.$cached_candidate_genl_preds_caching_state$ = null;
        genl_predicates.$cached_candidate_genl_preds_in_mt_caching_state$ = null;
        $sym0$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const1$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $sym2$GENL_PREDICATES = SubLObjectFactory.makeSymbol("GENL-PREDICATES");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str4$Returns_the_local_genlPreds_of_PR = SubLObjectFactory.makeString("Returns the local genlPreds of PRED");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $sym7$MIN_GENL_PREDICATES = SubLObjectFactory.makeSymbol("MIN-GENL-PREDICATES");
        $str8$Returns_the_most_specific_local_g = SubLObjectFactory.makeString("Returns the most-specific local genlPreds of PRED");
        $const9$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $sym10$GENL_INVERSES = SubLObjectFactory.makeSymbol("GENL-INVERSES");
        $str11$Returns_the_local_genlInverses_of = SubLObjectFactory.makeString("Returns the local genlInverses of PRED");
        $sym12$MIN_GENL_INVERSES = SubLObjectFactory.makeSymbol("MIN-GENL-INVERSES");
        $str13$Returns_the_most_specific_local_g = SubLObjectFactory.makeString("Returns the most-specific local genlInverses of PRED");
        $sym14$NOT_GENL_PREDICATES = SubLObjectFactory.makeSymbol("NOT-GENL-PREDICATES");
        $str15$Returns_the_local_negated_genlPre = SubLObjectFactory.makeString("Returns the local negated genlPreds of PRED");
        $sym16$MAX_NOT_GENL_PREDICATES = SubLObjectFactory.makeSymbol("MAX-NOT-GENL-PREDICATES");
        $str17$Returns_the_most_general_local_ne = SubLObjectFactory.makeString("Returns the most-general local negated genlPreds of PRED");
        $sym18$NOT_GENL_INVERSES = SubLObjectFactory.makeSymbol("NOT-GENL-INVERSES");
        $sym19$MAX_NOT_GENL_INVERSES = SubLObjectFactory.makeSymbol("MAX-NOT-GENL-INVERSES");
        $sym20$SPEC_PREDICATES = SubLObjectFactory.makeSymbol("SPEC-PREDICATES");
        $str21$Returns_the_specPreds_of_PRED = SubLObjectFactory.makeString("Returns the specPreds of PRED");
        $sym22$MAX_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("MAX-SPEC-PREDICATES");
        $str23$Returns_the_most_general_specPred = SubLObjectFactory.makeString("Returns the most-general specPreds of PRED");
        $sym24$SPEC_INVERSES = SubLObjectFactory.makeSymbol("SPEC-INVERSES");
        $str25$Returns_the_specInverses_of_PRED = SubLObjectFactory.makeString("Returns the specInverses of PRED");
        $sym26$MAX_SPEC_INVERSES = SubLObjectFactory.makeSymbol("MAX-SPEC-INVERSES");
        $str27$Returns_the_most_general_specInve = SubLObjectFactory.makeString("Returns the most-general specInverses of PRED");
        $sym28$NOT_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("NOT-SPEC-PREDICATES");
        $str29$Returns_the_negated_specPreds_of_ = SubLObjectFactory.makeString("Returns the negated specPreds of PRED");
        $sym30$MIN_NOT_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("MIN-NOT-SPEC-PREDICATES");
        $str31$Returns_the_most_specific_negated = SubLObjectFactory.makeString("Returns the most-specific negated specPreds of PRED");
        $sym32$NOT_SPEC_INVERSES = SubLObjectFactory.makeSymbol("NOT-SPEC-INVERSES");
        $sym33$MIN_NOT_SPEC_INVERSES = SubLObjectFactory.makeSymbol("MIN-NOT-SPEC-INVERSES");
        $sym34$GENL_PREDICATE_SIBLINGS = SubLObjectFactory.makeSymbol("GENL-PREDICATE-SIBLINGS");
        $str35$Returns_the_direct___genlPreds_of = SubLObjectFactory.makeString("Returns the direct #$genlPreds of those predicates having direct spec-preds PRED");
        $sym36$GENL_INVERSE_SIBLINGS = SubLObjectFactory.makeSymbol("GENL-INVERSE-SIBLINGS");
        $str37$Returns_the_direct___genlInverse_ = SubLObjectFactory.makeString("Returns the direct #$genlInverse of those predicates having direct spec-inverses PRED");
        $sym38$SPEC_PREDICATE_SIBLINGS = SubLObjectFactory.makeSymbol("SPEC-PREDICATE-SIBLINGS");
        $str39$Returns_the_direct_spec_preds_of_ = SubLObjectFactory.makeString("Returns the direct spec-preds of those collections having direct #$genlPreds PRED");
        $sym40$SPEC_INVERSE_SIBLINGS = SubLObjectFactory.makeSymbol("SPEC-INVERSE-SIBLINGS");
        $str41$Returns_the_direct_spec_inverses_ = SubLObjectFactory.makeString("Returns the direct spec-inverses of those collections having direct #$genlInverse PRED");
        $sym42$GENL_PREDICATE_ROOTS = SubLObjectFactory.makeSymbol("GENL-PREDICATE-ROOTS");
        $str43$Returns_the_most_general_genlPred = SubLObjectFactory.makeString("Returns the most general genlPreds of PRED.");
        $sym44$GENL_INVERSE_ROOTS = SubLObjectFactory.makeSymbol("GENL-INVERSE-ROOTS");
        $str45$Returns_the_most_general_genlInve = SubLObjectFactory.makeString("Returns the most general genlInverses of PRED.");
        $sym46$ALL_GENL_PREDICATES = SubLObjectFactory.makeSymbol("ALL-GENL-PREDICATES");
        $str47$Returns_all_genlPreds_of_predicat = SubLObjectFactory.makeString("Returns all genlPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");
        $kw48$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw49$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw50$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw52$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str53$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym54$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw55$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str56$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw57$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str58$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str59$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str60$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str61$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym62$ALL_GENL_INVERSES = SubLObjectFactory.makeSymbol("ALL-GENL-INVERSES");
        $str63$Returns_all_genlInverses_of_predi = SubLObjectFactory.makeString("Returns all genlInverses of predicate PRED \n   (ascending transitive closure; inexpensive)");
        $sym64$ALL_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("ALL-SPEC-PREDICATES");
        $str65$Returns_all_predicates_having_PRE = SubLObjectFactory.makeString("Returns all predicates having PRED as a genlPred \n   (descending transitive closure; expensive)");
        $sym66$ALL_SPEC_INVERSES = SubLObjectFactory.makeSymbol("ALL-SPEC-INVERSES");
        $str67$Returns_all_predicates_having_PRE = SubLObjectFactory.makeString("Returns all predicates having PRED as a genlInverse\n   (descending transitive closure; expensive)");
        $const68$InverseBinaryPredicateFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InverseBinaryPredicateFn"));
        $sym69$EL_FORT_P = SubLObjectFactory.makeSymbol("EL-FORT-P");
        $sym70$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym71$ALL_GENL_PREDS_AMONG = SubLObjectFactory.makeSymbol("ALL-GENL-PREDS-AMONG");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str73$Returns_those_genlPreds_of_PRED_t = SubLObjectFactory.makeString("Returns those genlPreds of PRED that are included among CANDIDATEs");
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym75$ALL_NOT_GENL_PREDICATES = SubLObjectFactory.makeSymbol("ALL-NOT-GENL-PREDICATES");
        $str76$Returns_all_negated_genlPreds_of_ = SubLObjectFactory.makeString("Returns all negated genlPreds of predicate PRED \n   (descending transitive closure; expensive)");
        $sym77$ALL_NOT_GENL_INVERSES = SubLObjectFactory.makeSymbol("ALL-NOT-GENL-INVERSES");
        $sym78$ALL_NOT_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("ALL-NOT-SPEC-PREDICATES");
        $str79$Returns_all_negated_specPreds_of_ = SubLObjectFactory.makeString("Returns all negated specPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");
        $sym80$ALL_NOT_SPEC_INVERSES = SubLObjectFactory.makeSymbol("ALL-NOT-SPEC-INVERSES");
        $str81$Returns_all_predicates_having_PRE = SubLObjectFactory.makeString("Returns all predicates having PRED as a negated genlInverse\n   (ascending transitive closure; inexpensive)");
        $sym82$UNION_ALL_GENL_PREDICATES = SubLObjectFactory.makeSymbol("UNION-ALL-GENL-PREDICATES");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str84$Returns_all_genl_predicates_of_ea = SubLObjectFactory.makeString("Returns all genl-predicates of each predicate in PREDS");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym86$UNION_ALL_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("UNION-ALL-SPEC-PREDICATES");
        $str87$Returns_all_spec_predicates_of_ea = SubLObjectFactory.makeString("Returns all spec-predicates of each predicate in PREDS");
        $sym88$UNION_ALL_GENL_INVERSES = SubLObjectFactory.makeSymbol("UNION-ALL-GENL-INVERSES");
        $str89$Returns_all_genl_inverses_of_each = SubLObjectFactory.makeString("Returns all genl-inverses of each predicate in PREDS");
        $sym90$UNION_ALL_SPEC_INVERSES = SubLObjectFactory.makeSymbol("UNION-ALL-SPEC-INVERSES");
        $str91$Returns_all_specs_of_each_predica = SubLObjectFactory.makeString("Returns all specs of each predicate in PREDS");
        $sym92$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym93$MAP_ALL_GENL_PREDS = SubLObjectFactory.makeSymbol("MAP-ALL-GENL-PREDS");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str95$Apply_FN_to_each_genlPred_of_PRED = SubLObjectFactory.makeString("Apply FN to each genlPred of PRED");
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")));
        $sym97$SOME_ALL_GENL_PREDS = SubLObjectFactory.makeSymbol("SOME-ALL-GENL-PREDS");
        $str98$Apply_FN_to_each_genlPred_of_PRED = SubLObjectFactory.makeString("Apply FN to each genlPred of PRED until FN returns a non-nil result");
        $sym99$SOME_ALL_GENL_INVERSES = SubLObjectFactory.makeSymbol("SOME-ALL-GENL-INVERSES");
        $sym100$MAP_ALL_SPEC_PREDS = SubLObjectFactory.makeSymbol("MAP-ALL-SPEC-PREDS");
        $sym101$SOME_ALL_SPEC_PREDS = SubLObjectFactory.makeSymbol("SOME-ALL-SPEC-PREDS");
        $sym102$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $const103$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym104$GATHER_IF_SEARCHED_ARG_CONSTRAINTS = SubLObjectFactory.makeSymbol("GATHER-IF-SEARCHED-ARG-CONSTRAINTS");
        $sym105$ALL_SPEC_PREDS_WRT_TYPE = SubLObjectFactory.makeSymbol("ALL-SPEC-PREDS-WRT-TYPE");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str107$Returns_those_all_spec_preds_of_P = SubLObjectFactory.makeString("Returns those all-spec-preds of PRED for which instances \nof COL are legal in arguments in position ARG");
        $list108 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $const109$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym110$ALL_SPEC_PREDS_WRT_ARG = SubLObjectFactory.makeSymbol("ALL-SPEC-PREDS-WRT-ARG");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str112$Returns_those_all_spec_preds_of_P = SubLObjectFactory.makeString("Returns those all-spec-preds of PRED for which FORT\nis legal as arguments in position ARG");
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym115$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym116$_SBHL_ARG_TYPE_ALIST_ = SubLObjectFactory.makeSymbol("*SBHL-ARG-TYPE-ALIST*");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-ARG-TYPE-GENLS-STORES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)genl_predicates.EQUAL))));
        $sym118$SBHL_INITIALIZE_ARG_TYPE_GENLS_STORES = SubLObjectFactory.makeSymbol("SBHL-INITIALIZE-ARG-TYPE-GENLS-STORES");
        $sym119$SBHL_ARG_TYPES_ALIST_SATISFIED_P = SubLObjectFactory.makeSymbol("SBHL-ARG-TYPES-ALIST-SATISFIED-P");
        $const120$typedGenlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typedGenlPreds"));
        $kw121$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw122$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const123$typedGenlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typedGenlInverse"));
        $const124$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $kw125$OLD = SubLObjectFactory.makeKeyword("OLD");
        $kw126$RESOURCE = SubLObjectFactory.makeKeyword("RESOURCE");
        $sym127$MIN_PREDICATES = SubLObjectFactory.makeSymbol("MIN-PREDICATES");
        $str128$Returns_the_most_specific_predica = SubLObjectFactory.makeString("Returns the most-specific predicates in PREDS");
        $sym129$MAX_PREDICATES = SubLObjectFactory.makeSymbol("MAX-PREDICATES");
        $str130$Returns_the_most_general_predicat = SubLObjectFactory.makeString("Returns the most-general predicates in PREDS");
        $sym131$MIN_CEILING_PREDICATES = SubLObjectFactory.makeSymbol("MIN-CEILING-PREDICATES");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str133$Returns_the_most_specific_common_ = SubLObjectFactory.makeString("Returns the most-specific common generalizations (ceilings) of PREDS");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED1"), (SubLObject)SubLObjectFactory.makeSymbol("PRED2"));
        $sym135$MAX_FLOOR_PREDICATES = SubLObjectFactory.makeSymbol("MAX-FLOOR-PREDICATES");
        $str136$Returns_the_most_general_common_s = SubLObjectFactory.makeString("Returns the most-general common specializations (floors) of PREDS");
        $sym137$GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("GENL-PREDICATE?");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str139$Is_GENL_a_genlPred_of_SPEC______a = SubLObjectFactory.makeString("Is GENL a genlPred of SPEC?\n   (ascending transitive search; inexpensive)");
        $list140 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym142$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const143$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym144$SPEC_PREDICATE_ = SubLObjectFactory.makeSymbol("SPEC-PREDICATE?");
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $list146 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $sym147$GENL_INVERSE_ = SubLObjectFactory.makeSymbol("GENL-INVERSE?");
        $str148$Is_GENL_a_genlInverse_of_SPEC____ = SubLObjectFactory.makeString("Is GENL a genlInverse of SPEC?\n   (ascending transitive search; inexpensive)");
        $sym149$SPEC_INVERSE_ = SubLObjectFactory.makeSymbol("SPEC-INVERSE?");
        $sym150$ANY_GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("ANY-GENL-PREDICATE?");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str152$Returns_T_iff__genl_predicate__SP = SubLObjectFactory.makeString("Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS\n   (ascending transitive search; inexpensive)");
        $list153 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym154$NOT_GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("NOT-GENL-PREDICATE?");
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-GENL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str156$Is_NOT_GENL_known_to_be_not_a_gen = SubLObjectFactory.makeString("Is NOT-GENL known to be not a genlPred of SPEC?\n   (descending transitive search; expensive)");
        $list157 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOT-GENL"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $sym158$NOT_GENL_INVERSE_ = SubLObjectFactory.makeSymbol("NOT-GENL-INVERSE?");
        $str159$Is_NOT_GENL_a_negated_genlInverse = SubLObjectFactory.makeString("Is NOT-GENL a negated genlInverse of SPEC?\n   (descending transitive search; expensive)");
        $sym160$ANY_NOT_GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("ANY-NOT-GENL-PREDICATE?");
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str162$Is_any_predicate_in_NOT_GENLS_not = SubLObjectFactory.makeString("Is any predicate in NOT-GENLS not a genlPred of PRED?\n   (descending transitive search; expensive)");
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOT-GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym164$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym165$TV_P = SubLObjectFactory.makeSymbol("TV-P");
        $sym166$INTERSECTING_PREDICATES_ = SubLObjectFactory.makeSymbol("INTERSECTING-PREDICATES?");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED1"), (SubLObject)SubLObjectFactory.makeSymbol("PRED2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str168$Does_the_extension_of_PRED1_inclu = SubLObjectFactory.makeString("Does the extension of PRED1 include some tuple in the extension of PRED2?");
        $list169 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED1"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED2"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $sym170$WHY_GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("WHY-GENL-PREDICATE?");
        $list171 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("BEHAVIOR"));
        $str172$A_justification_of__genlPreds_SPE = SubLObjectFactory.makeString("A justification of (genlPreds SPEC GENL)");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym174$WHY_NOT_GENL_PREDICATE_ = SubLObjectFactory.makeSymbol("WHY-NOT-GENL-PREDICATE?");
        $str175$A_justification_of__not__genlPred = SubLObjectFactory.makeString("A justification of (not (genlPreds SPEC GENL))");
        $sym176$WHY_GENL_INVERSE_ = SubLObjectFactory.makeSymbol("WHY-GENL-INVERSE?");
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-INVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("BEHAVIOR"));
        $str178$A_justification_of__genlInverse_P = SubLObjectFactory.makeString("A justification of (genlInverse PRED GENL-INVERSE)");
        $list179 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-INVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $const180$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $sym181$WHY_NOT_GENL_INVERSE_ = SubLObjectFactory.makeSymbol("WHY-NOT-GENL-INVERSE?");
        $str182$A_justification_of__not__genlInve = SubLObjectFactory.makeString("A justification of (not (genlInverse SPEC GENL)");
        $kw183$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $sym184$MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS = SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-GENL-PREDICATE-PATHS");
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str186$_return_listp__In_what__most_genl = SubLObjectFactory.makeString("@return listp; In what (most-genl) mts is GENL a genlPred of SPEC?");
        $sym187$MAX_FLOOR_MTS_OF_GENL_INVERSE_PATHS = SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-OF-GENL-INVERSE-PATHS");
        $list188 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-INVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $str189$In_what__most_genl__mts_is_GENL_I = SubLObjectFactory.makeString("In what (most-genl) mts is GENL-INVERSE a genlInverse of SPEC?");
        $list190 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-INVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $sym191$CACHED_CANDIDATE_GENL_PREDS = SubLObjectFactory.makeSymbol("CACHED-CANDIDATE-GENL-PREDS");
        $sym192$_CACHED_CANDIDATE_GENL_PREDS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-CANDIDATE-GENL-PREDS-CACHING-STATE*");
        $int193$512 = SubLObjectFactory.makeInteger(512);
        $int194$64 = SubLObjectFactory.makeInteger(64);
        $sym195$CACHED_CANDIDATE_GENL_PREDS_IN_MT = SubLObjectFactory.makeSymbol("CACHED-CANDIDATE-GENL-PREDS-IN-MT");
        $sym196$_CACHED_CANDIDATE_GENL_PREDS_IN_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-CANDIDATE-GENL-PREDS-IN-MT-CACHING-STATE*");
        $kw197$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw198$GENL = SubLObjectFactory.makeKeyword("GENL");
        $sym199$CANDIDATE_PREDS_FOR_ARG_ISA = SubLObjectFactory.makeSymbol("CANDIDATE-PREDS-FOR-ARG-ISA");
        $sym200$CANDIDATE_PREDS_FOR_ARG_GENL = SubLObjectFactory.makeSymbol("CANDIDATE-PREDS-FOR-ARG-GENL");
        $sym201$MAX = SubLObjectFactory.makeSymbol("MAX");
        $sym202$ARITY = SubLObjectFactory.makeSymbol("ARITY");
        $sym203$GENL_PREDICATE_AFTER_ADDING = SubLObjectFactory.makeSymbol("GENL-PREDICATE-AFTER-ADDING");
        $sym204$ADD_GENL_PREDICATE = SubLObjectFactory.makeSymbol("ADD-GENL-PREDICATE");
        $sym205$GENL_INVERSE_AFTER_ADDING = SubLObjectFactory.makeSymbol("GENL-INVERSE-AFTER-ADDING");
        $sym206$ADD_GENL_INVERSE = SubLObjectFactory.makeSymbol("ADD-GENL-INVERSE");
        $sym207$REMOVE_GENL_PREDICATE = SubLObjectFactory.makeSymbol("REMOVE-GENL-PREDICATE");
        $sym208$REMOVE_GENL_INVERSE = SubLObjectFactory.makeSymbol("REMOVE-GENL-INVERSE");
        $sym209$GENL_PREDICATE_AFTER_REMOVING = SubLObjectFactory.makeSymbol("GENL-PREDICATE-AFTER-REMOVING");
        $sym210$GENL_INVERSE_AFTER_REMOVING = SubLObjectFactory.makeSymbol("GENL-INVERSE-AFTER-REMOVING");
    }
}

/*

	Total time: 2153 ms
	 synthetic 
*/