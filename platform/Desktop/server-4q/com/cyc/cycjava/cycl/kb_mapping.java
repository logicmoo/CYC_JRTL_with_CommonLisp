package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_mapping
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_mapping";
  public static final String myFingerPrint = "948b315c8141b19a9c6dd06ab5ce436dce262225c9f4a4cd0623b39f6dae6ff3";
  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 1577L)
  private static SubLSymbol $mapping_function$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 1666L)
  private static SubLSymbol $mapping_truth$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 1713L)
  private static SubLSymbol $mapping_direction$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 14244L)
  private static SubLSymbol $map_term_selective_test$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 14300L)
  private static SubLSymbol $map_term_selective_action$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PRED;
  private static final SubLSymbol $sym2$DO_INTERMEDIATE_INDEX;
  private static final SubLSymbol $sym3$PWHEN;
  private static final SubLSymbol $sym4$RELEVANT_PRED_;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$MT;
  private static final SubLSymbol $sym7$RELEVANT_MT_;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$CANDIDATE_DIRECTION;
  private static final SubLSymbol $sym10$COR;
  private static final SubLSymbol $sym11$NULL;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$DO_FINAL_INDEX;
  private static final SubLSymbol $sym14$ASSERTION_MATCHES_TRUTH_;
  private static final SubLSymbol $sym15$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym16$POSITIVE_INTEGER_P;
  private static final SubLSymbol $kw17$MAPPING_DONE;
  private static final SubLSymbol $kw18$GAF;
  private static final SubLSymbol $sym19$SENSE_P;
  private static final SubLSymbol $kw20$RULE;
  private static final SubLSymbol $sym21$MAP_TERM;
  private static final SubLList $list22;
  private static final SubLString $str23$Apply_FUNCTION_to_each_assertion_;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$MAP_TERM_SELECTIVE_INTERNAL;
  private static final SubLSymbol $sym27$MAP_TERM_SELECTIVE;
  private static final SubLList $list28;
  private static final SubLString $str29$Apply_FUNCTION_to_each_assertion_;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$MAP_TERM_GAFS;
  private static final SubLList $list32;
  private static final SubLString $str33$Apply_FUNCTION_to_every_gaf_index;
  private static final SubLString $str34$mapping_broad_mt_index;
  private static final SubLSymbol $sym35$STRINGP;
  private static final SubLSymbol $kw36$SKIP;
  private static final SubLSymbol $sym37$MAP_MT_CONTENTS;
  private static final SubLList $list38;
  private static final SubLString $str39$Apply_FUNCTION_to_each_assertion_;
  private static final SubLSymbol $sym40$MAP_MT_INDEX;
  private static final SubLList $list41;
  private static final SubLString $str42$Apply_FUNCTION_to_each_assertion_;
  private static final SubLSymbol $sym43$MAP_HLMT_CONTENTS;
  private static final SubLSymbol $sym44$MAP_HLMT_INDEX;
  private static final SubLSymbol $sym45$MAP_OTHER_INDEX;
  private static final SubLString $str46$Apply_FUNCTION_to_each_assertion_;
  private static final SubLSymbol $sym47$GATHER_INDEX;
  private static final SubLList $list48;
  private static final SubLString $str49$Return_a_list_of_all_mt_relevant_;
  private static final SubLList $list50;
  private static final SubLString $str51$So_don_t_;
  private static final SubLString $str52$Can_t_gather_unknown_auxiliary_in;
  private static final SubLSymbol $sym53$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const54$EverythingPSC;
  private static final SubLSymbol $sym55$GATHER_INDEX_IN_ANY_MT;
  private static final SubLString $str56$Return_a_list_of_all_assertions_i;
  private static final SubLSymbol $kw57$TRUE;
  private static final SubLSymbol $sym58$GATHER_GAF_ARG_INDEX;
  private static final SubLList $list59;
  private static final SubLString $str60$Return_a_list_of_all_gaf_assertio;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$GATHER_GAF_ARG_INDEX_WITH_PREDICATE;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$GATHER_NART_ARG_INDEX;
  private static final SubLList $list65;
  private static final SubLString $str66$Return_a_list_of_all___termOfUnit;
  private static final SubLSymbol $sym67$GATHER_PREDICATE_EXTENT_INDEX;
  private static final SubLList $list68;
  private static final SubLString $str69$Return_a_list_of_all_gaf_assertio;
  private static final SubLSymbol $sym70$GATHER_FUNCTION_EXTENT_INDEX;
  private static final SubLList $list71;
  private static final SubLString $str72$Return_a_list_of_all___termOfUnit;
  private static final SubLSymbol $sym73$GATHER_PREDICATE_RULE_INDEX;
  private static final SubLList $list74;
  private static final SubLString $str75$Return_a_list_of_all_non_gaf_asse;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$GATHER_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX;
  private static final SubLList $list78;
  private static final SubLString $str79$Return_a_list_of_all_non_gaf_asse;
  private static final SubLSymbol $sym80$GATHER_ISA_RULE_INDEX;
  private static final SubLList $list81;
  private static final SubLString $str82$Return_a_list_of_all_non_gaf_asse;
  private static final SubLSymbol $sym83$GATHER_QUOTED_ISA_RULE_INDEX;
  private static final SubLString $str84$Return_a_list_of_all_non_gaf_asse;
  private static final SubLSymbol $sym85$GATHER_GENLS_RULE_INDEX;
  private static final SubLString $str86$Return_a_list_of_all_non_gaf_asse;
  private static final SubLSymbol $sym87$GATHER_GENL_MT_RULE_INDEX;
  private static final SubLList $list88;
  private static final SubLString $str89$Return_a_list_of_all_non_gaf_asse;
  private static final SubLSymbol $sym90$GATHER_FUNCTION_RULE_INDEX;
  private static final SubLList $list91;
  private static final SubLString $str92$Return_a_list_of_all_non_gaf_asse;
  private static final SubLSymbol $sym93$GATHER_EXCEPTION_RULE_INDEX;
  private static final SubLList $list94;
  private static final SubLString $str95$Return_a_list_of_all_non_gaf_asse;
  private static final SubLSymbol $sym96$GATHER_PRAGMA_RULE_INDEX;
  private static final SubLString $str97$Return_a_list_of_all_non_gaf_asse;
  private static final SubLSymbol $sym98$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $sym99$GATHER_ASSERTIONS;
  private static final SubLSymbol $sym100$GATHER_MT_INDEX;
  private static final SubLList $list101;
  private static final SubLString $str102$Return_a_list_of_all_assertions_s;
  private static final SubLSymbol $sym103$GATHER_OTHER_INDEX;
  private static final SubLString $str104$Return_a_list_of_other_assertions;
  private static final SubLSymbol $sym105$GATHER_TERM_ASSERTIONS;
  private static final SubLList $list106;
  private static final SubLString $str107$Return_a_list_of_all_mt_relevant_;
  private static final SubLSymbol $sym108$FORT_P;
  private static final SubLSymbol $sym109$GATHER_META_ASSERTIONS;

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 1760L)
  public static SubLObject do_intermediate_index_relevant_preds(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject subindex = NIL;
    SubLObject pred_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    pred_index = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject pred = $sym1$PRED;
      return ConsesLow.list( $sym2$DO_INTERMEDIATE_INDEX, ConsesLow.list( pred, subindex, pred_index ), ConsesLow.listS( $sym3$PWHEN, ConsesLow.list( $sym4$RELEVANT_PRED_, pred ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 1993L)
  public static SubLObject do_intermediate_index_relevant_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject subindex = NIL;
    SubLObject mt_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    mt_index = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject mt = $sym6$MT;
      return ConsesLow.list( $sym2$DO_INTERMEDIATE_INDEX, ConsesLow.list( mt, subindex, mt_index ), ConsesLow.listS( $sym3$PWHEN, ConsesLow.list( $sym7$RELEVANT_MT_, mt ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 2212L)
  public static SubLObject do_intermediate_index_with_direction(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject subindex = NIL;
    SubLObject direction_index = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    subindex = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    direction_index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    direction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject candidate_direction = $sym9$CANDIDATE_DIRECTION;
      return ConsesLow.list( $sym2$DO_INTERMEDIATE_INDEX, ConsesLow.list( candidate_direction, subindex, direction_index ), ConsesLow.listS( $sym3$PWHEN, ConsesLow.list( $sym10$COR, ConsesLow.list( $sym11$NULL,
          direction ), ConsesLow.list( EQ, candidate_direction, direction ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 2538L)
  public static SubLObject do_final_index_assertions_with_truth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject ass = NIL;
    SubLObject final_index = NIL;
    SubLObject truth = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    ass = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    final_index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    truth = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym13$DO_FINAL_INDEX, ConsesLow.list( ass, final_index ), ConsesLow.listS( $sym3$PWHEN, ConsesLow.list( $sym14$ASSERTION_MATCHES_TRUTH_, ass, truth ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 2740L)
  public static SubLObject map_gaf_arg_index(final SubLObject function, final SubLObject v_term, final SubLObject argnum, SubLObject pred, SubLObject truth, SubLObject mt)
  {
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != subl_promotions.positive_integer_p( argnum ) : argnum;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
        if( NIL != pred && NIL != truth )
        {
          final SubLObject pred_var = pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, truth, NIL );
                  SubLObject done_var_$1 = NIL;
                  final SubLObject token_var_$2 = NIL;
                  while ( NIL == done_var_$1)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                    final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( ass ) );
                    if( NIL != valid_$3 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$1 = makeBoolean( NIL == valid_$3 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL != pred && NIL == truth )
        {
          final SubLObject pred_var = pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
                  SubLObject done_var_$2 = NIL;
                  final SubLObject token_var_$3 = NIL;
                  while ( NIL == done_var_$2)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
                    final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( ass ) );
                    if( NIL != valid_$4 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$2 = makeBoolean( NIL == valid_$4 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL == pred && NIL != truth )
        {
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, truth, NIL );
                  SubLObject done_var_$3 = NIL;
                  final SubLObject token_var_$4 = NIL;
                  while ( NIL == done_var_$3)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                    final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( ass ) );
                    if( NIL != valid_$5 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$3 = makeBoolean( NIL == valid_$5 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL == pred && NIL == truth )
        {
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
                  SubLObject done_var_$4 = NIL;
                  final SubLObject token_var_$5 = NIL;
                  while ( NIL == done_var_$4)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                    final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( ass ) );
                    if( NIL != valid_$6 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$4 = makeBoolean( NIL == valid_$6 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 4063L)
  public static SubLObject map_predicate_extent_index(final SubLObject function, final SubLObject pred, SubLObject truth, SubLObject mt)
  {
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
        if( NIL != truth )
        {
          if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
          {
            final SubLObject str = NIL;
            final SubLObject _prev_bind_0_$17 = utilities_macros.$progress_start_time$.currentBinding( thread );
            final SubLObject _prev_bind_1_$18 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
            try
            {
              utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
              utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
              utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
              utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
              utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
              utilities_macros.$is_noting_progressP$.bind( T, thread );
              utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
              utilities_macros.noting_progress_preamble( str );
              final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred );
              SubLObject done_var = NIL;
              final SubLObject token_var = NIL;
              while ( NIL == done_var)
              {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                if( NIL != valid )
                {
                  utilities_macros.note_progress();
                  SubLObject final_index_iterator = NIL;
                  try
                  {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, truth, NIL );
                    SubLObject done_var_$19 = NIL;
                    final SubLObject token_var_$20 = NIL;
                    while ( NIL == done_var_$19)
                    {
                      final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$20 );
                      final SubLObject valid_$21 = makeBoolean( !token_var_$20.eql( ass ) );
                      if( NIL != valid_$21 )
                      {
                        Functions.funcall( function, ass );
                      }
                      done_var_$19 = makeBoolean( NIL == valid_$21 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      if( NIL != final_index_iterator )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                      }
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
              utilities_macros.noting_progress_postamble();
            }
            finally
            {
              utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
              utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
              utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
              utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
              utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
              utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$18, thread );
              utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$17, thread );
            }
          }
        }
        else if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$19 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$19 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
                  SubLObject done_var_$20 = NIL;
                  final SubLObject token_var_$21 = NIL;
                  while ( NIL == done_var_$20)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$21 );
                    final SubLObject valid_$22 = makeBoolean( !token_var_$21.eql( ass ) );
                    if( NIL != valid_$22 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$20 = makeBoolean( NIL == valid_$22 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$19, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$19, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 4660L)
  public static SubLObject map_nart_arg_index(final SubLObject subl_function, final SubLObject v_term, SubLObject argnum, SubLObject cycl_function)
  {
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    if( cycl_function == UNPROVIDED )
    {
      cycl_function = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( subl_function ) : subl_function;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      if( NIL != argnum && NIL != cycl_function )
      {
        if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, argnum, cycl_function ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, argnum, cycl_function );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
                SubLObject done_var_$29 = NIL;
                final SubLObject token_var_$30 = NIL;
                while ( NIL == done_var_$29)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$30 );
                  final SubLObject valid_$31 = makeBoolean( !token_var_$30.eql( ass ) );
                  if( NIL != valid_$31 )
                  {
                    Functions.funcall( subl_function, ass );
                  }
                  done_var_$29 = makeBoolean( NIL == valid_$31 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != argnum && NIL == cycl_function )
      {
        if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, argnum, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, argnum, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
                SubLObject done_var_$30 = NIL;
                final SubLObject token_var_$31 = NIL;
                while ( NIL == done_var_$30)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$31 );
                  final SubLObject valid_$32 = makeBoolean( !token_var_$31.eql( ass ) );
                  if( NIL != valid_$32 )
                  {
                    Functions.funcall( subl_function, ass );
                  }
                  done_var_$30 = makeBoolean( NIL == valid_$32 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL == argnum && NIL != cycl_function )
      {
        if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, NIL, cycl_function ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, NIL, cycl_function );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
                SubLObject done_var_$31 = NIL;
                final SubLObject token_var_$32 = NIL;
                while ( NIL == done_var_$31)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$32 );
                  final SubLObject valid_$33 = makeBoolean( !token_var_$32.eql( ass ) );
                  if( NIL != valid_$33 )
                  {
                    Functions.funcall( subl_function, ass );
                  }
                  done_var_$31 = makeBoolean( NIL == valid_$33 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL == argnum && NIL == cycl_function && NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, NIL, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, NIL, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
              SubLObject done_var_$32 = NIL;
              final SubLObject token_var_$33 = NIL;
              while ( NIL == done_var_$32)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$33 );
                final SubLObject valid_$34 = makeBoolean( !token_var_$33.eql( ass ) );
                if( NIL != valid_$34 )
                {
                  Functions.funcall( subl_function, ass );
                }
                done_var_$32 = makeBoolean( NIL == valid_$34 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values4 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values4 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 5533L)
  public static SubLObject map_function_extent_index(final SubLObject subl_function, final SubLObject cycl_function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( subl_function ) : subl_function;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      if( NIL != kb_mapping_macros.do_function_extent_index_key_validator( cycl_function ) )
      {
        final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec( cycl_function );
        SubLObject final_index_iterator = NIL;
        try
        {
          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( ass ) );
            if( NIL != valid )
            {
              Functions.funcall( subl_function, ass );
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL != final_index_iterator )
            {
              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 5974L)
  public static SubLObject map_predicate_rule_index(final SubLObject function, final SubLObject pred, final SubLObject sense, SubLObject direction, SubLObject mt)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != enumeration_types.sense_p( sense ) : sense;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
        if( NIL != direction )
        {
          if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( pred, sense, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( pred, sense, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                  SubLObject done_var_$41 = NIL;
                  final SubLObject token_var_$42 = NIL;
                  while ( NIL == done_var_$41)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$42 );
                    final SubLObject valid_$43 = makeBoolean( !token_var_$42.eql( ass ) );
                    if( NIL != valid_$43 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$41 = makeBoolean( NIL == valid_$43 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( pred, sense, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( pred, sense, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
                SubLObject done_var_$42 = NIL;
                final SubLObject token_var_$43 = NIL;
                while ( NIL == done_var_$42)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$43 );
                  final SubLObject valid_$44 = makeBoolean( !token_var_$43.eql( ass ) );
                  if( NIL != valid_$44 )
                  {
                    Functions.funcall( function, ass );
                  }
                  done_var_$42 = makeBoolean( NIL == valid_$44 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 6838L)
  public static SubLObject map_decontextualized_ist_predicate_rule_index(final SubLObject function, final SubLObject pred, final SubLObject sense, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != enumeration_types.sense_p( sense ) : sense;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      if( NIL != direction )
      {
        if( NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator( pred, sense, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator( pred, sense, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                SubLObject done_var_$49 = NIL;
                final SubLObject token_var_$50 = NIL;
                while ( NIL == done_var_$49)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$50 );
                  final SubLObject valid_$51 = makeBoolean( !token_var_$50.eql( ass ) );
                  if( NIL != valid_$51 && NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( ass ) ) )
                  {
                    Functions.funcall( function, ass );
                  }
                  done_var_$49 = makeBoolean( NIL == valid_$51 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator( pred, sense, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator( pred, sense, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
              SubLObject done_var_$50 = NIL;
              final SubLObject token_var_$51 = NIL;
              while ( NIL == done_var_$50)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$51 );
                final SubLObject valid_$52 = makeBoolean( !token_var_$51.eql( ass ) );
                if( NIL != valid_$52 && NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( ass ) ) )
                {
                  Functions.funcall( function, ass );
                }
                done_var_$50 = makeBoolean( NIL == valid_$52 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 7852L)
  public static SubLObject map_isa_rule_index(final SubLObject function, final SubLObject collection, final SubLObject sense, SubLObject direction, SubLObject mt)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != enumeration_types.sense_p( sense ) : sense;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
        if( NIL != direction )
        {
          if( NIL != kb_mapping_macros.do_isa_rule_index_key_validator( collection, sense, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator( collection, sense, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                  SubLObject done_var_$55 = NIL;
                  final SubLObject token_var_$56 = NIL;
                  while ( NIL == done_var_$55)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$56 );
                    final SubLObject valid_$57 = makeBoolean( !token_var_$56.eql( ass ) );
                    if( NIL != valid_$57 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$55 = makeBoolean( NIL == valid_$57 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL != kb_mapping_macros.do_isa_rule_index_key_validator( collection, sense, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator( collection, sense, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
                SubLObject done_var_$56 = NIL;
                final SubLObject token_var_$57 = NIL;
                while ( NIL == done_var_$56)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$57 );
                  final SubLObject valid_$58 = makeBoolean( !token_var_$57.eql( ass ) );
                  if( NIL != valid_$58 )
                  {
                    Functions.funcall( function, ass );
                  }
                  done_var_$56 = makeBoolean( NIL == valid_$58 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$59, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 8569L)
  public static SubLObject map_quoted_isa_rule_index(final SubLObject function, final SubLObject collection, final SubLObject sense, SubLObject direction, SubLObject mt)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != enumeration_types.sense_p( sense ) : sense;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
        if( NIL != direction )
        {
          if( NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator( collection, sense, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator( collection, sense, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                  SubLObject done_var_$63 = NIL;
                  final SubLObject token_var_$64 = NIL;
                  while ( NIL == done_var_$63)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$64 );
                    final SubLObject valid_$65 = makeBoolean( !token_var_$64.eql( ass ) );
                    if( NIL != valid_$65 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$63 = makeBoolean( NIL == valid_$65 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$66, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator( collection, sense, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator( collection, sense, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
                SubLObject done_var_$64 = NIL;
                final SubLObject token_var_$65 = NIL;
                while ( NIL == done_var_$64)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$65 );
                  final SubLObject valid_$66 = makeBoolean( !token_var_$65.eql( ass ) );
                  if( NIL != valid_$66 )
                  {
                    Functions.funcall( function, ass );
                  }
                  done_var_$64 = makeBoolean( NIL == valid_$66 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$67, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 9334L)
  public static SubLObject map_genls_rule_index(final SubLObject function, final SubLObject collection, final SubLObject sense, SubLObject direction, SubLObject mt)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != enumeration_types.sense_p( sense ) : sense;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
        if( NIL != direction )
        {
          if( NIL != kb_mapping_macros.do_genls_rule_index_key_validator( collection, sense, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator( collection, sense, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                  SubLObject done_var_$71 = NIL;
                  final SubLObject token_var_$72 = NIL;
                  while ( NIL == done_var_$71)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$72 );
                    final SubLObject valid_$73 = makeBoolean( !token_var_$72.eql( ass ) );
                    if( NIL != valid_$73 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$71 = makeBoolean( NIL == valid_$73 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$74 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$74, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL != kb_mapping_macros.do_genls_rule_index_key_validator( collection, sense, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator( collection, sense, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
                SubLObject done_var_$72 = NIL;
                final SubLObject token_var_$73 = NIL;
                while ( NIL == done_var_$72)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$73 );
                  final SubLObject valid_$74 = makeBoolean( !token_var_$73.eql( ass ) );
                  if( NIL != valid_$74 )
                  {
                    Functions.funcall( function, ass );
                  }
                  done_var_$72 = makeBoolean( NIL == valid_$74 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$75 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$75, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 10065L)
  public static SubLObject map_genl_mt_rule_index(final SubLObject function, final SubLObject genl_mt, final SubLObject sense, SubLObject direction, SubLObject rule_mt)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( rule_mt == UNPROVIDED )
    {
      rule_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != enumeration_types.sense_p( sense ) : sense;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      final SubLObject mt_var = rule_mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
        if( NIL != direction )
        {
          if( NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator( genl_mt, sense, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator( genl_mt, sense, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                  SubLObject done_var_$79 = NIL;
                  final SubLObject token_var_$80 = NIL;
                  while ( NIL == done_var_$79)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$80 );
                    final SubLObject valid_$81 = makeBoolean( !token_var_$80.eql( ass ) );
                    if( NIL != valid_$81 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$79 = makeBoolean( NIL == valid_$81 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$82, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator( genl_mt, sense, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator( genl_mt, sense, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
                SubLObject done_var_$80 = NIL;
                final SubLObject token_var_$81 = NIL;
                while ( NIL == done_var_$80)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$81 );
                  final SubLObject valid_$82 = makeBoolean( !token_var_$81.eql( ass ) );
                  if( NIL != valid_$82 )
                  {
                    Functions.funcall( function, ass );
                  }
                  done_var_$80 = makeBoolean( NIL == valid_$82 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$83, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 10807L)
  public static SubLObject map_function_rule_index(final SubLObject subl_function, final SubLObject cycl_function, SubLObject direction, SubLObject mt)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( subl_function ) : subl_function;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
        if( NIL != direction )
        {
          if( NIL != kb_mapping_macros.do_function_rule_index_key_validator( cycl_function, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator( cycl_function, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                  SubLObject done_var_$87 = NIL;
                  final SubLObject token_var_$88 = NIL;
                  while ( NIL == done_var_$87)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$88 );
                    final SubLObject valid_$89 = makeBoolean( !token_var_$88.eql( ass ) );
                    if( NIL != valid_$89 )
                    {
                      Functions.funcall( subl_function, ass );
                    }
                    done_var_$87 = makeBoolean( NIL == valid_$89 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$90 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$90, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL != kb_mapping_macros.do_function_rule_index_key_validator( cycl_function, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator( cycl_function, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
                SubLObject done_var_$88 = NIL;
                final SubLObject token_var_$89 = NIL;
                while ( NIL == done_var_$88)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$89 );
                  final SubLObject valid_$90 = makeBoolean( !token_var_$89.eql( ass ) );
                  if( NIL != valid_$90 )
                  {
                    Functions.funcall( subl_function, ass );
                  }
                  done_var_$88 = makeBoolean( NIL == valid_$90 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$91, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 11559L)
  public static SubLObject map_exception_rule_index(final SubLObject function, final SubLObject rule, SubLObject direction, SubLObject mt)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
        if( NIL != direction )
        {
          if( NIL != kb_mapping_macros.do_exception_rule_index_key_validator( rule, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator( rule, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                  SubLObject done_var_$95 = NIL;
                  final SubLObject token_var_$96 = NIL;
                  while ( NIL == done_var_$95)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$96 );
                    final SubLObject valid_$97 = makeBoolean( !token_var_$96.eql( ass ) );
                    if( NIL != valid_$97 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$95 = makeBoolean( NIL == valid_$97 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$98 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$98, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL != kb_mapping_macros.do_exception_rule_index_key_validator( rule, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator( rule, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
                SubLObject done_var_$96 = NIL;
                final SubLObject token_var_$97 = NIL;
                while ( NIL == done_var_$96)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$97 );
                  final SubLObject valid_$98 = makeBoolean( !token_var_$97.eql( ass ) );
                  if( NIL != valid_$98 )
                  {
                    Functions.funcall( function, ass );
                  }
                  done_var_$96 = makeBoolean( NIL == valid_$98 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$99, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 12245L)
  public static SubLObject map_pragma_rule_index(final SubLObject function, final SubLObject rule, SubLObject direction, SubLObject mt)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
        if( NIL != direction )
        {
          if( NIL != kb_mapping_macros.do_pragma_rule_index_key_validator( rule, direction ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator( rule, direction );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                  SubLObject done_var_$103 = NIL;
                  final SubLObject token_var_$104 = NIL;
                  while ( NIL == done_var_$103)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$104 );
                    final SubLObject valid_$105 = makeBoolean( !token_var_$104.eql( ass ) );
                    if( NIL != valid_$105 )
                    {
                      Functions.funcall( function, ass );
                    }
                    done_var_$103 = makeBoolean( NIL == valid_$105 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$106, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else if( NIL != kb_mapping_macros.do_pragma_rule_index_key_validator( rule, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator( rule, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
                SubLObject done_var_$104 = NIL;
                final SubLObject token_var_$105 = NIL;
                while ( NIL == done_var_$104)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$105 );
                  final SubLObject valid_$106 = makeBoolean( !token_var_$105.eql( ass ) );
                  if( NIL != valid_$106 )
                  {
                    Functions.funcall( function, ass );
                  }
                  done_var_$104 = makeBoolean( NIL == valid_$106 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$107, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 12924L)
  public static SubLObject map_unbound_predicate_rule_index(final SubLObject function, final SubLObject sense, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      if( NIL != direction )
      {
        if( NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator( sense, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator( sense, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                SubLObject done_var_$111 = NIL;
                final SubLObject token_var_$112 = NIL;
                while ( NIL == done_var_$111)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$112 );
                  final SubLObject valid_$113 = makeBoolean( !token_var_$112.eql( ass ) );
                  if( NIL != valid_$113 )
                  {
                    Functions.funcall( function, ass );
                  }
                  done_var_$111 = makeBoolean( NIL == valid_$113 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator( sense, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator( sense, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
              SubLObject done_var_$112 = NIL;
              final SubLObject token_var_$113 = NIL;
              while ( NIL == done_var_$112)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$113 );
                final SubLObject valid_$114 = makeBoolean( !token_var_$113.eql( ass ) );
                if( NIL != valid_$114 )
                {
                  Functions.funcall( function, ass );
                }
                done_var_$112 = makeBoolean( NIL == valid_$114 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 13502L)
  public static SubLObject map_term(final SubLObject function, final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( function, $sym15$FUNCTION_SPEC_P );
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      if( NIL != kb_mapping_macros.do_term_index_key_validator( v_term, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( v_term, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
              SubLObject done_var_$117 = NIL;
              final SubLObject token_var_$118 = NIL;
              while ( NIL == done_var_$117)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$118 );
                final SubLObject valid_$119 = makeBoolean( !token_var_$118.eql( ass ) );
                if( NIL != valid_$119 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( ass, final_index_spec ) )
                {
                  Functions.funcall( function, ass );
                }
                done_var_$117 = makeBoolean( NIL == valid_$119 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 13811L)
  public static SubLObject selected_map_term(final SubLObject function, final SubLObject v_term, SubLObject truth, SubLObject gafs_onlyP)
  {
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( gafs_onlyP == UNPROVIDED )
    {
      gafs_onlyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject type = ( NIL != gafs_onlyP ) ? $kw18$GAF : NIL;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      if( NIL != kb_mapping_macros.do_term_index_key_validator( v_term, type ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( v_term, type );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, type, truth, NIL );
              SubLObject done_var_$120 = NIL;
              final SubLObject token_var_$121 = NIL;
              while ( NIL == done_var_$120)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$121 );
                final SubLObject valid_$122 = makeBoolean( !token_var_$121.eql( ass ) );
                if( NIL != valid_$122 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( ass, final_index_spec ) )
                {
                  Functions.funcall( function, ass );
                }
                done_var_$120 = makeBoolean( NIL == valid_$122 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 14355L)
  public static SubLObject map_term_selective(final SubLObject function, final SubLObject v_term, final SubLObject test, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( function, $sym15$FUNCTION_SPEC_P );
    enforceType( test, $sym15$FUNCTION_SPEC_P );
    final SubLObject _prev_bind_0 = $map_term_selective_action$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $map_term_selective_test$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $mapping_truth$.currentBinding( thread );
    try
    {
      $map_term_selective_action$.bind( function, thread );
      $map_term_selective_test$.bind( test, thread );
      $mapping_truth$.bind( truth, thread );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw17$MAPPING_DONE );
        map_term( $sym26$MAP_TERM_SELECTIVE_INTERNAL, v_term );
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      $mapping_truth$.rebind( _prev_bind_3, thread );
      $map_term_selective_test$.rebind( _prev_bind_2, thread );
      $map_term_selective_action$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 14864L)
  public static SubLObject map_term_selective_internal(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Functions.funcall( $map_term_selective_test$.getDynamicValue( thread ), assertion ) )
    {
      Functions.funcall( $map_term_selective_action$.getDynamicValue( thread ), assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 15056L)
  public static SubLObject map_term_gafs(final SubLObject function, final SubLObject v_term, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    enforceType( function, $sym15$FUNCTION_SPEC_P );
    selected_map_term( function, v_term, truth, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 15348L)
  public static SubLObject map_mt_contents(final SubLObject function, final SubLObject v_term, SubLObject truth, SubLObject gafs_only)
  {
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( gafs_only == UNPROVIDED )
    {
      gafs_only = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( function, $sym15$FUNCTION_SPEC_P );
    if( NIL != forts.fort_p( v_term ) )
    {
      if( NIL != kb_indexing.broad_mtP( v_term ) )
      {
        if( NIL != mt_relevance_macros.relevant_mtP( v_term ) )
        {
          final SubLObject _prev_bind_0 = $mapping_truth$.currentBinding( thread );
          try
          {
            $mapping_truth$.bind( truth, thread );
            SubLObject catch_var = NIL;
            try
            {
              thread.throwStack.push( $kw17$MAPPING_DONE );
              final SubLObject idx = assertion_handles.do_assertions_table();
              final SubLObject mess = $str34$mapping_broad_mt_index;
              final SubLObject total = id_index.id_index_count( idx );
              SubLObject sofar = ZERO_INTEGER;
              assert NIL != Types.stringp( mess ) : mess;
              final SubLObject _prev_bind_0_$123 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
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
                  final SubLObject idx_$124 = idx;
                  if( NIL == id_index.id_index_objects_empty_p( idx_$124, $kw36$SKIP ) )
                  {
                    final SubLObject idx_$125 = idx_$124;
                    if( NIL == id_index.id_index_dense_objects_empty_p( idx_$125, $kw36$SKIP ) )
                    {
                      final SubLObject vector_var = id_index.id_index_dense_objects( idx_$125 );
                      final SubLObject backwardP_var = NIL;
                      SubLObject length;
                      SubLObject v_iteration;
                      SubLObject a_id;
                      SubLObject a_handle;
                      SubLObject assertion;
                      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                      {
                        a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                        a_handle = Vectors.aref( vector_var, a_id );
                        if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw36$SKIP ) )
                        {
                          if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                          {
                            a_handle = $kw36$SKIP;
                          }
                          assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                          map_mt_index_internal( function, assertion, v_term, gafs_only );
                          sofar = Numbers.add( sofar, ONE_INTEGER );
                          utilities_macros.note_percent_progress( sofar, total );
                        }
                      }
                    }
                    final SubLObject idx_$126 = idx_$124;
                    if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$126 ) || NIL == id_index.id_index_skip_tombstones_p( $kw36$SKIP ) )
                    {
                      final SubLObject sparse = id_index.id_index_sparse_objects( idx_$126 );
                      SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$126 );
                      final SubLObject end_id = id_index.id_index_next_id( idx_$126 );
                      final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw36$SKIP ) ) ? NIL : $kw36$SKIP;
                      while ( a_id2.numL( end_id ))
                      {
                        final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                        if( NIL == id_index.id_index_skip_tombstones_p( $kw36$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                        {
                          final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                          map_mt_index_internal( function, assertion2, v_term, gafs_only );
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
                  final SubLObject _prev_bind_0_$124 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$124, thread );
                  }
                }
              }
              finally
              {
                utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
                utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
                utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
                utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$123, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
            }
            finally
            {
              thread.throwStack.pop();
            }
          }
          finally
          {
            $mapping_truth$.rebind( _prev_bind_0, thread );
          }
        }
      }
      else
      {
        map_mt_index( function, v_term, truth, gafs_only );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 16160L)
  public static SubLObject map_mt_index_internal(final SubLObject function, final SubLObject assertion, final SubLObject mt, final SubLObject gafs_only)
  {
    if( NIL != assertions_high.valid_assertion( assertion, UNPROVIDED ) && NIL != hlmt.hlmt_equalP( assertions_high.assertion_mt( assertion ), mt ) && NIL != assertion_matching_truthP( assertion ) && ( NIL == gafs_only
        || ( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != pred_relevance_macros.relevant_predP( assertions_high.gaf_predicate( assertion ) ) ) ) )
    {
      Functions.funcall( function, assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 16546L)
  public static SubLObject assertion_matching_truthP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return assertion_utilities.assertion_matches_truthP( assertion, $mapping_truth$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 16663L)
  public static SubLObject map_mt_index(final SubLObject function, final SubLObject mt, SubLObject truth, SubLObject gafs_only)
  {
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( gafs_only == UNPROVIDED )
    {
      gafs_only = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( function, $sym15$FUNCTION_SPEC_P );
    if( NIL != forts.fort_p( mt ) )
    {
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw17$MAPPING_DONE );
        final SubLObject type = ( NIL != gafs_only ) ? $kw18$GAF : NIL;
        if( NIL != kb_mapping_macros.do_mt_index_key_validator( mt, type ) )
        {
          final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec( mt );
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, type, truth, NIL );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( ass ) );
              if( NIL != valid )
              {
                Functions.funcall( function, ass );
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 17215L)
  public static SubLObject map_hlmt_contents(final SubLObject function, final SubLObject v_term, SubLObject truth, SubLObject gafs_only)
  {
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( gafs_only == UNPROVIDED )
    {
      gafs_only = NIL;
    }
    enforceType( function, $sym15$FUNCTION_SPEC_P );
    if( NIL != hlmt.hlmt_p( v_term ) )
    {
      map_hlmt_index( function, v_term, truth, gafs_only );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 17788L)
  public static SubLObject map_hlmt_index(final SubLObject function, final SubLObject mt, SubLObject truth, SubLObject gafs_only)
  {
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( gafs_only == UNPROVIDED )
    {
      gafs_only = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( function, $sym15$FUNCTION_SPEC_P );
    if( NIL != hlmt.hlmtP( mt ) )
    {
      final SubLObject _prev_bind_0 = $mapping_truth$.currentBinding( thread );
      try
      {
        $mapping_truth$.bind( truth, thread );
        SubLObject catch_var = NIL;
        try
        {
          thread.throwStack.push( $kw17$MAPPING_DONE );
          SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( list_utilities.flatten( mt ), UNPROVIDED );
          SubLObject ass = NIL;
          ass = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( ( NIL == gafs_only || NIL != el_utilities.gafP( ass ) ) && NIL != assertion_matching_truthP( ass ) && NIL != hlmt.hlmt_equal( assertions_high.assertion_mt( ass ), mt ) )
            {
              Functions.funcall( function, ass );
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        $mapping_truth$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 18522L)
  public static SubLObject map_other_index(final SubLObject function, final SubLObject v_term, SubLObject truth, SubLObject gafs_only)
  {
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    if( gafs_only == UNPROVIDED )
    {
      gafs_only = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( function, $sym15$FUNCTION_SPEC_P );
    final SubLObject type = ( NIL != gafs_only ) ? $kw18$GAF : NIL;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw17$MAPPING_DONE );
      if( NIL != kb_mapping_macros.do_other_index_key_validator( v_term, type ) )
      {
        final SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec( v_term );
        SubLObject final_index_iterator = NIL;
        try
        {
          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, type, truth, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( ass ) );
            if( NIL != valid && NIL != kb_mapping_macros.do_other_index_assertion_match_p( ass ) )
            {
              Functions.funcall( function, ass );
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL != final_index_iterator )
            {
              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw17$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 19055L)
  public static SubLObject gather_index(final SubLObject v_term, SubLObject remove_duplicatesP)
  {
    if( remove_duplicatesP == UNPROVIDED )
    {
      remove_duplicatesP = NIL;
    }
    return assertions_mentioning_term_int( v_term, remove_duplicatesP, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 19504L)
  public static SubLObject assertions_mentioning_term(final SubLObject v_term, SubLObject remove_duplicatesP)
  {
    if( remove_duplicatesP == UNPROVIDED )
    {
      remove_duplicatesP = NIL;
    }
    return assertions_mentioning_term_int( v_term, remove_duplicatesP, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 19653L)
  public static SubLObject gafs_mentioning_term(final SubLObject v_term, SubLObject remove_duplicatesP)
  {
    if( remove_duplicatesP == UNPROVIDED )
    {
      remove_duplicatesP = NIL;
    }
    return assertions_mentioning_term_int( v_term, remove_duplicatesP, $kw18$GAF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 19797L)
  public static SubLObject rules_mentioning_term(final SubLObject v_term, SubLObject remove_duplicatesP)
  {
    if( remove_duplicatesP == UNPROVIDED )
    {
      remove_duplicatesP = NIL;
    }
    return assertions_mentioning_term_int( v_term, remove_duplicatesP, $kw20$RULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 19943L)
  public static SubLObject assertions_mentioning_term_int(final SubLObject v_term, final SubLObject remove_duplicatesP, final SubLObject type)
  {
    SubLObject result = NIL;
    if( NIL != auxiliary_indexing.auxiliary_index_p( v_term ) )
    {
      if( v_term.eql( auxiliary_indexing.unbound_rule_index() ) )
      {
        if( NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator( NIL, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator( NIL, NIL );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
                SubLObject done_var_$128 = NIL;
                final SubLObject token_var_$129 = NIL;
                while ( NIL == done_var_$128)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$129 );
                  final SubLObject valid_$130 = makeBoolean( !token_var_$129.eql( ass ) );
                  if( NIL != valid_$130 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$128 = makeBoolean( NIL == valid_$130 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else
      {
        Errors.cerror( $str51$So_don_t_, $str52$Can_t_gather_unknown_auxiliary_in, v_term );
      }
    }
    else if( NIL != kb_mapping_macros.do_term_index_key_validator( v_term, type ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( v_term, type );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, type, NIL, NIL );
            SubLObject done_var_$129 = NIL;
            final SubLObject token_var_$130 = NIL;
            while ( NIL == done_var_$129)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$130 );
              final SubLObject valid_$131 = makeBoolean( !token_var_$130.eql( ass ) );
              if( NIL != valid_$131 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( ass, final_index_spec ) )
              {
                result = ConsesLow.cons( ass, result );
              }
              done_var_$129 = makeBoolean( NIL == valid_$131 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    if( NIL != remove_duplicatesP )
    {
      result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 20784L)
  public static SubLObject gather_index_in_any_mt(final SubLObject v_term, SubLObject remove_duplicatesP)
  {
    if( remove_duplicatesP == UNPROVIDED )
    {
      remove_duplicatesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym53$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const54$EverythingPSC, thread );
      result = gather_index( v_term, remove_duplicatesP );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 21148L)
  public static SubLObject gather_gaf_arg_index(final SubLObject v_term, final SubLObject argnum, SubLObject pred, SubLObject mt, SubLObject truth)
  {
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw57$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( argnum, $sym16$POSITIVE_INTEGER_P );
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
      if( NIL != pred )
      {
        final SubLObject pred_var = pred;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, truth, NIL );
                SubLObject done_var_$134 = NIL;
                final SubLObject token_var_$135 = NIL;
                while ( NIL == done_var_$134)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$135 );
                  final SubLObject valid_$136 = makeBoolean( !token_var_$135.eql( ass ) );
                  if( NIL != valid_$136 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$134 = makeBoolean( NIL == valid_$136 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$137 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$137, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else
      {
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, truth, NIL );
                SubLObject done_var_$135 = NIL;
                final SubLObject token_var_$136 = NIL;
                while ( NIL == done_var_$135)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$136 );
                  final SubLObject valid_$137 = makeBoolean( !token_var_$136.eql( ass ) );
                  if( NIL != valid_$137 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$135 = makeBoolean( NIL == valid_$137 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$138 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$138, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 21928L)
  public static SubLObject gather_gaf_arg_index_with_predicate(final SubLObject v_term, final SubLObject argnum, final SubLObject pred, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw57$TRUE;
    }
    return gather_gaf_arg_index( v_term, argnum, pred, mt, truth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 22249L)
  public static SubLObject gather_nart_arg_index(final SubLObject v_term, final SubLObject argnum, SubLObject func)
  {
    if( func == UNPROVIDED )
    {
      func = NIL;
    }
    enforceType( argnum, $sym16$POSITIVE_INTEGER_P );
    SubLObject result = NIL;
    if( NIL != func )
    {
      if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, argnum, func ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, argnum, func );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
              SubLObject done_var_$142 = NIL;
              final SubLObject token_var_$143 = NIL;
              while ( NIL == done_var_$142)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$143 );
                final SubLObject valid_$144 = makeBoolean( !token_var_$143.eql( ass ) );
                if( NIL != valid_$144 )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$142 = makeBoolean( NIL == valid_$144 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    else if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( v_term, argnum, NIL ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( v_term, argnum, NIL );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
            SubLObject done_var_$143 = NIL;
            final SubLObject token_var_$144 = NIL;
            while ( NIL == done_var_$143)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$144 );
              final SubLObject valid_$145 = makeBoolean( !token_var_$144.eql( ass ) );
              if( NIL != valid_$145 )
              {
                result = ConsesLow.cons( ass, result );
              }
              done_var_$143 = makeBoolean( NIL == valid_$145 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 22836L)
  public static SubLObject gather_predicate_extent_index(final SubLObject pred, SubLObject mt, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw57$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$148 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$149 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, truth, NIL );
                SubLObject done_var_$150 = NIL;
                final SubLObject token_var_$151 = NIL;
                while ( NIL == done_var_$150)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$151 );
                  final SubLObject valid_$152 = makeBoolean( !token_var_$151.eql( ass ) );
                  if( NIL != valid_$152 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$150 = makeBoolean( NIL == valid_$152 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$149 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$149, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$149, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$148, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 23343L)
  public static SubLObject gather_function_extent_index(final SubLObject func)
  {
    SubLObject result = NIL;
    if( NIL != kb_mapping_macros.do_function_extent_index_key_validator( func ) )
    {
      final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec( func );
      SubLObject final_index_iterator = NIL;
      try
      {
        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, NIL, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( ass ) );
          if( NIL != valid )
          {
            result = ConsesLow.cons( ass, result );
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != final_index_iterator )
          {
            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 23694L)
  public static SubLObject gather_predicate_rule_index(final SubLObject pred, final SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sense, $sym19$SENSE_P );
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
      if( NIL != direction )
      {
        if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( pred, sense, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( pred, sense, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                SubLObject done_var_$154 = NIL;
                final SubLObject token_var_$155 = NIL;
                while ( NIL == done_var_$154)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$155 );
                  final SubLObject valid_$156 = makeBoolean( !token_var_$155.eql( ass ) );
                  if( NIL != valid_$156 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$154 = makeBoolean( NIL == valid_$156 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$157 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$157, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( pred, sense, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( pred, sense, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
              SubLObject done_var_$155 = NIL;
              final SubLObject token_var_$156 = NIL;
              while ( NIL == done_var_$155)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$156 );
                final SubLObject valid_$157 = makeBoolean( !token_var_$156.eql( ass ) );
                if( NIL != valid_$157 )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$155 = makeBoolean( NIL == valid_$157 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$158 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$158, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 24503L)
  public static SubLObject gather_predicate_rule_index_in_all_mts(final SubLObject pred, final SubLObject sense, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym53$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const54$EverythingPSC, thread );
      result = gather_predicate_rule_index( pred, sense, NIL, direction );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 24722L)
  public static SubLObject gather_decontextualized_ist_predicate_rule_index(final SubLObject pred, final SubLObject sense, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    enforceType( sense, $sym19$SENSE_P );
    SubLObject result = NIL;
    if( NIL != direction )
    {
      if( NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator( pred, sense, direction ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator( pred, sense, direction );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
              SubLObject done_var_$162 = NIL;
              final SubLObject token_var_$163 = NIL;
              while ( NIL == done_var_$162)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$163 );
                final SubLObject valid_$164 = makeBoolean( !token_var_$163.eql( ass ) );
                if( NIL != valid_$164 && NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( ass ) ) )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$162 = makeBoolean( NIL == valid_$164 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    else if( NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator( pred, sense, NIL ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator( pred, sense, NIL );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
            SubLObject done_var_$163 = NIL;
            final SubLObject token_var_$164 = NIL;
            while ( NIL == done_var_$163)
            {
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$164 );
              final SubLObject valid_$165 = makeBoolean( !token_var_$164.eql( ass ) );
              if( NIL != valid_$165 && NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( ass ) ) )
              {
                result = ConsesLow.cons( ass, result );
              }
              done_var_$163 = makeBoolean( NIL == valid_$165 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 25655L)
  public static SubLObject gather_isa_rule_index(final SubLObject collection, final SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sense, $sym19$SENSE_P );
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
      if( NIL != direction )
      {
        if( NIL != kb_mapping_macros.do_isa_rule_index_key_validator( collection, sense, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator( collection, sense, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                SubLObject done_var_$168 = NIL;
                final SubLObject token_var_$169 = NIL;
                while ( NIL == done_var_$168)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$169 );
                  final SubLObject valid_$170 = makeBoolean( !token_var_$169.eql( ass ) );
                  if( NIL != valid_$170 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$168 = makeBoolean( NIL == valid_$170 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$171 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$171, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_isa_rule_index_key_validator( collection, sense, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator( collection, sense, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
              SubLObject done_var_$169 = NIL;
              final SubLObject token_var_$170 = NIL;
              while ( NIL == done_var_$169)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$170 );
                final SubLObject valid_$171 = makeBoolean( !token_var_$170.eql( ass ) );
                if( NIL != valid_$171 )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$169 = makeBoolean( NIL == valid_$171 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$172 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$172, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 26498L)
  public static SubLObject gather_quoted_isa_rule_index(final SubLObject collection, final SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sense, $sym19$SENSE_P );
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
      if( NIL != direction )
      {
        if( NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator( collection, sense, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator( collection, sense, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                SubLObject done_var_$176 = NIL;
                final SubLObject token_var_$177 = NIL;
                while ( NIL == done_var_$176)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$177 );
                  final SubLObject valid_$178 = makeBoolean( !token_var_$177.eql( ass ) );
                  if( NIL != valid_$178 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$176 = makeBoolean( NIL == valid_$178 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$179 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$179, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator( collection, sense, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator( collection, sense, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
              SubLObject done_var_$177 = NIL;
              final SubLObject token_var_$178 = NIL;
              while ( NIL == done_var_$177)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$178 );
                final SubLObject valid_$179 = makeBoolean( !token_var_$178.eql( ass ) );
                if( NIL != valid_$179 )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$177 = makeBoolean( NIL == valid_$179 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$180 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$180, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 27374L)
  public static SubLObject gather_genls_rule_index(final SubLObject collection, final SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sense, $sym19$SENSE_P );
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
      if( NIL != direction )
      {
        if( NIL != kb_mapping_macros.do_genls_rule_index_key_validator( collection, sense, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator( collection, sense, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                SubLObject done_var_$184 = NIL;
                final SubLObject token_var_$185 = NIL;
                while ( NIL == done_var_$184)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$185 );
                  final SubLObject valid_$186 = makeBoolean( !token_var_$185.eql( ass ) );
                  if( NIL != valid_$186 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$184 = makeBoolean( NIL == valid_$186 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$187 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$187, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_genls_rule_index_key_validator( collection, sense, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator( collection, sense, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
              SubLObject done_var_$185 = NIL;
              final SubLObject token_var_$186 = NIL;
              while ( NIL == done_var_$185)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$186 );
                final SubLObject valid_$187 = makeBoolean( !token_var_$186.eql( ass ) );
                if( NIL != valid_$187 )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$185 = makeBoolean( NIL == valid_$187 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$188 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$188, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 28230L)
  public static SubLObject gather_genl_mt_rule_index(final SubLObject genl_mt, final SubLObject sense, SubLObject rule_mt, SubLObject direction)
  {
    if( rule_mt == UNPROVIDED )
    {
      rule_mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( sense, $sym19$SENSE_P );
    SubLObject result = NIL;
    final SubLObject mt_var = rule_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
      if( NIL != direction )
      {
        if( NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator( genl_mt, sense, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator( genl_mt, sense, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                SubLObject done_var_$192 = NIL;
                final SubLObject token_var_$193 = NIL;
                while ( NIL == done_var_$192)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$193 );
                  final SubLObject valid_$194 = makeBoolean( !token_var_$193.eql( ass ) );
                  if( NIL != valid_$194 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$192 = makeBoolean( NIL == valid_$194 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$195 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$195, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator( genl_mt, sense, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator( genl_mt, sense, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
              SubLObject done_var_$193 = NIL;
              final SubLObject token_var_$194 = NIL;
              while ( NIL == done_var_$193)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$194 );
                final SubLObject valid_$195 = makeBoolean( !token_var_$194.eql( ass ) );
                if( NIL != valid_$195 )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$193 = makeBoolean( NIL == valid_$195 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$196 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$196, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 29098L)
  public static SubLObject gather_function_rule_index(final SubLObject func, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
      if( NIL != direction )
      {
        if( NIL != kb_mapping_macros.do_function_rule_index_key_validator( func, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator( func, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                SubLObject done_var_$200 = NIL;
                final SubLObject token_var_$201 = NIL;
                while ( NIL == done_var_$200)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$201 );
                  final SubLObject valid_$202 = makeBoolean( !token_var_$201.eql( ass ) );
                  if( NIL != valid_$202 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$200 = makeBoolean( NIL == valid_$202 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$203 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$203, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_function_rule_index_key_validator( func, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator( func, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
              SubLObject done_var_$201 = NIL;
              final SubLObject token_var_$202 = NIL;
              while ( NIL == done_var_$201)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$202 );
                final SubLObject valid_$203 = makeBoolean( !token_var_$202.eql( ass ) );
                if( NIL != valid_$203 )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$201 = makeBoolean( NIL == valid_$203 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$204 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$204, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 29778L)
  public static SubLObject gather_exception_rule_index(final SubLObject rule, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
      if( NIL != direction )
      {
        if( NIL != kb_mapping_macros.do_exception_rule_index_key_validator( rule, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator( rule, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                SubLObject done_var_$208 = NIL;
                final SubLObject token_var_$209 = NIL;
                while ( NIL == done_var_$208)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$209 );
                  final SubLObject valid_$210 = makeBoolean( !token_var_$209.eql( ass ) );
                  if( NIL != valid_$210 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$208 = makeBoolean( NIL == valid_$210 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$211 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$211, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_exception_rule_index_key_validator( rule, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator( rule, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
              SubLObject done_var_$209 = NIL;
              final SubLObject token_var_$210 = NIL;
              while ( NIL == done_var_$209)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$210 );
                final SubLObject valid_$211 = makeBoolean( !token_var_$210.eql( ass ) );
                if( NIL != valid_$211 )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$209 = makeBoolean( NIL == valid_$211 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$212 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$212, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 30444L)
  public static SubLObject gather_pragma_rule_index(final SubLObject rule, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_with_just_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_with_just_mt_determine_mt( mt_var ), thread );
      if( NIL != direction )
      {
        if( NIL != kb_mapping_macros.do_pragma_rule_index_key_validator( rule, direction ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator( rule, direction );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, direction );
                SubLObject done_var_$216 = NIL;
                final SubLObject token_var_$217 = NIL;
                while ( NIL == done_var_$216)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$217 );
                  final SubLObject valid_$218 = makeBoolean( !token_var_$217.eql( ass ) );
                  if( NIL != valid_$218 )
                  {
                    result = ConsesLow.cons( ass, result );
                  }
                  done_var_$216 = makeBoolean( NIL == valid_$218 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$219 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$219, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_pragma_rule_index_key_validator( rule, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator( rule, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw20$RULE, NIL, NIL );
              SubLObject done_var_$217 = NIL;
              final SubLObject token_var_$218 = NIL;
              while ( NIL == done_var_$217)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$218 );
                final SubLObject valid_$219 = makeBoolean( !token_var_$218.eql( ass ) );
                if( NIL != valid_$219 )
                {
                  result = ConsesLow.cons( ass, result );
                }
                done_var_$217 = makeBoolean( NIL == valid_$219 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$220 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$220, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 31118L)
  public static SubLObject gather_mt_index(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( v_term ) || ( NIL != hlmt.hlmt_p( v_term ) && NIL != kb_indexing.broad_mtP( hlmt.hlmt_monad_mt( v_term ) ) ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
      try
      {
        control_vars.$mapping_answer$.bind( NIL, thread );
        final SubLObject _prev_bind_0_$224 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym98$RELEVANT_MT_IS_EQ, thread );
          mt_relevance_macros.$mt$.bind( v_term, thread );
          map_mt_contents( Symbols.symbol_function( $sym99$GATHER_ASSERTIONS ), hlmt.hlmt_monad_mt( v_term ), UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$224, thread );
        }
        ans = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject final_index = kb_indexing.get_mt_subindex( v_term );
      if( NIL != final_index )
      {
        ans = conses_high.copy_list( kb_indexing_datastructures.final_index_leaves( final_index ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 31882L)
  public static SubLObject gather_other_index(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( v_term ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
      try
      {
        control_vars.$mapping_answer$.bind( NIL, thread );
        map_other_index( Symbols.symbol_function( $sym99$GATHER_ASSERTIONS ), v_term, UNPROVIDED, UNPROVIDED );
        ans = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject final_index = kb_indexing.get_other_subindex( v_term );
      if( NIL != final_index )
      {
        ans = conses_high.copy_list( kb_indexing_datastructures.final_index_leaves( final_index ) );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 32384L)
  public static SubLObject gather_term_assertions(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$225 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        map_term( Symbols.symbol_function( $sym99$GATHER_ASSERTIONS ), v_term );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$225, thread );
      }
      ans = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 32707L)
  public static SubLObject all_fort_meta_assertions(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      map_term( Symbols.symbol_function( $sym109$GATHER_META_ASSERTIONS ), fort );
      ans = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( Sequences.remove_duplicates( ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 33038L)
  public static SubLObject mapping_answer_foundP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != control_vars.$mapping_answer$.getDynamicValue( thread ) && NIL != control_vars.$mapping_any_answerP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 33191L)
  public static SubLObject mapping_finishedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( control_vars.$mapping_finished_fn$.getDynamicValue( thread ).isFunctionSpec() && NIL != Functions.funcall( control_vars.$mapping_finished_fn$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 33316L)
  public static SubLObject gather_object(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( v_object, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 33489L)
  public static SubLObject count_object(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    control_vars.$mapping_answer$.setDynamicValue( Numbers.add( control_vars.$mapping_answer$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 33577L)
  public static SubLObject assertion_with_search_term(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return assertions_high.assertion_mentions_term( assertion, control_vars.$mapping_target$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 33687L)
  public static SubLObject assertion_without_search_term(final SubLObject assertion)
  {
    return makeBoolean( NIL == assertion_with_search_term( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 33793L)
  public static SubLObject gather_formula(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == control_vars.$mapping_assertion_selection_fn$.getDynamicValue( thread ) || NIL != Functions.funcall( control_vars.$mapping_assertion_selection_fn$.getDynamicValue( thread ), assertion ) )
    {
      final SubLObject item_var = fi.assertion_fi_formula( assertion, UNPROVIDED );
      if( NIL == conses_high.member( item_var, control_vars.$mapping_answer$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( item_var, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 34031L)
  public static SubLObject gather_assertions(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == control_vars.$mapping_assertion_selection_fn$.getDynamicValue( thread ) || NIL != Functions.funcall( control_vars.$mapping_assertion_selection_fn$.getDynamicValue( thread ), assertion ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertion, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 34238L)
  public static SubLObject gather_some_assertions(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == control_vars.$mapping_assertion_selection_fn$.getDynamicValue( thread ) || NIL != Functions.funcall( control_vars.$mapping_assertion_selection_fn$.getDynamicValue( thread ), assertion ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertion, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
    }
    if( NIL != mapping_finishedP() )
    {
      utilities_macros.mapping_finished();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 34503L)
  public static SubLObject gather_unique_assertions(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( ( NIL == control_vars.$mapping_assertion_selection_fn$.getDynamicValue( thread ) || NIL != Functions.funcall( control_vars.$mapping_assertion_selection_fn$.getDynamicValue( thread ), assertion ) )
        && NIL == conses_high.member( assertion, control_vars.$mapping_answer$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertion, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 34720L)
  public static SubLObject gather_meta_assertions(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject meta_assertions = assertion_utilities.all_meta_assertions( assertion );
    if( NIL != meta_assertions )
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.nconc( meta_assertions, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 34946L)
  public static SubLObject gather_arg(final SubLObject assertion, SubLObject arg, SubLObject test)
  {
    if( arg == UNPROVIDED )
    {
      arg = control_vars.$mapping_gather_arg$.getDynamicValue();
    }
    if( test == UNPROVIDED )
    {
      test = control_vars.$mapping_equality_test$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != test )
    {
      final SubLObject item_var = assertions_high.gaf_arg( assertion, arg );
      if( NIL == conses_high.member( item_var, control_vars.$mapping_answer$.getDynamicValue( thread ), test, Symbols.symbol_function( IDENTITY ) ) )
      {
        control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( item_var, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
      }
    }
    else
    {
      control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertions_high.gaf_arg( assertion, arg ), control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-mapping.lisp", position = 35192L)
  public static SubLObject gather_fn_of_arg(final SubLObject assertion, SubLObject arg, SubLObject key, SubLObject args)
  {
    if( arg == UNPROVIDED )
    {
      arg = control_vars.$mapping_gather_arg$.getDynamicValue();
    }
    if( key == UNPROVIDED )
    {
      key = control_vars.$mapping_gather_key$.getDynamicValue();
    }
    if( args == UNPROVIDED )
    {
      args = control_vars.$mapping_gather_key_args$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fn_of_arg = Functions.apply( key, assertions_high.gaf_arg( assertion, arg ), args );
    if( NIL != fn_of_arg )
    {
      final SubLObject item_var = fn_of_arg;
      if( NIL == conses_high.member( item_var, control_vars.$mapping_answer$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( item_var, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
      }
    }
    return NIL;
  }

  public static SubLObject declare_kb_mapping_file()
  {
    SubLFiles.declareMacro( me, "do_intermediate_index_relevant_preds", "DO-INTERMEDIATE-INDEX-RELEVANT-PREDS" );
    SubLFiles.declareMacro( me, "do_intermediate_index_relevant_mts", "DO-INTERMEDIATE-INDEX-RELEVANT-MTS" );
    SubLFiles.declareMacro( me, "do_intermediate_index_with_direction", "DO-INTERMEDIATE-INDEX-WITH-DIRECTION" );
    SubLFiles.declareMacro( me, "do_final_index_assertions_with_truth", "DO-FINAL-INDEX-ASSERTIONS-WITH-TRUTH" );
    SubLFiles.declareFunction( me, "map_gaf_arg_index", "MAP-GAF-ARG-INDEX", 3, 3, false );
    SubLFiles.declareFunction( me, "map_predicate_extent_index", "MAP-PREDICATE-EXTENT-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "map_nart_arg_index", "MAP-NART-ARG-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "map_function_extent_index", "MAP-FUNCTION-EXTENT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "map_predicate_rule_index", "MAP-PREDICATE-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "map_decontextualized_ist_predicate_rule_index", "MAP-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 3, 1, false );
    SubLFiles.declareFunction( me, "map_isa_rule_index", "MAP-ISA-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "map_quoted_isa_rule_index", "MAP-QUOTED-ISA-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "map_genls_rule_index", "MAP-GENLS-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "map_genl_mt_rule_index", "MAP-GENL-MT-RULE-INDEX", 3, 2, false );
    SubLFiles.declareFunction( me, "map_function_rule_index", "MAP-FUNCTION-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "map_exception_rule_index", "MAP-EXCEPTION-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "map_pragma_rule_index", "MAP-PRAGMA-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "map_unbound_predicate_rule_index", "MAP-UNBOUND-PREDICATE-RULE-INDEX", 2, 1, false );
    SubLFiles.declareFunction( me, "map_term", "MAP-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "selected_map_term", "SELECTED-MAP-TERM", 2, 2, false );
    SubLFiles.declareFunction( me, "map_term_selective", "MAP-TERM-SELECTIVE", 3, 1, false );
    SubLFiles.declareFunction( me, "map_term_selective_internal", "MAP-TERM-SELECTIVE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "map_term_gafs", "MAP-TERM-GAFS", 2, 1, false );
    SubLFiles.declareFunction( me, "map_mt_contents", "MAP-MT-CONTENTS", 2, 2, false );
    SubLFiles.declareFunction( me, "map_mt_index_internal", "MAP-MT-INDEX-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "assertion_matching_truthP", "ASSERTION-MATCHING-TRUTH?", 1, 0, false );
    SubLFiles.declareFunction( me, "map_mt_index", "MAP-MT-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "map_hlmt_contents", "MAP-HLMT-CONTENTS", 2, 2, false );
    SubLFiles.declareFunction( me, "map_hlmt_index", "MAP-HLMT-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "map_other_index", "MAP-OTHER-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "gather_index", "GATHER-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "assertions_mentioning_term", "ASSERTIONS-MENTIONING-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "gafs_mentioning_term", "GAFS-MENTIONING-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "rules_mentioning_term", "RULES-MENTIONING-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "assertions_mentioning_term_int", "ASSERTIONS-MENTIONING-TERM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "gather_index_in_any_mt", "GATHER-INDEX-IN-ANY-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_gaf_arg_index", "GATHER-GAF-ARG-INDEX", 2, 3, false );
    SubLFiles.declareFunction( me, "gather_gaf_arg_index_with_predicate", "GATHER-GAF-ARG-INDEX-WITH-PREDICATE", 3, 2, false );
    SubLFiles.declareFunction( me, "gather_nart_arg_index", "GATHER-NART-ARG-INDEX", 2, 1, false );
    SubLFiles.declareFunction( me, "gather_predicate_extent_index", "GATHER-PREDICATE-EXTENT-INDEX", 1, 2, false );
    SubLFiles.declareFunction( me, "gather_function_extent_index", "GATHER-FUNCTION-EXTENT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_predicate_rule_index", "GATHER-PREDICATE-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "gather_predicate_rule_index_in_all_mts", "GATHER-PREDICATE-RULE-INDEX-IN-ALL-MTS", 2, 1, false );
    SubLFiles.declareFunction( me, "gather_decontextualized_ist_predicate_rule_index", "GATHER-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 2, 1, false );
    SubLFiles.declareFunction( me, "gather_isa_rule_index", "GATHER-ISA-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "gather_quoted_isa_rule_index", "GATHER-QUOTED-ISA-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "gather_genls_rule_index", "GATHER-GENLS-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "gather_genl_mt_rule_index", "GATHER-GENL-MT-RULE-INDEX", 2, 2, false );
    SubLFiles.declareFunction( me, "gather_function_rule_index", "GATHER-FUNCTION-RULE-INDEX", 1, 2, false );
    SubLFiles.declareFunction( me, "gather_exception_rule_index", "GATHER-EXCEPTION-RULE-INDEX", 1, 2, false );
    SubLFiles.declareFunction( me, "gather_pragma_rule_index", "GATHER-PRAGMA-RULE-INDEX", 1, 2, false );
    SubLFiles.declareFunction( me, "gather_mt_index", "GATHER-MT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_other_index", "GATHER-OTHER-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_term_assertions", "GATHER-TERM-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_fort_meta_assertions", "ALL-FORT-META-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "mapping_answer_foundP", "MAPPING-ANSWER-FOUND?", 0, 0, false );
    SubLFiles.declareFunction( me, "mapping_finishedP", "MAPPING-FINISHED?", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_object", "GATHER-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "count_object", "COUNT-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_with_search_term", "ASSERTION-WITH-SEARCH-TERM", 1, 0, false );
    new $assertion_with_search_term$UnaryFunction();
    SubLFiles.declareFunction( me, "assertion_without_search_term", "ASSERTION-WITHOUT-SEARCH-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_formula", "GATHER-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_assertions", "GATHER-ASSERTIONS", 1, 0, false );
    new $gather_assertions$UnaryFunction();
    SubLFiles.declareFunction( me, "gather_some_assertions", "GATHER-SOME-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_unique_assertions", "GATHER-UNIQUE-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_meta_assertions", "GATHER-META-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_arg", "GATHER-ARG", 1, 2, false );
    SubLFiles.declareFunction( me, "gather_fn_of_arg", "GATHER-FN-OF-ARG", 1, 3, false );
    return NIL;
  }

  public static SubLObject init_kb_mapping_file()
  {
    $mapping_function$ = SubLFiles.defparameter( "*MAPPING-FUNCTION*", NIL );
    $mapping_truth$ = SubLFiles.defparameter( "*MAPPING-TRUTH*", NIL );
    $mapping_direction$ = SubLFiles.defparameter( "*MAPPING-DIRECTION*", NIL );
    $map_term_selective_test$ = SubLFiles.defparameter( "*MAP-TERM-SELECTIVE-TEST*", NIL );
    $map_term_selective_action$ = SubLFiles.defparameter( "*MAP-TERM-SELECTIVE-ACTION*", NIL );
    return NIL;
  }

  public static SubLObject setup_kb_mapping_file()
  {
    utilities_macros.register_cyc_api_function( $sym21$MAP_TERM, $list22, $str23$Apply_FUNCTION_to_each_assertion_, $list24, $list25 );
    utilities_macros.register_cyc_api_function( $sym27$MAP_TERM_SELECTIVE, $list28, $str29$Apply_FUNCTION_to_each_assertion_, $list30, $list25 );
    utilities_macros.register_cyc_api_function( $sym31$MAP_TERM_GAFS, $list32, $str33$Apply_FUNCTION_to_every_gaf_index, $list24, $list25 );
    utilities_macros.register_cyc_api_function( $sym37$MAP_MT_CONTENTS, $list38, $str39$Apply_FUNCTION_to_each_assertion_, $list24, $list25 );
    utilities_macros.register_cyc_api_function( $sym40$MAP_MT_INDEX, $list41, $str42$Apply_FUNCTION_to_each_assertion_, $list24, $list25 );
    utilities_macros.register_cyc_api_function( $sym43$MAP_HLMT_CONTENTS, $list38, $str39$Apply_FUNCTION_to_each_assertion_, $list24, $list25 );
    utilities_macros.register_cyc_api_function( $sym44$MAP_HLMT_INDEX, $list41, $str42$Apply_FUNCTION_to_each_assertion_, $list24, $list25 );
    utilities_macros.register_cyc_api_function( $sym45$MAP_OTHER_INDEX, $list38, $str46$Apply_FUNCTION_to_each_assertion_, $list24, $list25 );
    utilities_macros.register_cyc_api_function( $sym47$GATHER_INDEX, $list48, $str49$Return_a_list_of_all_mt_relevant_, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym55$GATHER_INDEX_IN_ANY_MT, $list48, $str56$Return_a_list_of_all_assertions_i, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym58$GATHER_GAF_ARG_INDEX, $list59, $str60$Return_a_list_of_all_gaf_assertio, $list61, $list50 );
    access_macros.define_obsolete_register( $sym62$GATHER_GAF_ARG_INDEX_WITH_PREDICATE, $list63 );
    utilities_macros.register_cyc_api_function( $sym64$GATHER_NART_ARG_INDEX, $list65, $str66$Return_a_list_of_all___termOfUnit, $list61, $list50 );
    utilities_macros.register_cyc_api_function( $sym67$GATHER_PREDICATE_EXTENT_INDEX, $list68, $str69$Return_a_list_of_all_gaf_assertio, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym70$GATHER_FUNCTION_EXTENT_INDEX, $list71, $str72$Return_a_list_of_all___termOfUnit, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym73$GATHER_PREDICATE_RULE_INDEX, $list74, $str75$Return_a_list_of_all_non_gaf_asse, $list76, $list50 );
    utilities_macros.register_cyc_api_function( $sym77$GATHER_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, $list78, $str79$Return_a_list_of_all_non_gaf_asse, $list76, $list50 );
    utilities_macros.register_cyc_api_function( $sym80$GATHER_ISA_RULE_INDEX, $list81, $str82$Return_a_list_of_all_non_gaf_asse, $list76, $list50 );
    utilities_macros.register_cyc_api_function( $sym83$GATHER_QUOTED_ISA_RULE_INDEX, $list81, $str84$Return_a_list_of_all_non_gaf_asse, $list76, $list50 );
    utilities_macros.register_cyc_api_function( $sym85$GATHER_GENLS_RULE_INDEX, $list81, $str86$Return_a_list_of_all_non_gaf_asse, $list76, $list50 );
    utilities_macros.register_cyc_api_function( $sym87$GATHER_GENL_MT_RULE_INDEX, $list88, $str89$Return_a_list_of_all_non_gaf_asse, $list76, $list50 );
    utilities_macros.register_cyc_api_function( $sym90$GATHER_FUNCTION_RULE_INDEX, $list91, $str92$Return_a_list_of_all_non_gaf_asse, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym93$GATHER_EXCEPTION_RULE_INDEX, $list94, $str95$Return_a_list_of_all_non_gaf_asse, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym96$GATHER_PRAGMA_RULE_INDEX, $list94, $str97$Return_a_list_of_all_non_gaf_asse, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym100$GATHER_MT_INDEX, $list101, $str102$Return_a_list_of_all_assertions_s, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym103$GATHER_OTHER_INDEX, $list101, $str104$Return_a_list_of_other_assertions, NIL, $list50 );
    utilities_macros.register_cyc_api_function( $sym105$GATHER_TERM_ASSERTIONS, $list106, $str107$Return_a_list_of_all_mt_relevant_, NIL, $list50 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_mapping_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_mapping_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_mapping_file();
  }
  static
  {
    me = new kb_mapping();
    $mapping_function$ = null;
    $mapping_truth$ = null;
    $mapping_direction$ = null;
    $map_term_selective_test$ = null;
    $map_term_selective_action$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUBINDEX" ), makeSymbol( "PRED-INDEX" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$PRED = makeUninternedSymbol( "PRED" );
    $sym2$DO_INTERMEDIATE_INDEX = makeSymbol( "DO-INTERMEDIATE-INDEX" );
    $sym3$PWHEN = makeSymbol( "PWHEN" );
    $sym4$RELEVANT_PRED_ = makeSymbol( "RELEVANT-PRED?" );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUBINDEX" ), makeSymbol( "MT-INDEX" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym6$MT = makeUninternedSymbol( "MT" );
    $sym7$RELEVANT_MT_ = makeSymbol( "RELEVANT-MT?" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUBINDEX" ), makeSymbol( "DIRECTION-INDEX" ), makeSymbol( "DIRECTION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym9$CANDIDATE_DIRECTION = makeUninternedSymbol( "CANDIDATE-DIRECTION" );
    $sym10$COR = makeSymbol( "COR" );
    $sym11$NULL = makeSymbol( "NULL" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASS" ), makeSymbol( "FINAL-INDEX" ), makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym13$DO_FINAL_INDEX = makeSymbol( "DO-FINAL-INDEX" );
    $sym14$ASSERTION_MATCHES_TRUTH_ = makeSymbol( "ASSERTION-MATCHES-TRUTH?" );
    $sym15$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym16$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $kw17$MAPPING_DONE = makeKeyword( "MAPPING-DONE" );
    $kw18$GAF = makeKeyword( "GAF" );
    $sym19$SENSE_P = makeSymbol( "SENSE-P" );
    $kw20$RULE = makeKeyword( "RULE" );
    $sym21$MAP_TERM = makeSymbol( "MAP-TERM" );
    $list22 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TERM" ) );
    $str23$Apply_FUNCTION_to_each_assertion_ = makeString( "Apply FUNCTION to each assertion indexed from TERM." );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "FUNCTION-SPEC-P" ) ) );
    $list25 = ConsesLow.list( makeSymbol( "NULL" ) );
    $sym26$MAP_TERM_SELECTIVE_INTERNAL = makeSymbol( "MAP-TERM-SELECTIVE-INTERNAL" );
    $sym27$MAP_TERM_SELECTIVE = makeSymbol( "MAP-TERM-SELECTIVE" );
    $list28 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TERM" ), makeSymbol( "TEST" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TRUTH" ) );
    $str29$Apply_FUNCTION_to_each_assertion_ = makeString( "Apply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.\n  If TRUTH is nil, all assertions are mapped." );
    $list30 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "TEST" ), makeSymbol( "FUNCTION-SPEC-P" ) ) );
    $sym31$MAP_TERM_GAFS = makeSymbol( "MAP-TERM-GAFS" );
    $list32 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TRUTH" ) );
    $str33$Apply_FUNCTION_to_every_gaf_index = makeString( "Apply FUNCTION to every gaf indexed from TERM.\n   If TRUTH is nil, all assertions are mapped." );
    $str34$mapping_broad_mt_index = makeString( "mapping broad mt index" );
    $sym35$STRINGP = makeSymbol( "STRINGP" );
    $kw36$SKIP = makeKeyword( "SKIP" );
    $sym37$MAP_MT_CONTENTS = makeSymbol( "MAP-MT-CONTENTS" );
    $list38 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TRUTH" ), makeSymbol( "GAFS-ONLY" ) );
    $str39$Apply_FUNCTION_to_each_assertion_ = makeString( "Apply FUNCTION to each assertion with TRUTH in MT TERM.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped." );
    $sym40$MAP_MT_INDEX = makeSymbol( "MAP-MT-INDEX" );
    $list41 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TRUTH" ), makeSymbol( "GAFS-ONLY" ) );
    $str42$Apply_FUNCTION_to_each_assertion_ = makeString( "Apply FUNCTION to each assertion with TRUTH at mt index MT.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped." );
    $sym43$MAP_HLMT_CONTENTS = makeSymbol( "MAP-HLMT-CONTENTS" );
    $sym44$MAP_HLMT_INDEX = makeSymbol( "MAP-HLMT-INDEX" );
    $sym45$MAP_OTHER_INDEX = makeSymbol( "MAP-OTHER-INDEX" );
    $str46$Apply_FUNCTION_to_each_assertion_ = makeString(
        "Apply FUNCTION to each assertion with TRUTH at other index TERM.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped." );
    $sym47$GATHER_INDEX = makeSymbol( "GATHER-INDEX" );
    $list48 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "REMOVE-DUPLICATES?" ) );
    $str49$Return_a_list_of_all_mt_relevant_ = makeString( "Return a list of all mt-relevant assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once." );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "ASSERTION-P" ) ) );
    $str51$So_don_t_ = makeString( "So don't!" );
    $str52$Can_t_gather_unknown_auxiliary_in = makeString( "Can't gather unknown auxiliary index ~s~%" );
    $sym53$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const54$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym55$GATHER_INDEX_IN_ANY_MT = makeSymbol( "GATHER-INDEX-IN-ANY-MT" );
    $str56$Return_a_list_of_all_assertions_i = makeString( "Return a list of all assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once." );
    $kw57$TRUE = makeKeyword( "TRUE" );
    $sym58$GATHER_GAF_ARG_INDEX = makeSymbol( "GATHER-GAF-ARG-INDEX" );
    $list59 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "ARGNUM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "PRED" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str60$Return_a_list_of_all_gaf_assertio = makeString(
        "Return a list of all gaf assertions such that:\na) TERM is its ARGNUMth argument\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if PRED is non-nil, then PRED must be its predicate\nd) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil)." );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGNUM" ), makeSymbol( "POSITIVE-INTEGER-P" ) ) );
    $sym62$GATHER_GAF_ARG_INDEX_WITH_PREDICATE = makeSymbol( "GATHER-GAF-ARG-INDEX-WITH-PREDICATE" );
    $list63 = ConsesLow.list( makeSymbol( "GATHER-GAF-ARG-INDEX" ) );
    $sym64$GATHER_NART_ARG_INDEX = makeSymbol( "GATHER-NART-ARG-INDEX" );
    $list65 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "ARGNUM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "FUNC" ) );
    $str66$Return_a_list_of_all___termOfUnit = makeString(
        "Return a list of all #$termOfUnit assertions with a naut arg2 such that:\na) TERM is its ARGNUMth argument\nb) if FUNC is non-nil, then FUNC must be its functor" );
    $sym67$GATHER_PREDICATE_EXTENT_INDEX = makeSymbol( "GATHER-PREDICATE-EXTENT-INDEX" );
    $list68 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "TRUTH" ), makeKeyword( "TRUE" ) ) );
    $str69$Return_a_list_of_all_gaf_assertio = makeString(
        "Return a list of all gaf assertions such that:\na) PRED is its predicate\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if MT is non-nil, then MT must be its microtheory." );
    $sym70$GATHER_FUNCTION_EXTENT_INDEX = makeSymbol( "GATHER-FUNCTION-EXTENT-INDEX" );
    $list71 = ConsesLow.list( makeSymbol( "FUNC" ) );
    $str72$Return_a_list_of_all___termOfUnit = makeString( "Return a list of all #$termOfUnit assertions such that:\nFUNC is the functor of the naut arg2." );
    $sym73$GATHER_PREDICATE_RULE_INDEX = makeSymbol( "GATHER-PREDICATE-RULE-INDEX" );
    $list74 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "SENSE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "DIRECTION" ) );
    $str75$Return_a_list_of_all_non_gaf_asse = makeString(
        "Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction." );
    $list76 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENSE" ), makeSymbol( "SENSE-P" ) ) );
    $sym77$GATHER_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol( "GATHER-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX" );
    $list78 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "SENSE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DIRECTION" ) );
    $str79$Return_a_list_of_all_non_gaf_asse = makeString(
        "Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist\nc) if DIRECTION is non-nil, then DIRECTION must be its direction." );
    $sym80$GATHER_ISA_RULE_INDEX = makeSymbol( "GATHER-ISA-RULE-INDEX" );
    $list81 = ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "SENSE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "DIRECTION" ) );
    $str82$Return_a_list_of_all_non_gaf_asse = makeString(
        "Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction." );
    $sym83$GATHER_QUOTED_ISA_RULE_INDEX = makeSymbol( "GATHER-QUOTED-ISA-RULE-INDEX" );
    $str84$Return_a_list_of_all_non_gaf_asse = makeString(
        "Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction." );
    $sym85$GATHER_GENLS_RULE_INDEX = makeSymbol( "GATHER-GENLS-RULE-INDEX" );
    $str86$Return_a_list_of_all_non_gaf_asse = makeString(
        "Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction." );
    $sym87$GATHER_GENL_MT_RULE_INDEX = makeSymbol( "GATHER-GENL-MT-RULE-INDEX" );
    $list88 = ConsesLow.list( makeSymbol( "GENL-MT" ), makeSymbol( "SENSE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "RULE-MT" ), makeSymbol( "DIRECTION" ) );
    $str89$Return_a_list_of_all_non_gaf_asse = makeString(
        "Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)\nb) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)\nc) if RULE-MT is non-nil, then RULE-MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction." );
    $sym90$GATHER_FUNCTION_RULE_INDEX = makeSymbol( "GATHER-FUNCTION-RULE-INDEX" );
    $list91 = ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "DIRECTION" ) );
    $str92$Return_a_list_of_all_non_gaf_asse = makeString(
        "Return a list of all non-gaf assertions (rules) such that:\na) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction." );
    $sym93$GATHER_EXCEPTION_RULE_INDEX = makeSymbol( "GATHER-EXCEPTION-RULE-INDEX" );
    $list94 = ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ), makeSymbol( "DIRECTION" ) );
    $str95$Return_a_list_of_all_non_gaf_asse = makeString(
        "Return a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (abnormal <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction." );
    $sym96$GATHER_PRAGMA_RULE_INDEX = makeSymbol( "GATHER-PRAGMA-RULE-INDEX" );
    $str97$Return_a_list_of_all_non_gaf_asse = makeString(
        "Return a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction." );
    $sym98$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $sym99$GATHER_ASSERTIONS = makeSymbol( "GATHER-ASSERTIONS" );
    $sym100$GATHER_MT_INDEX = makeSymbol( "GATHER-MT-INDEX" );
    $list101 = ConsesLow.list( makeSymbol( "TERM" ) );
    $str102$Return_a_list_of_all_assertions_s = makeString( "Return a list of all assertions such that TERM is its microtheory." );
    $sym103$GATHER_OTHER_INDEX = makeSymbol( "GATHER-OTHER-INDEX" );
    $str104$Return_a_list_of_other_assertions = makeString( "Return a list of other assertions mentioning TERM but not indexed in any other more useful manner." );
    $sym105$GATHER_TERM_ASSERTIONS = makeSymbol( "GATHER-TERM-ASSERTIONS" );
    $list106 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str107$Return_a_list_of_all_mt_relevant_ = makeString( "Return a list of all mt-relevant assertions of TERM." );
    $sym108$FORT_P = makeSymbol( "FORT-P" );
    $sym109$GATHER_META_ASSERTIONS = makeSymbol( "GATHER-META-ASSERTIONS" );
  }

  public static final class $assertion_with_search_term$UnaryFunction
      extends
        UnaryFunction
  {
    public $assertion_with_search_term$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ASSERTION-WITH-SEARCH-TERM" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return assertion_with_search_term( arg1 );
    }
  }

  public static final class $gather_assertions$UnaryFunction
      extends
        UnaryFunction
  {
    public $gather_assertions$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GATHER-ASSERTIONS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return gather_assertions( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2497 ms
 * 
 */