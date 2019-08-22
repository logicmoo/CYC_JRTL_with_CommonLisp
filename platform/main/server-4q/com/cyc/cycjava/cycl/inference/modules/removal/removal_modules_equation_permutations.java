package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_equation_permutations
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_equation_permutations";
  public static final String myFingerPrint = "a16b132c140ef503b6bd67cdd3030fdb1a7c57ac9b4c89cb1b32cb1760335bf5";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 6121L)
  private static SubLSymbol $equation_permutable_operators$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 13601L)
  public static SubLSymbol $equation_permutations_defining_mt$;
  private static final SubLObject $const0$numericallyEquals;
  private static final SubLSymbol $sym1$CYCL_EQUATION_P;
  private static final SubLSymbol $sym2$EQUATION_CANONICAL_PERMUTATION_;
  private static final SubLList $list3;
  private static final SubLObject $const4$PlusFn;
  private static final SubLObject $const5$DifferenceFn;
  private static final SubLObject $const6$TimesFn;
  private static final SubLObject $const7$QuotientFn;
  private static final SubLObject $const8$LogFn;
  private static final SubLObject $const9$ExpFn;
  private static final SubLObject $const10$The;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$MAKE_ADDITION;
  private static final SubLSymbol $sym15$MAKE_MULTIPLICATION;
  private static final SubLObject $const16$equationPermutations;
  private static final SubLSymbol $kw17$POS;
  private static final SubLSymbol $sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_;
  private static final SubLObject $const19$UniversalVocabularyMt;
  private static final SubLSymbol $kw20$REMOVAL_EQUATION_PERMUTATIONS_CHECK;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$EQUATION_PERMUTATIONS_FROM_ADDITION;
  private static final SubLSymbol $kw27$TEST;
  private static final SubLSymbol $kw28$OWNER;
  private static final SubLSymbol $kw29$CLASSES;
  private static final SubLSymbol $kw30$KB;
  private static final SubLSymbol $kw31$TINY;
  private static final SubLSymbol $kw32$WORKING_;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$EQUATION_PERMUTATIONS_FROM_SUBTRACTION;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$EQUATION_PERMUTATIONS_FROM_MULTIPLICATION;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$EQUATION_PERMUTATIONS_FROM_DIVISION;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$EQUATION_IMMEDIATE_PERMUTATIONS;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$EQUATION_CANONICAL_PERMUTATIONS;
  private static final SubLSymbol $kw43$FULL;
  private static final SubLList $list44;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 1122L)
  public static SubLObject cycl_equation_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_formula_with_operator_p( v_object, $const0$numericallyEquals ) && NIL != el_utilities.formula_arityE( v_object, TWO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 1506L)
  public static SubLObject equation_permutations(final SubLObject equation)
  {
    assert NIL != cycl_equation_p( equation ) : equation;
    final SubLObject unprocessed_equations = queues.create_queue( UNPROVIDED );
    final SubLObject seen_equations = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject all_permutations = NIL;
    queues.enqueue( equation, unprocessed_equations );
    set.set_add( equation, seen_equations );
    while ( NIL == queues.queue_empty_p( unprocessed_equations ))
    {
      final SubLObject unprocessed_equation = queues.dequeue( unprocessed_equations );
      final SubLObject immediate_permutations = equation_immediate_permutations( unprocessed_equation );
      all_permutations = ConsesLow.cons( unprocessed_equation, all_permutations );
      SubLObject cdolist_list_var = immediate_permutations;
      SubLObject immediate_permutation = NIL;
      immediate_permutation = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == set.set_memberP( immediate_permutation, seen_equations ) )
        {
          queues.enqueue( immediate_permutation, unprocessed_equations );
          set.set_add( immediate_permutation, seen_equations );
        }
        cdolist_list_var = cdolist_list_var.rest();
        immediate_permutation = cdolist_list_var.first();
      }
    }
    all_permutations = kb_utilities.sort_terms( all_permutations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return all_permutations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 2646L)
  public static SubLObject equation_canonical_permutations(final SubLObject equation)
  {
    final SubLObject all_permutations = equation_permutations( equation );
    SubLObject canonical_permutations = NIL;
    SubLObject cdolist_list_var = all_permutations;
    SubLObject permutation = NIL;
    permutation = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != equation_canonical_permutationP( permutation ) )
      {
        canonical_permutations = ConsesLow.cons( permutation, canonical_permutations );
      }
      cdolist_list_var = cdolist_list_var.rest();
      permutation = cdolist_list_var.first();
    }
    canonical_permutations = kb_utilities.sort_terms( canonical_permutations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return canonical_permutations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 3222L)
  public static SubLObject equation_has_canonical_permutationP(final SubLObject equation, final SubLObject permutation)
  {
    assert NIL != cycl_equation_p( equation ) : equation;
    assert NIL != cycl_equation_p( permutation ) : permutation;
    return makeBoolean( NIL != equation_canonical_permutationP( permutation ) && NIL != list_utilities.member_equalP( permutation, equation_canonical_permutations( equation ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 3601L)
  public static SubLObject equation_canonical_permutationP(final SubLObject permutation)
  {
    if( NIL == cycl_equation_p( permutation ) )
    {
      return NIL;
    }
    final SubLObject arg1 = cycl_utilities.formula_arg1( permutation, UNPROVIDED );
    if( arg1.isNumber() )
    {
      return NIL;
    }
    return makeBoolean( ( NIL == el_utilities.el_formula_p( arg1 ) || NIL == equation_permutable_operator_p( cycl_utilities.formula_operator( arg1 ) ) ) && NIL == cycl_utilities.expression_find( arg1, cycl_utilities
        .formula_arg2( permutation, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 4912L)
  public static SubLObject equation_immediate_permutations(final SubLObject equation)
  {
    SubLObject num_eq = NIL;
    SubLObject expression1 = NIL;
    SubLObject expression2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( equation, equation, $list3 );
    num_eq = equation.first();
    SubLObject current = equation.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, equation, $list3 );
    expression1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, equation, $list3 );
    expression2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      list_utilities.verify_operator( num_eq, $const0$numericallyEquals );
      SubLObject permutations = NIL;
      if( NIL != el_utilities.el_formula_p( expression1 ) )
      {
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = cycl_utilities.formula_operator( expression1 );
        if( pcase_var.eql( $const4$PlusFn ) )
        {
          permutations = equation_permutations_from_addition( expression1, expression2 );
        }
        else if( pcase_var.eql( $const5$DifferenceFn ) )
        {
          permutations = equation_permutations_from_subtraction( expression1, expression2 );
        }
        else if( pcase_var.eql( $const6$TimesFn ) )
        {
          permutations = equation_permutations_from_multiplication( expression1, expression2 );
        }
        else if( pcase_var.eql( $const7$QuotientFn ) )
        {
          permutations = equation_permutations_from_division( expression1, expression2 );
        }
        else if( pcase_var.eql( $const8$LogFn ) )
        {
          permutations = equation_permutations_from_natural_log( expression1, expression2 );
        }
        else if( pcase_var.eql( $const9$ExpFn ) )
        {
          permutations = equation_permutations_from_natural_exp( expression1, expression2 );
        }
        else if( pcase_var.eql( $const10$The ) )
        {
        }
      }
      permutations = ConsesLow.cons( make_equation( expression2, expression1 ), permutations );
      return permutations;
    }
    cdestructuring_bind.cdestructuring_bind_error( equation, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 6451L)
  public static SubLObject equation_permutable_operator_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $equation_permutable_operators$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 6566L)
  public static SubLObject equation_permutations_from_addition(final SubLObject addition, final SubLObject other)
  {
    list_utilities.verify_form_with_operator( addition, $const4$PlusFn );
    final SubLObject addends = cycl_utilities.formula_args( addition, UNPROVIDED );
    SubLObject permutations = NIL;
    SubLObject list_var = NIL;
    SubLObject addend = NIL;
    SubLObject index = NIL;
    list_var = addends;
    addend = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), addend = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      final SubLObject rest_addends = list_utilities.remove_nth( index, addends );
      final SubLObject rest_term = ( NIL != list_utilities.singletonP( rest_addends ) ) ? rest_addends.first() : make_addition( rest_addends );
      final SubLObject permuted_other = make_difference( other, rest_term );
      final SubLObject permutation = make_equation( addend, permuted_other );
      permutations = ConsesLow.cons( permutation, permutations );
    }
    return Sequences.nreverse( permutations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 7279L)
  public static SubLObject equation_permutations_from_subtraction(final SubLObject subtraction, final SubLObject other)
  {
    list_utilities.verify_form_with_operator( subtraction, $const5$DifferenceFn );
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( subtraction, UNPROVIDED );
    SubLObject minuend = NIL;
    SubLObject subtrahend = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    minuend = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    subtrahend = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject permuted1 = make_addition( ConsesLow.list( other, subtrahend ) );
      final SubLObject permuted2 = make_difference( minuend, other );
      final SubLObject permutation1 = make_equation( minuend, permuted1 );
      final SubLObject permutation2 = make_equation( subtrahend, permuted2 );
      return ConsesLow.list( permutation1, permutation2 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 7879L)
  public static SubLObject equation_permutations_from_multiplication(final SubLObject multiplication, final SubLObject other)
  {
    list_utilities.verify_form_with_operator( multiplication, $const6$TimesFn );
    final SubLObject addends = cycl_utilities.formula_args( multiplication, UNPROVIDED );
    SubLObject permutations = NIL;
    SubLObject list_var = NIL;
    SubLObject addend = NIL;
    SubLObject index = NIL;
    list_var = addends;
    addend = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), addend = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      SubLObject rest_addends = list_utilities.remove_nth( index, addends );
      final SubLObject rest_term = ( NIL != list_utilities.singletonP( rest_addends ) ) ? rest_addends.first() : make_multiplication( rest_addends );
      final SubLObject permuted_other = make_quotient( other, rest_term );
      final SubLObject permutation = make_equation( addend, permuted_other );
      permutations = ConsesLow.cons( permutation, permutations );
      rest_addends = list_utilities.remove_nth( index, addends );
      final SubLObject permuted_numerator = ( NIL != list_utilities.form_with_operator_p( addend, $const7$QuotientFn ) ) ? make_quotient( make_multiplication( ConsesLow.append( ConsesLow.list( conses_high.second(
          addend ) ), rest_addends ) ), conses_high.third( addend ) ) : make_multiplication( addends );
      final SubLObject permutation2 = make_equation( other, permuted_numerator );
      permutations = ConsesLow.cons( permutation2, permutations );
    }
    return Sequences.nreverse( permutations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 9238L)
  public static SubLObject equation_permutations_from_division(final SubLObject division, final SubLObject other)
  {
    list_utilities.verify_form_with_operator( division, $const7$QuotientFn );
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( division, UNPROVIDED );
    SubLObject numerator = NIL;
    SubLObject denominator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    numerator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    denominator = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject permuted1 = make_multiplication( ConsesLow.list( other, denominator ) );
      final SubLObject permuted2 = make_quotient( numerator, other );
      final SubLObject permutation1 = make_equation( numerator, permuted1 );
      final SubLObject permutation2 = make_equation( denominator, permuted2 );
      return ConsesLow.list( permutation1, permutation2 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 9842L)
  public static SubLObject equation_permutations_from_natural_log(final SubLObject log_formula, final SubLObject other)
  {
    list_utilities.verify_form_with_operator( log_formula, $const8$LogFn );
    final SubLObject v_term = cycl_utilities.formula_arg1( log_formula, ONE_INTEGER );
    final SubLObject permuted = el_utilities.make_unary_formula( $const9$ExpFn, other );
    final SubLObject permutation = make_equation( v_term, permuted );
    return ConsesLow.list( permutation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10225L)
  public static SubLObject equation_permutations_from_natural_exp(final SubLObject exp_formula, final SubLObject other)
  {
    list_utilities.verify_form_with_operator( exp_formula, $const9$ExpFn );
    final SubLObject v_term = cycl_utilities.formula_arg1( exp_formula, ONE_INTEGER );
    final SubLObject permuted = el_utilities.make_unary_formula( $const8$LogFn, other );
    final SubLObject permutation = make_equation( v_term, permuted );
    return ConsesLow.list( permutation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10609L)
  public static SubLObject make_equation(final SubLObject expression1, final SubLObject expression2)
  {
    return el_utilities.make_binary_formula( $const0$numericallyEquals, expression1, expression2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10808L)
  public static SubLObject make_commutative_formula(final SubLObject relation, SubLObject args)
  {
    args = kb_utilities.sort_terms( args, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return el_utilities.make_formula( relation, args, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10939L)
  public static SubLObject make_symmetric_formula(final SubLObject relation, final SubLObject arg1, final SubLObject arg2)
  {
    return make_commutative_formula( relation, ConsesLow.list( arg1, arg2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 11062L)
  public static SubLObject make_associative_commutative_formula(final SubLObject operator, final SubLObject args)
  {
    SubLObject final_args = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_formula_with_operator_p( arg, operator ) )
      {
        SubLObject cdolist_list_var_$1;
        final SubLObject sub_args = cdolist_list_var_$1 = cycl_utilities.formula_args( arg, UNPROVIDED );
        SubLObject sub_arg = NIL;
        sub_arg = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          final_args = ConsesLow.cons( sub_arg, final_args );
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          sub_arg = cdolist_list_var_$1.first();
        }
      }
      else
      {
        final_args = ConsesLow.cons( arg, final_args );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    if( NIL != list_utilities.singletonP( final_args ) )
    {
      return final_args.first();
    }
    return make_commutative_formula( operator, final_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 11608L)
  public static SubLObject make_separator_formula(final SubLObject operator, final SubLObject arg1, final SubLObject arg2, final SubLObject aggregator)
  {
    if( NIL != el_utilities.el_formula_with_operator_p( arg1, operator ) )
    {
      final SubLObject sub_arg1 = cycl_utilities.formula_arg1( arg1, UNPROVIDED );
      final SubLObject sub_arg2 = cycl_utilities.formula_arg2( arg1, UNPROVIDED );
      final SubLObject new_arg2 = Functions.funcall( aggregator, ConsesLow.list( sub_arg2, arg2 ) );
      return make_separator_formula( operator, sub_arg1, new_arg2, aggregator );
    }
    return el_utilities.make_binary_formula( operator, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12268L)
  public static SubLObject make_addition(final SubLObject addends)
  {
    return make_associative_commutative_formula( $const4$PlusFn, addends );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12466L)
  public static SubLObject make_multiplication(final SubLObject products)
  {
    return make_associative_commutative_formula( $const6$TimesFn, products );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12675L)
  public static SubLObject make_difference(final SubLObject minuend, final SubLObject subtrahend)
  {
    return make_separator_formula( $const5$DifferenceFn, minuend, subtrahend, $sym14$MAKE_ADDITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12921L)
  public static SubLObject make_quotient(final SubLObject numerator, final SubLObject denominator)
  {
    return make_separator_formula( $const7$QuotientFn, numerator, denominator, $sym15$MAKE_MULTIPLICATION );
  }

  public static SubLObject declare_removal_modules_equation_permutations_file()
  {
    SubLFiles.declareFunction( me, "cycl_equation_p", "CYCL-EQUATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "equation_permutations", "EQUATION-PERMUTATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "equation_canonical_permutations", "EQUATION-CANONICAL-PERMUTATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "equation_has_canonical_permutationP", "EQUATION-HAS-CANONICAL-PERMUTATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "equation_canonical_permutationP", "EQUATION-CANONICAL-PERMUTATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "equation_immediate_permutations", "EQUATION-IMMEDIATE-PERMUTATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "equation_permutable_operator_p", "EQUATION-PERMUTABLE-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "equation_permutations_from_addition", "EQUATION-PERMUTATIONS-FROM-ADDITION", 2, 0, false );
    SubLFiles.declareFunction( me, "equation_permutations_from_subtraction", "EQUATION-PERMUTATIONS-FROM-SUBTRACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "equation_permutations_from_multiplication", "EQUATION-PERMUTATIONS-FROM-MULTIPLICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "equation_permutations_from_division", "EQUATION-PERMUTATIONS-FROM-DIVISION", 2, 0, false );
    SubLFiles.declareFunction( me, "equation_permutations_from_natural_log", "EQUATION-PERMUTATIONS-FROM-NATURAL-LOG", 2, 0, false );
    SubLFiles.declareFunction( me, "equation_permutations_from_natural_exp", "EQUATION-PERMUTATIONS-FROM-NATURAL-EXP", 2, 0, false );
    SubLFiles.declareFunction( me, "make_equation", "MAKE-EQUATION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_commutative_formula", "MAKE-COMMUTATIVE-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_symmetric_formula", "MAKE-SYMMETRIC-FORMULA", 3, 0, false );
    SubLFiles.declareFunction( me, "make_associative_commutative_formula", "MAKE-ASSOCIATIVE-COMMUTATIVE-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_separator_formula", "MAKE-SEPARATOR-FORMULA", 4, 0, false );
    SubLFiles.declareFunction( me, "make_addition", "MAKE-ADDITION", 1, 0, false );
    SubLFiles.declareFunction( me, "make_multiplication", "MAKE-MULTIPLICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "make_difference", "MAKE-DIFFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_quotient", "MAKE-QUOTIENT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_equation_permutations_file()
  {
    $equation_permutable_operators$ = SubLFiles.deflexical( "*EQUATION-PERMUTABLE-OPERATORS*", $list11 );
    $equation_permutations_defining_mt$ = SubLFiles.deflexical( "*EQUATION-PERMUTATIONS-DEFINING-MT*", maybeDefault( $sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_, $equation_permutations_defining_mt$,
        $const19$UniversalVocabularyMt ) );
    return NIL;
  }

  public static SubLObject setup_removal_modules_equation_permutations_file()
  {
    utilities_macros.note_funcall_helper_function( $sym2$EQUATION_CANONICAL_PERMUTATION_ );
    inference_modules.register_solely_specific_removal_module_predicate( $const16$equationPermutations );
    preference_modules.doomed_unless_either_arg_bindable( $kw17$POS, $const16$equationPermutations );
    subl_macro_promotions.declare_defglobal( $sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_, $const16$equationPermutations );
    inference_modules.inference_removal_module( $kw20$REMOVAL_EQUATION_PERMUTATIONS_CHECK, $list21 );
    inference_modules.inference_removal_module( $kw22$REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY, $list23 );
    inference_modules.inference_removal_module( $kw24$REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY, $list25 );
    generic_testing.define_test_case_table_int( $sym26$EQUATION_PERMUTATIONS_FROM_ADDITION, ConsesLow.list( new SubLObject[] { $kw27$TEST, Symbols.symbol_function( EQUAL ), $kw28$OWNER, NIL, $kw29$CLASSES, NIL, $kw30$KB,
      $kw31$TINY, $kw32$WORKING_, T
    } ), $list33 );
    generic_testing.define_test_case_table_int( $sym34$EQUATION_PERMUTATIONS_FROM_SUBTRACTION, ConsesLow.list( new SubLObject[] { $kw27$TEST, Symbols.symbol_function( EQUAL ), $kw28$OWNER, NIL, $kw29$CLASSES, NIL,
      $kw30$KB, $kw31$TINY, $kw32$WORKING_, T
    } ), $list35 );
    generic_testing.define_test_case_table_int( $sym36$EQUATION_PERMUTATIONS_FROM_MULTIPLICATION, ConsesLow.list( new SubLObject[] { $kw27$TEST, Symbols.symbol_function( EQUAL ), $kw28$OWNER, NIL, $kw29$CLASSES, NIL,
      $kw30$KB, $kw31$TINY, $kw32$WORKING_, T
    } ), $list37 );
    generic_testing.define_test_case_table_int( $sym38$EQUATION_PERMUTATIONS_FROM_DIVISION, ConsesLow.list( new SubLObject[] { $kw27$TEST, Symbols.symbol_function( EQUAL ), $kw28$OWNER, NIL, $kw29$CLASSES, NIL, $kw30$KB,
      $kw31$TINY, $kw32$WORKING_, T
    } ), $list39 );
    generic_testing.define_test_case_table_int( $sym40$EQUATION_IMMEDIATE_PERMUTATIONS, ConsesLow.list( new SubLObject[] { $kw27$TEST, Symbols.symbol_function( EQUAL ), $kw28$OWNER, NIL, $kw29$CLASSES, NIL, $kw30$KB,
      $kw31$TINY, $kw32$WORKING_, T
    } ), $list41 );
    generic_testing.define_test_case_table_int( $sym42$EQUATION_CANONICAL_PERMUTATIONS, ConsesLow.list( new SubLObject[] { $kw27$TEST, Symbols.symbol_function( EQUAL ), $kw28$OWNER, NIL, $kw29$CLASSES, NIL, $kw30$KB,
      $kw43$FULL, $kw32$WORKING_, T
    } ), $list44 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_equation_permutations_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_equation_permutations_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_equation_permutations_file();
  }
  static
  {
    me = new removal_modules_equation_permutations();
    $equation_permutable_operators$ = null;
    $equation_permutations_defining_mt$ = null;
    $const0$numericallyEquals = constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) );
    $sym1$CYCL_EQUATION_P = makeSymbol( "CYCL-EQUATION-P" );
    $sym2$EQUATION_CANONICAL_PERMUTATION_ = makeSymbol( "EQUATION-CANONICAL-PERMUTATION?" );
    $list3 = ConsesLow.list( makeSymbol( "NUM-EQ" ), makeSymbol( "EXPRESSION1" ), makeSymbol( "EXPRESSION2" ) );
    $const4$PlusFn = constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) );
    $const5$DifferenceFn = constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) );
    $const6$TimesFn = constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) );
    $const7$QuotientFn = constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) );
    $const8$LogFn = constant_handles.reader_make_constant_shell( makeString( "LogFn" ) );
    $const9$ExpFn = constant_handles.reader_make_constant_shell( makeString( "ExpFn" ) );
    $const10$The = constant_handles.reader_make_constant_shell( makeString( "The" ) );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "TimesFn" ) ), constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), constant_handles.reader_make_constant_shell( makeString( "LogFn" ) ),
        constant_handles.reader_make_constant_shell( makeString( "ExpFn" ) ) );
    $list12 = ConsesLow.list( makeSymbol( "MINUEND" ), makeSymbol( "SUBTRAHEND" ) );
    $list13 = ConsesLow.list( makeSymbol( "NUMERATOR" ), makeSymbol( "DENOMINATOR" ) );
    $sym14$MAKE_ADDITION = makeSymbol( "MAKE-ADDITION" );
    $sym15$MAKE_MULTIPLICATION = makeSymbol( "MAKE-MULTIPLICATION" );
    $const16$equationPermutations = constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) );
    $kw17$POS = makeKeyword( "POS" );
    $sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_ = makeSymbol( "*EQUATION-PERMUTATIONS-DEFINING-MT*" );
    $const19$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $kw20$REMOVAL_EQUATION_PERMUTATIONS_CHECK = makeKeyword( "REMOVAL-EQUATION-PERMUTATIONS-CHECK" );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "numericallyEquals" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword(
                "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                    "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) ), ConsesLow.list( makeKeyword(
                        "BIND" ), makeSymbol( "EQUATION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PERMUTATION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EQUATION" ) ),
                            ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "PERMUTATION" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                                "EQUATION" ), makeSymbol( "PERMUTATION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "EQUATION-HAS-CANONICAL-PERMUTATION-P" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                    makeSymbol( "EQUATION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "PERMUTATION" ) ) ) ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword(
                                        "SUPPORT-MT" ), makeSymbol( "*EQUATION-PERMUTATIONS-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$equationPermutations \n  (#$numericallyEquals <bound> <bound>)\n  (#$numericallyEquals <bound> <bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                                                "(#$equationPermutations\n  (#$numericallyEquals (#$TimesFn :PRESSURE :VOLUME) (#$TimesFn :MOLARITY :R :TEMPERATURE))\n  (#$numericallyEquals :PRESSURE (#$QuotientFn (#$TimesFn :MOLARITY :R :TEMPERATURE) :VOLUME)))" )
    } );
    $kw22$REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY = makeKeyword( "REMOVAL-EQUATION-PERMUTATIONS-ARG1-UNIFY" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), TWENTY_INTEGER, makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "equationPermutations" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "EQUATION" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EQUATION" ) ) ),
      makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EQUATION-CANONICAL-PERMUTATION?" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
          makeSymbol( "EQUATION-PERMUTATIONS" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) ),
              makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EQUATION" ) ) ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                  "*EQUATION-PERMUTATIONS-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$equationPermutations  <whatever> (#$numericallyEquals <bound> <bound>))" ), makeKeyword( "EXAMPLE" ), makeString(
                      "(#$equationPermutations \n  ?EQUATION \n  (#$numericallyEquals :PRESSURE (#$QuotientFn (#$TimesFn :MOLARITY :R :TEMPERATURE) :VOLUME)))" )
    } );
    $kw24$REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY = makeKeyword( "REMOVAL-EQUATION-PERMUTATIONS-ARG2-UNIFY" );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "numericallyEquals" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), THREE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) ),
                    ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "EQUATION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EQUATION" ) ) ), makeKeyword(
                        "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "EQUATION-CANONICAL-PERMUTATIONS" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow
                            .list( constant_handles.reader_make_constant_shell( makeString( "equationPermutations" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EQUATION" ) ), makeKeyword( "INPUT" ) ),
      makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*EQUATION-PERMUTATIONS-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$equationPermutations (#$numericallyEquals <bound> <bound>) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$equationPermutations\n  (#$numericallyEquals (#$TimesFn :PRESSURE :VOLUME) (#$TimesFn :MOLARITY :R :TEMPERATURE))\n  ?PERMUTED)" )
    } );
    $sym26$EQUATION_PERMUTATIONS_FROM_ADDITION = makeSymbol( "EQUATION-PERMUTATIONS-FROM-ADDITION" );
    $kw27$TEST = makeKeyword( "TEST" );
    $kw28$OWNER = makeKeyword( "OWNER" );
    $kw29$CLASSES = makeKeyword( "CLASSES" );
    $kw30$KB = makeKeyword( "KB" );
    $kw31$TINY = makeKeyword( "TINY" );
    $kw32$WORKING_ = makeKeyword( "WORKING?" );
    $list33 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ), makeKeyword( "OTHER" ) ),
        ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "A" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "DifferenceFn" ) ), makeKeyword( "OTHER" ), makeKeyword( "B" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "B" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeKeyword( "OTHER" ), makeKeyword( "A" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "PlusFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ), makeKeyword( "C" ) ), makeKeyword( "OTHER" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "A" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeKeyword(
                            "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), makeKeyword( "B" ), makeKeyword( "C" ) ) ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "B" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ),
                                    makeKeyword( "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), makeKeyword( "A" ), makeKeyword( "C" ) ) ) ), ConsesLow.list(
                                        constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "C" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                            "DifferenceFn" ) ), makeKeyword( "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), makeKeyword( "A" ), makeKeyword(
                                                "B" ) ) ) ) ) ) );
    $sym34$EQUATION_PERMUTATIONS_FROM_SUBTRACTION = makeSymbol( "EQUATION-PERMUTATIONS-FROM-SUBTRACTION" );
    $list35 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ), makeKeyword(
        "OTHER" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "A" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "PlusFn" ) ), makeKeyword( "B" ), makeKeyword( "OTHER" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "B" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeKeyword( "A" ), makeKeyword( "OTHER" ) ) ) ) ) );
    $sym36$EQUATION_PERMUTATIONS_FROM_MULTIPLICATION = makeSymbol( "EQUATION-PERMUTATIONS-FROM-MULTIPLICATION" );
    $list37 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ), makeKeyword( "OTHER" ) ),
        ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "A" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "QuotientFn" ) ), makeKeyword( "OTHER" ), makeKeyword( "B" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "OTHER" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "numericallyEquals" ) ), makeKeyword( "B" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword( "OTHER" ), makeKeyword( "A" ) ) ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ),
                            makeKeyword( "A" ), makeKeyword( "B" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "A" ),
                                makeKeyword( "B" ), makeKeyword( "C" ) ), makeKeyword( "OTHER" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ),
                                    makeKeyword( "A" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword( "OTHER" ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "B" ), makeKeyword( "C" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                            "numericallyEquals" ) ), makeKeyword( "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ),
                                                makeKeyword( "C" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "B" ), ConsesLow.list(
                                                    constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword( "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                        makeString( "TimesFn" ) ), makeKeyword( "A" ), makeKeyword( "C" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                            "numericallyEquals" ) ), makeKeyword( "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "A" ),
                                                                makeKeyword( "B" ), makeKeyword( "C" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword(
                                                                    "C" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword( "OTHER" ), ConsesLow.list(
                                                                        constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ) ) ), ConsesLow.list(
                                                                            constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "OTHER" ), ConsesLow.list( constant_handles
                                                                                .reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ), makeKeyword( "C" ) ) ) ) ) );
    $sym38$EQUATION_PERMUTATIONS_FROM_DIVISION = makeSymbol( "EQUATION-PERMUTATIONS-FROM-DIVISION" );
    $list39 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ), makeKeyword( "OTHER" ) ),
        ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "A" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "TimesFn" ) ), makeKeyword( "B" ), makeKeyword( "OTHER" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "B" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword( "A" ), makeKeyword( "OTHER" ) ) ) ) ) );
    $sym40$EQUATION_IMMEDIATE_PERMUTATIONS = makeSymbol( "EQUATION-IMMEDIATE-PERMUTATIONS" );
    $list41 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "PlusFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ), makeKeyword( "OTHER" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ),
            makeKeyword( "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "A" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeKeyword( "OTHER" ),
                    makeKeyword( "B" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "B" ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeKeyword( "OTHER" ), makeKeyword( "A" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "numericallyEquals" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeKeyword( "A" ), makeKeyword(
                                "B" ) ), makeKeyword( "OTHER" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "OTHER" ), ConsesLow
                                    .list( constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ) ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "A" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ),
                                            makeKeyword( "B" ), makeKeyword( "OTHER" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "B" ), ConsesLow
                                                .list( constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeKeyword( "A" ), makeKeyword( "OTHER" ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                        makeString( "TimesFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ), makeKeyword( "OTHER" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                            .reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                makeString( "TimesFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                    "numericallyEquals" ) ), makeKeyword( "A" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword(
                                                                        "OTHER" ), makeKeyword( "B" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword(
                                                                            "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ) ),
                                                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "B" ), ConsesLow.list( constant_handles
                                                                .reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword( "OTHER" ), makeKeyword( "A" ) ) ), ConsesLow.list( constant_handles
                                                                    .reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "OTHER" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                        makeString( "TimesFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                            .reader_make_constant_shell( makeString( "numericallyEquals" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                "QuotientFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ), makeKeyword( "OTHER" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                    .reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "OTHER" ), ConsesLow.list( constant_handles
                                                                                        .reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword( "A" ), makeKeyword( "B" ) ) ), ConsesLow.list(
                                                                                            constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "A" ), ConsesLow.list(
                                                                                                constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "B" ), makeKeyword( "OTHER" ) ) ),
                                                                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "B" ), ConsesLow.list(
                                                                                        constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword( "A" ), makeKeyword( "OTHER" ) ) ) ) ) );
    $sym42$EQUATION_CANONICAL_PERMUTATIONS = makeSymbol( "EQUATION-CANONICAL-PERMUTATIONS" );
    $kw43$FULL = makeKeyword( "FULL" );
    $list44 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "ElectricalResistance" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), ConsesLow
            .list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell(
                makeString( "Length" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "BulkResistance" ) ) ) ), ConsesLow
                    .list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "Area" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "numericallyEquals" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell(
                            makeString( "Length" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                "TimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "ElectricalResistance" ) ) ),
                                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "Area" ) ) ) ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "BulkResistance" ) ) ) ) ), ConsesLow.list(
                                        constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "The" ) ),
                                            constant_handles.reader_make_constant_shell( makeString( "ElectricalResistance" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "QuotientFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                    makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "Length" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                        "The" ) ), constant_handles.reader_make_constant_shell( makeString( "BulkResistance" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                            makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "Area" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                makeString( "numericallyEquals" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles
                                                                    .reader_make_constant_shell( makeString( "Area" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ),
                                                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                            makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "Length" ) ) ), ConsesLow.list( constant_handles
                                                                                .reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "BulkResistance" ) ) ) ),
                                                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                            "ElectricalResistance" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), ConsesLow
                                                                                .list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                    "BulkResistance" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), ConsesLow.list(
                                                                                        constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                            makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "ElectricalResistance" ) ) ), ConsesLow.list(
                                                                                                constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                    "Area" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles
                                                                                                        .reader_make_constant_shell( makeString( "Length" ) ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                            constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), ConsesLow.list(
                                                                                                                constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "PRESSURE" ),
                                                                                                                makeKeyword( "VOLUME" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                    "TimesFn" ) ), makeKeyword( "MOLARITY" ), makeKeyword( "R" ), makeKeyword( "TEMPERATURE" ) ) ) ),
                                                                                                            ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                "numericallyEquals" ) ), makeKeyword( "MOLARITY" ), ConsesLow.list( constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "QuotientFn" ) ), ConsesLow.list( constant_handles
                                                                                                                        .reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "PRESSURE" ), makeKeyword(
                                                                                                                            "VOLUME" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                "TimesFn" ) ), makeKeyword( "R" ), makeKeyword( "TEMPERATURE" ) ) ) ), ConsesLow.list(
                                                                                                                                    constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ),
                                                                                                                                    makeKeyword( "PRESSURE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                        makeString( "QuotientFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                            .reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword(
                                                                                                                                                "MOLARITY" ), makeKeyword( "R" ), makeKeyword( "TEMPERATURE" ) ),
                                                                                                                                        makeKeyword( "VOLUME" ) ) ), ConsesLow.list( constant_handles
                                                                                                                                            .reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword(
                                                                                                                                                "R" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                    makeString( "QuotientFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                        .reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword(
                                                                                                                                                            "PRESSURE" ), makeKeyword( "VOLUME" ) ), ConsesLow.list(
                                                                                                                                                                constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                    "TimesFn" ) ), makeKeyword( "MOLARITY" ), makeKeyword(
                                                                                                                                                                        "TEMPERATURE" ) ) ) ), ConsesLow.list(
                                                                                                                                                                            constant_handles.reader_make_constant_shell(
                                                                                                                                                                                makeString( "numericallyEquals" ) ),
                                                                                                                                                                            makeKeyword( "TEMPERATURE" ), ConsesLow.list(
                                                                                                                                                                                constant_handles.reader_make_constant_shell(
                                                                                                                                                                                    makeString( "QuotientFn" ) ), ConsesLow
                                                                                                                                                                                        .list( constant_handles
                                                                                                                                                                                            .reader_make_constant_shell(
                                                                                                                                                                                                makeString( "TimesFn" ) ),
                                                                                                                                                                                            makeKeyword( "PRESSURE" ),
                                                                                                                                                                                            makeKeyword( "VOLUME" ) ),
                                                                                                                                                                                ConsesLow.list( constant_handles
                                                                                                                                                                                    .reader_make_constant_shell( makeString(
                                                                                                                                                                                        "TimesFn" ) ), makeKeyword(
                                                                                                                                                                                            "MOLARITY" ), makeKeyword(
                                                                                                                                                                                                "R" ) ) ) ), ConsesLow.list(
                                                                                                                                                                                                    constant_handles
                                                                                                                                                                                                        .reader_make_constant_shell(
                                                                                                                                                                                                            makeString(
                                                                                                                                                                                                                "numericallyEquals" ) ),
                                                                                                                                                                                                    makeKeyword( "VOLUME" ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        constant_handles
                                                                                                                                                                                                            .reader_make_constant_shell(
                                                                                                                                                                                                                makeString(
                                                                                                                                                                                                                    "QuotientFn" ) ),
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            constant_handles
                                                                                                                                                                                                                .reader_make_constant_shell(
                                                                                                                                                                                                                    makeString(
                                                                                                                                                                                                                        "TimesFn" ) ),
                                                                                                                                                                                                            makeKeyword(
                                                                                                                                                                                                                "MOLARITY" ),
                                                                                                                                                                                                            makeKeyword(
                                                                                                                                                                                                                "R" ),
                                                                                                                                                                                                            makeKeyword(
                                                                                                                                                                                                                "TEMPERATURE" ) ),
                                                                                                                                                                                                        makeKeyword(
                                                                                                                                                                                                            "PRESSURE" ) ) ) ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "BILL-PLUS-TIP" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "PlusFn" ) ), makeKeyword( "BILL-ABOUT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "BILL-ABOUT" ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), makeKeyword( "TIP-PERCENT" ), makeInteger( 100 ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword( "BILL-PLUS-TIP" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), makeKeyword(
                        "BILL-ABOUT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ),
                            makeKeyword( "BILL-ABOUT" ), makeKeyword( "TIP-PERCENT" ) ), makeInteger( 100 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ),
                                makeKeyword( "BILL-PLUS-TIP" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), makeKeyword( "BILL-ABOUT" ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "TimesFn" ) ), makeKeyword( "BILL-ABOUT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ),
                                        makeKeyword( "TIP-PERCENT" ), makeInteger( 100 ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ), makeKeyword(
                                            "TIP-PERCENT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                makeString( "TimesFn" ) ), makeInteger( 100 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) ), makeKeyword( "BILL-PLUS-TIP" ),
                                                    makeKeyword( "BILL-ABOUT" ) ) ), makeKeyword( "BILL-ABOUT" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numericallyEquals" ) ),
                                                        makeKeyword( "TIP-PERCENT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) ), makeInteger( 100 ), ConsesLow.list(
                                                            constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                "DifferenceFn" ) ), makeKeyword( "BILL-PLUS-TIP" ), makeKeyword( "BILL-ABOUT" ) ), makeKeyword( "BILL-ABOUT" ) ) ) ) ) ) );
  }
}
/*
 * 
 * Total time: 238 ms
 * 
 */