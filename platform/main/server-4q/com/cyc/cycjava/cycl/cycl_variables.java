package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cycl_variables
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cycl_variables";
  public static final String myFingerPrint = "6e9e6638714627aa795908aeb0682869b5dc53e01e74b5c30a9c9cd56c8f9349";
  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 813L)
  private static SubLSymbol $el_variable_prefix_char$;
  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1019L)
  private static SubLSymbol $el_variable_prefix_string$;
  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1143L)
  private static SubLSymbol $el_variable_hyphen_char$;
  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1269L)
  private static SubLSymbol $el_variable_invalid_hyphen_sequence$;
  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1463L)
  public static SubLSymbol $valid_el_var_regular_expression$;
  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 9304L)
  private static SubLSymbol $keyword_variable_prefix_char$;
  private static final SubLString $str0$_;
  private static final SubLString $str1$______________A_Z____A_Z___0_9___;
  private static final SubLSymbol $sym2$EL_VAR_;
  private static final SubLList $list3;
  private static final SubLString $str4$Return_T_iff_OBJECT_is_a_symbol_w;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$SYMBOLP;
  private static final SubLSymbol $sym7$INVALID_VARIABLE_NAME_CHAR;
  private static final SubLSymbol $sym8$STRING_;
  private static final SubLInteger $int9$200;
  private static final SubLString $str10$_C_A;
  private static final SubLSymbol $sym11$VARIABLE_SYMBOL_;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$HL_VAR_;
  private static final SubLSymbol $sym14$TL_VAR_;
  private static final SubLSymbol $sym15$KEYWORD_VAR_;
  private static final SubLSymbol $sym16$GENERIC_ARG_VAR_;
  private static final SubLSymbol $sym17$FALSE;
  private static final SubLSymbol $sym18$VALID_EL_VAR_NAME_;
  private static final SubLSymbol $kw19$TEST;
  private static final SubLSymbol $kw20$OWNER;
  private static final SubLSymbol $kw21$CLASSES;
  private static final SubLSymbol $kw22$KB;
  private static final SubLSymbol $kw23$TINY;
  private static final SubLSymbol $kw24$WORKING_;
  private static final SubLList $list25;

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1657L)
  public static SubLObject el_variable_prefix_char()
  {
    return $el_variable_prefix_char$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 1827L)
  public static SubLObject el_variable_prefix_string()
  {
    return $el_variable_prefix_string$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 2001L)
  public static SubLObject el_variable_hyphen_char()
  {
    return $el_variable_hyphen_char$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 2173L)
  public static SubLObject el_variable_prefix_charP(final SubLObject v_object)
  {
    return Characters.charE( v_object, el_variable_prefix_char() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 2385L)
  public static SubLObject has_el_variable_prefixP(final SubLObject string)
  {
    return el_variable_prefix_charP( Strings.sublisp_char( string, ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 2574L)
  public static SubLObject has_dont_care_var_prefixP(final SubLObject string)
  {
    return makeBoolean( NIL != el_variable_prefix_charP( Strings.sublisp_char( string, ZERO_INTEGER ) ) && NIL != el_variable_prefix_charP( Strings.sublisp_char( string, ONE_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 2822L)
  public static SubLObject el_variable_hyphen_charP(final SubLObject v_object)
  {
    return Characters.charE( v_object, el_variable_hyphen_char() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 3035L)
  public static SubLObject el_variable_charP(final SubLObject v_char)
  {
    return makeBoolean( NIL != string_utilities.upper_case_alphanumeric_p( v_char ) || NIL != el_variable_hyphen_charP( v_char ) || NIL != el_variable_prefix_charP( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 3198L)
  public static SubLObject el_varP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() && NIL != v_object && !v_object.isKeyword() && NIL != el_var_nameP( el_var_name( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 3470L)
  public static SubLObject dont_care_varP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_varP( v_object ) && NIL != el_var_nameP( Sequences.subseq( el_var_name( v_object ), ONE_INTEGER, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 3695L)
  public static SubLObject el_var_name(final SubLObject el_var)
  {
    assert NIL != Types.symbolp( el_var ) : el_var;
    return Symbols.symbol_name( el_var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 3865L)
  public static SubLObject el_var_nameP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL != list_utilities.lengthG( v_object, ONE_INTEGER, UNPROVIDED ) && NIL != has_el_variable_prefixP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 4000L)
  public static SubLObject make_el_var(final SubLObject v_object)
  {
    final SubLObject el_var = intern_el_var( v_object );
    return el_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 4098L)
  public static SubLObject make_el_var_name(final SubLObject v_object)
  {
    if( NIL != el_var_nameP( v_object ) )
    {
      return Strings.string_upcase( v_object, UNPROVIDED, UNPROVIDED );
    }
    return Strings.string_upcase( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( el_variable_prefix_string() ), format_nil.format_nil_a_no_copy( v_object ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 4344L)
  public static SubLObject possibly_make_valid_el_var_name(final SubLObject v_object)
  {
    if( NIL != valid_el_var_nameP( v_object ) )
    {
      return v_object;
    }
    final SubLObject validated_name = el_utilities.correct_variable( v_object );
    if( NIL != validated_name )
    {
      return validated_name;
    }
    return make_el_var_name( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 4743L)
  public static SubLObject possibly_make_valid_el_var(final SubLObject v_object)
  {
    return Packages.intern( possibly_make_valid_el_var_name( v_object ), control_vars.$cyc_package$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 5003L)
  public static SubLObject invalid_variable_name_char(final SubLObject v_object)
  {
    return makeBoolean( NIL == string_utilities.upper_case_alphanumeric_p( v_object ) && NIL == el_variable_hyphen_charP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 5290L)
  public static SubLObject valid_el_varP(final SubLObject v_object)
  {
    if( v_object.isSymbol() && !v_object.isKeyword() )
    {
      return valid_el_var_nameP( el_var_name( v_object ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 5584L)
  public static SubLObject valid_el_var_nameP(final SubLObject v_object)
  {
    if( !v_object.isString() || NIL != string_utilities.empty_string_p( v_object ) || NIL == has_el_variable_prefixP( v_object ) )
    {
      return NIL;
    }
    final SubLObject length = Sequences.length( v_object );
    SubLObject last = Numbers.subtract( length, ONE_INTEGER );
    SubLObject subseq_check_start = ONE_INTEGER;
    if( !length.numG( ONE_INTEGER ) )
    {
      return NIL;
    }
    if( NIL != has_dont_care_var_prefixP( v_object ) )
    {
      if( !length.numG( TWO_INTEGER ) )
      {
        return NIL;
      }
      subseq_check_start = TWO_INTEGER;
    }
    if( last.numLE( subseq_check_start ) )
    {
      last = Numbers.add( subseq_check_start, ONE_INTEGER );
    }
    if( NIL != valid_el_variable_name_subsequenceP( Sequences.subseq( v_object, subseq_check_start, last ) ) )
    {
      return string_utilities.upper_case_alphanumeric_p( Strings.sublisp_char( v_object, Numbers.subtract( length, ONE_INTEGER ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 6385L)
  public static SubLObject valid_el_variable_name_subsequenceP(final SubLObject v_object)
  {
    if( NIL != list_utilities.lengthG( v_object, ZERO_INTEGER, UNPROVIDED ) )
    {
      return makeBoolean( NIL != Characters.upper_case_p( Strings.sublisp_char( v_object, ZERO_INTEGER ) ) && NIL == Sequences.find_if( $sym7$INVALID_VARIABLE_NAME_CHAR, Sequences.subseq( v_object, ONE_INTEGER,
          UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Sequences.search( invalid_hyphen_sequence(), v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 6653L)
  public static SubLObject invalid_hyphen_sequence()
  {
    return $el_variable_invalid_hyphen_sequence$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 6744L)
  public static SubLObject gensym_el_var(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject el_var = NIL;
    final SubLObject _prev_bind_0 = Packages.$package$.currentBinding( thread );
    try
    {
      Packages.$package$.bind( control_vars.$cyc_package$.getGlobalValue(), thread );
      el_var = Symbols.gensym( make_el_var_name( v_object ) );
    }
    finally
    {
      Packages.$package$.rebind( _prev_bind_0, thread );
    }
    return el_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 6956L)
  public static SubLObject gentemp_el_var(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject el_var = NIL;
    final SubLObject _prev_bind_0 = Packages.$package$.currentBinding( thread );
    try
    {
      Packages.$package$.bind( control_vars.$cyc_package$.getGlobalValue(), thread );
      el_var = Symbols.gentemp( make_el_var_name( v_object ) );
    }
    finally
    {
      Packages.$package$.rebind( _prev_bind_0, thread );
    }
    return el_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 7213L)
  public static SubLObject intern_el_var(final SubLObject v_object)
  {
    return Packages.intern( make_el_var_name( v_object ), control_vars.$cyc_package$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 7311L)
  public static SubLObject var_names_in_string(final SubLObject string, SubLObject var_char)
  {
    if( var_char == UNPROVIDED )
    {
      var_char = el_variable_prefix_char();
    }
    SubLObject names = NIL;
    SubLObject start = NIL;
    SubLObject varP = NIL;
    SubLObject eligibleP = T;
    final SubLObject length = Sequences.length( string );
    final SubLObject last = Numbers.subtract( length, ONE_INTEGER );
    SubLObject end_var_$1;
    SubLObject end_var;
    SubLObject i;
    SubLObject ch;
    SubLObject item_var;
    for( end_var = ( end_var_$1 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$1 ); i = number_utilities.f_1X( i ) )
    {
      ch = Strings.sublisp_char( string, i );
      if( NIL != eligibleP && NIL != Characters.charE( ch, var_char ) )
      {
        start = i;
        varP = T;
      }
      else if( NIL != varP && ( NIL != string_utilities.punctuation_p( ch ) || NIL != string_utilities.whitespacep( ch ) || i.numE( last ) ) )
      {
        varP = NIL;
        eligibleP = T;
        item_var = Sequences.subseq( string, start, i.numE( last ) ? Numbers.add( ONE_INTEGER, i ) : i );
        if( NIL == conses_high.member( item_var, names, Symbols.symbol_function( $sym8$STRING_ ), Symbols.symbol_function( IDENTITY ) ) )
        {
          names = ConsesLow.cons( item_var, names );
        }
      }
      else if( NIL != string_utilities.punctuation_p( ch ) || NIL != string_utilities.whitespacep( ch ) )
      {
        eligibleP = T;
      }
      else
      {
        eligibleP = NIL;
      }
    }
    return names;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 8163L)
  public static SubLObject el_var_name_without_prefix(final SubLObject el_var)
  {
    return string_without_el_var_name_prefix( el_var_name( el_var ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 8354L)
  public static SubLObject string_without_el_var_name_prefix(final SubLObject string)
  {
    if( !string.isString() )
    {
      return NIL;
    }
    if( NIL != list_utilities.lengthG( string, TWO_INTEGER, UNPROVIDED ) && Vectors.aref( string, ONE_INTEGER ).eql( el_variable_prefix_char() ) )
    {
      return Sequences.subseq( string, TWO_INTEGER, UNPROVIDED );
    }
    return Sequences.subseq( string, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 8710L)
  public static SubLObject default_el_varP(final SubLObject symbol)
  {
    if( NIL != el_varP( symbol ) && Sequences.length( Symbols.symbol_name( symbol ) ).numG( FOUR_INTEGER ) )
    {
      final SubLObject number = reader.read_from_string_ignoring_errors( Symbols.symbol_name( symbol ), NIL, NIL, FOUR_INTEGER, UNPROVIDED );
      return makeBoolean( number.isFixnum() && number.numGE( ZERO_INTEGER ) && number.numLE( $int9$200 ) && symbol.eql( variables.default_el_var_for_hl_var( variables.get_variable( number ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 9188L)
  public static SubLObject non_default_el_varP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_varP( v_object ) && NIL == default_el_varP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 9501L)
  public static SubLObject keyword_variable_prefix_char()
  {
    return $keyword_variable_prefix_char$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 9686L)
  public static SubLObject permissible_keyword_varP(final SubLObject thing)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue( thread ) && thing.isKeyword() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 9895L)
  public static SubLObject impermissible_varP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( ( NIL == wff_vars.$permit_keyword_variablesP$.getDynamicValue( thread ) && v_object.isKeyword() ) || ( NIL == wff_vars.$permit_generic_arg_variablesP$.getDynamicValue( thread )
        && NIL != at_admitted.generic_arg_p( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10096L)
  public static SubLObject keyword_varP(final SubLObject thing)
  {
    return Types.keywordp( thing );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10221L)
  public static SubLObject keyword_var_name(final SubLObject keyword_var)
  {
    assert NIL != Types.symbolp( keyword_var ) : keyword_var;
    return Symbols.symbol_name( keyword_var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10416L)
  public static SubLObject keyword_var_nameP(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && Sequences.length( v_object ).numG( ONE_INTEGER ) && NIL != Characters.charE( Strings.sublisp_char( v_object, ZERO_INTEGER ), keyword_variable_prefix_char() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10581L)
  public static SubLObject make_keyword_var(final SubLObject string)
  {
    return Symbols.make_keyword( Strings.string_upcase( string, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10670L)
  public static SubLObject make_keyword_var_name(final SubLObject v_object)
  {
    if( NIL != keyword_var_nameP( v_object ) )
    {
      return Strings.string_upcase( v_object, UNPROVIDED, UNPROVIDED );
    }
    return Strings.string_upcase( PrintLow.format( NIL, $str10$_C_A, keyword_variable_prefix_char(), v_object ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 10876L)
  public static SubLObject el_variable_or_keyword_p(final SubLObject symbol)
  {
    return makeBoolean( NIL != collection_defns.el_variableP( symbol ) || symbol.isKeyword() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 11089L)
  public static SubLObject variable_name(final SubLObject var)
  {
    if( NIL != variables.variable_p( var ) )
    {
      return variable_name( variables.default_el_var_for_hl_var( var ) );
    }
    if( NIL != el_varP( var ) )
    {
      return el_var_name( var );
    }
    if( NIL != keyword_varP( var ) )
    {
      return keyword_var_name( var );
    }
    return string_utilities.object_to_string( var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 11524L)
  public static SubLObject variable_name_without_prefix(final SubLObject var)
  {
    if( NIL != variables.variable_p( var ) )
    {
      return variable_name_without_prefix( variables.default_el_var_for_hl_var( var ) );
    }
    if( NIL != el_varP( var ) )
    {
      return el_var_name_without_prefix( var );
    }
    return string_without_el_var_name_prefix( string_utilities.object_to_string( var ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 11911L)
  public static SubLObject variable_symbolP(final SubLObject symbol)
  {
    return el_varP( symbol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 12108L)
  public static SubLObject el_var_or_generic_argP(final SubLObject candidate_variable)
  {
    return makeBoolean( NIL != el_varP( candidate_variable ) || NIL != at_admitted.generic_arg_p( candidate_variable ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 12252L)
  public static SubLObject cyc_varP(final SubLObject thing)
  {
    return makeBoolean( NIL != el_varP( thing ) || NIL != kb_varP( thing ) || NIL != canon_tl.tl_varP( thing ) || NIL != permissible_keyword_varP( thing ) || NIL != generic_arg_varP( thing ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 12625L)
  public static SubLObject generic_arg_varP(final SubLObject thing)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue( thread ) && NIL != at_admitted.generic_arg_p( thing ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 12802L)
  public static SubLObject variable_predicate_fn(final SubLObject var)
  {
    if( NIL != hl_varP( var ) )
    {
      return $sym13$HL_VAR_;
    }
    if( NIL != el_varP( var ) )
    {
      return $sym2$EL_VAR_;
    }
    if( NIL != canon_tl.tl_varP( var ) )
    {
      return $sym14$TL_VAR_;
    }
    if( NIL != permissible_keyword_varP( var ) )
    {
      return $sym15$KEYWORD_VAR_;
    }
    if( NIL != generic_arg_varP( var ) )
    {
      return $sym16$GENERIC_ARG_VAR_;
    }
    return $sym17$FALSE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 13148L)
  public static SubLObject kb_varP(final SubLObject symbol)
  {
    return kb_variableP( symbol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 13212L)
  public static SubLObject kb_variableP(final SubLObject symbol)
  {
    return variables.variable_p( symbol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cycl-variables.lisp", position = 13279L)
  public static SubLObject hl_varP(final SubLObject thing)
  {
    return variables.variable_p( thing );
  }

  public static SubLObject declare_cycl_variables_file()
  {
    SubLFiles.declareFunction( me, "el_variable_prefix_char", "EL-VARIABLE-PREFIX-CHAR", 0, 0, false );
    SubLFiles.declareFunction( me, "el_variable_prefix_string", "EL-VARIABLE-PREFIX-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "el_variable_hyphen_char", "EL-VARIABLE-HYPHEN-CHAR", 0, 0, false );
    SubLFiles.declareFunction( me, "el_variable_prefix_charP", "EL-VARIABLE-PREFIX-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "has_el_variable_prefixP", "HAS-EL-VARIABLE-PREFIX?", 1, 0, false );
    SubLFiles.declareFunction( me, "has_dont_care_var_prefixP", "HAS-DONT-CARE-VAR-PREFIX?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_variable_hyphen_charP", "EL-VARIABLE-HYPHEN-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_variable_charP", "EL-VARIABLE-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_varP", "EL-VAR?", 1, 0, false );
    new $el_varP$UnaryFunction();
    SubLFiles.declareFunction( me, "dont_care_varP", "DONT-CARE-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_var_name", "EL-VAR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "el_var_nameP", "EL-VAR-NAME?", 1, 0, false );
    SubLFiles.declareFunction( me, "make_el_var", "MAKE-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_el_var_name", "MAKE-EL-VAR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_make_valid_el_var_name", "POSSIBLY-MAKE-VALID-EL-VAR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_make_valid_el_var", "POSSIBLY-MAKE-VALID-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_variable_name_char", "INVALID-VARIABLE-NAME-CHAR", 1, 0, false );
    new $invalid_variable_name_char$UnaryFunction();
    SubLFiles.declareFunction( me, "valid_el_varP", "VALID-EL-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_el_var_nameP", "VALID-EL-VAR-NAME?", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_el_variable_name_subsequenceP", "VALID-EL-VARIABLE-NAME-SUBSEQUENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_hyphen_sequence", "INVALID-HYPHEN-SEQUENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "gensym_el_var", "GENSYM-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "gentemp_el_var", "GENTEMP-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "intern_el_var", "INTERN-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "var_names_in_string", "VAR-NAMES-IN-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "el_var_name_without_prefix", "EL-VAR-NAME-WITHOUT-PREFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "string_without_el_var_name_prefix", "STRING-WITHOUT-EL-VAR-NAME-PREFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "default_el_varP", "DEFAULT-EL-VAR?", 1, 0, false );
    new $default_el_varP$UnaryFunction();
    SubLFiles.declareFunction( me, "non_default_el_varP", "NON-DEFAULT-EL-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "keyword_variable_prefix_char", "KEYWORD-VARIABLE-PREFIX-CHAR", 0, 0, false );
    SubLFiles.declareFunction( me, "permissible_keyword_varP", "PERMISSIBLE-KEYWORD-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "impermissible_varP", "IMPERMISSIBLE-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "keyword_varP", "KEYWORD-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "keyword_var_name", "KEYWORD-VAR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "keyword_var_nameP", "KEYWORD-VAR-NAME?", 1, 0, false );
    SubLFiles.declareFunction( me, "make_keyword_var", "MAKE-KEYWORD-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_keyword_var_name", "MAKE-KEYWORD-VAR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "el_variable_or_keyword_p", "EL-VARIABLE-OR-KEYWORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_name", "VARIABLE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_name_without_prefix", "VARIABLE-NAME-WITHOUT-PREFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_symbolP", "VARIABLE-SYMBOL?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_var_or_generic_argP", "EL-VAR-OR-GENERIC-ARG?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_varP", "CYC-VAR?", 1, 0, false );
    new $cyc_varP$UnaryFunction();
    SubLFiles.declareFunction( me, "generic_arg_varP", "GENERIC-ARG-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_predicate_fn", "VARIABLE-PREDICATE-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_varP", "KB-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_variableP", "KB-VARIABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_varP", "HL-VAR?", 1, 0, false );
    new $hl_varP$UnaryFunction();
    return NIL;
  }

  public static SubLObject init_cycl_variables_file()
  {
    $el_variable_prefix_char$ = SubLFiles.defconstant( "*EL-VARIABLE-PREFIX-CHAR*", Characters.CHAR_question );
    $el_variable_prefix_string$ = SubLFiles.defconstant( "*EL-VARIABLE-PREFIX-STRING*", $str0$_ );
    $el_variable_hyphen_char$ = SubLFiles.defconstant( "*EL-VARIABLE-HYPHEN-CHAR*", Characters.CHAR_hyphen );
    $el_variable_invalid_hyphen_sequence$ = SubLFiles.defconstant( "*EL-VARIABLE-INVALID-HYPHEN-SEQUENCE*", Strings.make_string( TWO_INTEGER, $el_variable_hyphen_char$.getGlobalValue() ) );
    $valid_el_var_regular_expression$ = SubLFiles.defconstant( "*VALID-EL-VAR-REGULAR-EXPRESSION*", $str1$______________A_Z____A_Z___0_9___ );
    $keyword_variable_prefix_char$ = SubLFiles.defconstant( "*KEYWORD-VARIABLE-PREFIX-CHAR*", Characters.CHAR_colon );
    return NIL;
  }

  public static SubLObject setup_cycl_variables_file()
  {
    utilities_macros.register_cyc_api_function( $sym2$EL_VAR_, $list3, $str4$Return_T_iff_OBJECT_is_a_symbol_w, NIL, $list5 );
    access_macros.define_obsolete_register( $sym11$VARIABLE_SYMBOL_, $list12 );
    generic_testing.define_test_case_table_int( $sym18$VALID_EL_VAR_NAME_, ConsesLow.list( new SubLObject[] { $kw19$TEST, NIL, $kw20$OWNER, NIL, $kw21$CLASSES, NIL, $kw22$KB, $kw23$TINY, $kw24$WORKING_, T
    } ), $list25 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cycl_variables_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cycl_variables_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cycl_variables_file();
  }
  static
  {
    me = new cycl_variables();
    $el_variable_prefix_char$ = null;
    $el_variable_prefix_string$ = null;
    $el_variable_hyphen_char$ = null;
    $el_variable_invalid_hyphen_sequence$ = null;
    $valid_el_var_regular_expression$ = null;
    $keyword_variable_prefix_char$ = null;
    $str0$_ = makeString( "?" );
    $str1$______________A_Z____A_Z___0_9___ = makeString( "([?]|[?][?]) [A-Z] ([A-Z]|[0-9])* ([-] ([A-Z]|[0-9])+)*" );
    $sym2$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $list3 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $str4$Return_T_iff_OBJECT_is_a_symbol_w = makeString( "Return T iff OBJECT is a symbol which can be interpreted as an EL variable." );
    $list5 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym6$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym7$INVALID_VARIABLE_NAME_CHAR = makeSymbol( "INVALID-VARIABLE-NAME-CHAR" );
    $sym8$STRING_ = makeSymbol( "STRING=" );
    $int9$200 = makeInteger( 200 );
    $str10$_C_A = makeString( "~C~A" );
    $sym11$VARIABLE_SYMBOL_ = makeSymbol( "VARIABLE-SYMBOL?" );
    $list12 = ConsesLow.list( makeSymbol( "EL-VAR?" ) );
    $sym13$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $sym14$TL_VAR_ = makeSymbol( "TL-VAR?" );
    $sym15$KEYWORD_VAR_ = makeSymbol( "KEYWORD-VAR?" );
    $sym16$GENERIC_ARG_VAR_ = makeSymbol( "GENERIC-ARG-VAR?" );
    $sym17$FALSE = makeSymbol( "FALSE" );
    $sym18$VALID_EL_VAR_NAME_ = makeSymbol( "VALID-EL-VAR-NAME?" );
    $kw19$TEST = makeKeyword( "TEST" );
    $kw20$OWNER = makeKeyword( "OWNER" );
    $kw21$CLASSES = makeKeyword( "CLASSES" );
    $kw22$KB = makeKeyword( "KB" );
    $kw23$TINY = makeKeyword( "TINY" );
    $kw24$WORKING_ = makeKeyword( "WORKING?" );
    $list25 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "FOO" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "?FOO" ) ), T ), ConsesLow.list( ConsesLow.list( makeString(
        "??FOO" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "???FOO" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "?X" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "?x" ) ), NIL ), ConsesLow
            .list( ConsesLow.list( makeString( "??X" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "??x" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "?1" ) ), NIL ), ConsesLow.list( ConsesLow.list(
                makeString( "" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "?" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "??" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "???" ) ),
                    NIL )
    } );
  }

  public static final class $el_varP$UnaryFunction
      extends
        UnaryFunction
  {
    public $el_varP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EL-VAR?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return el_varP( arg1 );
    }
  }

  public static final class $invalid_variable_name_char$UnaryFunction
      extends
        UnaryFunction
  {
    public $invalid_variable_name_char$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INVALID-VARIABLE-NAME-CHAR" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return invalid_variable_name_char( arg1 );
    }
  }

  public static final class $default_el_varP$UnaryFunction
      extends
        UnaryFunction
  {
    public $default_el_varP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DEFAULT-EL-VAR?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return default_el_varP( arg1 );
    }
  }

  public static final class $cyc_varP$UnaryFunction
      extends
        UnaryFunction
  {
    public $cyc_varP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CYC-VAR?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cyc_varP( arg1 );
    }
  }

  public static final class $hl_varP$UnaryFunction
      extends
        UnaryFunction
  {
    public $hl_varP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "HL-VAR?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return hl_varP( arg1 );
    }
  }
}
/*
 * 
 * Total time: 206 ms
 * 
 */