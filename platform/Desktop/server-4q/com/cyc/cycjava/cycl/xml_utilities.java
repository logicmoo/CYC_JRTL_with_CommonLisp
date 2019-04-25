package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.xml_utilities";
  public static final String myFingerPrint = "e7c9cb1f7880bc162f20850315e6cd986c364934afaa5401951df48410191408";
  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1033L)
  public static SubLSymbol $xml_version$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1135L)
  public static SubLSymbol $xml_indentation_level$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1187L)
  public static SubLSymbol $xml_indentation_amount$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1361L)
  public static SubLSymbol $cycml_indent_level$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3724L)
  private static SubLSymbol $xml_cdata_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3843L)
  private static SubLSymbol $xml_cdata_suffix$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 11890L)
  private static SubLSymbol $xml_base_char_code_ranges$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 15420L)
  private static SubLSymbol $xml_ideographic_char_code_ranges$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16784L)
  public static SubLSymbol $xml_special_chars$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 24338L)
  private static SubLSymbol $alists_sort_key$;
  private static final SubLFloat $float0$1_0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$VALID_XML_CHAR_P;
  private static final SubLString $str4$Skipping_invalid_xml_character__S;
  private static final SubLSymbol $sym5$CHAR_;
  private static final SubLString $str6$US_ASCII;
  private static final SubLSymbol $sym7$FLOATP;
  private static final SubLSymbol $sym8$STRINGP;
  private static final SubLSymbol $sym9$BOOLEANP;
  private static final SubLString $str10$__xml_version_;
  private static final SubLSymbol $sym11$DOUBLE_FLOAT;
  private static final SubLString $str12$_encoding_;
  private static final SubLString $str13$_standalone_;
  private static final SubLString $str14$yes;
  private static final SubLString $str15$no;
  private static final SubLString $str16$___;
  private static final SubLString $str17$___CDATA_;
  private static final SubLString $str18$___;
  private static final SubLString $str19$____;
  private static final SubLString $str20$___;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$CUNWIND_PROTECT;
  private static final SubLSymbol $sym23$WITH_XML_INDENTATION;
  private static final SubLSymbol $sym24$XML_START_TAG_INTERNAL;
  private static final SubLSymbol $sym25$_XML_DEFAULT_NAMESPACE_;
  private static final SubLSymbol $sym26$PUNLESS;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$XML_END_TAG_INTERNAL;
  private static final SubLString $str29$xmlns;
  private static final SubLString $str30$__;
  private static final SubLString $str31$__;
  private static final SubLString $str32$__;
  private static final SubLString $str33$_;
  private static final SubLString $str34$_;
  private static final SubLSymbol $sym35$VALID_XML_NAME_CHAR_P;
  private static final SubLSymbol $sym36$VALID_XML_NAME_CHAR_CODE_P;
  private static final SubLList $list37;
  private static final SubLObject $list38;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLString $str42$_;
  private static final SubLInteger $int43$34;
  private static final SubLString $str44$_quot_;
  private static final SubLInteger $int45$38;
  private static final SubLString $str46$_amp_;
  private static final SubLInteger $int47$39;
  private static final SubLString $str48$_apos_;
  private static final SubLInteger $int49$60;
  private static final SubLString $str50$_lt_;
  private static final SubLInteger $int51$62;
  private static final SubLString $str52$_gt_;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$DIGIT_CHAR_P;
  private static final SubLSymbol $sym55$HEX_CHAR_P;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$_XML_STREAM_;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$SYMBOLP;
  private static final SubLSymbol $sym60$STREAM;
  private static final SubLSymbol $sym61$CWITH_OUTPUT_TO_STRING;
  private static final SubLSymbol $sym62$WITH_XML_OUTPUT_TO_STREAM;
  private static final SubLSymbol $sym63$GENERATE_VALID_XML_HEADER;
  private static final SubLList $list64;
  private static final SubLString $str65$__DOCTYPE__A_SYSTEM__S_;
  private static final SubLList $list66;
  private static final SubLString $str67$xmlns_;
  private static final SubLList $list68;
  private static final SubLList $list69;
  private static final SubLString $str70$xml_;
  private static final SubLString $str71$http_;
  private static final SubLString $str72$Couldn_t_resolve__S_based_on__S_a;
  private static final SubLSymbol $sym73$LISTP;
  private static final SubLSymbol $kw74$UNINITIALIZED;
  private static final SubLSymbol $sym75$TERM___WITH_CONSTANT_BY_NAME;
  private static final SubLSymbol $sym76$ALISTS_SORT_KEY;
  private static final SubLSymbol $kw77$NAME;
  private static final SubLSymbol $kw78$ATTRIBUTES;
  private static final SubLSymbol $kw79$ELEMENTS;
  private static final SubLSymbol $kw80$TEXT;
  private static final SubLList $list81;
  private static final SubLString $str82$__A;
  private static final SubLString $str83$__;
  private static final SubLString $str84$__A__A;
  private static final SubLString $str85$___;
  private static final SubLString $str86$_A__;
  private static final SubLString $str87$___A___;
  private static final SubLString $str88$____;
  private static final SubLSymbol $kw89$SORT_ASC;
  private static final SubLSymbol $kw90$SORT_DESC;
  private static final SubLString $str91$__name__binding___elements__;
  private static final SubLString $str92$__name__;
  private static final SubLString $str93$___text_;
  private static final SubLString $str94$__;
  private static final SubLString $str95$__;
  private static final SubLString $str96$root;
  private static final SubLSymbol $sym97$QUERY_RESULTS_TO_XML_STREAM;
  private static final SubLSymbol $kw98$DEFAULT;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$URL_P;
  private static final SubLSymbol $kw101$INPUT;
  private static final SubLString $str102$Unable_to_open__S;
  private static final SubLInteger $int103$2000;
  private static final SubLString $str104$404;
  private static final SubLString $str105$Not_Found;
  private static final SubLString $str106$Url_not_found_;
  private static final SubLString $str107$503_Service_Temporarily_Unavailab;
  private static final SubLString $str108$Server_not_available;
  private static final SubLString $str109$__xml;
  private static final SubLString $str110$Not_XML_document__Starts_with_;
  private static final SubLString $str111$Encountered_error_trying_to_downl;
  private static final SubLSymbol $sym112$QUERY_RESULTS_TO_XML_FILE;
  private static final SubLSymbol $kw113$OUTPUT;
  private static final SubLSymbol $sym114$QUERY_RESULTS_TO_XML_STRING;
  private static final SubLString $str115$true;
  private static final SubLString $str116$false;

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1079L)
  public static SubLObject xml_version()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $xml_version$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1239L)
  public static SubLObject xml_add_indentation(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return string_utilities.indent( stream, $xml_indentation_level$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1410L)
  public static SubLObject with_xml_indentation(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list2, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1679L)
  public static SubLObject xml_terpri()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    streams_high.terpri( xml_vars.$xml_stream$.getDynamicValue( thread ) );
    xml_add_indentation( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 1771L)
  public static SubLObject xml_write_string(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.find_if_not( $sym3$VALID_XML_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject end_var_$1;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var = ( end_var_$1 = ( ( NIL != end ) ? end : Sequences.length( string ) ) ), char_num = NIL, char_num = start; !char_num.numGE( end_var_$1 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string, char_num );
        if( NIL != valid_xml_char_p( v_char ) )
        {
          streams_high.write_char( v_char, xml_vars.$xml_stream$.getDynamicValue( thread ) );
        }
        else
        {
          Errors.warn( $str4$Skipping_invalid_xml_character__S, v_char, string );
        }
      }
    }
    else
    {
      streams_high.write_string( string, xml_vars.$xml_stream$.getDynamicValue( thread ), start, end );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 2298L)
  public static SubLObject xml_write_char(final SubLObject v_char)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != valid_xml_char_p( v_char ) : v_char;
    streams_high.write_char( v_char, xml_vars.$xml_stream$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 2453L)
  public static SubLObject xml_write_string_indented(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( NIL == end )
    {
      end = Sequences.length( string );
    }
    while ( start.numL( end ))
    {
      final SubLObject end_of_line = Sequences.position( Characters.CHAR_newline, string, Symbols.symbol_function( $sym5$CHAR_ ), Symbols.symbol_function( IDENTITY ), start, end );
      final SubLObject fragment_end = end_of_line.isFixnum() ? end_of_line : end;
      xml_write_string( string, start, fragment_end );
      if( end_of_line.isFixnum() )
      {
        xml_terpri();
      }
      start = Numbers.add( fragment_end, ONE_INTEGER );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3048L)
  public static SubLObject xml_header(SubLObject version, SubLObject encoding, SubLObject standalone)
  {
    if( version == UNPROVIDED )
    {
      version = $xml_version$.getDynamicValue();
    }
    if( encoding == UNPROVIDED )
    {
      encoding = $str6$US_ASCII;
    }
    if( standalone == UNPROVIDED )
    {
      standalone = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.floatp( version ) : version;
    assert NIL != Types.stringp( encoding ) : encoding;
    assert NIL != Types.booleanp( standalone ) : standalone;
    xml_write_string( $str10$__xml_version_, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
    try
    {
      reader.$read_default_float_format$.bind( $sym11$DOUBLE_FLOAT, thread );
      print_high.prin1( print_high.prin1_to_string( version ), xml_vars.$xml_stream$.getDynamicValue( thread ) );
    }
    finally
    {
      reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
    }
    xml_write_string( $str12$_encoding_, UNPROVIDED, UNPROVIDED );
    print_high.prin1( encoding, xml_vars.$xml_stream$.getDynamicValue( thread ) );
    xml_write_string( $str13$_standalone_, UNPROVIDED, UNPROVIDED );
    print_high.prin1( ( NIL != standalone ) ? $str14$yes : $str15$no, xml_vars.$xml_stream$.getDynamicValue( thread ) );
    xml_write_string( $str16$___, UNPROVIDED, UNPROVIDED );
    streams_high.terpri( xml_vars.$xml_stream$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3777L)
  public static SubLObject xml_cdata_prefix()
  {
    return $xml_cdata_prefix$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3890L)
  public static SubLObject xml_cdata_suffix()
  {
    return $xml_cdata_suffix$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 3956L)
  public static SubLObject xml_cdata(final SubLObject string)
  {
    xml_write_string( xml_cdata_prefix(), UNPROVIDED, UNPROVIDED );
    xml_write_string( string, UNPROVIDED, UNPROVIDED );
    xml_write_string( xml_cdata_suffix(), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 4428L)
  public static SubLObject xml_markup(final SubLObject string)
  {
    xml_write_string( string, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 4689L)
  public static SubLObject xml_comment(final SubLObject string)
  {
    xml_write_string( $str19$____, UNPROVIDED, UNPROVIDED );
    xml_write_string( string, UNPROVIDED, UNPROVIDED );
    xml_write_string( $str20$___, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 5056L)
  public static SubLObject xml_tag(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    name = current.first();
    current = current.rest();
    final SubLObject attributes = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list21 );
    current = current.rest();
    final SubLObject atomicP = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list21 );
    current = current.rest();
    final SubLObject no_nested_elementsP = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list21 );
    current = current.rest();
    final SubLObject multiple_line_attributesP = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list21 );
    current = current.rest();
    final SubLObject default_namespace = current.isCons() ? current.first() : xml_vars.$xml_default_namespace$.getDynamicValue( thread );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list21 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym22$CUNWIND_PROTECT, ConsesLow.list( $sym23$WITH_XML_INDENTATION, ConsesLow.list( $sym24$XML_START_TAG_INTERNAL, name, attributes, atomicP, multiple_line_attributesP, default_namespace ),
          ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym25$_XML_DEFAULT_NAMESPACE_, default_namespace ) ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym26$PUNLESS, atomicP, ConsesLow.listS(
              $sym26$PUNLESS, no_nested_elementsP, $list27 ), ConsesLow.list( $sym28$XML_END_TAG_INTERNAL, name ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 6172L)
  public static SubLObject xml_start_tag_internal(final SubLObject name, SubLObject attributes, final SubLObject atomicP, SubLObject multiple_line_attributesP, SubLObject default_namespace)
  {
    if( multiple_line_attributesP == UNPROVIDED )
    {
      multiple_line_attributesP = NIL;
    }
    if( default_namespace == UNPROVIDED )
    {
      default_namespace = xml_vars.$xml_default_namespace$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    xml_write_char( Characters.CHAR_less );
    xml_write_string( name, UNPROVIDED, UNPROVIDED );
    if( NIL != misc_utilities.initialized_p( default_namespace ) )
    {
      assert NIL != Types.stringp( default_namespace ) : default_namespace;
      if( !default_namespace.equal( xml_vars.$xml_default_namespace$.getDynamicValue( thread ) ) )
      {
        attributes = conses_high.putf( attributes, $str29$xmlns, default_namespace );
      }
    }
    SubLObject att_list = NIL;
    SubLObject att_name = NIL;
    SubLObject att_value = NIL;
    att_list = attributes;
    att_name = att_list.first();
    att_value = conses_high.second( att_list );
    while ( NIL != att_name)
    {
      xml_write_char( Characters.CHAR_space );
      xml_write_string( att_name, UNPROVIDED, UNPROVIDED );
      xml_write_string( $str30$__, UNPROVIDED, UNPROVIDED );
      xml_write_wXescaped_special_chars( att_value.isString() ? att_value : print_high.prin1_to_string( att_value ) );
      xml_write_char( Characters.CHAR_quotation );
      if( NIL != multiple_line_attributesP )
      {
        xml_terpri();
      }
      att_list = conses_high.cddr( att_list );
      att_name = att_list.first();
      att_value = conses_high.second( att_list );
    }
    if( NIL != atomicP )
    {
      xml_write_string( $str31$__, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      xml_write_char( Characters.CHAR_greater );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 7546L)
  public static SubLObject xml_end_tag_internal(final SubLObject name)
  {
    xml_write_string( $str32$__, UNPROVIDED, UNPROVIDED );
    xml_write_string( name, UNPROVIDED, UNPROVIDED );
    xml_write_char( Characters.CHAR_greater );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 7807L)
  public static SubLObject xml_print(final SubLObject v_object, SubLObject entity_table)
  {
    if( entity_table == UNPROVIDED )
    {
      entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
    }
    xml_write( string_utilities.to_string( v_object ), entity_table );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 7946L)
  public static SubLObject xml_prin1(final SubLObject v_object, SubLObject entity_table)
  {
    if( entity_table == UNPROVIDED )
    {
      entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
    }
    xml_write( print_high.prin1_to_string( v_object ), entity_table );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 8090L)
  public static SubLObject xml_print_line(final SubLObject v_object, SubLObject entity_table)
  {
    if( entity_table == UNPROVIDED )
    {
      entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
    }
    xml_write_line( string_utilities.to_string( v_object ), entity_table );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 8238L)
  public static SubLObject xml_prin1_line(final SubLObject v_object, SubLObject entity_table)
  {
    if( entity_table == UNPROVIDED )
    {
      entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
    }
    xml_write_line( print_high.prin1_to_string( v_object ), entity_table );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 8392L)
  public static SubLObject xml_write(final SubLObject string, SubLObject entity_table)
  {
    if( entity_table == UNPROVIDED )
    {
      entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
    }
    assert NIL != Types.stringp( string ) : string;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject ch;
    SubLObject ent;
    for( cdotimes_end_var = Sequences.length( string ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      ch = Strings.sublisp_char( string, i );
      ent = conses_high.assoc( ch, entity_table, UNPROVIDED, UNPROVIDED );
      if( NIL != ent )
      {
        xml_write_string( Sequences.cconcatenate( $str33$_, new SubLObject[] { ent.rest(), $str34$_
        } ), UNPROVIDED, UNPROVIDED );
      }
      else
      {
        xml_write_char( ch );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 8714L)
  public static SubLObject xml_write_line(final SubLObject string, SubLObject entity_table)
  {
    if( entity_table == UNPROVIDED )
    {
      entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
    }
    assert NIL != Types.stringp( string ) : string;
    xml_write( string, entity_table );
    xml_write_char( Characters.CHAR_newline );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 8905L)
  public static SubLObject valid_xml_name_p(final SubLObject name)
  {
    return makeBoolean( NIL != string_utilities.non_empty_string_p( name ) && NIL != ( ( NIL != unicode_strings.ascii_string_p( name ) ) ? valid_ascii_xml_name_p( name ) : valid_non_ascii_xml_name_p( name ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 9093L)
  public static SubLObject remove_invalid_xml_name_chars(final SubLObject name)
  {
    assert NIL != Types.stringp( name ) : name;
    return ( NIL != unicode_strings.ascii_string_p( name ) ) ? remove_invalid_xml_name_chars_from_ascii_string( name ) : remove_invalid_xml_name_chars_from_non_ascii_string( name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 9406L)
  public static SubLObject valid_ascii_xml_name_p(final SubLObject name)
  {
    return makeBoolean( NIL != valid_xml_name_initial_char_p( string_utilities.first_char( name ) ) && NIL == list_utilities.find_if_not( $sym35$VALID_XML_NAME_CHAR_P, name, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 9574L)
  public static SubLObject valid_xml_name_initial_char_p(final SubLObject v_char)
  {
    return makeBoolean( v_char.eql( Characters.CHAR_underbar ) || v_char.eql( Characters.CHAR_colon ) || NIL != xml_letter_char_p( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 9706L)
  public static SubLObject valid_xml_name_initial_char_code_p(final SubLObject code)
  {
    return makeBoolean( code.eql( Characters.char_code( Characters.CHAR_underbar ) ) || code.eql( Characters.char_code( Characters.CHAR_colon ) ) || NIL != xml_letter_char_code_p( code ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 9874L)
  public static SubLObject valid_non_ascii_xml_name_p(final SubLObject name)
  {
    final SubLObject char_codes = unicode_strings.utf8_string_to_unicode_vector( name );
    return makeBoolean( ( string_utilities.first_char( name ).eql( Characters.CHAR_underbar ) || string_utilities.first_char( name ).eql( Characters.CHAR_colon ) || NIL != xml_letter_char_code_p( Vectors.aref(
        char_codes, ZERO_INTEGER ) ) ) && NIL == list_utilities.find_if_not( $sym36$VALID_XML_NAME_CHAR_CODE_P, char_codes, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 10189L)
  public static SubLObject valid_xml_name_char_p(final SubLObject v_char)
  {
    return valid_xml_name_char_code_p( Characters.char_code( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 10290L)
  public static SubLObject remove_invalid_xml_name_chars_from_ascii_string(final SubLObject name)
  {
    SubLObject new_name;
    for( new_name = name; NIL == string_utilities.empty_string_p( new_name ) && NIL == valid_xml_name_initial_char_p( string_utilities.first_char( new_name ) ); new_name = string_utilities.substring( new_name,
        ONE_INTEGER, UNPROVIDED ) )
    {
    }
    return list_utilities.remove_if_not( $sym35$VALID_XML_NAME_CHAR_P, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 10594L)
  public static SubLObject remove_invalid_xml_name_chars_from_non_ascii_string(final SubLObject name)
  {
    SubLObject char_codes = unicode_strings.utf8_string_to_unicode_vector( name );
    SubLObject found_invalidP = NIL;
    while ( NIL == list_utilities.lengthE( char_codes, ZERO_INTEGER, UNPROVIDED ) && NIL == valid_xml_name_initial_char_code_p( Vectors.aref( char_codes, ZERO_INTEGER ) ))
    {
      found_invalidP = T;
      char_codes = Sequences.subseq( char_codes, ONE_INTEGER, UNPROVIDED );
    }
    if( NIL != found_invalidP || NIL != list_utilities.find_if_not( $sym36$VALID_XML_NAME_CHAR_CODE_P, char_codes, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return unicode_strings.utf8_vector_to_utf8_string( unicode_strings.unicode_vector_to_utf8_vector( list_utilities.delete_if_not( $sym36$VALID_XML_NAME_CHAR_CODE_P, char_codes, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ), UNPROVIDED, UNPROVIDED ) );
    }
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 11163L)
  public static SubLObject valid_xml_name_char_code_p(final SubLObject code)
  {
    return makeBoolean( NIL != subl_promotions.non_negative_integer_p( code ) && ( NIL != xml_letter_char_code_p( code ) || NIL != digit_char_code_p( code ) || NIL != conses_high.member( code, $list37, UNPROVIDED,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 11414L)
  public static SubLObject digit_char_code_p(final SubLObject code)
  {
    return makeBoolean( code.numGE( Characters.char_code( Characters.CHAR_0 ) ) && code.numLE( Characters.char_code( Characters.CHAR_9 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 11642L)
  public static SubLObject xml_letter_char_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != xml_base_char_p( v_char ) || NIL != xml_ideographic_char_p( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 11757L)
  public static SubLObject xml_letter_char_code_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != xml_base_char_code_p( v_object ) || NIL != xml_ideographic_char_code_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 15532L)
  public static SubLObject xml_base_char_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && NIL != char_in_ranges_p( v_object, $xml_base_char_code_ranges$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 15670L)
  public static SubLObject xml_base_char_code_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isNumber() && NIL != char_code_in_ranges_p( v_object, $xml_base_char_code_ranges$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 15814L)
  public static SubLObject xml_ideographic_char_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && NIL != char_in_ranges_p( v_object, $xml_ideographic_char_code_ranges$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 15966L)
  public static SubLObject xml_ideographic_char_code_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isNumber() && NIL != char_code_in_ranges_p( v_object, $xml_ideographic_char_code_ranges$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16124L)
  public static SubLObject valid_xml_char_p(final SubLObject v_char)
  {
    return makeBoolean( v_char.isChar() && NIL != char_code_in_ranges_p( Characters.char_code( v_char ), xml_vars.$xml_valid_char_code_ranges$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16274L)
  public static SubLObject valid_xml_char_code_p(final SubLObject char_code)
  {
    return makeBoolean( char_code.isNumber() && NIL != char_code_in_ranges_p( char_code, xml_vars.$xml_valid_char_code_ranges$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16429L)
  public static SubLObject char_in_ranges_p(final SubLObject v_char, final SubLObject v_ranges)
  {
    return char_code_in_ranges_p( Characters.char_code( v_char ), v_ranges );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16535L)
  public static SubLObject char_code_in_ranges_p(final SubLObject char_code, final SubLObject v_ranges)
  {
    SubLObject okP = NIL;
    if( NIL == okP )
    {
      SubLObject csome_list_var = v_ranges;
      SubLObject range = NIL;
      range = csome_list_var.first();
      while ( NIL == okP && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = range;
        SubLObject low = NIL;
        SubLObject high = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
        low = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
        high = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( char_code.numGE( low ) && char_code.numLE( high ) )
          {
            okP = T;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list40 );
        }
        csome_list_var = csome_list_var.rest();
        range = csome_list_var.first();
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16853L)
  public static SubLObject xml_special_charP(final SubLObject v_char)
  {
    return makeBoolean( NIL != string_utilities.control_char_p( v_char ) || NIL != conses_high.member( v_char, $xml_special_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 16970L)
  public static SubLObject xml_char_escaped_version(final SubLObject v_char)
  {
    if( NIL != string_utilities.control_char_p( v_char ) )
    {
      return $str42$_;
    }
    final SubLObject pcase_var = Characters.char_code( v_char );
    if( pcase_var.eql( $int43$34 ) )
    {
      return $str44$_quot_;
    }
    if( pcase_var.eql( $int45$38 ) )
    {
      return $str46$_amp_;
    }
    if( pcase_var.eql( $int47$39 ) )
    {
      return $str48$_apos_;
    }
    if( pcase_var.eql( $int49$60 ) )
    {
      return $str50$_lt_;
    }
    if( pcase_var.eql( $int51$62 ) )
    {
      return $str52$_gt_;
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return $str42$_;
    }
    return PrintLow.write_to_string( v_char, EMPTY_SUBL_OBJECT_ARRAY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 17285L)
  public static SubLObject xml_unescape_string(final SubLObject str)
  {
    return string_utilities.do_string_substitutions_robust( str, $list53, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 17461L)
  public static SubLObject xml_write_wXescaped_special_chars(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    SubLObject end_var_$2;
    SubLObject end_var;
    SubLObject i;
    SubLObject v_char;
    for( end_var = ( end_var_$2 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$2 ); i = number_utilities.f_1X( i ) )
    {
      v_char = Strings.sublisp_char( string, i );
      if( v_char.eql( Characters.CHAR_newline ) )
      {
        xml_write_char( v_char );
      }
      else if( v_char.eql( Characters.CHAR_ampersand ) && NIL != possible_xml_entity_reference_p( string, i, UNPROVIDED ) )
      {
        xml_write_char( v_char );
      }
      else if( NIL != xml_special_charP( v_char ) )
      {
        xml_write_string( xml_char_escaped_version( v_char ), UNPROVIDED, UNPROVIDED );
      }
      else if( NIL == valid_xml_char_p( v_char ) )
      {
        xml_write_char( Characters.CHAR_space );
      }
      else
      {
        xml_write_char( v_char );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 17975L)
  public static SubLObject possible_xml_entity_reference_p(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( Strings.sublisp_char( string, start ).eql( Characters.CHAR_ampersand ) && NIL != list_utilities.lengthG( string, Numbers.add( start, TWO_INTEGER ), UNPROVIDED ) && NIL != valid_xml_entity_name_first_char_p(
        Strings.sublisp_char( string, number_utilities.f_1X( start ) ) ) )
    {
      final SubLObject name_stream = streams_high.make_private_string_output_stream();
      print_high.princ( Strings.sublisp_char( string, number_utilities.f_1X( start ) ), name_stream );
      SubLObject end_var_$3;
      SubLObject end_var;
      SubLObject i;
      SubLObject v_char;
      for( end_var = ( end_var_$3 = Sequences.length( string ) ), i = NIL, i = Numbers.add( start, TWO_INTEGER ); !i.numGE( end_var_$3 ); i = number_utilities.f_1X( i ) )
      {
        v_char = Strings.sublisp_char( string, i );
        if( v_char.eql( Characters.CHAR_semicolon ) )
        {
          return possible_xml_entity_name_p( streams_high.get_output_stream_string( name_stream ) );
        }
        if( end.isInteger() && i.numG( end ) )
        {
          return NIL;
        }
        if( NIL == valid_xml_entity_name_char_p( v_char ) )
        {
          return NIL;
        }
        print_high.princ( v_char, name_stream );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 18636L)
  public static SubLObject possible_xml_entity_name_p(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != misc_utilities.uninitialized_p( xml_vars.$xml_document_entity_names$.getDynamicValue( thread ) ) )
    {
      return T;
    }
    if( NIL != possible_xml_numeric_character_reference_p( string ) )
    {
      return T;
    }
    if( NIL != list_utilities.alist_has_keyP( xml_vars.$xml_predefined_entities$.getGlobalValue(), string, UNPROVIDED ) )
    {
      return T;
    }
    return subl_promotions.memberP( string, xml_vars.$xml_document_entity_names$.getDynamicValue( thread ), Symbols.symbol_function( EQUALP ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 18967L)
  public static SubLObject possible_xml_numeric_character_reference_p(final SubLObject string)
  {
    SubLObject possibleP = NIL;
    if( string_utilities.first_char( string ).eql( Characters.CHAR_hash ) )
    {
      if( NIL == list_utilities.find_if_not( $sym54$DIGIT_CHAR_P, string, Symbols.symbol_function( IDENTITY ), ONE_INTEGER, UNPROVIDED ) )
      {
        possibleP = T;
      }
      else if( Strings.sublisp_char( string, ONE_INTEGER ).eql( Characters.CHAR_x ) && NIL == list_utilities.find_if_not( $sym55$HEX_CHAR_P, string, Symbols.symbol_function( IDENTITY ), TWO_INTEGER, UNPROVIDED ) )
      {
        possibleP = T;
      }
    }
    return possibleP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 19435L)
  public static SubLObject valid_xml_entity_name_first_char_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != Characters.alpha_char_p( v_char ) || v_char.eql( Characters.CHAR_underbar ) || v_char.eql( Characters.CHAR_colon ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 19566L)
  public static SubLObject valid_xml_entity_name_char_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != valid_xml_entity_name_first_char_p( v_char ) || NIL != Characters.digit_char_p( v_char, UNPROVIDED ) || v_char.eql( Characters.CHAR_period ) || v_char.eql( Characters.CHAR_hyphen ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 19836L)
  public static SubLObject with_xml_output_to_stream(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    stream = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym57$_XML_STREAM_, stream ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 20012L)
  public static SubLObject with_xml_output_to_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject string_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    string_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.symbolp( string_var ) : string_var;
    final SubLObject stream = $sym60$STREAM;
    return ConsesLow.list( $sym61$CWITH_OUTPUT_TO_STRING, ConsesLow.list( stream, string_var ), ConsesLow.listS( $sym62$WITH_XML_OUTPUT_TO_STREAM, stream, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 20401L)
  public static SubLObject generate_valid_xml_header(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( stream, thread );
      xml_header( xml_version(), $str6$US_ASCII, NIL );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 20713L)
  public static SubLObject generate_xml_header_entry_for_dtd(final SubLObject sysid, final SubLObject dtd, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    PrintLow.format( stream, $str65$__DOCTYPE__A_SYSTEM__S_, sysid, dtd );
    xml_terpri();
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 21047L)
  public static SubLObject resolve_xml_namespaces(final SubLObject token, final SubLObject stack)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject resolved = string_utilities.copy_string( token );
    SubLObject new_bindings = NIL;
    SubLObject current;
    final SubLObject datum = current = xml_parsing_utilities.parse_xml_token( token );
    SubLObject element_name = NIL;
    SubLObject attributes = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list66 );
    element_name = current.first();
    current = ( attributes = current.rest() );
    if( NIL != string_utilities.substringP( $str67$xmlns_, token, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = attributes;
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current_$5;
        final SubLObject datum_$4 = current_$5 = cons;
        SubLObject attribute = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$5, datum_$4, $list68 );
        attribute = current_$5.first();
        current_$5 = ( value = current_$5.rest() );
        if( NIL != string_utilities.starts_with( attribute, $str67$xmlns_ ) )
        {
          new_bindings = ConsesLow.cons( ConsesLow.cons( string_utilities.substring( attribute, SIX_INTEGER, Sequences.position( Characters.CHAR_equal, attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ),
              value ), new_bindings );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    final SubLObject resolved_element_name = maybe_resolve_xml_namespace( element_name, new_bindings, stack );
    SubLObject something_changedP = string_utilities.non_empty_string_p( resolved_element_name );
    final SubLObject new_element_name = ( NIL != resolved_element_name ) ? resolved_element_name : element_name;
    SubLObject new_attributes = attributes;
    SubLObject cdolist_list_var2 = attributes;
    SubLObject cons2 = NIL;
    cons2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject current_$6;
      final SubLObject datum_$5 = current_$6 = cons2;
      SubLObject key = NIL;
      SubLObject value2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$6, datum_$5, $list69 );
      key = current_$6.first();
      current_$6 = ( value2 = current_$6.rest() );
      final SubLObject new_value = maybe_resolve_xml_namespace( value2, new_bindings, stack );
      if( NIL != new_value )
      {
        new_attributes = list_utilities.alist_enter( new_attributes, key, new_value, Symbols.symbol_function( EQUAL ) );
        something_changedP = T;
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      cons2 = cdolist_list_var2.first();
    }
    if( NIL != something_changedP )
    {
      SubLObject stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( stream, thread );
          if( NIL != xml_parsing_utilities.xml_opening_tag_p( token ) || NIL != xml_parsing_utilities.xml_empty_tagP( token ) )
          {
            xml_start_tag_internal( new_element_name, list_utilities.alist_to_plist( new_attributes ), xml_parsing_utilities.xml_empty_tagP( token ), UNPROVIDED, UNPROVIDED );
          }
          else
          {
            xml_end_tag_internal( new_element_name );
          }
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
        }
        resolved = streams_high.get_output_stream_string( stream );
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
    }
    return Values.values( resolved, new_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 22395L)
  public static SubLObject maybe_resolve_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack)
  {
    return ( NIL != Sequences.find( Characters.CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == string_utilities.starts_with( name, $str67$xmlns_ ) && NIL == string_utilities.starts_with(
        name, $str70$xml_ ) && NIL == string_utilities.starts_with( name, $str71$http_ ) ) ? resolve_xml_namespace( name, new_bindings, stack ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 22670L)
  public static SubLObject resolve_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack)
  {
    final SubLObject namespace = xml_parsing_utilities.xml_prefixed_name_namespace( name );
    SubLObject expanded = list_utilities.alist_lookup_without_values( new_bindings, namespace, Symbols.symbol_function( EQUAL ), NIL );
    if( NIL == expanded )
    {
      SubLObject csome_list_var = stack;
      SubLObject binding = NIL;
      binding = csome_list_var.first();
      while ( NIL == expanded && NIL != csome_list_var)
      {
        if( binding.isCons() && namespace.equal( binding.first() ) )
        {
          expanded = binding.rest();
        }
        csome_list_var = csome_list_var.rest();
        binding = csome_list_var.first();
      }
    }
    if( NIL == expanded )
    {
      Errors.error( $str72$Couldn_t_resolve__S_based_on__S_a, name, new_bindings, stack );
    }
    return Sequences.cconcatenate( expanded, xml_parsing_utilities.xml_prefixed_name_local_name( name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 23256L)
  public static SubLObject xml_sexpr_output_as_xml(final SubLObject sexpr)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( sexpr.isString() )
    {
      xml_write_string( sexpr, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      final SubLObject atomicP = NIL;
      final SubLObject no_nested_elementsP = Types.sublisp_null( Sequences.find_if( $sym73$LISTP, xml_parsing_utilities.xml_sexpr_daughters( sexpr, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      try
      {
        final SubLObject _prev_bind_0 = $xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = $cycml_indent_level$.currentBinding( thread );
        try
        {
          $xml_indentation_level$.bind( Numbers.add( $xml_indentation_amount$.getDynamicValue( thread ), $xml_indentation_level$.getDynamicValue( thread ) ), thread );
          $cycml_indent_level$.bind( $xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_start_tag_internal( xml_parsing_utilities.xml_sexpr_type( sexpr ), xml_tag_attributes_from_sexpr( sexpr ), atomicP, NIL, $kw74$UNINITIALIZED );
          final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw74$UNINITIALIZED, thread );
            xml_sexpr_output_daughters( sexpr, UNPROVIDED );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$8, thread );
          }
        }
        finally
        {
          $cycml_indent_level$.rebind( _prev_bind_2, thread );
          $xml_indentation_level$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL == atomicP )
          {
            if( NIL == no_nested_elementsP )
            {
              xml_terpri();
            }
            xml_end_tag_internal( xml_parsing_utilities.xml_sexpr_type( sexpr ) );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 23774L)
  public static SubLObject xml_sexpr_output_daughters(final SubLObject sexpr, SubLObject tag)
  {
    if( tag == UNPROVIDED )
    {
      tag = NIL;
    }
    final SubLObject dtrs = xml_parsing_utilities.xml_sexpr_daughters( sexpr, tag );
    SubLObject list_var = NIL;
    SubLObject dtr_sexpr = NIL;
    SubLObject dtr_num = NIL;
    list_var = dtrs;
    dtr_sexpr = list_var.first();
    for( dtr_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), dtr_sexpr = list_var.first(), dtr_num = Numbers.add( ONE_INTEGER, dtr_num ) )
    {
      xml_sexpr_output_as_xml( dtr_sexpr );
      if( !dtr_sexpr.isString() && NIL == list_utilities.lengthE( dtrs, number_utilities.f_1X( dtr_num ), UNPROVIDED ) )
      {
        xml_terpri();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 24141L)
  public static SubLObject xml_tag_attributes_from_sexpr(final SubLObject sexpr)
  {
    return list_utilities.alist_to_plist( xml_parsing_utilities.xml_sexpr_attributes( sexpr ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 24481L)
  public static SubLObject alists_sort_key(final SubLObject alist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.alist_lookup( alist, $alists_sort_key$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 24571L)
  public static SubLObject attribute_vars(final SubLObject attributes)
  {
    SubLObject attribute_vars = NIL;
    SubLObject grouping_key_pairs = NIL;
    SubLObject remainder;
    SubLObject attribute_name;
    SubLObject attribute_var;
    for( remainder = NIL, remainder = attributes; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      attribute_name = remainder.first();
      attribute_var = conses_high.cadr( remainder );
      if( attribute_var.isString() )
      {
        grouping_key_pairs = ConsesLow.cons( ConsesLow.cons( attribute_var, attribute_var ), grouping_key_pairs );
      }
      attribute_vars = ConsesLow.cons( attribute_var, attribute_vars );
    }
    return Values.values( attribute_vars, grouping_key_pairs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 24969L)
  public static SubLObject sort_query_results_on_el_var(final SubLObject alists, final SubLObject sort_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = $alists_sort_key$.currentBinding( thread );
    try
    {
      $alists_sort_key$.bind( sort_key, thread );
      results = Sort.sort( conses_high.copy_list( alists ), Symbols.symbol_function( $sym75$TERM___WITH_CONSTANT_BY_NAME ), $sym76$ALISTS_SORT_KEY );
    }
    finally
    {
      $alists_sort_key$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 25216L)
  public static SubLObject write_xml_from_grouped_bindings(final SubLObject grouped_bindings, final SubLObject xml_spec, final SubLObject indent_num, final SubLObject output_stream, final SubLObject cycl_prefixP)
  {
    final SubLObject name = conses_high.getf( xml_spec, $kw77$NAME, UNPROVIDED );
    final SubLObject attributes = conses_high.getf( xml_spec, $kw78$ATTRIBUTES, UNPROVIDED );
    final SubLObject elements = conses_high.getf( xml_spec, $kw79$ELEMENTS, UNPROVIDED );
    final SubLObject text = conses_high.getf( xml_spec, $kw80$TEXT, UNPROVIDED );
    final SubLObject attribute_vars = attribute_vars( attributes );
    SubLObject cdolist_list_var = grouped_bindings;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject grouping_key_tuples = NIL;
      SubLObject other_bindings = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list81 );
      grouping_key_tuples = current.first();
      current = ( other_bindings = current.rest() );
      string_utilities.indent( output_stream, indent_num );
      PrintLow.format( output_stream, $str82$__A, name );
      if( grouping_key_tuples.isList() )
      {
        SubLObject cdolist_list_var_$9 = attribute_vars;
        SubLObject attribute_var = NIL;
        attribute_var = cdolist_list_var_$9.first();
        while ( NIL != cdolist_list_var_$9)
        {
          SubLObject value = format_nil.format_nil_a( list_utilities.alist_lookup( grouping_key_tuples, attribute_var, UNPROVIDED, UNPROVIDED ) );
          if( NIL == cycl_prefixP )
          {
            value = string_utilities.remove_substring( value, $str83$__ );
          }
          PrintLow.format( output_stream, $str84$__A__A, conses_high.getf( Sequences.reverse( attributes ), attribute_var, UNPROVIDED ), string_utilities.quote_string( value, UNPROVIDED ) );
          cdolist_list_var_$9 = cdolist_list_var_$9.rest();
          attribute_var = cdolist_list_var_$9.first();
        }
      }
      if( NIL != elements || NIL != text )
      {
        PrintLow.format( output_stream, $str85$___ );
        if( NIL != text )
        {
          string_utilities.indent( output_stream, indent_num );
          SubLObject value2 = format_nil.format_nil_a( list_utilities.alist_lookup( grouping_key_tuples, text, UNPROVIDED, UNPROVIDED ) );
          if( NIL == cycl_prefixP )
          {
            value2 = string_utilities.remove_substring( value2, $str83$__ );
          }
          PrintLow.format( output_stream, $str86$_A__, value2 );
        }
        if( NIL != other_bindings )
        {
          SubLObject cdolist_list_var_$10 = elements;
          SubLObject element = NIL;
          element = cdolist_list_var_$10.first();
          while ( NIL != cdolist_list_var_$10)
          {
            query_bindings_to_xml( other_bindings, element, Numbers.add( indent_num, TWO_INTEGER ), output_stream, cycl_prefixP );
            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
            element = cdolist_list_var_$10.first();
          }
        }
        string_utilities.indent( output_stream, indent_num );
        PrintLow.format( output_stream, $str87$___A___, name );
      }
      else
      {
        PrintLow.format( output_stream, $str88$____ );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 26743L)
  public static SubLObject query_bindings_to_xml(final SubLObject query_bindings, final SubLObject query_result_xml_spec, final SubLObject indent_num, final SubLObject output_stream, final SubLObject cycl_prefixP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject query_results = query_bindings;
    final SubLObject attributes = conses_high.getf( query_result_xml_spec, $kw78$ATTRIBUTES, UNPROVIDED );
    final SubLObject text = conses_high.getf( query_result_xml_spec, $kw80$TEXT, UNPROVIDED );
    final SubLObject sort_asc = conses_high.getf( query_result_xml_spec, $kw89$SORT_ASC, UNPROVIDED );
    final SubLObject sort_desc = conses_high.getf( query_result_xml_spec, $kw90$SORT_DESC, UNPROVIDED );
    SubLObject count = ZERO_INTEGER;
    SubLObject attribute_vars = NIL;
    SubLObject initial_grouping_key_tuples = NIL;
    SubLObject grouping_keys = NIL;
    SubLObject other_bindings_by_el_value_tuples = NIL;
    thread.resetMultipleValues();
    final SubLObject attribute_vars_$11 = attribute_vars( attributes );
    final SubLObject initial_grouping_key_tuples_$12 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    attribute_vars = attribute_vars_$11;
    initial_grouping_key_tuples = initial_grouping_key_tuples_$12;
    grouping_keys = attribute_vars;
    if( NIL != sort_asc )
    {
      query_results = Sequences.reverse( sort_query_results_on_el_var( query_bindings, sort_asc ) );
    }
    else if( NIL != sort_desc )
    {
      query_results = sort_query_results_on_el_var( query_bindings, sort_desc );
    }
    if( NIL != text )
    {
      if( text.isString() )
      {
        initial_grouping_key_tuples = ConsesLow.cons( ConsesLow.cons( text, text ), initial_grouping_key_tuples );
      }
      grouping_keys = ConsesLow.cons( text, grouping_keys );
    }
    SubLObject cdolist_list_var = query_results;
    SubLObject query_result = NIL;
    query_result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != grouping_keys )
      {
        SubLObject grouping_key_tuples = initial_grouping_key_tuples;
        SubLObject cdolist_list_var_$13 = query_result;
        SubLObject binding = NIL;
        binding = cdolist_list_var_$13.first();
        while ( NIL != cdolist_list_var_$13)
        {
          final SubLObject el_var = binding.first();
          if( NIL != list_utilities.member_eqP( el_var, grouping_keys ) )
          {
            grouping_key_tuples = ConsesLow.cons( binding, grouping_key_tuples );
          }
          cdolist_list_var_$13 = cdolist_list_var_$13.rest();
          binding = cdolist_list_var_$13.first();
        }
        other_bindings_by_el_value_tuples = list_utilities.alist_push( other_bindings_by_el_value_tuples, grouping_key_tuples, query_result, Symbols.symbol_function( EQUAL ) );
      }
      else
      {
        other_bindings_by_el_value_tuples = list_utilities.alist_push( other_bindings_by_el_value_tuples, count, query_result, Symbols.symbol_function( EQUAL ) );
        count = number_utilities.f_1X( count );
      }
      cdolist_list_var = cdolist_list_var.rest();
      query_result = cdolist_list_var.first();
    }
    write_xml_from_grouped_bindings( other_bindings_by_el_value_tuples, query_result_xml_spec, indent_num, output_stream, cycl_prefixP );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 28639L)
  public static SubLObject get_default_xml_spec_for_el_vars(final SubLObject el_vars)
  {
    SubLObject xml_spec = Sequences.copy_seq( $str91$__name__binding___elements__ );
    SubLObject cdolist_list_var = el_vars;
    SubLObject el_var = NIL;
    el_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      xml_spec = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( xml_spec ), new SubLObject[] { $str92$__name__, format_nil.format_nil_a_no_copy( Strings.string_downcase( cycl_variables
          .el_var_name_without_prefix( el_var ), UNPROVIDED, UNPROVIDED ) ), $str93$___text_, format_nil.format_nil_a_no_copy( el_var ), $str94$__
      } );
      cdolist_list_var = cdolist_list_var.rest();
      el_var = cdolist_list_var.first();
    }
    xml_spec = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( xml_spec ), $str95$__ );
    return reader.read_from_string( xml_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 29061L)
  public static SubLObject query_bindings_to_xml_stream(final SubLObject el_bindings, final SubLObject xml_spec, final SubLObject indent_num, final SubLObject stream, SubLObject cycl_prefixP)
  {
    if( cycl_prefixP == UNPROVIDED )
    {
      cycl_prefixP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( stream, thread );
      xml_header( UNPROVIDED, UNPROVIDED, UNPROVIDED );
      xml_start_tag_internal( $str96$root, NIL, NIL, UNPROVIDED, UNPROVIDED );
      xml_terpri();
      query_bindings_to_xml( el_bindings, xml_spec, indent_num, stream, cycl_prefixP );
      xml_end_tag_internal( $str96$root );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 29437L)
  public static SubLObject query_results_to_xml_stream(final SubLObject query_sent, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec, SubLObject stream)
  {
    if( query_mt == UNPROVIDED )
    {
      query_mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    if( xml_spec == UNPROVIDED )
    {
      xml_spec = $kw98$DEFAULT;
    }
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( xml_spec.equal( $kw98$DEFAULT ) )
    {
      final SubLObject free_el_vars = el_utilities.sentence_free_variables( query_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      xml_spec = get_default_xml_spec_for_el_vars( free_el_vars );
    }
    final SubLObject el_bindings = inference_kernel.new_cyc_query( query_sent, query_mt, query_properties );
    query_bindings_to_xml_stream( el_bindings, xml_spec, TWO_INTEGER, stream, UNPROVIDED );
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 29921L)
  public static SubLObject download_xml_url(final SubLObject url, SubLObject source_file, SubLObject accept_types, SubLObject follow_redirectsP)
  {
    if( source_file == UNPROVIDED )
    {
      source_file = NIL;
    }
    if( accept_types == UNPROVIDED )
    {
      accept_types = $list99;
    }
    if( follow_redirectsP == UNPROVIDED )
    {
      follow_redirectsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != web_utilities.url_p( url ) : url;
    if( NIL == source_file )
    {
      source_file = file_utilities.make_unused_temp_filename( UNPROVIDED );
    }
    SubLObject error_message = web_utilities.save_url_to_file( url, source_file, accept_types, follow_redirectsP );
    if( NIL == error_message )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( source_file, $kw101$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str102$Unable_to_open__S, source_file );
        }
        final SubLObject s = stream;
        if( streams_high.file_length( s ).numL( $int103$2000 ) )
        {
          final SubLObject contents = string_utilities.read_string_from_file( source_file, UNPROVIDED, UNPROVIDED );
          if( NIL != Sequences.search( $str104$404, contents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != Sequences.search( $str105$Not_Found, contents, Symbols.symbol_function(
              EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            error_message = $str106$Url_not_found_;
          }
          else if( NIL != Sequences.search( $str107$503_Service_Temporarily_Unavailab, contents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            error_message = $str108$Server_not_available;
          }
          else if( NIL == string_utilities.starts_with_by_test( contents, $str109$__xml, Symbols.symbol_function( EQUALP ) ) )
          {
            final SubLObject snippet_end = Numbers.min( FIFTEEN_INTEGER, Sequences.length( contents ) );
            final SubLObject snippet = string_utilities.substring( contents, ZERO_INTEGER, snippet_end );
            error_message = Sequences.cconcatenate( $str110$Not_XML_document__Starts_with_, format_nil.format_nil_s_no_copy( snippet ) );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    if( NIL != error_message )
    {
      Errors.error( $str111$Encountered_error_trying_to_downl, url, error_message );
    }
    return source_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 31066L)
  public static SubLObject query_results_to_xml_file(final SubLObject query_sent, final SubLObject file, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec)
  {
    if( query_mt == UNPROVIDED )
    {
      query_mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    if( xml_spec == UNPROVIDED )
    {
      xml_spec = $kw98$DEFAULT;
    }
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( file, $kw113$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str102$Unable_to_open__S, file );
      }
      final SubLObject s_out = stream;
      query_results_to_xml_stream( query_sent, query_mt, query_properties, xml_spec, s_out );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 31358L)
  public static SubLObject query_results_to_xml_string(final SubLObject query_sent, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec)
  {
    if( query_mt == UNPROVIDED )
    {
      query_mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    if( xml_spec == UNPROVIDED )
    {
      xml_spec = $kw98$DEFAULT;
    }
    if( xml_spec.equal( $kw98$DEFAULT ) )
    {
      final SubLObject free_el_vars = el_utilities.sentence_free_variables( query_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      xml_spec = get_default_xml_spec_for_el_vars( free_el_vars );
    }
    final SubLObject el_bindings = inference_kernel.new_cyc_query( query_sent, query_mt, query_properties );
    SubLObject xml_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      query_bindings_to_xml_stream( el_bindings, xml_spec, TWO_INTEGER, stream, UNPROVIDED );
      xml_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return xml_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-utilities.lisp", position = 31899L)
  public static SubLObject boolean_to_trueXfalse_string(final SubLObject v_boolean)
  {
    return ( NIL != v_boolean ) ? $str115$true : $str116$false;
  }

  public static SubLObject declare_xml_utilities_file()
  {
    SubLFiles.declareFunction( me, "xml_version", "XML-VERSION", 0, 0, false );
    SubLFiles.declareFunction( me, "xml_add_indentation", "XML-ADD-INDENTATION", 0, 1, false );
    SubLFiles.declareMacro( me, "with_xml_indentation", "WITH-XML-INDENTATION" );
    SubLFiles.declareFunction( me, "xml_terpri", "XML-TERPRI", 0, 0, false );
    SubLFiles.declareFunction( me, "xml_write_string", "XML-WRITE-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "xml_write_char", "XML-WRITE-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_write_string_indented", "XML-WRITE-STRING-INDENTED", 1, 2, false );
    SubLFiles.declareFunction( me, "xml_header", "XML-HEADER", 0, 3, false );
    SubLFiles.declareFunction( me, "xml_cdata_prefix", "XML-CDATA-PREFIX", 0, 0, false );
    SubLFiles.declareFunction( me, "xml_cdata_suffix", "XML-CDATA-SUFFIX", 0, 0, false );
    SubLFiles.declareFunction( me, "xml_cdata", "XML-CDATA", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_markup", "XML-MARKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_comment", "XML-COMMENT", 1, 0, false );
    SubLFiles.declareMacro( me, "xml_tag", "XML-TAG" );
    SubLFiles.declareFunction( me, "xml_start_tag_internal", "XML-START-TAG-INTERNAL", 3, 2, false );
    SubLFiles.declareFunction( me, "xml_end_tag_internal", "XML-END-TAG-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_print", "XML-PRINT", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_prin1", "XML-PRIN1", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_print_line", "XML-PRINT-LINE", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_prin1_line", "XML-PRIN1-LINE", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_write", "XML-WRITE", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_write_line", "XML-WRITE-LINE", 1, 1, false );
    SubLFiles.declareFunction( me, "valid_xml_name_p", "VALID-XML-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_invalid_xml_name_chars", "REMOVE-INVALID-XML-NAME-CHARS", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_ascii_xml_name_p", "VALID-ASCII-XML-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_xml_name_initial_char_p", "VALID-XML-NAME-INITIAL-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_xml_name_initial_char_code_p", "VALID-XML-NAME-INITIAL-CHAR-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_non_ascii_xml_name_p", "VALID-NON-ASCII-XML-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_xml_name_char_p", "VALID-XML-NAME-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_invalid_xml_name_chars_from_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-ASCII-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_invalid_xml_name_chars_from_non_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-NON-ASCII-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_xml_name_char_code_p", "VALID-XML-NAME-CHAR-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "digit_char_code_p", "DIGIT-CHAR-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_letter_char_p", "XML-LETTER-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_letter_char_code_p", "XML-LETTER-CHAR-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_base_char_p", "XML-BASE-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_base_char_code_p", "XML-BASE-CHAR-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_ideographic_char_p", "XML-IDEOGRAPHIC-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_ideographic_char_code_p", "XML-IDEOGRAPHIC-CHAR-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_xml_char_p", "VALID-XML-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_xml_char_code_p", "VALID-XML-CHAR-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "char_in_ranges_p", "CHAR-IN-RANGES-P", 2, 0, false );
    SubLFiles.declareFunction( me, "char_code_in_ranges_p", "CHAR-CODE-IN-RANGES-P", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_special_charP", "XML-SPECIAL-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_char_escaped_version", "XML-CHAR-ESCAPED-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_unescape_string", "XML-UNESCAPE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_write_wXescaped_special_chars", "XML-WRITE-W/ESCAPED-SPECIAL-CHARS", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_xml_entity_reference_p", "POSSIBLE-XML-ENTITY-REFERENCE-P", 1, 2, false );
    SubLFiles.declareFunction( me, "possible_xml_entity_name_p", "POSSIBLE-XML-ENTITY-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_xml_numeric_character_reference_p", "POSSIBLE-XML-NUMERIC-CHARACTER-REFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_xml_entity_name_first_char_p", "VALID-XML-ENTITY-NAME-FIRST-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_xml_entity_name_char_p", "VALID-XML-ENTITY-NAME-CHAR-P", 1, 0, false );
    SubLFiles.declareMacro( me, "with_xml_output_to_stream", "WITH-XML-OUTPUT-TO-STREAM" );
    SubLFiles.declareMacro( me, "with_xml_output_to_string", "WITH-XML-OUTPUT-TO-STRING" );
    SubLFiles.declareFunction( me, "generate_valid_xml_header", "GENERATE-VALID-XML-HEADER", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_xml_header_entry_for_dtd", "GENERATE-XML-HEADER-ENTRY-FOR-DTD", 2, 1, false );
    SubLFiles.declareFunction( me, "resolve_xml_namespaces", "RESOLVE-XML-NAMESPACES", 2, 0, false );
    SubLFiles.declareFunction( me, "maybe_resolve_xml_namespace", "MAYBE-RESOLVE-XML-NAMESPACE", 3, 0, false );
    SubLFiles.declareFunction( me, "resolve_xml_namespace", "RESOLVE-XML-NAMESPACE", 3, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_output_as_xml", "XML-SEXPR-OUTPUT-AS-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_output_daughters", "XML-SEXPR-OUTPUT-DAUGHTERS", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_tag_attributes_from_sexpr", "XML-TAG-ATTRIBUTES-FROM-SEXPR", 1, 0, false );
    SubLFiles.declareFunction( me, "alists_sort_key", "ALISTS-SORT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "attribute_vars", "ATTRIBUTE-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_query_results_on_el_var", "SORT-QUERY-RESULTS-ON-EL-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "write_xml_from_grouped_bindings", "WRITE-XML-FROM-GROUPED-BINDINGS", 5, 0, false );
    SubLFiles.declareFunction( me, "query_bindings_to_xml", "QUERY-BINDINGS-TO-XML", 5, 0, false );
    SubLFiles.declareFunction( me, "get_default_xml_spec_for_el_vars", "GET-DEFAULT-XML-SPEC-FOR-EL-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "query_bindings_to_xml_stream", "QUERY-BINDINGS-TO-XML-STREAM", 4, 1, false );
    SubLFiles.declareFunction( me, "query_results_to_xml_stream", "QUERY-RESULTS-TO-XML-STREAM", 1, 4, false );
    SubLFiles.declareFunction( me, "download_xml_url", "DOWNLOAD-XML-URL", 1, 3, false );
    SubLFiles.declareFunction( me, "query_results_to_xml_file", "QUERY-RESULTS-TO-XML-FILE", 2, 3, false );
    SubLFiles.declareFunction( me, "query_results_to_xml_string", "QUERY-RESULTS-TO-XML-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "boolean_to_trueXfalse_string", "BOOLEAN-TO-TRUE/FALSE-STRING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_xml_utilities_file()
  {
    $xml_version$ = SubLFiles.defparameter( "*XML-VERSION*", $float0$1_0 );
    $xml_indentation_level$ = SubLFiles.defparameter( "*XML-INDENTATION-LEVEL*", ZERO_INTEGER );
    $xml_indentation_amount$ = SubLFiles.defparameter( "*XML-INDENTATION-AMOUNT*", ONE_INTEGER );
    $cycml_indent_level$ = SubLFiles.defparameter( "*CYCML-INDENT-LEVEL*", ZERO_INTEGER );
    $xml_cdata_prefix$ = SubLFiles.deflexical( "*XML-CDATA-PREFIX*", $str17$___CDATA_ );
    $xml_cdata_suffix$ = SubLFiles.deflexical( "*XML-CDATA-SUFFIX*", $str18$___ );
    $xml_base_char_code_ranges$ = SubLFiles.deflexical( "*XML-BASE-CHAR-CODE-RANGES*", $list38 );
    $xml_ideographic_char_code_ranges$ = SubLFiles.deflexical( "*XML-IDEOGRAPHIC-CHAR-CODE-RANGES*", $list39 );
    $xml_special_chars$ = SubLFiles.defconstant( "*XML-SPECIAL-CHARS*", $list41 );
    $alists_sort_key$ = SubLFiles.defparameter( "*ALISTS-SORT-KEY*", NIL );
    return NIL;
  }

  public static SubLObject setup_xml_utilities_file()
  {
    access_macros.define_obsolete_register( $sym63$GENERATE_VALID_XML_HEADER, $list64 );
    access_macros.register_external_symbol( $sym97$QUERY_RESULTS_TO_XML_STREAM );
    access_macros.register_external_symbol( $sym112$QUERY_RESULTS_TO_XML_FILE );
    access_macros.register_external_symbol( $sym114$QUERY_RESULTS_TO_XML_STRING );
    return NIL;
  }

  private static SubLObject _constant_38_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( makeInteger( 65 ), makeInteger( 90 ) ), ConsesLow.list( makeInteger( 97 ), makeInteger( 122 ) ), ConsesLow.list( makeInteger( 192 ), makeInteger( 214 ) ),
      ConsesLow.list( makeInteger( 216 ), makeInteger( 246 ) ), ConsesLow.list( makeInteger( 248 ), makeInteger( 255 ) ), ConsesLow.list( makeInteger( 256 ), makeInteger( 305 ) ), ConsesLow.list( makeInteger( 308 ),
          makeInteger( 318 ) ), ConsesLow.list( makeInteger( 321 ), makeInteger( 328 ) ), ConsesLow.list( makeInteger( 330 ), makeInteger( 382 ) ), ConsesLow.list( makeInteger( 384 ), makeInteger( 451 ) ), ConsesLow
              .list( makeInteger( 461 ), makeInteger( 496 ) ), ConsesLow.list( makeInteger( 500 ), makeInteger( 501 ) ), ConsesLow.list( makeInteger( 506 ), makeInteger( 535 ) ), ConsesLow.list( makeInteger( 592 ),
                  makeInteger( 680 ) ), ConsesLow.list( makeInteger( 699 ), makeInteger( 705 ) ), ConsesLow.list( makeInteger( 902 ), makeInteger( 902 ) ), ConsesLow.list( makeInteger( 904 ), makeInteger( 906 ) ),
      ConsesLow.list( makeInteger( 908 ), makeInteger( 908 ) ), ConsesLow.list( makeInteger( 910 ), makeInteger( 929 ) ), ConsesLow.list( makeInteger( 931 ), makeInteger( 974 ) ), ConsesLow.list( makeInteger( 976 ),
          makeInteger( 982 ) ), ConsesLow.list( makeInteger( 986 ), makeInteger( 986 ) ), ConsesLow.list( makeInteger( 988 ), makeInteger( 988 ) ), ConsesLow.list( makeInteger( 990 ), makeInteger( 990 ) ), ConsesLow
              .list( makeInteger( 992 ), makeInteger( 992 ) ), ConsesLow.list( makeInteger( 994 ), makeInteger( 1011 ) ), ConsesLow.list( makeInteger( 1025 ), makeInteger( 1036 ) ), ConsesLow.list( makeInteger( 1038 ),
                  makeInteger( 1103 ) ), ConsesLow.list( makeInteger( 1105 ), makeInteger( 1116 ) ), ConsesLow.list( makeInteger( 1118 ), makeInteger( 1153 ) ), ConsesLow.list( makeInteger( 1168 ), makeInteger( 1220 ) ),
      ConsesLow.list( makeInteger( 1223 ), makeInteger( 1224 ) ), ConsesLow.list( makeInteger( 1227 ), makeInteger( 1228 ) ), ConsesLow.list( makeInteger( 1232 ), makeInteger( 1259 ) ), ConsesLow.list( makeInteger(
          1262 ), makeInteger( 1269 ) ), ConsesLow.list( makeInteger( 1272 ), makeInteger( 1273 ) ), ConsesLow.list( makeInteger( 1329 ), makeInteger( 1366 ) ), ConsesLow.list( makeInteger( 1369 ), makeInteger( 1369 ) ),
      ConsesLow.list( makeInteger( 1377 ), makeInteger( 1414 ) ), ConsesLow.list( makeInteger( 1488 ), makeInteger( 1514 ) ), ConsesLow.list( makeInteger( 1520 ), makeInteger( 1522 ) ), ConsesLow.list( makeInteger(
          1569 ), makeInteger( 1594 ) ), ConsesLow.list( makeInteger( 1601 ), makeInteger( 1610 ) ), ConsesLow.list( makeInteger( 1649 ), makeInteger( 1719 ) ), ConsesLow.list( makeInteger( 1722 ), makeInteger( 1726 ) ),
      ConsesLow.list( makeInteger( 1728 ), makeInteger( 1742 ) ), ConsesLow.list( makeInteger( 1744 ), makeInteger( 1747 ) ), ConsesLow.list( makeInteger( 1749 ), makeInteger( 1749 ) ), ConsesLow.list( makeInteger(
          1765 ), makeInteger( 1766 ) ), ConsesLow.list( makeInteger( 2309 ), makeInteger( 2361 ) ), ConsesLow.list( makeInteger( 2365 ), makeInteger( 2365 ) ), ConsesLow.list( makeInteger( 2392 ), makeInteger( 2401 ) ),
      ConsesLow.list( makeInteger( 2437 ), makeInteger( 2444 ) ), ConsesLow.list( makeInteger( 2447 ), makeInteger( 2448 ) ), ConsesLow.list( makeInteger( 2451 ), makeInteger( 2472 ) ), ConsesLow.list( makeInteger(
          2474 ), makeInteger( 2480 ) ), ConsesLow.list( makeInteger( 2482 ), makeInteger( 2482 ) ), ConsesLow.list( makeInteger( 2486 ), makeInteger( 2489 ) ), ConsesLow.list( makeInteger( 2524 ), makeInteger( 2525 ) ),
      ConsesLow.list( makeInteger( 2527 ), makeInteger( 2529 ) ), ConsesLow.list( makeInteger( 2544 ), makeInteger( 2545 ) ), ConsesLow.list( makeInteger( 2565 ), makeInteger( 2570 ) ), ConsesLow.list( makeInteger(
          2575 ), makeInteger( 2576 ) ), ConsesLow.list( makeInteger( 2579 ), makeInteger( 2600 ) ), ConsesLow.list( makeInteger( 2602 ), makeInteger( 2608 ) ), ConsesLow.list( makeInteger( 2610 ), makeInteger( 2611 ) ),
      ConsesLow.list( makeInteger( 2613 ), makeInteger( 2614 ) ), ConsesLow.list( makeInteger( 2616 ), makeInteger( 2617 ) ), ConsesLow.list( makeInteger( 2649 ), makeInteger( 2652 ) ), ConsesLow.list( makeInteger(
          2654 ), makeInteger( 2654 ) ), ConsesLow.list( makeInteger( 2674 ), makeInteger( 2676 ) ), ConsesLow.list( makeInteger( 2693 ), makeInteger( 2699 ) ), ConsesLow.list( makeInteger( 2701 ), makeInteger( 2701 ) ),
      ConsesLow.list( makeInteger( 2703 ), makeInteger( 2705 ) ), ConsesLow.list( makeInteger( 2707 ), makeInteger( 2728 ) ), ConsesLow.list( makeInteger( 2730 ), makeInteger( 2736 ) ), ConsesLow.list( makeInteger(
          2738 ), makeInteger( 2739 ) ), ConsesLow.list( makeInteger( 2741 ), makeInteger( 2745 ) ), ConsesLow.list( makeInteger( 2749 ), makeInteger( 2749 ) ), ConsesLow.list( makeInteger( 2784 ), makeInteger( 2784 ) ),
      ConsesLow.list( makeInteger( 2821 ), makeInteger( 2828 ) ), ConsesLow.list( makeInteger( 2831 ), makeInteger( 2832 ) ), ConsesLow.list( makeInteger( 2835 ), makeInteger( 2856 ) ), ConsesLow.list( makeInteger(
          2858 ), makeInteger( 2864 ) ), ConsesLow.list( makeInteger( 2866 ), makeInteger( 2867 ) ), ConsesLow.list( makeInteger( 2870 ), makeInteger( 2873 ) ), ConsesLow.list( makeInteger( 2877 ), makeInteger( 2877 ) ),
      ConsesLow.list( makeInteger( 2908 ), makeInteger( 2909 ) ), ConsesLow.list( makeInteger( 2911 ), makeInteger( 2913 ) ), ConsesLow.list( makeInteger( 2949 ), makeInteger( 2954 ) ), ConsesLow.list( makeInteger(
          2958 ), makeInteger( 2960 ) ), ConsesLow.list( makeInteger( 2962 ), makeInteger( 2965 ) ), ConsesLow.list( makeInteger( 2969 ), makeInteger( 2970 ) ), ConsesLow.list( makeInteger( 2972 ), makeInteger( 2972 ) ),
      ConsesLow.list( makeInteger( 2974 ), makeInteger( 2975 ) ), ConsesLow.list( makeInteger( 2979 ), makeInteger( 2980 ) ), ConsesLow.list( makeInteger( 2984 ), makeInteger( 2986 ) ), ConsesLow.list( makeInteger(
          2990 ), makeInteger( 2997 ) ), ConsesLow.list( makeInteger( 2999 ), makeInteger( 3001 ) ), ConsesLow.list( makeInteger( 3077 ), makeInteger( 3084 ) ), ConsesLow.list( makeInteger( 3086 ), makeInteger( 3088 ) ),
      ConsesLow.list( makeInteger( 3090 ), makeInteger( 3112 ) ), ConsesLow.list( makeInteger( 3114 ), makeInteger( 3123 ) ), ConsesLow.list( makeInteger( 3125 ), makeInteger( 3129 ) ), ConsesLow.list( makeInteger(
          3168 ), makeInteger( 3169 ) ), ConsesLow.list( makeInteger( 3205 ), makeInteger( 3212 ) ), ConsesLow.list( makeInteger( 3214 ), makeInteger( 3216 ) ), ConsesLow.list( makeInteger( 3218 ), makeInteger( 3240 ) ),
      ConsesLow.list( makeInteger( 3242 ), makeInteger( 3251 ) ), ConsesLow.list( makeInteger( 3253 ), makeInteger( 3257 ) ), ConsesLow.list( makeInteger( 3294 ), makeInteger( 3294 ) ), ConsesLow.list( makeInteger(
          3296 ), makeInteger( 3297 ) ), ConsesLow.list( makeInteger( 3333 ), makeInteger( 3340 ) ), ConsesLow.list( makeInteger( 3342 ), makeInteger( 3344 ) ), ConsesLow.list( makeInteger( 3346 ), makeInteger( 3368 ) ),
      ConsesLow.list( makeInteger( 3370 ), makeInteger( 3385 ) ), ConsesLow.list( makeInteger( 3424 ), makeInteger( 3425 ) ), ConsesLow.list( makeInteger( 3585 ), makeInteger( 3630 ) ), ConsesLow.list( makeInteger(
          3632 ), makeInteger( 3632 ) ), ConsesLow.list( makeInteger( 3634 ), makeInteger( 3635 ) ), ConsesLow.list( makeInteger( 3648 ), makeInteger( 3653 ) ), ConsesLow.list( makeInteger( 3713 ), makeInteger( 3714 ) ),
      ConsesLow.list( makeInteger( 3716 ), makeInteger( 3716 ) ), ConsesLow.list( makeInteger( 3719 ), makeInteger( 3720 ) ), ConsesLow.list( makeInteger( 3722 ), makeInteger( 3722 ) ), ConsesLow.list( makeInteger(
          3725 ), makeInteger( 3725 ) ), ConsesLow.list( makeInteger( 3732 ), makeInteger( 3735 ) ), ConsesLow.list( makeInteger( 3737 ), makeInteger( 3743 ) ), ConsesLow.list( makeInteger( 3745 ), makeInteger( 3747 ) ),
      ConsesLow.list( makeInteger( 3749 ), makeInteger( 3749 ) ), ConsesLow.list( makeInteger( 3751 ), makeInteger( 3751 ) ), ConsesLow.list( makeInteger( 3754 ), makeInteger( 3755 ) ), ConsesLow.list( makeInteger(
          3757 ), makeInteger( 3758 ) ), ConsesLow.list( makeInteger( 3760 ), makeInteger( 3760 ) ), ConsesLow.list( makeInteger( 3762 ), makeInteger( 3763 ) ), ConsesLow.list( makeInteger( 3773 ), makeInteger( 3773 ) ),
      ConsesLow.list( makeInteger( 3776 ), makeInteger( 3780 ) ), ConsesLow.list( makeInteger( 3904 ), makeInteger( 3911 ) ), ConsesLow.list( makeInteger( 3913 ), makeInteger( 3945 ) ), ConsesLow.list( makeInteger(
          4256 ), makeInteger( 4293 ) ), ConsesLow.list( makeInteger( 4304 ), makeInteger( 4342 ) ), ConsesLow.list( makeInteger( 4352 ), makeInteger( 4352 ) ), ConsesLow.list( makeInteger( 4354 ), makeInteger( 4355 ) ),
      ConsesLow.list( makeInteger( 4357 ), makeInteger( 4359 ) ), ConsesLow.list( makeInteger( 4361 ), makeInteger( 4361 ) ), ConsesLow.list( makeInteger( 4363 ), makeInteger( 4364 ) ), ConsesLow.list( makeInteger(
          4366 ), makeInteger( 4370 ) ), ConsesLow.list( makeInteger( 4412 ), makeInteger( 4412 ) ), ConsesLow.list( makeInteger( 4414 ), makeInteger( 4414 ) ), ConsesLow.list( makeInteger( 4416 ), makeInteger( 4416 ) ),
      ConsesLow.list( makeInteger( 4428 ), makeInteger( 4428 ) ), ConsesLow.list( makeInteger( 4430 ), makeInteger( 4430 ) ), ConsesLow.list( makeInteger( 4432 ), makeInteger( 4432 ) ), ConsesLow.list( makeInteger(
          4436 ), makeInteger( 4437 ) ), ConsesLow.list( makeInteger( 4441 ), makeInteger( 4441 ) ), ConsesLow.list( makeInteger( 4447 ), makeInteger( 4449 ) ), ConsesLow.list( makeInteger( 4451 ), makeInteger( 4451 ) ),
      ConsesLow.list( makeInteger( 4453 ), makeInteger( 4453 ) ), ConsesLow.list( makeInteger( 4455 ), makeInteger( 4455 ) ), ConsesLow.list( makeInteger( 4457 ), makeInteger( 4457 ) ), ConsesLow.list( makeInteger(
          4461 ), makeInteger( 4462 ) ), ConsesLow.list( makeInteger( 4466 ), makeInteger( 4467 ) ), ConsesLow.list( makeInteger( 4469 ), makeInteger( 4469 ) ), ConsesLow.list( makeInteger( 4510 ), makeInteger( 4510 ) ),
      ConsesLow.list( makeInteger( 4520 ), makeInteger( 4520 ) ), ConsesLow.list( makeInteger( 4523 ), makeInteger( 4523 ) ), ConsesLow.list( makeInteger( 4526 ), makeInteger( 4527 ) ), ConsesLow.list( makeInteger(
          4535 ), makeInteger( 4536 ) ), ConsesLow.list( makeInteger( 4538 ), makeInteger( 4538 ) ), ConsesLow.list( makeInteger( 4540 ), makeInteger( 4546 ) ), ConsesLow.list( makeInteger( 4587 ), makeInteger( 4587 ) ),
      ConsesLow.list( makeInteger( 4592 ), makeInteger( 4592 ) ), ConsesLow.list( makeInteger( 4601 ), makeInteger( 4601 ) ), ConsesLow.list( makeInteger( 7680 ), makeInteger( 7835 ) ), ConsesLow.list( makeInteger(
          7840 ), makeInteger( 7929 ) ), ConsesLow.list( makeInteger( 7936 ), makeInteger( 7957 ) ), ConsesLow.list( makeInteger( 7960 ), makeInteger( 7965 ) ), ConsesLow.list( makeInteger( 7968 ), makeInteger( 8005 ) ),
      ConsesLow.list( makeInteger( 8008 ), makeInteger( 8013 ) ), ConsesLow.list( makeInteger( 8016 ), makeInteger( 8023 ) ), ConsesLow.list( makeInteger( 8025 ), makeInteger( 8025 ) ), ConsesLow.list( makeInteger(
          8027 ), makeInteger( 8027 ) ), ConsesLow.list( makeInteger( 8029 ), makeInteger( 8029 ) ), ConsesLow.list( makeInteger( 8031 ), makeInteger( 8061 ) ), ConsesLow.list( makeInteger( 8064 ), makeInteger( 8116 ) ),
      ConsesLow.list( makeInteger( 8118 ), makeInteger( 8124 ) ), ConsesLow.list( makeInteger( 8126 ), makeInteger( 8126 ) ), ConsesLow.list( makeInteger( 8130 ), makeInteger( 8132 ) ), ConsesLow.list( makeInteger(
          8134 ), makeInteger( 8140 ) ), ConsesLow.list( makeInteger( 8144 ), makeInteger( 8147 ) ), ConsesLow.list( makeInteger( 8150 ), makeInteger( 8155 ) ), ConsesLow.list( makeInteger( 8160 ), makeInteger( 8172 ) ),
      ConsesLow.list( makeInteger( 8178 ), makeInteger( 8180 ) ), ConsesLow.list( makeInteger( 8182 ), makeInteger( 8188 ) ), ConsesLow.list( makeInteger( 8486 ), makeInteger( 8486 ) ), ConsesLow.list( makeInteger(
          8490 ), makeInteger( 8491 ) ), ConsesLow.list( makeInteger( 8494 ), makeInteger( 8494 ) ), ConsesLow.list( makeInteger( 8576 ), makeInteger( 8578 ) ), ConsesLow.list( makeInteger( 12353 ), makeInteger(
              12436 ) ), ConsesLow.list( makeInteger( 12449 ), makeInteger( 12538 ) ), ConsesLow.list( makeInteger( 12549 ), makeInteger( 12588 ) ), ConsesLow.list( makeInteger( 44032 ), makeInteger( 55203 ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_xml_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_xml_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_xml_utilities_file();
  }
  static
  {
    me = new xml_utilities();
    $xml_version$ = null;
    $xml_indentation_level$ = null;
    $xml_indentation_amount$ = null;
    $cycml_indent_level$ = null;
    $xml_cdata_prefix$ = null;
    $xml_cdata_suffix$ = null;
    $xml_base_char_code_ranges$ = null;
    $xml_ideographic_char_code_ranges$ = null;
    $xml_special_chars$ = null;
    $alists_sort_key$ = null;
    $float0$1_0 = makeDouble( 1.0 );
    $sym1$CLET = makeSymbol( "CLET" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "*XML-INDENTATION-LEVEL*" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "*XML-INDENTATION-AMOUNT*" ), makeSymbol( "*XML-INDENTATION-LEVEL*" ) ) ), ConsesLow
        .list( makeSymbol( "*CYCML-INDENT-LEVEL*" ), makeSymbol( "*XML-INDENTATION-LEVEL*" ) ) );
    $sym3$VALID_XML_CHAR_P = makeSymbol( "VALID-XML-CHAR-P" );
    $str4$Skipping_invalid_xml_character__S = makeString( "Skipping invalid xml character ~S in ~S" );
    $sym5$CHAR_ = makeSymbol( "CHAR=" );
    $str6$US_ASCII = makeString( "US-ASCII" );
    $sym7$FLOATP = makeSymbol( "FLOATP" );
    $sym8$STRINGP = makeSymbol( "STRINGP" );
    $sym9$BOOLEANP = makeSymbol( "BOOLEANP" );
    $str10$__xml_version_ = makeString( "<?xml version=" );
    $sym11$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
    $str12$_encoding_ = makeString( " encoding=" );
    $str13$_standalone_ = makeString( " standalone=" );
    $str14$yes = makeString( "yes" );
    $str15$no = makeString( "no" );
    $str16$___ = makeString( " ?>" );
    $str17$___CDATA_ = makeString( "<![CDATA[" );
    $str18$___ = makeString( "]]>" );
    $str19$____ = makeString( "<!--" );
    $str20$___ = makeString( "-->" );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ATTRIBUTES" ), makeSymbol( "ATOMIC?" ), makeSymbol( "NO-NESTED-ELEMENTS?" ), makeSymbol(
        "MULTIPLE-LINE-ATTRIBUTES?" ), ConsesLow.list( makeSymbol( "DEFAULT-NAMESPACE" ), makeSymbol( "*XML-DEFAULT-NAMESPACE*" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym22$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym23$WITH_XML_INDENTATION = makeSymbol( "WITH-XML-INDENTATION" );
    $sym24$XML_START_TAG_INTERNAL = makeSymbol( "XML-START-TAG-INTERNAL" );
    $sym25$_XML_DEFAULT_NAMESPACE_ = makeSymbol( "*XML-DEFAULT-NAMESPACE*" );
    $sym26$PUNLESS = makeSymbol( "PUNLESS" );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "XML-TERPRI" ) ) );
    $sym28$XML_END_TAG_INTERNAL = makeSymbol( "XML-END-TAG-INTERNAL" );
    $str29$xmlns = makeString( "xmlns" );
    $str30$__ = makeString( "=\"" );
    $str31$__ = makeString( "/>" );
    $str32$__ = makeString( "</" );
    $str33$_ = makeString( "&" );
    $str34$_ = makeString( ";" );
    $sym35$VALID_XML_NAME_CHAR_P = makeSymbol( "VALID-XML-NAME-CHAR-P" );
    $sym36$VALID_XML_NAME_CHAR_CODE_P = makeSymbol( "VALID-XML-NAME-CHAR-CODE-P" );
    $list37 = ConsesLow.list( makeInteger( 46 ), makeInteger( 45 ), makeInteger( 95 ), makeInteger( 58 ) );
    $list38 = _constant_38_initializer();
    $list39 = ConsesLow.list( ConsesLow.list( makeInteger( 19968 ), makeInteger( 40869 ) ), ConsesLow.list( makeInteger( 12295 ), makeInteger( 12295 ) ), ConsesLow.list( makeInteger( 12321 ), makeInteger( 12329 ) ) );
    $list40 = ConsesLow.list( makeSymbol( "LOW" ), makeSymbol( "HIGH" ) );
    $list41 = ConsesLow.list( Characters.CHAR_ampersand, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_greater, Characters.CHAR_less, Characters.CHAR_newline );
    $str42$_ = makeString( " " );
    $int43$34 = makeInteger( 34 );
    $str44$_quot_ = makeString( "&quot;" );
    $int45$38 = makeInteger( 38 );
    $str46$_amp_ = makeString( "&amp;" );
    $int47$39 = makeInteger( 39 );
    $str48$_apos_ = makeString( "&apos;" );
    $int49$60 = makeInteger( 60 );
    $str50$_lt_ = makeString( "&lt;" );
    $int51$62 = makeInteger( 62 );
    $str52$_gt_ = makeString( "&gt;" );
    $list53 = ConsesLow.list( ConsesLow.cons( makeString( "&gt;" ), makeString( ">" ) ), ConsesLow.cons( makeString( "&lt;" ), makeString( "<" ) ), ConsesLow.cons( makeString( "&amp;" ), makeString( "&" ) ), ConsesLow
        .cons( makeString( "&quot;" ), makeString( "\"" ) ), ConsesLow.cons( makeString( "&apos;" ), makeString( "'" ) ) );
    $sym54$DIGIT_CHAR_P = makeSymbol( "DIGIT-CHAR-P" );
    $sym55$HEX_CHAR_P = makeSymbol( "HEX-CHAR-P" );
    $list56 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym57$_XML_STREAM_ = makeSymbol( "*XML-STREAM*" );
    $list58 = ConsesLow.list( makeSymbol( "STRING-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym59$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym60$STREAM = makeUninternedSymbol( "STREAM" );
    $sym61$CWITH_OUTPUT_TO_STRING = makeSymbol( "CWITH-OUTPUT-TO-STRING" );
    $sym62$WITH_XML_OUTPUT_TO_STREAM = makeSymbol( "WITH-XML-OUTPUT-TO-STREAM" );
    $sym63$GENERATE_VALID_XML_HEADER = makeSymbol( "GENERATE-VALID-XML-HEADER" );
    $list64 = ConsesLow.list( makeSymbol( "XML-HEADER" ) );
    $str65$__DOCTYPE__A_SYSTEM__S_ = makeString( "<!DOCTYPE ~A SYSTEM ~S>" );
    $list66 = ConsesLow.cons( makeSymbol( "ELEMENT-NAME" ), makeSymbol( "ATTRIBUTES" ) );
    $str67$xmlns_ = makeString( "xmlns:" );
    $list68 = ConsesLow.cons( makeSymbol( "ATTRIBUTE" ), makeSymbol( "VALUE" ) );
    $list69 = ConsesLow.cons( makeSymbol( "KEY" ), makeSymbol( "VALUE" ) );
    $str70$xml_ = makeString( "xml:" );
    $str71$http_ = makeString( "http:" );
    $str72$Couldn_t_resolve__S_based_on__S_a = makeString( "Couldn't resolve ~S based on ~S and ~S." );
    $sym73$LISTP = makeSymbol( "LISTP" );
    $kw74$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym75$TERM___WITH_CONSTANT_BY_NAME = makeSymbol( "TERM-<-WITH-CONSTANT-BY-NAME" );
    $sym76$ALISTS_SORT_KEY = makeSymbol( "ALISTS-SORT-KEY" );
    $kw77$NAME = makeKeyword( "NAME" );
    $kw78$ATTRIBUTES = makeKeyword( "ATTRIBUTES" );
    $kw79$ELEMENTS = makeKeyword( "ELEMENTS" );
    $kw80$TEXT = makeKeyword( "TEXT" );
    $list81 = ConsesLow.cons( makeSymbol( "GROUPING-KEY-TUPLES" ), makeSymbol( "OTHER-BINDINGS" ) );
    $str82$__A = makeString( "<~A" );
    $str83$__ = makeString( "#$" );
    $str84$__A__A = makeString( " ~A=~A" );
    $str85$___ = makeString( ">~%" );
    $str86$_A__ = makeString( "~A~%" );
    $str87$___A___ = makeString( "</~A>~%" );
    $str88$____ = makeString( "/>~%" );
    $kw89$SORT_ASC = makeKeyword( "SORT-ASC" );
    $kw90$SORT_DESC = makeKeyword( "SORT-DESC" );
    $str91$__name__binding___elements__ = makeString( "(:name \"binding\" :elements (" );
    $str92$__name__ = makeString( "(:name \"" );
    $str93$___text_ = makeString( "\" :text " );
    $str94$__ = makeString( ") " );
    $str95$__ = makeString( "))" );
    $str96$root = makeString( "root" );
    $sym97$QUERY_RESULTS_TO_XML_STREAM = makeSymbol( "QUERY-RESULTS-TO-XML-STREAM" );
    $kw98$DEFAULT = makeKeyword( "DEFAULT" );
    $list99 = ConsesLow.list( makeString( "application/xml" ), makeString( "*/*;q=0.5" ) );
    $sym100$URL_P = makeSymbol( "URL-P" );
    $kw101$INPUT = makeKeyword( "INPUT" );
    $str102$Unable_to_open__S = makeString( "Unable to open ~S" );
    $int103$2000 = makeInteger( 2000 );
    $str104$404 = makeString( "404" );
    $str105$Not_Found = makeString( "Not Found" );
    $str106$Url_not_found_ = makeString( "Url not found." );
    $str107$503_Service_Temporarily_Unavailab = makeString( "503 Service Temporarily Unavailable" );
    $str108$Server_not_available = makeString( "Server not available" );
    $str109$__xml = makeString( "<?xml" );
    $str110$Not_XML_document__Starts_with_ = makeString( "Not XML document. Starts with " );
    $str111$Encountered_error_trying_to_downl = makeString( "Encountered error trying to download ~S:~% ~S" );
    $sym112$QUERY_RESULTS_TO_XML_FILE = makeSymbol( "QUERY-RESULTS-TO-XML-FILE" );
    $kw113$OUTPUT = makeKeyword( "OUTPUT" );
    $sym114$QUERY_RESULTS_TO_XML_STRING = makeSymbol( "QUERY-RESULTS-TO-XML-STRING" );
    $str115$true = makeString( "true" );
    $str116$false = makeString( "false" );
  }
}
/*
 * 
 * Total time: 398 ms
 * 
 */