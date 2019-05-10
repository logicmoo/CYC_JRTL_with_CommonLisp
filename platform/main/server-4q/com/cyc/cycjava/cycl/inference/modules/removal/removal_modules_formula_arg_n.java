package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_formula_arg_n
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_arg_n";
  public static final String myFingerPrint = "e699eb68995320d05ab0f3473de211d038418ab07763e56b925c395629d73950";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 928L)
  public static SubLSymbol $operator_formulas_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 1276L)
  private static SubLSymbol $operator_formulas_code_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 1602L)
  private static SubLSymbol $default_operator_formulas_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 4979L)
  public static SubLSymbol $argn_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 5401L)
  private static SubLSymbol $default_arg_n_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 11438L)
  public static SubLSymbol $formula_arity_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 11510L)
  private static SubLSymbol $default_formula_arity_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 18257L)
  public static SubLSymbol $cycl_for_subl_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 18713L)
  private static SubLSymbol $default_cycl_for_subl_check_cost$;
  private static final SubLObject $const0$operatorFormulas;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLSymbol $sym3$_OPERATOR_FORMULAS_DEFINING_MT_;
  private static final SubLObject $const4$BaseKB;
  private static final SubLSymbol $kw5$OPAQUE;
  private static final SubLSymbol $kw6$TRUE_MON;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$CODE;
  private static final SubLSymbol $kw9$REMOVAL_OPERATOR_FORMULAS_CHECK_POS;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_OPERATOR_FORMULAS_CHECK_NEG;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$REMOVAL_OPERATOR_FORMULAS_UNIFY;
  private static final SubLList $list14;
  private static final SubLObject $const15$argN;
  private static final SubLSymbol $sym16$_ARGN_DEFINING_MT_;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$REMOVAL_ARG_N_CHECK_POS;
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$REMOVAL_ARG_N_CHECK_NEG;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$REMOVAL_ARG_N_UNIFY_ARG1;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$REMOVAL_ARG_N_UNIFY_ARG2;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$REMOVAL_ARG_N_ITERATE;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$IGNORE;
  private static final SubLObject $const29$formulaArity;
  private static final SubLSymbol $sym30$_FORMULA_ARITY_DEFINING_MT_;
  private static final SubLSymbol $kw31$REMOVAL_FORMULA_ARITY_CHECK_POS;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$REMOVAL_FORMULA_ARITY_CHECK_NEG;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$REMOVAL_FORMULA_ARITY_UNIFY;
  private static final SubLList $list36;
  private static final SubLObject $const37$quotedFormulaArity;
  private static final SubLSymbol $kw38$REMOVAL_QUOTED_FORMULA_ARITY_CHECK_POS;
  private static final SubLList $list39;
  private static final SubLSymbol $kw40$REMOVAL_QUOTED_FORMULA_ARITY_CHECK_NEG;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$REMOVAL_QUOTED_FORMULA_ARITY_UNIFY;
  private static final SubLList $list43;
  private static final SubLObject $const44$cycLForSubL;
  private static final SubLSymbol $sym45$_CYCL_FOR_SUBL_DEFINING_MT_;
  private static final SubLList $list46;
  private static final SubLSymbol $kw47$REMOVAL_CYCL_FOR_SUBL_CHECK_POS;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$REMOVAL_CYCL_FOR_SUBL_CHECK_NEG;
  private static final SubLList $list50;
  private static final SubLSymbol $kw51$REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG1;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG2;
  private static final SubLList $list54;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 1008L)
  public static SubLObject make_operator_formulas_supports(final SubLObject support_formula, final SubLObject support_mt)
  {
    final SubLObject support = arguments.make_hl_support( $kw5$OPAQUE, support_formula, support_mt, $kw6$TRUE_MON );
    final SubLObject more_supports = ConsesLow.list( operator_formulas_rule_support() );
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 1442L)
  public static SubLObject operator_formulas_rule_support()
  {
    return arguments.make_hl_support( $kw8$CODE, $operator_formulas_code_rule$.getGlobalValue(), $operator_formulas_defining_mt$.getGlobalValue(), $kw6$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 1855L)
  public static SubLObject formula_has_operatorP(final SubLObject formula, final SubLObject operator)
  {
    return Equality.equal( operator, cycl_utilities.formula_operator( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 5034L)
  public static SubLObject make_arg_n_supports(final SubLObject support_formula, final SubLObject support_mt)
  {
    final SubLObject support = arguments.make_hl_support( $kw5$OPAQUE, support_formula, support_mt, $kw6$TRUE_MON );
    final SubLObject more_supports = ConsesLow.list( arg_n_rule_support() );
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 5278L)
  public static SubLObject arg_n_rule_support()
  {
    return arguments.make_hl_support( $kw8$CODE, $list17, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 5596L)
  public static SubLObject removal_arg_n_check(final SubLObject v_term, final SubLObject argnum, final SubLObject formula)
  {
    return czer_utilities.terms_equal_at_elP( v_term, cycl_utilities.formula_arg( formula, argnum, UNPROVIDED ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 10362L)
  public static SubLObject removal_arg_n_iterate_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return el_utilities.formula_arity( asent, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 10478L)
  public static SubLObject removal_arg_n_iterate_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject formula = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject terms = cycl_utilities.formula_terms( formula, $kw28$IGNORE );
    SubLObject list_var = NIL;
    SubLObject arg = NIL;
    SubLObject argnum = NIL;
    list_var = terms;
    arg = list_var.first();
    for( argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X( argnum ) )
    {
      final SubLObject bound_asent = el_utilities.make_ternary_formula( $const15$argN, arg, argnum, formula );
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( bound_asent, asent, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw5$OPAQUE, bound_asent, $argn_defining_mt$.getGlobalValue(), $kw6$TRUE_MON ), v_bindings, ConsesLow.cons( arg_n_rule_support(), unify_justification ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 11743L)
  public static SubLObject formula_has_arityP(final SubLObject formula, final SubLObject v_arity)
  {
    return el_utilities.formula_arityE( formula, v_arity, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 18328L)
  public static SubLObject make_cycl_for_subl_supports(final SubLObject support_formula, final SubLObject support_mt)
  {
    final SubLObject support = arguments.make_hl_support( $kw5$OPAQUE, support_formula, support_mt, $kw6$TRUE_MON );
    final SubLObject more_supports = ConsesLow.list( cycl_for_subl_rule_support() );
    return Values.values( support, more_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 18588L)
  public static SubLObject cycl_for_subl_rule_support()
  {
    return arguments.make_hl_support( $kw8$CODE, $list46, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-formula-arg-n.lisp", position = 18801L)
  public static SubLObject removal_cycl_for_subl_check(final SubLObject subl_quote_fn_formula, final SubLObject subl)
  {
    return Equality.equal( subl, cycl_utilities.formula_arg( subl_quote_fn_formula, ONE_INTEGER, UNPROVIDED ) );
  }

  public static SubLObject declare_removal_modules_formula_arg_n_file()
  {
    SubLFiles.declareFunction( me, "make_operator_formulas_supports", "MAKE-OPERATOR-FORMULAS-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "operator_formulas_rule_support", "OPERATOR-FORMULAS-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "formula_has_operatorP", "FORMULA-HAS-OPERATOR?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_arg_n_supports", "MAKE-ARG-N-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "arg_n_rule_support", "ARG-N-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_arg_n_check", "REMOVAL-ARG-N-CHECK", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_arg_n_iterate_cost", "REMOVAL-ARG-N-ITERATE-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_arg_n_iterate_expand", "REMOVAL-ARG-N-ITERATE-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "formula_has_arityP", "FORMULA-HAS-ARITY?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cycl_for_subl_supports", "MAKE-CYCL-FOR-SUBL-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_for_subl_rule_support", "CYCL-FOR-SUBL-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_cycl_for_subl_check", "REMOVAL-CYCL-FOR-SUBL-CHECK", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_formula_arg_n_file()
  {
    $operator_formulas_defining_mt$ = SubLFiles.deflexical( "*OPERATOR-FORMULAS-DEFINING-MT*", maybeDefault( $sym3$_OPERATOR_FORMULAS_DEFINING_MT_, $operator_formulas_defining_mt$, $const4$BaseKB ) );
    $operator_formulas_code_rule$ = SubLFiles.deflexical( "*OPERATOR-FORMULAS-CODE-RULE*", $list7 );
    $default_operator_formulas_check_cost$ = SubLFiles.deflexical( "*DEFAULT-OPERATOR-FORMULAS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $argn_defining_mt$ = SubLFiles.deflexical( "*ARGN-DEFINING-MT*", maybeDefault( $sym16$_ARGN_DEFINING_MT_, $argn_defining_mt$, $const4$BaseKB ) );
    $default_arg_n_check_cost$ = SubLFiles.deflexical( "*DEFAULT-ARG-N-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $formula_arity_defining_mt$ = SubLFiles.deflexical( "*FORMULA-ARITY-DEFINING-MT*", maybeDefault( $sym30$_FORMULA_ARITY_DEFINING_MT_, $formula_arity_defining_mt$, $const4$BaseKB ) );
    $default_formula_arity_check_cost$ = SubLFiles.deflexical( "*DEFAULT-FORMULA-ARITY-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $cycl_for_subl_defining_mt$ = SubLFiles.deflexical( "*CYCL-FOR-SUBL-DEFINING-MT*", maybeDefault( $sym45$_CYCL_FOR_SUBL_DEFINING_MT_, $cycl_for_subl_defining_mt$, $const4$BaseKB ) );
    $default_cycl_for_subl_check_cost$ = SubLFiles.deflexical( "*DEFAULT-CYCL-FOR-SUBL-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_formula_arg_n_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$operatorFormulas );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$operatorFormulas, TWO_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$operatorFormulas );
    subl_macro_promotions.declare_defglobal( $sym3$_OPERATOR_FORMULAS_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym3$_OPERATOR_FORMULAS_DEFINING_MT_, $const0$operatorFormulas );
    inference_modules.inference_removal_module( $kw9$REMOVAL_OPERATOR_FORMULAS_CHECK_POS, $list10 );
    inference_modules.inference_removal_module( $kw11$REMOVAL_OPERATOR_FORMULAS_CHECK_NEG, $list12 );
    inference_modules.inference_removal_module( $kw13$REMOVAL_OPERATOR_FORMULAS_UNIFY, $list14 );
    inference_modules.register_solely_specific_removal_module_predicate( $const15$argN );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const15$argN, THREE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym16$_ARGN_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym16$_ARGN_DEFINING_MT_, $const15$argN );
    inference_modules.inference_removal_module( $kw18$REMOVAL_ARG_N_CHECK_POS, $list19 );
    inference_modules.inference_removal_module( $kw20$REMOVAL_ARG_N_CHECK_NEG, $list21 );
    inference_modules.inference_removal_module( $kw22$REMOVAL_ARG_N_UNIFY_ARG1, $list23 );
    inference_modules.inference_removal_module( $kw24$REMOVAL_ARG_N_UNIFY_ARG2, $list25 );
    inference_modules.inference_removal_module( $kw26$REMOVAL_ARG_N_ITERATE, $list27 );
    inference_modules.register_solely_specific_removal_module_predicate( $const29$formulaArity );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const29$formulaArity, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const29$formulaArity );
    subl_macro_promotions.declare_defglobal( $sym30$_FORMULA_ARITY_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym30$_FORMULA_ARITY_DEFINING_MT_, $const29$formulaArity );
    inference_modules.inference_removal_module( $kw31$REMOVAL_FORMULA_ARITY_CHECK_POS, $list32 );
    inference_modules.inference_removal_module( $kw33$REMOVAL_FORMULA_ARITY_CHECK_NEG, $list34 );
    inference_modules.inference_removal_module( $kw35$REMOVAL_FORMULA_ARITY_UNIFY, $list36 );
    inference_modules.register_solely_specific_removal_module_predicate( $const37$quotedFormulaArity );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const37$quotedFormulaArity, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const37$quotedFormulaArity );
    inference_modules.inference_removal_module( $kw38$REMOVAL_QUOTED_FORMULA_ARITY_CHECK_POS, $list39 );
    inference_modules.inference_removal_module( $kw40$REMOVAL_QUOTED_FORMULA_ARITY_CHECK_NEG, $list41 );
    inference_modules.inference_removal_module( $kw42$REMOVAL_QUOTED_FORMULA_ARITY_UNIFY, $list43 );
    inference_modules.register_solely_specific_removal_module_predicate( $const44$cycLForSubL );
    preference_modules.doomed_unless_either_arg_bindable( $kw1$POS, $const44$cycLForSubL );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const44$cycLForSubL );
    subl_macro_promotions.declare_defglobal( $sym45$_CYCL_FOR_SUBL_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym45$_CYCL_FOR_SUBL_DEFINING_MT_, $const44$cycLForSubL );
    inference_modules.inference_removal_module( $kw47$REMOVAL_CYCL_FOR_SUBL_CHECK_POS, $list48 );
    inference_modules.inference_removal_module( $kw49$REMOVAL_CYCL_FOR_SUBL_CHECK_NEG, $list50 );
    inference_modules.inference_removal_module( $kw51$REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG1, $list52 );
    inference_modules.inference_removal_module( $kw53$REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG2, $list54 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_formula_arg_n_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_formula_arg_n_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_formula_arg_n_file();
  }
  static
  {
    me = new removal_modules_formula_arg_n();
    $operator_formulas_defining_mt$ = null;
    $operator_formulas_code_rule$ = null;
    $default_operator_formulas_check_cost$ = null;
    $argn_defining_mt$ = null;
    $default_arg_n_check_cost$ = null;
    $formula_arity_defining_mt$ = null;
    $default_formula_arity_check_cost$ = null;
    $cycl_for_subl_defining_mt$ = null;
    $default_cycl_for_subl_check_cost$ = null;
    $const0$operatorFormulas = constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $sym3$_OPERATOR_FORMULAS_DEFINING_MT_ = makeSymbol( "*OPERATOR-FORMULAS-DEFINING-MT*" );
    $const4$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw5$OPAQUE = makeKeyword( "OPAQUE" );
    $kw6$TRUE_MON = makeKeyword( "TRUE-MON" );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?FORMULA" ),
        ConsesLow.cons( makeSymbol( "?RELATION" ), makeSymbol( "??ARGS" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), makeSymbol( "?RELATION" ), makeSymbol(
            "?FORMULA" ) ) );
    $kw8$CODE = makeKeyword( "CODE" );
    $kw9$REMOVAL_OPERATOR_FORMULAS_CHECK_POS = makeKeyword( "REMOVAL-OPERATOR-FORMULAS-CHECK-POS" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword(
            "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ) ), makeKeyword( "CHECK" ), T, makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*DEFAULT-OPERATOR-FORMULAS-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RELATION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                        "FORMULA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RELATION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ), makeKeyword(
                            "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "RELATION" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                "FORMULA-HAS-OPERATOR?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RELATION" ) ) ) ), makeKeyword(
                                    "SUPPORT-MT" ), makeSymbol( "*OPERATOR-FORMULAS-DEFINING-MT*" ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-OPERATOR-FORMULAS-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                        "(#$operatorFormulas <fully-bound> <CycL formula>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$operatorFormulas #$JuvenileFn (#$JuvenileFn #$Dog))" )
    } );
    $kw11$REMOVAL_OPERATOR_FORMULAS_CHECK_NEG = makeKeyword( "REMOVAL-OPERATOR-FORMULAS-CHECK-NEG" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword(
            "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ) ), makeKeyword( "CHECK" ), T, makeKeyword( "COST-EXPRESSION" ), ConsesLow.list( makeSymbol(
                "INVERT-REMOVAL-CHECK-COST" ), makeSymbol( "*DEFAULT-OPERATOR-FORMULAS-CHECK-COST*" ) ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
                    makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RELATION" ) ), ConsesLow
                        .list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RELATION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                            "FORMULA" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "RELATION" ), makeSymbol( "FORMULA" ) ), ConsesLow.list(
                                makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORMULA-HAS-OPERATOR?" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                    makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RELATION" ) ) ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*OPERATOR-FORMULAS-DEFINING-MT*" ),
      makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-OPERATOR-FORMULAS-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$operatorFormulas <fully-bound> <CycL formula>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$not (#$operatorFormulas #$isa (#$JuvenileFn #$Dog)))" )
    } );
    $kw13$REMOVAL_OPERATOR_FORMULAS_UNIFY = makeKeyword( "REMOVAL-OPERATOR-FORMULAS-UNIFY" );
    $list14 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword(
            "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
              "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "FORMULA-OPERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "INPUT" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*OPERATOR-FORMULAS-DEFINING-MT*" ), makeKeyword( "SUPPORT" ), makeSymbol(
                      "MAKE-OPERATOR-FORMULAS-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$operatorFormulas <not fully-bound> <CycL formula>)" ), makeKeyword( "EXAMPLE" ), makeString(
                          "(#$operatorFormulas ?WHAT (#$JuvenileFn #$Dog))" )
    } );
    $const15$argN = constant_handles.reader_make_constant_shell( makeString( "argN" ) );
    $sym16$_ARGN_DEFINING_MT_ = makeSymbol( "*ARGN-DEFINING-MT*" );
    $list17 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FormulaArgFn" ) ), makeSymbol( "?N" ),
        makeSymbol( "?FORMULA" ) ), makeSymbol( "?N" ), makeSymbol( "?FORMULA" ) );
    $kw18$REMOVAL_ARG_N_CHECK_POS = makeKeyword( "REMOVAL-ARG-N-CHECK-POS" );
    $list19 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "INTEGER" ),
            makeKeyword( "FULLY-BOUND" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ) ), makeKeyword( "CHECK" ), T, makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                    "*DEFAULT-ARG-N-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "argN" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ARGNUM" ) ),
                        ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                            makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                                makeSymbol( "TERM" ), makeSymbol( "ARGNUM" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ARG-N-CHECK" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                    makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ), makeKeyword(
                                        "SUPPORT-MT" ), makeSymbol( "*ARGN-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ),
      makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ARG-N-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$argN <fully-bound> <integer> <CycL formula>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$argN #$Dog 1 (#$JuvenileFn #$Dog))" )
    } );
    $kw20$REMOVAL_ARG_N_CHECK_NEG = makeKeyword( "REMOVAL-ARG-N-CHECK-NEG" );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "INTEGER" ),
            makeKeyword( "FULLY-BOUND" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ) ), makeKeyword( "CHECK" ), T, makeKeyword( "COST-EXPRESSION" ), ConsesLow.list( makeSymbol(
                    "INVERT-REMOVAL-CHECK-COST" ), makeSymbol( "*DEFAULT-ARG-N-CHECK-COST*" ) ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
                        makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), ConsesLow.list(
                            makeKeyword( "BIND" ), makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                "TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "ARGNUM" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ),
          ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ARG-N-CHECK" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARGNUM" ) ),
              ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ARGN-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ),
      makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ARG-N-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$argN <fully-bound> <integer> <CycL formula>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$argN #$Muffet 1 (#$JuvenileFn #$Dog)))" )
    } );
    $kw22$REMOVAL_ARG_N_UNIFY_ARG1 = makeKeyword( "REMOVAL-ARG-N-UNIFY-ARG1" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "INTEGER" ),
            makeKeyword( "FULLY-BOUND" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword(
          "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                  "ARGNUM" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORMULA-ARG" ), ConsesLow
                      .list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARGNUM" ) ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword(
                              "VALUE" ), makeSymbol( "FORMULA" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ARGN-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword(
                                  "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ARG-N-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$argN <not fully-bound> <integer> <CycL formula>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$argN ?WHAT 1 (#$JuvenileFn #$Dog))" )
    } );
    $kw24$REMOVAL_ARG_N_UNIFY_ARG2 = makeKeyword( "REMOVAL-ARG-N-UNIFY-ARG2" );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ),
            makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                        makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                            makeSymbol( "ARGNUM" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORMULA-ARG-POSITIONS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARGNUM" ) ), EQUAL ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "argN" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                        makeSymbol( "FORMULA" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ARGN-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword(
                                            "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-ARG-N-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                "(#$argN <fully-bound> <not-fully-bound> <CycL formula>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$argN #$Dog ?WHAT (#$JuvenileFn #$Dog))" )
    } );
    $kw26$REMOVAL_ARG_N_ITERATE = makeKeyword( "REMOVAL-ARG-N-ITERATE" );
    $list27 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ),
            makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-ARG-N-ITERATE-COST" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ARG-N-ITERATE-EXPAND" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*ARGN-DEFINING-MT*" ), makeKeyword(
                    "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                        "(#$argN <not-fully-bound> <not-fully-bound> <CycL formula>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$argN ?ARG ?NUM (#$JuvenileFn #$Dog))" )
    } );
    $kw28$IGNORE = makeKeyword( "IGNORE" );
    $const29$formulaArity = constant_handles.reader_make_constant_shell( makeString( "formulaArity" ) );
    $sym30$_FORMULA_ARITY_DEFINING_MT_ = makeSymbol( "*FORMULA-ARITY-DEFINING-MT*" );
    $kw31$REMOVAL_FORMULA_ARITY_CHECK_POS = makeKeyword( "REMOVAL-FORMULA-ARITY-CHECK-POS" );
    $list32 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "formulaArity" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "formulaArity" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "POSSIBLY-CYCL-FORMULA-P" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "CHECK" ), T, makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-FORMULA-ARITY-CHECK-COST*" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "formulaArity" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ARITY" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARITY" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                  "FORMULA" ), makeSymbol( "ARITY" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORMULA-HAS-ARITY?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "ARITY" ) ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*FORMULA-ARITY-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword(
                          "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$formulaArity <CycL formula> <integer>)" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$formulaArity (#$JuvenileFn #$Dog) 1)" )
    } );
    $kw33$REMOVAL_FORMULA_ARITY_CHECK_NEG = makeKeyword( "REMOVAL-FORMULA-ARITY-CHECK-NEG" );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "formulaArity" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "formulaArity" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "POSSIBLY-CYCL-FORMULA-P" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "CHECK" ), T, makeKeyword( "COST-EXPRESSION" ), ConsesLow.list( makeSymbol(
                "INVERT-REMOVAL-CHECK-COST" ), makeSymbol( "*DEFAULT-FORMULA-ARITY-CHECK-COST*" ) ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
                    makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "formulaArity" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ), ConsesLow
                        .list( makeKeyword( "BIND" ), makeSymbol( "ARITY" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                            "ARITY" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "ARITY" ) ), ConsesLow.list( makeKeyword(
                                "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORMULA-HAS-ARITY?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                    "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARITY" ) ) ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*FORMULA-ARITY-DEFINING-MT*" ), makeKeyword(
                                        "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$not (#$formulaArity <CycL formula> <integer>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$formulaArity (#$JuvenileFn #$Dog) 2))" )
    } );
    $kw35$REMOVAL_FORMULA_ARITY_UNIFY = makeKeyword( "REMOVAL-FORMULA-ARITY-UNIFY" );
    $list36 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "formulaArity" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "formulaArity" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "formulaArity" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "FORMULA" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                        "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORMULA-ARITY" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "formulaArity" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ),
      makeSymbol( "*FORMULA-ARITY-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$formulaArity <not fully-bound> <CycL formula>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$formulaArity ?WHAT (#$JuvenileFn #$Dog))" )
    } );
    $const37$quotedFormulaArity = constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) );
    $kw38$REMOVAL_QUOTED_FORMULA_ARITY_CHECK_POS = makeKeyword( "REMOVAL-QUOTED-FORMULA-ARITY-CHECK-POS" );
    $list39 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-FORMULA-ARITY-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ),
      ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "Quote" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ARITY" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARITY" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                  "FORMULA" ), makeSymbol( "ARITY" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORMULA-HAS-ARITY?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "ARITY" ) ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*FORMULA-ARITY-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword(
                          "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$quotedFormulaArity (#$Quote <CycL formula>) <integer>)" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$quotedFormulaArity (#$Quote (#$JuvenileFn #$Dog)) 1)" )
    } );
    $kw40$REMOVAL_QUOTED_FORMULA_ARITY_CHECK_NEG = makeKeyword( "REMOVAL-QUOTED-FORMULA-ARITY-CHECK-NEG" );
    $list41 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "COST-EXPRESSION" ), ConsesLow.list( makeSymbol( "INVERT-REMOVAL-CHECK-COST" ), makeSymbol( "*DEFAULT-FORMULA-ARITY-CHECK-COST*" ) ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) ),
          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "ARITY" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARITY" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "ARITY" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword(
          "CALL" ), makeSymbol( "FORMULA-HAS-ARITY?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARITY" ) ) ) ) ), makeKeyword(
              "SUPPORT-MT" ), makeSymbol( "*FORMULA-ARITY-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword(
                  "DOCUMENTATION" ), makeString( "(#$not (#$quotedFormulaArity (#$Quote <CycL formula>) <integer>))" ), makeKeyword( "EXAMPLE" ), makeString(
                      "(#$not (#$quotedFormulaArity (#$Quote (#$JuvenileFn #$Dog)) 2))" )
    } );
    $kw42$REMOVAL_QUOTED_FORMULA_ARITY_UNIFY = makeKeyword( "REMOVAL-QUOTED-FORMULA-ARITY-UNIFY" );
    $list43 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ) ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
                "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( makeKeyword(
                        "BIND" ), makeSymbol( "FORMULA" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list(
                            makeKeyword( "CALL" ), makeSymbol( "ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORMULA-ARITY" ), makeKeyword( "INPUT" ) ) ), makeKeyword(
                                "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quotedFormulaArity" ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ),
      makeSymbol( "*FORMULA-ARITY-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$quotedFormulaArity <not fully-bound> <CycL formula>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$quotedFormulaArity ?WHAT (#$JuvenileFn #$Dog))" )
    } );
    $const44$cycLForSubL = constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) );
    $sym45$_CYCL_FOR_SUBL_DEFINING_MT_ = makeSymbol( "*CYCL-FOR-SUBL-DEFINING-MT*" );
    $list46 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) ), makeSymbol(
        "?SUBL" ) ), makeSymbol( "?SUBL" ) );
    $kw47$REMOVAL_CYCL_FOR_SUBL_CHECK_POS = makeKeyword( "REMOVAL-CYCL-FOR-SUBL-CHECK-POS" );
    $list48 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ), makeKeyword(
            "FULLY-BOUND" ) ), makeKeyword( "CHECK" ), T, makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-CYCL-FOR-SUBL-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "SUBL" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SUBL" ) ), ConsesLow.list( makeKeyword(
                        "VALUE" ), makeSymbol( "FORMULA" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "FORMULA" ) ), ConsesLow
                            .list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-CYCL-FOR-SUBL-CHECK" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SUBL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                "FORMULA" ) ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*CYCL-FOR-SUBL-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-STRENGTH" ),
      makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-CYCL-FOR-SUBL-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$cycLForSubL (#$SubLQuoteFn <SubL expression>) <fully-bound>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$cycLForSubL #$Dog (#$cycLForSubL #$Dog))" )
    } );
    $kw49$REMOVAL_CYCL_FOR_SUBL_CHECK_NEG = makeKeyword( "REMOVAL-CYCL-FOR-SUBL-CHECK-NEG" );
    $list50 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "POSSIBLY-CYCL-FORMULA-P" ) ), makeKeyword(
            "FULLY-BOUND" ) ), makeKeyword( "CHECK" ), T, makeKeyword( "COST-EXPRESSION" ), ConsesLow.list( makeSymbol( "INVERT-REMOVAL-CHECK-COST" ), makeSymbol( "*DEFAULT-CYCL-FOR-SUBL-CHECK-COST*" ) ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "cycLForSubL" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SUBL" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword(
                        "VALUE" ), makeSymbol( "SUBL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow
                            .list( makeSymbol( "TERM" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                "REMOVAL-CYCL-FOR-SUBL-CHECK" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SUBL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ) ), makeKeyword(
                                    "SUPPORT-MT" ), makeSymbol( "*CYCL-FOR-SUBL-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ),
      makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-CYCL-FOR-SUBL-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$cycLForSubL (#$SubLQuoteFn <SubL expression>) <fully-bound>))" ), makeKeyword(
          "EXAMPLE" ), makeString( "(#$not (#$cycLForSubL (#$SubLQuoteFn #$Dog) #$Cat))" )
    } );
    $kw51$REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG1 = makeKeyword( "REMOVAL-CYCL-FOR-SUBL-UNIFY-ARG1" );
    $list52 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "cycLForSubL" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SUBL" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SUBL" ) ) ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "SUBL" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ),
          ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "MAKE-UNARY-FORMULA" ), constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "SUBL" ) ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "SUBL" ) ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*CYCL-FOR-SUBL-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword(
                      "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-CYCL-FOR-SUBL-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$cycLForSubL ?CYCL <SubL Formula>" ), makeKeyword( "EXAMPLE" ), makeString( "(#$cycLForSubL ?CYCL :FOO)" )
    } );
    $kw53$REMOVAL_CYCL_FOR_SUBL_UNIFY_ARG2 = makeKeyword( "REMOVAL-CYCL-FOR-SUBL-UNIFY-ARG2" );
    $list54 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SUBL-QUOTE-FN-SYNTAX-P" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycLForSubL" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SUBL-QUOTE-FN-FORMULA" ) ), makeKeyword(
                    "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SUBL-QUOTE-FN-FORMULA" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ),
                        ConsesLow.list( makeSymbol( "SUBL-QUOTE-FN-FORMULA" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                            "FORMULA-ARG" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SUBL-QUOTE-FN-FORMULA" ) ), ONE_INTEGER ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "cycLForSubL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SUBL-QUOTE-FN-FORMULA" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                    "SUPPORT-MT" ), makeSymbol( "*CYCL-FOR-SUBL-DEFINING-MT*" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ),
      makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-CYCL-FOR-SUBL-SUPPORTS" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$cycLForSubL (#$SubLQuoteFn <SubL formula>) ?SUBL)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$cycLForSubL (#$SubLQuoteFn :FOO) ?FOO)" )
    } );
  }
}
/*
 * 
 * Total time: 278 ms
 * 
 */