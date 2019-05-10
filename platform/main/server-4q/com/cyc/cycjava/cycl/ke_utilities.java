package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ke_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ke_utilities";
  public static final String myFingerPrint = "9cacac2f2ae7b6d195d0fab6857479fc8c58c0726adaa88e0fd2abfa370de66a";
  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 878L)
  public static SubLSymbol $ke_state$;
  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 1036L)
  public static SubLSymbol $ke_debug$;
  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 1076L)
  public static SubLSymbol $ke_state_keys$;
  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 1699L)
  public static SubLSymbol $ke_non_constant_name_chars$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$REPLACE;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$INVALID_CONSTANT_NAME_CHAR_P;
  private static final SubLString $str5$nil;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$_EXIT;
  private static final SubLInteger $int9$31;
  private static final SubLInteger $int10$127;
  private static final SubLSymbol $kw11$TV;
  private static final SubLSymbol $kw12$UNKNOWN;
  private static final SubLObject $const13$DefaultMonotonicPredicate;
  private static final SubLSymbol $kw14$MONOTONIC;
  private static final SubLSymbol $kw15$DEFAULT;
  private static final SubLSymbol $kw16$ALREADY_CREATED;
  private static final SubLSymbol $kw17$CONS;

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 1903L)
  public static SubLObject ke_value(final SubLObject cyclist, final SubLObject key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return misc_utilities.get_vector_indexed_val( cyclist, $ke_state$.getDynamicValue( thread ), key, $ke_state_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 2090L)
  public static SubLObject change_ke_value(final SubLObject cyclist, final SubLObject key, SubLObject method, SubLObject v_new)
  {
    if( method == UNPROVIDED )
    {
      method = $kw2$REPLACE;
    }
    if( v_new == UNPROVIDED )
    {
      v_new = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return misc_utilities.update_vector_indexed_val( cyclist, $ke_state$.getDynamicValue( thread ), key, $ke_state_keys$.getDynamicValue( thread ), v_new, method, Symbols.symbol_function( EQUAL ), Symbols
        .symbol_function( EQUAL ), Symbols.symbol_function( EQUAL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 2300L)
  public static SubLObject parens_equalP(final SubLObject string)
  {
    if( string.isString() )
    {
      final SubLObject left = string_utilities.count_chars_in_string( string, Characters.CHAR_lparen );
      final SubLObject right = string_utilities.count_chars_in_string( string, Characters.CHAR_rparen );
      return Numbers.numE( left, right );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 2550L)
  public static SubLObject dqs_equalP(final SubLObject string)
  {
    if( string.isString() )
    {
      final SubLObject n = string_utilities.count_chars_in_string( string, Characters.CHAR_quotation );
      return Numbers.evenp( n );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 2739L)
  public static SubLObject hdify_string(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !string.isString() || !Sequences.length( string ).numG( ZERO_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject temp = Strings.make_string( Numbers.add( ONE_INTEGER, Numbers.multiply( Sequences.length( string ), TWO_INTEGER ) ), UNPROVIDED );
    SubLObject i = ZERO_INTEGER;
    SubLObject inside_dqP = NIL;
    final SubLObject len = Sequences.length( string );
    SubLObject temp_i = NIL;
    temp_i = ZERO_INTEGER;
    while ( !i.numGE( len ))
    {
      final SubLObject lc = Strings.sublisp_char( string, i );
      final SubLObject fc = Numbers.subtract( i, ONE_INTEGER ).numGE( ZERO_INTEGER ) ? Strings.sublisp_char( string, Numbers.subtract( i, ONE_INTEGER ) ) : NIL;
      final SubLObject nc1 = Numbers.add( i, ONE_INTEGER ).numL( len ) ? Strings.sublisp_char( string, Numbers.add( i, ONE_INTEGER ) ) : NIL;
      final SubLObject nc2 = Numbers.add( i, TWO_INTEGER ).numL( len ) ? Strings.sublisp_char( string, Numbers.add( i, TWO_INTEGER ) ) : NIL;
      final SubLObject nc3 = Numbers.add( i, THREE_INTEGER ).numL( len ) ? Strings.sublisp_char( string, Numbers.add( i, THREE_INTEGER ) ) : NIL;
      if( NIL == Sequences.find( lc, $ke_non_constant_name_chars$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && ( !lc.isChar() || NIL == Sequences.find( Characters.char_code( lc ),
          $list3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) && NIL == inside_dqP && NIL == string_utilities.digit_stringP( Sequences.subseq( string, i, Sequences.position_if( Symbols.symbol_function(
              $sym4$INVALID_CONSTANT_NAME_CHAR_P ), string, Symbols.symbol_function( IDENTITY ), i, UNPROVIDED ) ) ) && ( !lc.eql( Characters.CHAR_hyphen ) || !nc1.isChar() || NIL == Characters.digit_char_p( nc1,
                  UNPROVIDED ) ) && ( !string_utilities.char_list_to_string( ConsesLow.list( lc, nc1, nc2 ) ).equalp( $str5$nil ) || NIL == Sequences.find( nc3, $list6, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          && ( NIL != Sequences.find( fc, $list7, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL == fc ) )
      {
        Vectors.set_aref( temp, temp_i, Characters.CHAR_hash );
        temp_i = Numbers.add( temp_i, ONE_INTEGER );
        Vectors.set_aref( temp, temp_i, constant_reader.constant_reader_macro_char() );
        temp_i = Numbers.add( temp_i, ONE_INTEGER );
        Vectors.set_aref( temp, temp_i, lc );
        i = Numbers.add( i, ONE_INTEGER );
      }
      else if( NIL == inside_dqP && fc.eql( Characters.CHAR_quote ) )
      {
        temp_i = Numbers.subtract( temp_i, ONE_INTEGER );
        Vectors.set_aref( temp, temp_i, lc );
        i = Numbers.add( i, ONE_INTEGER );
      }
      else
      {
        Vectors.set_aref( temp, temp_i, lc );
        i = Numbers.add( i, ONE_INTEGER );
      }
      if( NIL != Characters.charE( Characters.CHAR_quotation, lc ) && NIL == inside_dqP )
      {
        inside_dqP = T;
      }
      else if( NIL != Characters.charE( Characters.CHAR_quotation, lc ) && NIL != inside_dqP )
      {
        inside_dqP = NIL;
      }
      temp_i = Numbers.add( temp_i, ONE_INTEGER );
    }
    final SubLObject ans = string_utilities.trim_sides( temp, UNPROVIDED );
    if( Sequences.length( ans ).numGE( ZERO_INTEGER ) )
    {
      return ans;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 4698L)
  public static SubLObject cycl_from_string(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != string_utilities.non_empty_stringP( string ) )
    {
      if( NIL != constant_completion_high.valid_constant_name_p( string ) )
      {
        final SubLObject constant = constants_high.find_constant( string );
        if( NIL != constant_handles.valid_constantP( constant, UNPROVIDED ) )
        {
          return constant;
        }
      }
      if( NIL != kb_utilities.compact_hl_external_id_stringP( string ) )
      {
        final SubLObject v_term = kb_utilities.find_object_by_compact_hl_external_id_string( string );
        if( NIL != cycl_grammar.cycl_expression_p( v_term ) )
        {
          return v_term;
        }
      }
      else if( NIL != kb_utilities.hl_external_id_string_p( string ) )
      {
        final SubLObject v_term = kb_utilities.find_object_by_hl_external_id_string( string );
        if( NIL != cycl_grammar.cycl_expression_p( v_term ) )
        {
          return v_term;
        }
      }
      else if( NIL != Guids.guid_string_p( string ) )
      {
        final SubLObject v_term = constants_high.find_constant_by_guid_string( string );
        if( NIL != v_term )
        {
          return v_term;
        }
      }
      else if( NIL != parens_equalP( string ) && NIL != dqs_equalP( string ) )
      {
        final SubLObject _prev_bind_0 = control_vars.$read_require_constant_exists$.currentBinding( thread );
        try
        {
          control_vars.$read_require_constant_exists$.bind( T, thread );
          SubLObject cycl = reader.read_from_string_ignoring_errors( hdify_string( string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL == cycl )
          {
            cycl = reader.read_from_string_ignoring_errors( hdify_string( kb_utilities.string_remove_nart_affixes( string ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          return cycl;
        }
        finally
        {
          control_vars.$read_require_constant_exists$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 5853L)
  public static SubLObject fort_from_string(final SubLObject string)
  {
    SubLObject v_term = cycl_from_string( string );
    if( NIL != forts.fort_p( v_term ) )
    {
      return v_term;
    }
    if( NIL != term.hl_ground_nautP( v_term ) )
    {
      v_term = narts_high.find_nart( v_term );
      if( NIL != nart_handles.nart_p( v_term ) )
      {
        return v_term;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 6138L)
  public static SubLObject nart_from_string(final SubLObject string)
  {
    final SubLObject v_term = cycl_from_string( string );
    return nart_from_string_int( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 6307L)
  public static SubLObject nart_from_string_int(SubLObject v_term)
  {
    if( NIL != nart_handles.nart_p( v_term ) )
    {
      return v_term;
    }
    if( NIL != term.hl_ground_nautP( v_term ) )
    {
      v_term = narts_high.find_nart( v_term );
      if( NIL != nart_handles.nart_p( v_term ) )
      {
        return v_term;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 6502L)
  public static SubLObject nat_from_string(final SubLObject string)
  {
    final SubLObject v_term = cycl_from_string( string );
    final SubLObject nart = nart_from_string_int( v_term );
    if( NIL != nart )
    {
      return nart;
    }
    if( NIL != term.closed_nautP( v_term, UNPROVIDED ) )
    {
      return v_term;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 6787L)
  public static SubLObject printable_ascii_charP(final SubLObject character)
  {
    final SubLObject code = Characters.char_code( character );
    return makeBoolean( code.numG( $int9$31 ) && code.numL( $int10$127 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 6923L)
  public static SubLObject strip_garbage_chars(final SubLObject string, SubLObject embedded_strings_tooP)
  {
    if( embedded_strings_tooP == UNPROVIDED )
    {
      embedded_strings_tooP = NIL;
    }
    SubLObject inside_dqP = NIL;
    SubLObject end_var_$1;
    SubLObject end_var;
    SubLObject i;
    SubLObject ch;
    SubLObject code;
    for( end_var = ( end_var_$1 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$1 ); i = number_utilities.f_1X( i ) )
    {
      ch = Strings.sublisp_char( string, i );
      code = Characters.char_code( ch );
      if( NIL != Characters.charE( ch, Characters.CHAR_quotation ) )
      {
        inside_dqP = makeBoolean( NIL == inside_dqP );
      }
      if( NIL == printable_ascii_charP( ch ) && ( NIL == inside_dqP || NIL == conses_high.member( code, $list3, UNPROVIDED, UNPROVIDED ) || NIL != embedded_strings_tooP ) )
      {
        Strings.set_char( string, i, Characters.CHAR_space );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 7454L)
  public static SubLObject set_tv_to_use(final SubLObject predicate)
  {
    if( ke_value( operation_communication.the_cyclist(), $kw11$TV ).equal( $kw12$UNKNOWN ) && NIL != isa.isa_in_any_mtP( predicate, $const13$DefaultMonotonicPredicate ) )
    {
      return $kw14$MONOTONIC;
    }
    if( ke_value( operation_communication.the_cyclist(), $kw11$TV ) == $kw14$MONOTONIC )
    {
      return $kw14$MONOTONIC;
    }
    return $kw15$DEFAULT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ke-utilities.lisp", position = 7796L)
  public static SubLObject constantify(final SubLObject strings)
  {
    SubLObject cdolist_list_var = strings;
    SubLObject s = NIL;
    s = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( s, ke_value( operation_communication.the_cyclist(), $kw16$ALREADY_CREATED ), Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
      {
        ke.ke_create( s );
        change_ke_value( operation_communication.the_cyclist(), $kw16$ALREADY_CREATED, $kw17$CONS, s );
      }
      cdolist_list_var = cdolist_list_var.rest();
      s = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_ke_utilities_file()
  {
    SubLFiles.declareFunction( me, "ke_value", "KE-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "change_ke_value", "CHANGE-KE-VALUE", 2, 2, false );
    SubLFiles.declareFunction( me, "parens_equalP", "PARENS-EQUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "dqs_equalP", "DQS-EQUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "hdify_string", "HDIFY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_from_string", "CYCL-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_from_string", "FORT-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_from_string", "NART-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_from_string_int", "NART-FROM-STRING-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "nat_from_string", "NAT-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "printable_ascii_charP", "PRINTABLE-ASCII-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "strip_garbage_chars", "STRIP-GARBAGE-CHARS", 1, 1, false );
    SubLFiles.declareFunction( me, "set_tv_to_use", "SET-TV-TO-USE", 1, 0, false );
    SubLFiles.declareFunction( me, "constantify", "CONSTANTIFY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_ke_utilities_file()
  {
    $ke_state$ = SubLFiles.defparameter( "*KE-STATE*", NIL );
    $ke_debug$ = SubLFiles.defparameter( "*KE-DEBUG*", NIL );
    $ke_state_keys$ = SubLFiles.defparameter( "*KE-STATE-KEYS*", $list0 );
    $ke_non_constant_name_chars$ = SubLFiles.defparameter( "*KE-NON-CONSTANT-NAME-CHARS*", $list1 );
    return NIL;
  }

  public static SubLObject setup_ke_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ke_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ke_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ke_utilities_file();
  }
  static
  {
    me = new ke_utilities();
    $ke_state$ = null;
    $ke_debug$ = null;
    $ke_state_keys$ = null;
    $ke_non_constant_name_chars$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeKeyword( "MT" ), ZERO_INTEGER ), ConsesLow.cons( makeKeyword( "TV" ), ONE_INTEGER ), ConsesLow.cons( makeKeyword( "DIRECTION" ), TWO_INTEGER ),
      ConsesLow.cons( makeKeyword( "CONSTANT" ), THREE_INTEGER ), ConsesLow.cons( makeKeyword( "UNKNOWNS" ), FOUR_INTEGER ), ConsesLow.cons( makeKeyword( "ALREADY-CREATED" ), FIVE_INTEGER ), ConsesLow.cons( makeKeyword(
          "OK-TOKEN-FORMS" ), SIX_INTEGER ), ConsesLow.cons( makeKeyword( "MALFORMED" ), SEVEN_INTEGER ), ConsesLow.cons( makeKeyword( "ALREADY-IN-KB" ), EIGHT_INTEGER ), ConsesLow.cons( makeKeyword( "FORMS-TO-EVAL" ),
              NINE_INTEGER ), ConsesLow.cons( makeKeyword( "MODE" ), TEN_INTEGER ), ConsesLow.cons( makeKeyword( "COMPOSE-HISTORY" ), ELEVEN_INTEGER ), ConsesLow.cons( makeKeyword( "NOT-IN-KB" ), TWELVE_INTEGER ),
      ConsesLow.cons( makeKeyword( "NOT-VALID-CONSTANTS" ), THIRTEEN_INTEGER ), ConsesLow.cons( makeKeyword( "ALREADY-CONSTANTS" ), FOURTEEN_INTEGER ), ConsesLow.cons( makeKeyword( "APPLICATION" ), FIFTEEN_INTEGER ),
      ConsesLow.cons( makeKeyword( "DEFAULT-MT" ), SIXTEEN_INTEGER ), ConsesLow.cons( makeKeyword( "DIALOG-SCRIPT" ), SEVENTEEN_INTEGER )
    } );
    $list1 = ConsesLow.list( new SubLObject[] { Characters.CHAR_space, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_hash, Characters.CHAR_percent,
      Characters.CHAR_question, Characters.CHAR_dollar, Characters.CHAR_colon
    } );
    $kw2$REPLACE = makeKeyword( "REPLACE" );
    $list3 = ConsesLow.list( NINE_INTEGER, TEN_INTEGER, THIRTEEN_INTEGER );
    $sym4$INVALID_CONSTANT_NAME_CHAR_P = makeSymbol( "INVALID-CONSTANT-NAME-CHAR-P" );
    $str5$nil = makeString( "nil" );
    $list6 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_rparen );
    $list7 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_lparen );
    $sym8$_EXIT = makeSymbol( "%EXIT" );
    $int9$31 = makeInteger( 31 );
    $int10$127 = makeInteger( 127 );
    $kw11$TV = makeKeyword( "TV" );
    $kw12$UNKNOWN = makeKeyword( "UNKNOWN" );
    $const13$DefaultMonotonicPredicate = constant_handles.reader_make_constant_shell( makeString( "DefaultMonotonicPredicate" ) );
    $kw14$MONOTONIC = makeKeyword( "MONOTONIC" );
    $kw15$DEFAULT = makeKeyword( "DEFAULT" );
    $kw16$ALREADY_CREATED = makeKeyword( "ALREADY-CREATED" );
    $kw17$CONS = makeKeyword( "CONS" );
  }
}
/*
 * 
 * Total time: 226 ms
 * 
 */