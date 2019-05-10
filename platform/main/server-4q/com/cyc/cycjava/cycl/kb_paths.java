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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class kb_paths
    extends
      SubLTranslatedFile
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
  public static SubLObject kb_paths(SubLObject source, final SubLObject target, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_kb_paths();
    SubLObject v_kb_paths = NIL;
    SubLObject stats = NIL;
    final SubLObject _prev_bind_0 = $nodes_accessor_fn$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $path_link_op$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $path_node_op$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $relevant_linkP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $relevant_nodeP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = $relevant_link_treeP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = $path_source$.currentBinding( thread );
    final SubLObject _prev_bind_8 = $path_target$.currentBinding( thread );
    final SubLObject _prev_bind_9 = $kbp_searchers$.currentBinding( thread );
    final SubLObject _prev_bind_10 = $kbp_term_count$.currentBinding( thread );
    final SubLObject _prev_bind_11 = $kbp_node_count$.currentBinding( thread );
    final SubLObject _prev_bind_12 = $kbp_link_count$.currentBinding( thread );
    final SubLObject _prev_bind_13 = $search_iteration$.currentBinding( thread );
    try
    {
      $nodes_accessor_fn$.bind( $nodes_accessor_fn$.getDynamicValue( thread ).isFunctionSpec() ? $nodes_accessor_fn$.getDynamicValue( thread ) : Symbols.symbol_function( $sym92$ALL_ASSERTION_TERMS ), thread );
      $path_link_op$.bind( $path_link_op$.getDynamicValue( thread ).isFunctionSpec() ? $path_link_op$.getDynamicValue( thread ) : Symbols.symbol_function( $sym93$DEFAULT_LINK_OP ), thread );
      $path_node_op$.bind( $path_node_op$.getDynamicValue( thread ).isFunctionSpec() ? $path_node_op$.getDynamicValue( thread ) : Symbols.symbol_function( $sym94$DEFAULT_NODE_OP ), thread );
      $relevant_linkP$.bind( $relevant_linkP$.getDynamicValue( thread ).isFunctionSpec() ? $relevant_linkP$.getDynamicValue( thread ) : Symbols.symbol_function( $sym95$DEFAULT_RELEVANT_LINK_ ), thread );
      $relevant_nodeP$.bind( $relevant_nodeP$.getDynamicValue( thread ).isFunctionSpec() ? $relevant_nodeP$.getDynamicValue( thread ) : Symbols.symbol_function( $sym96$DEFAULT_RELEVANT_NODE_ ), thread );
      $relevant_link_treeP$.bind( $relevant_link_treeP$.getDynamicValue( thread ).isFunctionSpec() ? $relevant_link_treeP$.getDynamicValue( thread ) : Symbols.symbol_function( $sym97$DEFAULT_RELEVANT_LINK_TREE_ ),
          thread );
      $path_source$.bind( source, thread );
      $path_target$.bind( target, thread );
      $kbp_searchers$.bind( Sequences.remove_duplicates( ConsesLow.list( source, target ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      $kbp_term_count$.bind( Sequences.length( $kbp_searchers$.getDynamicValue( thread ) ), thread );
      $kbp_node_count$.bind( ZERO_INTEGER, thread );
      $kbp_link_count$.bind( ZERO_INTEGER, thread );
      $search_iteration$.bind( ZERO_INTEGER, thread );
      final SubLObject time_var = Time.get_internal_real_time();
      if( NIL != list_utilities.singletonP( $kbp_searchers$.getDynamicValue( thread ) ) )
      {
        v_kb_paths = $kbp_searchers$.getDynamicValue( thread );
      }
      else
      {
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
          final SubLObject _prev_bind_0_$2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$5 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_3_$6 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( $str98$searching_for_kb_paths );
              SubLObject cdolist_list_var = $kbp_searchers$.getDynamicValue( thread );
              SubLObject searcher = NIL;
              searcher = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                kbp_mark_as_searched_by( searcher, searcher, UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                searcher = cdolist_list_var.first();
              }
              SubLObject v_iteration;
              SubLObject horizon1;
              SubLObject horizon2;
              SubLObject accessed1;
              SubLObject accessed2;
              SubLObject paths;
              for( v_iteration = NIL, horizon1 = NIL, horizon2 = NIL, accessed1 = NIL, accessed2 = NIL, paths = NIL, v_iteration = next_iteration(), horizon1 = mark_next_horizon( ConsesLow.list( source ), source,
                  UNPROVIDED, UNPROVIDED, UNPROVIDED ), horizon2 = mark_next_horizon( ConsesLow.list( target ), target, UNPROVIDED, UNPROVIDED,
                      UNPROVIDED ), accessed1 = horizon1, accessed2 = horizon2, paths = find_paths( source, target ); NIL == paths && NIL == kbp_give_upP( v_iteration, horizon1,
                          horizon2 ); v_iteration = next_iteration(), horizon1 = mark_next_horizon( horizon1, source, UNPROVIDED, UNPROVIDED, UNPROVIDED ), horizon2 = mark_next_horizon( horizon2, target, UNPROVIDED,
                              UNPROVIDED, UNPROVIDED ), accessed1 = ( NIL != horizon1 ) ? ConsesLow.nconc( accessed1, horizon1 ) : NIL, accessed2 = ( NIL != horizon2 ) ? ConsesLow.nconc( accessed2, horizon2 )
                                  : NIL, paths = find_paths( source, target ) )
              {
                if( NIL != $kbp_common_nodes$.getDynamicValue( thread ) && NIL == paths )
                {
                  kbp_error( THREE_INTEGER, $str99$missed_connection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                if( $kbp_trace_level$.getDynamicValue( thread ).isNumber() && $kbp_trace_level$.getDynamicValue( thread ).numGE( THREE_INTEGER ) )
                {
                  if( NIL != list_utilities.duplicatesP( accessed1, UNPROVIDED, UNPROVIDED ) )
                  {
                    kbp_error( FOUR_INTEGER, $str100$duplicates_in_accessed1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  if( NIL != list_utilities.duplicatesP( accessed2, UNPROVIDED, UNPROVIDED ) )
                  {
                    kbp_error( FOUR_INTEGER, $str101$duplicates_in_accessed2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                }
              }
              if( NIL != paths )
              {
                v_kb_paths = paths;
                $kbp_quitP$.setDynamicValue( $kw102$SUCCESS, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3_$6, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$5, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$3, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$2, thread );
          }
          if( NIL != $kbp_min_genls_pathP$.getDynamicValue( thread ) )
          {
            SubLObject cdolist_list_var2 = kbp_min_genls_paths( source, target, mt, UNPROVIDED );
            SubLObject path = NIL;
            path = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              if( NIL != path )
              {
                final SubLObject item_var = path;
                if( NIL == conses_high.member( item_var, v_kb_paths, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  v_kb_paths = ConsesLow.cons( item_var, v_kb_paths );
                }
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              path = cdolist_list_var2.first();
            }
          }
          if( NIL != $kbp_min_isa_pathP$.getDynamicValue( thread ) )
          {
            SubLObject cdolist_list_var2 = kbp_min_isa_paths( source, target, mt, UNPROVIDED );
            SubLObject path = NIL;
            path = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              if( NIL != path )
              {
                final SubLObject item_var = path;
                if( NIL == conses_high.member( item_var, v_kb_paths, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  v_kb_paths = ConsesLow.cons( item_var, v_kb_paths );
                }
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              path = cdolist_list_var2.first();
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$1, thread );
        }
      }
      $kbp_run_time$.setDynamicValue( Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() ), thread );
      if( NIL == $kbp_common_nodes$.getDynamicValue( thread ) )
      {
        kbp_warn( THREE_INTEGER, $str103$horizons_missed__iteration__s, $search_iteration$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != $collect_kbp_statsP$.getDynamicValue( thread ) )
      {
        stats = kbp_stats( v_kb_paths );
      }
    }
    finally
    {
      $search_iteration$.rebind( _prev_bind_13, thread );
      $kbp_link_count$.rebind( _prev_bind_12, thread );
      $kbp_node_count$.rebind( _prev_bind_11, thread );
      $kbp_term_count$.rebind( _prev_bind_10, thread );
      $kbp_searchers$.rebind( _prev_bind_9, thread );
      $path_target$.rebind( _prev_bind_8, thread );
      $path_source$.rebind( _prev_bind_7, thread );
      $relevant_link_treeP$.rebind( _prev_bind_6, thread );
      $relevant_nodeP$.rebind( _prev_bind_5, thread );
      $relevant_linkP$.rebind( _prev_bind_4, thread );
      $path_node_op$.rebind( _prev_bind_3, thread );
      $path_link_op$.rebind( _prev_bind_2, thread );
      $nodes_accessor_fn$.rebind( _prev_bind_0, thread );
    }
    if( NIL != $collect_kbp_statsP$.getDynamicValue( thread ) )
    {
      return Values.values( v_kb_paths, stats );
    }
    return v_kb_paths;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 7093L)
  public static SubLObject kb_paths_n(SubLObject source, final SubLObject target, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject paths = NIL;
    final SubLObject _prev_bind_0 = $max_search_iterations$.currentBinding( thread );
    try
    {
      $max_search_iterations$.bind( n, thread );
      paths = kb_paths( source, target, UNPROVIDED );
    }
    finally
    {
      $max_search_iterations$.rebind( _prev_bind_0, thread );
    }
    return paths;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 7265L)
  public static SubLObject kb_paths_in_all_mts(SubLObject source, final SubLObject target)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject paths = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym104$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const105$EverythingPSC, thread );
      paths = kb_paths( source, target, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return paths;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 7408L)
  public static SubLObject kb_paths_in_just_mt(SubLObject source, final SubLObject target, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject paths = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym106$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      paths = kb_paths( source, target, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return paths;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 7557L)
  public static SubLObject find_paths(SubLObject source, SubLObject target)
  {
    if( source == UNPROVIDED )
    {
      source = $path_source$.getDynamicValue();
    }
    if( target == UNPROVIDED )
    {
      target = $path_target$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kbp_common_nodes$.getDynamicValue( thread ) )
    {
      if( NIL != $kbp_trace_level$.getDynamicValue( thread ) )
      {
        kbp_note( TWO_INTEGER, $str107$____kbp_common_nodes___a, string_utilities.stringify_terms( $kbp_common_nodes$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      complete_paths_home( $kbp_common_nodes$.getDynamicValue( thread ) );
      return extract_paths( source, target );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 7978L)
  public static SubLObject complete_paths_home(SubLObject common_nodes)
  {
    if( common_nodes == UNPROVIDED )
    {
      common_nodes = $kbp_common_nodes$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $kbp_depth$.currentBinding( thread );
    try
    {
      $kbp_depth$.bind( ZERO_INTEGER, thread );
      SubLObject cdolist_list_var = common_nodes;
      SubLObject fort = NIL;
      fort = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        kbp_note( FOUR_INTEGER, $str108$____complete_paths_home_from___s_, kbp_searched_by( fort ), fort, UNPROVIDED, UNPROVIDED );
        SubLObject cdolist_list_var_$8 = kbp_ancestors_via_all( fort, UNPROVIDED );
        SubLObject ancestor = NIL;
        ancestor = cdolist_list_var_$8.first();
        while ( NIL != cdolist_list_var_$8)
        {
          complete_paths_home_from_link( ancestor );
          cdolist_list_var_$8 = cdolist_list_var_$8.rest();
          ancestor = cdolist_list_var_$8.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        fort = cdolist_list_var.first();
      }
    }
    finally
    {
      $kbp_depth$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 8313L)
  public static SubLObject complete_paths_home_from_link(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $kbp_depth$.setDynamicValue( Numbers.add( $kbp_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    kbp_note( FOUR_INTEGER, $str109$_____acomplete_paths_home_from_li, string_utilities.tabstr( $kbp_depth$.getDynamicValue( thread ), UNPROVIDED ), kbp_searched_by( assertion ), string_utilities.tabstr( $kbp_depth$
        .getDynamicValue( thread ), UNPROVIDED ), assertion );
    kbp_mark_as_searched_by_all( assertion, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = kbp_ancestors_via_all( assertion, UNPROVIDED );
    SubLObject ancestor = NIL;
    ancestor = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      complete_paths_home_from_node( ancestor );
      cdolist_list_var = cdolist_list_var.rest();
      ancestor = cdolist_list_var.first();
    }
    $kbp_depth$.setDynamicValue( Numbers.subtract( $kbp_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 8713L)
  public static SubLObject complete_paths_home_from_node(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kbp_searched_by_allP( fort, UNPROVIDED, UNPROVIDED ) )
    {
      $kbp_depth$.setDynamicValue( Numbers.add( $kbp_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      kbp_note( FOUR_INTEGER, $str110$_____acomplete_paths_home_from_no, string_utilities.tabstr( $kbp_depth$.getDynamicValue( thread ), UNPROVIDED ), kbp_searched_by( fort ), string_utilities.tabstr( $kbp_depth$
          .getDynamicValue( thread ), UNPROVIDED ), fort );
      kbp_mark_as_searched_by_all( fort, UNPROVIDED, UNPROVIDED );
      if( NIL == kbp_searcherP( fort ) )
      {
        SubLObject cdolist_list_var = kbp_ancestors_via_all( fort, UNPROVIDED );
        SubLObject ancestor = NIL;
        ancestor = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          complete_paths_home_from_link( ancestor );
          cdolist_list_var = cdolist_list_var.rest();
          ancestor = cdolist_list_var.first();
        }
      }
      $kbp_depth$.setDynamicValue( Numbers.subtract( $kbp_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 9174L)
  public static SubLObject extract_paths(SubLObject source, SubLObject target)
  {
    if( source == UNPROVIDED )
    {
      source = $path_source$.getDynamicValue();
    }
    if( target == UNPROVIDED )
    {
      target = $path_target$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $path_target$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $path_source$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $kbp_depth$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $kbp_max_depth$.currentBinding( thread );
    try
    {
      $path_target$.bind( target, thread );
      $path_source$.bind( source, thread );
      $kbp_depth$.bind( ZERO_INTEGER, thread );
      $kbp_max_depth$.bind( ( NIL != $limit_path_depthP$.getDynamicValue( thread ) ) ? Numbers.multiply( FOUR_INTEGER, $search_iteration$.getDynamicValue( thread ) ) : NIL, thread );
      final SubLObject kbp_components = kbp_all_searched_by_all( UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0_$9 = $kbp_nodes$.currentBinding( thread );
      final SubLObject _prev_bind_1_$10 = $kbp_links$.currentBinding( thread );
      try
      {
        $kbp_nodes$.bind( list_utilities.remove_if_not( $kbp_nodeP$.getDynamicValue( thread ), kbp_components, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        $kbp_links$.bind( list_utilities.remove_if_not( $kbp_linkP$.getDynamicValue( thread ), kbp_components, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        result = kbp_result();
      }
      finally
      {
        $kbp_links$.rebind( _prev_bind_1_$10, thread );
        $kbp_nodes$.rebind( _prev_bind_0_$9, thread );
      }
    }
    finally
    {
      $kbp_max_depth$.rebind( _prev_bind_4, thread );
      $kbp_depth$.rebind( _prev_bind_3, thread );
      $path_source$.rebind( _prev_bind_2, thread );
      $path_target$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 9780L)
  public static SubLObject kbp_result()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = $kbp_result_format$.getDynamicValue( thread );
    if( pcase_var.eql( $kw1$PATHS ) )
    {
      return kbp_result_paths();
    }
    if( pcase_var.eql( $kw111$LINKS ) )
    {
      return kbp_result_links();
    }
    kbp_error( THREE_INTEGER, $str112$invalid_path_format___s, $kbp_result_format$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 9986L)
  public static SubLObject kbp_result_links()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject links = NIL;
    SubLObject node = NIL;
    SubLObject done = NIL;
    SubLObject neighbors = NIL;
    SubLObject nodes = NIL;
    node = $path_source$.getDynamicValue( thread );
    done = ConsesLow.list( node );
    neighbors = conses_high.set_difference( kbp_node_neighbors( node ), done, UNPROVIDED, UNPROVIDED );
    for( nodes = Sequences.remove( node, $kbp_nodes$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ); NIL != nodes; nodes = Sequences.delete( node, nodes, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = neighbors;
      SubLObject neighbor = NIL;
      neighbor = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$11 = kbp_connecting_links( node, neighbor );
        SubLObject link = NIL;
        link = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          links = ConsesLow.cons( ConsesLow.list( node, neighbor, link ), links );
          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
          link = cdolist_list_var_$11.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        neighbor = cdolist_list_var.first();
      }
      node = ( ( NIL != neighbors ) ? neighbors.first() : nodes.first() );
      done = ConsesLow.cons( node, done );
      neighbors = conses_high.set_difference( kbp_node_neighbors( node ), done, UNPROVIDED, UNPROVIDED );
    }
    return Sequences.nreverse( links );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 10532L)
  public static SubLObject kbp_result_paths()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject lattice = NIL;
    final SubLObject _prev_bind_0 = $node_ancestors$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $link_ancestors$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $path_node_lattice$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $path_link_lattice$.currentBinding( thread );
    try
    {
      $node_ancestors$.bind( NIL, thread );
      $link_ancestors$.bind( NIL, thread );
      $path_node_lattice$.bind( NIL, thread );
      $path_link_lattice$.bind( NIL, thread );
      lattice = gather_node_lattice( UNPROVIDED, UNPROVIDED ).first();
    }
    finally
    {
      $path_link_lattice$.rebind( _prev_bind_4, thread );
      $path_node_lattice$.rebind( _prev_bind_3, thread );
      $link_ancestors$.rebind( _prev_bind_2, thread );
      $node_ancestors$.rebind( _prev_bind_0, thread );
    }
    if( NIL != lattice )
    {
      return linearize_lattice( lattice );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 10810L)
  public static SubLObject linearize_lattice(final SubLObject lattice)
  {
    if( NIL != lattice )
    {
      SubLObject paths = NIL;
      SubLObject root = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( lattice, lattice, $list113 );
      root = lattice.first();
      SubLObject current = lattice.rest();
      final SubLObject links = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, lattice, $list113 );
      current = current.rest();
      if( NIL == current )
      {
        if( NIL == links )
        {
          return ConsesLow.list( lattice );
        }
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$12 = linearize_lattice( link );
          SubLObject path = NIL;
          path = cdolist_list_var_$12.first();
          while ( NIL != cdolist_list_var_$12)
          {
            paths = ConsesLow.cons( ConsesLow.list( root, path ), paths );
            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
            path = cdolist_list_var_$12.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          link = cdolist_list_var.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( lattice, $list113 );
      }
      return paths;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 11115L)
  public static SubLObject gather_node_lattice(SubLObject fort, SubLObject ancestors)
  {
    if( fort == UNPROVIDED )
    {
      fort = $path_source$.getDynamicValue();
    }
    if( ancestors == UNPROVIDED )
    {
      ancestors = $node_ancestors$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kbp_under_limit( UNPROVIDED, UNPROVIDED ) && NIL != kbp_legal_nodeP( fort ) )
    {
      kbp_note( FOUR_INTEGER, $str114$_____agather_node_latice____a_s, string_utilities.tabstr( $kbp_depth$.getDynamicValue( thread ), UNPROVIDED ), string_utilities.tabstr( $kbp_depth$.getDynamicValue( thread ),
          UNPROVIDED ), fort, UNPROVIDED );
      $kbp_depth$.setDynamicValue( Numbers.add( $kbp_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      if( NIL != equal_nodesP( fort, $path_target$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        $path_node_lattice$.setDynamicValue( ConsesLow.cons( ConsesLow.list( fort ), $path_node_lattice$.getDynamicValue( thread ) ), thread );
      }
      else
      {
        final SubLObject _prev_bind_0 = $path_link_lattice$.currentBinding( thread );
        final SubLObject _prev_bind_2 = $node_ancestors$.currentBinding( thread );
        try
        {
          $path_link_lattice$.bind( NIL, thread );
          $node_ancestors$.bind( ConsesLow.cons( fort, ancestors ), thread );
          SubLObject cdolist_list_var = kbp_node_links( fort );
          SubLObject link = NIL;
          link = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            gather_link_lattice( link, UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
          }
          if( NIL != $path_link_lattice$.getDynamicValue( thread ) )
          {
            $path_node_lattice$.setDynamicValue( ConsesLow.cons( ConsesLow.list( fort, $path_link_lattice$.getDynamicValue( thread ) ), $path_node_lattice$.getDynamicValue( thread ) ), thread );
          }
        }
        finally
        {
          $node_ancestors$.rebind( _prev_bind_2, thread );
          $path_link_lattice$.rebind( _prev_bind_0, thread );
        }
      }
      $kbp_depth$.setDynamicValue( Numbers.subtract( $kbp_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    }
    return $path_node_lattice$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 11769L)
  public static SubLObject gather_link_lattice(final SubLObject assertion, SubLObject ancestors)
  {
    if( ancestors == UNPROVIDED )
    {
      ancestors = $link_ancestors$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kbp_under_limit( UNPROVIDED, UNPROVIDED ) && NIL != kbp_legal_linkP( assertion ) )
    {
      kbp_note( FOUR_INTEGER, $str115$_____agather_link_latice_____a_s, string_utilities.tabstr( $kbp_depth$.getDynamicValue( thread ), UNPROVIDED ), string_utilities.tabstr( $kbp_depth$.getDynamicValue( thread ),
          UNPROVIDED ), assertion, UNPROVIDED );
      $kbp_depth$.setDynamicValue( Numbers.add( $kbp_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      final SubLObject _prev_bind_0 = $path_node_lattice$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $link_ancestors$.currentBinding( thread );
      try
      {
        $path_node_lattice$.bind( NIL, thread );
        $link_ancestors$.bind( ConsesLow.cons( assertion, ancestors ), thread );
        SubLObject cdolist_list_var = kbp_link_nodes( assertion );
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          gather_node_lattice( node, UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          node = cdolist_list_var.first();
        }
        if( NIL != $path_node_lattice$.getDynamicValue( thread ) )
        {
          $path_link_lattice$.setDynamicValue( ConsesLow.cons( ConsesLow.list( assertion, $path_node_lattice$.getDynamicValue( thread ) ), $path_link_lattice$.getDynamicValue( thread ) ), thread );
        }
      }
      finally
      {
        $link_ancestors$.rebind( _prev_bind_2, thread );
        $path_node_lattice$.rebind( _prev_bind_0, thread );
      }
      $kbp_depth$.setDynamicValue( Numbers.subtract( $kbp_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 12332L)
  public static SubLObject kbp_neighbors_among(final SubLObject v_object, final SubLObject kbp_components, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject neighbors = kbp_ancestors_via_all( v_object, UNPROVIDED );
    SubLObject cdolist_list_var = kbp_components;
    SubLObject component = NIL;
    component = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( component, neighbors, test, UNPROVIDED ) && NIL != kbp_ancestor_via_anyP( component, $kbp_searchers$.getDynamicValue( thread ), v_object, UNPROVIDED ) )
      {
        neighbors = ConsesLow.cons( component, neighbors );
      }
      cdolist_list_var = cdolist_list_var.rest();
      component = cdolist_list_var.first();
    }
    return Sequences.nreverse( neighbors );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 12707L)
  public static SubLObject kbp_node_links(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return kbp_neighbors_among( node, $kbp_links$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 12786L)
  public static SubLObject kbp_link_nodes(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return kbp_neighbors_among( link, $kbp_nodes$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 12865L)
  public static SubLObject kbp_connecting_links(final SubLObject node_1, final SubLObject node_2)
  {
    SubLObject connecting_links = NIL;
    SubLObject cdolist_list_var = kbp_ancestors_via_all( node_2, UNPROVIDED );
    SubLObject link = NIL;
    link = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( node_1, kbp_ancestors_via_all( link, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        connecting_links = ConsesLow.cons( link, connecting_links );
      }
      cdolist_list_var = cdolist_list_var.rest();
      link = cdolist_list_var.first();
    }
    cdolist_list_var = kbp_ancestors_via_all( node_1, UNPROVIDED );
    link = NIL;
    link = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( node_2, kbp_ancestors_via_all( link, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject item_var = link;
        if( NIL == conses_high.member( item_var, connecting_links, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          connecting_links = ConsesLow.cons( item_var, connecting_links );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      link = cdolist_list_var.first();
    }
    return connecting_links;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13256L)
  public static SubLObject kbp_node_neighbors(final SubLObject node)
  {
    return Sequences.remove( node, list_utilities.mapunion( Symbols.symbol_function( $sym116$KBP_LINK_NODES ), kbp_node_links( node ), UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13364L)
  public static SubLObject kbp_legal_linkP(final SubLObject assertion)
  {
    if( NIL == kbp_searched_by_allP( assertion, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != ancestor_linkP( assertion ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13525L)
  public static SubLObject kbp_legal_nodeP(final SubLObject node)
  {
    if( NIL == kbp_searched_by_allP( node, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != ancestor_nodeP( node ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13671L)
  public static SubLObject ancestor_linkP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( assertion, $link_ancestors$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13753L)
  public static SubLObject ancestor_nodeP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( fort, $node_ancestors$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13825L)
  public static SubLObject kbp_under_limit(SubLObject depth, SubLObject limit)
  {
    if( depth == UNPROVIDED )
    {
      depth = $kbp_depth$.getDynamicValue();
    }
    if( limit == UNPROVIDED )
    {
      limit = $kbp_max_depth$.getDynamicValue();
    }
    return makeBoolean( !depth.isNumber() || !limit.isNumber() || limit.numGE( depth ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 13994L)
  public static SubLObject mark_next_horizon(final SubLObject v_forts, SubLObject searcher, SubLObject op, SubLObject do_opP, SubLObject climb_treeP)
  {
    if( searcher == UNPROVIDED )
    {
      searcher = $kbp_searcher$.getDynamicValue();
    }
    if( op == UNPROVIDED )
    {
      op = $path_link_op$.getDynamicValue();
    }
    if( do_opP == UNPROVIDED )
    {
      do_opP = Symbols.symbol_function( $sym7$ASSERTION_P );
    }
    if( climb_treeP == UNPROVIDED )
    {
      climb_treeP = $relevant_link_treeP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    kbp_note( THREE_INTEGER, $str117$____marking_horizon_for__s_in_ite, searcher, $search_iteration$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    if( NIL == $kbp_common_nodes$.getDynamicValue( thread ) )
    {
      SubLObject result = NIL;
      SubLObject quitP = $kbp_quitP$.getDynamicValue( thread );
      final SubLObject _prev_bind_0 = $path_horizon$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $kbp_searcher$.currentBinding( thread );
      try
      {
        $path_horizon$.bind( NIL, thread );
        $kbp_searcher$.bind( searcher, thread );
        if( NIL == quitP )
        {
          SubLObject csome_list_var = v_forts;
          final SubLObject _prev_bind_0_$13 = $kbp_ancestor$.currentBinding( thread );
          try
          {
            $kbp_ancestor$.bind( NIL, thread );
            $kbp_ancestor$.setDynamicValue( csome_list_var.first(), thread );
            while ( NIL == quitP && NIL != csome_list_var)
            {
              $kbp_node_count$.setDynamicValue( Numbers.add( $kbp_node_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              kbp_note( TWO_INTEGER, $str118$__search_node____s__s___s, $search_iteration$.getDynamicValue( thread ), $kbp_node_count$.getDynamicValue( thread ), $kbp_ancestor$.getDynamicValue( thread ), UNPROVIDED );
              do_if_term_assertions( $kbp_ancestor$.getDynamicValue( thread ), op, do_opP, climb_treeP );
              quitP = kbp_term_bound_metP();
              csome_list_var = csome_list_var.rest();
              $kbp_ancestor$.setDynamicValue( csome_list_var.first(), thread );
            }
          }
          finally
          {
            $kbp_ancestor$.rebind( _prev_bind_0_$13, thread );
          }
        }
        result = $path_horizon$.getDynamicValue( thread );
      }
      finally
      {
        $kbp_searcher$.rebind( _prev_bind_2, thread );
        $path_horizon$.rebind( _prev_bind_0, thread );
      }
      if( NIL == result )
      {
        kbp_warn( THREE_INTEGER, $str119$empty_horizon_for__s_in_iteration, searcher, $search_iteration$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 14926L)
  public static SubLObject default_link_op(final SubLObject assertion, SubLObject searcher, SubLObject ancestor)
  {
    if( searcher == UNPROVIDED )
    {
      searcher = $kbp_searcher$.getDynamicValue();
    }
    if( ancestor == UNPROVIDED )
    {
      ancestor = $kbp_ancestor$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Functions.funcall( $relevant_linkP$.getDynamicValue( thread ), assertion ) )
    {
      $kbp_link_count$.setDynamicValue( Numbers.add( $kbp_link_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      kbp_record_ancestor( assertion, searcher, ancestor, UNPROVIDED );
      if( NIL == kbp_searched_byP( assertion, searcher, UNPROVIDED ) )
      {
        kbp_mark_as_searched_by( assertion, searcher, UNPROVIDED );
        do_link_nodes( assertion, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 15302L)
  public static SubLObject default_node_op(final SubLObject fort, SubLObject searcher, SubLObject ancestor)
  {
    if( searcher == UNPROVIDED )
    {
      searcher = $kbp_searcher$.getDynamicValue();
    }
    if( ancestor == UNPROVIDED )
    {
      ancestor = $kbp_ancestor$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Functions.funcall( $relevant_nodeP$.getDynamicValue( thread ), fort ) )
    {
      $kbp_term_count$.setDynamicValue( Numbers.add( $kbp_term_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      kbp_record_ancestor( fort, searcher, ancestor, UNPROVIDED );
      if( NIL == kbp_searched_byP( fort, searcher, UNPROVIDED ) )
      {
        kbp_mark_as_searched_by( fort, searcher, UNPROVIDED );
        kbp_note( FOUR_INTEGER, $str120$___s_searched_by___s, fort, kbp_searched_by( fort ), UNPROVIDED, UNPROVIDED );
        if( NIL != kbp_searched_by_allP( fort, UNPROVIDED, UNPROVIDED ) )
        {
          $kbp_common_nodes$.setDynamicValue( ConsesLow.cons( fort, $kbp_common_nodes$.getDynamicValue( thread ) ), thread );
          kbp_note( ONE_INTEGER, $str121$___s______goal_________________, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL != $kbp_quit_with_successP$.getDynamicValue( thread ) )
          {
            $kbp_quitP$.setDynamicValue( $kw102$SUCCESS, thread );
          }
        }
        else
        {
          $path_horizon$.setDynamicValue( ConsesLow.cons( fort, $path_horizon$.getDynamicValue( thread ) ), thread );
        }
      }
      if( NIL != kbp_term_bound_metP() )
      {
        $kbp_quitP$.setDynamicValue( $kw122$TERM_BOUND, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 15996L)
  public static SubLObject do_link_nodes(final SubLObject assertion, SubLObject op, SubLObject do_opP)
  {
    if( op == UNPROVIDED )
    {
      op = $path_node_op$.getDynamicValue();
    }
    if( do_opP == UNPROVIDED )
    {
      do_opP = Symbols.symbol_function( $sym5$FORT_P );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = Functions.funcall( $nodes_accessor_fn$.getDynamicValue( thread ), assertion );
    SubLObject node = NIL;
    node = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != $kbp_quitP$.getDynamicValue( thread ) )
      {
        return NIL;
      }
      if( NIL == equal_nodesP( node, $kbp_ancestor$.getDynamicValue( thread ), UNPROVIDED ) && NIL != Functions.funcall( do_opP, node ) )
      {
        final SubLObject _prev_bind_0 = $kbp_ancestor$.currentBinding( thread );
        try
        {
          $kbp_ancestor$.bind( assertion, thread );
          Functions.funcall( op, node );
        }
        finally
        {
          $kbp_ancestor$.rebind( _prev_bind_0, thread );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      node = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 16336L)
  public static SubLObject default_relevant_linkP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mt_relevance_macros.relevant_assertionP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_external_link_predP$.getDynamicValue( thread ) && NIL == kbp_link_satisfies_external_predP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_only_gaf_linksP$.getDynamicValue( thread ) && NIL == assertions_high.gaf_assertionP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_designated_predsP$.getDynamicValue( thread ) && NIL != kbp_undesignated_pred_assertionP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_restricted_predsP$.getDynamicValue( thread ) && NIL != kbp_restricted_pred_assertionP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_restricted_mtsP$.getDynamicValue( thread ) && NIL != kbp_restricted_mt_assertionP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_no_bi_scoping_linksP$.getDynamicValue( thread ) && NIL != kbp_bi_scoping_linkP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_bound_gaf_termsP$.getDynamicValue( thread ) && NIL != kbp_gaf_term_beyond_boundP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_bound_link_termsP$.getDynamicValue( thread ) && NIL != kbp_link_term_beyond_boundP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_link_reference_set_boundP$.getDynamicValue( thread ) && NIL != kbp_link_terms_beyond_reference_set_boundP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_designated_link_referencesP$.getDynamicValue( thread ) && NIL != kbp_link_terms_wXo_referencesP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_use_max_mtsP$.getDynamicValue( thread ) && NIL != kbp_link_wXo_max_mtP( link ) )
    {
      return NIL;
    }
    if( NIL != kbp_excluded_linkP( link ) )
    {
      return NIL;
    }
    if( NIL != $kbp_no_bookkeeping_linksP$.getDynamicValue( thread ) && NIL != bookkeeping_gaf_assertionP( link ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 17560L)
  public static SubLObject default_relevant_nodeP(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( node ) )
    {
      return NIL;
    }
    if( NIL != equal_nodesP( node, $kbp_searcher$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != fort_types_interface.non_predicate_functionP( node ) )
    {
      return NIL;
    }
    if( NIL != $kbp_no_bi_scoping_linksP$.getDynamicValue( thread ) && NIL != kbp_bi_scoping_nodeP( node ) )
    {
      return NIL;
    }
    if( NIL != $kbp_genl_boundP$.getDynamicValue( thread ) && NIL != kbp_beyond_genl_boundP( node ) )
    {
      return NIL;
    }
    if( NIL != $kbp_isa_boundP$.getDynamicValue( thread ) && NIL != kbp_beyond_isa_boundP( node ) )
    {
      return NIL;
    }
    if( NIL != $kbp_node_isa_boundP$.getDynamicValue( thread ) && NIL != kbp_node_beyond_isa_boundP( node ) )
    {
      return NIL;
    }
    if( NIL != $kbp_designated_node_superiorsP$.getDynamicValue( thread ) && NIL != kbp_undesignated_node_superiorP( node ) )
    {
      return NIL;
    }
    if( NIL != $kbp_restricted_nodes_as_argP$.getDynamicValue( thread ) && NIL != kbp_node_restricted_as_argP( node ) )
    {
      return NIL;
    }
    if( NIL != kbp_excluded_nodeP( node ) )
    {
      return NIL;
    }
    if( NIL != $kbp_genls_cardinality_delta_boundP$.getDynamicValue( thread ) && NIL != kbp_beyond_genls_cardinality_delta_boundP( node ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 18429L)
  public static SubLObject kbp_beyond_genls_cardinality_delta_boundP(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != fort_types_interface.collectionP( node ) )
    {
      final SubLObject spec_cardinality = cardinality_estimates.spec_cardinality( node );
      if( spec_cardinality.isInteger() )
      {
        return Numbers.numG( spec_cardinality, Sequences.creduce( $sym123$_, list_utilities.remove_if_not( $sym124$INTEGERP, ConsesLow.cons( $kbp_genls_cardinality_delta_bound$.getDynamicValue( thread ), Mapping.mapcar(
            $sym125$SPEC_CARDINALITY, $kbp_searchers$.getDynamicValue( thread ) ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 18801L)
  public static SubLObject kbp_beyond_genl_boundP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return genls.any_specP( fort, $kbp_genl_bound$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 18883L)
  public static SubLObject kbp_beyond_isa_boundP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return isa.isa_anyP( fort, $kbp_isa_bound$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 18962L)
  public static SubLObject kbp_undesignated_node_superiorP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kbp_designated_node_superiors$.getDynamicValue( thread ) )
    {
      return makeBoolean( NIL == isa.isa_anyP( fort, $kbp_designated_node_superiors$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) && NIL == sbhl_search_methods.sbhl_predicate_relation_with_any_p(
          sbhl_module_utilities.determine_sbhl_module_from_fort_type( fort, UNPROVIDED ), fort, $kbp_designated_node_superiors$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 19263L)
  public static SubLObject kbp_node_restricted_as_argP(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( node ) )
    {
      SubLObject restrictedP = NIL;
      if( NIL == restrictedP )
      {
        SubLObject csome_list_var;
        SubLObject predXarg;
        for( csome_list_var = $kbp_restricted_nodes_as_arg$.getDynamicValue( thread ), predXarg = NIL, predXarg = csome_list_var.first(); NIL == restrictedP && NIL != csome_list_var; restrictedP = kb_mapping_utilities
            .some_pred_value( node, predXarg.first(), conses_high.second( predXarg ), UNPROVIDED ), csome_list_var = csome_list_var.rest(), predXarg = csome_list_var.first() )
        {
        }
      }
      return restrictedP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 19527L)
  public static SubLObject kbp_node_beyond_isa_boundP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return isa.isa_anyP( fort, $kbp_node_isa_bound$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 19616L)
  public static SubLObject kbp_gaf_term_beyond_boundP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject beyondP = NIL;
    if( NIL != assertions_high.gaf_assertionP( link ) )
    {
      if( NIL == beyondP )
      {
        SubLObject csome_list_var;
        SubLObject arg;
        for( csome_list_var = $kbp_bound_gaf_terms$.getDynamicValue( thread ), arg = NIL, arg = csome_list_var.first(); NIL == beyondP && NIL != csome_list_var; beyondP = kbp_beyond_isa_boundP( assertions_high.gaf_arg(
            link, arg ) ), csome_list_var = csome_list_var.rest(), arg = csome_list_var.first() )
        {
        }
      }
      if( NIL == beyondP )
      {
        SubLObject csome_list_var;
        SubLObject arg;
        for( csome_list_var = $kbp_bound_gaf_terms$.getDynamicValue( thread ), arg = NIL, arg = csome_list_var.first(); NIL == beyondP && NIL != csome_list_var; beyondP = kbp_beyond_genl_boundP( assertions_high.gaf_arg(
            link, arg ) ), csome_list_var = csome_list_var.rest(), arg = csome_list_var.first() )
        {
        }
      }
    }
    return beyondP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 19965L)
  public static SubLObject kbp_undesignated_pred_assertionP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kbp_designated_preds$.getDynamicValue( thread ) && NIL != assertions_high.gaf_assertionP( link ) )
    {
      return makeBoolean( NIL == subl_promotions.memberP( assertions_high.gaf_arg0( link ), $kbp_designated_preds$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 20144L)
  public static SubLObject kbp_restricted_pred_assertionP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kbp_restricted_preds$.getDynamicValue( thread ) && NIL != assertions_high.gaf_assertionP( link ) )
    {
      return subl_promotions.memberP( assertions_high.gaf_arg0( link ), $kbp_restricted_preds$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 20313L)
  public static SubLObject kbp_restricted_mt_assertionP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kbp_restricted_mtsP$.getDynamicValue( thread ) && NIL != assertion_handles.assertion_p( link ) )
    {
      return subl_promotions.memberP( assertions_high.assertion_mt( link ), $kbp_restricted_mts$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 20478L)
  public static SubLObject kbp_link_terms_beyond_reference_set_boundP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject beyondP = NIL;
    if( NIL != term.kb_assertionP( link ) )
    {
      final SubLObject assertion_terms = all_assertion_references( link, UNPROVIDED );
      if( NIL == beyondP )
      {
        SubLObject csome_list_var = $kbp_link_reference_set_bound$.getDynamicValue( thread );
        SubLObject term_set = NIL;
        term_set = csome_list_var.first();
        while ( NIL == beyondP && NIL != csome_list_var)
        {
          SubLObject missedP = NIL;
          if( NIL == missedP )
          {
            SubLObject csome_list_var_$14;
            SubLObject v_term;
            for( csome_list_var_$14 = term_set, v_term = NIL, v_term = csome_list_var_$14.first(); NIL == missedP && NIL != csome_list_var_$14; missedP = makeBoolean( NIL == subl_promotions.memberP( v_term,
                assertion_terms, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ), csome_list_var_$14 = csome_list_var_$14.rest(), v_term = csome_list_var_$14.first() )
            {
            }
          }
          beyondP = makeBoolean( NIL == missedP );
          csome_list_var = csome_list_var.rest();
          term_set = csome_list_var.first();
        }
      }
    }
    return beyondP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 20897L)
  public static SubLObject kbp_link_terms_wXo_referencesP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kbp_designated_link_references$.getDynamicValue( thread ) )
    {
      SubLObject foundP = NIL;
      if( NIL != term.kb_assertionP( link ) )
      {
        final SubLObject assertion_terms = all_assertion_references( link, UNPROVIDED );
        if( NIL == foundP )
        {
          SubLObject csome_list_var;
          SubLObject v_term;
          for( csome_list_var = $kbp_designated_link_references$.getDynamicValue( thread ), v_term = NIL, v_term = csome_list_var.first(); NIL == foundP && NIL != csome_list_var; foundP = subl_promotions.memberP( v_term,
              assertion_terms, Symbols.symbol_function( EQUAL ), UNPROVIDED ), csome_list_var = csome_list_var.rest(), v_term = csome_list_var.first() )
          {
          }
        }
      }
      return makeBoolean( NIL == foundP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 21252L)
  public static SubLObject kbp_link_satisfies_external_predP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == Symbols.fboundp( $kbp_external_link_pred$.getDynamicValue( thread ) ) || NIL != Functions.funcall( $kbp_external_link_pred$.getDynamicValue( thread ), link ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 21400L)
  public static SubLObject kbp_link_term_beyond_boundP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject beyondP = NIL;
    if( NIL != term.kb_assertionP( link ) && NIL == beyondP )
    {
      SubLObject csome_list_var = $kbp_bound_link_terms$.getDynamicValue( thread );
      SubLObject index = NIL;
      index = csome_list_var.first();
      while ( NIL == beyondP && NIL != csome_list_var)
      {
        final SubLObject terms = assertion_indexed_by( link, index );
        if( NIL == beyondP )
        {
          SubLObject csome_list_var_$15;
          SubLObject v_term;
          for( csome_list_var_$15 = terms, v_term = NIL, v_term = csome_list_var_$15.first(); NIL == beyondP && NIL != csome_list_var_$15; beyondP = kbp_beyond_isa_boundP(
              v_term ), csome_list_var_$15 = csome_list_var_$15.rest(), v_term = csome_list_var_$15.first() )
          {
          }
        }
        if( NIL == beyondP )
        {
          SubLObject v_term;
          SubLObject csome_list_var_$16;
          for( csome_list_var_$16 = terms, v_term = NIL, v_term = csome_list_var_$16.first(); NIL == beyondP && NIL != csome_list_var_$16; beyondP = kbp_beyond_genl_boundP(
              v_term ), csome_list_var_$16 = csome_list_var_$16.rest(), v_term = csome_list_var_$16.first() )
          {
          }
        }
        csome_list_var = csome_list_var.rest();
        index = csome_list_var.first();
      }
    }
    return beyondP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 21788L)
  public static SubLObject kbp_link_wXo_max_mtP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject violationP = NIL;
    if( NIL != term.kb_assertionP( link ) )
    {
      final SubLObject clause_struc = assertions_low.assertion_clause_struc( link );
      final SubLObject mt = assertions_high.assertion_mt( link );
      final SubLObject _prev_bind_0 = $kbp_use_max_mtsP$.currentBinding( thread );
      try
      {
        $kbp_use_max_mtsP$.bind( NIL, thread );
        if( NIL != clause_struc )
        {
          SubLObject rest;
          SubLObject similar_assertion;
          SubLObject other_mt;
          for( rest = NIL, rest = clause_strucs.clause_struc_assertions( clause_struc ); NIL == violationP && NIL != rest; rest = rest.rest() )
          {
            similar_assertion = rest.first();
            if( !link.eql( similar_assertion ) )
            {
              other_mt = assertions_high.assertion_mt( similar_assertion );
              if( NIL != mt_relevance_macros.relevant_mtP( other_mt ) && NIL != genl_mts.genl_mtP( mt, other_mt, UNPROVIDED, UNPROVIDED ) && NIL == genl_mts.genl_mtP( other_mt, mt, UNPROVIDED, UNPROVIDED ) )
              {
                violationP = Functions.funcall( $relevant_linkP$.getDynamicValue( thread ), similar_assertion );
              }
            }
          }
        }
      }
      finally
      {
        $kbp_use_max_mtsP$.rebind( _prev_bind_0, thread );
      }
    }
    return violationP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 22452L)
  public static SubLObject kbp_bi_scoping_linkP(final SubLObject assertion)
  {
    final SubLObject result = kbp_bi_scoping_link_1P( assertion );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 22567L)
  public static SubLObject kbp_bi_scoping_link_1P(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $search_iteration$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
    {
      final SubLObject bi_scopicP = NIL;
      if( NIL == bi_scopicP )
      {
        SubLObject csome_list_var = ConsesLow.cons( $kbp_ancestor$.getDynamicValue( thread ), kbp_ancestors_via_all( assertion, UNPROVIDED ) );
        SubLObject node = NIL;
        node = csome_list_var.first();
        while ( NIL == bi_scopicP && NIL != csome_list_var)
        {
          final SubLObject scope_direction = scope_direction( assertion, node );
          if( NIL != scope_direction )
          {
            if( NIL != Sequences.remove( $kbp_searcher$.getDynamicValue( thread ), kbp_searched_by( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              return T;
            }
            if( NIL == bi_scopicP )
            {
              SubLObject csome_list_var_$17 = kbp_ancestors_via_all( node, UNPROVIDED );
              SubLObject assertion_1 = NIL;
              assertion_1 = csome_list_var_$17.first();
              while ( NIL == bi_scopicP && NIL != csome_list_var_$17)
              {
                if( NIL == bi_scopicP )
                {
                  SubLObject csome_list_var_$18 = kbp_ancestors_via_all( assertion_1, UNPROVIDED );
                  SubLObject node_1 = NIL;
                  node_1 = csome_list_var_$18.first();
                  while ( NIL == bi_scopicP && NIL != csome_list_var_$18)
                  {
                    final SubLObject scope_direction_1 = scope_direction( assertion_1, node_1 );
                    if( NIL != scope_direction_1 && !scope_direction.eql( scope_direction_1 ) )
                    {
                      return T;
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 23320L)
  public static SubLObject kbp_bi_scoping_nodeP(final SubLObject node)
  {
    final SubLObject result = kbp_bi_scoping_node_1P( node );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 23425L)
  public static SubLObject kbp_bi_scoping_node_1P(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $search_iteration$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
    {
      final SubLObject bi_scopicP = NIL;
      final SubLObject searchers = conses_high.adjoin( $kbp_searcher$.getDynamicValue( thread ), kbp_searched_by( node ), UNPROVIDED, UNPROVIDED );
      if( NIL == bi_scopicP )
      {
        SubLObject csome_list_var = ConsesLow.cons( $kbp_ancestor$.getDynamicValue( thread ), kbp_ancestors_via_all( node, UNPROVIDED ) );
        SubLObject assertion = NIL;
        assertion = csome_list_var.first();
        while ( NIL == bi_scopicP && NIL != csome_list_var)
        {
          final SubLObject scope_direction = scope_direction( assertion, node );
          if( NIL != scope_direction )
          {
            if( NIL != Sequences.remove( $kbp_searcher$.getDynamicValue( thread ), kbp_searched_by( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              return T;
            }
            if( NIL == bi_scopicP )
            {
              SubLObject csome_list_var_$19 = kbp_ancestors_via_all( assertion, UNPROVIDED );
              SubLObject node_1 = NIL;
              node_1 = csome_list_var_$19.first();
              while ( NIL == bi_scopicP && NIL != csome_list_var_$19)
              {
                if( NIL == bi_scopicP )
                {
                  SubLObject csome_list_var_$20 = kbp_ancestors_via_all( node_1, UNPROVIDED );
                  SubLObject assertion_1 = NIL;
                  assertion_1 = csome_list_var_$20.first();
                  while ( NIL == bi_scopicP && NIL != csome_list_var_$20)
                  {
                    final SubLObject scope_direction_1 = scope_direction( assertion_1, node_1 );
                    if( NIL != scope_direction_1 )
                    {
                      final SubLObject searchers_1 = kbp_searched_by( assertion_1 );
                      if( NIL == list_utilities.singletonP( searchers ) )
                      {
                        return T;
                      }
                      if( scope_direction.eql( scope_direction_1 ) )
                      {
                        return Equality.equal( searchers, searchers_1 );
                      }
                      if( searchers.equal( searchers_1 ) )
                      {
                        return T;
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 24388L)
  public static SubLObject scope_direction(final SubLObject assertion, final SubLObject v_term)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      final SubLObject literal = assertions_high.gaf_formula( assertion );
      final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
      final SubLObject arg = Sequences.position( v_term, literal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject pcase_var = predicate;
      if( pcase_var.eql( $const126$genls ) )
      {
        final SubLObject pcase_var_$21 = arg;
        if( pcase_var_$21.eql( ONE_INTEGER ) )
        {
          return $kw127$UP;
        }
        if( pcase_var_$21.eql( TWO_INTEGER ) )
        {
          return $kw128$DOWN;
        }
      }
      else if( pcase_var.eql( $const129$isa ) )
      {
        final SubLObject pcase_var_$22 = arg;
        if( pcase_var_$22.eql( ONE_INTEGER ) )
        {
          return $kw127$UP;
        }
        if( pcase_var_$22.eql( TWO_INTEGER ) )
        {
          return $kw128$DOWN;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 24743L)
  public static SubLObject default_relevant_link_treeP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kbp_no_bookkeeping_linksP$.getDynamicValue( thread ) && NIL != bookkeeping_btreeP( v_object ) )
    {
      return NIL;
    }
    if( NIL != $kbp_no_instance_linksP$.getDynamicValue( thread ) && NIL != instance_btreeP( v_object ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 24966L)
  public static SubLObject do_if_term_assertions(final SubLObject v_term, SubLObject op, SubLObject do_opP, SubLObject climb_treeP)
  {
    if( op == UNPROVIDED )
    {
      op = $path_link_op$.getDynamicValue();
    }
    if( do_opP == UNPROVIDED )
    {
      do_opP = Symbols.symbol_function( IDENTITY );
    }
    if( climb_treeP == UNPROVIDED )
    {
      climb_treeP = Symbols.symbol_function( IDENTITY );
    }
    obsolete_tree_do_if( kb_accessors.all_term_assertions( v_term, UNPROVIDED ), op, do_opP, climb_treeP, Symbols.symbol_function( IDENTITY ), NIL );
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 25303L)
  public static SubLObject obsolete_tree_do_if(final SubLObject v_object, final SubLObject op, SubLObject do_opP, SubLObject climb_treeP, SubLObject key, SubLObject subs_tooP)
  {
    if( do_opP == UNPROVIDED )
    {
      do_opP = Symbols.symbol_function( $sym7$ASSERTION_P );
    }
    if( climb_treeP == UNPROVIDED )
    {
      climb_treeP = Symbols.symbol_function( IDENTITY );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( subs_tooP == UNPROVIDED )
    {
      subs_tooP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $kbp_quitP$.getDynamicValue( thread ) )
    {
      if( NIL != Functions.funcall( do_opP, Functions.funcall( key, v_object ) ) )
      {
        Functions.funcall( op, v_object );
        if( NIL == subs_tooP )
        {
          if( NIL != $kbp_explode_natsP$.getDynamicValue( thread ) && NIL != assertion_handles.assertion_p( v_object ) && NIL != function_terms.tou_assertionP( v_object ) )
          {
            final SubLObject _prev_bind_0 = $kbp_explode_natsP$.currentBinding( thread );
            try
            {
              $kbp_explode_natsP$.bind( NIL, thread );
              final SubLObject node = assertions_high.gaf_arg1( v_object );
              if( NIL != Functions.funcall( $relevant_nodeP$.getDynamicValue( thread ), node ) )
              {
                do_if_term_assertions( node, op, do_opP, climb_treeP );
              }
            }
            finally
            {
              $kbp_explode_natsP$.rebind( _prev_bind_0, thread );
            }
          }
          return NIL;
        }
      }
      if( v_object.isCons() )
      {
        SubLObject list = NIL;
        SubLObject sub = NIL;
        list = v_object;
        sub = list.first();
        while ( list.rest().isCons())
        {
          obsolete_tree_do_if( sub, op, do_opP, climb_treeP, key, subs_tooP );
          list = list.rest();
          sub = list.first();
        }
        obsolete_tree_do_if( list.first(), op, do_opP, climb_treeP, key, subs_tooP );
        if( NIL != list.rest() )
        {
          obsolete_tree_do_if( list.rest(), op, do_opP, climb_treeP, key, subs_tooP );
        }
      }
      else if( NIL != binary_tree.btree_p( v_object ) )
      {
        obsolete_tree_do_if( binary_tree.bt_lower( v_object ), op, do_opP, climb_treeP, key, subs_tooP );
        obsolete_tree_do_if( binary_tree.bt_higher( v_object ), op, do_opP, climb_treeP, key, subs_tooP );
        if( NIL != Functions.funcall( climb_treeP, v_object ) )
        {
          obsolete_tree_do_if( binary_tree.bt_tag( v_object ), op, do_opP, climb_treeP, key, subs_tooP );
          obsolete_tree_do_if( binary_tree.bt_state( v_object ), op, do_opP, climb_treeP, key, subs_tooP );
        }
      }
      else if( NIL != assertion_handles.assertion_p( v_object ) )
      {
        obsolete_tree_do_if( assertions_low.assertion_formula_data( v_object ), op, do_opP, climb_treeP, key, subs_tooP );
        obsolete_tree_do_if( assertions_high.assertion_mt( v_object ), op, do_opP, climb_treeP, key, subs_tooP );
        obsolete_tree_do_if( assertions_high.assertion_variable_names( v_object ), op, do_opP, climb_treeP, key, subs_tooP );
      }
      else if( NIL != clause_strucs.clause_struc_p( v_object ) )
      {
        obsolete_tree_do_if( clause_strucs.clause_struc_cnf( v_object ), op, do_opP, climb_treeP, key, subs_tooP );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 27057L)
  public static SubLObject assertion_indexed_by(final SubLObject assertion, final SubLObject index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject neg_pairs = kb_indexing.determine_rule_indices( assertions_high.assertion_cnf( assertion ) );
    final SubLObject pos_pairs = thread.secondMultipleValue();
    final SubLObject other = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( index.eql( $kw130$NEG ) )
    {
      return Mapping.mapcar( Symbols.symbol_function( $sym131$SECOND ), neg_pairs );
    }
    if( index.eql( $kw132$POS ) )
    {
      return Mapping.mapcar( Symbols.symbol_function( $sym131$SECOND ), pos_pairs );
    }
    if( index.eql( $kw133$OTHER ) )
    {
      return other;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 27356L)
  public static SubLObject all_assertion_terms(final SubLObject assertion, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    SubLObject terms = NIL;
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    SubLObject cdolist_list_var = clauses.pos_lits( cnf );
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$23 = cycl_utilities.all_literal_terms( literal, UNPROVIDED );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var_$23.first();
      while ( NIL != cdolist_list_var_$23)
      {
        final SubLObject item_var = v_term;
        if( NIL == conses_high.member( item_var, terms, test, Symbols.symbol_function( IDENTITY ) ) )
        {
          terms = ConsesLow.cons( item_var, terms );
        }
        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
        v_term = cdolist_list_var_$23.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    cdolist_list_var = clauses.neg_lits( cnf );
    literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$24 = cycl_utilities.all_literal_terms( literal, UNPROVIDED );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var_$24.first();
      while ( NIL != cdolist_list_var_$24)
      {
        final SubLObject item_var = v_term;
        if( NIL == conses_high.member( item_var, terms, test, Symbols.symbol_function( IDENTITY ) ) )
        {
          terms = ConsesLow.cons( item_var, terms );
        }
        cdolist_list_var_$24 = cdolist_list_var_$24.rest();
        v_term = cdolist_list_var_$24.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    cdolist_list_var = terms;
    SubLObject v_term2 = NIL;
    v_term2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != forts.fort_p( v_term2 ) )
      {
        final SubLObject nat = function_terms.term_of_unit( v_term2 );
        SubLObject cdolist_list_var_$25 = cycl_utilities.nat_args( nat, UNPROVIDED );
        SubLObject nat_term = NIL;
        nat_term = cdolist_list_var_$25.first();
        while ( NIL != cdolist_list_var_$25)
        {
          final SubLObject item_var2 = nat_term;
          if( NIL == conses_high.member( item_var2, terms, test, Symbols.symbol_function( IDENTITY ) ) )
          {
            terms = ConsesLow.cons( item_var2, terms );
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
  public static SubLObject all_assertion_references(final SubLObject assertion, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return Sequences.remove_duplicates( list_utilities.flatten( fi.assertion_fi_formula( assertion, UNPROVIDED ) ), test, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 28148L)
  public static SubLObject clear_kb_paths()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $kbp_quitP$.setDynamicValue( NIL, thread );
    $kbp_stats$.setDynamicValue( NIL, thread );
    $kbp_common_nodes$.setDynamicValue( NIL, thread );
    $kbp_run_time$.setDynamicValue( NIL, thread );
    Hashtables.clrhash( $kbp_ancestor_hash$.getDynamicValue( thread ) );
    Hashtables.clrhash( $kbp_search_hash$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 28364L)
  public static SubLObject kbp_stats(final SubLObject v_kb_paths)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $kbp_stats$.setDynamicValue( ConsesLow.list( new SubLObject[] { $kbp_result_format$.getDynamicValue( thread ), Sequences.length( v_kb_paths ), $kw134$DEPTH, ( NIL != v_kb_paths ) ? number_utilities.float_n( Numbers
        .divide( paths_link_count( v_kb_paths ), Sequences.length( v_kb_paths ) ), ONE_INTEGER ) : NIL, $kw135$ITERATIONS, $search_iteration$.getDynamicValue( thread ), $kw136$TERMS, $kbp_term_count$.getDynamicValue(
            thread ), $kw137$NODES, $kbp_node_count$.getDynamicValue( thread ), $kw111$LINKS, $kbp_link_count$.getDynamicValue( thread ), $kw138$BRANCH, $kbp_node_count$.getDynamicValue( thread ).numG( ZERO_INTEGER )
                ? number_utilities.float_n( Numbers.divide( $kbp_link_count$.getDynamicValue( thread ), $kbp_node_count$.getDynamicValue( thread ) ), ONE_INTEGER )
                : NIL, $kw139$TIME, $kbp_run_time$.getDynamicValue( thread ).isNumber() ? number_utilities.float_n( $kbp_run_time$.getDynamicValue( thread ), ONE_INTEGER ) : NIL, $kw140$TERMINATION, $kbp_quitP$
                    .getDynamicValue( thread )
    } ), thread );
    return $kbp_stats$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 28908L)
  public static SubLObject kbp_node_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return kbp_searched_object_count( $kbp_nodeP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 28984L)
  public static SubLObject kbp_link_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return kbp_searched_object_count( $kbp_linkP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29060L)
  public static SubLObject kbp_searched_object_count(final SubLObject fn)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject cdohash_table = $kbp_search_hash$.getDynamicValue( thread );
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        if( NIL != Functions.funcall( fn, key ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29243L)
  public static SubLObject next_iteration()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $search_iteration$.setDynamicValue( Numbers.add( $search_iteration$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    utilities_macros.note_percent_progress( $search_iteration$.getDynamicValue( thread ), $max_search_iterations$.getDynamicValue( thread ) );
    return $search_iteration$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29395L)
  public static SubLObject kbp_give_upP(final SubLObject v_iteration, final SubLObject horizon1, final SubLObject horizon2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $kbp_quitP$.getDynamicValue( thread ) )
    {
      if( NIL != kbp_exhaustedP( horizon1, horizon2 ) )
      {
        $kbp_quitP$.setDynamicValue( $kw141$EXHAUST, thread );
      }
      else if( NIL != kbp_iteration_bound_metP( v_iteration ) )
      {
        $kbp_quitP$.setDynamicValue( $kw142$ITERATION_BOUND, thread );
      }
      else if( NIL != kbp_term_bound_metP() )
      {
        $kbp_quitP$.setDynamicValue( $kw122$TERM_BOUND, thread );
      }
    }
    return $kbp_quitP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29727L)
  public static SubLObject kbp_exhaustedP(final SubLObject horizon1, final SubLObject horizon2)
  {
    return makeBoolean( NIL == horizon1 && NIL == horizon2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29819L)
  public static SubLObject kbp_iteration_bound_metP(final SubLObject v_iteration)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( v_iteration.isNumber() && $max_search_iterations$.getDynamicValue( thread ).isNumber() )
    {
      return Numbers.numGE( v_iteration, $max_search_iterations$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 29986L)
  public static SubLObject kbp_term_bound_metP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kbp_term_count$.getDynamicValue( thread ).isNumber() && $kbp_max_term_count$.getDynamicValue( thread ).isNumber() )
    {
      return Numbers.numGE( $kbp_term_count$.getDynamicValue( thread ), $kbp_max_term_count$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30147L)
  public static SubLObject paths_link_count(final SubLObject paths)
  {
    SubLObject n = ZERO_INTEGER;
    SubLObject cdolist_list_var = list_utilities.flatten( paths );
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( element ) )
      {
        n = Numbers.add( n, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return n;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30296L)
  public static SubLObject kbp_searcherP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( fort, $kbp_searchers$.getDynamicValue( thread ), Symbols.symbol_function( $sym143$EQUAL_NODES_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30381L)
  public static SubLObject equal_nodesP(final SubLObject node1, final SubLObject node2, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = $node_equalP$.getDynamicValue();
    }
    return Functions.funcall( test, node1, node2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30484L)
  public static SubLObject instance_btreeP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != binary_tree.btree_p( v_object ) && $term_arg$.getDynamicValue( thread ).eql( TWO_INTEGER ) && binary_tree.bt_tag( v_object ).eql( $const129$isa ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30610L)
  public static SubLObject bookkeeping_btreeP(final SubLObject v_object)
  {
    return makeBoolean( NIL != binary_tree.btree_p( v_object ) && NIL != fort_types_interface.bookkeeping_predicate_p( binary_tree.bt_tag( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 30728L)
  public static SubLObject kbp_record_ancestor(final SubLObject v_object, SubLObject searcher, SubLObject ancestor, SubLObject test)
  {
    if( searcher == UNPROVIDED )
    {
      searcher = $kbp_searcher$.getDynamicValue();
    }
    if( ancestor == UNPROVIDED )
    {
      ancestor = $kbp_ancestor$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    hash_table_utilities.pushnew_hash( ConsesLow.list( v_object, searcher ), ancestor, $kbp_ancestor_hash$.getDynamicValue( thread ), test );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 31068L)
  public static SubLObject kbp_ancestors(final SubLObject v_object, SubLObject searcher)
  {
    if( searcher == UNPROVIDED )
    {
      searcher = $kbp_searcher$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( ConsesLow.list( v_object, searcher ), $kbp_ancestor_hash$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 31198L)
  public static SubLObject kbp_ancestors_via_all(final SubLObject v_object, SubLObject searchers)
  {
    if( searchers == UNPROVIDED )
    {
      searchers = $kbp_searchers$.getDynamicValue();
    }
    SubLObject ancestors = NIL;
    SubLObject cdolist_list_var = searchers;
    SubLObject searcher = NIL;
    searcher = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ancestors = conses_high.nunion( ancestors, conses_high.copy_list( kbp_ancestors( v_object, searcher ) ), UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      searcher = cdolist_list_var.first();
    }
    return ancestors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 31440L)
  public static SubLObject kbp_ancestorP(final SubLObject v_object, SubLObject searcher, SubLObject ancestor, SubLObject test)
  {
    if( searcher == UNPROVIDED )
    {
      searcher = $kbp_searcher$.getDynamicValue();
    }
    if( ancestor == UNPROVIDED )
    {
      ancestor = $kbp_ancestor$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    return subl_promotions.memberP( ancestor, kbp_ancestors( v_object, searcher ), test, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 31614L)
  public static SubLObject kbp_ancestor_via_anyP(final SubLObject v_object, SubLObject searchers, SubLObject ancestor, SubLObject test)
  {
    if( searchers == UNPROVIDED )
    {
      searchers = $kbp_searchers$.getDynamicValue();
    }
    if( ancestor == UNPROVIDED )
    {
      ancestor = $kbp_ancestor$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    SubLObject ancestorP = NIL;
    if( NIL == ancestorP )
    {
      SubLObject csome_list_var;
      SubLObject searcher;
      for( csome_list_var = searchers, searcher = NIL, searcher = csome_list_var.first(); NIL == ancestorP && NIL != csome_list_var; ancestorP = kbp_ancestorP( v_object, searcher, ancestor,
          test ), csome_list_var = csome_list_var.rest(), searcher = csome_list_var.first() )
      {
      }
    }
    return ancestorP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 31888L)
  public static SubLObject kbp_searchedP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( v_object, $kbp_search_hash$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32015L)
  public static SubLObject kbp_searched_byP(final SubLObject v_object, SubLObject searcher, SubLObject test)
  {
    if( searcher == UNPROVIDED )
    {
      searcher = $kbp_searcher$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return subl_promotions.memberP( searcher, kbp_searched_by( v_object ), test, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32157L)
  public static SubLObject kbp_searched_by_allP(final SubLObject v_object, SubLObject searchers, SubLObject test)
  {
    if( searchers == UNPROVIDED )
    {
      searchers = $kbp_searchers$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return conses_high.subsetp( searchers, kbp_searched_by( v_object ), test, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32306L)
  public static SubLObject kbp_searched_by_anyP(final SubLObject v_object, SubLObject searchers, SubLObject test)
  {
    if( searchers == UNPROVIDED )
    {
      searchers = $kbp_searchers$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return list_utilities.intersectP( kbp_searched_by( v_object ), searchers, test, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32458L)
  public static SubLObject kbp_searched_by(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( v_object, $kbp_search_hash$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32536L)
  public static SubLObject kbp_all_searched_by(SubLObject searcher)
  {
    if( searcher == UNPROVIDED )
    {
      searcher = $kbp_searcher$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject cdohash_table = $kbp_search_hash$.getDynamicValue( thread );
    SubLObject v_object = NIL;
    SubLObject searched_by_list = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        v_object = Hashtables.getEntryKey( cdohash_entry );
        searched_by_list = Hashtables.getEntryValue( cdohash_entry );
        if( NIL != subl_promotions.memberP( searcher, searched_by_list, UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.cons( v_object, result );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32770L)
  public static SubLObject kbp_mark_as_searched_by(final SubLObject v_object, SubLObject searcher, SubLObject test)
  {
    if( searcher == UNPROVIDED )
    {
      searcher = $kbp_searcher$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    hash_table_utilities.pushnew_hash( v_object, searcher, $kbp_search_hash$.getDynamicValue( thread ), test );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 32930L)
  public static SubLObject kbp_mark_as_unsearched_by(final SubLObject v_object, SubLObject searcher, SubLObject test)
  {
    if( searcher == UNPROVIDED )
    {
      searcher = $kbp_searcher$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    hash_table_utilities.delete_hash( v_object, searcher, $kbp_search_hash$.getDynamicValue( thread ), test, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33091L)
  public static SubLObject kbp_mark_as_searched_by_all(final SubLObject v_object, SubLObject searchers, SubLObject test)
  {
    if( searchers == UNPROVIDED )
    {
      searchers = $kbp_searchers$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    hash_table_utilities.nunion_hash( v_object, conses_high.copy_list( searchers ), $kbp_search_hash$.getDynamicValue( thread ), test );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33269L)
  public static SubLObject kbp_mark_as_unsearched_by_all(final SubLObject v_object, SubLObject searchers, SubLObject test)
  {
    if( searchers == UNPROVIDED )
    {
      searchers = $kbp_searchers$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    hash_table_utilities.nset_difference_hash( v_object, searchers, $kbp_search_hash$.getDynamicValue( thread ), test );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33446L)
  public static SubLObject kbp_mark_all_as_unsearched(final SubLObject objects)
  {
    SubLObject cdolist_list_var = objects;
    SubLObject v_object = NIL;
    v_object = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      kbp_mark_as_unsearched( v_object );
      cdolist_list_var = cdolist_list_var.rest();
      v_object = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33566L)
  public static SubLObject kbp_mark_as_unsearched(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.sethash( v_object, $kbp_search_hash$.getDynamicValue( thread ), NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33661L)
  public static SubLObject kbp_all_searched_by_all(SubLObject searchers, SubLObject test)
  {
    if( searchers == UNPROVIDED )
    {
      searchers = $kbp_searchers$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject cdohash_table = $kbp_search_hash$.getDynamicValue( thread );
    SubLObject v_object = NIL;
    SubLObject searched_by = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        v_object = Hashtables.getEntryKey( cdohash_entry );
        searched_by = Hashtables.getEntryValue( cdohash_entry );
        if( NIL != conses_high.subsetp( searchers, searched_by, test, UNPROVIDED ) )
        {
          result = ConsesLow.cons( v_object, result );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 33910L)
  public static SubLObject bookkeeping_gaf_assertionP(final SubLObject assertion)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      return fort_types_interface.bookkeeping_predicate_p( el_utilities.literal_predicate( assertions_high.gaf_formula( assertion ), UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34104L)
  public static SubLObject kbp_excluded_nodeP(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( node, $exclude_nodes$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34179L)
  public static SubLObject kbp_excluded_linkP(final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( link, $exclude_links$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34254L)
  public static SubLObject kbp_paths_links(final SubLObject paths)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = paths;
    SubLObject path = NIL;
    path = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = kbp_path_links( path );
      if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( $sym144$ASSERTIONS_FI_EQUAL_ ), Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( item_var, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      path = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34430L)
  public static SubLObject kbp_path_links(final SubLObject path)
  {
    if( path.isCons() )
    {
      SubLObject node = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( path, path, $list145 );
      node = path.first();
      SubLObject current = path.rest();
      final SubLObject link_path = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, path, $list145 );
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != link_path )
        {
          SubLObject current_$27;
          final SubLObject datum_$26 = current_$27 = link_path;
          SubLObject link = NIL;
          SubLObject node_path = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$27, datum_$26, $list146 );
          link = current_$27.first();
          current_$27 = current_$27.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$27, datum_$26, $list146 );
          node_path = current_$27.first();
          current_$27 = current_$27.rest();
          if( NIL == current_$27 )
          {
            return ConsesLow.cons( link, kbp_path_links( node_path ) );
          }
          cdestructuring_bind.cdestructuring_bind_error( datum_$26, $list146 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( path, $list145 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34685L)
  public static SubLObject kbp_paths_tuples(final SubLObject paths)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = paths;
    SubLObject path = NIL;
    path = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = kbp_path_tuples( path );
      if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( item_var, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      path = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 34848L)
  public static SubLObject kbp_path_tuples(final SubLObject path)
  {
    if( path.isCons() )
    {
      SubLObject node_1 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( path, path, $list147 );
      node_1 = path.first();
      SubLObject current = path.rest();
      final SubLObject link_path_1 = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, path, $list147 );
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != link_path_1 )
        {
          SubLObject current_$29;
          final SubLObject datum_$28 = current_$29 = link_path_1;
          SubLObject link_1 = NIL;
          SubLObject node_path_1 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$29, datum_$28, $list148 );
          link_1 = current_$29.first();
          current_$29 = current_$29.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$29, datum_$28, $list148 );
          node_path_1 = current_$29.first();
          current_$29 = current_$29.rest();
          if( NIL == current_$29 )
          {
            if( NIL != node_path_1 )
            {
              SubLObject current_$30;
              final SubLObject datum_$29 = current_$30 = node_path_1;
              SubLObject node_2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$30, datum_$29, $list149 );
              node_2 = current_$30.first();
              current_$30 = current_$30.rest();
              final SubLObject link_path_2 = current_$30.isCons() ? current_$30.first() : NIL;
              cdestructuring_bind.destructuring_bind_must_listp( current_$30, datum_$29, $list149 );
              current_$30 = current_$30.rest();
              if( NIL == current_$30 )
              {
                return ConsesLow.cons( ConsesLow.list( node_1, node_2, link_1 ), kbp_path_tuples( node_path_1 ) );
              }
              cdestructuring_bind.cdestructuring_bind_error( datum_$29, $list149 );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum_$28, $list148 );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( path, $list147 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 35247L)
  public static SubLObject kbp_justs_from_tuples(final SubLObject tuples_sets)
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym150$KBP_JUST_FROM_TUPLES ), tuples_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 35345L)
  public static SubLObject kbp_just_from_tuples(final SubLObject tuples)
  {
    return list_utilities.mapappend( Symbols.symbol_function( $sym151$KBP_JUST_FROM_TUPLE ), tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 35434L)
  public static SubLObject kbp_just_from_tuple(final SubLObject tuple)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 35497L)
  public static SubLObject make_gaf_assertion(final SubLObject gaf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    fi.fi_assert_int( gaf, mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    return kb_indexing.find_gaf( gaf, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 35782L)
  public static SubLObject kbp_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kbp_trace_level$.getDynamicValue( thread ).numGE( level ) )
    {
      PrintLow.format( T, format_str, new SubLObject[] { arg1, arg2, arg3, arg4
      } );
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 36018L)
  public static SubLObject kbp_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kbp_trace_level$.getDynamicValue( thread ).numGE( level ) )
    {
      Errors.cerror( $str152$continue_anyway, format_str, new SubLObject[] { arg1, arg2, arg3, arg4
      } );
    }
    else if( Numbers.add( TWO_INTEGER, $kbp_trace_level$.getDynamicValue( thread ) ).numGE( level ) )
    {
      Errors.warn( format_str, new SubLObject[] { arg1, arg2, arg3, arg4
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 36281L)
  public static SubLObject kbp_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kbp_trace_level$.getDynamicValue( thread ).numGE( level ) )
    {
      Functions.apply( $sym153$WARN, format_str, new SubLObject[] { arg1, arg2, arg3, arg4
      } );
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 36451L)
  public static SubLObject kbp_min_isa_paths(final SubLObject term_1, final SubLObject term_2, SubLObject mt, SubLObject depth_limitP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( depth_limitP == UNPROVIDED )
    {
      depth_limitP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject min_isa_ceilings = isa.min_ceiling_isa( ConsesLow.list( term_1, term_2 ), NIL, mt, UNPROVIDED );
    SubLObject paths = NIL;
    if( NIL != min_isa_ceilings )
    {
      final SubLObject _prev_bind_0 = $kbp_min_isa_pathP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $kbp_min_genls_pathP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = $kbp_no_bi_scoping_linksP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = $limit_path_depthP$.currentBinding( thread );
      final SubLObject _prev_bind_5 = $kbp_only_gaf_linksP$.currentBinding( thread );
      final SubLObject _prev_bind_6 = $kbp_designated_predsP$.currentBinding( thread );
      final SubLObject _prev_bind_7 = $kbp_designated_preds$.currentBinding( thread );
      final SubLObject _prev_bind_8 = $kbp_designated_node_superiorsP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = $kbp_designated_node_superiors$.currentBinding( thread );
      try
      {
        $kbp_min_isa_pathP$.bind( NIL, thread );
        $kbp_min_genls_pathP$.bind( NIL, thread );
        $kbp_no_bi_scoping_linksP$.bind( NIL, thread );
        $limit_path_depthP$.bind( depth_limitP, thread );
        $kbp_only_gaf_linksP$.bind( T, thread );
        $kbp_designated_predsP$.bind( T, thread );
        $kbp_designated_preds$.bind( $list154, thread );
        $kbp_designated_node_superiorsP$.bind( T, thread );
        $kbp_designated_node_superiors$.bind( min_isa_ceilings, thread );
        paths = kb_paths( term_1, term_2, mt );
      }
      finally
      {
        $kbp_designated_node_superiors$.rebind( _prev_bind_9, thread );
        $kbp_designated_node_superiorsP$.rebind( _prev_bind_8, thread );
        $kbp_designated_preds$.rebind( _prev_bind_7, thread );
        $kbp_designated_predsP$.rebind( _prev_bind_6, thread );
        $kbp_only_gaf_linksP$.rebind( _prev_bind_5, thread );
        $limit_path_depthP$.rebind( _prev_bind_4, thread );
        $kbp_no_bi_scoping_linksP$.rebind( _prev_bind_3, thread );
        $kbp_min_genls_pathP$.rebind( _prev_bind_2, thread );
        $kbp_min_isa_pathP$.rebind( _prev_bind_0, thread );
      }
    }
    return paths;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 37212L)
  public static SubLObject kbp_min_genls_paths(final SubLObject term_1, final SubLObject term_2, SubLObject mt, SubLObject depth_limitP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( depth_limitP == UNPROVIDED )
    {
      depth_limitP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject min_genls_ceilings = genls.min_ceiling_cols( ConsesLow.list( term_1, term_2 ), NIL, mt, UNPROVIDED );
    SubLObject paths = NIL;
    if( NIL != min_genls_ceilings )
    {
      final SubLObject _prev_bind_0 = $kbp_min_genls_pathP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $kbp_min_isa_pathP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = $kbp_no_bi_scoping_linksP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = $limit_path_depthP$.currentBinding( thread );
      final SubLObject _prev_bind_5 = $kbp_only_gaf_linksP$.currentBinding( thread );
      final SubLObject _prev_bind_6 = $kbp_designated_predsP$.currentBinding( thread );
      final SubLObject _prev_bind_7 = $kbp_designated_preds$.currentBinding( thread );
      final SubLObject _prev_bind_8 = $kbp_designated_node_superiorsP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = $kbp_designated_node_superiors$.currentBinding( thread );
      try
      {
        $kbp_min_genls_pathP$.bind( NIL, thread );
        $kbp_min_isa_pathP$.bind( NIL, thread );
        $kbp_no_bi_scoping_linksP$.bind( NIL, thread );
        $limit_path_depthP$.bind( depth_limitP, thread );
        $kbp_only_gaf_linksP$.bind( T, thread );
        $kbp_designated_predsP$.bind( T, thread );
        $kbp_designated_preds$.bind( $list155, thread );
        $kbp_designated_node_superiorsP$.bind( T, thread );
        $kbp_designated_node_superiors$.bind( min_genls_ceilings, thread );
        paths = kb_paths( term_1, term_2, mt );
      }
      finally
      {
        $kbp_designated_node_superiors$.rebind( _prev_bind_9, thread );
        $kbp_designated_node_superiorsP$.rebind( _prev_bind_8, thread );
        $kbp_designated_preds$.rebind( _prev_bind_7, thread );
        $kbp_designated_predsP$.rebind( _prev_bind_6, thread );
        $kbp_only_gaf_linksP$.rebind( _prev_bind_5, thread );
        $limit_path_depthP$.rebind( _prev_bind_4, thread );
        $kbp_no_bi_scoping_linksP$.rebind( _prev_bind_3, thread );
        $kbp_min_isa_pathP$.rebind( _prev_bind_2, thread );
        $kbp_min_genls_pathP$.rebind( _prev_bind_0, thread );
      }
    }
    return paths;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 37884L)
  public static SubLObject kbp_min_genl_mt_paths(final SubLObject term_1, final SubLObject term_2, SubLObject mt, SubLObject depth_limitP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( depth_limitP == UNPROVIDED )
    {
      depth_limitP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject min_genl_mts_ceilings = genl_mts.min_ceiling_mts( ConsesLow.list( term_1, term_2 ), NIL, mt );
    SubLObject paths = NIL;
    if( NIL != min_genl_mts_ceilings )
    {
      final SubLObject _prev_bind_0 = $kbp_min_genls_pathP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $kbp_min_isa_pathP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = $kbp_no_bi_scoping_linksP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = $limit_path_depthP$.currentBinding( thread );
      final SubLObject _prev_bind_5 = $kbp_only_gaf_linksP$.currentBinding( thread );
      final SubLObject _prev_bind_6 = $kbp_designated_predsP$.currentBinding( thread );
      final SubLObject _prev_bind_7 = $kbp_designated_preds$.currentBinding( thread );
      final SubLObject _prev_bind_8 = $kbp_designated_node_superiorsP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = $kbp_designated_node_superiors$.currentBinding( thread );
      try
      {
        $kbp_min_genls_pathP$.bind( NIL, thread );
        $kbp_min_isa_pathP$.bind( NIL, thread );
        $kbp_no_bi_scoping_linksP$.bind( NIL, thread );
        $limit_path_depthP$.bind( depth_limitP, thread );
        $kbp_only_gaf_linksP$.bind( T, thread );
        $kbp_designated_predsP$.bind( T, thread );
        $kbp_designated_preds$.bind( $list156, thread );
        $kbp_designated_node_superiorsP$.bind( T, thread );
        $kbp_designated_node_superiors$.bind( min_genl_mts_ceilings, thread );
        paths = kb_paths( term_1, term_2, mt );
      }
      finally
      {
        $kbp_designated_node_superiors$.rebind( _prev_bind_9, thread );
        $kbp_designated_node_superiorsP$.rebind( _prev_bind_8, thread );
        $kbp_designated_preds$.rebind( _prev_bind_7, thread );
        $kbp_designated_predsP$.rebind( _prev_bind_6, thread );
        $kbp_only_gaf_linksP$.rebind( _prev_bind_5, thread );
        $limit_path_depthP$.rebind( _prev_bind_4, thread );
        $kbp_no_bi_scoping_linksP$.rebind( _prev_bind_3, thread );
        $kbp_min_isa_pathP$.rebind( _prev_bind_2, thread );
        $kbp_min_genls_pathP$.rebind( _prev_bind_0, thread );
      }
    }
    return paths;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 38783L)
  public static SubLObject explain_cr_pair(final SubLObject term1, final SubLObject term2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject paths = NIL;
    final SubLObject _prev_bind_0 = $max_search_iterations$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $kbp_only_gaf_linksP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $kbp_min_isa_pathP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $kbp_min_genls_pathP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $kbp_genls_cardinality_delta_bound$.currentBinding( thread );
    final SubLObject _prev_bind_6 = $kbp_explode_natsP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = $kbp_quit_with_successP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = $kbp_restricted_predsP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = $kbp_no_bi_scoping_linksP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = $kbp_restricted_preds$.currentBinding( thread );
    final SubLObject _prev_bind_11 = $kbp_node_isa_boundP$.currentBinding( thread );
    final SubLObject _prev_bind_12 = $kbp_node_isa_bound$.currentBinding( thread );
    final SubLObject _prev_bind_13 = $kbp_isa_boundP$.currentBinding( thread );
    final SubLObject _prev_bind_14 = $kbp_isa_bound$.currentBinding( thread );
    final SubLObject _prev_bind_15 = $kbp_genl_bound$.currentBinding( thread );
    final SubLObject _prev_bind_16 = $collect_kbp_statsP$.currentBinding( thread );
    final SubLObject _prev_bind_17 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_18 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      $max_search_iterations$.bind( TWO_INTEGER, thread );
      $kbp_only_gaf_linksP$.bind( NIL, thread );
      $kbp_min_isa_pathP$.bind( NIL, thread );
      $kbp_min_genls_pathP$.bind( T, thread );
      $kbp_genls_cardinality_delta_bound$.bind( TWENTY_INTEGER, thread );
      $kbp_explode_natsP$.bind( T, thread );
      $kbp_quit_with_successP$.bind( T, thread );
      $kbp_restricted_predsP$.bind( T, thread );
      $kbp_no_bi_scoping_linksP$.bind( T, thread );
      $kbp_restricted_preds$.bind( $list158, thread );
      $kbp_node_isa_boundP$.bind( T, thread );
      $kbp_node_isa_bound$.bind( $list159, thread );
      $kbp_isa_boundP$.bind( T, thread );
      $kbp_isa_bound$.bind( $list160, thread );
      $kbp_genl_bound$.bind( $list161, thread );
      $collect_kbp_statsP$.bind( NIL, thread );
      mt_relevance_macros.$relevant_mt_function$.bind( $sym104$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const105$EverythingPSC, thread );
      paths = kb_paths( term1, term2, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_18, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_17, thread );
      $collect_kbp_statsP$.rebind( _prev_bind_16, thread );
      $kbp_genl_bound$.rebind( _prev_bind_15, thread );
      $kbp_isa_bound$.rebind( _prev_bind_14, thread );
      $kbp_isa_boundP$.rebind( _prev_bind_13, thread );
      $kbp_node_isa_bound$.rebind( _prev_bind_12, thread );
      $kbp_node_isa_boundP$.rebind( _prev_bind_11, thread );
      $kbp_restricted_preds$.rebind( _prev_bind_10, thread );
      $kbp_no_bi_scoping_linksP$.rebind( _prev_bind_9, thread );
      $kbp_restricted_predsP$.rebind( _prev_bind_8, thread );
      $kbp_quit_with_successP$.rebind( _prev_bind_7, thread );
      $kbp_explode_natsP$.rebind( _prev_bind_6, thread );
      $kbp_genls_cardinality_delta_bound$.rebind( _prev_bind_5, thread );
      $kbp_min_genls_pathP$.rebind( _prev_bind_4, thread );
      $kbp_min_isa_pathP$.rebind( _prev_bind_3, thread );
      $kbp_only_gaf_linksP$.rebind( _prev_bind_2, thread );
      $max_search_iterations$.rebind( _prev_bind_0, thread );
    }
    return paths;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 39682L)
  public static SubLObject explain_cr_gafs_via_paths(SubLObject clearP)
  {
    if( clearP == UNPROVIDED )
    {
      clearP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $max_search_iterations$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $kbp_only_gaf_linksP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $kbp_min_isa_pathP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $kbp_min_genls_pathP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $kbp_genls_cardinality_delta_bound$.currentBinding( thread );
    final SubLObject _prev_bind_6 = $kbp_explode_natsP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = $kbp_quit_with_successP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = $kbp_restricted_predsP$.currentBinding( thread );
    final SubLObject _prev_bind_9 = $kbp_no_bi_scoping_linksP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = $kbp_restricted_preds$.currentBinding( thread );
    final SubLObject _prev_bind_11 = $kbp_node_isa_boundP$.currentBinding( thread );
    final SubLObject _prev_bind_12 = $kbp_node_isa_bound$.currentBinding( thread );
    final SubLObject _prev_bind_13 = $kbp_isa_boundP$.currentBinding( thread );
    final SubLObject _prev_bind_14 = $kbp_isa_bound$.currentBinding( thread );
    final SubLObject _prev_bind_15 = $kbp_genl_bound$.currentBinding( thread );
    final SubLObject _prev_bind_16 = $collect_kbp_statsP$.currentBinding( thread );
    try
    {
      $max_search_iterations$.bind( TWO_INTEGER, thread );
      $kbp_only_gaf_linksP$.bind( NIL, thread );
      $kbp_min_isa_pathP$.bind( NIL, thread );
      $kbp_min_genls_pathP$.bind( T, thread );
      $kbp_genls_cardinality_delta_bound$.bind( TWENTY_INTEGER, thread );
      $kbp_explode_natsP$.bind( T, thread );
      $kbp_quit_with_successP$.bind( T, thread );
      $kbp_restricted_predsP$.bind( T, thread );
      $kbp_no_bi_scoping_linksP$.bind( T, thread );
      $kbp_restricted_preds$.bind( $list158, thread );
      $kbp_node_isa_boundP$.bind( T, thread );
      $kbp_node_isa_bound$.bind( $list162, thread );
      $kbp_isa_boundP$.bind( T, thread );
      $kbp_isa_bound$.bind( $list160, thread );
      $kbp_genl_bound$.bind( $list161, thread );
      $collect_kbp_statsP$.bind( NIL, thread );
      if( NIL != clearP )
      {
        Hashtables.clrhash( $cr_paths_table$.getDynamicValue( thread ) );
        $cr_gaf_count$.setDynamicValue( ZERO_INTEGER, thread );
        $cr_explained_count$.setDynamicValue( ZERO_INTEGER, thread );
        $cr_error_count$.setDynamicValue( ZERO_INTEGER, thread );
      }
      final SubLObject _prev_bind_0_$32 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_1_$33 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym104$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const105$EverythingPSC, thread );
        kb_mapping.map_predicate_extent_index( $sym163$EXPLAIN_CR_GAF_VIA_PATHS, $const164$conceptuallyRelated, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_1_$33, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$32, thread );
      }
    }
    finally
    {
      $collect_kbp_statsP$.rebind( _prev_bind_16, thread );
      $kbp_genl_bound$.rebind( _prev_bind_15, thread );
      $kbp_isa_bound$.rebind( _prev_bind_14, thread );
      $kbp_isa_boundP$.rebind( _prev_bind_13, thread );
      $kbp_node_isa_bound$.rebind( _prev_bind_12, thread );
      $kbp_node_isa_boundP$.rebind( _prev_bind_11, thread );
      $kbp_restricted_preds$.rebind( _prev_bind_10, thread );
      $kbp_no_bi_scoping_linksP$.rebind( _prev_bind_9, thread );
      $kbp_restricted_predsP$.rebind( _prev_bind_8, thread );
      $kbp_quit_with_successP$.rebind( _prev_bind_7, thread );
      $kbp_explode_natsP$.rebind( _prev_bind_6, thread );
      $kbp_genls_cardinality_delta_bound$.rebind( _prev_bind_5, thread );
      $kbp_min_genls_pathP$.rebind( _prev_bind_4, thread );
      $kbp_min_isa_pathP$.rebind( _prev_bind_3, thread );
      $kbp_only_gaf_linksP$.rebind( _prev_bind_2, thread );
      $max_search_iterations$.rebind( _prev_bind_0, thread );
    }
    return $cr_paths_table$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 40718L)
  public static SubLObject explain_cr_gaf_via_paths(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      final SubLObject id = assertion_handles.assertion_id( assertion );
      final SubLObject pred = assertions_high.gaf_arg0( assertion );
      final SubLObject arg1 = assertions_high.gaf_arg1( assertion );
      final SubLObject arg2 = assertions_high.gaf_arg2( assertion );
      SubLObject error_message = NIL;
      SubLObject paths = NIL;
      if( pred.eql( $const164$conceptuallyRelated ) )
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym165$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              paths = kb_paths( arg1, arg2, UNPROVIDED );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        $cr_gaf_count$.setDynamicValue( Numbers.add( $cr_gaf_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
        if( NIL != paths )
        {
          paths = transform_list_utilities.quiescent_ntransform( kbp_paths_links( paths ), Symbols.symbol_function( $sym166$KB_ASSERTION_ ), Symbols.symbol_function( $sym167$ASSERTION_FI_FORMULA ), UNPROVIDED,
              UNPROVIDED, UNPROVIDED, UNPROVIDED );
          Hashtables.sethash( id, $cr_paths_table$.getDynamicValue( thread ), paths );
          print_high.print( ConsesLow.list( arg1, arg2, paths ), UNPROVIDED );
          $cr_explained_count$.setDynamicValue( Numbers.add( $cr_explained_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
        }
        else if( NIL != error_message )
        {
          Hashtables.sethash( id, $cr_paths_table$.getDynamicValue( thread ), error_message );
          print_high.print( ConsesLow.list( arg1, arg2, error_message ), UNPROVIDED );
          $cr_error_count$.setDynamicValue( Numbers.add( $cr_error_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
        }
        else
        {
          Hashtables.sethash( id, $cr_paths_table$.getDynamicValue( thread ), paths );
          print_high.print( ConsesLow.list( arg1, arg2, paths ), UNPROVIDED );
        }
      }
      return paths;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 41603L)
  public static SubLObject cr_paths_status()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( T, $str168$__cr_gafs_considered___a, $cr_gaf_count$.getDynamicValue( thread ) );
    PrintLow.format( T, $str169$__cr_gafs_explained___a, $cr_explained_count$.getDynamicValue( thread ) );
    PrintLow.format( T, $str170$__cr_gafs_w_errors___a, $cr_error_count$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 41814L)
  public static SubLObject evaluate_cr_path(final SubLObject term1, final SubLObject term2, final SubLObject path, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const171$InferencePSC;
    }
    SubLObject query = conses_high.nsubst( cycl_variables.gentemp_el_var( fort_name( term1 ) ), term1, conses_high.nsubst( cycl_variables.gentemp_el_var( fort_name( term2 ) ), term2, path, UNPROVIDED, UNPROVIDED ),
        UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.singletonP( query ) )
    {
      query = query.first();
    }
    else
    {
      query = ConsesLow.cons( $const172$and, query );
    }
    final SubLObject v_bindings = fi.fi_ask_int( query, mt, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 42185L)
  public static SubLObject fort_name(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return constants_high.constant_name( fort );
    }
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return string_utilities.object_to_string( narts_high.nart_el_formula( fort ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 42335L)
  public static SubLObject fort_nameL(final SubLObject fort1, final SubLObject fort2)
  {
    return Strings.stringL( fort_name( fort1 ), fort_name( fort2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 44522L)
  public static SubLObject assertions_fi_equalP(final SubLObject assertions_1, final SubLObject assertions_2)
  {
    if( NIL != term.kb_assertionP( assertions_1 ) && NIL != term.kb_assertionP( assertions_2 ) )
    {
      return Equality.equal( assertions_fi_formulae( assertions_1 ), assertions_fi_formulae( assertions_2 ) );
    }
    if( assertions_1.isCons() && assertions_2.isCons() )
    {
      return list_utilities.sets_equalP( assertions_1, assertions_2, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 44890L)
  public static SubLObject assertions_fi_formulae(final SubLObject assertions)
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym167$ASSERTION_FI_FORMULA ), assertions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 44987L)
  public static SubLObject focuses(final SubLObject collection, SubLObject focus_bias, SubLObject argnums, SubLObject mt, SubLObject meta_pred_types)
  {
    if( focus_bias == UNPROVIDED )
    {
      focus_bias = $kw173$MIN;
    }
    if( argnums == UNPROVIDED )
    {
      argnums = $list14;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( meta_pred_types == UNPROVIDED )
    {
      meta_pred_types = $list174;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
        final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        final SubLObject _prev_bind_1_$36 = sbhl_marking_vars.$sbhl_table$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( NIL, thread );
          sbhl_marking_vars.$sbhl_table$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject _prev_bind_0_$36 = sbhl_marking_vars.$sbhl_space_0$.currentBinding( thread );
            final SubLObject _prev_bind_1_$37 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space_0$.bind( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ), thread );
              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( resourcing_p, thread );
              SubLObject cdolist_list_var = argnums;
              SubLObject argnum = NIL;
              argnum = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject _prev_bind_0_$37 = control_vars.$mapping_target_arg$.currentBinding( thread );
                try
                {
                  control_vars.$mapping_target_arg$.bind( argnum, thread );
                  final SubLObject meta_pred_specs = meta_pred_specs( argnum, meta_pred_types );
                  SubLObject node_var = collection;
                  final SubLObject deck_type = $kw177$STACK;
                  final SubLObject recur_deck = deck.create_deck( deck_type );
                  final SubLObject _prev_bind_0_$38 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                  try
                  {
                    sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                    try
                    {
                      final SubLObject tv_var = NIL;
                      final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                        if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                        {
                          final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                          if( pcase_var.eql( $kw179$ERROR ) )
                          {
                            sbhl_paranoia.sbhl_error( ONE_INTEGER, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                          else if( pcase_var.eql( $kw182$CERROR ) )
                          {
                            sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str152$continue_anyway, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                          else if( pcase_var.eql( $kw183$WARN ) )
                          {
                            Errors.warn( $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P );
                          }
                          else
                          {
                            Errors.warn( $str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                            Errors.cerror( $str152$continue_anyway, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P );
                          }
                        }
                        final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$39 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const126$genls ), thread );
                          sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const126$genls ) ), thread );
                          sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const126$genls ) ), thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                          sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const126$genls ), thread );
                          if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                          {
                            final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$40 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                            final SubLObject _prev_bind_2_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                              sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars
                                  .get_sbhl_module( $const126$genls ) ), thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                              sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                              while ( NIL != node_var)
                              {
                                final SubLObject genl = node_var;
                                SubLObject cdolist_list_var_$48 = meta_pred_specs;
                                SubLObject meta_pred_spec = NIL;
                                meta_pred_spec = cdolist_list_var_$48.first();
                                while ( NIL != cdolist_list_var_$48)
                                {
                                  final SubLObject _prev_bind_0_$42 = control_vars.$mapping_pred$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$41 = control_vars.$mapping_index_arg$.currentBinding( thread );
                                  final SubLObject _prev_bind_2_$48 = control_vars.$mapping_gather_arg$.currentBinding( thread );
                                  try
                                  {
                                    control_vars.$mapping_pred$.bind( meta_pred_spec.first(), thread );
                                    control_vars.$mapping_index_arg$.bind( conses_high.second( meta_pred_spec ), thread );
                                    control_vars.$mapping_gather_arg$.bind( conses_high.third( meta_pred_spec ), thread );
                                    kb_mapping.map_gaf_arg_index( $sym185$GENLS_GATHER_FOCUS_PREDS_COLS, genl, control_vars.$mapping_index_arg$.getDynamicValue( thread ), control_vars.$mapping_pred$.getDynamicValue(
                                        thread ), $kw186$TRUE, UNPROVIDED );
                                  }
                                  finally
                                  {
                                    control_vars.$mapping_gather_arg$.rebind( _prev_bind_2_$48, thread );
                                    control_vars.$mapping_index_arg$.rebind( _prev_bind_1_$41, thread );
                                    control_vars.$mapping_pred$.rebind( _prev_bind_0_$42, thread );
                                  }
                                  cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                                  meta_pred_spec = cdolist_list_var_$48.first();
                                }
                                SubLObject cdolist_list_var_$49;
                                final SubLObject accessible_modules = cdolist_list_var_$49 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const126$genls ) );
                                SubLObject module_var = NIL;
                                module_var = cdolist_list_var_$49.first();
                                while ( NIL != cdolist_list_var_$49)
                                {
                                  final SubLObject _prev_bind_0_$43 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                        .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                    final SubLObject node = function_terms.naut_to_nart( node_var );
                                    if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                    {
                                      final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                      if( NIL != d_link )
                                      {
                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                        if( NIL != mt_links )
                                        {
                                          SubLObject iteration_state;
                                          for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                              iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_$55 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != mt_relevance_macros.relevant_mtP( mt_$55 ) )
                                            {
                                              final SubLObject _prev_bind_0_$44 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_mt$.bind( mt_$55, thread );
                                                SubLObject iteration_state_$57;
                                                for( iteration_state_$57 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                                    .do_dictionary_contents_doneP( iteration_state_$57 ); iteration_state_$57 = dictionary_contents.do_dictionary_contents_next( iteration_state_$57 ) )
                                                {
                                                  thread.resetMultipleValues();
                                                  final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$57 );
                                                  final SubLObject link_nodes = thread.secondMultipleValue();
                                                  thread.resetMultipleValues();
                                                  if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                  {
                                                    final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                    try
                                                    {
                                                      sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                      final SubLObject sol = link_nodes;
                                                      if( NIL != set.set_p( sol ) )
                                                      {
                                                        final SubLObject set_contents_var = set.do_set_internal( sol );
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject node_vars_link_node;
                                                        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                            set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                        {
                                                          node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                          if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                              node_vars_link_node, UNPROVIDED ) )
                                                          {
                                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                            deck.deck_push( node_vars_link_node, recur_deck );
                                                          }
                                                        }
                                                      }
                                                      else if( sol.isList() )
                                                      {
                                                        SubLObject csome_list_var = sol;
                                                        SubLObject node_vars_link_node2 = NIL;
                                                        node_vars_link_node2 = csome_list_var.first();
                                                        while ( NIL != csome_list_var)
                                                        {
                                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                          {
                                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                            deck.deck_push( node_vars_link_node2, recur_deck );
                                                          }
                                                          csome_list_var = csome_list_var.rest();
                                                          node_vars_link_node2 = csome_list_var.first();
                                                        }
                                                      }
                                                      else
                                                      {
                                                        Errors.error( $str187$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                      }
                                                    }
                                                    finally
                                                    {
                                                      sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$45, thread );
                                                    }
                                                  }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize( iteration_state_$57 );
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$44, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                        }
                                      }
                                      else
                                      {
                                        sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str188$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                      }
                                    }
                                    else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                    {
                                      SubLObject cdolist_list_var_$50;
                                      final SubLObject new_list = cdolist_list_var_$50 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                          .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                              UNPROVIDED ) ) )
                                          : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                              sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                      SubLObject generating_fn = NIL;
                                      generating_fn = cdolist_list_var_$50.first();
                                      while ( NIL != cdolist_list_var_$50)
                                      {
                                        final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                          final SubLObject sol2;
                                          final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                          if( NIL != set.set_p( sol2 ) )
                                          {
                                            final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                                set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                            {
                                              node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                              if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node3, recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol2.isList() )
                                          {
                                            SubLObject csome_list_var2 = sol2;
                                            SubLObject node_vars_link_node4 = NIL;
                                            node_vars_link_node4 = csome_list_var2.first();
                                            while ( NIL != csome_list_var2)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node4, recur_deck );
                                              }
                                              csome_list_var2 = csome_list_var2.rest();
                                              node_vars_link_node4 = csome_list_var2.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str187$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$46, thread );
                                        }
                                        cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                        generating_fn = cdolist_list_var_$50.first();
                                      }
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$42, thread );
                                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$43, thread );
                                  }
                                  cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                  module_var = cdolist_list_var_$49.first();
                                }
                                node_var = deck.deck_pop( recur_deck );
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$47, thread );
                              sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$40, thread );
                              sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$41, thread );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str189$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                                UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        finally
                        {
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                          sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                          sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$39, thread );
                          sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$40, thread );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$38, thread );
                        sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$39, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$47, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$38, thread );
                  }
                }
                finally
                {
                  control_vars.$mapping_target_arg$.rebind( _prev_bind_0_$37, thread );
                }
                cdolist_list_var = cdolist_list_var.rest();
                argnum = cdolist_list_var.first();
              }
            }
            finally
            {
              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_1_$37, thread );
              sbhl_marking_vars.$sbhl_space_0$.rebind( _prev_bind_0_$36, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$48, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_table$.rebind( _prev_bind_1_$36, thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_0_$35, thread );
        }
        final SubLObject cols = list_utilities.remove_duplicate_forts( Mapping.mapcar( $sym190$CAR, control_vars.$mapping_answer$.getDynamicValue( thread ) ) );
        final SubLObject table = Hashtables.make_hash_table( Sequences.length( cols ), UNPROVIDED, UNPROVIDED );
        SubLObject focus_data = NIL;
        SubLObject focus_cols = NIL;
        SubLObject cdolist_list_var2 = control_vars.$mapping_answer$.getDynamicValue( thread );
        SubLObject colXpred = NIL;
        colXpred = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          SubLObject current;
          final SubLObject datum = current = colXpred;
          SubLObject col = NIL;
          SubLObject pred = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list191 );
          col = current.first();
          current = ( pred = current.rest() );
          hash_table_utilities.push_hash( col, pred, table );
          cdolist_list_var2 = cdolist_list_var2.rest();
          colXpred = cdolist_list_var2.first();
        }
        SubLObject col2 = NIL;
        SubLObject preds = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            col2 = Hashtables.getEntryKey( cdohash_entry );
            preds = Hashtables.getEntryValue( cdohash_entry );
            focus_data = ConsesLow.cons( ConsesLow.cons( Sequences.length( preds ), ConsesLow.cons( col2, preds ) ), focus_data );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        focus_cols = ( cdolist_list_var2 = candidate_focus_collections( focus_data, focus_bias, UNPROVIDED ) );
        SubLObject focus_col = NIL;
        focus_col = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
          final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          final SubLObject _prev_bind_1_$43 = sbhl_marking_vars.$sbhl_table$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( NIL, thread );
            sbhl_marking_vars.$sbhl_table$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$50 = sbhl_marking_vars.$sbhl_space_0$.currentBinding( thread );
              final SubLObject _prev_bind_1_$44 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_space_0$.bind( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ), thread );
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( resourcing_p2, thread );
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const126$genls ), focus_col, UNPROVIDED, UNPROVIDED );
                SubLObject focus_pred_specs = NIL;
                final SubLObject _prev_bind_0_$51 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                try
                {
                  sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                  try
                  {
                    final SubLObject _prev_bind_0_$52 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
                    try
                    {
                      sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( T, thread );
                      SubLObject col3 = NIL;
                      SubLObject pred_specs = NIL;
                      final Iterator cdohash_iterator2 = Hashtables.getEntrySetIterator( table );
                      try
                      {
                        while ( Hashtables.iteratorHasNext( cdohash_iterator2 ))
                        {
                          final Map.Entry cdohash_entry2 = Hashtables.iteratorNextEntry( cdohash_iterator2 );
                          col3 = Hashtables.getEntryKey( cdohash_entry2 );
                          pred_specs = Hashtables.getEntryValue( cdohash_entry2 );
                          if( NIL != sbhl_marking_methods.sbhl_recorded_node_p( col3, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue( thread ) ) || NIL != genls.genlP( col3, focus_col, UNPROVIDED, UNPROVIDED ) )
                          {
                            focus_pred_specs = ConsesLow.nconc( focus_pred_specs, conses_high.copy_list( pred_specs ) );
                          }
                        }
                      }
                      finally
                      {
                        Hashtables.releaseEntrySetIterator( cdohash_iterator2 );
                      }
                    }
                    finally
                    {
                      sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0_$52, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values3 = Values.getValuesAsVector();
                      sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                      Values.restoreValuesFromVector( _values3 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$53, thread );
                    }
                  }
                }
                finally
                {
                  sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$51, thread );
                }
                result = ConsesLow.cons( ConsesLow.list( focus_col, Sequences.length( focus_pred_specs ), focus_pred_specs ), result );
              }
              finally
              {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_1_$44, thread );
                sbhl_marking_vars.$sbhl_space_0$.rebind( _prev_bind_0_$50, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values4 = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values4 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$54, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_table$.rebind( _prev_bind_1_$43, thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_0_$49, thread );
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          focus_col = cdolist_list_var2.first();
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$34, thread );
      }
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return Sort.sort( result, $sym192$_, $sym193$CADR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 50651L)
  public static SubLObject genls_gather_focus_preds_cols(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject collection = assertions_high.gaf_arg( assertion, control_vars.$mapping_index_arg$.getDynamicValue( thread ) );
    final SubLObject predicate = assertions_high.gaf_arg( assertion, control_vars.$mapping_gather_arg$.getDynamicValue( thread ) );
    if( NIL != forts.fort_p( collection ) && NIL != forts.fort_p( predicate ) && NIL == sbhl_marking_methods.sbhl_recorded_node_p( predicate, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue( thread ) )
        && NIL != fort_types_interface.predicateP( predicate ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( collection, ConsesLow.cons( predicate, control_vars.$mapping_target_arg$.getDynamicValue( thread ) ) ), control_vars.$mapping_answer$
          .getDynamicValue( thread ) ), thread );
      sbhl_marking_methods.sbhl_record_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const194$genlPreds ), predicate, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 51164L)
  public static SubLObject remove_genls_of_all(final SubLObject collections, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      SubLObject cdolist_list_var = collections;
      SubLObject col = NIL;
      col = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == genls.all_genlP( col, collections, UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.cons( col, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        col = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 51530L)
  public static SubLObject remove_common_spec_path(final SubLObject collections, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject count = Sequences.length( collections );
    final SubLObject table = Hashtables.make_hash_table( count, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      SubLObject cdolist_list_var = collections;
      SubLObject col = NIL;
      col = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject node_var = col;
        final SubLObject deck_type = ( $kw134$DEPTH == $kw175$BREADTH ) ? $kw176$QUEUE : $kw177$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw179$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw182$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str152$continue_anyway, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw183$WARN ) )
                {
                  Errors.warn( $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str152$continue_anyway, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const126$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const126$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const126$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const126$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$78 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const126$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var)
                    {
                      final SubLObject genl = node_var;
                      if( NIL != subl_promotions.memberP( genl, collections, UNPROVIDED, UNPROVIDED ) )
                      {
                        hash_table_utilities.push_hash( col, genl, table );
                      }
                      SubLObject cdolist_list_var_$79;
                      final SubLObject accessible_modules = cdolist_list_var_$79 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const126$genls ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var_$79.first();
                      while ( NIL != cdolist_list_var_$79)
                      {
                        final SubLObject _prev_bind_0_$75 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt_$82 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt_$82 ) )
                                  {
                                    final SubLObject _prev_bind_0_$76 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt_$82, thread );
                                      SubLObject iteration_state_$84;
                                      for( iteration_state_$84 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$84 ); iteration_state_$84 = dictionary_contents.do_dictionary_contents_next( iteration_state_$84 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$84 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$77 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str187$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$77, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$84 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$76, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str188$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$80;
                            final SubLObject new_list = cdolist_list_var_$80 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$80.first();
                            while ( NIL != cdolist_list_var_$80)
                            {
                              final SubLObject _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str187$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$78, thread );
                              }
                              cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                              generating_fn = cdolist_list_var_$80.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$76, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$75, thread );
                        }
                        cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                        module_var = cdolist_list_var_$79.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$78, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$75, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$74, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str189$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$74, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$73, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$73, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$72, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$79 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$79, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$71, thread );
        }
        cdolist_list_var = cdolist_list_var.rest();
        col = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject done_onceP = NIL;
    SubLObject participants = NIL;
    SubLObject survivors = NIL;
    SubLObject dearly_departed = NIL;
    SubLObject new_count = NIL;
    participants = ( survivors = collections );
    dearly_departed = NIL;
    new_count = count;
    while ( NIL == done_onceP || !survivors.eql( participants ))
    {
      SubLObject col2 = NIL;
      SubLObject v_genls = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          col2 = Hashtables.getEntryKey( cdohash_entry );
          v_genls = Hashtables.getEntryValue( cdohash_entry );
          if( new_count.numE( Sequences.length( v_genls ) ) )
          {
            dearly_departed = ConsesLow.cons( col2, dearly_departed );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      done_onceP = T;
      participants = survivors;
      survivors = list_utilities.set_difference_forts( participants, dearly_departed );
      dearly_departed = NIL;
      new_count = Sequences.length( survivors );
    }
    result = survivors;
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 52391L)
  public static SubLObject remove_common_spec_path_wrt(final SubLObject references, final SubLObject collections, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = collections;
    SubLObject cdolist_list_var = references;
    SubLObject reference = NIL;
    reference = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject relevant = genls.all_genls_among( reference, collections, mt, UNPROVIDED );
      final SubLObject trimmed = remove_common_spec_path( relevant, mt );
      result = keyhash_utilities.intersect_forts( result, trimmed );
      cdolist_list_var = cdolist_list_var.rest();
      reference = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 52750L)
  public static SubLObject remove_specs_of_all(final SubLObject collections, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      SubLObject cdolist_list_var = collections;
      SubLObject col = NIL;
      col = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == genls.all_specP( col, collections, UNPROVIDED, UNPROVIDED ) )
        {
          result = ConsesLow.cons( col, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        col = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 53076L)
  public static SubLObject remove_common_genl_path(final SubLObject collections, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject count = Sequences.length( collections );
    final SubLObject table = Hashtables.make_hash_table( count, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      SubLObject cdolist_list_var = collections;
      SubLObject col = NIL;
      col = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject node_var = col;
        final SubLObject deck_type = ( $kw134$DEPTH == $kw175$BREADTH ) ? $kw176$QUEUE : $kw177$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$89 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$91 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw179$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw182$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str152$continue_anyway, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw183$WARN ) )
                {
                  Errors.warn( $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str152$continue_anyway, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$91 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$92 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const126$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const126$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const126$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const126$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$92 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$93 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const126$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var)
                    {
                      final SubLObject genl = node_var;
                      if( NIL != subl_promotions.memberP( genl, collections, UNPROVIDED, UNPROVIDED ) )
                      {
                        hash_table_utilities.push_hash( genl, col, table );
                      }
                      SubLObject cdolist_list_var_$97;
                      final SubLObject accessible_modules = cdolist_list_var_$97 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const126$genls ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var_$97.first();
                      while ( NIL != cdolist_list_var_$97)
                      {
                        final SubLObject _prev_bind_0_$93 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$94 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt_$100 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt_$100 ) )
                                  {
                                    final SubLObject _prev_bind_0_$94 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt_$100, thread );
                                      SubLObject iteration_state_$102;
                                      for( iteration_state_$102 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$102 ); iteration_state_$102 = dictionary_contents.do_dictionary_contents_next( iteration_state_$102 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$102 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$95 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str187$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$95, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$102 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$94, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str188$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$98;
                            final SubLObject new_list = cdolist_list_var_$98 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$98.first();
                            while ( NIL != cdolist_list_var_$98)
                            {
                              final SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str187$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$96, thread );
                              }
                              cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                              generating_fn = cdolist_list_var_$98.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$94, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$93, thread );
                        }
                        cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                        module_var = cdolist_list_var_$97.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$96, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$93, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$92, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str189$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$92, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$91, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$91, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$90, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$97, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$89, thread );
        }
        cdolist_list_var = cdolist_list_var.rest();
        col = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject done_onceP = NIL;
    SubLObject participants = NIL;
    SubLObject survivors = NIL;
    SubLObject dearly_departed = NIL;
    SubLObject new_count = NIL;
    participants = ( survivors = collections );
    dearly_departed = NIL;
    new_count = count;
    while ( NIL == done_onceP || !survivors.eql( participants ))
    {
      SubLObject col2 = NIL;
      SubLObject specs = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          col2 = Hashtables.getEntryKey( cdohash_entry );
          specs = Hashtables.getEntryValue( cdohash_entry );
          if( new_count.numE( Sequences.length( specs ) ) )
          {
            dearly_departed = ConsesLow.cons( col2, dearly_departed );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      done_onceP = T;
      participants = survivors;
      survivors = list_utilities.set_difference_forts( participants, dearly_departed );
      dearly_departed = NIL;
      new_count = Sequences.length( survivors );
    }
    result = survivors;
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 53937L)
  public static SubLObject remove_common_genl_path_wrt(final SubLObject references, final SubLObject collections, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = collections;
    SubLObject cdolist_list_var = references;
    SubLObject reference = NIL;
    reference = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject relevant = genls.all_specs_among( reference, collections, mt, UNPROVIDED );
      final SubLObject trimmed = remove_common_genl_path( relevant, mt );
      result = keyhash_utilities.intersect_forts( result, trimmed );
      cdolist_list_var = cdolist_list_var.rest();
      reference = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 54296L)
  public static SubLObject candidate_focus_collections(final SubLObject data, SubLObject focus_bias, SubLObject mt)
  {
    if( focus_bias == UNPROVIDED )
    {
      focus_bias = $kw173$MIN;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject collections = Mapping.mapcar( $sym193$CADR, data );
    final SubLObject pcase_var = focus_bias;
    if( pcase_var.eql( $kw195$ALL ) )
    {
      return collections;
    }
    if( pcase_var.eql( $kw173$MIN ) )
    {
      return genls.min_cols( remove_common_spec_path( collections, mt ), mt, UNPROVIDED );
    }
    if( pcase_var.eql( $kw196$MAX ) )
    {
      return genls.max_cols( remove_common_genl_path( collections, mt ), mt, UNPROVIDED );
    }
    if( pcase_var.eql( $kw197$MID ) )
    {
      return candidate_focus_collections_strategy_middle( collections, mt );
    }
    if( pcase_var.eql( $kw198$EDGE ) )
    {
      return candidate_focus_collections_strategy_edge( collections, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 54782L)
  public static SubLObject candidate_focus_collections_strategy_middle(final SubLObject collections, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    SubLObject candidates;
    SubLObject min_cols;
    SubLObject max_cols;
    SubLObject max_mins;
    SubLObject min_maxs;
    for( candidates = NIL, min_cols = NIL, max_cols = NIL, max_mins = NIL, min_maxs = NIL, candidates = remove_common_genl_path( remove_common_spec_path( collections, mt ), mt ), min_cols = genls.min_cols( candidates,
        mt, UNPROVIDED ), max_cols = genls.max_cols( candidates, mt, UNPROVIDED ), max_mins = conses_high.copy_list( min_cols ), min_maxs = conses_high.copy_list(
            max_cols ); NIL != candidates; candidates = list_utilities.set_difference_forts( list_utilities.set_difference_forts( candidates, min_cols ), max_cols ), min_cols = genls.min_cols( candidates, mt,
                UNPROVIDED ), max_cols = genls.max_cols( candidates, mt, UNPROVIDED ), max_mins = genls.max_cols( ConsesLow.nconc( max_mins, conses_high.copy_list( min_cols ) ), mt, UNPROVIDED ), min_maxs = genls
                    .min_cols( ConsesLow.nconc( min_maxs, conses_high.copy_list( max_cols ) ), mt, UNPROVIDED ) )
    {
    }
    result = genls.min_cols( list_utilities.remove_duplicate_forts( ConsesLow.append( max_mins, min_maxs ) ), mt, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 55482L)
  public static SubLObject candidate_focus_collections_strategy_edge(final SubLObject collections, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject result = NIL;
    SubLObject current = NIL;
    SubLObject candidates;
    SubLObject min_cols;
    SubLObject max_cols;
    for( candidates = NIL, min_cols = NIL, max_cols = NIL, candidates = remove_common_genl_path( remove_common_spec_path( collections, mt ), mt ), min_cols = genls.min_cols( candidates, mt, UNPROVIDED ), max_cols = genls
        .max_cols( candidates, mt, UNPROVIDED ); NIL != min_cols || NIL != max_cols; min_cols = genls.min_cols( candidates, mt, UNPROVIDED ), max_cols = genls.max_cols( candidates, mt, UNPROVIDED ) )
    {
      result = ConsesLow.nconc( result, ConsesLow.nconc( conses_high.copy_list( min_cols ), conses_high.copy_list( max_cols ) ) );
      current = list_utilities.set_difference_forts( candidates, result );
      candidates = remove_common_genl_path_wrt( max_cols, remove_common_spec_path_wrt( min_cols, current, mt ), mt );
    }
    return list_utilities.remove_duplicate_forts( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 56142L)
  public static SubLObject appraise_candidate_focuses(final SubLObject candidates, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject count = Sequences.length( candidates );
    final SubLObject specs_table = Hashtables.make_hash_table( count, UNPROVIDED, UNPROVIDED );
    final SubLObject genls_table = Hashtables.make_hash_table( count, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = candidates;
    SubLObject candidate = NIL;
    candidate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject node_var = candidate;
      final SubLObject deck_type = ( $kw134$DEPTH == $kw175$BREADTH ) ? $kw176$QUEUE : $kw177$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject mt_var = mt;
          final SubLObject _prev_bind_0_$107 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$108 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$109 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw179$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw182$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str152$continue_anyway, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw183$WARN ) )
                {
                  Errors.warn( $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str152$continue_anyway, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$110 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_2_$112 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const126$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const126$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const126$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const126$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( candidate, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$110 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$111 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$113 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const126$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var)
                    {
                      final SubLObject genl = node_var;
                      if( NIL != subl_promotions.memberP( genl, candidates, UNPROVIDED, UNPROVIDED ) && !genl.eql( candidate ) )
                      {
                        hash_table_utilities.push_hash( genl, candidate, specs_table );
                        hash_table_utilities.push_hash( candidate, genl, genls_table );
                      }
                      SubLObject cdolist_list_var_$116;
                      final SubLObject accessible_modules = cdolist_list_var_$116 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const126$genls ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var_$116.first();
                      while ( NIL != cdolist_list_var_$116)
                      {
                        final SubLObject _prev_bind_0_$111 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$112 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt_$119 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt_$119 ) )
                                  {
                                    final SubLObject _prev_bind_0_$112 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt_$119, thread );
                                      SubLObject iteration_state_$121;
                                      for( iteration_state_$121 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$121 ); iteration_state_$121 = dictionary_contents.do_dictionary_contents_next( iteration_state_$121 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$121 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$113 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject node_vars_link_node;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str187$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$113, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$121 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$112, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str188$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$117;
                            final SubLObject new_list = cdolist_list_var_$117 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$117.first();
                            while ( NIL != cdolist_list_var_$117)
                            {
                              final SubLObject _prev_bind_0_$114 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var2 = sol2;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str187$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$114, thread );
                              }
                              cdolist_list_var_$117 = cdolist_list_var_$117.rest();
                              generating_fn = cdolist_list_var_$117.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$112, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$111, thread );
                        }
                        cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                        module_var = cdolist_list_var_$116.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$113, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$111, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$110, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str189$Node__a_does_not_pass_sbhl_type_t, candidate, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$112, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$110, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$109, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$109, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$108, thread );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$107, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$115, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      candidate = cdolist_list_var.first();
    }
    cdolist_list_var = candidates;
    candidate = NIL;
    candidate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject specs_count = Sequences.length( Hashtables.gethash( candidate, specs_table, UNPROVIDED ) );
      final SubLObject genls_count = Sequences.length( Hashtables.gethash( candidate, genls_table, UNPROVIDED ) );
      print_high.print( ConsesLow.list( candidate, Numbers.add( specs_count, genls_count ), specs_count, genls_count ), UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      candidate = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 56823L)
  public static SubLObject genls_focus_min_preds(final SubLObject collection, final SubLObject argnum, SubLObject mt, SubLObject meta_pred_types)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( meta_pred_types == UNPROVIDED )
    {
      meta_pred_types = $list199;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
      final SubLObject _prev_bind_0_$126 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
      final SubLObject _prev_bind_1_$127 = sbhl_marking_vars.$sbhl_table$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( NIL, thread );
        sbhl_marking_vars.$sbhl_table$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$127 = sbhl_marking_vars.$sbhl_space_0$.currentBinding( thread );
          final SubLObject _prev_bind_1_$128 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          final SubLObject _prev_bind_3 = control_vars.$mapping_answer$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space_0$.bind( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( resourcing_p, thread );
            control_vars.$mapping_answer$.bind( NIL, thread );
            final SubLObject meta_pred_specs = meta_pred_specs( argnum, meta_pred_types );
            SubLObject node_var = collection;
            final SubLObject deck_type = $kw177$STACK;
            final SubLObject recur_deck = deck.create_deck( deck_type );
            final SubLObject _prev_bind_0_$128 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$129 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                final SubLObject _prev_bind_1_$129 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                  if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                  {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                    if( pcase_var.eql( $kw179$ERROR ) )
                    {
                      sbhl_paranoia.sbhl_error( ONE_INTEGER, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw182$CERROR ) )
                    {
                      sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str152$continue_anyway, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    else if( pcase_var.eql( $kw183$WARN ) )
                    {
                      Errors.warn( $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P );
                    }
                    else
                    {
                      Errors.warn( $str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                      Errors.cerror( $str152$continue_anyway, $str180$_A_is_not_a__A, tv_var, $sym181$SBHL_TRUE_TV_P );
                    }
                  }
                  final SubLObject _prev_bind_0_$130 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$130 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$135 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const126$genls ), thread );
                    sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const126$genls ) ), thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const126$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const126$genls ), thread );
                    if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( collection, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                    {
                      final SubLObject _prev_bind_0_$131 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$131 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                      final SubLObject _prev_bind_2_$136 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                        sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                            $const126$genls ) ), thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                        sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                        while ( NIL != node_var)
                        {
                          final SubLObject genl = node_var;
                          SubLObject cdolist_list_var = meta_pred_specs;
                          SubLObject meta_pred_spec = NIL;
                          meta_pred_spec = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject _prev_bind_0_$132 = control_vars.$mapping_pred$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$132 = control_vars.$mapping_index_arg$.currentBinding( thread );
                            final SubLObject _prev_bind_2_$137 = control_vars.$mapping_gather_arg$.currentBinding( thread );
                            try
                            {
                              control_vars.$mapping_pred$.bind( meta_pred_spec.first(), thread );
                              control_vars.$mapping_index_arg$.bind( conses_high.second( meta_pred_spec ), thread );
                              control_vars.$mapping_gather_arg$.bind( conses_high.third( meta_pred_spec ), thread );
                              kb_mapping.map_gaf_arg_index( $sym200$GENLS_GATHER_FOCUS_PREDS_OF, genl, control_vars.$mapping_index_arg$.getDynamicValue( thread ), control_vars.$mapping_pred$.getDynamicValue( thread ),
                                  $kw186$TRUE, UNPROVIDED );
                            }
                            finally
                            {
                              control_vars.$mapping_gather_arg$.rebind( _prev_bind_2_$137, thread );
                              control_vars.$mapping_index_arg$.rebind( _prev_bind_1_$132, thread );
                              control_vars.$mapping_pred$.rebind( _prev_bind_0_$132, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            meta_pred_spec = cdolist_list_var.first();
                          }
                          final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const126$genls ) );
                          SubLObject module_var = NIL;
                          module_var = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            final SubLObject _prev_bind_0_$133 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$133 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            try
                            {
                              sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                  .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                              final SubLObject node = function_terms.naut_to_nart( node_var );
                              if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                              {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != d_link )
                                {
                                  final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != mt_links )
                                  {
                                    SubLObject iteration_state;
                                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject mt_$144 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                      final SubLObject tv_links = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != mt_relevance_macros.relevant_mtP( mt_$144 ) )
                                      {
                                        final SubLObject _prev_bind_0_$134 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.bind( mt_$144, thread );
                                          SubLObject iteration_state_$146;
                                          for( iteration_state_$146 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                              .do_dictionary_contents_doneP( iteration_state_$146 ); iteration_state_$146 = dictionary_contents.do_dictionary_contents_next( iteration_state_$146 ) )
                                          {
                                            thread.resetMultipleValues();
                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$146 );
                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                            {
                                              final SubLObject _prev_bind_0_$135 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                final SubLObject sol = link_nodes;
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  final SubLObject set_contents_var = set.do_set_internal( sol );
                                                  SubLObject basis_object;
                                                  SubLObject state;
                                                  SubLObject node_vars_link_node;
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                      set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                  {
                                                    node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  SubLObject csome_list_var = sol;
                                                  SubLObject node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var.first();
                                                  while ( NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    node_vars_link_node2 = csome_list_var.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str187$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$135, thread );
                                              }
                                            }
                                          }
                                          dictionary_contents.do_dictionary_contents_finalize( iteration_state_$146 );
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$134, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                  }
                                }
                                else
                                {
                                  sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str188$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                }
                              }
                              else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                              {
                                SubLObject cdolist_list_var_$148;
                                final SubLObject new_list = cdolist_list_var_$148 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                    .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                        UNPROVIDED ) ) )
                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                        .get_sbhl_module( UNPROVIDED ) ) );
                                SubLObject generating_fn = NIL;
                                generating_fn = cdolist_list_var_$148.first();
                                while ( NIL != cdolist_list_var_$148)
                                {
                                  final SubLObject _prev_bind_0_$136 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                    final SubLObject sol2;
                                    final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                                    if( NIL != set.set_p( sol2 ) )
                                    {
                                      final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                      SubLObject basis_object2;
                                      SubLObject state2;
                                      SubLObject node_vars_link_node3;
                                      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                          set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                      {
                                        node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                        if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                            UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node3, recur_deck );
                                        }
                                      }
                                    }
                                    else if( sol2.isList() )
                                    {
                                      SubLObject csome_list_var2 = sol2;
                                      SubLObject node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var2.first();
                                      while ( NIL != csome_list_var2)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node4, recur_deck );
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        node_vars_link_node4 = csome_list_var2.first();
                                      }
                                    }
                                    else
                                    {
                                      Errors.error( $str187$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$136, thread );
                                  }
                                  cdolist_list_var_$148 = cdolist_list_var_$148.rest();
                                  generating_fn = cdolist_list_var_$148.first();
                                }
                              }
                            }
                            finally
                            {
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$133, thread );
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$133, thread );
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            module_var = cdolist_list_var.first();
                          }
                          node_var = deck.deck_pop( recur_deck );
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$136, thread );
                        sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$131, thread );
                        sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$131, thread );
                      }
                    }
                    else
                    {
                      sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str189$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                          UNPROVIDED, UNPROVIDED );
                    }
                  }
                  finally
                  {
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$135, thread );
                    sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$130, thread );
                    sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$130, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$129, thread );
                  sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$129, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$137 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$137, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$128, thread );
            }
            result = control_vars.$mapping_answer$.getDynamicValue( thread );
          }
          finally
          {
            control_vars.$mapping_answer$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_1_$128, thread );
            sbhl_marking_vars.$sbhl_space_0$.rebind( _prev_bind_0_$127, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$138 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$138, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_table$.rebind( _prev_bind_1_$127, thread );
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_0_$126, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return genl_predicates.min_predicates( result, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 57657L)
  public static SubLObject genls_gather_focus_preds_of(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject collection = assertions_high.gaf_arg( assertion, control_vars.$mapping_index_arg$.getDynamicValue( thread ) );
    final SubLObject predicate = assertions_high.gaf_arg( assertion, control_vars.$mapping_gather_arg$.getDynamicValue( thread ) );
    if( NIL != forts.fort_p( collection ) && NIL != forts.fort_p( predicate ) && NIL == sbhl_marking_methods.sbhl_recorded_node_p( predicate, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue( thread ) )
        && NIL != fort_types_interface.predicateP( predicate ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( predicate, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
      print_high.print( assertion, UNPROVIDED );
      sbhl_marking_methods.sbhl_record_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const194$genlPreds ), predicate, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-paths.lisp", position = 58143L)
  public static SubLObject meta_pred_specs(final SubLObject argnum, SubLObject meta_pred_types)
  {
    if( meta_pred_types == UNPROVIDED )
    {
      meta_pred_types = $list199;
    }
    return NIL;
  }

  public static SubLObject declare_kb_paths_file()
  {
    SubLFiles.declareFunction( me, "kb_paths", "KB-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "kb_paths_n", "KB-PATHS-N", 2, 1, false );
    SubLFiles.declareFunction( me, "kb_paths_in_all_mts", "KB-PATHS-IN-ALL-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_paths_in_just_mt", "KB-PATHS-IN-JUST-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "find_paths", "FIND-PATHS", 0, 2, false );
    SubLFiles.declareFunction( me, "complete_paths_home", "COMPLETE-PATHS-HOME", 0, 1, false );
    SubLFiles.declareFunction( me, "complete_paths_home_from_link", "COMPLETE-PATHS-HOME-FROM-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "complete_paths_home_from_node", "COMPLETE-PATHS-HOME-FROM-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_paths", "EXTRACT-PATHS", 0, 2, false );
    SubLFiles.declareFunction( me, "kbp_result", "KBP-RESULT", 0, 0, false );
    SubLFiles.declareFunction( me, "kbp_result_links", "KBP-RESULT-LINKS", 0, 0, false );
    SubLFiles.declareFunction( me, "kbp_result_paths", "KBP-RESULT-PATHS", 0, 0, false );
    SubLFiles.declareFunction( me, "linearize_lattice", "LINEARIZE-LATTICE", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_node_lattice", "GATHER-NODE-LATTICE", 0, 2, false );
    SubLFiles.declareFunction( me, "gather_link_lattice", "GATHER-LINK-LATTICE", 1, 1, false );
    SubLFiles.declareFunction( me, "kbp_neighbors_among", "KBP-NEIGHBORS-AMONG", 2, 1, false );
    SubLFiles.declareFunction( me, "kbp_node_links", "KBP-NODE-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_link_nodes", "KBP-LINK-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_connecting_links", "KBP-CONNECTING-LINKS", 2, 0, false );
    SubLFiles.declareFunction( me, "kbp_node_neighbors", "KBP-NODE-NEIGHBORS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_legal_linkP", "KBP-LEGAL-LINK?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_legal_nodeP", "KBP-LEGAL-NODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "ancestor_linkP", "ANCESTOR-LINK?", 1, 0, false );
    SubLFiles.declareFunction( me, "ancestor_nodeP", "ANCESTOR-NODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_under_limit", "KBP-UNDER-LIMIT", 0, 2, false );
    SubLFiles.declareFunction( me, "mark_next_horizon", "MARK-NEXT-HORIZON", 1, 4, false );
    SubLFiles.declareFunction( me, "default_link_op", "DEFAULT-LINK-OP", 1, 2, false );
    SubLFiles.declareFunction( me, "default_node_op", "DEFAULT-NODE-OP", 1, 2, false );
    SubLFiles.declareFunction( me, "do_link_nodes", "DO-LINK-NODES", 1, 2, false );
    SubLFiles.declareFunction( me, "default_relevant_linkP", "DEFAULT-RELEVANT-LINK?", 1, 0, false );
    SubLFiles.declareFunction( me, "default_relevant_nodeP", "DEFAULT-RELEVANT-NODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_beyond_genls_cardinality_delta_boundP", "KBP-BEYOND-GENLS-CARDINALITY-DELTA-BOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_beyond_genl_boundP", "KBP-BEYOND-GENL-BOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_beyond_isa_boundP", "KBP-BEYOND-ISA-BOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_undesignated_node_superiorP", "KBP-UNDESIGNATED-NODE-SUPERIOR?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_node_restricted_as_argP", "KBP-NODE-RESTRICTED-AS-ARG?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_node_beyond_isa_boundP", "KBP-NODE-BEYOND-ISA-BOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_gaf_term_beyond_boundP", "KBP-GAF-TERM-BEYOND-BOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_undesignated_pred_assertionP", "KBP-UNDESIGNATED-PRED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_restricted_pred_assertionP", "KBP-RESTRICTED-PRED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_restricted_mt_assertionP", "KBP-RESTRICTED-MT-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_link_terms_beyond_reference_set_boundP", "KBP-LINK-TERMS-BEYOND-REFERENCE-SET-BOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_link_terms_wXo_referencesP", "KBP-LINK-TERMS-W/O-REFERENCES?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_link_satisfies_external_predP", "KBP-LINK-SATISFIES-EXTERNAL-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_link_term_beyond_boundP", "KBP-LINK-TERM-BEYOND-BOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_link_wXo_max_mtP", "KBP-LINK-W/O-MAX-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_bi_scoping_linkP", "KBP-BI-SCOPING-LINK?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_bi_scoping_link_1P", "KBP-BI-SCOPING-LINK-1?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_bi_scoping_nodeP", "KBP-BI-SCOPING-NODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_bi_scoping_node_1P", "KBP-BI-SCOPING-NODE-1?", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_direction", "SCOPE-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "default_relevant_link_treeP", "DEFAULT-RELEVANT-LINK-TREE?", 1, 0, false );
    SubLFiles.declareFunction( me, "do_if_term_assertions", "DO-IF-TERM-ASSERTIONS", 1, 3, false );
    SubLFiles.declareFunction( me, "obsolete_tree_do_if", "OBSOLETE-TREE-DO-IF", 2, 4, false );
    SubLFiles.declareFunction( me, "assertion_indexed_by", "ASSERTION-INDEXED-BY", 2, 0, false );
    SubLFiles.declareFunction( me, "all_assertion_terms", "ALL-ASSERTION-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_assertion_references", "ALL-ASSERTION-REFERENCES", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_kb_paths", "CLEAR-KB-PATHS", 0, 0, false );
    SubLFiles.declareFunction( me, "kbp_stats", "KBP-STATS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_node_count", "KBP-NODE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "kbp_link_count", "KBP-LINK-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "kbp_searched_object_count", "KBP-SEARCHED-OBJECT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "next_iteration", "NEXT-ITERATION", 0, 0, false );
    SubLFiles.declareFunction( me, "kbp_give_upP", "KBP-GIVE-UP?", 3, 0, false );
    SubLFiles.declareFunction( me, "kbp_exhaustedP", "KBP-EXHAUSTED?", 2, 0, false );
    SubLFiles.declareFunction( me, "kbp_iteration_bound_metP", "KBP-ITERATION-BOUND-MET?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_term_bound_metP", "KBP-TERM-BOUND-MET?", 0, 0, false );
    SubLFiles.declareFunction( me, "paths_link_count", "PATHS-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_searcherP", "KBP-SEARCHER?", 1, 0, false );
    SubLFiles.declareFunction( me, "equal_nodesP", "EQUAL-NODES?", 2, 1, false );
    SubLFiles.declareFunction( me, "instance_btreeP", "INSTANCE-BTREE?", 1, 0, false );
    SubLFiles.declareFunction( me, "bookkeeping_btreeP", "BOOKKEEPING-BTREE?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_record_ancestor", "KBP-RECORD-ANCESTOR", 1, 3, false );
    SubLFiles.declareFunction( me, "kbp_ancestors", "KBP-ANCESTORS", 1, 1, false );
    SubLFiles.declareFunction( me, "kbp_ancestors_via_all", "KBP-ANCESTORS-VIA-ALL", 1, 1, false );
    SubLFiles.declareFunction( me, "kbp_ancestorP", "KBP-ANCESTOR?", 1, 3, false );
    SubLFiles.declareFunction( me, "kbp_ancestor_via_anyP", "KBP-ANCESTOR-VIA-ANY?", 1, 3, false );
    SubLFiles.declareFunction( me, "kbp_searchedP", "KBP-SEARCHED?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_searched_byP", "KBP-SEARCHED-BY?", 1, 2, false );
    SubLFiles.declareFunction( me, "kbp_searched_by_allP", "KBP-SEARCHED-BY-ALL?", 1, 2, false );
    SubLFiles.declareFunction( me, "kbp_searched_by_anyP", "KBP-SEARCHED-BY-ANY?", 1, 2, false );
    SubLFiles.declareFunction( me, "kbp_searched_by", "KBP-SEARCHED-BY", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_all_searched_by", "KBP-ALL-SEARCHED-BY", 0, 1, false );
    SubLFiles.declareFunction( me, "kbp_mark_as_searched_by", "KBP-MARK-AS-SEARCHED-BY", 1, 2, false );
    SubLFiles.declareFunction( me, "kbp_mark_as_unsearched_by", "KBP-MARK-AS-UNSEARCHED-BY", 1, 2, false );
    SubLFiles.declareFunction( me, "kbp_mark_as_searched_by_all", "KBP-MARK-AS-SEARCHED-BY-ALL", 1, 2, false );
    SubLFiles.declareFunction( me, "kbp_mark_as_unsearched_by_all", "KBP-MARK-AS-UNSEARCHED-BY-ALL", 1, 2, false );
    SubLFiles.declareFunction( me, "kbp_mark_all_as_unsearched", "KBP-MARK-ALL-AS-UNSEARCHED", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_mark_as_unsearched", "KBP-MARK-AS-UNSEARCHED", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_all_searched_by_all", "KBP-ALL-SEARCHED-BY-ALL", 0, 2, false );
    SubLFiles.declareFunction( me, "bookkeeping_gaf_assertionP", "BOOKKEEPING-GAF-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_excluded_nodeP", "KBP-EXCLUDED-NODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_excluded_linkP", "KBP-EXCLUDED-LINK?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_paths_links", "KBP-PATHS-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_path_links", "KBP-PATH-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_paths_tuples", "KBP-PATHS-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_path_tuples", "KBP-PATH-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_justs_from_tuples", "KBP-JUSTS-FROM-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_just_from_tuples", "KBP-JUST-FROM-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_just_from_tuple", "KBP-JUST-FROM-TUPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "make_gaf_assertion", "MAKE-GAF-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "kbp_note", "KBP-NOTE", 2, 4, false );
    SubLFiles.declareFunction( me, "kbp_error", "KBP-ERROR", 2, 4, false );
    SubLFiles.declareFunction( me, "kbp_warn", "KBP-WARN", 2, 4, false );
    SubLFiles.declareFunction( me, "kbp_min_isa_paths", "KBP-MIN-ISA-PATHS", 2, 2, false );
    SubLFiles.declareFunction( me, "kbp_min_genls_paths", "KBP-MIN-GENLS-PATHS", 2, 2, false );
    SubLFiles.declareFunction( me, "kbp_min_genl_mt_paths", "KBP-MIN-GENL-MT-PATHS", 2, 2, false );
    SubLFiles.declareFunction( me, "explain_cr_pair", "EXPLAIN-CR-PAIR", 2, 0, false );
    SubLFiles.declareFunction( me, "explain_cr_gafs_via_paths", "EXPLAIN-CR-GAFS-VIA-PATHS", 0, 1, false );
    SubLFiles.declareFunction( me, "explain_cr_gaf_via_paths", "EXPLAIN-CR-GAF-VIA-PATHS", 1, 0, false );
    SubLFiles.declareFunction( me, "cr_paths_status", "CR-PATHS-STATUS", 0, 0, false );
    SubLFiles.declareFunction( me, "evaluate_cr_path", "EVALUATE-CR-PATH", 3, 1, false );
    SubLFiles.declareFunction( me, "fort_name", "FORT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_nameL", "FORT-NAME<", 2, 0, false );
    SubLFiles.declareFunction( me, "assertions_fi_equalP", "ASSERTIONS-FI-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "assertions_fi_formulae", "ASSERTIONS-FI-FORMULAE", 1, 0, false );
    SubLFiles.declareFunction( me, "focuses", "FOCUSES", 1, 4, false );
    SubLFiles.declareFunction( me, "genls_gather_focus_preds_cols", "GENLS-GATHER-FOCUS-PREDS-COLS", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_genls_of_all", "REMOVE-GENLS-OF-ALL", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_common_spec_path", "REMOVE-COMMON-SPEC-PATH", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_common_spec_path_wrt", "REMOVE-COMMON-SPEC-PATH-WRT", 2, 1, false );
    SubLFiles.declareFunction( me, "remove_specs_of_all", "REMOVE-SPECS-OF-ALL", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_common_genl_path", "REMOVE-COMMON-GENL-PATH", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_common_genl_path_wrt", "REMOVE-COMMON-GENL-PATH-WRT", 2, 1, false );
    SubLFiles.declareFunction( me, "candidate_focus_collections", "CANDIDATE-FOCUS-COLLECTIONS", 1, 2, false );
    SubLFiles.declareFunction( me, "candidate_focus_collections_strategy_middle", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-MIDDLE", 1, 1, false );
    SubLFiles.declareFunction( me, "candidate_focus_collections_strategy_edge", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-EDGE", 1, 1, false );
    SubLFiles.declareFunction( me, "appraise_candidate_focuses", "APPRAISE-CANDIDATE-FOCUSES", 1, 1, false );
    SubLFiles.declareFunction( me, "genls_focus_min_preds", "GENLS-FOCUS-MIN-PREDS", 2, 2, false );
    SubLFiles.declareFunction( me, "genls_gather_focus_preds_of", "GENLS-GATHER-FOCUS-PREDS-OF", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_pred_specs", "META-PRED-SPECS", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_kb_paths_file()
  {
    $kbp_quitP$ = SubLFiles.defparameter( "*KBP-QUIT?*", NIL );
    $kbp_result_format$ = SubLFiles.defparameter( "*KBP-RESULT-FORMAT*", $kw1$PATHS );
    $search_iteration$ = SubLFiles.defparameter( "*SEARCH-ITERATION*", NIL );
    $node_equalP$ = SubLFiles.defparameter( "*NODE-EQUAL?*", Symbols.symbol_function( EQL ) );
    $kbp_nodeP$ = SubLFiles.defparameter( "*KBP-NODE?*", Symbols.symbol_function( $sym5$FORT_P ) );
    $kbp_linkP$ = SubLFiles.defparameter( "*KBP-LINK?*", Symbols.symbol_function( $sym7$ASSERTION_P ) );
    $kbp_stats$ = SubLFiles.defparameter( "*KBP-STATS*", NIL );
    $collect_kbp_statsP$ = SubLFiles.defparameter( "*COLLECT-KBP-STATS?*", T );
    $kbp_node_count$ = SubLFiles.defparameter( "*KBP-NODE-COUNT*", NIL );
    $kbp_link_count$ = SubLFiles.defparameter( "*KBP-LINK-COUNT*", NIL );
    $kbp_term_count$ = SubLFiles.defparameter( "*KBP-TERM-COUNT*", NIL );
    $source_term_args$ = SubLFiles.defparameter( "*SOURCE-TERM-ARGS*", $list14 );
    $target_term_args$ = SubLFiles.defparameter( "*TARGET-TERM-ARGS*", $list16 );
    $relevant_node_treeP$ = SubLFiles.defparameter( "*RELEVANT-NODE-TREE?*", Symbols.symbol_function( IDENTITY ) );
    $path_source$ = SubLFiles.defparameter( "*PATH-SOURCE*", NIL );
    $path_target$ = SubLFiles.defparameter( "*PATH-TARGET*", NIL );
    $kbp_searcher$ = SubLFiles.defparameter( "*KBP-SEARCHER*", NIL );
    $kbp_searchers$ = SubLFiles.defparameter( "*KBP-SEARCHERS*", NIL );
    $path_horizon$ = SubLFiles.defparameter( "*PATH-HORIZON*", NIL );
    $kbp_common_nodes$ = SubLFiles.defparameter( "*KBP-COMMON-NODES*", NIL );
    $path_link_lattice$ = SubLFiles.defparameter( "*PATH-LINK-LATTICE*", NIL );
    $path_node_lattice$ = SubLFiles.defparameter( "*PATH-NODE-LATTICE*", NIL );
    $kbp_ancestor$ = SubLFiles.defparameter( "*KBP-ANCESTOR*", NIL );
    $kbp_run_time$ = SubLFiles.defparameter( "*KBP-RUN-TIME*", NIL );
    $node_ancestors$ = SubLFiles.defparameter( "*NODE-ANCESTORS*", NIL );
    $link_ancestors$ = SubLFiles.defparameter( "*LINK-ANCESTORS*", NIL );
    $kbp_depth$ = SubLFiles.defparameter( "*KBP-DEPTH*", NIL );
    $kbp_nodes$ = SubLFiles.defparameter( "*KBP-NODES*", NIL );
    $kbp_links$ = SubLFiles.defparameter( "*KBP-LINKS*", NIL );
    $term_arg$ = SubLFiles.defparameter( "*TERM-ARG*", NIL );
    $kbp_ancestor_hash$ = SubLFiles.defparameter( "*KBP-ANCESTOR-HASH*", Hashtables.make_hash_table( $int35$2048, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $kbp_search_hash$ = SubLFiles.defparameter( "*KBP-SEARCH-HASH*", Hashtables.make_hash_table( $int35$2048, UNPROVIDED, UNPROVIDED ) );
    $kbp_min_isa_pathP$ = SubLFiles.defparameter( "*KBP-MIN-ISA-PATH?*", T );
    $kbp_min_genls_pathP$ = SubLFiles.defparameter( "*KBP-MIN-GENLS-PATH?*", T );
    $kbp_designated_node_superiorsP$ = SubLFiles.defparameter( "*KBP-DESIGNATED-NODE-SUPERIORS?*", T );
    $kbp_designated_node_superiors$ = SubLFiles.defparameter( "*KBP-DESIGNATED-NODE-SUPERIORS*", NIL );
    $kbp_trace_level$ = SubLFiles.defparameter( "*KBP-TRACE-LEVEL*", ZERO_INTEGER );
    $max_search_iterations$ = SubLFiles.defparameter( "*MAX-SEARCH-ITERATIONS*", FIVE_INTEGER );
    $limit_path_depthP$ = SubLFiles.defparameter( "*LIMIT-PATH-DEPTH?*", T );
    $kbp_max_depth$ = SubLFiles.defparameter( "*KBP-MAX-DEPTH*", NIL );
    $kbp_max_term_count$ = SubLFiles.defparameter( "*KBP-MAX-TERM-COUNT*", $int46$1000 );
    $kbp_quit_with_successP$ = SubLFiles.defparameter( "*KBP-QUIT-WITH-SUCCESS?*", NIL );
    $kbp_only_gaf_linksP$ = SubLFiles.defparameter( "*KBP-ONLY-GAF-LINKS?*", T );
    $kbp_no_bookkeeping_linksP$ = SubLFiles.defparameter( "*KBP-NO-BOOKKEEPING-LINKS?*", T );
    $kbp_no_instance_linksP$ = SubLFiles.defparameter( "*KBP-NO-INSTANCE-LINKS?*", T );
    $kbp_no_bi_scoping_linksP$ = SubLFiles.defparameter( "*KBP-NO-BI-SCOPING-LINKS?*", NIL );
    $kbp_explode_natsP$ = SubLFiles.defparameter( "*KBP-EXPLODE-NATS?*", NIL );
    $kbp_designated_predsP$ = SubLFiles.defparameter( "*KBP-DESIGNATED-PREDS?*", T );
    $kbp_designated_preds$ = SubLFiles.defparameter( "*KBP-DESIGNATED-PREDS*", NIL );
    $kbp_restricted_predsP$ = SubLFiles.defparameter( "*KBP-RESTRICTED-PREDS?*", T );
    $kbp_restricted_preds$ = SubLFiles.defparameter( "*KBP-RESTRICTED-PREDS*", NIL );
    $kbp_restricted_mtsP$ = SubLFiles.defparameter( "*KBP-RESTRICTED-MTS?*", NIL );
    $kbp_restricted_mts$ = SubLFiles.defparameter( "*KBP-RESTRICTED-MTS*", $list59 );
    $kbp_external_link_predP$ = SubLFiles.defparameter( "*KBP-EXTERNAL-LINK-PRED?*", NIL );
    $kbp_external_link_pred$ = SubLFiles.defparameter( "*KBP-EXTERNAL-LINK-PRED*", NIL );
    $kbp_genl_boundP$ = SubLFiles.defparameter( "*KBP-GENL-BOUND?*", T );
    $kbp_genl_bound$ = SubLFiles.defparameter( "*KBP-GENL-BOUND*", NIL );
    $kbp_genls_cardinality_delta_boundP$ = SubLFiles.defparameter( "*KBP-GENLS-CARDINALITY-DELTA-BOUND?*", T );
    $kbp_genls_cardinality_delta_bound$ = SubLFiles.defparameter( "*KBP-GENLS-CARDINALITY-DELTA-BOUND*", TWENTY_INTEGER );
    $kbp_isa_boundP$ = SubLFiles.defparameter( "*KBP-ISA-BOUND?*", T );
    $kbp_isa_bound$ = SubLFiles.defparameter( "*KBP-ISA-BOUND*", NIL );
    $kbp_node_isa_boundP$ = SubLFiles.defparameter( "*KBP-NODE-ISA-BOUND?*", T );
    $kbp_node_isa_bound$ = SubLFiles.defparameter( "*KBP-NODE-ISA-BOUND*", NIL );
    $kbp_restricted_nodes_as_argP$ = SubLFiles.defparameter( "*KBP-RESTRICTED-NODES-AS-ARG?*", T );
    $kbp_restricted_nodes_as_arg$ = SubLFiles.defparameter( "*KBP-RESTRICTED-NODES-AS-ARG*", $list72 );
    $kbp_link_reference_set_boundP$ = SubLFiles.defparameter( "*KBP-LINK-REFERENCE-SET-BOUND?*", T );
    $kbp_link_reference_set_bound$ = SubLFiles.defparameter( "*KBP-LINK-REFERENCE-SET-BOUND*", NIL );
    $kbp_designated_link_referencesP$ = SubLFiles.defparameter( "*KBP-DESIGNATED-LINK-REFERENCES?*", T );
    $kbp_designated_link_references$ = SubLFiles.defparameter( "*KBP-DESIGNATED-LINK-REFERENCES*", NIL );
    $kbp_bound_gaf_termsP$ = SubLFiles.defparameter( "*KBP-BOUND-GAF-TERMS?*", T );
    $kbp_bound_gaf_terms$ = SubLFiles.defparameter( "*KBP-BOUND-GAF-TERMS*", $list79 );
    $kbp_bound_link_termsP$ = SubLFiles.defparameter( "*KBP-BOUND-LINK-TERMS?*", T );
    $kbp_bound_link_terms$ = SubLFiles.defparameter( "*KBP-BOUND-LINK-TERMS*", NIL );
    $kbp_use_max_mtsP$ = SubLFiles.defparameter( "*KBP-USE-MAX-MTS?*", NIL );
    $nodes_accessor_fn$ = SubLFiles.defparameter( "*NODES-ACCESSOR-FN*", NIL );
    $path_link_op$ = SubLFiles.defparameter( "*PATH-LINK-OP*", NIL );
    $path_node_op$ = SubLFiles.defparameter( "*PATH-NODE-OP*", NIL );
    $relevant_linkP$ = SubLFiles.defparameter( "*RELEVANT-LINK?*", NIL );
    $relevant_nodeP$ = SubLFiles.defparameter( "*RELEVANT-NODE?*", NIL );
    $relevant_link_treeP$ = SubLFiles.defparameter( "*RELEVANT-LINK-TREE?*", NIL );
    $exclude_nodes$ = SubLFiles.defparameter( "*EXCLUDE-NODES*", NIL );
    $exclude_links$ = SubLFiles.defparameter( "*EXCLUDE-LINKS*", NIL );
    $cr_paths_table$ = SubLFiles.defparameter( "*CR-PATHS-TABLE*", Hashtables.make_hash_table( $int157$1024, UNPROVIDED, UNPROVIDED ) );
    $cr_gaf_count$ = SubLFiles.defparameter( "*CR-GAF-COUNT*", ZERO_INTEGER );
    $cr_explained_count$ = SubLFiles.defparameter( "*CR-EXPLAINED-COUNT*", ZERO_INTEGER );
    $cr_error_count$ = SubLFiles.defparameter( "*CR-ERROR-COUNT*", ZERO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_kb_paths_file()
  {
    SubLObject item_var = $sym0$_KBP_QUIT__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym2$_KBP_RESULT_FORMAT_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym3$_SEARCH_ITERATION_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym4$_NODE_EQUAL__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym6$_KBP_NODE__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym8$_KBP_LINK__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym9$_KBP_STATS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym10$_COLLECT_KBP_STATS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym11$_KBP_NODE_COUNT_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym12$_KBP_LINK_COUNT_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym13$_KBP_TERM_COUNT_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym15$_SOURCE_TERM_ARGS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym17$_TARGET_TERM_ARGS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym18$_RELEVANT_NODE_TREE__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym19$_PATH_SOURCE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym20$_PATH_TARGET_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym21$_KBP_SEARCHER_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym22$_KBP_SEARCHERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym23$_PATH_HORIZON_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym24$_KBP_COMMON_NODES_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym25$_PATH_LINK_LATTICE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym26$_PATH_NODE_LATTICE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym27$_KBP_ANCESTOR_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym28$_KBP_RUN_TIME_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym29$_NODE_ANCESTORS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym30$_LINK_ANCESTORS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym31$_KBP_DEPTH_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym32$_KBP_NODES_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym33$_KBP_LINKS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym34$_TERM_ARG_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym36$_KBP_ANCESTOR_HASH_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym37$_KBP_SEARCH_HASH_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym38$_KBP_MIN_ISA_PATH__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym39$_KBP_MIN_GENLS_PATH__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym40$_KBP_DESIGNATED_NODE_SUPERIORS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym41$_KBP_DESIGNATED_NODE_SUPERIORS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym42$_KBP_TRACE_LEVEL_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym43$_MAX_SEARCH_ITERATIONS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym44$_LIMIT_PATH_DEPTH__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym45$_KBP_MAX_DEPTH_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym47$_KBP_MAX_TERM_COUNT_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym48$_KBP_QUIT_WITH_SUCCESS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym49$_KBP_ONLY_GAF_LINKS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym50$_KBP_NO_BOOKKEEPING_LINKS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym51$_KBP_NO_INSTANCE_LINKS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym52$_KBP_NO_BI_SCOPING_LINKS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym53$_KBP_EXPLODE_NATS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym54$_KBP_DESIGNATED_PREDS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym55$_KBP_DESIGNATED_PREDS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym56$_KBP_RESTRICTED_PREDS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym57$_KBP_RESTRICTED_PREDS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym58$_KBP_RESTRICTED_MTS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym60$_KBP_RESTRICTED_MTS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym61$_KBP_EXTERNAL_LINK_PRED__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym62$_KBP_EXTERNAL_LINK_PRED_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym63$_KBP_GENL_BOUND__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym64$_KBP_GENL_BOUND_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym65$_KBP_GENLS_CARDINALITY_DELTA_BOUND__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym66$_KBP_GENLS_CARDINALITY_DELTA_BOUND_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym67$_KBP_ISA_BOUND__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym68$_KBP_ISA_BOUND_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym69$_KBP_NODE_ISA_BOUND__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym70$_KBP_NODE_ISA_BOUND_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym71$_KBP_RESTRICTED_NODES_AS_ARG__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym73$_KBP_RESTRICTED_NODES_AS_ARG_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym74$_KBP_LINK_REFERENCE_SET_BOUND__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym75$_KBP_LINK_REFERENCE_SET_BOUND_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym76$_KBP_DESIGNATED_LINK_REFERENCES__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym77$_KBP_DESIGNATED_LINK_REFERENCES_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym78$_KBP_BOUND_GAF_TERMS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym80$_KBP_BOUND_GAF_TERMS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym81$_KBP_BOUND_LINK_TERMS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym82$_KBP_BOUND_LINK_TERMS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym83$_KBP_USE_MAX_MTS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym84$_NODES_ACCESSOR_FN_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym85$_PATH_LINK_OP_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym86$_PATH_NODE_OP_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym87$_RELEVANT_LINK__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym88$_RELEVANT_NODE__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym89$_RELEVANT_LINK_TREE__;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym90$_EXCLUDE_NODES_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym91$_EXCLUDE_LINKS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$kbp_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$kbp_state_variables$.getGlobalValue() ) );
    }
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_paths_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_paths_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_paths_file();
  }
  static
  {
    me = new kb_paths();
    $kbp_quitP$ = null;
    $kbp_result_format$ = null;
    $search_iteration$ = null;
    $node_equalP$ = null;
    $kbp_nodeP$ = null;
    $kbp_linkP$ = null;
    $kbp_stats$ = null;
    $collect_kbp_statsP$ = null;
    $kbp_node_count$ = null;
    $kbp_link_count$ = null;
    $kbp_term_count$ = null;
    $source_term_args$ = null;
    $target_term_args$ = null;
    $relevant_node_treeP$ = null;
    $path_source$ = null;
    $path_target$ = null;
    $kbp_searcher$ = null;
    $kbp_searchers$ = null;
    $path_horizon$ = null;
    $kbp_common_nodes$ = null;
    $path_link_lattice$ = null;
    $path_node_lattice$ = null;
    $kbp_ancestor$ = null;
    $kbp_run_time$ = null;
    $node_ancestors$ = null;
    $link_ancestors$ = null;
    $kbp_depth$ = null;
    $kbp_nodes$ = null;
    $kbp_links$ = null;
    $term_arg$ = null;
    $kbp_ancestor_hash$ = null;
    $kbp_search_hash$ = null;
    $kbp_min_isa_pathP$ = null;
    $kbp_min_genls_pathP$ = null;
    $kbp_designated_node_superiorsP$ = null;
    $kbp_designated_node_superiors$ = null;
    $kbp_trace_level$ = null;
    $max_search_iterations$ = null;
    $limit_path_depthP$ = null;
    $kbp_max_depth$ = null;
    $kbp_max_term_count$ = null;
    $kbp_quit_with_successP$ = null;
    $kbp_only_gaf_linksP$ = null;
    $kbp_no_bookkeeping_linksP$ = null;
    $kbp_no_instance_linksP$ = null;
    $kbp_no_bi_scoping_linksP$ = null;
    $kbp_explode_natsP$ = null;
    $kbp_designated_predsP$ = null;
    $kbp_designated_preds$ = null;
    $kbp_restricted_predsP$ = null;
    $kbp_restricted_preds$ = null;
    $kbp_restricted_mtsP$ = null;
    $kbp_restricted_mts$ = null;
    $kbp_external_link_predP$ = null;
    $kbp_external_link_pred$ = null;
    $kbp_genl_boundP$ = null;
    $kbp_genl_bound$ = null;
    $kbp_genls_cardinality_delta_boundP$ = null;
    $kbp_genls_cardinality_delta_bound$ = null;
    $kbp_isa_boundP$ = null;
    $kbp_isa_bound$ = null;
    $kbp_node_isa_boundP$ = null;
    $kbp_node_isa_bound$ = null;
    $kbp_restricted_nodes_as_argP$ = null;
    $kbp_restricted_nodes_as_arg$ = null;
    $kbp_link_reference_set_boundP$ = null;
    $kbp_link_reference_set_bound$ = null;
    $kbp_designated_link_referencesP$ = null;
    $kbp_designated_link_references$ = null;
    $kbp_bound_gaf_termsP$ = null;
    $kbp_bound_gaf_terms$ = null;
    $kbp_bound_link_termsP$ = null;
    $kbp_bound_link_terms$ = null;
    $kbp_use_max_mtsP$ = null;
    $nodes_accessor_fn$ = null;
    $path_link_op$ = null;
    $path_node_op$ = null;
    $relevant_linkP$ = null;
    $relevant_nodeP$ = null;
    $relevant_link_treeP$ = null;
    $exclude_nodes$ = null;
    $exclude_links$ = null;
    $cr_paths_table$ = null;
    $cr_gaf_count$ = null;
    $cr_explained_count$ = null;
    $cr_error_count$ = null;
    $sym0$_KBP_QUIT__ = makeSymbol( "*KBP-QUIT?*" );
    $kw1$PATHS = makeKeyword( "PATHS" );
    $sym2$_KBP_RESULT_FORMAT_ = makeSymbol( "*KBP-RESULT-FORMAT*" );
    $sym3$_SEARCH_ITERATION_ = makeSymbol( "*SEARCH-ITERATION*" );
    $sym4$_NODE_EQUAL__ = makeSymbol( "*NODE-EQUAL?*" );
    $sym5$FORT_P = makeSymbol( "FORT-P" );
    $sym6$_KBP_NODE__ = makeSymbol( "*KBP-NODE?*" );
    $sym7$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym8$_KBP_LINK__ = makeSymbol( "*KBP-LINK?*" );
    $sym9$_KBP_STATS_ = makeSymbol( "*KBP-STATS*" );
    $sym10$_COLLECT_KBP_STATS__ = makeSymbol( "*COLLECT-KBP-STATS?*" );
    $sym11$_KBP_NODE_COUNT_ = makeSymbol( "*KBP-NODE-COUNT*" );
    $sym12$_KBP_LINK_COUNT_ = makeSymbol( "*KBP-LINK-COUNT*" );
    $sym13$_KBP_TERM_COUNT_ = makeSymbol( "*KBP-TERM-COUNT*" );
    $list14 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER );
    $sym15$_SOURCE_TERM_ARGS_ = makeSymbol( "*SOURCE-TERM-ARGS*" );
    $list16 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER, FOUR_INTEGER, FOUR_INTEGER, FIVE_INTEGER );
    $sym17$_TARGET_TERM_ARGS_ = makeSymbol( "*TARGET-TERM-ARGS*" );
    $sym18$_RELEVANT_NODE_TREE__ = makeSymbol( "*RELEVANT-NODE-TREE?*" );
    $sym19$_PATH_SOURCE_ = makeSymbol( "*PATH-SOURCE*" );
    $sym20$_PATH_TARGET_ = makeSymbol( "*PATH-TARGET*" );
    $sym21$_KBP_SEARCHER_ = makeSymbol( "*KBP-SEARCHER*" );
    $sym22$_KBP_SEARCHERS_ = makeSymbol( "*KBP-SEARCHERS*" );
    $sym23$_PATH_HORIZON_ = makeSymbol( "*PATH-HORIZON*" );
    $sym24$_KBP_COMMON_NODES_ = makeSymbol( "*KBP-COMMON-NODES*" );
    $sym25$_PATH_LINK_LATTICE_ = makeSymbol( "*PATH-LINK-LATTICE*" );
    $sym26$_PATH_NODE_LATTICE_ = makeSymbol( "*PATH-NODE-LATTICE*" );
    $sym27$_KBP_ANCESTOR_ = makeSymbol( "*KBP-ANCESTOR*" );
    $sym28$_KBP_RUN_TIME_ = makeSymbol( "*KBP-RUN-TIME*" );
    $sym29$_NODE_ANCESTORS_ = makeSymbol( "*NODE-ANCESTORS*" );
    $sym30$_LINK_ANCESTORS_ = makeSymbol( "*LINK-ANCESTORS*" );
    $sym31$_KBP_DEPTH_ = makeSymbol( "*KBP-DEPTH*" );
    $sym32$_KBP_NODES_ = makeSymbol( "*KBP-NODES*" );
    $sym33$_KBP_LINKS_ = makeSymbol( "*KBP-LINKS*" );
    $sym34$_TERM_ARG_ = makeSymbol( "*TERM-ARG*" );
    $int35$2048 = makeInteger( 2048 );
    $sym36$_KBP_ANCESTOR_HASH_ = makeSymbol( "*KBP-ANCESTOR-HASH*" );
    $sym37$_KBP_SEARCH_HASH_ = makeSymbol( "*KBP-SEARCH-HASH*" );
    $sym38$_KBP_MIN_ISA_PATH__ = makeSymbol( "*KBP-MIN-ISA-PATH?*" );
    $sym39$_KBP_MIN_GENLS_PATH__ = makeSymbol( "*KBP-MIN-GENLS-PATH?*" );
    $sym40$_KBP_DESIGNATED_NODE_SUPERIORS__ = makeSymbol( "*KBP-DESIGNATED-NODE-SUPERIORS?*" );
    $sym41$_KBP_DESIGNATED_NODE_SUPERIORS_ = makeSymbol( "*KBP-DESIGNATED-NODE-SUPERIORS*" );
    $sym42$_KBP_TRACE_LEVEL_ = makeSymbol( "*KBP-TRACE-LEVEL*" );
    $sym43$_MAX_SEARCH_ITERATIONS_ = makeSymbol( "*MAX-SEARCH-ITERATIONS*" );
    $sym44$_LIMIT_PATH_DEPTH__ = makeSymbol( "*LIMIT-PATH-DEPTH?*" );
    $sym45$_KBP_MAX_DEPTH_ = makeSymbol( "*KBP-MAX-DEPTH*" );
    $int46$1000 = makeInteger( 1000 );
    $sym47$_KBP_MAX_TERM_COUNT_ = makeSymbol( "*KBP-MAX-TERM-COUNT*" );
    $sym48$_KBP_QUIT_WITH_SUCCESS__ = makeSymbol( "*KBP-QUIT-WITH-SUCCESS?*" );
    $sym49$_KBP_ONLY_GAF_LINKS__ = makeSymbol( "*KBP-ONLY-GAF-LINKS?*" );
    $sym50$_KBP_NO_BOOKKEEPING_LINKS__ = makeSymbol( "*KBP-NO-BOOKKEEPING-LINKS?*" );
    $sym51$_KBP_NO_INSTANCE_LINKS__ = makeSymbol( "*KBP-NO-INSTANCE-LINKS?*" );
    $sym52$_KBP_NO_BI_SCOPING_LINKS__ = makeSymbol( "*KBP-NO-BI-SCOPING-LINKS?*" );
    $sym53$_KBP_EXPLODE_NATS__ = makeSymbol( "*KBP-EXPLODE-NATS?*" );
    $sym54$_KBP_DESIGNATED_PREDS__ = makeSymbol( "*KBP-DESIGNATED-PREDS?*" );
    $sym55$_KBP_DESIGNATED_PREDS_ = makeSymbol( "*KBP-DESIGNATED-PREDS*" );
    $sym56$_KBP_RESTRICTED_PREDS__ = makeSymbol( "*KBP-RESTRICTED-PREDS?*" );
    $sym57$_KBP_RESTRICTED_PREDS_ = makeSymbol( "*KBP-RESTRICTED-PREDS*" );
    $sym58$_KBP_RESTRICTED_MTS__ = makeSymbol( "*KBP-RESTRICTED-MTS?*" );
    $list59 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ) );
    $sym60$_KBP_RESTRICTED_MTS_ = makeSymbol( "*KBP-RESTRICTED-MTS*" );
    $sym61$_KBP_EXTERNAL_LINK_PRED__ = makeSymbol( "*KBP-EXTERNAL-LINK-PRED?*" );
    $sym62$_KBP_EXTERNAL_LINK_PRED_ = makeSymbol( "*KBP-EXTERNAL-LINK-PRED*" );
    $sym63$_KBP_GENL_BOUND__ = makeSymbol( "*KBP-GENL-BOUND?*" );
    $sym64$_KBP_GENL_BOUND_ = makeSymbol( "*KBP-GENL-BOUND*" );
    $sym65$_KBP_GENLS_CARDINALITY_DELTA_BOUND__ = makeSymbol( "*KBP-GENLS-CARDINALITY-DELTA-BOUND?*" );
    $sym66$_KBP_GENLS_CARDINALITY_DELTA_BOUND_ = makeSymbol( "*KBP-GENLS-CARDINALITY-DELTA-BOUND*" );
    $sym67$_KBP_ISA_BOUND__ = makeSymbol( "*KBP-ISA-BOUND?*" );
    $sym68$_KBP_ISA_BOUND_ = makeSymbol( "*KBP-ISA-BOUND*" );
    $sym69$_KBP_NODE_ISA_BOUND__ = makeSymbol( "*KBP-NODE-ISA-BOUND?*" );
    $sym70$_KBP_NODE_ISA_BOUND_ = makeSymbol( "*KBP-NODE-ISA-BOUND*" );
    $sym71$_KBP_RESTRICTED_NODES_AS_ARG__ = makeSymbol( "*KBP-RESTRICTED-NODES-AS-ARG?*" );
    $list72 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedCollection" ) ), ONE_INTEGER ) );
    $sym73$_KBP_RESTRICTED_NODES_AS_ARG_ = makeSymbol( "*KBP-RESTRICTED-NODES-AS-ARG*" );
    $sym74$_KBP_LINK_REFERENCE_SET_BOUND__ = makeSymbol( "*KBP-LINK-REFERENCE-SET-BOUND?*" );
    $sym75$_KBP_LINK_REFERENCE_SET_BOUND_ = makeSymbol( "*KBP-LINK-REFERENCE-SET-BOUND*" );
    $sym76$_KBP_DESIGNATED_LINK_REFERENCES__ = makeSymbol( "*KBP-DESIGNATED-LINK-REFERENCES?*" );
    $sym77$_KBP_DESIGNATED_LINK_REFERENCES_ = makeSymbol( "*KBP-DESIGNATED-LINK-REFERENCES*" );
    $sym78$_KBP_BOUND_GAF_TERMS__ = makeSymbol( "*KBP-BOUND-GAF-TERMS?*" );
    $list79 = ConsesLow.list( ZERO_INTEGER );
    $sym80$_KBP_BOUND_GAF_TERMS_ = makeSymbol( "*KBP-BOUND-GAF-TERMS*" );
    $sym81$_KBP_BOUND_LINK_TERMS__ = makeSymbol( "*KBP-BOUND-LINK-TERMS?*" );
    $sym82$_KBP_BOUND_LINK_TERMS_ = makeSymbol( "*KBP-BOUND-LINK-TERMS*" );
    $sym83$_KBP_USE_MAX_MTS__ = makeSymbol( "*KBP-USE-MAX-MTS?*" );
    $sym84$_NODES_ACCESSOR_FN_ = makeSymbol( "*NODES-ACCESSOR-FN*" );
    $sym85$_PATH_LINK_OP_ = makeSymbol( "*PATH-LINK-OP*" );
    $sym86$_PATH_NODE_OP_ = makeSymbol( "*PATH-NODE-OP*" );
    $sym87$_RELEVANT_LINK__ = makeSymbol( "*RELEVANT-LINK?*" );
    $sym88$_RELEVANT_NODE__ = makeSymbol( "*RELEVANT-NODE?*" );
    $sym89$_RELEVANT_LINK_TREE__ = makeSymbol( "*RELEVANT-LINK-TREE?*" );
    $sym90$_EXCLUDE_NODES_ = makeSymbol( "*EXCLUDE-NODES*" );
    $sym91$_EXCLUDE_LINKS_ = makeSymbol( "*EXCLUDE-LINKS*" );
    $sym92$ALL_ASSERTION_TERMS = makeSymbol( "ALL-ASSERTION-TERMS" );
    $sym93$DEFAULT_LINK_OP = makeSymbol( "DEFAULT-LINK-OP" );
    $sym94$DEFAULT_NODE_OP = makeSymbol( "DEFAULT-NODE-OP" );
    $sym95$DEFAULT_RELEVANT_LINK_ = makeSymbol( "DEFAULT-RELEVANT-LINK?" );
    $sym96$DEFAULT_RELEVANT_NODE_ = makeSymbol( "DEFAULT-RELEVANT-NODE?" );
    $sym97$DEFAULT_RELEVANT_LINK_TREE_ = makeSymbol( "DEFAULT-RELEVANT-LINK-TREE?" );
    $str98$searching_for_kb_paths = makeString( "searching for kb paths" );
    $str99$missed_connection = makeString( "missed connection" );
    $str100$duplicates_in_accessed1 = makeString( "duplicates in accessed1" );
    $str101$duplicates_in_accessed2 = makeString( "duplicates in accessed2" );
    $kw102$SUCCESS = makeKeyword( "SUCCESS" );
    $str103$horizons_missed__iteration__s = makeString( "horizons missed; iteration ~s" );
    $sym104$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const105$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym106$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $str107$____kbp_common_nodes___a = makeString( "~%~%kbp common nodes: ~a" );
    $str108$____complete_paths_home_from___s_ = makeString( "~%~%complete-paths-home-from: ~s ~%~s" );
    $str109$_____acomplete_paths_home_from_li = makeString( "~%~%~acomplete-paths-home-from-link: ~s ~%~a~s" );
    $str110$_____acomplete_paths_home_from_no = makeString( "~%~%~acomplete-paths-home-from-node: ~s ~%~a~s" );
    $kw111$LINKS = makeKeyword( "LINKS" );
    $str112$invalid_path_format___s = makeString( "invalid path format: ~s" );
    $list113 = ConsesLow.list( makeSymbol( "ROOT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "LINKS" ) );
    $str114$_____agather_node_latice____a_s = makeString( "~%~%~agather-node-latice:~%~a~s" );
    $str115$_____agather_link_latice_____a_s = makeString( "~%~%~agather-link-latice: ~%~a~s" );
    $sym116$KBP_LINK_NODES = makeSymbol( "KBP-LINK-NODES" );
    $str117$____marking_horizon_for__s_in_ite = makeString( "~%~%marking horizon for ~s in iteration ~s" );
    $str118$__search_node____s__s___s = makeString( "~%search node: [~s ~s] ~s" );
    $str119$empty_horizon_for__s_in_iteration = makeString( "empty horizon for ~s in iteration ~s" );
    $str120$___s_searched_by___s = makeString( "~%~s searched by: ~s" );
    $str121$___s______goal_________________ = makeString( "~%~s  *** goal!!!!!!!!!!!!!!!!!" );
    $kw122$TERM_BOUND = makeKeyword( "TERM-BOUND" );
    $sym123$_ = makeSymbol( "+" );
    $sym124$INTEGERP = makeSymbol( "INTEGERP" );
    $sym125$SPEC_CARDINALITY = makeSymbol( "SPEC-CARDINALITY" );
    $const126$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw127$UP = makeKeyword( "UP" );
    $kw128$DOWN = makeKeyword( "DOWN" );
    $const129$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw130$NEG = makeKeyword( "NEG" );
    $sym131$SECOND = makeSymbol( "SECOND" );
    $kw132$POS = makeKeyword( "POS" );
    $kw133$OTHER = makeKeyword( "OTHER" );
    $kw134$DEPTH = makeKeyword( "DEPTH" );
    $kw135$ITERATIONS = makeKeyword( "ITERATIONS" );
    $kw136$TERMS = makeKeyword( "TERMS" );
    $kw137$NODES = makeKeyword( "NODES" );
    $kw138$BRANCH = makeKeyword( "BRANCH" );
    $kw139$TIME = makeKeyword( "TIME" );
    $kw140$TERMINATION = makeKeyword( "TERMINATION" );
    $kw141$EXHAUST = makeKeyword( "EXHAUST" );
    $kw142$ITERATION_BOUND = makeKeyword( "ITERATION-BOUND" );
    $sym143$EQUAL_NODES_ = makeSymbol( "EQUAL-NODES?" );
    $sym144$ASSERTIONS_FI_EQUAL_ = makeSymbol( "ASSERTIONS-FI-EQUAL?" );
    $list145 = ConsesLow.list( makeSymbol( "NODE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "LINK-PATH" ) );
    $list146 = ConsesLow.list( makeSymbol( "LINK" ), makeSymbol( "NODE-PATH" ) );
    $list147 = ConsesLow.list( makeSymbol( "NODE-1" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "LINK-PATH-1" ) );
    $list148 = ConsesLow.list( makeSymbol( "LINK-1" ), makeSymbol( "NODE-PATH-1" ) );
    $list149 = ConsesLow.list( makeSymbol( "NODE-2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "LINK-PATH-2" ) );
    $sym150$KBP_JUST_FROM_TUPLES = makeSymbol( "KBP-JUST-FROM-TUPLES" );
    $sym151$KBP_JUST_FROM_TUPLE = makeSymbol( "KBP-JUST-FROM-TUPLE" );
    $str152$continue_anyway = makeString( "continue anyway" );
    $sym153$WARN = makeSymbol( "WARN" );
    $list154 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ) );
    $list155 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $list156 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ) );
    $int157$1024 = makeInteger( 1024 );
    $list158 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "conceptuallyRelated" ) ) );
    $list159 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ), constant_handles
        .reader_make_constant_shell( makeString( "KnowledgeBase" ) ) );
    $list160 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TestingConstant" ) ), constant_handles.reader_make_constant_shell( makeString( "LinguisticObjectType" ) ), constant_handles
        .reader_make_constant_shell( makeString( "InferenceRelatedBookkeepingPredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "GenericAttribute" ) ), constant_handles.reader_make_constant_shell(
            makeString( "KnowledgeBase" ) ) );
    $list161 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PartiallyTangible" ) ), constant_handles.reader_make_constant_shell( makeString( "SiblingDisjointCollectionType" ) ),
        constant_handles.reader_make_constant_shell( makeString( "ExistingObjectType" ) ) );
    $list162 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ) );
    $sym163$EXPLAIN_CR_GAF_VIA_PATHS = makeSymbol( "EXPLAIN-CR-GAF-VIA-PATHS" );
    $const164$conceptuallyRelated = constant_handles.reader_make_constant_shell( makeString( "conceptuallyRelated" ) );
    $sym165$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym166$KB_ASSERTION_ = makeSymbol( "KB-ASSERTION?" );
    $sym167$ASSERTION_FI_FORMULA = makeSymbol( "ASSERTION-FI-FORMULA" );
    $str168$__cr_gafs_considered___a = makeString( "~%cr gafs considered: ~a" );
    $str169$__cr_gafs_explained___a = makeString( "~%cr gafs explained: ~a" );
    $str170$__cr_gafs_w_errors___a = makeString( "~%cr gafs w/errors: ~a" );
    $const171$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $const172$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $kw173$MIN = makeKeyword( "MIN" );
    $list174 = ConsesLow.list( makeKeyword( "REQUIRED" ), makeKeyword( "RELATION-ALL" ) );
    $kw175$BREADTH = makeKeyword( "BREADTH" );
    $kw176$QUEUE = makeKeyword( "QUEUE" );
    $kw177$STACK = makeKeyword( "STACK" );
    $sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw179$ERROR = makeKeyword( "ERROR" );
    $str180$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym181$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw182$CERROR = makeKeyword( "CERROR" );
    $kw183$WARN = makeKeyword( "WARN" );
    $str184$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $sym185$GENLS_GATHER_FOCUS_PREDS_COLS = makeSymbol( "GENLS-GATHER-FOCUS-PREDS-COLS" );
    $kw186$TRUE = makeKeyword( "TRUE" );
    $str187$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str188$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str189$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym190$CAR = makeSymbol( "CAR" );
    $list191 = ConsesLow.cons( makeSymbol( "COL" ), makeSymbol( "PRED" ) );
    $sym192$_ = makeSymbol( ">" );
    $sym193$CADR = makeSymbol( "CADR" );
    $const194$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $kw195$ALL = makeKeyword( "ALL" );
    $kw196$MAX = makeKeyword( "MAX" );
    $kw197$MID = makeKeyword( "MID" );
    $kw198$EDGE = makeKeyword( "EDGE" );
    $list199 = ConsesLow.list( makeKeyword( "REQUIRED" ), makeKeyword( "RELATION-ALL" ), makeKeyword( "RELATION-EXISTS" ), makeKeyword( "INTER-ARG-ISA-INDEPENDENT" ), makeKeyword( "INTER-ARG-ISA-DEPENDENT" ) );
    $sym200$GENLS_GATHER_FOCUS_PREDS_OF = makeSymbol( "GENLS-GATHER-FOCUS-PREDS-OF" );
  }
}
/*
 * 
 * Total time: 3861 ms
 * 
 */