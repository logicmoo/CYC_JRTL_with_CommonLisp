package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_utilities";
  public static final String myFingerPrint = "dcd44590712798797edb6835f49e333dded220514e799f070144582754700257";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 1170L)
  public static SubLSymbol $reformulator_settings_for_query_processing$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 1965L)
  public static SubLSymbol $reformulator_settings_for_wff_violation_resolution$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 2593L)
  public static SubLSymbol $reformulator_settings_for_dates_reformulation$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 3322L)
  public static SubLSymbol $reformulator_settings_for_exception_rules$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$RECURSION_LIMIT;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 751L)
  public static SubLObject reformulate_cycls(final SubLObject cycls, SubLObject mt, SubLObject settings)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( settings == UNPROVIDED )
    {
      settings = NIL;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cycls;
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( reformulator_hub.reformulate_cycl( cycl, mt, settings ), result );
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 1281L)
  public static SubLObject reformulate_query_cycls(final SubLObject expressions, final SubLObject mt, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = ZERO_INTEGER;
    }
    SubLObject temp_result = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = expressions;
    SubLObject expression = NIL;
    expression = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      temp_result = reformulate_cycl_query_processing( expression, mt, limit );
      if( NIL != el_utilities.el_formula_p( temp_result ) )
      {
        result = ConsesLow.cons( temp_result, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      expression = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 1601L)
  public static SubLObject reformulate_cycl_query_processing(final SubLObject expression, final SubLObject mt, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return reformulator_first_of( reformulator_hub.reformulate_cycl( expression, mt, ( NIL != limit ) ? Sequences.cconcatenate( $reformulator_settings_for_query_processing$.getDynamicValue( thread ), ConsesLow.list(
        $kw1$RECURSION_LIMIT, limit ) ) : $reformulator_settings_for_query_processing$.getDynamicValue( thread ) ), expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 2112L)
  public static SubLObject reformulate_cycl_wff_options(final SubLObject expression, final SubLObject mt, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return reformulator_first_of( reformulator_hub.reformulate_cycl( expression, mt, ( NIL != limit ) ? Sequences.cconcatenate( $reformulator_settings_for_wff_violation_resolution$.getDynamicValue( thread ), ConsesLow
        .list( $kw1$RECURSION_LIMIT, limit ) ) : $reformulator_settings_for_wff_violation_resolution$.getDynamicValue( thread ) ), ConsesLow.list( expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 2710L)
  public static SubLObject reformulate_cycl_dates(final SubLObject expression, final SubLObject mt, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return reformulator_first_of( reformulator_hub.reformulate_cycl( expression, mt, ( NIL != limit ) ? Sequences.cconcatenate( $reformulator_settings_for_dates_reformulation$.getDynamicValue( thread ), ConsesLow.list(
        $kw1$RECURSION_LIMIT, limit ) ) : $reformulator_settings_for_dates_reformulation$.getDynamicValue( thread ) ), expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 3058L)
  public static SubLObject reformulator_first_of(final SubLObject thing1, final SubLObject thing2)
  {
    return ( NIL != thing1 ) ? thing1 : thing2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-utilities.lisp", position = 3494L)
  public static SubLObject reformulate_cycl_exception_rules(final SubLObject expression, final SubLObject mt, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return reformulator_first_of( reformulator_hub.reformulate_cycl( expression, mt, ( NIL != limit ) ? Sequences.cconcatenate( $reformulator_settings_for_exception_rules$.getDynamicValue( thread ), ConsesLow.list(
        $kw1$RECURSION_LIMIT, limit ) ) : $reformulator_settings_for_exception_rules$.getDynamicValue( thread ) ), expression );
  }

  public static SubLObject declare_reformulator_utilities_file()
  {
    SubLFiles.declareFunction( me, "reformulate_cycls", "REFORMULATE-CYCLS", 1, 2, false );
    SubLFiles.declareFunction( me, "reformulate_query_cycls", "REFORMULATE-QUERY-CYCLS", 2, 1, false );
    SubLFiles.declareFunction( me, "reformulate_cycl_query_processing", "REFORMULATE-CYCL-QUERY-PROCESSING", 2, 1, false );
    SubLFiles.declareFunction( me, "reformulate_cycl_wff_options", "REFORMULATE-CYCL-WFF-OPTIONS", 2, 1, false );
    SubLFiles.declareFunction( me, "reformulate_cycl_dates", "REFORMULATE-CYCL-DATES", 2, 1, false );
    SubLFiles.declareFunction( me, "reformulator_first_of", "REFORMULATOR-FIRST-OF", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulate_cycl_exception_rules", "REFORMULATE-CYCL-EXCEPTION-RULES", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_reformulator_utilities_file()
  {
    $reformulator_settings_for_query_processing$ = SubLFiles.defparameter( "*REFORMULATOR-SETTINGS-FOR-QUERY-PROCESSING*", $list0 );
    $reformulator_settings_for_wff_violation_resolution$ = SubLFiles.defparameter( "*REFORMULATOR-SETTINGS-FOR-WFF-VIOLATION-RESOLUTION*", $list2 );
    $reformulator_settings_for_dates_reformulation$ = SubLFiles.defparameter( "*REFORMULATOR-SETTINGS-FOR-DATES-REFORMULATION*", $list3 );
    $reformulator_settings_for_exception_rules$ = SubLFiles.defparameter( "*REFORMULATOR-SETTINGS-FOR-EXCEPTION-RULES*", $list4 );
    return NIL;
  }

  public static SubLObject setup_reformulator_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_utilities_file();
  }
  static
  {
    me = new reformulator_utilities();
    $reformulator_settings_for_query_processing$ = null;
    $reformulator_settings_for_wff_violation_resolution$ = null;
    $reformulator_settings_for_dates_reformulation$ = null;
    $reformulator_settings_for_exception_rules$ = null;
    $list0 = ConsesLow.list( makeKeyword( "FOCUS" ), constant_handles.reader_make_constant_shell( makeString( "QueryProcessingRLModule" ) ) );
    $kw1$RECURSION_LIMIT = makeKeyword( "RECURSION-LIMIT" );
    $list2 = ConsesLow.list( makeKeyword( "FOCUS" ), constant_handles.reader_make_constant_shell( makeString( "WffViolationResolutionRLModule" ) ) );
    $list3 = ConsesLow.list( makeKeyword( "FOCUS" ), constant_handles.reader_make_constant_shell( makeString( "DatesReformulatorRLModule" ) ) );
    $list4 = ConsesLow.list( makeKeyword( "MODES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ReformulatorMode-Simplify" ) ) ) );
  }
}
/*
 * 
 * Total time: 75 ms
 * 
 */