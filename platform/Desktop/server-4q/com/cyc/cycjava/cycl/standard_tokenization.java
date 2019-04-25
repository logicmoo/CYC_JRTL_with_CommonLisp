package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class standard_tokenization
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.standard_tokenization";
  public static final String myFingerPrint = "82fcc910db7544150218c0c5b50b0d8ee7880f4b5a2f471ad8baf178680741da";
  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 2463L)
  private static SubLSymbol $standard_punctuation_chars$;
  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 2688L)
  private static SubLSymbol $standard_word_final_punctuation_chars$;
  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 2914L)
  private static SubLSymbol $standard_white_space_chars$;
  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLSymbol $dtp_dot_analysis$;
  private static final SubLSymbol $sym0$STRINGP;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$GOBBLE_WS;
  private static final SubLSymbol $kw4$WHITE_SPACE;
  private static final SubLSymbol $kw5$IN_WORD;
  private static final SubLSymbol $kw6$WORD_FINAL_PUNCTUATION;
  private static final SubLSymbol $kw7$PUNCTUATION;
  private static final SubLSymbol $kw8$GENERIC;
  private static final SubLSymbol $sym9$DOT_ANALYSIS;
  private static final SubLSymbol $sym10$DOT_ANALYSIS_P;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$PPRINT_DOT_ANALYSIS;
  private static final SubLSymbol $sym16$DOT_ANALYSIS_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$DOT_ANALYSIS_FOUND;
  private static final SubLSymbol $sym19$_CSETF_DOT_ANALYSIS_FOUND;
  private static final SubLSymbol $sym20$DOT_ANALYSIS_REMAINS;
  private static final SubLSymbol $sym21$_CSETF_DOT_ANALYSIS_REMAINS;
  private static final SubLSymbol $sym22$DOT_ANALYSIS_ACCUMULATOR;
  private static final SubLSymbol $sym23$_CSETF_DOT_ANALYSIS_ACCUMULATOR;
  private static final SubLSymbol $sym24$DOT_ANALYSIS_STATE;
  private static final SubLSymbol $sym25$_CSETF_DOT_ANALYSIS_STATE;
  private static final SubLSymbol $kw26$FOUND;
  private static final SubLSymbol $kw27$REMAINS;
  private static final SubLSymbol $kw28$ACCUMULATOR;
  private static final SubLSymbol $kw29$STATE;
  private static final SubLString $str30$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw31$BEGIN;
  private static final SubLSymbol $sym32$MAKE_DOT_ANALYSIS;
  private static final SubLSymbol $kw33$SLOT;
  private static final SubLSymbol $kw34$END;
  private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_DOT_ANALYSIS_METHOD;
  private static final SubLString $str36$__AP_Found_________S__;
  private static final SubLString $str37$_____Remains_______S__;
  private static final SubLString $str38$_____Accumulator___S__;
  private static final SubLString $str39$_____State_________S___;
  private static final SubLString $str40$_;
  private static final SubLSymbol $kw41$DEFAULT;
  private static final SubLSymbol $kw42$DOT;
  private static final SubLSymbol $kw43$NUM;
  private static final SubLSymbol $kw44$STRING;
  private static final SubLSymbol $kw45$PUNCT;
  private static final SubLSymbol $kw46$DOT_STRING_WANTED;
  private static final SubLSymbol $kw47$STRING_WANTED;
  private static final SubLSymbol $kw48$DOT_INTEGER_WANTED;
  private static final SubLSymbol $kw49$INTEGER_WANTED;
  private static final SubLSymbol $sym50$CCONCATENATE;
  private static final SubLSymbol $sym51$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str52$_a_is_not_greater_than_or_equal_t;
  private static final SubLSymbol $sym53$INTERVAL_TOKEN_P;

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 1188L)
  public static SubLObject standard_raw_tokenization(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return tokenize_sentence( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 1581L)
  public static SubLObject standard_token_chunker(final SubLObject raw_tokenization)
  {
    return perform_dot_analysis( raw_tokenization );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 1803L)
  public static SubLObject standard_string_tokenize(final SubLObject string)
  {
    final SubLObject raw_tokenization = standard_raw_tokenization( string );
    return standard_token_chunker( raw_tokenization );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 2815L)
  public static SubLObject standard_punctuation_chars()
  {
    return conses_high.copy_list( $standard_punctuation_chars$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 2984L)
  public static SubLObject standard_white_space_chars()
  {
    return conses_high.copy_list( $standard_white_space_chars$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 3082L)
  public static SubLObject tokenize_sentence(final SubLObject sentence, SubLObject white_space, SubLObject punctuation, SubLObject word_final_punctuation)
  {
    if( white_space == UNPROVIDED )
    {
      white_space = $standard_white_space_chars$.getGlobalValue();
    }
    if( punctuation == UNPROVIDED )
    {
      punctuation = $standard_punctuation_chars$.getGlobalValue();
    }
    if( word_final_punctuation == UNPROVIDED )
    {
      word_final_punctuation = $standard_word_final_punctuation_chars$.getGlobalValue();
    }
    SubLObject state = $kw3$GOBBLE_WS;
    SubLObject words = NIL;
    SubLObject start = NIL;
    SubLObject end = NIL;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject curr;
    SubLObject pcase_var;
    SubLObject v_class;
    SubLObject pcase_var_$1;
    SubLObject pcase_var_$2;
    SubLObject pcase_var_$3;
    SubLObject pcase_var_$4;
    for( cdotimes_end_var = Sequences.length( sentence ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      curr = Vectors.aref( sentence, i );
      v_class = ( pcase_var = scanner_char_classify( curr, white_space, punctuation, word_final_punctuation ) );
      if( pcase_var.eql( $kw4$WHITE_SPACE ) )
      {
        pcase_var_$1 = state;
        if( pcase_var_$1.eql( $kw5$IN_WORD ) )
        {
          end = i;
          words = ConsesLow.cons( Sequences.subseq( sentence, start, end ), words );
          start = NIL;
          end = NIL;
          state = $kw3$GOBBLE_WS;
        }
      }
      else if( pcase_var.eql( $kw6$WORD_FINAL_PUNCTUATION ) )
      {
        pcase_var_$2 = state;
        if( pcase_var_$2.eql( $kw5$IN_WORD ) )
        {
          end = i;
          words = ConsesLow.cons( Sequences.subseq( sentence, start, end ), words );
          start = NIL;
          end = NIL;
          words = ConsesLow.cons( Sequences.subseq( sentence, i, Numbers.add( i, ONE_INTEGER ) ), words );
          state = $kw3$GOBBLE_WS;
        }
        else if( pcase_var_$2.eql( $kw3$GOBBLE_WS ) )
        {
          start = i;
          state = $kw5$IN_WORD;
        }
      }
      else if( pcase_var.eql( $kw7$PUNCTUATION ) )
      {
        pcase_var_$3 = state;
        if( pcase_var_$3.eql( $kw5$IN_WORD ) )
        {
          end = i;
          words = ConsesLow.cons( Sequences.subseq( sentence, start, end ), words );
          start = NIL;
          end = NIL;
          words = ConsesLow.cons( Sequences.subseq( sentence, i, Numbers.add( i, ONE_INTEGER ) ), words );
          state = $kw3$GOBBLE_WS;
        }
        else if( pcase_var_$3.eql( $kw3$GOBBLE_WS ) )
        {
          words = ConsesLow.cons( Sequences.subseq( sentence, i, Numbers.add( i, ONE_INTEGER ) ), words );
        }
      }
      else if( pcase_var.eql( $kw8$GENERIC ) )
      {
        pcase_var_$4 = state;
        if( pcase_var_$4.eql( $kw3$GOBBLE_WS ) )
        {
          start = i;
          state = $kw5$IN_WORD;
        }
      }
    }
    final SubLObject pcase_var2 = state;
    if( pcase_var2.eql( $kw5$IN_WORD ) )
    {
      words = ConsesLow.cons( Sequences.subseq( sentence, start, UNPROVIDED ), words );
    }
    return Sequences.nreverse( words );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5619L)
  public static SubLObject scanner_char_classify(final SubLObject v_char, final SubLObject white_space, final SubLObject punctuation, final SubLObject word_final_punctuation)
  {
    if( NIL != subl_promotions.memberP( v_char, white_space, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw4$WHITE_SPACE;
    }
    if( NIL != subl_promotions.memberP( v_char, word_final_punctuation, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw6$WORD_FINAL_PUNCTUATION;
    }
    if( NIL != subl_promotions.memberP( v_char, punctuation, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw7$PUNCTUATION;
    }
    return $kw8$GENERIC;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject dot_analysis_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    pprint_dot_analysis( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject dot_analysis_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $dot_analysis_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject dot_analysis_found(final SubLObject v_object)
  {
    assert NIL != dot_analysis_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject dot_analysis_remains(final SubLObject v_object)
  {
    assert NIL != dot_analysis_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject dot_analysis_accumulator(final SubLObject v_object)
  {
    assert NIL != dot_analysis_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject dot_analysis_state(final SubLObject v_object)
  {
    assert NIL != dot_analysis_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject _csetf_dot_analysis_found(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != dot_analysis_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject _csetf_dot_analysis_remains(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != dot_analysis_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject _csetf_dot_analysis_accumulator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != dot_analysis_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject _csetf_dot_analysis_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != dot_analysis_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject make_dot_analysis(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $dot_analysis_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw26$FOUND ) )
      {
        _csetf_dot_analysis_found( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$REMAINS ) )
      {
        _csetf_dot_analysis_remains( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$ACCUMULATOR ) )
      {
        _csetf_dot_analysis_accumulator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$STATE ) )
      {
        _csetf_dot_analysis_state( v_new, current_value );
      }
      else
      {
        Errors.error( $str30$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject visit_defstruct_dot_analysis(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw31$BEGIN, $sym32$MAKE_DOT_ANALYSIS, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw26$FOUND, dot_analysis_found( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw27$REMAINS, dot_analysis_remains( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw28$ACCUMULATOR, dot_analysis_accumulator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw33$SLOT, $kw29$STATE, dot_analysis_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$END, $sym32$MAKE_DOT_ANALYSIS, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 5968L)
  public static SubLObject visit_defstruct_object_dot_analysis_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_dot_analysis( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 6689L)
  public static SubLObject pprint_dot_analysis(final SubLObject d_analysis, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str36$__AP_Found_________S__, dot_analysis_found( d_analysis ) );
    PrintLow.format( stream, $str37$_____Remains_______S__, dot_analysis_remains( d_analysis ) );
    PrintLow.format( stream, $str38$_____Accumulator___S__, dot_analysis_accumulator( d_analysis ) );
    PrintLow.format( stream, $str39$_____State_________S___, dot_analysis_state( d_analysis ) );
    return d_analysis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 7093L)
  public static SubLObject perform_dot_analysis(final SubLObject list_of_strings)
  {
    if( NIL == list_of_strings )
    {
      return NIL;
    }
    final SubLObject last_string = conses_high.last( list_of_strings, UNPROVIDED ).first();
    if( $str40$_.equal( last_string ) )
    {
      final SubLObject list_argument = conses_high.butlast( list_of_strings, UNPROVIDED );
      final SubLObject d_analysis = init_dot_analysis( list_argument );
      final SubLObject result = dot_analysis_dfa( d_analysis );
      return ConsesLow.append( result, ConsesLow.list( $str40$_ ) );
    }
    final SubLObject d_analysis2 = init_dot_analysis( list_of_strings );
    return dot_analysis_dfa( d_analysis2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 7580L)
  public static SubLObject init_dot_analysis(final SubLObject list_of_strings)
  {
    final SubLObject d_analysis = make_dot_analysis( UNPROVIDED );
    _csetf_dot_analysis_found( d_analysis, NIL );
    _csetf_dot_analysis_remains( d_analysis, list_of_strings );
    _csetf_dot_analysis_accumulator( d_analysis, NIL );
    _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
    return d_analysis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 7922L)
  public static SubLObject find_current_dot_type(final SubLObject string)
  {
    if( string.equal( $str40$_ ) )
    {
      return $kw42$DOT;
    }
    if( NIL != string_utilities.digit_stringP( string ) )
    {
      return $kw43$NUM;
    }
    if( !ONE_INTEGER.numE( Sequences.length( string ) ) )
    {
      return $kw44$STRING;
    }
    if( NIL != Characters.alpha_char_p( Strings.sublisp_char( string, ZERO_INTEGER ) ) )
    {
      return $kw44$STRING;
    }
    return $kw45$PUNCT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 8181L)
  public static SubLObject dot_analysis_dfa(final SubLObject d_analysis)
  {
    if( $kw41$DEFAULT == dot_analysis_state( d_analysis ) && NIL == dot_analysis_remains( d_analysis ) )
    {
      return Sequences.nreverse( dot_analysis_found( d_analysis ) );
    }
    final SubLObject pcase_var;
    final SubLObject state = pcase_var = dot_analysis_state( d_analysis );
    if( pcase_var.eql( $kw41$DEFAULT ) )
    {
      dot_analysis_default( d_analysis );
    }
    else if( pcase_var.eql( $kw46$DOT_STRING_WANTED ) )
    {
      dot_analysis_dot_string( d_analysis );
    }
    else if( pcase_var.eql( $kw47$STRING_WANTED ) )
    {
      dot_analysis_string( d_analysis );
    }
    else if( pcase_var.eql( $kw48$DOT_INTEGER_WANTED ) )
    {
      dot_analysis_dot_integer( d_analysis );
    }
    else if( pcase_var.eql( $kw49$INTEGER_WANTED ) )
    {
      dot_analysis_integer( d_analysis );
    }
    return dot_analysis_dfa( d_analysis );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 8783L)
  public static SubLObject dot_analysis_default(final SubLObject d_analysis)
  {
    final SubLObject current = dot_analysis_remains( d_analysis ).first();
    final SubLObject current_type = find_current_dot_type( current );
    _csetf_dot_analysis_remains( d_analysis, dot_analysis_remains( d_analysis ).rest() );
    final SubLObject pcase_var = current_type;
    if( pcase_var.eql( $kw42$DOT ) )
    {
      _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( current, dot_analysis_found( d_analysis ) ) );
    }
    else if( pcase_var.eql( $kw45$PUNCT ) )
    {
      _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( current, dot_analysis_found( d_analysis ) ) );
    }
    else if( pcase_var.eql( $kw43$NUM ) )
    {
      _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
      _csetf_dot_analysis_state( d_analysis, $kw48$DOT_INTEGER_WANTED );
    }
    else if( pcase_var.eql( $kw44$STRING ) )
    {
      _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
      _csetf_dot_analysis_state( d_analysis, $kw46$DOT_STRING_WANTED );
    }
    return d_analysis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 9477L)
  public static SubLObject dot_analysis_dot_string(final SubLObject d_analysis)
  {
    final SubLObject current = dot_analysis_remains( d_analysis ).first();
    if( NIL != current )
    {
      final SubLObject current_type = find_current_dot_type( current );
      _csetf_dot_analysis_remains( d_analysis, dot_analysis_remains( d_analysis ).rest() );
      final SubLObject pcase_var = current_type;
      if( pcase_var.eql( $kw42$DOT ) )
      {
        _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw47$STRING_WANTED );
      }
      else if( pcase_var.eql( $kw45$PUNCT ) )
      {
        clean_dot_accumulator( d_analysis, $kw46$DOT_STRING_WANTED );
        _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( current, dot_analysis_found( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
      }
      else if( pcase_var.eql( $kw43$NUM ) )
      {
        clean_dot_accumulator( d_analysis, $kw46$DOT_STRING_WANTED );
        _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw48$DOT_INTEGER_WANTED );
      }
      else if( pcase_var.eql( $kw44$STRING ) )
      {
        clean_dot_accumulator( d_analysis, $kw46$DOT_STRING_WANTED );
        _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw46$DOT_STRING_WANTED );
      }
    }
    else
    {
      clean_dot_accumulator( d_analysis, $kw46$DOT_STRING_WANTED );
      _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
    }
    return d_analysis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 10608L)
  public static SubLObject dot_analysis_string(final SubLObject d_analysis)
  {
    final SubLObject current = dot_analysis_remains( d_analysis ).first();
    if( NIL != current )
    {
      final SubLObject current_type = find_current_dot_type( current );
      _csetf_dot_analysis_remains( d_analysis, dot_analysis_remains( d_analysis ).rest() );
      final SubLObject pcase_var = current_type;
      if( pcase_var.eql( $kw42$DOT ) )
      {
        clean_dot_accumulator( d_analysis, $kw47$STRING_WANTED );
        _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( current, dot_analysis_found( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
      }
      else if( pcase_var.eql( $kw45$PUNCT ) )
      {
        clean_dot_accumulator( d_analysis, $kw47$STRING_WANTED );
        _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( current, dot_analysis_found( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
      }
      else if( pcase_var.eql( $kw43$NUM ) )
      {
        clean_dot_accumulator( d_analysis, $kw47$STRING_WANTED );
        _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw48$DOT_INTEGER_WANTED );
      }
      else if( pcase_var.eql( $kw44$STRING ) )
      {
        _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw46$DOT_STRING_WANTED );
      }
    }
    else
    {
      clean_dot_accumulator( d_analysis, $kw47$STRING_WANTED );
      _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
    }
    return d_analysis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 11707L)
  public static SubLObject dot_analysis_dot_integer(final SubLObject d_analysis)
  {
    final SubLObject current = dot_analysis_remains( d_analysis ).first();
    if( NIL != current )
    {
      final SubLObject current_type = find_current_dot_type( current );
      _csetf_dot_analysis_remains( d_analysis, dot_analysis_remains( d_analysis ).rest() );
      final SubLObject pcase_var = current_type;
      if( pcase_var.eql( $kw42$DOT ) )
      {
        _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw49$INTEGER_WANTED );
      }
      else if( pcase_var.eql( $kw45$PUNCT ) )
      {
        clean_dot_accumulator( d_analysis, $kw48$DOT_INTEGER_WANTED );
        _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( current, dot_analysis_found( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
      }
      else if( pcase_var.eql( $kw43$NUM ) )
      {
        clean_dot_accumulator( d_analysis, $kw48$DOT_INTEGER_WANTED );
        _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw48$DOT_INTEGER_WANTED );
      }
      else if( pcase_var.eql( $kw44$STRING ) )
      {
        clean_dot_accumulator( d_analysis, $kw48$DOT_INTEGER_WANTED );
        _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw46$DOT_STRING_WANTED );
      }
    }
    else
    {
      clean_dot_accumulator( d_analysis, $kw48$DOT_INTEGER_WANTED );
      _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
    }
    return d_analysis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 12874L)
  public static SubLObject dot_analysis_integer(final SubLObject d_analysis)
  {
    final SubLObject current = dot_analysis_remains( d_analysis ).first();
    if( NIL != current )
    {
      final SubLObject current_type = find_current_dot_type( current );
      _csetf_dot_analysis_remains( d_analysis, dot_analysis_remains( d_analysis ).rest() );
      final SubLObject pcase_var = current_type;
      if( pcase_var.eql( $kw42$DOT ) )
      {
        clean_dot_accumulator( d_analysis, $kw49$INTEGER_WANTED );
        _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( current, dot_analysis_found( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
      }
      else if( pcase_var.eql( $kw45$PUNCT ) )
      {
        clean_dot_accumulator( d_analysis, $kw49$INTEGER_WANTED );
        _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( current, dot_analysis_found( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
      }
      else if( pcase_var.eql( $kw43$NUM ) )
      {
        final SubLObject all = ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) );
        final SubLObject compact = Functions.apply( Symbols.symbol_function( $sym50$CCONCATENATE ), Sequences.nreverse( all ) );
        _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( compact, dot_analysis_found( d_analysis ) ) );
        _csetf_dot_analysis_accumulator( d_analysis, NIL );
        _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
      }
      else if( pcase_var.eql( $kw44$STRING ) )
      {
        clean_dot_accumulator( d_analysis, $kw49$INTEGER_WANTED );
        _csetf_dot_analysis_accumulator( d_analysis, ConsesLow.cons( current, dot_analysis_accumulator( d_analysis ) ) );
        _csetf_dot_analysis_state( d_analysis, $kw46$DOT_STRING_WANTED );
      }
    }
    else
    {
      clean_dot_accumulator( d_analysis, $kw49$INTEGER_WANTED );
      _csetf_dot_analysis_state( d_analysis, $kw41$DEFAULT );
    }
    return d_analysis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 14144L)
  public static SubLObject clean_dot_accumulator(final SubLObject d_analysis, final SubLObject state)
  {
    if( state.eql( $kw46$DOT_STRING_WANTED ) )
    {
      final SubLObject incomplete = dot_analysis_accumulator( d_analysis ).first();
      final SubLObject complete = dot_analysis_accumulator( d_analysis ).rest();
      final SubLObject compact = ( NIL != complete ) ? Functions.apply( Symbols.symbol_function( $sym50$CCONCATENATE ), Sequences.nreverse( complete ) ) : NIL;
      final SubLObject all = ( NIL != compact ) ? ConsesLow.cons( incomplete, ConsesLow.list( compact ) ) : ConsesLow.list( incomplete );
      _csetf_dot_analysis_found( d_analysis, ConsesLow.append( all, dot_analysis_found( d_analysis ) ) );
      _csetf_dot_analysis_accumulator( d_analysis, NIL );
    }
    else if( state.eql( $kw47$STRING_WANTED ) )
    {
      _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( Functions.apply( Symbols.symbol_function( $sym50$CCONCATENATE ), Sequences.nreverse( dot_analysis_accumulator( d_analysis ) ) ), dot_analysis_found(
          d_analysis ) ) );
      _csetf_dot_analysis_accumulator( d_analysis, NIL );
    }
    else if( state.eql( $kw48$DOT_INTEGER_WANTED ) )
    {
      final SubLObject integer = dot_analysis_accumulator( d_analysis ).first();
      _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( integer, dot_analysis_found( d_analysis ) ) );
      _csetf_dot_analysis_accumulator( d_analysis, NIL );
    }
    else if( state.eql( $kw49$INTEGER_WANTED ) )
    {
      _csetf_dot_analysis_found( d_analysis, ConsesLow.cons( Functions.apply( Symbols.symbol_function( $sym50$CCONCATENATE ), Sequences.nreverse( dot_analysis_accumulator( d_analysis ) ) ), dot_analysis_found(
          d_analysis ) ) );
      _csetf_dot_analysis_accumulator( d_analysis, NIL );
    }
    return d_analysis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 15332L)
  public static SubLObject new_interval_token(SubLObject start, SubLObject end, SubLObject value)
  {
    if( start == UNPROVIDED )
    {
      start = NIL;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( value == UNPROVIDED )
    {
      value = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( start ) : start;
    assert NIL != subl_promotions.non_negative_integer_p( end ) : end;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !end.numGE( start ) )
    {
      Errors.error( $str52$_a_is_not_greater_than_or_equal_t, end, start );
    }
    final SubLObject itoken = Vectors.make_vector( THREE_INTEGER, UNPROVIDED );
    Vectors.set_aref( itoken, ZERO_INTEGER, start );
    Vectors.set_aref( itoken, ONE_INTEGER, end );
    Vectors.set_aref( itoken, TWO_INTEGER, value );
    return itoken;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 16240L)
  public static SubLObject interval_token_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isVector() && Sequences.length( v_object ).eql( THREE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 16417L)
  public static SubLObject interval_token_start(final SubLObject itoken)
  {
    assert NIL != interval_token_p( itoken ) : itoken;
    return Vectors.aref( itoken, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 16605L)
  public static SubLObject interval_token_end(final SubLObject itoken)
  {
    assert NIL != interval_token_p( itoken ) : itoken;
    return Vectors.aref( itoken, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 16789L)
  public static SubLObject interval_token_length(final SubLObject itoken)
  {
    assert NIL != interval_token_p( itoken ) : itoken;
    return Numbers.subtract( interval_token_end( itoken ), interval_token_start( itoken ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 17024L)
  public static SubLObject interval_token_value(final SubLObject itoken)
  {
    assert NIL != interval_token_p( itoken ) : itoken;
    return Vectors.aref( itoken, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 17202L)
  public static SubLObject interval_token_value_set(final SubLObject itoken, final SubLObject value)
  {
    assert NIL != interval_token_p( itoken ) : itoken;
    Vectors.set_aref( itoken, TWO_INTEGER, value );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 17483L)
  public static SubLObject string_token_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && v_object.first().isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 17838L)
  public static SubLObject new_string_token(SubLObject string, SubLObject value)
  {
    if( string == UNPROVIDED )
    {
      string = NIL;
    }
    if( value == UNPROVIDED )
    {
      value = NIL;
    }
    return ConsesLow.cons( string, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 18056L)
  public static SubLObject string_token_string(final SubLObject stoken)
  {
    return stoken.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 18203L)
  public static SubLObject string_token_value(final SubLObject stoken)
  {
    return stoken.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 18349L)
  public static SubLObject copy_string_token(final SubLObject stoken)
  {
    return new_string_token( string_token_string( stoken ), string_token_value( stoken ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 18480L)
  public static SubLObject string_token_string_set(final SubLObject stoken, final SubLObject string)
  {
    return ConsesLow.rplaca( stoken, string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/standard-tokenization.lisp", position = 18720L)
  public static SubLObject string_token_value_set(final SubLObject stoken, final SubLObject value)
  {
    return ConsesLow.rplacd( stoken, value );
  }

  public static SubLObject declare_standard_tokenization_file()
  {
    SubLFiles.declareFunction( me, "standard_raw_tokenization", "STANDARD-RAW-TOKENIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "standard_token_chunker", "STANDARD-TOKEN-CHUNKER", 1, 0, false );
    SubLFiles.declareFunction( me, "standard_string_tokenize", "STANDARD-STRING-TOKENIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "standard_punctuation_chars", "STANDARD-PUNCTUATION-CHARS", 0, 0, false );
    SubLFiles.declareFunction( me, "standard_white_space_chars", "STANDARD-WHITE-SPACE-CHARS", 0, 0, false );
    SubLFiles.declareFunction( me, "tokenize_sentence", "TOKENIZE-SENTENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "scanner_char_classify", "SCANNER-CHAR-CLASSIFY", 4, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_print_function_trampoline", "DOT-ANALYSIS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_p", "DOT-ANALYSIS-P", 1, 0, false );
    new $dot_analysis_p$UnaryFunction();
    SubLFiles.declareFunction( me, "dot_analysis_found", "DOT-ANALYSIS-FOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_remains", "DOT-ANALYSIS-REMAINS", 1, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_accumulator", "DOT-ANALYSIS-ACCUMULATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_state", "DOT-ANALYSIS-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dot_analysis_found", "_CSETF-DOT-ANALYSIS-FOUND", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dot_analysis_remains", "_CSETF-DOT-ANALYSIS-REMAINS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dot_analysis_accumulator", "_CSETF-DOT-ANALYSIS-ACCUMULATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dot_analysis_state", "_CSETF-DOT-ANALYSIS-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_dot_analysis", "MAKE-DOT-ANALYSIS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_dot_analysis", "VISIT-DEFSTRUCT-DOT-ANALYSIS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_dot_analysis_method", "VISIT-DEFSTRUCT-OBJECT-DOT-ANALYSIS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pprint_dot_analysis", "PPRINT-DOT-ANALYSIS", 3, 0, false );
    SubLFiles.declareFunction( me, "perform_dot_analysis", "PERFORM-DOT-ANALYSIS", 1, 0, false );
    SubLFiles.declareFunction( me, "init_dot_analysis", "INIT-DOT-ANALYSIS", 1, 0, false );
    SubLFiles.declareFunction( me, "find_current_dot_type", "FIND-CURRENT-DOT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_dfa", "DOT-ANALYSIS-DFA", 1, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_default", "DOT-ANALYSIS-DEFAULT", 1, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_dot_string", "DOT-ANALYSIS-DOT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_string", "DOT-ANALYSIS-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_dot_integer", "DOT-ANALYSIS-DOT-INTEGER", 1, 0, false );
    SubLFiles.declareFunction( me, "dot_analysis_integer", "DOT-ANALYSIS-INTEGER", 1, 0, false );
    SubLFiles.declareFunction( me, "clean_dot_accumulator", "CLEAN-DOT-ACCUMULATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "new_interval_token", "NEW-INTERVAL-TOKEN", 0, 3, false );
    SubLFiles.declareFunction( me, "interval_token_p", "INTERVAL-TOKEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_token_start", "INTERVAL-TOKEN-START", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_token_end", "INTERVAL-TOKEN-END", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_token_length", "INTERVAL-TOKEN-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_token_value", "INTERVAL-TOKEN-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_token_value_set", "INTERVAL-TOKEN-VALUE-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "string_token_p", "STRING-TOKEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_string_token", "NEW-STRING-TOKEN", 0, 2, false );
    SubLFiles.declareFunction( me, "string_token_string", "STRING-TOKEN-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "string_token_value", "STRING-TOKEN-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_string_token", "COPY-STRING-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "string_token_string_set", "STRING-TOKEN-STRING-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "string_token_value_set", "STRING-TOKEN-VALUE-SET", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_standard_tokenization_file()
  {
    $standard_punctuation_chars$ = SubLFiles.deflexical( "*STANDARD-PUNCTUATION-CHARS*", $list1 );
    $standard_word_final_punctuation_chars$ = SubLFiles.deflexical( "*STANDARD-WORD-FINAL-PUNCTUATION-CHARS*", $list2 );
    $standard_white_space_chars$ = SubLFiles.deflexical( "*STANDARD-WHITE-SPACE-CHARS*", string_utilities.whitespace_chars() );
    $dtp_dot_analysis$ = SubLFiles.defconstant( "*DTP-DOT-ANALYSIS*", $sym9$DOT_ANALYSIS );
    return NIL;
  }

  public static SubLObject setup_standard_tokenization_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_dot_analysis$.getGlobalValue(), Symbols.symbol_function( $sym16$DOT_ANALYSIS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list17 );
    Structures.def_csetf( $sym18$DOT_ANALYSIS_FOUND, $sym19$_CSETF_DOT_ANALYSIS_FOUND );
    Structures.def_csetf( $sym20$DOT_ANALYSIS_REMAINS, $sym21$_CSETF_DOT_ANALYSIS_REMAINS );
    Structures.def_csetf( $sym22$DOT_ANALYSIS_ACCUMULATOR, $sym23$_CSETF_DOT_ANALYSIS_ACCUMULATOR );
    Structures.def_csetf( $sym24$DOT_ANALYSIS_STATE, $sym25$_CSETF_DOT_ANALYSIS_STATE );
    Equality.identity( $sym9$DOT_ANALYSIS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_dot_analysis$.getGlobalValue(), Symbols.symbol_function( $sym35$VISIT_DEFSTRUCT_OBJECT_DOT_ANALYSIS_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_standard_tokenization_file();
  }

  @Override
  public void initializeVariables()
  {
    init_standard_tokenization_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_standard_tokenization_file();
  }
  static
  {
    me = new standard_tokenization();
    $standard_punctuation_chars$ = null;
    $standard_word_final_punctuation_chars$ = null;
    $standard_white_space_chars$ = null;
    $dtp_dot_analysis$ = null;
    $sym0$STRINGP = makeSymbol( "STRINGP" );
    $list1 = ConsesLow.list( new SubLObject[] { Characters.CHAR_semicolon, Characters.CHAR_comma, Characters.CHAR_colon, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_exclamation,
      Characters.CHAR_question, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_percent, Characters.CHAR_dollar, Characters.CHAR_hyphen, Characters.CHAR_caret, Characters.CHAR_asterisk
    } );
    $list2 = ConsesLow.list( Characters.CHAR_period );
    $kw3$GOBBLE_WS = makeKeyword( "GOBBLE-WS" );
    $kw4$WHITE_SPACE = makeKeyword( "WHITE-SPACE" );
    $kw5$IN_WORD = makeKeyword( "IN-WORD" );
    $kw6$WORD_FINAL_PUNCTUATION = makeKeyword( "WORD-FINAL-PUNCTUATION" );
    $kw7$PUNCTUATION = makeKeyword( "PUNCTUATION" );
    $kw8$GENERIC = makeKeyword( "GENERIC" );
    $sym9$DOT_ANALYSIS = makeSymbol( "DOT-ANALYSIS" );
    $sym10$DOT_ANALYSIS_P = makeSymbol( "DOT-ANALYSIS-P" );
    $list11 = ConsesLow.list( makeSymbol( "FOUND" ), makeSymbol( "REMAINS" ), makeSymbol( "ACCUMULATOR" ), makeSymbol( "STATE" ) );
    $list12 = ConsesLow.list( makeKeyword( "FOUND" ), makeKeyword( "REMAINS" ), makeKeyword( "ACCUMULATOR" ), makeKeyword( "STATE" ) );
    $list13 = ConsesLow.list( makeSymbol( "DOT-ANALYSIS-FOUND" ), makeSymbol( "DOT-ANALYSIS-REMAINS" ), makeSymbol( "DOT-ANALYSIS-ACCUMULATOR" ), makeSymbol( "DOT-ANALYSIS-STATE" ) );
    $list14 = ConsesLow.list( makeSymbol( "_CSETF-DOT-ANALYSIS-FOUND" ), makeSymbol( "_CSETF-DOT-ANALYSIS-REMAINS" ), makeSymbol( "_CSETF-DOT-ANALYSIS-ACCUMULATOR" ), makeSymbol( "_CSETF-DOT-ANALYSIS-STATE" ) );
    $sym15$PPRINT_DOT_ANALYSIS = makeSymbol( "PPRINT-DOT-ANALYSIS" );
    $sym16$DOT_ANALYSIS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "DOT-ANALYSIS-PRINT-FUNCTION-TRAMPOLINE" );
    $list17 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "DOT-ANALYSIS-P" ) );
    $sym18$DOT_ANALYSIS_FOUND = makeSymbol( "DOT-ANALYSIS-FOUND" );
    $sym19$_CSETF_DOT_ANALYSIS_FOUND = makeSymbol( "_CSETF-DOT-ANALYSIS-FOUND" );
    $sym20$DOT_ANALYSIS_REMAINS = makeSymbol( "DOT-ANALYSIS-REMAINS" );
    $sym21$_CSETF_DOT_ANALYSIS_REMAINS = makeSymbol( "_CSETF-DOT-ANALYSIS-REMAINS" );
    $sym22$DOT_ANALYSIS_ACCUMULATOR = makeSymbol( "DOT-ANALYSIS-ACCUMULATOR" );
    $sym23$_CSETF_DOT_ANALYSIS_ACCUMULATOR = makeSymbol( "_CSETF-DOT-ANALYSIS-ACCUMULATOR" );
    $sym24$DOT_ANALYSIS_STATE = makeSymbol( "DOT-ANALYSIS-STATE" );
    $sym25$_CSETF_DOT_ANALYSIS_STATE = makeSymbol( "_CSETF-DOT-ANALYSIS-STATE" );
    $kw26$FOUND = makeKeyword( "FOUND" );
    $kw27$REMAINS = makeKeyword( "REMAINS" );
    $kw28$ACCUMULATOR = makeKeyword( "ACCUMULATOR" );
    $kw29$STATE = makeKeyword( "STATE" );
    $str30$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw31$BEGIN = makeKeyword( "BEGIN" );
    $sym32$MAKE_DOT_ANALYSIS = makeSymbol( "MAKE-DOT-ANALYSIS" );
    $kw33$SLOT = makeKeyword( "SLOT" );
    $kw34$END = makeKeyword( "END" );
    $sym35$VISIT_DEFSTRUCT_OBJECT_DOT_ANALYSIS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-DOT-ANALYSIS-METHOD" );
    $str36$__AP_Found_________S__ = makeString( "#<AP:Found        ~S~%" );
    $str37$_____Remains_______S__ = makeString( "     Remains      ~S~%" );
    $str38$_____Accumulator___S__ = makeString( "     Accumulator  ~S~%" );
    $str39$_____State_________S___ = makeString( "     State        ~S>~%" );
    $str40$_ = makeString( "." );
    $kw41$DEFAULT = makeKeyword( "DEFAULT" );
    $kw42$DOT = makeKeyword( "DOT" );
    $kw43$NUM = makeKeyword( "NUM" );
    $kw44$STRING = makeKeyword( "STRING" );
    $kw45$PUNCT = makeKeyword( "PUNCT" );
    $kw46$DOT_STRING_WANTED = makeKeyword( "DOT-STRING-WANTED" );
    $kw47$STRING_WANTED = makeKeyword( "STRING-WANTED" );
    $kw48$DOT_INTEGER_WANTED = makeKeyword( "DOT-INTEGER-WANTED" );
    $kw49$INTEGER_WANTED = makeKeyword( "INTEGER-WANTED" );
    $sym50$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym51$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str52$_a_is_not_greater_than_or_equal_t = makeString( "~a is not greater than or equal to ~a" );
    $sym53$INTERVAL_TOKEN_P = makeSymbol( "INTERVAL-TOKEN-P" );
  }

  public static final class $dot_analysis_native
      extends
        SubLStructNative
  {
    public SubLObject $found;
    public SubLObject $remains;
    public SubLObject $accumulator;
    public SubLObject $state;
    private static final SubLStructDeclNative structDecl;

    public $dot_analysis_native()
    {
      this.$found = CommonSymbols.NIL;
      this.$remains = CommonSymbols.NIL;
      this.$accumulator = CommonSymbols.NIL;
      this.$state = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $dot_analysis_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$found;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$remains;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$accumulator;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$state;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$found = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$remains = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$accumulator = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$state = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $dot_analysis_native.class, $sym9$DOT_ANALYSIS, $sym10$DOT_ANALYSIS_P, $list11, $list12, new String[] { "$found", "$remains", "$accumulator", "$state"
      }, $list13, $list14, $sym15$PPRINT_DOT_ANALYSIS );
    }
  }

  public static final class $dot_analysis_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $dot_analysis_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DOT-ANALYSIS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return dot_analysis_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 200 ms
 * 
 */