/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/
package com.cyc.cycjava_1.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;

//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_termofunit;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.variables;

public final class removal_modules_natfunction
    extends
      SubLTranslatedFile
{
  //// Constructor
  private removal_modules_natfunction()
  {}
  public static final SubLFile me = new removal_modules_natfunction();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_natfunction";
  //// Definitions
  /** Temporary -- remove after natArgumentsEqual cleanup is complete. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 572)
  private static SubLSymbol $nat_arguments_equal_enabled$ = null;
  @SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 1164)
  private static SubLSymbol $default_nat_function_check_cost$ = null;
  @SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 2721)
  private static SubLSymbol $nat_function_code_rule$ = null;
  @SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 6746)
  private static SubLSymbol $default_nat_argument_check_cost$ = null;
  @SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 8310)
  private static SubLSymbol $nat_argument_code_rule$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 11849)
  public static final SubLObject removal_nat_argument_lookup_cost(SubLObject asent, SubLObject sense)
  {
    if( ( sense == UNPROVIDED ) )
    {
      sense = NIL;
    }
    {
      SubLObject fort = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
      SubLObject argnum = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
      SubLObject functionP = fort_types_interface.functionP( fort );
      if( ( NIL != variables.variable_p( argnum ) ) )
      {
        if( ( NIL != functionP ) )
        {
          return Numbers.add( kb_indexing.num_nart_arg_index( fort, UNPROVIDED, UNPROVIDED ), Errors.handleMissingMethodError(
              "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12781" ) );
        }
        else
        {
          return kb_indexing.num_nart_arg_index( fort, UNPROVIDED, UNPROVIDED );
        }
      }
      else if( argnum.isZero() )
      {
        if( ( NIL != functionP ) )
        {
          return kb_indexing.num_nart_arg_index( fort, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          return ZERO_INTEGER;
        }
      }
      else
      {
        return kb_indexing.num_nart_arg_index( fort, argnum, UNPROVIDED );
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 12503)
  public static final SubLObject removal_nat_argument_lookup_expand(SubLObject asent, SubLObject sense)
  {
    if( ( sense == UNPROVIDED ) )
    {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject fort = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
        SubLObject argnum = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
        SubLObject functionP = fort_types_interface.functionP( fort );
        {
          SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding( thread );
          try
          {
            control_vars.$inference_literal$.bind( asent, thread );
            if( ( NIL != functionP ) )
            {
              if( ( ( NIL != variables.variable_p( argnum ) ) || argnum.isZero() ) )
              {
                Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9450" );
              }
            }
            if( ( NIL != variables.variable_p( argnum ) ) )
            {
              kb_mapping.map_nart_arg_index( Symbols.symbol_function( $sym25$REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL ), fort, UNPROVIDED, UNPROVIDED );
            }
            else
            {
              if( argnum.isPositive() )
              {
                kb_mapping.map_nart_arg_index( Symbols.symbol_function( $sym25$REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL ), fort, argnum, UNPROVIDED );
              }
            }
          }
          finally
          {
            control_vars.$inference_literal$.rebind( _prev_bind_0, thread );
          }
        }
      }
      return NIL;
    }
  }
  @SubL(source = "cycl/inference/modules/removal/removal-modules-natfunction.lisp", position = 16580)
  private static SubLSymbol $nat_arguments_equal_code_rule$ = null;

  public static final SubLObject declare_removal_modules_natfunction_file()
  {
    declareFunction( myName, "removal_nat_function_check_pos_cost", "REMOVAL-NAT-FUNCTION-CHECK-POS-COST", 1, 1, false );
    declareFunction( myName, "removal_nat_function_check_pos_expand", "REMOVAL-NAT-FUNCTION-CHECK-POS-EXPAND", 1, 1, false );
    declareFunction( myName, "additional_nat_function_supports", "ADDITIONAL-NAT-FUNCTION-SUPPORTS", 0, 0, false );
    declareFunction( myName, "nat_function_hl_support", "NAT-FUNCTION-HL-SUPPORT", 0, 0, false );
    declareFunction( myName, "removal_nat_function_unify_cost", "REMOVAL-NAT-FUNCTION-UNIFY-COST", 1, 1, false );
    declareFunction( myName, "removal_nat_function_unify_expand", "REMOVAL-NAT-FUNCTION-UNIFY-EXPAND", 1, 1, false );
    declareFunction( myName, "removal_nat_function_lookup_cost", "REMOVAL-NAT-FUNCTION-LOOKUP-COST", 1, 1, false );
    declareFunction( myName, "removal_nat_function_lookup_expand", "REMOVAL-NAT-FUNCTION-LOOKUP-EXPAND", 1, 1, false );
    declareFunction( myName, "removal_nat_function_lookup_internal", "REMOVAL-NAT-FUNCTION-LOOKUP-INTERNAL", 1, 0, false );
    declareFunction( myName, "removal_nat_argument_check_pos_required", "REMOVAL-NAT-ARGUMENT-CHECK-POS-REQUIRED", 1, 1, false );
    declareFunction( myName, "removal_nat_argument_check_pos_cost", "REMOVAL-NAT-ARGUMENT-CHECK-POS-COST", 1, 1, false );
    declareFunction( myName, "removal_nat_argument_check_pos_expand", "REMOVAL-NAT-ARGUMENT-CHECK-POS-EXPAND", 1, 1, false );
    declareFunction( myName, "additional_nat_argument_supports", "ADDITIONAL-NAT-ARGUMENT-SUPPORTS", 0, 0, false );
    declareFunction( myName, "nat_argument_hl_support", "NAT-ARGUMENT-HL-SUPPORT", 0, 0, false );
    declareFunction( myName, "removal_nat_argument_term_unify_required", "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-REQUIRED", 1, 1, false );
    declareFunction( myName, "removal_nat_argument_term_unify_cost", "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-COST", 1, 1, false );
    declareFunction( myName, "removal_nat_argument_term_unify_expand", "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-EXPAND", 1, 1, false );
    declareFunction( myName, "removal_nat_argument_arg_unify_cost", "REMOVAL-NAT-ARGUMENT-ARG-UNIFY-COST", 1, 1, false );
    declareFunction( myName, "removal_nat_argument_arg_unify_expand", "REMOVAL-NAT-ARGUMENT-ARG-UNIFY-EXPAND", 1, 1, false );
    declareFunction( myName, "removal_nat_argument_lookup_cost", "REMOVAL-NAT-ARGUMENT-LOOKUP-COST", 1, 1, false );
    declareFunction( myName, "removal_nat_argument_lookup_expand", "REMOVAL-NAT-ARGUMENT-LOOKUP-EXPAND", 1, 1, false );
    declareFunction( myName, "removal_nat_argument_lookup_internal", "REMOVAL-NAT-ARGUMENT-LOOKUP-INTERNAL", 1, 0, false );
    declareFunction( myName, "removal_nat_arguments_equal_check_pos_required", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-REQUIRED", 1, 1, false );
    declareFunction( myName, "removal_nat_arguments_equal_check_pos_cost", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-COST", 1, 1, false );
    declareFunction( myName, "removal_nat_arguments_equal_check_pos_expand", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-EXPAND", 1, 1, false );
    declareFunction( myName, "removal_nat_arguments_equal_check_cost", "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-COST", 1, 0, false );
    declareFunction( myName, "nat_arguments_equal_hl_support", "NAT-ARGUMENTS-EQUAL-HL-SUPPORT", 0, 0, false );
    declareFunction( myName, "removal_nat_function_nat_argument_applicability", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-APPLICABILITY", 1, 0, false );
    declareFunction( myName, "removal_nat_func_asents_with_not_fully_bound_arg1_dict_internal", "REMOVAL-NAT-FUNC-ASENTS-WITH-NOT-FULLY-BOUND-ARG1-DICT-INTERNAL", 1, 0, false );
    declareFunction( myName, "removal_nat_func_asents_with_not_fully_bound_arg1_dict", "REMOVAL-NAT-FUNC-ASENTS-WITH-NOT-FULLY-BOUND-ARG1-DICT", 1, 0, false );
    declareFunction( myName, "removal_nat_function_contextualized_asent_p_internal", "REMOVAL-NAT-FUNCTION-CONTEXTUALIZED-ASENT-P-INTERNAL", 1, 0, false );
    declareFunction( myName, "removal_nat_function_contextualized_asent_p", "REMOVAL-NAT-FUNCTION-CONTEXTUALIZED-ASENT-P", 1, 0, false );
    declareFunction( myName, "removal_nat_argument_contextualized_asent_p_internal", "REMOVAL-NAT-ARGUMENT-CONTEXTUALIZED-ASENT-P-INTERNAL", 1, 0, false );
    declareFunction( myName, "removal_nat_argument_contextualized_asent_p", "REMOVAL-NAT-ARGUMENT-CONTEXTUALIZED-ASENT-P", 1, 0, false );
    declareFunction( myName, "removal_nat_function_nat_argument_cost", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-COST", 1, 0, false );
    declareFunction( myName, "removal_nat_function_nat_argument_expand", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-EXPAND", 1, 0, false );
    declareFunction( myName, "removal_nat_function_nat_argument_supports", "REMOVAL-NAT-FUNCTION-NAT-ARGUMENT-SUPPORTS", 1, 0, false );
    return NIL;
  }

  public static final SubLObject init_removal_modules_natfunction_file()
  {
    $nat_arguments_equal_enabled$ = deflexical( "*NAT-ARGUMENTS-EQUAL-ENABLED*", NIL );
    $default_nat_function_check_cost$ = deflexical( "*DEFAULT-NAT-FUNCTION-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $nat_function_code_rule$ = defparameter( "*NAT-FUNCTION-CODE-RULE*", $list5 );
    $default_nat_argument_check_cost$ = deflexical( "*DEFAULT-NAT-ARGUMENT-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $nat_argument_code_rule$ = defparameter( "*NAT-ARGUMENT-CODE-RULE*", $list19 );
    $nat_arguments_equal_code_rule$ = defparameter( "*NAT-ARGUMENTS-EQUAL-CODE-RULE*", $list31 );
    return NIL;
  }

  public static final SubLObject setup_removal_modules_natfunction_file()
  {
        // builder ");
    inference_modules.register_solely_specific_removal_module_predicate( $const0$natFunction );
    preference_modules.inference_preference_module( $kw1$NAT_FUNCTION_LOOKUP_POS, $list2 );
    inference_modules.inference_removal_module( $kw3$REMOVAL_NAT_FUNCTION_CHECK_POS, $list4 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_NAT_FUNCTION_UNIFY, $list10 );
    inference_modules.inference_removal_module( $kw12$REMOVAL_NAT_FUNCTION_LOOKUP, $list13 );
    inference_modules.register_solely_specific_removal_module_predicate( $const14$natArgument );
    preference_modules.inference_preference_module( $kw15$NAT_ARGUMENT_LOOKUP_POS, $list16 );
    inference_modules.inference_removal_module( $kw17$REMOVAL_NAT_ARGUMENT_CHECK_POS, $list18 );
    inference_modules.inference_removal_module( $kw20$REMOVAL_NAT_ARGUMENT_TERM_UNIFY, $list21 );
    inference_modules.inference_removal_module( $kw23$REMOVAL_NAT_ARGUMENT_ARG_UNIFY, $list24 );
    inference_modules.inference_removal_module( $kw26$REMOVAL_NAT_ARGUMENT_LOOKUP, $list27 );
    inference_modules.register_solely_specific_removal_module_predicate( $const28$natArgumentsEqual );
    inference_modules.inference_removal_module( $kw29$REMOVAL_NAT_ARGUMENTS_EQUAL_CHECK_POS, $list30 );
    memoization_state.note_memoized_function( $sym34$REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT );
    memoization_state.note_memoized_function( $sym37$REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P );
    memoization_state.note_memoized_function( $sym40$REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P );
    return NIL;
  }
  //// Internal Constants
  public static final SubLObject $const0$natFunction = constant_handles.reader_make_constant_shell( makeString( "natFunction" ) );
  public static final SubLSymbol $kw1$NAT_FUNCTION_LOOKUP_POS = makeKeyword( "NAT-FUNCTION-LOOKUP-POS" );
  public static final SubLList $list2 = list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "natFunction" ) ), makeKeyword(
      "REQUIRED-PATTERN" ), list( constant_handles.reader_make_constant_shell( makeString( "natFunction" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ),
      makeKeyword( "GROSSLY-DISPREFERRED" ) );
  public static final SubLSymbol $kw3$REMOVAL_NAT_FUNCTION_CHECK_POS = makeKeyword( "REMOVAL-NAT-FUNCTION-CHECK-POS" );
  public static final SubLList $list4 = list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "natFunction" ) ),
    makeKeyword( "REQUIRED-PATTERN" ), list( constant_handles.reader_make_constant_shell( makeString( "natFunction" ) ), makeKeyword( "NART" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol(
        "REMOVAL-NAT-FUNCTION-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NAT-FUNCTION-CHECK-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
    makeString( "(#$natFunction <reified NAT> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$natFunction (#$JuvenileFn #$Dog) #$JuvenileFn)" )
  } );
  public static final SubLList $list5 = list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), list( constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) ), makeSymbol( "?NAT" ),
      cons( makeSymbol( "?FUNCTION" ), makeSymbol( "?ARGS" ) ) ), list( constant_handles.reader_make_constant_shell( makeString( "natFunction" ) ), makeSymbol( "?NAT" ), makeSymbol( "?FUNCTION" ) ) );
  public static final SubLSymbol $kw6$CODE = makeKeyword( "CODE" );
  public static final SubLSymbol $kw7$TRUE_MON = makeKeyword( "TRUE-MON" );
  public static final SubLObject $const8$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
  public static final SubLSymbol $kw9$REMOVAL_NAT_FUNCTION_UNIFY = makeKeyword( "REMOVAL-NAT-FUNCTION-UNIFY" );
  public static final SubLList $list10 = list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "natFunction" ) ),
    makeKeyword( "REQUIRED-PATTERN" ), list( constant_handles.reader_make_constant_shell( makeString( "natFunction" ) ), makeKeyword( "NART" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol(
        "REMOVAL-NAT-FUNCTION-UNIFY-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NAT-FUNCTION-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
    makeString( "(#$natFunction <reified NAT> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$natFunction (#$JuvenileFn #$Dog) ?WHAT)" )
  } );
  public static final SubLSymbol $sym11$REMOVAL_NAT_FUNCTION_LOOKUP_INTERNAL = makeSymbol( "REMOVAL-NAT-FUNCTION-LOOKUP-INTERNAL" );
  public static final SubLSymbol $kw12$REMOVAL_NAT_FUNCTION_LOOKUP = makeKeyword( "REMOVAL-NAT-FUNCTION-LOOKUP" );
  public static final SubLList $list13 = list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "natFunction" ) ),
    makeKeyword( "REQUIRED-PATTERN" ), list( constant_handles.reader_make_constant_shell( makeString( "natFunction" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
        "REMOVAL-NAT-FUNCTION-LOOKUP-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NAT-FUNCTION-LOOKUP-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
    makeString( "(#$natFunction <not fully-bound> <fort>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$natFunction ?NAT #$JuvenileFn)" )
  } );
  public static final SubLObject $const14$natArgument = constant_handles.reader_make_constant_shell( makeString( "natArgument" ) );
  public static final SubLSymbol $kw15$NAT_ARGUMENT_LOOKUP_POS = makeKeyword( "NAT-ARGUMENT-LOOKUP-POS" );
  public static final SubLList $list16 = list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "natArgument" ) ), makeKeyword(
      "REQUIRED-PATTERN" ), list( constant_handles.reader_make_constant_shell( makeString( "natArgument" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
          "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
  public static final SubLSymbol $kw17$REMOVAL_NAT_ARGUMENT_CHECK_POS = makeKeyword( "REMOVAL-NAT-ARGUMENT-CHECK-POS" );
  public static final SubLList $list18 = list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "natArgument" ) ),
    makeKeyword( "REQUIRED-PATTERN" ), list( constant_handles.reader_make_constant_shell( makeString( "natArgument" ) ), makeKeyword( "NART" ), makeKeyword( "INTEGER" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
        "REQUIRED" ), makeSymbol( "REMOVAL-NAT-ARGUMENT-CHECK-POS-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NAT-ARGUMENT-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
    makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NAT-ARGUMENT-CHECK-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$natArgument <reified NAT> <non-negative integer> <fully bound>)" ), makeKeyword(
        "EXAMPLE" ), makeString( "(#$natArgument (#$JuvenileFn #$Dog) 1 #$Dog)" )
  } );
  public static final SubLList $list19 = list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), list( constant_handles
      .reader_make_constant_shell( makeString( "termOfUnit" ) ), makeSymbol( "?NAT" ), makeSymbol( "?FORMULA" ) ), list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol( "?TERM" ),
          list( constant_handles.reader_make_constant_shell( makeString( "FormulaArgFn" ) ), makeSymbol( "?ARG" ), makeSymbol( "?FORMULA" ) ) ) ), list( constant_handles.reader_make_constant_shell( makeString(
              "natArgument" ) ), makeSymbol( "?NAT" ), makeSymbol( "?ARG" ), makeSymbol( "?TERM" ) ) );
  public static final SubLSymbol $kw20$REMOVAL_NAT_ARGUMENT_TERM_UNIFY = makeKeyword( "REMOVAL-NAT-ARGUMENT-TERM-UNIFY" );
  public static final SubLList $list21 = list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "natArgument" ) ),
    makeKeyword( "REQUIRED-PATTERN" ), list( constant_handles.reader_make_constant_shell( makeString( "natArgument" ) ), makeKeyword( "NART" ), makeKeyword( "INTEGER" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
        "REQUIRED" ), makeSymbol( "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
    makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NAT-ARGUMENT-TERM-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$natArgument <reified NAT> <non-negative integer> <not fully-bound>)" ), makeKeyword(
        "EXAMPLE" ), makeString( "(#$natArgument (#$JuvenileFn #$Dog) 1 ?WHAT)" )
  } );
  public static final SubLSymbol $kw22$IGNORE = makeKeyword( "IGNORE" );
  public static final SubLSymbol $kw23$REMOVAL_NAT_ARGUMENT_ARG_UNIFY = makeKeyword( "REMOVAL-NAT-ARGUMENT-ARG-UNIFY" );
  public static final SubLList $list24 = list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "natArgument" ) ),
    makeKeyword( "REQUIRED-PATTERN" ), list( constant_handles.reader_make_constant_shell( makeString( "natArgument" ) ), makeKeyword( "NART" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
        "COST" ), makeSymbol( "REMOVAL-NAT-ARGUMENT-ARG-UNIFY-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NAT-ARGUMENT-ARG-UNIFY-EXPAND" ),
    makeKeyword( "DOCUMENTATION" ), makeString( "(#$natArgument <reified NAT> <not fully-bound> <anything>)" ), makeKeyword( "EXAMPLE" ), makeString(
        "(#$natArgument (#$JuvenileFn #$Dog) ?ARG ?WHAT)\n    (#$natArgument (#$JuvenileFn #$Dog) ?ARG #$Dog)" )
  } );
  public static final SubLSymbol $sym25$REMOVAL_NAT_ARGUMENT_LOOKUP_INTERNAL = makeSymbol( "REMOVAL-NAT-ARGUMENT-LOOKUP-INTERNAL" );
  public static final SubLSymbol $kw26$REMOVAL_NAT_ARGUMENT_LOOKUP = makeKeyword( "REMOVAL-NAT-ARGUMENT-LOOKUP" );
  public static final SubLList $list27 = list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "natArgument" ) ),
    makeKeyword( "REQUIRED-PATTERN" ), list( constant_handles.reader_make_constant_shell( makeString( "natArgument" ) ), makeKeyword( "NOT-FULLY-BOUND" ), list( makeKeyword( "OR" ), list( makeKeyword( "TEST" ),
        makeSymbol( "NON-NEGATIVE-INTEGER-P" ) ), makeKeyword( "VARIABLE" ) ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NAT-ARGUMENT-LOOKUP-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
            "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NAT-ARGUMENT-LOOKUP-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$natArgument <not fully-bound> <variable> <fort>)\n    (#$natArgument <not fully-bound> <integer>  <fort>)" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$natArgument ?NAT 1    #$Dog)\n    (#$natArgument ?NAT ?ARG #$Dog)" )
  } );
  public static final SubLObject $const28$natArgumentsEqual = constant_handles.reader_make_constant_shell( makeString( "natArgumentsEqual" ) );
  public static final SubLSymbol $kw29$REMOVAL_NAT_ARGUMENTS_EQUAL_CHECK_POS = makeKeyword( "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS" );
  public static final SubLList $list30 = list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
      "natArgumentsEqual" ) ), makeKeyword( "REQUIRED-PATTERN" ), list( constant_handles.reader_make_constant_shell( makeString( "natArgumentsEqual" ) ), makeKeyword( "NART" ), makeKeyword( "NART" ) ), makeKeyword(
          "REQUIRED" ), makeSymbol( "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NAT-ARGUMENTS-EQUAL-CHECK-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$natArgumentsEqual <reified NAT> <reified NAT>)" ),
    makeKeyword( "EXAMPLE" ), makeString( "(#$natArgumentsEqual (#$LeftFn #$Leg) (#$RightFn #$Leg))" )
  } );
  public static final SubLList $list31 = list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), list( constant_handles
      .reader_make_constant_shell( makeString( "termOfUnit" ) ), makeSymbol( "?NAT1" ), makeSymbol( "?FORMULA1" ) ), list( constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) ), makeSymbol( "?NAT2" ),
          makeSymbol( "?FORMULA2" ) ), list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol( "?ARGS-LIST" ), list( constant_handles.reader_make_constant_shell( makeString(
              "FormulaArgListFn" ) ), makeSymbol( "?FORMULA1" ) ) ), list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol( "?ARGS-LIST" ), list( constant_handles
                  .reader_make_constant_shell( makeString( "FormulaArgListFn" ) ), makeSymbol( "?FORMULA2" ) ) ) ), list( constant_handles.reader_make_constant_shell( makeString( "natArgumentsEqual" ) ), makeSymbol(
                      "?NAT1" ), makeSymbol( "?NAT2" ) ) );
  public static final SubLList $list32 = list( makeSymbol( "MT" ), makeSymbol( "NAT-ARG-ASENT" ) );
  public static final SubLSymbol $sym33$_ = makeSymbol( "=" );
  public static final SubLSymbol $sym34$REMOVAL_NAT_FUNC_ASENTS_WITH_NOT_FULLY_BOUND_ARG1_DICT = makeSymbol( "REMOVAL-NAT-FUNC-ASENTS-WITH-NOT-FULLY-BOUND-ARG1-DICT" );
  public static final SubLList $list35 = list( makeSymbol( "MT" ), makeSymbol( "NAT-FUN-ASENT" ) );
  public static final SubLSymbol $kw36$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword( "&MEMOIZED-ITEM-NOT-FOUND&" );
  public static final SubLSymbol $sym37$REMOVAL_NAT_FUNCTION_CONTEXTUALIZED_ASENT_P = makeSymbol( "REMOVAL-NAT-FUNCTION-CONTEXTUALIZED-ASENT-P" );
  public static final SubLList $list38 = list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
  public static final SubLObject $const39$ReifiableFunction = constant_handles.reader_make_constant_shell( makeString( "ReifiableFunction" ) );
  public static final SubLSymbol $sym40$REMOVAL_NAT_ARGUMENT_CONTEXTUALIZED_ASENT_P = makeSymbol( "REMOVAL-NAT-ARGUMENT-CONTEXTUALIZED-ASENT-P" );
  public static final SubLList $list41 = list( makeSymbol( "FUNC-MT" ), makeSymbol( "FUNC-ASENT" ) );
  public static final SubLList $list42 = list( makeSymbol( "ARG-MT" ), makeSymbol( "ARG-ASENT" ) );

  //// Initializers
  @Override
  public void declareFunctions()
  {
    declare_removal_modules_natfunction_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_natfunction_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_natfunction_file();
  }
}
