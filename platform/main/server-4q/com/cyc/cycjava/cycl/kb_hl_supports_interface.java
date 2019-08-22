package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_hl_supports_interface
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_hl_supports_interface";
  public static final String myFingerPrint = "c62f5fd04970e3066938be2c199806787b756d8ef725cb0a3ed8f73b5eec0a80";
  private static final SubLSymbol $sym0$HL_SUPPORT_P;
  private static final SubLSymbol $sym1$HL_JUSTIFICATION_P;
  private static final SubLSymbol $sym2$KB_CREATE_KB_HL_SUPPORT;
  private static final SubLSymbol $sym3$_EXIT;
  private static final SubLList $list4;
  private static final SubLString $str5$Create_a_new_KB_HL_support_consis;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$KB_CREATE_KB_HL_SUPPORT_KB_STORE;
  private static final SubLSymbol $sym9$KB_HL_SUPPORT_P;
  private static final SubLSymbol $sym10$KB_REMOVE_KB_HL_SUPPORT;
  private static final SubLSymbol $sym11$QUOTE;
  private static final SubLList $list12;
  private static final SubLString $str13$Remove_KB_HL_SUPPORT_from_the_KB_;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$KB_LOOKUP_KB_HL_SUPPORT;
  private static final SubLList $list17;
  private static final SubLString $str18$Return_the_kb_hl_support_with_HL_;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$INDEXED_TERM_P;
  private static final SubLSymbol $sym22$KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM;
  private static final SubLList $list23;
  private static final SubLString $str24$Return_a_list_of_kb_hl_supports_m;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$KB_KB_HL_SUPPORT_ARGUMENT;
  private static final SubLString $str28$Return_the_argument_for_KB_HL_SUP;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$KB_KB_HL_SUPPORT_ARGUMENTS;
  private static final SubLString $str31$Return_the_arguments_for_KB_HL_SU;
  private static final SubLSymbol $sym32$KB_KB_HL_SUPPORT_DEPENDENTS;
  private static final SubLString $str33$Return_the_dependents_for_KB_HL_S;
  private static final SubLSymbol $sym34$KB_REJUSTIFY_KB_HL_SUPPORT;
  private static final SubLString $str35$Perform_TMS_on_KB_HL_SUPPORT_____;
  private static final SubLSymbol $sym36$KB_KB_HL_SUPPORT_SET_ARGUMENT;
  private static final SubLList $list37;
  private static final SubLString $str38$Replace_the_dependents_of_KB_HL_S;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$KB_KB_HL_SUPPORT_ADD_DEPENDENT;
  private static final SubLList $list41;
  private static final SubLString $str42$Add_a_dependent_to_KB_HL_SUPPORT;
  private static final SubLSymbol $sym43$KB_KB_HL_SUPPORT_SET_DEPENDENTS;
  private static final SubLList $list44;

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 1188L)
  public static SubLObject kb_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification)
  {
    enforceType( hl_support, $sym0$HL_SUPPORT_P );
    enforceType( justification, $sym1$HL_JUSTIFICATION_P );
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym2$KB_CREATE_KB_HL_SUPPORT, hl_support, justification, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_anywhereP() )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
        final SubLObject kb_hl_support = ( NIL != hl_interface_infrastructure.hl_modify_remoteP() ) ? kb_create_kb_hl_support_remote( hl_support, justification )
            : kb_create_kb_hl_support_local( hl_support, justification );
        kb_modification_event.post_kb_modify_create_new_kb_hl_support_event( hl_support, justification );
        hl_transcript_tracing.note_hlt_find_or_create_kb_hl_support( kb_hl_support );
        hl_interface_infrastructure.define_hl_modifier_postamble();
        return kb_hl_support;
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

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 1913L)
  public static SubLObject kb_create_kb_hl_support_remote(final SubLObject hl_support, final SubLObject justification)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject internal_id = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym8$KB_CREATE_KB_HL_SUPPORT_KB_STORE, list_utilities.quotify( hl_support ), list_utilities.quotify(
        justification ) ) );
    SubLObject kb_hl_support = NIL;
    final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding( thread );
    try
    {
      hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind( T, thread );
      kb_hl_support = kb_hl_supports_low.kb_create_kb_hl_support_cyc( internal_id );
      if( NIL != hl_interface_infrastructure.hl_modify_localP() )
      {
        kb_hl_supports_low.kb_create_kb_hl_support_int( kb_hl_support, internal_id, hl_support, justification );
      }
    }
    finally
    {
      hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind( _prev_bind_0, thread );
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 2383L)
  public static SubLObject kb_create_kb_hl_support_local(final SubLObject hl_support, final SubLObject justification)
  {
    final SubLObject internal_id = kb_hl_supports_low.kb_create_kb_hl_support_kb_store( hl_support, justification );
    return kb_hl_support_handles.find_kb_hl_support_by_id( internal_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 2897L)
  public static SubLObject kb_remove_kb_hl_support(final SubLObject kb_hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( kb_hl_support, $sym9$KB_HL_SUPPORT_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym10$KB_REMOVE_KB_HL_SUPPORT, kb_hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym10$KB_REMOVE_KB_HL_SUPPORT, ConsesLow.list( $sym11$QUOTE, kb_hl_support ) ) );
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
          kb_modification_event.post_kb_modify_remove_kb_hl_support_event( kb_hl_support );
          kb_hl_supports_low.destroy_kb_hl_support_int( kb_hl_support );
          return NIL;
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

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 3534L)
  public static SubLObject kb_lookup_kb_hl_support(final SubLObject hl_support)
  {
    enforceType( hl_support, $sym0$HL_SUPPORT_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym16$KB_LOOKUP_KB_HL_SUPPORT, ConsesLow.list( $sym11$QUOTE, hl_support ) ) );
    }
    final SubLObject kb_hl_support = kb_hl_supports_low.find_kb_hl_support_during_creation_int( hl_support );
    return ( NIL != kb_hl_support ) ? kb_hl_support : kb_hl_supports_low.lookup_kb_hl_support_int( hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 4232L)
  public static SubLObject kb_lookup_kb_hl_supports_mentioning_term(final SubLObject v_term)
  {
    enforceType( v_term, $sym21$INDEXED_TERM_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym22$KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM, ConsesLow.list( $sym11$QUOTE, v_term ) ) );
    }
    return kb_hl_supports_low.lookup_kb_hl_supports_mentioning_term_int( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 4831L)
  public static SubLObject kb_kb_hl_support_argument(final SubLObject kb_hl_support)
  {
    enforceType( kb_hl_support, $sym9$KB_HL_SUPPORT_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym27$KB_KB_HL_SUPPORT_ARGUMENT, ConsesLow.list( $sym11$QUOTE, kb_hl_support ) ) );
    }
    return kb_hl_support_handles.kb_hl_support_argument_int( kb_hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 5335L)
  public static SubLObject kb_kb_hl_support_arguments(final SubLObject kb_hl_support)
  {
    enforceType( kb_hl_support, $sym9$KB_HL_SUPPORT_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym30$KB_KB_HL_SUPPORT_ARGUMENTS, ConsesLow.list( $sym11$QUOTE, kb_hl_support ) ) );
    }
    return kb_hl_support_handles.kb_hl_support_arguments_int( kb_hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 5885L)
  public static SubLObject kb_kb_hl_support_dependents(final SubLObject kb_hl_support)
  {
    enforceType( kb_hl_support, $sym9$KB_HL_SUPPORT_P );
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym32$KB_KB_HL_SUPPORT_DEPENDENTS, ConsesLow.list( $sym11$QUOTE, kb_hl_support ) ) );
    }
    return kb_hl_support_handles.kb_hl_support_dependents_int( kb_hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 6397L)
  public static SubLObject kb_rejustify_kb_hl_support(final SubLObject kb_hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( kb_hl_support, $sym9$KB_HL_SUPPORT_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym34$KB_REJUSTIFY_KB_HL_SUPPORT, kb_hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym34$KB_REJUSTIFY_KB_HL_SUPPORT, ConsesLow.list( $sym11$QUOTE, kb_hl_support ) ) );
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
          return kb_hl_supports_low.rejustify_kb_hl_support_int( kb_hl_support );
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

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 6987L)
  public static SubLObject kb_kb_hl_support_set_argument(final SubLObject kb_hl_support, final SubLObject argument)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( kb_hl_support, $sym9$KB_HL_SUPPORT_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym36$KB_KB_HL_SUPPORT_SET_ARGUMENT, kb_hl_support, argument, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym36$KB_KB_HL_SUPPORT_SET_ARGUMENT, ConsesLow.list( $sym11$QUOTE, kb_hl_support ), ConsesLow.list( $sym11$QUOTE, argument ) ) );
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
          kb_hl_supports_low.kb_hl_support_reset_argument_int( kb_hl_support, argument );
          return kb_hl_support;
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

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 7531L)
  public static SubLObject kb_kb_hl_support_add_dependent(final SubLObject kb_hl_support, final SubLObject dependent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( kb_hl_support, $sym9$KB_HL_SUPPORT_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym40$KB_KB_HL_SUPPORT_ADD_DEPENDENT, kb_hl_support, dependent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym40$KB_KB_HL_SUPPORT_ADD_DEPENDENT, ConsesLow.list( $sym11$QUOTE, kb_hl_support ), ConsesLow.list( $sym11$QUOTE, dependent ) ) );
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
          if( NIL != assertion_handles.assertion_p( dependent ) )
          {
            Errors.sublisp_break( UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY );
          }
          return kb_hl_supports_low.kb_hl_support_add_dependent_int( kb_hl_support, dependent );
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

  @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-interface.lisp", position = 8149L)
  public static SubLObject kb_kb_hl_support_set_dependents(final SubLObject kb_hl_support, final SubLObject dependents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( kb_hl_support, $sym9$KB_HL_SUPPORT_P );
    SubLObject result = NIL;
    hl_interface_infrastructure.define_hl_modifier_preamble();
    hl_interface_infrastructure.note_hl_modifier_invocation( $sym43$KB_KB_HL_SUPPORT_SET_DEPENDENTS, kb_hl_support, dependents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != hl_interface_infrastructure.hl_modify_remoteP() )
    {
      result = hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym43$KB_KB_HL_SUPPORT_SET_DEPENDENTS, ConsesLow.list( $sym11$QUOTE, kb_hl_support ), ConsesLow.list( $sym11$QUOTE, dependents ) ) );
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
          kb_hl_supports_low.kb_hl_support_clear_dependents_int( kb_hl_support );
          SubLObject cdolist_list_var = dependents;
          SubLObject dependent = NIL;
          dependent = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != assertion_handles.assertion_p( dependent ) )
            {
              Errors.sublisp_break( UNPROVIDED, EMPTY_SUBL_OBJECT_ARRAY );
            }
            kb_hl_supports_low.kb_hl_support_add_dependent_int( kb_hl_support, dependent );
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
          }
          return kb_hl_support;
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

  public static SubLObject declare_kb_hl_supports_interface_file()
  {
    SubLFiles.declareFunction( me, "kb_create_kb_hl_support", "KB-CREATE-KB-HL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_create_kb_hl_support_remote", "KB-CREATE-KB-HL-SUPPORT-REMOTE", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_create_kb_hl_support_local", "KB-CREATE-KB-HL-SUPPORT-LOCAL", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_remove_kb_hl_support", "KB-REMOVE-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_lookup_kb_hl_support", "KB-LOOKUP-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_lookup_kb_hl_supports_mentioning_term", "KB-LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_kb_hl_support_argument", "KB-KB-HL-SUPPORT-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_kb_hl_support_arguments", "KB-KB-HL-SUPPORT-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_kb_hl_support_dependents", "KB-KB-HL-SUPPORT-DEPENDENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_rejustify_kb_hl_support", "KB-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_kb_hl_support_set_argument", "KB-KB-HL-SUPPORT-SET-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_kb_hl_support_add_dependent", "KB-KB-HL-SUPPORT-ADD-DEPENDENT", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_kb_hl_support_set_dependents", "KB-KB-HL-SUPPORT-SET-DEPENDENTS", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_hl_supports_interface_file()
  {
    return NIL;
  }

  public static SubLObject setup_kb_hl_supports_interface_file()
  {
    utilities_macros.register_cyc_api_function( $sym2$KB_CREATE_KB_HL_SUPPORT, $list4, $str5$Create_a_new_KB_HL_support_consis, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym10$KB_REMOVE_KB_HL_SUPPORT, $list12, $str13$Remove_KB_HL_SUPPORT_from_the_KB_, $list14, $list15 );
    utilities_macros.register_cyc_api_function( $sym16$KB_LOOKUP_KB_HL_SUPPORT, $list17, $str18$Return_the_kb_hl_support_with_HL_, $list19, $list20 );
    utilities_macros.register_cyc_api_function( $sym22$KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM, $list23, $str24$Return_a_list_of_kb_hl_supports_m, $list25, $list26 );
    utilities_macros.register_cyc_api_function( $sym27$KB_KB_HL_SUPPORT_ARGUMENT, $list12, $str28$Return_the_argument_for_KB_HL_SUP, $list14, $list29 );
    utilities_macros.register_cyc_api_function( $sym30$KB_KB_HL_SUPPORT_ARGUMENTS, $list12, $str31$Return_the_arguments_for_KB_HL_SU, $list14, $list29 );
    utilities_macros.register_cyc_api_function( $sym32$KB_KB_HL_SUPPORT_DEPENDENTS, $list12, $str33$Return_the_dependents_for_KB_HL_S, $list14, $list29 );
    utilities_macros.register_cyc_api_function( $sym34$KB_REJUSTIFY_KB_HL_SUPPORT, $list12, $str35$Perform_TMS_on_KB_HL_SUPPORT_____, $list14, NIL );
    utilities_macros.register_cyc_api_function( $sym36$KB_KB_HL_SUPPORT_SET_ARGUMENT, $list37, $str38$Replace_the_dependents_of_KB_HL_S, $list14, $list39 );
    utilities_macros.register_cyc_api_function( $sym40$KB_KB_HL_SUPPORT_ADD_DEPENDENT, $list41, $str42$Add_a_dependent_to_KB_HL_SUPPORT, $list14, $list39 );
    utilities_macros.register_cyc_api_function( $sym43$KB_KB_HL_SUPPORT_SET_DEPENDENTS, $list44, $str38$Replace_the_dependents_of_KB_HL_S, $list14, $list39 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_hl_supports_interface_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_hl_supports_interface_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_hl_supports_interface_file();
  }
  static
  {
    me = new kb_hl_supports_interface();
    $sym0$HL_SUPPORT_P = makeSymbol( "HL-SUPPORT-P" );
    $sym1$HL_JUSTIFICATION_P = makeSymbol( "HL-JUSTIFICATION-P" );
    $sym2$KB_CREATE_KB_HL_SUPPORT = makeSymbol( "KB-CREATE-KB-HL-SUPPORT" );
    $sym3$_EXIT = makeSymbol( "%EXIT" );
    $list4 = ConsesLow.list( makeSymbol( "HL-SUPPORT" ), makeSymbol( "JUSTIFICATION" ) );
    $str5$Create_a_new_KB_HL_support_consis = makeString( "Create a new KB HL support consisting of JUSTIFICATION for HL-SUPPORT." );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "HL-SUPPORT" ), makeSymbol( "HL-SUPPORT-P" ) ), ConsesLow.list( makeSymbol( "JUSTIFICATION" ), makeSymbol( "HL-JUSTIFICATION-P" ) ) );
    $list7 = ConsesLow.list( makeSymbol( "KB-HL-SUPPORT-P" ) );
    $sym8$KB_CREATE_KB_HL_SUPPORT_KB_STORE = makeSymbol( "KB-CREATE-KB-HL-SUPPORT-KB-STORE" );
    $sym9$KB_HL_SUPPORT_P = makeSymbol( "KB-HL-SUPPORT-P" );
    $sym10$KB_REMOVE_KB_HL_SUPPORT = makeSymbol( "KB-REMOVE-KB-HL-SUPPORT" );
    $sym11$QUOTE = makeSymbol( "QUOTE" );
    $list12 = ConsesLow.list( makeSymbol( "KB-HL-SUPPORT" ) );
    $str13$Remove_KB_HL_SUPPORT_from_the_KB_ = makeString( "Remove KB-HL-SUPPORT from the KB, and unhook its indexing." );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "KB-HL-SUPPORT" ), makeSymbol( "KB-HL-SUPPORT-P" ) ) );
    $list15 = ConsesLow.list( makeSymbol( "NULL" ) );
    $sym16$KB_LOOKUP_KB_HL_SUPPORT = makeSymbol( "KB-LOOKUP-KB-HL-SUPPORT" );
    $list17 = ConsesLow.list( makeSymbol( "HL-SUPPORT" ) );
    $str18$Return_the_kb_hl_support_with_HL_ = makeString( "Return the kb-hl-support with HL-SUPPORT and JUSTIFICATION if it exists.\n   Return NIL otherwise." );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "HL-SUPPORT" ), makeSymbol( "HL-SUPPORT-P" ) ) );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "KB-HL-SUPPORT-P" ) ) );
    $sym21$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym22$KB_LOOKUP_KB_HL_SUPPORTS_MENTIONING_TERM = makeSymbol( "KB-LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM" );
    $list23 = ConsesLow.list( makeSymbol( "TERM" ) );
    $str24$Return_a_list_of_kb_hl_supports_m = makeString( "Return a list of kb-hl-supports mentioning TERM if any exists.\n   Return NIL otherwise." );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "INDEXED-TERM-P" ) ) );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "LISTP" ) ) );
    $sym27$KB_KB_HL_SUPPORT_ARGUMENT = makeSymbol( "KB-KB-HL-SUPPORT-ARGUMENT" );
    $str28$Return_the_argument_for_KB_HL_SUP = makeString( "Return the argument for KB-HL-SUPPORT." );
    $list29 = ConsesLow.list( makeSymbol( "HL-JUSTIFICATION-P" ) );
    $sym30$KB_KB_HL_SUPPORT_ARGUMENTS = makeSymbol( "KB-KB-HL-SUPPORT-ARGUMENTS" );
    $str31$Return_the_arguments_for_KB_HL_SU = makeString( "Return the arguments for KB-HL-SUPPORT." );
    $sym32$KB_KB_HL_SUPPORT_DEPENDENTS = makeSymbol( "KB-KB-HL-SUPPORT-DEPENDENTS" );
    $str33$Return_the_dependents_for_KB_HL_S = makeString( "Return the dependents for KB-HL-SUPPORT." );
    $sym34$KB_REJUSTIFY_KB_HL_SUPPORT = makeSymbol( "KB-REJUSTIFY-KB-HL-SUPPORT" );
    $str35$Perform_TMS_on_KB_HL_SUPPORT_____ = makeString( "Perform TMS on KB-HL-SUPPORT\n   @return kb-hl-support-p or :unjustifiable" );
    $sym36$KB_KB_HL_SUPPORT_SET_ARGUMENT = makeSymbol( "KB-KB-HL-SUPPORT-SET-ARGUMENT" );
    $list37 = ConsesLow.list( makeSymbol( "KB-HL-SUPPORT" ), makeSymbol( "ARGUMENT" ) );
    $str38$Replace_the_dependents_of_KB_HL_S = makeString( "Replace the dependents of KB-HL-SUPPORT" );
    $list39 = ConsesLow.list( makeSymbol( "BOOLEAN-P" ) );
    $sym40$KB_KB_HL_SUPPORT_ADD_DEPENDENT = makeSymbol( "KB-KB-HL-SUPPORT-ADD-DEPENDENT" );
    $list41 = ConsesLow.list( makeSymbol( "KB-HL-SUPPORT" ), makeSymbol( "DEPENDENT" ) );
    $str42$Add_a_dependent_to_KB_HL_SUPPORT = makeString( "Add a dependent to KB-HL-SUPPORT" );
    $sym43$KB_KB_HL_SUPPORT_SET_DEPENDENTS = makeSymbol( "KB-KB-HL-SUPPORT-SET-DEPENDENTS" );
    $list44 = ConsesLow.list( makeSymbol( "KB-HL-SUPPORT" ), makeSymbol( "DEPENDENTS" ) );
  }
}
/*
 * 
 * Total time: 171 ms
 * 
 */