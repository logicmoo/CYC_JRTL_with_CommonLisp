package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_time_search
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_search";
  public static final String myFingerPrint = "f39d09fe1c57884624e0b1db18a5de7cd9482db8897add074285e2e549297d09";
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 7504L)
  private static SubLSymbol $sbhl_time_precedes_depths$;
  private static final SubLSymbol $kw0$WEAK;
  private static final SubLObject $const1$weak_HL_TimePrecedence;
  private static final SubLObject $const2$MonotonicallyTrue;
  private static final SubLSymbol $kw3$STRICT;
  private static final SubLObject $const4$strict_HL_TimePrecedence;
  private static final SubLSymbol $kw5$WEAK_SUCCESSOR;
  private static final SubLObject $const6$weakSuccessor_HL_TimePrecedence;
  private static final SubLSymbol $kw7$SUCCESSOR_STRICT;
  private static final SubLObject $const8$successorStrict_HL_TimePrecedence;
  private static final SubLInteger $int9$_2;
  private static final SubLInteger $int10$_3;
  private static final SubLSymbol $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw12$ERROR;
  private static final SubLString $str13$_A_is_not_a__A;
  private static final SubLSymbol $sym14$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw15$CERROR;
  private static final SubLString $str16$continue_anyway;
  private static final SubLSymbol $kw17$WARN;
  private static final SubLString $str18$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const19$True_JustificationTruth;
  private static final SubLSymbol $kw20$OLD;
  private static final SubLSymbol $kw21$RESOURCE;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$INTEGERP;
  private static final SubLSymbol $sym24$SBHL_PUSH_ONTO_RESULT;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$SBHL_MODULE_P;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$APPEND;

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 789L)
  public static SubLObject add_precedence_link(final SubLObject inferior, final SubLObject mt, final SubLObject val, final SubLObject superior)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( val.eql( $kw0$WEAK ) )
    {
      final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
        sbhl_link_methods.add_sbhl_link( inferior, superior, mt, $const2$MonotonicallyTrue );
      }
      finally
      {
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
    }
    else if( val.eql( $kw3$STRICT ) )
    {
      final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const4$strict_HL_TimePrecedence ), thread );
        sbhl_link_methods.add_sbhl_link( inferior, superior, mt, $const2$MonotonicallyTrue );
      }
      finally
      {
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
    }
    else if( val.eql( $kw5$WEAK_SUCCESSOR ) )
    {
      final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const6$weakSuccessor_HL_TimePrecedence ), thread );
        sbhl_link_methods.add_sbhl_link( inferior, superior, mt, $const2$MonotonicallyTrue );
      }
      finally
      {
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
    }
    else if( val.eql( $kw7$SUCCESSOR_STRICT ) )
    {
      final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const8$successorStrict_HL_TimePrecedence ), thread );
        sbhl_link_methods.add_sbhl_link( inferior, superior, mt, $const2$MonotonicallyTrue );
      }
      finally
      {
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 1798L)
  public static SubLObject remove_precedence_link(final SubLObject inferior, final SubLObject mt, final SubLObject val, final SubLObject superior)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( val.eql( $kw0$WEAK ) )
    {
      final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
        sbhl_link_methods.remove_sbhl_link( inferior, superior, mt, $const2$MonotonicallyTrue );
      }
      finally
      {
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
    }
    else if( val.eql( $kw3$STRICT ) )
    {
      final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const4$strict_HL_TimePrecedence ), thread );
        sbhl_link_methods.remove_sbhl_link( inferior, superior, mt, $const2$MonotonicallyTrue );
      }
      finally
      {
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
    }
    else if( val.eql( $kw5$WEAK_SUCCESSOR ) )
    {
      final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const6$weakSuccessor_HL_TimePrecedence ), thread );
        sbhl_link_methods.remove_sbhl_link( inferior, superior, mt, $const2$MonotonicallyTrue );
      }
      finally
      {
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
    }
    else if( val.eql( $kw7$SUCCESSOR_STRICT ) )
    {
      final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const8$successorStrict_HL_TimePrecedence ), thread );
        sbhl_link_methods.remove_sbhl_link( inferior, superior, mt, $const2$MonotonicallyTrue );
      }
      finally
      {
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 2695L)
  public static SubLObject weakly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return T;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return sbhl_time_dates.sbhl_dateLE( sbhl_time_utilities.hl_interval_of_endpoint( before ), sbhl_time_utilities.hl_interval_of_endpoint( after ) );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return precedesP_date_before( before, after, mt, ZERO_INTEGER );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return precedesP_date_after( before, after, mt, ZERO_INTEGER );
    }
    return precedesP_node_node( before, after, mt, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 3277L)
  public static SubLObject strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return sbhl_time_dates.sbhl_dateL( sbhl_time_utilities.hl_interval_of_endpoint( before ), sbhl_time_utilities.hl_interval_of_endpoint( after ) );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return precedesP_date_before( before, after, mt, MINUS_ONE_INTEGER );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return precedesP_date_after( before, after, mt, MINUS_ONE_INTEGER );
    }
    return precedesP_node_node( before, after, mt, MINUS_ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 3753L)
  public static SubLObject weakly_precedes_successorP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return T;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return sbhl_time_dates.sbhl_dateLE( sbhl_time_utilities.hl_interval_of_endpoint( before ), sbhl_time_utilities.hl_interval_of_endpoint( after ) );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return precedesP_date_before( before, after, mt, ONE_INTEGER );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return precedesP_date_after( before, after, mt, ONE_INTEGER );
    }
    return precedesP_node_node( before, after, mt, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 4233L)
  public static SubLObject successor_strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return sbhl_time_dates.sbhl_dateL( sbhl_time_utilities.hl_interval_of_endpoint( before ), sbhl_time_utilities.hl_interval_of_endpoint( after ) );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return precedesP_date_before( before, after, mt, $int9$_2 );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return precedesP_date_after( before, after, mt, $int9$_2 );
    }
    return precedesP_node_node( before, after, mt, $int9$_2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 4719L)
  public static SubLObject weakly_precedes_successors_successorP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return T;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return sbhl_time_dates.sbhl_dateLE( sbhl_time_utilities.hl_interval_of_endpoint( before ), sbhl_time_utilities.hl_interval_of_endpoint( after ) );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return precedesP_date_before( before, after, mt, TWO_INTEGER );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return precedesP_date_after( before, after, mt, TWO_INTEGER );
    }
    return precedesP_node_node( before, after, mt, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 5210L)
  public static SubLObject weakly_precedes_successors_successors_successorP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return T;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return sbhl_time_dates.sbhl_dateLE( sbhl_time_utilities.hl_interval_of_endpoint( before ), sbhl_time_utilities.hl_interval_of_endpoint( after ) );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return precedesP_date_before( before, after, mt, THREE_INTEGER );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return precedesP_date_after( before, after, mt, THREE_INTEGER );
    }
    return precedesP_node_node( before, after, mt, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 5712L)
  public static SubLObject successors_successor_strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return sbhl_time_dates.sbhl_dateL( sbhl_time_utilities.hl_interval_of_endpoint( before ), sbhl_time_utilities.hl_interval_of_endpoint( after ) );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return precedesP_date_before( before, after, mt, $int10$_3 );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return precedesP_date_after( before, after, mt, $int10$_3 );
    }
    return precedesP_node_node( before, after, mt, $int10$_3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 6209L)
  public static SubLObject coordinateP(final SubLObject node1, final SubLObject node2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != weakly_precedesP( node1, node2, mt ) && NIL != weakly_precedesP( node2, node1, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 6364L)
  public static SubLObject successorP(final SubLObject node, final SubLObject successor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != strictly_precedesP( node, successor, mt ) && NIL != weakly_precedes_successorP( successor, node, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 6539L)
  public static SubLObject predecessorP(final SubLObject node, final SubLObject predecessor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return successorP( predecessor, node, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 6645L)
  public static SubLObject successors_successorP(final SubLObject node, final SubLObject successors_successor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != successor_strictly_precedesP( node, successors_successor, mt ) && NIL != weakly_precedes_successors_successorP( successors_successor, node, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 6885L)
  public static SubLObject precedesP_date_before(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw12$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw15$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw17$WARN ) )
            {
              Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const19$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$5 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$14 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    successP = precedesP_node_date( after, sbhl_time_utilities.hl_interval_of_endpoint( before ), mt, depth );
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$15, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$14, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$5, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$5, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$6, thread );
                }
                if( source == $kw21$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$5, thread );
              }
              if( source == $kw21$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$4, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$4, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$4, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$3, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$3, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$2, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 7196L)
  public static SubLObject precedesP_date_after(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      final SubLObject _prev_bind_0_$16 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$17 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$18 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw12$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw15$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw17$WARN ) )
            {
              Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$19 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const19$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$19 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$20 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$20 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$29 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    successP = precedesP_node_date( before, sbhl_time_utilities.hl_interval_of_endpoint( after ), mt, depth );
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$30, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$29, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$20, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$20, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$21, thread );
                }
                if( source == $kw21$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$20, thread );
              }
              if( source == $kw21$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$19, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$19, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$19, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$18, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$18, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$17, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$18, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$17, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$16, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 7571L)
  public static SubLObject precedesP_node_date(final SubLObject node, final SubLObject date, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var;
      SubLObject search_depth;
      SubLObject search_node;
      SubLObject search_date;
      SubLObject search_tag;
      for( csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue(), search_depth = NIL, search_depth = csome_list_var.first(); NIL == doneP && NIL != csome_list_var; doneP = makeBoolean( NIL != successP
          || search_depth.eql( depth ) ), csome_list_var = csome_list_var.rest(), search_depth = csome_list_var.first() )
      {
        thread.resetMultipleValues();
        search_node = sbhl_time_dates.sbhl_time_date_find_search_node( node, mt, search_depth );
        search_date = thread.secondMultipleValue();
        search_tag = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != search_date )
        {
          successP = ( ( NIL != sbhl_link_vars.sbhl_forward_directed_direction_p( sbhl_link_vars.get_sbhl_link_direction() ) ) ? ( Numbers.add( depth, Numbers.minus( search_depth ), sbhl_marking_utilities
              .sbhl_temporal_tag_increment( search_tag ) ).isNegative() ? sbhl_time_dates.sbhl_dateL( search_date, date ) : sbhl_time_dates.sbhl_dateLE( search_date, date ) )
              : ( Numbers.add( depth, Numbers.minus( search_depth ), sbhl_marking_utilities.sbhl_temporal_tag_increment( search_tag ) ).isNegative() ? sbhl_time_dates.sbhl_dateG( search_date, date )
                  : sbhl_time_dates.sbhl_dateGE( search_date, date ) ) );
        }
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 8393L)
  public static SubLObject precedesP_node_node(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    assert NIL != Types.integerp( depth ) : depth;
    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( depth, thread );
      successP = sbhl_search_methods.sbhl_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), before, after, mt, UNPROVIDED );
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0, thread );
    }
    if( NIL == successP )
    {
      _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
        SubLObject before_doneP = NIL;
        if( NIL == before_doneP )
        {
          SubLObject csome_list_var;
          SubLObject before_depth;
          SubLObject before_node;
          SubLObject before_date;
          SubLObject before_tag;
          SubLObject _prev_bind_0_$31;
          SubLObject before_node_$32;
          SubLObject before_date_$33;
          SubLObject before_tag_$34;
          SubLObject after_doneP;
          SubLObject csome_list_var_$35;
          SubLObject after_depth;
          SubLObject after_node;
          SubLObject after_date;
          SubLObject after_tag;
          SubLObject _prev_bind_0_$32;
          SubLObject after_node_$37;
          SubLObject after_date_$38;
          SubLObject after_tag_$39;
          for( csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue(), before_depth = NIL, before_depth = csome_list_var.first(); NIL == before_doneP && NIL != csome_list_var; before_doneP = makeBoolean(
              NIL != successP || before_depth.eql( depth ) ), csome_list_var = csome_list_var.rest(), before_depth = csome_list_var.first() )
          {
            before_node = NIL;
            before_date = NIL;
            before_tag = NIL;
            _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
            try
            {
              sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
              thread.resetMultipleValues();
              before_node_$32 = sbhl_time_dates.sbhl_time_date_find_search_node( before, mt, before_depth );
              before_date_$33 = thread.secondMultipleValue();
              before_tag_$34 = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              before_node = before_node_$32;
              before_date = before_date_$33;
              before_tag = before_tag_$34;
            }
            finally
            {
              sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_0_$31, thread );
            }
            if( NIL != before_date )
            {
              after_doneP = NIL;
              if( NIL == after_doneP )
              {
                for( csome_list_var_$35 = $sbhl_time_precedes_depths$.getGlobalValue(), after_depth = NIL, after_depth = csome_list_var_$35.first(); NIL == after_doneP
                    && NIL != csome_list_var_$35; after_doneP = makeBoolean( NIL != successP || after_depth.eql( depth ) ), csome_list_var_$35 = csome_list_var_$35.rest(), after_depth = csome_list_var_$35.first() )
                {
                  after_node = NIL;
                  after_date = NIL;
                  after_tag = NIL;
                  _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  try
                  {
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                    thread.resetMultipleValues();
                    after_node_$37 = sbhl_time_dates.sbhl_time_date_find_search_node( after, mt, after_depth );
                    after_date_$38 = thread.secondMultipleValue();
                    after_tag_$39 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    after_node = after_node_$37;
                    after_date = after_date_$38;
                    after_tag = after_tag_$39;
                  }
                  finally
                  {
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_0_$32, thread );
                  }
                  if( NIL != after_date )
                  {
                    successP = ( Numbers.add( new SubLObject[] { depth, Numbers.minus( before_depth ), Numbers.minus( after_depth ), sbhl_marking_utilities.sbhl_temporal_tag_increment( before_tag ),
                      sbhl_marking_utilities.sbhl_temporal_tag_increment( after_tag )
                    } ).isNegative() ? sbhl_time_dates.sbhl_dateL( before_date, after_date ) : sbhl_time_dates.sbhl_dateLE( before_date, after_date ) );
                  }
                }
              }
            }
          }
        }
      }
      finally
      {
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 9869L)
  public static SubLObject all_weakly_precedes(final SubLObject before, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ( NIL != sbhl_time_utilities.hl_date_point_p( before ) ) ? all_forward_precedes_date( before, mt, ZERO_INTEGER ) : all_forward_precedes_node( before, mt, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 10104L)
  public static SubLObject all_weakly_precedes_inverse(final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ( NIL != sbhl_time_utilities.hl_date_point_p( after ) ) ? all_backward_precedes_date( after, mt, ZERO_INTEGER ) : all_backward_precedes_node( after, mt, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 10301L)
  public static SubLObject all_strictly_precedes(final SubLObject before, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ( NIL != sbhl_time_utilities.hl_date_point_p( before ) ) ? all_forward_precedes_date( before, mt, MINUS_ONE_INTEGER ) : all_forward_precedes_node( before, mt, MINUS_ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 10496L)
  public static SubLObject all_strictly_precedes_inverse(final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ( NIL != sbhl_time_utilities.hl_date_point_p( after ) ) ? all_backward_precedes_date( after, mt, MINUS_ONE_INTEGER ) : all_backward_precedes_node( after, mt, MINUS_ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 10697L)
  public static SubLObject all_weakly_precedes_successor(final SubLObject before, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ( NIL != sbhl_time_utilities.hl_date_point_p( before ) ) ? all_forward_precedes_date( before, mt, ONE_INTEGER ) : all_forward_precedes_node( before, mt, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 10898L)
  public static SubLObject all_weakly_precedes_successor_inverse(final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ( NIL != sbhl_time_utilities.hl_date_point_p( after ) ) ? all_backward_precedes_date( after, mt, ONE_INTEGER ) : all_backward_precedes_node( after, mt, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 11105L)
  public static SubLObject all_successor_strictly_precedes(final SubLObject before, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ( NIL != sbhl_time_utilities.hl_date_point_p( before ) ) ? all_forward_precedes_date( before, mt, $int9$_2 ) : all_forward_precedes_node( before, mt, $int9$_2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 11310L)
  public static SubLObject all_successor_strictly_precedes_inverse(final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ( NIL != sbhl_time_utilities.hl_date_point_p( after ) ) ? all_backward_precedes_date( after, mt, $int9$_2 ) : all_backward_precedes_node( after, mt, $int9$_2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 11521L)
  public static SubLObject all_weakly_precedes_successors_successor(final SubLObject before, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ( NIL != sbhl_time_utilities.hl_date_point_p( before ) ) ? all_forward_precedes_date( before, mt, TWO_INTEGER ) : all_forward_precedes_node( before, mt, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 11733L)
  public static SubLObject all_weakly_precedes_successors_successor_inverse(final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return ( NIL != sbhl_time_utilities.hl_date_point_p( after ) ) ? all_backward_precedes_date( after, mt, TWO_INTEGER ) : all_backward_precedes_node( after, mt, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 11951L)
  public static SubLObject all_forward_precedes_date(final SubLObject before, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject before_date = sbhl_time_utilities.hl_interval_of_endpoint( before );
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      final SubLObject _prev_bind_0_$40 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$41 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$42 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw12$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw15$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw17$WARN ) )
            {
              Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$43 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const19$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$43 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$44 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$53 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    results = all_precedes_date( before_date, depth );
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$54, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$53, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$44, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$44, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$45, thread );
                }
                if( source == $kw21$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$44, thread );
              }
              if( source == $kw21$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$43, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$43, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$43, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$42, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$42, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$41, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$42, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$41, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$40, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 12273L)
  public static SubLObject all_backward_precedes_date(final SubLObject after, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject after_date = sbhl_time_utilities.hl_interval_of_endpoint( after );
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      final SubLObject _prev_bind_0_$55 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$56 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$57 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw12$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw15$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw17$WARN ) )
            {
              Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$58 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$58 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const19$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$58 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$59 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$59 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$59 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$68 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$69 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    results = all_precedes_date( after_date, depth );
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$69, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$68, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$59, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$59, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$60, thread );
                }
                if( source == $kw21$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$59, thread );
              }
              if( source == $kw21$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$58, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$58, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$58, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$57, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$57, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$56, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$57, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$56, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$55, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 12592L)
  public static SubLObject all_forward_precedes_node(final SubLObject before, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$71 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$72 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$71 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$72 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw12$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw15$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw17$WARN ) )
            {
              Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$73 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const19$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$73 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$74 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$74 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$83 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    results = all_precedes_node( before, depth );
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$84, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$83, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$74, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$74, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$75, thread );
                }
                if( source == $kw21$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$74, thread );
              }
              if( source == $kw21$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$73, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$73, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$73, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$72, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$72, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$71, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$72, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$71, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$70, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 12859L)
  public static SubLObject all_backward_precedes_node(final SubLObject after, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      final SubLObject _prev_bind_0_$85 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$86 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$87 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$86 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$87 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw12$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw15$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw17$WARN ) )
            {
              Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$87 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$88 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$88 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const19$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$88 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$89 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$89 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$89 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$98 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    results = all_precedes_node( after, depth );
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$99, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$98, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$89, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$89, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$90, thread );
                }
                if( source == $kw21$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$89, thread );
              }
              if( source == $kw21$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$88, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$88, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$88, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$87, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$87, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$86, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$87, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$86, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$85, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 13126L)
  public static SubLObject all_precedes_date(final SubLObject date, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_behavior$.bind( sbhl_search_utilities.determine_sbhl_search_behavior( sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars
          .get_sbhl_tv() ), thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.bind( sbhl_search_utilities.determine_sbhl_terminating_marking_space( sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue( thread ) ), thread );
      sbhl_search_vars.$sbhl_consider_node_fn$.bind( $sym24$SBHL_PUSH_ONTO_RESULT, thread );
      SubLObject date2 = NIL;
      SubLObject date3 = NIL;
      if( NIL != sbhl_link_vars.sbhl_forward_directed_direction_p( sbhl_link_vars.get_sbhl_link_direction() ) )
      {
        date2 = date;
        date3 = NIL;
      }
      else
      {
        date2 = NIL;
        date3 = date;
      }
      final SubLObject iterator = sbhl_time_dates.new_sbhl_time_date_date_link_iterator( date2, date3, sbhl_link_vars.get_sbhl_link_direction() );
      SubLObject raw_links;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = Types.sublisp_null( raw_links ) )
      {
        raw_links = sbhl_iteration.sbhl_iteration_next( iterator );
        if( NIL != raw_links )
        {
          SubLObject current;
          final SubLObject datum = current = raw_links;
          SubLObject link0 = NIL;
          SubLObject link2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
          link0 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
          link2 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            SubLObject current_$101;
            final SubLObject datum_$100 = current_$101 = link0;
            SubLObject date_tag = NIL;
            SubLObject date_mt = NIL;
            SubLObject link_date = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$101, datum_$100, $list26 );
            date_tag = current_$101.first();
            current_$101 = current_$101.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$101, datum_$100, $list26 );
            date_mt = current_$101.first();
            current_$101 = current_$101.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$101, datum_$100, $list26 );
            link_date = current_$101.first();
            current_$101 = current_$101.rest();
            final SubLObject link_supports = current_$101.isCons() ? current_$101.first() : NIL;
            cdestructuring_bind.destructuring_bind_must_listp( current_$101, datum_$100, $list26 );
            current_$101 = current_$101.rest();
            if( NIL == current_$101 )
            {
              SubLObject current_$102;
              final SubLObject datum_$101 = current_$102 = link2;
              SubLObject node_tag = NIL;
              SubLObject node_mt = NIL;
              SubLObject node = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$102, datum_$101, $list27 );
              node_tag = current_$102.first();
              current_$102 = current_$102.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$102, datum_$101, $list27 );
              node_mt = current_$102.first();
              current_$102 = current_$102.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$102, datum_$101, $list27 );
              node = current_$102.first();
              current_$102 = current_$102.rest();
              final SubLObject link_supports_$104 = current_$102.isCons() ? current_$102.first() : NIL;
              cdestructuring_bind.destructuring_bind_must_listp( current_$102, datum_$101, $list27 );
              current_$102 = current_$102.rest();
              if( NIL == current_$102 )
              {
                final SubLObject succession_depth = ( NIL != sbhl_time_dates.sbhl_dateE( date, link_date ) ) ? Numbers.add( depth, sbhl_marking_utilities.sbhl_temporal_tag_increment( node_tag ) )
                    : sbhl_time_vars.sbhl_temporality_date_succession();
                assert NIL != Types.integerp( succession_depth ) : succession_depth;
                final SubLObject _prev_bind_0_$105 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
                final SubLObject _prev_bind_1_$106 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                try
                {
                  sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( succession_depth, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  results = ConsesLow.nconc( results, sbhl_search_methods.sbhl_transitive_closure( node ) );
                }
                finally
                {
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_1_$106, thread );
                  sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$105, thread );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$101, $list27 );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$100, $list26 );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
          }
        }
      }
    }
    finally
    {
      sbhl_search_vars.$sbhl_consider_node_fn$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_behavior$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 13889L)
  public static SubLObject all_precedes_node(final SubLObject node, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_behavior$.bind( sbhl_search_utilities.determine_sbhl_search_behavior( sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars
          .get_sbhl_tv() ), thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.bind( sbhl_search_utilities.determine_sbhl_terminating_marking_space( sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue( thread ) ), thread );
      sbhl_search_vars.$sbhl_consider_node_fn$.bind( $sym24$SBHL_PUSH_ONTO_RESULT, thread );
      assert NIL != Types.integerp( depth ) : depth;
      final SubLObject _prev_bind_0_$107 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( depth, thread );
        results = sbhl_search_methods.sbhl_transitive_closure( node );
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$107, thread );
      }
      thread.resetMultipleValues();
      final SubLObject initial_node = sbhl_time_dates.sbhl_time_date_find_search_node( node, UNPROVIDED, UNPROVIDED );
      final SubLObject initial_date = thread.secondMultipleValue();
      final SubLObject initial_tag = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != initial_node )
      {
        final SubLObject iterator = sbhl_time_dates.new_sbhl_time_date_link_iterator( initial_node, sbhl_link_vars.get_sbhl_link_direction(), NIL, NIL );
        SubLObject raw_links;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = Types.sublisp_null( raw_links ) )
        {
          raw_links = sbhl_iteration.sbhl_iteration_next( iterator );
          if( NIL != raw_links )
          {
            SubLObject current;
            final SubLObject datum = current = raw_links;
            SubLObject link0 = NIL;
            SubLObject link2 = NIL;
            SubLObject link3 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
            link0 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
            link2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
            link3 = current.first();
            current = current.rest();
            if( NIL == current )
            {
              SubLObject current_$109;
              final SubLObject datum_$108 = current_$109 = link0;
              SubLObject date_tag = NIL;
              SubLObject date_mt = NIL;
              SubLObject date_date = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$109, datum_$108, $list29 );
              date_tag = current_$109.first();
              current_$109 = current_$109.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$109, datum_$108, $list29 );
              date_mt = current_$109.first();
              current_$109 = current_$109.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$109, datum_$108, $list29 );
              date_date = current_$109.first();
              current_$109 = current_$109.rest();
              final SubLObject link_supports = current_$109.isCons() ? current_$109.first() : NIL;
              cdestructuring_bind.destructuring_bind_must_listp( current_$109, datum_$108, $list29 );
              current_$109 = current_$109.rest();
              if( NIL == current_$109 )
              {
                SubLObject current_$110;
                final SubLObject datum_$109 = current_$110 = link2;
                SubLObject int_tag = NIL;
                SubLObject int_mt = NIL;
                SubLObject int_date = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$110, datum_$109, $list30 );
                int_tag = current_$110.first();
                current_$110 = current_$110.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$110, datum_$109, $list30 );
                int_mt = current_$110.first();
                current_$110 = current_$110.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$110, datum_$109, $list30 );
                int_date = current_$110.first();
                current_$110 = current_$110.rest();
                final SubLObject link_supports_$112 = current_$110.isCons() ? current_$110.first() : NIL;
                cdestructuring_bind.destructuring_bind_must_listp( current_$110, datum_$109, $list30 );
                current_$110 = current_$110.rest();
                if( NIL == current_$110 )
                {
                  SubLObject current_$111;
                  final SubLObject datum_$110 = current_$111 = link3;
                  SubLObject link_tag = NIL;
                  SubLObject link_mt = NIL;
                  SubLObject link_node = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current_$111, datum_$110, $list31 );
                  link_tag = current_$111.first();
                  current_$111 = current_$111.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current_$111, datum_$110, $list31 );
                  link_mt = current_$111.first();
                  current_$111 = current_$111.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current_$111, datum_$110, $list31 );
                  link_node = current_$111.first();
                  current_$111 = current_$111.rest();
                  final SubLObject link_supports_$113 = current_$111.isCons() ? current_$111.first() : NIL;
                  cdestructuring_bind.destructuring_bind_must_listp( current_$111, datum_$110, $list31 );
                  current_$111 = current_$111.rest();
                  if( NIL == current_$111 )
                  {
                    final SubLObject succession_depth = ( NIL != sbhl_time_dates.sbhl_dateE( date_date, int_date ) ) ? Numbers.add( depth, sbhl_marking_utilities.sbhl_temporal_tag_increment( date_tag ),
                        sbhl_marking_utilities.sbhl_temporal_tag_increment( link_tag ) ) : sbhl_time_vars.sbhl_temporality_date_succession();
                    assert NIL != Types.integerp( succession_depth ) : succession_depth;
                    final SubLObject _prev_bind_0_$108 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$117 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                    try
                    {
                      sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( succession_depth, thread );
                      sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                      results = ConsesLow.nconc( results, sbhl_search_methods.sbhl_transitive_closure( link_node ) );
                    }
                    finally
                    {
                      sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_1_$117, thread );
                      sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$108, thread );
                    }
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum_$110, $list31 );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$109, $list30 );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$108, $list29 );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
            }
          }
        }
      }
    }
    finally
    {
      sbhl_search_vars.$sbhl_consider_node_fn$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_behavior$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 15057L)
  public static SubLObject all_coordinate(final SubLObject node, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_temporality_all_forward_nodes_between( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), ZERO_INTEGER, node, node, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 15273L)
  public static SubLObject all_successors(final SubLObject node, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_temporality_all_forward_nodes_between( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), MINUS_ONE_INTEGER, node, node, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 15440L)
  public static SubLObject all_predecessors(final SubLObject node, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_temporality_all_backward_nodes_between( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), MINUS_ONE_INTEGER, node, node, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 15610L)
  public static SubLObject all_successors_successors(final SubLObject node, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_temporality_all_forward_nodes_between( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), $int9$_2, node, node, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 15788L)
  public static SubLObject all_predecessors_predecessors(final SubLObject node, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_temporality_all_backward_nodes_between( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), $int9$_2, node, node, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 15971L)
  public static SubLObject all_between(final SubLObject marking_depth, final SubLObject searching_depth, final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return sbhl_temporality_all_forward_nodes_between( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), marking_depth, before, after, mt, searching_depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 16203L)
  public static SubLObject sbhl_temporality_all_forward_nodes_between(final SubLObject module, final SubLObject depth, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject search_depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( search_depth == UNPROVIDED )
    {
      search_depth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sbhl_module_vars.sbhl_module_p( module ) : module;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( module, thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( module ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( module ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( module, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$118 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$119 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$120 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$119 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$120 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw12$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw15$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw17$WARN ) )
            {
              Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$120 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$121 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$121 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const19$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$121 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$122 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$122 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$122 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$131 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$132 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    result = sbhl_temporality_all_nodes_accessed_between( depth, node1, node2, search_depth );
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$132, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$131, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$122, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$122, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$123, thread );
                }
                if( source == $kw21$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$122, thread );
              }
              if( source == $kw21$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$121, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$121, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$121, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$120, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$120, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$119, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$120, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$119, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$118, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 16566L)
  public static SubLObject sbhl_temporality_all_backward_nodes_between(final SubLObject module, final SubLObject depth, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject search_depth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( search_depth == UNPROVIDED )
    {
      search_depth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sbhl_module_vars.sbhl_module_p( module ) : module;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( module, thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( module ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( module ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( module, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$133 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$134 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$135 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$134 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$135 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw12$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw15$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw17$WARN ) )
            {
              Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$135 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$136 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$136 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const19$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$136 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$137 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$138 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$137 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$137 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$146 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$147 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    result = sbhl_temporality_all_nodes_accessed_between( depth, node1, node2, search_depth );
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$147, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$146, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$137, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$137, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$138, thread );
                }
                if( source == $kw21$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$137, thread );
              }
              if( source == $kw21$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$136, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$136, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$136, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$135, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$135, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$134, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$135, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$134, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$133, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 16930L)
  public static SubLObject sbhl_temporality_all_nodes_accessed_between(final SubLObject depth, final SubLObject node1, final SubLObject node2, SubLObject search_depth)
  {
    if( search_depth == UNPROVIDED )
    {
      search_depth = NIL;
    }
    if( NIL == search_depth )
    {
      search_depth = Numbers.minus( depth );
    }
    final SubLObject node1_date = ( NIL != sbhl_time_utilities.hl_date_point_p( node1 ) ) ? sbhl_time_utilities.hl_interval_of_endpoint( node1 ) : NIL;
    final SubLObject node2_date = ( NIL != sbhl_time_utilities.hl_date_point_p( node2 ) ) ? sbhl_time_utilities.hl_interval_of_endpoint( node2 ) : NIL;
    if( NIL != node1_date && NIL != node2_date )
    {
      return sbhl_temporality_all_nodes_accessed_between_dates( depth, node1_date, node2_date, search_depth );
    }
    if( NIL != node1_date )
    {
      return sbhl_temporality_all_nodes_accessed_between_date_node( depth, node1_date, node2, search_depth );
    }
    if( NIL != node2_date )
    {
      return sbhl_temporality_all_nodes_accessed_between_node_date( depth, node1, node2_date, search_depth );
    }
    return sbhl_temporality_all_nodes_accessed_between_nodes( depth, node1, node2, search_depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 18276L)
  public static SubLObject sbhl_temporality_all_nodes_accessed_between_dates(final SubLObject depth, final SubLObject date1, final SubLObject date2, final SubLObject search_depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_target_space$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_behavior$.bind( sbhl_search_utilities.determine_sbhl_search_behavior( sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars
          .get_sbhl_tv() ), thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.bind( sbhl_search_utilities.determine_sbhl_terminating_marking_space( sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue( thread ) ), thread );
      sbhl_marking_vars.$sbhl_target_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject _prev_bind_0_$148 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.$sbhl_target_space$.getDynamicValue( thread ), thread );
          results = sbhl_temporality_all_nodes_accessed_between_dates_int( depth, date1, date2, search_depth );
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$148, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$149 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_target_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$149, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_target_space$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_behavior$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 18587L)
  public static SubLObject sbhl_temporality_all_nodes_accessed_between_dates_int(final SubLObject depth, final SubLObject date1, final SubLObject date2, final SubLObject search_depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    if( ( NIL != sbhl_link_vars.sbhl_forward_directed_direction_p( sbhl_link_vars.get_sbhl_link_direction() ) && NIL != sbhl_time_dates.sbhl_dateLE( date1, date2 ) ) || ( NIL != sbhl_link_vars
        .sbhl_backward_directed_direction_p( sbhl_link_vars.get_sbhl_link_direction() ) && NIL != sbhl_time_dates.sbhl_dateGE( date1, date2 ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject earlier = ( NIL != sbhl_time_dates.sbhl_dateLE( date1, date2 ) ) ? Values.values( date1, date2 ) : Values.values( date2, date1 );
      final SubLObject later = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject iterator = sbhl_time_dates.new_sbhl_time_date_date_link_iterator( earlier, later, sbhl_link_vars.get_sbhl_link_direction() );
      SubLObject raw_links;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = Types.sublisp_null( raw_links ) )
      {
        raw_links = sbhl_iteration.sbhl_iteration_next( iterator );
        if( NIL != raw_links )
        {
          SubLObject current;
          final SubLObject datum = current = raw_links;
          SubLObject link0 = NIL;
          SubLObject link2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
          link0 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
          link2 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            SubLObject current_$151;
            final SubLObject datum_$150 = current_$151 = link0;
            SubLObject date_tag = NIL;
            SubLObject date_mt = NIL;
            SubLObject date3 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$151, datum_$150, $list33 );
            date_tag = current_$151.first();
            current_$151 = current_$151.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$151, datum_$150, $list33 );
            date_mt = current_$151.first();
            current_$151 = current_$151.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$151, datum_$150, $list33 );
            date3 = current_$151.first();
            current_$151 = current_$151.rest();
            final SubLObject link_supports = current_$151.isCons() ? current_$151.first() : NIL;
            cdestructuring_bind.destructuring_bind_must_listp( current_$151, datum_$150, $list33 );
            current_$151 = current_$151.rest();
            if( NIL == current_$151 )
            {
              SubLObject current_$152;
              final SubLObject datum_$151 = current_$152 = link2;
              SubLObject node_tag = NIL;
              SubLObject node_mt = NIL;
              SubLObject node = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$152, datum_$151, $list27 );
              node_tag = current_$152.first();
              current_$152 = current_$152.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$152, datum_$151, $list27 );
              node_mt = current_$152.first();
              current_$152 = current_$152.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$152, datum_$151, $list27 );
              node = current_$152.first();
              current_$152 = current_$152.rest();
              final SubLObject link_supports_$154 = current_$152.isCons() ? current_$152.first() : NIL;
              cdestructuring_bind.destructuring_bind_must_listp( current_$152, datum_$151, $list27 );
              current_$152 = current_$152.rest();
              if( NIL == current_$152 )
              {
                final SubLObject succession_depth = ( NIL != sbhl_time_dates.sbhl_date_betweenP( date3, earlier, later, T ) ) ? sbhl_time_vars.sbhl_temporality_date_succession()
                    : Numbers.add( depth, sbhl_marking_utilities.sbhl_temporal_tag_increment( node_tag ) );
                assert NIL != Types.integerp( succession_depth ) : succession_depth;
                final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
                final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                try
                {
                  sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( succession_depth, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_marking_methods.sbhl_mark_closure_as_marked( node );
                }
                finally
                {
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2, thread );
                  sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0, thread );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$151, $list27 );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$150, $list33 );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
          }
        }
      }
      final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$155 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$156 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding( thread );
              try
              {
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_link_vars.get_sbhl_opposite_link_direction(), thread );
                sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.bind( T, thread );
                sbhl_search_vars.$sbhl_consider_node_fn$.bind( $sym24$SBHL_PUSH_ONTO_RESULT, thread );
                final SubLObject iterator2 = sbhl_time_dates.new_sbhl_time_date_date_link_iterator( earlier, later, sbhl_link_vars.get_sbhl_link_direction() );
                SubLObject raw_links2;
                for( SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = Types.sublisp_null( raw_links2 ) )
                {
                  raw_links2 = sbhl_iteration.sbhl_iteration_next( iterator2 );
                  if( NIL != raw_links2 )
                  {
                    SubLObject current2;
                    final SubLObject datum2 = current2 = raw_links2;
                    SubLObject link3 = NIL;
                    SubLObject link4 = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list25 );
                    link3 = current2.first();
                    current2 = current2.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list25 );
                    link4 = current2.first();
                    current2 = current2.rest();
                    if( NIL == current2 )
                    {
                      SubLObject current_$153;
                      final SubLObject datum_$152 = current_$153 = link3;
                      SubLObject date_tag2 = NIL;
                      SubLObject date_mt2 = NIL;
                      SubLObject date4 = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current_$153, datum_$152, $list33 );
                      date_tag2 = current_$153.first();
                      current_$153 = current_$153.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current_$153, datum_$152, $list33 );
                      date_mt2 = current_$153.first();
                      current_$153 = current_$153.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current_$153, datum_$152, $list33 );
                      date4 = current_$153.first();
                      current_$153 = current_$153.rest();
                      final SubLObject link_supports2 = current_$153.isCons() ? current_$153.first() : NIL;
                      cdestructuring_bind.destructuring_bind_must_listp( current_$153, datum_$152, $list33 );
                      current_$153 = current_$153.rest();
                      if( NIL == current_$153 )
                      {
                        SubLObject current_$154;
                        final SubLObject datum_$153 = current_$154 = link4;
                        SubLObject node_tag2 = NIL;
                        SubLObject node_mt2 = NIL;
                        SubLObject node2 = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp( current_$154, datum_$153, $list27 );
                        node_tag2 = current_$154.first();
                        current_$154 = current_$154.rest();
                        cdestructuring_bind.destructuring_bind_must_consp( current_$154, datum_$153, $list27 );
                        node_mt2 = current_$154.first();
                        current_$154 = current_$154.rest();
                        cdestructuring_bind.destructuring_bind_must_consp( current_$154, datum_$153, $list27 );
                        node2 = current_$154.first();
                        current_$154 = current_$154.rest();
                        final SubLObject link_supports_$155 = current_$154.isCons() ? current_$154.first() : NIL;
                        cdestructuring_bind.destructuring_bind_must_listp( current_$154, datum_$153, $list27 );
                        current_$154 = current_$154.rest();
                        if( NIL == current_$154 )
                        {
                          final SubLObject succession_depth2 = ( NIL != sbhl_time_dates.sbhl_date_betweenP( date4, earlier, later, T ) ) ? sbhl_time_vars.sbhl_temporality_date_succession()
                              : Numbers.add( search_depth, sbhl_marking_utilities.sbhl_temporal_tag_increment( node_tag2 ) );
                          assert NIL != Types.integerp( succession_depth2 ) : succession_depth2;
                          final SubLObject _prev_bind_0_$157 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$163 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                          try
                          {
                            sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( succession_depth2, thread );
                            sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                            results = ConsesLow.nconc( results, sbhl_search_methods.sbhl_transitive_closure( node2 ) );
                          }
                          finally
                          {
                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_1_$163, thread );
                            sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$157, thread );
                          }
                        }
                        else
                        {
                          cdestructuring_bind.cdestructuring_bind_error( datum_$153, $list27 );
                        }
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum_$152, $list33 );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum2, $list25 );
                    }
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$sbhl_consider_node_fn$.rebind( _prev_bind_5, thread );
                sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.rebind( _prev_bind_4, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_0_$156, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$158 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$158, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$155, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$159 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$159, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_3, thread );
      }
    }
    return list_utilities.fast_delete_duplicates( results, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 20584L)
  public static SubLObject sbhl_temporality_all_nodes_accessed_between_date_node(final SubLObject depth, final SubLObject date, final SubLObject node, final SubLObject search_depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
    try
    {
      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_link_vars.get_sbhl_opposite_link_direction(), thread );
      results = sbhl_temporality_all_nodes_accessed_between_node_date( depth, node, date, search_depth );
    }
    finally
    {
      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 20871L)
  public static SubLObject sbhl_temporality_all_nodes_accessed_between_node_date(final SubLObject depth, final SubLObject node, final SubLObject date, final SubLObject search_depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_target_space$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_behavior$.bind( sbhl_search_utilities.determine_sbhl_search_behavior( sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars
          .get_sbhl_tv() ), thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.bind( sbhl_search_utilities.determine_sbhl_terminating_marking_space( sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue( thread ) ), thread );
      sbhl_marking_vars.$sbhl_target_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject _prev_bind_0_$166 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.$sbhl_target_space$.getDynamicValue( thread ), thread );
          assert NIL != Types.integerp( depth ) : depth;
          final SubLObject _prev_bind_0_$167 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
          try
          {
            sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( depth, thread );
            sbhl_marking_methods.sbhl_mark_closure_as_marked( node );
          }
          finally
          {
            sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$167, thread );
          }
          thread.resetMultipleValues();
          final SubLObject search_node = sbhl_time_dates.sbhl_time_date_find_search_node( node, UNPROVIDED, UNPROVIDED );
          final SubLObject search_date = thread.secondMultipleValue();
          final SubLObject search_tag = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != search_date )
          {
            final SubLObject adjusted_depth = Numbers.add( depth, sbhl_marking_utilities.sbhl_temporal_tag_increment( search_tag ) );
            results = sbhl_temporality_all_nodes_accessed_between_dates_int( adjusted_depth, search_date, date, search_depth );
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$166, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$168 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_target_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$168, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_target_space$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_behavior$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 21524L)
  public static SubLObject sbhl_temporality_all_nodes_accessed_between_nodes(final SubLObject depth, final SubLObject node1, final SubLObject node2, final SubLObject search_depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_target_space$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_behavior$.bind( sbhl_search_utilities.determine_sbhl_search_behavior( sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars
          .get_sbhl_tv() ), thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.bind( sbhl_search_utilities.determine_sbhl_terminating_marking_space( sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue( thread ) ), thread );
      sbhl_marking_vars.$sbhl_target_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject _prev_bind_0_$169 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.$sbhl_target_space$.getDynamicValue( thread ), thread );
          assert NIL != Types.integerp( depth ) : depth;
          final SubLObject _prev_bind_0_$170 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
          try
          {
            sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( depth, thread );
            sbhl_marking_methods.sbhl_mark_closure_as_marked( node1 );
            final SubLObject _prev_bind_0_$171 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
            final SubLObject _prev_bind_1_$172 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
              sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_link_vars.get_sbhl_opposite_link_direction(), thread );
              sbhl_marking_methods.sbhl_mark_closure_as_marked( node2 );
            }
            finally
            {
              sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$172, thread );
              sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_0_$171, thread );
            }
          }
          finally
          {
            sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$170, thread );
          }
          SubLObject node1_node = NIL;
          SubLObject node1_date = NIL;
          SubLObject node1_tag = NIL;
          SubLObject node2_node = NIL;
          SubLObject node2_date = NIL;
          SubLObject node2_tag = NIL;
          thread.resetMultipleValues();
          final SubLObject node1_node_$173 = sbhl_time_dates.sbhl_time_date_find_search_node( node1, UNPROVIDED, UNPROVIDED );
          final SubLObject node1_date_$174 = thread.secondMultipleValue();
          final SubLObject node1_tag_$175 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          node1_node = node1_node_$173;
          node1_date = node1_date_$174;
          node1_tag = node1_tag_$175;
          final SubLObject _prev_bind_0_$172 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_link_vars.get_sbhl_opposite_link_direction(), thread );
            thread.resetMultipleValues();
            final SubLObject node2_node_$177 = sbhl_time_dates.sbhl_time_date_find_search_node( node2, UNPROVIDED, UNPROVIDED );
            final SubLObject node2_date_$178 = thread.secondMultipleValue();
            final SubLObject node2_tag_$179 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            node2_node = node2_node_$177;
            node2_date = node2_date_$178;
            node2_tag = node2_tag_$179;
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_0_$172, thread );
          }
          final SubLObject _prev_bind_0_$173 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$174 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                try
                {
                  final SubLObject _prev_bind_0_$175 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                    assert NIL != Types.integerp( search_depth ) : search_depth;
                    final SubLObject _prev_bind_0_$176 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$173 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$185 = sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.currentBinding( thread );
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding( thread );
                    try
                    {
                      sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( search_depth, thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_link_vars.get_sbhl_opposite_link_direction(), thread );
                      sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.bind( T, thread );
                      sbhl_search_vars.$sbhl_consider_node_fn$.bind( $sym24$SBHL_PUSH_ONTO_RESULT, thread );
                      results = sbhl_search_methods.sbhl_transitive_closure( node2 );
                    }
                    finally
                    {
                      sbhl_search_vars.$sbhl_consider_node_fn$.rebind( _prev_bind_4, thread );
                      sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.rebind( _prev_bind_2_$185, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$173, thread );
                      sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$176, thread );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_0_$175, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$177 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$177, thread );
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$174, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$178 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$178, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$173, thread );
          }
          if( NIL != node1_date && NIL != node2_date )
          {
            final SubLObject new_depth = Numbers.add( depth, sbhl_marking_utilities.sbhl_temporal_tag_increment( node1_tag ) );
            final SubLObject new_search_depth = Numbers.add( search_depth, sbhl_marking_utilities.sbhl_temporal_tag_increment( node2_tag ) );
            results = ConsesLow.nconc( results, sbhl_temporality_all_nodes_accessed_between_dates_int( new_depth, node1_date, node2_date, new_search_depth ) );
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$169, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$179 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_target_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$179, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_target_space$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_behavior$.rebind( _prev_bind_0, thread );
    }
    return list_utilities.fast_delete_duplicates( results, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 23134L)
  public static SubLObject why_weakly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return why_precedesP_date_before( before, after, mt, ZERO_INTEGER );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return why_precedesP_date_after( before, after, mt, ZERO_INTEGER );
    }
    return why_precedesP_node_node( before, after, mt, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 23674L)
  public static SubLObject why_strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return why_precedesP_date_before( before, after, mt, MINUS_ONE_INTEGER );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return why_precedesP_date_after( before, after, mt, MINUS_ONE_INTEGER );
    }
    return why_precedesP_node_node( before, after, mt, MINUS_ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 24092L)
  public static SubLObject why_weakly_precedes_successorP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return why_precedesP_date_before( before, after, mt, ONE_INTEGER );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return why_precedesP_date_after( before, after, mt, ONE_INTEGER );
    }
    return why_precedesP_node_node( before, after, mt, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 24515L)
  public static SubLObject why_successor_strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return why_precedesP_date_before( before, after, mt, $int9$_2 );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return why_precedesP_date_after( before, after, mt, $int9$_2 );
    }
    return why_precedesP_node_node( before, after, mt, $int9$_2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 24943L)
  public static SubLObject why_weakly_precedes_successors_successorP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return why_precedesP_date_before( before, after, mt, TWO_INTEGER );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return why_precedesP_date_after( before, after, mt, TWO_INTEGER );
    }
    return why_precedesP_node_node( before, after, mt, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 25377L)
  public static SubLObject why_weakly_precedes_successors_successors_successorP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return why_precedesP_date_before( before, after, mt, THREE_INTEGER );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return why_precedesP_date_after( before, after, mt, THREE_INTEGER );
    }
    return why_precedesP_node_node( before, after, mt, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 25822L)
  public static SubLObject why_successors_successor_strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( before.eql( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) && NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return NIL;
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( before ) )
    {
      return why_precedesP_date_before( before, after, mt, $int10$_3 );
    }
    if( NIL != sbhl_time_utilities.hl_date_point_p( after ) )
    {
      return why_precedesP_date_after( before, after, mt, $int10$_3 );
    }
    return why_precedesP_node_node( before, after, mt, $int10$_3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 26261L)
  public static SubLObject why_coordinateP(final SubLObject node1, final SubLObject node2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject just_first_half = NIL;
    SubLObject just_second_half = NIL;
    just_first_half = why_weakly_precedesP( node1, node2, mt );
    if( NIL != just_first_half )
    {
      just_second_half = why_weakly_precedesP( node2, node1, mt );
    }
    return ( NIL != just_first_half && NIL != just_second_half ) ? ConsesLow.append( just_first_half, just_second_half ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 26684L)
  public static SubLObject why_successorP(final SubLObject node, final SubLObject successor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject just_first_half = NIL;
    SubLObject just_second_half = NIL;
    just_first_half = why_strictly_precedesP( node, successor, mt );
    if( NIL != just_first_half )
    {
      just_second_half = why_weakly_precedes_successorP( successor, node, mt );
    }
    return ( NIL != just_first_half && NIL != just_second_half ) ? ConsesLow.append( just_first_half, just_second_half ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 27127L)
  public static SubLObject why_predecessorP(final SubLObject node, final SubLObject predecessor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return why_successorP( predecessor, node, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 27241L)
  public static SubLObject why_successors_successorP(final SubLObject node, final SubLObject successors_successor, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject just_first_half = NIL;
    SubLObject just_second_half = NIL;
    just_first_half = why_successor_strictly_precedesP( node, successors_successor, mt );
    if( NIL != just_first_half )
    {
      just_second_half = why_weakly_precedes_successors_successorP( successors_successor, node, mt );
    }
    return ( NIL != just_first_half && NIL != just_second_half ) ? ConsesLow.append( just_first_half, just_second_half ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 27749L)
  public static SubLObject why_precedesP_date_before(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject just = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      final SubLObject _prev_bind_0_$189 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$190 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$191 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$190 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$191 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw12$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw15$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw17$WARN ) )
            {
              Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$191 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$192 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$192 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const19$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$192 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$193 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$194 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$193 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$193 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$202 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$203 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    just = why_precedesP_node_date( after, sbhl_time_utilities.hl_interval_of_endpoint( before ), mt, depth );
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$203, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$202, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$193, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$193, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$194, thread );
                }
                if( source == $kw21$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$193, thread );
              }
              if( source == $kw21$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$192, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$192, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$192, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$191, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$191, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$190, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$191, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$190, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$189, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return just;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 28056L)
  public static SubLObject why_precedesP_date_after(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject just = NIL;
    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    try
    {
      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ) ), thread );
      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
      final SubLObject _prev_bind_0_$204 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$205 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$206 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$205 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_1_$206 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw12$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw15$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw17$WARN ) )
            {
              Errors.warn( $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str16$continue_anyway, $str13$_A_is_not_a__A, tv_var, $sym14$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$206 = sbhl_search_vars.$sbhl_search_truth$.currentBinding( thread );
          final SubLObject _prev_bind_1_$207 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$207 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_truth$.bind( $const19$True_JustificationTruth, thread );
            sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
            sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$207 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$sbhl_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
              final SubLObject _prev_bind_0_$208 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_gather_space$.bind( ( source == $kw20$OLD ) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) : sbhl_marking_vars.sbhl_get_new_space( source ), thread );
                final SubLObject _prev_bind_0_$209 = sbhl_search_vars.$sbhl_finishedP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$208 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$208 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding( thread );
                final SubLObject _prev_bind_3_$217 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding( thread );
                final SubLObject _prev_bind_4_$218 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_finishedP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind( NIL, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.bind( NIL, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                  SubLObject needs_to_releaseP = NIL;
                  try
                  {
                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
                    just = why_precedesP_node_date( before, sbhl_time_utilities.hl_interval_of_endpoint( after ), mt, depth );
                  }
                  finally
                  {
                    if( NIL != needs_to_releaseP )
                    {
                      ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
                    }
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4_$218, thread );
                  sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind( _prev_bind_3_$217, thread );
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind( _prev_bind_2_$208, thread );
                  sbhl_search_vars.$sbhl_stop_search_pathP$.rebind( _prev_bind_1_$208, thread );
                  sbhl_search_vars.$sbhl_finishedP$.rebind( _prev_bind_0_$209, thread );
                }
                if( source == $kw21$RESOURCE )
                {
                  sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_0_$208, thread );
              }
              if( source == $kw21$RESOURCE )
              {
                sbhl_marking_vars.update_sbhl_resourced_spaces( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$207, thread );
            }
          }
          finally
          {
            sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$207, thread );
            sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_1_$207, thread );
            sbhl_search_vars.$sbhl_search_truth$.rebind( _prev_bind_0_$206, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$206, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$205, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$206, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$205, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$204, thread );
      }
    }
    finally
    {
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_2, thread );
      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0, thread );
    }
    return just;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 28360L)
  public static SubLObject why_precedesP_node_date(final SubLObject node, final SubLObject date, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject just = NIL;
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var;
      SubLObject search_depth;
      SubLObject search_node;
      SubLObject search_date;
      SubLObject search_tag;
      SubLObject _prev_bind_0;
      SubLObject _prev_bind_2;
      SubLObject _prev_bind_0_$219;
      SubLObject supports;
      for( csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue(), search_depth = NIL, search_depth = csome_list_var.first(); NIL == doneP && NIL != csome_list_var; doneP = makeBoolean( NIL != just || search_depth
          .eql( depth ) ), csome_list_var = csome_list_var.rest(), search_depth = csome_list_var.first() )
      {
        thread.resetMultipleValues();
        search_node = sbhl_time_dates.sbhl_time_date_find_search_node( node, mt, search_depth );
        search_date = thread.secondMultipleValue();
        search_tag = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != search_node && NIL != ( ( NIL != sbhl_link_vars.sbhl_forward_directed_direction_p( sbhl_link_vars.get_sbhl_link_direction() ) ) ? ( Numbers.add( depth, Numbers.minus( search_depth ),
            sbhl_marking_utilities.sbhl_temporal_tag_increment( search_tag ) ).isNegative() ? sbhl_time_dates.sbhl_dateL( search_date, date ) : sbhl_time_dates.sbhl_dateLE( search_date, date ) )
            : ( Numbers.add( depth, Numbers.minus( search_depth ), sbhl_marking_utilities.sbhl_temporal_tag_increment( search_tag ) ).isNegative() ? sbhl_time_dates.sbhl_dateG( search_date, date )
                : sbhl_time_dates.sbhl_dateGE( search_date, date ) ) ) )
        {
          if( !node.eql( search_node ) )
          {
            _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding( thread );
            _prev_bind_2 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding( thread );
            try
            {
              sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind( NIL, thread );
              sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind( NIL, thread );
              assert NIL != Types.integerp( Numbers.subtract( depth, sbhl_marking_utilities.sbhl_temporal_tag_increment( search_tag ) ) ) : Numbers.subtract( depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(
                  search_tag ) );
              _prev_bind_0_$219 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
              try
              {
                sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( Numbers.subtract( depth, sbhl_marking_utilities.sbhl_temporal_tag_increment( search_tag ) ), thread );
                just = ( ( NIL != sbhl_link_vars.sbhl_forward_directed_direction_p( sbhl_link_vars.get_sbhl_link_direction() ) ) ? why_sbhl_time_predicate_relation_p( sbhl_module_vars.get_sbhl_module(
                    $const1$weak_HL_TimePrecedence ), node, search_node, mt, UNPROVIDED, UNPROVIDED )
                    : why_sbhl_time_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), search_node, node, mt, UNPROVIDED, UNPROVIDED ) );
              }
              finally
              {
                sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$219, thread );
              }
            }
            finally
            {
              sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind( _prev_bind_2, thread );
              sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind( _prev_bind_0, thread );
            }
          }
          supports = sbhl_time_dates.sbhl_time_date_node_date_link_supports( search_node, search_tag, search_date, mt );
          if( NIL != supports )
          {
            just = ConsesLow.append( just, supports );
          }
        }
      }
    }
    return list_utilities.fast_delete_duplicates( just, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 29918L)
  public static SubLObject why_precedesP_node_node(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject just = NIL;
    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding( thread );
    try
    {
      sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind( NIL, thread );
      sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind( NIL, thread );
      assert NIL != Types.integerp( depth ) : depth;
      final SubLObject _prev_bind_0_$220 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
      try
      {
        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( depth, thread );
        just = why_sbhl_time_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), before, after, mt, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$220, thread );
      }
    }
    finally
    {
      sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind( _prev_bind_2, thread );
      sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind( _prev_bind_0, thread );
    }
    if( NIL == just )
    {
      _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), thread );
        SubLObject before_doneP = NIL;
        if( NIL == before_doneP )
        {
          SubLObject csome_list_var;
          SubLObject before_depth;
          SubLObject before_node;
          SubLObject before_date;
          SubLObject before_tag;
          SubLObject _prev_bind_0_$221;
          SubLObject before_node_$222;
          SubLObject before_date_$223;
          SubLObject before_tag_$224;
          SubLObject after_doneP;
          SubLObject csome_list_var_$225;
          SubLObject after_depth;
          SubLObject after_node;
          SubLObject after_date;
          SubLObject after_tag;
          SubLObject _prev_bind_0_$222;
          SubLObject after_node_$227;
          SubLObject after_date_$228;
          SubLObject after_tag_$229;
          SubLObject _prev_bind_0_$223;
          SubLObject _prev_bind_3;
          SubLObject _prev_bind_0_$224;
          SubLObject _prev_bind_0_$225;
          SubLObject supports;
          SubLObject _prev_bind_0_$226;
          SubLObject _prev_bind_0_$227;
          SubLObject _prev_bind_0_$228;
          for( csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue(), before_depth = NIL, before_depth = csome_list_var.first(); NIL == before_doneP && NIL != csome_list_var; before_doneP = makeBoolean(
              NIL != just || before_depth.eql( depth ) ), csome_list_var = csome_list_var.rest(), before_depth = csome_list_var.first() )
          {
            before_node = NIL;
            before_date = NIL;
            before_tag = NIL;
            _prev_bind_0_$221 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
            try
            {
              sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
              thread.resetMultipleValues();
              before_node_$222 = sbhl_time_dates.sbhl_time_date_find_search_node( before, mt, before_depth );
              before_date_$223 = thread.secondMultipleValue();
              before_tag_$224 = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              before_node = before_node_$222;
              before_date = before_date_$223;
              before_tag = before_tag_$224;
            }
            finally
            {
              sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_0_$221, thread );
            }
            if( NIL != before_date )
            {
              after_doneP = NIL;
              if( NIL == after_doneP )
              {
                for( csome_list_var_$225 = $sbhl_time_precedes_depths$.getGlobalValue(), after_depth = NIL, after_depth = csome_list_var_$225.first(); NIL == after_doneP
                    && NIL != csome_list_var_$225; after_doneP = makeBoolean( NIL != just || after_depth.eql( depth ) ), csome_list_var_$225 = csome_list_var_$225.rest(), after_depth = csome_list_var_$225.first() )
                {
                  after_node = NIL;
                  after_date = NIL;
                  after_tag = NIL;
                  _prev_bind_0_$222 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  try
                  {
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                    thread.resetMultipleValues();
                    after_node_$227 = sbhl_time_dates.sbhl_time_date_find_search_node( after, mt, after_depth );
                    after_date_$228 = thread.secondMultipleValue();
                    after_tag_$229 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    after_node = after_node_$227;
                    after_date = after_date_$228;
                    after_tag = after_tag_$229;
                  }
                  finally
                  {
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_0_$222, thread );
                  }
                  if( NIL != after_date && NIL != ( Numbers.add( new SubLObject[] { depth, Numbers.minus( before_depth ), Numbers.minus( after_depth ), sbhl_marking_utilities.sbhl_temporal_tag_increment( before_tag ),
                    sbhl_marking_utilities.sbhl_temporal_tag_increment( after_tag )
                  } ).isNegative() ? sbhl_time_dates.sbhl_dateL( before_date, after_date ) : sbhl_time_dates.sbhl_dateLE( before_date, after_date ) ) )
                  {
                    if( !before.eql( before_node ) )
                    {
                      _prev_bind_0_$223 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding( thread );
                      _prev_bind_3 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding( thread );
                      try
                      {
                        sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind( NIL, thread );
                        sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind( NIL, thread );
                        assert NIL != Types.integerp( before_depth ) : before_depth;
                        _prev_bind_0_$224 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
                        try
                        {
                          sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( before_depth, thread );
                          just = why_sbhl_time_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), before, before_node, mt, UNPROVIDED, UNPROVIDED );
                        }
                        finally
                        {
                          sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$224, thread );
                        }
                      }
                      finally
                      {
                        sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind( _prev_bind_3, thread );
                        sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind( _prev_bind_0_$223, thread );
                      }
                    }
                    _prev_bind_0_$225 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    try
                    {
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                      supports = sbhl_time_dates.sbhl_time_date_node_date_link_supports( before_node, before_tag, before_date, mt );
                      if( NIL != supports )
                      {
                        just = ConsesLow.append( just, supports );
                      }
                    }
                    finally
                    {
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_0_$225, thread );
                    }
                    _prev_bind_0_$226 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    try
                    {
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                      supports = sbhl_time_dates.sbhl_time_date_date_node_link_supports( after_date, after_tag, after_node, mt );
                      if( NIL != supports )
                      {
                        just = ConsesLow.append( just, supports );
                      }
                    }
                    finally
                    {
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_0_$226, thread );
                    }
                    if( !after_node.eql( after ) )
                    {
                      _prev_bind_0_$227 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding( thread );
                      _prev_bind_3 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding( thread );
                      try
                      {
                        sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind( NIL, thread );
                        sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind( NIL, thread );
                        assert NIL != Types.integerp( after_depth ) : after_depth;
                        _prev_bind_0_$228 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding( thread );
                        try
                        {
                          sbhl_time_vars.$sbhl_temporality_succession_depth$.bind( after_depth, thread );
                          just = ConsesLow.append( just, why_sbhl_time_predicate_relation_p( sbhl_module_vars.get_sbhl_module( $const1$weak_HL_TimePrecedence ), after_node, after, mt, UNPROVIDED, UNPROVIDED ) );
                        }
                        finally
                        {
                          sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind( _prev_bind_0_$228, thread );
                        }
                      }
                      finally
                      {
                        sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind( _prev_bind_3, thread );
                        sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind( _prev_bind_0_$227, thread );
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      finally
      {
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
      }
    }
    return list_utilities.fast_delete_duplicates( just, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-search.lisp", position = 32589L)
  public static SubLObject why_sbhl_time_predicate_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( behavior == UNPROVIDED )
    {
      behavior = NIL;
    }
    return list_utilities.fast_delete_duplicates( Functions.apply( Symbols.symbol_function( $sym34$APPEND ), sbhl_search_methods.why_sbhl_predicate_relation_p( module, node1, node2, mt, tv, behavior ) ), Symbols
        .symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_sbhl_time_search_file()
  {
    SubLFiles.declareFunction( me, "add_precedence_link", "ADD-PRECEDENCE-LINK", 4, 0, false );
    SubLFiles.declareFunction( me, "remove_precedence_link", "REMOVE-PRECEDENCE-LINK", 4, 0, false );
    SubLFiles.declareFunction( me, "weakly_precedesP", "WEAKLY-PRECEDES?", 2, 1, false );
    SubLFiles.declareFunction( me, "strictly_precedesP", "STRICTLY-PRECEDES?", 2, 1, false );
    SubLFiles.declareFunction( me, "weakly_precedes_successorP", "WEAKLY-PRECEDES-SUCCESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "successor_strictly_precedesP", "SUCCESSOR-STRICTLY-PRECEDES?", 2, 1, false );
    SubLFiles.declareFunction( me, "weakly_precedes_successors_successorP", "WEAKLY-PRECEDES-SUCCESSORS-SUCCESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "weakly_precedes_successors_successors_successorP", "WEAKLY-PRECEDES-SUCCESSORS-SUCCESSORS-SUCCESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "successors_successor_strictly_precedesP", "SUCCESSORS-SUCCESSOR-STRICTLY-PRECEDES?", 2, 1, false );
    SubLFiles.declareFunction( me, "coordinateP", "COORDINATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "successorP", "SUCCESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "predecessorP", "PREDECESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "successors_successorP", "SUCCESSORS-SUCCESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "precedesP_date_before", "PRECEDES?-DATE-BEFORE", 4, 0, false );
    SubLFiles.declareFunction( me, "precedesP_date_after", "PRECEDES?-DATE-AFTER", 4, 0, false );
    SubLFiles.declareFunction( me, "precedesP_node_date", "PRECEDES?-NODE-DATE", 4, 0, false );
    SubLFiles.declareFunction( me, "precedesP_node_node", "PRECEDES?-NODE-NODE", 4, 0, false );
    SubLFiles.declareFunction( me, "all_weakly_precedes", "ALL-WEAKLY-PRECEDES", 1, 1, false );
    SubLFiles.declareFunction( me, "all_weakly_precedes_inverse", "ALL-WEAKLY-PRECEDES-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "all_strictly_precedes", "ALL-STRICTLY-PRECEDES", 1, 1, false );
    SubLFiles.declareFunction( me, "all_strictly_precedes_inverse", "ALL-STRICTLY-PRECEDES-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "all_weakly_precedes_successor", "ALL-WEAKLY-PRECEDES-SUCCESSOR", 1, 1, false );
    SubLFiles.declareFunction( me, "all_weakly_precedes_successor_inverse", "ALL-WEAKLY-PRECEDES-SUCCESSOR-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "all_successor_strictly_precedes", "ALL-SUCCESSOR-STRICTLY-PRECEDES", 1, 1, false );
    SubLFiles.declareFunction( me, "all_successor_strictly_precedes_inverse", "ALL-SUCCESSOR-STRICTLY-PRECEDES-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "all_weakly_precedes_successors_successor", "ALL-WEAKLY-PRECEDES-SUCCESSORS-SUCCESSOR", 1, 1, false );
    SubLFiles.declareFunction( me, "all_weakly_precedes_successors_successor_inverse", "ALL-WEAKLY-PRECEDES-SUCCESSORS-SUCCESSOR-INVERSE", 1, 1, false );
    SubLFiles.declareFunction( me, "all_forward_precedes_date", "ALL-FORWARD-PRECEDES-DATE", 3, 0, false );
    SubLFiles.declareFunction( me, "all_backward_precedes_date", "ALL-BACKWARD-PRECEDES-DATE", 3, 0, false );
    SubLFiles.declareFunction( me, "all_forward_precedes_node", "ALL-FORWARD-PRECEDES-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "all_backward_precedes_node", "ALL-BACKWARD-PRECEDES-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "all_precedes_date", "ALL-PRECEDES-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "all_precedes_node", "ALL-PRECEDES-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "all_coordinate", "ALL-COORDINATE", 1, 1, false );
    SubLFiles.declareFunction( me, "all_successors", "ALL-SUCCESSORS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_predecessors", "ALL-PREDECESSORS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_successors_successors", "ALL-SUCCESSORS-SUCCESSORS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_predecessors_predecessors", "ALL-PREDECESSORS-PREDECESSORS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_between", "ALL-BETWEEN", 4, 1, false );
    SubLFiles.declareFunction( me, "sbhl_temporality_all_forward_nodes_between", "SBHL-TEMPORALITY-ALL-FORWARD-NODES-BETWEEN", 4, 2, false );
    SubLFiles.declareFunction( me, "sbhl_temporality_all_backward_nodes_between", "SBHL-TEMPORALITY-ALL-BACKWARD-NODES-BETWEEN", 4, 2, false );
    SubLFiles.declareFunction( me, "sbhl_temporality_all_nodes_accessed_between", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN", 3, 1, false );
    SubLFiles.declareFunction( me, "sbhl_temporality_all_nodes_accessed_between_dates", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN-DATES", 4, 0, false );
    SubLFiles.declareFunction( me, "sbhl_temporality_all_nodes_accessed_between_dates_int", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN-DATES-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "sbhl_temporality_all_nodes_accessed_between_date_node", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN-DATE-NODE", 4, 0, false );
    SubLFiles.declareFunction( me, "sbhl_temporality_all_nodes_accessed_between_node_date", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN-NODE-DATE", 4, 0, false );
    SubLFiles.declareFunction( me, "sbhl_temporality_all_nodes_accessed_between_nodes", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN-NODES", 4, 0, false );
    SubLFiles.declareFunction( me, "why_weakly_precedesP", "WHY-WEAKLY-PRECEDES?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_strictly_precedesP", "WHY-STRICTLY-PRECEDES?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_weakly_precedes_successorP", "WHY-WEAKLY-PRECEDES-SUCCESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_successor_strictly_precedesP", "WHY-SUCCESSOR-STRICTLY-PRECEDES?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_weakly_precedes_successors_successorP", "WHY-WEAKLY-PRECEDES-SUCCESSORS-SUCCESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_weakly_precedes_successors_successors_successorP", "WHY-WEAKLY-PRECEDES-SUCCESSORS-SUCCESSORS-SUCCESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_successors_successor_strictly_precedesP", "WHY-SUCCESSORS-SUCCESSOR-STRICTLY-PRECEDES?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_coordinateP", "WHY-COORDINATE?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_successorP", "WHY-SUCCESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_predecessorP", "WHY-PREDECESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_successors_successorP", "WHY-SUCCESSORS-SUCCESSOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_precedesP_date_before", "WHY-PRECEDES?-DATE-BEFORE", 4, 0, false );
    SubLFiles.declareFunction( me, "why_precedesP_date_after", "WHY-PRECEDES?-DATE-AFTER", 4, 0, false );
    SubLFiles.declareFunction( me, "why_precedesP_node_date", "WHY-PRECEDES?-NODE-DATE", 4, 0, false );
    SubLFiles.declareFunction( me, "why_precedesP_node_node", "WHY-PRECEDES?-NODE-NODE", 4, 0, false );
    SubLFiles.declareFunction( me, "why_sbhl_time_predicate_relation_p", "WHY-SBHL-TIME-PREDICATE-RELATION-P", 3, 3, false );
    return NIL;
  }

  public static SubLObject init_sbhl_time_search_file()
  {
    $sbhl_time_precedes_depths$ = SubLFiles.deflexical( "*SBHL-TIME-PRECEDES-DEPTHS*", $list22 );
    return NIL;
  }

  public static SubLObject setup_sbhl_time_search_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sbhl_time_search_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sbhl_time_search_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sbhl_time_search_file();
  }
  static
  {
    me = new sbhl_time_search();
    $sbhl_time_precedes_depths$ = null;
    $kw0$WEAK = makeKeyword( "WEAK" );
    $const1$weak_HL_TimePrecedence = constant_handles.reader_make_constant_shell( makeString( "weak-HL-TimePrecedence" ) );
    $const2$MonotonicallyTrue = constant_handles.reader_make_constant_shell( makeString( "MonotonicallyTrue" ) );
    $kw3$STRICT = makeKeyword( "STRICT" );
    $const4$strict_HL_TimePrecedence = constant_handles.reader_make_constant_shell( makeString( "strict-HL-TimePrecedence" ) );
    $kw5$WEAK_SUCCESSOR = makeKeyword( "WEAK-SUCCESSOR" );
    $const6$weakSuccessor_HL_TimePrecedence = constant_handles.reader_make_constant_shell( makeString( "weakSuccessor-HL-TimePrecedence" ) );
    $kw7$SUCCESSOR_STRICT = makeKeyword( "SUCCESSOR-STRICT" );
    $const8$successorStrict_HL_TimePrecedence = constant_handles.reader_make_constant_shell( makeString( "successorStrict-HL-TimePrecedence" ) );
    $int9$_2 = makeInteger( -2 );
    $int10$_3 = makeInteger( -3 );
    $sym11$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw12$ERROR = makeKeyword( "ERROR" );
    $str13$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym14$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw15$CERROR = makeKeyword( "CERROR" );
    $str16$continue_anyway = makeString( "continue anyway" );
    $kw17$WARN = makeKeyword( "WARN" );
    $str18$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const19$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $kw20$OLD = makeKeyword( "OLD" );
    $kw21$RESOURCE = makeKeyword( "RESOURCE" );
    $list22 = ConsesLow.list( ZERO_INTEGER, MINUS_ONE_INTEGER, makeInteger( -2 ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER );
    $sym23$INTEGERP = makeSymbol( "INTEGERP" );
    $sym24$SBHL_PUSH_ONTO_RESULT = makeSymbol( "SBHL-PUSH-ONTO-RESULT" );
    $list25 = ConsesLow.list( makeSymbol( "LINK0" ), makeSymbol( "LINK1" ) );
    $list26 = ConsesLow.list( makeSymbol( "DATE-TAG" ), makeSymbol( "DATE-MT" ), makeSymbol( "LINK-DATE" ), makeSymbol( "&OPTIONAL" ), makeUninternedSymbol( "LINK-SUPPORTS" ) );
    $list27 = ConsesLow.list( makeSymbol( "NODE-TAG" ), makeSymbol( "NODE-MT" ), makeSymbol( "NODE" ), makeSymbol( "&OPTIONAL" ), makeUninternedSymbol( "LINK-SUPPORTS" ) );
    $list28 = ConsesLow.list( makeSymbol( "LINK0" ), makeSymbol( "LINK1" ), makeSymbol( "LINK2" ) );
    $list29 = ConsesLow.list( makeSymbol( "DATE-TAG" ), makeSymbol( "DATE-MT" ), makeSymbol( "DATE-DATE" ), makeSymbol( "&OPTIONAL" ), makeUninternedSymbol( "LINK-SUPPORTS" ) );
    $list30 = ConsesLow.list( makeSymbol( "INT-TAG" ), makeSymbol( "INT-MT" ), makeSymbol( "INT-DATE" ), makeSymbol( "&OPTIONAL" ), makeUninternedSymbol( "LINK-SUPPORTS" ) );
    $list31 = ConsesLow.list( makeSymbol( "LINK-TAG" ), makeSymbol( "LINK-MT" ), makeSymbol( "LINK-NODE" ), makeSymbol( "&OPTIONAL" ), makeUninternedSymbol( "LINK-SUPPORTS" ) );
    $sym32$SBHL_MODULE_P = makeSymbol( "SBHL-MODULE-P" );
    $list33 = ConsesLow.list( makeSymbol( "DATE-TAG" ), makeSymbol( "DATE-MT" ), makeSymbol( "DATE" ), makeSymbol( "&OPTIONAL" ), makeUninternedSymbol( "LINK-SUPPORTS" ) );
    $sym34$APPEND = makeSymbol( "APPEND" );
  }
}
/*
 * 
 * Total time: 1616 ms
 * 
 */