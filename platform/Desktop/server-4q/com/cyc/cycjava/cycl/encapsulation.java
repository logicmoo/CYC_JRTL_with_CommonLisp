package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class encapsulation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.encapsulation";
  public static final String myFingerPrint = "d937ec65873ab609f07e2d75ef0c181400d271f7ac8cf3ac5ef29078ce97b294";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 709L)
  public static SubLSymbol $encapsulate_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2525L)
  public static SubLSymbol $unencapsulate_believe_names$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4782L)
  public static SubLSymbol $unencapsulate_constant_via_name_optimizationP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5493L)
  private static SubLSymbol $unencapsulate_find_constant_lookaside_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5564L)
  private static SubLSymbol $unencapsulate_find_constant_capacity$;
  private static final SubLInteger $int0$256;
  private static final SubLSymbol $sym1$ENCAPSULATE_CONS_METHOD;
  private static final SubLSymbol $sym2$ENCAPSULATE_CONSTANT_METHOD;
  private static final SubLSymbol $sym3$ENCAPSULATE_NART_METHOD;
  private static final SubLString $str4$Attempt_to_encapsulate_invalid_co;
  private static final SubLString $str5$Attempt_to_encapsulate_a_constant;
  private static final SubLSymbol $kw6$UNNAMED;
  private static final SubLString $str7$Attempt_to_encapsulate_a_constant;
  private static final SubLString $str8$Attempt_to_encapsulate_the_NART__;
  private static final SubLSymbol $kw9$HP;
  private static final SubLSymbol $kw10$NAT;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$_UNENCAPSULATE_FIND_CONSTANT_LOOKASIDE_TABLE_;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$IGNORE;
  private static final SubLString $str15$__Last_operation___S___This_objec;
  private static final SubLString $str16$Skip_this_operation;
  private static final SubLString $str17$_S_did_not_yield_a_term;
  private static final SubLSymbol $kw18$UNENCAPSULATION_ERROR;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 709L)
  public static SubLObject encapsulate(final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( v_object, $encapsulate_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 762L)
  public static SubLObject encapsulate_cons_method(final SubLObject v_object)
  {
    return list_utilities.recons( encapsulate( v_object.first() ), encapsulate( v_object.rest() ), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 901L)
  public static SubLObject encapsulate_constant_method(final SubLObject v_object)
  {
    return encapsulate_constant( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1192L)
  public static SubLObject encapsulate_nart_method(final SubLObject v_object)
  {
    return encapsulate_nart( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1271L)
  public static SubLObject encapsulate_constant(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == constant_handles.valid_constantP( constant, UNPROVIDED ) )
    {
      Errors.error( $str4$Attempt_to_encapsulate_invalid_co, constant );
    }
    final SubLObject external_id = constants_high.constant_external_id( constant );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == constants_high.constant_external_id_p( external_id ) )
    {
      Errors.error( $str5$Attempt_to_encapsulate_a_constant, constant );
    }
    final SubLObject name = constants_high.constant_name( constant );
    if( $kw6$UNNAMED != name && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !name.isString() )
    {
      Errors.error( $str7$Attempt_to_encapsulate_a_constant, constant, name );
    }
    return encapsulate_constant_internal( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1852L)
  public static SubLObject encapsulate_nart(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject nart_hl_formula = narts_high.nart_hl_formula( nart );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !nart_hl_formula.isCons() )
    {
      Errors.error( $str8$Attempt_to_encapsulate_the_NART__, nart, nart_hl_formula );
    }
    return encapsulate_nart_internal( nart );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2117L)
  public static SubLObject encapsulate_constant_internal(final SubLObject constant)
  {
    final SubLObject external_id = constants_high.constant_external_id( constant );
    final SubLObject name = constants_high.constant_name( constant );
    final SubLObject v_encapsulation = ConsesLow.list( $kw9$HP, name, external_id );
    return v_encapsulation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2338L)
  public static SubLObject encapsulate_nart_internal(final SubLObject nart)
  {
    final SubLObject nart_hl_formula = narts_high.nart_hl_formula( nart );
    final SubLObject v_encapsulation = ConsesLow.list( $kw10$NAT, encapsulate( nart_hl_formula ) );
    return v_encapsulation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2691L)
  public static SubLObject unencapsulate(final SubLObject v_object)
  {
    return unencapsulate_internal( v_object, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2775L)
  public static SubLObject unencapsulate_partial(final SubLObject v_object)
  {
    return unencapsulate_internal( v_object, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2865L)
  public static SubLObject unencapsulate_internal(final SubLObject v_object, final SubLObject allow_partialP)
  {
    if( v_object.isAtom() )
    {
      return v_object;
    }
    final SubLObject car = v_object.first();
    if( NIL != unencapsulate_token_equal_p( car, $kw9$HP ) && NIL != list_utilities.proper_list_p( v_object ) && THREE_INTEGER.numE( Sequences.length( v_object ) ) )
    {
      return unencapsulate_constant_marker( v_object, allow_partialP );
    }
    if( NIL != unencapsulate_token_equal_p( car, $kw10$NAT ) && NIL != list_utilities.proper_list_p( v_object ) && ( TWO_INTEGER.numE( Sequences.length( v_object ) ) || THREE_INTEGER.numE( Sequences.length(
        v_object ) ) ) )
    {
      return unencapsulate_nart_marker( v_object, allow_partialP );
    }
    return unencapsulate_cons( v_object, allow_partialP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3734L)
  public static SubLObject unencapsulate_token_equal_p(final SubLObject v_object, final SubLObject token)
  {
    return makeBoolean( token.eql( v_object ) || ( v_object.isSymbol() && NIL != Strings.stringE( Symbols.symbol_name( v_object ), Symbols.symbol_name( token ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3932L)
  public static SubLObject unencapsulate_cons(final SubLObject v_object, final SubLObject allow_partialP)
  {
    return list_utilities.recons( unencapsulate_internal( v_object.first(), allow_partialP ), unencapsulate_internal( v_object.rest(), allow_partialP ), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4140L)
  public static SubLObject unencapsulate_constant_marker(final SubLObject v_object, final SubLObject allow_partialP)
  {
    SubLObject hp = NIL;
    SubLObject name_spec = NIL;
    SubLObject external_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list11 );
    hp = v_object.first();
    SubLObject current = v_object.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list11 );
    name_spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list11 );
    external_id = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( v_object, $list11 );
      return NIL;
    }
    final SubLObject existing_constant = unencapsulate_constant_marker_int( name_spec, external_id );
    if( NIL != constant_handles.constant_p( existing_constant ) )
    {
      return existing_constant;
    }
    if( name_spec.isString() )
    {
      return handle_unencapsulate_constant_problem( v_object, allow_partialP );
    }
    if( $kw6$UNNAMED == name_spec )
    {
      return handle_unencapsulate_unnamed_constant_problem( v_object, allow_partialP );
    }
    return handle_unencapsulation_error( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4860L)
  public static SubLObject unencapsulate_constant_marker_int(final SubLObject name_spec, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject existing_constant = NIL;
    if( NIL != constants_high.constant_external_id_p( external_id ) )
    {
      if( NIL != $unencapsulate_constant_via_name_optimizationP$.getDynamicValue( thread ) && name_spec.isString() )
      {
        final SubLObject constant = unencapsulate_find_constant( name_spec );
        if( NIL != constant_handles.valid_constantP( constant, UNPROVIDED ) && NIL != constants_high.constant_has_external_id( constant, external_id ) )
        {
          existing_constant = constant;
        }
      }
      if( NIL == existing_constant )
      {
        existing_constant = constants_high.find_constant_by_external_id( external_id );
      }
    }
    return existing_constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5634L)
  public static SubLObject unencapsulate_find_constant(final SubLObject string)
  {
    SubLObject constant = list_utilities.alist_lookup_without_values( $unencapsulate_find_constant_lookaside_table$.getGlobalValue(), string, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL != constant )
    {
      $unencapsulate_find_constant_lookaside_table$.setGlobalValue( list_utilities.alist_promote( $unencapsulate_find_constant_lookaside_table$.getGlobalValue(), string, Symbols.symbol_function( EQUAL ) ) );
    }
    else
    {
      constant = constants_high.find_constant( string );
      $unencapsulate_find_constant_lookaside_table$.setGlobalValue( list_utilities.alist_capacity_enter_without_values( $unencapsulate_find_constant_lookaside_table$.getGlobalValue(), string, constant,
          $unencapsulate_find_constant_capacity$.getGlobalValue(), Symbols.symbol_function( EQUAL ) ) );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6294L)
  public static SubLObject unencapsulate_nart_marker(final SubLObject v_object, final SubLObject allow_partialP)
  {
    SubLObject nat = NIL;
    SubLObject nart_hl_formula_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list13 );
    nat = v_object.first();
    SubLObject current = v_object.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list13 );
    nart_hl_formula_spec = current.first();
    current = current.rest();
    final SubLObject id = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, v_object, $list13 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( v_object, $list13 );
      return NIL;
    }
    final SubLObject nart_hl_formula = unencapsulate_internal( nart_hl_formula_spec, allow_partialP );
    final SubLObject existing_nart = narts_high.find_nart( nart_hl_formula );
    if( NIL != nart_handles.nart_p( existing_nart ) )
    {
      return existing_nart;
    }
    return handle_unencapsulate_nart_problem( v_object, allow_partialP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6898L)
  public static SubLObject handle_unencapsulate_constant_problem(final SubLObject v_object, final SubLObject allow_partialP)
  {
    if( NIL != allow_partialP )
    {
      return v_object;
    }
    return handle_unencapsulation_error( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7122L)
  public static SubLObject handle_unencapsulate_unnamed_constant_problem(final SubLObject v_object, final SubLObject allow_partialP)
  {
    return handle_unencapsulate_constant_problem( v_object, allow_partialP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7280L)
  public static SubLObject handle_unencapsulate_nart_problem(final SubLObject v_object, final SubLObject allow_partialP)
  {
    if( NIL != allow_partialP )
    {
      return v_object;
    }
    return handle_unencapsulation_error( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7500L)
  public static SubLObject handle_unencapsulation_error(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$unencapsulating_within_agenda$.getDynamicValue( thread ) )
    {
      if( $kw14$IGNORE != agenda.agenda_error_mode() )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str15$__Last_operation___S___This_objec, unencapsulate_partial( control_vars.$last_agenda_op$.getGlobalValue() ), v_object );
        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
        Errors.cerror( $str16$Skip_this_operation, $str17$_S_did_not_yield_a_term, v_object );
      }
      Dynamic.sublisp_throw( $kw18$UNENCAPSULATION_ERROR, NIL );
    }
    else
    {
      Errors.error( $str17$_S_did_not_yield_a_term, v_object );
    }
    return NIL;
  }

  public static SubLObject declare_encapsulation_file()
  {
    SubLFiles.declareFunction( me, "encapsulate", "ENCAPSULATE", 1, 0, false );
    SubLFiles.declareFunction( me, "encapsulate_cons_method", "ENCAPSULATE-CONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "encapsulate_constant_method", "ENCAPSULATE-CONSTANT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "encapsulate_nart_method", "ENCAPSULATE-NART-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "encapsulate_constant", "ENCAPSULATE-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "encapsulate_nart", "ENCAPSULATE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "encapsulate_constant_internal", "ENCAPSULATE-CONSTANT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "encapsulate_nart_internal", "ENCAPSULATE-NART-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "unencapsulate", "UNENCAPSULATE", 1, 0, false );
    SubLFiles.declareFunction( me, "unencapsulate_partial", "UNENCAPSULATE-PARTIAL", 1, 0, false );
    SubLFiles.declareFunction( me, "unencapsulate_internal", "UNENCAPSULATE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "unencapsulate_token_equal_p", "UNENCAPSULATE-TOKEN-EQUAL-P", 2, 0, false );
    SubLFiles.declareFunction( me, "unencapsulate_cons", "UNENCAPSULATE-CONS", 2, 0, false );
    SubLFiles.declareFunction( me, "unencapsulate_constant_marker", "UNENCAPSULATE-CONSTANT-MARKER", 2, 0, false );
    SubLFiles.declareFunction( me, "unencapsulate_constant_marker_int", "UNENCAPSULATE-CONSTANT-MARKER-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "unencapsulate_find_constant", "UNENCAPSULATE-FIND-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "unencapsulate_nart_marker", "UNENCAPSULATE-NART-MARKER", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_unencapsulate_constant_problem", "HANDLE-UNENCAPSULATE-CONSTANT-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_unencapsulate_unnamed_constant_problem", "HANDLE-UNENCAPSULATE-UNNAMED-CONSTANT-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_unencapsulate_nart_problem", "HANDLE-UNENCAPSULATE-NART-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_unencapsulation_error", "HANDLE-UNENCAPSULATION-ERROR", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_encapsulation_file()
  {
    $encapsulate_method_table$ = SubLFiles.deflexical( "*ENCAPSULATE-METHOD-TABLE*", Vectors.make_vector( $int0$256, NIL ) );
    $unencapsulate_believe_names$ = SubLFiles.defparameter( "*UNENCAPSULATE-BELIEVE-NAMES*", NIL );
    $unencapsulate_constant_via_name_optimizationP$ = SubLFiles.defparameter( "*UNENCAPSULATE-CONSTANT-VIA-NAME-OPTIMIZATION?*", NIL );
    $unencapsulate_find_constant_lookaside_table$ = SubLFiles.deflexical( "*UNENCAPSULATE-FIND-CONSTANT-LOOKASIDE-TABLE*", ( maybeDefault( $sym12$_UNENCAPSULATE_FIND_CONSTANT_LOOKASIDE_TABLE_,
        $unencapsulate_find_constant_lookaside_table$, NIL ) ) );
    $unencapsulate_find_constant_capacity$ = SubLFiles.deflexical( "*UNENCAPSULATE-FIND-CONSTANT-CAPACITY*", TWENTY_INTEGER );
    return NIL;
  }

  public static SubLObject setup_encapsulation_file()
  {
    Structures.register_method( $encapsulate_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function( $sym1$ENCAPSULATE_CONS_METHOD ) );
    Structures.register_method( $encapsulate_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function( $sym2$ENCAPSULATE_CONSTANT_METHOD ) );
    Structures.register_method( $encapsulate_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function( $sym3$ENCAPSULATE_NART_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym12$_UNENCAPSULATE_FIND_CONSTANT_LOOKASIDE_TABLE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_encapsulation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_encapsulation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_encapsulation_file();
  }
  static
  {
    me = new encapsulation();
    $encapsulate_method_table$ = null;
    $unencapsulate_believe_names$ = null;
    $unencapsulate_constant_via_name_optimizationP$ = null;
    $unencapsulate_find_constant_lookaside_table$ = null;
    $unencapsulate_find_constant_capacity$ = null;
    $int0$256 = makeInteger( 256 );
    $sym1$ENCAPSULATE_CONS_METHOD = makeSymbol( "ENCAPSULATE-CONS-METHOD" );
    $sym2$ENCAPSULATE_CONSTANT_METHOD = makeSymbol( "ENCAPSULATE-CONSTANT-METHOD" );
    $sym3$ENCAPSULATE_NART_METHOD = makeSymbol( "ENCAPSULATE-NART-METHOD" );
    $str4$Attempt_to_encapsulate_invalid_co = makeString( "Attempt to encapsulate invalid constant ~S." );
    $str5$Attempt_to_encapsulate_a_constant = makeString( "Attempt to encapsulate a constant ~S with an invalid external ID." );
    $kw6$UNNAMED = makeKeyword( "UNNAMED" );
    $str7$Attempt_to_encapsulate_a_constant = makeString( "Attempt to encapsulate a constant ~S with a non-string name ~S." );
    $str8$Attempt_to_encapsulate_the_NART__ = makeString( "Attempt to encapsulate the NART ~S with an invalid HL formula ~S." );
    $kw9$HP = makeKeyword( "HP" );
    $kw10$NAT = makeKeyword( "NAT" );
    $list11 = ConsesLow.list( makeSymbol( "HP" ), makeSymbol( "NAME-SPEC" ), makeSymbol( "EXTERNAL-ID" ) );
    $sym12$_UNENCAPSULATE_FIND_CONSTANT_LOOKASIDE_TABLE_ = makeSymbol( "*UNENCAPSULATE-FIND-CONSTANT-LOOKASIDE-TABLE*" );
    $list13 = ConsesLow.list( makeSymbol( "NAT" ), makeSymbol( "NART-HL-FORMULA-SPEC" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ID" ) );
    $kw14$IGNORE = makeKeyword( "IGNORE" );
    $str15$__Last_operation___S___This_objec = makeString( "~%Last operation: ~S ~%This object did not yield a term: ~S" );
    $str16$Skip_this_operation = makeString( "Skip this operation" );
    $str17$_S_did_not_yield_a_term = makeString( "~S did not yield a term" );
    $kw18$UNENCAPSULATION_ERROR = makeKeyword( "UNENCAPSULATION-ERROR" );
  }
}
/*
 * 
 * Total time: 118 ms
 * 
 */