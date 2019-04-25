package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class unicode_strings
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.unicode_strings";
  public static final String myFingerPrint = "a38923d9dc47c1b16cb82ad6b6a348dced2f87dcd7dd1ad0f0917dbbf2db8d2e";
  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1287L)
  private static SubLSymbol $max_unicode_value$;
  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
  public static SubLSymbol $dtp_unicode_char$;
  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
  public static SubLSymbol $dtp_unicode_string$;
  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 9208L)
  private static SubLSymbol $default_non_ascii_placeholder_char$;
  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 10145L)
  private static SubLSymbol $default_unicode_to_ascii_code_map$;
  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 28183L)
  private static SubLSymbol $html_40_character_entity_table$;
  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 34942L)
  private static SubLSymbol $cfasl_opcode_unicode_char$;
  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 36476L)
  private static SubLSymbol $cfasl_opcode_unicode_string$;
  private static final SubLInteger $int0$1114111;
  private static final SubLSymbol $sym1$UNICODE_CHAR;
  private static final SubLSymbol $sym2$UNICODE_CHAR_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_UNICODE_CHAR;
  private static final SubLSymbol $sym8$UNICODE_CHAR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$UNICODE_CHAR_UCHAR;
  private static final SubLSymbol $sym11$_CSETF_UNICODE_CHAR_UCHAR;
  private static final SubLSymbol $kw12$UCHAR;
  private static final SubLString $str13$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw14$BEGIN;
  private static final SubLSymbol $sym15$MAKE_UNICODE_CHAR;
  private static final SubLSymbol $kw16$SLOT;
  private static final SubLSymbol $kw17$END;
  private static final SubLSymbol $sym18$VISIT_DEFSTRUCT_OBJECT_UNICODE_CHAR_METHOD;
  private static final SubLString $str19$_u_x;
  private static final SubLString $str20$_u0_x;
  private static final SubLSymbol $sym21$UNICODE_CHARACTER_P;
  private static final SubLSymbol $sym22$UNICODE_STRING;
  private static final SubLSymbol $sym23$UNICODE_STRING_P;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$PRINT_UNICODE_STRING;
  private static final SubLSymbol $sym29$UNICODE_STRING_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$UNICODE_STRING_VECT;
  private static final SubLSymbol $sym32$_CSETF_UNICODE_STRING_VECT;
  private static final SubLSymbol $kw33$VECT;
  private static final SubLSymbol $sym34$MAKE_UNICODE_STRING;
  private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_UNICODE_STRING_METHOD;
  private static final SubLString $str36$_u__a_;
  private static final SubLSymbol $sym37$UNICODE_VECTOR_STRING_P;
  private static final SubLInteger $int38$127;
  private static final SubLSymbol $kw39$HTML_ESCAPED_ASCII;
  private static final SubLSymbol $kw40$ESCAPED_PROBABLY_UTF8;
  private static final SubLSymbol $kw41$SUBL_STRING;
  private static final SubLSymbol $kw42$PROBABLY_UTF8;
  private static final SubLSymbol $kw43$UNK;
  private static final SubLInteger $int44$128;
  private static final SubLSymbol $kw45$OPEN;
  private static final SubLSymbol $kw46$START_UNICODE;
  private static final SubLSymbol $kw47$UNICODE_CHAR;
  private static final SubLSymbol $kw48$UNICDE_CHAR;
  private static final SubLSymbol $sym49$DISPLAY_VECTOR_STRING_P;
  private static final SubLSymbol $sym50$ASCII_CHAR_P;
  private static final SubLList $list51;
  private static final SubLString $str52$__;
  private static final SubLString $str53$__;
  private static final SubLString $str54$_u26_;
  private static final SubLInteger $int55$32;
  private static final SubLString $str56$0;
  private static final SubLString $str57$_u_A_;
  private static final SubLSymbol $sym58$UTF8_VECTOR_STRING_P;
  private static final SubLString $str59$Invalid_UTF_8_encoding_at__S_in__;
  private static final SubLInteger $int60$2047;
  private static final SubLInteger $int61$65535;
  private static final SubLInteger $int62$2097151;
  private static final SubLInteger $int63$67108863;
  private static final SubLString $str64$__;
  private static final SubLString $str65$_x_x_;
  private static final SubLString $str66$___;
  private static final SubLInteger $int67$192;
  private static final SubLInteger $int68$_6;
  private static final SubLInteger $int69$63;
  private static final SubLInteger $int70$224;
  private static final SubLInteger $int71$_12;
  private static final SubLInteger $int72$240;
  private static final SubLInteger $int73$_18;
  private static final SubLInteger $int74$248;
  private static final SubLInteger $int75$_24;
  private static final SubLInteger $int76$193;
  private static final SubLInteger $int77$245;
  private static final SubLSymbol $sym78$VECTORP;
  private static final SubLInteger $int79$31;
  private static final SubLInteger $int80$24;
  private static final SubLString $str81$__x;
  private static final SubLInteger $int82$38;
  private static final SubLSymbol $kw83$START_HTML_ESCAPE;
  private static final SubLInteger $int84$60;
  private static final SubLSymbol $kw85$INSIDE_TAG;
  private static final SubLInteger $int86$62;
  private static final SubLInteger $int87$35;
  private static final SubLSymbol $kw88$HTML_NUMERIC_ESCAPE_START;
  private static final SubLSymbol $kw89$ENTITY_ESCAPE;
  private static final SubLInteger $int90$120;
  private static final SubLSymbol $kw91$HTML_HEXADECIMAL_ESCAPE;
  private static final SubLInteger $int92$48;
  private static final SubLInteger $int93$57;
  private static final SubLSymbol $kw94$HTML_DECIMAL_ESCAPE;
  private static final SubLInteger $int95$59;
  private static final SubLSymbol $sym96$CODE_CHAR;
  private static final SubLInteger $int97$256;
  private static final SubLSymbol $sym98$__;
  private static final SubLSymbol $sym99$CHAR_CODE;
  private static final SubLString $str100$_S__code___S__is_not_a_valid_utf8;
  private static final SubLSymbol $sym101$STRINGP;
  private static final SubLObject $list102;
  private static final SubLInteger $int103$52;
  private static final SubLSymbol $sym104$CFASL_INPUT_UNICODE_CHAR;
  private static final SubLSymbol $sym105$CFASL_OUTPUT_OBJECT_UNICODE_CHAR_METHOD;
  private static final SubLString $str106$Invalid_unicode_character__expect;
  private static final SubLInteger $int107$53;
  private static final SubLSymbol $sym108$CFASL_INPUT_UNICODE_STRING;
  private static final SubLSymbol $sym109$CFASL_OUTPUT_OBJECT_UNICODE_STRING_METHOD;
  private static final SubLSymbol $sym110$HTML_ESCAPED_UTF8_STRING_TO_UTF8_STRING;
  private static final SubLSymbol $kw111$TEST;
  private static final SubLSymbol $kw112$OWNER;
  private static final SubLSymbol $kw113$CLASSES;
  private static final SubLSymbol $kw114$KB;
  private static final SubLSymbol $kw115$TINY;
  private static final SubLSymbol $kw116$WORKING_;
  private static final SubLList $list117;

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
  public static SubLObject unicode_char_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_unicode_char( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
  public static SubLObject unicode_char_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $unicode_char_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
  public static SubLObject unicode_char_uchar(final SubLObject v_object)
  {
    assert NIL != unicode_char_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
  public static SubLObject _csetf_unicode_char_uchar(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != unicode_char_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
  public static SubLObject make_unicode_char(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $unicode_char_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw12$UCHAR ) )
      {
        _csetf_unicode_char_uchar( v_new, current_value );
      }
      else
      {
        Errors.error( $str13$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
  public static SubLObject visit_defstruct_unicode_char(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw14$BEGIN, $sym15$MAKE_UNICODE_CHAR, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw16$SLOT, $kw12$UCHAR, unicode_char_uchar( obj ) );
    Functions.funcall( visitor_fn, obj, $kw17$END, $sym15$MAKE_UNICODE_CHAR, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
  public static SubLObject visit_defstruct_object_unicode_char_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_unicode_char( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1443L)
  public static SubLObject unicode_char_create(final SubLObject uchar)
  {
    SubLObject ch = ZERO_INTEGER;
    if( NIL != unicode_character_p( uchar ) )
    {
      ch = uchar;
    }
    else
    {
      if( !uchar.isChar() )
      {
        return NIL;
      }
      ch = Characters.char_code( uchar );
    }
    final SubLObject unicode_char_obj = make_unicode_char( UNPROVIDED );
    _csetf_unicode_char_uchar( unicode_char_obj, ch );
    return unicode_char_obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1884L)
  public static SubLObject print_unicode_char(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject uchar = unicode_char_uchar( v_object );
    if( uchar.numG( FIFTEEN_INTEGER ) )
    {
      PrintLow.format( stream, $str19$_u_x, unicode_char_uchar( v_object ) );
    }
    else
    {
      PrintLow.format( stream, $str20$_u0_x, unicode_char_uchar( v_object ) );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2198L)
  public static SubLObject unicode_char_get_char(final SubLObject uchar)
  {
    assert NIL != unicode_char_p( uchar ) : uchar;
    return unicode_char_uchar( uchar );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2354L)
  public static SubLObject unicode_char_set_char(final SubLObject uchar, final SubLObject v_char)
  {
    assert NIL != unicode_char_p( uchar ) : uchar;
    assert NIL != unicode_character_p( v_char ) : v_char;
    _csetf_unicode_char_uchar( uchar, v_char );
    return uchar;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
  public static SubLObject unicode_string_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_unicode_string( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
  public static SubLObject unicode_string_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $unicode_string_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
  public static SubLObject unicode_string_vect(final SubLObject v_object)
  {
    assert NIL != unicode_string_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
  public static SubLObject _csetf_unicode_string_vect(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != unicode_string_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
  public static SubLObject make_unicode_string(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $unicode_string_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw33$VECT ) )
      {
        _csetf_unicode_string_vect( v_new, current_value );
      }
      else
      {
        Errors.error( $str13$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
  public static SubLObject visit_defstruct_unicode_string(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw14$BEGIN, $sym34$MAKE_UNICODE_STRING, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw16$SLOT, $kw33$VECT, unicode_string_vect( obj ) );
    Functions.funcall( visitor_fn, obj, $kw17$END, $sym34$MAKE_UNICODE_STRING, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
  public static SubLObject visit_defstruct_object_unicode_string_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_unicode_string( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2677L)
  public static SubLObject unicode_string_create(final SubLObject vect)
  {
    SubLObject v = NIL;
    if( NIL != unicode_character_p( vect ) )
    {
      v = Vectors.make_vector( ONE_INTEGER, UNPROVIDED );
      Vectors.set_aref( vect, ZERO_INTEGER, vect );
    }
    else if( vect.isChar() )
    {
      v = Vectors.make_vector( ONE_INTEGER, UNPROVIDED );
      Vectors.set_aref( v, ZERO_INTEGER, Characters.char_code( vect ) );
    }
    else if( NIL != unicode_vector_string_p( vect ) )
    {
      v = vect;
    }
    else
    {
      if( !vect.isString() )
      {
        return NIL;
      }
      final SubLObject univ = display_to_unicode_vector( vect );
      if( NIL == univ )
      {
        return NIL;
      }
      v = univ;
    }
    final SubLObject unicode_string_obj = make_unicode_string( UNPROVIDED );
    _csetf_unicode_string_vect( unicode_string_obj, v );
    return unicode_string_obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 3314L)
  public static SubLObject print_unicode_string(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str36$_u__a_, unicode_vector_to_display( unicode_string_vect( v_object ) ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 3532L)
  public static SubLObject unicode_string_get_vector(final SubLObject ustring)
  {
    assert NIL != unicode_string_p( ustring ) : ustring;
    return unicode_string_vect( ustring );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 3702L)
  public static SubLObject unicode_string_set_vector(final SubLObject ustring, final SubLObject vect)
  {
    assert NIL != unicode_string_p( ustring ) : ustring;
    assert NIL != unicode_vector_string_p( vect ) : vect;
    _csetf_unicode_string_vect( ustring, vect );
    return ustring;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 3943L)
  public static SubLObject unicode_vector_string_p(final SubLObject v_object)
  {
    if( !v_object.isVector() )
    {
      return NIL;
    }
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( v_object ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL == unicode_character_p( Vectors.aref( v_object, i ) ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 4293L)
  public static SubLObject utf8_vector_string_p(final SubLObject v_object)
  {
    if( !v_object.isVector() )
    {
      return NIL;
    }
    SubLObject len;
    SubLObject index;
    SubLObject ulen;
    for( len = Sequences.length( v_object ), index = ZERO_INTEGER; index.numL( len ); index = Numbers.add( index, ulen ) )
    {
      ulen = length_utf8_vector_codepoint( v_object, index );
      if( ulen.isNegative() )
      {
        return NIL;
      }
    }
    if( index.numG( len ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 4669L)
  public static SubLObject ascii_string_p(final SubLObject v_object)
  {
    if( !v_object.isString() )
    {
      return NIL;
    }
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject v_char;
    for( cdotimes_end_var = Sequences.length( v_object ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      v_char = Strings.sublisp_char( v_object, i );
      if( NIL == ascii_char_p_int( v_char ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 4988L)
  public static SubLObject non_ascii_string_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL == ascii_string_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 5190L)
  public static SubLObject ascii_char_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && NIL != ascii_char_p_int( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 5401L)
  public static SubLObject non_ascii_char_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isChar() && NIL == ascii_char_p_int( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 5626L)
  public static SubLObject ascii_char_code_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isInteger() && v_object.numLE( $int38$127 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 5810L)
  public static SubLObject ascii_char_p_int(final SubLObject v_char)
  {
    return Numbers.numLE( Characters.char_code( v_char ), $int38$127 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 5956L)
  public static SubLObject identify_string_type(final SubLObject string)
  {
    if( NIL != ascii_string_p( string ) && NIL != string_utilities.html_escaped_string_p( string ) )
    {
      return $kw39$HTML_ESCAPED_ASCII;
    }
    if( NIL != non_ascii_string_p( string ) && NIL != string_utilities.html_escaped_string_p( string ) )
    {
      return $kw40$ESCAPED_PROBABLY_UTF8;
    }
    if( NIL != cycl_grammar.subl_string_p( string ) )
    {
      return $kw41$SUBL_STRING;
    }
    if( NIL != non_ascii_string_p( string ) )
    {
      return $kw42$PROBABLY_UTF8;
    }
    return $kw43$UNK;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 6458L)
  public static SubLObject display_vector_is_ascii_p(final SubLObject v_object)
  {
    if( NIL == display_vector_string_p( v_object ) )
    {
      return NIL;
    }
    final SubLObject vector_var;
    final SubLObject unicode_vector = vector_var = display_to_unicode_vector( v_object );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject elt;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      elt = Vectors.aref( vector_var, element_num );
      if( elt.numGE( $int44$128 ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 6759L)
  public static SubLObject display_vector_string_p(final SubLObject v_object)
  {
    if( !v_object.isString() )
    {
      return NIL;
    }
    SubLObject state = $kw45$OPEN;
    SubLObject ch = NIL;
    SubLObject count = ZERO_INTEGER;
    SubLObject uvalue = ZERO_INTEGER;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject pcase_var;
    SubLObject pcase_var_$1;
    SubLObject pcase_var_$2;
    for( cdotimes_end_var = Sequences.length( v_object ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      ch = Vectors.aref( v_object, i );
      pcase_var = state;
      if( pcase_var.eql( $kw45$OPEN ) )
      {
        pcase_var_$1 = ch;
        if( pcase_var_$1.eql( Characters.CHAR_ampersand ) )
        {
          state = $kw46$START_UNICODE;
        }
      }
      else if( pcase_var.eql( $kw46$START_UNICODE ) )
      {
        pcase_var_$2 = ch;
        if( pcase_var_$2.eql( Characters.CHAR_u ) || pcase_var_$2.eql( Characters.CHAR_U ) )
        {
          state = $kw47$UNICODE_CHAR;
          count = ZERO_INTEGER;
          uvalue = ZERO_INTEGER;
        }
        else
        {
          state = $kw45$OPEN;
        }
      }
      else if( pcase_var.eql( $kw47$UNICODE_CHAR ) )
      {
        if( ch.eql( Characters.CHAR_semicolon ) )
        {
          state = $kw45$OPEN;
          if( NIL == unicode_character_p( uvalue ) || !count.numG( ONE_INTEGER ) || !count.numL( SEVEN_INTEGER ) )
          {
            return NIL;
          }
        }
        else if( NIL == string_utilities.hex_char_p( ch ) )
        {
          return NIL;
        }
      }
      count = Numbers.add( count, ONE_INTEGER );
    }
    pcase_var = state;
    if( pcase_var.eql( $kw47$UNICODE_CHAR ) || pcase_var.eql( $kw46$START_UNICODE ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 7812L)
  public static SubLObject display_to_unicode_vector(final SubLObject v_object)
  {
    if( !v_object.isString() )
    {
      return NIL;
    }
    SubLObject state = $kw45$OPEN;
    SubLObject count = ZERO_INTEGER;
    SubLObject uvalue = ZERO_INTEGER;
    SubLObject retval = NIL;
    SubLObject elts = ZERO_INTEGER;
    SubLObject end_var_$3;
    SubLObject end_var;
    SubLObject i;
    SubLObject ch;
    SubLObject pcase_var;
    SubLObject pcase_var_$4;
    SubLObject pcase_var_$5;
    for( end_var = ( end_var_$3 = Sequences.length( v_object ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$3 ); i = number_utilities.f_1X( i ) )
    {
      ch = Strings.sublisp_char( v_object, i );
      pcase_var = state;
      if( pcase_var.eql( $kw45$OPEN ) )
      {
        pcase_var_$4 = ch;
        if( pcase_var_$4.eql( Characters.CHAR_ampersand ) )
        {
          state = $kw46$START_UNICODE;
        }
        else if( !pcase_var_$4.eql( Characters.CHAR_backslash ) )
        {
          retval = ConsesLow.cons( Characters.char_code( ch ), retval );
          elts = Numbers.add( elts, ONE_INTEGER );
        }
      }
      else if( pcase_var.eql( $kw46$START_UNICODE ) )
      {
        pcase_var_$5 = ch;
        if( pcase_var_$5.eql( Characters.CHAR_u ) || pcase_var_$5.eql( Characters.CHAR_U ) )
        {
          state = $kw47$UNICODE_CHAR;
          count = ZERO_INTEGER;
          uvalue = ZERO_INTEGER;
        }
        else
        {
          state = $kw45$OPEN;
          retval = ConsesLow.cons( Characters.char_code( Characters.CHAR_ampersand ), retval );
          retval = ConsesLow.cons( Characters.char_code( ch ), retval );
          elts = Numbers.add( elts, TWO_INTEGER );
        }
      }
      else if( pcase_var.eql( $kw47$UNICODE_CHAR ) )
      {
        if( ch.eql( Characters.CHAR_semicolon ) )
        {
          state = $kw45$OPEN;
          if( NIL == unicode_character_p( uvalue ) || !count.numG( ONE_INTEGER ) || !count.numL( SEVEN_INTEGER ) )
          {
            return NIL;
          }
          retval = ConsesLow.cons( uvalue, retval );
          elts = Numbers.add( elts, ONE_INTEGER );
        }
        else
        {
          if( NIL == string_utilities.hex_char_p( ch ) )
          {
            return NIL;
          }
          uvalue = Numbers.add( Numbers.ash( uvalue, FOUR_INTEGER ), string_utilities.hex_char_value( ch ) );
        }
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    final SubLObject pcase_var2 = state;
    if( pcase_var2.eql( $kw48$UNICDE_CHAR ) || pcase_var2.eql( $kw46$START_UNICODE ) )
    {
      return NIL;
    }
    return element_vector( Sequences.nreverse( retval ), elts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 9271L)
  public static SubLObject display_to_subl_string(final SubLObject display, SubLObject placeholder_char, SubLObject subst_alist)
  {
    if( placeholder_char == UNPROVIDED )
    {
      placeholder_char = $default_non_ascii_placeholder_char$.getGlobalValue();
    }
    if( subst_alist == UNPROVIDED )
    {
      subst_alist = $default_unicode_to_ascii_code_map$.getDynamicValue();
    }
    assert NIL != display_vector_string_p( display ) : display;
    assert NIL != ascii_char_p( placeholder_char ) : placeholder_char;
    final SubLObject unicode_vector = display_to_unicode_vector( display );
    final SubLObject length = Sequences.length( unicode_vector );
    final SubLObject string = Strings.make_string( length, placeholder_char );
    final SubLObject vector_var = unicode_vector;
    final SubLObject backwardP_var = NIL;
    SubLObject length_$6;
    SubLObject v_iteration;
    SubLObject index;
    SubLObject code;
    for( length_$6 = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length_$6 ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      index = ( ( NIL != backwardP_var ) ? Numbers.subtract( length_$6, v_iteration, ONE_INTEGER ) : v_iteration );
      code = Vectors.aref( vector_var, index );
      if( code.numGE( $int44$128 ) && NIL != list_utilities.alist_lookup( subst_alist, code, EQ, NIL ) )
      {
        Strings.set_char( string, index, Characters.code_char( list_utilities.alist_lookup( subst_alist, code, EQ, NIL ) ) );
      }
      else if( code.numL( $int44$128 ) )
      {
        Strings.set_char( string, index, Characters.code_char( code ) );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 12189L)
  public static SubLObject unicode_vector_to_display(final SubLObject ucode)
  {
    SubLObject retval = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject code_point;
      SubLObject hex;
      for( length = Sequences.length( ucode ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        code_point = Vectors.aref( ucode, element_num );
        if( code_point.eql( Characters.char_code( Characters.CHAR_quotation ) ) )
        {
          print_high.princ( $str52$__, stream );
        }
        else if( code_point.eql( Characters.char_code( Characters.CHAR_backslash ) ) )
        {
          print_high.princ( $str53$__, stream );
        }
        else if( code_point.eql( Characters.char_code( Characters.CHAR_ampersand ) ) )
        {
          print_high.princ( $str54$_u26_, stream );
        }
        else if( code_point.numGE( $int55$32 ) && code_point.numLE( $int38$127 ) )
        {
          print_high.princ( Strings.make_string( ONE_INTEGER, Characters.code_char( code_point ) ), stream );
        }
        else
        {
          hex = Strings.string_upcase( number_utilities.convert_to_hexadecimal( code_point ), UNPROVIDED, UNPROVIDED );
          if( Sequences.length( hex ).eql( ONE_INTEGER ) )
          {
            hex = Sequences.cconcatenate( $str56$0, hex );
          }
          PrintLow.format( stream, $str57$_u_A_, hex );
        }
      }
      retval = streams_high.get_output_stream_string( stream );
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
    return retval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 12999L)
  public static SubLObject element_vector(final SubLObject list, final SubLObject elts)
  {
    final SubLObject vect = Vectors.make_vector( elts, UNPROVIDED );
    SubLObject i = ZERO_INTEGER;
    SubLObject cdolist_list_var = list;
    SubLObject elt = NIL;
    elt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Vectors.set_aref( vect, i, elt );
      i = Numbers.add( i, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      elt = cdolist_list_var.first();
    }
    return vect;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 13218L)
  public static SubLObject unicode_vector_to_utf8_vector(final SubLObject ucode, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != unicode_vector_string_p( ucode ) : ucode;
    if( NIL == end )
    {
      end = Numbers.subtract( Sequences.length( ucode ), ONE_INTEGER );
    }
    SubLObject utf8_len = ZERO_INTEGER;
    SubLObject utf8_str = NIL;
    SubLObject offset = ZERO_INTEGER;
    SubLObject elt;
    for( SubLObject ucode_offset = start; ucode_offset.numLE( end ); ucode_offset = Numbers.add( ucode_offset, ONE_INTEGER ), utf8_len = Numbers.add( utf8_len, number_utf8_bytes( elt ) ) )
    {
      elt = Vectors.aref( ucode, ucode_offset );
    }
    utf8_str = Vectors.make_vector( utf8_len, UNPROVIDED );
    for( SubLObject ucode_offset = start; ucode_offset.numLE( end ); ucode_offset = Numbers.add( ucode_offset, ONE_INTEGER ), offset = to_utc8_vector_internal( utf8_str, offset, elt ) )
    {
      elt = Vectors.aref( ucode, ucode_offset );
    }
    return utf8_str;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 13945L)
  public static SubLObject utf8_vector_to_unicode_vector(final SubLObject utf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != utf8_vector_string_p( utf ) : utf;
    final SubLObject len = Sequences.length( utf );
    SubLObject index = ZERO_INTEGER;
    SubLObject number_ucode_elts = ZERO_INTEGER;
    SubLObject elt = ZERO_INTEGER;
    SubLObject unicode_vector = NIL;
    while ( index.numL( len ))
    {
      final SubLObject ulen = length_utf8_vector_codepoint( utf, index );
      if( MINUS_ONE_INTEGER.eql( ulen ) )
      {
        Errors.error( $str59$Invalid_UTF_8_encoding_at__S_in__, index, utf );
      }
      number_ucode_elts = Numbers.add( number_ucode_elts, ONE_INTEGER );
      index = Numbers.add( index, ulen );
    }
    unicode_vector = Vectors.make_vector( number_ucode_elts, UNPROVIDED );
    index = ZERO_INTEGER;
    while ( index.numL( len ))
    {
      thread.resetMultipleValues();
      final SubLObject value = get_unicode_char_at_offset( utf, index );
      final SubLObject next_offset = thread.secondMultipleValue();
      final SubLObject len_elt = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      index = next_offset;
      Vectors.set_aref( unicode_vector, elt, value );
      elt = Numbers.add( elt, ONE_INTEGER );
    }
    return unicode_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 14734L)
  public static SubLObject unicode_char_code(final SubLObject uchar)
  {
    assert NIL != unicode_char_p( uchar ) : uchar;
    return unicode_char_uchar( uchar );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 14889L)
  public static SubLObject unicode_code_char(final SubLObject uchar)
  {
    assert NIL != unicode_character_p( uchar ) : uchar;
    return unicode_char_create( uchar );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 15050L)
  public static SubLObject unicode_character_p(final SubLObject uchar)
  {
    if( !uchar.isInteger() )
    {
      return NIL;
    }
    if( uchar.isNegative() )
    {
      return NIL;
    }
    return unicode_subsets.unicode_isdefined( uchar );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 15248L)
  public static SubLObject number_utf8_bytes(final SubLObject uchar)
  {
    assert NIL != unicode_character_p( uchar ) : uchar;
    if( uchar.numLE( $int38$127 ) )
    {
      return ONE_INTEGER;
    }
    if( uchar.numLE( $int60$2047 ) )
    {
      return TWO_INTEGER;
    }
    if( uchar.numLE( $int61$65535 ) )
    {
      return THREE_INTEGER;
    }
    if( uchar.numLE( $int62$2097151 ) )
    {
      return FOUR_INTEGER;
    }
    if( uchar.numLE( $int63$67108863 ) )
    {
      return FIVE_INTEGER;
    }
    return SIX_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 15590L)
  public static SubLObject to_utf8_vector(final SubLObject uchar)
  {
    assert NIL != unicode_character_p( uchar ) : uchar;
    final SubLObject vect = Vectors.make_vector( number_utf8_bytes( uchar ), UNPROVIDED );
    to_utc8_vector_internal( vect, ZERO_INTEGER, uchar );
    return vect;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 15832L)
  public static SubLObject print_utf_hex_list(final SubLObject uvect)
  {
    PrintLow.format( T, $str64$__ );
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( uvect ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      PrintLow.format( T, $str65$_x_x_, Vectors.aref( uvect, i ) );
    }
    PrintLow.format( T, $str66$___ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 16049L)
  public static SubLObject to_utc8_vector_internal(final SubLObject char_vector, final SubLObject offset, final SubLObject uchar)
  {
    if( uchar.numLE( $int38$127 ) )
    {
      Vectors.set_aref( char_vector, offset, uchar );
      return Numbers.add( offset, ONE_INTEGER );
    }
    if( uchar.numLE( $int60$2047 ) )
    {
      Vectors.set_aref( char_vector, offset, Numbers.logior( $int67$192, Numbers.ash( uchar, $int68$_6 ) ) );
      Vectors.set_aref( char_vector, Numbers.add( offset, ONE_INTEGER ), Numbers.logior( $int44$128, Numbers.logand( uchar, $int69$63 ) ) );
      return Numbers.add( offset, TWO_INTEGER );
    }
    if( uchar.numLE( $int61$65535 ) )
    {
      Vectors.set_aref( char_vector, offset, Numbers.logior( $int70$224, Numbers.ash( uchar, $int71$_12 ) ) );
      Vectors.set_aref( char_vector, Numbers.add( offset, ONE_INTEGER ), Numbers.logior( $int44$128, Numbers.logand( Numbers.ash( uchar, $int68$_6 ), $int69$63 ) ) );
      Vectors.set_aref( char_vector, Numbers.add( offset, TWO_INTEGER ), Numbers.logior( $int44$128, Numbers.logand( uchar, $int69$63 ) ) );
      return Numbers.add( offset, THREE_INTEGER );
    }
    if( uchar.numLE( $int62$2097151 ) )
    {
      Vectors.set_aref( char_vector, offset, Numbers.logior( $int72$240, Numbers.ash( uchar, $int73$_18 ) ) );
      Vectors.set_aref( char_vector, Numbers.add( offset, ONE_INTEGER ), Numbers.logior( $int44$128, Numbers.logand( Numbers.ash( uchar, $int71$_12 ), $int69$63 ) ) );
      Vectors.set_aref( char_vector, Numbers.add( offset, TWO_INTEGER ), Numbers.logior( $int44$128, Numbers.logand( Numbers.ash( uchar, $int68$_6 ), $int69$63 ) ) );
      Vectors.set_aref( char_vector, Numbers.add( offset, THREE_INTEGER ), Numbers.logior( $int44$128, Numbers.logand( uchar, $int69$63 ) ) );
      return Numbers.add( offset, FOUR_INTEGER );
    }
    if( uchar.numLE( $int63$67108863 ) )
    {
      Vectors.set_aref( char_vector, offset, Numbers.logior( $int74$248, Numbers.ash( uchar, $int75$_24 ) ) );
      Vectors.set_aref( char_vector, Numbers.add( offset, ONE_INTEGER ), Numbers.logior( $int44$128, Numbers.logand( Numbers.ash( uchar, $int73$_18 ), $int69$63 ) ) );
      Vectors.set_aref( char_vector, Numbers.add( offset, TWO_INTEGER ), Numbers.logior( $int44$128, Numbers.logand( Numbers.ash( uchar, $int71$_12 ), $int69$63 ) ) );
      Vectors.set_aref( char_vector, Numbers.add( offset, THREE_INTEGER ), Numbers.logior( $int44$128, Numbers.logand( Numbers.ash( uchar, $int68$_6 ), $int69$63 ) ) );
      Vectors.set_aref( char_vector, Numbers.add( offset, FOUR_INTEGER ), Numbers.logior( $int44$128, Numbers.logand( uchar, $int69$63 ) ) );
      return Numbers.add( offset, FIVE_INTEGER );
    }
    return Numbers.add( offset, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 17594L)
  public static SubLObject length_utf8_vector_codepoint(final SubLObject char_vector, final SubLObject offset)
  {
    if( !char_vector.isVector() )
    {
      return MINUS_ONE_INTEGER;
    }
    final SubLObject len = Sequences.length( char_vector );
    SubLObject ulen = ZERO_INTEGER;
    if( offset.numGE( len ) || offset.isNegative() )
    {
      return MINUS_ONE_INTEGER;
    }
    final SubLObject first_byte = Vectors.aref( char_vector, offset );
    ulen = length_utf8_from_first_byte( first_byte );
    if( ulen.isNegative() )
    {
      return ulen;
    }
    if( Numbers.add( offset, ulen ).numG( len ) )
    {
      return MINUS_ONE_INTEGER;
    }
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject charcode;
    SubLObject logand;
    for( cdotimes_end_var = Numbers.add( ulen, MINUS_ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      charcode = Vectors.aref( char_vector, Numbers.add( offset, ONE_INTEGER, i ) );
      logand = Numbers.logand( $int67$192, charcode );
      if( !logand.numE( $int44$128 ) )
      {
        return MINUS_ONE_INTEGER;
      }
    }
    return ulen;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 18273L)
  public static SubLObject length_utf8_from_first_byte(final SubLObject first_byte)
  {
    if( NIL == number_utilities.bytep( first_byte ) )
    {
      return MINUS_ONE_INTEGER;
    }
    if( Numbers.logand( $int44$128, first_byte ).numE( ZERO_INTEGER ) )
    {
      return ONE_INTEGER;
    }
    if( Numbers.logand( $int70$224, first_byte ).numE( $int67$192 ) )
    {
      return first_byte.numG( $int76$193 ) ? TWO_INTEGER : MINUS_ONE_INTEGER;
    }
    if( Numbers.logand( $int72$240, first_byte ).numE( $int70$224 ) )
    {
      return THREE_INTEGER;
    }
    if( Numbers.logand( $int74$248, first_byte ).numE( $int72$240 ) )
    {
      return first_byte.numL( $int77$245 ) ? FOUR_INTEGER : MINUS_ONE_INTEGER;
    }
    return MINUS_ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 18726L)
  public static SubLObject utf8_vector_is_ascii_string_p(final SubLObject char_vector, SubLObject offset, SubLObject end)
  {
    if( offset == UNPROVIDED )
    {
      offset = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = Numbers.subtract( Sequences.length( char_vector ), ONE_INTEGER );
    }
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Numbers.add( Numbers.subtract( end, offset ), ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL == utf8_char_is_ascii_p( char_vector, Numbers.add( offset, i ) ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 19020L)
  public static SubLObject utf8_char_is_ascii_p(final SubLObject char_vector, final SubLObject offset)
  {
    return Numbers.numE( ONE_INTEGER, length_utf8_vector_codepoint( char_vector, offset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 19184L)
  public static SubLObject unicode_vector_is_ascii_string_p(final SubLObject unicode_vector, SubLObject offset, SubLObject end)
  {
    if( offset == UNPROVIDED )
    {
      offset = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = Numbers.subtract( Sequences.length( unicode_vector ), ONE_INTEGER );
    }
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Numbers.add( Numbers.subtract( end, offset ), ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL == unicode_char_is_ascii_char_p( Vectors.aref( unicode_vector, Numbers.add( offset, i ) ) ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 19512L)
  public static SubLObject unicode_char_is_ascii_char_p(final SubLObject unicode_char)
  {
    if( NIL != unicode_character_p( unicode_char ) )
    {
      return Numbers.numLE( unicode_char, $int38$127 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 19705L)
  public static SubLObject utf8_char_p(final SubLObject char_vector, final SubLObject offset)
  {
    return Numbers.plusp( length_utf8_vector_codepoint( char_vector, offset ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 19863L)
  public static SubLObject get_unicode_char_at_or_after_offset(final SubLObject char_vector, final SubLObject offset)
  {
    assert NIL != Types.vectorp( char_vector ) : char_vector;
    SubLObject len;
    SubLObject index;
    for( len = Sequences.length( char_vector ), index = offset; index.numL( len ) && Numbers.logand( $int67$192, Vectors.aref( char_vector, index ) ).numE( $int44$128 ); index = Numbers.add( index, ONE_INTEGER ) )
    {
    }
    if( index.numGE( len ) )
    {
      return Values.values( MINUS_ONE_INTEGER, len );
    }
    return get_unicode_char_at_offset( char_vector, index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 20357L)
  public static SubLObject get_unicode_char_at_or_before_offset(final SubLObject char_vector, final SubLObject offset)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.vectorp( char_vector ) : char_vector;
    final SubLObject len = Sequences.length( char_vector );
    SubLObject index = offset;
    if( index.numGE( len ) )
    {
      return Values.values( MINUS_ONE_INTEGER, MINUS_ONE_INTEGER );
    }
    while ( index.numGE( ZERO_INTEGER ) && Numbers.logand( $int67$192, Vectors.aref( char_vector, index ) ).numE( $int44$128 ))
    {
      index = Numbers.subtract( index, ONE_INTEGER );
    }
    if( index.numL( ZERO_INTEGER ) )
    {
      return Values.values( MINUS_ONE_INTEGER, MINUS_ONE_INTEGER );
    }
    thread.resetMultipleValues();
    final SubLObject value = get_unicode_char_at_offset( char_vector, index );
    final SubLObject next_offset = thread.secondMultipleValue();
    final SubLObject len_$7 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( value, Numbers.subtract( Numbers.subtract( next_offset, len_$7 ), ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 20996L)
  public static SubLObject get_unicode_char_at_offset(final SubLObject char_vector, final SubLObject offset)
  {
    final SubLObject pcase_var;
    final SubLObject ulen = pcase_var = length_utf8_vector_codepoint( char_vector, offset );
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return Values.values( Vectors.aref( char_vector, offset ), Numbers.add( offset, ONE_INTEGER ), ulen );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return Values.values( Numbers.add( Numbers.ash( Numbers.logand( Vectors.aref( char_vector, offset ), $int79$31 ), SIX_INTEGER ), Numbers.logand( Vectors.aref( char_vector, Numbers.add( offset, ONE_INTEGER ) ),
          $int69$63 ) ), Numbers.add( offset, TWO_INTEGER ), ulen );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return Values.values( Numbers.add( Numbers.ash( Numbers.logand( Vectors.aref( char_vector, offset ), FIFTEEN_INTEGER ), TWELVE_INTEGER ), Numbers.ash( Numbers.logand( Vectors.aref( char_vector, Numbers.add( offset,
          ONE_INTEGER ) ), $int69$63 ), SIX_INTEGER ), Numbers.logand( Vectors.aref( char_vector, Numbers.add( offset, TWO_INTEGER ) ), $int69$63 ) ), Numbers.add( offset, THREE_INTEGER ), ulen );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return Values.values( Numbers.add( new SubLObject[] { Numbers.ash( Numbers.logand( Vectors.aref( char_vector, offset ), SEVEN_INTEGER ), EIGHTEEN_INTEGER ), Numbers.ash( Numbers.logand( Vectors.aref( char_vector,
          Numbers.add( offset, ONE_INTEGER ) ), $int69$63 ), TWELVE_INTEGER ), Numbers.ash( Numbers.logand( Vectors.aref( char_vector, Numbers.add( offset, TWO_INTEGER ) ), $int69$63 ), SIX_INTEGER ), Numbers.logand(
              Vectors.aref( char_vector, Numbers.add( offset, THREE_INTEGER ) ), $int69$63 )
      } ), Numbers.add( offset, FOUR_INTEGER ), ulen );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return Values.values( Numbers.add( new SubLObject[] { Numbers.ash( Numbers.logand( Vectors.aref( char_vector, offset ), THREE_INTEGER ), $int80$24 ), Numbers.ash( Numbers.logand( Vectors.aref( char_vector, Numbers
          .add( offset, ONE_INTEGER ) ), $int69$63 ), EIGHTEEN_INTEGER ), Numbers.ash( Numbers.logand( Vectors.aref( char_vector, Numbers.add( offset, TWO_INTEGER ) ), $int69$63 ), TWELVE_INTEGER ), Numbers.ash( Numbers
              .logand( Vectors.aref( char_vector, Numbers.add( offset, THREE_INTEGER ) ), $int69$63 ), SIX_INTEGER ), Numbers.logand( Vectors.aref( char_vector, Numbers.add( offset, FOUR_INTEGER ) ), $int69$63 )
      } ), Numbers.add( offset, FOUR_INTEGER ), ulen );
    }
    return Values.values( MINUS_ONE_INTEGER, Numbers.add( offset, ONE_INTEGER ), ulen );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 22389L)
  public static SubLObject string_from_char_list(final SubLObject list, SubLObject len)
  {
    if( len == UNPROVIDED )
    {
      len = Sequences.length( list );
    }
    final SubLObject str = Strings.make_string( len, UNPROVIDED );
    SubLObject buffer = list;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( len ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( str, i, buffer.first() );
      buffer = buffer.rest();
    }
    return str;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 22635L)
  public static SubLObject unicode_to_html_escaped(final SubLObject unicode_vector, SubLObject escape_reserved_charsP)
  {
    if( escape_reserved_charsP == UNPROVIDED )
    {
      escape_reserved_charsP = T;
    }
    SubLObject html_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject elt;
      SubLObject hex;
      for( length = Sequences.length( unicode_vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        elt = Vectors.aref( unicode_vector, element_num );
        if( elt.numL( $int55$32 ) || elt.numGE( $int44$128 ) || ( NIL != escape_reserved_charsP && NIL != html_utilities.html_reserved_character_code_p( elt ) ) )
        {
          print_high.princ( $str81$__x, stream );
          hex = number_utilities.convert_to_hexadecimal( elt );
          if( Sequences.length( hex ).numLE( ONE_INTEGER ) )
          {
            print_high.princ( Characters.CHAR_0, stream );
          }
          print_high.princ( hex, stream );
          print_high.princ( Characters.CHAR_semicolon, stream );
        }
        else
        {
          print_high.princ( Characters.code_char( elt ), stream );
        }
      }
      html_string = streams_high.get_output_stream_string( stream );
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
    return html_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 23336L)
  public static SubLObject unicode_string_to_utf8(final SubLObject unicode_string)
  {
    return unicode_display_to_utf8( unicode_vector_to_display( unicode_string_get_vector( unicode_string ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 23498L)
  public static SubLObject unicode_string_to_subl_string(final SubLObject unicode_string)
  {
    return display_to_subl_string( unicode_vector_to_display( unicode_string_get_vector( unicode_string ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 23666L)
  public static SubLObject unicode_display_to_utf8(final SubLObject string)
  {
    return html_escaped_to_utf8_string( unicode_display_to_html( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 23787L)
  public static SubLObject unicode_display_to_html(final SubLObject string)
  {
    final SubLObject vector = display_to_unicode_vector( string );
    return unicode_to_html_escaped( vector, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 23935L)
  public static SubLObject html_escaped_to_utf8_vector(final SubLObject html_string)
  {
    final SubLObject uvect = html_escaped_to_unicode_vector( html_string );
    return ( NIL != uvect ) ? unicode_vector_to_utf8_vector( uvect, UNPROVIDED, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 24157L)
  public static SubLObject utf8_string_to_unicode_vector(final SubLObject utf8_string)
  {
    return utf8_vector_to_unicode_vector( utf8_string_to_utf8_vector( utf8_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 24299L)
  public static SubLObject html_escaped_to_unicode_vector(final SubLObject html_string)
  {
    return html_unescape_unicode_vector( utf8_string_to_unicode_vector( html_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 24446L)
  public static SubLObject html_escaped_utf8_string_to_utf8_string(final SubLObject utf8_html_string)
  {
    return utf8_vector_to_utf8_string( unicode_vector_to_utf8_vector( html_escaped_to_unicode_vector( utf8_html_string ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 24646L)
  public static SubLObject html_unescape_unicode_vector(final SubLObject unicode_vector)
  {
    SubLObject unicode_char_stack = NIL;
    SubLObject state = $kw45$OPEN;
    SubLObject code = NIL;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject i;
    SubLObject ch;
    SubLObject pcase_var;
    SubLObject pcase_var_$8;
    SubLObject pcase_var_$9;
    SubLObject pcase_var_$10;
    SubLObject raw_code_string;
    SubLObject code_string;
    SubLObject pcase_var_$11;
    SubLObject entname;
    SubLObject entval;
    for( length = Sequences.length( unicode_vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      i = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      ch = Vectors.aref( unicode_vector, i );
      pcase_var = state;
      if( pcase_var.eql( $kw45$OPEN ) )
      {
        pcase_var_$8 = ch;
        if( pcase_var_$8.eql( $int82$38 ) )
        {
          state = $kw83$START_HTML_ESCAPE;
        }
        else if( pcase_var_$8.eql( $int84$60 ) )
        {
          unicode_char_stack = ConsesLow.cons( ch, unicode_char_stack );
          state = $kw85$INSIDE_TAG;
        }
        else
        {
          unicode_char_stack = ConsesLow.cons( ch, unicode_char_stack );
        }
      }
      else if( pcase_var.eql( $kw85$INSIDE_TAG ) )
      {
        unicode_char_stack = ConsesLow.cons( ch, unicode_char_stack );
        if( ch.eql( $int86$62 ) )
        {
          state = $kw45$OPEN;
        }
      }
      else if( pcase_var.eql( $kw83$START_HTML_ESCAPE ) )
      {
        code = NIL;
        pcase_var_$9 = ch;
        if( pcase_var_$9.eql( $int87$35 ) )
        {
          state = $kw88$HTML_NUMERIC_ESCAPE_START;
        }
        else
        {
          code = ConsesLow.cons( ch, code );
          state = $kw89$ENTITY_ESCAPE;
        }
      }
      else if( pcase_var.eql( $kw88$HTML_NUMERIC_ESCAPE_START ) )
      {
        if( ch.numE( $int90$120 ) )
        {
          state = $kw91$HTML_HEXADECIMAL_ESCAPE;
        }
        else
        {
          if( !ch.numGE( $int92$48 ) || !ch.numLE( $int93$57 ) )
          {
            return NIL;
          }
          state = $kw94$HTML_DECIMAL_ESCAPE;
          code = ConsesLow.cons( ch, code );
        }
      }
      else if( pcase_var.eql( $kw91$HTML_HEXADECIMAL_ESCAPE ) || pcase_var.eql( $kw94$HTML_DECIMAL_ESCAPE ) )
      {
        pcase_var_$10 = ch;
        if( pcase_var_$10.eql( $int95$59 ) )
        {
          raw_code_string = string_from_char_list( Mapping.mapcar( $sym96$CODE_CHAR, Sequences.nreverse( code ) ), UNPROVIDED );
          code_string = ( ( state == $kw91$HTML_HEXADECIMAL_ESCAPE ) ? number_utilities.convert_hexadecimal_to_decimal( raw_code_string )
              : reader.read_from_string( raw_code_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          unicode_char_stack = ConsesLow.cons( code_string, unicode_char_stack );
          state = $kw45$OPEN;
        }
        else
        {
          code = ConsesLow.cons( ch, code );
        }
      }
      else if( pcase_var.eql( $kw89$ENTITY_ESCAPE ) )
      {
        pcase_var_$11 = ch;
        if( pcase_var_$11.eql( $int95$59 ) )
        {
          state = $kw45$OPEN;
          entname = string_from_char_list( Mapping.mapcar( $sym96$CODE_CHAR, Sequences.nreverse( code ) ), UNPROVIDED );
          entval = map_character_entity_to_decimal_value( entname );
          if( NIL == entval )
          {
            return NIL;
          }
          unicode_char_stack = ConsesLow.cons( entval, unicode_char_stack );
        }
        else
        {
          code = ConsesLow.cons( ch, code );
        }
      }
    }
    if( state != $kw45$OPEN )
    {
      return NIL;
    }
    return list_utilities.list2vector( Sequences.nreverse( unicode_char_stack ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 26583L)
  public static SubLObject utf8_vector_to_utf8_string(final SubLObject utf8_vector)
  {
    return vector_utilities.byte_vector_to_string( utf8_vector );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 26686L)
  public static SubLObject utf8_string_to_utf8_vector(final SubLObject utf8_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject bad_char = Sequences.find( $int97$256, utf8_string, Symbols.symbol_function( $sym98$__ ), Symbols.symbol_function( $sym99$CHAR_CODE ), UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != bad_char )
    {
      Errors.error( $str100$_S__code___S__is_not_a_valid_utf8, bad_char, Characters.char_code( bad_char ) );
    }
    return subl_string_to_char_code_vector( utf8_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 26969L)
  public static SubLObject subl_string_to_char_code_vector(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject vector = Vectors.make_vector( Sequences.length( string ), UNPROVIDED );
    SubLObject end_var_$12;
    SubLObject end_var;
    SubLObject i;
    SubLObject v_char;
    SubLObject code;
    for( end_var = ( end_var_$12 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$12 ); i = number_utilities.f_1X( i ) )
    {
      v_char = Strings.sublisp_char( string, i );
      code = Characters.char_code( v_char );
      Vectors.set_aref( vector, i, code );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 27235L)
  public static SubLObject utf8_string_to_subl_string(final SubLObject utf8_string)
  {
    return display_to_subl_string( utf8_string_to_display( utf8_string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 27365L)
  public static SubLObject utf8_string_to_display(final SubLObject utf8_string)
  {
    return unicode_vector_to_display( utf8_vector_to_unicode_vector( utf8_string_to_utf8_vector( utf8_string ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 27531L)
  public static SubLObject html_escaped_to_utf8_string(final SubLObject html_string)
  {
    if( NIL == Sequences.find( Characters.CHAR_ampersand, html_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return html_string;
    }
    final SubLObject escvect = html_escaped_to_utf8_vector( html_string );
    if( NIL == escvect )
    {
      return NIL;
    }
    return utf8_vector_to_utf8_string( escvect );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 27789L)
  public static SubLObject display_to_utf8_string(final SubLObject display)
  {
    final SubLObject unicode_vector = display_to_unicode_vector( display );
    final SubLObject escvect = ( NIL != unicode_vector ) ? unicode_vector_to_utf8_vector( unicode_vector, UNPROVIDED, UNPROVIDED ) : NIL;
    return ( NIL != escvect ) ? utf8_vector_to_utf8_string( escvect ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 28052L)
  public static SubLObject html_escaped_to_display(final SubLObject html_string)
  {
    return utf8_string_to_display( html_escaped_to_utf8_string( html_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 34080L)
  public static SubLObject map_character_entity_to_decimal_value(final SubLObject entity_name)
  {
    return list_utilities.alist_lookup_without_values( $html_40_character_entity_table$.getGlobalValue(), entity_name, Symbols.symbol_function( EQUAL ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 34248L)
  public static SubLObject map_decimal_value_to_character_entity(final SubLObject char_code)
  {
    return list_utilities.alist_reverse_lookup_without_values( $html_40_character_entity_table$.getGlobalValue(), char_code, Symbols.symbol_function( EQL ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 34417L)
  public static SubLObject unicode_string_concatenate(final SubLObject unicode_string_1, final SubLObject unicode_string_2)
  {
    final SubLObject vect1 = unicode_string_get_vector( unicode_string_1 );
    final SubLObject length1 = Sequences.length( vect1 );
    final SubLObject vect2 = unicode_string_get_vector( unicode_string_2 );
    final SubLObject length2 = Sequences.length( vect2 );
    final SubLObject new_vect = Vectors.make_vector( Numbers.add( length1, length2 ), UNPROVIDED );
    SubLObject vector_var = vect1;
    SubLObject backwardP_var = NIL;
    SubLObject length3;
    SubLObject v_iteration;
    SubLObject i;
    SubLObject code;
    for( length3 = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length3 ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      i = ( ( NIL != backwardP_var ) ? Numbers.subtract( length3, v_iteration, ONE_INTEGER ) : v_iteration );
      code = Vectors.aref( vector_var, i );
      Vectors.set_aref( new_vect, i, code );
    }
    vector_var = vect2;
    backwardP_var = NIL;
    SubLObject j;
    for( length3 = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length3 ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      i = ( ( NIL != backwardP_var ) ? Numbers.subtract( length3, v_iteration, ONE_INTEGER ) : v_iteration );
      code = Vectors.aref( vector_var, i );
      j = Numbers.add( i, length1 );
      Vectors.set_aref( new_vect, j, code );
    }
    return unicode_string_create( new_vect );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 35321L)
  public static SubLObject cfasl_output_object_unicode_char_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_unicode_char( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 35450L)
  public static SubLObject cfasl_output_unicode_char(final SubLObject unicode_char, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_unicode_char$.getGlobalValue(), stream );
    final SubLObject utf8_vect = to_utf8_vector( unicode_char_uchar( unicode_char ) );
    final SubLObject length = Sequences.length( utf8_vect );
    cfasl.cfasl_output( length, stream );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      cfasl.cfasl_raw_write_byte( Vectors.aref( utf8_vect, i ), stream );
    }
    return unicode_char;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 35818L)
  public static SubLObject cfasl_input_unicode_char(final SubLObject stream)
  {
    final SubLObject length = cfasl.cfasl_input_object( stream );
    SubLObject unicode_vector = NIL;
    SubLObject output_vector = NIL;
    unicode_vector = Vectors.make_vector( length, UNPROVIDED );
    SubLObject i;
    SubLObject v_byte;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      v_byte = cfasl.cfasl_raw_read_byte( stream );
      if( NIL != number_utilities.bytep( v_byte ) )
      {
        Vectors.set_aref( unicode_vector, i, v_byte );
      }
      else
      {
        Errors.error( $str106$Invalid_unicode_character__expect, length, Numbers.add( i, ONE_INTEGER ) );
      }
    }
    final SubLObject uchar = get_unicode_char_at_offset( unicode_vector, ZERO_INTEGER );
    output_vector = unicode_char_create( uchar );
    return output_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 36696L)
  public static SubLObject cfasl_output_object_unicode_string_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_unicode_string( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 36829L)
  public static SubLObject cfasl_output_unicode_string(final SubLObject unicode_string, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_unicode_string$.getGlobalValue(), stream );
    final SubLObject utf8_vect = unicode_vector_to_utf8_vector( unicode_string_vect( unicode_string ), UNPROVIDED, UNPROVIDED );
    final SubLObject length = Sequences.length( utf8_vect );
    cfasl.cfasl_output( length, stream );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      cfasl.cfasl_raw_write_byte( Vectors.aref( utf8_vect, i ), stream );
    }
    return unicode_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 37223L)
  public static SubLObject cfasl_input_unicode_string(final SubLObject stream)
  {
    final SubLObject length = cfasl.cfasl_input_object( stream );
    SubLObject unicode_vector = NIL;
    SubLObject output_vector = NIL;
    unicode_vector = Vectors.make_vector( length, UNPROVIDED );
    SubLObject i;
    SubLObject v_byte;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      v_byte = cfasl.cfasl_raw_read_byte( stream );
      if( NIL != number_utilities.bytep( v_byte ) )
      {
        Vectors.set_aref( unicode_vector, i, v_byte );
      }
      else
      {
        Errors.error( $str106$Invalid_unicode_character__expect, length, Numbers.add( i, ONE_INTEGER ) );
      }
    }
    final SubLObject vect = utf8_vector_to_unicode_vector( unicode_vector );
    output_vector = unicode_string_create( vect );
    return output_vector;
  }

  public static SubLObject declare_unicode_strings_file()
  {
    SubLFiles.declareFunction( me, "unicode_char_print_function_trampoline", "UNICODE-CHAR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "unicode_char_p", "UNICODE-CHAR-P", 1, 0, false );
    new $unicode_char_p$UnaryFunction();
    SubLFiles.declareFunction( me, "unicode_char_uchar", "UNICODE-CHAR-UCHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_unicode_char_uchar", "_CSETF-UNICODE-CHAR-UCHAR", 2, 0, false );
    SubLFiles.declareFunction( me, "make_unicode_char", "MAKE-UNICODE-CHAR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_unicode_char", "VISIT-DEFSTRUCT-UNICODE-CHAR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_unicode_char_method", "VISIT-DEFSTRUCT-OBJECT-UNICODE-CHAR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "unicode_char_create", "UNICODE-CHAR-CREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "print_unicode_char", "PRINT-UNICODE-CHAR", 3, 0, false );
    SubLFiles.declareFunction( me, "unicode_char_get_char", "UNICODE-CHAR-GET-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_char_set_char", "UNICODE-CHAR-SET-CHAR", 2, 0, false );
    SubLFiles.declareFunction( me, "unicode_string_print_function_trampoline", "UNICODE-STRING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "unicode_string_p", "UNICODE-STRING-P", 1, 0, false );
    new $unicode_string_p$UnaryFunction();
    SubLFiles.declareFunction( me, "unicode_string_vect", "UNICODE-STRING-VECT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_unicode_string_vect", "_CSETF-UNICODE-STRING-VECT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_unicode_string", "MAKE-UNICODE-STRING", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_unicode_string", "VISIT-DEFSTRUCT-UNICODE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_unicode_string_method", "VISIT-DEFSTRUCT-OBJECT-UNICODE-STRING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "unicode_string_create", "UNICODE-STRING-CREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "print_unicode_string", "PRINT-UNICODE-STRING", 3, 0, false );
    SubLFiles.declareFunction( me, "unicode_string_get_vector", "UNICODE-STRING-GET-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_string_set_vector", "UNICODE-STRING-SET-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "unicode_vector_string_p", "UNICODE-VECTOR-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_vector_string_p", "UTF8-VECTOR-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ascii_string_p", "ASCII-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_ascii_string_p", "NON-ASCII-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ascii_char_p", "ASCII-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_ascii_char_p", "NON-ASCII-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ascii_char_code_p", "ASCII-CHAR-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ascii_char_p_int", "ASCII-CHAR-P-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "identify_string_type", "IDENTIFY-STRING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "display_vector_is_ascii_p", "DISPLAY-VECTOR-IS-ASCII-P", 1, 0, false );
    SubLFiles.declareFunction( me, "display_vector_string_p", "DISPLAY-VECTOR-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "display_to_unicode_vector", "DISPLAY-TO-UNICODE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "display_to_subl_string", "DISPLAY-TO-SUBL-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "unicode_vector_to_display", "UNICODE-VECTOR-TO-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "element_vector", "ELEMENT-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "unicode_vector_to_utf8_vector", "UNICODE-VECTOR-TO-UTF8-VECTOR", 1, 2, false );
    SubLFiles.declareFunction( me, "utf8_vector_to_unicode_vector", "UTF8-VECTOR-TO-UNICODE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_char_code", "UNICODE-CHAR-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_code_char", "UNICODE-CODE-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_character_p", "UNICODE-CHARACTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "number_utf8_bytes", "NUMBER-UTF8-BYTES", 1, 0, false );
    SubLFiles.declareFunction( me, "to_utf8_vector", "TO-UTF8-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "print_utf_hex_list", "PRINT-UTF-HEX-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "to_utc8_vector_internal", "TO-UTC8-VECTOR-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "length_utf8_vector_codepoint", "LENGTH-UTF8-VECTOR-CODEPOINT", 2, 0, false );
    SubLFiles.declareFunction( me, "length_utf8_from_first_byte", "LENGTH-UTF8-FROM-FIRST-BYTE", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_vector_is_ascii_string_p", "UTF8-VECTOR-IS-ASCII-STRING-P", 1, 2, false );
    SubLFiles.declareFunction( me, "utf8_char_is_ascii_p", "UTF8-CHAR-IS-ASCII-P", 2, 0, false );
    SubLFiles.declareFunction( me, "unicode_vector_is_ascii_string_p", "UNICODE-VECTOR-IS-ASCII-STRING-P", 1, 2, false );
    SubLFiles.declareFunction( me, "unicode_char_is_ascii_char_p", "UNICODE-CHAR-IS-ASCII-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_char_p", "UTF8-CHAR-P", 2, 0, false );
    SubLFiles.declareFunction( me, "get_unicode_char_at_or_after_offset", "GET-UNICODE-CHAR-AT-OR-AFTER-OFFSET", 2, 0, false );
    SubLFiles.declareFunction( me, "get_unicode_char_at_or_before_offset", "GET-UNICODE-CHAR-AT-OR-BEFORE-OFFSET", 2, 0, false );
    SubLFiles.declareFunction( me, "get_unicode_char_at_offset", "GET-UNICODE-CHAR-AT-OFFSET", 2, 0, false );
    SubLFiles.declareFunction( me, "string_from_char_list", "STRING-FROM-CHAR-LIST", 1, 1, false );
    SubLFiles.declareFunction( me, "unicode_to_html_escaped", "UNICODE-TO-HTML-ESCAPED", 1, 1, false );
    SubLFiles.declareFunction( me, "unicode_string_to_utf8", "UNICODE-STRING-TO-UTF8", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_string_to_subl_string", "UNICODE-STRING-TO-SUBL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_display_to_utf8", "UNICODE-DISPLAY-TO-UTF8", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_display_to_html", "UNICODE-DISPLAY-TO-HTML", 1, 0, false );
    SubLFiles.declareFunction( me, "html_escaped_to_utf8_vector", "HTML-ESCAPED-TO-UTF8-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_string_to_unicode_vector", "UTF8-STRING-TO-UNICODE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "html_escaped_to_unicode_vector", "HTML-ESCAPED-TO-UNICODE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "html_escaped_utf8_string_to_utf8_string", "HTML-ESCAPED-UTF8-STRING-TO-UTF8-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_unescape_unicode_vector", "HTML-UNESCAPE-UNICODE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_vector_to_utf8_string", "UTF8-VECTOR-TO-UTF8-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_string_to_utf8_vector", "UTF8-STRING-TO-UTF8-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_string_to_char_code_vector", "SUBL-STRING-TO-CHAR-CODE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_string_to_subl_string", "UTF8-STRING-TO-SUBL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_string_to_display", "UTF8-STRING-TO-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "html_escaped_to_utf8_string", "HTML-ESCAPED-TO-UTF8-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "display_to_utf8_string", "DISPLAY-TO-UTF8-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_escaped_to_display", "HTML-ESCAPED-TO-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "map_character_entity_to_decimal_value", "MAP-CHARACTER-ENTITY-TO-DECIMAL-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "map_decimal_value_to_character_entity", "MAP-DECIMAL-VALUE-TO-CHARACTER-ENTITY", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_string_concatenate", "UNICODE-STRING-CONCATENATE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_unicode_char_method", "CFASL-OUTPUT-OBJECT-UNICODE-CHAR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_unicode_char", "CFASL-OUTPUT-UNICODE-CHAR", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_unicode_char", "CFASL-INPUT-UNICODE-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_unicode_string_method", "CFASL-OUTPUT-OBJECT-UNICODE-STRING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_unicode_string", "CFASL-OUTPUT-UNICODE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_unicode_string", "CFASL-INPUT-UNICODE-STRING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_unicode_strings_file()
  {
    $max_unicode_value$ = SubLFiles.defconstant( "MAX-UNICODE-VALUE", $int0$1114111 );
    $dtp_unicode_char$ = SubLFiles.defconstant( "*DTP-UNICODE-CHAR*", $sym1$UNICODE_CHAR );
    $dtp_unicode_string$ = SubLFiles.defconstant( "*DTP-UNICODE-STRING*", $sym22$UNICODE_STRING );
    $default_non_ascii_placeholder_char$ = SubLFiles.deflexical( "*DEFAULT-NON-ASCII-PLACEHOLDER-CHAR*", Characters.CHAR_tilde );
    $default_unicode_to_ascii_code_map$ = SubLFiles.defparameter( "*DEFAULT-UNICODE-TO-ASCII-CODE-MAP*", $list51 );
    $html_40_character_entity_table$ = SubLFiles.deflexical( "*HTML-40-CHARACTER-ENTITY-TABLE*", $list102 );
    $cfasl_opcode_unicode_char$ = SubLFiles.defconstant( "*CFASL-OPCODE-UNICODE-CHAR*", $int103$52 );
    $cfasl_opcode_unicode_string$ = SubLFiles.defconstant( "*CFASL-OPCODE-UNICODE-STRING*", $int107$53 );
    return NIL;
  }

  public static SubLObject setup_unicode_strings_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_unicode_char$.getGlobalValue(), Symbols.symbol_function( $sym8$UNICODE_CHAR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$UNICODE_CHAR_UCHAR, $sym11$_CSETF_UNICODE_CHAR_UCHAR );
    Equality.identity( $sym1$UNICODE_CHAR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_unicode_char$.getGlobalValue(), Symbols.symbol_function( $sym18$VISIT_DEFSTRUCT_OBJECT_UNICODE_CHAR_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_unicode_string$.getGlobalValue(), Symbols.symbol_function( $sym29$UNICODE_STRING_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list30 );
    Structures.def_csetf( $sym31$UNICODE_STRING_VECT, $sym32$_CSETF_UNICODE_STRING_VECT );
    Equality.identity( $sym22$UNICODE_STRING );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_unicode_string$.getGlobalValue(), Symbols.symbol_function( $sym35$VISIT_DEFSTRUCT_OBJECT_UNICODE_STRING_METHOD ) );
    cfasl.register_cfasl_input_function( $cfasl_opcode_unicode_char$.getGlobalValue(), $sym104$CFASL_INPUT_UNICODE_CHAR );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_unicode_char$.getGlobalValue(), Symbols.symbol_function( $sym105$CFASL_OUTPUT_OBJECT_UNICODE_CHAR_METHOD ) );
    cfasl.register_cfasl_input_function( $cfasl_opcode_unicode_string$.getGlobalValue(), $sym108$CFASL_INPUT_UNICODE_STRING );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_unicode_string$.getGlobalValue(), Symbols.symbol_function( $sym109$CFASL_OUTPUT_OBJECT_UNICODE_STRING_METHOD ) );
    generic_testing.define_test_case_table_int( $sym110$HTML_ESCAPED_UTF8_STRING_TO_UTF8_STRING, ConsesLow.list( new SubLObject[] { $kw111$TEST, EQUAL, $kw112$OWNER, NIL, $kw113$CLASSES, NIL, $kw114$KB, $kw115$TINY,
      $kw116$WORKING_, T
    } ), $list117 );
    return NIL;
  }

  private static SubLObject _constant_102_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeString( "AElig" ), makeInteger( 198 ) ), ConsesLow.cons( makeString( "Aacute" ), makeInteger( 193 ) ), ConsesLow.cons( makeString( "Acirc" ), makeInteger(
        194 ) ), ConsesLow.cons( makeString( "Agrave" ), makeInteger( 192 ) ), ConsesLow.cons( makeString( "Alpha" ), makeInteger( 913 ) ), ConsesLow.cons( makeString( "Aring" ), makeInteger( 197 ) ), ConsesLow.cons(
            makeString( "Atilde" ), makeInteger( 195 ) ), ConsesLow.cons( makeString( "Auml" ), makeInteger( 196 ) ), ConsesLow.cons( makeString( "Beta" ), makeInteger( 914 ) ), ConsesLow.cons( makeString( "Ccedil" ),
                makeInteger( 199 ) ), ConsesLow.cons( makeString( "Chi" ), makeInteger( 935 ) ), ConsesLow.cons( makeString( "Dagger" ), makeInteger( 8225 ) ), ConsesLow.cons( makeString( "Delta" ), makeInteger( 916 ) ),
      ConsesLow.cons( makeString( "ETH" ), makeInteger( 208 ) ), ConsesLow.cons( makeString( "Eacute" ), makeInteger( 201 ) ), ConsesLow.cons( makeString( "Ecirc" ), makeInteger( 202 ) ), ConsesLow.cons( makeString(
          "Egrave" ), makeInteger( 200 ) ), ConsesLow.cons( makeString( "Epsilon" ), makeInteger( 917 ) ), ConsesLow.cons( makeString( "Eta" ), makeInteger( 919 ) ), ConsesLow.cons( makeString( "Euml" ), makeInteger(
              203 ) ), ConsesLow.cons( makeString( "Gamma" ), makeInteger( 915 ) ), ConsesLow.cons( makeString( "Iacute" ), makeInteger( 205 ) ), ConsesLow.cons( makeString( "Icirc" ), makeInteger( 206 ) ), ConsesLow
                  .cons( makeString( "Igrave" ), makeInteger( 204 ) ), ConsesLow.cons( makeString( "Iota" ), makeInteger( 921 ) ), ConsesLow.cons( makeString( "Iuml" ), makeInteger( 207 ) ), ConsesLow.cons( makeString(
                      "Kappa" ), makeInteger( 922 ) ), ConsesLow.cons( makeString( "Lambda" ), makeInteger( 923 ) ), ConsesLow.cons( makeString( "Mu" ), makeInteger( 924 ) ), ConsesLow.cons( makeString( "Ntilde" ),
                          makeInteger( 209 ) ), ConsesLow.cons( makeString( "Nu" ), makeInteger( 925 ) ), ConsesLow.cons( makeString( "OElig" ), makeInteger( 338 ) ), ConsesLow.cons( makeString( "Oacute" ), makeInteger(
                              211 ) ), ConsesLow.cons( makeString( "Ocirc" ), makeInteger( 212 ) ), ConsesLow.cons( makeString( "Ograve" ), makeInteger( 210 ) ), ConsesLow.cons( makeString( "Omega" ), makeInteger(
                                  937 ) ), ConsesLow.cons( makeString( "Omicron" ), makeInteger( 927 ) ), ConsesLow.cons( makeString( "Oslash" ), makeInteger( 216 ) ), ConsesLow.cons( makeString( "Otilde" ), makeInteger(
                                      213 ) ), ConsesLow.cons( makeString( "Ouml" ), makeInteger( 214 ) ), ConsesLow.cons( makeString( "Phi" ), makeInteger( 934 ) ), ConsesLow.cons( makeString( "Pi" ), makeInteger(
                                          928 ) ), ConsesLow.cons( makeString( "Prime" ), makeInteger( 8243 ) ), ConsesLow.cons( makeString( "Psi" ), makeInteger( 936 ) ), ConsesLow.cons( makeString( "Rho" ),
                                              makeInteger( 929 ) ), ConsesLow.cons( makeString( "Scaron" ), makeInteger( 352 ) ), ConsesLow.cons( makeString( "Sigma" ), makeInteger( 931 ) ), ConsesLow.cons( makeString(
                                                  "THORN" ), makeInteger( 222 ) ), ConsesLow.cons( makeString( "Tau" ), makeInteger( 932 ) ), ConsesLow.cons( makeString( "Theta" ), makeInteger( 920 ) ), ConsesLow.cons(
                                                      makeString( "Uacute" ), makeInteger( 218 ) ), ConsesLow.cons( makeString( "Ucirc" ), makeInteger( 219 ) ), ConsesLow.cons( makeString( "Ugrave" ), makeInteger(
                                                          217 ) ), ConsesLow.cons( makeString( "Upsilon" ), makeInteger( 933 ) ), ConsesLow.cons( makeString( "Uuml" ), makeInteger( 220 ) ), ConsesLow.cons( makeString(
                                                              "Xi" ), makeInteger( 926 ) ), ConsesLow.cons( makeString( "Yacute" ), makeInteger( 221 ) ), ConsesLow.cons( makeString( "Yuml" ), makeInteger( 376 ) ),
      ConsesLow.cons( makeString( "Zeta" ), makeInteger( 918 ) ), ConsesLow.cons( makeString( "aacute" ), makeInteger( 225 ) ), ConsesLow.cons( makeString( "acirc" ), makeInteger( 226 ) ), ConsesLow.cons( makeString(
          "acute" ), makeInteger( 180 ) ), ConsesLow.cons( makeString( "aelig" ), makeInteger( 230 ) ), ConsesLow.cons( makeString( "agrave" ), makeInteger( 224 ) ), ConsesLow.cons( makeString( "alefsym" ), makeInteger(
              8501 ) ), ConsesLow.cons( makeString( "alpha" ), makeInteger( 945 ) ), ConsesLow.cons( makeString( "amp" ), makeInteger( 38 ) ), ConsesLow.cons( makeString( "and" ), makeInteger( 8743 ) ), ConsesLow.cons(
                  makeString( "ang" ), makeInteger( 8736 ) ), ConsesLow.cons( makeString( "aring" ), makeInteger( 229 ) ), ConsesLow.cons( makeString( "asymp" ), makeInteger( 8776 ) ), ConsesLow.cons( makeString(
                      "atilde" ), makeInteger( 227 ) ), ConsesLow.cons( makeString( "auml" ), makeInteger( 228 ) ), ConsesLow.cons( makeString( "bdquo" ), makeInteger( 8222 ) ), ConsesLow.cons( makeString( "beta" ),
                          makeInteger( 946 ) ), ConsesLow.cons( makeString( "brvbar" ), makeInteger( 166 ) ), ConsesLow.cons( makeString( "bull" ), makeInteger( 8226 ) ), ConsesLow.cons( makeString( "cap" ), makeInteger(
                              8745 ) ), ConsesLow.cons( makeString( "ccedil" ), makeInteger( 231 ) ), ConsesLow.cons( makeString( "cedil" ), makeInteger( 184 ) ), ConsesLow.cons( makeString( "cent" ), makeInteger(
                                  162 ) ), ConsesLow.cons( makeString( "chi" ), makeInteger( 967 ) ), ConsesLow.cons( makeString( "circ" ), makeInteger( 710 ) ), ConsesLow.cons( makeString( "clubs" ), makeInteger(
                                      9827 ) ), ConsesLow.cons( makeString( "cong" ), makeInteger( 8773 ) ), ConsesLow.cons( makeString( "copy" ), makeInteger( 169 ) ), ConsesLow.cons( makeString( "crarr" ), makeInteger(
                                          8629 ) ), ConsesLow.cons( makeString( "cup" ), makeInteger( 8746 ) ), ConsesLow.cons( makeString( "curren" ), makeInteger( 164 ) ), ConsesLow.cons( makeString( "dArr" ),
                                              makeInteger( 8659 ) ), ConsesLow.cons( makeString( "dagger" ), makeInteger( 8224 ) ), ConsesLow.cons( makeString( "darr" ), makeInteger( 8595 ) ), ConsesLow.cons( makeString(
                                                  "deg" ), makeInteger( 176 ) ), ConsesLow.cons( makeString( "delta" ), makeInteger( 948 ) ), ConsesLow.cons( makeString( "diams" ), makeInteger( 9830 ) ), ConsesLow.cons(
                                                      makeString( "divide" ), makeInteger( 247 ) ), ConsesLow.cons( makeString( "eacute" ), makeInteger( 233 ) ), ConsesLow.cons( makeString( "ecirc" ), makeInteger(
                                                          234 ) ), ConsesLow.cons( makeString( "egrave" ), makeInteger( 232 ) ), ConsesLow.cons( makeString( "empty" ), makeInteger( 8709 ) ), ConsesLow.cons( makeString(
                                                              "emsp" ), makeInteger( 8195 ) ), ConsesLow.cons( makeString( "ensp" ), makeInteger( 8194 ) ), ConsesLow.cons( makeString( "epsilon" ), makeInteger( 949 ) ),
      ConsesLow.cons( makeString( "equiv" ), makeInteger( 8801 ) ), ConsesLow.cons( makeString( "eta" ), makeInteger( 951 ) ), ConsesLow.cons( makeString( "eth" ), makeInteger( 240 ) ), ConsesLow.cons( makeString(
          "euml" ), makeInteger( 235 ) ), ConsesLow.cons( makeString( "euro" ), makeInteger( 8364 ) ), ConsesLow.cons( makeString( "exist" ), makeInteger( 8707 ) ), ConsesLow.cons( makeString( "fnof" ), makeInteger(
              402 ) ), ConsesLow.cons( makeString( "forall" ), makeInteger( 8704 ) ), ConsesLow.cons( makeString( "frac12" ), makeInteger( 189 ) ), ConsesLow.cons( makeString( "frac14" ), makeInteger( 188 ) ), ConsesLow
                  .cons( makeString( "frac34" ), makeInteger( 190 ) ), ConsesLow.cons( makeString( "frasl" ), makeInteger( 8260 ) ), ConsesLow.cons( makeString( "gamma" ), makeInteger( 947 ) ), ConsesLow.cons(
                      makeString( "ge" ), makeInteger( 8805 ) ), ConsesLow.cons( makeString( "gt" ), makeInteger( 62 ) ), ConsesLow.cons( makeString( "hArr" ), makeInteger( 8660 ) ), ConsesLow.cons( makeString( "harr" ),
                          makeInteger( 8596 ) ), ConsesLow.cons( makeString( "hearts" ), makeInteger( 9829 ) ), ConsesLow.cons( makeString( "hellip" ), makeInteger( 8230 ) ), ConsesLow.cons( makeString( "iacute" ),
                              makeInteger( 237 ) ), ConsesLow.cons( makeString( "icirc" ), makeInteger( 238 ) ), ConsesLow.cons( makeString( "iexcl" ), makeInteger( 161 ) ), ConsesLow.cons( makeString( "igrave" ),
                                  makeInteger( 236 ) ), ConsesLow.cons( makeString( "image" ), makeInteger( 8465 ) ), ConsesLow.cons( makeString( "infin" ), makeInteger( 8734 ) ), ConsesLow.cons( makeString( "int" ),
                                      makeInteger( 8747 ) ), ConsesLow.cons( makeString( "iota" ), makeInteger( 953 ) ), ConsesLow.cons( makeString( "iquest" ), makeInteger( 191 ) ), ConsesLow.cons( makeString( "isin" ),
                                          makeInteger( 8712 ) ), ConsesLow.cons( makeString( "iuml" ), makeInteger( 239 ) ), ConsesLow.cons( makeString( "kappa" ), makeInteger( 954 ) ), ConsesLow.cons( makeString(
                                              "lArr" ), makeInteger( 8656 ) ), ConsesLow.cons( makeString( "lambda" ), makeInteger( 955 ) ), ConsesLow.cons( makeString( "lang" ), makeInteger( 9001 ) ), ConsesLow.cons(
                                                  makeString( "laquo" ), makeInteger( 171 ) ), ConsesLow.cons( makeString( "larr" ), makeInteger( 8592 ) ), ConsesLow.cons( makeString( "lceil" ), makeInteger( 8968 ) ),
      ConsesLow.cons( makeString( "ldquo" ), makeInteger( 8220 ) ), ConsesLow.cons( makeString( "le" ), makeInteger( 8804 ) ), ConsesLow.cons( makeString( "lfloor" ), makeInteger( 8970 ) ), ConsesLow.cons( makeString(
          "lowast" ), makeInteger( 8727 ) ), ConsesLow.cons( makeString( "loz" ), makeInteger( 9674 ) ), ConsesLow.cons( makeString( "lrm" ), makeInteger( 8206 ) ), ConsesLow.cons( makeString( "lsaquo" ), makeInteger(
              8249 ) ), ConsesLow.cons( makeString( "lsquo" ), makeInteger( 8216 ) ), ConsesLow.cons( makeString( "lt" ), makeInteger( 60 ) ), ConsesLow.cons( makeString( "macr" ), makeInteger( 175 ) ), ConsesLow.cons(
                  makeString( "mdash" ), makeInteger( 8212 ) ), ConsesLow.cons( makeString( "micro" ), makeInteger( 181 ) ), ConsesLow.cons( makeString( "middot" ), makeInteger( 183 ) ), ConsesLow.cons( makeString(
                      "minus" ), makeInteger( 8722 ) ), ConsesLow.cons( makeString( "mu" ), makeInteger( 956 ) ), ConsesLow.cons( makeString( "nabla" ), makeInteger( 8711 ) ), ConsesLow.cons( makeString( "nbsp" ),
                          makeInteger( 160 ) ), ConsesLow.cons( makeString( "ndash" ), makeInteger( 8211 ) ), ConsesLow.cons( makeString( "ne" ), makeInteger( 8800 ) ), ConsesLow.cons( makeString( "ni" ), makeInteger(
                              8715 ) ), ConsesLow.cons( makeString( "not" ), makeInteger( 172 ) ), ConsesLow.cons( makeString( "notin" ), makeInteger( 8713 ) ), ConsesLow.cons( makeString( "nsub" ), makeInteger(
                                  8836 ) ), ConsesLow.cons( makeString( "ntilde" ), makeInteger( 241 ) ), ConsesLow.cons( makeString( "nu" ), makeInteger( 957 ) ), ConsesLow.cons( makeString( "oacute" ), makeInteger(
                                      243 ) ), ConsesLow.cons( makeString( "ocirc" ), makeInteger( 244 ) ), ConsesLow.cons( makeString( "oelig" ), makeInteger( 339 ) ), ConsesLow.cons( makeString( "ograve" ),
                                          makeInteger( 242 ) ), ConsesLow.cons( makeString( "oline" ), makeInteger( 8254 ) ), ConsesLow.cons( makeString( "omega" ), makeInteger( 969 ) ), ConsesLow.cons( makeString(
                                              "omicron" ), makeInteger( 959 ) ), ConsesLow.cons( makeString( "oplus" ), makeInteger( 8853 ) ), ConsesLow.cons( makeString( "or" ), makeInteger( 8744 ) ), ConsesLow.cons(
                                                  makeString( "ordf" ), makeInteger( 170 ) ), ConsesLow.cons( makeString( "ordm" ), makeInteger( 186 ) ), ConsesLow.cons( makeString( "oslash" ), makeInteger( 248 ) ),
      ConsesLow.cons( makeString( "otilde" ), makeInteger( 245 ) ), ConsesLow.cons( makeString( "otimes" ), makeInteger( 8855 ) ), ConsesLow.cons( makeString( "ouml" ), makeInteger( 246 ) ), ConsesLow.cons( makeString(
          "para" ), makeInteger( 182 ) ), ConsesLow.cons( makeString( "part" ), makeInteger( 8706 ) ), ConsesLow.cons( makeString( "permil" ), makeInteger( 8240 ) ), ConsesLow.cons( makeString( "perp" ), makeInteger(
              8869 ) ), ConsesLow.cons( makeString( "phi" ), makeInteger( 966 ) ), ConsesLow.cons( makeString( "pi" ), makeInteger( 960 ) ), ConsesLow.cons( makeString( "piv" ), makeInteger( 982 ) ), ConsesLow.cons(
                  makeString( "plusmn" ), makeInteger( 177 ) ), ConsesLow.cons( makeString( "pound" ), makeInteger( 163 ) ), ConsesLow.cons( makeString( "prime" ), makeInteger( 8242 ) ), ConsesLow.cons( makeString(
                      "prod" ), makeInteger( 8719 ) ), ConsesLow.cons( makeString( "prop" ), makeInteger( 8733 ) ), ConsesLow.cons( makeString( "psi" ), makeInteger( 968 ) ), ConsesLow.cons( makeString( "quot" ),
                          makeInteger( 34 ) ), ConsesLow.cons( makeString( "rArr" ), makeInteger( 8658 ) ), ConsesLow.cons( makeString( "radic" ), makeInteger( 8730 ) ), ConsesLow.cons( makeString( "rang" ), makeInteger(
                              9002 ) ), ConsesLow.cons( makeString( "raquo" ), makeInteger( 187 ) ), ConsesLow.cons( makeString( "rarr" ), makeInteger( 8594 ) ), ConsesLow.cons( makeString( "rceil" ), makeInteger(
                                  8969 ) ), ConsesLow.cons( makeString( "rdquo" ), makeInteger( 8221 ) ), ConsesLow.cons( makeString( "real" ), makeInteger( 8476 ) ), ConsesLow.cons( makeString( "reg" ), makeInteger(
                                      174 ) ), ConsesLow.cons( makeString( "rfloor" ), makeInteger( 8971 ) ), ConsesLow.cons( makeString( "rho" ), makeInteger( 961 ) ), ConsesLow.cons( makeString( "rlm" ), makeInteger(
                                          8207 ) ), ConsesLow.cons( makeString( "rsaquo" ), makeInteger( 8250 ) ), ConsesLow.cons( makeString( "rsquo" ), makeInteger( 8217 ) ), ConsesLow.cons( makeString( "sbquo" ),
                                              makeInteger( 8218 ) ), ConsesLow.cons( makeString( "scaron" ), makeInteger( 353 ) ), ConsesLow.cons( makeString( "sdot" ), makeInteger( 8901 ) ), ConsesLow.cons( makeString(
                                                  "sect" ), makeInteger( 167 ) ), ConsesLow.cons( makeString( "shy" ), makeInteger( 173 ) ), ConsesLow.cons( makeString( "sigma" ), makeInteger( 963 ) ), ConsesLow.cons(
                                                      makeString( "sigmaf" ), makeInteger( 962 ) ), ConsesLow.cons( makeString( "sim" ), makeInteger( 8764 ) ), ConsesLow.cons( makeString( "spades" ), makeInteger(
                                                          9824 ) ), ConsesLow.cons( makeString( "sub" ), makeInteger( 8834 ) ), ConsesLow.cons( makeString( "sube" ), makeInteger( 8838 ) ), ConsesLow.cons( makeString(
                                                              "sum" ), makeInteger( 8721 ) ), ConsesLow.cons( makeString( "sup" ), makeInteger( 8835 ) ), ConsesLow.cons( makeString( "sup1" ), makeInteger( 185 ) ),
      ConsesLow.cons( makeString( "sup2" ), makeInteger( 178 ) ), ConsesLow.cons( makeString( "sup3" ), makeInteger( 179 ) ), ConsesLow.cons( makeString( "supe" ), makeInteger( 8839 ) ), ConsesLow.cons( makeString(
          "szlig" ), makeInteger( 223 ) ), ConsesLow.cons( makeString( "tau" ), makeInteger( 964 ) ), ConsesLow.cons( makeString( "there4" ), makeInteger( 8756 ) ), ConsesLow.cons( makeString( "theta" ), makeInteger(
              952 ) ), ConsesLow.cons( makeString( "thetasym" ), makeInteger( 977 ) ), ConsesLow.cons( makeString( "thinsp" ), makeInteger( 8201 ) ), ConsesLow.cons( makeString( "thorn" ), makeInteger( 254 ) ), ConsesLow
                  .cons( makeString( "tilde" ), makeInteger( 732 ) ), ConsesLow.cons( makeString( "times" ), makeInteger( 215 ) ), ConsesLow.cons( makeString( "trade" ), makeInteger( 8482 ) ), ConsesLow.cons( makeString(
                      "uArr" ), makeInteger( 8657 ) ), ConsesLow.cons( makeString( "uacute" ), makeInteger( 250 ) ), ConsesLow.cons( makeString( "uarr" ), makeInteger( 8593 ) ), ConsesLow.cons( makeString( "ucirc" ),
                          makeInteger( 251 ) ), ConsesLow.cons( makeString( "ugrave" ), makeInteger( 249 ) ), ConsesLow.cons( makeString( "uml" ), makeInteger( 168 ) ), ConsesLow.cons( makeString( "upsih" ), makeInteger(
                              978 ) ), ConsesLow.cons( makeString( "upsilon" ), makeInteger( 965 ) ), ConsesLow.cons( makeString( "uuml" ), makeInteger( 252 ) ), ConsesLow.cons( makeString( "weierp" ), makeInteger(
                                  8472 ) ), ConsesLow.cons( makeString( "xi" ), makeInteger( 958 ) ), ConsesLow.cons( makeString( "yacute" ), makeInteger( 253 ) ), ConsesLow.cons( makeString( "yen" ), makeInteger(
                                      165 ) ), ConsesLow.cons( makeString( "yuml" ), makeInteger( 255 ) ), ConsesLow.cons( makeString( "zeta" ), makeInteger( 950 ) ), ConsesLow.cons( makeString( "zwj" ), makeInteger(
                                          8205 ) ), ConsesLow.cons( makeString( "zwnj" ), makeInteger( 8204 ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_unicode_strings_file();
  }

  @Override
  public void initializeVariables()
  {
    init_unicode_strings_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_unicode_strings_file();
  }
  static
  {
    me = new unicode_strings();
    $max_unicode_value$ = null;
    $dtp_unicode_char$ = null;
    $dtp_unicode_string$ = null;
    $default_non_ascii_placeholder_char$ = null;
    $default_unicode_to_ascii_code_map$ = null;
    $html_40_character_entity_table$ = null;
    $cfasl_opcode_unicode_char$ = null;
    $cfasl_opcode_unicode_string$ = null;
    $int0$1114111 = makeInteger( 1114111 );
    $sym1$UNICODE_CHAR = makeSymbol( "UNICODE-CHAR" );
    $sym2$UNICODE_CHAR_P = makeSymbol( "UNICODE-CHAR-P" );
    $list3 = ConsesLow.list( makeSymbol( "UCHAR" ) );
    $list4 = ConsesLow.list( makeKeyword( "UCHAR" ) );
    $list5 = ConsesLow.list( makeSymbol( "UNICODE-CHAR-UCHAR" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-UNICODE-CHAR-UCHAR" ) );
    $sym7$PRINT_UNICODE_CHAR = makeSymbol( "PRINT-UNICODE-CHAR" );
    $sym8$UNICODE_CHAR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "UNICODE-CHAR-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "UNICODE-CHAR-P" ) );
    $sym10$UNICODE_CHAR_UCHAR = makeSymbol( "UNICODE-CHAR-UCHAR" );
    $sym11$_CSETF_UNICODE_CHAR_UCHAR = makeSymbol( "_CSETF-UNICODE-CHAR-UCHAR" );
    $kw12$UCHAR = makeKeyword( "UCHAR" );
    $str13$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw14$BEGIN = makeKeyword( "BEGIN" );
    $sym15$MAKE_UNICODE_CHAR = makeSymbol( "MAKE-UNICODE-CHAR" );
    $kw16$SLOT = makeKeyword( "SLOT" );
    $kw17$END = makeKeyword( "END" );
    $sym18$VISIT_DEFSTRUCT_OBJECT_UNICODE_CHAR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-UNICODE-CHAR-METHOD" );
    $str19$_u_x = makeString( "#u~x" );
    $str20$_u0_x = makeString( "#u0~x" );
    $sym21$UNICODE_CHARACTER_P = makeSymbol( "UNICODE-CHARACTER-P" );
    $sym22$UNICODE_STRING = makeSymbol( "UNICODE-STRING" );
    $sym23$UNICODE_STRING_P = makeSymbol( "UNICODE-STRING-P" );
    $list24 = ConsesLow.list( makeSymbol( "VECT" ) );
    $list25 = ConsesLow.list( makeKeyword( "VECT" ) );
    $list26 = ConsesLow.list( makeSymbol( "UNICODE-STRING-VECT" ) );
    $list27 = ConsesLow.list( makeSymbol( "_CSETF-UNICODE-STRING-VECT" ) );
    $sym28$PRINT_UNICODE_STRING = makeSymbol( "PRINT-UNICODE-STRING" );
    $sym29$UNICODE_STRING_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "UNICODE-STRING-PRINT-FUNCTION-TRAMPOLINE" );
    $list30 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "UNICODE-STRING-P" ) );
    $sym31$UNICODE_STRING_VECT = makeSymbol( "UNICODE-STRING-VECT" );
    $sym32$_CSETF_UNICODE_STRING_VECT = makeSymbol( "_CSETF-UNICODE-STRING-VECT" );
    $kw33$VECT = makeKeyword( "VECT" );
    $sym34$MAKE_UNICODE_STRING = makeSymbol( "MAKE-UNICODE-STRING" );
    $sym35$VISIT_DEFSTRUCT_OBJECT_UNICODE_STRING_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-UNICODE-STRING-METHOD" );
    $str36$_u__a_ = makeString( "#u\"~a\"" );
    $sym37$UNICODE_VECTOR_STRING_P = makeSymbol( "UNICODE-VECTOR-STRING-P" );
    $int38$127 = makeInteger( 127 );
    $kw39$HTML_ESCAPED_ASCII = makeKeyword( "HTML-ESCAPED-ASCII" );
    $kw40$ESCAPED_PROBABLY_UTF8 = makeKeyword( "ESCAPED-PROBABLY-UTF8" );
    $kw41$SUBL_STRING = makeKeyword( "SUBL-STRING" );
    $kw42$PROBABLY_UTF8 = makeKeyword( "PROBABLY-UTF8" );
    $kw43$UNK = makeKeyword( "UNK" );
    $int44$128 = makeInteger( 128 );
    $kw45$OPEN = makeKeyword( "OPEN" );
    $kw46$START_UNICODE = makeKeyword( "START-UNICODE" );
    $kw47$UNICODE_CHAR = makeKeyword( "UNICODE-CHAR" );
    $kw48$UNICDE_CHAR = makeKeyword( "UNICDE-CHAR" );
    $sym49$DISPLAY_VECTOR_STRING_P = makeSymbol( "DISPLAY-VECTOR-STRING-P" );
    $sym50$ASCII_CHAR_P = makeSymbol( "ASCII-CHAR-P" );
    $list51 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeInteger( 183 ), makeInteger( 42 ) ), ConsesLow.cons( makeInteger( 192 ), makeInteger( 65 ) ), ConsesLow.cons( makeInteger( 193 ), makeInteger( 65 ) ),
      ConsesLow.cons( makeInteger( 194 ), makeInteger( 65 ) ), ConsesLow.cons( makeInteger( 195 ), makeInteger( 65 ) ), ConsesLow.cons( makeInteger( 196 ), makeInteger( 65 ) ), ConsesLow.cons( makeInteger( 197 ),
          makeInteger( 65 ) ), ConsesLow.cons( makeInteger( 200 ), makeInteger( 69 ) ), ConsesLow.cons( makeInteger( 201 ), makeInteger( 69 ) ), ConsesLow.cons( makeInteger( 202 ), makeInteger( 69 ) ), ConsesLow.cons(
              makeInteger( 203 ), makeInteger( 69 ) ), ConsesLow.cons( makeInteger( 204 ), makeInteger( 73 ) ), ConsesLow.cons( makeInteger( 205 ), makeInteger( 73 ) ), ConsesLow.cons( makeInteger( 206 ), makeInteger(
                  73 ) ), ConsesLow.cons( makeInteger( 207 ), makeInteger( 73 ) ), ConsesLow.cons( makeInteger( 209 ), makeInteger( 78 ) ), ConsesLow.cons( makeInteger( 210 ), makeInteger( 79 ) ), ConsesLow.cons(
                      makeInteger( 211 ), makeInteger( 79 ) ), ConsesLow.cons( makeInteger( 212 ), makeInteger( 79 ) ), ConsesLow.cons( makeInteger( 213 ), makeInteger( 79 ) ), ConsesLow.cons( makeInteger( 214 ),
                          makeInteger( 79 ) ), ConsesLow.cons( makeInteger( 216 ), makeInteger( 79 ) ), ConsesLow.cons( makeInteger( 217 ), makeInteger( 85 ) ), ConsesLow.cons( makeInteger( 218 ), makeInteger( 85 ) ),
      ConsesLow.cons( makeInteger( 219 ), makeInteger( 85 ) ), ConsesLow.cons( makeInteger( 220 ), makeInteger( 85 ) ), ConsesLow.cons( makeInteger( 221 ), makeInteger( 89 ) ), ConsesLow.cons( makeInteger( 224 ),
          makeInteger( 97 ) ), ConsesLow.cons( makeInteger( 225 ), makeInteger( 97 ) ), ConsesLow.cons( makeInteger( 226 ), makeInteger( 97 ) ), ConsesLow.cons( makeInteger( 227 ), makeInteger( 97 ) ), ConsesLow.cons(
              makeInteger( 228 ), makeInteger( 97 ) ), ConsesLow.cons( makeInteger( 229 ), makeInteger( 97 ) ), ConsesLow.cons( makeInteger( 231 ), makeInteger( 99 ) ), ConsesLow.cons( makeInteger( 232 ), makeInteger(
                  101 ) ), ConsesLow.cons( makeInteger( 233 ), makeInteger( 101 ) ), ConsesLow.cons( makeInteger( 234 ), makeInteger( 101 ) ), ConsesLow.cons( makeInteger( 235 ), makeInteger( 101 ) ), ConsesLow.cons(
                      makeInteger( 236 ), makeInteger( 105 ) ), ConsesLow.cons( makeInteger( 237 ), makeInteger( 105 ) ), ConsesLow.cons( makeInteger( 238 ), makeInteger( 105 ) ), ConsesLow.cons( makeInteger( 239 ),
                          makeInteger( 105 ) ), ConsesLow.cons( makeInteger( 240 ), makeInteger( 100 ) ), ConsesLow.cons( makeInteger( 241 ), makeInteger( 110 ) ), ConsesLow.cons( makeInteger( 242 ), makeInteger(
                              111 ) ), ConsesLow.cons( makeInteger( 243 ), makeInteger( 111 ) ), ConsesLow.cons( makeInteger( 244 ), makeInteger( 111 ) ), ConsesLow.cons( makeInteger( 245 ), makeInteger( 111 ) ),
      ConsesLow.cons( makeInteger( 246 ), makeInteger( 111 ) ), ConsesLow.cons( makeInteger( 248 ), makeInteger( 111 ) ), ConsesLow.cons( makeInteger( 249 ), makeInteger( 117 ) ), ConsesLow.cons( makeInteger( 250 ),
          makeInteger( 117 ) ), ConsesLow.cons( makeInteger( 251 ), makeInteger( 117 ) ), ConsesLow.cons( makeInteger( 252 ), makeInteger( 117 ) ), ConsesLow.cons( makeInteger( 253 ), makeInteger( 121 ) ), ConsesLow
              .cons( makeInteger( 255 ), makeInteger( 121 ) ), ConsesLow.cons( makeInteger( 323 ), makeInteger( 110 ) ), ConsesLow.cons( makeInteger( 324 ), makeInteger( 110 ) ), ConsesLow.cons( makeInteger( 8217 ),
                  makeInteger( 39 ) )
    } );
    $str52$__ = makeString( "\\\"" );
    $str53$__ = makeString( "\\\\" );
    $str54$_u26_ = makeString( "&u26;" );
    $int55$32 = makeInteger( 32 );
    $str56$0 = makeString( "0" );
    $str57$_u_A_ = makeString( "&u~A;" );
    $sym58$UTF8_VECTOR_STRING_P = makeSymbol( "UTF8-VECTOR-STRING-P" );
    $str59$Invalid_UTF_8_encoding_at__S_in__ = makeString( "Invalid UTF-8 encoding at ~S in ~S" );
    $int60$2047 = makeInteger( 2047 );
    $int61$65535 = makeInteger( 65535 );
    $int62$2097151 = makeInteger( 2097151 );
    $int63$67108863 = makeInteger( 67108863 );
    $str64$__ = makeString( "#(" );
    $str65$_x_x_ = makeString( "#x~x " );
    $str66$___ = makeString( ")~%" );
    $int67$192 = makeInteger( 192 );
    $int68$_6 = makeInteger( -6 );
    $int69$63 = makeInteger( 63 );
    $int70$224 = makeInteger( 224 );
    $int71$_12 = makeInteger( -12 );
    $int72$240 = makeInteger( 240 );
    $int73$_18 = makeInteger( -18 );
    $int74$248 = makeInteger( 248 );
    $int75$_24 = makeInteger( -24 );
    $int76$193 = makeInteger( 193 );
    $int77$245 = makeInteger( 245 );
    $sym78$VECTORP = makeSymbol( "VECTORP" );
    $int79$31 = makeInteger( 31 );
    $int80$24 = makeInteger( 24 );
    $str81$__x = makeString( "&#x" );
    $int82$38 = makeInteger( 38 );
    $kw83$START_HTML_ESCAPE = makeKeyword( "START-HTML-ESCAPE" );
    $int84$60 = makeInteger( 60 );
    $kw85$INSIDE_TAG = makeKeyword( "INSIDE-TAG" );
    $int86$62 = makeInteger( 62 );
    $int87$35 = makeInteger( 35 );
    $kw88$HTML_NUMERIC_ESCAPE_START = makeKeyword( "HTML-NUMERIC-ESCAPE-START" );
    $kw89$ENTITY_ESCAPE = makeKeyword( "ENTITY-ESCAPE" );
    $int90$120 = makeInteger( 120 );
    $kw91$HTML_HEXADECIMAL_ESCAPE = makeKeyword( "HTML-HEXADECIMAL-ESCAPE" );
    $int92$48 = makeInteger( 48 );
    $int93$57 = makeInteger( 57 );
    $kw94$HTML_DECIMAL_ESCAPE = makeKeyword( "HTML-DECIMAL-ESCAPE" );
    $int95$59 = makeInteger( 59 );
    $sym96$CODE_CHAR = makeSymbol( "CODE-CHAR" );
    $int97$256 = makeInteger( 256 );
    $sym98$__ = makeSymbol( "<=" );
    $sym99$CHAR_CODE = makeSymbol( "CHAR-CODE" );
    $str100$_S__code___S__is_not_a_valid_utf8 = makeString( "~S (code: ~S) is not a valid utf8 character" );
    $sym101$STRINGP = makeSymbol( "STRINGP" );
    $list102 = _constant_102_initializer();
    $int103$52 = makeInteger( 52 );
    $sym104$CFASL_INPUT_UNICODE_CHAR = makeSymbol( "CFASL-INPUT-UNICODE-CHAR" );
    $sym105$CFASL_OUTPUT_OBJECT_UNICODE_CHAR_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-UNICODE-CHAR-METHOD" );
    $str106$Invalid_unicode_character__expect = makeString( "Invalid unicode character, expected ~A bytes, got ~A only." );
    $int107$53 = makeInteger( 53 );
    $sym108$CFASL_INPUT_UNICODE_STRING = makeSymbol( "CFASL-INPUT-UNICODE-STRING" );
    $sym109$CFASL_OUTPUT_OBJECT_UNICODE_STRING_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-UNICODE-STRING-METHOD" );
    $sym110$HTML_ESCAPED_UTF8_STRING_TO_UTF8_STRING = makeSymbol( "HTML-ESCAPED-UTF8-STRING-TO-UTF8-STRING" );
    $kw111$TEST = makeKeyword( "TEST" );
    $kw112$OWNER = makeKeyword( "OWNER" );
    $kw113$CLASSES = makeKeyword( "CLASSES" );
    $kw114$KB = makeKeyword( "KB" );
    $kw115$TINY = makeKeyword( "TINY" );
    $kw116$WORKING_ = makeKeyword( "WORKING?" );
    $list117 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "Japan&#39;s" ) ), makeString( "Japan's" ) ) );
  }

  public static final class $unicode_char_native
      extends
        SubLStructNative
  {
    public SubLObject $uchar;
    private static final SubLStructDeclNative structDecl;

    public $unicode_char_native()
    {
      this.$uchar = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $unicode_char_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$uchar;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$uchar = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $unicode_char_native.class, $sym1$UNICODE_CHAR, $sym2$UNICODE_CHAR_P, $list3, $list4, new String[] { "$uchar"
      }, $list5, $list6, $sym7$PRINT_UNICODE_CHAR );
    }
  }

  public static final class $unicode_char_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $unicode_char_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "UNICODE-CHAR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return unicode_char_p( arg1 );
    }
  }

  public static final class $unicode_string_native
      extends
        SubLStructNative
  {
    public SubLObject $vect;
    private static final SubLStructDeclNative structDecl;

    public $unicode_string_native()
    {
      this.$vect = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $unicode_string_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$vect;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$vect = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $unicode_string_native.class, $sym22$UNICODE_STRING, $sym23$UNICODE_STRING_P, $list24, $list25, new String[] { "$vect"
      }, $list26, $list27, $sym28$PRINT_UNICODE_STRING );
    }
  }

  public static final class $unicode_string_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $unicode_string_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "UNICODE-STRING-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return unicode_string_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 410 ms
 * 
 */