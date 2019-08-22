package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mathml
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.mathml";
  public static final String myFingerPrint = "1abbbb5ccd16a45db8574d36464824fb4dc1e23657eb4469e8dffe84a6723332";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 910L)
  public static SubLSymbol $mathml_namespace$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 990L)
  private static SubLSymbol $mathml_stacked$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1074L)
  public static SubLSymbol $mathml_heavy_operatorsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1748L)
  private static SubLSymbol $mathml_atom_map$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3406L)
  private static SubLSymbol $html_glyph_code_for_denot_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3704L)
  private static SubLSymbol $serializable_units_of_measure_mathml_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3852L)
  private static SubLSymbol $strike_and_replace_mathml_numerator_with$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3923L)
  private static SubLSymbol $strike_and_replace_mathml_denominator_with$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18904L)
  private static SubLSymbol $mathml_demo_items$;
  private static final SubLString $str0$http___www_w3_org_1998_Math_MathM;
  private static final SubLSymbol $sym1$XML_TAG;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$XML_ELEMENT;
  private static final SubLString $str4$mrow;
  private static final SubLSymbol $sym5$PIF;
  private static final SubLSymbol $sym6$_MATHML_STACKED_;
  private static final SubLSymbol $sym7$PROGN;
  private static final SubLSymbol $sym8$CLET;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLString $str11$math;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLString $str15$mo;
  private static final SubLString $str16$largeop;
  private static final SubLString $str17$true;
  private static final SubLString $str18$false;
  private static final SubLString $str19$mathvariant;
  private static final SubLString $str20$bold;
  private static final SubLString $str21$normal;
  private static final SubLSymbol $kw22$UNINITIALIZED;
  private static final SubLObject $const23$Pi_Number;
  private static final SubLString $str24$mi;
  private static final SubLString $str25$_pi_;
  private static final SubLObject $const26$TimeOfDay_PM;
  private static final SubLString $str27$PM;
  private static final SubLObject $const28$TimeOfDay_AM;
  private static final SubLString $str29$AM;
  private static final SubLSymbol $kw30$SPACE;
  private static final SubLString $str31$_;
  private static final SubLString $str32$_A;
  private static final SubLSymbol $sym33$HTML_GLYPH_CODE_FOR_DENOT;
  private static final SubLObject $const34$htmlGlyphCode;
  private static final SubLObject $const35$symbolDenotes;
  private static final SubLSymbol $sym36$_HTML_GLYPH_CODE_FOR_DENOT_CACHING_STATE_;
  private static final SubLSymbol $sym37$CLEAR_HTML_GLYPH_CODE_FOR_DENOT;
  private static final SubLSymbol $sym38$SERIALIZABLE_UNITS_OF_MEASURE_MATHML;
  private static final SubLObject $const39$CompoundDurationFn;
  private static final SubLObject $const40$UnitOfMeasure;
  private static final SubLSymbol $sym41$_SERIALIZABLE_UNITS_OF_MEASURE_MATHML_CACHING_STATE_;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLObject $const45$singular;
  private static final SubLObject $const46$plural;
  private static final SubLString $str47$mspace;
  private static final SubLString $str48$width;
  private static final SubLString $str49$_5em;
  private static final SubLList $list50;
  private static final SubLObject $const51$MathQuantFn;
  private static final SubLObject $const52$MathLongDivisionStatementFn;
  private static final SubLObject $const53$MathVarFn;
  private static final SubLObject $const54$ParenthesizedMathFn;
  private static final SubLString $str55$mfenced;
  private static final SubLObject $const56$BracketedMathFn;
  private static final SubLList $list57;
  private static final SubLObject $const58$PowerExpressionFn;
  private static final SubLString $str59$msup;
  private static final SubLObject $const60$PrefixMinusFn;
  private static final SubLObject $const61$AbsoluteValueExpressionFn;
  private static final SubLString $str62$_;
  private static final SubLObject $const63$PaddedExpressionFn;
  private static final SubLString $str64$msgroup;
  private static final SubLString $str65$position;
  private static final SubLObject $const66$MathExpressionFn;
  private static final SubLObject $const67$HorizontalDivideFn;
  private static final SubLString $str68$mfrac;
  private static final SubLObject $const69$NthRootExpressionFn;
  private static final SubLList $list70;
  private static final SubLString $str71$msqrt;
  private static final SubLString $str72$mroot;
  private static final SubLObject $const73$MixedFractionFn;
  private static final SubLString $str74$mn;
  private static final SubLObject $const75$NegativeMixedFractionFn;
  private static final SubLObject $const76$SimpleFractionFn;
  private static final SubLObject $const77$DecimalFractionFn;
  private static final SubLObject $const78$StrikeNumeratorAndReplaceWithFn;
  private static final SubLObject $const79$StrikeDenominatorAndReplaceWithFn;
  private static final SubLObject $const80$InfixSlashDivideFn;
  private static final SubLList $list81;
  private static final SubLObject $const82$FunctionOfVarsFn;
  private static final SubLString $str83$_;
  private static final SubLString $str84$_;
  private static final SubLString $str85$_;
  private static final SubLObject $const86$TimeExpressionFn;
  private static final SubLString $str87$_;
  private static final SubLString $str88$_2__0d;
  private static final SubLSymbol $sym89$GENERATE_PHRASE;
  private static final SubLObject $const90$MathStackedEqualsStatementFn;
  private static final SubLSymbol $kw91$IGNORE;
  private static final SubLString $str92$msline;
  private static final SubLString $str93$mstack;
  private static final SubLObject $const94$InsertNumberAtDigitsFn;
  private static final SubLObject $const95$StrikeAndReplaceDigitsFn;
  private static final SubLString $str96$Can_t_serialize__S_expressions_;
  private static final SubLList $list97;
  private static final SubLString $str98$Can_t_compute_digit_count_of__A;
  private static final SubLList $list99;
  private static final SubLString $str100$menclose;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLString $str103$notation;
  private static final SubLString $str104$updiagonalstrike;
  private static final SubLObject $const105$StackedAdditionExpressionFn;
  private static final SubLObject $const106$InfixPlusFn;
  private static final SubLObject $const107$StackedMultiplicationExpressionFn;
  private static final SubLObject $const108$InfixTimesFn;
  private static final SubLObject $const109$StackedSubtractionExpressionFn;
  private static final SubLObject $const110$InfixMinusFn;
  private static final SubLString $str111$Unable_to_serialize_simple_stacke;
  private static final SubLString $str112$msrow;
  private static final SubLList $list113;
  private static final SubLString $str114$mscarries;
  private static final SubLString $str115$none;
  private static final SubLList $list116;
  private static final SubLString $str117$mscarry;
  private static final SubLList $list118;
  private static final SubLString $str119$mlongdiv;
  private static final SubLList $list120;
  private static final SubLList $list121;
  private static final SubLList $list122;
  private static final SubLString $str123$length;
  private static final SubLObject $list124;
  private static final SubLSymbol $sym125$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const126$EverythingPSC;
  private static final SubLObject $const127$mathExpressionNATRenderAs;
  private static final SubLSymbol $kw128$GAF;
  private static final SubLList $list129;
  private static final SubLString $str130$background_color__;
  private static final SubLString $str131$CycL;
  private static final SubLString $str132$HTML;
  private static final SubLString $str133$MathML;
  private static final SubLInteger $int134$32;
  private static final SubLSymbol $sym135$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym136$SERIALIZE_MATHML_TO_STRING;
  private static final SubLSymbol $kw137$TEST;
  private static final SubLSymbol $kw138$OWNER;
  private static final SubLSymbol $kw139$CLASSES;
  private static final SubLSymbol $kw140$KB;
  private static final SubLSymbol $kw141$FULL;
  private static final SubLSymbol $kw142$WORKING_;
  private static final SubLList $list143;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1192L)
  public static SubLObject serializing_mathml(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$XML_TAG, $list2, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1341L)
  public static SubLObject mathml_row(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym3$XML_ELEMENT, $str4$mrow, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1427L)
  public static SubLObject with_stacked_math(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym5$PIF, $sym6$_MATHML_STACKED_, reader.bq_cons( $sym7$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym8$CLET, $list9, ConsesLow.list( $sym1$XML_TAG, $list10, reader.bq_cons(
        $sym7$PROGN, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1625L)
  public static SubLObject serialize_mathml(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str11$math, $list12, NIL, NIL, $mathml_namespace$.getGlobalValue() );
        final SubLObject _prev_bind_0_$1 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $mathml_namespace$.getGlobalValue(), thread );
          xml_utilities.xml_terpri();
          serialize_mathml_int( obj );
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str11$math );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2638L)
  public static SubLObject lookup_mathml_atom(final SubLObject obj)
  {
    return list_utilities.alist_lookup( $mathml_atom_map$.getGlobalValue(), obj, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2726L)
  public static SubLObject serialize_mathml_atom(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject data = lookup_mathml_atom( obj );
    if( NIL != data )
    {
      SubLObject current;
      final SubLObject datum = current = data;
      SubLObject markup = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
      markup = current.first();
      current = current.rest();
      final SubLObject comment = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list14 );
      current = current.rest();
      if( NIL == current )
      {
        try
        {
          final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str15$mo, ConsesLow.list( $str16$largeop, ( NIL != $mathml_heavy_operatorsP$.getDynamicValue( thread ) ) ? $str17$true : $str18$false, $str19$mathvariant,
                ( NIL != $mathml_heavy_operatorsP$.getDynamicValue( thread ) ) ? $str20$bold : $str21$normal ), NIL, NIL, $kw22$UNINITIALIZED );
            final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
              xml_utilities.xml_markup( markup );
              if( NIL != comment )
              {
                xml_utilities.xml_comment( comment );
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$2, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str15$mo );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
      }
    }
    else if( $const23$Pi_Number.eql( obj ) )
    {
      try
      {
        final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str24$mi, NIL, NIL, NIL, $kw22$UNINITIALIZED );
          final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
            xml_utilities.xml_markup( $str25$_pi_ );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$3, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          xml_utilities.xml_end_tag_internal( $str24$mi );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
        }
      }
    }
    else if( $const26$TimeOfDay_PM.eql( obj ) )
    {
      xml_utilities.xml_print( $str27$PM, UNPROVIDED );
    }
    else if( $const28$TimeOfDay_AM.eql( obj ) )
    {
      xml_utilities.xml_print( $str29$AM, UNPROVIDED );
    }
    else if( $kw30$SPACE == obj )
    {
      xml_utilities.xml_print( $str31$_, UNPROVIDED );
    }
    else
    {
      PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str32$_A, obj );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3406L)
  public static SubLObject clear_html_glyph_code_for_denot()
  {
    final SubLObject cs = $html_glyph_code_for_denot_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3406L)
  public static SubLObject remove_html_glyph_code_for_denot(final SubLObject obj)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $html_glyph_code_for_denot_caching_state$.getGlobalValue(), ConsesLow.list( obj ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3406L)
  public static SubLObject html_glyph_code_for_denot_internal(final SubLObject obj)
  {
    SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt( obj, $const35$symbolDenotes, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    SubLObject symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject glyph_code = kb_mapping_utilities.fpred_value_in_any_mt( symbol, $const34$htmlGlyphCode, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != glyph_code )
      {
        return glyph_code;
      }
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3406L)
  public static SubLObject html_glyph_code_for_denot(final SubLObject obj)
  {
    SubLObject caching_state = $html_glyph_code_for_denot_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym33$HTML_GLYPH_CODE_FOR_DENOT, $sym36$_HTML_GLYPH_CODE_FOR_DENOT_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym37$CLEAR_HTML_GLYPH_CODE_FOR_DENOT );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( html_glyph_code_for_denot_internal( obj ) ) );
      memoization_state.caching_state_put( caching_state, obj, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3704L)
  public static SubLObject clear_serializable_units_of_measure_mathml()
  {
    final SubLObject cs = $serializable_units_of_measure_mathml_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3704L)
  public static SubLObject remove_serializable_units_of_measure_mathml()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $serializable_units_of_measure_mathml_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3704L)
  public static SubLObject serializable_units_of_measure_mathml_internal()
  {
    return Sequences.remove( $const39$CompoundDurationFn, isa.all_instances_in_all_mts( $const40$UnitOfMeasure ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3704L)
  public static SubLObject serializable_units_of_measure_mathml()
  {
    SubLObject caching_state = $serializable_units_of_measure_mathml_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym38$SERIALIZABLE_UNITS_OF_MEASURE_MATHML, $sym41$_SERIALIZABLE_UNITS_OF_MEASURE_MATHML_CACHING_STATE_, NIL, EQL, ZERO_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( serializable_units_of_measure_mathml_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3995L)
  public static SubLObject serialize_mathml_int(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != collection_defns.cycl_atomic_term_p( obj ) )
    {
      serialize_mathml_atom( obj );
    }
    else
    {
      final SubLObject arg0 = cycl_utilities.formula_arg0( obj );
      if( NIL != subl_promotions.memberP( arg0, $list42, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject name_var = $str4$mrow;
        xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, UNPROVIDED, UNPROVIDED );
        serialize_mathml_int( cycl_utilities.formula_arg1( obj, UNPROVIDED ) );
        serialize_mathml_int( arg0 );
        serialize_mathml_int( cycl_utilities.formula_arg2( obj, UNPROVIDED ) );
        xml_utilities.xml_end_tag_internal( name_var );
      }
      else if( NIL != subl_promotions.memberP( arg0, $list43, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject name_var = $str4$mrow;
        xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, UNPROVIDED, UNPROVIDED );
        serialize_mathml_int( cycl_utilities.formula_arg1( obj, UNPROVIDED ) );
        SubLObject cdolist_list_var = cycl_utilities.formula_args( obj, UNPROVIDED ).rest();
        SubLObject arg2 = NIL;
        arg2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          serialize_mathml_int( arg0 );
          serialize_mathml_int( arg2 );
          cdolist_list_var = cdolist_list_var.rest();
          arg2 = cdolist_list_var.first();
        }
        xml_utilities.xml_end_tag_internal( name_var );
      }
      else if( NIL != conses_high.member( arg0, $list44, UNPROVIDED, UNPROVIDED ) )
      {
        serialize_mathml_simple_stacked_math_expression( obj );
      }
      else if( NIL != subl_promotions.memberP( narts_high.nart_substitute( arg0 ), serializable_units_of_measure_mathml(), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        final SubLObject name_var = $str4$mrow;
        xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, UNPROVIDED, UNPROVIDED );
        serialize_mathml_quantity( ConsesLow.list( cycl_utilities.formula_arg1( obj, UNPROVIDED ) ) );
        final SubLObject number = cycl_utilities.formula_arg1( obj, UNPROVIDED );
        final SubLObject agr = number.eql( ONE_INTEGER ) ? $const45$singular : $const46$plural;
        final SubLObject unit_string = pph_main.generate_phrase( arg0, ConsesLow.list( agr ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        xml_utilities.xml_start_tag_internal( $str47$mspace, ConsesLow.list( $str48$width, $str49$_5em ), T, UNPROVIDED, UNPROVIDED );
        try
        {
          final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str24$mi, $list50, NIL, NIL, $kw22$UNINITIALIZED );
            final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
              PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), unit_string );
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$4, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str24$mi );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
          }
        }
        xml_utilities.xml_end_tag_internal( name_var );
      }
      else
      {
        final SubLObject pcase_var = arg0;
        if( pcase_var.eql( $const51$MathQuantFn ) )
        {
          serialize_mathml_quantity( cycl_utilities.nat_args( obj, UNPROVIDED ) );
        }
        else if( pcase_var.eql( $const52$MathLongDivisionStatementFn ) )
        {
          serialize_mathml_long_division( obj );
        }
        else if( pcase_var.eql( $const53$MathVarFn ) )
        {
          try
          {
            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str24$mi, NIL, NIL, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$5 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$5, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str24$mi );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
            }
          }
        }
        else if( pcase_var.eql( $const54$ParenthesizedMathFn ) )
        {
          try
          {
            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str55$mfenced, NIL, NIL, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$6 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                final SubLObject name_var2 = $str4$mrow;
                xml_utilities.xml_start_tag_internal( name_var2, NIL, NIL, UNPROVIDED, UNPROVIDED );
                serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
                xml_utilities.xml_end_tag_internal( name_var2 );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$6, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str55$mfenced );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_7, thread );
            }
          }
        }
        else if( pcase_var.eql( $const56$BracketedMathFn ) )
        {
          try
          {
            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str55$mfenced, $list57, NIL, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                final SubLObject name_var2 = $str4$mrow;
                xml_utilities.xml_start_tag_internal( name_var2, NIL, NIL, UNPROVIDED, UNPROVIDED );
                serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
                xml_utilities.xml_end_tag_internal( name_var2 );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$7, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str55$mfenced );
              Values.restoreValuesFromVector( _values4 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_8, thread );
            }
          }
        }
        else if( pcase_var.eql( $const58$PowerExpressionFn ) )
        {
          try
          {
            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str59$msup, NIL, NIL, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
                serialize_mathml_int( cycl_utilities.nat_arg2( obj, UNPROVIDED ) );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$8, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values5 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str59$msup );
              Values.restoreValuesFromVector( _values5 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_9, thread );
            }
          }
        }
        else if( pcase_var.eql( $const60$PrefixMinusFn ) )
        {
          final SubLObject name_var3 = $str4$mrow;
          xml_utilities.xml_start_tag_internal( name_var3, NIL, NIL, UNPROVIDED, UNPROVIDED );
          serialize_mathml_int( arg0 );
          serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
          xml_utilities.xml_end_tag_internal( name_var3 );
        }
        else if( pcase_var.eql( $const61$AbsoluteValueExpressionFn ) )
        {
          try
          {
            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str15$mo, NIL, NIL, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str62$_ );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$9, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values6 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str15$mo );
              Values.restoreValuesFromVector( _values6 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_10, thread );
            }
          }
          serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
          try
          {
            final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str15$mo, NIL, NIL, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str62$_ );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$10, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values7 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str15$mo );
              Values.restoreValuesFromVector( _values7 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_11, thread );
            }
          }
        }
        else if( pcase_var.eql( $const63$PaddedExpressionFn ) )
        {
          final SubLObject position = cycl_utilities.nat_arg2( obj, UNPROVIDED );
          try
          {
            final SubLObject _prev_bind_12 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str64$msgroup, ConsesLow.list( $str65$position, position ), NIL, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$11, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_13, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_12, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values8 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str64$msgroup );
              Values.restoreValuesFromVector( _values8 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_14, thread );
            }
          }
        }
        else
        {
          if( pcase_var.eql( $const66$MathExpressionFn ) )
          {
            return serialize_mathml_int( math_expression_utilities.infix_math_expression_to_prefix_format( obj ) );
          }
          if( pcase_var.eql( $const67$HorizontalDivideFn ) )
          {
            try
            {
              final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str68$mfrac, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
                  serialize_mathml_int( cycl_utilities.nat_arg2( obj, UNPROVIDED ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$12, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values9 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str68$mfrac );
                Values.restoreValuesFromVector( _values9 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_15, thread );
              }
            }
          }
          else if( pcase_var.eql( $const69$NthRootExpressionFn ) )
          {
            if( cycl_utilities.nat_arg1( obj, UNPROVIDED ).equal( $list70 ) )
            {
              try
              {
                final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str71$msqrt, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                    serialize_mathml_int( cycl_utilities.nat_arg2( obj, UNPROVIDED ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$13, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values10 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str71$msqrt );
                  Values.restoreValuesFromVector( _values10 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_16, thread );
                }
              }
            }
            else
            {
              try
              {
                final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str72$mroot, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                    serialize_mathml_int( cycl_utilities.nat_arg2( obj, UNPROVIDED ) );
                    serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$14, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values11 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str72$mroot );
                  Values.restoreValuesFromVector( _values11 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_17, thread );
                }
              }
            }
          }
          else if( pcase_var.eql( $const73$MixedFractionFn ) )
          {
            final SubLObject name_var3 = $str4$mrow;
            xml_utilities.xml_start_tag_internal( name_var3, NIL, NIL, UNPROVIDED, UNPROVIDED );
            try
            {
              final SubLObject _prev_bind_12 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$15, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_13, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_12, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values12 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str74$mn );
                Values.restoreValuesFromVector( _values12 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_18, thread );
              }
            }
            serialize_mathml_simple_fraction( cycl_utilities.nat_arg2( obj, UNPROVIDED ), cycl_utilities.nat_arg3( obj, UNPROVIDED ) );
            xml_utilities.xml_end_tag_internal( name_var3 );
          }
          else if( pcase_var.eql( $const75$NegativeMixedFractionFn ) )
          {
            serialize_mathml_int( el_utilities.make_unary_formula( $const51$MathQuantFn, el_utilities.make_unary_formula( $const60$PrefixMinusFn, el_utilities.make_el_formula( $const73$MixedFractionFn, cycl_utilities
                .nat_args( obj, UNPROVIDED ), UNPROVIDED ) ) ) );
          }
          else if( pcase_var.eql( $const76$SimpleFractionFn ) )
          {
            serialize_mathml_simple_fraction( cycl_utilities.nat_arg1( obj, UNPROVIDED ), cycl_utilities.nat_arg2( obj, UNPROVIDED ) );
          }
          else if( pcase_var.eql( $const77$DecimalFractionFn ) )
          {
            serialize_mathml_decimal( obj );
          }
          else if( pcase_var.eql( $const78$StrikeNumeratorAndReplaceWithFn ) )
          {
            final SubLObject _prev_bind_4 = $strike_and_replace_mathml_numerator_with$.currentBinding( thread );
            try
            {
              $strike_and_replace_mathml_numerator_with$.bind( cycl_utilities.nat_arg2( obj, UNPROVIDED ), thread );
              serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
            }
            finally
            {
              $strike_and_replace_mathml_numerator_with$.rebind( _prev_bind_4, thread );
            }
          }
          else if( pcase_var.eql( $const79$StrikeDenominatorAndReplaceWithFn ) )
          {
            final SubLObject _prev_bind_4 = $strike_and_replace_mathml_denominator_with$.currentBinding( thread );
            try
            {
              $strike_and_replace_mathml_denominator_with$.bind( cycl_utilities.nat_arg2( obj, UNPROVIDED ), thread );
              serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
            }
            finally
            {
              $strike_and_replace_mathml_denominator_with$.rebind( _prev_bind_4, thread );
            }
          }
          else if( pcase_var.eql( $const80$InfixSlashDivideFn ) )
          {
            try
            {
              final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str68$mfrac, $list81, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  serialize_mathml_int( cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
                  serialize_mathml_int( cycl_utilities.nat_arg2( obj, UNPROVIDED ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$16, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values13 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str68$mfrac );
                Values.restoreValuesFromVector( _values13 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_19, thread );
              }
            }
          }
          else if( pcase_var.eql( $const82$FunctionOfVarsFn ) )
          {
            try
            {
              final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str24$mi, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$17 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str32$_A, cycl_utilities.nat_arg1( obj, UNPROVIDED ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$17, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values14 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str24$mi );
                Values.restoreValuesFromVector( _values14 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_20, thread );
              }
            }
            serialize_mathml_int( arg0 );
            try
            {
              final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str15$mo, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  xml_utilities.xml_markup( $str83$_ );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$18, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values15 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str15$mo );
                Values.restoreValuesFromVector( _values15 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_21, thread );
              }
            }
            SubLObject list_var = NIL;
            SubLObject arg2 = NIL;
            SubLObject num = NIL;
            list_var = cycl_utilities.nat_args( obj, UNPROVIDED ).rest();
            arg2 = list_var.first();
            for( num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg2 = list_var.first(), num = Numbers.add( ONE_INTEGER, num ) )
            {
              if( !num.numE( ZERO_INTEGER ) )
              {
                xml_utilities.xml_markup( $str84$_ );
              }
              serialize_mathml_int( arg2 );
            }
            try
            {
              final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str15$mo, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  xml_utilities.xml_markup( $str85$_ );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$19, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values16 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str15$mo );
                Values.restoreValuesFromVector( _values16 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_22, thread );
              }
            }
          }
          else if( pcase_var.eql( $const86$TimeExpressionFn ) )
          {
            serialize_mathml_int( cycl_utilities.formula_arg2( obj, UNPROVIDED ) );
            xml_utilities.xml_print( $str87$_, UNPROVIDED );
            serialize_mathml_int( PrintLow.format( NIL, $str88$_2__0d, cycl_utilities.formula_arg3( obj, UNPROVIDED ) ) );
            if( NIL != cycl_utilities.formula_arg4( obj, UNPROVIDED ) )
            {
              xml_utilities.xml_print( $str87$_, UNPROVIDED );
              serialize_mathml_int( PrintLow.format( NIL, $str88$_2__0d, cycl_utilities.formula_arg4( obj, UNPROVIDED ) ) );
            }
            serialize_mathml_int( cycl_utilities.formula_arg1( obj, UNPROVIDED ) );
          }
          else if( pcase_var.eql( $const39$CompoundDurationFn ) )
          {
            final SubLObject strings = Mapping.mapcar( $sym89$GENERATE_PHRASE, cycl_utilities.formula_args( obj, UNPROVIDED ) );
            try
            {
              final SubLObject _prev_bind_12 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  xml_utilities.xml_markup( string_utilities.join_strings( strings, UNPROVIDED ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$20, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_13, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_12, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values17 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str74$mn );
                Values.restoreValuesFromVector( _values17 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_23, thread );
              }
            }
          }
          else if( pcase_var.eql( $const90$MathStackedEqualsStatementFn ) )
          {
            if( NIL != $mathml_stacked$.getDynamicValue( thread ) )
            {
              SubLObject arg_num = ZERO_INTEGER;
              SubLObject cdolist_list_var2;
              final SubLObject args = cdolist_list_var2 = cycl_utilities.formula_args( obj, $kw91$IGNORE );
              SubLObject arg3 = NIL;
              arg3 = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                arg_num = Numbers.add( arg_num, ONE_INTEGER );
                if( !arg_num.eql( ONE_INTEGER ) )
                {
                  try
                  {
                    final SubLObject _prev_bind_24 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                    final SubLObject _prev_bind_25 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                    try
                    {
                      xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                          thread );
                      xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                      xml_utilities.xml_start_tag_internal( $str92$msline, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                      final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                      try
                      {
                        xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                      }
                      finally
                      {
                        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$21, thread );
                      }
                    }
                    finally
                    {
                      xml_utilities.$cycml_indent_level$.rebind( _prev_bind_25, thread );
                      xml_utilities.$xml_indentation_level$.rebind( _prev_bind_24, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values18 = Values.getValuesAsVector();
                      xml_utilities.xml_terpri();
                      xml_utilities.xml_end_tag_internal( $str92$msline );
                      Values.restoreValuesFromVector( _values18 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_26, thread );
                    }
                  }
                }
                serialize_mathml_int( arg3 );
                cdolist_list_var2 = cdolist_list_var2.rest();
                arg3 = cdolist_list_var2.first();
              }
            }
            else
            {
              final SubLObject _prev_bind_4 = $mathml_stacked$.currentBinding( thread );
              try
              {
                $mathml_stacked$.bind( T, thread );
                try
                {
                  final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_13 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str93$mstack, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                      SubLObject arg_num2 = ZERO_INTEGER;
                      SubLObject cdolist_list_var3;
                      final SubLObject args2 = cdolist_list_var3 = cycl_utilities.formula_args( obj, $kw91$IGNORE );
                      SubLObject arg4 = NIL;
                      arg4 = cdolist_list_var3.first();
                      while ( NIL != cdolist_list_var3)
                      {
                        arg_num2 = Numbers.add( arg_num2, ONE_INTEGER );
                        if( !arg_num2.eql( ONE_INTEGER ) )
                        {
                          try
                          {
                            final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                            try
                            {
                              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                  thread );
                              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                              xml_utilities.xml_start_tag_internal( $str92$msline, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                              final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                              try
                              {
                                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                              }
                              finally
                              {
                                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$25, thread );
                              }
                            }
                            finally
                            {
                              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$25, thread );
                              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$24, thread );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values19 = Values.getValuesAsVector();
                              xml_utilities.xml_terpri();
                              xml_utilities.xml_end_tag_internal( $str92$msline );
                              Values.restoreValuesFromVector( _values19 );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
                            }
                          }
                        }
                        serialize_mathml_int( arg4 );
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        arg4 = cdolist_list_var3.first();
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$23, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_13, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$22, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values20 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str93$mstack );
                    Values.restoreValuesFromVector( _values20 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
                  }
                }
              }
              finally
              {
                $mathml_stacked$.rebind( _prev_bind_4, thread );
              }
            }
          }
          else if( pcase_var.eql( $const94$InsertNumberAtDigitsFn ) )
          {
            serialize_mathml_carries( obj );
          }
          else if( pcase_var.eql( $const95$StrikeAndReplaceDigitsFn ) )
          {
            serialize_mathml_strikethrough( obj );
          }
          else
          {
            Errors.error( $str96$Can_t_serialize__S_expressions_, arg0 );
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9664L)
  public static SubLObject math_expr_digit_count(final SubLObject obj)
  {
    if( obj.isNumber() )
    {
      return Sequences.length( format_nil.format_nil_a( obj ) );
    }
    if( cycl_utilities.formula_arg0( obj ).eql( $const51$MathQuantFn ) && cycl_utilities.formula_arg1( obj, UNPROVIDED ).isNumber() )
    {
      return Sequences.length( format_nil.format_nil_a( cycl_utilities.formula_arg1( obj, UNPROVIDED ) ) );
    }
    if( cycl_utilities.formula_arg0( obj ).eql( $const63$PaddedExpressionFn ) )
    {
      return Numbers.add( Numbers.abs( cycl_utilities.nat_arg2( obj, UNPROVIDED ) ), math_expr_digit_count( cycl_utilities.nat_arg1( obj, UNPROVIDED ) ) );
    }
    if( cycl_utilities.formula_arg0( obj ).eql( $const51$MathQuantFn ) && cycl_utilities.formula_arg0( cycl_utilities.formula_arg1( obj, UNPROVIDED ) ).eql( $const77$DecimalFractionFn ) )
    {
      if( NIL != cycl_utilities.formula_arg( TWO_INTEGER, cycl_utilities.formula_arg1( obj, UNPROVIDED ), UNPROVIDED ) && cycl_utilities.formula_arg( TWO_INTEGER, cycl_utilities.formula_arg1( obj, UNPROVIDED ),
          UNPROVIDED ).numG( ZERO_INTEGER ) )
      {
        return Numbers.add( ONE_INTEGER, math_expr_digit_count( cycl_utilities.formula_arg1( cycl_utilities.formula_arg1( obj, UNPROVIDED ), UNPROVIDED ) ) );
      }
      return math_expr_digit_count( cycl_utilities.formula_arg1( cycl_utilities.formula_arg1( obj, UNPROVIDED ), UNPROVIDED ) );
    }
    else
    {
      if( cycl_utilities.formula_arg0( obj ).eql( $const94$InsertNumberAtDigitsFn ) )
      {
        return math_expr_digit_count( cycl_utilities.formula_arg1( obj, UNPROVIDED ) );
      }
      if( NIL != subl_promotions.memberP( cycl_utilities.formula_arg0( obj ), $list97, EQUAL, UNPROVIDED ) )
      {
        SubLObject max = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( obj, $kw91$IGNORE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject digit_count = math_expr_digit_count( arg );
          max = Numbers.max( max, digit_count );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        return max;
      }
      Errors.error( $str98$Can_t_compute_digit_count_of__A, obj );
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10855L)
  public static SubLObject serialize_mathml_decimal(final SubLObject obj)
  {
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.nat_args( obj, UNPROVIDED );
    SubLObject integer = NIL;
    SubLObject backward_decimal_location = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    integer = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    backward_decimal_location = current.first();
    current = current.rest();
    final SubLObject repeating_count = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list99 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject integer_string = print_high.princ_to_string( integer );
      return ( NIL != repeating_count ) ? serialize_mathml_repeating_decimal( integer_string, backward_decimal_location, repeating_count )
          : serialize_mathml_non_repeating_decimal( integer_string, backward_decimal_location );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list99 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11286L)
  public static SubLObject serialize_mathml_repeating_decimal(final SubLObject integer_string, final SubLObject backward_decimal_location, final SubLObject repeating_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject repeat_start = Numbers.subtract( Sequences.length( integer_string ), repeating_count );
    final SubLObject repeating_string = string_utilities.substring( integer_string, repeat_start, UNPROVIDED );
    final SubLObject name_var = $str4$mrow;
    xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, UNPROVIDED, UNPROVIDED );
    serialize_mathml_non_repeating_decimal( string_utilities.substring( integer_string, ZERO_INTEGER, repeat_start ), backward_decimal_location );
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str100$menclose, $list101, NIL, NIL, $kw22$UNINITIALIZED );
        final SubLObject _prev_bind_0_$29 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
          try
          {
            final SubLObject _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$31 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                xml_utilities.xml_print( repeating_string, UNPROVIDED );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$31, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$31, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$30, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str74$mn );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$29, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str100$menclose );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    xml_utilities.xml_terpri();
    xml_utilities.xml_end_tag_internal( name_var );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12255L)
  public static SubLObject serialize_mathml_non_repeating_decimal(final SubLObject integer_string, final SubLObject backward_decimal_location)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject decimal_location = Numbers.subtract( Sequences.length( integer_string ), backward_decimal_location );
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
        final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
          SubLObject end_var_$35;
          SubLObject end_var;
          SubLObject char_num;
          SubLObject v_char;
          for( end_var = ( end_var_$35 = Sequences.length( integer_string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$35 ); char_num = number_utilities.f_1X( char_num ) )
          {
            v_char = Strings.sublisp_char( integer_string, char_num );
            if( char_num.eql( decimal_location ) )
            {
              xml_utilities.xml_print( Characters.CHAR_period, UNPROVIDED );
            }
            xml_utilities.xml_print( v_char, UNPROVIDED );
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$34, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str74$mn );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    xml_utilities.xml_terpri();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12654L)
  public static SubLObject serialize_mathml_quantity(final SubLObject quantity_args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject keyword_free_arg = quantity_args.isList() ? Sequences.remove( $kw30$SPACE, quantity_args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first() : quantity_args;
    if( keyword_free_arg.isNumber() )
    {
      try
      {
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
          final SubLObject _prev_bind_0_$36 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
            SubLObject cdolist_list_var = quantity_args;
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              serialize_mathml_int( arg );
              cdolist_list_var = cdolist_list_var.rest();
              arg = cdolist_list_var.first();
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$36, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_end_tag_internal( $str74$mn );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
      xml_utilities.xml_terpri();
    }
    else if( NIL != formula_pattern_match.formula_matches_pattern( keyword_free_arg, $list102 ) )
    {
      serialize_mathml_int( ConsesLow.list( $const60$PrefixMinusFn, ConsesLow.list( $const51$MathQuantFn, cycl_utilities.nat_arg1( keyword_free_arg, UNPROVIDED ) ) ) );
    }
    else
    {
      SubLObject cdolist_list_var2 = quantity_args;
      SubLObject arg2 = NIL;
      arg2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        serialize_mathml_int( arg2 );
        cdolist_list_var2 = cdolist_list_var2.rest();
        arg2 = cdolist_list_var2.first();
      }
    }
    return quantity_args;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13465L)
  public static SubLObject serialize_mathml_simple_fraction(final SubLObject numerator, final SubLObject denominator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str68$mfrac, NIL, NIL, NIL, $kw22$UNINITIALIZED );
        final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
          if( NIL != $strike_and_replace_mathml_numerator_with$.getDynamicValue( thread ) )
          {
            final SubLObject name_var = $str4$mrow;
            xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, UNPROVIDED, UNPROVIDED );
            final SubLObject name_var_$38 = $str100$menclose;
            xml_utilities.xml_start_tag_internal( name_var_$38, ConsesLow.list( $str103$notation, $str104$updiagonalstrike ), NIL, UNPROVIDED, UNPROVIDED );
            try
            {
              final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$40 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  serialize_mathml_int( numerator );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$39, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$40, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$38, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str74$mn );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
              }
            }
            xml_utilities.xml_end_tag_internal( name_var_$38 );
            try
            {
              final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$41 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  serialize_mathml_int( $strike_and_replace_mathml_numerator_with$.getDynamicValue( thread ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$42, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$41, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$41, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str74$mn );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
              }
            }
            xml_utilities.xml_end_tag_internal( name_var );
          }
          else
          {
            try
            {
              final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$42 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  serialize_mathml_int( numerator );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$45, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$42, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$44, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values3 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str74$mn );
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
              }
            }
          }
          if( NIL != $strike_and_replace_mathml_denominator_with$.getDynamicValue( thread ) )
          {
            final SubLObject name_var = $str4$mrow;
            xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, UNPROVIDED, UNPROVIDED );
            final SubLObject name_var_$39 = $str100$menclose;
            xml_utilities.xml_start_tag_internal( name_var_$39, ConsesLow.list( $str103$notation, $str104$updiagonalstrike ), NIL, UNPROVIDED, UNPROVIDED );
            try
            {
              final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$43 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  serialize_mathml_int( denominator );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$48, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$43, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$47, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values4 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str74$mn );
                Values.restoreValuesFromVector( _values4 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
              }
            }
            xml_utilities.xml_end_tag_internal( name_var_$39 );
            try
            {
              final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$44 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  serialize_mathml_int( $strike_and_replace_mathml_denominator_with$.getDynamicValue( thread ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$51, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$44, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$50, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values5 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str74$mn );
                Values.restoreValuesFromVector( _values5 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
              }
            }
            xml_utilities.xml_end_tag_internal( name_var );
          }
          else
          {
            try
            {
              final SubLObject _prev_bind_0_$53 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$45 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str74$mn, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                final SubLObject _prev_bind_0_$54 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                  serialize_mathml_int( denominator );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$54, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$45, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$53, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$55 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values6 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str74$mn );
                Values.restoreValuesFromVector( _values6 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$55, thread );
              }
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$37, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values7 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str68$mfrac );
        Values.restoreValuesFromVector( _values7 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14292L)
  public static SubLObject serialize_mathml_simple_stacked_math_expression(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    final SubLObject pcase_var = cycl_utilities.formula_arg0( obj );
    if( pcase_var.eql( $const105$StackedAdditionExpressionFn ) )
    {
      operator = $const106$InfixPlusFn;
    }
    else if( pcase_var.eql( $const107$StackedMultiplicationExpressionFn ) )
    {
      operator = $const108$InfixTimesFn;
    }
    else if( pcase_var.eql( $const109$StackedSubtractionExpressionFn ) )
    {
      operator = $const110$InfixMinusFn;
    }
    else
    {
      Errors.error( $str111$Unable_to_serialize_simple_stacke, obj );
    }
    if( NIL != $mathml_stacked$.getDynamicValue( thread ) )
    {
      final SubLObject v_arity = el_utilities.formula_arity( obj, UNPROVIDED );
      SubLObject arg_num = ZERO_INTEGER;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( obj, $kw91$IGNORE );
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        arg_num = Numbers.add( arg_num, ONE_INTEGER );
        if( arg_num.eql( ONE_INTEGER ) )
        {
          if( arg_num.eql( v_arity ) )
          {
            serialize_mathml_int( operator );
          }
          serialize_mathml_int( arg );
        }
        else if( arg_num.eql( v_arity ) && NIL == padded_expression_p( arg ) )
        {
          try
          {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str112$msrow, NIL, NIL, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$64 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                serialize_mathml_int( operator );
                serialize_mathml_int( arg );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$64, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str112$msrow );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
            }
          }
        }
        else
        {
          serialize_mathml_int( arg );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    else
    {
      final SubLObject _prev_bind_4 = $mathml_stacked$.currentBinding( thread );
      try
      {
        $mathml_stacked$.bind( T, thread );
        try
        {
          final SubLObject _prev_bind_0_$65 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str93$mstack, NIL, NIL, NIL, $kw22$UNINITIALIZED );
            final SubLObject _prev_bind_0_$66 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
              final SubLObject v_arity2 = el_utilities.formula_arity( obj, UNPROVIDED );
              SubLObject arg_num2 = ZERO_INTEGER;
              SubLObject cdolist_list_var2;
              final SubLObject args2 = cdolist_list_var2 = cycl_utilities.formula_args( obj, $kw91$IGNORE );
              SubLObject arg2 = NIL;
              arg2 = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                arg_num2 = Numbers.add( arg_num2, ONE_INTEGER );
                if( arg_num2.eql( ONE_INTEGER ) )
                {
                  if( arg_num2.eql( v_arity2 ) )
                  {
                    serialize_mathml_int( operator );
                  }
                  serialize_mathml_int( arg2 );
                }
                else if( arg_num2.eql( v_arity2 ) && NIL == padded_expression_p( arg2 ) )
                {
                  try
                  {
                    final SubLObject _prev_bind_0_$67 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$68 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                    try
                    {
                      xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                          thread );
                      xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                      xml_utilities.xml_start_tag_internal( $str112$msrow, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                      final SubLObject _prev_bind_0_$68 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                      try
                      {
                        xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                        serialize_mathml_int( operator );
                        serialize_mathml_int( arg2 );
                      }
                      finally
                      {
                        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$68, thread );
                      }
                    }
                    finally
                    {
                      xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$68, thread );
                      xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$67, thread );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      xml_utilities.xml_terpri();
                      xml_utilities.xml_end_tag_internal( $str112$msrow );
                      Values.restoreValuesFromVector( _values2 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$69, thread );
                    }
                  }
                }
                else
                {
                  serialize_mathml_int( arg2 );
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                arg2 = cdolist_list_var2.first();
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$66, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$65, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str93$mstack );
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$70, thread );
          }
        }
      }
      finally
      {
        $mathml_stacked$.rebind( _prev_bind_4, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15315L)
  public static SubLObject padded_expression_p(final SubLObject arg)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_nat_p( arg ) && cycl_utilities.formula_operator( arg ).eql( $const63$PaddedExpressionFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15446L)
  public static SubLObject serialize_mathml_carries(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $mathml_stacked$.getDynamicValue( thread ) )
    {
      final SubLObject carries = ConsesLow.make_list( Numbers.add( ONE_INTEGER, max_carry_index( cycl_utilities.nat_arg2( obj, UNPROVIDED ) ) ), NIL );
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( cycl_utilities.formula_arg2( obj, UNPROVIDED ), $kw91$IGNORE );
      SubLObject carry_list = NIL;
      carry_list = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = carry_list;
        SubLObject l = NIL;
        SubLObject position = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
        l = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
        position = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
        value = current.first();
        current = current.rest();
        if( NIL == current )
        {
          ConsesLow.set_nth( position, carries, value );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list113 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        carry_list = cdolist_list_var.first();
      }
      try
      {
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str114$mscarries, NIL, NIL, NIL, $kw22$UNINITIALIZED );
          final SubLObject _prev_bind_0_$72 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
            SubLObject cdolist_list_var2 = Sequences.nreverse( carries );
            SubLObject carry_value = NIL;
            carry_value = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              if( NIL != carry_value )
              {
                serialize_mathml_int( ConsesLow.list( $const51$MathQuantFn, carry_value ) );
              }
              else
              {
                try
                {
                  final SubLObject _prev_bind_0_$73 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$74 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str115$none, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$74 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$74, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$74, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$73, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$75 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str115$none );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$75, thread );
                  }
                }
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              carry_value = cdolist_list_var2.first();
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$72, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str114$mscarries );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
      serialize_mathml_int( cycl_utilities.formula_arg1( obj, UNPROVIDED ) );
    }
    else
    {
      final SubLObject _prev_bind_4 = $mathml_stacked$.currentBinding( thread );
      try
      {
        $mathml_stacked$.bind( T, thread );
        try
        {
          final SubLObject _prev_bind_0_$76 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str93$mstack, NIL, NIL, NIL, $kw22$UNINITIALIZED );
            final SubLObject _prev_bind_0_$77 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
              final SubLObject carries2 = ConsesLow.make_list( Numbers.add( ONE_INTEGER, max_carry_index( cycl_utilities.nat_arg2( obj, UNPROVIDED ) ) ), NIL );
              SubLObject cdolist_list_var3;
              final SubLObject args2 = cdolist_list_var3 = cycl_utilities.formula_args( cycl_utilities.formula_arg2( obj, UNPROVIDED ), $kw91$IGNORE );
              SubLObject carry_list2 = NIL;
              carry_list2 = cdolist_list_var3.first();
              while ( NIL != cdolist_list_var3)
              {
                SubLObject current2;
                final SubLObject datum2 = current2 = carry_list2;
                SubLObject i = NIL;
                SubLObject position2 = NIL;
                SubLObject value2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list113 );
                i = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list113 );
                position2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list113 );
                value2 = current2.first();
                current2 = current2.rest();
                if( NIL == current2 )
                {
                  ConsesLow.set_nth( position2, carries2, value2 );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum2, $list113 );
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                carry_list2 = cdolist_list_var3.first();
              }
              try
              {
                final SubLObject _prev_bind_0_$78 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$75 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str114$mscarries, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$79 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var4 = Sequences.nreverse( carries2 );
                    SubLObject carry_value2 = NIL;
                    carry_value2 = cdolist_list_var4.first();
                    while ( NIL != cdolist_list_var4)
                    {
                      if( NIL != carry_value2 )
                      {
                        serialize_mathml_int( ConsesLow.list( $const51$MathQuantFn, carry_value2 ) );
                      }
                      else
                      {
                        try
                        {
                          final SubLObject _prev_bind_0_$80 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$76 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                          try
                          {
                            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                thread );
                            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                            xml_utilities.xml_start_tag_internal( $str115$none, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                            final SubLObject _prev_bind_0_$81 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                            try
                            {
                              xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                            }
                            finally
                            {
                              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$81, thread );
                            }
                          }
                          finally
                          {
                            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$76, thread );
                            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$80, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values3 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal( $str115$none );
                            Values.restoreValuesFromVector( _values3 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$82, thread );
                          }
                        }
                      }
                      cdolist_list_var4 = cdolist_list_var4.rest();
                      carry_value2 = cdolist_list_var4.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$79, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$75, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$78, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str114$mscarries );
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$83, thread );
                }
              }
              serialize_mathml_int( cycl_utilities.formula_arg1( obj, UNPROVIDED ) );
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$77, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$76, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values5 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str93$mstack );
            Values.restoreValuesFromVector( _values5 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$84, thread );
          }
        }
      }
      finally
      {
        $mathml_stacked$.rebind( _prev_bind_4, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16009L)
  public static SubLObject max_carry_index(final SubLObject carry_list)
  {
    SubLObject max_index = ZERO_INTEGER;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( carry_list, $kw91$IGNORE );
    SubLObject carry = NIL;
    carry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.nat_arg1( carry, UNPROVIDED ).numG( max_index ) )
      {
        max_index = cycl_utilities.nat_arg1( carry, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      carry = cdolist_list_var.first();
    }
    return max_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16290L)
  public static SubLObject serialize_mathml_strikethrough(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $mathml_stacked$.getDynamicValue( thread ) )
    {
      final SubLObject replacements = ConsesLow.make_list( math_expr_digit_count( cycl_utilities.formula_arg1( obj, UNPROVIDED ) ), NIL );
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( cycl_utilities.formula_arg2( obj, UNPROVIDED ), $kw91$IGNORE );
      SubLObject replacement_list = NIL;
      replacement_list = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = replacement_list;
        SubLObject l = NIL;
        SubLObject position = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
        l = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
        position = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
        value = current.first();
        current = current.rest();
        if( NIL == current )
        {
          ConsesLow.set_nth( position, replacements, value );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list113 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        replacement_list = cdolist_list_var.first();
      }
      try
      {
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str114$mscarries, $list116, NIL, NIL, $kw22$UNINITIALIZED );
          final SubLObject _prev_bind_0_$88 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
            SubLObject cdolist_list_var2 = Sequences.nreverse( replacements );
            SubLObject replacement_value = NIL;
            replacement_value = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              if( NIL != replacement_value )
              {
                serialize_mathml_int( ConsesLow.list( $const51$MathQuantFn, replacement_value ) );
              }
              else
              {
                try
                {
                  final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$90 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str117$mscarry, $list118, NIL, NIL, $kw22$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                      try
                      {
                        final SubLObject _prev_bind_0_$91 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$91 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str115$none, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$92, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$91, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$91, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str115$none );
                          Values.restoreValuesFromVector( _values );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$93, thread );
                        }
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$90, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$90, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$89, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str117$mscarry );
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$94, thread );
                  }
                }
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              replacement_value = cdolist_list_var2.first();
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$88, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str114$mscarries );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
      serialize_mathml_int( cycl_utilities.formula_arg1( obj, UNPROVIDED ) );
    }
    else
    {
      final SubLObject _prev_bind_4 = $mathml_stacked$.currentBinding( thread );
      try
      {
        $mathml_stacked$.bind( T, thread );
        try
        {
          final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str93$mstack, NIL, NIL, NIL, $kw22$UNINITIALIZED );
            final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
              final SubLObject replacements2 = ConsesLow.make_list( math_expr_digit_count( cycl_utilities.formula_arg1( obj, UNPROVIDED ) ), NIL );
              SubLObject cdolist_list_var3;
              final SubLObject args2 = cdolist_list_var3 = cycl_utilities.formula_args( cycl_utilities.formula_arg2( obj, UNPROVIDED ), $kw91$IGNORE );
              SubLObject replacement_list2 = NIL;
              replacement_list2 = cdolist_list_var3.first();
              while ( NIL != cdolist_list_var3)
              {
                SubLObject current2;
                final SubLObject datum2 = current2 = replacement_list2;
                SubLObject i = NIL;
                SubLObject position2 = NIL;
                SubLObject value2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list113 );
                i = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list113 );
                position2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list113 );
                value2 = current2.first();
                current2 = current2.rest();
                if( NIL == current2 )
                {
                  ConsesLow.set_nth( position2, replacements2, value2 );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum2, $list113 );
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                replacement_list2 = cdolist_list_var3.first();
              }
              try
              {
                final SubLObject _prev_bind_0_$97 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str114$mscarries, $list116, NIL, NIL, $kw22$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$98 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var4 = Sequences.nreverse( replacements2 );
                    SubLObject replacement_value2 = NIL;
                    replacement_value2 = cdolist_list_var4.first();
                    while ( NIL != cdolist_list_var4)
                    {
                      if( NIL != replacement_value2 )
                      {
                        serialize_mathml_int( ConsesLow.list( $const51$MathQuantFn, replacement_value2 ) );
                      }
                      else
                      {
                        try
                        {
                          final SubLObject _prev_bind_0_$99 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                          try
                          {
                            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                                thread );
                            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                            xml_utilities.xml_start_tag_internal( $str117$mscarry, $list118, NIL, NIL, $kw22$UNINITIALIZED );
                            final SubLObject _prev_bind_0_$100 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                            try
                            {
                              xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                              try
                              {
                                final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str115$none, NIL, NIL, NIL, $kw22$UNINITIALIZED );
                                  final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                                  }
                                  finally
                                  {
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$102, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$94, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$101, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values4 = Values.getValuesAsVector();
                                  xml_utilities.xml_terpri();
                                  xml_utilities.xml_end_tag_internal( $str115$none );
                                  Values.restoreValuesFromVector( _values4 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$103, thread );
                                }
                              }
                            }
                            finally
                            {
                              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$100, thread );
                            }
                          }
                          finally
                          {
                            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$93, thread );
                            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$99, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$104 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values5 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal( $str117$mscarry );
                            Values.restoreValuesFromVector( _values5 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$104, thread );
                          }
                        }
                      }
                      cdolist_list_var4 = cdolist_list_var4.rest();
                      replacement_value2 = cdolist_list_var4.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$98, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$92, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$97, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$105 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values6 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str114$mscarries );
                  Values.restoreValuesFromVector( _values6 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$105, thread );
                }
              }
              serialize_mathml_int( cycl_utilities.formula_arg1( obj, UNPROVIDED ) );
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$96, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$95, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values7 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str93$mstack );
            Values.restoreValuesFromVector( _values7 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$106, thread );
          }
        }
      }
      finally
      {
        $mathml_stacked$.rebind( _prev_bind_4, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16989L)
  public static SubLObject serialize_mathml_long_division(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject divisor = cycl_utilities.nat_arg2( obj, UNPROVIDED );
    final SubLObject v_answer = cycl_utilities.nat_arg3( obj, UNPROVIDED );
    final SubLObject dividend = cycl_utilities.nat_arg1( obj, UNPROVIDED );
    final SubLObject long_args = Sequences.subseq( cycl_utilities.nat_args( obj, UNPROVIDED ), THREE_INTEGER, UNPROVIDED );
    final SubLObject long_arg_count = Sequences.length( long_args );
    SubLObject current_addend_count = ONE_INTEGER;
    SubLObject current_max_addend_digit_count = ZERO_INTEGER;
    SubLObject within_addend_group = NIL;
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str119$mlongdiv, $list120, NIL, NIL, $kw22$UNINITIALIZED );
        final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
          xml_utilities.xml_terpri();
          serialize_mathml_int( divisor );
          if( NIL != v_answer )
          {
            serialize_mathml_int( v_answer );
          }
          else
          {
            final SubLObject _prev_bind_0_$113 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$114 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str74$mn, NIL, T, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$114 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$114, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$114, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$113, thread );
            }
          }
          if( NIL != cycl_grammar.cycl_nat_p( dividend ) && cycl_utilities.nat_arg0( dividend ).eql( $const51$MathQuantFn ) && cycl_utilities.nat_arg1( dividend, UNPROVIDED ).isInteger() )
          {
            serialize_mathml_int( ConsesLow.listS( $const51$MathQuantFn, cycl_utilities.nat_arg1( dividend, UNPROVIDED ), $list121 ) );
          }
          else
          {
            serialize_mathml_int( dividend );
          }
          try
          {
            final SubLObject _prev_bind_0_$115 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$115 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str64$msgroup, $list122, NIL, NIL, $kw22$UNINITIALIZED );
              final SubLObject _prev_bind_0_$116 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                xml_utilities.xml_terpri();
                SubLObject list_var = NIL;
                SubLObject arg = NIL;
                SubLObject arg_num = NIL;
                list_var = long_args;
                arg = list_var.first();
                for( arg_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), arg_num = Numbers.add( ONE_INTEGER, arg_num ) )
                {
                  if( NIL == within_addend_group )
                  {
                    xml_utilities.xml_start_tag_internal( $str64$msgroup, NIL, NIL, UNPROVIDED, UNPROVIDED );
                    xml_utilities.$xml_indentation_level$.setDynamicValue( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                        thread );
                    xml_utilities.xml_terpri();
                    within_addend_group = T;
                  }
                  serialize_mathml_int( arg );
                  current_addend_count = Numbers.add( current_addend_count, ONE_INTEGER );
                  current_max_addend_digit_count = Numbers.max( current_max_addend_digit_count, math_expr_digit_count( arg ) );
                  if( current_addend_count.numGE( TWO_INTEGER ) )
                  {
                    if( !Numbers.add( arg_num, ONE_INTEGER ).eql( long_arg_count ) )
                    {
                      final SubLObject _prev_bind_0_$117 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$116 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                      try
                      {
                        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                            thread );
                        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                        xml_utilities.xml_start_tag_internal( $str92$msline, ConsesLow.list( $str123$length, current_max_addend_digit_count ), T, NIL, $kw22$UNINITIALIZED );
                        final SubLObject _prev_bind_0_$118 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                        try
                        {
                          xml_vars.$xml_default_namespace$.bind( $kw22$UNINITIALIZED, thread );
                        }
                        finally
                        {
                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$118, thread );
                        }
                      }
                      finally
                      {
                        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$116, thread );
                        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$117, thread );
                      }
                      xml_utilities.xml_terpri();
                    }
                    if( !Numbers.add( arg_num, TWO_INTEGER ).eql( long_arg_count ) )
                    {
                      current_max_addend_digit_count = ZERO_INTEGER;
                      current_addend_count = ZERO_INTEGER;
                      xml_utilities.xml_end_tag_internal( $str64$msgroup );
                      xml_utilities.$xml_indentation_level$.setDynamicValue( Numbers.subtract( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), xml_utilities.$xml_indentation_amount$.getDynamicValue(
                          thread ) ), thread );
                      xml_utilities.xml_terpri();
                      within_addend_group = NIL;
                    }
                  }
                }
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$116, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$115, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$115, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$119 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str64$msgroup );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$119, thread );
            }
          }
          if( NIL != within_addend_group )
          {
            xml_utilities.xml_end_tag_internal( $str64$msgroup );
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$112, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str119$mlongdiv );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25989L)
  public static SubLObject mathml_demo()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject color = NIL;
    SubLObject test_items = $mathml_demo_items$.getGlobalValue();
    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym125$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const126$EverythingPSC, thread );
      final SubLObject pred_var = $const127$mathExpressionNATRenderAs;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$123 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$124 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw128$GAF, NIL, NIL );
                SubLObject done_var_$125 = NIL;
                final SubLObject token_var_$126 = NIL;
                while ( NIL == done_var_$125)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$126 );
                  final SubLObject valid_$127 = makeBoolean( !token_var_$126.eql( gaf ) );
                  if( NIL != valid_$127 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( gaf );
                    SubLObject math_expression = NIL;
                    SubLObject html = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
                    math_expression = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
                    html = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      test_items = ConsesLow.cons( ConsesLow.list( math_expression, html ), test_items );
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list129 );
                    }
                  }
                  done_var_$125 = makeBoolean( NIL == valid_$127 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$124 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$124, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$124, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$123, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      final SubLObject style = Sequences.cconcatenate( $str130$background_color__, format_nil.format_nil_a_no_copy( html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue() ) );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      if( NIL != style )
      {
        html_utilities.html_markup( html_macros.$html_attribute_style$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( style ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str131$CycL );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$126, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str132$HTML );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$127, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str133$MathML );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$128, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$125, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      SubLObject color_toggle = NIL;
      SubLObject list_var = NIL;
      SubLObject item = NIL;
      SubLObject ignore_me = NIL;
      list_var = test_items;
      item = list_var.first();
      for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
      {
        if( NIL != color_toggle )
        {
          color_toggle = NIL;
        }
        else
        {
          color_toggle = T;
        }
        color = ( ( NIL != color_toggle ) ? html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() : html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue() );
        SubLObject current2;
        final SubLObject datum2 = current2 = item;
        SubLObject math_expression2 = NIL;
        SubLObject html2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list129 );
        math_expression2 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list129 );
        html2 = current2.first();
        current2 = current2.rest();
        if( NIL == current2 )
        {
          final SubLObject style2 = Sequences.cconcatenate( $str130$background_color__, format_nil.format_nil_a_no_copy( color ) );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          if( NIL != style2 )
          {
            html_utilities.html_markup( html_macros.$html_attribute_style$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( style2 ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              cb_utilities.cb_form( math_expression2, ZERO_INTEGER, T );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$130, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != list_utilities.lengthL( html2, $int134$32, UNPROVIDED ) )
              {
                html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
                html_utilities.html_markup( html2 );
                html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
              }
              else
              {
                html_utilities.html_markup( html2 );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$131, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
              final SubLObject _prev_bind_0_$133 = xml_vars.$xml_stream$.currentBinding( thread );
              try
              {
                xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
                SubLObject err_msg = NIL;
                try
                {
                  thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  final SubLObject _prev_bind_0_$134 = Errors.$error_handler$.currentBinding( thread );
                  try
                  {
                    Errors.$error_handler$.bind( $sym135$CATCH_ERROR_MESSAGE_HANDLER, thread );
                    try
                    {
                      serialize_mathml( item.first() );
                    }
                    catch( final Throwable catch_var )
                    {
                      Errors.handleThrowable( catch_var, NIL );
                    }
                  }
                  finally
                  {
                    Errors.$error_handler$.rebind( _prev_bind_0_$134, thread );
                  }
                }
                catch( final Throwable ccatch_env_var )
                {
                  err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                }
                finally
                {
                  thread.throwStack.pop();
                }
                if( NIL != err_msg )
                {
                  html_utilities.html_princ_strong( err_msg );
                }
              }
              finally
              {
                xml_vars.$xml_stream$.rebind( _prev_bind_0_$133, thread );
              }
              html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$132, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$129, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum2, $list129 );
        }
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27330L)
  public static SubLObject serialize_mathml_to_string(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject str = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        serialize_mathml( obj );
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      str = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return str;
  }

  public static SubLObject declare_mathml_file()
  {
    SubLFiles.declareMacro( me, "serializing_mathml", "SERIALIZING-MATHML" );
    SubLFiles.declareMacro( me, "mathml_row", "MATHML-ROW" );
    SubLFiles.declareMacro( me, "with_stacked_math", "WITH-STACKED-MATH" );
    SubLFiles.declareFunction( me, "serialize_mathml", "SERIALIZE-MATHML", 1, 0, false );
    SubLFiles.declareFunction( me, "lookup_mathml_atom", "LOOKUP-MATHML-ATOM", 1, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_atom", "SERIALIZE-MATHML-ATOM", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_html_glyph_code_for_denot", "CLEAR-HTML-GLYPH-CODE-FOR-DENOT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_html_glyph_code_for_denot", "REMOVE-HTML-GLYPH-CODE-FOR-DENOT", 1, 0, false );
    SubLFiles.declareFunction( me, "html_glyph_code_for_denot_internal", "HTML-GLYPH-CODE-FOR-DENOT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "html_glyph_code_for_denot", "HTML-GLYPH-CODE-FOR-DENOT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_serializable_units_of_measure_mathml", "CLEAR-SERIALIZABLE-UNITS-OF-MEASURE-MATHML", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_serializable_units_of_measure_mathml", "REMOVE-SERIALIZABLE-UNITS-OF-MEASURE-MATHML", 0, 0, false );
    SubLFiles.declareFunction( me, "serializable_units_of_measure_mathml_internal", "SERIALIZABLE-UNITS-OF-MEASURE-MATHML-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "serializable_units_of_measure_mathml", "SERIALIZABLE-UNITS-OF-MEASURE-MATHML", 0, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_int", "SERIALIZE-MATHML-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "math_expr_digit_count", "MATH-EXPR-DIGIT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_decimal", "SERIALIZE-MATHML-DECIMAL", 1, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_repeating_decimal", "SERIALIZE-MATHML-REPEATING-DECIMAL", 3, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_non_repeating_decimal", "SERIALIZE-MATHML-NON-REPEATING-DECIMAL", 2, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_quantity", "SERIALIZE-MATHML-QUANTITY", 1, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_simple_fraction", "SERIALIZE-MATHML-SIMPLE-FRACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_simple_stacked_math_expression", "SERIALIZE-MATHML-SIMPLE-STACKED-MATH-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "padded_expression_p", "PADDED-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_carries", "SERIALIZE-MATHML-CARRIES", 1, 0, false );
    SubLFiles.declareFunction( me, "max_carry_index", "MAX-CARRY-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_strikethrough", "SERIALIZE-MATHML-STRIKETHROUGH", 1, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_long_division", "SERIALIZE-MATHML-LONG-DIVISION", 1, 0, false );
    SubLFiles.declareFunction( me, "mathml_demo", "MATHML-DEMO", 0, 0, false );
    SubLFiles.declareFunction( me, "serialize_mathml_to_string", "SERIALIZE-MATHML-TO-STRING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_mathml_file()
  {
    $mathml_namespace$ = SubLFiles.deflexical( "*MATHML-NAMESPACE*", $str0$http___www_w3_org_1998_Math_MathM );
    $mathml_stacked$ = SubLFiles.defparameter( "*MATHML-STACKED*", NIL );
    $mathml_heavy_operatorsP$ = SubLFiles.defparameter( "*MATHML-HEAVY-OPERATORS?*", NIL );
    $mathml_atom_map$ = SubLFiles.deflexical( "*MATHML-ATOM-MAP*", $list13 );
    $html_glyph_code_for_denot_caching_state$ = SubLFiles.deflexical( "*HTML-GLYPH-CODE-FOR-DENOT-CACHING-STATE*", NIL );
    $serializable_units_of_measure_mathml_caching_state$ = SubLFiles.deflexical( "*SERIALIZABLE-UNITS-OF-MEASURE-MATHML-CACHING-STATE*", NIL );
    $strike_and_replace_mathml_numerator_with$ = SubLFiles.defparameter( "*STRIKE-AND-REPLACE-MATHML-NUMERATOR-WITH*", NIL );
    $strike_and_replace_mathml_denominator_with$ = SubLFiles.defparameter( "*STRIKE-AND-REPLACE-MATHML-DENOMINATOR-WITH*", NIL );
    $mathml_demo_items$ = SubLFiles.deflexical( "*MATHML-DEMO-ITEMS*", $list124 );
    return NIL;
  }

  public static SubLObject setup_mathml_file()
  {
    memoization_state.note_globally_cached_function( $sym33$HTML_GLYPH_CODE_FOR_DENOT );
    memoization_state.note_globally_cached_function( $sym38$SERIALIZABLE_UNITS_OF_MEASURE_MATHML );
    generic_testing.define_test_case_table_int( $sym136$SERIALIZE_MATHML_TO_STRING, ConsesLow.list( new SubLObject[] { $kw137$TEST, EQUAL, $kw138$OWNER, NIL, $kw139$CLASSES, NIL, $kw140$KB, $kw141$FULL, $kw142$WORKING_,
      T
    } ), $list143 );
    return NIL;
  }

  private static SubLObject _constant_124_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), TWO_INTEGER, ONE_INTEGER ) ), constant_handles.reader_make_constant_shell(
            makeString( "InfixPlusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "Foot-UnitOfMeasure" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeInteger( 656 ), TWO_INTEGER ) ) ) ), makeString( ".2 + 6.56 feet" ) ),
      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathStackedEqualsStatementFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "StackedAdditionExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InsertNumberAtDigitsFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeInteger( 1094 ), ONE_INTEGER ) ), ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "TheList" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), ZERO_INTEGER, ONE_INTEGER ) ) ), ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), makeInteger( 45 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow
                          .list( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeInteger( 77745 ), THREE_INTEGER ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                              makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeInteger( 145 ), THREE_INTEGER ) ) ), makeString(
                                  "Stacked version of 109.4 + 45 + 77.745, where .145 has been done so far in the stacked addition, and a 1 has been carried over the 9" ) ), ConsesLow.list( ConsesLow.list(
                                      constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ),
                                          makeInteger( 314 ), TWO_INTEGER ) ), makeString( "3.14" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow
                                              .list( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeInteger( 8675309 ), FOUR_INTEGER, TWO_INTEGER ) ), makeString(
                                                  "867.5309 (with bar over 09)" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathEqualsStatementFn" ) ), ConsesLow.list(
                                                      constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "A" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                          makeString( "InfixDottedTimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), constant_handles
                                                              .reader_make_constant_shell( makeString( "Pi-Number" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PowerExpressionFn" ) ),
                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "r" ) ), ConsesLow.list( constant_handles
                                                                      .reader_make_constant_shell( makeString( "MathQuantFn" ) ), TWO_INTEGER ) ) ) ), makeString( "A = pi r^2" ) ), ConsesLow.list( ConsesLow.list(
                                                                          constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                              makeString( "StrikeNumeratorAndReplaceWithFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                  "SimpleFractionFn" ) ), EIGHT_INTEGER, SEVEN_INTEGER ), ONE_INTEGER ), constant_handles.reader_make_constant_shell( makeString(
                                                                                      "InfixTimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "StrikeDenominatorAndReplaceWithFn" ) ),
                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), makeInteger( 35 ),
                                                                                              EIGHT_INTEGER ), ONE_INTEGER ) ), makeString( "<del>8</del>1/7 x 35/<del>8</del>1" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                  constant_handles.reader_make_constant_shell( makeString( "TimeExpressionFn" ) ), constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "TimeOfDay-PM" ) ), TWELVE_INTEGER, FIVE_INTEGER ), makeString(
                                                                                                          "12:05PM" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                              "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                  "TimeExpressionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TimeOfDay-PM" ) ),
                                                                                                                  TWELVE_INTEGER, makeInteger( 45 ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                      "InfixMinusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "TimeExpressionFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                              "TimeOfDay-PM" ) ), FOUR_INTEGER, makeInteger( 40 ) ) ), makeString( "12:45PM - 4:40PM" ) ),
      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixPlusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
          NINE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "z" ) ) ), makeString( "9 + z" ) ), ConsesLow.list( ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "MixedFractionFn" ) ), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER ), makeString( "2 1/3" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "NegativeMixedFractionFn" ) ), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER ), makeString( "-2 1/3" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                      .reader_make_constant_shell( makeString( "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "MixedFractionFn" ) ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ), constant_handles.reader_make_constant_shell( makeString( "InfixTimesFn" ) ),
                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ),
                          TWO_INTEGER, ONE_INTEGER, TWO_INTEGER ) ) ), makeString( "1 2/3 x 2 1/2" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) ),
                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ),
                                  THREE_INTEGER, FIVE_INTEGER ) ), constant_handles.reader_make_constant_shell( makeString( "InfixDivideFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                      "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), ONE_INTEGER, TWO_INTEGER ) ) ), makeString( "3/5 / 1/2" ) ),
      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
          NINE_INTEGER ), constant_handles.reader_make_constant_shell( makeString( "InfixPlusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "z" ) ) ),
          makeString( "9 + z" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "MathQuantFn" ) ), NINE_INTEGER ), constant_handles.reader_make_constant_shell( makeString( "InfixPlusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                  EIGHT_INTEGER ), constant_handles.reader_make_constant_shell( makeString( "InfixPlusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString(
                      "z" ) ), constant_handles.reader_make_constant_shell( makeString( "InfixPlusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "y" ) ) ),
              makeString( "9 + 8 + z + y" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixPlusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                  makeString( "MathQuantFn" ) ), NINE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), EIGHT_INTEGER ), ConsesLow.list( constant_handles
                      .reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "z" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "y" ) ) ),
                  makeString( "9 + 8 + z + y" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixMinusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "MathQuantFn" ) ), NINE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "z" ) ) ), makeString( "9 - z" ) ), ConsesLow
                          .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "MathQuantFn" ) ), NINE_INTEGER ), constant_handles.reader_make_constant_shell( makeString( "InfixMinusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                  "MathVarFn" ) ), makeString( "z" ) ) ), makeString( "9 - z" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixTimesFn" ) ), ConsesLow
                                      .list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), NINE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                          "MathVarFn" ) ), makeString( "z" ) ) ), makeString( "9 x z" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) ),
                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                  "SimpleFractionFn" ) ), ONE_INTEGER, TWO_INTEGER ) ), constant_handles.reader_make_constant_shell( makeString( "InfixTimesFn" ) ), ConsesLow.list( constant_handles
                                                      .reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ),
                                                          ONE_INTEGER, FOUR_INTEGER ) ) ), makeString( "1/2 x 1/4" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                              "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), NINE_INTEGER ), constant_handles
                                                                  .reader_make_constant_shell( makeString( "InfixTimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ),
                                                                      makeString( "z" ) ) ), makeString( "9 x z" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                          "InfixDottedTimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), NINE_INTEGER ), ConsesLow
                                                                              .list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "z" ) ) ), makeString( "9 . z" ) ), ConsesLow
                                                                                  .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) ), ConsesLow.list( constant_handles
                                                                                      .reader_make_constant_shell( makeString( "MathQuantFn" ) ), NINE_INTEGER ), constant_handles.reader_make_constant_shell( makeString(
                                                                                          "InfixDottedTimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString(
                                                                                              "z" ) ) ), makeString( "9 . z" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                  "ImplicitTimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                                                                                                      NINE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString(
                                                                                                          "z" ) ) ), makeString( "9z" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                              makeString( "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                  "MathQuantFn" ) ), NINE_INTEGER ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                      "ImplicitTimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "MathVarFn" ) ), makeString( "z" ) ) ), makeString( "9z" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                              constant_handles.reader_make_constant_shell( makeString( "AbsoluteValueExpressionFn" ) ),
                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                                                                                                                                  NINE_INTEGER ) ), makeString( "abs(9)" ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "PrefixMinusFn" ) ),
                                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                          "MathQuantFn" ) ), THREE_INTEGER ) ), makeString( "-3" ) ), ConsesLow.list(
                                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                  "PowerExpressionFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString(
                                                                                                                                                          "x" ) ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                                                                                                                                                              TWO_INTEGER ) ), makeString( "X^2" ) ), ConsesLow.list(
                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "InfixTimesFn" ) ), ConsesLow.list(
                                                                                                                                                                              constant_handles.reader_make_constant_shell(
                                                                                                                                                                                  makeString( "MathQuantFn" ) ), makeDouble(
                                                                                                                                                                                      3.14 ) ), ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "PowerExpressionFn" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "MathQuantFn" ) ),
                                                                                                                                                                                              EIGHT_INTEGER ), ConsesLow
                                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "MathQuantFn" ) ),
                                                                                                                                                                                                      TWO_INTEGER ) ) ),
                                                                                                                                                                  makeString( "3.14 x 8^2" ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                      .list( constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "MathExpressionFn" ) ), ConsesLow
                                                                                                                                                                              .list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "MathQuantFn" ) ), makeDouble(
                                                                                                                                                                                          3.14 ) ), constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "InfixTimesFn" ) ),
                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "MathQuantFn" ) ), EIGHT_INTEGER ),
                                                                                                                                                                          constant_handles.reader_make_constant_shell(
                                                                                                                                                                              makeString( "PowerExpressionFn" ) ), ConsesLow
                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "MathQuantFn" ) ),
                                                                                                                                                                                      TWO_INTEGER ) ), makeString(
                                                                                                                                                                                          "3.14 x 8^2" ) ), ConsesLow.list(
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "BracketedMathFn" ) ),
                                                                                                                                                                                                  ConsesLow.list(
                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                  "MathQuantFn" ) ),
                                                                                                                                                                                                      NINE_INTEGER ) ),
                                                                                                                                                                                              makeString( "[9]" ) ),
      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ParenthesizedMathFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
          NINE_INTEGER ) ), makeString( "(9)" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "x" ) ), makeString( "var x" ) ), ConsesLow.list(
              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), NINE_INTEGER ), makeString( "9" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                  makeString( "HorizontalDivideFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), NINE_INTEGER ), ConsesLow.list( constant_handles
                      .reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "x" ) ) ), makeString( "9/x" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                          "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), NINE_INTEGER ), constant_handles.reader_make_constant_shell( makeString(
                              "HorizontalDivideFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "x" ) ) ), makeString( "9/x" ) ), ConsesLow.list( ConsesLow
                                  .list( constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                                      NINE_INTEGER ), constant_handles.reader_make_constant_shell( makeString( "InfixDivideFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                          "MathVarFn" ) ), makeString( "x" ) ) ), makeString( "9/x with obelus" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                              "InfixDivideFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), NINE_INTEGER ), ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "x" ) ) ), makeString( "9/x with obelus" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                      .reader_make_constant_shell( makeString( "MathExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                                                          NINE_INTEGER ), constant_handles.reader_make_constant_shell( makeString( "InfixSlashDivideFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                              makeString( "MathVarFn" ) ), makeString( "x" ) ) ), makeString( "9/x with slash" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                  .reader_make_constant_shell( makeString( "InfixSlashDivideFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                      "MathQuantFn" ) ), NINE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "x" ) ) ),
                                                                  makeString( "9/x with slash" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NthRootExpressionFn" ) ),
                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), THREE_INTEGER ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "MathQuantFn" ) ), NINE_INTEGER ) ), makeString( "cube root of 9" ) ), ConsesLow.list( ConsesLow.list(
                                                                              constant_handles.reader_make_constant_shell( makeString( "FunctionOfVarsFn" ) ), makeString( "f" ), ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "x" ) ), ConsesLow.list( constant_handles
                                                                                      .reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "y" ) ) ), makeString( "f(x,y)" ) ), ConsesLow.list( ConsesLow
                                                                                          .list( constant_handles.reader_make_constant_shell( makeString( "MathEqualsStatementFn" ) ), ConsesLow.list( constant_handles
                                                                                              .reader_make_constant_shell( makeString( "InfixPlusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                  makeString( "MathQuantFn" ) ), SEVEN_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                      "MathQuantFn" ) ), TWO_INTEGER ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                          "MathQuantFn" ) ), NINE_INTEGER ) ), makeString( "7 + 2 = 9" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "MathGreaterThanOrEqualStatementFn" ) ), ConsesLow.list(
                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "InfixPlusFn" ) ), ConsesLow.list(
                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), SEVEN_INTEGER ), ConsesLow
                                                                                                                          .list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                                                                                                                              THREE_INTEGER ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                  "MathQuantFn" ) ), NINE_INTEGER ) ), makeString( "7 + 3 >= 9" ) ), ConsesLow.list(
                                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                          "MathLessThanOrEqualStatementFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                              .reader_make_constant_shell( makeString( "InfixPlusFn" ) ), ConsesLow.list(
                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "MathQuantFn" ) ), SEVEN_INTEGER ), ConsesLow.list( constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                                                                                                                                                          ONE_INTEGER ) ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                                                                                                                                                              NINE_INTEGER ) ), makeString( "7 + 1 <= 9" ) ), ConsesLow
                                                                                                                                                                  .list( ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "MathGreaterThanStatementFn" ) ), ConsesLow.list(
                                                                                                                                                                              constant_handles.reader_make_constant_shell(
                                                                                                                                                                                  makeString( "InfixPlusFn" ) ), ConsesLow
                                                                                                                                                                                      .list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "MathQuantFn" ) ),
                                                                                                                                                                                          SEVEN_INTEGER ), ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "MathQuantFn" ) ),
                                                                                                                                                                                              THREE_INTEGER ) ), ConsesLow
                                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "MathQuantFn" ) ),
                                                                                                                                                                                                      NINE_INTEGER ) ),
                                                                                                                                                                      makeString( "7 + 3 > 9" ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                          .list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "MathLessThanStatementFn" ) ), ConsesLow
                                                                                                                                                                                      .list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "InfixPlusFn" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "MathQuantFn" ) ),
                                                                                                                                                                                              SEVEN_INTEGER ), ConsesLow
                                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "MathQuantFn" ) ),
                                                                                                                                                                                                      ONE_INTEGER ) ),
                                                                                                                                                                              ConsesLow.list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "MathQuantFn" ) ), NINE_INTEGER ) ),
                                                                                                                                                                          makeString( "7 + 1 < 9" ) ), ConsesLow.list(
                                                                                                                                                                              ConsesLow.list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "MathNotEqualsStatementFn" ) ),
                                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "InfixPlusFn" ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "MathQuantFn" ) ),
                                                                                                                                                                                          SEVEN_INTEGER ), ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "MathQuantFn" ) ),
                                                                                                                                                                                              THREE_INTEGER ) ), ConsesLow
                                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "MathQuantFn" ) ),
                                                                                                                                                                                                      NINE_INTEGER ) ),
                                                                                                                                                                              makeString( "7 + 3 != 9" ) ), ConsesLow.list(
                                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString(
                                                                                                                                                                                              "MathGreaterThanStatementFn" ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "InfixDivideFn" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "MathQuantFn" ) ),
                                                                                                                                                                                              NINE_INTEGER ), ConsesLow
                                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "NthRootExpressionFn" ) ),
                                                                                                                                                                                                      ConsesLow.list(
                                                                                                                                                                                                          constant_handles
                                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                                      "MathQuantFn" ) ),
                                                                                                                                                                                                          TWO_INTEGER ),
                                                                                                                                                                                                      ConsesLow.list(
                                                                                                                                                                                                          constant_handles
                                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                                      "MathVarFn" ) ),
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "y" ) ) ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "MathVarFn" ) ),
                                                                                                                                                                                          makeString( "z" ) ) ), makeString(
                                                                                                                                                                                              "9 / (square-root of Y) > z" ) ),
      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathUnknownStatementFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixDivideFn" ) ),
          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), NINE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NthRootExpressionFn" ) ),
              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), TWO_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ),
                  makeString( "y" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "z" ) ) ), makeString( "9 / (square-root of Y) ?>=<? z" ) ), ConsesLow
                      .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Volt" ) ), makeInteger(
                          220 ) ) ), makeString( "220V" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "Mole-ChemicalCountUnit" ) ), makeInteger( 1320 ) ) ), makeString( "1320 moles" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                  .reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnitOfCountFn" ) ), constant_handles
                                      .reader_make_constant_shell( makeString( "Battery" ) ) ), TWELVE_INTEGER ) ), makeString( "12 batteries" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "Volt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ), TWO_INTEGER, ONE_INTEGER,
                                              THREE_INTEGER ) ), makeString( "2 1/3 volts" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), ConsesLow
                                                  .list( constant_handles.reader_make_constant_shell( makeString( "Volt" ) ), SEVEN_INTEGER ), THREE_INTEGER ), makeString( "(7 volts) / 3" ) ), ConsesLow.list( ConsesLow
                                                      .list( constant_handles.reader_make_constant_shell( makeString( "ParenthesizedMathFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                          "PrefixMinusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles
                                                              .reader_make_constant_shell( makeString( "MixedFractionFn" ) ), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER ) ) ) ), makeString( "(-2 1/3)" ) ), ConsesLow.list(
                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BracketedMathFn" ) ), ConsesLow.list( constant_handles
                                                                      .reader_make_constant_shell( makeString( "ParenthesizedMathFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                          "PrefixMinusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles
                                                                              .reader_make_constant_shell( makeString( "MixedFractionFn" ) ), TWO_INTEGER, ONE_INTEGER, THREE_INTEGER ) ) ) ) ), makeString(
                                                                                  "[-(2 1/3)]" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) ),
                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ZERO_INTEGER ), constant_handles
                                                                                          .reader_make_constant_shell( makeString( "InfixMinusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                              makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinusFn" ) ),
                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ), TWO_INTEGER, ONE_INTEGER,
                                                                                                      THREE_INTEGER ) ) ) ), makeString( "0 - (-2 1/3)" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "MathEqualsStatementFn" ) ), ConsesLow.list( constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "x" ) ), ConsesLow.list(
                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "HorizontalDivideFn" ) ), ConsesLow.list(
                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "InfixPlusMinusFn" ) ), ConsesLow.list(
                                                                                                                          constant_handles.reader_make_constant_shell( makeString( "PrefixMinusFn" ) ), ConsesLow.list(
                                                                                                                              constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString(
                                                                                                                                  "b" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "NthRootExpressionFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                          .reader_make_constant_shell( makeString( "MathQuantFn" ) ), TWO_INTEGER ),
                                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                          "InfixMinusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                              makeString( "PowerExpressionFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString(
                                                                                                                                                      "b" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                          makeString( "MathQuantFn" ) ), TWO_INTEGER ) ), ConsesLow.list(
                                                                                                                                                              constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                  "ImplicitTimesFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "MathQuantFn" ) ), FOUR_INTEGER ), ConsesLow.list(
                                                                                                                                                                              constant_handles.reader_make_constant_shell(
                                                                                                                                                                                  makeString( "MathVarFn" ) ), makeString(
                                                                                                                                                                                      "a" ) ), ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "MathVarFn" ) ),
                                                                                                                                                                                          makeString( "c" ) ) ) ) ) ),
                                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ImplicitTimesFn" ) ), ConsesLow
                                                                                                                      .list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), TWO_INTEGER ),
                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString(
                                                                                                                          "a" ) ) ) ) ), makeString( "x = (-b +/- (square root of (b^2 - 4ac))) / 2a" ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_mathml_file();
  }

  @Override
  public void initializeVariables()
  {
    init_mathml_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_mathml_file();
  }
  static
  {
    me = new mathml();
    $mathml_namespace$ = null;
    $mathml_stacked$ = null;
    $mathml_heavy_operatorsP$ = null;
    $mathml_atom_map$ = null;
    $html_glyph_code_for_denot_caching_state$ = null;
    $serializable_units_of_measure_mathml_caching_state$ = null;
    $strike_and_replace_mathml_numerator_with$ = null;
    $strike_and_replace_mathml_denominator_with$ = null;
    $mathml_demo_items$ = null;
    $str0$http___www_w3_org_1998_Math_MathM = makeString( "http://www.w3.org/1998/Math/MathML" );
    $sym1$XML_TAG = makeSymbol( "XML-TAG" );
    $list2 = ConsesLow.list( makeString( "math" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "overflow" ), makeString( "linebreak" ) ) ), NIL, NIL, NIL, makeSymbol( "*MATHML-NAMESPACE*" ) );
    $sym3$XML_ELEMENT = makeSymbol( "XML-ELEMENT" );
    $str4$mrow = makeString( "mrow" );
    $sym5$PIF = makeSymbol( "PIF" );
    $sym6$_MATHML_STACKED_ = makeSymbol( "*MATHML-STACKED*" );
    $sym7$PROGN = makeSymbol( "PROGN" );
    $sym8$CLET = makeSymbol( "CLET" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "*MATHML-STACKED*" ), T ) );
    $list10 = ConsesLow.list( makeString( "mstack" ) );
    $str11$math = makeString( "math" );
    $list12 = ConsesLow.list( makeString( "overflow" ), makeString( "linebreak" ) );
    $list13 = ConsesLow.list( new SubLObject[] { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixPlusFn" ) ), makeString( "+" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "PrefixMinusFn" ) ), makeString( "&#x2212;" ), makeString( "MINUS" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixMinusFn" ) ),
            makeString( "&#x2212;" ), makeString( "MINUS" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixPlusMinusFn" ) ), makeString( "&#xB1;" ), makeString( "PLUS/MINUS" ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixTimesFn" ) ), makeString( "&#xD7;" ), makeString( "MULT SIGN" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "ImplicitTimesFn" ) ), makeString( "&#x2062;" ), makeString( "INVISIBLE TIMES" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixDottedTimesFn" ) ), makeString(
              "&#x22C5;" ), makeString( "DOT PRODUCT SIGN" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InfixDivideFn" ) ), makeString( "&#x00F7;" ), makeString( "OBELUS" ) ), ConsesLow
                  .list( constant_handles.reader_make_constant_shell( makeString( "MathEqualsStatementFn" ) ), makeString( "=" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "MathGreaterThanOrEqualStatementFn" ) ), makeString( "&#x2265;" ), makeString( "GREATER THAN OR EQUAL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                          "MathGreaterThanStatementFn" ) ), makeString( "&#x3E;" ), makeString( "GREATER THAN" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "MathLessThanOrEqualStatementFn" ) ), makeString( "&#x2264;" ), makeString( "LESS THAN OR EQUAL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                  "MathLessThanStatementFn" ) ), makeString( "&#x3C;" ), makeString( "LESS THAN" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                      "MathNotEqualsStatementFn" ) ), makeString( "&#x2260;" ), makeString( "NOT EQUAL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                          "MathUnknownStatementFn" ) ), makeString( "&#x2A8B;" ), makeString( "UNKNOWN STATEMENT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                              "FunctionOfVarsFn" ) ), makeString( "&#x2061;" ), makeString( "FUNCTION APPLICATION" ) )
    } );
    $list14 = ConsesLow.list( makeSymbol( "MARKUP" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "COMMENT" ) );
    $str15$mo = makeString( "mo" );
    $str16$largeop = makeString( "largeop" );
    $str17$true = makeString( "true" );
    $str18$false = makeString( "false" );
    $str19$mathvariant = makeString( "mathvariant" );
    $str20$bold = makeString( "bold" );
    $str21$normal = makeString( "normal" );
    $kw22$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $const23$Pi_Number = constant_handles.reader_make_constant_shell( makeString( "Pi-Number" ) );
    $str24$mi = makeString( "mi" );
    $str25$_pi_ = makeString( "&pi;" );
    $const26$TimeOfDay_PM = constant_handles.reader_make_constant_shell( makeString( "TimeOfDay-PM" ) );
    $str27$PM = makeString( "PM" );
    $const28$TimeOfDay_AM = constant_handles.reader_make_constant_shell( makeString( "TimeOfDay-AM" ) );
    $str29$AM = makeString( "AM" );
    $kw30$SPACE = makeKeyword( "SPACE" );
    $str31$_ = makeString( " " );
    $str32$_A = makeString( "~A" );
    $sym33$HTML_GLYPH_CODE_FOR_DENOT = makeSymbol( "HTML-GLYPH-CODE-FOR-DENOT" );
    $const34$htmlGlyphCode = constant_handles.reader_make_constant_shell( makeString( "htmlGlyphCode" ) );
    $const35$symbolDenotes = constant_handles.reader_make_constant_shell( makeString( "symbolDenotes" ) );
    $sym36$_HTML_GLYPH_CODE_FOR_DENOT_CACHING_STATE_ = makeSymbol( "*HTML-GLYPH-CODE-FOR-DENOT-CACHING-STATE*" );
    $sym37$CLEAR_HTML_GLYPH_CODE_FOR_DENOT = makeSymbol( "CLEAR-HTML-GLYPH-CODE-FOR-DENOT" );
    $sym38$SERIALIZABLE_UNITS_OF_MEASURE_MATHML = makeSymbol( "SERIALIZABLE-UNITS-OF-MEASURE-MATHML" );
    $const39$CompoundDurationFn = constant_handles.reader_make_constant_shell( makeString( "CompoundDurationFn" ) );
    $const40$UnitOfMeasure = constant_handles.reader_make_constant_shell( makeString( "UnitOfMeasure" ) );
    $sym41$_SERIALIZABLE_UNITS_OF_MEASURE_MATHML_CACHING_STATE_ = makeSymbol( "*SERIALIZABLE-UNITS-OF-MEASURE-MATHML-CACHING-STATE*" );
    $list42 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathNotEqualsStatementFn" ) ), constant_handles.reader_make_constant_shell( makeString( "MathLessThanStatementFn" ) ),
        constant_handles.reader_make_constant_shell( makeString( "MathLessThanOrEqualStatementFn" ) ), constant_handles.reader_make_constant_shell( makeString( "MathGreaterThanStatementFn" ) ), constant_handles
            .reader_make_constant_shell( makeString( "MathGreaterThanOrEqualStatementFn" ) ), constant_handles.reader_make_constant_shell( makeString( "MathEqualsStatementFn" ) ), constant_handles
                .reader_make_constant_shell( makeString( "MathUnknownStatementFn" ) ), constant_handles.reader_make_constant_shell( makeString( "InfixDivideFn" ) ) );
    $list43 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ImplicitTimesFn" ) ), constant_handles.reader_make_constant_shell( makeString( "InfixDottedTimesFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "InfixTimesFn" ) ), constant_handles.reader_make_constant_shell( makeString( "InfixMinusFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "InfixPlusFn" ) ), constant_handles.reader_make_constant_shell( makeString( "InfixPlusMinusFn" ) ) );
    $list44 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "StackedAdditionExpressionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "StackedSubtractionExpressionFn" ) ),
        constant_handles.reader_make_constant_shell( makeString( "StackedMultiplicationExpressionFn" ) ) );
    $const45$singular = constant_handles.reader_make_constant_shell( makeString( "singular" ) );
    $const46$plural = constant_handles.reader_make_constant_shell( makeString( "plural" ) );
    $str47$mspace = makeString( "mspace" );
    $str48$width = makeString( "width" );
    $str49$_5em = makeString( ".5em" );
    $list50 = ConsesLow.list( makeString( "mathvariant" ), makeString( "normal" ), makeString( "class" ), makeString( "MathML-Unit" ) );
    $const51$MathQuantFn = constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) );
    $const52$MathLongDivisionStatementFn = constant_handles.reader_make_constant_shell( makeString( "MathLongDivisionStatementFn" ) );
    $const53$MathVarFn = constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) );
    $const54$ParenthesizedMathFn = constant_handles.reader_make_constant_shell( makeString( "ParenthesizedMathFn" ) );
    $str55$mfenced = makeString( "mfenced" );
    $const56$BracketedMathFn = constant_handles.reader_make_constant_shell( makeString( "BracketedMathFn" ) );
    $list57 = ConsesLow.list( makeString( "open" ), makeString( "[" ), makeString( "close" ), makeString( "]" ) );
    $const58$PowerExpressionFn = constant_handles.reader_make_constant_shell( makeString( "PowerExpressionFn" ) );
    $str59$msup = makeString( "msup" );
    $const60$PrefixMinusFn = constant_handles.reader_make_constant_shell( makeString( "PrefixMinusFn" ) );
    $const61$AbsoluteValueExpressionFn = constant_handles.reader_make_constant_shell( makeString( "AbsoluteValueExpressionFn" ) );
    $str62$_ = makeString( "|" );
    $const63$PaddedExpressionFn = constant_handles.reader_make_constant_shell( makeString( "PaddedExpressionFn" ) );
    $str64$msgroup = makeString( "msgroup" );
    $str65$position = makeString( "position" );
    $const66$MathExpressionFn = constant_handles.reader_make_constant_shell( makeString( "MathExpressionFn" ) );
    $const67$HorizontalDivideFn = constant_handles.reader_make_constant_shell( makeString( "HorizontalDivideFn" ) );
    $str68$mfrac = makeString( "mfrac" );
    $const69$NthRootExpressionFn = constant_handles.reader_make_constant_shell( makeString( "NthRootExpressionFn" ) );
    $list70 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), TWO_INTEGER );
    $str71$msqrt = makeString( "msqrt" );
    $str72$mroot = makeString( "mroot" );
    $const73$MixedFractionFn = constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) );
    $str74$mn = makeString( "mn" );
    $const75$NegativeMixedFractionFn = constant_handles.reader_make_constant_shell( makeString( "NegativeMixedFractionFn" ) );
    $const76$SimpleFractionFn = constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) );
    $const77$DecimalFractionFn = constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) );
    $const78$StrikeNumeratorAndReplaceWithFn = constant_handles.reader_make_constant_shell( makeString( "StrikeNumeratorAndReplaceWithFn" ) );
    $const79$StrikeDenominatorAndReplaceWithFn = constant_handles.reader_make_constant_shell( makeString( "StrikeDenominatorAndReplaceWithFn" ) );
    $const80$InfixSlashDivideFn = constant_handles.reader_make_constant_shell( makeString( "InfixSlashDivideFn" ) );
    $list81 = ConsesLow.list( makeString( "bevelled" ), makeString( "true" ) );
    $const82$FunctionOfVarsFn = constant_handles.reader_make_constant_shell( makeString( "FunctionOfVarsFn" ) );
    $str83$_ = makeString( "(" );
    $str84$_ = makeString( "," );
    $str85$_ = makeString( ")" );
    $const86$TimeExpressionFn = constant_handles.reader_make_constant_shell( makeString( "TimeExpressionFn" ) );
    $str87$_ = makeString( ":" );
    $str88$_2__0d = makeString( "~2,'0d" );
    $sym89$GENERATE_PHRASE = makeSymbol( "GENERATE-PHRASE" );
    $const90$MathStackedEqualsStatementFn = constant_handles.reader_make_constant_shell( makeString( "MathStackedEqualsStatementFn" ) );
    $kw91$IGNORE = makeKeyword( "IGNORE" );
    $str92$msline = makeString( "msline" );
    $str93$mstack = makeString( "mstack" );
    $const94$InsertNumberAtDigitsFn = constant_handles.reader_make_constant_shell( makeString( "InsertNumberAtDigitsFn" ) );
    $const95$StrikeAndReplaceDigitsFn = constant_handles.reader_make_constant_shell( makeString( "StrikeAndReplaceDigitsFn" ) );
    $str96$Can_t_serialize__S_expressions_ = makeString( "Can't serialize ~S expressions." );
    $list97 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "StackedSubtractionExpressionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "StackedAdditionExpressionFn" ) ),
        constant_handles.reader_make_constant_shell( makeString( "StackedMultiplicationExpressionFn" ) ) );
    $str98$Can_t_compute_digit_count_of__A = makeString( "Can't compute digit-count of ~A" );
    $list99 = ConsesLow.list( makeSymbol( "INTEGER" ), makeSymbol( "BACKWARD-DECIMAL-LOCATION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "REPEATING-COUNT" ) );
    $str100$menclose = makeString( "menclose" );
    $list101 = ConsesLow.list( makeString( "notation" ), makeString( "top" ) );
    $list102 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinusFn" ) ), makeKeyword( "ANYTHING" ) );
    $str103$notation = makeString( "notation" );
    $str104$updiagonalstrike = makeString( "updiagonalstrike" );
    $const105$StackedAdditionExpressionFn = constant_handles.reader_make_constant_shell( makeString( "StackedAdditionExpressionFn" ) );
    $const106$InfixPlusFn = constant_handles.reader_make_constant_shell( makeString( "InfixPlusFn" ) );
    $const107$StackedMultiplicationExpressionFn = constant_handles.reader_make_constant_shell( makeString( "StackedMultiplicationExpressionFn" ) );
    $const108$InfixTimesFn = constant_handles.reader_make_constant_shell( makeString( "InfixTimesFn" ) );
    $const109$StackedSubtractionExpressionFn = constant_handles.reader_make_constant_shell( makeString( "StackedSubtractionExpressionFn" ) );
    $const110$InfixMinusFn = constant_handles.reader_make_constant_shell( makeString( "InfixMinusFn" ) );
    $str111$Unable_to_serialize_simple_stacke = makeString( "Unable to serialize simple stacked math expression: ~S" );
    $str112$msrow = makeString( "msrow" );
    $list113 = ConsesLow.list( makeSymbol( "L" ), makeSymbol( "POSITION" ), makeSymbol( "VALUE" ) );
    $str114$mscarries = makeString( "mscarries" );
    $str115$none = makeString( "none" );
    $list116 = ConsesLow.list( makeString( "crossout" ), makeString( "updiagonalstrike" ) );
    $str117$mscarry = makeString( "mscarry" );
    $list118 = ConsesLow.list( makeString( "crossout" ), makeString( "none" ) );
    $str119$mlongdiv = makeString( "mlongdiv" );
    $list120 = ConsesLow.list( makeString( "longdivstyle" ), makeString( "lefttop" ) );
    $list121 = ConsesLow.list( makeKeyword( "SPACE" ) );
    $list122 = ConsesLow.list( makeString( "position" ), makeString( "0" ), makeString( "shift" ), makeString( "-1" ) );
    $str123$length = makeString( "length" );
    $list124 = _constant_124_initializer();
    $sym125$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const126$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const127$mathExpressionNATRenderAs = constant_handles.reader_make_constant_shell( makeString( "mathExpressionNATRenderAs" ) );
    $kw128$GAF = makeKeyword( "GAF" );
    $list129 = ConsesLow.list( makeSymbol( "MATH-EXPRESSION" ), makeSymbol( "HTML" ) );
    $str130$background_color__ = makeString( "background-color: " );
    $str131$CycL = makeString( "CycL" );
    $str132$HTML = makeString( "HTML" );
    $str133$MathML = makeString( "MathML" );
    $int134$32 = makeInteger( 32 );
    $sym135$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym136$SERIALIZE_MATHML_TO_STRING = makeSymbol( "SERIALIZE-MATHML-TO-STRING" );
    $kw137$TEST = makeKeyword( "TEST" );
    $kw138$OWNER = makeKeyword( "OWNER" );
    $kw139$CLASSES = makeKeyword( "CLASSES" );
    $kw140$KB = makeKeyword( "KB" );
    $kw141$FULL = makeKeyword( "FULL" );
    $kw142$WORKING_ = makeKeyword( "WORKING?" );
    $list143 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathEqualsStatementFn" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "ImplicitTimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), THREE_INTEGER ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "x" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "Volt" ) ), makeInteger( 60 ) ) ) ) ), makeString(
                    "<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mrow><mrow><mn>3</mn>\n <mo largeop=\"false\" mathvariant=\"normal\">&#x2062;<!--INVISIBLE TIMES-->\n </mo><mi>x\n </mi></mrow><mo largeop=\"false\" mathvariant=\"normal\">=\n </mo><mrow><mn>60</mn>\n <mspace width=\".5em\"/><mi mathvariant=\"normal\" class=\"MathML-Unit\">volts\n </mi></mrow></mrow>\n</math>" ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HorizontalDivideFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "ImplicitTimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PrefixMinusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                SIX_INTEGER ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathVarFn" ) ), makeString( "y" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "PrefixMinusFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), SIX_INTEGER ) ) ) ), makeString(
                        "<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mfrac><mrow><mrow><mo largeop=\"false\" mathvariant=\"normal\">&#x2212;<!--MINUS-->\n  </mo><mn>6</mn>\n  </mrow><mo largeop=\"false\" mathvariant=\"normal\">&#x2062;<!--INVISIBLE TIMES-->\n  </mo><mi>y\n  </mi></mrow><mrow><mo largeop=\"false\" mathvariant=\"normal\">&#x2212;<!--MINUS-->\n  </mo><mn>6</mn>\n  </mrow>\n </mfrac>\n</math>" ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathStackedEqualsStatementFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "StackedMultiplicationExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), makeInteger( 123 ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "MathQuantFn" ) ), makeInteger( 321 ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "StackedAdditionExpressionFn" ) ), ConsesLow
                    .list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), makeInteger( 123 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ),
                        makeInteger( 2460 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), makeInteger( 36900 ) ) ), ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "MathQuantFn" ) ), makeInteger( 39483 ) ) ) ), makeString(
                                "<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mstack><mn>123</mn>\n  <msrow><mo largeop=\"false\" mathvariant=\"normal\">&#xD7;<!--MULT SIGN-->\n   </mo><mn>321</mn>\n   \n  </msrow><msline>\n  </msline><mn>123</mn>\n  <mn>2460</mn>\n  <msrow><mo largeop=\"false\" mathvariant=\"normal\">+\n   </mo><mn>36900</mn>\n   \n  </msrow><msline>\n  </msline><mn>39483</mn>\n  \n </mstack>\n</math>" ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathStackedEqualsStatementFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "StackedAdditionExpressionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InsertNumberAtDigitsFn" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "MathQuantFn" ) ), makeInteger( 6969 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "TheList" ) ), THREE_INTEGER, ONE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ), FOUR_INTEGER,
                        ONE_INTEGER ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), makeInteger( 23230 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                            makeString( "MathQuantFn" ) ), makeInteger( 464600 ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MathQuantFn" ) ), makeInteger( 4799 ) ) ) ), makeString(
                                "<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mstack><mscarries><mn>1</mn>\n   <mn>1</mn>\n   <none>\n   </none><none>\n   </none><none>\n   </none>\n  </mscarries><mn>6969</mn>\n  <mn>23230</mn>\n  <msrow><mo largeop=\"false\" mathvariant=\"normal\">+\n   </mo><mn>464600</mn>\n   \n  </msrow><msline>\n  </msline><mn>4799</mn>\n  \n </mstack>\n</math>" ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeExpressionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TimeOfDay-PM" ) ),
            EIGHT_INTEGER, FIVE_INTEGER ) ), makeString( "<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n 8:05PM\n</math>" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "TimeExpressionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TimeOfDay-PM" ) ), EIGHT_INTEGER, FIVE_INTEGER,
                THREE_INTEGER ) ), makeString( "<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n 8:05:03PM\n</math>" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "CompoundDurationFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HoursDuration" ) ), EIGHT_INTEGER ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "MinutesDuration" ) ), FIVE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondsDuration" ) ),
                            FOUR_INTEGER ) ) ), makeString( "<math overflow=\"linebreak\" xmlns=\"http://www.w3.org/1998/Math/MathML\">\n <mn>8 hours, 5 minutes, 4 seconds\n </mn>\n</math>" ) ) );
  }
}
/*
 * 
 * Total time: 5339 ms
 * 
 */