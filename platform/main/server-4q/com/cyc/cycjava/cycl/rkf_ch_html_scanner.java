package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_ch_html_scanner
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_ch_html_scanner";
  public static final String myFingerPrint = "df6e8cdcf6cfa03c42c7ee070e2de6a9481f5029d1ac71636cec1559f220d7bc";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
  public static SubLSymbol $dtp_file_content$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLSymbol $dtp_file_paragraph$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLSymbol $dtp_file_sentence$;
  private static final SubLSymbol $sym0$FILE_CONTENT;
  private static final SubLSymbol $sym1$FILE_CONTENT_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$FILE_CONTENT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$FILE_CONTENT_NAME;
  private static final SubLSymbol $sym10$_CSETF_FILE_CONTENT_NAME;
  private static final SubLSymbol $sym11$FILE_CONTENT_TEXT;
  private static final SubLSymbol $sym12$_CSETF_FILE_CONTENT_TEXT;
  private static final SubLSymbol $kw13$NAME;
  private static final SubLSymbol $kw14$TEXT;
  private static final SubLString $str15$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw16$BEGIN;
  private static final SubLSymbol $sym17$MAKE_FILE_CONTENT;
  private static final SubLSymbol $kw18$SLOT;
  private static final SubLSymbol $kw19$END;
  private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_FILE_CONTENT_METHOD;
  private static final SubLSymbol $sym21$FILE_PARAGRAPH;
  private static final SubLSymbol $sym22$FILE_PARAGRAPH_P;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$PRINT_FILE_PARAGRAPH;
  private static final SubLSymbol $sym28$FILE_PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$FILE_PARAGRAPH_FILE_CONTEXT;
  private static final SubLSymbol $sym31$_CSETF_FILE_PARAGRAPH_FILE_CONTEXT;
  private static final SubLSymbol $sym32$FILE_PARAGRAPH_NUMBER;
  private static final SubLSymbol $sym33$_CSETF_FILE_PARAGRAPH_NUMBER;
  private static final SubLSymbol $sym34$FILE_PARAGRAPH_CLASS;
  private static final SubLSymbol $sym35$_CSETF_FILE_PARAGRAPH_CLASS;
  private static final SubLSymbol $sym36$FILE_PARAGRAPH_SENTENCES;
  private static final SubLSymbol $sym37$_CSETF_FILE_PARAGRAPH_SENTENCES;
  private static final SubLSymbol $kw38$FILE_CONTEXT;
  private static final SubLSymbol $kw39$NUMBER;
  private static final SubLSymbol $kw40$CLASS;
  private static final SubLSymbol $kw41$SENTENCES;
  private static final SubLSymbol $sym42$MAKE_FILE_PARAGRAPH;
  private static final SubLSymbol $sym43$VISIT_DEFSTRUCT_OBJECT_FILE_PARAGRAPH_METHOD;
  private static final SubLString $str44$__FileP__D_class__S__;
  private static final SubLString $str45$_;
  private static final SubLString $str46$___FileP_;
  private static final SubLSymbol $sym47$FILE_SENTENCE;
  private static final SubLSymbol $sym48$FILE_SENTENCE_P;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$PRINT_FILE_SENTENCE;
  private static final SubLSymbol $sym54$FILE_SENTENCE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$FILE_SENTENCE_PARAGRAPH;
  private static final SubLSymbol $sym57$_CSETF_FILE_SENTENCE_PARAGRAPH;
  private static final SubLSymbol $sym58$FILE_SENTENCE_NUMBER;
  private static final SubLSymbol $sym59$_CSETF_FILE_SENTENCE_NUMBER;
  private static final SubLSymbol $sym60$FILE_SENTENCE_TEXT;
  private static final SubLSymbol $sym61$_CSETF_FILE_SENTENCE_TEXT;
  private static final SubLSymbol $kw62$PARAGRAPH;
  private static final SubLSymbol $sym63$MAKE_FILE_SENTENCE;
  private static final SubLSymbol $sym64$VISIT_DEFSTRUCT_OBJECT_FILE_SENTENCE_METHOD;
  private static final SubLString $str65$__Sent__D;
  private static final SubLString $str66$of_P_D;
  private static final SubLString $str67$___S__;
  private static final SubLSymbol $kw68$INPUT;
  private static final SubLString $str69$Unable_to_open__S;
  private static final SubLString $str70$anonymous;
  private static final SubLSymbol $sym71$IS_RETURN_CHAR_;
  private static final SubLSymbol $sym72$CCONCATENATE;
  private static final SubLSymbol $kw73$IN_SENTENCE;
  private static final SubLSymbol $kw74$POTENTIAL_END;
  private static final SubLString $str75$_;
  private static final SubLString $str76$_;
  private static final SubLList $list77;
  private static final SubLList $list78;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
  public static SubLObject file_content_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
  public static SubLObject file_content_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $file_content_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
  public static SubLObject file_content_name(final SubLObject v_object)
  {
    assert NIL != file_content_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
  public static SubLObject file_content_text(final SubLObject v_object)
  {
    assert NIL != file_content_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
  public static SubLObject _csetf_file_content_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_content_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
  public static SubLObject _csetf_file_content_text(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_content_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
  public static SubLObject make_file_content(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $file_content_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$NAME ) )
      {
        _csetf_file_content_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$TEXT ) )
      {
        _csetf_file_content_text( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
  public static SubLObject visit_defstruct_file_content(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym17$MAKE_FILE_CONTENT, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$NAME, file_content_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$TEXT, file_content_text( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym17$MAKE_FILE_CONTENT, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
  public static SubLObject visit_defstruct_object_file_content_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_file_content( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject file_paragraph_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_file_paragraph( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject file_paragraph_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $file_paragraph_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject file_paragraph_file_context(final SubLObject v_object)
  {
    assert NIL != file_paragraph_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject file_paragraph_number(final SubLObject v_object)
  {
    assert NIL != file_paragraph_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject file_paragraph_class(final SubLObject v_object)
  {
    assert NIL != file_paragraph_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject file_paragraph_sentences(final SubLObject v_object)
  {
    assert NIL != file_paragraph_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject _csetf_file_paragraph_file_context(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_paragraph_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject _csetf_file_paragraph_number(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_paragraph_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject _csetf_file_paragraph_class(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_paragraph_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject _csetf_file_paragraph_sentences(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_paragraph_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject make_file_paragraph(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $file_paragraph_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw38$FILE_CONTEXT ) )
      {
        _csetf_file_paragraph_file_context( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$NUMBER ) )
      {
        _csetf_file_paragraph_number( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$CLASS ) )
      {
        _csetf_file_paragraph_class( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$SENTENCES ) )
      {
        _csetf_file_paragraph_sentences( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject visit_defstruct_file_paragraph(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym42$MAKE_FILE_PARAGRAPH, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw38$FILE_CONTEXT, file_paragraph_file_context( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw39$NUMBER, file_paragraph_number( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw40$CLASS, file_paragraph_class( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw41$SENTENCES, file_paragraph_sentences( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym42$MAKE_FILE_PARAGRAPH, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
  public static SubLObject visit_defstruct_object_file_paragraph_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_file_paragraph( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1464L)
  public static SubLObject new_file_paragraph(final SubLObject file, final SubLObject number, SubLObject sentences, SubLObject v_class)
  {
    if( sentences == UNPROVIDED )
    {
      sentences = NIL;
    }
    if( v_class == UNPROVIDED )
    {
      v_class = html_macros.$html_paragraph_head$.getGlobalValue();
    }
    final SubLObject paragraph = make_file_paragraph( UNPROVIDED );
    _csetf_file_paragraph_file_context( paragraph, file );
    _csetf_file_paragraph_number( paragraph, number );
    _csetf_file_paragraph_class( paragraph, v_class );
    _csetf_file_paragraph_sentences( paragraph, sentences );
    return paragraph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1954L)
  public static SubLObject print_file_paragraph(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str44$__FileP__D_class__S__, file_paragraph_number( v_object ), file_paragraph_class( v_object ) );
    SubLObject cdolist_list_var = file_paragraph_sentences( v_object );
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      print_high.princ( $str45$_, stream );
      print_high.princ( item, stream );
      streams_high.terpri( stream );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    PrintLow.format( stream, $str46$___FileP_ );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject file_sentence_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_file_sentence( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject file_sentence_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $file_sentence_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject file_sentence_paragraph(final SubLObject v_object)
  {
    assert NIL != file_sentence_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject file_sentence_number(final SubLObject v_object)
  {
    assert NIL != file_sentence_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject file_sentence_text(final SubLObject v_object)
  {
    assert NIL != file_sentence_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject _csetf_file_sentence_paragraph(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_sentence_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject _csetf_file_sentence_number(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_sentence_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject _csetf_file_sentence_text(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != file_sentence_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject make_file_sentence(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $file_sentence_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw62$PARAGRAPH ) )
      {
        _csetf_file_sentence_paragraph( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$NUMBER ) )
      {
        _csetf_file_sentence_number( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$TEXT ) )
      {
        _csetf_file_sentence_text( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject visit_defstruct_file_sentence(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym63$MAKE_FILE_SENTENCE, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw62$PARAGRAPH, file_sentence_paragraph( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw39$NUMBER, file_sentence_number( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$TEXT, file_sentence_text( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym63$MAKE_FILE_SENTENCE, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
  public static SubLObject visit_defstruct_object_file_sentence_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_file_sentence( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2506L)
  public static SubLObject new_file_sentence(final SubLObject paragraph, final SubLObject number, SubLObject text)
  {
    if( text == UNPROVIDED )
    {
      text = NIL;
    }
    final SubLObject sentence = make_file_sentence( UNPROVIDED );
    _csetf_file_sentence_paragraph( sentence, paragraph );
    _csetf_file_sentence_number( sentence, number );
    _csetf_file_sentence_text( sentence, text );
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2797L)
  public static SubLObject print_file_sentence(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str65$__Sent__D, file_sentence_number( v_object ) );
    final SubLObject paragraph = file_sentence_paragraph( v_object );
    if( NIL != file_paragraph_p( paragraph ) )
    {
      PrintLow.format( stream, $str66$of_P_D, file_paragraph_number( paragraph ) );
    }
    PrintLow.format( stream, $str67$___S__, file_sentence_text( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 3167L)
  public static SubLObject rkfutil_process_html_file(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject content = NIL;
    SubLObject paragraphs = NIL;
    SubLObject all_sentences = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw68$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str69$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      content = rkfutil_fetch_html_file( s, filename );
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
    SubLObject cdolist_list_var;
    paragraphs = ( cdolist_list_var = rkfutil_fetch_html_paragraphs( content ) );
    SubLObject paragraph = NIL;
    paragraph = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sentences = rkfutil_fetch_html_sentences( paragraph );
      if( NIL != sentences )
      {
        all_sentences = ConsesLow.cons( sentences, all_sentences );
      }
      cdolist_list_var = cdolist_list_var.rest();
      paragraph = cdolist_list_var.first();
    }
    return Sequences.nreverse( all_sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 3714L)
  public static SubLObject is_return_charP(final SubLObject string)
  {
    return Characters.char_equal( Characters.CHAR_return, Vectors.aref( string, ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 3863L)
  public static SubLObject rkfutil_fetch_html_file(final SubLObject stream, SubLObject filename)
  {
    if( filename == UNPROVIDED )
    {
      filename = $str70$anonymous;
    }
    final SubLObject file = make_file_content( UNPROVIDED );
    SubLObject content = NIL;
    _csetf_file_content_name( file, filename );
    content = xml_parsing_utilities.xml_tokenize( stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    content = Sequences.delete_if( $sym71$IS_RETURN_CHAR_, content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    _csetf_file_content_text( file, content );
    return file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 4206L)
  public static SubLObject rkfutil_fetch_html_paragraphs(final SubLObject file)
  {
    SubLObject counter = ZERO_INTEGER;
    SubLObject paragraph = new_file_paragraph( file, counter, UNPROVIDED, UNPROVIDED );
    SubLObject paragraphs = ConsesLow.cons( paragraph, NIL );
    SubLObject tokens = file_content_text( file );
    counter = Numbers.add( counter, ONE_INTEGER );
    SubLObject items;
    for( tokens = scan_title_text( paragraph, tokens ), tokens = scan_past_first_token( html_macros.$html_paragraph_head$.getGlobalValue(), tokens ); NIL != tokens; tokens = scan_past_first_token(
        html_macros.$html_paragraph_head$.getGlobalValue(), tokens ) )
    {
      items = NIL;
      while ( NIL != tokens && !tokens.first().equalp( html_macros.$html_paragraph_tail$.getGlobalValue() ))
      {
        items = ConsesLow.cons( tokens.first(), items );
        tokens = tokens.rest();
      }
      paragraph = new_file_paragraph( file, counter, Sequences.nreverse( items ), UNPROVIDED );
      paragraphs = ConsesLow.cons( paragraph, paragraphs );
      counter = Numbers.add( counter, ONE_INTEGER );
    }
    return Sequences.nreverse( paragraphs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 5120L)
  public static SubLObject scan_title_text(final SubLObject paragraph, final SubLObject tokens)
  {
    SubLObject spot = scan_past_first_token( html_macros.$html_title_head$.getGlobalValue(), tokens );
    final SubLObject title_text = NIL;
    _csetf_file_paragraph_class( paragraph, html_macros.$html_title_head$.getGlobalValue() );
    if( NIL == spot )
    {
      spot = tokens;
    }
    else
    {
      SubLObject title_text_$1 = NIL;
      while ( NIL != spot && !spot.first().equalp( html_macros.$html_title_tail$.getGlobalValue() ))
      {
        title_text_$1 = ConsesLow.cons( spot.first(), title_text_$1 );
        spot = spot.rest();
      }
      title_text_$1 = Sequences.nreverse( title_text_$1 );
    }
    _csetf_file_paragraph_sentences( paragraph, title_text );
    return spot;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 5713L)
  public static SubLObject rkfutil_fetch_html_sentences(final SubLObject paragraph)
  {
    SubLObject good_pieces = NIL;
    if( file_paragraph_class( paragraph ).equalp( html_macros.$html_paragraph_head$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = file_paragraph_sentences( paragraph );
      SubLObject piece = NIL;
      piece = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == Characters.char_equal( Characters.CHAR_less, Vectors.aref( piece, ZERO_INTEGER ) ) )
        {
          good_pieces = ConsesLow.cons( piece, good_pieces );
        }
        cdolist_list_var = cdolist_list_var.rest();
        piece = cdolist_list_var.first();
      }
      if( NIL != good_pieces )
      {
        return convert_good_pieces( paragraph, good_pieces );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 6200L)
  public static SubLObject convert_good_pieces(final SubLObject paragraph, final SubLObject good_pieces)
  {
    SubLObject text = Functions.apply( Symbols.symbol_function( $sym72$CCONCATENATE ), Sequences.nreverse( good_pieces ) );
    text = cleanse_text( text );
    return decompose_paragraph_into_sentences( paragraph, text );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 6483L)
  public static SubLObject cleanse_text(final SubLObject text)
  {
    return Sequences.nsubstitute( Characters.CHAR_space, Characters.CHAR_newline, Sequences.delete( Characters.CHAR_return, text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 6587L)
  public static SubLObject decompose_paragraph_into_sentences(final SubLObject paragraph, final SubLObject text)
  {
    SubLObject counter = ONE_INTEGER;
    SubLObject state = $kw73$IN_SENTENCE;
    SubLObject start = ZERO_INTEGER;
    SubLObject end = NIL;
    SubLObject curr = NIL;
    SubLObject sentences = NIL;
    SubLObject cdotimes_end_var;
    SubLObject index;
    SubLObject pcase_var;
    SubLObject part;
    for( cdotimes_end_var = Sequences.length( text ), index = NIL, index = ZERO_INTEGER; index.numL( cdotimes_end_var ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      curr = Vectors.aref( text, index );
      pcase_var = state;
      if( pcase_var.eql( $kw73$IN_SENTENCE ) )
      {
        if( NIL != is_a_terminatorP( curr ) )
        {
          end = Numbers.add( index, ONE_INTEGER );
          state = $kw74$POTENTIAL_END;
        }
      }
      else if( pcase_var.eql( $kw74$POTENTIAL_END ) && NIL == is_a_spaceP( curr ) )
      {
        if( NIL != Characters.upper_case_p( curr ) )
        {
          part = Sequences.subseq( text, start, end );
          part = string_utilities.replace_substring( part, $str75$_, $str76$_ );
          sentences = ConsesLow.cons( new_file_sentence( paragraph, counter, part ), sentences );
          counter = Numbers.add( counter, ONE_INTEGER );
          start = index;
        }
        state = $kw73$IN_SENTENCE;
      }
    }
    if( state == $kw74$POTENTIAL_END )
    {
      SubLObject part2 = Sequences.subseq( text, start, end );
      part2 = string_utilities.replace_substring( part2, $str75$_, $str76$_ );
      sentences = ConsesLow.cons( new_file_sentence( paragraph, counter, part2 ), sentences );
    }
    return Sequences.nreverse( sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 7813L)
  public static SubLObject is_a_terminatorP(final SubLObject v_char)
  {
    return conses_high.member( v_char, $list77, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 7984L)
  public static SubLObject is_a_spaceP(final SubLObject v_char)
  {
    return conses_high.member( v_char, $list78, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 8079L)
  public static SubLObject scan_past_first_token(final SubLObject token, final SubLObject tokens)
  {
    final SubLObject scan_result = scan_to_first_token( token, tokens );
    return scan_result.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 8301L)
  public static SubLObject scan_to_first_token(final SubLObject token, SubLObject tokens)
  {
    while ( !tokens.first().equalp( token ))
    {
      if( NIL == tokens )
      {
        return NIL;
      }
      tokens = tokens.rest();
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 8493L)
  public static SubLObject scan_past_first_token_starting(final SubLObject header, final SubLObject tokens)
  {
    final SubLObject scan_result = scan_to_first_token_starting( header, tokens );
    return scan_result.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 8658L)
  public static SubLObject scan_to_first_token_starting(final SubLObject header, SubLObject tokens)
  {
    SubLObject position;
    for( position = NIL, position = Sequences.search( header, tokens.first(), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ); !position.isNumber() || !position
        .isZero(); position = Sequences.search( header, tokens.first(), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL == tokens )
      {
        return NIL;
      }
      tokens = tokens.rest();
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 8978L)
  public static SubLObject rkf_sententialize_paragraph(final SubLObject paragraph)
  {
    final SubLObject text = cleanse_text( paragraph );
    final SubLObject sentences = decompose_paragraph_into_sentences( NIL, text );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = sentences;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( file_sentence_text( item ), result );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 9332L)
  public static SubLObject rkf_sententialize_file(final SubLObject filename)
  {
    final SubLObject sentences = rkfutil_process_html_file( filename );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = sentences;
    SubLObject paragraph = NIL;
    paragraph = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$2 = paragraph;
      SubLObject sentence = NIL;
      sentence = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        result = ConsesLow.cons( file_sentence_text( sentence ), result );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        sentence = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      paragraph = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  public static SubLObject declare_rkf_ch_html_scanner_file()
  {
    SubLFiles.declareFunction( me, "file_content_print_function_trampoline", "FILE-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "file_content_p", "FILE-CONTENT-P", 1, 0, false );
    new $file_content_p$UnaryFunction();
    SubLFiles.declareFunction( me, "file_content_name", "FILE-CONTENT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "file_content_text", "FILE-CONTENT-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_file_content_name", "_CSETF-FILE-CONTENT-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_file_content_text", "_CSETF-FILE-CONTENT-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_file_content", "MAKE-FILE-CONTENT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_file_content", "VISIT-DEFSTRUCT-FILE-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_file_content_method", "VISIT-DEFSTRUCT-OBJECT-FILE-CONTENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "file_paragraph_print_function_trampoline", "FILE-PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "file_paragraph_p", "FILE-PARAGRAPH-P", 1, 0, false );
    new $file_paragraph_p$UnaryFunction();
    SubLFiles.declareFunction( me, "file_paragraph_file_context", "FILE-PARAGRAPH-FILE-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "file_paragraph_number", "FILE-PARAGRAPH-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "file_paragraph_class", "FILE-PARAGRAPH-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "file_paragraph_sentences", "FILE-PARAGRAPH-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_file_paragraph_file_context", "_CSETF-FILE-PARAGRAPH-FILE-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_file_paragraph_number", "_CSETF-FILE-PARAGRAPH-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_file_paragraph_class", "_CSETF-FILE-PARAGRAPH-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_file_paragraph_sentences", "_CSETF-FILE-PARAGRAPH-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_file_paragraph", "MAKE-FILE-PARAGRAPH", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_file_paragraph", "VISIT-DEFSTRUCT-FILE-PARAGRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_file_paragraph_method", "VISIT-DEFSTRUCT-OBJECT-FILE-PARAGRAPH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_file_paragraph", "NEW-FILE-PARAGRAPH", 2, 2, false );
    SubLFiles.declareFunction( me, "print_file_paragraph", "PRINT-FILE-PARAGRAPH", 3, 0, false );
    SubLFiles.declareFunction( me, "file_sentence_print_function_trampoline", "FILE-SENTENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "file_sentence_p", "FILE-SENTENCE-P", 1, 0, false );
    new $file_sentence_p$UnaryFunction();
    SubLFiles.declareFunction( me, "file_sentence_paragraph", "FILE-SENTENCE-PARAGRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "file_sentence_number", "FILE-SENTENCE-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "file_sentence_text", "FILE-SENTENCE-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_file_sentence_paragraph", "_CSETF-FILE-SENTENCE-PARAGRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_file_sentence_number", "_CSETF-FILE-SENTENCE-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_file_sentence_text", "_CSETF-FILE-SENTENCE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_file_sentence", "MAKE-FILE-SENTENCE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_file_sentence", "VISIT-DEFSTRUCT-FILE-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_file_sentence_method", "VISIT-DEFSTRUCT-OBJECT-FILE-SENTENCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_file_sentence", "NEW-FILE-SENTENCE", 2, 1, false );
    SubLFiles.declareFunction( me, "print_file_sentence", "PRINT-FILE-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "rkfutil_process_html_file", "RKFUTIL-PROCESS-HTML-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "is_return_charP", "IS-RETURN-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkfutil_fetch_html_file", "RKFUTIL-FETCH-HTML-FILE", 1, 1, false );
    SubLFiles.declareFunction( me, "rkfutil_fetch_html_paragraphs", "RKFUTIL-FETCH-HTML-PARAGRAPHS", 1, 0, false );
    SubLFiles.declareFunction( me, "scan_title_text", "SCAN-TITLE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkfutil_fetch_html_sentences", "RKFUTIL-FETCH-HTML-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_good_pieces", "CONVERT-GOOD-PIECES", 2, 0, false );
    SubLFiles.declareFunction( me, "cleanse_text", "CLEANSE-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "decompose_paragraph_into_sentences", "DECOMPOSE-PARAGRAPH-INTO-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "is_a_terminatorP", "IS-A-TERMINATOR?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_a_spaceP", "IS-A-SPACE?", 1, 0, false );
    SubLFiles.declareFunction( me, "scan_past_first_token", "SCAN-PAST-FIRST-TOKEN", 2, 0, false );
    SubLFiles.declareFunction( me, "scan_to_first_token", "SCAN-TO-FIRST-TOKEN", 2, 0, false );
    SubLFiles.declareFunction( me, "scan_past_first_token_starting", "SCAN-PAST-FIRST-TOKEN-STARTING", 2, 0, false );
    SubLFiles.declareFunction( me, "scan_to_first_token_starting", "SCAN-TO-FIRST-TOKEN-STARTING", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sententialize_paragraph", "RKF-SENTENTIALIZE-PARAGRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_sententialize_file", "RKF-SENTENTIALIZE-FILE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_ch_html_scanner_file()
  {
    $dtp_file_content$ = SubLFiles.defconstant( "*DTP-FILE-CONTENT*", $sym0$FILE_CONTENT );
    $dtp_file_paragraph$ = SubLFiles.defconstant( "*DTP-FILE-PARAGRAPH*", $sym21$FILE_PARAGRAPH );
    $dtp_file_sentence$ = SubLFiles.defconstant( "*DTP-FILE-SENTENCE*", $sym47$FILE_SENTENCE );
    return NIL;
  }

  public static SubLObject setup_rkf_ch_html_scanner_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_file_content$.getGlobalValue(), Symbols.symbol_function( $sym7$FILE_CONTENT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$FILE_CONTENT_NAME, $sym10$_CSETF_FILE_CONTENT_NAME );
    Structures.def_csetf( $sym11$FILE_CONTENT_TEXT, $sym12$_CSETF_FILE_CONTENT_TEXT );
    Equality.identity( $sym0$FILE_CONTENT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_content$.getGlobalValue(), Symbols.symbol_function( $sym20$VISIT_DEFSTRUCT_OBJECT_FILE_CONTENT_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_file_paragraph$.getGlobalValue(), Symbols.symbol_function( $sym28$FILE_PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list29 );
    Structures.def_csetf( $sym30$FILE_PARAGRAPH_FILE_CONTEXT, $sym31$_CSETF_FILE_PARAGRAPH_FILE_CONTEXT );
    Structures.def_csetf( $sym32$FILE_PARAGRAPH_NUMBER, $sym33$_CSETF_FILE_PARAGRAPH_NUMBER );
    Structures.def_csetf( $sym34$FILE_PARAGRAPH_CLASS, $sym35$_CSETF_FILE_PARAGRAPH_CLASS );
    Structures.def_csetf( $sym36$FILE_PARAGRAPH_SENTENCES, $sym37$_CSETF_FILE_PARAGRAPH_SENTENCES );
    Equality.identity( $sym21$FILE_PARAGRAPH );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_paragraph$.getGlobalValue(), Symbols.symbol_function( $sym43$VISIT_DEFSTRUCT_OBJECT_FILE_PARAGRAPH_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_file_sentence$.getGlobalValue(), Symbols.symbol_function( $sym54$FILE_SENTENCE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list55 );
    Structures.def_csetf( $sym56$FILE_SENTENCE_PARAGRAPH, $sym57$_CSETF_FILE_SENTENCE_PARAGRAPH );
    Structures.def_csetf( $sym58$FILE_SENTENCE_NUMBER, $sym59$_CSETF_FILE_SENTENCE_NUMBER );
    Structures.def_csetf( $sym60$FILE_SENTENCE_TEXT, $sym61$_CSETF_FILE_SENTENCE_TEXT );
    Equality.identity( $sym47$FILE_SENTENCE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_sentence$.getGlobalValue(), Symbols.symbol_function( $sym64$VISIT_DEFSTRUCT_OBJECT_FILE_SENTENCE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_ch_html_scanner_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_ch_html_scanner_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_ch_html_scanner_file();
  }
  static
  {
    me = new rkf_ch_html_scanner();
    $dtp_file_content$ = null;
    $dtp_file_paragraph$ = null;
    $dtp_file_sentence$ = null;
    $sym0$FILE_CONTENT = makeSymbol( "FILE-CONTENT" );
    $sym1$FILE_CONTENT_P = makeSymbol( "FILE-CONTENT-P" );
    $list2 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "TEXT" ) );
    $list3 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "TEXT" ) );
    $list4 = ConsesLow.list( makeSymbol( "FILE-CONTENT-NAME" ), makeSymbol( "FILE-CONTENT-TEXT" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-FILE-CONTENT-NAME" ), makeSymbol( "_CSETF-FILE-CONTENT-TEXT" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$FILE_CONTENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "FILE-CONTENT-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "FILE-CONTENT-P" ) );
    $sym9$FILE_CONTENT_NAME = makeSymbol( "FILE-CONTENT-NAME" );
    $sym10$_CSETF_FILE_CONTENT_NAME = makeSymbol( "_CSETF-FILE-CONTENT-NAME" );
    $sym11$FILE_CONTENT_TEXT = makeSymbol( "FILE-CONTENT-TEXT" );
    $sym12$_CSETF_FILE_CONTENT_TEXT = makeSymbol( "_CSETF-FILE-CONTENT-TEXT" );
    $kw13$NAME = makeKeyword( "NAME" );
    $kw14$TEXT = makeKeyword( "TEXT" );
    $str15$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw16$BEGIN = makeKeyword( "BEGIN" );
    $sym17$MAKE_FILE_CONTENT = makeSymbol( "MAKE-FILE-CONTENT" );
    $kw18$SLOT = makeKeyword( "SLOT" );
    $kw19$END = makeKeyword( "END" );
    $sym20$VISIT_DEFSTRUCT_OBJECT_FILE_CONTENT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-FILE-CONTENT-METHOD" );
    $sym21$FILE_PARAGRAPH = makeSymbol( "FILE-PARAGRAPH" );
    $sym22$FILE_PARAGRAPH_P = makeSymbol( "FILE-PARAGRAPH-P" );
    $list23 = ConsesLow.list( makeSymbol( "FILE-CONTEXT" ), makeSymbol( "NUMBER" ), makeSymbol( "CLASS" ), makeSymbol( "SENTENCES" ) );
    $list24 = ConsesLow.list( makeKeyword( "FILE-CONTEXT" ), makeKeyword( "NUMBER" ), makeKeyword( "CLASS" ), makeKeyword( "SENTENCES" ) );
    $list25 = ConsesLow.list( makeSymbol( "FILE-PARAGRAPH-FILE-CONTEXT" ), makeSymbol( "FILE-PARAGRAPH-NUMBER" ), makeSymbol( "FILE-PARAGRAPH-CLASS" ), makeSymbol( "FILE-PARAGRAPH-SENTENCES" ) );
    $list26 = ConsesLow.list( makeSymbol( "_CSETF-FILE-PARAGRAPH-FILE-CONTEXT" ), makeSymbol( "_CSETF-FILE-PARAGRAPH-NUMBER" ), makeSymbol( "_CSETF-FILE-PARAGRAPH-CLASS" ), makeSymbol(
        "_CSETF-FILE-PARAGRAPH-SENTENCES" ) );
    $sym27$PRINT_FILE_PARAGRAPH = makeSymbol( "PRINT-FILE-PARAGRAPH" );
    $sym28$FILE_PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "FILE-PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE" );
    $list29 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "FILE-PARAGRAPH-P" ) );
    $sym30$FILE_PARAGRAPH_FILE_CONTEXT = makeSymbol( "FILE-PARAGRAPH-FILE-CONTEXT" );
    $sym31$_CSETF_FILE_PARAGRAPH_FILE_CONTEXT = makeSymbol( "_CSETF-FILE-PARAGRAPH-FILE-CONTEXT" );
    $sym32$FILE_PARAGRAPH_NUMBER = makeSymbol( "FILE-PARAGRAPH-NUMBER" );
    $sym33$_CSETF_FILE_PARAGRAPH_NUMBER = makeSymbol( "_CSETF-FILE-PARAGRAPH-NUMBER" );
    $sym34$FILE_PARAGRAPH_CLASS = makeSymbol( "FILE-PARAGRAPH-CLASS" );
    $sym35$_CSETF_FILE_PARAGRAPH_CLASS = makeSymbol( "_CSETF-FILE-PARAGRAPH-CLASS" );
    $sym36$FILE_PARAGRAPH_SENTENCES = makeSymbol( "FILE-PARAGRAPH-SENTENCES" );
    $sym37$_CSETF_FILE_PARAGRAPH_SENTENCES = makeSymbol( "_CSETF-FILE-PARAGRAPH-SENTENCES" );
    $kw38$FILE_CONTEXT = makeKeyword( "FILE-CONTEXT" );
    $kw39$NUMBER = makeKeyword( "NUMBER" );
    $kw40$CLASS = makeKeyword( "CLASS" );
    $kw41$SENTENCES = makeKeyword( "SENTENCES" );
    $sym42$MAKE_FILE_PARAGRAPH = makeSymbol( "MAKE-FILE-PARAGRAPH" );
    $sym43$VISIT_DEFSTRUCT_OBJECT_FILE_PARAGRAPH_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-FILE-PARAGRAPH-METHOD" );
    $str44$__FileP__D_class__S__ = makeString( "#<FileP ~D class ~S~%" );
    $str45$_ = makeString( " " );
    $str46$___FileP_ = makeString( "~&:FileP>" );
    $sym47$FILE_SENTENCE = makeSymbol( "FILE-SENTENCE" );
    $sym48$FILE_SENTENCE_P = makeSymbol( "FILE-SENTENCE-P" );
    $list49 = ConsesLow.list( makeSymbol( "PARAGRAPH" ), makeSymbol( "NUMBER" ), makeSymbol( "TEXT" ) );
    $list50 = ConsesLow.list( makeKeyword( "PARAGRAPH" ), makeKeyword( "NUMBER" ), makeKeyword( "TEXT" ) );
    $list51 = ConsesLow.list( makeSymbol( "FILE-SENTENCE-PARAGRAPH" ), makeSymbol( "FILE-SENTENCE-NUMBER" ), makeSymbol( "FILE-SENTENCE-TEXT" ) );
    $list52 = ConsesLow.list( makeSymbol( "_CSETF-FILE-SENTENCE-PARAGRAPH" ), makeSymbol( "_CSETF-FILE-SENTENCE-NUMBER" ), makeSymbol( "_CSETF-FILE-SENTENCE-TEXT" ) );
    $sym53$PRINT_FILE_SENTENCE = makeSymbol( "PRINT-FILE-SENTENCE" );
    $sym54$FILE_SENTENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "FILE-SENTENCE-PRINT-FUNCTION-TRAMPOLINE" );
    $list55 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "FILE-SENTENCE-P" ) );
    $sym56$FILE_SENTENCE_PARAGRAPH = makeSymbol( "FILE-SENTENCE-PARAGRAPH" );
    $sym57$_CSETF_FILE_SENTENCE_PARAGRAPH = makeSymbol( "_CSETF-FILE-SENTENCE-PARAGRAPH" );
    $sym58$FILE_SENTENCE_NUMBER = makeSymbol( "FILE-SENTENCE-NUMBER" );
    $sym59$_CSETF_FILE_SENTENCE_NUMBER = makeSymbol( "_CSETF-FILE-SENTENCE-NUMBER" );
    $sym60$FILE_SENTENCE_TEXT = makeSymbol( "FILE-SENTENCE-TEXT" );
    $sym61$_CSETF_FILE_SENTENCE_TEXT = makeSymbol( "_CSETF-FILE-SENTENCE-TEXT" );
    $kw62$PARAGRAPH = makeKeyword( "PARAGRAPH" );
    $sym63$MAKE_FILE_SENTENCE = makeSymbol( "MAKE-FILE-SENTENCE" );
    $sym64$VISIT_DEFSTRUCT_OBJECT_FILE_SENTENCE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-FILE-SENTENCE-METHOD" );
    $str65$__Sent__D = makeString( "#<Sent ~D" );
    $str66$of_P_D = makeString( "of P~D" );
    $str67$___S__ = makeString( ": ~S:>" );
    $kw68$INPUT = makeKeyword( "INPUT" );
    $str69$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str70$anonymous = makeString( "anonymous" );
    $sym71$IS_RETURN_CHAR_ = makeSymbol( "IS-RETURN-CHAR?" );
    $sym72$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $kw73$IN_SENTENCE = makeKeyword( "IN-SENTENCE" );
    $kw74$POTENTIAL_END = makeKeyword( "POTENTIAL-END" );
    $str75$_ = makeString( "~" );
    $str76$_ = makeString( "." );
    $list77 = ConsesLow.list( Characters.CHAR_tilde );
    $list78 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_tab, Characters.CHAR_newline, Characters.CHAR_return );
  }

  public static final class $file_content_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $text;
    private static final SubLStructDeclNative structDecl;

    public $file_content_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$text = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $file_content_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$text;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$text = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $file_content_native.class, $sym0$FILE_CONTENT, $sym1$FILE_CONTENT_P, $list2, $list3, new String[] { "$name", "$text"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $file_content_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $file_content_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FILE-CONTENT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return file_content_p( arg1 );
    }
  }

  public static final class $file_paragraph_native
      extends
        SubLStructNative
  {
    public SubLObject $file_context;
    public SubLObject $number;
    public SubLObject $class;
    public SubLObject $sentences;
    private static final SubLStructDeclNative structDecl;

    public $file_paragraph_native()
    {
      this.$file_context = CommonSymbols.NIL;
      this.$number = CommonSymbols.NIL;
      this.$class = CommonSymbols.NIL;
      this.$sentences = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $file_paragraph_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$file_context;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$number;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$class;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$sentences;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$file_context = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$number = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$class = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$sentences = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $file_paragraph_native.class, $sym21$FILE_PARAGRAPH, $sym22$FILE_PARAGRAPH_P, $list23, $list24, new String[] { "$file_context", "$number", "$class", "$sentences"
      }, $list25, $list26, $sym27$PRINT_FILE_PARAGRAPH );
    }
  }

  public static final class $file_paragraph_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $file_paragraph_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FILE-PARAGRAPH-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return file_paragraph_p( arg1 );
    }
  }

  public static final class $file_sentence_native
      extends
        SubLStructNative
  {
    public SubLObject $paragraph;
    public SubLObject $number;
    public SubLObject $text;
    private static final SubLStructDeclNative structDecl;

    public $file_sentence_native()
    {
      this.$paragraph = CommonSymbols.NIL;
      this.$number = CommonSymbols.NIL;
      this.$text = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $file_sentence_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$paragraph;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$number;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$text;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$paragraph = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$number = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$text = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $file_sentence_native.class, $sym47$FILE_SENTENCE, $sym48$FILE_SENTENCE_P, $list49, $list50, new String[] { "$paragraph", "$number", "$text"
      }, $list51, $list52, $sym53$PRINT_FILE_SENTENCE );
    }
  }

  public static final class $file_sentence_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $file_sentence_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FILE-SENTENCE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return file_sentence_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 215 ms
 * 
 */