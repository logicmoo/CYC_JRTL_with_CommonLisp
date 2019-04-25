package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.equals;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_different
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_different";
  public static final String myFingerPrint = "940d912db85fcdc5b293015df6787176ba74adcd43e808234a3c33edf87164f2";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 548L)
  private static SubLSymbol $default_different_duplicate_cost$;
  private static final SubLObject $const0$different;
  private static final SubLSymbol $kw1$REMOVAL_EVAL;
  private static final SubLSymbol $kw2$REMOVAL_NOT_EVAL;
  private static final SubLSymbol $kw3$POS;
  private static final SubLSymbol $kw4$REMOVAL_DIFFERENT_DUPLICATE;
  private static final SubLList $list5;
  private static final SubLObject $const6$differentSymbols;
  private static final SubLSymbol $kw7$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
  private static final SubLSymbol $kw8$META_REMOVAL_COMPLETELY_DECIDABLE_POS;
  private static final SubLSymbol $kw9$REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_SKSI_DIFFERENT_POS;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$REMOVAL_SKSI_DIFFERENT_EXPAND;
  private static final SubLSymbol $sym16$REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND;
  private static final SubLSymbol $kw17$QUERY;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 670L)
  public static SubLObject asent_duplicate_args_p(final SubLObject asent)
  {
    return list_utilities.duplicatesP( cycl_utilities.atomic_sentence_args( asent, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 778L)
  public static SubLObject make_binary_different_eval_support(final SubLObject term1, final SubLObject term2)
  {
    final SubLObject different_sentence = backward_utilities.inference_canonicalize_hl_support_literal( el_utilities.make_binary_formula( $const0$different, term1, term2 ) );
    return removal_modules_evaluation.make_eval_support( different_sentence, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 1816L)
  public static SubLObject removal_different_duplicate_exclusive(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return asent_duplicate_args_p( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 3193L)
  public static SubLObject removal_different_symbols_duplicate_exclusive(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return asent_duplicate_args_p( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 3842L)
  public static SubLObject cyc_possibly_evaluate(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject evaluated_term = relation_evaluation.cyc_evaluate( v_term );
    final SubLObject validP = thread.secondMultipleValue();
    final SubLObject contextualizedP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( ( NIL != validP ) ? evaluated_term : v_term, ( NIL != validP ) ? contextualizedP : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4286L)
  public static SubLObject cyc_possibly_evaluate_args(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject simplified_args = NIL;
    SubLObject some_arg_contextualizedP = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject simplified_arg = cyc_possibly_evaluate( arg );
      final SubLObject contextualizedP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      simplified_args = ConsesLow.cons( simplified_arg, simplified_args );
      some_arg_contextualizedP = makeBoolean( NIL != some_arg_contextualizedP || NIL != contextualizedP );
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( simplified_args ), some_arg_contextualizedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4753L)
  public static SubLObject removal_sksi_different_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject args = cycl_utilities.formula_args( asent, UNPROVIDED );
    final SubLObject simplified_args = cyc_possibly_evaluate_args( args );
    final SubLObject differentP = equals.differentP( simplified_args, UNPROVIDED );
    if( NIL != differentP )
    {
      return removal_sksi_different_expand_int( asent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4753L)
  public static SubLObject removal_sksi_different_symbols_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject args = cycl_utilities.formula_args( asent, UNPROVIDED );
    final SubLObject simplified_args = cyc_possibly_evaluate_args( args );
    final SubLObject differentP = evaluation_defns.cyc_different_symbols( simplified_args );
    if( NIL != differentP )
    {
      return removal_sksi_different_expand_int( asent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 4753L)
  public static SubLObject removal_sksi_different_expand_int(final SubLObject asent)
  {
    final SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal( asent );
    final SubLObject support = arguments.make_hl_support( $kw17$QUERY, hl_support_formula, UNPROVIDED, UNPROVIDED );
    return backward.removal_add_node( support, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_removal_modules_different_file()
  {
    SubLFiles.declareFunction( me, "asent_duplicate_args_p", "ASENT-DUPLICATE-ARGS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "make_binary_different_eval_support", "MAKE-BINARY-DIFFERENT-EVAL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_different_duplicate_exclusive", "REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE", 1, 1, false );
    new $removal_different_duplicate_exclusive$UnaryFunction();
    new $removal_different_duplicate_exclusive$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_different_symbols_duplicate_exclusive", "REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_possibly_evaluate", "CYC-POSSIBLY-EVALUATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_possibly_evaluate_args", "CYC-POSSIBLY-EVALUATE-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_sksi_different_expand", "REMOVAL-SKSI-DIFFERENT-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_sksi_different_symbols_expand", "REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_sksi_different_expand_int", "REMOVAL-SKSI-DIFFERENT-EXPAND-INT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_different_file()
  {
    $default_different_duplicate_cost$ = SubLFiles.defparameter( "*DEFAULT-DIFFERENT-DUPLICATE-COST*", ZERO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_different_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$different );
    inference_modules.inference_removal_module_use_generic( $const0$different, $kw1$REMOVAL_EVAL );
    inference_modules.inference_removal_module_use_generic( $const0$different, $kw2$REMOVAL_NOT_EVAL );
    preference_modules.doomed_unless_all_args_bindable( $kw3$POS, $const0$different );
    inference_modules.inference_removal_module( $kw4$REMOVAL_DIFFERENT_DUPLICATE, $list5 );
    inference_modules.register_solely_specific_removal_module_predicate( $const6$differentSymbols );
    inference_modules.inference_removal_module_use_generic( $const6$differentSymbols, $kw1$REMOVAL_EVAL );
    inference_modules.inference_removal_module_use_generic( $const6$differentSymbols, $kw2$REMOVAL_NOT_EVAL );
    inference_modules.inference_removal_module_use_meta_removal( $const6$differentSymbols, $kw7$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const6$differentSymbols, $kw8$META_REMOVAL_COMPLETELY_DECIDABLE_POS );
    preference_modules.doomed_unless_all_args_bindable( $kw3$POS, $const6$differentSymbols );
    inference_modules.inference_removal_module( $kw9$REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE, $list10 );
    inference_modules.inference_removal_module( $kw11$REMOVAL_SKSI_DIFFERENT_POS, $list12 );
    inference_modules.inference_removal_module( $kw13$REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS, $list14 );
    utilities_macros.note_funcall_helper_function( $sym15$REMOVAL_SKSI_DIFFERENT_EXPAND );
    utilities_macros.note_funcall_helper_function( $sym16$REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_different_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_different_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_different_file();
  }
  static
  {
    me = new removal_modules_different();
    $default_different_duplicate_cost$ = null;
    $const0$different = constant_handles.reader_make_constant_shell( makeString( "different" ) );
    $kw1$REMOVAL_EVAL = makeKeyword( "REMOVAL-EVAL" );
    $kw2$REMOVAL_NOT_EVAL = makeKeyword( "REMOVAL-NOT-EVAL" );
    $kw3$POS = makeKeyword( "POS" );
    $kw4$REMOVAL_DIFFERENT_DUPLICATE = makeKeyword( "REMOVAL-DIFFERENT-DUPLICATE" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "different" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "different" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol(
            "REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE" ), makeKeyword( "SUPPLANTS" ), makeKeyword( "ALL" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-DIFFERENT-DUPLICATE-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" )
    } );
    $const6$differentSymbols = constant_handles.reader_make_constant_shell( makeString( "differentSymbols" ) );
    $kw7$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword( "META-REMOVAL-COMPLETELY-ENUMERABLE-POS" );
    $kw8$META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword( "META-REMOVAL-COMPLETELY-DECIDABLE-POS" );
    $kw9$REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE = makeKeyword( "REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "differentSymbols" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "differentSymbols" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol(
            "REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE" ), makeKeyword( "SUPPLANTS" ), makeKeyword( "ALL" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-DIFFERENT-DUPLICATE-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" )
    } );
    $kw11$REMOVAL_SKSI_DIFFERENT_POS = makeKeyword( "REMOVAL-SKSI-DIFFERENT-POS" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "different" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "different" ) ), makeKeyword( "FULLY-BOUND" ) ), ConsesLow.list( makeKeyword(
            "OR" ), ConsesLow.list( makeKeyword( "TREE-FIND-IF" ), makeSymbol( "SCHEMA-OBJECT-FN-EXPRESSION-P" ) ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "SUPPLANTS" ), ConsesLow.list(
                makeKeyword( "REMOVAL-EVAL" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-DIFFERENT-DUPLICATE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-SKSI-DIFFERENT-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$different (#$SchemaObjectFn :fully-bound :fully-bound) (#$SchemaObjectFn :fully-bound :fully-bound))" ), makeKeyword(
          "EXAMPLE" ), makeString( "(#$different (#$SchemaObjectFn #$TwoLetterStateCodes \"MN\") (#$SchemaObjectFn #$TwoLetterStateCodes \"WI\"))" )
    } );
    $kw13$REMOVAL_SKSI_DIFFERENT_SYMBOLS_POS = makeKeyword( "REMOVAL-SKSI-DIFFERENT-SYMBOLS-POS" );
    $list14 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "differentSymbols" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "differentSymbols" ) ), makeKeyword( "FULLY-BOUND" ) ), ConsesLow.list(
            makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "TREE-FIND-IF" ), makeSymbol( "SCHEMA-OBJECT-FN-EXPRESSION-P" ) ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "SUPPLANTS" ), ConsesLow
                .list( makeKeyword( "REMOVAL-EVAL" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-DIFFERENT-DUPLICATE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                    "EXPAND" ), makeSymbol( "REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND" )
    } );
    $sym15$REMOVAL_SKSI_DIFFERENT_EXPAND = makeSymbol( "REMOVAL-SKSI-DIFFERENT-EXPAND" );
    $sym16$REMOVAL_SKSI_DIFFERENT_SYMBOLS_EXPAND = makeSymbol( "REMOVAL-SKSI-DIFFERENT-SYMBOLS-EXPAND" );
    $kw17$QUERY = makeKeyword( "QUERY" );
  }

  public static final class $removal_different_duplicate_exclusive$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_different_duplicate_exclusive$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_different_duplicate_exclusive( arg1, $removal_different_duplicate_exclusive$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_different_duplicate_exclusive$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_different_duplicate_exclusive$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_different_duplicate_exclusive( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 90 ms
 * 
 */