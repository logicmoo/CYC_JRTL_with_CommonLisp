//
//
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

public final class constants_interface
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constants_interface";
  public static final String myFingerPrint = "2d7b06f67b648f832aefc136cf237bf02a1a0327c3ee539fc756754ec74c53da";
  private static final SubLSymbol $sym0$CONSTANT_NAME_SPEC_P;
  private static final SubLSymbol $sym1$CONSTANT_EXTERNAL_ID_P;
  private static final SubLSymbol $sym2$KB_CREATE_CONSTANT;
  private static final SubLSymbol $sym3$_EXIT;
  private static final SubLList $list4;
  private static final SubLString $str5$Return_a_new_constant_named_NAME_;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$KB_CREATE_CONSTANT_KB_STORE;
  private static final SubLSymbol $sym9$CONSTANT_P;
  private static final SubLSymbol $sym10$KB_REMOVE_CONSTANT;
  private static final SubLSymbol $sym11$QUOTE;
  private static final SubLList $list12;
  private static final SubLString $str13$Remove_CONSTANT_from_the_KB_;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$STRINGP;
  private static final SubLSymbol $sym17$KB_LOOKUP_CONSTANT_BY_NAME;
  private static final SubLList $list18;
  private static final SubLString $str19$Return_the_constant_named_NAME__i;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$KB_CONSTANT_NAME;
  private static final SubLString $str23$Return_the_name_for_CONSTANT_;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$GUID_P;
  private static final SubLSymbol $sym26$KB_LOOKUP_CONSTANT_BY_GUID;
  private static final SubLList $list27;
  private static final SubLString $str28$Return_the_constant_with_GUID__if;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$KB_CONSTANT_GUID;
  private static final SubLString $str31$Return_the_external_ID_for_CONSTA;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$KB_CONSTANT_MERGED_GUID;
  private static final SubLString $str34$Return_the_external_merged_ID_for;
  private static final SubLSymbol $sym35$VALID_CONSTANT_NAME_P;
  private static final SubLSymbol $sym36$KB_RENAME_CONSTANT;
  private static final SubLList $list37;
  private static final SubLString $str38$Rename_CONSTANT_to_have_NEW_NAME_;
  private static final SubLList $list39;
  private static final SubLList $list40;

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 857L)
  public static SubLObject kb_create_constant(final SubLObject name, final SubLObject external_id)
  {
    enforceType( name, $sym0$CONSTANT_NAME_SPEC_P );
    enforceType( external_id, $sym1$CONSTANT_EXTERNAL_ID_P );
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym2$KB_CREATE_CONSTANT, name, external_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_anywhereP() )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
        final SubLObject constant = ( NIL != hl_interface_infrastructure.hl_modify_remoteP() ) ? kb_create_constant_remote( name, external_id ) : kb_create_constant_local( name, external_id );
        kb_modification_event.post_kb_modify_create_constant_event( name, external_id );
        hl_transcript_tracing.note_hlt_find_or_create( constant );
        hl_interface_infrastructure.define_hl_modifier_postamble();
        return constant;
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

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 1556L)
  public static SubLObject kb_create_constant_remote(final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym8$KB_CREATE_CONSTANT_KB_STORE, list_utilities.quotify( name ), list_utilities.quotify( external_id ) ) );
    SubLObject constant = NIL;
    final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
    try
    {
      hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
      constant = constants_low.kb_create_constant_cyc( name, internal_id );
      if( NIL != hl_interface_infrastructure.hl_modify_localP() )
      {
        constants_low.kb_create_constant_int( constant, name, external_id );
      }
    }
    finally
    {
      hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 1955L)
  public static SubLObject kb_create_constant_local(final SubLObject name, final SubLObject external_id)
  {
    final SubLObject internal_id = constants_low.kb_create_constant_kb_store( name, external_id );
    return constants_high.find_constant_by_internal_id( internal_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 2373L)
  public static SubLObject kb_remove_constant(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( constant, $sym9$CONSTANT_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym10$KB_REMOVE_CONSTANT, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym10$KB_REMOVE_CONSTANT, ConsesLow.list( $sym11$QUOTE, constant ) ) );
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
          hl_transcript_tracing.note_hlt_remove_constant( constant );
          kb_modification_event.post_kb_modify_remove_constant_event( constant );
          return constants_low.kb_remove_constant_internal( constant );
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

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 2907L)
  public static SubLObject kb_lookup_constant_by_name(final SubLObject name)
  {
    enforceType( name, $sym16$STRINGP );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym17$KB_LOOKUP_CONSTANT_BY_NAME, ConsesLow.list( $sym11$QUOTE, name ) ) );
    }
    return constant_completion_low.constant_shell_from_name( name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 3443L)
  public static SubLObject kb_constant_name(final SubLObject constant)
  {
    enforceType( constant, $sym9$CONSTANT_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym22$KB_CONSTANT_NAME, ConsesLow.list( $sym11$QUOTE, constant ) ) );
    }
    return constants_low.constant_name_internal( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 3713L)
  public static SubLObject kb_lookup_constant_by_guid(final SubLObject guid)
  {
    enforceType( guid, $sym25$GUID_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym26$KB_LOOKUP_CONSTANT_BY_GUID, ConsesLow.list( $sym11$QUOTE, guid ) ) );
    }
    return constants_low.lookup_constant_by_guid( guid );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 4142L)
  public static SubLObject kb_constant_guid(final SubLObject constant)
  {
    enforceType( constant, $sym9$CONSTANT_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym30$KB_CONSTANT_GUID, ConsesLow.list( $sym11$QUOTE, constant ) ) );
    }
    return constants_low.constant_guid_internal( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 4540L)
  public static SubLObject kb_constant_merged_guid(final SubLObject constant)
  {
    enforceType( constant, $sym9$CONSTANT_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym33$KB_CONSTANT_MERGED_GUID, ConsesLow.list( $sym11$QUOTE, constant ) ) );
    }
    return constants_low.constant_merged_guid_internal( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 4966L)
  public static SubLObject kb_rename_constant(final SubLObject constant, final SubLObject new_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( constant, $sym9$CONSTANT_P );
    enforceType( new_name, $sym35$VALID_CONSTANT_NAME_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym36$KB_RENAME_CONSTANT, constant, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym36$KB_RENAME_CONSTANT, ConsesLow.list( $sym11$QUOTE, constant ), ConsesLow.list( $sym11$QUOTE, new_name ) ) );
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
          final SubLObject old_name = constants_high.constant_name( constant );
          SubLObject result_$1 = NIL;
          hl_transcript_tracing.note_hlt_rename( constant, new_name );
          result_$1 = constants_low.kb_rename_constant_internal( constant, new_name );
          kb_modification_event.post_kb_modify_rename_constant_event( constant, old_name, new_name );
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

  @SubLTranslatedFile.SubL(source = "cycl/constants-interface.lisp", position = 5914L)
  public static SubLObject kb_new_constant_info_iterator(SubLObject buffer_size)
  {
    if( buffer_size == UNPROVIDED )
    {
      buffer_size = ONE_INTEGER;
    }
    return hl_interface_infrastructure.new_hl_store_iterator( $list40, buffer_size );
  }

  public static SubLObject declare_constants_interface_file()
  {
    SubLFiles.declareFunction(me, "kb_create_constant", "KB-CREATE-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_create_constant_remote", "KB-CREATE-CONSTANT-REMOTE", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_create_constant_local", "KB-CREATE-CONSTANT-LOCAL", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_remove_constant", "KB-REMOVE-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_lookup_constant_by_name", "KB-LOOKUP-CONSTANT-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_constant_name", "KB-CONSTANT-NAME", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_lookup_constant_by_guid", "KB-LOOKUP-CONSTANT-BY-GUID", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_constant_guid", "KB-CONSTANT-GUID", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_constant_merged_guid", "KB-CONSTANT-MERGED-GUID", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_rename_constant", "KB-RENAME-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_new_constant_info_iterator", "KB-NEW-CONSTANT-INFO-ITERATOR", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_constants_interface_file()
  {
    return NIL;
  }

  public static SubLObject setup_constants_interface_file()
  {
    utilities_macros.register_cyc_api_function( $sym2$KB_CREATE_CONSTANT, $list4, $str5$Return_a_new_constant_named_NAME_, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym10$KB_REMOVE_CONSTANT, $list12, $str13$Remove_CONSTANT_from_the_KB_, $list14, $list15 );
    utilities_macros.register_cyc_api_function( $sym17$KB_LOOKUP_CONSTANT_BY_NAME, $list18, $str19$Return_the_constant_named_NAME__i, $list20, $list21 );
    utilities_macros.register_cyc_api_function( $sym22$KB_CONSTANT_NAME, $list12, $str23$Return_the_name_for_CONSTANT_, $list14, $list24 );
    utilities_macros.register_cyc_api_function( $sym26$KB_LOOKUP_CONSTANT_BY_GUID, $list27, $str28$Return_the_constant_with_GUID__if, $list29, $list21 );
    utilities_macros.register_cyc_api_function( $sym30$KB_CONSTANT_GUID, $list12, $str31$Return_the_external_ID_for_CONSTA, $list14, $list32 );
    utilities_macros.register_cyc_api_function( $sym33$KB_CONSTANT_MERGED_GUID, $list12, $str34$Return_the_external_merged_ID_for, $list14, $list32 );
    utilities_macros.register_cyc_api_function( $sym36$KB_RENAME_CONSTANT, $list37, $str38$Rename_CONSTANT_to_have_NEW_NAME_, $list39, $list7 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_constants_interface_file();
  }

  @Override
  public void initializeVariables()
  {
    init_constants_interface_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_constants_interface_file();
  }
  static
  {
    me = new constants_interface();
    $sym0$CONSTANT_NAME_SPEC_P = makeSymbol( "CONSTANT-NAME-SPEC-P" );
    $sym1$CONSTANT_EXTERNAL_ID_P = makeSymbol( "CONSTANT-EXTERNAL-ID-P" );
    $sym2$KB_CREATE_CONSTANT = makeSymbol( "KB-CREATE-CONSTANT" );
    $sym3$_EXIT = makeSymbol( "%EXIT" );
    $list4 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "EXTERNAL-ID" ) );
    $str5$Return_a_new_constant_named_NAME_ = makeString( "Return a new constant named NAME with EXTERNAL-ID.\n   If NAME is :unnamed, returns a constant with no name." );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "CONSTANT-NAME-SPEC-P" ) ), ConsesLow.list( makeSymbol( "EXTERNAL-ID" ), makeSymbol( "CONSTANT-EXTERNAL-ID-P" ) ) );
    $list7 = ConsesLow.list( makeSymbol( "CONSTANT-P" ) );
    $sym8$KB_CREATE_CONSTANT_KB_STORE = makeSymbol( "KB-CREATE-CONSTANT-KB-STORE" );
    $sym9$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym10$KB_REMOVE_CONSTANT = makeSymbol( "KB-REMOVE-CONSTANT" );
    $sym11$QUOTE = makeSymbol( "QUOTE" );
    $list12 = ConsesLow.list( makeSymbol( "CONSTANT" ) );
    $str13$Remove_CONSTANT_from_the_KB_ = makeString( "Remove CONSTANT from the KB." );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "CONSTANT-P" ) ) );
    $list15 = ConsesLow.list( makeSymbol( "NULL" ) );
    $sym16$STRINGP = makeSymbol( "STRINGP" );
    $sym17$KB_LOOKUP_CONSTANT_BY_NAME = makeSymbol( "KB-LOOKUP-CONSTANT-BY-NAME" );
    $list18 = ConsesLow.list( makeSymbol( "NAME" ) );
    $str19$Return_the_constant_named_NAME__i = makeString( "Return the constant named NAME, if it exists.\n   Return NIL otherwise." );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "STRINGP" ) ) );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CONSTANT-P" ) ) );
    $sym22$KB_CONSTANT_NAME = makeSymbol( "KB-CONSTANT-NAME" );
    $str23$Return_the_name_for_CONSTANT_ = makeString( "Return the name for CONSTANT." );
    $list24 = ConsesLow.list( makeSymbol( "CONSTANT-NAME-SPEC-P" ) );
    $sym25$GUID_P = makeSymbol( "GUID-P" );
    $sym26$KB_LOOKUP_CONSTANT_BY_GUID = makeSymbol( "KB-LOOKUP-CONSTANT-BY-GUID" );
    $list27 = ConsesLow.list( makeSymbol( "GUID" ) );
    $str28$Return_the_constant_with_GUID__if = makeString( "Return the constant with GUID, if it exists.\n   Return NIL otherwise." );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "GUID" ), makeSymbol( "GUID-P" ) ) );
    $sym30$KB_CONSTANT_GUID = makeSymbol( "KB-CONSTANT-GUID" );
    $str31$Return_the_external_ID_for_CONSTA = makeString( "Return the external ID for CONSTANT." );
    $list32 = ConsesLow.list( makeSymbol( "CONSTANT-EXTERNAL-ID-P" ) );
    $sym33$KB_CONSTANT_MERGED_GUID = makeSymbol( "KB-CONSTANT-MERGED-GUID" );
    $str34$Return_the_external_merged_ID_for = makeString( "Return the external merged ID for CONSTANT." );
    $sym35$VALID_CONSTANT_NAME_P = makeSymbol( "VALID-CONSTANT-NAME-P" );
    $sym36$KB_RENAME_CONSTANT = makeSymbol( "KB-RENAME-CONSTANT" );
    $list37 = ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "NEW-NAME" ) );
    $str38$Rename_CONSTANT_to_have_NEW_NAME_ = makeString( "Rename CONSTANT to have NEW-NAME as its name.  The constant is returned." );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "CONSTANT-P" ) ), ConsesLow.list( makeSymbol( "NEW-NAME" ), SubLObjectFactory.makeSymbol( "VALID-CONSTANT-NAME-P" ) ) );
    $list40 = ConsesLow.list( makeSymbol( "KB-NEW-CONSTANT-INFO-ITERATOR-INTERNAL" ) );
  }
}
