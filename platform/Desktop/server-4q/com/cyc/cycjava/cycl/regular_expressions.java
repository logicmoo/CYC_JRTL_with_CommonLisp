package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Regex;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class regular_expressions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.regular_expressions";
  public static final String myFingerPrint = "a575562705ede9747c5314ed2ac23c36385cc8de6f68224abf23ad6a44dd03aa";
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 1536L)
  private static SubLSymbol $regex_compopt_anchored$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 4880L)
  private static SubLSymbol $regex_compopt_caseless$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 4940L)
  private static SubLSymbol $regex_compopt_dollar_endonly$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5000L)
  private static SubLSymbol $regex_compopt_dotall$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5060L)
  private static SubLSymbol $regex_compopt_extended$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5120L)
  private static SubLSymbol $regex_compopt_multiline$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5180L)
  private static SubLSymbol $regex_compopt_extra$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5240L)
  private static SubLSymbol $regex_compopt_ungreedy$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5300L)
  private static SubLSymbol $regex_compopt_utf8$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5360L)
  private static SubLSymbol $regex_compopt_no_auto_capture$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5420L)
  private static SubLSymbol $regex_compopt_no_utf8_check$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 5480L)
  private static SubLSymbol $regex_compopt_to_values_map$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 6776L)
  private static SubLSymbol $regex_matchopt_anchored$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 8657L)
  private static SubLSymbol $regex_matchopt_notbol$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 8712L)
  private static SubLSymbol $regex_matchopt_noteol$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 8767L)
  private static SubLSymbol $regex_matchopt_notempty$;
  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 8822L)
  private static SubLSymbol $regex_matchopt_to_values_map$;
  private static final SubLInteger $int0$32;
  private static final SubLInteger $int1$64;
  private static final SubLInteger $int2$512;
  private static final SubLInteger $int3$2048;
  private static final SubLInteger $int4$4096;
  private static final SubLInteger $int5$8192;
  private static final SubLSymbol $kw6$ANCHORED;
  private static final SubLSymbol $kw7$CASELESS;
  private static final SubLSymbol $kw8$DOLLAR_ENDONLY;
  private static final SubLSymbol $kw9$DOTALL;
  private static final SubLSymbol $kw10$EXTENDED;
  private static final SubLSymbol $kw11$MULTILINE;
  private static final SubLSymbol $kw12$UNGREEDY;
  private static final SubLSymbol $kw13$EXTRA;
  private static final SubLSymbol $kw14$UTF8;
  private static final SubLSymbol $kw15$NO_AUTO_CAPTURE;
  private static final SubLSymbol $kw16$NO_UTF8_CHECK;
  private static final SubLSymbol $sym17$FIRST;
  private static final SubLSymbol $sym18$KEYWORDP;
  private static final SubLString $str19$Invalid_compile_option__S__only_o;
  private static final SubLSymbol $sym20$LISTP;
  private static final SubLInteger $int21$128;
  private static final SubLInteger $int22$256;
  private static final SubLInteger $int23$1024;
  private static final SubLSymbol $kw24$NOT_BOL;
  private static final SubLSymbol $kw25$NOT_EOL;
  private static final SubLSymbol $kw26$NOT_EMPTY;
  private static final SubLString $str27$Invalid_match_option__S__only_one;
  private static final SubLSymbol $sym28$REGEX_P;
  private static final SubLString $str29$_a_at_offset__a_while_compiling_r;
  private static final SubLSymbol $sym30$REGEX_PATTERN_P;
  private static final SubLSymbol $sym31$STRINGP;
  private static final SubLSymbol $sym32$FIXNUMP;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw37$COMPILE_OPTIONS;
  private static final SubLSymbol $sym38$ERROR_CODE;
  private static final SubLSymbol $sym39$ERROR_OFFSET;
  private static final SubLSymbol $sym40$ERROR_MSG;
  private static final SubLSymbol $sym41$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym42$COMPILE_REGULAR_EXPRESSION;
  private static final SubLSymbol $sym43$CUNWIND_PROTECT;
  private static final SubLSymbol $sym44$PROGN;
  private static final SubLSymbol $sym45$PUNLESS;
  private static final SubLSymbol $sym46$ERROR;
  private static final SubLString $str47$Error__A___A__compiling_regular_e;
  private static final SubLSymbol $sym48$PWHEN;
  private static final SubLSymbol $sym49$DISCARD_REGULAR_EXPRESSION_PATTERN;

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 6051L)
  public static SubLObject enumerate_regex_compile_options()
  {
    return Mapping.mapcar( $sym17$FIRST, $regex_compopt_to_values_map$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 6160L)
  public static SubLObject map_regex_compile_option_to_value(final SubLObject option)
  {
    assert NIL != Types.keywordp( option ) : option;
    final SubLObject value = conses_high.second( conses_high.assoc( option, $regex_compopt_to_values_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
    if( !value.isFixnum() )
    {
      Errors.error( $str19$Invalid_compile_option__S__only_o, option, enumerate_regex_compile_options() );
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 6498L)
  public static SubLObject convert_regex_compile_options_to_value(final SubLObject options)
  {
    assert NIL != Types.listp( options ) : options;
    SubLObject result = ZERO_INTEGER;
    SubLObject cdolist_list_var = options;
    SubLObject option = NIL;
    option = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject value = map_regex_compile_option_to_value( option );
      result = Numbers.logior( result, value );
      cdolist_list_var = cdolist_list_var.rest();
      option = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 9058L)
  public static SubLObject enumerate_regex_match_options()
  {
    return Mapping.mapcar( $sym17$FIRST, $regex_matchopt_to_values_map$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 9165L)
  public static SubLObject map_regex_match_option_to_value(final SubLObject option)
  {
    assert NIL != Types.keywordp( option ) : option;
    final SubLObject value = conses_high.second( conses_high.assoc( option, $regex_matchopt_to_values_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
    if( !value.isFixnum() )
    {
      Errors.error( $str27$Invalid_match_option__S__only_one, option, enumerate_regex_match_options() );
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 9498L)
  public static SubLObject convert_regex_match_options_to_value(final SubLObject options)
  {
    assert NIL != Types.listp( options ) : options;
    SubLObject result = ZERO_INTEGER;
    SubLObject cdolist_list_var = options;
    SubLObject option = NIL;
    option = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject value = map_regex_match_option_to_value( option );
      result = Numbers.logior( result, value );
      cdolist_list_var = cdolist_list_var.rest();
      option = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 9772L)
  public static SubLObject regex_p(final SubLObject expression)
  {
    return Types.stringp( expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 9899L)
  public static SubLObject is_regular_expressions_support_availableP()
  {
    return Regex.is_regex_implementation_availableP();
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 10006L)
  public static SubLObject compile_regular_expression(final SubLObject expression, SubLObject options)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != regex_p( expression ) : expression;
    assert NIL != Types.listp( options ) : options;
    final SubLObject option_value = convert_regex_compile_options_to_value( options );
    thread.resetMultipleValues();
    final SubLObject pattern = Regex.compile_regular_expression_impl( expression, option_value );
    final SubLObject error_offset = thread.secondMultipleValue();
    final SubLObject error_msg = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( pattern, ZERO_INTEGER, error_offset, error_msg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 10402L)
  public static SubLObject compile_regular_expression_raise_error(final SubLObject regex, SubLObject options)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject pattern = compile_regular_expression( regex, options );
    final SubLObject v_int = thread.secondMultipleValue();
    final SubLObject error_offset = thread.thirdMultipleValue();
    final SubLObject error_msg = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( NIL == pattern )
    {
      Errors.error( $str29$_a_at_offset__a_while_compiling_r, error_msg, error_offset, regex );
    }
    return pattern;
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 10739L)
  public static SubLObject regex_pattern_p(final SubLObject pattern)
  {
    return Regex.regex_pattern_p_impl( pattern );
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 10821L)
  public static SubLObject regular_expression_p(final SubLObject v_object)
  {
    return Types.stringp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 10894L)
  public static SubLObject match_regular_expression_pattern_offsets(final SubLObject pattern, final SubLObject string, final SubLObject matches, SubLObject options, SubLObject start, SubLObject end)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != regex_pattern_p( pattern ) : pattern;
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.fixnump( matches ) : matches;
    assert NIL != Types.listp( options ) : options;
    assert NIL != Types.fixnump( start ) : start;
    if( NIL == end )
    {
      end = Sequences.length( string );
    }
    assert NIL != Types.fixnump( end ) : end;
    final SubLObject option_value = convert_regex_match_options_to_value( options );
    return Regex.match_regular_expression_pattern_offsets_impl( pattern, string, matches, option_value, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 11514L)
  public static SubLObject match_regular_expression_pattern(final SubLObject pattern, final SubLObject string, final SubLObject matches, SubLObject options, SubLObject start, SubLObject end)
  {
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLObject offsets = match_regular_expression_pattern_offsets( pattern, string, matches, options, start, end );
    SubLObject strings = NIL;
    SubLObject cdolist_list_var = offsets;
    SubLObject offset = NIL;
    offset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = offset;
      SubLObject match_start = NIL;
      SubLObject match_end = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      match_start = current.first();
      current = ( match_end = current.rest() );
      if( match_start.numGE( ZERO_INTEGER ) && match_end.numGE( ZERO_INTEGER ) )
      {
        final SubLObject match = Sequences.subseq( string, match_start, match_end );
        strings = ConsesLow.cons( match, strings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      offset = cdolist_list_var.first();
    }
    return Sequences.nreverse( strings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 12128L)
  public static SubLObject discard_regular_expression_pattern(final SubLObject pattern)
  {
    assert NIL != regex_pattern_p( pattern ) : pattern;
    Regex.discard_regular_expression_pattern_impl( pattern );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/regular-expressions.lisp", position = 12298L)
  public static SubLObject with_regular_expression_pattern(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pattern = NIL;
    SubLObject regular_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    regular_expression = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list34 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list34 );
      if( NIL == conses_high.member( current_$1, $list35, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw36$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
    }
    final SubLObject compile_options_tail = cdestructuring_bind.property_list_member( $kw37$COMPILE_OPTIONS, current );
    final SubLObject compile_options = ( NIL != compile_options_tail ) ? conses_high.cadr( compile_options_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject error_code = $sym38$ERROR_CODE;
    final SubLObject error_offset = $sym39$ERROR_OFFSET;
    final SubLObject error_msg = $sym40$ERROR_MSG;
    return ConsesLow.list( $sym41$CMULTIPLE_VALUE_BIND, ConsesLow.list( pattern, error_code, error_offset, error_msg ), ConsesLow.list( $sym42$COMPILE_REGULAR_EXPRESSION, regular_expression, compile_options ), ConsesLow
        .list( $sym43$CUNWIND_PROTECT, ConsesLow.list( $sym44$PROGN, ConsesLow.list( $sym45$PUNLESS, ConsesLow.list( $sym30$REGEX_PATTERN_P, pattern ), ConsesLow.list( $sym46$ERROR,
            $str47$Error__A___A__compiling_regular_e, error_code, error_msg, regular_expression, error_offset ) ), reader.bq_cons( $sym44$PROGN, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym48$PWHEN, ConsesLow
                .list( $sym30$REGEX_PATTERN_P, pattern ), ConsesLow.list( $sym49$DISCARD_REGULAR_EXPRESSION_PATTERN, pattern ) ) ) );
  }

  public static SubLObject declare_regular_expressions_file()
  {
    SubLFiles.declareFunction( me, "enumerate_regex_compile_options", "ENUMERATE-REGEX-COMPILE-OPTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "map_regex_compile_option_to_value", "MAP-REGEX-COMPILE-OPTION-TO-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_regex_compile_options_to_value", "CONVERT-REGEX-COMPILE-OPTIONS-TO-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerate_regex_match_options", "ENUMERATE-REGEX-MATCH-OPTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "map_regex_match_option_to_value", "MAP-REGEX-MATCH-OPTION-TO-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_regex_match_options_to_value", "CONVERT-REGEX-MATCH-OPTIONS-TO-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "regex_p", "REGEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "is_regular_expressions_support_availableP", "IS-REGULAR-EXPRESSIONS-SUPPORT-AVAILABLE?", 0, 0, false );
    SubLFiles.declareFunction( me, "compile_regular_expression", "COMPILE-REGULAR-EXPRESSION", 1, 1, false );
    SubLFiles.declareFunction( me, "compile_regular_expression_raise_error", "COMPILE-REGULAR-EXPRESSION-RAISE-ERROR", 1, 1, false );
    SubLFiles.declareFunction( me, "regex_pattern_p", "REGEX-PATTERN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "regular_expression_p", "REGULAR-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "match_regular_expression_pattern_offsets", "MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS", 3, 3, false );
    SubLFiles.declareFunction( me, "match_regular_expression_pattern", "MATCH-REGULAR-EXPRESSION-PATTERN", 3, 3, false );
    SubLFiles.declareFunction( me, "discard_regular_expression_pattern", "DISCARD-REGULAR-EXPRESSION-PATTERN", 1, 0, false );
    SubLFiles.declareMacro( me, "with_regular_expression_pattern", "WITH-REGULAR-EXPRESSION-PATTERN" );
    return NIL;
  }

  public static SubLObject init_regular_expressions_file()
  {
    $regex_compopt_anchored$ = SubLFiles.deflexical( "*REGEX-COMPOPT-ANCHORED*", SIXTEEN_INTEGER );
    $regex_compopt_caseless$ = SubLFiles.deflexical( "*REGEX-COMPOPT-CASELESS*", ONE_INTEGER );
    $regex_compopt_dollar_endonly$ = SubLFiles.deflexical( "*REGEX-COMPOPT-DOLLAR-ENDONLY*", $int0$32 );
    $regex_compopt_dotall$ = SubLFiles.deflexical( "*REGEX-COMPOPT-DOTALL*", FOUR_INTEGER );
    $regex_compopt_extended$ = SubLFiles.deflexical( "*REGEX-COMPOPT-EXTENDED*", EIGHT_INTEGER );
    $regex_compopt_multiline$ = SubLFiles.deflexical( "*REGEX-COMPOPT-MULTILINE*", TWO_INTEGER );
    $regex_compopt_extra$ = SubLFiles.deflexical( "*REGEX-COMPOPT-EXTRA*", $int1$64 );
    $regex_compopt_ungreedy$ = SubLFiles.deflexical( "*REGEX-COMPOPT-UNGREEDY*", $int2$512 );
    $regex_compopt_utf8$ = SubLFiles.deflexical( "*REGEX-COMPOPT-UTF8*", $int3$2048 );
    $regex_compopt_no_auto_capture$ = SubLFiles.deflexical( "*REGEX-COMPOPT-NO-AUTO-CAPTURE*", $int4$4096 );
    $regex_compopt_no_utf8_check$ = SubLFiles.deflexical( "*REGEX-COMPOPT-NO-UTF8-CHECK*", $int5$8192 );
    $regex_compopt_to_values_map$ = SubLFiles.deflexical( "*REGEX-COMPOPT-TO-VALUES-MAP*", ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw6$ANCHORED, $regex_compopt_anchored$.getGlobalValue() ), ConsesLow.list(
        $kw7$CASELESS, $regex_compopt_caseless$.getGlobalValue() ), ConsesLow.list( $kw8$DOLLAR_ENDONLY, $regex_compopt_dollar_endonly$.getGlobalValue() ), ConsesLow.list( $kw9$DOTALL, $regex_compopt_dotall$
            .getGlobalValue() ), ConsesLow.list( $kw10$EXTENDED, $regex_compopt_extended$.getGlobalValue() ), ConsesLow.list( $kw11$MULTILINE, $regex_compopt_multiline$.getGlobalValue() ), ConsesLow.list( $kw12$UNGREEDY,
                $regex_compopt_ungreedy$.getGlobalValue() ), ConsesLow.list( $kw13$EXTRA, $regex_compopt_extra$.getGlobalValue() ), ConsesLow.list( $kw14$UTF8, $regex_compopt_utf8$.getGlobalValue() ), ConsesLow.list(
                    $kw15$NO_AUTO_CAPTURE, $regex_compopt_no_auto_capture$.getGlobalValue() ), ConsesLow.list( $kw16$NO_UTF8_CHECK, $regex_compopt_no_utf8_check$.getGlobalValue() )
    } ) );
    $regex_matchopt_anchored$ = SubLFiles.deflexical( "*REGEX-MATCHOPT-ANCHORED*", SIXTEEN_INTEGER );
    $regex_matchopt_notbol$ = SubLFiles.deflexical( "*REGEX-MATCHOPT-NOTBOL*", $int21$128 );
    $regex_matchopt_noteol$ = SubLFiles.deflexical( "*REGEX-MATCHOPT-NOTEOL*", $int22$256 );
    $regex_matchopt_notempty$ = SubLFiles.deflexical( "*REGEX-MATCHOPT-NOTEMPTY*", $int23$1024 );
    $regex_matchopt_to_values_map$ = SubLFiles.deflexical( "*REGEX-MATCHOPT-TO-VALUES-MAP*", ConsesLow.list( ConsesLow.list( $kw6$ANCHORED, $regex_matchopt_anchored$.getGlobalValue() ), ConsesLow.list( $kw24$NOT_BOL,
        $regex_matchopt_notbol$.getGlobalValue() ), ConsesLow.list( $kw25$NOT_EOL, $regex_matchopt_noteol$.getGlobalValue() ), ConsesLow.list( $kw26$NOT_EMPTY, $regex_matchopt_notempty$.getGlobalValue() ) ) );
    return NIL;
  }

  public static SubLObject setup_regular_expressions_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_regular_expressions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_regular_expressions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_regular_expressions_file();
  }
  static
  {
    me = new regular_expressions();
    $regex_compopt_anchored$ = null;
    $regex_compopt_caseless$ = null;
    $regex_compopt_dollar_endonly$ = null;
    $regex_compopt_dotall$ = null;
    $regex_compopt_extended$ = null;
    $regex_compopt_multiline$ = null;
    $regex_compopt_extra$ = null;
    $regex_compopt_ungreedy$ = null;
    $regex_compopt_utf8$ = null;
    $regex_compopt_no_auto_capture$ = null;
    $regex_compopt_no_utf8_check$ = null;
    $regex_compopt_to_values_map$ = null;
    $regex_matchopt_anchored$ = null;
    $regex_matchopt_notbol$ = null;
    $regex_matchopt_noteol$ = null;
    $regex_matchopt_notempty$ = null;
    $regex_matchopt_to_values_map$ = null;
    $int0$32 = makeInteger( 32 );
    $int1$64 = makeInteger( 64 );
    $int2$512 = makeInteger( 512 );
    $int3$2048 = makeInteger( 2048 );
    $int4$4096 = makeInteger( 4096 );
    $int5$8192 = makeInteger( 8192 );
    $kw6$ANCHORED = makeKeyword( "ANCHORED" );
    $kw7$CASELESS = makeKeyword( "CASELESS" );
    $kw8$DOLLAR_ENDONLY = makeKeyword( "DOLLAR-ENDONLY" );
    $kw9$DOTALL = makeKeyword( "DOTALL" );
    $kw10$EXTENDED = makeKeyword( "EXTENDED" );
    $kw11$MULTILINE = makeKeyword( "MULTILINE" );
    $kw12$UNGREEDY = makeKeyword( "UNGREEDY" );
    $kw13$EXTRA = makeKeyword( "EXTRA" );
    $kw14$UTF8 = makeKeyword( "UTF8" );
    $kw15$NO_AUTO_CAPTURE = makeKeyword( "NO-AUTO-CAPTURE" );
    $kw16$NO_UTF8_CHECK = makeKeyword( "NO-UTF8-CHECK" );
    $sym17$FIRST = makeSymbol( "FIRST" );
    $sym18$KEYWORDP = makeSymbol( "KEYWORDP" );
    $str19$Invalid_compile_option__S__only_o = makeString( "Invalid compile option ~S: only one of ~S permitted.~%" );
    $sym20$LISTP = makeSymbol( "LISTP" );
    $int21$128 = makeInteger( 128 );
    $int22$256 = makeInteger( 256 );
    $int23$1024 = makeInteger( 1024 );
    $kw24$NOT_BOL = makeKeyword( "NOT-BOL" );
    $kw25$NOT_EOL = makeKeyword( "NOT-EOL" );
    $kw26$NOT_EMPTY = makeKeyword( "NOT-EMPTY" );
    $str27$Invalid_match_option__S__only_one = makeString( "Invalid match option ~S: only one of ~S permitted.~%" );
    $sym28$REGEX_P = makeSymbol( "REGEX-P" );
    $str29$_a_at_offset__a_while_compiling_r = makeString( "~a at offset ~a while compiling regex /~a/" );
    $sym30$REGEX_PATTERN_P = makeSymbol( "REGEX-PATTERN-P" );
    $sym31$STRINGP = makeSymbol( "STRINGP" );
    $sym32$FIXNUMP = makeSymbol( "FIXNUMP" );
    $list33 = ConsesLow.cons( makeSymbol( "MATCH-START" ), makeSymbol( "MATCH-END" ) );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "PATTERN" ), makeSymbol( "REGULAR-EXPRESSION" ), makeSymbol( "&KEY" ), makeSymbol( "COMPILE-OPTIONS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list35 = ConsesLow.list( makeKeyword( "COMPILE-OPTIONS" ) );
    $kw36$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw37$COMPILE_OPTIONS = makeKeyword( "COMPILE-OPTIONS" );
    $sym38$ERROR_CODE = makeUninternedSymbol( "ERROR-CODE" );
    $sym39$ERROR_OFFSET = makeUninternedSymbol( "ERROR-OFFSET" );
    $sym40$ERROR_MSG = makeUninternedSymbol( "ERROR-MSG" );
    $sym41$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym42$COMPILE_REGULAR_EXPRESSION = makeSymbol( "COMPILE-REGULAR-EXPRESSION" );
    $sym43$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym44$PROGN = makeSymbol( "PROGN" );
    $sym45$PUNLESS = makeSymbol( "PUNLESS" );
    $sym46$ERROR = makeSymbol( "ERROR" );
    $str47$Error__A___A__compiling_regular_e = makeString( "Error ~A (~A) compiling regular expression ~S at offset ~A." );
    $sym48$PWHEN = makeSymbol( "PWHEN" );
    $sym49$DISCARD_REGULAR_EXPRESSION_PATTERN = makeSymbol( "DISCARD-REGULAR-EXPRESSION-PATTERN" );
  }
}
/*
 * 
 * Total time: 126 ms
 * 
 */