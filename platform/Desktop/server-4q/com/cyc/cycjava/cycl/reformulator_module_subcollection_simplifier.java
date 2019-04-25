package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_subcollection_simplifier
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_subcollection_simplifier";
  public static final String myFingerPrint = "eef50d7f6683594af6a00ce10fad7d6fe81297faa6acd0caef6a76e31338ed39";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 1459L)
  private static SubLSymbol $subcol_simp_microseconds$;
  private static final SubLObject $const0$SubcollectionSimplifierRLModule;
  private static final SubLList $list1;
  private static final SubLInteger $int2$212;
  private static final SubLSymbol $sym3$SUBCOL_SIMP_COST_ESTIMATE;
  private static final SubLObject $const4$CollectionSubsetFn;
  private static final SubLObject $const5$TheSetOf;
  private static final SubLObject $const6$ReformulatorMode_Simplify;
  private static final SubLSymbol $sym7$SUBCOL_SIMP_REQUIRED;
  private static final SubLSymbol $sym8$SUBCOL_SIMP_REFORMULATE;
  private static final SubLSymbol $sym9$ISA_LIT_;
  private static final SubLObject $const10$isa;
  private static final SubLObject $const11$CollectionIntersection2Fn;
  private static final SubLObject $const12$CollectionIntersectionFn;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 1512L)
  public static SubLObject subcol_simp_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    return $subcol_simp_microseconds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 1860L)
  public static SubLObject subcol_simp_required(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    if( NIL != el_utilities.el_formula_with_operator_p( expression, $const4$CollectionSubsetFn ) && NIL != el_utilities.el_formula_with_operator_p( cycl_utilities.nat_arg2( expression, UNPROVIDED ), $const5$TheSetOf )
        && NIL != list_utilities.member_eqP( $const6$ReformulatorMode_Simplify, reformulator_datastructures.get_reformulator_modes( settings, mt ) ) )
    {
      return subcol_simp_reformulate_int( expression, mt, settings, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 2350L)
  public static SubLObject subcol_simp_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings)
  {
    return subcol_simp_reformulate_int( expression, mt, settings, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 2620L)
  public static SubLObject subcol_simp_reformulate_int(SubLObject expression, final SubLObject mt, final SubLObject settings, final SubLObject do_itP)
  {
    SubLObject successP = NIL;
    final SubLObject base_col = cycl_utilities.nat_arg1( expression, UNPROVIDED );
    final SubLObject cols = extract_relevant_cols_from_base_col( base_col );
    if( NIL != cols )
    {
      if( NIL != do_itP )
      {
        expression = el_utilities.copy_expression( expression );
      }
      final SubLObject the_set_of_expr = cycl_utilities.nat_arg2( expression, UNPROVIDED );
      if( NIL != el_utilities.el_formula_with_operator_p( the_set_of_expr, $const5$TheSetOf ) )
      {
        final SubLObject var = cycl_utilities.nat_arg1( the_set_of_expr, UNPROVIDED );
        SubLObject set_cons;
        SubLObject set_expr;
        for( set_cons = conses_high.cddr( the_set_of_expr ), set_expr = cycl_utilities.nat_arg2( the_set_of_expr, UNPROVIDED ); NIL != el_utilities.el_existential_p( set_expr ); set_expr = cycl_utilities.formula_arg2(
            set_expr, UNPROVIDED ), set_cons = conses_high.cdar( set_cons ).rest() )
        {
        }
        if( NIL != el_utilities.el_conjunction_p( set_expr ) )
        {
          final SubLObject conjuncts = cycl_utilities.formula_args( set_expr, UNPROVIDED );
          if( NIL != Sequences.find_if( $sym9$ISA_LIT_, conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject new_conjuncts = NIL;
            SubLObject cdolist_list_var = conjuncts;
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == el_utilities.el_formula_with_operator_p( conjunct, $const10$isa ) || !var.eql( cycl_utilities.formula_arg1( conjunct, UNPROVIDED ) ) || NIL == list_utilities.member_eqP( cycl_utilities
                  .formula_arg2( conjunct, UNPROVIDED ), cols ) )
              {
                new_conjuncts = ConsesLow.cons( conjunct, new_conjuncts );
              }
              cdolist_list_var = cdolist_list_var.rest();
              conjunct = cdolist_list_var.first();
            }
            new_conjuncts = Sequences.nreverse( new_conjuncts );
            if( !conjuncts.equal( new_conjuncts ) )
            {
              successP = T;
              if( NIL != new_conjuncts && NIL != do_itP )
              {
                final SubLObject new_conjunction = simplifier.simplify_cycl_conjunction( simplifier.conjoin( new_conjuncts, T ), UNPROVIDED );
                ConsesLow.rplaca( set_cons, new_conjunction );
              }
            }
          }
        }
      }
    }
    if( NIL != do_itP )
    {
      return Values.values( expression, successP );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 4341L)
  public static SubLObject extract_relevant_cols_from_base_col(final SubLObject base_col)
  {
    if( NIL != forts.fort_p( base_col ) )
    {
      return ConsesLow.list( base_col );
    }
    if( NIL != el_utilities.el_formula_with_operator_p( base_col, $const11$CollectionIntersection2Fn ) )
    {
      return cycl_utilities.formula_args( base_col, UNPROVIDED );
    }
    if( NIL != el_utilities.el_formula_with_operator_p( base_col, $const12$CollectionIntersectionFn ) )
    {
      return cycl_utilities.formula_args( cycl_utilities.formula_arg1( base_col, UNPROVIDED ), UNPROVIDED );
    }
    return NIL;
  }

  public static SubLObject declare_reformulator_module_subcollection_simplifier_file()
  {
    SubLFiles.declareFunction( me, "subcol_simp_cost_estimate", "SUBCOL-SIMP-COST-ESTIMATE", 3, 0, false );
    SubLFiles.declareFunction( me, "subcol_simp_required", "SUBCOL-SIMP-REQUIRED", 3, 0, false );
    SubLFiles.declareFunction( me, "subcol_simp_reformulate", "SUBCOL-SIMP-REFORMULATE", 4, 0, false );
    SubLFiles.declareFunction( me, "subcol_simp_reformulate_int", "SUBCOL-SIMP-REFORMULATE-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "extract_relevant_cols_from_base_col", "EXTRACT-RELEVANT-COLS-FROM-BASE-COL", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_reformulator_module_subcollection_simplifier_file()
  {
    $subcol_simp_microseconds$ = SubLFiles.deflexical( "*SUBCOL-SIMP-MICROSECONDS*", $int2$212 );
    return NIL;
  }

  public static SubLObject setup_reformulator_module_subcollection_simplifier_file()
  {
    reformulator_module_harness.declare_rl_module( $const0$SubcollectionSimplifierRLModule, $list1 );
    utilities_macros.note_funcall_helper_function( $sym3$SUBCOL_SIMP_COST_ESTIMATE );
    utilities_macros.note_funcall_helper_function( $sym7$SUBCOL_SIMP_REQUIRED );
    utilities_macros.note_funcall_helper_function( $sym8$SUBCOL_SIMP_REFORMULATE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_module_subcollection_simplifier_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_module_subcollection_simplifier_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_module_subcollection_simplifier_file();
  }
  static
  {
    me = new reformulator_module_subcollection_simplifier();
    $subcol_simp_microseconds$ = null;
    $const0$SubcollectionSimplifierRLModule = constant_handles.reader_make_constant_shell( makeString( "SubcollectionSimplifierRLModule" ) );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "REQUIRED" ), makeSymbol( "SUBCOL-SIMP-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "SUBCOL-SIMP-COST-ESTIMATE" ), makeKeyword( "REFORMULATE" ), makeSymbol(
        "SUBCOL-SIMP-REFORMULATE" ), makeKeyword( "DOCUMENTATION" ), makeString( "Simplifies a #$SubcollectionFunction NAUT by removing redundancies." ), makeKeyword( "EXAMPLE-SOURCE" ), makeString(
            "(#$CollectionSubsetFn #$Sheep (#$TheSetOf ?X (#$and (#$isa ?X #$Sheep) (#$hates ?X #$Bertolo))))" ), makeKeyword( "EXAMPLE-TARGET" ), makeString(
                "(#$CollectionSubsetFn #$Sheep (#$TheSetOf ?X (#$hates ?X #$Bertolo))" )
    } );
    $int2$212 = makeInteger( 212 );
    $sym3$SUBCOL_SIMP_COST_ESTIMATE = makeSymbol( "SUBCOL-SIMP-COST-ESTIMATE" );
    $const4$CollectionSubsetFn = constant_handles.reader_make_constant_shell( makeString( "CollectionSubsetFn" ) );
    $const5$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $const6$ReformulatorMode_Simplify = constant_handles.reader_make_constant_shell( makeString( "ReformulatorMode-Simplify" ) );
    $sym7$SUBCOL_SIMP_REQUIRED = makeSymbol( "SUBCOL-SIMP-REQUIRED" );
    $sym8$SUBCOL_SIMP_REFORMULATE = makeSymbol( "SUBCOL-SIMP-REFORMULATE" );
    $sym9$ISA_LIT_ = makeSymbol( "ISA-LIT?" );
    $const10$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const11$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) );
    $const12$CollectionIntersectionFn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersectionFn" ) );
  }
}
/*
 * 
 * Total time: 27 ms
 * 
 */