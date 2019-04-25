package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pred_relevance_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pred_relevance_macros";
  public static final String myFingerPrint = "8ccd0e6721bdc936becbf3d2cfa92d586e9b76931acc373ed833495408716764";
  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1130L)
  public static SubLSymbol $pred$;
  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1221L)
  public static SubLSymbol $relevant_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1257L)
  public static SubLSymbol $relevant_pred_function$;
  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
  public static SubLSymbol $dtp_pred_info_object$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$RELEVANT_PRED_IS_EVERYTHING;
  private static final SubLSymbol $sym2$RELEVANT_PRED_IS_EQ;
  private static final SubLSymbol $sym3$RELEVANT_PRED_IS_IN_LIST;
  private static final SubLSymbol $sym4$RELEVANT_PRED_IS_NOT_IN_LIST;
  private static final SubLSymbol $sym5$RELEVANT_PRED_IS_SPEC_PRED;
  private static final SubLSymbol $sym6$RELEVANT_PRED_IS_SPEC_INVERSE;
  private static final SubLSymbol $sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE;
  private static final SubLSymbol $sym8$RELEVANT_PRED_WRT_GT_;
  private static final SubLSymbol $sym9$INFERENCE_GENL_PREDICATE_OF_;
  private static final SubLSymbol $sym10$INFERENCE_GENL_INVERSE_OF_;
  private static final SubLSymbol $sym11$INFERENCE_GENL_PREDICATE_;
  private static final SubLSymbol $sym12$INFERENCE_GENL_INVERSE_;
  private static final SubLSymbol $sym13$INFERENCE_NEGATION_PREDICATE_;
  private static final SubLSymbol $kw14$ALL;
  private static final SubLSymbol $kw15$UNABLE_TO_DETERMINE;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$CLET;
  private static final SubLSymbol $sym18$_RELEVANT_PRED_FUNCTION_;
  private static final SubLSymbol $sym19$WITH_PREDICATE_FUNCTION;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$_PRED_;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$_RELEVANT_PREDS_;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$PCASE;
  private static final SubLSymbol $sym33$WITH_JUST_PREDICATE;
  private static final SubLSymbol $sym34$WITH_ALL_SPEC_PREDICATES;
  private static final SubLSymbol $sym35$WITH_ALL_SPEC_INVERSES;
  private static final SubLSymbol $sym36$WITH_ALL_SPEC_PREDICATES_AND_INVERSES;
  private static final SubLSymbol $sym37$PROGN;
  private static final SubLSymbol $sym38$PREDICATE_VAR;
  private static final SubLSymbol $sym39$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION;
  private static final SubLSymbol $sym40$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE;
  private static final SubLSymbol $sym41$POSSIBLY_WITH_JUST_PREDICATE;
  private static final SubLSymbol $sym42$FORT_P;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE;
  private static final SubLSymbol $sym46$_INFERENCE_LITERAL_;
  private static final SubLSymbol $sym47$_INFERENCE_SENSE_;
  private static final SubLSymbol $sym48$DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE;
  private static final SubLSymbol $sym49$WITH_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE;
  private static final SubLSymbol $kw50$POS;
  private static final SubLSymbol $sym51$WITH_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE;
  private static final SubLSymbol $sym52$PRED_INFO_OBJECT;
  private static final SubLSymbol $sym53$PRED_INFO_OBJECT_P;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$PRINT_PRED_INFO_OBJECT;
  private static final SubLSymbol $sym59$PRED_INFO_OBJECT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$PRED_INFO_PRED;
  private static final SubLSymbol $sym62$_CSETF_PRED_INFO_PRED;
  private static final SubLSymbol $sym63$PRED_INFO_RELEVANCE_FUNCTION;
  private static final SubLSymbol $sym64$_CSETF_PRED_INFO_RELEVANCE_FUNCTION;
  private static final SubLSymbol $kw65$PRED;
  private static final SubLSymbol $kw66$RELEVANCE_FUNCTION;
  private static final SubLString $str67$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw68$BEGIN;
  private static final SubLSymbol $sym69$MAKE_PRED_INFO_OBJECT;
  private static final SubLSymbol $kw70$SLOT;
  private static final SubLSymbol $kw71$END;
  private static final SubLSymbol $sym72$VISIT_DEFSTRUCT_OBJECT_PRED_INFO_OBJECT_METHOD;
  private static final SubLString $str73$__PRED_INFO__s__s_;
  private static final SubLSymbol $sym74$PRED_INFO;

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1614L)
  public static SubLObject relevant_pred_is_everything(final SubLObject pred)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1693L)
  public static SubLObject relevant_pred_is_eq(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eql( $pred$.getDynamicValue( thread ), pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1764L)
  public static SubLObject relevant_pred_is_in_list(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( pred, $relevant_preds$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1854L)
  public static SubLObject relevant_pred_is_not_in_list(final SubLObject pred)
  {
    return makeBoolean( NIL == relevant_pred_is_in_list( pred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 1955L)
  public static SubLObject relevant_pred_is_spec_pred(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != relevant_pred_is_eq( pred ) || NIL != predicate_relevance_cache.cached_spec_predP( $pred$.getDynamicValue( thread ), pred, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 2143L)
  public static SubLObject relevant_pred_is_spec_inverse(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return predicate_relevance_cache.cached_spec_inverseP( $pred$.getDynamicValue( thread ), pred, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 2241L)
  public static SubLObject relevant_pred_is_spec_pred_or_inverse(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != relevant_pred_is_eq( pred ) || NIL != predicate_relevance_cache.cached_spec_predP( $pred$.getDynamicValue( thread ), pred, UNPROVIDED ) || NIL != predicate_relevance_cache
        .cached_spec_inverseP( $pred$.getDynamicValue( thread ), pred, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 2480L)
  public static SubLObject relevant_predP(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pred_relevance_undefined_p() )
    {
      return T;
    }
    final SubLObject pcase_var = $relevant_pred_function$.getDynamicValue( thread );
    if( pcase_var.eql( $sym1$RELEVANT_PRED_IS_EVERYTHING ) )
    {
      return relevant_pred_is_everything( pred );
    }
    if( pcase_var.eql( $sym2$RELEVANT_PRED_IS_EQ ) )
    {
      return relevant_pred_is_eq( pred );
    }
    if( pcase_var.eql( $sym3$RELEVANT_PRED_IS_IN_LIST ) )
    {
      return relevant_pred_is_in_list( pred );
    }
    if( pcase_var.eql( $sym4$RELEVANT_PRED_IS_NOT_IN_LIST ) )
    {
      return relevant_pred_is_not_in_list( pred );
    }
    if( pcase_var.eql( $sym5$RELEVANT_PRED_IS_SPEC_PRED ) )
    {
      return relevant_pred_is_spec_pred( pred );
    }
    if( pcase_var.eql( $sym6$RELEVANT_PRED_IS_SPEC_INVERSE ) )
    {
      return relevant_pred_is_spec_inverse( pred );
    }
    if( pcase_var.eql( $sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE ) )
    {
      return relevant_pred_is_spec_pred_or_inverse( pred );
    }
    if( pcase_var.eql( $sym8$RELEVANT_PRED_WRT_GT_ ) )
    {
      return ghl_link_iterators.relevant_pred_wrt_gtP( pred );
    }
    if( pcase_var.eql( $sym9$INFERENCE_GENL_PREDICATE_OF_ ) )
    {
      return inference_genl_predicate_ofP( pred );
    }
    if( pcase_var.eql( $sym10$INFERENCE_GENL_INVERSE_OF_ ) )
    {
      return inference_genl_inverse_ofP( pred );
    }
    if( pcase_var.eql( $sym11$INFERENCE_GENL_PREDICATE_ ) )
    {
      return inference_genl_predicateP( pred );
    }
    if( pcase_var.eql( $sym12$INFERENCE_GENL_INVERSE_ ) )
    {
      return inference_genl_inverseP( pred );
    }
    if( pcase_var.eql( $sym13$INFERENCE_NEGATION_PREDICATE_ ) )
    {
      return inference_negation_predicateP( pred );
    }
    return Functions.funcall( $relevant_pred_function$.getDynamicValue( thread ), pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 3901L)
  public static SubLObject all_possibly_relevant_preds()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pred_relevance_undefined_p() )
    {
      return $kw14$ALL;
    }
    final SubLObject pred = $pred$.getDynamicValue( thread );
    final SubLObject pcase_var = $relevant_pred_function$.getDynamicValue( thread );
    if( pcase_var.eql( $sym1$RELEVANT_PRED_IS_EVERYTHING ) )
    {
      return $kw14$ALL;
    }
    if( pcase_var.eql( $sym2$RELEVANT_PRED_IS_EQ ) )
    {
      return ConsesLow.list( pred );
    }
    if( pcase_var.eql( $sym3$RELEVANT_PRED_IS_IN_LIST ) )
    {
      return $relevant_preds$.getDynamicValue( thread );
    }
    if( pcase_var.eql( $sym4$RELEVANT_PRED_IS_NOT_IN_LIST ) )
    {
      return $kw15$UNABLE_TO_DETERMINE;
    }
    if( pcase_var.eql( $sym5$RELEVANT_PRED_IS_SPEC_PRED ) )
    {
      return genl_predicates.all_spec_preds( pred, UNPROVIDED, UNPROVIDED );
    }
    if( pcase_var.eql( $sym6$RELEVANT_PRED_IS_SPEC_INVERSE ) )
    {
      return genl_predicates.all_spec_inverses( pred, UNPROVIDED, UNPROVIDED );
    }
    if( pcase_var.eql( $sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE ) )
    {
      return ConsesLow.append( genl_predicates.all_spec_preds( pred, UNPROVIDED, UNPROVIDED ), genl_predicates.all_spec_inverses( pred, UNPROVIDED, UNPROVIDED ) );
    }
    if( pcase_var.eql( $sym8$RELEVANT_PRED_WRT_GT_ ) )
    {
      return ghl_link_iterators.all_possibly_relevant_gt_preds();
    }
    if( pcase_var.eql( $sym9$INFERENCE_GENL_PREDICATE_OF_ ) )
    {
      final SubLObject inference_pred = el_utilities.literal_predicate( control_vars.$inference_literal$.getDynamicValue( thread ), UNPROVIDED );
      if( NIL != inference_pred )
      {
        return Sequences.remove( inference_pred, genl_predicates.all_spec_preds( inference_pred, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return $kw14$ALL;
    }
    else if( pcase_var.eql( $sym10$INFERENCE_GENL_INVERSE_OF_ ) )
    {
      final SubLObject inference_pred = el_utilities.literal_predicate( control_vars.$inference_literal$.getDynamicValue( thread ), UNPROVIDED );
      if( NIL != inference_pred )
      {
        return Sequences.remove( inference_pred, genl_predicates.all_spec_inverses( inference_pred, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return $kw14$ALL;
    }
    else if( pcase_var.eql( $sym11$INFERENCE_GENL_PREDICATE_ ) )
    {
      final SubLObject inference_pred = el_utilities.literal_predicate( control_vars.$inference_literal$.getDynamicValue( thread ), UNPROVIDED );
      if( NIL != inference_pred )
      {
        return Sequences.remove( inference_pred, genl_predicates.all_genl_preds( inference_pred, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return $kw14$ALL;
    }
    else if( pcase_var.eql( $sym12$INFERENCE_GENL_INVERSE_ ) )
    {
      final SubLObject inference_pred = el_utilities.literal_predicate( control_vars.$inference_literal$.getDynamicValue( thread ), UNPROVIDED );
      if( NIL != inference_pred )
      {
        return Sequences.remove( inference_pred, genl_predicates.all_genl_inverses( inference_pred, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return $kw14$ALL;
    }
    else
    {
      if( !pcase_var.eql( $sym13$INFERENCE_NEGATION_PREDICATE_ ) )
      {
        return $kw15$UNABLE_TO_DETERMINE;
      }
      final SubLObject inference_pred = el_utilities.literal_predicate( control_vars.$inference_literal$.getDynamicValue( thread ), UNPROVIDED );
      if( NIL != inference_pred )
      {
        return Sequences.remove( inference_pred, negation_predicate.all_negation_preds( inference_pred, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return $kw14$ALL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 6289L)
  public static SubLObject pred_relevance_undefined_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == $relevant_pred_function$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 6377L)
  public static SubLObject all_preds_are_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != pred_relevance_undefined_p() || $sym1$RELEVANT_PRED_IS_EVERYTHING == $relevant_pred_function$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 6528L)
  public static SubLObject only_specified_pred_is_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $sym2$RELEVANT_PRED_IS_EQ, $relevant_pred_function$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 6640L)
  public static SubLObject only_specified_predicate_list_is_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $sym3$RELEVANT_PRED_IS_IN_LIST, $relevant_pred_function$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 6767L)
  public static SubLObject with_predicate_function(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
    function = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym17$CLET, ConsesLow.list( ConsesLow.list( $sym18$_RELEVANT_PRED_FUNCTION_, function ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 7053L)
  public static SubLObject with_all_predicates(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym19$WITH_PREDICATE_FUNCTION, $list20, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 7224L)
  public static SubLObject with_just_predicate(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    predicate = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym19$WITH_PREDICATE_FUNCTION, $list22, ConsesLow.listS( $sym17$CLET, ConsesLow.list( ConsesLow.list( $sym23$_PRED_, predicate ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 7440L)
  public static SubLObject with_predicate_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    predicates = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym19$WITH_PREDICATE_FUNCTION, $list25, ConsesLow.listS( $sym17$CLET, ConsesLow.list( ConsesLow.list( $sym26$_RELEVANT_PREDS_, predicates ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 7685L)
  public static SubLObject with_predicates_not_in_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicates = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    predicates = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym19$WITH_PREDICATE_FUNCTION, $list27, ConsesLow.listS( $sym17$CLET, ConsesLow.list( ConsesLow.list( $sym26$_RELEVANT_PREDS_, predicates ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 7933L)
  public static SubLObject with_all_spec_predicates(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    predicate = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym19$WITH_PREDICATE_FUNCTION, $list28, ConsesLow.listS( $sym17$CLET, ConsesLow.list( ConsesLow.list( $sym23$_PRED_, predicate ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 8174L)
  public static SubLObject with_all_spec_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    predicate = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym19$WITH_PREDICATE_FUNCTION, $list29, ConsesLow.listS( $sym17$CLET, ConsesLow.list( ConsesLow.list( $sym23$_PRED_, predicate ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 8414L)
  public static SubLObject with_all_spec_predicates_and_inverses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    predicate = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym19$WITH_PREDICATE_FUNCTION, $list30, ConsesLow.listS( $sym17$CLET, ConsesLow.list( ConsesLow.list( $sym23$_PRED_, predicate ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 8706L)
  public static SubLObject with_pred_and_relevance(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicate = NIL;
    SubLObject relevance_function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    relevance_function = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym32$PCASE, relevance_function, ConsesLow.list( $sym2$RELEVANT_PRED_IS_EQ, ConsesLow.listS( $sym33$WITH_JUST_PREDICATE, predicate, ConsesLow.append( body, NIL ) ) ), ConsesLow.list(
        $sym5$RELEVANT_PRED_IS_SPEC_PRED, ConsesLow.listS( $sym34$WITH_ALL_SPEC_PREDICATES, predicate, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym6$RELEVANT_PRED_IS_SPEC_INVERSE, ConsesLow.listS(
            $sym35$WITH_ALL_SPEC_INVERSES, predicate, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE, ConsesLow.listS( $sym36$WITH_ALL_SPEC_PREDICATES_AND_INVERSES,
                predicate, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 9272L)
  public static SubLObject possibly_with_just_predicate(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    predicate = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL == predicate )
    {
      return reader.bq_cons( $sym37$PROGN, ConsesLow.append( body, NIL ) );
    }
    final SubLObject predicate_var = $sym38$PREDICATE_VAR;
    return ConsesLow.list( $sym17$CLET, ConsesLow.list( ConsesLow.list( predicate_var, predicate ) ), ConsesLow.list( $sym19$WITH_PREDICATE_FUNCTION, ConsesLow.list(
        $sym39$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION, predicate_var ), ConsesLow.listS( $sym17$CLET, ConsesLow.list( ConsesLow.list( $sym23$_PRED_, ConsesLow.list(
            $sym40$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE, predicate_var ) ) ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 9834L)
  public static SubLObject possibly_with_just_predicate_determine_function(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == predicate )
    {
      return $relevant_pred_function$.getDynamicValue( thread );
    }
    assert NIL != forts.fort_p( predicate ) : predicate;
    return $sym2$RELEVANT_PRED_IS_EQ;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 10087L)
  public static SubLObject possibly_with_just_predicate_determine_predicate(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != predicate ) ? predicate : $pred$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 10614L)
  public static SubLObject spec_preds_are_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $relevant_pred_function$.getDynamicValue( thread ), $sym5$RELEVANT_PRED_IS_SPEC_PRED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 10728L)
  public static SubLObject spec_inverses_are_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $relevant_pred_function$.getDynamicValue( thread ), $sym6$RELEVANT_PRED_IS_SPEC_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 10848L)
  public static SubLObject spec_preds_and_inverses_are_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $relevant_pred_function$.getDynamicValue( thread ), $sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 10986L)
  public static SubLObject inference_spec_preds_are_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $relevant_pred_function$.getDynamicValue( thread ), $sym9$INFERENCE_GENL_PREDICATE_OF_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 11112L)
  public static SubLObject inference_spec_inverses_are_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $relevant_pred_function$.getDynamicValue( thread ), $sym10$INFERENCE_GENL_INVERSE_OF_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 11239L)
  public static SubLObject inference_genl_preds_are_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $relevant_pred_function$.getDynamicValue( thread ), $sym11$INFERENCE_GENL_PREDICATE_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 11362L)
  public static SubLObject inference_genl_inverses_are_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $relevant_pred_function$.getDynamicValue( thread ), $sym12$INFERENCE_GENL_INVERSE_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 11486L)
  public static SubLObject inference_genl_predicate_ofP(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_pred = el_utilities.literal_predicate( control_vars.$inference_literal$.getDynamicValue( thread ), UNPROVIDED );
    return makeBoolean( NIL != inference_pred && !pred.eql( inference_pred ) && NIL != predicate_relevance_cache.cached_spec_predP( inference_pred, pred, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 11862L)
  public static SubLObject inference_genl_predicateP(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_pred = el_utilities.literal_predicate( control_vars.$inference_literal$.getDynamicValue( thread ), UNPROVIDED );
    return makeBoolean( NIL != inference_pred && !pred.eql( inference_pred ) && NIL != predicate_relevance_cache.cached_genl_predP( inference_pred, pred, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 12104L)
  public static SubLObject inference_genl_inverse_ofP(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_pred = el_utilities.literal_predicate( control_vars.$inference_literal$.getDynamicValue( thread ), UNPROVIDED );
    return makeBoolean( NIL != inference_pred && !pred.eql( inference_pred ) && NIL != predicate_relevance_cache.cached_spec_inverseP( inference_pred, pred, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 12395L)
  public static SubLObject inference_genl_inverseP(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_pred = el_utilities.literal_predicate( control_vars.$inference_literal$.getDynamicValue( thread ), UNPROVIDED );
    return makeBoolean( NIL != inference_pred && !pred.eql( inference_pred ) && NIL != predicate_relevance_cache.cached_genl_inverseP( inference_pred, pred, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 12638L)
  public static SubLObject inference_negation_predicateP(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_pred = cycl_utilities.atomic_sentence_predicate( control_vars.$inference_literal$.getDynamicValue( thread ) );
    return makeBoolean( NIL != inference_pred && NIL != negation_predicate.negation_predicateP( inference_pred, pred, NIL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 12857L)
  public static SubLObject inference_negation_inverseP(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_pred = cycl_utilities.atomic_sentence_predicate( control_vars.$inference_literal$.getDynamicValue( thread ) );
    return makeBoolean( NIL != inference_pred && NIL != negation_predicate.negation_inverseP( inference_pred, pred, NIL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 13072L)
  public static SubLObject with_inference_genl_or_spec_pred_relevance(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sense = NIL;
    SubLObject literal = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    literal = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym19$WITH_PREDICATE_FUNCTION, ConsesLow.list( $sym45$DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE, sense ), ConsesLow.listS( $sym17$CLET, ConsesLow.list( ConsesLow.list(
        $sym46$_INFERENCE_LITERAL_, literal ), ConsesLow.list( $sym47$_INFERENCE_SENSE_, sense ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 13408L)
  public static SubLObject with_inference_genl_or_spec_inverse_relevance(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sense = NIL;
    SubLObject literal = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    sense = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    literal = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym19$WITH_PREDICATE_FUNCTION, ConsesLow.list( $sym48$DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE, sense ), ConsesLow.listS( $sym17$CLET, ConsesLow.list( ConsesLow.list(
        $sym46$_INFERENCE_LITERAL_, literal ), ConsesLow.list( $sym47$_INFERENCE_SENSE_, sense ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 13680L)
  public static SubLObject determine_inference_genl_or_spec_pred_relevance(final SubLObject sense)
  {
    return $kw50$POS.eql( sense ) ? $sym9$INFERENCE_GENL_PREDICATE_OF_ : $sym11$INFERENCE_GENL_PREDICATE_;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 13911L)
  public static SubLObject determine_inference_genl_or_spec_inverse_relevance(final SubLObject sense)
  {
    return $kw50$POS.eql( sense ) ? $sym10$INFERENCE_GENL_INVERSE_OF_ : $sym12$INFERENCE_GENL_INVERSE_;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
  public static SubLObject pred_info_object_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_pred_info_object( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
  public static SubLObject pred_info_object_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $pred_info_object_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
  public static SubLObject pred_info_pred(final SubLObject v_object)
  {
    assert NIL != pred_info_object_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
  public static SubLObject pred_info_relevance_function(final SubLObject v_object)
  {
    assert NIL != pred_info_object_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
  public static SubLObject _csetf_pred_info_pred(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pred_info_object_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
  public static SubLObject _csetf_pred_info_relevance_function(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != pred_info_object_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
  public static SubLObject make_pred_info_object(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $pred_info_object_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw65$PRED ) )
      {
        _csetf_pred_info_pred( v_new, current_value );
      }
      else if( pcase_var.eql( $kw66$RELEVANCE_FUNCTION ) )
      {
        _csetf_pred_info_relevance_function( v_new, current_value );
      }
      else
      {
        Errors.error( $str67$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
  public static SubLObject visit_defstruct_pred_info_object(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw68$BEGIN, $sym69$MAKE_PRED_INFO_OBJECT, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw70$SLOT, $kw65$PRED, pred_info_pred( obj ) );
    Functions.funcall( visitor_fn, obj, $kw70$SLOT, $kw66$RELEVANCE_FUNCTION, pred_info_relevance_function( obj ) );
    Functions.funcall( visitor_fn, obj, $kw71$END, $sym69$MAKE_PRED_INFO_OBJECT, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14356L)
  public static SubLObject visit_defstruct_object_pred_info_object_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_pred_info_object( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14495L)
  public static SubLObject print_pred_info_object(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str73$__PRED_INFO__s__s_, pred_info_pred( v_object ), pred_info_relevance_function( v_object ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14739L)
  public static SubLObject pred_info_internal(SubLObject pred, SubLObject relevance_function)
  {
    if( pred == UNPROVIDED )
    {
      pred = $pred$.getDynamicValue();
    }
    if( relevance_function == UNPROVIDED )
    {
      relevance_function = $relevant_pred_function$.getDynamicValue();
    }
    final SubLObject pred_info_object = make_pred_info_object( UNPROVIDED );
    _csetf_pred_info_pred( pred_info_object, pred );
    _csetf_pred_info_relevance_function( pred_info_object, relevance_function );
    return pred_info_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pred-relevance-macros.lisp", position = 14739L)
  public static SubLObject pred_info(SubLObject pred, SubLObject relevance_function)
  {
    if( pred == UNPROVIDED )
    {
      pred = $pred$.getDynamicValue();
    }
    if( relevance_function == UNPROVIDED )
    {
      relevance_function = $relevant_pred_function$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return pred_info_internal( pred, relevance_function );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym74$PRED_INFO, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym74$PRED_INFO, TWO_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym74$PRED_INFO, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, relevance_function );
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
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && relevance_function.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( pred_info_internal( pred, relevance_function ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, relevance_function ) );
    return memoization_state.caching_results( results3 );
  }

  public static SubLObject declare_pred_relevance_macros_file()
  {
    SubLFiles.declareFunction( me, "relevant_pred_is_everything", "RELEVANT-PRED-IS-EVERYTHING", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_pred_is_eq", "RELEVANT-PRED-IS-EQ", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_pred_is_in_list", "RELEVANT-PRED-IS-IN-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_pred_is_not_in_list", "RELEVANT-PRED-IS-NOT-IN-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_pred_is_spec_pred", "RELEVANT-PRED-IS-SPEC-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_pred_is_spec_inverse", "RELEVANT-PRED-IS-SPEC-INVERSE", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_pred_is_spec_pred_or_inverse", "RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_predP", "RELEVANT-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "all_possibly_relevant_preds", "ALL-POSSIBLY-RELEVANT-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "pred_relevance_undefined_p", "PRED-RELEVANCE-UNDEFINED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "all_preds_are_relevantP", "ALL-PREDS-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "only_specified_pred_is_relevantP", "ONLY-SPECIFIED-PRED-IS-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "only_specified_predicate_list_is_relevantP", "ONLY-SPECIFIED-PREDICATE-LIST-IS-RELEVANT?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_predicate_function", "WITH-PREDICATE-FUNCTION" );
    SubLFiles.declareMacro( me, "with_all_predicates", "WITH-ALL-PREDICATES" );
    SubLFiles.declareMacro( me, "with_just_predicate", "WITH-JUST-PREDICATE" );
    SubLFiles.declareMacro( me, "with_predicate_list", "WITH-PREDICATE-LIST" );
    SubLFiles.declareMacro( me, "with_predicates_not_in_list", "WITH-PREDICATES-NOT-IN-LIST" );
    SubLFiles.declareMacro( me, "with_all_spec_predicates", "WITH-ALL-SPEC-PREDICATES" );
    SubLFiles.declareMacro( me, "with_all_spec_inverses", "WITH-ALL-SPEC-INVERSES" );
    SubLFiles.declareMacro( me, "with_all_spec_predicates_and_inverses", "WITH-ALL-SPEC-PREDICATES-AND-INVERSES" );
    SubLFiles.declareMacro( me, "with_pred_and_relevance", "WITH-PRED-AND-RELEVANCE" );
    SubLFiles.declareMacro( me, "possibly_with_just_predicate", "POSSIBLY-WITH-JUST-PREDICATE" );
    SubLFiles.declareFunction( me, "possibly_with_just_predicate_determine_function", "POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_with_just_predicate_determine_predicate", "POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "spec_preds_are_relevantP", "SPEC-PREDS-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "spec_inverses_are_relevantP", "SPEC-INVERSES-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "spec_preds_and_inverses_are_relevantP", "SPEC-PREDS-AND-INVERSES-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_spec_preds_are_relevantP", "INFERENCE-SPEC-PREDS-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_spec_inverses_are_relevantP", "INFERENCE-SPEC-INVERSES-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_genl_preds_are_relevantP", "INFERENCE-GENL-PREDS-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_genl_inverses_are_relevantP", "INFERENCE-GENL-INVERSES-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_genl_predicate_ofP", "INFERENCE-GENL-PREDICATE-OF?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_genl_predicateP", "INFERENCE-GENL-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_genl_inverse_ofP", "INFERENCE-GENL-INVERSE-OF?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_genl_inverseP", "INFERENCE-GENL-INVERSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_negation_predicateP", "INFERENCE-NEGATION-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_negation_inverseP", "INFERENCE-NEGATION-INVERSE?", 1, 0, false );
    SubLFiles.declareMacro( me, "with_inference_genl_or_spec_pred_relevance", "WITH-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE" );
    SubLFiles.declareMacro( me, "with_inference_genl_or_spec_inverse_relevance", "WITH-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE" );
    SubLFiles.declareFunction( me, "determine_inference_genl_or_spec_pred_relevance", "DETERMINE-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_inference_genl_or_spec_inverse_relevance", "DETERMINE-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_info_object_print_function_trampoline", "PRED-INFO-OBJECT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "pred_info_object_p", "PRED-INFO-OBJECT-P", 1, 0, false );
    new $pred_info_object_p$UnaryFunction();
    SubLFiles.declareFunction( me, "pred_info_pred", "PRED-INFO-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_info_relevance_function", "PRED-INFO-RELEVANCE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pred_info_pred", "_CSETF-PRED-INFO-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_pred_info_relevance_function", "_CSETF-PRED-INFO-RELEVANCE-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_pred_info_object", "MAKE-PRED-INFO-OBJECT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_pred_info_object", "VISIT-DEFSTRUCT-PRED-INFO-OBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_pred_info_object_method", "VISIT-DEFSTRUCT-OBJECT-PRED-INFO-OBJECT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_pred_info_object", "PRINT-PRED-INFO-OBJECT", 3, 0, false );
    SubLFiles.declareFunction( me, "pred_info_internal", "PRED-INFO-INTERNAL", 0, 2, false );
    SubLFiles.declareFunction( me, "pred_info", "PRED-INFO", 0, 2, false );
    return NIL;
  }

  public static SubLObject init_pred_relevance_macros_file()
  {
    $pred$ = SubLFiles.defparameter( "*PRED*", NIL );
    $relevant_preds$ = SubLFiles.defparameter( "*RELEVANT-PREDS*", NIL );
    $relevant_pred_function$ = SubLFiles.defparameter( "*RELEVANT-PRED-FUNCTION*", NIL );
    $dtp_pred_info_object$ = SubLFiles.defconstant( "*DTP-PRED-INFO-OBJECT*", $sym52$PRED_INFO_OBJECT );
    return NIL;
  }

  public static SubLObject setup_pred_relevance_macros_file()
  {
    SubLSpecialOperatorDeclarations.proclaim( $list0 );
    access_macros.register_macro_helper( $sym39$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION, $sym41$POSSIBLY_WITH_JUST_PREDICATE );
    access_macros.register_macro_helper( $sym40$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE, $sym41$POSSIBLY_WITH_JUST_PREDICATE );
    SubLSpecialOperatorDeclarations.proclaim( $list43 );
    access_macros.register_macro_helper( $sym45$DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE, $sym49$WITH_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE );
    access_macros.register_macro_helper( $sym48$DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE, $sym51$WITH_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_pred_info_object$.getGlobalValue(), Symbols.symbol_function( $sym59$PRED_INFO_OBJECT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list60 );
    Structures.def_csetf( $sym61$PRED_INFO_PRED, $sym62$_CSETF_PRED_INFO_PRED );
    Structures.def_csetf( $sym63$PRED_INFO_RELEVANCE_FUNCTION, $sym64$_CSETF_PRED_INFO_RELEVANCE_FUNCTION );
    Equality.identity( $sym52$PRED_INFO_OBJECT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pred_info_object$.getGlobalValue(), Symbols.symbol_function(
        $sym72$VISIT_DEFSTRUCT_OBJECT_PRED_INFO_OBJECT_METHOD ) );
    memoization_state.note_memoized_function( $sym74$PRED_INFO );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pred_relevance_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pred_relevance_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pred_relevance_macros_file();
  }
  static
  {
    me = new pred_relevance_macros();
    $pred$ = null;
    $relevant_preds$ = null;
    $relevant_pred_function$ = null;
    $dtp_pred_info_object$ = null;
    $list0 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "RELEVANT-PRED-IS-EVERYTHING" ), makeSymbol( "RELEVANT-PRED-IS-EQ" ), makeSymbol( "RELEVANT-PRED-IS-IN-LIST" ), makeSymbol(
        "RELEVANT-PRED-IS-NOT-IN-LIST" ), makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED" ), makeSymbol( "RELEVANT-PRED-IS-SPEC-INVERSE" ), makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE" ) );
    $sym1$RELEVANT_PRED_IS_EVERYTHING = makeSymbol( "RELEVANT-PRED-IS-EVERYTHING" );
    $sym2$RELEVANT_PRED_IS_EQ = makeSymbol( "RELEVANT-PRED-IS-EQ" );
    $sym3$RELEVANT_PRED_IS_IN_LIST = makeSymbol( "RELEVANT-PRED-IS-IN-LIST" );
    $sym4$RELEVANT_PRED_IS_NOT_IN_LIST = makeSymbol( "RELEVANT-PRED-IS-NOT-IN-LIST" );
    $sym5$RELEVANT_PRED_IS_SPEC_PRED = makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED" );
    $sym6$RELEVANT_PRED_IS_SPEC_INVERSE = makeSymbol( "RELEVANT-PRED-IS-SPEC-INVERSE" );
    $sym7$RELEVANT_PRED_IS_SPEC_PRED_OR_INVERSE = makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE" );
    $sym8$RELEVANT_PRED_WRT_GT_ = makeSymbol( "RELEVANT-PRED-WRT-GT?" );
    $sym9$INFERENCE_GENL_PREDICATE_OF_ = makeSymbol( "INFERENCE-GENL-PREDICATE-OF?" );
    $sym10$INFERENCE_GENL_INVERSE_OF_ = makeSymbol( "INFERENCE-GENL-INVERSE-OF?" );
    $sym11$INFERENCE_GENL_PREDICATE_ = makeSymbol( "INFERENCE-GENL-PREDICATE?" );
    $sym12$INFERENCE_GENL_INVERSE_ = makeSymbol( "INFERENCE-GENL-INVERSE?" );
    $sym13$INFERENCE_NEGATION_PREDICATE_ = makeSymbol( "INFERENCE-NEGATION-PREDICATE?" );
    $kw14$ALL = makeKeyword( "ALL" );
    $kw15$UNABLE_TO_DETERMINE = makeKeyword( "UNABLE-TO-DETERMINE" );
    $list16 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym17$CLET = makeSymbol( "CLET" );
    $sym18$_RELEVANT_PRED_FUNCTION_ = makeSymbol( "*RELEVANT-PRED-FUNCTION*" );
    $sym19$WITH_PREDICATE_FUNCTION = makeSymbol( "WITH-PREDICATE-FUNCTION" );
    $list20 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-PRED-IS-EVERYTHING" ) );
    $list21 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list22 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-PRED-IS-EQ" ) );
    $sym23$_PRED_ = makeSymbol( "*PRED*" );
    $list24 = ConsesLow.list( makeSymbol( "PREDICATES" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list25 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-PRED-IS-IN-LIST" ) );
    $sym26$_RELEVANT_PREDS_ = makeSymbol( "*RELEVANT-PREDS*" );
    $list27 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-PRED-IS-NOT-IN-LIST" ) );
    $list28 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED" ) );
    $list29 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-PRED-IS-SPEC-INVERSE" ) );
    $list30 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED-OR-INVERSE" ) );
    $list31 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "RELEVANCE-FUNCTION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym32$PCASE = makeSymbol( "PCASE" );
    $sym33$WITH_JUST_PREDICATE = makeSymbol( "WITH-JUST-PREDICATE" );
    $sym34$WITH_ALL_SPEC_PREDICATES = makeSymbol( "WITH-ALL-SPEC-PREDICATES" );
    $sym35$WITH_ALL_SPEC_INVERSES = makeSymbol( "WITH-ALL-SPEC-INVERSES" );
    $sym36$WITH_ALL_SPEC_PREDICATES_AND_INVERSES = makeSymbol( "WITH-ALL-SPEC-PREDICATES-AND-INVERSES" );
    $sym37$PROGN = makeSymbol( "PROGN" );
    $sym38$PREDICATE_VAR = makeUninternedSymbol( "PREDICATE-VAR" );
    $sym39$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_FUNCTION = makeSymbol( "POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-FUNCTION" );
    $sym40$POSSIBLY_WITH_JUST_PREDICATE_DETERMINE_PREDICATE = makeSymbol( "POSSIBLY-WITH-JUST-PREDICATE-DETERMINE-PREDICATE" );
    $sym41$POSSIBLY_WITH_JUST_PREDICATE = makeSymbol( "POSSIBLY-WITH-JUST-PREDICATE" );
    $sym42$FORT_P = makeSymbol( "FORT-P" );
    $list43 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SPEC-PREDS-ARE-RELEVANT?" ), makeSymbol( "SPEC-INVERSES-ARE-RELEVANT?" ), makeSymbol( "SPEC-PREDS-AND-INVERSES-ARE-RELEVANT?" ), makeSymbol(
        "INFERENCE-SPEC-PREDS-ARE-RELEVANT?" ), makeSymbol( "INFERENCE-SPEC-INVERSES-ARE-RELEVANT?" ), makeSymbol( "INFERENCE-GENL-PREDS-ARE-RELEVANT?" ), makeSymbol( "INFERENCE-GENL-INVERSES-ARE-RELEVANT?" ) );
    $list44 = ConsesLow.list( makeSymbol( "SENSE" ), makeSymbol( "LITERAL" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym45$DETERMINE_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE = makeSymbol( "DETERMINE-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE" );
    $sym46$_INFERENCE_LITERAL_ = makeSymbol( "*INFERENCE-LITERAL*" );
    $sym47$_INFERENCE_SENSE_ = makeSymbol( "*INFERENCE-SENSE*" );
    $sym48$DETERMINE_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE = makeSymbol( "DETERMINE-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE" );
    $sym49$WITH_INFERENCE_GENL_OR_SPEC_PRED_RELEVANCE = makeSymbol( "WITH-INFERENCE-GENL-OR-SPEC-PRED-RELEVANCE" );
    $kw50$POS = makeKeyword( "POS" );
    $sym51$WITH_INFERENCE_GENL_OR_SPEC_INVERSE_RELEVANCE = makeSymbol( "WITH-INFERENCE-GENL-OR-SPEC-INVERSE-RELEVANCE" );
    $sym52$PRED_INFO_OBJECT = makeSymbol( "PRED-INFO-OBJECT" );
    $sym53$PRED_INFO_OBJECT_P = makeSymbol( "PRED-INFO-OBJECT-P" );
    $list54 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "RELEVANCE-FUNCTION" ) );
    $list55 = ConsesLow.list( makeKeyword( "PRED" ), makeKeyword( "RELEVANCE-FUNCTION" ) );
    $list56 = ConsesLow.list( makeSymbol( "PRED-INFO-PRED" ), makeSymbol( "PRED-INFO-RELEVANCE-FUNCTION" ) );
    $list57 = ConsesLow.list( makeSymbol( "_CSETF-PRED-INFO-PRED" ), makeSymbol( "_CSETF-PRED-INFO-RELEVANCE-FUNCTION" ) );
    $sym58$PRINT_PRED_INFO_OBJECT = makeSymbol( "PRINT-PRED-INFO-OBJECT" );
    $sym59$PRED_INFO_OBJECT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PRED-INFO-OBJECT-PRINT-FUNCTION-TRAMPOLINE" );
    $list60 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PRED-INFO-OBJECT-P" ) );
    $sym61$PRED_INFO_PRED = makeSymbol( "PRED-INFO-PRED" );
    $sym62$_CSETF_PRED_INFO_PRED = makeSymbol( "_CSETF-PRED-INFO-PRED" );
    $sym63$PRED_INFO_RELEVANCE_FUNCTION = makeSymbol( "PRED-INFO-RELEVANCE-FUNCTION" );
    $sym64$_CSETF_PRED_INFO_RELEVANCE_FUNCTION = makeSymbol( "_CSETF-PRED-INFO-RELEVANCE-FUNCTION" );
    $kw65$PRED = makeKeyword( "PRED" );
    $kw66$RELEVANCE_FUNCTION = makeKeyword( "RELEVANCE-FUNCTION" );
    $str67$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw68$BEGIN = makeKeyword( "BEGIN" );
    $sym69$MAKE_PRED_INFO_OBJECT = makeSymbol( "MAKE-PRED-INFO-OBJECT" );
    $kw70$SLOT = makeKeyword( "SLOT" );
    $kw71$END = makeKeyword( "END" );
    $sym72$VISIT_DEFSTRUCT_OBJECT_PRED_INFO_OBJECT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PRED-INFO-OBJECT-METHOD" );
    $str73$__PRED_INFO__s__s_ = makeString( "#<PRED-INFO:~s:~s>" );
    $sym74$PRED_INFO = makeSymbol( "PRED-INFO" );
  }

  public static final class $pred_info_object_native
      extends
        SubLStructNative
  {
    public SubLObject $pred;
    public SubLObject $relevance_function;
    private static final SubLStructDeclNative structDecl;

    public $pred_info_object_native()
    {
      this.$pred = CommonSymbols.NIL;
      this.$relevance_function = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $pred_info_object_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$pred;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$relevance_function;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$pred = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$relevance_function = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $pred_info_object_native.class, $sym52$PRED_INFO_OBJECT, $sym53$PRED_INFO_OBJECT_P, $list54, $list55, new String[] { "$pred", "$relevance_function"
      }, $list56, $list57, $sym58$PRINT_PRED_INFO_OBJECT );
    }
  }

  public static final class $pred_info_object_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $pred_info_object_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PRED-INFO-OBJECT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return pred_info_object_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 255 ms
 * 
 */