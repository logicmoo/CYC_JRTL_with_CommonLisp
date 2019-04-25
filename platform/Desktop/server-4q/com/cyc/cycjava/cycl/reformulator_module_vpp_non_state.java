package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_vpp_non_state
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_vpp_non_state";
  public static final String myFingerPrint = "74b89b1ad56dbb5bcdc7c90ffe377beab7cca53c6b75bc0f47fc73770b2f99f1";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 3059L)
  private static SubLSymbol $vppns_microseconds$;
  private static final SubLObject $const0$VPPProcessingNonStateRLModule;
  private static final SubLList $list1;
  private static final SubLObject $const2$TheVPParse;
  private static final SubLObject $const3$SomeFn;
  private static final SubLObject $const4$SubjectRolePredicate;
  private static final SubLSymbol $kw5$IGNORE;
  private static final SubLObject $const6$SubcollectionOfWithRelationFromFn;
  private static final SubLInteger $int7$6000;
  private static final SubLObject $const8$isa;
  private static final SubLObject $const9$genls;
  private static final SubLObject $const10$Thing;
  private static final SubLObject $const11$thereExists;
  private static final SubLObject $const12$and;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 1430L)
  public static SubLObject binary_the_vp_parse_expressionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_binary_formula_p( v_object ) && $const2$TheVPParse.eql( cycl_utilities.formula_operator( v_object ) ) && NIL == el_utilities.formula_with_sequence_varP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 1647L)
  public static SubLObject binary_the_vp_parse_some_fn_expressionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_binary_formula_p( v_object ) && $const2$TheVPParse.eql( cycl_utilities.formula_operator( v_object ) ) && NIL == el_utilities.formula_with_sequence_varP( v_object )
        && $const3$SomeFn.eql( cycl_utilities.formula_operator( cycl_utilities.formula_arg1( v_object, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 1920L)
  public static SubLObject subject_role_predicateP(final SubLObject v_object, final SubLObject mt)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != isa.isaP( v_object, $const4$SubjectRolePredicate, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 2053L)
  public static SubLObject unary_some_fn_expressionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_unary_formula_p( v_object ) && $const3$SomeFn.eql( cycl_utilities.formula_operator( v_object ) ) && NIL == el_utilities.formula_with_sequence_varP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 2245L)
  public static SubLObject vppns_required(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    if( NIL != clauses.clauses_p( expression ) )
    {
      if( NIL != list_utilities.singletonP( expression ) && NIL != clause_utilities.pos_atomic_cnf_p( expression.first() ) )
      {
        final SubLObject asent = clause_utilities.gaf_cnf_literal( expression.first() );
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( asent, $kw5$IGNORE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != binary_the_vp_parse_expressionP( arg ) || ( NIL != unary_some_fn_expressionP( arg ) && NIL == subject_role_predicateP( pred, mt ) ) || NIL != reformulator_module_quantifier_unifier_3
              .subcollection_function_nautP( arg, mt ) )
          {
            return T;
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
      }
    }
    else if( NIL != el_utilities.el_formula_p( expression ) )
    {
      return makeBoolean( $const6$SubcollectionOfWithRelationFromFn.eql( cycl_utilities.formula_operator( expression ) ) && NIL != el_utilities.formula_arityE( expression, THREE_INTEGER, UNPROVIDED )
          && NIL != binary_the_vp_parse_expressionP( cycl_utilities.formula_arg3( expression, UNPROVIDED ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 3118L)
  public static SubLObject vppns_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    return $vppns_microseconds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 3235L)
  public static SubLObject vppns_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings)
  {
    SubLObject result = NIL;
    if( NIL != clauses.clauses_p( expression ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( expression.first() );
      SubLObject argnum = ZERO_INTEGER;
      final SubLObject args = cycl_utilities.formula_args( asent, $kw5$IGNORE );
      SubLObject rest;
      SubLObject arg;
      for( rest = NIL, rest = args; NIL == result && NIL != rest; rest = rest.rest() )
      {
        arg = rest.first();
        argnum = Numbers.add( argnum, ONE_INTEGER );
        if( NIL != binary_the_vp_parse_some_fn_expressionP( arg ) )
        {
          result = vppns_reformulate_vp_parse_some_fn_asent( asent, argnum, mt, settings, UNPROVIDED );
        }
        if( NIL == result && NIL != binary_the_vp_parse_expressionP( arg ) )
        {
          result = vppns_reformulate_role_pred_asent( asent, argnum, mt, settings, UNPROVIDED );
        }
        if( NIL == result && NIL != unary_some_fn_expressionP( arg ) )
        {
          result = vppns_reformulate_some_fn_asent( asent, argnum, mt, settings, original_clause );
        }
        if( NIL == result && NIL != reformulator_module_quantifier_unifier_3.subcollection_function_nautP( arg, mt ) )
        {
          result = vppns_reformulate_subcol_naut( asent, argnum, mt, settings, original_clause );
        }
      }
      if( NIL != result )
      {
        result = ConsesLow.list( clause_utilities.make_gaf_cnf( result ) );
      }
    }
    else
    {
      result = vppns_reformulate_naut( expression, mt, settings );
    }
    if( NIL != result )
    {
      return Values.values( result, T );
    }
    return Values.values( expression, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 4463L)
  public static SubLObject vppns_reformulate_role_pred_asent(final SubLObject asent, final SubLObject role_list_argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    if( NIL != fort_types_interface.isa_predicateP( cycl_utilities.atomic_sentence_predicate( asent ), mt ) )
    {
      SubLObject role_pred_argnum = NIL;
      final SubLObject role_list_arg = cycl_utilities.sentence_arg( asent, role_list_argnum, UNPROVIDED );
      final SubLObject thing = cycl_utilities.nat_arg1( role_list_arg, UNPROVIDED );
      final SubLObject role = cycl_utilities.nat_arg2( role_list_arg, UNPROVIDED );
      final SubLObject terms = cycl_utilities.formula_terms( asent, $kw5$IGNORE );
      SubLObject list_var = NIL;
      SubLObject arg = NIL;
      SubLObject argnum = NIL;
      list_var = terms;
      arg = list_var.first();
      for( argnum = ZERO_INTEGER; NIL == role_pred_argnum && NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X( argnum ) )
      {
        if( NIL != subject_role_predicateP( arg, mt ) )
        {
          role_pred_argnum = argnum;
        }
      }
      if( NIL != role_pred_argnum )
      {
        SubLObject new_asent = el_utilities.replace_formula_arg( role_list_argnum, thing, asent );
        new_asent = el_utilities.replace_formula_arg( role_pred_argnum, role, new_asent );
        return new_asent;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 5257L)
  public static SubLObject vppns_reformulate_vp_parse_some_fn_asent(final SubLObject asent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    if( NIL != fort_types_interface.isa_predicateP( cycl_utilities.atomic_sentence_predicate( asent ), mt ) )
    {
      final SubLObject terms = cycl_utilities.formula_terms( asent, $kw5$IGNORE );
      SubLObject list_var = NIL;
      SubLObject arg = NIL;
      SubLObject argnum_$1 = NIL;
      list_var = terms;
      arg = list_var.first();
      for( argnum_$1 = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum_$1 = number_utilities.f_1X( argnum_$1 ) )
      {
        if( NIL != subject_role_predicateP( arg, mt ) )
        {
          return NIL;
        }
      }
      final SubLObject vp_parse_arg = cycl_utilities.formula_arg( asent, argnum, UNPROVIDED );
      final SubLObject some_fn_nat = cycl_utilities.formula_arg1( vp_parse_arg, UNPROVIDED );
      return el_utilities.replace_formula_arg( argnum, some_fn_nat, asent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 5754L)
  public static SubLObject vppns_reformulate_some_fn_asent(final SubLObject asent, final SubLObject some_fn_argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject some_fn_expr = cycl_utilities.sentence_arg( asent, some_fn_argnum, UNPROVIDED );
    final SubLObject v_term = cycl_utilities.nat_arg1( some_fn_expr, UNPROVIDED );
    SubLObject choice = NIL;
    if( NIL != at_admitted.admitted_argumentP( some_fn_expr, some_fn_argnum, pred, mt ) )
    {
      choice = $const8$isa;
    }
    else
    {
      if( NIL == reformulator_module_quantifier_unifier_3.subcollection_function_nautP( v_term, mt ) )
      {
        return el_utilities.replace_formula_arg( some_fn_argnum, v_term, asent );
      }
      choice = $const9$genls;
    }
    final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
    return el_utilities.make_existential( new_var, el_utilities.make_conjunction( ConsesLow.list( el_utilities.make_binary_formula( choice, new_var, v_term ), el_utilities.replace_formula_arg( some_fn_argnum, new_var,
        asent ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 6551L)
  public static SubLObject vppns_reformulate_naut(final SubLObject naut, final SubLObject mt, final SubLObject settings)
  {
    final SubLObject col = cycl_utilities.nat_arg1( naut, UNPROVIDED );
    final SubLObject role_pred = cycl_utilities.nat_arg2( naut, UNPROVIDED );
    final SubLObject role_list = cycl_utilities.nat_arg3( naut, UNPROVIDED );
    final SubLObject thing = cycl_utilities.nat_arg1( role_list, UNPROVIDED );
    final SubLObject role = cycl_utilities.nat_arg2( role_list, UNPROVIDED );
    if( NIL != subject_role_predicateP( role_pred, mt ) )
    {
      return el_utilities.make_ternary_formula( $const6$SubcollectionOfWithRelationFromFn, col, role, thing );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-vpp-non-state.lisp", position = 6934L)
  public static SubLObject vppns_reformulate_subcol_naut(final SubLObject asent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause)
  {
    if( original_clause == UNPROVIDED )
    {
      original_clause = NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    if( $const8$isa.eql( pred ) || $const9$genls.eql( pred ) || NIL != subl_promotions.memberP( $const10$Thing, kb_accessors.argn_isa( pred, argnum, mt ), UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != subl_promotions.memberP( $const9$genls, ke_tools.transitive_via_arg_inverses( pred, argnum, mt ), UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject col = cycl_utilities.sentence_arg( asent, argnum, UNPROVIDED );
    final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression( ConsesLow.list( original_clause, asent ), UNPROVIDED );
    final SubLObject subsentence = el_utilities.replace_formula_arg( argnum, new_var, asent );
    return el_utilities.list_to_elf( ConsesLow.list( $const11$thereExists, new_var, ConsesLow.list( $const12$and, ConsesLow.list( $const9$genls, new_var, col ), subsentence ) ) );
  }

  public static SubLObject declare_reformulator_module_vpp_non_state_file()
  {
    SubLFiles.declareFunction( me, "binary_the_vp_parse_expressionP", "BINARY-THE-VP-PARSE-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "binary_the_vp_parse_some_fn_expressionP", "BINARY-THE-VP-PARSE-SOME-FN-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "subject_role_predicateP", "SUBJECT-ROLE-PREDICATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "unary_some_fn_expressionP", "UNARY-SOME-FN-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "vppns_required", "VPPNS-REQUIRED", 3, 0, false );
    SubLFiles.declareFunction( me, "vppns_cost", "VPPNS-COST", 3, 0, false );
    SubLFiles.declareFunction( me, "vppns_reformulate", "VPPNS-REFORMULATE", 4, 0, false );
    SubLFiles.declareFunction( me, "vppns_reformulate_role_pred_asent", "VPPNS-REFORMULATE-ROLE-PRED-ASENT", 4, 1, false );
    SubLFiles.declareFunction( me, "vppns_reformulate_vp_parse_some_fn_asent", "VPPNS-REFORMULATE-VP-PARSE-SOME-FN-ASENT", 4, 1, false );
    SubLFiles.declareFunction( me, "vppns_reformulate_some_fn_asent", "VPPNS-REFORMULATE-SOME-FN-ASENT", 4, 1, false );
    SubLFiles.declareFunction( me, "vppns_reformulate_naut", "VPPNS-REFORMULATE-NAUT", 3, 0, false );
    SubLFiles.declareFunction( me, "vppns_reformulate_subcol_naut", "VPPNS-REFORMULATE-SUBCOL-NAUT", 4, 1, false );
    return NIL;
  }

  public static SubLObject init_reformulator_module_vpp_non_state_file()
  {
    $vppns_microseconds$ = SubLFiles.deflexical( "*VPPNS-MICROSECONDS*", $int7$6000 );
    return NIL;
  }

  public static SubLObject setup_reformulator_module_vpp_non_state_file()
  {
    reformulator_module_harness.declare_rl_module( $const0$VPPProcessingNonStateRLModule, $list1 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_module_vpp_non_state_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_module_vpp_non_state_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_module_vpp_non_state_file();
  }
  static
  {
    me = new reformulator_module_vpp_non_state();
    $vppns_microseconds$ = null;
    $const0$VPPProcessingNonStateRLModule = constant_handles.reader_make_constant_shell( makeString( "VPPProcessingNonStateRLModule" ) );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "REQUIRED" ), makeSymbol( "VPPNS-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "VPPNS-COST" ), makeKeyword( "REFORMULATE" ), makeSymbol(
        "VPPNS-REFORMULATE" ), makeKeyword( "DOCUMENTATION" ), makeString( "Transforms the output of the RTP and VPP into usable CycL." ), makeKeyword( "EXAMPLE-SOURCE" ), makeString(
            "(SubcollectionOfWithRelationFromFn Monkey playsActiveSubjectRole \n           (TheList \n               (SomeFn ProcessingALoanApplication) doneBy))" ), makeKeyword( "EXAMPLE-TARGET" ), makeString(
                "(SubcollectionOfWithRelationFromFn Monkey doneBy \n           (SomeFn ProcessingALoanApplication))" )
    } );
    $const2$TheVPParse = constant_handles.reader_make_constant_shell( makeString( "TheVPParse" ) );
    $const3$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $const4$SubjectRolePredicate = constant_handles.reader_make_constant_shell( makeString( "SubjectRolePredicate" ) );
    $kw5$IGNORE = makeKeyword( "IGNORE" );
    $const6$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) );
    $int7$6000 = makeInteger( 6000 );
    $const8$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const9$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const10$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const11$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const12$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
  }
}
/*
 * 
 * Total time: 51 ms
 * 
 */