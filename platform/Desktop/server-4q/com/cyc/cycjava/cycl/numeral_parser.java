//
////
// 
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class numeral_parser
    extends
      SubLTranslatedFile
{
  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 2896L)
  public static SubLObject standardize_number_string(final SubLObject string, SubLObject number_type)
  {
    if( number_type == UNPROVIDED )
    {
      number_type = $kw13$AMERICAN;
    }
    return string_utilities.remove_substring( string, $str14$_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 3794L)
  public static SubLObject initialize_number_values()
  {
    final SubLObject number_values = Hashtables.make_hash_table( $int15$100, Symbols.symbol_function( EQUALP ), UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject tables = cdolist_list_var = ConsesLow.list( new SubLObject[] { $null$.getGlobalValue(), $a$.getGlobalValue(), $digits$.getGlobalValue(), $teens$.getGlobalValue(), $fuzzies$.getGlobalValue(),
      $atomic_tens$.getGlobalValue(), $onedozen$.getGlobalValue(), $onehundred$.getGlobalValue(), $onethousand$.getGlobalValue(), $onemillion$.getGlobalValue(), $onebillion$.getGlobalValue(), $onetrillion$
          .getGlobalValue(), $irregular_denominators$.getGlobalValue()
    } );
    SubLObject table = NIL;
    table = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = table;
      SubLObject entry = NIL;
      entry = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        Hashtables.sethash( entry.first(), number_values, entry.rest() );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        entry = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      table = cdolist_list_var.first();
    }
    return number_values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 4596L)
  public static SubLObject number_value(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != string_utilities.empty_string_p( string ) )
    {
      return NIL;
    }
    final SubLObject v_object = reader.read_from_string_ignoring_errors( string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( v_object.isNumber() )
    {
      return v_object;
    }
    final SubLObject lookup_string = ( NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue( thread ) ) ? string : Strings.string_downcase( string, UNPROVIDED, UNPROVIDED );
    return Hashtables.gethash( lookup_string, $number_values$.getDynamicValue( thread ), Hashtables.gethash( string_utilities.strip_trailer( lookup_string, $str16$s ), $number_values$.getDynamicValue( thread ),
        Hashtables.gethash( string_utilities.strip_trailer( lookup_string, $str17$th ), $number_values$.getDynamicValue( thread ), Hashtables.gethash( string_utilities.strip_trailer( lookup_string, $str18$ths ),
            $number_values$.getDynamicValue( thread ), UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 5233L)
  public static SubLObject number_string_signP(final SubLObject word)
  {
    return number_utilities.number_string_p( document.sign_string( word ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 5323L)
  public static SubLObject hyphenated_number_value(final SubLObject string)
  {
    final SubLObject components = string_utilities.split_string( string, $list19 );
    return combine_number_values( number_value( components.first() ), $kw20$PLUS, number_value( conses_high.second( components ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 5679L)
  public static SubLObject combine_number_values(final SubLObject val1, final SubLObject type, final SubLObject val2)
  {
    assert NIL != Types.keywordp( type ) : type;
    final SubLObject raw_value = ( val1.isNumber() && val2.isNumber() ) ? combine_non_cycl_number_values( val1, type, val2 ) : combine_cycl_number_values( val1, type, val2 );
    return ( type == $kw22$TIMES && NIL != number_utilities.extended_potentially_infinite_number_p( raw_value ) ) ? number_utilities.significant_digits( raw_value, numeral_parser_max_significant_digits( val1, val2 ) )
        : raw_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 6273L)
  public static SubLObject numeral_parser_max_significant_digits(final SubLObject val1, final SubLObject val2)
  {
    final SubLObject sd1 = numeral_parser_significant_digits( val1 );
    final SubLObject sd2 = numeral_parser_significant_digits( val2 );
    return Numbers.max( sd1, sd2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 6472L)
  public static SubLObject numeral_parser_significant_digits(final SubLObject val)
  {
    final SubLObject string = Sequences.remove( Characters.CHAR_period, print_high.prin1_to_string( val ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject suffix_start = list_utilities.position_if_not( $sym23$DIGIT_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != suffix_start ) ? suffix_start : Sequences.length( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 6763L)
  public static SubLObject combine_cycl_number_values(final SubLObject val1, final SubLObject type, final SubLObject val2)
  {
    SubLObject raw_value = NIL;
    if( type.eql( $kw20$PLUS ) )
    {
      raw_value = ConsesLow.list( $const24$PlusFn, val1, val2 );
    }
    else if( type.eql( $kw22$TIMES ) )
    {
      raw_value = ConsesLow.list( $const25$TimesFn, val1, val2 );
    }
    else if( type.eql( $kw26$DIVIDEDBY ) )
    {
      raw_value = ConsesLow.list( $const27$QuotientFn, val1, val2 );
    }
    else if( type.eql( $kw28$TOTHE ) )
    {
      raw_value = ConsesLow.list( $const29$ExponentFn, val1, val2 );
    }
    return simplifier.simplify_number_expression( raw_value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 7301L)
  public static SubLObject combine_non_cycl_number_values(final SubLObject val1, final SubLObject type, final SubLObject val2)
  {
    if( type.eql( $kw20$PLUS ) )
    {
      return Numbers.add( val1, val2 );
    }
    if( type.eql( $kw22$TIMES ) )
    {
      return Numbers.multiply( val1, val2 );
    }
    if( type.eql( $kw26$DIVIDEDBY ) )
    {
      return Numbers.divide( val1, val2 );
    }
    if( type.eql( $kw28$TOTHE ) )
    {
      return Numbers.expt( val1, val2 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 7624L)
  public static SubLObject numeral_parser_stringE(final SubLObject string1, final SubLObject string2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue( thread ) ) ? cycl_string.cycl_stringE( string1, string2 ) : cycl_string.cycl_string_equal( string1, string2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 7871L)
  public static SubLObject numeral_parser_charE(final SubLObject char1, final SubLObject char2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != parsing_vars.$numeral_parser_case_sensitiveP$.getDynamicValue( thread ) ) ? Characters.charE( char1, char2 ) : Characters.char_equal( char1, char2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8026L)
  public static SubLObject zero_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str30$zero ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8151L)
  public static SubLObject indefinite_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw31$INDEFINITE, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8270L)
  public static SubLObject atomic_ten_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.assoc( document.sign_string( v_object ), $atomic_tens$.getGlobalValue(), Symbols.symbol_function( $sym32$NUMERAL_PARSER_STRING_ ),
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8413L)
  public static SubLObject digit_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.assoc( document.sign_string( v_object ), $digits$.getGlobalValue(), Symbols.symbol_function( $sym32$NUMERAL_PARSER_STRING_ ),
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8806L)
  public static SubLObject deci_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.assoc( document.sign_string( v_object ), $digits$.getGlobalValue(), Symbols.symbol_function( $sym32$NUMERAL_PARSER_STRING_ ),
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 8938L)
  public static SubLObject hyphen_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && document.sign_string( v_object ).equal( $str33$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9042L)
  public static SubLObject teen_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.assoc( document.sign_string( v_object ), $teens$.getGlobalValue(), Symbols.symbol_function( $sym32$NUMERAL_PARSER_STRING_ ),
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9173L)
  public static SubLObject fuzzy_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && ( NIL != conses_high.assoc( document.sign_string( v_object ), $fuzzies$.getGlobalValue(), Symbols.symbol_function( $sym32$NUMERAL_PARSER_STRING_ ),
        UNPROVIDED ) || NIL != conses_high.member( $kw34$FUZZY, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9391L)
  public static SubLObject non_atomic_ten_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw35$NON_ATOMIC_TEN, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9518L)
  public static SubLObject hyphenated_non_atomic_ten_signP(final SubLObject v_object)
  {
    if( NIL != document.sign_p( v_object ) )
    {
      final SubLObject components = string_utilities.split_string( document.sign_string( v_object ), $list19 );
      return makeBoolean( Sequences.length( components ).numE( TWO_INTEGER ) && NIL != conses_high.assoc( components.first(), $atomic_tens$.getGlobalValue(), Symbols.symbol_function( $sym32$NUMERAL_PARSER_STRING_ ),
          UNPROVIDED ) && NIL != conses_high.assoc( conses_high.second( components ), $digits$.getGlobalValue(), Symbols.symbol_function( $sym32$NUMERAL_PARSER_STRING_ ), UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9870L)
  public static SubLObject cent_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw36$CENT, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 9977L)
  public static SubLObject kilo_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw37$KILO, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10084L)
  public static SubLObject fraction_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw38$FRACTION, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10199L)
  public static SubLObject float_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw39$FLOAT, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10308L)
  public static SubLObject number_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw40$NUMBER, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10421L)
  public static SubLObject interval_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw41$INTERVAL, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10538L)
  public static SubLObject proper_interval_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw42$PROPER_INTERVAL, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10669L)
  public static SubLObject milli_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw43$MILLI, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10778L)
  public static SubLObject billi_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw44$BILLI, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10887L)
  public static SubLObject trilli_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw45$TRILLI, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 10998L)
  public static SubLObject integer_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw46$INTEGER, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11111L)
  public static SubLObject extended_dozen_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw47$EXTENDED_DOZEN, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11256L)
  public static SubLObject standard_dozen_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw48$STANDARD_DOZEN, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11401L)
  public static SubLObject extended_hundred_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw49$EXTENDED_HUNDRED, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11532L)
  public static SubLObject standard_hundred_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw50$STANDARD_HUNDRED, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11663L)
  public static SubLObject thousand_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw51$THOUSAND, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11778L)
  public static SubLObject million_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw52$MILLION, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 11891L)
  public static SubLObject billion_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw53$BILLION, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12004L)
  public static SubLObject trillion_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw54$TRILLION, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12119L)
  public static SubLObject and_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str55$and ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12242L)
  public static SubLObject indefinite_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.assoc( document.sign_string( v_object ), $a$.getGlobalValue(), Symbols.symbol_function( $sym32$NUMERAL_PARSER_STRING_ ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12378L)
  public static SubLObject dozen_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str56$dozen ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12523L)
  public static SubLObject few_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str57$few ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12664L)
  public static SubLObject hundred_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str58$hundred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12795L)
  public static SubLObject thousand_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str59$thousand ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 12928L)
  public static SubLObject million_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str60$million ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13059L)
  public static SubLObject millions_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str61$millions ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13192L)
  public static SubLObject billions_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str62$billions ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13325L)
  public static SubLObject billion_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str63$billion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13456L)
  public static SubLObject trillions_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str64$trillions ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13591L)
  public static SubLObject trillion_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str65$trillion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13724L)
  public static SubLObject first_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str66$first ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13851L)
  public static SubLObject second_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str67$second ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 13980L)
  public static SubLObject seconds_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str68$seconds ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 14111L)
  public static SubLObject atomic_denominator_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL == first_literalP( v_object ) && NIL == second_literalP( v_object ) && NIL == seconds_literalP( v_object ) && ( NIL != numeral_parser_stringE( document
        .sign_string( v_object ), $str69$halves ) || NIL != conses_high.assoc( string_utilities.post_remove( document.sign_string( v_object ), $str16$s, $sym70$NUMERAL_PARSER_CHAR_ ), $irregular_denominators$
            .getGlobalValue(), Symbols.symbol_function( $sym32$NUMERAL_PARSER_STRING_ ), UNPROVIDED ) || NIL != string_utilities.ends_with( document.sign_string( v_object ), $str17$th, UNPROVIDED )
        || NIL != string_utilities.ends_with( document.sign_string( v_object ), $str18$ths, UNPROVIDED ) ) && NIL != number_value( document.sign_string( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 14639L)
  public static SubLObject denominator_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && ( NIL != numeral_parser_stringE( document.sign_string( v_object ), $str69$halves ) || NIL != conses_high.assoc( string_utilities.post_remove( document
        .sign_string( v_object ), $str16$s, $sym70$NUMERAL_PARSER_CHAR_ ), $irregular_denominators$.getGlobalValue(), Symbols.symbol_function( $sym32$NUMERAL_PARSER_STRING_ ), UNPROVIDED ) || NIL != string_utilities
            .ends_with( document.sign_string( v_object ), $str17$th, UNPROVIDED ) || NIL != string_utilities.ends_with( document.sign_string( v_object ), $str18$ths, UNPROVIDED ) ) && NIL != number_value( document
                .sign_string( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15046L)
  public static SubLObject denominator_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw71$DENOMINATOR, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15167L)
  public static SubLObject half_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str72$half ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15295L)
  public static SubLObject minus_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && ( NIL != numeral_parser_stringE( document.sign_string( v_object ), $str73$minus ) || NIL != numeral_parser_stringE( document.sign_string( v_object ),
        $str74$negative ) || NIL != minus_signP( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15526L)
  public static SubLObject to_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && ( NIL != numeral_parser_stringE( document.sign_string( v_object ), $str75$to ) || NIL != numeral_parser_stringE( document.sign_string( v_object ),
        $str33$_ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15713L)
  public static SubLObject from_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str76$from ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15838L)
  public static SubLObject between_literalP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != numeral_parser_stringE( document.sign_string( v_object ), $str77$between ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 15969L)
  public static SubLObject mult_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw78$MULT, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 16076L)
  public static SubLObject expt_operator_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw79$EXPT, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 16192L)
  public static SubLObject exponentiation_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != conses_high.member( $kw80$EXPONENTIATION, document.sign_category( v_object ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 16319L)
  public static SubLObject minus_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != Strings.stringE( document.sign_string( v_object ), $str33$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 16426L)
  public static SubLObject plus_signP(final SubLObject v_object)
  {
    return makeBoolean( NIL != document.sign_p( v_object ) && NIL != Strings.stringE( document.sign_string( v_object ), $str81$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 16530L)
  public static SubLObject build_denominator(final SubLObject fst)
  {
    final SubLObject output = finite_state_transducer.fst_output( fst );
    if( NIL == output )
    {
      Errors.error( $str82$Can_t_build_a_denominator_out_of_ );
      return NIL;
    }
    if( NIL != list_utilities.singletonP( output ) )
    {
      final SubLObject word = output.first();
      document.word_update( word, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw71$DENOMINATOR, document.word_category( word ), UNPROVIDED, UNPROVIDED ), $kw84$INFO, number_value( document.word_string(
          word ) ) ) );
      return word;
    }
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    SubLObject numeric_value = ZERO_INTEGER;
    SubLObject cdolist_list_var = output;
    SubLObject dtr = NIL;
    dtr = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject dtr_info = document.sign_info( dtr );
      numeric_value = combine_number_values( numeric_value, $kw20$PLUS, ( NIL != dtr_info ) ? dtr_info : number_value( document.sign_string( dtr ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      dtr = cdolist_list_var.first();
    }
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw71$DENOMINATOR, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping
        .mapcar( Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ),
            finite_state_transducer.fst_output( fst ) ), $kw84$INFO, numeric_value ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 18279L)
  public static SubLObject build_zero(final SubLObject fst)
  {
    final SubLObject word = finite_state_transducer.fst_output( fst ).first();
    document.word_update( word, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw96$ZERO, document.word_category( word ), UNPROVIDED, UNPROVIDED ), $kw84$INFO, number_value( document.word_string( word ) ) ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 18631L)
  public static SubLObject build_indefinite(final SubLObject fst)
  {
    final SubLObject word = finite_state_transducer.fst_output( fst ).first();
    document.word_update( word, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw31$INDEFINITE, document.word_category( word ), UNPROVIDED, UNPROVIDED ), $kw84$INFO, number_value( document.word_string(
        word ) ) ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 19013L)
  public static SubLObject build_deci(final SubLObject fst)
  {
    final SubLObject word = finite_state_transducer.fst_output( fst ).first();
    document.word_update( word, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw101$DECI, document.word_category( word ), UNPROVIDED, UNPROVIDED ), $kw84$INFO, number_value( document.word_string( word ) ) ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 19407L)
  public static SubLObject build_teen(final SubLObject fst)
  {
    final SubLObject word = finite_state_transducer.fst_output( fst ).first();
    document.word_update( word, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw105$TEEN, document.word_category( word ), UNPROVIDED, UNPROVIDED ), $kw84$INFO, number_value( document.word_string( word ) ) ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 19755L)
  public static SubLObject build_fuzzy(final SubLObject fst)
  {
    final SubLObject word = finite_state_transducer.fst_output( fst ).first();
    document.word_update( word, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw34$FUZZY, document.word_category( word ), UNPROVIDED, UNPROVIDED ), $kw84$INFO, number_value( document.word_string( word ) ) ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 20144L)
  public static SubLObject build_atomic_ten(final SubLObject fst)
  {
    final SubLObject word = finite_state_transducer.fst_output( fst ).first();
    document.word_update( word, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw110$ATOMIC_TEN, document.word_category( word ), UNPROVIDED, UNPROVIDED ), $kw84$INFO, number_value( document.word_string(
        word ) ) ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 20522L)
  public static SubLObject build_hyphenated_non_atomic_ten(final SubLObject fst)
  {
    final SubLObject word = finite_state_transducer.fst_output( fst ).first();
    document.word_update( word, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw35$NON_ATOMIC_TEN, document.word_category( word ), UNPROVIDED, UNPROVIDED ), $kw84$INFO, hyphenated_number_value( document
        .word_string( word ) ) ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 20976L)
  public static SubLObject build_non_atomic_ten(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject normalized_output = Sequences.remove_if( Symbols.symbol_function( $sym114$HYPHEN_SIGN_ ), finite_state_transducer.fst_output( fst ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, ConsesLow.list( $kw35$NON_ATOMIC_TEN ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar( Symbols.symbol_function( $sym86$SIGN_STRING ),
        finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), finite_state_transducer.fst_output( fst ) ), $kw84$INFO,
        combine_number_values( document.sign_info( normalized_output.first() ), $kw20$PLUS, document.sign_info( conses_high.second( normalized_output ) ) ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 21736L)
  public static SubLObject build_cent(final SubLObject fst)
  {
    final SubLObject sign = finite_state_transducer.fst_output( fst ).first();
    document.sign_update( sign, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw36$CENT, document.sign_category( sign ), UNPROVIDED, UNPROVIDED ) ) );
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 22237L)
  public static SubLObject build_standard_hundred(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject normalized_output = Sequences.remove_if( Symbols.symbol_function( $sym121$AND_LITERAL_ ), finite_state_transducer.fst_output( fst ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw50$STANDARD_HUNDRED, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping
        .mapcar( Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ),
            finite_state_transducer.fst_output( fst ) ), $kw84$INFO, combine_number_values( combine_number_values( document.sign_info( normalized_output.first() ), $kw22$TIMES, $int15$100 ), $kw20$PLUS, ( NIL != document
                .sign_p( conses_high.third( normalized_output ) ) ) ? document.sign_info( conses_high.third( normalized_output ) ) : ZERO_INTEGER ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 23385L)
  public static SubLObject build_a_few(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw34$FUZZY, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar(
        Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), finite_state_transducer
            .fst_output( fst ) ), $kw84$INFO, $const131$AFew_Quant ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 23907L)
  public static SubLObject build_extended_hundred(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject normalized_output = Sequences.remove_if( Symbols.symbol_function( $sym121$AND_LITERAL_ ), finite_state_transducer.fst_output( fst ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw49$EXTENDED_HUNDRED, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping
        .mapcar( Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ),
            finite_state_transducer.fst_output( fst ) ), $kw84$INFO, combine_number_values( combine_number_values( document.sign_info( normalized_output.first() ), $kw22$TIMES, $int15$100 ), $kw20$PLUS, ( NIL != document
                .sign_p( conses_high.third( normalized_output ) ) ) ? document.sign_info( conses_high.third( normalized_output ) ) : ZERO_INTEGER ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 25056L)
  public static SubLObject build_standard_dozen(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject normalized_output = Sequences.remove_if( Symbols.symbol_function( $sym121$AND_LITERAL_ ), finite_state_transducer.fst_output( fst ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw48$STANDARD_DOZEN, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping
        .mapcar( Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ),
            finite_state_transducer.fst_output( fst ) ), $kw84$INFO, combine_number_values( combine_number_values( document.sign_info( normalized_output.first() ), $kw22$TIMES, TWELVE_INTEGER ), $kw20$PLUS,
                ( NIL != document.sign_p( conses_high.third( normalized_output ) ) ) ? document.sign_info( conses_high.third( normalized_output ) ) : ZERO_INTEGER ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 25938L)
  public static SubLObject build_extended_dozen(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject normalized_output = Sequences.remove_if( Symbols.symbol_function( $sym121$AND_LITERAL_ ), finite_state_transducer.fst_output( fst ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw47$EXTENDED_DOZEN, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping
        .mapcar( Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ),
            finite_state_transducer.fst_output( fst ) ), $kw84$INFO, combine_number_values( combine_number_values( document.sign_info( normalized_output.first() ), $kw22$TIMES, TWELVE_INTEGER ), $kw20$PLUS,
                ( NIL != document.sign_p( conses_high.third( normalized_output ) ) ) ? document.sign_info( conses_high.third( normalized_output ) ) : ZERO_INTEGER ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 26825L)
  public static SubLObject build_kilo(final SubLObject fst)
  {
    final SubLObject sign = finite_state_transducer.fst_output( fst ).first();
    document.sign_update( sign, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw37$KILO, document.sign_category( sign ), UNPROVIDED, UNPROVIDED ) ) );
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 27300L)
  public static SubLObject build_thousand(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject normalized_output = Sequences.remove_if( Symbols.symbol_function( $sym121$AND_LITERAL_ ), finite_state_transducer.fst_output( fst ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw51$THOUSAND, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar(
        Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), finite_state_transducer
            .fst_output( fst ) ), $kw84$INFO, combine_number_values( combine_number_values( document.sign_info( normalized_output.first() ), $kw22$TIMES, $int143$1000 ), $kw20$PLUS, ( NIL != document.sign_p( conses_high
                .third( normalized_output ) ) ) ? document.sign_info( conses_high.third( normalized_output ) ) : ZERO_INTEGER ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 28417L)
  public static SubLObject build_milli(final SubLObject fst)
  {
    final SubLObject sign = finite_state_transducer.fst_output( fst ).first();
    document.sign_update( sign, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw43$MILLI, document.sign_category( sign ), UNPROVIDED, UNPROVIDED ) ) );
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 28805L)
  public static SubLObject build_million(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject normalized_output = Sequences.remove_if( Symbols.symbol_function( $sym121$AND_LITERAL_ ), finite_state_transducer.fst_output( fst ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw52$MILLION, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar(
        Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), finite_state_transducer
            .fst_output( fst ) ), $kw84$INFO, combine_number_values( combine_number_values( document.sign_info( normalized_output.first() ), $kw22$TIMES, $int149$1000000 ), $kw20$PLUS, ( NIL != document.sign_p(
                conses_high.third( normalized_output ) ) ) ? document.sign_info( conses_high.third( normalized_output ) ) : ZERO_INTEGER ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 29927L)
  public static SubLObject build_billi(final SubLObject fst)
  {
    final SubLObject sign = finite_state_transducer.fst_output( fst ).first();
    document.sign_update( sign, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw44$BILLI, document.sign_category( sign ), UNPROVIDED, UNPROVIDED ) ) );
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 30315L)
  public static SubLObject build_billion(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject normalized_output = Sequences.remove_if( Symbols.symbol_function( $sym121$AND_LITERAL_ ), finite_state_transducer.fst_output( fst ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw53$BILLION, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar(
        Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), finite_state_transducer
            .fst_output( fst ) ), $kw84$INFO, combine_number_values( combine_number_values( document.sign_info( normalized_output.first() ), $kw22$TIMES, $int155$1000000000 ), $kw20$PLUS, ( NIL != document.sign_p(
                conses_high.third( normalized_output ) ) ) ? document.sign_info( conses_high.third( normalized_output ) ) : ZERO_INTEGER ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 31440L)
  public static SubLObject build_trilli(final SubLObject fst)
  {
    final SubLObject sign = finite_state_transducer.fst_output( fst ).first();
    document.sign_update( sign, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw45$TRILLI, document.sign_category( sign ), UNPROVIDED, UNPROVIDED ) ) );
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 31832L)
  public static SubLObject build_trillion(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    final SubLObject normalized_output = Sequences.remove_if( Symbols.symbol_function( $sym121$AND_LITERAL_ ), finite_state_transducer.fst_output( fst ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw54$TRILLION, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar(
        Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), finite_state_transducer
            .fst_output( fst ) ), $kw84$INFO, combine_number_values( combine_number_values( document.sign_info( normalized_output.first() ), $kw22$TIMES, $int161$1000000000000 ), $kw20$PLUS, ( NIL != document.sign_p(
                conses_high.third( normalized_output ) ) ) ? document.sign_info( conses_high.third( normalized_output ) ) : ZERO_INTEGER ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 32967L)
  public static SubLObject build_integer(final SubLObject fst)
  {
    final SubLObject sign = finite_state_transducer.fst_output( fst ).first();
    document.sign_update( sign, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw46$INTEGER, document.sign_category( sign ), UNPROVIDED, UNPROVIDED ) ) );
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 33321L)
  public static SubLObject build_number(final SubLObject fst)
  {
    final SubLObject sign = finite_state_transducer.fst_output( fst ).first();
    document.sign_update( sign, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw40$NUMBER, document.sign_category( sign ), UNPROVIDED, UNPROVIDED ) ) );
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 33842L)
  public static SubLObject build_fraction(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw38$FRACTION, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar(
        Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), finite_state_transducer
            .fst_output( fst ) ), $kw84$INFO, combine_number_values( document.sign_info( finite_state_transducer.fst_output( fst ).first() ), $kw26$DIVIDEDBY, document.sign_info( conses_high.second(
                finite_state_transducer.fst_output( fst ) ) ) ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 34560L)
  public static SubLObject build_half(final SubLObject fst)
  {
    final SubLObject sign = finite_state_transducer.fst_output( fst ).first();
    document.sign_update( sign, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw40$NUMBER, document.sign_category( sign ), UNPROVIDED, UNPROVIDED ), $kw84$INFO, $float174$0_5 ) );
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 34884L)
  public static SubLObject build_float(final SubLObject fst)
  {
    final SubLObject output = finite_state_transducer.fst_output( fst );
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw39$FLOAT, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar(
        Symbols.symbol_function( $sym86$SIGN_STRING ), output ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), output ), $kw84$INFO, combine_number_values( document
            .sign_info( output.first() ), $kw20$PLUS, document.sign_info( conses_high.third( output ) ) ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 35515L)
  public static SubLObject build_negative_number(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw40$NUMBER, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar(
        Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), finite_state_transducer
            .fst_output( fst ) ), $kw84$INFO, Numbers.minus( document.sign_info( conses_high.second( finite_state_transducer.fst_output( fst ) ) ) ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 36062L)
  public static SubLObject build_proper_interval(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw42$PROPER_INTERVAL, document.phrase_category( phrase ), UNPROVIDED, UNPROVIDED ), $kw85$STRING, string_utilities.bunge( Mapping
        .mapcar( Symbols.symbol_function( $sym86$SIGN_STRING ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ),
            finite_state_transducer.fst_output( fst ) ), $kw84$INFO, ConsesLow.cons( $const181$Unity, Sort.sort( Sequences.delete_if( Symbols.symbol_function( $sym182$NULL ), Mapping.mapcar( Symbols.symbol_function(
                $sym183$SIGN_INFO ), finite_state_transducer.fst_output( fst ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym184$_ ), UNPROVIDED ) ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 37095L)
  public static SubLObject build_interval(final SubLObject fst)
  {
    final SubLObject sign = finite_state_transducer.fst_output( fst ).first();
    document.sign_update( sign, ConsesLow.list( $kw83$CATEGORY, conses_high.adjoin( $kw41$INTERVAL, document.sign_category( sign ), UNPROVIDED, UNPROVIDED ) ) );
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 38090L)
  public static SubLObject lex_numerals(final SubLObject sequence)
  {
    assert NIL != Types.sequencep( sequence ) : sequence;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject word;
    for( length = Sequences.length( sequence ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      word = Vectors.aref( sequence, element_num );
      if( NIL != number_utilities.number_string_p( document.word_string( word ) ) )
      {
        document.word_update( word, ConsesLow.list( $kw83$CATEGORY, ConsesLow.list( $kw40$NUMBER ), $kw84$INFO, number_utilities.number_string_value( document.word_string( word ) ) ) );
      }
      else if( NIL != Strings.stringE( document.word_string( word ), $str197$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        document.word_update( word, ConsesLow.list( $kw83$CATEGORY, ConsesLow.list( $kw78$MULT ) ) );
      }
      else if( NIL != Strings.stringE( document.word_string( word ), $str198$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        document.word_update( word, ConsesLow.list( $kw83$CATEGORY, ConsesLow.list( $kw79$EXPT ) ) );
      }
    }
    return sequence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 39198L)
  public static SubLObject build_exponentiation_phrase(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, ConsesLow.list( $kw80$EXPONENTIATION ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar( Symbols.symbol_function( $sym86$SIGN_STRING ),
        finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), finite_state_transducer.fst_output( fst ) ), $kw84$INFO,
        combine_number_values( document.sign_info( finite_state_transducer.fst_output( fst ).first() ), $kw28$TOTHE, document.sign_info( conses_high.third( finite_state_transducer.fst_output( fst ) ) ) ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 39868L)
  public static SubLObject build_multiplication_phrase(final SubLObject fst)
  {
    final SubLObject phrase = document.new_phrase( UNPROVIDED );
    document.phrase_update( phrase, ConsesLow.list( $kw83$CATEGORY, ConsesLow.list( $kw40$NUMBER ), $kw85$STRING, string_utilities.bunge( Mapping.mapcar( Symbols.symbol_function( $sym86$SIGN_STRING ),
        finite_state_transducer.fst_output( fst ) ), UNPROVIDED ), $kw87$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym88$VECTOR ), finite_state_transducer.fst_output( fst ) ), $kw84$INFO,
        combine_number_values( document.sign_info( finite_state_transducer.fst_output( fst ).first() ), $kw22$TIMES, document.sign_info( conses_high.third( finite_state_transducer.fst_output( fst ) ) ) ) ) );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 40715L)
  public static SubLObject string_to_interval(final SubLObject string)
  {
    return conses_high.copy_tree( string_to_interval_cached( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 41003L)
  public static SubLObject clear_string_to_interval_cached()
  {
    final SubLObject cs = $string_to_interval_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 41003L)
  public static SubLObject remove_string_to_interval_cached(final SubLObject string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $string_to_interval_cached_caching_state$.getGlobalValue(), ConsesLow.list( string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 41003L)
  public static SubLObject string_to_interval_cached_internal(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    SubLObject ans = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw208$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym209$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject standardized_number_string = standardize_number_string( string, UNPROVIDED );
          final SubLObject tokens = document.string_wordify( standardized_number_string, UNPROVIDED );
          final SubLObject english_parse = finite_state_cascade_parser.fscp_parse( $english_interval_parser$.getDynamicValue( thread ), tokens );
          ans = numeric_interval_term_from_fscp_result( english_parse );
          if( NIL == ans )
          {
            final SubLObject digit_parse = finite_state_cascade_parser.fscp_parse( $digit_interval_parser$.getDynamicValue( thread ), tokens );
            ans = numeric_interval_term_from_fscp_result( digit_parse );
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw208$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 41003L)
  public static SubLObject string_to_interval_cached(final SubLObject string)
  {
    SubLObject caching_state = $string_to_interval_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym206$STRING_TO_INTERVAL_CACHED, $sym210$_STRING_TO_INTERVAL_CACHED_CACHING_STATE_, $int211$256, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( string_to_interval_cached_internal( string ) ) );
      memoization_state.caching_state_put( caching_state, string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 41720L)
  public static SubLObject numeric_interval_term_from_fscp_result(final SubLObject fscp_result)
  {
    if( NIL != list_utilities.lengthE( fscp_result, ONE_INTEGER, UNPROVIDED ) )
    {
      final SubLObject first_fscp_result = Sequences.elt( fscp_result, ZERO_INTEGER );
      return ( NIL != document.sign_info( first_fscp_result ) && NIL != interval_signP( first_fscp_result ) ) ? document.sign_info( first_fscp_result ) : NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeral-parser.lisp", position = 42041L)
  public static SubLObject interval_stringP(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return string_to_interval( string );
  }

  public static final class $numeral_parser_stringE$BinaryFunction
      extends
        BinaryFunction
  {
    public $numeral_parser_stringE$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NUMERAL-PARSER-STRING=" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return numeral_parser_stringE( arg1, arg2 );
    }
  }

  public static SubLObject declare_numeral_parser_file()
  {
    SubLFiles.declareFunction( me, "standardize_number_string", "STANDARDIZE-NUMBER-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_number_values", "INITIALIZE-NUMBER-VALUES", 0, 0, false );
    SubLFiles.declareFunction( me, "number_value", "NUMBER-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "number_string_signP", "NUMBER-STRING-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "hyphenated_number_value", "HYPHENATED-NUMBER-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "combine_number_values", "COMBINE-NUMBER-VALUES", 3, 0, false );
    SubLFiles.declareFunction( me, "numeral_parser_max_significant_digits", "NUMERAL-PARSER-MAX-SIGNIFICANT-DIGITS", 2, 0, false );
    SubLFiles.declareFunction( me, "numeral_parser_significant_digits", "NUMERAL-PARSER-SIGNIFICANT-DIGITS", 1, 0, false );
    SubLFiles.declareFunction( me, "combine_cycl_number_values", "COMBINE-CYCL-NUMBER-VALUES", 3, 0, false );
    SubLFiles.declareFunction( me, "combine_non_cycl_number_values", "COMBINE-NON-CYCL-NUMBER-VALUES", 3, 0, false );
    SubLFiles.declareFunction( me, "numeral_parser_stringE", "NUMERAL-PARSER-STRING=", 2, 0, false );
    new $numeral_parser_stringE$BinaryFunction();
    SubLFiles.declareFunction( me, "numeral_parser_charE", "NUMERAL-PARSER-CHAR=", 2, 0, false );
    SubLFiles.declareFunction( me, "zero_literalP", "ZERO-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "indefinite_signP", "INDEFINITE-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "atomic_ten_signP", "ATOMIC-TEN-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "digit_signP", "DIGIT-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "deci_signP", "DECI-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "hyphen_signP", "HYPHEN-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "teen_signP", "TEEN-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "fuzzy_signP", "FUZZY-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_atomic_ten_signP", "NON-ATOMIC-TEN-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "hyphenated_non_atomic_ten_signP", "HYPHENATED-NON-ATOMIC-TEN-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "cent_signP", "CENT-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "kilo_signP", "KILO-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "fraction_signP", "FRACTION-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "float_signP", "FLOAT-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "number_signP", "NUMBER-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_signP", "INTERVAL-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "proper_interval_signP", "PROPER-INTERVAL-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "milli_signP", "MILLI-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "billi_signP", "BILLI-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "trilli_signP", "TRILLI-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_signP", "INTEGER-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_dozen_signP", "EXTENDED-DOZEN-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "standard_dozen_signP", "STANDARD-DOZEN-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_hundred_signP", "EXTENDED-HUNDRED-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "standard_hundred_signP", "STANDARD-HUNDRED-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "thousand_signP", "THOUSAND-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "million_signP", "MILLION-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "billion_signP", "BILLION-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "trillion_signP", "TRILLION-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "and_literalP", "AND-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "indefinite_literalP", "INDEFINITE-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "dozen_literalP", "DOZEN-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "few_literalP", "FEW-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "hundred_literalP", "HUNDRED-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "thousand_literalP", "THOUSAND-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "million_literalP", "MILLION-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "millions_literalP", "MILLIONS-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "billions_literalP", "BILLIONS-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "billion_literalP", "BILLION-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "trillions_literalP", "TRILLIONS-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "trillion_literalP", "TRILLION-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "first_literalP", "FIRST-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "second_literalP", "SECOND-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "seconds_literalP", "SECONDS-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "atomic_denominator_literalP", "ATOMIC-DENOMINATOR-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "denominator_literalP", "DENOMINATOR-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "denominator_signP", "DENOMINATOR-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "half_signP", "HALF-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "minus_literalP", "MINUS-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "to_literalP", "TO-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "from_literalP", "FROM-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "between_literalP", "BETWEEN-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "mult_signP", "MULT-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "expt_operator_signP", "EXPT-OPERATOR-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "exponentiation_signP", "EXPONENTIATION-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "minus_signP", "MINUS-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "plus_signP", "PLUS-SIGN?", 1, 0, false );
    SubLFiles.declareFunction( me, "build_denominator", "BUILD-DENOMINATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "build_zero", "BUILD-ZERO", 1, 0, false );
    SubLFiles.declareFunction( me, "build_indefinite", "BUILD-INDEFINITE", 1, 0, false );
    SubLFiles.declareFunction( me, "build_deci", "BUILD-DECI", 1, 0, false );
    SubLFiles.declareFunction( me, "build_teen", "BUILD-TEEN", 1, 0, false );
    SubLFiles.declareFunction( me, "build_fuzzy", "BUILD-FUZZY", 1, 0, false );
    SubLFiles.declareFunction( me, "build_atomic_ten", "BUILD-ATOMIC-TEN", 1, 0, false );
    SubLFiles.declareFunction( me, "build_hyphenated_non_atomic_ten", "BUILD-HYPHENATED-NON-ATOMIC-TEN", 1, 0, false );
    SubLFiles.declareFunction( me, "build_non_atomic_ten", "BUILD-NON-ATOMIC-TEN", 1, 0, false );
    SubLFiles.declareFunction( me, "build_cent", "BUILD-CENT", 1, 0, false );
    SubLFiles.declareFunction( me, "build_standard_hundred", "BUILD-STANDARD-HUNDRED", 1, 0, false );
    SubLFiles.declareFunction( me, "build_a_few", "BUILD-A-FEW", 1, 0, false );
    SubLFiles.declareFunction( me, "build_extended_hundred", "BUILD-EXTENDED-HUNDRED", 1, 0, false );
    SubLFiles.declareFunction( me, "build_standard_dozen", "BUILD-STANDARD-DOZEN", 1, 0, false );
    SubLFiles.declareFunction( me, "build_extended_dozen", "BUILD-EXTENDED-DOZEN", 1, 0, false );
    SubLFiles.declareFunction( me, "build_kilo", "BUILD-KILO", 1, 0, false );
    SubLFiles.declareFunction( me, "build_thousand", "BUILD-THOUSAND", 1, 0, false );
    SubLFiles.declareFunction( me, "build_milli", "BUILD-MILLI", 1, 0, false );
    SubLFiles.declareFunction( me, "build_million", "BUILD-MILLION", 1, 0, false );
    SubLFiles.declareFunction( me, "build_billi", "BUILD-BILLI", 1, 0, false );
    SubLFiles.declareFunction( me, "build_billion", "BUILD-BILLION", 1, 0, false );
    SubLFiles.declareFunction( me, "build_trilli", "BUILD-TRILLI", 1, 0, false );
    SubLFiles.declareFunction( me, "build_trillion", "BUILD-TRILLION", 1, 0, false );
    SubLFiles.declareFunction( me, "build_integer", "BUILD-INTEGER", 1, 0, false );
    SubLFiles.declareFunction( me, "build_number", "BUILD-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "build_fraction", "BUILD-FRACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "build_half", "BUILD-HALF", 1, 0, false );
    SubLFiles.declareFunction( me, "build_float", "BUILD-FLOAT", 1, 0, false );
    SubLFiles.declareFunction( me, "build_negative_number", "BUILD-NEGATIVE-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "build_proper_interval", "BUILD-PROPER-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "build_interval", "BUILD-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "lex_numerals", "LEX-NUMERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "build_exponentiation_phrase", "BUILD-EXPONENTIATION-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "build_multiplication_phrase", "BUILD-MULTIPLICATION-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "string_to_interval", "STRING-TO-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_string_to_interval_cached", "CLEAR-STRING-TO-INTERVAL-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_string_to_interval_cached", "REMOVE-STRING-TO-INTERVAL-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "string_to_interval_cached_internal", "STRING-TO-INTERVAL-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "string_to_interval_cached", "STRING-TO-INTERVAL-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "numeric_interval_term_from_fscp_result", "NUMERIC-INTERVAL-TERM-FROM-FSCP-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_stringP", "INTERVAL-STRING?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_numeral_parser_file()
  {
    $null$ = SubLFiles.deflexical( "*NULL*", $list0 );
    $a$ = SubLFiles.deflexical( "*A*", $list1 );
    $digits$ = SubLFiles.deflexical( "*DIGITS*", $list2 );
    $teens$ = SubLFiles.deflexical( "*TEENS*", $list3 );
    $fuzzies$ = SubLFiles.deflexical( "*FUZZIES*", $list4 );
    $atomic_tens$ = SubLFiles.deflexical( "*ATOMIC-TENS*", $list5 );
    $onedozen$ = SubLFiles.deflexical( "*ONEDOZEN*", $list6 );
    $onehundred$ = SubLFiles.deflexical( "*ONEHUNDRED*", $list7 );
    $onethousand$ = SubLFiles.deflexical( "*ONETHOUSAND*", $list8 );
    $onemillion$ = SubLFiles.deflexical( "*ONEMILLION*", $list9 );
    $onebillion$ = SubLFiles.deflexical( "*ONEBILLION*", $list10 );
    $onetrillion$ = SubLFiles.deflexical( "*ONETRILLION*", $list11 );
    $irregular_denominators$ = SubLFiles.deflexical( "*IRREGULAR-DENOMINATORS*", $list12 );
    $number_values$ = SubLFiles.defparameter( "*NUMBER-VALUES*", initialize_number_values() );
    $denominator$ = SubLFiles.defparameter( "*DENOMINATOR*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym90$ATOMIC_DENOMINATOR_LITERAL_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym92$ATOMIC_TEN_SIGN_ ), $list93 ), ConsesLow.listS( TWO_INTEGER, Symbols.symbol_function(
            $sym94$DENOMINATOR_LITERAL_ ), $list91 ) ), Symbols.symbol_function( $sym95$BUILD_DENOMINATOR ) ) );
    $zero$ = SubLFiles.defparameter( "*ZERO*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym97$ZERO_LITERAL_ ),
        $list91 ) ), Symbols.symbol_function( $sym98$BUILD_ZERO ) ) );
    $indefinite$ = SubLFiles.defparameter( "*INDEFINITE*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym99$INDEFINITE_LITERAL_ ), $list91 ) ), Symbols.symbol_function( $sym100$BUILD_INDEFINITE ) ) );
    $deci$ = SubLFiles.defparameter( "*DECI*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym102$DIGIT_SIGN_ ),
        $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym103$NUMBER_STRING_SIGN_ ), $list91 ) ), Symbols.symbol_function( $sym104$BUILD_DECI ) ) );
    $teen$ = SubLFiles.defparameter( "*TEEN*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym106$TEEN_SIGN_ ),
        $list91 ) ), Symbols.symbol_function( $sym107$BUILD_TEEN ) ) );
    $fuzzy$ = SubLFiles.defparameter( "*FUZZY*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym108$FUZZY_SIGN_ ),
        $list91 ) ), Symbols.symbol_function( $sym109$BUILD_FUZZY ) ) );
    $atomic_ten$ = SubLFiles.defparameter( "*ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym92$ATOMIC_TEN_SIGN_ ), $list91 ) ), Symbols.symbol_function( $sym111$BUILD_ATOMIC_TEN ) ) );
    $hyphenated_non_atomic_ten$ = SubLFiles.defparameter( "*HYPHENATED-NON-ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols
        .symbol_function( $sym112$HYPHENATED_NON_ATOMIC_TEN_SIGN_ ), $list91 ) ), Symbols.symbol_function( $sym113$BUILD_HYPHENATED_NON_ATOMIC_TEN ) ) );
    $non_atomic_ten$ = SubLFiles.defparameter( "*NON-ATOMIC-TEN*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym92$ATOMIC_TEN_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym116$DECI_SIGN_ ), $list93 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym114$HYPHEN_SIGN_ ),
            $list117 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym116$DECI_SIGN_ ), $list93 ) ), Symbols.symbol_function( $sym118$BUILD_NON_ATOMIC_TEN ) ) );
    $cent$ = SubLFiles.defparameter( "*CENT*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym116$DECI_SIGN_ ),
        $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym106$TEEN_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym108$FUZZY_SIGN_ ), $list91 ), ConsesLow.listS(
            ZERO_INTEGER, Symbols.symbol_function( $sym92$ATOMIC_TEN_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym119$NON_ATOMIC_TEN_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER,
                Symbols.symbol_function( $sym103$NUMBER_STRING_SIGN_ ), $list91 ) ), Symbols.symbol_function( $sym120$BUILD_CENT ) ) );
    $standard_hundred$ = SubLFiles.defparameter( "*STANDARD-HUNDRED*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( new SubLObject[] { ConsesLow.listS( ZERO_INTEGER,
        Symbols.symbol_function( $sym116$DECI_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym122$INDEFINITE_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function(
            $sym123$HUNDRED_LITERAL_ ), $list117 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list93 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ),
                $list126 ), $list127, ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list128 ), ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym129$FRACTION_SIGN_ ),
                    $list128 ), ConsesLow.listS( SIX_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ), $list93 )
    } ), Symbols.symbol_function( $sym130$BUILD_STANDARD_HUNDRED ) ) );
    $a_few$ = SubLFiles.defparameter( "*A-FEW*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym122$INDEFINITE_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym132$FEW_LITERAL_ ), $list93 ) ), Symbols.symbol_function( $sym133$BUILD_A_FEW ) ) );
    $extended_hundred$ = SubLFiles.defparameter( "*EXTENDED-HUNDRED*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( new SubLObject[] { ConsesLow.listS( ZERO_INTEGER,
        Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym122$INDEFINITE_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function(
            $sym123$HUNDRED_LITERAL_ ), $list117 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list93 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ),
                $list126 ), $list127, ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list128 ), ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ), $list134 ),
      ConsesLow.listS( SIX_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list93 )
    } ), Symbols.symbol_function( $sym135$BUILD_EXTENDED_HUNDRED ) ) );
    $standard_dozen$ = SubLFiles.defparameter( "*STANDARD-DOZEN*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym116$DECI_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym122$INDEFINITE_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym136$DOZEN_LITERAL_ ),
            $list93 ) ), Symbols.symbol_function( $sym137$BUILD_STANDARD_DOZEN ) ) );
    $extended_dozen$ = SubLFiles.defparameter( "*EXTENDED-DOZEN*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym124$CENT_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym122$INDEFINITE_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym136$DOZEN_LITERAL_ ),
            $list93 ) ), Symbols.symbol_function( $sym138$BUILD_EXTENDED_DOZEN ) ) );
    $kilo$ = SubLFiles.defparameter( "*KILO*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ),
        $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym139$STANDARD_HUNDRED_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym140$EXTENDED_HUNDRED_SIGN_ ), $list91 ),
        ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym141$FLOAT_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym103$NUMBER_STRING_SIGN_ ), $list91 ) ), Symbols
            .symbol_function( $sym142$BUILD_KILO ) ) );
    $thousand$ = SubLFiles.defparameter( "*THOUSAND*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( new SubLObject[] { ConsesLow.listS( ZERO_INTEGER, Symbols
        .symbol_function( $sym144$KILO_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym122$INDEFINITE_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function(
            $sym145$THOUSAND_LITERAL_ ), $list117 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym144$KILO_SIGN_ ), $list93 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ),
                $list126 ), $list127, ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list128 ), ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ), $list134 ),
      ConsesLow.listS( SIX_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list93 )
    } ), Symbols.symbol_function( $sym146$BUILD_THOUSAND ) ) );
    $milli$ = SubLFiles.defparameter( "*MILLI*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym144$KILO_SIGN_ ),
        $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym147$THOUSAND_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym103$NUMBER_STRING_SIGN_ ), $list91 ) ), Symbols
            .symbol_function( $sym148$BUILD_MILLI ) ) );
    $million$ = SubLFiles.defparameter( "*MILLION*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( new SubLObject[] { ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym150$MILLI_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym122$INDEFINITE_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym151$MILLION_LITERAL_ ),
            $list117 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym150$MILLI_SIGN_ ), $list93 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ), $list126 ), $list127,
      ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list128 ), ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ), $list134 ), ConsesLow.listS( SIX_INTEGER, Symbols
          .symbol_function( $sym124$CENT_SIGN_ ), $list93 )
    } ), Symbols.symbol_function( $sym152$BUILD_MILLION ) ) );
    $billi$ = SubLFiles.defparameter( "*BILLI*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym150$MILLI_SIGN_ ),
        $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym153$MILLION_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym103$NUMBER_STRING_SIGN_ ), $list91 ) ), Symbols
            .symbol_function( $sym154$BUILD_BILLI ) ) );
    $billion$ = SubLFiles.defparameter( "*BILLION*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( new SubLObject[] { ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym156$BILLI_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym122$INDEFINITE_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym157$BILLION_LITERAL_ ),
            $list117 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym156$BILLI_SIGN_ ), $list93 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ), $list126 ), $list127,
      ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list128 ), ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ), $list134 ), ConsesLow.listS( SIX_INTEGER, Symbols
          .symbol_function( $sym124$CENT_SIGN_ ), $list93 )
    } ), Symbols.symbol_function( $sym158$BUILD_BILLION ) ) );
    $trilli$ = SubLFiles.defparameter( "*TRILLI*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym156$BILLI_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym159$BILLION_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym103$NUMBER_STRING_SIGN_ ),
            $list91 ) ), Symbols.symbol_function( $sym160$BUILD_TRILLI ) ) );
    $trillion$ = SubLFiles.defparameter( "*TRILLION*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( new SubLObject[] { ConsesLow.listS( ZERO_INTEGER, Symbols
        .symbol_function( $sym162$TRILLI_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym122$INDEFINITE_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function(
            $sym163$TRILLION_LITERAL_ ), $list117 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym162$TRILLI_SIGN_ ), $list93 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ),
                $list126 ), $list127, ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list128 ), ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym125$SIGN_P ), $list134 ),
      ConsesLow.listS( SIX_INTEGER, Symbols.symbol_function( $sym124$CENT_SIGN_ ), $list93 )
    } ), Symbols.symbol_function( $sym164$BUILD_TRILLION ) ) );
    $integer$ = SubLFiles.defparameter( "*INTEGER*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym162$TRILLI_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym165$TRILLION_SIGN_ ), $list91 ) ), Symbols.symbol_function( $sym166$BUILD_INTEGER ) ) );
    $number$ = SubLFiles.defparameter( "*NUMBER*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym167$INTEGER_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym141$FLOAT_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym103$NUMBER_STRING_SIGN_ ),
            $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym129$FRACTION_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym168$STANDARD_DOZEN_SIGN_ ), $list91 ),
        ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym169$EXTENDED_DOZEN_SIGN_ ), $list91 ) ), Symbols.symbol_function( $sym170$BUILD_NUMBER ) ) );
    $fraction$ = SubLFiles.defparameter( "*FRACTION*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym171$NUMBER_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym122$INDEFINITE_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function(
            $sym90$ATOMIC_DENOMINATOR_LITERAL_ ), $list93 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym172$DENOMINATOR_SIGN_ ), $list93 ) ), Symbols.symbol_function( $sym173$BUILD_FRACTION ) ) );
    $half$ = SubLFiles.defparameter( "*HALF*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym175$HALF_SIGN_ ),
        $list91 ) ), Symbols.symbol_function( $sym176$BUILD_HALF ) ) );
    $float$ = SubLFiles.defparameter( "*FLOAT*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list177, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym167$INTEGER_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym121$AND_LITERAL_ ), $list93 ), ConsesLow.listS( TWO_INTEGER, Symbols.symbol_function( $sym129$FRACTION_SIGN_ ),
            $list117 ) ), Symbols.symbol_function( $sym178$BUILD_FLOAT ) ) );
    $negative_number_string$ = SubLFiles.defparameter( "*NEGATIVE-NUMBER-STRING*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols
        .symbol_function( $sym179$MINUS_LITERAL_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym171$NUMBER_SIGN_ ), $list93 ) ), Symbols.symbol_function( $sym180$BUILD_NEGATIVE_NUMBER ) ) );
    $proper_interval$ = SubLFiles.defparameter( "*PROPER-INTERVAL*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list185, ConsesLow.list( new SubLObject[] { ConsesLow.listS( ZERO_INTEGER, Symbols
        .symbol_function( $sym171$NUMBER_SIGN_ ), $list93 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym129$FRACTION_SIGN_ ), $list93 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
            $sym186$FROM_LITERAL_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym187$BETWEEN_LITERAL_ ), $list188 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function(
                $sym171$NUMBER_SIGN_ ), $list93 ), ConsesLow.listS( TWO_INTEGER, Symbols.symbol_function( $sym189$TO_LITERAL_ ), $list117 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function(
                    $sym171$NUMBER_SIGN_ ), $list190 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym129$FRACTION_SIGN_ ), $list190 ), ConsesLow.listS( FIVE_INTEGER, Symbols.symbol_function(
                        $sym171$NUMBER_SIGN_ ), $list191 ), ConsesLow.listS( FIVE_INTEGER, Symbols.symbol_function( $sym129$FRACTION_SIGN_ ), $list191 ), ConsesLow.listS( SIX_INTEGER, Symbols.symbol_function(
                            $sym121$AND_LITERAL_ ), $list192 ), ConsesLow.listS( SEVEN_INTEGER, Symbols.symbol_function( $sym171$NUMBER_SIGN_ ), $list190 ), ConsesLow.listS( SEVEN_INTEGER, Symbols.symbol_function(
                                $sym129$FRACTION_SIGN_ ), $list190 )
    } ), Symbols.symbol_function( $sym193$BUILD_PROPER_INTERVAL ) ) );
    $interval$ = SubLFiles.defparameter( "*INTERVAL*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list89, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym194$PROPER_INTERVAL_SIGN_ ), $list91 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym171$NUMBER_SIGN_ ), $list91 ) ), Symbols.symbol_function( $sym195$BUILD_INTERVAL ) ) );
    $english_interval_parser$ = SubLFiles.defparameter( "*ENGLISH-INTERVAL-PARSER*", finite_state_cascade_parser.new_finite_state_cascade_parser( ConsesLow.list( new SubLObject[] { $zero$.getDynamicValue(), $indefinite$
        .getDynamicValue(), $deci$.getDynamicValue(), $teen$.getDynamicValue(), $fuzzy$.getDynamicValue(), $a_few$.getDynamicValue(), $atomic_ten$.getDynamicValue(), $hyphenated_non_atomic_ten$.getDynamicValue(),
      $denominator$.getDynamicValue(), $non_atomic_ten$.getDynamicValue(), $cent$.getDynamicValue(), $standard_hundred$.getDynamicValue(), $extended_hundred$.getDynamicValue(), $standard_dozen$.getDynamicValue(),
      $extended_dozen$.getDynamicValue(), $kilo$.getDynamicValue(), $thousand$.getDynamicValue(), $milli$.getDynamicValue(), $million$.getDynamicValue(), $billi$.getDynamicValue(), $billion$.getDynamicValue(), $trilli$
          .getDynamicValue(), $trillion$.getDynamicValue(), $integer$.getDynamicValue(), $number$.getDynamicValue(), $fraction$.getDynamicValue(), $half$.getDynamicValue(), $proper_interval$.getDynamicValue(), $float$
              .getDynamicValue(), $kilo$.getDynamicValue(), $thousand$.getDynamicValue(), $milli$.getDynamicValue(), $million$.getDynamicValue(), $billi$.getDynamicValue(), $billion$.getDynamicValue(), $trilli$
                  .getDynamicValue(), $trillion$.getDynamicValue(), $integer$.getDynamicValue(), $number$.getDynamicValue(), $negative_number_string$.getDynamicValue(), $proper_interval$.getDynamicValue(), $interval$
                      .getDynamicValue()
    } ), UNPROVIDED ) );
    $negative_number$ = SubLFiles.defparameter( "*NEGATIVE-NUMBER*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym199$MINUS_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym171$NUMBER_SIGN_ ), $list93 ) ), Symbols.symbol_function( $sym180$BUILD_NEGATIVE_NUMBER ) ) );
    $exponentiation$ = SubLFiles.defparameter( "*EXPONENTIATION*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym171$NUMBER_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym200$EXPT_OPERATOR_SIGN_ ), $list117 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function(
            $sym171$NUMBER_SIGN_ ), $list93 ) ), Symbols.symbol_function( $sym201$BUILD_EXPONENTIATION_PHRASE ) ) );
    $multiplication$ = SubLFiles.defparameter( "*MULTIPLICATION*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list115, ConsesLow.list( ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function(
        $sym171$NUMBER_SIGN_ ), $list91 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym202$MULT_SIGN_ ), $list117 ), ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym203$EXPONENTIATION_SIGN_ ),
            $list93 ) ), Symbols.symbol_function( $sym204$BUILD_MULTIPLICATION_PHRASE ) ) );
    $digit_interval_parser$ = SubLFiles.defparameter( "*DIGIT-INTERVAL-PARSER*", finite_state_cascade_parser.new_finite_state_cascade_parser( ConsesLow.list( $negative_number$.getDynamicValue(), $exponentiation$
        .getDynamicValue(), $multiplication$.getDynamicValue(), $interval$.getDynamicValue() ), $sym205$LEX_NUMERALS ) );
    $string_to_interval_cached_caching_state$ = SubLFiles.deflexical( "*STRING-TO-INTERVAL-CACHED-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_numeral_parser_file()
  {
    memoization_state.note_globally_cached_function( $sym206$STRING_TO_INTERVAL_CACHED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_numeral_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_numeral_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_numeral_parser_file();
  }
  public static final SubLFile me = new numeral_parser();
  public static final String myName = "com.cyc.cycjava.cycl.numeral_parser";
  public static final String myFingerPrint = "51ab259000ee60d1c803f220566e9bce56b798e2dabc14202a1184857d3b8503";
  private static SubLSymbol $null$ = null;
  private static SubLSymbol $a$ = null;
  private static SubLSymbol $digits$ = null;
  private static SubLSymbol $teens$ = null;
  private static SubLSymbol $fuzzies$ = null;
  private static SubLSymbol $atomic_tens$ = null;
  private static SubLSymbol $onedozen$ = null;
  private static SubLSymbol $onehundred$ = null;
  private static SubLSymbol $onethousand$ = null;
  private static SubLSymbol $onemillion$ = null;
  private static SubLSymbol $onebillion$ = null;
  private static SubLSymbol $onetrillion$ = null;
  private static SubLSymbol $irregular_denominators$ = null;
  private static SubLSymbol $number_values$ = null;
  private static SubLSymbol $denominator$ = null;
  private static SubLSymbol $zero$ = null;
  private static SubLSymbol $indefinite$ = null;
  private static SubLSymbol $deci$ = null;
  private static SubLSymbol $teen$ = null;
  private static SubLSymbol $fuzzy$ = null;
  private static SubLSymbol $atomic_ten$ = null;
  private static SubLSymbol $hyphenated_non_atomic_ten$ = null;
  private static SubLSymbol $non_atomic_ten$ = null;
  private static SubLSymbol $cent$ = null;
  private static SubLSymbol $standard_hundred$ = null;
  private static SubLSymbol $a_few$ = null;
  private static SubLSymbol $extended_hundred$ = null;
  private static SubLSymbol $standard_dozen$ = null;
  private static SubLSymbol $extended_dozen$ = null;
  private static SubLSymbol $kilo$ = null;
  private static SubLSymbol $thousand$ = null;
  private static SubLSymbol $milli$ = null;
  private static SubLSymbol $million$ = null;
  private static SubLSymbol $billi$ = null;
  private static SubLSymbol $billion$ = null;
  private static SubLSymbol $trilli$ = null;
  private static SubLSymbol $trillion$ = null;
  private static SubLSymbol $integer$ = null;
  private static SubLSymbol $number$ = null;
  private static SubLSymbol $fraction$ = null;
  private static SubLSymbol $half$ = null;
  private static SubLSymbol $float$ = null;
  private static SubLSymbol $negative_number_string$ = null;
  public static SubLSymbol $proper_interval$ = null;
  private static SubLSymbol $interval$ = null;
  public static SubLSymbol $english_interval_parser$ = null;
  private static SubLSymbol $negative_number$ = null;
  private static SubLSymbol $exponentiation$ = null;
  private static SubLSymbol $multiplication$ = null;
  public static SubLSymbol $digit_interval_parser$ = null;
  private static SubLSymbol $string_to_interval_cached_caching_state$ = null;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4 = ConsesLow.list( ConsesLow.cons( makeString( "several" ), constant_handles.reader_make_constant_shell( makeString( "Several-Quant" ) ) ) );
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7 = ConsesLow.list( ConsesLow.cons( makeString( "hundred" ), makeInteger( 100 ) ) );
  private static final SubLList $list8 = ConsesLow.list( ConsesLow.cons( makeString( "thousand" ), makeInteger( 1000 ) ) );
  private static final SubLList $list9 = ConsesLow.list( ConsesLow.cons( makeString( "million" ), makeInteger( 0xf4240 ) ) );
  private static final SubLList $list10 = ConsesLow.list( ConsesLow.cons( makeString( "billion" ), makeInteger( 0x3b9aca00 ) ) );
  private static final SubLList $list11 = ConsesLow.list( ConsesLow.cons( makeString( "trillion" ), makeInteger( "1000000000000" ) ) );
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$AMERICAN = makeKeyword( "AMERICAN" );
  private static final SubLString $str14$_ = makeString( "," );
  private static final SubLInteger $int15$100 = makeInteger( 100 );
  private static final SubLString $str16$s = makeString( "s" );
  private static final SubLString $str17$th = makeString( "th" );
  private static final SubLString $str18$ths = makeString( "ths" );
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$PLUS = makeKeyword( "PLUS" );
  private static final SubLSymbol $sym21$KEYWORDP = makeSymbol( "KEYWORDP" );
  private static final SubLSymbol $kw22$TIMES = makeKeyword( "TIMES" );
  private static final SubLSymbol $sym23$DIGIT_CHAR_P = makeSymbol( "DIGIT-CHAR-P" );
  private static final SubLObject $const24$PlusFn = constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) );
  private static final SubLObject $const25$TimesFn = constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) );
  private static final SubLSymbol $kw26$DIVIDEDBY = makeKeyword( "DIVIDEDBY" );
  private static final SubLObject $const27$QuotientFn = constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) );
  private static final SubLSymbol $kw28$TOTHE = makeKeyword( "TOTHE" );
  private static final SubLObject $const29$ExponentFn = constant_handles.reader_make_constant_shell( makeString( "ExponentFn" ) );
  private static final SubLString $str30$zero = makeString( "zero" );
  private static final SubLSymbol $kw31$INDEFINITE = makeKeyword( "INDEFINITE" );
  private static final SubLSymbol $sym32$NUMERAL_PARSER_STRING_ = makeSymbol( "NUMERAL-PARSER-STRING=" );
  private static final SubLString $str33$_ = makeString( "-" );
  private static final SubLSymbol $kw34$FUZZY = makeKeyword( "FUZZY" );
  private static final SubLSymbol $kw35$NON_ATOMIC_TEN = makeKeyword( "NON-ATOMIC-TEN" );
  private static final SubLSymbol $kw36$CENT = makeKeyword( "CENT" );
  private static final SubLSymbol $kw37$KILO = makeKeyword( "KILO" );
  private static final SubLSymbol $kw38$FRACTION = makeKeyword( "FRACTION" );
  private static final SubLSymbol $kw39$FLOAT = makeKeyword( "FLOAT" );
  private static final SubLSymbol $kw40$NUMBER = makeKeyword( "NUMBER" );
  private static final SubLSymbol $kw41$INTERVAL = makeKeyword( "INTERVAL" );
  private static final SubLSymbol $kw42$PROPER_INTERVAL = makeKeyword( "PROPER-INTERVAL" );
  private static final SubLSymbol $kw43$MILLI = makeKeyword( "MILLI" );
  private static final SubLSymbol $kw44$BILLI = makeKeyword( "BILLI" );
  private static final SubLSymbol $kw45$TRILLI = makeKeyword( "TRILLI" );
  private static final SubLSymbol $kw46$INTEGER = makeKeyword( "INTEGER" );
  private static final SubLSymbol $kw47$EXTENDED_DOZEN = makeKeyword( "EXTENDED-DOZEN" );
  private static final SubLSymbol $kw48$STANDARD_DOZEN = makeKeyword( "STANDARD-DOZEN" );
  private static final SubLSymbol $kw49$EXTENDED_HUNDRED = makeKeyword( "EXTENDED-HUNDRED" );
  private static final SubLSymbol $kw50$STANDARD_HUNDRED = makeKeyword( "STANDARD-HUNDRED" );
  private static final SubLSymbol $kw51$THOUSAND = makeKeyword( "THOUSAND" );
  private static final SubLSymbol $kw52$MILLION = makeKeyword( "MILLION" );
  private static final SubLSymbol $kw53$BILLION = makeKeyword( "BILLION" );
  private static final SubLSymbol $kw54$TRILLION = makeKeyword( "TRILLION" );
  private static final SubLString $str55$and = makeString( "and" );
  private static final SubLString $str56$dozen = makeString( "dozen" );
  private static final SubLString $str57$few = makeString( "few" );
  private static final SubLString $str58$hundred = makeString( "hundred" );
  private static final SubLString $str59$thousand = makeString( "thousand" );
  private static final SubLString $str60$million = makeString( "million" );
  private static final SubLString $str61$millions = makeString( "millions" );
  private static final SubLString $str62$billions = makeString( "billions" );
  private static final SubLString $str63$billion = makeString( "billion" );
  private static final SubLString $str64$trillions = makeString( "trillions" );
  private static final SubLString $str65$trillion = makeString( "trillion" );
  private static final SubLString $str66$first = makeString( "first" );
  private static final SubLString $str67$second = makeString( "second" );
  private static final SubLString $str68$seconds = makeString( "seconds" );
  private static final SubLString $str69$halves = makeString( "halves" );
  private static final SubLSymbol $sym70$NUMERAL_PARSER_CHAR_ = makeSymbol( "NUMERAL-PARSER-CHAR=" );
  private static final SubLSymbol $kw71$DENOMINATOR = makeKeyword( "DENOMINATOR" );
  private static final SubLString $str72$half = makeString( "half" );
  private static final SubLString $str73$minus = makeString( "minus" );
  private static final SubLString $str74$negative = makeString( "negative" );
  private static final SubLString $str75$to = makeString( "to" );
  private static final SubLString $str76$from = makeString( "from" );
  private static final SubLString $str77$between = makeString( "between" );
  private static final SubLSymbol $kw78$MULT = makeKeyword( "MULT" );
  private static final SubLSymbol $kw79$EXPT = makeKeyword( "EXPT" );
  private static final SubLSymbol $kw80$EXPONENTIATION = makeKeyword( "EXPONENTIATION" );
  private static final SubLString $str81$_ = makeString( "+" );
  private static final SubLString $str82$Can_t_build_a_denominator_out_of_ = makeString( "Can't build a denominator out of nothing!" );
  private static final SubLSymbol $kw83$CATEGORY = makeKeyword( "CATEGORY" );
  private static final SubLSymbol $kw84$INFO = makeKeyword( "INFO" );
  private static final SubLSymbol $kw85$STRING = makeKeyword( "STRING" );
  private static final SubLSymbol $sym86$SIGN_STRING = makeSymbol( "SIGN-STRING" );
  private static final SubLSymbol $kw87$CONSTITUENTS = makeKeyword( "CONSTITUENTS" );
  private static final SubLSymbol $sym88$VECTOR = makeSymbol( "VECTOR" );
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$ATOMIC_DENOMINATOR_LITERAL_ = makeSymbol( "ATOMIC-DENOMINATOR-LITERAL?" );
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$ATOMIC_TEN_SIGN_ = makeSymbol( "ATOMIC-TEN-SIGN?" );
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$DENOMINATOR_LITERAL_ = makeSymbol( "DENOMINATOR-LITERAL?" );
  private static final SubLSymbol $sym95$BUILD_DENOMINATOR = makeSymbol( "BUILD-DENOMINATOR" );
  private static final SubLSymbol $kw96$ZERO = makeKeyword( "ZERO" );
  private static final SubLSymbol $sym97$ZERO_LITERAL_ = makeSymbol( "ZERO-LITERAL?" );
  private static final SubLSymbol $sym98$BUILD_ZERO = makeSymbol( "BUILD-ZERO" );
  private static final SubLSymbol $sym99$INDEFINITE_LITERAL_ = makeSymbol( "INDEFINITE-LITERAL?" );
  private static final SubLSymbol $sym100$BUILD_INDEFINITE = makeSymbol( "BUILD-INDEFINITE" );
  private static final SubLSymbol $kw101$DECI = makeKeyword( "DECI" );
  private static final SubLSymbol $sym102$DIGIT_SIGN_ = makeSymbol( "DIGIT-SIGN?" );
  private static final SubLSymbol $sym103$NUMBER_STRING_SIGN_ = makeSymbol( "NUMBER-STRING-SIGN?" );
  private static final SubLSymbol $sym104$BUILD_DECI = makeSymbol( "BUILD-DECI" );
  private static final SubLSymbol $kw105$TEEN = makeKeyword( "TEEN" );
  private static final SubLSymbol $sym106$TEEN_SIGN_ = makeSymbol( "TEEN-SIGN?" );
  private static final SubLSymbol $sym107$BUILD_TEEN = makeSymbol( "BUILD-TEEN" );
  private static final SubLSymbol $sym108$FUZZY_SIGN_ = makeSymbol( "FUZZY-SIGN?" );
  private static final SubLSymbol $sym109$BUILD_FUZZY = makeSymbol( "BUILD-FUZZY" );
  private static final SubLSymbol $kw110$ATOMIC_TEN = makeKeyword( "ATOMIC-TEN" );
  private static final SubLSymbol $sym111$BUILD_ATOMIC_TEN = makeSymbol( "BUILD-ATOMIC-TEN" );
  private static final SubLSymbol $sym112$HYPHENATED_NON_ATOMIC_TEN_SIGN_ = makeSymbol( "HYPHENATED-NON-ATOMIC-TEN-SIGN?" );
  private static final SubLSymbol $sym113$BUILD_HYPHENATED_NON_ATOMIC_TEN = makeSymbol( "BUILD-HYPHENATED-NON-ATOMIC-TEN" );
  private static final SubLSymbol $sym114$HYPHEN_SIGN_ = makeSymbol( "HYPHEN-SIGN?" );
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$DECI_SIGN_ = makeSymbol( "DECI-SIGN?" );
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$BUILD_NON_ATOMIC_TEN = makeSymbol( "BUILD-NON-ATOMIC-TEN" );
  private static final SubLSymbol $sym119$NON_ATOMIC_TEN_SIGN_ = makeSymbol( "NON-ATOMIC-TEN-SIGN?" );
  private static final SubLSymbol $sym120$BUILD_CENT = makeSymbol( "BUILD-CENT" );
  private static final SubLSymbol $sym121$AND_LITERAL_ = makeSymbol( "AND-LITERAL?" );
  private static final SubLSymbol $sym122$INDEFINITE_SIGN_ = makeSymbol( "INDEFINITE-SIGN?" );
  private static final SubLSymbol $sym123$HUNDRED_LITERAL_ = makeSymbol( "HUNDRED-LITERAL?" );
  private static final SubLSymbol $sym124$CENT_SIGN_ = makeSymbol( "CENT-SIGN?" );
  private static final SubLSymbol $sym125$SIGN_P = makeSymbol( "SIGN-P" );
  private static final SubLList $list126;
  private static final SubLList $list127;
  private static final SubLList $list128;
  private static final SubLSymbol $sym129$FRACTION_SIGN_ = makeSymbol( "FRACTION-SIGN?" );
  private static final SubLSymbol $sym130$BUILD_STANDARD_HUNDRED = makeSymbol( "BUILD-STANDARD-HUNDRED" );
  private static final SubLObject $const131$AFew_Quant = constant_handles.reader_make_constant_shell( makeString( "AFew-Quant" ) );
  private static final SubLSymbol $sym132$FEW_LITERAL_ = makeSymbol( "FEW-LITERAL?" );
  private static final SubLSymbol $sym133$BUILD_A_FEW = makeSymbol( "BUILD-A-FEW" );
  private static final SubLList $list134;
  private static final SubLSymbol $sym135$BUILD_EXTENDED_HUNDRED = makeSymbol( "BUILD-EXTENDED-HUNDRED" );
  private static final SubLSymbol $sym136$DOZEN_LITERAL_ = makeSymbol( "DOZEN-LITERAL?" );
  private static final SubLSymbol $sym137$BUILD_STANDARD_DOZEN = makeSymbol( "BUILD-STANDARD-DOZEN" );
  private static final SubLSymbol $sym138$BUILD_EXTENDED_DOZEN = makeSymbol( "BUILD-EXTENDED-DOZEN" );
  private static final SubLSymbol $sym139$STANDARD_HUNDRED_SIGN_ = makeSymbol( "STANDARD-HUNDRED-SIGN?" );
  private static final SubLSymbol $sym140$EXTENDED_HUNDRED_SIGN_ = makeSymbol( "EXTENDED-HUNDRED-SIGN?" );
  private static final SubLSymbol $sym141$FLOAT_SIGN_ = makeSymbol( "FLOAT-SIGN?" );
  private static final SubLSymbol $sym142$BUILD_KILO = makeSymbol( "BUILD-KILO" );
  private static final SubLInteger $int143$1000 = makeInteger( 1000 );
  private static final SubLSymbol $sym144$KILO_SIGN_ = makeSymbol( "KILO-SIGN?" );
  private static final SubLSymbol $sym145$THOUSAND_LITERAL_ = makeSymbol( "THOUSAND-LITERAL?" );
  private static final SubLSymbol $sym146$BUILD_THOUSAND = makeSymbol( "BUILD-THOUSAND" );
  private static final SubLSymbol $sym147$THOUSAND_SIGN_ = makeSymbol( "THOUSAND-SIGN?" );
  private static final SubLSymbol $sym148$BUILD_MILLI = makeSymbol( "BUILD-MILLI" );
  private static final SubLInteger $int149$1000000 = makeInteger( 0xf4240 );
  private static final SubLSymbol $sym150$MILLI_SIGN_ = makeSymbol( "MILLI-SIGN?" );
  private static final SubLSymbol $sym151$MILLION_LITERAL_ = makeSymbol( "MILLION-LITERAL?" );
  private static final SubLSymbol $sym152$BUILD_MILLION = makeSymbol( "BUILD-MILLION" );
  private static final SubLSymbol $sym153$MILLION_SIGN_ = makeSymbol( "MILLION-SIGN?" );
  private static final SubLSymbol $sym154$BUILD_BILLI = makeSymbol( "BUILD-BILLI" );
  private static final SubLInteger $int155$1000000000 = makeInteger( 0x3b9aca00 );
  private static final SubLSymbol $sym156$BILLI_SIGN_ = makeSymbol( "BILLI-SIGN?" );
  private static final SubLSymbol $sym157$BILLION_LITERAL_ = makeSymbol( "BILLION-LITERAL?" );
  private static final SubLSymbol $sym158$BUILD_BILLION = makeSymbol( "BUILD-BILLION" );
  private static final SubLSymbol $sym159$BILLION_SIGN_ = makeSymbol( "BILLION-SIGN?" );
  private static final SubLSymbol $sym160$BUILD_TRILLI = makeSymbol( "BUILD-TRILLI" );
  private static final SubLInteger $int161$1000000000000 = makeInteger( "1000000000000" );
  private static final SubLSymbol $sym162$TRILLI_SIGN_ = makeSymbol( "TRILLI-SIGN?" );
  private static final SubLSymbol $sym163$TRILLION_LITERAL_ = makeSymbol( "TRILLION-LITERAL?" );
  private static final SubLSymbol $sym164$BUILD_TRILLION = makeSymbol( "BUILD-TRILLION" );
  private static final SubLSymbol $sym165$TRILLION_SIGN_ = makeSymbol( "TRILLION-SIGN?" );
  private static final SubLSymbol $sym166$BUILD_INTEGER = makeSymbol( "BUILD-INTEGER" );
  private static final SubLSymbol $sym167$INTEGER_SIGN_ = makeSymbol( "INTEGER-SIGN?" );
  private static final SubLSymbol $sym168$STANDARD_DOZEN_SIGN_ = makeSymbol( "STANDARD-DOZEN-SIGN?" );
  private static final SubLSymbol $sym169$EXTENDED_DOZEN_SIGN_ = makeSymbol( "EXTENDED-DOZEN-SIGN?" );
  private static final SubLSymbol $sym170$BUILD_NUMBER = makeSymbol( "BUILD-NUMBER" );
  private static final SubLSymbol $sym171$NUMBER_SIGN_ = makeSymbol( "NUMBER-SIGN?" );
  private static final SubLSymbol $sym172$DENOMINATOR_SIGN_ = makeSymbol( "DENOMINATOR-SIGN?" );
  private static final SubLSymbol $sym173$BUILD_FRACTION = makeSymbol( "BUILD-FRACTION" );
  private static final SubLFloat $float174$0_5 = makeDouble( 0.5D );
  private static final SubLSymbol $sym175$HALF_SIGN_ = makeSymbol( "HALF-SIGN?" );
  private static final SubLSymbol $sym176$BUILD_HALF = makeSymbol( "BUILD-HALF" );
  private static final SubLList $list177;
  private static final SubLSymbol $sym178$BUILD_FLOAT = makeSymbol( "BUILD-FLOAT" );
  private static final SubLSymbol $sym179$MINUS_LITERAL_ = makeSymbol( "MINUS-LITERAL?" );
  private static final SubLSymbol $sym180$BUILD_NEGATIVE_NUMBER = makeSymbol( "BUILD-NEGATIVE-NUMBER" );
  private static final SubLObject $const181$Unity = constant_handles.reader_make_constant_shell( makeString( "Unity" ) );
  private static final SubLSymbol $sym182$NULL = makeSymbol( "NULL" );
  private static final SubLSymbol $sym183$SIGN_INFO = makeSymbol( "SIGN-INFO" );
  private static final SubLSymbol $sym184$_ = makeSymbol( "<" );
  private static final SubLList $list185;
  private static final SubLSymbol $sym186$FROM_LITERAL_ = makeSymbol( "FROM-LITERAL?" );
  private static final SubLSymbol $sym187$BETWEEN_LITERAL_ = makeSymbol( "BETWEEN-LITERAL?" );
  private static final SubLList $list188;
  private static final SubLSymbol $sym189$TO_LITERAL_ = makeSymbol( "TO-LITERAL?" );
  private static final SubLList $list190;
  private static final SubLList $list191;
  private static final SubLList $list192;
  private static final SubLSymbol $sym193$BUILD_PROPER_INTERVAL = makeSymbol( "BUILD-PROPER-INTERVAL" );
  private static final SubLSymbol $sym194$PROPER_INTERVAL_SIGN_ = makeSymbol( "PROPER-INTERVAL-SIGN?" );
  private static final SubLSymbol $sym195$BUILD_INTERVAL = makeSymbol( "BUILD-INTERVAL" );
  private static final SubLSymbol $sym196$SEQUENCEP = makeSymbol( "SEQUENCEP" );
  private static final SubLString $str197$_ = makeString( "*" );
  private static final SubLString $str198$_ = makeString( "^" );
  private static final SubLSymbol $sym199$MINUS_SIGN_ = makeSymbol( "MINUS-SIGN?" );
  private static final SubLSymbol $sym200$EXPT_OPERATOR_SIGN_ = makeSymbol( "EXPT-OPERATOR-SIGN?" );
  private static final SubLSymbol $sym201$BUILD_EXPONENTIATION_PHRASE = makeSymbol( "BUILD-EXPONENTIATION-PHRASE" );
  private static final SubLSymbol $sym202$MULT_SIGN_ = makeSymbol( "MULT-SIGN?" );
  private static final SubLSymbol $sym203$EXPONENTIATION_SIGN_ = makeSymbol( "EXPONENTIATION-SIGN?" );
  private static final SubLSymbol $sym204$BUILD_MULTIPLICATION_PHRASE = makeSymbol( "BUILD-MULTIPLICATION-PHRASE" );
  private static final SubLSymbol $sym205$LEX_NUMERALS = makeSymbol( "LEX-NUMERALS" );
  private static final SubLSymbol $sym206$STRING_TO_INTERVAL_CACHED = makeSymbol( "STRING-TO-INTERVAL-CACHED" );
  private static final SubLSymbol $sym207$STRINGP = makeSymbol( "STRINGP" );
  private static final SubLSymbol $kw208$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
  private static final SubLSymbol $sym209$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
  private static final SubLSymbol $sym210$_STRING_TO_INTERVAL_CACHED_CACHING_STATE_ = makeSymbol( "*STRING-TO-INTERVAL-CACHED-CACHING-STATE*" );
  private static final SubLInteger $int211$256 = makeInteger( 256 );
  // static final boolean assertionsDisabledInClass =
  // !com/cyc/cycjava/cycl/desiredAssertionStatus();
  static
  {
    $list0 = ConsesLow.list( ConsesLow.cons( makeString( "zero" ), ZERO_INTEGER ) );
    $list1 = ConsesLow.list( ConsesLow.cons( makeString( "a" ), ONE_INTEGER ) );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeString( "one" ), ONE_INTEGER ), ConsesLow.cons( makeString( "two" ), TWO_INTEGER ), ConsesLow.cons( makeString( "three" ), THREE_INTEGER ), ConsesLow
        .cons( makeString( "four" ), FOUR_INTEGER ), ConsesLow.cons( makeString( "five" ), FIVE_INTEGER ), ConsesLow.cons( makeString( "six" ), SIX_INTEGER ), ConsesLow.cons( makeString( "seven" ), SEVEN_INTEGER ),
      ConsesLow.cons( makeString( "eight" ), EIGHT_INTEGER ), ConsesLow.cons( makeString( "nine" ), NINE_INTEGER )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeString( "ten" ), TEN_INTEGER ), ConsesLow.cons( makeString( "eleven" ), ELEVEN_INTEGER ), ConsesLow.cons( makeString( "twelve" ), TWELVE_INTEGER ),
      ConsesLow.cons( makeString( "thirteen" ), THIRTEEN_INTEGER ), ConsesLow.cons( makeString( "fourteen" ), FOURTEEN_INTEGER ), ConsesLow.cons( makeString( "fifteen" ), FIFTEEN_INTEGER ), ConsesLow.cons( makeString(
          "sixteen" ), SIXTEEN_INTEGER ), ConsesLow.cons( makeString( "seventeen" ), SEVENTEEN_INTEGER ), ConsesLow.cons( makeString( "eighteen" ), EIGHTEEN_INTEGER ), ConsesLow.cons( makeString( "nineteen" ),
              NINETEEN_INTEGER )
    } );
    $list5 = ConsesLow.list( ConsesLow.cons( makeString( "twenty" ), TWENTY_INTEGER ), ConsesLow.cons( makeString( "thirty" ), makeInteger( 30 ) ), ConsesLow.cons( makeString( "forty" ), makeInteger( 40 ) ), ConsesLow
        .cons( makeString( "fifty" ), makeInteger( 50 ) ), ConsesLow.cons( makeString( "sixty" ), makeInteger( 60 ) ), ConsesLow.cons( makeString( "seventy" ), makeInteger( 70 ) ), ConsesLow.cons( makeString( "eighty" ),
            makeInteger( 80 ) ), ConsesLow.cons( makeString( "ninety" ), makeInteger( 90 ) ) );
    $list6 = ConsesLow.list( ConsesLow.cons( makeString( "dozen" ), TWELVE_INTEGER ) );
    $list12 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeString( "first" ), ONE_INTEGER ), ConsesLow.cons( makeString( "second" ), TWO_INTEGER ), ConsesLow.cons( makeString( "half" ), TWO_INTEGER ), ConsesLow
        .cons( makeString( "halves" ), TWO_INTEGER ), ConsesLow.cons( makeString( "third" ), THREE_INTEGER ), ConsesLow.cons( makeString( "quarter" ), FOUR_INTEGER ), ConsesLow.cons( makeString( "fifth" ),
            FIVE_INTEGER ), ConsesLow.cons( makeString( "eighth" ), EIGHT_INTEGER ), ConsesLow.cons( makeString( "twelfth" ), TWELVE_INTEGER ), ConsesLow.cons( makeString( "twelvth" ), TWELVE_INTEGER ), ConsesLow.cons(
                makeString( "twentieth" ), TWENTY_INTEGER ), ConsesLow.cons( makeString( "thirtieth" ), makeInteger( 30 ) ), ConsesLow.cons( makeString( "fortieth" ), makeInteger( 40 ) ), ConsesLow.cons( makeString(
                    "fiftieth" ), makeInteger( 50 ) ), ConsesLow.cons( makeString( "sixtieth" ), makeInteger( 60 ) ), ConsesLow.cons( makeString( "seventieth" ), makeInteger( 70 ) ), ConsesLow.cons( makeString(
                        "eightieth" ), makeInteger( 80 ) ), ConsesLow.cons( makeString( "ninetieth" ), makeInteger( 90 ) )
    } );
    $list19 = ConsesLow.list( Characters.CHAR_hyphen );
    $list89 = ConsesLow.list( ONE_INTEGER );
    $list91 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), ONE_INTEGER );
    $list93 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), TWO_INTEGER );
    $list115 = ConsesLow.list( TWO_INTEGER );
    $list117 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), THREE_INTEGER );
    $list126 = ConsesLow.list( ConsesLow.list( makeKeyword( "REMEMBER" ), makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $list127 = ConsesLow.list( THREE_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list128 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), FIVE_INTEGER );
    $list134 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $list177 = ConsesLow.list( THREE_INTEGER );
    $list185 = ConsesLow.list( FOUR_INTEGER );
    $list188 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), FIVE_INTEGER );
    $list190 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), FOUR_INTEGER );
    $list191 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), SIX_INTEGER );
    $list192 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), SEVEN_INTEGER );
  }
}
