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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class test_query_suite
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.test_query_suite";
  public static final String myFingerPrint = "5beca04baf5701f8aae2bf9f64a1e2f99633c4719b8e01845430f4e8016c8c9d";
  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLSymbol $dtp_test_query_suite$;
  private static final SubLSymbol $sym0$TEST_QUERY_SUITE;
  private static final SubLSymbol $sym1$TEST_QUERY_SUITE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$TEST_QUERY_SUITE_PRINT;
  private static final SubLSymbol $sym7$TEST_QUERY_SUITE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$TEST_STE_CYCL_ID;
  private static final SubLSymbol $sym10$_CSETF_TEST_STE_CYCL_ID;
  private static final SubLSymbol $sym11$TEST_STE_COMMENT;
  private static final SubLSymbol $sym12$_CSETF_TEST_STE_COMMENT;
  private static final SubLSymbol $sym13$TEST_STE_MT;
  private static final SubLSymbol $sym14$_CSETF_TEST_STE_MT;
  private static final SubLSymbol $sym15$TEST_STE_QUERIES;
  private static final SubLSymbol $sym16$_CSETF_TEST_STE_QUERIES;
  private static final SubLSymbol $kw17$CYCL_ID;
  private static final SubLSymbol $kw18$COMMENT;
  private static final SubLSymbol $kw19$MT;
  private static final SubLSymbol $kw20$QUERIES;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_TEST_QUERY_SUITE;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_TEST_QUERY_SUITE_METHOD;
  private static final SubLString $str27$___A_test_query_suite___;
  private static final SubLString $str28$_Aid___A__;
  private static final SubLString $str29$_Acomment___A__;
  private static final SubLString $str30$_Amt___A__;
  private static final SubLString $str31$_Aqueries_;
  private static final SubLString $str32$__S;
  private static final SubLString $str33$_;
  private static final SubLSymbol $sym34$CYCL_DENOTATIONAL_TERM_P;
  private static final SubLObject $const35$KBContentTestSpecificationType;
  private static final SubLString $str36$Got_bad_constant_id_in_test_query;
  private static final SubLSymbol $sym37$MICROTHEORY_P;
  private static final SubLObject $const38$isa;
  private static final SubLSymbol $sym39$_TEST;
  private static final SubLObject $const40$TestQueryFn;
  private static final SubLString $str41$;
  private static final SubLSymbol $sym42$STRING_LESSP;
  private static final SubLSymbol $sym43$CYCL_QUERY_SPECIFICATION_COMMENT_COMPARATOR;

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject test_query_suite_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    test_query_suite_print( v_object, stream, ZERO_INTEGER, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject test_query_suite_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $test_query_suite_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject test_ste_cycl_id(final SubLObject v_object)
  {
    assert NIL != test_query_suite_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject test_ste_comment(final SubLObject v_object)
  {
    assert NIL != test_query_suite_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject test_ste_mt(final SubLObject v_object)
  {
    assert NIL != test_query_suite_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject test_ste_queries(final SubLObject v_object)
  {
    assert NIL != test_query_suite_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject _csetf_test_ste_cycl_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != test_query_suite_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject _csetf_test_ste_comment(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != test_query_suite_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject _csetf_test_ste_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != test_query_suite_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject _csetf_test_ste_queries(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != test_query_suite_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject make_test_query_suite(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $test_query_suite_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw17$CYCL_ID ) )
      {
        _csetf_test_ste_cycl_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$COMMENT ) )
      {
        _csetf_test_ste_comment( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$MT ) )
      {
        _csetf_test_ste_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$QUERIES ) )
      {
        _csetf_test_ste_queries( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject visit_defstruct_test_query_suite(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_TEST_QUERY_SUITE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw17$CYCL_ID, test_ste_cycl_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw18$COMMENT, test_ste_comment( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$MT, test_ste_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$QUERIES, test_ste_queries( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_TEST_QUERY_SUITE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1025L)
  public static SubLObject visit_defstruct_object_test_query_suite_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_test_query_suite( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1405L)
  public static SubLObject test_query_suite_cycl_id(final SubLObject test_suite)
  {
    assert NIL != test_query_suite_p( test_suite ) : test_suite;
    return test_ste_cycl_id( test_suite );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1543L)
  public static SubLObject test_query_suite_comment(final SubLObject test_suite)
  {
    assert NIL != test_query_suite_p( test_suite ) : test_suite;
    return test_ste_comment( test_suite );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1681L)
  public static SubLObject test_query_suite_mt(final SubLObject test_suite)
  {
    assert NIL != test_query_suite_p( test_suite ) : test_suite;
    return test_ste_mt( test_suite );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1809L)
  public static SubLObject test_query_suite_queries(final SubLObject test_suite)
  {
    assert NIL != test_query_suite_p( test_suite ) : test_suite;
    return test_ste_queries( test_suite );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 1947L)
  public static SubLObject test_query_suite_print(final SubLObject tsuite, final SubLObject stream, final SubLObject depth, SubLObject verboseP)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    final SubLObject indent1 = Strings.make_string( depth, UNPROVIDED );
    final SubLObject indent2 = Strings.make_string( Numbers.add( depth, THREE_INTEGER ), UNPROVIDED );
    PrintLow.format( stream, $str27$___A_test_query_suite___, indent1 );
    PrintLow.format( stream, $str28$_Aid___A__, indent2, test_query_suite_cycl_id( tsuite ) );
    if( NIL != verboseP && test_query_suite_comment( tsuite ).isString() )
    {
      PrintLow.format( stream, $str29$_Acomment___A__, indent2, test_query_suite_comment( tsuite ) );
    }
    PrintLow.format( stream, $str30$_Amt___A__, indent2, test_query_suite_mt( tsuite ) );
    PrintLow.format( stream, $str31$_Aqueries_, indent2 );
    if( NIL != verboseP )
    {
      streams_high.terpri( stream );
      SubLObject cdolist_list_var = test_query_suite_queries( tsuite );
      SubLObject query = NIL;
      query = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cycl_query_specification.cycl_query_specification_print( query, stream, Numbers.add( THREE_INTEGER, depth ) );
        cdolist_list_var = cdolist_list_var.rest();
        query = cdolist_list_var.first();
      }
    }
    else
    {
      PrintLow.format( stream, $str32$__S, Sequences.length( test_query_suite_queries( tsuite ) ) );
    }
    print_high.princ( $str33$_, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 2816L)
  public static SubLObject test_query_suite_get(final SubLObject constant_id, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_grammar.cycl_denotational_term_p( constant_id ) : constant_id;
    if( NIL == isa.isaP( constant_id, $const35$KBContentTestSpecificationType, mt, UNPROVIDED ) )
    {
      Errors.error( $str36$Got_bad_constant_id_in_test_query );
    }
    if( NIL != mt && !assertionsDisabledInClass && NIL == fort_types_interface.microtheory_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    final SubLObject result = test_query_suite_new( constant_id, mt );
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      _csetf_test_ste_cycl_id( result, constant_id );
      thread.resetMultipleValues();
      final SubLObject values = fi.fi_ask_int( ConsesLow.list( $const38$isa, $sym39$_TEST, constant_id ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject v_answer = thread.secondMultipleValue();
      final SubLObject reason = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = values;
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        binding = binding.first().rest();
        _csetf_test_ste_queries( result, ConsesLow.nconc( test_ste_queries( result ), ConsesLow.list( cycl_query_specification.cycl_query_specification_get( ConsesLow.list( $const40$TestQueryFn, binding ), mt ) ) ) );
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 3856L)
  public static SubLObject test_query_suite_find_query_by_id(final SubLObject test_suite, final SubLObject query_id)
  {
    SubLObject result = NIL;
    if( NIL == result )
    {
      SubLObject csome_list_var = test_query_suite_queries( test_suite );
      SubLObject query = NIL;
      query = csome_list_var.first();
      while ( NIL == result && NIL != csome_list_var)
      {
        if( cycl_query_specification.cycl_query_specification_cycl_id( query ).equal( query_id ) )
        {
          result = query;
        }
        csome_list_var = csome_list_var.rest();
        query = csome_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 4131L)
  public static SubLObject test_query_suite_set_queries(final SubLObject test_suite, final SubLObject new_queries)
  {
    _csetf_test_ste_queries( test_suite, new_queries );
    return test_suite;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 4273L)
  public static SubLObject test_query_suite_find_query_siblings(final SubLObject test_suite, final SubLObject query)
  {
    return Sequences.remove( query, test_query_suite_queries( test_suite ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 4407L)
  public static SubLObject test_query_suite_new(final SubLObject id, final SubLObject mt)
  {
    final SubLObject result = make_test_query_suite( UNPROVIDED );
    _csetf_test_ste_cycl_id( result, id );
    _csetf_test_ste_comment( result, $str41$ );
    _csetf_test_ste_mt( result, ( NIL != function_terms.nat_formula_p( mt ) ) ? narts_high.find_nart( mt ) : mt );
    _csetf_test_ste_queries( result, NIL );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 4824L)
  public static SubLObject cycl_query_specification_comment_comparator(final SubLObject item_a, final SubLObject item_b)
  {
    if( NIL == cycl_query_specification.cycl_query_specification_comment( item_a ) )
    {
      if( NIL == cycl_query_specification.cycl_query_specification_comment( item_b ) )
      {
        return T;
      }
      return NIL;
    }
    else
    {
      if( NIL == cycl_query_specification.cycl_query_specification_comment( item_b ) )
      {
        return T;
      }
      return Functions.funcall( Symbols.symbol_function( $sym42$STRING_LESSP ), cycl_query_specification.cycl_query_specification_comment( item_a ), cycl_query_specification.cycl_query_specification_comment( item_b ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/test-query-suite.lisp", position = 5263L)
  public static SubLObject test_query_suite_sort_by_comment(final SubLObject test_suite)
  {
    _csetf_test_ste_queries( test_suite, Sort.sort( test_query_suite_queries( test_suite ), Symbols.symbol_function( $sym43$CYCL_QUERY_SPECIFICATION_COMMENT_COMPARATOR ), UNPROVIDED ) );
    return test_suite;
  }

  public static SubLObject declare_test_query_suite_file()
  {
    SubLFiles.declareFunction( me, "test_query_suite_print_function_trampoline", "TEST-QUERY-SUITE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "test_query_suite_p", "TEST-QUERY-SUITE-P", 1, 0, false );
    new $test_query_suite_p$UnaryFunction();
    SubLFiles.declareFunction( me, "test_ste_cycl_id", "TEST-STE-CYCL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "test_ste_comment", "TEST-STE-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "test_ste_mt", "TEST-STE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "test_ste_queries", "TEST-STE-QUERIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_test_ste_cycl_id", "_CSETF-TEST-STE-CYCL-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_test_ste_comment", "_CSETF-TEST-STE-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_test_ste_mt", "_CSETF-TEST-STE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_test_ste_queries", "_CSETF-TEST-STE-QUERIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_test_query_suite", "MAKE-TEST-QUERY-SUITE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_test_query_suite", "VISIT-DEFSTRUCT-TEST-QUERY-SUITE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_test_query_suite_method", "VISIT-DEFSTRUCT-OBJECT-TEST-QUERY-SUITE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "test_query_suite_cycl_id", "TEST-QUERY-SUITE-CYCL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "test_query_suite_comment", "TEST-QUERY-SUITE-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "test_query_suite_mt", "TEST-QUERY-SUITE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "test_query_suite_queries", "TEST-QUERY-SUITE-QUERIES", 1, 0, false );
    SubLFiles.declareFunction( me, "test_query_suite_print", "TEST-QUERY-SUITE-PRINT", 3, 1, false );
    SubLFiles.declareFunction( me, "test_query_suite_get", "TEST-QUERY-SUITE-GET", 1, 1, false );
    SubLFiles.declareFunction( me, "test_query_suite_find_query_by_id", "TEST-QUERY-SUITE-FIND-QUERY-BY-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "test_query_suite_set_queries", "TEST-QUERY-SUITE-SET-QUERIES", 2, 0, false );
    SubLFiles.declareFunction( me, "test_query_suite_find_query_siblings", "TEST-QUERY-SUITE-FIND-QUERY-SIBLINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "test_query_suite_new", "TEST-QUERY-SUITE-NEW", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_query_specification_comment_comparator", "CYCL-QUERY-SPECIFICATION-COMMENT-COMPARATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "test_query_suite_sort_by_comment", "TEST-QUERY-SUITE-SORT-BY-COMMENT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_test_query_suite_file()
  {
    $dtp_test_query_suite$ = SubLFiles.defconstant( "*DTP-TEST-QUERY-SUITE*", $sym0$TEST_QUERY_SUITE );
    return NIL;
  }

  public static SubLObject setup_test_query_suite_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_test_query_suite$.getGlobalValue(), Symbols.symbol_function( $sym7$TEST_QUERY_SUITE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$TEST_STE_CYCL_ID, $sym10$_CSETF_TEST_STE_CYCL_ID );
    Structures.def_csetf( $sym11$TEST_STE_COMMENT, $sym12$_CSETF_TEST_STE_COMMENT );
    Structures.def_csetf( $sym13$TEST_STE_MT, $sym14$_CSETF_TEST_STE_MT );
    Structures.def_csetf( $sym15$TEST_STE_QUERIES, $sym16$_CSETF_TEST_STE_QUERIES );
    Equality.identity( $sym0$TEST_QUERY_SUITE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_test_query_suite$.getGlobalValue(), Symbols.symbol_function(
        $sym26$VISIT_DEFSTRUCT_OBJECT_TEST_QUERY_SUITE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_test_query_suite_file();
  }

  @Override
  public void initializeVariables()
  {
    init_test_query_suite_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_test_query_suite_file();
  }
  static
  {
    me = new test_query_suite();
    $dtp_test_query_suite$ = null;
    $sym0$TEST_QUERY_SUITE = makeSymbol( "TEST-QUERY-SUITE" );
    $sym1$TEST_QUERY_SUITE_P = makeSymbol( "TEST-QUERY-SUITE-P" );
    $list2 = ConsesLow.list( makeSymbol( "CYCL-ID" ), makeSymbol( "COMMENT" ), makeSymbol( "MT" ), makeSymbol( "QUERIES" ) );
    $list3 = ConsesLow.list( makeKeyword( "CYCL-ID" ), makeKeyword( "COMMENT" ), makeKeyword( "MT" ), makeKeyword( "QUERIES" ) );
    $list4 = ConsesLow.list( makeSymbol( "TEST-STE-CYCL-ID" ), makeSymbol( "TEST-STE-COMMENT" ), makeSymbol( "TEST-STE-MT" ), makeSymbol( "TEST-STE-QUERIES" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-TEST-STE-CYCL-ID" ), makeSymbol( "_CSETF-TEST-STE-COMMENT" ), makeSymbol( "_CSETF-TEST-STE-MT" ), makeSymbol( "_CSETF-TEST-STE-QUERIES" ) );
    $sym6$TEST_QUERY_SUITE_PRINT = makeSymbol( "TEST-QUERY-SUITE-PRINT" );
    $sym7$TEST_QUERY_SUITE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TEST-QUERY-SUITE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TEST-QUERY-SUITE-P" ) );
    $sym9$TEST_STE_CYCL_ID = makeSymbol( "TEST-STE-CYCL-ID" );
    $sym10$_CSETF_TEST_STE_CYCL_ID = makeSymbol( "_CSETF-TEST-STE-CYCL-ID" );
    $sym11$TEST_STE_COMMENT = makeSymbol( "TEST-STE-COMMENT" );
    $sym12$_CSETF_TEST_STE_COMMENT = makeSymbol( "_CSETF-TEST-STE-COMMENT" );
    $sym13$TEST_STE_MT = makeSymbol( "TEST-STE-MT" );
    $sym14$_CSETF_TEST_STE_MT = makeSymbol( "_CSETF-TEST-STE-MT" );
    $sym15$TEST_STE_QUERIES = makeSymbol( "TEST-STE-QUERIES" );
    $sym16$_CSETF_TEST_STE_QUERIES = makeSymbol( "_CSETF-TEST-STE-QUERIES" );
    $kw17$CYCL_ID = makeKeyword( "CYCL-ID" );
    $kw18$COMMENT = makeKeyword( "COMMENT" );
    $kw19$MT = makeKeyword( "MT" );
    $kw20$QUERIES = makeKeyword( "QUERIES" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_TEST_QUERY_SUITE = makeSymbol( "MAKE-TEST-QUERY-SUITE" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_TEST_QUERY_SUITE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TEST-QUERY-SUITE-METHOD" );
    $str27$___A_test_query_suite___ = makeString( "~%~A<test-query-suite:~%" );
    $str28$_Aid___A__ = makeString( "~Aid: ~A~%" );
    $str29$_Acomment___A__ = makeString( "~Acomment: ~A~%" );
    $str30$_Amt___A__ = makeString( "~Amt: ~A~%" );
    $str31$_Aqueries_ = makeString( "~Aqueries:" );
    $str32$__S = makeString( " ~S" );
    $str33$_ = makeString( ">" );
    $sym34$CYCL_DENOTATIONAL_TERM_P = makeSymbol( "CYCL-DENOTATIONAL-TERM-P" );
    $const35$KBContentTestSpecificationType = constant_handles.reader_make_constant_shell( makeString( "KBContentTestSpecificationType" ) );
    $str36$Got_bad_constant_id_in_test_query = makeString( "Got bad constant-id in test-query-suite-get!" );
    $sym37$MICROTHEORY_P = makeSymbol( "MICROTHEORY-P" );
    $const38$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym39$_TEST = makeSymbol( "?TEST" );
    $const40$TestQueryFn = constant_handles.reader_make_constant_shell( makeString( "TestQueryFn" ) );
    $str41$ = makeString( "" );
    $sym42$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym43$CYCL_QUERY_SPECIFICATION_COMMENT_COMPARATOR = makeSymbol( "CYCL-QUERY-SPECIFICATION-COMMENT-COMPARATOR" );
  }

  public static final class $test_query_suite_native
      extends
        SubLStructNative
  {
    public SubLObject $cycl_id;
    public SubLObject $comment;
    public SubLObject $mt;
    public SubLObject $queries;
    private static final SubLStructDeclNative structDecl;

    public $test_query_suite_native()
    {
      this.$cycl_id = CommonSymbols.NIL;
      this.$comment = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$queries = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $test_query_suite_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$cycl_id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$comment;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$queries;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$cycl_id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$comment = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$queries = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $test_query_suite_native.class, $sym0$TEST_QUERY_SUITE, $sym1$TEST_QUERY_SUITE_P, $list2, $list3, new String[] { "$cycl_id", "$comment", "$mt", "$queries"
      }, $list4, $list5, $sym6$TEST_QUERY_SUITE_PRINT );
    }
  }

  public static final class $test_query_suite_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $test_query_suite_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TEST-QUERY-SUITE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return test_query_suite_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 84 ms synthetic
 */