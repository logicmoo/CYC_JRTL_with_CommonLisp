//
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;

import org.armedbear.lisp.LispObject;

import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class assertions_low extends SubLTranslatedFile
{
  public static final class $assertion_content_p$UnaryFunction extends UnaryFunction
  {
    public $assertion_content_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ASSERTION-CONTENT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return assertion_content_p( arg1 );
    }
  }
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.assertions_low";
  public static final String myFingerPrint = "9610a4129c9be7b648aa4fdfcfdef33cb47007a418cf48afc3f5a671521c6abe";
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLSymbol $dtp_assertion_content$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1856L)
  private static SubLSymbol $default_assertion_flags$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 18523L)
  private static SubLSymbol $assertion_flags_gaf_byte$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 18806L)
  private static SubLSymbol $assertion_flags_direction_byte$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 19105L)
  private static SubLSymbol $assertion_flags_tv_byte$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 20248L)
  private static SubLSymbol $rule_set$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 20442L)
  private static SubLSymbol $prefer_rule_set_over_flagsP$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 20739L)
  private static SubLSymbol $estimated_assertions_per_rule$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 29169L)
  private static SubLSymbol $non_true_assertion_tv_cache$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 29485L)
  private static SubLSymbol $prefer_non_true_set_over_flagsP$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 29837L)
  private static SubLSymbol $estimated_assertions_per_non_true$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 52982L)
  private static SubLSymbol $dependent_deduction_table$;
  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 53067L)
  private static SubLSymbol $dependent_assertion_table$;
  static final SubLSymbol $sym0$ASSERTION_CONTENT;
  static final SubLSymbol $sym1$ASSERTION_CONTENT_P;
  static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLInteger $int2$148;
  private static final SubLSymbol $sym8$ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$AS_CONTENT_FORMULA_DATA;
  private static final SubLSymbol $sym11$_CSETF_AS_CONTENT_FORMULA_DATA;
  private static final SubLSymbol $sym12$AS_CONTENT_MT;
  private static final SubLSymbol $sym13$_CSETF_AS_CONTENT_MT;
  private static final SubLSymbol $sym14$AS_CONTENT_FLAGS;
  private static final SubLSymbol $sym15$_CSETF_AS_CONTENT_FLAGS;
  private static final SubLSymbol $sym16$AS_CONTENT_ARGUMENTS;
  private static final SubLSymbol $sym17$_CSETF_AS_CONTENT_ARGUMENTS;
  private static final SubLSymbol $sym18$AS_CONTENT_PLIST;
  private static final SubLSymbol $sym19$_CSETF_AS_CONTENT_PLIST;
  private static final SubLSymbol $kw20$FORMULA_DATA;
  private static final SubLSymbol $kw21$MT;
  private static final SubLSymbol $kw22$FLAGS;
  private static final SubLSymbol $kw23$ARGUMENTS;
  private static final SubLSymbol $kw24$PLIST;
  private static final SubLString $str25$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw26$BEGIN;
  private static final SubLSymbol $sym27$MAKE_ASSERTION_CONTENT;
  private static final SubLSymbol $kw28$SLOT;
  private static final SubLSymbol $kw29$END;
  private static final SubLSymbol $sym30$VISIT_DEFSTRUCT_OBJECT_ASSERTION_CONTENT_METHOD;
  private static final SubLSymbol $kw31$DEPENDENTS;
  private static final SubLSymbol $kw32$INDEX;
  private static final SubLSymbol $kw33$TRUE;
  private static final SubLSymbol $sym34$ASSERTION_P;
  private static final SubLString $str35$_a__assertion___a__has_null_flags;
  private static final SubLSymbol $kw36$VARIABLE_NAMES;
  private static final SubLInteger $int37$256;
  private static final SubLString $str38$Unexpected_formula_data_type___S;
  private static final SubLSymbol $sym39$_RULE_SET_;
  private static final SubLSymbol $sym40$_PREFER_RULE_SET_OVER_FLAGS__;
  private static final SubLInteger $int41$60;
  private static final SubLSymbol $sym42$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str43$mapping_Cyc_assertions;
  private static final SubLSymbol $sym44$STRINGP;
  private static final SubLSymbol $kw45$SKIP;
  private static final SubLSymbol $sym46$CNF_P;
  private static final SubLSymbol $sym47$KEYHASH_P;
  private static final SubLString $str48$Rebuilding_the_Rule_Set;
  private static final SubLSymbol $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym52$CSETQ;
  private static final SubLString $str53$_A;
  private static final SubLSymbol $sym54$_NON_TRUE_ASSERTION_TV_CACHE_;
  private static final SubLSymbol $sym55$_PREFER_NON_TRUE_SET_OVER_FLAGS__;
  private static final SubLInteger $int56$1983;
  private static final SubLList $list57;
  private static final SubLString $str58$Rebuilding_the_non_true_assertion;
  private static final SubLSymbol $sym59$LISTP;
  private static final SubLSymbol $sym60$NON_DOTTED_LIST_P;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$CDESTRUCTURING_BIND;
  private static final SubLSymbol $sym63$_OPTIONAL;
  private static final SubLSymbol $kw64$ASSERT_INFO;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$VALID_ARGUMENT;
  private static final SubLSymbol $kw67$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym68$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw69$FORWARD;
  private static final SubLString $str70$Unexpected_formula_data_hook___S;
  private static final SubLSymbol $sym71$SET_CONTENTS_P;
  private static final SubLSymbol $sym72$ARGUMENT_P;
  private static final SubLSymbol $sym73$DEDUCTION_P;
  private static final SubLSymbol $sym74$TRUE;
  private static final SubLSymbol $sym75$RULE_ASSERTION_;
  private static final SubLSymbol $sym76$GAF_ASSERTION_;

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject assertion_content_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject assertion_content_p(final SubLObject v_object)
  {
    return assertion_content_holder.isInstance( v_object );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject as_content_formula_data(final SubLObject v_object)
  {
    assert NIL != assertion_content_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject as_content_mt(final SubLObject v_object)
  {
    assert NIL != assertion_content_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject as_content_flags(final SubLObject v_object)
  {
    assert NIL != assertion_content_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject as_content_arguments(final SubLObject v_object)
  {
    assert NIL != assertion_content_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject as_content_plist(final SubLObject v_object)
  {
    assert NIL != assertion_content_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject _csetf_as_content_formula_data(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != assertion_content_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject _csetf_as_content_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != assertion_content_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject _csetf_as_content_flags(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != assertion_content_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject _csetf_as_content_arguments(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != assertion_content_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject _csetf_as_content_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != assertion_content_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject make_assertion_content(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLStruct v_new = assertion_content_holder.makeNewInstance();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw20$FORMULA_DATA ) )
      {
        _csetf_as_content_formula_data( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$MT ) )
      {
        _csetf_as_content_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw22$FLAGS ) )
      {
        _csetf_as_content_flags( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$ARGUMENTS ) )
      {
        _csetf_as_content_arguments( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$PLIST ) )
      {
        _csetf_as_content_plist( v_new, current_value );
      }
      else
      {
        Errors.error( $str25$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject visit_defstruct_assertion_content(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw26$BEGIN, $sym27$MAKE_ASSERTION_CONTENT, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw20$FORMULA_DATA, as_content_formula_data( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw21$MT, as_content_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw22$FLAGS, as_content_flags( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw23$ARGUMENTS, as_content_arguments( obj ) );
    Functions.funcall( visitor_fn, obj, $kw28$SLOT, $kw24$PLIST, as_content_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw29$END, $sym27$MAKE_ASSERTION_CONTENT, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1508L)
  public static SubLObject visit_defstruct_object_assertion_content_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_assertion_content( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 1923L)
  public static SubLObject create_assertion_content(final SubLObject mt)
  {
    SubLObject assertion_content = NIL;
    assertion_content = make_assertion_content( UNPROVIDED );
    _csetf_as_content_formula_data( assertion_content, NIL );
    _csetf_as_content_mt( assertion_content, mt );
    _csetf_as_content_flags( assertion_content, $default_assertion_flags$.getGlobalValue() );
    _csetf_as_content_arguments( assertion_content, NIL );
    _csetf_as_content_plist( assertion_content, NIL );
    return assertion_content;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 2454L)
  public static SubLObject destroy_assertion_content(final SubLObject id)
  {
    final SubLObject assertion_content = assertion_manager.lookup_assertion_content( id );
    if( NIL != assertion_content_p( assertion_content ) )
    {
      assertion_manager.deregister_assertion_content( id );
      _csetf_as_content_formula_data( assertion_content, NIL );
      _csetf_as_content_mt( assertion_content, NIL );
      _csetf_as_content_flags( assertion_content, NIL );
      _csetf_as_content_arguments( assertion_content, NIL );
      _csetf_as_content_plist( assertion_content, NIL );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 2995L)
  public static SubLObject lookup_assertion_formula_data(final SubLObject id)
  {
    final SubLObject contents = assertion_manager.lookup_assertion_content( id );
    return ( ( NIL != contents ) ? as_content_formula_data( contents ) : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 3176L)
  public static SubLObject lookup_assertion_mt(final SubLObject id)
  {
    final SubLObject contents = assertion_manager.lookup_assertion_content( id );
    return ( ( NIL != contents ) ? as_content_mt( contents ) : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 3323L)
  public static SubLObject lookup_assertion_flags(final SubLObject id)
  {
    final SubLObject contents = assertion_manager.lookup_assertion_content( id );
    return ( ( NIL != contents ) ? as_content_flags( contents ) : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 3476L)
  public static SubLObject lookup_assertion_arguments(final SubLObject id)
  {
    final SubLObject contents = assertion_manager.lookup_assertion_content( id );
    return ( ( NIL != contents ) ? as_content_arguments( contents ) : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 3637L)
  public static SubLObject lookup_assertion_plist(final SubLObject id)
  {
    final SubLObject contents = assertion_manager.lookup_assertion_content( id );
    return ( ( NIL != contents ) ? as_content_plist( contents ) : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 3790L)
  public static SubLObject set_assertion_formula_data(final SubLObject id, final SubLObject new_formula_data)
  {
    _csetf_as_content_formula_data( assertion_manager.lookup_assertion_content( id ), new_formula_data );
    assertion_manager.mark_assertion_content_as_muted( id );
    return id;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 4002L)
  public static SubLObject set_assertion_flags(final SubLObject id, final SubLObject new_flags)
  {
    _csetf_as_content_flags( assertion_manager.lookup_assertion_content( id ), new_flags );
    assertion_manager.mark_assertion_content_as_muted( id );
    return id;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 4174L)
  public static SubLObject set_assertion_arguments(final SubLObject id, final SubLObject new_arguments)
  {
    _csetf_as_content_arguments( assertion_manager.lookup_assertion_content( id ), new_arguments );
    assertion_manager.mark_assertion_content_as_muted( id );
    return id;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 4362L)
  public static SubLObject set_assertion_plist(final SubLObject id, final SubLObject new_plist)
  {
    _csetf_as_content_plist( assertion_manager.lookup_assertion_content( id ), new_plist );
    assertion_manager.mark_assertion_content_as_muted( id );
    return id;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 4534L)
  public static SubLObject dump_assertion_content(final SubLObject assertion, final SubLObject stream)
  {
    cfasl.cfasl_output( assertion_formula_data( assertion ), stream );
    cfasl.cfasl_output( assertions_high.assertion_mt( assertion ), stream );
    cfasl.cfasl_output( assertion_flags( assertion ), stream );
    cfasl.cfasl_output( assertions_high.assertion_arguments( assertion ), stream );
    cfasl.cfasl_output( assertion_plist_for_dumping( assertion ), stream );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 5070L)
  public static SubLObject assertion_plist_for_dumping(final SubLObject assertion)
  {
    SubLObject result_plist = NIL;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = assertion_plist( assertion ); NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      if( property == $kw31$DEPENDENTS )
      {
        result_plist = conses_high.putf( result_plist, property, set_contents.set_contents_element_list( value ) );
      }
      else if( property != $kw32$INDEX )
      {
        result_plist = conses_high.putf( result_plist, property, value );
      }
    }
    return result_plist;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 5616L)
  public static SubLObject load_assertion_content(final SubLObject assertion, final SubLObject stream)
  {
    final SubLObject id = assertion_handles.assertion_id( assertion );
    final SubLObject formula_data = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject mt = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject flags = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject v_arguments = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject plist = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    load_assertion_content_int( id, formula_data, mt, flags, v_arguments, plist );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 6140L)
  public static SubLObject load_assertion_content_int(final SubLObject id, final SubLObject formula_data, final SubLObject mt, final SubLObject flags, final SubLObject v_arguments, final SubLObject plist)
  {
    final SubLObject assertion_content = create_assertion_content( mt );
    _csetf_as_content_formula_data( assertion_content, formula_data );
    _csetf_as_content_flags( assertion_content, flags );
    _csetf_as_content_arguments( assertion_content, v_arguments );
    _csetf_as_content_plist( assertion_content, plist );
    assertion_manager.register_assertion_content( id, assertion_content );
    return id;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 6613L)
  public static SubLObject assertion_cnf_internal(final SubLObject assertion)
  {
    final SubLObject hl_cnf = assertion_hl_cnf( assertion );
    if( NIL != clause_strucs.clause_struc_p( hl_cnf ) )
    {
      return clause_strucs.clause_struc_cnf( hl_cnf );
    }
    return hl_cnf;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 7055L)
  public static SubLObject possibly_assertion_cnf_internal(final SubLObject assertion)
  {
    return ( ( NIL != valid_assertion_with_contentP( assertion ) ) ? assertion_cnf_internal( assertion ) : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 7348L)
  public static SubLObject assertion_mt_internal(final SubLObject assertion)
  {
    return lookup_assertion_mt( assertion_handles.assertion_id( assertion ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 7581L)
  public static SubLObject assertion_gaf_hl_formula_internal(final SubLObject assertion)
  {
    if( NIL == assertion_gaf_p( assertion ) )
    {
      return NIL;
    }
    final SubLObject formula_data = assertion_formula_data( assertion );
    if( NIL != clause_strucs.clause_struc_p( formula_data ) )
    {
      return cnf_to_gaf_formula( clause_strucs.clause_struc_cnf( formula_data ) );
    }
    return formula_data;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 8032L)
  public static SubLObject assertion_cons_internal(final SubLObject assertion)
  {
    return ( NIL != assertion_gaf_p( assertion ) ) ? assertions_high.assertion_gaf_hl_formula( assertion ) : assertion_cnf_internal( assertion );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 8338L)
  public static SubLObject assertion_direction_internal(final SubLObject assertion)
  {
    return enumeration_types.decode_direction( assertion_flags_direction_code( assertion_flags( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 8624L)
  public static SubLObject assertion_truth_internal(final SubLObject assertion)
  {
    if( NIL == use_non_true_assertion_tv_cacheP() )
    {
      return enumeration_types.tv_truth( assertion_tv_internal( assertion ) );
    }
    final SubLObject possible_non_true_tv = assertion_non_true_tv( assertion );
    if( NIL != possible_non_true_tv )
    {
      return enumeration_types.tv_truth( possible_non_true_tv );
    }
    return $kw33$TRUE;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 9067L)
  public static SubLObject assertion_strength_internal(final SubLObject assertion)
  {
    return enumeration_types.tv_strength( assertion_tv( assertion ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 9304L)
  public static SubLObject assertion_tv(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != use_non_true_assertion_tv_cacheP() )
    {
      final SubLObject possible_non_true_tv = assertion_non_true_tv( assertion );
      if( NIL != possible_non_true_tv )
      {
        return possible_non_true_tv;
      }
    }
    return assertion_tv_internal( assertion );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 9756L)
  public static SubLObject assertion_tv_internal(final SubLObject assertion)
  {
    final SubLObject flags = assertion_flags( assertion );
    if( NIL == flags )
    {
      Errors.error( $str35$_a__assertion___a__has_null_flags, assertion, assertion_handles.assertion_id( assertion ) );
    }
    return enumeration_types.decode_tv( assertion_flags_tv_code( flags ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 10017L)
  public static SubLObject assertion_variable_names_internal(final SubLObject assertion)
  {
    return get_assertion_prop( assertion, $kw36$VARIABLE_NAMES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 10335L)
  public static SubLObject asserted_by_internal(final SubLObject assertion)
  {
    return ( ( NIL != assertions_high.asserted_assertionP( assertion ) ) ? assert_info_who( assertion_assert_info( assertion ) ) : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 10613L)
  public static SubLObject asserted_when_internal(final SubLObject assertion)
  {
    return ( ( NIL != assertions_high.asserted_assertionP( assertion ) ) ? assert_info_when( assertion_assert_info( assertion ) ) : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 10896L)
  public static SubLObject asserted_why_internal(final SubLObject assertion)
  {
    return ( ( NIL != assertions_high.asserted_assertionP( assertion ) ) ? assert_info_why( assertion_assert_info( assertion ) ) : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 11176L)
  public static SubLObject asserted_second_internal(final SubLObject assertion)
  {
    return ( ( NIL != assertions_high.asserted_assertionP( assertion ) ) ? assert_info_second( assertion_assert_info( assertion ) ) : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 11465L)
  public static SubLObject assertion_arguments_internal(final SubLObject assertion)
  {
    return lookup_assertion_arguments( assertion_handles.assertion_id( assertion ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 11719L)
  public static SubLObject assertion_dependents_internal(final SubLObject assertion)
  {
    SubLObject dependents = get_assertion_prop( assertion, $kw31$DEPENDENTS, UNPROVIDED );
    if( dependents.isList() && NIL != list_utilities.lengthG( dependents, $int37$256, UNPROVIDED ) )
    {
      dependents = keyhash_utilities.keyhash_list_elements( set_contents.set_contents_element_list( dependents ), EQL, UNPROVIDED );
      set_assertion_prop( assertion, $kw31$DEPENDENTS, dependents );
    }
    return dependents;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 12382L)
  public static SubLObject assertion_dependent_count_internal(final SubLObject assertion)
  {
    return set_contents.set_contents_size( get_assertion_prop( assertion, $kw31$DEPENDENTS, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 12587L)
  public static SubLObject assertion_has_dependents_p_internal(final SubLObject assertion)
  {
    return SubLObjectFactory.makeBoolean( NIL == set_contents.set_contents_emptyP( get_assertion_prop( assertion, $kw31$DEPENDENTS, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 12781L)
  public static SubLObject assertion_formula_data(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return lookup_assertion_formula_data( assertion_handles.assertion_id( assertion ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 13295L)
  public static SubLObject reset_assertion_formula_data(final SubLObject assertion, final SubLObject new_formula_data)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    set_assertion_formula_data( assertion_handles.assertion_id( assertion ), new_formula_data );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 13813L)
  public static SubLObject assertion_hl_cnf(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject formula_data = assertion_formula_data( assertion );
    if( NIL != clause_strucs.clause_struc_p( formula_data ) )
    {
      return formula_data;
    }
    if( NIL == formula_data )
    {
      return formula_data;
    }
    if( NIL == assertion_gaf_p( assertion ) )
    {
      return formula_data;
    }
    return gaf_formula_to_cnf( formula_data );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 14512L)
  public static SubLObject update_assertion_formula_data(final SubLObject assertion, final SubLObject new_formula_data)
  {
    if( NIL != clause_strucs.clause_struc_p( new_formula_data ) )
    {
      reset_assertion_clause_struc( assertion, new_formula_data );
    }
    else if( NIL == new_formula_data )
    {
      annihilate_assertion_formula_data( assertion );
    }
    else if( NIL != clauses.cnf_p( new_formula_data ) )
    {
      reset_assertion_cnf( assertion, new_formula_data );
    }
    else
    {
      if( NIL == el_utilities.el_formula_p( new_formula_data ) )
      {
        Errors.error( $str38$Unexpected_formula_data_type___S, new_formula_data );
        return NIL;
      }
      reset_assertion_gaf_formula( assertion, new_formula_data );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 15451L)
  public static SubLObject assertion_clause_struc(final SubLObject assertion)
  {
    final SubLObject formula_data = assertion_formula_data( assertion );
    return ( ( NIL != clause_strucs.clause_struc_p( formula_data ) ) ? formula_data : NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 15856L)
  public static SubLObject reset_assertion_cnf(final SubLObject assertion, final SubLObject new_cnf)
  {
    final SubLObject gafP = determine_cnf_gaf_p( new_cnf );
    reset_assertion_formula_data( assertion, ( NIL != gafP ) ? cnf_to_gaf_formula( new_cnf ) : new_cnf );
    set_assertion_gaf_p( assertion, gafP );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 16321L)
  public static SubLObject reset_assertion_clause_struc(final SubLObject assertion, final SubLObject new_clause_struc)
  {
    final SubLObject new_hl_cnf = clause_strucs.clause_struc_cnf( new_clause_struc );
    reset_assertion_formula_data( assertion, new_clause_struc );
    if( NIL == new_hl_cnf )
    {
      return annihilate_assertion_formula_data( assertion );
    }
    recompute_assertion_gaf_p( assertion );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 16833L)
  public static SubLObject reset_assertion_gaf_formula(final SubLObject assertion, final SubLObject new_gaf_formula)
  {
    reset_assertion_formula_data( assertion, new_gaf_formula );
    set_assertion_gaf_p( assertion, T );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 17192L)
  public static SubLObject annihilate_assertion_formula_data(final SubLObject assertion)
  {
    reset_assertion_formula_data( assertion, NIL );
    set_assertion_gaf_p( assertion, T );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 17476L)
  public static SubLObject assertion_flags(final SubLObject assertion)
  {
    final SubLObject flags = lookup_assertion_flags( assertion_handles.assertion_id( assertion ) );
    return flags;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 18134L)
  public static SubLObject reset_assertion_flags(final SubLObject assertion, final SubLObject new_flags)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject flags = assertion_flags( assertion );
    if( !flags.eql( new_flags ) )
    {
      set_assertion_flags( assertion_handles.assertion_id( assertion ), new_flags );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 18598L)
  public static SubLObject assertion_flags_gaf_code(final SubLObject flags)
  {
    return bytes.ldb( $assertion_flags_gaf_byte$.getGlobalValue(), flags );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 18695L)
  public static SubLObject set_assertion_flags_gaf_code(final SubLObject flags, final SubLObject code)
  {
    return bytes.dpb( code, $assertion_flags_gaf_byte$.getGlobalValue(), flags );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 18873L)
  public static SubLObject assertion_flags_direction_code(final SubLObject flags)
  {
    return bytes.ldb( $assertion_flags_direction_byte$.getGlobalValue(), flags );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 18982L)
  public static SubLObject set_assertion_flags_direction_code(final SubLObject flags, final SubLObject code)
  {
    return bytes.dpb( code, $assertion_flags_direction_byte$.getGlobalValue(), flags );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 19165L)
  public static SubLObject assertion_flags_tv_code(final SubLObject flags)
  {
    return bytes.ldb( $assertion_flags_tv_byte$.getGlobalValue(), flags );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 19260L)
  public static SubLObject set_assertion_flags_tv_code(final SubLObject flags, final SubLObject code)
  {
    return bytes.dpb( code, $assertion_flags_tv_byte$.getGlobalValue(), flags );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 19369L)
  public static SubLObject assertion_flags_gaf_p(final SubLObject assertion)
  {
    return Numbers.oddp( assertion_flags( assertion ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 19927L)
  public static SubLObject set_assertion_flags_gaf_p(final SubLObject assertion, final SubLObject gafP)
  {
    final SubLObject gaf_code = number_utilities.encode_boolean( gafP );
    if( NIL != gaf_code )
    {
      reset_assertion_flags( assertion, set_assertion_flags_gaf_code( assertion_flags( assertion ), gaf_code ) );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 20614L)
  public static SubLObject use_rule_setP()
  {
    return SubLObjectFactory.makeBoolean( NIL != $prefer_rule_set_over_flagsP$.getGlobalValue() && NIL != $rule_set$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 20821L)
  public static SubLObject setup_rule_set(final SubLObject estimated_assertion_size)
  {
    assert NIL != subl_promotions.non_negative_integer_p( estimated_assertion_size ) : estimated_assertion_size;
    final SubLObject estimated_rule_count = Numbers.ceiling( Numbers.divide( estimated_assertion_size, $estimated_assertions_per_rule$.getGlobalValue() ), UNPROVIDED );
    $rule_set$.setGlobalValue( keyhash.new_keyhash( estimated_rule_count, Symbols.symbol_function( EQL ) ) );
    return T;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 21422L)
  public static SubLObject kb_rule_set()
  {
    return $rule_set$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 21513L)
  public static SubLObject assertion_gaf_p(final SubLObject assertion)
  {
    if( NIL != use_rule_setP() && NIL != assertion_manager.assertion_content_cachable_p( assertion ) )
    {
      if( $rule_set$.getGlobalValue().isHashtable() )
      {
        return SubLObjectFactory.makeBoolean( NIL == Hashtables.gethash_without_values( assertion, $rule_set$.getGlobalValue(), NIL ) );
      }
      return SubLObjectFactory.makeBoolean( NIL == keyhash.getkeyhash( assertion, $rule_set$.getGlobalValue() ) );
    }
    else
    {
      if( NIL != assertion_handles.assertion_has_contentP( assertion ) )
      {
        return assertion_flags_gaf_p( assertion );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 22080L)
  public static SubLObject assertion_rule_p(final SubLObject assertion)
  {
    if( NIL != use_rule_setP() && NIL != assertion_manager.assertion_content_cachable_p( assertion ) )
    {
      if( $rule_set$.getGlobalValue().isHashtable() )
      {
        return Hashtables.gethash_without_values( assertion, $rule_set$.getGlobalValue(), NIL );
      }
      return keyhash.getkeyhash( assertion, $rule_set$.getGlobalValue() );
    }
    else
    {
      if( NIL != assertion_handles.assertion_has_contentP( assertion ) )
      {
        return SubLObjectFactory.makeBoolean( NIL == assertion_flags_gaf_p( assertion ) );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 22628L)
  public static SubLObject rule_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != keyhash.keyhash_p( $rule_set$.getGlobalValue() ) )
    {
      return keyhash.keyhash_count( $rule_set$.getGlobalValue() );
    }
    if( $rule_set$.getGlobalValue().isHashtable() )
    {
      return Hashtables.hash_table_count( $rule_set$.getGlobalValue() );
    }
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str43$mapping_Cyc_assertions;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$1 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$1, $kw45$SKIP ) )
        {
          final SubLObject idx_$2 = idx_$1;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$2, $kw45$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$2 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject ass;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw45$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != assertion_rule_p( ass ) )
                {
                  count = Numbers.add( count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$3 = idx_$1;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$3 ) || NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$3 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$3 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$3 );
            final SubLObject v_default = ( ( NIL != id_index.id_index_skip_tombstones_p( $kw45$SKIP ) ) ? NIL : $kw45$SKIP );
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != assertion_rule_p( ass2 ) )
                {
                  count = Numbers.add( count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 23042L)
  public static SubLObject gaf_count()
  {
    return Numbers.subtract( assertion_handles.assertion_count(), rule_count() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 23249L)
  public static SubLObject set_assertion_gaf_p(final SubLObject assertion, final SubLObject gafP)
  {
    if( NIL != keyhash.keyhash_p( $rule_set$.getGlobalValue() ) )
    {
      if( NIL != gafP )
      {
        keyhash.remkeyhash( assertion, $rule_set$.getGlobalValue() );
      }
      else
      {
        keyhash.setkeyhash( assertion, $rule_set$.getGlobalValue() );
      }
    }
    else if( $rule_set$.getGlobalValue().isHashtable() )
    {
      if( NIL != gafP )
      {
        Hashtables.remhash( assertion, $rule_set$.getGlobalValue() );
      }
      else
      {
        Hashtables.sethash( assertion, $rule_set$.getGlobalValue(), T );
      }
    }
    return set_assertion_flags_gaf_p( assertion, gafP );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 23831L)
  public static SubLObject possibly_rule_set_delete(final SubLObject assertion)
  {
    if( NIL != keyhash.keyhash_p( $rule_set$.getGlobalValue() ) )
    {
      if( NIL != assertion_rule_p( assertion ) )
      {
        return keyhash.remkeyhash( assertion, $rule_set$.getGlobalValue() );
      }
    }
    else if( $rule_set$.getGlobalValue().isHashtable() && NIL != assertion_rule_p( assertion ) )
    {
      return Hashtables.remhash( assertion, $rule_set$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 24126L)
  public static SubLObject recompute_assertion_gaf_p(final SubLObject assertion)
  {
    final SubLObject formula_data = assertion_formula_data( assertion );
    SubLObject gafP = NIL;
    if( NIL != clause_strucs.clause_struc_p( formula_data ) )
    {
      gafP = determine_cnf_gaf_p( clause_strucs.clause_struc_cnf( formula_data ) );
    }
    else if( NIL != clauses.cnf_p( formula_data ) )
    {
      gafP = determine_cnf_gaf_p( formula_data );
    }
    else
    {
      gafP = T;
    }
    return set_assertion_gaf_p( assertion, gafP );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 24837L)
  public static SubLObject determine_cnf_gaf_p(final SubLObject cnf)
  {
    assert NIL != clauses.cnf_p( cnf ) : cnf;
    return clauses.gaf_cnfP( cnf );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 25036L)
  public static SubLObject dump_rule_set_to_stream(final SubLObject stream)
  {
    SubLObject rule_set = $rule_set$.getGlobalValue();
    if( rule_set.isHashtable() )
    {
      rule_set = keyhash_utilities.hashtable_to_keyhash( rule_set );
    }
    assert NIL != keyhash.keyhash_p( rule_set ) : rule_set;
    return cfasl.cfasl_output( rule_set, stream );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 25483L)
  public static SubLObject load_rule_set_from_stream(final SubLObject stream)
  {
    final SubLObject rule_set = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    assert NIL != keyhash.keyhash_p( rule_set ) : rule_set;
    $rule_set$.setGlobalValue( rule_set );
    return rule_count();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 25947L)
  public static SubLObject rebuild_rule_set()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    setup_rule_set( assertion_handles.assertion_count() );
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str48$Rebuilding_the_Rule_Set;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$5 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$5, $kw45$SKIP ) )
        {
          final SubLObject idx_$6 = idx_$5;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$6, $kw45$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$6 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject rule;
            SubLObject message_var;
            SubLObject was_appendingP;
            SubLObject _prev_bind_0_$7;
            SubLObject _prev_bind_0_$8;
            SubLObject _values;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw45$SKIP;
                }
                rule = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                message_var = NIL;
                was_appendingP = Eval.eval( $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
                Eval.eval( $list50 );
                try
                {
                  try
                  {
                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    _prev_bind_0_$7 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( $sym51$CATCH_ERROR_MESSAGE_HANDLER, thread );
                      try
                      {
                        if( NIL != assertion_handles.assertion_handle_validP( rule ) && NIL == assertion_flags_gaf_p( rule ) )
                        {
                          if( $rule_set$.getGlobalValue().isHashtable() )
                          {
                            Hashtables.sethash( rule, $rule_set$.getGlobalValue(), T );
                          }
                          else
                          {
                            keyhash.setkeyhash( rule, $rule_set$.getGlobalValue() );
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
                      Errors.$error_handler$.rebind( _prev_bind_0_$7, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var )
                  {
                    message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                }
                finally
                {
                  _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    _values = Values.getValuesAsVector();
                    Eval.eval( ConsesLow.list( $sym52$CSETQ, $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
                  }
                }
                if( message_var.isString() )
                {
                  Errors.warn( $str53$_A, message_var );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$7 = idx_$5;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$7 ) || NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$7 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$7 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$7 );
            final SubLObject v_default = ( ( NIL != id_index.id_index_skip_tombstones_p( $kw45$SKIP ) ) ? NIL : $kw45$SKIP );
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject rule2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                SubLObject message_var2 = NIL;
                final SubLObject was_appendingP2 = Eval.eval( $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
                Eval.eval( $list50 );
                try
                {
                  try
                  {
                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( $sym51$CATCH_ERROR_MESSAGE_HANDLER, thread );
                      try
                      {
                        if( NIL != assertion_handles.assertion_handle_validP( rule2 ) && NIL == assertion_flags_gaf_p( rule2 ) )
                        {
                          if( $rule_set$.getGlobalValue().isHashtable() )
                          {
                            Hashtables.sethash( rule2, $rule_set$.getGlobalValue(), T );
                          }
                          else
                          {
                            keyhash.setkeyhash( rule2, $rule_set$.getGlobalValue() );
                          }
                        }
                      }
                      catch( final Throwable catch_var2 )
                      {
                        Errors.handleThrowable( catch_var2, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$9, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var2 )
                  {
                    message_var2 = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    Eval.eval( ConsesLow.list( $sym52$CSETQ, $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP2 ) );
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                  }
                }
                if( message_var2.isString() )
                {
                  Errors.warn( $str53$_A, message_var2 );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return rule_count();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 26432L)
  public static SubLObject gaf_formula_to_cnf(final SubLObject gaf)
  {
    return clause_utilities.make_gaf_cnf( gaf );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 26666L)
  public static SubLObject cnf_to_gaf_formula(final SubLObject cnf)
  {
    return clause_utilities.gaf_cnf_literal( cnf );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 26975L)
  public static SubLObject kb_set_assertion_direction_internal(final SubLObject assertion, final SubLObject new_direction)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      reset_assertion_direction( assertion, new_direction );
    }
    else
    {
      kb_indexing.remove_assertion_indices( assertion, UNPROVIDED );
      reset_assertion_direction( assertion, new_direction );
      kb_indexing.add_assertion_indices( assertion, UNPROVIDED );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 27491L)
  public static SubLObject reset_assertion_direction(final SubLObject assertion, final SubLObject new_direction)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject direction_code = enumeration_types.encode_direction( new_direction );
    if( NIL != direction_code )
    {
      reset_assertion_flags( assertion, set_assertion_flags_direction_code( assertion_flags( assertion ), direction_code ) );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 27896L)
  public static SubLObject reset_assertion_tv(final SubLObject assertion, final SubLObject new_tv)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject tv_code = enumeration_types.encode_tv( new_tv );
    if( NIL != tv_code )
    {
      reset_assertion_flags( assertion, set_assertion_flags_tv_code( assertion_flags( assertion ), tv_code ) );
    }
    set_assertion_non_true_cache_tv( assertion, new_tv );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 28442L)
  public static SubLObject reset_assertion_truth(final SubLObject assertion, final SubLObject new_truth)
  {
    final SubLObject existing_strength = assertions_high.assertion_strength( assertion );
    final SubLObject new_tv = enumeration_types.tv_from_truth_strength( new_truth, existing_strength );
    return reset_assertion_tv( assertion, new_tv );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 28804L)
  public static SubLObject reset_assertion_strength(final SubLObject assertion, final SubLObject new_strength)
  {
    final SubLObject existing_truth = assertions_high.assertion_truth( assertion );
    final SubLObject new_tv = enumeration_types.tv_from_truth_strength( existing_truth, new_strength );
    return reset_assertion_tv( assertion, new_tv );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 29670L)
  public static SubLObject use_non_true_assertion_tv_cacheP()
  {
    return SubLObjectFactory.makeBoolean( NIL != $prefer_non_true_set_over_flagsP$.getGlobalValue() && NIL != $non_true_assertion_tv_cache$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 29925L)
  public static SubLObject setup_non_true_assertion_tv_cache(final SubLObject estimated_assertion_size)
  {
    assert NIL != subl_promotions.non_negative_integer_p( estimated_assertion_size ) : estimated_assertion_size;
    final SubLObject estimated_non_true_count = Numbers.ceiling( Numbers.divide( estimated_assertion_size, $estimated_assertions_per_non_true$.getGlobalValue() ), UNPROVIDED );
    $non_true_assertion_tv_cache$.setGlobalValue( Hashtables.make_hash_table( estimated_non_true_count, Symbols.symbol_function( EQL ), $list57 ) );
    return T;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 30468L)
  public static SubLObject kb_non_true_assertion_tv_cache()
  {
    return $non_true_assertion_tv_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 30572L)
  public static SubLObject assertion_true_p(final SubLObject assertion)
  {
    if( NIL != use_non_true_assertion_tv_cacheP() && NIL != assertion_manager.assertion_content_cachable_p( assertion ) )
    {
      return SubLObjectFactory.makeBoolean( NIL == Hashtables.gethash_without_values( assertion, $non_true_assertion_tv_cache$.getGlobalValue(), UNPROVIDED ) );
    }
    if( NIL != assertion_handles.assertion_has_contentP( assertion ) )
    {
      return Equality.eq( $kw33$TRUE, enumeration_types.tv_truth( assertion_tv_internal( assertion ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 31102L)
  public static SubLObject assertion_non_true_tv(final SubLObject assertion)
  {
    if( NIL != use_non_true_assertion_tv_cacheP() && NIL != assertion_manager.assertion_content_cachable_p( assertion ) )
    {
      return Hashtables.gethash( assertion, $non_true_assertion_tv_cache$.getGlobalValue(), UNPROVIDED );
    }
    if( NIL != assertion_handles.assertion_has_contentP( assertion ) )
    {
      final SubLObject tv = assertion_tv_internal( assertion );
      return ( ( $kw33$TRUE == enumeration_types.tv_truth( tv ) ) ? NIL : tv );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 31646L)
  public static SubLObject non_true_assertion_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $non_true_assertion_tv_cache$.getGlobalValue().isHashtable() )
    {
      return Hashtables.hash_table_count( $non_true_assertion_tv_cache$.getGlobalValue() );
    }
    SubLObject count = ZERO_INTEGER;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str43$mapping_Cyc_assertions;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$13 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$13, $kw45$SKIP ) )
        {
          final SubLObject idx_$14 = idx_$13;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$14, $kw45$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$14 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject ass;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw45$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != assertion_non_true_tv( ass ) )
                {
                  count = Numbers.add( count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$15 = idx_$13;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$15 ) || NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$15 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$15 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$15 );
            final SubLObject v_default = ( ( NIL != id_index.id_index_skip_tombstones_p( $kw45$SKIP ) ) ? NIL : $kw45$SKIP );
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != assertion_non_true_tv( ass2 ) )
                {
                  count = Numbers.add( count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 32056L)
  public static SubLObject true_assertion_count()
  {
    return Numbers.subtract( assertion_handles.assertion_count(), non_true_assertion_count() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 32289L)
  public static SubLObject set_assertion_non_true_cache_tv(final SubLObject assertion, final SubLObject tv)
  {
    if( NIL != use_non_true_assertion_tv_cacheP() )
    {
      if( NIL != enumeration_types.tv_trueP( tv ) )
      {
        Hashtables.remhash( assertion, $non_true_assertion_tv_cache$.getGlobalValue() );
      }
      else
      {
        Hashtables.sethash( assertion, $non_true_assertion_tv_cache$.getGlobalValue(), tv );
      }
    }
    return tv;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 32809L)
  public static SubLObject possibly_non_true_assertion_tv_cache_delete(final SubLObject assertion)
  {
    if( NIL != assertion_non_true_tv( assertion ) )
    {
      return Hashtables.remhash( assertion, $non_true_assertion_tv_cache$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 32987L)
  public static SubLObject dump_non_true_assertion_tv_cache_to_stream(final SubLObject stream)
  {
    return cfasl.cfasl_output( $non_true_assertion_tv_cache$.getGlobalValue(), stream );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 33283L)
  public static SubLObject load_non_true_assertion_tv_cache_from_stream(final SubLObject stream)
  {
    final SubLObject non_true_assertion_tv_cache = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( non_true_assertion_tv_cache.isHashtable() )
    {
      $non_true_assertion_tv_cache$.setGlobalValue( non_true_assertion_tv_cache );
      return non_true_assertion_count();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 33744L)
  public static SubLObject rebuild_non_true_assertion_tv_cache()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    setup_non_true_assertion_tv_cache( assertion_handles.assertion_count() );
    final SubLObject old_prefer_non_true_set_over_flagsP = $prefer_non_true_set_over_flagsP$.getGlobalValue();
    try
    {
      $prefer_non_true_set_over_flagsP$.setGlobalValue( NIL );
      final SubLObject idx = assertion_handles.do_assertions_table();
      final SubLObject mess = $str58$Rebuilding_the_non_true_assertion;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$17 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$17, $kw45$SKIP ) )
          {
            final SubLObject idx_$18 = idx_$17;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$18, $kw45$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$18 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject a_id;
              SubLObject a_handle;
              SubLObject a;
              SubLObject message_var;
              SubLObject was_appendingP;
              SubLObject _prev_bind_0_$19;
              SubLObject _prev_bind_0_$20;
              SubLObject _values;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                a_handle = Vectors.aref( vector_var, a_id );
                if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                  {
                    a_handle = $kw45$SKIP;
                  }
                  a = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                  message_var = NIL;
                  was_appendingP = Eval.eval( $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
                  Eval.eval( $list50 );
                  try
                  {
                    try
                    {
                      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                      _prev_bind_0_$19 = Errors.$error_handler$.currentBinding( thread );
                      try
                      {
                        Errors.$error_handler$.bind( $sym51$CATCH_ERROR_MESSAGE_HANDLER, thread );
                        try
                        {
                          if( NIL != assertion_handles.assertion_handle_validP( a ) && NIL == assertion_utilities.true_assertionP( a ) )
                          {
                            Hashtables.sethash( a, $non_true_assertion_tv_cache$.getGlobalValue(), assertion_tv_internal( a ) );
                          }
                        }
                        catch( final Throwable catch_var )
                        {
                          Errors.handleThrowable( catch_var, NIL );
                        }
                      }
                      finally
                      {
                        Errors.$error_handler$.rebind( _prev_bind_0_$19, thread );
                      }
                    }
                    catch( final Throwable ccatch_env_var )
                    {
                      message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                  }
                  finally
                  {
                    _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      _values = Values.getValuesAsVector();
                      Eval.eval( ConsesLow.list( $sym52$CSETQ, $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
                    }
                  }
                  if( message_var.isString() )
                  {
                    Errors.warn( $str53$_A, message_var );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$19 = idx_$17;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$19 ) || NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$19 );
              SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$19 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$19 );
              final SubLObject v_default = ( ( NIL != id_index.id_index_skip_tombstones_p( $kw45$SKIP ) ) ? NIL : $kw45$SKIP );
              while ( a_id2.numL( end_id ))
              {
                final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw45$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                {
                  final SubLObject a2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                  SubLObject message_var2 = NIL;
                  final SubLObject was_appendingP2 = Eval.eval( $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
                  Eval.eval( $list50 );
                  try
                  {
                    try
                    {
                      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                      final SubLObject _prev_bind_0_$21 = Errors.$error_handler$.currentBinding( thread );
                      try
                      {
                        Errors.$error_handler$.bind( $sym51$CATCH_ERROR_MESSAGE_HANDLER, thread );
                        try
                        {
                          if( NIL != assertion_handles.assertion_handle_validP( a2 ) && NIL == assertion_utilities.true_assertionP( a2 ) )
                          {
                            Hashtables.sethash( a2, $non_true_assertion_tv_cache$.getGlobalValue(), assertion_tv_internal( a2 ) );
                          }
                        }
                        catch( final Throwable catch_var2 )
                        {
                          Errors.handleThrowable( catch_var2, NIL );
                        }
                      }
                      finally
                      {
                        Errors.$error_handler$.rebind( _prev_bind_0_$21, thread );
                      }
                    }
                    catch( final Throwable ccatch_env_var2 )
                    {
                      message_var2 = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      Eval.eval( ConsesLow.list( $sym52$CSETQ, $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP2 ) );
                      Values.restoreValuesFromVector( _values2 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
                    }
                  }
                  if( message_var2.isString() )
                  {
                    Errors.warn( $str53$_A, message_var2 );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                a_id2 = Numbers.add( a_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values4 = Values.getValuesAsVector();
        $prefer_non_true_set_over_flagsP$.setGlobalValue( old_prefer_non_true_set_over_flagsP );
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return rule_count();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 34499L)
  public static SubLObject assertion_plist(final SubLObject assertion)
  {
    return lookup_assertion_plist( assertion_handles.assertion_id( assertion ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 34857L)
  public static SubLObject reset_assertion_plist(final SubLObject assertion, final SubLObject plist)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != Types.listp( plist ) : plist;
    set_assertion_plist( assertion_handles.assertion_id( assertion ), plist );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 35105L)
  public static SubLObject get_assertion_prop(final SubLObject assertion, final SubLObject indicator, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    return conses_high.getf( assertion_plist( assertion ), indicator, v_default );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 35243L)
  public static SubLObject set_assertion_prop(final SubLObject assertion, final SubLObject indicator, final SubLObject value)
  {
    final SubLObject old_plist = assertion_plist( assertion );
    final SubLObject new_plist = conses_high.putf( old_plist, indicator, value );
    reset_assertion_plist( assertion, new_plist );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 35472L)
  public static SubLObject rem_assertion_prop(final SubLObject assertion, final SubLObject indicator)
  {
    final SubLObject old_plist = assertion_plist( assertion );
    final SubLObject new_plist = conses_high.remf( old_plist, indicator );
    reset_assertion_plist( assertion, new_plist );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 35689L)
  public static SubLObject reset_assertion_variable_names(final SubLObject assertion, final SubLObject new_variable_names)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != list_utilities.non_dotted_list_p( new_variable_names ) : new_variable_names;
    SubLObject cdolist_list_var = new_variable_names;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    if( NIL != new_variable_names )
    {
      set_assertion_prop( assertion, $kw36$VARIABLE_NAMES, new_variable_names );
    }
    else
    {
      rem_assertion_prop( assertion, $kw36$VARIABLE_NAMES );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 36259L)
  public static SubLObject does_assertion_have_meta_assertionsP(final SubLObject assertion)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 36487L)
  public static SubLObject all_meta_assertions_for_assertion(final SubLObject assertion)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 36698L)
  public static SubLObject assertion_index(final SubLObject assertion)
  {
    return kb_indexing_datastructures.assertion_indexing_store_get( assertion );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 36963L)
  public static SubLObject assertion_index_swapped_inP(final SubLObject assertion)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 37234L)
  public static SubLObject reset_assertion_index(final SubLObject assertion, final SubLObject new_index)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( new_index.eql( kb_indexing_datastructures.new_simple_index() ) )
    {
      kb_indexing_datastructures.assertion_indexing_store_remove( assertion );
    }
    else
    {
      kb_indexing_datastructures.assertion_indexing_store_set( assertion, new_index );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 37702L)
  public static SubLObject clear_assertion_index(final SubLObject assertion)
  {
    return reset_assertion_index( assertion, kb_indexing_datastructures.new_simple_index() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 38001L)
  public static SubLObject destructure_assert_info(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject who = NIL;
    SubLObject when = NIL;
    SubLObject why = NIL;
    SubLObject second = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    who = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    when = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    why = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    second = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject assert_info = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
      assert_info = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym62$CDESTRUCTURING_BIND, ConsesLow.list( $sym63$_OPTIONAL, who, when, why, second ), assert_info, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list61 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 38201L)
  public static SubLObject assertion_assert_info(final SubLObject assertion)
  {
    final SubLObject assert_info = get_assertion_prop( assertion, $kw64$ASSERT_INFO, UNPROVIDED );
    if( NIL != assert_info )
    {
      return assert_info;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 38551L)
  public static SubLObject reset_assertion_assert_info(final SubLObject assertion, final SubLObject new_info)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != new_info )
    {
      set_assertion_prop( assertion, $kw64$ASSERT_INFO, new_info );
    }
    else
    {
      rem_assertion_prop( assertion, $kw64$ASSERT_INFO );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 39012L)
  public static SubLObject asserted_assertion_timestampedP(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != assertions_high.asserted_assertionP( assertion ) )
    {
      return list_utilities.sublisp_boolean( assertion_assert_info( assertion ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 39342L)
  public static SubLObject make_assert_info(SubLObject who, SubLObject when, SubLObject why, SubLObject second)
  {
    if( who == UNPROVIDED )
    {
      who = NIL;
    }
    if( when == UNPROVIDED )
    {
      when = NIL;
    }
    if( why == UNPROVIDED )
    {
      why = NIL;
    }
    if( second == UNPROVIDED )
    {
      second = NIL;
    }
    if( NIL != second )
    {
      return ConsesLow.list( who, when, why, second );
    }
    if( NIL != why )
    {
      return ConsesLow.list( who, when, why );
    }
    if( NIL != when )
    {
      return ConsesLow.list( who, when );
    }
    if( NIL != who )
    {
      return ConsesLow.list( who );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 39724L)
  public static SubLObject assert_info_who(final SubLObject assert_info)
  {
    return assert_info.first();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 39948L)
  public static SubLObject assert_info_when(final SubLObject assert_info)
  {
    return conses_high.second( assert_info );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 40175L)
  public static SubLObject assert_info_why(final SubLObject assert_info)
  {
    return conses_high.third( assert_info );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 40399L)
  public static SubLObject assert_info_second(final SubLObject assert_info)
  {
    return conses_high.fourth( assert_info );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 40630L)
  public static SubLObject set_assertion_asserted_by(final SubLObject assertion, final SubLObject assertor)
  {
    SubLObject current;
    final SubLObject datum = current = assertion_assert_info( assertion );
    final SubLObject who = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject when = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject why = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject second = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    if( NIL == current )
    {
      return reset_assertion_assert_info( assertion, make_assert_info( assertor, when, why, second ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 41026L)
  public static SubLObject set_assertion_asserted_when(final SubLObject assertion, final SubLObject universal_date)
  {
    SubLObject current;
    final SubLObject datum = current = assertion_assert_info( assertion );
    final SubLObject who = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject when = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject why = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject second = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    if( NIL == current )
    {
      return reset_assertion_assert_info( assertion, make_assert_info( who, universal_date, why, second ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 41439L)
  public static SubLObject set_assertion_asserted_why(final SubLObject assertion, final SubLObject reason)
  {
    SubLObject current;
    final SubLObject datum = current = assertion_assert_info( assertion );
    final SubLObject who = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject when = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject why = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject second = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    if( NIL == current )
    {
      return reset_assertion_assert_info( assertion, make_assert_info( who, when, reason, second ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 41833L)
  public static SubLObject set_assertion_asserted_second(final SubLObject assertion, final SubLObject universal_second)
  {
    SubLObject current;
    final SubLObject datum = current = assertion_assert_info( assertion );
    final SubLObject who = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject when = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject why = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    final SubLObject second = ( current.isCons() ? current.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list65 );
    current = current.rest();
    if( NIL == current )
    {
      return reset_assertion_assert_info( assertion, make_assert_info( who, when, why, universal_second ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 42256L)
  public static SubLObject valid_assertion_robustP(final SubLObject assertion)
  {
    if( NIL != assertion_handles.assertion_p( assertion ) && NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
    {
      final SubLObject v_arguments = assertions_high.assertion_arguments( assertion );
      final SubLObject dependents = assertions_high.assertion_dependents( assertion );
      final SubLObject vnames = assertion_variable_names_internal( assertion );
      final SubLObject index = assertion_index( assertion );
      return SubLObjectFactory.makeBoolean( NIL != hlmt.valid_hlmt_p( assertion_mt_internal( assertion ), UNPROVIDED ) && NIL != enumeration_types.tv_p( assertion_tv( assertion ) ) && v_arguments.isCons()
          && NIL != list_utilities.every_in_list( Symbols.symbol_function( $sym66$VALID_ARGUMENT ), v_arguments, UNPROVIDED ) && NIL != set_contents.set_contents_p( dependents ) && NIL != list_utilities.every_in_list(
              Symbols.symbol_function( $sym66$VALID_ARGUMENT ), set_contents.set_contents_element_list( dependents ), UNPROVIDED ) && vnames.isList() && NIL != list_utilities.every_in_list( Symbols.symbol_function(
                  $sym44$STRINGP ), vnames, UNPROVIDED ) && NIL != enumeration_types.direction_p( assertions_high.assertion_direction( assertion ) ) && NIL != kb_indexing_datastructures.index_installed_p( index ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 43426L)
  public static SubLObject valid_assertion_with_contentP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = assertion_handles.assertion_id( assertion );
    SubLObject content = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw67$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym68$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          content = assertion_manager.lookup_assertion_content( id );
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
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw67$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return list_utilities.sublisp_boolean( content );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 43804L)
  public static SubLObject kb_create_assertion_kb_store(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength,
      final SubLObject asserted_argument)
  {
    SubLObject assertion = kb_indexing.find_assertion_internal( cnf, mt );
    if( NIL != assertion )
    {
      return assertion_handles.assertion_id( assertion );
    }
    final SubLObject internal_id = assertion_handles.make_assertion_id();
    assertion = assertion_handles.make_assertion_shell( internal_id );
    kb_create_assertion_int( assertion, internal_id, cnf, mt, variable_names, direction, truth, strength, asserted_argument );
    return internal_id;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 44744L)
  public static SubLObject kb_create_assertion_int(final SubLObject assertion, final SubLObject internal_id, final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction,
      final SubLObject truth, final SubLObject strength, final SubLObject asserted_argument)
  {
    final SubLObject assertion_content = create_assertion_content( mt );
    assertion_manager.register_assertion_content( internal_id, assertion_content );
    reset_assertion_variable_names( assertion, variable_names );
    reset_assertion_tv( assertion, enumeration_types.tv_from_truth_strength( truth, strength ) );
    final SubLObject formula_data_hook = find_cnf_formula_data_hook( cnf );
    connect_assertion( assertion, formula_data_hook );
    kb_set_assertion_direction_internal( assertion, direction );
    if( NIL != asserted_argument )
    {
      add_new_assertion_argument( assertion, asserted_argument );
    }
    if( direction == $kw69$FORWARD )
    {
      forward.queue_forward_assertion( assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 45631L)
  public static SubLObject kb_create_assertion_cyc(final SubLObject internal_id)
  {
    final SubLObject assertion = assertion_handles.find_assertion_by_id( internal_id );
    return ( NIL != assertion ) ? assertion : assertion_handles.make_assertion_shell( internal_id );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 45939L)
  public static SubLObject find_cnf_formula_data_hook(final SubLObject cnf)
  {
    if( NIL != clauses.gaf_cnfP( cnf ) )
    {
      return find_gaf_formula_hook( clause_utilities.gaf_cnf_literal( cnf ) );
    }
    return find_hl_cnf_hook( cnf );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 46903L)
  public static SubLObject find_hl_cnf_hook(final SubLObject cnf)
  {
    final SubLObject assertion = kb_indexing.find_assertion_any_mt( cnf );
    if( NIL != assertion )
    {
      final SubLObject clause_struc = assertion_clause_struc( assertion );
      return ( NIL != clause_struc ) ? clause_struc : assertion;
    }
    return cnf;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 47158L)
  public static SubLObject find_gaf_formula_hook(final SubLObject gaf)
  {
    final SubLObject assertion = kb_indexing.find_gaf_any_mt( gaf );
    if( NIL != assertion )
    {
      final SubLObject clause_struc = assertion_clause_struc( assertion );
      return ( NIL != clause_struc ) ? clause_struc : assertion;
    }
    return gaf;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 47408L)
  public static SubLObject connect_assertion(final SubLObject assertion, final SubLObject formula_data_hook)
  {
    connect_assertion_formula_data( assertion, formula_data_hook );
    kb_indexing.add_assertion_indices( assertion, UNPROVIDED );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 47663L)
  public static SubLObject connect_assertion_formula_data(final SubLObject assertion, final SubLObject formula_data_hook)
  {
    SubLObject formula_data = formula_data_hook;
    if( NIL != clause_strucs.clause_struc_p( formula_data_hook ) )
    {
      clause_strucs.add_clause_struc_assertion( formula_data_hook, assertion );
    }
    else if( NIL != assertion_handles.assertion_p( formula_data_hook ) )
    {
      final SubLObject cnf = assertions_high.assertion_cnf( formula_data_hook );
      final SubLObject new_clause_struc = clause_strucs.create_clause_struc( cnf );
      clause_strucs.add_clause_struc_assertion( new_clause_struc, formula_data_hook );
      clause_strucs.add_clause_struc_assertion( new_clause_struc, assertion );
      formula_data = new_clause_struc;
      reset_assertion_clause_struc( formula_data_hook, formula_data );
    }
    else if( NIL == clauses.cnf_p( formula_data_hook ) )
    {
      if( NIL == el_utilities.el_formula_p( formula_data_hook ) )
      {
        Errors.error( $str70$Unexpected_formula_data_hook___S, formula_data_hook );
        return NIL;
      }
    }
    update_assertion_formula_data( assertion, formula_data );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 49043L)
  public static SubLObject kb_remove_assertion_internal(final SubLObject assertion)
  {
    final SubLObject id = assertion_handles.assertion_id( assertion );
    disconnect_assertion( assertion );
    destroy_assertion_content( id );
    assertion_handles.deregister_assertion_id( id );
    assertion_handles.free_assertion( assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 49538L)
  public static SubLObject reconnect_assertion(final SubLObject assertion, final SubLObject new_cnf)
  {
    disconnect_assertion( assertion );
    final SubLObject hl_cnf_hook = find_hl_cnf_hook( new_cnf );
    connect_assertion( assertion, hl_cnf_hook );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 49946L)
  public static SubLObject disconnect_assertion(final SubLObject assertion)
  {
    kb_indexing.remove_assertion_indices( assertion, UNPROVIDED );
    disconnect_assertion_formula_data( assertion );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 50328L)
  public static SubLObject disconnect_assertion_formula_data(final SubLObject assertion)
  {
    final SubLObject clause_struc = assertion_clause_struc( assertion );
    if( NIL != clause_struc )
    {
      clause_strucs.remove_clause_struc_assertion( clause_struc, assertion );
    }
    annihilate_assertion_formula_data( assertion );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 50605L)
  public static SubLObject add_new_assertion_argument(final SubLObject assertion, final SubLObject new_argument)
  {
    set_assertion_arguments( assertion_handles.assertion_id( assertion ), ConsesLow.cons( new_argument, assertions_high.assertion_arguments( assertion ) ) );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 51198L)
  public static SubLObject remove_assertion_argument(final SubLObject assertion, final SubLObject argument)
  {
    set_assertion_arguments( assertion_handles.assertion_id( assertion ), list_utilities.delete_first( argument, assertions_high.assertion_arguments( assertion ), UNPROVIDED ) );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 51526L)
  public static SubLObject reset_assertion_dependents(final SubLObject assertion, final SubLObject new_dependents)
  {
    assert NIL != set_contents.set_contents_p( new_dependents ) : new_dependents;
    if( NIL != new_dependents )
    {
      set_assertion_prop( assertion, $kw31$DEPENDENTS, new_dependents );
    }
    else
    {
      rem_assertion_prop( assertion, $kw31$DEPENDENTS );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 52022L)
  public static SubLObject add_assertion_dependent(final SubLObject assertion, final SubLObject argument)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != arguments.argument_p( argument ) : argument;
    reset_assertion_dependents( assertion, set_contents.set_contents_add( argument, assertion_dependents_internal( assertion ), UNPROVIDED ) );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 52495L)
  public static SubLObject remove_assertion_dependent(final SubLObject assertion, final SubLObject argument)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != arguments.argument_p( argument ) : argument;
    reset_assertion_dependents( assertion, set_contents.set_contents_delete( argument, assertion_dependents_internal( assertion ), UNPROVIDED ) );
    return assertion;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 53122L)
  public static SubLObject assertion_dependencies(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject assertions = NIL;
    SubLObject deductions = NIL;
    final SubLObject dependent_count = set_contents.set_contents_size( assertion_dependents_internal( assertion ) );
    final SubLObject _prev_bind_0 = $dependent_assertion_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $dependent_deduction_table$.currentBinding( thread );
    try
    {
      $dependent_assertion_table$.bind( Hashtables.make_hash_table( Numbers.integerDivide( dependent_count, TWO_INTEGER ), UNPROVIDED, UNPROVIDED ), thread );
      $dependent_deduction_table$.bind( Hashtables.make_hash_table( dependent_count, UNPROVIDED, UNPROVIDED ), thread );
      mark_dependent_assertion( assertion );
      assertions = $dependent_assertion_table$.getDynamicValue( thread );
      deductions = $dependent_deduction_table$.getDynamicValue( thread );
    }
    finally
    {
      $dependent_deduction_table$.rebind( _prev_bind_2, thread );
      $dependent_assertion_table$.rebind( _prev_bind_0, thread );
    }
    return Values.values( assertions, deductions );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 53900L)
  public static SubLObject mark_dependent_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Hashtables.gethash( assertion, $dependent_assertion_table$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( assertion, $dependent_assertion_table$.getDynamicValue( thread ), T );
      final SubLObject set_contents_var = assertion_dependents_internal( assertion );
      SubLObject basis_object;
      SubLObject state;
      SubLObject deduction;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        deduction = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) )
        {
          mark_dependent_deduction( deduction );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 54268L)
  public static SubLObject mark_dependent_deduction(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    if( NIL == Hashtables.gethash( deduction, $dependent_deduction_table$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( deduction, $dependent_deduction_table$.getDynamicValue( thread ), T );
      final SubLObject supported_object = deductions_high.deduction_supported_object( deduction );
      if( NIL != assertion_handles.assertion_p( supported_object ) )
      {
        SubLObject witness = NIL;
        if( NIL == witness )
        {
          SubLObject csome_list_var = assertion_arguments_internal( supported_object );
          SubLObject argument = NIL;
          argument = csome_list_var.first();
          while ( NIL == witness && NIL != csome_list_var)
          {
            if( NIL != arguments.belief_p( argument ) || NIL == Hashtables.gethash( deduction, $dependent_deduction_table$.getDynamicValue( thread ), UNPROVIDED ) )
            {
              witness = argument;
            }
            csome_list_var = csome_list_var.rest();
            argument = csome_list_var.first();
          }
        }
        if( NIL == witness )
        {
          mark_dependent_assertion( supported_object );
        }
      }
      else if( NIL != kb_hl_support_handles.kb_hl_support_p( supported_object ) )
      {
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 55328L)
  public static SubLObject verify_assertion_content_table(SubLObject repairP)
  {
    if( repairP == UNPROVIDED )
    {
      repairP = NIL;
    }
    return assertion_manager.verify_assertion_content_table_int( $sym1$ASSERTION_CONTENT_P, repairP );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 55606L)
  public static SubLObject random_assertion_internal(SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym74$TRUE );
    }
    if( assertion_handles.assertion_count().numG( ZERO_INTEGER ) )
    {
      final SubLObject max_id = assertion_handles.next_assertion_id();
      SubLObject v_answer;
      SubLObject candidate;
      for( v_answer = NIL; NIL == v_answer; v_answer = candidate )
      {
        candidate = assertion_handles.find_assertion_by_id( random.random( max_id ) );
        if( NIL != candidate && NIL != Functions.funcall( test, candidate ) )
        {
        }
      }
      return v_answer;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 56001L)
  public static SubLObject random_rule_internal()
  {
    final SubLObject rule_set = kb_rule_set();
    if( NIL != keyhash.keyhash_p( rule_set ) )
    {
      return keyhash.keyhash_random_key( rule_set );
    }
    return assertions_high.random_assertion( Symbols.symbol_function( $sym75$RULE_ASSERTION_ ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/assertions-low.lisp",
    position = 56269L)
  public static SubLObject random_gaf_internal()
  {
    return assertions_high.random_assertion( Symbols.symbol_function( $sym76$GAF_ASSERTION_ ) );
  }

  public static SubLObject declare_assertions_low_file()
  {
    SubLFiles.declareFunction( myName, "assertion_content_print_function_trampoline", "ASSERTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_content_p", "ASSERTION-CONTENT-P", 1, 0, false );
    new assertions_low.$assertion_content_p$UnaryFunction();
    SubLFiles.declareFunction( myName, "as_content_formula_data", "AS-CONTENT-FORMULA-DATA", 1, 0, false );
    SubLFiles.declareFunction( myName, "as_content_mt", "AS-CONTENT-MT", 1, 0, false );
    SubLFiles.declareFunction( myName, "as_content_flags", "AS-CONTENT-FLAGS", 1, 0, false );
    SubLFiles.declareFunction( myName, "as_content_arguments", "AS-CONTENT-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( myName, "as_content_plist", "AS-CONTENT-PLIST", 1, 0, false );
    SubLFiles.declareFunction( myName, "_csetf_as_content_formula_data", "_CSETF-AS-CONTENT-FORMULA-DATA", 2, 0, false );
    SubLFiles.declareFunction( myName, "_csetf_as_content_mt", "_CSETF-AS-CONTENT-MT", 2, 0, false );
    SubLFiles.declareFunction( myName, "_csetf_as_content_flags", "_CSETF-AS-CONTENT-FLAGS", 2, 0, false );
    SubLFiles.declareFunction( myName, "_csetf_as_content_arguments", "_CSETF-AS-CONTENT-ARGUMENTS", 2, 0, false );
    SubLFiles.declareFunction( myName, "_csetf_as_content_plist", "_CSETF-AS-CONTENT-PLIST", 2, 0, false );
    SubLFiles.declareFunction( myName, "make_assertion_content", "MAKE-ASSERTION-CONTENT", 0, 1, false );
    SubLFiles.declareFunction( myName, "visit_defstruct_assertion_content", "VISIT-DEFSTRUCT-ASSERTION-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( myName, "visit_defstruct_object_assertion_content_method", "VISIT-DEFSTRUCT-OBJECT-ASSERTION-CONTENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( myName, "create_assertion_content", "CREATE-ASSERTION-CONTENT", 1, 0, false );
    SubLFiles.declareFunction( myName, "destroy_assertion_content", "DESTROY-ASSERTION-CONTENT", 1, 0, false );
    SubLFiles.declareFunction( myName, "lookup_assertion_formula_data", "LOOKUP-ASSERTION-FORMULA-DATA", 1, 0, false );
    SubLFiles.declareFunction( myName, "lookup_assertion_mt", "LOOKUP-ASSERTION-MT", 1, 0, false );
    SubLFiles.declareFunction( myName, "lookup_assertion_flags", "LOOKUP-ASSERTION-FLAGS", 1, 0, false );
    SubLFiles.declareFunction( myName, "lookup_assertion_arguments", "LOOKUP-ASSERTION-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( myName, "lookup_assertion_plist", "LOOKUP-ASSERTION-PLIST", 1, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_formula_data", "SET-ASSERTION-FORMULA-DATA", 2, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_flags", "SET-ASSERTION-FLAGS", 2, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_arguments", "SET-ASSERTION-ARGUMENTS", 2, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_plist", "SET-ASSERTION-PLIST", 2, 0, false );
    SubLFiles.declareFunction( myName, "dump_assertion_content", "DUMP-ASSERTION-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_plist_for_dumping", "ASSERTION-PLIST-FOR-DUMPING", 1, 0, false );
    SubLFiles.declareFunction( myName, "load_assertion_content", "LOAD-ASSERTION-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( myName, "load_assertion_content_int", "LOAD-ASSERTION-CONTENT-INT", 6, 0, false );
    SubLFiles.declareFunction( myName, "assertion_cnf_internal", "ASSERTION-CNF-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "possibly_assertion_cnf_internal", "POSSIBLY-ASSERTION-CNF-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_mt_internal", "ASSERTION-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_gaf_hl_formula_internal", "ASSERTION-GAF-HL-FORMULA-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_cons_internal", "ASSERTION-CONS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_direction_internal", "ASSERTION-DIRECTION-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_truth_internal", "ASSERTION-TRUTH-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_strength_internal", "ASSERTION-STRENGTH-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_tv", "ASSERTION-TV", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_tv_internal", "ASSERTION-TV-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_variable_names_internal", "ASSERTION-VARIABLE-NAMES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "asserted_by_internal", "ASSERTED-BY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "asserted_when_internal", "ASSERTED-WHEN-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "asserted_why_internal", "ASSERTED-WHY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "asserted_second_internal", "ASSERTED-SECOND-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_arguments_internal", "ASSERTION-ARGUMENTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_dependents_internal", "ASSERTION-DEPENDENTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_dependent_count_internal", "ASSERTION-DEPENDENT-COUNT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_has_dependents_p_internal", "ASSERTION-HAS-DEPENDENTS-P-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_formula_data", "ASSERTION-FORMULA-DATA", 1, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_formula_data", "RESET-ASSERTION-FORMULA-DATA", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_hl_cnf", "ASSERTION-HL-CNF", 1, 0, false );
    SubLFiles.declareFunction( myName, "update_assertion_formula_data", "UPDATE-ASSERTION-FORMULA-DATA", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_clause_struc", "ASSERTION-CLAUSE-STRUC", 1, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_cnf", "RESET-ASSERTION-CNF", 2, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_clause_struc", "RESET-ASSERTION-CLAUSE-STRUC", 2, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_gaf_formula", "RESET-ASSERTION-GAF-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( myName, "annihilate_assertion_formula_data", "ANNIHILATE-ASSERTION-FORMULA-DATA", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_flags", "ASSERTION-FLAGS", 1, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_flags", "RESET-ASSERTION-FLAGS", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_flags_gaf_code", "ASSERTION-FLAGS-GAF-CODE", 1, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_flags_gaf_code", "SET-ASSERTION-FLAGS-GAF-CODE", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_flags_direction_code", "ASSERTION-FLAGS-DIRECTION-CODE", 1, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_flags_direction_code", "SET-ASSERTION-FLAGS-DIRECTION-CODE", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_flags_tv_code", "ASSERTION-FLAGS-TV-CODE", 1, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_flags_tv_code", "SET-ASSERTION-FLAGS-TV-CODE", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_flags_gaf_p", "ASSERTION-FLAGS-GAF-P", 1, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_flags_gaf_p", "SET-ASSERTION-FLAGS-GAF-P", 2, 0, false );
    SubLFiles.declareFunction( myName, "use_rule_setP", "USE-RULE-SET?", 0, 0, false );
    SubLFiles.declareFunction( myName, "setup_rule_set", "SETUP-RULE-SET", 1, 0, false );
    SubLFiles.declareFunction( myName, "kb_rule_set", "KB-RULE-SET", 0, 0, false );
    SubLFiles.declareFunction( myName, "assertion_gaf_p", "ASSERTION-GAF-P", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_rule_p", "ASSERTION-RULE-P", 1, 0, false );
    SubLFiles.declareFunction( myName, "rule_count", "RULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "gaf_count", "GAF-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_gaf_p", "SET-ASSERTION-GAF-P", 2, 0, false );
    SubLFiles.declareFunction( myName, "possibly_rule_set_delete", "POSSIBLY-RULE-SET-DELETE", 1, 0, false );
    SubLFiles.declareFunction( myName, "recompute_assertion_gaf_p", "RECOMPUTE-ASSERTION-GAF-P", 1, 0, false );
    SubLFiles.declareFunction( myName, "determine_cnf_gaf_p", "DETERMINE-CNF-GAF-P", 1, 0, false );
    SubLFiles.declareFunction( myName, "dump_rule_set_to_stream", "DUMP-RULE-SET-TO-STREAM", 1, 0, false );
    SubLFiles.declareFunction( myName, "load_rule_set_from_stream", "LOAD-RULE-SET-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( myName, "rebuild_rule_set", "REBUILD-RULE-SET", 0, 0, false );
    SubLFiles.declareFunction( myName, "gaf_formula_to_cnf", "GAF-FORMULA-TO-CNF", 1, 0, false );
    SubLFiles.declareFunction( myName, "cnf_to_gaf_formula", "CNF-TO-GAF-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( myName, "kb_set_assertion_direction_internal", "KB-SET-ASSERTION-DIRECTION-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_direction", "RESET-ASSERTION-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_tv", "RESET-ASSERTION-TV", 2, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_truth", "RESET-ASSERTION-TRUTH", 2, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_strength", "RESET-ASSERTION-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction( myName, "use_non_true_assertion_tv_cacheP", "USE-NON-TRUE-ASSERTION-TV-CACHE?", 0, 0, false );
    SubLFiles.declareFunction( myName, "setup_non_true_assertion_tv_cache", "SETUP-NON-TRUE-ASSERTION-TV-CACHE", 1, 0, false );
    SubLFiles.declareFunction( myName, "kb_non_true_assertion_tv_cache", "KB-NON-TRUE-ASSERTION-TV-CACHE", 0, 0, false );
    SubLFiles.declareFunction( myName, "assertion_true_p", "ASSERTION-TRUE-P", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_non_true_tv", "ASSERTION-NON-TRUE-TV", 1, 0, false );
    SubLFiles.declareFunction( myName, "non_true_assertion_count", "NON-TRUE-ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "true_assertion_count", "TRUE-ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_non_true_cache_tv", "SET-ASSERTION-NON-TRUE-CACHE-TV", 2, 0, false );
    SubLFiles.declareFunction( myName, "possibly_non_true_assertion_tv_cache_delete", "POSSIBLY-NON-TRUE-ASSERTION-TV-CACHE-DELETE", 1, 0, false );
    SubLFiles.declareFunction( myName, "dump_non_true_assertion_tv_cache_to_stream", "DUMP-NON-TRUE-ASSERTION-TV-CACHE-TO-STREAM", 1, 0, false );
    SubLFiles.declareFunction( myName, "load_non_true_assertion_tv_cache_from_stream", "LOAD-NON-TRUE-ASSERTION-TV-CACHE-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( myName, "rebuild_non_true_assertion_tv_cache", "REBUILD-NON-TRUE-ASSERTION-TV-CACHE", 0, 0, false );
    SubLFiles.declareFunction( myName, "assertion_plist", "ASSERTION-PLIST", 1, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_plist", "RESET-ASSERTION-PLIST", 2, 0, false );
    SubLFiles.declareFunction( myName, "get_assertion_prop", "GET-ASSERTION-PROP", 2, 1, false );
    SubLFiles.declareFunction( myName, "set_assertion_prop", "SET-ASSERTION-PROP", 3, 0, false );
    SubLFiles.declareFunction( myName, "rem_assertion_prop", "REM-ASSERTION-PROP", 2, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_variable_names", "RESET-ASSERTION-VARIABLE-NAMES", 2, 0, false );
    SubLFiles.declareFunction( myName, "does_assertion_have_meta_assertionsP", "DOES-ASSERTION-HAVE-META-ASSERTIONS?", 1, 0, false );
    SubLFiles.declareFunction( myName, "all_meta_assertions_for_assertion", "ALL-META-ASSERTIONS-FOR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_index", "ASSERTION-INDEX", 1, 0, false );
    SubLFiles.declareFunction( myName, "assertion_index_swapped_inP", "ASSERTION-INDEX-SWAPPED-IN?", 1, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_index", "RESET-ASSERTION-INDEX", 2, 0, false );
    SubLFiles.declareFunction( myName, "clear_assertion_index", "CLEAR-ASSERTION-INDEX", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.assertions_low", "destructure_assert_info", "DESTRUCTURE-ASSERT-INFO" );
    SubLFiles.declareFunction( myName, "assertion_assert_info", "ASSERTION-ASSERT-INFO", 1, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_assert_info", "RESET-ASSERTION-ASSERT-INFO", 2, 0, false );
    SubLFiles.declareFunction( myName, "asserted_assertion_timestampedP", "ASSERTED-ASSERTION-TIMESTAMPED?", 1, 0, false );
    SubLFiles.declareFunction( myName, "make_assert_info", "MAKE-ASSERT-INFO", 0, 4, false );
    SubLFiles.declareFunction( myName, "assert_info_who", "ASSERT-INFO-WHO", 1, 0, false );
    SubLFiles.declareFunction( myName, "assert_info_when", "ASSERT-INFO-WHEN", 1, 0, false );
    SubLFiles.declareFunction( myName, "assert_info_why", "ASSERT-INFO-WHY", 1, 0, false );
    SubLFiles.declareFunction( myName, "assert_info_second", "ASSERT-INFO-SECOND", 1, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_asserted_by", "SET-ASSERTION-ASSERTED-BY", 2, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_asserted_when", "SET-ASSERTION-ASSERTED-WHEN", 2, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_asserted_why", "SET-ASSERTION-ASSERTED-WHY", 2, 0, false );
    SubLFiles.declareFunction( myName, "set_assertion_asserted_second", "SET-ASSERTION-ASSERTED-SECOND", 2, 0, false );
    SubLFiles.declareFunction( myName, "valid_assertion_robustP", "VALID-ASSERTION-ROBUST?", 1, 0, false );
    SubLFiles.declareFunction( myName, "valid_assertion_with_contentP", "VALID-ASSERTION-WITH-CONTENT?", 1, 0, false );
    SubLFiles.declareFunction( myName, "kb_create_assertion_kb_store", "KB-CREATE-ASSERTION-KB-STORE", 7, 0, false );
    SubLFiles.declareFunction( myName, "kb_create_assertion_int", "KB-CREATE-ASSERTION-INT", 9, 0, false );
    SubLFiles.declareFunction( myName, "kb_create_assertion_cyc", "KB-CREATE-ASSERTION-CYC", 1, 0, false );
    SubLFiles.declareFunction( myName, "find_cnf_formula_data_hook", "FIND-CNF-FORMULA-DATA-HOOK", 1, 0, false );
    SubLFiles.declareFunction( myName, "find_hl_cnf_hook", "FIND-HL-CNF-HOOK", 1, 0, false );
    SubLFiles.declareFunction( myName, "find_gaf_formula_hook", "FIND-GAF-FORMULA-HOOK", 1, 0, false );
    SubLFiles.declareFunction( myName, "connect_assertion", "CONNECT-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( myName, "connect_assertion_formula_data", "CONNECT-ASSERTION-FORMULA-DATA", 2, 0, false );
    SubLFiles.declareFunction( myName, "kb_remove_assertion_internal", "KB-REMOVE-ASSERTION-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "reconnect_assertion", "RECONNECT-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( myName, "disconnect_assertion", "DISCONNECT-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( myName, "disconnect_assertion_formula_data", "DISCONNECT-ASSERTION-FORMULA-DATA", 1, 0, false );
    SubLFiles.declareFunction( myName, "add_new_assertion_argument", "ADD-NEW-ASSERTION-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( myName, "remove_assertion_argument", "REMOVE-ASSERTION-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( myName, "reset_assertion_dependents", "RESET-ASSERTION-DEPENDENTS", 2, 0, false );
    SubLFiles.declareFunction( myName, "add_assertion_dependent", "ADD-ASSERTION-DEPENDENT", 2, 0, false );
    SubLFiles.declareFunction( myName, "remove_assertion_dependent", "REMOVE-ASSERTION-DEPENDENT", 2, 0, false );
    SubLFiles.declareFunction( myName, "assertion_dependencies", "ASSERTION-DEPENDENCIES", 1, 0, false );
    SubLFiles.declareFunction( myName, "mark_dependent_assertion", "MARK-DEPENDENT-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( myName, "mark_dependent_deduction", "MARK-DEPENDENT-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( myName, "verify_assertion_content_table", "VERIFY-ASSERTION-CONTENT-TABLE", 0, 1, false );
    SubLFiles.declareFunction( myName, "random_assertion_internal", "RANDOM-ASSERTION-INTERNAL", 0, 1, false );
    SubLFiles.declareFunction( myName, "random_rule_internal", "RANDOM-RULE-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( myName, "random_gaf_internal", "RANDOM-GAF-INTERNAL", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_assertions_low_file()
  {
    $dtp_assertion_content$ = SubLFiles.defconstant( "*DTP-ASSERTION-CONTENT*", $sym0$ASSERTION_CONTENT );
    $default_assertion_flags$ = SubLFiles.deflexical( "*DEFAULT-ASSERTION-FLAGS*", ZERO_INTEGER );
    $assertion_flags_gaf_byte$ = SubLFiles.defconstant( "*ASSERTION-FLAGS-GAF-BYTE*", bytes.sublisp_byte( ONE_INTEGER, ZERO_INTEGER ) );
    $assertion_flags_direction_byte$ = SubLFiles.defconstant( "*ASSERTION-FLAGS-DIRECTION-BYTE*", bytes.sublisp_byte( TWO_INTEGER, ONE_INTEGER ) );
    $assertion_flags_tv_byte$ = SubLFiles.defconstant( "*ASSERTION-FLAGS-TV-BYTE*", bytes.sublisp_byte( THREE_INTEGER, THREE_INTEGER ) );
    $rule_set$ = SubLFiles.deflexical( "*RULE-SET*", ( ( NIL != Symbols.boundp( $sym39$_RULE_SET_ ) ) ? $rule_set$.getGlobalValue() : NIL ) );
    $prefer_rule_set_over_flagsP$ = SubLFiles.deflexical( "*PREFER-RULE-SET-OVER-FLAGS?*", ( ( NIL != Symbols.boundp( $sym40$_PREFER_RULE_SET_OVER_FLAGS__ ) ) ? $prefer_rule_set_over_flagsP$.getGlobalValue() : T ) );
    $estimated_assertions_per_rule$ = SubLFiles.deflexical( "*ESTIMATED-ASSERTIONS-PER-RULE*", $int41$60 );
    $non_true_assertion_tv_cache$ = SubLFiles.deflexical( "*NON-TRUE-ASSERTION-TV-CACHE*", ( ( NIL != Symbols.boundp( $sym54$_NON_TRUE_ASSERTION_TV_CACHE_ ) ) ? $non_true_assertion_tv_cache$.getGlobalValue() : NIL ) );
    $prefer_non_true_set_over_flagsP$ = SubLFiles.deflexical( "*PREFER-NON-TRUE-SET-OVER-FLAGS?*", ( ( NIL != Symbols.boundp( $sym55$_PREFER_NON_TRUE_SET_OVER_FLAGS__ ) ) ? $prefer_non_true_set_over_flagsP$
        .getGlobalValue() : T ) );
    $estimated_assertions_per_non_true$ = SubLFiles.deflexical( "*ESTIMATED-ASSERTIONS-PER-NON-TRUE*", $int56$1983 );
    $dependent_deduction_table$ = SubLFiles.defparameter( "*DEPENDENT-DEDUCTION-TABLE*", NIL );
    $dependent_assertion_table$ = SubLFiles.defparameter( "*DEPENDENT-ASSERTION-TABLE*", NIL );
    $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__.setValue( T );
    return NIL;
  }

  public static SubLObject setup_assertions_low_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_assertion_content$.getGlobalValue(), Symbols.symbol_function( $sym8$ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$AS_CONTENT_FORMULA_DATA, $sym11$_CSETF_AS_CONTENT_FORMULA_DATA );
    Structures.def_csetf( $sym12$AS_CONTENT_MT, $sym13$_CSETF_AS_CONTENT_MT );
    Structures.def_csetf( $sym14$AS_CONTENT_FLAGS, $sym15$_CSETF_AS_CONTENT_FLAGS );
    Structures.def_csetf( $sym16$AS_CONTENT_ARGUMENTS, $sym17$_CSETF_AS_CONTENT_ARGUMENTS );
    Structures.def_csetf( $sym18$AS_CONTENT_PLIST, $sym19$_CSETF_AS_CONTENT_PLIST );
    Equality.identity( $sym0$ASSERTION_CONTENT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_assertion_content$.getGlobalValue(), Symbols.symbol_function(
        $sym30$VISIT_DEFSTRUCT_OBJECT_ASSERTION_CONTENT_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym39$_RULE_SET_ );
    subl_macro_promotions.declare_defglobal( $sym40$_PREFER_RULE_SET_OVER_FLAGS__ );
    subl_macro_promotions.declare_defglobal( $sym54$_NON_TRUE_ASSERTION_TV_CACHE_ );
    subl_macro_promotions.declare_defglobal( $sym55$_PREFER_NON_TRUE_SET_OVER_FLAGS__ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_assertions_low_file();
  }

  @Override
  public void initializeVariables()
  {
    init_assertions_low_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_assertions_low_file();
  }
  static
  {
    me = new assertions_low();
    $dtp_assertion_content$ = null;
    $default_assertion_flags$ = null;
    $assertion_flags_gaf_byte$ = null;
    $assertion_flags_direction_byte$ = null;
    $assertion_flags_tv_byte$ = null;
    $rule_set$ = null;
    $prefer_rule_set_over_flagsP$ = null;
    $estimated_assertions_per_rule$ = null;
    $non_true_assertion_tv_cache$ = null;
    $prefer_non_true_set_over_flagsP$ = null;
    $estimated_assertions_per_non_true$ = null;
    $dependent_deduction_table$ = null;
    $dependent_assertion_table$ = null;
    $sym0$ASSERTION_CONTENT = SubLObjectFactory.makeSymbol( "ASSERTION-CONTENT" );
    $sym1$ASSERTION_CONTENT_P = SubLObjectFactory.makeSymbol( "ASSERTION-CONTENT-P" );
    $int2$148 = SubLObjectFactory.makeInteger( 148 );
    assertion_content_holder.structDecl.toString();
    $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym8$ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol( "ASSERTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( SubLObjectFactory.makeSymbol( "OPTIMIZE-FUNCALL" ), SubLObjectFactory.makeSymbol( "ASSERTION-CONTENT-P" ) );
    $sym10$AS_CONTENT_FORMULA_DATA = SubLObjectFactory.makeSymbol( "AS-CONTENT-FORMULA-DATA" );
    $sym11$_CSETF_AS_CONTENT_FORMULA_DATA = SubLObjectFactory.makeSymbol( "_CSETF-AS-CONTENT-FORMULA-DATA" );
    $sym12$AS_CONTENT_MT = SubLObjectFactory.makeSymbol( "AS-CONTENT-MT" );
    $sym13$_CSETF_AS_CONTENT_MT = SubLObjectFactory.makeSymbol( "_CSETF-AS-CONTENT-MT" );
    $sym14$AS_CONTENT_FLAGS = SubLObjectFactory.makeSymbol( "AS-CONTENT-FLAGS" );
    $sym15$_CSETF_AS_CONTENT_FLAGS = SubLObjectFactory.makeSymbol( "_CSETF-AS-CONTENT-FLAGS" );
    $sym16$AS_CONTENT_ARGUMENTS = SubLObjectFactory.makeSymbol( "AS-CONTENT-ARGUMENTS" );
    $sym17$_CSETF_AS_CONTENT_ARGUMENTS = SubLObjectFactory.makeSymbol( "_CSETF-AS-CONTENT-ARGUMENTS" );
    $sym18$AS_CONTENT_PLIST = SubLObjectFactory.makeSymbol( "AS-CONTENT-PLIST" );
    $sym19$_CSETF_AS_CONTENT_PLIST = SubLObjectFactory.makeSymbol( "_CSETF-AS-CONTENT-PLIST" );
    $kw20$FORMULA_DATA = SubLObjectFactory.makeKeyword( "FORMULA-DATA" );
    $kw21$MT = SubLObjectFactory.makeKeyword( "MT" );
    $kw22$FLAGS = SubLObjectFactory.makeKeyword( "FLAGS" );
    $kw23$ARGUMENTS = SubLObjectFactory.makeKeyword( "ARGUMENTS" );
    $kw24$PLIST = SubLObjectFactory.makeKeyword( "PLIST" );
    $str25$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString( "Invalid slot ~S for construction function" );
    $kw26$BEGIN = SubLObjectFactory.makeKeyword( "BEGIN" );
    $sym27$MAKE_ASSERTION_CONTENT = SubLObjectFactory.makeSymbol( "MAKE-ASSERTION-CONTENT" );
    $kw28$SLOT = SubLObjectFactory.makeKeyword( "SLOT" );
    $kw29$END = SubLObjectFactory.makeKeyword( "END" );
    $sym30$VISIT_DEFSTRUCT_OBJECT_ASSERTION_CONTENT_METHOD = SubLObjectFactory.makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ASSERTION-CONTENT-METHOD" );
    $kw31$DEPENDENTS = SubLObjectFactory.makeKeyword( "DEPENDENTS" );
    $kw32$INDEX = SubLObjectFactory.makeKeyword( "INDEX" );
    $kw33$TRUE = SubLObjectFactory.makeKeyword( "TRUE" );
    $sym34$ASSERTION_P = SubLObjectFactory.makeSymbol( "ASSERTION-P" );
    $str35$_a__assertion___a__has_null_flags = SubLObjectFactory.makeString( "~a (assertion #~a) has null flags" );
    $kw36$VARIABLE_NAMES = SubLObjectFactory.makeKeyword( "VARIABLE-NAMES" );
    $int37$256 = SubLObjectFactory.makeInteger( 256 );
    $str38$Unexpected_formula_data_type___S = SubLObjectFactory.makeString( "Unexpected formula-data type: ~S" );
    $sym39$_RULE_SET_ = SubLObjectFactory.makeSymbol( "*RULE-SET*" );
    $sym40$_PREFER_RULE_SET_OVER_FLAGS__ = SubLObjectFactory.makeSymbol( "*PREFER-RULE-SET-OVER-FLAGS?*" );
    $int41$60 = SubLObjectFactory.makeInteger( 60 );
    $sym42$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str43$mapping_Cyc_assertions = SubLObjectFactory.makeString( "mapping Cyc assertions" );
    $sym44$STRINGP = SubLObjectFactory.makeSymbol( "STRINGP" );
    $kw45$SKIP = SubLObjectFactory.makeKeyword( "SKIP" );
    $sym46$CNF_P = SubLObjectFactory.makeSymbol( "CNF-P" );
    $sym47$KEYHASH_P = SubLObjectFactory.makeSymbol( "KEYHASH-P" );
    $str48$Rebuilding_the_Rule_Set = SubLObjectFactory.makeString( "Rebuilding the Rule Set" );
    $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" );
    $list50 = ConsesLow.list( SubLObjectFactory.makeSymbol( "CSETQ" ), SubLObjectFactory.makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL );
    $sym51$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym52$CSETQ = SubLObjectFactory.makeSymbol( "CSETQ" );
    $str53$_A = SubLObjectFactory.makeString( "~A" );
    $sym54$_NON_TRUE_ASSERTION_TV_CACHE_ = SubLObjectFactory.makeSymbol( "*NON-TRUE-ASSERTION-TV-CACHE*" );
    $sym55$_PREFER_NON_TRUE_SET_OVER_FLAGS__ = SubLObjectFactory.makeSymbol( "*PREFER-NON-TRUE-SET-OVER-FLAGS?*" );
    $int56$1983 = SubLObjectFactory.makeInteger( 1983 );
    $list57 = ConsesLow.list( SubLObjectFactory.makeKeyword( "WEAK-KEYS" ), T );
    $str58$Rebuilding_the_non_true_assertion = SubLObjectFactory.makeString( "Rebuilding the non-true assertion cache" );
    $sym59$LISTP = SubLObjectFactory.makeSymbol( "LISTP" );
    $sym60$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol( "NON-DOTTED-LIST-P" );
    $list61 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "WHO" ), SubLObjectFactory.makeSymbol( "WHEN" ), SubLObjectFactory.makeSymbol( "WHY" ), SubLObjectFactory.makeSymbol( "SECOND" ) ),
        SubLObjectFactory.makeSymbol( "ASSERT-INFO" ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "BODY" ) );
    $sym62$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol( "CDESTRUCTURING-BIND" );
    $sym63$_OPTIONAL = SubLObjectFactory.makeSymbol( "&OPTIONAL" );
    $kw64$ASSERT_INFO = SubLObjectFactory.makeKeyword( "ASSERT-INFO" );
    $list65 = ConsesLow.list( SubLObjectFactory.makeSymbol( "&OPTIONAL" ), SubLObjectFactory.makeSymbol( "WHO" ), SubLObjectFactory.makeSymbol( "WHEN" ), SubLObjectFactory.makeSymbol( "WHY" ), SubLObjectFactory
        .makeSymbol( "SECOND" ) );
    $sym66$VALID_ARGUMENT = SubLObjectFactory.makeSymbol( "VALID-ARGUMENT" );
    $kw67$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym68$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw69$FORWARD = SubLObjectFactory.makeKeyword( "FORWARD" );
    $str70$Unexpected_formula_data_hook___S = SubLObjectFactory.makeString( "Unexpected formula data hook: ~S" );
    $sym71$SET_CONTENTS_P = SubLObjectFactory.makeSymbol( "SET-CONTENTS-P" );
    $sym72$ARGUMENT_P = SubLObjectFactory.makeSymbol( "ARGUMENT-P" );
    $sym73$DEDUCTION_P = SubLObjectFactory.makeSymbol( "DEDUCTION-P" );
    $sym74$TRUE = SubLObjectFactory.makeSymbol( "TRUE" );
    $sym75$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol( "RULE-ASSERTION?" );
    $sym76$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol( "GAF-ASSERTION?" );
  }
}
