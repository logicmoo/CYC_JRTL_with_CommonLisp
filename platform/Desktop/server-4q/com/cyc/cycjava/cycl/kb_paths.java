package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_paths extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_paths";
    public static final String myFingerPrint = "7fd2936e1aa2ddf7d41d9cda486d6e92c56a218339b8bb5cab3fca946a35e02d";
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 681L)
    public static SubLSymbol $kbp_quitP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 1649L)
    public static SubLSymbol $kbp_result_format$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 1689L)
    public static SubLSymbol $search_iteration$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 1726L)
    public static SubLSymbol $node_equalP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 1759L)
    public static SubLSymbol $kbp_nodeP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 1793L)
    public static SubLSymbol $kbp_linkP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 1832L)
    public static SubLSymbol $kbp_stats$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 1862L)
    public static SubLSymbol $collect_kbp_statsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 1898L)
    public static SubLSymbol $kbp_node_count$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 1932L)
    public static SubLSymbol $kbp_link_count$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 1966L)
    public static SubLSymbol $kbp_term_count$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2000L)
    public static SubLSymbol $source_term_args$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2046L)
    public static SubLSymbol $target_term_args$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2128L)
    public static SubLSymbol $relevant_node_treeP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2178L)
    public static SubLSymbol $path_source$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2209L)
    public static SubLSymbol $path_target$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2240L)
    public static SubLSymbol $kbp_searcher$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2272L)
    public static SubLSymbol $kbp_searchers$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2305L)
    public static SubLSymbol $path_horizon$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2337L)
    public static SubLSymbol $kbp_common_nodes$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2373L)
    public static SubLSymbol $path_link_lattice$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2410L)
    public static SubLSymbol $path_node_lattice$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2447L)
    public static SubLSymbol $kbp_ancestor$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2479L)
    public static SubLSymbol $kbp_run_time$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2511L)
    public static SubLSymbol $node_ancestors$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2546L)
    public static SubLSymbol $link_ancestors$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2580L)
    public static SubLSymbol $kbp_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2609L)
    public static SubLSymbol $kbp_nodes$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2638L)
    public static SubLSymbol $kbp_links$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2667L)
    public static SubLSymbol $term_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2695L)
    public static SubLSymbol $kbp_ancestor_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2760L)
    public static SubLSymbol $kbp_search_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2814L)
    public static SubLSymbol $kbp_min_isa_pathP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2850L)
    public static SubLSymbol $kbp_min_genls_pathP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2887L)
    public static SubLSymbol $kbp_designated_node_superiorsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2936L)
    public static SubLSymbol $kbp_designated_node_superiors$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 2985L)
    public static SubLSymbol $kbp_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3019L)
    public static SubLSymbol $max_search_iterations$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3079L)
    public static SubLSymbol $limit_path_depthP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3114L)
    public static SubLSymbol $kbp_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3147L)
    public static SubLSymbol $kbp_max_term_count$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3186L)
    public static SubLSymbol $kbp_quit_with_successP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3228L)
    public static SubLSymbol $kbp_only_gaf_linksP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3266L)
    public static SubLSymbol $kbp_no_bookkeeping_linksP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3334L)
    public static SubLSymbol $kbp_no_instance_linksP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3374L)
    public static SubLSymbol $kbp_no_bi_scoping_linksP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3418L)
    public static SubLSymbol $kbp_explode_natsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3456L)
    public static SubLSymbol $kbp_designated_predsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3496L)
    public static SubLSymbol $kbp_designated_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3536L)
    public static SubLSymbol $kbp_restricted_predsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3576L)
    public static SubLSymbol $kbp_restricted_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3616L)
    public static SubLSymbol $kbp_restricted_mtsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3656L)
    public static SubLSymbol $kbp_restricted_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3705L)
    public static SubLSymbol $kbp_external_link_predP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3749L)
    public static SubLSymbol $kbp_external_link_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3791L)
    public static SubLSymbol $kbp_genl_boundP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3825L)
    public static SubLSymbol $kbp_genl_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3859L)
    public static SubLSymbol $kbp_genls_cardinality_delta_boundP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3912L)
    public static SubLSymbol $kbp_genls_cardinality_delta_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3964L)
    public static SubLSymbol $kbp_isa_boundP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 3997L)
    public static SubLSymbol $kbp_isa_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4030L)
    public static SubLSymbol $kbp_node_isa_boundP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4068L)
    public static SubLSymbol $kbp_node_isa_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4106L)
    public static SubLSymbol $kbp_restricted_nodes_as_argP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4153L)
    public static SubLSymbol $kbp_restricted_nodes_as_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4222L)
    public static SubLSymbol $kbp_link_reference_set_boundP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4270L)
    public static SubLSymbol $kbp_link_reference_set_bound$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4318L)
    public static SubLSymbol $kbp_designated_link_referencesP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4368L)
    public static SubLSymbol $kbp_designated_link_references$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4418L)
    public static SubLSymbol $kbp_bound_gaf_termsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4457L)
    public static SubLSymbol $kbp_bound_gaf_terms$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4497L)
    public static SubLSymbol $kbp_bound_link_termsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4552L)
    public static SubLSymbol $kbp_bound_link_terms$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4592L)
    public static SubLSymbol $kbp_use_max_mtsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4652L)
    public static SubLSymbol $nodes_accessor_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4690L)
    public static SubLSymbol $path_link_op$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4722L)
    public static SubLSymbol $path_node_op$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4754L)
    public static SubLSymbol $relevant_linkP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4788L)
    public static SubLSymbol $relevant_nodeP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4822L)
    public static SubLSymbol $relevant_link_treeP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4861L)
    public static SubLSymbol $exclude_nodes$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4895L)
    public static SubLSymbol $exclude_links$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 38569L)
    public static SubLSymbol $cr_paths_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 38679L)
    public static SubLSymbol $cr_gaf_count$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 38711L)
    public static SubLSymbol $cr_explained_count$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 38749L)
    public static SubLSymbol $cr_error_count$;
    private static final SubLSymbol $sym0$_KBP_QUIT__;
    private static final SubLSymbol $kw1$PATHS;
    private static final SubLSymbol $sym2$_KBP_RESULT_FORMAT_;
    private static final SubLSymbol $sym3$_SEARCH_ITERATION_;
    private static final SubLSymbol $sym4$_NODE_EQUAL__;
    private static final SubLSymbol $sym5$FORT_P;
    private static final SubLSymbol $sym6$_KBP_NODE__;
    private static final SubLSymbol $sym7$ASSERTION_P;
    private static final SubLSymbol $sym8$_KBP_LINK__;
    private static final SubLSymbol $sym9$_KBP_STATS_;
    private static final SubLSymbol $sym10$_COLLECT_KBP_STATS__;
    private static final SubLSymbol $sym11$_KBP_NODE_COUNT_;
    private static final SubLSymbol $sym12$_KBP_LINK_COUNT_;
    private static final SubLSymbol $sym13$_KBP_TERM_COUNT_;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$_SOURCE_TERM_ARGS_;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$_TARGET_TERM_ARGS_;
    private static final SubLSymbol $sym18$_RELEVANT_NODE_TREE__;
    private static final SubLSymbol $sym19$_PATH_SOURCE_;
    private static final SubLSymbol $sym20$_PATH_TARGET_;
    private static final SubLSymbol $sym21$_KBP_SEARCHER_;
    private static final SubLSymbol $sym22$_KBP_SEARCHERS_;
    private static final SubLSymbol $sym23$_PATH_HORIZON_;
    private static final SubLSymbol $sym24$_KBP_COMMON_NODES_;
    private static final SubLSymbol $sym25$_PATH_LINK_LATTICE_;
    private static final SubLSymbol $sym26$_PATH_NODE_LATTICE_;
    private static final SubLSymbol $sym27$_KBP_ANCESTOR_;
    private static final SubLSymbol $sym28$_KBP_RUN_TIME_;
    private static final SubLSymbol $sym29$_NODE_ANCESTORS_;
    private static final SubLSymbol $sym30$_LINK_ANCESTORS_;
    private static final SubLSymbol $sym31$_KBP_DEPTH_;
    private static final SubLSymbol $sym32$_KBP_NODES_;
    private static final SubLSymbol $sym33$_KBP_LINKS_;
    private static final SubLSymbol $sym34$_TERM_ARG_;
    private static final SubLInteger $int35$2048;
    private static final SubLSymbol $sym36$_KBP_ANCESTOR_HASH_;
    private static final SubLSymbol $sym37$_KBP_SEARCH_HASH_;
    private static final SubLSymbol $sym38$_KBP_MIN_ISA_PATH__;
    private static final SubLSymbol $sym39$_KBP_MIN_GENLS_PATH__;
    private static final SubLSymbol $sym40$_KBP_DESIGNATED_NODE_SUPERIORS__;
    private static final SubLSymbol $sym41$_KBP_DESIGNATED_NODE_SUPERIORS_;
    private static final SubLSymbol $sym42$_KBP_TRACE_LEVEL_;
    private static final SubLSymbol $sym43$_MAX_SEARCH_ITERATIONS_;
    private static final SubLSymbol $sym44$_LIMIT_PATH_DEPTH__;
    private static final SubLSymbol $sym45$_KBP_MAX_DEPTH_;
    private static final SubLInteger $int46$1000;
    private static final SubLSymbol $sym47$_KBP_MAX_TERM_COUNT_;
    private static final SubLSymbol $sym48$_KBP_QUIT_WITH_SUCCESS__;
    private static final SubLSymbol $sym49$_KBP_ONLY_GAF_LINKS__;
    private static final SubLSymbol $sym50$_KBP_NO_BOOKKEEPING_LINKS__;
    private static final SubLSymbol $sym51$_KBP_NO_INSTANCE_LINKS__;
    private static final SubLSymbol $sym52$_KBP_NO_BI_SCOPING_LINKS__;
    private static final SubLSymbol $sym53$_KBP_EXPLODE_NATS__;
    private static final SubLSymbol $sym54$_KBP_DESIGNATED_PREDS__;
    private static final SubLSymbol $sym55$_KBP_DESIGNATED_PREDS_;
    private static final SubLSymbol $sym56$_KBP_RESTRICTED_PREDS__;
    private static final SubLSymbol $sym57$_KBP_RESTRICTED_PREDS_;
    private static final SubLSymbol $sym58$_KBP_RESTRICTED_MTS__;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$_KBP_RESTRICTED_MTS_;
    private static final SubLSymbol $sym61$_KBP_EXTERNAL_LINK_PRED__;
    private static final SubLSymbol $sym62$_KBP_EXTERNAL_LINK_PRED_;
    private static final SubLSymbol $sym63$_KBP_GENL_BOUND__;
    private static final SubLSymbol $sym64$_KBP_GENL_BOUND_;
    private static final SubLSymbol $sym65$_KBP_GENLS_CARDINALITY_DELTA_BOUND__;
    private static final SubLSymbol $sym66$_KBP_GENLS_CARDINALITY_DELTA_BOUND_;
    private static final SubLSymbol $sym67$_KBP_ISA_BOUND__;
    private static final SubLSymbol $sym68$_KBP_ISA_BOUND_;
    private static final SubLSymbol $sym69$_KBP_NODE_ISA_BOUND__;
    private static final SubLSymbol $sym70$_KBP_NODE_ISA_BOUND_;
    private static final SubLSymbol $sym71$_KBP_RESTRICTED_NODES_AS_ARG__;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$_KBP_RESTRICTED_NODES_AS_ARG_;
    private static final SubLSymbol $sym74$_KBP_LINK_REFERENCE_SET_BOUND__;
    private static final SubLSymbol $sym75$_KBP_LINK_REFERENCE_SET_BOUND_;
    private static final SubLSymbol $sym76$_KBP_DESIGNATED_LINK_REFERENCES__;
    private static final SubLSymbol $sym77$_KBP_DESIGNATED_LINK_REFERENCES_;
    private static final SubLSymbol $sym78$_KBP_BOUND_GAF_TERMS__;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$_KBP_BOUND_GAF_TERMS_;
    private static final SubLSymbol $sym81$_KBP_BOUND_LINK_TERMS__;
    private static final SubLSymbol $sym82$_KBP_BOUND_LINK_TERMS_;
    private static final SubLSymbol $sym83$_KBP_USE_MAX_MTS__;
    private static final SubLSymbol $sym84$_NODES_ACCESSOR_FN_;
    private static final SubLSymbol $sym85$_PATH_LINK_OP_;
    private static final SubLSymbol $sym86$_PATH_NODE_OP_;
    private static final SubLSymbol $sym87$_RELEVANT_LINK__;
    private static final SubLSymbol $sym88$_RELEVANT_NODE__;
    private static final SubLSymbol $sym89$_RELEVANT_LINK_TREE__;
    private static final SubLSymbol $sym90$_EXCLUDE_NODES_;
    private static final SubLSymbol $sym91$_EXCLUDE_LINKS_;
    private static final SubLSymbol $sym92$ALL_ASSERTION_TERMS;
    private static final SubLSymbol $sym93$DEFAULT_LINK_OP;
    private static final SubLSymbol $sym94$DEFAULT_NODE_OP;
    private static final SubLSymbol $sym95$DEFAULT_RELEVANT_LINK_;
    private static final SubLSymbol $sym96$DEFAULT_RELEVANT_NODE_;
    private static final SubLSymbol $sym97$DEFAULT_RELEVANT_LINK_TREE_;
    private static final SubLString $str98$searching_for_kb_paths;
    private static final SubLString $str99$missed_connection;
    private static final SubLString $str100$duplicates_in_accessed1;
    private static final SubLString $str101$duplicates_in_accessed2;
    private static final SubLSymbol $kw102$SUCCESS;
    private static final SubLString $str103$horizons_missed__iteration__s;
    private static final SubLSymbol $sym104$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const105$EverythingPSC;
    private static final SubLSymbol $sym106$RELEVANT_MT_IS_EQ;
    private static final SubLString $str107$____kbp_common_nodes___a;
    private static final SubLString $str108$____complete_paths_home_from___s_;
    private static final SubLString $str109$_____acomplete_paths_home_from_li;
    private static final SubLString $str110$_____acomplete_paths_home_from_no;
    private static final SubLSymbol $kw111$LINKS;
    private static final SubLString $str112$invalid_path_format___s;
    private static final SubLList $list113;
    private static final SubLString $str114$_____agather_node_latice____a_s;
    private static final SubLString $str115$_____agather_link_latice_____a_s;
    private static final SubLSymbol $sym116$KBP_LINK_NODES;
    private static final SubLString $str117$____marking_horizon_for__s_in_ite;
    private static final SubLString $str118$__search_node____s__s___s;
    private static final SubLString $str119$empty_horizon_for__s_in_iteration;
    private static final SubLString $str120$___s_searched_by___s;
    private static final SubLString $str121$___s______goal_________________;
    private static final SubLSymbol $kw122$TERM_BOUND;
    private static final SubLSymbol $sym123$_;
    private static final SubLSymbol $sym124$INTEGERP;
    private static final SubLSymbol $sym125$SPEC_CARDINALITY;
    private static final SubLObject $const126$genls;
    private static final SubLSymbol $kw127$UP;
    private static final SubLSymbol $kw128$DOWN;
    private static final SubLObject $const129$isa;
    private static final SubLSymbol $kw130$NEG;
    private static final SubLSymbol $sym131$SECOND;
    private static final SubLSymbol $kw132$POS;
    private static final SubLSymbol $kw133$OTHER;
    private static final SubLSymbol $kw134$DEPTH;
    private static final SubLSymbol $kw135$ITERATIONS;
    private static final SubLSymbol $kw136$TERMS;
    private static final SubLSymbol $kw137$NODES;
    private static final SubLSymbol $kw138$BRANCH;
    private static final SubLSymbol $kw139$TIME;
    private static final SubLSymbol $kw140$TERMINATION;
    private static final SubLSymbol $kw141$EXHAUST;
    private static final SubLSymbol $kw142$ITERATION_BOUND;
    private static final SubLSymbol $sym143$EQUAL_NODES_;
    private static final SubLSymbol $sym144$ASSERTIONS_FI_EQUAL_;
    private static final SubLList $list145;
    private static final SubLList $list146;
    private static final SubLList $list147;
    private static final SubLList $list148;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$KBP_JUST_FROM_TUPLES;
    private static final SubLSymbol $sym151$KBP_JUST_FROM_TUPLE;
    private static final SubLString $str152$continue_anyway;
    private static final SubLSymbol $sym153$WARN;
    private static final SubLList $list154;
    private static final SubLList $list155;
    private static final SubLList $list156;
    private static final SubLInteger $int157$1024;
    private static final SubLList $list158;
    private static final SubLList $list159;
    private static final SubLList $list160;
    private static final SubLList $list161;
    private static final SubLList $list162;
    private static final SubLSymbol $sym163$EXPLAIN_CR_GAF_VIA_PATHS;
    private static final SubLObject $const164$conceptuallyRelated;
    private static final SubLSymbol $sym165$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym166$KB_ASSERTION_;
    private static final SubLSymbol $sym167$ASSERTION_FI_FORMULA;
    private static final SubLString $str168$__cr_gafs_considered___a;
    private static final SubLString $str169$__cr_gafs_explained___a;
    private static final SubLString $str170$__cr_gafs_w_errors___a;
    private static final SubLObject $const171$InferencePSC;
    private static final SubLObject $const172$and;
    private static final SubLSymbol $kw173$MIN;
    private static final SubLList $list174;
    private static final SubLSymbol $kw175$BREADTH;
    private static final SubLSymbol $kw176$QUEUE;
    private static final SubLSymbol $kw177$STACK;
    private static final SubLSymbol $sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw179$ERROR;
    private static final SubLString $str180$_A_is_not_a__A;
    private static final SubLSymbol $sym181$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw182$CERROR;
    private static final SubLSymbol $kw183$WARN;
    private static final SubLString $str184$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLSymbol $sym185$GENLS_GATHER_FOCUS_PREDS_COLS;
    private static final SubLSymbol $kw186$TRUE;
    private static final SubLString $str187$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str188$attempting_to_bind_direction_link;
    private static final SubLString $str189$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym190$CAR;
    private static final SubLList $list191;
    private static final SubLSymbol $sym192$_;
    private static final SubLSymbol $sym193$CADR;
    private static final SubLObject $const194$genlPreds;
    private static final SubLSymbol $kw195$ALL;
    private static final SubLSymbol $kw196$MAX;
    private static final SubLSymbol $kw197$MID;
    private static final SubLSymbol $kw198$EDGE;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$GENLS_GATHER_FOCUS_PREDS_OF;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 4928L)
    public static SubLObject kb_paths(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_kb_paths();
        SubLObject v_kb_paths = (SubLObject)kb_paths.NIL;
        SubLObject stats = (SubLObject)kb_paths.NIL;
        final SubLObject _prev_bind_0 = kb_paths.$nodes_accessor_fn$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_paths.$path_link_op$.currentBinding(thread);
        final SubLObject _prev_bind_3 = kb_paths.$path_node_op$.currentBinding(thread);
        final SubLObject _prev_bind_4 = kb_paths.$relevant_linkP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = kb_paths.$relevant_nodeP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = kb_paths.$relevant_link_treeP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = kb_paths.$path_source$.currentBinding(thread);
        final SubLObject _prev_bind_8 = kb_paths.$path_target$.currentBinding(thread);
        final SubLObject _prev_bind_9 = kb_paths.$kbp_searchers$.currentBinding(thread);
        final SubLObject _prev_bind_10 = kb_paths.$kbp_term_count$.currentBinding(thread);
        final SubLObject _prev_bind_11 = kb_paths.$kbp_node_count$.currentBinding(thread);
        final SubLObject _prev_bind_12 = kb_paths.$kbp_link_count$.currentBinding(thread);
        final SubLObject _prev_bind_13 = kb_paths.$search_iteration$.currentBinding(thread);
        try {
            kb_paths.$nodes_accessor_fn$.bind(kb_paths.$nodes_accessor_fn$.getDynamicValue(thread).isFunctionSpec() ? kb_paths.$nodes_accessor_fn$.getDynamicValue(thread) : Symbols.symbol_function((SubLObject)kb_paths.$sym92$ALL_ASSERTION_TERMS), thread);
            kb_paths.$path_link_op$.bind(kb_paths.$path_link_op$.getDynamicValue(thread).isFunctionSpec() ? kb_paths.$path_link_op$.getDynamicValue(thread) : Symbols.symbol_function((SubLObject)kb_paths.$sym93$DEFAULT_LINK_OP), thread);
            kb_paths.$path_node_op$.bind(kb_paths.$path_node_op$.getDynamicValue(thread).isFunctionSpec() ? kb_paths.$path_node_op$.getDynamicValue(thread) : Symbols.symbol_function((SubLObject)kb_paths.$sym94$DEFAULT_NODE_OP), thread);
            kb_paths.$relevant_linkP$.bind(kb_paths.$relevant_linkP$.getDynamicValue(thread).isFunctionSpec() ? kb_paths.$relevant_linkP$.getDynamicValue(thread) : Symbols.symbol_function((SubLObject)kb_paths.$sym95$DEFAULT_RELEVANT_LINK_), thread);
            kb_paths.$relevant_nodeP$.bind(kb_paths.$relevant_nodeP$.getDynamicValue(thread).isFunctionSpec() ? kb_paths.$relevant_nodeP$.getDynamicValue(thread) : Symbols.symbol_function((SubLObject)kb_paths.$sym96$DEFAULT_RELEVANT_NODE_), thread);
            kb_paths.$relevant_link_treeP$.bind(kb_paths.$relevant_link_treeP$.getDynamicValue(thread).isFunctionSpec() ? kb_paths.$relevant_link_treeP$.getDynamicValue(thread) : Symbols.symbol_function((SubLObject)kb_paths.$sym97$DEFAULT_RELEVANT_LINK_TREE_), thread);
            kb_paths.$path_source$.bind(source, thread);
            kb_paths.$path_target$.bind(target, thread);
            kb_paths.$kbp_searchers$.bind(Sequences.remove_duplicates((SubLObject)ConsesLow.list(source, target), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED), thread);
            kb_paths.$kbp_term_count$.bind(Sequences.length(kb_paths.$kbp_searchers$.getDynamicValue(thread)), thread);
            kb_paths.$kbp_node_count$.bind((SubLObject)kb_paths.ZERO_INTEGER, thread);
            kb_paths.$kbp_link_count$.bind((SubLObject)kb_paths.ZERO_INTEGER, thread);
            kb_paths.$search_iteration$.bind((SubLObject)kb_paths.ZERO_INTEGER, thread);
            final SubLObject time_var = Time.get_internal_real_time();
            if (kb_paths.NIL != list_utilities.singletonP(kb_paths.$kbp_searchers$.getDynamicValue(thread))) {
                v_kb_paths = kb_paths.$kbp_searchers$.getDynamicValue(thread);
            }
            else {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    final SubLObject _prev_bind_0_$2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$5 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$6 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_paths.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_paths.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_paths.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble((SubLObject)kb_paths.$str98$searching_for_kb_paths);
                            SubLObject cdolist_list_var = kb_paths.$kbp_searchers$.getDynamicValue(thread);
                            SubLObject searcher = (SubLObject)kb_paths.NIL;
                            searcher = cdolist_list_var.first();
                            while (kb_paths.NIL != cdolist_list_var) {
                                kbp_mark_as_searched_by(searcher, searcher, (SubLObject)kb_paths.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                searcher = cdolist_list_var.first();
                            }
                            SubLObject v_iteration;
                            SubLObject horizon1;
                            SubLObject horizon2;
                            SubLObject accessed1;
                            SubLObject accessed2;
                            SubLObject paths;
                            for (v_iteration = (SubLObject)kb_paths.NIL, horizon1 = (SubLObject)kb_paths.NIL, horizon2 = (SubLObject)kb_paths.NIL, accessed1 = (SubLObject)kb_paths.NIL, accessed2 = (SubLObject)kb_paths.NIL, paths = (SubLObject)kb_paths.NIL, v_iteration = next_iteration(), horizon1 = mark_next_horizon((SubLObject)ConsesLow.list(source), source, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED), horizon2 = mark_next_horizon((SubLObject)ConsesLow.list(target), target, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED), accessed1 = horizon1, accessed2 = horizon2, paths = find_paths(source, target); kb_paths.NIL == paths && kb_paths.NIL == kbp_give_upP(v_iteration, horizon1, horizon2); v_iteration = next_iteration(), horizon1 = mark_next_horizon(horizon1, source, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED), horizon2 = mark_next_horizon(horizon2, target, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED), accessed1 = (SubLObject)((kb_paths.NIL != horizon1) ? ConsesLow.nconc(accessed1, horizon1) : kb_paths.NIL), accessed2 = (SubLObject)((kb_paths.NIL != horizon2) ? ConsesLow.nconc(accessed2, horizon2) : kb_paths.NIL), paths = find_paths(source, target)) {
                                if (kb_paths.NIL != kb_paths.$kbp_common_nodes$.getDynamicValue(thread) && kb_paths.NIL == paths) {
                                    kbp_error((SubLObject)kb_paths.THREE_INTEGER, (SubLObject)kb_paths.$str99$missed_connection, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                }
                                if (kb_paths.$kbp_trace_level$.getDynamicValue(thread).isNumber() && kb_paths.$kbp_trace_level$.getDynamicValue(thread).numGE((SubLObject)kb_paths.THREE_INTEGER)) {
                                    if (kb_paths.NIL != list_utilities.duplicatesP(accessed1, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                                        kbp_error((SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.$str100$duplicates_in_accessed1, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                    }
                                    if (kb_paths.NIL != list_utilities.duplicatesP(accessed2, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                                        kbp_error((SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.$str101$duplicates_in_accessed2, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                    }
                                }
                            }
                            if (kb_paths.NIL != paths) {
                                v_kb_paths = paths;
                                kb_paths.$kbp_quitP$.setDynamicValue((SubLObject)kb_paths.$kw102$SUCCESS, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_paths.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_$6, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$5, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$3, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$2, thread);
                    }
                    if (kb_paths.NIL != kb_paths.$kbp_min_genls_pathP$.getDynamicValue(thread)) {
                        SubLObject cdolist_list_var2 = kbp_min_genls_paths(source, target, mt, (SubLObject)kb_paths.UNPROVIDED);
                        SubLObject path = (SubLObject)kb_paths.NIL;
                        path = cdolist_list_var2.first();
                        while (kb_paths.NIL != cdolist_list_var2) {
                            if (kb_paths.NIL != path) {
                                final SubLObject item_var = path;
                                if (kb_paths.NIL == conses_high.member(item_var, v_kb_paths, Symbols.symbol_function((SubLObject)kb_paths.EQUAL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
                                    v_kb_paths = (SubLObject)ConsesLow.cons(item_var, v_kb_paths);
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            path = cdolist_list_var2.first();
                        }
                    }
                    if (kb_paths.NIL != kb_paths.$kbp_min_isa_pathP$.getDynamicValue(thread)) {
                        SubLObject cdolist_list_var2 = kbp_min_isa_paths(source, target, mt, (SubLObject)kb_paths.UNPROVIDED);
                        SubLObject path = (SubLObject)kb_paths.NIL;
                        path = cdolist_list_var2.first();
                        while (kb_paths.NIL != cdolist_list_var2) {
                            if (kb_paths.NIL != path) {
                                final SubLObject item_var = path;
                                if (kb_paths.NIL == conses_high.member(item_var, v_kb_paths, Symbols.symbol_function((SubLObject)kb_paths.EQUAL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
                                    v_kb_paths = (SubLObject)ConsesLow.cons(item_var, v_kb_paths);
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            path = cdolist_list_var2.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
            }
            kb_paths.$kbp_run_time$.setDynamicValue(Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue()), thread);
            if (kb_paths.NIL == kb_paths.$kbp_common_nodes$.getDynamicValue(thread)) {
                kbp_warn((SubLObject)kb_paths.THREE_INTEGER, (SubLObject)kb_paths.$str103$horizons_missed__iteration__s, kb_paths.$search_iteration$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
            }
            if (kb_paths.NIL != kb_paths.$collect_kbp_statsP$.getDynamicValue(thread)) {
                stats = kbp_stats(v_kb_paths);
            }
        }
        finally {
            kb_paths.$search_iteration$.rebind(_prev_bind_13, thread);
            kb_paths.$kbp_link_count$.rebind(_prev_bind_12, thread);
            kb_paths.$kbp_node_count$.rebind(_prev_bind_11, thread);
            kb_paths.$kbp_term_count$.rebind(_prev_bind_10, thread);
            kb_paths.$kbp_searchers$.rebind(_prev_bind_9, thread);
            kb_paths.$path_target$.rebind(_prev_bind_8, thread);
            kb_paths.$path_source$.rebind(_prev_bind_7, thread);
            kb_paths.$relevant_link_treeP$.rebind(_prev_bind_6, thread);
            kb_paths.$relevant_nodeP$.rebind(_prev_bind_5, thread);
            kb_paths.$relevant_linkP$.rebind(_prev_bind_4, thread);
            kb_paths.$path_node_op$.rebind(_prev_bind_3, thread);
            kb_paths.$path_link_op$.rebind(_prev_bind_2, thread);
            kb_paths.$nodes_accessor_fn$.rebind(_prev_bind_0, thread);
        }
        if (kb_paths.NIL != kb_paths.$collect_kbp_statsP$.getDynamicValue(thread)) {
            return Values.values(v_kb_paths, stats);
        }
        return v_kb_paths;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 7093L)
    public static SubLObject kb_paths_n(SubLObject source, final SubLObject target, SubLObject n) {
        if (n == kb_paths.UNPROVIDED) {
            n = (SubLObject)kb_paths.TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paths = (SubLObject)kb_paths.NIL;
        final SubLObject _prev_bind_0 = kb_paths.$max_search_iterations$.currentBinding(thread);
        try {
            kb_paths.$max_search_iterations$.bind(n, thread);
            paths = kb_paths(source, target, (SubLObject)kb_paths.UNPROVIDED);
        }
        finally {
            kb_paths.$max_search_iterations$.rebind(_prev_bind_0, thread);
        }
        return paths;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 7265L)
    public static SubLObject kb_paths_in_all_mts(SubLObject source, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paths = (SubLObject)kb_paths.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_paths.$sym104$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_paths.$const105$EverythingPSC, thread);
            paths = kb_paths(source, target, (SubLObject)kb_paths.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return paths;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 7408L)
    public static SubLObject kb_paths_in_just_mt(SubLObject source, final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paths = (SubLObject)kb_paths.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_paths.$sym106$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            paths = kb_paths(source, target, (SubLObject)kb_paths.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return paths;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 7557L)
    public static SubLObject find_paths(SubLObject source, SubLObject target) {
        if (source == kb_paths.UNPROVIDED) {
            source = kb_paths.$path_source$.getDynamicValue();
        }
        if (target == kb_paths.UNPROVIDED) {
            target = kb_paths.$path_target$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != kb_paths.$kbp_common_nodes$.getDynamicValue(thread)) {
            if (kb_paths.NIL != kb_paths.$kbp_trace_level$.getDynamicValue(thread)) {
                kbp_note((SubLObject)kb_paths.TWO_INTEGER, (SubLObject)kb_paths.$str107$____kbp_common_nodes___a, string_utilities.stringify_terms(kb_paths.$kbp_common_nodes$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
            }
            complete_paths_home(kb_paths.$kbp_common_nodes$.getDynamicValue(thread));
            return extract_paths(source, target);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 7978L)
    public static SubLObject complete_paths_home(SubLObject common_nodes) {
        if (common_nodes == kb_paths.UNPROVIDED) {
            common_nodes = kb_paths.$kbp_common_nodes$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_paths.$kbp_depth$.currentBinding(thread);
        try {
            kb_paths.$kbp_depth$.bind((SubLObject)kb_paths.ZERO_INTEGER, thread);
            SubLObject cdolist_list_var = common_nodes;
            SubLObject fort = (SubLObject)kb_paths.NIL;
            fort = cdolist_list_var.first();
            while (kb_paths.NIL != cdolist_list_var) {
                kbp_note((SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.$str108$____complete_paths_home_from___s_, kbp_searched_by(fort), fort, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                SubLObject cdolist_list_var_$8 = kbp_ancestors_via_all(fort, (SubLObject)kb_paths.UNPROVIDED);
                SubLObject ancestor = (SubLObject)kb_paths.NIL;
                ancestor = cdolist_list_var_$8.first();
                while (kb_paths.NIL != cdolist_list_var_$8) {
                    complete_paths_home_from_link(ancestor);
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    ancestor = cdolist_list_var_$8.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                fort = cdolist_list_var.first();
            }
        }
        finally {
            kb_paths.$kbp_depth$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 8313L)
    public static SubLObject complete_paths_home_from_link(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_paths.$kbp_depth$.setDynamicValue(Numbers.add(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
        kbp_note((SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.$str109$_____acomplete_paths_home_from_li, string_utilities.tabstr(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED), kbp_searched_by(assertion), string_utilities.tabstr(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED), assertion);
        kbp_mark_as_searched_by_all(assertion, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        SubLObject cdolist_list_var = kbp_ancestors_via_all(assertion, (SubLObject)kb_paths.UNPROVIDED);
        SubLObject ancestor = (SubLObject)kb_paths.NIL;
        ancestor = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            complete_paths_home_from_node(ancestor);
            cdolist_list_var = cdolist_list_var.rest();
            ancestor = cdolist_list_var.first();
        }
        kb_paths.$kbp_depth$.setDynamicValue(Numbers.subtract(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 8713L)
    public static SubLObject complete_paths_home_from_node(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL == kbp_searched_by_allP(fort, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
            kb_paths.$kbp_depth$.setDynamicValue(Numbers.add(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
            kbp_note((SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.$str110$_____acomplete_paths_home_from_no, string_utilities.tabstr(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED), kbp_searched_by(fort), string_utilities.tabstr(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED), fort);
            kbp_mark_as_searched_by_all(fort, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
            if (kb_paths.NIL == kbp_searcherP(fort)) {
                SubLObject cdolist_list_var = kbp_ancestors_via_all(fort, (SubLObject)kb_paths.UNPROVIDED);
                SubLObject ancestor = (SubLObject)kb_paths.NIL;
                ancestor = cdolist_list_var.first();
                while (kb_paths.NIL != cdolist_list_var) {
                    complete_paths_home_from_link(ancestor);
                    cdolist_list_var = cdolist_list_var.rest();
                    ancestor = cdolist_list_var.first();
                }
            }
            kb_paths.$kbp_depth$.setDynamicValue(Numbers.subtract(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 9174L)
    public static SubLObject extract_paths(SubLObject source, SubLObject target) {
        if (source == kb_paths.UNPROVIDED) {
            source = kb_paths.$path_source$.getDynamicValue();
        }
        if (target == kb_paths.UNPROVIDED) {
            target = kb_paths.$path_target$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_paths.NIL;
        final SubLObject _prev_bind_0 = kb_paths.$path_target$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_paths.$path_source$.currentBinding(thread);
        final SubLObject _prev_bind_3 = kb_paths.$kbp_depth$.currentBinding(thread);
        final SubLObject _prev_bind_4 = kb_paths.$kbp_max_depth$.currentBinding(thread);
        try {
            kb_paths.$path_target$.bind(target, thread);
            kb_paths.$path_source$.bind(source, thread);
            kb_paths.$kbp_depth$.bind((SubLObject)kb_paths.ZERO_INTEGER, thread);
            kb_paths.$kbp_max_depth$.bind((SubLObject)((kb_paths.NIL != kb_paths.$limit_path_depthP$.getDynamicValue(thread)) ? Numbers.multiply((SubLObject)kb_paths.FOUR_INTEGER, kb_paths.$search_iteration$.getDynamicValue(thread)) : kb_paths.NIL), thread);
            final SubLObject kbp_components = kbp_all_searched_by_all((SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
            final SubLObject _prev_bind_0_$9 = kb_paths.$kbp_nodes$.currentBinding(thread);
            final SubLObject _prev_bind_1_$10 = kb_paths.$kbp_links$.currentBinding(thread);
            try {
                kb_paths.$kbp_nodes$.bind(list_utilities.remove_if_not(kb_paths.$kbp_nodeP$.getDynamicValue(thread), kbp_components, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED), thread);
                kb_paths.$kbp_links$.bind(list_utilities.remove_if_not(kb_paths.$kbp_linkP$.getDynamicValue(thread), kbp_components, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED), thread);
                result = kbp_result();
            }
            finally {
                kb_paths.$kbp_links$.rebind(_prev_bind_1_$10, thread);
                kb_paths.$kbp_nodes$.rebind(_prev_bind_0_$9, thread);
            }
        }
        finally {
            kb_paths.$kbp_max_depth$.rebind(_prev_bind_4, thread);
            kb_paths.$kbp_depth$.rebind(_prev_bind_3, thread);
            kb_paths.$path_source$.rebind(_prev_bind_2, thread);
            kb_paths.$path_target$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 9780L)
    public static SubLObject kbp_result() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = kb_paths.$kbp_result_format$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)kb_paths.$kw1$PATHS)) {
            return kbp_result_paths();
        }
        if (pcase_var.eql((SubLObject)kb_paths.$kw111$LINKS)) {
            return kbp_result_links();
        }
        kbp_error((SubLObject)kb_paths.THREE_INTEGER, (SubLObject)kb_paths.$str112$invalid_path_format___s, kb_paths.$kbp_result_format$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 9986L)
    public static SubLObject kbp_result_links() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject links = (SubLObject)kb_paths.NIL;
        SubLObject node = (SubLObject)kb_paths.NIL;
        SubLObject done = (SubLObject)kb_paths.NIL;
        SubLObject neighbors = (SubLObject)kb_paths.NIL;
        SubLObject nodes = (SubLObject)kb_paths.NIL;
        node = kb_paths.$path_source$.getDynamicValue(thread);
        done = (SubLObject)ConsesLow.list(node);
        neighbors = conses_high.set_difference(kbp_node_neighbors(node), done, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        for (nodes = Sequences.remove(node, kb_paths.$kbp_nodes$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED); kb_paths.NIL != nodes; nodes = Sequences.delete(node, nodes, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
            SubLObject cdolist_list_var = neighbors;
            SubLObject neighbor = (SubLObject)kb_paths.NIL;
            neighbor = cdolist_list_var.first();
            while (kb_paths.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$11 = kbp_connecting_links(node, neighbor);
                SubLObject link = (SubLObject)kb_paths.NIL;
                link = cdolist_list_var_$11.first();
                while (kb_paths.NIL != cdolist_list_var_$11) {
                    links = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(node, neighbor, link), links);
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    link = cdolist_list_var_$11.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                neighbor = cdolist_list_var.first();
            }
            node = ((kb_paths.NIL != neighbors) ? neighbors.first() : nodes.first());
            done = (SubLObject)ConsesLow.cons(node, done);
            neighbors = conses_high.set_difference(kbp_node_neighbors(node), done, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        }
        return Sequences.nreverse(links);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 10532L)
    public static SubLObject kbp_result_paths() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lattice = (SubLObject)kb_paths.NIL;
        final SubLObject _prev_bind_0 = kb_paths.$node_ancestors$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_paths.$link_ancestors$.currentBinding(thread);
        final SubLObject _prev_bind_3 = kb_paths.$path_node_lattice$.currentBinding(thread);
        final SubLObject _prev_bind_4 = kb_paths.$path_link_lattice$.currentBinding(thread);
        try {
            kb_paths.$node_ancestors$.bind((SubLObject)kb_paths.NIL, thread);
            kb_paths.$link_ancestors$.bind((SubLObject)kb_paths.NIL, thread);
            kb_paths.$path_node_lattice$.bind((SubLObject)kb_paths.NIL, thread);
            kb_paths.$path_link_lattice$.bind((SubLObject)kb_paths.NIL, thread);
            lattice = gather_node_lattice((SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED).first();
        }
        finally {
            kb_paths.$path_link_lattice$.rebind(_prev_bind_4, thread);
            kb_paths.$path_node_lattice$.rebind(_prev_bind_3, thread);
            kb_paths.$link_ancestors$.rebind(_prev_bind_2, thread);
            kb_paths.$node_ancestors$.rebind(_prev_bind_0, thread);
        }
        if (kb_paths.NIL != lattice) {
            return linearize_lattice(lattice);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 10810L)
    public static SubLObject linearize_lattice(final SubLObject lattice) {
        if (kb_paths.NIL != lattice) {
            SubLObject paths = (SubLObject)kb_paths.NIL;
            SubLObject root = (SubLObject)kb_paths.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(lattice, lattice, (SubLObject)kb_paths.$list113);
            root = lattice.first();
            SubLObject current = lattice.rest();
            final SubLObject links = (SubLObject)(current.isCons() ? current.first() : kb_paths.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, lattice, (SubLObject)kb_paths.$list113);
            current = current.rest();
            if (kb_paths.NIL == current) {
                if (kb_paths.NIL == links) {
                    return (SubLObject)ConsesLow.list(lattice);
                }
                SubLObject cdolist_list_var = links;
                SubLObject link = (SubLObject)kb_paths.NIL;
                link = cdolist_list_var.first();
                while (kb_paths.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$12 = linearize_lattice(link);
                    SubLObject path = (SubLObject)kb_paths.NIL;
                    path = cdolist_list_var_$12.first();
                    while (kb_paths.NIL != cdolist_list_var_$12) {
                        paths = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(root, path), paths);
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        path = cdolist_list_var_$12.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    link = cdolist_list_var.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(lattice, (SubLObject)kb_paths.$list113);
            }
            return paths;
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 11115L)
    public static SubLObject gather_node_lattice(SubLObject fort, SubLObject ancestors) {
        if (fort == kb_paths.UNPROVIDED) {
            fort = kb_paths.$path_source$.getDynamicValue();
        }
        if (ancestors == kb_paths.UNPROVIDED) {
            ancestors = kb_paths.$node_ancestors$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != kbp_under_limit((SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED) && kb_paths.NIL != kbp_legal_nodeP(fort)) {
            kbp_note((SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.$str114$_____agather_node_latice____a_s, string_utilities.tabstr(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED), string_utilities.tabstr(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED), fort, (SubLObject)kb_paths.UNPROVIDED);
            kb_paths.$kbp_depth$.setDynamicValue(Numbers.add(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
            if (kb_paths.NIL != equal_nodesP(fort, kb_paths.$path_target$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED)) {
                kb_paths.$path_node_lattice$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(fort), kb_paths.$path_node_lattice$.getDynamicValue(thread)), thread);
            }
            else {
                final SubLObject _prev_bind_0 = kb_paths.$path_link_lattice$.currentBinding(thread);
                final SubLObject _prev_bind_2 = kb_paths.$node_ancestors$.currentBinding(thread);
                try {
                    kb_paths.$path_link_lattice$.bind((SubLObject)kb_paths.NIL, thread);
                    kb_paths.$node_ancestors$.bind((SubLObject)ConsesLow.cons(fort, ancestors), thread);
                    SubLObject cdolist_list_var = kbp_node_links(fort);
                    SubLObject link = (SubLObject)kb_paths.NIL;
                    link = cdolist_list_var.first();
                    while (kb_paths.NIL != cdolist_list_var) {
                        gather_link_lattice(link, (SubLObject)kb_paths.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        link = cdolist_list_var.first();
                    }
                    if (kb_paths.NIL != kb_paths.$path_link_lattice$.getDynamicValue(thread)) {
                        kb_paths.$path_node_lattice$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(fort, kb_paths.$path_link_lattice$.getDynamicValue(thread)), kb_paths.$path_node_lattice$.getDynamicValue(thread)), thread);
                    }
                }
                finally {
                    kb_paths.$node_ancestors$.rebind(_prev_bind_2, thread);
                    kb_paths.$path_link_lattice$.rebind(_prev_bind_0, thread);
                }
            }
            kb_paths.$kbp_depth$.setDynamicValue(Numbers.subtract(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
        }
        return kb_paths.$path_node_lattice$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 11769L)
    public static SubLObject gather_link_lattice(final SubLObject assertion, SubLObject ancestors) {
        if (ancestors == kb_paths.UNPROVIDED) {
            ancestors = kb_paths.$link_ancestors$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != kbp_under_limit((SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED) && kb_paths.NIL != kbp_legal_linkP(assertion)) {
            kbp_note((SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.$str115$_____agather_link_latice_____a_s, string_utilities.tabstr(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED), string_utilities.tabstr(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED), assertion, (SubLObject)kb_paths.UNPROVIDED);
            kb_paths.$kbp_depth$.setDynamicValue(Numbers.add(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
            final SubLObject _prev_bind_0 = kb_paths.$path_node_lattice$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kb_paths.$link_ancestors$.currentBinding(thread);
            try {
                kb_paths.$path_node_lattice$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$link_ancestors$.bind((SubLObject)ConsesLow.cons(assertion, ancestors), thread);
                SubLObject cdolist_list_var = kbp_link_nodes(assertion);
                SubLObject node = (SubLObject)kb_paths.NIL;
                node = cdolist_list_var.first();
                while (kb_paths.NIL != cdolist_list_var) {
                    gather_node_lattice(node, (SubLObject)kb_paths.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                }
                if (kb_paths.NIL != kb_paths.$path_node_lattice$.getDynamicValue(thread)) {
                    kb_paths.$path_link_lattice$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertion, kb_paths.$path_node_lattice$.getDynamicValue(thread)), kb_paths.$path_link_lattice$.getDynamicValue(thread)), thread);
                }
            }
            finally {
                kb_paths.$link_ancestors$.rebind(_prev_bind_2, thread);
                kb_paths.$path_node_lattice$.rebind(_prev_bind_0, thread);
            }
            kb_paths.$kbp_depth$.setDynamicValue(Numbers.subtract(kb_paths.$kbp_depth$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 12332L)
    public static SubLObject kbp_neighbors_among(final SubLObject v_object, final SubLObject kbp_components, SubLObject test) {
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject neighbors = kbp_ancestors_via_all(v_object, (SubLObject)kb_paths.UNPROVIDED);
        SubLObject cdolist_list_var = kbp_components;
        SubLObject component = (SubLObject)kb_paths.NIL;
        component = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            if (kb_paths.NIL == subl_promotions.memberP(component, neighbors, test, (SubLObject)kb_paths.UNPROVIDED) && kb_paths.NIL != kbp_ancestor_via_anyP(component, kb_paths.$kbp_searchers$.getDynamicValue(thread), v_object, (SubLObject)kb_paths.UNPROVIDED)) {
                neighbors = (SubLObject)ConsesLow.cons(component, neighbors);
            }
            cdolist_list_var = cdolist_list_var.rest();
            component = cdolist_list_var.first();
        }
        return Sequences.nreverse(neighbors);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 12707L)
    public static SubLObject kbp_node_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbp_neighbors_among(node, kb_paths.$kbp_links$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 12786L)
    public static SubLObject kbp_link_nodes(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbp_neighbors_among(link, kb_paths.$kbp_nodes$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 12865L)
    public static SubLObject kbp_connecting_links(final SubLObject node_1, final SubLObject node_2) {
        SubLObject connecting_links = (SubLObject)kb_paths.NIL;
        SubLObject cdolist_list_var = kbp_ancestors_via_all(node_2, (SubLObject)kb_paths.UNPROVIDED);
        SubLObject link = (SubLObject)kb_paths.NIL;
        link = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            if (kb_paths.NIL != subl_promotions.memberP(node_1, kbp_ancestors_via_all(link, (SubLObject)kb_paths.UNPROVIDED), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                connecting_links = (SubLObject)ConsesLow.cons(link, connecting_links);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        cdolist_list_var = kbp_ancestors_via_all(node_1, (SubLObject)kb_paths.UNPROVIDED);
        link = (SubLObject)kb_paths.NIL;
        link = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            if (kb_paths.NIL != subl_promotions.memberP(node_2, kbp_ancestors_via_all(link, (SubLObject)kb_paths.UNPROVIDED), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                final SubLObject item_var = link;
                if (kb_paths.NIL == conses_high.member(item_var, connecting_links, Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
                    connecting_links = (SubLObject)ConsesLow.cons(item_var, connecting_links);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return connecting_links;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13256L)
    public static SubLObject kbp_node_neighbors(final SubLObject node) {
        return Sequences.remove(node, list_utilities.mapunion(Symbols.symbol_function((SubLObject)kb_paths.$sym116$KBP_LINK_NODES), kbp_node_links(node), (SubLObject)kb_paths.UNPROVIDED), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13364L)
    public static SubLObject kbp_legal_linkP(final SubLObject assertion) {
        if (kb_paths.NIL == kbp_searched_by_allP(assertion, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != ancestor_linkP(assertion)) {
            return (SubLObject)kb_paths.NIL;
        }
        return (SubLObject)kb_paths.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13525L)
    public static SubLObject kbp_legal_nodeP(final SubLObject node) {
        if (kb_paths.NIL == kbp_searched_by_allP(node, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != ancestor_nodeP(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        return (SubLObject)kb_paths.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13671L)
    public static SubLObject ancestor_linkP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(assertion, kb_paths.$link_ancestors$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13753L)
    public static SubLObject ancestor_nodeP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(fort, kb_paths.$node_ancestors$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13825L)
    public static SubLObject kbp_under_limit(SubLObject depth, SubLObject limit) {
        if (depth == kb_paths.UNPROVIDED) {
            depth = kb_paths.$kbp_depth$.getDynamicValue();
        }
        if (limit == kb_paths.UNPROVIDED) {
            limit = kb_paths.$kbp_max_depth$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(!depth.isNumber() || !limit.isNumber() || limit.numGE(depth));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13994L)
    public static SubLObject mark_next_horizon(final SubLObject v_forts, SubLObject searcher, SubLObject op, SubLObject do_opP, SubLObject climb_treeP) {
        if (searcher == kb_paths.UNPROVIDED) {
            searcher = kb_paths.$kbp_searcher$.getDynamicValue();
        }
        if (op == kb_paths.UNPROVIDED) {
            op = kb_paths.$path_link_op$.getDynamicValue();
        }
        if (do_opP == kb_paths.UNPROVIDED) {
            do_opP = Symbols.symbol_function((SubLObject)kb_paths.$sym7$ASSERTION_P);
        }
        if (climb_treeP == kb_paths.UNPROVIDED) {
            climb_treeP = kb_paths.$relevant_link_treeP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        kbp_note((SubLObject)kb_paths.THREE_INTEGER, (SubLObject)kb_paths.$str117$____marking_horizon_for__s_in_ite, searcher, kb_paths.$search_iteration$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        if (kb_paths.NIL == kb_paths.$kbp_common_nodes$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)kb_paths.NIL;
            SubLObject quitP = kb_paths.$kbp_quitP$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = kb_paths.$path_horizon$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kb_paths.$kbp_searcher$.currentBinding(thread);
            try {
                kb_paths.$path_horizon$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$kbp_searcher$.bind(searcher, thread);
                if (kb_paths.NIL == quitP) {
                    SubLObject csome_list_var = v_forts;
                    final SubLObject _prev_bind_0_$13 = kb_paths.$kbp_ancestor$.currentBinding(thread);
                    try {
                        kb_paths.$kbp_ancestor$.bind((SubLObject)kb_paths.NIL, thread);
                        kb_paths.$kbp_ancestor$.setDynamicValue(csome_list_var.first(), thread);
                        while (kb_paths.NIL == quitP && kb_paths.NIL != csome_list_var) {
                            kb_paths.$kbp_node_count$.setDynamicValue(Numbers.add(kb_paths.$kbp_node_count$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
                            kbp_note((SubLObject)kb_paths.TWO_INTEGER, (SubLObject)kb_paths.$str118$__search_node____s__s___s, kb_paths.$search_iteration$.getDynamicValue(thread), kb_paths.$kbp_node_count$.getDynamicValue(thread), kb_paths.$kbp_ancestor$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED);
                            do_if_term_assertions(kb_paths.$kbp_ancestor$.getDynamicValue(thread), op, do_opP, climb_treeP);
                            quitP = kbp_term_bound_metP();
                            csome_list_var = csome_list_var.rest();
                            kb_paths.$kbp_ancestor$.setDynamicValue(csome_list_var.first(), thread);
                        }
                    }
                    finally {
                        kb_paths.$kbp_ancestor$.rebind(_prev_bind_0_$13, thread);
                    }
                }
                result = kb_paths.$path_horizon$.getDynamicValue(thread);
            }
            finally {
                kb_paths.$kbp_searcher$.rebind(_prev_bind_2, thread);
                kb_paths.$path_horizon$.rebind(_prev_bind_0, thread);
            }
            if (kb_paths.NIL == result) {
                kbp_warn((SubLObject)kb_paths.THREE_INTEGER, (SubLObject)kb_paths.$str119$empty_horizon_for__s_in_iteration, searcher, kb_paths.$search_iteration$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
            }
            return result;
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 14926L)
    public static SubLObject default_link_op(final SubLObject assertion, SubLObject searcher, SubLObject ancestor) {
        if (searcher == kb_paths.UNPROVIDED) {
            searcher = kb_paths.$kbp_searcher$.getDynamicValue();
        }
        if (ancestor == kb_paths.UNPROVIDED) {
            ancestor = kb_paths.$kbp_ancestor$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != Functions.funcall(kb_paths.$relevant_linkP$.getDynamicValue(thread), assertion)) {
            kb_paths.$kbp_link_count$.setDynamicValue(Numbers.add(kb_paths.$kbp_link_count$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
            kbp_record_ancestor(assertion, searcher, ancestor, (SubLObject)kb_paths.UNPROVIDED);
            if (kb_paths.NIL == kbp_searched_byP(assertion, searcher, (SubLObject)kb_paths.UNPROVIDED)) {
                kbp_mark_as_searched_by(assertion, searcher, (SubLObject)kb_paths.UNPROVIDED);
                do_link_nodes(assertion, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
            }
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 15302L)
    public static SubLObject default_node_op(final SubLObject fort, SubLObject searcher, SubLObject ancestor) {
        if (searcher == kb_paths.UNPROVIDED) {
            searcher = kb_paths.$kbp_searcher$.getDynamicValue();
        }
        if (ancestor == kb_paths.UNPROVIDED) {
            ancestor = kb_paths.$kbp_ancestor$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != Functions.funcall(kb_paths.$relevant_nodeP$.getDynamicValue(thread), fort)) {
            kb_paths.$kbp_term_count$.setDynamicValue(Numbers.add(kb_paths.$kbp_term_count$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
            kbp_record_ancestor(fort, searcher, ancestor, (SubLObject)kb_paths.UNPROVIDED);
            if (kb_paths.NIL == kbp_searched_byP(fort, searcher, (SubLObject)kb_paths.UNPROVIDED)) {
                kbp_mark_as_searched_by(fort, searcher, (SubLObject)kb_paths.UNPROVIDED);
                kbp_note((SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.$str120$___s_searched_by___s, fort, kbp_searched_by(fort), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                if (kb_paths.NIL != kbp_searched_by_allP(fort, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                    kb_paths.$kbp_common_nodes$.setDynamicValue((SubLObject)ConsesLow.cons(fort, kb_paths.$kbp_common_nodes$.getDynamicValue(thread)), thread);
                    kbp_note((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str121$___s______goal_________________, fort, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                    if (kb_paths.NIL != kb_paths.$kbp_quit_with_successP$.getDynamicValue(thread)) {
                        kb_paths.$kbp_quitP$.setDynamicValue((SubLObject)kb_paths.$kw102$SUCCESS, thread);
                    }
                }
                else {
                    kb_paths.$path_horizon$.setDynamicValue((SubLObject)ConsesLow.cons(fort, kb_paths.$path_horizon$.getDynamicValue(thread)), thread);
                }
            }
            if (kb_paths.NIL != kbp_term_bound_metP()) {
                kb_paths.$kbp_quitP$.setDynamicValue((SubLObject)kb_paths.$kw122$TERM_BOUND, thread);
            }
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 15996L)
    public static SubLObject do_link_nodes(final SubLObject assertion, SubLObject op, SubLObject do_opP) {
        if (op == kb_paths.UNPROVIDED) {
            op = kb_paths.$path_node_op$.getDynamicValue();
        }
        if (do_opP == kb_paths.UNPROVIDED) {
            do_opP = Symbols.symbol_function((SubLObject)kb_paths.$sym5$FORT_P);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = Functions.funcall(kb_paths.$nodes_accessor_fn$.getDynamicValue(thread), assertion);
        SubLObject node = (SubLObject)kb_paths.NIL;
        node = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            if (kb_paths.NIL != kb_paths.$kbp_quitP$.getDynamicValue(thread)) {
                return (SubLObject)kb_paths.NIL;
            }
            if (kb_paths.NIL == equal_nodesP(node, kb_paths.$kbp_ancestor$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED) && kb_paths.NIL != Functions.funcall(do_opP, node)) {
                final SubLObject _prev_bind_0 = kb_paths.$kbp_ancestor$.currentBinding(thread);
                try {
                    kb_paths.$kbp_ancestor$.bind(assertion, thread);
                    Functions.funcall(op, node);
                }
                finally {
                    kb_paths.$kbp_ancestor$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 16336L)
    public static SubLObject default_relevant_linkP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL == mt_relevance_macros.relevant_assertionP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_external_link_predP$.getDynamicValue(thread) && kb_paths.NIL == kbp_link_satisfies_external_predP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_only_gaf_linksP$.getDynamicValue(thread) && kb_paths.NIL == assertions_high.gaf_assertionP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_designated_predsP$.getDynamicValue(thread) && kb_paths.NIL != kbp_undesignated_pred_assertionP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_restricted_predsP$.getDynamicValue(thread) && kb_paths.NIL != kbp_restricted_pred_assertionP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_restricted_mtsP$.getDynamicValue(thread) && kb_paths.NIL != kbp_restricted_mt_assertionP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_no_bi_scoping_linksP$.getDynamicValue(thread) && kb_paths.NIL != kbp_bi_scoping_linkP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_bound_gaf_termsP$.getDynamicValue(thread) && kb_paths.NIL != kbp_gaf_term_beyond_boundP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_bound_link_termsP$.getDynamicValue(thread) && kb_paths.NIL != kbp_link_term_beyond_boundP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_link_reference_set_boundP$.getDynamicValue(thread) && kb_paths.NIL != kbp_link_terms_beyond_reference_set_boundP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_designated_link_referencesP$.getDynamicValue(thread) && kb_paths.NIL != kbp_link_terms_wXo_referencesP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_use_max_mtsP$.getDynamicValue(thread) && kb_paths.NIL != kbp_link_wXo_max_mtP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kbp_excluded_linkP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_no_bookkeeping_linksP$.getDynamicValue(thread) && kb_paths.NIL != bookkeeping_gaf_assertionP(link)) {
            return (SubLObject)kb_paths.NIL;
        }
        return (SubLObject)kb_paths.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 17560L)
    public static SubLObject default_relevant_nodeP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL == forts.fort_p(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != equal_nodesP(node, kb_paths.$kbp_searcher$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != fort_types_interface.non_predicate_functionP(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_no_bi_scoping_linksP$.getDynamicValue(thread) && kb_paths.NIL != kbp_bi_scoping_nodeP(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_genl_boundP$.getDynamicValue(thread) && kb_paths.NIL != kbp_beyond_genl_boundP(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_isa_boundP$.getDynamicValue(thread) && kb_paths.NIL != kbp_beyond_isa_boundP(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_node_isa_boundP$.getDynamicValue(thread) && kb_paths.NIL != kbp_node_beyond_isa_boundP(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_designated_node_superiorsP$.getDynamicValue(thread) && kb_paths.NIL != kbp_undesignated_node_superiorP(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_restricted_nodes_as_argP$.getDynamicValue(thread) && kb_paths.NIL != kbp_node_restricted_as_argP(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kbp_excluded_nodeP(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_genls_cardinality_delta_boundP$.getDynamicValue(thread) && kb_paths.NIL != kbp_beyond_genls_cardinality_delta_boundP(node)) {
            return (SubLObject)kb_paths.NIL;
        }
        return (SubLObject)kb_paths.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 18429L)
    public static SubLObject kbp_beyond_genls_cardinality_delta_boundP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != fort_types_interface.collectionP(node)) {
            final SubLObject spec_cardinality = cardinality_estimates.spec_cardinality(node);
            if (spec_cardinality.isInteger()) {
                return Numbers.numG(spec_cardinality, Sequences.creduce((SubLObject)kb_paths.$sym123$_, list_utilities.remove_if_not((SubLObject)kb_paths.$sym124$INTEGERP, (SubLObject)ConsesLow.cons(kb_paths.$kbp_genls_cardinality_delta_bound$.getDynamicValue(thread), Mapping.mapcar((SubLObject)kb_paths.$sym125$SPEC_CARDINALITY, kb_paths.$kbp_searchers$.getDynamicValue(thread))), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED));
            }
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 18801L)
    public static SubLObject kbp_beyond_genl_boundP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return genls.any_specP(fort, kb_paths.$kbp_genl_bound$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 18883L)
    public static SubLObject kbp_beyond_isa_boundP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return isa.isa_anyP(fort, kb_paths.$kbp_isa_bound$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 18962L)
    public static SubLObject kbp_undesignated_node_superiorP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != kb_paths.$kbp_designated_node_superiors$.getDynamicValue(thread)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_paths.NIL == isa.isa_anyP(fort, kb_paths.$kbp_designated_node_superiors$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED) && kb_paths.NIL == sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_utilities.determine_sbhl_module_from_fort_type(fort, (SubLObject)kb_paths.UNPROVIDED), fort, kb_paths.$kbp_designated_node_superiors$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED));
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 19263L)
    public static SubLObject kbp_node_restricted_as_argP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != forts.fort_p(node)) {
            SubLObject restrictedP = (SubLObject)kb_paths.NIL;
            if (kb_paths.NIL == restrictedP) {
                SubLObject csome_list_var;
                SubLObject predXarg;
                for (csome_list_var = kb_paths.$kbp_restricted_nodes_as_arg$.getDynamicValue(thread), predXarg = (SubLObject)kb_paths.NIL, predXarg = csome_list_var.first(); kb_paths.NIL == restrictedP && kb_paths.NIL != csome_list_var; restrictedP = kb_mapping_utilities.some_pred_value(node, predXarg.first(), conses_high.second(predXarg), (SubLObject)kb_paths.UNPROVIDED), csome_list_var = csome_list_var.rest(), predXarg = csome_list_var.first()) {}
            }
            return restrictedP;
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 19527L)
    public static SubLObject kbp_node_beyond_isa_boundP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return isa.isa_anyP(fort, kb_paths.$kbp_node_isa_bound$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 19616L)
    public static SubLObject kbp_gaf_term_beyond_boundP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject beyondP = (SubLObject)kb_paths.NIL;
        if (kb_paths.NIL != assertions_high.gaf_assertionP(link)) {
            if (kb_paths.NIL == beyondP) {
                SubLObject csome_list_var;
                SubLObject arg;
                for (csome_list_var = kb_paths.$kbp_bound_gaf_terms$.getDynamicValue(thread), arg = (SubLObject)kb_paths.NIL, arg = csome_list_var.first(); kb_paths.NIL == beyondP && kb_paths.NIL != csome_list_var; beyondP = kbp_beyond_isa_boundP(assertions_high.gaf_arg(link, arg)), csome_list_var = csome_list_var.rest(), arg = csome_list_var.first()) {}
            }
            if (kb_paths.NIL == beyondP) {
                SubLObject csome_list_var;
                SubLObject arg;
                for (csome_list_var = kb_paths.$kbp_bound_gaf_terms$.getDynamicValue(thread), arg = (SubLObject)kb_paths.NIL, arg = csome_list_var.first(); kb_paths.NIL == beyondP && kb_paths.NIL != csome_list_var; beyondP = kbp_beyond_genl_boundP(assertions_high.gaf_arg(link, arg)), csome_list_var = csome_list_var.rest(), arg = csome_list_var.first()) {}
            }
        }
        return beyondP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 19965L)
    public static SubLObject kbp_undesignated_pred_assertionP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != kb_paths.$kbp_designated_preds$.getDynamicValue(thread) && kb_paths.NIL != assertions_high.gaf_assertionP(link)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_paths.NIL == subl_promotions.memberP(assertions_high.gaf_arg0(link), kb_paths.$kbp_designated_preds$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED));
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 20144L)
    public static SubLObject kbp_restricted_pred_assertionP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != kb_paths.$kbp_restricted_preds$.getDynamicValue(thread) && kb_paths.NIL != assertions_high.gaf_assertionP(link)) {
            return subl_promotions.memberP(assertions_high.gaf_arg0(link), kb_paths.$kbp_restricted_preds$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 20313L)
    public static SubLObject kbp_restricted_mt_assertionP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != kb_paths.$kbp_restricted_mtsP$.getDynamicValue(thread) && kb_paths.NIL != assertion_handles.assertion_p(link)) {
            return subl_promotions.memberP(assertions_high.assertion_mt(link), kb_paths.$kbp_restricted_mts$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 20478L)
    public static SubLObject kbp_link_terms_beyond_reference_set_boundP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject beyondP = (SubLObject)kb_paths.NIL;
        if (kb_paths.NIL != term.kb_assertionP(link)) {
            final SubLObject assertion_terms = all_assertion_references(link, (SubLObject)kb_paths.UNPROVIDED);
            if (kb_paths.NIL == beyondP) {
                SubLObject csome_list_var = kb_paths.$kbp_link_reference_set_bound$.getDynamicValue(thread);
                SubLObject term_set = (SubLObject)kb_paths.NIL;
                term_set = csome_list_var.first();
                while (kb_paths.NIL == beyondP && kb_paths.NIL != csome_list_var) {
                    SubLObject missedP = (SubLObject)kb_paths.NIL;
                    if (kb_paths.NIL == missedP) {
                        SubLObject csome_list_var_$14;
                        SubLObject v_term;
                        for (csome_list_var_$14 = term_set, v_term = (SubLObject)kb_paths.NIL, v_term = csome_list_var_$14.first(); kb_paths.NIL == missedP && kb_paths.NIL != csome_list_var_$14; missedP = (SubLObject)SubLObjectFactory.makeBoolean(kb_paths.NIL == subl_promotions.memberP(v_term, assertion_terms, Symbols.symbol_function((SubLObject)kb_paths.EQUAL), (SubLObject)kb_paths.UNPROVIDED)), csome_list_var_$14 = csome_list_var_$14.rest(), v_term = csome_list_var_$14.first()) {}
                    }
                    beyondP = (SubLObject)SubLObjectFactory.makeBoolean(kb_paths.NIL == missedP);
                    csome_list_var = csome_list_var.rest();
                    term_set = csome_list_var.first();
                }
            }
        }
        return beyondP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 20897L)
    public static SubLObject kbp_link_terms_wXo_referencesP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != kb_paths.$kbp_designated_link_references$.getDynamicValue(thread)) {
            SubLObject foundP = (SubLObject)kb_paths.NIL;
            if (kb_paths.NIL != term.kb_assertionP(link)) {
                final SubLObject assertion_terms = all_assertion_references(link, (SubLObject)kb_paths.UNPROVIDED);
                if (kb_paths.NIL == foundP) {
                    SubLObject csome_list_var;
                    SubLObject v_term;
                    for (csome_list_var = kb_paths.$kbp_designated_link_references$.getDynamicValue(thread), v_term = (SubLObject)kb_paths.NIL, v_term = csome_list_var.first(); kb_paths.NIL == foundP && kb_paths.NIL != csome_list_var; foundP = subl_promotions.memberP(v_term, assertion_terms, Symbols.symbol_function((SubLObject)kb_paths.EQUAL), (SubLObject)kb_paths.UNPROVIDED), csome_list_var = csome_list_var.rest(), v_term = csome_list_var.first()) {}
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_paths.NIL == foundP);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 21252L)
    public static SubLObject kbp_link_satisfies_external_predP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_paths.NIL == Symbols.fboundp(kb_paths.$kbp_external_link_pred$.getDynamicValue(thread)) || kb_paths.NIL != Functions.funcall(kb_paths.$kbp_external_link_pred$.getDynamicValue(thread), link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 21400L)
    public static SubLObject kbp_link_term_beyond_boundP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject beyondP = (SubLObject)kb_paths.NIL;
        if (kb_paths.NIL != term.kb_assertionP(link) && kb_paths.NIL == beyondP) {
            SubLObject csome_list_var = kb_paths.$kbp_bound_link_terms$.getDynamicValue(thread);
            SubLObject index = (SubLObject)kb_paths.NIL;
            index = csome_list_var.first();
            while (kb_paths.NIL == beyondP && kb_paths.NIL != csome_list_var) {
                final SubLObject terms = assertion_indexed_by(link, index);
                if (kb_paths.NIL == beyondP) {
                    SubLObject csome_list_var_$15;
                    SubLObject v_term;
                    for (csome_list_var_$15 = terms, v_term = (SubLObject)kb_paths.NIL, v_term = csome_list_var_$15.first(); kb_paths.NIL == beyondP && kb_paths.NIL != csome_list_var_$15; beyondP = kbp_beyond_isa_boundP(v_term), csome_list_var_$15 = csome_list_var_$15.rest(), v_term = csome_list_var_$15.first()) {}
                }
                if (kb_paths.NIL == beyondP) {
                    SubLObject v_term;
                    SubLObject csome_list_var_$16;
                    for (csome_list_var_$16 = terms, v_term = (SubLObject)kb_paths.NIL, v_term = csome_list_var_$16.first(); kb_paths.NIL == beyondP && kb_paths.NIL != csome_list_var_$16; beyondP = kbp_beyond_genl_boundP(v_term), csome_list_var_$16 = csome_list_var_$16.rest(), v_term = csome_list_var_$16.first()) {}
                }
                csome_list_var = csome_list_var.rest();
                index = csome_list_var.first();
            }
        }
        return beyondP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 21788L)
    public static SubLObject kbp_link_wXo_max_mtP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject violationP = (SubLObject)kb_paths.NIL;
        if (kb_paths.NIL != term.kb_assertionP(link)) {
            final SubLObject clause_struc = assertions_low.assertion_clause_struc(link);
            final SubLObject mt = assertions_high.assertion_mt(link);
            final SubLObject _prev_bind_0 = kb_paths.$kbp_use_max_mtsP$.currentBinding(thread);
            try {
                kb_paths.$kbp_use_max_mtsP$.bind((SubLObject)kb_paths.NIL, thread);
                if (kb_paths.NIL != clause_struc) {
                    SubLObject rest;
                    SubLObject similar_assertion;
                    SubLObject other_mt;
                    for (rest = (SubLObject)kb_paths.NIL, rest = clause_strucs.clause_struc_assertions(clause_struc); kb_paths.NIL == violationP && kb_paths.NIL != rest; rest = rest.rest()) {
                        similar_assertion = rest.first();
                        if (!link.eql(similar_assertion)) {
                            other_mt = assertions_high.assertion_mt(similar_assertion);
                            if (kb_paths.NIL != mt_relevance_macros.relevant_mtP(other_mt) && kb_paths.NIL != genl_mts.genl_mtP(mt, other_mt, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED) && kb_paths.NIL == genl_mts.genl_mtP(other_mt, mt, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                                violationP = Functions.funcall(kb_paths.$relevant_linkP$.getDynamicValue(thread), similar_assertion);
                            }
                        }
                    }
                }
            }
            finally {
                kb_paths.$kbp_use_max_mtsP$.rebind(_prev_bind_0, thread);
            }
        }
        return violationP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 22452L)
    public static SubLObject kbp_bi_scoping_linkP(final SubLObject assertion) {
        final SubLObject result = kbp_bi_scoping_link_1P(assertion);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 22567L)
    public static SubLObject kbp_bi_scoping_link_1P(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.$search_iteration$.getDynamicValue(thread).numGE((SubLObject)kb_paths.ONE_INTEGER)) {
            final SubLObject bi_scopicP = (SubLObject)kb_paths.NIL;
            if (kb_paths.NIL == bi_scopicP) {
                SubLObject csome_list_var = (SubLObject)ConsesLow.cons(kb_paths.$kbp_ancestor$.getDynamicValue(thread), kbp_ancestors_via_all(assertion, (SubLObject)kb_paths.UNPROVIDED));
                SubLObject node = (SubLObject)kb_paths.NIL;
                node = csome_list_var.first();
                while (kb_paths.NIL == bi_scopicP && kb_paths.NIL != csome_list_var) {
                    final SubLObject scope_direction = scope_direction(assertion, node);
                    if (kb_paths.NIL != scope_direction) {
                        if (kb_paths.NIL != Sequences.remove(kb_paths.$kbp_searcher$.getDynamicValue(thread), kbp_searched_by(assertion), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                            return (SubLObject)kb_paths.T;
                        }
                        if (kb_paths.NIL == bi_scopicP) {
                            SubLObject csome_list_var_$17 = kbp_ancestors_via_all(node, (SubLObject)kb_paths.UNPROVIDED);
                            SubLObject assertion_1 = (SubLObject)kb_paths.NIL;
                            assertion_1 = csome_list_var_$17.first();
                            while (kb_paths.NIL == bi_scopicP && kb_paths.NIL != csome_list_var_$17) {
                                if (kb_paths.NIL == bi_scopicP) {
                                    SubLObject csome_list_var_$18 = kbp_ancestors_via_all(assertion_1, (SubLObject)kb_paths.UNPROVIDED);
                                    SubLObject node_1 = (SubLObject)kb_paths.NIL;
                                    node_1 = csome_list_var_$18.first();
                                    while (kb_paths.NIL == bi_scopicP && kb_paths.NIL != csome_list_var_$18) {
                                        final SubLObject scope_direction_1 = scope_direction(assertion_1, node_1);
                                        if (kb_paths.NIL != scope_direction_1 && !scope_direction.eql(scope_direction_1)) {
                                            return (SubLObject)kb_paths.T;
                                        }
                                        csome_list_var_$18 = csome_list_var_$18.rest();
                                        node_1 = csome_list_var_$18.first();
                                    }
                                }
                                csome_list_var_$17 = csome_list_var_$17.rest();
                                assertion_1 = csome_list_var_$17.first();
                            }
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    node = csome_list_var.first();
                }
            }
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 23320L)
    public static SubLObject kbp_bi_scoping_nodeP(final SubLObject node) {
        final SubLObject result = kbp_bi_scoping_node_1P(node);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 23425L)
    public static SubLObject kbp_bi_scoping_node_1P(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.$search_iteration$.getDynamicValue(thread).numGE((SubLObject)kb_paths.ONE_INTEGER)) {
            final SubLObject bi_scopicP = (SubLObject)kb_paths.NIL;
            final SubLObject searchers = conses_high.adjoin(kb_paths.$kbp_searcher$.getDynamicValue(thread), kbp_searched_by(node), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
            if (kb_paths.NIL == bi_scopicP) {
                SubLObject csome_list_var = (SubLObject)ConsesLow.cons(kb_paths.$kbp_ancestor$.getDynamicValue(thread), kbp_ancestors_via_all(node, (SubLObject)kb_paths.UNPROVIDED));
                SubLObject assertion = (SubLObject)kb_paths.NIL;
                assertion = csome_list_var.first();
                while (kb_paths.NIL == bi_scopicP && kb_paths.NIL != csome_list_var) {
                    final SubLObject scope_direction = scope_direction(assertion, node);
                    if (kb_paths.NIL != scope_direction) {
                        if (kb_paths.NIL != Sequences.remove(kb_paths.$kbp_searcher$.getDynamicValue(thread), kbp_searched_by(assertion), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                            return (SubLObject)kb_paths.T;
                        }
                        if (kb_paths.NIL == bi_scopicP) {
                            SubLObject csome_list_var_$19 = kbp_ancestors_via_all(assertion, (SubLObject)kb_paths.UNPROVIDED);
                            SubLObject node_1 = (SubLObject)kb_paths.NIL;
                            node_1 = csome_list_var_$19.first();
                            while (kb_paths.NIL == bi_scopicP && kb_paths.NIL != csome_list_var_$19) {
                                if (kb_paths.NIL == bi_scopicP) {
                                    SubLObject csome_list_var_$20 = kbp_ancestors_via_all(node_1, (SubLObject)kb_paths.UNPROVIDED);
                                    SubLObject assertion_1 = (SubLObject)kb_paths.NIL;
                                    assertion_1 = csome_list_var_$20.first();
                                    while (kb_paths.NIL == bi_scopicP && kb_paths.NIL != csome_list_var_$20) {
                                        final SubLObject scope_direction_1 = scope_direction(assertion_1, node_1);
                                        if (kb_paths.NIL != scope_direction_1) {
                                            final SubLObject searchers_1 = kbp_searched_by(assertion_1);
                                            if (kb_paths.NIL == list_utilities.singletonP(searchers)) {
                                                return (SubLObject)kb_paths.T;
                                            }
                                            if (scope_direction.eql(scope_direction_1)) {
                                                return Equality.equal(searchers, searchers_1);
                                            }
                                            if (searchers.equal(searchers_1)) {
                                                return (SubLObject)kb_paths.T;
                                            }
                                        }
                                        csome_list_var_$20 = csome_list_var_$20.rest();
                                        assertion_1 = csome_list_var_$20.first();
                                    }
                                }
                                csome_list_var_$19 = csome_list_var_$19.rest();
                                node_1 = csome_list_var_$19.first();
                            }
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                }
            }
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 24388L)
    public static SubLObject scope_direction(final SubLObject assertion, final SubLObject v_term) {
        if (kb_paths.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject literal = assertions_high.gaf_formula(assertion);
            final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)kb_paths.UNPROVIDED);
            final SubLObject arg = Sequences.position(v_term, literal, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
            final SubLObject pcase_var = predicate;
            if (pcase_var.eql(kb_paths.$const126$genls)) {
                final SubLObject pcase_var_$21 = arg;
                if (pcase_var_$21.eql((SubLObject)kb_paths.ONE_INTEGER)) {
                    return (SubLObject)kb_paths.$kw127$UP;
                }
                if (pcase_var_$21.eql((SubLObject)kb_paths.TWO_INTEGER)) {
                    return (SubLObject)kb_paths.$kw128$DOWN;
                }
            }
            else if (pcase_var.eql(kb_paths.$const129$isa)) {
                final SubLObject pcase_var_$22 = arg;
                if (pcase_var_$22.eql((SubLObject)kb_paths.ONE_INTEGER)) {
                    return (SubLObject)kb_paths.$kw127$UP;
                }
                if (pcase_var_$22.eql((SubLObject)kb_paths.TWO_INTEGER)) {
                    return (SubLObject)kb_paths.$kw128$DOWN;
                }
            }
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 24743L)
    public static SubLObject default_relevant_link_treeP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != kb_paths.$kbp_no_bookkeeping_linksP$.getDynamicValue(thread) && kb_paths.NIL != bookkeeping_btreeP(v_object)) {
            return (SubLObject)kb_paths.NIL;
        }
        if (kb_paths.NIL != kb_paths.$kbp_no_instance_linksP$.getDynamicValue(thread) && kb_paths.NIL != instance_btreeP(v_object)) {
            return (SubLObject)kb_paths.NIL;
        }
        return (SubLObject)kb_paths.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 24966L)
    public static SubLObject do_if_term_assertions(final SubLObject v_term, SubLObject op, SubLObject do_opP, SubLObject climb_treeP) {
        if (op == kb_paths.UNPROVIDED) {
            op = kb_paths.$path_link_op$.getDynamicValue();
        }
        if (do_opP == kb_paths.UNPROVIDED) {
            do_opP = Symbols.symbol_function((SubLObject)kb_paths.IDENTITY);
        }
        if (climb_treeP == kb_paths.UNPROVIDED) {
            climb_treeP = Symbols.symbol_function((SubLObject)kb_paths.IDENTITY);
        }
        obsolete_tree_do_if(kb_accessors.all_term_assertions(v_term, (SubLObject)kb_paths.UNPROVIDED), op, do_opP, climb_treeP, Symbols.symbol_function((SubLObject)kb_paths.IDENTITY), (SubLObject)kb_paths.NIL);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 25303L)
    public static SubLObject obsolete_tree_do_if(final SubLObject v_object, final SubLObject op, SubLObject do_opP, SubLObject climb_treeP, SubLObject key, SubLObject subs_tooP) {
        if (do_opP == kb_paths.UNPROVIDED) {
            do_opP = Symbols.symbol_function((SubLObject)kb_paths.$sym7$ASSERTION_P);
        }
        if (climb_treeP == kb_paths.UNPROVIDED) {
            climb_treeP = Symbols.symbol_function((SubLObject)kb_paths.IDENTITY);
        }
        if (key == kb_paths.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)kb_paths.IDENTITY);
        }
        if (subs_tooP == kb_paths.UNPROVIDED) {
            subs_tooP = (SubLObject)kb_paths.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL == kb_paths.$kbp_quitP$.getDynamicValue(thread)) {
            if (kb_paths.NIL != Functions.funcall(do_opP, Functions.funcall(key, v_object))) {
                Functions.funcall(op, v_object);
                if (kb_paths.NIL == subs_tooP) {
                    if (kb_paths.NIL != kb_paths.$kbp_explode_natsP$.getDynamicValue(thread) && kb_paths.NIL != assertion_handles.assertion_p(v_object) && kb_paths.NIL != function_terms.tou_assertionP(v_object)) {
                        final SubLObject _prev_bind_0 = kb_paths.$kbp_explode_natsP$.currentBinding(thread);
                        try {
                            kb_paths.$kbp_explode_natsP$.bind((SubLObject)kb_paths.NIL, thread);
                            final SubLObject node = assertions_high.gaf_arg1(v_object);
                            if (kb_paths.NIL != Functions.funcall(kb_paths.$relevant_nodeP$.getDynamicValue(thread), node)) {
                                do_if_term_assertions(node, op, do_opP, climb_treeP);
                            }
                        }
                        finally {
                            kb_paths.$kbp_explode_natsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return (SubLObject)kb_paths.NIL;
                }
            }
            if (v_object.isCons()) {
                SubLObject list = (SubLObject)kb_paths.NIL;
                SubLObject sub = (SubLObject)kb_paths.NIL;
                list = v_object;
                sub = list.first();
                while (list.rest().isCons()) {
                    obsolete_tree_do_if(sub, op, do_opP, climb_treeP, key, subs_tooP);
                    list = list.rest();
                    sub = list.first();
                }
                obsolete_tree_do_if(list.first(), op, do_opP, climb_treeP, key, subs_tooP);
                if (kb_paths.NIL != list.rest()) {
                    obsolete_tree_do_if(list.rest(), op, do_opP, climb_treeP, key, subs_tooP);
                }
            }
            else if (kb_paths.NIL != binary_tree.btree_p(v_object)) {
                obsolete_tree_do_if(binary_tree.bt_lower(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                obsolete_tree_do_if(binary_tree.bt_higher(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                if (kb_paths.NIL != Functions.funcall(climb_treeP, v_object)) {
                    obsolete_tree_do_if(binary_tree.bt_tag(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                    obsolete_tree_do_if(binary_tree.bt_state(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                }
            }
            else if (kb_paths.NIL != assertion_handles.assertion_p(v_object)) {
                obsolete_tree_do_if(assertions_low.assertion_formula_data(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                obsolete_tree_do_if(assertions_high.assertion_mt(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                obsolete_tree_do_if(assertions_high.assertion_variable_names(v_object), op, do_opP, climb_treeP, key, subs_tooP);
            }
            else if (kb_paths.NIL != clause_strucs.clause_struc_p(v_object)) {
                obsolete_tree_do_if(clause_strucs.clause_struc_cnf(v_object), op, do_opP, climb_treeP, key, subs_tooP);
            }
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 27057L)
    public static SubLObject assertion_indexed_by(final SubLObject assertion, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject neg_pairs = kb_indexing.determine_rule_indices(assertions_high.assertion_cnf(assertion));
        final SubLObject pos_pairs = thread.secondMultipleValue();
        final SubLObject other = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (index.eql((SubLObject)kb_paths.$kw130$NEG)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_paths.$sym131$SECOND), neg_pairs);
        }
        if (index.eql((SubLObject)kb_paths.$kw132$POS)) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_paths.$sym131$SECOND), pos_pairs);
        }
        if (index.eql((SubLObject)kb_paths.$kw133$OTHER)) {
            return other;
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 27356L)
    public static SubLObject all_assertion_terms(final SubLObject assertion, SubLObject test) {
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        SubLObject terms = (SubLObject)kb_paths.NIL;
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        SubLObject cdolist_list_var = clauses.pos_lits(cnf);
        SubLObject literal = (SubLObject)kb_paths.NIL;
        literal = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$23 = cycl_utilities.all_literal_terms(literal, (SubLObject)kb_paths.UNPROVIDED);
            SubLObject v_term = (SubLObject)kb_paths.NIL;
            v_term = cdolist_list_var_$23.first();
            while (kb_paths.NIL != cdolist_list_var_$23) {
                final SubLObject item_var = v_term;
                if (kb_paths.NIL == conses_high.member(item_var, terms, test, Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
                    terms = (SubLObject)ConsesLow.cons(item_var, terms);
                }
                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                v_term = cdolist_list_var_$23.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.neg_lits(cnf);
        literal = (SubLObject)kb_paths.NIL;
        literal = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$24 = cycl_utilities.all_literal_terms(literal, (SubLObject)kb_paths.UNPROVIDED);
            SubLObject v_term = (SubLObject)kb_paths.NIL;
            v_term = cdolist_list_var_$24.first();
            while (kb_paths.NIL != cdolist_list_var_$24) {
                final SubLObject item_var = v_term;
                if (kb_paths.NIL == conses_high.member(item_var, terms, test, Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
                    terms = (SubLObject)ConsesLow.cons(item_var, terms);
                }
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                v_term = cdolist_list_var_$24.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        cdolist_list_var = terms;
        SubLObject v_term2 = (SubLObject)kb_paths.NIL;
        v_term2 = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            if (kb_paths.NIL != forts.fort_p(v_term2)) {
                final SubLObject nat = function_terms.term_of_unit(v_term2);
                SubLObject cdolist_list_var_$25 = cycl_utilities.nat_args(nat, (SubLObject)kb_paths.UNPROVIDED);
                SubLObject nat_term = (SubLObject)kb_paths.NIL;
                nat_term = cdolist_list_var_$25.first();
                while (kb_paths.NIL != cdolist_list_var_$25) {
                    final SubLObject item_var2 = nat_term;
                    if (kb_paths.NIL == conses_high.member(item_var2, terms, test, Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
                        terms = (SubLObject)ConsesLow.cons(item_var2, terms);
                    }
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    nat_term = cdolist_list_var_$25.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term2 = cdolist_list_var.first();
        }
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 28002L)
    public static SubLObject all_assertion_references(final SubLObject assertion, SubLObject test) {
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        return Sequences.remove_duplicates(list_utilities.flatten(fi.assertion_fi_formula(assertion, (SubLObject)kb_paths.UNPROVIDED)), test, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 28148L)
    public static SubLObject clear_kb_paths() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_paths.$kbp_quitP$.setDynamicValue((SubLObject)kb_paths.NIL, thread);
        kb_paths.$kbp_stats$.setDynamicValue((SubLObject)kb_paths.NIL, thread);
        kb_paths.$kbp_common_nodes$.setDynamicValue((SubLObject)kb_paths.NIL, thread);
        kb_paths.$kbp_run_time$.setDynamicValue((SubLObject)kb_paths.NIL, thread);
        Hashtables.clrhash(kb_paths.$kbp_ancestor_hash$.getDynamicValue(thread));
        Hashtables.clrhash(kb_paths.$kbp_search_hash$.getDynamicValue(thread));
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 28364L)
    public static SubLObject kbp_stats(final SubLObject v_kb_paths) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_paths.$kbp_stats$.setDynamicValue((SubLObject)ConsesLow.list(new SubLObject[] { kb_paths.$kbp_result_format$.getDynamicValue(thread), Sequences.length(v_kb_paths), kb_paths.$kw134$DEPTH, (kb_paths.NIL != v_kb_paths) ? number_utilities.float_n(Numbers.divide(paths_link_count(v_kb_paths), Sequences.length(v_kb_paths)), (SubLObject)kb_paths.ONE_INTEGER) : kb_paths.NIL, kb_paths.$kw135$ITERATIONS, kb_paths.$search_iteration$.getDynamicValue(thread), kb_paths.$kw136$TERMS, kb_paths.$kbp_term_count$.getDynamicValue(thread), kb_paths.$kw137$NODES, kb_paths.$kbp_node_count$.getDynamicValue(thread), kb_paths.$kw111$LINKS, kb_paths.$kbp_link_count$.getDynamicValue(thread), kb_paths.$kw138$BRANCH, kb_paths.$kbp_node_count$.getDynamicValue(thread).numG((SubLObject)kb_paths.ZERO_INTEGER) ? number_utilities.float_n(Numbers.divide(kb_paths.$kbp_link_count$.getDynamicValue(thread), kb_paths.$kbp_node_count$.getDynamicValue(thread)), (SubLObject)kb_paths.ONE_INTEGER) : kb_paths.NIL, kb_paths.$kw139$TIME, kb_paths.$kbp_run_time$.getDynamicValue(thread).isNumber() ? number_utilities.float_n(kb_paths.$kbp_run_time$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER) : kb_paths.NIL, kb_paths.$kw140$TERMINATION, kb_paths.$kbp_quitP$.getDynamicValue(thread) }), thread);
        return kb_paths.$kbp_stats$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 28908L)
    public static SubLObject kbp_node_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbp_searched_object_count(kb_paths.$kbp_nodeP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 28984L)
    public static SubLObject kbp_link_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbp_searched_object_count(kb_paths.$kbp_linkP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29060L)
    public static SubLObject kbp_searched_object_count(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)kb_paths.ZERO_INTEGER;
        final SubLObject cdohash_table = kb_paths.$kbp_search_hash$.getDynamicValue(thread);
        SubLObject key = (SubLObject)kb_paths.NIL;
        SubLObject val = (SubLObject)kb_paths.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                if (kb_paths.NIL != Functions.funcall(fn, key)) {
                    count = Numbers.add(count, (SubLObject)kb_paths.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29243L)
    public static SubLObject next_iteration() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_paths.$search_iteration$.setDynamicValue(Numbers.add(kb_paths.$search_iteration$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
        utilities_macros.note_percent_progress(kb_paths.$search_iteration$.getDynamicValue(thread), kb_paths.$max_search_iterations$.getDynamicValue(thread));
        return kb_paths.$search_iteration$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29395L)
    public static SubLObject kbp_give_upP(final SubLObject v_iteration, final SubLObject horizon1, final SubLObject horizon2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL == kb_paths.$kbp_quitP$.getDynamicValue(thread)) {
            if (kb_paths.NIL != kbp_exhaustedP(horizon1, horizon2)) {
                kb_paths.$kbp_quitP$.setDynamicValue((SubLObject)kb_paths.$kw141$EXHAUST, thread);
            }
            else if (kb_paths.NIL != kbp_iteration_bound_metP(v_iteration)) {
                kb_paths.$kbp_quitP$.setDynamicValue((SubLObject)kb_paths.$kw142$ITERATION_BOUND, thread);
            }
            else if (kb_paths.NIL != kbp_term_bound_metP()) {
                kb_paths.$kbp_quitP$.setDynamicValue((SubLObject)kb_paths.$kw122$TERM_BOUND, thread);
            }
        }
        return kb_paths.$kbp_quitP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29727L)
    public static SubLObject kbp_exhaustedP(final SubLObject horizon1, final SubLObject horizon2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_paths.NIL == horizon1 && kb_paths.NIL == horizon2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29819L)
    public static SubLObject kbp_iteration_bound_metP(final SubLObject v_iteration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_iteration.isNumber() && kb_paths.$max_search_iterations$.getDynamicValue(thread).isNumber()) {
            return Numbers.numGE(v_iteration, kb_paths.$max_search_iterations$.getDynamicValue(thread));
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29986L)
    public static SubLObject kbp_term_bound_metP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.$kbp_term_count$.getDynamicValue(thread).isNumber() && kb_paths.$kbp_max_term_count$.getDynamicValue(thread).isNumber()) {
            return Numbers.numGE(kb_paths.$kbp_term_count$.getDynamicValue(thread), kb_paths.$kbp_max_term_count$.getDynamicValue(thread));
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30147L)
    public static SubLObject paths_link_count(final SubLObject paths) {
        SubLObject n = (SubLObject)kb_paths.ZERO_INTEGER;
        SubLObject cdolist_list_var = list_utilities.flatten(paths);
        SubLObject element = (SubLObject)kb_paths.NIL;
        element = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            if (kb_paths.NIL != assertion_handles.assertion_p(element)) {
                n = Numbers.add(n, (SubLObject)kb_paths.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return n;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30296L)
    public static SubLObject kbp_searcherP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(fort, kb_paths.$kbp_searchers$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)kb_paths.$sym143$EQUAL_NODES_), (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30381L)
    public static SubLObject equal_nodesP(final SubLObject node1, final SubLObject node2, SubLObject test) {
        if (test == kb_paths.UNPROVIDED) {
            test = kb_paths.$node_equalP$.getDynamicValue();
        }
        return Functions.funcall(test, node1, node2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30484L)
    public static SubLObject instance_btreeP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_paths.NIL != binary_tree.btree_p(v_object) && kb_paths.$term_arg$.getDynamicValue(thread).eql((SubLObject)kb_paths.TWO_INTEGER) && binary_tree.bt_tag(v_object).eql(kb_paths.$const129$isa));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30610L)
    public static SubLObject bookkeeping_btreeP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_paths.NIL != binary_tree.btree_p(v_object) && kb_paths.NIL != fort_types_interface.bookkeeping_predicate_p(binary_tree.bt_tag(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30728L)
    public static SubLObject kbp_record_ancestor(final SubLObject v_object, SubLObject searcher, SubLObject ancestor, SubLObject test) {
        if (searcher == kb_paths.UNPROVIDED) {
            searcher = kb_paths.$kbp_searcher$.getDynamicValue();
        }
        if (ancestor == kb_paths.UNPROVIDED) {
            ancestor = kb_paths.$kbp_ancestor$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.pushnew_hash((SubLObject)ConsesLow.list(v_object, searcher), ancestor, kb_paths.$kbp_ancestor_hash$.getDynamicValue(thread), test);
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 31068L)
    public static SubLObject kbp_ancestors(final SubLObject v_object, SubLObject searcher) {
        if (searcher == kb_paths.UNPROVIDED) {
            searcher = kb_paths.$kbp_searcher$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash((SubLObject)ConsesLow.list(v_object, searcher), kb_paths.$kbp_ancestor_hash$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 31198L)
    public static SubLObject kbp_ancestors_via_all(final SubLObject v_object, SubLObject searchers) {
        if (searchers == kb_paths.UNPROVIDED) {
            searchers = kb_paths.$kbp_searchers$.getDynamicValue();
        }
        SubLObject ancestors = (SubLObject)kb_paths.NIL;
        SubLObject cdolist_list_var = searchers;
        SubLObject searcher = (SubLObject)kb_paths.NIL;
        searcher = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            ancestors = conses_high.nunion(ancestors, conses_high.copy_list(kbp_ancestors(v_object, searcher)), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            searcher = cdolist_list_var.first();
        }
        return ancestors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 31440L)
    public static SubLObject kbp_ancestorP(final SubLObject v_object, SubLObject searcher, SubLObject ancestor, SubLObject test) {
        if (searcher == kb_paths.UNPROVIDED) {
            searcher = kb_paths.$kbp_searcher$.getDynamicValue();
        }
        if (ancestor == kb_paths.UNPROVIDED) {
            ancestor = kb_paths.$kbp_ancestor$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQUAL);
        }
        return subl_promotions.memberP(ancestor, kbp_ancestors(v_object, searcher), test, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 31614L)
    public static SubLObject kbp_ancestor_via_anyP(final SubLObject v_object, SubLObject searchers, SubLObject ancestor, SubLObject test) {
        if (searchers == kb_paths.UNPROVIDED) {
            searchers = kb_paths.$kbp_searchers$.getDynamicValue();
        }
        if (ancestor == kb_paths.UNPROVIDED) {
            ancestor = kb_paths.$kbp_ancestor$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQUAL);
        }
        SubLObject ancestorP = (SubLObject)kb_paths.NIL;
        if (kb_paths.NIL == ancestorP) {
            SubLObject csome_list_var;
            SubLObject searcher;
            for (csome_list_var = searchers, searcher = (SubLObject)kb_paths.NIL, searcher = csome_list_var.first(); kb_paths.NIL == ancestorP && kb_paths.NIL != csome_list_var; ancestorP = kbp_ancestorP(v_object, searcher, ancestor, test), csome_list_var = csome_list_var.rest(), searcher = csome_list_var.first()) {}
        }
        return ancestorP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 31888L)
    public static SubLObject kbp_searchedP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash(v_object, kb_paths.$kbp_search_hash$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32015L)
    public static SubLObject kbp_searched_byP(final SubLObject v_object, SubLObject searcher, SubLObject test) {
        if (searcher == kb_paths.UNPROVIDED) {
            searcher = kb_paths.$kbp_searcher$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        return subl_promotions.memberP(searcher, kbp_searched_by(v_object), test, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32157L)
    public static SubLObject kbp_searched_by_allP(final SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == kb_paths.UNPROVIDED) {
            searchers = kb_paths.$kbp_searchers$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        return conses_high.subsetp(searchers, kbp_searched_by(v_object), test, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32306L)
    public static SubLObject kbp_searched_by_anyP(final SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == kb_paths.UNPROVIDED) {
            searchers = kb_paths.$kbp_searchers$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        return list_utilities.intersectP(kbp_searched_by(v_object), searchers, test, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32458L)
    public static SubLObject kbp_searched_by(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash(v_object, kb_paths.$kbp_search_hash$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32536L)
    public static SubLObject kbp_all_searched_by(SubLObject searcher) {
        if (searcher == kb_paths.UNPROVIDED) {
            searcher = kb_paths.$kbp_searcher$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_paths.NIL;
        final SubLObject cdohash_table = kb_paths.$kbp_search_hash$.getDynamicValue(thread);
        SubLObject v_object = (SubLObject)kb_paths.NIL;
        SubLObject searched_by_list = (SubLObject)kb_paths.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                v_object = Hashtables.getEntryKey(cdohash_entry);
                searched_by_list = Hashtables.getEntryValue(cdohash_entry);
                if (kb_paths.NIL != subl_promotions.memberP(searcher, searched_by_list, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(v_object, result);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32770L)
    public static SubLObject kbp_mark_as_searched_by(final SubLObject v_object, SubLObject searcher, SubLObject test) {
        if (searcher == kb_paths.UNPROVIDED) {
            searcher = kb_paths.$kbp_searcher$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.pushnew_hash(v_object, searcher, kb_paths.$kbp_search_hash$.getDynamicValue(thread), test);
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32930L)
    public static SubLObject kbp_mark_as_unsearched_by(final SubLObject v_object, SubLObject searcher, SubLObject test) {
        if (searcher == kb_paths.UNPROVIDED) {
            searcher = kb_paths.$kbp_searcher$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.delete_hash(v_object, searcher, kb_paths.$kbp_search_hash$.getDynamicValue(thread), test, (SubLObject)kb_paths.UNPROVIDED);
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33091L)
    public static SubLObject kbp_mark_as_searched_by_all(final SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == kb_paths.UNPROVIDED) {
            searchers = kb_paths.$kbp_searchers$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.nunion_hash(v_object, conses_high.copy_list(searchers), kb_paths.$kbp_search_hash$.getDynamicValue(thread), test);
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33269L)
    public static SubLObject kbp_mark_as_unsearched_by_all(final SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == kb_paths.UNPROVIDED) {
            searchers = kb_paths.$kbp_searchers$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.nset_difference_hash(v_object, searchers, kb_paths.$kbp_search_hash$.getDynamicValue(thread), test);
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33446L)
    public static SubLObject kbp_mark_all_as_unsearched(final SubLObject objects) {
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = (SubLObject)kb_paths.NIL;
        v_object = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            kbp_mark_as_unsearched(v_object);
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33566L)
    public static SubLObject kbp_mark_as_unsearched(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.sethash(v_object, kb_paths.$kbp_search_hash$.getDynamicValue(thread), (SubLObject)kb_paths.NIL);
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33661L)
    public static SubLObject kbp_all_searched_by_all(SubLObject searchers, SubLObject test) {
        if (searchers == kb_paths.UNPROVIDED) {
            searchers = kb_paths.$kbp_searchers$.getDynamicValue();
        }
        if (test == kb_paths.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_paths.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_paths.NIL;
        final SubLObject cdohash_table = kb_paths.$kbp_search_hash$.getDynamicValue(thread);
        SubLObject v_object = (SubLObject)kb_paths.NIL;
        SubLObject searched_by = (SubLObject)kb_paths.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                v_object = Hashtables.getEntryKey(cdohash_entry);
                searched_by = Hashtables.getEntryValue(cdohash_entry);
                if (kb_paths.NIL != conses_high.subsetp(searchers, searched_by, test, (SubLObject)kb_paths.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(v_object, result);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33910L)
    public static SubLObject bookkeeping_gaf_assertionP(final SubLObject assertion) {
        if (kb_paths.NIL != assertions_high.gaf_assertionP(assertion)) {
            return fort_types_interface.bookkeeping_predicate_p(el_utilities.literal_predicate(assertions_high.gaf_formula(assertion), (SubLObject)kb_paths.UNPROVIDED));
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34104L)
    public static SubLObject kbp_excluded_nodeP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(node, kb_paths.$exclude_nodes$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34179L)
    public static SubLObject kbp_excluded_linkP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(link, kb_paths.$exclude_links$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34254L)
    public static SubLObject kbp_paths_links(final SubLObject paths) {
        SubLObject result = (SubLObject)kb_paths.NIL;
        SubLObject cdolist_list_var = paths;
        SubLObject path = (SubLObject)kb_paths.NIL;
        path = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            final SubLObject item_var = kbp_path_links(path);
            if (kb_paths.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)kb_paths.$sym144$ASSERTIONS_FI_EQUAL_), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            path = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34430L)
    public static SubLObject kbp_path_links(final SubLObject path) {
        if (path.isCons()) {
            SubLObject node = (SubLObject)kb_paths.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(path, path, (SubLObject)kb_paths.$list145);
            node = path.first();
            SubLObject current = path.rest();
            final SubLObject link_path = (SubLObject)(current.isCons() ? current.first() : kb_paths.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, path, (SubLObject)kb_paths.$list145);
            current = current.rest();
            if (kb_paths.NIL == current) {
                if (kb_paths.NIL != link_path) {
                    SubLObject current_$27;
                    final SubLObject datum_$26 = current_$27 = link_path;
                    SubLObject link = (SubLObject)kb_paths.NIL;
                    SubLObject node_path = (SubLObject)kb_paths.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$27, datum_$26, (SubLObject)kb_paths.$list146);
                    link = current_$27.first();
                    current_$27 = current_$27.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$27, datum_$26, (SubLObject)kb_paths.$list146);
                    node_path = current_$27.first();
                    current_$27 = current_$27.rest();
                    if (kb_paths.NIL == current_$27) {
                        return (SubLObject)ConsesLow.cons(link, kbp_path_links(node_path));
                    }
                    cdestructuring_bind.cdestructuring_bind_error(datum_$26, (SubLObject)kb_paths.$list146);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(path, (SubLObject)kb_paths.$list145);
            }
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34685L)
    public static SubLObject kbp_paths_tuples(final SubLObject paths) {
        SubLObject result = (SubLObject)kb_paths.NIL;
        SubLObject cdolist_list_var = paths;
        SubLObject path = (SubLObject)kb_paths.NIL;
        path = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            final SubLObject item_var = kbp_path_tuples(path);
            if (kb_paths.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)kb_paths.EQUAL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            path = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34848L)
    public static SubLObject kbp_path_tuples(final SubLObject path) {
        if (path.isCons()) {
            SubLObject node_1 = (SubLObject)kb_paths.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(path, path, (SubLObject)kb_paths.$list147);
            node_1 = path.first();
            SubLObject current = path.rest();
            final SubLObject link_path_1 = (SubLObject)(current.isCons() ? current.first() : kb_paths.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, path, (SubLObject)kb_paths.$list147);
            current = current.rest();
            if (kb_paths.NIL == current) {
                if (kb_paths.NIL != link_path_1) {
                    SubLObject current_$29;
                    final SubLObject datum_$28 = current_$29 = link_path_1;
                    SubLObject link_1 = (SubLObject)kb_paths.NIL;
                    SubLObject node_path_1 = (SubLObject)kb_paths.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$29, datum_$28, (SubLObject)kb_paths.$list148);
                    link_1 = current_$29.first();
                    current_$29 = current_$29.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$29, datum_$28, (SubLObject)kb_paths.$list148);
                    node_path_1 = current_$29.first();
                    current_$29 = current_$29.rest();
                    if (kb_paths.NIL == current_$29) {
                        if (kb_paths.NIL != node_path_1) {
                            SubLObject current_$30;
                            final SubLObject datum_$29 = current_$30 = node_path_1;
                            SubLObject node_2 = (SubLObject)kb_paths.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)kb_paths.$list149);
                            node_2 = current_$30.first();
                            current_$30 = current_$30.rest();
                            final SubLObject link_path_2 = (SubLObject)(current_$30.isCons() ? current_$30.first() : kb_paths.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(current_$30, datum_$29, (SubLObject)kb_paths.$list149);
                            current_$30 = current_$30.rest();
                            if (kb_paths.NIL == current_$30) {
                                return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(node_1, node_2, link_1), kbp_path_tuples(node_path_1));
                            }
                            cdestructuring_bind.cdestructuring_bind_error(datum_$29, (SubLObject)kb_paths.$list149);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$28, (SubLObject)kb_paths.$list148);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(path, (SubLObject)kb_paths.$list147);
            }
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 35247L)
    public static SubLObject kbp_justs_from_tuples(final SubLObject tuples_sets) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_paths.$sym150$KBP_JUST_FROM_TUPLES), tuples_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 35345L)
    public static SubLObject kbp_just_from_tuples(final SubLObject tuples) {
        return list_utilities.mapappend(Symbols.symbol_function((SubLObject)kb_paths.$sym151$KBP_JUST_FROM_TUPLE), tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 35434L)
    public static SubLObject kbp_just_from_tuple(final SubLObject tuple) {
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 35497L)
    public static SubLObject make_gaf_assertion(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        fi.fi_assert_int(gaf, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        return kb_indexing.find_gaf(gaf, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 35782L)
    public static SubLObject kbp_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == kb_paths.UNPROVIDED) {
            arg1 = (SubLObject)kb_paths.NIL;
        }
        if (arg2 == kb_paths.UNPROVIDED) {
            arg2 = (SubLObject)kb_paths.NIL;
        }
        if (arg3 == kb_paths.UNPROVIDED) {
            arg3 = (SubLObject)kb_paths.NIL;
        }
        if (arg4 == kb_paths.UNPROVIDED) {
            arg4 = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.$kbp_trace_level$.getDynamicValue(thread).numGE(level)) {
            PrintLow.format((SubLObject)kb_paths.T, format_str, new SubLObject[] { arg1, arg2, arg3, arg4 });
            return (SubLObject)kb_paths.NIL;
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 36018L)
    public static SubLObject kbp_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == kb_paths.UNPROVIDED) {
            arg1 = (SubLObject)kb_paths.NIL;
        }
        if (arg2 == kb_paths.UNPROVIDED) {
            arg2 = (SubLObject)kb_paths.NIL;
        }
        if (arg3 == kb_paths.UNPROVIDED) {
            arg3 = (SubLObject)kb_paths.NIL;
        }
        if (arg4 == kb_paths.UNPROVIDED) {
            arg4 = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.$kbp_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror((SubLObject)kb_paths.$str152$continue_anyway, format_str, new SubLObject[] { arg1, arg2, arg3, arg4 });
        }
        else if (Numbers.add((SubLObject)kb_paths.TWO_INTEGER, kb_paths.$kbp_trace_level$.getDynamicValue(thread)).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4 });
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 36281L)
    public static SubLObject kbp_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == kb_paths.UNPROVIDED) {
            arg1 = (SubLObject)kb_paths.NIL;
        }
        if (arg2 == kb_paths.UNPROVIDED) {
            arg2 = (SubLObject)kb_paths.NIL;
        }
        if (arg3 == kb_paths.UNPROVIDED) {
            arg3 = (SubLObject)kb_paths.NIL;
        }
        if (arg4 == kb_paths.UNPROVIDED) {
            arg4 = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.$kbp_trace_level$.getDynamicValue(thread).numGE(level)) {
            Functions.apply((SubLObject)kb_paths.$sym153$WARN, format_str, new SubLObject[] { arg1, arg2, arg3, arg4 });
            return (SubLObject)kb_paths.NIL;
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 36451L)
    public static SubLObject kbp_min_isa_paths(final SubLObject term_1, final SubLObject term_2, SubLObject mt, SubLObject depth_limitP) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        if (depth_limitP == kb_paths.UNPROVIDED) {
            depth_limitP = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject min_isa_ceilings = isa.min_ceiling_isa((SubLObject)ConsesLow.list(term_1, term_2), (SubLObject)kb_paths.NIL, mt, (SubLObject)kb_paths.UNPROVIDED);
        SubLObject paths = (SubLObject)kb_paths.NIL;
        if (kb_paths.NIL != min_isa_ceilings) {
            final SubLObject _prev_bind_0 = kb_paths.$kbp_min_isa_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kb_paths.$kbp_min_genls_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = kb_paths.$kbp_no_bi_scoping_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = kb_paths.$limit_path_depthP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = kb_paths.$kbp_only_gaf_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = kb_paths.$kbp_designated_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = kb_paths.$kbp_designated_preds$.currentBinding(thread);
            final SubLObject _prev_bind_8 = kb_paths.$kbp_designated_node_superiorsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = kb_paths.$kbp_designated_node_superiors$.currentBinding(thread);
            try {
                kb_paths.$kbp_min_isa_pathP$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$kbp_min_genls_pathP$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$kbp_no_bi_scoping_linksP$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$limit_path_depthP$.bind(depth_limitP, thread);
                kb_paths.$kbp_only_gaf_linksP$.bind((SubLObject)kb_paths.T, thread);
                kb_paths.$kbp_designated_predsP$.bind((SubLObject)kb_paths.T, thread);
                kb_paths.$kbp_designated_preds$.bind((SubLObject)kb_paths.$list154, thread);
                kb_paths.$kbp_designated_node_superiorsP$.bind((SubLObject)kb_paths.T, thread);
                kb_paths.$kbp_designated_node_superiors$.bind(min_isa_ceilings, thread);
                paths = kb_paths(term_1, term_2, mt);
            }
            finally {
                kb_paths.$kbp_designated_node_superiors$.rebind(_prev_bind_9, thread);
                kb_paths.$kbp_designated_node_superiorsP$.rebind(_prev_bind_8, thread);
                kb_paths.$kbp_designated_preds$.rebind(_prev_bind_7, thread);
                kb_paths.$kbp_designated_predsP$.rebind(_prev_bind_6, thread);
                kb_paths.$kbp_only_gaf_linksP$.rebind(_prev_bind_5, thread);
                kb_paths.$limit_path_depthP$.rebind(_prev_bind_4, thread);
                kb_paths.$kbp_no_bi_scoping_linksP$.rebind(_prev_bind_3, thread);
                kb_paths.$kbp_min_genls_pathP$.rebind(_prev_bind_2, thread);
                kb_paths.$kbp_min_isa_pathP$.rebind(_prev_bind_0, thread);
            }
        }
        return paths;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 37212L)
    public static SubLObject kbp_min_genls_paths(final SubLObject term_1, final SubLObject term_2, SubLObject mt, SubLObject depth_limitP) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        if (depth_limitP == kb_paths.UNPROVIDED) {
            depth_limitP = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject min_genls_ceilings = genls.min_ceiling_cols((SubLObject)ConsesLow.list(term_1, term_2), (SubLObject)kb_paths.NIL, mt, (SubLObject)kb_paths.UNPROVIDED);
        SubLObject paths = (SubLObject)kb_paths.NIL;
        if (kb_paths.NIL != min_genls_ceilings) {
            final SubLObject _prev_bind_0 = kb_paths.$kbp_min_genls_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kb_paths.$kbp_min_isa_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = kb_paths.$kbp_no_bi_scoping_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = kb_paths.$limit_path_depthP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = kb_paths.$kbp_only_gaf_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = kb_paths.$kbp_designated_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = kb_paths.$kbp_designated_preds$.currentBinding(thread);
            final SubLObject _prev_bind_8 = kb_paths.$kbp_designated_node_superiorsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = kb_paths.$kbp_designated_node_superiors$.currentBinding(thread);
            try {
                kb_paths.$kbp_min_genls_pathP$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$kbp_min_isa_pathP$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$kbp_no_bi_scoping_linksP$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$limit_path_depthP$.bind(depth_limitP, thread);
                kb_paths.$kbp_only_gaf_linksP$.bind((SubLObject)kb_paths.T, thread);
                kb_paths.$kbp_designated_predsP$.bind((SubLObject)kb_paths.T, thread);
                kb_paths.$kbp_designated_preds$.bind((SubLObject)kb_paths.$list155, thread);
                kb_paths.$kbp_designated_node_superiorsP$.bind((SubLObject)kb_paths.T, thread);
                kb_paths.$kbp_designated_node_superiors$.bind(min_genls_ceilings, thread);
                paths = kb_paths(term_1, term_2, mt);
            }
            finally {
                kb_paths.$kbp_designated_node_superiors$.rebind(_prev_bind_9, thread);
                kb_paths.$kbp_designated_node_superiorsP$.rebind(_prev_bind_8, thread);
                kb_paths.$kbp_designated_preds$.rebind(_prev_bind_7, thread);
                kb_paths.$kbp_designated_predsP$.rebind(_prev_bind_6, thread);
                kb_paths.$kbp_only_gaf_linksP$.rebind(_prev_bind_5, thread);
                kb_paths.$limit_path_depthP$.rebind(_prev_bind_4, thread);
                kb_paths.$kbp_no_bi_scoping_linksP$.rebind(_prev_bind_3, thread);
                kb_paths.$kbp_min_isa_pathP$.rebind(_prev_bind_2, thread);
                kb_paths.$kbp_min_genls_pathP$.rebind(_prev_bind_0, thread);
            }
        }
        return paths;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 37884L)
    public static SubLObject kbp_min_genl_mt_paths(final SubLObject term_1, final SubLObject term_2, SubLObject mt, SubLObject depth_limitP) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        if (depth_limitP == kb_paths.UNPROVIDED) {
            depth_limitP = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject min_genl_mts_ceilings = genl_mts.min_ceiling_mts((SubLObject)ConsesLow.list(term_1, term_2), (SubLObject)kb_paths.NIL, mt);
        SubLObject paths = (SubLObject)kb_paths.NIL;
        if (kb_paths.NIL != min_genl_mts_ceilings) {
            final SubLObject _prev_bind_0 = kb_paths.$kbp_min_genls_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kb_paths.$kbp_min_isa_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = kb_paths.$kbp_no_bi_scoping_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = kb_paths.$limit_path_depthP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = kb_paths.$kbp_only_gaf_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = kb_paths.$kbp_designated_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = kb_paths.$kbp_designated_preds$.currentBinding(thread);
            final SubLObject _prev_bind_8 = kb_paths.$kbp_designated_node_superiorsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = kb_paths.$kbp_designated_node_superiors$.currentBinding(thread);
            try {
                kb_paths.$kbp_min_genls_pathP$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$kbp_min_isa_pathP$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$kbp_no_bi_scoping_linksP$.bind((SubLObject)kb_paths.NIL, thread);
                kb_paths.$limit_path_depthP$.bind(depth_limitP, thread);
                kb_paths.$kbp_only_gaf_linksP$.bind((SubLObject)kb_paths.T, thread);
                kb_paths.$kbp_designated_predsP$.bind((SubLObject)kb_paths.T, thread);
                kb_paths.$kbp_designated_preds$.bind((SubLObject)kb_paths.$list156, thread);
                kb_paths.$kbp_designated_node_superiorsP$.bind((SubLObject)kb_paths.T, thread);
                kb_paths.$kbp_designated_node_superiors$.bind(min_genl_mts_ceilings, thread);
                paths = kb_paths(term_1, term_2, mt);
            }
            finally {
                kb_paths.$kbp_designated_node_superiors$.rebind(_prev_bind_9, thread);
                kb_paths.$kbp_designated_node_superiorsP$.rebind(_prev_bind_8, thread);
                kb_paths.$kbp_designated_preds$.rebind(_prev_bind_7, thread);
                kb_paths.$kbp_designated_predsP$.rebind(_prev_bind_6, thread);
                kb_paths.$kbp_only_gaf_linksP$.rebind(_prev_bind_5, thread);
                kb_paths.$limit_path_depthP$.rebind(_prev_bind_4, thread);
                kb_paths.$kbp_no_bi_scoping_linksP$.rebind(_prev_bind_3, thread);
                kb_paths.$kbp_min_isa_pathP$.rebind(_prev_bind_2, thread);
                kb_paths.$kbp_min_genls_pathP$.rebind(_prev_bind_0, thread);
            }
        }
        return paths;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 38783L)
    public static SubLObject explain_cr_pair(final SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paths = (SubLObject)kb_paths.NIL;
        final SubLObject _prev_bind_0 = kb_paths.$max_search_iterations$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_paths.$kbp_only_gaf_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = kb_paths.$kbp_min_isa_pathP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = kb_paths.$kbp_min_genls_pathP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = kb_paths.$kbp_genls_cardinality_delta_bound$.currentBinding(thread);
        final SubLObject _prev_bind_6 = kb_paths.$kbp_explode_natsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = kb_paths.$kbp_quit_with_successP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = kb_paths.$kbp_restricted_predsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = kb_paths.$kbp_no_bi_scoping_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = kb_paths.$kbp_restricted_preds$.currentBinding(thread);
        final SubLObject _prev_bind_11 = kb_paths.$kbp_node_isa_boundP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = kb_paths.$kbp_node_isa_bound$.currentBinding(thread);
        final SubLObject _prev_bind_13 = kb_paths.$kbp_isa_boundP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = kb_paths.$kbp_isa_bound$.currentBinding(thread);
        final SubLObject _prev_bind_15 = kb_paths.$kbp_genl_bound$.currentBinding(thread);
        final SubLObject _prev_bind_16 = kb_paths.$collect_kbp_statsP$.currentBinding(thread);
        final SubLObject _prev_bind_17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_18 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            kb_paths.$max_search_iterations$.bind((SubLObject)kb_paths.TWO_INTEGER, thread);
            kb_paths.$kbp_only_gaf_linksP$.bind((SubLObject)kb_paths.NIL, thread);
            kb_paths.$kbp_min_isa_pathP$.bind((SubLObject)kb_paths.NIL, thread);
            kb_paths.$kbp_min_genls_pathP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_genls_cardinality_delta_bound$.bind((SubLObject)kb_paths.TWENTY_INTEGER, thread);
            kb_paths.$kbp_explode_natsP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_quit_with_successP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_restricted_predsP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_no_bi_scoping_linksP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_restricted_preds$.bind((SubLObject)kb_paths.$list158, thread);
            kb_paths.$kbp_node_isa_boundP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_node_isa_bound$.bind((SubLObject)kb_paths.$list159, thread);
            kb_paths.$kbp_isa_boundP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_isa_bound$.bind((SubLObject)kb_paths.$list160, thread);
            kb_paths.$kbp_genl_bound$.bind((SubLObject)kb_paths.$list161, thread);
            kb_paths.$collect_kbp_statsP$.bind((SubLObject)kb_paths.NIL, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_paths.$sym104$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_paths.$const105$EverythingPSC, thread);
            paths = kb_paths(term1, term2, (SubLObject)kb_paths.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_18, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_17, thread);
            kb_paths.$collect_kbp_statsP$.rebind(_prev_bind_16, thread);
            kb_paths.$kbp_genl_bound$.rebind(_prev_bind_15, thread);
            kb_paths.$kbp_isa_bound$.rebind(_prev_bind_14, thread);
            kb_paths.$kbp_isa_boundP$.rebind(_prev_bind_13, thread);
            kb_paths.$kbp_node_isa_bound$.rebind(_prev_bind_12, thread);
            kb_paths.$kbp_node_isa_boundP$.rebind(_prev_bind_11, thread);
            kb_paths.$kbp_restricted_preds$.rebind(_prev_bind_10, thread);
            kb_paths.$kbp_no_bi_scoping_linksP$.rebind(_prev_bind_9, thread);
            kb_paths.$kbp_restricted_predsP$.rebind(_prev_bind_8, thread);
            kb_paths.$kbp_quit_with_successP$.rebind(_prev_bind_7, thread);
            kb_paths.$kbp_explode_natsP$.rebind(_prev_bind_6, thread);
            kb_paths.$kbp_genls_cardinality_delta_bound$.rebind(_prev_bind_5, thread);
            kb_paths.$kbp_min_genls_pathP$.rebind(_prev_bind_4, thread);
            kb_paths.$kbp_min_isa_pathP$.rebind(_prev_bind_3, thread);
            kb_paths.$kbp_only_gaf_linksP$.rebind(_prev_bind_2, thread);
            kb_paths.$max_search_iterations$.rebind(_prev_bind_0, thread);
        }
        return paths;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 39682L)
    public static SubLObject explain_cr_gafs_via_paths(SubLObject clearP) {
        if (clearP == kb_paths.UNPROVIDED) {
            clearP = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_paths.$max_search_iterations$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_paths.$kbp_only_gaf_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = kb_paths.$kbp_min_isa_pathP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = kb_paths.$kbp_min_genls_pathP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = kb_paths.$kbp_genls_cardinality_delta_bound$.currentBinding(thread);
        final SubLObject _prev_bind_6 = kb_paths.$kbp_explode_natsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = kb_paths.$kbp_quit_with_successP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = kb_paths.$kbp_restricted_predsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = kb_paths.$kbp_no_bi_scoping_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = kb_paths.$kbp_restricted_preds$.currentBinding(thread);
        final SubLObject _prev_bind_11 = kb_paths.$kbp_node_isa_boundP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = kb_paths.$kbp_node_isa_bound$.currentBinding(thread);
        final SubLObject _prev_bind_13 = kb_paths.$kbp_isa_boundP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = kb_paths.$kbp_isa_bound$.currentBinding(thread);
        final SubLObject _prev_bind_15 = kb_paths.$kbp_genl_bound$.currentBinding(thread);
        final SubLObject _prev_bind_16 = kb_paths.$collect_kbp_statsP$.currentBinding(thread);
        try {
            kb_paths.$max_search_iterations$.bind((SubLObject)kb_paths.TWO_INTEGER, thread);
            kb_paths.$kbp_only_gaf_linksP$.bind((SubLObject)kb_paths.NIL, thread);
            kb_paths.$kbp_min_isa_pathP$.bind((SubLObject)kb_paths.NIL, thread);
            kb_paths.$kbp_min_genls_pathP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_genls_cardinality_delta_bound$.bind((SubLObject)kb_paths.TWENTY_INTEGER, thread);
            kb_paths.$kbp_explode_natsP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_quit_with_successP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_restricted_predsP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_no_bi_scoping_linksP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_restricted_preds$.bind((SubLObject)kb_paths.$list158, thread);
            kb_paths.$kbp_node_isa_boundP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_node_isa_bound$.bind((SubLObject)kb_paths.$list162, thread);
            kb_paths.$kbp_isa_boundP$.bind((SubLObject)kb_paths.T, thread);
            kb_paths.$kbp_isa_bound$.bind((SubLObject)kb_paths.$list160, thread);
            kb_paths.$kbp_genl_bound$.bind((SubLObject)kb_paths.$list161, thread);
            kb_paths.$collect_kbp_statsP$.bind((SubLObject)kb_paths.NIL, thread);
            if (kb_paths.NIL != clearP) {
                Hashtables.clrhash(kb_paths.$cr_paths_table$.getDynamicValue(thread));
                kb_paths.$cr_gaf_count$.setDynamicValue((SubLObject)kb_paths.ZERO_INTEGER, thread);
                kb_paths.$cr_explained_count$.setDynamicValue((SubLObject)kb_paths.ZERO_INTEGER, thread);
                kb_paths.$cr_error_count$.setDynamicValue((SubLObject)kb_paths.ZERO_INTEGER, thread);
            }
            final SubLObject _prev_bind_0_$32 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$33 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_paths.$sym104$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(kb_paths.$const105$EverythingPSC, thread);
                kb_mapping.map_predicate_extent_index((SubLObject)kb_paths.$sym163$EXPLAIN_CR_GAF_VIA_PATHS, kb_paths.$const164$conceptuallyRelated, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$33, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$32, thread);
            }
        }
        finally {
            kb_paths.$collect_kbp_statsP$.rebind(_prev_bind_16, thread);
            kb_paths.$kbp_genl_bound$.rebind(_prev_bind_15, thread);
            kb_paths.$kbp_isa_bound$.rebind(_prev_bind_14, thread);
            kb_paths.$kbp_isa_boundP$.rebind(_prev_bind_13, thread);
            kb_paths.$kbp_node_isa_bound$.rebind(_prev_bind_12, thread);
            kb_paths.$kbp_node_isa_boundP$.rebind(_prev_bind_11, thread);
            kb_paths.$kbp_restricted_preds$.rebind(_prev_bind_10, thread);
            kb_paths.$kbp_no_bi_scoping_linksP$.rebind(_prev_bind_9, thread);
            kb_paths.$kbp_restricted_predsP$.rebind(_prev_bind_8, thread);
            kb_paths.$kbp_quit_with_successP$.rebind(_prev_bind_7, thread);
            kb_paths.$kbp_explode_natsP$.rebind(_prev_bind_6, thread);
            kb_paths.$kbp_genls_cardinality_delta_bound$.rebind(_prev_bind_5, thread);
            kb_paths.$kbp_min_genls_pathP$.rebind(_prev_bind_4, thread);
            kb_paths.$kbp_min_isa_pathP$.rebind(_prev_bind_3, thread);
            kb_paths.$kbp_only_gaf_linksP$.rebind(_prev_bind_2, thread);
            kb_paths.$max_search_iterations$.rebind(_prev_bind_0, thread);
        }
        return kb_paths.$cr_paths_table$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 40718L)
    public static SubLObject explain_cr_gaf_via_paths(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_paths.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject id = assertion_handles.assertion_id(assertion);
            final SubLObject pred = assertions_high.gaf_arg0(assertion);
            final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
            final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            SubLObject error_message = (SubLObject)kb_paths.NIL;
            SubLObject paths = (SubLObject)kb_paths.NIL;
            if (pred.eql(kb_paths.$const164$conceptuallyRelated)) {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)kb_paths.$sym165$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            paths = kb_paths(arg1, arg2, (SubLObject)kb_paths.UNPROVIDED);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)kb_paths.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                kb_paths.$cr_gaf_count$.setDynamicValue(Numbers.add(kb_paths.$cr_gaf_count$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
                if (kb_paths.NIL != paths) {
                    paths = transform_list_utilities.quiescent_ntransform(kbp_paths_links(paths), Symbols.symbol_function((SubLObject)kb_paths.$sym166$KB_ASSERTION_), Symbols.symbol_function((SubLObject)kb_paths.$sym167$ASSERTION_FI_FORMULA), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                    Hashtables.sethash(id, kb_paths.$cr_paths_table$.getDynamicValue(thread), paths);
                    print_high.print((SubLObject)ConsesLow.list(arg1, arg2, paths), (SubLObject)kb_paths.UNPROVIDED);
                    kb_paths.$cr_explained_count$.setDynamicValue(Numbers.add(kb_paths.$cr_explained_count$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
                }
                else if (kb_paths.NIL != error_message) {
                    Hashtables.sethash(id, kb_paths.$cr_paths_table$.getDynamicValue(thread), error_message);
                    print_high.print((SubLObject)ConsesLow.list(arg1, arg2, error_message), (SubLObject)kb_paths.UNPROVIDED);
                    kb_paths.$cr_error_count$.setDynamicValue(Numbers.add(kb_paths.$cr_error_count$.getDynamicValue(thread), (SubLObject)kb_paths.ONE_INTEGER), thread);
                }
                else {
                    Hashtables.sethash(id, kb_paths.$cr_paths_table$.getDynamicValue(thread), paths);
                    print_high.print((SubLObject)ConsesLow.list(arg1, arg2, paths), (SubLObject)kb_paths.UNPROVIDED);
                }
            }
            return paths;
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 41603L)
    public static SubLObject cr_paths_status() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)kb_paths.T, (SubLObject)kb_paths.$str168$__cr_gafs_considered___a, kb_paths.$cr_gaf_count$.getDynamicValue(thread));
        PrintLow.format((SubLObject)kb_paths.T, (SubLObject)kb_paths.$str169$__cr_gafs_explained___a, kb_paths.$cr_explained_count$.getDynamicValue(thread));
        PrintLow.format((SubLObject)kb_paths.T, (SubLObject)kb_paths.$str170$__cr_gafs_w_errors___a, kb_paths.$cr_error_count$.getDynamicValue(thread));
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 41814L)
    public static SubLObject evaluate_cr_path(final SubLObject term1, final SubLObject term2, final SubLObject path, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = kb_paths.$const171$InferencePSC;
        }
        SubLObject query = conses_high.nsubst(cycl_variables.gentemp_el_var(fort_name(term1)), term1, conses_high.nsubst(cycl_variables.gentemp_el_var(fort_name(term2)), term2, path, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        if (kb_paths.NIL != list_utilities.singletonP(query)) {
            query = query.first();
        }
        else {
            query = (SubLObject)ConsesLow.cons(kb_paths.$const172$and, query);
        }
        final SubLObject v_bindings = fi.fi_ask_int(query, mt, (SubLObject)kb_paths.T, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        return v_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 42185L)
    public static SubLObject fort_name(final SubLObject fort) {
        if (kb_paths.NIL != constant_handles.constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        if (kb_paths.NIL != nart_handles.nart_p(fort)) {
            return string_utilities.object_to_string(narts_high.nart_el_formula(fort));
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 42335L)
    public static SubLObject fort_nameL(final SubLObject fort1, final SubLObject fort2) {
        return Strings.stringL(fort_name(fort1), fort_name(fort2), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 44522L)
    public static SubLObject assertions_fi_equalP(final SubLObject assertions_1, final SubLObject assertions_2) {
        if (kb_paths.NIL != term.kb_assertionP(assertions_1) && kb_paths.NIL != term.kb_assertionP(assertions_2)) {
            return Equality.equal(assertions_fi_formulae(assertions_1), assertions_fi_formulae(assertions_2));
        }
        if (assertions_1.isCons() && assertions_2.isCons()) {
            return list_utilities.sets_equalP(assertions_1, assertions_2, (SubLObject)kb_paths.UNPROVIDED);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 44890L)
    public static SubLObject assertions_fi_formulae(final SubLObject assertions) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_paths.$sym167$ASSERTION_FI_FORMULA), assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 44987L)
    public static SubLObject focuses(final SubLObject collection, SubLObject focus_bias, SubLObject argnums, SubLObject mt, SubLObject meta_pred_types) {
        if (focus_bias == kb_paths.UNPROVIDED) {
            focus_bias = (SubLObject)kb_paths.$kw173$MIN;
        }
        if (argnums == kb_paths.UNPROVIDED) {
            argnums = (SubLObject)kb_paths.$list14;
        }
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        if (meta_pred_types == kb_paths.UNPROVIDED) {
            meta_pred_types = (SubLObject)kb_paths.$list174;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_paths.NIL;
        final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
        try {
            control_vars.$mapping_answer$.bind((SubLObject)kb_paths.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$36 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kb_paths.NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$36 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$37 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            SubLObject cdolist_list_var = argnums;
                            SubLObject argnum = (SubLObject)kb_paths.NIL;
                            argnum = cdolist_list_var.first();
                            while (kb_paths.NIL != cdolist_list_var) {
                                final SubLObject _prev_bind_0_$37 = control_vars.$mapping_target_arg$.currentBinding(thread);
                                try {
                                    control_vars.$mapping_target_arg$.bind(argnum, thread);
                                    final SubLObject meta_pred_specs = meta_pred_specs(argnum, meta_pred_types);
                                    SubLObject node_var = collection;
                                    final SubLObject deck_type = (SubLObject)kb_paths.$kw177$STACK;
                                    final SubLObject recur_deck = deck.create_deck(deck_type);
                                    final SubLObject _prev_bind_0_$38 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            final SubLObject tv_var = (SubLObject)kb_paths.NIL;
                                            final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind((kb_paths.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kb_paths.NIL != tv_var) ? kb_paths.$sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                                if (kb_paths.NIL != tv_var && kb_paths.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kb_paths.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql((SubLObject)kb_paths.$kw179$ERROR)) {
                                                        sbhl_paranoia.sbhl_error((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                                    }
                                                    else if (pcase_var.eql((SubLObject)kb_paths.$kw182$CERROR)) {
                                                        sbhl_paranoia.sbhl_cerror((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str152$continue_anyway, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                                    }
                                                    else if (pcase_var.eql((SubLObject)kb_paths.$kw183$WARN)) {
                                                        Errors.warn((SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P);
                                                    }
                                                    else {
                                                        Errors.warn((SubLObject)kb_paths.$str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                        Errors.cerror((SubLObject)kb_paths.$str152$continue_anyway, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P);
                                                    }
                                                }
                                                final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$39 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_paths.NIL, thread);
                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), thread);
                                                    if (kb_paths.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kb_paths.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED))) {
                                                        final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$40 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_paths.NIL, thread);
                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)kb_paths.UNPROVIDED);
                                                            while (kb_paths.NIL != node_var) {
                                                                final SubLObject genl = node_var;
                                                                SubLObject cdolist_list_var_$48 = meta_pred_specs;
                                                                SubLObject meta_pred_spec = (SubLObject)kb_paths.NIL;
                                                                meta_pred_spec = cdolist_list_var_$48.first();
                                                                while (kb_paths.NIL != cdolist_list_var_$48) {
                                                                    final SubLObject _prev_bind_0_$42 = control_vars.$mapping_pred$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$41 = control_vars.$mapping_index_arg$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$48 = control_vars.$mapping_gather_arg$.currentBinding(thread);
                                                                    try {
                                                                        control_vars.$mapping_pred$.bind(meta_pred_spec.first(), thread);
                                                                        control_vars.$mapping_index_arg$.bind(conses_high.second(meta_pred_spec), thread);
                                                                        control_vars.$mapping_gather_arg$.bind(conses_high.third(meta_pred_spec), thread);
                                                                        kb_mapping.map_gaf_arg_index((SubLObject)kb_paths.$sym185$GENLS_GATHER_FOCUS_PREDS_COLS, genl, control_vars.$mapping_index_arg$.getDynamicValue(thread), control_vars.$mapping_pred$.getDynamicValue(thread), (SubLObject)kb_paths.$kw186$TRUE, (SubLObject)kb_paths.UNPROVIDED);
                                                                    }
                                                                    finally {
                                                                        control_vars.$mapping_gather_arg$.rebind(_prev_bind_2_$48, thread);
                                                                        control_vars.$mapping_index_arg$.rebind(_prev_bind_1_$41, thread);
                                                                        control_vars.$mapping_pred$.rebind(_prev_bind_0_$42, thread);
                                                                    }
                                                                    cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                                                                    meta_pred_spec = cdolist_list_var_$48.first();
                                                                }
                                                                SubLObject cdolist_list_var_$49;
                                                                final SubLObject accessible_modules = cdolist_list_var_$49 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls));
                                                                SubLObject module_var = (SubLObject)kb_paths.NIL;
                                                                module_var = cdolist_list_var_$49.first();
                                                                while (kb_paths.NIL != cdolist_list_var_$49) {
                                                                    final SubLObject _prev_bind_0_$43 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_paths.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_paths.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                        final SubLObject node = function_terms.naut_to_nart(node_var);
                                                                        if (kb_paths.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED));
                                                                            if (kb_paths.NIL != d_link) {
                                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED));
                                                                                if (kb_paths.NIL != mt_links) {
                                                                                    SubLObject iteration_state;
                                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_paths.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject mt_$55 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (kb_paths.NIL != mt_relevance_macros.relevant_mtP(mt_$55)) {
                                                                                            final SubLObject _prev_bind_0_$44 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$55, thread);
                                                                                                SubLObject iteration_state_$57;
                                                                                                for (iteration_state_$57 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_paths.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$57); iteration_state_$57 = dictionary_contents.do_dictionary_contents_next(iteration_state_$57)) {
                                                                                                    thread.resetMultipleValues();
                                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$57);
                                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (kb_paths.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                        final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                            final SubLObject sol = link_nodes;
                                                                                                            if (kb_paths.NIL != set.set_p(sol)) {
                                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                SubLObject basis_object;
                                                                                                                SubLObject state;
                                                                                                                SubLObject node_vars_link_node;
                                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_paths.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_paths.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                    if (kb_paths.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            else if (sol.isList()) {
                                                                                                                SubLObject csome_list_var = sol;
                                                                                                                SubLObject node_vars_link_node2 = (SubLObject)kb_paths.NIL;
                                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                                while (kb_paths.NIL != csome_list_var) {
                                                                                                                    if (kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                    }
                                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                                }
                                                                                                            }
                                                                                                            else {
                                                                                                                Errors.error((SubLObject)kb_paths.$str187$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                            }
                                                                                                        }
                                                                                                        finally {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$45, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$57);
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$44, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                }
                                                                            }
                                                                            else {
                                                                                sbhl_paranoia.sbhl_error((SubLObject)kb_paths.FIVE_INTEGER, (SubLObject)kb_paths.$str188$attempting_to_bind_direction_link, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                                                            }
                                                                        }
                                                                        else if (kb_paths.NIL != obsolete.cnat_p(node, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                            SubLObject cdolist_list_var_$50;
                                                                            final SubLObject new_list = cdolist_list_var_$50 = ((kb_paths.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED)));
                                                                            SubLObject generating_fn = (SubLObject)kb_paths.NIL;
                                                                            generating_fn = cdolist_list_var_$50.first();
                                                                            while (kb_paths.NIL != cdolist_list_var_$50) {
                                                                                final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                    final SubLObject sol2;
                                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                                    if (kb_paths.NIL != set.set_p(sol2)) {
                                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                        SubLObject basis_object2;
                                                                                        SubLObject state2;
                                                                                        SubLObject node_vars_link_node3;
                                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kb_paths.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kb_paths.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                            if (kb_paths.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol2.isList()) {
                                                                                        SubLObject csome_list_var2 = sol2;
                                                                                        SubLObject node_vars_link_node4 = (SubLObject)kb_paths.NIL;
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                        while (kb_paths.NIL != csome_list_var2) {
                                                                                            if (kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)kb_paths.$str187$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$46, thread);
                                                                                }
                                                                                cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                                                                generating_fn = cdolist_list_var_$50.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$42, thread);
                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$43, thread);
                                                                    }
                                                                    cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                                                    module_var = cdolist_list_var_$49.first();
                                                                }
                                                                node_var = deck.deck_pop(recur_deck);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$47, thread);
                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$40, thread);
                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$41, thread);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_warn((SubLObject)kb_paths.TWO_INTEGER, (SubLObject)kb_paths.$str189$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED)), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                                    }
                                                }
                                                finally {
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$39, thread);
                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$40, thread);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$38, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$39, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_paths.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$38, thread);
                                    }
                                }
                                finally {
                                    control_vars.$mapping_target_arg$.rebind(_prev_bind_0_$37, thread);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                argnum = cdolist_list_var.first();
                            }
                        }
                        finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$37, thread);
                            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$36, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_paths.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$36, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$35, thread);
                }
                final SubLObject cols = list_utilities.remove_duplicate_forts(Mapping.mapcar((SubLObject)kb_paths.$sym190$CAR, control_vars.$mapping_answer$.getDynamicValue(thread)));
                final SubLObject table = Hashtables.make_hash_table(Sequences.length(cols), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                SubLObject focus_data = (SubLObject)kb_paths.NIL;
                SubLObject focus_cols = (SubLObject)kb_paths.NIL;
                SubLObject cdolist_list_var2 = control_vars.$mapping_answer$.getDynamicValue(thread);
                SubLObject colXpred = (SubLObject)kb_paths.NIL;
                colXpred = cdolist_list_var2.first();
                while (kb_paths.NIL != cdolist_list_var2) {
                    SubLObject current;
                    final SubLObject datum = current = colXpred;
                    SubLObject col = (SubLObject)kb_paths.NIL;
                    SubLObject pred = (SubLObject)kb_paths.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_paths.$list191);
                    col = current.first();
                    current = (pred = current.rest());
                    hash_table_utilities.push_hash(col, pred, table);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    colXpred = cdolist_list_var2.first();
                }
                SubLObject col2 = (SubLObject)kb_paths.NIL;
                SubLObject preds = (SubLObject)kb_paths.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        col2 = Hashtables.getEntryKey(cdohash_entry);
                        preds = Hashtables.getEntryValue(cdohash_entry);
                        focus_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(Sequences.length(preds), (SubLObject)ConsesLow.cons(col2, preds)), focus_data);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                focus_cols = (cdolist_list_var2 = candidate_focus_collections(focus_data, focus_bias, (SubLObject)kb_paths.UNPROVIDED));
                SubLObject focus_col = (SubLObject)kb_paths.NIL;
                focus_col = cdolist_list_var2.first();
                while (kb_paths.NIL != cdolist_list_var2) {
                    final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                    final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$43 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kb_paths.NIL, thread);
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$50 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$44 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p2, thread);
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), focus_col, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                SubLObject focus_pred_specs = (SubLObject)kb_paths.NIL;
                                final SubLObject _prev_bind_0_$51 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject _prev_bind_0_$52 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind((SubLObject)kb_paths.T, thread);
                                            SubLObject col3 = (SubLObject)kb_paths.NIL;
                                            SubLObject pred_specs = (SubLObject)kb_paths.NIL;
                                            final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator(table);
                                            try {
                                                while (Hashtables.iteratorHasNext(cdohash_iterator2)) {
                                                    final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry(cdohash_iterator2);
                                                    col3 = Hashtables.getEntryKey(cdohash_entry2);
                                                    pred_specs = Hashtables.getEntryValue(cdohash_entry2);
                                                    if (kb_paths.NIL != sbhl_marking_methods.sbhl_recorded_node_p(col3, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread)) || kb_paths.NIL != genls.genlP(col3, focus_col, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                                                        focus_pred_specs = ConsesLow.nconc(focus_pred_specs, conses_high.copy_list(pred_specs));
                                                    }
                                                }
                                            }
                                            finally {
                                                Hashtables.releaseEntrySetIterator(cdohash_iterator2);
                                            }
                                        }
                                        finally {
                                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0_$52, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_paths.T, thread);
                                            final SubLObject _values3 = Values.getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            Values.restoreValuesFromVector(_values3);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$51, thread);
                                }
                                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(focus_col, Sequences.length(focus_pred_specs), focus_pred_specs), result);
                            }
                            finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$44, thread);
                                sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$50, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_paths.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$43, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$49, thread);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    focus_col = cdolist_list_var2.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
            }
        }
        finally {
            control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(result, (SubLObject)kb_paths.$sym192$_, (SubLObject)kb_paths.$sym193$CADR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 50651L)
    public static SubLObject genls_gather_focus_preds_cols(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject collection = assertions_high.gaf_arg(assertion, control_vars.$mapping_index_arg$.getDynamicValue(thread));
        final SubLObject predicate = assertions_high.gaf_arg(assertion, control_vars.$mapping_gather_arg$.getDynamicValue(thread));
        if (kb_paths.NIL != forts.fort_p(collection) && kb_paths.NIL != forts.fort_p(predicate) && kb_paths.NIL == sbhl_marking_methods.sbhl_recorded_node_p(predicate, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread)) && kb_paths.NIL != fort_types_interface.predicateP(predicate)) {
            control_vars.$mapping_answer$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(collection, (SubLObject)ConsesLow.cons(predicate, control_vars.$mapping_target_arg$.getDynamicValue(thread))), control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(kb_paths.$const194$genlPreds), predicate, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 51164L)
    public static SubLObject remove_genls_of_all(final SubLObject collections, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_paths.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = collections;
            SubLObject col = (SubLObject)kb_paths.NIL;
            col = cdolist_list_var.first();
            while (kb_paths.NIL != cdolist_list_var) {
                if (kb_paths.NIL == genls.all_genlP(col, collections, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(col, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 51530L)
    public static SubLObject remove_common_spec_path(final SubLObject collections, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = Sequences.length(collections);
        final SubLObject table = Hashtables.make_hash_table(count, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        SubLObject result = (SubLObject)kb_paths.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = collections;
            SubLObject col = (SubLObject)kb_paths.NIL;
            col = cdolist_list_var.first();
            while (kb_paths.NIL != cdolist_list_var) {
                SubLObject node_var = col;
                final SubLObject deck_type = (SubLObject)((kb_paths.$kw134$DEPTH == kb_paths.$kw175$BREADTH) ? kb_paths.$kw176$QUEUE : kb_paths.$kw177$STACK);
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)kb_paths.NIL;
                        final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((kb_paths.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kb_paths.NIL != tv_var) ? kb_paths.$sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (kb_paths.NIL != tv_var && kb_paths.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kb_paths.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)kb_paths.$kw179$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)kb_paths.$kw182$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str152$continue_anyway, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)kb_paths.$kw183$WARN)) {
                                    Errors.warn((SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)kb_paths.$str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)kb_paths.$str152$continue_anyway, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_paths.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), thread);
                                if (kb_paths.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kb_paths.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$78 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_paths.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)kb_paths.UNPROVIDED);
                                        while (kb_paths.NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            if (kb_paths.NIL != subl_promotions.memberP(genl, collections, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                                                hash_table_utilities.push_hash(col, genl, table);
                                            }
                                            SubLObject cdolist_list_var_$79;
                                            final SubLObject accessible_modules = cdolist_list_var_$79 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls));
                                            SubLObject module_var = (SubLObject)kb_paths.NIL;
                                            module_var = cdolist_list_var_$79.first();
                                            while (kb_paths.NIL != cdolist_list_var_$79) {
                                                final SubLObject _prev_bind_0_$75 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_paths.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_paths.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (kb_paths.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED));
                                                        if (kb_paths.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED));
                                                            if (kb_paths.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_paths.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$82 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (kb_paths.NIL != mt_relevance_macros.relevant_mtP(mt_$82)) {
                                                                        final SubLObject _prev_bind_0_$76 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$82, thread);
                                                                            SubLObject iteration_state_$84;
                                                                            for (iteration_state_$84 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_paths.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$84); iteration_state_$84 = dictionary_contents.do_dictionary_contents_next(iteration_state_$84)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$84);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (kb_paths.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$77 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (kb_paths.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_paths.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_paths.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kb_paths.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)kb_paths.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (kb_paths.NIL != csome_list_var) {
                                                                                                if (kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kb_paths.$str187$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$77, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$84);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$76, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)kb_paths.FIVE_INTEGER, (SubLObject)kb_paths.$str188$attempting_to_bind_direction_link, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (kb_paths.NIL != obsolete.cnat_p(node, (SubLObject)kb_paths.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$80;
                                                        final SubLObject new_list = cdolist_list_var_$80 = ((kb_paths.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)kb_paths.NIL;
                                                        generating_fn = cdolist_list_var_$80.first();
                                                        while (kb_paths.NIL != cdolist_list_var_$80) {
                                                            final SubLObject _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (kb_paths.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kb_paths.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kb_paths.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (kb_paths.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kb_paths.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)kb_paths.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (kb_paths.NIL != csome_list_var2) {
                                                                        if (kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kb_paths.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)kb_paths.$str187$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$78, thread);
                                                            }
                                                            cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                                                            generating_fn = cdolist_list_var_$80.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$76, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$75, thread);
                                                }
                                                cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                                                module_var = cdolist_list_var_$79.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$78, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$75, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$74, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)kb_paths.TWO_INTEGER, (SubLObject)kb_paths.$str189$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED)), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$74, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$73, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$73, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$72, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$79 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_paths.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$71, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject done_onceP = (SubLObject)kb_paths.NIL;
        SubLObject participants = (SubLObject)kb_paths.NIL;
        SubLObject survivors = (SubLObject)kb_paths.NIL;
        SubLObject dearly_departed = (SubLObject)kb_paths.NIL;
        SubLObject new_count = (SubLObject)kb_paths.NIL;
        participants = (survivors = collections);
        dearly_departed = (SubLObject)kb_paths.NIL;
        new_count = count;
        while (kb_paths.NIL == done_onceP || !survivors.eql(participants)) {
            SubLObject col2 = (SubLObject)kb_paths.NIL;
            SubLObject v_genls = (SubLObject)kb_paths.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    col2 = Hashtables.getEntryKey(cdohash_entry);
                    v_genls = Hashtables.getEntryValue(cdohash_entry);
                    if (new_count.numE(Sequences.length(v_genls))) {
                        dearly_departed = (SubLObject)ConsesLow.cons(col2, dearly_departed);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            done_onceP = (SubLObject)kb_paths.T;
            participants = survivors;
            survivors = list_utilities.set_difference_forts(participants, dearly_departed);
            dearly_departed = (SubLObject)kb_paths.NIL;
            new_count = Sequences.length(survivors);
        }
        result = survivors;
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 52391L)
    public static SubLObject remove_common_spec_path_wrt(final SubLObject references, final SubLObject collections, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        SubLObject result = collections;
        SubLObject cdolist_list_var = references;
        SubLObject reference = (SubLObject)kb_paths.NIL;
        reference = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            final SubLObject relevant = genls.all_genls_among(reference, collections, mt, (SubLObject)kb_paths.UNPROVIDED);
            final SubLObject trimmed = remove_common_spec_path(relevant, mt);
            result = keyhash_utilities.intersect_forts(result, trimmed);
            cdolist_list_var = cdolist_list_var.rest();
            reference = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 52750L)
    public static SubLObject remove_specs_of_all(final SubLObject collections, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_paths.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = collections;
            SubLObject col = (SubLObject)kb_paths.NIL;
            col = cdolist_list_var.first();
            while (kb_paths.NIL != cdolist_list_var) {
                if (kb_paths.NIL == genls.all_specP(col, collections, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(col, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 53076L)
    public static SubLObject remove_common_genl_path(final SubLObject collections, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = Sequences.length(collections);
        final SubLObject table = Hashtables.make_hash_table(count, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        SubLObject result = (SubLObject)kb_paths.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = collections;
            SubLObject col = (SubLObject)kb_paths.NIL;
            col = cdolist_list_var.first();
            while (kb_paths.NIL != cdolist_list_var) {
                SubLObject node_var = col;
                final SubLObject deck_type = (SubLObject)((kb_paths.$kw134$DEPTH == kb_paths.$kw175$BREADTH) ? kb_paths.$kw176$QUEUE : kb_paths.$kw177$STACK);
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$89 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)kb_paths.NIL;
                        final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$91 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((kb_paths.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kb_paths.NIL != tv_var) ? kb_paths.$sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (kb_paths.NIL != tv_var && kb_paths.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kb_paths.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)kb_paths.$kw179$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)kb_paths.$kw182$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str152$continue_anyway, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)kb_paths.$kw183$WARN)) {
                                    Errors.warn((SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)kb_paths.$str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)kb_paths.$str152$continue_anyway, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$91 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$92 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_paths.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), thread);
                                if (kb_paths.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kb_paths.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$92 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$93 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_paths.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)kb_paths.UNPROVIDED);
                                        while (kb_paths.NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            if (kb_paths.NIL != subl_promotions.memberP(genl, collections, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) {
                                                hash_table_utilities.push_hash(genl, col, table);
                                            }
                                            SubLObject cdolist_list_var_$97;
                                            final SubLObject accessible_modules = cdolist_list_var_$97 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls));
                                            SubLObject module_var = (SubLObject)kb_paths.NIL;
                                            module_var = cdolist_list_var_$97.first();
                                            while (kb_paths.NIL != cdolist_list_var_$97) {
                                                final SubLObject _prev_bind_0_$93 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$94 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_paths.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_paths.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (kb_paths.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED));
                                                        if (kb_paths.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED));
                                                            if (kb_paths.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_paths.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$100 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (kb_paths.NIL != mt_relevance_macros.relevant_mtP(mt_$100)) {
                                                                        final SubLObject _prev_bind_0_$94 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$100, thread);
                                                                            SubLObject iteration_state_$102;
                                                                            for (iteration_state_$102 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_paths.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$102); iteration_state_$102 = dictionary_contents.do_dictionary_contents_next(iteration_state_$102)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$102);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (kb_paths.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$95 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (kb_paths.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_paths.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_paths.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kb_paths.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)kb_paths.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (kb_paths.NIL != csome_list_var) {
                                                                                                if (kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kb_paths.$str187$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$95, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$102);
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
                                                            sbhl_paranoia.sbhl_error((SubLObject)kb_paths.FIVE_INTEGER, (SubLObject)kb_paths.$str188$attempting_to_bind_direction_link, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (kb_paths.NIL != obsolete.cnat_p(node, (SubLObject)kb_paths.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$98;
                                                        final SubLObject new_list = cdolist_list_var_$98 = ((kb_paths.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)kb_paths.NIL;
                                                        generating_fn = cdolist_list_var_$98.first();
                                                        while (kb_paths.NIL != cdolist_list_var_$98) {
                                                            final SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (kb_paths.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kb_paths.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kb_paths.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (kb_paths.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kb_paths.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)kb_paths.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (kb_paths.NIL != csome_list_var2) {
                                                                        if (kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kb_paths.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)kb_paths.$str187$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$96, thread);
                                                            }
                                                            cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                                                            generating_fn = cdolist_list_var_$98.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$94, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$93, thread);
                                                }
                                                cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                                                module_var = cdolist_list_var_$97.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$96, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$93, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$92, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)kb_paths.TWO_INTEGER, (SubLObject)kb_paths.$str189$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED)), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$92, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$91, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$91, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$90, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_paths.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$89, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject done_onceP = (SubLObject)kb_paths.NIL;
        SubLObject participants = (SubLObject)kb_paths.NIL;
        SubLObject survivors = (SubLObject)kb_paths.NIL;
        SubLObject dearly_departed = (SubLObject)kb_paths.NIL;
        SubLObject new_count = (SubLObject)kb_paths.NIL;
        participants = (survivors = collections);
        dearly_departed = (SubLObject)kb_paths.NIL;
        new_count = count;
        while (kb_paths.NIL == done_onceP || !survivors.eql(participants)) {
            SubLObject col2 = (SubLObject)kb_paths.NIL;
            SubLObject specs = (SubLObject)kb_paths.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    col2 = Hashtables.getEntryKey(cdohash_entry);
                    specs = Hashtables.getEntryValue(cdohash_entry);
                    if (new_count.numE(Sequences.length(specs))) {
                        dearly_departed = (SubLObject)ConsesLow.cons(col2, dearly_departed);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            done_onceP = (SubLObject)kb_paths.T;
            participants = survivors;
            survivors = list_utilities.set_difference_forts(participants, dearly_departed);
            dearly_departed = (SubLObject)kb_paths.NIL;
            new_count = Sequences.length(survivors);
        }
        result = survivors;
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 53937L)
    public static SubLObject remove_common_genl_path_wrt(final SubLObject references, final SubLObject collections, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        SubLObject result = collections;
        SubLObject cdolist_list_var = references;
        SubLObject reference = (SubLObject)kb_paths.NIL;
        reference = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            final SubLObject relevant = genls.all_specs_among(reference, collections, mt, (SubLObject)kb_paths.UNPROVIDED);
            final SubLObject trimmed = remove_common_genl_path(relevant, mt);
            result = keyhash_utilities.intersect_forts(result, trimmed);
            cdolist_list_var = cdolist_list_var.rest();
            reference = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 54296L)
    public static SubLObject candidate_focus_collections(final SubLObject data, SubLObject focus_bias, SubLObject mt) {
        if (focus_bias == kb_paths.UNPROVIDED) {
            focus_bias = (SubLObject)kb_paths.$kw173$MIN;
        }
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        final SubLObject collections = Mapping.mapcar((SubLObject)kb_paths.$sym193$CADR, data);
        final SubLObject pcase_var = focus_bias;
        if (pcase_var.eql((SubLObject)kb_paths.$kw195$ALL)) {
            return collections;
        }
        if (pcase_var.eql((SubLObject)kb_paths.$kw173$MIN)) {
            return genls.min_cols(remove_common_spec_path(collections, mt), mt, (SubLObject)kb_paths.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)kb_paths.$kw196$MAX)) {
            return genls.max_cols(remove_common_genl_path(collections, mt), mt, (SubLObject)kb_paths.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)kb_paths.$kw197$MID)) {
            return candidate_focus_collections_strategy_middle(collections, mt);
        }
        if (pcase_var.eql((SubLObject)kb_paths.$kw198$EDGE)) {
            return candidate_focus_collections_strategy_edge(collections, mt);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 54782L)
    public static SubLObject candidate_focus_collections_strategy_middle(final SubLObject collections, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        SubLObject result = (SubLObject)kb_paths.NIL;
        SubLObject candidates;
        SubLObject min_cols;
        SubLObject max_cols;
        SubLObject max_mins;
        SubLObject min_maxs;
        for (candidates = (SubLObject)kb_paths.NIL, min_cols = (SubLObject)kb_paths.NIL, max_cols = (SubLObject)kb_paths.NIL, max_mins = (SubLObject)kb_paths.NIL, min_maxs = (SubLObject)kb_paths.NIL, candidates = remove_common_genl_path(remove_common_spec_path(collections, mt), mt), min_cols = genls.min_cols(candidates, mt, (SubLObject)kb_paths.UNPROVIDED), max_cols = genls.max_cols(candidates, mt, (SubLObject)kb_paths.UNPROVIDED), max_mins = conses_high.copy_list(min_cols), min_maxs = conses_high.copy_list(max_cols); kb_paths.NIL != candidates; candidates = list_utilities.set_difference_forts(list_utilities.set_difference_forts(candidates, min_cols), max_cols), min_cols = genls.min_cols(candidates, mt, (SubLObject)kb_paths.UNPROVIDED), max_cols = genls.max_cols(candidates, mt, (SubLObject)kb_paths.UNPROVIDED), max_mins = genls.max_cols(ConsesLow.nconc(max_mins, conses_high.copy_list(min_cols)), mt, (SubLObject)kb_paths.UNPROVIDED), min_maxs = genls.min_cols(ConsesLow.nconc(min_maxs, conses_high.copy_list(max_cols)), mt, (SubLObject)kb_paths.UNPROVIDED)) {}
        result = genls.min_cols(list_utilities.remove_duplicate_forts(ConsesLow.append(max_mins, min_maxs)), mt, (SubLObject)kb_paths.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 55482L)
    public static SubLObject candidate_focus_collections_strategy_edge(final SubLObject collections, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        SubLObject result = (SubLObject)kb_paths.NIL;
        SubLObject current = (SubLObject)kb_paths.NIL;
        SubLObject candidates;
        SubLObject min_cols;
        SubLObject max_cols;
        for (candidates = (SubLObject)kb_paths.NIL, min_cols = (SubLObject)kb_paths.NIL, max_cols = (SubLObject)kb_paths.NIL, candidates = remove_common_genl_path(remove_common_spec_path(collections, mt), mt), min_cols = genls.min_cols(candidates, mt, (SubLObject)kb_paths.UNPROVIDED), max_cols = genls.max_cols(candidates, mt, (SubLObject)kb_paths.UNPROVIDED); kb_paths.NIL != min_cols || kb_paths.NIL != max_cols; min_cols = genls.min_cols(candidates, mt, (SubLObject)kb_paths.UNPROVIDED), max_cols = genls.max_cols(candidates, mt, (SubLObject)kb_paths.UNPROVIDED)) {
            result = ConsesLow.nconc(result, ConsesLow.nconc(conses_high.copy_list(min_cols), conses_high.copy_list(max_cols)));
            current = list_utilities.set_difference_forts(candidates, result);
            candidates = remove_common_genl_path_wrt(max_cols, remove_common_spec_path_wrt(min_cols, current, mt), mt);
        }
        return list_utilities.remove_duplicate_forts(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 56142L)
    public static SubLObject appraise_candidate_focuses(final SubLObject candidates, SubLObject mt) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = Sequences.length(candidates);
        final SubLObject specs_table = Hashtables.make_hash_table(count, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        final SubLObject genls_table = Hashtables.make_hash_table(count, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        SubLObject cdolist_list_var = candidates;
        SubLObject candidate = (SubLObject)kb_paths.NIL;
        candidate = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            SubLObject node_var = candidate;
            final SubLObject deck_type = (SubLObject)((kb_paths.$kw134$DEPTH == kb_paths.$kw175$BREADTH) ? kb_paths.$kw176$QUEUE : kb_paths.$kw177$STACK);
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$107 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = (SubLObject)kb_paths.NIL;
                        final SubLObject _prev_bind_0_$108 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$109 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((kb_paths.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kb_paths.NIL != tv_var) ? kb_paths.$sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (kb_paths.NIL != tv_var && kb_paths.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kb_paths.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)kb_paths.$kw179$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)kb_paths.$kw182$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str152$continue_anyway, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)kb_paths.$kw183$WARN)) {
                                    Errors.warn((SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)kb_paths.$str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)kb_paths.$str152$continue_anyway, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$110 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$112 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_paths.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), thread);
                                if (kb_paths.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kb_paths.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(candidate, sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$110 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$111 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$113 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_paths.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)kb_paths.UNPROVIDED);
                                        while (kb_paths.NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            if (kb_paths.NIL != subl_promotions.memberP(genl, candidates, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED) && !genl.eql(candidate)) {
                                                hash_table_utilities.push_hash(genl, candidate, specs_table);
                                                hash_table_utilities.push_hash(candidate, genl, genls_table);
                                            }
                                            SubLObject cdolist_list_var_$116;
                                            final SubLObject accessible_modules = cdolist_list_var_$116 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls));
                                            SubLObject module_var = (SubLObject)kb_paths.NIL;
                                            module_var = cdolist_list_var_$116.first();
                                            while (kb_paths.NIL != cdolist_list_var_$116) {
                                                final SubLObject _prev_bind_0_$111 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$112 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_paths.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_paths.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (kb_paths.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED));
                                                        if (kb_paths.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED));
                                                            if (kb_paths.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_paths.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$119 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (kb_paths.NIL != mt_relevance_macros.relevant_mtP(mt_$119)) {
                                                                        final SubLObject _prev_bind_0_$112 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$119, thread);
                                                                            SubLObject iteration_state_$121;
                                                                            for (iteration_state_$121 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_paths.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$121); iteration_state_$121 = dictionary_contents.do_dictionary_contents_next(iteration_state_$121)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$121);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (kb_paths.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$113 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (kb_paths.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_paths.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_paths.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kb_paths.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)kb_paths.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (kb_paths.NIL != csome_list_var) {
                                                                                                if (kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kb_paths.$str187$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$113, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$121);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$112, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)kb_paths.FIVE_INTEGER, (SubLObject)kb_paths.$str188$attempting_to_bind_direction_link, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (kb_paths.NIL != obsolete.cnat_p(node, (SubLObject)kb_paths.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$117;
                                                        final SubLObject new_list = cdolist_list_var_$117 = ((kb_paths.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)kb_paths.NIL;
                                                        generating_fn = cdolist_list_var_$117.first();
                                                        while (kb_paths.NIL != cdolist_list_var_$117) {
                                                            final SubLObject _prev_bind_0_$114 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (kb_paths.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kb_paths.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kb_paths.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (kb_paths.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kb_paths.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)kb_paths.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (kb_paths.NIL != csome_list_var2) {
                                                                        if (kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kb_paths.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)kb_paths.$str187$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$114, thread);
                                                            }
                                                            cdolist_list_var_$117 = cdolist_list_var_$117.rest();
                                                            generating_fn = cdolist_list_var_$117.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$112, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$111, thread);
                                                }
                                                cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                                                module_var = cdolist_list_var_$116.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$113, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$111, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$110, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)kb_paths.TWO_INTEGER, (SubLObject)kb_paths.$str189$Node__a_does_not_pass_sbhl_type_t, candidate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED)), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$112, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$110, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$109, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$109, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$108, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$107, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_paths.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        cdolist_list_var = candidates;
        candidate = (SubLObject)kb_paths.NIL;
        candidate = cdolist_list_var.first();
        while (kb_paths.NIL != cdolist_list_var) {
            final SubLObject specs_count = Sequences.length(Hashtables.gethash(candidate, specs_table, (SubLObject)kb_paths.UNPROVIDED));
            final SubLObject genls_count = Sequences.length(Hashtables.gethash(candidate, genls_table, (SubLObject)kb_paths.UNPROVIDED));
            print_high.print((SubLObject)ConsesLow.list(candidate, Numbers.add(specs_count, genls_count), specs_count, genls_count), (SubLObject)kb_paths.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 56823L)
    public static SubLObject genls_focus_min_preds(final SubLObject collection, final SubLObject argnum, SubLObject mt, SubLObject meta_pred_types) {
        if (mt == kb_paths.UNPROVIDED) {
            mt = (SubLObject)kb_paths.NIL;
        }
        if (meta_pred_types == kb_paths.UNPROVIDED) {
            meta_pred_types = (SubLObject)kb_paths.$list199;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_paths.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0_$126 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_1_$127 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kb_paths.NIL, thread);
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$127 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$128 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = control_vars.$mapping_answer$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                        control_vars.$mapping_answer$.bind((SubLObject)kb_paths.NIL, thread);
                        final SubLObject meta_pred_specs = meta_pred_specs(argnum, meta_pred_types);
                        SubLObject node_var = collection;
                        final SubLObject deck_type = (SubLObject)kb_paths.$kw177$STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$128 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = (SubLObject)kb_paths.NIL;
                                final SubLObject _prev_bind_0_$129 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$129 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((kb_paths.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kb_paths.NIL != tv_var) ? kb_paths.$sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (kb_paths.NIL != tv_var && kb_paths.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kb_paths.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)kb_paths.$kw179$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)kb_paths.$kw182$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.$str152$continue_anyway, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)kb_paths.$kw183$WARN)) {
                                            Errors.warn((SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)kb_paths.$str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)kb_paths.$str152$continue_anyway, (SubLObject)kb_paths.$str180$_A_is_not_a__A, tv_var, (SubLObject)kb_paths.$sym181$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$130 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$130 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$135 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_paths.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls), thread);
                                        if (kb_paths.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kb_paths.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$131 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$131 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$136 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_paths.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)kb_paths.UNPROVIDED);
                                                while (kb_paths.NIL != node_var) {
                                                    final SubLObject genl = node_var;
                                                    SubLObject cdolist_list_var = meta_pred_specs;
                                                    SubLObject meta_pred_spec = (SubLObject)kb_paths.NIL;
                                                    meta_pred_spec = cdolist_list_var.first();
                                                    while (kb_paths.NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$132 = control_vars.$mapping_pred$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$132 = control_vars.$mapping_index_arg$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$137 = control_vars.$mapping_gather_arg$.currentBinding(thread);
                                                        try {
                                                            control_vars.$mapping_pred$.bind(meta_pred_spec.first(), thread);
                                                            control_vars.$mapping_index_arg$.bind(conses_high.second(meta_pred_spec), thread);
                                                            control_vars.$mapping_gather_arg$.bind(conses_high.third(meta_pred_spec), thread);
                                                            kb_mapping.map_gaf_arg_index((SubLObject)kb_paths.$sym200$GENLS_GATHER_FOCUS_PREDS_OF, genl, control_vars.$mapping_index_arg$.getDynamicValue(thread), control_vars.$mapping_pred$.getDynamicValue(thread), (SubLObject)kb_paths.$kw186$TRUE, (SubLObject)kb_paths.UNPROVIDED);
                                                        }
                                                        finally {
                                                            control_vars.$mapping_gather_arg$.rebind(_prev_bind_2_$137, thread);
                                                            control_vars.$mapping_index_arg$.rebind(_prev_bind_1_$132, thread);
                                                            control_vars.$mapping_pred$.rebind(_prev_bind_0_$132, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        meta_pred_spec = cdolist_list_var.first();
                                                    }
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kb_paths.$const126$genls));
                                                    SubLObject module_var = (SubLObject)kb_paths.NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (kb_paths.NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$133 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$133 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_paths.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_paths.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                                            if (kb_paths.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED));
                                                                if (kb_paths.NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED));
                                                                    if (kb_paths.NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_paths.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt_$144 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (kb_paths.NIL != mt_relevance_macros.relevant_mtP(mt_$144)) {
                                                                                final SubLObject _prev_bind_0_$134 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$144, thread);
                                                                                    SubLObject iteration_state_$146;
                                                                                    for (iteration_state_$146 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_paths.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$146); iteration_state_$146 = dictionary_contents.do_dictionary_contents_next(iteration_state_$146)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$146);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (kb_paths.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$135 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (kb_paths.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_paths.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_paths.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (kb_paths.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = (SubLObject)kb_paths.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (kb_paths.NIL != csome_list_var) {
                                                                                                        if (kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kb_paths.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)kb_paths.$str187$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$135, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$146);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$134, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)kb_paths.FIVE_INTEGER, (SubLObject)kb_paths.$str188$attempting_to_bind_direction_link, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (kb_paths.NIL != obsolete.cnat_p(node, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$148;
                                                                final SubLObject new_list = cdolist_list_var_$148 = ((kb_paths.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED)));
                                                                SubLObject generating_fn = (SubLObject)kb_paths.NIL;
                                                                generating_fn = cdolist_list_var_$148.first();
                                                                while (kb_paths.NIL != cdolist_list_var_$148) {
                                                                    final SubLObject _prev_bind_0_$136 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                        if (kb_paths.NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kb_paths.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kb_paths.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (kb_paths.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kb_paths.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = (SubLObject)kb_paths.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (kb_paths.NIL != csome_list_var2) {
                                                                                if (kb_paths.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kb_paths.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kb_paths.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)kb_paths.$str187$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$136, thread);
                                                                    }
                                                                    cdolist_list_var_$148 = cdolist_list_var_$148.rest();
                                                                    generating_fn = cdolist_list_var_$148.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$133, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$133, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    }
                                                    node_var = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$136, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$131, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$131, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)kb_paths.TWO_INTEGER, (SubLObject)kb_paths.$str189$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kb_paths.UNPROVIDED)), (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$135, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$130, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$130, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$129, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$129, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$137 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_paths.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$128, thread);
                        }
                        result = control_vars.$mapping_answer$.getDynamicValue(thread);
                    }
                    finally {
                        control_vars.$mapping_answer$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$128, thread);
                        sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$127, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$138 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_paths.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$138, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$127, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$126, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genl_predicates.min_predicates(result, mt, (SubLObject)kb_paths.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 57657L)
    public static SubLObject genls_gather_focus_preds_of(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject collection = assertions_high.gaf_arg(assertion, control_vars.$mapping_index_arg$.getDynamicValue(thread));
        final SubLObject predicate = assertions_high.gaf_arg(assertion, control_vars.$mapping_gather_arg$.getDynamicValue(thread));
        if (kb_paths.NIL != forts.fort_p(collection) && kb_paths.NIL != forts.fort_p(predicate) && kb_paths.NIL == sbhl_marking_methods.sbhl_recorded_node_p(predicate, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread)) && kb_paths.NIL != fort_types_interface.predicateP(predicate)) {
            control_vars.$mapping_answer$.setDynamicValue((SubLObject)ConsesLow.cons(predicate, control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
            print_high.print(assertion, (SubLObject)kb_paths.UNPROVIDED);
            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(kb_paths.$const194$genlPreds), predicate, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED);
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 58143L)
    public static SubLObject meta_pred_specs(final SubLObject argnum, SubLObject meta_pred_types) {
        if (meta_pred_types == kb_paths.UNPROVIDED) {
            meta_pred_types = (SubLObject)kb_paths.$list199;
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    public static SubLObject declare_kb_paths_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kb_paths", "KB-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kb_paths_n", "KB-PATHS-N", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kb_paths_in_all_mts", "KB-PATHS-IN-ALL-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kb_paths_in_just_mt", "KB-PATHS-IN-JUST-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "find_paths", "FIND-PATHS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "complete_paths_home", "COMPLETE-PATHS-HOME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "complete_paths_home_from_link", "COMPLETE-PATHS-HOME-FROM-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "complete_paths_home_from_node", "COMPLETE-PATHS-HOME-FROM-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "extract_paths", "EXTRACT-PATHS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_result", "KBP-RESULT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_result_links", "KBP-RESULT-LINKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_result_paths", "KBP-RESULT-PATHS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "linearize_lattice", "LINEARIZE-LATTICE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "gather_node_lattice", "GATHER-NODE-LATTICE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "gather_link_lattice", "GATHER-LINK-LATTICE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_neighbors_among", "KBP-NEIGHBORS-AMONG", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_node_links", "KBP-NODE-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_link_nodes", "KBP-LINK-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_connecting_links", "KBP-CONNECTING-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_node_neighbors", "KBP-NODE-NEIGHBORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_legal_linkP", "KBP-LEGAL-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_legal_nodeP", "KBP-LEGAL-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "ancestor_linkP", "ANCESTOR-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "ancestor_nodeP", "ANCESTOR-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_under_limit", "KBP-UNDER-LIMIT", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "mark_next_horizon", "MARK-NEXT-HORIZON", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "default_link_op", "DEFAULT-LINK-OP", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "default_node_op", "DEFAULT-NODE-OP", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "do_link_nodes", "DO-LINK-NODES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "default_relevant_linkP", "DEFAULT-RELEVANT-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "default_relevant_nodeP", "DEFAULT-RELEVANT-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_beyond_genls_cardinality_delta_boundP", "KBP-BEYOND-GENLS-CARDINALITY-DELTA-BOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_beyond_genl_boundP", "KBP-BEYOND-GENL-BOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_beyond_isa_boundP", "KBP-BEYOND-ISA-BOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_undesignated_node_superiorP", "KBP-UNDESIGNATED-NODE-SUPERIOR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_node_restricted_as_argP", "KBP-NODE-RESTRICTED-AS-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_node_beyond_isa_boundP", "KBP-NODE-BEYOND-ISA-BOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_gaf_term_beyond_boundP", "KBP-GAF-TERM-BEYOND-BOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_undesignated_pred_assertionP", "KBP-UNDESIGNATED-PRED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_restricted_pred_assertionP", "KBP-RESTRICTED-PRED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_restricted_mt_assertionP", "KBP-RESTRICTED-MT-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_link_terms_beyond_reference_set_boundP", "KBP-LINK-TERMS-BEYOND-REFERENCE-SET-BOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_link_terms_wXo_referencesP", "KBP-LINK-TERMS-W/O-REFERENCES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_link_satisfies_external_predP", "KBP-LINK-SATISFIES-EXTERNAL-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_link_term_beyond_boundP", "KBP-LINK-TERM-BEYOND-BOUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_link_wXo_max_mtP", "KBP-LINK-W/O-MAX-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_bi_scoping_linkP", "KBP-BI-SCOPING-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_bi_scoping_link_1P", "KBP-BI-SCOPING-LINK-1?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_bi_scoping_nodeP", "KBP-BI-SCOPING-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_bi_scoping_node_1P", "KBP-BI-SCOPING-NODE-1?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "scope_direction", "SCOPE-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "default_relevant_link_treeP", "DEFAULT-RELEVANT-LINK-TREE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "do_if_term_assertions", "DO-IF-TERM-ASSERTIONS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "obsolete_tree_do_if", "OBSOLETE-TREE-DO-IF", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "assertion_indexed_by", "ASSERTION-INDEXED-BY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "all_assertion_terms", "ALL-ASSERTION-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "all_assertion_references", "ALL-ASSERTION-REFERENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "clear_kb_paths", "CLEAR-KB-PATHS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_stats", "KBP-STATS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_node_count", "KBP-NODE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_link_count", "KBP-LINK-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_searched_object_count", "KBP-SEARCHED-OBJECT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "next_iteration", "NEXT-ITERATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_give_upP", "KBP-GIVE-UP?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_exhaustedP", "KBP-EXHAUSTED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_iteration_bound_metP", "KBP-ITERATION-BOUND-MET?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_term_bound_metP", "KBP-TERM-BOUND-MET?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "paths_link_count", "PATHS-LINK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_searcherP", "KBP-SEARCHER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "equal_nodesP", "EQUAL-NODES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "instance_btreeP", "INSTANCE-BTREE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "bookkeeping_btreeP", "BOOKKEEPING-BTREE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_record_ancestor", "KBP-RECORD-ANCESTOR", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_ancestors", "KBP-ANCESTORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_ancestors_via_all", "KBP-ANCESTORS-VIA-ALL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_ancestorP", "KBP-ANCESTOR?", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_ancestor_via_anyP", "KBP-ANCESTOR-VIA-ANY?", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_searchedP", "KBP-SEARCHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_searched_byP", "KBP-SEARCHED-BY?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_searched_by_allP", "KBP-SEARCHED-BY-ALL?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_searched_by_anyP", "KBP-SEARCHED-BY-ANY?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_searched_by", "KBP-SEARCHED-BY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_all_searched_by", "KBP-ALL-SEARCHED-BY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_mark_as_searched_by", "KBP-MARK-AS-SEARCHED-BY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_mark_as_unsearched_by", "KBP-MARK-AS-UNSEARCHED-BY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_mark_as_searched_by_all", "KBP-MARK-AS-SEARCHED-BY-ALL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_mark_as_unsearched_by_all", "KBP-MARK-AS-UNSEARCHED-BY-ALL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_mark_all_as_unsearched", "KBP-MARK-ALL-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_mark_as_unsearched", "KBP-MARK-AS-UNSEARCHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_all_searched_by_all", "KBP-ALL-SEARCHED-BY-ALL", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "bookkeeping_gaf_assertionP", "BOOKKEEPING-GAF-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_excluded_nodeP", "KBP-EXCLUDED-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_excluded_linkP", "KBP-EXCLUDED-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_paths_links", "KBP-PATHS-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_path_links", "KBP-PATH-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_paths_tuples", "KBP-PATHS-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_path_tuples", "KBP-PATH-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_justs_from_tuples", "KBP-JUSTS-FROM-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_just_from_tuples", "KBP-JUST-FROM-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_just_from_tuple", "KBP-JUST-FROM-TUPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "make_gaf_assertion", "MAKE-GAF-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_note", "KBP-NOTE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_error", "KBP-ERROR", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_warn", "KBP-WARN", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_min_isa_paths", "KBP-MIN-ISA-PATHS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_min_genls_paths", "KBP-MIN-GENLS-PATHS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "kbp_min_genl_mt_paths", "KBP-MIN-GENL-MT-PATHS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "explain_cr_pair", "EXPLAIN-CR-PAIR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "explain_cr_gafs_via_paths", "EXPLAIN-CR-GAFS-VIA-PATHS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "explain_cr_gaf_via_paths", "EXPLAIN-CR-GAF-VIA-PATHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "cr_paths_status", "CR-PATHS-STATUS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "evaluate_cr_path", "EVALUATE-CR-PATH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "fort_name", "FORT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "fort_nameL", "FORT-NAME<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "assertions_fi_equalP", "ASSERTIONS-FI-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "assertions_fi_formulae", "ASSERTIONS-FI-FORMULAE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "focuses", "FOCUSES", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "genls_gather_focus_preds_cols", "GENLS-GATHER-FOCUS-PREDS-COLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "remove_genls_of_all", "REMOVE-GENLS-OF-ALL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "remove_common_spec_path", "REMOVE-COMMON-SPEC-PATH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "remove_common_spec_path_wrt", "REMOVE-COMMON-SPEC-PATH-WRT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "remove_specs_of_all", "REMOVE-SPECS-OF-ALL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "remove_common_genl_path", "REMOVE-COMMON-GENL-PATH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "remove_common_genl_path_wrt", "REMOVE-COMMON-GENL-PATH-WRT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "candidate_focus_collections", "CANDIDATE-FOCUS-COLLECTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "candidate_focus_collections_strategy_middle", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-MIDDLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "candidate_focus_collections_strategy_edge", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-EDGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "appraise_candidate_focuses", "APPRAISE-CANDIDATE-FOCUSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "genls_focus_min_preds", "GENLS-FOCUS-MIN-PREDS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "genls_gather_focus_preds_of", "GENLS-GATHER-FOCUS-PREDS-OF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_paths", "meta_pred_specs", "META-PRED-SPECS", 1, 1, false);
        return (SubLObject)kb_paths.NIL;
    }
    
    public static SubLObject init_kb_paths_file() {
        kb_paths.$kbp_quitP$ = SubLFiles.defparameter("*KBP-QUIT?*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_result_format$ = SubLFiles.defparameter("*KBP-RESULT-FORMAT*", (SubLObject)kb_paths.$kw1$PATHS);
        kb_paths.$search_iteration$ = SubLFiles.defparameter("*SEARCH-ITERATION*", (SubLObject)kb_paths.NIL);
        kb_paths.$node_equalP$ = SubLFiles.defparameter("*NODE-EQUAL?*", Symbols.symbol_function((SubLObject)kb_paths.EQL));
        kb_paths.$kbp_nodeP$ = SubLFiles.defparameter("*KBP-NODE?*", Symbols.symbol_function((SubLObject)kb_paths.$sym5$FORT_P));
        kb_paths.$kbp_linkP$ = SubLFiles.defparameter("*KBP-LINK?*", Symbols.symbol_function((SubLObject)kb_paths.$sym7$ASSERTION_P));
        kb_paths.$kbp_stats$ = SubLFiles.defparameter("*KBP-STATS*", (SubLObject)kb_paths.NIL);
        kb_paths.$collect_kbp_statsP$ = SubLFiles.defparameter("*COLLECT-KBP-STATS?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_node_count$ = SubLFiles.defparameter("*KBP-NODE-COUNT*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_link_count$ = SubLFiles.defparameter("*KBP-LINK-COUNT*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_term_count$ = SubLFiles.defparameter("*KBP-TERM-COUNT*", (SubLObject)kb_paths.NIL);
        kb_paths.$source_term_args$ = SubLFiles.defparameter("*SOURCE-TERM-ARGS*", (SubLObject)kb_paths.$list14);
        kb_paths.$target_term_args$ = SubLFiles.defparameter("*TARGET-TERM-ARGS*", (SubLObject)kb_paths.$list16);
        kb_paths.$relevant_node_treeP$ = SubLFiles.defparameter("*RELEVANT-NODE-TREE?*", Symbols.symbol_function((SubLObject)kb_paths.IDENTITY));
        kb_paths.$path_source$ = SubLFiles.defparameter("*PATH-SOURCE*", (SubLObject)kb_paths.NIL);
        kb_paths.$path_target$ = SubLFiles.defparameter("*PATH-TARGET*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_searcher$ = SubLFiles.defparameter("*KBP-SEARCHER*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_searchers$ = SubLFiles.defparameter("*KBP-SEARCHERS*", (SubLObject)kb_paths.NIL);
        kb_paths.$path_horizon$ = SubLFiles.defparameter("*PATH-HORIZON*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_common_nodes$ = SubLFiles.defparameter("*KBP-COMMON-NODES*", (SubLObject)kb_paths.NIL);
        kb_paths.$path_link_lattice$ = SubLFiles.defparameter("*PATH-LINK-LATTICE*", (SubLObject)kb_paths.NIL);
        kb_paths.$path_node_lattice$ = SubLFiles.defparameter("*PATH-NODE-LATTICE*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_ancestor$ = SubLFiles.defparameter("*KBP-ANCESTOR*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_run_time$ = SubLFiles.defparameter("*KBP-RUN-TIME*", (SubLObject)kb_paths.NIL);
        kb_paths.$node_ancestors$ = SubLFiles.defparameter("*NODE-ANCESTORS*", (SubLObject)kb_paths.NIL);
        kb_paths.$link_ancestors$ = SubLFiles.defparameter("*LINK-ANCESTORS*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_depth$ = SubLFiles.defparameter("*KBP-DEPTH*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_nodes$ = SubLFiles.defparameter("*KBP-NODES*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_links$ = SubLFiles.defparameter("*KBP-LINKS*", (SubLObject)kb_paths.NIL);
        kb_paths.$term_arg$ = SubLFiles.defparameter("*TERM-ARG*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_ancestor_hash$ = SubLFiles.defparameter("*KBP-ANCESTOR-HASH*", Hashtables.make_hash_table((SubLObject)kb_paths.$int35$2048, Symbols.symbol_function((SubLObject)kb_paths.EQUAL), (SubLObject)kb_paths.UNPROVIDED));
        kb_paths.$kbp_search_hash$ = SubLFiles.defparameter("*KBP-SEARCH-HASH*", Hashtables.make_hash_table((SubLObject)kb_paths.$int35$2048, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED));
        kb_paths.$kbp_min_isa_pathP$ = SubLFiles.defparameter("*KBP-MIN-ISA-PATH?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_min_genls_pathP$ = SubLFiles.defparameter("*KBP-MIN-GENLS-PATH?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_designated_node_superiorsP$ = SubLFiles.defparameter("*KBP-DESIGNATED-NODE-SUPERIORS?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_designated_node_superiors$ = SubLFiles.defparameter("*KBP-DESIGNATED-NODE-SUPERIORS*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_trace_level$ = SubLFiles.defparameter("*KBP-TRACE-LEVEL*", (SubLObject)kb_paths.ZERO_INTEGER);
        kb_paths.$max_search_iterations$ = SubLFiles.defparameter("*MAX-SEARCH-ITERATIONS*", (SubLObject)kb_paths.FIVE_INTEGER);
        kb_paths.$limit_path_depthP$ = SubLFiles.defparameter("*LIMIT-PATH-DEPTH?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_max_depth$ = SubLFiles.defparameter("*KBP-MAX-DEPTH*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_max_term_count$ = SubLFiles.defparameter("*KBP-MAX-TERM-COUNT*", (SubLObject)kb_paths.$int46$1000);
        kb_paths.$kbp_quit_with_successP$ = SubLFiles.defparameter("*KBP-QUIT-WITH-SUCCESS?*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_only_gaf_linksP$ = SubLFiles.defparameter("*KBP-ONLY-GAF-LINKS?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_no_bookkeeping_linksP$ = SubLFiles.defparameter("*KBP-NO-BOOKKEEPING-LINKS?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_no_instance_linksP$ = SubLFiles.defparameter("*KBP-NO-INSTANCE-LINKS?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_no_bi_scoping_linksP$ = SubLFiles.defparameter("*KBP-NO-BI-SCOPING-LINKS?*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_explode_natsP$ = SubLFiles.defparameter("*KBP-EXPLODE-NATS?*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_designated_predsP$ = SubLFiles.defparameter("*KBP-DESIGNATED-PREDS?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_designated_preds$ = SubLFiles.defparameter("*KBP-DESIGNATED-PREDS*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_restricted_predsP$ = SubLFiles.defparameter("*KBP-RESTRICTED-PREDS?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_restricted_preds$ = SubLFiles.defparameter("*KBP-RESTRICTED-PREDS*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_restricted_mtsP$ = SubLFiles.defparameter("*KBP-RESTRICTED-MTS?*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_restricted_mts$ = SubLFiles.defparameter("*KBP-RESTRICTED-MTS*", (SubLObject)kb_paths.$list59);
        kb_paths.$kbp_external_link_predP$ = SubLFiles.defparameter("*KBP-EXTERNAL-LINK-PRED?*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_external_link_pred$ = SubLFiles.defparameter("*KBP-EXTERNAL-LINK-PRED*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_genl_boundP$ = SubLFiles.defparameter("*KBP-GENL-BOUND?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_genl_bound$ = SubLFiles.defparameter("*KBP-GENL-BOUND*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_genls_cardinality_delta_boundP$ = SubLFiles.defparameter("*KBP-GENLS-CARDINALITY-DELTA-BOUND?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_genls_cardinality_delta_bound$ = SubLFiles.defparameter("*KBP-GENLS-CARDINALITY-DELTA-BOUND*", (SubLObject)kb_paths.TWENTY_INTEGER);
        kb_paths.$kbp_isa_boundP$ = SubLFiles.defparameter("*KBP-ISA-BOUND?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_isa_bound$ = SubLFiles.defparameter("*KBP-ISA-BOUND*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_node_isa_boundP$ = SubLFiles.defparameter("*KBP-NODE-ISA-BOUND?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_node_isa_bound$ = SubLFiles.defparameter("*KBP-NODE-ISA-BOUND*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_restricted_nodes_as_argP$ = SubLFiles.defparameter("*KBP-RESTRICTED-NODES-AS-ARG?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_restricted_nodes_as_arg$ = SubLFiles.defparameter("*KBP-RESTRICTED-NODES-AS-ARG*", (SubLObject)kb_paths.$list72);
        kb_paths.$kbp_link_reference_set_boundP$ = SubLFiles.defparameter("*KBP-LINK-REFERENCE-SET-BOUND?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_link_reference_set_bound$ = SubLFiles.defparameter("*KBP-LINK-REFERENCE-SET-BOUND*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_designated_link_referencesP$ = SubLFiles.defparameter("*KBP-DESIGNATED-LINK-REFERENCES?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_designated_link_references$ = SubLFiles.defparameter("*KBP-DESIGNATED-LINK-REFERENCES*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_bound_gaf_termsP$ = SubLFiles.defparameter("*KBP-BOUND-GAF-TERMS?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_bound_gaf_terms$ = SubLFiles.defparameter("*KBP-BOUND-GAF-TERMS*", (SubLObject)kb_paths.$list79);
        kb_paths.$kbp_bound_link_termsP$ = SubLFiles.defparameter("*KBP-BOUND-LINK-TERMS?*", (SubLObject)kb_paths.T);
        kb_paths.$kbp_bound_link_terms$ = SubLFiles.defparameter("*KBP-BOUND-LINK-TERMS*", (SubLObject)kb_paths.NIL);
        kb_paths.$kbp_use_max_mtsP$ = SubLFiles.defparameter("*KBP-USE-MAX-MTS?*", (SubLObject)kb_paths.NIL);
        kb_paths.$nodes_accessor_fn$ = SubLFiles.defparameter("*NODES-ACCESSOR-FN*", (SubLObject)kb_paths.NIL);
        kb_paths.$path_link_op$ = SubLFiles.defparameter("*PATH-LINK-OP*", (SubLObject)kb_paths.NIL);
        kb_paths.$path_node_op$ = SubLFiles.defparameter("*PATH-NODE-OP*", (SubLObject)kb_paths.NIL);
        kb_paths.$relevant_linkP$ = SubLFiles.defparameter("*RELEVANT-LINK?*", (SubLObject)kb_paths.NIL);
        kb_paths.$relevant_nodeP$ = SubLFiles.defparameter("*RELEVANT-NODE?*", (SubLObject)kb_paths.NIL);
        kb_paths.$relevant_link_treeP$ = SubLFiles.defparameter("*RELEVANT-LINK-TREE?*", (SubLObject)kb_paths.NIL);
        kb_paths.$exclude_nodes$ = SubLFiles.defparameter("*EXCLUDE-NODES*", (SubLObject)kb_paths.NIL);
        kb_paths.$exclude_links$ = SubLFiles.defparameter("*EXCLUDE-LINKS*", (SubLObject)kb_paths.NIL);
        kb_paths.$cr_paths_table$ = SubLFiles.defparameter("*CR-PATHS-TABLE*", Hashtables.make_hash_table((SubLObject)kb_paths.$int157$1024, (SubLObject)kb_paths.UNPROVIDED, (SubLObject)kb_paths.UNPROVIDED));
        kb_paths.$cr_gaf_count$ = SubLFiles.defparameter("*CR-GAF-COUNT*", (SubLObject)kb_paths.ZERO_INTEGER);
        kb_paths.$cr_explained_count$ = SubLFiles.defparameter("*CR-EXPLAINED-COUNT*", (SubLObject)kb_paths.ZERO_INTEGER);
        kb_paths.$cr_error_count$ = SubLFiles.defparameter("*CR-ERROR-COUNT*", (SubLObject)kb_paths.ZERO_INTEGER);
        return (SubLObject)kb_paths.NIL;
    }
    
    public static SubLObject setup_kb_paths_file() {
        SubLObject item_var = (SubLObject)kb_paths.$sym0$_KBP_QUIT__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym2$_KBP_RESULT_FORMAT_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym3$_SEARCH_ITERATION_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym4$_NODE_EQUAL__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym6$_KBP_NODE__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym8$_KBP_LINK__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym9$_KBP_STATS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym10$_COLLECT_KBP_STATS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym11$_KBP_NODE_COUNT_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym12$_KBP_LINK_COUNT_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym13$_KBP_TERM_COUNT_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym15$_SOURCE_TERM_ARGS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym17$_TARGET_TERM_ARGS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym18$_RELEVANT_NODE_TREE__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym19$_PATH_SOURCE_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym20$_PATH_TARGET_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym21$_KBP_SEARCHER_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym22$_KBP_SEARCHERS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym23$_PATH_HORIZON_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym24$_KBP_COMMON_NODES_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym25$_PATH_LINK_LATTICE_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym26$_PATH_NODE_LATTICE_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym27$_KBP_ANCESTOR_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym28$_KBP_RUN_TIME_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym29$_NODE_ANCESTORS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym30$_LINK_ANCESTORS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym31$_KBP_DEPTH_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym32$_KBP_NODES_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym33$_KBP_LINKS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym34$_TERM_ARG_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym36$_KBP_ANCESTOR_HASH_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym37$_KBP_SEARCH_HASH_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym38$_KBP_MIN_ISA_PATH__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym39$_KBP_MIN_GENLS_PATH__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym40$_KBP_DESIGNATED_NODE_SUPERIORS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym41$_KBP_DESIGNATED_NODE_SUPERIORS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym42$_KBP_TRACE_LEVEL_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym43$_MAX_SEARCH_ITERATIONS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym44$_LIMIT_PATH_DEPTH__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym45$_KBP_MAX_DEPTH_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym47$_KBP_MAX_TERM_COUNT_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym48$_KBP_QUIT_WITH_SUCCESS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym49$_KBP_ONLY_GAF_LINKS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym50$_KBP_NO_BOOKKEEPING_LINKS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym51$_KBP_NO_INSTANCE_LINKS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym52$_KBP_NO_BI_SCOPING_LINKS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym53$_KBP_EXPLODE_NATS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym54$_KBP_DESIGNATED_PREDS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym55$_KBP_DESIGNATED_PREDS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym56$_KBP_RESTRICTED_PREDS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym57$_KBP_RESTRICTED_PREDS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym58$_KBP_RESTRICTED_MTS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym60$_KBP_RESTRICTED_MTS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym61$_KBP_EXTERNAL_LINK_PRED__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym62$_KBP_EXTERNAL_LINK_PRED_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym63$_KBP_GENL_BOUND__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym64$_KBP_GENL_BOUND_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym65$_KBP_GENLS_CARDINALITY_DELTA_BOUND__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym66$_KBP_GENLS_CARDINALITY_DELTA_BOUND_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym67$_KBP_ISA_BOUND__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym68$_KBP_ISA_BOUND_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym69$_KBP_NODE_ISA_BOUND__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym70$_KBP_NODE_ISA_BOUND_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym71$_KBP_RESTRICTED_NODES_AS_ARG__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym73$_KBP_RESTRICTED_NODES_AS_ARG_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym74$_KBP_LINK_REFERENCE_SET_BOUND__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym75$_KBP_LINK_REFERENCE_SET_BOUND_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym76$_KBP_DESIGNATED_LINK_REFERENCES__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym77$_KBP_DESIGNATED_LINK_REFERENCES_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym78$_KBP_BOUND_GAF_TERMS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym80$_KBP_BOUND_GAF_TERMS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym81$_KBP_BOUND_LINK_TERMS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym82$_KBP_BOUND_LINK_TERMS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym83$_KBP_USE_MAX_MTS__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym84$_NODES_ACCESSOR_FN_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym85$_PATH_LINK_OP_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym86$_PATH_NODE_OP_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym87$_RELEVANT_LINK__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym88$_RELEVANT_NODE__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym89$_RELEVANT_LINK_TREE__;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym90$_EXCLUDE_NODES_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)kb_paths.$sym91$_EXCLUDE_LINKS_;
        if (kb_paths.NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_paths.EQL), Symbols.symbol_function((SubLObject)kb_paths.IDENTITY))) {
            utilities_macros.$kbp_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
        }
        return (SubLObject)kb_paths.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kb_paths_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kb_paths_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kb_paths_file();
    }
    
    static {
        me = (SubLFile)new kb_paths();
        kb_paths.$kbp_quitP$ = null;
        kb_paths.$kbp_result_format$ = null;
        kb_paths.$search_iteration$ = null;
        kb_paths.$node_equalP$ = null;
        kb_paths.$kbp_nodeP$ = null;
        kb_paths.$kbp_linkP$ = null;
        kb_paths.$kbp_stats$ = null;
        kb_paths.$collect_kbp_statsP$ = null;
        kb_paths.$kbp_node_count$ = null;
        kb_paths.$kbp_link_count$ = null;
        kb_paths.$kbp_term_count$ = null;
        kb_paths.$source_term_args$ = null;
        kb_paths.$target_term_args$ = null;
        kb_paths.$relevant_node_treeP$ = null;
        kb_paths.$path_source$ = null;
        kb_paths.$path_target$ = null;
        kb_paths.$kbp_searcher$ = null;
        kb_paths.$kbp_searchers$ = null;
        kb_paths.$path_horizon$ = null;
        kb_paths.$kbp_common_nodes$ = null;
        kb_paths.$path_link_lattice$ = null;
        kb_paths.$path_node_lattice$ = null;
        kb_paths.$kbp_ancestor$ = null;
        kb_paths.$kbp_run_time$ = null;
        kb_paths.$node_ancestors$ = null;
        kb_paths.$link_ancestors$ = null;
        kb_paths.$kbp_depth$ = null;
        kb_paths.$kbp_nodes$ = null;
        kb_paths.$kbp_links$ = null;
        kb_paths.$term_arg$ = null;
        kb_paths.$kbp_ancestor_hash$ = null;
        kb_paths.$kbp_search_hash$ = null;
        kb_paths.$kbp_min_isa_pathP$ = null;
        kb_paths.$kbp_min_genls_pathP$ = null;
        kb_paths.$kbp_designated_node_superiorsP$ = null;
        kb_paths.$kbp_designated_node_superiors$ = null;
        kb_paths.$kbp_trace_level$ = null;
        kb_paths.$max_search_iterations$ = null;
        kb_paths.$limit_path_depthP$ = null;
        kb_paths.$kbp_max_depth$ = null;
        kb_paths.$kbp_max_term_count$ = null;
        kb_paths.$kbp_quit_with_successP$ = null;
        kb_paths.$kbp_only_gaf_linksP$ = null;
        kb_paths.$kbp_no_bookkeeping_linksP$ = null;
        kb_paths.$kbp_no_instance_linksP$ = null;
        kb_paths.$kbp_no_bi_scoping_linksP$ = null;
        kb_paths.$kbp_explode_natsP$ = null;
        kb_paths.$kbp_designated_predsP$ = null;
        kb_paths.$kbp_designated_preds$ = null;
        kb_paths.$kbp_restricted_predsP$ = null;
        kb_paths.$kbp_restricted_preds$ = null;
        kb_paths.$kbp_restricted_mtsP$ = null;
        kb_paths.$kbp_restricted_mts$ = null;
        kb_paths.$kbp_external_link_predP$ = null;
        kb_paths.$kbp_external_link_pred$ = null;
        kb_paths.$kbp_genl_boundP$ = null;
        kb_paths.$kbp_genl_bound$ = null;
        kb_paths.$kbp_genls_cardinality_delta_boundP$ = null;
        kb_paths.$kbp_genls_cardinality_delta_bound$ = null;
        kb_paths.$kbp_isa_boundP$ = null;
        kb_paths.$kbp_isa_bound$ = null;
        kb_paths.$kbp_node_isa_boundP$ = null;
        kb_paths.$kbp_node_isa_bound$ = null;
        kb_paths.$kbp_restricted_nodes_as_argP$ = null;
        kb_paths.$kbp_restricted_nodes_as_arg$ = null;
        kb_paths.$kbp_link_reference_set_boundP$ = null;
        kb_paths.$kbp_link_reference_set_bound$ = null;
        kb_paths.$kbp_designated_link_referencesP$ = null;
        kb_paths.$kbp_designated_link_references$ = null;
        kb_paths.$kbp_bound_gaf_termsP$ = null;
        kb_paths.$kbp_bound_gaf_terms$ = null;
        kb_paths.$kbp_bound_link_termsP$ = null;
        kb_paths.$kbp_bound_link_terms$ = null;
        kb_paths.$kbp_use_max_mtsP$ = null;
        kb_paths.$nodes_accessor_fn$ = null;
        kb_paths.$path_link_op$ = null;
        kb_paths.$path_node_op$ = null;
        kb_paths.$relevant_linkP$ = null;
        kb_paths.$relevant_nodeP$ = null;
        kb_paths.$relevant_link_treeP$ = null;
        kb_paths.$exclude_nodes$ = null;
        kb_paths.$exclude_links$ = null;
        kb_paths.$cr_paths_table$ = null;
        kb_paths.$cr_gaf_count$ = null;
        kb_paths.$cr_explained_count$ = null;
        kb_paths.$cr_error_count$ = null;
        $sym0$_KBP_QUIT__ = SubLObjectFactory.makeSymbol("*KBP-QUIT?*");
        $kw1$PATHS = SubLObjectFactory.makeKeyword("PATHS");
        $sym2$_KBP_RESULT_FORMAT_ = SubLObjectFactory.makeSymbol("*KBP-RESULT-FORMAT*");
        $sym3$_SEARCH_ITERATION_ = SubLObjectFactory.makeSymbol("*SEARCH-ITERATION*");
        $sym4$_NODE_EQUAL__ = SubLObjectFactory.makeSymbol("*NODE-EQUAL?*");
        $sym5$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym6$_KBP_NODE__ = SubLObjectFactory.makeSymbol("*KBP-NODE?*");
        $sym7$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym8$_KBP_LINK__ = SubLObjectFactory.makeSymbol("*KBP-LINK?*");
        $sym9$_KBP_STATS_ = SubLObjectFactory.makeSymbol("*KBP-STATS*");
        $sym10$_COLLECT_KBP_STATS__ = SubLObjectFactory.makeSymbol("*COLLECT-KBP-STATS?*");
        $sym11$_KBP_NODE_COUNT_ = SubLObjectFactory.makeSymbol("*KBP-NODE-COUNT*");
        $sym12$_KBP_LINK_COUNT_ = SubLObjectFactory.makeSymbol("*KBP-LINK-COUNT*");
        $sym13$_KBP_TERM_COUNT_ = SubLObjectFactory.makeSymbol("*KBP-TERM-COUNT*");
        $list14 = ConsesLow.list((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.TWO_INTEGER, (SubLObject)kb_paths.THREE_INTEGER, (SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.FIVE_INTEGER);
        $sym15$_SOURCE_TERM_ARGS_ = SubLObjectFactory.makeSymbol("*SOURCE-TERM-ARGS*");
        $list16 = ConsesLow.list((SubLObject)kb_paths.ONE_INTEGER, (SubLObject)kb_paths.TWO_INTEGER, (SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.FOUR_INTEGER, (SubLObject)kb_paths.FIVE_INTEGER);
        $sym17$_TARGET_TERM_ARGS_ = SubLObjectFactory.makeSymbol("*TARGET-TERM-ARGS*");
        $sym18$_RELEVANT_NODE_TREE__ = SubLObjectFactory.makeSymbol("*RELEVANT-NODE-TREE?*");
        $sym19$_PATH_SOURCE_ = SubLObjectFactory.makeSymbol("*PATH-SOURCE*");
        $sym20$_PATH_TARGET_ = SubLObjectFactory.makeSymbol("*PATH-TARGET*");
        $sym21$_KBP_SEARCHER_ = SubLObjectFactory.makeSymbol("*KBP-SEARCHER*");
        $sym22$_KBP_SEARCHERS_ = SubLObjectFactory.makeSymbol("*KBP-SEARCHERS*");
        $sym23$_PATH_HORIZON_ = SubLObjectFactory.makeSymbol("*PATH-HORIZON*");
        $sym24$_KBP_COMMON_NODES_ = SubLObjectFactory.makeSymbol("*KBP-COMMON-NODES*");
        $sym25$_PATH_LINK_LATTICE_ = SubLObjectFactory.makeSymbol("*PATH-LINK-LATTICE*");
        $sym26$_PATH_NODE_LATTICE_ = SubLObjectFactory.makeSymbol("*PATH-NODE-LATTICE*");
        $sym27$_KBP_ANCESTOR_ = SubLObjectFactory.makeSymbol("*KBP-ANCESTOR*");
        $sym28$_KBP_RUN_TIME_ = SubLObjectFactory.makeSymbol("*KBP-RUN-TIME*");
        $sym29$_NODE_ANCESTORS_ = SubLObjectFactory.makeSymbol("*NODE-ANCESTORS*");
        $sym30$_LINK_ANCESTORS_ = SubLObjectFactory.makeSymbol("*LINK-ANCESTORS*");
        $sym31$_KBP_DEPTH_ = SubLObjectFactory.makeSymbol("*KBP-DEPTH*");
        $sym32$_KBP_NODES_ = SubLObjectFactory.makeSymbol("*KBP-NODES*");
        $sym33$_KBP_LINKS_ = SubLObjectFactory.makeSymbol("*KBP-LINKS*");
        $sym34$_TERM_ARG_ = SubLObjectFactory.makeSymbol("*TERM-ARG*");
        $int35$2048 = SubLObjectFactory.makeInteger(2048);
        $sym36$_KBP_ANCESTOR_HASH_ = SubLObjectFactory.makeSymbol("*KBP-ANCESTOR-HASH*");
        $sym37$_KBP_SEARCH_HASH_ = SubLObjectFactory.makeSymbol("*KBP-SEARCH-HASH*");
        $sym38$_KBP_MIN_ISA_PATH__ = SubLObjectFactory.makeSymbol("*KBP-MIN-ISA-PATH?*");
        $sym39$_KBP_MIN_GENLS_PATH__ = SubLObjectFactory.makeSymbol("*KBP-MIN-GENLS-PATH?*");
        $sym40$_KBP_DESIGNATED_NODE_SUPERIORS__ = SubLObjectFactory.makeSymbol("*KBP-DESIGNATED-NODE-SUPERIORS?*");
        $sym41$_KBP_DESIGNATED_NODE_SUPERIORS_ = SubLObjectFactory.makeSymbol("*KBP-DESIGNATED-NODE-SUPERIORS*");
        $sym42$_KBP_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*KBP-TRACE-LEVEL*");
        $sym43$_MAX_SEARCH_ITERATIONS_ = SubLObjectFactory.makeSymbol("*MAX-SEARCH-ITERATIONS*");
        $sym44$_LIMIT_PATH_DEPTH__ = SubLObjectFactory.makeSymbol("*LIMIT-PATH-DEPTH?*");
        $sym45$_KBP_MAX_DEPTH_ = SubLObjectFactory.makeSymbol("*KBP-MAX-DEPTH*");
        $int46$1000 = SubLObjectFactory.makeInteger(1000);
        $sym47$_KBP_MAX_TERM_COUNT_ = SubLObjectFactory.makeSymbol("*KBP-MAX-TERM-COUNT*");
        $sym48$_KBP_QUIT_WITH_SUCCESS__ = SubLObjectFactory.makeSymbol("*KBP-QUIT-WITH-SUCCESS?*");
        $sym49$_KBP_ONLY_GAF_LINKS__ = SubLObjectFactory.makeSymbol("*KBP-ONLY-GAF-LINKS?*");
        $sym50$_KBP_NO_BOOKKEEPING_LINKS__ = SubLObjectFactory.makeSymbol("*KBP-NO-BOOKKEEPING-LINKS?*");
        $sym51$_KBP_NO_INSTANCE_LINKS__ = SubLObjectFactory.makeSymbol("*KBP-NO-INSTANCE-LINKS?*");
        $sym52$_KBP_NO_BI_SCOPING_LINKS__ = SubLObjectFactory.makeSymbol("*KBP-NO-BI-SCOPING-LINKS?*");
        $sym53$_KBP_EXPLODE_NATS__ = SubLObjectFactory.makeSymbol("*KBP-EXPLODE-NATS?*");
        $sym54$_KBP_DESIGNATED_PREDS__ = SubLObjectFactory.makeSymbol("*KBP-DESIGNATED-PREDS?*");
        $sym55$_KBP_DESIGNATED_PREDS_ = SubLObjectFactory.makeSymbol("*KBP-DESIGNATED-PREDS*");
        $sym56$_KBP_RESTRICTED_PREDS__ = SubLObjectFactory.makeSymbol("*KBP-RESTRICTED-PREDS?*");
        $sym57$_KBP_RESTRICTED_PREDS_ = SubLObjectFactory.makeSymbol("*KBP-RESTRICTED-PREDS*");
        $sym58$_KBP_RESTRICTED_MTS__ = SubLObjectFactory.makeSymbol("*KBP-RESTRICTED-MTS?*");
        $list59 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")));
        $sym60$_KBP_RESTRICTED_MTS_ = SubLObjectFactory.makeSymbol("*KBP-RESTRICTED-MTS*");
        $sym61$_KBP_EXTERNAL_LINK_PRED__ = SubLObjectFactory.makeSymbol("*KBP-EXTERNAL-LINK-PRED?*");
        $sym62$_KBP_EXTERNAL_LINK_PRED_ = SubLObjectFactory.makeSymbol("*KBP-EXTERNAL-LINK-PRED*");
        $sym63$_KBP_GENL_BOUND__ = SubLObjectFactory.makeSymbol("*KBP-GENL-BOUND?*");
        $sym64$_KBP_GENL_BOUND_ = SubLObjectFactory.makeSymbol("*KBP-GENL-BOUND*");
        $sym65$_KBP_GENLS_CARDINALITY_DELTA_BOUND__ = SubLObjectFactory.makeSymbol("*KBP-GENLS-CARDINALITY-DELTA-BOUND?*");
        $sym66$_KBP_GENLS_CARDINALITY_DELTA_BOUND_ = SubLObjectFactory.makeSymbol("*KBP-GENLS-CARDINALITY-DELTA-BOUND*");
        $sym67$_KBP_ISA_BOUND__ = SubLObjectFactory.makeSymbol("*KBP-ISA-BOUND?*");
        $sym68$_KBP_ISA_BOUND_ = SubLObjectFactory.makeSymbol("*KBP-ISA-BOUND*");
        $sym69$_KBP_NODE_ISA_BOUND__ = SubLObjectFactory.makeSymbol("*KBP-NODE-ISA-BOUND?*");
        $sym70$_KBP_NODE_ISA_BOUND_ = SubLObjectFactory.makeSymbol("*KBP-NODE-ISA-BOUND*");
        $sym71$_KBP_RESTRICTED_NODES_AS_ARG__ = SubLObjectFactory.makeSymbol("*KBP-RESTRICTED-NODES-AS-ARG?*");
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedCollection")), (SubLObject)kb_paths.ONE_INTEGER));
        $sym73$_KBP_RESTRICTED_NODES_AS_ARG_ = SubLObjectFactory.makeSymbol("*KBP-RESTRICTED-NODES-AS-ARG*");
        $sym74$_KBP_LINK_REFERENCE_SET_BOUND__ = SubLObjectFactory.makeSymbol("*KBP-LINK-REFERENCE-SET-BOUND?*");
        $sym75$_KBP_LINK_REFERENCE_SET_BOUND_ = SubLObjectFactory.makeSymbol("*KBP-LINK-REFERENCE-SET-BOUND*");
        $sym76$_KBP_DESIGNATED_LINK_REFERENCES__ = SubLObjectFactory.makeSymbol("*KBP-DESIGNATED-LINK-REFERENCES?*");
        $sym77$_KBP_DESIGNATED_LINK_REFERENCES_ = SubLObjectFactory.makeSymbol("*KBP-DESIGNATED-LINK-REFERENCES*");
        $sym78$_KBP_BOUND_GAF_TERMS__ = SubLObjectFactory.makeSymbol("*KBP-BOUND-GAF-TERMS?*");
        $list79 = ConsesLow.list((SubLObject)kb_paths.ZERO_INTEGER);
        $sym80$_KBP_BOUND_GAF_TERMS_ = SubLObjectFactory.makeSymbol("*KBP-BOUND-GAF-TERMS*");
        $sym81$_KBP_BOUND_LINK_TERMS__ = SubLObjectFactory.makeSymbol("*KBP-BOUND-LINK-TERMS?*");
        $sym82$_KBP_BOUND_LINK_TERMS_ = SubLObjectFactory.makeSymbol("*KBP-BOUND-LINK-TERMS*");
        $sym83$_KBP_USE_MAX_MTS__ = SubLObjectFactory.makeSymbol("*KBP-USE-MAX-MTS?*");
        $sym84$_NODES_ACCESSOR_FN_ = SubLObjectFactory.makeSymbol("*NODES-ACCESSOR-FN*");
        $sym85$_PATH_LINK_OP_ = SubLObjectFactory.makeSymbol("*PATH-LINK-OP*");
        $sym86$_PATH_NODE_OP_ = SubLObjectFactory.makeSymbol("*PATH-NODE-OP*");
        $sym87$_RELEVANT_LINK__ = SubLObjectFactory.makeSymbol("*RELEVANT-LINK?*");
        $sym88$_RELEVANT_NODE__ = SubLObjectFactory.makeSymbol("*RELEVANT-NODE?*");
        $sym89$_RELEVANT_LINK_TREE__ = SubLObjectFactory.makeSymbol("*RELEVANT-LINK-TREE?*");
        $sym90$_EXCLUDE_NODES_ = SubLObjectFactory.makeSymbol("*EXCLUDE-NODES*");
        $sym91$_EXCLUDE_LINKS_ = SubLObjectFactory.makeSymbol("*EXCLUDE-LINKS*");
        $sym92$ALL_ASSERTION_TERMS = SubLObjectFactory.makeSymbol("ALL-ASSERTION-TERMS");
        $sym93$DEFAULT_LINK_OP = SubLObjectFactory.makeSymbol("DEFAULT-LINK-OP");
        $sym94$DEFAULT_NODE_OP = SubLObjectFactory.makeSymbol("DEFAULT-NODE-OP");
        $sym95$DEFAULT_RELEVANT_LINK_ = SubLObjectFactory.makeSymbol("DEFAULT-RELEVANT-LINK?");
        $sym96$DEFAULT_RELEVANT_NODE_ = SubLObjectFactory.makeSymbol("DEFAULT-RELEVANT-NODE?");
        $sym97$DEFAULT_RELEVANT_LINK_TREE_ = SubLObjectFactory.makeSymbol("DEFAULT-RELEVANT-LINK-TREE?");
        $str98$searching_for_kb_paths = SubLObjectFactory.makeString("searching for kb paths");
        $str99$missed_connection = SubLObjectFactory.makeString("missed connection");
        $str100$duplicates_in_accessed1 = SubLObjectFactory.makeString("duplicates in accessed1");
        $str101$duplicates_in_accessed2 = SubLObjectFactory.makeString("duplicates in accessed2");
        $kw102$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $str103$horizons_missed__iteration__s = SubLObjectFactory.makeString("horizons missed; iteration ~s");
        $sym104$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const105$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym106$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $str107$____kbp_common_nodes___a = SubLObjectFactory.makeString("~%~%kbp common nodes: ~a");
        $str108$____complete_paths_home_from___s_ = SubLObjectFactory.makeString("~%~%complete-paths-home-from: ~s ~%~s");
        $str109$_____acomplete_paths_home_from_li = SubLObjectFactory.makeString("~%~%~acomplete-paths-home-from-link: ~s ~%~a~s");
        $str110$_____acomplete_paths_home_from_no = SubLObjectFactory.makeString("~%~%~acomplete-paths-home-from-node: ~s ~%~a~s");
        $kw111$LINKS = SubLObjectFactory.makeKeyword("LINKS");
        $str112$invalid_path_format___s = SubLObjectFactory.makeString("invalid path format: ~s");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROOT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS"));
        $str114$_____agather_node_latice____a_s = SubLObjectFactory.makeString("~%~%~agather-node-latice:~%~a~s");
        $str115$_____agather_link_latice_____a_s = SubLObjectFactory.makeString("~%~%~agather-link-latice: ~%~a~s");
        $sym116$KBP_LINK_NODES = SubLObjectFactory.makeSymbol("KBP-LINK-NODES");
        $str117$____marking_horizon_for__s_in_ite = SubLObjectFactory.makeString("~%~%marking horizon for ~s in iteration ~s");
        $str118$__search_node____s__s___s = SubLObjectFactory.makeString("~%search node: [~s ~s] ~s");
        $str119$empty_horizon_for__s_in_iteration = SubLObjectFactory.makeString("empty horizon for ~s in iteration ~s");
        $str120$___s_searched_by___s = SubLObjectFactory.makeString("~%~s searched by: ~s");
        $str121$___s______goal_________________ = SubLObjectFactory.makeString("~%~s  *** goal!!!!!!!!!!!!!!!!!");
        $kw122$TERM_BOUND = SubLObjectFactory.makeKeyword("TERM-BOUND");
        $sym123$_ = SubLObjectFactory.makeSymbol("+");
        $sym124$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym125$SPEC_CARDINALITY = SubLObjectFactory.makeSymbol("SPEC-CARDINALITY");
        $const126$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw127$UP = SubLObjectFactory.makeKeyword("UP");
        $kw128$DOWN = SubLObjectFactory.makeKeyword("DOWN");
        $const129$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw130$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym131$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $kw132$POS = SubLObjectFactory.makeKeyword("POS");
        $kw133$OTHER = SubLObjectFactory.makeKeyword("OTHER");
        $kw134$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw135$ITERATIONS = SubLObjectFactory.makeKeyword("ITERATIONS");
        $kw136$TERMS = SubLObjectFactory.makeKeyword("TERMS");
        $kw137$NODES = SubLObjectFactory.makeKeyword("NODES");
        $kw138$BRANCH = SubLObjectFactory.makeKeyword("BRANCH");
        $kw139$TIME = SubLObjectFactory.makeKeyword("TIME");
        $kw140$TERMINATION = SubLObjectFactory.makeKeyword("TERMINATION");
        $kw141$EXHAUST = SubLObjectFactory.makeKeyword("EXHAUST");
        $kw142$ITERATION_BOUND = SubLObjectFactory.makeKeyword("ITERATION-BOUND");
        $sym143$EQUAL_NODES_ = SubLObjectFactory.makeSymbol("EQUAL-NODES?");
        $sym144$ASSERTIONS_FI_EQUAL_ = SubLObjectFactory.makeSymbol("ASSERTIONS-FI-EQUAL?");
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATH"));
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-PATH"));
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-1"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATH-1"));
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-1"), (SubLObject)SubLObjectFactory.makeSymbol("NODE-PATH-1"));
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-PATH-2"));
        $sym150$KBP_JUST_FROM_TUPLES = SubLObjectFactory.makeSymbol("KBP-JUST-FROM-TUPLES");
        $sym151$KBP_JUST_FROM_TUPLE = SubLObjectFactory.makeSymbol("KBP-JUST-FROM-TUPLE");
        $str152$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $sym153$WARN = SubLObjectFactory.makeSymbol("WARN");
        $list154 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")));
        $list155 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $list156 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")));
        $int157$1024 = SubLObjectFactory.makeInteger(1024);
        $list158 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")));
        $list159 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KnowledgeBase")));
        $list160 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestingConstant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LinguisticObjectType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceRelatedBookkeepingPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenericAttribute")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KnowledgeBase")));
        $list161 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PartiallyTangible")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SiblingDisjointCollectionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExistingObjectType")));
        $list162 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $sym163$EXPLAIN_CR_GAF_VIA_PATHS = SubLObjectFactory.makeSymbol("EXPLAIN-CR-GAF-VIA-PATHS");
        $const164$conceptuallyRelated = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated"));
        $sym165$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym166$KB_ASSERTION_ = SubLObjectFactory.makeSymbol("KB-ASSERTION?");
        $sym167$ASSERTION_FI_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FI-FORMULA");
        $str168$__cr_gafs_considered___a = SubLObjectFactory.makeString("~%cr gafs considered: ~a");
        $str169$__cr_gafs_explained___a = SubLObjectFactory.makeString("~%cr gafs explained: ~a");
        $str170$__cr_gafs_w_errors___a = SubLObjectFactory.makeString("~%cr gafs w/errors: ~a");
        $const171$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const172$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $kw173$MIN = SubLObjectFactory.makeKeyword("MIN");
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED"), (SubLObject)SubLObjectFactory.makeKeyword("RELATION-ALL"));
        $kw175$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw176$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw177$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw179$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str180$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym181$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw182$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $kw183$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str184$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $sym185$GENLS_GATHER_FOCUS_PREDS_COLS = SubLObjectFactory.makeSymbol("GENLS-GATHER-FOCUS-PREDS-COLS");
        $kw186$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str187$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str188$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str189$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym190$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list191 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym192$_ = SubLObjectFactory.makeSymbol(">");
        $sym193$CADR = SubLObjectFactory.makeSymbol("CADR");
        $const194$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw195$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw196$MAX = SubLObjectFactory.makeKeyword("MAX");
        $kw197$MID = SubLObjectFactory.makeKeyword("MID");
        $kw198$EDGE = SubLObjectFactory.makeKeyword("EDGE");
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRED"), (SubLObject)SubLObjectFactory.makeKeyword("RELATION-ALL"), (SubLObject)SubLObjectFactory.makeKeyword("RELATION-EXISTS"), (SubLObject)SubLObjectFactory.makeKeyword("INTER-ARG-ISA-INDEPENDENT"), (SubLObject)SubLObjectFactory.makeKeyword("INTER-ARG-ISA-DEPENDENT"));
        $sym200$GENLS_GATHER_FOCUS_PREDS_OF = SubLObjectFactory.makeSymbol("GENLS-GATHER-FOCUS-PREDS-OF");
    }
}

/*

	Total time: 3861 ms
	
*/