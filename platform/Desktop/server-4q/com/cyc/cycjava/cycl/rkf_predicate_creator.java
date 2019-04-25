package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_predicate_creator
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_predicate_creator";
  public static final String myFingerPrint = "8958188cd2feceeee5c083086fa43eebce121aa1b6afb071b6c96c297265ba25";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 766L)
  private static SubLSymbol $pc_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1144L)
  private static SubLSymbol $pc_session_modes$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1505L)
  private static SubLSymbol $pc_session_constraint_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLSymbol $dtp_pc_session$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 10067L)
  private static SubLSymbol $pc_downgrade_typelevelpreds_isas$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20649L)
  private static SubLSymbol $predicate_type_for_arity_query$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20985L)
  private static SubLSymbol $cached_predicate_type_for_arity_any_mt_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 24233L)
  private static SubLSymbol $generic_keyword_arg_caching_state$;
  private static final SubLSymbol $sym0$_PC_LOCK_;
  private static final SubLString $str1$Predicate_Creator_lock;
  private static final SubLSymbol $sym2$WITH_LOCK_HELD;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PC_SESSION;
  private static final SubLSymbol $sym8$PC_SESSION_P;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym14$PC_SESSION_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$PC_SESSION_INTERACTION;
  private static final SubLSymbol $sym17$_CSETF_PC_SESSION_INTERACTION;
  private static final SubLSymbol $sym18$PC_SESSION_MODE;
  private static final SubLSymbol $sym19$_CSETF_PC_SESSION_MODE;
  private static final SubLSymbol $sym20$PC_SESSION_ARITY;
  private static final SubLSymbol $sym21$_CSETF_PC_SESSION_ARITY;
  private static final SubLSymbol $sym22$PC_SESSION_FULL_EXAMPLES;
  private static final SubLSymbol $sym23$_CSETF_PC_SESSION_FULL_EXAMPLES;
  private static final SubLSymbol $sym24$PC_SESSION_ARG_EXAMPLES;
  private static final SubLSymbol $sym25$_CSETF_PC_SESSION_ARG_EXAMPLES;
  private static final SubLSymbol $sym26$PC_SESSION_CONSTRAINTS_VIA_EXAMPLES;
  private static final SubLSymbol $sym27$_CSETF_PC_SESSION_CONSTRAINTS_VIA_EXAMPLES;
  private static final SubLSymbol $sym28$PC_SESSION_GENERALIZED_CONSTRAINTS;
  private static final SubLSymbol $sym29$_CSETF_PC_SESSION_GENERALIZED_CONSTRAINTS;
  private static final SubLSymbol $sym30$PC_SESSION_TEMPLATE;
  private static final SubLSymbol $sym31$_CSETF_PC_SESSION_TEMPLATE;
  private static final SubLSymbol $sym32$PC_SESSION_PREDICATE;
  private static final SubLSymbol $sym33$_CSETF_PC_SESSION_PREDICATE;
  private static final SubLSymbol $kw34$INTERACTION;
  private static final SubLSymbol $kw35$MODE;
  private static final SubLSymbol $kw36$ARITY;
  private static final SubLSymbol $kw37$FULL_EXAMPLES;
  private static final SubLSymbol $kw38$ARG_EXAMPLES;
  private static final SubLSymbol $kw39$CONSTRAINTS_VIA_EXAMPLES;
  private static final SubLSymbol $kw40$GENERALIZED_CONSTRAINTS;
  private static final SubLSymbol $kw41$TEMPLATE;
  private static final SubLSymbol $kw42$PREDICATE;
  private static final SubLString $str43$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw44$BEGIN;
  private static final SubLSymbol $sym45$MAKE_PC_SESSION;
  private static final SubLSymbol $kw46$SLOT;
  private static final SubLSymbol $kw47$END;
  private static final SubLSymbol $sym48$VISIT_DEFSTRUCT_OBJECT_PC_SESSION_METHOD;
  private static final SubLSymbol $sym49$USER_INTERACTION_P;
  private static final SubLSymbol $kw50$NEW;
  private static final SubLSymbol $sym51$PC_SESSION_MODE_P;
  private static final SubLSymbol $sym52$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym53$PC_SESSION_FULL_EXAMPLE_P;
  private static final SubLSymbol $sym54$PC_SESSION_EXAMPLE_P;
  private static final SubLSymbol $sym55$PC_SESSION_CONSTRAINT_LIST_P;
  private static final SubLSymbol $sym56$FIRST;
  private static final SubLSymbol $sym57$PC_SESSION_CONSTRAINT_P;
  private static final SubLSymbol $sym58$PC_SESSION_TEMPLATE_P;
  private static final SubLSymbol $sym59$FORT_P;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLObject $const64$argIsa;
  private static final SubLObject $const65$Collection;
  private static final SubLObject $const66$argGenl;
  private static final SubLSymbol $kw67$EXAMPLES;
  private static final SubLSymbol $kw68$CONSTRAINTS;
  private static final SubLSymbol $kw69$READY;
  private static final SubLSymbol $kw70$DONE;
  private static final SubLList $list71;
  private static final SubLString $str72$Predicate;
  private static final SubLSymbol $sym73$GENERALITY_ESTIMATE_;
  private static final SubLSymbol $sym74$THIRD;
  private static final SubLSymbol $sym75$SECOND;
  private static final SubLSymbol $sym76$_;
  private static final SubLObject $const77$isa;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT;
  private static final SubLSymbol $kw80$COL;
  private static final SubLObject $const81$InferencePSC;
  private static final SubLSymbol $sym82$_CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT_CACHING_STATE_;
  private static final SubLObject $const83$genTemplate;
  private static final SubLObject $const84$assertTemplate_Reln;
  private static final SubLObject $const85$STemplate;
  private static final SubLObject $const86$NPTemplate;
  private static final SubLSymbol $sym87$GENERIC_KEYWORD_ARG;
  private static final SubLString $str88$ARG_A;
  private static final SubLSymbol $sym89$_GENERIC_KEYWORD_ARG_CACHING_STATE_;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1050L)
  public static SubLObject with_pc_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$WITH_LOCK_HELD, $list3, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1409L)
  public static SubLObject pc_session_mode_p(final SubLObject v_object)
  {
    return list_utilities.sublisp_boolean( Sequences.find( v_object, $pc_session_modes$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1593L)
  public static SubLObject pc_session_contraint_predicate_p(final SubLObject v_object)
  {
    return list_utilities.sublisp_boolean( Sequences.find( v_object, $pc_session_constraint_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 1720L)
  public static SubLObject pc_session_full_example_p(final SubLObject v_object)
  {
    if( v_object.isCons() && NIL != list_utilities.proper_list_p( v_object ) )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == pc_session_example_p( item ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 2151L)
  public static SubLObject pc_session_example_p(final SubLObject v_object)
  {
    return term.first_order_termP( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 2277L)
  public static SubLObject pc_session_template_p(final SubLObject v_object)
  {
    if( NIL == v_object || NIL != list_utilities.proper_list_p( v_object ) )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !item.isString() && !item.isKeyword() )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 2570L)
  public static SubLObject pc_session_constraint_list_p(final SubLObject constraints)
  {
    if( NIL == constraints || NIL != list_utilities.proper_list_p( constraints ) )
    {
      SubLObject cdolist_list_var = constraints;
      SubLObject constraint = NIL;
      constraint = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == pc_session_constraint_p( constraint ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        constraint = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 2914L)
  public static SubLObject pc_session_constraint_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, THREE_INTEGER, UNPROVIDED ) )
    {
      SubLObject arg = NIL;
      SubLObject pred = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list6 );
      arg = v_object.first();
      SubLObject current = v_object.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list6 );
      pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, v_object, $list6 );
      value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        return makeBoolean( NIL != subl_promotions.positive_integer_p( arg ) && NIL != pc_session_contraint_predicate_p( pred ) && NIL != term.first_order_termP( value ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( v_object, $list6 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $pc_session_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_interaction(final SubLObject v_object)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_mode(final SubLObject v_object)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_arity(final SubLObject v_object)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_full_examples(final SubLObject v_object)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_arg_examples(final SubLObject v_object)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_constraints_via_examples(final SubLObject v_object)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_generalized_constraints(final SubLObject v_object)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_template(final SubLObject v_object)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject pc_session_predicate(final SubLObject v_object)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject _csetf_pc_session_interaction(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject _csetf_pc_session_mode(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject _csetf_pc_session_arity(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject _csetf_pc_session_full_examples(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject _csetf_pc_session_arg_examples(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject _csetf_pc_session_constraints_via_examples(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject _csetf_pc_session_generalized_constraints(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject _csetf_pc_session_template(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject _csetf_pc_session_predicate(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pc_session_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject make_pc_session(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $pc_session_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw34$INTERACTION ) )
      {
        _csetf_pc_session_interaction( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$MODE ) )
      {
        _csetf_pc_session_mode( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$ARITY ) )
      {
        _csetf_pc_session_arity( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$FULL_EXAMPLES ) )
      {
        _csetf_pc_session_full_examples( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$ARG_EXAMPLES ) )
      {
        _csetf_pc_session_arg_examples( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$CONSTRAINTS_VIA_EXAMPLES ) )
      {
        _csetf_pc_session_constraints_via_examples( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$GENERALIZED_CONSTRAINTS ) )
      {
        _csetf_pc_session_generalized_constraints( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$TEMPLATE ) )
      {
        _csetf_pc_session_template( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$PREDICATE ) )
      {
        _csetf_pc_session_predicate( v_new, current_value );
      }
      else
      {
        Errors.error( $str43$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject visit_defstruct_pc_session(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw44$BEGIN, $sym45$MAKE_PC_SESSION, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw46$SLOT, $kw34$INTERACTION, pc_session_interaction( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$SLOT, $kw35$MODE, pc_session_mode( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$SLOT, $kw36$ARITY, pc_session_arity( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$SLOT, $kw37$FULL_EXAMPLES, pc_session_full_examples( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$SLOT, $kw38$ARG_EXAMPLES, pc_session_arg_examples( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$SLOT, $kw39$CONSTRAINTS_VIA_EXAMPLES, pc_session_constraints_via_examples( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$SLOT, $kw40$GENERALIZED_CONSTRAINTS, pc_session_generalized_constraints( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$SLOT, $kw41$TEMPLATE, pc_session_template( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$SLOT, $kw42$PREDICATE, pc_session_predicate( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$END, $sym45$MAKE_PC_SESSION, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3268L)
  public static SubLObject visit_defstruct_object_pc_session_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_pc_session( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 3708L)
  public static SubLObject new_pc_session(final SubLObject interaction)
  {
    assert NIL != user_interaction_agenda.user_interaction_p( interaction ) : interaction;
    final SubLObject session = make_pc_session( UNPROVIDED );
    _csetf_pc_session_interaction( session, interaction );
    pc_session_note_mode( session, $kw50$NEW );
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 4001L)
  public static SubLObject pc_session_note_mode(final SubLObject session, final SubLObject mode)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != pc_session_mode_p( mode ) : mode;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_mode( session, mode );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 4275L)
  public static SubLObject pc_session_note_arity(final SubLObject session, final SubLObject v_arity)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != subl_promotions.positive_integer_p( v_arity ) : v_arity;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_arity( session, v_arity );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 4485L)
  public static SubLObject pc_session_clear_full_examples(final SubLObject session)
  {
    assert NIL != pc_session_p( session ) : session;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_full_examples( session, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 4665L)
  public static SubLObject pc_session_add_full_example(final SubLObject session, final SubLObject full_example)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != pc_session_full_example_p( full_example ) : full_example;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      if( NIL == conses_high.member( full_example, pc_session_full_examples( session ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_pc_session_full_examples( session, ConsesLow.cons( full_example, pc_session_full_examples( session ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 4928L)
  public static SubLObject pc_session_rem_full_example(final SubLObject session, final SubLObject full_example)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != pc_session_full_example_p( full_example ) : full_example;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_full_examples( session, Sequences.delete( full_example, pc_session_full_examples( session ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 5236L)
  public static SubLObject pc_session_clear_arg_examples(final SubLObject session)
  {
    assert NIL != pc_session_p( session ) : session;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_arg_examples( session, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 5414L)
  public static SubLObject pc_session_add_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != subl_promotions.positive_integer_p( arg ) : arg;
    assert NIL != pc_session_example_p( example ) : example;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      final SubLObject item_var = ConsesLow.list( arg, example );
      if( NIL == conses_high.member( item_var, pc_session_arg_examples( session ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_pc_session_arg_examples( session, ConsesLow.cons( item_var, pc_session_arg_examples( session ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 5708L)
  public static SubLObject pc_session_rem_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != subl_promotions.positive_integer_p( arg ) : arg;
    assert NIL != pc_session_example_p( example ) : example;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_arg_examples( session, Sequences.delete( ConsesLow.list( arg, example ), pc_session_arg_examples( session ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 6046L)
  public static SubLObject pc_session_note_constraints_via_examples(final SubLObject session, final SubLObject constraints)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != pc_session_constraint_list_p( constraints ) : constraints;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_constraints_via_examples( session, constraints );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 6323L)
  public static SubLObject pc_session_clear_generalized_constraints(final SubLObject session)
  {
    assert NIL != pc_session_p( session ) : session;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_generalized_constraints( session, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 6523L)
  public static SubLObject pc_session_clear_generalized_constraints_for_arg(final SubLObject session, final SubLObject arg)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != subl_promotions.positive_integer_p( arg ) : arg;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_generalized_constraints( session, Sequences.delete( arg, pc_session_generalized_constraints( session ), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym56$FIRST ), UNPROVIDED,
          UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 6844L)
  public static SubLObject pc_session_add_generalized_constraint(final SubLObject session, final SubLObject constraint)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != pc_session_constraint_p( constraint ) : constraint;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      if( NIL == conses_high.member( constraint, pc_session_generalized_constraints( session ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        _csetf_pc_session_generalized_constraints( session, ConsesLow.cons( constraint, pc_session_generalized_constraints( session ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 7119L)
  public static SubLObject pc_session_clear_template(final SubLObject session)
  {
    assert NIL != pc_session_p( session ) : session;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_template( session, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 7289L)
  public static SubLObject pc_session_note_template(final SubLObject session, final SubLObject template)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != pc_session_template_p( template ) : template;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_template( session, template );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 7517L)
  public static SubLObject pc_session_note_predicate(final SubLObject session, final SubLObject predicate)
  {
    assert NIL != pc_session_p( session ) : session;
    assert NIL != forts.fort_p( predicate ) : predicate;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $pc_lock$.getGlobalValue() );
      _csetf_pc_session_predicate( session, predicate );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $pc_lock$.getGlobalValue() );
      }
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 7736L)
  public static SubLObject pc_session_full_example_formulas(final SubLObject session)
  {
    final SubLObject predicate = pc_session_predicate( session );
    final SubLObject full_examples = pc_session_full_examples( session );
    SubLObject formulas = NIL;
    SubLObject cdolist_list_var = full_examples;
    SubLObject full_example = NIL;
    full_example = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject formula = reader.bq_cons( predicate, ConsesLow.append( full_example, NIL ) );
      formulas = ConsesLow.cons( formula, formulas );
      cdolist_list_var = cdolist_list_var.rest();
      full_example = cdolist_list_var.first();
    }
    return formulas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 8265L)
  public static SubLObject pc_session_switch_mode(final SubLObject session, final SubLObject mode)
  {
    if( NIL != subl_promotions.memberP( mode, $list60, UNPROVIDED, UNPROVIDED ) )
    {
      pc_session_clear_full_examples( session );
      pc_session_clear_arg_examples( session );
      pc_session_update_constraints_via_examples( session );
    }
    if( NIL != subl_promotions.memberP( mode, $list61, UNPROVIDED, UNPROVIDED ) )
    {
      pc_session_clear_generalized_constraints( session );
    }
    if( NIL != subl_promotions.memberP( mode, $list62, UNPROVIDED, UNPROVIDED ) )
    {
      pc_session_clear_template( session );
    }
    pc_session_note_mode( session, mode );
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 8845L)
  public static SubLObject pc_session_arg_examples_for_arg(final SubLObject session, final SubLObject arg)
  {
    final SubLObject arg_examples = pc_session_arg_examples( session );
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = arg_examples;
    SubLObject arg_example = NIL;
    arg_example = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = arg_example;
      SubLObject example_arg = NIL;
      SubLObject example_value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
      example_arg = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
      example_value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( arg.numE( example_arg ) )
        {
          v_answer = ConsesLow.cons( example_value, v_answer );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list63 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_example = cdolist_list_var.first();
    }
    v_answer = Sequences.nreverse( v_answer );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 9207L)
  public static SubLObject pc_session_agenda(final SubLObject session)
  {
    final SubLObject interaction = pc_session_interaction( session );
    return user_interaction_agenda.ui_agenda( interaction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 9345L)
  public static SubLObject pc_session_domain_interaction_mt(final SubLObject session)
  {
    final SubLObject v_agenda = pc_session_agenda( session );
    final SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt( v_agenda );
    return domain_interaction_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 9547L)
  public static SubLObject pc_session_generation_interaction_mt(final SubLObject session)
  {
    final SubLObject v_agenda = pc_session_agenda( session );
    final SubLObject generation_interaction_mt = user_interaction_agenda.uia_generation_interaction_mt( v_agenda, UNPROVIDED );
    return generation_interaction_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 9813L)
  public static SubLObject pc_session_parsing_interaction_mt(final SubLObject session)
  {
    final SubLObject v_agenda = pc_session_agenda( session );
    final SubLObject parsing_interaction_mt = user_interaction_agenda.uia_parsing_interaction_mt( v_agenda );
    return parsing_interaction_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 10276L)
  public static SubLObject pc_session_update_constraints_via_examples(final SubLObject session)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject domain_mt = pc_session_domain_interaction_mt( session );
    final SubLObject v_arity = pc_session_arity( session );
    SubLObject new_constraints = NIL;
    if( v_arity.isInteger() )
    {
      SubLObject i;
      SubLObject arg;
      SubLObject arg_examples;
      SubLObject isa_constraints;
      SubLObject genls_constraints;
      SubLObject cdolist_list_var;
      SubLObject constraint;
      for( i = NIL, i = ZERO_INTEGER; i.numL( v_arity ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        arg = Numbers.add( i, ONE_INTEGER );
        arg_examples = pc_session_arg_examples_for_arg( session, arg );
        thread.resetMultipleValues();
        isa_constraints = rkf_ontology_utilities.rkf_narrowest_type_constraints( arg_examples, domain_mt );
        genls_constraints = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != genls_constraints && NIL != $pc_downgrade_typelevelpreds_isas$.getDynamicValue( thread ) )
        {
          new_constraints = ConsesLow.cons( ConsesLow.list( arg, $const64$argIsa, $const65$Collection ), new_constraints );
        }
        else
        {
          cdolist_list_var = isa_constraints;
          constraint = NIL;
          constraint = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            new_constraints = ConsesLow.cons( ConsesLow.list( arg, $const64$argIsa, constraint ), new_constraints );
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
          }
        }
        cdolist_list_var = genls_constraints;
        constraint = NIL;
        constraint = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          new_constraints = ConsesLow.cons( ConsesLow.list( arg, $const66$argGenl, constraint ), new_constraints );
          cdolist_list_var = cdolist_list_var.rest();
          constraint = cdolist_list_var.first();
        }
      }
    }
    new_constraints = Sequences.nreverse( new_constraints );
    pc_session_note_constraints_via_examples( session, new_constraints );
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 11470L)
  public static SubLObject pc_session_act_create(final SubLObject interaction)
  {
    final SubLObject session = new_pc_session( interaction );
    pc_session_switch_mode( session, $kw36$ARITY );
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 11945L)
  public static SubLObject pc_session_act_set_arity(final SubLObject session, final SubLObject v_arity)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw36$ARITY ) )
    {
      pc_session_note_arity( session, v_arity );
      pc_session_note_mode( session, $kw67$EXAMPLES );
    }
    else if( pcase_var.eql( $kw67$EXAMPLES ) || pcase_var.eql( $kw68$CONSTRAINTS ) )
    {
      pc_session_switch_mode( session, $kw36$ARITY );
      pc_session_act_set_arity( session, v_arity );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 12478L)
  public static SubLObject pc_session_act_add_full_example(final SubLObject session, final SubLObject full_example)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw36$ARITY ) )
    {
      pc_session_act_set_arity( session, Sequences.length( full_example ) );
      pc_session_act_add_full_example( session, full_example );
    }
    else if( pcase_var.eql( $kw67$EXAMPLES ) )
    {
      pc_session_add_full_example( session, full_example );
      SubLObject list_var = NIL;
      SubLObject example = NIL;
      SubLObject index = NIL;
      list_var = full_example;
      example = list_var.first();
      for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), example = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
      {
        final SubLObject arg = Numbers.add( index, ONE_INTEGER );
        pc_session_add_arg_example( session, arg, example );
      }
      pc_session_update_constraints_via_examples( session );
    }
    else if( pcase_var.eql( $kw68$CONSTRAINTS ) )
    {
      pc_session_switch_mode( session, $kw67$EXAMPLES );
      pc_session_act_add_full_example( session, full_example );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 13338L)
  public static SubLObject pc_session_act_rem_full_example(final SubLObject session, final SubLObject full_example)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw67$EXAMPLES ) )
    {
      pc_session_rem_full_example( session, full_example );
      SubLObject list_var = NIL;
      SubLObject example = NIL;
      SubLObject index = NIL;
      list_var = full_example;
      example = list_var.first();
      for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), example = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
      {
        final SubLObject arg = Numbers.add( index, ONE_INTEGER );
        pc_session_rem_arg_example( session, arg, example );
      }
      pc_session_update_constraints_via_examples( session );
    }
    else if( pcase_var.eql( $kw68$CONSTRAINTS ) )
    {
      pc_session_switch_mode( session, $kw67$EXAMPLES );
      pc_session_act_rem_full_example( session, full_example );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 13958L)
  public static SubLObject pc_session_act_add_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw67$EXAMPLES ) )
    {
      pc_session_add_arg_example( session, arg, example );
      pc_session_update_constraints_via_examples( session );
    }
    else if( pcase_var.eql( $kw68$CONSTRAINTS ) )
    {
      pc_session_switch_mode( session, $kw67$EXAMPLES );
      pc_session_act_add_arg_example( session, arg, example );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 14435L)
  public static SubLObject pc_session_act_rem_arg_example(final SubLObject session, final SubLObject arg, final SubLObject example)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw67$EXAMPLES ) )
    {
      pc_session_rem_arg_example( session, arg, example );
      pc_session_update_constraints_via_examples( session );
    }
    else if( pcase_var.eql( $kw68$CONSTRAINTS ) )
    {
      pc_session_switch_mode( session, $kw67$EXAMPLES );
      pc_session_act_rem_arg_example( session, arg, example );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 14911L)
  public static SubLObject pc_session_act_accept_examples(final SubLObject session)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw67$EXAMPLES ) )
    {
      pc_session_switch_mode( session, $kw68$CONSTRAINTS );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 15157L)
  public static SubLObject pc_session_act_clear_all_generalized_constraints(final SubLObject session)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw68$CONSTRAINTS ) )
    {
      pc_session_clear_generalized_constraints( session );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 15475L)
  public static SubLObject pc_session_act_clear_generalized_constraints(final SubLObject session, final SubLObject arg)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw68$CONSTRAINTS ) )
    {
      pc_session_clear_generalized_constraints_for_arg( session, arg );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 15759L)
  public static SubLObject pc_session_act_add_generalized_constraint(final SubLObject session, final SubLObject arg, final SubLObject constraint_pred, final SubLObject value)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw68$CONSTRAINTS ) )
    {
      final SubLObject constraint = ConsesLow.list( arg, constraint_pred, value );
      pc_session_add_generalized_constraint( session, constraint );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 16120L)
  public static SubLObject pc_session_act_accept_generalized_constraints(final SubLObject session)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw68$CONSTRAINTS ) )
    {
      pc_session_switch_mode( session, $kw41$TEMPLATE );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 16381L)
  public static SubLObject pc_session_act_note_template(final SubLObject session, final SubLObject template)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw41$TEMPLATE ) )
    {
      pc_session_note_template( session, template );
      pc_session_switch_mode( session, $kw69$READY );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 16714L)
  public static SubLObject pc_session_act_complete(final SubLObject session, final SubLObject domain_mt, final SubLObject generation_mt, final SubLObject parsing_mt)
  {
    final SubLObject pcase_var = pc_session_mode( session );
    if( pcase_var.eql( $kw69$READY ) )
    {
      final SubLObject predicate = pc_session_create_predicate( session, domain_mt );
      pc_session_note_predicate( session, predicate );
      pc_session_assert_arity( session, predicate, domain_mt );
      pc_session_assert_constraints( session, predicate, domain_mt );
      pc_session_switch_mode( session, $kw70$DONE );
    }
    return session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 17526L)
  public static SubLObject pc_session_act_complete_from_examples(final SubLObject pc_session)
  {
    SubLObject cdolist_list_var;
    final SubLObject constraints = cdolist_list_var = pc_session_constraints_via_examples( pc_session );
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = constraint;
      SubLObject arg = NIL;
      SubLObject constraint_pred = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
      arg = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
      constraint_pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
      value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        pc_session_act_add_generalized_constraint( pc_session, arg, constraint_pred, value );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    pc_session_act_accept_generalized_constraints( pc_session );
    final SubLObject template = NIL;
    pc_session_act_note_template( pc_session, template );
    final SubLObject domain_interaction_mt = pc_session_domain_interaction_mt( pc_session );
    final SubLObject generation_mt = pc_session_generation_interaction_mt( pc_session );
    final SubLObject parsing_mt = pc_session_parsing_interaction_mt( pc_session );
    pc_session_act_complete( pc_session, domain_interaction_mt, generation_mt, parsing_mt );
    return pc_session;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 18464L)
  public static SubLObject pc_session_create_predicate(final SubLObject session, final SubLObject domain_mt)
  {
    final SubLObject predicate = rkf_term_utilities.rkf_create( $str72$Predicate, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 18641L)
  public static SubLObject pc_session_assert_arity(final SubLObject session, final SubLObject predicate, final SubLObject domain_mt)
  {
    final SubLObject v_arity = pc_session_arity( session );
    final SubLObject formula = pc_session_compute_arity_formula( predicate, v_arity, domain_mt );
    rkf_assertion_utilities.rkf_assert( formula, domain_mt, UNPROVIDED, UNPROVIDED );
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 18919L)
  public static SubLObject pc_session_assert_constraints(final SubLObject session, final SubLObject predicate, final SubLObject domain_mt)
  {
    SubLObject constraints = pc_session_generalized_constraints( session );
    SubLObject cdolist_list_var;
    constraints = ( cdolist_list_var = pc_session_sort_constraints( constraints ) );
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = constraint;
      SubLObject arg = NIL;
      SubLObject constraint_pred = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
      arg = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
      constraint_pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
      value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject formula = ConsesLow.list( constraint_pred, predicate, arg, value );
        rkf_assertion_utilities.rkf_assert( formula, domain_mt, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 19354L)
  public static SubLObject pc_session_sort_constraints(SubLObject constraints)
  {
    constraints = conses_high.copy_list( constraints );
    constraints = Sort.sort( constraints, Symbols.symbol_function( $sym73$GENERALITY_ESTIMATE_ ), Symbols.symbol_function( $sym74$THIRD ) );
    constraints = list_utilities.stable_sort_via_position( constraints, $pc_session_constraint_predicates$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym75$SECOND ) );
    constraints = Sort.stable_sort( constraints, Symbols.symbol_function( $sym76$_ ), Symbols.symbol_function( $sym56$FIRST ) );
    return constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 19723L)
  public static SubLObject pc_session_assert_generation_template(final SubLObject session, final SubLObject predicate, final SubLObject generation_mt)
  {
    final SubLObject template = pc_session_template( session );
    final SubLObject formula = pc_session_compute_generation_template_formula( predicate, template, generation_mt );
    rkf_assertion_utilities.rkf_assert( formula, generation_mt, UNPROVIDED, UNPROVIDED );
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20023L)
  public static SubLObject pc_session_assert_parsing_template(final SubLObject session, final SubLObject predicate, final SubLObject parsing_mt)
  {
    final SubLObject template = pc_session_template( session );
    final SubLObject formula = pc_session_compute_parsing_template_formula( predicate, template, parsing_mt );
    rkf_assertion_utilities.rkf_assert( formula, parsing_mt, UNPROVIDED, UNPROVIDED );
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20308L)
  public static SubLObject pc_session_compute_arity_formula(final SubLObject predicate, final SubLObject v_arity, final SubLObject domain_mt)
  {
    final SubLObject collection = rkf_predicate_type_for_arity( v_arity, domain_mt );
    return ConsesLow.list( $const77$isa, predicate, collection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20512L)
  public static SubLObject rkf_predicate_type_for_arity(final SubLObject v_arity, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return cached_predicate_type_for_arity_any_mt( v_arity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20985L)
  public static SubLObject clear_cached_predicate_type_for_arity_any_mt()
  {
    final SubLObject cs = $cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20985L)
  public static SubLObject remove_cached_predicate_type_for_arity_any_mt(final SubLObject v_arity)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue(), ConsesLow.list( v_arity ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20985L)
  public static SubLObject cached_predicate_type_for_arity_any_mt_internal(final SubLObject v_arity)
  {
    final SubLObject query = conses_high.subst( v_arity, $kw36$ARITY, $predicate_type_for_arity_query$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    return ask_utilities.ask_variable( $kw80$COL, query, $const81$InferencePSC, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 20985L)
  public static SubLObject cached_predicate_type_for_arity_any_mt(final SubLObject v_arity)
  {
    SubLObject caching_state = $cached_predicate_type_for_arity_any_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym79$CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT, $sym82$_CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT_CACHING_STATE_, NIL, EQL, ONE_INTEGER,
          FIVE_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_arity, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_predicate_type_for_arity_any_mt_internal( v_arity ) ) );
      memoization_state.caching_state_put( caching_state, v_arity, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 21203L)
  public static SubLObject pc_session_compute_generation_template_formula(final SubLObject predicate, final SubLObject template, final SubLObject generation_mt)
  {
    final SubLObject generation_template = pc_session_compute_generation_template( template );
    return ConsesLow.list( $const83$genTemplate, predicate, generation_template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 21540L)
  public static SubLObject pc_session_compute_generation_template(final SubLObject template)
  {
    SubLObject template_terms = NIL;
    SubLObject cdolist_list_var = template;
    SubLObject template_item = NIL;
    template_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( template_item.isString() )
      {
        template_terms = ConsesLow.cons( el_utilities.make_unary_formula( pph_functions.bestnlphraseofstringfn(), template_item ), template_terms );
      }
      else if( template_item.isKeyword() )
      {
        template_terms = ConsesLow.cons( el_utilities.make_unary_formula( pph_functions.termparaphrasefn(), template_item ), template_terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      template_item = cdolist_list_var.first();
    }
    template_terms = Sequences.nreverse( template_terms );
    return el_utilities.make_el_formula( pph_functions.concatenatephrasesfn(), template_terms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 22040L)
  public static SubLObject pc_session_compute_parsing_template_formula(final SubLObject predicate, final SubLObject template, final SubLObject parsing_mt)
  {
    final SubLObject syntax_template = pc_session_compute_parsing_syntax_template( template );
    final SubLObject semantics_template = pc_session_compute_parsing_semantics_template( predicate, template );
    return ConsesLow.list( $const84$assertTemplate_Reln, $const85$STemplate, predicate, syntax_template, semantics_template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 22674L)
  public static SubLObject pc_session_compute_parsing_syntax_template(final SubLObject template)
  {
    SubLObject template_terms = NIL;
    SubLObject cdolist_list_var = template;
    SubLObject template_item = NIL;
    template_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( template_item.isString() )
      {
        SubLObject cdolist_list_var_$1;
        final SubLObject strings = cdolist_list_var_$1 = standard_tokenization.standard_raw_tokenization( template_item );
        SubLObject string = NIL;
        string = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          template_terms = ConsesLow.cons( string, template_terms );
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          string = cdolist_list_var_$1.first();
        }
      }
      else if( template_item.isKeyword() )
      {
        template_terms = ConsesLow.cons( ConsesLow.list( $const86$NPTemplate, template_item ), template_terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      template_item = cdolist_list_var.first();
    }
    template_terms = Sequences.nreverse( template_terms );
    return template_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 23157L)
  public static SubLObject pc_session_compute_parsing_semantics_template(final SubLObject predicate, final SubLObject v_arity)
  {
    return generic_relation_template_of_arity( predicate, v_arity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 23495L)
  public static SubLObject generic_relation_template(final SubLObject relation)
  {
    final SubLObject v_arity = arity.min_arity( relation );
    return generic_relation_template_of_arity( relation, v_arity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 23897L)
  public static SubLObject generic_relation_template_of_arity(final SubLObject relation, final SubLObject v_arity)
  {
    SubLObject args = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( v_arity ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      args = ConsesLow.cons( generic_keyword_arg( Numbers.add( i, ONE_INTEGER ) ), args );
    }
    args = Sequences.nreverse( args );
    return el_utilities.make_formula( relation, args, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 24233L)
  public static SubLObject clear_generic_keyword_arg()
  {
    final SubLObject cs = $generic_keyword_arg_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 24233L)
  public static SubLObject remove_generic_keyword_arg(final SubLObject n)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $generic_keyword_arg_caching_state$.getGlobalValue(), ConsesLow.list( n ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 24233L)
  public static SubLObject generic_keyword_arg_internal(final SubLObject n)
  {
    final SubLObject string = PrintLow.format( NIL, $str88$ARG_A, n );
    return Values.values( string_utilities.keyword_from_string( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-predicate-creator.lisp", position = 24233L)
  public static SubLObject generic_keyword_arg(final SubLObject n)
  {
    SubLObject caching_state = $generic_keyword_arg_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym87$GENERIC_KEYWORD_ARG, $sym89$_GENERIC_KEYWORD_ARG_CACHING_STATE_, NIL, EQL, ONE_INTEGER, TEN_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, n, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( generic_keyword_arg_internal( n ) ) );
      memoization_state.caching_state_put( caching_state, n, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_rkf_predicate_creator_file()
  {
    SubLFiles.declareMacro( me, "with_pc_lock", "WITH-PC-LOCK" );
    SubLFiles.declareFunction( me, "pc_session_mode_p", "PC-SESSION-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_contraint_predicate_p", "PC-SESSION-CONTRAINT-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_full_example_p", "PC-SESSION-FULL-EXAMPLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_example_p", "PC-SESSION-EXAMPLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_template_p", "PC-SESSION-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_constraint_list_p", "PC-SESSION-CONSTRAINT-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_constraint_p", "PC-SESSION-CONSTRAINT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_print_function_trampoline", "PC-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_p", "PC-SESSION-P", 1, 0, false );
    new $pc_session_p$UnaryFunction();
    SubLFiles.declareFunction( me, "pc_session_interaction", "PC-SESSION-INTERACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_mode", "PC-SESSION-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_arity", "PC-SESSION-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_full_examples", "PC-SESSION-FULL-EXAMPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_arg_examples", "PC-SESSION-ARG-EXAMPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_constraints_via_examples", "PC-SESSION-CONSTRAINTS-VIA-EXAMPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_generalized_constraints", "PC-SESSION-GENERALIZED-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_template", "PC-SESSION-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_predicate", "PC-SESSION-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pc_session_interaction", "_CSETF-PC-SESSION-INTERACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pc_session_mode", "_CSETF-PC-SESSION-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pc_session_arity", "_CSETF-PC-SESSION-ARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pc_session_full_examples", "_CSETF-PC-SESSION-FULL-EXAMPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pc_session_arg_examples", "_CSETF-PC-SESSION-ARG-EXAMPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pc_session_constraints_via_examples", "_CSETF-PC-SESSION-CONSTRAINTS-VIA-EXAMPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pc_session_generalized_constraints", "_CSETF-PC-SESSION-GENERALIZED-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pc_session_template", "_CSETF-PC-SESSION-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pc_session_predicate", "_CSETF-PC-SESSION-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_pc_session", "MAKE-PC-SESSION", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_pc_session", "VISIT-DEFSTRUCT-PC-SESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_pc_session_method", "VISIT-DEFSTRUCT-OBJECT-PC-SESSION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_pc_session", "NEW-PC-SESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_note_mode", "PC-SESSION-NOTE-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_note_arity", "PC-SESSION-NOTE-ARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_clear_full_examples", "PC-SESSION-CLEAR-FULL-EXAMPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_add_full_example", "PC-SESSION-ADD-FULL-EXAMPLE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_rem_full_example", "PC-SESSION-REM-FULL-EXAMPLE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_clear_arg_examples", "PC-SESSION-CLEAR-ARG-EXAMPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_add_arg_example", "PC-SESSION-ADD-ARG-EXAMPLE", 3, 0, false );
    SubLFiles.declareFunction( me, "pc_session_rem_arg_example", "PC-SESSION-REM-ARG-EXAMPLE", 3, 0, false );
    SubLFiles.declareFunction( me, "pc_session_note_constraints_via_examples", "PC-SESSION-NOTE-CONSTRAINTS-VIA-EXAMPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_clear_generalized_constraints", "PC-SESSION-CLEAR-GENERALIZED-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_clear_generalized_constraints_for_arg", "PC-SESSION-CLEAR-GENERALIZED-CONSTRAINTS-FOR-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_add_generalized_constraint", "PC-SESSION-ADD-GENERALIZED-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_clear_template", "PC-SESSION-CLEAR-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_note_template", "PC-SESSION-NOTE-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_note_predicate", "PC-SESSION-NOTE-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_full_example_formulas", "PC-SESSION-FULL-EXAMPLE-FORMULAS", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_switch_mode", "PC-SESSION-SWITCH-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_arg_examples_for_arg", "PC-SESSION-ARG-EXAMPLES-FOR-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_agenda", "PC-SESSION-AGENDA", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_domain_interaction_mt", "PC-SESSION-DOMAIN-INTERACTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_generation_interaction_mt", "PC-SESSION-GENERATION-INTERACTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_parsing_interaction_mt", "PC-SESSION-PARSING-INTERACTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_update_constraints_via_examples", "PC-SESSION-UPDATE-CONSTRAINTS-VIA-EXAMPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_create", "PC-SESSION-ACT-CREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_set_arity", "PC-SESSION-ACT-SET-ARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_add_full_example", "PC-SESSION-ACT-ADD-FULL-EXAMPLE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_rem_full_example", "PC-SESSION-ACT-REM-FULL-EXAMPLE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_add_arg_example", "PC-SESSION-ACT-ADD-ARG-EXAMPLE", 3, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_rem_arg_example", "PC-SESSION-ACT-REM-ARG-EXAMPLE", 3, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_accept_examples", "PC-SESSION-ACT-ACCEPT-EXAMPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_clear_all_generalized_constraints", "PC-SESSION-ACT-CLEAR-ALL-GENERALIZED-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_clear_generalized_constraints", "PC-SESSION-ACT-CLEAR-GENERALIZED-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_add_generalized_constraint", "PC-SESSION-ACT-ADD-GENERALIZED-CONSTRAINT", 4, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_accept_generalized_constraints", "PC-SESSION-ACT-ACCEPT-GENERALIZED-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_note_template", "PC-SESSION-ACT-NOTE-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_complete", "PC-SESSION-ACT-COMPLETE", 4, 0, false );
    SubLFiles.declareFunction( me, "pc_session_act_complete_from_examples", "PC-SESSION-ACT-COMPLETE-FROM-EXAMPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_create_predicate", "PC-SESSION-CREATE-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "pc_session_assert_arity", "PC-SESSION-ASSERT-ARITY", 3, 0, false );
    SubLFiles.declareFunction( me, "pc_session_assert_constraints", "PC-SESSION-ASSERT-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "pc_session_sort_constraints", "PC-SESSION-SORT-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_assert_generation_template", "PC-SESSION-ASSERT-GENERATION-TEMPLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "pc_session_assert_parsing_template", "PC-SESSION-ASSERT-PARSING-TEMPLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "pc_session_compute_arity_formula", "PC-SESSION-COMPUTE-ARITY-FORMULA", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_predicate_type_for_arity", "RKF-PREDICATE-TYPE-FOR-ARITY", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_cached_predicate_type_for_arity_any_mt", "CLEAR-CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_predicate_type_for_arity_any_mt", "REMOVE-CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_predicate_type_for_arity_any_mt_internal", "CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_predicate_type_for_arity_any_mt", "CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_compute_generation_template_formula", "PC-SESSION-COMPUTE-GENERATION-TEMPLATE-FORMULA", 3, 0, false );
    SubLFiles.declareFunction( me, "pc_session_compute_generation_template", "PC-SESSION-COMPUTE-GENERATION-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_compute_parsing_template_formula", "PC-SESSION-COMPUTE-PARSING-TEMPLATE-FORMULA", 3, 0, false );
    SubLFiles.declareFunction( me, "pc_session_compute_parsing_syntax_template", "PC-SESSION-COMPUTE-PARSING-SYNTAX-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "pc_session_compute_parsing_semantics_template", "PC-SESSION-COMPUTE-PARSING-SEMANTICS-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "generic_relation_template", "GENERIC-RELATION-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_relation_template_of_arity", "GENERIC-RELATION-TEMPLATE-OF-ARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_generic_keyword_arg", "CLEAR-GENERIC-KEYWORD-ARG", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_generic_keyword_arg", "REMOVE-GENERIC-KEYWORD-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_keyword_arg_internal", "GENERIC-KEYWORD-ARG-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_keyword_arg", "GENERIC-KEYWORD-ARG", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_predicate_creator_file()
  {
    $pc_lock$ = SubLFiles.deflexical( "*PC-LOCK*", maybeDefault( $sym0$_PC_LOCK_, $pc_lock$, () -> ( Locks.make_lock( $str1$Predicate_Creator_lock ) ) ) );
    $pc_session_modes$ = SubLFiles.deflexical( "*PC-SESSION-MODES*", $list4 );
    $pc_session_constraint_predicates$ = SubLFiles.deflexical( "*PC-SESSION-CONSTRAINT-PREDICATES*", $list5 );
    $dtp_pc_session$ = SubLFiles.defconstant( "*DTP-PC-SESSION*", $sym7$PC_SESSION );
    $pc_downgrade_typelevelpreds_isas$ = SubLFiles.defparameter( "*PC-DOWNGRADE-TYPELEVELPREDS-ISAS*", T );
    $predicate_type_for_arity_query$ = SubLFiles.deflexical( "*PREDICATE-TYPE-FOR-ARITY-QUERY*", $list78 );
    $cached_predicate_type_for_arity_any_mt_caching_state$ = SubLFiles.deflexical( "*CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-CACHING-STATE*", NIL );
    $generic_keyword_arg_caching_state$ = SubLFiles.deflexical( "*GENERIC-KEYWORD-ARG-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_rkf_predicate_creator_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_PC_LOCK_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_pc_session$.getGlobalValue(), Symbols.symbol_function( $sym14$PC_SESSION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list15 );
    Structures.def_csetf( $sym16$PC_SESSION_INTERACTION, $sym17$_CSETF_PC_SESSION_INTERACTION );
    Structures.def_csetf( $sym18$PC_SESSION_MODE, $sym19$_CSETF_PC_SESSION_MODE );
    Structures.def_csetf( $sym20$PC_SESSION_ARITY, $sym21$_CSETF_PC_SESSION_ARITY );
    Structures.def_csetf( $sym22$PC_SESSION_FULL_EXAMPLES, $sym23$_CSETF_PC_SESSION_FULL_EXAMPLES );
    Structures.def_csetf( $sym24$PC_SESSION_ARG_EXAMPLES, $sym25$_CSETF_PC_SESSION_ARG_EXAMPLES );
    Structures.def_csetf( $sym26$PC_SESSION_CONSTRAINTS_VIA_EXAMPLES, $sym27$_CSETF_PC_SESSION_CONSTRAINTS_VIA_EXAMPLES );
    Structures.def_csetf( $sym28$PC_SESSION_GENERALIZED_CONSTRAINTS, $sym29$_CSETF_PC_SESSION_GENERALIZED_CONSTRAINTS );
    Structures.def_csetf( $sym30$PC_SESSION_TEMPLATE, $sym31$_CSETF_PC_SESSION_TEMPLATE );
    Structures.def_csetf( $sym32$PC_SESSION_PREDICATE, $sym33$_CSETF_PC_SESSION_PREDICATE );
    Equality.identity( $sym7$PC_SESSION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pc_session$.getGlobalValue(), Symbols.symbol_function( $sym48$VISIT_DEFSTRUCT_OBJECT_PC_SESSION_METHOD ) );
    memoization_state.note_globally_cached_function( $sym79$CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT );
    memoization_state.note_globally_cached_function( $sym87$GENERIC_KEYWORD_ARG );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_predicate_creator_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_predicate_creator_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_predicate_creator_file();
  }
  static
  {
    me = new rkf_predicate_creator();
    $pc_lock$ = null;
    $pc_session_modes$ = null;
    $pc_session_constraint_predicates$ = null;
    $dtp_pc_session$ = null;
    $pc_downgrade_typelevelpreds_isas$ = null;
    $predicate_type_for_arity_query$ = null;
    $cached_predicate_type_for_arity_any_mt_caching_state$ = null;
    $generic_keyword_arg_caching_state$ = null;
    $sym0$_PC_LOCK_ = makeSymbol( "*PC-LOCK*" );
    $str1$Predicate_Creator_lock = makeString( "Predicate Creator lock" );
    $sym2$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list3 = ConsesLow.list( makeSymbol( "*PC-LOCK*" ) );
    $list4 = ConsesLow.list( makeKeyword( "NEW" ), makeKeyword( "ARITY" ), makeKeyword( "EXAMPLES" ), makeKeyword( "CONSTRAINTS" ), makeKeyword( "TEMPLATE" ), makeKeyword( "READY" ), makeKeyword( "DONE" ) );
    $list5 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argGenl" ) ) );
    $list6 = ConsesLow.list( makeSymbol( "ARG" ), makeSymbol( "PRED" ), makeSymbol( "VALUE" ) );
    $sym7$PC_SESSION = makeSymbol( "PC-SESSION" );
    $sym8$PC_SESSION_P = makeSymbol( "PC-SESSION-P" );
    $list9 = ConsesLow.list( new SubLObject[] { makeSymbol( "INTERACTION" ), makeSymbol( "MODE" ), makeSymbol( "ARITY" ), makeSymbol( "FULL-EXAMPLES" ), makeSymbol( "ARG-EXAMPLES" ), makeSymbol(
        "CONSTRAINTS-VIA-EXAMPLES" ), makeSymbol( "GENERALIZED-CONSTRAINTS" ), makeSymbol( "TEMPLATE" ), makeSymbol( "PREDICATE" )
    } );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "INTERACTION" ), makeKeyword( "MODE" ), makeKeyword( "ARITY" ), makeKeyword( "FULL-EXAMPLES" ), makeKeyword( "ARG-EXAMPLES" ), makeKeyword(
        "CONSTRAINTS-VIA-EXAMPLES" ), makeKeyword( "GENERALIZED-CONSTRAINTS" ), makeKeyword( "TEMPLATE" ), makeKeyword( "PREDICATE" )
    } );
    $list11 = ConsesLow.list( new SubLObject[] { makeSymbol( "PC-SESSION-INTERACTION" ), makeSymbol( "PC-SESSION-MODE" ), makeSymbol( "PC-SESSION-ARITY" ), makeSymbol( "PC-SESSION-FULL-EXAMPLES" ), makeSymbol(
        "PC-SESSION-ARG-EXAMPLES" ), makeSymbol( "PC-SESSION-CONSTRAINTS-VIA-EXAMPLES" ), makeSymbol( "PC-SESSION-GENERALIZED-CONSTRAINTS" ), makeSymbol( "PC-SESSION-TEMPLATE" ), makeSymbol( "PC-SESSION-PREDICATE" )
    } );
    $list12 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-PC-SESSION-INTERACTION" ), makeSymbol( "_CSETF-PC-SESSION-MODE" ), makeSymbol( "_CSETF-PC-SESSION-ARITY" ), makeSymbol(
        "_CSETF-PC-SESSION-FULL-EXAMPLES" ), makeSymbol( "_CSETF-PC-SESSION-ARG-EXAMPLES" ), makeSymbol( "_CSETF-PC-SESSION-CONSTRAINTS-VIA-EXAMPLES" ), makeSymbol( "_CSETF-PC-SESSION-GENERALIZED-CONSTRAINTS" ),
      makeSymbol( "_CSETF-PC-SESSION-TEMPLATE" ), makeSymbol( "_CSETF-PC-SESSION-PREDICATE" )
    } );
    $sym13$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym14$PC_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PC-SESSION-PRINT-FUNCTION-TRAMPOLINE" );
    $list15 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PC-SESSION-P" ) );
    $sym16$PC_SESSION_INTERACTION = makeSymbol( "PC-SESSION-INTERACTION" );
    $sym17$_CSETF_PC_SESSION_INTERACTION = makeSymbol( "_CSETF-PC-SESSION-INTERACTION" );
    $sym18$PC_SESSION_MODE = makeSymbol( "PC-SESSION-MODE" );
    $sym19$_CSETF_PC_SESSION_MODE = makeSymbol( "_CSETF-PC-SESSION-MODE" );
    $sym20$PC_SESSION_ARITY = makeSymbol( "PC-SESSION-ARITY" );
    $sym21$_CSETF_PC_SESSION_ARITY = makeSymbol( "_CSETF-PC-SESSION-ARITY" );
    $sym22$PC_SESSION_FULL_EXAMPLES = makeSymbol( "PC-SESSION-FULL-EXAMPLES" );
    $sym23$_CSETF_PC_SESSION_FULL_EXAMPLES = makeSymbol( "_CSETF-PC-SESSION-FULL-EXAMPLES" );
    $sym24$PC_SESSION_ARG_EXAMPLES = makeSymbol( "PC-SESSION-ARG-EXAMPLES" );
    $sym25$_CSETF_PC_SESSION_ARG_EXAMPLES = makeSymbol( "_CSETF-PC-SESSION-ARG-EXAMPLES" );
    $sym26$PC_SESSION_CONSTRAINTS_VIA_EXAMPLES = makeSymbol( "PC-SESSION-CONSTRAINTS-VIA-EXAMPLES" );
    $sym27$_CSETF_PC_SESSION_CONSTRAINTS_VIA_EXAMPLES = makeSymbol( "_CSETF-PC-SESSION-CONSTRAINTS-VIA-EXAMPLES" );
    $sym28$PC_SESSION_GENERALIZED_CONSTRAINTS = makeSymbol( "PC-SESSION-GENERALIZED-CONSTRAINTS" );
    $sym29$_CSETF_PC_SESSION_GENERALIZED_CONSTRAINTS = makeSymbol( "_CSETF-PC-SESSION-GENERALIZED-CONSTRAINTS" );
    $sym30$PC_SESSION_TEMPLATE = makeSymbol( "PC-SESSION-TEMPLATE" );
    $sym31$_CSETF_PC_SESSION_TEMPLATE = makeSymbol( "_CSETF-PC-SESSION-TEMPLATE" );
    $sym32$PC_SESSION_PREDICATE = makeSymbol( "PC-SESSION-PREDICATE" );
    $sym33$_CSETF_PC_SESSION_PREDICATE = makeSymbol( "_CSETF-PC-SESSION-PREDICATE" );
    $kw34$INTERACTION = makeKeyword( "INTERACTION" );
    $kw35$MODE = makeKeyword( "MODE" );
    $kw36$ARITY = makeKeyword( "ARITY" );
    $kw37$FULL_EXAMPLES = makeKeyword( "FULL-EXAMPLES" );
    $kw38$ARG_EXAMPLES = makeKeyword( "ARG-EXAMPLES" );
    $kw39$CONSTRAINTS_VIA_EXAMPLES = makeKeyword( "CONSTRAINTS-VIA-EXAMPLES" );
    $kw40$GENERALIZED_CONSTRAINTS = makeKeyword( "GENERALIZED-CONSTRAINTS" );
    $kw41$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw42$PREDICATE = makeKeyword( "PREDICATE" );
    $str43$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw44$BEGIN = makeKeyword( "BEGIN" );
    $sym45$MAKE_PC_SESSION = makeSymbol( "MAKE-PC-SESSION" );
    $kw46$SLOT = makeKeyword( "SLOT" );
    $kw47$END = makeKeyword( "END" );
    $sym48$VISIT_DEFSTRUCT_OBJECT_PC_SESSION_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PC-SESSION-METHOD" );
    $sym49$USER_INTERACTION_P = makeSymbol( "USER-INTERACTION-P" );
    $kw50$NEW = makeKeyword( "NEW" );
    $sym51$PC_SESSION_MODE_P = makeSymbol( "PC-SESSION-MODE-P" );
    $sym52$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym53$PC_SESSION_FULL_EXAMPLE_P = makeSymbol( "PC-SESSION-FULL-EXAMPLE-P" );
    $sym54$PC_SESSION_EXAMPLE_P = makeSymbol( "PC-SESSION-EXAMPLE-P" );
    $sym55$PC_SESSION_CONSTRAINT_LIST_P = makeSymbol( "PC-SESSION-CONSTRAINT-LIST-P" );
    $sym56$FIRST = makeSymbol( "FIRST" );
    $sym57$PC_SESSION_CONSTRAINT_P = makeSymbol( "PC-SESSION-CONSTRAINT-P" );
    $sym58$PC_SESSION_TEMPLATE_P = makeSymbol( "PC-SESSION-TEMPLATE-P" );
    $sym59$FORT_P = makeSymbol( "FORT-P" );
    $list60 = ConsesLow.list( makeKeyword( "ARITY" ) );
    $list61 = ConsesLow.list( makeKeyword( "ARITY" ), makeKeyword( "EXAMPLES" ) );
    $list62 = ConsesLow.list( makeKeyword( "ARITY" ), makeKeyword( "EXAMPLES" ), makeKeyword( "CONSTRAINTS" ) );
    $list63 = ConsesLow.list( makeSymbol( "EXAMPLE-ARG" ), makeSymbol( "EXAMPLE-VALUE" ) );
    $const64$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $const65$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $const66$argGenl = constant_handles.reader_make_constant_shell( makeString( "argGenl" ) );
    $kw67$EXAMPLES = makeKeyword( "EXAMPLES" );
    $kw68$CONSTRAINTS = makeKeyword( "CONSTRAINTS" );
    $kw69$READY = makeKeyword( "READY" );
    $kw70$DONE = makeKeyword( "DONE" );
    $list71 = ConsesLow.list( makeSymbol( "ARG" ), makeSymbol( "CONSTRAINT-PRED" ), makeSymbol( "VALUE" ) );
    $str72$Predicate = makeString( "Predicate" );
    $sym73$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE<" );
    $sym74$THIRD = makeSymbol( "THIRD" );
    $sym75$SECOND = makeSymbol( "SECOND" );
    $sym76$_ = makeSymbol( "<" );
    $const77$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list78 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?GENL" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "COL" ), constant_handles.reader_make_constant_shell( makeString( "RelationshipTypeByArity" ) ) ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?GENL" ), constant_handles.reader_make_constant_shell( makeString( "RelationshipTypeByArity" ) ) ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeKeyword( "COL" ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "genls" ) ), makeKeyword( "COL" ), makeSymbol( "?GENL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) ),
                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "arity" ) ), makeSymbol( "?GENL" ),
                            makeKeyword( "ARITY" ) ) ) ) );
    $sym79$CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT = makeSymbol( "CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT" );
    $kw80$COL = makeKeyword( "COL" );
    $const81$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym82$_CACHED_PREDICATE_TYPE_FOR_ARITY_ANY_MT_CACHING_STATE_ = makeSymbol( "*CACHED-PREDICATE-TYPE-FOR-ARITY-ANY-MT-CACHING-STATE*" );
    $const83$genTemplate = constant_handles.reader_make_constant_shell( makeString( "genTemplate" ) );
    $const84$assertTemplate_Reln = constant_handles.reader_make_constant_shell( makeString( "assertTemplate-Reln" ) );
    $const85$STemplate = constant_handles.reader_make_constant_shell( makeString( "STemplate" ) );
    $const86$NPTemplate = constant_handles.reader_make_constant_shell( makeString( "NPTemplate" ) );
    $sym87$GENERIC_KEYWORD_ARG = makeSymbol( "GENERIC-KEYWORD-ARG" );
    $str88$ARG_A = makeString( "ARG~A" );
    $sym89$_GENERIC_KEYWORD_ARG_CACHING_STATE_ = makeSymbol( "*GENERIC-KEYWORD-ARG-CACHING-STATE*" );
  }

  public static final class $pc_session_native
      extends
        SubLStructNative
  {
    public SubLObject $interaction;
    public SubLObject $mode;
    public SubLObject $arity;
    public SubLObject $full_examples;
    public SubLObject $arg_examples;
    public SubLObject $constraints_via_examples;
    public SubLObject $generalized_constraints;
    public SubLObject $template;
    public SubLObject $predicate;
    private static final SubLStructDeclNative structDecl;

    public $pc_session_native()
    {
      this.$interaction = CommonSymbols.NIL;
      this.$mode = CommonSymbols.NIL;
      this.$arity = CommonSymbols.NIL;
      this.$full_examples = CommonSymbols.NIL;
      this.$arg_examples = CommonSymbols.NIL;
      this.$constraints_via_examples = CommonSymbols.NIL;
      this.$generalized_constraints = CommonSymbols.NIL;
      this.$template = CommonSymbols.NIL;
      this.$predicate = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $pc_session_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$interaction;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$mode;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$arity;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$full_examples;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$arg_examples;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$constraints_via_examples;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$generalized_constraints;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$template;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$predicate;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$interaction = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$mode = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$arity = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$full_examples = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$arg_examples = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$constraints_via_examples = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$generalized_constraints = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$template = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$predicate = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $pc_session_native.class, $sym7$PC_SESSION, $sym8$PC_SESSION_P, $list9, $list10, new String[] { "$interaction", "$mode", "$arity", "$full_examples", "$arg_examples",
        "$constraints_via_examples", "$generalized_constraints", "$template", "$predicate"
      }, $list11, $list12, $sym13$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $pc_session_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $pc_session_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PC-SESSION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return pc_session_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 299 ms
 * 
 */