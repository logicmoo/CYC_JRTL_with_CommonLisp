package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class xml_parsing_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.xml_parsing_utilities";
  public static final String myFingerPrint = "2c2af299dd294bce3a358005e330a7011ee5c699671007ee10f3003243fc71fc";
  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 800L)
  public static SubLSymbol $require_valid_xmlP$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLSymbol $dtp_xml_token_iterator_state$;
  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 22444L)
  private static SubLSymbol $xml_token_accumulator$;
  private static final SubLSymbol $sym0$STREAMP;
  private static final SubLSymbol $sym1$ITERATE_XML_TOKEN_DONE;
  private static final SubLSymbol $sym2$ITERATE_XML_TOKEN_NEXT;
  private static final SubLSymbol $sym3$XML_TOKEN_ITERATOR_STATE;
  private static final SubLSymbol $sym4$XML_TOKEN_ITERATOR_STATE_P;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PRINT_XML_TOKEN_ITERATOR_STATE;
  private static final SubLSymbol $sym10$XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$XML_IT_STATE_IN_STREAM;
  private static final SubLSymbol $sym13$_CSETF_XML_IT_STATE_IN_STREAM;
  private static final SubLSymbol $sym14$XML_IT_STATE_SCRATCH_STREAM;
  private static final SubLSymbol $sym15$_CSETF_XML_IT_STATE_SCRATCH_STREAM;
  private static final SubLSymbol $sym16$XML_IT_STATE_TOKEN_OUTPUT_STREAM;
  private static final SubLSymbol $sym17$_CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM;
  private static final SubLSymbol $sym18$XML_IT_STATE_ENTITY_MAP;
  private static final SubLSymbol $sym19$_CSETF_XML_IT_STATE_ENTITY_MAP;
  private static final SubLSymbol $sym20$XML_IT_STATE_NAMESPACE_STACK;
  private static final SubLSymbol $sym21$_CSETF_XML_IT_STATE_NAMESPACE_STACK;
  private static final SubLSymbol $sym22$XML_IT_STATE_VALIDATE_;
  private static final SubLSymbol $sym23$_CSETF_XML_IT_STATE_VALIDATE_;
  private static final SubLSymbol $sym24$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_;
  private static final SubLSymbol $sym25$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_;
  private static final SubLSymbol $sym26$XML_IT_STATE_RESOLVE_NAMESPACES_;
  private static final SubLSymbol $sym27$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_;
  private static final SubLSymbol $sym28$XML_IT_STATE_ON_DECK_QUEUE;
  private static final SubLSymbol $sym29$_CSETF_XML_IT_STATE_ON_DECK_QUEUE;
  private static final SubLSymbol $kw30$IN_STREAM;
  private static final SubLSymbol $kw31$SCRATCH_STREAM;
  private static final SubLSymbol $kw32$TOKEN_OUTPUT_STREAM;
  private static final SubLSymbol $kw33$ENTITY_MAP;
  private static final SubLSymbol $kw34$NAMESPACE_STACK;
  private static final SubLSymbol $kw35$VALIDATE_;
  private static final SubLSymbol $kw36$RESOLVE_ENTITY_REFERENCES_;
  private static final SubLSymbol $kw37$RESOLVE_NAMESPACES_;
  private static final SubLSymbol $kw38$ON_DECK_QUEUE;
  private static final SubLString $str39$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw40$BEGIN;
  private static final SubLSymbol $sym41$MAKE_XML_TOKEN_ITERATOR_STATE;
  private static final SubLSymbol $kw42$SLOT;
  private static final SubLSymbol $kw43$END;
  private static final SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_XML_TOKEN_ITERATOR_STATE_METHOD;
  private static final SubLString $str45$_XML_TOKEN_ITERATOR_STATE_;
  private static final SubLSymbol $kw46$DONE;
  private static final SubLString $str47$Couldn_t_resolve_namespace__S_in_;
  private static final SubLString $str48$Mismatched_tags__Expected__S__got;
  private static final SubLList $list49;
  private static final SubLString $str50$xmlns_;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLString $str53$xml;
  private static final SubLString $str54$http___www_w3_org_XML_1998_namesp;
  private static final SubLString $str55$_S_is_not_a_prefixed_XML_name_;
  private static final SubLSymbol $sym56$XML_TOKENIZED_HTTP_REQUEST;
  private static final SubLSymbol $kw57$GET;
  private static final SubLInteger $int58$80;
  private static final SubLSymbol $kw59$DEFAULT;
  private static final SubLSymbol $sym60$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw61$OPEN_CONNECTION;
  private static final SubLSymbol $kw62$ERROR;
  private static final SubLSymbol $kw63$OVERALL;
  private static final SubLSymbol $kw64$PRIVATE;
  private static final SubLSymbol $kw65$MACHINE;
  private static final SubLSymbol $kw66$PORT;
  private static final SubLSymbol $kw67$METHOD;
  private static final SubLSymbol $kw68$URL;
  private static final SubLSymbol $kw69$QUERY;
  private static final SubLSymbol $kw70$KEEP_ALIVE_;
  private static final SubLSymbol $kw71$WIDE_NEWLINES_;
  private static final SubLSymbol $kw72$ACCEPT_TYPES;
  private static final SubLSymbol $kw73$CONTENT_TYPE;
  private static final SubLSymbol $kw74$SOAP_ACTION_URI;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$HTML_TOKENIZE;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$XML_TOKENIZE;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$CHAR_EQUAL;
  private static final SubLSymbol $sym81$XML_TOKEN_MENTIONS;
  private static final SubLString $str82$_;
  private static final SubLString $str83$__;
  private static final SubLString $str84$__;
  private static final SubLSymbol $sym85$XML_TAG_;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$XML_TOKEN_ELEMENT_NAME_;
  private static final SubLString $str88$Couldn_t_find_position_of__S_in__;
  private static final SubLString $str89$_xml;
  private static final SubLString $str90$____;
  private static final SubLString $str91$___;
  private static final SubLList $list92;
  private static final SubLList $list93;
  private static final SubLString $str94$___;
  private static final SubLString $str95$__CDATA_;
  private static final SubLString $str96$__;
  private static final SubLString $str97$__;
  private static final SubLString $str98$Mismatched_closing_bracket__S_fol;
  private static final SubLString $str99$_DOCTYPE;
  private static final SubLString $str100$__DOCTYPE_HTML_;
  private static final SubLString $str101$__;
  private static final SubLString $str102$__;
  private static final SubLList $list103;
  private static final SubLList $list104;
  private static final SubLString $str105$__DOCTYPE;
  private static final SubLString $str106$Got__S_instead_of___DOCTYPE_;
  private static final SubLString $str107$_;
  private static final SubLString $str108$__ENTITY;
  private static final SubLString $str109$_;
  private static final SubLString $str110$_;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$PARSE_XML_TOKEN_INT;
  private static final SubLSymbol $sym113$WHITESPACEP;
  private static final SubLString $str114$XML_syntax_error__No___before__S;
  private static final SubLString $str115$XML_syntax_error__Value_starting_;
  private static final SubLSymbol $sym116$VALID_XML_NAME_P;
  private static final SubLSymbol $sym117$XML_CDATA_TAG_;
  private static final SubLSymbol $sym118$STRINGP;
  private static final SubLString $str119$_S_is_not_an_XML_token;
  private static final SubLString $str120$;
  private static final SubLSymbol $sym121$STRING_;
  private static final SubLSymbol $sym122$XML_TOKENS_TO_SEXPR;
  private static final SubLSymbol $kw123$TEST;
  private static final SubLSymbol $kw124$OWNER;
  private static final SubLSymbol $kw125$CLASSES;
  private static final SubLSymbol $kw126$KB;
  private static final SubLSymbol $kw127$TINY;
  private static final SubLSymbol $kw128$WORKING_;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$PARSE_HTML_TOKEN;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$PARSE_XML_TOKEN;
  private static final SubLObject $list133;

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 1086L)
  public static SubLObject xml_tokenize(final SubLObject in_stream, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP)
  {
    if( validateP == UNPROVIDED )
    {
      validateP = $require_valid_xmlP$.getDynamicValue();
    }
    if( resolve_entity_referencesP == UNPROVIDED )
    {
      resolve_entity_referencesP = NIL;
    }
    if( resolve_namespacesP == UNPROVIDED )
    {
      resolve_namespacesP = NIL;
    }
    final SubLObject iterator = new_xml_token_iterator( in_stream, validateP, resolve_entity_referencesP, resolve_namespacesP );
    SubLObject tokens = NIL;
    while ( NIL == iteration.iteration_done( iterator ))
    {
      tokens = ConsesLow.cons( iteration.iteration_next( iterator ), tokens );
    }
    return Sequences.nreverse( tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 1957L)
  public static SubLObject new_xml_token_iterator(final SubLObject in_stream, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP)
  {
    if( validateP == UNPROVIDED )
    {
      validateP = $require_valid_xmlP$.getDynamicValue();
    }
    if( resolve_entity_referencesP == UNPROVIDED )
    {
      resolve_entity_referencesP = NIL;
    }
    if( resolve_namespacesP == UNPROVIDED )
    {
      resolve_namespacesP = NIL;
    }
    assert NIL != Types.streamp( in_stream ) : in_stream;
    final SubLObject state = make_iterator_xml_token_state( in_stream, validateP, resolve_entity_referencesP, resolve_namespacesP );
    final SubLObject iterator = iteration.new_iterator( state, $sym1$ITERATE_XML_TOKEN_DONE, $sym2$ITERATE_XML_TOKEN_NEXT, UNPROVIDED );
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_token_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_xml_token_iterator_state( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_token_iterator_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $xml_token_iterator_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_it_state_in_stream(final SubLObject v_object)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_it_state_scratch_stream(final SubLObject v_object)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_it_state_token_output_stream(final SubLObject v_object)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_it_state_entity_map(final SubLObject v_object)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_it_state_namespace_stack(final SubLObject v_object)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_it_state_validateP(final SubLObject v_object)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_it_state_resolve_entity_referencesP(final SubLObject v_object)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_it_state_resolve_namespacesP(final SubLObject v_object)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject xml_it_state_on_deck_queue(final SubLObject v_object)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject _csetf_xml_it_state_in_stream(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject _csetf_xml_it_state_scratch_stream(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject _csetf_xml_it_state_token_output_stream(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject _csetf_xml_it_state_entity_map(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject _csetf_xml_it_state_namespace_stack(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject _csetf_xml_it_state_validateP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject _csetf_xml_it_state_resolve_entity_referencesP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject _csetf_xml_it_state_resolve_namespacesP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject _csetf_xml_it_state_on_deck_queue(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != xml_token_iterator_state_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject make_xml_token_iterator_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $xml_token_iterator_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw30$IN_STREAM ) )
      {
        _csetf_xml_it_state_in_stream( v_new, current_value );
      }
      else if( pcase_var.eql( $kw31$SCRATCH_STREAM ) )
      {
        _csetf_xml_it_state_scratch_stream( v_new, current_value );
      }
      else if( pcase_var.eql( $kw32$TOKEN_OUTPUT_STREAM ) )
      {
        _csetf_xml_it_state_token_output_stream( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$ENTITY_MAP ) )
      {
        _csetf_xml_it_state_entity_map( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$NAMESPACE_STACK ) )
      {
        _csetf_xml_it_state_namespace_stack( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$VALIDATE_ ) )
      {
        _csetf_xml_it_state_validateP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$RESOLVE_ENTITY_REFERENCES_ ) )
      {
        _csetf_xml_it_state_resolve_entity_referencesP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$RESOLVE_NAMESPACES_ ) )
      {
        _csetf_xml_it_state_resolve_namespacesP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$ON_DECK_QUEUE ) )
      {
        _csetf_xml_it_state_on_deck_queue( v_new, current_value );
      }
      else
      {
        Errors.error( $str39$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject visit_defstruct_xml_token_iterator_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw40$BEGIN, $sym41$MAKE_XML_TOKEN_ITERATOR_STATE, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw30$IN_STREAM, xml_it_state_in_stream( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw31$SCRATCH_STREAM, xml_it_state_scratch_stream( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw32$TOKEN_OUTPUT_STREAM, xml_it_state_token_output_stream( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw33$ENTITY_MAP, xml_it_state_entity_map( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw34$NAMESPACE_STACK, xml_it_state_namespace_stack( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw35$VALIDATE_, xml_it_state_validateP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw36$RESOLVE_ENTITY_REFERENCES_, xml_it_state_resolve_entity_referencesP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw37$RESOLVE_NAMESPACES_, xml_it_state_resolve_namespacesP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw42$SLOT, $kw38$ON_DECK_QUEUE, xml_it_state_on_deck_queue( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$END, $sym41$MAKE_XML_TOKEN_ITERATOR_STATE, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3473L)
  public static SubLObject visit_defstruct_object_xml_token_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_xml_token_iterator_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3770L)
  public static SubLObject print_xml_token_iterator_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str45$_XML_TOKEN_ITERATOR_STATE_ );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 3936L)
  public static SubLObject new_xml_token_iterator_state(final SubLObject in_stream, final SubLObject scratch_stream, final SubLObject token_output_stream, final SubLObject entity_map, final SubLObject namespace_stack,
      final SubLObject validateP, final SubLObject resolve_entity_referencesP, final SubLObject resolve_namespacesP, final SubLObject on_deck_queue)
  {
    final SubLObject state = make_xml_token_iterator_state( UNPROVIDED );
    _csetf_xml_it_state_in_stream( state, in_stream );
    _csetf_xml_it_state_scratch_stream( state, scratch_stream );
    _csetf_xml_it_state_token_output_stream( state, token_output_stream );
    _csetf_xml_it_state_entity_map( state, entity_map );
    _csetf_xml_it_state_namespace_stack( state, namespace_stack );
    _csetf_xml_it_state_validateP( state, validateP );
    _csetf_xml_it_state_resolve_entity_referencesP( state, resolve_entity_referencesP );
    _csetf_xml_it_state_resolve_namespacesP( state, resolve_namespacesP );
    _csetf_xml_it_state_on_deck_queue( state, on_deck_queue );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 4795L)
  public static SubLObject xml_token_iterator_state_in_stream(final SubLObject state)
  {
    assert NIL != xml_token_iterator_state_p( state ) : state;
    return xml_it_state_in_stream( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 4955L)
  public static SubLObject xml_token_iterator_state_scratch_stream(final SubLObject state)
  {
    assert NIL != xml_token_iterator_state_p( state ) : state;
    return xml_it_state_scratch_stream( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5113L)
  public static SubLObject xml_token_iterator_state_token_output_stream(final SubLObject state)
  {
    assert NIL != xml_token_iterator_state_p( state ) : state;
    return xml_it_state_token_output_stream( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5281L)
  public static SubLObject xml_token_iterator_state_entity_map(final SubLObject state)
  {
    assert NIL != xml_token_iterator_state_p( state ) : state;
    return xml_it_state_entity_map( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5431L)
  public static SubLObject xml_token_iterator_state_namespace_stack(final SubLObject state)
  {
    assert NIL != xml_token_iterator_state_p( state ) : state;
    return xml_it_state_namespace_stack( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5591L)
  public static SubLObject xml_token_iterator_state_validateP(final SubLObject state)
  {
    assert NIL != xml_token_iterator_state_p( state ) : state;
    return xml_it_state_validateP( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5739L)
  public static SubLObject xml_token_iterator_state_resolve_entity_referencesP(final SubLObject state)
  {
    assert NIL != xml_token_iterator_state_p( state ) : state;
    return xml_it_state_resolve_entity_referencesP( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 5921L)
  public static SubLObject xml_token_iterator_state_resolve_namespacesP(final SubLObject state)
  {
    assert NIL != xml_token_iterator_state_p( state ) : state;
    return xml_it_state_resolve_namespacesP( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 6089L)
  public static SubLObject xml_token_iterator_state_on_deck_queue(final SubLObject state)
  {
    assert NIL != xml_token_iterator_state_p( state ) : state;
    return xml_it_state_on_deck_queue( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 6245L)
  public static SubLObject xml_token_iterator_state_peek(final SubLObject state)
  {
    ensure_xml_token_on_deck_queue_populated( state );
    return ( NIL != iterate_xml_token_done( state ) ) ? NIL : queues.queue_peek( xml_token_iterator_state_on_deck_queue( state ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 6465L)
  public static SubLObject advance_xml_token_iterator_to_next_element(final SubLObject token_iterator)
  {
    while ( NIL == iteration.iteration_done( token_iterator ) && ( NIL != non_content_xml_token_p( iteration.xml_token_iterator_peek( token_iterator ) ) || NIL != string_utilities.whitespace_stringP( iteration
        .xml_token_iterator_peek( token_iterator ) ) ))
    {
      iteration.iteration_next( token_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 6799L)
  public static SubLObject xml_token_iterator_progress(final SubLObject iterator)
  {
    final SubLObject state = iteration.iteration_state_peek( iterator );
    final SubLObject in_stream = xml_token_iterator_state_in_stream( state );
    return Values.values( streams_high.file_position( in_stream, UNPROVIDED ), streams_high.file_length( in_stream ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 7035L)
  public static SubLObject make_iterator_xml_token_state(final SubLObject in_stream, final SubLObject validateP, final SubLObject resolve_entity_referencesP, final SubLObject resolve_namespacesP)
  {
    final SubLObject scratch_stream = streams_high.make_private_string_output_stream();
    final SubLObject token_output_stream = streams_high.make_private_string_output_stream();
    final SubLObject entity_map = NIL;
    final SubLObject namespace_stack = NIL;
    final SubLObject on_deck_queue = misc_utilities.uninitialized();
    return new_xml_token_iterator_state( in_stream, scratch_stream, token_output_stream, entity_map, namespace_stack, validateP, resolve_entity_referencesP, resolve_namespacesP, on_deck_queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 7546L)
  public static SubLObject iterate_xml_token_done(final SubLObject state)
  {
    ensure_xml_token_on_deck_queue_populated( state );
    return Equality.eq( $kw46$DONE, queues.queue_peek( xml_token_iterator_state_on_deck_queue( state ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 7733L)
  public static SubLObject iterate_xml_token_next(final SubLObject state)
  {
    final SubLObject on_deck_queue = xml_token_iterator_state_on_deck_queue( state );
    ensure_xml_token_on_deck_queue_populated( state );
    return Values.values( queues.dequeue( on_deck_queue ), state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 7966L)
  public static SubLObject ensure_xml_token_on_deck_queue_populated(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject on_deck_queue = xml_token_iterator_state_on_deck_queue( state );
    final SubLObject at_beginningP = makeBoolean( NIL == queues.queue_p( on_deck_queue ) );
    if( NIL != at_beginningP )
    {
      on_deck_queue = queues.create_queue( UNPROVIDED );
      _csetf_xml_it_state_on_deck_queue( state, on_deck_queue );
    }
    final SubLObject scratch_stream = xml_token_iterator_state_scratch_stream( state );
    final SubLObject token_output_stream = xml_token_iterator_state_token_output_stream( state );
    final SubLObject in_stream = xml_token_iterator_state_in_stream( state );
    if( NIL != queues.queue_empty_p( on_deck_queue ) )
    {
      thread.resetMultipleValues();
      final SubLObject text = xml_read( in_stream, scratch_stream, token_output_stream );
      final SubLObject token = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != string_utilities.non_empty_string_p( text ) )
      {
        final SubLObject modified_text = xml_iterator_state_handle_namespaces_and_entities( text, state );
        queues.enqueue( modified_text, on_deck_queue );
      }
      if( NIL == token )
      {
        queues.enqueue( $kw46$DONE, on_deck_queue );
        streams_high.close( scratch_stream, UNPROVIDED );
      }
      else
      {
        final SubLObject modified_token = xml_iterator_state_handle_namespaces_and_entities( token, state );
        queues.enqueue( modified_token, on_deck_queue );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 9289L)
  public static SubLObject xml_iterator_state_handle_namespaces_and_entities(final SubLObject token, final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject namespace_stack = xml_token_iterator_state_namespace_stack( state );
    final SubLObject resolve_namespacesP = xml_token_iterator_state_resolve_namespacesP( state );
    final SubLObject validateP = xml_token_iterator_state_validateP( state );
    final SubLObject resolve_entity_referencesP = xml_token_iterator_state_resolve_entity_referencesP( state );
    final SubLObject entity_map = xml_token_iterator_state_entity_map( state );
    SubLObject new_token = token;
    if( NIL != resolve_entity_referencesP && NIL != entity_map && NIL != Sequences.find( Characters.CHAR_ampersand, token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      new_token = resolve_entity_references( token, entity_map );
    }
    if( NIL != xml_tagP( token ) && NIL == xml_declaration_p( token ) && NIL == xml_doctype_tag_p( token ) && NIL == xml_processing_instruction_p( token ) && NIL == xml_comment_p( token ) && ( NIL != validateP
        || NIL != resolve_namespacesP ) )
    {
      thread.resetMultipleValues();
      final SubLObject modified_token = handle_xml_namespaces( new_token, namespace_stack, resolve_namespacesP );
      final SubLObject new_stack = thread.secondMultipleValue();
      thread.resetMultipleValues();
      new_token = modified_token;
      _csetf_xml_it_state_namespace_stack( state, new_stack );
    }
    if( NIL != resolve_entity_referencesP && NIL == entity_map && NIL != xml_doctype_tag_p( token ) )
    {
      _csetf_xml_it_state_entity_map( state, entity_map_from_doctype_tag( token ) );
    }
    return new_token;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 10621L)
  public static SubLObject handle_xml_namespaces(SubLObject token, SubLObject stack, final SubLObject resolve_namespacesP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_namespace_bindings = NIL;
    if( NIL != resolve_namespacesP )
    {
      thread.resetMultipleValues();
      final SubLObject token_$1 = xml_utilities.resolve_xml_namespaces( token, stack );
      final SubLObject new_namespace_bindings_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      token = token_$1;
      new_namespace_bindings = new_namespace_bindings_$2;
    }
    else
    {
      SubLObject problem = NIL;
      thread.resetMultipleValues();
      final SubLObject problem_$3 = validate_xml_namespaces( token, stack );
      final SubLObject new_namespace_bindings_$3 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      problem = problem_$3;
      new_namespace_bindings = new_namespace_bindings_$3;
      if( NIL != problem )
      {
        Errors.error( $str47$Couldn_t_resolve_namespace__S_in_, problem, token );
      }
    }
    if( NIL == xml_cdata_tagP( token ) )
    {
      if( NIL != xml_opening_tag_p( token ) )
      {
        stack = ConsesLow.cons( xml_token_element_name( token ), stack );
        stack = ConsesLow.append( new_namespace_bindings, stack );
      }
      else if( NIL != xml_closing_tag_p( token ) )
      {
        final SubLObject element_name = xml_token_element_name( token );
        while ( NIL != xml_namespace_mapping_p( stack.first() ))
        {
          stack = stack.rest();
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !element_name.equal( stack.first() ) )
        {
          Errors.error( $str48$Mismatched_tags__Expected__S__got, stack.first(), element_name );
        }
        stack = stack.rest();
      }
    }
    return Values.values( token, stack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 12132L)
  public static SubLObject xml_namespace_mapping_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && v_object.first().isString() && v_object.rest().isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 12273L)
  public static SubLObject validate_xml_namespaces(final SubLObject token, final SubLObject stack)
  {
    SubLObject problem = NIL;
    SubLObject new_bindings = NIL;
    if( NIL != xml_tagP( token ) && NIL == xml_declaration_p( token ) && NIL == xml_doctype_tag_p( token ) && NIL == xml_processing_instruction_p( token ) && NIL == xml_cdata_tagP( token ) && NIL == xml_comment_p(
        token ) )
    {
      SubLObject current;
      final SubLObject datum = current = parse_xml_token( token );
      SubLObject element_name = NIL;
      SubLObject attributes = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
      element_name = current.first();
      current = ( attributes = current.rest() );
      if( NIL != string_utilities.substringP( $str50$xmlns_, token, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var = attributes;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current_$6;
          final SubLObject datum_$5 = current_$6 = cons;
          SubLObject attribute = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$6, datum_$5, $list51 );
          attribute = current_$6.first();
          current_$6 = ( value = current_$6.rest() );
          if( NIL != string_utilities.starts_with( attribute, $str50$xmlns_ ) )
          {
            new_bindings = ConsesLow.cons( ConsesLow.cons( string_utilities.substring( attribute, SIX_INTEGER, Sequences.position( Characters.CHAR_equal, attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ),
                value ), new_bindings );
          }
          cdolist_list_var = cdolist_list_var.rest();
          cons = cdolist_list_var.first();
        }
      }
      SubLObject cons;
      SubLObject value;
      SubLObject rest;
      SubLObject current_$7;
      SubLObject datum_$6;
      SubLObject attribute_name;
      for( problem = maybe_validate_xml_namespace( element_name, new_bindings, stack ), rest = NIL, rest = attributes; NIL == problem && NIL != rest; problem = maybe_validate_xml_namespace( attribute_name, new_bindings,
          stack ), rest = rest.rest() )
      {
        cons = rest.first();
        datum_$6 = ( current_$7 = cons );
        attribute_name = NIL;
        value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list52 );
        attribute_name = current_$7.first();
        current_$7 = ( value = current_$7.rest() );
      }
    }
    return Values.values( problem, new_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 13153L)
  public static SubLObject maybe_validate_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack)
  {
    return ( NIL != Sequences.find( Characters.CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == string_utilities.starts_with( name, $str50$xmlns_ ) ) ? validate_xml_namespace( name,
        new_bindings, stack ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 13351L)
  public static SubLObject validate_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack)
  {
    final SubLObject namespace = xml_prefixed_name_namespace( name );
    SubLObject expanded = list_utilities.alist_lookup_without_values( new_bindings, namespace, Symbols.symbol_function( EQUAL ), NIL );
    if( NIL == expanded && namespace.equal( $str53$xml ) )
    {
      expanded = $str54$http___www_w3_org_XML_1998_namesp;
    }
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
    return ( NIL != expanded ) ? NIL : name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 13943L)
  public static SubLObject xml_prefixed_name_p(final SubLObject name)
  {
    return makeBoolean( name.isString() && NIL != list_utilities.sublisp_boolean( Sequences.position( Characters.CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 14056L)
  public static SubLObject xml_prefixed_name_namespace(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject colon_pos = Sequences.position( Characters.CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == colon_pos )
    {
      Errors.error( $str55$_S_is_not_a_prefixed_XML_name_, name );
    }
    return string_utilities.substring( name, ZERO_INTEGER, colon_pos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 14252L)
  public static SubLObject xml_prefixed_name_local_name(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject colon_pos = Sequences.position( Characters.CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == colon_pos )
    {
      Errors.error( $str55$_S_is_not_a_prefixed_XML_name_, name );
    }
    return string_utilities.substring( name, number_utilities.f_1X( colon_pos ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 14452L)
  public static SubLObject xml_string_tokenize(final SubLObject string, SubLObject validateP, SubLObject resolve_entity_referencesP, SubLObject resolve_namespacesP)
  {
    if( validateP == UNPROVIDED )
    {
      validateP = $require_valid_xmlP$.getDynamicValue();
    }
    if( resolve_entity_referencesP == UNPROVIDED )
    {
      resolve_entity_referencesP = NIL;
    }
    if( resolve_namespacesP == UNPROVIDED )
    {
      resolve_namespacesP = NIL;
    }
    SubLObject out_list = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_input_stream( string, ZERO_INTEGER, NIL );
      out_list = xml_tokenize( stream, validateP, resolve_entity_referencesP, resolve_namespacesP );
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
    return out_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 14904L)
  public static SubLObject xml_tokenized_http_request(SubLObject machine, SubLObject url, SubLObject query, SubLObject method, SubLObject port, SubLObject keep_aliveP, SubLObject wide_newlinesP,
      SubLObject open_connection_timeout, SubLObject overall_timeout, SubLObject redirectP, SubLObject accept_types)
  {
    if( query == UNPROVIDED )
    {
      query = NIL;
    }
    if( method == UNPROVIDED )
    {
      method = $kw57$GET;
    }
    if( port == UNPROVIDED )
    {
      port = $int58$80;
    }
    if( keep_aliveP == UNPROVIDED )
    {
      keep_aliveP = T;
    }
    if( wide_newlinesP == UNPROVIDED )
    {
      wide_newlinesP = T;
    }
    if( open_connection_timeout == UNPROVIDED )
    {
      open_connection_timeout = NIL;
    }
    if( overall_timeout == UNPROVIDED )
    {
      overall_timeout = NIL;
    }
    if( redirectP == UNPROVIDED )
    {
      redirectP = T;
    }
    if( accept_types == UNPROVIDED )
    {
      accept_types = $kw59$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    SubLObject connection_timed_out = NIL;
    SubLObject overall_timed_out = NIL;
    SubLObject make_request = T;
    SubLObject tokens = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym60$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL != overall_timeout )
          {
            SubLObject timeout_reason = NIL;
            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
            try
            {
              thread.throwStack.push( tag );
              final SubLObject _prev_bind_0_$9 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
              try
              {
                subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                SubLObject timer = NIL;
                try
                {
                  final SubLObject _prev_bind_0_$10 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                  try
                  {
                    subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                    timer = subl_macro_promotions.with_timeout_start_timer( overall_timeout, tag );
                    thread.resetMultipleValues();
                    final SubLObject tokens_$11 = xml_tokenized_http_request( machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, NIL, redirectP, accept_types );
                    final SubLObject timeout_reason_$12 = thread.secondMultipleValue();
                    final SubLObject error_message_$13 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    tokens = tokens_$11;
                    timeout_reason = timeout_reason_$12;
                    error_message = error_message_$13;
                  }
                  finally
                  {
                    subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$10, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    subl_macro_promotions.with_timeout_stop_timer( timer );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
                  }
                }
              }
              finally
              {
                subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$9, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              overall_timed_out = Errors.handleThrowable( ccatch_env_var, tag );
            }
            finally
            {
              thread.throwStack.pop();
            }
            final SubLObject pcase_var = timeout_reason;
            if( pcase_var.eql( $kw61$OPEN_CONNECTION ) )
            {
              connection_timed_out = T;
            }
          }
          else
          {
            while ( NIL != make_request)
            {
              thread.resetMultipleValues();
              final SubLObject tokens_$12 = xml_tokenized_http_request_internal( machine, url, query, method, port, keep_aliveP, wide_newlinesP, open_connection_timeout, accept_types );
              final SubLObject connection_timed_out_$16 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              tokens = tokens_$12;
              connection_timed_out = connection_timed_out_$16;
              if( NIL != redirectP )
              {
                final SubLObject header = tokens.first();
                if( NIL != web_utilities.html_redirection_header_p( header ) )
                {
                  final SubLObject redirection_url = web_utilities.html_redirection_url( header );
                  thread.resetMultipleValues();
                  final SubLObject machine_$17 = web_utilities.parse_http_url( redirection_url );
                  final SubLObject port_$18 = thread.secondMultipleValue();
                  final SubLObject url_$19 = thread.thirdMultipleValue();
                  final SubLObject query_$20 = thread.fourthMultipleValue();
                  thread.resetMultipleValues();
                  machine = machine_$17;
                  port = port_$18;
                  url = url_$19;
                  query = query_$20;
                }
                else
                {
                  make_request = NIL;
                }
              }
              else
              {
                make_request = NIL;
              }
            }
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
    catch( final Throwable ccatch_env_var2 )
    {
      error_message = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      return Values.values( tokens, $kw62$ERROR, error_message );
    }
    if( NIL != connection_timed_out )
    {
      return Values.values( tokens, $kw61$OPEN_CONNECTION, NIL );
    }
    if( NIL != overall_timed_out )
    {
      return Values.values( tokens, $kw63$OVERALL, NIL );
    }
    return Values.values( tokens, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 17642L)
  public static SubLObject xml_tokenized_http_request_internal(final SubLObject machine, final SubLObject url, final SubLObject query, final SubLObject method, final SubLObject port, final SubLObject keep_aliveP,
      final SubLObject wide_newlinesP, final SubLObject timeout, final SubLObject accept_types)
  {
    SubLObject timed_out = T;
    SubLObject tokens = NIL;
    final SubLObject real_port = port.eql( $kw59$DEFAULT ) ? $int58$80 : port;
    SubLObject channel = NIL;
    try
    {
      channel = subl_promotions.open_tcp_stream_with_timeout( machine, real_port, timeout, $kw64$PRIVATE );
      if( NIL != subl_macro_promotions.validate_tcp_connection( channel, machine, real_port ) )
      {
        web_utilities.send_http_request( channel, ConsesLow.list( new SubLObject[] { $kw65$MACHINE, machine, $kw66$PORT, port, $kw67$METHOD, method, $kw68$URL, url, $kw69$QUERY, query, $kw70$KEEP_ALIVE_, keep_aliveP,
          $kw71$WIDE_NEWLINES_, wide_newlinesP, $kw72$ACCEPT_TYPES, accept_types, $kw73$CONTENT_TYPE, $kw59$DEFAULT, $kw74$SOAP_ACTION_URI, NIL
        } ) );
        timed_out = NIL;
        tokens = xml_tokenize( channel, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != channel )
        {
          streams_high.close( channel, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return Values.values( tokens, timed_out );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 18283L)
  public static SubLObject html_tokenize(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject in_stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    in_stream = current.first();
    current = current.rest();
    if( NIL == current )
    {
      access_macros.defmacro_obsolete_warning( $sym76$HTML_TOKENIZE, $list77 );
      return ConsesLow.listS( $sym78$XML_TOKENIZE, in_stream, $list79 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list75 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 18433L)
  public static SubLObject xml_token_matches_exactly(final SubLObject token, final SubLObject match_string)
  {
    return Strings.stringE( token, match_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 18689L)
  public static SubLObject xml_token_matches(final SubLObject token, final SubLObject match_string)
  {
    return Strings.string_equal( token, match_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 18941L)
  public static SubLObject xml_token_starts_with(final SubLObject token, final SubLObject start_string)
  {
    return Equality.eql( ZERO_INTEGER, Sequences.search( start_string, token, Symbols.symbol_function( $sym80$CHAR_EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 19208L)
  public static SubLObject xml_token_mentions(final SubLObject token, final SubLObject mention_string)
  {
    return list_utilities.sublisp_boolean( Sequences.search( mention_string, token, Symbols.symbol_function( $sym80$CHAR_EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 19488L)
  public static SubLObject next_xml_token_position(final SubLObject tokens, final SubLObject target_string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = $sym81$XML_TOKEN_MENTIONS;
    }
    SubLObject list_var = NIL;
    SubLObject token = NIL;
    SubLObject position = NIL;
    list_var = tokens;
    token = list_var.first();
    for( position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), token = list_var.first(), position = Numbers.add( ONE_INTEGER, position ) )
    {
      if( NIL != Functions.funcall( test, token, target_string ) )
      {
        return position;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 19951L)
  public static SubLObject next_xml_token_position_if(final SubLObject tokens, final SubLObject test)
  {
    SubLObject list_var = NIL;
    SubLObject token = NIL;
    SubLObject position = NIL;
    list_var = tokens;
    token = list_var.first();
    for( position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), token = list_var.first(), position = Numbers.add( ONE_INTEGER, position ) )
    {
      if( NIL != Functions.funcall( test, token ) )
      {
        return position;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 20300L)
  public static SubLObject next_xml_token_position_if_not(final SubLObject tokens, final SubLObject test)
  {
    SubLObject list_var = NIL;
    SubLObject token = NIL;
    SubLObject position = NIL;
    list_var = tokens;
    token = list_var.first();
    for( position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), token = list_var.first(), position = Numbers.add( ONE_INTEGER, position ) )
    {
      if( NIL == Functions.funcall( test, token ) )
      {
        return position;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 20662L)
  public static SubLObject advance_xml_tokens(final SubLObject tokens, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    return conses_high.nthcdr( n, tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 20937L)
  public static SubLObject advance_xml_tokens_to(SubLObject tokens, final SubLObject target_string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = $sym81$XML_TOKEN_MENTIONS;
    }
    while ( NIL != tokens && NIL == Functions.funcall( test, tokens.first(), target_string ))
    {
      tokens = tokens.rest();
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 21416L)
  public static SubLObject xml_extract_token_sequence(final SubLObject xml_tokens, final SubLObject token_name)
  {
    final SubLObject sequence_start_string = Sequences.cconcatenate( $str82$_, format_nil.format_nil_a_no_copy( token_name ) );
    final SubLObject sequence_self_end_string = $str83$__;
    final SubLObject sequence_match_end_string = Sequences.cconcatenate( $str84$__, format_nil.format_nil_a_no_copy( token_name ) );
    final SubLObject sequence_start = advance_xml_tokens_to( xml_tokens, sequence_start_string, UNPROVIDED );
    if( NIL == sequence_start )
    {
      return NIL;
    }
    final SubLObject start_token = sequence_start.first();
    if( NIL != string_utilities.ends_with( start_token, sequence_self_end_string, UNPROVIDED ) )
    {
      return ConsesLow.list( start_token );
    }
    final SubLObject sequence_end = advance_xml_tokens_to( sequence_start, sequence_match_end_string, UNPROVIDED );
    if( NIL != sequence_end )
    {
      final SubLObject sequence_after_end = sequence_end.rest();
      return conses_high.ldiff( sequence_start, sequence_after_end );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 22508L)
  public static SubLObject accumulate_xml_token(final SubLObject token)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != misc_utilities.initialized_p( $xml_token_accumulator$.getDynamicValue( thread ) ) )
    {
      $xml_token_accumulator$.setDynamicValue( ConsesLow.cons( token, $xml_token_accumulator$.getDynamicValue( thread ) ), thread );
    }
    return token;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 22661L)
  public static SubLObject accumulate_xml_tokens(final SubLObject tokens, final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != misc_utilities.initialized_p( $xml_token_accumulator$.getDynamicValue( thread ) ) )
    {
      SubLObject done_count = ZERO_INTEGER;
      SubLObject doneP = Numbers.numGE( done_count, n );
      if( NIL == doneP )
      {
        SubLObject csome_list_var = tokens;
        SubLObject token = NIL;
        token = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          accumulate_xml_token( token );
          done_count = Numbers.add( done_count, ONE_INTEGER );
          doneP = Numbers.numGE( done_count, n );
          csome_list_var = csome_list_var.rest();
          token = csome_list_var.first();
        }
      }
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 22952L)
  public static SubLObject accumulated_xml_tokens()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != misc_utilities.initialized_p( $xml_token_accumulator$.getDynamicValue( thread ) ) ) ? Sequences.nreverse( $xml_token_accumulator$.getDynamicValue( thread ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 23089L)
  public static SubLObject xml_tokens_for_next_element(final SubLObject tokens)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $xml_token_accumulator$.currentBinding( thread );
    try
    {
      $xml_token_accumulator$.bind( NIL, thread );
      advance_xml_tokens_to_end_of_element( tokens );
      ans = accumulated_xml_tokens();
    }
    finally
    {
      $xml_token_accumulator$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 23416L)
  public static SubLObject advance_xml_tokens_to_end_of_element(final SubLObject tokens)
  {
    assert NIL != xml_tagP( tokens.first() ) : tokens.first();
    final SubLObject element_name = xml_token_element_name( tokens.first() );
    return advance_xml_tokens_to_end_of_element_int( tokens, element_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 23788L)
  public static SubLObject advance_xml_tokens_to_end_of_element_int(final SubLObject tokens, final SubLObject element_name)
  {
    SubLObject first_token = NIL;
    SubLObject rest_of_tokens = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tokens, tokens, $list86 );
    first_token = tokens.first();
    final SubLObject current = rest_of_tokens = tokens.rest();
    if( NIL != xml_closing_tokenP( element_name, first_token ) || ( NIL != xml_token_element_nameP( first_token, element_name ) && NIL != xml_empty_tagP( first_token ) ) )
    {
      accumulate_xml_token( first_token );
      return rest_of_tokens;
    }
    SubLObject next_position = next_xml_token_position( rest_of_tokens, element_name, $sym87$XML_TOKEN_ELEMENT_NAME_ );
    SubLObject next_occurrence = ( NIL != next_position ) ? ConsesLow.nth( next_position, rest_of_tokens ) : NIL;
    if( NIL == next_position )
    {
      Errors.sublisp_break( $str88$Couldn_t_find_position_of__S_in__, new SubLObject[] { element_name, rest_of_tokens
      } );
    }
    SubLObject ans;
    for( ans = rest_of_tokens; NIL != xml_empty_tagP( next_occurrence ); next_occurrence = ( NIL != next_position ) ? ConsesLow.nth( next_position, ans ) : NIL )
    {
      ans = advance_xml_tokens( ans, number_utilities.f_1X( next_position ) );
      next_position = next_xml_token_position( ans, element_name, $sym87$XML_TOKEN_ELEMENT_NAME_ );
    }
    if( NIL != xml_closing_tag_p( next_occurrence ) )
    {
      accumulate_xml_tokens( tokens, number_utilities.f_1X( number_utilities.f_1X( next_position ) ) );
      return advance_xml_tokens( ans, number_utilities.f_1X( next_position ) );
    }
    while ( NIL == xml_closing_tag_p( next_occurrence ))
    {
      final SubLObject at_next_start = advance_xml_tokens( ans, next_position );
      final SubLObject after_next_end = ans = advance_xml_tokens_to_end_of_element_int( at_next_start, element_name );
      next_position = next_xml_token_position( ans, element_name, $sym87$XML_TOKEN_ELEMENT_NAME_ );
      next_occurrence = ( NIL != next_position ) ? ConsesLow.nth( next_position, ans ) : NIL;
    }
    return ( NIL != ans ) ? advance_xml_tokens_to_end_of_element_int( ans, element_name ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 26043L)
  public static SubLObject xml_declaration_p(final SubLObject v_object)
  {
    return xml_token_element_nameP( v_object, $str89$_xml );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 26135L)
  public static SubLObject xml_comment_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() && NIL != string_utilities.starts_with( v_object, $str90$____ ) && NIL != string_utilities.ends_with( v_object, $str91$___, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 26272L)
  public static SubLObject xml_closing_tag_p(final SubLObject token)
  {
    return makeBoolean( token.isString() && NIL != xml_tagP( token ) && NIL != list_utilities.lengthG( token, TWO_INTEGER, UNPROVIDED ) && Characters.CHAR_slash.eql( Strings.sublisp_char( token, ONE_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 26424L)
  public static SubLObject xml_opening_tag_p(final SubLObject token)
  {
    return makeBoolean( NIL != xml_tagP( token ) && NIL == xml_declaration_p( token ) && NIL == xml_doctype_tag_p( token ) && NIL == xml_comment_p( token ) && NIL == xml_empty_tagP( token ) && NIL == xml_closing_tag_p(
        token ) && NIL == xml_processing_instruction_p( token ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 26740L)
  public static SubLObject advance_xml_tokens_without_crossing(SubLObject tokens, final SubLObject target_string, final SubLObject forbidden_string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = $sym81$XML_TOKEN_MENTIONS;
    }
    while ( NIL != tokens && NIL == Functions.funcall( test, tokens.first(), target_string ) && NIL == Functions.funcall( test, tokens.first(), forbidden_string ))
    {
      tokens = tokens.rest();
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 27592L)
  public static SubLObject advance_xml_tokens_without_crossing_or_quit(SubLObject tokens, final SubLObject target_string, final SubLObject forbidden_string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = $sym81$XML_TOKEN_MENTIONS;
    }
    tokens = advance_xml_tokens_without_crossing( tokens, target_string, forbidden_string, test );
    if( NIL != tokens && NIL == Functions.funcall( test, tokens.first(), forbidden_string ) )
    {
      return tokens;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 28251L)
  public static SubLObject xml_read(final SubLObject in_stream, SubLObject scratch_stream, SubLObject token_output_stream)
  {
    if( scratch_stream == UNPROVIDED )
    {
      scratch_stream = streams_high.make_private_string_output_stream();
    }
    if( token_output_stream == UNPROVIDED )
    {
      token_output_stream = streams_high.make_private_string_output_stream();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    streams_high.clear_output( scratch_stream );
    streams_high.clear_output( token_output_stream );
    thread.resetMultipleValues();
    final SubLObject pretext = web_utilities.read_until_char( in_stream, Characters.CHAR_less, scratch_stream );
    final SubLObject eof = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != eof )
    {
      return Values.values( pretext, NIL );
    }
    final SubLObject bracket_alist = $list92;
    final SubLObject brackets = $list93;
    SubLObject open_bracket_stack = ConsesLow.list( Characters.CHAR_less );
    SubLObject abortP = NIL;
    print_high.princ( Characters.CHAR_less, token_output_stream );
    SubLObject within_commentP = NIL;
    SubLObject within_cdataP = NIL;
    while ( NIL != open_bracket_stack && NIL == abortP)
    {
      thread.resetMultipleValues();
      final SubLObject partial_tag_text = web_utilities.read_until_one_of( in_stream, brackets, scratch_stream );
      final SubLObject v_char = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( partial_tag_text.isString() )
      {
        print_high.princ( partial_tag_text, token_output_stream );
        if( NIL == within_commentP && NIL != string_utilities.starts_with( partial_tag_text, $str94$___ ) )
        {
          within_commentP = T;
        }
        if( NIL == within_cdataP && NIL != string_utilities.starts_with( partial_tag_text, $str95$__CDATA_ ) )
        {
          within_cdataP = T;
        }
      }
      if( NIL == v_char )
      {
        abortP = T;
      }
      else if( NIL != within_commentP )
      {
        print_high.princ( v_char, token_output_stream );
        if( NIL == string_utilities.ends_with( partial_tag_text, $str96$__, UNPROVIDED ) || !v_char.eql( Characters.CHAR_greater ) )
        {
          continue;
        }
        open_bracket_stack = open_bracket_stack.rest();
      }
      else if( NIL != within_cdataP )
      {
        print_high.princ( v_char, token_output_stream );
        if( NIL == string_utilities.ends_with( partial_tag_text, $str97$__, UNPROVIDED ) || !v_char.eql( Characters.CHAR_greater ) )
        {
          continue;
        }
        open_bracket_stack = open_bracket_stack.rest();
      }
      else if( v_char.eql( list_utilities.alist_lookup_without_values( bracket_alist, open_bracket_stack.first(), UNPROVIDED, UNPROVIDED ) ) )
      {
        print_high.princ( v_char, token_output_stream );
        open_bracket_stack = open_bracket_stack.rest();
      }
      else if( NIL != list_utilities.alist_lookup_without_values( bracket_alist, v_char, UNPROVIDED, UNPROVIDED ) )
      {
        print_high.princ( v_char, token_output_stream );
        open_bracket_stack = ConsesLow.cons( v_char, open_bracket_stack );
      }
      else
      {
        Errors.error( $str98$Mismatched_closing_bracket__S_fol, v_char, partial_tag_text, list_utilities.alist_lookup_without_values( bracket_alist, open_bracket_stack.first(), UNPROVIDED, UNPROVIDED ) );
      }
    }
    return ( NIL != abortP ) ? Values.values( pretext, NIL ) : Values.values( pretext, streams_high.get_output_stream_string( token_output_stream ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 30575L)
  public static SubLObject xml_doctype_tag_p(final SubLObject token)
  {
    return makeBoolean( token.isString() && NIL != xml_token_element_nameP( token, $str99$_DOCTYPE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 30698L)
  public static SubLObject html_doctype_tag_p(final SubLObject token)
  {
    return makeBoolean( NIL != xml_doctype_tag_p( token ) && NIL != string_utilities.starts_with_by_test( token, $str100$__DOCTYPE_HTML_, Symbols.symbol_function( EQUALP ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 30844L)
  public static SubLObject xml_processing_instruction_p(final SubLObject token)
  {
    return makeBoolean( NIL != string_utilities.starts_with( token, $str101$__ ) && NIL != string_utilities.ends_with( token, $str102$__, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 30967L)
  public static SubLObject entity_map_from_doctype_tag(final SubLObject token)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject chunks = string_utilities.string_tokenize( token, ConsesLow.cons( Characters.CHAR_lbracket, ConsesLow.cons( Characters.CHAR_rbracket, string_utilities.whitespace_chars() ) ), NIL, NIL, T, NIL,
        $list103 );
    SubLObject map = NIL;
    SubLObject current;
    final SubLObject datum = current = chunks;
    SubLObject doctype = NIL;
    SubLObject name = NIL;
    SubLObject open_bracket = NIL;
    SubLObject rest = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list104 );
    doctype = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list104 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list104 );
    open_bracket = current.first();
    current = ( rest = current.rest() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !doctype.equal( $str105$__DOCTYPE ) )
    {
      Errors.error( $str106$Got__S_instead_of___DOCTYPE_, doctype );
    }
    if( open_bracket.equal( $str107$_ ) )
    {
      SubLObject doneP = NIL;
      while ( NIL == doneP && NIL == list_utilities.empty_list_p( rest ))
      {
        final SubLObject next_pos = Sequences.position( $str108$__ENTITY, rest, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL == next_pos )
        {
          doneP = T;
        }
        else if( NIL != list_utilities.lengthG( rest, Numbers.add( next_pos, THREE_INTEGER ), UNPROVIDED ) )
        {
          final SubLObject abbrev = Sequences.cconcatenate( $str109$_, new SubLObject[] { ConsesLow.nth( Numbers.add( next_pos, ONE_INTEGER ), rest ), $str110$_
          } );
          final SubLObject raw_url_string = ConsesLow.nth( Numbers.add( next_pos, TWO_INTEGER ), rest );
          final SubLObject url_string = string_utilities.nchar_subst( Characters.CHAR_quotation, Characters.CHAR_quote, raw_url_string );
          final SubLObject expansion = reader.read_from_string( url_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          map = list_utilities.alist_enter( map, abbrev, expansion, UNPROVIDED );
          rest = conses_high.nthcdr( Numbers.add( next_pos, THREE_INTEGER ), rest );
        }
        else
        {
          doneP = T;
        }
      }
    }
    return map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 31941L)
  public static SubLObject resolve_entity_references(final SubLObject token, final SubLObject entity_map)
  {
    final SubLObject ans = resolve_predefined_xml_entities( string_utilities.do_string_substitutions_robust( token, entity_map, Symbols.symbol_function( EQUAL ) ) );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 32202L)
  public static SubLObject resolve_predefined_xml_entities(SubLObject string)
  {
    SubLObject cdolist_list_var = xml_vars.$xml_predefined_entities$.getGlobalValue();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject name = NIL;
      SubLObject code = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
      name = current.first();
      current = ( code = current.rest() );
      if( NIL != Sequences.search( name, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        string = string_utilities.string_substitute( Strings.make_string( ONE_INTEGER, Characters.code_char( code ) ), Sequences.cconcatenate( $str109$_, new SubLObject[] { format_nil.format_nil_a_no_copy( name ),
          $str110$_
        } ), string, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 32466L)
  public static SubLObject remove_xml_comments(final SubLObject xml_string)
  {
    final SubLObject xml_tokens = xml_string_tokenize( xml_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      SubLObject cdolist_list_var = xml_tokens;
      SubLObject token = NIL;
      token = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == xml_comment_p( token ) )
        {
          print_high.princ( token, s );
        }
        cdolist_list_var = cdolist_list_var.rest();
        token = cdolist_list_var.first();
      }
      result = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 32983L)
  public static SubLObject parse_xml_token(final SubLObject token)
  {
    return parse_xml_token_int( token, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 33063L)
  public static SubLObject parse_html_token(final SubLObject token)
  {
    return parse_xml_token_int( token, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 33240L)
  public static SubLObject parse_xml_token_int_internal(final SubLObject token, SubLObject strictP)
  {
    if( strictP == UNPROVIDED )
    {
      strictP = T;
    }
    final SubLObject space_pos = Sequences.position_if( $sym113$WHITESPACEP, token, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject token_length = Sequences.length( token );
    final SubLObject contents_end = ( NIL != xml_empty_tagP( token ) || NIL != xml_declaration_p( token ) ) ? Numbers.subtract( token_length, TWO_INTEGER ) : Numbers.subtract( token_length, ONE_INTEGER );
    SubLObject v_answer = ConsesLow.list( xml_token_element_name( token ) );
    SubLObject read_keyP = NIL;
    SubLObject found_equal_signP = NIL;
    SubLObject quote_char = NIL;
    SubLObject key_start = NIL;
    SubLObject key_end = NIL;
    SubLObject value_start = NIL;
    SubLObject value_end = NIL;
    if( NIL != space_pos )
    {
      SubLObject end_var_$21;
      SubLObject end_var;
      SubLObject i;
      SubLObject c;
      SubLObject done_with_keyP;
      SubLObject pcase_var;
      SubLObject pair;
      for( end_var = ( end_var_$21 = ( ( NIL != contents_end ) ? contents_end : Sequences.length( token ) ) ), i = NIL, i = number_utilities.f_1X( space_pos ); !i.numGE( end_var_$21 ); i = number_utilities.f_1X( i ) )
      {
        c = Strings.sublisp_char( token, i );
        done_with_keyP = NIL;
        if( NIL != read_keyP )
        {
          if( NIL != quote_char )
          {
            if( c.eql( quote_char ) )
            {
              quote_char = NIL;
              if( NIL == value_start )
              {
                value_start = i;
              }
              value_end = number_utilities.f_1_( i );
              done_with_keyP = T;
              read_keyP = NIL;
            }
            else if( quote_char.eql( Characters.CHAR_null ) && ( c.eql( Characters.CHAR_greater ) || NIL != string_utilities.whitespacep( c ) || number_utilities.f_1X( i ).eql( contents_end ) ) )
            {
              quote_char = NIL;
              value_end = ( ( NIL != string_utilities.whitespacep( c ) ) ? Numbers.subtract( i, ONE_INTEGER ) : i );
              done_with_keyP = T;
              read_keyP = NIL;
            }
            else if( NIL == value_start )
            {
              value_start = ( quote_char.eql( Characters.CHAR_null ) ? Numbers.subtract( i, ONE_INTEGER ) : i );
            }
          }
          else
          {
            pcase_var = c;
            if( pcase_var.eql( Characters.CHAR_quotation ) || pcase_var.eql( Characters.CHAR_quote ) )
            {
              if( NIL == found_equal_signP )
              {
                Errors.error( $str114$XML_syntax_error__No___before__S, string_utilities.substring( token, i, UNPROVIDED ) );
              }
              quote_char = c;
            }
            else if( pcase_var.eql( Characters.CHAR_equal ) )
            {
              found_equal_signP = T;
            }
            else if( NIL == string_utilities.whitespacep( c ) )
            {
              if( NIL != strictP )
              {
                Errors.error( $str115$XML_syntax_error__Value_starting_, string_utilities.substring( token, i, UNPROVIDED ) );
              }
              else
              {
                quote_char = Characters.CHAR_null;
              }
            }
          }
        }
        else
        {
          pcase_var = c;
          if( pcase_var.eql( Characters.CHAR_space ) || pcase_var.eql( Characters.CHAR_tab ) || pcase_var.eql( Characters.CHAR_return ) || pcase_var.eql( Characters.CHAR_newline ) || pcase_var.eql(
              Characters.CHAR_equal ) )
          {
            if( Characters.CHAR_equal.eql( c ) )
            {
              found_equal_signP = T;
            }
            if( NIL != key_start )
            {
              read_keyP = T;
              key_end = number_utilities.f_1_( i );
            }
          }
          else if( NIL != key_start )
          {
            key_end = i;
          }
          else
          {
            key_start = i;
          }
        }
        if( NIL != key_start && NIL != done_with_keyP )
        {
          pair = xml_attribute_value_pair_from_token( token, key_start, key_end, value_start, value_end );
          v_answer = ConsesLow.cons( pair, v_answer );
          key_start = NIL;
          key_end = NIL;
          value_start = NIL;
          value_end = NIL;
          found_equal_signP = NIL;
        }
      }
    }
    if( NIL != key_start )
    {
      final SubLObject pair2 = xml_attribute_value_pair_from_token( token, key_start, key_end, value_start, value_end );
      v_answer = ConsesLow.cons( pair2, v_answer );
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 33240L)
  public static SubLObject parse_xml_token_int(final SubLObject token, SubLObject strictP)
  {
    if( strictP == UNPROVIDED )
    {
      strictP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return parse_xml_token_int_internal( token, strictP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym112$PARSE_XML_TOKEN_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym112$PARSE_XML_TOKEN_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym112$PARSE_XML_TOKEN_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( token, strictP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( token.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && strictP.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( parse_xml_token_int_internal( token, strictP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( token, strictP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 35942L)
  public static SubLObject xml_attribute_value_pair_from_token(final SubLObject token, final SubLObject attribute_name_start, final SubLObject attribute_name_end, final SubLObject value_start, final SubLObject value_end)
  {
    final SubLObject attribute_name = unicode_strings.html_escaped_to_utf8_string( string_utilities.substring( token, attribute_name_start, number_utilities.f_1X( attribute_name_end ) ) );
    final SubLObject value = ( NIL != value_start ) ? unicode_strings.html_escaped_to_utf8_string( string_utilities.substring( token, value_start, number_utilities.f_1X( value_end ) ) ) : NIL;
    assert NIL != xml_utilities.valid_xml_name_p( attribute_name ) : attribute_name;
    return ConsesLow.cons( attribute_name, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 36379L)
  public static SubLObject xml_tagP(final SubLObject token)
  {
    return makeBoolean( token.isString() && NIL != list_utilities.lengthGE( token, THREE_INTEGER, UNPROVIDED ) && Characters.CHAR_less.eql( string_utilities.first_char( token ) ) && Characters.CHAR_greater.eql(
        string_utilities.last_char( token ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 36632L)
  public static SubLObject regular_xml_tagP(final SubLObject token)
  {
    return makeBoolean( NIL != xml_tagP( token ) && NIL == xml_declaration_p( token ) && NIL == xml_doctype_tag_p( token ) && NIL == xml_comment_p( token ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 36937L)
  public static SubLObject xml_empty_tagP(final SubLObject token)
  {
    return makeBoolean( NIL != xml_tagP( token ) && Characters.CHAR_slash.eql( string_utilities.char_from_end( token, ONE_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 37159L)
  public static SubLObject xml_cdata_tagP(final SubLObject token)
  {
    return makeBoolean( NIL != xml_tagP( token ) && NIL != string_utilities.starts_with_by_test( token, xml_utilities.xml_cdata_prefix(), Symbols.symbol_function( EQUAL ) ) && NIL != string_utilities.ends_with( token,
        xml_utilities.xml_cdata_suffix(), Symbols.symbol_function( EQUAL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 37467L)
  public static SubLObject xml_cdata_tag_text(final SubLObject tag)
  {
    assert NIL != xml_cdata_tagP( tag ) : tag;
    return string_utilities.substring( tag, Sequences.length( xml_utilities.xml_cdata_prefix() ), Numbers.subtract( Sequences.length( tag ), Sequences.length( xml_utilities.xml_cdata_suffix() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 37647L)
  public static SubLObject xml_closing_tokenP(final SubLObject element_name, final SubLObject token)
  {
    return makeBoolean( NIL != xml_tagP( token ) && NIL != xml_closing_tag_p( token ) && NIL != xml_token_element_nameP( token, element_name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 37968L)
  public static SubLObject xml_opening_tokenP(final SubLObject element_name, final SubLObject token)
  {
    return makeBoolean( NIL != xml_tagP( token ) && NIL != xml_opening_tag_p( token ) && NIL != xml_token_element_nameP( token, element_name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 38288L)
  public static SubLObject xml_token_element_nameP(final SubLObject token, final SubLObject element_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( token ) : token;
    if( NIL == xml_tagP( token ) )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject element_name_start = xml_token_element_name_start_and_end( token );
    final SubLObject element_name_end = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return makeBoolean( NIL != list_utilities.lengthE( element_name, Numbers.subtract( element_name_end, element_name_start ), UNPROVIDED ) && NIL != string_utilities.substring_matchP( token, element_name,
        element_name_start, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 38681L)
  public static SubLObject xml_token_element_name(final SubLObject token)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !token.isString() )
    {
      Errors.error( $str119$_S_is_not_an_XML_token, token );
    }
    if( NIL == xml_tagP( token ) )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject element_name_start = xml_token_element_name_start_and_end( token );
    final SubLObject element_name_end = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return string_utilities.substring( token, element_name_start, element_name_end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 39372L)
  public static SubLObject xml_token_element_name_start_and_end(final SubLObject token)
  {
    final SubLObject element_name_start = Characters.CHAR_slash.eql( Strings.sublisp_char( token, ONE_INTEGER ) ) ? TWO_INTEGER : ONE_INTEGER;
    final SubLObject space_pos = Sequences.position_if( $sym113$WHITESPACEP, token, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject token_length = Sequences.length( token );
    final SubLObject token_end = ( NIL != xml_empty_tagP( token ) ) ? Numbers.subtract( token_length, TWO_INTEGER ) : Numbers.subtract( token_length, ONE_INTEGER );
    final SubLObject element_name_end = ( NIL != space_pos ) ? space_pos : token_end;
    return Values.values( element_name_start, element_name_end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 39777L)
  public static SubLObject xml_tokens_to_sexpr(final SubLObject tokens)
  {
    final SubLObject iterator = iteration.new_list_iterator( tokens );
    final SubLObject sexpr = xml_token_iterator_to_sexpr( iterator, UNPROVIDED );
    SubLObject remaining = NIL;
    while ( NIL == iteration.iteration_done( iterator ))
    {
      remaining = ConsesLow.cons( iteration.iteration_next( iterator ), remaining );
    }
    iteration.iteration_finalize( iterator );
    return Values.values( sexpr, Sequences.nreverse( remaining ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 40681L)
  public static SubLObject xml_token_iterator_to_sexpr(final SubLObject token_iterator, SubLObject first_token)
  {
    if( first_token == UNPROVIDED )
    {
      first_token = NIL;
    }
    final SubLObject iteration_doneP = iteration.iteration_done( token_iterator );
    if( NIL == first_token && NIL == iteration_doneP )
    {
      first_token = iteration.iteration_next( token_iterator );
    }
    if( NIL != iteration_doneP )
    {
      return NIL;
    }
    if( NIL != xml_empty_tagP( first_token ) )
    {
      return ConsesLow.list( parse_xml_token( first_token ) );
    }
    if( NIL != xml_cdata_tagP( first_token ) )
    {
      return xml_cdata_tag_text( first_token );
    }
    if( NIL == xml_tagP( first_token ) )
    {
      return first_token;
    }
    return xml_token_iterator_to_sexpr_internal( token_iterator, first_token );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 41903L)
  public static SubLObject xml_token_iterator_to_sexpr_internal(final SubLObject token_iterator, final SubLObject first_token)
  {
    if( NIL != non_content_xml_token_p( first_token ) )
    {
      return xml_token_iterator_to_sexpr( token_iterator, UNPROVIDED );
    }
    final SubLObject head = parse_xml_token( first_token );
    SubLObject sexpr = ConsesLow.list( head );
    SubLObject next_token;
    for( next_token = ( NIL != iteration.iteration_done( token_iterator ) ) ? NIL : iteration.iteration_next( token_iterator ); NIL != non_content_xml_token_p( next_token ); next_token = ( NIL != iteration
        .iteration_done( token_iterator ) ) ? NIL : iteration.iteration_next( token_iterator ) )
    {
    }
    while ( NIL == iteration.iteration_done( token_iterator ))
    {
      if( NIL != xml_closing_tokenP( head.first(), next_token ) )
      {
        return Sequences.reverse( sexpr );
      }
      final SubLObject subexpr = xml_token_iterator_to_sexpr( token_iterator, next_token );
      if( subexpr.isString() )
      {
        if( sexpr.first().isString() )
        {
          final SubLObject old_value = sexpr.first();
          final SubLObject new_value = Sequences.cconcatenate( old_value, subexpr );
          sexpr = sexpr.rest();
          sexpr = ConsesLow.cons( new_value, sexpr );
        }
        else if( !$str120$.equal( string_utilities.trim_whitespace( subexpr ) ) )
        {
          sexpr = ConsesLow.cons( subexpr, sexpr );
        }
      }
      else
      {
        sexpr = ConsesLow.cons( subexpr, sexpr );
      }
      next_token = ( NIL != iteration.iteration_done( token_iterator ) ) ? NIL : iteration.iteration_next( token_iterator );
    }
    return Sequences.reverse( sexpr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 43253L)
  public static SubLObject xml_tag_attribute_value(final SubLObject tag, final SubLObject attribute, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != xml_tagP( tag ) : tag;
    assert NIL != Types.stringp( attribute ) : attribute;
    final SubLObject attributes = parse_xml_token( tag ).rest();
    return list_utilities.alist_lookup_without_values( attributes, attribute, Symbols.symbol_function( $sym121$STRING_ ), v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 43523L)
  public static SubLObject non_content_xml_token_p(final SubLObject token)
  {
    return makeBoolean( NIL != xml_declaration_p( token ) || NIL != xml_doctype_tag_p( token ) || NIL != xml_comment_p( token ) || NIL != xml_processing_instruction_p( token ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 43715L)
  public static SubLObject get_field_value_from_xml_sexpr(final SubLObject field, final SubLObject sexpr)
  {
    SubLObject cdolist_list_var = sexpr.rest();
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( child.first().first().equal( field ) )
      {
        return conses_high.second( child );
      }
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 44279L)
  public static SubLObject xml_sexpr_tag(final SubLObject sexpr)
  {
    return sexpr.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 44402L)
  public static SubLObject xml_sexpr_type(final SubLObject sexpr)
  {
    return xml_sexpr_tag( sexpr ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 44520L)
  public static SubLObject xml_sexpr_daughter(final SubLObject sexpr, final SubLObject tag)
  {
    SubLObject cdolist_list_var = xml_sexpr_daughters( sexpr, UNPROVIDED );
    SubLObject daughter = NIL;
    daughter = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Strings.stringE( xml_sexpr_type( daughter ), tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return daughter;
      }
      cdolist_list_var = cdolist_list_var.rest();
      daughter = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 44749L)
  public static SubLObject xml_sexpr_daughters(final SubLObject sexpr, SubLObject tag)
  {
    if( tag == UNPROVIDED )
    {
      tag = NIL;
    }
    if( NIL != tag )
    {
      SubLObject daughters = NIL;
      SubLObject cdolist_list_var = sexpr.rest();
      SubLObject daughter = NIL;
      daughter = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( daughter.isList() && NIL != Strings.stringE( xml_sexpr_type( daughter ), tag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          daughters = ConsesLow.cons( daughter, daughters );
        }
        cdolist_list_var = cdolist_list_var.rest();
        daughter = cdolist_list_var.first();
      }
      return Sequences.nreverse( daughters );
    }
    return sexpr.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 45105L)
  public static SubLObject xml_sexpr_attributes(final SubLObject sexpr)
  {
    return xml_sexpr_tag( sexpr ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 45240L)
  public static SubLObject xml_sexpr_attribute_value(final SubLObject sexpr, final SubLObject attribute)
  {
    return conses_high.assoc( attribute, xml_sexpr_attributes( sexpr ), $sym121$STRING_, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 45433L)
  public static SubLObject xml_sexpr_set_attribute(final SubLObject sexpr, final SubLObject key, final SubLObject value)
  {
    final SubLObject attributes = list_utilities.alist_enter( xml_sexpr_attributes( sexpr ), key, value, Symbols.symbol_function( $sym121$STRING_ ) );
    ConsesLow.rplacd( xml_sexpr_tag( sexpr ), attributes );
    return sexpr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 45739L)
  public static SubLObject xml_sexpr_atomic_p(final SubLObject sexpr)
  {
    return list_utilities.empty_list_p( xml_sexpr_daughters( sexpr, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 45837L)
  public static SubLObject xml_sexpr_wXsingle_valueP(final SubLObject sexpr)
  {
    final SubLObject dtrs = xml_sexpr_daughters( sexpr, UNPROVIDED );
    return makeBoolean( NIL != list_utilities.singletonP( dtrs ) && dtrs.first().isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/xml-parsing-utilities.lisp", position = 46073L)
  public static SubLObject xml_sexpr_value(final SubLObject sexpr)
  {
    return xml_sexpr_daughters( sexpr, UNPROVIDED ).first();
  }

  public static SubLObject declare_xml_parsing_utilities_file()
  {
    SubLFiles.declareFunction( me, "xml_tokenize", "XML-TOKENIZE", 1, 3, false );
    SubLFiles.declareFunction( me, "new_xml_token_iterator", "NEW-XML-TOKEN-ITERATOR", 1, 3, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_print_function_trampoline", "XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_p", "XML-TOKEN-ITERATOR-STATE-P", 1, 0, false );
    new $xml_token_iterator_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "xml_it_state_in_stream", "XML-IT-STATE-IN-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_it_state_scratch_stream", "XML-IT-STATE-SCRATCH-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_it_state_token_output_stream", "XML-IT-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_it_state_entity_map", "XML-IT-STATE-ENTITY-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_it_state_namespace_stack", "XML-IT-STATE-NAMESPACE-STACK", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_it_state_validateP", "XML-IT-STATE-VALIDATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_it_state_resolve_entity_referencesP", "XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_it_state_resolve_namespacesP", "XML-IT-STATE-RESOLVE-NAMESPACES?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_it_state_on_deck_queue", "XML-IT-STATE-ON-DECK-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xml_it_state_in_stream", "_CSETF-XML-IT-STATE-IN-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xml_it_state_scratch_stream", "_CSETF-XML-IT-STATE-SCRATCH-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xml_it_state_token_output_stream", "_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xml_it_state_entity_map", "_CSETF-XML-IT-STATE-ENTITY-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xml_it_state_namespace_stack", "_CSETF-XML-IT-STATE-NAMESPACE-STACK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xml_it_state_validateP", "_CSETF-XML-IT-STATE-VALIDATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xml_it_state_resolve_entity_referencesP", "_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xml_it_state_resolve_namespacesP", "_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_xml_it_state_on_deck_queue", "_CSETF-XML-IT-STATE-ON-DECK-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_xml_token_iterator_state", "MAKE-XML-TOKEN-ITERATOR-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_xml_token_iterator_state", "VISIT-DEFSTRUCT-XML-TOKEN-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_xml_token_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-XML-TOKEN-ITERATOR-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_xml_token_iterator_state", "PRINT-XML-TOKEN-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_xml_token_iterator_state", "NEW-XML-TOKEN-ITERATOR-STATE", 9, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_in_stream", "XML-TOKEN-ITERATOR-STATE-IN-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_scratch_stream", "XML-TOKEN-ITERATOR-STATE-SCRATCH-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_token_output_stream", "XML-TOKEN-ITERATOR-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_entity_map", "XML-TOKEN-ITERATOR-STATE-ENTITY-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_namespace_stack", "XML-TOKEN-ITERATOR-STATE-NAMESPACE-STACK", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_validateP", "XML-TOKEN-ITERATOR-STATE-VALIDATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_resolve_entity_referencesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_resolve_namespacesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-NAMESPACES?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_on_deck_queue", "XML-TOKEN-ITERATOR-STATE-ON-DECK-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_state_peek", "XML-TOKEN-ITERATOR-STATE-PEEK", 1, 0, false );
    SubLFiles.declareFunction( me, "advance_xml_token_iterator_to_next_element", "ADVANCE-XML-TOKEN-ITERATOR-TO-NEXT-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_progress", "XML-TOKEN-ITERATOR-PROGRESS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_iterator_xml_token_state", "MAKE-ITERATOR-XML-TOKEN-STATE", 4, 0, false );
    SubLFiles.declareFunction( me, "iterate_xml_token_done", "ITERATE-XML-TOKEN-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "iterate_xml_token_next", "ITERATE-XML-TOKEN-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_xml_token_on_deck_queue_populated", "ENSURE-XML-TOKEN-ON-DECK-QUEUE-POPULATED", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_iterator_state_handle_namespaces_and_entities", "XML-ITERATOR-STATE-HANDLE-NAMESPACES-AND-ENTITIES", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_xml_namespaces", "HANDLE-XML-NAMESPACES", 3, 0, false );
    SubLFiles.declareFunction( me, "xml_namespace_mapping_p", "XML-NAMESPACE-MAPPING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "validate_xml_namespaces", "VALIDATE-XML-NAMESPACES", 2, 0, false );
    SubLFiles.declareFunction( me, "maybe_validate_xml_namespace", "MAYBE-VALIDATE-XML-NAMESPACE", 3, 0, false );
    SubLFiles.declareFunction( me, "validate_xml_namespace", "VALIDATE-XML-NAMESPACE", 3, 0, false );
    SubLFiles.declareFunction( me, "xml_prefixed_name_p", "XML-PREFIXED-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_prefixed_name_namespace", "XML-PREFIXED-NAME-NAMESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_prefixed_name_local_name", "XML-PREFIXED-NAME-LOCAL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_string_tokenize", "XML-STRING-TOKENIZE", 1, 3, false );
    SubLFiles.declareFunction( me, "xml_tokenized_http_request", "XML-TOKENIZED-HTTP-REQUEST", 2, 9, false );
    SubLFiles.declareFunction( me, "xml_tokenized_http_request_internal", "XML-TOKENIZED-HTTP-REQUEST-INTERNAL", 9, 0, false );
    SubLFiles.declareMacro( me, "html_tokenize", "HTML-TOKENIZE" );
    SubLFiles.declareFunction( me, "xml_token_matches_exactly", "XML-TOKEN-MATCHES-EXACTLY", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_token_matches", "XML-TOKEN-MATCHES", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_token_starts_with", "XML-TOKEN-STARTS-WITH", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_token_mentions", "XML-TOKEN-MENTIONS", 2, 0, false );
    new $xml_token_mentions$BinaryFunction();
    SubLFiles.declareFunction( me, "next_xml_token_position", "NEXT-XML-TOKEN-POSITION", 2, 1, false );
    SubLFiles.declareFunction( me, "next_xml_token_position_if", "NEXT-XML-TOKEN-POSITION-IF", 2, 0, false );
    SubLFiles.declareFunction( me, "next_xml_token_position_if_not", "NEXT-XML-TOKEN-POSITION-IF-NOT", 2, 0, false );
    SubLFiles.declareFunction( me, "advance_xml_tokens", "ADVANCE-XML-TOKENS", 1, 1, false );
    SubLFiles.declareFunction( me, "advance_xml_tokens_to", "ADVANCE-XML-TOKENS-TO", 2, 1, false );
    SubLFiles.declareFunction( me, "xml_extract_token_sequence", "XML-EXTRACT-TOKEN-SEQUENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "accumulate_xml_token", "ACCUMULATE-XML-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "accumulate_xml_tokens", "ACCUMULATE-XML-TOKENS", 2, 0, false );
    SubLFiles.declareFunction( me, "accumulated_xml_tokens", "ACCUMULATED-XML-TOKENS", 0, 0, false );
    SubLFiles.declareFunction( me, "xml_tokens_for_next_element", "XML-TOKENS-FOR-NEXT-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "advance_xml_tokens_to_end_of_element", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "advance_xml_tokens_to_end_of_element_int", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_declaration_p", "XML-DECLARATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_comment_p", "XML-COMMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_closing_tag_p", "XML-CLOSING-TAG-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_opening_tag_p", "XML-OPENING-TAG-P", 1, 0, false );
    SubLFiles.declareFunction( me, "advance_xml_tokens_without_crossing", "ADVANCE-XML-TOKENS-WITHOUT-CROSSING", 3, 1, false );
    SubLFiles.declareFunction( me, "advance_xml_tokens_without_crossing_or_quit", "ADVANCE-XML-TOKENS-WITHOUT-CROSSING-OR-QUIT", 3, 1, false );
    SubLFiles.declareFunction( me, "xml_read", "XML-READ", 1, 2, false );
    SubLFiles.declareFunction( me, "xml_doctype_tag_p", "XML-DOCTYPE-TAG-P", 1, 0, false );
    SubLFiles.declareFunction( me, "html_doctype_tag_p", "HTML-DOCTYPE-TAG-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_processing_instruction_p", "XML-PROCESSING-INSTRUCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "entity_map_from_doctype_tag", "ENTITY-MAP-FROM-DOCTYPE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "resolve_entity_references", "RESOLVE-ENTITY-REFERENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "resolve_predefined_xml_entities", "RESOLVE-PREDEFINED-XML-ENTITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_xml_comments", "REMOVE-XML-COMMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_xml_token", "PARSE-XML-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_html_token", "PARSE-HTML-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_xml_token_int_internal", "PARSE-XML-TOKEN-INT-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "parse_xml_token_int", "PARSE-XML-TOKEN-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_attribute_value_pair_from_token", "XML-ATTRIBUTE-VALUE-PAIR-FROM-TOKEN", 5, 0, false );
    SubLFiles.declareFunction( me, "xml_tagP", "XML-TAG?", 1, 0, false );
    SubLFiles.declareFunction( me, "regular_xml_tagP", "REGULAR-XML-TAG?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_empty_tagP", "XML-EMPTY-TAG?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_cdata_tagP", "XML-CDATA-TAG?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_cdata_tag_text", "XML-CDATA-TAG-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_closing_tokenP", "XML-CLOSING-TOKEN?", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_opening_tokenP", "XML-OPENING-TOKEN?", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_token_element_nameP", "XML-TOKEN-ELEMENT-NAME?", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_token_element_name", "XML-TOKEN-ELEMENT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_element_name_start_and_end", "XML-TOKEN-ELEMENT-NAME-START-AND-END", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_tokens_to_sexpr", "XML-TOKENS-TO-SEXPR", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_to_sexpr", "XML-TOKEN-ITERATOR-TO-SEXPR", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_token_iterator_to_sexpr_internal", "XML-TOKEN-ITERATOR-TO-SEXPR-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_tag_attribute_value", "XML-TAG-ATTRIBUTE-VALUE", 2, 1, false );
    SubLFiles.declareFunction( me, "non_content_xml_token_p", "NON-CONTENT-XML-TOKEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_field_value_from_xml_sexpr", "GET-FIELD-VALUE-FROM-XML-SEXPR", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_tag", "XML-SEXPR-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_type", "XML-SEXPR-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_daughter", "XML-SEXPR-DAUGHTER", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_daughters", "XML-SEXPR-DAUGHTERS", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_sexpr_attributes", "XML-SEXPR-ATTRIBUTES", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_attribute_value", "XML-SEXPR-ATTRIBUTE-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_set_attribute", "XML-SEXPR-SET-ATTRIBUTE", 3, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_atomic_p", "XML-SEXPR-ATOMIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_wXsingle_valueP", "XML-SEXPR-W/SINGLE-VALUE?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_sexpr_value", "XML-SEXPR-VALUE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_xml_parsing_utilities_file()
  {
    $require_valid_xmlP$ = SubLFiles.defparameter( "*REQUIRE-VALID-XML?*", NIL );
    $dtp_xml_token_iterator_state$ = SubLFiles.defconstant( "*DTP-XML-TOKEN-ITERATOR-STATE*", $sym3$XML_TOKEN_ITERATOR_STATE );
    $xml_token_accumulator$ = SubLFiles.defparameter( "*XML-TOKEN-ACCUMULATOR*", misc_utilities.uninitialized() );
    return NIL;
  }

  public static SubLObject setup_xml_parsing_utilities_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_xml_token_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym10$XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list11 );
    Structures.def_csetf( $sym12$XML_IT_STATE_IN_STREAM, $sym13$_CSETF_XML_IT_STATE_IN_STREAM );
    Structures.def_csetf( $sym14$XML_IT_STATE_SCRATCH_STREAM, $sym15$_CSETF_XML_IT_STATE_SCRATCH_STREAM );
    Structures.def_csetf( $sym16$XML_IT_STATE_TOKEN_OUTPUT_STREAM, $sym17$_CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM );
    Structures.def_csetf( $sym18$XML_IT_STATE_ENTITY_MAP, $sym19$_CSETF_XML_IT_STATE_ENTITY_MAP );
    Structures.def_csetf( $sym20$XML_IT_STATE_NAMESPACE_STACK, $sym21$_CSETF_XML_IT_STATE_NAMESPACE_STACK );
    Structures.def_csetf( $sym22$XML_IT_STATE_VALIDATE_, $sym23$_CSETF_XML_IT_STATE_VALIDATE_ );
    Structures.def_csetf( $sym24$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_, $sym25$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ );
    Structures.def_csetf( $sym26$XML_IT_STATE_RESOLVE_NAMESPACES_, $sym27$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_ );
    Structures.def_csetf( $sym28$XML_IT_STATE_ON_DECK_QUEUE, $sym29$_CSETF_XML_IT_STATE_ON_DECK_QUEUE );
    Equality.identity( $sym3$XML_TOKEN_ITERATOR_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_xml_token_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym44$VISIT_DEFSTRUCT_OBJECT_XML_TOKEN_ITERATOR_STATE_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym9$PRINT_XML_TOKEN_ITERATOR_STATE );
    utilities_macros.note_funcall_helper_function( $sym1$ITERATE_XML_TOKEN_DONE );
    utilities_macros.note_funcall_helper_function( $sym2$ITERATE_XML_TOKEN_NEXT );
    access_macros.register_external_symbol( $sym56$XML_TOKENIZED_HTTP_REQUEST );
    memoization_state.note_memoized_function( $sym112$PARSE_XML_TOKEN_INT );
    generic_testing.define_test_case_table_int( $sym122$XML_TOKENS_TO_SEXPR, ConsesLow.list( new SubLObject[] { $kw123$TEST, EQUAL, $kw124$OWNER, NIL, $kw125$CLASSES, NIL, $kw126$KB, $kw127$TINY, $kw128$WORKING_, T
    } ), $list129 );
    generic_testing.define_test_case_table_int( $sym130$PARSE_HTML_TOKEN, ConsesLow.list( new SubLObject[] { $kw123$TEST, Symbols.symbol_function( EQUAL ), $kw124$OWNER, NIL, $kw125$CLASSES, NIL, $kw126$KB, $kw127$TINY,
      $kw128$WORKING_, T
    } ), $list131 );
    generic_testing.define_test_case_table_int( $sym132$PARSE_XML_TOKEN, ConsesLow.list( new SubLObject[] { $kw123$TEST, Symbols.symbol_function( EQUAL ), $kw124$OWNER, NIL, $kw125$CLASSES, NIL, $kw126$KB, $kw127$TINY,
      $kw128$WORKING_, T
    } ), $list133 );
    return NIL;
  }

  private static SubLObject _constant_133_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "<owl:onProperty/>" ) ), ConsesLow.list( makeString( "owl:onProperty" ) ) ), ConsesLow.list( ConsesLow.list( makeString(
        "<owl:Class rdf:ID=\"MarineEcosystem\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "MarineEcosystem" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
            "<owl:Class rdf:ID=\"PackIce\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "PackIce" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                "<owl:Class rdf:ID=\"SubmarineCanyon\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SubmarineCanyon" ) ) ) ), ConsesLow.list( ConsesLow.list(
                    makeString( "<owl:allValuesFrom rdf:resource=\"#Ocean\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Ocean" ) ) ) ), ConsesLow
                        .list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#SnowLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                            "#SnowLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Hydrosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                makeString( "Hydrosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Cryosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                    makeString( "rdf:ID" ), makeString( "Cryosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SedimentLayer\">" ) ), ConsesLow.list( makeString(
                                        "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SedimentLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                            "<rdfs:subClassOf rdf:resource=\"#Lake\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Lake" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<rdfs:range rdf:resource=\"#ClimateZoneType\"/>" ) ), ConsesLow.list( makeString( "rdfs:range" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#ClimateZoneType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#Stratosphere\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString(
              "rdf:resource" ), makeString( "#Stratosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Litter\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                  "rdf:ID" ), makeString( "Litter" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Pond\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                      "rdf:ID" ), makeString( "Pond" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D\">" ) ), ConsesLow
                          .list( makeString( "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D" ) ) ) ), ConsesLow.list(
                              ConsesLow.list( makeString( "<owl:Class rdf:ID=\"LowerMantle\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LowerMantle" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"#Catchment\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "#Catchment" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#MantleLayer\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#MantleLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"TroposphereLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
              "TroposphereLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart\"/>" ) ), ConsesLow.list( makeString(
                  "owl:onProperty" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "<owl:Class rdf:ID=\"IntertidalZone\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "IntertidalZone" ) ) ) ), ConsesLow.list( ConsesLow.list(
                          makeString( "<owl:Class rdf:ID=\"Cirque\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Cirque" ) ) ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "<owl:Class rdf:ID=\"EcosystemType\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "EcosystemType" ) ) ) ), ConsesLow
                                  .list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"PeriglacialLandform\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                      "PeriglacialLandform" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Mantle\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                          "rdf:ID" ), makeString( "Mantle" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#Hydrosphere\"/>" ) ), ConsesLow.list( makeString(
                                              "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Hydrosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "<owl:Class rdf:ID=\"TemperateClimateZone\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                      "TemperateClimateZone" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Fjord\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow
                                                          .cons( makeString( "rdf:ID" ), makeString( "Fjord" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Ocean\">" ) ), ConsesLow.list(
                                                              makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Ocean" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                  "<rdfs:domain rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>" ) ), ConsesLow.list( makeString( "rdfs:domain" ), ConsesLow
                                                                      .cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                          makeString( "<owl:Class rdf:ID=\"Felsic\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                              "Felsic" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Beach\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                  ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Beach" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                      "<owl:Class rdf:ID=\"Core\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                          "Core" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:equivalentClass rdf:resource=\"#Basin\"/>" ) ), ConsesLow.list(
                                                                                              makeString( "owl:equivalentClass" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Basin" ) ) ) ), ConsesLow
                                                                                                  .list( ConsesLow.list( makeString(
                                                                                                      "<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon\"/>" ) ), ConsesLow.list(
                                                                                                          makeString( "rdfs:range" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                                              "http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                  "<owl:Class rdf:ID=\"Mesosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                                                                                                      makeString( "rdf:ID" ), makeString( "Mesosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                          "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Water\"/>" ) ), ConsesLow
                                                                                                                              .list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                                                                                                                                  "http://sweet.jpl.nasa.gov/ontology/substance.owl#Water" ) ) ) ), ConsesLow.list(
                                                                                                                                      ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#Mesosphere\"/>" ) ),
                                                                                                                                      ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString(
                                                                                                                                          "rdf:resource" ), makeString( "#Mesosphere" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                              .list( makeString(
                                                                                                                                                  "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock\"/>" ) ),
                                                                                                                                              ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                                                                                                  "rdf:about" ), makeString(
                                                                                                                                                      "http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Marsh\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Marsh" ) ) ) ), ConsesLow.list(
          ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString(
              "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/property.owl#Height\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                      "http://sweet.jpl.nasa.gov/ontology/property.owl#Height" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/property.owl#Height\"/>" ) ), ConsesLow.list( makeString( "rdfs:range" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                              "http://sweet.jpl.nasa.gov/ontology/property.owl#Height" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SeaIceLayer\">" ) ), ConsesLow.list( makeString(
                                  "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SeaIceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "<owl:allValuesFrom rdf:resource=\"#Geosphere\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                          "#Geosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#Glacier\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow
                                              .cons( makeString( "rdf:resource" ), makeString( "#Glacier" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Watershed\">" ) ), ConsesLow.list(
                                                  makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Watershed" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "<owl:Class rdf:ID=\"Shoreline\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Shoreline" ) ) ) ), ConsesLow
                                                          .list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#Crust\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons(
                                                              makeString( "rdf:resource" ), makeString( "#Crust" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                  "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#haslowerBoundary\">" ) ), ConsesLow.list( makeString(
                                                                      "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                                                                          "http://sweet.jpl.nasa.gov/ontology/space.owl#haslowerBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                              "<owl:Class rdf:ID=\"RegionProperty\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                  "RegionProperty" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"MarineWetland\">" ) ), ConsesLow.list(
                                                                                      makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "MarineWetland" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                          .list( makeString( "<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/property.owl\"/>" ) ), ConsesLow.list(
                                                                                              makeString( "owl:imports" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                                  "http://sweet.jpl.nasa.gov/ontology/property.owl" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                      "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasUpperBoundary\">" ) ), ConsesLow
                                                                                                          .list( makeString( "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                                                                                                              "http://sweet.jpl.nasa.gov/ontology/space.owl#hasUpperBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                  makeString( "<owl:Class rdf:about=\"#VadoseZone\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                                                      ConsesLow.cons( makeString( "rdf:about" ), makeString( "#VadoseZone" ) ) ) ), ConsesLow.list(
                                                                                                                          ConsesLow.list( makeString(
                                                                                                                              "<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerLowerBoundaryOf\"/>" ) ),
                                                                                                                          ConsesLow.list( makeString( "owl:onProperty" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                                                                                                              makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerLowerBoundaryOf" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"EstuarineWetland\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "EstuarineWetland" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Volcano\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Volcano" ) ) ) ), ConsesLow.list(
          ConsesLow.list( makeString( "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Region\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ),
              makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#Region" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D\"/>" ) ), ConsesLow.list( makeString( "owl:onProperty" ), ConsesLow.cons( makeString( "rdf:resource" ),
                      makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"#OceanRegion\"/>" ) ), ConsesLow.list(
                          makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "#OceanRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "<rdfs:subClassOf rdf:resource=\"#Stream\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Stream" ) ) ) ), ConsesLow
                                  .list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"#Ocean\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                                      "#Ocean" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#Mantle\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons(
                                          makeString( "rdf:resource" ), makeString( "#Mantle" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#TerrestrialEcosystem\"/>" ) ),
                                              ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#TerrestrialEcosystem" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                  makeString( "<owl:Class rdf:ID=\"WaterTable\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "WaterTable" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#TopographicalRegion\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#TopographicalRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Spring\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
              "Spring" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Tropopause\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                  "Tropopause" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:equivalentClass rdf:resource=\"#Troposphere\"/>" ) ), ConsesLow.list( makeString( "owl:equivalentClass" ), ConsesLow.cons(
                      makeString( "rdf:resource" ), makeString( "#Troposphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf\">" ) ), ConsesLow.list( makeString( "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:about" ),
                              makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"WaterSurfaceLayer\">" ) ), ConsesLow.list(
                                  makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "WaterSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class>" ) ), ConsesLow.list(
                                      makeString( "owl:Class" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Layer\"/>" ) ), ConsesLow
                                          .list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#Layer" ) ) ) ), ConsesLow.list(
                                              ConsesLow.list( makeString( "<rdfs:range rdf:resource=\"#EcosystemType\"/>" ) ), ConsesLow.list( makeString( "rdfs:range" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                                  makeString( "#EcosystemType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#inside\">" ) ), ConsesLow.list( makeString( "owl:ObjectProperty" ), ConsesLow.cons(
                                                          makeString( "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#inside" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                              "<rdfs:subClassOf rdf:resource=\"#BodyOfIce\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                                                  makeString( "#BodyOfIce" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#GeometricalObject\"/>" ) ), ConsesLow.list( makeString(
                                                                          "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                              "http://sweet.jpl.nasa.gov/ontology/numerics.owl#GeometricalObject" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "<owl:Class rdf:ID=\"Plateau\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                      "Plateau" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"AphoticZone\">" ) ), ConsesLow.list( makeString(
                                                                                          "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "AphoticZone" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                              makeString( "<owl:Class rdf:ID=\"IslandArc\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                                                  "rdf:ID" ), makeString( "IslandArc" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                      "<rdfs:subClassOf rdf:resource=\"#SeaFloorWaterLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ),
                                                                                                          ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#SeaFloorWaterLayer" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                              .list( makeString( "<owl:Class rdf:about=\"#PlanetarySurfaceLayer\"/>" ) ), ConsesLow.list( makeString(
                                                                                                                  "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "#PlanetarySurfaceLayer" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
          "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SeaSurface\">" ) ), ConsesLow.list( makeString(
              "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SeaSurface" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:onProperty rdf:resource=\"#primarySubstance\"/>" ) ), ConsesLow
                  .list( makeString( "owl:onProperty" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#primarySubstance" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "<owl:Class rdf:about=\"#Groundwater\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "#Groundwater" ) ) ) ), ConsesLow.list( ConsesLow
                          .list( makeString( "<owl:Class rdf:ID=\"FastIce\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "FastIce" ) ) ) ), ConsesLow.list(
                              ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Swamp\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Swamp" ) ) ) ), ConsesLow
                                  .list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#LandWaterObject\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString(
                                      "rdf:resource" ), makeString( "#LandWaterObject" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"PhoticZone\">" ) ), ConsesLow.list( makeString(
                                          "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "PhoticZone" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "<rdfs:range rdf:resource=\"#EarthRealm\"/>" ) ), ConsesLow.list( makeString( "rdfs:range" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#EarthRealm" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"LandIceLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LandIceLayer" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#OceanRegion\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#OceanRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:equivalentClass rdf:resource=\"#EolianLandform\"/>" ) ), ConsesLow.list( makeString( "owl:equivalentClass" ), ConsesLow.cons(
              makeString( "rdf:resource" ), makeString( "#EolianLandform" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\"/>" ) ), ConsesLow.list( makeString( "rdfs:range" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                      "http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Rock_body\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                          ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Rock_body" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:equivalentClass rdf:resource=\"#SeaIceLayer\"/>" ) ), ConsesLow.list(
                              makeString( "owl:equivalentClass" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#SeaIceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "<owl:Class rdf:ID=\"Farmland\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Farmland" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                      makeString( "<rdfs:subClassOf rdf:resource=\"#SeaFloorRegion\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                          "#SeaFloorRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:onProperty rdf:resource=\"#hasGeomorphologicalType\"/>" ) ), ConsesLow.list( makeString(
                                              "owl:onProperty" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#hasGeomorphologicalType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "<owl:Class rdf:about=\"#SeaFloorGroundLayer\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                                                      "#SeaFloorGroundLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                          "<owl:someValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment\"/>" ) ), ConsesLow.list( makeString( "owl:someValuesFrom" ),
                                                              ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                  makeString( "<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar\"/>" ) ), ConsesLow.list( makeString(
                                                                      "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
          "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
              "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                  "http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:someValuesFrom rdf:resource=\"#OceanRegion\"/>" ) ), ConsesLow.list( makeString(
                      "owl:someValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#OceanRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "<owl:allValuesFrom rdf:resource=\"#TerrestrialEcosystem\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                              "#TerrestrialEcosystem" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Sea\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                  "rdf:ID" ), makeString( "Sea" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"KarstLandform\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                      makeString( "rdf:ID" ), makeString( "KarstLandform" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Troposphere\">" ) ), ConsesLow.list( makeString(
                                          "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Troposphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "<owl:Class rdf:ID=\"AlpineClimateZone\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "AlpineClimateZone" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"GlacialLandform\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "GlacialLandform" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#GroundWaterObjectBoundary\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ),
          makeString( "#GroundWaterObjectBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"BenticEcosystem\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
              "rdf:ID" ), makeString( "BenticEcosystem" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Isopycnal\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                  "rdf:ID" ), makeString( "Isopycnal" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"PlanetarySurface\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                      makeString( "rdf:ID" ), makeString( "PlanetarySurface" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#CoastalRegion\"/>" ) ), ConsesLow.list( makeString(
                          "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#CoastalRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "<owl:allValuesFrom rdf:resource=\"#OceanRegion\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#OceanRegion" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"#LandRegion\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "#LandRegion" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:equivalentClass rdf:resource=\"#UndergroundWater\"/>" ) ), ConsesLow.list( makeString( "owl:equivalentClass" ), ConsesLow.cons( makeString( "rdf:resource" ),
          makeString( "#UndergroundWater" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Mafic\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
              makeString( "Mafic" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice\"/>" ) ), ConsesLow.list( makeString(
                  "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "<owl:Class rdf:ID=\"Delta\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Delta" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "<owl:Class rdf:ID=\"SeaIce\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SeaIce" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "<owl:Class rdf:ID=\"Creek\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Creek" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                  makeString( "<owl:Class rdf:ID=\"LandRegion\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LandRegion" ) ) ) ), ConsesLow.list(
                                      ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Thermosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                          "Thermosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Ridge\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                              "rdf:ID" ), makeString( "Ridge" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#SurfaceWater\"/>" ) ), ConsesLow.list( makeString(
                                                  "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#SurfaceWater" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "<owl:Class rdf:about=\"#Floodplain\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "#Floodplain" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SnowLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SnowLayer" ) ) ) ), ConsesLow
          .list( ConsesLow.list( makeString( "<owl:allValuesFrom>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"IceFloe\">" ) ), ConsesLow
              .list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "IceFloe" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"DryLandRegion\">" ) ), ConsesLow
                  .list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "DryLandRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Aquifer\">" ) ), ConsesLow
                      .list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Aquifer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"MiddleAtmosphere\">" ) ),
                          ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "MiddleAtmosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "<owl:Class rdf:ID=\"Biosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Biosphere" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                  makeString( "<owl:Class rdf:ID=\"PlanetaryStructure\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "PlanetaryStructure" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"CoralReef\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "CoralReef" ) ) ) ), ConsesLow
          .list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"ContinentalMargin\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "ContinentalMargin" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SurfaceWater\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SurfaceWater" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:equivalentClass rdf:resource=\"#EarthRealm\"/>" ) ), ConsesLow.list( makeString( "owl:equivalentClass" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#EarthRealm" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Estuary\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
              "Estuary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"IceCore\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                  "IceCore" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Air\"/>" ) ), ConsesLow.list( makeString(
                      "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Air" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "<owl:Class rdf:ID=\"CrustLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "CrustLayer" ) ) ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "<owl:equivalentClass rdf:resource=\"#SeaFloorRegion\"/>" ) ), ConsesLow.list( makeString( "owl:equivalentClass" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                  "#SeaFloorRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#LandSurfaceLayer\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ),
                                      ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#LandSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo\"/>" ) ), ConsesLow.list( makeString( "owl:onProperty" ), ConsesLow.cons( makeString(
                                              "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "<owl:Class rdf:ID=\"SeaFloorRegion\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SeaFloorRegion" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#MarineEcosystem\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#MarineEcosystem" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Plain\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
              "Plain" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#WaterSurface\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString(
                  "rdf:resource" ), makeString( "#WaterSurface" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Benthos\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                      makeString( "rdf:ID" ), makeString( "Benthos" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#PlanetarySurfaceLayer\"/>" ) ), ConsesLow.list( makeString(
                          "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#PlanetarySurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "<rdfs:subClassOf rdf:resource=\"#MarineEcosystem\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                  "#MarineEcosystem" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"MixedLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                      "rdf:ID" ), makeString( "MixedLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Stratosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                          ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Stratosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"LandSurface\">" ) ), ConsesLow.list(
                                              makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LandSurface" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "<owl:Class rdf:ID=\"SolidEarth\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SolidEarth" ) ) ) ), ConsesLow
                                                      .list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SoilLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                          makeString( "SoilLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"HydrosphereLayer\">" ) ), ConsesLow.list( makeString(
                                                              "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "HydrosphereLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                  "<owl:Class rdf:ID=\"EolianLandform\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                      "EolianLandform" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#SeaFloor\"/>" ) ), ConsesLow.list(
                                                                          makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#SeaFloor" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                              makeString( "<owl:Class rdf:ID=\"Benthic\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                                                  makeString( "Benthic" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#PermafrostZone\"/>" ) ),
                                                                                      ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                          "#PermafrostZone" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"TectonicLandform\">" ) ), ConsesLow
                                                                                              .list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "TectonicLandform" ) ) ) ), ConsesLow
                                                                                                  .list( ConsesLow.list( makeString( "<owl:ObjectProperty rdf:ID=\"hasLowerBoundaryHeight\">" ) ), ConsesLow.list(
                                                                                                      makeString( "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                                          "hasLowerBoundaryHeight" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                              "<owl:allValuesFrom rdf:resource=\"#Thermosphere\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ),
                                                                                                                  ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Thermosphere" ) ) ) ), ConsesLow.list(
                                                                                                                      ConsesLow.list( makeString( "<owl:DatatypeProperty rdf:ID=\"hasLowerBoundaryReferenceHeight\">" ) ),
                                                                                                                      ConsesLow.list( makeString( "owl:DatatypeProperty" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                                                                                          makeString( "hasLowerBoundaryReferenceHeight" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                              "<rdfs:subClassOf rdf:resource=\"#CryosphereLayer\"/>" ) ), ConsesLow.list( makeString(
                                                                                                                                  "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                                                                      "#CryosphereLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                          "<owl:Class rdf:ID=\"Mountain\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                                                                              ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Mountain" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo\">" ) ), ConsesLow.list( makeString( "owl:ObjectProperty" ), ConsesLow.cons(
          makeString( "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"CryosphereLayer\">" ) ), ConsesLow
              .list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "CryosphereLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "<owl:allValuesFrom rdf:resource=\"#SeaFloorGroundLayer\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                      "#SeaFloorGroundLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"TerrrestrialWetland\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                          "rdf:ID" ), makeString( "TerrrestrialWetland" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Region\"/>" ) ),
                              ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#Region" ) ) ) ), ConsesLow.list(
                                  ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#TroposphereLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                      makeString( "#TroposphereLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString(
                                              "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                      "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                          "<owl:someValuesFrom rdf:resource=\"#LandRegion\"/>" ) ), ConsesLow.list( makeString( "owl:someValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                                              makeString( "#LandRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"LandwaterSurfaceLayer\">" ) ), ConsesLow.list( makeString(
                                                                  "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LandwaterSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#inside\"/>" ) ), ConsesLow.list( makeString( "owl:onProperty" ),
                                                                          ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#inside" ) ) ) ), ConsesLow.list( ConsesLow
                                                                              .list( makeString( "<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#contains\"/>" ) ), ConsesLow.list( makeString(
                                                                                  "owl:onProperty" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                      "http://sweet.jpl.nasa.gov/ontology/space.owl#contains" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                          "<owl:Class rdf:ID=\"PalustrineWetland\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                                                              makeString( "PalustrineWetland" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                  "<rdfs:range rdf:resource=\"#SurfaceRegion\"/>" ) ), ConsesLow.list( makeString( "rdfs:range" ), ConsesLow.cons(
                                                                                                      makeString( "rdf:resource" ), makeString( "#SurfaceRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                          "<rdfs:subClassOf rdf:resource=\"#Atmosphere\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow
                                                                                                              .cons( makeString( "rdf:resource" ), makeString( "#Atmosphere" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                  makeString( "<owl:Class rdf:ID=\"FreshwaterLake\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                                                      ConsesLow.cons( makeString( "rdf:ID" ), makeString( "FreshwaterLake" ) ) ) ), ConsesLow.list(
                                                                                                                          ConsesLow.list( makeString( "<owl:Class rdf:ID=\"FluvialLandform\">" ) ), ConsesLow.list(
                                                                                                                              makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                                                                  "FluvialLandform" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                      "<owl:Class rdf:ID=\"HydrothermalVents\">" ) ), ConsesLow.list( makeString(
                                                                                                                                          "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                                                                              "HydrothermalVents" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                                  "<rdfs:subClassOf rdf:resource=\"#Groundwater\"/>" ) ), ConsesLow.list(
                                                                                                                                                      makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString(
                                                                                                                                                          "rdf:resource" ), makeString( "#Groundwater" ) ) ) ), ConsesLow
                                                                                                                                                              .list( ConsesLow.list( makeString(
                                                                                                                                                                  "<owl:Class rdf:about=\"#Basin\"/>" ) ), ConsesLow.list(
                                                                                                                                                                      makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                                                                                                                          "rdf:about" ), makeString( "#Basin" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SeaFloorGroundLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
          "SeaFloorGroundLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
              ConsesLow.cons( makeString( "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "<rdfs:subClassOf rdf:resource=\"#Forest_Ecosystem\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Forest_Ecosystem" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Bedrock\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Bedrock" ) ) ) ), ConsesLow.list(
          ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#LandRegion\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
              "#LandRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"LacustrineWetland\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                  makeString( "LacustrineWetland" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"CostalLandform\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                      "rdf:ID" ), makeString( "CostalLandform" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"ClimateZoneType\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                          makeString( "rdf:ID" ), makeString( "ClimateZoneType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#TectonicLandform\"/>" ) ), ConsesLow.list(
                              makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#TectonicLandform" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "<owl:Class rdf:ID=\"TropicalClimateZone\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "TropicalClimateZone" ) ) ) ), ConsesLow
                                      .list( ConsesLow.list( makeString( "<owl:ObjectProperty rdf:ID=\"hasEcosystemType\">" ) ), ConsesLow.list( makeString( "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                          makeString( "hasEcosystemType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:onProperty rdf:resource=\"#hasEcosystemType\"/>" ) ), ConsesLow.list( makeString(
                                              "owl:onProperty" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#hasEcosystemType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "<owl:allValuesFrom rdf:resource=\"#PlanetarySurfaceLayer\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                                      makeString( "#PlanetarySurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"GroundWaterObjectBoundary\">" ) ), ConsesLow.list(
                                                          makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "GroundWaterObjectBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                              "<owl:allValuesFrom rdf:resource=\"#Lake\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                                                  makeString( "#Lake" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf\"/>" ) ), ConsesLow.list( makeString( "owl:onProperty" ),
                                                                          ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf" ) ) ) ), ConsesLow.list(
                                                                              ConsesLow.list( makeString( "<owl:Class rdf:ID=\"RockGlacier\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                                  "rdf:ID" ), makeString( "RockGlacier" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SubsurfaceWater\">" ) ),
                                                                                      ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SubsurfaceWater" ) ) ) ), ConsesLow
                                                                                          .list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"#LandwaterRegion\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                              ConsesLow.cons( makeString( "rdf:about" ), makeString( "#LandwaterRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                  "<rdfs:domain rdf:resource=\"#EarthRealm\"/>" ) ), ConsesLow.list( makeString( "rdfs:domain" ), ConsesLow.cons(
                                                                                                      makeString( "rdf:resource" ), makeString( "#EarthRealm" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                          "<rdfs:subClassOf rdf:resource=\"#LithosphereLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ),
                                                                                                              ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#LithosphereLayer" ) ) ) ), ConsesLow.list(
                                                                                                                  ConsesLow.list( makeString( "<owl:Class rdf:ID=\"MontaneForest\">" ) ), ConsesLow.list( makeString(
                                                                                                                      "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "MontaneForest" ) ) ) ), ConsesLow
                                                                                                                          .list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"CaveEcosystem\">" ) ), ConsesLow.list(
                                                                                                                              makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                                                                  "CaveEcosystem" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                      "<owl:Class rdf:ID=\"Tundra_Ecosystem\">" ) ), ConsesLow.list( makeString(
                                                                                                                                          "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                                                                              "Tundra_Ecosystem" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                                  "<owl:Class rdf:ID=\"Dune\">" ) ), ConsesLow.list( makeString(
                                                                                                                                                      "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                                                                                          "Dune" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                                              "<owl:Class rdf:ID=\"DemersalEcosystem\">" ) ), ConsesLow
                                                                                                                                                                  .list( makeString( "owl:Class" ), ConsesLow.cons(
                                                                                                                                                                      makeString( "rdf:ID" ), makeString(
                                                                                                                                                                          "DemersalEcosystem" ) ) ) ), ConsesLow.list(
                                                                                                                                                                              ConsesLow.list( makeString(
                                                                                                                                                                                  "<owl:equivalentClass rdf:resource=\"#LandIceLayer\"/>" ) ),
                                                                                                                                                                              ConsesLow.list( makeString(
                                                                                                                                                                                  "owl:equivalentClass" ), ConsesLow.cons(
                                                                                                                                                                                      makeString( "rdf:resource" ),
                                                                                                                                                                                      makeString( "#LandIceLayer" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith\"/>" ) ), ConsesLow.list( makeString( "owl:onProperty" ), ConsesLow
          .cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
              "<owl:Class rdf:ID=\"BarrierIsland\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "BarrierIsland" ) ) ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "<owl:Class rdf:ID=\"Leads\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Leads" ) ) ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "<rdfs:subClassOf rdf:resource=\"#WaterSurface\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                          "#WaterSurface" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#BodyOfWater\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons(
                              makeString( "rdf:resource" ), makeString( "#BodyOfWater" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"MangroveForest\">" ) ), ConsesLow.list( makeString(
                                  "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "MangroveForest" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Grassland\">" ) ), ConsesLow
                                      .list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Grassland" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "<owl:ObjectProperty rdf:ID=\"coveredBySubstance_temporary\">" ) ), ConsesLow.list( makeString( "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                              "coveredBySubstance_temporary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"UrbanLand\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                  ConsesLow.cons( makeString( "rdf:ID" ), makeString( "UrbanLand" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "<owl:equivalentClass rdf:resource=\"#LandSurfaceLayer\"/>" ) ), ConsesLow.list( makeString( "owl:equivalentClass" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                                          makeString( "#LandSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Ionosphere\">" ) ), ConsesLow.list( makeString(
                                                              "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Ionosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                  "<owl:Class rdf:ID=\"PelagicEcosystem\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                      "PelagicEcosystem" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#SeaSurfaceLayer\"/>" ) ), ConsesLow.list(
                                                                          makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#SeaSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow
                                                                              .list( makeString( "<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\"/>" ) ), ConsesLow.list(
                                                                                  makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                      "http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                          "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\">" ) ), ConsesLow.list( makeString(
                                                                                              "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                                                                                                  "http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                      "<owl:equivalentClass rdf:resource=\"#Farmland\"/>" ) ), ConsesLow.list( makeString( "owl:equivalentClass" ),
                                                                                                          ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Farmland" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                              makeString( "<owl:onProperty rdf:resource=\"#hasLowerBoundaryReferenceHeight\"/>" ) ), ConsesLow.list(
                                                                                                                  makeString( "owl:onProperty" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                                                      "#hasLowerBoundaryReferenceHeight" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                          "<owl:Class rdf:ID=\"OceanLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow
                                                                                                                              .cons( makeString( "rdf:ID" ), makeString( "OceanLayer" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                  .list( makeString( "<rdfs:subClassOf rdf:resource=\"#PlanetarySurface\"/>" ) ), ConsesLow
                                                                                                                                      .list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                                                                                                                          makeString( "#PlanetarySurface" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                              makeString( "<owl:Class rdf:ID=\"Iceberg\">" ) ), ConsesLow.list( makeString(
                                                                                                                                                  "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                                                                                      "Iceberg" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                                          "<owl:Class rdf:ID=\"Aeoliean\">" ) ), ConsesLow.list( makeString(
                                                                                                                                                              "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                                                                                                                                  makeString( "Aeoliean" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                      .list( makeString(
                                                                                                                                                                          "<owl:equivalentClass rdf:resource=\"#Geosphere\"/>" ) ),
                                                                                                                                                                      ConsesLow.list( makeString( "owl:equivalentClass" ),
                                                                                                                                                                          ConsesLow.cons( makeString( "rdf:resource" ),
                                                                                                                                                                              makeString( "#Geosphere" ) ) ) ), ConsesLow
                                                                                                                                                                                  .list( ConsesLow.list( makeString(
                                                                                                                                                                                      "<owl:Class rdf:ID=\"Isobar\">" ) ),
                                                                                                                                                                                      ConsesLow.list( makeString(
                                                                                                                                                                                          "owl:Class" ), ConsesLow.cons(
                                                                                                                                                                                              makeString( "rdf:ID" ),
                                                                                                                                                                                              makeString( "Isobar" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"LandwaterRegion\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LandwaterRegion" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:ObjectProperty rdf:ID=\"hasClimateZoneType\">" ) ), ConsesLow.list( makeString( "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
          "hasClimateZoneType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SnowField\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
              "SnowField" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"RiftValley\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                  "RiftValley" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#LakeLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString(
                      "rdf:resource" ), makeString( "#LakeLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:disjointWith rdf:resource=\"#LandSurface\"/>" ) ), ConsesLow.list( makeString(
                          "owl:disjointWith" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#LandSurface" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"#Dam\"/>" ) ),
                              ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "#Dam" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "<owl:allValuesFrom rdf:resource=\"#Rock_body\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Rock_body" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Lagoon\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Lagoon" ) ) ) ), ConsesLow.list(
          ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#OceanLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
              "#OceanLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#BodyOfSeaIce\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString(
                  "rdf:resource" ), makeString( "#BodyOfSeaIce" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl\"/>" ) ), ConsesLow.list(
                      makeString( "owl:imports" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "<owl:Class rdf:ID=\"Seamount\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Seamount" ) ) ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "<owl:Class rdf:ID=\"Lithosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Lithosphere" ) ) ) ), ConsesLow.list(
                                  ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#SeaSurface\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                      makeString( "#SeaSurface" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>" ) ),
                                          ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#MantleLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#MantleLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"IceLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
              "IceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SurfaceRegion\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                  "SurfaceRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#double\">" ) ), ConsesLow.list( makeString( "owl:hasValue" ),
                      ConsesLow.cons( makeString( "rdf:datatype" ), makeString( "http://www.w3.org/2001/XMLSchema#double" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Asthenosphere\">" ) ),
                          ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Asthenosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "<owl:equivalentClass rdf:resource=\"#LandRegion\"/>" ) ), ConsesLow.list( makeString( "owl:equivalentClass" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                  "#LandRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:ObjectProperty rdf:ID=\"primarySubstance\">" ) ), ConsesLow.list( makeString( "owl:ObjectProperty" ), ConsesLow
                                      .cons( makeString( "rdf:ID" ), makeString( "primarySubstance" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Thermocline\">" ) ), ConsesLow.list(
                                          makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Thermocline" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "<rdfs:subClassOf rdf:resource=\"#Trench\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                  "#Trench" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#CrustLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ),
                                                      ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#CrustLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                          "<owl:allValuesFrom rdf:resource=\"#Lithosphere\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                                              makeString( "#Lithosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"fiord\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                  ConsesLow.cons( makeString( "rdf:ID" ), makeString( "fiord" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Land\">" ) ),
                                                                      ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Land" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                          makeString( "<owl:Class rdf:ID=\"ArcticClimateZone\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                                              makeString( "ArcticClimateZone" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary\"/>" ) ), ConsesLow.list( makeString(
                                                                                      "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                          "http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                              "<owl:Class rdf:ID=\"SubtropicalClimateZone\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                                                  "rdf:ID" ), makeString( "SubtropicalClimateZone" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                      "<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Water\"/>" ) ), ConsesLow.list(
                                                                                                          makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                                              "http://sweet.jpl.nasa.gov/ontology/substance.owl#Water" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                  "<owl:Class rdf:ID=\"SeaSurfaceLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                                                                                                      makeString( "rdf:ID" ), makeString( "SeaSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                          makeString( "<owl:equivalentClass rdf:resource=\"#Fjord\"/>" ) ), ConsesLow.list( makeString(
                                                                                                                              "owl:equivalentClass" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                                                                  "#Fjord" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                      "<owl:Class rdf:ID=\"Mesopause\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                                                                          ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Mesopause" ) ) ) ), ConsesLow
                                                                                                                                              .list( ConsesLow.list( makeString(
                                                                                                                                                  "<owl:allValuesFrom rdf:resource=\"#WaterSurfaceLayer\"/>" ) ), ConsesLow
                                                                                                                                                      .list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString(
                                                                                                                                                          "rdf:resource" ), makeString( "#WaterSurfaceLayer" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"BodyOfGround\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "BodyOfGround" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"BodyOfSeaIce\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "BodyOfSeaIce" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"WaterChannel\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "WaterChannel" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Cryosol\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
          "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Cryosol" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SedimentaryStructure\">" ) ), ConsesLow.list(
              makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SedimentaryStructure" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "<owl:Class rdf:ID=\"AtmosphereLayerBoundary\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "AtmosphereLayerBoundary" ) ) ) ), ConsesLow.list(
                      ConsesLow.list( makeString( "<owl:Class rdf:ID=\"F-Region\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "F-Region" ) ) ) ), ConsesLow.list(
                          ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Lake\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Lake" ) ) ) ), ConsesLow.list(
                              ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Continent\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Continent" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"FractureZone\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "FractureZone" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#CrustLayer\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#CrustLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"DepthHoarLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
              "DepthHoarLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"WaterSurface\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                  makeString( "WaterSurface" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart\">" ) ), ConsesLow.list( makeString(
                      "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "<owl:Class rdf:ID=\"Cave\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Cave" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "<owl:Class rdf:ID=\"LowerAtmosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LowerAtmosphere" ) ) ) ), ConsesLow.list(
                                  ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Moho\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Moho" ) ) ) ), ConsesLow
                                      .list( ConsesLow.list( makeString( "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#contains\">" ) ), ConsesLow.list( makeString( "owl:ObjectProperty" ),
                                          ConsesLow.cons( makeString( "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#contains" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "<rdfs:subClassOf rdf:resource=\"#Crust\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Crust" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Stream\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Stream" ) ) ) ), ConsesLow.list(
          ConsesLow.list( makeString( "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Air\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ),
              makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Air" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"RiparianWetland\">" ) ), ConsesLow.list( makeString(
                  "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "RiparianWetland" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                      "<owl:someValuesFrom rdf:resource=\"#LandwaterSurfaceLayer\"/>" ) ), ConsesLow.list( makeString( "owl:someValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                          "#LandwaterSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:range rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>" ) ), ConsesLow.list( makeString(
                              "rdfs:range" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://www.w3.org/2002/07/owl#Thing" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                  "<rdfs:subClassOf rdf:resource=\"#CoreLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#CoreLayer" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Polynya\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Polynya" ) ) ) ), ConsesLow.list(
          ConsesLow.list( makeString( "<owl:Class rdf:ID=\"AtmosphereLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "AtmosphereLayer" ) ) ) ), ConsesLow
              .list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                  "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#IceLayer\"/>" ) ),
                      ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#IceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "<owl:Class rdf:ID=\"AbyssalPlain\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "AbyssalPlain" ) ) ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance\"/>" ) ), ConsesLow.list( makeString( "rdfs:range" ), ConsesLow.cons( makeString(
                                  "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "<owl:Class rdf:ID=\"GeomorphologicalRegionType\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                          "GeomorphologicalRegionType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Geosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow
                                              .cons( makeString( "rdf:ID" ), makeString( "Geosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"LandWaterSurface\">" ) ), ConsesLow.list(
                                                  makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LandWaterSurface" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "<owl:equivalentClass rdf:resource=\"#CoastalRegion\"/>" ) ), ConsesLow.list( makeString( "owl:equivalentClass" ), ConsesLow.cons( makeString( "rdf:resource" ),
                                                          makeString( "#CoastalRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#HydrosphereLayer\"/>" ) ), ConsesLow.list(
                                                              makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#HydrosphereLayer" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                  makeString( "<owl:Class rdf:ID=\"GroundSurfaceLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                                      makeString( "GroundSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#CaveEcosystem\"/>" ) ),
                                                                          ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#CaveEcosystem" ) ) ) ), ConsesLow
                                                                              .list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#GeosphereLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ),
                                                                                  ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#GeosphereLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                      "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Soil\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                          ConsesLow.cons( makeString( "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Soil" ) ) ) ), ConsesLow
                                                                                              .list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"AbyssalHill\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                                  ConsesLow.cons( makeString( "rdf:ID" ), makeString( "AbyssalHill" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                      "<owl:Class rdf:ID=\"RockyCoast\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                                                          "rdf:ID" ), makeString( "RockyCoast" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                              "<owl:Class rdf:ID=\"DesertClimateZone\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                                                                                                  makeString( "rdf:ID" ), makeString( "DesertClimateZone" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                      makeString( "<rdfs:domain rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>" ) ), ConsesLow.list(
                                                                                                                          makeString( "rdfs:domain" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                                                              "http://www.w3.org/2002/07/owl#Thing" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                  "<owl:Class rdf:ID=\"Magnetosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                                                                      ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Magnetosphere" ) ) ) ), ConsesLow
                                                                                                                                          .list( ConsesLow.list( makeString(
                                                                                                                                              "<owl:allValuesFrom rdf:resource=\"#LandwaterSurfaceLayer\"/>" ) ), ConsesLow
                                                                                                                                                  .list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString(
                                                                                                                                                      "rdf:resource" ), makeString( "#LandwaterSurfaceLayer" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#EarthRealm\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#EarthRealm" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#Grassland\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString(
              "rdf:resource" ), makeString( "#Grassland" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerUpperBoundaryOf\"/>" ) ),
                  ConsesLow.list( makeString( "owl:onProperty" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerUpperBoundaryOf" ) ) ) ), ConsesLow.list(
                      ConsesLow.list( makeString( "<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>" ) ), ConsesLow.list( makeString( "rdfs:range" ), ConsesLow.cons( makeString(
                          "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "<rdfs:subClassOf rdf:resource=\"#SeaSurfaceLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                  "#SeaSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"OceanRidge\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                      "rdf:ID" ), makeString( "OceanRidge" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Atmosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                          ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Atmosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"GeosphereLayer\">" ) ), ConsesLow.list(
                                              makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "GeosphereLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                      "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                          "<rdfs:domain rdf:resource=\"#SurfaceRegion\"/>" ) ), ConsesLow.list( makeString( "rdfs:domain" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                              "#SurfaceRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#CoastalRegion\"/>" ) ), ConsesLow.list( makeString(
                                                                  "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#CoastalRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Body\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ),
                                                                          ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#Body" ) ) ) ), ConsesLow.list( ConsesLow
                                                                              .list( makeString( "<owl:ObjectProperty rdf:ID=\"hasGeomorphologicalType\">" ) ), ConsesLow.list( makeString( "owl:ObjectProperty" ),
                                                                                  ConsesLow.cons( makeString( "rdf:ID" ), makeString( "hasGeomorphologicalType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                      "<rdfs:subClassOf rdf:resource=\"#AtmosphereLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons(
                                                                                          makeString( "rdf:resource" ), makeString( "#AtmosphereLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                              "<owl:Class rdf:about=\"#Mesosphere\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                                                  "rdf:about" ), makeString( "#Mesosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                      "<owl:Class rdf:ID=\"Land_WaterBoundary_2D\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                                                                                          makeString( "rdf:ID" ), makeString( "Land_WaterBoundary_2D" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                              "<owl:Class rdf:ID=\"Forest_Ecosystem\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                                                                                                  makeString( "rdf:ID" ), makeString( "Forest_Ecosystem" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                      makeString( "<owl:Class rdf:ID=\"AgriculturalLands\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                                                          ConsesLow.cons( makeString( "rdf:ID" ), makeString( "AgriculturalLands" ) ) ) ), ConsesLow.list(
                                                                                                                              ConsesLow.list( makeString(
                                                                                                                                  "<owl:DatatypeProperty rdf:ID=\"hasUpperBoundaryReferenceHeight\">" ) ), ConsesLow.list(
                                                                                                                                      makeString( "owl:DatatypeProperty" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                                                                                                          makeString( "hasUpperBoundaryReferenceHeight" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                              .list( makeString(
                                                                                                                                                  "<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl\"/>" ) ),
                                                                                                                                              ConsesLow.list( makeString( "owl:imports" ), ConsesLow.cons( makeString(
                                                                                                                                                  "rdf:resource" ), makeString(
                                                                                                                                                      "http://sweet.jpl.nasa.gov/ontology/numerics.owl" ) ) ) ), ConsesLow
                                                                                                                                                          .list( ConsesLow.list( makeString(
                                                                                                                                                              "<owl:Class rdf:ID=\"Talik\">" ) ), ConsesLow.list(
                                                                                                                                                                  makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                                                                                                                      "rdf:ID" ), makeString( "Talik" ) ) ) ), ConsesLow
                                                                                                                                                                          .list( ConsesLow.list( makeString(
                                                                                                                                                                              "<owl:Class rdf:ID=\"Inlet\">" ) ), ConsesLow
                                                                                                                                                                                  .list( makeString( "owl:Class" ),
                                                                                                                                                                                      ConsesLow.cons( makeString(
                                                                                                                                                                                          "rdf:ID" ), makeString(
                                                                                                                                                                                              "Inlet" ) ) ) ), ConsesLow
                                                                                                                                                                                                  .list( ConsesLow.list(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "<owl:Class rdf:ID=\"Desert_Ecosystem\">" ) ),
                                                                                                                                                                                                      ConsesLow.list(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "owl:Class" ),
                                                                                                                                                                                                          ConsesLow.cons(
                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                  "rdf:ID" ),
                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                  "Desert_Ecosystem" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"InversionLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "InversionLayer" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"OceanCrustLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "OceanCrustLayer" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Shoal\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Shoal" ) ) ) ), ConsesLow.list(
          ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Wetland\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Wetland" ) ) ) ), ConsesLow.list( ConsesLow
              .list( makeString( "<owl:Class rdf:ID=\"LithosphereLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LithosphereLayer" ) ) ) ), ConsesLow.list(
                  ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#BodyOfGround\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                      "#BodyOfGround" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"#SubsurfaceRegion\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                          "rdf:about" ), makeString( "#SubsurfaceRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"IceSheet\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow
                              .cons( makeString( "rdf:ID" ), makeString( "IceSheet" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Glacier\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                  ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Glacier" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#LandSurface\"/>" ) ), ConsesLow
                                      .list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#LandSurface" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "<owl:Class rdf:ID=\"Littoral\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Littoral" ) ) ) ), ConsesLow.list(
                                              ConsesLow.list( makeString( "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isUpperBoundaryOf\">" ) ), ConsesLow.list( makeString(
                                                  "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#isUpperBoundaryOf" ) ) ) ), ConsesLow.list(
                                                      ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#UndergroundWater\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString(
                                                          "rdf:resource" ), makeString( "#UndergroundWater" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                              "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                  "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "<owl:Class rdf:ID=\"SkinLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                          "SkinLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                              "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLowerBoundaryOf\">" ) ), ConsesLow.list( makeString(
                                                                                  "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                                                                                      "http://sweet.jpl.nasa.gov/ontology/space.owl#isLowerBoundaryOf" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                          "<owl:Class rdf:ID=\"UpperMantle_flowing\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                                              "rdf:ID" ), makeString( "UpperMantle_flowing" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                  "<rdfs:subClassOf rdf:resource=\"#GlobalPlanetaryLayers\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ),
                                                                                                      ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#GlobalPlanetaryLayers" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                          .list( makeString( "<rdfs:subClassOf rdf:resource=\"#LandRegion\"/>" ) ), ConsesLow.list( makeString(
                                                                                                              "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#LandRegion" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#WaterSurfaceLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#WaterSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Savanna\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
              "Savanna" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#Basin\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString(
                  "rdf:resource" ), makeString( "#Basin" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"OceanRegion\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                      makeString( "rdf:ID" ), makeString( "OceanRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"PlanetEarth\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow
                          .cons( makeString( "rdf:ID" ), makeString( "PlanetEarth" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"BoundaryLayer\">" ) ), ConsesLow.list( makeString(
                              "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "BoundaryLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Crust\">" ) ), ConsesLow.list(
                                  makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Crust" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "<rdfs:subClassOf rdf:resource=\"#EcosystemType\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                          "#EcosystemType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"ActiveLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                              makeString( "rdf:ID" ), makeString( "ActiveLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                  "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Layer\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ),
                                                      makeString( "http://sweet.jpl.nasa.gov/ontology/space.owl#Layer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"LandIce\">" ) ), ConsesLow
                                                          .list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LandIce" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                              "<rdfs:subClassOf rdf:resource=\"#Wetland\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                  "#Wetland" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"LandSurfaceLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                      ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LandSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                          "<owl:Class rdf:ID=\"Trench\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                              "Trench" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasRegionBoundary\">" ) ), ConsesLow.list( makeString(
                                                                                      "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                                                                                          "http://sweet.jpl.nasa.gov/ontology/space.owl#hasRegionBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                              "<rdfs:subClassOf rdf:resource=\"#RegionProperty\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons(
                                                                                                  makeString( "rdf:resource" ), makeString( "#RegionProperty" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                      "<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith\">" ) ), ConsesLow
                                                                                                          .list( makeString( "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                                                                                                              "http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                  makeString( "<rdfs:subClassOf rdf:resource=\"#ClimateZoneType\"/>" ) ), ConsesLow.list( makeString(
                                                                                                                      "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                                                          "#ClimateZoneType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                              "<owl:Class rdf:ID=\"MantleLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow
                                                                                                                                  .cons( makeString( "rdf:ID" ), makeString( "MantleLayer" ) ) ) ), ConsesLow.list(
                                                                                                                                      ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#SeaIceLayer\"/>" ) ),
                                                                                                                                      ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString(
                                                                                                                                          "rdf:resource" ), makeString( "#SeaIceLayer" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                              .list( makeString( "<owl:Class rdf:ID=\"River\">" ) ), ConsesLow.list(
                                                                                                                                                  makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                                                                                                                      makeString( "River" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                                          makeString(
                                                                                                                                                              "<owl:allValuesFrom rdf:resource=\"#LandWaterSurface\"/>" ) ),
                                                                                                                                                          ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons(
                                                                                                                                                              makeString( "rdf:resource" ), makeString(
                                                                                                                                                                  "#LandWaterSurface" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                      .list( makeString(
                                                                                                                                                                          "<owl:allValuesFrom rdf:resource=\"#Troposphere\"/>" ) ),
                                                                                                                                                                      ConsesLow.list( makeString( "owl:allValuesFrom" ),
                                                                                                                                                                          ConsesLow.cons( makeString( "rdf:resource" ),
                                                                                                                                                                              makeString( "#Troposphere" ) ) ) ), ConsesLow
                                                                                                                                                                                  .list( ConsesLow.list( makeString(
                                                                                                                                                                                      "<owl:Class rdf:about=\"#LandWaterObject\"/>" ) ),
                                                                                                                                                                                      ConsesLow.list( makeString(
                                                                                                                                                                                          "owl:Class" ), ConsesLow.cons(
                                                                                                                                                                                              makeString( "rdf:about" ),
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "#LandWaterObject" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"TopographicalRegion\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
          "TopographicalRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"#CoastalRegion\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ),
              makeString( "#CoastalRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Stratopause\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                  makeString( "Stratopause" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"UpperAtmosphere\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                      "rdf:ID" ), makeString( "UpperAtmosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"DeepOcean\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                          makeString( "rdf:ID" ), makeString( "DeepOcean" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"BorealForest\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                              ConsesLow.cons( makeString( "rdf:ID" ), makeString( "BorealForest" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Nearshore\">" ) ), ConsesLow.list( makeString(
                                  "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Nearshore" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"GlobalPlanetaryLayers\">" ) ),
                                      ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "GlobalPlanetaryLayers" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                          "<owl:Class rdf:ID=\"UpperAir\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "UpperAir" ) ) ) ), ConsesLow.list(
                                              ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#Cryosphere\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString(
                                                  "rdf:resource" ), makeString( "#Cryosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"LakeLayer\">" ) ), ConsesLow.list( makeString(
                                                      "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "LakeLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                          "<owl:Class rdf:ID=\"Permafrost\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Permafrost" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#SeaFloorWaterLayer\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ),
          makeString( "#SeaFloorWaterLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"UpperMantle_rigid\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
              "rdf:ID" ), makeString( "UpperMantle_rigid" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"CoastalRegion\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                  makeString( "rdf:ID" ), makeString( "CoastalRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#Ionosphere\"/>" ) ), ConsesLow.list( makeString(
                      "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Ionosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#Island\"/>" ) ),
                          ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#Island" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                              "<rdfs:subClassOf rdf:resource=\"#LandSurfaceLayer\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                  "#LandSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"PlanetarySurfaceLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                      makeString( "rdf:ID" ), makeString( "PlanetarySurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Exosphere\">" ) ), ConsesLow.list( makeString(
                                          "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Exosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "<owl:Class rdf:about=\"#LandwaterSurfaceLayer\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                                                  "#LandwaterSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Sky\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                                      makeString( "rdf:ID" ), makeString( "Sky" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:equivalentClass rdf:resource=\"#UpperMantle_flowing\"/>" ) ),
                                                          ConsesLow.list( makeString( "owl:equivalentClass" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#UpperMantle_flowing" ) ) ) ), ConsesLow.list(
                                                              ConsesLow.list( makeString( "<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                                                                  makeString( "rdf:about" ), makeString( "http://www.w3.org/2002/07/owl#Thing" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "<owl:Class rdf:ID=\"Peatland\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                          "Peatland" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"#LandSurfaceLayer\"/>" ) ), ConsesLow.list( makeString(
                                                                              "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString( "#LandSurfaceLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "<rdfs:subClassOf rdf:resource=\"#SurfaceRegion\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons( makeString(
                                                                                      "rdf:resource" ), makeString( "#SurfaceRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                          "<owl:Class rdf:ID=\"MediterraneanClimateZone\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString(
                                                                                              "rdf:ID" ), makeString( "MediterraneanClimateZone" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                  "<rdfs:subClassOf rdf:resource=\"#GeomorphologicalRegionType\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ),
                                                                                                      ConsesLow.cons( makeString( "rdf:resource" ), makeString( "#GeomorphologicalRegionType" ) ) ) ), ConsesLow.list(
                                                                                                          ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Island\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                                              ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Island" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                  makeString( "<rdfs:subClassOf rdf:resource=\"#LandwaterRegion\"/>" ) ), ConsesLow.list( makeString(
                                                                                                                      "rdfs:subClassOf" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
                                                                                                                          "#LandwaterRegion" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                              "<owl:Class rdf:about=\"#Stratosphere\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                                                                                  ConsesLow.cons( makeString( "rdf:about" ), makeString( "#Stratosphere" ) ) ) ), ConsesLow
                                                                                                                                      .list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"BodyOfWater\">" ) ), ConsesLow
                                                                                                                                          .list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                                                                                                              makeString( "BodyOfWater" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                                  "<owl:Class rdf:ID=\"EarthRealm\"/>" ) ), ConsesLow.list( makeString(
                                                                                                                                                      "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                                                                                                          "EarthRealm" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                                              "<rdfs:subClassOf rdf:resource=\"#WetlandRegion\"/>" ) ),
                                                                                                                                                              ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow
                                                                                                                                                                  .cons( makeString( "rdf:resource" ), makeString(
                                                                                                                                                                      "#WetlandRegion" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                          .list( makeString(
                                                                                                                                                                              "<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl\"/>" ) ),
                                                                                                                                                                          ConsesLow.list( makeString( "owl:imports" ),
                                                                                                                                                                              ConsesLow.cons( makeString( "rdf:resource" ),
                                                                                                                                                                                  makeString(
                                                                                                                                                                                      "http://sweet.jpl.nasa.gov/ontology/substance.owl" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SeaFloorWaterLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
          "SeaFloorWaterLayer" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance\"/>" ) ), ConsesLow.list(
              makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString( "http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance" ) ) ) ), ConsesLow.list( ConsesLow.list(
                  makeString( "<owl:Class rdf:ID=\"Halocline\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Halocline" ) ) ) ), ConsesLow.list( ConsesLow.list(
                      makeString( "<owl:ObjectProperty rdf:ID=\"hasUpperBoundaryHeight\">" ) ), ConsesLow.list( makeString( "owl:ObjectProperty" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                          "hasUpperBoundaryHeight" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"TerrestrialEcosystem\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons(
                              makeString( "rdf:ID" ), makeString( "TerrestrialEcosystem" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SalineLake\">" ) ), ConsesLow.list( makeString(
                                  "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SalineLake" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                      "<owl:Class rdf:ID=\"WetlandRegion\" xmlns:rdf=\"http://rdf.com/\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                          "WetlandRegion" ) ), ConsesLow.cons( makeString( "xmlns:rdf" ), makeString( "http://rdf.com/" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "<owl:Class rdf:ID=\"CoreLayer\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "CoreLayer" ) ) ) ), ConsesLow.list(
                                                  ConsesLow.list( makeString( "<rdfs:subClassOf rdf:resource=\"#AtmosphereLayerBoundary\"/>" ) ), ConsesLow.list( makeString( "rdfs:subClassOf" ), ConsesLow.cons(
                                                      makeString( "rdf:resource" ), makeString( "#AtmosphereLayerBoundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                          "<owl:Class rdf:ID=\"UndergroundWater\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                              "UndergroundWater" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"SeaFloor\">" ) ), ConsesLow.list( makeString( "owl:Class" ),
                                                                  ConsesLow.cons( makeString( "rdf:ID" ), makeString( "SeaFloor" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                      "<owl:Class rdf:ID=\"LandWaterObject\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                                          "LandWaterObject" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Pycnocline\">" ) ), ConsesLow.list( makeString(
                                                                              "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Pycnocline" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                  "<rdfs:range rdf:resource=\"#GeomorphologicalRegionType\"/>" ) ), ConsesLow.list( makeString( "rdfs:range" ), ConsesLow.cons( makeString(
                                                                                      "rdf:resource" ), makeString( "#GeomorphologicalRegionType" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                          "<owl:Class rdf:ID=\"BodyOfIce\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ),
                                                                                              makeString( "BodyOfIce" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"PermafrostZone\">" ) ),
                                                                                                  ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "PermafrostZone" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeString( "<owl:allValuesFrom rdf:resource=\"#Atmosphere\"/>" ) ), ConsesLow.list( makeString( "owl:allValuesFrom" ), ConsesLow.cons( makeString( "rdf:resource" ), makeString(
          "#Atmosphere" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\">" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow
              .cons( makeString( "rdf:about" ), makeString( "http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Body\"/>" ) ), ConsesLow.list( makeString( "owl:Class" ), ConsesLow.cons( makeString( "rdf:about" ), makeString(
                      "http://sweet.jpl.nasa.gov/ontology/space.owl#Body" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\"\n        >" ) ),
                          ConsesLow.list( makeString( "owl:hasValue" ), ConsesLow.cons( makeString( "rdf:datatype" ), makeString( "http://www.w3.org/2001/XMLSchema#boolean" ) ) ) ), ConsesLow.list( ConsesLow.list(
                              makeString( "<owl:hasValue rdf:datatype='http://www.w3.org/2001/XMLSchema#boolean'\n        >" ) ), ConsesLow.list( makeString( "owl:hasValue" ), ConsesLow.cons( makeString(
                                  "rdf:datatype" ), makeString( "http://www.w3.org/2001/XMLSchema#boolean" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:Class rdf:ID=\"Z\">" ) ), ConsesLow.list( makeString(
                                      "owl:Class" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "Z" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString( "<owl:DatatypeProperty  rdf:ID= \"AbsoluteValueFn\">" ) ),
                                          ConsesLow.list( makeString( "owl:DatatypeProperty" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString( "AbsoluteValueFn" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                              "<owl:DatatypeProperty  rdf:ID = \"AbsoluteValueFn\">" ) ), ConsesLow.list( makeString( "owl:DatatypeProperty" ), ConsesLow.cons( makeString( "rdf:ID" ), makeString(
                                                  "AbsoluteValueFn" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
                                                      "<rdf:RDF\n\nxmlns:rdf =\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n\nxmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n\n xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n\nxmlns     =\"http://reliant.teknowledge.com/DAML/SUMO.owl#\"\n\n>" ) ),
                                                      ConsesLow.list( makeString( "rdf:RDF" ), ConsesLow.cons( makeString( "xmlns:rdf" ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ) ), ConsesLow.cons(
                                                          makeString( "xmlns:rdfs" ), makeString( "http://www.w3.org/2000/01/rdf-schema#" ) ), ConsesLow.cons( makeString( "xmlns:owl" ), makeString(
                                                              "http://www.w3.org/2002/07/owl#" ) ), ConsesLow.cons( makeString( "xmlns" ), makeString( "http://reliant.teknowledge.com/DAML/SUMO.owl#" ) ) ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_xml_parsing_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_xml_parsing_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_xml_parsing_utilities_file();
  }
  static
  {
    me = new xml_parsing_utilities();
    $require_valid_xmlP$ = null;
    $dtp_xml_token_iterator_state$ = null;
    $xml_token_accumulator$ = null;
    $sym0$STREAMP = makeSymbol( "STREAMP" );
    $sym1$ITERATE_XML_TOKEN_DONE = makeSymbol( "ITERATE-XML-TOKEN-DONE" );
    $sym2$ITERATE_XML_TOKEN_NEXT = makeSymbol( "ITERATE-XML-TOKEN-NEXT" );
    $sym3$XML_TOKEN_ITERATOR_STATE = makeSymbol( "XML-TOKEN-ITERATOR-STATE" );
    $sym4$XML_TOKEN_ITERATOR_STATE_P = makeSymbol( "XML-TOKEN-ITERATOR-STATE-P" );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "IN-STREAM" ), makeSymbol( "SCRATCH-STREAM" ), makeSymbol( "TOKEN-OUTPUT-STREAM" ), makeSymbol( "ENTITY-MAP" ), makeSymbol( "NAMESPACE-STACK" ), makeSymbol(
        "VALIDATE?" ), makeSymbol( "RESOLVE-ENTITY-REFERENCES?" ), makeSymbol( "RESOLVE-NAMESPACES?" ), makeSymbol( "ON-DECK-QUEUE" )
    } );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "IN-STREAM" ), makeKeyword( "SCRATCH-STREAM" ), makeKeyword( "TOKEN-OUTPUT-STREAM" ), makeKeyword( "ENTITY-MAP" ), makeKeyword( "NAMESPACE-STACK" ),
      makeKeyword( "VALIDATE?" ), makeKeyword( "RESOLVE-ENTITY-REFERENCES?" ), makeKeyword( "RESOLVE-NAMESPACES?" ), makeKeyword( "ON-DECK-QUEUE" )
    } );
    $list7 = ConsesLow.list( new SubLObject[] { makeSymbol( "XML-IT-STATE-IN-STREAM" ), makeSymbol( "XML-IT-STATE-SCRATCH-STREAM" ), makeSymbol( "XML-IT-STATE-TOKEN-OUTPUT-STREAM" ), makeSymbol(
        "XML-IT-STATE-ENTITY-MAP" ), makeSymbol( "XML-IT-STATE-NAMESPACE-STACK" ), makeSymbol( "XML-IT-STATE-VALIDATE?" ), makeSymbol( "XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?" ), makeSymbol(
            "XML-IT-STATE-RESOLVE-NAMESPACES?" ), makeSymbol( "XML-IT-STATE-ON-DECK-QUEUE" )
    } );
    $list8 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-XML-IT-STATE-IN-STREAM" ), makeSymbol( "_CSETF-XML-IT-STATE-SCRATCH-STREAM" ), makeSymbol( "_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM" ), makeSymbol(
        "_CSETF-XML-IT-STATE-ENTITY-MAP" ), makeSymbol( "_CSETF-XML-IT-STATE-NAMESPACE-STACK" ), makeSymbol( "_CSETF-XML-IT-STATE-VALIDATE?" ), makeSymbol( "_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?" ), makeSymbol(
            "_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?" ), makeSymbol( "_CSETF-XML-IT-STATE-ON-DECK-QUEUE" )
    } );
    $sym9$PRINT_XML_TOKEN_ITERATOR_STATE = makeSymbol( "PRINT-XML-TOKEN-ITERATOR-STATE" );
    $sym10$XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list11 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "XML-TOKEN-ITERATOR-STATE-P" ) );
    $sym12$XML_IT_STATE_IN_STREAM = makeSymbol( "XML-IT-STATE-IN-STREAM" );
    $sym13$_CSETF_XML_IT_STATE_IN_STREAM = makeSymbol( "_CSETF-XML-IT-STATE-IN-STREAM" );
    $sym14$XML_IT_STATE_SCRATCH_STREAM = makeSymbol( "XML-IT-STATE-SCRATCH-STREAM" );
    $sym15$_CSETF_XML_IT_STATE_SCRATCH_STREAM = makeSymbol( "_CSETF-XML-IT-STATE-SCRATCH-STREAM" );
    $sym16$XML_IT_STATE_TOKEN_OUTPUT_STREAM = makeSymbol( "XML-IT-STATE-TOKEN-OUTPUT-STREAM" );
    $sym17$_CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM = makeSymbol( "_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM" );
    $sym18$XML_IT_STATE_ENTITY_MAP = makeSymbol( "XML-IT-STATE-ENTITY-MAP" );
    $sym19$_CSETF_XML_IT_STATE_ENTITY_MAP = makeSymbol( "_CSETF-XML-IT-STATE-ENTITY-MAP" );
    $sym20$XML_IT_STATE_NAMESPACE_STACK = makeSymbol( "XML-IT-STATE-NAMESPACE-STACK" );
    $sym21$_CSETF_XML_IT_STATE_NAMESPACE_STACK = makeSymbol( "_CSETF-XML-IT-STATE-NAMESPACE-STACK" );
    $sym22$XML_IT_STATE_VALIDATE_ = makeSymbol( "XML-IT-STATE-VALIDATE?" );
    $sym23$_CSETF_XML_IT_STATE_VALIDATE_ = makeSymbol( "_CSETF-XML-IT-STATE-VALIDATE?" );
    $sym24$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ = makeSymbol( "XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?" );
    $sym25$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ = makeSymbol( "_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?" );
    $sym26$XML_IT_STATE_RESOLVE_NAMESPACES_ = makeSymbol( "XML-IT-STATE-RESOLVE-NAMESPACES?" );
    $sym27$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_ = makeSymbol( "_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?" );
    $sym28$XML_IT_STATE_ON_DECK_QUEUE = makeSymbol( "XML-IT-STATE-ON-DECK-QUEUE" );
    $sym29$_CSETF_XML_IT_STATE_ON_DECK_QUEUE = makeSymbol( "_CSETF-XML-IT-STATE-ON-DECK-QUEUE" );
    $kw30$IN_STREAM = makeKeyword( "IN-STREAM" );
    $kw31$SCRATCH_STREAM = makeKeyword( "SCRATCH-STREAM" );
    $kw32$TOKEN_OUTPUT_STREAM = makeKeyword( "TOKEN-OUTPUT-STREAM" );
    $kw33$ENTITY_MAP = makeKeyword( "ENTITY-MAP" );
    $kw34$NAMESPACE_STACK = makeKeyword( "NAMESPACE-STACK" );
    $kw35$VALIDATE_ = makeKeyword( "VALIDATE?" );
    $kw36$RESOLVE_ENTITY_REFERENCES_ = makeKeyword( "RESOLVE-ENTITY-REFERENCES?" );
    $kw37$RESOLVE_NAMESPACES_ = makeKeyword( "RESOLVE-NAMESPACES?" );
    $kw38$ON_DECK_QUEUE = makeKeyword( "ON-DECK-QUEUE" );
    $str39$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw40$BEGIN = makeKeyword( "BEGIN" );
    $sym41$MAKE_XML_TOKEN_ITERATOR_STATE = makeSymbol( "MAKE-XML-TOKEN-ITERATOR-STATE" );
    $kw42$SLOT = makeKeyword( "SLOT" );
    $kw43$END = makeKeyword( "END" );
    $sym44$VISIT_DEFSTRUCT_OBJECT_XML_TOKEN_ITERATOR_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-XML-TOKEN-ITERATOR-STATE-METHOD" );
    $str45$_XML_TOKEN_ITERATOR_STATE_ = makeString( "<XML-TOKEN-ITERATOR-STATE>" );
    $kw46$DONE = makeKeyword( "DONE" );
    $str47$Couldn_t_resolve_namespace__S_in_ = makeString( "Couldn't resolve namespace ~S in ~S" );
    $str48$Mismatched_tags__Expected__S__got = makeString( "Mismatched tags: Expected ~S, got ~S" );
    $list49 = ConsesLow.cons( makeSymbol( "ELEMENT-NAME" ), makeSymbol( "ATTRIBUTES" ) );
    $str50$xmlns_ = makeString( "xmlns:" );
    $list51 = ConsesLow.cons( makeSymbol( "ATTRIBUTE" ), makeSymbol( "VALUE" ) );
    $list52 = ConsesLow.cons( makeSymbol( "ATTRIBUTE-NAME" ), makeUninternedSymbol( "VALUE" ) );
    $str53$xml = makeString( "xml" );
    $str54$http___www_w3_org_XML_1998_namesp = makeString( "http://www.w3.org/XML/1998/namespace" );
    $str55$_S_is_not_a_prefixed_XML_name_ = makeString( "~S is not a prefixed XML name." );
    $sym56$XML_TOKENIZED_HTTP_REQUEST = makeSymbol( "XML-TOKENIZED-HTTP-REQUEST" );
    $kw57$GET = makeKeyword( "GET" );
    $int58$80 = makeInteger( 80 );
    $kw59$DEFAULT = makeKeyword( "DEFAULT" );
    $sym60$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw61$OPEN_CONNECTION = makeKeyword( "OPEN-CONNECTION" );
    $kw62$ERROR = makeKeyword( "ERROR" );
    $kw63$OVERALL = makeKeyword( "OVERALL" );
    $kw64$PRIVATE = makeKeyword( "PRIVATE" );
    $kw65$MACHINE = makeKeyword( "MACHINE" );
    $kw66$PORT = makeKeyword( "PORT" );
    $kw67$METHOD = makeKeyword( "METHOD" );
    $kw68$URL = makeKeyword( "URL" );
    $kw69$QUERY = makeKeyword( "QUERY" );
    $kw70$KEEP_ALIVE_ = makeKeyword( "KEEP-ALIVE?" );
    $kw71$WIDE_NEWLINES_ = makeKeyword( "WIDE-NEWLINES?" );
    $kw72$ACCEPT_TYPES = makeKeyword( "ACCEPT-TYPES" );
    $kw73$CONTENT_TYPE = makeKeyword( "CONTENT-TYPE" );
    $kw74$SOAP_ACTION_URI = makeKeyword( "SOAP-ACTION-URI" );
    $list75 = ConsesLow.list( makeSymbol( "IN-STREAM" ) );
    $sym76$HTML_TOKENIZE = makeSymbol( "HTML-TOKENIZE" );
    $list77 = ConsesLow.list( makeSymbol( "XML-TOKENIZE" ) );
    $sym78$XML_TOKENIZE = makeSymbol( "XML-TOKENIZE" );
    $list79 = ConsesLow.list( NIL );
    $sym80$CHAR_EQUAL = makeSymbol( "CHAR-EQUAL" );
    $sym81$XML_TOKEN_MENTIONS = makeSymbol( "XML-TOKEN-MENTIONS" );
    $str82$_ = makeString( "<" );
    $str83$__ = makeString( "/>" );
    $str84$__ = makeString( "</" );
    $sym85$XML_TAG_ = makeSymbol( "XML-TAG?" );
    $list86 = ConsesLow.cons( makeSymbol( "FIRST-TOKEN" ), makeSymbol( "REST-OF-TOKENS" ) );
    $sym87$XML_TOKEN_ELEMENT_NAME_ = makeSymbol( "XML-TOKEN-ELEMENT-NAME?" );
    $str88$Couldn_t_find_position_of__S_in__ = makeString( "Couldn't find position of ~S in ~S" );
    $str89$_xml = makeString( "?xml" );
    $str90$____ = makeString( "<!--" );
    $str91$___ = makeString( "-->" );
    $list92 = ConsesLow.list( ConsesLow.cons( Characters.CHAR_less, Characters.CHAR_greater ) );
    $list93 = ConsesLow.list( Characters.CHAR_less, Characters.CHAR_greater );
    $str94$___ = makeString( "!--" );
    $str95$__CDATA_ = makeString( "![CDATA[" );
    $str96$__ = makeString( "--" );
    $str97$__ = makeString( "]]" );
    $str98$Mismatched_closing_bracket__S_fol = makeString( "Mismatched closing bracket ~S following ~S. Expected ~S" );
    $str99$_DOCTYPE = makeString( "!DOCTYPE" );
    $str100$__DOCTYPE_HTML_ = makeString( "<!DOCTYPE HTML " );
    $str101$__ = makeString( "<?" );
    $str102$__ = makeString( "?>" );
    $list103 = ConsesLow.list( Characters.CHAR_lbracket );
    $list104 = ConsesLow.listS( makeSymbol( "DOCTYPE" ), makeSymbol( "NAME" ), makeSymbol( "OPEN-BRACKET" ), makeSymbol( "REST" ) );
    $str105$__DOCTYPE = makeString( "<!DOCTYPE" );
    $str106$Got__S_instead_of___DOCTYPE_ = makeString( "Got ~S instead of <!DOCTYPE." );
    $str107$_ = makeString( "[" );
    $str108$__ENTITY = makeString( "<!ENTITY" );
    $str109$_ = makeString( "&" );
    $str110$_ = makeString( ";" );
    $list111 = ConsesLow.cons( makeSymbol( "NAME" ), makeSymbol( "CODE" ) );
    $sym112$PARSE_XML_TOKEN_INT = makeSymbol( "PARSE-XML-TOKEN-INT" );
    $sym113$WHITESPACEP = makeSymbol( "WHITESPACEP" );
    $str114$XML_syntax_error__No___before__S = makeString( "XML syntax error: No = before ~S" );
    $str115$XML_syntax_error__Value_starting_ = makeString( "XML syntax error: Value starting at ~S is not in quotes." );
    $sym116$VALID_XML_NAME_P = makeSymbol( "VALID-XML-NAME-P" );
    $sym117$XML_CDATA_TAG_ = makeSymbol( "XML-CDATA-TAG?" );
    $sym118$STRINGP = makeSymbol( "STRINGP" );
    $str119$_S_is_not_an_XML_token = makeString( "~S is not an XML token" );
    $str120$ = makeString( "" );
    $sym121$STRING_ = makeSymbol( "STRING=" );
    $sym122$XML_TOKENS_TO_SEXPR = makeSymbol( "XML-TOKENS-TO-SEXPR" );
    $kw123$TEST = makeKeyword( "TEST" );
    $kw124$OWNER = makeKeyword( "OWNER" );
    $kw125$CLASSES = makeKeyword( "CLASSES" );
    $kw126$KB = makeKeyword( "KB" );
    $kw127$TINY = makeKeyword( "TINY" );
    $kw128$WORKING_ = makeKeyword( "WORKING?" );
    $list129 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "<html>" ), makeString( "<body bgcolor='3'>" ), makeString( "Here is some text" ), makeString( "<br/>" ), makeString(
        "</body>" ), makeString( "</html>" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "html" ) ), ConsesLow.list( ConsesLow.list( makeString( "body" ), ConsesLow.cons( makeString( "bgcolor" ), makeString(
            "3" ) ) ), makeString( "Here is some text" ), ConsesLow.list( ConsesLow.list( makeString( "br" ) ) ) ) ) ) );
    $sym130$PARSE_HTML_TOKEN = makeSymbol( "PARSE-HTML-TOKEN" );
    $list131 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "<pre style=\"display:none\" id=RadEditorEncodedTag>" ) ), ConsesLow.list( makeString( "pre" ), ConsesLow.cons( makeString( "style" ),
        makeString( "display:none" ) ), ConsesLow.cons( makeString( "id" ), makeString( "RadEditorEncodedTag" ) ) ) ), ConsesLow.list( ConsesLow.list( makeString(
            "<pre id=RadEditorEncodedTag style=\"display:none\">" ) ), ConsesLow.list( makeString( "pre" ), ConsesLow.cons( makeString( "id" ), makeString( "RadEditorEncodedTag" ) ), ConsesLow.cons( makeString(
                "style" ), makeString( "display:none" ) ) ) ) );
    $sym132$PARSE_XML_TOKEN = makeSymbol( "PARSE-XML-TOKEN" );
    $list133 = _constant_133_initializer();
  }

  public static final class $xml_token_iterator_state_native
      extends
        SubLStructNative
  {
    public SubLObject $in_stream;
    public SubLObject $scratch_stream;
    public SubLObject $token_output_stream;
    public SubLObject $entity_map;
    public SubLObject $namespace_stack;
    public SubLObject $validateP;
    public SubLObject $resolve_entity_referencesP;
    public SubLObject $resolve_namespacesP;
    public SubLObject $on_deck_queue;
    private static final SubLStructDeclNative structDecl;

    public $xml_token_iterator_state_native()
    {
      this.$in_stream = CommonSymbols.NIL;
      this.$scratch_stream = CommonSymbols.NIL;
      this.$token_output_stream = CommonSymbols.NIL;
      this.$entity_map = CommonSymbols.NIL;
      this.$namespace_stack = CommonSymbols.NIL;
      this.$validateP = CommonSymbols.NIL;
      this.$resolve_entity_referencesP = CommonSymbols.NIL;
      this.$resolve_namespacesP = CommonSymbols.NIL;
      this.$on_deck_queue = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $xml_token_iterator_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$in_stream;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$scratch_stream;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$token_output_stream;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$entity_map;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$namespace_stack;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$validateP;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$resolve_entity_referencesP;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$resolve_namespacesP;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$on_deck_queue;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$in_stream = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$scratch_stream = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$token_output_stream = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$entity_map = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$namespace_stack = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$validateP = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$resolve_entity_referencesP = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$resolve_namespacesP = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$on_deck_queue = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $xml_token_iterator_state_native.class, $sym3$XML_TOKEN_ITERATOR_STATE, $sym4$XML_TOKEN_ITERATOR_STATE_P, $list5, $list6, new String[] { "$in_stream",
        "$scratch_stream", "$token_output_stream", "$entity_map", "$namespace_stack", "$validateP", "$resolve_entity_referencesP", "$resolve_namespacesP", "$on_deck_queue"
      }, $list7, $list8, $sym9$PRINT_XML_TOKEN_ITERATOR_STATE );
    }
  }

  public static final class $xml_token_iterator_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $xml_token_iterator_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "XML-TOKEN-ITERATOR-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return xml_token_iterator_state_p( arg1 );
    }
  }

  public static final class $xml_token_mentions$BinaryFunction
      extends
        BinaryFunction
  {
    public $xml_token_mentions$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "XML-TOKEN-MENTIONS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return xml_token_mentions( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 1104 ms
 * 
 */