package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_deduction_supports
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_deduction_supports";
  public static final String myFingerPrint = "56ece29b3c5aabe1d774937426208a43dda96b378d3e6d82e992939ae32d2122";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 1851L)
  private static SubLSymbol $default_deduction_supports_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 2175L)
  private static SubLSymbol $average_deduction_support_count$;
  private static final SubLObject $const0$deductionSupports;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLObject $const3$CycDeductionDatastructureFn;
  private static final SubLSymbol $kw4$REMOVAL_DEDUCTIONSUPPORTS;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$OPAQUE;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 833L)
  public static SubLObject deduction_supportP(final SubLObject deduction, final SubLObject support)
  {
    return conses_high.member( support, deductions_high.deduction_supports( deduction ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 998L)
  public static SubLObject find_deduction_from_term(final SubLObject deduction_term)
  {
    SubLObject d_id = NIL;
    SubLObject deduction = NIL;
    if( !cycl_utilities.formula_operator( deduction_term ).eql( $const3$CycDeductionDatastructureFn ) )
    {
      return NIL;
    }
    d_id = cycl_utilities.formula_arg1( deduction_term, UNPROVIDED );
    deduction = deduction_handles.find_deduction_by_id( d_id );
    if( NIL != deduction_handles.deduction_p( deduction ) )
    {
      return deduction;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 1392L)
  public static SubLObject deduction_term_supports(final SubLObject deduction_term)
  {
    SubLObject deduction = NIL;
    SubLObject supports = NIL;
    if( !cycl_utilities.formula_operator( deduction_term ).eql( $const3$CycDeductionDatastructureFn ) )
    {
      return NIL;
    }
    deduction = find_deduction_from_term( deduction_term );
    if( NIL != deduction_handles.deduction_p( deduction ) )
    {
      supports = deductions_high.deduction_supports( deduction );
      return supports;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-deduction-supports.lisp", position = 5797L)
  public static SubLObject removal_deductionsupports_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != variables.fully_bound_p( arg1 ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject supports = cdolist_list_var = deduction_term_supports( arg1 );
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject v_bindings = unification_utilities.term_unify( support, arg2, UNPROVIDED, UNPROVIDED );
        if( NIL != v_bindings )
        {
          backward.removal_add_node( arguments.make_hl_support( $kw6$OPAQUE, bindings.apply_bindings( v_bindings, asent ), UNPROVIDED, UNPROVIDED ), v_bindings, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
    }
    else if( NIL != assertion_handles.assertion_p( arg2 ) )
    {
      SubLObject cdolist_list_var2 = assertions_high.assertion_arguments( arg2 );
      SubLObject argument = NIL;
      argument = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL != deduction_handles.deduction_p( argument ) )
        {
          final SubLObject v_answer = el_utilities.make_unary_formula( $const3$CycDeductionDatastructureFn, deduction_handles.deduction_id( argument ) );
          final SubLObject v_bindings = unification_utilities.term_unify( v_answer, arg1, UNPROVIDED, UNPROVIDED );
          if( NIL != v_bindings )
          {
            backward.removal_add_node( arguments.make_hl_support( $kw6$OPAQUE, bindings.apply_bindings( v_bindings, asent ), UNPROVIDED, UNPROVIDED ), v_bindings, UNPROVIDED );
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        argument = cdolist_list_var2.first();
      }
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_deduction_supports_file()
  {
    SubLFiles.declareFunction( me, "deduction_supportP", "DEDUCTION-SUPPORT?", 2, 0, false );
    SubLFiles.declareFunction( me, "find_deduction_from_term", "FIND-DEDUCTION-FROM-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_term_supports", "DEDUCTION-TERM-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_deductionsupports_expand", "REMOVAL-DEDUCTIONSUPPORTS-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_deduction_supports_file()
  {
    $default_deduction_supports_check_cost$ = SubLFiles.defparameter( "*DEFAULT-DEDUCTION-SUPPORTS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $average_deduction_support_count$ = SubLFiles.deflexical( "*AVERAGE-DEDUCTION-SUPPORT-COUNT*", THREE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_deduction_supports_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$deductionSupports );
    preference_modules.doomed_unless_either_arg_bindable( $kw1$POS, $const0$deductionSupports );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$deductionSupports );
    inference_modules.inference_removal_module( $kw4$REMOVAL_DEDUCTIONSUPPORTS, $list5 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_deduction_supports_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_deduction_supports_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_deduction_supports_file();
  }
  static
  {
    me = new removal_modules_deduction_supports();
    $default_deduction_supports_check_cost$ = null;
    $average_deduction_support_count$ = null;
    $const0$deductionSupports = constant_handles.reader_make_constant_shell( makeString( "deductionSupports" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $const3$CycDeductionDatastructureFn = constant_handles.reader_make_constant_shell( makeString( "CycDeductionDatastructureFn" ) );
    $kw4$REMOVAL_DEDUCTIONSUPPORTS = makeKeyword( "REMOVAL-DEDUCTIONSUPPORTS" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "deductionSupports" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "deductionSupports" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword(
            "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "deductionSupports" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*AVERAGE-DEDUCTION-SUPPORT-COUNT*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-DEDUCTIONSUPPORTS-EXPAND" ), makeKeyword(
          "DOCUMENTATION" ), makeString( "(#$deductionSupports <fully-bound-p> <anything>) or (#$deductionSupports <anything> <fully-bound-p>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$deductionSupports \n      (#$CycDeductionDatastructureFn 408468)\n      ?SUPPORT)" )
    } );
    $kw6$OPAQUE = makeKeyword( "OPAQUE" );
  }
}
/*
 * 
 * Total time: 77 ms
 * 
 */