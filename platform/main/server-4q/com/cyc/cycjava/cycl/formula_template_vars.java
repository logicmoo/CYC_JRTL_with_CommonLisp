package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class formula_template_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.formula_template_vars";
  public static final String myFingerPrint = "c0e085f4caa2fd7f4ef2b995742da4895488ddf4ac910e77bd8d008d2dd0991d";
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 951L)
  public static SubLSymbol $template_topic_memoization$;
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 1216L)
  public static SubLSymbol $formula_template_autoexpand_candidate_replacementsP$;
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 1690L)
  public static SubLSymbol $template_topic_problem_store$;
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 1764L)
  private static SubLSymbol $template_topic_problem_stores$;
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 4041L)
  public static SubLSymbol $use_formula_template_candidate_replacements_auto_expand$;
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 4284L)
  public static SubLSymbol $default_assertion_template_elmt$;
  private static final SubLSymbol $sym0$CLET;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$PROGN;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$_FORMULA_TEMPLATE_AUTOEXPAND_CANDIDATE_REPLACEMENTS__;
  private static final SubLSymbol $kw5$UNINITIALIZED;
  private static final SubLSymbol $sym6$FIND_OR_CREATE_TEMPLATE_TOPIC_PROBLEM_STORE;
  private static final SubLSymbol $sym7$WITH_TEMPLATE_TOPIC_PROBLEM_STORE;
  private static final SubLSymbol $sym8$DESTROY_TEMPLATE_TOPIC_PROBLEM_STORE;
  private static final SubLSymbol $sym9$REUSED_;
  private static final SubLSymbol $sym10$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym11$_TEMPLATE_TOPIC_PROBLEM_STORE_;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$CUNWIND_PROTECT;
  private static final SubLSymbol $sym14$PUNLESS;
  private static final SubLSymbol $sym15$COR;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$TEMPLATE_TOPIC_PROBLEM_STORE_HAS_BROWSABLE_INFERENCE_;
  private static final SubLSymbol $kw19$SKIP;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$DO_HASH_TABLE;
  private static final SubLSymbol $sym22$WITH_MEMOIZATION_STATE;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$_DEFAULT_ASSERTION_TEMPLATE_ELMT_;

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 1034L)
  public static SubLObject get_template_topic_memoization_state()
  {
    return memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 1300L)
  public static SubLObject with_candidate_replacements_auto_expand(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym0$CLET, $list1, reader.bq_cons( $sym2$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 1485L)
  public static SubLObject with_candidate_replacements_auto_expand_value(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym4$_FORMULA_TEMPLATE_AUTOEXPAND_CANDIDATE_REPLACEMENTS__, value ) ), reader.bq_cons( $sym2$PROGN, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 1855L)
  public static SubLObject get_template_topic_problem_store()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw5$UNINITIALIZED == $template_topic_problem_store$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( NIL == template_topic_problem_store_okP() )
    {
      if( NIL != inference_datastructures_problem_store.problem_store_p( $template_topic_problem_store$.getDynamicValue( thread ) ) )
      {
        destroy_template_topic_problem_store( UNPROVIDED );
      }
      $template_topic_problem_store$.setDynamicValue( new_template_topic_problem_store(), thread );
    }
    return $template_topic_problem_store$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 2266L)
  public static SubLObject find_or_create_template_topic_problem_store()
  {
    final SubLObject store = get_template_topic_problem_store();
    final SubLObject reusedP = list_utilities.sublisp_boolean( store );
    return Values.values( ( NIL != store ) ? store : new_template_topic_problem_store(), reusedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 2545L)
  public static SubLObject new_template_topic_problem_store()
  {
    final SubLObject store = inference_datastructures_problem_store.new_problem_store( UNPROVIDED );
    $template_topic_problem_stores$.setGlobalValue( ConsesLow.cons( store, $template_topic_problem_stores$.getGlobalValue() ) );
    return store;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 2704L)
  public static SubLObject destroy_template_topic_problem_store(SubLObject store)
  {
    if( store == UNPROVIDED )
    {
      store = $template_topic_problem_store$.getDynamicValue();
    }
    $template_topic_problem_stores$.setGlobalValue( Sequences.delete( store, $template_topic_problem_stores$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return inference_datastructures_problem_store.destroy_problem_store( store );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 2999L)
  public static SubLObject template_topic_problem_store_okP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return inference_datastructures_problem_store.valid_problem_store_p( $template_topic_problem_store$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 3118L)
  public static SubLObject with_template_topic_problem_store(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject reusedP = $sym9$REUSED_;
    return ConsesLow.list( $sym10$CMULTIPLE_VALUE_BIND, ConsesLow.list( $sym11$_TEMPLATE_TOPIC_PROBLEM_STORE_, reusedP ), $list12, ConsesLow.list( $sym13$CUNWIND_PROTECT, reader.bq_cons( $sym2$PROGN, ConsesLow.append(
        body, NIL ) ), ConsesLow.listS( $sym14$PUNLESS, ConsesLow.listS( $sym15$COR, reusedP, $list16 ), $list17 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 3520L)
  public static SubLObject template_topic_problem_store_has_browsable_inferenceP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return problem_store_has_browsable_inferenceP( $template_topic_problem_store$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 3725L)
  public static SubLObject problem_store_has_browsable_inferenceP(final SubLObject store)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw19$SKIP ) )
      {
        final SubLObject idx_$1 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw19$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
          final SubLObject backwardP_var = NIL;
          final SubLObject length = Sequences.length( vector_var );
          SubLObject current;
          final SubLObject datum = current = ( NIL != backwardP_var ) ? ConsesLow.list( Numbers.subtract( length, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER )
              : ConsesLow.list( ZERO_INTEGER, length, ONE_INTEGER );
          SubLObject start = NIL;
          SubLObject end = NIL;
          SubLObject delta = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
          start = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
          end = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
          delta = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL == ans )
            {
              SubLObject end_var;
              SubLObject id;
              SubLObject inference;
              for( end_var = end, id = NIL, id = start; NIL == ans && NIL == subl_macros.do_numbers_endtest( id, delta, end_var ); id = Numbers.add( id, delta ) )
              {
                inference = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw19$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( inference ) )
                  {
                    inference = $kw19$SKIP;
                  }
                  ans = inference_datastructures_inference.inference_browsableP( inference );
                }
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
          }
        }
        final SubLObject idx_$2 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) && NIL == ans )
        {
          SubLObject catch_var = NIL;
          try
          {
            thread.throwStack.push( $kw21$DO_HASH_TABLE );
            final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$2 );
            SubLObject id2 = NIL;
            SubLObject inference2 = NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
            try
            {
              while ( Hashtables.iteratorHasNext( cdohash_iterator ))
              {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
                id2 = Hashtables.getEntryKey( cdohash_entry );
                inference2 = Hashtables.getEntryValue( cdohash_entry );
                subl_macros.do_hash_table_done_check( ans );
                ans = inference_datastructures_inference.inference_browsableP( inference2 );
              }
            }
            finally
            {
              Hashtables.releaseEntrySetIterator( cdohash_iterator );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            catch_var = Errors.handleThrowable( ccatch_env_var, $kw21$DO_HASH_TABLE );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 4125L)
  public static SubLObject with_template_topic_memoization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym22$WITH_MEMOIZATION_STATE, $list23, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-vars.lisp", position = 4349L)
  public static SubLObject with_default_assertion_template_elmt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject elmt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    elmt = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym25$_DEFAULT_ASSERTION_TEMPLATE_ELMT_, elmt ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
    return NIL;
  }

  public static SubLObject declare_formula_template_vars_file()
  {
    SubLFiles.declareFunction( me, "get_template_topic_memoization_state", "GET-TEMPLATE-TOPIC-MEMOIZATION-STATE", 0, 0, false );
    SubLFiles.declareMacro( me, "with_candidate_replacements_auto_expand", "WITH-CANDIDATE-REPLACEMENTS-AUTO-EXPAND" );
    SubLFiles.declareMacro( me, "with_candidate_replacements_auto_expand_value", "WITH-CANDIDATE-REPLACEMENTS-AUTO-EXPAND-VALUE" );
    SubLFiles.declareFunction( me, "get_template_topic_problem_store", "GET-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_template_topic_problem_store", "FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "new_template_topic_problem_store", "NEW-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "destroy_template_topic_problem_store", "DESTROY-TEMPLATE-TOPIC-PROBLEM-STORE", 0, 1, false );
    SubLFiles.declareFunction( me, "template_topic_problem_store_okP", "TEMPLATE-TOPIC-PROBLEM-STORE-OK?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_template_topic_problem_store", "WITH-TEMPLATE-TOPIC-PROBLEM-STORE" );
    SubLFiles.declareFunction( me, "template_topic_problem_store_has_browsable_inferenceP", "TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?", 0, 0, false );
    SubLFiles.declareFunction( me, "problem_store_has_browsable_inferenceP", "PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?", 1, 0, false );
    SubLFiles.declareMacro( me, "with_template_topic_memoization", "WITH-TEMPLATE-TOPIC-MEMOIZATION" );
    SubLFiles.declareMacro( me, "with_default_assertion_template_elmt", "WITH-DEFAULT-ASSERTION-TEMPLATE-ELMT" );
    return NIL;
  }

  public static SubLObject init_formula_template_vars_file()
  {
    $template_topic_memoization$ = SubLFiles.deflexical( "*TEMPLATE-TOPIC-MEMOIZATION*", memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    $formula_template_autoexpand_candidate_replacementsP$ = SubLFiles.defparameter( "*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*", NIL );
    $template_topic_problem_store$ = SubLFiles.defparameter( "*TEMPLATE-TOPIC-PROBLEM-STORE*", $kw5$UNINITIALIZED );
    $template_topic_problem_stores$ = SubLFiles.deflexical( "*TEMPLATE-TOPIC-PROBLEM-STORES*", NIL );
    $use_formula_template_candidate_replacements_auto_expand$ = SubLFiles.deflexical( "*USE-FORMULA-TEMPLATE-CANDIDATE-REPLACEMENTS-AUTO-EXPAND*", T );
    $default_assertion_template_elmt$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-TEMPLATE-ELMT*", NIL );
    return NIL;
  }

  public static SubLObject setup_formula_template_vars_file()
  {
    access_macros.register_macro_helper( $sym6$FIND_OR_CREATE_TEMPLATE_TOPIC_PROBLEM_STORE, $sym7$WITH_TEMPLATE_TOPIC_PROBLEM_STORE );
    access_macros.register_macro_helper( $sym8$DESTROY_TEMPLATE_TOPIC_PROBLEM_STORE, $sym7$WITH_TEMPLATE_TOPIC_PROBLEM_STORE );
    access_macros.register_macro_helper( $sym18$TEMPLATE_TOPIC_PROBLEM_STORE_HAS_BROWSABLE_INFERENCE_, $sym7$WITH_TEMPLATE_TOPIC_PROBLEM_STORE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_formula_template_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_formula_template_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_formula_template_vars_file();
  }
  static
  {
    me = new formula_template_vars();
    $template_topic_memoization$ = null;
    $formula_template_autoexpand_candidate_replacementsP$ = null;
    $template_topic_problem_store$ = null;
    $template_topic_problem_stores$ = null;
    $use_formula_template_candidate_replacements_auto_expand$ = null;
    $default_assertion_template_elmt$ = null;
    $sym0$CLET = makeSymbol( "CLET" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*" ), T ) );
    $sym2$PROGN = makeSymbol( "PROGN" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym4$_FORMULA_TEMPLATE_AUTOEXPAND_CANDIDATE_REPLACEMENTS__ = makeSymbol( "*FORMULA-TEMPLATE-AUTOEXPAND-CANDIDATE-REPLACEMENTS?*" );
    $kw5$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym6$FIND_OR_CREATE_TEMPLATE_TOPIC_PROBLEM_STORE = makeSymbol( "FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE" );
    $sym7$WITH_TEMPLATE_TOPIC_PROBLEM_STORE = makeSymbol( "WITH-TEMPLATE-TOPIC-PROBLEM-STORE" );
    $sym8$DESTROY_TEMPLATE_TOPIC_PROBLEM_STORE = makeSymbol( "DESTROY-TEMPLATE-TOPIC-PROBLEM-STORE" );
    $sym9$REUSED_ = makeUninternedSymbol( "REUSED?" );
    $sym10$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym11$_TEMPLATE_TOPIC_PROBLEM_STORE_ = makeSymbol( "*TEMPLATE-TOPIC-PROBLEM-STORE*" );
    $list12 = ConsesLow.list( makeSymbol( "FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE" ) );
    $sym13$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym14$PUNLESS = makeSymbol( "PUNLESS" );
    $sym15$COR = makeSymbol( "COR" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?" ) ) );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "DESTROY-TEMPLATE-TOPIC-PROBLEM-STORE" ) ) );
    $sym18$TEMPLATE_TOPIC_PROBLEM_STORE_HAS_BROWSABLE_INFERENCE_ = makeSymbol( "TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?" );
    $kw19$SKIP = makeKeyword( "SKIP" );
    $list20 = ConsesLow.list( makeUninternedSymbol( "START" ), makeUninternedSymbol( "END" ), makeUninternedSymbol( "DELTA" ) );
    $kw21$DO_HASH_TABLE = makeKeyword( "DO-HASH-TABLE" );
    $sym22$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-TEMPLATE-TOPIC-MEMOIZATION-STATE" ) ) );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "ELMT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym25$_DEFAULT_ASSERTION_TEMPLATE_ELMT_ = makeSymbol( "*DEFAULT-ASSERTION-TEMPLATE-ELMT*" );
  }
}
/*
 * 
 * Total time: 166 ms
 * 
 */