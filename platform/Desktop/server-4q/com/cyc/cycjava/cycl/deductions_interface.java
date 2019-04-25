package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class deductions_interface
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.deductions_interface";
  public static final String myFingerPrint = "8739ff98667b35e9caf98a201c81c34c7076077219326383add5d7f75472559a";
  private static final SubLSymbol $sym0$SUPPORT_P;
  private static final SubLSymbol $sym1$HL_JUSTIFICATION_P;
  private static final SubLSymbol $sym2$TRUTH_P;
  private static final SubLSymbol $sym3$EL_STRENGTH_P;
  private static final SubLSymbol $sym4$KB_CREATE_DEDUCTION;
  private static final SubLSymbol $sym5$_EXIT;
  private static final SubLList $list6;
  private static final SubLString $str7$Create_a_new_deduction_consisting;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$KB_CREATE_DEDUCTION_KB_STORE;
  private static final SubLSymbol $sym11$DEDUCTION_P;
  private static final SubLSymbol $sym12$KB_REMOVE_DEDUCTION;
  private static final SubLSymbol $sym13$QUOTE;
  private static final SubLList $list14;
  private static final SubLString $str15$Remove_DEDUCTION_from_the_KB__and;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$KB_LOOKUP_DEDUCTION;
  private static final SubLList $list19;
  private static final SubLString $str20$Return_the_deduction_with_ASSERTI;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$KB_DEDUCTION_SUPPORTED_OBJECT;
  private static final SubLString $str24$Return_the_assertion_for_DEDUCTIO;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$KB_DEDUCTION_SUPPORTS;
  private static final SubLString $str27$Return_the_supports_for_DEDUCTION;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$KB_DEDUCTION_BINDINGS;
  private static final SubLString $str30$Return_the_bindings_for_DEDUCTION;
  private static final SubLSymbol $sym31$KB_DEDUCTION_PRAGMATIC_SUPPORT_MTS;
  private static final SubLString $str32$Return_the_pragmatic_support_mts_;
  private static final SubLSymbol $sym33$KB_DEDUCTION_TRUTH;
  private static final SubLString $str34$Return_the_truth_for_DEDUCTION_;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$KB_DEDUCTION_STRENGTH;
  private static final SubLString $str37$Return_the_strength_for_DEDUCTION;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$KB_SET_DEDUCTION_STRENGTH;
  private static final SubLList $list40;
  private static final SubLString $str41$Change_the_strength_of_DEDUCTION_;
  private static final SubLList $list42;

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 1118L)
  public static SubLObject kb_create_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    enforceType( assertion, $sym0$SUPPORT_P );
    enforceType( supports, $sym1$HL_JUSTIFICATION_P );
    enforceType( truth, $sym2$TRUTH_P );
    enforceType( strength, $sym3$EL_STRENGTH_P );
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym4$KB_CREATE_DEDUCTION, assertion, supports, truth, strength, v_bindings, pragmatic_support_mts, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_anywhereP() )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
        final SubLObject deduction = ( NIL != hl_interface_infrastructure.hl_modify_remoteP() ) ? kb_create_deduction_remote( assertion, supports, truth, strength, v_bindings, pragmatic_support_mts )
            : kb_create_deduction_local( assertion, supports, truth, strength, v_bindings, pragmatic_support_mts );
        kb_modification_event.post_kb_modify_create_new_deduction_event( assertion, supports, truth, strength, v_bindings, pragmatic_support_mts );
        hl_transcript_tracing.note_hlt_find_or_create_deduction( deduction );
        hl_interface_infrastructure.define_hl_modifier_postamble();
        return deduction;
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 2094L)
  public static SubLObject kb_create_deduction_remote(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym10$KB_CREATE_DEDUCTION_KB_STORE, list_utilities.quotify( assertion ), list_utilities.quotify( supports ),
        list_utilities.quotify( truth ), list_utilities.quotify( strength ), list_utilities.quotify( v_bindings ), list_utilities.quotify( pragmatic_support_mts ) ) );
    SubLObject deduction = NIL;
    final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
    try
    {
      hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
      deduction = deductions_low.kb_create_deduction_cyc( internal_id );
      if( NIL != hl_interface_infrastructure.hl_modify_localP() )
      {
        deductions_low.kb_create_deduction_int( deduction, internal_id, assertion, supports, truth, strength, v_bindings, pragmatic_support_mts );
      }
    }
    finally
    {
      hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
    }
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 2706L)
  public static SubLObject kb_create_deduction_local(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    final SubLObject internal_id = deductions_low.kb_create_deduction_kb_store( assertion, supports, truth, strength, v_bindings, pragmatic_support_mts );
    return deduction_handles.find_deduction_by_id( internal_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 3243L)
  public static SubLObject kb_remove_deduction(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( deduction, $sym11$DEDUCTION_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym12$KB_REMOVE_DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym12$KB_REMOVE_DEDUCTION, ConsesLow.list( $sym13$QUOTE, deduction ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          kb_modification_event.post_kb_modify_remove_deduction_event( deduction );
          deductions_low.remove_deduction_dependents( deduction );
          final SubLObject deduction_supported_object = deductions_high.deduction_supported_object( deduction );
          if( NIL != assertion_handles.assertion_p( deduction_supported_object ) )
          {
            if( NIL != assertion_handles.valid_assertionP( deduction_supported_object, UNPROVIDED ) )
            {
              assertions_low.remove_assertion_argument( deduction_supported_object, deduction );
            }
          }
          else if( NIL != arguments.hl_support_p( deduction_supported_object ) )
          {
            final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support( deduction_supported_object );
            if( NIL != kb_hl_support )
            {
              kb_hl_supports_low.kb_hl_support_remove_argument_int( kb_hl_support );
            }
          }
          return deductions_low.kb_remove_deduction_internal( deduction );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 4290L)
  public static SubLObject kb_lookup_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject truth)
  {
    enforceType( assertion, $sym0$SUPPORT_P );
    enforceType( supports, $sym1$HL_JUSTIFICATION_P );
    enforceType( truth, $sym2$TRUTH_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym18$KB_LOOKUP_DEDUCTION, ConsesLow.list( $sym13$QUOTE, assertion ), ConsesLow.list( $sym13$QUOTE, supports ), ConsesLow.list(
          $sym13$QUOTE, truth ) ) );
    }
    return deductions_low.find_deduction_internal( assertion, supports, truth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 4902L)
  public static SubLObject kb_deduction_supported_object(final SubLObject deduction)
  {
    enforceType( deduction, $sym11$DEDUCTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym23$KB_DEDUCTION_SUPPORTED_OBJECT, ConsesLow.list( $sym13$QUOTE, deduction ) ) );
    }
    return deductions_low.deduction_supported_object_internal( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 5324L)
  public static SubLObject kb_deduction_supports(final SubLObject deduction)
  {
    enforceType( deduction, $sym11$DEDUCTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym26$KB_DEDUCTION_SUPPORTS, ConsesLow.list( $sym13$QUOTE, deduction ) ) );
    }
    return deductions_low.deduction_supports_internal( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 5737L)
  public static SubLObject kb_deduction_bindings(final SubLObject deduction)
  {
    enforceType( deduction, $sym11$DEDUCTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym29$KB_DEDUCTION_BINDINGS, ConsesLow.list( $sym13$QUOTE, deduction ) ) );
    }
    return deductions_low.deduction_bindings_internal( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 6150L)
  public static SubLObject kb_deduction_pragmatic_support_mts(final SubLObject deduction)
  {
    enforceType( deduction, $sym11$DEDUCTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym31$KB_DEDUCTION_PRAGMATIC_SUPPORT_MTS, ConsesLow.list( $sym13$QUOTE, deduction ) ) );
    }
    return deductions_low.deduction_pragmatic_support_mts_internal( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 6615L)
  public static SubLObject kb_deduction_truth(final SubLObject deduction)
  {
    enforceType( deduction, $sym11$DEDUCTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym33$KB_DEDUCTION_TRUTH, ConsesLow.list( $sym13$QUOTE, deduction ) ) );
    }
    return deductions_low.deduction_truth_internal( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 7005L)
  public static SubLObject kb_deduction_strength(final SubLObject deduction)
  {
    enforceType( deduction, $sym11$DEDUCTION_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym36$KB_DEDUCTION_STRENGTH, ConsesLow.list( $sym13$QUOTE, deduction ) ) );
    }
    return deductions_low.deduction_strength_internal( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deductions-interface.lisp", position = 7413L)
  public static SubLObject kb_set_deduction_strength(final SubLObject deduction, final SubLObject new_strength)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( deduction, $sym11$DEDUCTION_P );
    enforceType( new_strength, $sym3$EL_STRENGTH_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym39$KB_SET_DEDUCTION_STRENGTH, deduction, new_strength, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym39$KB_SET_DEDUCTION_STRENGTH, ConsesLow.list( $sym13$QUOTE, deduction ), ConsesLow.list( $sym13$QUOTE, new_strength ) ) );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
      try
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
          final SubLObject old_strength = arguments.argument_strength( deduction );
          final SubLObject result_$1 = deductions_low.kb_set_deduction_strength_internal( deduction, new_strength );
          kb_modification_event.post_kb_modify_set_deduction_strength_event( deduction, old_strength, new_strength );
          return result_$1;
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  public static SubLObject declare_deductions_interface_file()
  {
    SubLFiles.declareFunction( me, "kb_create_deduction", "KB-CREATE-DEDUCTION", 4, 2, false );
    SubLFiles.declareFunction( me, "kb_create_deduction_remote", "KB-CREATE-DEDUCTION-REMOTE", 4, 2, false );
    SubLFiles.declareFunction( me, "kb_create_deduction_local", "KB-CREATE-DEDUCTION-LOCAL", 4, 2, false );
    SubLFiles.declareFunction( me, "kb_remove_deduction", "KB-REMOVE-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_lookup_deduction", "KB-LOOKUP-DEDUCTION", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_deduction_supported_object", "KB-DEDUCTION-SUPPORTED-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_deduction_supports", "KB-DEDUCTION-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_deduction_bindings", "KB-DEDUCTION-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_deduction_pragmatic_support_mts", "KB-DEDUCTION-PRAGMATIC-SUPPORT-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_deduction_truth", "KB-DEDUCTION-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_deduction_strength", "KB-DEDUCTION-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_set_deduction_strength", "KB-SET-DEDUCTION-STRENGTH", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_deductions_interface_file()
  {
    return NIL;
  }

  public static SubLObject setup_deductions_interface_file()
  {
    utilities_macros.register_cyc_api_function( $sym4$KB_CREATE_DEDUCTION, $list6, $str7$Create_a_new_deduction_consisting, $list8, $list9 );
    utilities_macros.register_cyc_api_function( $sym12$KB_REMOVE_DEDUCTION, $list14, $str15$Remove_DEDUCTION_from_the_KB__and, $list16, $list17 );
    utilities_macros.register_cyc_api_function( $sym18$KB_LOOKUP_DEDUCTION, $list19, $str20$Return_the_deduction_with_ASSERTI, $list21, $list22 );
    utilities_macros.register_cyc_api_function( $sym23$KB_DEDUCTION_SUPPORTED_OBJECT, $list14, $str24$Return_the_assertion_for_DEDUCTIO, $list16, $list25 );
    utilities_macros.register_cyc_api_function( $sym26$KB_DEDUCTION_SUPPORTS, $list14, $str27$Return_the_supports_for_DEDUCTION, $list16, $list28 );
    utilities_macros.register_cyc_api_function( $sym29$KB_DEDUCTION_BINDINGS, $list14, $str30$Return_the_bindings_for_DEDUCTION, $list16, $list28 );
    utilities_macros.register_cyc_api_function( $sym31$KB_DEDUCTION_PRAGMATIC_SUPPORT_MTS, $list14, $str32$Return_the_pragmatic_support_mts_, $list16, $list28 );
    utilities_macros.register_cyc_api_function( $sym33$KB_DEDUCTION_TRUTH, $list14, $str34$Return_the_truth_for_DEDUCTION_, $list16, $list35 );
    utilities_macros.register_cyc_api_function( $sym36$KB_DEDUCTION_STRENGTH, $list14, $str37$Return_the_strength_for_DEDUCTION, $list16, $list38 );
    utilities_macros.register_cyc_api_function( $sym39$KB_SET_DEDUCTION_STRENGTH, $list40, $str41$Change_the_strength_of_DEDUCTION_, $list42, $list9 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_deductions_interface_file();
  }

  @Override
  public void initializeVariables()
  {
    init_deductions_interface_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_deductions_interface_file();
  }
  static
  {
    me = new deductions_interface();
    $sym0$SUPPORT_P = makeSymbol( "SUPPORT-P" );
    $sym1$HL_JUSTIFICATION_P = makeSymbol( "HL-JUSTIFICATION-P" );
    $sym2$TRUTH_P = makeSymbol( "TRUTH-P" );
    $sym3$EL_STRENGTH_P = makeSymbol( "EL-STRENGTH-P" );
    $sym4$KB_CREATE_DEDUCTION = makeSymbol( "KB-CREATE-DEDUCTION" );
    $sym5$_EXIT = makeSymbol( "%EXIT" );
    $list6 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "SUPPORTS" ), makeSymbol( "TRUTH" ), makeSymbol( "STRENGTH" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "BINDINGS" ), makeSymbol(
        "PRAGMATIC-SUPPORT-MTS" ) );
    $str7$Create_a_new_deduction_consisting = makeString( "Create a new deduction consisting of SUPPORTS for ASSERTION.\n   TRUTH is the truth value of the deduction.\n   Hook up the indexing for the new deduction." );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "SUPPORT-P" ) ), ConsesLow.list( makeSymbol( "SUPPORTS" ), makeSymbol( "HL-JUSTIFICATION-P" ) ), ConsesLow.list( makeSymbol( "TRUTH" ),
        makeSymbol( "TRUTH-P" ) ), ConsesLow.list( makeSymbol( "STRENGTH" ), makeSymbol( "EL-STRENGTH-P" ) ) );
    $list9 = ConsesLow.list( makeSymbol( "DEDUCTION-P" ) );
    $sym10$KB_CREATE_DEDUCTION_KB_STORE = makeSymbol( "KB-CREATE-DEDUCTION-KB-STORE" );
    $sym11$DEDUCTION_P = makeSymbol( "DEDUCTION-P" );
    $sym12$KB_REMOVE_DEDUCTION = makeSymbol( "KB-REMOVE-DEDUCTION" );
    $sym13$QUOTE = makeSymbol( "QUOTE" );
    $list14 = ConsesLow.list( makeSymbol( "DEDUCTION" ) );
    $str15$Remove_DEDUCTION_from_the_KB__and = makeString( "Remove DEDUCTION from the KB, and unhook its indexing." );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEDUCTION" ), makeSymbol( "DEDUCTION-P" ) ) );
    $list17 = ConsesLow.list( makeSymbol( "NULL" ) );
    $sym18$KB_LOOKUP_DEDUCTION = makeSymbol( "KB-LOOKUP-DEDUCTION" );
    $list19 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "SUPPORTS" ), makeSymbol( "TRUTH" ) );
    $str20$Return_the_deduction_with_ASSERTI = makeString( "Return the deduction with ASSERTION, SUPPORTS, and TRUTH, if it exists.\n   Return NIL otherwise." );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "SUPPORT-P" ) ), ConsesLow.list( makeSymbol( "SUPPORTS" ), makeSymbol( "HL-JUSTIFICATION-P" ) ), ConsesLow.list( makeSymbol( "TRUTH" ),
        makeSymbol( "TRUTH-P" ) ) );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "DEDUCTION-P" ) ) );
    $sym23$KB_DEDUCTION_SUPPORTED_OBJECT = makeSymbol( "KB-DEDUCTION-SUPPORTED-OBJECT" );
    $str24$Return_the_assertion_for_DEDUCTIO = makeString( "Return the assertion for DEDUCTION." );
    $list25 = ConsesLow.list( makeSymbol( "SUPPORT-P" ) );
    $sym26$KB_DEDUCTION_SUPPORTS = makeSymbol( "KB-DEDUCTION-SUPPORTS" );
    $str27$Return_the_supports_for_DEDUCTION = makeString( "Return the supports for DEDUCTION." );
    $list28 = ConsesLow.list( makeSymbol( "HL-JUSTIFICATION-P" ) );
    $sym29$KB_DEDUCTION_BINDINGS = makeSymbol( "KB-DEDUCTION-BINDINGS" );
    $str30$Return_the_bindings_for_DEDUCTION = makeString( "Return the bindings for DEDUCTION." );
    $sym31$KB_DEDUCTION_PRAGMATIC_SUPPORT_MTS = makeSymbol( "KB-DEDUCTION-PRAGMATIC-SUPPORT-MTS" );
    $str32$Return_the_pragmatic_support_mts_ = makeString( "Return the pragmatic-support-mts for DEDUCTION." );
    $sym33$KB_DEDUCTION_TRUTH = makeSymbol( "KB-DEDUCTION-TRUTH" );
    $str34$Return_the_truth_for_DEDUCTION_ = makeString( "Return the truth for DEDUCTION." );
    $list35 = ConsesLow.list( makeSymbol( "TRUTH-P" ) );
    $sym36$KB_DEDUCTION_STRENGTH = makeSymbol( "KB-DEDUCTION-STRENGTH" );
    $str37$Return_the_strength_for_DEDUCTION = makeString( "Return the strength for DEDUCTION." );
    $list38 = ConsesLow.list( makeSymbol( "EL-STRENGTH-P" ) );
    $sym39$KB_SET_DEDUCTION_STRENGTH = makeSymbol( "KB-SET-DEDUCTION-STRENGTH" );
    $list40 = ConsesLow.list( makeSymbol( "DEDUCTION" ), makeSymbol( "NEW-STRENGTH" ) );
    $str41$Change_the_strength_of_DEDUCTION_ = makeString( "Change the strength of DEDUCTION to NEW-STRENGTH." );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEDUCTION" ), makeSymbol( "DEDUCTION-P" ) ), ConsesLow.list( makeSymbol( "NEW-STRENGTH" ), makeSymbol( "EL-STRENGTH-P" ) ) );
  }
}
/*
 * 
 * Total time: 162 ms
 * 
 */