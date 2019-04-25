package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class auxiliary_indexing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.auxiliary_indexing";
  public static final String myFingerPrint = "c9a53c067c7bd733fcdb193caff972d40438e64a4c85e3c038e3f323a066623c";
  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 999L)
  private static SubLSymbol $auxiliary_indices$;
  private static final SubLSymbol $sym0$SYMBOLP;
  private static final SubLSymbol $sym1$STRINGP;
  private static final SubLSymbol $kw2$INDEX_NAME;
  private static final SubLSymbol $kw3$INDEX;
  private static final SubLSymbol $kw4$UNBOUND_RULE_INDEX;
  private static final SubLString $str5$Unbound_Rule_Index;
  private static final SubLSymbol $kw6$UNBOUND_RULE_INDEX_POS;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$UNBOUND_RULE_INDEX_NEG;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$RELEVANT_MT_;
  private static final SubLSymbol $sym11$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym12$SENSE_P;
  private static final SubLSymbol $kw13$MAPPING_DONE;
  private static final SubLSymbol $kw14$RULE;
  private static final SubLSymbol $sym15$HLMT_P;
  private static final SubLSymbol $kw16$POS;
  private static final SubLSymbol $sym17$UNBOUND_PREDICATE_LITERAL;
  private static final SubLString $str18$Rebuilding_unbound_rule_index_str;
  private static final SubLSymbol $kw19$SKIP;

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1111L)
  public static SubLObject auxiliary_indices()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.copy_list( $auxiliary_indices$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1182L)
  public static SubLObject declare_auxiliary_index(final SubLObject aux_index, final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.symbolp( aux_index ) : aux_index;
    assert NIL != Types.stringp( name ) : name;
    if( NIL == conses_high.member( aux_index, $auxiliary_indices$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $auxiliary_indices$.setDynamicValue( ConsesLow.cons( aux_index, $auxiliary_indices$.getDynamicValue( thread ) ), thread );
    }
    Symbols.put( aux_index, $kw2$INDEX_NAME, name );
    return aux_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1398L)
  public static SubLObject auxiliary_index_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( v_object, $auxiliary_indices$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1480L)
  public static SubLObject get_auxiliary_index(final SubLObject aux_index)
  {
    return Symbols.get( aux_index, $kw3$INDEX, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1557L)
  public static SubLObject auxiliary_index_swapped_inP(final SubLObject aux_index)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1684L)
  public static SubLObject reset_auxiliary_index(final SubLObject aux_index, final SubLObject new_index)
  {
    if( NIL != new_index )
    {
      Symbols.put( aux_index, $kw3$INDEX, new_index );
    }
    else
    {
      Symbols.remprop( aux_index, $kw3$INDEX );
    }
    return aux_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1848L)
  public static SubLObject clear_auxiliary_index(final SubLObject aux_index)
  {
    return reset_auxiliary_index( aux_index, kb_indexing_datastructures.new_simple_index() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1953L)
  public static SubLObject auxiliary_index_name(final SubLObject aux_index)
  {
    return Symbols.get( aux_index, $kw2$INDEX_NAME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 3441L)
  public static SubLObject num_unbound_rule_index(SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( unbound_rule_index() ) )
    {
      SubLObject count = ZERO_INTEGER;
      SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list( unbound_rule_index() );
      SubLObject ass = NIL;
      ass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != simple_indexing.matches_unbound_rule_index( ass, sense, mt, direction ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        ass = cdolist_list_var.first();
      }
      return count;
    }
    if( NIL == sense )
    {
      SubLObject count = ZERO_INTEGER;
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$1 = NIL;
      sense_$1 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, num_unbound_rule_index( sense_$1, UNPROVIDED, UNPROVIDED ) );
        cdolist_list_var = cdolist_list_var.rest();
        sense_$1 = cdolist_list_var.first();
      }
      return count;
    }
    final SubLObject unbound_rule_subindex = get_unbound_rule_subindex( sense, mt, direction );
    return ( NIL != unbound_rule_subindex ) ? kb_indexing_datastructures.subindex_leaf_count( unbound_rule_subindex ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 4174L)
  public static SubLObject relevant_num_unbound_rule_index(SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject count = ZERO_INTEGER;
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( unbound_rule_index() ) )
    {
      SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list( unbound_rule_index() );
      SubLObject ass = NIL;
      ass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != simple_indexing.matches_unbound_rule_index( ass, sense, UNPROVIDED, UNPROVIDED ) && NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( ass ) ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        ass = cdolist_list_var.first();
      }
    }
    else if( NIL == sense )
    {
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$2 = NIL;
      sense_$2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, relevant_num_unbound_rule_index( sense_$2 ) );
        cdolist_list_var = cdolist_list_var.rest();
        sense_$2 = cdolist_list_var.first();
      }
    }
    else
    {
      SubLObject cdolist_list_var2;
      final SubLObject mts = cdolist_list_var2 = key_unbound_rule_index( sense, UNPROVIDED );
      SubLObject mt = NIL;
      mt = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
        {
          count = Numbers.add( count, num_unbound_rule_index( sense, mt, UNPROVIDED ) );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        mt = cdolist_list_var2.first();
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 4956L)
  public static SubLObject key_unbound_rule_index(SubLObject sense, SubLObject mt)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( unbound_rule_index() ) )
    {
      SubLObject v_answer = NIL;
      SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list( unbound_rule_index() );
      SubLObject ass = NIL;
      ass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        v_answer = simple_indexing.simple_key_unbound_rule_index( ass, v_answer, sense, mt );
        cdolist_list_var = cdolist_list_var.rest();
        ass = cdolist_list_var.first();
      }
      return v_answer;
    }
    if( NIL == sense )
    {
      SubLObject keys = NIL;
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$3 = NIL;
      sense_$3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( num_unbound_rule_index( sense_$3, UNPROVIDED, UNPROVIDED ).isPositive() )
        {
          keys = ConsesLow.cons( sense_$3, keys );
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense_$3 = cdolist_list_var.first();
      }
      return keys;
    }
    final SubLObject subindex = get_unbound_rule_subindex( sense, mt, UNPROVIDED );
    return ( NIL != kb_indexing_datastructures.intermediate_index_p( subindex ) ) ? kb_indexing_datastructures.intermediate_index_keys( subindex ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 5691L)
  public static SubLObject relevant_key_unbound_rule_index(SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != kb_indexing_datastructures.simple_indexed_term_p( unbound_rule_index() ) )
    {
      SubLObject keys = NIL;
      SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list( unbound_rule_index() );
      SubLObject ass = NIL;
      ass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != simple_indexing.matches_unbound_rule_index( ass, sense, UNPROVIDED, UNPROVIDED ) && NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( ass ) ) )
        {
          keys = simple_indexing.simple_key_unbound_rule_index( ass, keys, sense, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        ass = cdolist_list_var.first();
      }
      return keys;
    }
    if( NIL == sense )
    {
      SubLObject keys = NIL;
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense_$4 = NIL;
      sense_$4 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( relevant_num_unbound_rule_index( sense_$4 ).isPositive() )
        {
          keys = ConsesLow.cons( sense_$4, keys );
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense_$4 = cdolist_list_var.first();
      }
      return keys;
    }
    return list_utilities.delete_if_not( Symbols.symbol_function( $sym10$RELEVANT_MT_ ), key_unbound_rule_index( sense, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 6463L)
  public static SubLObject add_unbound_rule_index(final SubLObject sense, final SubLObject mt, final SubLObject direction, final SubLObject assertion)
  {
    return kb_indexing.term_add_indexing_leaf( unbound_rule_index(), ConsesLow.list( sense, mt, direction ), assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 6639L)
  public static SubLObject rem_unbound_rule_index(final SubLObject sense, final SubLObject mt, final SubLObject direction, final SubLObject assertion)
  {
    return kb_indexing.term_rem_indexing_leaf( unbound_rule_index(), ConsesLow.list( sense, mt, direction ), assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 6801L)
  public static SubLObject get_unbound_rule_subindex(final SubLObject sense, SubLObject mt, SubLObject direction)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    return kb_indexing.get_subindex( unbound_rule_index(), ConsesLow.list( sense, mt, direction ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 6992L)
  public static SubLObject map_unbound_rule_index(final SubLObject function, final SubLObject sense, SubLObject direction)
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
      thread.throwStack.push( $kw13$MAPPING_DONE );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw14$RULE, NIL, direction );
              SubLObject done_var_$5 = NIL;
              final SubLObject token_var_$6 = NIL;
              while ( NIL == done_var_$5)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( ass ) );
                if( NIL != valid_$7 && NIL != simple_indexing.matches_unbound_rule_index( ass, sense, NIL, direction ) )
                {
                  Functions.funcall( function, ass );
                }
                done_var_$5 = makeBoolean( NIL == valid_$7 );
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
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw13$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 7363L)
  public static SubLObject map_unbound_rule_mt_index(final SubLObject function, final SubLObject sense, final SubLObject mt, SubLObject direction)
  {
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != enumeration_types.sense_p( sense ) : sense;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw13$MAPPING_DONE );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw14$RULE, NIL, direction );
              SubLObject done_var_$8 = NIL;
              final SubLObject token_var_$9 = NIL;
              while ( NIL == done_var_$8)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$9 );
                final SubLObject valid_$10 = makeBoolean( !token_var_$9.eql( ass ) );
                if( NIL != valid_$10 && NIL != simple_indexing.matches_unbound_rule_index( ass, sense, mt, direction ) )
                {
                  Functions.funcall( function, ass );
                }
                done_var_$8 = makeBoolean( NIL == valid_$10 );
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
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw13$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 7752L)
  public static SubLObject unbound_rule_index()
  {
    return $kw4$UNBOUND_RULE_INDEX;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 7826L)
  public static SubLObject add_unbound_rule_indices(final SubLObject assertion)
  {
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject direction = assertions_high.assertion_direction( assertion );
    SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
    SubLObject sense = NIL;
    sense = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != some_unbound_predicate_literal( cnf, sense ) )
      {
        add_unbound_rule_index( sense, mt, direction, assertion );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sense = cdolist_list_var.first();
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 8161L)
  public static SubLObject rem_unbound_rule_indices(final SubLObject assertion)
  {
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject direction = assertions_high.assertion_direction( assertion );
    SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
    SubLObject sense = NIL;
    sense = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != some_unbound_predicate_literal( cnf, sense ) )
      {
        rem_unbound_rule_index( sense, mt, direction, assertion );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sense = cdolist_list_var.first();
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 8496L)
  public static SubLObject unbound_predicate_rule_p(final SubLObject v_object)
  {
    return unbound_rule_assertion_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 8589L)
  public static SubLObject clear_unbound_rule_index()
  {
    clear_auxiliary_index( unbound_rule_index() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 8706L)
  public static SubLObject unbound_rule_assertion_p(final SubLObject assertion)
  {
    if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      final SubLObject cnf = assertions_high.assertion_cnf( assertion );
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense = NIL;
      sense = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != some_unbound_predicate_literal( cnf, sense ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sense = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 8946L)
  public static SubLObject unbound_predicate_literal(final SubLObject literal)
  {
    return makeBoolean( literal.isCons() && NIL != variables.variable_p( el_utilities.literal_predicate( literal, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 9080L)
  public static SubLObject some_unbound_predicate_literal(final SubLObject clause, final SubLObject sense)
  {
    final SubLObject literals = ( sense == $kw16$POS ) ? clauses.pos_lits( clause ) : clauses.neg_lits( clause );
    return list_utilities.sublisp_boolean( Sequences.find_if( Symbols.symbol_function( $sym17$UNBOUND_PREDICATE_LITERAL ), literals, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 9291L)
  public static SubLObject reconstruct_auxiliary_indices()
  {
    reconstruct_unbound_rule_indices();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 9537L)
  public static SubLObject reconstruct_unbound_rule_indices()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_unbound_rule_index();
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str18$Rebuilding_unbound_rule_index_str;
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
        final SubLObject idx_$11 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$11, $kw19$SKIP ) )
        {
          final SubLObject idx_$12 = idx_$11;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$12, $kw19$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$12 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject assertion;
            SubLObject _prev_bind_0_$13;
            SubLObject _prev_bind_1_$14;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw19$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw19$SKIP;
                }
                assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != unbound_rule_assertion_p( assertion ) )
                {
                  _prev_bind_0_$13 = simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.currentBinding( thread );
                  _prev_bind_1_$14 = simple_indexing.$terms_to_toggle_indexing_mode$.currentBinding( thread );
                  try
                  {
                    simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.bind( T, thread );
                    simple_indexing.$terms_to_toggle_indexing_mode$.bind( NIL, thread );
                    add_unbound_rule_indices( assertion );
                    if( NIL != simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue( thread ) )
                    {
                      simple_indexing.noting_terms_to_toggle_indexing_mode_internal();
                    }
                  }
                  finally
                  {
                    simple_indexing.$terms_to_toggle_indexing_mode$.rebind( _prev_bind_1_$14, thread );
                    simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.rebind( _prev_bind_0_$13, thread );
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$13 = idx_$11;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$13 ) || NIL == id_index.id_index_skip_tombstones_p( $kw19$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$13 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$13 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$13 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw19$SKIP ) ) ? NIL : $kw19$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw19$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != unbound_rule_assertion_p( assertion2 ) )
                {
                  final SubLObject _prev_bind_0_$14 = simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$15 = simple_indexing.$terms_to_toggle_indexing_mode$.currentBinding( thread );
                  try
                  {
                    simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.bind( T, thread );
                    simple_indexing.$terms_to_toggle_indexing_mode$.bind( NIL, thread );
                    add_unbound_rule_indices( assertion2 );
                    if( NIL != simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue( thread ) )
                    {
                      simple_indexing.noting_terms_to_toggle_indexing_mode_internal();
                    }
                  }
                  finally
                  {
                    simple_indexing.$terms_to_toggle_indexing_mode$.rebind( _prev_bind_1_$15, thread );
                    simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.rebind( _prev_bind_0_$14, thread );
                  }
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
        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
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
    return num_unbound_rule_index( UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 10045L)
  public static SubLObject dump_auxiliary_indices(final SubLObject stream)
  {
    dump_unbound_rule_index( stream );
    cfasl.cfasl_output( NIL, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 10337L)
  public static SubLObject load_auxiliary_indices(final SubLObject stream)
  {
    load_unbound_rule_index( stream );
    cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 10622L)
  public static SubLObject dump_unbound_rule_index(final SubLObject stream)
  {
    cfasl.cfasl_output( get_auxiliary_index( unbound_rule_index() ), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 10764L)
  public static SubLObject load_unbound_rule_index(final SubLObject stream)
  {
    reset_auxiliary_index( unbound_rule_index(), cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  public static SubLObject declare_auxiliary_indexing_file()
  {
    SubLFiles.declareFunction( me, "auxiliary_indices", "AUXILIARY-INDICES", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_auxiliary_index", "DECLARE-AUXILIARY-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "auxiliary_index_p", "AUXILIARY-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_auxiliary_index", "GET-AUXILIARY-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "auxiliary_index_swapped_inP", "AUXILIARY-INDEX-SWAPPED-IN?", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_auxiliary_index", "RESET-AUXILIARY-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_auxiliary_index", "CLEAR-AUXILIARY-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "auxiliary_index_name", "AUXILIARY-INDEX-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "num_unbound_rule_index", "NUM-UNBOUND-RULE-INDEX", 0, 3, false );
    SubLFiles.declareFunction( me, "relevant_num_unbound_rule_index", "RELEVANT-NUM-UNBOUND-RULE-INDEX", 0, 1, false );
    SubLFiles.declareFunction( me, "key_unbound_rule_index", "KEY-UNBOUND-RULE-INDEX", 0, 2, false );
    SubLFiles.declareFunction( me, "relevant_key_unbound_rule_index", "RELEVANT-KEY-UNBOUND-RULE-INDEX", 0, 1, false );
    SubLFiles.declareFunction( me, "add_unbound_rule_index", "ADD-UNBOUND-RULE-INDEX", 4, 0, false );
    SubLFiles.declareFunction( me, "rem_unbound_rule_index", "REM-UNBOUND-RULE-INDEX", 4, 0, false );
    SubLFiles.declareFunction( me, "get_unbound_rule_subindex", "GET-UNBOUND-RULE-SUBINDEX", 1, 2, false );
    SubLFiles.declareFunction( me, "map_unbound_rule_index", "MAP-UNBOUND-RULE-INDEX", 2, 1, false );
    SubLFiles.declareFunction( me, "map_unbound_rule_mt_index", "MAP-UNBOUND-RULE-MT-INDEX", 3, 1, false );
    SubLFiles.declareFunction( me, "unbound_rule_index", "UNBOUND-RULE-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "add_unbound_rule_indices", "ADD-UNBOUND-RULE-INDICES", 1, 0, false );
    SubLFiles.declareFunction( me, "rem_unbound_rule_indices", "REM-UNBOUND-RULE-INDICES", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_rule_p", "UNBOUND-PREDICATE-RULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_unbound_rule_index", "CLEAR-UNBOUND-RULE-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "unbound_rule_assertion_p", "UNBOUND-RULE-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "unbound_predicate_literal", "UNBOUND-PREDICATE-LITERAL", 1, 0, false );
    SubLFiles.declareFunction( me, "some_unbound_predicate_literal", "SOME-UNBOUND-PREDICATE-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "reconstruct_auxiliary_indices", "RECONSTRUCT-AUXILIARY-INDICES", 0, 0, false );
    SubLFiles.declareFunction( me, "reconstruct_unbound_rule_indices", "RECONSTRUCT-UNBOUND-RULE-INDICES", 0, 0, false );
    SubLFiles.declareFunction( me, "dump_auxiliary_indices", "DUMP-AUXILIARY-INDICES", 1, 0, false );
    SubLFiles.declareFunction( me, "load_auxiliary_indices", "LOAD-AUXILIARY-INDICES", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_unbound_rule_index", "DUMP-UNBOUND-RULE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "load_unbound_rule_index", "LOAD-UNBOUND-RULE-INDEX", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_auxiliary_indexing_file()
  {
    $auxiliary_indices$ = SubLFiles.defparameter( "*AUXILIARY-INDICES*", NIL );
    return NIL;
  }

  public static SubLObject setup_auxiliary_indexing_file()
  {
    declare_auxiliary_index( $kw4$UNBOUND_RULE_INDEX, $str5$Unbound_Rule_Index );
    kb_indexing_declarations.declare_index( $kw6$UNBOUND_RULE_INDEX_POS, $list7 );
    kb_indexing_declarations.declare_index( $kw8$UNBOUND_RULE_INDEX_NEG, $list9 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_auxiliary_indexing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_auxiliary_indexing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_auxiliary_indexing_file();
  }
  static
  {
    me = new auxiliary_indexing();
    $auxiliary_indices$ = null;
    $sym0$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym1$STRINGP = makeSymbol( "STRINGP" );
    $kw2$INDEX_NAME = makeKeyword( "INDEX-NAME" );
    $kw3$INDEX = makeKeyword( "INDEX" );
    $kw4$UNBOUND_RULE_INDEX = makeKeyword( "UNBOUND-RULE-INDEX" );
    $str5$Unbound_Rule_Index = makeString( "Unbound Rule Index" );
    $kw6$UNBOUND_RULE_INDEX_POS = makeKeyword( "UNBOUND-RULE-INDEX-POS" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Unbound positive rule index" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "term" ), makeKeyword(
        "VALIDITY-TEST" ), makeSymbol( "AUXILIARY-INDEX-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "POS" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "NAME" ), makeString( "sense" ),
            makeKeyword( "VALIDITY-TEST" ), makeSymbol( "SENSE-P" ), makeKeyword( "EQUAL-TEST" ), EQ ), ConsesLow.list( new SubLObject[]
            { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
                "EQUAL-TEST" ), EQUAL
        } ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list(
            makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "A rule assertion in mt MT with direction DIRECTION,\nwhich contains a pos-lit with a variable in the predicate position." ) )
    } );
    $kw8$UNBOUND_RULE_INDEX_NEG = makeKeyword( "UNBOUND-RULE-INDEX-NEG" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeString( "Unbound negative rule index" ), makeKeyword( "DOMAIN" ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "term" ), makeKeyword(
        "VALIDITY-TEST" ), makeSymbol( "AUXILIARY-INDEX-P" ) ), makeKeyword( "TOP-LEVEL-KEY" ), makeKeyword( "NEG" ), makeKeyword( "KEYS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "NAME" ), makeString( "sense" ),
            makeKeyword( "VALIDITY-TEST" ), makeSymbol( "SENSE-P" ), makeKeyword( "EQUAL-TEST" ), EQ ), ConsesLow.list( new SubLObject[]
            { makeKeyword( "NAME" ), makeString( "mt" ), makeKeyword( "MT?" ), T, makeKeyword( "VALIDITY-TEST" ), makeSymbol( "HLMT-P" ), makeKeyword( "RELEVANCE-TEST" ), makeSymbol( "RELEVANT-MT?" ), makeKeyword(
                "EQUAL-TEST" ), EQUAL
        } ), ConsesLow.list( makeKeyword( "NAME" ), makeString( "direction" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "DIRECTION-P" ), makeKeyword( "EQUAL-TEST" ), EQ ) ), makeKeyword( "RANGE" ), ConsesLow.list(
            makeKeyword( "NAME" ), makeString( "rule" ), makeKeyword( "VALIDITY-TEST" ), makeSymbol( "RULE-ASSERTION?" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "A rule assertion in mt MT with direction DIRECTION,\nwhich contains a neg-lit with a variable in the predicate position." ) )
    } );
    $sym10$RELEVANT_MT_ = makeSymbol( "RELEVANT-MT?" );
    $sym11$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym12$SENSE_P = makeSymbol( "SENSE-P" );
    $kw13$MAPPING_DONE = makeKeyword( "MAPPING-DONE" );
    $kw14$RULE = makeKeyword( "RULE" );
    $sym15$HLMT_P = makeSymbol( "HLMT-P" );
    $kw16$POS = makeKeyword( "POS" );
    $sym17$UNBOUND_PREDICATE_LITERAL = makeSymbol( "UNBOUND-PREDICATE-LITERAL" );
    $str18$Rebuilding_unbound_rule_index_str = makeString( "Rebuilding unbound rule index structure" );
    $kw19$SKIP = makeKeyword( "SKIP" );
  }
}
/*
 * 
 * Total time: 350 ms
 * 
 */