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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_arghash
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.html_arghash";
  public static final String myFingerPrint = "b0731d562dcf1290ce7e0f707503dbbf861322974dac6c5f939a43fbf8a35864";
  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 4198L)
  private static SubLSymbol $arghash_types$;
  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 4604L)
  private static SubLSymbol $arghash_types_by_keyword$;
  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 4722L)
  private static SubLSymbol $arghash_types_by_character$;
  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLSymbol $dtp_arghash_type$;
  private static final SubLString $str0$_;
  private static final SubLSymbol $sym1$ARGHASH_TYPE;
  private static final SubLSymbol $sym2$ARGHASH_TYPE_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_ARGHASH_TYPE;
  private static final SubLSymbol $sym8$ARGHASH_TYPE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$ARGHASH_TYPE_NAME;
  private static final SubLSymbol $sym11$_CSETF_ARGHASH_TYPE_NAME;
  private static final SubLSymbol $sym12$ARGHASH_TYPE_KEYWORD;
  private static final SubLSymbol $sym13$_CSETF_ARGHASH_TYPE_KEYWORD;
  private static final SubLSymbol $sym14$ARGHASH_TYPE_CHARACTER;
  private static final SubLSymbol $sym15$_CSETF_ARGHASH_TYPE_CHARACTER;
  private static final SubLSymbol $sym16$ARGHASH_TYPE_STRING_VALIDATOR;
  private static final SubLSymbol $sym17$_CSETF_ARGHASH_TYPE_STRING_VALIDATOR;
  private static final SubLSymbol $sym18$ARGHASH_TYPE_STRING_TO_OBJECT_FN;
  private static final SubLSymbol $sym19$_CSETF_ARGHASH_TYPE_STRING_TO_OBJECT_FN;
  private static final SubLSymbol $sym20$ARGHASH_TYPE_OBJECT_DETECTOR;
  private static final SubLSymbol $sym21$_CSETF_ARGHASH_TYPE_OBJECT_DETECTOR;
  private static final SubLSymbol $sym22$ARGHASH_TYPE_OBJECT_TO_STRING_FN;
  private static final SubLSymbol $sym23$_CSETF_ARGHASH_TYPE_OBJECT_TO_STRING_FN;
  private static final SubLSymbol $sym24$ARGHASH_TYPE_PRIORITY;
  private static final SubLSymbol $sym25$_CSETF_ARGHASH_TYPE_PRIORITY;
  private static final SubLSymbol $kw26$NAME;
  private static final SubLSymbol $kw27$KEYWORD;
  private static final SubLSymbol $kw28$CHARACTER;
  private static final SubLSymbol $kw29$STRING_VALIDATOR;
  private static final SubLSymbol $kw30$STRING_TO_OBJECT_FN;
  private static final SubLSymbol $kw31$OBJECT_DETECTOR;
  private static final SubLSymbol $kw32$OBJECT_TO_STRING_FN;
  private static final SubLSymbol $kw33$PRIORITY;
  private static final SubLString $str34$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw35$BEGIN;
  private static final SubLSymbol $sym36$MAKE_ARGHASH_TYPE;
  private static final SubLSymbol $kw37$SLOT;
  private static final SubLSymbol $kw38$END;
  private static final SubLSymbol $sym39$VISIT_DEFSTRUCT_OBJECT_ARGHASH_TYPE_METHOD;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$NEW_ARGHASH_TYPE;
  private static final SubLSymbol $sym42$CLET;
  private static final SubLSymbol $sym43$QUOTE;
  private static final SubLSymbol $sym44$CSETF;
  private static final SubLSymbol $sym45$SETHASH;
  private static final SubLSymbol $sym46$_ARGHASH_TYPES_BY_KEYWORD_;
  private static final SubLSymbol $sym47$_ARGHASH_TYPES_BY_CHARACTER_;
  private static final SubLSymbol $sym48$CSETQ;
  private static final SubLSymbol $sym49$_ARGHASH_TYPES_;
  private static final SubLSymbol $sym50$CONS;
  private static final SubLSymbol $sym51$DELETE;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$_;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$KEYWORD;
  private static final SubLString $str56$_A;
  private static final SubLString $str57$;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$FORT;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$ASSERTION;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$INTEGER;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$BOOLEAN;
  private static final SubLString $str66$NIL;
  private static final SubLString $str67$nil;
  private static final SubLString $str68$t;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$LIST;
  private static final SubLString $str71$_;
  private static final SubLString $str72$_20;
  private static final SubLString $str73$_;
  private static final SubLSymbol $sym74$ARGHASH_PREFIXED_STRING_TO_OBJECT;
  private static final SubLSymbol $sym75$STRINGP;
  private static final SubLString $str76$_;
  private static final SubLString $str77$_;
  private static final SubLString $str78$_;
  private static final SubLSymbol $sym79$CCONCATENATE;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$EL_FORMULA;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$DEFAULT;
  private static final SubLSymbol $kw84$DEFAULT;
  private static final SubLString $str85$___A;
  private static final SubLInteger $int86$32;
  private static final SubLSymbol $kw87$JUST_FORT;
  private static final SubLSymbol $kw88$JUST_STRING;
  private static final SubLString $str89$_;
  private static final SubLString $str90$_;
  private static final SubLList $list91;
  private static final SubLList $list92;
  private static final SubLSymbol $kw93$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw94$TARGET;
  private static final SubLSymbol $kw95$SCRIPT;
  private static final SubLSymbol $kw96$STYLE;
  private static final SubLSymbol $sym97$HREF;
  private static final SubLSymbol $sym98$FORMAT;
  private static final SubLString $str99$_A__A;
  private static final SubLSymbol $sym100$_CYC_CGI_PROGRAM_;
  private static final SubLSymbol $sym101$HTML_ARGHASH_HREF;
  private static final SubLSymbol $sym102$HTML_FANCY_ANCHOR;
  private static final SubLSymbol $kw103$HREF;
  private static final SubLList $list104;
  private static final SubLList $list105;
  private static final SubLList $list106;
  private static final SubLSymbol $kw107$MULTIPLE;
  private static final SubLSymbol $kw108$SIZE;
  private static final SubLSymbol $kw109$ONCHANGE;
  private static final SubLSymbol $sym110$KEY_STRING;
  private static final SubLSymbol $sym111$ARGHASH_MAKE_KEY_STRING;
  private static final SubLSymbol $sym112$HTML_FANCY_SELECT;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$VALUE_STRING;
  private static final SubLSymbol $sym115$SELECTED;
  private static final SubLSymbol $sym116$MEMBER_EQUAL_;
  private static final SubLSymbol $sym117$GET_ARGHASH_VALUE_LIST;
  private static final SubLSymbol $sym118$ARGHASH_GET_STRING;
  private static final SubLSymbol $sym119$HTML_FANCY_OPTION;
  private static final SubLSymbol $kw120$SELECTED;
  private static final SubLSymbol $kw121$VALUE;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$VALUE;
  private static final SubLSymbol $sym124$VALUE_STRING;
  private static final SubLSymbol $sym125$HTML_ARGHASH_FANCY_SELECT;
  private static final SubLSymbol $sym126$CDOLIST_MULTIPLE;
  private static final SubLSymbol $sym127$HTML_ARGHASH_FANCY_OPTION;
  private static final SubLSymbol $sym128$HTML_PRINC;
  private static final SubLSymbol $kw129$BOOLEAN;
  private static final SubLString $str130$Complete;
  private static final SubLString $str131$virtual;
  private static final SubLSymbol $kw132$NBSP;
  private static final SubLSymbol $kw133$FORT;
  private static final SubLString $str134$Cyclify;
  private static final SubLString $str135$Clear;
  private static final SubLSymbol $kw136$EL_FORMULA;
  private static final SubLSymbol $kw137$INPUT_NAME;
  private static final SubLSymbol $kw138$COMPLETE_LABEL;
  private static final SubLSymbol $kw139$CYCLIFY_LABEL;
  private static final SubLSymbol $kw140$CLEAR_LABEL;
  private static final SubLSymbol $kw141$HEIGHT;
  private static final SubLSymbol $kw142$WIDTH;
  private static final SubLSymbol $sym143$GENERATE_PHRASE;
  private static final SubLString $str144$_NEW_FORT;
  private static final SubLString $str145$_STRING;
  private static final SubLString $str146$_NEW_STRING;
  private static final SubLString $str147$_UNDO;
  private static final SubLString $str148$_CANDIDATES;
  private static final SubLString $str149$_DONE;
  private static final SubLString $str150$_ERROR;
  private static final SubLString $str151$_2;
  private static final SubLString $str152$_;
  private static final SubLString $str153$onChange_javascript_this_form_sub;
  private static final SubLString $str154$___;
  private static final SubLString $str155$Undo;
  private static final SubLString $str156$Submit;
  private static final SubLSymbol $kw157$SUBMIT;
  private static final SubLSymbol $kw158$STRING;
  private static final SubLString $str159$_nl_fort_input_force_default_if_u;
  private static final SubLString $str160$___setting_to_;
  private static final SubLSymbol $sym161$TERMS_FOR_BROWSING;
  private static final SubLString $str162$_nl_fort_input_validate_;
  private static final SubLString $str163$___;
  private static final SubLString $str164$Case_1__clicked_undo_button;
  private static final SubLString $str165$Case_2__chose_fort_from_pulldown;
  private static final SubLString $str166$Case_3__text_typed_in__;
  private static final SubLSymbol $sym167$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const168$EverythingPSC;
  private static final SubLString $str169$Case_3a__No_parse_for___A_;
  private static final SubLString $str170$_called__;
  private static final SubLString $str171$__not_found_;
  private static final SubLString $str172$_;
  private static final SubLString $str173$Case_3b__One_parse_for___A_____A;
  private static final SubLString $str174$Case_3c__Many_parses_for___A_____;
  private static final SubLString $str175$Case_4__no_text_typed_in;
  private static final SubLString $str176$Case_5__fort_set__so_use_fort_as_;
  private static final SubLString $str177$Case_6__fallthrough_;
  private static final SubLString $str178$_REMOVE;
  private static final SubLString $str179$Remove;
  private static final SubLString $str180$_max_reached_;
  private static final SubLString $str181$_max_exceeded_;
  private static final SubLString $str182$_more_required_;
  private static final SubLSymbol $sym183$FORT_NAME;
  private static final SubLString $str184$_key_list_length_reached_;
  private static final SubLSymbol $sym185$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str186$X;

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 4844L)
  public static SubLObject print_arghash_type(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_level$.getDynamicValue( thread ) && depth.numG( print_high.$print_level$.getDynamicValue( thread ) ) )
    {
      print_high.princ( $str0$_, stream );
    }
    else if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      print_high.princ( arghash_type_name( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, NIL, NIL );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject arghash_type_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_arghash_type( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject arghash_type_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $arghash_type_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject arghash_type_name(final SubLObject v_object)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject arghash_type_keyword(final SubLObject v_object)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject arghash_type_character(final SubLObject v_object)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject arghash_type_string_validator(final SubLObject v_object)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject arghash_type_string_to_object_fn(final SubLObject v_object)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject arghash_type_object_detector(final SubLObject v_object)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject arghash_type_object_to_string_fn(final SubLObject v_object)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject arghash_type_priority(final SubLObject v_object)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject _csetf_arghash_type_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject _csetf_arghash_type_keyword(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject _csetf_arghash_type_character(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject _csetf_arghash_type_string_validator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject _csetf_arghash_type_string_to_object_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject _csetf_arghash_type_object_detector(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject _csetf_arghash_type_object_to_string_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject _csetf_arghash_type_priority(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arghash_type_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject make_arghash_type(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $arghash_type_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw26$NAME ) )
      {
        _csetf_arghash_type_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$KEYWORD ) )
      {
        _csetf_arghash_type_keyword( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$CHARACTER ) )
      {
        _csetf_arghash_type_character( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$STRING_VALIDATOR ) )
      {
        _csetf_arghash_type_string_validator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$STRING_TO_OBJECT_FN ) )
      {
        _csetf_arghash_type_string_to_object_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw31$OBJECT_DETECTOR ) )
      {
        _csetf_arghash_type_object_detector( v_new, current_value );
      }
      else if( pcase_var.eql( $kw32$OBJECT_TO_STRING_FN ) )
      {
        _csetf_arghash_type_object_to_string_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$PRIORITY ) )
      {
        _csetf_arghash_type_priority( v_new, current_value );
      }
      else
      {
        Errors.error( $str34$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject visit_defstruct_arghash_type(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw35$BEGIN, $sym36$MAKE_ARGHASH_TYPE, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw26$NAME, arghash_type_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw27$KEYWORD, arghash_type_keyword( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw28$CHARACTER, arghash_type_character( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw29$STRING_VALIDATOR, arghash_type_string_validator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw30$STRING_TO_OBJECT_FN, arghash_type_string_to_object_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw31$OBJECT_DETECTOR, arghash_type_object_detector( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw32$OBJECT_TO_STRING_FN, arghash_type_object_to_string_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw33$PRIORITY, arghash_type_priority( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$END, $sym36$MAKE_ARGHASH_TYPE, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
  public static SubLObject visit_defstruct_object_arghash_type_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_arghash_type( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5294L)
  public static SubLObject defarghash_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    name = current.first();
    final SubLObject arglist;
    current = ( arglist = current.rest() );
    final SubLObject new_arghash_type = $sym41$NEW_ARGHASH_TYPE;
    return ConsesLow.list( $sym42$CLET, ConsesLow.list( ConsesLow.list( new_arghash_type, ConsesLow.list( $sym36$MAKE_ARGHASH_TYPE, ConsesLow.list( $sym43$QUOTE, arglist ) ) ) ), ConsesLow.list( $sym44$CSETF, ConsesLow
        .list( $sym10$ARGHASH_TYPE_NAME, new_arghash_type ), ConsesLow.list( $sym43$QUOTE, name ) ), ConsesLow.list( $sym45$SETHASH, ConsesLow.list( $sym12$ARGHASH_TYPE_KEYWORD, new_arghash_type ),
            $sym46$_ARGHASH_TYPES_BY_KEYWORD_, new_arghash_type ), ConsesLow.list( $sym45$SETHASH, ConsesLow.list( $sym14$ARGHASH_TYPE_CHARACTER, new_arghash_type ), $sym47$_ARGHASH_TYPES_BY_CHARACTER_,
                new_arghash_type ), ConsesLow.list( $sym48$CSETQ, $sym49$_ARGHASH_TYPES_, ConsesLow.list( $sym50$CONS, new_arghash_type, ConsesLow.listS( $sym51$DELETE, ConsesLow.list( $sym43$QUOTE, name ),
                    $list52 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5868L)
  public static SubLObject arghash_keyword_to_arghash_type(final SubLObject keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( keyword, $arghash_types_by_keyword$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5981L)
  public static SubLObject arghash_character_to_arghash_type(final SubLObject v_char)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( v_char, $arghash_types_by_character$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 6092L)
  public static SubLObject arghash_keywordP(final SubLObject keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Hashtables.gethash( keyword, $arghash_types_by_keyword$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 6222L)
  public static SubLObject arghash_types()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sort.sort( conses_high.copy_list( $arghash_types$.getDynamicValue( thread ) ), Symbols.symbol_function( $sym53$_ ), $sym24$ARGHASH_TYPE_PRIORITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 6327L)
  public static SubLObject arghash_string_to_keyword(final SubLObject string)
  {
    return string_utilities.keyword_from_string( Strings.string_upcase( string, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 6515L)
  public static SubLObject arghash_keyword_to_string(final SubLObject keyword)
  {
    return Strings.string_downcase( string_utilities.string_from_keyword( keyword ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 6896L)
  public static SubLObject arghash_fort_to_string(final SubLObject fort)
  {
    if( NIL != constant_handles.constant_p( fort ) )
    {
      return PrintLow.format( NIL, $str56$_A, constants_high.constant_internal_id( fort ) );
    }
    if( NIL != nart_handles.nart_p( fort ) )
    {
      return PrintLow.format( NIL, $str56$_A, Numbers.minus( nart_handles.nart_id( fort ) ) );
    }
    return $str57$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 7119L)
  public static SubLObject arghash_string_to_fort(final SubLObject string)
  {
    SubLObject result = NIL;
    if( NIL != number_utilities.number_string_p( string ) )
    {
      final SubLObject v_int = reader.parse_integer( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( v_int.numGE( ZERO_INTEGER ) )
      {
        result = constants_high.find_constant_by_internal_id( v_int );
      }
      else if( v_int.numL( ZERO_INTEGER ) )
      {
        result = nart_handles.find_nart_by_id( Numbers.minus( v_int ) );
      }
    }
    else
    {
      result = cb_utilities.cb_guess_fort( string, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 7729L)
  public static SubLObject arghash_assertion_to_string(final SubLObject assertion)
  {
    return PrintLow.format( NIL, $str56$_A, assertion_handles.assertion_id( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 7838L)
  public static SubLObject arghash_string_to_assertion(final SubLObject string)
  {
    SubLObject result = NIL;
    if( NIL != number_utilities.number_string_p( string ) )
    {
      final SubLObject v_int = reader.parse_integer( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      result = assertion_handles.find_assertion_by_id( v_int );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 8629L)
  public static SubLObject arghash_string_to_integer(final SubLObject string)
  {
    return reader.parse_integer( string, ZERO_INTEGER, NIL, TEN_INTEGER, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 8724L)
  public static SubLObject arghash_integer_to_string(final SubLObject integer)
  {
    return PrintLow.format( NIL, $str56$_A, integer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 9111L)
  public static SubLObject arghash_boolean_string_to_boolean(final SubLObject string)
  {
    if( NIL == string || $str66$NIL.equal( Strings.string_upcase( string, UNPROVIDED, UNPROVIDED ) ) || ZERO_INTEGER.eql( reader.parse_integer( string, ZERO_INTEGER, NIL, TEN_INTEGER, T ) ) || NIL != string_utilities
        .null_stringP( string ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 9347L)
  public static SubLObject arghash_boolean_detector(final SubLObject v_object)
  {
    if( v_object == T || v_object == NIL )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 9480L)
  public static SubLObject arghash_boolean_to_boolean_string(final SubLObject v_boolean)
  {
    if( NIL == v_boolean )
    {
      return $str67$nil;
    }
    return $str68$t;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 9850L)
  public static SubLObject arghash_prefixed_string_to_object(final SubLObject prefixed_string)
  {
    final SubLObject arghash_type = arghash_character_to_arghash_type( Strings.sublisp_char( prefixed_string, ZERO_INTEGER ) );
    SubLObject string = string_utilities.substring( prefixed_string, ONE_INTEGER, UNPROVIDED );
    string = string_utilities.string_substitute( $str71$_, $str72$_20, string, UNPROVIDED );
    return arghash_handle_string( string, arghash_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 10158L)
  public static SubLObject arghash_string_to_list(SubLObject string)
  {
    string = string_utilities.string_substitute( $str72$_20, $str71$_, string, UNPROVIDED );
    string = string_utilities.string_substitute( $str71$_, $str73$_, string, UNPROVIDED );
    final SubLObject string_list = string_utilities.listify_string( string, UNPROVIDED ).first();
    return list_utilities.tree_gather_transformations( $sym74$ARGHASH_PREFIXED_STRING_TO_OBJECT, string_list, Symbols.symbol_function( $sym75$STRINGP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 10468L)
  public static SubLObject arghash_list_to_string(final SubLObject list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == list )
    {
      return $str57$;
    }
    SubLObject result_list = NIL;
    result_list = ConsesLow.cons( $str76$_, result_list );
    SubLObject cdolist_list_var = list;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( elem.isList() )
      {
        result_list = ConsesLow.cons( arghash_list_to_string( elem ), result_list );
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject elem_type_char = arghash_get_handler_char_and_string( elem, UNPROVIDED );
        final SubLObject elem_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != elem_type_char )
        {
          result_list = ConsesLow.cons( Sequences.cconcatenate( Strings.make_string( ONE_INTEGER, elem_type_char ), elem_string ), result_list );
        }
        else
        {
          result_list = ConsesLow.cons( Sequences.cconcatenate( $str77$_, elem_string ), result_list );
        }
      }
      result_list = ConsesLow.cons( $str73$_, result_list );
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    result_list = ConsesLow.cons( $str78$_, result_list );
    return Functions.apply( Symbols.symbol_function( $sym79$CCONCATENATE ), Sequences.nreverse( result_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 11434L)
  public static SubLObject arghash_string_to_el_formula(final SubLObject string)
  {
    return cb_form_widgets.cb_determine_el_sentence( cb_form_widgets.cb_normalize_formula_string( string ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 11566L)
  public static SubLObject arghash_el_formula_to_string(final SubLObject el_formula)
  {
    return format_cycl_expression.format_cycl_expression_to_string( el_formula, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 11931L)
  public static SubLObject arghash_default_to_string(final SubLObject v_object)
  {
    if( NIL == v_object )
    {
      return $str57$;
    }
    return string_utilities.to_lisp_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 12059L)
  public static SubLObject arghash_handle_string(final SubLObject string, final SubLObject arghash_type)
  {
    if( !string.isString() )
    {
      return Values.values( NIL, NIL );
    }
    if( NIL == arghash_type_p( arghash_type ) )
    {
      return Values.values( string, NIL );
    }
    if( arghash_type_string_validator( arghash_type ).isFunctionSpec() && NIL == Functions.funcall( arghash_type_string_validator( arghash_type ), string ) )
    {
      return Values.values( string, NIL );
    }
    return Functions.funcall( arghash_type_string_to_object_fn( arghash_type ), string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 12767L)
  public static SubLObject arghash_parse_key_and_value(SubLObject key_string, SubLObject value_string)
  {
    if( value_string == UNPROVIDED )
    {
      value_string = NIL;
    }
    final SubLObject key_length = Sequences.length( key_string );
    final SubLObject key_handler_char = ZERO_INTEGER.numL( key_length ) ? Sequences.elt( key_string, ZERO_INTEGER ) : NIL;
    final SubLObject value_handler_char = ONE_INTEGER.numL( key_length ) ? Sequences.elt( key_string, ONE_INTEGER ) : NIL;
    final SubLObject key_arghash_type = arghash_character_to_arghash_type( key_handler_char );
    final SubLObject value_arghash_type = arghash_character_to_arghash_type( value_handler_char );
    SubLObject key = key_string;
    SubLObject value = value_string;
    if( NIL != arghash_type_p( key_arghash_type ) )
    {
      if( NIL != arghash_type_p( value_arghash_type ) )
      {
        key_string = Sequences.subseq( key_string, TWO_INTEGER, UNPROVIDED );
      }
      else
      {
        key_string = Sequences.subseq( key_string, ONE_INTEGER, UNPROVIDED );
      }
    }
    if( NIL != arghash_type_p( key_arghash_type ) )
    {
      key = arghash_handle_string( key_string, key_arghash_type );
    }
    if( NIL != arghash_type_p( value_arghash_type ) )
    {
      value = arghash_handle_string( value_string, value_arghash_type );
    }
    return Values.values( key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 14046L)
  public static SubLObject arghash_get_handler_char_and_string(final SubLObject v_object, SubLObject object_type)
  {
    if( object_type == UNPROVIDED )
    {
      object_type = NIL;
    }
    if( NIL != object_type && object_type != $kw84$DEFAULT )
    {
      final SubLObject arghash_type = arghash_keyword_to_arghash_type( object_type );
      if( NIL != arghash_type_p( arghash_type ) )
      {
        return Values.values( arghash_type_character( arghash_type ), Functions.funcall( arghash_type_object_to_string_fn( arghash_type ), v_object ) );
      }
    }
    SubLObject cdolist_list_var = arghash_types();
    SubLObject arghash_type2 = NIL;
    arghash_type2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arghash_type_object_detector( arghash_type2 ).isFunctionSpec() && NIL != Functions.funcall( arghash_type_object_detector( arghash_type2 ), v_object ) && arghash_type_object_to_string_fn( arghash_type2 )
          .isFunctionSpec() )
      {
        return Values.values( arghash_type_character( arghash_type2 ), Functions.funcall( arghash_type_object_to_string_fn( arghash_type2 ), v_object ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arghash_type2 = cdolist_list_var.first();
    }
    return Values.values( Characters.CHAR_underbar, PrintLow.format( NIL, $str85$___A, v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 15147L)
  public static SubLObject arghash_get_string(final SubLObject v_object, SubLObject object_type)
  {
    if( object_type == UNPROVIDED )
    {
      object_type = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject handler_char = arghash_get_handler_char_and_string( v_object, object_type );
    final SubLObject string = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 15450L)
  public static SubLObject arghash_make_key_and_value_strings(final SubLObject key, final SubLObject value, SubLObject value_type)
  {
    if( value_type == UNPROVIDED )
    {
      value_type = $kw84$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject key_type_char = arghash_get_handler_char_and_string( key, UNPROVIDED );
    SubLObject key_string = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject value_type_char = arghash_get_handler_char_and_string( value, value_type );
    final SubLObject value_string = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != key_type_char )
    {
      if( NIL == value_type_char )
      {
        key_string = Sequences.cconcatenate( Strings.make_string( ONE_INTEGER, key_type_char ), key_string );
      }
      else
      {
        key_string = Sequences.cconcatenate( Strings.make_string( ONE_INTEGER, key_type_char ), new SubLObject[] { Strings.make_string( ONE_INTEGER, value_type_char ), key_string
        } );
      }
    }
    return Values.values( key_string, value_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 16433L)
  public static SubLObject arghash_make_key_string(final SubLObject key, SubLObject value_type)
  {
    if( value_type == UNPROVIDED )
    {
      value_type = $kw84$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject key_type_char = arghash_get_handler_char_and_string( key, UNPROVIDED );
    SubLObject key_string = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject value_arghash_type = arghash_keyword_to_arghash_type( value_type );
    SubLObject value_type_char = NIL;
    if( NIL != arghash_type_p( value_arghash_type ) )
    {
      value_type_char = arghash_type_character( value_arghash_type );
    }
    if( NIL != key_type_char )
    {
      if( NIL == value_type_char )
      {
        key_string = Sequences.cconcatenate( Strings.make_string( ONE_INTEGER, key_type_char ), new SubLObject[] { Strings.make_string( ONE_INTEGER, Characters.CHAR_underbar ), key_string
        } );
      }
      else
      {
        key_string = Sequences.cconcatenate( Strings.make_string( ONE_INTEGER, key_type_char ), new SubLObject[] { Strings.make_string( ONE_INTEGER, value_type_char ), key_string
        } );
      }
    }
    return key_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 17271L)
  public static SubLObject exists_arghash_valueP(final SubLObject key, final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject value = Hashtables.gethash( key, arghash, UNPROVIDED );
    final SubLObject existsP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return existsP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 17664L)
  public static SubLObject get_arghash_value(final SubLObject key, final SubLObject arghash)
  {
    return hash_table_utilities.gethash_first( key, arghash, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 17749L)
  public static SubLObject get_arghash_value_list(final SubLObject key, final SubLObject arghash)
  {
    return Hashtables.gethash( key, arghash, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 17833L)
  public static SubLObject set_arghash_value(final SubLObject key, final SubLObject arghash, final SubLObject value)
  {
    return hash_table_utilities.sethash_first( key, arghash, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 17930L)
  public static SubLObject set_arghash_value_list(final SubLObject key, final SubLObject arghash, final SubLObject value)
  {
    return Hashtables.sethash( key, arghash, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18026L)
  public static SubLObject push_arghash_value(final SubLObject key, final SubLObject value, final SubLObject arghash)
  {
    return hash_table_utilities.push_to_end_hash( key, value, arghash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18127L)
  public static SubLObject pushnew_arghash_value(final SubLObject key, final SubLObject value, final SubLObject arghash)
  {
    return hash_table_utilities.pushnew_hash( key, value, arghash, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18227L)
  public static SubLObject rem_arghash_value(final SubLObject key, final SubLObject arghash)
  {
    return Hashtables.remhash( key, arghash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18306L)
  public static SubLObject rem_arghash_values(final SubLObject key_list, final SubLObject arghash)
  {
    SubLObject cdolist_list_var = key_list;
    SubLObject key = NIL;
    key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Hashtables.remhash( key, arghash );
      cdolist_list_var = cdolist_list_var.rest();
      key = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18426L)
  public static SubLObject rem_arghash_values_inverse(final SubLObject neg_key_list, final SubLObject arghash)
  {
    SubLObject k = NIL;
    SubLObject v = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( arghash );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        k = Hashtables.getEntryKey( cdohash_entry );
        v = Hashtables.getEntryValue( cdohash_entry );
        if( NIL == subl_promotions.memberP( k, neg_key_list, UNPROVIDED, UNPROVIDED ) )
        {
          Hashtables.remhash( k, arghash );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18611L)
  public static SubLObject new_arghash(SubLObject size)
  {
    if( size == UNPROVIDED )
    {
      size = $int86$32;
    }
    return Hashtables.make_hash_table( size, Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18783L)
  public static SubLObject arghash_p(final SubLObject v_object)
  {
    return Types.hash_table_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18849L)
  public static SubLObject copy_arghash(final SubLObject arghash)
  {
    final SubLObject new_arghash = new_arghash( UNPROVIDED );
    hash_table_utilities.copy_hash_table_values_into( arghash, new_arghash );
    return new_arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 19004L)
  public static SubLObject get_arghash_keys(final SubLObject arghash)
  {
    return hash_table_utilities.hash_table_keys( arghash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 19082L)
  public static SubLObject arglist_to_arghash(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg_hash = new_arghash( $int86$32 );
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isString() )
      {
        final SubLObject possible_fort = cb_utilities.cb_guess_fort( arg, UNPROVIDED );
        if( NIL != possible_fort )
        {
          hash_table_utilities.push_to_end_hash( $kw87$JUST_FORT, possible_fort, arg_hash );
        }
        else
        {
          hash_table_utilities.push_to_end_hash( $kw88$JUST_STRING, arg, arg_hash );
        }
      }
      if( arg.isList() )
      {
        final SubLObject key_string = arg.first();
        final SubLObject value_string = conses_high.second( arg );
        thread.resetMultipleValues();
        final SubLObject key = arghash_parse_key_and_value( key_string, value_string );
        final SubLObject value = thread.secondMultipleValue();
        thread.resetMultipleValues();
        hash_table_utilities.push_to_end_hash( key, value, arg_hash );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return arg_hash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 20284L)
  public static SubLObject argassoc_to_arghash(final SubLObject argassoc)
  {
    final SubLObject arghash = new_arghash( $int86$32 );
    SubLObject cdolist_list_var = argassoc;
    SubLObject argpair = NIL;
    argpair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != forts.fort_p( argpair ) )
      {
        push_arghash_value( $kw87$JUST_FORT, argpair, arghash );
      }
      else if( argpair.isString() )
      {
        push_arghash_value( $kw88$JUST_STRING, argpair, arghash );
      }
      else if( NIL != list_utilities.lengthE( argpair, TWO_INTEGER, UNPROVIDED ) )
      {
        push_arghash_value( argpair.first(), conses_high.second( argpair ), arghash );
      }
      cdolist_list_var = cdolist_list_var.rest();
      argpair = cdolist_list_var.first();
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 20680L)
  public static SubLObject html_arghash_href(final SubLObject arghash, final SubLObject html_handler_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject href = NIL;
    SubLObject href_list = NIL;
    href_list = ConsesLow.cons( html_handler_name, href_list );
    SubLObject key = NIL;
    SubLObject value_list = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( arghash );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        SubLObject cdolist_list_var;
        value_list = ( cdolist_list_var = Hashtables.getEntryValue( cdohash_entry ) );
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject key_string = arghash_make_key_and_value_strings( key, value, UNPROVIDED );
          final SubLObject value_string = thread.secondMultipleValue();
          thread.resetMultipleValues();
          href_list = ConsesLow.cons( $str89$_, href_list );
          href_list = ConsesLow.cons( web_utilities.html_url_encode( key_string, UNPROVIDED ), href_list );
          href_list = ConsesLow.cons( $str90$_, href_list );
          href_list = ConsesLow.cons( web_utilities.html_url_encode( value_string, UNPROVIDED ), href_list );
          cdolist_list_var = cdolist_list_var.rest();
          value = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    href = Functions.apply( Symbols.symbol_function( $sym79$CCONCATENATE ), Sequences.nreverse( href_list ) );
    return href;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 21452L)
  public static SubLObject html_arghash_fancy_anchor(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arghash = NIL;
    SubLObject html_handler_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    arghash = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
    html_handler_name = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list91 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list91 );
      if( NIL == conses_high.member( current_$1, $list92, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw93$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list91 );
    }
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw26$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject target_tail = cdestructuring_bind.property_list_member( $kw94$TARGET, current );
    final SubLObject target = ( NIL != target_tail ) ? conses_high.cadr( target_tail ) : NIL;
    final SubLObject script_tail = cdestructuring_bind.property_list_member( $kw95$SCRIPT, current );
    final SubLObject script = ( NIL != script_tail ) ? conses_high.cadr( script_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw96$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject href = $sym97$HREF;
    return ConsesLow.list( $sym42$CLET, ConsesLow.list( ConsesLow.list( href, ConsesLow.list( $sym98$FORMAT, NIL, $str99$_A__A, $sym100$_CYC_CGI_PROGRAM_, ConsesLow.list( $sym101$HTML_ARGHASH_HREF, arghash,
        html_handler_name ) ) ) ), ConsesLow.listS( $sym102$HTML_FANCY_ANCHOR, ConsesLow.list( new SubLObject[]
        { $kw103$HREF, href, $kw26$NAME, name, $kw94$TARGET, target, $kw95$SCRIPT, script, $kw96$STYLE, style
    } ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 21828L)
  public static SubLObject html_arghash_checkbox_input(final SubLObject arghash, final SubLObject key, final SubLObject value, SubLObject script, SubLObject onclick)
  {
    if( script == UNPROVIDED )
    {
      script = NIL;
    }
    if( onclick == UNPROVIDED )
    {
      onclick = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject values = get_arghash_value_list( key, arghash );
    thread.resetMultipleValues();
    final SubLObject key_string = arghash_make_key_and_value_strings( key, value, UNPROVIDED );
    final SubLObject value_string = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject checkedP = list_utilities.member_equalP( value, values );
    html_utilities.html_checkbox_input( key_string, value_string, checkedP, script, onclick, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 22330L)
  public static SubLObject html_arghash_radio_input(final SubLObject arghash, final SubLObject key, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject values = get_arghash_value_list( key, arghash );
    thread.resetMultipleValues();
    final SubLObject key_string = arghash_make_key_and_value_strings( key, value, UNPROVIDED );
    final SubLObject value_string = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject checkedP = list_utilities.member_equalP( value, values );
    html_utilities.html_radio_input( key_string, value_string, checkedP, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 22767L)
  public static SubLObject html_arghash_focus_radio_input(final SubLObject arghash, final SubLObject key, final SubLObject focus_key, final SubLObject focus_value_type, final SubLObject value, SubLObject value_type)
  {
    if( value_type == UNPROVIDED )
    {
      value_type = $kw84$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject values = get_arghash_value_list( key, arghash );
    final SubLObject focus = arghash_make_key_string( focus_key, focus_value_type );
    thread.resetMultipleValues();
    final SubLObject key_string = arghash_make_key_and_value_strings( key, value, value_type );
    final SubLObject value_string = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject checkedP = list_utilities.member_equalP( value, values );
    html_script_utilities.html_focus_radio_input( key_string, focus, value_string, checkedP, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 23258L)
  public static SubLObject html_arghash_clear_radio_input(final SubLObject arghash, final SubLObject key, final SubLObject clear_key, final SubLObject clear_value_type, final SubLObject value, SubLObject value_type)
  {
    if( value_type == UNPROVIDED )
    {
      value_type = $kw84$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject values = get_arghash_value_list( key, arghash );
    final SubLObject clear = arghash_make_key_string( clear_key, clear_value_type );
    thread.resetMultipleValues();
    final SubLObject key_string = arghash_make_key_and_value_strings( key, value, value_type );
    final SubLObject value_string = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject checkedP = list_utilities.member_equalP( value, values );
    html_script_utilities.html_clear_radio_input( key_string, clear, value_string, checkedP, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 23749L)
  public static SubLObject html_arghash_hidden_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject id)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = NIL;
    }
    if( id == UNPROVIDED )
    {
      id = NIL;
    }
    SubLObject poss_values = get_arghash_value_list( key, arghash );
    if( poss_values.equal( $list104 ) )
    {
      poss_values = NIL;
    }
    if( NIL == poss_values && NIL != default_value )
    {
      poss_values = ConsesLow.list( default_value );
    }
    SubLObject cdolist_list_var = poss_values;
    SubLObject poss_value = NIL;
    poss_value = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      html_arghash_hidden_input_force( arghash, key, poss_value, id, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      poss_value = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 24310L)
  public static SubLObject html_arghash_hidden_input_force(final SubLObject arghash, final SubLObject key, final SubLObject value, SubLObject value_type, SubLObject id)
  {
    if( value_type == UNPROVIDED )
    {
      value_type = $kw84$DEFAULT;
    }
    if( id == UNPROVIDED )
    {
      id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject key_string = arghash_make_key_and_value_strings( key, value, value_type );
    final SubLObject value_string = thread.secondMultipleValue();
    thread.resetMultipleValues();
    html_utilities.html_hidden_input( key_string, value_string, id );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 24698L)
  public static SubLObject html_arghash_fancy_select(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    value_type = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list105 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list105 );
      if( NIL == conses_high.member( current_$2, $list106, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw93$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list105 );
    }
    final SubLObject multiple_tail = cdestructuring_bind.property_list_member( $kw107$MULTIPLE, current );
    final SubLObject multiple = ( NIL != multiple_tail ) ? conses_high.cadr( multiple_tail ) : NIL;
    final SubLObject size_tail = cdestructuring_bind.property_list_member( $kw108$SIZE, current );
    final SubLObject size = ( NIL != size_tail ) ? conses_high.cadr( size_tail ) : NIL;
    final SubLObject script_tail = cdestructuring_bind.property_list_member( $kw95$SCRIPT, current );
    final SubLObject script = ( NIL != script_tail ) ? conses_high.cadr( script_tail ) : NIL;
    final SubLObject onchange_tail = cdestructuring_bind.property_list_member( $kw109$ONCHANGE, current );
    final SubLObject onchange = ( NIL != onchange_tail ) ? conses_high.cadr( onchange_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject key_string = $sym110$KEY_STRING;
    return ConsesLow.list( $sym42$CLET, ConsesLow.list( ConsesLow.list( key_string, ConsesLow.list( $sym111$ARGHASH_MAKE_KEY_STRING, key, value_type ) ) ), ConsesLow.listS( $sym112$HTML_FANCY_SELECT, ConsesLow.list(
        new SubLObject[]
        { key_string, $kw107$MULTIPLE, multiple, $kw108$SIZE, size, $kw95$SCRIPT, script, $kw109$ONCHANGE, onchange
        } ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 25133L)
  public static SubLObject html_arghash_fancy_option(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arghash = NIL;
    SubLObject key = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
    arghash = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
    value = current.first();
    current = current.rest();
    final SubLObject value_type = current.isCons() ? current.first() : $kw84$DEFAULT;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list113 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject value_string = $sym114$VALUE_STRING;
      final SubLObject selected = $sym115$SELECTED;
      return ConsesLow.list( $sym42$CLET, ConsesLow.list( ConsesLow.list( selected, ConsesLow.list( $sym116$MEMBER_EQUAL_, value, ConsesLow.list( $sym117$GET_ARGHASH_VALUE_LIST, key, arghash ) ) ), ConsesLow.list(
          value_string, ConsesLow.list( $sym118$ARGHASH_GET_STRING, value, value_type ) ) ), ConsesLow.listS( $sym119$HTML_FANCY_OPTION, ConsesLow.list( $kw120$SELECTED, selected, $kw121$VALUE, value_string ), ConsesLow
              .append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list113 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 25603L)
  public static SubLObject html_arghash_fancy_select_with_options(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject arghash = NIL;
    SubLObject key = NIL;
    SubLObject value_type = NIL;
    SubLObject values = NIL;
    SubLObject value_strings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    arghash = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    value_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    values = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list122 );
    value_strings = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list122 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list122 );
      if( NIL == conses_high.member( current_$3, $list106, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw93$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list122 );
    }
    final SubLObject multiple_tail = cdestructuring_bind.property_list_member( $kw107$MULTIPLE, current );
    final SubLObject multiple = ( NIL != multiple_tail ) ? conses_high.cadr( multiple_tail ) : NIL;
    final SubLObject size_tail = cdestructuring_bind.property_list_member( $kw108$SIZE, current );
    final SubLObject size = ( NIL != size_tail ) ? conses_high.cadr( size_tail ) : NIL;
    final SubLObject script_tail = cdestructuring_bind.property_list_member( $kw95$SCRIPT, current );
    final SubLObject script = ( NIL != script_tail ) ? conses_high.cadr( script_tail ) : NIL;
    final SubLObject onchange_tail = cdestructuring_bind.property_list_member( $kw109$ONCHANGE, current );
    final SubLObject onchange = ( NIL != onchange_tail ) ? conses_high.cadr( onchange_tail ) : NIL;
    final SubLObject value = $sym123$VALUE;
    final SubLObject value_string = $sym124$VALUE_STRING;
    return ConsesLow.list( $sym125$HTML_ARGHASH_FANCY_SELECT, ConsesLow.list( new SubLObject[] { key, value_type, $kw107$MULTIPLE, multiple, $kw108$SIZE, size, $kw95$SCRIPT, script, $kw109$ONCHANGE, onchange
    } ), ConsesLow.list( $sym126$CDOLIST_MULTIPLE, ConsesLow.list( ConsesLow.list( value, values ), ConsesLow.list( value_string, value_strings ) ), ConsesLow.list( $sym127$HTML_ARGHASH_FANCY_OPTION, ConsesLow.list(
        arghash, key, value, value_type ), ConsesLow.list( $sym128$HTML_PRINC, value_string ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 26211L)
  public static SubLObject html_arghash_submit_input(final SubLObject arghash, final SubLObject label, final SubLObject key, SubLObject script)
  {
    if( script == UNPROVIDED )
    {
      script = NIL;
    }
    final SubLObject key_string = arghash_make_key_string( key, $kw129$BOOLEAN );
    return html_utilities.html_submit_input( label, key_string, script );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 26527L)
  public static SubLObject html_arghash_clear_input_button(final SubLObject arghash, final SubLObject key, final SubLObject value_type, SubLObject value)
  {
    if( value == UNPROVIDED )
    {
      value = NIL;
    }
    final SubLObject key_string = arghash_make_key_string( key, value_type );
    return html_script_utilities.html_clear_input_button( key_string, value, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 26862L)
  public static SubLObject html_arghash_complete_button(final SubLObject arghash, final SubLObject key, final SubLObject value_type, SubLObject filter_type, SubLObject label, SubLObject auto_submit)
  {
    if( filter_type == UNPROVIDED )
    {
      filter_type = NIL;
    }
    if( label == UNPROVIDED )
    {
      label = $str130$Complete;
    }
    if( auto_submit == UNPROVIDED )
    {
      auto_submit = NIL;
    }
    final SubLObject key_string = arghash_make_key_string( key, value_type );
    return html_complete.html_complete_button( key_string, label, filter_type, auto_submit, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 27242L)
  public static SubLObject html_arghash_text_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject size, SubLObject value_type)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( value_type == UNPROVIDED )
    {
      value_type = $kw84$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject value = get_arghash_value( key, arghash );
    if( NIL == value )
    {
      value = default_value;
    }
    if( NIL != value )
    {
      thread.resetMultipleValues();
      final SubLObject key_string = arghash_make_key_and_value_strings( key, value, value_type );
      final SubLObject value_string = thread.secondMultipleValue();
      thread.resetMultipleValues();
      html_utilities.html_text_input( key_string, value_string, size );
    }
    else
    {
      final SubLObject key_string = arghash_make_key_string( key, value_type );
      html_utilities.html_text_input( key_string, $str57$, size );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 27863L)
  public static SubLObject html_arghash_textarea_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject cols, SubLObject rows, SubLObject wrap, SubLObject value_type)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = NIL;
    }
    if( cols == UNPROVIDED )
    {
      cols = NIL;
    }
    if( rows == UNPROVIDED )
    {
      rows = NIL;
    }
    if( wrap == UNPROVIDED )
    {
      wrap = NIL;
    }
    if( value_type == UNPROVIDED )
    {
      value_type = $kw84$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject value = get_arghash_value( key, arghash );
    if( NIL == value )
    {
      value = default_value;
    }
    if( NIL != value )
    {
      thread.resetMultipleValues();
      final SubLObject key_string = arghash_make_key_and_value_strings( key, value, value_type );
      final SubLObject value_string = thread.secondMultipleValue();
      thread.resetMultipleValues();
      html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( key_string );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != cols )
      {
        html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( cols );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != rows )
      {
        html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( rows );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != wrap )
      {
        html_utilities.html_markup( html_macros.$html_table_wrap$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str131$virtual );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( value_string );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
    }
    else
    {
      final SubLObject key_string = arghash_make_key_string( key, value_type );
      html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( key_string );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != cols )
      {
        html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( cols );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != rows )
      {
        html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( rows );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != wrap )
      {
        html_utilities.html_markup( html_macros.$html_table_wrap$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str131$virtual );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 28569L)
  public static SubLObject html_arghash_fort_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject size, SubLObject complete_text, SubLObject filter_col)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( complete_text == UNPROVIDED )
    {
      complete_text = $str130$Complete;
    }
    if( filter_col == UNPROVIDED )
    {
      filter_col = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fort = get_arghash_value( key, arghash );
    final SubLObject fort_name = kb_paths.fort_name( fort );
    if( NIL != forts.fort_p( fort ) )
    {
      thread.resetMultipleValues();
      final SubLObject key_string = arghash_make_key_and_value_strings( key, fort, UNPROVIDED );
      final SubLObject value_string = thread.secondMultipleValue();
      thread.resetMultipleValues();
      html_complete.html_complete_button( key_string, complete_text, filter_col, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_glyph( $kw132$NBSP, UNPROVIDED );
      html_utilities.html_text_input( key_string, fort_name, size );
    }
    else
    {
      final SubLObject key_string = arghash_make_key_string( key, $kw133$FORT );
      html_complete.html_complete_button( key_string, complete_text, filter_col, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_glyph( $kw132$NBSP, UNPROVIDED );
      html_utilities.html_text_input( key_string, default_value, size );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 29652L)
  public static SubLObject html_arghash_sentence_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject rows, SubLObject cols, SubLObject complete_text, SubLObject cyclify_text,
      SubLObject clear_text)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = NIL;
    }
    if( rows == UNPROVIDED )
    {
      rows = NIL;
    }
    if( cols == UNPROVIDED )
    {
      cols = NIL;
    }
    if( complete_text == UNPROVIDED )
    {
      complete_text = $str130$Complete;
    }
    if( cyclify_text == UNPROVIDED )
    {
      cyclify_text = $str134$Cyclify;
    }
    if( clear_text == UNPROVIDED )
    {
      clear_text = $str135$Clear;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sentence_object = get_arghash_value( key, arghash );
    final SubLObject sentence = ( NIL != assertion_handles.assertion_p( sentence_object ) ) ? uncanonicalizer.assertion_el_formula( sentence_object ) : uncanonicalizer.el_version( sentence_object, UNPROVIDED );
    if( NIL != el_grammar.el_sentence_p( sentence ) )
    {
      thread.resetMultipleValues();
      final SubLObject key_string = arghash_make_key_and_value_strings( key, sentence, $kw136$EL_FORMULA );
      final SubLObject value_string = thread.secondMultipleValue();
      thread.resetMultipleValues();
      cb_form_widgets.cb_el_sentence_input_section( sentence, ConsesLow.list( new SubLObject[] { $kw137$INPUT_NAME, key_string, $kw138$COMPLETE_LABEL, complete_text, $kw139$CYCLIFY_LABEL, cyclify_text,
        $kw140$CLEAR_LABEL, clear_text, $kw141$HEIGHT, rows, $kw142$WIDTH, cols
      } ) );
    }
    else
    {
      final SubLObject key_string = arghash_make_key_string( key, $kw136$EL_FORMULA );
      final SubLObject sentence_$4 = ( NIL != assertion_handles.assertion_p( default_value ) ) ? uncanonicalizer.assertion_el_formula( default_value ) : uncanonicalizer.el_version( default_value, UNPROVIDED );
      cb_form_widgets.cb_el_sentence_input_section( sentence_$4, ConsesLow.list( new SubLObject[] { $kw137$INPUT_NAME, key_string, $kw138$COMPLETE_LABEL, complete_text, $kw139$CYCLIFY_LABEL, cyclify_text,
        $kw140$CLEAR_LABEL, clear_text, $kw141$HEIGHT, rows, $kw142$WIDTH, cols
      } ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 30848L)
  public static SubLObject html_arghash_nl_fort_input(final SubLObject arghash, final SubLObject fort_key, SubLObject debug, SubLObject generation_fn, SubLObject requiredP, SubLObject complete_buttonP,
      SubLObject filter_col)
  {
    if( debug == UNPROVIDED )
    {
      debug = NIL;
    }
    if( generation_fn == UNPROVIDED )
    {
      generation_fn = $sym143$GENERATE_PHRASE;
    }
    if( requiredP == UNPROVIDED )
    {
      requiredP = T;
    }
    if( complete_buttonP == UNPROVIDED )
    {
      complete_buttonP = NIL;
    }
    if( filter_col == UNPROVIDED )
    {
      filter_col = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject input_prefix_string = string_utilities.string_from_keyword( fort_key );
    final SubLObject new_fort_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str144$_NEW_FORT ) );
    final SubLObject string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str145$_STRING ) );
    final SubLObject new_string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str146$_NEW_STRING ) );
    final SubLObject undo_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str147$_UNDO ) );
    final SubLObject candidates_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str148$_CANDIDATES ) );
    final SubLObject done_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str149$_DONE ) );
    final SubLObject error_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str150$_ERROR ) );
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str151$_2 );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != requiredP )
      {
        if( NIL != get_arghash_value( done_key, arghash ) )
        {
          html_utilities.html_princ( $str152$_ );
        }
        else
        {
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
          {
            html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str152$_ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
      }
      else
      {
        html_utilities.html_glyph( $kw132$NBSP, TWO_INTEGER );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    if( NIL != get_arghash_value_list( candidates_key, arghash ) )
    {
      final SubLObject key_string = arghash_make_key_string( new_fort_key, $kw133$FORT );
      html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( key_string );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_space, UNPROVIDED );
      html_utilities.html_markup( $str153$onChange_javascript_this_form_sub );
      if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
      {
        html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject selected = list_utilities.member_equalP( NIL, get_arghash_value_list( new_fort_key, arghash ) );
        final SubLObject value_string = arghash_get_string( NIL, $kw84$DEFAULT );
        html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
        if( NIL != selected )
        {
          html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
        }
        if( NIL != value_string )
        {
          html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( value_string );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str154$___ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
        }
        html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
        SubLObject cdolist_list_var = get_arghash_value_list( candidates_key, arghash );
        SubLObject term1_candidate = NIL;
        term1_candidate = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject selected2 = list_utilities.member_equalP( term1_candidate, get_arghash_value_list( new_fort_key, arghash ) );
          final SubLObject value_string2 = arghash_get_string( term1_candidate, $kw84$DEFAULT );
          html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
          if( NIL != selected2 )
          {
            html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
          }
          if( NIL != value_string2 )
          {
            html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( value_string2 );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( Functions.funcall( generation_fn, term1_candidate ) );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
          }
          html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
          cdolist_list_var = cdolist_list_var.rest();
          term1_candidate = cdolist_list_var.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
      html_arghash_submit_input( arghash, $str155$Undo, undo_key, UNPROVIDED );
      set_arghash_value( string_key, arghash, get_arghash_value( new_string_key, arghash ) );
      rem_arghash_value( new_string_key, arghash );
      html_arghash_hidden_input( arghash, string_key, UNPROVIDED, UNPROVIDED );
      html_arghash_hidden_input( arghash, candidates_key, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      html_arghash_text_input( arghash, new_string_key, $str57$, cb_parameters.$cb_constant_input_width$.getDynamicValue( thread ), UNPROVIDED );
      html_utilities.html_glyph( $kw132$NBSP, UNPROVIDED );
      html_arghash_submit_input( arghash, $str156$Submit, $kw157$SUBMIT, UNPROVIDED );
      if( NIL == get_arghash_value( done_key, arghash ) && NIL != complete_buttonP )
      {
        html_utilities.html_glyph( $kw132$NBSP, UNPROVIDED );
        html_arghash_complete_button( arghash, new_string_key, $kw158$STRING, filter_col, UNPROVIDED, UNPROVIDED );
      }
      html_arghash_hidden_input( arghash, string_key, UNPROVIDED, UNPROVIDED );
    }
    html_arghash_hidden_input( arghash, fort_key, UNPROVIDED, UNPROVIDED );
    if( NIL != get_arghash_value( error_key, arghash ) )
    {
      html_utilities.html_glyph( $kw132$NBSP, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
      {
        html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( get_arghash_value( error_key, arghash ) );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    }
    html_utilities.html_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 33747L)
  public static SubLObject html_arghash_nl_fort_input_invisible(final SubLObject arghash, final SubLObject fort_key)
  {
    final SubLObject input_prefix_string = string_utilities.string_from_keyword( fort_key );
    final SubLObject new_fort_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str144$_NEW_FORT ) );
    final SubLObject string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str145$_STRING ) );
    final SubLObject new_string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str146$_NEW_STRING ) );
    final SubLObject candidates_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str148$_CANDIDATES ) );
    final SubLObject done_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str149$_DONE ) );
    final SubLObject error_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str150$_ERROR ) );
    if( NIL == get_arghash_value( new_fort_key, arghash ) )
    {
      set_arghash_value( new_fort_key, arghash, get_arghash_value( fort_key, arghash ) );
    }
    html_arghash_hidden_input( arghash, fort_key, UNPROVIDED, UNPROVIDED );
    html_arghash_hidden_input( arghash, string_key, UNPROVIDED, UNPROVIDED );
    html_arghash_hidden_input( arghash, new_fort_key, UNPROVIDED, UNPROVIDED );
    html_arghash_hidden_input( arghash, new_string_key, UNPROVIDED, UNPROVIDED );
    html_arghash_hidden_input( arghash, candidates_key, UNPROVIDED, UNPROVIDED );
    html_arghash_hidden_input( arghash, done_key, UNPROVIDED, UNPROVIDED );
    html_arghash_hidden_input( arghash, error_key, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 34908L)
  public static SubLObject html_arghash_nl_fort_input_activeP(final SubLObject arghash, final SubLObject fort_key)
  {
    final SubLObject input_prefix_string = string_utilities.string_from_keyword( fort_key );
    final SubLObject new_fort_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str144$_NEW_FORT ) );
    final SubLObject new_string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str146$_NEW_STRING ) );
    final SubLObject candidates_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str148$_CANDIDATES ) );
    if( NIL != forts.fort_p( get_arghash_value( new_fort_key, arghash ) ) || NIL != string_utilities.non_empty_stringP( get_arghash_value( new_string_key, arghash ) ) || NIL != get_arghash_value( candidates_key,
        arghash ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 35639L)
  public static SubLObject html_arghash_nl_fort_input_doneP(final SubLObject arghash, final SubLObject fort_key)
  {
    final SubLObject input_prefix_string = string_utilities.string_from_keyword( fort_key );
    final SubLObject done_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str149$_DONE ) );
    if( NIL != get_arghash_value( done_key, arghash ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 35998L)
  public static SubLObject html_arghash_nl_fort_input_clear(final SubLObject arghash, final SubLObject fort_key)
  {
    final SubLObject input_prefix_string = string_utilities.string_from_keyword( fort_key );
    final SubLObject new_fort_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str144$_NEW_FORT ) );
    final SubLObject string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str145$_STRING ) );
    final SubLObject new_string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str146$_NEW_STRING ) );
    final SubLObject candidates_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str148$_CANDIDATES ) );
    rem_arghash_value( new_fort_key, arghash );
    rem_arghash_value( new_string_key, arghash );
    rem_arghash_value( fort_key, arghash );
    rem_arghash_value( string_key, arghash );
    rem_arghash_value( candidates_key, arghash );
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 36762L)
  public static SubLObject html_arghash_nl_fort_input_force_default_if_unset(final SubLObject arghash, final SubLObject fort_key, final SubLObject default_value, SubLObject generation_fn, SubLObject debug)
  {
    if( generation_fn == UNPROVIDED )
    {
      generation_fn = $sym143$GENERATE_PHRASE;
    }
    if( debug == UNPROVIDED )
    {
      debug = NIL;
    }
    final SubLObject input_prefix_string = string_utilities.string_from_keyword( fort_key );
    final SubLObject new_string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str146$_NEW_STRING ) );
    final SubLObject new_fort_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str144$_NEW_FORT ) );
    final SubLObject candidates_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str148$_CANDIDATES ) );
    final SubLObject done_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str149$_DONE ) );
    if( NIL == get_arghash_value( done_key, arghash ) && NIL != string_utilities.empty_string_p( get_arghash_value( new_string_key, arghash ) ) && NIL == get_arghash_value( candidates_key, arghash ) )
    {
      if( NIL != debug )
      {
        html_utilities.html_princ( $str159$_nl_fort_input_force_default_if_u );
        html_utilities.html_princ( fort_key );
        html_utilities.html_princ( $str160$___setting_to_ );
        html_utilities.html_princ( default_value );
        html_utilities.html_newline( UNPROVIDED );
      }
      set_arghash_value( new_fort_key, arghash, default_value );
      set_arghash_value( done_key, arghash, T );
      set_arghash_value( new_string_key, arghash, Functions.funcall( generation_fn, get_arghash_value( fort_key, arghash ) ) );
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 37981L)
  public static SubLObject html_arghash_nl_fort_list_input_set_forts(final SubLObject arghash, final SubLObject fort_list_key, final SubLObject fort_key_list, final SubLObject v_forts, SubLObject generation_fn)
  {
    if( generation_fn == UNPROVIDED )
    {
      generation_fn = $sym143$GENERATE_PHRASE;
    }
    SubLObject fort = NIL;
    SubLObject fort_$8 = NIL;
    SubLObject fort_key = NIL;
    SubLObject fort_key_$9 = NIL;
    fort = v_forts;
    fort_$8 = fort.first();
    fort_key = fort_key_list;
    fort_key_$9 = fort_key.first();
    while ( NIL != fort_key || NIL != fort)
    {
      html_arghash_nl_fort_input_set_fort( arghash, fort_key_$9, fort_$8, generation_fn );
      fort = fort.rest();
      fort_$8 = fort.first();
      fort_key = fort_key.rest();
      fort_key_$9 = fort_key.first();
    }
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 38314L)
  public static SubLObject html_arghash_nl_fort_input_set_fort(final SubLObject arghash, final SubLObject fort_key, final SubLObject fort, SubLObject generation_fn)
  {
    if( generation_fn == UNPROVIDED )
    {
      generation_fn = $sym143$GENERATE_PHRASE;
    }
    final SubLObject input_prefix_string = string_utilities.string_from_keyword( fort_key );
    final SubLObject new_fort_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str144$_NEW_FORT ) );
    final SubLObject string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str145$_STRING ) );
    final SubLObject new_string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str146$_NEW_STRING ) );
    final SubLObject done_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str149$_DONE ) );
    final SubLObject fort_string = Functions.funcall( generation_fn, fort );
    set_arghash_value( fort_key, arghash, fort );
    set_arghash_value( string_key, arghash, fort_string );
    set_arghash_value( new_fort_key, arghash, fort );
    set_arghash_value( new_string_key, arghash, fort_string );
    set_arghash_value( done_key, arghash, T );
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 39150L)
  public static SubLObject html_arghash_nl_fort_input_validate(SubLObject arghash, final SubLObject fort_key, SubLObject debug, SubLObject generation_fn, SubLObject parse_fn, SubLObject filter_col, SubLObject filter_mt)
  {
    if( debug == UNPROVIDED )
    {
      debug = NIL;
    }
    if( generation_fn == UNPROVIDED )
    {
      generation_fn = $sym143$GENERATE_PHRASE;
    }
    if( parse_fn == UNPROVIDED )
    {
      parse_fn = $sym161$TERMS_FOR_BROWSING;
    }
    if( filter_col == UNPROVIDED )
    {
      filter_col = NIL;
    }
    if( filter_mt == UNPROVIDED )
    {
      filter_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject input_prefix_string = string_utilities.string_from_keyword( fort_key );
    final SubLObject new_fort_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str144$_NEW_FORT ) );
    final SubLObject string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str145$_STRING ) );
    final SubLObject new_string_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str146$_NEW_STRING ) );
    final SubLObject undo_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str147$_UNDO ) );
    final SubLObject candidates_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str148$_CANDIDATES ) );
    final SubLObject error_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str150$_ERROR ) );
    SubLObject poss_candidates = NIL;
    if( NIL != debug )
    {
      html_utilities.html_princ( $str162$_nl_fort_input_validate_ );
      html_utilities.html_princ( fort_key );
      html_utilities.html_princ( $str163$___ );
    }
    if( NIL != get_arghash_value( undo_key, arghash ) )
    {
      if( NIL != debug )
      {
        html_utilities.html_princ( $str164$Case_1__clicked_undo_button );
        html_utilities.html_newline( UNPROVIDED );
      }
      set_arghash_value( new_string_key, arghash, get_arghash_value( string_key, arghash ) );
      rem_arghash_value( string_key, arghash );
      rem_arghash_value( new_fort_key, arghash );
      rem_arghash_value( fort_key, arghash );
      rem_arghash_value( candidates_key, arghash );
    }
    else if( NIL != get_arghash_value( new_fort_key, arghash ) && !get_arghash_value( new_fort_key, arghash ).equal( get_arghash_value( fort_key, arghash ) ) )
    {
      if( NIL != debug )
      {
        html_utilities.html_princ( $str165$Case_2__chose_fort_from_pulldown );
        html_utilities.html_newline( UNPROVIDED );
      }
      rem_arghash_value( candidates_key, arghash );
      arghash = html_arghash_nl_fort_input_set_fort( arghash, fort_key, get_arghash_value( new_fort_key, arghash ), generation_fn );
    }
    else if( NIL == get_arghash_value( new_fort_key, arghash ) && !get_arghash_value( string_key, arghash ).equal( get_arghash_value( new_string_key, arghash ) ) )
    {
      if( NIL != debug )
      {
        html_utilities.html_princ( $str166$Case_3__text_typed_in__ );
      }
      rem_arghash_value( new_fort_key, arghash );
      if( !get_arghash_value( new_string_key, arghash ).isString() )
      {
        set_arghash_value( new_string_key, arghash, $str57$ );
      }
      poss_candidates = Functions.funcall( parse_fn, get_arghash_value( new_string_key, arghash ) );
      if( NIL != poss_candidates && NIL != fort_types_interface.collectionP( filter_col ) )
      {
        if( NIL != fort_types_interface.mtP( filter_mt ) )
        {
          poss_candidates = isa.all_instances_among_fast( filter_col, poss_candidates, filter_mt );
        }
        else
        {
          final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym167$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const168$EverythingPSC, thread );
            poss_candidates = isa.all_instances_among_fast( filter_col, poss_candidates, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
          }
        }
      }
      if( NIL == poss_candidates )
      {
        if( NIL != debug )
        {
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str169$Case_3a__No_parse_for___A_, get_arghash_value( new_string_key, arghash ) );
          html_utilities.html_newline( UNPROVIDED );
        }
        if( NIL == string_utilities.empty_string_p( get_arghash_value( new_string_key, arghash ) ) )
        {
          if( generation_fn.isFunctionSpec() && NIL != fort_types_interface.collection_in_any_mtP( filter_col ) )
          {
            set_arghash_value( error_key, arghash, Sequences.cconcatenate( Functions.funcall( generation_fn, filter_col ), new SubLObject[] { $str170$_called__, get_arghash_value( new_string_key, arghash ),
              $str171$__not_found_
            } ) );
          }
          else
          {
            set_arghash_value( error_key, arghash, Sequences.cconcatenate( $str172$_, new SubLObject[] { get_arghash_value( new_string_key, arghash ), $str171$__not_found_
            } ) );
          }
        }
      }
      else if( NIL != list_utilities.singletonP( poss_candidates ) )
      {
        if( NIL != debug )
        {
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str173$Case_3b__One_parse_for___A_____A, get_arghash_value( new_string_key, arghash ), poss_candidates.first() );
          html_utilities.html_newline( UNPROVIDED );
        }
        arghash = html_arghash_nl_fort_input_set_fort( arghash, fort_key, poss_candidates.first(), generation_fn );
        poss_candidates = NIL;
      }
      else
      {
        if( NIL != debug )
        {
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str174$Case_3c__Many_parses_for___A_____, get_arghash_value( new_string_key, arghash ), poss_candidates );
          html_utilities.html_newline( UNPROVIDED );
        }
        set_arghash_value_list( candidates_key, arghash, poss_candidates );
      }
    }
    else if( NIL != string_utilities.empty_string_p( get_arghash_value( new_string_key, arghash ) ) )
    {
      if( NIL != debug )
      {
        html_utilities.html_princ( $str175$Case_4__no_text_typed_in );
        html_utilities.html_newline( UNPROVIDED );
      }
    }
    else if( NIL != get_arghash_value( fort_key, arghash ) )
    {
      if( NIL != debug )
      {
        html_utilities.html_princ( $str176$Case_5__fort_set__so_use_fort_as_ );
        html_utilities.html_newline( UNPROVIDED );
      }
      arghash = html_arghash_nl_fort_input_set_fort( arghash, fort_key, get_arghash_value( fort_key, arghash ), generation_fn );
    }
    else if( NIL != debug )
    {
      html_utilities.html_princ( $str177$Case_6__fallthrough_ );
      html_utilities.html_newline( UNPROVIDED );
    }
    set_arghash_value( fort_key, arghash, get_arghash_value( new_fort_key, arghash ) );
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 43766L)
  public static SubLObject html_arghash_nl_fort_list_input(final SubLObject arghash, final SubLObject fort_list_key, final SubLObject fort_key_list, SubLObject debug, SubLObject generation_fn, SubLObject min_required,
      SubLObject min_shown, SubLObject complete_buttonP, SubLObject filter_col)
  {
    if( debug == UNPROVIDED )
    {
      debug = NIL;
    }
    if( generation_fn == UNPROVIDED )
    {
      generation_fn = $sym143$GENERATE_PHRASE;
    }
    if( min_required == UNPROVIDED )
    {
      min_required = ONE_INTEGER;
    }
    if( min_shown == UNPROVIDED )
    {
      min_shown = ONE_INTEGER;
    }
    if( complete_buttonP == UNPROVIDED )
    {
      complete_buttonP = NIL;
    }
    if( filter_col == UNPROVIDED )
    {
      filter_col = NIL;
    }
    final SubLObject max = Sequences.length( fort_key_list );
    SubLObject num = ZERO_INTEGER;
    SubLObject v_forts = NIL;
    SubLObject unused_fort_keys = NIL;
    SubLObject cdolist_list_var = fort_key_list;
    SubLObject fort_key = NIL;
    fort_key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject input_prefix_string = string_utilities.string_from_keyword( fort_key );
      final SubLObject remove_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str178$_REMOVE ) );
      final SubLObject requiredP = Numbers.numL( num, min_required );
      if( NIL != html_arghash_nl_fort_input_activeP( arghash, fort_key ) )
      {
        num = Numbers.add( num, ONE_INTEGER );
        html_arghash_nl_fort_input( arghash, fort_key, debug, generation_fn, requiredP, complete_buttonP, filter_col );
        html_arghash_submit_input( arghash, $str179$Remove, remove_key, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        if( NIL != get_arghash_value( fort_key, arghash ) )
        {
          v_forts = ConsesLow.cons( get_arghash_value( fort_key, arghash ), v_forts );
        }
      }
      else
      {
        unused_fort_keys = ConsesLow.cons( fort_key, unused_fort_keys );
      }
      cdolist_list_var = cdolist_list_var.rest();
      fort_key = cdolist_list_var.first();
    }
    v_forts = Sequences.nreverse( v_forts );
    set_arghash_value_list( fort_list_key, arghash, v_forts );
    unused_fort_keys = Sequences.nreverse( unused_fort_keys );
    if( num.numE( max ) )
    {
      if( NIL != debug )
      {
        html_utilities.html_princ( $str180$_max_reached_ );
      }
    }
    else if( num.numG( max ) )
    {
      if( NIL != debug )
      {
        html_utilities.html_princ( $str181$_max_exceeded_ );
      }
    }
    else if( NIL != unused_fort_keys )
    {
      if( Numbers.subtract( min_required, num ).numGE( ZERO_INTEGER ) && NIL != debug )
      {
        html_utilities.html_princ( $str76$_ );
        html_utilities.html_princ( Numbers.subtract( min_required, num ) );
        html_utilities.html_princ( $str182$_more_required_ );
        html_utilities.html_newline( UNPROVIDED );
      }
      SubLObject doneP = NIL;
      if( NIL == doneP )
      {
        SubLObject csome_list_var = unused_fort_keys;
        SubLObject unused_fort_key = NIL;
        unused_fort_key = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          final SubLObject requiredP2 = Numbers.numL( num, min_required );
          num = Numbers.add( num, ONE_INTEGER );
          if( num.numGE( Numbers.max( min_required, min_shown ) ) )
          {
            doneP = T;
          }
          html_arghash_nl_fort_input( arghash, unused_fort_key, debug, Symbols.symbol_function( $sym183$FORT_NAME ), requiredP2, complete_buttonP, filter_col );
          html_utilities.html_newline( UNPROVIDED );
          csome_list_var = csome_list_var.rest();
          unused_fort_key = csome_list_var.first();
        }
      }
    }
    else
    {
      html_utilities.html_princ( $str184$_key_list_length_reached_ );
    }
    html_arghash_hidden_input( arghash, fort_list_key, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 45683L)
  public static SubLObject html_arghash_nl_fort_list_input_validate(final SubLObject arghash, final SubLObject fort_list_key, final SubLObject fort_key_list, SubLObject debug, SubLObject generation_fn,
      SubLObject parse_fn, SubLObject filter_col, SubLObject filter_mt)
  {
    if( debug == UNPROVIDED )
    {
      debug = NIL;
    }
    if( generation_fn == UNPROVIDED )
    {
      generation_fn = $sym143$GENERATE_PHRASE;
    }
    if( parse_fn == UNPROVIDED )
    {
      parse_fn = $sym161$TERMS_FOR_BROWSING;
    }
    if( filter_col == UNPROVIDED )
    {
      filter_col = NIL;
    }
    if( filter_mt == UNPROVIDED )
    {
      filter_mt = NIL;
    }
    SubLObject v_forts = NIL;
    SubLObject cdolist_list_var = fort_key_list;
    SubLObject fort_key = NIL;
    fort_key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject input_prefix_string = string_utilities.string_from_keyword( fort_key );
      final SubLObject remove_key = string_utilities.keyword_from_string( Sequences.cconcatenate( input_prefix_string, $str178$_REMOVE ) );
      if( NIL != get_arghash_value( remove_key, arghash ) )
      {
        html_arghash_nl_fort_input_clear( arghash, fort_key );
      }
      html_arghash_nl_fort_input_validate( arghash, fort_key, debug, generation_fn, parse_fn, filter_col, filter_mt );
      if( NIL != forts.fort_p( get_arghash_value( fort_key, arghash ) ) )
      {
        v_forts = ConsesLow.cons( get_arghash_value( fort_key, arghash ), v_forts );
      }
      v_forts = Sequences.nreverse( v_forts );
      set_arghash_value_list( fort_list_key, arghash, v_forts );
      cdolist_list_var = cdolist_list_var.rest();
      fort_key = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 46687L)
  public static SubLObject arghash_fort_key_list(final SubLObject n)
  {
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    SubLObject result = NIL;
    SubLObject m;
    for( m = NIL, m = ZERO_INTEGER; m.numL( n ); m = Numbers.add( m, ONE_INTEGER ) )
    {
      result = ConsesLow.cons( Symbols.make_keyword( Sequences.cconcatenate( $str186$X, format_nil.format_nil_a_no_copy( m ) ) ), result );
    }
    return Sequences.nreverse( result );
  }

  public static SubLObject declare_html_arghash_file()
  {
    SubLFiles.declareFunction( me, "print_arghash_type", "PRINT-ARGHASH-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "arghash_type_print_function_trampoline", "ARGHASH-TYPE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "arghash_type_p", "ARGHASH-TYPE-P", 1, 0, false );
    new $arghash_type_p$UnaryFunction();
    SubLFiles.declareFunction( me, "arghash_type_name", "ARGHASH-TYPE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_type_keyword", "ARGHASH-TYPE-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_type_character", "ARGHASH-TYPE-CHARACTER", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_type_string_validator", "ARGHASH-TYPE-STRING-VALIDATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_type_string_to_object_fn", "ARGHASH-TYPE-STRING-TO-OBJECT-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_type_object_detector", "ARGHASH-TYPE-OBJECT-DETECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_type_object_to_string_fn", "ARGHASH-TYPE-OBJECT-TO-STRING-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_type_priority", "ARGHASH-TYPE-PRIORITY", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_arghash_type_name", "_CSETF-ARGHASH-TYPE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_arghash_type_keyword", "_CSETF-ARGHASH-TYPE-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_arghash_type_character", "_CSETF-ARGHASH-TYPE-CHARACTER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_arghash_type_string_validator", "_CSETF-ARGHASH-TYPE-STRING-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_arghash_type_string_to_object_fn", "_CSETF-ARGHASH-TYPE-STRING-TO-OBJECT-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_arghash_type_object_detector", "_CSETF-ARGHASH-TYPE-OBJECT-DETECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_arghash_type_object_to_string_fn", "_CSETF-ARGHASH-TYPE-OBJECT-TO-STRING-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_arghash_type_priority", "_CSETF-ARGHASH-TYPE-PRIORITY", 2, 0, false );
    SubLFiles.declareFunction( me, "make_arghash_type", "MAKE-ARGHASH-TYPE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_arghash_type", "VISIT-DEFSTRUCT-ARGHASH-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_arghash_type_method", "VISIT-DEFSTRUCT-OBJECT-ARGHASH-TYPE-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "defarghash_type", "DEFARGHASH-TYPE" );
    SubLFiles.declareFunction( me, "arghash_keyword_to_arghash_type", "ARGHASH-KEYWORD-TO-ARGHASH-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_character_to_arghash_type", "ARGHASH-CHARACTER-TO-ARGHASH-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_keywordP", "ARGHASH-KEYWORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_types", "ARGHASH-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "arghash_string_to_keyword", "ARGHASH-STRING-TO-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_keyword_to_string", "ARGHASH-KEYWORD-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_fort_to_string", "ARGHASH-FORT-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_string_to_fort", "ARGHASH-STRING-TO-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_assertion_to_string", "ARGHASH-ASSERTION-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_string_to_assertion", "ARGHASH-STRING-TO-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_string_to_integer", "ARGHASH-STRING-TO-INTEGER", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_integer_to_string", "ARGHASH-INTEGER-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_boolean_string_to_boolean", "ARGHASH-BOOLEAN-STRING-TO-BOOLEAN", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_boolean_detector", "ARGHASH-BOOLEAN-DETECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_boolean_to_boolean_string", "ARGHASH-BOOLEAN-TO-BOOLEAN-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_prefixed_string_to_object", "ARGHASH-PREFIXED-STRING-TO-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_string_to_list", "ARGHASH-STRING-TO-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_list_to_string", "ARGHASH-LIST-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_string_to_el_formula", "ARGHASH-STRING-TO-EL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_el_formula_to_string", "ARGHASH-EL-FORMULA-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_default_to_string", "ARGHASH-DEFAULT-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "arghash_handle_string", "ARGHASH-HANDLE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "arghash_parse_key_and_value", "ARGHASH-PARSE-KEY-AND-VALUE", 1, 1, false );
    SubLFiles.declareFunction( me, "arghash_get_handler_char_and_string", "ARGHASH-GET-HANDLER-CHAR-AND-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "arghash_get_string", "ARGHASH-GET-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "arghash_make_key_and_value_strings", "ARGHASH-MAKE-KEY-AND-VALUE-STRINGS", 2, 1, false );
    SubLFiles.declareFunction( me, "arghash_make_key_string", "ARGHASH-MAKE-KEY-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "exists_arghash_valueP", "EXISTS-ARGHASH-VALUE?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_arghash_value", "GET-ARGHASH-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_arghash_value_list", "GET-ARGHASH-VALUE-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "set_arghash_value", "SET-ARGHASH-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_arghash_value_list", "SET-ARGHASH-VALUE-LIST", 3, 0, false );
    SubLFiles.declareFunction( me, "push_arghash_value", "PUSH-ARGHASH-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "pushnew_arghash_value", "PUSHNEW-ARGHASH-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "rem_arghash_value", "REM-ARGHASH-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "rem_arghash_values", "REM-ARGHASH-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "rem_arghash_values_inverse", "REM-ARGHASH-VALUES-INVERSE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_arghash", "NEW-ARGHASH", 0, 1, false );
    SubLFiles.declareFunction( me, "arghash_p", "ARGHASH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_arghash", "COPY-ARGHASH", 1, 0, false );
    SubLFiles.declareFunction( me, "get_arghash_keys", "GET-ARGHASH-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "arglist_to_arghash", "ARGLIST-TO-ARGHASH", 1, 0, false );
    SubLFiles.declareFunction( me, "argassoc_to_arghash", "ARGASSOC-TO-ARGHASH", 1, 0, false );
    SubLFiles.declareFunction( me, "html_arghash_href", "HTML-ARGHASH-HREF", 2, 0, false );
    SubLFiles.declareMacro( me, "html_arghash_fancy_anchor", "HTML-ARGHASH-FANCY-ANCHOR" );
    SubLFiles.declareFunction( me, "html_arghash_checkbox_input", "HTML-ARGHASH-CHECKBOX-INPUT", 3, 2, false );
    SubLFiles.declareFunction( me, "html_arghash_radio_input", "HTML-ARGHASH-RADIO-INPUT", 3, 0, false );
    SubLFiles.declareFunction( me, "html_arghash_focus_radio_input", "HTML-ARGHASH-FOCUS-RADIO-INPUT", 5, 1, false );
    SubLFiles.declareFunction( me, "html_arghash_clear_radio_input", "HTML-ARGHASH-CLEAR-RADIO-INPUT", 5, 1, false );
    SubLFiles.declareFunction( me, "html_arghash_hidden_input", "HTML-ARGHASH-HIDDEN-INPUT", 2, 2, false );
    SubLFiles.declareFunction( me, "html_arghash_hidden_input_force", "HTML-ARGHASH-HIDDEN-INPUT-FORCE", 3, 2, false );
    SubLFiles.declareMacro( me, "html_arghash_fancy_select", "HTML-ARGHASH-FANCY-SELECT" );
    SubLFiles.declareMacro( me, "html_arghash_fancy_option", "HTML-ARGHASH-FANCY-OPTION" );
    SubLFiles.declareMacro( me, "html_arghash_fancy_select_with_options", "HTML-ARGHASH-FANCY-SELECT-WITH-OPTIONS" );
    SubLFiles.declareFunction( me, "html_arghash_submit_input", "HTML-ARGHASH-SUBMIT-INPUT", 3, 1, false );
    SubLFiles.declareFunction( me, "html_arghash_clear_input_button", "HTML-ARGHASH-CLEAR-INPUT-BUTTON", 3, 1, false );
    SubLFiles.declareFunction( me, "html_arghash_complete_button", "HTML-ARGHASH-COMPLETE-BUTTON", 3, 3, false );
    SubLFiles.declareFunction( me, "html_arghash_text_input", "HTML-ARGHASH-TEXT-INPUT", 2, 3, false );
    SubLFiles.declareFunction( me, "html_arghash_textarea_input", "HTML-ARGHASH-TEXTAREA-INPUT", 2, 5, false );
    SubLFiles.declareFunction( me, "html_arghash_fort_input", "HTML-ARGHASH-FORT-INPUT", 2, 4, false );
    SubLFiles.declareFunction( me, "html_arghash_sentence_input", "HTML-ARGHASH-SENTENCE-INPUT", 2, 6, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_input", "HTML-ARGHASH-NL-FORT-INPUT", 2, 5, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_input_invisible", "HTML-ARGHASH-NL-FORT-INPUT-INVISIBLE", 2, 0, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_input_activeP", "HTML-ARGHASH-NL-FORT-INPUT-ACTIVE?", 2, 0, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_input_doneP", "HTML-ARGHASH-NL-FORT-INPUT-DONE?", 2, 0, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_input_clear", "HTML-ARGHASH-NL-FORT-INPUT-CLEAR", 2, 0, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_input_force_default_if_unset", "HTML-ARGHASH-NL-FORT-INPUT-FORCE-DEFAULT-IF-UNSET", 3, 2, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_list_input_set_forts", "HTML-ARGHASH-NL-FORT-LIST-INPUT-SET-FORTS", 4, 1, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_input_set_fort", "HTML-ARGHASH-NL-FORT-INPUT-SET-FORT", 3, 1, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_input_validate", "HTML-ARGHASH-NL-FORT-INPUT-VALIDATE", 2, 5, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_list_input", "HTML-ARGHASH-NL-FORT-LIST-INPUT", 3, 6, false );
    SubLFiles.declareFunction( me, "html_arghash_nl_fort_list_input_validate", "HTML-ARGHASH-NL-FORT-LIST-INPUT-VALIDATE", 3, 5, false );
    SubLFiles.declareFunction( me, "arghash_fort_key_list", "ARGHASH-FORT-KEY-LIST", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_html_arghash_file()
  {
    $arghash_types$ = SubLFiles.defparameter( "*ARGHASH-TYPES*", NIL );
    $arghash_types_by_keyword$ = SubLFiles.defparameter( "*ARGHASH-TYPES-BY-KEYWORD*", Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $arghash_types_by_character$ = SubLFiles.defparameter( "*ARGHASH-TYPES-BY-CHARACTER*", Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $dtp_arghash_type$ = SubLFiles.defconstant( "*DTP-ARGHASH-TYPE*", $sym1$ARGHASH_TYPE );
    return NIL;
  }

  public static SubLObject setup_html_arghash_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_arghash_type$.getGlobalValue(), Symbols.symbol_function( $sym8$ARGHASH_TYPE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$ARGHASH_TYPE_NAME, $sym11$_CSETF_ARGHASH_TYPE_NAME );
    Structures.def_csetf( $sym12$ARGHASH_TYPE_KEYWORD, $sym13$_CSETF_ARGHASH_TYPE_KEYWORD );
    Structures.def_csetf( $sym14$ARGHASH_TYPE_CHARACTER, $sym15$_CSETF_ARGHASH_TYPE_CHARACTER );
    Structures.def_csetf( $sym16$ARGHASH_TYPE_STRING_VALIDATOR, $sym17$_CSETF_ARGHASH_TYPE_STRING_VALIDATOR );
    Structures.def_csetf( $sym18$ARGHASH_TYPE_STRING_TO_OBJECT_FN, $sym19$_CSETF_ARGHASH_TYPE_STRING_TO_OBJECT_FN );
    Structures.def_csetf( $sym20$ARGHASH_TYPE_OBJECT_DETECTOR, $sym21$_CSETF_ARGHASH_TYPE_OBJECT_DETECTOR );
    Structures.def_csetf( $sym22$ARGHASH_TYPE_OBJECT_TO_STRING_FN, $sym23$_CSETF_ARGHASH_TYPE_OBJECT_TO_STRING_FN );
    Structures.def_csetf( $sym24$ARGHASH_TYPE_PRIORITY, $sym25$_CSETF_ARGHASH_TYPE_PRIORITY );
    Equality.identity( $sym1$ARGHASH_TYPE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_arghash_type$.getGlobalValue(), Symbols.symbol_function( $sym39$VISIT_DEFSTRUCT_OBJECT_ARGHASH_TYPE_METHOD ) );
    SubLObject new_arghash_type = make_arghash_type( $list54 );
    _csetf_arghash_type_name( new_arghash_type, $sym55$KEYWORD );
    Hashtables.sethash( arghash_type_keyword( new_arghash_type ), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type );
    Hashtables.sethash( arghash_type_character( new_arghash_type ), $arghash_types_by_character$.getDynamicValue(), new_arghash_type );
    $arghash_types$.setDynamicValue( ConsesLow.cons( new_arghash_type, Sequences.delete( $sym55$KEYWORD, $arghash_types$.getDynamicValue(), Symbols.symbol_function( EQUAL ), $sym10$ARGHASH_TYPE_NAME, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    new_arghash_type = make_arghash_type( $list58 );
    _csetf_arghash_type_name( new_arghash_type, $sym59$FORT );
    Hashtables.sethash( arghash_type_keyword( new_arghash_type ), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type );
    Hashtables.sethash( arghash_type_character( new_arghash_type ), $arghash_types_by_character$.getDynamicValue(), new_arghash_type );
    $arghash_types$.setDynamicValue( ConsesLow.cons( new_arghash_type, Sequences.delete( $sym59$FORT, $arghash_types$.getDynamicValue(), Symbols.symbol_function( EQUAL ), $sym10$ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) );
    new_arghash_type = make_arghash_type( $list60 );
    _csetf_arghash_type_name( new_arghash_type, $sym61$ASSERTION );
    Hashtables.sethash( arghash_type_keyword( new_arghash_type ), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type );
    Hashtables.sethash( arghash_type_character( new_arghash_type ), $arghash_types_by_character$.getDynamicValue(), new_arghash_type );
    $arghash_types$.setDynamicValue( ConsesLow.cons( new_arghash_type, Sequences.delete( $sym61$ASSERTION, $arghash_types$.getDynamicValue(), Symbols.symbol_function( EQUAL ), $sym10$ARGHASH_TYPE_NAME, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    new_arghash_type = make_arghash_type( $list62 );
    _csetf_arghash_type_name( new_arghash_type, $sym63$INTEGER );
    Hashtables.sethash( arghash_type_keyword( new_arghash_type ), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type );
    Hashtables.sethash( arghash_type_character( new_arghash_type ), $arghash_types_by_character$.getDynamicValue(), new_arghash_type );
    $arghash_types$.setDynamicValue( ConsesLow.cons( new_arghash_type, Sequences.delete( $sym63$INTEGER, $arghash_types$.getDynamicValue(), Symbols.symbol_function( EQUAL ), $sym10$ARGHASH_TYPE_NAME, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    new_arghash_type = make_arghash_type( $list64 );
    _csetf_arghash_type_name( new_arghash_type, $sym65$BOOLEAN );
    Hashtables.sethash( arghash_type_keyword( new_arghash_type ), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type );
    Hashtables.sethash( arghash_type_character( new_arghash_type ), $arghash_types_by_character$.getDynamicValue(), new_arghash_type );
    $arghash_types$.setDynamicValue( ConsesLow.cons( new_arghash_type, Sequences.delete( $sym65$BOOLEAN, $arghash_types$.getDynamicValue(), Symbols.symbol_function( EQUAL ), $sym10$ARGHASH_TYPE_NAME, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    new_arghash_type = make_arghash_type( $list69 );
    _csetf_arghash_type_name( new_arghash_type, $sym70$LIST );
    Hashtables.sethash( arghash_type_keyword( new_arghash_type ), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type );
    Hashtables.sethash( arghash_type_character( new_arghash_type ), $arghash_types_by_character$.getDynamicValue(), new_arghash_type );
    $arghash_types$.setDynamicValue( ConsesLow.cons( new_arghash_type, Sequences.delete( $sym70$LIST, $arghash_types$.getDynamicValue(), Symbols.symbol_function( EQUAL ), $sym10$ARGHASH_TYPE_NAME, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) );
    new_arghash_type = make_arghash_type( $list80 );
    _csetf_arghash_type_name( new_arghash_type, $sym81$EL_FORMULA );
    Hashtables.sethash( arghash_type_keyword( new_arghash_type ), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type );
    Hashtables.sethash( arghash_type_character( new_arghash_type ), $arghash_types_by_character$.getDynamicValue(), new_arghash_type );
    $arghash_types$.setDynamicValue( ConsesLow.cons( new_arghash_type, Sequences.delete( $sym81$EL_FORMULA, $arghash_types$.getDynamicValue(), Symbols.symbol_function( EQUAL ), $sym10$ARGHASH_TYPE_NAME, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    new_arghash_type = make_arghash_type( $list82 );
    _csetf_arghash_type_name( new_arghash_type, $sym83$DEFAULT );
    Hashtables.sethash( arghash_type_keyword( new_arghash_type ), $arghash_types_by_keyword$.getDynamicValue(), new_arghash_type );
    Hashtables.sethash( arghash_type_character( new_arghash_type ), $arghash_types_by_character$.getDynamicValue(), new_arghash_type );
    $arghash_types$.setDynamicValue( ConsesLow.cons( new_arghash_type, Sequences.delete( $sym83$DEFAULT, $arghash_types$.getDynamicValue(), Symbols.symbol_function( EQUAL ), $sym10$ARGHASH_TYPE_NAME, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_html_arghash_file();
  }

  @Override
  public void initializeVariables()
  {
    init_html_arghash_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_html_arghash_file();
  }
  static
  {
    me = new html_arghash();
    $arghash_types$ = null;
    $arghash_types_by_keyword$ = null;
    $arghash_types_by_character$ = null;
    $dtp_arghash_type$ = null;
    $str0$_ = makeString( "#" );
    $sym1$ARGHASH_TYPE = makeSymbol( "ARGHASH-TYPE" );
    $sym2$ARGHASH_TYPE_P = makeSymbol( "ARGHASH-TYPE-P" );
    $list3 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "KEYWORD" ), makeSymbol( "CHARACTER" ), makeSymbol( "STRING-VALIDATOR" ), makeSymbol( "STRING-TO-OBJECT-FN" ), makeSymbol( "OBJECT-DETECTOR" ), makeSymbol(
        "OBJECT-TO-STRING-FN" ), makeSymbol( "PRIORITY" ) );
    $list4 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "KEYWORD" ), makeKeyword( "CHARACTER" ), makeKeyword( "STRING-VALIDATOR" ), makeKeyword( "STRING-TO-OBJECT-FN" ), makeKeyword( "OBJECT-DETECTOR" ),
        makeKeyword( "OBJECT-TO-STRING-FN" ), makeKeyword( "PRIORITY" ) );
    $list5 = ConsesLow.list( makeSymbol( "ARGHASH-TYPE-NAME" ), makeSymbol( "ARGHASH-TYPE-KEYWORD" ), makeSymbol( "ARGHASH-TYPE-CHARACTER" ), makeSymbol( "ARGHASH-TYPE-STRING-VALIDATOR" ), makeSymbol(
        "ARGHASH-TYPE-STRING-TO-OBJECT-FN" ), makeSymbol( "ARGHASH-TYPE-OBJECT-DETECTOR" ), makeSymbol( "ARGHASH-TYPE-OBJECT-TO-STRING-FN" ), makeSymbol( "ARGHASH-TYPE-PRIORITY" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-ARGHASH-TYPE-NAME" ), makeSymbol( "_CSETF-ARGHASH-TYPE-KEYWORD" ), makeSymbol( "_CSETF-ARGHASH-TYPE-CHARACTER" ), makeSymbol( "_CSETF-ARGHASH-TYPE-STRING-VALIDATOR" ),
        makeSymbol( "_CSETF-ARGHASH-TYPE-STRING-TO-OBJECT-FN" ), makeSymbol( "_CSETF-ARGHASH-TYPE-OBJECT-DETECTOR" ), makeSymbol( "_CSETF-ARGHASH-TYPE-OBJECT-TO-STRING-FN" ), makeSymbol(
            "_CSETF-ARGHASH-TYPE-PRIORITY" ) );
    $sym7$PRINT_ARGHASH_TYPE = makeSymbol( "PRINT-ARGHASH-TYPE" );
    $sym8$ARGHASH_TYPE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ARGHASH-TYPE-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ARGHASH-TYPE-P" ) );
    $sym10$ARGHASH_TYPE_NAME = makeSymbol( "ARGHASH-TYPE-NAME" );
    $sym11$_CSETF_ARGHASH_TYPE_NAME = makeSymbol( "_CSETF-ARGHASH-TYPE-NAME" );
    $sym12$ARGHASH_TYPE_KEYWORD = makeSymbol( "ARGHASH-TYPE-KEYWORD" );
    $sym13$_CSETF_ARGHASH_TYPE_KEYWORD = makeSymbol( "_CSETF-ARGHASH-TYPE-KEYWORD" );
    $sym14$ARGHASH_TYPE_CHARACTER = makeSymbol( "ARGHASH-TYPE-CHARACTER" );
    $sym15$_CSETF_ARGHASH_TYPE_CHARACTER = makeSymbol( "_CSETF-ARGHASH-TYPE-CHARACTER" );
    $sym16$ARGHASH_TYPE_STRING_VALIDATOR = makeSymbol( "ARGHASH-TYPE-STRING-VALIDATOR" );
    $sym17$_CSETF_ARGHASH_TYPE_STRING_VALIDATOR = makeSymbol( "_CSETF-ARGHASH-TYPE-STRING-VALIDATOR" );
    $sym18$ARGHASH_TYPE_STRING_TO_OBJECT_FN = makeSymbol( "ARGHASH-TYPE-STRING-TO-OBJECT-FN" );
    $sym19$_CSETF_ARGHASH_TYPE_STRING_TO_OBJECT_FN = makeSymbol( "_CSETF-ARGHASH-TYPE-STRING-TO-OBJECT-FN" );
    $sym20$ARGHASH_TYPE_OBJECT_DETECTOR = makeSymbol( "ARGHASH-TYPE-OBJECT-DETECTOR" );
    $sym21$_CSETF_ARGHASH_TYPE_OBJECT_DETECTOR = makeSymbol( "_CSETF-ARGHASH-TYPE-OBJECT-DETECTOR" );
    $sym22$ARGHASH_TYPE_OBJECT_TO_STRING_FN = makeSymbol( "ARGHASH-TYPE-OBJECT-TO-STRING-FN" );
    $sym23$_CSETF_ARGHASH_TYPE_OBJECT_TO_STRING_FN = makeSymbol( "_CSETF-ARGHASH-TYPE-OBJECT-TO-STRING-FN" );
    $sym24$ARGHASH_TYPE_PRIORITY = makeSymbol( "ARGHASH-TYPE-PRIORITY" );
    $sym25$_CSETF_ARGHASH_TYPE_PRIORITY = makeSymbol( "_CSETF-ARGHASH-TYPE-PRIORITY" );
    $kw26$NAME = makeKeyword( "NAME" );
    $kw27$KEYWORD = makeKeyword( "KEYWORD" );
    $kw28$CHARACTER = makeKeyword( "CHARACTER" );
    $kw29$STRING_VALIDATOR = makeKeyword( "STRING-VALIDATOR" );
    $kw30$STRING_TO_OBJECT_FN = makeKeyword( "STRING-TO-OBJECT-FN" );
    $kw31$OBJECT_DETECTOR = makeKeyword( "OBJECT-DETECTOR" );
    $kw32$OBJECT_TO_STRING_FN = makeKeyword( "OBJECT-TO-STRING-FN" );
    $kw33$PRIORITY = makeKeyword( "PRIORITY" );
    $str34$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw35$BEGIN = makeKeyword( "BEGIN" );
    $sym36$MAKE_ARGHASH_TYPE = makeSymbol( "MAKE-ARGHASH-TYPE" );
    $kw37$SLOT = makeKeyword( "SLOT" );
    $kw38$END = makeKeyword( "END" );
    $sym39$VISIT_DEFSTRUCT_OBJECT_ARGHASH_TYPE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ARGHASH-TYPE-METHOD" );
    $list40 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&REST" ), makeSymbol( "ARGLIST" ) );
    $sym41$NEW_ARGHASH_TYPE = makeUninternedSymbol( "NEW-ARGHASH-TYPE" );
    $sym42$CLET = makeSymbol( "CLET" );
    $sym43$QUOTE = makeSymbol( "QUOTE" );
    $sym44$CSETF = makeSymbol( "CSETF" );
    $sym45$SETHASH = makeSymbol( "SETHASH" );
    $sym46$_ARGHASH_TYPES_BY_KEYWORD_ = makeSymbol( "*ARGHASH-TYPES-BY-KEYWORD*" );
    $sym47$_ARGHASH_TYPES_BY_CHARACTER_ = makeSymbol( "*ARGHASH-TYPES-BY-CHARACTER*" );
    $sym48$CSETQ = makeSymbol( "CSETQ" );
    $sym49$_ARGHASH_TYPES_ = makeSymbol( "*ARGHASH-TYPES*" );
    $sym50$CONS = makeSymbol( "CONS" );
    $sym51$DELETE = makeSymbol( "DELETE" );
    $list52 = ConsesLow.list( makeSymbol( "*ARGHASH-TYPES*" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ARGHASH-TYPE-NAME" ) ) );
    $sym53$_ = makeSymbol( "<" );
    $list54 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "keyword" ), makeKeyword( "KEYWORD" ), makeKeyword( "KEYWORD" ), makeKeyword( "CHARACTER" ), Characters.CHAR_colon, makeKeyword(
        "STRING-VALIDATOR" ), makeSymbol( "STRINGP" ), makeKeyword( "STRING-TO-OBJECT-FN" ), makeSymbol( "ARGHASH-STRING-TO-KEYWORD" ), makeKeyword( "OBJECT-DETECTOR" ), makeSymbol( "KEYWORDP" ), makeKeyword(
            "OBJECT-TO-STRING-FN" ), makeSymbol( "ARGHASH-KEYWORD-TO-STRING" ), makeKeyword( "PRIORITY" ), ONE_INTEGER
    } );
    $sym55$KEYWORD = makeSymbol( "KEYWORD" );
    $str56$_A = makeString( "~A" );
    $str57$ = makeString( "" );
    $list58 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "fort" ), makeKeyword( "KEYWORD" ), makeKeyword( "FORT" ), makeKeyword( "CHARACTER" ), Characters.CHAR_dollar, makeKeyword(
        "STRING-VALIDATOR" ), makeSymbol( "STRINGP" ), makeKeyword( "STRING-TO-OBJECT-FN" ), makeSymbol( "ARGHASH-STRING-TO-FORT" ), makeKeyword( "OBJECT-DETECTOR" ), makeSymbol( "FORT-P" ), makeKeyword(
            "OBJECT-TO-STRING-FN" ), makeSymbol( "ARGHASH-FORT-TO-STRING" ), makeKeyword( "PRIORITY" ), TWO_INTEGER
    } );
    $sym59$FORT = makeSymbol( "FORT" );
    $list60 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "assertion" ), makeKeyword( "KEYWORD" ), makeKeyword( "ASSERTION" ), makeKeyword( "CHARACTER" ), Characters.CHAR_a, makeKeyword(
        "STRING-VALIDATOR" ), makeSymbol( "NUMBER-STRING-P" ), makeKeyword( "STRING-TO-OBJECT-FN" ), makeSymbol( "ARGHASH-STRING-TO-ASSERTION" ), makeKeyword( "OBJECT-DETECTOR" ), makeSymbol( "ASSERTION-P" ),
      makeKeyword( "OBJECT-TO-STRING-FN" ), makeSymbol( "ARGHASH-ASSERTION-TO-STRING" ), makeKeyword( "PRIORITY" ), TWO_INTEGER
    } );
    $sym61$ASSERTION = makeSymbol( "ASSERTION" );
    $list62 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "integer" ), makeKeyword( "KEYWORD" ), makeKeyword( "INTEGER" ), makeKeyword( "CHARACTER" ), Characters.CHAR_period, makeKeyword(
        "STRING-VALIDATOR" ), makeSymbol( "NUMBER-STRING-P" ), makeKeyword( "STRING-TO-OBJECT-FN" ), makeSymbol( "ARGHASH-STRING-TO-INTEGER" ), makeKeyword( "OBJECT-DETECTOR" ), makeSymbol( "INTEGERP" ), makeKeyword(
            "OBJECT-TO-STRING-FN" ), makeSymbol( "ARGHASH-INTEGER-TO-STRING" ), makeKeyword( "PRIORITY" ), THREE_INTEGER
    } );
    $sym63$INTEGER = makeSymbol( "INTEGER" );
    $list64 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "boolean" ), makeKeyword( "KEYWORD" ), makeKeyword( "BOOLEAN" ), makeKeyword( "CHARACTER" ), Characters.CHAR_question, makeKeyword(
        "STRING-VALIDATOR" ), NIL, makeKeyword( "STRING-TO-OBJECT-FN" ), makeSymbol( "ARGHASH-BOOLEAN-STRING-TO-BOOLEAN" ), makeKeyword( "OBJECT-DETECTOR" ), makeSymbol( "ARGHASH-BOOLEAN-DETECTOR" ), makeKeyword(
            "OBJECT-TO-STRING-FN" ), makeSymbol( "ARGHASH-BOOLEAN-TO-BOOLEAN-STRING" ), makeKeyword( "PRIORITY" ), FOUR_INTEGER
    } );
    $sym65$BOOLEAN = makeSymbol( "BOOLEAN" );
    $str66$NIL = makeString( "NIL" );
    $str67$nil = makeString( "nil" );
    $str68$t = makeString( "t" );
    $list69 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "list" ), makeKeyword( "KEYWORD" ), makeKeyword( "LIST" ), makeKeyword( "CHARACTER" ), Characters.CHAR_lparen, makeKeyword(
        "STRING-VALIDATOR" ), NIL, makeKeyword( "STRING-TO-OBJECT-FN" ), makeSymbol( "ARGHASH-STRING-TO-LIST" ), makeKeyword( "OBJECT-DETECTOR" ), makeSymbol( "CONSP" ), makeKeyword( "OBJECT-TO-STRING-FN" ), makeSymbol(
            "ARGHASH-LIST-TO-STRING" ), makeKeyword( "PRIORITY" ), FIVE_INTEGER
    } );
    $sym70$LIST = makeSymbol( "LIST" );
    $str71$_ = makeString( " " );
    $str72$_20 = makeString( "%20" );
    $str73$_ = makeString( "+" );
    $sym74$ARGHASH_PREFIXED_STRING_TO_OBJECT = makeSymbol( "ARGHASH-PREFIXED-STRING-TO-OBJECT" );
    $sym75$STRINGP = makeSymbol( "STRINGP" );
    $str76$_ = makeString( "(" );
    $str77$_ = makeString( "_" );
    $str78$_ = makeString( ")" );
    $sym79$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $list80 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "el-formula" ), makeKeyword( "KEYWORD" ), makeKeyword( "EL-FORMULA" ), makeKeyword( "CHARACTER" ), Characters.CHAR_lbrace, makeKeyword(
        "STRING-VALIDATOR" ), NIL, makeKeyword( "STRING-TO-OBJECT-FN" ), makeSymbol( "ARGHASH-STRING-TO-EL-FORMULA" ), makeKeyword( "OBJECT-DETECTOR" ), NIL, makeKeyword( "OBJECT-TO-STRING-FN" ), makeSymbol(
            "ARGHASH-EL-FORMULA-TO-STRING" ), makeKeyword( "PRIORITY" ), makeInteger( 888 )
    } );
    $sym81$EL_FORMULA = makeSymbol( "EL-FORMULA" );
    $list82 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "default" ), makeKeyword( "KEYWORD" ), makeKeyword( "DEFAULT" ), makeKeyword( "CHARACTER" ), Characters.CHAR_underbar, makeKeyword(
        "STRING-VALIDATOR" ), makeSymbol( "TRUE" ), makeKeyword( "STRING-TO-OBJECT-FN" ), IDENTITY, makeKeyword( "OBJECT-DETECTOR" ), makeSymbol( "TRUE" ), makeKeyword( "OBJECT-TO-STRING-FN" ), makeSymbol(
            "ARGHASH-DEFAULT-TO-STRING" ), makeKeyword( "PRIORITY" ), makeInteger( 999 )
    } );
    $sym83$DEFAULT = makeSymbol( "DEFAULT" );
    $kw84$DEFAULT = makeKeyword( "DEFAULT" );
    $str85$___A = makeString( "--~A" );
    $int86$32 = makeInteger( 32 );
    $kw87$JUST_FORT = makeKeyword( "JUST-FORT" );
    $kw88$JUST_STRING = makeKeyword( "JUST-STRING" );
    $str89$_ = makeString( "&" );
    $str90$_ = makeString( "=" );
    $list91 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGHASH" ), makeSymbol( "HTML-HANDLER-NAME" ), makeSymbol( "&KEY" ), makeSymbol( "NAME" ), makeSymbol( "TARGET" ), makeSymbol( "SCRIPT" ), makeSymbol(
        "STYLE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list92 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "TARGET" ), makeKeyword( "SCRIPT" ), makeKeyword( "STYLE" ) );
    $kw93$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw94$TARGET = makeKeyword( "TARGET" );
    $kw95$SCRIPT = makeKeyword( "SCRIPT" );
    $kw96$STYLE = makeKeyword( "STYLE" );
    $sym97$HREF = makeUninternedSymbol( "HREF" );
    $sym98$FORMAT = makeSymbol( "FORMAT" );
    $str99$_A__A = makeString( "~A?~A" );
    $sym100$_CYC_CGI_PROGRAM_ = makeSymbol( "*CYC-CGI-PROGRAM*" );
    $sym101$HTML_ARGHASH_HREF = makeSymbol( "HTML-ARGHASH-HREF" );
    $sym102$HTML_FANCY_ANCHOR = makeSymbol( "HTML-FANCY-ANCHOR" );
    $kw103$HREF = makeKeyword( "HREF" );
    $list104 = ConsesLow.list( NIL );
    $list105 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE-TYPE" ), makeSymbol( "&KEY" ), makeSymbol( "MULTIPLE" ), makeSymbol( "SIZE" ), makeSymbol( "SCRIPT" ), makeSymbol( "ONCHANGE" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list106 = ConsesLow.list( makeKeyword( "MULTIPLE" ), makeKeyword( "SIZE" ), makeKeyword( "SCRIPT" ), makeKeyword( "ONCHANGE" ) );
    $kw107$MULTIPLE = makeKeyword( "MULTIPLE" );
    $kw108$SIZE = makeKeyword( "SIZE" );
    $kw109$ONCHANGE = makeKeyword( "ONCHANGE" );
    $sym110$KEY_STRING = makeUninternedSymbol( "KEY-STRING" );
    $sym111$ARGHASH_MAKE_KEY_STRING = makeSymbol( "ARGHASH-MAKE-KEY-STRING" );
    $sym112$HTML_FANCY_SELECT = makeSymbol( "HTML-FANCY-SELECT" );
    $list113 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGHASH" ), makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "VALUE-TYPE" ), makeKeyword( "DEFAULT" ) ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym114$VALUE_STRING = makeUninternedSymbol( "VALUE-STRING" );
    $sym115$SELECTED = makeUninternedSymbol( "SELECTED" );
    $sym116$MEMBER_EQUAL_ = makeSymbol( "MEMBER-EQUAL?" );
    $sym117$GET_ARGHASH_VALUE_LIST = makeSymbol( "GET-ARGHASH-VALUE-LIST" );
    $sym118$ARGHASH_GET_STRING = makeSymbol( "ARGHASH-GET-STRING" );
    $sym119$HTML_FANCY_OPTION = makeSymbol( "HTML-FANCY-OPTION" );
    $kw120$SELECTED = makeKeyword( "SELECTED" );
    $kw121$VALUE = makeKeyword( "VALUE" );
    $list122 = ConsesLow.list( new SubLObject[] { makeSymbol( "ARGHASH" ), makeSymbol( "KEY" ), makeSymbol( "VALUE-TYPE" ), makeSymbol( "VALUES" ), makeSymbol( "VALUE-STRINGS" ), makeSymbol( "&KEY" ), makeSymbol(
        "MULTIPLE" ), makeSymbol( "SIZE" ), makeSymbol( "SCRIPT" ), makeSymbol( "ONCHANGE" )
    } );
    $sym123$VALUE = makeUninternedSymbol( "VALUE" );
    $sym124$VALUE_STRING = makeUninternedSymbol( "VALUE-STRING" );
    $sym125$HTML_ARGHASH_FANCY_SELECT = makeSymbol( "HTML-ARGHASH-FANCY-SELECT" );
    $sym126$CDOLIST_MULTIPLE = makeSymbol( "CDOLIST-MULTIPLE" );
    $sym127$HTML_ARGHASH_FANCY_OPTION = makeSymbol( "HTML-ARGHASH-FANCY-OPTION" );
    $sym128$HTML_PRINC = makeSymbol( "HTML-PRINC" );
    $kw129$BOOLEAN = makeKeyword( "BOOLEAN" );
    $str130$Complete = makeString( "Complete" );
    $str131$virtual = makeString( "virtual" );
    $kw132$NBSP = makeKeyword( "NBSP" );
    $kw133$FORT = makeKeyword( "FORT" );
    $str134$Cyclify = makeString( "Cyclify" );
    $str135$Clear = makeString( "Clear" );
    $kw136$EL_FORMULA = makeKeyword( "EL-FORMULA" );
    $kw137$INPUT_NAME = makeKeyword( "INPUT-NAME" );
    $kw138$COMPLETE_LABEL = makeKeyword( "COMPLETE-LABEL" );
    $kw139$CYCLIFY_LABEL = makeKeyword( "CYCLIFY-LABEL" );
    $kw140$CLEAR_LABEL = makeKeyword( "CLEAR-LABEL" );
    $kw141$HEIGHT = makeKeyword( "HEIGHT" );
    $kw142$WIDTH = makeKeyword( "WIDTH" );
    $sym143$GENERATE_PHRASE = makeSymbol( "GENERATE-PHRASE" );
    $str144$_NEW_FORT = makeString( "_NEW_FORT" );
    $str145$_STRING = makeString( "_STRING" );
    $str146$_NEW_STRING = makeString( "_NEW_STRING" );
    $str147$_UNDO = makeString( "_UNDO" );
    $str148$_CANDIDATES = makeString( "_CANDIDATES" );
    $str149$_DONE = makeString( "_DONE" );
    $str150$_ERROR = makeString( "_ERROR" );
    $str151$_2 = makeString( "+2" );
    $str152$_ = makeString( "*" );
    $str153$onChange_javascript_this_form_sub = makeString( "onChange=javascript:this.form.submit();" );
    $str154$___ = makeString( "???" );
    $str155$Undo = makeString( "Undo" );
    $str156$Submit = makeString( "Submit" );
    $kw157$SUBMIT = makeKeyword( "SUBMIT" );
    $kw158$STRING = makeKeyword( "STRING" );
    $str159$_nl_fort_input_force_default_if_u = makeString( "(nl-fort-input-force-default-if-unset " );
    $str160$___setting_to_ = makeString( "): setting to " );
    $sym161$TERMS_FOR_BROWSING = makeSymbol( "TERMS-FOR-BROWSING" );
    $str162$_nl_fort_input_validate_ = makeString( "(nl-fort-input-validate " );
    $str163$___ = makeString( "): " );
    $str164$Case_1__clicked_undo_button = makeString( "Case 1: clicked undo button" );
    $str165$Case_2__chose_fort_from_pulldown = makeString( "Case 2: chose fort from pulldown" );
    $str166$Case_3__text_typed_in__ = makeString( "Case 3: text typed in, " );
    $sym167$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const168$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str169$Case_3a__No_parse_for___A_ = makeString( "Case 3a: No parse for \"~A\"" );
    $str170$_called__ = makeString( " called \"" );
    $str171$__not_found_ = makeString( "\" not found." );
    $str172$_ = makeString( "\"" );
    $str173$Case_3b__One_parse_for___A_____A = makeString( "Case 3b: One parse for \"~A\" = ~A" );
    $str174$Case_3c__Many_parses_for___A_____ = makeString( "Case 3c: Many parses for \"~A\" = ~A" );
    $str175$Case_4__no_text_typed_in = makeString( "Case 4: no text typed in" );
    $str176$Case_5__fort_set__so_use_fort_as_ = makeString( "Case 5: fort set, so use fort as 'new-fort'" );
    $str177$Case_6__fallthrough_ = makeString( "Case 6: fallthrough!" );
    $str178$_REMOVE = makeString( "_REMOVE" );
    $str179$Remove = makeString( "Remove" );
    $str180$_max_reached_ = makeString( "(max reached)" );
    $str181$_max_exceeded_ = makeString( "(max exceeded)" );
    $str182$_more_required_ = makeString( " more required)" );
    $sym183$FORT_NAME = makeSymbol( "FORT-NAME" );
    $str184$_key_list_length_reached_ = makeString( "(key list length reached)" );
    $sym185$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str186$X = makeString( "X" );
  }

  public static final class $arghash_type_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $keyword;
    public SubLObject $character;
    public SubLObject $string_validator;
    public SubLObject $string_to_object_fn;
    public SubLObject $object_detector;
    public SubLObject $object_to_string_fn;
    public SubLObject $priority;
    private static final SubLStructDeclNative structDecl;

    public $arghash_type_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$keyword = CommonSymbols.NIL;
      this.$character = CommonSymbols.NIL;
      this.$string_validator = CommonSymbols.NIL;
      this.$string_to_object_fn = CommonSymbols.NIL;
      this.$object_detector = CommonSymbols.NIL;
      this.$object_to_string_fn = CommonSymbols.NIL;
      this.$priority = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $arghash_type_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$keyword;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$character;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$string_validator;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$string_to_object_fn;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$object_detector;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$object_to_string_fn;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$priority;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$keyword = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$character = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$string_validator = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$string_to_object_fn = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$object_detector = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$object_to_string_fn = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$priority = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $arghash_type_native.class, $sym1$ARGHASH_TYPE, $sym2$ARGHASH_TYPE_P, $list3, $list4, new String[] { "$name", "$keyword", "$character", "$string_validator",
        "$string_to_object_fn", "$object_detector", "$object_to_string_fn", "$priority"
      }, $list5, $list6, $sym7$PRINT_ARGHASH_TYPE );
    }
  }

  public static final class $arghash_type_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $arghash_type_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ARGHASH-TYPE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return arghash_type_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 571 ms
 * 
 */