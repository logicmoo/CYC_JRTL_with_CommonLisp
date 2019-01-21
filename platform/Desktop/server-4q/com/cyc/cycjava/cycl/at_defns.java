package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class at_defns extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.at_defns";
    public static final String myFingerPrint = "975a5bf585fcd3fa4ab472fcc84270433a7a51d147c6ca04d18ef1d35273d97b";
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 6750L)
    public static SubLSymbol $use_new_defns_functionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 7004L)
    public static SubLSymbol $old_defns_admitP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 8056L)
    public static SubLSymbol $old_defns_rejectP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 9209L)
    public static SubLSymbol $defining_defns_status_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 10494L)
    public static SubLSymbol $sufficient_defns_admitP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 13767L)
    public static SubLSymbol $necessary_defns_rejectP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 15954L)
    public static SubLSymbol $rejected_by_necessary_defns_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 19225L)
    public static SubLSymbol $old_quoted_defns_admitP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 20104L)
    public static SubLSymbol $old_quoted_defns_rejectP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 20577L)
    public static SubLSymbol $quoted_defining_defns_status_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 21264L)
    public static SubLSymbol $quoted_sufficient_defns_admitP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 21653L)
    public static SubLSymbol $quoted_necessary_defns_rejectP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 23097L)
    public static SubLSymbol $rejected_by_quoted_necessary_defns_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 29441L)
    public static SubLSymbol $defn_admits_intP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 33052L)
    public static SubLSymbol $quoted_defn_admits_intP_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 33675L)
    private static SubLSymbol $defn_cyc_evaluate_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 49329L)
    private static SubLSymbol $cat_defns_failing$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 62492L)
    public static SubLSymbol $cache_suf_defn_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 62606L)
    public static SubLSymbol $uncache_suf_defn_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 63667L)
    public static SubLSymbol $old_handle_added_genl_for_suf_defns_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 64171L)
    public static SubLSymbol $old_handle_removed_genl_for_suf_defns_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 75220L)
    public static SubLSymbol $cache_suf_quoted_defn_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 75348L)
    public static SubLSymbol $uncache_suf_quoted_defn_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 76521L)
    public static SubLSymbol $old_handle_added_genl_for_suf_quoted_defns_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 77067L)
    public static SubLSymbol $old_handle_removed_genl_for_suf_quoted_defns_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 87350L)
    public static SubLSymbol $cache_suf_function_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 87482L)
    public static SubLSymbol $uncache_suf_function_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 88889L)
    public static SubLSymbol $handle_added_genl_for_suf_functions_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 89234L)
    public static SubLSymbol $handle_removed_genl_for_suf_functions_meters$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 98681L)
    private static SubLSymbol $suf_function_cache_mal_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 98776L)
    private static SubLSymbol $suf_function_cache_key_wXo_value$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 98886L)
    private static SubLSymbol $suf_function_cache_key_wXmal_value$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 99006L)
    private static SubLSymbol $suf_function_cache_key_wXstale_value$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 99143L)
    private static SubLSymbol $suf_function_cache_keys_wXo_inerited_value$;
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 99279L)
    private static SubLSymbol $suf_function_cache_awol_direct_assertions$;
    private static final SubLString $str0$___remove_sufficent_defn__a__a_;
    private static final SubLSymbol $kw1$ADMITTED;
    private static final SubLSymbol $kw2$REJECTED;
    private static final SubLSymbol $sym3$_OLD_DEFNS_ADMIT__METERS_;
    private static final SubLSymbol $kw4$CALLS;
    private static final SubLSymbol $kw5$TIMES;
    private static final SubLSymbol $kw6$RESULTS;
    private static final SubLSymbol $kw7$ARGS;
    private static final SubLSymbol $kw8$ARG_LIST;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$FUNCTION;
    private static final SubLSymbol $sym11$OLD_DEFNS_ADMIT_;
    private static final SubLSymbol $kw12$RESET;
    private static final SubLSymbol $sym13$RESET_OLD_DEFNS_ADMIT__METERS;
    private static final SubLSymbol $sym14$_OLD_DEFNS_REJECT__METERS_;
    private static final SubLSymbol $sym15$OLD_DEFNS_REJECT_;
    private static final SubLSymbol $sym16$RESET_OLD_DEFNS_REJECT__METERS;
    private static final SubLSymbol $sym17$_DEFINING_DEFNS_STATUS_METERS_;
    private static final SubLSymbol $sym18$DEFINING_DEFNS_STATUS;
    private static final SubLSymbol $sym19$RESET_DEFINING_DEFNS_STATUS_METERS;
    private static final SubLObject $const20$defnIff;
    private static final SubLSymbol $kw21$TRUE;
    private static final SubLSymbol $kw22$VIA_GENL_PRED;
    private static final SubLSymbol $kw23$AT_CONSTRAINT_GAF;
    private static final SubLSymbol $kw24$MAL_ARG_WRT_QUOTED_IFF_DEFN;
    private static final SubLSymbol $kw25$MAL_ARG_WRT_IFF_DEFN;
    private static final SubLSymbol $sym26$_SUFFICIENT_DEFNS_ADMIT__METERS_;
    private static final SubLSymbol $sym27$SUFFICIENT_DEFNS_ADMIT_;
    private static final SubLSymbol $sym28$RESET_SUFFICIENT_DEFNS_ADMIT__METERS;
    private static final SubLSymbol $kw29$MAL_ARG_WRT_QUOTED_SUF_DEFNS;
    private static final SubLSymbol $kw30$MAL_ARG_WRT_SUF_DEFNS;
    private static final SubLSymbol $sym31$_NECESSARY_DEFNS_REJECT__METERS_;
    private static final SubLSymbol $sym32$NECESSARY_DEFNS_REJECT_;
    private static final SubLSymbol $sym33$RESET_NECESSARY_DEFNS_REJECT__METERS;
    private static final SubLSymbol $kw34$BREADTH;
    private static final SubLSymbol $kw35$QUEUE;
    private static final SubLSymbol $kw36$STACK;
    private static final SubLSymbol $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw38$ERROR;
    private static final SubLString $str39$_A_is_not_a__A;
    private static final SubLSymbol $sym40$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw41$CERROR;
    private static final SubLString $str42$continue_anyway;
    private static final SubLSymbol $kw43$WARN;
    private static final SubLString $str44$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const45$genls;
    private static final SubLList $list46;
    private static final SubLString $str47$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str48$attempting_to_bind_direction_link;
    private static final SubLString $str49$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $kw50$GAF;
    private static final SubLSymbol $sym51$_REJECTED_BY_NECESSARY_DEFNS_METERS_;
    private static final SubLSymbol $sym52$REJECTED_BY_NECESSARY_DEFNS;
    private static final SubLSymbol $sym53$RESET_REJECTED_BY_NECESSARY_DEFNS_METERS;
    private static final SubLObject $const54$defnNecessary;
    private static final SubLSymbol $kw55$MAL_ARG_WRT_QUOTED_NEC_DEFN;
    private static final SubLSymbol $kw56$MAL_ARG_WRT_NEC_DEFN;
    private static final SubLSymbol $sym57$_OLD_QUOTED_DEFNS_ADMIT__METERS_;
    private static final SubLSymbol $sym58$OLD_QUOTED_DEFNS_ADMIT_;
    private static final SubLSymbol $sym59$RESET_OLD_QUOTED_DEFNS_ADMIT__METERS;
    private static final SubLSymbol $sym60$_OLD_QUOTED_DEFNS_REJECT__METERS_;
    private static final SubLSymbol $sym61$OLD_QUOTED_DEFNS_REJECT_;
    private static final SubLSymbol $sym62$RESET_OLD_QUOTED_DEFNS_REJECT__METERS;
    private static final SubLSymbol $sym63$_QUOTED_DEFINING_DEFNS_STATUS_METERS_;
    private static final SubLSymbol $sym64$QUOTED_DEFINING_DEFNS_STATUS;
    private static final SubLSymbol $sym65$RESET_QUOTED_DEFINING_DEFNS_STATUS_METERS;
    private static final SubLObject $const66$quotedDefnIff;
    private static final SubLSymbol $sym67$_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS_;
    private static final SubLSymbol $sym68$QUOTED_SUFFICIENT_DEFNS_ADMIT_;
    private static final SubLSymbol $sym69$RESET_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS;
    private static final SubLSymbol $sym70$_QUOTED_NECESSARY_DEFNS_REJECT__METERS_;
    private static final SubLSymbol $sym71$QUOTED_NECESSARY_DEFNS_REJECT_;
    private static final SubLSymbol $sym72$RESET_QUOTED_NECESSARY_DEFNS_REJECT__METERS;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS_;
    private static final SubLSymbol $sym75$REJECTED_BY_QUOTED_NECESSARY_DEFNS;
    private static final SubLSymbol $sym76$RESET_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS;
    private static final SubLObject $const77$quotedDefnNecessary;
    private static final SubLString $str78$defn_stack_consistency_error___Ex;
    private static final SubLString $str79$recursive_call_of_defn__a_with_ar;
    private static final SubLSymbol $sym80$_DEFN_ADMITS_INT__METERS_;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$DEFN_ADMITS_INT_;
    private static final SubLSymbol $sym83$RESET_DEFN_ADMITS_INT__METERS;
    private static final SubLString $str84$__defn_test__term__s__defn__s_of_;
    private static final SubLString $str85$__defn_test__term__s__defn__s_of_;
    private static final SubLString $str86$recursive_call_of_quoted_defn__a_;
    private static final SubLSymbol $sym87$_QUOTED_DEFN_ADMITS_INT__METERS_;
    private static final SubLSymbol $sym88$QUOTED_DEFN_ADMITS_INT_;
    private static final SubLSymbol $sym89$RESET_QUOTED_DEFN_ADMITS_INT__METERS;
    private static final SubLSymbol $sym90$DEFN_CYC_EVALUATE;
    private static final SubLSymbol $sym91$_DEFN_CYC_EVALUATE_CACHING_STATE_;
    private static final SubLInteger $int92$24;
    private static final SubLString $str93$_s_has_invalid_defn___s;
    private static final SubLString $str94$invalid_defn___s;
    private static final SubLString $str95$_s_has_non_viable_defn___s;
    private static final SubLString $str96$non_viable_defn___s;
    private static final SubLSymbol $sym97$CYC_VAR_;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$_EXIT;
    private static final SubLSymbol $sym100$QUIET_HAS_TYPE_MEMOIZED_;
    private static final SubLObject $const101$InferencePSC;
    private static final SubLObject $const102$Function_Denotational;
    private static final SubLObject $const103$SpecsFn;
    private static final SubLObject $const104$Thing;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const107$EverythingPSC;
    private static final SubLSymbol $kw108$ISA;
    private static final SubLObject $const109$isa;
    private static final SubLSymbol $kw110$GENLS;
    private static final SubLSymbol $kw111$DEFN;
    private static final SubLSymbol $kw112$DISJOINTWITH;
    private static final SubLObject $const113$disjointWith;
    private static final SubLObject $const114$quotedIsa;
    private static final SubLInteger $int115$64;
    private static final SubLObject $const116$defnSufficient;
    private static final SubLSymbol $sym117$COLLECTIONS_ADMITTING_TERM_VIA_DEFNS_1;
    private static final SubLSymbol $sym118$GATHER_COLLECTIONS_ADMITTING_VIA_DEFNS;
    private static final SubLString $str119$__warn__;
    private static final SubLSymbol $sym120$WARN;
    private static final SubLString $str121$____defn_module_meters_;
    private static final SubLInteger $int122$27;
    private static final SubLString $str123$_;
    private static final SubLString $str124$_____a__;
    private static final SubLString $str125$function;
    private static final SubLString $str126$___calls___;
    private static final SubLString $str127$___total_time___;
    private static final SubLString $str128$____avg_time____;
    private static final SubLString $str129$_s;
    private static final SubLSymbol $sym130$_;
    private static final SubLString $str131$____a___;
    private static final SubLString $str132$_a;
    private static final SubLString $str133$_;
    private static final SubLInteger $int134$46;
    private static final SubLString $str135$_s_;
    private static final SubLString $str136$_____a;
    private static final SubLInteger $int137$37;
    private static final SubLString $str138$______call__;
    private static final SubLString $str139$____a___;
    private static final SubLString $str140$____result____;
    private static final SubLString $str141$_____time_____;
    private static final SubLString $str142$____a;
    private static final SubLString $str143$total;
    private static final SubLSymbol $sym144$KBEQ;
    private static final SubLSymbol $sym145$ADD_SUF_DEFN;
    private static final SubLSymbol $sym146$ADD_IFF_DEFN;
    private static final SubLSymbol $sym147$RELEVANT_MT_IS_GENL_MT;
    private static final SubLString $str148$skip_defn_op;
    private static final SubLString $str149$_s_is_not_a_collection_in__s;
    private static final SubLString $str150$_s_is_not_a_symbol;
    private static final SubLSymbol $sym151$OLD_ADD_SUF_DEFN;
    private static final SubLSymbol $sym152$REMOVE_SUF_DEFN;
    private static final SubLSymbol $sym153$REMOVE_IFF_DEFN;
    private static final SubLSymbol $sym154$OLD_REMOVE_SUF_DEFN;
    private static final SubLSymbol $sym155$_CACHE_SUF_DEFN_METERS_;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$CACHE_SUF_DEFN;
    private static final SubLSymbol $sym158$RESET_CACHE_SUF_DEFN_METERS;
    private static final SubLSymbol $sym159$_UNCACHE_SUF_DEFN_METERS_;
    private static final SubLSymbol $sym160$UNCACHE_SUF_DEFN;
    private static final SubLSymbol $sym161$RESET_UNCACHE_SUF_DEFN_METERS;
    private static final SubLString $str162$___add_sufficent_defn__a__a_;
    private static final SubLString $str163$removed_sufficient_defn_not_found;
    private static final SubLSymbol $sym164$_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_;
    private static final SubLList $list165;
    private static final SubLSymbol $sym166$OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS;
    private static final SubLSymbol $sym167$RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS;
    private static final SubLSymbol $sym168$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_;
    private static final SubLSymbol $sym169$OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS;
    private static final SubLSymbol $sym170$RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS;
    private static final SubLSymbol $sym171$ADD_SUF_DEFN_ASSERTION;
    private static final SubLSymbol $sym172$REMOVE_SUF_DEFN_ASSERTION;
    private static final SubLSymbol $sym173$MERGE_SUF_DEFN_ASSERTIONS;
    private static final SubLSymbol $sym174$REMOVE_SUF_DEFN_ASSERTIONS;
    private static final SubLSymbol $sym175$VALID_ASSERTION;
    private static final SubLSymbol $sym176$_;
    private static final SubLSymbol $sym177$ARG1_SPEC_CARDINALITY;
    private static final SubLList $list178;
    private static final SubLString $str179$Initializing_sufficient_defns_cac;
    private static final SubLSymbol $sym180$ADD_SUF_QUOTED_DEFN;
    private static final SubLSymbol $sym181$ADD_IFF_QUOTED_DEFN;
    private static final SubLString $str182$skip_quoted_defn_op;
    private static final SubLSymbol $sym183$OLD_ADD_SUF_QUOTED_DEFN;
    private static final SubLSymbol $sym184$REMOVE_SUF_QUOTED_DEFN;
    private static final SubLSymbol $sym185$REMOVE_IFF_QUOTED_DEFN;
    private static final SubLSymbol $sym186$OLD_REMOVE_SUF_QUOTED_DEFN;
    private static final SubLSymbol $sym187$_CACHE_SUF_QUOTED_DEFN_METERS_;
    private static final SubLSymbol $sym188$CACHE_SUF_QUOTED_DEFN;
    private static final SubLSymbol $sym189$RESET_CACHE_SUF_QUOTED_DEFN_METERS;
    private static final SubLSymbol $sym190$_UNCACHE_SUF_QUOTED_DEFN_METERS_;
    private static final SubLSymbol $sym191$UNCACHE_SUF_QUOTED_DEFN;
    private static final SubLSymbol $sym192$RESET_UNCACHE_SUF_QUOTED_DEFN_METERS;
    private static final SubLString $str193$___add_sufficent_quoted_defn__a__;
    private static final SubLString $str194$removed_sufficient_quoted_defn_no;
    private static final SubLString $str195$___remove_sufficent_quoted_defn__;
    private static final SubLSymbol $sym196$_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
    private static final SubLSymbol $sym197$OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS;
    private static final SubLSymbol $sym198$RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS;
    private static final SubLSymbol $sym199$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
    private static final SubLSymbol $sym200$OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS;
    private static final SubLSymbol $sym201$RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS;
    private static final SubLSymbol $sym202$ADD_SUF_QUOTED_DEFN_ASSERTION;
    private static final SubLSymbol $sym203$REMOVE_SUF_QUOTED_DEFN_ASSERTION;
    private static final SubLSymbol $sym204$MERGE_SUF_QUOTED_DEFN_ASSERTIONS;
    private static final SubLSymbol $sym205$REMOVE_SUF_QUOTED_DEFN_ASSERTIONS;
    private static final SubLList $list206;
    private static final SubLString $str207$Initializing_sufficient_quoted_de;
    private static final SubLSymbol $kw208$QUOTED_ISA;
    private static final SubLSymbol $sym209$ADD_SUF_FUNCTION;
    private static final SubLSymbol $sym210$REMOVE_SUF_FUNCTION;
    private static final SubLSymbol $sym211$ADD_SUF_QUOTED_FUNCTION;
    private static final SubLSymbol $sym212$REMOVE_SUF_QUOTED_FUNCTION;
    private static final SubLObject $const213$evaluationResultQuotedIsa;
    private static final SubLString $str214$oh_well___;
    private static final SubLString $str215$_s_is_not_a_evaluatable_functor_i;
    private static final SubLString $str216$_s_is_not_a_functor_in__s;
    private static final SubLSymbol $sym217$ADD_SUF_FUNCTION_INT;
    private static final SubLSymbol $sym218$REMOVE_SUF_FUNCTION_INT;
    private static final SubLSymbol $sym219$_CACHE_SUF_FUNCTION_METERS_;
    private static final SubLList $list220;
    private static final SubLSymbol $sym221$CACHE_SUF_FUNCTION;
    private static final SubLSymbol $sym222$RESET_CACHE_SUF_FUNCTION_METERS;
    private static final SubLSymbol $sym223$_UNCACHE_SUF_FUNCTION_METERS_;
    private static final SubLSymbol $sym224$UNCACHE_SUF_FUNCTION;
    private static final SubLSymbol $sym225$RESET_UNCACHE_SUF_FUNCTION_METERS;
    private static final SubLString $str226$____a__a__a_;
    private static final SubLString $str227$add_sufficient_function;
    private static final SubLString $str228$add_sufficient_quoted_function;
    private static final SubLString $str229$removed_sufficient_function_not_f;
    private static final SubLString $str230$remove_sufficient_function;
    private static final SubLString $str231$remove_sufficient_quoted_function;
    private static final SubLSymbol $sym232$_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS_;
    private static final SubLSymbol $sym233$HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS;
    private static final SubLSymbol $sym234$RESET_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS;
    private static final SubLList $list235;
    private static final SubLSymbol $sym236$_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS_;
    private static final SubLSymbol $sym237$HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS;
    private static final SubLSymbol $sym238$RESET_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS;
    private static final SubLSymbol $sym239$ADD_SUF_FUNCTION_ASSERTION;
    private static final SubLSymbol $sym240$ADD_SUF_QUOTED_FUNCTION_ASSERTION;
    private static final SubLSymbol $sym241$REMOVE_SUF_FUNCTION_ASSERTION;
    private static final SubLSymbol $sym242$REMOVE_SUF_QUOTED_FUNCTION_ASSERTION;
    private static final SubLSymbol $sym243$MERGE_SUF_FUNCTION_ASSERTIONS;
    private static final SubLSymbol $sym244$MERGE_SUF_QUOTED_FUNCTION_ASSERTIONS;
    private static final SubLSymbol $sym245$REMOVE_SUF_FUNCTION_ASSERTIONS;
    private static final SubLSymbol $sym246$REMOVE_SUF_QUOTED_FUNCTION_ASSERTIONS;
    private static final SubLString $str247$___add_sufficent_function__a__a_;
    private static final SubLString $str248$remove_sufficent_function;
    private static final SubLSymbol $sym249$SUF_FUNCTION_SORT_PRED;
    private static final SubLSymbol $sym250$GAF_ARG2;
    private static final SubLList $list251;
    private static final SubLList $list252;
    private static final SubLString $str253$Initializing_sufficient_functions;
    private static final SubLString $str254$Initializing_sufficient_quoted_fu;
    private static final SubLString $str255$cdohash;
    private static final SubLString $str256$stop;
    private static final SubLSymbol $kw257$MAPPING_DONE;
    private static final SubLString $str258$diagnostics__sufficient_functions;
    private static final SubLString $str259$___suf_function_cache_mal_keys___;
    private static final SubLString $str260$___suf_function_cache_key_w_o_val;
    private static final SubLString $str261$___suf_function_cache_key_w_mal_v;
    private static final SubLString $str262$___suf_function_cache_key_w_stale;
    private static final SubLString $str263$___suf_function_cache_keys_w_o_in;
    private static final SubLString $str264$___suf_function_cache_awol_direct;
    private static final SubLObject $const265$SkolemFunction;
    private static final SubLString $str266$mapping_skolems;
    private static final SubLString $str267$cdolist;
    private static final SubLString $str268$_a_;
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 818L)
    public static SubLObject suf_defn_cache_as_alist() {
        return defns.defns_cache_hash_table_to_alist(defns.$suf_defn_cache_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 1017L)
    public static SubLObject suf_defn_cache_get(final SubLObject collection) {
        return defns.defns_cache_gethash_without_values(collection, defns.$suf_defn_cache_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 1146L)
    public static SubLObject suf_defn_cache_add(final SubLObject col, final SubLObject assertion) {
        final SubLObject new_val = suf_defn_sort((SubLObject)ConsesLow.cons(assertion, defns.defns_cache_gethash_without_values(col, defns.$suf_defn_cache_index$.getGlobalValue())));
        if (at_defns.NIL != new_val) {
            defns.defns_cache_sethash(col, defns.$suf_defn_cache_index$.getGlobalValue(), new_val);
        }
        return new_val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 1412L)
    public static SubLObject suf_defn_cache_rem(final SubLObject col, final SubLObject assertion) {
        final SubLObject new_val = suf_defn_sort(Sequences.delete(assertion, defns.defns_cache_gethash_without_values(col, defns.$suf_defn_cache_index$.getGlobalValue()), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        if (at_defns.NIL != new_val) {
            defns.defns_cache_sethash(col, defns.$suf_defn_cache_index$.getGlobalValue(), new_val);
        }
        else {
            defns.defns_cache_remhash(col, defns.$suf_defn_cache_index$.getGlobalValue());
        }
        return new_val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 1732L)
    public static SubLObject suf_defn_cache_merge(final SubLObject collection, final SubLObject defn_assertions) {
        return defns.defns_cache_sethash(collection, defns.$suf_defn_cache_index$.getGlobalValue(), suf_defn_sort(conses_high.nunion(defns.defns_cache_gethash_without_values(collection, defns.$suf_defn_cache_index$.getGlobalValue()), conses_high.copy_list(defn_assertions), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 2005L)
    public static SubLObject remove_suf_defn_assertions(final SubLObject collection, SubLObject defn_assertions) {
        if (defn_assertions == at_defns.UNPROVIDED) {
            defn_assertions = at_vars.$at_defns$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL == defn_genl_searchedP(collection)) {
            final SubLObject assertions = suf_defn_cache_get(collection);
            if (at_defns.NIL != assertions) {
                SubLObject assertions_to_remove = (SubLObject)at_defns.NIL;
                SubLObject cdolist_list_var = defn_assertions;
                SubLObject assertion = (SubLObject)at_defns.NIL;
                assertion = cdolist_list_var.first();
                while (at_defns.NIL != cdolist_list_var) {
                    if (at_defns.NIL == assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED) || at_defns.NIL == genls.genlP(assertions_high.gaf_arg1(assertion), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                        assertions_to_remove = (SubLObject)ConsesLow.cons(assertion, assertions_to_remove);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
                if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE((SubLObject)at_defns.FOUR_INTEGER)) {
                    cdolist_list_var = assertions_to_remove;
                    assertion = (SubLObject)at_defns.NIL;
                    assertion = cdolist_list_var.first();
                    while (at_defns.NIL != cdolist_list_var) {
                        defn_note((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str0$___remove_sufficent_defn__a__a_, collection, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
                final SubLObject new_value = suf_defn_sort(conses_high.nset_difference(assertions, assertions_to_remove, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                if (at_defns.NIL != new_value) {
                    defns.defns_cache_sethash(collection, defns.$suf_defn_cache_index$.getGlobalValue(), new_value);
                }
                else {
                    defns.defns_cache_remhash(collection, defns.$suf_defn_cache_index$.getGlobalValue());
                }
                return new_value;
            }
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 2886L)
    public static SubLObject clear_suf_defns() {
        defns.defns_cache_clrhash(defns.$suf_defn_cache_index$.getGlobalValue());
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 3017L)
    public static SubLObject sort_suf_defn_cache() {
        final SubLObject cdohash_table = defns.get_defn_cache_from_index(defns.$suf_defn_cache_index$.getGlobalValue());
        SubLObject fort = (SubLObject)at_defns.NIL;
        SubLObject suf_defn_assertions = (SubLObject)at_defns.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                fort = Hashtables.getEntryKey(cdohash_entry);
                suf_defn_assertions = Hashtables.getEntryValue(cdohash_entry);
                defns.defns_cache_sethash(fort, defns.$suf_defn_cache_index$.getGlobalValue(), suf_defn_sort(suf_defn_assertions));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 3234L)
    public static SubLObject suf_quoted_defn_cache_as_alist() {
        return defns.defns_cache_hash_table_to_alist(defns.$suf_quoted_defn_cache_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 3394L)
    public static SubLObject suf_quoted_defn_cache_get(final SubLObject collection) {
        return defns.defns_cache_gethash_without_values(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 3537L)
    public static SubLObject suf_quoted_defn_cache_add(final SubLObject col, final SubLObject assertion) {
        final SubLObject new_val = suf_defn_sort((SubLObject)ConsesLow.cons(assertion, defns.defns_cache_gethash_without_values(col, defns.$suf_quoted_defn_cache_index$.getGlobalValue())));
        if (at_defns.NIL != new_val) {
            defns.defns_cache_sethash(col, defns.$suf_quoted_defn_cache_index$.getGlobalValue(), new_val);
        }
        return new_val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 3824L)
    public static SubLObject suf_quoted_defn_cache_rem(final SubLObject col, final SubLObject assertion) {
        final SubLObject new_val = suf_defn_sort(Sequences.delete(assertion, defns.defns_cache_gethash_without_values(col, defns.$suf_quoted_defn_cache_index$.getGlobalValue()), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        if (at_defns.NIL != new_val) {
            defns.defns_cache_sethash(col, defns.$suf_quoted_defn_cache_index$.getGlobalValue(), new_val);
        }
        else {
            defns.defns_cache_remhash(col, defns.$suf_quoted_defn_cache_index$.getGlobalValue());
        }
        return new_val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 4172L)
    public static SubLObject suf_quoted_defn_cache_merge(final SubLObject collection, final SubLObject defn_assertions) {
        return defns.defns_cache_sethash(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue(), suf_defn_sort(conses_high.nunion(defns.defns_cache_gethash_without_values(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue()), conses_high.copy_list(defn_assertions), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 4467L)
    public static SubLObject remove_suf_quoted_defn_assertions(final SubLObject collection, SubLObject defn_assertions) {
        if (defn_assertions == at_defns.UNPROVIDED) {
            defn_assertions = at_vars.$at_defns$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL == defn_genl_searchedP(collection)) {
            final SubLObject assertions = defns.defns_cache_gethash_without_values(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue());
            if (at_defns.NIL != assertions) {
                SubLObject assertions_to_remove = (SubLObject)at_defns.NIL;
                SubLObject cdolist_list_var = defn_assertions;
                SubLObject assertion = (SubLObject)at_defns.NIL;
                assertion = cdolist_list_var.first();
                while (at_defns.NIL != cdolist_list_var) {
                    if (at_defns.NIL == assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED) || at_defns.NIL == genls.genlP(assertions_high.gaf_arg1(assertion), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                        assertions_to_remove = (SubLObject)ConsesLow.cons(assertion, assertions_to_remove);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
                if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE((SubLObject)at_defns.FOUR_INTEGER)) {
                    cdolist_list_var = assertions_to_remove;
                    assertion = (SubLObject)at_defns.NIL;
                    assertion = cdolist_list_var.first();
                    while (at_defns.NIL != cdolist_list_var) {
                        defn_note((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str0$___remove_sufficent_defn__a__a_, collection, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
                final SubLObject new_value = suf_defn_sort(conses_high.nset_difference(assertions, assertions_to_remove, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                if (at_defns.NIL != new_value) {
                    defns.defns_cache_sethash(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue(), new_value);
                }
                else {
                    defns.defns_cache_remhash(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue());
                }
                return new_value;
            }
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 5415L)
    public static SubLObject clear_suf_quoted_defns() {
        defns.defns_cache_clrhash(defns.$suf_quoted_defn_cache_index$.getGlobalValue());
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 5560L)
    public static SubLObject sort_suf_quoted_defn_cache() {
        final SubLObject cdohash_table = defns.get_defn_cache_from_index(defns.$suf_quoted_defn_cache_index$.getGlobalValue());
        SubLObject fort = (SubLObject)at_defns.NIL;
        SubLObject suf_quoted_defn_assertions = (SubLObject)at_defns.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                fort = Hashtables.getEntryKey(cdohash_entry);
                suf_quoted_defn_assertions = Hashtables.getEntryValue(cdohash_entry);
                defns.defns_cache_sethash(fort, defns.$suf_quoted_defn_cache_index$.getGlobalValue(), suf_defn_sort(suf_quoted_defn_assertions));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 5812L)
    public static SubLObject at_defns_admitP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL == at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
            return (SubLObject)at_defns.NIL;
        }
        final SubLObject pcase_var = get_defn_col_history(collection);
        if (pcase_var.eql((SubLObject)at_defns.$kw1$ADMITTED)) {
            return (SubLObject)at_defns.T;
        }
        if (pcase_var.eql((SubLObject)at_defns.$kw2$REJECTED)) {
            return (SubLObject)at_defns.NIL;
        }
        final SubLObject admitsP = defns_admitP(collection, at_vars.$at_arg$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
        if (at_defns.NIL != admitsP) {
            set_defn_col_history(collection, (SubLObject)at_defns.$kw1$ADMITTED);
        }
        else {
            set_defn_col_history(collection, (SubLObject)at_defns.$kw2$REJECTED);
        }
        return admitsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 6317L)
    public static SubLObject at_defns_rejectP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL == at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
            return (SubLObject)at_defns.NIL;
        }
        final SubLObject pcase_var = get_defn_col_history(collection);
        if (pcase_var.eql((SubLObject)at_defns.$kw1$ADMITTED)) {
            return (SubLObject)at_defns.NIL;
        }
        if (pcase_var.eql((SubLObject)at_defns.$kw2$REJECTED)) {
            return (SubLObject)at_defns.T;
        }
        final SubLObject rejectsP = defns_rejectP(collection, at_vars.$at_arg$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
        if (at_defns.NIL != rejectsP) {
            set_defn_col_history(collection, (SubLObject)at_defns.$kw2$REJECTED);
        }
        else {
            set_defn_col_history(collection, (SubLObject)at_defns.$kw1$ADMITTED);
        }
        return rejectsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 6799L)
    public static SubLObject defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_defns_admitP(collection, v_term, mt);
        }
        return old_defns_admitP(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 7004L)
    public static SubLObject reset_old_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym11$OLD_DEFNS_ADMIT_);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 7004L)
    public static SubLObject old_defns_admitP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != isa.isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED)) {
            return (SubLObject)at_defns.T;
        }
        SubLObject admittedP = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = defining_defns_status(collection, v_term, mt);
                if (pcase_var.eql((SubLObject)at_defns.$kw1$ADMITTED)) {
                    admittedP = (SubLObject)at_defns.T;
                }
                else if (!pcase_var.eql((SubLObject)at_defns.$kw2$REJECTED)) {
                    admittedP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != suf_defn_assertions(collection) && (at_defns.NIL == at_vars.$at_apply_necessary_defnsP$.getDynamicValue(thread) || at_defns.NIL != necessary_defns_permitP(collection, v_term, mt)) && at_defns.NIL != sufficient_defns_admitP(collection, v_term, mt));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        if (at_defns.NIL == admittedP && at_defns.NIL != cycl_grammar.fast_quote_term_p(v_term)) {
            final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, (SubLObject)at_defns.UNPROVIDED);
            if (at_defns.NIL != denoted_term && at_defns.NIL != quoted_defns_admitP(collection, denoted_term, mt)) {
                admittedP = (SubLObject)at_defns.T;
            }
        }
        return admittedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 7004L)
    public static SubLObject old_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = old_defns_admitP_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return old_defns_admitP_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 7848L)
    public static SubLObject defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_defns_rejectP(collection, v_term, mt);
        }
        return old_defns_rejectP(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 8056L)
    public static SubLObject reset_old_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym15$OLD_DEFNS_REJECT_);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 8056L)
    public static SubLObject old_defns_rejectP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != isa.isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED)) {
            return (SubLObject)at_defns.NIL;
        }
        SubLObject rejected = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = defining_defns_status(collection, v_term, mt);
                if (!pcase_var.eql((SubLObject)at_defns.$kw1$ADMITTED)) {
                    if (pcase_var.eql((SubLObject)at_defns.$kw2$REJECTED)) {
                        rejected = (SubLObject)at_defns.T;
                    }
                    else {
                        rejected = necessary_defns_rejectP(collection, v_term, mt);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        if (at_defns.NIL == rejected && at_defns.NIL != cycl_grammar.fast_quote_term_p(v_term)) {
            final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, (SubLObject)at_defns.UNPROVIDED);
            if (at_defns.NIL != denoted_term && at_defns.NIL != quoted_defns_rejectP(collection, denoted_term, mt)) {
                rejected = (SubLObject)at_defns.T;
            }
        }
        return rejected;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 8056L)
    public static SubLObject old_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = old_defns_rejectP_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return old_defns_rejectP_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 8729L)
    public static SubLObject defining_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                result = defining_defns_status(collection, v_term, mt);
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return Equality.eq((SubLObject)at_defns.$kw1$ADMITTED, result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 8989L)
    public static SubLObject defining_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                result = defining_defns_status(collection, v_term, mt);
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return Equality.eq((SubLObject)at_defns.$kw2$REJECTED, result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 9209L)
    public static SubLObject reset_defining_defns_status_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym18$DEFINING_DEFNS_STATUS);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 9209L)
    public static SubLObject defining_defns_status_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_relevant_mts(collection, at_defns.$const20$defnIff, mt, (SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$kw21$TRUE));
        SubLObject status = (SubLObject)at_defns.NIL;
        if (at_defns.NIL != viable_defnP(defn, collection)) {
            final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
            try {
                at_vars.$defn_collection$.bind(collection, thread);
                if (at_defns.NIL != defn_admitsP(defn, v_term, collection, mt)) {
                    status = (SubLObject)at_defns.$kw1$ADMITTED;
                }
                else if (at_defns.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                    status = (SubLObject)at_defns.$kw2$REJECTED;
                    at_utilities.note_at_violation(defining_defn_violation_data(collection, v_term, defn, (SubLObject)at_defns.NIL, mt));
                }
                else {
                    status = (SubLObject)at_defns.$kw2$REJECTED;
                }
            }
            finally {
                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
            }
        }
        return status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 9209L)
    public static SubLObject defining_defns_status(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = defining_defns_status_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return defining_defns_status_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 9851L)
    public static SubLObject defining_defn_violation_data(final SubLObject collection, final SubLObject v_term, final SubLObject defn, final SubLObject quotedP, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = (SubLObject)at_defns.NIL;
        if (at_defns.NIL != at_vars.$at_source$.getDynamicValue(thread) && at_defns.NIL != at_vars.$at_reln$.getDynamicValue(thread) && !at_vars.$at_source$.getDynamicValue(thread).eql(at_vars.$at_reln$.getDynamicValue(thread))) {
            data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)at_defns.$kw22$VIA_GENL_PRED, at_vars.$at_source$.getDynamicValue(thread)), data);
        }
        if (at_defns.NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread) && at_defns.NIL != at_vars.$at_constraint_gaf$.getDynamicValue(thread)) {
            data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)at_defns.$kw23$AT_CONSTRAINT_GAF, at_vars.$at_constraint_gaf$.getDynamicValue(thread)), data);
        }
        if (at_defns.NIL != mt) {
            data = (SubLObject)ConsesLow.cons(mt, data);
        }
        else {
            data = (SubLObject)ConsesLow.cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
        }
        if (at_defns.NIL != quotedP) {
            return (SubLObject)ConsesLow.listS((SubLObject)at_defns.$kw24$MAL_ARG_WRT_QUOTED_IFF_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, defn, data });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)at_defns.$kw25$MAL_ARG_WRT_IFF_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, defn, data });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 10494L)
    public static SubLObject reset_sufficient_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym27$SUFFICIENT_DEFNS_ADMIT_);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 10494L)
    public static SubLObject sufficient_defns_admitP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        return sufficient_defns_admit_int(collection, v_term, suf_defn_assertions(collection), (SubLObject)at_defns.NIL, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 10494L)
    public static SubLObject sufficient_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = sufficient_defns_admitP_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return sufficient_defns_admitP_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 10695L)
    public static SubLObject sufficient_defns_admit_int(final SubLObject collection, final SubLObject v_term, final SubLObject defn_assertions, SubLObject quotedP, SubLObject mt) {
        if (quotedP == at_defns.UNPROVIDED) {
            quotedP = (SubLObject)at_defns.NIL;
        }
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admittedP = (SubLObject)at_defns.NIL;
        SubLObject failing_defns = (SubLObject)at_defns.NIL;
        SubLObject at_violations = (SubLObject)at_defns.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_violations$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            at_vars.$at_violations$.bind((SubLObject)at_defns.NIL, thread);
            if (at_defns.NIL == admittedP) {
                SubLObject csome_list_var = defn_assertions;
                SubLObject assertion = (SubLObject)at_defns.NIL;
                assertion = csome_list_var.first();
                while (at_defns.NIL == admittedP && at_defns.NIL != csome_list_var) {
                    if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED)) {
                        final SubLObject _prev_bind_0_$5 = at_vars.$defn_collection$.currentBinding(thread);
                        try {
                            at_vars.$defn_collection$.bind(assertions_high.gaf_arg1(assertion), thread);
                            final SubLObject defn_mt = assertions_high.assertion_mt(assertion);
                            if (at_defns.NIL != mt_relevance_macros.relevant_mtP(defn_mt) && at_defns.NIL != genls.genlP(at_vars.$defn_collection$.getDynamicValue(thread), collection, mt, (SubLObject)at_defns.UNPROVIDED)) {
                                final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                                    final SubLObject _prev_bind_0_$6 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$7 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$8 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                                    try {
                                        at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                                        at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                                        wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                                        wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                                        if (at_defns.NIL == quotedP && at_defns.NIL != defn_admitsP(defn, v_term, collection, mt)) {
                                            admittedP = (SubLObject)at_defns.T;
                                        }
                                        else if (at_defns.NIL != quotedP && at_defns.NIL != quoted_defn_admitsP(defn, v_term, collection, mt)) {
                                            admittedP = (SubLObject)at_defns.T;
                                        }
                                    }
                                    finally {
                                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
                                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2_$8, thread);
                                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1_$7, thread);
                                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    if (at_defns.NIL == admittedP && at_defns.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        final SubLObject item_var = at_vars.$defn_collection$.getDynamicValue(thread);
                                        if (at_defns.NIL == conses_high.member(item_var, failing_defns, Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
                                            failing_defns = (SubLObject)ConsesLow.cons(item_var, failing_defns);
                                        }
                                    }
                                }
                            }
                        }
                        finally {
                            at_vars.$defn_collection$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                }
            }
            if (at_defns.NIL == admittedP) {
                at_violations = at_vars.$at_violations$.getDynamicValue(thread);
            }
        }
        finally {
            at_vars.$at_violations$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (at_defns.NIL == admittedP && at_defns.NIL != failing_defns && at_defns.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = at_violations;
            SubLObject at_violation = (SubLObject)at_defns.NIL;
            at_violation = cdolist_list_var.first();
            while (at_defns.NIL != cdolist_list_var) {
                at_utilities.note_at_violation(at_violation);
                cdolist_list_var = cdolist_list_var.rest();
                at_violation = cdolist_list_var.first();
            }
            at_utilities.note_at_violation(sufficient_defn_violation_data(collection, v_term, failing_defns, quotedP, mt));
        }
        return admittedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 12064L)
    public static SubLObject why_sufficient_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (at_defns.NIL == just) {
                        SubLObject csome_list_var = suf_defn_assertions(collection);
                        SubLObject assertion = (SubLObject)at_defns.NIL;
                        assertion = csome_list_var.first();
                        while (at_defns.NIL == just && at_defns.NIL != csome_list_var) {
                            if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED)) {
                                final SubLObject _prev_bind_0_$10 = at_vars.$defn_collection$.currentBinding(thread);
                                try {
                                    at_vars.$defn_collection$.bind(assertions_high.gaf_arg1(assertion), thread);
                                    final SubLObject defn_mt = assertions_high.assertion_mt(assertion);
                                    if (at_defns.NIL != mt_relevance_macros.relevant_mtP(defn_mt)) {
                                        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                        if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                                            if (at_defns.NIL != isa.isaP(v_term, at_vars.$defn_collection$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                                                just = isa.why_isaP(v_term, at_vars.$defn_collection$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                            }
                                            else if (at_defns.NIL != quiet_defn_admitsP(defn, v_term, collection, mt)) {
                                                if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                    just = genls.why_genlP(at_vars.$defn_collection$.getDynamicValue(thread), collection, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                }
                                                just = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertions_high.assertion_formula(assertion), (SubLObject)at_defns.$kw21$TRUE), just);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    at_vars.$defn_collection$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            assertion = csome_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$10, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$9, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return just;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 12956L)
    public static SubLObject sufficient_defn_violation_data(final SubLObject collection, final SubLObject v_term, final SubLObject v_defns, final SubLObject quotedP, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = (SubLObject)at_defns.NIL;
        if (at_defns.NIL != at_vars.$at_source$.getDynamicValue(thread) && at_defns.NIL != at_vars.$at_reln$.getDynamicValue(thread) && !at_vars.$at_source$.getDynamicValue(thread).eql(at_vars.$at_reln$.getDynamicValue(thread))) {
            data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)at_defns.$kw22$VIA_GENL_PRED, at_vars.$at_source$.getDynamicValue(thread)), data);
        }
        if (at_defns.NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread) && at_defns.NIL != at_vars.$at_constraint_gaf$.getDynamicValue(thread)) {
            data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)at_defns.$kw23$AT_CONSTRAINT_GAF, at_vars.$at_constraint_gaf$.getDynamicValue(thread)), data);
        }
        if (at_defns.NIL != mt) {
            data = (SubLObject)ConsesLow.cons(mt, data);
        }
        else {
            data = (SubLObject)ConsesLow.cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
        }
        if (at_defns.NIL != quotedP) {
            return (SubLObject)ConsesLow.listS((SubLObject)at_defns.$kw29$MAL_ARG_WRT_QUOTED_SUF_DEFNS, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, v_defns, data });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)at_defns.$kw30$MAL_ARG_WRT_SUF_DEFNS, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, v_defns, data });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 13606L)
    public static SubLObject necessary_defns_permitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == necessary_defns_rejectP(collection, v_term, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 13767L)
    public static SubLObject reset_necessary_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym32$NECESSARY_DEFNS_REJECT_);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 13767L)
    public static SubLObject necessary_defns_rejectP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejectedP = (SubLObject)at_defns.NIL;
        SubLObject doneP = (SubLObject)at_defns.NIL;
        if (at_defns.NIL == denotational_term_admitted_by_defn_via_isaP(v_term, collection, mt) && at_defns.NIL == doneP) {
            SubLObject node_var = collection;
            final SubLObject deck_type = (SubLObject)at_defns.$kw36$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = (SubLObject)at_defns.NIL;
                        final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((at_defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_defns.NIL != tv_var) ? at_defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (at_defns.NIL != tv_var && at_defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)at_defns.$kw38$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_defns.$kw41$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_defns.$kw43$WARN)) {
                                    Errors.warn((SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)at_defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$16 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$18 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                if (at_defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$16 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$17 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)at_defns.UNPROVIDED);
                                        while (at_defns.NIL != node_var && at_defns.NIL == doneP) {
                                            final SubLObject genl = node_var;
                                            final SubLObject _prev_bind_0_$17 = at_vars.$defn_collection$.currentBinding(thread);
                                            try {
                                                at_vars.$defn_collection$.bind(genl, thread);
                                                if (at_defns.NIL == doneP) {
                                                    SubLObject csome_list_var = (SubLObject)at_defns.$list46;
                                                    SubLObject defn_pred = (SubLObject)at_defns.NIL;
                                                    defn_pred = csome_list_var.first();
                                                    while (at_defns.NIL == doneP && at_defns.NIL != csome_list_var) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject rejectedP_$23 = necessary_defns_rejectP_int(collection, v_term, genl, defn_pred, (SubLObject)at_defns.NIL, mt);
                                                        final SubLObject doneP_$24 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        rejectedP = rejectedP_$23;
                                                        doneP = doneP_$24;
                                                        csome_list_var = csome_list_var.rest();
                                                        defn_pred = csome_list_var.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                at_vars.$defn_collection$.rebind(_prev_bind_0_$17, thread);
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$18;
                                            SubLObject _prev_bind_1_$18;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$27;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$19;
                                            SubLObject iteration_state_$29;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$20;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$31;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$21;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var3;
                                            SubLObject node_vars_link_node4;
                                            for (rest = (SubLObject)at_defns.NIL, rest = accessible_modules; at_defns.NIL == doneP && at_defns.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$18 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (at_defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                        if (at_defns.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                            if (at_defns.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_defns.NIL == doneP && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$27 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (at_defns.NIL != mt_relevance_macros.relevant_mtP(mt_$27)) {
                                                                        _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$27, thread);
                                                                            for (iteration_state_$29 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_defns.NIL == doneP && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$29); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next(iteration_state_$29)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$29);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (at_defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (at_defns.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_defns.NIL == doneP && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (at_defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (at_defns.NIL == doneP) {
                                                                                                csome_list_var2 = sol;
                                                                                                node_vars_link_node2 = (SubLObject)at_defns.NIL;
                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                while (at_defns.NIL == doneP && at_defns.NIL != csome_list_var2) {
                                                                                                    if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$20, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$29);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$19, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str48$attempting_to_bind_direction_link, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (at_defns.NIL != obsolete.cnat_p(node, (SubLObject)at_defns.UNPROVIDED)) {
                                                        new_list = ((at_defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)));
                                                        for (rest_$31 = (SubLObject)at_defns.NIL, rest_$31 = new_list; at_defns.NIL == doneP && at_defns.NIL != rest_$31; rest_$31 = rest_$31.rest()) {
                                                            generating_fn = rest_$31.first();
                                                            _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (at_defns.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_defns.NIL == doneP && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (at_defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (at_defns.NIL == doneP) {
                                                                        csome_list_var3 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)at_defns.NIL;
                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                        while (at_defns.NIL == doneP && at_defns.NIL != csome_list_var3) {
                                                                            if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$21, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$18, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$18, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$19, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$17, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$16, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$18, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$16, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$15, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$15, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$13, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
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
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return rejectedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 13767L)
    public static SubLObject necessary_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = necessary_defns_rejectP_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return necessary_defns_rejectP_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 14237L)
    public static SubLObject necessary_defns_rejectP_int(final SubLObject collection, final SubLObject v_term, final SubLObject genl, final SubLObject defn_pred, final SubLObject quotedP, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejectedP = (SubLObject)at_defns.NIL;
        SubLObject doneP = (SubLObject)at_defns.NIL;
        if (at_defns.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, (SubLObject)at_defns.ONE_INTEGER, defn_pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, (SubLObject)at_defns.ONE_INTEGER, defn_pred);
            SubLObject done_var = doneP;
            final SubLObject token_var = (SubLObject)at_defns.NIL;
            while (at_defns.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (at_defns.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                        SubLObject done_var_$34 = doneP;
                        final SubLObject token_var_$35 = (SubLObject)at_defns.NIL;
                        while (at_defns.NIL == done_var_$34) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                            final SubLObject valid_$36 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$35.eql(assertion));
                            if (at_defns.NIL != valid_$36) {
                                final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                                    if (at_defns.NIL == quotedP && at_defns.NIL == defn_admitsP(defn, v_term, collection, (SubLObject)at_defns.UNPROVIDED)) {
                                        rejectedP = (SubLObject)at_defns.T;
                                    }
                                    else if (at_defns.NIL != quotedP && at_defns.NIL == quoted_defn_admitsP(defn, v_term, collection, (SubLObject)at_defns.UNPROVIDED)) {
                                        rejectedP = (SubLObject)at_defns.T;
                                    }
                                    if (at_defns.NIL != rejectedP && at_defns.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                                        at_utilities.note_at_violation(necessary_defn_violation_data(collection, v_term, at_vars.$defn_collection$.getDynamicValue(thread), defn, quotedP, mt));
                                    }
                                    if (at_defns.NIL == czer_vars.$accumulating_semantic_violationsP$.getDynamicValue(thread)) {
                                        doneP = (SubLObject)at_defns.T;
                                    }
                                }
                            }
                            done_var_$34 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$36 || at_defns.NIL != doneP);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (at_defns.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid || at_defns.NIL != doneP);
            }
        }
        return Values.values(rejectedP, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 15034L)
    public static SubLObject denotational_term_admitted_by_defn_via_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admittedP = (SubLObject)at_defns.NIL;
        if (at_defns.NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP()) {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    admittedP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != at_denotational_term_p(v_term, (SubLObject)at_defns.UNPROVIDED) && (at_defns.NIL != isa.isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED) || (at_defns.NIL != assertions_high.gaf_assertionP(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)) && at_defns.NIL != el_utilities.isa_litP(assertions_high.gaf_formula(sbhl_link_vars.$added_assertion$.getDynamicValue(thread))) && v_term.equal(assertions_high.gaf_arg1(sbhl_link_vars.$added_assertion$.getDynamicValue(thread))) && at_defns.NIL != genls.genlsP(assertions_high.gaf_arg2(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)), collection, mt, (SubLObject)at_defns.UNPROVIDED)) || (at_defns.NIL != wff_macros.within_wffP() && at_defns.NIL != control_vars.within_assertP() && at_defns.NIL != el_utilities.isa_litP(wff_vars.wff_formula()) && v_term.equal(cycl_utilities.sentence_arg1(wff_vars.wff_formula(), (SubLObject)at_defns.UNPROVIDED)) && at_defns.NIL != term.el_fort_p(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), (SubLObject)at_defns.UNPROVIDED)) && at_defns.NIL != genls.genlsP(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), (SubLObject)at_defns.UNPROVIDED), collection, mt, (SubLObject)at_defns.UNPROVIDED) && at_defns.NIL == el_utilities.el_negation_p(wff_vars.wff_formula()))));
                }
                finally {
                    final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
            }
        }
        return admittedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 15954L)
    public static SubLObject reset_rejected_by_necessary_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym52$REJECTED_BY_NECESSARY_DEFNS);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 15954L)
    public static SubLObject rejected_by_necessary_defns_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejected_by = (SubLObject)at_defns.NIL;
        if (at_defns.NIL == denotational_term_admitted_by_defn_via_isaP(v_term, collection, mt)) {
            SubLObject node_var = collection;
            final SubLObject deck_type = (SubLObject)at_defns.$kw36$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$38 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = (SubLObject)at_defns.NIL;
                        final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((at_defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_defns.NIL != tv_var) ? at_defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (at_defns.NIL != tv_var && at_defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)at_defns.$kw38$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_defns.$kw41$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_defns.$kw43$WARN)) {
                                    Errors.warn((SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)at_defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$43 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                if (at_defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$42 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)at_defns.UNPROVIDED);
                                        while (at_defns.NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            final SubLObject _prev_bind_0_$42 = at_vars.$defn_collection$.currentBinding(thread);
                                            try {
                                                at_vars.$defn_collection$.bind(genl, thread);
                                                final SubLObject pred_var = at_defns.$const54$defnNecessary;
                                                if (at_defns.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var);
                                                    SubLObject done_var = (SubLObject)at_defns.NIL;
                                                    final SubLObject token_var = (SubLObject)at_defns.NIL;
                                                    while (at_defns.NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                        if (at_defns.NIL != valid) {
                                                            SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                                                SubLObject done_var_$48 = (SubLObject)at_defns.NIL;
                                                                final SubLObject token_var_$49 = (SubLObject)at_defns.NIL;
                                                                while (at_defns.NIL == done_var_$48) {
                                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$49);
                                                                    final SubLObject valid_$50 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$49.eql(assertion));
                                                                    if (at_defns.NIL != valid_$50) {
                                                                        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                        if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread)) && at_defns.NIL == defn_admitsP(defn, v_term, collection, (SubLObject)at_defns.UNPROVIDED)) {
                                                                            final SubLObject item_var = defn;
                                                                            if (at_defns.NIL == conses_high.member(item_var, rejected_by, Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
                                                                                rejected_by = (SubLObject)ConsesLow.cons(item_var, rejected_by);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_$48 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$50);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                                                    final SubLObject _values = Values.getValuesAsVector();
                                                                    if (at_defns.NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    Values.restoreValuesFromVector(_values);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid);
                                                    }
                                                }
                                            }
                                            finally {
                                                at_vars.$defn_collection$.rebind(_prev_bind_0_$42, thread);
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls));
                                            SubLObject module_var = (SubLObject)at_defns.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (at_defns.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$44 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (at_defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                        if (at_defns.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                            if (at_defns.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$54 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (at_defns.NIL != mt_relevance_macros.relevant_mtP(mt_$54)) {
                                                                        final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$54, thread);
                                                                            SubLObject iteration_state_$56;
                                                                            for (iteration_state_$56 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$56); iteration_state_$56 = dictionary_contents.do_dictionary_contents_next(iteration_state_$56)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$56);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (at_defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (at_defns.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (at_defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)at_defns.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (at_defns.NIL != csome_list_var) {
                                                                                                if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$46, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$56);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$45, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str48$attempting_to_bind_direction_link, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (at_defns.NIL != obsolete.cnat_p(node, (SubLObject)at_defns.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$58;
                                                        final SubLObject new_list = cdolist_list_var_$58 = ((at_defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)at_defns.NIL;
                                                        generating_fn = cdolist_list_var_$58.first();
                                                        while (at_defns.NIL != cdolist_list_var_$58) {
                                                            final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (at_defns.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (at_defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)at_defns.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (at_defns.NIL != csome_list_var2) {
                                                                        if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$47, thread);
                                                            }
                                                            cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                                            generating_fn = cdolist_list_var_$58.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$43, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$44, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$44, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$42, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$41, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$43, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$41, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$40, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$40, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$39, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$38, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return rejected_by;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 15954L)
    public static SubLObject rejected_by_necessary_defns(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = rejected_by_necessary_defns_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return rejected_by_necessary_defns_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 16538L)
    public static SubLObject why_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                if (at_defns.NIL == denotational_term_admitted_by_defn_via_isaP(v_term, collection, mt) && at_defns.NIL == just) {
                    SubLObject node_var = collection;
                    final SubLObject deck_type = (SubLObject)at_defns.$kw36$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$61 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$62 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$63 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$64 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = (SubLObject)at_defns.NIL;
                                final SubLObject _prev_bind_0_$63 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$64 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((at_defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_defns.NIL != tv_var) ? at_defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (at_defns.NIL != tv_var && at_defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)at_defns.$kw38$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)at_defns.$kw41$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)at_defns.$kw43$WARN)) {
                                            Errors.warn((SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)at_defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$64 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$65 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$65 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$70 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                        if (at_defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$65 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$66 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$66 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)at_defns.UNPROVIDED);
                                                while (at_defns.NIL != node_var && at_defns.NIL == just) {
                                                    final SubLObject genl = node_var;
                                                    final SubLObject _prev_bind_0_$66 = at_vars.$defn_collection$.currentBinding(thread);
                                                    try {
                                                        at_vars.$defn_collection$.bind(genl, thread);
                                                        if (at_defns.NIL == just) {
                                                            SubLObject csome_list_var = (SubLObject)at_defns.$list46;
                                                            SubLObject defn_pred = (SubLObject)at_defns.NIL;
                                                            defn_pred = csome_list_var.first();
                                                            while (at_defns.NIL == just && at_defns.NIL != csome_list_var) {
                                                                final SubLObject pred_var = defn_pred;
                                                                if (at_defns.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var)) {
                                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var);
                                                                    SubLObject done_var = (SubLObject)at_defns.NIL;
                                                                    final SubLObject token_var = (SubLObject)at_defns.NIL;
                                                                    while (at_defns.NIL == done_var) {
                                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                                        if (at_defns.NIL != valid) {
                                                                            SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                                                            try {
                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                                                                SubLObject done_var_$75 = (SubLObject)at_defns.NIL;
                                                                                final SubLObject token_var_$76 = (SubLObject)at_defns.NIL;
                                                                                while (at_defns.NIL == done_var_$75) {
                                                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$76);
                                                                                    final SubLObject valid_$77 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$76.eql(assertion));
                                                                                    if (at_defns.NIL != valid_$77) {
                                                                                        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                                        if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread)) && at_defns.NIL == defn_admitsP(defn, v_term, collection, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                            if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                                                                just = genls.why_genlP(collection, at_vars.$defn_collection$.getDynamicValue(thread), mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                                                            }
                                                                                            just = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertions_high.assertion_formula(assertion), (SubLObject)at_defns.$kw21$TRUE), just);
                                                                                        }
                                                                                    }
                                                                                    done_var_$75 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$77);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                                                                    final SubLObject _values = Values.getValuesAsVector();
                                                                                    if (at_defns.NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                    Values.restoreValuesFromVector(_values);
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid);
                                                                    }
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                defn_pred = csome_list_var.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        at_vars.$defn_collection$.rebind(_prev_bind_0_$66, thread);
                                                    }
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$68;
                                                    SubLObject _prev_bind_1_$67;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$81;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$69;
                                                    SubLObject iteration_state_$83;
                                                    SubLObject tv;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$70;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var2;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list;
                                                    SubLObject rest_$85;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$71;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes2;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest = (SubLObject)at_defns.NIL, rest = accessible_modules; at_defns.NIL == just && at_defns.NIL != rest; rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$68 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            node = function_terms.naut_to_nart(node_var);
                                                            if (at_defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                                if (at_defns.NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                                    if (at_defns.NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_defns.NIL == just && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$81 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (at_defns.NIL != mt_relevance_macros.relevant_mtP(mt_$81)) {
                                                                                _prev_bind_0_$69 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$81, thread);
                                                                                    for (iteration_state_$83 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_defns.NIL == just && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$83); iteration_state_$83 = dictionary_contents.do_dictionary_contents_next(iteration_state_$83)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$83);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (at_defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (at_defns.NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_defns.NIL == just && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (at_defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    if (at_defns.NIL == just) {
                                                                                                        csome_list_var2 = sol;
                                                                                                        node_vars_link_node2 = (SubLObject)at_defns.NIL;
                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                        while (at_defns.NIL == just && at_defns.NIL != csome_list_var2) {
                                                                                                            if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$70, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$83);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$69, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str48$attempting_to_bind_direction_link, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (at_defns.NIL != obsolete.cnat_p(node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                new_list = ((at_defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)));
                                                                for (rest_$85 = (SubLObject)at_defns.NIL, rest_$85 = new_list; at_defns.NIL == just && at_defns.NIL != rest_$85; rest_$85 = rest_$85.rest()) {
                                                                    generating_fn = rest_$85.first();
                                                                    _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                        if (at_defns.NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_defns.NIL == just && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (at_defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            if (at_defns.NIL == just) {
                                                                                csome_list_var3 = sol2;
                                                                                node_vars_link_node4 = (SubLObject)at_defns.NIL;
                                                                                node_vars_link_node4 = csome_list_var3.first();
                                                                                while (at_defns.NIL == just && at_defns.NIL != csome_list_var3) {
                                                                                    if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$71, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$67, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$68, thread);
                                                        }
                                                    }
                                                    node_var = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$66, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$66, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$65, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$70, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$65, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$65, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$64, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$64, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$63, thread);
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$64, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$63, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$62, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$61, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return just;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 17326L)
    public static SubLObject necessary_defn_violation_data(final SubLObject collection, final SubLObject v_term, final SubLObject defn_col, final SubLObject defn, final SubLObject quotedP, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = (SubLObject)at_defns.NIL;
        if (at_defns.NIL != at_vars.$at_source$.getDynamicValue(thread) && at_defns.NIL != at_vars.$at_reln$.getDynamicValue(thread) && !at_vars.$at_source$.getDynamicValue(thread).eql(at_vars.$at_reln$.getDynamicValue(thread))) {
            data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)at_defns.$kw22$VIA_GENL_PRED, at_vars.$at_source$.getDynamicValue(thread)), data);
        }
        if (at_defns.NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread) && at_defns.NIL != at_vars.$at_constraint_gaf$.getDynamicValue(thread)) {
            data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)at_defns.$kw23$AT_CONSTRAINT_GAF, at_vars.$at_constraint_gaf$.getDynamicValue(thread)), data);
        }
        if (at_defns.NIL != mt) {
            data = (SubLObject)ConsesLow.cons(mt, data);
        }
        else {
            data = (SubLObject)ConsesLow.cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
        }
        if (at_defns.NIL != quotedP) {
            return (SubLObject)ConsesLow.listS((SubLObject)at_defns.$kw55$MAL_ARG_WRT_QUOTED_NEC_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, defn_col, defn, data });
        }
        return (SubLObject)ConsesLow.listS((SubLObject)at_defns.$kw56$MAL_ARG_WRT_NEC_DEFN, new SubLObject[] { v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, defn_col, defn, data });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 17997L)
    public static SubLObject at_quoted_defns_admitP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL == at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
            return (SubLObject)at_defns.NIL;
        }
        final SubLObject pcase_var = get_quoted_defn_col_history(collection);
        if (pcase_var.eql((SubLObject)at_defns.$kw1$ADMITTED)) {
            return (SubLObject)at_defns.T;
        }
        if (pcase_var.eql((SubLObject)at_defns.$kw2$REJECTED)) {
            return (SubLObject)at_defns.NIL;
        }
        final SubLObject admitsP = quoted_defns_admitP(collection, at_vars.$at_arg$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
        if (at_defns.NIL != admitsP) {
            set_quoted_defn_fn_history(collection, (SubLObject)at_defns.$kw1$ADMITTED);
        }
        else {
            set_quoted_defn_fn_history(collection, (SubLObject)at_defns.$kw2$REJECTED);
        }
        return admitsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 18534L)
    public static SubLObject at_quoted_defns_rejectP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL == at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
            return (SubLObject)at_defns.NIL;
        }
        final SubLObject pcase_var = get_quoted_defn_col_history(collection);
        if (pcase_var.eql((SubLObject)at_defns.$kw1$ADMITTED)) {
            return (SubLObject)at_defns.NIL;
        }
        if (pcase_var.eql((SubLObject)at_defns.$kw2$REJECTED)) {
            return (SubLObject)at_defns.T;
        }
        final SubLObject rejectsP = quoted_defns_rejectP(collection, at_vars.$at_arg$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
        if (at_defns.NIL != rejectsP) {
            set_quoted_defn_fn_history(collection, (SubLObject)at_defns.$kw2$REJECTED);
        }
        else {
            set_quoted_defn_fn_history(collection, (SubLObject)at_defns.$kw1$ADMITTED);
        }
        return rejectsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 18998L)
    public static SubLObject quoted_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_quoted_defns_admitP(collection, v_term, mt);
        }
        return old_quoted_defns_admitP(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 19225L)
    public static SubLObject reset_old_quoted_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym58$OLD_QUOTED_DEFNS_ADMIT_);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 19225L)
    public static SubLObject old_quoted_defns_admitP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != isa.quoted_isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED)) {
            return (SubLObject)at_defns.T;
        }
        SubLObject admittedP = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = quoted_defining_defns_status(collection, v_term, mt);
                if (pcase_var.eql((SubLObject)at_defns.$kw1$ADMITTED)) {
                    admittedP = (SubLObject)at_defns.T;
                }
                else if (!pcase_var.eql((SubLObject)at_defns.$kw2$REJECTED)) {
                    admittedP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != suf_quoted_defn_assertions(collection) && (at_defns.NIL == at_vars.$at_apply_necessary_defnsP$.getDynamicValue(thread) || at_defns.NIL != quoted_necessary_defns_permitP(collection, v_term, mt)) && at_defns.NIL != quoted_sufficient_defns_admitP(collection, v_term, mt));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$89 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 19225L)
    public static SubLObject old_quoted_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = old_quoted_defns_admitP_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return old_quoted_defns_admitP_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 19875L)
    public static SubLObject quoted_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_quoted_defns_rejectP(collection, v_term, mt);
        }
        return old_quoted_defns_rejectP(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 20104L)
    public static SubLObject reset_old_quoted_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym61$OLD_QUOTED_DEFNS_REJECT_);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 20104L)
    public static SubLObject old_quoted_defns_rejectP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != isa.quoted_isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED)) {
            return (SubLObject)at_defns.NIL;
        }
        SubLObject rejected = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = quoted_defining_defns_status(collection, v_term, mt);
                if (!pcase_var.eql((SubLObject)at_defns.$kw1$ADMITTED)) {
                    if (pcase_var.eql((SubLObject)at_defns.$kw2$REJECTED)) {
                        rejected = (SubLObject)at_defns.T;
                    }
                    else {
                        rejected = quoted_necessary_defns_rejectP(collection, v_term, mt);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$90 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return rejected;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 20104L)
    public static SubLObject old_quoted_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = old_quoted_defns_rejectP_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return old_quoted_defns_rejectP_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 20577L)
    public static SubLObject reset_quoted_defining_defns_status_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym64$QUOTED_DEFINING_DEFNS_STATUS);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 20577L)
    public static SubLObject quoted_defining_defns_status_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_relevant_mts(collection, at_defns.$const66$quotedDefnIff, mt, (SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$kw21$TRUE));
        SubLObject status = (SubLObject)at_defns.NIL;
        if (at_defns.NIL != viable_defnP(defn, collection)) {
            final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
            try {
                at_vars.$defn_collection$.bind(collection, thread);
                if (at_defns.NIL != quoted_defn_admitsP(defn, v_term, collection, mt)) {
                    status = (SubLObject)at_defns.$kw1$ADMITTED;
                }
                else if (at_defns.NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                    status = (SubLObject)at_defns.$kw2$REJECTED;
                    at_utilities.note_at_violation(defining_defn_violation_data(collection, v_term, defn, (SubLObject)at_defns.T, mt));
                }
                else {
                    status = (SubLObject)at_defns.$kw2$REJECTED;
                }
            }
            finally {
                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
            }
        }
        return status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 20577L)
    public static SubLObject quoted_defining_defns_status(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = quoted_defining_defns_status_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return quoted_defining_defns_status_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 21264L)
    public static SubLObject reset_quoted_sufficient_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym68$QUOTED_SUFFICIENT_DEFNS_ADMIT_);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 21264L)
    public static SubLObject quoted_sufficient_defns_admitP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        return sufficient_defns_admit_int(collection, v_term, suf_quoted_defn_assertions(collection), (SubLObject)at_defns.T, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 21264L)
    public static SubLObject quoted_sufficient_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = quoted_sufficient_defns_admitP_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return quoted_sufficient_defns_admitP_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 21478L)
    public static SubLObject quoted_necessary_defns_permitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == quoted_necessary_defns_rejectP(collection, v_term, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 21653L)
    public static SubLObject reset_quoted_necessary_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym71$QUOTED_NECESSARY_DEFNS_REJECT_);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 21653L)
    public static SubLObject quoted_necessary_defns_rejectP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejectedP = (SubLObject)at_defns.NIL;
        SubLObject doneP = (SubLObject)at_defns.NIL;
        if (at_defns.NIL == doneP) {
            SubLObject node_var = collection;
            final SubLObject deck_type = (SubLObject)at_defns.$kw36$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$91 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = (SubLObject)at_defns.NIL;
                        final SubLObject _prev_bind_0_$92 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$93 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((at_defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_defns.NIL != tv_var) ? at_defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (at_defns.NIL != tv_var && at_defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)at_defns.$kw38$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_defns.$kw41$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_defns.$kw43$WARN)) {
                                    Errors.warn((SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)at_defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$93 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$94 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$96 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                if (at_defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$95 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$97 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)at_defns.UNPROVIDED);
                                        while (at_defns.NIL != node_var && at_defns.NIL == doneP) {
                                            final SubLObject genl = node_var;
                                            final SubLObject _prev_bind_0_$95 = at_vars.$defn_collection$.currentBinding(thread);
                                            try {
                                                at_vars.$defn_collection$.bind(genl, thread);
                                                if (at_defns.NIL == doneP) {
                                                    SubLObject csome_list_var = (SubLObject)at_defns.$list73;
                                                    SubLObject defn_pred = (SubLObject)at_defns.NIL;
                                                    defn_pred = csome_list_var.first();
                                                    while (at_defns.NIL == doneP && at_defns.NIL != csome_list_var) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject rejectedP_$101 = necessary_defns_rejectP_int(collection, v_term, genl, defn_pred, (SubLObject)at_defns.T, mt);
                                                        final SubLObject doneP_$102 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        rejectedP = rejectedP_$101;
                                                        doneP = doneP_$102;
                                                        csome_list_var = csome_list_var.rest();
                                                        defn_pred = csome_list_var.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                at_vars.$defn_collection$.rebind(_prev_bind_0_$95, thread);
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$96;
                                            SubLObject _prev_bind_1_$96;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$105;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$97;
                                            SubLObject iteration_state_$107;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$98;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$109;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$99;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var3;
                                            SubLObject node_vars_link_node4;
                                            for (rest = (SubLObject)at_defns.NIL, rest = accessible_modules; at_defns.NIL == doneP && at_defns.NIL != rest; rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$96 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (at_defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                        if (at_defns.NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                            if (at_defns.NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_defns.NIL == doneP && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$105 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (at_defns.NIL != mt_relevance_macros.relevant_mtP(mt_$105)) {
                                                                        _prev_bind_0_$97 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$105, thread);
                                                                            for (iteration_state_$107 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_defns.NIL == doneP && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$107); iteration_state_$107 = dictionary_contents.do_dictionary_contents_next(iteration_state_$107)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$107);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (at_defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (at_defns.NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_defns.NIL == doneP && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (at_defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            if (at_defns.NIL == doneP) {
                                                                                                csome_list_var2 = sol;
                                                                                                node_vars_link_node2 = (SubLObject)at_defns.NIL;
                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                while (at_defns.NIL == doneP && at_defns.NIL != csome_list_var2) {
                                                                                                    if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$98, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$107);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$97, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str48$attempting_to_bind_direction_link, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (at_defns.NIL != obsolete.cnat_p(node, (SubLObject)at_defns.UNPROVIDED)) {
                                                        new_list = ((at_defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)));
                                                        for (rest_$109 = (SubLObject)at_defns.NIL, rest_$109 = new_list; at_defns.NIL == doneP && at_defns.NIL != rest_$109; rest_$109 = rest_$109.rest()) {
                                                            generating_fn = rest_$109.first();
                                                            _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                if (at_defns.NIL != set.set_p(sol2)) {
                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_defns.NIL == doneP && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (at_defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    if (at_defns.NIL == doneP) {
                                                                        csome_list_var3 = sol2;
                                                                        node_vars_link_node4 = (SubLObject)at_defns.NIL;
                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                        while (at_defns.NIL == doneP && at_defns.NIL != csome_list_var3) {
                                                                            if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$99, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$96, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$96, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$97, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$95, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$94, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$96, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$94, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$93, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$93, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$92, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$91, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$100 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return rejectedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 21653L)
    public static SubLObject quoted_necessary_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = quoted_necessary_defns_rejectP_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return quoted_necessary_defns_rejectP_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 22144L)
    public static SubLObject denotational_term_admitted_by_quoted_defn_via_quoted_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admittedP = (SubLObject)at_defns.NIL;
        if (at_defns.NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP()) {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    admittedP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != at_denotational_term_p(v_term, (SubLObject)at_defns.UNPROVIDED) && (at_defns.NIL != isa.quoted_isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED) || (at_defns.NIL != assertions_high.gaf_assertionP(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)) && at_defns.NIL != el_utilities.quoted_isa_litP(assertions_high.gaf_formula(sbhl_link_vars.$added_assertion$.getDynamicValue(thread))) && v_term.equal(assertions_high.gaf_arg1(sbhl_link_vars.$added_assertion$.getDynamicValue(thread))) && at_defns.NIL != genls.genlsP(assertions_high.gaf_arg2(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)), collection, mt, (SubLObject)at_defns.UNPROVIDED)) || (at_defns.NIL != wff_macros.within_wffP() && at_defns.NIL != control_vars.within_assertP() && at_defns.NIL != el_utilities.quoted_isa_litP(wff_vars.wff_formula()) && v_term.equal(cycl_utilities.sentence_arg1(wff_vars.wff_formula(), (SubLObject)at_defns.UNPROVIDED)) && at_defns.NIL != term.el_fort_p(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), (SubLObject)at_defns.UNPROVIDED)) && at_defns.NIL != genls.genlsP(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), (SubLObject)at_defns.UNPROVIDED), collection, mt, (SubLObject)at_defns.UNPROVIDED) && at_defns.NIL == el_utilities.el_negation_p(wff_vars.wff_formula()))));
                }
                finally {
                    final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
            }
        }
        return admittedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 23097L)
    public static SubLObject reset_rejected_by_quoted_necessary_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list9);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym75$REJECTED_BY_QUOTED_NECESSARY_DEFNS);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 23097L)
    public static SubLObject rejected_by_quoted_necessary_defns_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejected_by = (SubLObject)at_defns.NIL;
        if (at_defns.NIL == denotational_term_admitted_by_quoted_defn_via_quoted_isaP(v_term, collection, mt)) {
            SubLObject node_var = collection;
            final SubLObject deck_type = (SubLObject)at_defns.$kw36$STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$113 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = (SubLObject)at_defns.NIL;
                        final SubLObject _prev_bind_0_$114 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$115 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((at_defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_defns.NIL != tv_var) ? at_defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (at_defns.NIL != tv_var && at_defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)at_defns.$kw38$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_defns.$kw41$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)at_defns.$kw43$WARN)) {
                                    Errors.warn((SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)at_defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$115 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$116 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$118 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                if (at_defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$116 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$117 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$119 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)at_defns.UNPROVIDED);
                                        while (at_defns.NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            final SubLObject _prev_bind_0_$117 = at_vars.$defn_collection$.currentBinding(thread);
                                            try {
                                                at_vars.$defn_collection$.bind(genl, thread);
                                                final SubLObject pred_var = at_defns.$const77$quotedDefnNecessary;
                                                if (at_defns.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var);
                                                    SubLObject done_var = (SubLObject)at_defns.NIL;
                                                    final SubLObject token_var = (SubLObject)at_defns.NIL;
                                                    while (at_defns.NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                        if (at_defns.NIL != valid) {
                                                            SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                                                SubLObject done_var_$123 = (SubLObject)at_defns.NIL;
                                                                final SubLObject token_var_$124 = (SubLObject)at_defns.NIL;
                                                                while (at_defns.NIL == done_var_$123) {
                                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$124);
                                                                    final SubLObject valid_$125 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$124.eql(assertion));
                                                                    if (at_defns.NIL != valid_$125) {
                                                                        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                        if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread)) && at_defns.NIL == quoted_defn_admitsP(defn, v_term, collection, (SubLObject)at_defns.UNPROVIDED)) {
                                                                            final SubLObject item_var = defn;
                                                                            if (at_defns.NIL == conses_high.member(item_var, rejected_by, Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
                                                                                rejected_by = (SubLObject)ConsesLow.cons(item_var, rejected_by);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_$123 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$125);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                                                    final SubLObject _values = Values.getValuesAsVector();
                                                                    if (at_defns.NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    Values.restoreValuesFromVector(_values);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid);
                                                    }
                                                }
                                            }
                                            finally {
                                                at_vars.$defn_collection$.rebind(_prev_bind_0_$117, thread);
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls));
                                            SubLObject module_var = (SubLObject)at_defns.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (at_defns.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$119 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$118 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (at_defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                        if (at_defns.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                            if (at_defns.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$129 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (at_defns.NIL != mt_relevance_macros.relevant_mtP(mt_$129)) {
                                                                        final SubLObject _prev_bind_0_$120 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$129, thread);
                                                                            SubLObject iteration_state_$131;
                                                                            for (iteration_state_$131 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$131); iteration_state_$131 = dictionary_contents.do_dictionary_contents_next(iteration_state_$131)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$131);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (at_defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$121 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (at_defns.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (at_defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)at_defns.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (at_defns.NIL != csome_list_var) {
                                                                                                if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$121, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$131);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$120, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str48$attempting_to_bind_direction_link, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (at_defns.NIL != obsolete.cnat_p(node, (SubLObject)at_defns.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$133;
                                                        final SubLObject new_list = cdolist_list_var_$133 = ((at_defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)at_defns.NIL;
                                                        generating_fn = cdolist_list_var_$133.first();
                                                        while (at_defns.NIL != cdolist_list_var_$133) {
                                                            final SubLObject _prev_bind_0_$122 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (at_defns.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (at_defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)at_defns.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (at_defns.NIL != csome_list_var2) {
                                                                        if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$122, thread);
                                                            }
                                                            cdolist_list_var_$133 = cdolist_list_var_$133.rest();
                                                            generating_fn = cdolist_list_var_$133.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$118, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$119, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$119, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$117, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$116, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$118, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$116, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$115, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$115, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$114, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$113, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$123 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$123, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return rejected_by;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 23097L)
    public static SubLObject rejected_by_quoted_necessary_defns(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = rejected_by_quoted_necessary_defns_metered(collection, v_term, mt);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(collection, v_term, mt), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return rejected_by_quoted_necessary_defns_metered(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 23715L)
    public static SubLObject why_quoted_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                if (at_defns.NIL == denotational_term_admitted_by_quoted_defn_via_quoted_isaP(v_term, collection, mt) && at_defns.NIL == just) {
                    SubLObject node_var = collection;
                    final SubLObject deck_type = (SubLObject)at_defns.$kw36$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$136 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$137 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$138 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$139 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = (SubLObject)at_defns.NIL;
                                final SubLObject _prev_bind_0_$138 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$139 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((at_defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_defns.NIL != tv_var) ? at_defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (at_defns.NIL != tv_var && at_defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)at_defns.$kw38$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)at_defns.$kw41$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)at_defns.$kw43$WARN)) {
                                            Errors.warn((SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)at_defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$139 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$140 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$140 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$145 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                        if (at_defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$140 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$141 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$141 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)at_defns.UNPROVIDED);
                                                while (at_defns.NIL != node_var && at_defns.NIL == just) {
                                                    final SubLObject genl = node_var;
                                                    final SubLObject _prev_bind_0_$141 = at_vars.$defn_collection$.currentBinding(thread);
                                                    try {
                                                        at_vars.$defn_collection$.bind(genl, thread);
                                                        if (at_defns.NIL == just) {
                                                            SubLObject csome_list_var = (SubLObject)at_defns.$list73;
                                                            SubLObject defn_pred = (SubLObject)at_defns.NIL;
                                                            defn_pred = csome_list_var.first();
                                                            while (at_defns.NIL == just && at_defns.NIL != csome_list_var) {
                                                                final SubLObject pred_var = defn_pred;
                                                                if (at_defns.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var)) {
                                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var);
                                                                    SubLObject done_var = (SubLObject)at_defns.NIL;
                                                                    final SubLObject token_var = (SubLObject)at_defns.NIL;
                                                                    while (at_defns.NIL == done_var) {
                                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                                        if (at_defns.NIL != valid) {
                                                                            SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                                                            try {
                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                                                                SubLObject done_var_$150 = (SubLObject)at_defns.NIL;
                                                                                final SubLObject token_var_$151 = (SubLObject)at_defns.NIL;
                                                                                while (at_defns.NIL == done_var_$150) {
                                                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$151);
                                                                                    final SubLObject valid_$152 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$151.eql(assertion));
                                                                                    if (at_defns.NIL != valid_$152) {
                                                                                        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                                        if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread)) && at_defns.NIL == quoted_defn_admitsP(defn, v_term, collection, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                            if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                                                                just = genls.why_genlP(collection, at_vars.$defn_collection$.getDynamicValue(thread), mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                                                            }
                                                                                            just = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertions_high.assertion_formula(assertion), (SubLObject)at_defns.$kw21$TRUE), just);
                                                                                        }
                                                                                    }
                                                                                    done_var_$150 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$152);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                final SubLObject _prev_bind_0_$142 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                                                                    final SubLObject _values = Values.getValuesAsVector();
                                                                                    if (at_defns.NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                    Values.restoreValuesFromVector(_values);
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid);
                                                                    }
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                defn_pred = csome_list_var.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        at_vars.$defn_collection$.rebind(_prev_bind_0_$141, thread);
                                                    }
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$143;
                                                    SubLObject _prev_bind_1_$142;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$156;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$144;
                                                    SubLObject iteration_state_$158;
                                                    SubLObject tv;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$145;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var2;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list;
                                                    SubLObject rest_$160;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$146;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes2;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest = (SubLObject)at_defns.NIL, rest = accessible_modules; at_defns.NIL == just && at_defns.NIL != rest; rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$143 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$142 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            node = function_terms.naut_to_nart(node_var);
                                                            if (at_defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                                if (at_defns.NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                                    if (at_defns.NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_defns.NIL == just && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$156 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (at_defns.NIL != mt_relevance_macros.relevant_mtP(mt_$156)) {
                                                                                _prev_bind_0_$144 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$156, thread);
                                                                                    for (iteration_state_$158 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_defns.NIL == just && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$158); iteration_state_$158 = dictionary_contents.do_dictionary_contents_next(iteration_state_$158)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$158);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (at_defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$145 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (at_defns.NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_defns.NIL == just && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (at_defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    if (at_defns.NIL == just) {
                                                                                                        csome_list_var2 = sol;
                                                                                                        node_vars_link_node2 = (SubLObject)at_defns.NIL;
                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                        while (at_defns.NIL == just && at_defns.NIL != csome_list_var2) {
                                                                                                            if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$145, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$158);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$144, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str48$attempting_to_bind_direction_link, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (at_defns.NIL != obsolete.cnat_p(node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                new_list = ((at_defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)));
                                                                for (rest_$160 = (SubLObject)at_defns.NIL, rest_$160 = new_list; at_defns.NIL == just && at_defns.NIL != rest_$160; rest_$160 = rest_$160.rest()) {
                                                                    generating_fn = rest_$160.first();
                                                                    _prev_bind_0_$146 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                        if (at_defns.NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_defns.NIL == just && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (at_defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            if (at_defns.NIL == just) {
                                                                                csome_list_var3 = sol2;
                                                                                node_vars_link_node4 = (SubLObject)at_defns.NIL;
                                                                                node_vars_link_node4 = csome_list_var3.first();
                                                                                while (at_defns.NIL == just && at_defns.NIL != csome_list_var3) {
                                                                                    if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$146, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$142, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$143, thread);
                                                        }
                                                    }
                                                    node_var = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$141, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$141, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$140, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$145, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$140, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$140, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$139, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$139, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$138, thread);
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$139, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$138, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$137, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$147 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$147, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$136, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$148 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$148, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return just;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 24543L)
    public static SubLObject new_defn_stack() {
        return Hashtables.make_hash_table((SubLObject)at_defns.SIXTEEN_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 24638L)
    public static SubLObject defn_stack_push(final SubLObject defn, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.push_hash(defn, v_term, at_vars.$defn_stack$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 24727L)
    public static SubLObject defn_stack_pop(final SubLObject defn, final SubLObject expected_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject actual_term = hash_table_utilities.pop_hash(defn, at_vars.$defn_stack$.getDynamicValue(thread));
        if (!expected_term.equal(actual_term)) {
            defn_error((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str78$defn_stack_consistency_error___Ex, expected_term, actual_term, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        return actual_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 25048L)
    public static SubLObject recursive_defn_callP(final SubLObject defn, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != misc_utilities.initialized_p(at_vars.$defn_stack$.getDynamicValue(thread))) {
            final SubLObject term_stack = Hashtables.gethash_without_values(defn, at_vars.$defn_stack$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
            return subl_promotions.memberP(v_term, term_stack, Symbols.symbol_function((SubLObject)at_defns.EQUAL), (SubLObject)at_defns.UNPROVIDED);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 25253L)
    public static SubLObject get_defn_col_history(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        result = Hashtables.gethash_without_values(collection, at_vars.$defn_col_history$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 25436L)
    public static SubLObject set_defn_col_history(final SubLObject defn, final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(defn, at_vars.$defn_col_history$.getDynamicValue(thread), result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 25547L)
    public static SubLObject get_defn_fn_history(final SubLObject defn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        result = Hashtables.gethash_without_values(defn, at_vars.$defn_fn_history$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 25694L)
    public static SubLObject set_defn_fn_history(final SubLObject defn, final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(defn, at_vars.$defn_fn_history$.getDynamicValue(thread), result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 25803L)
    public static SubLObject get_quoted_defn_fn_history(final SubLObject defn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        result = Hashtables.gethash_without_values(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 25964L)
    public static SubLObject set_quoted_defn_fn_history(final SubLObject defn, final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 26087L)
    public static SubLObject get_quoted_defn_col_history(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        result = Hashtables.gethash_without_values(collection, at_vars.$quoted_defn_col_history$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 26262L)
    public static SubLObject set_quoted_defn_col_history(final SubLObject defn, final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(defn, at_vars.$quoted_defn_col_history$.getDynamicValue(thread), result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 26387L)
    public static SubLObject quiet_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            result = defns_admitP(collection, v_term, mt);
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 26769L)
    public static SubLObject quiet_sufficient_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$at_apply_necessary_defnsP$.bind((SubLObject)at_defns.NIL, thread);
            result = defns_admitP(collection, v_term, mt);
        }
        finally {
            at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 27127L)
    public static SubLObject quiet_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$at_apply_necessary_defnsP$.bind((SubLObject)at_defns.NIL, thread);
            result = defns_rejectP(collection, v_term, mt);
        }
        finally {
            at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 27466L)
    public static SubLObject quiet_defn_admitsP(final SubLObject defn, final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            result = defn_admitsP(defn, v_term, collection, mt);
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 27830L)
    public static SubLObject defn_admitsP(final SubLObject defn, final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = defn_history(defn);
        if (pcase_var.eql((SubLObject)at_defns.$kw1$ADMITTED)) {
            return (SubLObject)at_defns.T;
        }
        if (pcase_var.eql((SubLObject)at_defns.$kw2$REJECTED)) {
            return (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != recursive_defn_callP(defn, v_term)) {
            defn_error((SubLObject)at_defns.THREE_INTEGER, (SubLObject)at_defns.$str79$recursive_call_of_defn__a_with_ar, defn, v_term, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            return (SubLObject)at_defns.NIL;
        }
        SubLObject admitsP = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_stack$.currentBinding(thread);
        try {
            at_vars.$defn_stack$.bind((at_defns.NIL != misc_utilities.uninitialized_p(at_vars.$defn_stack$.getDynamicValue(thread))) ? new_defn_stack() : at_vars.$defn_stack$.getDynamicValue(thread), thread);
            try {
                defn_stack_push(defn, v_term);
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$164 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    admitsP = defn_admits_intP(defn, v_term, collection);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$164, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$165 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    defn_stack_pop(defn, v_term);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$165, thread);
                }
            }
        }
        finally {
            at_vars.$defn_stack$.rebind(_prev_bind_0, thread);
        }
        if (at_defns.NIL == collection_specific_defnP(defn)) {
            if (at_defns.NIL != admitsP) {
                set_defn_fn_history(defn, (SubLObject)at_defns.$kw1$ADMITTED);
            }
            else {
                set_defn_fn_history(defn, (SubLObject)at_defns.$kw2$REJECTED);
            }
        }
        return admitsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 29079L)
    public static SubLObject collection_specific_defnP(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(symbol, at_vars.$at_collection_specific_defns$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 29188L)
    public static SubLObject defn_history(final SubLObject defn) {
        if (at_defns.NIL != viable_defnP(defn, (SubLObject)at_defns.UNPROVIDED) && at_defns.NIL == collection_specific_defnP(defn)) {
            return get_defn_fn_history(defn);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 29441L)
    public static SubLObject reset_defn_admits_intP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list81);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym82$DEFN_ADMITS_INT_);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 29441L)
    public static SubLObject defn_admits_intP_metered(final SubLObject defn, final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admitsP = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                admitsP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != denotational_term_admitted_by_defn_via_isaP(v_term, collection, (SubLObject)at_defns.UNPROVIDED) || at_defns.NIL != defn_funcall(defn, v_term));
            }
            finally {
                final SubLObject _prev_bind_0_$166 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$166, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        if (collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
            defn_note((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str84$__defn_test__term__s__defn__s_of_, v_term, defn, collection, (SubLObject)((at_defns.NIL != admitsP) ? at_defns.$kw1$ADMITTED : at_defns.$kw2$REJECTED), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        else {
            defn_note((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str85$__defn_test__term__s__defn__s_of_, v_term, defn, collection, at_vars.$defn_collection$.getDynamicValue(thread), (SubLObject)((at_defns.NIL != admitsP) ? at_defns.$kw1$ADMITTED : at_defns.$kw2$REJECTED), (SubLObject)at_defns.UNPROVIDED);
        }
        return admitsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 29441L)
    public static SubLObject defn_admits_intP(final SubLObject defn, final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = defn_admits_intP_metered(defn, v_term, collection);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(defn, v_term, collection), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return defn_admits_intP_metered(defn, v_term, collection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 30054L)
    public static SubLObject quiet_quoted_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            result = quoted_defns_admitP(collection, v_term, mt);
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 30389L)
    public static SubLObject quiet_quoted_sufficient_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$at_apply_necessary_defnsP$.bind((SubLObject)at_defns.NIL, thread);
            result = quoted_defns_admitP(collection, v_term, mt);
        }
        finally {
            at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 30761L)
    public static SubLObject quiet_quoted_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            result = quoted_defns_rejectP(collection, v_term, mt);
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 31070L)
    public static SubLObject quiet_quoted_defn_admitsP(final SubLObject defn, final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            result = quoted_defn_admitsP(defn, v_term, collection, mt);
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 31419L)
    public static SubLObject quoted_defn_admitsP(final SubLObject defn, final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = quoted_defn_history(defn);
        if (pcase_var.eql((SubLObject)at_defns.$kw1$ADMITTED)) {
            return (SubLObject)at_defns.T;
        }
        if (pcase_var.eql((SubLObject)at_defns.$kw2$REJECTED)) {
            return (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != recursive_defn_callP(defn, v_term)) {
            defn_error((SubLObject)at_defns.THREE_INTEGER, (SubLObject)at_defns.$str86$recursive_call_of_quoted_defn__a_, defn, v_term, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            return (SubLObject)at_defns.NIL;
        }
        SubLObject admitsP = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_stack$.currentBinding(thread);
        try {
            at_vars.$defn_stack$.bind((at_defns.NIL != misc_utilities.uninitialized_p(at_vars.$defn_stack$.getDynamicValue(thread))) ? new_defn_stack() : at_vars.$defn_stack$.getDynamicValue(thread), thread);
            try {
                defn_stack_push(defn, v_term);
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$167 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    admitsP = quoted_defn_admits_intP(defn, v_term, collection);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$167, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$168 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    defn_stack_pop(defn, v_term);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$168, thread);
                }
            }
        }
        finally {
            at_vars.$defn_stack$.rebind(_prev_bind_0, thread);
        }
        if (at_defns.NIL == collection_specific_defnP(defn)) {
            if (at_defns.NIL != admitsP) {
                Hashtables.sethash(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), (SubLObject)at_defns.$kw1$ADMITTED);
            }
            else {
                Hashtables.sethash(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), (SubLObject)at_defns.$kw2$REJECTED);
            }
        }
        return admitsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 32773L)
    public static SubLObject quoted_defn_history(final SubLObject defn) {
        if (at_defns.NIL != viable_defnP(defn, (SubLObject)at_defns.UNPROVIDED) && at_defns.NIL == collection_specific_defnP(defn)) {
            return get_quoted_defn_fn_history(defn);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 33052L)
    public static SubLObject reset_quoted_defn_admits_intP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list81);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym88$QUOTED_DEFN_ADMITS_INT_);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 33052L)
    public static SubLObject quoted_defn_admits_intP_metered(final SubLObject defn, final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admitsP = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                admitsP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != denotational_term_admitted_by_quoted_defn_via_quoted_isaP(v_term, collection, (SubLObject)at_defns.UNPROVIDED) || at_defns.NIL != defn_funcall(defn, v_term));
            }
            finally {
                final SubLObject _prev_bind_0_$169 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$169, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        if (collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
            defn_note((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str84$__defn_test__term__s__defn__s_of_, v_term, defn, collection, (SubLObject)((at_defns.NIL != admitsP) ? at_defns.$kw1$ADMITTED : at_defns.$kw2$REJECTED), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        else {
            defn_note((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str85$__defn_test__term__s__defn__s_of_, v_term, defn, collection, at_vars.$defn_collection$.getDynamicValue(thread), (SubLObject)((at_defns.NIL != admitsP) ? at_defns.$kw1$ADMITTED : at_defns.$kw2$REJECTED), (SubLObject)at_defns.UNPROVIDED);
        }
        return admitsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 33052L)
    public static SubLObject quoted_defn_admits_intP(final SubLObject defn, final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = quoted_defn_admits_intP_metered(defn, v_term, collection);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(defn, v_term, collection), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return quoted_defn_admits_intP_metered(defn, v_term, collection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 33675L)
    public static SubLObject clear_defn_cyc_evaluate() {
        final SubLObject cs = at_defns.$defn_cyc_evaluate_caching_state$.getGlobalValue();
        if (at_defns.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 33675L)
    public static SubLObject remove_defn_cyc_evaluate(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(at_defns.$defn_cyc_evaluate_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 33675L)
    public static SubLObject defn_cyc_evaluate_internal(final SubLObject v_term) {
        return relation_evaluation.cyc_evaluate(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 33675L)
    public static SubLObject defn_cyc_evaluate(final SubLObject v_term) {
        SubLObject caching_state = at_defns.$defn_cyc_evaluate_caching_state$.getGlobalValue();
        if (at_defns.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)at_defns.$sym90$DEFN_CYC_EVALUATE, (SubLObject)at_defns.$sym91$_DEFN_CYC_EVALUATE_CACHING_STATE_, (SubLObject)at_defns.NIL, (SubLObject)at_defns.EQUAL, (SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$int92$24);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(defn_cyc_evaluate_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)at_defns.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 33794L)
    public static SubLObject valid_defnP(final SubLObject defn, SubLObject defn_collection) {
        if (defn_collection == at_defns.UNPROVIDED) {
            defn_collection = (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != defn) {
            final SubLObject validP = Types.symbolp(defn);
            if (at_defns.NIL == validP) {
                if (at_defns.NIL != defn_collection) {
                    defn_error((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str93$_s_has_invalid_defn___s, defn_collection, defn, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                }
                else {
                    defn_error((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str94$invalid_defn___s, defn_collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                }
            }
            return validP;
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 34136L)
    public static SubLObject viable_defnP(final SubLObject defn, SubLObject defn_collection) {
        if (defn_collection == at_defns.UNPROVIDED) {
            defn_collection = (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != valid_defnP(defn, (SubLObject)at_defns.UNPROVIDED)) {
            final SubLObject viableP = eval_in_api.possibly_cyc_api_function_spec_p(defn);
            if (at_defns.NIL == viableP) {
                if (at_defns.NIL != defn_collection) {
                    defn_error((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str95$_s_has_non_viable_defn___s, defn_collection, defn, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                }
                else {
                    defn_error((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str96$non_viable_defn___s, defn_collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                }
            }
            return viableP;
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 34527L)
    public static SubLObject defn_funcall(final SubLObject defn, final SubLObject v_term) {
        return eval_in_api.possibly_cyc_api_funcall_1(defn, v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 34679L)
    public static SubLObject at_denotational_term_p(final SubLObject v_term, SubLObject varP) {
        if (varP == at_defns.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)at_defns.$sym97$CYC_VAR_);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != forts.fort_p(v_term) || at_defns.NIL != term.closed_nautP(v_term, varP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 34812L)
    public static SubLObject clear_defn_space() {
        clear_defn_cyc_evaluate();
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 34979L)
    public static SubLObject map_sufficient_defn_cols(final SubLObject function) {
        SubLObject cdolist_list_var = suf_defn_cache_as_alist();
        SubLObject cons = (SubLObject)at_defns.NIL;
        cons = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject col = (SubLObject)at_defns.NIL;
            SubLObject defn_assertions = (SubLObject)at_defns.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_defns.$list98);
            col = current.first();
            current = (defn_assertions = current.rest());
            Functions.funcall(function, col, defn_assertions);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 35310L)
    public static SubLObject has_typeP(final SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        collection = cycl_utilities.find_when_ground_naut(collection);
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind((SubLObject)at_defns.NIL, thread);
            return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != isa.isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED) || at_defns.NIL != defns_admitP(collection, v_term, mt));
        }
        finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 35809L)
    public static SubLObject quiet_has_typeP(final SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        collection = cycl_utilities.find_when_ground_naut(collection);
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind((SubLObject)at_defns.NIL, thread);
            return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != isa.isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED) || at_defns.NIL != quiet_defns_admitP(collection, v_term, mt));
        }
        finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 36340L)
    public static SubLObject quiet_has_any_typeP(final SubLObject v_term, final SubLObject collections, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind((SubLObject)at_defns.NIL, thread);
            result = isa.isa_anyP(v_term, collections, mt, (SubLObject)at_defns.UNPROVIDED);
            if (at_defns.NIL == result) {
                SubLObject csome_list_var;
                SubLObject collection;
                for (csome_list_var = collections, collection = (SubLObject)at_defns.NIL, collection = csome_list_var.first(); at_defns.NIL == result && at_defns.NIL != csome_list_var; result = quiet_defns_admitP(collection, v_term, mt), csome_list_var = csome_list_var.rest(), collection = csome_list_var.first()) {}
            }
        }
        finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 36806L)
    public static SubLObject quiet_has_type_among(final SubLObject v_term, final SubLObject collections, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind((SubLObject)at_defns.NIL, thread);
            result = isa.all_isa_among(v_term, collections, mt, (SubLObject)at_defns.UNPROVIDED);
            SubLObject cdolist_list_var = collections;
            SubLObject collection = (SubLObject)at_defns.NIL;
            collection = cdolist_list_var.first();
            while (at_defns.NIL != cdolist_list_var) {
                if (at_defns.NIL == list_utilities.member_kbeqP(v_term, result) && at_defns.NIL != quiet_defns_admitP(collection, v_term, mt)) {
                    result = (SubLObject)ConsesLow.cons(collection, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            }
        }
        finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 37207L)
    public static SubLObject quiet_has_type_memoizedP_internal(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject mt_info) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        if (mt_info == at_defns.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)at_defns.UNPROVIDED);
        }
        return quiet_has_typeP(v_term, collection, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 37207L)
    public static SubLObject quiet_has_type_memoizedP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject mt_info) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        if (mt_info == at_defns.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)at_defns.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)at_defns.NIL;
        if (at_defns.NIL == v_memoization_state) {
            return quiet_has_type_memoizedP_internal(v_term, collection, mt, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)at_defns.$sym100$QUIET_HAS_TYPE_MEMOIZED_, (SubLObject)at_defns.UNPROVIDED);
        if (at_defns.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)at_defns.$sym100$QUIET_HAS_TYPE_MEMOIZED_, (SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.NIL, (SubLObject)at_defns.EQUAL, (SubLObject)at_defns.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)at_defns.$sym100$QUIET_HAS_TYPE_MEMOIZED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, collection, mt, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)at_defns.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)at_defns.NIL;
            collision = cdolist_list_var.first();
            while (at_defns.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (collection.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (at_defns.NIL != cached_args && at_defns.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(quiet_has_type_memoizedP_internal(v_term, collection, mt, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, collection, mt, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 37401L)
    public static SubLObject not_has_type_by_extent_knownP(final SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        collection = cycl_utilities.find_when_ground_naut(collection);
        return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != forts.fort_p(collection) && at_defns.NIL != kb_accessors.completely_enumerable_collectionP(collection, mt) && at_defns.NIL == quiet_has_typeP(v_term, collection, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 37847L)
    public static SubLObject not_has_typeP(final SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        collection = cycl_utilities.find_when_ground_naut(collection);
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind((SubLObject)at_defns.NIL, thread);
            return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != defns_rejectP(collection, v_term, mt) || at_defns.NIL != isa.not_isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED));
        }
        finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 38244L)
    public static SubLObject quiet_not_has_typeP(final SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        collection = cycl_utilities.find_when_ground_naut(collection);
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind((SubLObject)at_defns.NIL, thread);
            return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != quiet_defns_rejectP(collection, v_term, mt) || at_defns.NIL != isa.not_isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED));
        }
        finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 38686L)
    public static SubLObject quick_quiet_has_typeP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = at_defns.$const101$InferencePSC;
        }
        if (at_defns.NIL != forts.fort_p(collection)) {
            return quick_quiet_has_typeP_fort(v_term, collection, mt);
        }
        if (at_defns.NIL != el_utilities.possibly_naut_p(collection)) {
            return quick_quiet_has_typeP_naut(v_term, collection, mt);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 39207L)
    public static SubLObject quick_quiet_has_typeP_fort(final SubLObject v_term, final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)at_defns.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (at_defns.NIL != forts.fort_p(v_term) && at_defns.NIL != isa.isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED)) {
                ans = (SubLObject)at_defns.T;
            }
            else if (at_defns.NIL != el_utilities.possibly_fo_naut_p(v_term) && at_defns.NIL != isa.isaP(v_term.first(), at_defns.$const102$Function_Denotational, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED) && at_defns.NIL != isa.nat_isaP(v_term, collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                ans = (SubLObject)at_defns.T;
            }
            else {
                final SubLObject _prev_bind_0_$170 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
                try {
                    at_vars.$at_apply_necessary_defnsP$.bind((SubLObject)at_defns.NIL, thread);
                    ans = quiet_defns_admitP(collection, v_term, (SubLObject)at_defns.UNPROVIDED);
                }
                finally {
                    at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_0_$170, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 39719L)
    public static SubLObject quick_quiet_has_typeP_naut(final SubLObject v_term, final SubLObject collection, final SubLObject mt) {
        if (at_defns.NIL != cycl_utilities.naut_with_functor_p(collection, at_defns.$const103$SpecsFn) && at_defns.NIL != term.el_fort_p(v_term) && at_defns.NIL != genls.genlP(v_term, cycl_utilities.nat_arg1(collection, (SubLObject)at_defns.UNPROVIDED), mt, (SubLObject)at_defns.UNPROVIDED)) {
            return (SubLObject)at_defns.T;
        }
        if (at_defns.NIL != cycl_utilities.collection_union_natP(collection)) {
            return quick_quiet_has_typeP_collection_union(v_term, collection, mt);
        }
        if (at_defns.NIL != cycl_utilities.collection_intersection_natP(collection)) {
            return quick_quiet_has_typeP_collection_intersection(v_term, collection, mt);
        }
        if (at_defns.NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(v_term) && at_defns.NIL != quick_quiet_has_typeP(cycl_utilities.nat_arg1(v_term, (SubLObject)at_defns.UNPROVIDED), collection, mt)) {
            return (SubLObject)at_defns.T;
        }
        if (at_defns.NIL != term.ground_nautP(collection, (SubLObject)at_defns.UNPROVIDED)) {
            final SubLObject maybe_nart = cycl_utilities.find_ground_naut(collection);
            return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != nart_handles.nart_p(maybe_nart) && at_defns.NIL != quick_quiet_has_typeP(v_term, maybe_nart, mt));
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 40567L)
    public static SubLObject quick_quiet_has_typeP_collection_union(final SubLObject v_term, final SubLObject collection_union, final SubLObject mt) {
        SubLObject cdolist_list_var = cycl_utilities.collection_union_united_collections(collection_union);
        SubLObject union_member = (SubLObject)at_defns.NIL;
        union_member = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.NIL != quick_quiet_has_typeP(v_term, union_member, mt)) {
                return (SubLObject)at_defns.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            union_member = cdolist_list_var.first();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 40567L)
    public static SubLObject quick_quiet_has_typeP_collection_intersection(final SubLObject v_term, final SubLObject v_collection_intersection, final SubLObject mt) {
        SubLObject cdolist_list_var = cycl_utilities.collection_intersection_intersectees(v_collection_intersection);
        SubLObject intersection_member = (SubLObject)at_defns.NIL;
        intersection_member = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.NIL == quick_quiet_has_typeP(v_term, intersection_member, mt)) {
                return (SubLObject)at_defns.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            intersection_member = cdolist_list_var.first();
        }
        return (SubLObject)at_defns.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 41133L)
    public static SubLObject max_mts_of_admitting_defns(final SubLObject v_term, final SubLObject collection) {
        if (collection.eql(at_defns.$const104$Thing)) {
            return (SubLObject)at_defns.$list105;
        }
        return genl_mts.max_mts(mts_of_admitting_sufficient_defns(v_term, collection), (SubLObject)at_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 41476L)
    public static SubLObject mts_of_admitting_sufficient_defns(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_mts_of_admitting_defns(v_term, collection);
        }
        return old_mts_of_admitting_sufficient_defns(v_term, collection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 41729L)
    public static SubLObject old_mts_of_admitting_sufficient_defns(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_sets = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject _prev_bind_0_$171 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                try {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind((SubLObject)at_defns.NIL, thread);
                    SubLObject cdolist_list_var = suf_defn_assertions(collection);
                    SubLObject assertion = (SubLObject)at_defns.NIL;
                    assertion = cdolist_list_var.first();
                    while (at_defns.NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0_$172 = at_vars.$defn_collection$.currentBinding(thread);
                        try {
                            at_vars.$defn_collection$.bind(assertions_high.gaf_arg1(assertion), thread);
                            final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                            final SubLObject mt = assertions_high.assertion_mt(assertion);
                            if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                                final SubLObject _prev_bind_0_$173 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$174 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
                                    if (at_defns.NIL != quiet_defn_admitsP(defn, v_term, collection, (SubLObject)at_defns.UNPROVIDED) && (at_defns.NIL == at_vars.$at_apply_necessary_defnsP$.getDynamicValue(thread) || at_defns.NIL != necessary_defns_permitP(collection, v_term, (SubLObject)at_defns.UNPROVIDED))) {
                                        SubLObject cdolist_list_var_$175 = genls.min_mts_of_genls_paths(at_vars.$defn_collection$.getDynamicValue(thread), collection, (SubLObject)at_defns.UNPROVIDED);
                                        SubLObject mt_set = (SubLObject)at_defns.NIL;
                                        mt_set = cdolist_list_var_$175.first();
                                        while (at_defns.NIL != cdolist_list_var_$175) {
                                            mt_sets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(mt, mt_set), mt_sets);
                                            cdolist_list_var_$175 = cdolist_list_var_$175.rest();
                                            mt_set = cdolist_list_var_$175.first();
                                        }
                                    }
                                }
                                finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$174, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$173, thread);
                                }
                            }
                        }
                        finally {
                            at_vars.$defn_collection$.rebind(_prev_bind_0_$172, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
                finally {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0_$171, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$174 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$174, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return genl_mts.max_floor_mts_from_mt_sets(mt_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 42821L)
    public static SubLObject max_mts_of_admitting_quoted_defns(final SubLObject v_term, final SubLObject collection) {
        return genl_mts.max_mts(mts_of_admitting_sufficient_quoted_defns(v_term, collection), (SubLObject)at_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 43021L)
    public static SubLObject mts_of_admitting_sufficient_quoted_defns(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.mts_of_admitting_quoted_defns(v_term, collection);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 43232L)
    public static SubLObject isa_via_defnsP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        return defns_admitP(collection, v_term, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 43408L)
    public static SubLObject hl_justify_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_hl_justify_isa_via_defns(v_term, collection, mt);
        }
        return old_hl_justify_isa_via_defns(v_term, collection, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 43765L)
    public static SubLObject old_hl_justify_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$177 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$178 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (at_defns.NIL == supports) {
                        SubLObject csome_list_var = suf_defn_assertions(collection);
                        SubLObject assertion = (SubLObject)at_defns.NIL;
                        assertion = csome_list_var.first();
                        while (at_defns.NIL == supports && at_defns.NIL != csome_list_var) {
                            if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED)) {
                                final SubLObject _prev_bind_0_$178 = at_vars.$defn_collection$.currentBinding(thread);
                                try {
                                    at_vars.$defn_collection$.bind(assertions_high.gaf_arg1(assertion), thread);
                                    final SubLObject defn_mt = assertions_high.assertion_mt(assertion);
                                    if (at_defns.NIL != mt_relevance_macros.relevant_mtP(defn_mt)) {
                                        final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                        if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                                            if (at_defns.NIL != isa.isaP(v_term, at_vars.$defn_collection$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                                                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)at_defns.$kw108$ISA, (SubLObject)ConsesLow.list(at_defns.$const109$isa, v_term, collection), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), supports);
                                            }
                                            else if (at_defns.NIL != quiet_defn_admitsP(defn, v_term, collection, mt)) {
                                                if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)at_defns.$kw110$GENLS, (SubLObject)ConsesLow.list(at_defns.$const45$genls, at_vars.$defn_collection$.getDynamicValue(thread), collection), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), supports);
                                                }
                                                supports = (SubLObject)ConsesLow.cons(assertion, supports);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    at_vars.$defn_collection$.rebind(_prev_bind_0_$178, thread);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            assertion = csome_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$178, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$177, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$179 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 44905L)
    public static SubLObject not_isa_via_defnsP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != defns_rejectP(collection, v_term, mt) || at_defns.NIL != collection_rejects_via_disjoint_defnsP(collection, v_term, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 45158L)
    public static SubLObject why_not_isa_via_defnsP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        SubLObject just = why_defns_rejectP(collection, v_term, mt);
        if (at_defns.NIL == just) {
            just = why_collection_rejects_via_disjoint_defnsP(collection, v_term, mt);
        }
        return just;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 45403L)
    public static SubLObject hl_justify_not_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$181 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$182 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (at_defns.NIL == supports) {
                        SubLObject node_var = collection;
                        final SubLObject deck_type = (SubLObject)at_defns.$kw36$STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$182 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject mt_var_$184 = mt;
                                final SubLObject _prev_bind_0_$183 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$183 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$187 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$184), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$184), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$184), thread);
                                    final SubLObject tv_var = (SubLObject)at_defns.NIL;
                                    final SubLObject _prev_bind_0_$184 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$184 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind((at_defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_defns.NIL != tv_var) ? at_defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                        if (at_defns.NIL != tv_var && at_defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql((SubLObject)at_defns.$kw38$ERROR)) {
                                                sbhl_paranoia.sbhl_error((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)at_defns.$kw41$CERROR)) {
                                                sbhl_paranoia.sbhl_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)at_defns.$kw43$WARN)) {
                                                Errors.warn((SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                            }
                                            else {
                                                Errors.warn((SubLObject)at_defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror((SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                            }
                                        }
                                        final SubLObject _prev_bind_0_$185 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$185 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$188 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_3_$193 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                            if (at_defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) {
                                                final SubLObject _prev_bind_0_$186 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$186 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$189 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)at_defns.UNPROVIDED);
                                                    while (at_defns.NIL != node_var && at_defns.NIL == supports) {
                                                        final SubLObject genl = node_var;
                                                        final SubLObject _prev_bind_0_$187 = at_vars.$defn_collection$.currentBinding(thread);
                                                        try {
                                                            at_vars.$defn_collection$.bind(genl, thread);
                                                            if (at_defns.NIL == supports) {
                                                                SubLObject csome_list_var = (SubLObject)at_defns.$list46;
                                                                SubLObject defn_pred = (SubLObject)at_defns.NIL;
                                                                defn_pred = csome_list_var.first();
                                                                while (at_defns.NIL == supports && at_defns.NIL != csome_list_var) {
                                                                    final SubLObject pred_var = defn_pred;
                                                                    if (at_defns.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var)) {
                                                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var);
                                                                        SubLObject done_var = (SubLObject)at_defns.NIL;
                                                                        final SubLObject token_var = (SubLObject)at_defns.NIL;
                                                                        while (at_defns.NIL == done_var) {
                                                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                                            if (at_defns.NIL != valid) {
                                                                                SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                                                                try {
                                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                                                                    SubLObject done_var_$198 = (SubLObject)at_defns.NIL;
                                                                                    final SubLObject token_var_$199 = (SubLObject)at_defns.NIL;
                                                                                    while (at_defns.NIL == done_var_$198) {
                                                                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$199);
                                                                                        final SubLObject valid_$200 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$199.eql(assertion));
                                                                                        if (at_defns.NIL != valid_$200) {
                                                                                            final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                                            if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread)) && at_defns.NIL == quiet_defn_admitsP(defn, v_term, collection, mt)) {
                                                                                                if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                                                                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)at_defns.$kw110$GENLS, (SubLObject)ConsesLow.list(at_defns.$const45$genls, collection, at_vars.$defn_collection$.getDynamicValue(thread)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), supports);
                                                                                                }
                                                                                                supports = (SubLObject)ConsesLow.cons(assertion, supports);
                                                                                            }
                                                                                        }
                                                                                        done_var_$198 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$200);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    final SubLObject _prev_bind_0_$188 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                                                                        final SubLObject _values = Values.getValuesAsVector();
                                                                                        if (at_defns.NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                        Values.restoreValuesFromVector(_values);
                                                                                    }
                                                                                    finally {
                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$188, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid);
                                                                        }
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    defn_pred = csome_list_var.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            at_vars.$defn_collection$.rebind(_prev_bind_0_$187, thread);
                                                        }
                                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls));
                                                        SubLObject rest;
                                                        SubLObject module_var;
                                                        SubLObject _prev_bind_0_$189;
                                                        SubLObject _prev_bind_1_$187;
                                                        SubLObject node;
                                                        SubLObject d_link;
                                                        SubLObject mt_links;
                                                        SubLObject iteration_state;
                                                        SubLObject mt_$204;
                                                        SubLObject tv_links;
                                                        SubLObject _prev_bind_0_$190;
                                                        SubLObject iteration_state_$206;
                                                        SubLObject tv;
                                                        SubLObject link_nodes;
                                                        SubLObject _prev_bind_0_$191;
                                                        SubLObject sol;
                                                        SubLObject set_contents_var;
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject node_vars_link_node;
                                                        SubLObject csome_list_var2;
                                                        SubLObject node_vars_link_node2;
                                                        SubLObject new_list;
                                                        SubLObject rest_$208;
                                                        SubLObject generating_fn;
                                                        SubLObject _prev_bind_0_$192;
                                                        SubLObject sol2;
                                                        SubLObject link_nodes2;
                                                        SubLObject set_contents_var2;
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject node_vars_link_node3;
                                                        SubLObject csome_list_var3;
                                                        SubLObject node_vars_link_node4;
                                                        for (rest = (SubLObject)at_defns.NIL, rest = accessible_modules; at_defns.NIL == supports && at_defns.NIL != rest; rest = rest.rest()) {
                                                            module_var = rest.first();
                                                            _prev_bind_0_$189 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$187 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                node = function_terms.naut_to_nart(node_var);
                                                                if (at_defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                                    if (at_defns.NIL != d_link) {
                                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                                        if (at_defns.NIL != mt_links) {
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_defns.NIL == supports && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                mt_$204 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (at_defns.NIL != mt_relevance_macros.relevant_mtP(mt_$204)) {
                                                                                    _prev_bind_0_$190 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$204, thread);
                                                                                        for (iteration_state_$206 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_defns.NIL == supports && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$206); iteration_state_$206 = dictionary_contents.do_dictionary_contents_next(iteration_state_$206)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$206);
                                                                                            link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (at_defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                _prev_bind_0_$191 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    sol = link_nodes;
                                                                                                    if (at_defns.NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_defns.NIL == supports && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if (at_defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol.isList()) {
                                                                                                        if (at_defns.NIL == supports) {
                                                                                                            csome_list_var2 = sol;
                                                                                                            node_vars_link_node2 = (SubLObject)at_defns.NIL;
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                            while (at_defns.NIL == supports && at_defns.NIL != csome_list_var2) {
                                                                                                                if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$191, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$206);
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$190, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    }
                                                                    else {
                                                                        sbhl_paranoia.sbhl_error((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str48$attempting_to_bind_direction_link, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (at_defns.NIL != obsolete.cnat_p(node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                    new_list = ((at_defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)));
                                                                    for (rest_$208 = (SubLObject)at_defns.NIL, rest_$208 = new_list; at_defns.NIL == supports && at_defns.NIL != rest_$208; rest_$208 = rest_$208.rest()) {
                                                                        generating_fn = rest_$208.first();
                                                                        _prev_bind_0_$192 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                            if (at_defns.NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_defns.NIL == supports && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if (at_defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (sol2.isList()) {
                                                                                if (at_defns.NIL == supports) {
                                                                                    csome_list_var3 = sol2;
                                                                                    node_vars_link_node4 = (SubLObject)at_defns.NIL;
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                    while (at_defns.NIL == supports && at_defns.NIL != csome_list_var3) {
                                                                                        if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$192, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$187, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$189, thread);
                                                            }
                                                        }
                                                        node_var = deck.deck_pop(recur_deck);
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$189, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$186, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$186, thread);
                                                }
                                            }
                                            else {
                                                sbhl_paranoia.sbhl_warn((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$193, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$188, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$185, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$185, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$184, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$184, thread);
                                    }
                                }
                                finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$187, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$183, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$183, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$193 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$193, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$182, thread);
                        }
                    }
                    if (at_defns.NIL == supports) {
                        final SubLObject _prev_bind_0_$194 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$188 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$190 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$194 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                        try {
                            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                            if (at_defns.NIL == supports) {
                                SubLObject csome_list_var4 = disjoint_with.max_all_disjoint_with(collection, mt, (SubLObject)at_defns.UNPROVIDED);
                                SubLObject disjoint_col = (SubLObject)at_defns.NIL;
                                disjoint_col = csome_list_var4.first();
                                while (at_defns.NIL == supports && at_defns.NIL != csome_list_var4) {
                                    if (at_defns.NIL != quiet_defns_admitP(disjoint_col, v_term, mt)) {
                                        supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)at_defns.$kw111$DEFN, (SubLObject)ConsesLow.list(at_defns.$const109$isa, v_term, disjoint_col), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), arguments.make_hl_support((SubLObject)at_defns.$kw112$DISJOINTWITH, (SubLObject)ConsesLow.list(at_defns.$const113$disjointWith, collection, disjoint_col), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                                    }
                                    csome_list_var4 = csome_list_var4.rest();
                                    disjoint_col = csome_list_var4.first();
                                }
                            }
                        }
                        finally {
                            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3_$194, thread);
                            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2_$190, thread);
                            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1_$188, thread);
                            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0_$194, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$182, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$181, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$195 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$195, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 46838L)
    public static SubLObject hl_justify_not_quoted_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$216 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$217 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (at_defns.NIL == supports) {
                        SubLObject node_var = collection;
                        final SubLObject deck_type = (SubLObject)at_defns.$kw36$STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$217 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject mt_var_$219 = mt;
                                final SubLObject _prev_bind_0_$218 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$218 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$222 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$219), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$219), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$219), thread);
                                    final SubLObject tv_var = (SubLObject)at_defns.NIL;
                                    final SubLObject _prev_bind_0_$219 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$219 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind((at_defns.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_defns.NIL != tv_var) ? at_defns.$sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                        if (at_defns.NIL != tv_var && at_defns.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_defns.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql((SubLObject)at_defns.$kw38$ERROR)) {
                                                sbhl_paranoia.sbhl_error((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)at_defns.$kw41$CERROR)) {
                                                sbhl_paranoia.sbhl_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                            }
                                            else if (pcase_var.eql((SubLObject)at_defns.$kw43$WARN)) {
                                                Errors.warn((SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                            }
                                            else {
                                                Errors.warn((SubLObject)at_defns.$str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror((SubLObject)at_defns.$str42$continue_anyway, (SubLObject)at_defns.$str39$_A_is_not_a__A, tv_var, (SubLObject)at_defns.$sym40$SBHL_TRUE_TV_P);
                                            }
                                        }
                                        final SubLObject _prev_bind_0_$220 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$220 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$223 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_3_$228 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), thread);
                                            if (at_defns.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_defns.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) {
                                                final SubLObject _prev_bind_0_$221 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$221 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$224 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_defns.NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)at_defns.UNPROVIDED);
                                                    while (at_defns.NIL != node_var && at_defns.NIL == supports) {
                                                        final SubLObject genl = node_var;
                                                        final SubLObject _prev_bind_0_$222 = at_vars.$defn_collection$.currentBinding(thread);
                                                        try {
                                                            at_vars.$defn_collection$.bind(genl, thread);
                                                            if (at_defns.NIL == supports) {
                                                                SubLObject csome_list_var = (SubLObject)at_defns.$list46;
                                                                SubLObject defn_pred = (SubLObject)at_defns.NIL;
                                                                defn_pred = csome_list_var.first();
                                                                while (at_defns.NIL == supports && at_defns.NIL != csome_list_var) {
                                                                    final SubLObject pred_var = defn_pred;
                                                                    if (at_defns.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var)) {
                                                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, (SubLObject)at_defns.ONE_INTEGER, pred_var);
                                                                        SubLObject done_var = (SubLObject)at_defns.NIL;
                                                                        final SubLObject token_var = (SubLObject)at_defns.NIL;
                                                                        while (at_defns.NIL == done_var) {
                                                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                                            if (at_defns.NIL != valid) {
                                                                                SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                                                                try {
                                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                                                                    SubLObject done_var_$233 = (SubLObject)at_defns.NIL;
                                                                                    final SubLObject token_var_$234 = (SubLObject)at_defns.NIL;
                                                                                    while (at_defns.NIL == done_var_$233) {
                                                                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$234);
                                                                                        final SubLObject valid_$235 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$234.eql(assertion));
                                                                                        if (at_defns.NIL != valid_$235) {
                                                                                            final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                                            if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread)) && at_defns.NIL == quiet_quoted_defn_admitsP(defn, v_term, collection, mt)) {
                                                                                                if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                                                                    supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)at_defns.$kw110$GENLS, (SubLObject)ConsesLow.list(at_defns.$const45$genls, collection, at_vars.$defn_collection$.getDynamicValue(thread)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), supports);
                                                                                                }
                                                                                                supports = (SubLObject)ConsesLow.cons(assertion, supports);
                                                                                            }
                                                                                        }
                                                                                        done_var_$233 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$235);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    final SubLObject _prev_bind_0_$223 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                                                                        final SubLObject _values = Values.getValuesAsVector();
                                                                                        if (at_defns.NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                        Values.restoreValuesFromVector(_values);
                                                                                    }
                                                                                    finally {
                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$223, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid);
                                                                        }
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    defn_pred = csome_list_var.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            at_vars.$defn_collection$.rebind(_prev_bind_0_$222, thread);
                                                        }
                                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls));
                                                        SubLObject rest;
                                                        SubLObject module_var;
                                                        SubLObject _prev_bind_0_$224;
                                                        SubLObject _prev_bind_1_$222;
                                                        SubLObject node;
                                                        SubLObject d_link;
                                                        SubLObject mt_links;
                                                        SubLObject iteration_state;
                                                        SubLObject mt_$239;
                                                        SubLObject tv_links;
                                                        SubLObject _prev_bind_0_$225;
                                                        SubLObject iteration_state_$241;
                                                        SubLObject tv;
                                                        SubLObject link_nodes;
                                                        SubLObject _prev_bind_0_$226;
                                                        SubLObject sol;
                                                        SubLObject set_contents_var;
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject node_vars_link_node;
                                                        SubLObject csome_list_var2;
                                                        SubLObject node_vars_link_node2;
                                                        SubLObject new_list;
                                                        SubLObject rest_$243;
                                                        SubLObject generating_fn;
                                                        SubLObject _prev_bind_0_$227;
                                                        SubLObject sol2;
                                                        SubLObject link_nodes2;
                                                        SubLObject set_contents_var2;
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject node_vars_link_node3;
                                                        SubLObject csome_list_var3;
                                                        SubLObject node_vars_link_node4;
                                                        for (rest = (SubLObject)at_defns.NIL, rest = accessible_modules; at_defns.NIL == supports && at_defns.NIL != rest; rest = rest.rest()) {
                                                            module_var = rest.first();
                                                            _prev_bind_0_$224 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$222 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_defns.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_defns.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                node = function_terms.naut_to_nart(node_var);
                                                                if (at_defns.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                                    if (at_defns.NIL != d_link) {
                                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED));
                                                                        if (at_defns.NIL != mt_links) {
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_defns.NIL == supports && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                mt_$239 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (at_defns.NIL != mt_relevance_macros.relevant_mtP(mt_$239)) {
                                                                                    _prev_bind_0_$225 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$239, thread);
                                                                                        for (iteration_state_$241 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_defns.NIL == supports && at_defns.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$241); iteration_state_$241 = dictionary_contents.do_dictionary_contents_next(iteration_state_$241)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$241);
                                                                                            link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (at_defns.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                _prev_bind_0_$226 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    sol = link_nodes;
                                                                                                    if (at_defns.NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_defns.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_defns.NIL == supports && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if (at_defns.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_defns.UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol.isList()) {
                                                                                                        if (at_defns.NIL == supports) {
                                                                                                            csome_list_var2 = sol;
                                                                                                            node_vars_link_node2 = (SubLObject)at_defns.NIL;
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                            while (at_defns.NIL == supports && at_defns.NIL != csome_list_var2) {
                                                                                                                if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_defns.UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$226, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$241);
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$225, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    }
                                                                    else {
                                                                        sbhl_paranoia.sbhl_error((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str48$attempting_to_bind_direction_link, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (at_defns.NIL != obsolete.cnat_p(node, (SubLObject)at_defns.UNPROVIDED)) {
                                                                    new_list = ((at_defns.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)));
                                                                    for (rest_$243 = (SubLObject)at_defns.NIL, rest_$243 = new_list; at_defns.NIL == supports && at_defns.NIL != rest_$243; rest_$243 = rest_$243.rest()) {
                                                                        generating_fn = rest_$243.first();
                                                                        _prev_bind_0_$227 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                            if (at_defns.NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_defns.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_defns.NIL == supports && at_defns.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if (at_defns.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_defns.UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (sol2.isList()) {
                                                                                if (at_defns.NIL == supports) {
                                                                                    csome_list_var3 = sol2;
                                                                                    node_vars_link_node4 = (SubLObject)at_defns.NIL;
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                    while (at_defns.NIL == supports && at_defns.NIL != csome_list_var3) {
                                                                                        if (at_defns.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_defns.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)at_defns.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$227, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$222, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$224, thread);
                                                            }
                                                        }
                                                        node_var = deck.deck_pop(recur_deck);
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$224, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$221, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$221, thread);
                                                }
                                            }
                                            else {
                                                sbhl_paranoia.sbhl_warn((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_defns.UNPROVIDED)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$228, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$223, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$220, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$220, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$219, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$219, thread);
                                    }
                                }
                                finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$222, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$218, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$218, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$228 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$228, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$217, thread);
                        }
                    }
                    if (at_defns.NIL == supports) {
                        final SubLObject _prev_bind_0_$229 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$223 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$225 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$229 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                        try {
                            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
                            if (at_defns.NIL == supports) {
                                SubLObject csome_list_var4 = disjoint_with.max_all_disjoint_with(collection, mt, (SubLObject)at_defns.UNPROVIDED);
                                SubLObject disjoint_col = (SubLObject)at_defns.NIL;
                                disjoint_col = csome_list_var4.first();
                                while (at_defns.NIL == supports && at_defns.NIL != csome_list_var4) {
                                    if (at_defns.NIL != quiet_quoted_defns_admitP(disjoint_col, v_term, mt)) {
                                        supports = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)at_defns.$kw111$DEFN, (SubLObject)ConsesLow.list(at_defns.$const114$quotedIsa, v_term, disjoint_col), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), arguments.make_hl_support((SubLObject)at_defns.$kw112$DISJOINTWITH, (SubLObject)ConsesLow.list(at_defns.$const113$disjointWith, collection, disjoint_col), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                                    }
                                    csome_list_var4 = csome_list_var4.rest();
                                    disjoint_col = csome_list_var4.first();
                                }
                            }
                        }
                        finally {
                            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3_$229, thread);
                            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2_$225, thread);
                            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1_$223, thread);
                            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0_$229, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$217, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$216, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$230 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$230, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 48313L)
    public static SubLObject collection_rejects_via_disjoint_defnsP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejectP = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            if (at_defns.NIL == rejectP) {
                SubLObject csome_list_var;
                SubLObject disjoint_col;
                for (csome_list_var = disjoint_with.max_all_disjoint_with(collection, mt, (SubLObject)at_defns.UNPROVIDED), disjoint_col = (SubLObject)at_defns.NIL, disjoint_col = csome_list_var.first(); at_defns.NIL == rejectP && at_defns.NIL != csome_list_var; rejectP = defns_admitP(disjoint_col, v_term, mt), csome_list_var = csome_list_var.rest(), disjoint_col = csome_list_var.first()) {}
            }
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return rejectP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 48834L)
    public static SubLObject why_collection_rejects_via_disjoint_defnsP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)at_defns.NIL, thread);
            if (at_defns.NIL == just) {
                SubLObject csome_list_var = disjoint_with.max_all_disjoint_with(collection, mt, (SubLObject)at_defns.UNPROVIDED);
                SubLObject disjoint_col = (SubLObject)at_defns.NIL;
                disjoint_col = csome_list_var.first();
                while (at_defns.NIL == just && at_defns.NIL != csome_list_var) {
                    if (at_defns.NIL != defns_admitP(disjoint_col, v_term, mt)) {
                        just = ConsesLow.nconc(disjoint_with.why_disjoint_withP(collection, disjoint_col, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), why_sufficient_defns_admitP(disjoint_col, v_term, mt));
                    }
                    csome_list_var = csome_list_var.rest();
                    disjoint_col = csome_list_var.first();
                }
            }
        }
        finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return just;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 49482L)
    public static SubLObject collections_admitting_term_via_defns(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject _prev_bind_0_$251 = control_vars.$mapping_data_1$.currentBinding(thread);
                final SubLObject _prev_bind_1_$252 = control_vars.$mapping_answer$.currentBinding(thread);
                final SubLObject _prev_bind_2_$253 = at_defns.$cat_defns_failing$.currentBinding(thread);
                try {
                    control_vars.$mapping_data_1$.bind(v_term, thread);
                    control_vars.$mapping_answer$.bind(Hashtables.make_hash_table((SubLObject)at_defns.$int115$64, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), thread);
                    at_defns.$cat_defns_failing$.bind(Hashtables.make_hash_table((SubLObject)at_defns.$int115$64, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), thread);
                    genl_predicates.map_all_spec_preds(at_defns.$const116$defnSufficient, (SubLObject)at_defns.$sym117$COLLECTIONS_ADMITTING_TERM_VIA_DEFNS_1, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    final SubLObject cdohash_table = control_vars.$mapping_answer$.getDynamicValue(thread);
                    SubLObject defn = (SubLObject)at_defns.NIL;
                    SubLObject cols = (SubLObject)at_defns.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            defn = Hashtables.getEntryKey(cdohash_entry);
                            cols = Hashtables.getEntryValue(cdohash_entry);
                            result = conses_high.nunion(result, cols, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    at_defns.$cat_defns_failing$.rebind(_prev_bind_2_$253, thread);
                    control_vars.$mapping_answer$.rebind(_prev_bind_1_$252, thread);
                    control_vars.$mapping_data_1$.rebind(_prev_bind_0_$251, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$252 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$252, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 49991L)
    public static SubLObject min_max_collections_admitting_term_via_defns(final SubLObject v_term, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$255 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$256 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2_$257 = control_vars.$mapping_data_1$.currentBinding(thread);
                final SubLObject _prev_bind_3_$258 = control_vars.$mapping_answer$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    control_vars.$mapping_data_1$.bind(v_term, thread);
                    control_vars.$mapping_answer$.bind(Hashtables.make_hash_table((SubLObject)at_defns.$int115$64, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), thread);
                    genl_predicates.map_all_spec_preds(at_defns.$const116$defnSufficient, (SubLObject)at_defns.$sym117$COLLECTIONS_ADMITTING_TERM_VIA_DEFNS_1, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    final SubLObject cdohash_table = control_vars.$mapping_answer$.getDynamicValue(thread);
                    SubLObject defn = (SubLObject)at_defns.NIL;
                    SubLObject cols = (SubLObject)at_defns.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            defn = Hashtables.getEntryKey(cdohash_entry);
                            cols = Hashtables.getEntryValue(cdohash_entry);
                            result = conses_high.nunion(result, genls.max_cols(cols, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    control_vars.$mapping_answer$.rebind(_prev_bind_3_$258, thread);
                    control_vars.$mapping_data_1$.rebind(_prev_bind_2_$257, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$256, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$255, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$256 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    clear_defn_space();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$256, thread);
                }
            }
        }
        finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return genls.min_cols(result, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 50458L)
    public static SubLObject collections_admitting_term_via_defns_1(final SubLObject suff_defn_pred) {
        if (at_defns.NIL != forts.fort_p(suff_defn_pred)) {
            kb_mapping.map_predicate_extent_index((SubLObject)at_defns.$sym118$GATHER_COLLECTIONS_ADMITTING_VIA_DEFNS, suff_defn_pred, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 50666L)
    public static SubLObject gather_collections_admitting_via_defns(final SubLObject suff_defn_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != assertions_high.gaf_assertionP(suff_defn_assertion)) {
            final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
            try {
                at_vars.$defn_collection$.bind(assertions_high.gaf_arg1(suff_defn_assertion), thread);
                final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(suff_defn_assertion));
                if (at_defns.NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                    if (at_defns.NIL != Hashtables.gethash_without_values(defn, control_vars.$mapping_answer$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)) {
                        hash_table_utilities.pushnew_hash(defn, at_vars.$defn_collection$.getDynamicValue(thread), control_vars.$mapping_answer$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
                    }
                    else if (at_defns.NIL == Hashtables.gethash_without_values(defn, at_defns.$cat_defns_failing$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)) {
                        if (at_defns.NIL != quiet_defn_admitsP(defn, control_vars.$mapping_data_1$.getDynamicValue(thread), at_vars.$defn_collection$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)) {
                            hash_table_utilities.pushnew_hash(defn, at_vars.$defn_collection$.getDynamicValue(thread), control_vars.$mapping_answer$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED);
                        }
                        else {
                            Hashtables.sethash(defn, at_defns.$cat_defns_failing$.getDynamicValue(thread), (SubLObject)at_defns.T);
                        }
                    }
                }
            }
            finally {
                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 51348L)
    public static SubLObject defn_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
        if (arg1 == at_defns.UNPROVIDED) {
            arg1 = (SubLObject)at_defns.NIL;
        }
        if (arg2 == at_defns.UNPROVIDED) {
            arg2 = (SubLObject)at_defns.NIL;
        }
        if (arg3 == at_defns.UNPROVIDED) {
            arg3 = (SubLObject)at_defns.NIL;
        }
        if (arg4 == at_defns.UNPROVIDED) {
            arg4 = (SubLObject)at_defns.NIL;
        }
        if (arg5 == at_defns.UNPROVIDED) {
            arg5 = (SubLObject)at_defns.NIL;
        }
        if (arg6 == at_defns.UNPROVIDED) {
            arg6 = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(level)) {
            PrintLow.format((SubLObject)at_defns.T, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5, arg6 });
            return (SubLObject)at_defns.NIL;
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 51613L)
    public static SubLObject defn_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == at_defns.UNPROVIDED) {
            arg1 = (SubLObject)at_defns.NIL;
        }
        if (arg2 == at_defns.UNPROVIDED) {
            arg2 = (SubLObject)at_defns.NIL;
        }
        if (arg3 == at_defns.UNPROVIDED) {
            arg3 = (SubLObject)at_defns.NIL;
        }
        if (arg4 == at_defns.UNPROVIDED) {
            arg4 = (SubLObject)at_defns.NIL;
        }
        if (arg5 == at_defns.UNPROVIDED) {
            arg5 = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror((SubLObject)at_defns.$str42$continue_anyway, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        else if (Numbers.add((SubLObject)at_defns.TWO_INTEGER, at_vars.$defn_trace_level$.getDynamicValue(thread)).numGE(level)) {
            PrintLow.format((SubLObject)at_defns.T, Sequences.cconcatenate((SubLObject)at_defns.$str119$__warn__, format_str), new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 51932L)
    public static SubLObject defn_cerror(final SubLObject level, final SubLObject continue_str, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == at_defns.UNPROVIDED) {
            arg1 = (SubLObject)at_defns.NIL;
        }
        if (arg2 == at_defns.UNPROVIDED) {
            arg2 = (SubLObject)at_defns.NIL;
        }
        if (arg3 == at_defns.UNPROVIDED) {
            arg3 = (SubLObject)at_defns.NIL;
        }
        if (arg4 == at_defns.UNPROVIDED) {
            arg4 = (SubLObject)at_defns.NIL;
        }
        if (arg5 == at_defns.UNPROVIDED) {
            arg5 = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        else if (Numbers.add((SubLObject)at_defns.TWO_INTEGER, at_vars.$defn_trace_level$.getDynamicValue(thread)).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 52230L)
    public static SubLObject defn_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == at_defns.UNPROVIDED) {
            arg1 = (SubLObject)at_defns.NIL;
        }
        if (arg2 == at_defns.UNPROVIDED) {
            arg2 = (SubLObject)at_defns.NIL;
        }
        if (arg3 == at_defns.UNPROVIDED) {
            arg3 = (SubLObject)at_defns.NIL;
        }
        if (arg4 == at_defns.UNPROVIDED) {
            arg4 = (SubLObject)at_defns.NIL;
        }
        if (arg5 == at_defns.UNPROVIDED) {
            arg5 = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(level)) {
            Functions.apply((SubLObject)at_defns.$sym120$WARN, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
            return (SubLObject)at_defns.NIL;
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 52420L)
    public static SubLObject reset_defn_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue(thread);
        SubLObject meter_cache = (SubLObject)at_defns.NIL;
        meter_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            Functions.funcall(Hashtables.gethash((SubLObject)at_defns.$kw12$RESET, meter_cache, (SubLObject)at_defns.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            meter_cache = cdolist_list_var.first();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 52631L)
    public static SubLObject report_defn_meters(SubLObject stream) {
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue(thread);
        SubLObject meter_cache = (SubLObject)at_defns.NIL;
        meter_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, meter_cache, (SubLObject)at_defns.UNPROVIDED).numG((SubLObject)at_defns.ZERO_INTEGER)) {
                report_defn_meter_cache(meter_cache, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meter_cache = cdolist_list_var.first();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 52847L)
    public static SubLObject summarize_defn_meters(SubLObject stream) {
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function_col_width = function_col_width(at_vars.$defn_meter_caches$.getDynamicValue(thread));
        summarize_defn_meter_cache_header(function_col_width, stream);
        SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue(thread);
        SubLObject meter_cache = (SubLObject)at_defns.NIL;
        meter_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, meter_cache, (SubLObject)at_defns.UNPROVIDED).numG((SubLObject)at_defns.ZERO_INTEGER)) {
                summarize_defn_meter_cache(meter_cache, function_col_width, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meter_cache = cdolist_list_var.first();
        }
        summarize_defn_meter_cache_trailer(function_col_width, stream);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 53293L)
    public static SubLObject summarize_defn_meter_cache_header(SubLObject fn_col_width, SubLObject stream) {
        if (fn_col_width == at_defns.UNPROVIDED) {
            fn_col_width = (SubLObject)at_defns.TEN_INTEGER;
        }
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        PrintLow.format(stream, (SubLObject)at_defns.$str121$____defn_module_meters_);
        string_utilities.tab(Numbers.add(fn_col_width, (SubLObject)at_defns.$int122$27), stream, (SubLObject)at_defns.NIL, (SubLObject)at_defns.$str123$_, (SubLObject)at_defns.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)at_defns.$str124$_____a__, string_utilities.right_justify((SubLObject)at_defns.$str125$function, fn_col_width, (SubLObject)at_defns.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)at_defns.$str126$___calls___);
        PrintLow.format(stream, (SubLObject)at_defns.$str127$___total_time___);
        PrintLow.format(stream, (SubLObject)at_defns.$str128$____avg_time____);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 53660L)
    public static SubLObject summarize_defn_meter_cache(final SubLObject meter_cache, SubLObject fn_col_width, SubLObject stream) {
        if (fn_col_width == at_defns.UNPROVIDED) {
            fn_col_width = (SubLObject)at_defns.TEN_INTEGER;
        }
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        final SubLObject name = PrintLow.format((SubLObject)at_defns.NIL, (SubLObject)at_defns.$str129$_s, Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, meter_cache, (SubLObject)at_defns.UNPROVIDED));
        final SubLObject calls = Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, meter_cache, (SubLObject)at_defns.UNPROVIDED);
        if (at_defns.NIL != calls && calls.numG((SubLObject)at_defns.ZERO_INTEGER)) {
            final SubLObject times = (SubLObject)((at_defns.NIL != calls && calls.numG((SubLObject)at_defns.ZERO_INTEGER)) ? Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, meter_cache, (SubLObject)at_defns.UNPROVIDED) : at_defns.NIL);
            final SubLObject total = (SubLObject)((at_defns.NIL != times) ? Functions.apply(Symbols.symbol_function((SubLObject)at_defns.$sym130$_), times) : at_defns.NIL);
            final SubLObject avg = (SubLObject)((at_defns.NIL != total) ? Numbers.divide(total, calls) : at_defns.NIL);
            PrintLow.format(stream, (SubLObject)at_defns.$str124$_____a__, string_utilities.right_justify(Strings.string_downcase(name, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED), fn_col_width, (SubLObject)at_defns.UNPROVIDED));
            PrintLow.format(stream, (SubLObject)at_defns.$str131$____a___, string_utilities.left_justify(string_utilities.right_justify(string_utilities.str(calls), (SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.UNPROVIDED));
            if (at_defns.NIL != total) {
                PrintLow.format(stream, (SubLObject)at_defns.$str131$____a___, string_utilities.align_char(PrintLow.format((SubLObject)at_defns.NIL, (SubLObject)at_defns.$str132$_a, number_utilities.float_n(total, (SubLObject)at_defns.TWO_INTEGER)), string_utilities.$point_char$.getGlobalValue(), (SubLObject)at_defns.TEN_INTEGER, (SubLObject)at_defns.SEVEN_INTEGER, (SubLObject)at_defns.UNPROVIDED));
            }
            else {
                string_utilities.tab((SubLObject)at_defns.SIXTEEN_INTEGER, stream, (SubLObject)at_defns.NIL, (SubLObject)at_defns.$str133$_, (SubLObject)at_defns.UNPROVIDED);
            }
            if (at_defns.NIL != avg) {
                PrintLow.format(stream, (SubLObject)at_defns.$str131$____a___, string_utilities.align_char(string_utilities.str(number_utilities.float_n(avg, (SubLObject)at_defns.TWO_INTEGER)), string_utilities.$point_char$.getGlobalValue(), (SubLObject)at_defns.TEN_INTEGER, (SubLObject)at_defns.SEVEN_INTEGER, (SubLObject)at_defns.UNPROVIDED));
            }
            else {
                string_utilities.tab((SubLObject)at_defns.SIXTEEN_INTEGER, stream, (SubLObject)at_defns.NIL, (SubLObject)at_defns.$str133$_, (SubLObject)at_defns.UNPROVIDED);
            }
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 54515L)
    public static SubLObject summarize_defn_meter_cache_trailer(SubLObject fn_col_width, SubLObject stream) {
        if (fn_col_width == at_defns.UNPROVIDED) {
            fn_col_width = (SubLObject)at_defns.TEN_INTEGER;
        }
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        string_utilities.tab(Numbers.add(fn_col_width, (SubLObject)at_defns.$int134$46), stream, (SubLObject)at_defns.T, (SubLObject)at_defns.$str123$_, (SubLObject)at_defns.UNPROVIDED);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 54662L)
    public static SubLObject report_defn_meter_cache(final SubLObject meter_cache, SubLObject stream) {
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        final SubLObject meter_col_widths = meter_col_widths(meter_cache);
        report_defn_meter_cache_header(meter_cache, meter_col_widths, stream);
        SubLObject cdotimes_end_var;
        SubLObject n;
        for (cdotimes_end_var = Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, meter_cache, (SubLObject)at_defns.UNPROVIDED), n = (SubLObject)at_defns.NIL, n = (SubLObject)at_defns.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)at_defns.ONE_INTEGER)) {
            report_defn_meter_cache_call(meter_cache, Numbers.add((SubLObject)at_defns.ONE_INTEGER, n), meter_col_widths, stream);
        }
        report_defn_meter_cache_total(meter_cache, meter_col_widths, stream);
        report_defn_meter_cache_trailer(meter_cache, meter_col_widths, stream);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 55160L)
    public static SubLObject report_defn_meter_cache_header(final SubLObject meter_cache, SubLObject col_widths, SubLObject stream) {
        if (col_widths == at_defns.UNPROVIDED) {
            col_widths = meter_col_widths(meter_cache);
        }
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        final SubLObject name = PrintLow.format((SubLObject)at_defns.NIL, (SubLObject)at_defns.$str135$_s_, Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, meter_cache, (SubLObject)at_defns.UNPROVIDED));
        final SubLObject length = Sequences.length(name);
        PrintLow.format(stream, (SubLObject)at_defns.$str136$_____a, Strings.string_downcase(name, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        SubLObject cdolist_list_var = col_widths;
        SubLObject width = (SubLObject)at_defns.NIL;
        width = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            string_utilities.tab(Numbers.add((SubLObject)at_defns.SIX_INTEGER, width), stream, (SubLObject)at_defns.NIL, (SubLObject)at_defns.$str123$_, (SubLObject)at_defns.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            width = cdolist_list_var.first();
        }
        string_utilities.tab(Numbers.subtract((SubLObject)at_defns.$int137$37, length), stream, (SubLObject)at_defns.NIL, (SubLObject)at_defns.$str123$_, (SubLObject)at_defns.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)at_defns.$str138$______call__);
        SubLObject m = (SubLObject)at_defns.ZERO_INTEGER;
        SubLObject cdolist_list_var2 = Hashtables.gethash((SubLObject)at_defns.$kw8$ARG_LIST, meter_cache, (SubLObject)at_defns.UNPROVIDED);
        SubLObject arg = (SubLObject)at_defns.NIL;
        arg = cdolist_list_var2.first();
        while (at_defns.NIL != cdolist_list_var2) {
            final SubLObject name_$260 = Strings.string_downcase(PrintLow.format((SubLObject)at_defns.NIL, (SubLObject)at_defns.$str129$_s, arg), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            final SubLObject width2 = ConsesLow.nth(m, col_widths);
            final SubLObject label = string_utilities.substring(name_$260, (SubLObject)at_defns.ZERO_INTEGER, Numbers.min(width2, Sequences.length(name_$260)));
            PrintLow.format(stream, (SubLObject)at_defns.$str139$____a___, string_utilities.center_string(label, width2, (SubLObject)at_defns.UNPROVIDED));
            m = Numbers.add(m, (SubLObject)at_defns.ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            arg = cdolist_list_var2.first();
        }
        PrintLow.format(stream, (SubLObject)at_defns.$str140$____result____);
        PrintLow.format(stream, (SubLObject)at_defns.$str141$_____time_____);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 55956L)
    public static SubLObject report_defn_meter_cache_trailer(final SubLObject meter_cache, SubLObject col_widths, SubLObject stream) {
        if (col_widths == at_defns.UNPROVIDED) {
            col_widths = meter_col_widths(meter_cache);
        }
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        final SubLObject length = Sequences.length(PrintLow.format((SubLObject)at_defns.NIL, (SubLObject)at_defns.$str135$_s_, Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, meter_cache, (SubLObject)at_defns.UNPROVIDED)));
        string_utilities.tab(length, stream, (SubLObject)at_defns.T, (SubLObject)at_defns.$str123$_, (SubLObject)at_defns.UNPROVIDED);
        SubLObject cdolist_list_var = col_widths;
        SubLObject width = (SubLObject)at_defns.NIL;
        width = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            string_utilities.tab(Numbers.add((SubLObject)at_defns.SIX_INTEGER, width), stream, (SubLObject)at_defns.NIL, (SubLObject)at_defns.$str123$_, (SubLObject)at_defns.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            width = cdolist_list_var.first();
        }
        string_utilities.tab(Numbers.subtract((SubLObject)at_defns.$int137$37, length), stream, (SubLObject)at_defns.NIL, (SubLObject)at_defns.$str123$_, (SubLObject)at_defns.UNPROVIDED);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 56312L)
    public static SubLObject report_defn_meter_cache_call(final SubLObject meter_cache, final SubLObject n, SubLObject col_widths, SubLObject stream) {
        if (col_widths == at_defns.UNPROVIDED) {
            col_widths = meter_col_widths(meter_cache);
        }
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        PrintLow.format(stream, (SubLObject)at_defns.$str142$____a, string_utilities.center_string(PrintLow.format((SubLObject)at_defns.NIL, (SubLObject)at_defns.$str132$_a, n), (SubLObject)at_defns.NINE_INTEGER, (SubLObject)at_defns.UNPROVIDED));
        SubLObject m = (SubLObject)at_defns.ZERO_INTEGER;
        SubLObject cdolist_list_var = ConsesLow.nth(Numbers.subtract(n, (SubLObject)at_defns.ONE_INTEGER), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, meter_cache, (SubLObject)at_defns.UNPROVIDED));
        SubLObject arg = (SubLObject)at_defns.NIL;
        arg = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            final SubLObject name = PrintLow.format((SubLObject)at_defns.NIL, (SubLObject)at_defns.$str129$_s, arg);
            final SubLObject width = ConsesLow.nth(m, col_widths);
            final SubLObject label = string_utilities.substring(name, (SubLObject)at_defns.ZERO_INTEGER, Numbers.min(width, Sequences.length(name)));
            PrintLow.format(stream, (SubLObject)at_defns.$str139$____a___, string_utilities.center_string(label, width, (SubLObject)at_defns.UNPROVIDED));
            m = Numbers.add(m, (SubLObject)at_defns.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        PrintLow.format(stream, (SubLObject)at_defns.$str139$____a___, string_utilities.center_string(PrintLow.format((SubLObject)at_defns.NIL, (SubLObject)at_defns.$str132$_a, ConsesLow.nth(Numbers.subtract(n, (SubLObject)at_defns.ONE_INTEGER), Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, meter_cache, (SubLObject)at_defns.UNPROVIDED))), (SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)at_defns.$str139$____a___, string_utilities.center_string(PrintLow.format((SubLObject)at_defns.NIL, (SubLObject)at_defns.$str132$_a, number_utilities.float_n(ConsesLow.nth(Numbers.subtract(n, (SubLObject)at_defns.ONE_INTEGER), Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, meter_cache, (SubLObject)at_defns.UNPROVIDED)), (SubLObject)at_defns.FOUR_INTEGER)), (SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED));
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 57052L)
    public static SubLObject report_defn_meter_cache_total(final SubLObject meter_cache, SubLObject col_widths, SubLObject stream) {
        if (col_widths == at_defns.UNPROVIDED) {
            col_widths = meter_col_widths(meter_cache);
        }
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        PrintLow.format(stream, (SubLObject)at_defns.$str142$____a, string_utilities.center_string((SubLObject)at_defns.$str143$total, (SubLObject)at_defns.NINE_INTEGER, (SubLObject)at_defns.UNPROVIDED));
        SubLObject cdolist_list_var = col_widths;
        SubLObject width = (SubLObject)at_defns.NIL;
        width = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            string_utilities.tab(Numbers.add((SubLObject)at_defns.SIX_INTEGER, width), stream, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            width = cdolist_list_var.first();
        }
        string_utilities.tab((SubLObject)at_defns.FOURTEEN_INTEGER, stream, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        final SubLObject times = Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, meter_cache, (SubLObject)at_defns.UNPROVIDED);
        final SubLObject total = (SubLObject)((at_defns.NIL != times) ? Functions.apply(Symbols.symbol_function((SubLObject)at_defns.$sym130$_), times) : at_defns.NIL);
        if (at_defns.NIL != total) {
            PrintLow.format(stream, (SubLObject)at_defns.$str139$____a___, string_utilities.center_string(PrintLow.format((SubLObject)at_defns.NIL, (SubLObject)at_defns.$str132$_a, number_utilities.float_n(total, (SubLObject)at_defns.FOUR_INTEGER)), (SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED));
        }
        else {
            string_utilities.tab((SubLObject)at_defns.FOURTEEN_INTEGER, stream, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 57525L)
    public static SubLObject function_col_width(final SubLObject meter_caches) {
        SubLObject width = (SubLObject)at_defns.NIL;
        SubLObject cdolist_list_var = meter_caches;
        SubLObject meter_cache = (SubLObject)at_defns.NIL;
        meter_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, meter_cache, (SubLObject)at_defns.UNPROVIDED).numG((SubLObject)at_defns.ZERO_INTEGER)) {
                if (at_defns.NIL != width) {
                    width = Numbers.max(width, string_utilities.print_length(Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, meter_cache, (SubLObject)at_defns.UNPROVIDED)));
                }
                else {
                    width = string_utilities.print_length(Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, meter_cache, (SubLObject)at_defns.UNPROVIDED));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            meter_cache = cdolist_list_var.first();
        }
        return width;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 57859L)
    public static SubLObject meter_col_widths(final SubLObject meter_cache) {
        final SubLObject titles = Hashtables.gethash((SubLObject)at_defns.$kw8$ARG_LIST, meter_cache, (SubLObject)at_defns.UNPROVIDED);
        final SubLObject data = Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, meter_cache, (SubLObject)at_defns.UNPROVIDED);
        final SubLObject calls = Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, meter_cache, (SubLObject)at_defns.UNPROVIDED);
        SubLObject widths = (SubLObject)at_defns.NIL;
        SubLObject cdotimes_end_var;
        SubLObject n;
        SubLObject width;
        SubLObject m;
        for (cdotimes_end_var = Sequences.length(titles), n = (SubLObject)at_defns.NIL, n = (SubLObject)at_defns.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)at_defns.ONE_INTEGER)) {
            width = string_utilities.print_length(ConsesLow.nth(n, titles));
            for (m = (SubLObject)at_defns.NIL, m = (SubLObject)at_defns.ZERO_INTEGER; m.numL(calls); m = Numbers.add(m, (SubLObject)at_defns.ONE_INTEGER)) {
                width = Numbers.max(width, string_utilities.print_length(ConsesLow.nth(n, ConsesLow.nth(m, data))));
            }
            widths = (SubLObject)ConsesLow.cons(Numbers.min((SubLObject)at_defns.FIFTEEN_INTEGER, Numbers.add((SubLObject)at_defns.TWO_INTEGER, width)), widths);
        }
        return Sequences.nreverse(widths);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 58285L)
    public static SubLObject suf_defn_assertions(final SubLObject collection) {
        if (at_defns.NIL != forts.fort_p(collection)) {
            return suf_defn_cache_get(collection);
        }
        if (at_defns.NIL != obsolete.reifiable_natP(collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
            return suf_defn_assertions(narts_high.find_nart(collection));
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 58626L)
    public static SubLObject suf_defnP(final SubLObject collection, final SubLObject defn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_suf_defnP(collection, defn, (SubLObject)at_defns.UNPROVIDED);
        }
        return old_suf_defnP(collection, defn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 58796L)
    public static SubLObject old_suf_defnP(final SubLObject collection, final SubLObject defn) {
        SubLObject foundP = (SubLObject)at_defns.NIL;
        if (at_defns.NIL == foundP) {
            SubLObject csome_list_var = suf_defn_assertions(collection);
            SubLObject assertion = (SubLObject)at_defns.NIL;
            assertion = csome_list_var.first();
            while (at_defns.NIL == foundP && at_defns.NIL != csome_list_var) {
                if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED)) {
                    foundP = Equality.eql(defn, el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion)));
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 59103L)
    public static SubLObject any_sufficient_defn_anywhereP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.has_suf_defn_somewhereP(collection, (SubLObject)at_defns.NIL);
        }
        return old_any_sufficient_defn_anywhereP(collection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 59312L)
    public static SubLObject old_any_sufficient_defn_anywhereP(final SubLObject collection) {
        SubLObject foundP = (SubLObject)at_defns.NIL;
        if (at_defns.NIL == foundP) {
            SubLObject csome_list_var = suf_defn_assertions(collection);
            SubLObject assertion = (SubLObject)at_defns.NIL;
            assertion = csome_list_var.first();
            while (at_defns.NIL == foundP && at_defns.NIL != csome_list_var) {
                if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED)) {
                    foundP = (SubLObject)at_defns.T;
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 59576L)
    public static SubLObject suf_defn_assertionP(final SubLObject col, final SubLObject assertion) {
        return subl_promotions.memberP(assertion, suf_defn_cache_get(col), Symbols.symbol_function((SubLObject)at_defns.$sym144$KBEQ), (SubLObject)at_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 59690L)
    public static SubLObject add_suf_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_add_suf_defn(source, assertion);
        }
        return old_add_suf_defn(source, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 60006L)
    public static SubLObject add_iff_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_add_iff_defn(source, assertion);
        }
        return old_add_suf_defn(source, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 60194L)
    public static SubLObject old_add_suf_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg1(assertion);
            final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
            if (at_defns.NIL != control_vars.$bootstrapping_kbP$.getDynamicValue(thread) && at_defns.NIL != forts.fort_p(col) && defn.isSymbol()) {
                cache_suf_defn(col, assertion);
            }
            else {
                final SubLObject _prev_bind_0_$261 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$262 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym147$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject valid_defnP = valid_defnP(defn, col);
                    final SubLObject collectionP = forts.fort_p(col);
                    if (at_defns.NIL != collectionP && at_defns.NIL != valid_defnP) {
                        cache_suf_defn(col, assertion);
                    }
                    else if (at_defns.NIL == collectionP) {
                        defn_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str148$skip_defn_op, (SubLObject)at_defns.$str149$_s_is_not_a_collection_in__s, col, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    }
                    else if (at_defns.NIL == valid_defnP) {
                        defn_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str148$skip_defn_op, (SubLObject)at_defns.$str150$_s_is_not_a_symbol, defn, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$262, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$261, thread);
                }
            }
        }
        finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 61066L)
    public static SubLObject remove_suf_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_remove_suf_defn(source, assertion);
        }
        return old_remove_suf_defn(source, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 61265L)
    public static SubLObject remove_iff_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_remove_iff_defn(source, assertion);
        }
        return old_remove_suf_defn(source, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 61464L)
    public static SubLObject old_remove_suf_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg1(assertion);
            final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
            if (at_defns.NIL != control_vars.$bootstrapping_kbP$.getDynamicValue(thread) && at_defns.NIL != forts.fort_p(col) && defn.isSymbol()) {
                uncache_suf_defn(col, assertion);
            }
            else {
                final SubLObject _prev_bind_0_$263 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$264 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym147$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject valid_defnP = valid_defnP(defn, col);
                    final SubLObject collectionP = forts.fort_p(col);
                    if (at_defns.NIL != collectionP && at_defns.NIL != valid_defnP) {
                        uncache_suf_defn(col, assertion);
                    }
                    else if (at_defns.NIL == collectionP) {
                        defn_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str148$skip_defn_op, (SubLObject)at_defns.$str149$_s_is_not_a_collection_in__s, col, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    }
                    else if (at_defns.NIL == valid_defnP) {
                        defn_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str148$skip_defn_op, (SubLObject)at_defns.$str150$_s_is_not_a_symbol, defn, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$264, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$263, thread);
                }
            }
        }
        finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 62492L)
    public static SubLObject reset_cache_suf_defn_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list156);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym157$CACHE_SUF_DEFN);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 62492L)
    public static SubLObject cache_suf_defn_metered(final SubLObject col, final SubLObject assertion) {
        cache_suf_defn_int(col, assertion, (SubLObject)at_defns.UNPROVIDED);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 62492L)
    public static SubLObject cache_suf_defn(final SubLObject col, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = cache_suf_defn_metered(col, assertion);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, assertion), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$cache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return cache_suf_defn_metered(col, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 62606L)
    public static SubLObject reset_uncache_suf_defn_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list156);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym160$UNCACHE_SUF_DEFN);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 62606L)
    public static SubLObject uncache_suf_defn_metered(final SubLObject col, final SubLObject assertion) {
        uncache_suf_defn_int(col, assertion, (SubLObject)at_defns.UNPROVIDED);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 62606L)
    public static SubLObject uncache_suf_defn(final SubLObject col, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = uncache_suf_defn_metered(col, assertion);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, assertion), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$uncache_suf_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return uncache_suf_defn_metered(col, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 62724L)
    public static SubLObject cache_suf_defn_int(final SubLObject col, final SubLObject assertion, SubLObject propagateP) {
        if (propagateP == at_defns.UNPROVIDED) {
            propagateP = (SubLObject)at_defns.T;
        }
        if (at_defns.NIL != suf_defn_assertionP(col, assertion)) {
            return (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != propagateP) {
            return propagate_added_suf_defn(col, assertion);
        }
        defn_note((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str162$___add_sufficent_defn__a__a_, col, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        return suf_defn_cache_add(col, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 63056L)
    public static SubLObject uncache_suf_defn_int(final SubLObject col, final SubLObject assertion, SubLObject propagateP) {
        if (propagateP == at_defns.UNPROVIDED) {
            propagateP = (SubLObject)at_defns.T;
        }
        if (at_defns.NIL == suf_defn_assertionP(col, assertion)) {
            defn_error((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str163$removed_sufficient_defn_not_found, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            return (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != propagateP) {
            return propagate_removed_suf_defn(col, assertion);
        }
        defn_note((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str0$___remove_sufficent_defn__a__a_, col, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        return suf_defn_cache_rem(col, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 63446L)
    public static SubLObject handle_added_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_handle_added_genl_for_suf_defns(spec, genl);
        }
        return old_handle_added_genl_for_suf_defns(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 63667L)
    public static SubLObject reset_old_handle_added_genl_for_suf_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list165);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym166$OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 63667L)
    public static SubLObject old_handle_added_genl_for_suf_defns_metered(final SubLObject spec, final SubLObject genl) {
        final SubLObject defn_assertions = suf_defn_assertions(spec);
        if (at_defns.NIL != defn_assertions) {
            propagate_added_suf_defns(spec, defn_assertions);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 63667L)
    public static SubLObject old_handle_added_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = old_handle_added_genl_for_suf_defns_metered(spec, genl);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(spec, genl), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return old_handle_added_genl_for_suf_defns_metered(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 63944L)
    public static SubLObject handle_removed_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_handle_removed_genl_for_suf_defns(spec, genl);
        }
        return old_handle_removed_genl_for_suf_defns(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 64171L)
    public static SubLObject reset_old_handle_removed_genl_for_suf_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list165);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym169$OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 64171L)
    public static SubLObject old_handle_removed_genl_for_suf_defns_metered(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            if (at_defns.NIL == genls.genlP(spec, genl, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                final SubLObject defn_assertions = suf_defn_assertions(spec);
                if (at_defns.NIL != defn_assertions) {
                    final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                    final SubLObject _prev_bind_0_$265 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$266 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_defns.NIL, thread);
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$266 = at_vars.$at_genls_space$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$267 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), spec, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                propagate_removed_suf_defns(genl, defn_assertions);
                            }
                            finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$267, thread);
                                at_vars.$at_genls_space$.rebind(_prev_bind_0_$266, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$267 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$267, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$266, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$265, thread);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 64171L)
    public static SubLObject old_handle_removed_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = old_handle_removed_genl_for_suf_defns_metered(spec, genl);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(spec, genl), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return old_handle_removed_genl_for_suf_defns_metered(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 64607L)
    public static SubLObject propagate_added_suf_defn(final SubLObject collection, final SubLObject defn_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defn$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_defn$.bind(defn_assertion, thread);
            genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym171$ADD_SUF_DEFN_ASSERTION), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        finally {
            at_vars.$at_defn$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 64800L)
    public static SubLObject propagate_removed_suf_defn(final SubLObject collection, final SubLObject defn_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defn$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_defn$.bind(defn_assertion, thread);
            genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym172$REMOVE_SUF_DEFN_ASSERTION), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        finally {
            at_vars.$at_defn$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 64998L)
    public static SubLObject propagate_added_suf_defns(final SubLObject collection, final SubLObject defn_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defns$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_defns$.bind(defn_assertions, thread);
            genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym173$MERGE_SUF_DEFN_ASSERTIONS), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        finally {
            at_vars.$at_defns$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 65198L)
    public static SubLObject propagate_removed_suf_defns(final SubLObject collection, final SubLObject defn_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defns$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_defns$.bind(defn_assertions, thread);
            genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym174$REMOVE_SUF_DEFN_ASSERTIONS), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        finally {
            at_vars.$at_defns$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 65401L)
    public static SubLObject add_suf_defn_assertion(final SubLObject collection, SubLObject defn_assertion) {
        if (defn_assertion == at_defns.UNPROVIDED) {
            defn_assertion = at_vars.$at_defn$.getDynamicValue();
        }
        return cache_suf_defn_int(collection, defn_assertion, (SubLObject)at_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 65551L)
    public static SubLObject remove_suf_defn_assertion(final SubLObject collection, SubLObject defn_assertion) {
        if (defn_assertion == at_defns.UNPROVIDED) {
            defn_assertion = at_vars.$at_defn$.getDynamicValue();
        }
        return uncache_suf_defn_int(collection, defn_assertion, (SubLObject)at_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 65706L)
    public static SubLObject merge_suf_defn_assertions(final SubLObject collection, SubLObject defn_assertions) {
        if (defn_assertions == at_defns.UNPROVIDED) {
            defn_assertions = at_vars.$at_defns$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE((SubLObject)at_defns.FIVE_INTEGER)) {
            SubLObject cdolist_list_var = defn_assertions;
            SubLObject assertion = (SubLObject)at_defns.NIL;
            assertion = cdolist_list_var.first();
            while (at_defns.NIL != cdolist_list_var) {
                defn_note((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str162$___add_sufficent_defn__a__a_, collection, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return suf_defn_cache_merge(collection, defn_assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 65991L)
    public static SubLObject defn_genl_searchedP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject searchedP = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(at_vars.$at_genls_space$.getDynamicValue(thread), thread);
            searchedP = sbhl_marking_methods.sbhl_recorded_node_p(fort, (SubLObject)at_defns.UNPROVIDED);
        }
        finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return searchedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 66170L)
    public static SubLObject arg1_spec_cardinality(final SubLObject assertion) {
        return cardinality_estimates.spec_cardinality(assertions_high.gaf_arg1(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 66270L)
    public static SubLObject suf_defn_sort(SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL == at_vars.$sort_suf_defn_assertionsP$.getDynamicValue(thread)) {
            return assertions;
        }
        if (at_defns.NIL == assertions) {
            return (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != list_utilities.singletonP(assertions)) {
            return assertions;
        }
        assertions = conses_high.copy_list(assertions);
        assertions = list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)at_defns.$sym175$VALID_ASSERTION), assertions, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        return Sort.sort(assertions, Symbols.symbol_function((SubLObject)at_defns.$sym176$_), Symbols.symbol_function((SubLObject)at_defns.$sym177$ARG1_SPEC_CARDINALITY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 66700L)
    public static SubLObject reset_col_suf_defns(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doneP = (SubLObject)at_defns.NIL;
        SubLObject cdolist_list_var = (SubLObject)at_defns.$list178;
        SubLObject defn_pred = (SubLObject)at_defns.NIL;
        defn_pred = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$270 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$271 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)at_defns.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject pred_var = defn_pred;
                    if (at_defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)at_defns.NIL;
                        final SubLObject _prev_bind_0_$271 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$272 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$274 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = doneP;
                            final SubLObject token_var = (SubLObject)at_defns.NIL;
                            while (at_defns.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (at_defns.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                        SubLObject done_var_$275 = doneP;
                                        final SubLObject token_var_$276 = (SubLObject)at_defns.NIL;
                                        while (at_defns.NIL == done_var_$275) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$276);
                                            final SubLObject valid_$277 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$276.eql(assertion));
                                            if (at_defns.NIL != valid_$277) {
                                                final SubLObject defn_collection = assertions_high.gaf_arg1(assertion);
                                                if (at_defns.NIL != genls.genlP(defn_collection, collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                                                    cache_suf_defn(collection, assertion);
                                                }
                                            }
                                            done_var_$275 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$277 || at_defns.NIL != doneP);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$272 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (at_defns.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$272, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid || at_defns.NIL != doneP);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$274, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$272, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$271, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$271, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$270, thread);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defn_pred = cdolist_list_var.first();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 67245L)
    public static SubLObject reset_all_suf_defns(SubLObject clearP, SubLObject traceP) {
        if (clearP == at_defns.UNPROVIDED) {
            clearP = (SubLObject)at_defns.T;
        }
        if (traceP == at_defns.UNPROVIDED) {
            traceP = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_trace_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$sort_suf_defn_assertionsP$.currentBinding(thread);
        try {
            at_vars.$at_trace_level$.bind((SubLObject)((at_defns.NIL != traceP) ? at_defns.FIVE_INTEGER : at_vars.$at_trace_level$.getDynamicValue(thread)), thread);
            at_vars.$sort_suf_defn_assertionsP$.bind((SubLObject)at_defns.NIL, thread);
            final SubLObject doneP = (SubLObject)at_defns.NIL;
            if (at_defns.NIL != clearP) {
                clear_suf_defns();
            }
            SubLObject cdolist_list_var = (SubLObject)at_defns.$list178;
            SubLObject defn_pred = (SubLObject)at_defns.NIL;
            defn_pred = cdolist_list_var.first();
            while (at_defns.NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0_$279 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$280 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$280 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$281 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)at_defns.SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject pred_var = defn_pred;
                        if (at_defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str = (SubLObject)at_defns.NIL;
                            final SubLObject _prev_bind_0_$281 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$282 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$285 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                                utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                                utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
                                utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
                                utilities_macros.noting_progress_preamble(str);
                                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = doneP;
                                final SubLObject token_var = (SubLObject)at_defns.NIL;
                                while (at_defns.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (at_defns.NIL != valid) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                            SubLObject done_var_$286 = doneP;
                                            final SubLObject token_var_$287 = (SubLObject)at_defns.NIL;
                                            while (at_defns.NIL == done_var_$286) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$287);
                                                final SubLObject valid_$288 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$287.eql(assertion));
                                                if (at_defns.NIL != valid_$288) {
                                                    final SubLObject defn_collection = assertions_high.gaf_arg1(assertion);
                                                    cache_suf_defn(defn_collection, assertion);
                                                }
                                                done_var_$286 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$288 || at_defns.NIL != doneP);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$282 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (at_defns.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$282, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid || at_defns.NIL != doneP);
                                }
                                utilities_macros.noting_progress_postamble();
                            }
                            finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$285, thread);
                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$282, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$281, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$281, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$280, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$280, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$279, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                defn_pred = cdolist_list_var.first();
            }
        }
        finally {
            at_vars.$sort_suf_defn_assertionsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_trace_level$.rebind(_prev_bind_0, thread);
        }
        if (at_defns.NIL != at_vars.$sort_suf_defn_assertionsP$.getDynamicValue(thread)) {
            sort_suf_defn_cache();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 67822L)
    public static SubLObject initialize_sufficient_defns_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = (SubLObject)at_defns.$str179$Initializing_sufficient_defns_cac;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
            utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
            utilities_macros.noting_progress_preamble(str);
            reset_all_suf_defns((SubLObject)at_defns.T, (SubLObject)at_defns.UNPROVIDED);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 68013L)
    public static SubLObject suf_quoted_defn_assertions(final SubLObject collection) {
        if (at_defns.NIL != forts.fort_p(collection)) {
            return suf_quoted_defn_cache_get(collection);
        }
        if (at_defns.NIL != obsolete.reifiable_natP(collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
            return suf_quoted_defn_assertions(narts_high.find_nart(collection));
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 68363L)
    public static SubLObject suf_quoted_defnP(final SubLObject collection, final SubLObject defn) {
        SubLObject foundP = (SubLObject)at_defns.NIL;
        if (at_defns.NIL == foundP) {
            SubLObject csome_list_var = suf_quoted_defn_assertions(collection);
            SubLObject assertion = (SubLObject)at_defns.NIL;
            assertion = csome_list_var.first();
            while (at_defns.NIL == foundP && at_defns.NIL != csome_list_var) {
                if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED)) {
                    foundP = Equality.eql(defn, el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion)));
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 68678L)
    public static SubLObject any_sufficient_quoted_defnP(final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = (SubLObject)at_defns.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (at_defns.NIL == foundP) {
                SubLObject csome_list_var = suf_quoted_defn_assertions(collection);
                SubLObject assertion = (SubLObject)at_defns.NIL;
                assertion = csome_list_var.first();
                while (at_defns.NIL == foundP && at_defns.NIL != csome_list_var) {
                    if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED) && at_defns.NIL != mt_relevance_macros.relevant_assertionP(assertion)) {
                        foundP = (SubLObject)at_defns.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 69025L)
    public static SubLObject any_sufficient_quoted_defn_anywhereP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.has_suf_defn_somewhereP(collection, (SubLObject)at_defns.T);
        }
        return old_any_sufficient_quoted_defn_anywhereP(collection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 69246L)
    public static SubLObject old_any_sufficient_quoted_defn_anywhereP(final SubLObject collection) {
        SubLObject foundP = (SubLObject)at_defns.NIL;
        if (at_defns.NIL == foundP) {
            SubLObject csome_list_var = suf_quoted_defn_assertions(collection);
            SubLObject assertion = (SubLObject)at_defns.NIL;
            assertion = csome_list_var.first();
            while (at_defns.NIL == foundP && at_defns.NIL != csome_list_var) {
                if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED)) {
                    foundP = (SubLObject)at_defns.T;
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 69524L)
    public static SubLObject suf_quoted_defn_assertionP(final SubLObject col, final SubLObject assertion) {
        return subl_promotions.memberP(assertion, suf_quoted_defn_cache_get(col), Symbols.symbol_function((SubLObject)at_defns.$sym144$KBEQ), (SubLObject)at_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 69652L)
    public static SubLObject quoted_has_typeP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != term.ground_nautP(collection, (SubLObject)at_defns.UNPROVIDED)) {
            return quoted_has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
        }
        if (at_defns.NIL != forts.fort_p(collection)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != isa.quoted_isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED) || at_defns.NIL != quoted_defns_admitP(collection, v_term, mt));
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 70215L)
    public static SubLObject quiet_quoted_has_typeP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != term.ground_nautP(collection, (SubLObject)at_defns.UNPROVIDED)) {
            return quiet_quoted_has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
        }
        if (at_defns.NIL != forts.fort_p(collection)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != isa.quoted_isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED) || at_defns.NIL != quiet_quoted_defns_admitP(collection, v_term, mt));
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 70792L)
    public static SubLObject not_quoted_has_type_by_extent_knownP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != term.ground_nautP(collection, (SubLObject)at_defns.UNPROVIDED)) {
            return not_quoted_has_type_by_extent_knownP(v_term, cycl_utilities.find_ground_naut(collection), mt);
        }
        if (at_defns.NIL != forts.fort_p(collection) && at_defns.NIL != kb_accessors.completely_enumerable_collectionP(collection, mt)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == quiet_quoted_has_typeP(v_term, collection, mt));
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 71326L)
    public static SubLObject not_quoted_has_typeP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != term.ground_nautP(collection, (SubLObject)at_defns.UNPROVIDED)) {
            return not_quoted_has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
        }
        if (at_defns.NIL != forts.fort_p(collection)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != quoted_defns_rejectP(collection, v_term, mt) || at_defns.NIL != isa.not_quoted_isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED));
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 71771L)
    public static SubLObject quiet_not_quoted_has_typeP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != term.ground_nautP(collection, (SubLObject)at_defns.UNPROVIDED)) {
            return not_quoted_has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
        }
        if (at_defns.NIL != forts.fort_p(collection)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != quiet_quoted_defns_rejectP(collection, v_term, mt) || at_defns.NIL != isa.not_quoted_isaP(v_term, collection, mt, (SubLObject)at_defns.UNPROVIDED));
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 72261L)
    public static SubLObject add_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_add_suf_quoted_defn(source, assertion);
        }
        return old_add_suf_quoted_defn(source, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 72598L)
    public static SubLObject add_iff_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_add_iff_quoted_defn(source, assertion);
        }
        return old_add_suf_quoted_defn(source, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 72807L)
    public static SubLObject old_add_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg1(assertion);
            final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
            if (at_defns.NIL != control_vars.$bootstrapping_kbP$.getDynamicValue(thread) && at_defns.NIL != forts.fort_p(col) && defn.isSymbol()) {
                cache_suf_quoted_defn(col, assertion);
            }
            else {
                final SubLObject _prev_bind_0_$290 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$291 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym147$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject valid_defnP = valid_defnP(defn, col);
                    final SubLObject collectionP = forts.fort_p(col);
                    if (at_defns.NIL != collectionP && at_defns.NIL != valid_defnP) {
                        cache_suf_quoted_defn(col, assertion);
                    }
                    else if (at_defns.NIL == collectionP) {
                        defn_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str182$skip_quoted_defn_op, (SubLObject)at_defns.$str149$_s_is_not_a_collection_in__s, col, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    }
                    else if (at_defns.NIL == valid_defnP) {
                        defn_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str182$skip_quoted_defn_op, (SubLObject)at_defns.$str150$_s_is_not_a_symbol, defn, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$291, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$290, thread);
                }
            }
        }
        finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 73714L)
    public static SubLObject remove_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_remove_suf_quoted_defn(source, assertion);
        }
        return old_remove_suf_quoted_defn(source, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 73934L)
    public static SubLObject remove_iff_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_remove_iff_quoted_defn(source, assertion);
        }
        return old_remove_suf_quoted_defn(source, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 74154L)
    public static SubLObject old_remove_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg1(assertion);
            final SubLObject defn = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
            if (at_defns.NIL != control_vars.$bootstrapping_kbP$.getDynamicValue(thread) && at_defns.NIL != forts.fort_p(col) && defn.isSymbol()) {
                uncache_suf_quoted_defn(col, assertion);
            }
            else {
                final SubLObject _prev_bind_0_$292 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$293 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym147$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject valid_defnP = valid_defnP(defn, col);
                    final SubLObject collectionP = forts.fort_p(col);
                    if (at_defns.NIL != collectionP && at_defns.NIL != valid_defnP) {
                        uncache_suf_quoted_defn(col, assertion);
                    }
                    else if (at_defns.NIL == collectionP) {
                        defn_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str182$skip_quoted_defn_op, (SubLObject)at_defns.$str149$_s_is_not_a_collection_in__s, col, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    }
                    else if (at_defns.NIL == valid_defnP) {
                        defn_cerror((SubLObject)at_defns.ONE_INTEGER, (SubLObject)at_defns.$str182$skip_quoted_defn_op, (SubLObject)at_defns.$str150$_s_is_not_a_symbol, defn, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$293, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$292, thread);
                }
            }
        }
        finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 75220L)
    public static SubLObject reset_cache_suf_quoted_defn_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list156);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym188$CACHE_SUF_QUOTED_DEFN);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 75220L)
    public static SubLObject cache_suf_quoted_defn_metered(final SubLObject col, final SubLObject assertion) {
        cache_suf_quoted_defn_int(col, assertion, (SubLObject)at_defns.UNPROVIDED);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 75220L)
    public static SubLObject cache_suf_quoted_defn(final SubLObject col, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = cache_suf_quoted_defn_metered(col, assertion);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, assertion), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return cache_suf_quoted_defn_metered(col, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 75348L)
    public static SubLObject reset_uncache_suf_quoted_defn_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list156);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym191$UNCACHE_SUF_QUOTED_DEFN);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 75348L)
    public static SubLObject uncache_suf_quoted_defn_metered(final SubLObject col, final SubLObject assertion) {
        uncache_suf_quoted_defn_int(col, assertion, (SubLObject)at_defns.UNPROVIDED);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 75348L)
    public static SubLObject uncache_suf_quoted_defn(final SubLObject col, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = uncache_suf_quoted_defn_metered(col, assertion);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, assertion), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return uncache_suf_quoted_defn_metered(col, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 75480L)
    public static SubLObject cache_suf_quoted_defn_int(final SubLObject col, final SubLObject assertion, SubLObject propagateP) {
        if (propagateP == at_defns.UNPROVIDED) {
            propagateP = (SubLObject)at_defns.T;
        }
        if (at_defns.NIL != suf_quoted_defn_assertionP(col, assertion)) {
            return (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != propagateP) {
            return propagate_added_suf_quoted_defn(col, assertion);
        }
        defn_note((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str193$___add_sufficent_quoted_defn__a__, col, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        return suf_quoted_defn_cache_add(col, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 75847L)
    public static SubLObject uncache_suf_quoted_defn_int(final SubLObject col, final SubLObject assertion, SubLObject propagateP) {
        if (propagateP == at_defns.UNPROVIDED) {
            propagateP = (SubLObject)at_defns.T;
        }
        if (at_defns.NIL == suf_quoted_defn_assertionP(col, assertion)) {
            defn_error((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str194$removed_sufficient_quoted_defn_no, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            return (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != propagateP) {
            return propagate_removed_suf_quoted_defn(col, assertion);
        }
        defn_note((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str195$___remove_sufficent_quoted_defn__, col, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        return suf_quoted_defn_cache_rem(col, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 76279L)
    public static SubLObject handle_added_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_handle_added_genl_for_suf_quoted_defns(spec, genl);
        }
        return old_handle_added_genl_for_suf_quoted_defns(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 76521L)
    public static SubLObject reset_old_handle_added_genl_for_suf_quoted_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list165);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym197$OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 76521L)
    public static SubLObject old_handle_added_genl_for_suf_quoted_defns_metered(final SubLObject spec, final SubLObject genl) {
        final SubLObject defn_assertions = suf_quoted_defn_assertions(spec);
        if (at_defns.NIL != defn_assertions) {
            propagate_added_suf_quoted_defns(spec, defn_assertions);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 76521L)
    public static SubLObject old_handle_added_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = old_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(spec, genl), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return old_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 76819L)
    public static SubLObject handle_removed_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_defns.$use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_handle_removed_genl_for_suf_quoted_defns(spec, genl);
        }
        return old_handle_removed_genl_for_suf_quoted_defns(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 77067L)
    public static SubLObject reset_old_handle_removed_genl_for_suf_quoted_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list165);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym200$OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 77067L)
    public static SubLObject old_handle_removed_genl_for_suf_quoted_defns_metered(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            if (at_defns.NIL == genls.genlP(spec, genl, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                final SubLObject defn_assertions = suf_quoted_defn_assertions(spec);
                if (at_defns.NIL != defn_assertions) {
                    final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                    final SubLObject _prev_bind_0_$294 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$295 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_defns.NIL, thread);
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$295 = at_vars.$at_genls_space$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$296 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), spec, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                propagate_removed_suf_quoted_defns(genl, defn_assertions);
                            }
                            finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$296, thread);
                                at_vars.$at_genls_space$.rebind(_prev_bind_0_$295, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$296 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$296, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$295, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$294, thread);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 77067L)
    public static SubLObject old_handle_removed_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = old_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(spec, genl), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return old_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 77524L)
    public static SubLObject propagate_added_suf_quoted_defn(final SubLObject collection, final SubLObject defn_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defn$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_defn$.bind(defn_assertion, thread);
            genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym202$ADD_SUF_QUOTED_DEFN_ASSERTION), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        finally {
            at_vars.$at_defn$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 77731L)
    public static SubLObject propagate_removed_suf_quoted_defn(final SubLObject collection, final SubLObject defn_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defn$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_defn$.bind(defn_assertion, thread);
            genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym203$REMOVE_SUF_QUOTED_DEFN_ASSERTION), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        finally {
            at_vars.$at_defn$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 77943L)
    public static SubLObject propagate_added_suf_quoted_defns(final SubLObject collection, final SubLObject defn_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defns$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_defns$.bind(defn_assertions, thread);
            genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym204$MERGE_SUF_QUOTED_DEFN_ASSERTIONS), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        finally {
            at_vars.$at_defns$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 78157L)
    public static SubLObject propagate_removed_suf_quoted_defns(final SubLObject collection, final SubLObject defn_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defns$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_defns$.bind(defn_assertions, thread);
            genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym205$REMOVE_SUF_QUOTED_DEFN_ASSERTIONS), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        finally {
            at_vars.$at_defns$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 78374L)
    public static SubLObject add_suf_quoted_defn_assertion(final SubLObject collection, SubLObject defn_assertion) {
        if (defn_assertion == at_defns.UNPROVIDED) {
            defn_assertion = at_vars.$at_defn$.getDynamicValue();
        }
        return cache_suf_quoted_defn_int(collection, defn_assertion, (SubLObject)at_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 78538L)
    public static SubLObject remove_suf_quoted_defn_assertion(final SubLObject collection, SubLObject defn_assertion) {
        if (defn_assertion == at_defns.UNPROVIDED) {
            defn_assertion = at_vars.$at_defn$.getDynamicValue();
        }
        return uncache_suf_quoted_defn_int(collection, defn_assertion, (SubLObject)at_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 78707L)
    public static SubLObject merge_suf_quoted_defn_assertions(final SubLObject collection, SubLObject defn_assertions) {
        if (defn_assertions == at_defns.UNPROVIDED) {
            defn_assertions = at_vars.$at_defns$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE((SubLObject)at_defns.FIVE_INTEGER)) {
            SubLObject cdolist_list_var = defn_assertions;
            SubLObject assertion = (SubLObject)at_defns.NIL;
            assertion = cdolist_list_var.first();
            while (at_defns.NIL != cdolist_list_var) {
                defn_note((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str162$___add_sufficent_defn__a__a_, collection, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return suf_quoted_defn_cache_merge(collection, defn_assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 79006L)
    public static SubLObject reset_col_suf_quoted_defns(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doneP = (SubLObject)at_defns.NIL;
        SubLObject cdolist_list_var = (SubLObject)at_defns.$list206;
        SubLObject defn_pred = (SubLObject)at_defns.NIL;
        defn_pred = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
                final SubLObject pred_var = defn_pred;
                if (at_defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)at_defns.NIL;
                    final SubLObject _prev_bind_0_$299 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$300 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                        utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = (SubLObject)at_defns.NIL;
                        while (at_defns.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (at_defns.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                    SubLObject done_var_$301 = doneP;
                                    final SubLObject token_var_$302 = (SubLObject)at_defns.NIL;
                                    while (at_defns.NIL == done_var_$301) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$302);
                                        final SubLObject valid_$303 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$302.eql(assertion));
                                        if (at_defns.NIL != valid_$303) {
                                            final SubLObject defn_collection = assertions_high.gaf_arg1(assertion);
                                            if (at_defns.NIL != genls.genlP(defn_collection, collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                                                cache_suf_quoted_defn(collection, assertion);
                                            }
                                        }
                                        done_var_$301 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$303 || at_defns.NIL != doneP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$300 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (at_defns.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$300, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid || at_defns.NIL != doneP);
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
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$300, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$299, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defn_pred = cdolist_list_var.first();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 79573L)
    public static SubLObject reset_all_suf_quoted_defns(SubLObject clearP, SubLObject traceP) {
        if (clearP == at_defns.UNPROVIDED) {
            clearP = (SubLObject)at_defns.T;
        }
        if (traceP == at_defns.UNPROVIDED) {
            traceP = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_trace_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$sort_suf_defn_assertionsP$.currentBinding(thread);
        try {
            at_vars.$at_trace_level$.bind((SubLObject)((at_defns.NIL != traceP) ? at_defns.FIVE_INTEGER : at_vars.$at_trace_level$.getDynamicValue(thread)), thread);
            at_vars.$sort_suf_defn_assertionsP$.bind((SubLObject)at_defns.NIL, thread);
            final SubLObject doneP = (SubLObject)at_defns.NIL;
            if (at_defns.NIL != clearP) {
                clear_suf_quoted_defns();
            }
            SubLObject cdolist_list_var = (SubLObject)at_defns.$list206;
            SubLObject defn_pred = (SubLObject)at_defns.NIL;
            defn_pred = cdolist_list_var.first();
            while (at_defns.NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0_$305 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$306 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$306 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$307 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)at_defns.SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject pred_var = defn_pred;
                        if (at_defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str = (SubLObject)at_defns.NIL;
                            final SubLObject _prev_bind_0_$307 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$308 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$311 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                                utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                                utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
                                utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
                                utilities_macros.noting_progress_preamble(str);
                                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = doneP;
                                final SubLObject token_var = (SubLObject)at_defns.NIL;
                                while (at_defns.NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (at_defns.NIL != valid) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                            SubLObject done_var_$312 = doneP;
                                            final SubLObject token_var_$313 = (SubLObject)at_defns.NIL;
                                            while (at_defns.NIL == done_var_$312) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$313);
                                                final SubLObject valid_$314 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$313.eql(assertion));
                                                if (at_defns.NIL != valid_$314) {
                                                    final SubLObject defn_collection = assertions_high.gaf_arg1(assertion);
                                                    cache_suf_quoted_defn(defn_collection, assertion);
                                                }
                                                done_var_$312 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$314 || at_defns.NIL != doneP);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$308 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (at_defns.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$308, thread);
                                            }
                                        }
                                    }
                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid || at_defns.NIL != doneP);
                                }
                                utilities_macros.noting_progress_postamble();
                            }
                            finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$311, thread);
                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$308, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$307, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$307, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$306, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$306, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$305, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                defn_pred = cdolist_list_var.first();
            }
        }
        finally {
            at_vars.$sort_suf_defn_assertionsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_trace_level$.rebind(_prev_bind_0, thread);
        }
        if (at_defns.NIL != at_vars.$sort_suf_defn_assertionsP$.getDynamicValue(thread)) {
            sort_suf_quoted_defn_cache();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 80190L)
    public static SubLObject initialize_sufficient_quoted_defns_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = (SubLObject)at_defns.$str207$Initializing_sufficient_quoted_de;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
            utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
            utilities_macros.noting_progress_preamble(str);
            reset_all_suf_quoted_defns((SubLObject)at_defns.T, (SubLObject)at_defns.UNPROVIDED);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 80402L)
    public static SubLObject suf_function_cache(final SubLObject type) {
        if (type.eql((SubLObject)at_defns.$kw108$ISA)) {
            return defns.$suf_function_cache_index$.getGlobalValue();
        }
        if (type.eql((SubLObject)at_defns.$kw208$QUOTED_ISA)) {
            return defns.$suf_quoted_function_cache_index$.getGlobalValue();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 80828L)
    public static SubLObject get_suf_function_assertions(final SubLObject collection, final SubLObject type) {
        return defns.defns_cache_gethash(collection, suf_function_cache(type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 80993L)
    public static SubLObject set_suf_function_assertions(final SubLObject collection, final SubLObject assertions, final SubLObject type) {
        defns.defns_cache_sethash(collection, suf_function_cache(type), assertions);
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 81193L)
    public static SubLObject rem_suf_function_assertions(final SubLObject collection, final SubLObject type) {
        defns.defns_cache_remhash(collection, suf_function_cache(type));
        return collection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 81371L)
    public static SubLObject suf_function_assertions(final SubLObject collection, final SubLObject type) {
        if (at_defns.NIL != forts.fort_p(collection)) {
            get_suf_function_assertions(collection, type);
        }
        else if (at_defns.NIL != obsolete.reifiable_natP(collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
            return suf_function_assertions(narts_high.find_nart(collection), type);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 81631L)
    public static SubLObject suf_functionP(final SubLObject collection, final SubLObject function, final SubLObject type) {
        SubLObject foundP = (SubLObject)at_defns.NIL;
        if (at_defns.NIL == foundP) {
            SubLObject csome_list_var = suf_function_assertions(collection, type);
            SubLObject assertion = (SubLObject)at_defns.NIL;
            assertion = csome_list_var.first();
            while (at_defns.NIL == foundP && at_defns.NIL != csome_list_var) {
                if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED)) {
                    foundP = Equality.eql(function, assertions_high.gaf_arg1(assertion));
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 81946L)
    public static SubLObject any_sufficient_functionP(final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        return any_sufficient_functionP_int(collection, mt, (SubLObject)at_defns.$kw108$ISA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 82072L)
    public static SubLObject any_sufficient_quoted_functionP(final SubLObject collection, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        return any_sufficient_functionP_int(collection, mt, (SubLObject)at_defns.$kw208$QUOTED_ISA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 82212L)
    public static SubLObject any_sufficient_functionP_int(final SubLObject collection, final SubLObject mt, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            if (at_defns.NIL == foundP) {
                SubLObject csome_list_var = suf_function_assertions(collection, type);
                SubLObject assertion = (SubLObject)at_defns.NIL;
                assertion = csome_list_var.first();
                while (at_defns.NIL == foundP && at_defns.NIL != csome_list_var) {
                    if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED) && at_defns.NIL != mt_relevance_macros.relevant_assertionP(assertion) && at_defns.NIL != genls.genlP(assertions_high.gaf_arg2(assertion), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                        foundP = (SubLObject)at_defns.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 82654L)
    public static SubLObject any_sufficient_non_reified_functionP(final SubLObject collection, final SubLObject type, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = (SubLObject)at_defns.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (at_defns.NIL == foundP) {
                SubLObject csome_list_var = suf_function_assertions(collection, type);
                SubLObject assertion = (SubLObject)at_defns.NIL;
                assertion = csome_list_var.first();
                while (at_defns.NIL == foundP && at_defns.NIL != csome_list_var) {
                    if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED) && at_defns.NIL != mt_relevance_macros.relevant_assertionP(assertion) && at_defns.NIL != genls.genlP(assertions_high.gaf_arg2(assertion), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                        foundP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == czer_utilities.reifiable_functorP(assertions_high.gaf_arg1(assertion), (SubLObject)at_defns.UNPROVIDED));
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 83163L)
    public static SubLObject suf_function_assertionP(final SubLObject col, final SubLObject assertion, final SubLObject type) {
        return subl_promotions.memberP(assertion, get_suf_function_assertions(col, type), Symbols.symbol_function((SubLObject)at_defns.$sym144$KBEQ), (SubLObject)at_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 83300L)
    public static SubLObject sufficient_function_of(final SubLObject fn, final SubLObject type, SubLObject mt) {
        if (mt == at_defns.UNPROVIDED) {
            mt = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject collections = (SubLObject)at_defns.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject cdohash_table = suf_function_cache(type);
            SubLObject col = (SubLObject)at_defns.NIL;
            SubLObject assertions = (SubLObject)at_defns.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    col = Hashtables.getEntryKey(cdohash_entry);
                    assertions = Hashtables.getEntryValue(cdohash_entry);
                    SubLObject foundP = (SubLObject)at_defns.NIL;
                    if (at_defns.NIL == foundP) {
                        SubLObject csome_list_var = assertions;
                        SubLObject assertion = (SubLObject)at_defns.NIL;
                        assertion = csome_list_var.first();
                        while (at_defns.NIL == foundP && at_defns.NIL != csome_list_var) {
                            if (at_defns.NIL != assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED)) {
                                foundP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != mt_relevance_macros.relevant_assertionP(assertion) && fn.eql(assertions_high.gaf_arg1(assertion)));
                            }
                            csome_list_var = csome_list_var.rest();
                            assertion = csome_list_var.first();
                        }
                    }
                    if (at_defns.NIL != foundP) {
                        collections = (SubLObject)ConsesLow.cons(col, collections);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genls.min_cols(collections, mt, (SubLObject)at_defns.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 83785L)
    public static SubLObject add_suf_function(SubLObject source, final SubLObject assertion) {
        return add_suf_function_int(source, assertion, (SubLObject)at_defns.$kw108$ISA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 84029L)
    public static SubLObject remove_suf_function(SubLObject source, final SubLObject assertion) {
        return remove_suf_function_int(source, assertion, (SubLObject)at_defns.$kw108$ISA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 84149L)
    public static SubLObject add_suf_quoted_function(SubLObject source, final SubLObject assertion) {
        return add_suf_function_int(source, assertion, (SubLObject)at_defns.$kw208$QUOTED_ISA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 84275L)
    public static SubLObject remove_suf_quoted_function(SubLObject source, final SubLObject assertion) {
        return remove_suf_function_int(source, assertion, (SubLObject)at_defns.$kw208$QUOTED_ISA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 84409L)
    public static SubLObject add_suf_function_int(SubLObject source, final SubLObject assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg2(assertion);
            final SubLObject function = assertions_high.gaf_arg1(assertion);
            if (at_defns.NIL != control_vars.$bootstrapping_kbP$.getDynamicValue(thread) && at_defns.NIL != forts.fort_p(col) && at_defns.NIL != forts.fort_p(function)) {
                cache_suf_function(col, assertion, type);
            }
            else {
                final SubLObject _prev_bind_0_$316 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$317 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym147$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject collectionP = forts.fort_p(col);
                    final SubLObject functionP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != fort_types_interface.non_predicate_functionP(function) || at_defns.NIL != at_utilities.truth_functionP(function));
                    if (type == at_defns.$kw208$QUOTED_ISA && at_defns.NIL != assertion_utilities.gaf_assertion_has_pred_p(assertion, at_defns.$const213$evaluationResultQuotedIsa) && at_defns.NIL == fort_types_interface.evaluatable_function_p(function)) {
                        defn_cerror((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str214$oh_well___, (SubLObject)at_defns.$str215$_s_is_not_a_evaluatable_functor_i, function, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                    }
                    else if (at_defns.NIL != collectionP && at_defns.NIL != functionP) {
                        cache_suf_function(col, assertion, type);
                    }
                    else if (at_defns.NIL == collectionP) {
                        defn_cerror((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str214$oh_well___, (SubLObject)at_defns.$str149$_s_is_not_a_collection_in__s, col, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                        if (at_defns.NIL != forts.fort_p(col)) {
                            cache_suf_function(col, assertion, type);
                        }
                    }
                    else if (at_defns.NIL == functionP) {
                        defn_cerror((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str214$oh_well___, (SubLObject)at_defns.$str216$_s_is_not_a_functor_in__s, function, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                        cache_suf_function(col, assertion, type);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$317, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$316, thread);
                }
            }
        }
        finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 85872L)
    public static SubLObject remove_suf_function_int(SubLObject source, final SubLObject assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg2(assertion);
            final SubLObject function = assertions_high.gaf_arg1(assertion);
            if (at_defns.NIL != control_vars.$bootstrapping_kbP$.getDynamicValue(thread) && at_defns.NIL != forts.fort_p(col) && at_defns.NIL != forts.fort_p(function)) {
                uncache_suf_function(col, assertion, type);
            }
            else {
                final SubLObject _prev_bind_0_$318 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$319 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym147$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject collectionP = forts.fort_p(col);
                    final SubLObject functionP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL != fort_types_interface.non_predicate_functionP(function) || at_defns.NIL != at_utilities.truth_functionP(function));
                    if (at_defns.NIL != collectionP && at_defns.NIL != functionP) {
                        uncache_suf_function(col, assertion, type);
                    }
                    else if (at_defns.NIL == collectionP) {
                        defn_cerror((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str214$oh_well___, (SubLObject)at_defns.$str149$_s_is_not_a_collection_in__s, col, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                        if (at_defns.NIL != suf_function_assertionP(col, assertion, type)) {
                            uncache_suf_function(col, assertion, type);
                        }
                    }
                    else if (at_defns.NIL == functionP) {
                        defn_cerror((SubLObject)at_defns.TWO_INTEGER, (SubLObject)at_defns.$str214$oh_well___, (SubLObject)at_defns.$str216$_s_is_not_a_functor_in__s, function, mt, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                        if (at_defns.NIL != suf_function_assertionP(col, assertion, type)) {
                            uncache_suf_function(col, assertion, type);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$319, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$318, thread);
                }
            }
        }
        finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 87350L)
    public static SubLObject reset_cache_suf_function_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list220);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym221$CACHE_SUF_FUNCTION);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 87350L)
    public static SubLObject cache_suf_function_metered(final SubLObject col, final SubLObject assertion, final SubLObject type) {
        cache_suf_function_int(col, assertion, type, (SubLObject)at_defns.UNPROVIDED);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 87350L)
    public static SubLObject cache_suf_function(final SubLObject col, final SubLObject assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = cache_suf_function_metered(col, assertion, type);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, assertion, type), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$cache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return cache_suf_function_metered(col, assertion, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 87482L)
    public static SubLObject reset_uncache_suf_function_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list220);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym224$UNCACHE_SUF_FUNCTION);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 87482L)
    public static SubLObject uncache_suf_function_metered(final SubLObject col, final SubLObject assertion, final SubLObject type) {
        uncache_suf_function_int(col, assertion, type, (SubLObject)at_defns.UNPROVIDED);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 87482L)
    public static SubLObject uncache_suf_function(final SubLObject col, final SubLObject assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = uncache_suf_function_metered(col, assertion, type);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(col, assertion, type), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$uncache_suf_function_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return uncache_suf_function_metered(col, assertion, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 87618L)
    public static SubLObject cache_suf_function_int(final SubLObject col, final SubLObject assertion, final SubLObject type, SubLObject propagateP) {
        if (propagateP == at_defns.UNPROVIDED) {
            propagateP = (SubLObject)at_defns.T;
        }
        if (at_defns.NIL != suf_function_assertionP(col, assertion, type)) {
            return (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != propagateP) {
            return propagate_added_suf_function(col, assertion, type);
        }
        defn_note((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str226$____a__a__a_, (SubLObject)((type == at_defns.$kw108$ISA) ? at_defns.$str227$add_sufficient_function : at_defns.$str228$add_sufficient_quoted_function), col, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        final SubLObject new_val = suf_function_sort((SubLObject)ConsesLow.cons(assertion, get_suf_function_assertions(col, type)));
        if (at_defns.NIL != new_val) {
            set_suf_function_assertions(col, new_val, type);
        }
        return new_val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 88199L)
    public static SubLObject uncache_suf_function_int(final SubLObject col, final SubLObject assertion, final SubLObject type, SubLObject propagateP) {
        if (propagateP == at_defns.UNPROVIDED) {
            propagateP = (SubLObject)at_defns.T;
        }
        if (at_defns.NIL == suf_function_assertionP(col, assertion, type)) {
            defn_error((SubLObject)at_defns.THREE_INTEGER, (SubLObject)at_defns.$str229$removed_sufficient_function_not_f, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            return (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != propagateP) {
            return propagate_removed_suf_function(col, assertion, type);
        }
        defn_note((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str226$____a__a__a_, (SubLObject)((type == at_defns.$kw108$ISA) ? at_defns.$str230$remove_sufficient_function : at_defns.$str231$remove_sufficient_quoted_function), col, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        final SubLObject new_val = suf_function_sort(Sequences.delete(assertion, get_suf_function_assertions(col, type), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        if (at_defns.NIL != new_val) {
            set_suf_function_assertions(col, new_val, type);
        }
        else {
            rem_suf_function_assertions(col, type);
        }
        return new_val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 88889L)
    public static SubLObject reset_handle_added_genl_for_suf_functions_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list165);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym233$HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 88889L)
    public static SubLObject handle_added_genl_for_suf_functions_metered(final SubLObject spec, final SubLObject genl) {
        SubLObject cdolist_list_var = (SubLObject)at_defns.$list235;
        SubLObject type = (SubLObject)at_defns.NIL;
        type = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            final SubLObject function_assertions = suf_function_assertions(spec, type);
            if (at_defns.NIL != function_assertions) {
                propagate_added_suf_functions(spec, function_assertions, type);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 88889L)
    public static SubLObject handle_added_genl_for_suf_functions(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = handle_added_genl_for_suf_functions_metered(spec, genl);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(spec, genl), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return handle_added_genl_for_suf_functions_metered(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 89234L)
    public static SubLObject reset_handle_removed_genl_for_suf_functions_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.NIL);
        Hashtables.sethash((SubLObject)at_defns.$kw8$ARG_LIST, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.$list165);
        Hashtables.sethash((SubLObject)at_defns.$kw10$FUNCTION, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.$sym237$HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS);
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 89234L)
    public static SubLObject handle_removed_genl_for_suf_functions_metered(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            if (at_defns.NIL == genls.genlP(spec, genl, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                SubLObject cdolist_list_var = (SubLObject)at_defns.$list235;
                SubLObject type = (SubLObject)at_defns.NIL;
                type = cdolist_list_var.first();
                while (at_defns.NIL != cdolist_list_var) {
                    final SubLObject function_assertions = suf_function_assertions(spec, type);
                    if (at_defns.NIL != function_assertions) {
                        final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                        final SubLObject _prev_bind_0_$320 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$321 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_defns.NIL, thread);
                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$321 = at_vars.$at_genls_space$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$322 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                try {
                                    at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(at_defns.$const45$genls), spec, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                    propagate_removed_suf_functions(genl, function_assertions, type);
                                }
                                finally {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$322, thread);
                                    at_vars.$at_genls_space$.rebind(_prev_bind_0_$321, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$322 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$322, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$321, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$320, thread);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    type = cdolist_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 89234L)
    public static SubLObject handle_removed_genl_for_suf_functions(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)at_defns.NIL;
            SubLObject run_time = (SubLObject)at_defns.NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            result = handle_removed_genl_for_suf_functions_metered(spec, genl);
            run_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Hashtables.sethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), Numbers.add(Hashtables.gethash((SubLObject)at_defns.$kw4$CALLS, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED), (SubLObject)at_defns.ONE_INTEGER));
            Hashtables.sethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(run_time, Hashtables.gethash((SubLObject)at_defns.$kw5$TIMES, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons(result, Hashtables.gethash((SubLObject)at_defns.$kw6$RESULTS, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            Hashtables.sethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(spec, genl), Hashtables.gethash((SubLObject)at_defns.$kw7$ARGS, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), (SubLObject)at_defns.UNPROVIDED)));
            return result;
        }
        return handle_removed_genl_for_suf_functions_metered(spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 89746L)
    public static SubLObject propagate_added_suf_function(final SubLObject collection, final SubLObject function_assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_function$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_function$.bind(function_assertion, thread);
            if (type.eql((SubLObject)at_defns.$kw108$ISA)) {
                genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym239$ADD_SUF_FUNCTION_ASSERTION), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            }
            else if (type.eql((SubLObject)at_defns.$kw208$QUOTED_ISA)) {
                genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym240$ADD_SUF_QUOTED_FUNCTION_ASSERTION), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            }
        }
        finally {
            at_vars.$at_function$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 90070L)
    public static SubLObject propagate_removed_suf_function(final SubLObject collection, final SubLObject function_assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_function$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_function$.bind(function_assertion, thread);
            if (type.eql((SubLObject)at_defns.$kw108$ISA)) {
                genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym241$REMOVE_SUF_FUNCTION_ASSERTION), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            }
            else if (type.eql((SubLObject)at_defns.$kw208$QUOTED_ISA)) {
                genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym242$REMOVE_SUF_QUOTED_FUNCTION_ASSERTION), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            }
        }
        finally {
            at_vars.$at_function$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 90401L)
    public static SubLObject propagate_added_suf_functions(final SubLObject collection, final SubLObject function_assertions, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_functions$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_functions$.bind(function_assertions, thread);
            if (type.eql((SubLObject)at_defns.$kw108$ISA)) {
                genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym243$MERGE_SUF_FUNCTION_ASSERTIONS), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            }
            else if (type.eql((SubLObject)at_defns.$kw208$QUOTED_ISA)) {
                genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym244$MERGE_SUF_QUOTED_FUNCTION_ASSERTIONS), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            }
        }
        finally {
            at_vars.$at_functions$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 90734L)
    public static SubLObject propagate_removed_suf_functions(final SubLObject collection, final SubLObject function_assertions, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_functions$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            at_vars.$at_functions$.bind(function_assertions, thread);
            if (type.eql((SubLObject)at_defns.$kw108$ISA)) {
                genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym245$REMOVE_SUF_FUNCTION_ASSERTIONS), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            }
            else if (type.eql((SubLObject)at_defns.$kw208$QUOTED_ISA)) {
                genls.map_all_genls(Symbols.symbol_function((SubLObject)at_defns.$sym246$REMOVE_SUF_QUOTED_FUNCTION_ASSERTIONS), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
            }
        }
        finally {
            at_vars.$at_functions$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 91072L)
    public static SubLObject add_suf_function_assertion(final SubLObject collection, SubLObject function_assertion) {
        if (function_assertion == at_defns.UNPROVIDED) {
            function_assertion = at_vars.$at_function$.getDynamicValue();
        }
        return cache_suf_function_int(collection, function_assertion, (SubLObject)at_defns.$kw108$ISA, (SubLObject)at_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 91247L)
    public static SubLObject remove_suf_function_assertion(final SubLObject collection, SubLObject function_assertion) {
        if (function_assertion == at_defns.UNPROVIDED) {
            function_assertion = at_vars.$at_function$.getDynamicValue();
        }
        return uncache_suf_function_int(collection, function_assertion, (SubLObject)at_defns.$kw108$ISA, (SubLObject)at_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 91427L)
    public static SubLObject merge_suf_function_assertions(final SubLObject collection, SubLObject function_assertions) {
        if (function_assertions == at_defns.UNPROVIDED) {
            function_assertions = at_vars.$at_functions$.getDynamicValue();
        }
        return merge_suf_function_assertions_int(collection, function_assertions, (SubLObject)at_defns.$kw108$ISA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 91615L)
    public static SubLObject remove_suf_function_assertions(final SubLObject collection, SubLObject function_assertions) {
        if (function_assertions == at_defns.UNPROVIDED) {
            function_assertions = at_vars.$at_functions$.getDynamicValue();
        }
        return remove_suf_function_assertions_int(collection, function_assertions, (SubLObject)at_defns.$kw108$ISA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 91805L)
    public static SubLObject add_suf_quoted_function_assertion(final SubLObject collection, SubLObject function_assertion) {
        if (function_assertion == at_defns.UNPROVIDED) {
            function_assertion = at_vars.$at_function$.getDynamicValue();
        }
        return cache_suf_function_int(collection, function_assertion, (SubLObject)at_defns.$kw208$QUOTED_ISA, (SubLObject)at_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 91995L)
    public static SubLObject remove_suf_quoted_function_assertion(final SubLObject collection, SubLObject function_assertion) {
        if (function_assertion == at_defns.UNPROVIDED) {
            function_assertion = at_vars.$at_function$.getDynamicValue();
        }
        return uncache_suf_function_int(collection, function_assertion, (SubLObject)at_defns.$kw208$QUOTED_ISA, (SubLObject)at_defns.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 92189L)
    public static SubLObject merge_suf_quoted_function_assertions(final SubLObject collection, SubLObject function_assertions) {
        if (function_assertions == at_defns.UNPROVIDED) {
            function_assertions = at_vars.$at_functions$.getDynamicValue();
        }
        return merge_suf_function_assertions_int(collection, function_assertions, (SubLObject)at_defns.$kw208$QUOTED_ISA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 92391L)
    public static SubLObject remove_suf_quoted_function_assertions(final SubLObject collection, SubLObject function_assertions) {
        if (function_assertions == at_defns.UNPROVIDED) {
            function_assertions = at_vars.$at_functions$.getDynamicValue();
        }
        return remove_suf_function_assertions_int(collection, function_assertions, (SubLObject)at_defns.$kw208$QUOTED_ISA);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 92595L)
    public static SubLObject merge_suf_function_assertions_int(final SubLObject collection, final SubLObject function_assertions, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE((SubLObject)at_defns.FIVE_INTEGER)) {
            SubLObject cdolist_list_var = function_assertions;
            SubLObject assertion = (SubLObject)at_defns.NIL;
            assertion = cdolist_list_var.first();
            while (at_defns.NIL != cdolist_list_var) {
                defn_note((SubLObject)at_defns.FIVE_INTEGER, (SubLObject)at_defns.$str247$___add_sufficent_function__a__a_, collection, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return set_suf_function_assertions(collection, suf_function_sort(list_utilities.hash_delete_duplicates(ConsesLow.nconc(get_suf_function_assertions(collection, type), conses_high.copy_list(function_assertions)), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)), type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 93029L)
    public static SubLObject remove_suf_function_assertions_int(final SubLObject collection, final SubLObject function_assertions, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL == function_genl_searchedP(collection)) {
            final SubLObject assertions = get_suf_function_assertions(collection, type);
            if (at_defns.NIL != assertions) {
                SubLObject assertions_to_remove = (SubLObject)at_defns.NIL;
                SubLObject cdolist_list_var = function_assertions;
                SubLObject assertion = (SubLObject)at_defns.NIL;
                assertion = cdolist_list_var.first();
                while (at_defns.NIL != cdolist_list_var) {
                    if (at_defns.NIL == assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED) || at_defns.NIL == genls.genlP(assertions_high.gaf_arg2(assertion), collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                        assertions_to_remove = (SubLObject)ConsesLow.cons(assertion, assertions_to_remove);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
                if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE((SubLObject)at_defns.FOUR_INTEGER)) {
                    cdolist_list_var = assertions_to_remove;
                    assertion = (SubLObject)at_defns.NIL;
                    assertion = cdolist_list_var.first();
                    while (at_defns.NIL != cdolist_list_var) {
                        defn_note((SubLObject)at_defns.FOUR_INTEGER, (SubLObject)at_defns.$str226$____a__a__a_, (SubLObject)((type == at_defns.$kw108$ISA) ? at_defns.$str248$remove_sufficent_function : at_defns.$str231$remove_sufficient_quoted_function), collection, assertion, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
                final SubLObject new_value = suf_function_sort(conses_high.nset_difference(assertions, assertions_to_remove, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                if (at_defns.NIL != new_value) {
                    set_suf_function_assertions(collection, new_value, type);
                }
                else {
                    rem_suf_function_assertions(collection, type);
                }
                return new_value;
            }
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 93980L)
    public static SubLObject function_genl_searchedP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject searchedP = (SubLObject)at_defns.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(at_vars.$at_genls_space$.getDynamicValue(thread), thread);
            searchedP = sbhl_marking_methods.sbhl_recorded_node_p(fort, (SubLObject)at_defns.UNPROVIDED);
        }
        finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return searchedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 94164L)
    public static SubLObject suf_function_sort(final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL == at_vars.$sort_suf_function_assertionsP$.getDynamicValue(thread)) {
            return assertions;
        }
        if (at_defns.NIL == assertions) {
            return (SubLObject)at_defns.NIL;
        }
        if (at_defns.NIL != list_utilities.singletonP(assertions)) {
            return assertions;
        }
        return Sort.sort(conses_high.copy_list(assertions), Symbols.symbol_function((SubLObject)at_defns.$sym249$SUF_FUNCTION_SORT_PRED), Symbols.symbol_function((SubLObject)at_defns.$sym250$GAF_ARG2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 94433L)
    public static SubLObject suf_function_sort_pred(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLObject card_1 = cardinality_estimates.spec_cardinality(fort_1);
        final SubLObject card_2 = cardinality_estimates.spec_cardinality(fort_2);
        if (card_1.numG(card_2)) {
            return (SubLObject)at_defns.T;
        }
        if (card_1.numE(card_2)) {
            return kb_utilities.term_L(fort_1, fort_2, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 94690L)
    public static SubLObject clear_suf_functions() {
        defns.defns_cache_clrhash(suf_function_cache((SubLObject)at_defns.$kw108$ISA));
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 94959L)
    public static SubLObject clear_suf_quoted_functions() {
        defns.defns_cache_clrhash(suf_function_cache((SubLObject)at_defns.$kw208$QUOTED_ISA));
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 95111L)
    public static SubLObject reset_col_suf_functions(final SubLObject collection, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject function_preds = (SubLObject)at_defns.NIL;
        final SubLObject doneP = (SubLObject)at_defns.NIL;
        if (type.eql((SubLObject)at_defns.$kw108$ISA)) {
            function_preds = (SubLObject)at_defns.$list251;
        }
        else if (type.eql((SubLObject)at_defns.$kw208$QUOTED_ISA)) {
            function_preds = (SubLObject)at_defns.$list252;
        }
        SubLObject cdolist_list_var = function_preds;
        SubLObject function_pred = (SubLObject)at_defns.NIL;
        function_pred = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
                final SubLObject pred_var = function_pred;
                if (at_defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)at_defns.NIL;
                    final SubLObject _prev_bind_0_$325 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$326 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                        utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = (SubLObject)at_defns.NIL;
                        while (at_defns.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (at_defns.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                    SubLObject done_var_$327 = doneP;
                                    final SubLObject token_var_$328 = (SubLObject)at_defns.NIL;
                                    while (at_defns.NIL == done_var_$327) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$328);
                                        final SubLObject valid_$329 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$328.eql(assertion));
                                        if (at_defns.NIL != valid_$329) {
                                            final SubLObject function_collection = assertions_high.gaf_arg2(assertion);
                                            if (at_defns.NIL != genls.genlP(function_collection, collection, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                                                cache_suf_function(collection, assertion, type);
                                            }
                                        }
                                        done_var_$327 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$329 || at_defns.NIL != doneP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$326 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (at_defns.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$326, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid || at_defns.NIL != doneP);
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
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$326, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$325, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            function_pred = cdolist_list_var.first();
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 95720L)
    public static SubLObject reset_all_suf_functions(final SubLObject type, SubLObject clearP, SubLObject traceP) {
        if (clearP == at_defns.UNPROVIDED) {
            clearP = (SubLObject)at_defns.T;
        }
        if (traceP == at_defns.UNPROVIDED) {
            traceP = (SubLObject)at_defns.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_trace_level$.currentBinding(thread);
        try {
            at_vars.$at_trace_level$.bind((SubLObject)((at_defns.NIL != traceP) ? at_defns.FIVE_INTEGER : at_vars.$at_trace_level$.getDynamicValue(thread)), thread);
            SubLObject function_preds = (SubLObject)at_defns.NIL;
            final SubLObject _prev_bind_0_$331 = at_vars.$sort_suf_function_assertionsP$.currentBinding(thread);
            try {
                at_vars.$sort_suf_function_assertionsP$.bind((SubLObject)at_defns.NIL, thread);
                final SubLObject doneP = (SubLObject)at_defns.NIL;
                if (at_defns.NIL != clearP) {
                    if (type.eql((SubLObject)at_defns.$kw108$ISA)) {
                        clear_suf_functions();
                        function_preds = (SubLObject)at_defns.$list251;
                    }
                    else if (type.eql((SubLObject)at_defns.$kw208$QUOTED_ISA)) {
                        clear_suf_quoted_functions();
                        function_preds = (SubLObject)at_defns.$list252;
                    }
                }
                SubLObject cdolist_list_var = function_preds;
                SubLObject function_pred = (SubLObject)at_defns.NIL;
                function_pred = cdolist_list_var.first();
                while (at_defns.NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0_$332 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
                        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$333 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$334 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)at_defns.SIX_INTEGER), thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)at_defns.T, thread);
                            final SubLObject pred_var = function_pred;
                            if (at_defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                final SubLObject str = (SubLObject)at_defns.NIL;
                                final SubLObject _prev_bind_0_$334 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$335 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$337 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                try {
                                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                    utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                                    utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                                    utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
                                    utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
                                    utilities_macros.noting_progress_preamble(str);
                                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = doneP;
                                    final SubLObject token_var = (SubLObject)at_defns.NIL;
                                    while (at_defns.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (at_defns.NIL != valid) {
                                            utilities_macros.note_progress();
                                            SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                                SubLObject done_var_$338 = doneP;
                                                final SubLObject token_var_$339 = (SubLObject)at_defns.NIL;
                                                while (at_defns.NIL == done_var_$338) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$339);
                                                    final SubLObject valid_$340 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$339.eql(assertion));
                                                    if (at_defns.NIL != valid_$340) {
                                                        final SubLObject function_collection = assertions_high.gaf_arg2(assertion);
                                                        cache_suf_function(function_collection, assertion, type);
                                                    }
                                                    done_var_$338 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$340 || at_defns.NIL != doneP);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$335 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    if (at_defns.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$335, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid || at_defns.NIL != doneP);
                                    }
                                    utilities_macros.noting_progress_postamble();
                                }
                                finally {
                                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$337, thread);
                                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$335, thread);
                                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$334, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$334, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$333, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$332, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    function_pred = cdolist_list_var.first();
                }
            }
            finally {
                at_vars.$sort_suf_function_assertionsP$.rebind(_prev_bind_0_$331, thread);
            }
        }
        finally {
            at_vars.$at_trace_level$.rebind(_prev_bind_0, thread);
        }
        if (at_defns.NIL != at_vars.$sort_suf_function_assertionsP$.getDynamicValue(thread)) {
            final SubLObject cdohash_table = suf_function_cache(type);
            SubLObject fort = (SubLObject)at_defns.NIL;
            SubLObject suf_function_assertions = (SubLObject)at_defns.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    fort = Hashtables.getEntryKey(cdohash_entry);
                    suf_function_assertions = Hashtables.getEntryValue(cdohash_entry);
                    set_suf_function_assertions(fort, suf_function_sort(suf_function_assertions), type);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return defns.defns_cache_hash_table_count(suf_function_cache(type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 96737L)
    public static SubLObject initialize_sufficient_functions_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = (SubLObject)at_defns.$str253$Initializing_sufficient_functions;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
            utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
            utilities_macros.noting_progress_preamble(str);
            reset_all_suf_functions((SubLObject)at_defns.$kw108$ISA, (SubLObject)at_defns.T, (SubLObject)at_defns.UNPROVIDED);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 96945L)
    public static SubLObject initialize_sufficient_quoted_functions_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = (SubLObject)at_defns.$str254$Initializing_sufficient_quoted_fu;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
            utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
            utilities_macros.noting_progress_preamble(str);
            reset_all_suf_functions((SubLObject)at_defns.$kw208$QUOTED_ISA, (SubLObject)at_defns.T, (SubLObject)at_defns.UNPROVIDED);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 97174L)
    public static SubLObject sufficient_function_cache_mal_assertions(SubLObject v_cache) {
        if (v_cache == at_defns.UNPROVIDED) {
            v_cache = defns.$suf_function_cache_index$.getGlobalValue();
        }
        SubLObject result = (SubLObject)at_defns.NIL;
        if (at_defns.NIL != defns.defns_cache_index_p(v_cache)) {
            final SubLObject cdohash_table = defns.get_defn_cache_from_index(v_cache);
            SubLObject key = (SubLObject)at_defns.NIL;
            SubLObject value = (SubLObject)at_defns.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key = Hashtables.getEntryKey(cdohash_entry);
                    SubLObject cdolist_list_var;
                    value = (cdolist_list_var = Hashtables.getEntryValue(cdohash_entry));
                    SubLObject assertion = (SubLObject)at_defns.NIL;
                    assertion = cdolist_list_var.first();
                    while (at_defns.NIL != cdolist_list_var) {
                        if (at_defns.NIL == assertions_high.valid_assertion(assertion, (SubLObject)at_defns.UNPROVIDED)) {
                            final SubLObject item_var = assertion;
                            if (at_defns.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
                                result = (SubLObject)ConsesLow.cons(item_var, result);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        else {
            SubLObject key2 = (SubLObject)at_defns.NIL;
            SubLObject value2 = (SubLObject)at_defns.NIL;
            final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator(v_cache);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                    final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                    key2 = Hashtables.getEntryKey(cdohash_entry2);
                    SubLObject cdolist_list_var2;
                    value2 = (cdolist_list_var2 = Hashtables.getEntryValue(cdohash_entry2));
                    SubLObject assertion2 = (SubLObject)at_defns.NIL;
                    assertion2 = cdolist_list_var2.first();
                    while (at_defns.NIL != cdolist_list_var2) {
                        if (at_defns.NIL == assertions_high.valid_assertion(assertion2, (SubLObject)at_defns.UNPROVIDED)) {
                            final SubLObject item_var2 = assertion2;
                            if (at_defns.NIL == conses_high.member(item_var2, result, Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
                                result = (SubLObject)ConsesLow.cons(item_var2, result);
                            }
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion2 = cdolist_list_var2.first();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator2);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 97684L)
    public static SubLObject sufficient_function_cache_mal_assertions_coerce(SubLObject v_cache) {
        if (v_cache == at_defns.UNPROVIDED) {
            v_cache = defns.$suf_function_cache_index$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_defns.NIL != defns.defns_cache_index_p(v_cache)) {
            final SubLObject table_var = defns.get_defn_cache_from_index(v_cache);
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)at_defns.$str255$cdohash, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)at_defns.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)at_defns.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject key = (SubLObject)at_defns.NIL;
                    SubLObject value = (SubLObject)at_defns.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            key = Hashtables.getEntryKey(cdohash_entry);
                            value = Hashtables.getEntryValue(cdohash_entry);
                            print_high.print(key, (SubLObject)at_defns.UNPROVIDED);
                            fi.fi_kill_int(key);
                            final SubLObject mal_assertions = sufficient_function_cache_mal_assertions((SubLObject)at_defns.UNPROVIDED);
                            if (at_defns.NIL != mal_assertions) {
                                print_high.print(mal_assertions, (SubLObject)at_defns.UNPROVIDED);
                                Errors.sublisp_break((SubLObject)at_defns.$str256$stop, at_defns.EMPTY_SUBL_OBJECT_ARRAY);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)at_defns.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$342 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$342, thread);
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
        }
        else {
            final SubLObject table_var = v_cache;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)at_defns.$str255$cdohash, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)at_defns.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)at_defns.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject key = (SubLObject)at_defns.NIL;
                    SubLObject value = (SubLObject)at_defns.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            key = Hashtables.getEntryKey(cdohash_entry);
                            value = Hashtables.getEntryValue(cdohash_entry);
                            print_high.print(key, (SubLObject)at_defns.UNPROVIDED);
                            fi.fi_kill_int(key);
                            final SubLObject mal_assertions = sufficient_function_cache_mal_assertions((SubLObject)at_defns.UNPROVIDED);
                            if (at_defns.NIL != mal_assertions) {
                                print_high.print(mal_assertions, (SubLObject)at_defns.UNPROVIDED);
                                Errors.sublisp_break((SubLObject)at_defns.$str256$stop, at_defns.EMPTY_SUBL_OBJECT_ARRAY);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)at_defns.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$343 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$343, thread);
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
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 98365L)
    public static SubLObject assertion_referenced_in_sufficient_function_cacheP(final SubLObject assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)at_defns.NIL;
        SubLObject catch_var = (SubLObject)at_defns.NIL;
        try {
            thread.throwStack.push(at_defns.$kw257$MAPPING_DONE);
            final SubLObject cdohash_table = suf_function_cache(type);
            SubLObject key = (SubLObject)at_defns.NIL;
            SubLObject value = (SubLObject)at_defns.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    key = Hashtables.getEntryKey(cdohash_entry);
                    value = Hashtables.getEntryValue(cdohash_entry);
                    if (at_defns.NIL != subl_promotions.memberP(assertion, value, Symbols.symbol_function((SubLObject)at_defns.$sym144$KBEQ), (SubLObject)at_defns.UNPROVIDED)) {
                        v_answer = (SubLObject)at_defns.T;
                        utilities_macros.mapping_finished();
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)at_defns.$kw257$MAPPING_DONE);
        }
        finally {
            thread.throwStack.pop();
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 99412L)
    public static SubLObject diagnose_sufficient_functions_cache(final SubLObject type, SubLObject statusP, SubLObject stream) {
        if (statusP == at_defns.UNPROVIDED) {
            statusP = (SubLObject)at_defns.NIL;
        }
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        at_defns.$suf_function_cache_mal_keys$.setDynamicValue((SubLObject)at_defns.NIL, thread);
        at_defns.$suf_function_cache_key_wXo_value$.setDynamicValue((SubLObject)at_defns.NIL, thread);
        at_defns.$suf_function_cache_key_wXmal_value$.setDynamicValue((SubLObject)at_defns.NIL, thread);
        at_defns.$suf_function_cache_key_wXstale_value$.setDynamicValue((SubLObject)at_defns.NIL, thread);
        at_defns.$suf_function_cache_keys_wXo_inerited_value$.setDynamicValue((SubLObject)at_defns.NIL, thread);
        at_defns.$suf_function_cache_awol_direct_assertions$.setDynamicValue((SubLObject)at_defns.NIL, thread);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            SubLObject cdolist_list_var = (SubLObject)((type == at_defns.$kw108$ISA) ? at_defns.$list251 : at_defns.$list252);
            SubLObject function_pred = (SubLObject)at_defns.NIL;
            function_pred = cdolist_list_var.first();
            while (at_defns.NIL != cdolist_list_var) {
                final SubLObject doneP = (SubLObject)at_defns.NIL;
                final SubLObject _prev_bind_0_$344 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$345 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
                    final SubLObject pred_var = function_pred;
                    if (at_defns.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)at_defns.NIL;
                        final SubLObject _prev_bind_0_$345 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$346 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                            utilities_macros.$progress_notification_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)at_defns.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((at_defns.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : at_defns.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = doneP;
                            final SubLObject token_var = (SubLObject)at_defns.NIL;
                            while (at_defns.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (at_defns.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)at_defns.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_defns.$kw50$GAF, (SubLObject)at_defns.$kw21$TRUE, (SubLObject)at_defns.NIL);
                                        SubLObject done_var_$348 = doneP;
                                        final SubLObject token_var_$349 = (SubLObject)at_defns.NIL;
                                        while (at_defns.NIL == done_var_$348) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$349);
                                            final SubLObject valid_$350 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$349.eql(assertion));
                                            if (at_defns.NIL != valid_$350) {
                                                final SubLObject function_collection = assertions_high.gaf_arg2(assertion);
                                                if (at_defns.NIL == suf_function_assertionP(function_collection, assertion, type)) {
                                                    at_defns.$suf_function_cache_awol_direct_assertions$.setDynamicValue((SubLObject)ConsesLow.cons(assertion, at_defns.$suf_function_cache_awol_direct_assertions$.getDynamicValue(thread)), thread);
                                                }
                                            }
                                            done_var_$348 = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid_$350 || at_defns.NIL != doneP);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$346 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (at_defns.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$346, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == valid || at_defns.NIL != doneP);
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
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$346, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$345, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$345, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$344, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                function_pred = cdolist_list_var.first();
            }
            final SubLObject table_var = suf_function_cache(type);
            final SubLObject _prev_bind_0_$347 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$347 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_13 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)at_defns.$str258$diagnostics__sufficient_functions, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)at_defns.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)at_defns.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject fort = (SubLObject)at_defns.NIL;
                    SubLObject assertions = (SubLObject)at_defns.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            fort = Hashtables.getEntryKey(cdohash_entry);
                            assertions = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject _prev_bind_0_$348 = utilities_macros.$progress_total$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$348 = utilities_macros.$progress_sofar$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_total$.bind((SubLObject)at_defns.NIL, thread);
                                utilities_macros.$progress_sofar$.bind((SubLObject)at_defns.NIL, thread);
                                if (at_defns.NIL == forts.valid_fortP(fort)) {
                                    at_defns.$suf_function_cache_mal_keys$.setDynamicValue((SubLObject)ConsesLow.cons(fort, at_defns.$suf_function_cache_mal_keys$.getDynamicValue(thread)), thread);
                                }
                                if (at_defns.NIL == assertions) {
                                    at_defns.$suf_function_cache_key_wXo_value$.setDynamicValue((SubLObject)ConsesLow.cons(fort, at_defns.$suf_function_cache_key_wXo_value$.getDynamicValue(thread)), thread);
                                }
                                SubLObject mal_assertionP = (SubLObject)at_defns.NIL;
                                if (at_defns.NIL == mal_assertionP) {
                                    SubLObject csome_list_var;
                                    SubLObject assertion2;
                                    for (csome_list_var = assertions, assertion2 = (SubLObject)at_defns.NIL, assertion2 = csome_list_var.first(); at_defns.NIL == mal_assertionP && at_defns.NIL != csome_list_var; mal_assertionP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == assertions_high.valid_assertion(assertion2, (SubLObject)at_defns.UNPROVIDED)), csome_list_var = csome_list_var.rest(), assertion2 = csome_list_var.first()) {}
                                }
                                if (at_defns.NIL != mal_assertionP) {
                                    at_defns.$suf_function_cache_key_wXmal_value$.setDynamicValue((SubLObject)ConsesLow.cons(fort, at_defns.$suf_function_cache_key_wXmal_value$.getDynamicValue(thread)), thread);
                                }
                                mal_assertionP = (SubLObject)at_defns.NIL;
                                if (at_defns.NIL == mal_assertionP) {
                                    SubLObject csome_list_var = assertions;
                                    SubLObject assertion2 = (SubLObject)at_defns.NIL;
                                    assertion2 = csome_list_var.first();
                                    while (at_defns.NIL == mal_assertionP && at_defns.NIL != csome_list_var) {
                                        final SubLObject function_collection2 = assertions_high.gaf_arg2(assertion2);
                                        mal_assertionP = (SubLObject)SubLObjectFactory.makeBoolean(at_defns.NIL == genls.genlP(function_collection2, fort, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                                        csome_list_var = csome_list_var.rest();
                                        assertion2 = csome_list_var.first();
                                    }
                                }
                                if (at_defns.NIL != mal_assertionP) {
                                    at_defns.$suf_function_cache_key_wXstale_value$.setDynamicValue((SubLObject)ConsesLow.cons(fort, at_defns.$suf_function_cache_key_wXstale_value$.getDynamicValue(thread)), thread);
                                }
                                if (at_defns.NIL != assertions) {
                                    SubLObject cdolist_list_var2 = genls.all_genls(fort, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED);
                                    SubLObject genl = (SubLObject)at_defns.NIL;
                                    genl = cdolist_list_var2.first();
                                    while (at_defns.NIL != cdolist_list_var2) {
                                        if (at_defns.NIL != conses_high.set_difference(assertions, get_suf_function_assertions(genl, type), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED)) {
                                            final SubLObject item_var = genl;
                                            if (at_defns.NIL == conses_high.member(item_var, at_defns.$suf_function_cache_keys_wXo_inerited_value$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
                                                at_defns.$suf_function_cache_keys_wXo_inerited_value$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, at_defns.$suf_function_cache_keys_wXo_inerited_value$.getDynamicValue(thread)), thread);
                                            }
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        genl = cdolist_list_var2.first();
                                    }
                                }
                            }
                            finally {
                                utilities_macros.$progress_sofar$.rebind(_prev_bind_1_$348, thread);
                                utilities_macros.$progress_total$.rebind(_prev_bind_0_$348, thread);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)at_defns.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$349 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$349, thread);
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
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$347, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$347, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (at_defns.NIL != statusP) {
            kbi_sfc_status(stream);
        }
        return (SubLObject)at_defns.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 101430L)
    public static SubLObject kbi_sfc_status(SubLObject stream) {
        if (stream == at_defns.UNPROVIDED) {
            stream = (SubLObject)at_defns.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(stream, (SubLObject)at_defns.$str259$___suf_function_cache_mal_keys___, Sequences.length(at_defns.$suf_function_cache_mal_keys$.getDynamicValue(thread)));
        PrintLow.format(stream, (SubLObject)at_defns.$str260$___suf_function_cache_key_w_o_val, Sequences.length(at_defns.$suf_function_cache_key_wXo_value$.getDynamicValue(thread)));
        PrintLow.format(stream, (SubLObject)at_defns.$str261$___suf_function_cache_key_w_mal_v, Sequences.length(at_defns.$suf_function_cache_key_wXmal_value$.getDynamicValue(thread)));
        PrintLow.format(stream, (SubLObject)at_defns.$str262$___suf_function_cache_key_w_stale, Sequences.length(at_defns.$suf_function_cache_key_wXstale_value$.getDynamicValue(thread)));
        PrintLow.format(stream, (SubLObject)at_defns.$str263$___suf_function_cache_keys_w_o_in, Sequences.length(at_defns.$suf_function_cache_keys_wXo_inerited_value$.getDynamicValue(thread)));
        PrintLow.format(stream, (SubLObject)at_defns.$str264$___suf_function_cache_awol_direct, Sequences.length(at_defns.$suf_function_cache_awol_direct_assertions$.getDynamicValue(thread)));
        return (SubLObject)at_defns.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 102172L)
    public static SubLObject sfc_cleanup(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject collection = (SubLObject)at_defns.NIL;
        SubLObject v_skolems = (SubLObject)at_defns.NIL;
        SubLObject n = (SubLObject)at_defns.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_defns.$sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_defns.$const107$EverythingPSC, thread);
            streams_high.terpri((SubLObject)at_defns.UNPROVIDED);
            final SubLObject list_var;
            v_skolems = (list_var = isa.all_fort_instances(at_defns.$const265$SkolemFunction, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
            final SubLObject _prev_bind_0_$357 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$358 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)at_defns.$str266$mapping_skolems, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)at_defns.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)at_defns.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject skolem = (SubLObject)at_defns.NIL;
                    skolem = csome_list_var.first();
                    while (at_defns.NIL != csome_list_var) {
                        final SubLObject cols = sufficient_function_of(skolem, type, (SubLObject)at_defns.UNPROVIDED);
                        fi.fi_kill_int(skolem);
                        n = Numbers.add(n, (SubLObject)at_defns.ONE_INTEGER);
                        SubLObject cdolist_list_var = cols;
                        SubLObject col = (SubLObject)at_defns.NIL;
                        col = cdolist_list_var.first();
                        while (at_defns.NIL != cdolist_list_var) {
                            collection = col;
                            SubLObject cdolist_list_var_$359 = suf_function_assertions(col, type);
                            SubLObject assertion = (SubLObject)at_defns.NIL;
                            assertion = cdolist_list_var_$359.first();
                            while (at_defns.NIL != cdolist_list_var_$359) {
                                if (at_defns.NIL == assertions_high.valid_assertion(assertion, (SubLObject)at_defns.T)) {
                                    print_high.print(assertion, (SubLObject)at_defns.UNPROVIDED);
                                    print_high.print((SubLObject)ConsesLow.list(skolem, collection), (SubLObject)at_defns.UNPROVIDED);
                                    Errors.sublisp_break((SubLObject)at_defns.$str256$stop, at_defns.EMPTY_SUBL_OBJECT_ARRAY);
                                }
                                cdolist_list_var_$359 = cdolist_list_var_$359.rest();
                                assertion = cdolist_list_var_$359.first();
                            }
                            any_sufficient_non_reified_functionP(col, type, (SubLObject)at_defns.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            col = cdolist_list_var.first();
                        }
                        PrintLow.format((SubLObject)at_defns.T, (SubLObject)at_defns.$str268$_a_, n);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)at_defns.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        skolem = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$358 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$358, thread);
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
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$358, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$357, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)at_defns.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-defns.lisp", position = 102809L)
    public static SubLObject sfc_mal_assertions(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table_var = suf_function_cache(type);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)at_defns.$str258$diagnostics__sufficient_functions, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Hashtables.hash_table_count(table_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)at_defns.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)at_defns.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)at_defns.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject fort = (SubLObject)at_defns.NIL;
                SubLObject assertions = (SubLObject)at_defns.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table_var);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        fort = Hashtables.getEntryKey(cdohash_entry);
                        SubLObject cdolist_list_var;
                        assertions = (cdolist_list_var = Hashtables.getEntryValue(cdohash_entry));
                        SubLObject assertion = (SubLObject)at_defns.NIL;
                        assertion = cdolist_list_var.first();
                        while (at_defns.NIL != cdolist_list_var) {
                            if (at_defns.NIL == assertions_high.valid_assertion(assertion, (SubLObject)at_defns.T)) {
                                print_high.print(assertion, (SubLObject)at_defns.UNPROVIDED);
                                print_high.print(fort, (SubLObject)at_defns.UNPROVIDED);
                                Errors.sublisp_break((SubLObject)at_defns.$str256$stop, at_defns.EMPTY_SUBL_OBJECT_ARRAY);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion = cdolist_list_var.first();
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)at_defns.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$361 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_defns.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$361, thread);
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
        return (SubLObject)at_defns.NIL;
    }
    
    public static SubLObject declare_at_defns_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_defn_cache_as_alist", "SUF-DEFN-CACHE-AS-ALIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_defn_cache_get", "SUF-DEFN-CACHE-GET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_defn_cache_add", "SUF-DEFN-CACHE-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_defn_cache_rem", "SUF-DEFN-CACHE-REM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_defn_cache_merge", "SUF-DEFN-CACHE-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_defn_assertions", "REMOVE-SUF-DEFN-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "clear_suf_defns", "CLEAR-SUF-DEFNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sort_suf_defn_cache", "SORT-SUF-DEFN-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_quoted_defn_cache_as_alist", "SUF-QUOTED-DEFN-CACHE-AS-ALIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_quoted_defn_cache_get", "SUF-QUOTED-DEFN-CACHE-GET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_quoted_defn_cache_add", "SUF-QUOTED-DEFN-CACHE-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_quoted_defn_cache_rem", "SUF-QUOTED-DEFN-CACHE-REM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_quoted_defn_cache_merge", "SUF-QUOTED-DEFN-CACHE-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_quoted_defn_assertions", "REMOVE-SUF-QUOTED-DEFN-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "clear_suf_quoted_defns", "CLEAR-SUF-QUOTED-DEFNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sort_suf_quoted_defn_cache", "SORT-SUF-QUOTED-DEFN-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "at_defns_admitP", "AT-DEFNS-ADMIT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "at_defns_rejectP", "AT-DEFNS-REJECT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defns_admitP", "DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_old_defns_admitP_meters", "RESET-OLD-DEFNS-ADMIT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_defns_admitP_metered", "OLD-DEFNS-ADMIT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_defns_admitP", "OLD-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defns_rejectP", "DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_old_defns_rejectP_meters", "RESET-OLD-DEFNS-REJECT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_defns_rejectP_metered", "OLD-DEFNS-REJECT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_defns_rejectP", "OLD-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defining_defns_admitP", "DEFINING-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defining_defns_rejectP", "DEFINING-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_defining_defns_status_meters", "RESET-DEFINING-DEFNS-STATUS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defining_defns_status_metered", "DEFINING-DEFNS-STATUS-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defining_defns_status", "DEFINING-DEFNS-STATUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defining_defn_violation_data", "DEFINING-DEFN-VIOLATION-DATA", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_sufficient_defns_admitP_meters", "RESET-SUFFICIENT-DEFNS-ADMIT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sufficient_defns_admitP_metered", "SUFFICIENT-DEFNS-ADMIT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sufficient_defns_admitP", "SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sufficient_defns_admit_int", "SUFFICIENT-DEFNS-ADMIT-INT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "why_sufficient_defns_admitP", "WHY-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sufficient_defn_violation_data", "SUFFICIENT-DEFN-VIOLATION-DATA", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "necessary_defns_permitP", "NECESSARY-DEFNS-PERMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_necessary_defns_rejectP_meters", "RESET-NECESSARY-DEFNS-REJECT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "necessary_defns_rejectP_metered", "NECESSARY-DEFNS-REJECT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "necessary_defns_rejectP", "NECESSARY-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "necessary_defns_rejectP_int", "NECESSARY-DEFNS-REJECT?-INT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "denotational_term_admitted_by_defn_via_isaP", "DENOTATIONAL-TERM-ADMITTED-BY-DEFN-VIA-ISA?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_rejected_by_necessary_defns_meters", "RESET-REJECTED-BY-NECESSARY-DEFNS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "rejected_by_necessary_defns_metered", "REJECTED-BY-NECESSARY-DEFNS-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "rejected_by_necessary_defns", "REJECTED-BY-NECESSARY-DEFNS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "why_defns_rejectP", "WHY-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "necessary_defn_violation_data", "NECESSARY-DEFN-VIOLATION-DATA", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "at_quoted_defns_admitP", "AT-QUOTED-DEFNS-ADMIT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "at_quoted_defns_rejectP", "AT-QUOTED-DEFNS-REJECT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_defns_admitP", "QUOTED-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_old_quoted_defns_admitP_meters", "RESET-OLD-QUOTED-DEFNS-ADMIT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_quoted_defns_admitP_metered", "OLD-QUOTED-DEFNS-ADMIT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_quoted_defns_admitP", "OLD-QUOTED-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_defns_rejectP", "QUOTED-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_old_quoted_defns_rejectP_meters", "RESET-OLD-QUOTED-DEFNS-REJECT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_quoted_defns_rejectP_metered", "OLD-QUOTED-DEFNS-REJECT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_quoted_defns_rejectP", "OLD-QUOTED-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_quoted_defining_defns_status_meters", "RESET-QUOTED-DEFINING-DEFNS-STATUS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_defining_defns_status_metered", "QUOTED-DEFINING-DEFNS-STATUS-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_defining_defns_status", "QUOTED-DEFINING-DEFNS-STATUS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_quoted_sufficient_defns_admitP_meters", "RESET-QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_sufficient_defns_admitP_metered", "QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_sufficient_defns_admitP", "QUOTED-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_necessary_defns_permitP", "QUOTED-NECESSARY-DEFNS-PERMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_quoted_necessary_defns_rejectP_meters", "RESET-QUOTED-NECESSARY-DEFNS-REJECT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_necessary_defns_rejectP_metered", "QUOTED-NECESSARY-DEFNS-REJECT?-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_necessary_defns_rejectP", "QUOTED-NECESSARY-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "denotational_term_admitted_by_quoted_defn_via_quoted_isaP", "DENOTATIONAL-TERM-ADMITTED-BY-QUOTED-DEFN-VIA-QUOTED-ISA?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_rejected_by_quoted_necessary_defns_meters", "RESET-REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "rejected_by_quoted_necessary_defns_metered", "REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "rejected_by_quoted_necessary_defns", "REJECTED-BY-QUOTED-NECESSARY-DEFNS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "why_quoted_defns_rejectP", "WHY-QUOTED-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "new_defn_stack", "NEW-DEFN-STACK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_stack_push", "DEFN-STACK-PUSH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_stack_pop", "DEFN-STACK-POP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "recursive_defn_callP", "RECURSIVE-DEFN-CALL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "get_defn_col_history", "GET-DEFN-COL-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "set_defn_col_history", "SET-DEFN-COL-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "get_defn_fn_history", "GET-DEFN-FN-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "set_defn_fn_history", "SET-DEFN-FN-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "get_quoted_defn_fn_history", "GET-QUOTED-DEFN-FN-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "set_quoted_defn_fn_history", "SET-QUOTED-DEFN-FN-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "get_quoted_defn_col_history", "GET-QUOTED-DEFN-COL-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "set_quoted_defn_col_history", "SET-QUOTED-DEFN-COL-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_defns_admitP", "QUIET-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_sufficient_defns_admitP", "QUIET-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_defns_rejectP", "QUIET-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_defn_admitsP", "QUIET-DEFN-ADMITS?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_admitsP", "DEFN-ADMITS?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "collection_specific_defnP", "COLLECTION-SPECIFIC-DEFN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_history", "DEFN-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_defn_admits_intP_meters", "RESET-DEFN-ADMITS-INT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_admits_intP_metered", "DEFN-ADMITS-INT?-METERED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_admits_intP", "DEFN-ADMITS-INT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_quoted_defns_admitP", "QUIET-QUOTED-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_quoted_sufficient_defns_admitP", "QUIET-QUOTED-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_quoted_defns_rejectP", "QUIET-QUOTED-DEFNS-REJECT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_quoted_defn_admitsP", "QUIET-QUOTED-DEFN-ADMITS?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_defn_admitsP", "QUOTED-DEFN-ADMITS?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_defn_history", "QUOTED-DEFN-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_quoted_defn_admits_intP_meters", "RESET-QUOTED-DEFN-ADMITS-INT?-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_defn_admits_intP_metered", "QUOTED-DEFN-ADMITS-INT?-METERED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_defn_admits_intP", "QUOTED-DEFN-ADMITS-INT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "clear_defn_cyc_evaluate", "CLEAR-DEFN-CYC-EVALUATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_defn_cyc_evaluate", "REMOVE-DEFN-CYC-EVALUATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_cyc_evaluate_internal", "DEFN-CYC-EVALUATE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_cyc_evaluate", "DEFN-CYC-EVALUATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "valid_defnP", "VALID-DEFN?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "viable_defnP", "VIABLE-DEFN?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_funcall", "DEFN-FUNCALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "at_denotational_term_p", "AT-DENOTATIONAL-TERM-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "clear_defn_space", "CLEAR-DEFN-SPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "map_sufficient_defn_cols", "MAP-SUFFICIENT-DEFN-COLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "has_typeP", "HAS-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_has_typeP", "QUIET-HAS-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_has_any_typeP", "QUIET-HAS-ANY-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_has_type_among", "QUIET-HAS-TYPE-AMONG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_has_type_memoizedP_internal", "QUIET-HAS-TYPE-MEMOIZED?-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_has_type_memoizedP", "QUIET-HAS-TYPE-MEMOIZED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "not_has_type_by_extent_knownP", "NOT-HAS-TYPE-BY-EXTENT-KNOWN?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "not_has_typeP", "NOT-HAS-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_not_has_typeP", "QUIET-NOT-HAS-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quick_quiet_has_typeP", "QUICK-QUIET-HAS-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quick_quiet_has_typeP_fort", "QUICK-QUIET-HAS-TYPE?-FORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quick_quiet_has_typeP_naut", "QUICK-QUIET-HAS-TYPE?-NAUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quick_quiet_has_typeP_collection_union", "QUICK-QUIET-HAS-TYPE?-COLLECTION-UNION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quick_quiet_has_typeP_collection_intersection", "QUICK-QUIET-HAS-TYPE?-COLLECTION-INTERSECTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "max_mts_of_admitting_defns", "MAX-MTS-OF-ADMITTING-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "mts_of_admitting_sufficient_defns", "MTS-OF-ADMITTING-SUFFICIENT-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_mts_of_admitting_sufficient_defns", "OLD-MTS-OF-ADMITTING-SUFFICIENT-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "max_mts_of_admitting_quoted_defns", "MAX-MTS-OF-ADMITTING-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "mts_of_admitting_sufficient_quoted_defns", "MTS-OF-ADMITTING-SUFFICIENT-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "isa_via_defnsP", "ISA-VIA-DEFNS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "hl_justify_isa_via_defns", "HL-JUSTIFY-ISA-VIA-DEFNS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_hl_justify_isa_via_defns", "OLD-HL-JUSTIFY-ISA-VIA-DEFNS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "not_isa_via_defnsP", "NOT-ISA-VIA-DEFNS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "why_not_isa_via_defnsP", "WHY-NOT-ISA-VIA-DEFNS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "hl_justify_not_isa_via_defns", "HL-JUSTIFY-NOT-ISA-VIA-DEFNS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "hl_justify_not_quoted_isa_via_defns", "HL-JUSTIFY-NOT-QUOTED-ISA-VIA-DEFNS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "collection_rejects_via_disjoint_defnsP", "COLLECTION-REJECTS-VIA-DISJOINT-DEFNS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "why_collection_rejects_via_disjoint_defnsP", "WHY-COLLECTION-REJECTS-VIA-DISJOINT-DEFNS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "collections_admitting_term_via_defns", "COLLECTIONS-ADMITTING-TERM-VIA-DEFNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "min_max_collections_admitting_term_via_defns", "MIN-MAX-COLLECTIONS-ADMITTING-TERM-VIA-DEFNS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "collections_admitting_term_via_defns_1", "COLLECTIONS-ADMITTING-TERM-VIA-DEFNS-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "gather_collections_admitting_via_defns", "GATHER-COLLECTIONS-ADMITTING-VIA-DEFNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_note", "DEFN-NOTE", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_error", "DEFN-ERROR", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_cerror", "DEFN-CERROR", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_warn", "DEFN-WARN", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_defn_meters", "RESET-DEFN-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "report_defn_meters", "REPORT-DEFN-METERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "summarize_defn_meters", "SUMMARIZE-DEFN-METERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "summarize_defn_meter_cache_header", "SUMMARIZE-DEFN-METER-CACHE-HEADER", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "summarize_defn_meter_cache", "SUMMARIZE-DEFN-METER-CACHE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "summarize_defn_meter_cache_trailer", "SUMMARIZE-DEFN-METER-CACHE-TRAILER", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "report_defn_meter_cache", "REPORT-DEFN-METER-CACHE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "report_defn_meter_cache_header", "REPORT-DEFN-METER-CACHE-HEADER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "report_defn_meter_cache_trailer", "REPORT-DEFN-METER-CACHE-TRAILER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "report_defn_meter_cache_call", "REPORT-DEFN-METER-CACHE-CALL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "report_defn_meter_cache_total", "REPORT-DEFN-METER-CACHE-TOTAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "function_col_width", "FUNCTION-COL-WIDTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "meter_col_widths", "METER-COL-WIDTHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_defn_assertions", "SUF-DEFN-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_defnP", "SUF-DEFN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_suf_defnP", "OLD-SUF-DEFN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "any_sufficient_defn_anywhereP", "ANY-SUFFICIENT-DEFN-ANYWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_any_sufficient_defn_anywhereP", "OLD-ANY-SUFFICIENT-DEFN-ANYWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_defn_assertionP", "SUF-DEFN-ASSERTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_suf_defn", "ADD-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_iff_defn", "ADD-IFF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_add_suf_defn", "OLD-ADD-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_defn", "REMOVE-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_iff_defn", "REMOVE-IFF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_remove_suf_defn", "OLD-REMOVE-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_cache_suf_defn_meters", "RESET-CACHE-SUF-DEFN-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "cache_suf_defn_metered", "CACHE-SUF-DEFN-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "cache_suf_defn", "CACHE-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_uncache_suf_defn_meters", "RESET-UNCACHE-SUF-DEFN-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "uncache_suf_defn_metered", "UNCACHE-SUF-DEFN-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "uncache_suf_defn", "UNCACHE-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "cache_suf_defn_int", "CACHE-SUF-DEFN-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "uncache_suf_defn_int", "UNCACHE-SUF-DEFN-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "handle_added_genl_for_suf_defns", "HANDLE-ADDED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_old_handle_added_genl_for_suf_defns_meters", "RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_handle_added_genl_for_suf_defns_metered", "OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_handle_added_genl_for_suf_defns", "OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "handle_removed_genl_for_suf_defns", "HANDLE-REMOVED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_old_handle_removed_genl_for_suf_defns_meters", "RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_handle_removed_genl_for_suf_defns_metered", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_handle_removed_genl_for_suf_defns", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_added_suf_defn", "PROPAGATE-ADDED-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_removed_suf_defn", "PROPAGATE-REMOVED-SUF-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_added_suf_defns", "PROPAGATE-ADDED-SUF-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_removed_suf_defns", "PROPAGATE-REMOVED-SUF-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_suf_defn_assertion", "ADD-SUF-DEFN-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_defn_assertion", "REMOVE-SUF-DEFN-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "merge_suf_defn_assertions", "MERGE-SUF-DEFN-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "defn_genl_searchedP", "DEFN-GENL-SEARCHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "arg1_spec_cardinality", "ARG1-SPEC-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_defn_sort", "SUF-DEFN-SORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_col_suf_defns", "RESET-COL-SUF-DEFNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_all_suf_defns", "RESET-ALL-SUF-DEFNS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "initialize_sufficient_defns_cache", "INITIALIZE-SUFFICIENT-DEFNS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_quoted_defn_assertions", "SUF-QUOTED-DEFN-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_quoted_defnP", "SUF-QUOTED-DEFN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "any_sufficient_quoted_defnP", "ANY-SUFFICIENT-QUOTED-DEFN?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "any_sufficient_quoted_defn_anywhereP", "ANY-SUFFICIENT-QUOTED-DEFN-ANYWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_any_sufficient_quoted_defn_anywhereP", "OLD-ANY-SUFFICIENT-QUOTED-DEFN-ANYWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_quoted_defn_assertionP", "SUF-QUOTED-DEFN-ASSERTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quoted_has_typeP", "QUOTED-HAS-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_quoted_has_typeP", "QUIET-QUOTED-HAS-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "not_quoted_has_type_by_extent_knownP", "NOT-QUOTED-HAS-TYPE-BY-EXTENT-KNOWN?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "not_quoted_has_typeP", "NOT-QUOTED-HAS-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "quiet_not_quoted_has_typeP", "QUIET-NOT-QUOTED-HAS-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_suf_quoted_defn", "ADD-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_iff_quoted_defn", "ADD-IFF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_add_suf_quoted_defn", "OLD-ADD-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_quoted_defn", "REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_iff_quoted_defn", "REMOVE-IFF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_remove_suf_quoted_defn", "OLD-REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_cache_suf_quoted_defn_meters", "RESET-CACHE-SUF-QUOTED-DEFN-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "cache_suf_quoted_defn_metered", "CACHE-SUF-QUOTED-DEFN-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "cache_suf_quoted_defn", "CACHE-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_uncache_suf_quoted_defn_meters", "RESET-UNCACHE-SUF-QUOTED-DEFN-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "uncache_suf_quoted_defn_metered", "UNCACHE-SUF-QUOTED-DEFN-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "uncache_suf_quoted_defn", "UNCACHE-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "cache_suf_quoted_defn_int", "CACHE-SUF-QUOTED-DEFN-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "uncache_suf_quoted_defn_int", "UNCACHE-SUF-QUOTED-DEFN-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "handle_added_genl_for_suf_quoted_defns", "HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_old_handle_added_genl_for_suf_quoted_defns_meters", "RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_handle_added_genl_for_suf_quoted_defns_metered", "OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_handle_added_genl_for_suf_quoted_defns", "OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "handle_removed_genl_for_suf_quoted_defns", "HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_old_handle_removed_genl_for_suf_quoted_defns_meters", "RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_handle_removed_genl_for_suf_quoted_defns_metered", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "old_handle_removed_genl_for_suf_quoted_defns", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_added_suf_quoted_defn", "PROPAGATE-ADDED-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_removed_suf_quoted_defn", "PROPAGATE-REMOVED-SUF-QUOTED-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_added_suf_quoted_defns", "PROPAGATE-ADDED-SUF-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_removed_suf_quoted_defns", "PROPAGATE-REMOVED-SUF-QUOTED-DEFNS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_suf_quoted_defn_assertion", "ADD-SUF-QUOTED-DEFN-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_quoted_defn_assertion", "REMOVE-SUF-QUOTED-DEFN-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "merge_suf_quoted_defn_assertions", "MERGE-SUF-QUOTED-DEFN-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_col_suf_quoted_defns", "RESET-COL-SUF-QUOTED-DEFNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_all_suf_quoted_defns", "RESET-ALL-SUF-QUOTED-DEFNS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "initialize_sufficient_quoted_defns_cache", "INITIALIZE-SUFFICIENT-QUOTED-DEFNS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_function_cache", "SUF-FUNCTION-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "get_suf_function_assertions", "GET-SUF-FUNCTION-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "set_suf_function_assertions", "SET-SUF-FUNCTION-ASSERTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "rem_suf_function_assertions", "REM-SUF-FUNCTION-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_function_assertions", "SUF-FUNCTION-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_functionP", "SUF-FUNCTION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "any_sufficient_functionP", "ANY-SUFFICIENT-FUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "any_sufficient_quoted_functionP", "ANY-SUFFICIENT-QUOTED-FUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "any_sufficient_functionP_int", "ANY-SUFFICIENT-FUNCTION?-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "any_sufficient_non_reified_functionP", "ANY-SUFFICIENT-NON-REIFIED-FUNCTION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_function_assertionP", "SUF-FUNCTION-ASSERTION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sufficient_function_of", "SUFFICIENT-FUNCTION-OF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_suf_function", "ADD-SUF-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_function", "REMOVE-SUF-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_suf_quoted_function", "ADD-SUF-QUOTED-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_quoted_function", "REMOVE-SUF-QUOTED-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_suf_function_int", "ADD-SUF-FUNCTION-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_function_int", "REMOVE-SUF-FUNCTION-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_cache_suf_function_meters", "RESET-CACHE-SUF-FUNCTION-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "cache_suf_function_metered", "CACHE-SUF-FUNCTION-METERED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "cache_suf_function", "CACHE-SUF-FUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_uncache_suf_function_meters", "RESET-UNCACHE-SUF-FUNCTION-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "uncache_suf_function_metered", "UNCACHE-SUF-FUNCTION-METERED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "uncache_suf_function", "UNCACHE-SUF-FUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "cache_suf_function_int", "CACHE-SUF-FUNCTION-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "uncache_suf_function_int", "UNCACHE-SUF-FUNCTION-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_handle_added_genl_for_suf_functions_meters", "RESET-HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "handle_added_genl_for_suf_functions_metered", "HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "handle_added_genl_for_suf_functions", "HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_handle_removed_genl_for_suf_functions_meters", "RESET-HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "handle_removed_genl_for_suf_functions_metered", "HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "handle_removed_genl_for_suf_functions", "HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_added_suf_function", "PROPAGATE-ADDED-SUF-FUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_removed_suf_function", "PROPAGATE-REMOVED-SUF-FUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_added_suf_functions", "PROPAGATE-ADDED-SUF-FUNCTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "propagate_removed_suf_functions", "PROPAGATE-REMOVED-SUF-FUNCTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_suf_function_assertion", "ADD-SUF-FUNCTION-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_function_assertion", "REMOVE-SUF-FUNCTION-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "merge_suf_function_assertions", "MERGE-SUF-FUNCTION-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_function_assertions", "REMOVE-SUF-FUNCTION-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "add_suf_quoted_function_assertion", "ADD-SUF-QUOTED-FUNCTION-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_quoted_function_assertion", "REMOVE-SUF-QUOTED-FUNCTION-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "merge_suf_quoted_function_assertions", "MERGE-SUF-QUOTED-FUNCTION-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_quoted_function_assertions", "REMOVE-SUF-QUOTED-FUNCTION-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "merge_suf_function_assertions_int", "MERGE-SUF-FUNCTION-ASSERTIONS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "remove_suf_function_assertions_int", "REMOVE-SUF-FUNCTION-ASSERTIONS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "function_genl_searchedP", "FUNCTION-GENL-SEARCHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_function_sort", "SUF-FUNCTION-SORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "suf_function_sort_pred", "SUF-FUNCTION-SORT-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "clear_suf_functions", "CLEAR-SUF-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "clear_suf_quoted_functions", "CLEAR-SUF-QUOTED-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_col_suf_functions", "RESET-COL-SUF-FUNCTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "reset_all_suf_functions", "RESET-ALL-SUF-FUNCTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "initialize_sufficient_functions_cache", "INITIALIZE-SUFFICIENT-FUNCTIONS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "initialize_sufficient_quoted_functions_cache", "INITIALIZE-SUFFICIENT-QUOTED-FUNCTIONS-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sufficient_function_cache_mal_assertions", "SUFFICIENT-FUNCTION-CACHE-MAL-ASSERTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sufficient_function_cache_mal_assertions_coerce", "SUFFICIENT-FUNCTION-CACHE-MAL-ASSERTIONS-COERCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "assertion_referenced_in_sufficient_function_cacheP", "ASSERTION-REFERENCED-IN-SUFFICIENT-FUNCTION-CACHE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "diagnose_sufficient_functions_cache", "DIAGNOSE-SUFFICIENT-FUNCTIONS-CACHE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "kbi_sfc_status", "KBI-SFC-STATUS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sfc_cleanup", "SFC-CLEANUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_defns", "sfc_mal_assertions", "SFC-MAL-ASSERTIONS", 1, 0, false);
        return (SubLObject)at_defns.NIL;
    }
    
    public static SubLObject init_at_defns_file() {
        at_defns.$use_new_defns_functionsP$ = SubLFiles.defvar("*USE-NEW-DEFNS-FUNCTIONS?*", (SubLObject)at_defns.T);
        at_defns.$old_defns_admitP_meters$ = SubLFiles.defparameter("*OLD-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$old_defns_rejectP_meters$ = SubLFiles.defparameter("*OLD-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$defining_defns_status_meters$ = SubLFiles.defparameter("*DEFINING-DEFNS-STATUS-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$sufficient_defns_admitP_meters$ = SubLFiles.defparameter("*SUFFICIENT-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$necessary_defns_rejectP_meters$ = SubLFiles.defparameter("*NECESSARY-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$rejected_by_necessary_defns_meters$ = SubLFiles.defparameter("*REJECTED-BY-NECESSARY-DEFNS-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$old_quoted_defns_admitP_meters$ = SubLFiles.defparameter("*OLD-QUOTED-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$old_quoted_defns_rejectP_meters$ = SubLFiles.defparameter("*OLD-QUOTED-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$quoted_defining_defns_status_meters$ = SubLFiles.defparameter("*QUOTED-DEFINING-DEFNS-STATUS-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$quoted_sufficient_defns_admitP_meters$ = SubLFiles.defparameter("*QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$quoted_necessary_defns_rejectP_meters$ = SubLFiles.defparameter("*QUOTED-NECESSARY-DEFNS-REJECT?-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$rejected_by_quoted_necessary_defns_meters$ = SubLFiles.defparameter("*REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$defn_admits_intP_meters$ = SubLFiles.defparameter("*DEFN-ADMITS-INT?-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$quoted_defn_admits_intP_meters$ = SubLFiles.defparameter("*QUOTED-DEFN-ADMITS-INT?-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$defn_cyc_evaluate_caching_state$ = SubLFiles.deflexical("*DEFN-CYC-EVALUATE-CACHING-STATE*", (SubLObject)at_defns.NIL);
        at_defns.$cat_defns_failing$ = SubLFiles.defparameter("*CAT-DEFNS-FAILING*", (SubLObject)at_defns.NIL);
        at_defns.$cache_suf_defn_meters$ = SubLFiles.defparameter("*CACHE-SUF-DEFN-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$uncache_suf_defn_meters$ = SubLFiles.defparameter("*UNCACHE-SUF-DEFN-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$old_handle_added_genl_for_suf_defns_meters$ = SubLFiles.defparameter("*OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$old_handle_removed_genl_for_suf_defns_meters$ = SubLFiles.defparameter("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$cache_suf_quoted_defn_meters$ = SubLFiles.defparameter("*CACHE-SUF-QUOTED-DEFN-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$uncache_suf_quoted_defn_meters$ = SubLFiles.defparameter("*UNCACHE-SUF-QUOTED-DEFN-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$ = SubLFiles.defparameter("*OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$ = SubLFiles.defparameter("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$cache_suf_function_meters$ = SubLFiles.defparameter("*CACHE-SUF-FUNCTION-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$uncache_suf_function_meters$ = SubLFiles.defparameter("*UNCACHE-SUF-FUNCTION-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$handle_added_genl_for_suf_functions_meters$ = SubLFiles.defparameter("*HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$handle_removed_genl_for_suf_functions_meters$ = SubLFiles.defparameter("*HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS*", Hashtables.make_hash_table((SubLObject)at_defns.EIGHT_INTEGER, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
        at_defns.$suf_function_cache_mal_keys$ = SubLFiles.defparameter("*SUF-FUNCTION-CACHE-MAL-KEYS*", (SubLObject)at_defns.NIL);
        at_defns.$suf_function_cache_key_wXo_value$ = SubLFiles.defparameter("*SUF-FUNCTION-CACHE-KEY-W/O-VALUE*", (SubLObject)at_defns.NIL);
        at_defns.$suf_function_cache_key_wXmal_value$ = SubLFiles.defparameter("*SUF-FUNCTION-CACHE-KEY-W/MAL-VALUE*", (SubLObject)at_defns.NIL);
        at_defns.$suf_function_cache_key_wXstale_value$ = SubLFiles.defparameter("*SUF-FUNCTION-CACHE-KEY-W/STALE-VALUE*", (SubLObject)at_defns.NIL);
        at_defns.$suf_function_cache_keys_wXo_inerited_value$ = SubLFiles.defparameter("*SUF-FUNCTION-CACHE-KEYS-W/O-INERITED-VALUE*", (SubLObject)at_defns.NIL);
        at_defns.$suf_function_cache_awol_direct_assertions$ = SubLFiles.defparameter("*SUF-FUNCTION-CACHE-AWOL-DIRECT-ASSERTIONS*", (SubLObject)at_defns.NIL);
        return (SubLObject)at_defns.NIL;
    }
    
    public static SubLObject setup_at_defns_file() {
        SubLObject item_var = (SubLObject)at_defns.$sym3$_OLD_DEFNS_ADMIT__METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_old_defns_admitP_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$old_defns_admitP_meters$.getDynamicValue(), (SubLObject)at_defns.$sym13$RESET_OLD_DEFNS_ADMIT__METERS);
        SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        SubLObject v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym11$OLD_DEFNS_ADMIT_ == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$old_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym14$_OLD_DEFNS_REJECT__METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_old_defns_rejectP_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$old_defns_rejectP_meters$.getDynamicValue(), (SubLObject)at_defns.$sym16$RESET_OLD_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym15$OLD_DEFNS_REJECT_ == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$old_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym17$_DEFINING_DEFNS_STATUS_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_defining_defns_status_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$defining_defns_status_meters$.getDynamicValue(), (SubLObject)at_defns.$sym19$RESET_DEFINING_DEFNS_STATUS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym18$DEFINING_DEFNS_STATUS == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$defining_defns_status_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym26$_SUFFICIENT_DEFNS_ADMIT__METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_sufficient_defns_admitP_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(), (SubLObject)at_defns.$sym28$RESET_SUFFICIENT_DEFNS_ADMIT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym27$SUFFICIENT_DEFNS_ADMIT_ == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$sufficient_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym31$_NECESSARY_DEFNS_REJECT__METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_necessary_defns_rejectP_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(), (SubLObject)at_defns.$sym33$RESET_NECESSARY_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym32$NECESSARY_DEFNS_REJECT_ == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$necessary_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym51$_REJECTED_BY_NECESSARY_DEFNS_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_rejected_by_necessary_defns_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(), (SubLObject)at_defns.$sym53$RESET_REJECTED_BY_NECESSARY_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym52$REJECTED_BY_NECESSARY_DEFNS == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$rejected_by_necessary_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym57$_OLD_QUOTED_DEFNS_ADMIT__METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_old_quoted_defns_admitP_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(), (SubLObject)at_defns.$sym59$RESET_OLD_QUOTED_DEFNS_ADMIT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym58$OLD_QUOTED_DEFNS_ADMIT_ == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$old_quoted_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym60$_OLD_QUOTED_DEFNS_REJECT__METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_old_quoted_defns_rejectP_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(), (SubLObject)at_defns.$sym62$RESET_OLD_QUOTED_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym61$OLD_QUOTED_DEFNS_REJECT_ == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$old_quoted_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym63$_QUOTED_DEFINING_DEFNS_STATUS_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_quoted_defining_defns_status_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(), (SubLObject)at_defns.$sym65$RESET_QUOTED_DEFINING_DEFNS_STATUS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym64$QUOTED_DEFINING_DEFNS_STATUS == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$quoted_defining_defns_status_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym67$_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_quoted_sufficient_defns_admitP_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(), (SubLObject)at_defns.$sym69$RESET_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym68$QUOTED_SUFFICIENT_DEFNS_ADMIT_ == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$quoted_sufficient_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym70$_QUOTED_NECESSARY_DEFNS_REJECT__METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_quoted_necessary_defns_rejectP_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(), (SubLObject)at_defns.$sym72$RESET_QUOTED_NECESSARY_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym71$QUOTED_NECESSARY_DEFNS_REJECT_ == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$quoted_necessary_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym74$_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_rejected_by_quoted_necessary_defns_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(), (SubLObject)at_defns.$sym76$RESET_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym75$REJECTED_BY_QUOTED_NECESSARY_DEFNS == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$rejected_by_quoted_necessary_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym80$_DEFN_ADMITS_INT__METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_defn_admits_intP_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$defn_admits_intP_meters$.getDynamicValue(), (SubLObject)at_defns.$sym83$RESET_DEFN_ADMITS_INT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym82$DEFN_ADMITS_INT_ == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$defn_admits_intP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym87$_QUOTED_DEFN_ADMITS_INT__METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_quoted_defn_admits_intP_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(), (SubLObject)at_defns.$sym89$RESET_QUOTED_DEFN_ADMITS_INT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym88$QUOTED_DEFN_ADMITS_INT_ == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$quoted_defn_admits_intP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        memoization_state.note_globally_cached_function((SubLObject)at_defns.$sym90$DEFN_CYC_EVALUATE);
        memoization_state.note_memoized_function((SubLObject)at_defns.$sym100$QUIET_HAS_TYPE_MEMOIZED_);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym145$ADD_SUF_DEFN);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym146$ADD_IFF_DEFN);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym151$OLD_ADD_SUF_DEFN);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym152$REMOVE_SUF_DEFN);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym153$REMOVE_IFF_DEFN);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym154$OLD_REMOVE_SUF_DEFN);
        item_var = (SubLObject)at_defns.$sym155$_CACHE_SUF_DEFN_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_cache_suf_defn_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$cache_suf_defn_meters$.getDynamicValue(), (SubLObject)at_defns.$sym158$RESET_CACHE_SUF_DEFN_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym157$CACHE_SUF_DEFN == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$cache_suf_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym159$_UNCACHE_SUF_DEFN_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_uncache_suf_defn_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$uncache_suf_defn_meters$.getDynamicValue(), (SubLObject)at_defns.$sym161$RESET_UNCACHE_SUF_DEFN_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym160$UNCACHE_SUF_DEFN == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$uncache_suf_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym164$_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_old_handle_added_genl_for_suf_defns_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), (SubLObject)at_defns.$sym167$RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym166$OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym168$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_old_handle_removed_genl_for_suf_defns_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), (SubLObject)at_defns.$sym170$RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym169$OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym180$ADD_SUF_QUOTED_DEFN);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym181$ADD_IFF_QUOTED_DEFN);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym183$OLD_ADD_SUF_QUOTED_DEFN);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym184$REMOVE_SUF_QUOTED_DEFN);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym185$REMOVE_IFF_QUOTED_DEFN);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym186$OLD_REMOVE_SUF_QUOTED_DEFN);
        item_var = (SubLObject)at_defns.$sym187$_CACHE_SUF_QUOTED_DEFN_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_cache_suf_quoted_defn_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(), (SubLObject)at_defns.$sym189$RESET_CACHE_SUF_QUOTED_DEFN_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym188$CACHE_SUF_QUOTED_DEFN == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$cache_suf_quoted_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym190$_UNCACHE_SUF_QUOTED_DEFN_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_uncache_suf_quoted_defn_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(), (SubLObject)at_defns.$sym192$RESET_UNCACHE_SUF_QUOTED_DEFN_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym191$UNCACHE_SUF_QUOTED_DEFN == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$uncache_suf_quoted_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym196$_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_old_handle_added_genl_for_suf_quoted_defns_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), (SubLObject)at_defns.$sym198$RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym197$OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym199$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_old_handle_removed_genl_for_suf_quoted_defns_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), (SubLObject)at_defns.$sym201$RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym200$OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym209$ADD_SUF_FUNCTION);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym210$REMOVE_SUF_FUNCTION);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym211$ADD_SUF_QUOTED_FUNCTION);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym212$REMOVE_SUF_QUOTED_FUNCTION);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym217$ADD_SUF_FUNCTION_INT);
        utilities_macros.register_kb_function((SubLObject)at_defns.$sym218$REMOVE_SUF_FUNCTION_INT);
        item_var = (SubLObject)at_defns.$sym219$_CACHE_SUF_FUNCTION_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_cache_suf_function_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$cache_suf_function_meters$.getDynamicValue(), (SubLObject)at_defns.$sym222$RESET_CACHE_SUF_FUNCTION_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym221$CACHE_SUF_FUNCTION == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$cache_suf_function_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym223$_UNCACHE_SUF_FUNCTION_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_uncache_suf_function_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$uncache_suf_function_meters$.getDynamicValue(), (SubLObject)at_defns.$sym225$RESET_UNCACHE_SUF_FUNCTION_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym224$UNCACHE_SUF_FUNCTION == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$uncache_suf_function_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym232$_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_handle_added_genl_for_suf_functions_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(), (SubLObject)at_defns.$sym234$RESET_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym233$HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$handle_added_genl_for_suf_functions_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = (SubLObject)at_defns.$sym236$_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS_;
        if (at_defns.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_defns.EQL), Symbols.symbol_function((SubLObject)at_defns.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        reset_handle_removed_genl_for_suf_functions_meters();
        Hashtables.sethash((SubLObject)at_defns.$kw12$RESET, at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(), (SubLObject)at_defns.$sym238$RESET_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = (SubLObject)at_defns.NIL;
        v_cache = cdolist_list_var.first();
        while (at_defns.NIL != cdolist_list_var) {
            if (at_defns.$sym237$HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS == Hashtables.gethash((SubLObject)at_defns.$kw10$FUNCTION, v_cache, (SubLObject)at_defns.UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(Sequences.delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED, (SubLObject)at_defns.UNPROVIDED));
                Hashtables.clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        }
        at_vars.$defn_meter_caches$.setDynamicValue((SubLObject)ConsesLow.cons(at_defns.$handle_removed_genl_for_suf_functions_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        return (SubLObject)at_defns.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_at_defns_file();
    }
    
    @Override
	public void initializeVariables() {
        init_at_defns_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_at_defns_file();
    }
    
    static {
        me = (SubLFile)new at_defns();
        at_defns.$use_new_defns_functionsP$ = null;
        at_defns.$old_defns_admitP_meters$ = null;
        at_defns.$old_defns_rejectP_meters$ = null;
        at_defns.$defining_defns_status_meters$ = null;
        at_defns.$sufficient_defns_admitP_meters$ = null;
        at_defns.$necessary_defns_rejectP_meters$ = null;
        at_defns.$rejected_by_necessary_defns_meters$ = null;
        at_defns.$old_quoted_defns_admitP_meters$ = null;
        at_defns.$old_quoted_defns_rejectP_meters$ = null;
        at_defns.$quoted_defining_defns_status_meters$ = null;
        at_defns.$quoted_sufficient_defns_admitP_meters$ = null;
        at_defns.$quoted_necessary_defns_rejectP_meters$ = null;
        at_defns.$rejected_by_quoted_necessary_defns_meters$ = null;
        at_defns.$defn_admits_intP_meters$ = null;
        at_defns.$quoted_defn_admits_intP_meters$ = null;
        at_defns.$defn_cyc_evaluate_caching_state$ = null;
        at_defns.$cat_defns_failing$ = null;
        at_defns.$cache_suf_defn_meters$ = null;
        at_defns.$uncache_suf_defn_meters$ = null;
        at_defns.$old_handle_added_genl_for_suf_defns_meters$ = null;
        at_defns.$old_handle_removed_genl_for_suf_defns_meters$ = null;
        at_defns.$cache_suf_quoted_defn_meters$ = null;
        at_defns.$uncache_suf_quoted_defn_meters$ = null;
        at_defns.$old_handle_added_genl_for_suf_quoted_defns_meters$ = null;
        at_defns.$old_handle_removed_genl_for_suf_quoted_defns_meters$ = null;
        at_defns.$cache_suf_function_meters$ = null;
        at_defns.$uncache_suf_function_meters$ = null;
        at_defns.$handle_added_genl_for_suf_functions_meters$ = null;
        at_defns.$handle_removed_genl_for_suf_functions_meters$ = null;
        at_defns.$suf_function_cache_mal_keys$ = null;
        at_defns.$suf_function_cache_key_wXo_value$ = null;
        at_defns.$suf_function_cache_key_wXmal_value$ = null;
        at_defns.$suf_function_cache_key_wXstale_value$ = null;
        at_defns.$suf_function_cache_keys_wXo_inerited_value$ = null;
        at_defns.$suf_function_cache_awol_direct_assertions$ = null;
        $str0$___remove_sufficent_defn__a__a_ = SubLObjectFactory.makeString("~%(remove-sufficent-defn ~a ~a)");
        $kw1$ADMITTED = SubLObjectFactory.makeKeyword("ADMITTED");
        $kw2$REJECTED = SubLObjectFactory.makeKeyword("REJECTED");
        $sym3$_OLD_DEFNS_ADMIT__METERS_ = SubLObjectFactory.makeSymbol("*OLD-DEFNS-ADMIT?-METERS*");
        $kw4$CALLS = SubLObjectFactory.makeKeyword("CALLS");
        $kw5$TIMES = SubLObjectFactory.makeKeyword("TIMES");
        $kw6$RESULTS = SubLObjectFactory.makeKeyword("RESULTS");
        $kw7$ARGS = SubLObjectFactory.makeKeyword("ARGS");
        $kw8$ARG_LIST = SubLObjectFactory.makeKeyword("ARG-LIST");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $kw10$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $sym11$OLD_DEFNS_ADMIT_ = SubLObjectFactory.makeSymbol("OLD-DEFNS-ADMIT?");
        $kw12$RESET = SubLObjectFactory.makeKeyword("RESET");
        $sym13$RESET_OLD_DEFNS_ADMIT__METERS = SubLObjectFactory.makeSymbol("RESET-OLD-DEFNS-ADMIT?-METERS");
        $sym14$_OLD_DEFNS_REJECT__METERS_ = SubLObjectFactory.makeSymbol("*OLD-DEFNS-REJECT?-METERS*");
        $sym15$OLD_DEFNS_REJECT_ = SubLObjectFactory.makeSymbol("OLD-DEFNS-REJECT?");
        $sym16$RESET_OLD_DEFNS_REJECT__METERS = SubLObjectFactory.makeSymbol("RESET-OLD-DEFNS-REJECT?-METERS");
        $sym17$_DEFINING_DEFNS_STATUS_METERS_ = SubLObjectFactory.makeSymbol("*DEFINING-DEFNS-STATUS-METERS*");
        $sym18$DEFINING_DEFNS_STATUS = SubLObjectFactory.makeSymbol("DEFINING-DEFNS-STATUS");
        $sym19$RESET_DEFINING_DEFNS_STATUS_METERS = SubLObjectFactory.makeSymbol("RESET-DEFINING-DEFNS-STATUS-METERS");
        $const20$defnIff = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnIff"));
        $kw21$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw22$VIA_GENL_PRED = SubLObjectFactory.makeKeyword("VIA-GENL-PRED");
        $kw23$AT_CONSTRAINT_GAF = SubLObjectFactory.makeKeyword("AT-CONSTRAINT-GAF");
        $kw24$MAL_ARG_WRT_QUOTED_IFF_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");
        $kw25$MAL_ARG_WRT_IFF_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-IFF-DEFN");
        $sym26$_SUFFICIENT_DEFNS_ADMIT__METERS_ = SubLObjectFactory.makeSymbol("*SUFFICIENT-DEFNS-ADMIT?-METERS*");
        $sym27$SUFFICIENT_DEFNS_ADMIT_ = SubLObjectFactory.makeSymbol("SUFFICIENT-DEFNS-ADMIT?");
        $sym28$RESET_SUFFICIENT_DEFNS_ADMIT__METERS = SubLObjectFactory.makeSymbol("RESET-SUFFICIENT-DEFNS-ADMIT?-METERS");
        $kw29$MAL_ARG_WRT_QUOTED_SUF_DEFNS = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");
        $kw30$MAL_ARG_WRT_SUF_DEFNS = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-SUF-DEFNS");
        $sym31$_NECESSARY_DEFNS_REJECT__METERS_ = SubLObjectFactory.makeSymbol("*NECESSARY-DEFNS-REJECT?-METERS*");
        $sym32$NECESSARY_DEFNS_REJECT_ = SubLObjectFactory.makeSymbol("NECESSARY-DEFNS-REJECT?");
        $sym33$RESET_NECESSARY_DEFNS_REJECT__METERS = SubLObjectFactory.makeSymbol("RESET-NECESSARY-DEFNS-REJECT?-METERS");
        $kw34$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw35$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw36$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym37$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw38$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str39$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym40$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw41$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str42$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw43$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str44$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const45$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list46 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnIff")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnNecessary")));
        $str47$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str48$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str49$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $kw50$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym51$_REJECTED_BY_NECESSARY_DEFNS_METERS_ = SubLObjectFactory.makeSymbol("*REJECTED-BY-NECESSARY-DEFNS-METERS*");
        $sym52$REJECTED_BY_NECESSARY_DEFNS = SubLObjectFactory.makeSymbol("REJECTED-BY-NECESSARY-DEFNS");
        $sym53$RESET_REJECTED_BY_NECESSARY_DEFNS_METERS = SubLObjectFactory.makeSymbol("RESET-REJECTED-BY-NECESSARY-DEFNS-METERS");
        $const54$defnNecessary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnNecessary"));
        $kw55$MAL_ARG_WRT_QUOTED_NEC_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");
        $kw56$MAL_ARG_WRT_NEC_DEFN = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-NEC-DEFN");
        $sym57$_OLD_QUOTED_DEFNS_ADMIT__METERS_ = SubLObjectFactory.makeSymbol("*OLD-QUOTED-DEFNS-ADMIT?-METERS*");
        $sym58$OLD_QUOTED_DEFNS_ADMIT_ = SubLObjectFactory.makeSymbol("OLD-QUOTED-DEFNS-ADMIT?");
        $sym59$RESET_OLD_QUOTED_DEFNS_ADMIT__METERS = SubLObjectFactory.makeSymbol("RESET-OLD-QUOTED-DEFNS-ADMIT?-METERS");
        $sym60$_OLD_QUOTED_DEFNS_REJECT__METERS_ = SubLObjectFactory.makeSymbol("*OLD-QUOTED-DEFNS-REJECT?-METERS*");
        $sym61$OLD_QUOTED_DEFNS_REJECT_ = SubLObjectFactory.makeSymbol("OLD-QUOTED-DEFNS-REJECT?");
        $sym62$RESET_OLD_QUOTED_DEFNS_REJECT__METERS = SubLObjectFactory.makeSymbol("RESET-OLD-QUOTED-DEFNS-REJECT?-METERS");
        $sym63$_QUOTED_DEFINING_DEFNS_STATUS_METERS_ = SubLObjectFactory.makeSymbol("*QUOTED-DEFINING-DEFNS-STATUS-METERS*");
        $sym64$QUOTED_DEFINING_DEFNS_STATUS = SubLObjectFactory.makeSymbol("QUOTED-DEFINING-DEFNS-STATUS");
        $sym65$RESET_QUOTED_DEFINING_DEFNS_STATUS_METERS = SubLObjectFactory.makeSymbol("RESET-QUOTED-DEFINING-DEFNS-STATUS-METERS");
        $const66$quotedDefnIff = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnIff"));
        $sym67$_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS_ = SubLObjectFactory.makeSymbol("*QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS*");
        $sym68$QUOTED_SUFFICIENT_DEFNS_ADMIT_ = SubLObjectFactory.makeSymbol("QUOTED-SUFFICIENT-DEFNS-ADMIT?");
        $sym69$RESET_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS = SubLObjectFactory.makeSymbol("RESET-QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS");
        $sym70$_QUOTED_NECESSARY_DEFNS_REJECT__METERS_ = SubLObjectFactory.makeSymbol("*QUOTED-NECESSARY-DEFNS-REJECT?-METERS*");
        $sym71$QUOTED_NECESSARY_DEFNS_REJECT_ = SubLObjectFactory.makeSymbol("QUOTED-NECESSARY-DEFNS-REJECT?");
        $sym72$RESET_QUOTED_NECESSARY_DEFNS_REJECT__METERS = SubLObjectFactory.makeSymbol("RESET-QUOTED-NECESSARY-DEFNS-REJECT?-METERS");
        $list73 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnIff")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnNecessary")));
        $sym74$_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS_ = SubLObjectFactory.makeSymbol("*REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS*");
        $sym75$REJECTED_BY_QUOTED_NECESSARY_DEFNS = SubLObjectFactory.makeSymbol("REJECTED-BY-QUOTED-NECESSARY-DEFNS");
        $sym76$RESET_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS = SubLObjectFactory.makeSymbol("RESET-REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS");
        $const77$quotedDefnNecessary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnNecessary"));
        $str78$defn_stack_consistency_error___Ex = SubLObjectFactory.makeString("defn-stack consistency error.  Expected ~s to be on the top of the stack, but instead got ~s.");
        $str79$recursive_call_of_defn__a_with_ar = SubLObjectFactory.makeString("recursive call of defn ~a with argument ~a");
        $sym80$_DEFN_ADMITS_INT__METERS_ = SubLObjectFactory.makeSymbol("*DEFN-ADMITS-INT?-METERS*");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFN"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"));
        $sym82$DEFN_ADMITS_INT_ = SubLObjectFactory.makeSymbol("DEFN-ADMITS-INT?");
        $sym83$RESET_DEFN_ADMITS_INT__METERS = SubLObjectFactory.makeSymbol("RESET-DEFN-ADMITS-INT?-METERS");
        $str84$__defn_test__term__s__defn__s_of_ = SubLObjectFactory.makeString("~%defn test: term ~s; defn ~s of collection ~s: ~s");
        $str85$__defn_test__term__s__defn__s_of_ = SubLObjectFactory.makeString("~%defn test: term ~s; defn ~s of collection ~s (via ~s): ~s");
        $str86$recursive_call_of_quoted_defn__a_ = SubLObjectFactory.makeString("recursive call of quoted defn ~a with argument ~a");
        $sym87$_QUOTED_DEFN_ADMITS_INT__METERS_ = SubLObjectFactory.makeSymbol("*QUOTED-DEFN-ADMITS-INT?-METERS*");
        $sym88$QUOTED_DEFN_ADMITS_INT_ = SubLObjectFactory.makeSymbol("QUOTED-DEFN-ADMITS-INT?");
        $sym89$RESET_QUOTED_DEFN_ADMITS_INT__METERS = SubLObjectFactory.makeSymbol("RESET-QUOTED-DEFN-ADMITS-INT?-METERS");
        $sym90$DEFN_CYC_EVALUATE = SubLObjectFactory.makeSymbol("DEFN-CYC-EVALUATE");
        $sym91$_DEFN_CYC_EVALUATE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*DEFN-CYC-EVALUATE-CACHING-STATE*");
        $int92$24 = SubLObjectFactory.makeInteger(24);
        $str93$_s_has_invalid_defn___s = SubLObjectFactory.makeString("~s has invalid defn: ~s");
        $str94$invalid_defn___s = SubLObjectFactory.makeString("invalid defn: ~s");
        $str95$_s_has_non_viable_defn___s = SubLObjectFactory.makeString("~s has non-viable defn: ~s");
        $str96$non_viable_defn___s = SubLObjectFactory.makeString("non-viable defn: ~s");
        $sym97$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $list98 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("DEFN-ASSERTIONS"));
        $sym99$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym100$QUIET_HAS_TYPE_MEMOIZED_ = SubLObjectFactory.makeSymbol("QUIET-HAS-TYPE-MEMOIZED?");
        $const101$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const102$Function_Denotational = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $const103$SpecsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $const104$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $list105 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB")));
        $sym106$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const107$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw108$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const109$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw110$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $kw111$DEFN = SubLObjectFactory.makeKeyword("DEFN");
        $kw112$DISJOINTWITH = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $const113$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $const114$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $int115$64 = SubLObjectFactory.makeInteger(64);
        $const116$defnSufficient = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnSufficient"));
        $sym117$COLLECTIONS_ADMITTING_TERM_VIA_DEFNS_1 = SubLObjectFactory.makeSymbol("COLLECTIONS-ADMITTING-TERM-VIA-DEFNS-1");
        $sym118$GATHER_COLLECTIONS_ADMITTING_VIA_DEFNS = SubLObjectFactory.makeSymbol("GATHER-COLLECTIONS-ADMITTING-VIA-DEFNS");
        $str119$__warn__ = SubLObjectFactory.makeString("~%warn: ");
        $sym120$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str121$____defn_module_meters_ = SubLObjectFactory.makeString("~%~%defn module meters ");
        $int122$27 = SubLObjectFactory.makeInteger(27);
        $str123$_ = SubLObjectFactory.makeString("*");
        $str124$_____a__ = SubLObjectFactory.makeString("~%  ~a :");
        $str125$function = SubLObjectFactory.makeString("function");
        $str126$___calls___ = SubLObjectFactory.makeString(" [ calls ] ");
        $str127$___total_time___ = SubLObjectFactory.makeString(" [ total time ] ");
        $str128$____avg_time____ = SubLObjectFactory.makeString(" [  avg time  ] ");
        $str129$_s = SubLObjectFactory.makeString("~s");
        $sym130$_ = SubLObjectFactory.makeSymbol("+");
        $str131$____a___ = SubLObjectFactory.makeString("   ~a   ");
        $str132$_a = SubLObjectFactory.makeString("~a");
        $str133$_ = SubLObjectFactory.makeString(" ");
        $int134$46 = SubLObjectFactory.makeInteger(46);
        $str135$_s_ = SubLObjectFactory.makeString("~s ");
        $str136$_____a = SubLObjectFactory.makeString("~%~%~a");
        $int137$37 = SubLObjectFactory.makeInteger(37);
        $str138$______call__ = SubLObjectFactory.makeString("~%  [ call ]");
        $str139$____a___ = SubLObjectFactory.makeString(" [ ~a ] ");
        $str140$____result____ = SubLObjectFactory.makeString(" [  result  ] ");
        $str141$_____time_____ = SubLObjectFactory.makeString(" [   time   ] ");
        $str142$____a = SubLObjectFactory.makeString("~% ~a");
        $str143$total = SubLObjectFactory.makeString("total");
        $sym144$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $sym145$ADD_SUF_DEFN = SubLObjectFactory.makeSymbol("ADD-SUF-DEFN");
        $sym146$ADD_IFF_DEFN = SubLObjectFactory.makeSymbol("ADD-IFF-DEFN");
        $sym147$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $str148$skip_defn_op = SubLObjectFactory.makeString("skip defn op");
        $str149$_s_is_not_a_collection_in__s = SubLObjectFactory.makeString("~s is not a collection in ~s");
        $str150$_s_is_not_a_symbol = SubLObjectFactory.makeString("~s is not a symbol");
        $sym151$OLD_ADD_SUF_DEFN = SubLObjectFactory.makeSymbol("OLD-ADD-SUF-DEFN");
        $sym152$REMOVE_SUF_DEFN = SubLObjectFactory.makeSymbol("REMOVE-SUF-DEFN");
        $sym153$REMOVE_IFF_DEFN = SubLObjectFactory.makeSymbol("REMOVE-IFF-DEFN");
        $sym154$OLD_REMOVE_SUF_DEFN = SubLObjectFactory.makeSymbol("OLD-REMOVE-SUF-DEFN");
        $sym155$_CACHE_SUF_DEFN_METERS_ = SubLObjectFactory.makeSymbol("*CACHE-SUF-DEFN-METERS*");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"));
        $sym157$CACHE_SUF_DEFN = SubLObjectFactory.makeSymbol("CACHE-SUF-DEFN");
        $sym158$RESET_CACHE_SUF_DEFN_METERS = SubLObjectFactory.makeSymbol("RESET-CACHE-SUF-DEFN-METERS");
        $sym159$_UNCACHE_SUF_DEFN_METERS_ = SubLObjectFactory.makeSymbol("*UNCACHE-SUF-DEFN-METERS*");
        $sym160$UNCACHE_SUF_DEFN = SubLObjectFactory.makeSymbol("UNCACHE-SUF-DEFN");
        $sym161$RESET_UNCACHE_SUF_DEFN_METERS = SubLObjectFactory.makeSymbol("RESET-UNCACHE-SUF-DEFN-METERS");
        $str162$___add_sufficent_defn__a__a_ = SubLObjectFactory.makeString("~%(add-sufficent-defn ~a ~a)");
        $str163$removed_sufficient_defn_not_found = SubLObjectFactory.makeString("removed sufficient defn not found in cache: ~s");
        $sym164$_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS_ = SubLObjectFactory.makeSymbol("*OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*");
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"));
        $sym166$OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS = SubLObjectFactory.makeSymbol("OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS");
        $sym167$RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS = SubLObjectFactory.makeSymbol("RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS");
        $sym168$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS_ = SubLObjectFactory.makeSymbol("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*");
        $sym169$OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS = SubLObjectFactory.makeSymbol("OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS");
        $sym170$RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS = SubLObjectFactory.makeSymbol("RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS");
        $sym171$ADD_SUF_DEFN_ASSERTION = SubLObjectFactory.makeSymbol("ADD-SUF-DEFN-ASSERTION");
        $sym172$REMOVE_SUF_DEFN_ASSERTION = SubLObjectFactory.makeSymbol("REMOVE-SUF-DEFN-ASSERTION");
        $sym173$MERGE_SUF_DEFN_ASSERTIONS = SubLObjectFactory.makeSymbol("MERGE-SUF-DEFN-ASSERTIONS");
        $sym174$REMOVE_SUF_DEFN_ASSERTIONS = SubLObjectFactory.makeSymbol("REMOVE-SUF-DEFN-ASSERTIONS");
        $sym175$VALID_ASSERTION = SubLObjectFactory.makeSymbol("VALID-ASSERTION");
        $sym176$_ = SubLObjectFactory.makeSymbol(">");
        $sym177$ARG1_SPEC_CARDINALITY = SubLObjectFactory.makeSymbol("ARG1-SPEC-CARDINALITY");
        $list178 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnIff")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnSufficient")));
        $str179$Initializing_sufficient_defns_cac = SubLObjectFactory.makeString("Initializing sufficient defns cache...");
        $sym180$ADD_SUF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("ADD-SUF-QUOTED-DEFN");
        $sym181$ADD_IFF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("ADD-IFF-QUOTED-DEFN");
        $str182$skip_quoted_defn_op = SubLObjectFactory.makeString("skip quoted defn op");
        $sym183$OLD_ADD_SUF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("OLD-ADD-SUF-QUOTED-DEFN");
        $sym184$REMOVE_SUF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("REMOVE-SUF-QUOTED-DEFN");
        $sym185$REMOVE_IFF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("REMOVE-IFF-QUOTED-DEFN");
        $sym186$OLD_REMOVE_SUF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("OLD-REMOVE-SUF-QUOTED-DEFN");
        $sym187$_CACHE_SUF_QUOTED_DEFN_METERS_ = SubLObjectFactory.makeSymbol("*CACHE-SUF-QUOTED-DEFN-METERS*");
        $sym188$CACHE_SUF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("CACHE-SUF-QUOTED-DEFN");
        $sym189$RESET_CACHE_SUF_QUOTED_DEFN_METERS = SubLObjectFactory.makeSymbol("RESET-CACHE-SUF-QUOTED-DEFN-METERS");
        $sym190$_UNCACHE_SUF_QUOTED_DEFN_METERS_ = SubLObjectFactory.makeSymbol("*UNCACHE-SUF-QUOTED-DEFN-METERS*");
        $sym191$UNCACHE_SUF_QUOTED_DEFN = SubLObjectFactory.makeSymbol("UNCACHE-SUF-QUOTED-DEFN");
        $sym192$RESET_UNCACHE_SUF_QUOTED_DEFN_METERS = SubLObjectFactory.makeSymbol("RESET-UNCACHE-SUF-QUOTED-DEFN-METERS");
        $str193$___add_sufficent_quoted_defn__a__ = SubLObjectFactory.makeString("~%(add-sufficent-quoted-defn ~a ~a)");
        $str194$removed_sufficient_quoted_defn_no = SubLObjectFactory.makeString("removed sufficient quoted defn not found in cache: ~s");
        $str195$___remove_sufficent_quoted_defn__ = SubLObjectFactory.makeString("~%(remove-sufficent-quoted-defn ~a ~a)");
        $sym196$_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_ = SubLObjectFactory.makeSymbol("*OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");
        $sym197$OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS = SubLObjectFactory.makeSymbol("OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS");
        $sym198$RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = SubLObjectFactory.makeSymbol("RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");
        $sym199$_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS_ = SubLObjectFactory.makeSymbol("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");
        $sym200$OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS = SubLObjectFactory.makeSymbol("OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS");
        $sym201$RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = SubLObjectFactory.makeSymbol("RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");
        $sym202$ADD_SUF_QUOTED_DEFN_ASSERTION = SubLObjectFactory.makeSymbol("ADD-SUF-QUOTED-DEFN-ASSERTION");
        $sym203$REMOVE_SUF_QUOTED_DEFN_ASSERTION = SubLObjectFactory.makeSymbol("REMOVE-SUF-QUOTED-DEFN-ASSERTION");
        $sym204$MERGE_SUF_QUOTED_DEFN_ASSERTIONS = SubLObjectFactory.makeSymbol("MERGE-SUF-QUOTED-DEFN-ASSERTIONS");
        $sym205$REMOVE_SUF_QUOTED_DEFN_ASSERTIONS = SubLObjectFactory.makeSymbol("REMOVE-SUF-QUOTED-DEFN-ASSERTIONS");
        $list206 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnIff")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedDefnSufficient")));
        $str207$Initializing_sufficient_quoted_de = SubLObjectFactory.makeString("Initializing sufficient quoted defns cache...");
        $kw208$QUOTED_ISA = SubLObjectFactory.makeKeyword("QUOTED-ISA");
        $sym209$ADD_SUF_FUNCTION = SubLObjectFactory.makeSymbol("ADD-SUF-FUNCTION");
        $sym210$REMOVE_SUF_FUNCTION = SubLObjectFactory.makeSymbol("REMOVE-SUF-FUNCTION");
        $sym211$ADD_SUF_QUOTED_FUNCTION = SubLObjectFactory.makeSymbol("ADD-SUF-QUOTED-FUNCTION");
        $sym212$REMOVE_SUF_QUOTED_FUNCTION = SubLObjectFactory.makeSymbol("REMOVE-SUF-QUOTED-FUNCTION");
        $const213$evaluationResultQuotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationResultQuotedIsa"));
        $str214$oh_well___ = SubLObjectFactory.makeString("oh well...");
        $str215$_s_is_not_a_evaluatable_functor_i = SubLObjectFactory.makeString("~s is not a evaluatable functor in ~s");
        $str216$_s_is_not_a_functor_in__s = SubLObjectFactory.makeString("~s is not a functor in ~s");
        $sym217$ADD_SUF_FUNCTION_INT = SubLObjectFactory.makeSymbol("ADD-SUF-FUNCTION-INT");
        $sym218$REMOVE_SUF_FUNCTION_INT = SubLObjectFactory.makeSymbol("REMOVE-SUF-FUNCTION-INT");
        $sym219$_CACHE_SUF_FUNCTION_METERS_ = SubLObjectFactory.makeSymbol("*CACHE-SUF-FUNCTION-METERS*");
        $list220 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $sym221$CACHE_SUF_FUNCTION = SubLObjectFactory.makeSymbol("CACHE-SUF-FUNCTION");
        $sym222$RESET_CACHE_SUF_FUNCTION_METERS = SubLObjectFactory.makeSymbol("RESET-CACHE-SUF-FUNCTION-METERS");
        $sym223$_UNCACHE_SUF_FUNCTION_METERS_ = SubLObjectFactory.makeSymbol("*UNCACHE-SUF-FUNCTION-METERS*");
        $sym224$UNCACHE_SUF_FUNCTION = SubLObjectFactory.makeSymbol("UNCACHE-SUF-FUNCTION");
        $sym225$RESET_UNCACHE_SUF_FUNCTION_METERS = SubLObjectFactory.makeSymbol("RESET-UNCACHE-SUF-FUNCTION-METERS");
        $str226$____a__a__a_ = SubLObjectFactory.makeString("~%(~a ~a ~a)");
        $str227$add_sufficient_function = SubLObjectFactory.makeString("add-sufficient-function");
        $str228$add_sufficient_quoted_function = SubLObjectFactory.makeString("add-sufficient-quoted-function");
        $str229$removed_sufficient_function_not_f = SubLObjectFactory.makeString("removed sufficient function not found in cache: ~s");
        $str230$remove_sufficient_function = SubLObjectFactory.makeString("remove-sufficient-function");
        $str231$remove_sufficient_quoted_function = SubLObjectFactory.makeString("remove-sufficient-quoted-function");
        $sym232$_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS_ = SubLObjectFactory.makeSymbol("*HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS*");
        $sym233$HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS = SubLObjectFactory.makeSymbol("HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS");
        $sym234$RESET_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS = SubLObjectFactory.makeSymbol("RESET-HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS");
        $list235 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTED-ISA"));
        $sym236$_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS_ = SubLObjectFactory.makeSymbol("*HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS*");
        $sym237$HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS = SubLObjectFactory.makeSymbol("HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS");
        $sym238$RESET_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS = SubLObjectFactory.makeSymbol("RESET-HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS");
        $sym239$ADD_SUF_FUNCTION_ASSERTION = SubLObjectFactory.makeSymbol("ADD-SUF-FUNCTION-ASSERTION");
        $sym240$ADD_SUF_QUOTED_FUNCTION_ASSERTION = SubLObjectFactory.makeSymbol("ADD-SUF-QUOTED-FUNCTION-ASSERTION");
        $sym241$REMOVE_SUF_FUNCTION_ASSERTION = SubLObjectFactory.makeSymbol("REMOVE-SUF-FUNCTION-ASSERTION");
        $sym242$REMOVE_SUF_QUOTED_FUNCTION_ASSERTION = SubLObjectFactory.makeSymbol("REMOVE-SUF-QUOTED-FUNCTION-ASSERTION");
        $sym243$MERGE_SUF_FUNCTION_ASSERTIONS = SubLObjectFactory.makeSymbol("MERGE-SUF-FUNCTION-ASSERTIONS");
        $sym244$MERGE_SUF_QUOTED_FUNCTION_ASSERTIONS = SubLObjectFactory.makeSymbol("MERGE-SUF-QUOTED-FUNCTION-ASSERTIONS");
        $sym245$REMOVE_SUF_FUNCTION_ASSERTIONS = SubLObjectFactory.makeSymbol("REMOVE-SUF-FUNCTION-ASSERTIONS");
        $sym246$REMOVE_SUF_QUOTED_FUNCTION_ASSERTIONS = SubLObjectFactory.makeSymbol("REMOVE-SUF-QUOTED-FUNCTION-ASSERTIONS");
        $str247$___add_sufficent_function__a__a_ = SubLObjectFactory.makeString("~%(add-sufficent-function ~a ~a)");
        $str248$remove_sufficent_function = SubLObjectFactory.makeString("remove-sufficent-function");
        $sym249$SUF_FUNCTION_SORT_PRED = SubLObjectFactory.makeSymbol("SUF-FUNCTION-SORT-PRED");
        $sym250$GAF_ARG2 = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $list251 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa")));
        $list252 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationResultQuotedIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultQuotedIsa")));
        $str253$Initializing_sufficient_functions = SubLObjectFactory.makeString("Initializing sufficient functions cache...");
        $str254$Initializing_sufficient_quoted_fu = SubLObjectFactory.makeString("Initializing sufficient quoted functions cache...");
        $str255$cdohash = SubLObjectFactory.makeString("cdohash");
        $str256$stop = SubLObjectFactory.makeString("stop");
        $kw257$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $str258$diagnostics__sufficient_functions = SubLObjectFactory.makeString("diagnostics: sufficient-functions-cache");
        $str259$___suf_function_cache_mal_keys___ = SubLObjectFactory.makeString("~%*suf-function-cache-mal-keys* : ~a");
        $str260$___suf_function_cache_key_w_o_val = SubLObjectFactory.makeString("~%*suf-function-cache-key-w/o-value* : ~a");
        $str261$___suf_function_cache_key_w_mal_v = SubLObjectFactory.makeString("~%*suf-function-cache-key-w/mal-value* : ~a");
        $str262$___suf_function_cache_key_w_stale = SubLObjectFactory.makeString("~%*suf-function-cache-key-w/stale-value* : ~a");
        $str263$___suf_function_cache_keys_w_o_in = SubLObjectFactory.makeString("~%*suf-function-cache-keys-w/o-inerited-value* : ~a");
        $str264$___suf_function_cache_awol_direct = SubLObjectFactory.makeString("~%*suf-function-cache-awol-direct-assertions* : ~a");
        $const265$SkolemFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunction"));
        $str266$mapping_skolems = SubLObjectFactory.makeString("mapping skolems");
        $str267$cdolist = SubLObjectFactory.makeString("cdolist");
        $str268$_a_ = SubLObjectFactory.makeString("~a ");
    }
}

/*

	Total time: 7171 ms
	
*/