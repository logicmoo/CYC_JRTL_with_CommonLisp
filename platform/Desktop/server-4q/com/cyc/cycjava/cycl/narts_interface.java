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

public final class narts_interface
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.narts_interface";
  public static final String myFingerPrint = "5096c7b79213d9f24c421ef05c86f2d12d69676ed0353e68c4ac4d4b1d46806e";
  private static final SubLSymbol $sym0$NAT_FORMULA_P;
  private static final SubLSymbol $sym1$KB_CREATE_NART;
  private static final SubLSymbol $sym2$_EXIT;
  private static final SubLList $list3;
  private static final SubLString $str4$Create_a_new_NART_to_implement_NA;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$KB_CREATE_NART_KB_STORE;
  private static final SubLSymbol $sym8$NART_P;
  private static final SubLSymbol $sym9$KB_REMOVE_NART;
  private static final SubLSymbol $sym10$QUOTE;
  private static final SubLList $list11;
  private static final SubLString $str12$Remove_NART_from_the_KB_;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$KB_NART_HL_FORMULA;
  private static final SubLString $str16$Return_the_hl_formula_of_this_NAR;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$POSSIBLY_NAUT_P;
  private static final SubLSymbol $sym19$KB_LOOKUP_NART;
  private static final SubLString $str20$Return_the_NART_implementing_NART;
  private static final SubLList $list21;
  private static final SubLList $list22;

  @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 949L)
  public static SubLObject kb_create_nart(final SubLObject nart_hl_formula)
  {
    enforceType( nart_hl_formula, $sym0$NAT_FORMULA_P );
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym1$KB_CREATE_NART, nart_hl_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_anywhereP() )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
        hl_transcript_tracing.note_hlt_find_or_create_nart( nart_hl_formula );
        final SubLObject nart = ( NIL != hl_interface_infrastructure.hl_modify_remoteP() ) ? kb_create_nart_remote( nart_hl_formula ) : kb_create_nart_local( nart_hl_formula );
        kb_modification_event.post_kb_modify_create_nart_event( nart_hl_formula );
        hl_interface_infrastructure.define_hl_modifier_postamble();
        return nart;
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

  @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 1498L)
  public static SubLObject kb_create_nart_remote(final SubLObject nart_hl_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym7$KB_CREATE_NART_KB_STORE, list_utilities.quotify( nart_hl_formula ) ) );
    SubLObject nart = NIL;
    final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
    try
    {
      hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
      nart = narts_low.kb_create_nart_cyc( internal_id );
      if( NIL != hl_interface_infrastructure.hl_modify_localP() )
      {
        narts_low.kb_create_nart_int( nart, internal_id, nart_hl_formula );
      }
    }
    finally
    {
      hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
    }
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 1858L)
  public static SubLObject kb_create_nart_local(final SubLObject nart_hl_formula)
  {
    final SubLObject internal_id = narts_low.kb_create_nart_kb_store( nart_hl_formula );
    return nart_handles.find_nart_by_id( internal_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 2062L)
  public static SubLObject kb_remove_nart(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( nart, $sym8$NART_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym9$KB_REMOVE_NART, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym9$KB_REMOVE_NART, ConsesLow.list( $sym10$QUOTE, nart ) ) );
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
          hl_transcript_tracing.note_hlt_remove_nart( nart );
          kb_modification_event.post_kb_modify_remove_nart_event( nart );
          return narts_low.kb_remove_nart_internal( nart );
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

  @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 2375L)
  public static SubLObject kb_nart_hl_formula(final SubLObject nart)
  {
    enforceType( nart, $sym8$NART_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym15$KB_NART_HL_FORMULA, ConsesLow.list( $sym10$QUOTE, nart ) ) );
    }
    return narts_low.nart_hl_formula_internal( nart );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 2608L)
  public static SubLObject kb_lookup_nart(final SubLObject nart_hl_formula)
  {
    enforceType( nart_hl_formula, $sym18$POSSIBLY_NAUT_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym19$KB_LOOKUP_NART, ConsesLow.list( $sym10$QUOTE, nart_hl_formula ) ) );
    }
    return narts_low.lookup_nart_internal( nart_hl_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 2931L)
  public static SubLObject initialize_nart_hl_formulas()
  {
    return narts_low.initialize_nart_hl_formulas_internal();
  }

  @SubLTranslatedFile.SubL(source = "cycl/narts-interface.lisp", position = 3244L)
  public static SubLObject rebuild_nart_hl_formulas()
  {
    return initialize_nart_hl_formulas();
  }

  public static SubLObject declare_narts_interface_file()
  {
    SubLFiles.declareFunction( me, "kb_create_nart", "KB-CREATE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_create_nart_remote", "KB-CREATE-NART-REMOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_create_nart_local", "KB-CREATE-NART-LOCAL", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_remove_nart", "KB-REMOVE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_nart_hl_formula", "KB-NART-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_lookup_nart", "KB-LOOKUP-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_nart_hl_formulas", "INITIALIZE-NART-HL-FORMULAS", 0, 0, false );
    SubLFiles.declareFunction( me, "rebuild_nart_hl_formulas", "REBUILD-NART-HL-FORMULAS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_narts_interface_file()
  {
    return NIL;
  }

  public static SubLObject setup_narts_interface_file()
  {
    utilities_macros.register_cyc_api_function( $sym1$KB_CREATE_NART, $list3, $str4$Create_a_new_NART_to_implement_NA, $list5, $list6 );
    utilities_macros.register_cyc_api_function( $sym9$KB_REMOVE_NART, $list11, $str12$Remove_NART_from_the_KB_, $list13, $list14 );
    utilities_macros.register_cyc_api_function( $sym15$KB_NART_HL_FORMULA, $list11, $str16$Return_the_hl_formula_of_this_NAR, $list13, $list17 );
    utilities_macros.register_cyc_api_function( $sym19$KB_LOOKUP_NART, $list3, $str20$Return_the_NART_implementing_NART, $list21, $list22 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_narts_interface_file();
  }

  @Override
  public void initializeVariables()
  {
    init_narts_interface_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_narts_interface_file();
  }
  static
  {
    me = new narts_interface();
    $sym0$NAT_FORMULA_P = makeSymbol( "NAT-FORMULA-P" );
    $sym1$KB_CREATE_NART = makeSymbol( "KB-CREATE-NART" );
    $sym2$_EXIT = makeSymbol( "%EXIT" );
    $list3 = ConsesLow.list( makeSymbol( "NART-HL-FORMULA" ) );
    $str4$Create_a_new_NART_to_implement_NA = makeString( "Create a new NART to implement NART-HL-FORMULA." );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "NART-HL-FORMULA" ), makeSymbol( "NAT-FORMULA-P" ) ) );
    $list6 = ConsesLow.list( makeSymbol( "NART-P" ) );
    $sym7$KB_CREATE_NART_KB_STORE = makeSymbol( "KB-CREATE-NART-KB-STORE" );
    $sym8$NART_P = makeSymbol( "NART-P" );
    $sym9$KB_REMOVE_NART = makeSymbol( "KB-REMOVE-NART" );
    $sym10$QUOTE = makeSymbol( "QUOTE" );
    $list11 = ConsesLow.list( makeSymbol( "NART" ) );
    $str12$Remove_NART_from_the_KB_ = makeString( "Remove NART from the KB." );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "NART" ), makeSymbol( "NART-P" ) ) );
    $list14 = ConsesLow.list( makeSymbol( "NULL" ) );
    $sym15$KB_NART_HL_FORMULA = makeSymbol( "KB-NART-HL-FORMULA" );
    $str16$Return_the_hl_formula_of_this_NAR = makeString( "Return the hl formula of this NART." );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CONSP" ) ) );
    $sym18$POSSIBLY_NAUT_P = makeSymbol( "POSSIBLY-NAUT-P" );
    $sym19$KB_LOOKUP_NART = makeSymbol( "KB-LOOKUP-NART" );
    $str20$Return_the_NART_implementing_NART = makeString( "Return the NART implementing NART-HL-FORMULA, or NIL if none is present.\n   No substitutions for sub-NARTs are performed." );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "NART-HL-FORMULA" ), makeSymbol( "POSSIBLY-NAUT-P" ) ) );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "NART-P" ) ) );
  }
}
/*
 * 
 * Total time: 71 ms
 * 
 */