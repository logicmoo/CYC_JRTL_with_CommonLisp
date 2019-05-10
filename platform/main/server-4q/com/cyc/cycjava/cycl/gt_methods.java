package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_methods
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.gt_methods";
  public static final String myFingerPrint = "b753115119880742b6b17becdd2cc8fb58ca512b4fa1c02baf5a31c2d4a4c982";
  private static final SubLSymbol $sym0$FORT_P;
  private static final SubLSymbol $sym1$GT_TERM_P;
  private static final SubLSymbol $kw2$SUPERIORS;
  private static final SubLSymbol $sym3$GT_SUPERIORS;
  private static final SubLList $list4;
  private static final SubLString $str5$Returns_direct_superiors_of_FORT_;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$GT_ERROR;
  private static final SubLSymbol $kw9$GT_INDEX;
  private static final SubLSymbol $kw10$SUPERIOR;
  private static final SubLString $str11$invalid_gt_mode___a;
  private static final SubLSymbol $kw12$TRUE;
  private static final SubLSymbol $sym13$TRUTH_P;
  private static final SubLSymbol $kw14$MIN_SUPERIORS;
  private static final SubLSymbol $sym15$GT_MIN_SUPERIORS;
  private static final SubLString $str16$Returns_minimal_superiors_of_FORT;
  private static final SubLSymbol $kw17$INFERIORS;
  private static final SubLSymbol $sym18$GT_INFERIORS;
  private static final SubLString $str19$Returns_direct_inferiors_of_FORT_;
  private static final SubLSymbol $kw20$GT_GATHER;
  private static final SubLSymbol $kw21$INFERIOR;
  private static final SubLSymbol $kw22$MAX_INFERIORS;
  private static final SubLSymbol $sym23$GT_MAX_INFERIORS;
  private static final SubLString $str24$Returns_maximal_inferiors_of_FORT;
  private static final SubLSymbol $kw25$CO_SUPERIORS;
  private static final SubLSymbol $sym26$GT_CO_SUPERIORS;
  private static final SubLString $str27$Returns_sibling_direct_superiors_;
  private static final SubLSymbol $kw28$CO_INFERIORS;
  private static final SubLSymbol $sym29$GT_CO_INFERIORS;
  private static final SubLString $str30$Returns_sibling_direct_inferiors_;
  private static final SubLSymbol $kw31$REDUNDANT_SUPERIORS;
  private static final SubLSymbol $sym32$GT_REDUNDANT_SUPERIORS;
  private static final SubLString $str33$Returns_direct_superiors_of_FORT_;
  private static final SubLSymbol $kw34$REDUNDANT_INFERIORS;
  private static final SubLSymbol $sym35$GT_REDUNDANT_INFERIORS;
  private static final SubLString $str36$Returns_direct_inferiors_of_FORT_;
  private static final SubLSymbol $kw37$ALL_SUPERIORS;
  private static final SubLSymbol $sym38$GT_ALL_SUPERIORS;
  private static final SubLString $str39$Returns_all_superiors_of_FORT_via;
  private static final SubLSymbol $kw40$ALL_INFERIORS;
  private static final SubLSymbol $sym41$GT_ALL_INFERIORS;
  private static final SubLString $str42$Returns_all_inferiors_of_FORT_via;
  private static final SubLSymbol $kw43$UNION_ALL_INFERIORS;
  private static final SubLSymbol $kw44$ALL_ACCESSIBLE;
  private static final SubLSymbol $sym45$GT_ALL_ACCESSIBLE;
  private static final SubLString $str46$Returns_all_superiors_and_all_inf;
  private static final SubLSymbol $kw47$GT_EITHER;
  private static final SubLSymbol $kw48$ACCESSIBLE;
  private static final SubLSymbol $kw49$ROOTS;
  private static final SubLSymbol $sym50$GT_ROOTS;
  private static final SubLString $str51$Returns_maximal_superiors__i_e___;
  private static final SubLSymbol $kw52$LEAVES;
  private static final SubLSymbol $sym53$GT_LEAVES;
  private static final SubLString $str54$Returns_minimal_inferiors__i_e___;
  private static final SubLSymbol $sym55$CONS;
  private static final SubLSymbol $sym56$FUNCTION_SPEC_P;
  private static final SubLSymbol $kw57$COMPOSE_FN_SUPERIORS;
  private static final SubLSymbol $sym58$GT_COMPOSE_FN_ALL_SUPERIORS;
  private static final SubLList $list59;
  private static final SubLString $str60$Apply_fn_to_each_superior_of_FORT;
  private static final SubLList $list61;
  private static final SubLSymbol $kw62$COMPOSE_FN_INFERIORS;
  private static final SubLSymbol $sym63$GT_COMPOSE_FN_ALL_INFERIORS;
  private static final SubLList $list64;
  private static final SubLString $str65$Apply_fn_to_each_inferior_of_FORT;
  private static final SubLSymbol $sym66$PREDICATE_IN_ANY_MT_;
  private static final SubLSymbol $kw67$COMPOSE_PRED_SUPERIORS;
  private static final SubLSymbol $sym68$GT_COMPOSE_PRED_ALL_SUPERIORS;
  private static final SubLList $list69;
  private static final SubLString $str70$Returns_all_nodes_accessible_by_C;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$FIXNUMP;
  private static final SubLSymbol $kw73$COMPOSE_PRED_INFERIORS;
  private static final SubLSymbol $sym74$GT_COMPOSE_PRED_ALL_INFERIORS;
  private static final SubLString $str75$Returns_all_nodes_accessible_by_C;
  private static final SubLSymbol $kw76$ALL_DEPENDENT_INFERIORS;
  private static final SubLSymbol $sym77$GT_ALL_DEPENDENT_INFERIORS;
  private static final SubLString $str78$Returns_all_inferiors_i_of_FORT_s;
  private static final SubLSymbol $kw79$BOOLEAN_;
  private static final SubLSymbol $kw80$SUPERIOR_;
  private static final SubLSymbol $kw81$WHY_SUPERIOR_;
  private static final SubLSymbol $sym82$GT_WHY_SUPERIOR_;
  private static final SubLList $list83;
  private static final SubLString $str84$Returns_justification_of_why_SUPE;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $kw87$REFLEXIVE;
  private static final SubLSymbol $kw88$GENLPREDS;
  private static final SubLObject $const89$genlInverse;
  private static final SubLObject $const90$genlPreds;
  private static final SubLSymbol $kw91$INFERIOR_;
  private static final SubLSymbol $kw92$HAS_SUPERIOR_;
  private static final SubLSymbol $sym93$GT_HAS_SUPERIOR_;
  private static final SubLList $list94;
  private static final SubLString $str95$Returns_whetherfort_INFERIOR_is_h;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$GT_HAS_INFERIOR_;
  private static final SubLString $str99$Returns_whether_fort_SUPERIOR_is_;
  private static final SubLSymbol $kw100$GATHER_INFERIOR;
  private static final SubLSymbol $kw101$GATHER_SUPERIOR;
  private static final SubLSymbol $kw102$CYCLES_;
  private static final SubLSymbol $sym103$GT_CYCLES_;
  private static final SubLString $str104$Returns_whether_FORT_is_accessibl;
  private static final SubLSymbol $kw105$COMPLETES_CYCLE_;
  private static final SubLSymbol $sym106$GT_COMPLETES_CYCLE_;
  private static final SubLList $list107;
  private static final SubLString $str108$Returns_whether_a_transitive_path;
  private static final SubLList $list109;
  private static final SubLSymbol $kw110$WHY_COMPLETES_CYCLE_;
  private static final SubLSymbol $sym111$GT_WHY_COMPLETES_CYCLE_;
  private static final SubLString $str112$Returns_justification_that_a_tran;
  private static final SubLSymbol $sym113$LISTP;
  private static final SubLSymbol $kw114$MIN_NODES;
  private static final SubLSymbol $sym115$GT_MIN_NODES;
  private static final SubLList $list116;
  private static final SubLString $str117$Returns_returns_the_most_subordin;
  private static final SubLList $list118;
  private static final SubLSymbol $sym119$GT_SEARCHED_;
  private static final SubLSymbol $kw120$MAX_NODES;
  private static final SubLSymbol $sym121$GT_MAX_NODES;
  private static final SubLList $list122;
  private static final SubLString $str123$Returns_returns_the_least_subordi;
  private static final SubLSymbol $kw124$UP;
  private static final SubLSymbol $kw125$DOWN;
  private static final SubLSymbol $sym126$GETHASH;
  private static final SubLSymbol $sym127$MEMBER_;
  private static final SubLSymbol $kw128$MIN_CEILINGS;
  private static final SubLSymbol $sym129$GT_MIN_CEILINGS;
  private static final SubLList $list130;
  private static final SubLString $str131$Returns_the_most_subordinate_comm;
  private static final SubLInteger $int132$128;
  private static final SubLSymbol $kw133$MAX_FLOORS;
  private static final SubLSymbol $sym134$GT_MAX_FLOORS;
  private static final SubLString $str135$Returns_the_least_subordinate_ele;
  private static final SubLSymbol $kw136$MIN_SUPERIORS_EXCLUDING;
  private static final SubLSymbol $sym137$GT_MIN_SUPERIORS_EXCLUDING;
  private static final SubLString $str138$Returns_least_general_superiors_o;
  private static final SubLSymbol $kw139$MAX_INFERIORS_EXCLUDING;
  private static final SubLSymbol $sym140$GT_MAX_INFERIORS_EXCLUDING;
  private static final SubLString $str141$Returns_most_general_inferiors_of;
  private static final SubLSymbol $kw142$ALL_SUPERIOR_EDGES;
  private static final SubLSymbol $kw143$ALL_INFERIOR_EDGES;
  private static final SubLSymbol $kw144$ALL_PATHS;
  private static final SubLSymbol $kw145$SUPERIOR_IN_WHAT_MTS;
  private static final SubLSymbol $kw146$HIERARCHICALLY_DIRECT;
  private static final SubLString $str147$illegal_value_for_method_of_which;
  private static final SubLSymbol $sym148$RELEVANT_MT_IS_ANY_MT;
  private static final SubLObject $const149$InferencePSC;
  private static final SubLSymbol $kw150$INFERIORS_WITH_MTS;
  private static final SubLSymbol $sym151$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const152$EverythingPSC;
  private static final SubLObject $const153$genls;
  private static final SubLString $str154$before_gathering_instances;
  private static final SubLSymbol $sym155$ADD_RESULT_TO_GT_RESULT;
  private static final SubLObject $const156$isa;
  private static final SubLString $str157$after_instances__before_maximin;
  private static final SubLString $str158$after_maximin;
  private static final SubLObject $const159$genlMt;
  private static final SubLSymbol $kw160$ANY_SUPERIOR_PATH;
  private static final SubLSymbol $sym161$GT_ANY_SUPERIOR_PATH;
  private static final SubLString $str162$Returns_list_of_nodes_connecting_;

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 390L)
  public static SubLObject gt_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw2$SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 824L)
  public static SubLObject gtm_superiors(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject superiors = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
        }
        final SubLObject _prev_bind_0_$1 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$2 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            superiors = gt_search.gt_link_values( fort );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$1, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return superiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 1158L)
  public static SubLObject gt_min_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw14$MIN_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 1677L)
  public static SubLObject gtm_min_superiors(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return gtm_min_nodes( gtm_superiors( fort, mt ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 1824L)
  public static SubLObject gt_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw17$INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 2141L)
  public static SubLObject gtm_inferiors(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject inferiors = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
        }
        final SubLObject _prev_bind_0_$3 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$4 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            inferiors = gt_search.gt_link_values( fort );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$4, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$3, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return inferiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 2476L)
  public static SubLObject gt_max_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw22$MAX_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 2995L)
  public static SubLObject gtm_max_inferiors(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return gtm_max_nodes( gtm_inferiors( fort, mt ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 3142L)
  public static SubLObject gt_co_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw25$CO_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 3611L)
  public static SubLObject gtm_co_superiors(final SubLObject fort, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = $kw12$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject co_superiors = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
        }
        final SubLObject _prev_bind_0_$5 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
          assert NIL != enumeration_types.truth_p( tv ) : tv;
          final SubLObject _prev_bind_0_$6 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( tv, thread );
            co_superiors = Sequences.remove( fort, gtm_min_nodes( gt_search.gt_siblings( fort ), UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$6, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$5, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return co_superiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 4038L)
  public static SubLObject gt_co_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw28$CO_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 4508L)
  public static SubLObject gtm_co_inferiors(final SubLObject fort, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = $kw12$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject co_inferiors = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
        }
        final SubLObject _prev_bind_0_$7 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
          assert NIL != enumeration_types.truth_p( tv ) : tv;
          final SubLObject _prev_bind_0_$8 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( tv, thread );
            co_inferiors = Sequences.remove( fort, gtm_max_nodes( gt_search.gt_siblings( fort ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$8, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$7, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return co_inferiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 4935L)
  public static SubLObject gt_redundant_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw31$REDUNDANT_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 5330L)
  public static SubLObject gtm_redundant_superiors(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject redundants = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
        }
        final SubLObject _prev_bind_0_$9 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
          final SubLObject superiors = gt_search.gt_link_values( fort );
          redundants = conses_high.set_difference( superiors, gtm_min_nodes( superiors, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$9, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return redundants;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 5768L)
  public static SubLObject gt_redundant_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw34$REDUNDANT_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 6156L)
  public static SubLObject gtm_redundant_inferiors(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject redundants = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
        }
        final SubLObject _prev_bind_0_$10 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
          final SubLObject inferiors = gt_search.gt_link_values( fort );
          redundants = conses_high.set_difference( inferiors, gtm_max_nodes( inferiors, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$10, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return redundants;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 6597L)
  public static SubLObject gt_all_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw37$ALL_SUPERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 6923L)
  public static SubLObject gtm_all_superiors(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject superiors = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
        }
        final SubLObject _prev_bind_0_$11 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$12 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            superiors = gt_search.gt_all_accessed( fort );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$12, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$11, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return superiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 7279L)
  public static SubLObject gt_all_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw40$ALL_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 7605L)
  public static SubLObject gtm_all_inferiors(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject inferiors = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
        }
        final SubLObject _prev_bind_0_$13 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$14 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            inferiors = gt_search.gt_all_accessed( fort );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$14, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$13, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return inferiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 7943L)
  public static SubLObject gt_union_all_inferiors(final SubLObject predicate, final SubLObject v_forts, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return transitivity.gtm( predicate, $kw43$UNION_ALL_INFERIORS, v_forts, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 8147L)
  public static SubLObject gtm_union_all_inferiors(final SubLObject v_forts, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject inferiors = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
      {
        Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
      }
      final SubLObject _prev_bind_0_$15 = gt_vars.$gt_mode$.currentBinding( thread );
      try
      {
        gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
        assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
        final SubLObject _prev_bind_0_$16 = gt_vars.$gt_truth$.currentBinding( thread );
        try
        {
          gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
          SubLObject cdolist_list_var = v_forts;
          SubLObject fort = NIL;
          fort = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            gt_search.gt_mark_all_accessed_as_searched( fort );
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
          }
        }
        finally
        {
          gt_vars.$gt_truth$.rebind( _prev_bind_0_$16, thread );
        }
      }
      finally
      {
        gt_vars.$gt_mode$.rebind( _prev_bind_0_$15, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    inferiors = hash_table_utilities.hash_table_keys( gt_vars.$gt_marking_table$.getDynamicValue( thread ) );
    return inferiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 8483L)
  public static SubLObject gt_all_accessible(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw44$ALL_ACCESSIBLE, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 8964L)
  public static SubLObject gtm_all_accessible(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject accessed = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw47$GT_EITHER, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw48$ACCESSIBLE ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw48$ACCESSIBLE );
        }
        final SubLObject _prev_bind_0_$17 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw48$ACCESSIBLE, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$18 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            accessed = list_utilities.remove_duplicate_forts( gt_search.gt_all_accessed( fort ) );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$18, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$17, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return accessed;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 9340L)
  public static SubLObject gt_roots(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw49$ROOTS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 9709L)
  public static SubLObject gtm_roots(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject superiors = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
        }
        final SubLObject _prev_bind_0_$19 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$20 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            superiors = gt_search.gt_extremal_accessed( fort );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$20, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$19, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return superiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 10087L)
  public static SubLObject gt_leaves(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw52$LEAVES, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 10418L)
  public static SubLObject gtm_leaves(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject inferiors = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
        }
        final SubLObject _prev_bind_0_$21 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$22 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            inferiors = gt_search.gt_extremal_accessed( fort );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$22, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$21, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return inferiors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 10799L)
  public static SubLObject gt_compose_fn_all_superiors(final SubLObject predicate, final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt)
  {
    if( combine_fn == UNPROVIDED )
    {
      combine_fn = Symbols.symbol_function( $sym55$CONS );
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    enforceType( fn, $sym56$FUNCTION_SPEC_P );
    return transitivity.gtm( predicate, $kw57$COMPOSE_FN_SUPERIORS, fort, fn, combine_fn, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 11327L)
  public static SubLObject gtm_compose_fn_all_superiors(final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt)
  {
    if( combine_fn == UNPROVIDED )
    {
      combine_fn = Symbols.symbol_function( $sym55$CONS );
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
        }
        final SubLObject _prev_bind_0_$23 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$24 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            result = gt_search.gt_compose_fn_all_accessed( fort, fn, combine_fn );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$24, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$23, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 11811L)
  public static SubLObject gt_compose_fn_all_inferiors(final SubLObject predicate, final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt)
  {
    if( combine_fn == UNPROVIDED )
    {
      combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    enforceType( fn, $sym56$FUNCTION_SPEC_P );
    return transitivity.gtm( predicate, $kw62$COMPOSE_FN_INFERIORS, fort, fn, combine_fn, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 12316L)
  public static SubLObject gtm_compose_fn_all_inferiors(final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt)
  {
    if( combine_fn == UNPROVIDED )
    {
      combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
        }
        final SubLObject _prev_bind_0_$25 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$26 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            result = gt_search.gt_compose_fn_all_accessed( fort, fn, combine_fn );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$26, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$25, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 12811L)
  public static SubLObject gt_compose_pred_all_superiors(final SubLObject predicate, final SubLObject fort, final SubLObject compose_pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt)
  {
    if( compose_index_arg == UNPROVIDED )
    {
      compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
    }
    if( compose_gather_arg == UNPROVIDED )
    {
      compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    enforceType( compose_pred, $sym66$PREDICATE_IN_ANY_MT_ );
    return transitivity.gtm( predicate, $kw67$COMPOSE_PRED_SUPERIORS, fort, compose_pred, compose_index_arg, compose_gather_arg, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 13488L)
  public static SubLObject gtm_compose_pred_all_superiors(final SubLObject fort, final SubLObject pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt)
  {
    if( compose_index_arg == UNPROVIDED )
    {
      compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
    }
    if( compose_gather_arg == UNPROVIDED )
    {
      compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
        }
        final SubLObject _prev_bind_0_$27 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$28 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            assert NIL != Types.fixnump( compose_index_arg ) : compose_index_arg;
            final SubLObject _prev_bind_0_$29 = gt_vars.$gt_compose_index_arg$.currentBinding( thread );
            try
            {
              gt_vars.$gt_compose_index_arg$.bind( compose_index_arg, thread );
              assert NIL != Types.fixnump( compose_gather_arg ) : compose_gather_arg;
              final SubLObject _prev_bind_0_$30 = gt_vars.$gt_compose_gather_arg$.currentBinding( thread );
              try
              {
                gt_vars.$gt_compose_gather_arg$.bind( compose_gather_arg, thread );
                result = gt_search.gt_compose_pred_all_accessed( fort, pred );
              }
              finally
              {
                gt_vars.$gt_compose_gather_arg$.rebind( _prev_bind_0_$30, thread );
              }
            }
            finally
            {
              gt_vars.$gt_compose_index_arg$.rebind( _prev_bind_0_$29, thread );
            }
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$28, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$27, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 14092L)
  public static SubLObject gt_compose_pred_all_inferiors(final SubLObject predicate, final SubLObject fort, final SubLObject compose_pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt)
  {
    if( compose_index_arg == UNPROVIDED )
    {
      compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
    }
    if( compose_gather_arg == UNPROVIDED )
    {
      compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    enforceType( compose_pred, $sym66$PREDICATE_IN_ANY_MT_ );
    return transitivity.gtm( predicate, $kw73$COMPOSE_PRED_INFERIORS, fort, compose_pred, compose_index_arg, compose_gather_arg, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 14768L)
  public static SubLObject gtm_compose_pred_all_inferiors(final SubLObject fort, final SubLObject pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt)
  {
    if( compose_index_arg == UNPROVIDED )
    {
      compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
    }
    if( compose_gather_arg == UNPROVIDED )
    {
      compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
        }
        final SubLObject _prev_bind_0_$31 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$32 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            assert NIL != Types.fixnump( compose_index_arg ) : compose_index_arg;
            final SubLObject _prev_bind_0_$33 = gt_vars.$gt_compose_index_arg$.currentBinding( thread );
            try
            {
              gt_vars.$gt_compose_index_arg$.bind( compose_index_arg, thread );
              assert NIL != Types.fixnump( compose_gather_arg ) : compose_gather_arg;
              final SubLObject _prev_bind_0_$34 = gt_vars.$gt_compose_gather_arg$.currentBinding( thread );
              try
              {
                gt_vars.$gt_compose_gather_arg$.bind( compose_gather_arg, thread );
                result = gt_search.gt_compose_pred_all_accessed( fort, pred );
              }
              finally
              {
                gt_vars.$gt_compose_gather_arg$.rebind( _prev_bind_0_$34, thread );
              }
            }
            finally
            {
              gt_vars.$gt_compose_index_arg$.rebind( _prev_bind_0_$33, thread );
            }
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$32, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$31, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 15386L)
  public static SubLObject gt_all_dependent_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw76$ALL_DEPENDENT_INFERIORS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 15830L)
  public static SubLObject gtm_all_dependent_inferiors(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( fort, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
        }
        final SubLObject _prev_bind_0_$35 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$36 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            result = gt_search.gt_all_dependent_accessed( fort );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$36, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$35, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 16256L)
  public static SubLObject gt_booleanP(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return transitivity.gtm( predicate, $kw79$BOOLEAN_, arg1, arg2, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 16503L)
  public static SubLObject gtm_booleanP(final SubLObject arg1, final SubLObject arg2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject source = NIL;
    SubLObject target = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pcase_var = gt_vars.$gt_index_arg$.getDynamicValue( thread );
      if( pcase_var.eql( ONE_INTEGER ) )
      {
        source = arg1;
        target = arg2;
      }
      else if( pcase_var.eql( TWO_INTEGER ) )
      {
        source = arg2;
        target = arg1;
      }
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( target, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( source, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( arg1.eql( arg2 ) && NIL != kb_accessors.reflexive_predicateP( gt_vars.$gt_pred$.getDynamicValue( thread ) ) )
        {
          result = T;
        }
        else
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
          {
            Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
          }
          final SubLObject _prev_bind_0_$37 = gt_vars.$gt_mode$.currentBinding( thread );
          try
          {
            gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
            assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
            final SubLObject _prev_bind_0_$38 = gt_vars.$gt_truth$.currentBinding( thread );
            try
            {
              gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
              result = gt_search.gt_accessesP( source, target, UNPROVIDED );
            }
            finally
            {
              gt_vars.$gt_truth$.rebind( _prev_bind_0_$38, thread );
            }
          }
          finally
          {
            gt_vars.$gt_mode$.rebind( _prev_bind_0_$37, thread );
          }
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 17049L)
  public static SubLObject gt_superiorP(final SubLObject predicate, final SubLObject superior, final SubLObject inferior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return transitivity.gtm( predicate, $kw80$SUPERIOR_, superior, inferior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 17442L)
  public static SubLObject gtm_superiorP(final SubLObject genl, final SubLObject spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject superiorP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( spec, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( genl, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( genl.eql( spec ) && NIL != kb_accessors.reflexive_predicateP( gt_vars.$gt_pred$.getDynamicValue( thread ) ) )
        {
          superiorP = T;
        }
        else
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
          {
            Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
          }
          final SubLObject _prev_bind_0_$39 = gt_vars.$gt_mode$.currentBinding( thread );
          try
          {
            gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
            assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
            final SubLObject _prev_bind_0_$40 = gt_vars.$gt_truth$.currentBinding( thread );
            try
            {
              gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
              superiorP = gt_search.gt_accessesP( spec, genl, UNPROVIDED );
            }
            finally
            {
              gt_vars.$gt_truth$.rebind( _prev_bind_0_$40, thread );
            }
          }
          finally
          {
            gt_vars.$gt_mode$.rebind( _prev_bind_0_$39, thread );
          }
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return superiorP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 17950L)
  public static SubLObject gt_why_superiorP(final SubLObject predicate, final SubLObject superior, final SubLObject inferior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( superior, $sym1$GT_TERM_P );
    enforceType( inferior, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw81$WHY_SUPERIOR_, superior, inferior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 18506L)
  public static SubLObject gt_support_predicate(final SubLObject support)
  {
    return cycl_utilities.formula_operator( gt_support_sentence( support ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 18612L)
  public static SubLObject gt_support_sentence(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return assertions_high.assertion_formula( support );
    }
    if( NIL != arguments.hl_support_p( support ) )
    {
      return arguments.support_sentence( support );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 18813L)
  public static SubLObject gtm_why_superiorP(final SubLObject genl, final SubLObject spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject just = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( spec, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( genl, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( genl.eql( spec ) && NIL != kb_accessors.reflexive_predicateP( gt_vars.$gt_pred$.getDynamicValue( thread ) ) )
        {
          just = ConsesLow.list( arguments.make_hl_support( $kw87$REFLEXIVE, el_utilities.make_binary_formula( gt_vars.$gt_pred$.getDynamicValue( thread ), spec, genl ), mt, UNPROVIDED ) );
        }
        else if( NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue( thread ) )
        {
          final SubLObject gt_supports = gt_search.gt_why_accessesP( spec, genl );
          SubLObject list_var = NIL;
          SubLObject gt_support = NIL;
          SubLObject n = NIL;
          list_var = gt_supports;
          gt_support = list_var.first();
          for( n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), gt_support = list_var.first(), n = Numbers.add( ONE_INTEGER, n ) )
          {
            just = ConsesLow.cons( gt_support, just );
            final SubLObject sentence = gt_support_sentence( gt_support );
            final SubLObject pred = cycl_utilities.formula_operator( sentence );
            if( !gt_vars.$gt_pred$.getDynamicValue( thread ).eql( pred ) )
            {
              final SubLObject arg2 = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
              if( n.isZero() )
              {
                if( arg2.eql( genl ) )
                {
                  final SubLObject item_var = arguments.make_hl_support( $kw88$GENLPREDS, el_utilities.make_binary_formula( $const89$genlInverse, pred, gt_vars.$gt_pred$.getDynamicValue( thread ) ), mt, UNPROVIDED );
                  if( NIL == conses_high.member( item_var, just, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    just = ConsesLow.cons( item_var, just );
                  }
                }
                else
                {
                  final SubLObject item_var = arguments.make_hl_support( $kw88$GENLPREDS, el_utilities.make_binary_formula( $const90$genlPreds, pred, gt_vars.$gt_pred$.getDynamicValue( thread ) ), mt, UNPROVIDED );
                  if( NIL == conses_high.member( item_var, just, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    just = ConsesLow.cons( item_var, just );
                  }
                }
              }
              else
              {
                final SubLObject prev_sentence = gt_support_sentence( ConsesLow.nth( Numbers.subtract( n, ONE_INTEGER ), gt_supports ) );
                final SubLObject prev_arg2 = cycl_utilities.formula_arg2( prev_sentence, UNPROVIDED );
                if( arg2.eql( prev_arg2 ) )
                {
                  final SubLObject item_var2 = arguments.make_hl_support( $kw88$GENLPREDS, el_utilities.make_binary_formula( $const89$genlInverse, pred, gt_vars.$gt_pred$.getDynamicValue( thread ) ), mt, UNPROVIDED );
                  if( NIL == conses_high.member( item_var2, just, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    just = ConsesLow.cons( item_var2, just );
                  }
                }
                else
                {
                  final SubLObject item_var2 = arguments.make_hl_support( $kw88$GENLPREDS, el_utilities.make_binary_formula( $const90$genlPreds, pred, gt_vars.$gt_pred$.getDynamicValue( thread ) ), mt, UNPROVIDED );
                  if( NIL == conses_high.member( item_var2, just, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    just = ConsesLow.cons( item_var2, just );
                  }
                }
              }
            }
          }
          just = Sequences.nreverse( just );
        }
        else
        {
          just = gt_search.gt_why_accessesP( spec, genl );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return just;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 20428L)
  public static SubLObject gt_inferiorP(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return transitivity.gtm( predicate, $kw91$INFERIOR_, inferior, superior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 20811L)
  public static SubLObject gtm_inferiorP(final SubLObject spec, final SubLObject genl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return gtm_superiorP( genl, spec, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 20971L)
  public static SubLObject gt_has_superiorP(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( inferior, $sym1$GT_TERM_P );
    enforceType( superior, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw92$HAS_SUPERIOR_, inferior, superior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 21497L)
  public static SubLObject gtm_has_superiorP(final SubLObject spec, final SubLObject genl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return gtm_superiorP( genl, spec, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 21677L)
  public static SubLObject gt_has_inferiorP(final SubLObject predicate, final SubLObject superior, final SubLObject inferior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( superior, $sym1$GT_TERM_P );
    enforceType( inferior, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw92$HAS_SUPERIOR_, inferior, superior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 22206L)
  public static SubLObject gtm_has_inferiorP(final SubLObject genl, final SubLObject spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return gtm_superiorP( genl, spec, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 22386L)
  public static SubLObject gt_gather_inferior(final SubLObject predicate, final SubLObject genl, final SubLObject gather_fn, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return transitivity.gtm( predicate, $kw100$GATHER_INFERIOR, genl, gather_fn, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 22672L)
  public static SubLObject gtm_gather_inferior(final SubLObject genl, final SubLObject gather_fn, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL != Functions.funcall( gather_fn, genl ) )
        {
          result = T;
        }
        else
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
          {
            Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
          }
          final SubLObject _prev_bind_0_$41 = gt_vars.$gt_mode$.currentBinding( thread );
          try
          {
            gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
            assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
            final SubLObject _prev_bind_0_$42 = gt_vars.$gt_truth$.currentBinding( thread );
            try
            {
              gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
              result = gt_search.gt_gather( genl, gather_fn );
            }
            finally
            {
              gt_vars.$gt_truth$.rebind( _prev_bind_0_$42, thread );
            }
          }
          finally
          {
            gt_vars.$gt_mode$.rebind( _prev_bind_0_$41, thread );
          }
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 23011L)
  public static SubLObject gt_gather_superior(final SubLObject predicate, final SubLObject spec, final SubLObject gather_fn, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return transitivity.gtm( predicate, $kw101$GATHER_SUPERIOR, spec, gather_fn, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 23295L)
  public static SubLObject gtm_gather_superior(final SubLObject spec, final SubLObject gather_fn, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL != Functions.funcall( gather_fn, spec ) )
        {
          result = T;
        }
        else
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
          {
            Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
          }
          final SubLObject _prev_bind_0_$43 = gt_vars.$gt_mode$.currentBinding( thread );
          try
          {
            gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
            assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
            final SubLObject _prev_bind_0_$44 = gt_vars.$gt_truth$.currentBinding( thread );
            try
            {
              gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
              result = gt_search.gt_gather( spec, gather_fn );
            }
            finally
            {
              gt_vars.$gt_truth$.rebind( _prev_bind_0_$44, thread );
            }
          }
          finally
          {
            gt_vars.$gt_mode$.rebind( _prev_bind_0_$43, thread );
          }
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 23632L)
  public static SubLObject gt_cyclesP(final SubLObject predicate, final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw102$CYCLES_, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 24051L)
  public static SubLObject gtm_cyclesP(final SubLObject v_term, SubLObject mt, SubLObject validateP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( validateP == UNPROVIDED )
    {
      validateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cyclesP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        final SubLObject _prev_bind_0_$45 = gt_vars.$gt_test_level$.currentBinding( thread );
        try
        {
          gt_vars.$gt_test_level$.bind( ( NIL != validateP ) ? gt_vars.$gt_test_level$.getDynamicValue( thread ) : ZERO_INTEGER, thread );
          if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
          {
            gt_utilities.gt_check_type_internal( v_term, $kw9$GT_INDEX, THREE_INTEGER );
          }
          if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
          {
            gt_utilities.gt_check_type_internal( v_term, $kw20$GT_GATHER, THREE_INTEGER );
          }
        }
        finally
        {
          gt_vars.$gt_test_level$.rebind( _prev_bind_0_$45, thread );
        }
        try
        {
          cyclesP = gt_search.gt_accessesP( v_term, v_term, UNPROVIDED );
        }
        finally
        {
          final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            Hashtables.clrhash( gt_vars.$gt_marking_table$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
          }
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return cyclesP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 24591L)
  public static SubLObject gt_completes_cycleP(final SubLObject predicate, final SubLObject fort1, final SubLObject fort2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort1, $sym1$GT_TERM_P );
    enforceType( fort2, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw105$COMPLETES_CYCLE_, fort1, fort2, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 25222L)
  public static SubLObject gtm_completes_cycleP(final SubLObject arg1, final SubLObject arg2, SubLObject mt, SubLObject validateP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( validateP == UNPROVIDED )
    {
      validateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cyclesP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject start = NIL;
      SubLObject target = NIL;
      if( gt_vars.$gt_index_arg$.getDynamicValue( thread ).numE( ONE_INTEGER ) )
      {
        start = arg2;
        target = arg1;
      }
      else
      {
        start = arg1;
        target = arg2;
      }
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        final SubLObject _prev_bind_0_$47 = gt_vars.$gt_test_level$.currentBinding( thread );
        try
        {
          gt_vars.$gt_test_level$.bind( ( NIL != validateP ) ? gt_vars.$gt_test_level$.getDynamicValue( thread ) : ZERO_INTEGER, thread );
          if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
          {
            gt_utilities.gt_check_type_internal( start, $kw9$GT_INDEX, THREE_INTEGER );
          }
          if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
          {
            gt_utilities.gt_check_type_internal( target, $kw20$GT_GATHER, THREE_INTEGER );
          }
        }
        finally
        {
          gt_vars.$gt_test_level$.rebind( _prev_bind_0_$47, thread );
        }
        cyclesP = gt_search.gt_accessesP( start, target, UNPROVIDED );
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return cyclesP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 25829L)
  public static SubLObject gt_why_completes_cycleP(final SubLObject predicate, final SubLObject fort1, final SubLObject fort2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( fort1, $sym1$GT_TERM_P );
    enforceType( fort2, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw110$WHY_COMPLETES_CYCLE_, fort1, fort2, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 26196L)
  public static SubLObject gtm_why_completes_cycleP(final SubLObject arg1, final SubLObject arg2, SubLObject mt, SubLObject validateP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( validateP == UNPROVIDED )
    {
      validateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject just = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject start = NIL;
      SubLObject target = NIL;
      if( gt_vars.$gt_index_arg$.getDynamicValue( thread ).numE( ONE_INTEGER ) )
      {
        start = arg2;
        target = arg1;
      }
      else
      {
        start = arg1;
        target = arg2;
      }
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        final SubLObject _prev_bind_0_$48 = gt_vars.$gt_test_level$.currentBinding( thread );
        try
        {
          gt_vars.$gt_test_level$.bind( ( NIL != validateP ) ? gt_vars.$gt_test_level$.getDynamicValue( thread ) : ZERO_INTEGER, thread );
          if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
          {
            gt_utilities.gt_check_type_internal( start, $kw9$GT_INDEX, THREE_INTEGER );
          }
          if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
          {
            gt_utilities.gt_check_type_internal( target, $kw20$GT_GATHER, THREE_INTEGER );
          }
        }
        finally
        {
          gt_vars.$gt_test_level$.rebind( _prev_bind_0_$48, thread );
        }
        assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
        final SubLObject _prev_bind_0_$49 = gt_vars.$gt_truth$.currentBinding( thread );
        try
        {
          gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
          just = gt_search.gt_why_accessesP( start, target );
          if( NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue( thread ) )
          {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = just;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              result = ConsesLow.cons( support, result );
              final SubLObject pred = gt_support_predicate( support );
              if( !gt_vars.$gt_pred$.getDynamicValue( thread ).eql( pred ) )
              {
                SubLObject cdolist_list_var_$50 = genl_predicates.why_genl_predicateP( pred, gt_vars.$gt_pred$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                SubLObject gp_support = NIL;
                gp_support = cdolist_list_var_$50.first();
                while ( NIL != cdolist_list_var_$50)
                {
                  final SubLObject gaf = gp_support.first();
                  SubLObject relevant_gp_assertion = NIL;
                  if( NIL == relevant_gp_assertion )
                  {
                    SubLObject csome_list_var = kb_indexing.find_all_assertions( clause_utilities.make_gaf_cnf( gaf ) );
                    SubLObject gp_assertion = NIL;
                    gp_assertion = csome_list_var.first();
                    while ( NIL == relevant_gp_assertion && NIL != csome_list_var)
                    {
                      if( NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( gp_assertion ) ) )
                      {
                        relevant_gp_assertion = gp_assertion;
                      }
                      csome_list_var = csome_list_var.rest();
                      gp_assertion = csome_list_var.first();
                    }
                  }
                  if( NIL != relevant_gp_assertion )
                  {
                    final SubLObject item_var = relevant_gp_assertion;
                    if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      result = ConsesLow.cons( item_var, result );
                    }
                  }
                  cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                  gp_support = cdolist_list_var_$50.first();
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              support = cdolist_list_var.first();
            }
            just = Sequences.nreverse( result );
          }
        }
        finally
        {
          gt_vars.$gt_truth$.rebind( _prev_bind_0_$49, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return just;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 27478L)
  public static SubLObject gt_min_nodes(final SubLObject predicate, final SubLObject v_forts, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( v_forts, $sym113$LISTP );
    return transitivity.gtm( predicate, $kw114$MIN_NODES, v_forts, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 27854L)
  public static SubLObject gtm_min_nodes(final SubLObject nodes, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.singletonP( nodes ) )
    {
      return nodes;
    }
    final SubLObject unique_nodes = list_utilities.remove_duplicate_forts( nodes );
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = unique_nodes;
      SubLObject node = NIL;
      node = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == gt_search.gt_searchedP( node ) )
        {
          gt_search.gt_mark_proper_all_superiors_as_searched( node );
          if( NIL != gt_search.gt_searchedP( node ) )
          {
            gt_search.gt_mark_all_inferiors_as_unsearched( node );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        node = cdolist_list_var.first();
      }
      result = Sequences.remove_if( $sym119$GT_SEARCHED_, unique_nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 28490L)
  public static SubLObject gt_max_nodes(final SubLObject predicate, final SubLObject v_forts, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = gt_vars.$gt_max_nodes_direction$.getDynamicValue();
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( v_forts, $sym113$LISTP );
    return transitivity.gtm( predicate, $kw120$MAX_NODES, v_forts, mt, direction, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 28927L)
  public static SubLObject gtm_max_nodes(final SubLObject nodes, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = gt_vars.$gt_max_nodes_direction$.getDynamicValue();
    }
    final SubLObject unique_nodes = list_utilities.remove_duplicate_forts( nodes );
    if( NIL != list_utilities.singletonP( unique_nodes ) )
    {
      return unique_nodes;
    }
    final SubLObject pcase_var = direction;
    if( pcase_var.eql( $kw124$UP ) )
    {
      return gt_max_nodes_up( unique_nodes, mt );
    }
    if( pcase_var.eql( $kw125$DOWN ) )
    {
      return gt_max_nodes_down( unique_nodes, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 29394L)
  public static SubLObject gt_max_nodes_down(final SubLObject nodes, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = nodes;
      SubLObject node = NIL;
      node = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == gt_search.gt_searchedP( node ) )
        {
          gt_search.gt_mark_proper_all_inferiors_as_searched( node );
          if( NIL != gt_search.gt_searchedP( node ) )
          {
            gt_search.gt_mark_all_superiors_as_unsearched( node );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        node = cdolist_list_var.first();
      }
      result = Sequences.remove_if( Symbols.symbol_function( $sym119$GT_SEARCHED_ ), nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 29918L)
  public static SubLObject gt_max_nodes_up_with_hash(final SubLObject nodes, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
      {
        Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
      }
      final SubLObject _prev_bind_0_$51 = gt_vars.$gt_mode$.currentBinding( thread );
      try
      {
        gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
        final SubLObject nodeshash = Hashtables.make_hash_table( Sequences.length( nodes ), UNPROVIDED, UNPROVIDED );
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          Hashtables.sethash( node, nodeshash, T );
          cdolist_list_var = cdolist_list_var.rest();
          node = cdolist_list_var.first();
        }
        cdolist_list_var = nodes;
        node = NIL;
        node = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          Hashtables.sethash( node, nodeshash, NIL );
          if( NIL == gt_search.gt_accessesP( node, nodeshash, Symbols.symbol_function( $sym126$GETHASH ) ) )
          {
            result = ConsesLow.cons( node, result );
          }
          Hashtables.sethash( node, nodeshash, T );
          cdolist_list_var = cdolist_list_var.rest();
          node = cdolist_list_var.first();
        }
      }
      finally
      {
        gt_vars.$gt_mode$.rebind( _prev_bind_0_$51, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 30490L)
  public static SubLObject gt_max_nodes_up(final SubLObject nodes, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
      {
        Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
      }
      final SubLObject _prev_bind_0_$52 = gt_vars.$gt_mode$.currentBinding( thread );
      try
      {
        gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == gt_search.gt_accessesP( node, Sequences.remove( node, nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym127$MEMBER_ ) ) )
          {
            result = ConsesLow.cons( node, result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          node = cdolist_list_var.first();
        }
      }
      finally
      {
        gt_vars.$gt_mode$.rebind( _prev_bind_0_$52, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 30855L)
  public static SubLObject gt_min_ceilings(final SubLObject predicate, final SubLObject v_forts, SubLObject candidates, SubLObject mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( v_forts, $sym113$LISTP );
    return transitivity.gtm( predicate, $kw128$MIN_CEILINGS, v_forts, candidates, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 31274L)
  public static SubLObject gtm_min_ceilings(final SubLObject v_forts, SubLObject candidates, SubLObject mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ceilings = gt_ceilings( v_forts, candidates, mt );
    SubLObject min_nodes = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding( thread );
    try
    {
      gt_vars.$gt_target_marking_table$.bind( gt_vars.$gt_marking_table$.getDynamicValue( thread ), thread );
      gt_vars.$gt_marking_table$.bind( NIL, thread );
      gt_vars.$gt_marking_table$.setDynamicValue( Hashtables.make_hash_table( $int132$128, UNPROVIDED, UNPROVIDED ), thread );
      min_nodes = gt_min_nodes( gt_vars.$gt_pred$.getDynamicValue( thread ), ceilings, mt );
    }
    finally
    {
      gt_vars.$gt_marking_table$.rebind( _prev_bind_2, thread );
      gt_vars.$gt_target_marking_table$.rebind( _prev_bind_0, thread );
    }
    return min_nodes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 31647L)
  public static SubLObject gt_ceilings(final SubLObject nodes, SubLObject candidates, SubLObject mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject max_nodes = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding( thread );
    try
    {
      gt_vars.$gt_target_marking_table$.bind( gt_vars.$gt_marking_table$.getDynamicValue( thread ), thread );
      gt_vars.$gt_marking_table$.bind( NIL, thread );
      gt_vars.$gt_marking_table$.setDynamicValue( Hashtables.make_hash_table( $int132$128, UNPROVIDED, UNPROVIDED ), thread );
      max_nodes = gt_max_nodes( gt_vars.$gt_pred$.getDynamicValue( thread ), nodes, mt, UNPROVIDED );
    }
    finally
    {
      gt_vars.$gt_marking_table$.rebind( _prev_bind_2, thread );
      gt_vars.$gt_target_marking_table$.rebind( _prev_bind_0, thread );
    }
    if( NIL == list_utilities.singletonP( max_nodes ) )
    {
      return gt_ceilings_int( max_nodes, candidates, mt );
    }
    if( NIL == candidates || NIL != subl_promotions.memberP( max_nodes.first(), candidates, UNPROVIDED, UNPROVIDED ) )
    {
      return max_nodes;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 32065L)
  public static SubLObject gt_ceilings_int(final SubLObject nodes, SubLObject candidates, SubLObject mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ceilings = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
    {
      Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
    }
    final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding( thread );
    try
    {
      gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
      ceilings = gt_search.gt_common_horizon( nodes, candidates, mt );
    }
    finally
    {
      gt_vars.$gt_mode$.rebind( _prev_bind_0, thread );
    }
    return ceilings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 32264L)
  public static SubLObject gt_max_floors(final SubLObject predicate, final SubLObject v_forts, SubLObject candidates, SubLObject mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( v_forts, $sym113$LISTP );
    return transitivity.gtm( predicate, $kw133$MAX_FLOORS, v_forts, candidates, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 32677L)
  public static SubLObject gtm_max_floors(final SubLObject v_forts, SubLObject candidates, SubLObject mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject floors = gt_floors( v_forts, candidates, mt );
    SubLObject max_nodes = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding( thread );
    try
    {
      gt_vars.$gt_target_marking_table$.bind( gt_vars.$gt_marking_table$.getDynamicValue( thread ), thread );
      gt_vars.$gt_marking_table$.bind( NIL, thread );
      gt_vars.$gt_marking_table$.setDynamicValue( Hashtables.make_hash_table( $int132$128, UNPROVIDED, UNPROVIDED ), thread );
      max_nodes = gt_max_nodes( gt_vars.$gt_pred$.getDynamicValue( thread ), floors, mt, UNPROVIDED );
    }
    finally
    {
      gt_vars.$gt_marking_table$.rebind( _prev_bind_2, thread );
      gt_vars.$gt_target_marking_table$.rebind( _prev_bind_0, thread );
    }
    return max_nodes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 33067L)
  public static SubLObject gt_floors(final SubLObject nodes, SubLObject candidates, SubLObject mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != nodes )
    {
      SubLObject min_nodes = NIL;
      final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding( thread );
      final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding( thread );
      try
      {
        gt_vars.$gt_target_marking_table$.bind( gt_vars.$gt_marking_table$.getDynamicValue( thread ), thread );
        gt_vars.$gt_marking_table$.bind( NIL, thread );
        gt_vars.$gt_marking_table$.setDynamicValue( Hashtables.make_hash_table( $int132$128, UNPROVIDED, UNPROVIDED ), thread );
        min_nodes = gt_min_nodes( gt_vars.$gt_pred$.getDynamicValue( thread ), nodes, mt );
      }
      finally
      {
        gt_vars.$gt_marking_table$.rebind( _prev_bind_2, thread );
        gt_vars.$gt_target_marking_table$.rebind( _prev_bind_0, thread );
      }
      if( NIL == list_utilities.singletonP( min_nodes ) )
      {
        return gt_floors_int( min_nodes, candidates, mt );
      }
      if( NIL == candidates || NIL != subl_promotions.memberP( min_nodes.first(), candidates, UNPROVIDED, UNPROVIDED ) )
      {
        return min_nodes;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 33498L)
  public static SubLObject gt_floors_int(final SubLObject nodes, SubLObject candidates, SubLObject mt)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject floors = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
    {
      Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
    }
    final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding( thread );
    try
    {
      gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
      floors = gt_search.gt_common_horizon( nodes, candidates, mt );
    }
    finally
    {
      gt_vars.$gt_mode$.rebind( _prev_bind_0, thread );
    }
    return floors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 33690L)
  public static SubLObject gt_min_superiors_excluding(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( inferior, $sym1$GT_TERM_P );
    enforceType( superior, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw136$MIN_SUPERIORS_EXCLUDING, inferior, superior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 34190L)
  public static SubLObject gtm_min_superiors_excluding(final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject immediate_superiors = NIL;
    SubLObject excluded_forts_superiors = NIL;
    SubLObject mins = NIL;
    immediate_superiors = transitivity.gtm( gt_vars.$gt_pred$.getDynamicValue( thread ), $kw2$SUPERIORS, inferior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    excluded_forts_superiors = transitivity.gtm( gt_vars.$gt_pred$.getDynamicValue( thread ), $kw2$SUPERIORS, superior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    mins = gt_min_nodes( gt_vars.$gt_pred$.getDynamicValue( thread ), list_utilities.remove_duplicate_forts( ConsesLow.nconc( excluded_forts_superiors, Sequences.delete( superior, immediate_superiors, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED );
    return mins;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 34764L)
  public static SubLObject gt_max_inferiors_excluding(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( inferior, $sym1$GT_TERM_P );
    enforceType( superior, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw139$MAX_INFERIORS_EXCLUDING, inferior, superior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 35278L)
  public static SubLObject gtm_max_inferiors_excluding(final SubLObject superior, final SubLObject inferior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject immediate_inferiors = NIL;
    SubLObject excluded_forts_inferiors = NIL;
    SubLObject maxs = NIL;
    immediate_inferiors = transitivity.gtm( gt_vars.$gt_pred$.getDynamicValue( thread ), $kw17$INFERIORS, superior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    excluded_forts_inferiors = transitivity.gtm( gt_vars.$gt_pred$.getDynamicValue( thread ), $kw17$INFERIORS, inferior, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    maxs = gt_max_nodes( gt_vars.$gt_pred$.getDynamicValue( thread ), list_utilities.remove_duplicate_forts( ConsesLow.nconc( excluded_forts_inferiors, Sequences.delete( inferior, immediate_inferiors, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ), UNPROVIDED, UNPROVIDED );
    return maxs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 35863L)
  public static SubLObject gt_all_superior_edges(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return transitivity.gtm( predicate, $kw142$ALL_SUPERIOR_EDGES, inferior, superior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 36181L)
  public static SubLObject gt_all_inferior_edges(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return transitivity.gtm( predicate, $kw143$ALL_INFERIOR_EDGES, inferior, superior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 36321L)
  public static SubLObject gtm_all_superior_edges(final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding( thread );
    try
    {
      gt_vars.$gt_goal_node$.bind( superior, thread );
      gt_vars.$gt_path_list_of_nodes$.bind( ConsesLow.list( inferior ), thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$53 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$54 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
        }
        final SubLObject _prev_bind_0_$54 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$55 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            result = gt_search.gt_all_edges_to_goal( inferior );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$55, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$54, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$54, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$53, thread );
      }
    }
    finally
    {
      gt_vars.$gt_path_list_of_nodes$.rebind( _prev_bind_2, thread );
      gt_vars.$gt_goal_node$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 36665L)
  public static SubLObject gtm_all_inferior_edges(final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding( thread );
    try
    {
      gt_vars.$gt_goal_node$.bind( inferior, thread );
      gt_vars.$gt_path_list_of_nodes$.bind( ConsesLow.list( superior ), thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$57 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$58 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
        }
        final SubLObject _prev_bind_0_$58 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$59 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            result = gt_search.gt_all_edges_to_goal( superior );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$59, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$58, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$58, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$57, thread );
      }
    }
    finally
    {
      gt_vars.$gt_path_list_of_nodes$.rebind( _prev_bind_2, thread );
      gt_vars.$gt_goal_node$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 37009L)
  public static SubLObject gt_all_paths(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return transitivity.gtm( predicate, $kw144$ALL_PATHS, inferior, superior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 37132L)
  public static SubLObject gtm_all_paths(final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_assertions$.currentBinding( thread );
    try
    {
      gt_vars.$gt_goal_node$.bind( superior, thread );
      gt_vars.$gt_path_list_of_assertions$.bind( NIL, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$61 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
        }
        final SubLObject _prev_bind_0_$62 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$63 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            result = gt_search.gt_access_all_while_storing_paths( inferior );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$63, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$62, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$62, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$61, thread );
      }
    }
    finally
    {
      gt_vars.$gt_path_list_of_assertions$.rebind( _prev_bind_2, thread );
      gt_vars.$gt_goal_node$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 37467L)
  public static SubLObject gt_superior_in_what_mts(final SubLObject predicate, final SubLObject inferior, final SubLObject superior)
  {
    return transitivity.gtm( predicate, $kw145$SUPERIOR_IN_WHAT_MTS, inferior, superior, $kw146$HIERARCHICALLY_DIRECT, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 38033L)
  public static SubLObject gtm_in_what_mts(final SubLObject start, final SubLObject finish, final SubLObject key_method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode = ONE_INTEGER.eql( gt_vars.$gt_index_arg$.getDynamicValue( thread ) ) ? $kw10$SUPERIOR : $kw21$INFERIOR;
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$gt_what_mts_goal_node$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding( thread );
    final SubLObject _prev_bind_3 = gt_vars.$gt_path_list_of_mts$.currentBinding( thread );
    final SubLObject _prev_bind_4 = gt_vars.$gt_what_mts_result$.currentBinding( thread );
    try
    {
      gt_vars.$gt_what_mts_goal_node$.bind( finish, thread );
      gt_vars.$gt_path_list_of_nodes$.bind( NIL, thread );
      gt_vars.$gt_path_list_of_mts$.bind( NIL, thread );
      gt_vars.$gt_what_mts_result$.bind( NIL, thread );
      gt_vars.$gt_path_list_of_nodes$.setDynamicValue( ConsesLow.cons( start, gt_vars.$gt_path_list_of_nodes$.getDynamicValue( thread ) ), thread );
      gt_which_mts( start, finish, key_method, mode );
      v_answer = genl_mts.max_mts( gt_vars.$gt_what_mts_result$.getDynamicValue( thread ), UNPROVIDED );
    }
    finally
    {
      gt_vars.$gt_what_mts_result$.rebind( _prev_bind_4, thread );
      gt_vars.$gt_path_list_of_mts$.rebind( _prev_bind_3, thread );
      gt_vars.$gt_path_list_of_nodes$.rebind( _prev_bind_2, thread );
      gt_vars.$gt_what_mts_goal_node$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 39065L)
  public static SubLObject gt_which_mts(final SubLObject arg1, final SubLObject arg2, final SubLObject key_method, final SubLObject mode)
  {
    if( key_method.eql( $kw146$HIERARCHICALLY_DIRECT ) )
    {
      return gt_hierarchically_direct_in_what_mts( arg1, mode );
    }
    return gt_utilities.gt_error( THREE_INTEGER, $str147$illegal_value_for_method_of_which, key_method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 39361L)
  public static SubLObject gt_hierarchically_direct_in_what_mts(final SubLObject start, final SubLObject mode)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym148$RELEVANT_MT_IS_ANY_MT, thread );
      mt_relevance_macros.$mt$.bind( $const149$InferencePSC, thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( start, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( mode ) )
        {
          Errors.error( $str11$invalid_gt_mode___a, mode );
        }
        final SubLObject _prev_bind_0_$65 = gt_vars.$gt_mode$.currentBinding( thread );
        try
        {
          gt_vars.$gt_mode$.bind( mode, thread );
          assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
          final SubLObject _prev_bind_0_$66 = gt_vars.$gt_truth$.currentBinding( thread );
          try
          {
            gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
            result = gt_search.gt_access_all_while_unifying_mts( start );
          }
          finally
          {
            gt_vars.$gt_truth$.rebind( _prev_bind_0_$66, thread );
          }
        }
        finally
        {
          gt_vars.$gt_mode$.rebind( _prev_bind_0_$65, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 39684L)
  public static SubLObject associate_node_with_last_spec_total(final SubLObject node)
  {
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 39882L)
  public static SubLObject find_spec_cardinality(final SubLObject node)
  {
    if( NIL != cardinality_estimates.spec_cardinality( node ) )
    {
      return cardinality_estimates.spec_cardinality( node );
    }
    return associate_node_with_last_spec_total( node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 40046L)
  public static SubLObject gt_all_inferiors_with_their_max_mts(final SubLObject pred, final SubLObject superior)
  {
    return transitivity.gtm( pred, $kw150$INFERIORS_WITH_MTS, superior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 40156L)
  public static SubLObject gtm_all_inferiors_with_mts(final SubLObject root)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject marking_table = Hashtables.make_hash_table( find_spec_cardinality( root ), UNPROVIDED, UNPROVIDED );
    SubLObject inferiors_with_mts = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym151$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const152$EverythingPSC, thread );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw21$INFERIOR ) )
      {
        Errors.error( $str11$invalid_gt_mode___a, $kw21$INFERIOR );
      }
      final SubLObject _prev_bind_0_$67 = gt_vars.$gt_mode$.currentBinding( thread );
      try
      {
        gt_vars.$gt_mode$.bind( $kw21$INFERIOR, thread );
        assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
        final SubLObject _prev_bind_0_$68 = gt_vars.$gt_truth$.currentBinding( thread );
        final SubLObject _prev_bind_1_$69 = gt_vars.$gt_marking_table$.currentBinding( thread );
        try
        {
          gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
          gt_vars.$gt_marking_table$.bind( marking_table, thread );
          inferiors_with_mts = gt_search.gt_all_accessed_with_mts( root );
        }
        finally
        {
          gt_vars.$gt_marking_table$.rebind( _prev_bind_1_$69, thread );
          gt_vars.$gt_truth$.rebind( _prev_bind_0_$68, thread );
        }
      }
      finally
      {
        gt_vars.$gt_mode$.rebind( _prev_bind_0_$67, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return inferiors_with_mts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 40527L)
  public static SubLObject find_instance_cardinality(final SubLObject node)
  {
    if( NIL != cardinality_estimates.instance_cardinality( node ) )
    {
      return cardinality_estimates.instance_cardinality( node );
    }
    return $int132$128;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 40780L)
  public static SubLObject gt_all_fort_instances_with_their_max_mts(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject real_result = NIL;
    final SubLObject cols = gt_all_inferiors_with_their_max_mts( $const153$genls, node );
    final SubLObject num_cols = Sequences.length( cols );
    final SubLObject col_mt_hash = Hashtables.make_hash_table( num_cols, UNPROVIDED, UNPROVIDED );
    final SubLObject inst_mt_hash = Hashtables.make_hash_table( find_instance_cardinality( node ), UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding( thread );
    try
    {
      gt_vars.$gt_result$.bind( NIL, thread );
      SubLObject result = NIL;
      Errors.sublisp_break( $str154$before_gathering_instances, EMPTY_SUBL_OBJECT_ARRAY );
      SubLObject cdolist_list_var = cols;
      SubLObject col = NIL;
      col = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        Hashtables.sethash( col.first(), col_mt_hash, col.rest() );
        final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym151$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const152$EverythingPSC, thread );
          gt_search.gt_map_arg_index( Symbols.symbol_function( $sym155$ADD_RESULT_TO_GT_RESULT ), col.first(), TWO_INTEGER, $const156$isa, $kw12$TRUE );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$70, thread );
        }
        cdolist_list_var = cdolist_list_var.rest();
        col = cdolist_list_var.first();
      }
      Errors.sublisp_break( $str157$after_instances__before_maximin, EMPTY_SUBL_OBJECT_ARRAY );
      cdolist_list_var = gt_vars.$gt_result$.getDynamicValue( thread );
      SubLObject assrt = NIL;
      assrt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject inst = assertions_high.gaf_arg1( assrt );
        SubLObject inst_mts = Hashtables.gethash( inst, inst_mt_hash, UNPROVIDED );
        final SubLObject coll = assertions_high.gaf_arg2( assrt );
        final SubLObject col_mts = Hashtables.gethash( coll, col_mt_hash, UNPROVIDED );
        final SubLObject valid_mts = gt_search.gt_maximin_mts_among_lists( col_mts, assertions_high.assertion_mt( assrt ) );
        if( NIL != valid_mts )
        {
          inst_mts = list_utilities.remove_duplicate_forts( ConsesLow.append( valid_mts, inst_mts ) );
          Hashtables.sethash( inst, inst_mt_hash, inst_mts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        assrt = cdolist_list_var.first();
      }
      Errors.sublisp_break( $str158$after_maximin, EMPTY_SUBL_OBJECT_ARRAY );
      SubLObject inst2 = NIL;
      SubLObject mts = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( inst_mt_hash );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          inst2 = Hashtables.getEntryKey( cdohash_entry );
          mts = Hashtables.getEntryValue( cdohash_entry );
          result = ConsesLow.cons( ConsesLow.cons( inst2, gt_max_nodes( $const159$genlMt, mts, UNPROVIDED, UNPROVIDED ) ), result );
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      real_result = result;
    }
    finally
    {
      gt_vars.$gt_result$.rebind( _prev_bind_0, thread );
    }
    return real_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 42007L)
  public static SubLObject add_result_to_gt_result(final SubLObject elt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    gt_vars.$gt_result$.setDynamicValue( ConsesLow.cons( elt, gt_vars.$gt_result$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 42154L)
  public static SubLObject gt_isa_in_what_mts(final SubLObject inferior, final SubLObject superior)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding( thread );
    try
    {
      gt_vars.$gt_result$.bind( NIL, thread );
      SubLObject isa_assertion_list = NIL;
      SubLObject isa_mt = NIL;
      SubLObject immediate_isa = NIL;
      SubLObject minimized = NIL;
      SubLObject path_most_genl_mts = NIL;
      final SubLObject _prev_bind_0_$71 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym151$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const152$EverythingPSC, thread );
        gt_search.gt_map_arg_index( Symbols.symbol_function( $sym155$ADD_RESULT_TO_GT_RESULT ), inferior, ONE_INTEGER, $const156$isa, $kw12$TRUE );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$71, thread );
      }
      SubLObject cdolist_list_var;
      isa_assertion_list = ( cdolist_list_var = gt_vars.$gt_result$.getDynamicValue( thread ) );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        isa_mt = assertions_high.assertion_mt( assertion );
        immediate_isa = assertions_high.gaf_arg2( assertion );
        path_most_genl_mts = gt_superior_in_what_mts( $const153$genls, immediate_isa, superior );
        if( NIL != path_most_genl_mts )
        {
          SubLObject cdolist_list_var_$72 = path_most_genl_mts;
          SubLObject valid_mt_for_path = NIL;
          valid_mt_for_path = cdolist_list_var_$72.first();
          while ( NIL != cdolist_list_var_$72)
          {
            minimized = gt_min_nodes( $const159$genlMt, ConsesLow.list( isa_mt, valid_mt_for_path ), UNPROVIDED );
            if( NIL != list_utilities.singletonP( minimized ) )
            {
              result = ConsesLow.cons( minimized.first(), result );
            }
            cdolist_list_var_$72 = cdolist_list_var_$72.rest();
            valid_mt_for_path = cdolist_list_var_$72.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    finally
    {
      gt_vars.$gt_result$.rebind( _prev_bind_0, thread );
    }
    result = gt_max_nodes( $const159$genlMt, result, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 43058L)
  public static SubLObject gt_any_superior_path(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( predicate, $sym0$FORT_P );
    enforceType( inferior, $sym1$GT_TERM_P );
    enforceType( superior, $sym1$GT_TERM_P );
    return transitivity.gtm( predicate, $kw160$ANY_SUPERIOR_PATH, inferior, superior, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 43558L)
  public static SubLObject gtm_any_superior_path(final SubLObject spec, final SubLObject genl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject path = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw8$GT_ERROR );
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( spec, $kw9$GT_INDEX, THREE_INTEGER );
        }
        if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) )
        {
          gt_utilities.gt_check_type_internal( genl, $kw20$GT_GATHER, THREE_INTEGER );
        }
        if( genl.eql( spec ) )
        {
          if( NIL != kb_accessors.reflexive_predicateP( gt_vars.$gt_pred$.getDynamicValue( thread ) ) )
          {
            path = ConsesLow.list( spec );
          }
        }
        else
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == gt_utilities.gt_modeP( $kw10$SUPERIOR ) )
          {
            Errors.error( $str11$invalid_gt_mode___a, $kw10$SUPERIOR );
          }
          final SubLObject _prev_bind_0_$73 = gt_vars.$gt_mode$.currentBinding( thread );
          try
          {
            gt_vars.$gt_mode$.bind( $kw10$SUPERIOR, thread );
            assert NIL != enumeration_types.truth_p( $kw12$TRUE ) : $kw12$TRUE;
            final SubLObject _prev_bind_0_$74 = gt_vars.$gt_truth$.currentBinding( thread );
            try
            {
              gt_vars.$gt_truth$.bind( $kw12$TRUE, thread );
              path = gt_search.gt_any_access_path( spec, genl );
            }
            finally
            {
              gt_vars.$gt_truth$.rebind( _prev_bind_0_$74, thread );
            }
          }
          finally
          {
            gt_vars.$gt_mode$.rebind( _prev_bind_0_$73, thread );
          }
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw8$GT_ERROR );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return path;
  }

  public static SubLObject declare_gt_methods_file()
  {
    SubLFiles.declareFunction( me, "gt_superiors", "GT-SUPERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_superiors", "GTM-SUPERIORS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_min_superiors", "GT-MIN-SUPERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_min_superiors", "GTM-MIN-SUPERIORS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_inferiors", "GT-INFERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_inferiors", "GTM-INFERIORS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_max_inferiors", "GT-MAX-INFERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_max_inferiors", "GTM-MAX-INFERIORS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_co_superiors", "GT-CO-SUPERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_co_superiors", "GTM-CO-SUPERIORS", 1, 2, false );
    SubLFiles.declareFunction( me, "gt_co_inferiors", "GT-CO-INFERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_co_inferiors", "GTM-CO-INFERIORS", 1, 2, false );
    SubLFiles.declareFunction( me, "gt_redundant_superiors", "GT-REDUNDANT-SUPERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_redundant_superiors", "GTM-REDUNDANT-SUPERIORS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_redundant_inferiors", "GT-REDUNDANT-INFERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_redundant_inferiors", "GTM-REDUNDANT-INFERIORS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_all_superiors", "GT-ALL-SUPERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_all_superiors", "GTM-ALL-SUPERIORS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_all_inferiors", "GT-ALL-INFERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_all_inferiors", "GTM-ALL-INFERIORS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_union_all_inferiors", "GT-UNION-ALL-INFERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_union_all_inferiors", "GTM-UNION-ALL-INFERIORS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_all_accessible", "GT-ALL-ACCESSIBLE", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_all_accessible", "GTM-ALL-ACCESSIBLE", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_roots", "GT-ROOTS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_roots", "GTM-ROOTS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_leaves", "GT-LEAVES", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_leaves", "GTM-LEAVES", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_compose_fn_all_superiors", "GT-COMPOSE-FN-ALL-SUPERIORS", 3, 2, false );
    SubLFiles.declareFunction( me, "gtm_compose_fn_all_superiors", "GTM-COMPOSE-FN-ALL-SUPERIORS", 2, 2, false );
    SubLFiles.declareFunction( me, "gt_compose_fn_all_inferiors", "GT-COMPOSE-FN-ALL-INFERIORS", 3, 2, false );
    SubLFiles.declareFunction( me, "gtm_compose_fn_all_inferiors", "GTM-COMPOSE-FN-ALL-INFERIORS", 2, 2, false );
    SubLFiles.declareFunction( me, "gt_compose_pred_all_superiors", "GT-COMPOSE-PRED-ALL-SUPERIORS", 3, 3, false );
    SubLFiles.declareFunction( me, "gtm_compose_pred_all_superiors", "GTM-COMPOSE-PRED-ALL-SUPERIORS", 2, 3, false );
    SubLFiles.declareFunction( me, "gt_compose_pred_all_inferiors", "GT-COMPOSE-PRED-ALL-INFERIORS", 3, 3, false );
    SubLFiles.declareFunction( me, "gtm_compose_pred_all_inferiors", "GTM-COMPOSE-PRED-ALL-INFERIORS", 2, 3, false );
    SubLFiles.declareFunction( me, "gt_all_dependent_inferiors", "GT-ALL-DEPENDENT-INFERIORS", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_all_dependent_inferiors", "GTM-ALL-DEPENDENT-INFERIORS", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_booleanP", "GT-BOOLEAN?", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_booleanP", "GTM-BOOLEAN?", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_superiorP", "GT-SUPERIOR?", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_superiorP", "GTM-SUPERIOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_why_superiorP", "GT-WHY-SUPERIOR?", 3, 1, false );
    SubLFiles.declareFunction( me, "gt_support_predicate", "GT-SUPPORT-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "gt_support_sentence", "GT-SUPPORT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "gtm_why_superiorP", "GTM-WHY-SUPERIOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_inferiorP", "GT-INFERIOR?", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_inferiorP", "GTM-INFERIOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_has_superiorP", "GT-HAS-SUPERIOR?", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_has_superiorP", "GTM-HAS-SUPERIOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_has_inferiorP", "GT-HAS-INFERIOR?", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_has_inferiorP", "GTM-HAS-INFERIOR?", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_gather_inferior", "GT-GATHER-INFERIOR", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_gather_inferior", "GTM-GATHER-INFERIOR", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_gather_superior", "GT-GATHER-SUPERIOR", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_gather_superior", "GTM-GATHER-SUPERIOR", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_cyclesP", "GT-CYCLES?", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_cyclesP", "GTM-CYCLES?", 1, 2, false );
    SubLFiles.declareFunction( me, "gt_completes_cycleP", "GT-COMPLETES-CYCLE?", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_completes_cycleP", "GTM-COMPLETES-CYCLE?", 2, 2, false );
    SubLFiles.declareFunction( me, "gt_why_completes_cycleP", "GT-WHY-COMPLETES-CYCLE?", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_why_completes_cycleP", "GTM-WHY-COMPLETES-CYCLE?", 2, 2, false );
    SubLFiles.declareFunction( me, "gt_min_nodes", "GT-MIN-NODES", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_min_nodes", "GTM-MIN-NODES", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_max_nodes", "GT-MAX-NODES", 2, 2, false );
    SubLFiles.declareFunction( me, "gtm_max_nodes", "GTM-MAX-NODES", 1, 2, false );
    SubLFiles.declareFunction( me, "gt_max_nodes_down", "GT-MAX-NODES-DOWN", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_max_nodes_up_with_hash", "GT-MAX-NODES-UP-WITH-HASH", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_max_nodes_up", "GT-MAX-NODES-UP", 1, 1, false );
    SubLFiles.declareFunction( me, "gt_min_ceilings", "GT-MIN-CEILINGS", 2, 2, false );
    SubLFiles.declareFunction( me, "gtm_min_ceilings", "GTM-MIN-CEILINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "gt_ceilings", "GT-CEILINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "gt_ceilings_int", "GT-CEILINGS-INT", 1, 2, false );
    SubLFiles.declareFunction( me, "gt_max_floors", "GT-MAX-FLOORS", 2, 2, false );
    SubLFiles.declareFunction( me, "gtm_max_floors", "GTM-MAX-FLOORS", 1, 2, false );
    SubLFiles.declareFunction( me, "gt_floors", "GT-FLOORS", 1, 2, false );
    SubLFiles.declareFunction( me, "gt_floors_int", "GT-FLOORS-INT", 1, 2, false );
    SubLFiles.declareFunction( me, "gt_min_superiors_excluding", "GT-MIN-SUPERIORS-EXCLUDING", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_min_superiors_excluding", "GTM-MIN-SUPERIORS-EXCLUDING", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_max_inferiors_excluding", "GT-MAX-INFERIORS-EXCLUDING", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_max_inferiors_excluding", "GTM-MAX-INFERIORS-EXCLUDING", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_all_superior_edges", "GT-ALL-SUPERIOR-EDGES", 3, 1, false );
    SubLFiles.declareFunction( me, "gt_all_inferior_edges", "GT-ALL-INFERIOR-EDGES", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_all_superior_edges", "GTM-ALL-SUPERIOR-EDGES", 2, 1, false );
    SubLFiles.declareFunction( me, "gtm_all_inferior_edges", "GTM-ALL-INFERIOR-EDGES", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_all_paths", "GT-ALL-PATHS", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_all_paths", "GTM-ALL-PATHS", 2, 1, false );
    SubLFiles.declareFunction( me, "gt_superior_in_what_mts", "GT-SUPERIOR-IN-WHAT-MTS", 3, 0, false );
    SubLFiles.declareFunction( me, "gtm_in_what_mts", "GTM-IN-WHAT-MTS", 3, 0, false );
    SubLFiles.declareFunction( me, "gt_which_mts", "GT-WHICH-MTS", 4, 0, false );
    SubLFiles.declareFunction( me, "gt_hierarchically_direct_in_what_mts", "GT-HIERARCHICALLY-DIRECT-IN-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "associate_node_with_last_spec_total", "ASSOCIATE-NODE-WITH-LAST-SPEC-TOTAL", 1, 0, false );
    SubLFiles.declareFunction( me, "find_spec_cardinality", "FIND-SPEC-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "gt_all_inferiors_with_their_max_mts", "GT-ALL-INFERIORS-WITH-THEIR-MAX-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "gtm_all_inferiors_with_mts", "GTM-ALL-INFERIORS-WITH-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "find_instance_cardinality", "FIND-INSTANCE-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "gt_all_fort_instances_with_their_max_mts", "GT-ALL-FORT-INSTANCES-WITH-THEIR-MAX-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_result_to_gt_result", "ADD-RESULT-TO-GT-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "gt_isa_in_what_mts", "GT-ISA-IN-WHAT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "gt_any_superior_path", "GT-ANY-SUPERIOR-PATH", 3, 1, false );
    SubLFiles.declareFunction( me, "gtm_any_superior_path", "GTM-ANY-SUPERIOR-PATH", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_gt_methods_file()
  {
    return NIL;
  }

  public static SubLObject setup_gt_methods_file()
  {
    utilities_macros.register_cyc_api_function( $sym3$GT_SUPERIORS, $list4, $str5$Returns_direct_superiors_of_FORT_, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym15$GT_MIN_SUPERIORS, $list4, $str16$Returns_minimal_superiors_of_FORT, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym18$GT_INFERIORS, $list4, $str19$Returns_direct_inferiors_of_FORT_, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym23$GT_MAX_INFERIORS, $list4, $str24$Returns_maximal_inferiors_of_FORT, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym26$GT_CO_SUPERIORS, $list4, $str27$Returns_sibling_direct_superiors_, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym29$GT_CO_INFERIORS, $list4, $str30$Returns_sibling_direct_inferiors_, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym32$GT_REDUNDANT_SUPERIORS, $list4, $str33$Returns_direct_superiors_of_FORT_, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym35$GT_REDUNDANT_INFERIORS, $list4, $str36$Returns_direct_inferiors_of_FORT_, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym38$GT_ALL_SUPERIORS, $list4, $str39$Returns_all_superiors_of_FORT_via, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym41$GT_ALL_INFERIORS, $list4, $str42$Returns_all_inferiors_of_FORT_via, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym45$GT_ALL_ACCESSIBLE, $list4, $str46$Returns_all_superiors_and_all_inf, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym50$GT_ROOTS, $list4, $str51$Returns_maximal_superiors__i_e___, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym53$GT_LEAVES, $list4, $str54$Returns_minimal_inferiors__i_e___, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym58$GT_COMPOSE_FN_ALL_SUPERIORS, $list59, $str60$Apply_fn_to_each_superior_of_FORT, $list61, NIL );
    utilities_macros.register_cyc_api_function( $sym63$GT_COMPOSE_FN_ALL_INFERIORS, $list64, $str65$Apply_fn_to_each_inferior_of_FORT, $list61, NIL );
    utilities_macros.register_cyc_api_function( $sym68$GT_COMPOSE_PRED_ALL_SUPERIORS, $list69, $str70$Returns_all_nodes_accessible_by_C, $list71, $list7 );
    utilities_macros.register_cyc_api_function( $sym74$GT_COMPOSE_PRED_ALL_INFERIORS, $list69, $str75$Returns_all_nodes_accessible_by_C, $list71, $list7 );
    utilities_macros.register_cyc_api_function( $sym77$GT_ALL_DEPENDENT_INFERIORS, $list4, $str78$Returns_all_inferiors_i_of_FORT_s, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym82$GT_WHY_SUPERIOR_, $list83, $str84$Returns_justification_of_why_SUPE, $list85, $list86 );
    utilities_macros.register_cyc_api_function( $sym93$GT_HAS_SUPERIOR_, $list94, $str95$Returns_whetherfort_INFERIOR_is_h, $list96, $list97 );
    utilities_macros.register_cyc_api_function( $sym98$GT_HAS_INFERIOR_, $list83, $str99$Returns_whether_fort_SUPERIOR_is_, $list85, $list97 );
    utilities_macros.register_cyc_api_function( $sym103$GT_CYCLES_, $list4, $str104$Returns_whether_FORT_is_accessibl, $list6, $list97 );
    utilities_macros.register_cyc_api_function( $sym106$GT_COMPLETES_CYCLE_, $list107, $str108$Returns_whether_a_transitive_path, $list109, $list97 );
    utilities_macros.register_cyc_api_function( $sym111$GT_WHY_COMPLETES_CYCLE_, $list107, $str112$Returns_justification_that_a_tran, $list109, NIL );
    utilities_macros.register_cyc_api_function( $sym115$GT_MIN_NODES, $list116, $str117$Returns_returns_the_most_subordin, $list118, $list7 );
    utilities_macros.register_cyc_api_function( $sym121$GT_MAX_NODES, $list122, $str123$Returns_returns_the_least_subordi, $list118, $list7 );
    utilities_macros.register_cyc_api_function( $sym129$GT_MIN_CEILINGS, $list130, $str131$Returns_the_most_subordinate_comm, $list118, $list7 );
    utilities_macros.register_cyc_api_function( $sym134$GT_MAX_FLOORS, $list130, $str135$Returns_the_least_subordinate_ele, $list118, $list7 );
    utilities_macros.register_cyc_api_function( $sym137$GT_MIN_SUPERIORS_EXCLUDING, $list94, $str138$Returns_least_general_superiors_o, $list96, $list7 );
    utilities_macros.register_cyc_api_function( $sym140$GT_MAX_INFERIORS_EXCLUDING, $list94, $str141$Returns_most_general_inferiors_of, $list96, $list7 );
    utilities_macros.register_cyc_api_function( $sym161$GT_ANY_SUPERIOR_PATH, $list94, $str162$Returns_list_of_nodes_connecting_, $list96, $list7 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_gt_methods_file();
  }

  @Override
  public void initializeVariables()
  {
    init_gt_methods_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_gt_methods_file();
  }
  static
  {
    me = new gt_methods();
    $sym0$FORT_P = makeSymbol( "FORT-P" );
    $sym1$GT_TERM_P = makeSymbol( "GT-TERM-P" );
    $kw2$SUPERIORS = makeKeyword( "SUPERIORS" );
    $sym3$GT_SUPERIORS = makeSymbol( "GT-SUPERIORS" );
    $list4 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str5$Returns_direct_superiors_of_FORT_ = makeString( "Returns direct superiors of FORT via transitive PREDICATE" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "GT-TERM-P" ) ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "GT-TERM-P" ) ) );
    $kw8$GT_ERROR = makeKeyword( "GT-ERROR" );
    $kw9$GT_INDEX = makeKeyword( "GT-INDEX" );
    $kw10$SUPERIOR = makeKeyword( "SUPERIOR" );
    $str11$invalid_gt_mode___a = makeString( "invalid gt mode: ~a" );
    $kw12$TRUE = makeKeyword( "TRUE" );
    $sym13$TRUTH_P = makeSymbol( "TRUTH-P" );
    $kw14$MIN_SUPERIORS = makeKeyword( "MIN-SUPERIORS" );
    $sym15$GT_MIN_SUPERIORS = makeSymbol( "GT-MIN-SUPERIORS" );
    $str16$Returns_minimal_superiors_of_FORT = makeString( "Returns minimal superiors of FORT via transitive PREDICATE" );
    $kw17$INFERIORS = makeKeyword( "INFERIORS" );
    $sym18$GT_INFERIORS = makeSymbol( "GT-INFERIORS" );
    $str19$Returns_direct_inferiors_of_FORT_ = makeString( "Returns direct inferiors of FORT via transitive PREDICATE" );
    $kw20$GT_GATHER = makeKeyword( "GT-GATHER" );
    $kw21$INFERIOR = makeKeyword( "INFERIOR" );
    $kw22$MAX_INFERIORS = makeKeyword( "MAX-INFERIORS" );
    $sym23$GT_MAX_INFERIORS = makeSymbol( "GT-MAX-INFERIORS" );
    $str24$Returns_maximal_inferiors_of_FORT = makeString( "Returns maximal inferiors of FORT via transitive PREDICATE" );
    $kw25$CO_SUPERIORS = makeKeyword( "CO-SUPERIORS" );
    $sym26$GT_CO_SUPERIORS = makeSymbol( "GT-CO-SUPERIORS" );
    $str27$Returns_sibling_direct_superiors_ = makeString( "Returns sibling direct-superiors of direct-inferiors of FORT via PREDICATE, excluding FORT itself" );
    $kw28$CO_INFERIORS = makeKeyword( "CO-INFERIORS" );
    $sym29$GT_CO_INFERIORS = makeSymbol( "GT-CO-INFERIORS" );
    $str30$Returns_sibling_direct_inferiors_ = makeString( "Returns sibling direct-inferiors of direct-superiors of FORT via PREDICATE, excluding FORT itself" );
    $kw31$REDUNDANT_SUPERIORS = makeKeyword( "REDUNDANT-SUPERIORS" );
    $sym32$GT_REDUNDANT_SUPERIORS = makeSymbol( "GT-REDUNDANT-SUPERIORS" );
    $str33$Returns_direct_superiors_of_FORT_ = makeString( "Returns direct-superiors of FORT via PREDICATE that are subsumed by other superiors" );
    $kw34$REDUNDANT_INFERIORS = makeKeyword( "REDUNDANT-INFERIORS" );
    $sym35$GT_REDUNDANT_INFERIORS = makeSymbol( "GT-REDUNDANT-INFERIORS" );
    $str36$Returns_direct_inferiors_of_FORT_ = makeString( "Returns direct-inferiors of FORT via PREDICATE that subsumed other inferiors" );
    $kw37$ALL_SUPERIORS = makeKeyword( "ALL-SUPERIORS" );
    $sym38$GT_ALL_SUPERIORS = makeSymbol( "GT-ALL-SUPERIORS" );
    $str39$Returns_all_superiors_of_FORT_via = makeString( "Returns all superiors of FORT via PREDICATE" );
    $kw40$ALL_INFERIORS = makeKeyword( "ALL-INFERIORS" );
    $sym41$GT_ALL_INFERIORS = makeSymbol( "GT-ALL-INFERIORS" );
    $str42$Returns_all_inferiors_of_FORT_via = makeString( "Returns all inferiors of FORT via PREDICATE" );
    $kw43$UNION_ALL_INFERIORS = makeKeyword( "UNION-ALL-INFERIORS" );
    $kw44$ALL_ACCESSIBLE = makeKeyword( "ALL-ACCESSIBLE" );
    $sym45$GT_ALL_ACCESSIBLE = makeSymbol( "GT-ALL-ACCESSIBLE" );
    $str46$Returns_all_superiors_and_all_inf = makeString( "Returns all superiors and all inferiors of FORT via PREDICATE" );
    $kw47$GT_EITHER = makeKeyword( "GT-EITHER" );
    $kw48$ACCESSIBLE = makeKeyword( "ACCESSIBLE" );
    $kw49$ROOTS = makeKeyword( "ROOTS" );
    $sym50$GT_ROOTS = makeSymbol( "GT-ROOTS" );
    $str51$Returns_maximal_superiors__i_e___ = makeString( "Returns maximal superiors (i.e., roots) of FORT via PREDICATE" );
    $kw52$LEAVES = makeKeyword( "LEAVES" );
    $sym53$GT_LEAVES = makeSymbol( "GT-LEAVES" );
    $str54$Returns_minimal_inferiors__i_e___ = makeString( "Returns minimal inferiors (i.e., leaves) of FORT via PREDICATE" );
    $sym55$CONS = makeSymbol( "CONS" );
    $sym56$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $kw57$COMPOSE_FN_SUPERIORS = makeKeyword( "COMPOSE-FN-SUPERIORS" );
    $sym58$GT_COMPOSE_FN_ALL_SUPERIORS = makeSymbol( "GT-COMPOSE-FN-ALL-SUPERIORS" );
    $list59 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT" ), makeSymbol( "FN" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "COMBINE-FN" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
        makeSymbol( "CONS" ) ) ), makeSymbol( "MT" ) );
    $str60$Apply_fn_to_each_superior_of_FORT = makeString( "Apply fn to each superior of FORT;\n   fn takes a fort as its only arg, and must not effect the search status of each\n  fort it visits" );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "GT-TERM-P" ) ), ConsesLow.list( makeSymbol( "FN" ), makeSymbol(
        "FUNCTION-SPEC-P" ) ) );
    $kw62$COMPOSE_FN_INFERIORS = makeKeyword( "COMPOSE-FN-INFERIORS" );
    $sym63$GT_COMPOSE_FN_ALL_INFERIORS = makeSymbol( "GT-COMPOSE-FN-ALL-INFERIORS" );
    $list64 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT" ), makeSymbol( "FN" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "COMBINE-FN" ), makeSymbol( "*GT-COMBINE-FN*" ) ), makeSymbol(
        "MT" ) );
    $str65$Apply_fn_to_each_inferior_of_FORT = makeString( "Apply fn to each inferior of FORT; \n   fn takes a fort as its only arg, and \n   it must not effect the search status of each fort it visits" );
    $sym66$PREDICATE_IN_ANY_MT_ = makeSymbol( "PREDICATE-IN-ANY-MT?" );
    $kw67$COMPOSE_PRED_SUPERIORS = makeKeyword( "COMPOSE-PRED-SUPERIORS" );
    $sym68$GT_COMPOSE_PRED_ALL_SUPERIORS = makeSymbol( "GT-COMPOSE-PRED-ALL-SUPERIORS" );
    $list69 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT" ), makeSymbol( "COMPOSE-PRED" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "COMPOSE-INDEX-ARG" ), makeSymbol(
        "*GT-COMPOSE-INDEX-ARG*" ) ), ConsesLow.list( makeSymbol( "COMPOSE-GATHER-ARG" ), makeSymbol( "*GT-COMPOSE-GATHER-ARG*" ) ), makeSymbol( "MT" ) );
    $str70$Returns_all_nodes_accessible_by_C = makeString( "Returns all nodes accessible by COMPOSE-PRED from each superior of FORT along \n  transitive PREDICATE" );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "GT-TERM-P" ) ), ConsesLow.list( makeSymbol( "COMPOSE-PRED" ),
        makeSymbol( "PREDICATE-IN-ANY-MT?" ) ) );
    $sym72$FIXNUMP = makeSymbol( "FIXNUMP" );
    $kw73$COMPOSE_PRED_INFERIORS = makeKeyword( "COMPOSE-PRED-INFERIORS" );
    $sym74$GT_COMPOSE_PRED_ALL_INFERIORS = makeSymbol( "GT-COMPOSE-PRED-ALL-INFERIORS" );
    $str75$Returns_all_nodes_accessible_by_C = makeString( "Returns all nodes accessible by COMPOSE-PRED from each inferior of FORT along \n  transitive PREDICATE" );
    $kw76$ALL_DEPENDENT_INFERIORS = makeKeyword( "ALL-DEPENDENT-INFERIORS" );
    $sym77$GT_ALL_DEPENDENT_INFERIORS = makeSymbol( "GT-ALL-DEPENDENT-INFERIORS" );
    $str78$Returns_all_inferiors_i_of_FORT_s = makeString( "Returns all inferiors i of FORT s.t. every path connecting i to \n   any superior of FORT must pass through FORT" );
    $kw79$BOOLEAN_ = makeKeyword( "BOOLEAN?" );
    $kw80$SUPERIOR_ = makeKeyword( "SUPERIOR?" );
    $kw81$WHY_SUPERIOR_ = makeKeyword( "WHY-SUPERIOR?" );
    $sym82$GT_WHY_SUPERIOR_ = makeSymbol( "GT-WHY-SUPERIOR?" );
    $list83 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "SUPERIOR" ), makeSymbol( "INFERIOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str84$Returns_justification_of_why_SUPE = makeString( "Returns justification of why SUPERIOR is superior to (i.e., hierarchically higher than) \n  INFERIOR" );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "SUPERIOR" ), makeSymbol( "GT-TERM-P" ) ), ConsesLow.list( makeSymbol( "INFERIOR" ),
        makeSymbol( "GT-TERM-P" ) ) );
    $list86 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "ASSERTION-P" ) ) );
    $kw87$REFLEXIVE = makeKeyword( "REFLEXIVE" );
    $kw88$GENLPREDS = makeKeyword( "GENLPREDS" );
    $const89$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $const90$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $kw91$INFERIOR_ = makeKeyword( "INFERIOR?" );
    $kw92$HAS_SUPERIOR_ = makeKeyword( "HAS-SUPERIOR?" );
    $sym93$GT_HAS_SUPERIOR_ = makeSymbol( "GT-HAS-SUPERIOR?" );
    $list94 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "INFERIOR" ), makeSymbol( "SUPERIOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str95$Returns_whetherfort_INFERIOR_is_h = makeString( "Returns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE) \n  to fort SUPERIOR?" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "INFERIOR" ), makeSymbol( "GT-TERM-P" ) ), ConsesLow.list( makeSymbol( "SUPERIOR" ),
        makeSymbol( "GT-TERM-P" ) ) );
    $list97 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym98$GT_HAS_INFERIOR_ = makeSymbol( "GT-HAS-INFERIOR?" );
    $str99$Returns_whether_fort_SUPERIOR_is_ = makeString( "Returns whether fort SUPERIOR is hierarchically higher \n   (wrt transitive PREDICATE) to fort INFERIOR?" );
    $kw100$GATHER_INFERIOR = makeKeyword( "GATHER-INFERIOR" );
    $kw101$GATHER_SUPERIOR = makeKeyword( "GATHER-SUPERIOR" );
    $kw102$CYCLES_ = makeKeyword( "CYCLES?" );
    $sym103$GT_CYCLES_ = makeSymbol( "GT-CYCLES?" );
    $str104$Returns_whether_FORT_is_accessibl = makeString( "Returns whether FORT is accessible from itself by one or more PREDICATE gafs?" );
    $kw105$COMPLETES_CYCLE_ = makeKeyword( "COMPLETES-CYCLE?" );
    $sym106$GT_COMPLETES_CYCLE_ = makeSymbol( "GT-COMPLETES-CYCLE?" );
    $list107 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT1" ), makeSymbol( "FORT2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str108$Returns_whether_a_transitive_path = makeString( "Returns whether a transitive path connect FORT2 to FORT1, \n   or whether a transitive inverse path connect FORT1 to FORT2?" );
    $list109 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "FORT1" ), makeSymbol( "GT-TERM-P" ) ), ConsesLow.list( makeSymbol( "FORT2" ), makeSymbol(
        "GT-TERM-P" ) ) );
    $kw110$WHY_COMPLETES_CYCLE_ = makeKeyword( "WHY-COMPLETES-CYCLE?" );
    $sym111$GT_WHY_COMPLETES_CYCLE_ = makeSymbol( "GT-WHY-COMPLETES-CYCLE?" );
    $str112$Returns_justification_that_a_tran = makeString( "Returns justification that a transitive path connects FORT2 to FORT1, \n   or that a transitive inverse path connects FORT1 to FORT2?" );
    $sym113$LISTP = makeSymbol( "LISTP" );
    $kw114$MIN_NODES = makeKeyword( "MIN-NODES" );
    $sym115$GT_MIN_NODES = makeSymbol( "GT-MIN-NODES" );
    $list116 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORTS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str117$Returns_returns_the_most_subordin = makeString( "Returns returns the most-subordinate elements of FORTS\n   (one member only of a cycle will be a min-node candidate)" );
    $list118 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORT-P" ) ), ConsesLow.list( makeSymbol( "FORTS" ), makeSymbol( "LISTP" ) ) );
    $sym119$GT_SEARCHED_ = makeSymbol( "GT-SEARCHED?" );
    $kw120$MAX_NODES = makeKeyword( "MAX-NODES" );
    $sym121$GT_MAX_NODES = makeSymbol( "GT-MAX-NODES" );
    $list122 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORTS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "DIRECTION" ), makeSymbol( "*GT-MAX-NODES-DIRECTION*" ) ) );
    $str123$Returns_returns_the_least_subordi = makeString( "Returns returns the least-subordinate elements of FORTS\n   (<direction> should be :up unless all nodes are low in the hierarchy)" );
    $kw124$UP = makeKeyword( "UP" );
    $kw125$DOWN = makeKeyword( "DOWN" );
    $sym126$GETHASH = makeSymbol( "GETHASH" );
    $sym127$MEMBER_ = makeSymbol( "MEMBER?" );
    $kw128$MIN_CEILINGS = makeKeyword( "MIN-CEILINGS" );
    $sym129$GT_MIN_CEILINGS = makeSymbol( "GT-MIN-CEILINGS" );
    $list130 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "FORTS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CANDIDATES" ), makeSymbol( "MT" ) );
    $str131$Returns_the_most_subordinate_comm = makeString( "Returns the most-subordinate common superiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)" );
    $int132$128 = makeInteger( 128 );
    $kw133$MAX_FLOORS = makeKeyword( "MAX-FLOORS" );
    $sym134$GT_MAX_FLOORS = makeSymbol( "GT-MAX-FLOORS" );
    $str135$Returns_the_least_subordinate_ele = makeString( "Returns the least-subordinate elements or common inferiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)" );
    $kw136$MIN_SUPERIORS_EXCLUDING = makeKeyword( "MIN-SUPERIORS-EXCLUDING" );
    $sym137$GT_MIN_SUPERIORS_EXCLUDING = makeSymbol( "GT-MIN-SUPERIORS-EXCLUDING" );
    $str138$Returns_least_general_superiors_o = makeString( "Returns least-general superiors of INFERIOR ignoring SUPERIOR\n   (useful for splicing-out SUPERIOR from hierarchy)" );
    $kw139$MAX_INFERIORS_EXCLUDING = makeKeyword( "MAX-INFERIORS-EXCLUDING" );
    $sym140$GT_MAX_INFERIORS_EXCLUDING = makeSymbol( "GT-MAX-INFERIORS-EXCLUDING" );
    $str141$Returns_most_general_inferiors_of = makeString( "Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\n   (useful for splicing-out INFERIOR from hierarchy)" );
    $kw142$ALL_SUPERIOR_EDGES = makeKeyword( "ALL-SUPERIOR-EDGES" );
    $kw143$ALL_INFERIOR_EDGES = makeKeyword( "ALL-INFERIOR-EDGES" );
    $kw144$ALL_PATHS = makeKeyword( "ALL-PATHS" );
    $kw145$SUPERIOR_IN_WHAT_MTS = makeKeyword( "SUPERIOR-IN-WHAT-MTS" );
    $kw146$HIERARCHICALLY_DIRECT = makeKeyword( "HIERARCHICALLY-DIRECT" );
    $str147$illegal_value_for_method_of_which = makeString( "illegal value for method of which-mts: ~s" );
    $sym148$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $const149$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw150$INFERIORS_WITH_MTS = makeKeyword( "INFERIORS-WITH-MTS" );
    $sym151$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const152$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const153$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $str154$before_gathering_instances = makeString( "before gathering instances" );
    $sym155$ADD_RESULT_TO_GT_RESULT = makeSymbol( "ADD-RESULT-TO-GT-RESULT" );
    $const156$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $str157$after_instances__before_maximin = makeString( "after instances, before maximin" );
    $str158$after_maximin = makeString( "after maximin" );
    $const159$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $kw160$ANY_SUPERIOR_PATH = makeKeyword( "ANY-SUPERIOR-PATH" );
    $sym161$GT_ANY_SUPERIOR_PATH = makeSymbol( "GT-ANY-SUPERIOR-PATH" );
    $str162$Returns_list_of_nodes_connecting_ = makeString( "Returns list of nodes connecting INFERIOR with SUPERIOR" );
  }
}
/*
 * 
 * Total time: 1122 ms
 * 
 */