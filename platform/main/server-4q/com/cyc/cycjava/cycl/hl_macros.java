package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.hl_macros";
  public static final String myFingerPrint = "7f5f2375d6d460bf63953eb5b87408d57d40df0fa28089a352422f3555c3be5b";
  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 964L)
  public static SubLSymbol $forts_being_removed$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2488L)
  public static SubLSymbol $forward_inference_metric_last_metric_type$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2737L)
  public static SubLSymbol $forward_inference_metric_last_metric$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2821L)
  public static SubLSymbol $forward_inference_metric_last_forward_inference_gaf$;
  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2905L)
  public static SubLSymbol $forward_inference_metric_last_forward_inference_rule$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PWHEN;
  private static final SubLSymbol $sym2$_RECORDING_HL_TRANSCRIPT_OPERATIONS__;
  private static final SubLSymbol $sym3$RECORD_HL_TRANSCRIPT_OPERATION;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$CLET;
  private static final SubLSymbol $sym6$_FORTS_BEING_REMOVED_;
  private static final SubLSymbol $sym7$CONS;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$KBEQ;
  private static final SubLObject $const10$termDependsOn;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$OUTERMOST_INIT_;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$CUNWIND_PROTECT;
  private static final SubLSymbol $sym15$_FORWARD_INFERENCE_LAST_METRIC_TIME_;
  private static final SubLSymbol $sym16$FIF;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$POSSIBLY_WITH_FORWARD_INFERENCE_METRIC_PROFILING;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$PROGN;
  private static final SubLSymbol $sym21$PUNLESS;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$LAST_METRIC_TYPE;
  private static final SubLSymbol $sym25$LAST_METRIC;
  private static final SubLSymbol $sym26$LAST_GAF;
  private static final SubLSymbol $sym27$LAST_RULE;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$CAND;
  private static final SubLSymbol $sym33$INCREMENT_FORWARD_INFERENCE_METRICS;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$_FORWARD_INFERENCE_METRIC_LAST_METRIC_TYPE_;
  private static final SubLSymbol $sym36$_FORWARD_INFERENCE_METRIC_LAST_METRIC_;
  private static final SubLSymbol $sym37$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_GAF_;
  private static final SubLSymbol $sym38$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_RULE_;

  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 798L)
  public static SubLObject possibly_record_hl_transcript_operation(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    form = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PWHEN, $sym2$_RECORDING_HL_TRANSCRIPT_OPERATIONS__, ConsesLow.list( $sym3$RECORD_HL_TRANSCRIPT_OPERATION, form ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 1159L)
  public static SubLObject note_fort_being_removed(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject fort = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    fort = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym6$_FORTS_BEING_REMOVED_, ConsesLow.listS( $sym7$CONS, fort, $list8 ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 1315L)
  public static SubLObject some_fort_being_removedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $forts_being_removed$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 1462L)
  public static SubLObject fort_being_removedP(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.member_kbeqP( fort, $forts_being_removed$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 1613L)
  public static SubLObject forts_being_removed()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.copy_list( $forts_being_removed$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 1698L)
  public static SubLObject forts_that_will_be_removed()
  {
    SubLObject forts_to_process = forts_being_removed();
    SubLObject result = forts_being_removed();
    while ( NIL != forts_to_process)
    {
      final SubLObject fort_to_process = forts_to_process.first();
      forts_to_process = forts_to_process.rest();
      final SubLObject item_var = fort_to_process;
      if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( $sym9$KBEQ ), Symbols.symbol_function( IDENTITY ) ) )
      {
        result = ConsesLow.cons( item_var, result );
      }
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt( fort_to_process, $const10$termDependsOn, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
      SubLObject dependent_term = NIL;
      dependent_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == list_utilities.member_kbeqP( dependent_term, result ) )
        {
          final SubLObject item_var2 = dependent_term;
          if( NIL == conses_high.member( item_var2, forts_to_process, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            forts_to_process = ConsesLow.cons( item_var2, forts_to_process );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        dependent_term = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2327L)
  public static SubLObject fort_being_removed_or_will_be_removedP(final SubLObject fort)
  {
    return makeBoolean( NIL != fort_being_removedP( fort ) || NIL != list_utilities.member_kbeqP( fort, forts_that_will_be_removed() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 2989L)
  public static SubLObject with_forward_inference_metric_profiling_initialized(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject metric_type = NIL;
    SubLObject metric = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    metric_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    metric = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject outermost_initP = $sym12$OUTERMOST_INIT_;
      return ConsesLow.list( $sym5$CLET, ConsesLow.list( reader.bq_cons( outermost_initP, $list13 ) ), ConsesLow.list( $sym14$CUNWIND_PROTECT, ConsesLow.list( $sym5$CLET, ConsesLow.list( ConsesLow.list(
          $sym15$_FORWARD_INFERENCE_LAST_METRIC_TIME_, ConsesLow.listS( $sym16$FIF, outermost_initP, $list17 ) ) ), ConsesLow.list( $sym18$POSSIBLY_WITH_FORWARD_INFERENCE_METRIC_PROFILING, ConsesLow.listS( metric_type,
              metric, $list19 ), reader.bq_cons( $sym20$PROGN, ConsesLow.append( body, NIL ) ) ) ), ConsesLow.listS( $sym21$PUNLESS, outermost_initP, $list22 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hl-macros.lisp", position = 3647L)
  public static SubLObject possibly_with_forward_inference_metric_profiling(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject metric_type = NIL;
    SubLObject metric = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    metric_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    metric = current.first();
    current = current.rest();
    final SubLObject gaf = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject rule = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    final SubLObject count = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list23 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject last_metric_type = $sym24$LAST_METRIC_TYPE;
      final SubLObject last_metric = $sym25$LAST_METRIC;
      final SubLObject last_gaf = $sym26$LAST_GAF;
      final SubLObject last_rule = $sym27$LAST_RULE;
      return ConsesLow.list( $sym5$CLET, ConsesLow.list( reader.bq_cons( last_metric_type, $list28 ), reader.bq_cons( last_metric, $list29 ), reader.bq_cons( last_gaf, $list30 ), reader.bq_cons( last_rule, $list31 ) ),
          ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym32$CAND, last_metric_type, last_metric ), ConsesLow.listS( $sym33$INCREMENT_FORWARD_INFERENCE_METRICS, last_metric_type, last_metric, last_gaf, last_rule,
              $list34 ) ), ConsesLow.list( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym35$_FORWARD_INFERENCE_METRIC_LAST_METRIC_TYPE_, metric_type ), ConsesLow.list( $sym36$_FORWARD_INFERENCE_METRIC_LAST_METRIC_,
                  metric ), ConsesLow.list( $sym37$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_GAF_, gaf ), ConsesLow.list( $sym38$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_RULE_, rule ) ), ConsesLow.list(
                      $sym14$CUNWIND_PROTECT, reader.bq_cons( $sym20$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym33$INCREMENT_FORWARD_INFERENCE_METRICS, metric_type, metric, gaf, rule, count ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    return NIL;
  }

  public static SubLObject declare_hl_macros_file()
  {
    SubLFiles.declareMacro( me, "possibly_record_hl_transcript_operation", "POSSIBLY-RECORD-HL-TRANSCRIPT-OPERATION" );
    SubLFiles.declareMacro( me, "note_fort_being_removed", "NOTE-FORT-BEING-REMOVED" );
    SubLFiles.declareFunction( me, "some_fort_being_removedP", "SOME-FORT-BEING-REMOVED?", 0, 0, false );
    SubLFiles.declareFunction( me, "fort_being_removedP", "FORT-BEING-REMOVED?", 1, 0, false );
    SubLFiles.declareFunction( me, "forts_being_removed", "FORTS-BEING-REMOVED", 0, 0, false );
    SubLFiles.declareFunction( me, "forts_that_will_be_removed", "FORTS-THAT-WILL-BE-REMOVED", 0, 0, false );
    SubLFiles.declareFunction( me, "fort_being_removed_or_will_be_removedP", "FORT-BEING-REMOVED-OR-WILL-BE-REMOVED?", 1, 0, false );
    SubLFiles.declareMacro( me, "with_forward_inference_metric_profiling_initialized", "WITH-FORWARD-INFERENCE-METRIC-PROFILING-INITIALIZED" );
    SubLFiles.declareMacro( me, "possibly_with_forward_inference_metric_profiling", "POSSIBLY-WITH-FORWARD-INFERENCE-METRIC-PROFILING" );
    return NIL;
  }

  public static SubLObject init_hl_macros_file()
  {
    $forts_being_removed$ = SubLFiles.defparameter( "*FORTS-BEING-REMOVED*", NIL );
    $forward_inference_metric_last_metric_type$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-METRIC-LAST-METRIC-TYPE*", NIL );
    $forward_inference_metric_last_metric$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-METRIC-LAST-METRIC*", NIL );
    $forward_inference_metric_last_forward_inference_gaf$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-GAF*", NIL );
    $forward_inference_metric_last_forward_inference_rule$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-RULE*", NIL );
    return NIL;
  }

  public static SubLObject setup_hl_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_hl_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_hl_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_hl_macros_file();
  }
  static
  {
    me = new hl_macros();
    $forts_being_removed$ = null;
    $forward_inference_metric_last_metric_type$ = null;
    $forward_inference_metric_last_metric$ = null;
    $forward_inference_metric_last_forward_inference_gaf$ = null;
    $forward_inference_metric_last_forward_inference_rule$ = null;
    $list0 = ConsesLow.list( makeSymbol( "FORM" ) );
    $sym1$PWHEN = makeSymbol( "PWHEN" );
    $sym2$_RECORDING_HL_TRANSCRIPT_OPERATIONS__ = makeSymbol( "*RECORDING-HL-TRANSCRIPT-OPERATIONS?*" );
    $sym3$RECORD_HL_TRANSCRIPT_OPERATION = makeSymbol( "RECORD-HL-TRANSCRIPT-OPERATION" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym5$CLET = makeSymbol( "CLET" );
    $sym6$_FORTS_BEING_REMOVED_ = makeSymbol( "*FORTS-BEING-REMOVED*" );
    $sym7$CONS = makeSymbol( "CONS" );
    $list8 = ConsesLow.list( makeSymbol( "*FORTS-BEING-REMOVED*" ) );
    $sym9$KBEQ = makeSymbol( "KBEQ" );
    $const10$termDependsOn = constant_handles.reader_make_constant_shell( makeString( "termDependsOn" ) );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "METRIC-TYPE" ), makeSymbol( "METRIC" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym12$OUTERMOST_INIT_ = makeUninternedSymbol( "OUTERMOST-INIT?" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "*FORWARD-INFERENCE-LAST-METRIC-TIME*" ) ) );
    $sym14$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym15$_FORWARD_INFERENCE_LAST_METRIC_TIME_ = makeSymbol( "*FORWARD-INFERENCE-LAST-METRIC-TIME*" );
    $sym16$FIF = makeSymbol( "FIF" );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIAL-FORWARD-INFERENCE-METRIC-TIME" ) ), makeSymbol( "*FORWARD-INFERENCE-LAST-METRIC-TIME*" ) );
    $sym18$POSSIBLY_WITH_FORWARD_INFERENCE_METRIC_PROFILING = makeSymbol( "POSSIBLY-WITH-FORWARD-INFERENCE-METRIC-PROFILING" );
    $list19 = ConsesLow.list( makeKeyword( "NO-GAF" ), makeKeyword( "NO-RULE" ) );
    $sym20$PROGN = makeSymbol( "PROGN" );
    $sym21$PUNLESS = makeSymbol( "PUNLESS" );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*FORWARD-INFERENCE-LAST-METRIC-TIME*" ), ConsesLow.list( makeSymbol( "INITIAL-FORWARD-INFERENCE-METRIC-TIME" ) ) ) );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "METRIC-TYPE" ), makeSymbol( "METRIC" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "GAF" ), makeSymbol( "RULE" ), makeSymbol( "COUNT" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $sym24$LAST_METRIC_TYPE = makeUninternedSymbol( "LAST-METRIC-TYPE" );
    $sym25$LAST_METRIC = makeUninternedSymbol( "LAST-METRIC" );
    $sym26$LAST_GAF = makeUninternedSymbol( "LAST-GAF" );
    $sym27$LAST_RULE = makeUninternedSymbol( "LAST-RULE" );
    $list28 = ConsesLow.list( makeSymbol( "*FORWARD-INFERENCE-METRIC-LAST-METRIC-TYPE*" ) );
    $list29 = ConsesLow.list( makeSymbol( "*FORWARD-INFERENCE-METRIC-LAST-METRIC*" ) );
    $list30 = ConsesLow.list( makeSymbol( "*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-GAF*" ) );
    $list31 = ConsesLow.list( makeSymbol( "*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-RULE*" ) );
    $sym32$CAND = makeSymbol( "CAND" );
    $sym33$INCREMENT_FORWARD_INFERENCE_METRICS = makeSymbol( "INCREMENT-FORWARD-INFERENCE-METRICS" );
    $list34 = ConsesLow.list( ZERO_INTEGER );
    $sym35$_FORWARD_INFERENCE_METRIC_LAST_METRIC_TYPE_ = makeSymbol( "*FORWARD-INFERENCE-METRIC-LAST-METRIC-TYPE*" );
    $sym36$_FORWARD_INFERENCE_METRIC_LAST_METRIC_ = makeSymbol( "*FORWARD-INFERENCE-METRIC-LAST-METRIC*" );
    $sym37$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_GAF_ = makeSymbol( "*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-GAF*" );
    $sym38$_FORWARD_INFERENCE_METRIC_LAST_FORWARD_INFERENCE_RULE_ = makeSymbol( "*FORWARD-INFERENCE-METRIC-LAST-FORWARD-INFERENCE-RULE*" );
  }
}
/*
 * 
 * Total time: 124 ms
 * 
 */