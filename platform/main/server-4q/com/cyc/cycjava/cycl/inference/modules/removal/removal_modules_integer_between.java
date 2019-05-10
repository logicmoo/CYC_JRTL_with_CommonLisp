package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_integer_between
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_integer_between";
  public static final String myFingerPrint = "c48cb2be6f75355a028581e7ba74c464d2c2851f7a52d513740187740b727e1b";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 775L)
  private static SubLSymbol $default_integer_between_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 1787L)
  public static SubLSymbol $integer_between_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 3670L)
  private static SubLSymbol $default_not_integer_between_check_cost$;
  private static final SubLObject $const0$integerBetween;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLSymbol $kw3$REMOVAL_INTEGER_BETWEEN_CHECK;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$_INTEGER_BETWEEN_DEFINING_MT_;
  private static final SubLObject $const6$BaseKB;
  private static final SubLSymbol $sym7$INTEGERP;
  private static final SubLSymbol $kw8$CODE;
  private static final SubLSymbol $kw9$TRUE_MON;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_INTEGER_BETWEEN_UNIFY;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$REMOVAL_NOT_INTEGER_BETWEEN_CHECK;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLObject $const18$isa;
  private static final SubLObject $const19$Integer;
  private static final SubLObject $const20$greaterThanOrEqualTo;
  private static final SubLSymbol $sym21$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_APPLICABILITY;
  private static final SubLSymbol $sym22$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_COST;
  private static final SubLSymbol $kw23$ISA;
  private static final SubLSymbol $kw24$EVAL;
  private static final SubLSymbol $sym25$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_EXPAND;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 966L)
  public static SubLObject removal_integer_between_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject low = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject med = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject high = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    if( low.numLE( med ) && med.numLE( high ) )
    {
      backward.removal_add_node( make_integer_between_support( low, med, high, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 1877L)
  public static SubLObject make_integer_between_support(final SubLObject low, final SubLObject med, final SubLObject high, SubLObject negate)
  {
    if( negate == UNPROVIDED )
    {
      negate = NIL;
    }
    assert NIL != Types.integerp( low ) : low;
    assert NIL != Types.integerp( med ) : med;
    assert NIL != Types.integerp( high ) : high;
    SubLObject formula = ConsesLow.list( $const0$integerBetween, low, med, high );
    if( NIL != negate )
    {
      formula = cycl_utilities.negate( formula );
    }
    final SubLObject hl_support = arguments.make_hl_support( $kw8$CODE, formula, $integer_between_defining_mt$.getGlobalValue(), $kw9$TRUE_MON );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 2277L)
  public static SubLObject removal_integer_between_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject low = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject high = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject range = Numbers.add( ONE_INTEGER, Numbers.subtract( high, low ) );
    return Numbers.max( ZERO_INTEGER, range );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 2625L)
  public static SubLObject removal_integer_between_verify(final SubLObject cycl_input)
  {
    SubLObject low = NIL;
    SubLObject high = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( cycl_input, cycl_input, $list10 );
    low = cycl_input.first();
    SubLObject current = cycl_input.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, cycl_input, $list10 );
    high = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Numbers.numLE( low, high );
    }
    cdestructuring_bind.cdestructuring_bind_error( cycl_input, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 3877L)
  public static SubLObject removal_not_integer_between_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject low = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject med = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject high = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    if( !low.numLE( med ) || !med.numLE( high ) )
    {
      backward.removal_add_node( make_integer_between_support( low, med, high, T ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 5949L)
  public static SubLObject removal_conjunctive_integer_between_applicability(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject isa_dict = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject gt_dict = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject lt_dict = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != el_utilities.el_binary_formula_p( asent ) )
        {
          thread.resetMultipleValues();
          final SubLObject pred = el_utilities.unmake_binary_formula( asent );
          final SubLObject arg1 = thread.secondMultipleValue();
          final SubLObject arg2 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          final SubLObject pcase_var = pred;
          if( pcase_var.eql( $const18$isa ) )
          {
            if( $const19$Integer.eql( arg2 ) )
            {
              dictionary_utilities.dictionary_push( isa_dict, arg1, index );
            }
          }
          else if( pcase_var.eql( $const20$greaterThanOrEqualTo ) )
          {
            if( NIL != variables.variable_p( arg1 ) && arg2.isInteger() )
            {
              dictionary_utilities.dictionary_push( gt_dict, arg1, index );
            }
            else if( arg1.isInteger() && NIL != variables.variable_p( arg2 ) )
            {
              dictionary_utilities.dictionary_push( lt_dict, arg2, index );
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    SubLObject subclause_specs = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( gt_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject gt_indices = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject lt_indices = dictionary.dictionary_lookup( lt_dict, var, UNPROVIDED );
      if( NIL != lt_indices )
      {
        final SubLObject isa_indices = dictionary.dictionary_lookup( isa_dict, var, UNPROVIDED );
        if( NIL != isa_indices )
        {
          SubLObject cdolist_list_var2;
          final SubLObject index_sets = cdolist_list_var2 = list_utilities.cartesian_product( ConsesLow.list( isa_indices, gt_indices, lt_indices ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject indices = NIL;
          indices = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            subclause_specs = ConsesLow.cons( clause_utilities.new_subclause_spec( NIL, indices ), subclause_specs );
            cdolist_list_var2 = cdolist_list_var2.rest();
            indices = cdolist_list_var2.first();
          }
        }
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Sequences.nreverse( subclause_specs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 7257L)
  public static SubLObject removal_conjunctive_integer_between_cost(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject min = removal_conjunctive_integer_between_destructure( contextualized_dnf_clause );
    final SubLObject max = thread.secondMultipleValue();
    final SubLObject variable = thread.thirdMultipleValue();
    final SubLObject ordering = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( max.numL( min ) )
    {
      return ZERO_INTEGER;
    }
    return number_utilities.f_1X( Numbers.subtract( max, min ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 7569L)
  public static SubLObject removal_conjunctive_integer_between_expand(final SubLObject contextualized_dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject min = removal_conjunctive_integer_between_destructure( contextualized_dnf_clause );
    final SubLObject max = thread.secondMultipleValue();
    final SubLObject variable = thread.thirdMultipleValue();
    final SubLObject ordering = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    for( SubLObject n = min; n.numLE( max ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( variable, n, UNPROVIDED, UNPROVIDED );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject isa_support_sentence = el_utilities.make_binary_formula( $const18$isa, n, $const19$Integer );
        final SubLObject gt_support_sentence = el_utilities.make_binary_formula( $const20$greaterThanOrEqualTo, n, min );
        final SubLObject lt_support_sentence = el_utilities.make_binary_formula( $const20$greaterThanOrEqualTo, max, n );
        final SubLObject isa_supports = ConsesLow.list( arguments.make_hl_support( $kw23$ISA, isa_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED ) );
        final SubLObject gt_supports = ConsesLow.list( arguments.make_hl_support( $kw24$EVAL, gt_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED ) );
        final SubLObject lt_supports = ConsesLow.list( arguments.make_hl_support( $kw24$EVAL, lt_support_sentence, mt_vars.$core_mt_floor$.getGlobalValue(), UNPROVIDED ) );
        final SubLObject justifications = list_utilities.permute( ConsesLow.list( isa_supports, gt_supports, lt_supports ), ordering );
        inference_worker_removal.conjunctive_removal_callback( v_bindings, justifications );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-integer-between.lisp", position = 8642L)
  public static SubLObject removal_conjunctive_integer_between_destructure(final SubLObject contextualized_dnf_clause)
  {
    SubLObject min = NIL;
    SubLObject max = NIL;
    SubLObject variable = NIL;
    SubLObject permutation = NIL;
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = contextualized_asent;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != cycl_utilities.atomic_sentence_with_pred_p( asent, $const20$greaterThanOrEqualTo ) && cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ).isInteger() )
        {
          min = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
          permutation = ConsesLow.cons( ONE_INTEGER, permutation );
        }
        else if( NIL != cycl_utilities.atomic_sentence_with_pred_p( asent, $const20$greaterThanOrEqualTo ) && cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ).isInteger() )
        {
          max = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
          permutation = ConsesLow.cons( TWO_INTEGER, permutation );
        }
        else
        {
          variable = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
          permutation = ConsesLow.cons( ZERO_INTEGER, permutation );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    permutation = Sequences.nreverse( permutation );
    return Values.values( min, max, variable, permutation );
  }

  public static SubLObject declare_removal_modules_integer_between_file()
  {
    SubLFiles.declareFunction( me, "removal_integer_between_check_expand", "REMOVAL-INTEGER-BETWEEN-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "make_integer_between_support", "MAKE-INTEGER-BETWEEN-SUPPORT", 3, 1, false );
    SubLFiles.declareFunction( me, "removal_integer_between_unify_cost", "REMOVAL-INTEGER-BETWEEN-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_integer_between_verify", "REMOVAL-INTEGER-BETWEEN-VERIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_integer_between_check_expand", "REMOVAL-NOT-INTEGER-BETWEEN-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_conjunctive_integer_between_applicability", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-APPLICABILITY", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_conjunctive_integer_between_cost", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_conjunctive_integer_between_expand", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-EXPAND", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_conjunctive_integer_between_destructure", "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-DESTRUCTURE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_integer_between_file()
  {
    $default_integer_between_check_cost$ = SubLFiles.defparameter( "*DEFAULT-INTEGER-BETWEEN-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $integer_between_defining_mt$ = SubLFiles.deflexical( "*INTEGER-BETWEEN-DEFINING-MT*", maybeDefault( $sym5$_INTEGER_BETWEEN_DEFINING_MT_, $integer_between_defining_mt$, $const6$BaseKB ) );
    $default_not_integer_between_check_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-INTEGER-BETWEEN-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_integer_between_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$integerBetween );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$integerBetween, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$integerBetween, THREE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$integerBetween );
    inference_modules.inference_removal_module( $kw3$REMOVAL_INTEGER_BETWEEN_CHECK, $list4 );
    subl_macro_promotions.declare_defglobal( $sym5$_INTEGER_BETWEEN_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym5$_INTEGER_BETWEEN_DEFINING_MT_, $const0$integerBetween );
    inference_modules.inference_removal_module( $kw11$REMOVAL_INTEGER_BETWEEN_UNIFY, $list12 );
    inference_modules.inference_removal_module( $kw13$REMOVAL_NOT_INTEGER_BETWEEN_CHECK, $list14 );
    inference_modules.inference_conjunctive_removal_module( $kw15$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN, $list16 );
    utilities_macros.note_funcall_helper_function( $sym21$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_APPLICABILITY );
    utilities_macros.note_funcall_helper_function( $sym22$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_COST );
    utilities_macros.note_funcall_helper_function( $sym25$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_EXPAND );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_integer_between_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_integer_between_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_integer_between_file();
  }
  static
  {
    me = new removal_modules_integer_between();
    $default_integer_between_check_cost$ = null;
    $integer_between_defining_mt$ = null;
    $default_not_integer_between_check_cost$ = null;
    $const0$integerBetween = constant_handles.reader_make_constant_shell( makeString( "integerBetween" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $kw3$REMOVAL_INTEGER_BETWEEN_CHECK = makeKeyword( "REMOVAL-INTEGER-BETWEEN-CHECK" );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "integerBetween" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "integerBetween" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-INTEGER-BETWEEN-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-INTEGER-BETWEEN-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$integerBetween <integer> <integer> <integer>)" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$integerBetween 1 2 3)" )
    } );
    $sym5$_INTEGER_BETWEEN_DEFINING_MT_ = makeSymbol( "*INTEGER-BETWEEN-DEFINING-MT*" );
    $const6$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym7$INTEGERP = makeSymbol( "INTEGERP" );
    $kw8$CODE = makeKeyword( "CODE" );
    $kw9$TRUE_MON = makeKeyword( "TRUE-MON" );
    $list10 = ConsesLow.list( makeSymbol( "LOW" ), makeSymbol( "HIGH" ) );
    $kw11$REMOVAL_INTEGER_BETWEEN_UNIFY = makeKeyword( "REMOVAL-INTEGER-BETWEEN-UNIFY" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "integerBetween" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "integerBetween" ) ), makeKeyword( "INTEGER" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "INTEGER" ) ),
      makeKeyword( "COST" ), makeSymbol( "REMOVAL-INTEGER-BETWEEN-UNIFY-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
          "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "integerBetween" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "LOW" ) ), makeKeyword( "ANYTHING" ), ConsesLow
              .list( makeKeyword( "BIND" ), makeSymbol( "HIGH" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LOW" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "HIGH" ) ) ) ),
      makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "REMOVAL-INTEGER-BETWEEN-VERIFY" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ),
          ConsesLow.list( makeSymbol( "LOW" ), makeSymbol( "HIGH" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NEW-INTEGER-ITERATOR" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LOW" ) ), ConsesLow
              .list( makeKeyword( "CALL" ), makeSymbol( "1+" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "HIGH" ) ) ), ONE_INTEGER ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                  constant_handles.reader_make_constant_shell( makeString( "integerBetween" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "LOW" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword(
                      "VALUE" ), makeSymbol( "HIGH" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*INTEGER-BETWEEN-DEFINING-MT*" ), makeKeyword(
                          "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$integerBetween <integer> <whatever> <integer>)" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$integerBetween 1 ?NUM 10)" )
    } );
    $kw13$REMOVAL_NOT_INTEGER_BETWEEN_CHECK = makeKeyword( "REMOVAL-NOT-INTEGER-BETWEEN-CHECK" );
    $list14 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "integerBetween" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "integerBetween" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-INTEGER-BETWEEN-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-INTEGER-BETWEEN-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$integerBetween <integer> <whatever> <integer>))" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$not (#$integerBetween 1 42 10))" )
    } );
    $kw15$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN = makeKeyword( "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN" );
    $list16 = ConsesLow.list( new SubLObject[] { makeKeyword( "EVERY-PREDICATES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
        makeString( "greaterThanOrEqualTo" ) ) ), makeKeyword( "APPLICABILITY" ), makeSymbol( "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-APPLICABILITY" ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-EXPAND" ), makeKeyword(
                "DOCUMENTATION" ), makeString( "(#$and (#$isa ?NUM #$Integer) (#$greaterThanOrEqualTo ?NUM <int1>) (#$greaterThanOrEqualTo <int2> ?NUM))" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$and (#$isa ?NUM #$Integer) (#$greaterThanOrEqualTo ?NUM 1) (#$greaterThanOrEqualTo 212 ?NUM))" )
    } );
    $list17 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $const18$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const19$Integer = constant_handles.reader_make_constant_shell( makeString( "Integer" ) );
    $const20$greaterThanOrEqualTo = constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) );
    $sym21$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_APPLICABILITY = makeSymbol( "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-APPLICABILITY" );
    $sym22$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_COST = makeSymbol( "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-COST" );
    $kw23$ISA = makeKeyword( "ISA" );
    $kw24$EVAL = makeKeyword( "EVAL" );
    $sym25$REMOVAL_CONJUNCTIVE_INTEGER_BETWEEN_EXPAND = makeSymbol( "REMOVAL-CONJUNCTIVE-INTEGER-BETWEEN-EXPAND" );
  }
}
/*
 * 
 * Total time: 81 ms
 * 
 */