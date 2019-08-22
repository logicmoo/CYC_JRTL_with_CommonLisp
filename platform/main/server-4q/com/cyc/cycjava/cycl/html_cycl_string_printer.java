package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_cycl_string_printer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.html_cycl_string_printer";
  public static final String myFingerPrint = "9a3e34f02ba898a96a1138dc9859152a1ef8c751124029f7d9853e8804fa0c92";
  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLSymbol $dtp_html_cycl_string_printer$;
  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 4583L)
  private static SubLSymbol $embedded_constant_suffix_strings$;
  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7127L)
  public static SubLSymbol $cycl_string_allowable_html_tags$;
  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7318L)
  public static SubLSymbol $html_large_string_limit$;
  private static final SubLSymbol $sym0$HTML_CYCL_STRING_PRINTER;
  private static final SubLSymbol $sym1$HTML_CYCL_STRING_PRINTER_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_HTML_CYCL_STRING_PRINTER;
  private static final SubLSymbol $sym7$HTML_CYCL_STRING_PRINTER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$HCS_STRING;
  private static final SubLSymbol $sym10$_CSETF_HCS_STRING;
  private static final SubLSymbol $sym11$HCS_LENGTH;
  private static final SubLSymbol $sym12$_CSETF_HCS_LENGTH;
  private static final SubLSymbol $sym13$HCS_LAST_IDX;
  private static final SubLSymbol $sym14$_CSETF_HCS_LAST_IDX;
  private static final SubLSymbol $sym15$HCS_INSIDE_CYCL_TAG_;
  private static final SubLSymbol $sym16$_CSETF_HCS_INSIDE_CYCL_TAG_;
  private static final SubLSymbol $sym17$HCS_HASH_IDX;
  private static final SubLSymbol $sym18$_CSETF_HCS_HASH_IDX;
  private static final SubLSymbol $sym19$HCS_COLON_IDX;
  private static final SubLSymbol $sym20$_CSETF_HCS_COLON_IDX;
  private static final SubLSymbol $sym21$HCS_LT_IDX;
  private static final SubLSymbol $sym22$_CSETF_HCS_LT_IDX;
  private static final SubLSymbol $sym23$HCS_VARIABLE_IDX;
  private static final SubLSymbol $sym24$_CSETF_HCS_VARIABLE_IDX;
  private static final SubLSymbol $sym25$HCS_URL_IDX;
  private static final SubLSymbol $sym26$_CSETF_HCS_URL_IDX;
  private static final SubLSymbol $sym27$HCS_URL_END_IDX;
  private static final SubLSymbol $sym28$_CSETF_HCS_URL_END_IDX;
  private static final SubLSymbol $sym29$HCS_LINK_FUNCTION;
  private static final SubLSymbol $sym30$_CSETF_HCS_LINK_FUNCTION;
  private static final SubLSymbol $sym31$HCS_REQUIRE_EXACT_;
  private static final SubLSymbol $sym32$_CSETF_HCS_REQUIRE_EXACT_;
  private static final SubLSymbol $kw33$STRING;
  private static final SubLSymbol $kw34$LENGTH;
  private static final SubLSymbol $kw35$LAST_IDX;
  private static final SubLSymbol $kw36$INSIDE_CYCL_TAG_;
  private static final SubLSymbol $kw37$HASH_IDX;
  private static final SubLSymbol $kw38$COLON_IDX;
  private static final SubLSymbol $kw39$LT_IDX;
  private static final SubLSymbol $kw40$VARIABLE_IDX;
  private static final SubLSymbol $kw41$URL_IDX;
  private static final SubLSymbol $kw42$URL_END_IDX;
  private static final SubLSymbol $kw43$LINK_FUNCTION;
  private static final SubLSymbol $kw44$REQUIRE_EXACT_;
  private static final SubLString $str45$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw46$BEGIN;
  private static final SubLSymbol $sym47$MAKE_HTML_CYCL_STRING_PRINTER;
  private static final SubLSymbol $kw48$SLOT;
  private static final SubLSymbol $kw49$END;
  private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_HTML_CYCL_STRING_PRINTER_METHOD;
  private static final SubLString $str51$_HTML_CYCL_STRING_PRINTER_;
  private static final SubLSymbol $sym52$CB_FORM;
  private static final SubLSymbol $kw53$DONE;
  private static final SubLSymbol $sym54$MIN;
  private static final SubLSymbol $sym55$NULL;
  private static final SubLString $str56$__;
  private static final SubLString $str57$_a_href___S__A__a_;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$VALID_CONSTANT_NAME_CHAR_P;
  private static final SubLList $list60;
  private static final SubLInteger $int61$4096;
  private static final SubLSymbol $sym62$EL_VARIABLE_CHAR_;
  private static final SubLSymbol $sym63$STRING_;
  private static final SubLString $str64$_;
  private static final SubLString $str65$_;
  private static final SubLString $str66$_;
  private static final SubLString $str67$code;
  private static final SubLString $str68$pre;

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject html_cycl_string_printer_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_html_cycl_string_printer( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject html_cycl_string_printer_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$html_cycl_string_printer_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_string(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_length(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_last_idx(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_inside_cycl_tagP(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_hash_idx(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_colon_idx(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_lt_idx(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_variable_idx(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_url_idx(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_url_end_idx(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_link_function(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject hcs_require_exactP(final SubLObject v_object)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_length(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_last_idx(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_inside_cycl_tagP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_hash_idx(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_colon_idx(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_lt_idx(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_variable_idx(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_url_idx(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_url_end_idx(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_link_function(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject _csetf_hcs_require_exactP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_cycl_string_printer_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject make_html_cycl_string_printer(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $html_cycl_string_printer_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw33$STRING ) )
      {
        _csetf_hcs_string( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$LENGTH ) )
      {
        _csetf_hcs_length( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$LAST_IDX ) )
      {
        _csetf_hcs_last_idx( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$INSIDE_CYCL_TAG_ ) )
      {
        _csetf_hcs_inside_cycl_tagP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$HASH_IDX ) )
      {
        _csetf_hcs_hash_idx( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$COLON_IDX ) )
      {
        _csetf_hcs_colon_idx( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$LT_IDX ) )
      {
        _csetf_hcs_lt_idx( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$VARIABLE_IDX ) )
      {
        _csetf_hcs_variable_idx( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$URL_IDX ) )
      {
        _csetf_hcs_url_idx( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$URL_END_IDX ) )
      {
        _csetf_hcs_url_end_idx( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$LINK_FUNCTION ) )
      {
        _csetf_hcs_link_function( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$REQUIRE_EXACT_ ) )
      {
        _csetf_hcs_require_exactP( v_new, current_value );
      }
      else
      {
        Errors.error( $str45$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject visit_defstruct_html_cycl_string_printer(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw46$BEGIN, $sym47$MAKE_HTML_CYCL_STRING_PRINTER, TWELVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw33$STRING, hcs_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw34$LENGTH, hcs_length( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw35$LAST_IDX, hcs_last_idx( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw36$INSIDE_CYCL_TAG_, hcs_inside_cycl_tagP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw37$HASH_IDX, hcs_hash_idx( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw38$COLON_IDX, hcs_colon_idx( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw39$LT_IDX, hcs_lt_idx( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw40$VARIABLE_IDX, hcs_variable_idx( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw41$URL_IDX, hcs_url_idx( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw42$URL_END_IDX, hcs_url_end_idx( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw43$LINK_FUNCTION, hcs_link_function( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw44$REQUIRE_EXACT_, hcs_require_exactP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$END, $sym47$MAKE_HTML_CYCL_STRING_PRINTER, TWELVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
  public static SubLObject visit_defstruct_object_html_cycl_string_printer_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_html_cycl_string_printer( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1630L)
  public static SubLObject print_html_cycl_string_printer(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str51$_HTML_CYCL_STRING_PRINTER_ );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1796L)
  public static SubLObject new_html_cycl_string_printer(final SubLObject string, SubLObject link_function, SubLObject require_exactP)
  {
    if( link_function == UNPROVIDED )
    {
      link_function = $sym52$CB_FORM;
    }
    if( require_exactP == UNPROVIDED )
    {
      require_exactP = NIL;
    }
    final SubLObject printer = make_html_cycl_string_printer( UNPROVIDED );
    _csetf_hcs_string( printer, string );
    _csetf_hcs_length( printer, Sequences.length( string ) );
    _csetf_hcs_last_idx( printer, ZERO_INTEGER );
    _csetf_hcs_inside_cycl_tagP( printer, NIL );
    hcs_set_hash_idx( printer );
    hcs_set_colon_idx( printer );
    _csetf_hcs_lt_idx( printer, hcs_find( printer, Characters.CHAR_less, hcs_last_idx( printer ) ) );
    _csetf_hcs_variable_idx( printer, html_cycl_string_variable_index( string, hcs_last_idx( printer ) ) );
    _csetf_hcs_url_idx( printer, ZERO_INTEGER );
    _csetf_hcs_url_end_idx( printer, ZERO_INTEGER );
    _csetf_hcs_link_function( printer, link_function );
    _csetf_hcs_require_exactP( printer, require_exactP );
    return printer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 2596L)
  public static SubLObject html_cycl_string_printer_done_p(final SubLObject printer)
  {
    return makeBoolean( NIL == hcs_colon_idx( printer ) && NIL == hcs_hash_idx( printer ) && NIL == hcs_last_idx( printer ) && NIL == hcs_lt_idx( printer ) && NIL == hcs_variable_idx( printer ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 2864L)
  public static SubLObject html_cycl_string_printer_print_next(final SubLObject printer)
  {
    if( NIL == hcs_colon_idx( printer ) && NIL == hcs_hash_idx( printer ) && NIL == hcs_lt_idx( printer ) && NIL == hcs_variable_idx( printer ) )
    {
      hcs_print( printer, NIL, T );
      return $kw53$DONE;
    }
    final SubLObject next_char_idx = Functions.apply( Symbols.symbol_function( $sym54$MIN ), Sequences.remove_if( Symbols.symbol_function( $sym55$NULL ), ConsesLow.list( hcs_hash_idx( printer ), hcs_colon_idx( printer ),
        hcs_lt_idx( printer ), hcs_variable_idx( printer ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    if( hcs_colon_idx( printer ).eql( next_char_idx ) )
    {
      hcs_handle_colon( printer );
    }
    else if( hcs_hash_idx( printer ).eql( next_char_idx ) )
    {
      hcs_handle_hash( printer );
    }
    else if( hcs_variable_idx( printer ).eql( next_char_idx ) )
    {
      hcs_handle_variable( printer );
    }
    else if( hcs_lt_idx( printer ).eql( next_char_idx ) )
    {
      hcs_handle_lt( printer );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 3767L)
  public static SubLObject html_cycl_string_variable_index(final SubLObject string, final SubLObject start_char)
  {
    SubLObject prev_char = Characters.CHAR_space;
    SubLObject inside_tagP = NIL;
    SubLObject end_var_$1;
    SubLObject end_var;
    SubLObject n;
    SubLObject this_char;
    for( end_var = ( end_var_$1 = Sequences.length( string ) ), n = NIL, n = start_char; !n.numGE( end_var_$1 ); n = number_utilities.f_1X( n ) )
    {
      this_char = Strings.sublisp_char( string, n );
      if( NIL != inside_tagP )
      {
        if( this_char.eql( Characters.CHAR_greater ) )
        {
          inside_tagP = NIL;
        }
      }
      else if( this_char.eql( Characters.CHAR_less ) )
      {
        inside_tagP = T;
      }
      else
      {
        if( NIL != string_utilities.whitespacep( prev_char ) && NIL != Sequences.find( this_char, $str56$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          return n;
        }
        if( NIL != string_utilities.whitespacep( prev_char ) && NIL != list_utilities.lengthG( string, number_utilities.f_1X( n ), UNPROVIDED ) && NIL != cycl_variables.el_variable_charP( this_char )
            && NIL != cycl_variables.el_variable_charP( Strings.sublisp_char( string, number_utilities.f_1X( n ) ) ) )
        {
          return n;
        }
        prev_char = this_char;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 4393L)
  public static SubLObject print_url_with_tag(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !string.isString() )
    {
      return NIL;
    }
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str57$_a_href___S__A__a_, string, string );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 5284L)
  public static SubLObject print_embedded_constant(final SubLObject string, final SubLObject length, final SubLObject dollar_idx, SubLObject link_function, SubLObject require_exactP)
  {
    if( link_function == UNPROVIDED )
    {
      link_function = $sym52$CB_FORM;
    }
    if( require_exactP == UNPROVIDED )
    {
      require_exactP = NIL;
    }
    final SubLObject token_start = Numbers.add( dollar_idx, ONE_INTEGER );
    SubLObject token_end = list_utilities.position_if_not( Symbols.symbol_function( $sym59$VALID_CONSTANT_NAME_CHAR_P ), string, Symbols.symbol_function( IDENTITY ), token_start, UNPROVIDED );
    SubLObject token_last = NIL;
    SubLObject possible_constant = NIL;
    if( NIL == token_end )
    {
      token_end = length;
    }
    token_last = Numbers.subtract( token_end, ONE_INTEGER );
    possible_constant = constant_completion_high.constant_complete_exact( string, token_start, token_end );
    if( NIL == possible_constant && NIL == require_exactP && NIL == possible_constant )
    {
      SubLObject csome_list_var = $embedded_constant_suffix_strings$.getGlobalValue();
      SubLObject suffix_string = NIL;
      suffix_string = csome_list_var.first();
      while ( NIL == possible_constant && NIL != csome_list_var)
      {
        SubLObject abort_this_suffixP;
        SubLObject i;
        SubLObject j;
        SubLObject chari;
        SubLObject possible_token_last;
        for( abort_this_suffixP = NIL, i = NIL, j = NIL, i = Numbers.subtract( Sequences.length( suffix_string ), ONE_INTEGER ), j = ZERO_INTEGER; !i.numL( ZERO_INTEGER ) && NIL == possible_constant
            && NIL == abort_this_suffixP; i = Numbers.subtract( i, ONE_INTEGER ), j = Numbers.add( j, ONE_INTEGER ) )
        {
          chari = Strings.sublisp_char( suffix_string, i );
          possible_token_last = Numbers.subtract( token_last, j );
          if( possible_token_last.numG( token_start ) && NIL != Characters.char_equal( chari, Strings.sublisp_char( string, possible_token_last ) ) )
          {
            possible_constant = constant_completion_high.constant_complete_exact( string, token_start, possible_token_last );
            if( NIL != possible_constant )
            {
              token_end = possible_token_last;
            }
          }
          else
          {
            abort_this_suffixP = T;
          }
        }
        csome_list_var = csome_list_var.rest();
        suffix_string = csome_list_var.first();
      }
    }
    if( NIL != possible_constant )
    {
      if( $sym52$CB_FORM == link_function )
      {
        cb_utilities.cb_form( possible_constant, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        Functions.funcall( link_function, possible_constant );
      }
    }
    else
    {
      html_utilities.html_stale_constant_reference( string, Numbers.subtract( dollar_idx, ONE_INTEGER ), token_end );
    }
    return token_end;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7471L)
  public static SubLObject hcs_find(final SubLObject printer, final SubLObject v_char, final SubLObject start)
  {
    return Sequences.position( v_char, hcs_string( printer ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), start, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7651L)
  public static SubLObject hcs_set_colon_idx(final SubLObject printer)
  {
    _csetf_hcs_colon_idx( printer, hcs_find( printer, Characters.CHAR_colon, hcs_last_idx( printer ) ) );
    return hcs_colon_idx( printer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7809L)
  public static SubLObject hcs_set_hash_idx(final SubLObject printer)
  {
    _csetf_hcs_hash_idx( printer, hcs_find( printer, Characters.CHAR_hash, hcs_last_idx( printer ) ) );
    return hcs_hash_idx( printer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7964L)
  public static SubLObject hcs_print(final SubLObject printer, final SubLObject end, final SubLObject move_last_idx_to_endP)
  {
    html_utilities.html_string( hcs_string( printer ), hcs_last_idx( printer ), end );
    if( NIL != move_last_idx_to_endP )
    {
      _csetf_hcs_last_idx( printer, end );
    }
    return printer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 8231L)
  public static SubLObject hcs_handle_colon(final SubLObject printer)
  {
    _csetf_hcs_url_idx( printer, web_utilities.find_url_beginning( hcs_string( printer ), hcs_length( printer ), hcs_colon_idx( printer ) ) );
    if( NIL != hcs_url_idx( printer ) )
    {
      _csetf_hcs_url_end_idx( printer, web_utilities.find_url_end( hcs_string( printer ), hcs_length( printer ), hcs_url_idx( printer ) ) );
    }
    if( NIL != hcs_url_idx( printer ) && NIL != hcs_url_end_idx( printer ) )
    {
      hcs_print( printer, hcs_url_idx( printer ), NIL );
      print_url_with_tag( Sequences.subseq( hcs_string( printer ), hcs_url_idx( printer ), hcs_url_end_idx( printer ) ) );
      _csetf_hcs_last_idx( printer, hcs_url_end_idx( printer ) );
    }
    else
    {
      hcs_print( printer, Numbers.add( ONE_INTEGER, hcs_colon_idx( printer ) ), T );
    }
    hcs_set_colon_idx( printer );
    hcs_set_hash_idx( printer );
    _csetf_hcs_variable_idx( printer, Sequences.position_if( $sym62$EL_VARIABLE_CHAR_, hcs_string( printer ), Symbols.symbol_function( IDENTITY ), hcs_last_idx( printer ), UNPROVIDED ) );
    return printer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 9448L)
  public static SubLObject hcs_handle_hash(final SubLObject printer)
  {
    hcs_print( printer, hcs_hash_idx( printer ), NIL );
    final SubLObject dollar_idx = Numbers.add( hcs_hash_idx( printer ), ONE_INTEGER );
    if( dollar_idx.numE( hcs_length( printer ) ) || !Strings.sublisp_char( hcs_string( printer ), dollar_idx ).eql( constant_reader.constant_reader_macro_char() ) )
    {
      html_utilities.html_princ( Characters.CHAR_hash );
      _csetf_hcs_last_idx( printer, dollar_idx );
    }
    else
    {
      _csetf_hcs_last_idx( printer, print_embedded_constant( hcs_string( printer ), hcs_length( printer ), dollar_idx, hcs_link_function( printer ), hcs_require_exactP( printer ) ) );
    }
    hcs_set_hash_idx( printer );
    hcs_set_colon_idx( printer );
    _csetf_hcs_variable_idx( printer, Sequences.position_if( $sym62$EL_VARIABLE_CHAR_, hcs_string( printer ), Symbols.symbol_function( IDENTITY ), hcs_last_idx( printer ), UNPROVIDED ) );
    return printer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 10501L)
  public static SubLObject hcs_handle_variable(final SubLObject printer)
  {
    hcs_print( printer, hcs_variable_idx( printer ), T );
    final SubLObject non_variable_idx = list_utilities.position_if_not( $sym62$EL_VARIABLE_CHAR_, hcs_string( printer ), Symbols.symbol_function( IDENTITY ), hcs_variable_idx( printer ), UNPROVIDED );
    if( NIL != hcs_inside_cycl_tagP( printer ) && NIL != non_variable_idx && non_variable_idx.numG( hcs_variable_idx( printer ) ) && NIL == Characters.alpha_char_p( Strings.sublisp_char( hcs_string( printer ),
        non_variable_idx ) ) )
    {
      final SubLObject variable_name = Sequences.subseq( hcs_string( printer ), hcs_variable_idx( printer ), non_variable_idx );
      if( NIL != cycl_variables.valid_el_var_nameP( variable_name ) )
      {
        html_utilities.html_princ( variable_name );
      }
      else if( NIL != string_utilities.integer_string_p( variable_name ) )
      {
        html_utilities.html_princ( variable_name );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
        html_utilities.html_princ( variable_name );
        html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      }
      _csetf_hcs_last_idx( printer, non_variable_idx );
    }
    if( NIL != non_variable_idx )
    {
      _csetf_hcs_variable_idx( printer, html_cycl_string_variable_index( hcs_string( printer ), non_variable_idx ) );
    }
    else
    {
      _csetf_hcs_variable_idx( printer, NIL );
    }
    return printer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 11556L)
  public static SubLObject hcs_handle_lt(final SubLObject printer)
  {
    hcs_print( printer, hcs_lt_idx( printer ), T );
    final SubLObject gt_idx = hcs_find( printer, Characters.CHAR_greater, hcs_lt_idx( printer ) );
    if( NIL != gt_idx )
    {
      final SubLObject tag_start_idx = ( NIL != Characters.charE( Characters.CHAR_slash, Strings.sublisp_char( hcs_string( printer ), Numbers.add( hcs_lt_idx( printer ), ONE_INTEGER ) ) ) ) ? TWO_INTEGER : ONE_INTEGER;
      final SubLObject tag = Sequences.subseq( hcs_string( printer ), Numbers.add( hcs_lt_idx( printer ), tag_start_idx ), gt_idx );
      if( NIL != subl_promotions.memberP( Strings.string_downcase( string_utilities.trim_whitespace( tag ), UNPROVIDED, UNPROVIDED ), $cycl_string_allowable_html_tags$.getGlobalValue(), Symbols.symbol_function(
          $sym63$STRING_ ), UNPROVIDED ) )
      {
        html_utilities.html_markup( $str64$_ );
        if( TWO_INTEGER.eql( tag_start_idx ) )
        {
          html_utilities.html_princ( $str65$_ );
        }
        html_utilities.html_markup( tag );
        html_utilities.html_markup( $str66$_ );
        if( NIL != Strings.string_equal( tag, $str67$code, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Strings.string_equal( tag, $str68$pre, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          if( TWO_INTEGER.eql( tag_start_idx ) )
          {
            _csetf_hcs_inside_cycl_tagP( printer, NIL );
          }
          else
          {
            _csetf_hcs_inside_cycl_tagP( printer, T );
          }
        }
        _csetf_hcs_last_idx( printer, Numbers.add( gt_idx, ONE_INTEGER ) );
      }
    }
    _csetf_hcs_lt_idx( printer, hcs_find( printer, Characters.CHAR_less, Numbers.add( hcs_lt_idx( printer ), ONE_INTEGER ) ) );
    return printer;
  }

  public static SubLObject declare_html_cycl_string_printer_file()
  {
    SubLFiles.declareFunction( me, "html_cycl_string_printer_print_function_trampoline", "HTML-CYCL-STRING-PRINTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "html_cycl_string_printer_p", "HTML-CYCL-STRING-PRINTER-P", 1, 0, false );
    new $html_cycl_string_printer_p$UnaryFunction();
    SubLFiles.declareFunction( me, "hcs_string", "HCS-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_length", "HCS-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_last_idx", "HCS-LAST-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_inside_cycl_tagP", "HCS-INSIDE-CYCL-TAG?", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_hash_idx", "HCS-HASH-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_colon_idx", "HCS-COLON-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_lt_idx", "HCS-LT-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_variable_idx", "HCS-VARIABLE-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_url_idx", "HCS-URL-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_url_end_idx", "HCS-URL-END-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_link_function", "HCS-LINK-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_require_exactP", "HCS-REQUIRE-EXACT?", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_string", "_CSETF-HCS-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_length", "_CSETF-HCS-LENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_last_idx", "_CSETF-HCS-LAST-IDX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_inside_cycl_tagP", "_CSETF-HCS-INSIDE-CYCL-TAG?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_hash_idx", "_CSETF-HCS-HASH-IDX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_colon_idx", "_CSETF-HCS-COLON-IDX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_lt_idx", "_CSETF-HCS-LT-IDX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_variable_idx", "_CSETF-HCS-VARIABLE-IDX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_url_idx", "_CSETF-HCS-URL-IDX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_url_end_idx", "_CSETF-HCS-URL-END-IDX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_link_function", "_CSETF-HCS-LINK-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hcs_require_exactP", "_CSETF-HCS-REQUIRE-EXACT?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_html_cycl_string_printer", "MAKE-HTML-CYCL-STRING-PRINTER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_html_cycl_string_printer", "VISIT-DEFSTRUCT-HTML-CYCL-STRING-PRINTER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_html_cycl_string_printer_method", "VISIT-DEFSTRUCT-OBJECT-HTML-CYCL-STRING-PRINTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_html_cycl_string_printer", "PRINT-HTML-CYCL-STRING-PRINTER", 3, 0, false );
    SubLFiles.declareFunction( me, "new_html_cycl_string_printer", "NEW-HTML-CYCL-STRING-PRINTER", 1, 2, false );
    SubLFiles.declareFunction( me, "html_cycl_string_printer_done_p", "HTML-CYCL-STRING-PRINTER-DONE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "html_cycl_string_printer_print_next", "HTML-CYCL-STRING-PRINTER-PRINT-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "html_cycl_string_variable_index", "HTML-CYCL-STRING-VARIABLE-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "print_url_with_tag", "PRINT-URL-WITH-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "print_embedded_constant", "PRINT-EMBEDDED-CONSTANT", 3, 2, false );
    SubLFiles.declareFunction( me, "hcs_find", "HCS-FIND", 3, 0, false );
    SubLFiles.declareFunction( me, "hcs_set_colon_idx", "HCS-SET-COLON-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_set_hash_idx", "HCS-SET-HASH-IDX", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_print", "HCS-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "hcs_handle_colon", "HCS-HANDLE-COLON", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_handle_hash", "HCS-HANDLE-HASH", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_handle_variable", "HCS-HANDLE-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "hcs_handle_lt", "HCS-HANDLE-LT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_html_cycl_string_printer_file()
  {
    $dtp_html_cycl_string_printer$ = SubLFiles.defconstant( "*DTP-HTML-CYCL-STRING-PRINTER*", $sym0$HTML_CYCL_STRING_PRINTER );
    $embedded_constant_suffix_strings$ = SubLFiles.deflexical( "*EMBEDDED-CONSTANT-SUFFIX-STRINGS*", $list58 );
    $cycl_string_allowable_html_tags$ = SubLFiles.deflexical( "*CYCL-STRING-ALLOWABLE-HTML-TAGS*", $list60 );
    $html_large_string_limit$ = SubLFiles.defparameter( "*HTML-LARGE-STRING-LIMIT*", $int61$4096 );
    return NIL;
  }

  public static SubLObject setup_html_cycl_string_printer_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_html_cycl_string_printer$.getGlobalValue(), Symbols.symbol_function(
        $sym7$HTML_CYCL_STRING_PRINTER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$HCS_STRING, $sym10$_CSETF_HCS_STRING );
    Structures.def_csetf( $sym11$HCS_LENGTH, $sym12$_CSETF_HCS_LENGTH );
    Structures.def_csetf( $sym13$HCS_LAST_IDX, $sym14$_CSETF_HCS_LAST_IDX );
    Structures.def_csetf( $sym15$HCS_INSIDE_CYCL_TAG_, $sym16$_CSETF_HCS_INSIDE_CYCL_TAG_ );
    Structures.def_csetf( $sym17$HCS_HASH_IDX, $sym18$_CSETF_HCS_HASH_IDX );
    Structures.def_csetf( $sym19$HCS_COLON_IDX, $sym20$_CSETF_HCS_COLON_IDX );
    Structures.def_csetf( $sym21$HCS_LT_IDX, $sym22$_CSETF_HCS_LT_IDX );
    Structures.def_csetf( $sym23$HCS_VARIABLE_IDX, $sym24$_CSETF_HCS_VARIABLE_IDX );
    Structures.def_csetf( $sym25$HCS_URL_IDX, $sym26$_CSETF_HCS_URL_IDX );
    Structures.def_csetf( $sym27$HCS_URL_END_IDX, $sym28$_CSETF_HCS_URL_END_IDX );
    Structures.def_csetf( $sym29$HCS_LINK_FUNCTION, $sym30$_CSETF_HCS_LINK_FUNCTION );
    Structures.def_csetf( $sym31$HCS_REQUIRE_EXACT_, $sym32$_CSETF_HCS_REQUIRE_EXACT_ );
    Equality.identity( $sym0$HTML_CYCL_STRING_PRINTER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_html_cycl_string_printer$.getGlobalValue(), Symbols.symbol_function(
        $sym50$VISIT_DEFSTRUCT_OBJECT_HTML_CYCL_STRING_PRINTER_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym6$PRINT_HTML_CYCL_STRING_PRINTER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_html_cycl_string_printer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_html_cycl_string_printer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_html_cycl_string_printer_file();
  }
  static
  {
    me = new html_cycl_string_printer();
    $dtp_html_cycl_string_printer$ = null;
    $embedded_constant_suffix_strings$ = null;
    $cycl_string_allowable_html_tags$ = null;
    $html_large_string_limit$ = null;
    $sym0$HTML_CYCL_STRING_PRINTER = makeSymbol( "HTML-CYCL-STRING-PRINTER" );
    $sym1$HTML_CYCL_STRING_PRINTER_P = makeSymbol( "HTML-CYCL-STRING-PRINTER-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "STRING" ), makeSymbol( "LENGTH" ), makeSymbol( "LAST-IDX" ), makeSymbol( "INSIDE-CYCL-TAG?" ), makeSymbol( "HASH-IDX" ), makeSymbol( "COLON-IDX" ), makeSymbol(
        "LT-IDX" ), makeSymbol( "VARIABLE-IDX" ), makeSymbol( "URL-IDX" ), makeSymbol( "URL-END-IDX" ), makeSymbol( "LINK-FUNCTION" ), makeSymbol( "REQUIRE-EXACT?" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "STRING" ), makeKeyword( "LENGTH" ), makeKeyword( "LAST-IDX" ), makeKeyword( "INSIDE-CYCL-TAG?" ), makeKeyword( "HASH-IDX" ), makeKeyword( "COLON-IDX" ),
      makeKeyword( "LT-IDX" ), makeKeyword( "VARIABLE-IDX" ), makeKeyword( "URL-IDX" ), makeKeyword( "URL-END-IDX" ), makeKeyword( "LINK-FUNCTION" ), makeKeyword( "REQUIRE-EXACT?" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "HCS-STRING" ), makeSymbol( "HCS-LENGTH" ), makeSymbol( "HCS-LAST-IDX" ), makeSymbol( "HCS-INSIDE-CYCL-TAG?" ), makeSymbol( "HCS-HASH-IDX" ), makeSymbol(
        "HCS-COLON-IDX" ), makeSymbol( "HCS-LT-IDX" ), makeSymbol( "HCS-VARIABLE-IDX" ), makeSymbol( "HCS-URL-IDX" ), makeSymbol( "HCS-URL-END-IDX" ), makeSymbol( "HCS-LINK-FUNCTION" ), makeSymbol( "HCS-REQUIRE-EXACT?" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-HCS-STRING" ), makeSymbol( "_CSETF-HCS-LENGTH" ), makeSymbol( "_CSETF-HCS-LAST-IDX" ), makeSymbol( "_CSETF-HCS-INSIDE-CYCL-TAG?" ), makeSymbol(
        "_CSETF-HCS-HASH-IDX" ), makeSymbol( "_CSETF-HCS-COLON-IDX" ), makeSymbol( "_CSETF-HCS-LT-IDX" ), makeSymbol( "_CSETF-HCS-VARIABLE-IDX" ), makeSymbol( "_CSETF-HCS-URL-IDX" ), makeSymbol(
            "_CSETF-HCS-URL-END-IDX" ), makeSymbol( "_CSETF-HCS-LINK-FUNCTION" ), makeSymbol( "_CSETF-HCS-REQUIRE-EXACT?" )
    } );
    $sym6$PRINT_HTML_CYCL_STRING_PRINTER = makeSymbol( "PRINT-HTML-CYCL-STRING-PRINTER" );
    $sym7$HTML_CYCL_STRING_PRINTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "HTML-CYCL-STRING-PRINTER-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "HTML-CYCL-STRING-PRINTER-P" ) );
    $sym9$HCS_STRING = makeSymbol( "HCS-STRING" );
    $sym10$_CSETF_HCS_STRING = makeSymbol( "_CSETF-HCS-STRING" );
    $sym11$HCS_LENGTH = makeSymbol( "HCS-LENGTH" );
    $sym12$_CSETF_HCS_LENGTH = makeSymbol( "_CSETF-HCS-LENGTH" );
    $sym13$HCS_LAST_IDX = makeSymbol( "HCS-LAST-IDX" );
    $sym14$_CSETF_HCS_LAST_IDX = makeSymbol( "_CSETF-HCS-LAST-IDX" );
    $sym15$HCS_INSIDE_CYCL_TAG_ = makeSymbol( "HCS-INSIDE-CYCL-TAG?" );
    $sym16$_CSETF_HCS_INSIDE_CYCL_TAG_ = makeSymbol( "_CSETF-HCS-INSIDE-CYCL-TAG?" );
    $sym17$HCS_HASH_IDX = makeSymbol( "HCS-HASH-IDX" );
    $sym18$_CSETF_HCS_HASH_IDX = makeSymbol( "_CSETF-HCS-HASH-IDX" );
    $sym19$HCS_COLON_IDX = makeSymbol( "HCS-COLON-IDX" );
    $sym20$_CSETF_HCS_COLON_IDX = makeSymbol( "_CSETF-HCS-COLON-IDX" );
    $sym21$HCS_LT_IDX = makeSymbol( "HCS-LT-IDX" );
    $sym22$_CSETF_HCS_LT_IDX = makeSymbol( "_CSETF-HCS-LT-IDX" );
    $sym23$HCS_VARIABLE_IDX = makeSymbol( "HCS-VARIABLE-IDX" );
    $sym24$_CSETF_HCS_VARIABLE_IDX = makeSymbol( "_CSETF-HCS-VARIABLE-IDX" );
    $sym25$HCS_URL_IDX = makeSymbol( "HCS-URL-IDX" );
    $sym26$_CSETF_HCS_URL_IDX = makeSymbol( "_CSETF-HCS-URL-IDX" );
    $sym27$HCS_URL_END_IDX = makeSymbol( "HCS-URL-END-IDX" );
    $sym28$_CSETF_HCS_URL_END_IDX = makeSymbol( "_CSETF-HCS-URL-END-IDX" );
    $sym29$HCS_LINK_FUNCTION = makeSymbol( "HCS-LINK-FUNCTION" );
    $sym30$_CSETF_HCS_LINK_FUNCTION = makeSymbol( "_CSETF-HCS-LINK-FUNCTION" );
    $sym31$HCS_REQUIRE_EXACT_ = makeSymbol( "HCS-REQUIRE-EXACT?" );
    $sym32$_CSETF_HCS_REQUIRE_EXACT_ = makeSymbol( "_CSETF-HCS-REQUIRE-EXACT?" );
    $kw33$STRING = makeKeyword( "STRING" );
    $kw34$LENGTH = makeKeyword( "LENGTH" );
    $kw35$LAST_IDX = makeKeyword( "LAST-IDX" );
    $kw36$INSIDE_CYCL_TAG_ = makeKeyword( "INSIDE-CYCL-TAG?" );
    $kw37$HASH_IDX = makeKeyword( "HASH-IDX" );
    $kw38$COLON_IDX = makeKeyword( "COLON-IDX" );
    $kw39$LT_IDX = makeKeyword( "LT-IDX" );
    $kw40$VARIABLE_IDX = makeKeyword( "VARIABLE-IDX" );
    $kw41$URL_IDX = makeKeyword( "URL-IDX" );
    $kw42$URL_END_IDX = makeKeyword( "URL-END-IDX" );
    $kw43$LINK_FUNCTION = makeKeyword( "LINK-FUNCTION" );
    $kw44$REQUIRE_EXACT_ = makeKeyword( "REQUIRE-EXACT?" );
    $str45$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw46$BEGIN = makeKeyword( "BEGIN" );
    $sym47$MAKE_HTML_CYCL_STRING_PRINTER = makeSymbol( "MAKE-HTML-CYCL-STRING-PRINTER" );
    $kw48$SLOT = makeKeyword( "SLOT" );
    $kw49$END = makeKeyword( "END" );
    $sym50$VISIT_DEFSTRUCT_OBJECT_HTML_CYCL_STRING_PRINTER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-HTML-CYCL-STRING-PRINTER-METHOD" );
    $str51$_HTML_CYCL_STRING_PRINTER_ = makeString( "<HTML-CYCL-STRING-PRINTER>" );
    $sym52$CB_FORM = makeSymbol( "CB-FORM" );
    $kw53$DONE = makeKeyword( "DONE" );
    $sym54$MIN = makeSymbol( "MIN" );
    $sym55$NULL = makeSymbol( "NULL" );
    $str56$__ = makeString( ":?" );
    $str57$_a_href___S__A__a_ = makeString( "<a href= ~S>~A</a>" );
    $list58 = ConsesLow.list( makeString( "es" ), makeString( "es:" ) );
    $sym59$VALID_CONSTANT_NAME_CHAR_P = makeSymbol( "VALID-CONSTANT-NAME-CHAR-P" );
    $list60 = ConsesLow.list( new SubLObject[] { makeString( "i" ), makeString( "b" ), makeString( "sub" ), makeString( "sup" ), makeString( "pre" ), makeString( "code" ), makeString( "blockquote" ), makeString( "p" ),
      makeString( "br" )
    } );
    $int61$4096 = makeInteger( 4096 );
    $sym62$EL_VARIABLE_CHAR_ = makeSymbol( "EL-VARIABLE-CHAR?" );
    $sym63$STRING_ = makeSymbol( "STRING=" );
    $str64$_ = makeString( "<" );
    $str65$_ = makeString( "/" );
    $str66$_ = makeString( ">" );
    $str67$code = makeString( "code" );
    $str68$pre = makeString( "pre" );
  }

  public static final class $html_cycl_string_printer_native
      extends
        SubLStructNative
  {
    public SubLObject $string;
    public SubLObject $length;
    public SubLObject $last_idx;
    public SubLObject $inside_cycl_tagP;
    public SubLObject $hash_idx;
    public SubLObject $colon_idx;
    public SubLObject $lt_idx;
    public SubLObject $variable_idx;
    public SubLObject $url_idx;
    public SubLObject $url_end_idx;
    public SubLObject $link_function;
    public SubLObject $require_exactP;
    private static final SubLStructDeclNative structDecl;

    public $html_cycl_string_printer_native()
    {
      this.$string = CommonSymbols.NIL;
      this.$length = CommonSymbols.NIL;
      this.$last_idx = CommonSymbols.NIL;
      this.$inside_cycl_tagP = CommonSymbols.NIL;
      this.$hash_idx = CommonSymbols.NIL;
      this.$colon_idx = CommonSymbols.NIL;
      this.$lt_idx = CommonSymbols.NIL;
      this.$variable_idx = CommonSymbols.NIL;
      this.$url_idx = CommonSymbols.NIL;
      this.$url_end_idx = CommonSymbols.NIL;
      this.$link_function = CommonSymbols.NIL;
      this.$require_exactP = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $html_cycl_string_printer_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$string;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$length;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$last_idx;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$inside_cycl_tagP;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$hash_idx;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$colon_idx;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$lt_idx;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$variable_idx;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$url_idx;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$url_end_idx;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$link_function;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$require_exactP;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$string = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$length = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$last_idx = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$inside_cycl_tagP = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$hash_idx = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$colon_idx = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$lt_idx = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$variable_idx = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$url_idx = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$url_end_idx = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$link_function = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$require_exactP = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $html_cycl_string_printer_native.class, $sym0$HTML_CYCL_STRING_PRINTER, $sym1$HTML_CYCL_STRING_PRINTER_P, $list2, $list3, new String[] { "$string", "$length",
        "$last_idx", "$inside_cycl_tagP", "$hash_idx", "$colon_idx", "$lt_idx", "$variable_idx", "$url_idx", "$url_end_idx", "$link_function", "$require_exactP"
      }, $list4, $list5, $sym6$PRINT_HTML_CYCL_STRING_PRINTER );
    }
  }

  public static final class $html_cycl_string_printer_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $html_cycl_string_printer_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "HTML-CYCL-STRING-PRINTER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return html_cycl_string_printer_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 203 ms
 * 
 */