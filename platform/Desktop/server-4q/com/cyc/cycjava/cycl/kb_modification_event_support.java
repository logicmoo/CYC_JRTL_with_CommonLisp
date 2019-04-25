package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_modification_event_support
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_modification_event_support";
  public static final String myFingerPrint = "13d200fd48262d1a1c8458d2888b1e7d6787257725bb919915bc18545cfcfd69";
  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 1423L)
  private static SubLSymbol $kb_modification_event_property_classes$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 1553L)
  private static SubLSymbol $kb_modification_event_class_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 7776L)
  private static SubLSymbol $cash_stable_description_retry_limit$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$PARENT;
  private static final SubLSymbol $kw4$DOCSTRING;
  private static final SubLSymbol $kw5$HIERARCHY;
  private static final SubLSymbol $kw6$GENERATED_BY;
  private static final SubLSymbol $kw7$PROPERTIES;
  private static final SubLSymbol $sym8$PROGN;
  private static final SubLSymbol $sym9$DECLARE_EVENT_CLASS;
  private static final SubLSymbol $sym10$NOTE_KB_MODIFICATION_EVENT_CLASS_PROPERTIES;
  private static final SubLSymbol $sym11$QUOTE;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$DO_DICTIONARY;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$ALL;
  private static final SubLSymbol $kw16$NONE;
  private static final SubLString $str17$Could_not_properly_unpack_the_eve;

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 917L)
  public static SubLObject declare_kbmod_event_class(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject class_key = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    class_key = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject parent_tail = cdestructuring_bind.property_list_member( $kw3$PARENT, current );
    final SubLObject parent = ( NIL != parent_tail ) ? conses_high.cadr( parent_tail ) : NIL;
    final SubLObject docstring_tail = cdestructuring_bind.property_list_member( $kw4$DOCSTRING, current );
    final SubLObject docstring = ( NIL != docstring_tail ) ? conses_high.cadr( docstring_tail ) : NIL;
    final SubLObject hierarchy_tail = cdestructuring_bind.property_list_member( $kw5$HIERARCHY, current );
    final SubLObject hierarchy = ( NIL != hierarchy_tail ) ? conses_high.cadr( hierarchy_tail ) : NIL;
    final SubLObject generated_by_tail = cdestructuring_bind.property_list_member( $kw6$GENERATED_BY, current );
    final SubLObject generated_by = ( NIL != generated_by_tail ) ? conses_high.cadr( generated_by_tail ) : NIL;
    final SubLObject properties_tail = cdestructuring_bind.property_list_member( $kw7$PROPERTIES, current );
    final SubLObject v_properties = ( NIL != properties_tail ) ? conses_high.cadr( properties_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym8$PROGN, ConsesLow.listS( $sym9$DECLARE_EVENT_CLASS, ConsesLow.list( class_key, $kw3$PARENT, parent, $kw4$DOCSTRING, docstring, $kw5$HIERARCHY, hierarchy ), ConsesLow.append( body, NIL ) ),
        ConsesLow.list( $sym10$NOTE_KB_MODIFICATION_EVENT_CLASS_PROPERTIES, class_key, ConsesLow.list( $sym11$QUOTE, v_properties ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 1636L)
  public static SubLObject do_all_event_class_properties(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_class = NIL;
    SubLObject v_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    v_properties = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym13$DO_DICTIONARY, ConsesLow.listS( v_class, v_properties, $list14 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 1822L)
  public static SubLObject note_kb_modification_event_class_properties(final SubLObject v_class, final SubLObject v_properties)
  {
    if( NIL != v_properties )
    {
      dictionary.dictionary_enter( $kb_modification_event_class_properties$.getGlobalValue(), v_class, v_properties );
      SubLObject cdolist_list_var = v_properties;
      SubLObject property = NIL;
      property = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        dictionary_utilities.dictionary_push( $kb_modification_event_property_classes$.getGlobalValue(), property, v_class );
        cdolist_list_var = cdolist_list_var.rest();
        property = cdolist_list_var.first();
      }
    }
    return v_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 2138L)
  public static SubLObject kb_modification_event_class_has_propertyP(final SubLObject v_class, final SubLObject property)
  {
    return subl_promotions.memberP( property, dictionary.dictionary_lookup( $kb_modification_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 2313L)
  public static SubLObject get_kb_modification_event_classes_with_property(final SubLObject property)
  {
    if( property.eql( $kw15$ALL ) )
    {
      return all_kb_modification_event_classes();
    }
    if( property.eql( $kw16$NONE ) )
    {
      return NIL;
    }
    return dictionary.dictionary_lookup( $kb_modification_event_property_classes$.getGlobalValue(), property, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 2596L)
  public static SubLObject get_kb_modification_event_classes_with_some_properties(final SubLObject v_properties)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_properties;
    SubLObject property = NIL;
    property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject applies = get_kb_modification_event_classes_with_property( property );
      result = conses_high.union( result, applies, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      property = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 2883L)
  public static SubLObject get_kb_modification_event_classes_with_all_properties(final SubLObject v_properties)
  {
    SubLObject result = NIL;
    SubLObject list_var = NIL;
    SubLObject property = NIL;
    SubLObject counter = NIL;
    list_var = v_properties;
    property = list_var.first();
    for( counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), property = list_var.first(), counter = Numbers.add( ONE_INTEGER, counter ) )
    {
      final SubLObject applies = get_kb_modification_event_classes_with_property( property );
      if( counter.isZero() )
      {
        result = applies;
      }
      else
      {
        result = conses_high.intersection( result, applies, UNPROVIDED, UNPROVIDED );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 3264L)
  public static SubLObject valid_kb_modification_event_class_p(final SubLObject v_class)
  {
    return list_utilities.sublisp_boolean( dictionary.dictionary_lookup( $kb_modification_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 3413L)
  public static SubLObject valid_kb_modification_event_property_p(final SubLObject property)
  {
    return makeBoolean( property == $kw15$ALL || property == $kw16$NONE || NIL != list_utilities.sublisp_boolean( dictionary.dictionary_lookup( $kb_modification_event_property_classes$.getGlobalValue(), property,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 3638L)
  public static SubLObject all_kb_modification_event_classes()
  {
    return dictionary.dictionary_keys( $kb_modification_event_class_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 3759L)
  public static SubLObject all_kb_modification_event_properties()
  {
    return dictionary.dictionary_keys( $kb_modification_event_property_classes$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 3883L)
  public static SubLObject get_stable_description(final SubLObject v_object)
  {
    return cfasl.cfasl_encode_externalized( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event-support.lisp", position = 7839L)
  public static SubLObject cash_stable_description(final SubLObject description)
  {
    SubLObject interpretation = cfasl.cfasl_decode( description );
    SubLObject counter = ZERO_INTEGER;
    while ( NIL != list_utilities.tree_find( cfasl_kb_methods.cfasl_invalid_nart(), interpretation, UNPROVIDED, UNPROVIDED ))
    {
      counter = Numbers.add( counter, ONE_INTEGER );
      if( counter.numG( $cash_stable_description_retry_limit$.getGlobalValue() ) )
      {
        Errors.error( $str17$Could_not_properly_unpack_the_eve, description );
      }
      Threads.sleep( ONE_INTEGER );
      interpretation = cfasl.cfasl_decode( description );
    }
    return interpretation;
  }

  public static SubLObject declare_kb_modification_event_support_file()
  {
    SubLFiles.declareMacro( me, "declare_kbmod_event_class", "DECLARE-KBMOD-EVENT-CLASS" );
    SubLFiles.declareMacro( me, "do_all_event_class_properties", "DO-ALL-EVENT-CLASS-PROPERTIES" );
    SubLFiles.declareFunction( me, "note_kb_modification_event_class_properties", "NOTE-KB-MODIFICATION-EVENT-CLASS-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_modification_event_class_has_propertyP", "KB-MODIFICATION-EVENT-CLASS-HAS-PROPERTY?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_kb_modification_event_classes_with_property", "GET-KB-MODIFICATION-EVENT-CLASSES-WITH-PROPERTY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_kb_modification_event_classes_with_some_properties", "GET-KB-MODIFICATION-EVENT-CLASSES-WITH-SOME-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_kb_modification_event_classes_with_all_properties", "GET-KB-MODIFICATION-EVENT-CLASSES-WITH-ALL-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_kb_modification_event_class_p", "VALID-KB-MODIFICATION-EVENT-CLASS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_kb_modification_event_property_p", "VALID-KB-MODIFICATION-EVENT-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "all_kb_modification_event_classes", "ALL-KB-MODIFICATION-EVENT-CLASSES", 0, 0, false );
    SubLFiles.declareFunction( me, "all_kb_modification_event_properties", "ALL-KB-MODIFICATION-EVENT-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_stable_description", "GET-STABLE-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cash_stable_description", "CASH-STABLE-DESCRIPTION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_modification_event_support_file()
  {
    $kb_modification_event_property_classes$ = SubLFiles.deflexical( "*KB-MODIFICATION-EVENT-PROPERTY-CLASSES*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $kb_modification_event_class_properties$ = SubLFiles.deflexical( "*KB-MODIFICATION-EVENT-CLASS-PROPERTIES*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $cash_stable_description_retry_limit$ = SubLFiles.deflexical( "*CASH-STABLE-DESCRIPTION-RETRY-LIMIT*", ONE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_kb_modification_event_support_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_modification_event_support_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_modification_event_support_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_modification_event_support_file();
  }
  static
  {
    me = new kb_modification_event_support();
    $kb_modification_event_property_classes$ = null;
    $kb_modification_event_class_properties$ = null;
    $cash_stable_description_retry_limit$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-KEY" ), makeSymbol( "&KEY" ), makeSymbol( "PARENT" ), makeSymbol( "DOCSTRING" ), makeSymbol( "HIERARCHY" ), makeSymbol( "GENERATED-BY" ), makeSymbol(
        "PROPERTIES" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "PARENT" ), makeKeyword( "DOCSTRING" ), makeKeyword( "HIERARCHY" ), makeKeyword( "GENERATED-BY" ), makeKeyword( "PROPERTIES" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$PARENT = makeKeyword( "PARENT" );
    $kw4$DOCSTRING = makeKeyword( "DOCSTRING" );
    $kw5$HIERARCHY = makeKeyword( "HIERARCHY" );
    $kw6$GENERATED_BY = makeKeyword( "GENERATED-BY" );
    $kw7$PROPERTIES = makeKeyword( "PROPERTIES" );
    $sym8$PROGN = makeSymbol( "PROGN" );
    $sym9$DECLARE_EVENT_CLASS = makeSymbol( "DECLARE-EVENT-CLASS" );
    $sym10$NOTE_KB_MODIFICATION_EVENT_CLASS_PROPERTIES = makeSymbol( "NOTE-KB-MODIFICATION-EVENT-CLASS-PROPERTIES" );
    $sym11$QUOTE = makeSymbol( "QUOTE" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "PROPERTIES" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym13$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $list14 = ConsesLow.list( makeSymbol( "*KB-MODIFICATION-EVENT-CLASS-PROPERTIES*" ) );
    $kw15$ALL = makeKeyword( "ALL" );
    $kw16$NONE = makeKeyword( "NONE" );
    $str17$Could_not_properly_unpack_the_eve = makeString( "Could not properly unpack the event description: ~A" );
  }
}
/*
 * 
 * Total time: 139 ms
 * 
 */