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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_regression
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_regression";
  public static final String myFingerPrint = "b2f577ec4bb4f04ab327b4f16713b7547c7e100922449db07df82ce7fc5b7372";
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLSymbol $pph_tmp_regression_item$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLSymbol $pph_tmp_test_object$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLSymbol $pph_regression_failure_expectedP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLSymbol $pph_known_problem_objects$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLSymbol $pph_regression_current_test$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  private static SubLSymbol $pph_regression_hosed_by_kb$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLSymbol $pph_regression_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLSymbol $dtp_pph_regression_item$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLSymbol $pph_regression_item_requires_all_args$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLSymbol $pph_regression_doomed_combinations$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  private static SubLSymbol $pph_regression_item_case_blessed$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  private static SubLSymbol $pph_regression_item_case_doomed$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PWHEN;
  private static final SubLSymbol $sym2$__;
  private static final SubLSymbol $sym3$_PPH_REGRESSION_TRACE_LEVEL_;
  private static final SubLSymbol $sym4$WARN;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$CLET;
  private static final SubLSymbol $sym8$LOUD_WARNING;
  private static final SubLSymbol $sym9$JOIN_STRINGS;
  private static final SubLSymbol $sym10$LIST;
  private static final SubLSymbol $sym11$_EMPTY_STRING_;
  private static final SubLString $str12$______PPH_REGRESSION_PROBLEM____;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLString $str15$____PPH_REGRESSION_CASE_EXPECTED_;
  private static final SubLSymbol $sym16$PPH_REGRESSION_ITEM;
  private static final SubLSymbol $sym17$PPH_REGRESSION_ITEM_P;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym23$PPH_REGRESSION_ITEM_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$PPH_REGRESSION_ITEM_TEST_CASE;
  private static final SubLSymbol $sym26$_CSETF_PPH_REGRESSION_ITEM_TEST_CASE;
  private static final SubLSymbol $sym27$PPH_REGRESSION_ITEM_PURPOSE;
  private static final SubLSymbol $sym28$_CSETF_PPH_REGRESSION_ITEM_PURPOSE;
  private static final SubLSymbol $sym29$PPH_REGRESSION_ITEM_EXCUSED;
  private static final SubLSymbol $sym30$_CSETF_PPH_REGRESSION_ITEM_EXCUSED;
  private static final SubLSymbol $sym31$PPH_REGRESSION_ITEM_LANGUAGE_MT;
  private static final SubLSymbol $sym32$_CSETF_PPH_REGRESSION_ITEM_LANGUAGE_MT;
  private static final SubLSymbol $sym33$PPH_REGRESSION_ITEM_DOMAIN_MT;
  private static final SubLSymbol $sym34$_CSETF_PPH_REGRESSION_ITEM_DOMAIN_MT;
  private static final SubLSymbol $kw35$TEST_CASE;
  private static final SubLSymbol $kw36$PURPOSE;
  private static final SubLSymbol $kw37$EXCUSED;
  private static final SubLSymbol $kw38$LANGUAGE_MT;
  private static final SubLSymbol $kw39$DOMAIN_MT;
  private static final SubLString $str40$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw41$BEGIN;
  private static final SubLSymbol $sym42$MAKE_PPH_REGRESSION_ITEM;
  private static final SubLSymbol $kw43$SLOT;
  private static final SubLSymbol $kw44$END;
  private static final SubLSymbol $sym45$VISIT_DEFSTRUCT_OBJECT_PPH_REGRESSION_ITEM_METHOD;
  private static final SubLSymbol $sym46$PROPER_LIST_P;
  private static final SubLSymbol $sym47$HLMT_;
  private static final SubLString $str48$updating_status_of__S__w_r_t__tes;
  private static final SubLString $str49$____marked_as_failing_with_force_;
  private static final SubLString $str50$____failing_to_mark_as_failing_un;
  private static final SubLString $str51$____now_blessed_as_passing_with_f;
  private static final SubLString $str52$At_least_1_argument_for_gather_pp;
  private static final SubLObject $const53$PPHRegressionPredicate;
  private static final SubLString $str54$KB_search;
  private static final SubLString $str55$skipping_this_case_as_language_mt;
  private static final SubLString $str56$skipping_this_case_as_domain_mt__;
  private static final SubLSymbol $sym57$INVALID_CONSTANT_;
  private static final SubLString $str58$_S_would_fail_regression__skippin;
  private static final SubLString $str59$_____ALERT___KB_ISSUES___ALERT___;
  private static final SubLString $str60$These_test_cases_were_skipped_due;
  private static final SubLString $str61$_S_in__S;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLSymbol $kw64$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw65$TEST_FUNC;
  private static final SubLSymbol $sym66$DO_SET;
  private static final SubLSymbol $sym67$_PPH_TMP_REGRESSION_ITEM_;
  private static final SubLSymbol $sym68$GATHER_PPH_REGRESSION_TESTS;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$_PPH_REGRESSION_CURRENT_TEST_;
  private static final SubLSymbol $sym72$FUNCALL_INSTANCE_METHOD;
  private static final SubLSymbol $sym73$SELF;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$FUNCALL;
  private static final SubLSymbol $sym76$PPH_REGRESSION_DIAGNOSTICS;

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_warn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    level = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym2$__, $sym3$_PPH_REGRESSION_TRACE_LEVEL_, level ), ConsesLow.listS( $sym4$WARN, format_str, ConsesLow.append( args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_warn_wXo_false_positives(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym1$PWHEN, $list6, ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( $sym8$LOUD_WARNING, ConsesLow.listS( $sym9$JOIN_STRINGS, ConsesLow.listS( $sym10$LIST, $sym11$_EMPTY_STRING_,
        $str12$______PPH_REGRESSION_PROBLEM____, format_str, $list13 ), $list14 ) ) ), ConsesLow.listS( $sym4$WARN, $sym8$LOUD_WARNING, ConsesLow.append( args, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_diagnostics(final SubLObject details_func)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ans = ( NIL != $pph_regression_failure_expectedP$.getDynamicValue( thread ) ) ? PrintLow.format( NIL, $str15$____PPH_REGRESSION_CASE_EXPECTED_, $pph_regression_current_test$.getDynamicValue(
        thread ) ) : string_utilities.$empty_string$.getGlobalValue();
    return Sequences.cconcatenate( ans, Functions.funcall( details_func ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_item_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_item_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $pph_regression_item_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_item_test_case(final SubLObject v_object)
  {
    assert NIL != pph_regression_item_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_item_purpose(final SubLObject v_object)
  {
    assert NIL != pph_regression_item_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_item_excused(final SubLObject v_object)
  {
    assert NIL != pph_regression_item_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_item_language_mt(final SubLObject v_object)
  {
    assert NIL != pph_regression_item_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_item_domain_mt(final SubLObject v_object)
  {
    assert NIL != pph_regression_item_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject _csetf_pph_regression_item_test_case(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pph_regression_item_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject _csetf_pph_regression_item_purpose(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pph_regression_item_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject _csetf_pph_regression_item_excused(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pph_regression_item_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject _csetf_pph_regression_item_language_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pph_regression_item_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject _csetf_pph_regression_item_domain_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pph_regression_item_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject make_pph_regression_item(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $pph_regression_item_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw35$TEST_CASE ) )
      {
        _csetf_pph_regression_item_test_case( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$PURPOSE ) )
      {
        _csetf_pph_regression_item_purpose( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$EXCUSED ) )
      {
        _csetf_pph_regression_item_excused( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$LANGUAGE_MT ) )
      {
        _csetf_pph_regression_item_language_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$DOMAIN_MT ) )
      {
        _csetf_pph_regression_item_domain_mt( v_new, current_value );
      }
      else
      {
        Errors.error( $str40$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject visit_defstruct_pph_regression_item(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw41$BEGIN, $sym42$MAKE_PPH_REGRESSION_ITEM, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw43$SLOT, $kw35$TEST_CASE, pph_regression_item_test_case( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$SLOT, $kw36$PURPOSE, pph_regression_item_purpose( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$SLOT, $kw37$EXCUSED, pph_regression_item_excused( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$SLOT, $kw38$LANGUAGE_MT, pph_regression_item_language_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw43$SLOT, $kw39$DOMAIN_MT, pph_regression_item_domain_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw44$END, $sym42$MAKE_PPH_REGRESSION_ITEM, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject visit_defstruct_object_pph_regression_item_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_pph_regression_item( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject new_pph_regression_item(final SubLObject obj, final SubLObject purp, SubLObject exc, SubLObject lang, SubLObject domain)
  {
    if( exc == UNPROVIDED )
    {
      exc = $pph_regression_item_requires_all_args$.getDynamicValue();
    }
    if( lang == UNPROVIDED )
    {
      lang = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    if( domain == UNPROVIDED )
    {
      domain = pph_vars.$pph_domain_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != exc && !assertionsDisabledInClass && NIL == list_utilities.proper_list_p( exc ) )
    {
      throw new AssertionError( exc );
    }
    if( NIL == lang )
    {
      lang = pph_vars.$pph_language_mt$.getDynamicValue( thread );
    }
    if( NIL != lang && !assertionsDisabledInClass && NIL == hlmt.hlmtP( lang ) )
    {
      throw new AssertionError( lang );
    }
    if( NIL == domain )
    {
      domain = pph_vars.$pph_domain_mt$.getDynamicValue( thread );
    }
    if( NIL != domain && !assertionsDisabledInClass && NIL == hlmt.hlmtP( domain ) )
    {
      throw new AssertionError( domain );
    }
    final SubLObject reg_item = make_pph_regression_item( UNPROVIDED );
    _csetf_pph_regression_item_test_case( reg_item, obj );
    _csetf_pph_regression_item_purpose( reg_item, purp );
    _csetf_pph_regression_item_excused( reg_item, exc );
    _csetf_pph_regression_item_language_mt( reg_item, lang );
    _csetf_pph_regression_item_domain_mt( reg_item, domain );
    return reg_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject copy_pph_regression_item(final SubLObject old)
  {
    assert NIL != pph_regression_item_p( old ) : old;
    final SubLObject obj = pph_regression_item_test_case( old );
    final SubLObject purp = pph_regression_item_purpose( old );
    final SubLObject exc = conses_high.copy_list( pph_regression_item_excused( old ) );
    final SubLObject lang = pph_regression_item_language_mt( old );
    final SubLObject domain = pph_regression_item_domain_mt( old );
    return new_pph_regression_item( obj, purp, exc, lang, domain );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject new_regression_store(SubLObject test, SubLObject size)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    if( size == UNPROVIDED )
    {
      size = ONE_INTEGER;
    }
    return set.new_set( test, size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject add_case_to_pph_regression_store(final SubLObject store, final SubLObject v_object, final SubLObject docs, SubLObject exc, SubLObject lang, SubLObject dom)
  {
    if( exc == UNPROVIDED )
    {
      exc = NIL;
    }
    if( lang == UNPROVIDED )
    {
      lang = NIL;
    }
    if( dom == UNPROVIDED )
    {
      dom = NIL;
    }
    final SubLObject new_item = new_pph_regression_item( v_object, docs, exc, lang, dom );
    set.set_add( new_item, store );
    return new_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject add_item_to_pph_regression_store(final SubLObject store, final SubLObject item)
  {
    assert NIL != pph_regression_item_p( item ) : item;
    set.set_add( item, store );
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject clear_regression_store(final SubLObject store)
  {
    return set.clear_set( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject bless_or_doom_pph_regression_item(final SubLObject item, final SubLObject key_func, final SubLObject force_list, final SubLObject doomedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == key_func || NIL == force_list )
    {
      return T;
    }
    SubLObject dict = dictionary.dictionary_lookup( $pph_regression_doomed_combinations$.getDynamicValue( thread ), item, UNPROVIDED );
    if( NIL == dict )
    {
      if( doomedP.eql( $pph_regression_item_case_blessed$.getDynamicValue( thread ) ) )
      {
        return T;
      }
      dict = dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), FIVE_INTEGER );
      dictionary.dictionary_enter( $pph_regression_doomed_combinations$.getDynamicValue( thread ), item, dict );
    }
    SubLObject v_set = dictionary.dictionary_lookup( dict, key_func, UNPROVIDED );
    if( NIL == v_set )
    {
      if( doomedP.eql( $pph_regression_item_case_blessed$.getDynamicValue( thread ) ) )
      {
        return T;
      }
      v_set = set.new_set( Symbols.symbol_function( EQUALP ), UNPROVIDED );
      dictionary.dictionary_enter( dict, key_func, v_set );
    }
    if( $pph_regression_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
    {
      Errors.warn( $str48$updating_status_of__S__w_r_t__tes, pph_regression_item_test_case( item ), key_func );
    }
    SubLObject cdolist_list_var = force_list;
    SubLObject force = NIL;
    force = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( doomedP.eql( $pph_regression_item_case_doomed$.getDynamicValue( thread ) ) )
      {
        if( NIL == set.set_memberP( force, v_set ) )
        {
          if( NIL != set.set_add( force, v_set ) )
          {
            if( $pph_regression_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
            {
              Errors.warn( $str49$____marked_as_failing_with_force_, force );
            }
          }
          else
          {
            Errors.sublisp_break( $str50$____failing_to_mark_as_failing_un, new SubLObject[] { force
            } );
          }
        }
      }
      else if( NIL != set.set_remove( force, v_set ) && $pph_regression_trace_level$.getDynamicValue( thread ).numGE( ONE_INTEGER ) )
      {
        Errors.warn( $str51$____now_blessed_as_passing_with_f, force );
      }
      cdolist_list_var = cdolist_list_var.rest();
      force = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject doom_pph_regression_item_to_fail_with_forces(final SubLObject item, final SubLObject test_func, final SubLObject forces)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return bless_or_doom_pph_regression_item( item, test_func, forces, $pph_regression_item_case_doomed$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject bless_pph_regression_item_to_pass_with_forces(final SubLObject item, final SubLObject test_func, final SubLObject forces)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return bless_or_doom_pph_regression_item( item, test_func, forces, $pph_regression_item_case_blessed$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject gather_pph_regression_tests(final SubLObject filter, SubLObject specs, SubLObject preds)
  {
    if( specs == UNPROVIDED )
    {
      specs = NIL;
    }
    if( preds == UNPROVIDED )
    {
      preds = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == specs && NIL == preds )
    {
      if( $pph_regression_trace_level$.getDynamicValue( thread ).numGE( ZERO_INTEGER ) )
      {
        Errors.warn( $str52$At_least_1_argument_for_gather_pp );
      }
      return set.new_set( UNPROVIDED, UNPROVIDED );
    }
    final SubLObject master_set = set.new_set( Symbols.symbol_function( EQUALP ), UNPROVIDED );
    SubLObject cdolist_list_var = specs;
    SubLObject this_spec = NIL;
    this_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject set_contents_var = set.do_set_internal( this_spec );
      SubLObject basis_object;
      SubLObject state;
      SubLObject this_pph_item;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        this_pph_item = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, this_pph_item ) )
        {
          assert NIL != pph_regression_item_p( this_pph_item ) : this_pph_item;
          if( NIL == test_object_doomedP( this_pph_item, filter ) )
          {
            set.set_add( this_pph_item, master_set );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_spec = cdolist_list_var.first();
    }
    cdolist_list_var = preds;
    SubLObject this_pred = NIL;
    this_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa.isaP( this_pred, $const53$PPHRegressionPredicate, UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$1 = kb_mapping.gather_predicate_extent_index( this_pred, UNPROVIDED, UNPROVIDED );
        SubLObject found = NIL;
        found = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          if( NIL != el_utilities.el_formula_p( found ) && NIL == test_object_doomedP( found, filter ) )
          {
            set.set_add( new_pph_regression_item( found, $str54$KB_search, UNPROVIDED, UNPROVIDED, UNPROVIDED ), master_set );
          }
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          found = cdolist_list_var_$1.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_pred = cdolist_list_var.first();
    }
    return master_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject mark_object_as_failing_pph_regression(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_formula_p( v_object ) || NIL != constant_handles.constant_p( v_object ) || v_object.isString() || v_object.isNumber() || NIL != hlmt.hlmtP( v_object ) )
    {
      return set.set_add( v_object, $pph_known_problem_objects$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject bless_object_for_pph_regression(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return set.set_remove( v_object, $pph_known_problem_objects$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject doomed_objectP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return set.set_memberP( v_object, $pph_known_problem_objects$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject test_object_doomedP(final SubLObject pph_item, final SubLObject relevant_test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != pph_regression_item_p( pph_item ) : pph_item;
    if( NIL != doomed_objectP( pph_regression_item_language_mt( pph_item ) ) )
    {
      if( $pph_regression_trace_level$.getDynamicValue( thread ).numGE( ZERO_INTEGER ) )
      {
        Errors.warn( $str55$skipping_this_case_as_language_mt, pph_regression_item_language_mt( pph_item ), pph_item );
      }
      return T;
    }
    if( NIL != doomed_objectP( pph_regression_item_domain_mt( pph_item ) ) )
    {
      if( $pph_regression_trace_level$.getDynamicValue( thread ).numGE( ZERO_INTEGER ) )
      {
        Errors.warn( $str56$skipping_this_case_as_domain_mt__, pph_regression_item_domain_mt( pph_item ), pph_item );
      }
      return T;
    }
    final SubLObject v_object = pph_regression_item_test_case( pph_item );
    final SubLObject bogus = cycl_utilities.expression_find_if( $sym57$INVALID_CONSTANT_, v_object, UNPROVIDED, UNPROVIDED );
    if( NIL != bogus )
    {
      pph_regression_tracking_formula_with_kb_gap( v_object, bogus );
      return T;
    }
    final SubLObject bad_elements = ( NIL != relevant_test ) ? Functions.funcall( relevant_test, v_object ) : set.new_set( UNPROVIDED, UNPROVIDED );
    if( NIL == set.empty_set_p( bad_elements ) )
    {
      if( $pph_regression_trace_level$.getDynamicValue( thread ).numGE( ZERO_INTEGER ) )
      {
        Errors.warn( $str58$_S_would_fail_regression__skippin, set.set_element_list( bad_elements ), v_object );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_tracking_reset_skips()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dictionary.clear_dictionary( $pph_regression_hosed_by_kb$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_tracking_formula_with_kb_gap(final SubLObject formula, final SubLObject bogus)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary.dictionary_enter( $pph_regression_hosed_by_kb$.getDynamicValue( thread ), formula, bogus );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject pph_regression_tracking_print_skips()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != dictionary.non_empty_dictionary_p( $pph_regression_hosed_by_kb$.getDynamicValue( thread ) ) )
    {
      Errors.warn( $str59$_____ALERT___KB_ISSUES___ALERT___ );
      Errors.warn( $str60$These_test_cases_were_skipped_due );
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( $pph_regression_hosed_by_kb$.getDynamicValue( thread ) ) ); NIL == dictionary_contents
          .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject this_formula = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject these_constants = thread.secondMultipleValue();
        thread.resetMultipleValues();
        Errors.warn( $str61$_S_in__S, these_constants, this_formula );
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject do_pph_regression_store(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject store = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
    store = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list62 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list62 );
      if( NIL == conses_high.member( current_$2, $list63, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw64$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list62 );
    }
    final SubLObject test_func_tail = cdestructuring_bind.property_list_member( $kw65$TEST_FUNC, current );
    final SubLObject test_func = ( NIL != test_func_tail ) ? conses_high.cadr( test_func_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym66$DO_SET, ConsesLow.list( $sym67$_PPH_TMP_REGRESSION_ITEM_, ConsesLow.list( $sym68$GATHER_PPH_REGRESSION_TESTS, test_func, ConsesLow.list( $sym10$LIST, store ) ) ), ConsesLow.append(
        body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject with_pph_test_object(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$CLET, $list69, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-regression.lisp", position = 1530L)
  public static SubLObject do_pph_test_in_proper_mode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject test_func = NIL;
    SubLObject reg_specific_func = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    test_func = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list70 );
    reg_specific_func = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( $sym71$_PPH_REGRESSION_CURRENT_TEST_, test_func ) ), ConsesLow.list( $sym72$FUNCALL_INSTANCE_METHOD, $sym73$SELF, $list74, ConsesLow.list(
          $sym75$FUNCALL, test_func ), ConsesLow.list( $sym76$PPH_REGRESSION_DIAGNOSTICS, reg_specific_func ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list70 );
    return NIL;
  }

  public static SubLObject declare_pph_regression_file()
  {
    SubLFiles.declareMacro( me, "pph_regression_warn", "PPH-REGRESSION-WARN" );
    SubLFiles.declareMacro( me, "pph_regression_warn_wXo_false_positives", "PPH-REGRESSION-WARN-W/O-FALSE-POSITIVES" );
    SubLFiles.declareFunction( me, "pph_regression_diagnostics", "PPH-REGRESSION-DIAGNOSTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_regression_item_print_function_trampoline", "PPH-REGRESSION-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_regression_item_p", "PPH-REGRESSION-ITEM-P", 1, 0, false );
    new $pph_regression_item_p$UnaryFunction();
    SubLFiles.declareFunction( me, "pph_regression_item_test_case", "PPH-REGRESSION-ITEM-TEST-CASE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_regression_item_purpose", "PPH-REGRESSION-ITEM-PURPOSE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_regression_item_excused", "PPH-REGRESSION-ITEM-EXCUSED", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_regression_item_language_mt", "PPH-REGRESSION-ITEM-LANGUAGE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_regression_item_domain_mt", "PPH-REGRESSION-ITEM-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pph_regression_item_test_case", "_CSETF-PPH-REGRESSION-ITEM-TEST-CASE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pph_regression_item_purpose", "_CSETF-PPH-REGRESSION-ITEM-PURPOSE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pph_regression_item_excused", "_CSETF-PPH-REGRESSION-ITEM-EXCUSED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pph_regression_item_language_mt", "_CSETF-PPH-REGRESSION-ITEM-LANGUAGE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pph_regression_item_domain_mt", "_CSETF-PPH-REGRESSION-ITEM-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_pph_regression_item", "MAKE-PPH-REGRESSION-ITEM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_pph_regression_item", "VISIT-DEFSTRUCT-PPH-REGRESSION-ITEM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_pph_regression_item_method", "VISIT-DEFSTRUCT-OBJECT-PPH-REGRESSION-ITEM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_pph_regression_item", "NEW-PPH-REGRESSION-ITEM", 2, 3, false );
    SubLFiles.declareFunction( me, "copy_pph_regression_item", "COPY-PPH-REGRESSION-ITEM", 1, 0, false );
    SubLFiles.declareFunction( me, "new_regression_store", "NEW-REGRESSION-STORE", 0, 2, false );
    SubLFiles.declareFunction( me, "add_case_to_pph_regression_store", "ADD-CASE-TO-PPH-REGRESSION-STORE", 3, 3, false );
    SubLFiles.declareFunction( me, "add_item_to_pph_regression_store", "ADD-ITEM-TO-PPH-REGRESSION-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_regression_store", "CLEAR-REGRESSION-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "bless_or_doom_pph_regression_item", "BLESS-OR-DOOM-PPH-REGRESSION-ITEM", 4, 0, false );
    SubLFiles.declareFunction( me, "doom_pph_regression_item_to_fail_with_forces", "DOOM-PPH-REGRESSION-ITEM-TO-FAIL-WITH-FORCES", 3, 0, false );
    SubLFiles.declareFunction( me, "bless_pph_regression_item_to_pass_with_forces", "BLESS-PPH-REGRESSION-ITEM-TO-PASS-WITH-FORCES", 3, 0, false );
    SubLFiles.declareFunction( me, "gather_pph_regression_tests", "GATHER-PPH-REGRESSION-TESTS", 1, 2, false );
    SubLFiles.declareFunction( me, "mark_object_as_failing_pph_regression", "MARK-OBJECT-AS-FAILING-PPH-REGRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "bless_object_for_pph_regression", "BLESS-OBJECT-FOR-PPH-REGRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "doomed_objectP", "DOOMED-OBJECT?", 1, 0, false );
    SubLFiles.declareFunction( me, "test_object_doomedP", "TEST-OBJECT-DOOMED?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_regression_tracking_reset_skips", "PPH-REGRESSION-TRACKING-RESET-SKIPS", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_regression_tracking_formula_with_kb_gap", "PPH-REGRESSION-TRACKING-FORMULA-WITH-KB-GAP", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_regression_tracking_print_skips", "PPH-REGRESSION-TRACKING-PRINT-SKIPS", 0, 0, false );
    SubLFiles.declareMacro( me, "do_pph_regression_store", "DO-PPH-REGRESSION-STORE" );
    SubLFiles.declareMacro( me, "with_pph_test_object", "WITH-PPH-TEST-OBJECT" );
    SubLFiles.declareMacro( me, "do_pph_test_in_proper_mode", "DO-PPH-TEST-IN-PROPER-MODE" );
    return NIL;
  }

  public static SubLObject init_pph_regression_file()
  {
    $pph_tmp_regression_item$ = SubLFiles.defvar( "*PPH-TMP-REGRESSION-ITEM*", NIL );
    $pph_tmp_test_object$ = SubLFiles.defvar( "*PPH-TMP-TEST-OBJECT*", NIL );
    $pph_regression_failure_expectedP$ = SubLFiles.defvar( "*PPH-REGRESSION-FAILURE-EXPECTED?*", NIL );
    $pph_known_problem_objects$ = SubLFiles.defvar( "*PPH-KNOWN-PROBLEM-OBJECTS*", set.new_set( UNPROVIDED, UNPROVIDED ) );
    $pph_regression_current_test$ = SubLFiles.defvar( "*PPH-REGRESSION-CURRENT-TEST*", NIL );
    $pph_regression_hosed_by_kb$ = SubLFiles.defvar( "*PPH-REGRESSION-HOSED-BY-KB*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $pph_regression_trace_level$ = SubLFiles.defparameter( "*PPH-REGRESSION-TRACE-LEVEL*", ZERO_INTEGER );
    $dtp_pph_regression_item$ = SubLFiles.defconstant( "*DTP-PPH-REGRESSION-ITEM*", $sym16$PPH_REGRESSION_ITEM );
    $pph_regression_item_requires_all_args$ = SubLFiles.defvar( "*PPH-REGRESSION-ITEM-REQUIRES-ALL-ARGS*", NIL );
    $pph_regression_doomed_combinations$ = SubLFiles.defvar( "*PPH-REGRESSION-DOOMED-COMBINATIONS*", dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), TEN_INTEGER ) );
    $pph_regression_item_case_blessed$ = SubLFiles.defparameter( "*PPH-REGRESSION-ITEM-CASE-BLESSED*", NIL );
    $pph_regression_item_case_doomed$ = SubLFiles.defparameter( "*PPH-REGRESSION-ITEM-CASE-DOOMED*", T );
    return NIL;
  }

  public static SubLObject setup_pph_regression_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_pph_regression_item$.getGlobalValue(), Symbols.symbol_function( $sym23$PPH_REGRESSION_ITEM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list24 );
    Structures.def_csetf( $sym25$PPH_REGRESSION_ITEM_TEST_CASE, $sym26$_CSETF_PPH_REGRESSION_ITEM_TEST_CASE );
    Structures.def_csetf( $sym27$PPH_REGRESSION_ITEM_PURPOSE, $sym28$_CSETF_PPH_REGRESSION_ITEM_PURPOSE );
    Structures.def_csetf( $sym29$PPH_REGRESSION_ITEM_EXCUSED, $sym30$_CSETF_PPH_REGRESSION_ITEM_EXCUSED );
    Structures.def_csetf( $sym31$PPH_REGRESSION_ITEM_LANGUAGE_MT, $sym32$_CSETF_PPH_REGRESSION_ITEM_LANGUAGE_MT );
    Structures.def_csetf( $sym33$PPH_REGRESSION_ITEM_DOMAIN_MT, $sym34$_CSETF_PPH_REGRESSION_ITEM_DOMAIN_MT );
    Equality.identity( $sym16$PPH_REGRESSION_ITEM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_regression_item$.getGlobalValue(), Symbols.symbol_function(
        $sym45$VISIT_DEFSTRUCT_OBJECT_PPH_REGRESSION_ITEM_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_regression_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_regression_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_regression_file();
  }
  static
  {
    me = new pph_regression();
    $pph_tmp_regression_item$ = null;
    $pph_tmp_test_object$ = null;
    $pph_regression_failure_expectedP$ = null;
    $pph_known_problem_objects$ = null;
    $pph_regression_current_test$ = null;
    $pph_regression_hosed_by_kb$ = null;
    $pph_regression_trace_level$ = null;
    $dtp_pph_regression_item$ = null;
    $pph_regression_item_requires_all_args$ = null;
    $pph_regression_doomed_combinations$ = null;
    $pph_regression_item_case_blessed$ = null;
    $pph_regression_item_case_doomed$ = null;
    $list0 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "FORMAT-STR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym1$PWHEN = makeSymbol( "PWHEN" );
    $sym2$__ = makeSymbol( ">=" );
    $sym3$_PPH_REGRESSION_TRACE_LEVEL_ = makeSymbol( "*PPH-REGRESSION-TRACE-LEVEL*" );
    $sym4$WARN = makeSymbol( "WARN" );
    $list5 = ConsesLow.list( makeSymbol( "FORMAT-STR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $list6 = ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "*PPH-REGRESSION-FAILURE-EXPECTED?*" ) ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol(
        "*PPH-REGRESSION-TRACE-LEVEL*" ), TWO_INTEGER ) );
    $sym7$CLET = makeSymbol( "CLET" );
    $sym8$LOUD_WARNING = makeSymbol( "LOUD-WARNING" );
    $sym9$JOIN_STRINGS = makeSymbol( "JOIN-STRINGS" );
    $sym10$LIST = makeSymbol( "LIST" );
    $sym11$_EMPTY_STRING_ = makeSymbol( "*EMPTY-STRING*" );
    $str12$______PPH_REGRESSION_PROBLEM____ = makeString( "  *** PPH REGRESSION PROBLEM ***" );
    $list13 = ConsesLow.list( makeString( "  *** SEE BELOW FOR DETAILS ***" ) );
    $list14 = ConsesLow.list( makeString( "~%" ) );
    $str15$____PPH_REGRESSION_CASE_EXPECTED_ = makeString( "*** PPH REGRESSION CASE EXPECTED TO FAIL ~A BUT PASSED ... details:~%" );
    $sym16$PPH_REGRESSION_ITEM = makeSymbol( "PPH-REGRESSION-ITEM" );
    $sym17$PPH_REGRESSION_ITEM_P = makeSymbol( "PPH-REGRESSION-ITEM-P" );
    $list18 = ConsesLow.list( makeSymbol( "TEST-CASE" ), makeSymbol( "PURPOSE" ), makeSymbol( "EXCUSED" ), makeSymbol( "LANGUAGE-MT" ), makeSymbol( "DOMAIN-MT" ) );
    $list19 = ConsesLow.list( makeKeyword( "TEST-CASE" ), makeKeyword( "PURPOSE" ), makeKeyword( "EXCUSED" ), makeKeyword( "LANGUAGE-MT" ), makeKeyword( "DOMAIN-MT" ) );
    $list20 = ConsesLow.list( makeSymbol( "PPH-REGRESSION-ITEM-TEST-CASE" ), makeSymbol( "PPH-REGRESSION-ITEM-PURPOSE" ), makeSymbol( "PPH-REGRESSION-ITEM-EXCUSED" ), makeSymbol( "PPH-REGRESSION-ITEM-LANGUAGE-MT" ),
        makeSymbol( "PPH-REGRESSION-ITEM-DOMAIN-MT" ) );
    $list21 = ConsesLow.list( makeSymbol( "_CSETF-PPH-REGRESSION-ITEM-TEST-CASE" ), makeSymbol( "_CSETF-PPH-REGRESSION-ITEM-PURPOSE" ), makeSymbol( "_CSETF-PPH-REGRESSION-ITEM-EXCUSED" ), makeSymbol(
        "_CSETF-PPH-REGRESSION-ITEM-LANGUAGE-MT" ), makeSymbol( "_CSETF-PPH-REGRESSION-ITEM-DOMAIN-MT" ) );
    $sym22$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym23$PPH_REGRESSION_ITEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PPH-REGRESSION-ITEM-PRINT-FUNCTION-TRAMPOLINE" );
    $list24 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PPH-REGRESSION-ITEM-P" ) );
    $sym25$PPH_REGRESSION_ITEM_TEST_CASE = makeSymbol( "PPH-REGRESSION-ITEM-TEST-CASE" );
    $sym26$_CSETF_PPH_REGRESSION_ITEM_TEST_CASE = makeSymbol( "_CSETF-PPH-REGRESSION-ITEM-TEST-CASE" );
    $sym27$PPH_REGRESSION_ITEM_PURPOSE = makeSymbol( "PPH-REGRESSION-ITEM-PURPOSE" );
    $sym28$_CSETF_PPH_REGRESSION_ITEM_PURPOSE = makeSymbol( "_CSETF-PPH-REGRESSION-ITEM-PURPOSE" );
    $sym29$PPH_REGRESSION_ITEM_EXCUSED = makeSymbol( "PPH-REGRESSION-ITEM-EXCUSED" );
    $sym30$_CSETF_PPH_REGRESSION_ITEM_EXCUSED = makeSymbol( "_CSETF-PPH-REGRESSION-ITEM-EXCUSED" );
    $sym31$PPH_REGRESSION_ITEM_LANGUAGE_MT = makeSymbol( "PPH-REGRESSION-ITEM-LANGUAGE-MT" );
    $sym32$_CSETF_PPH_REGRESSION_ITEM_LANGUAGE_MT = makeSymbol( "_CSETF-PPH-REGRESSION-ITEM-LANGUAGE-MT" );
    $sym33$PPH_REGRESSION_ITEM_DOMAIN_MT = makeSymbol( "PPH-REGRESSION-ITEM-DOMAIN-MT" );
    $sym34$_CSETF_PPH_REGRESSION_ITEM_DOMAIN_MT = makeSymbol( "_CSETF-PPH-REGRESSION-ITEM-DOMAIN-MT" );
    $kw35$TEST_CASE = makeKeyword( "TEST-CASE" );
    $kw36$PURPOSE = makeKeyword( "PURPOSE" );
    $kw37$EXCUSED = makeKeyword( "EXCUSED" );
    $kw38$LANGUAGE_MT = makeKeyword( "LANGUAGE-MT" );
    $kw39$DOMAIN_MT = makeKeyword( "DOMAIN-MT" );
    $str40$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw41$BEGIN = makeKeyword( "BEGIN" );
    $sym42$MAKE_PPH_REGRESSION_ITEM = makeSymbol( "MAKE-PPH-REGRESSION-ITEM" );
    $kw43$SLOT = makeKeyword( "SLOT" );
    $kw44$END = makeKeyword( "END" );
    $sym45$VISIT_DEFSTRUCT_OBJECT_PPH_REGRESSION_ITEM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PPH-REGRESSION-ITEM-METHOD" );
    $sym46$PROPER_LIST_P = makeSymbol( "PROPER-LIST-P" );
    $sym47$HLMT_ = makeSymbol( "HLMT?" );
    $str48$updating_status_of__S__w_r_t__tes = makeString( "updating status of ~S~%w.r.t. test function ~S" );
    $str49$____marked_as_failing_with_force_ = makeString( "... marked as failing with force ~S" );
    $str50$____failing_to_mark_as_failing_un = makeString( "... failing to mark as failing under force ~S" );
    $str51$____now_blessed_as_passing_with_f = makeString( "... now blessed as passing with force ~S" );
    $str52$At_least_1_argument_for_gather_pp = makeString( "At least 1 argument for gather-pph-regression tests is required" );
    $const53$PPHRegressionPredicate = constant_handles.reader_make_constant_shell( makeString( "PPHRegressionPredicate" ) );
    $str54$KB_search = makeString( "KB search" );
    $str55$skipping_this_case_as_language_mt = makeString( "skipping this case as language-mt ~S fails regression:~%~S" );
    $str56$skipping_this_case_as_domain_mt__ = makeString( "skipping this case as domain-mt ~S fails regression:~%~S" );
    $sym57$INVALID_CONSTANT_ = makeSymbol( "INVALID-CONSTANT?" );
    $str58$_S_would_fail_regression__skippin = makeString( "~S would fail regression, skipping test case:~%~S" );
    $str59$_____ALERT___KB_ISSUES___ALERT___ = makeString( " *** ALERT * KB ISSUES * ALERT ***" );
    $str60$These_test_cases_were_skipped_due = makeString( "These test-cases were skipped due to constants missing from the KB:~%" );
    $str61$_S_in__S = makeString( "~S in ~S" );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "STORE" ), makeSymbol( "&KEY" ), makeSymbol( "TEST-FUNC" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list63 = ConsesLow.list( makeKeyword( "TEST-FUNC" ) );
    $kw64$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw65$TEST_FUNC = makeKeyword( "TEST-FUNC" );
    $sym66$DO_SET = makeSymbol( "DO-SET" );
    $sym67$_PPH_TMP_REGRESSION_ITEM_ = makeSymbol( "*PPH-TMP-REGRESSION-ITEM*" );
    $sym68$GATHER_PPH_REGRESSION_TESTS = makeSymbol( "GATHER-PPH-REGRESSION-TESTS" );
    $list69 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PPH-TMP-TEST-OBJECT*" ), ConsesLow.list( makeSymbol( "PPH-REGRESSION-ITEM-TEST-CASE" ), makeSymbol( "*PPH-TMP-REGRESSION-ITEM*" ) ) ) );
    $list70 = ConsesLow.list( makeSymbol( "TEST-FUNC" ), makeSymbol( "REG-SPECIFIC-FUNC" ) );
    $sym71$_PPH_REGRESSION_CURRENT_TEST_ = makeSymbol( "*PPH-REGRESSION-CURRENT-TEST*" );
    $sym72$FUNCALL_INSTANCE_METHOD = makeSymbol( "FUNCALL-INSTANCE-METHOD" );
    $sym73$SELF = makeSymbol( "SELF" );
    $list74 = ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "*PPH-REGRESSION-FAILURE-EXPECTED?*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FAIL-IF" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "FAIL-UNLESS" ) ) );
    $sym75$FUNCALL = makeSymbol( "FUNCALL" );
    $sym76$PPH_REGRESSION_DIAGNOSTICS = makeSymbol( "PPH-REGRESSION-DIAGNOSTICS" );
  }

  public static final class $pph_regression_item_native
      extends
        SubLStructNative
  {
    public SubLObject $test_case;
    public SubLObject $purpose;
    public SubLObject $excused;
    public SubLObject $language_mt;
    public SubLObject $domain_mt;
    private static final SubLStructDeclNative structDecl;

    public $pph_regression_item_native()
    {
      this.$test_case = CommonSymbols.NIL;
      this.$purpose = CommonSymbols.NIL;
      this.$excused = CommonSymbols.NIL;
      this.$language_mt = CommonSymbols.NIL;
      this.$domain_mt = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $pph_regression_item_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$test_case;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$purpose;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$excused;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$language_mt;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$domain_mt;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$test_case = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$purpose = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$excused = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$language_mt = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$domain_mt = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $pph_regression_item_native.class, $sym16$PPH_REGRESSION_ITEM, $sym17$PPH_REGRESSION_ITEM_P, $list18, $list19, new String[] { "$test_case", "$purpose", "$excused",
        "$language_mt", "$domain_mt"
      }, $list20, $list21, $sym22$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $pph_regression_item_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $pph_regression_item_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PPH-REGRESSION-ITEM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return pph_regression_item_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 194 ms synthetic
 */