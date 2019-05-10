package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_string
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_string";
  public static final String myFingerPrint = "5661bd411fab9aaf0b548258695e5a22862c139900a7cff4b1bb8d82347669bc";
  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1508L)
  private static SubLSymbol $pph_string_from_utf8_string_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5798L)
  private static SubLSymbol $pph_space_vector$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5875L)
  private static SubLSymbol $pph_canonicalize_on_bungeP$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$START;
  private static final SubLSymbol $kw4$END;
  private static final SubLSymbol $kw5$CHAR_NUM;
  private static final SubLSymbol $kw6$DONE;
  private static final SubLSymbol $sym7$ITEM;
  private static final SubLSymbol $sym8$DO_SEQUENCE;
  private static final SubLSymbol $kw9$ELEMENT_NUM;
  private static final SubLSymbol $sym10$PCOND;
  private static final SubLSymbol $sym11$CAND;
  private static final SubLSymbol $sym12$INTEGERP;
  private static final SubLSymbol $sym13$_;
  private static final SubLSymbol $sym14$IGNORE;
  private static final SubLSymbol $sym15$__;
  private static final SubLSymbol $sym16$CLET;
  private static final SubLSymbol $sym17$FIF;
  private static final SubLSymbol $sym18$CHARACTERP;
  private static final SubLSymbol $sym19$PPH_CODE_CHAR;
  private static final SubLSymbol $sym20$PPH_STRING_FROM_UTF8_STRING;
  private static final SubLSymbol $sym21$_PPH_STRING_FROM_UTF8_STRING_CACHING_STATE_;
  private static final SubLInteger $int22$256;
  private static final SubLString $str23$_PPH_error_level_;
  private static final SubLString $str24$__;
  private static final SubLString $str25$Can_t_make_a_PPH_string_from__S;
  private static final SubLSymbol $sym26$PPH_CHAR_CODE;
  private static final SubLSymbol $sym27$STRINGP;
  private static final SubLObject $ic28;
  private static final SubLString $str29$;
  private static final SubLSymbol $sym30$NON_EMPTY_PPH_STRING_;
  private static final SubLSymbol $kw31$HTML;
  private static final SubLObject $ic32;
  private static final SubLInteger $int33$255;
  private static final SubLSymbol $sym34$PPH_STRING_P;
  private static final SubLSymbol $kw35$TEST;
  private static final SubLSymbol $kw36$OWNER;
  private static final SubLSymbol $kw37$CLASSES;
  private static final SubLList $list38;
  private static final SubLSymbol $kw39$KB;
  private static final SubLSymbol $kw40$TINY;
  private static final SubLSymbol $kw41$WORKING_;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$PPH_STRING_TO_OUTPUT_FORMAT;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$PPH_STRING_COPY;
  private static final SubLSymbol $sym47$PPH_STRING_EQUAL_;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$PPH_STRING_FIND_IF_;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$PPH_STRING_POSITION;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$PPH_STRING_DOWNCASE;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$PPH_STRING_FROM_CYCL_STRING;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$PPH_STRING_STARTS_WITH;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$PPH_STRING_ENDS_WITH;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$PPH_SUBSTRING_;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$PPH_SUBSTRING;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$_EXIT;
  private static final SubLSymbol $sym67$PPH_CANONICALIZING_BUNGE;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$PPH_NONCANONICALIZING_BUNGE;
  private static final SubLList $list70;

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 922L)
  public static SubLObject do_pph_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_char = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_char = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    string = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw3$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : ZERO_INTEGER;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw4$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject char_num_tail = cdestructuring_bind.property_list_member( $kw5$CHAR_NUM, current );
    final SubLObject char_num = ( NIL != char_num_tail ) ? conses_high.cadr( char_num_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject item = $sym7$ITEM;
    return ConsesLow.list( $sym8$DO_SEQUENCE, ConsesLow.list( item, string, $kw9$ELEMENT_NUM, char_num, $kw6$DONE, done ), ConsesLow.list( $sym10$PCOND, ConsesLow.list( ConsesLow.list( $sym11$CAND, ConsesLow.list(
        $sym12$INTEGERP, char_num ), ConsesLow.list( $sym13$_, char_num, start ) ), ConsesLow.list( $sym14$IGNORE, item ) ), ConsesLow.list( ConsesLow.list( $sym11$CAND, ConsesLow.list( $sym12$INTEGERP, end ), ConsesLow
            .list( $sym12$INTEGERP, char_num ), ConsesLow.list( $sym15$__, char_num, end ) ), ConsesLow.list( $sym14$IGNORE, item ) ), ConsesLow.list( T, ConsesLow.listS( $sym16$CLET, ConsesLow.list( ConsesLow.list(
                v_char, ConsesLow.list( $sym17$FIF, ConsesLow.list( $sym18$CHARACTERP, item ), item, ConsesLow.list( $sym19$PPH_CODE_CHAR, item ) ) ) ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1402L)
  public static SubLObject pph_string_p(final SubLObject obj)
  {
    return makeBoolean( NIL != unicode_strings.ascii_string_p( obj ) || NIL != unicode_strings.unicode_vector_string_p( obj ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1508L)
  public static SubLObject clear_pph_string_from_utf8_string()
  {
    final SubLObject cs = $pph_string_from_utf8_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1508L)
  public static SubLObject remove_pph_string_from_utf8_string(final SubLObject utf8_string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $pph_string_from_utf8_string_caching_state$.getGlobalValue(), ConsesLow.list( utf8_string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1508L)
  public static SubLObject pph_string_from_utf8_string_internal(final SubLObject utf8_string)
  {
    return ( NIL != unicode_strings.non_ascii_string_p( utf8_string ) ) ? pph_string_from_cycl_string( unicode_nauts.utf8_string_to_cycl_safe_string( utf8_string ) ) : utf8_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1508L)
  public static SubLObject pph_string_from_utf8_string(final SubLObject utf8_string)
  {
    SubLObject caching_state = $pph_string_from_utf8_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym20$PPH_STRING_FROM_UTF8_STRING, $sym21$_PPH_STRING_FROM_UTF8_STRING_CACHING_STATE_, $int22$256, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, utf8_string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pph_string_from_utf8_string_internal( utf8_string ) ) );
      memoization_state.caching_state_put( caching_state, utf8_string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1748L)
  public static SubLObject pph_string_from_unicode_naut(final SubLObject naut)
  {
    return unicode_strings.display_to_unicode_vector( cycl_utilities.nat_arg1( naut, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 1853L)
  public static SubLObject pph_string_from_cycl_string(final SubLObject v_cycl_string)
  {
    if( v_cycl_string.isString() )
    {
      return v_cycl_string;
    }
    if( NIL != unicode_nauts.unicode_naut_p( v_cycl_string, UNPROVIDED ) )
    {
      return pph_string_from_unicode_naut( v_cycl_string );
    }
    final SubLObject new_format_string = Sequences.cconcatenate( $str23$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str24$__, format_nil.format_nil_a_no_copy(
        $str25$Can_t_make_a_PPH_string_from__S )
    } );
    pph_error.pph_handle_error( new_format_string, ConsesLow.list( v_cycl_string ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 2129L)
  public static SubLObject pph_string_starts_with(final SubLObject string, final SubLObject start, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    if( string.isString() )
    {
      return string_utilities.starts_with_by_test( string, start, test );
    }
    return string_utilities.starts_with_by_test( unicode_strings.utf8_vector_to_utf8_string( unicode_strings.unicode_vector_to_utf8_vector( string, UNPROVIDED, UNPROVIDED ) ), start, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 2409L)
  public static SubLObject pph_string_ends_with(final SubLObject string, final SubLObject end, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    if( string.isString() )
    {
      return string_utilities.ends_with( string, end, test );
    }
    return string_utilities.ends_with( unicode_strings.utf8_vector_to_utf8_string( unicode_strings.unicode_vector_to_utf8_vector( string, UNPROVIDED, UNPROVIDED ) ), end, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 2661L)
  public static SubLObject pph_string_pre_remove(final SubLObject string, final SubLObject start, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    if( NIL != pph_string_starts_with( string, start, test ) )
    {
      return Sequences.subseq( string, Sequences.length( start ), UNPROVIDED );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 2859L)
  public static SubLObject pph_string_copy(final SubLObject string)
  {
    return Sequences.copy_seq( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 2927L)
  public static SubLObject pph_char_downcase(final SubLObject v_char)
  {
    if( v_char.isChar() )
    {
      return Characters.char_downcase( v_char );
    }
    if( NIL != unicode_strings.ascii_char_p( pph_code_char( v_char ) ) )
    {
      return Characters.char_code( Characters.char_downcase( pph_code_char( v_char ) ) );
    }
    return v_char;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 3151L)
  public static SubLObject pph_string_ndowncase_leading(final SubLObject string)
  {
    Vectors.set_aref( string, ZERO_INTEGER, pph_char_downcase( Vectors.aref( string, ZERO_INTEGER ) ) );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 3283L)
  public static SubLObject pph_string_starts_with_one_of(final SubLObject string, final SubLObject starts)
  {
    if( string.isString() )
    {
      return string_utilities.starts_with_one_of( string, starts );
    }
    SubLObject cdolist_list_var = starts;
    SubLObject start = NIL;
    start = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != pph_string_starts_with( string, start, Symbols.symbol_function( EQUAL ) ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      start = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 3620L)
  public static SubLObject pph_string_equalP(final SubLObject string1, final SubLObject string2)
  {
    if( string1.isString() && string2.isString() )
    {
      return Equality.equal( string1, string2 );
    }
    return Equality.equalp( pph_string_canonicalize( string1 ), pph_string_canonicalize( string2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 3855L)
  public static SubLObject pph_string_concatenate(final SubLObject string1, final SubLObject string2)
  {
    if( string1.isString() && string2.isString() )
    {
      return Sequences.cconcatenate( string1, string2 );
    }
    if( NIL != list_utilities.lengthE( string1, ZERO_INTEGER, UNPROVIDED ) )
    {
      return string2;
    }
    if( NIL != list_utilities.lengthE( string2, ZERO_INTEGER, UNPROVIDED ) )
    {
      return string1;
    }
    return Sequences.cconcatenate( pph_string_canonicalize( string1 ), pph_string_canonicalize( string2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 4198L)
  public static SubLObject pph_string_tokenize(final SubLObject v_pph_string, SubLObject break_list)
  {
    if( break_list == UNPROVIDED )
    {
      break_list = string_utilities.whitespace_chars();
    }
    if( v_pph_string.isString() )
    {
      return string_utilities.string_tokenize( v_pph_string, break_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject token_stack = NIL;
    SubLObject current_string_char_stack = NIL;
    for( SubLObject sequence_var = v_pph_string, end_index = sequence_var.isList() ? NIL : Sequences.length( sequence_var ), ignore_me = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP( ignore_me,
        end_index, sequence_var ); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP( ignore_me, end_index, sequence_var ) )
    {
      final SubLObject item = subl_macros.do_sequence_index_valueP( ignore_me, sequence_var );
      if( !ignore_me.isInteger() || !ignore_me.numL( ZERO_INTEGER ) )
      {
        if( !NIL.isInteger() || !ignore_me.isInteger() || !ignore_me.numGE( NIL ) )
        {
          final SubLObject v_char = item.isChar() ? item : pph_code_char( item );
          if( NIL != subl_promotions.memberP( v_char, break_list, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL != list_utilities.non_empty_list_p( current_string_char_stack ) )
            {
              token_stack = ConsesLow.cons( pph_string_from_char_list( Sequences.nreverse( current_string_char_stack ) ), token_stack );
              current_string_char_stack = NIL;
            }
          }
          else
          {
            current_string_char_stack = ConsesLow.cons( v_char, current_string_char_stack );
          }
        }
      }
      sequence_var = subl_macros.do_sequence_index_update( sequence_var );
      ignore_me = Numbers.add( ignore_me, ONE_INTEGER );
    }
    if( NIL != list_utilities.non_empty_list_p( current_string_char_stack ) )
    {
      token_stack = ConsesLow.cons( pph_string_from_char_list( Sequences.nreverse( current_string_char_stack ) ), token_stack );
    }
    return Sequences.nreverse( token_stack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 4973L)
  public static SubLObject pph_string_from_char_list(final SubLObject chars)
  {
    if( NIL != list_utilities.find_if_not( $sym18$CHARACTERP, chars, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return list_utilities.list2vector( Mapping.mapcar( $sym26$PPH_CHAR_CODE, chars ) );
    }
    return unicode_strings.string_from_char_list( chars, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5171L)
  public static SubLObject preds_of_pph_string(final SubLObject string, SubLObject misspellings)
  {
    if( misspellings == UNPROVIDED )
    {
      misspellings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( string.isString() )
    {
      return lexicon_utilities.preds_of_string( string, misspellings, pph_vars.$pph_language_mt$.getDynamicValue( thread ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5450L)
  public static SubLObject pph_string_last_char(final SubLObject string)
  {
    if( string.isString() )
    {
      return string_utilities.last_char( string );
    }
    return pph_string_char_from_end( string, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5610L)
  public static SubLObject pph_string_char_from_end(final SubLObject string, final SubLObject i)
  {
    if( string.isString() )
    {
      return string_utilities.char_from_end( string, i );
    }
    return pph_string_char( string, Numbers.subtract( Sequences.length( string ), number_utilities.f_1X( i ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 5932L)
  public static SubLObject pph_bunge(final SubLObject strings_to_bunge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $pph_canonicalize_on_bungeP$.getDynamicValue( thread ) && NIL != list_utilities.list_of_type_p( $sym27$STRINGP, strings_to_bunge ) )
    {
      return string_utilities.bunge( strings_to_bunge, UNPROVIDED );
    }
    if( NIL != list_utilities.empty_list_p( strings_to_bunge ) )
    {
      return ( NIL != $pph_canonicalize_on_bungeP$.getDynamicValue( thread ) ) ? $ic28 : $str29$;
    }
    if( NIL != list_utilities.find_if_not( $sym30$NON_EMPTY_PPH_STRING_, strings_to_bunge, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return pph_bunge( list_utilities.remove_if_not( $sym30$NON_EMPTY_PPH_STRING_, strings_to_bunge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    final SubLObject first_string = strings_to_bunge.first();
    SubLObject ans = pph_string_canonicalize( first_string );
    SubLObject cdolist_list_var = strings_to_bunge.rest();
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = Sequences.cconcatenate( ans, new SubLObject[] { $pph_space_vector$.getGlobalValue(), pph_string_canonicalize( string )
      } );
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 6602L)
  public static SubLObject pph_string_find_if(final SubLObject test, final SubLObject string)
  {
    if( string.isString() )
    {
      return Sequences.find_if( test, string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject code;
    SubLObject v_char;
    for( length = Sequences.length( string ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      code = Vectors.aref( string, element_num );
      v_char = Characters.code_char( code );
      if( NIL != v_char && NIL != Functions.funcall( test, v_char ) )
      {
        return v_char;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 6865L)
  public static SubLObject pph_string_position(final SubLObject v_char, final SubLObject string, SubLObject test, SubLObject key, SubLObject start, SubLObject end)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( string.isString() )
    {
      return Sequences.position( v_char, string, test, key, start, end );
    }
    return Sequences.position( pph_char_code( v_char ), string, test, key, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 7132L)
  public static SubLObject pph_string_char(final SubLObject string, final SubLObject i)
  {
    if( string.isString() )
    {
      return Strings.sublisp_char( string, i );
    }
    return pph_code_char( Vectors.aref( string, i ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 7286L)
  public static SubLObject pph_char_E(final SubLObject char1, final SubLObject char2)
  {
    if( char1.isChar() && char2.isChar() )
    {
      return Characters.charE( char1, char2 );
    }
    return Equality.eql( pph_char_code( char1 ), pph_char_code( char2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 7488L)
  public static SubLObject pph_set_nth_char(final SubLObject n, final SubLObject string, final SubLObject new_char, SubLObject safeP)
  {
    if( safeP == UNPROVIDED )
    {
      safeP = NIL;
    }
    if( string.isString() && new_char.isChar() )
    {
      return string_utilities.set_nth_char( n, string, new_char, safeP );
    }
    if( NIL == safeP || NIL != list_utilities.lengthG( string, n, UNPROVIDED ) )
    {
      Vectors.set_aref( string, n, pph_char_code( new_char ) );
      return string;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 7785L)
  public static SubLObject pph_substringP(final SubLObject little, final SubLObject big, SubLObject test, SubLObject start, SubLObject end)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( little.isString() && big.isString() )
    {
      return list_utilities.sublisp_boolean( string_utilities.substringP( little, big, test, start, end ) );
    }
    if( NIL != list_utilities.greater_or_same_length_p( big, little ) )
    {
      return list_utilities.sublisp_boolean( Sequences.search( pph_string_canonicalize( little ), pph_string_canonicalize( big ), Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL,
          start, end ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 8181L)
  public static SubLObject pph_substring(final SubLObject string, final SubLObject start, SubLObject end)
  {
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( string.isString() )
    {
      return string_utilities.substring( string, start, end );
    }
    return Sequences.subseq( string, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 8351L)
  public static SubLObject pph_string_to_display(final SubLObject string)
  {
    if( string.isString() )
    {
      return string;
    }
    return unicode_strings.unicode_vector_to_display( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 8496L)
  public static SubLObject pph_string_if_non_null_to_output_format(final SubLObject string, SubLObject mode)
  {
    if( mode == UNPROVIDED )
    {
      mode = pph_vars.$paraphrase_mode$.getDynamicValue();
    }
    return ( NIL == string ) ? string : pph_string_to_output_format( string, mode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 8678L)
  public static SubLObject pph_string_to_cycl(final SubLObject string)
  {
    if( string.isString() )
    {
      return string;
    }
    if( NIL != unicode_strings.unicode_vector_is_ascii_string_p( string, UNPROVIDED, UNPROVIDED ) )
    {
      return unicode_strings.utf8_vector_to_utf8_string( unicode_strings.unicode_vector_to_utf8_vector( string, UNPROVIDED, UNPROVIDED ) );
    }
    return unicode_nauts.make_unicode_naut( unicode_strings.unicode_vector_to_display( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 9066L)
  public static SubLObject pph_string_to_output_format(final SubLObject string, SubLObject mode)
  {
    if( mode == UNPROVIDED )
    {
      mode = pph_vars.$paraphrase_mode$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != unicode_strings.ascii_string_p( string ) )
    {
      return string;
    }
    if( mode == $kw31$HTML || NIL != unicode_strings.unicode_vector_is_ascii_string_p( string, UNPROVIDED, UNPROVIDED ) )
    {
      return pph_string_to_html_escaped( string, UNPROVIDED );
    }
    if( NIL != pph_vars.$allow_utf8_in_pph_text_mode$.getDynamicValue( thread ) )
    {
      return pph_string_to_utf8( string );
    }
    if( string.isString() )
    {
      return unicode_nauts.utf8_string_to_cycl_safe_string( string );
    }
    return unicode_nauts.make_unicode_naut( unicode_strings.unicode_vector_to_display( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 9703L)
  public static SubLObject pph_string_if_non_null_to_html_escaped(final SubLObject string)
  {
    return ( NIL == string ) ? string : pph_string_to_html_escaped( string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 9839L)
  public static SubLObject pph_string_to_html_escaped(final SubLObject string, SubLObject escape_reserved_charsP)
  {
    if( escape_reserved_charsP == UNPROVIDED )
    {
      escape_reserved_charsP = NIL;
    }
    if( NIL != unicode_strings.ascii_string_p( string ) )
    {
      return string;
    }
    if( string.isString() )
    {
      return unicode_strings.unicode_to_html_escaped( unicode_strings.utf8_string_to_unicode_vector( unicode_strings.html_escaped_to_utf8_string( string ) ), UNPROVIDED );
    }
    return unicode_strings.unicode_to_html_escaped( string, escape_reserved_charsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 10278L)
  public static SubLObject pph_string_if_non_null_to_utf8(final SubLObject string)
  {
    return ( NIL == string ) ? string : pph_string_to_utf8( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 10398L)
  public static SubLObject pph_string_to_utf8(final SubLObject string)
  {
    if( string.isString() )
    {
      return string;
    }
    return unicode_strings.utf8_vector_to_utf8_string( unicode_strings.unicode_vector_to_utf8_vector( string, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 10634L)
  public static SubLObject non_empty_pph_stringP(final SubLObject obj)
  {
    return makeBoolean( NIL != pph_string_p( obj ) && NIL != list_utilities.lengthG( obj, ZERO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 10735L)
  public static SubLObject pph_string_canonicalize(final SubLObject string)
  {
    return string.isString() ? unicode_strings.utf8_string_to_unicode_vector( string ) : string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 10862L)
  public static SubLObject pph_nupcase_nth(final SubLObject string, final SubLObject n, SubLObject safeP)
  {
    if( safeP == UNPROVIDED )
    {
      safeP = T;
    }
    if( string.isString() )
    {
      return string_utilities.nupcase_nth( string, n, safeP );
    }
    if( NIL == safeP || NIL != list_utilities.lengthG( string, n, UNPROVIDED ) )
    {
      final SubLObject v_char = pph_code_char( Vectors.aref( string, n ) );
      if( v_char.isChar() )
      {
        Vectors.set_aref( string, n, Characters.char_code( Characters.char_upcase( v_char ) ) );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 11193L)
  public static SubLObject pph_string_downcase(final SubLObject string)
  {
    if( string.isString() )
    {
      return Strings.string_downcase( string, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject ans = vector_utilities.copy_vector( string );
    for( SubLObject sequence_var = string, end_index = sequence_var.isList() ? NIL : Sequences.length( sequence_var ), i = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP( i, end_index,
        sequence_var ); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP( i, end_index, sequence_var ) )
    {
      final SubLObject code = subl_macros.do_sequence_index_valueP( i, sequence_var );
      final SubLObject downcased = pph_char_downcase( pph_code_char( code ) );
      Vectors.set_aref( ans, i, downcased.isChar() ? Characters.char_code( downcased ) : downcased );
      sequence_var = subl_macros.do_sequence_index_update( sequence_var );
      i = Numbers.add( i, ONE_INTEGER );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 11580L)
  public static SubLObject pph_remove_substring(final SubLObject big, final SubLObject little)
  {
    if( big.isString() && little.isString() )
    {
      return string_utilities.remove_substring( big, little );
    }
    return vector_utilities.vector_nreplace_subsequence( $ic32, pph_string_canonicalize( little ), pph_string_canonicalize( big ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 11848L)
  public static SubLObject pph_code_char(final SubLObject code)
  {
    return code.numLE( $int33$255 ) ? Characters.code_char( code ) : get_pph_code_char( code );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12056L)
  public static SubLObject pph_char_code(final SubLObject v_char)
  {
    return v_char.isChar() ? Characters.char_code( v_char ) : get_pph_char_code( v_char );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12181L)
  public static SubLObject get_pph_code_char(final SubLObject code)
  {
    return code;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12304L)
  public static SubLObject get_pph_char_code(final SubLObject v_char)
  {
    return v_char;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12427L)
  public static SubLObject pph_string_find_ifP(final SubLObject test, final SubLObject string)
  {
    return list_utilities.sublisp_boolean( pph_string_find_if( test, string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12427L)
  public static SubLObject pph_canonicalizing_bunge(final SubLObject strings_to_bunge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $pph_canonicalize_on_bungeP$.currentBinding( thread );
    try
    {
      $pph_canonicalize_on_bungeP$.bind( T, thread );
      return pph_bunge( strings_to_bunge );
    }
    finally
    {
      $pph_canonicalize_on_bungeP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-string.lisp", position = 12427L)
  public static SubLObject pph_noncanonicalizing_bunge(final SubLObject strings_to_bunge)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $pph_canonicalize_on_bungeP$.currentBinding( thread );
    try
    {
      $pph_canonicalize_on_bungeP$.bind( NIL, thread );
      return pph_bunge( strings_to_bunge );
    }
    finally
    {
      $pph_canonicalize_on_bungeP$.rebind( _prev_bind_0, thread );
    }
  }

  public static SubLObject declare_pph_string_file()
  {
    SubLFiles.declareMacro( me, "do_pph_string", "DO-PPH-STRING" );
    SubLFiles.declareFunction( me, "pph_string_p", "PPH-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_pph_string_from_utf8_string", "CLEAR-PPH-STRING-FROM-UTF8-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pph_string_from_utf8_string", "REMOVE-PPH-STRING-FROM-UTF8-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_from_utf8_string_internal", "PPH-STRING-FROM-UTF8-STRING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_from_utf8_string", "PPH-STRING-FROM-UTF8-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_from_unicode_naut", "PPH-STRING-FROM-UNICODE-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_from_cycl_string", "PPH-STRING-FROM-CYCL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_starts_with", "PPH-STRING-STARTS-WITH", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_string_ends_with", "PPH-STRING-ENDS-WITH", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_string_pre_remove", "PPH-STRING-PRE-REMOVE", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_string_copy", "PPH-STRING-COPY", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_char_downcase", "PPH-CHAR-DOWNCASE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_ndowncase_leading", "PPH-STRING-NDOWNCASE-LEADING", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_starts_with_one_of", "PPH-STRING-STARTS-WITH-ONE-OF", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_string_equalP", "PPH-STRING-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_string_concatenate", "PPH-STRING-CONCATENATE", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_string_tokenize", "PPH-STRING-TOKENIZE", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_string_from_char_list", "PPH-STRING-FROM-CHAR-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "preds_of_pph_string", "PREDS-OF-PPH-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_string_last_char", "PPH-STRING-LAST-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_char_from_end", "PPH-STRING-CHAR-FROM-END", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_bunge", "PPH-BUNGE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_find_if", "PPH-STRING-FIND-IF", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_string_position", "PPH-STRING-POSITION", 2, 4, false );
    SubLFiles.declareFunction( me, "pph_string_char", "PPH-STRING-CHAR", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_char_E", "PPH-CHAR-=", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_set_nth_char", "PPH-SET-NTH-CHAR", 3, 1, false );
    SubLFiles.declareFunction( me, "pph_substringP", "PPH-SUBSTRING?", 2, 3, false );
    SubLFiles.declareFunction( me, "pph_substring", "PPH-SUBSTRING", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_string_to_display", "PPH-STRING-TO-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_if_non_null_to_output_format", "PPH-STRING-IF-NON-NULL-TO-OUTPUT-FORMAT", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_string_to_cycl", "PPH-STRING-TO-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_to_output_format", "PPH-STRING-TO-OUTPUT-FORMAT", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_string_if_non_null_to_html_escaped", "PPH-STRING-IF-NON-NULL-TO-HTML-ESCAPED", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_to_html_escaped", "PPH-STRING-TO-HTML-ESCAPED", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_string_if_non_null_to_utf8", "PPH-STRING-IF-NON-NULL-TO-UTF8", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_to_utf8", "PPH-STRING-TO-UTF8", 1, 0, false );
    SubLFiles.declareFunction( me, "non_empty_pph_stringP", "NON-EMPTY-PPH-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_canonicalize", "PPH-STRING-CANONICALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_nupcase_nth", "PPH-NUPCASE-NTH", 2, 1, false );
    SubLFiles.declareFunction( me, "pph_string_downcase", "PPH-STRING-DOWNCASE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_remove_substring", "PPH-REMOVE-SUBSTRING", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_code_char", "PPH-CODE-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_char_code", "PPH-CHAR-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_pph_code_char", "GET-PPH-CODE-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_pph_char_code", "GET-PPH-CHAR-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_string_find_ifP", "PPH-STRING-FIND-IF?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_canonicalizing_bunge", "PPH-CANONICALIZING-BUNGE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_noncanonicalizing_bunge", "PPH-NONCANONICALIZING-BUNGE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_string_file()
  {
    $pph_string_from_utf8_string_caching_state$ = SubLFiles.deflexical( "*PPH-STRING-FROM-UTF8-STRING-CACHING-STATE*", NIL );
    $pph_space_vector$ = SubLFiles.deflexical( "*PPH-SPACE-VECTOR*", Vectors.make_vector( ONE_INTEGER, Characters.char_code( Characters.CHAR_space ) ) );
    $pph_canonicalize_on_bungeP$ = SubLFiles.defparameter( "*PPH-CANONICALIZE-ON-BUNGE?*", NIL );
    return NIL;
  }

  public static SubLObject setup_pph_string_file()
  {
    memoization_state.note_globally_cached_function( $sym20$PPH_STRING_FROM_UTF8_STRING );
    generic_testing.define_test_case_table_int( $sym34$PPH_STRING_P, ConsesLow.list( new SubLObject[] { $kw35$TEST, NIL, $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list42 );
    generic_testing.define_test_case_table_int( $sym30$NON_EMPTY_PPH_STRING_, ConsesLow.list( new SubLObject[] { $kw35$TEST, NIL, $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list43 );
    generic_testing.define_test_case_table_int( $sym44$PPH_STRING_TO_OUTPUT_FORMAT, ConsesLow.list( new SubLObject[] { $kw35$TEST, Symbols.symbol_function( EQUAL ), $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB,
      $kw40$TINY, $kw41$WORKING_, T
    } ), $list45 );
    generic_testing.define_test_case_table_int( $sym46$PPH_STRING_COPY, ConsesLow.list( new SubLObject[] { $kw35$TEST, Symbols.symbol_function( $sym47$PPH_STRING_EQUAL_ ), $kw36$OWNER, NIL, $kw37$CLASSES, $list38,
      $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list48 );
    generic_testing.define_test_case_table_int( $sym49$PPH_STRING_FIND_IF_, ConsesLow.list( new SubLObject[] { $kw35$TEST, NIL, $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list50 );
    generic_testing.define_test_case_table_int( $sym51$PPH_STRING_POSITION, ConsesLow.list( new SubLObject[] { $kw35$TEST, NIL, $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list52 );
    generic_testing.define_test_case_table_int( $sym47$PPH_STRING_EQUAL_, ConsesLow.list( new SubLObject[] { $kw35$TEST, NIL, $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list53 );
    generic_testing.define_test_case_table_int( $sym54$PPH_STRING_DOWNCASE, ConsesLow.list( new SubLObject[] { $kw35$TEST, Symbols.symbol_function( $sym47$PPH_STRING_EQUAL_ ), $kw36$OWNER, NIL, $kw37$CLASSES, $list38,
      $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list55 );
    generic_testing.define_test_case_table_int( $sym56$PPH_STRING_FROM_CYCL_STRING, ConsesLow.list( new SubLObject[] { $kw35$TEST, Symbols.symbol_function( $sym47$PPH_STRING_EQUAL_ ), $kw36$OWNER, NIL, $kw37$CLASSES,
      $list38, $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list57 );
    generic_testing.define_test_case_table_int( $sym58$PPH_STRING_STARTS_WITH, ConsesLow.list( new SubLObject[] { $kw35$TEST, NIL, $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list59 );
    generic_testing.define_test_case_table_int( $sym60$PPH_STRING_ENDS_WITH, ConsesLow.list( new SubLObject[] { $kw35$TEST, NIL, $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list61 );
    generic_testing.define_test_case_table_int( $sym62$PPH_SUBSTRING_, ConsesLow.list( new SubLObject[] { $kw35$TEST, NIL, $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list63 );
    generic_testing.define_test_case_table_int( $sym64$PPH_SUBSTRING, ConsesLow.list( new SubLObject[] { $kw35$TEST, Symbols.symbol_function( $sym47$PPH_STRING_EQUAL_ ), $kw36$OWNER, NIL, $kw37$CLASSES, $list38,
      $kw39$KB, $kw40$TINY, $kw41$WORKING_, T
    } ), $list65 );
    generic_testing.define_test_case_table_int( $sym67$PPH_CANONICALIZING_BUNGE, ConsesLow.list( new SubLObject[] { $kw35$TEST, Symbols.symbol_function( EQUALP ), $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB,
      $kw40$TINY, $kw41$WORKING_, T
    } ), $list68 );
    generic_testing.define_test_case_table_int( $sym69$PPH_NONCANONICALIZING_BUNGE, ConsesLow.list( new SubLObject[] { $kw35$TEST, Symbols.symbol_function( EQUALP ), $kw36$OWNER, NIL, $kw37$CLASSES, $list38, $kw39$KB,
      $kw40$TINY, $kw41$WORKING_, T
    } ), $list70 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_string_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_string_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_string_file();
  }
  static
  {
    me = new pph_string();
    $pph_string_from_utf8_string_caching_state$ = null;
    $pph_space_vector$ = null;
    $pph_canonicalize_on_bungeP$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHAR" ), makeSymbol( "STRING" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ), makeSymbol( "CHAR-NUM" ),
        makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "START" ), makeKeyword( "END" ), makeKeyword( "CHAR-NUM" ), makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$START = makeKeyword( "START" );
    $kw4$END = makeKeyword( "END" );
    $kw5$CHAR_NUM = makeKeyword( "CHAR-NUM" );
    $kw6$DONE = makeKeyword( "DONE" );
    $sym7$ITEM = makeUninternedSymbol( "ITEM" );
    $sym8$DO_SEQUENCE = makeSymbol( "DO-SEQUENCE" );
    $kw9$ELEMENT_NUM = makeKeyword( "ELEMENT-NUM" );
    $sym10$PCOND = makeSymbol( "PCOND" );
    $sym11$CAND = makeSymbol( "CAND" );
    $sym12$INTEGERP = makeSymbol( "INTEGERP" );
    $sym13$_ = makeSymbol( "<" );
    $sym14$IGNORE = makeSymbol( "IGNORE" );
    $sym15$__ = makeSymbol( ">=" );
    $sym16$CLET = makeSymbol( "CLET" );
    $sym17$FIF = makeSymbol( "FIF" );
    $sym18$CHARACTERP = makeSymbol( "CHARACTERP" );
    $sym19$PPH_CODE_CHAR = makeSymbol( "PPH-CODE-CHAR" );
    $sym20$PPH_STRING_FROM_UTF8_STRING = makeSymbol( "PPH-STRING-FROM-UTF8-STRING" );
    $sym21$_PPH_STRING_FROM_UTF8_STRING_CACHING_STATE_ = makeSymbol( "*PPH-STRING-FROM-UTF8-STRING-CACHING-STATE*" );
    $int22$256 = makeInteger( 256 );
    $str23$_PPH_error_level_ = makeString( "(PPH error level " );
    $str24$__ = makeString( ") " );
    $str25$Can_t_make_a_PPH_string_from__S = makeString( "Can't make a PPH string from ~S" );
    $sym26$PPH_CHAR_CODE = makeSymbol( "PPH-CHAR-CODE" );
    $sym27$STRINGP = makeSymbol( "STRINGP" );
    $ic28 = Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY );
    $str29$ = makeString( "" );
    $sym30$NON_EMPTY_PPH_STRING_ = makeSymbol( "NON-EMPTY-PPH-STRING?" );
    $kw31$HTML = makeKeyword( "HTML" );
    $ic32 = Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY );
    $int33$255 = makeInteger( 255 );
    $sym34$PPH_STRING_P = makeSymbol( "PPH-STRING-P" );
    $kw35$TEST = makeKeyword( "TEST" );
    $kw36$OWNER = makeKeyword( "OWNER" );
    $kw37$CLASSES = makeKeyword( "CLASSES" );
    $list38 = ConsesLow.list( makeSymbol( "PPH-TEST-CASE-TABLES" ), makeSymbol( "PPH-STRING-TEST-CASE-TABLES" ) );
    $kw39$KB = makeKeyword( "KB" );
    $kw40$TINY = makeKeyword( "TINY" );
    $kw41$WORKING_ = makeKeyword( "WORKING?" );
    $list42 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ) ), T ), ConsesLow.list( ConsesLow.list( makeString(
        "foo" ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
        { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u806F;&u90A6;&u5FEB;&u905E;" ) ) ), NIL ) );
    $list43 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ), NIL ), ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString(
        "foo" ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
        { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u806F;&u90A6;&u5FEB;&u905E;" ) ) ), NIL ) );
    $sym44$PPH_STRING_TO_OUTPUT_FORMAT = makeSymbol( "PPH-STRING-TO-OUTPUT-FORMAT" );
    $list45 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ) ), makeString( "" ) ), ConsesLow.list(
        ConsesLow.list( makeString( "foo" ) ), makeString( "foo" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
        { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ), makeKeyword( "TEXT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u806F;&u90A6;&u5FEB;&u905E;" ) ) ) );
    $sym46$PPH_STRING_COPY = makeSymbol( "PPH-STRING-COPY" );
    $sym47$PPH_STRING_EQUAL_ = makeSymbol( "PPH-STRING-EQUAL?" );
    $list48 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ) ), Vectors.vector(
        EMPTY_SUBL_OBJECT_ARRAY ) ), ConsesLow.list( ConsesLow.list( makeString( "foo" ) ), makeString( "foo" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
        { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
    } ) ), makeString( "foo" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ) ), Vectors.vector( new SubLObject[] { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ) ) );
    $sym49$PPH_STRING_FIND_IF_ = makeSymbol( "PPH-STRING-FIND-IF?" );
    $list50 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "CHARACTERP" ), makeString( "" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeSymbol( "CHARACTERP" ), Vectors.vector(
        EMPTY_SUBL_OBJECT_ARRAY ) ), NIL ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALPHANUMERIC-CHAR-P" ), makeString( "foo" ) ), T ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALPHANUMERIC-CHAR-P" ), Vectors
            .vector( new SubLObject[]
            { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
    } ) ), T ), ConsesLow.list( ConsesLow.list( makeSymbol( "NON-ASCII-CHAR-P" ), Vectors.vector( new SubLObject[] { makeInteger( 128 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ) ), T ) );
    $sym51$PPH_STRING_POSITION = makeSymbol( "PPH-STRING-POSITION" );
    $list52 = ConsesLow.list( ConsesLow.list( ConsesLow.list( Characters.CHAR_o, makeString( "foo" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( Characters.CHAR_o, Vectors.vector( new SubLObject[] { makeInteger(
        102 ), makeInteger( 111 ), makeInteger( 111 )
    } ) ), ONE_INTEGER ) );
    $list53 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ), makeString( "" ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ), Vectors.vector(
        EMPTY_SUBL_OBJECT_ARRAY ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), makeString( "foo" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), Vectors.vector( new SubLObject[]
        { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
    } ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
    } ), makeString( "foo" ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ), Vectors.vector( new SubLObject[] { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ) ), T ) );
    $sym54$PPH_STRING_DOWNCASE = makeSymbol( "PPH-STRING-DOWNCASE" );
    $list55 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ) ), Vectors.vector(
        EMPTY_SUBL_OBJECT_ARRAY ) ), ConsesLow.list( ConsesLow.list( makeString( "Foo" ) ), makeString( "foo" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
        { makeInteger( 70 ), makeInteger( 111 ), makeInteger( 111 )
    } ) ), Vectors.vector( new SubLObject[] { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
    } ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ) ), Vectors.vector( new SubLObject[] { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ) ) );
    $sym56$PPH_STRING_FROM_CYCL_STRING = makeSymbol( "PPH-STRING-FROM-CYCL-STRING" );
    $list57 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( makeString( "foo" ) ), makeString( "foo" ) ), ConsesLow.list( ConsesLow.list(
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "&u806F;&u90A6;&u5FEB;&u905E;" ) ) ), Vectors.vector( new SubLObject[]
        { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ) ) );
    $sym58$PPH_STRING_STARTS_WITH = makeSymbol( "PPH-STRING-STARTS-WITH" );
    $list59 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ), makeString( "" ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ), makeString( "" ) ), T ), ConsesLow.list(
        ConsesLow.list( makeString( "foo" ), makeString( "foo" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), makeString( "fo" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), makeString(
            "" ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
            { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 ), makeInteger( 32 ), makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ), makeString( "foo" ) ), T ) );
    $sym60$PPH_STRING_ENDS_WITH = makeSymbol( "PPH-STRING-ENDS-WITH" );
    $list61 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ), makeString( "" ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ), makeString( "" ) ), T ), ConsesLow.list(
        ConsesLow.list( makeString( "foo" ), makeString( "foo" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), makeString( "oo" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), makeString(
            "" ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
            { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 ), makeInteger( 32 ), makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
    } ), makeString( "foo" ) ), T ) );
    $sym62$PPH_SUBSTRING_ = makeSymbol( "PPH-SUBSTRING?" );
    $list63 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "" ), makeString( "" ) ), T ), ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ), makeString( "" ) ),
        T ), ConsesLow.list( ConsesLow.list( makeString( "" ), Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), makeString( "foo" ) ), T ), ConsesLow.list( ConsesLow
            .list( Vectors.vector( new SubLObject[]
            { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
        } ), makeString( "foo" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), Vectors.vector( new SubLObject[] { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
        } ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "fo" ), makeString( "foo" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "" ), makeString( "foo" ) ), T ), ConsesLow.list( ConsesLow.list(
            makeString( "foo" ), makeString( "" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "o" ), makeString( "foo" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "q" ), makeString( "foo" ) ), NIL ),
      ConsesLow.list( ConsesLow.list( makeString( "foo" ), Vectors.vector( new SubLObject[]
      { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 ), makeInteger( 32 ), makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
      } ) ), T )
    } );
    $sym64$PPH_SUBSTRING = makeSymbol( "PPH-SUBSTRING" );
    $list65 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "" ), ZERO_INTEGER ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( makeString( "" ), ZERO_INTEGER, ZERO_INTEGER ),
        Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ), ZERO_INTEGER ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( makeString( "foo" ),
            ZERO_INTEGER ), makeString( "foo" ) ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), ZERO_INTEGER ), Vectors.vector( new SubLObject[]
            { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
        } ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
        } ), ZERO_INTEGER, THREE_INTEGER ), makeString( "foo" ) ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), ZERO_INTEGER, TWO_INTEGER ), makeString( "fo" ) ), ConsesLow.list( ConsesLow.list( makeString(
            "foo" ), ZERO_INTEGER, ZERO_INTEGER ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( makeString( "foo" ), ONE_INTEGER, ONE_INTEGER ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( makeString(
                "foo" ), ONE_INTEGER, TWO_INTEGER ), makeString( "o" ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
                { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 ), makeInteger( 32 ), makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
        } ), ZERO_INTEGER, THREE_INTEGER ), makeString( "foo" ) )
    } );
    $sym66$_EXIT = makeSymbol( "%EXIT" );
    $sym67$PPH_CANONICALIZING_BUNGE = makeSymbol( "PPH-CANONICALIZING-BUNGE" );
    $list68 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ) ), Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( Vectors.vector(
        EMPTY_SUBL_OBJECT_ARRAY ), makeString( "" ) ) ), Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "foo" ), makeString( "foo" ) ) ), Vectors.vector(
            new SubLObject[]
            { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 ), makeInteger( 32 ), makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
            } ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "foo" ), makeString( "oo" ) ) ), Vectors.vector( new SubLObject[] { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 ), makeInteger(
                32 ), makeInteger( 111 ), makeInteger( 111 )
    } ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "foo" ) ) ), Vectors.vector( new SubLObject[] { makeInteger( 102 ), makeInteger( 111 ), makeInteger( 111 )
    } ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ), makeString( "foo" ) ) ), Vectors.vector( new SubLObject[] { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 ), makeInteger( 32 ), makeInteger( 102 ), makeInteger( 111 ),
      makeInteger( 111 )
    } ) ) );
    $sym69$PPH_NONCANONICALIZING_BUNGE = makeSymbol( "PPH-NONCANONICALIZING-BUNGE" );
    $list70 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ) ) ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "" ), makeString( "" ) ) ), makeString(
        "" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( Vectors.vector( EMPTY_SUBL_OBJECT_ARRAY ), makeString( "" ) ) ), makeString( "" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "foo" ),
            makeString( "foo" ) ) ), makeString( "foo foo" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "foo" ), makeString( "oo" ) ) ), makeString( "foo oo" ) ), ConsesLow.list( ConsesLow.list(
                ConsesLow.list( makeString( "foo" ) ) ), makeString( "foo" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
                { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 )
    } ), makeString( "foo" ) ) ), Vectors.vector( new SubLObject[] { makeInteger( 32879 ), makeInteger( 37030 ), makeInteger( 24555 ), makeInteger( 36958 ), makeInteger( 32 ), makeInteger( 102 ), makeInteger( 111 ),
      makeInteger( 111 )
    } ) ) );
  }
}
/*
 * 
 * Total time: 256 ms
 * 
 */