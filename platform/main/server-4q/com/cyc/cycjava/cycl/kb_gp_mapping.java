package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_gp_mapping
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_gp_mapping";
  public static final String myFingerPrint = "4991f980f0679868b49fd1b6e5e2a893962cd62fea598ccc50ae3e3ba22a7c1d";
  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 1072L)
  public static SubLSymbol $mapping_arg_swap$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$INDEX;
  private static final SubLSymbol $kw4$DONE;
  private static final SubLSymbol $sym5$PROGN;
  private static final SubLSymbol $sym6$WITH_ALL_SPEC_PREDICATES;
  private static final SubLSymbol $sym7$DO_GAF_ARG_INDEX;
  private static final SubLSymbol $kw8$TRUTH;
  private static final SubLSymbol $kw9$TRUE;
  private static final SubLSymbol $sym10$PWHEN;
  private static final SubLSymbol $sym11$DGAIGP_BINARY_;
  private static final SubLSymbol $sym12$WITH_ALL_SPEC_INVERSES;
  private static final SubLSymbol $sym13$BINARY_ARG_SWAP;
  private static final SubLSymbol $sym14$CLET;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$DO_GAF_ARG_INDEX_GP;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$ASSERTION;
  private static final SubLSymbol $sym19$DGAIVGP_ARG;
  private static final SubLSymbol $sym20$DO_GAF_ARG_INDEX_VALUES_GP;
  private static final SubLSymbol $kw21$MAPPING_DONE;
  private static final SubLSymbol $sym22$RELEVANT_PRED_IS_SPEC_PRED;
  private static final SubLSymbol $kw23$GAF;
  private static final SubLSymbol $sym24$RELEVANT_PRED_IS_SPEC_INVERSE;
  private static final SubLSymbol $sym25$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const26$EverythingPSC;
  private static final SubLSymbol $sym27$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $sym28$INDEXED_TERM_P;
  private static final SubLSymbol $sym29$FORT_P;
  private static final SubLSymbol $sym30$INTEGERP;
  private static final SubLSymbol $sym31$HLMT_P;
  private static final SubLSymbol $sym32$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym33$LISTP;
  private static final SubLSymbol $sym34$RELEVANT_MT_IS_IN_LIST;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$CDOLIST;
  private static final SubLSymbol $sym37$ALL_SPEC_PREDS;
  private static final SubLSymbol $sym38$ALL_SPEC_INVERSES;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$SPEC_PRED;
  private static final SubLSymbol $sym42$DO_ALL_SPEC_PREDICATES2;
  private static final SubLSymbol $sym43$DO_PREDICATE_EXTENT_INDEX;
  private static final SubLSymbol $sym44$BINARY_;
  private static final SubLSymbol $sym45$DO_ALL_SPEC_INVERSES2;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$SPEC_PRED;
  private static final SubLSymbol $sym48$WITH_ALL_MTS;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$SPEC_PRED;
  private static final SubLSymbol $kw51$PREDICATE;
  private static final SubLSymbol $sym52$DO_ARG_INDEX_WITH_SPEC_PREDS;

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 1111L)
  public static SubLObject do_gaf_arg_index_gp(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    predicate = current.first();
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
    final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw3$INDEX, current );
    final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym5$PROGN, ConsesLow.list( $sym6$WITH_ALL_SPEC_PREDICATES, predicate, ConsesLow.listS( $sym7$DO_GAF_ARG_INDEX, ConsesLow.list( var, v_term, $kw3$INDEX, index, $kw8$TRUTH, $kw9$TRUE,
        $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym10$PWHEN, ConsesLow.list( $sym11$DGAIGP_BINARY_, predicate ), ConsesLow.list( $sym12$WITH_ALL_SPEC_INVERSES, predicate, ConsesLow.list(
            $sym7$DO_GAF_ARG_INDEX, ConsesLow.list( var, v_term, $kw3$INDEX, ConsesLow.list( $sym13$BINARY_ARG_SWAP, index ), $kw8$TRUTH, $kw9$TRUE, $kw4$DONE, done ), ConsesLow.listS( $sym14$CLET, $list15, ConsesLow
                .append( body, NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 2086L)
  public static SubLObject dgaigp_binaryP(final SubLObject predicate)
  {
    return arity.binaryP( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 2195L)
  public static SubLObject do_gaf_arg_index_values_gp(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject gather_index = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    gather_index = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list17 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list17 );
      if( NIL == conses_high.member( current_$2, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
    }
    final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw3$INDEX, current );
    final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject assertion = $sym18$ASSERTION;
    return ConsesLow.list( $sym16$DO_GAF_ARG_INDEX_GP, ConsesLow.list( assertion, v_term, predicate, $kw3$INDEX, index, $kw4$DONE, done ), ConsesLow.listS( $sym14$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow
        .list( $sym19$DGAIVGP_ARG, assertion, gather_index ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 2597L)
  public static SubLObject dgaivgp_arg(final SubLObject assertion, final SubLObject gather_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return assertions_high.gaf_arg( assertion, ( NIL != $mapping_arg_swap$.getDynamicValue( thread ) ) ? arity.binary_arg_swap( gather_index ) : gather_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 2812L)
  public static SubLObject gp_map_arg_index(final SubLObject function, final SubLObject v_term, final SubLObject arg, final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw21$MAPPING_DONE );
      SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
      SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
      try
      {
        pred_relevance_macros.$relevant_pred_function$.bind( $sym22$RELEVANT_PRED_IS_SPEC_PRED, thread );
        pred_relevance_macros.$pred$.bind( predicate, thread );
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, arg, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, arg, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$3 = NIL;
                final SubLObject token_var_$4 = NIL;
                while ( NIL == done_var_$3)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                  final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( assertion ) );
                  if( NIL != valid_$5 )
                  {
                    Functions.funcall( function, assertion );
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
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
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
      finally
      {
        pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
        pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
      }
      if( NIL != dgaigp_binaryP( predicate ) )
      {
        _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
        _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
        try
        {
          pred_relevance_macros.$relevant_pred_function$.bind( $sym24$RELEVANT_PRED_IS_SPEC_INVERSE, thread );
          pred_relevance_macros.$pred$.bind( predicate, thread );
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, arity.binary_arg_swap( arg ), pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, arity.binary_arg_swap( arg ), pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw9$TRUE, NIL );
                  SubLObject done_var_$4 = NIL;
                  final SubLObject token_var_$5 = NIL;
                  while ( NIL == done_var_$4)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                    final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( assertion ) );
                    if( NIL != valid_$6 )
                    {
                      final SubLObject _prev_bind_0_$7 = $mapping_arg_swap$.currentBinding( thread );
                      try
                      {
                        $mapping_arg_swap$.bind( makeBoolean( NIL == $mapping_arg_swap$.getDynamicValue( thread ) ), thread );
                        Functions.funcall( function, assertion );
                      }
                      finally
                      {
                        $mapping_arg_swap$.rebind( _prev_bind_0_$7, thread );
                      }
                    }
                    done_var_$4 = makeBoolean( NIL == valid_$6 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        finally
        {
          pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
          pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw21$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 3161L)
  public static SubLObject gp_gather_gaf_arg_index(final SubLObject v_term, final SubLObject arg, final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    if( NIL == mt )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym25$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const26$EverythingPSC, thread );
        final SubLObject _prev_bind_0_$12 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$13 = pred_relevance_macros.$pred$.currentBinding( thread );
        try
        {
          pred_relevance_macros.$relevant_pred_function$.bind( $sym22$RELEVANT_PRED_IS_SPEC_PRED, thread );
          pred_relevance_macros.$pred$.bind( predicate, thread );
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, arg, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, arg, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw9$TRUE, NIL );
                  SubLObject done_var_$14 = NIL;
                  final SubLObject token_var_$15 = NIL;
                  while ( NIL == done_var_$14)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$15 );
                    final SubLObject valid_$16 = makeBoolean( !token_var_$15.eql( assertion ) );
                    if( NIL != valid_$16 )
                    {
                      v_answer = ConsesLow.cons( assertion, v_answer );
                    }
                    done_var_$14 = makeBoolean( NIL == valid_$16 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        finally
        {
          pred_relevance_macros.$pred$.rebind( _prev_bind_1_$13, thread );
          pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0_$12, thread );
        }
        if( NIL != dgaigp_binaryP( predicate ) )
        {
          final SubLObject _prev_bind_0_$14 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$14 = pred_relevance_macros.$pred$.currentBinding( thread );
          try
          {
            pred_relevance_macros.$relevant_pred_function$.bind( $sym24$RELEVANT_PRED_IS_SPEC_INVERSE, thread );
            pred_relevance_macros.$pred$.bind( predicate, thread );
            final SubLObject pred_var = NIL;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, arity.binary_arg_swap( arg ), pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, arity.binary_arg_swap( arg ), pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw9$TRUE, NIL );
                    SubLObject done_var_$15 = NIL;
                    final SubLObject token_var_$16 = NIL;
                    while ( NIL == done_var_$15)
                    {
                      final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$16 );
                      final SubLObject valid_$17 = makeBoolean( !token_var_$16.eql( assertion ) );
                      if( NIL != valid_$17 )
                      {
                        final SubLObject _prev_bind_0_$15 = $mapping_arg_swap$.currentBinding( thread );
                        try
                        {
                          $mapping_arg_swap$.bind( makeBoolean( NIL == $mapping_arg_swap$.getDynamicValue( thread ) ), thread );
                          v_answer = ConsesLow.cons( assertion, v_answer );
                        }
                        finally
                        {
                          $mapping_arg_swap$.rebind( _prev_bind_0_$15, thread );
                        }
                      }
                      done_var_$15 = makeBoolean( NIL == valid_$17 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
          finally
          {
            pred_relevance_macros.$pred$.rebind( _prev_bind_1_$14, thread );
            pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0_$14, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym27$RELEVANT_MT_IS_EQ, thread );
        mt_relevance_macros.$mt$.bind( mt, thread );
        final SubLObject _prev_bind_0_$17 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$15 = pred_relevance_macros.$pred$.currentBinding( thread );
        try
        {
          pred_relevance_macros.$relevant_pred_function$.bind( $sym22$RELEVANT_PRED_IS_SPEC_PRED, thread );
          pred_relevance_macros.$pred$.bind( predicate, thread );
          final SubLObject pred_var = NIL;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, arg, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, arg, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw9$TRUE, NIL );
                  SubLObject done_var_$16 = NIL;
                  final SubLObject token_var_$17 = NIL;
                  while ( NIL == done_var_$16)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$17 );
                    final SubLObject valid_$18 = makeBoolean( !token_var_$17.eql( assertion ) );
                    if( NIL != valid_$18 )
                    {
                      v_answer = ConsesLow.cons( assertion, v_answer );
                    }
                    done_var_$16 = makeBoolean( NIL == valid_$18 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        finally
        {
          pred_relevance_macros.$pred$.rebind( _prev_bind_1_$15, thread );
          pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0_$17, thread );
        }
        if( NIL != dgaigp_binaryP( predicate ) )
        {
          final SubLObject _prev_bind_0_$19 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$16 = pred_relevance_macros.$pred$.currentBinding( thread );
          try
          {
            pred_relevance_macros.$relevant_pred_function$.bind( $sym24$RELEVANT_PRED_IS_SPEC_INVERSE, thread );
            pred_relevance_macros.$pred$.bind( predicate, thread );
            final SubLObject pred_var = NIL;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, arity.binary_arg_swap( arg ), pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, arity.binary_arg_swap( arg ), pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw9$TRUE, NIL );
                    SubLObject done_var_$17 = NIL;
                    final SubLObject token_var_$18 = NIL;
                    while ( NIL == done_var_$17)
                    {
                      final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$18 );
                      final SubLObject valid_$19 = makeBoolean( !token_var_$18.eql( assertion ) );
                      if( NIL != valid_$19 )
                      {
                        final SubLObject _prev_bind_0_$20 = $mapping_arg_swap$.currentBinding( thread );
                        try
                        {
                          $mapping_arg_swap$.bind( makeBoolean( NIL == $mapping_arg_swap$.getDynamicValue( thread ) ), thread );
                          v_answer = ConsesLow.cons( assertion, v_answer );
                        }
                        finally
                        {
                          $mapping_arg_swap$.rebind( _prev_bind_0_$20, thread );
                        }
                      }
                      done_var_$17 = makeBoolean( NIL == valid_$19 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
          finally
          {
            pred_relevance_macros.$pred$.rebind( _prev_bind_1_$16, thread );
            pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0_$19, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 3636L)
  public static SubLObject gp_fpred_value(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    assert NIL != forts.fort_p( pred ) : pred;
    assert NIL != Types.integerp( index_arg ) : index_arg;
    assert NIL != Types.integerp( gather_arg ) : gather_arg;
    SubLObject done = NIL;
    SubLObject v_answer = NIL;
    SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
    try
    {
      pred_relevance_macros.$relevant_pred_function$.bind( $sym22$RELEVANT_PRED_IS_SPEC_PRED, thread );
      pred_relevance_macros.$pred$.bind( pred, thread );
      final SubLObject pred_var = NIL;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, index_arg, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, index_arg, pred_var );
        SubLObject done_var = done;
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw9$TRUE, NIL );
              SubLObject done_var_$38 = done;
              final SubLObject token_var_$39 = NIL;
              while ( NIL == done_var_$38)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$39 );
                final SubLObject valid_$40 = makeBoolean( !token_var_$39.eql( assertion ) );
                if( NIL != valid_$40 )
                {
                  final SubLObject value = v_answer = dgaivgp_arg( assertion, gather_arg );
                  done = T;
                }
                done_var_$38 = makeBoolean( NIL == valid_$40 || NIL != done );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != done );
        }
      }
    }
    finally
    {
      pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != dgaigp_binaryP( pred ) )
    {
      _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
      _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
      try
      {
        pred_relevance_macros.$relevant_pred_function$.bind( $sym24$RELEVANT_PRED_IS_SPEC_INVERSE, thread );
        pred_relevance_macros.$pred$.bind( pred, thread );
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, arity.binary_arg_swap( index_arg ), pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, arity.binary_arg_swap( index_arg ), pred_var );
          SubLObject done_var = done;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$39 = done;
                final SubLObject token_var_$40 = NIL;
                while ( NIL == done_var_$39)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$40 );
                  final SubLObject valid_$41 = makeBoolean( !token_var_$40.eql( assertion ) );
                  if( NIL != valid_$41 )
                  {
                    final SubLObject _prev_bind_0_$42 = $mapping_arg_swap$.currentBinding( thread );
                    try
                    {
                      $mapping_arg_swap$.bind( makeBoolean( NIL == $mapping_arg_swap$.getDynamicValue( thread ) ), thread );
                      final SubLObject value2 = v_answer = dgaivgp_arg( assertion, gather_arg );
                      done = T;
                    }
                    finally
                    {
                      $mapping_arg_swap$.rebind( _prev_bind_0_$42, thread );
                    }
                  }
                  done_var_$39 = makeBoolean( NIL == valid_$41 || NIL != done );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != done );
          }
        }
      }
      finally
      {
        pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
        pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 4147L)
  public static SubLObject gp_fpred_value_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      ans = gp_fpred_value( v_term, pred, index_arg, gather_arg );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 4447L)
  public static SubLObject gp_fpred_value_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( mts ) : mts;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym34$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      ans = gp_fpred_value( v_term, pred, index_arg, gather_arg );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 4756L)
  public static SubLObject gp_fpred_value_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym25$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const26$EverythingPSC, thread );
      ans = gp_fpred_value( v_term, pred, index_arg, gather_arg );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 5038L)
  public static SubLObject gp_fpred_value_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      ans = gp_fpred_value( v_term, pred, index_arg, gather_arg );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 5339L)
  public static SubLObject gp_pred_values(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( v_term ) : v_term;
    assert NIL != forts.fort_p( pred ) : pred;
    assert NIL != Types.integerp( index_arg ) : index_arg;
    assert NIL != Types.integerp( gather_arg ) : gather_arg;
    SubLObject v_answer = NIL;
    SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
    try
    {
      pred_relevance_macros.$relevant_pred_function$.bind( $sym22$RELEVANT_PRED_IS_SPEC_PRED, thread );
      pred_relevance_macros.$pred$.bind( pred, thread );
      final SubLObject pred_var = NIL;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, index_arg, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, index_arg, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw9$TRUE, NIL );
              SubLObject done_var_$47 = NIL;
              final SubLObject token_var_$48 = NIL;
              while ( NIL == done_var_$47)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$48 );
                final SubLObject valid_$49 = makeBoolean( !token_var_$48.eql( assertion ) );
                if( NIL != valid_$49 )
                {
                  final SubLObject value = dgaivgp_arg( assertion, gather_arg );
                  if( NIL != control_vars.$mapping_equality_test$.getDynamicValue( thread ) )
                  {
                    final SubLObject item_var = value;
                    if( NIL == conses_high.member( item_var, v_answer, control_vars.$mapping_equality_test$.getDynamicValue( thread ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      v_answer = ConsesLow.cons( item_var, v_answer );
                    }
                  }
                  else
                  {
                    v_answer = ConsesLow.cons( value, v_answer );
                  }
                }
                done_var_$47 = makeBoolean( NIL == valid_$49 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != dgaigp_binaryP( pred ) )
    {
      _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
      _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding( thread );
      try
      {
        pred_relevance_macros.$relevant_pred_function$.bind( $sym24$RELEVANT_PRED_IS_SPEC_INVERSE, thread );
        pred_relevance_macros.$pred$.bind( pred, thread );
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, arity.binary_arg_swap( index_arg ), pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, arity.binary_arg_swap( index_arg ), pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw23$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$48 = NIL;
                final SubLObject token_var_$49 = NIL;
                while ( NIL == done_var_$48)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$49 );
                  final SubLObject valid_$50 = makeBoolean( !token_var_$49.eql( assertion ) );
                  if( NIL != valid_$50 )
                  {
                    final SubLObject _prev_bind_0_$51 = $mapping_arg_swap$.currentBinding( thread );
                    try
                    {
                      $mapping_arg_swap$.bind( makeBoolean( NIL == $mapping_arg_swap$.getDynamicValue( thread ) ), thread );
                      final SubLObject value2 = dgaivgp_arg( assertion, gather_arg );
                      if( NIL != control_vars.$mapping_equality_test$.getDynamicValue( thread ) )
                      {
                        final SubLObject item_var2 = value2;
                        if( NIL == conses_high.member( item_var2, v_answer, control_vars.$mapping_equality_test$.getDynamicValue( thread ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          v_answer = ConsesLow.cons( item_var2, v_answer );
                        }
                      }
                      else
                      {
                        v_answer = ConsesLow.cons( value2, v_answer );
                      }
                    }
                    finally
                    {
                      $mapping_arg_swap$.rebind( _prev_bind_0_$51, thread );
                    }
                  }
                  done_var_$48 = makeBoolean( NIL == valid_$50 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        pred_relevance_macros.$pred$.rebind( _prev_bind_2, thread );
        pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 5906L)
  public static SubLObject gp_pred_values_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      ans = gp_pred_values( v_term, pred, index_arg, gather_arg );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 6128L)
  public static SubLObject gp_pred_values_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( mts ) : mts;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym34$RELEVANT_MT_IS_IN_LIST, thread );
      mt_relevance_macros.$relevant_mts$.bind( mts, thread );
      ans = gp_pred_values( v_term, pred, index_arg, gather_arg );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 6358L)
  public static SubLObject gp_pred_values_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym25$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const26$EverythingPSC, thread );
      ans = gp_pred_values( v_term, pred, index_arg, gather_arg );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 6558L)
  public static SubLObject gp_pred_values_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( gather_arg == UNPROVIDED )
    {
      gather_arg = TWO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      ans = gp_pred_values( v_term, pred, index_arg, gather_arg );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 6772L)
  public static SubLObject do_all_spec_predicates2(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym36$CDOLIST, ConsesLow.list( var, ConsesLow.list( $sym37$ALL_SPEC_PREDS, pred ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 7036L)
  public static SubLObject do_all_spec_inverses2(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym36$CDOLIST, ConsesLow.list( var, ConsesLow.list( $sym38$ALL_SPEC_INVERSES, pred ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 7163L)
  public static SubLObject some_spec_pred_value_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw9$TRUE;
    }
    SubLObject cdolist_list_var = genl_predicates.all_spec_preds( pred, UNPROVIDED, UNPROVIDED );
    SubLObject spec_pred = NIL;
    spec_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( v_term, spec_pred, mt, index_arg, truth ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_pred = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 7423L)
  public static SubLObject do_spec_pred_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    pred = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$56 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list39 );
      current_$56 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list39 );
      if( NIL == conses_high.member( current_$56, $list40, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$56 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
    }
    final SubLObject truth_tail = cdestructuring_bind.property_list_member( $kw8$TRUTH, current );
    final SubLObject truth = ( NIL != truth_tail ) ? conses_high.cadr( truth_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject spec_pred = $sym41$SPEC_PRED;
    return ConsesLow.list( $sym5$PROGN, ConsesLow.list( $sym42$DO_ALL_SPEC_PREDICATES2, ConsesLow.list( spec_pred, pred ), ConsesLow.listS( $sym43$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( var, spec_pred, $kw8$TRUTH,
        truth, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym10$PWHEN, ConsesLow.list( $sym44$BINARY_, pred ), ConsesLow.list( $sym14$CLET, $list15, ConsesLow.list(
            $sym45$DO_ALL_SPEC_INVERSES2, ConsesLow.list( spec_pred, pred ), ConsesLow.listS( $sym43$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( var, spec_pred, $kw8$TRUTH, truth, $kw4$DONE, done ), ConsesLow.append(
                body, NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 7915L)
  public static SubLObject do_spec_pred_index_in_any_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    done = current.first();
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list46 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject spec_pred = $sym47$SPEC_PRED;
      return ConsesLow.list( $sym48$WITH_ALL_MTS, ConsesLow.list( $sym42$DO_ALL_SPEC_PREDICATES2, ConsesLow.list( spec_pred, pred ), ConsesLow.listS( $sym43$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( var, spec_pred,
          $kw8$TRUTH, truth, $kw4$DONE, done ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list46 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 8446L)
  public static SubLObject do_arg_index_with_spec_preds(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    done = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list49 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list49 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject spec_pred = $sym50$SPEC_PRED;
      return ConsesLow.list( $sym42$DO_ALL_SPEC_PREDICATES2, ConsesLow.list( spec_pred, pred ), ConsesLow.listS( $sym7$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw51$PREDICATE, spec_pred,
        $kw3$INDEX, index, $kw8$TRUTH, truth, $kw4$DONE, done
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list49 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 8953L)
  public static SubLObject do_arg_index_in_any_mt_with_spec_preds(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    SubLObject pred = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    done = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list49 );
    current = current.rest();
    final SubLObject truth = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list49 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym48$WITH_ALL_MTS, ConsesLow.listS( $sym52$DO_ARG_INDEX_WITH_SPEC_PREDS, ConsesLow.list( var, v_term, pred, done, index, truth ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list49 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-gp-mapping.lisp", position = 9428L)
  public static SubLObject num_spec_pred_index(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      SubLObject cdolist_list_var = genl_predicates.all_spec_preds( pred, UNPROVIDED, UNPROVIDED );
      SubLObject spec_pred = NIL;
      spec_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, kb_indexing.num_predicate_extent_index( spec_pred, UNPROVIDED ) );
        cdolist_list_var = cdolist_list_var.rest();
        spec_pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  public static SubLObject declare_kb_gp_mapping_file()
  {
    SubLFiles.declareMacro( me, "do_gaf_arg_index_gp", "DO-GAF-ARG-INDEX-GP" );
    SubLFiles.declareFunction( me, "dgaigp_binaryP", "DGAIGP-BINARY?", 1, 0, false );
    SubLFiles.declareMacro( me, "do_gaf_arg_index_values_gp", "DO-GAF-ARG-INDEX-VALUES-GP" );
    SubLFiles.declareFunction( me, "dgaivgp_arg", "DGAIVGP-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "gp_map_arg_index", "GP-MAP-ARG-INDEX", 4, 0, false );
    SubLFiles.declareFunction( me, "gp_gather_gaf_arg_index", "GP-GATHER-GAF-ARG-INDEX", 3, 1, false );
    SubLFiles.declareFunction( me, "gp_fpred_value", "GP-FPRED-VALUE", 2, 2, false );
    SubLFiles.declareFunction( me, "gp_fpred_value_in_mt", "GP-FPRED-VALUE-IN-MT", 3, 2, false );
    SubLFiles.declareFunction( me, "gp_fpred_value_in_mts", "GP-FPRED-VALUE-IN-MTS", 3, 2, false );
    SubLFiles.declareFunction( me, "gp_fpred_value_in_any_mt", "GP-FPRED-VALUE-IN-ANY-MT", 2, 2, false );
    SubLFiles.declareFunction( me, "gp_fpred_value_in_relevant_mts", "GP-FPRED-VALUE-IN-RELEVANT-MTS", 2, 3, false );
    SubLFiles.declareFunction( me, "gp_pred_values", "GP-PRED-VALUES", 2, 2, false );
    SubLFiles.declareFunction( me, "gp_pred_values_in_mt", "GP-PRED-VALUES-IN-MT", 3, 2, false );
    SubLFiles.declareFunction( me, "gp_pred_values_in_mts", "GP-PRED-VALUES-IN-MTS", 3, 2, false );
    SubLFiles.declareFunction( me, "gp_pred_values_in_any_mt", "GP-PRED-VALUES-IN-ANY-MT", 2, 2, false );
    SubLFiles.declareFunction( me, "gp_pred_values_in_relevant_mts", "GP-PRED-VALUES-IN-RELEVANT-MTS", 2, 3, false );
    SubLFiles.declareMacro( me, "do_all_spec_predicates2", "DO-ALL-SPEC-PREDICATES2" );
    SubLFiles.declareMacro( me, "do_all_spec_inverses2", "DO-ALL-SPEC-INVERSES2" );
    SubLFiles.declareFunction( me, "some_spec_pred_value_in_relevant_mts", "SOME-SPEC-PRED-VALUE-IN-RELEVANT-MTS", 2, 3, false );
    SubLFiles.declareMacro( me, "do_spec_pred_index", "DO-SPEC-PRED-INDEX" );
    SubLFiles.declareMacro( me, "do_spec_pred_index_in_any_mt", "DO-SPEC-PRED-INDEX-IN-ANY-MT" );
    SubLFiles.declareMacro( me, "do_arg_index_with_spec_preds", "DO-ARG-INDEX-WITH-SPEC-PREDS" );
    SubLFiles.declareMacro( me, "do_arg_index_in_any_mt_with_spec_preds", "DO-ARG-INDEX-IN-ANY-MT-WITH-SPEC-PREDS" );
    SubLFiles.declareFunction( me, "num_spec_pred_index", "NUM-SPEC-PRED-INDEX", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_kb_gp_mapping_file()
  {
    $mapping_arg_swap$ = SubLFiles.defparameter( "*MAPPING-ARG-SWAP*", NIL );
    return NIL;
  }

  public static SubLObject setup_kb_gp_mapping_file()
  {
    access_macros.register_macro_helper( $sym11$DGAIGP_BINARY_, $sym16$DO_GAF_ARG_INDEX_GP );
    access_macros.register_macro_helper( $sym19$DGAIVGP_ARG, $sym20$DO_GAF_ARG_INDEX_VALUES_GP );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_gp_mapping_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_gp_mapping_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_gp_mapping_file();
  }
  static
  {
    me = new kb_gp_mapping();
    $mapping_arg_swap$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PREDICATE" ), makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "INDEX" ), makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$INDEX = makeKeyword( "INDEX" );
    $kw4$DONE = makeKeyword( "DONE" );
    $sym5$PROGN = makeSymbol( "PROGN" );
    $sym6$WITH_ALL_SPEC_PREDICATES = makeSymbol( "WITH-ALL-SPEC-PREDICATES" );
    $sym7$DO_GAF_ARG_INDEX = makeSymbol( "DO-GAF-ARG-INDEX" );
    $kw8$TRUTH = makeKeyword( "TRUTH" );
    $kw9$TRUE = makeKeyword( "TRUE" );
    $sym10$PWHEN = makeSymbol( "PWHEN" );
    $sym11$DGAIGP_BINARY_ = makeSymbol( "DGAIGP-BINARY?" );
    $sym12$WITH_ALL_SPEC_INVERSES = makeSymbol( "WITH-ALL-SPEC-INVERSES" );
    $sym13$BINARY_ARG_SWAP = makeSymbol( "BINARY-ARG-SWAP" );
    $sym14$CLET = makeSymbol( "CLET" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "*MAPPING-ARG-SWAP*" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "*MAPPING-ARG-SWAP*" ) ) ) );
    $sym16$DO_GAF_ARG_INDEX_GP = makeSymbol( "DO-GAF-ARG-INDEX-GP" );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "GATHER-INDEX" ), makeSymbol( "PREDICATE" ), makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "DONE" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym18$ASSERTION = makeUninternedSymbol( "ASSERTION" );
    $sym19$DGAIVGP_ARG = makeSymbol( "DGAIVGP-ARG" );
    $sym20$DO_GAF_ARG_INDEX_VALUES_GP = makeSymbol( "DO-GAF-ARG-INDEX-VALUES-GP" );
    $kw21$MAPPING_DONE = makeKeyword( "MAPPING-DONE" );
    $sym22$RELEVANT_PRED_IS_SPEC_PRED = makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED" );
    $kw23$GAF = makeKeyword( "GAF" );
    $sym24$RELEVANT_PRED_IS_SPEC_INVERSE = makeSymbol( "RELEVANT-PRED-IS-SPEC-INVERSE" );
    $sym25$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const26$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym27$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $sym28$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym29$FORT_P = makeSymbol( "FORT-P" );
    $sym30$INTEGERP = makeSymbol( "INTEGERP" );
    $sym31$HLMT_P = makeSymbol( "HLMT-P" );
    $sym32$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym33$LISTP = makeSymbol( "LISTP" );
    $sym34$RELEVANT_MT_IS_IN_LIST = makeSymbol( "RELEVANT-MT-IS-IN-LIST" );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PRED" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym36$CDOLIST = makeSymbol( "CDOLIST" );
    $sym37$ALL_SPEC_PREDS = makeSymbol( "ALL-SPEC-PREDS" );
    $sym38$ALL_SPEC_INVERSES = makeSymbol( "ALL-SPEC-INVERSES" );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PRED" ), makeSymbol( "&KEY" ), makeSymbol( "TRUTH" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list40 = ConsesLow.list( makeKeyword( "TRUTH" ), makeKeyword( "DONE" ) );
    $sym41$SPEC_PRED = makeUninternedSymbol( "SPEC-PRED" );
    $sym42$DO_ALL_SPEC_PREDICATES2 = makeSymbol( "DO-ALL-SPEC-PREDICATES2" );
    $sym43$DO_PREDICATE_EXTENT_INDEX = makeSymbol( "DO-PREDICATE-EXTENT-INDEX" );
    $sym44$BINARY_ = makeSymbol( "BINARY?" );
    $sym45$DO_ALL_SPEC_INVERSES2 = makeSymbol( "DO-ALL-SPEC-INVERSES2" );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym47$SPEC_PRED = makeUninternedSymbol( "SPEC-PRED" );
    $sym48$WITH_ALL_MTS = makeSymbol( "WITH-ALL-MTS" );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "PRED" ), makeSymbol( "DONE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "INDEX" ), ONE_INTEGER ),
        makeSymbol( "TRUTH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym50$SPEC_PRED = makeUninternedSymbol( "SPEC-PRED" );
    $kw51$PREDICATE = makeKeyword( "PREDICATE" );
    $sym52$DO_ARG_INDEX_WITH_SPEC_PREDS = makeSymbol( "DO-ARG-INDEX-WITH-SPEC-PREDS" );
  }
}
/*
 * 
 * Total time: 806 ms
 * 
 */