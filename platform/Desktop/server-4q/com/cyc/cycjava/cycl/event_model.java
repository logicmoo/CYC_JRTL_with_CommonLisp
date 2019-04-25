package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
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

public final class event_model
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.event_model";
  public static final String myFingerPrint = "5a844689f54d9dbdd4e9107c74ac32aa1f8060e06a46956a5eae069c8a825ddf";
  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLSymbol $dtp_event_class$;
  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLSymbol $dtp_event_hierarchy$;
  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 5387L)
  private static SubLSymbol $event_hierarchy$;
  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLSymbol $dtp_event$;
  private static final SubLSymbol $sym0$EVENT_CLASS;
  private static final SubLSymbol $sym1$EVENT_CLASS_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$EVENT_CLASS_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$EVENT_CLASS_PARENT;
  private static final SubLSymbol $sym10$_CSETF_EVENT_CLASS_PARENT;
  private static final SubLSymbol $sym11$EVENT_CLASS_SELF;
  private static final SubLSymbol $sym12$_CSETF_EVENT_CLASS_SELF;
  private static final SubLSymbol $sym13$EVENT_CLASS_PATTERN;
  private static final SubLSymbol $sym14$_CSETF_EVENT_CLASS_PATTERN;
  private static final SubLSymbol $sym15$EVENT_CLASS_PROPERTIES;
  private static final SubLSymbol $sym16$_CSETF_EVENT_CLASS_PROPERTIES;
  private static final SubLSymbol $kw17$PARENT;
  private static final SubLSymbol $kw18$SELF;
  private static final SubLSymbol $kw19$PATTERN;
  private static final SubLSymbol $kw20$PROPERTIES;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_EVENT_CLASS;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_EVENT_CLASS_METHOD;
  private static final SubLSymbol $kw27$ABSTRACT;
  private static final SubLSymbol $kw28$TYPE;
  private static final SubLSymbol $kw29$INSTANTIATABLE;
  private static final SubLSymbol $kw30$TRUE;
  private static final SubLSymbol $kw31$MUTABLE;
  private static final SubLSymbol $kw32$FALSE;
  private static final SubLSymbol $sym33$EVENT_HIERARCHY;
  private static final SubLSymbol $sym34$EVENT_HIERARCHY_P;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$EVENT_HIERARCHY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$EVENT_HIERARCHY_LOCK;
  private static final SubLSymbol $sym42$_CSETF_EVENT_HIERARCHY_LOCK;
  private static final SubLSymbol $sym43$EVENT_HIERARCHY_GRAPH;
  private static final SubLSymbol $sym44$_CSETF_EVENT_HIERARCHY_GRAPH;
  private static final SubLSymbol $sym45$EVENT_HIERARCHY_PROPERTIES;
  private static final SubLSymbol $sym46$_CSETF_EVENT_HIERARCHY_PROPERTIES;
  private static final SubLSymbol $kw47$LOCK;
  private static final SubLSymbol $kw48$GRAPH;
  private static final SubLSymbol $sym49$MAKE_EVENT_HIERARCHY;
  private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_EVENT_HIERARCHY_METHOD;
  private static final SubLString $str51$Event_Hierarchy;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$WITH_LOCK_HELD;
  private static final SubLSymbol $sym54$_EVENT_HIERARCHY_;
  private static final SubLString $str55$Cannot_register_base_class__S_wit;
  private static final SubLSymbol $kw56$DOC_STRING;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $kw59$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw60$DOC;
  private static final SubLSymbol $kw61$HIERARCHY;
  private static final SubLSymbol $sym62$DECLARE_BASE_EVENT_CLASS_INTERNAL;
  private static final SubLSymbol $kw63$EVENT_ROOT;
  private static final SubLString $str64$The_root_class_of_all_events_in_t;
  private static final SubLSymbol $kw65$SYSTEM_EVENT;
  private static final SubLString $str66$All_of_the_events_used_by_the_run;
  private static final SubLSymbol $kw67$APPLICATION_EVENT;
  private static final SubLString $str68$All_of_the_events_used_by_the_app;
  private static final SubLSymbol $kw69$SUBLISP_EVENT;
  private static final SubLString $str70$All_of_the_events_triggered_by_Su;
  private static final SubLSymbol $kw71$CYC_EVENT;
  private static final SubLString $str72$All_of_the_events_triggered_by_th;
  private static final SubLSymbol $kw73$KB_STORE_EVENT;
  private static final SubLString $str74$All_of_the_events_triggered_by_th;
  private static final SubLSymbol $kw75$INFERENCE_EVENT;
  private static final SubLString $str76$All_of_the_events_triggered_by_th;
  private static final SubLSymbol $kw77$SBHL_EVENT;
  private static final SubLString $str78$All_of_the_events_triggered_by_th;
  private static final SubLSymbol $kw79$NL_EVENT;
  private static final SubLString $str80$All_of_the_events_triggered_by_th;
  private static final SubLSymbol $kw81$CYC_APPLICATION_EVENT;
  private static final SubLString $str82$The_parent_for_all_events_that_ar;
  private static final SubLSymbol $sym83$INITIALIZE_EVENT_HIERARCHY;
  private static final SubLSymbol $sym84$DO_EVENT_DOWNWARD_CLOSURE;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$PWHEN;
  private static final SubLSymbol $sym87$NULL;
  private static final SubLSymbol $sym88$CSETQ;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$KEYWORDP;
  private static final SubLString $str91$Cannot_register_event__S_for_unkn;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$CLET;
  private static final SubLSymbol $sym94$WHILE;
  private static final SubLSymbol $sym95$PROGN;
  private static final SubLSymbol $sym96$PIF;
  private static final SubLList $list97;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$FIND_IN_EVENT_HIERARCHY;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$QUEUE;
  private static final SubLSymbol $sym102$KID;
  private static final SubLSymbol $sym103$KIDS;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$CHECK_TYPE;
  private static final SubLList $list106;
  private static final SubLSymbol $sym107$ENQUEUE;
  private static final SubLSymbol $sym108$CNOT;
  private static final SubLSymbol $sym109$QUEUE_EMPTY_P;
  private static final SubLSymbol $sym110$DEQUEUE;
  private static final SubLSymbol $sym111$CHILDREN_OF_EVENT_CLASS_IN_HIERARCHY;
  private static final SubLSymbol $sym112$CDOLIST;
  private static final SubLString $str113$__S_;
  private static final SubLString $str114$____;
  private static final SubLString $str115$__S;
  private static final SubLSymbol $sym116$EVENT;
  private static final SubLSymbol $sym117$EVENT_P;
  private static final SubLList $list118;
  private static final SubLList $list119;
  private static final SubLList $list120;
  private static final SubLList $list121;
  private static final SubLSymbol $sym122$PRINT_EVENT;
  private static final SubLSymbol $sym123$EVENT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$_CSETF_EVENT_CLASS;
  private static final SubLSymbol $sym126$EVENT_TIMESTAMP;
  private static final SubLSymbol $sym127$_CSETF_EVENT_TIMESTAMP;
  private static final SubLSymbol $sym128$EVENT_SOURCE;
  private static final SubLSymbol $sym129$_CSETF_EVENT_SOURCE;
  private static final SubLSymbol $sym130$EVENT_MESSAGE;
  private static final SubLSymbol $sym131$_CSETF_EVENT_MESSAGE;
  private static final SubLSymbol $kw132$CLASS;
  private static final SubLSymbol $kw133$TIMESTAMP;
  private static final SubLSymbol $kw134$SOURCE;
  private static final SubLSymbol $kw135$MESSAGE;
  private static final SubLSymbol $sym136$MAKE_EVENT;
  private static final SubLSymbol $sym137$VISIT_DEFSTRUCT_OBJECT_EVENT_METHOD;
  private static final SubLString $str138$__EVENT_;
  private static final SubLString $str139$_posted;
  private static final SubLString $str140$_by_;
  private static final SubLString $str141$_at_;
  private static final SubLString $str142$__w__msg_;
  private static final SubLString $str143$__;

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject event_class_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject event_class_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $event_class_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject event_class_parent(final SubLObject v_object)
  {
    assert NIL != event_class_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject event_class_self(final SubLObject v_object)
  {
    assert NIL != event_class_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject event_class_pattern(final SubLObject v_object)
  {
    assert NIL != event_class_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject event_class_properties(final SubLObject v_object)
  {
    assert NIL != event_class_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject _csetf_event_class_parent(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_class_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject _csetf_event_class_self(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_class_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject _csetf_event_class_pattern(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_class_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject _csetf_event_class_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_class_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject make_event_class(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $event_class_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw17$PARENT ) )
      {
        _csetf_event_class_parent( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$SELF ) )
      {
        _csetf_event_class_self( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$PATTERN ) )
      {
        _csetf_event_class_pattern( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$PROPERTIES ) )
      {
        _csetf_event_class_properties( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject visit_defstruct_event_class(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_EVENT_CLASS, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw17$PARENT, event_class_parent( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw18$SELF, event_class_self( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$PATTERN, event_class_pattern( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$PROPERTIES, event_class_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_EVENT_CLASS, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 749L)
  public static SubLObject visit_defstruct_object_event_class_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_event_class( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 1350L)
  public static SubLObject instantiate_event_class_structure(final SubLObject self, final SubLObject parent)
  {
    final SubLObject event_class = make_event_class( UNPROVIDED );
    _csetf_event_class_parent( event_class, parent );
    _csetf_event_class_self( event_class, self );
    _csetf_event_class_pattern( event_class, NIL );
    _csetf_event_class_properties( event_class, dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    return event_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 1701L)
  public static SubLObject event_class_set_property(final SubLObject event_class, final SubLObject property, final SubLObject value)
  {
    return dictionary.dictionary_enter( event_class_properties( event_class ), property, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 1882L)
  public static SubLObject event_class_get_property(final SubLObject event_class, final SubLObject property)
  {
    return dictionary.dictionary_lookup( event_class_properties( event_class ), property, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2023L)
  public static SubLObject event_class_is_abstractP(final SubLObject event_class)
  {
    return Equality.eq( $kw27$ABSTRACT, event_class_get_property( event_class, $kw28$TYPE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2148L)
  public static SubLObject make_event_class_abstract(final SubLObject event_class)
  {
    return event_class_set_property( event_class, $kw28$TYPE, $kw27$ABSTRACT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2269L)
  public static SubLObject make_event_class_instantiatable(final SubLObject event_class)
  {
    return event_class_set_property( event_class, $kw28$TYPE, $kw29$INSTANTIATABLE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2402L)
  public static SubLObject event_class_is_mutableP(final SubLObject event_class)
  {
    return Equality.eq( $kw30$TRUE, event_class_get_property( event_class, $kw31$MUTABLE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2526L)
  public static SubLObject make_event_class_immutable(final SubLObject event_class)
  {
    return event_class_set_property( event_class, $kw31$MUTABLE, $kw32$FALSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2648L)
  public static SubLObject make_event_class_mutable(final SubLObject event_class)
  {
    return event_class_set_property( event_class, $kw31$MUTABLE, $kw30$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject event_hierarchy_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject event_hierarchy_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $event_hierarchy_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject event_hierarchy_lock(final SubLObject v_object)
  {
    assert NIL != event_hierarchy_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject event_hierarchy_graph(final SubLObject v_object)
  {
    assert NIL != event_hierarchy_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject event_hierarchy_properties(final SubLObject v_object)
  {
    assert NIL != event_hierarchy_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject _csetf_event_hierarchy_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_hierarchy_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject _csetf_event_hierarchy_graph(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_hierarchy_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject _csetf_event_hierarchy_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_hierarchy_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject make_event_hierarchy(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $event_hierarchy_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw47$LOCK ) )
      {
        _csetf_event_hierarchy_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$GRAPH ) )
      {
        _csetf_event_hierarchy_graph( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$PROPERTIES ) )
      {
        _csetf_event_hierarchy_properties( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject visit_defstruct_event_hierarchy(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym49$MAKE_EVENT_HIERARCHY, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw47$LOCK, event_hierarchy_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw48$GRAPH, event_hierarchy_graph( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$PROPERTIES, event_hierarchy_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym49$MAKE_EVENT_HIERARCHY, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2767L)
  public static SubLObject visit_defstruct_object_event_hierarchy_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_event_hierarchy( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 2950L)
  public static SubLObject new_event_hierarchy()
  {
    final SubLObject hier = make_event_hierarchy( UNPROVIDED );
    _csetf_event_hierarchy_lock( hier, Locks.make_lock( $str51$Event_Hierarchy ) );
    _csetf_event_hierarchy_graph( hier, dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    _csetf_event_hierarchy_properties( hier, dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    return hier;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 3240L)
  public static SubLObject with_event_hierarchy_lock_held(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hierarchy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
    hierarchy = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym53$WITH_LOCK_HELD, ConsesLow.list( ConsesLow.list( $sym41$EVENT_HIERARCHY_LOCK, hierarchy ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list52 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 3397L)
  public static SubLObject add_to_event_hierarchy(final SubLObject hierarchy, final SubLObject event_class)
  {
    assert NIL != event_hierarchy_p( hierarchy ) : hierarchy;
    SubLObject result = NIL;
    final SubLObject lock = event_hierarchy_lock( hierarchy );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject v_graph = event_hierarchy_graph( hierarchy );
      final SubLObject event_key = event_class_self( event_class );
      if( NIL != find_in_event_hierarchy( hierarchy, event_key ) )
      {
        result = NIL;
      }
      else
      {
        dictionary.dictionary_enter( v_graph, event_key, event_class );
        result = T;
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 3994L)
  public static SubLObject find_in_event_hierarchy(final SubLObject hierarchy, final SubLObject event_key)
  {
    assert NIL != event_hierarchy_p( hierarchy ) : hierarchy;
    SubLObject result = NIL;
    final SubLObject lock = event_hierarchy_lock( hierarchy );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject v_graph = event_hierarchy_graph( hierarchy );
      result = dictionary.dictionary_lookup( v_graph, event_key, UNPROVIDED );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 4304L)
  public static SubLObject children_of_event_class_in_hierarchy(final SubLObject parent_key, final SubLObject hierarchy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject children = NIL;
    final SubLObject lock = event_hierarchy_lock( hierarchy );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject v_graph = event_hierarchy_graph( hierarchy );
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( v_graph ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject the_key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject the_class = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( parent_key.eql( event_class_parent( the_class ) ) )
        {
          children = ConsesLow.cons( the_class, children );
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return children;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 4711L)
  public static SubLObject remove_from_event_hierarchy(final SubLObject hierarchy, final SubLObject event_key)
  {
    assert NIL != event_hierarchy_p( hierarchy ) : hierarchy;
    SubLObject result = NIL;
    final SubLObject lock = event_hierarchy_lock( hierarchy );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject event_class = find_in_event_hierarchy( hierarchy, event_key );
      if( NIL != event_class_p( event_class ) && NIL != event_class_is_mutableP( event_class ) && NIL == children_of_event_class_in_hierarchy( event_key, hierarchy ) )
      {
        final SubLObject v_graph = event_hierarchy_graph( hierarchy );
        dictionary.dictionary_remove( v_graph, event_key );
        result = T;
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 5462L)
  public static SubLObject ensure_event_hierarchy()
  {
    if( NIL == event_hierarchy_p( $event_hierarchy$.getGlobalValue() ) )
    {
      $event_hierarchy$.setGlobalValue( new_event_hierarchy() );
    }
    return $event_hierarchy$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 5636L)
  public static SubLObject event_class_register_base_class(final SubLObject event, final SubLObject parent, SubLObject hierarchy)
  {
    if( hierarchy == UNPROVIDED )
    {
      hierarchy = NIL;
    }
    if( NIL == event_hierarchy_p( hierarchy ) )
    {
      hierarchy = ensure_event_hierarchy();
    }
    final SubLObject event_class = instantiate_event_class_structure( event, parent );
    if( NIL != parent && NIL == find_in_event_hierarchy( hierarchy, parent ) )
    {
      Errors.error( $str55$Cannot_register_base_class__S_wit, event, parent );
    }
    make_event_class_abstract( event_class );
    make_event_class_immutable( event_class );
    add_to_event_hierarchy( hierarchy, event_class );
    return event_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 6243L)
  public static SubLObject declare_base_event_class_internal(final SubLObject class_key, final SubLObject parent, SubLObject docstring, SubLObject hierarchy)
  {
    if( docstring == UNPROVIDED )
    {
      docstring = NIL;
    }
    if( hierarchy == UNPROVIDED )
    {
      hierarchy = NIL;
    }
    final SubLObject event_class = event_class_register_base_class( class_key, parent, hierarchy );
    if( docstring.isString() )
    {
      event_class_set_property( event_class, $kw56$DOC_STRING, docstring );
    }
    return event_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 6559L)
  public static SubLObject declare_base_event_class(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject class_key = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    class_key = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      if( NIL == conses_high.member( current_$1, $list58, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw59$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list57 );
    }
    final SubLObject doc_tail = cdestructuring_bind.property_list_member( $kw60$DOC, current );
    final SubLObject doc = ( NIL != doc_tail ) ? conses_high.cadr( doc_tail ) : NIL;
    final SubLObject parent_tail = cdestructuring_bind.property_list_member( $kw17$PARENT, current );
    final SubLObject parent = ( NIL != parent_tail ) ? conses_high.cadr( parent_tail ) : NIL;
    final SubLObject hierarchy_tail = cdestructuring_bind.property_list_member( $kw61$HIERARCHY, current );
    final SubLObject hierarchy = ( NIL != hierarchy_tail ) ? conses_high.cadr( hierarchy_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym62$DECLARE_BASE_EVENT_CLASS_INTERNAL, class_key, parent, doc, hierarchy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 8184L)
  public static SubLObject initialize_event_hierarchy(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject hierarchy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    hierarchy = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym86$PWHEN, ConsesLow.list( $sym87$NULL, hierarchy ), ConsesLow.listS( $sym88$CSETQ, hierarchy, $list89 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 8423L)
  public static SubLObject core_event_hierarchy()
  {
    return $event_hierarchy$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 8491L)
  public static SubLObject register_event_class(final SubLObject event, final SubLObject parent, SubLObject hierarchy)
  {
    if( hierarchy == UNPROVIDED )
    {
      hierarchy = NIL;
    }
    assert NIL != Types.keywordp( event ) : event;
    assert NIL != Types.keywordp( parent ) : parent;
    if( NIL == hierarchy )
    {
      hierarchy = ensure_event_hierarchy();
    }
    assert NIL != event_hierarchy_p( hierarchy ) : hierarchy;
    if( NIL == find_in_event_hierarchy( hierarchy, parent ) )
    {
      Errors.error( $str91$Cannot_register_event__S_for_unkn, parent );
    }
    final SubLObject event_class = instantiate_event_class_structure( event, parent );
    return add_to_event_hierarchy( hierarchy, event_class );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 8971L)
  public static SubLObject find_event_class(final SubLObject event, SubLObject hierarchy)
  {
    if( hierarchy == UNPROVIDED )
    {
      hierarchy = NIL;
    }
    assert NIL != Types.keywordp( event ) : event;
    if( NIL == hierarchy )
    {
      hierarchy = ensure_event_hierarchy();
    }
    assert NIL != event_hierarchy_p( hierarchy ) : hierarchy;
    return find_in_event_hierarchy( hierarchy, event );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 9199L)
  public static SubLObject do_event_upward_closure(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject curr = NIL;
    SubLObject event = NIL;
    SubLObject hierarchy = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    curr = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    event = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    hierarchy = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym93$CLET, ConsesLow.list( ConsesLow.list( curr, event ) ), ConsesLow.list( $sym94$WHILE, curr, reader.bq_cons( $sym95$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym96$PIF,
          ConsesLow.listS( EQ, ConsesLow.list( $sym11$EVENT_CLASS_SELF, curr ), $list97 ), ConsesLow.listS( $sym88$CSETQ, curr, $list98 ), ConsesLow.list( $sym88$CSETQ, curr, ConsesLow.list(
              $sym99$FIND_IN_EVENT_HIERARCHY, hierarchy, ConsesLow.list( $sym9$EVENT_CLASS_PARENT, curr ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 9603L)
  public static SubLObject do_event_downward_closure(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject curr = NIL;
    SubLObject event = NIL;
    SubLObject children = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    curr = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    event = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    children = current.first();
    current = current.rest();
    final SubLObject hierarchy = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list100 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject queue = $sym101$QUEUE;
      final SubLObject kid = $sym102$KID;
      final SubLObject kids = $sym103$KIDS;
      return ConsesLow.list( $sym93$CLET, ConsesLow.list( reader.bq_cons( queue, $list104 ), reader.bq_cons( children, $list98 ) ), ConsesLow.list( $sym83$INITIALIZE_EVENT_HIERARCHY, hierarchy ), ConsesLow.listS(
          $sym105$CHECK_TYPE, hierarchy, $list106 ), ConsesLow.list( $sym107$ENQUEUE, event, queue ), ConsesLow.list( $sym94$WHILE, ConsesLow.list( $sym108$CNOT, ConsesLow.list( $sym109$QUEUE_EMPTY_P, queue ) ),
              ConsesLow.listS( $sym93$CLET, ConsesLow.list( ConsesLow.list( curr, ConsesLow.list( $sym110$DEQUEUE, queue ) ), ConsesLow.list( kids, ConsesLow.list( $sym111$CHILDREN_OF_EVENT_CLASS_IN_HIERARCHY, curr,
                  hierarchy ) ) ), ConsesLow.list( $sym88$CSETQ, children, kids ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym112$CDOLIST, ConsesLow.list( kid, kids ), ConsesLow.list( $sym107$ENQUEUE,
                      ConsesLow.list( $sym11$EVENT_CLASS_SELF, kid ), queue ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 10308L)
  public static SubLObject display_event_hierarchy(SubLObject hierarchy, SubLObject stream)
  {
    if( hierarchy == UNPROVIDED )
    {
      hierarchy = NIL;
    }
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLObject queue = queues.create_queue( UNPROVIDED );
    SubLObject children = NIL;
    if( NIL == hierarchy )
    {
      hierarchy = ensure_event_hierarchy();
    }
    assert NIL != event_hierarchy_p( hierarchy ) : hierarchy;
    queues.enqueue( $kw63$EVENT_ROOT, queue );
    while ( NIL == queues.queue_empty_p( queue ))
    {
      final SubLObject curr = queues.dequeue( queue );
      final SubLObject kids = children = children_of_event_class_in_hierarchy( curr, hierarchy );
      PrintLow.format( stream, $str113$__S_, curr );
      if( NIL != children )
      {
        streams_high.write_string( $str114$____, stream, UNPROVIDED, UNPROVIDED );
        SubLObject cdolist_list_var = children;
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( T, $str115$__S, event_class_self( child ) );
          cdolist_list_var = cdolist_list_var.rest();
          child = cdolist_list_var.first();
        }
      }
      streams_high.terpri( stream );
      SubLObject cdolist_list_var = kids;
      SubLObject kid = NIL;
      kid = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        queues.enqueue( event_class_self( kid ), queue );
        cdolist_list_var = cdolist_list_var.rest();
        kid = cdolist_list_var.first();
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 10669L)
  public static SubLObject display_event_hierarchy_depth_first(SubLObject hierarchy, SubLObject start_event, SubLObject stream)
  {
    if( hierarchy == UNPROVIDED )
    {
      hierarchy = NIL;
    }
    if( start_event == UNPROVIDED )
    {
      start_event = NIL;
    }
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( NIL == hierarchy )
    {
      hierarchy = ensure_event_hierarchy();
    }
    assert NIL != event_hierarchy_p( hierarchy ) : hierarchy;
    return display_event_hierarchy_current_node( start_event, hierarchy, stream, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 10943L)
  public static SubLObject display_event_hierarchy_current_node(final SubLObject event, final SubLObject hierarchy, final SubLObject stream, final SubLObject indentation)
  {
    string_utilities.indent( stream, indentation );
    print_high.prin1( event, stream );
    streams_high.terpri( stream );
    final SubLObject deeper = Numbers.add( indentation, THREE_INTEGER );
    SubLObject cdolist_list_var = children_of_event_class_in_hierarchy( event, hierarchy );
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      display_event_hierarchy_current_node( event_class_self( child ), hierarchy, stream, deeper );
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    return event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject event_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_event( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject event_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $event_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject event_class(final SubLObject v_object)
  {
    assert NIL != event_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject event_timestamp(final SubLObject v_object)
  {
    assert NIL != event_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject event_source(final SubLObject v_object)
  {
    assert NIL != event_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject event_message(final SubLObject v_object)
  {
    assert NIL != event_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject _csetf_event_class(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject _csetf_event_timestamp(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject _csetf_event_source(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject _csetf_event_message(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != event_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject make_event(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $event_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw132$CLASS ) )
      {
        _csetf_event_class( v_new, current_value );
      }
      else if( pcase_var.eql( $kw133$TIMESTAMP ) )
      {
        _csetf_event_timestamp( v_new, current_value );
      }
      else if( pcase_var.eql( $kw134$SOURCE ) )
      {
        _csetf_event_source( v_new, current_value );
      }
      else if( pcase_var.eql( $kw135$MESSAGE ) )
      {
        _csetf_event_message( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject visit_defstruct_event(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym136$MAKE_EVENT, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw132$CLASS, event_class( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw133$TIMESTAMP, event_timestamp( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw134$SOURCE, event_source( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw135$MESSAGE, event_message( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym136$MAKE_EVENT, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11330L)
  public static SubLObject visit_defstruct_object_event_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_event( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11654L)
  public static SubLObject new_event(final SubLObject v_class, SubLObject message, SubLObject source)
  {
    if( message == UNPROVIDED )
    {
      message = NIL;
    }
    if( source == UNPROVIDED )
    {
      source = NIL;
    }
    final SubLObject event = make_event( UNPROVIDED );
    _csetf_event_class( event, v_class );
    _csetf_event_timestamp( event, Time.get_universal_time() );
    _csetf_event_source( event, source );
    _csetf_event_message( event, message );
    return event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-model.lisp", position = 11941L)
  public static SubLObject print_event(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str138$__EVENT_, stream, UNPROVIDED, UNPROVIDED );
    print_high.princ( event_class( v_object ), stream );
    streams_high.write_string( $str139$_posted, stream, UNPROVIDED, UNPROVIDED );
    if( NIL != event_source( v_object ) )
    {
      streams_high.write_string( $str140$_by_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( event_source( v_object ), stream );
    }
    streams_high.write_string( $str141$_at_, stream, UNPROVIDED, UNPROVIDED );
    print_high.princ( numeric_date_utilities.timestring( event_timestamp( v_object ) ), stream );
    if( NIL != event_message( v_object ) )
    {
      streams_high.terpri( stream );
      streams_high.write_string( $str142$__w__msg_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( event_message( v_object ), stream );
    }
    streams_high.write_string( $str143$__, stream, UNPROVIDED, UNPROVIDED );
    return v_object;
  }

  public static SubLObject declare_event_model_file()
  {
    SubLFiles.declareFunction( me, "event_class_print_function_trampoline", "EVENT-CLASS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "event_class_p", "EVENT-CLASS-P", 1, 0, false );
    new $event_class_p$UnaryFunction();
    SubLFiles.declareFunction( me, "event_class_parent", "EVENT-CLASS-PARENT", 1, 0, false );
    SubLFiles.declareFunction( me, "event_class_self", "EVENT-CLASS-SELF", 1, 0, false );
    SubLFiles.declareFunction( me, "event_class_pattern", "EVENT-CLASS-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "event_class_properties", "EVENT-CLASS-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_class_parent", "_CSETF-EVENT-CLASS-PARENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_class_self", "_CSETF-EVENT-CLASS-SELF", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_class_pattern", "_CSETF-EVENT-CLASS-PATTERN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_class_properties", "_CSETF-EVENT-CLASS-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_event_class", "MAKE-EVENT-CLASS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_event_class", "VISIT-DEFSTRUCT-EVENT-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_event_class_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-CLASS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "instantiate_event_class_structure", "INSTANTIATE-EVENT-CLASS-STRUCTURE", 2, 0, false );
    SubLFiles.declareFunction( me, "event_class_set_property", "EVENT-CLASS-SET-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "event_class_get_property", "EVENT-CLASS-GET-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "event_class_is_abstractP", "EVENT-CLASS-IS-ABSTRACT?", 1, 0, false );
    SubLFiles.declareFunction( me, "make_event_class_abstract", "MAKE-EVENT-CLASS-ABSTRACT", 1, 0, false );
    SubLFiles.declareFunction( me, "make_event_class_instantiatable", "MAKE-EVENT-CLASS-INSTANTIATABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "event_class_is_mutableP", "EVENT-CLASS-IS-MUTABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "make_event_class_immutable", "MAKE-EVENT-CLASS-IMMUTABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "make_event_class_mutable", "MAKE-EVENT-CLASS-MUTABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "event_hierarchy_print_function_trampoline", "EVENT-HIERARCHY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "event_hierarchy_p", "EVENT-HIERARCHY-P", 1, 0, false );
    new $event_hierarchy_p$UnaryFunction();
    SubLFiles.declareFunction( me, "event_hierarchy_lock", "EVENT-HIERARCHY-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "event_hierarchy_graph", "EVENT-HIERARCHY-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "event_hierarchy_properties", "EVENT-HIERARCHY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_hierarchy_lock", "_CSETF-EVENT-HIERARCHY-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_hierarchy_graph", "_CSETF-EVENT-HIERARCHY-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_hierarchy_properties", "_CSETF-EVENT-HIERARCHY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_event_hierarchy", "MAKE-EVENT-HIERARCHY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_event_hierarchy", "VISIT-DEFSTRUCT-EVENT-HIERARCHY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_event_hierarchy_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-HIERARCHY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_event_hierarchy", "NEW-EVENT-HIERARCHY", 0, 0, false );
    SubLFiles.declareMacro( me, "with_event_hierarchy_lock_held", "WITH-EVENT-HIERARCHY-LOCK-HELD" );
    SubLFiles.declareFunction( me, "add_to_event_hierarchy", "ADD-TO-EVENT-HIERARCHY", 2, 0, false );
    SubLFiles.declareFunction( me, "find_in_event_hierarchy", "FIND-IN-EVENT-HIERARCHY", 2, 0, false );
    SubLFiles.declareFunction( me, "children_of_event_class_in_hierarchy", "CHILDREN-OF-EVENT-CLASS-IN-HIERARCHY", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_from_event_hierarchy", "REMOVE-FROM-EVENT-HIERARCHY", 2, 0, false );
    SubLFiles.declareFunction( me, "ensure_event_hierarchy", "ENSURE-EVENT-HIERARCHY", 0, 0, false );
    SubLFiles.declareFunction( me, "event_class_register_base_class", "EVENT-CLASS-REGISTER-BASE-CLASS", 2, 1, false );
    SubLFiles.declareFunction( me, "declare_base_event_class_internal", "DECLARE-BASE-EVENT-CLASS-INTERNAL", 2, 2, false );
    SubLFiles.declareMacro( me, "declare_base_event_class", "DECLARE-BASE-EVENT-CLASS" );
    SubLFiles.declareMacro( me, "initialize_event_hierarchy", "INITIALIZE-EVENT-HIERARCHY" );
    SubLFiles.declareFunction( me, "core_event_hierarchy", "CORE-EVENT-HIERARCHY", 0, 0, false );
    SubLFiles.declareFunction( me, "register_event_class", "REGISTER-EVENT-CLASS", 2, 1, false );
    SubLFiles.declareFunction( me, "find_event_class", "FIND-EVENT-CLASS", 1, 1, false );
    SubLFiles.declareMacro( me, "do_event_upward_closure", "DO-EVENT-UPWARD-CLOSURE" );
    SubLFiles.declareMacro( me, "do_event_downward_closure", "DO-EVENT-DOWNWARD-CLOSURE" );
    SubLFiles.declareFunction( me, "display_event_hierarchy", "DISPLAY-EVENT-HIERARCHY", 0, 2, false );
    SubLFiles.declareFunction( me, "display_event_hierarchy_depth_first", "DISPLAY-EVENT-HIERARCHY-DEPTH-FIRST", 0, 3, false );
    SubLFiles.declareFunction( me, "display_event_hierarchy_current_node", "DISPLAY-EVENT-HIERARCHY-CURRENT-NODE", 4, 0, false );
    SubLFiles.declareFunction( me, "event_print_function_trampoline", "EVENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "event_p", "EVENT-P", 1, 0, false );
    new $event_p$UnaryFunction();
    SubLFiles.declareFunction( me, "event_class", "EVENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "event_timestamp", "EVENT-TIMESTAMP", 1, 0, false );
    SubLFiles.declareFunction( me, "event_source", "EVENT-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "event_message", "EVENT-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_class", "_CSETF-EVENT-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_timestamp", "_CSETF-EVENT-TIMESTAMP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_source", "_CSETF-EVENT-SOURCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_event_message", "_CSETF-EVENT-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_event", "MAKE-EVENT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_event", "VISIT-DEFSTRUCT-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_event_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_event", "NEW-EVENT", 1, 2, false );
    SubLFiles.declareFunction( me, "print_event", "PRINT-EVENT", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_event_model_file()
  {
    $dtp_event_class$ = SubLFiles.defconstant( "*DTP-EVENT-CLASS*", $sym0$EVENT_CLASS );
    $dtp_event_hierarchy$ = SubLFiles.defconstant( "*DTP-EVENT-HIERARCHY*", $sym33$EVENT_HIERARCHY );
    $event_hierarchy$ = SubLFiles.deflexical( "*EVENT-HIERARCHY*", ( maybeDefault( $sym54$_EVENT_HIERARCHY_, $event_hierarchy$, NIL ) ) );
    $dtp_event$ = SubLFiles.defconstant( "*DTP-EVENT*", $sym116$EVENT );
    return NIL;
  }

  public static SubLObject setup_event_model_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_event_class$.getGlobalValue(), Symbols.symbol_function( $sym7$EVENT_CLASS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$EVENT_CLASS_PARENT, $sym10$_CSETF_EVENT_CLASS_PARENT );
    Structures.def_csetf( $sym11$EVENT_CLASS_SELF, $sym12$_CSETF_EVENT_CLASS_SELF );
    Structures.def_csetf( $sym13$EVENT_CLASS_PATTERN, $sym14$_CSETF_EVENT_CLASS_PATTERN );
    Structures.def_csetf( $sym15$EVENT_CLASS_PROPERTIES, $sym16$_CSETF_EVENT_CLASS_PROPERTIES );
    Equality.identity( $sym0$EVENT_CLASS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event_class$.getGlobalValue(), Symbols.symbol_function( $sym26$VISIT_DEFSTRUCT_OBJECT_EVENT_CLASS_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_event_hierarchy$.getGlobalValue(), Symbols.symbol_function( $sym39$EVENT_HIERARCHY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list40 );
    Structures.def_csetf( $sym41$EVENT_HIERARCHY_LOCK, $sym42$_CSETF_EVENT_HIERARCHY_LOCK );
    Structures.def_csetf( $sym43$EVENT_HIERARCHY_GRAPH, $sym44$_CSETF_EVENT_HIERARCHY_GRAPH );
    Structures.def_csetf( $sym45$EVENT_HIERARCHY_PROPERTIES, $sym46$_CSETF_EVENT_HIERARCHY_PROPERTIES );
    Equality.identity( $sym33$EVENT_HIERARCHY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event_hierarchy$.getGlobalValue(), Symbols.symbol_function(
        $sym50$VISIT_DEFSTRUCT_OBJECT_EVENT_HIERARCHY_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym54$_EVENT_HIERARCHY_ );
    declare_base_event_class_internal( $kw63$EVENT_ROOT, NIL, $str64$The_root_class_of_all_events_in_t, NIL );
    declare_base_event_class_internal( $kw65$SYSTEM_EVENT, $kw63$EVENT_ROOT, $str66$All_of_the_events_used_by_the_run, NIL );
    declare_base_event_class_internal( $kw67$APPLICATION_EVENT, $kw63$EVENT_ROOT, $str68$All_of_the_events_used_by_the_app, NIL );
    declare_base_event_class_internal( $kw69$SUBLISP_EVENT, $kw65$SYSTEM_EVENT, $str70$All_of_the_events_triggered_by_Su, NIL );
    declare_base_event_class_internal( $kw71$CYC_EVENT, $kw67$APPLICATION_EVENT, $str72$All_of_the_events_triggered_by_th, NIL );
    declare_base_event_class_internal( $kw73$KB_STORE_EVENT, $kw71$CYC_EVENT, $str74$All_of_the_events_triggered_by_th, NIL );
    declare_base_event_class_internal( $kw75$INFERENCE_EVENT, $kw71$CYC_EVENT, $str76$All_of_the_events_triggered_by_th, NIL );
    declare_base_event_class_internal( $kw77$SBHL_EVENT, $kw71$CYC_EVENT, $str78$All_of_the_events_triggered_by_th, NIL );
    declare_base_event_class_internal( $kw79$NL_EVENT, $kw71$CYC_EVENT, $str80$All_of_the_events_triggered_by_th, NIL );
    declare_base_event_class_internal( $kw81$CYC_APPLICATION_EVENT, $kw71$CYC_EVENT, $str82$The_parent_for_all_events_that_ar, NIL );
    access_macros.register_macro_helper( $sym83$INITIALIZE_EVENT_HIERARCHY, $sym84$DO_EVENT_DOWNWARD_CLOSURE );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_event$.getGlobalValue(), Symbols.symbol_function( $sym123$EVENT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list124 );
    Structures.def_csetf( $sym0$EVENT_CLASS, $sym125$_CSETF_EVENT_CLASS );
    Structures.def_csetf( $sym126$EVENT_TIMESTAMP, $sym127$_CSETF_EVENT_TIMESTAMP );
    Structures.def_csetf( $sym128$EVENT_SOURCE, $sym129$_CSETF_EVENT_SOURCE );
    Structures.def_csetf( $sym130$EVENT_MESSAGE, $sym131$_CSETF_EVENT_MESSAGE );
    Equality.identity( $sym116$EVENT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event$.getGlobalValue(), Symbols.symbol_function( $sym137$VISIT_DEFSTRUCT_OBJECT_EVENT_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_event_model_file();
  }

  @Override
  public void initializeVariables()
  {
    init_event_model_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_event_model_file();
  }
  static
  {
    me = new event_model();
    $dtp_event_class$ = null;
    $dtp_event_hierarchy$ = null;
    $event_hierarchy$ = null;
    $dtp_event$ = null;
    $sym0$EVENT_CLASS = makeSymbol( "EVENT-CLASS" );
    $sym1$EVENT_CLASS_P = makeSymbol( "EVENT-CLASS-P" );
    $list2 = ConsesLow.list( makeSymbol( "PARENT" ), makeSymbol( "SELF" ), makeSymbol( "PATTERN" ), makeSymbol( "PROPERTIES" ) );
    $list3 = ConsesLow.list( makeKeyword( "PARENT" ), makeKeyword( "SELF" ), makeKeyword( "PATTERN" ), makeKeyword( "PROPERTIES" ) );
    $list4 = ConsesLow.list( makeSymbol( "EVENT-CLASS-PARENT" ), makeSymbol( "EVENT-CLASS-SELF" ), makeSymbol( "EVENT-CLASS-PATTERN" ), makeSymbol( "EVENT-CLASS-PROPERTIES" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-EVENT-CLASS-PARENT" ), makeSymbol( "_CSETF-EVENT-CLASS-SELF" ), makeSymbol( "_CSETF-EVENT-CLASS-PATTERN" ), makeSymbol( "_CSETF-EVENT-CLASS-PROPERTIES" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$EVENT_CLASS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "EVENT-CLASS-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "EVENT-CLASS-P" ) );
    $sym9$EVENT_CLASS_PARENT = makeSymbol( "EVENT-CLASS-PARENT" );
    $sym10$_CSETF_EVENT_CLASS_PARENT = makeSymbol( "_CSETF-EVENT-CLASS-PARENT" );
    $sym11$EVENT_CLASS_SELF = makeSymbol( "EVENT-CLASS-SELF" );
    $sym12$_CSETF_EVENT_CLASS_SELF = makeSymbol( "_CSETF-EVENT-CLASS-SELF" );
    $sym13$EVENT_CLASS_PATTERN = makeSymbol( "EVENT-CLASS-PATTERN" );
    $sym14$_CSETF_EVENT_CLASS_PATTERN = makeSymbol( "_CSETF-EVENT-CLASS-PATTERN" );
    $sym15$EVENT_CLASS_PROPERTIES = makeSymbol( "EVENT-CLASS-PROPERTIES" );
    $sym16$_CSETF_EVENT_CLASS_PROPERTIES = makeSymbol( "_CSETF-EVENT-CLASS-PROPERTIES" );
    $kw17$PARENT = makeKeyword( "PARENT" );
    $kw18$SELF = makeKeyword( "SELF" );
    $kw19$PATTERN = makeKeyword( "PATTERN" );
    $kw20$PROPERTIES = makeKeyword( "PROPERTIES" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_EVENT_CLASS = makeSymbol( "MAKE-EVENT-CLASS" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_EVENT_CLASS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-EVENT-CLASS-METHOD" );
    $kw27$ABSTRACT = makeKeyword( "ABSTRACT" );
    $kw28$TYPE = makeKeyword( "TYPE" );
    $kw29$INSTANTIATABLE = makeKeyword( "INSTANTIATABLE" );
    $kw30$TRUE = makeKeyword( "TRUE" );
    $kw31$MUTABLE = makeKeyword( "MUTABLE" );
    $kw32$FALSE = makeKeyword( "FALSE" );
    $sym33$EVENT_HIERARCHY = makeSymbol( "EVENT-HIERARCHY" );
    $sym34$EVENT_HIERARCHY_P = makeSymbol( "EVENT-HIERARCHY-P" );
    $list35 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "GRAPH" ), makeSymbol( "PROPERTIES" ) );
    $list36 = ConsesLow.list( makeKeyword( "LOCK" ), makeKeyword( "GRAPH" ), makeKeyword( "PROPERTIES" ) );
    $list37 = ConsesLow.list( makeSymbol( "EVENT-HIERARCHY-LOCK" ), makeSymbol( "EVENT-HIERARCHY-GRAPH" ), makeSymbol( "EVENT-HIERARCHY-PROPERTIES" ) );
    $list38 = ConsesLow.list( makeSymbol( "_CSETF-EVENT-HIERARCHY-LOCK" ), makeSymbol( "_CSETF-EVENT-HIERARCHY-GRAPH" ), makeSymbol( "_CSETF-EVENT-HIERARCHY-PROPERTIES" ) );
    $sym39$EVENT_HIERARCHY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "EVENT-HIERARCHY-PRINT-FUNCTION-TRAMPOLINE" );
    $list40 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "EVENT-HIERARCHY-P" ) );
    $sym41$EVENT_HIERARCHY_LOCK = makeSymbol( "EVENT-HIERARCHY-LOCK" );
    $sym42$_CSETF_EVENT_HIERARCHY_LOCK = makeSymbol( "_CSETF-EVENT-HIERARCHY-LOCK" );
    $sym43$EVENT_HIERARCHY_GRAPH = makeSymbol( "EVENT-HIERARCHY-GRAPH" );
    $sym44$_CSETF_EVENT_HIERARCHY_GRAPH = makeSymbol( "_CSETF-EVENT-HIERARCHY-GRAPH" );
    $sym45$EVENT_HIERARCHY_PROPERTIES = makeSymbol( "EVENT-HIERARCHY-PROPERTIES" );
    $sym46$_CSETF_EVENT_HIERARCHY_PROPERTIES = makeSymbol( "_CSETF-EVENT-HIERARCHY-PROPERTIES" );
    $kw47$LOCK = makeKeyword( "LOCK" );
    $kw48$GRAPH = makeKeyword( "GRAPH" );
    $sym49$MAKE_EVENT_HIERARCHY = makeSymbol( "MAKE-EVENT-HIERARCHY" );
    $sym50$VISIT_DEFSTRUCT_OBJECT_EVENT_HIERARCHY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-EVENT-HIERARCHY-METHOD" );
    $str51$Event_Hierarchy = makeString( "Event Hierarchy" );
    $list52 = ConsesLow.list( ConsesLow.list( makeSymbol( "HIERARCHY" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym53$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym54$_EVENT_HIERARCHY_ = makeSymbol( "*EVENT-HIERARCHY*" );
    $str55$Cannot_register_base_class__S_wit = makeString( "Cannot register base-class ~S with unknown parent ~S.~%" );
    $kw56$DOC_STRING = makeKeyword( "DOC-STRING" );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-KEY" ), makeSymbol( "&KEY" ), makeSymbol( "DOC" ), makeSymbol( "PARENT" ), makeSymbol( "HIERARCHY" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list58 = ConsesLow.list( makeKeyword( "DOC" ), makeKeyword( "PARENT" ), makeKeyword( "HIERARCHY" ) );
    $kw59$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw60$DOC = makeKeyword( "DOC" );
    $kw61$HIERARCHY = makeKeyword( "HIERARCHY" );
    $sym62$DECLARE_BASE_EVENT_CLASS_INTERNAL = makeSymbol( "DECLARE-BASE-EVENT-CLASS-INTERNAL" );
    $kw63$EVENT_ROOT = makeKeyword( "EVENT-ROOT" );
    $str64$The_root_class_of_all_events_in_t = makeString( "The root class of all events in the hierarchy." );
    $kw65$SYSTEM_EVENT = makeKeyword( "SYSTEM-EVENT" );
    $str66$All_of_the_events_used_by_the_run = makeString( "All of the events used by the runtime support system itself." );
    $kw67$APPLICATION_EVENT = makeKeyword( "APPLICATION-EVENT" );
    $str68$All_of_the_events_used_by_the_app = makeString( "All of the events used by the applications written by the users." );
    $kw69$SUBLISP_EVENT = makeKeyword( "SUBLISP-EVENT" );
    $str70$All_of_the_events_triggered_by_Su = makeString( "All of the events triggered by SubLISP code." );
    $kw71$CYC_EVENT = makeKeyword( "CYC-EVENT" );
    $str72$All_of_the_events_triggered_by_th = makeString( "All of the events triggered by the CYC implementation." );
    $kw73$KB_STORE_EVENT = makeKeyword( "KB-STORE-EVENT" );
    $str74$All_of_the_events_triggered_by_th = makeString( "All of the events triggered by the KB implementation." );
    $kw75$INFERENCE_EVENT = makeKeyword( "INFERENCE-EVENT" );
    $str76$All_of_the_events_triggered_by_th = makeString( "All of the events triggered by the inference engine." );
    $kw77$SBHL_EVENT = makeKeyword( "SBHL-EVENT" );
    $str78$All_of_the_events_triggered_by_th = makeString( "All of the events triggered by the SBHL reasoning subsystem." );
    $kw79$NL_EVENT = makeKeyword( "NL-EVENT" );
    $str80$All_of_the_events_triggered_by_th = makeString( "All of the events triggered by the NL subsystem." );
    $kw81$CYC_APPLICATION_EVENT = makeKeyword( "CYC-APPLICATION-EVENT" );
    $str82$The_parent_for_all_events_that_ar = makeString( "The parent for all events that are trigged by applications built on top of CYC." );
    $sym83$INITIALIZE_EVENT_HIERARCHY = makeSymbol( "INITIALIZE-EVENT-HIERARCHY" );
    $sym84$DO_EVENT_DOWNWARD_CLOSURE = makeSymbol( "DO-EVENT-DOWNWARD-CLOSURE" );
    $list85 = ConsesLow.list( makeSymbol( "HIERARCHY" ) );
    $sym86$PWHEN = makeSymbol( "PWHEN" );
    $sym87$NULL = makeSymbol( "NULL" );
    $sym88$CSETQ = makeSymbol( "CSETQ" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "ENSURE-EVENT-HIERARCHY" ) ) );
    $sym90$KEYWORDP = makeSymbol( "KEYWORDP" );
    $str91$Cannot_register_event__S_for_unkn = makeString( "Cannot register event ~S for unknown parent ~S.~%" );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURR" ), makeSymbol( "EVENT" ), makeSymbol( "HIERARCHY" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym93$CLET = makeSymbol( "CLET" );
    $sym94$WHILE = makeSymbol( "WHILE" );
    $sym95$PROGN = makeSymbol( "PROGN" );
    $sym96$PIF = makeSymbol( "PIF" );
    $list97 = ConsesLow.list( makeKeyword( "EVENT-ROOT" ) );
    $list98 = ConsesLow.list( NIL );
    $sym99$FIND_IN_EVENT_HIERARCHY = makeSymbol( "FIND-IN-EVENT-HIERARCHY" );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURR" ), makeSymbol( "EVENT" ), makeSymbol( "CHILDREN" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "HIERARCHY" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym101$QUEUE = makeUninternedSymbol( "QUEUE" );
    $sym102$KID = makeUninternedSymbol( "KID" );
    $sym103$KIDS = makeUninternedSymbol( "KIDS" );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "CREATE-QUEUE" ) ) );
    $sym105$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list106 = ConsesLow.list( makeSymbol( "EVENT-HIERARCHY-P" ) );
    $sym107$ENQUEUE = makeSymbol( "ENQUEUE" );
    $sym108$CNOT = makeSymbol( "CNOT" );
    $sym109$QUEUE_EMPTY_P = makeSymbol( "QUEUE-EMPTY-P" );
    $sym110$DEQUEUE = makeSymbol( "DEQUEUE" );
    $sym111$CHILDREN_OF_EVENT_CLASS_IN_HIERARCHY = makeSymbol( "CHILDREN-OF-EVENT-CLASS-IN-HIERARCHY" );
    $sym112$CDOLIST = makeSymbol( "CDOLIST" );
    $str113$__S_ = makeString( " ~S " );
    $str114$____ = makeString( " => " );
    $str115$__S = makeString( " ~S" );
    $sym116$EVENT = makeSymbol( "EVENT" );
    $sym117$EVENT_P = makeSymbol( "EVENT-P" );
    $list118 = ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "TIMESTAMP" ), makeSymbol( "SOURCE" ), makeSymbol( "MESSAGE" ) );
    $list119 = ConsesLow.list( makeKeyword( "CLASS" ), makeKeyword( "TIMESTAMP" ), makeKeyword( "SOURCE" ), makeKeyword( "MESSAGE" ) );
    $list120 = ConsesLow.list( makeSymbol( "EVENT-CLASS" ), makeSymbol( "EVENT-TIMESTAMP" ), makeSymbol( "EVENT-SOURCE" ), makeSymbol( "EVENT-MESSAGE" ) );
    $list121 = ConsesLow.list( makeSymbol( "_CSETF-EVENT-CLASS" ), makeSymbol( "_CSETF-EVENT-TIMESTAMP" ), makeSymbol( "_CSETF-EVENT-SOURCE" ), makeSymbol( "_CSETF-EVENT-MESSAGE" ) );
    $sym122$PRINT_EVENT = makeSymbol( "PRINT-EVENT" );
    $sym123$EVENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "EVENT-PRINT-FUNCTION-TRAMPOLINE" );
    $list124 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "EVENT-P" ) );
    $sym125$_CSETF_EVENT_CLASS = makeSymbol( "_CSETF-EVENT-CLASS" );
    $sym126$EVENT_TIMESTAMP = makeSymbol( "EVENT-TIMESTAMP" );
    $sym127$_CSETF_EVENT_TIMESTAMP = makeSymbol( "_CSETF-EVENT-TIMESTAMP" );
    $sym128$EVENT_SOURCE = makeSymbol( "EVENT-SOURCE" );
    $sym129$_CSETF_EVENT_SOURCE = makeSymbol( "_CSETF-EVENT-SOURCE" );
    $sym130$EVENT_MESSAGE = makeSymbol( "EVENT-MESSAGE" );
    $sym131$_CSETF_EVENT_MESSAGE = makeSymbol( "_CSETF-EVENT-MESSAGE" );
    $kw132$CLASS = makeKeyword( "CLASS" );
    $kw133$TIMESTAMP = makeKeyword( "TIMESTAMP" );
    $kw134$SOURCE = makeKeyword( "SOURCE" );
    $kw135$MESSAGE = makeKeyword( "MESSAGE" );
    $sym136$MAKE_EVENT = makeSymbol( "MAKE-EVENT" );
    $sym137$VISIT_DEFSTRUCT_OBJECT_EVENT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-EVENT-METHOD" );
    $str138$__EVENT_ = makeString( "#<EVENT " );
    $str139$_posted = makeString( " posted" );
    $str140$_by_ = makeString( " by " );
    $str141$_at_ = makeString( " at " );
    $str142$__w__msg_ = makeString( "  w/ msg " );
    $str143$__ = makeString( "> " );
  }

  public static final class $event_class_native
      extends
        SubLStructNative
  {
    public SubLObject $parent;
    public SubLObject $self;
    public SubLObject $pattern;
    public SubLObject $properties;
    private static final SubLStructDeclNative structDecl;

    public $event_class_native()
    {
      this.$parent = CommonSymbols.NIL;
      this.$self = CommonSymbols.NIL;
      this.$pattern = CommonSymbols.NIL;
      this.$properties = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $event_class_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$parent;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$self;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$pattern;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$properties;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$parent = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$self = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$pattern = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$properties = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $event_class_native.class, $sym0$EVENT_CLASS, $sym1$EVENT_CLASS_P, $list2, $list3, new String[] { "$parent", "$self", "$pattern", "$properties"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $event_class_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $event_class_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EVENT-CLASS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return event_class_p( arg1 );
    }
  }

  public static final class $event_hierarchy_native
      extends
        SubLStructNative
  {
    public SubLObject $lock;
    public SubLObject $graph;
    public SubLObject $properties;
    private static final SubLStructDeclNative structDecl;

    public $event_hierarchy_native()
    {
      this.$lock = CommonSymbols.NIL;
      this.$graph = CommonSymbols.NIL;
      this.$properties = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $event_hierarchy_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$graph;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$properties;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$graph = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$properties = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $event_hierarchy_native.class, $sym33$EVENT_HIERARCHY, $sym34$EVENT_HIERARCHY_P, $list35, $list36, new String[] { "$lock", "$graph", "$properties"
      }, $list37, $list38, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $event_hierarchy_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $event_hierarchy_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EVENT-HIERARCHY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return event_hierarchy_p( arg1 );
    }
  }

  public static final class $event_native
      extends
        SubLStructNative
  {
    public SubLObject $class;
    public SubLObject $timestamp;
    public SubLObject $source;
    public SubLObject $message;
    private static final SubLStructDeclNative structDecl;

    public $event_native()
    {
      this.$class = CommonSymbols.NIL;
      this.$timestamp = CommonSymbols.NIL;
      this.$source = CommonSymbols.NIL;
      this.$message = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $event_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$class;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$timestamp;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$source;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$message;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$class = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$timestamp = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$source = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$message = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $event_native.class, $sym116$EVENT, $sym117$EVENT_P, $list118, $list119, new String[] { "$class", "$timestamp", "$source", "$message"
      }, $list120, $list121, $sym122$PRINT_EVENT );
    }
  }

  public static final class $event_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $event_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EVENT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return event_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 232 ms
 * 
 */