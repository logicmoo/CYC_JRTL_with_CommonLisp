package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_negation_processor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_negation_processor";
  public static final String myFingerPrint = "22915467765c01f09c0541a44b60980eff258244fab30b2024e7e5d37d4a4369";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 1835L)
  private static SubLSymbol $negproc_microseconds$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 3393L)
  private static SubLSymbol $negproc_macros$;
  private static final SubLObject $const0$NegationProcessorRLModule;
  private static final SubLList $list1;
  private static final SubLInteger $int2$250;
  private static final SubLObject $const3$NLNegFn;
  private static final SubLList $list4;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 1884L)
  public static SubLObject negproc_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    return $negproc_microseconds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 2344L)
  public static SubLObject negproc_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    return makeBoolean( NIL == clauses.clauses_p( expression ) && NIL != el_utilities.el_formula_p( expression ) && NIL != el_utilities.formula_arityE( expression, TWO_INTEGER, UNPROVIDED ) && $const3$NLNegFn.eql(
        cycl_utilities.formula_operator( expression ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 2697L)
  public static SubLObject negproc_expression_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings)
  {
    final SubLObject scope = cycl_utilities.formula_arg2( expression, UNPROVIDED );
    final SubLObject rmp = ( NIL != el_utilities.el_formula_p( scope ) ) ? cycl_utilities.formula_operator( scope ) : NIL;
    final SubLObject new_rmp = find_negproc_macro( rmp );
    final SubLObject new_scope = ( NIL != new_rmp ) ? cycl_utilities.expression_subst( new_rmp, rmp, scope, UNPROVIDED, UNPROVIDED ) : scope;
    return Values.values( el_utilities.make_negation( new_scope ), T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-negation-processor.lisp", position = 3594L)
  public static SubLObject find_negproc_macro(final SubLObject rule_macro_pred)
  {
    return conses_high.second( conses_high.assoc( rule_macro_pred, $negproc_macros$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  public static SubLObject declare_reformulator_module_negation_processor_file()
  {
    SubLFiles.declareFunction( me, "negproc_cost_estimate", "NEGPROC-COST-ESTIMATE", 3, 0, false );
    SubLFiles.declareFunction( me, "negproc_expression_required", "NEGPROC-EXPRESSION-REQUIRED", 3, 0, false );
    SubLFiles.declareFunction( me, "negproc_expression_reformulate", "NEGPROC-EXPRESSION-REFORMULATE", 4, 0, false );
    SubLFiles.declareFunction( me, "find_negproc_macro", "FIND-NEGPROC-MACRO", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_reformulator_module_negation_processor_file()
  {
    $negproc_microseconds$ = SubLFiles.deflexical( "*NEGPROC-MICROSECONDS*", $int2$250 );
    $negproc_macros$ = SubLFiles.deflexical( "*NEGPROC-MACROS*", $list4 );
    return NIL;
  }

  public static SubLObject setup_reformulator_module_negation_processor_file()
  {
    reformulator_module_harness.declare_rl_module( $const0$NegationProcessorRLModule, $list1 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_module_negation_processor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_module_negation_processor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_module_negation_processor_file();
  }
  static
  {
    me = new reformulator_module_negation_processor();
    $negproc_microseconds$ = null;
    $negproc_macros$ = null;
    $const0$NegationProcessorRLModule = constant_handles.reader_make_constant_shell( makeString( "NegationProcessorRLModule" ) );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "REQUIRED" ), makeSymbol( "NEGPROC-EXPRESSION-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "NEGPROC-COST-ESTIMATE" ), makeKeyword( "REFORMULATE" ),
      makeSymbol( "NEGPROC-EXPRESSION-REFORMULATE" ), makeKeyword( "DOCUMENTATION" ), makeString( "Transforms intermediate vocabulary negations into legitimate #$not" ), makeKeyword( "EXAMPLE-SOURCE" ), makeString(
          "(#$NLNegFn #$NotVP-NLAttr \n     (#$relationAllExists #$catalyst #$DeoxyribonucleotideBonding #$RNAPolymerase))" ), makeKeyword( "EXAMPLE-TARGET" ), makeString(
              "(#$not \n     (#$relationExistsExists #$catalyst #$DeoxyribonucleotideBonding #$RNAPolymerase))" )
    } );
    $int2$250 = makeInteger( 250 );
    $const3$NLNegFn = constant_handles.reader_make_constant_shell( makeString( "NLNegFn" ) );
    $list4 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsExists" ) ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllAll" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsExists" ) ) ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "relationExistsExists" ) ), constant_handles.reader_make_constant_shell( makeString( "relationAllAll" ) ) ) );
  }
}
/*
 * 
 * Total time: 18 ms
 * 
 */