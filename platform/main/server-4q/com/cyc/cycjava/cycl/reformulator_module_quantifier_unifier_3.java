package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_quantifier_unifier_3
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3";
  public static final String myFingerPrint = "0a6791840b0ba80376035f996eacfa4e903cb637108995c3cdeead9439faa39c";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 9648L)
  private static SubLSymbol $quant_unif_3_microseconds$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19163L)
  private static SubLSymbol $all_fort_instances_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19296L)
  private static SubLSymbol $all_spec_funcs_in_any_mt_cached_caching_state$;
  private static final SubLObject $const0$QuantifierUnifier_3_RLModule;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$IGNORE;
  private static final SubLList $list3;
  private static final SubLObject $const4$SomeFn;
  private static final SubLObject $const5$NLNumberFn;
  private static final SubLObject $const6$NLDefinitenessFn_3;
  private static final SubLObject $const7$NLQuantFn_3;
  private static final SubLObject $const8$BareForm_NLAttr;
  private static final SubLObject $const9$CardinalityOfFn;
  private static final SubLObject $const10$UnaryFunction;
  private static final SubLObject $const11$NLGenQuantAttribute;
  private static final SubLObject $const12$NumericalQuant_NLAttrFn;
  private static final SubLObject $const13$ProperName_NLAttr;
  private static final SubLObject $const14$NLTagFn;
  private static final SubLObject $const15$Thing;
  private static final SubLObject $const16$SetOrCollectionType;
  private static final SubLInteger $int17$2000;
  private static final SubLObject $const18$SubcollectionFunction;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLObject $const21$Definiteness_NLAttr;
  private static final SubLObject $const22$Plural_NLAttr;
  private static final SubLObject $const23$GenValueFn;
  private static final SubLObject $const24$QuantityVariableFn;
  private static final SubLObject $const25$genls;
  private static final SubLObject $const26$CollectionType;
  private static final SubLObject $const27$CollectionTypeType;
  private static final SubLObject $const28$FixedOrderCollection;
  private static final SubLObject $const29$SubcollectionOfWithRelationToFn;
  private static final SubLObject $const30$SubcollectionOfWithRelationToType;
  private static final SubLObject $const31$SubcollectionOfWithRelationFromFn;
  private static final SubLObject $const32$SubcollectionOfWithRelationFromTy;
  private static final SubLSymbol $sym33$ALL_FORT_INSTANCES_CACHED;
  private static final SubLSymbol $sym34$_ALL_FORT_INSTANCES_CACHED_CACHING_STATE_;
  private static final SubLInteger $int35$128;
  private static final SubLSymbol $sym36$ALL_SPEC_FUNCS_IN_ANY_MT_CACHED;
  private static final SubLSymbol $sym37$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const38$EverythingPSC;
  private static final SubLObject $const39$genlFuncs;
  private static final SubLSymbol $sym40$_ALL_SPEC_FUNCS_IN_ANY_MT_CACHED_CACHING_STATE_;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 1789L)
  public static SubLObject quant_unif_3_required(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    final SubLObject formula = ( NIL != clauses.clauses_p( expression ) && NIL != list_utilities.singletonP( expression ) && NIL != clause_utilities.pos_atomic_cnf_p( expression.first() ) ) ? clause_utilities
        .gaf_cnf_literal( expression.first() ) : expression;
    if( NIL != el_utilities.el_formula_p( formula ) )
    {
      SubLObject matchP = NIL;
      final SubLObject args = cycl_utilities.formula_args( formula, $kw2$IGNORE );
      SubLObject rest;
      SubLObject arg;
      for( rest = NIL, rest = args; NIL == matchP && NIL != rest; rest = rest.rest() )
      {
        arg = rest.first();
        if( NIL != quant_unif_3_nl_quant_fn_expressionP( arg ) )
        {
          matchP = T;
        }
      }
      matchP = makeBoolean( NIL != matchP || NIL != quant_unif_3_some_fn_expressionP( formula ) );
      matchP = makeBoolean( NIL != matchP || NIL != quant_unif_3_unary_fn_expressionP( formula, mt ) );
      matchP = makeBoolean( NIL != matchP || NIL != quant_unif_3_quant_def_expressionP( formula ) );
      matchP = makeBoolean( NIL != matchP || NIL != quant_unif_3_def_gen_quant_expressionP( formula, mt ) );
      matchP = makeBoolean( NIL != matchP || NIL != quant_unif_3_def_quant_bare_expressionP( formula ) );
      matchP = makeBoolean( NIL != matchP || NIL != quant_unif_3_numerical_quant_expressionP( formula ) );
      matchP = makeBoolean( NIL != matchP || NIL != quant_unif_3_proper_name_expressionP( formula ) );
      return matchP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 3115L)
  public static SubLObject quant_unif_3_some_fn_expressionP(final SubLObject expression)
  {
    return makeBoolean( NIL != el_utilities.formula_arityE( expression, THREE_INTEGER, UNPROVIDED ) && NIL != conses_high.member( cycl_utilities.formula_operator( expression ), $list3, UNPROVIDED, UNPROVIDED )
        && NIL != el_utilities.el_unary_formula_p( cycl_utilities.formula_arg3( expression, UNPROVIDED ) ) && $const4$SomeFn.eql( cycl_utilities.formula_operator( cycl_utilities.formula_arg3( expression,
            UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 3489L)
  public static SubLObject quant_unif_3_nl_quant_fn_expressionP(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_formula_p( expression ) && ( NIL != el_utilities.formula_arityE( expression, TWO_INTEGER, UNPROVIDED ) || NIL != el_utilities.formula_arityE( expression, THREE_INTEGER, UNPROVIDED ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( expression );
      final SubLObject nl_attr = thread.secondMultipleValue();
      final SubLObject nl_number_fn = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != el_utilities.el_formula_p( nl_number_fn ) && NIL != el_utilities.formula_arityE( nl_number_fn, TWO_INTEGER, UNPROVIDED ) && $const5$NLNumberFn.eql( cycl_utilities.formula_operator( nl_number_fn ) )
          && NIL != nl_tag_fn_fort_3P( nl_quant_fn ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 4109L)
  public static SubLObject quant_unif_3_subcol_fn_expressionP(final SubLObject expression)
  {
    return makeBoolean( NIL != conses_high.member( cycl_utilities.formula_operator( expression ), $list3, UNPROVIDED, UNPROVIDED ) && NIL != el_utilities.formula_arityE( expression, THREE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 4352L)
  public static SubLObject quant_unif_3_unary_fn_expressionP(final SubLObject expression, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_unary_formula_p( expression ) )
    {
      thread.resetMultipleValues();
      final SubLObject unary_fn = el_utilities.unmake_unary_formula( expression );
      final SubLObject nl_quant_fn_expr = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != el_utilities.el_binary_formula_p( nl_quant_fn_expr ) || NIL != el_utilities.el_ternary_formula_p( nl_quant_fn_expr ) )
      {
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( nl_quant_fn_expr );
        final SubLObject nl_quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != el_utilities.el_binary_formula_p( nl_number_fn_expr ) )
        {
          thread.resetMultipleValues();
          final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
          final SubLObject nl_number_attr = thread.secondMultipleValue();
          final SubLObject col = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( $const5$NLNumberFn.eql( nl_number_fn ) && ( $const6$NLDefinitenessFn_3.eql( nl_quant_fn ) || ( $const7$NLQuantFn_3.eql( nl_quant_fn ) && $const8$BareForm_NLAttr.eql( nl_quant_attr ) ) )
              && ( NIL == subcollection_function_nautP( col, mt ) || unary_fn.eql( $const9$CardinalityOfFn ) ) && NIL != isa.isaP( unary_fn, $const10$UnaryFunction, mt, UNPROVIDED ) && NIL != quant_unif_3_admitted_colP(
                  col, ONE_INTEGER, unary_fn, mt ) )
          {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 5400L)
  public static SubLObject quant_unif_3_quant_def_expressionP(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_binary_formula_p( expression ) || NIL != el_utilities.el_ternary_formula_p( expression ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( expression );
      final SubLObject quant_attr = thread.secondMultipleValue();
      final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( $const7$NLQuantFn_3.eql( nl_quant_fn ) && NIL != el_utilities.el_binary_formula_p( nl_def_fn_expr ) )
      {
        thread.resetMultipleValues();
        final SubLObject nl_def_fn = el_utilities.unmake_binary_formula( nl_def_fn_expr );
        final SubLObject def_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( $const6$NLDefinitenessFn_3.eql( nl_def_fn ) && NIL != el_utilities.el_binary_formula_p( nl_number_fn_expr ) )
        {
          thread.resetMultipleValues();
          final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
          final SubLObject number = thread.secondMultipleValue();
          final SubLObject col = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( $const5$NLNumberFn.eql( nl_number_fn ) )
          {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 6206L)
  public static SubLObject quant_unif_3_def_gen_quant_expressionP(final SubLObject expression, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_binary_formula_p( expression ) || NIL != el_utilities.el_ternary_formula_p( expression ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_def_fn = el_utilities.unmake_binary_formula( expression );
      final SubLObject def_attr = thread.secondMultipleValue();
      final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( $const6$NLDefinitenessFn_3.eql( nl_def_fn ) && ( NIL != el_utilities.el_binary_formula_p( nl_quant_fn_expr ) || NIL != el_utilities.el_ternary_formula_p( nl_quant_fn_expr ) ) )
      {
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( nl_quant_fn_expr );
        final SubLObject quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( $const7$NLQuantFn_3.eql( nl_quant_fn ) && NIL != el_utilities.el_binary_formula_p( nl_number_fn_expr ) )
        {
          thread.resetMultipleValues();
          final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
          final SubLObject number = thread.secondMultipleValue();
          final SubLObject col = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( $const5$NLNumberFn.eql( nl_number_fn ) && NIL != isa.isaP( quant_attr, $const11$NLGenQuantAttribute, mt, UNPROVIDED ) )
          {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 7109L)
  public static SubLObject quant_unif_3_def_quant_bare_expressionP(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_binary_formula_p( expression ) || NIL != el_utilities.el_ternary_formula_p( expression ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_def_fn = el_utilities.unmake_binary_formula( expression );
      final SubLObject def_attr = thread.secondMultipleValue();
      final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( $const6$NLDefinitenessFn_3.eql( nl_def_fn ) && NIL != el_utilities.el_ternary_formula_p( nl_quant_fn_expr ) )
      {
        thread.resetMultipleValues();
        final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( nl_quant_fn_expr );
        final SubLObject quant_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( $const7$NLQuantFn_3.eql( nl_quant_fn ) && $const8$BareForm_NLAttr.eql( quant_attr ) && NIL != el_utilities.el_binary_formula_p( nl_number_fn_expr ) )
        {
          thread.resetMultipleValues();
          final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
          final SubLObject number = thread.secondMultipleValue();
          final SubLObject col = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( $const5$NLNumberFn.eql( nl_number_fn ) )
          {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 7950L)
  public static SubLObject quant_unif_3_numerical_quant_expressionP(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_binary_formula_p( expression ) || NIL != el_utilities.el_ternary_formula_p( expression ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( expression );
      final SubLObject quant_attr = thread.secondMultipleValue();
      final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( $const7$NLQuantFn_3.eql( nl_quant_fn ) && NIL != el_utilities.el_unary_formula_p( quant_attr ) && $const12$NumericalQuant_NLAttrFn.eql( cycl_utilities.formula_arg1( quant_attr, UNPROVIDED ) )
          && NIL != el_utilities.el_ternary_formula_p( nl_def_fn_expr ) )
      {
        thread.resetMultipleValues();
        final SubLObject nl_def_fn = el_utilities.unmake_binary_formula( nl_def_fn_expr );
        final SubLObject def_attr = thread.secondMultipleValue();
        final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( $const6$NLDefinitenessFn_3.eql( nl_def_fn ) && NIL != el_utilities.el_binary_formula_p( nl_number_fn_expr ) )
        {
          thread.resetMultipleValues();
          final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
          final SubLObject number = thread.secondMultipleValue();
          final SubLObject col = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( $const5$NLNumberFn.eql( nl_number_fn ) )
          {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 8837L)
  public static SubLObject quant_unif_3_proper_name_expressionP(final SubLObject expression)
  {
    return makeBoolean( ( NIL != el_utilities.el_binary_formula_p( expression ) || NIL != el_utilities.el_ternary_formula_p( expression ) ) && $const7$NLQuantFn_3.eql( cycl_utilities.formula_operator( expression ) )
        && $const13$ProperName_NLAttr.eql( cycl_utilities.formula_arg1( expression, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 9111L)
  public static SubLObject nl_tag_fn_fort_3P(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != conses_high.member( v_object, all_spec_funcs_in_any_mt_cached( $const14$NLTagFn ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 9315L)
  public static SubLObject quant_unif_3_admitted_colP(final SubLObject col, final SubLObject argnum, final SubLObject relation, final SubLObject mt)
  {
    SubLObject cdolist_list_var = kb_accessors.argn_isa( relation, argnum, mt );
    SubLObject arg_isa_col = NIL;
    arg_isa_col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !$const15$Thing.eql( arg_isa_col ) && NIL != isa.isaP( arg_isa_col, $const16$SetOrCollectionType, mt, UNPROVIDED ) && NIL != isa.isaP( col, arg_isa_col, mt, UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_isa_col = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 9714L)
  public static SubLObject quant_unif_3_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    return $quant_unif_3_microseconds$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 9845L)
  public static SubLObject quant_unif_3_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings)
  {
    final SubLObject formula = ( NIL != clauses.clauses_p( expression ) && NIL != list_utilities.singletonP( expression ) && NIL != clause_utilities.pos_atomic_cnf_p( expression.first() ) ) ? clause_utilities
        .gaf_cnf_literal( expression.first() ) : expression;
    SubLObject new_formula = NIL;
    SubLObject justification = T;
    if( NIL != quant_unif_3_unary_fn_expressionP( formula, mt ) )
    {
      new_formula = quant_unif_3_unary_fn_reformulate( formula, mt, settings );
      justification = ConsesLow.list( $const10$UnaryFunction );
    }
    if( NIL != quant_unif_3_some_fn_expressionP( formula ) )
    {
      new_formula = quant_unif_3_some_fn_reformulate( formula, mt, settings );
      justification = ConsesLow.list( $const4$SomeFn );
    }
    if( NIL == new_formula && NIL != quant_unif_3_subcol_fn_expressionP( formula ) )
    {
      new_formula = quant_unif_3_subcol_fn_reformulate( formula, mt, settings );
      justification = ConsesLow.list( $const18$SubcollectionFunction );
    }
    SubLObject argnum = ZERO_INTEGER;
    final SubLObject args = cycl_utilities.formula_args( formula, $kw2$IGNORE );
    SubLObject rest;
    SubLObject arg;
    for( rest = NIL, rest = args; NIL == new_formula && NIL != rest; rest = rest.rest() )
    {
      arg = rest.first();
      argnum = Numbers.add( argnum, ONE_INTEGER );
      new_formula = ( NIL != quant_unif_3_nl_quant_fn_expressionP( arg ) ) ? quant_unif_3_nl_quant_fn_reformulate( formula, argnum, mt, settings ) : NIL;
      if( NIL != new_formula )
      {
        justification = ConsesLow.list( $const7$NLQuantFn_3 );
      }
    }
    if( NIL == new_formula && NIL != quant_unif_3_proper_name_expressionP( formula ) )
    {
      new_formula = cycl_utilities.formula_arg2( formula, UNPROVIDED );
      justification = ConsesLow.list( $const13$ProperName_NLAttr );
    }
    if( NIL == new_formula && NIL != quant_unif_3_quant_def_expressionP( formula ) )
    {
      new_formula = quant_unif_3_quant_def_reformulate( formula, mt, settings );
      justification = ConsesLow.list( $const7$NLQuantFn_3, $const6$NLDefinitenessFn_3 );
    }
    if( NIL == new_formula && NIL != quant_unif_3_def_gen_quant_expressionP( formula, mt ) )
    {
      new_formula = quant_unif_3_def_gen_quant_reformulate( formula, mt, settings );
      justification = ConsesLow.list( $const6$NLDefinitenessFn_3 );
    }
    if( NIL == new_formula && NIL != quant_unif_3_def_quant_bare_expressionP( formula ) )
    {
      new_formula = quant_unif_3_def_quant_bare_reformulate( formula, mt, settings );
      justification = ConsesLow.list( $const8$BareForm_NLAttr );
    }
    if( NIL == new_formula && NIL != quant_unif_3_numerical_quant_expressionP( formula ) )
    {
      new_formula = quant_unif_3_numerical_quant_reformulate( formula, mt, settings );
      justification = ConsesLow.list( $const12$NumericalQuant_NLAttrFn );
    }
    if( NIL != new_formula )
    {
      return Values.values( ( NIL != clauses.clauses_p( expression ) ) ? ConsesLow.list( clause_utilities.make_gaf_cnf( new_formula ) ) : new_formula, justification );
    }
    return Values.values( expression, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 12418L)
  public static SubLObject quant_unif_3_unary_fn_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject unary_fn = el_utilities.unmake_unary_formula( expression );
    final SubLObject nl_quant_fn_expr = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( nl_quant_fn_expr );
    final SubLObject nl_quant_attr = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
    final SubLObject nl_number_attr = thread.secondMultipleValue();
    final SubLObject col = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return el_utilities.make_unary_formula( unary_fn, col );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 12965L)
  public static SubLObject quant_unif_3_some_fn_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject subcol_fn = el_utilities.unmake_ternary_formula( expression );
    final SubLObject col1 = thread.secondMultipleValue();
    final SubLObject pred = thread.thirdMultipleValue();
    final SubLObject some_fn = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    final SubLObject col2 = cycl_utilities.formula_arg1( some_fn, UNPROVIDED );
    if( NIL == subcollection_function_nautP( col2, mt ) )
    {
      final SubLObject new_subcol_fn = corresponding_type_subcol_fn_3( subcol_fn );
      if( NIL != new_subcol_fn )
      {
        return el_utilities.make_ternary_formula( new_subcol_fn, col1, pred, col2 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 13425L)
  public static SubLObject quant_unif_3_subcol_fn_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject subcol_fn = el_utilities.unmake_ternary_formula( expression );
    final SubLObject col1 = thread.secondMultipleValue();
    final SubLObject pred = thread.thirdMultipleValue();
    final SubLObject nl_quant_fn_expr = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != el_utilities.formula_arityE( nl_quant_fn_expr, THREE_INTEGER, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( nl_quant_fn_expr );
      final SubLObject nl_quant_attr = thread.secondMultipleValue();
      final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != el_utilities.formula_arityE( nl_number_fn_expr, TWO_INTEGER, UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
        final SubLObject nl_number_attr = thread.secondMultipleValue();
        final SubLObject col2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != conses_high.member( nl_quant_fn, $list19, UNPROVIDED, UNPROVIDED ) && NIL != conses_high.member( nl_quant_attr, $list20, UNPROVIDED, UNPROVIDED ) && ( !nl_quant_attr.eql( $const21$Definiteness_NLAttr )
            || nl_number_attr.eql( $const22$Plural_NLAttr ) ) )
        {
          return el_utilities.make_ternary_formula( corresponding_type_subcol_fn_3( subcol_fn ), col1, pred, col2 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 14559L)
  public static SubLObject quant_unif_3_quant_def_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( expression );
    final SubLObject quant_attr = thread.secondMultipleValue();
    final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_def_fn = el_utilities.unmake_binary_formula( nl_def_fn_expr );
    final SubLObject def_attr = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $const7$NLQuantFn_3, quant_attr, nl_number_fn_expr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 15002L)
  public static SubLObject quant_unif_3_def_gen_quant_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject nl_def_fn = el_utilities.unmake_binary_formula( expression );
    final SubLObject def_attr = thread.secondMultipleValue();
    final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_quant_fn = el_utilities.unmake_ternary_formula( nl_quant_fn_expr );
    final SubLObject quant_attr = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    final SubLObject quant_arg_pos_num = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $const7$NLQuantFn_3, quant_attr, nl_number_fn_expr, quant_arg_pos_num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 15491L)
  public static SubLObject quant_unif_3_def_quant_bare_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject nl_def_fn = el_utilities.unmake_ternary_formula( expression );
    final SubLObject def_attr = thread.secondMultipleValue();
    final SubLObject nl_quant_fn_expr = thread.thirdMultipleValue();
    final SubLObject def_arg_pos_num = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( nl_quant_fn_expr );
    final SubLObject bare_form = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $const6$NLDefinitenessFn_3, def_attr, nl_number_fn_expr, def_arg_pos_num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 15982L)
  public static SubLObject quant_unif_3_numerical_quant_reformulate(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( expression );
    final SubLObject quant_attr = thread.secondMultipleValue();
    final SubLObject nl_def_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject nl_def_fn = el_utilities.unmake_binary_formula( nl_def_fn_expr );
    final SubLObject def_attr = thread.secondMultipleValue();
    final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.list( $const7$NLQuantFn_3, quant_attr, nl_number_fn_expr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 16431L)
  public static SubLObject quant_unif_3_nl_quant_fn_reformulate(final SubLObject the_expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject expression = conses_high.copy_tree( the_expression );
    final SubLObject arg = cycl_utilities.formula_arg( expression, argnum, UNPROVIDED );
    final SubLObject operator = cycl_utilities.formula_operator( expression );
    if( NIL != el_utilities.el_binary_formula_p( arg ) || NIL != el_utilities.el_ternary_formula_p( arg ) )
    {
      thread.resetMultipleValues();
      final SubLObject nl_quant_fn = el_utilities.unmake_binary_formula( arg );
      final SubLObject nl_quant_attr = thread.secondMultipleValue();
      final SubLObject nl_number_fn_expr = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != el_utilities.el_binary_formula_p( nl_number_fn_expr ) )
      {
        thread.resetMultipleValues();
        final SubLObject nl_number_fn = el_utilities.unmake_binary_formula( nl_number_fn_expr );
        final SubLObject nl_number_attr = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( $const23$GenValueFn.eql( operator ) || NIL != fort_types_interface.isa_predicateP( operator, mt ) || ( argnum.numE( TWO_INTEGER ) && NIL != fort_types_interface.isa_functionP( operator, mt )
            && NIL != quant_unif_3_admitted_colP( col, argnum, operator, mt ) ) )
        {
          if( NIL != subcollection_function_nautP( col, mt ) )
          {
            if( $const24$QuantityVariableFn.eql( operator ) )
            {
              return el_utilities.replace_formula_arg( argnum, col, expression );
            }
          }
          else
          {
            if( $const23$GenValueFn.eql( operator ) )
            {
              return el_utilities.replace_formula_arg( argnum, col, expression );
            }
            if( operator.eql( $const25$genls ) && argnum.numE( ONE_INTEGER ) && NIL == isa.isaP( nl_quant_attr, $const11$NLGenQuantAttribute, mt, UNPROVIDED ) )
            {
              if( NIL != quant_unif_3_admitted_colP( col, ONE_INTEGER, $const25$genls, mt ) && NIL == isa.isaP( col, $const26$CollectionType, mt, UNPROVIDED ) && NIL == isa.isaP( col, $const27$CollectionTypeType, mt,
                  UNPROVIDED ) )
              {
                return el_utilities.replace_formula_arg( argnum, col, expression );
              }
            }
            else if( NIL == isa.isaP( nl_quant_attr, $const11$NLGenQuantAttribute, mt, UNPROVIDED ) )
            {
              SubLObject cdolist_list_var = kb_accessors.argn_isa( operator, argnum, mt );
              SubLObject arg_isa_col = NIL;
              arg_isa_col = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                if( !$const15$Thing.eql( arg_isa_col ) && ( NIL != isa.isaP( arg_isa_col, $const16$SetOrCollectionType, mt, UNPROVIDED ) || NIL != isa.isaP( arg_isa_col, $const28$FixedOrderCollection, mt, UNPROVIDED ) )
                    && NIL != isa.isaP( col, arg_isa_col, mt, UNPROVIDED ) )
                {
                  return el_utilities.replace_formula_arg( argnum, col, expression );
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg_isa_col = cdolist_list_var.first();
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 18647L)
  public static SubLObject corresponding_type_subcol_fn_3(final SubLObject instance_subcol_fn)
  {
    if( instance_subcol_fn.eql( $const29$SubcollectionOfWithRelationToFn ) )
    {
      return $const30$SubcollectionOfWithRelationToType;
    }
    if( instance_subcol_fn.eql( $const31$SubcollectionOfWithRelationFromFn ) )
    {
      return $const32$SubcollectionOfWithRelationFromTy;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 18955L)
  public static SubLObject subcollection_function_nautP(final SubLObject naut, final SubLObject mt)
  {
    return makeBoolean( NIL != el_utilities.possibly_naut_p( naut ) && NIL != conses_high.member( cycl_utilities.nat_functor( naut ), all_fort_instances_cached( $const18$SubcollectionFunction, mt ), UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19163L)
  public static SubLObject clear_all_fort_instances_cached()
  {
    final SubLObject cs = $all_fort_instances_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19163L)
  public static SubLObject remove_all_fort_instances_cached(final SubLObject fort, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $all_fort_instances_cached_caching_state$.getGlobalValue(), ConsesLow.list( fort, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19163L)
  public static SubLObject all_fort_instances_cached_internal(final SubLObject fort, final SubLObject mt)
  {
    return isa.all_fort_instances( fort, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19163L)
  public static SubLObject all_fort_instances_cached(final SubLObject fort, final SubLObject mt)
  {
    SubLObject caching_state = $all_fort_instances_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym33$ALL_FORT_INSTANCES_CACHED, $sym34$_ALL_FORT_INSTANCES_CACHED_CACHING_STATE_, $int35$128, EQL, TWO_INTEGER, FOUR_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( fort, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( fort.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( all_fort_instances_cached_internal( fort, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( fort, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19296L)
  public static SubLObject clear_all_spec_funcs_in_any_mt_cached()
  {
    final SubLObject cs = $all_spec_funcs_in_any_mt_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19296L)
  public static SubLObject remove_all_spec_funcs_in_any_mt_cached(final SubLObject fort)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $all_spec_funcs_in_any_mt_cached_caching_state$.getGlobalValue(), ConsesLow.list( fort ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19296L)
  public static SubLObject all_spec_funcs_in_any_mt_cached_internal(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym37$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const38$EverythingPSC, thread );
      result = gt_methods.gt_all_inferiors( $const39$genlFuncs, fort, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-quantifier-unifier-3.lisp", position = 19296L)
  public static SubLObject all_spec_funcs_in_any_mt_cached(final SubLObject fort)
  {
    SubLObject caching_state = $all_spec_funcs_in_any_mt_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym36$ALL_SPEC_FUNCS_IN_ANY_MT_CACHED, $sym40$_ALL_SPEC_FUNCS_IN_ANY_MT_CACHED_CACHING_STATE_, $int35$128, EQL, ONE_INTEGER, FOUR_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( all_spec_funcs_in_any_mt_cached_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_reformulator_module_quantifier_unifier_3_file()
  {
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_required", "QUANT-UNIF-3-REQUIRED", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_some_fn_expressionP", "QUANT-UNIF-3-SOME-FN-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_nl_quant_fn_expressionP", "QUANT-UNIF-3-NL-QUANT-FN-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_subcol_fn_expressionP", "QUANT-UNIF-3-SUBCOL-FN-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_unary_fn_expressionP", "QUANT-UNIF-3-UNARY-FN-EXPRESSION?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_quant_def_expressionP", "QUANT-UNIF-3-QUANT-DEF-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_gen_quant_expressionP", "QUANT-UNIF-3-DEF-GEN-QUANT-EXPRESSION?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_quant_bare_expressionP", "QUANT-UNIF-3-DEF-QUANT-BARE-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_numerical_quant_expressionP", "QUANT-UNIF-3-NUMERICAL-QUANT-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_proper_name_expressionP", "QUANT-UNIF-3-PROPER-NAME-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "nl_tag_fn_fort_3P", "NL-TAG-FN-FORT-3?", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_admitted_colP", "QUANT-UNIF-3-ADMITTED-COL?", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_cost", "QUANT-UNIF-3-COST", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_reformulate", "QUANT-UNIF-3-REFORMULATE", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_unary_fn_reformulate", "QUANT-UNIF-3-UNARY-FN-REFORMULATE", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_some_fn_reformulate", "QUANT-UNIF-3-SOME-FN-REFORMULATE", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_subcol_fn_reformulate", "QUANT-UNIF-3-SUBCOL-FN-REFORMULATE", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_quant_def_reformulate", "QUANT-UNIF-3-QUANT-DEF-REFORMULATE", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_gen_quant_reformulate", "QUANT-UNIF-3-DEF-GEN-QUANT-REFORMULATE", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_def_quant_bare_reformulate", "QUANT-UNIF-3-DEF-QUANT-BARE-REFORMULATE", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_numerical_quant_reformulate", "QUANT-UNIF-3-NUMERICAL-QUANT-REFORMULATE", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "quant_unif_3_nl_quant_fn_reformulate", "QUANT-UNIF-3-NL-QUANT-FN-REFORMULATE", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "corresponding_type_subcol_fn_3", "CORRESPONDING-TYPE-SUBCOL-FN-3", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "subcollection_function_nautP", "SUBCOLLECTION-FUNCTION-NAUT?", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "clear_all_fort_instances_cached", "CLEAR-ALL-FORT-INSTANCES-CACHED", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "remove_all_fort_instances_cached", "REMOVE-ALL-FORT-INSTANCES-CACHED", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_fort_instances_cached_internal", "ALL-FORT-INSTANCES-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_fort_instances_cached", "ALL-FORT-INSTANCES-CACHED", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "clear_all_spec_funcs_in_any_mt_cached", "CLEAR-ALL-SPEC-FUNCS-IN-ANY-MT-CACHED", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "remove_all_spec_funcs_in_any_mt_cached", "REMOVE-ALL-SPEC-FUNCS-IN-ANY-MT-CACHED", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_spec_funcs_in_any_mt_cached_internal", "ALL-SPEC-FUNCS-IN-ANY-MT-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3", "all_spec_funcs_in_any_mt_cached", "ALL-SPEC-FUNCS-IN-ANY-MT-CACHED", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_reformulator_module_quantifier_unifier_3_file()
  {
    $quant_unif_3_microseconds$ = SubLFiles.deflexical( "*QUANT-UNIF-3-MICROSECONDS*", $int17$2000 );
    $all_fort_instances_cached_caching_state$ = SubLFiles.deflexical( "*ALL-FORT-INSTANCES-CACHED-CACHING-STATE*", NIL );
    $all_spec_funcs_in_any_mt_cached_caching_state$ = SubLFiles.deflexical( "*ALL-SPEC-FUNCS-IN-ANY-MT-CACHED-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_reformulator_module_quantifier_unifier_3_file()
  {
    reformulator_module_harness.declare_rl_module( $const0$QuantifierUnifier_3_RLModule, $list1 );
    memoization_state.note_globally_cached_function( $sym33$ALL_FORT_INSTANCES_CACHED );
    memoization_state.note_globally_cached_function( $sym36$ALL_SPEC_FUNCS_IN_ANY_MT_CACHED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_module_quantifier_unifier_3_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_module_quantifier_unifier_3_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_module_quantifier_unifier_3_file();
  }
  static
  {
    me = new reformulator_module_quantifier_unifier_3();
    $quant_unif_3_microseconds$ = null;
    $all_fort_instances_cached_caching_state$ = null;
    $all_spec_funcs_in_any_mt_cached_caching_state$ = null;
    $const0$QuantifierUnifier_3_RLModule = constant_handles.reader_make_constant_shell( makeString( "QuantifierUnifier-3-RLModule" ) );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "REQUIRED" ), makeSymbol( "QUANT-UNIF-3-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "QUANT-UNIF-3-COST" ), makeKeyword( "REFORMULATE" ), makeSymbol(
        "QUANT-UNIF-3-REFORMULATE" ), makeKeyword( "DOCUMENTATION" ), makeString( "Eliminates redundant NL quantification" ), makeKeyword( "EXAMPLE-SOURCE" ), makeString(
            "(genls (NLQuantFn-3 BareForm-NLAttr \n             (NLNumberFn Plural-NLAttr Dog)) Mammal)" ), makeKeyword( "EXAMPLE-TARGET" ), makeString( "(genls Dog Mammal)" )
    } );
    $kw2$IGNORE = makeKeyword( "IGNORE" );
    $list3 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "SubcollectionOfWithRelationFromFn" ) ) );
    $const4$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $const5$NLNumberFn = constant_handles.reader_make_constant_shell( makeString( "NLNumberFn" ) );
    $const6$NLDefinitenessFn_3 = constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) );
    $const7$NLQuantFn_3 = constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) );
    $const8$BareForm_NLAttr = constant_handles.reader_make_constant_shell( makeString( "BareForm-NLAttr" ) );
    $const9$CardinalityOfFn = constant_handles.reader_make_constant_shell( makeString( "CardinalityOfFn" ) );
    $const10$UnaryFunction = constant_handles.reader_make_constant_shell( makeString( "UnaryFunction" ) );
    $const11$NLGenQuantAttribute = constant_handles.reader_make_constant_shell( makeString( "NLGenQuantAttribute" ) );
    $const12$NumericalQuant_NLAttrFn = constant_handles.reader_make_constant_shell( makeString( "NumericalQuant-NLAttrFn" ) );
    $const13$ProperName_NLAttr = constant_handles.reader_make_constant_shell( makeString( "ProperName-NLAttr" ) );
    $const14$NLTagFn = constant_handles.reader_make_constant_shell( makeString( "NLTagFn" ) );
    $const15$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const16$SetOrCollectionType = constant_handles.reader_make_constant_shell( makeString( "SetOrCollectionType" ) );
    $int17$2000 = makeInteger( 2000 );
    $const18$SubcollectionFunction = constant_handles.reader_make_constant_shell( makeString( "SubcollectionFunction" ) );
    $list19 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NLDefinitenessFn-3" ) ), constant_handles.reader_make_constant_shell( makeString( "NLQuantFn-3" ) ) );
    $list20 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Indefinite-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "Definite-NLAttr" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Some-NLAttr" ) ), constant_handles.reader_make_constant_shell( makeString( "BareForm-NLAttr" ) ) );
    $const21$Definiteness_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Definiteness-NLAttr" ) );
    $const22$Plural_NLAttr = constant_handles.reader_make_constant_shell( makeString( "Plural-NLAttr" ) );
    $const23$GenValueFn = constant_handles.reader_make_constant_shell( makeString( "GenValueFn" ) );
    $const24$QuantityVariableFn = constant_handles.reader_make_constant_shell( makeString( "QuantityVariableFn" ) );
    $const25$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const26$CollectionType = constant_handles.reader_make_constant_shell( makeString( "CollectionType" ) );
    $const27$CollectionTypeType = constant_handles.reader_make_constant_shell( makeString( "CollectionTypeType" ) );
    $const28$FixedOrderCollection = constant_handles.reader_make_constant_shell( makeString( "FixedOrderCollection" ) );
    $const29$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) );
    $const30$SubcollectionOfWithRelationToType = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToTypeFn" ) );
    $const31$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) );
    $const32$SubcollectionOfWithRelationFromTy = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromTypeFn" ) );
    $sym33$ALL_FORT_INSTANCES_CACHED = makeSymbol( "ALL-FORT-INSTANCES-CACHED" );
    $sym34$_ALL_FORT_INSTANCES_CACHED_CACHING_STATE_ = makeSymbol( "*ALL-FORT-INSTANCES-CACHED-CACHING-STATE*" );
    $int35$128 = makeInteger( 128 );
    $sym36$ALL_SPEC_FUNCS_IN_ANY_MT_CACHED = makeSymbol( "ALL-SPEC-FUNCS-IN-ANY-MT-CACHED" );
    $sym37$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const38$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const39$genlFuncs = constant_handles.reader_make_constant_shell( makeString( "genlFuncs" ) );
    $sym40$_ALL_SPEC_FUNCS_IN_ANY_MT_CACHED_CACHING_STATE_ = makeSymbol( "*ALL-SPEC-FUNCS-IN-ANY-MT-CACHED-CACHING-STATE*" );
  }
}
/*
 * 
 * Total time: 116 ms
 * 
 */