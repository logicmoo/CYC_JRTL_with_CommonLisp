package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class verbosifier
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.verbosifier";
  public static final String myFingerPrint = "5494697d7f55c937658f3080458c27bd9738b5bdc21dc167fc64117ab7d8cf49";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 990L)
  private static SubLSymbol $el_relation_recursion_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5321L)
  private static SubLSymbol $gather_expansion_justificationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5598L)
  private static SubLSymbol $expansion_justification$;
  private static final SubLInteger $int0$212;
  private static final SubLSymbol $sym1$EL_VIABLY_EXPANDIBLE_FORMULA_;
  private static final SubLSymbol $sym2$EL_VIABLY_EXPANDIBLE_EVALUATABLE_FORMULA_;
  private static final SubLSymbol $kw3$TRANSFORMATION_LIMIT_EXCEEDED;
  private static final SubLSymbol $sym4$EL_FORMULA_EXPANSION_INT;
  private static final SubLSymbol $kw5$RECURSION_LIMIT_EXCEEDED;
  private static final SubLSymbol $sym6$EXPANDIBLE_RELATION_EXPRESSION_;
  private static final SubLSymbol $sym7$CLET;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$EXPANDIBLE_EL_RELATION_EXPRESSION_;
  private static final SubLSymbol $kw10$IGNORE;
  private static final SubLSymbol $kw11$INVALID_EXPANSION;
  private static final SubLObject $const12$expansion;
  private static final SubLObject $const13$expansionDefn;
  private static final SubLString $str14$Trying_to_expand_a_recursive_EL_r;
  private static final SubLSymbol $sym15$INTEGERP;
  private static final SubLSymbol $sym16$NULL;
  private static final SubLSymbol $sym17$GENERIC_ARG_P;
  private static final SubLSymbol $sym18$GENERIC_ARG_NUM;
  private static final SubLSymbol $sym19$MAX;
  private static final SubLSymbol $sym20$EL_VAR_;
  private static final SubLSymbol $sym21$EXPANSION_ARG2_ARG0_P;
  private static final SubLSymbol $kw22$TRUE;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1132L)
  public static SubLObject verbosify_cycl(final SubLObject expression, SubLObject mt, SubLObject settings)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( settings == UNPROVIDED )
    {
      settings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      result = el_expansion( expression, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1381L)
  public static SubLObject el_expansion(final SubLObject formula, final SubLObject mt)
  {
    return el_expansion_destructive( conses_high.copy_tree( formula ), hlmt.copy_hlmt( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1842L)
  public static SubLObject el_expansion_destructive(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_formula = NIL;
    SubLObject result_mt = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject result_formula_$1 = el_expansion_recursive( formula, mt, $el_relation_recursion_limit$.getDynamicValue( thread ), ZERO_INTEGER );
      final SubLObject result_mt_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result_formula = result_formula_$1;
      result_mt = result_mt_$2;
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result_formula, result_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2190L)
  public static SubLObject el_expansion_one_step(final SubLObject formula, final SubLObject mt)
  {
    return el_expansion_one_step_destructive( conses_high.copy_tree( formula ), hlmt.copy_hlmt( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2506L)
  public static SubLObject el_expansion_one_step_destructive(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_formula = formula;
    SubLObject result_mt = mt;
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( NIL, thread );
      if( NIL != el_utilities.el_formula_p( formula ) && NIL != el_viably_expandible_formulaP( formula ) )
      {
        thread.resetMultipleValues();
        final SubLObject result_formula_$3 = el_expansion_int( formula, mt );
        final SubLObject result_mt_$4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result_formula = result_formula_$3;
        result_mt = result_mt_$4;
      }
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result_formula, result_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2934L)
  public static SubLObject el_expand_all(final SubLObject formula, final SubLObject mt)
  {
    return el_expand_all_int( formula, mt, $sym1$EL_VIABLY_EXPANDIBLE_FORMULA_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3424L)
  public static SubLObject el_expand_all_evaluatable(final SubLObject formula, final SubLObject mt)
  {
    return el_expand_all_int( formula, mt, $sym2$EL_VIABLY_EXPANDIBLE_EVALUATABLE_FORMULA_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3949L)
  public static SubLObject el_expand_all_int(final SubLObject formula, SubLObject mt, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( NIL, thread );
      try
      {
        thread.throwStack.push( $kw3$TRANSFORMATION_LIMIT_EXCEEDED );
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
        final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_1_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          thread.resetMultipleValues();
          final SubLObject result_$7 = cycl_utilities.formula_and_mt_transform( formula, mt, pred, $sym4$EL_FORMULA_EXPANSION_INT, NIL, $el_relation_recursion_limit$.getDynamicValue( thread ) );
          final SubLObject mt_$8 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          result = result_$7;
          mt = mt_$8;
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$6, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$5, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error = Errors.handleThrowable( ccatch_env_var, $kw3$TRANSFORMATION_LIMIT_EXCEEDED );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
    if( NIL != error )
    {
      return $kw5$RECURSION_LIMIT_EXCEEDED;
    }
    return Values.values( result, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4447L)
  public static SubLObject el_expand_all_destructive(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( NIL, thread );
      try
      {
        thread.throwStack.push( $kw3$TRANSFORMATION_LIMIT_EXCEEDED );
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
        final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          thread.resetMultipleValues();
          final SubLObject result_$11 = cycl_utilities.formula_and_mt_ntransform( formula, $sym1$EL_VIABLY_EXPANDIBLE_FORMULA_, $sym4$EL_FORMULA_EXPANSION_INT, NIL, $el_relation_recursion_limit$.getDynamicValue(
              thread ), UNPROVIDED );
          final SubLObject mt_$12 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          result = result_$11;
          mt = mt_$12;
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$10, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$9, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error = Errors.handleThrowable( ccatch_env_var, $kw3$TRANSFORMATION_LIMIT_EXCEEDED );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
    if( NIL != error )
    {
      return $kw5$RECURSION_LIMIT_EXCEEDED;
    }
    return Values.values( result, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4949L)
  public static SubLObject el_expandible_subformulaP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject expandibleP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      expandibleP = makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && NIL != cycl_utilities.formula_find_if( $sym6$EXPANDIBLE_RELATION_EXPRESSION_, v_object, NIL, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return expandibleP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5498L)
  public static SubLObject gathering_expansion_justificationsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $gather_expansion_justificationsP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5723L)
  public static SubLObject possibly_note_expansion_justification_support(final SubLObject support)
  {
    if( NIL != gathering_expansion_justificationsP() )
    {
      note_expansion_justification_support( support );
    }
    return support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5912L)
  public static SubLObject note_expansion_justification_support(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $expansion_justification$.setDynamicValue( ConsesLow.cons( support, $expansion_justification$.getDynamicValue( thread ) ), thread );
    return support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6037L)
  public static SubLObject expansion_justification()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.fast_delete_duplicates( Sequences.nreverse( conses_high.copy_list( $expansion_justification$.getDynamicValue( thread ) ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6164L)
  public static SubLObject gathering_expansion_justifications(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym7$CLET, $list8, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6338L)
  public static SubLObject verbosify_cycl_justified(final SubLObject expression, SubLObject mt, SubLObject settings)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( settings == UNPROVIDED )
    {
      settings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding( thread );
    try
    {
      $gather_expansion_justificationsP$.bind( T, thread );
      $expansion_justification$.bind( NIL, thread );
      result = verbosify_cycl( expression, mt, settings );
      justification = expansion_justification();
    }
    finally
    {
      $expansion_justification$.rebind( _prev_bind_2, thread );
      $gather_expansion_justificationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6878L)
  public static SubLObject el_expansion_justified(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding( thread );
    try
    {
      $gather_expansion_justificationsP$.bind( T, thread );
      $expansion_justification$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject result_$13 = el_expansion( formula, mt );
      final SubLObject mt_$14 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$13;
      mt = mt_$14;
      justification = expansion_justification();
    }
    finally
    {
      $expansion_justification$.rebind( _prev_bind_2, thread );
      $gather_expansion_justificationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7359L)
  public static SubLObject el_expansion_destructive_justified(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding( thread );
    try
    {
      $gather_expansion_justificationsP$.bind( T, thread );
      $expansion_justification$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject result_$15 = el_expansion_destructive( formula, mt );
      final SubLObject mt_$16 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$15;
      mt = mt_$16;
      justification = expansion_justification();
    }
    finally
    {
      $expansion_justification$.rebind( _prev_bind_2, thread );
      $gather_expansion_justificationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7922L)
  public static SubLObject el_expansion_one_step_justified(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding( thread );
    try
    {
      $gather_expansion_justificationsP$.bind( T, thread );
      $expansion_justification$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject result_$17 = el_expansion_one_step( formula, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
      final SubLObject mt_$18 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$17;
      mt = mt_$18;
      justification = expansion_justification();
    }
    finally
    {
      $expansion_justification$.rebind( _prev_bind_2, thread );
      $gather_expansion_justificationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8619L)
  public static SubLObject el_expansion_one_step_destructive_justified(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding( thread );
    try
    {
      $gather_expansion_justificationsP$.bind( T, thread );
      $expansion_justification$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject result_$19 = el_expansion_one_step_destructive( formula, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
      final SubLObject mt_$20 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$19;
      mt = mt_$20;
      justification = expansion_justification();
    }
    finally
    {
      $expansion_justification$.rebind( _prev_bind_2, thread );
      $gather_expansion_justificationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9213L)
  public static SubLObject el_expand_all_justified(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding( thread );
    try
    {
      $gather_expansion_justificationsP$.bind( T, thread );
      $expansion_justification$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject result_$21 = el_expand_all( formula, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
      final SubLObject mt_$22 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$21;
      mt = mt_$22;
      justification = expansion_justification();
    }
    finally
    {
      $expansion_justification$.rebind( _prev_bind_2, thread );
      $gather_expansion_justificationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10076L)
  public static SubLObject el_expand_all_evaluatable_justified(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding( thread );
    try
    {
      $gather_expansion_justificationsP$.bind( T, thread );
      $expansion_justification$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject result_$23 = el_expand_all_evaluatable( formula, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
      final SubLObject mt_$24 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$23;
      mt = mt_$24;
      justification = expansion_justification();
    }
    finally
    {
      $expansion_justification$.rebind( _prev_bind_2, thread );
      $gather_expansion_justificationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10975L)
  public static SubLObject el_expand_all_destructive_justified(final SubLObject formula, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject justification = NIL;
    final SubLObject _prev_bind_0 = $gather_expansion_justificationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $expansion_justification$.currentBinding( thread );
    try
    {
      $gather_expansion_justificationsP$.bind( T, thread );
      $expansion_justification$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject result_$25 = el_expand_all_destructive( formula, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
      final SubLObject mt_$26 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$25;
      mt = mt_$26;
      justification = expansion_justification();
    }
    finally
    {
      $expansion_justification$.rebind( _prev_bind_2, thread );
      $gather_expansion_justificationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11616L)
  public static SubLObject el_relations_out(final SubLObject formula, final SubLObject mt, SubLObject recursion_limit, SubLObject recursion_level)
  {
    if( recursion_limit == UNPROVIDED )
    {
      recursion_limit = $el_relation_recursion_limit$.getDynamicValue();
    }
    if( recursion_level == UNPROVIDED )
    {
      recursion_level = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( recursion_level.numG( recursion_limit ) )
    {
      Dynamic.sublisp_throw( $kw5$RECURSION_LIMIT_EXCEEDED, ConsesLow.list( $kw5$RECURSION_LIMIT_EXCEEDED, recursion_level, recursion_limit ) );
    }
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      return Values.values( formula, mt );
    }
    if( NIL != el_viable_relation_expressionP( formula ) )
    {
      thread.resetMultipleValues();
      final SubLObject new_formula = el_expansion_int( formula, mt );
      final SubLObject new_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( formula.equal( new_formula ) && mt.equal( new_mt ) )
      {
        return Values.values( formula, mt );
      }
      return el_relations_out( new_formula, new_mt, recursion_limit, Numbers.add( ONE_INTEGER, recursion_level ) );
    }
    else if( NIL != el_utilities.mt_designating_literalP( formula ) )
    {
      final SubLObject subsentence = el_utilities.designated_sentence( formula );
      final SubLObject sub_mt = el_utilities.designated_mt( formula );
      if( NIL != hlmt.closed_possibly_hlmt_p( sub_mt ) )
      {
        thread.resetMultipleValues();
        final SubLObject new_sentence = el_relations_out( subsentence, sub_mt, UNPROVIDED, UNPROVIDED );
        final SubLObject new_mt2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values( new_sentence, new_mt2 );
      }
      return Values.values( formula, mt );
    }
    else
    {
      if( NIL != cycl_utilities.formula_find_if( Symbols.symbol_function( $sym9$EXPANDIBLE_EL_RELATION_EXPRESSION_ ), formula, NIL, UNPROVIDED ) )
      {
        SubLObject new_terms = NIL;
        SubLObject new_formula2 = NIL;
        final SubLObject terms = cycl_utilities.formula_terms( formula, $kw10$IGNORE );
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject psn = NIL;
        list_var = terms;
        arg = list_var.first();
        for( psn = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), psn = number_utilities.f_1X( psn ) )
        {
          SubLObject new_term = arg;
          SubLObject new_mt3 = NIL;
          final SubLObject relation = cycl_utilities.formula_operator( formula );
          if( NIL == czer_utilities.leave_some_terms_at_el_for_argP( relation, psn, mt ) && NIL == cycl_grammar.fast_quote_term_p( arg ) )
          {
            thread.resetMultipleValues();
            final SubLObject new_term_$27 = el_relations_out( arg, mt, recursion_limit, Numbers.add( ONE_INTEGER, recursion_level ) );
            final SubLObject new_mt_$28 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_term = new_term_$27;
            new_mt3 = new_mt_$28;
          }
          if( NIL != new_mt3 && NIL == hlmt.hlmt_equal( mt, new_mt3 ) )
          {
            new_terms = ConsesLow.cons( el_utilities.make_ist_sentence( new_mt3, new_term ), new_terms );
          }
          else
          {
            new_terms = ConsesLow.cons( new_term, new_terms );
          }
        }
        new_terms = Sequences.nreverse( new_terms );
        new_formula2 = el_utilities.make_formula( new_terms.first(), new_terms.rest(), el_utilities.sequence_var( formula, UNPROVIDED ) );
        return Values.values( new_formula2, mt );
      }
      return Values.values( formula, mt );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14265L)
  public static SubLObject expandible_el_relation_expressionP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && NIL != fort_types_interface.isa_el_relationP( cycl_utilities.formula_arg0( v_object ), mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14599L)
  public static SubLObject el_expandible_formulaP(final SubLObject formula)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( formula ) && NIL != el_expandible_relationP( cycl_utilities.formula_arg0( formula ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14835L)
  public static SubLObject el_viably_expandible_formulaP(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == el_expandible_formulaP( formula ) )
    {
      return NIL;
    }
    if( NIL != has_viable_expansionP( formula ) || NIL != has_viable_defnP( formula ) )
    {
      return T;
    }
    if( NIL != czer_vars.$within_canonicalizerP$.getDynamicValue( thread ) || NIL != wff_vars.$within_wffP$.getDynamicValue( thread ) )
    {
      Dynamic.sublisp_throw( $kw11$INVALID_EXPANSION, ConsesLow.list( $kw11$INVALID_EXPANSION, formula, cycl_utilities.formula_operator( formula ), kb_mapping_utilities.fpred_value_in_relevant_mts( cycl_utilities
          .formula_operator( formula ), $const12$expansion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15519L)
  public static SubLObject el_viably_expandible_evaluatable_formulaP(final SubLObject formula)
  {
    return makeBoolean( NIL != el_viably_expandible_formulaP( formula ) && NIL != relation_evaluation.evaluatable_expressionP( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15793L)
  public static SubLObject el_expandible_relationP(final SubLObject v_object)
  {
    final SubLObject fortified_object = cycl_utilities.find_when_closed_naut( v_object );
    return makeBoolean( NIL != forts.fort_p( fortified_object ) && NIL != el_expansionP( fortified_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16056L)
  public static SubLObject el_expandible_relation_expressionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && NIL != fort_types_interface.el_relation_p( cycl_utilities.formula_arg0( v_object ) ) && NIL != el_expandible_formulaP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16340L)
  public static SubLObject expandible_relation_expressionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && NIL != el_expandible_formulaP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16566L)
  public static SubLObject el_viable_relation_expressionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && NIL != fort_types_interface.el_relation_p( cycl_utilities.formula_arg0( v_object ) ) && NIL != el_viably_expandible_formulaP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16943L)
  public static SubLObject el_expansionP(final SubLObject v_object)
  {
    return makeBoolean( NIL != kb_mapping_utilities.fpred_value_in_relevant_mts( v_object, $const12$expansion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != kb_mapping_utilities.fpred_value_in_relevant_mts(
        v_object, $const13$expansionDefn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17190L)
  public static SubLObject el_expansion_int(final SubLObject relation_expression, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == hlmt.hlmt_p( mt ) )
    {
      return Values.values( relation_expression, mt );
    }
    final SubLObject relation = cycl_utilities.find_when_closed_naut( cycl_utilities.formula_arg0( relation_expression ) );
    SubLObject expansion = NIL;
    SubLObject expansion_defn = NIL;
    SubLObject result_expression = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject expansion_gaf = kb_mapping_utilities.fpred_value_gaf( relation, $const12$expansion, UNPROVIDED, UNPROVIDED );
      if( NIL != expansion_gaf )
      {
        final SubLObject expansion_template = el_utilities.copy_formula( assertions_high.gaf_arg2( expansion_gaf ) );
        expansion = el_uniquify_formula_vars_wrt( expansion_template, relation_expression );
        possibly_note_expansion_justification_support( expansion_gaf );
      }
      else
      {
        final SubLObject expansion_defn_gaf = kb_mapping_utilities.fpred_value_gaf( relation, $const13$expansionDefn, UNPROVIDED, UNPROVIDED );
        if( NIL != expansion_defn_gaf )
        {
          final SubLObject possible_defn = el_utilities.cycl_subl_symbol_symbol( assertions_high.gaf_arg2( expansion_defn_gaf ) );
          if( NIL != at_defns.viable_defnP( possible_defn, UNPROVIDED ) )
          {
            expansion_defn = possible_defn;
            possibly_note_expansion_justification_support( expansion_defn_gaf );
          }
        }
      }
      if( NIL != expansion )
      {
        SubLObject subst_list = NIL;
        SubLObject arg_number = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( relation_expression, $kw10$IGNORE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          arg_number = Numbers.add( arg_number, ONE_INTEGER );
          final SubLObject old_arg = at_utilities.get_generic_arg( arg_number );
          subst_list = ConsesLow.cons( ConsesLow.cons( old_arg, arg ), subst_list );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        expansion = ( result_expression = conses_high.sublis( subst_list, expansion, UNPROVIDED, UNPROVIDED ) );
      }
      else if( NIL != expansion_defn )
      {
        thread.resetMultipleValues();
        final SubLObject result_expression_$29 = Functions.funcall( expansion_defn, relation_expression );
        final SubLObject mt_$30 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result_expression = result_expression_$29;
        mt = mt_$30;
      }
      else
      {
        result_expression = relation_expression;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result_expression, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19293L)
  public static SubLObject el_formula_expansion_int(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return el_expansion_int( formula, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19386L)
  public static SubLObject el_expansion_recursive(final SubLObject formula, final SubLObject mt, final SubLObject recursion_limit, final SubLObject recursion_level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( recursion_level.numG( recursion_limit ) )
    {
      el_utilities.el_error( TWO_INTEGER, $str14$Trying_to_expand_a_recursive_EL_r, recursion_limit, formula, UNPROVIDED );
      return NIL;
    }
    if( NIL != el_utilities.el_formula_p( formula ) && NIL != el_viably_expandible_formulaP( formula ) )
    {
      thread.resetMultipleValues();
      final SubLObject new_formula = el_expansion_int( formula, mt );
      final SubLObject new_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return el_expansion_recursive( new_formula, new_mt, recursion_limit, Numbers.add( ONE_INTEGER, recursion_level ) );
    }
    return Values.values( formula, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19976L)
  public static SubLObject has_viable_expansionP(final SubLObject relation_expression)
  {
    final SubLObject expansion = kb_mapping_utilities.fpred_value_in_relevant_mts( cycl_utilities.find_when_closed_naut( cycl_utilities.formula_operator( relation_expression ) ), $const12$expansion, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject generic_arg_nums = expansion.isCons() ? list_utilities.tree_gather( transform_list_utilities.ntransform( transform_list_utilities.transform( expansion, Symbols.symbol_function( $sym15$INTEGERP ),
        Symbols.symbol_function( $sym16$NULL ), UNPROVIDED ), Symbols.symbol_function( $sym17$GENERIC_ARG_P ), Symbols.symbol_function( $sym18$GENERIC_ARG_NUM ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols
            .symbol_function( $sym15$INTEGERP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    if( generic_arg_nums.isCons() )
    {
      return el_utilities.formula_arityGE( relation_expression, Functions.apply( Symbols.symbol_function( $sym19$MAX ), generic_arg_nums ), UNPROVIDED );
    }
    return el_utilities.formula_arityE( relation_expression, ZERO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20702L)
  public static SubLObject has_viable_defnP(final SubLObject relation_expression)
  {
    final SubLObject expansion_defn = el_utilities.cycl_subl_symbol_symbol( kb_mapping_utilities.fpred_value_in_relevant_mts( cycl_utilities.formula_operator( relation_expression ), $const13$expansionDefn, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return at_defns.viable_defnP( expansion_defn, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21054L)
  public static SubLObject el_uniquify_wrt(final SubLObject var, final SubLObject formula)
  {
    return ( NIL != list_utilities.tree_find( var, formula, UNPROVIDED, UNPROVIDED ) ) ? clausifier.el_uniquify( var ) : var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21336L)
  public static SubLObject el_uniquify_formula_vars_wrt(final SubLObject formula_to_uniquify, final SubLObject reference_formula)
  {
    return el_uniquify_formula_vars_wrt_int( formula_to_uniquify, reference_formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21685L)
  public static SubLObject el_nuniquify_formula_vars_wrt(final SubLObject formula_to_uniquify, final SubLObject reference_formula)
  {
    return el_uniquify_formula_vars_wrt_int( formula_to_uniquify, reference_formula, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22029L)
  public static SubLObject el_uniquify_formula_vars_wrt_int(final SubLObject formula_to_uniquify, final SubLObject reference_formula, final SubLObject destructiveP)
  {
    if( NIL == el_utilities.el_formula_p( formula_to_uniquify ) )
    {
      return formula_to_uniquify;
    }
    final SubLObject candidate_vars_to_uniquify = cycl_utilities.formula_gather( formula_to_uniquify, Symbols.symbol_function( $sym20$EL_VAR_ ), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject reference_vars = ( NIL != candidate_vars_to_uniquify ) ? cycl_utilities.formula_gather( reference_formula, Symbols.symbol_function( $sym20$EL_VAR_ ), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject vars_to_uniquify = ( NIL != candidate_vars_to_uniquify && NIL != reference_vars ) ? conses_high.nintersection( candidate_vars_to_uniquify, reference_vars, UNPROVIDED, UNPROVIDED ) : NIL;
    if( NIL != vars_to_uniquify )
    {
      SubLObject alist = NIL;
      SubLObject cdolist_list_var = vars_to_uniquify;
      SubLObject var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        alist = ConsesLow.cons( ConsesLow.cons( var, clausifier.el_uniquify( var ) ), alist );
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
      return ( NIL != destructiveP ) ? conses_high.nsublis( alist, formula_to_uniquify, UNPROVIDED, UNPROVIDED ) : conses_high.sublis( alist, formula_to_uniquify, UNPROVIDED, UNPROVIDED );
    }
    return formula_to_uniquify;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22958L)
  public static SubLObject expansion_nautP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_boolean = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      if( NIL != term.first_order_nautP( v_object ) )
      {
        final SubLObject function = cycl_utilities.nat_arg0( v_object );
        v_boolean = arg0_of_any_expansionP( function );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_boolean;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23387L)
  public static SubLObject arg0_of_any_expansionP(final SubLObject relation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( relation ) )
    {
      SubLObject v_boolean = NIL;
      final SubLObject _prev_bind_0 = control_vars.$mapping_source$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding( thread );
      try
      {
        control_vars.$mapping_source$.bind( relation, thread );
        control_vars.$mapping_answer$.bind( NIL, thread );
        kb_mapping.map_other_index( $sym21$EXPANSION_ARG2_ARG0_P, relation, $kw22$TRUE, T );
        v_boolean = control_vars.$mapping_answer$.getDynamicValue( thread );
      }
      finally
      {
        control_vars.$mapping_answer$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_source$.rebind( _prev_bind_0, thread );
      }
      return v_boolean;
    }
    if( NIL != term.first_order_nautP( relation ) )
    {
      return arg0_of_any_expansionP( narts_high.find_nart( relation ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23912L)
  public static SubLObject expansion_arg2_arg0_p(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.gaf_assertionP( assertion ) && $const12$expansion.eql( assertions_high.gaf_arg0( assertion ) ) && control_vars.$mapping_source$.getDynamicValue( thread ).eql( cycl_utilities.formula_arg0(
        assertions_high.gaf_arg2( assertion ) ) ) )
    {
      control_vars.$mapping_answer$.setDynamicValue( T, thread );
      utilities_macros.mapping_finished();
    }
    return NIL;
  }

  public static SubLObject declare_verbosifier_file()
  {
    SubLFiles.declareFunction( me, "verbosify_cycl", "VERBOSIFY-CYCL", 1, 2, false );
    SubLFiles.declareFunction( me, "el_expansion", "EL-EXPANSION", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expansion_destructive", "EL-EXPANSION-DESTRUCTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expansion_one_step", "EL-EXPANSION-ONE-STEP", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expansion_one_step_destructive", "EL-EXPANSION-ONE-STEP-DESTRUCTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expand_all", "EL-EXPAND-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expand_all_evaluatable", "EL-EXPAND-ALL-EVALUATABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expand_all_int", "EL-EXPAND-ALL-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "el_expand_all_destructive", "EL-EXPAND-ALL-DESTRUCTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expandible_subformulaP", "EL-EXPANDIBLE-SUBFORMULA?", 1, 1, false );
    SubLFiles.declareFunction( me, "gathering_expansion_justificationsP", "GATHERING-EXPANSION-JUSTIFICATIONS?", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_note_expansion_justification_support", "POSSIBLY-NOTE-EXPANSION-JUSTIFICATION-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "note_expansion_justification_support", "NOTE-EXPANSION-JUSTIFICATION-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "expansion_justification", "EXPANSION-JUSTIFICATION", 0, 0, false );
    SubLFiles.declareMacro( me, "gathering_expansion_justifications", "GATHERING-EXPANSION-JUSTIFICATIONS" );
    SubLFiles.declareFunction( me, "verbosify_cycl_justified", "VERBOSIFY-CYCL-JUSTIFIED", 1, 2, false );
    SubLFiles.declareFunction( me, "el_expansion_justified", "EL-EXPANSION-JUSTIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expansion_destructive_justified", "EL-EXPANSION-DESTRUCTIVE-JUSTIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expansion_one_step_justified", "EL-EXPANSION-ONE-STEP-JUSTIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expansion_one_step_destructive_justified", "EL-EXPANSION-ONE-STEP-DESTRUCTIVE-JUSTIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expand_all_justified", "EL-EXPAND-ALL-JUSTIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expand_all_evaluatable_justified", "EL-EXPAND-ALL-EVALUATABLE-JUSTIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "el_expand_all_destructive_justified", "EL-EXPAND-ALL-DESTRUCTIVE-JUSTIFIED", 2, 0, false );
    SubLFiles.declareFunction( me, "el_relations_out", "EL-RELATIONS-OUT", 2, 2, false );
    SubLFiles.declareFunction( me, "expandible_el_relation_expressionP", "EXPANDIBLE-EL-RELATION-EXPRESSION?", 1, 1, false );
    new $expandible_el_relation_expressionP$UnaryFunction();
    new $expandible_el_relation_expressionP$BinaryFunction();
    SubLFiles.declareFunction( me, "el_expandible_formulaP", "EL-EXPANDIBLE-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_viably_expandible_formulaP", "EL-VIABLY-EXPANDIBLE-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_viably_expandible_evaluatable_formulaP", "EL-VIABLY-EXPANDIBLE-EVALUATABLE-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_expandible_relationP", "EL-EXPANDIBLE-RELATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_expandible_relation_expressionP", "EL-EXPANDIBLE-RELATION-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "expandible_relation_expressionP", "EXPANDIBLE-RELATION-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_viable_relation_expressionP", "EL-VIABLE-RELATION-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_expansionP", "EL-EXPANSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_expansion_int", "EL-EXPANSION-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "el_formula_expansion_int", "EL-FORMULA-EXPANSION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "el_expansion_recursive", "EL-EXPANSION-RECURSIVE", 4, 0, false );
    SubLFiles.declareFunction( me, "has_viable_expansionP", "HAS-VIABLE-EXPANSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "has_viable_defnP", "HAS-VIABLE-DEFN?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_uniquify_wrt", "EL-UNIQUIFY-WRT", 2, 0, false );
    SubLFiles.declareFunction( me, "el_uniquify_formula_vars_wrt", "EL-UNIQUIFY-FORMULA-VARS-WRT", 2, 0, false );
    SubLFiles.declareFunction( me, "el_nuniquify_formula_vars_wrt", "EL-NUNIQUIFY-FORMULA-VARS-WRT", 2, 0, false );
    SubLFiles.declareFunction( me, "el_uniquify_formula_vars_wrt_int", "EL-UNIQUIFY-FORMULA-VARS-WRT-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "expansion_nautP", "EXPANSION-NAUT?", 1, 1, false );
    SubLFiles.declareFunction( me, "arg0_of_any_expansionP", "ARG0-OF-ANY-EXPANSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "expansion_arg2_arg0_p", "EXPANSION-ARG2-ARG0-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_verbosifier_file()
  {
    $el_relation_recursion_limit$ = SubLFiles.defparameter( "*EL-RELATION-RECURSION-LIMIT*", $int0$212 );
    $gather_expansion_justificationsP$ = SubLFiles.defparameter( "*GATHER-EXPANSION-JUSTIFICATIONS?*", NIL );
    $expansion_justification$ = SubLFiles.defparameter( "*EXPANSION-JUSTIFICATION*", NIL );
    return NIL;
  }

  public static SubLObject setup_verbosifier_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_verbosifier_file();
  }

  @Override
  public void initializeVariables()
  {
    init_verbosifier_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_verbosifier_file();
  }
  static
  {
    me = new verbosifier();
    $el_relation_recursion_limit$ = null;
    $gather_expansion_justificationsP$ = null;
    $expansion_justification$ = null;
    $int0$212 = makeInteger( 212 );
    $sym1$EL_VIABLY_EXPANDIBLE_FORMULA_ = makeSymbol( "EL-VIABLY-EXPANDIBLE-FORMULA?" );
    $sym2$EL_VIABLY_EXPANDIBLE_EVALUATABLE_FORMULA_ = makeSymbol( "EL-VIABLY-EXPANDIBLE-EVALUATABLE-FORMULA?" );
    $kw3$TRANSFORMATION_LIMIT_EXCEEDED = makeKeyword( "TRANSFORMATION-LIMIT-EXCEEDED" );
    $sym4$EL_FORMULA_EXPANSION_INT = makeSymbol( "EL-FORMULA-EXPANSION-INT" );
    $kw5$RECURSION_LIMIT_EXCEEDED = makeKeyword( "RECURSION-LIMIT-EXCEEDED" );
    $sym6$EXPANDIBLE_RELATION_EXPRESSION_ = makeSymbol( "EXPANDIBLE-RELATION-EXPRESSION?" );
    $sym7$CLET = makeSymbol( "CLET" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "*GATHER-EXPANSION-JUSTIFICATIONS?*" ), T ), ConsesLow.list( makeSymbol( "*EXPANSION-JUSTIFICATION*" ), NIL ) );
    $sym9$EXPANDIBLE_EL_RELATION_EXPRESSION_ = makeSymbol( "EXPANDIBLE-EL-RELATION-EXPRESSION?" );
    $kw10$IGNORE = makeKeyword( "IGNORE" );
    $kw11$INVALID_EXPANSION = makeKeyword( "INVALID-EXPANSION" );
    $const12$expansion = constant_handles.reader_make_constant_shell( makeString( "expansion" ) );
    $const13$expansionDefn = constant_handles.reader_make_constant_shell( makeString( "expansionDefn" ) );
    $str14$Trying_to_expand_a_recursive_EL_r = makeString( "Trying to expand a recursive EL relation, hit the recursion limit ~D while expanding ~A~%" );
    $sym15$INTEGERP = makeSymbol( "INTEGERP" );
    $sym16$NULL = makeSymbol( "NULL" );
    $sym17$GENERIC_ARG_P = makeSymbol( "GENERIC-ARG-P" );
    $sym18$GENERIC_ARG_NUM = makeSymbol( "GENERIC-ARG-NUM" );
    $sym19$MAX = makeSymbol( "MAX" );
    $sym20$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym21$EXPANSION_ARG2_ARG0_P = makeSymbol( "EXPANSION-ARG2-ARG0-P" );
    $kw22$TRUE = makeKeyword( "TRUE" );
  }

  public static final class $expandible_el_relation_expressionP$UnaryFunction
      extends
        UnaryFunction
  {
    public $expandible_el_relation_expressionP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EXPANDIBLE-EL-RELATION-EXPRESSION?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return expandible_el_relation_expressionP( arg1, UNPROVIDED );
    }
  }

  public static final class $expandible_el_relation_expressionP$BinaryFunction
      extends
        BinaryFunction
  {
    public $expandible_el_relation_expressionP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EXPANDIBLE-EL-RELATION-EXPRESSION?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return expandible_el_relation_expressionP( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 163 ms
 * 
 */