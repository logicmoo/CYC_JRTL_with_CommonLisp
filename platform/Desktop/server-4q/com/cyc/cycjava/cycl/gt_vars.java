package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.gt_vars";
  public static final String myFingerPrint = "0c532b9731ef46bee9d9391f28a27653672de74600354b652fac5a797a0ac394";
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 526L)
  public static SubLSymbol $gt_dispatch_table$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 4824L)
  public static SubLSymbol $gt_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 4920L)
  public static SubLSymbol $gt_parameters$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5063L)
  public static SubLSymbol $transitivity_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5170L)
  public static SubLSymbol $gt_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5246L)
  public static SubLSymbol $gt_index$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5322L)
  public static SubLSymbol $gt_gather$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5422L)
  public static SubLSymbol $gt_index_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5501L)
  public static SubLSymbol $gt_gather_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5582L)
  public static SubLSymbol $gt_accessors$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5651L)
  public static SubLSymbol $gt_link_type$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5723L)
  public static SubLSymbol $gt_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5806L)
  public static SubLSymbol $gt_modes$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5933L)
  public static SubLSymbol $gt_truth$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6018L)
  public static SubLSymbol $gt_query$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6099L)
  public static SubLSymbol $gt_doneP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6161L)
  public static SubLSymbol $gt_searchedP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6244L)
  public static SubLSymbol $gt_target$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6302L)
  public static SubLSymbol $gt_result$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6371L)
  public static SubLSymbol $gt_searcher$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6455L)
  public static SubLSymbol $gt_base_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6537L)
  public static SubLSymbol $gt_step_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6634L)
  public static SubLSymbol $gt_compose_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6728L)
  public static SubLSymbol $gt_gather_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6820L)
  public static SubLSymbol $gt_combine_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6931L)
  public static SubLSymbol $gt_compare_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7034L)
  public static SubLSymbol $gt_equality_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7152L)
  public static SubLSymbol $gt_compose_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7245L)
  public static SubLSymbol $gt_compose_index_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7350L)
  public static SubLSymbol $gt_compose_gather_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7457L)
  public static SubLSymbol $gt_max_nodes_direction$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7556L)
  public static SubLSymbol $gt_use_spec_predsP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7629L)
  public static SubLSymbol $gt_handle_non_transitive_predicateP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7743L)
  public static SubLSymbol $gt_link_support$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 8683L)
  public static SubLSymbol $gt_what_mts_result$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 8793L)
  public static SubLSymbol $gt_what_mts_goal_node$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 8868L)
  public static SubLSymbol $gt_path_list_of_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 8939L)
  public static SubLSymbol $gt_path_list_of_nodes$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9037L)
  public static SubLSymbol $gt_path_length$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9096L)
  public static SubLSymbol $gt_list_of_path_lengths$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9170L)
  public static SubLSymbol $gt_marking_table$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9327L)
  public static SubLSymbol $gt_target_marking_table$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9409L)
  public static SubLSymbol $gt_depth_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9540L)
  public static SubLSymbol $gt_depth_cutoffP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9622L)
  public static SubLSymbol $gt_prev_depth_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9724L)
  public static SubLSymbol $gt_time_cutoffP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9830L)
  public static SubLSymbol $gt_time_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9904L)
  public static SubLSymbol $gt_initial_time$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9965L)
  public static SubLSymbol $gt_answers_cutoffP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10090L)
  public static SubLSymbol $gt_answers_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10178L)
  public static SubLSymbol $gt_answers_so_far$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10255L)
  public static SubLSymbol $gt_goal_node$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10323L)
  public static SubLSymbol $gt_edge_list$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10398L)
  public static SubLSymbol $gt_edge_list_returnP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10466L)
  public static SubLSymbol $gt_path_list_of_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10560L)
  public static SubLSymbol $gt_cyclical_edges$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10741L)
  public static SubLSymbol $gt_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10900L)
  public static SubLSymbol $gt_test_level$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 11008L)
  public static SubLSymbol $suspend_gt_type_checkingP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 11093L)
  public static SubLSymbol $gt_warnings$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 11239L)
  public static SubLSymbol $gt_use_sksiP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 13658L)
  public static SubLSymbol $tt_dispatch_table$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15102L)
  public static SubLSymbol $tt_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15198L)
  public static SubLSymbol $transfers_through_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15314L)
  public static SubLSymbol $tt_parameters$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15500L)
  public static SubLSymbol $tt_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15576L)
  public static SubLSymbol $tt_index$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15652L)
  public static SubLSymbol $tt_gather$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15752L)
  public static SubLSymbol $tt_index_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15831L)
  public static SubLSymbol $tt_gather_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15912L)
  public static SubLSymbol $tt_truth$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15997L)
  public static SubLSymbol $tt_step_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 16087L)
  public static SubLSymbol $tt_transitive_conduitP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 22655L)
  public static SubLSymbol $gt_transitive_via_arg_activeP$;
  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 22783L)
  public static SubLSymbol $gt_within_transitive_via_argP$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$_GT_DISPATCH_TABLE_;
  private static final SubLSymbol $sym2$CAR;
  private static final SubLSymbol $sym3$_GT_METHODS_;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$_GT_PARAMETERS_;
  private static final SubLSymbol $sym6$_TRANSITIVITY_MODULES_;
  private static final SubLSymbol $sym7$_GT_PRED_;
  private static final SubLSymbol $sym8$_GT_INDEX_;
  private static final SubLSymbol $sym9$_GT_GATHER_;
  private static final SubLSymbol $sym10$_GT_INDEX_ARG_;
  private static final SubLSymbol $sym11$_GT_GATHER_ARG_;
  private static final SubLSymbol $sym12$_GT_ACCESSORS_;
  private static final SubLSymbol $kw13$ASSERTION;
  private static final SubLSymbol $sym14$_GT_LINK_TYPE_;
  private static final SubLSymbol $kw15$SUPERIOR;
  private static final SubLSymbol $sym16$_GT_MODE_;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$_GT_MODES_;
  private static final SubLSymbol $kw19$TRUE;
  private static final SubLSymbol $sym20$_GT_TRUTH_;
  private static final SubLSymbol $sym21$_GT_QUERY_;
  private static final SubLSymbol $sym22$_GT_DONE__;
  private static final SubLSymbol $sym23$_GT_SEARCHED__;
  private static final SubLSymbol $sym24$_GT_TARGET_;
  private static final SubLSymbol $sym25$_GT_RESULT_;
  private static final SubLSymbol $sym26$_GT_SEARCHER_;
  private static final SubLSymbol $sym27$_GT_BASE_FN_;
  private static final SubLSymbol $sym28$_GT_STEP_FN_;
  private static final SubLSymbol $sym29$_GT_COMPOSE_FN_;
  private static final SubLSymbol $sym30$_GT_GATHER_FN_;
  private static final SubLSymbol $sym31$NCONC;
  private static final SubLSymbol $sym32$_GT_COMBINE_FN_;
  private static final SubLSymbol $sym33$_GT_COMPARE_FN_;
  private static final SubLSymbol $sym34$_GT_EQUALITY_FN_;
  private static final SubLSymbol $sym35$_GT_COMPOSE_PRED_;
  private static final SubLSymbol $sym36$_GT_COMPOSE_INDEX_ARG_;
  private static final SubLSymbol $sym37$_GT_COMPOSE_GATHER_ARG_;
  private static final SubLSymbol $kw38$DOWN;
  private static final SubLSymbol $sym39$_GT_MAX_NODES_DIRECTION_;
  private static final SubLSymbol $sym40$_GT_USE_SPEC_PREDS__;
  private static final SubLSymbol $sym41$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__;
  private static final SubLString $str42$Current_link_support__a_is_not_a_;
  private static final SubLString $str43$Current_link_support__a_is_not_a_;
  private static final SubLSymbol $sym44$_GT_WHAT_MTS_RESULT_;
  private static final SubLSymbol $sym45$_GT_WHAT_MTS_GOAL_NODE_;
  private static final SubLSymbol $sym46$_GT_PATH_LIST_OF_MTS_;
  private static final SubLSymbol $sym47$_GT_PATH_LIST_OF_NODES_;
  private static final SubLSymbol $sym48$_GT_PATH_LENGTH_;
  private static final SubLSymbol $sym49$_GT_LIST_OF_PATH_LENGTHS_;
  private static final SubLSymbol $sym50$_GT_MARKING_TABLE_;
  private static final SubLSymbol $sym51$_GT_TARGET_MARKING_TABLE_;
  private static final SubLSymbol $sym52$_GT_DEPTH_CUTOFF_;
  private static final SubLSymbol $sym53$_GT_DEPTH_CUTOFF__;
  private static final SubLSymbol $sym54$_GT_PREV_DEPTH_CUTOFF_;
  private static final SubLSymbol $sym55$_GT_TIME_CUTOFF__;
  private static final SubLSymbol $sym56$_GT_TIME_CUTOFF_;
  private static final SubLSymbol $sym57$_GT_INITIAL_TIME_;
  private static final SubLSymbol $sym58$_GT_ANSWERS_CUTOFF__;
  private static final SubLSymbol $sym59$_GT_ANSWERS_CUTOFF_;
  private static final SubLSymbol $sym60$_GT_ANSWERS_SO_FAR_;
  private static final SubLSymbol $sym61$_GT_GOAL_NODE_;
  private static final SubLSymbol $sym62$_GT_EDGE_LIST_;
  private static final SubLSymbol $sym63$_GT_EDGE_LIST_RETURN__;
  private static final SubLSymbol $sym64$_GT_PATH_LIST_OF_ASSERTIONS_;
  private static final SubLSymbol $sym65$_GT_CYCLICAL_EDGES_;
  private static final SubLSymbol $sym66$_GT_TRACE_LEVEL_;
  private static final SubLSymbol $sym67$_GT_TEST_LEVEL_;
  private static final SubLSymbol $sym68$_SUSPEND_GT_TYPE_CHECKING__;
  private static final SubLSymbol $sym69$_GT_WARNINGS_;
  private static final SubLSymbol $sym70$_GT_USE_SKSI__;
  private static final SubLList $list71;
  private static final SubLSymbol $kw72$ACCESSORS;
  private static final SubLSymbol $kw73$PREDICATE;
  private static final SubLSymbol $kw74$INDEX_ARG;
  private static final SubLSymbol $kw75$GATHER_ARG;
  private static final SubLSymbol $kw76$MT;
  private static final SubLSymbol $sym77$DEFINE;
  private static final SubLSymbol $sym78$CLET;
  private static final SubLList $list79;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$CSETQ;
  private static final SubLSymbol $sym83$RESULT;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$QUOTE;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$PROGN;
  private static final SubLSymbol $sym88$SETUP_TRANSITIVITY_MODULE;
  private static final SubLSymbol $sym89$CPUSHNEW;
  private static final SubLList $list90;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$_TT_DISPATCH_TABLE_;
  private static final SubLSymbol $sym93$_TT_METHODS_;
  private static final SubLSymbol $sym94$_TRANSFERS_THROUGH_MODULES_;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$_TT_PARAMETERS_;
  private static final SubLSymbol $sym97$_TT_PRED_;
  private static final SubLSymbol $sym98$_TT_INDEX_;
  private static final SubLSymbol $sym99$_TT_GATHER_;
  private static final SubLSymbol $sym100$_TT_INDEX_ARG_;
  private static final SubLSymbol $sym101$_TT_GATHER_ARG_;
  private static final SubLSymbol $sym102$_TT_TRUTH_;
  private static final SubLSymbol $sym103$_TT_STEP_FN_;
  private static final SubLSymbol $sym104$_TT_TRANSITIVE_CONDUIT__;
  private static final SubLSymbol $kw105$CONDUIT_PRED;
  private static final SubLSymbol $sym106$TRANSITIVE_PREDICATE_;
  private static final SubLSymbol $sym107$GENERIC_TTM;
  private static final SubLSymbol $sym108$SETUP_TRANSFERS_THROUGH_MODULE;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$_GT_TRANSITIVE_VIA_ARG_ACTIVE__;
  private static final SubLSymbol $sym111$_GT_WITHIN_TRANSITIVE_VIA_ARG__;

  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7873L)
  public static SubLObject gt_link_support()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $gt_link_support$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7938L)
  public static SubLObject gt_link_mt()
  {
    final SubLObject link_support = gt_link_support();
    if( NIL != assertion_handles.assertion_p( link_support ) )
    {
      return assertions_high.assertion_mt( link_support );
    }
    if( NIL != arguments.hl_support_p( link_support ) )
    {
      return arguments.support_mt( link_support );
    }
    return gt_utilities.gt_error( ONE_INTEGER, $str42$Current_link_support__a_is_not_a_, link_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 8297L)
  public static SubLObject gt_link_pred()
  {
    final SubLObject link_support = gt_link_support();
    if( NIL != assertions_high.gaf_assertionP( link_support ) )
    {
      return assertions_high.gaf_arg0( link_support );
    }
    if( NIL != arguments.hl_support_p( link_support ) )
    {
      return cycl_utilities.formula_arg0( arguments.support_formula( link_support ) );
    }
    return gt_utilities.gt_error( ONE_INTEGER, $str43$Current_link_support__a_is_not_a_, link_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 11239L)
  public static SubLObject gt_use_sksiP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $gt_use_sksiP$.getDynamicValue( thread ) && NIL != sksi_query_utilities.some_sksi_removal_module_registeredP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 11593L)
  public static SubLObject transitivity_module(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject module = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    plist = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject method_forms = NIL;
      if( plist.isCons() )
      {
        SubLObject accessors = conses_high.getf( plist, $kw72$ACCESSORS, UNPROVIDED );
        SubLObject predicate = conses_high.getf( plist, $kw73$PREDICATE, UNPROVIDED );
        SubLObject index_arg = conses_high.getf( plist, $kw74$INDEX_ARG, UNPROVIDED );
        SubLObject gather_arg = conses_high.getf( plist, $kw75$GATHER_ARG, UNPROVIDED );
        final SubLObject gtmt = conses_high.getf( plist, $kw76$MT, UNPROVIDED );
        SubLObject mode = $kw72$ACCESSORS;
        if( NIL == index_arg )
        {
          index_arg = ONE_INTEGER;
        }
        if( NIL == gather_arg )
        {
          gather_arg = TWO_INTEGER;
        }
        if( !accessors.isCons() )
        {
          accessors = ConsesLow.list( ConsesLow.list( predicate, index_arg, gather_arg ) );
        }
        if( accessors.isCons() && NIL == accessors.rest() )
        {
          mode = $kw73$PREDICATE;
          predicate = accessors.first().first();
          index_arg = conses_high.second( accessors.first() );
          gather_arg = conses_high.third( accessors.first() );
        }
        SubLObject parameters = NIL;
        SubLObject parameter = NIL;
        parameters = plist;
        parameter = parameters.first();
        while ( NIL != parameters)
        {
          if( NIL != subl_promotions.memberP( parameter, $gt_methods$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject function = Packages.intern( string_utilities.str( conses_high.second( parameters ) ), UNPROVIDED );
            final SubLObject arg_list = transitivity.add_mt_default( gtmt, conses_high.third( conses_high.assoc( parameter, $gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) );
            final SubLObject args = list_utilities.args_from_arg_list( arg_list );
            final SubLObject gt_function = conses_high.second( conses_high.assoc( parameter, $gt_dispatch_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
            final SubLObject pcase_var = mode;
            if( pcase_var.eql( $kw73$PREDICATE ) )
            {
              method_forms = ConsesLow.cons( ConsesLow.list( $sym77$DEFINE, function, arg_list, ConsesLow.listS( $sym78$CLET, $list79, ConsesLow.list( $sym78$CLET, ConsesLow.listS( ConsesLow.list( $sym7$_GT_PRED_,
                  predicate ), $list80, ConsesLow.list( $sym10$_GT_INDEX_ARG_, index_arg ), ConsesLow.list( $sym11$_GT_GATHER_ARG_, gather_arg ), $list81 ), ConsesLow.list( $sym82$CSETQ, $sym83$RESULT, reader.bq_cons(
                      gt_function, ConsesLow.append( args, NIL ) ) ) ), $list84 ) ), method_forms );
            }
            else if( pcase_var.eql( $kw72$ACCESSORS ) )
            {
              method_forms = ConsesLow.cons( ConsesLow.list( $sym77$DEFINE, function, arg_list, ConsesLow.listS( $sym78$CLET, $list79, ConsesLow.list( $sym78$CLET, reader.bq_cons( ConsesLow.list( $sym12$_GT_ACCESSORS_,
                  ConsesLow.list( $sym85$QUOTE, accessors ) ), $list86 ), ConsesLow.list( $sym82$CSETQ, $sym83$RESULT, reader.bq_cons( gt_function, ConsesLow.append( args, NIL ) ) ) ), $list84 ) ), method_forms );
            }
          }
          parameters = conses_high.cddr( parameters );
          parameter = parameters.first();
        }
      }
      return ConsesLow.listS( $sym87$PROGN, ConsesLow.list( $sym88$SETUP_TRANSITIVITY_MODULE, module, ConsesLow.list( $sym85$QUOTE, plist ) ), ConsesLow.listS( $sym89$CPUSHNEW, module, $list90 ), ConsesLow.append(
          method_forms, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 16178L)
  public static SubLObject tt_module(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject module = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    plist = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject method_forms = NIL;
      if( plist.isCons() )
      {
        final SubLObject tt_pred = conses_high.getf( plist, $kw73$PREDICATE, UNPROVIDED );
        final SubLObject gt_pred = conses_high.getf( plist, $kw105$CONDUIT_PRED, UNPROVIDED );
        final SubLObject ttmt = conses_high.getf( plist, $kw76$MT, UNPROVIDED );
        final SubLObject mode = $kw73$PREDICATE;
        final SubLObject tt_index_arg = TWO_INTEGER;
        final SubLObject tt_gather_arg = ONE_INTEGER;
        final SubLObject gt_index_arg = ONE_INTEGER;
        final SubLObject gt_gather_arg = TWO_INTEGER;
        SubLObject parameters = NIL;
        SubLObject parameter = NIL;
        parameters = plist;
        parameter = parameters.first();
        while ( NIL != parameters)
        {
          if( NIL != subl_promotions.memberP( parameter, $tt_methods$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject function = Packages.intern( string_utilities.str( conses_high.second( parameters ) ), UNPROVIDED );
            final SubLObject arg_list = transitivity.add_mt_default( ttmt, conses_high.third( conses_high.assoc( parameter, $tt_dispatch_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) );
            final SubLObject args = list_utilities.args_from_arg_list( arg_list );
            final SubLObject method = parameter;
            final SubLObject pcase_var = mode;
            if( pcase_var.eql( $kw73$PREDICATE ) )
            {
              method_forms = ConsesLow.cons( ConsesLow.list( $sym77$DEFINE, function, arg_list, ConsesLow.listS( $sym78$CLET, $list79, ConsesLow.list( $sym78$CLET, ConsesLow.list( ConsesLow.list( $sym97$_TT_PRED_,
                  tt_pred ), ConsesLow.list( $sym7$_GT_PRED_, gt_pred ), $list80, ConsesLow.list( $sym100$_TT_INDEX_ARG_, tt_index_arg ), ConsesLow.list( $sym101$_TT_GATHER_ARG_, tt_gather_arg ), ConsesLow.list(
                      $sym10$_GT_INDEX_ARG_, gt_index_arg ), ConsesLow.list( $sym11$_GT_GATHER_ARG_, gt_gather_arg ), ConsesLow.list( $sym104$_TT_TRANSITIVE_CONDUIT__, ConsesLow.list( $sym106$TRANSITIVE_PREDICATE_,
                          gt_pred ) ) ), ConsesLow.list( $sym82$CSETQ, $sym83$RESULT, ConsesLow.listS( $sym107$GENERIC_TTM, method, ConsesLow.append( args, NIL ) ) ) ), $list84 ) ), method_forms );
            }
          }
          parameters = conses_high.cddr( parameters );
          parameter = parameters.first();
        }
      }
      return ConsesLow.listS( $sym87$PROGN, ConsesLow.list( $sym108$SETUP_TRANSFERS_THROUGH_MODULE, module, ConsesLow.list( $sym85$QUOTE, plist ) ), ConsesLow.listS( $sym89$CPUSHNEW, module, $list109 ), ConsesLow.append(
          method_forms, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 17867L)
  public static SubLObject itt_module(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject module = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    plist = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject method_forms = NIL;
      if( plist.isCons() )
      {
        final SubLObject tt_pred = conses_high.getf( plist, $kw73$PREDICATE, UNPROVIDED );
        final SubLObject gt_pred = conses_high.getf( plist, $kw105$CONDUIT_PRED, UNPROVIDED );
        final SubLObject ttmt = conses_high.getf( plist, $kw76$MT, UNPROVIDED );
        final SubLObject mode = $kw73$PREDICATE;
        final SubLObject tt_index_arg = ONE_INTEGER;
        final SubLObject tt_gather_arg = TWO_INTEGER;
        final SubLObject gt_index_arg = ONE_INTEGER;
        final SubLObject gt_gather_arg = TWO_INTEGER;
        SubLObject parameters = NIL;
        SubLObject parameter = NIL;
        parameters = plist;
        parameter = parameters.first();
        while ( NIL != parameters)
        {
          if( NIL != subl_promotions.memberP( parameter, $tt_methods$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject function = Packages.intern( string_utilities.str( conses_high.second( parameters ) ), UNPROVIDED );
            final SubLObject arg_list = transitivity.add_mt_default( ttmt, conses_high.third( conses_high.assoc( parameter, $tt_dispatch_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) );
            final SubLObject args = list_utilities.args_from_arg_list( arg_list );
            final SubLObject method = parameter;
            final SubLObject pcase_var = mode;
            if( pcase_var.eql( $kw73$PREDICATE ) )
            {
              method_forms = ConsesLow.cons( ConsesLow.list( $sym77$DEFINE, function, arg_list, ConsesLow.listS( $sym78$CLET, $list79, ConsesLow.list( $sym78$CLET, ConsesLow.list( ConsesLow.list( $sym97$_TT_PRED_,
                  tt_pred ), ConsesLow.list( $sym7$_GT_PRED_, gt_pred ), $list80, ConsesLow.list( $sym100$_TT_INDEX_ARG_, tt_index_arg ), ConsesLow.list( $sym101$_TT_GATHER_ARG_, tt_gather_arg ), ConsesLow.list(
                      $sym10$_GT_INDEX_ARG_, gt_index_arg ), ConsesLow.list( $sym11$_GT_GATHER_ARG_, gt_gather_arg ), ConsesLow.list( $sym104$_TT_TRANSITIVE_CONDUIT__, ConsesLow.list( $sym106$TRANSITIVE_PREDICATE_,
                          gt_pred ) ) ), ConsesLow.list( $sym82$CSETQ, $sym83$RESULT, ConsesLow.listS( $sym107$GENERIC_TTM, method, ConsesLow.append( args, NIL ) ) ) ), $list84 ) ), method_forms );
            }
          }
          parameters = conses_high.cddr( parameters );
          parameter = parameters.first();
        }
      }
      return ConsesLow.listS( $sym87$PROGN, ConsesLow.list( $sym108$SETUP_TRANSFERS_THROUGH_MODULE, module, ConsesLow.list( $sym85$QUOTE, plist ) ), ConsesLow.listS( $sym89$CPUSHNEW, module, $list109 ), ConsesLow.append(
          method_forms, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 19386L)
  public static SubLObject tti_module(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject module = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    plist = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject method_forms = NIL;
      if( plist.isCons() )
      {
        final SubLObject tt_pred = conses_high.getf( plist, $kw73$PREDICATE, UNPROVIDED );
        final SubLObject gt_pred = conses_high.getf( plist, $kw105$CONDUIT_PRED, UNPROVIDED );
        final SubLObject ttmt = conses_high.getf( plist, $kw76$MT, UNPROVIDED );
        final SubLObject mode = $kw73$PREDICATE;
        final SubLObject tt_index_arg = TWO_INTEGER;
        final SubLObject tt_gather_arg = ONE_INTEGER;
        final SubLObject gt_index_arg = TWO_INTEGER;
        final SubLObject gt_gather_arg = ONE_INTEGER;
        SubLObject parameters = NIL;
        SubLObject parameter = NIL;
        parameters = plist;
        parameter = parameters.first();
        while ( NIL != parameters)
        {
          if( NIL != subl_promotions.memberP( parameter, $tt_methods$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject function = Packages.intern( string_utilities.str( conses_high.second( parameters ) ), UNPROVIDED );
            final SubLObject arg_list = transitivity.add_mt_default( ttmt, conses_high.third( conses_high.assoc( parameter, $tt_dispatch_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) );
            final SubLObject args = list_utilities.args_from_arg_list( arg_list );
            final SubLObject method = parameter;
            final SubLObject pcase_var = mode;
            if( pcase_var.eql( $kw73$PREDICATE ) )
            {
              method_forms = ConsesLow.cons( ConsesLow.list( $sym77$DEFINE, function, arg_list, ConsesLow.listS( $sym78$CLET, $list79, ConsesLow.list( $sym78$CLET, ConsesLow.list( ConsesLow.list( $sym97$_TT_PRED_,
                  tt_pred ), ConsesLow.list( $sym7$_GT_PRED_, gt_pred ), $list80, ConsesLow.list( $sym100$_TT_INDEX_ARG_, tt_index_arg ), ConsesLow.list( $sym101$_TT_GATHER_ARG_, tt_gather_arg ), ConsesLow.list(
                      $sym10$_GT_INDEX_ARG_, gt_index_arg ), ConsesLow.list( $sym11$_GT_GATHER_ARG_, gt_gather_arg ), ConsesLow.list( $sym104$_TT_TRANSITIVE_CONDUIT__, ConsesLow.list( $sym106$TRANSITIVE_PREDICATE_,
                          gt_pred ) ) ), ConsesLow.list( $sym82$CSETQ, $sym83$RESULT, ConsesLow.listS( $sym107$GENERIC_TTM, method, ConsesLow.append( args, NIL ) ) ) ), $list84 ) ), method_forms );
            }
          }
          parameters = conses_high.cddr( parameters );
          parameter = parameters.first();
        }
      }
      return ConsesLow.listS( $sym87$PROGN, ConsesLow.list( $sym108$SETUP_TRANSFERS_THROUGH_MODULE, module, ConsesLow.list( $sym85$QUOTE, plist ) ), ConsesLow.listS( $sym89$CPUSHNEW, module, $list109 ), ConsesLow.append(
          method_forms, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 21020L)
  public static SubLObject itti_module(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject module = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    module = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    plist = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject method_forms = NIL;
      if( plist.isCons() )
      {
        final SubLObject tt_pred = conses_high.getf( plist, $kw73$PREDICATE, UNPROVIDED );
        final SubLObject gt_pred = conses_high.getf( plist, $kw105$CONDUIT_PRED, UNPROVIDED );
        final SubLObject ttmt = conses_high.getf( plist, $kw76$MT, UNPROVIDED );
        final SubLObject mode = $kw73$PREDICATE;
        final SubLObject tt_index_arg = ONE_INTEGER;
        final SubLObject tt_gather_arg = TWO_INTEGER;
        final SubLObject gt_index_arg = TWO_INTEGER;
        final SubLObject gt_gather_arg = ONE_INTEGER;
        SubLObject parameters = NIL;
        SubLObject parameter = NIL;
        parameters = plist;
        parameter = parameters.first();
        while ( NIL != parameters)
        {
          if( NIL != subl_promotions.memberP( parameter, $tt_methods$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
          {
            final SubLObject function = Packages.intern( string_utilities.str( conses_high.second( parameters ) ), UNPROVIDED );
            final SubLObject arg_list = transitivity.add_mt_default( ttmt, conses_high.third( conses_high.assoc( parameter, $tt_dispatch_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) );
            final SubLObject args = list_utilities.args_from_arg_list( arg_list );
            final SubLObject method = parameter;
            final SubLObject pcase_var = mode;
            if( pcase_var.eql( $kw73$PREDICATE ) )
            {
              method_forms = ConsesLow.cons( ConsesLow.list( $sym77$DEFINE, function, arg_list, ConsesLow.listS( $sym78$CLET, $list79, ConsesLow.list( $sym78$CLET, ConsesLow.list( ConsesLow.list( $sym97$_TT_PRED_,
                  tt_pred ), ConsesLow.list( $sym7$_GT_PRED_, gt_pred ), $list80, ConsesLow.list( $sym100$_TT_INDEX_ARG_, tt_index_arg ), ConsesLow.list( $sym101$_TT_GATHER_ARG_, tt_gather_arg ), ConsesLow.list(
                      $sym10$_GT_INDEX_ARG_, gt_index_arg ), ConsesLow.list( $sym11$_GT_GATHER_ARG_, gt_gather_arg ), ConsesLow.list( $sym104$_TT_TRANSITIVE_CONDUIT__, ConsesLow.list( $sym106$TRANSITIVE_PREDICATE_,
                          gt_pred ) ) ), ConsesLow.list( $sym82$CSETQ, $sym83$RESULT, ConsesLow.listS( $sym107$GENERIC_TTM, method, ConsesLow.append( args, NIL ) ) ) ), $list84 ) ), method_forms );
            }
          }
          parameters = conses_high.cddr( parameters );
          parameter = parameters.first();
        }
      }
      return ConsesLow.listS( $sym87$PROGN, ConsesLow.list( $sym108$SETUP_TRANSFERS_THROUGH_MODULE, module, ConsesLow.list( $sym85$QUOTE, plist ) ), ConsesLow.listS( $sym89$CPUSHNEW, module, $list109 ), ConsesLow.append(
          method_forms, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 22892L)
  public static SubLObject gt_within_transitive_via_argP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $gt_within_transitive_via_argP$.getDynamicValue( thread );
  }

  public static SubLObject declare_gt_vars_file()
  {
    SubLFiles.declareFunction( me, "gt_link_support", "GT-LINK-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "gt_link_mt", "GT-LINK-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "gt_link_pred", "GT-LINK-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "gt_use_sksiP", "GT-USE-SKSI?", 0, 0, false );
    SubLFiles.declareMacro( me, "transitivity_module", "TRANSITIVITY-MODULE" );
    SubLFiles.declareMacro( me, "tt_module", "TT-MODULE" );
    SubLFiles.declareMacro( me, "itt_module", "ITT-MODULE" );
    SubLFiles.declareMacro( me, "tti_module", "TTI-MODULE" );
    SubLFiles.declareMacro( me, "itti_module", "ITTI-MODULE" );
    SubLFiles.declareFunction( me, "gt_within_transitive_via_argP", "GT-WITHIN-TRANSITIVE-VIA-ARG?", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_gt_vars_file()
  {
    $gt_dispatch_table$ = SubLFiles.deflexical( "*GT-DISPATCH-TABLE*", $list0 );
    $gt_methods$ = SubLFiles.defparameter( "*GT-METHODS*", Mapping.mapcar( Symbols.symbol_function( $sym2$CAR ), $gt_dispatch_table$.getGlobalValue() ) );
    $gt_parameters$ = SubLFiles.defparameter( "*GT-PARAMETERS*", ConsesLow.append( $list4, $gt_methods$.getDynamicValue() ) );
    $transitivity_modules$ = SubLFiles.defparameter( "*TRANSITIVITY-MODULES*", NIL );
    $gt_pred$ = SubLFiles.defparameter( "*GT-PRED*", NIL );
    $gt_index$ = SubLFiles.defparameter( "*GT-INDEX*", NIL );
    $gt_gather$ = SubLFiles.defparameter( "*GT-GATHER*", NIL );
    $gt_index_arg$ = SubLFiles.defparameter( "*GT-INDEX-ARG*", ONE_INTEGER );
    $gt_gather_arg$ = SubLFiles.defparameter( "*GT-GATHER-ARG*", TWO_INTEGER );
    $gt_accessors$ = SubLFiles.defparameter( "*GT-ACCESSORS*", NIL );
    $gt_link_type$ = SubLFiles.defparameter( "*GT-LINK-TYPE*", $kw13$ASSERTION );
    $gt_mode$ = SubLFiles.defparameter( "*GT-MODE*", $kw15$SUPERIOR );
    $gt_modes$ = SubLFiles.defparameter( "*GT-MODES*", $list17 );
    $gt_truth$ = SubLFiles.defparameter( "*GT-TRUTH*", $kw19$TRUE );
    $gt_query$ = SubLFiles.defparameter( "*GT-QUERY*", NIL );
    $gt_doneP$ = SubLFiles.defparameter( "*GT-DONE?*", NIL );
    $gt_searchedP$ = SubLFiles.defparameter( "*GT-SEARCHED?*", NIL );
    $gt_target$ = SubLFiles.defparameter( "*GT-TARGET*", NIL );
    $gt_result$ = SubLFiles.defparameter( "*GT-RESULT*", NIL );
    $gt_searcher$ = SubLFiles.defparameter( "*GT-SEARCHER*", NIL );
    $gt_base_fn$ = SubLFiles.defparameter( "*GT-BASE-FN*", NIL );
    $gt_step_fn$ = SubLFiles.defparameter( "*GT-STEP-FN*", NIL );
    $gt_compose_fn$ = SubLFiles.defparameter( "*GT-COMPOSE-FN*", NIL );
    $gt_gather_fn$ = SubLFiles.defparameter( "*GT-GATHER-FN*", NIL );
    $gt_combine_fn$ = SubLFiles.defparameter( "*GT-COMBINE-FN*", Symbols.symbol_function( $sym31$NCONC ) );
    $gt_compare_fn$ = SubLFiles.defparameter( "*GT-COMPARE-FN*", NIL );
    $gt_equality_fn$ = SubLFiles.defparameter( "*GT-EQUALITY-FN*", Symbols.symbol_function( EQUAL ) );
    $gt_compose_pred$ = SubLFiles.defparameter( "*GT-COMPOSE-PRED*", NIL );
    $gt_compose_index_arg$ = SubLFiles.defparameter( "*GT-COMPOSE-INDEX-ARG*", ONE_INTEGER );
    $gt_compose_gather_arg$ = SubLFiles.defparameter( "*GT-COMPOSE-GATHER-ARG*", TWO_INTEGER );
    $gt_max_nodes_direction$ = SubLFiles.defparameter( "*GT-MAX-NODES-DIRECTION*", $kw38$DOWN );
    $gt_use_spec_predsP$ = SubLFiles.defparameter( "*GT-USE-SPEC-PREDS?*", T );
    $gt_handle_non_transitive_predicateP$ = SubLFiles.defparameter( "*GT-HANDLE-NON-TRANSITIVE-PREDICATE?*", NIL );
    $gt_link_support$ = SubLFiles.defparameter( "*GT-LINK-SUPPORT*", NIL );
    $gt_what_mts_result$ = SubLFiles.defparameter( "*GT-WHAT-MTS-RESULT*", NIL );
    $gt_what_mts_goal_node$ = SubLFiles.defparameter( "*GT-WHAT-MTS-GOAL-NODE*", NIL );
    $gt_path_list_of_mts$ = SubLFiles.defparameter( "*GT-PATH-LIST-OF-MTS*", NIL );
    $gt_path_list_of_nodes$ = SubLFiles.defparameter( "*GT-PATH-LIST-OF-NODES*", NIL );
    $gt_path_length$ = SubLFiles.defparameter( "*GT-PATH-LENGTH*", ZERO_INTEGER );
    $gt_list_of_path_lengths$ = SubLFiles.defparameter( "*GT-LIST-OF-PATH-LENGTHS*", NIL );
    $gt_marking_table$ = SubLFiles.defparameter( "*GT-MARKING-TABLE*", NIL );
    $gt_target_marking_table$ = SubLFiles.defparameter( "*GT-TARGET-MARKING-TABLE*", NIL );
    $gt_depth_cutoff$ = SubLFiles.defparameter( "*GT-DEPTH-CUTOFF*", ONE_INTEGER );
    $gt_depth_cutoffP$ = SubLFiles.defparameter( "*GT-DEPTH-CUTOFF?*", NIL );
    $gt_prev_depth_cutoff$ = SubLFiles.defparameter( "*GT-PREV-DEPTH-CUTOFF*", ONE_INTEGER );
    $gt_time_cutoffP$ = SubLFiles.defparameter( "*GT-TIME-CUTOFF?*", NIL );
    $gt_time_cutoff$ = SubLFiles.defparameter( "*GT-TIME-CUTOFF*", TEN_INTEGER );
    $gt_initial_time$ = SubLFiles.defparameter( "*GT-INITIAL-TIME*", ZERO_INTEGER );
    $gt_answers_cutoffP$ = SubLFiles.defparameter( "*GT-ANSWERS-CUTOFF?*", NIL );
    $gt_answers_cutoff$ = SubLFiles.defparameter( "*GT-ANSWERS-CUTOFF*", ONE_INTEGER );
    $gt_answers_so_far$ = SubLFiles.defparameter( "*GT-ANSWERS-SO-FAR*", ZERO_INTEGER );
    $gt_goal_node$ = SubLFiles.defparameter( "*GT-GOAL-NODE*", NIL );
    $gt_edge_list$ = SubLFiles.defparameter( "*GT-EDGE-LIST*", NIL );
    $gt_edge_list_returnP$ = SubLFiles.defparameter( "*GT-EDGE-LIST-RETURN?*", NIL );
    $gt_path_list_of_assertions$ = SubLFiles.defparameter( "*GT-PATH-LIST-OF-ASSERTIONS*", NIL );
    $gt_cyclical_edges$ = SubLFiles.defparameter( "*GT-CYCLICAL-EDGES*", NIL );
    $gt_trace_level$ = SubLFiles.defparameter( "*GT-TRACE-LEVEL*", ONE_INTEGER );
    $gt_test_level$ = SubLFiles.defparameter( "*GT-TEST-LEVEL*", THREE_INTEGER );
    $suspend_gt_type_checkingP$ = SubLFiles.defparameter( "*SUSPEND-GT-TYPE-CHECKING?*", NIL );
    $gt_warnings$ = SubLFiles.defparameter( "*GT-WARNINGS*", NIL );
    $gt_use_sksiP$ = SubLFiles.defparameter( "*GT-USE-SKSI?*", T );
    $tt_dispatch_table$ = SubLFiles.defparameter( "*TT-DISPATCH-TABLE*", $list91 );
    $tt_methods$ = SubLFiles.defparameter( "*TT-METHODS*", Mapping.mapcar( Symbols.symbol_function( $sym2$CAR ), $tt_dispatch_table$.getDynamicValue() ) );
    $transfers_through_modules$ = SubLFiles.defparameter( "*TRANSFERS-THROUGH-MODULES*", NIL );
    $tt_parameters$ = SubLFiles.defparameter( "*TT-PARAMETERS*", ConsesLow.append( $list95, $tt_methods$.getDynamicValue() ) );
    $tt_pred$ = SubLFiles.defparameter( "*TT-PRED*", NIL );
    $tt_index$ = SubLFiles.defparameter( "*TT-INDEX*", NIL );
    $tt_gather$ = SubLFiles.defparameter( "*TT-GATHER*", NIL );
    $tt_index_arg$ = SubLFiles.defparameter( "*TT-INDEX-ARG*", ONE_INTEGER );
    $tt_gather_arg$ = SubLFiles.defparameter( "*TT-GATHER-ARG*", TWO_INTEGER );
    $tt_truth$ = SubLFiles.defparameter( "*TT-TRUTH*", $kw19$TRUE );
    $tt_step_fn$ = SubLFiles.defparameter( "*TT-STEP-FN*", NIL );
    $tt_transitive_conduitP$ = SubLFiles.defparameter( "*TT-TRANSITIVE-CONDUIT?*", NIL );
    $gt_transitive_via_arg_activeP$ = SubLFiles.defparameter( "*GT-TRANSITIVE-VIA-ARG-ACTIVE?*", T );
    $gt_within_transitive_via_argP$ = SubLFiles.defparameter( "*GT-WITHIN-TRANSITIVE-VIA-ARG?*", NIL );
    return NIL;
  }

  public static SubLObject setup_gt_vars_file()
  {
    SubLObject item_var = $sym1$_GT_DISPATCH_TABLE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym3$_GT_METHODS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym5$_GT_PARAMETERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym6$_TRANSITIVITY_MODULES_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym7$_GT_PRED_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym8$_GT_INDEX_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym9$_GT_GATHER_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym10$_GT_INDEX_ARG_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym11$_GT_GATHER_ARG_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym12$_GT_ACCESSORS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym14$_GT_LINK_TYPE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym16$_GT_MODE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym18$_GT_MODES_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym20$_GT_TRUTH_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym21$_GT_QUERY_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym22$_GT_DONE__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym23$_GT_SEARCHED__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym24$_GT_TARGET_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym25$_GT_RESULT_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym26$_GT_SEARCHER_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym27$_GT_BASE_FN_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym28$_GT_STEP_FN_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym29$_GT_COMPOSE_FN_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym30$_GT_GATHER_FN_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym32$_GT_COMBINE_FN_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym33$_GT_COMPARE_FN_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym34$_GT_EQUALITY_FN_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym35$_GT_COMPOSE_PRED_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym36$_GT_COMPOSE_INDEX_ARG_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym37$_GT_COMPOSE_GATHER_ARG_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym39$_GT_MAX_NODES_DIRECTION_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym40$_GT_USE_SPEC_PREDS__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym41$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym44$_GT_WHAT_MTS_RESULT_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym45$_GT_WHAT_MTS_GOAL_NODE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym46$_GT_PATH_LIST_OF_MTS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym47$_GT_PATH_LIST_OF_NODES_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym48$_GT_PATH_LENGTH_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym49$_GT_LIST_OF_PATH_LENGTHS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym50$_GT_MARKING_TABLE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym51$_GT_TARGET_MARKING_TABLE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym52$_GT_DEPTH_CUTOFF_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym53$_GT_DEPTH_CUTOFF__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym54$_GT_PREV_DEPTH_CUTOFF_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym55$_GT_TIME_CUTOFF__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym56$_GT_TIME_CUTOFF_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym57$_GT_INITIAL_TIME_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym58$_GT_ANSWERS_CUTOFF__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym59$_GT_ANSWERS_CUTOFF_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym60$_GT_ANSWERS_SO_FAR_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym61$_GT_GOAL_NODE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym62$_GT_EDGE_LIST_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym63$_GT_EDGE_LIST_RETURN__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym64$_GT_PATH_LIST_OF_ASSERTIONS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym65$_GT_CYCLICAL_EDGES_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym66$_GT_TRACE_LEVEL_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym67$_GT_TEST_LEVEL_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym68$_SUSPEND_GT_TYPE_CHECKING__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym69$_GT_WARNINGS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym70$_GT_USE_SKSI__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym92$_TT_DISPATCH_TABLE_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym93$_TT_METHODS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym94$_TRANSFERS_THROUGH_MODULES_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym96$_TT_PARAMETERS_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym97$_TT_PRED_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym98$_TT_INDEX_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym99$_TT_GATHER_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym100$_TT_INDEX_ARG_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym101$_TT_GATHER_ARG_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym102$_TT_TRUTH_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym103$_TT_STEP_FN_;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym104$_TT_TRANSITIVE_CONDUIT__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym110$_GT_TRANSITIVE_VIA_ARG_ACTIVE__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    item_var = $sym111$_GT_WITHIN_TRANSITIVE_VIA_ARG__;
    if( NIL == conses_high.member( item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      utilities_macros.$gt_state_variables$.setGlobalValue( ConsesLow.cons( item_var, utilities_macros.$gt_state_variables$.getGlobalValue() ) );
    }
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_gt_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_gt_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_gt_vars_file();
  }
  static
  {
    me = new gt_vars();
    $gt_dispatch_table$ = null;
    $gt_methods$ = null;
    $gt_parameters$ = null;
    $transitivity_modules$ = null;
    $gt_pred$ = null;
    $gt_index$ = null;
    $gt_gather$ = null;
    $gt_index_arg$ = null;
    $gt_gather_arg$ = null;
    $gt_accessors$ = null;
    $gt_link_type$ = null;
    $gt_mode$ = null;
    $gt_modes$ = null;
    $gt_truth$ = null;
    $gt_query$ = null;
    $gt_doneP$ = null;
    $gt_searchedP$ = null;
    $gt_target$ = null;
    $gt_result$ = null;
    $gt_searcher$ = null;
    $gt_base_fn$ = null;
    $gt_step_fn$ = null;
    $gt_compose_fn$ = null;
    $gt_gather_fn$ = null;
    $gt_combine_fn$ = null;
    $gt_compare_fn$ = null;
    $gt_equality_fn$ = null;
    $gt_compose_pred$ = null;
    $gt_compose_index_arg$ = null;
    $gt_compose_gather_arg$ = null;
    $gt_max_nodes_direction$ = null;
    $gt_use_spec_predsP$ = null;
    $gt_handle_non_transitive_predicateP$ = null;
    $gt_link_support$ = null;
    $gt_what_mts_result$ = null;
    $gt_what_mts_goal_node$ = null;
    $gt_path_list_of_mts$ = null;
    $gt_path_list_of_nodes$ = null;
    $gt_path_length$ = null;
    $gt_list_of_path_lengths$ = null;
    $gt_marking_table$ = null;
    $gt_target_marking_table$ = null;
    $gt_depth_cutoff$ = null;
    $gt_depth_cutoffP$ = null;
    $gt_prev_depth_cutoff$ = null;
    $gt_time_cutoffP$ = null;
    $gt_time_cutoff$ = null;
    $gt_initial_time$ = null;
    $gt_answers_cutoffP$ = null;
    $gt_answers_cutoff$ = null;
    $gt_answers_so_far$ = null;
    $gt_goal_node$ = null;
    $gt_edge_list$ = null;
    $gt_edge_list_returnP$ = null;
    $gt_path_list_of_assertions$ = null;
    $gt_cyclical_edges$ = null;
    $gt_trace_level$ = null;
    $gt_test_level$ = null;
    $suspend_gt_type_checkingP$ = null;
    $gt_warnings$ = null;
    $gt_use_sksiP$ = null;
    $tt_dispatch_table$ = null;
    $tt_methods$ = null;
    $transfers_through_modules$ = null;
    $tt_parameters$ = null;
    $tt_pred$ = null;
    $tt_index$ = null;
    $tt_gather$ = null;
    $tt_index_arg$ = null;
    $tt_gather_arg$ = null;
    $tt_truth$ = null;
    $tt_step_fn$ = null;
    $tt_transitive_conduitP$ = null;
    $gt_transitive_via_arg_activeP$ = null;
    $gt_within_transitive_via_argP$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "SUPERIORS" ), makeSymbol( "GTM-SUPERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ),
      ConsesLow.list( makeKeyword( "INFERIORS" ), makeSymbol( "GTM-INFERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "MIN-SUPERIORS" ),
          makeSymbol( "GTM-MIN-SUPERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "MAX-INFERIORS" ), makeSymbol( "GTM-MAX-INFERIORS" ),
              ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "CO-INFERIORS" ), makeSymbol( "GTM-CO-INFERIORS" ), ConsesLow.list( makeSymbol(
                  "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "CO-SUPERIORS" ), makeSymbol( "GTM-CO-SUPERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol(
                      "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "REDUNDANT-SUPERIORS" ), makeSymbol( "GTM-REDUNDANT-SUPERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ),
                          makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "REDUNDANT-INFERIORS" ), makeSymbol( "GTM-REDUNDANT-INFERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ),
                              makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "ALL-SUPERIORS" ), makeSymbol( "GTM-ALL-SUPERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol(
                                  "MT" ) ) ), ConsesLow.list( makeKeyword( "ALL-INFERIORS" ), makeSymbol( "GTM-ALL-INFERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ),
      ConsesLow.list( makeKeyword( "ALL-ACCESSIBLE" ), makeSymbol( "GTM-ALL-ACCESSIBLE" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword(
          "UNION-ALL-INFERIORS" ), makeSymbol( "GTM-UNION-ALL-INFERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "COMPOSE-FN-SUPERIORS" ),
              makeSymbol( "GTM-COMPOSE-FN-ALL-SUPERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "FN" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "COMBINE-FN" ), ConsesLow.list( makeSymbol(
                  "QUOTE" ), makeSymbol( "NCONC" ) ) ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "COMPOSE-FN-INFERIORS" ), makeSymbol( "GTM-COMPOSE-FN-ALL-INFERIORS" ), ConsesLow.list( makeSymbol( "FORT" ),
                      makeSymbol( "FN" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "COMBINE-FN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NCONC" ) ) ), makeSymbol( "MT" ) ) ), ConsesLow.list(
                          makeKeyword( "ALL-DEPENDENT-INFERIORS" ), makeSymbol( "GTM-ALL-DEPENDENT-INFERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list(
                              makeKeyword( "COMPOSE-PRED-SUPERIORS" ), makeSymbol( "GTM-COMPOSE-PRED-ALL-SUPERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), ConsesLow
                                  .list( makeSymbol( "INDEX" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "GATHER" ), TWO_INTEGER ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "COMPOSE-PRED-INFERIORS" ),
                                      makeSymbol( "GTM-COMPOSE-PRED-ALL-INFERIORS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX" ),
                                          ONE_INTEGER ), ConsesLow.list( makeSymbol( "GATHER" ), TWO_INTEGER ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "ROOTS" ), makeSymbol( "GTM-ROOTS" ), ConsesLow.list(
                                              makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "LEAVES" ), makeSymbol( "GTM-LEAVES" ), ConsesLow.list( makeSymbol(
                                                  "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "BOOLEAN?" ), makeSymbol( "GTM-BOOLEAN?" ), ConsesLow.list( makeSymbol(
                                                      "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "SUPERIOR?" ), makeSymbol( "GTM-SUPERIOR?" ),
                                                          ConsesLow.list( makeSymbol( "SUPERIOR" ), makeSymbol( "INFERIOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "INFERIOR?" ),
                                                              makeSymbol( "GTM-INFERIOR?" ), ConsesLow.list( makeSymbol( "INFERIOR" ), makeSymbol( "SUPERIOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ),
      ConsesLow.list( makeKeyword( "HAS-SUPERIOR?" ), makeSymbol( "GTM-HAS-SUPERIOR?" ), ConsesLow.list( makeSymbol( "INFERIOR" ), makeSymbol( "SUPERIOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow
          .list( makeKeyword( "HAS-INFERIOR?" ), makeSymbol( "GTM-HAS-INFERIOR?" ), ConsesLow.list( makeSymbol( "SUPERIOR" ), makeSymbol( "INFERIOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list(
              makeKeyword( "GATHER-SUPERIOR" ), makeSymbol( "GTM-GATHER-SUPERIOR" ), ConsesLow.list( makeSymbol( "SPEC" ), makeSymbol( "GATHER-FN" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list(
                  makeKeyword( "GATHER-INFERIOR" ), makeSymbol( "GTM-GATHER-INFERIOR" ), ConsesLow.list( makeSymbol( "GENL" ), makeSymbol( "GATHER-FN" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list(
                      makeKeyword( "CYCLES?" ), makeSymbol( "GTM-CYCLES?" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "COMPLETES-CYCLE?" ),
                          makeSymbol( "GTM-COMPLETES-CYCLE?" ), ConsesLow.list( makeSymbol( "FORT-1" ), makeSymbol( "FORT-2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword(
                              "MIN-NODES" ), makeSymbol( "GTM-MIN-NODES" ), ConsesLow.list( makeSymbol( "FORTS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "MAX-NODES" ),
                                  makeSymbol( "GTM-MAX-NODES" ), ConsesLow.list( makeSymbol( "FORTS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "MIN-CEILINGS" ), makeSymbol(
                                      "GTM-MIN-CEILINGS" ), ConsesLow.list( makeSymbol( "FORTS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CANDIDATES" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword(
                                          "MAX-FLOORS" ), makeSymbol( "GTM-MAX-FLOORS" ), ConsesLow.list( makeSymbol( "FORTS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CANDIDATES" ), makeSymbol( "MT" ) ) ), ConsesLow
                                              .list( makeKeyword( "MIN-SUPERIORS-EXCLUDING" ), makeSymbol( "GTM-MIN-SUPERIORS-EXCLUDING" ), ConsesLow.list( makeSymbol( "INFERIOR" ), makeSymbol( "SUPERIOR" ), makeSymbol(
                                                  "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "MAX-INFERIORS-EXCLUDING" ), makeSymbol( "GTM-MAX-INFERIORS-EXCLUDING" ), ConsesLow.list( makeSymbol(
                                                      "SUPERIOR" ), makeSymbol( "INFERIOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "ANY-SUPERIOR-PATH" ), makeSymbol(
                                                          "GTM-ANY-SUPERIOR-PATH" ), ConsesLow.list( makeSymbol( "INFERIOR" ), makeSymbol( "SUPERIOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list(
                                                              makeKeyword( "WHY-SUPERIOR?" ), makeSymbol( "GTM-WHY-SUPERIOR?" ), ConsesLow.list( makeSymbol( "SUPERIOR" ), makeSymbol( "INFERIOR" ), makeSymbol(
                                                                  "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "WHY-COMPLETES-CYCLE?" ), makeSymbol( "GTM-WHY-COMPLETES-CYCLE?" ), ConsesLow.list(
                                                                      makeSymbol( "FORT1" ), makeSymbol( "FORT2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "ALL-SUPERIOR-EDGES" ),
                                                                          makeSymbol( "GTM-ALL-SUPERIOR-EDGES" ), ConsesLow.list( makeSymbol( "INFERIOR" ), makeSymbol( "SUPERIOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol(
                                                                              "MT" ) ) ), ConsesLow.list( makeKeyword( "ALL-INFERIOR-EDGES" ), makeSymbol( "GTM-ALL-INFERIOR-EDGES" ), ConsesLow.list( makeSymbol(
                                                                                  "INFERIOR" ), makeSymbol( "SUPERIOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "ALL-PATHS" ),
                                                                                      makeSymbol( "GTM-ALL-PATHS" ), ConsesLow.list( makeSymbol( "INFERIOR" ), makeSymbol( "SUPERIOR" ), makeSymbol( "&OPTIONAL" ),
                                                                                          makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "INFERIORS-WITH-MTS" ), makeSymbol( "GTM-ALL-INFERIORS-WITH-MTS" ), ConsesLow
                                                                                              .list( makeSymbol( "SUPERIOR" ) ) ), ConsesLow.list( makeKeyword( "SUPERIOR-IN-WHAT-MTS" ), makeSymbol( "GTM-IN-WHAT-MTS" ),
                                                                                                  ConsesLow.list( makeSymbol( "INFERIOR" ), makeSymbol( "SUPERIOR" ), makeSymbol( "KEY-METHOD" ) ) ), ConsesLow.list(
                                                                                                      makeKeyword( "INFERIOR-IN-WHAT-MTS" ), makeSymbol( "GTM-IN-WHAT-MTS" ), ConsesLow.list( makeSymbol( "SUPERIOR" ),
                                                                                                          makeSymbol( "INFERIOR" ), makeSymbol( "KEY-METHOD" ) ) ), ConsesLow.list( makeKeyword( "ACCESSIBLE-IN-WHAT-MTS" ),
                                                                                                              makeSymbol( "GTM-ACCESSIBLE-IN-WHAT-MTS" ), ConsesLow.list( makeSymbol( "INFERIOR" ), makeSymbol(
                                                                                                                  "SUPERIOR" ), makeSymbol( "KEY-METHOD" ) ) )
    } );
    $sym1$_GT_DISPATCH_TABLE_ = makeSymbol( "*GT-DISPATCH-TABLE*" );
    $sym2$CAR = makeSymbol( "CAR" );
    $sym3$_GT_METHODS_ = makeSymbol( "*GT-METHODS*" );
    $list4 = ConsesLow.list( makeKeyword( "PREDICATE" ), makeKeyword( "INDEX-ARG" ), makeKeyword( "GATHER-ARG" ), makeKeyword( "ACCESSORS" ), makeKeyword( "MT" ) );
    $sym5$_GT_PARAMETERS_ = makeSymbol( "*GT-PARAMETERS*" );
    $sym6$_TRANSITIVITY_MODULES_ = makeSymbol( "*TRANSITIVITY-MODULES*" );
    $sym7$_GT_PRED_ = makeSymbol( "*GT-PRED*" );
    $sym8$_GT_INDEX_ = makeSymbol( "*GT-INDEX*" );
    $sym9$_GT_GATHER_ = makeSymbol( "*GT-GATHER*" );
    $sym10$_GT_INDEX_ARG_ = makeSymbol( "*GT-INDEX-ARG*" );
    $sym11$_GT_GATHER_ARG_ = makeSymbol( "*GT-GATHER-ARG*" );
    $sym12$_GT_ACCESSORS_ = makeSymbol( "*GT-ACCESSORS*" );
    $kw13$ASSERTION = makeKeyword( "ASSERTION" );
    $sym14$_GT_LINK_TYPE_ = makeSymbol( "*GT-LINK-TYPE*" );
    $kw15$SUPERIOR = makeKeyword( "SUPERIOR" );
    $sym16$_GT_MODE_ = makeSymbol( "*GT-MODE*" );
    $list17 = ConsesLow.list( makeKeyword( "SUPERIOR" ), makeKeyword( "INFERIOR" ), makeKeyword( "ACCESSIBLE" ), makeKeyword( "DIRECTED" ), makeKeyword( "INVERSE" ) );
    $sym18$_GT_MODES_ = makeSymbol( "*GT-MODES*" );
    $kw19$TRUE = makeKeyword( "TRUE" );
    $sym20$_GT_TRUTH_ = makeSymbol( "*GT-TRUTH*" );
    $sym21$_GT_QUERY_ = makeSymbol( "*GT-QUERY*" );
    $sym22$_GT_DONE__ = makeSymbol( "*GT-DONE?*" );
    $sym23$_GT_SEARCHED__ = makeSymbol( "*GT-SEARCHED?*" );
    $sym24$_GT_TARGET_ = makeSymbol( "*GT-TARGET*" );
    $sym25$_GT_RESULT_ = makeSymbol( "*GT-RESULT*" );
    $sym26$_GT_SEARCHER_ = makeSymbol( "*GT-SEARCHER*" );
    $sym27$_GT_BASE_FN_ = makeSymbol( "*GT-BASE-FN*" );
    $sym28$_GT_STEP_FN_ = makeSymbol( "*GT-STEP-FN*" );
    $sym29$_GT_COMPOSE_FN_ = makeSymbol( "*GT-COMPOSE-FN*" );
    $sym30$_GT_GATHER_FN_ = makeSymbol( "*GT-GATHER-FN*" );
    $sym31$NCONC = makeSymbol( "NCONC" );
    $sym32$_GT_COMBINE_FN_ = makeSymbol( "*GT-COMBINE-FN*" );
    $sym33$_GT_COMPARE_FN_ = makeSymbol( "*GT-COMPARE-FN*" );
    $sym34$_GT_EQUALITY_FN_ = makeSymbol( "*GT-EQUALITY-FN*" );
    $sym35$_GT_COMPOSE_PRED_ = makeSymbol( "*GT-COMPOSE-PRED*" );
    $sym36$_GT_COMPOSE_INDEX_ARG_ = makeSymbol( "*GT-COMPOSE-INDEX-ARG*" );
    $sym37$_GT_COMPOSE_GATHER_ARG_ = makeSymbol( "*GT-COMPOSE-GATHER-ARG*" );
    $kw38$DOWN = makeKeyword( "DOWN" );
    $sym39$_GT_MAX_NODES_DIRECTION_ = makeSymbol( "*GT-MAX-NODES-DIRECTION*" );
    $sym40$_GT_USE_SPEC_PREDS__ = makeSymbol( "*GT-USE-SPEC-PREDS?*" );
    $sym41$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__ = makeSymbol( "*GT-HANDLE-NON-TRANSITIVE-PREDICATE?*" );
    $str42$Current_link_support__a_is_not_a_ = makeString( "Current link support ~a is not a valid support for determining link mt." );
    $str43$Current_link_support__a_is_not_a_ = makeString( "Current link support ~a is not a valid support for determining link predicate." );
    $sym44$_GT_WHAT_MTS_RESULT_ = makeSymbol( "*GT-WHAT-MTS-RESULT*" );
    $sym45$_GT_WHAT_MTS_GOAL_NODE_ = makeSymbol( "*GT-WHAT-MTS-GOAL-NODE*" );
    $sym46$_GT_PATH_LIST_OF_MTS_ = makeSymbol( "*GT-PATH-LIST-OF-MTS*" );
    $sym47$_GT_PATH_LIST_OF_NODES_ = makeSymbol( "*GT-PATH-LIST-OF-NODES*" );
    $sym48$_GT_PATH_LENGTH_ = makeSymbol( "*GT-PATH-LENGTH*" );
    $sym49$_GT_LIST_OF_PATH_LENGTHS_ = makeSymbol( "*GT-LIST-OF-PATH-LENGTHS*" );
    $sym50$_GT_MARKING_TABLE_ = makeSymbol( "*GT-MARKING-TABLE*" );
    $sym51$_GT_TARGET_MARKING_TABLE_ = makeSymbol( "*GT-TARGET-MARKING-TABLE*" );
    $sym52$_GT_DEPTH_CUTOFF_ = makeSymbol( "*GT-DEPTH-CUTOFF*" );
    $sym53$_GT_DEPTH_CUTOFF__ = makeSymbol( "*GT-DEPTH-CUTOFF?*" );
    $sym54$_GT_PREV_DEPTH_CUTOFF_ = makeSymbol( "*GT-PREV-DEPTH-CUTOFF*" );
    $sym55$_GT_TIME_CUTOFF__ = makeSymbol( "*GT-TIME-CUTOFF?*" );
    $sym56$_GT_TIME_CUTOFF_ = makeSymbol( "*GT-TIME-CUTOFF*" );
    $sym57$_GT_INITIAL_TIME_ = makeSymbol( "*GT-INITIAL-TIME*" );
    $sym58$_GT_ANSWERS_CUTOFF__ = makeSymbol( "*GT-ANSWERS-CUTOFF?*" );
    $sym59$_GT_ANSWERS_CUTOFF_ = makeSymbol( "*GT-ANSWERS-CUTOFF*" );
    $sym60$_GT_ANSWERS_SO_FAR_ = makeSymbol( "*GT-ANSWERS-SO-FAR*" );
    $sym61$_GT_GOAL_NODE_ = makeSymbol( "*GT-GOAL-NODE*" );
    $sym62$_GT_EDGE_LIST_ = makeSymbol( "*GT-EDGE-LIST*" );
    $sym63$_GT_EDGE_LIST_RETURN__ = makeSymbol( "*GT-EDGE-LIST-RETURN?*" );
    $sym64$_GT_PATH_LIST_OF_ASSERTIONS_ = makeSymbol( "*GT-PATH-LIST-OF-ASSERTIONS*" );
    $sym65$_GT_CYCLICAL_EDGES_ = makeSymbol( "*GT-CYCLICAL-EDGES*" );
    $sym66$_GT_TRACE_LEVEL_ = makeSymbol( "*GT-TRACE-LEVEL*" );
    $sym67$_GT_TEST_LEVEL_ = makeSymbol( "*GT-TEST-LEVEL*" );
    $sym68$_SUSPEND_GT_TYPE_CHECKING__ = makeSymbol( "*SUSPEND-GT-TYPE-CHECKING?*" );
    $sym69$_GT_WARNINGS_ = makeSymbol( "*GT-WARNINGS*" );
    $sym70$_GT_USE_SKSI__ = makeSymbol( "*GT-USE-SKSI?*" );
    $list71 = ConsesLow.list( makeSymbol( "MODULE" ), makeSymbol( "PLIST" ) );
    $kw72$ACCESSORS = makeKeyword( "ACCESSORS" );
    $kw73$PREDICATE = makeKeyword( "PREDICATE" );
    $kw74$INDEX_ARG = makeKeyword( "INDEX-ARG" );
    $kw75$GATHER_ARG = makeKeyword( "GATHER-ARG" );
    $kw76$MT = makeKeyword( "MT" );
    $sym77$DEFINE = makeSymbol( "DEFINE" );
    $sym78$CLET = makeSymbol( "CLET" );
    $list79 = ConsesLow.list( makeSymbol( "RESULT" ) );
    $list80 = ConsesLow.list( makeSymbol( "*GT-LINK-TYPE*" ), makeKeyword( "ASSERTION" ) );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-MARKING-TABLE*" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), makeInteger( 128 ) ) ) );
    $sym82$CSETQ = makeSymbol( "CSETQ" );
    $sym83$RESULT = makeSymbol( "RESULT" );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) );
    $sym85$QUOTE = makeSymbol( "QUOTE" );
    $list86 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GT-LINK-TYPE*" ), makeKeyword( "ACCESSORS" ) ) );
    $sym87$PROGN = makeSymbol( "PROGN" );
    $sym88$SETUP_TRANSITIVITY_MODULE = makeSymbol( "SETUP-TRANSITIVITY-MODULE" );
    $sym89$CPUSHNEW = makeSymbol( "CPUSHNEW" );
    $list90 = ConsesLow.list( makeSymbol( "*TRANSITIVITY-MODULES*" ) );
    $list91 = ConsesLow.list( ConsesLow.list( makeKeyword( "ALL-TARGETS" ), makeSymbol( "TTM-ALL-TARGETS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list(
        makeKeyword( "ALL-SOURCES" ), makeSymbol( "TTM-ALL-SOURCES" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "BOOLEAN?" ), makeSymbol(
            "TTM-BOOLEAN?" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeKeyword( "ACCESSES-IN-WHAT-MTS" ), makeSymbol(
                "TTM-ACCESSES-IN-WHAT-MTS" ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "TERM" ) ) ) );
    $sym92$_TT_DISPATCH_TABLE_ = makeSymbol( "*TT-DISPATCH-TABLE*" );
    $sym93$_TT_METHODS_ = makeSymbol( "*TT-METHODS*" );
    $sym94$_TRANSFERS_THROUGH_MODULES_ = makeSymbol( "*TRANSFERS-THROUGH-MODULES*" );
    $list95 = ConsesLow.list( makeKeyword( "PREDICATE" ), makeKeyword( "CONDUIT-PRED" ), makeKeyword( "TT-INDEX-ARG" ), makeKeyword( "TT-GATHER-ARG" ), makeKeyword( "GT-INDEX-ARG" ), makeKeyword( "GT-GATHER-ARG" ),
        makeKeyword( "MT" ) );
    $sym96$_TT_PARAMETERS_ = makeSymbol( "*TT-PARAMETERS*" );
    $sym97$_TT_PRED_ = makeSymbol( "*TT-PRED*" );
    $sym98$_TT_INDEX_ = makeSymbol( "*TT-INDEX*" );
    $sym99$_TT_GATHER_ = makeSymbol( "*TT-GATHER*" );
    $sym100$_TT_INDEX_ARG_ = makeSymbol( "*TT-INDEX-ARG*" );
    $sym101$_TT_GATHER_ARG_ = makeSymbol( "*TT-GATHER-ARG*" );
    $sym102$_TT_TRUTH_ = makeSymbol( "*TT-TRUTH*" );
    $sym103$_TT_STEP_FN_ = makeSymbol( "*TT-STEP-FN*" );
    $sym104$_TT_TRANSITIVE_CONDUIT__ = makeSymbol( "*TT-TRANSITIVE-CONDUIT?*" );
    $kw105$CONDUIT_PRED = makeKeyword( "CONDUIT-PRED" );
    $sym106$TRANSITIVE_PREDICATE_ = makeSymbol( "TRANSITIVE-PREDICATE?" );
    $sym107$GENERIC_TTM = makeSymbol( "GENERIC-TTM" );
    $sym108$SETUP_TRANSFERS_THROUGH_MODULE = makeSymbol( "SETUP-TRANSFERS-THROUGH-MODULE" );
    $list109 = ConsesLow.list( makeSymbol( "*TRANSFERS-THROUGH-MODULES*" ) );
    $sym110$_GT_TRANSITIVE_VIA_ARG_ACTIVE__ = makeSymbol( "*GT-TRANSITIVE-VIA-ARG-ACTIVE?*" );
    $sym111$_GT_WITHIN_TRANSITIVE_VIA_ARG__ = makeSymbol( "*GT-WITHIN-TRANSITIVE-VIA-ARG?*" );
  }
}
/*
 * 
 * Total time: 700 ms
 * 
 */