package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_concatenate_strings
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_concatenate_strings";
  public static final String myFingerPrint = "51ee9128ac3ff1a799865d1f3aced9205608557bc7b9114b8f3878eee9c3e7ad";
  private static final SubLObject $const0$concatenateStrings;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLSymbol $kw3$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$REMOVAL_CONCATENATE_STRINGS_BOUND_ARGS_SUPPORTED_P;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$OPAQUE;
  private static final SubLSymbol $sym8$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS;
  private static final SubLSymbol $kw9$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG;
  private static final SubLSymbol $kw12$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$REMOVAL_CONCATENATE_STRINGS_PERMUTE_COST;
  private static final SubLSymbol $sym15$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS_OUTPUT_GENERATE;
  private static final SubLSymbol $sym16$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_DONE;
  private static final SubLSymbol $sym17$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_NEXT;
  private static final SubLSymbol $sym18$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_FINALIZE;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$UNICODE_NAUT_P;
  private static final SubLSymbol $sym21$NAT_ARG1;
  private static final SubLList $list22;
  private static final SubLString $str23$;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 2080L)
  public static SubLObject removal_concatenate_strings_bound_args_supported_p(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject badP = NIL;
    if( NIL == badP )
    {
      SubLObject csome_list_var = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
      SubLObject arg = NIL;
      arg = csome_list_var.first();
      while ( NIL == badP && NIL != csome_list_var)
      {
        if( NIL == removal_concatenate_strings_arg_supported_p( arg ) )
        {
          badP = T;
        }
        csome_list_var = csome_list_var.rest();
        arg = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == badP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 2376L)
  public static SubLObject removal_concatenate_strings_arg_supported_p(final SubLObject arg)
  {
    return makeBoolean( NIL == variables.fully_bound_p( arg ) || NIL != cycl_string.cycl_string_p( arg ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 2503L)
  public static SubLObject removal_concatenate_strings_concatenate_arg1_pos(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( asent, UNPROVIDED );
    SubLObject arg1 = NIL;
    SubLObject strings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    arg1 = current.first();
    current = ( strings = current.rest() );
    final SubLObject big_string = evaluation_defns.cyc_concatenate_strings( strings );
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification_utilities.term_unify( big_string, arg1, T, T );
    final SubLObject unify_justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_bindings )
    {
      final SubLObject bound_arg1 = bindings.subst_bindings( v_bindings, arg1 );
      final SubLObject unified_asent = el_utilities.replace_formula_arg( ONE_INTEGER, bound_arg1, asent );
      return backward.removal_add_node( arguments.make_hl_support( $kw7$OPAQUE, unified_asent, UNPROVIDED, UNPROVIDED ), v_bindings, unify_justification );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 3753L)
  public static SubLObject removal_concatenate_strings_concatenate_neg(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( asent, UNPROVIDED );
    SubLObject arg1 = NIL;
    SubLObject strings = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    arg1 = current.first();
    current = ( strings = current.rest() );
    final SubLObject big_string = evaluation_defns.cyc_concatenate_strings( strings );
    if( NIL == Strings.string_equal( big_string, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return backward.removal_add_node( arguments.make_hl_support( $kw7$OPAQUE, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 4750L)
  public static SubLObject removal_concatenate_strings_permute_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject big_string = preprocess_stringy_args( asent );
    final SubLObject stringy_items = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( big_string.isString() )
    {
      SubLObject result = ONE_INTEGER;
      SubLObject number_of_strings_so_far = ZERO_INTEGER;
      SubLObject cdolist_list_var = stringy_items;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( item.isString() )
        {
          number_of_strings_so_far = Numbers.add( number_of_strings_so_far, ONE_INTEGER );
          final SubLObject string = item;
          final SubLObject count = string_utilities.count_matches( string, big_string, UNPROVIDED, UNPROVIDED );
          final SubLObject adjusted_count = Numbers.divide( count, number_of_strings_so_far );
          result = Numbers.multiply( result, adjusted_count );
        }
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 5563L)
  public static SubLObject removal_concatenate_strings_permute_pos_output_generate(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject big_string_is_unicodeP = unicode_nauts.unicode_naut_p( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ), UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject stringy_big_string = preprocess_stringy_args( asent );
    final SubLObject stringy_items = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( !stringy_big_string.isString() )
    {
      return iteration.new_null_iterator();
    }
    if( NIL != list_utilities.singletonP( stringy_items ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( stringy_items.first(), stringy_big_string, UNPROVIDED, UNPROVIDED );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return iteration.new_singleton_iterator( bindings.subst_bindings( v_bindings, asent ) );
    }
    thread.resetMultipleValues();
    final SubLObject permutation_iterator = generate_concatenate_strings_permutation_iterator( stringy_big_string, stringy_items );
    final SubLObject strings_list = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return new_concatenate_strings_permute_pos_iterator( stringy_big_string, stringy_items, strings_list, permutation_iterator, asent, big_string_is_unicodeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 6514L)
  public static SubLObject new_concatenate_strings_permute_pos_iterator(final SubLObject big_string, final SubLObject stringy_items, final SubLObject strings_list, final SubLObject permutations_iterator,
      final SubLObject asent, final SubLObject big_string_is_unicodeP)
  {
    return iteration.new_iterator( concatenate_strings_permute_pos_iterator_state( big_string, stringy_items, strings_list, permutations_iterator, asent, big_string_is_unicodeP ),
        $sym16$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_DONE, $sym17$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_NEXT, $sym18$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 6995L)
  public static SubLObject concatenate_strings_permute_pos_iterator_state(final SubLObject big_string, final SubLObject stringy_items, final SubLObject strings_list, final SubLObject permutations_iterator,
      final SubLObject asent, final SubLObject big_string_is_unicodeP)
  {
    return ConsesLow.list( big_string, stringy_items, strings_list, permutations_iterator, asent, big_string_is_unicodeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 7255L)
  public static SubLObject concatenate_strings_permute_pos_iterator_done(final SubLObject state)
  {
    SubLObject big_string = NIL;
    SubLObject stringy_items = NIL;
    SubLObject strings_list = NIL;
    SubLObject permutations_iterator = NIL;
    SubLObject asent = NIL;
    SubLObject big_string_is_unicodeP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list19 );
    big_string = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    stringy_items = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    strings_list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    permutations_iterator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    asent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    big_string_is_unicodeP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return iteration.iteration_done( permutations_iterator );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list19 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 7579L)
  public static SubLObject concatenate_strings_permute_pos_iterator_next(final SubLObject state)
  {
    SubLObject big_string = NIL;
    SubLObject stringy_items = NIL;
    SubLObject strings_list = NIL;
    SubLObject permutations_iterator = NIL;
    SubLObject asent = NIL;
    SubLObject big_string_is_unicodeP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list19 );
    big_string = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    stringy_items = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    strings_list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    permutations_iterator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    asent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    big_string_is_unicodeP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject result = NIL;
      SubLObject premature_endP = NIL;
      while ( NIL == result && NIL == premature_endP)
      {
        if( NIL != iteration.iteration_done( permutations_iterator ) )
        {
          premature_endP = T;
        }
        else
        {
          final SubLObject permutation = iteration.iteration_next( permutations_iterator );
          if( NIL == permutation_ordered_consistentlyP( permutation, strings_list ) )
          {
            continue;
          }
          final SubLObject v_bindings = concatenate_strings_permute_pos_iterator_next_int( big_string, stringy_items, permutation, big_string_is_unicodeP );
          if( NIL == v_bindings )
          {
            continue;
          }
          result = bindings.subst_bindings( v_bindings, asent );
        }
      }
      return Values.values( result, state, premature_endP );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list19 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 8341L)
  public static SubLObject concatenate_strings_permute_pos_iterator_finalize(final SubLObject state)
  {
    SubLObject big_string = NIL;
    SubLObject stringy_items = NIL;
    SubLObject strings_list = NIL;
    SubLObject permutations_iterator = NIL;
    SubLObject asent = NIL;
    SubLObject big_string_is_unicodeP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list19 );
    big_string = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    stringy_items = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    strings_list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    permutations_iterator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    asent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list19 );
    big_string_is_unicodeP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return iteration.iteration_finalize( permutations_iterator );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list19 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 8673L)
  public static SubLObject preprocess_stringy_args(final SubLObject asent)
  {
    final SubLObject args = cycl_utilities.formula_args( asent, UNPROVIDED );
    final SubLObject stringy_args = transform_list_utilities.transform( args, $sym20$UNICODE_NAUT_P, $sym21$NAT_ARG1, UNPROVIDED );
    SubLObject current;
    final SubLObject datum = current = stringy_args;
    SubLObject big_string = NIL;
    SubLObject stringy_items = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
    big_string = current.first();
    current = ( stringy_items = current.rest() );
    stringy_items = string_utilities.concatenate_adjacent_strings( stringy_items );
    stringy_items = insert_empty_strings_between_adjacent_variables( stringy_items );
    return Values.values( big_string, stringy_items );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 9214L)
  public static SubLObject generate_concatenate_strings_permutation_iterator(final SubLObject big_string, final SubLObject stringy_items)
  {
    SubLObject positions_iterators = NIL;
    SubLObject strings_list = NIL;
    if( stringy_items.first().isString() && NIL == string_utilities.starts_with( big_string, stringy_items.first() ) )
    {
      return Values.values( iteration.new_null_iterator(), NIL );
    }
    SubLObject cdolist_list_var = stringy_items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( item.isString() )
      {
        final SubLObject string = item;
        final SubLObject positions = string_utilities.search_all( string, big_string, UNPROVIDED, UNPROVIDED );
        if( NIL == positions )
        {
          return Values.values( iteration.new_null_iterator(), NIL );
        }
        positions_iterators = ConsesLow.cons( iteration.new_reusable_list_iterator( positions ), positions_iterators );
        strings_list = ConsesLow.cons( item, strings_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    positions_iterators = Sequences.nreverse( positions_iterators );
    strings_list = Sequences.nreverse( strings_list );
    final SubLObject permutation_iterator = iteration.new_reusable_iterator_cartesian_iterator( positions_iterators );
    return Values.values( permutation_iterator, strings_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 10095L)
  public static SubLObject permutation_ordered_consistentlyP(final SubLObject permutation, final SubLObject strings)
  {
    SubLObject previous_position = permutation.first();
    SubLObject previous_string = strings.first();
    SubLObject inconsistentP = NIL;
    SubLObject position = NIL;
    SubLObject position_$1 = NIL;
    SubLObject string = NIL;
    SubLObject string_$2 = NIL;
    position = permutation.rest();
    position_$1 = position.first();
    string = strings.rest();
    string_$2 = string.first();
    while ( NIL != string || NIL != position)
    {
      if( !position_$1.numGE( Numbers.add( previous_position, Sequences.length( previous_string ) ) ) )
      {
        inconsistentP = T;
      }
      previous_position = position_$1;
      previous_string = string_$2;
      position = position.rest();
      position_$1 = position.first();
      string = string.rest();
      string_$2 = string.first();
    }
    return makeBoolean( NIL == inconsistentP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 10569L)
  public static SubLObject concatenate_strings_permute_pos_iterator_next_int(final SubLObject big_string, final SubLObject stringy_items, final SubLObject permutation, final SubLObject big_string_is_unicodeP)
  {
    SubLObject rest_of_permutation = permutation;
    SubLObject next_permutation_element = rest_of_permutation.first();
    SubLObject start = ZERO_INTEGER;
    SubLObject end = next_permutation_element;
    SubLObject v_bindings = NIL;
    SubLObject cdolist_list_var = stringy_items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( item.isString() )
      {
        start = Numbers.add( start, Sequences.length( item ) );
        rest_of_permutation = rest_of_permutation.rest();
        next_permutation_element = rest_of_permutation.first();
        end = ( NIL != next_permutation_element ) ? next_permutation_element : NIL;
      }
      else
      {
        v_bindings = ConsesLow.append( v_bindings, removal_concatenate_strings_partial_bindings( big_string, item, start, end, big_string_is_unicodeP ) );
        start = end;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return ( NIL != v_bindings ) ? ( ( !start.isInteger() || NIL != list_utilities.lengthE( big_string, start, UNPROVIDED ) ) ? v_bindings : NIL ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 11552L)
  public static SubLObject removal_concatenate_strings_partial_bindings(final SubLObject big_string, final SubLObject var, SubLObject start, SubLObject end, final SubLObject big_string_is_unicodeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( end.isInteger() && end.numG( Sequences.length( big_string ) ) )
    {
      end = NIL;
    }
    if( start.isInteger() && end.isInteger() && start.numG( end ) )
    {
      start = end;
    }
    final SubLObject substring = string_utilities.substring( big_string, start, end );
    final SubLObject substring_to_use = ( NIL != big_string_is_unicodeP ) ? unicode_nauts.display_vector_string_to_cycl_safe_string( substring ) : substring;
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification_utilities.term_unify( var, substring_to_use, UNPROVIDED, UNPROVIDED );
    final SubLObject unify_justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-concatenate-strings.lisp", position = 12157L)
  public static SubLObject insert_empty_strings_between_adjacent_variables(final SubLObject items)
  {
    SubLObject new_items = NIL;
    SubLObject last_item_was_a_variableP = NIL;
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != variables.not_fully_bound_p( item ) )
      {
        if( NIL != last_item_was_a_variableP )
        {
          new_items = ConsesLow.cons( $str23$, new_items );
          new_items = ConsesLow.cons( item, new_items );
        }
        else
        {
          new_items = ConsesLow.cons( item, new_items );
        }
        last_item_was_a_variableP = T;
      }
      else
      {
        new_items = ConsesLow.cons( item, new_items );
        last_item_was_a_variableP = NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_items );
  }

  public static SubLObject declare_removal_modules_concatenate_strings_file()
  {
    SubLFiles.declareFunction( me, "removal_concatenate_strings_bound_args_supported_p", "REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_concatenate_strings_arg_supported_p", "REMOVAL-CONCATENATE-STRINGS-ARG-SUPPORTED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_concatenate_strings_concatenate_arg1_pos", "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_concatenate_strings_concatenate_neg", "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_concatenate_strings_permute_cost", "REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_concatenate_strings_permute_pos_output_generate", "REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE", 1, 1, false );
    SubLFiles.declareFunction( me, "new_concatenate_strings_permute_pos_iterator", "NEW-CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR", 6, 0, false );
    SubLFiles.declareFunction( me, "concatenate_strings_permute_pos_iterator_state", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-STATE", 6, 0, false );
    SubLFiles.declareFunction( me, "concatenate_strings_permute_pos_iterator_done", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "concatenate_strings_permute_pos_iterator_next", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "concatenate_strings_permute_pos_iterator_finalize", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "preprocess_stringy_args", "PREPROCESS-STRINGY-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_concatenate_strings_permutation_iterator", "GENERATE-CONCATENATE-STRINGS-PERMUTATION-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "permutation_ordered_consistentlyP", "PERMUTATION-ORDERED-CONSISTENTLY?", 2, 0, false );
    SubLFiles.declareFunction( me, "concatenate_strings_permute_pos_iterator_next_int", "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "removal_concatenate_strings_partial_bindings", "REMOVAL-CONCATENATE-STRINGS-PARTIAL-BINDINGS", 5, 0, false );
    SubLFiles.declareFunction( me, "insert_empty_strings_between_adjacent_variables", "INSERT-EMPTY-STRINGS-BETWEEN-ADJACENT-VARIABLES", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_concatenate_strings_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_concatenate_strings_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$concatenateStrings );
    preference_modules.doomed_unless_either_arg_bindable( $kw1$POS, $const0$concatenateStrings );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$concatenateStrings );
    inference_modules.inference_removal_module( $kw3$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS, $list4 );
    utilities_macros.note_funcall_helper_function( $sym5$REMOVAL_CONCATENATE_STRINGS_BOUND_ARGS_SUPPORTED_P );
    utilities_macros.note_funcall_helper_function( $sym8$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS );
    inference_modules.inference_removal_module( $kw9$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG, $list10 );
    utilities_macros.note_funcall_helper_function( $sym11$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG );
    inference_modules.inference_removal_module( $kw12$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS, $list13 );
    utilities_macros.note_funcall_helper_function( $sym14$REMOVAL_CONCATENATE_STRINGS_PERMUTE_COST );
    utilities_macros.note_funcall_helper_function( $sym15$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS_OUTPUT_GENERATE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_concatenate_strings_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_concatenate_strings_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_concatenate_strings_file();
  }
  static
  {
    me = new removal_modules_concatenate_strings();
    $const0$concatenateStrings = constant_handles.reader_make_constant_shell( makeString( "concatenateStrings" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $kw3$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS = makeKeyword( "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS" );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "concatenateStrings" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "concatenateStrings" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ),
      makeSymbol( "REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P" ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS" ), makeKeyword( "SUPPORT-MT" ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$concatenateStrings :not-fully-bound . :fully-bound)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$concatenateStrings ?X \"foo\" \"bar\")\nwill bind ?X to \"foobar\"" )
    } );
    $sym5$REMOVAL_CONCATENATE_STRINGS_BOUND_ARGS_SUPPORTED_P = makeSymbol( "REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P" );
    $list6 = ConsesLow.cons( makeSymbol( "ARG1" ), makeSymbol( "STRINGS" ) );
    $kw7$OPAQUE = makeKeyword( "OPAQUE" );
    $sym8$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_ARG1_POS = makeSymbol( "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-ARG1-POS" );
    $kw9$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG = makeKeyword( "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "concatenateStrings" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "concatenateStrings" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ),
      makeSymbol( "REMOVAL-CONCATENATE-STRINGS-BOUND-ARGS-SUPPORTED-P" ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG" ), makeKeyword( "SUPPORT-MT" ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$not (#$concatenateStrings :fully-bound . :fully-bound))" ), makeKeyword( "EXAMPLE" ), makeString(
                  "(#$not (#$concatenateStrings \"something unrelated\" \"foo\" \"bar\"))\nwill be provable\n    (#$not (#$concatenateStrings \"foobar\" \"foo\" \"bar\"))\nwill fail to be provable" )
    } );
    $sym11$REMOVAL_CONCATENATE_STRINGS_CONCATENATE_NEG = makeSymbol( "REMOVAL-CONCATENATE-STRINGS-CONCATENATE-NEG" );
    $kw12$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS = makeKeyword( "REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "concatenateStrings" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "concatenateStrings" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), constant_handles
              .reader_make_constant_shell( makeString( "BaseKB" ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$concatenateStrings :fully-bound . :not-fully-bound)" ), makeKeyword( "EXAMPLE" ), makeString(
                  "(#$concatenateStrings \"foobar\" ?X \"o\" ?Z)\nwill bind ?X ?Z to both \"fo\" \"bar\"\nand \"f\" \"obar\"." )
    } );
    $sym14$REMOVAL_CONCATENATE_STRINGS_PERMUTE_COST = makeSymbol( "REMOVAL-CONCATENATE-STRINGS-PERMUTE-COST" );
    $sym15$REMOVAL_CONCATENATE_STRINGS_PERMUTE_POS_OUTPUT_GENERATE = makeSymbol( "REMOVAL-CONCATENATE-STRINGS-PERMUTE-POS-OUTPUT-GENERATE" );
    $sym16$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_DONE = makeSymbol( "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-DONE" );
    $sym17$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_NEXT = makeSymbol( "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-NEXT" );
    $sym18$CONCATENATE_STRINGS_PERMUTE_POS_ITERATOR_FINALIZE = makeSymbol( "CONCATENATE-STRINGS-PERMUTE-POS-ITERATOR-FINALIZE" );
    $list19 = ConsesLow.list( makeSymbol( "BIG-STRING" ), makeSymbol( "STRINGY-ITEMS" ), makeSymbol( "STRINGS-LIST" ), makeSymbol( "PERMUTATIONS-ITERATOR" ), makeSymbol( "ASENT" ), makeSymbol(
        "BIG-STRING-IS-UNICODE?" ) );
    $sym20$UNICODE_NAUT_P = makeSymbol( "UNICODE-NAUT-P" );
    $sym21$NAT_ARG1 = makeSymbol( "NAT-ARG1" );
    $list22 = ConsesLow.cons( makeSymbol( "BIG-STRING" ), makeSymbol( "STRINGY-ITEMS" ) );
    $str23$ = makeString( "" );
  }
}
/*
 * 
 * Total time: 76 ms
 * 
 */