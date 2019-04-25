package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_event_support
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.inference_event_support";
  public static final String myFingerPrint = "04653ae6e0875b7e9880a81e3855c467bfaebd26ebb7123610852baecaff23f3";
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 1411L)
  private static SubLSymbol $inference_event_property_classes$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 1535L)
  private static SubLSymbol $inference_event_class_properties$;
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
  private static final SubLSymbol $sym10$NOTE_INFERENCE_EVENT_CLASS_PROPERTIES;
  private static final SubLSymbol $sym11$QUOTE;
  private static final SubLSymbol $kw12$ALL;
  private static final SubLSymbol $kw13$NONE;

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 907L)
  public static SubLObject declare_inference_event_class(final SubLObject macroform, final SubLObject environment)
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
        ConsesLow.list( $sym10$NOTE_INFERENCE_EVENT_CLASS_PROPERTIES, class_key, ConsesLow.list( $sym11$QUOTE, v_properties ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 1612L)
  public static SubLObject note_inference_event_class_properties(final SubLObject v_class, final SubLObject v_properties)
  {
    if( NIL != v_properties )
    {
      dictionary.dictionary_enter( $inference_event_class_properties$.getGlobalValue(), v_class, v_properties );
      SubLObject cdolist_list_var = v_properties;
      SubLObject property = NIL;
      property = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        dictionary_utilities.dictionary_push( $inference_event_property_classes$.getGlobalValue(), property, v_class );
        cdolist_list_var = cdolist_list_var.rest();
        property = cdolist_list_var.first();
      }
    }
    return v_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 1910L)
  public static SubLObject inference_event_class_has_propertyP(final SubLObject v_class, final SubLObject property)
  {
    return subl_promotions.memberP( property, dictionary.dictionary_lookup( $inference_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 2073L)
  public static SubLObject get_inference_event_classes_with_property(final SubLObject property)
  {
    if( property.eql( $kw12$ALL ) )
    {
      return all_inference_event_classes();
    }
    if( property.eql( $kw13$NONE ) )
    {
      return NIL;
    }
    return dictionary.dictionary_lookup( $inference_event_property_classes$.getGlobalValue(), property, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 2338L)
  public static SubLObject get_inference_event_classes_with_some_properties(final SubLObject v_properties)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_properties;
    SubLObject property = NIL;
    property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject applies = get_inference_event_classes_with_property( property );
      result = conses_high.union( result, applies, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      property = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 2613L)
  public static SubLObject get_inference_event_classes_with_all_properties(final SubLObject v_properties)
  {
    SubLObject result = NIL;
    SubLObject list_var = NIL;
    SubLObject property = NIL;
    SubLObject counter = NIL;
    list_var = v_properties;
    property = list_var.first();
    for( counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), property = list_var.first(), counter = Numbers.add( ONE_INTEGER, counter ) )
    {
      final SubLObject applies = get_inference_event_classes_with_property( property );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 2982L)
  public static SubLObject valid_inference_event_class_p(final SubLObject v_class)
  {
    return list_utilities.sublisp_boolean( dictionary.dictionary_lookup( $inference_event_class_properties$.getGlobalValue(), v_class, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 3119L)
  public static SubLObject valid_inference_event_property_p(final SubLObject property)
  {
    return makeBoolean( property == $kw12$ALL || property == $kw13$NONE || NIL != list_utilities.sublisp_boolean( dictionary.dictionary_lookup( $inference_event_property_classes$.getGlobalValue(), property,
        UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 3332L)
  public static SubLObject all_inference_event_classes()
  {
    return dictionary.dictionary_keys( $inference_event_class_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event-support.lisp", position = 3441L)
  public static SubLObject all_inference_event_properties()
  {
    return dictionary.dictionary_keys( $inference_event_property_classes$.getGlobalValue() );
  }

  public static SubLObject declare_inference_event_support_file()
  {
    SubLFiles.declareMacro( me, "declare_inference_event_class", "DECLARE-INFERENCE-EVENT-CLASS" );
    SubLFiles.declareFunction( me, "note_inference_event_class_properties", "NOTE-INFERENCE-EVENT-CLASS-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_event_class_has_propertyP", "INFERENCE-EVENT-CLASS-HAS-PROPERTY?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_inference_event_classes_with_property", "GET-INFERENCE-EVENT-CLASSES-WITH-PROPERTY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_inference_event_classes_with_some_properties", "GET-INFERENCE-EVENT-CLASSES-WITH-SOME-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_inference_event_classes_with_all_properties", "GET-INFERENCE-EVENT-CLASSES-WITH-ALL-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_inference_event_class_p", "VALID-INFERENCE-EVENT-CLASS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_inference_event_property_p", "VALID-INFERENCE-EVENT-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "all_inference_event_classes", "ALL-INFERENCE-EVENT-CLASSES", 0, 0, false );
    SubLFiles.declareFunction( me, "all_inference_event_properties", "ALL-INFERENCE-EVENT-PROPERTIES", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_event_support_file()
  {
    $inference_event_property_classes$ = SubLFiles.deflexical( "*INFERENCE-EVENT-PROPERTY-CLASSES*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $inference_event_class_properties$ = SubLFiles.deflexical( "*INFERENCE-EVENT-CLASS-PROPERTIES*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  public static SubLObject setup_inference_event_support_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_event_support_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_event_support_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_event_support_file();
  }
  static
  {
    me = new inference_event_support();
    $inference_event_property_classes$ = null;
    $inference_event_class_properties$ = null;
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
    $sym10$NOTE_INFERENCE_EVENT_CLASS_PROPERTIES = makeSymbol( "NOTE-INFERENCE-EVENT-CLASS-PROPERTIES" );
    $sym11$QUOTE = makeSymbol( "QUOTE" );
    $kw12$ALL = makeKeyword( "ALL" );
    $kw13$NONE = makeKeyword( "NONE" );
  }
}
/*
 *
 * Total time: 89 ms
 *
 */