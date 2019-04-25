package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_quantification;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_nth_largest_element
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_nth_largest_element";
  public static final String myFingerPrint = "4e0ed3816b2fc8e5c8ade5a044d7b97fd9d8c8fed14c26c67abd82cbe4621fea";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 4636L)
  private static SubLSymbol $default_removal_nth_extremal_n_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 18400L)
  private static SubLSymbol $default_the_set_of_cardinality_estimate$;
  private static final SubLSymbol $sym0$CYC_GREATER_THAN;
  private static final SubLSymbol $sym1$CYC_LESS_THAN;
  private static final SubLObject $const2$nthLargestElement;
  private static final SubLSymbol $kw3$POS;
  private static final SubLObject $const4$nthSmallestElement;
  private static final SubLSymbol $kw5$REMOVAL_NTH_LARGEST_N_COLLECTION;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$REMOVAL_NTH_SMALLEST_N_COLLECTION;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$HL;
  private static final SubLSymbol $sym10$CDR;
  private static final SubLSymbol $sym11$CAR;
  private static final SubLSymbol $kw12$REMOVAL_NTH_LARGEST_N_THE_SET;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$REMOVAL_NTH_SMALLEST_N_THE_SET;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$REMOVAL_NTH_LARGEST_N_THE_SET_OF;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$REMOVAL_NTH_SMALLEST_N_THE_SET_OF;
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$REMOVAL_NTH_LARGEST_ITERATE_COLLECTION;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$REMOVAL_NTH_SMALLEST_ITERATE_COLLECTION;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $kw25$OPAQUE;
  private static final SubLSymbol $kw26$REMOVAL_NTH_LARGEST_ITERATE_THE_SET;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET;
  private static final SubLList $list29;
  private static final SubLInteger $int30$100;
  private static final SubLSymbol $kw31$REMOVAL_NTH_LARGEST_ITERATE_THE_SET_OF;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET_OF;
  private static final SubLList $list34;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 716L)
  public static SubLObject cyc_quantity_decreasing_sort(final SubLObject sequence, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    return relation_evaluation.cyc_evaluate_sort( sequence, Symbols.symbol_function( $sym0$CYC_GREATER_THAN ), key, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 922L)
  public static SubLObject cyc_quantity_increasing_sort(final SubLObject sequence, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    return relation_evaluation.cyc_evaluate_sort( sequence, Symbols.symbol_function( $sym1$CYC_LESS_THAN ), key, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 1436L)
  public static SubLObject removal_nth_largest_n_collection_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_n_required( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 1697L)
  public static SubLObject removal_nth_largest_n_collection_output_generate(final SubLObject rank, final SubLObject collection, final SubLObject function)
  {
    return removal_nth_extremal_n_output_generate( $const2$nthLargestElement, rank, collection, function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 2963L)
  public static SubLObject removal_nth_smallest_n_collection_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_n_required( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 3228L)
  public static SubLObject removal_nth_smallest_n_collection_output_generate(final SubLObject rank, final SubLObject collection, final SubLObject function)
  {
    return removal_nth_extremal_n_output_generate( $const4$nthSmallestElement, rank, collection, function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 4499L)
  public static SubLObject removal_nth_extremal_n_required(final SubLObject asent)
  {
    return subl_promotions.positive_integer_p( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 4708L)
  public static SubLObject removal_nth_extremal_n_output_generate(final SubLObject predicate, final SubLObject rank, final SubLObject v_set, final SubLObject function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject elements = quantities.evaluate_set_elements( v_set, $kw9$HL );
    SubLObject items = NIL;
    thread.resetMultipleValues();
    SubLObject evaluation_pairs = numeric_quantification.numeric_evaluate_all_unary( function, elements );
    final SubLObject valid = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != valid )
    {
      if( predicate.eql( $const2$nthLargestElement ) )
      {
        evaluation_pairs = cyc_quantity_decreasing_sort( evaluation_pairs, Symbols.symbol_function( $sym10$CDR ) );
      }
      else if( predicate.eql( $const4$nthSmallestElement ) )
      {
        evaluation_pairs = cyc_quantity_increasing_sort( evaluation_pairs, Symbols.symbol_function( $sym10$CDR ) );
      }
      final SubLObject nth_item_pairs = list_utilities.nth_rank_items( rank, evaluation_pairs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym10$CDR ) );
      items = Mapping.mapcar( Symbols.symbol_function( $sym11$CAR ), nth_item_pairs );
    }
    return iteration.new_list_iterator( items );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 5465L)
  public static SubLObject removal_nth_largest_n_the_set_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_n_required( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 5799L)
  public static SubLObject removal_nth_largest_n_the_set_output_generate(final SubLObject rank, final SubLObject v_set, final SubLObject function)
  {
    return removal_nth_extremal_n_output_generate( $const2$nthLargestElement, rank, v_set, function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 7007L)
  public static SubLObject removal_nth_smallest_n_the_set_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_n_required( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 7345L)
  public static SubLObject removal_nth_smallest_n_the_set_output_generate(final SubLObject rank, final SubLObject v_set, final SubLObject function)
  {
    return removal_nth_extremal_n_output_generate( $const4$nthSmallestElement, rank, v_set, function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 8565L)
  public static SubLObject removal_nth_largest_n_the_set_of_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_n_required( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 8916L)
  public static SubLObject removal_nth_largest_n_the_set_of_output_generate(final SubLObject rank, final SubLObject v_set, final SubLObject function)
  {
    return removal_nth_extremal_n_output_generate( $const2$nthLargestElement, rank, v_set, function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 10213L)
  public static SubLObject removal_nth_smallest_n_the_set_of_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_n_required( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 10569L)
  public static SubLObject removal_nth_smallest_n_the_set_of_output_generate(final SubLObject rank, final SubLObject v_set, final SubLObject function)
  {
    return removal_nth_extremal_n_output_generate( $const4$nthSmallestElement, rank, v_set, function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 11876L)
  public static SubLObject removal_nth_largest_iterate_collection_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return cardinality_estimates.instance_cardinality( cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 12261L)
  public static SubLObject removal_nth_largest_iterate_collection_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_iterate_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 13028L)
  public static SubLObject removal_nth_smallest_iterate_collection_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return cardinality_estimates.instance_cardinality( cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 13417L)
  public static SubLObject removal_nth_smallest_iterate_collection_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_iterate_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 14175L)
  public static SubLObject removal_nth_extremal_iterate_expand(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject v_object = NIL;
    SubLObject rank = NIL;
    SubLObject v_set = NIL;
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    rank = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    v_set = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    function = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject elements = quantities.evaluate_set_elements( v_set, $kw9$HL );
      thread.resetMultipleValues();
      SubLObject evaluation_pairs = numeric_quantification.numeric_evaluate_all_unary( function, elements );
      final SubLObject valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        final SubLObject pcase_var = predicate;
        if( pcase_var.eql( $const2$nthLargestElement ) )
        {
          evaluation_pairs = cyc_quantity_decreasing_sort( evaluation_pairs, Symbols.symbol_function( $sym10$CDR ) );
        }
        else if( pcase_var.eql( $const4$nthSmallestElement ) )
        {
          evaluation_pairs = cyc_quantity_increasing_sort( evaluation_pairs, Symbols.symbol_function( $sym10$CDR ) );
        }
        SubLObject cdolist_list_var;
        evaluation_pairs = ( cdolist_list_var = removal_nth_extremal_convert_to_rankings( evaluation_pairs ) );
        SubLObject nth_item_pair = NIL;
        nth_item_pair = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject v_bindings = unification_utilities.term_unify( ConsesLow.cons( v_object, rank ), nth_item_pair, T, T );
          final SubLObject unify_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != v_bindings )
          {
            final SubLObject subst_rank = bindings.subst_bindings( v_bindings, rank );
            final SubLObject subst_object = bindings.subst_bindings( v_bindings, v_object );
            final SubLObject hl_formula = ConsesLow.list( predicate, subst_object, subst_rank, v_set, function );
            final SubLObject hl_support = arguments.make_hl_support( $kw25$OPAQUE, hl_formula, UNPROVIDED, UNPROVIDED );
            backward.removal_add_node( hl_support, v_bindings, unify_justification );
          }
          cdolist_list_var = cdolist_list_var.rest();
          nth_item_pair = cdolist_list_var.first();
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 15552L)
  public static SubLObject removal_nth_extremal_convert_to_rankings(final SubLObject evaluation_pairs)
  {
    if( NIL != evaluation_pairs )
    {
      final SubLObject first_pair = evaluation_pairs.first();
      SubLObject last_value = first_pair.rest();
      SubLObject current_rank = ONE_INTEGER;
      SubLObject current_index = ONE_INTEGER;
      ConsesLow.rplacd( first_pair, current_rank );
      SubLObject cdolist_list_var = evaluation_pairs.rest();
      SubLObject rest_pair = NIL;
      rest_pair = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        current_index = Numbers.add( current_index, ONE_INTEGER );
        final SubLObject rest_value = rest_pair.rest();
        if( !last_value.equal( rest_value ) )
        {
          current_rank = current_index;
        }
        ConsesLow.rplacd( rest_pair, current_rank );
        last_value = rest_value;
        cdolist_list_var = cdolist_list_var.rest();
        rest_pair = cdolist_list_var.first();
      }
    }
    return evaluation_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 16173L)
  public static SubLObject removal_nth_largest_iterate_the_set_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return cycl_utilities.nat_arity( cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 16541L)
  public static SubLObject removal_nth_largest_iterate_the_set_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_iterate_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 17279L)
  public static SubLObject removal_nth_smallest_iterate_the_set_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return cycl_utilities.nat_arity( cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 17652L)
  public static SubLObject removal_nth_smallest_iterate_the_set_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_iterate_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 18704L)
  public static SubLObject removal_nth_largest_iterate_the_set_of_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_iterate_expand( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-nth-largest-element.lisp", position = 19549L)
  public static SubLObject removal_nth_smallest_iterate_the_set_of_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_nth_extremal_iterate_expand( asent );
  }

  public static SubLObject declare_removal_modules_nth_largest_element_file()
  {
    SubLFiles.declareFunction( me, "cyc_quantity_decreasing_sort", "CYC-QUANTITY-DECREASING-SORT", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_quantity_increasing_sort", "CYC-QUANTITY-INCREASING-SORT", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_n_collection_required", "REMOVAL-NTH-LARGEST-N-COLLECTION-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_n_collection_output_generate", "REMOVAL-NTH-LARGEST-N-COLLECTION-OUTPUT-GENERATE", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_n_collection_required", "REMOVAL-NTH-SMALLEST-N-COLLECTION-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_n_collection_output_generate", "REMOVAL-NTH-SMALLEST-N-COLLECTION-OUTPUT-GENERATE", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_nth_extremal_n_required", "REMOVAL-NTH-EXTREMAL-N-REQUIRED", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_nth_extremal_n_output_generate", "REMOVAL-NTH-EXTREMAL-N-OUTPUT-GENERATE", 4, 0, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_n_the_set_required", "REMOVAL-NTH-LARGEST-N-THE-SET-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_n_the_set_output_generate", "REMOVAL-NTH-LARGEST-N-THE-SET-OUTPUT-GENERATE", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_n_the_set_required", "REMOVAL-NTH-SMALLEST-N-THE-SET-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_n_the_set_output_generate", "REMOVAL-NTH-SMALLEST-N-THE-SET-OUTPUT-GENERATE", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_n_the_set_of_required", "REMOVAL-NTH-LARGEST-N-THE-SET-OF-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_n_the_set_of_output_generate", "REMOVAL-NTH-LARGEST-N-THE-SET-OF-OUTPUT-GENERATE", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_n_the_set_of_required", "REMOVAL-NTH-SMALLEST-N-THE-SET-OF-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_n_the_set_of_output_generate", "REMOVAL-NTH-SMALLEST-N-THE-SET-OF-OUTPUT-GENERATE", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_iterate_collection_cost", "REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_iterate_collection_expand", "REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_iterate_collection_cost", "REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_iterate_collection_expand", "REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_extremal_iterate_expand", "REMOVAL-NTH-EXTREMAL-ITERATE-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_nth_extremal_convert_to_rankings", "REMOVAL-NTH-EXTREMAL-CONVERT-TO-RANKINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_iterate_the_set_cost", "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_iterate_the_set_expand", "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_iterate_the_set_cost", "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_iterate_the_set_expand", "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_largest_iterate_the_set_of_expand", "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-OF-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_nth_smallest_iterate_the_set_of_expand", "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-OF-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_nth_largest_element_file()
  {
    $default_removal_nth_extremal_n_cost$ = SubLFiles.defparameter( "*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*", ONE_INTEGER );
    $default_the_set_of_cardinality_estimate$ = SubLFiles.defparameter( "*DEFAULT-THE-SET-OF-CARDINALITY-ESTIMATE*", $int30$100 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_nth_largest_element_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const2$nthLargestElement );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const2$nthLargestElement, THREE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const2$nthLargestElement, FOUR_INTEGER );
    inference_modules.register_solely_specific_removal_module_predicate( $const4$nthSmallestElement );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const4$nthSmallestElement, THREE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const4$nthSmallestElement, FOUR_INTEGER );
    inference_modules.inference_removal_module( $kw5$REMOVAL_NTH_LARGEST_N_COLLECTION, $list6 );
    inference_modules.inference_removal_module( $kw7$REMOVAL_NTH_SMALLEST_N_COLLECTION, $list8 );
    inference_modules.inference_removal_module( $kw12$REMOVAL_NTH_LARGEST_N_THE_SET, $list13 );
    inference_modules.inference_removal_module( $kw14$REMOVAL_NTH_SMALLEST_N_THE_SET, $list15 );
    inference_modules.inference_removal_module( $kw16$REMOVAL_NTH_LARGEST_N_THE_SET_OF, $list17 );
    inference_modules.inference_removal_module( $kw18$REMOVAL_NTH_SMALLEST_N_THE_SET_OF, $list19 );
    inference_modules.inference_removal_module( $kw20$REMOVAL_NTH_LARGEST_ITERATE_COLLECTION, $list21 );
    inference_modules.inference_removal_module( $kw22$REMOVAL_NTH_SMALLEST_ITERATE_COLLECTION, $list23 );
    inference_modules.inference_removal_module( $kw26$REMOVAL_NTH_LARGEST_ITERATE_THE_SET, $list27 );
    inference_modules.inference_removal_module( $kw28$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET, $list29 );
    inference_modules.inference_removal_module( $kw31$REMOVAL_NTH_LARGEST_ITERATE_THE_SET_OF, $list32 );
    inference_modules.inference_removal_module( $kw33$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET_OF, $list34 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_nth_largest_element_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_nth_largest_element_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_nth_largest_element_file();
  }
  static
  {
    me = new removal_modules_nth_largest_element();
    $default_removal_nth_extremal_n_cost$ = null;
    $default_the_set_of_cardinality_estimate$ = null;
    $sym0$CYC_GREATER_THAN = makeSymbol( "CYC-GREATER-THAN" );
    $sym1$CYC_LESS_THAN = makeSymbol( "CYC-LESS-THAN" );
    $const2$nthLargestElement = constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) );
    $kw3$POS = makeKeyword( "POS" );
    $const4$nthSmallestElement = constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) );
    $kw5$REMOVAL_NTH_LARGEST_N_COLLECTION = makeKeyword( "REMOVAL-NTH-LARGEST-N-COLLECTION" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "INTEGER" ), makeKeyword( "FORT" ), makeKeyword(
            "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-NTH-LARGEST-N-COLLECTION-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "nthLargestElement" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ), ConsesLow.list(
                        makeKeyword( "BIND" ), makeSymbol( "FUNCTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                            "COLLECTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                                makeSymbol( "RANK" ), makeSymbol( "SET" ), makeSymbol( "FUNCTION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-NTH-LARGEST-N-COLLECTION-OUTPUT-GENERATE" ), ConsesLow
                                    .list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                        "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword(
                                            "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ), ConsesLow.list( makeKeyword(
                                                "VALUE" ), makeSymbol( "FUNCTION" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                    "(#$nthLargestElement <whatever> <n> <collection> <function>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                        "(#$nthLargestElement #$Alaska-State 1 \n       #$State-UnitedStates\n       (#$FunctionToArg 2 #$areaOfRegion))" )
    } );
    $kw7$REMOVAL_NTH_SMALLEST_N_COLLECTION = makeKeyword( "REMOVAL-NTH-SMALLEST-N-COLLECTION" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "INTEGER" ), makeKeyword( "FORT" ), makeKeyword(
            "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-NTH-SMALLEST-N-COLLECTION-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "nthSmallestElement" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COLLECTION" ) ), ConsesLow.list(
                        makeKeyword( "BIND" ), makeSymbol( "FUNCTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                            "COLLECTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                                makeSymbol( "RANK" ), makeSymbol( "SET" ), makeSymbol( "FUNCTION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-NTH-SMALLEST-N-COLLECTION-OUTPUT-GENERATE" ), ConsesLow
                                    .list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                        "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword(
                                            "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COLLECTION" ) ), ConsesLow.list( makeKeyword(
                                                "VALUE" ), makeSymbol( "FUNCTION" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                    "(#$nthSmallestElement <whatever> <n> <collection> <function>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                        "(#$nthSmallestElement #$Alaska-State 50 \n       #$State-UnitedStates\n       (#$FunctionToArg 2 #$areaOfRegion))" )
    } );
    $kw9$HL = makeKeyword( "HL" );
    $sym10$CDR = makeSymbol( "CDR" );
    $sym11$CAR = makeSymbol( "CAR" );
    $kw12$REMOVAL_NTH_LARGEST_N_THE_SET = makeKeyword( "REMOVAL-NTH-LARGEST-N-THE-SET" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "INTEGER" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-NTH-LARGEST-N-THE-SET-REQUIRED" ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
          makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "RANK" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FUNCTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                  makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "RANK" ), makeSymbol( "SET" ), makeSymbol( "FUNCTION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "REMOVAL-NTH-LARGEST-N-THE-SET-OUTPUT-GENERATE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword(
                  "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "FUNCTION" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$nthLargestElement <whatever> <n> (#$TheSet . <closed>) <function>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$nthLargestElement ?WHAT 1 \n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)" )
    } );
    $kw14$REMOVAL_NTH_SMALLEST_N_THE_SET = makeKeyword( "REMOVAL-NTH-SMALLEST-N-THE-SET" );
    $list15 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "INTEGER" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-NTH-SMALLEST-N-THE-SET-REQUIRED" ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
          makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "RANK" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FUNCTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                  makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "RANK" ), makeSymbol( "SET" ), makeSymbol( "FUNCTION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "REMOVAL-NTH-SMALLEST-N-THE-SET-OUTPUT-GENERATE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword(
                  "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "FUNCTION" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$nthSmallestElement <whatever> <n> (#$TheSet . <closed>) <function>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$nthSmallestElement ?WHAT 1\n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)" )
    } );
    $kw16$REMOVAL_NTH_LARGEST_N_THE_SET_OF = makeKeyword( "REMOVAL-NTH-LARGEST-N-THE-SET-OF" );
    $list17 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "INTEGER" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-NTH-LARGEST-N-THE-SET-OF-REQUIRED" ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
          makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "RANK" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FUNCTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                  makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "RANK" ), makeSymbol( "SET" ), makeSymbol( "FUNCTION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "REMOVAL-NTH-LARGEST-N-THE-SET-OF-OUTPUT-GENERATE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword(
                  "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "FUNCTION" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$nthLargestElement  <whatever> <n> (#$TheSetOf <var> <closed>) <function>)" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$nthLargestElement ?COUNTRY 1 \n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))" )
    } );
    $kw18$REMOVAL_NTH_SMALLEST_N_THE_SET_OF = makeKeyword( "REMOVAL-NTH-SMALLEST-N-THE-SET-OF" );
    $list19 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "INTEGER" ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-NTH-SMALLEST-N-THE-SET-OF-REQUIRED" ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-NTH-EXTREMAL-N-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
          makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "RANK" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FUNCTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                  makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "RANK" ), makeSymbol( "SET" ), makeSymbol( "FUNCTION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "REMOVAL-NTH-SMALLEST-N-THE-SET-OF-OUTPUT-GENERATE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "FUNCTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword(
                  "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RANK" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SET" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "FUNCTION" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$nthSmallestElement <whatever> <n> (#$TheSetOf <var> <closed>) <function>)" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$nthSmallestElement ?COUNTRY 1 \n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))" )
    } );
    $kw20$REMOVAL_NTH_LARGEST_ITERATE_COLLECTION = makeKeyword( "REMOVAL-NTH-LARGEST-ITERATE-COLLECTION" );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FORT" ),
            makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-NTH-LARGEST-ITERATE-COLLECTION-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$nthLargestElement <whatever> <not-fully-bound> <collection> <function>)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$nthLargestElement #$China-PeoplesRepublic ?NTH\n       #$IndependentCountry\n       (#$FunctionToArg 2 #$areaOfRegion))" )
    } );
    $kw22$REMOVAL_NTH_SMALLEST_ITERATE_COLLECTION = makeKeyword( "REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FORT" ),
            makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-NTH-SMALLEST-ITERATE-COLLECTION-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$nthSmallestElement <whatever> <not-fully-bound> <collection> <function>)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$nthSmallestElement #$Belgium ?NTH\n       #$IndependentCountry\n       (#$FunctionToArg 2 #$areaOfRegion))" )
    } );
    $list24 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "RANK" ), makeSymbol( "SET" ), makeSymbol( "FUNCTION" ) );
    $kw25$OPAQUE = makeKeyword( "OPAQUE" );
    $kw26$REMOVAL_NTH_LARGEST_ITERATE_THE_SET = makeKeyword( "REMOVAL-NTH-LARGEST-ITERATE-THE-SET" );
    $list27 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.cons(
            constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol(
                "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-EXPAND" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$nthLargestElement <whatever> <not-fully-bound> (TheSet . <closed>) <function>)" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$nthLargestElement 3 ?WHAT\n      (#$TheSet 1 2 3 -3)\n      #$AbsoluteValueFn)" )
    } );
    $kw28$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET = makeKeyword( "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET" );
    $list29 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.cons(
            constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol(
                "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-EXPAND" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$nthSmallestElement <whatever> <not-fully-bound> (TheSet . <closed>) <function>)" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$nthSmallestElement 3 ?WHAT\n       (#$TheSet 1 2 3 -3)\n       #$AbsoluteValueFn)" )
    } );
    $int30$100 = makeInteger( 100 );
    $kw31$REMOVAL_NTH_LARGEST_ITERATE_THE_SET_OF = makeKeyword( "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-OF" );
    $list32 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.cons(
            constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*DEFAULT-THE-SET-OF-CARDINALITY-ESTIMATE*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NTH-LARGEST-ITERATE-THE-SET-OF-EXPAND" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$nthLargestElement  <whatever> <not-fully-bound> (#$TheSetOf <var> <closed>) <function>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$nthLargestElement #$France ?NTH\n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))" )
    } );
    $kw33$REMOVAL_NTH_SMALLEST_ITERATE_THE_SET_OF = makeKeyword( "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-OF" );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthSmallestElement" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.cons(
            constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*DEFAULT-THE-SET-OF-CARDINALITY-ESTIMATE*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NTH-SMALLEST-ITERATE-THE-SET-OF-EXPAND" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$nthSmallestElement <whatever> <not-fully-bound> (#$TheSetOf <var> <closed>) <function>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$nthSmallestElement #$Denmark ?NTH\n       (#$TheSetOf ?COUNTRY\n          (#$bordersOn ?COUNTRY #$Germany)) \n       (#$FunctionToArg 2 #$areaOfRegion))" )
    } );
  }
}
/*
 * 
 * Total time: 187 ms
 * 
 */