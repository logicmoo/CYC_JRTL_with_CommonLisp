package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class user_actions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.user_actions";
  public static final String myFingerPrint = "eb0d944495b0498450901ca2a5395fb7adf2efd4e2302dd6eed8bdfa0a8ebf5c";
  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLSymbol $dtp_action_type$;
  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3206L)
  public static SubLSymbol $action_types_by_key$;
  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLSymbol $dtp_user_action$;
  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 4348L)
  public static SubLSymbol $user_actions_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 4488L)
  public static SubLSymbol $user_actions$;
  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 4583L)
  public static SubLSymbol $user_actions_by_id_string$;
  private static final SubLSymbol $sym0$ACTION_TYPE;
  private static final SubLSymbol $sym1$ACTION_TYPE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_ACTION_TYPE;
  private static final SubLSymbol $sym7$ACTION_TYPE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$ACTION_TYPE_KEY;
  private static final SubLSymbol $sym10$_CSETF_ACTION_TYPE_KEY;
  private static final SubLSymbol $sym11$ACTION_TYPE_SUMMARY_FN;
  private static final SubLSymbol $sym12$_CSETF_ACTION_TYPE_SUMMARY_FN;
  private static final SubLSymbol $sym13$ACTION_TYPE_DISPLAY_FN;
  private static final SubLSymbol $sym14$_CSETF_ACTION_TYPE_DISPLAY_FN;
  private static final SubLSymbol $sym15$ACTION_TYPE_HANDLER_FN;
  private static final SubLSymbol $sym16$_CSETF_ACTION_TYPE_HANDLER_FN;
  private static final SubLSymbol $kw17$KEY;
  private static final SubLSymbol $kw18$SUMMARY_FN;
  private static final SubLSymbol $kw19$DISPLAY_FN;
  private static final SubLSymbol $kw20$HANDLER_FN;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_ACTION_TYPE;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_ACTION_TYPE_METHOD;
  private static final SubLString $str27$_;
  private static final SubLInteger $int28$64;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$NEW_ACTION_TYPE;
  private static final SubLSymbol $sym31$CLET;
  private static final SubLSymbol $sym32$QUOTE;
  private static final SubLSymbol $sym33$CSETF;
  private static final SubLSymbol $sym34$SETHASH;
  private static final SubLSymbol $sym35$_ACTION_TYPES_BY_KEY_;
  private static final SubLSymbol $sym36$USER_ACTION;
  private static final SubLSymbol $sym37$USER_ACTION_P;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$PRINT_USER_ACTION;
  private static final SubLSymbol $sym43$USER_ACTION_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$USER_ACTION_ID_STRING;
  private static final SubLSymbol $sym46$_CSETF_USER_ACTION_ID_STRING;
  private static final SubLSymbol $sym47$USER_ACTION_TYPE_KEY;
  private static final SubLSymbol $sym48$_CSETF_USER_ACTION_TYPE_KEY;
  private static final SubLSymbol $sym49$USER_ACTION_CYCLIST;
  private static final SubLSymbol $sym50$_CSETF_USER_ACTION_CYCLIST;
  private static final SubLSymbol $sym51$USER_ACTION_CREATION_TIME;
  private static final SubLSymbol $sym52$_CSETF_USER_ACTION_CREATION_TIME;
  private static final SubLSymbol $sym53$USER_ACTION_DATA;
  private static final SubLSymbol $sym54$_CSETF_USER_ACTION_DATA;
  private static final SubLSymbol $kw55$ID_STRING;
  private static final SubLSymbol $kw56$TYPE_KEY;
  private static final SubLSymbol $kw57$CYCLIST;
  private static final SubLSymbol $kw58$CREATION_TIME;
  private static final SubLSymbol $kw59$DATA;
  private static final SubLSymbol $sym60$MAKE_USER_ACTION;
  private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_USER_ACTION_METHOD;
  private static final SubLString $str62$User_Actions_Lock;
  private static final SubLSymbol $sym63$NOT_EQ;

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject action_type_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_action_type( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject action_type_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $action_type_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject action_type_key(final SubLObject v_object)
  {
    assert NIL != action_type_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject action_type_summary_fn(final SubLObject v_object)
  {
    assert NIL != action_type_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject action_type_display_fn(final SubLObject v_object)
  {
    assert NIL != action_type_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject action_type_handler_fn(final SubLObject v_object)
  {
    assert NIL != action_type_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject _csetf_action_type_key(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != action_type_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject _csetf_action_type_summary_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != action_type_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject _csetf_action_type_display_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != action_type_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject _csetf_action_type_handler_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != action_type_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject make_action_type(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $action_type_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw17$KEY ) )
      {
        _csetf_action_type_key( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$SUMMARY_FN ) )
      {
        _csetf_action_type_summary_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$DISPLAY_FN ) )
      {
        _csetf_action_type_display_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$HANDLER_FN ) )
      {
        _csetf_action_type_handler_fn( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject visit_defstruct_action_type(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_ACTION_TYPE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw17$KEY, action_type_key( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw18$SUMMARY_FN, action_type_summary_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$DISPLAY_FN, action_type_display_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$HANDLER_FN, action_type_handler_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_ACTION_TYPE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2550L)
  public static SubLObject visit_defstruct_object_action_type_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_action_type( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 2928L)
  public static SubLObject print_action_type(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_level$.getDynamicValue( thread ) && depth.numG( print_high.$print_level$.getDynamicValue( thread ) ) )
    {
      print_high.princ( $str27$_, stream );
    }
    else if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      print_high.princ( action_type_key( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, NIL, NIL );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3322L)
  public static SubLObject defaction_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    name = current.first();
    final SubLObject arglist;
    current = ( arglist = current.rest() );
    final SubLObject new_action_type = $sym30$NEW_ACTION_TYPE;
    return ConsesLow.list( $sym31$CLET, ConsesLow.list( ConsesLow.list( new_action_type, ConsesLow.list( $sym23$MAKE_ACTION_TYPE, ConsesLow.list( $sym32$QUOTE, arglist ) ) ) ), ConsesLow.list( $sym33$CSETF, ConsesLow
        .list( $sym9$ACTION_TYPE_KEY, new_action_type ), ConsesLow.list( $sym32$QUOTE, name ) ), ConsesLow.list( $sym34$SETHASH, ConsesLow.list( $sym9$ACTION_TYPE_KEY, new_action_type ), $sym35$_ACTION_TYPES_BY_KEY_,
            new_action_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3662L)
  public static SubLObject action_type_by_key(final SubLObject action_type_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( action_type_key, $action_types_by_key$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject user_action_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_user_action( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject user_action_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $user_action_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject user_action_id_string(final SubLObject v_object)
  {
    assert NIL != user_action_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject user_action_type_key(final SubLObject v_object)
  {
    assert NIL != user_action_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject user_action_cyclist(final SubLObject v_object)
  {
    assert NIL != user_action_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject user_action_creation_time(final SubLObject v_object)
  {
    assert NIL != user_action_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject user_action_data(final SubLObject v_object)
  {
    assert NIL != user_action_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject _csetf_user_action_id_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != user_action_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject _csetf_user_action_type_key(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != user_action_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject _csetf_user_action_cyclist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != user_action_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject _csetf_user_action_creation_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != user_action_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject _csetf_user_action_data(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != user_action_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject make_user_action(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $user_action_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw55$ID_STRING ) )
      {
        _csetf_user_action_id_string( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$TYPE_KEY ) )
      {
        _csetf_user_action_type_key( v_new, current_value );
      }
      else if( pcase_var.eql( $kw57$CYCLIST ) )
      {
        _csetf_user_action_cyclist( v_new, current_value );
      }
      else if( pcase_var.eql( $kw58$CREATION_TIME ) )
      {
        _csetf_user_action_creation_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$DATA ) )
      {
        _csetf_user_action_data( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject visit_defstruct_user_action(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym60$MAKE_USER_ACTION, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw55$ID_STRING, user_action_id_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw56$TYPE_KEY, user_action_type_key( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw57$CYCLIST, user_action_cyclist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw58$CREATION_TIME, user_action_creation_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw59$DATA, user_action_data( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym60$MAKE_USER_ACTION, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 3772L)
  public static SubLObject visit_defstruct_object_user_action_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_user_action( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 4064L)
  public static SubLObject print_user_action(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_level$.getDynamicValue( thread ) && depth.numG( print_high.$print_level$.getDynamicValue( thread ) ) )
    {
      print_high.princ( $str27$_, stream );
    }
    else if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      print_high.princ( user_action_id_string( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, NIL, NIL );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 4719L)
  public static SubLObject user_actions_emptyP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Types.sublisp_null( $user_actions$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 4789L)
  public static SubLObject user_actions_size()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.length( $user_actions$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 4859L)
  public static SubLObject new_user_action(final SubLObject arglist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject guid = Guids.new_guid();
    final SubLObject new_user_action_id_string = string_utilities.copy_string( Guids.guid_to_string( guid ) );
    final SubLObject arglist_copy = conses_high.copy_list( arglist );
    SubLObject new_user_action = NIL;
    new_user_action = make_user_action( arglist_copy );
    _csetf_user_action_id_string( new_user_action, new_user_action_id_string );
    _csetf_user_action_creation_time( new_user_action, Time.get_universal_time() );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $user_actions_lock$.getGlobalValue() );
      Hashtables.sethash( new_user_action_id_string, $user_actions_by_id_string$.getDynamicValue( thread ), new_user_action );
      final SubLObject item_var = new_user_action;
      if( NIL == conses_high.member( item_var, $user_actions$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        $user_actions$.setDynamicValue( ConsesLow.cons( item_var, $user_actions$.getDynamicValue( thread ) ), thread );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $user_actions_lock$.getGlobalValue() );
      }
    }
    return new_user_action;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 5729L)
  public static SubLObject delete_user_action(final SubLObject user_action)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $user_actions_lock$.getGlobalValue() );
      $user_actions$.setDynamicValue( Sequences.remove( user_action, $user_actions$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      Hashtables.remhash( user_action_id_string( user_action ), $user_actions_by_id_string$.getDynamicValue( thread ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $user_actions_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 6051L)
  public static SubLObject user_action_by_id_string(final SubLObject user_action_id_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( user_action_id_string, $user_actions_by_id_string$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 6281L)
  public static SubLObject user_action_type(final SubLObject user_action)
  {
    final SubLObject user_action_type_key = user_action_type_key( user_action );
    if( NIL == user_action_type_key )
    {
      return NIL;
    }
    final SubLObject user_action_type = action_type_by_key( user_action_type_key );
    return user_action_type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 6668L)
  public static SubLObject user_action_summary_fn(final SubLObject user_action)
  {
    final SubLObject user_action_type = user_action_type( user_action );
    if( NIL == user_action_type )
    {
      return NIL;
    }
    final SubLObject user_action_type_summary_fn = action_type_summary_fn( user_action_type );
    return user_action_type_summary_fn;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 7071L)
  public static SubLObject user_action_display_fn(final SubLObject user_action)
  {
    final SubLObject user_action_type = user_action_type( user_action );
    if( NIL == user_action_type )
    {
      return NIL;
    }
    final SubLObject user_action_type_display_fn = action_type_display_fn( user_action_type );
    return user_action_type_display_fn;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 7474L)
  public static SubLObject user_action_handler_fn(final SubLObject user_action)
  {
    final SubLObject user_action_type = user_action_type( user_action );
    if( NIL == user_action_type )
    {
      return NIL;
    }
    final SubLObject user_action_type_handler_fn = action_type_handler_fn( user_action_type );
    return user_action_type_handler_fn;
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 7877L)
  public static SubLObject all_actions_for_cyclist(final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.remove( cyclist, $user_actions$.getDynamicValue( thread ), Symbols.symbol_function( $sym63$NOT_EQ ), Symbols.symbol_function( $sym49$USER_ACTION_CYCLIST ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/user-actions.lisp", position = 8000L)
  public static SubLObject all_actions_for_cyclist_of_type(final SubLObject cyclist, final SubLObject action_type_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject user_actions_of_cyclist = Sequences.remove( cyclist, $user_actions$.getDynamicValue( thread ), Symbols.symbol_function( $sym63$NOT_EQ ), Symbols.symbol_function( $sym49$USER_ACTION_CYCLIST ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject user_actions_of_cyclist_with_type_key = Sequences.remove( action_type_key, user_actions_of_cyclist, Symbols.symbol_function( $sym63$NOT_EQ ), Symbols.symbol_function( $sym47$USER_ACTION_TYPE_KEY ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return user_actions_of_cyclist_with_type_key;
  }

  public static SubLObject declare_user_actions_file()
  {
    SubLFiles.declareFunction( me, "action_type_print_function_trampoline", "ACTION-TYPE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "action_type_p", "ACTION-TYPE-P", 1, 0, false );
    new $action_type_p$UnaryFunction();
    SubLFiles.declareFunction( me, "action_type_key", "ACTION-TYPE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "action_type_summary_fn", "ACTION-TYPE-SUMMARY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "action_type_display_fn", "ACTION-TYPE-DISPLAY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "action_type_handler_fn", "ACTION-TYPE-HANDLER-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_action_type_key", "_CSETF-ACTION-TYPE-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_action_type_summary_fn", "_CSETF-ACTION-TYPE-SUMMARY-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_action_type_display_fn", "_CSETF-ACTION-TYPE-DISPLAY-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_action_type_handler_fn", "_CSETF-ACTION-TYPE-HANDLER-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "make_action_type", "MAKE-ACTION-TYPE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_action_type", "VISIT-DEFSTRUCT-ACTION-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_action_type_method", "VISIT-DEFSTRUCT-OBJECT-ACTION-TYPE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_action_type", "PRINT-ACTION-TYPE", 3, 0, false );
    SubLFiles.declareMacro( me, "defaction_type", "DEFACTION-TYPE" );
    SubLFiles.declareFunction( me, "action_type_by_key", "ACTION-TYPE-BY-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "user_action_print_function_trampoline", "USER-ACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "user_action_p", "USER-ACTION-P", 1, 0, false );
    new $user_action_p$UnaryFunction();
    SubLFiles.declareFunction( me, "user_action_id_string", "USER-ACTION-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "user_action_type_key", "USER-ACTION-TYPE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "user_action_cyclist", "USER-ACTION-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "user_action_creation_time", "USER-ACTION-CREATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "user_action_data", "USER-ACTION-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_user_action_id_string", "_CSETF-USER-ACTION-ID-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_user_action_type_key", "_CSETF-USER-ACTION-TYPE-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_user_action_cyclist", "_CSETF-USER-ACTION-CYCLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_user_action_creation_time", "_CSETF-USER-ACTION-CREATION-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_user_action_data", "_CSETF-USER-ACTION-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_user_action", "MAKE-USER-ACTION", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_user_action", "VISIT-DEFSTRUCT-USER-ACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_user_action_method", "VISIT-DEFSTRUCT-OBJECT-USER-ACTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_user_action", "PRINT-USER-ACTION", 3, 0, false );
    SubLFiles.declareFunction( me, "user_actions_emptyP", "USER-ACTIONS-EMPTY?", 0, 0, false );
    SubLFiles.declareFunction( me, "user_actions_size", "USER-ACTIONS-SIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "new_user_action", "NEW-USER-ACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "delete_user_action", "DELETE-USER-ACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "user_action_by_id_string", "USER-ACTION-BY-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "user_action_type", "USER-ACTION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "user_action_summary_fn", "USER-ACTION-SUMMARY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "user_action_display_fn", "USER-ACTION-DISPLAY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "user_action_handler_fn", "USER-ACTION-HANDLER-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "all_actions_for_cyclist", "ALL-ACTIONS-FOR-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "all_actions_for_cyclist_of_type", "ALL-ACTIONS-FOR-CYCLIST-OF-TYPE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_user_actions_file()
  {
    $dtp_action_type$ = SubLFiles.defconstant( "*DTP-ACTION-TYPE*", $sym0$ACTION_TYPE );
    $action_types_by_key$ = SubLFiles.defparameter( "*ACTION-TYPES-BY-KEY*", Hashtables.make_hash_table( $int28$64, UNPROVIDED, UNPROVIDED ) );
    $dtp_user_action$ = SubLFiles.defconstant( "*DTP-USER-ACTION*", $sym36$USER_ACTION );
    $user_actions_lock$ = SubLFiles.deflexical( "*USER-ACTIONS-LOCK*", Locks.make_lock( $str62$User_Actions_Lock ) );
    $user_actions$ = SubLFiles.defparameter( "*USER-ACTIONS*", NIL );
    $user_actions_by_id_string$ = SubLFiles.defparameter( "*USER-ACTIONS-BY-ID-STRING*", Hashtables.make_hash_table( $int28$64, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    return NIL;
  }

  public static SubLObject setup_user_actions_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_action_type$.getGlobalValue(), Symbols.symbol_function( $sym7$ACTION_TYPE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$ACTION_TYPE_KEY, $sym10$_CSETF_ACTION_TYPE_KEY );
    Structures.def_csetf( $sym11$ACTION_TYPE_SUMMARY_FN, $sym12$_CSETF_ACTION_TYPE_SUMMARY_FN );
    Structures.def_csetf( $sym13$ACTION_TYPE_DISPLAY_FN, $sym14$_CSETF_ACTION_TYPE_DISPLAY_FN );
    Structures.def_csetf( $sym15$ACTION_TYPE_HANDLER_FN, $sym16$_CSETF_ACTION_TYPE_HANDLER_FN );
    Equality.identity( $sym0$ACTION_TYPE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_action_type$.getGlobalValue(), Symbols.symbol_function( $sym26$VISIT_DEFSTRUCT_OBJECT_ACTION_TYPE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_user_action$.getGlobalValue(), Symbols.symbol_function( $sym43$USER_ACTION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list44 );
    Structures.def_csetf( $sym45$USER_ACTION_ID_STRING, $sym46$_CSETF_USER_ACTION_ID_STRING );
    Structures.def_csetf( $sym47$USER_ACTION_TYPE_KEY, $sym48$_CSETF_USER_ACTION_TYPE_KEY );
    Structures.def_csetf( $sym49$USER_ACTION_CYCLIST, $sym50$_CSETF_USER_ACTION_CYCLIST );
    Structures.def_csetf( $sym51$USER_ACTION_CREATION_TIME, $sym52$_CSETF_USER_ACTION_CREATION_TIME );
    Structures.def_csetf( $sym53$USER_ACTION_DATA, $sym54$_CSETF_USER_ACTION_DATA );
    Equality.identity( $sym36$USER_ACTION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_user_action$.getGlobalValue(), Symbols.symbol_function( $sym61$VISIT_DEFSTRUCT_OBJECT_USER_ACTION_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_user_actions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_user_actions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_user_actions_file();
  }
  static
  {
    me = new user_actions();
    $dtp_action_type$ = null;
    $action_types_by_key$ = null;
    $dtp_user_action$ = null;
    $user_actions_lock$ = null;
    $user_actions$ = null;
    $user_actions_by_id_string$ = null;
    $sym0$ACTION_TYPE = makeSymbol( "ACTION-TYPE" );
    $sym1$ACTION_TYPE_P = makeSymbol( "ACTION-TYPE-P" );
    $list2 = ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "SUMMARY-FN" ), makeSymbol( "DISPLAY-FN" ), makeSymbol( "HANDLER-FN" ) );
    $list3 = ConsesLow.list( makeKeyword( "KEY" ), makeKeyword( "SUMMARY-FN" ), makeKeyword( "DISPLAY-FN" ), makeKeyword( "HANDLER-FN" ) );
    $list4 = ConsesLow.list( makeSymbol( "ACTION-TYPE-KEY" ), makeSymbol( "ACTION-TYPE-SUMMARY-FN" ), makeSymbol( "ACTION-TYPE-DISPLAY-FN" ), makeSymbol( "ACTION-TYPE-HANDLER-FN" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-ACTION-TYPE-KEY" ), makeSymbol( "_CSETF-ACTION-TYPE-SUMMARY-FN" ), makeSymbol( "_CSETF-ACTION-TYPE-DISPLAY-FN" ), makeSymbol( "_CSETF-ACTION-TYPE-HANDLER-FN" ) );
    $sym6$PRINT_ACTION_TYPE = makeSymbol( "PRINT-ACTION-TYPE" );
    $sym7$ACTION_TYPE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ACTION-TYPE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ACTION-TYPE-P" ) );
    $sym9$ACTION_TYPE_KEY = makeSymbol( "ACTION-TYPE-KEY" );
    $sym10$_CSETF_ACTION_TYPE_KEY = makeSymbol( "_CSETF-ACTION-TYPE-KEY" );
    $sym11$ACTION_TYPE_SUMMARY_FN = makeSymbol( "ACTION-TYPE-SUMMARY-FN" );
    $sym12$_CSETF_ACTION_TYPE_SUMMARY_FN = makeSymbol( "_CSETF-ACTION-TYPE-SUMMARY-FN" );
    $sym13$ACTION_TYPE_DISPLAY_FN = makeSymbol( "ACTION-TYPE-DISPLAY-FN" );
    $sym14$_CSETF_ACTION_TYPE_DISPLAY_FN = makeSymbol( "_CSETF-ACTION-TYPE-DISPLAY-FN" );
    $sym15$ACTION_TYPE_HANDLER_FN = makeSymbol( "ACTION-TYPE-HANDLER-FN" );
    $sym16$_CSETF_ACTION_TYPE_HANDLER_FN = makeSymbol( "_CSETF-ACTION-TYPE-HANDLER-FN" );
    $kw17$KEY = makeKeyword( "KEY" );
    $kw18$SUMMARY_FN = makeKeyword( "SUMMARY-FN" );
    $kw19$DISPLAY_FN = makeKeyword( "DISPLAY-FN" );
    $kw20$HANDLER_FN = makeKeyword( "HANDLER-FN" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_ACTION_TYPE = makeSymbol( "MAKE-ACTION-TYPE" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_ACTION_TYPE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ACTION-TYPE-METHOD" );
    $str27$_ = makeString( "#" );
    $int28$64 = makeInteger( 64 );
    $list29 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&REST" ), makeSymbol( "ARGLIST" ) );
    $sym30$NEW_ACTION_TYPE = makeUninternedSymbol( "NEW-ACTION-TYPE" );
    $sym31$CLET = makeSymbol( "CLET" );
    $sym32$QUOTE = makeSymbol( "QUOTE" );
    $sym33$CSETF = makeSymbol( "CSETF" );
    $sym34$SETHASH = makeSymbol( "SETHASH" );
    $sym35$_ACTION_TYPES_BY_KEY_ = makeSymbol( "*ACTION-TYPES-BY-KEY*" );
    $sym36$USER_ACTION = makeSymbol( "USER-ACTION" );
    $sym37$USER_ACTION_P = makeSymbol( "USER-ACTION-P" );
    $list38 = ConsesLow.list( makeSymbol( "ID-STRING" ), makeSymbol( "TYPE-KEY" ), makeSymbol( "CYCLIST" ), makeSymbol( "CREATION-TIME" ), makeSymbol( "DATA" ) );
    $list39 = ConsesLow.list( makeKeyword( "ID-STRING" ), makeKeyword( "TYPE-KEY" ), makeKeyword( "CYCLIST" ), makeKeyword( "CREATION-TIME" ), makeKeyword( "DATA" ) );
    $list40 = ConsesLow.list( makeSymbol( "USER-ACTION-ID-STRING" ), makeSymbol( "USER-ACTION-TYPE-KEY" ), makeSymbol( "USER-ACTION-CYCLIST" ), makeSymbol( "USER-ACTION-CREATION-TIME" ), makeSymbol(
        "USER-ACTION-DATA" ) );
    $list41 = ConsesLow.list( makeSymbol( "_CSETF-USER-ACTION-ID-STRING" ), makeSymbol( "_CSETF-USER-ACTION-TYPE-KEY" ), makeSymbol( "_CSETF-USER-ACTION-CYCLIST" ), makeSymbol( "_CSETF-USER-ACTION-CREATION-TIME" ),
        makeSymbol( "_CSETF-USER-ACTION-DATA" ) );
    $sym42$PRINT_USER_ACTION = makeSymbol( "PRINT-USER-ACTION" );
    $sym43$USER_ACTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "USER-ACTION-PRINT-FUNCTION-TRAMPOLINE" );
    $list44 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "USER-ACTION-P" ) );
    $sym45$USER_ACTION_ID_STRING = makeSymbol( "USER-ACTION-ID-STRING" );
    $sym46$_CSETF_USER_ACTION_ID_STRING = makeSymbol( "_CSETF-USER-ACTION-ID-STRING" );
    $sym47$USER_ACTION_TYPE_KEY = makeSymbol( "USER-ACTION-TYPE-KEY" );
    $sym48$_CSETF_USER_ACTION_TYPE_KEY = makeSymbol( "_CSETF-USER-ACTION-TYPE-KEY" );
    $sym49$USER_ACTION_CYCLIST = makeSymbol( "USER-ACTION-CYCLIST" );
    $sym50$_CSETF_USER_ACTION_CYCLIST = makeSymbol( "_CSETF-USER-ACTION-CYCLIST" );
    $sym51$USER_ACTION_CREATION_TIME = makeSymbol( "USER-ACTION-CREATION-TIME" );
    $sym52$_CSETF_USER_ACTION_CREATION_TIME = makeSymbol( "_CSETF-USER-ACTION-CREATION-TIME" );
    $sym53$USER_ACTION_DATA = makeSymbol( "USER-ACTION-DATA" );
    $sym54$_CSETF_USER_ACTION_DATA = makeSymbol( "_CSETF-USER-ACTION-DATA" );
    $kw55$ID_STRING = makeKeyword( "ID-STRING" );
    $kw56$TYPE_KEY = makeKeyword( "TYPE-KEY" );
    $kw57$CYCLIST = makeKeyword( "CYCLIST" );
    $kw58$CREATION_TIME = makeKeyword( "CREATION-TIME" );
    $kw59$DATA = makeKeyword( "DATA" );
    $sym60$MAKE_USER_ACTION = makeSymbol( "MAKE-USER-ACTION" );
    $sym61$VISIT_DEFSTRUCT_OBJECT_USER_ACTION_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-USER-ACTION-METHOD" );
    $str62$User_Actions_Lock = makeString( "User Actions Lock" );
    $sym63$NOT_EQ = makeSymbol( "NOT-EQ" );
  }

  public static final class $action_type_native
      extends
        SubLStructNative
  {
    public SubLObject $key;
    public SubLObject $summary_fn;
    public SubLObject $display_fn;
    public SubLObject $handler_fn;
    private static final SubLStructDeclNative structDecl;

    public $action_type_native()
    {
      this.$key = CommonSymbols.NIL;
      this.$summary_fn = CommonSymbols.NIL;
      this.$display_fn = CommonSymbols.NIL;
      this.$handler_fn = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $action_type_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$key;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$summary_fn;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$display_fn;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$handler_fn;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$key = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$summary_fn = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$display_fn = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$handler_fn = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $action_type_native.class, $sym0$ACTION_TYPE, $sym1$ACTION_TYPE_P, $list2, $list3, new String[] { "$key", "$summary_fn", "$display_fn", "$handler_fn"
      }, $list4, $list5, $sym6$PRINT_ACTION_TYPE );
    }
  }

  public static final class $action_type_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $action_type_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ACTION-TYPE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return action_type_p( arg1 );
    }
  }

  public static final class $user_action_native
      extends
        SubLStructNative
  {
    public SubLObject $id_string;
    public SubLObject $type_key;
    public SubLObject $cyclist;
    public SubLObject $creation_time;
    public SubLObject $data;
    private static final SubLStructDeclNative structDecl;

    public $user_action_native()
    {
      this.$id_string = CommonSymbols.NIL;
      this.$type_key = CommonSymbols.NIL;
      this.$cyclist = CommonSymbols.NIL;
      this.$creation_time = CommonSymbols.NIL;
      this.$data = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $user_action_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id_string;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$type_key;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$cyclist;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$creation_time;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$data;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id_string = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$type_key = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$cyclist = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$creation_time = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$data = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $user_action_native.class, $sym36$USER_ACTION, $sym37$USER_ACTION_P, $list38, $list39, new String[] { "$id_string", "$type_key", "$cyclist", "$creation_time", "$data"
      }, $list40, $list41, $sym42$PRINT_USER_ACTION );
    }
  }

  public static final class $user_action_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $user_action_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "USER-ACTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return user_action_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 173 ms
 * 
 */