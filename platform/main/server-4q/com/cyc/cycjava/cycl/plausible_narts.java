package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class plausible_narts
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.plausible_narts";
  public static final String myFingerPrint = "cbe6a4494b85cd06afb3d9a5caf5d19c6d8e22bae4d1d7f5b5e8c03299cac02b";
  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 380L)
  private static SubLSymbol $default_nart_plausibility$;
  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 460L)
  private static SubLSymbol $too_general_cols_for_plausibility$;
  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 531L)
  private static SubLSymbol $nart_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 816L)
  private static SubLSymbol $default_plausibility_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 883L)
  private static SubLSymbol $not_useful_cols_for_similarity_computations$;
  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 24580L)
  private static SubLSymbol $do_tva_query_type_type_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 25325L)
  private static SubLSymbol $do_tva_query_type_disjoint_with_caching_state$;
  private static final SubLSymbol $sym0$_DEFAULT_NART_PLAUSIBILITY_;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$_TOO_GENERAL_COLS_FOR_PLAUSIBILITY_;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$_NART_FUNCTIONS_;
  private static final SubLList $list5;
  private static final SubLObject $const6$EverythingPSC;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$OPAQUE;
  private static final SubLObject $const9$sentencePlausibilityScore;
  private static final SubLObject $const10$NumericLikelihoodFn;
  private static final SubLFloat $float11$0_5;
  private static final SubLObject $const12$equalSymbols;
  private static final SubLObject $const13$and;
  private static final SubLObject $const14$isa;
  private static final SubLSymbol $sym15$_X;
  private static final SubLSymbol $kw16$IGNORE;
  private static final SubLObject $const17$relationInstanceExists;
  private static final SubLObject $const18$biologicalFunction;
  private static final SubLObject $const19$definitionalDisplaySentence;
  private static final SubLList $list20;
  private static final SubLObject $const21$sentenceJustifications_ProofViewS;
  private static final SubLObject $const22$relationExistsInstance;
  private static final SubLObject $const23$thereExists;
  private static final SubLObject $const24$GroupFn;
  private static final SubLObject $const25$Thing;
  private static final SubLObject $const26$SitTypeSpecWithTypeRestrictionOnR;
  private static final SubLObject $const27$SubcollectionOfWithRelationToType;
  private static final SubLObject $const28$SubcollectionOfWithRelationFromTy;
  private static final SubLObject $const29$SubcollectionOfWithRelationFromFn;
  private static final SubLObject $const30$CompositeActivityFn;
  private static final SubLObject $const31$CollectionIntersection2Fn;
  private static final SubLObject $const32$SubcollectionOfWithRelationToFn;
  private static final SubLObject $const33$compositeActivities;
  private static final SubLObject $const34$plausibleCollectionIntersections;
  private static final SubLObject $const35$VeryHighAmountFn;
  private static final SubLFloat $float36$0_95;
  private static final SubLObject $const37$HighToVeryHighAmountFn;
  private static final SubLFloat $float38$0_85;
  private static final SubLObject $const39$HighAmountFn;
  private static final SubLFloat $float40$0_75;
  private static final SubLObject $const41$MediumToVeryHighAmountFn;
  private static final SubLFloat $float42$0_65;
  private static final SubLObject $const43$MediumToHighAmountFn;
  private static final SubLFloat $float44$0_55;
  private static final SubLObject $const45$MediumAmountFn;
  private static final SubLObject $const46$LowToMediumAmountFn;
  private static final SubLFloat $float47$0_45;
  private static final SubLObject $const48$LowAmountFn;
  private static final SubLFloat $float49$0_35;
  private static final SubLObject $const50$VeryLowToLowAmountFn;
  private static final SubLFloat $float51$0_25;
  private static final SubLObject $const52$VeryLowAmountFn;
  private static final SubLFloat $float53$0_15;
  private static final SubLObject $const54$NoAmountFn;
  private static final SubLSymbol $sym55$_;
  private static final SubLSymbol $sym56$MIN;
  private static final SubLSymbol $sym57$DO_TVA_QUERY_TYPE_TYPE;
  private static final SubLObject $const58$likelihoodOfArguments_TypeType;
  private static final SubLSymbol $sym59$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_;
  private static final SubLInteger $int60$4096;
  private static final SubLSymbol $sym61$CLEAR_DO_TVA_QUERY_TYPE_TYPE;
  private static final SubLSymbol $sym62$DO_TVA_QUERY_TYPE_DISJOINT_WITH;
  private static final SubLObject $const63$likelihoodOfArgumentsWhenArg2NotI;
  private static final SubLSymbol $kw64$NONE;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_;
  private static final SubLSymbol $sym67$CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH;
  private static final SubLString $str68$____a__a_;
  private static final SubLString $str69$____a_;
  private static final SubLString $str70$___Detected_Feature___a__a_;
  private static final SubLString $str71$_________;
  private static final SubLFloat $float72$19403_06;
  private static final SubLObject $const73$Collection;
  private static final SubLObject $const74$Individual;
  private static final SubLObject $const75$genls;
  private static final SubLObject $const76$nearestCommonGenls;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLSymbol $kw79$INFERENCE_MODE;
  private static final SubLSymbol $kw80$MINIMAL;
  private static final SubLSymbol $kw81$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw82$DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $kw83$COMPUTE_INTERSECTION;
  private static final SubLSymbol $kw84$TRANSFORMATION_ALLOWED_;
  private static final SubLSymbol $kw85$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $kw86$NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $kw87$COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $kw88$MAX_TIME;
  private static final SubLSymbol $kw89$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLFloat $float90$1_0;
  private static final SubLSymbol $kw91$MAX_PROOF_DEPTH;
  private static final SubLSymbol $kw92$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw93$HL;
  private static final SubLSymbol $kw94$CONTINUABLE_;
  private static final SubLSymbol $kw95$PRODUCTIVITY_LIMIT;
  private static final SubLInteger $int96$20000000;
  private static final SubLObject $const97$evaluate;
  private static final SubLSymbol $sym98$_ABC;
  private static final SubLObject $const99$SetExtentFn;
  private static final SubLObject $const100$Predicate;
  private static final SubLInteger $int101$1000;
  private static final SubLString $str102$;
  private static final SubLSymbol $sym103$STRING_;
  private static final SubLInteger $int104$_5;
  private static final SubLString $str105$____a__a__a__a;
  private static final SubLFloat $float106$0_8;
  private static final SubLObject $const107$IntelligentAgent;
  private static final SubLObject $const108$owl_Class;
  private static final SubLObject $const109$definiteDescriptions;
  private static final SubLObject $const110$BiologySCGTemplateAdmittedThing;
  private static final SubLSymbol $sym111$_;
  private static final SubLSymbol $sym112$FORMULA_ARG1;
  private static final SubLList $list113;
  private static final SubLObject $const114$quotedIsa;
  private static final SubLObject $const115$nameString;
  private static final SubLString $str116$_;
  private static final SubLString $str117$_does_;
  private static final SubLString $str118$_with_;
  private static final SubLString $str119$_where_;
  private static final SubLString $str120$_and_;
  private static final SubLString $str121$_do_;
  private static final SubLString $str122$_;
  private static final SubLString $str123$_why_;
  private static final SubLString $str124$_how_;
  private static final SubLString $str125$_what_;
  private static final SubLString $str126$_to_;
  private static final SubLString $str127$_of_;
  private static final SubLString $str128$_is_;
  private static final SubLString $str129$_the_;
  private static final SubLString $str130$_a_;
  private static final SubLString $str131$_an_;

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 1183L)
  public static SubLObject default_plausubility_justification(final SubLObject sentence, final SubLObject likelihood)
  {
    return ConsesLow.list( arguments.make_hl_support( $kw8$OPAQUE, el_utilities.make_binary_formula( $const9$sentencePlausibilityScore, sentence, el_utilities.make_unary_formula( $const10$NumericLikelihoodFn,
        likelihood ) ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 1411L)
  public static SubLObject plausibility_of_sentence(final SubLObject expr, SubLObject justifyP, SubLObject mt)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $default_plausibility_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject likelihood = NIL;
    SubLObject justification = NIL;
    if( NIL == likelihood && !expr.isList() )
    {
      likelihood = el_utilities.make_unary_formula( $const10$NumericLikelihoodFn, $float11$0_5 );
    }
    if( NIL == likelihood )
    {
      SubLObject col = NIL;
      if( cycl_utilities.formula_arg0( expr ).eql( $const12$equalSymbols ) )
      {
        col = cycl_utilities.formula_arg2( expr, UNPROVIDED );
      }
      else
      {
        col = expr;
      }
      if( NIL == likelihood && NIL != simple_nartP( col ) )
      {
        thread.resetMultipleValues();
        final SubLObject likelihood_$1 = find_plausibility_of_collection( col, justifyP, mt );
        final SubLObject justification_$2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        likelihood = likelihood_$1;
        justification = justification_$2;
      }
      if( NIL == likelihood && cycl_utilities.formula_arg0( col ).eql( $const13$and ) )
      {
        thread.resetMultipleValues();
        final SubLObject likelihood_$2 = handle_arbitrary_expression( col, justifyP, mt );
        final SubLObject justification_$3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        likelihood = likelihood_$2;
        justification = justification_$3;
      }
      if( NIL == likelihood && col.isList() && NIL == conses_high.member( cycl_utilities.formula_arg0( col ), $nart_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject likelihood_$3 = find_plausibility_of_sentences( ConsesLow.list( col ), mt, UNPROVIDED );
        final SubLObject justification_$4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        likelihood = likelihood_$3;
        justification = justification_$4;
      }
      if( NIL == likelihood )
      {
        final SubLObject query = ConsesLow.list( $const14$isa, $sym15$_X, col );
        final SubLObject unwound_form = subcollection_unwinder.scg_subcol_expand_signature( query );
        thread.resetMultipleValues();
        final SubLObject likelihood_$4 = find_plausibility_of_sentences( unwound_form, justifyP, mt );
        final SubLObject justification_$5 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        likelihood = likelihood_$4;
        justification = justification_$5;
      }
    }
    if( NIL == likelihood )
    {
      likelihood = el_utilities.make_unary_formula( $const10$NumericLikelihoodFn, $float11$0_5 );
    }
    if( NIL == justification )
    {
      justification = default_plausubility_justification( expr, cycl_utilities.formula_arg1( likelihood, UNPROVIDED ) );
    }
    return Values.values( cycl_utilities.formula_arg1( likelihood, UNPROVIDED ), justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 2957L)
  public static SubLObject handle_arbitrary_expression(final SubLObject expression, SubLObject justifyP, SubLObject mt)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cols = NIL;
    SubLObject sentences = NIL;
    SubLObject results = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( expression, $kw16$IGNORE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg0( arg ).eql( $const12$equalSymbols ) )
      {
        cols = ConsesLow.cons( cycl_utilities.formula_arg2( arg, UNPROVIDED ), cols );
      }
      else
      {
        sentences = ConsesLow.cons( arg, sentences );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2 = cols;
    SubLObject col = NIL;
    col = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      thread.resetMultipleValues();
      final SubLObject result = find_plausibility_of_collection( col, justifyP, mt );
      final SubLObject justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      results = ConsesLow.cons( result, results );
      justifications = ConsesLow.append( justifications, justification );
      cdolist_list_var2 = cdolist_list_var2.rest();
      col = cdolist_list_var2.first();
    }
    thread.resetMultipleValues();
    final SubLObject result2 = find_plausibility_of_sentences( sentences, mt, UNPROVIDED );
    final SubLObject justification2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    results = ConsesLow.cons( result2, results );
    justifications = ConsesLow.append( justifications, justification2 );
    if( NIL != justifyP )
    {
      return Values.values( combine_plausibility_scores( results ), justifications );
    }
    return combine_plausibility_scores( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 3880L)
  public static SubLObject find_plausibility_of_collection(final SubLObject collection, SubLObject justifyP, SubLObject mt)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $default_plausibility_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !collection.isList() )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    if( NIL == simple_nartP( collection ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = handle_nested_nart( collection, justifyP, mt );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    thread.resetMultipleValues();
    final SubLObject ret_value = handle_simple_nart( collection, mt, justifyP );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject score = map_likelihood_to_numbers( ret_value );
    final SubLObject likelihood = ConsesLow.list( $const10$NumericLikelihoodFn, score );
    if( NIL == score )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    if( NIL != justifyP )
    {
      return Values.values( likelihood, justifications );
    }
    return likelihood;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 4660L)
  public static SubLObject handle_nested_nart(final SubLObject collection, SubLObject justifyP, SubLObject mt)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $default_plausibility_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query = ConsesLow.list( $const14$isa, $sym15$_X, collection );
    final SubLObject unwound_form = subcollection_unwinder.scg_subcol_expand_signature( query );
    thread.resetMultipleValues();
    final SubLObject results = find_plausibility_of_sentences( unwound_form, justifyP, mt );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != justifyP )
    {
      return Values.values( results, justifications );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 5091L)
  public static SubLObject find_plausibility_of_sentences(final SubLObject list_of_sentences, SubLObject justifyP, SubLObject mt)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $default_plausibility_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject sentences = list_of_sentences;
    SubLObject justifications = NIL;
    if( !list_of_sentences.isList() )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    if( cycl_utilities.formula_arg0( list_of_sentences ).eql( $const13$and ) )
    {
      sentences = cycl_utilities.formula_args( list_of_sentences, UNPROVIDED );
    }
    SubLObject cdolist_list_var = sentences;
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject result = assess_plausibility_of_sentence( sentence, sentences, mt, justifyP );
      final SubLObject justification_of_sentence = thread.secondMultipleValue();
      thread.resetMultipleValues();
      results = ConsesLow.cons( result, results );
      if( NIL != justifyP )
      {
        justifications = ConsesLow.append( justifications, justification_of_sentence );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    if( NIL != justifyP )
    {
      return Values.values( combine_plausibility_scores( results ), justifications );
    }
    return combine_plausibility_scores( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 5998L)
  public static SubLObject combine_plausibility_scores(final SubLObject results)
  {
    SubLObject lst_of_scores = NIL;
    SubLObject cdolist_list_var = results;
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject score = map_likelihood_to_numbers( result );
      if( NIL != score )
      {
        lst_of_scores = ConsesLow.cons( score, lst_of_scores );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    if( NIL != lst_of_scores )
    {
      final SubLObject combined_score = combined_evidence( lst_of_scores );
      return ConsesLow.list( $const10$NumericLikelihoodFn, combined_score );
    }
    return $default_nart_plausibility$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 6422L)
  public static SubLObject assess_plausibility_of_sentence(final SubLObject sentence, final SubLObject sentences, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !sentence.isList() )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    if( cycl_utilities.formula_arg0( sentence ).eql( $const17$relationInstanceExists ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = assess_plausibility_of_relation_instance_exists( sentence, sentences, mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    if( cycl_utilities.formula_arg0( sentence ).eql( $const18$biologicalFunction ) )
    {
      thread.resetMultipleValues();
      final SubLObject result2 = handle_nested_nart( cycl_utilities.formula_arg2( sentence, UNPROVIDED ), justifyP, mt );
      final SubLObject justifications2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject result3 = handle_nested_nart( cycl_utilities.formula_arg1( sentence, UNPROVIDED ), justifyP, mt );
      final SubLObject justifications3 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( combine_plausibility_scores( ConsesLow.list( result2, result3 ) ), ConsesLow.append( justifications2, justifications3 ) );
    }
    if( cycl_utilities.formula_arg0( sentence ).eql( $const19$definitionalDisplaySentence ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = handle_nested_nart( cycl_utilities.formula_arg1( sentence, UNPROVIDED ), justifyP, mt );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    if( cycl_utilities.formula_arg0( sentence ).equal( $list20 ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = handle_nested_nart( cycl_utilities.formula_arg2( sentence, UNPROVIDED ), justifyP, mt );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    if( cycl_utilities.formula_arg0( sentence ).eql( $const21$sentenceJustifications_ProofViewS ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = assess_plausibility_of_sentence( cycl_utilities.formula_arg1( sentence, UNPROVIDED ), sentences, mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    if( cycl_utilities.formula_arg0( sentence ).eql( $const14$isa ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = assess_plausibility_of_isa_sentence( sentence, sentences, mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    if( cycl_utilities.formula_arg0( sentence ).eql( $const22$relationExistsInstance ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = assess_plausibility_of_relation_instance_exists( sentence, sentences, mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    if( cycl_utilities.formula_arg0( sentence ).eql( $const23$thereExists ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = find_plausibility_of_sentences( cycl_utilities.formula_arg2( sentence, UNPROVIDED ), justifyP, mt );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    thread.resetMultipleValues();
    final SubLObject result = assess_plausibility_of_binary_predicate( sentence, sentences, mt, justifyP );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( result, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 8907L)
  public static SubLObject assess_plausibility_of_isa_sentence(final SubLObject sentence, final SubLObject sentences, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject col = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
    final SubLObject var = cycl_utilities.formula_arg1( sentence, UNPROVIDED );
    final SubLObject all_collections_for_variable = gather_collections_for_variable( var, sentences );
    if( NIL != conses_high.member( col, $too_general_cols_for_plausibility$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    if( col.isList() && cycl_utilities.formula_arg0( col ).eql( $const24$GroupFn ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = handle_nested_nart( cycl_utilities.formula_arg1( col, UNPROVIDED ), justifyP, mt );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    thread.resetMultipleValues();
    final SubLObject result = handle_plausibility_of_isa_sentence( ConsesLow.list( col ), all_collections_for_variable, mt, justifyP );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( result, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 9738L)
  public static SubLObject assess_plausibility_of_binary_predicate(final SubLObject sentence, final SubLObject sentences, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.formula_arg0( sentence );
    final SubLObject arg1 = cycl_utilities.formula_arg1( sentence, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
    if( NIL != collection_defns.el_variableP( arg1 ) && NIL == collection_defns.el_variableP( arg2 ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = handle_plausibility_of_binary_predicate_types_ins( predicate, gather_collections_for_variable( arg1, sentences ), arg2, mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    if( NIL == collection_defns.el_variableP( arg1 ) && NIL != collection_defns.el_variableP( arg2 ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = handle_plausibility_of_binary_predicate_ins_types( predicate, arg1, gather_collections_for_variable( arg2, sentences ), mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justifications );
    }
    if( NIL != collection_defns.el_variableP( arg1 ) && NIL != collection_defns.el_variableP( arg2 ) )
    {
      thread.resetMultipleValues();
      final SubLObject result = handle_plausibility_of_binary_predicate_types_types( predicate, gather_collections_for_variable( arg1, sentences ), gather_collections_for_variable( arg2, sentences ), mt, justifyP );
      final SubLObject justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( result, justification );
    }
    return $default_nart_plausibility$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 10943L)
  public static SubLObject handle_plausibility_of_binary_predicate_types_ins(final SubLObject predicate, final SubLObject list_of_cols, final SubLObject instance, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = list_of_cols;
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject answer_1 = do_tva_query_ins_not_in_col( predicate, type, instance, mt, justifyP );
      final SubLObject justification_1 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != answer_1 )
      {
        results = ConsesLow.cons( answer_1, results );
      }
      if( NIL != justifyP && justification_1.isList() )
      {
        justifications = ConsesLow.append( justifications, justification_1 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    cdolist_list_var = list_of_cols;
    type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject answer_2 = do_tva_query_type_ins( predicate, type, instance, mt, justifyP );
      final SubLObject justification_2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != answer_2 )
      {
        results = ConsesLow.cons( answer_2, results );
      }
      if( NIL != justifyP && justification_2.isList() )
      {
        justifications = ConsesLow.append( justifications, justification_2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    if( NIL == results )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    if( NIL != justifyP )
    {
      return Values.values( find_min_likelihood( results ), justifications );
    }
    return find_min_likelihood( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 12106L)
  public static SubLObject handle_plausibility_of_binary_predicate_ins_types(final SubLObject predicate, final SubLObject instance, final SubLObject list_of_cols, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = list_of_cols;
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject v_answer = do_tva_query_ins_type( predicate, instance, type, mt, justifyP );
      final SubLObject justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_answer )
      {
        results = ConsesLow.cons( v_answer, results );
      }
      if( NIL != justifyP && justification.isList() )
      {
        justifications = ConsesLow.append( justifications, justification );
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    if( NIL == results )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    if( NIL != justifyP )
    {
      return Values.values( find_min_likelihood( results ), justifications );
    }
    return find_min_likelihood( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 12841L)
  public static SubLObject handle_plausibility_of_binary_predicate_types_types(final SubLObject predicate, final SubLObject list_of_cols_1, final SubLObject list_of_cols_2, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = list_of_cols_1;
    SubLObject col_1 = NIL;
    col_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$9 = list_of_cols_2;
      SubLObject col_2 = NIL;
      col_2 = cdolist_list_var_$9.first();
      while ( NIL != cdolist_list_var_$9)
      {
        thread.resetMultipleValues();
        final SubLObject v_answer = do_tva_query_type_type( predicate, col_1, col_2, mt, justifyP );
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != justifyP && justification_1.isList() )
        {
          justifications = ConsesLow.append( justifications, justification_1 );
        }
        if( NIL != v_answer )
        {
          results = ConsesLow.cons( v_answer, results );
        }
        thread.resetMultipleValues();
        final SubLObject answer_2 = do_tva_query_type_disjoint_with( predicate, col_1, col_2, mt, justifyP );
        final SubLObject justifications_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( justifications_2.isList() )
        {
          justifications = ConsesLow.append( justifications, justifications_2 );
        }
        if( NIL != answer_2 )
        {
          results = ConsesLow.cons( answer_2, results );
        }
        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
        col_2 = cdolist_list_var_$9.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      col_1 = cdolist_list_var.first();
    }
    if( NIL == results )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    return Values.values( find_min_likelihood( results ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 13849L)
  public static SubLObject assess_plausibility_of_relation_instance_exists(final SubLObject sentence, final SubLObject sentences, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.formula_arg1( sentence, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
    final SubLObject arg3 = cycl_utilities.formula_arg3( sentence, UNPROVIDED );
    SubLObject all_collections_for_arg2 = ConsesLow.list( arg2 );
    SubLObject all_collections_for_arg3 = ConsesLow.list( arg3 );
    if( NIL != collection_defns.el_variableP( arg2 ) )
    {
      all_collections_for_arg2 = gather_collections_for_variable( arg2, sentences );
    }
    if( NIL != collection_defns.el_variableP( arg3 ) )
    {
      all_collections_for_arg3 = gather_collections_for_variable( arg3, sentences );
    }
    thread.resetMultipleValues();
    final SubLObject result = assess_plausibility_of_collections( predicate, all_collections_for_arg2, all_collections_for_arg3, mt, justifyP );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( result, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 14641L)
  public static SubLObject assess_plausibility_of_collections(final SubLObject predicate, final SubLObject cols_list_1, final SubLObject cols_list_2, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = cols_list_1;
    SubLObject col_1 = NIL;
    col_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$10 = cols_list_2;
      SubLObject col_2 = NIL;
      col_2 = cdolist_list_var_$10.first();
      while ( NIL != cdolist_list_var_$10)
      {
        thread.resetMultipleValues();
        final SubLObject result = get_plausibility_of_binary_predicate_type_type( predicate, col_1, col_2, mt, justifyP );
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != result )
        {
          results = ConsesLow.cons( result, results );
        }
        if( NIL != justifyP && justification.isList() )
        {
          justifications = ConsesLow.append( justifications, justification );
        }
        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
        col_2 = cdolist_list_var_$10.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      col_1 = cdolist_list_var.first();
    }
    if( NIL == results )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    return Values.values( find_min_likelihood( results ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 15347L)
  public static SubLObject gather_collections_for_variable(final SubLObject variable, final SubLObject sentences)
  {
    SubLObject list_of_collections = NIL;
    SubLObject cdolist_list_var = sentences;
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject col = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
      if( cycl_utilities.formula_arg0( sentence ).eql( $const14$isa ) && variable.eql( cycl_utilities.formula_arg1( sentence, UNPROVIDED ) ) && NIL == conses_high.member( col, $too_general_cols_for_plausibility$
          .getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
      {
        list_of_collections = ConsesLow.cons( col, list_of_collections );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    if( NIL == list_of_collections )
    {
      return ConsesLow.list( $const25$Thing );
    }
    return list_of_collections;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 15864L)
  public static SubLObject handle_simple_nart(final SubLObject collection, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( cycl_utilities.formula_arg0( collection ).eql( $const26$SitTypeSpecWithTypeRestrictionOnR ) )
    {
      thread.resetMultipleValues();
      final SubLObject results = get_plausibility_of_binary_predicate_type_type( cycl_utilities.formula_arg2( collection, UNPROVIDED ), cycl_utilities.formula_arg1( collection, UNPROVIDED ), cycl_utilities.formula_arg3(
          collection, UNPROVIDED ), mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( results, justifications );
    }
    if( cycl_utilities.formula_arg0( collection ).eql( $const27$SubcollectionOfWithRelationToType ) )
    {
      thread.resetMultipleValues();
      final SubLObject results = get_plausibility_of_binary_predicate_type_type( cycl_utilities.formula_arg2( collection, UNPROVIDED ), cycl_utilities.formula_arg1( collection, UNPROVIDED ), cycl_utilities.formula_arg3(
          collection, UNPROVIDED ), mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( results, justifications );
    }
    if( cycl_utilities.formula_arg0( collection ).eql( $const28$SubcollectionOfWithRelationFromTy ) )
    {
      thread.resetMultipleValues();
      final SubLObject results = get_plausibility_of_binary_predicate_type_type( cycl_utilities.formula_arg2( collection, UNPROVIDED ), cycl_utilities.formula_arg3( collection, UNPROVIDED ), cycl_utilities.formula_arg1(
          collection, UNPROVIDED ), mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( results, justifications );
    }
    if( cycl_utilities.formula_arg0( collection ).eql( $const29$SubcollectionOfWithRelationFromFn ) )
    {
      thread.resetMultipleValues();
      final SubLObject results = handle_plausibility_of_binary_predicate_ins_types( cycl_utilities.formula_arg2( collection, UNPROVIDED ), cycl_utilities.formula_arg3( collection, UNPROVIDED ), ConsesLow.list(
          cycl_utilities.formula_arg1( collection, UNPROVIDED ) ), mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( results, justifications );
    }
    if( cycl_utilities.formula_arg0( collection ).eql( $const30$CompositeActivityFn ) )
    {
      thread.resetMultipleValues();
      final SubLObject results = handle_composite_activity_fn( collection, mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( results, justifications );
    }
    if( cycl_utilities.formula_arg0( collection ).eql( $const31$CollectionIntersection2Fn ) )
    {
      thread.resetMultipleValues();
      final SubLObject results = handle_collection_intersection_2_fn( collection, mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( results, justifications );
    }
    if( cycl_utilities.formula_arg0( collection ).eql( $const32$SubcollectionOfWithRelationToFn ) )
    {
      thread.resetMultipleValues();
      final SubLObject results = get_plausibility_of_binary_predicate_type_ins( cycl_utilities.formula_arg2( collection, UNPROVIDED ), cycl_utilities.formula_arg1( collection, UNPROVIDED ), cycl_utilities.formula_arg3(
          collection, UNPROVIDED ), mt, justifyP );
      final SubLObject justifications = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( results, justifications );
    }
    return $default_nart_plausibility$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 18168L)
  public static SubLObject get_plausibility_of_binary_predicate_type_type(final SubLObject predicate, final SubLObject type_1, final SubLObject type_2, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject justifications = NIL;
    thread.resetMultipleValues();
    SubLObject v_answer = do_tva_query_type_disjoint_with( predicate, type_1, type_2, mt, justifyP );
    SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_answer )
    {
      results = ConsesLow.cons( v_answer, results );
    }
    if( justification.isList() )
    {
      justifications = ConsesLow.append( justifications, justification );
    }
    thread.resetMultipleValues();
    v_answer = do_tva_query_type_type( predicate, type_1, type_2, mt, justifyP );
    justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_answer )
    {
      results = ConsesLow.cons( v_answer, results );
    }
    if( justification.isList() )
    {
      justifications = ConsesLow.append( justifications, justification );
    }
    if( NIL == results )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    return Values.values( find_min_likelihood( results ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 18999L)
  public static SubLObject get_plausibility_of_binary_predicate_type_ins(final SubLObject predicate, final SubLObject type, final SubLObject ins, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject justifications = NIL;
    thread.resetMultipleValues();
    SubLObject v_answer = do_tva_query_ins_not_in_col( predicate, type, ins, mt, justifyP );
    SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_answer )
    {
      results = ConsesLow.cons( v_answer, results );
    }
    if( justification.isList() )
    {
      justifications = ConsesLow.append( justifications, justification );
    }
    thread.resetMultipleValues();
    v_answer = do_tva_query_type_ins( predicate, type, ins, mt, justifyP );
    justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_answer )
    {
      results = ConsesLow.cons( v_answer, results );
    }
    if( justification.isList() )
    {
      justifications = ConsesLow.append( justifications, justification );
    }
    if( NIL == results )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    return Values.values( find_min_likelihood( results ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 19821L)
  public static SubLObject handle_composite_activity_fn(final SubLObject collection, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all_cols = cycl_utilities.formula_arg1( collection, UNPROVIDED );
    SubLObject results = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( all_cols, $kw16$IGNORE );
    SubLObject col_1 = NIL;
    col_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$12;
      final SubLObject args_$11 = cdolist_list_var_$12 = cycl_utilities.formula_args( all_cols, $kw16$IGNORE );
      SubLObject col_2 = NIL;
      col_2 = cdolist_list_var_$12.first();
      while ( NIL != cdolist_list_var_$12)
      {
        if( !col_1.equal( col_2 ) )
        {
          thread.resetMultipleValues();
          SubLObject v_answer = do_tva_query_type_type( $const33$compositeActivities, col_1, col_2, mt, justifyP );
          final SubLObject justification_1 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != v_answer )
          {
            results = ConsesLow.cons( v_answer, results );
          }
          if( justification_1.isList() )
          {
            justifications = ConsesLow.append( justifications, justification_1 );
          }
          thread.resetMultipleValues();
          v_answer = do_tva_query_type_type( $const33$compositeActivities, col_2, col_1, mt, justifyP );
          final SubLObject justification_2 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( justification_2.isList() )
          {
            justifications = ConsesLow.append( justifications, justification_2 );
          }
          if( NIL != v_answer )
          {
            results = ConsesLow.cons( v_answer, results );
          }
        }
        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
        col_2 = cdolist_list_var_$12.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      col_1 = cdolist_list_var.first();
    }
    if( NIL == results )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    return Values.values( find_min_likelihood( results ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 20989L)
  public static SubLObject handle_collection_intersection_2_fn(final SubLObject collection, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( collection, $kw16$IGNORE );
    SubLObject col_1 = NIL;
    col_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$14;
      final SubLObject args_$13 = cdolist_list_var_$14 = cycl_utilities.formula_args( collection, $kw16$IGNORE );
      SubLObject col_2 = NIL;
      col_2 = cdolist_list_var_$14.first();
      while ( NIL != cdolist_list_var_$14)
      {
        if( !col_1.equal( col_2 ) )
        {
          thread.resetMultipleValues();
          SubLObject v_answer = do_tva_query_type_type( $const34$plausibleCollectionIntersections, col_1, col_2, mt, justifyP );
          SubLObject justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( justification.isList() )
          {
            justifications = ConsesLow.append( justifications, justification );
          }
          if( NIL != v_answer )
          {
            results = ConsesLow.cons( v_answer, results );
          }
          thread.resetMultipleValues();
          v_answer = do_tva_query_type_type( $const34$plausibleCollectionIntersections, col_2, col_1, mt, justifyP );
          justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( justification.isList() )
          {
            justifications = ConsesLow.append( justifications, justification );
          }
          if( NIL != v_answer )
          {
            results = ConsesLow.cons( v_answer, results );
          }
        }
        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
        col_2 = cdolist_list_var_$14.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      col_1 = cdolist_list_var.first();
    }
    if( NIL == results )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    return Values.values( find_min_likelihood( results ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 22103L)
  public static SubLObject handle_plausibility_of_isa_sentence(final SubLObject list_of_cols_1, final SubLObject list_of_cols_2, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( list_of_cols_1.equal( list_of_cols_2 ) )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    SubLObject results = NIL;
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = list_of_cols_1;
    SubLObject col_1 = NIL;
    col_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$15 = list_of_cols_2;
      SubLObject col_2 = NIL;
      col_2 = cdolist_list_var_$15.first();
      while ( NIL != cdolist_list_var_$15)
      {
        if( !col_1.equal( col_2 ) )
        {
          thread.resetMultipleValues();
          final SubLObject v_answer = do_tva_query_type_type( $const34$plausibleCollectionIntersections, col_1, col_2, mt, justifyP );
          final SubLObject justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( justification.isList() )
          {
            justifications = ConsesLow.append( justifications, justification );
          }
          if( NIL != v_answer )
          {
            results = ConsesLow.cons( v_answer, results );
          }
        }
        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
        col_2 = cdolist_list_var_$15.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      col_1 = cdolist_list_var.first();
    }
    if( NIL == results )
    {
      return $default_nart_plausibility$.getGlobalValue();
    }
    return Values.values( find_min_likelihood( results ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 22944L)
  public static SubLObject map_likelihood_to_numbers(final SubLObject likelihood)
  {
    final SubLObject level = cycl_utilities.formula_arg0( likelihood );
    if( level.eql( $const10$NumericLikelihoodFn ) )
    {
      return cycl_utilities.formula_arg1( likelihood, UNPROVIDED );
    }
    if( level.eql( $const35$VeryHighAmountFn ) )
    {
      return $float36$0_95;
    }
    if( level.eql( $const37$HighToVeryHighAmountFn ) )
    {
      return $float38$0_85;
    }
    if( level.eql( $const39$HighAmountFn ) )
    {
      return $float40$0_75;
    }
    if( level.eql( $const41$MediumToVeryHighAmountFn ) )
    {
      return $float42$0_65;
    }
    if( level.eql( $const43$MediumToHighAmountFn ) )
    {
      return $float44$0_55;
    }
    if( level.eql( $const45$MediumAmountFn ) )
    {
      return $float11$0_5;
    }
    if( level.eql( $const46$LowToMediumAmountFn ) )
    {
      return $float47$0_45;
    }
    if( level.eql( $const48$LowAmountFn ) )
    {
      return $float49$0_35;
    }
    if( level.eql( $const50$VeryLowToLowAmountFn ) )
    {
      return $float51$0_25;
    }
    if( level.eql( $const52$VeryLowAmountFn ) )
    {
      return $float53$0_15;
    }
    if( level.eql( $const54$NoAmountFn ) )
    {
      return ZERO_INTEGER;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 23891L)
  public static SubLObject combined_evidence(final SubLObject lst)
  {
    if( NIL == lst )
    {
      return NIL;
    }
    final SubLObject product = Sequences.creduce( Symbols.symbol_function( $sym55$_ ), lst, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject product_of_complements = Numbers.subtract( ONE_INTEGER, cycl_utilities.formula_arg0( lst ) );
    SubLObject cdolist_list_var = cycl_utilities.formula_args( lst, UNPROVIDED );
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      product_of_complements = Numbers.multiply( product_of_complements, Numbers.subtract( ONE_INTEGER, x ) );
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return Numbers.divide( product, Numbers.add( product, product_of_complements ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 24237L)
  public static SubLObject find_min_likelihood(final SubLObject lst)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = lst;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( map_likelihood_to_numbers( entry ), result );
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    final SubLObject min_entry = Sequences.creduce( Symbols.symbol_function( $sym56$MIN ), result, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != min_entry )
    {
      return el_utilities.make_unary_formula( $const10$NumericLikelihoodFn, min_entry );
    }
    return $default_nart_plausibility$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 24580L)
  public static SubLObject clear_do_tva_query_type_type()
  {
    final SubLObject cs = $do_tva_query_type_type_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 24580L)
  public static SubLObject remove_do_tva_query_type_type(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $do_tva_query_type_type_caching_state$.getGlobalValue(), ConsesLow.list( pred, col_1, col_2, mt, justifyP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 24580L)
  public static SubLObject do_tva_query_type_type_internal(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject col_3 = plausibility_utilities.possibly_find_nart( possibly_get_atomic_collection( col_1 ) );
    final SubLObject col_4 = plausibility_utilities.possibly_find_nart( possibly_get_atomic_collection( col_2 ) );
    final SubLObject var0 = variables.get_variable( ZERO_INTEGER );
    SubLObject lst_of_justifications = NIL;
    thread.resetMultipleValues();
    final SubLObject result = plausibility_utilities.tva_unify_with_variable_lookup_and_values( ConsesLow.list( $const58$likelihoodOfArguments_TypeType, pred, col_3, col_4, var0 ), var0, mt, NIL, justifyP, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    final SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    lst_of_justifications = cycl_utilities.formula_arg0( justifications );
    if( NIL != result )
    {
      return Values.values( narts_high.nart_hl_formula( cycl_utilities.formula_arg0( result ) ), lst_of_justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 24580L)
  public static SubLObject do_tva_query_type_type(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP)
  {
    SubLObject caching_state = $do_tva_query_type_type_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym57$DO_TVA_QUERY_TYPE_TYPE, $sym59$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_, $int60$4096, EQUAL, FIVE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym61$CLEAR_DO_TVA_QUERY_TYPE_TYPE );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( pred, col_1, col_2, mt, justifyP );
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
        if( pred.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( col_1.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( col_2.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && justifyP.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( do_tva_query_type_type_internal( pred, col_1, col_2, mt, justifyP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, col_1, col_2, mt, justifyP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 25325L)
  public static SubLObject clear_do_tva_query_type_disjoint_with()
  {
    final SubLObject cs = $do_tva_query_type_disjoint_with_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 25325L)
  public static SubLObject remove_do_tva_query_type_disjoint_with(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $do_tva_query_type_disjoint_with_caching_state$.getGlobalValue(), ConsesLow.list( pred, col_1, col_2, mt, justifyP ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 25325L)
  public static SubLObject do_tva_query_type_disjoint_with_internal(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLObject col_3 = plausibility_utilities.possibly_find_nart( possibly_get_atomic_collection( col_1 ) );
    final SubLObject var0 = variables.get_variable( ZERO_INTEGER );
    final SubLObject var2 = variables.get_variable( ONE_INTEGER );
    SubLObject cdolist_list_var;
    final SubLObject bindings_justifications = cdolist_list_var = tva_inference.tva_unify( ConsesLow.list( $const63$likelihoodOfArgumentsWhenArg2NotI, pred, col_3, var0, var2 ), mt, NIL, justifyP, $kw64$NONE, T, NIL );
    SubLObject bindings_justification = NIL;
    bindings_justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = bindings_justification;
      SubLObject v_bindings = NIL;
      SubLObject justification = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
      justification = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != disjoint_with.disjoint_withP( bindings.variable_lookup( var0, v_bindings ), col_2, mt, UNPROVIDED ) )
        {
          return Values.values( narts_high.nart_hl_formula( bindings.variable_lookup( var2, v_bindings ) ), justification );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      bindings_justification = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 25325L)
  public static SubLObject do_tva_query_type_disjoint_with(final SubLObject pred, final SubLObject col_1, final SubLObject col_2, final SubLObject mt, final SubLObject justifyP)
  {
    SubLObject caching_state = $do_tva_query_type_disjoint_with_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym62$DO_TVA_QUERY_TYPE_DISJOINT_WITH, $sym66$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_, $int60$4096, EQUAL, FIVE_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym67$CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( pred, col_1, col_2, mt, justifyP );
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
        if( pred.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( col_1.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( col_2.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && justifyP.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( do_tva_query_type_disjoint_with_internal( pred, col_1, col_2, mt, justifyP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, col_1, col_2, mt, justifyP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 26087L)
  public static SubLObject do_tva_query_ins_not_in_col(final SubLObject pred, final SubLObject col_1, final SubLObject ins, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLObject col_2 = plausibility_utilities.possibly_find_nart( col_1 );
    final SubLObject var0 = variables.get_variable( ZERO_INTEGER );
    final SubLObject var2 = variables.get_variable( ONE_INTEGER );
    SubLObject cdolist_list_var;
    final SubLObject bindings_justifications = cdolist_list_var = tva_inference.tva_unify( ConsesLow.list( $const63$likelihoodOfArgumentsWhenArg2NotI, pred, col_2, var0, var2 ), mt, NIL, justifyP, $kw64$NONE, T, NIL );
    SubLObject bindings_justification = NIL;
    bindings_justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = bindings_justification;
      SubLObject v_bindings = NIL;
      SubLObject justification = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
      justification = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != isa.not_isaP( ins, bindings.variable_lookup( var0, v_bindings ), mt, UNPROVIDED ) )
        {
          return Values.values( narts_high.nart_hl_formula( bindings.variable_lookup( var2, v_bindings ) ), justification );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      bindings_justification = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 26731L)
  public static SubLObject do_tva_query_type_ins(final SubLObject pred, final SubLObject col_1, final SubLObject ins, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLObject col_2 = plausibility_utilities.possibly_find_nart( col_1 );
    final SubLObject var0 = variables.get_variable( ZERO_INTEGER );
    final SubLObject var2 = variables.get_variable( ONE_INTEGER );
    SubLObject cdolist_list_var;
    final SubLObject bindings_justifications = cdolist_list_var = tva_inference.tva_unify( ConsesLow.list( $const58$likelihoodOfArguments_TypeType, pred, col_2, var0, var2 ), mt, NIL, justifyP, $kw64$NONE, T, NIL );
    SubLObject bindings_justification = NIL;
    bindings_justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = bindings_justification;
      SubLObject v_bindings = NIL;
      SubLObject justification = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
      justification = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != isa.isaP( ins, bindings.variable_lookup( var0, v_bindings ), mt, UNPROVIDED ) )
        {
          return Values.values( narts_high.nart_hl_formula( bindings.variable_lookup( var2, v_bindings ) ), justification );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      bindings_justification = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 27353L)
  public static SubLObject do_tva_query_ins_type(final SubLObject pred, final SubLObject ins, final SubLObject col, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLObject col_1 = plausibility_utilities.possibly_find_nart( col );
    final SubLObject var0 = variables.get_variable( ZERO_INTEGER );
    final SubLObject var2 = variables.get_variable( ONE_INTEGER );
    SubLObject cdolist_list_var;
    final SubLObject bindings_justifications = cdolist_list_var = tva_inference.tva_unify( ConsesLow.list( $const58$likelihoodOfArguments_TypeType, pred, var0, col_1, var2 ), mt, NIL, justifyP, $kw64$NONE, T, NIL );
    SubLObject bindings_justification = NIL;
    bindings_justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = bindings_justification;
      SubLObject v_bindings = NIL;
      SubLObject justification = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
      justification = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != isa.isaP( ins, bindings.variable_lookup( var0, v_bindings ), mt, UNPROVIDED ) )
        {
          return Values.values( narts_high.nart_hl_formula( bindings.variable_lookup( var2, v_bindings ) ), justification );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      bindings_justification = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 27971L)
  public static SubLObject simple_nartP(final SubLObject col)
  {
    if( col.isList() && cycl_utilities.formula_arg0( col ).eql( $const13$and ) )
    {
      return NIL;
    }
    if( NIL == conses_high.member( cycl_utilities.formula_arg0( col ), $nart_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( col, $kw16$IGNORE );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( v_term.isList() && NIL != conses_high.member( cycl_utilities.formula_arg0( v_term ), $nart_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 28334L)
  public static SubLObject possibly_get_atomic_collection(final SubLObject col)
  {
    if( col.isList() )
    {
      final SubLObject arg_0 = cycl_utilities.formula_arg0( col );
      if( NIL != conses_high.member( arg_0, $nart_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
      {
        return cycl_utilities.formula_arg1( col, UNPROVIDED );
      }
    }
    return col;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 28548L)
  public static SubLObject answers_for(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_answer = plausibility_utilities.implausible_sentenceP( col, $const6$EverythingPSC, T, UNPROVIDED );
    final SubLObject justify = thread.secondMultipleValue();
    thread.resetMultipleValues();
    PrintLow.format( T, $str68$____a__a_, v_answer, justify );
    PrintLow.format( T, $str69$____a_, plausibility_of_sentence( col, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 28793L)
  public static SubLObject find_distance_between_term_sets(final SubLObject set_1, final SubLObject set_2, final SubLObject mt, SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    final SubLObject elements_1 = get_elements_of_set( set_1 );
    final SubLObject elements_2 = get_elements_of_set( set_2 );
    if( NIL != elements_1 && NIL != elements_2 )
    {
      final SubLObject score = find_distance_between_detected_and_predicted_features( elements_1, elements_2, mt, verbose );
      if( NIL != score && !score.numL( ZERO_INTEGER ) && !score.numG( ONE_INTEGER ) )
      {
        return Numbers.subtract( ONE_INTEGER, score );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 29323L)
  public static SubLObject find_distance_between_detected_and_predicted_features(final SubLObject features_1, final SubLObject features_2, final SubLObject mt, SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    SubLObject total = ZERO_INTEGER;
    final SubLObject len = Sequences.length( features_1 );
    SubLObject cdolist_list_var = features_1;
    SubLObject parse_feature = NIL;
    parse_feature = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject score = find_distance_between_parse_features_and_features( parse_feature, features_2, mt, verbose );
      if( NIL != verbose )
      {
        PrintLow.format( T, $str70$___Detected_Feature___a__a_, parse_feature, score );
        PrintLow.format( T, $str71$_________ );
      }
      total = Numbers.add( total, score );
      cdolist_list_var = cdolist_list_var.rest();
      parse_feature = cdolist_list_var.first();
    }
    if( len.numG( ZERO_INTEGER ) )
    {
      return Numbers.divide( total, len );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 29868L)
  public static SubLObject find_distance_between_parse_features_and_features(final SubLObject parse_feature, final SubLObject features, final SubLObject mt, final SubLObject verbose)
  {
    SubLObject lst_of_scores = NIL;
    SubLObject cdolist_list_var = features;
    SubLObject feature = NIL;
    feature = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject score = find_distance_between_collections( parse_feature, feature, mt, verbose );
      if( NIL != score )
      {
        lst_of_scores = ConsesLow.cons( score, lst_of_scores );
      }
      else
      {
        lst_of_scores = ConsesLow.cons( ONE_INTEGER, lst_of_scores );
      }
      cdolist_list_var = cdolist_list_var.rest();
      feature = cdolist_list_var.first();
    }
    if( NIL != lst_of_scores )
    {
      return Functions.apply( Symbols.symbol_function( $sym56$MIN ), lst_of_scores );
    }
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 30299L)
  public static SubLObject find_apriori_score_for_collection(final SubLObject col_1)
  {
    SubLObject col = NIL;
    if( col_1.isList() )
    {
      col = narts_high.find_nart( col_1 );
    }
    else
    {
      col = col_1;
    }
    if( NIL != col )
    {
      final SubLObject number_of_specs = cardinality_estimates.spec_cardinality( col );
      if( number_of_specs.isNumber() )
      {
        return Numbers.divide( ONE_INTEGER, Numbers.add( number_of_specs, TWO_INTEGER ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 30619L)
  public static SubLObject find_apriori_score_for_predicate(final SubLObject pred)
  {
    final SubLObject num = genl_predicates.count_all_spec_predicates( pred, $const6$EverythingPSC, UNPROVIDED );
    if( NIL != num )
    {
      return Numbers.divide( ONE_INTEGER, Numbers.add( num, TWO_INTEGER ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 30787L)
  public static SubLObject coefficient_of_generalization(final SubLObject spec, final SubLObject genl)
  {
    final SubLObject coeff_of_generalization_of_parent = find_apriori_score_for_collection( genl );
    final SubLObject coeff_of_generalization_of_child = find_apriori_score_for_collection( spec );
    if( NIL != coeff_of_generalization_of_parent && NIL != coeff_of_generalization_of_child )
    {
      return Numbers.divide( coeff_of_generalization_of_parent, coeff_of_generalization_of_child );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 31192L)
  public static SubLObject coefficient_of_generalization_pred(final SubLObject spec, final SubLObject genl)
  {
    final SubLObject coeff_of_generalization_of_parent = find_apriori_score_for_predicate( spec );
    final SubLObject coeff_of_generalization_of_child = find_apriori_score_for_predicate( genl );
    if( NIL != coeff_of_generalization_of_parent && NIL != coeff_of_generalization_of_child )
    {
      return Numbers.divide( coeff_of_generalization_of_parent, coeff_of_generalization_of_child );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 31597L)
  public static SubLObject coefficient_of_specialization(final SubLObject spec, final SubLObject genl)
  {
    final SubLObject coeff_of_generalization_of_parent = find_apriori_score_for_collection( genl );
    final SubLObject coeff_of_generalization_of_child = find_apriori_score_for_collection( spec );
    if( NIL != coeff_of_generalization_of_parent && NIL != coeff_of_generalization_of_child )
    {
      return Numbers.subtract( coeff_of_generalization_of_child, coeff_of_generalization_of_parent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 32002L)
  public static SubLObject find_lowest_common_ancestor(final SubLObject col_1, final SubLObject col_2, final SubLObject mt, SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    final SubLObject all_common_ancestors = find_common_genls( col_1, col_2 );
    SubLObject scores_of_parent = NIL;
    SubLObject current_min = NIL;
    SubLObject cdolist_list_var = all_common_ancestors;
    SubLObject parent = NIL;
    parent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject depth = Numbers.floor( Numbers.divide( cardinality_estimates.generality_estimate( parent ), $float72$19403_06 ), UNPROVIDED );
      if( NIL != depth )
      {
        scores_of_parent = ConsesLow.cons( ConsesLow.list( parent, depth ), scores_of_parent );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parent = cdolist_list_var.first();
    }
    current_min = cycl_utilities.formula_arg0( scores_of_parent );
    cdolist_list_var = scores_of_parent;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg1( entry, UNPROVIDED ).numL( cycl_utilities.formula_arg1( current_min, UNPROVIDED ) ) )
      {
        current_min = entry;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return cycl_utilities.formula_arg0( current_min );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 32669L)
  public static SubLObject find_lowest_common_ancestor_of_predicates(final SubLObject pred_1, final SubLObject pred_2, final SubLObject mt, SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    final SubLObject all_common_ancestors = find_common_genlpreds( pred_1, pred_2 );
    SubLObject scores_of_parent = NIL;
    SubLObject current_min = NIL;
    SubLObject cdolist_list_var = all_common_ancestors;
    SubLObject parent = NIL;
    parent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject depth = Numbers.floor( Numbers.divide( cardinality_estimates.generality_estimate( parent ), $float72$19403_06 ), UNPROVIDED );
      if( NIL != depth )
      {
        scores_of_parent = ConsesLow.cons( ConsesLow.list( parent, depth ), scores_of_parent );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parent = cdolist_list_var.first();
    }
    current_min = cycl_utilities.formula_arg0( scores_of_parent );
    cdolist_list_var = scores_of_parent;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.formula_arg1( entry, UNPROVIDED ).numL( cycl_utilities.formula_arg1( current_min, UNPROVIDED ) ) )
      {
        current_min = entry;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return cycl_utilities.formula_arg0( current_min );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 33361L)
  public static SubLObject find_associations_between_objects(final SubLObject thing_1, final SubLObject thing_2)
  {
    if( thing_1.equal( thing_2 ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL != isa.isaP( thing_1, $const73$Collection, $const6$EverythingPSC, UNPROVIDED ) && NIL != isa.isaP( thing_2, $const73$Collection, $const6$EverythingPSC, UNPROVIDED ) )
    {
      return check_genl_associations( thing_1, thing_2 );
    }
    if( NIL != isa.isaP( thing_2, $const74$Individual, $const6$EverythingPSC, UNPROVIDED ) && NIL != isa.isaP( thing_1, $const73$Collection, $const6$EverythingPSC, UNPROVIDED ) )
    {
      return check_isa_associations( thing_1, thing_2 );
    }
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 33849L)
  public static SubLObject find_distance_between_collections(final SubLObject col_1, final SubLObject col_2, final SubLObject mt, SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    SubLObject score_1 = NIL;
    final SubLObject event_association_score = find_associations_between_objects( col_1, col_2 );
    if( NIL != event_association_score )
    {
      score_1 = Numbers.multiply( $float11$0_5, event_association_score );
    }
    else
    {
      score_1 = ONE_INTEGER;
    }
    return score_1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 34298L)
  public static SubLObject find_distance_between_collections_hierarchy(final SubLObject col_1, final SubLObject col_2, final SubLObject mt, SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    final SubLObject common_ancestor = find_lowest_common_ancestor( col_1, col_2, mt, verbose );
    if( NIL != common_ancestor )
    {
      final SubLObject specialization_score = coefficient_of_specialization( col_1, common_ancestor );
      final SubLObject generalization_score = coefficient_of_generalization( col_2, common_ancestor );
      if( NIL != specialization_score && NIL != generalization_score )
      {
        final SubLObject score = Numbers.divide( Numbers.add( Numbers.log( Numbers.add( ONE_INTEGER, Numbers.multiply( TWO_INTEGER, specialization_score ) ), UNPROVIDED ), Numbers.subtract( ZERO_INTEGER, Numbers.log(
            generalization_score, UNPROVIDED ) ) ), TWELVE_INTEGER );
        return score;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 35077L)
  public static SubLObject find_reinforcement_of_node(final SubLObject parent, final SubLObject col_1, final SubLObject col_2, final SubLObject mt)
  {
    final SubLObject no_of_paths_1 = Sequences.length( gt_methods.gt_all_paths( $const75$genls, col_1, parent, mt ) );
    final SubLObject no_of_paths_2 = Sequences.length( gt_methods.gt_all_paths( $const75$genls, col_2, parent, mt ) );
    if( NIL != no_of_paths_1 && NIL != no_of_paths_2 )
    {
      return Numbers.add( no_of_paths_1, no_of_paths_2 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 35385L)
  public static SubLObject find_common_genls(final SubLObject col_1, final SubLObject col_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject all = inference_kernel.new_cyc_query( ConsesLow.listS( $const76$nearestCommonGenls, col_1, col_2, $list77 ), $list78, ConsesLow.list( new SubLObject[] { $kw79$INFERENCE_MODE, $kw80$MINIMAL,
      $kw81$ALLOW_INDETERMINATE_RESULTS_, NIL, $kw82$DISJUNCTION_FREE_EL_VARS_POLICY, $kw83$COMPUTE_INTERSECTION, $kw84$TRANSFORMATION_ALLOWED_, NIL, $kw85$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T,
      $kw86$NEW_TERMS_ALLOWED_, NIL, $kw87$COMPUTE_ANSWER_JUSTIFICATIONS_, T, $kw88$MAX_TIME, FIVE_INTEGER, $kw89$PROBABLY_APPROXIMATELY_DONE, $float90$1_0, $kw91$MAX_PROOF_DEPTH, FIFTEEN_INTEGER, $kw92$ANSWER_LANGUAGE,
      $kw93$HL, $kw94$CONTINUABLE_, T, $kw95$PRODUCTIVITY_LIMIT, $int96$20000000
    } ) );
    SubLObject answers = NIL;
    SubLObject cdolist_list_var = all;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject col = bindings.variable_lookup( $sym15$_X, x );
      SubLObject col_1_$16 = NIL;
      if( NIL != nart_handles.nart_p( col ) )
      {
        col_1_$16 = narts_high.nart_hl_formula( plausibility_utilities.possibly_find_nart( col ) );
      }
      else
      {
        col_1_$16 = col;
      }
      if( NIL == conses_high.member( col_1_$16, $not_useful_cols_for_similarity_computations$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        answers = ConsesLow.cons( bindings.variable_lookup( $sym15$_X, x ), answers );
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 36377L)
  public static SubLObject find_common_genlpreds(final SubLObject pred_1, final SubLObject pred_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.set_difference( conses_high.intersection( genl_predicates.all_genl_predicates( pred_1, $const6$EverythingPSC, UNPROVIDED ), genl_predicates.all_genl_predicates( pred_2, $const6$EverythingPSC,
        UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED ), $not_useful_cols_for_similarity_computations$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 36675L)
  public static SubLObject check_genl_associations(final SubLObject event_1, final SubLObject event_2)
  {
    if( NIL != genls.genlP( event_1, event_2, $const6$EverythingPSC, UNPROVIDED ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL != genls.genlP( event_2, event_1, $const6$EverythingPSC, UNPROVIDED ) )
    {
      return Numbers.subtract( ONE_INTEGER, Numbers.expt( coefficient_of_generalization( event_2, event_1 ), $float51$0_25 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 36934L)
  public static SubLObject check_genlpred_associations(final SubLObject pred_1, final SubLObject pred_2)
  {
    if( NIL != genl_predicates.genl_predicateP( pred_1, pred_2, $const6$EverythingPSC, UNPROVIDED ) )
    {
      return Numbers.subtract( ONE_INTEGER, Numbers.expt( coefficient_of_generalization_pred( pred_2, pred_1 ), $float51$0_25 ) );
    }
    return Numbers.subtract( ONE_INTEGER, Numbers.expt( coefficient_of_generalization_pred( pred_1, pred_2 ), $float51$0_25 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 37217L)
  public static SubLObject check_isa_associations(final SubLObject thing_1, final SubLObject thing_2)
  {
    SubLObject lst_of_scores = NIL;
    SubLObject cdolist_list_var = isa.isa( thing_2, $const6$EverythingPSC, UNPROVIDED );
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject genl_association_score = check_genl_associations( thing_1, col );
      if( NIL != genl_association_score )
      {
        lst_of_scores = ConsesLow.cons( genl_association_score, lst_of_scores );
      }
      else
      {
        lst_of_scores = ConsesLow.cons( ONE_INTEGER, lst_of_scores );
      }
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    if( NIL != lst_of_scores )
    {
      return Functions.apply( Symbols.symbol_function( $sym56$MIN ), lst_of_scores );
    }
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 37657L)
  public static SubLObject get_elements_of_set(final SubLObject v_set)
  {
    final SubLObject all_answers = inference_kernel.new_cyc_query( ConsesLow.list( $const97$evaluate, $sym98$_ABC, ConsesLow.list( $const99$SetExtentFn, v_set ) ), UNPROVIDED, UNPROVIDED );
    if( NIL != all_answers )
    {
      return Sequences.remove_duplicates( cycl_utilities.formula_args( bindings.variable_lookup( $sym98$_ABC, cycl_utilities.formula_arg0( all_answers ) ), UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 37915L)
  public static SubLObject find_distance_between_collections_sym(final SubLObject col_1, final SubLObject col_2, final SubLObject mt)
  {
    final SubLObject common_ancestor = find_lowest_common_ancestor( col_1, col_2, mt, UNPROVIDED );
    final SubLObject score_1 = check_genl_associations( common_ancestor, col_1 );
    final SubLObject score_2 = check_genl_associations( common_ancestor, col_2 );
    if( NIL != score_1 && NIL != score_2 )
    {
      return Numbers.divide( Numbers.add( score_1, score_2 ), TWO_INTEGER );
    }
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 38288L)
  public static SubLObject find_distance_between_predicates_sym(final SubLObject pred_1, final SubLObject pred_2, final SubLObject mt)
  {
    final SubLObject common_ancestor = find_lowest_common_ancestor_of_predicates( pred_1, pred_2, mt, UNPROVIDED );
    final SubLObject score_1 = check_genlpred_associations( common_ancestor, pred_1 );
    final SubLObject score_2 = check_genlpred_associations( common_ancestor, pred_2 );
    if( NIL != score_1 && NIL != score_2 )
    {
      return Numbers.divide( Numbers.add( score_1, score_2 ), TWO_INTEGER );
    }
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 38683L)
  public static SubLObject find_distance_between_individuals_sym(final SubLObject ind_1, final SubLObject ind_2, final SubLObject mt)
  {
    SubLObject lst_of_scores = NIL;
    SubLObject cdolist_list_var = isa.min_isa( ind_1, $const6$EverythingPSC, UNPROVIDED );
    SubLObject col_1 = NIL;
    col_1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$17 = isa.min_isa( ind_2, $const6$EverythingPSC, UNPROVIDED );
      SubLObject col_2 = NIL;
      col_2 = cdolist_list_var_$17.first();
      while ( NIL != cdolist_list_var_$17)
      {
        lst_of_scores = ConsesLow.cons( find_distance_between_collections_sym( col_1, col_2, mt ), lst_of_scores );
        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
        col_2 = cdolist_list_var_$17.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      col_1 = cdolist_list_var.first();
    }
    return Functions.apply( Symbols.symbol_function( $sym56$MIN ), lst_of_scores );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 39021L)
  public static SubLObject find_distance_between_assertions(final SubLObject assertion_1, final SubLObject assertion_2, final SubLObject mt)
  {
    final SubLObject count_1 = Sequences.length( assertion_1 );
    final SubLObject count_2 = Sequences.length( assertion_2 );
    SubLObject sum_of_scores = ZERO_INTEGER;
    final SubLObject count = Numbers.min( count_1, count_2 );
    if( NIL == assertion_1 || NIL == assertion_2 )
    {
      return NIL;
    }
    SubLObject c;
    for( c = NIL, c = ZERO_INTEGER; c.numL( count ); c = Numbers.add( c, ONE_INTEGER ) )
    {
      sum_of_scores = Numbers.add( sum_of_scores, find_distance_between_terms_sym( ConsesLow.nth( c, assertion_1 ), ConsesLow.nth( c, assertion_2 ), mt ) );
    }
    if( NIL != sum_of_scores )
    {
      return Numbers.divide( sum_of_scores, count );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 39535L)
  public static SubLObject find_distance_between_terms_sym(final SubLObject term_1, final SubLObject term_2, final SubLObject mt)
  {
    if( NIL != isa.isaP( term_1, $const100$Predicate, UNPROVIDED, UNPROVIDED ) && NIL != isa.isaP( term_2, $const100$Predicate, UNPROVIDED, UNPROVIDED ) )
    {
      return find_distance_between_predicates_sym( term_1, term_2, mt );
    }
    if( NIL != isa.isaP( term_1, $const73$Collection, UNPROVIDED, UNPROVIDED ) && NIL != isa.isaP( term_2, $const73$Collection, UNPROVIDED, UNPROVIDED ) )
    {
      return find_distance_between_collections_sym( term_1, term_2, mt );
    }
    if( NIL != isa.isaP( term_1, $const74$Individual, UNPROVIDED, UNPROVIDED ) && NIL != isa.isaP( term_2, $const74$Individual, UNPROVIDED, UNPROVIDED ) )
    {
      return find_distance_between_individuals_sym( term_1, term_2, mt );
    }
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 40089L)
  public static SubLObject distance_between_two_strings(final SubLObject str1, final SubLObject str2)
  {
    if( !str1.isString() || !str2.isString() )
    {
      return $int101$1000;
    }
    final SubLObject m = Sequences.length( str1 );
    final SubLObject n = Sequences.length( str2 );
    SubLObject weight_due_to_common_terms = Numbers.multiply( TEN_INTEGER, Sequences.length( Sequences.remove( $str102$, conses_high.intersection( string_utilities.split_string( str1, UNPROVIDED ), string_utilities
        .split_string( str2, UNPROVIDED ), Symbols.symbol_function( $sym103$STRING_ ), UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    if( m.numE( ZERO_INTEGER ) )
    {
      return n;
    }
    if( n.numE( ZERO_INTEGER ) )
    {
      return m;
    }
    final SubLObject distance_vector = vector_utilities.make_ndim_array( Numbers.add( n, ONE_INTEGER ), Numbers.add( m, ONE_INTEGER ) );
    vector_utilities.set_aref_ndim( distance_vector, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER );
    SubLObject count;
    for( count = NIL, count = ZERO_INTEGER; count.numL( n ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      vector_utilities.set_aref_ndim( distance_vector, Numbers.add( count, ONE_INTEGER ), ZERO_INTEGER, Numbers.add( vector_utilities.aref_ndim( distance_vector, count, ZERO_INTEGER ), ONE_INTEGER ) );
    }
    for( count = NIL, count = ZERO_INTEGER; count.numL( m ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      vector_utilities.set_aref_ndim( distance_vector, ZERO_INTEGER, Numbers.add( count, ONE_INTEGER ), Numbers.add( vector_utilities.aref_ndim( distance_vector, ZERO_INTEGER, count ), ONE_INTEGER ) );
    }
    SubLObject x;
    SubLObject y;
    SubLObject same_character;
    SubLObject third_term;
    for( x = NIL, x = ZERO_INTEGER; x.numL( n ); x = Numbers.add( x, ONE_INTEGER ) )
    {
      for( y = NIL, y = ZERO_INTEGER; y.numL( m ); y = Numbers.add( y, ONE_INTEGER ) )
      {
        same_character = Characters.char_equal( Vectors.aref( str1, y ), Vectors.aref( str2, x ) );
        third_term = NIL;
        if( NIL != same_character )
        {
          third_term = vector_utilities.aref_ndim( distance_vector, x, y );
        }
        else
        {
          third_term = Numbers.add( ONE_INTEGER, vector_utilities.aref_ndim( distance_vector, x, y ) );
        }
        vector_utilities.set_aref_ndim( distance_vector, Numbers.add( x, ONE_INTEGER ), Numbers.add( y, ONE_INTEGER ), Numbers.min( third_term, new SubLObject[] { Numbers.add( vector_utilities.aref_ndim( distance_vector,
            x, Numbers.add( y, ONE_INTEGER ) ), ONE_INTEGER ), Numbers.add( ONE_INTEGER, vector_utilities.aref_ndim( distance_vector, Numbers.add( x, ONE_INTEGER ), y ) )
        } ) );
      }
    }
    if( weight_due_to_common_terms.numE( ZERO_INTEGER ) )
    {
      weight_due_to_common_terms = $int104$_5;
    }
    return Numbers.subtract( vector_utilities.aref_ndim( distance_vector, n, m ), weight_due_to_common_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 41632L)
  public static SubLObject best_concept_match_for_string(final SubLObject str, SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    final SubLObject definite_description_match = find_definite_descriptions_match( str );
    final SubLObject length_of_input = Sequences.length( replace_too_common_strings( str ) );
    if( NIL == definite_description_match )
    {
      return NIL;
    }
    final SubLObject gaf = cycl_utilities.formula_arg0( definite_description_match );
    final SubLObject distance = cycl_utilities.formula_arg1( definite_description_match, UNPROVIDED );
    final SubLObject length_of_closest_match = Sequences.length( replace_too_common_strings( cycl_utilities.formula_arg2( gaf, UNPROVIDED ) ) );
    if( NIL != verbose )
    {
      PrintLow.format( T, $str105$____a__a__a__a, new SubLObject[] { length_of_closest_match, distance, length_of_input, definite_description_match
      } );
    }
    if( distance.numL( ZERO_INTEGER ) || distance.numE( ZERO_INTEGER ) )
    {
      return cycl_utilities.formula_arg1( gaf, UNPROVIDED );
    }
    if( Numbers.divide( distance, length_of_closest_match ).numG( $float106$0_8 ) )
    {
      return NIL;
    }
    if( Numbers.divide( distance, length_of_input ).numG( $float106$0_8 ) )
    {
      return NIL;
    }
    return cycl_utilities.formula_arg1( gaf, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 42551L)
  public static SubLObject find_definite_descriptions_match(final SubLObject str1)
  {
    SubLObject list_of_assertions_and_their_distance = NIL;
    final SubLObject str2 = replace_too_common_strings( str1 );
    SubLObject cdolist_list_var = genls.all_specs( $const110$BiologySCGTemplateAdmittedThing, $const6$EverythingPSC, UNPROVIDED );
    SubLObject thing = NIL;
    thing = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == genls.genlP( thing, $const107$IntelligentAgent, $const6$EverythingPSC, UNPROVIDED ) && NIL == isa.isaP( thing, $const108$owl_Class, $const6$EverythingPSC, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$18;
        final SubLObject all_definite_description_assertions = cdolist_list_var_$18 = kb_mapping_utilities.pred_value_gafs_in_any_mt( thing, $const109$definiteDescriptions, ONE_INTEGER, UNPROVIDED );
        SubLObject definite_description_assertion = NIL;
        definite_description_assertion = cdolist_list_var_$18.first();
        while ( NIL != cdolist_list_var_$18)
        {
          final SubLObject gaf = assertions_high.gaf_formula( definite_description_assertion );
          final SubLObject string_in_gaf = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
          list_of_assertions_and_their_distance = ConsesLow.cons( ConsesLow.list( gaf, distance_between_two_strings( str2, replace_too_common_strings( string_in_gaf ) ) ), list_of_assertions_and_their_distance );
          cdolist_list_var_$18 = cdolist_list_var_$18.rest();
          definite_description_assertion = cdolist_list_var_$18.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      thing = cdolist_list_var.first();
    }
    return cycl_utilities.formula_arg0( Sort.sort( list_of_assertions_and_their_distance, Symbols.symbol_function( $sym111$_ ), $sym112$FORMULA_ARG1 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 43524L)
  public static SubLObject find_all_aura_concepts()
  {
    final SubLObject nat = narts_high.find_nart( $list113 );
    final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( nat, $const114$quotedIsa, TWO_INTEGER, UNPROVIDED );
    SubLObject all = NIL;
    SubLObject cdolist_list_var = all_assertions;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      all = ConsesLow.cons( cycl_utilities.formula_arg1( assertions_high.gaf_formula( x ), UNPROVIDED ), all );
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return all;
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 43827L)
  public static SubLObject find_namestring_match(final SubLObject str1)
  {
    SubLObject list_of_assertions_and_their_distance = NIL;
    final SubLObject str2 = replace_too_common_strings( str1 );
    SubLObject cdolist_list_var = genls.all_specs( $const110$BiologySCGTemplateAdmittedThing, $const6$EverythingPSC, UNPROVIDED );
    SubLObject thing = NIL;
    thing = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == genls.genlP( thing, $const107$IntelligentAgent, $const6$EverythingPSC, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$19;
        final SubLObject all_name_string_assertions = cdolist_list_var_$19 = kb_mapping_utilities.pred_value_gafs_in_any_mt( thing, $const115$nameString, ONE_INTEGER, UNPROVIDED );
        SubLObject name_string_assertion = NIL;
        name_string_assertion = cdolist_list_var_$19.first();
        while ( NIL != cdolist_list_var_$19)
        {
          final SubLObject gaf = assertions_high.gaf_formula( name_string_assertion );
          final SubLObject string_in_gaf = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
          list_of_assertions_and_their_distance = ConsesLow.cons( ConsesLow.list( gaf, distance_between_two_strings( str2, replace_too_common_strings( string_in_gaf ) ) ), list_of_assertions_and_their_distance );
          cdolist_list_var_$19 = cdolist_list_var_$19.rest();
          name_string_assertion = cdolist_list_var_$19.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      thing = cdolist_list_var.first();
    }
    return cycl_utilities.formula_arg0( cycl_utilities.formula_arg0( Sort.sort( list_of_assertions_and_their_distance, Symbols.symbol_function( $sym111$_ ), $sym112$FORMULA_ARG1 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/plausible-narts.lisp", position = 44652L)
  public static SubLObject replace_too_common_strings(final SubLObject str)
  {
    if( str.isString() )
    {
      return string_utilities.string_subst( $str116$_, $str117$_does_, string_utilities.string_subst( $str116$_, $str118$_with_, string_utilities.string_subst( $str116$_, $str119$_where_, string_utilities.string_subst(
          $str116$_, $str120$_and_, string_utilities.string_subst( $str116$_, $str121$_do_, string_utilities.string_subst( $str116$_, $str122$_, string_utilities.string_subst( $str116$_, $str123$_why_, string_utilities
              .string_subst( $str116$_, $str124$_how_, string_utilities.string_subst( $str116$_, $str125$_what_, string_utilities.string_subst( $str116$_, $str126$_to_, string_utilities.string_subst( $str116$_,
                  $str127$_of_, string_utilities.string_subst( $str116$_, $str128$_is_, string_utilities.string_subst( $str116$_, $str129$_the_, string_utilities.string_subst( $str116$_, $str130$_a_, string_utilities
                      .string_subst( $str116$_, $str131$_an_, Strings.string_downcase( string_utilities.concatenate_strings( ConsesLow.list( $str116$_, str, $str116$_ ) ), UNPROVIDED, UNPROVIDED ), UNPROVIDED ),
                      UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED );
    }
    return NIL;
  }

  public static SubLObject declare_plausible_narts_file()
  {
    SubLFiles.declareFunction( me, "default_plausubility_justification", "DEFAULT-PLAUSUBILITY-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "plausibility_of_sentence", "PLAUSIBILITY-OF-SENTENCE", 1, 2, false );
    SubLFiles.declareFunction( me, "handle_arbitrary_expression", "HANDLE-ARBITRARY-EXPRESSION", 1, 2, false );
    SubLFiles.declareFunction( me, "find_plausibility_of_collection", "FIND-PLAUSIBILITY-OF-COLLECTION", 1, 2, false );
    SubLFiles.declareFunction( me, "handle_nested_nart", "HANDLE-NESTED-NART", 1, 2, false );
    SubLFiles.declareFunction( me, "find_plausibility_of_sentences", "FIND-PLAUSIBILITY-OF-SENTENCES", 1, 2, false );
    SubLFiles.declareFunction( me, "combine_plausibility_scores", "COMBINE-PLAUSIBILITY-SCORES", 1, 0, false );
    SubLFiles.declareFunction( me, "assess_plausibility_of_sentence", "ASSESS-PLAUSIBILITY-OF-SENTENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "assess_plausibility_of_isa_sentence", "ASSESS-PLAUSIBILITY-OF-ISA-SENTENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "assess_plausibility_of_binary_predicate", "ASSESS-PLAUSIBILITY-OF-BINARY-PREDICATE", 4, 0, false );
    SubLFiles.declareFunction( me, "handle_plausibility_of_binary_predicate_types_ins", "HANDLE-PLAUSIBILITY-OF-BINARY-PREDICATE-TYPES-INS", 5, 0, false );
    SubLFiles.declareFunction( me, "handle_plausibility_of_binary_predicate_ins_types", "HANDLE-PLAUSIBILITY-OF-BINARY-PREDICATE-INS-TYPES", 5, 0, false );
    SubLFiles.declareFunction( me, "handle_plausibility_of_binary_predicate_types_types", "HANDLE-PLAUSIBILITY-OF-BINARY-PREDICATE-TYPES-TYPES", 5, 0, false );
    SubLFiles.declareFunction( me, "assess_plausibility_of_relation_instance_exists", "ASSESS-PLAUSIBILITY-OF-RELATION-INSTANCE-EXISTS", 4, 0, false );
    SubLFiles.declareFunction( me, "assess_plausibility_of_collections", "ASSESS-PLAUSIBILITY-OF-COLLECTIONS", 5, 0, false );
    SubLFiles.declareFunction( me, "gather_collections_for_variable", "GATHER-COLLECTIONS-FOR-VARIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_simple_nart", "HANDLE-SIMPLE-NART", 3, 0, false );
    SubLFiles.declareFunction( me, "get_plausibility_of_binary_predicate_type_type", "GET-PLAUSIBILITY-OF-BINARY-PREDICATE-TYPE-TYPE", 5, 0, false );
    SubLFiles.declareFunction( me, "get_plausibility_of_binary_predicate_type_ins", "GET-PLAUSIBILITY-OF-BINARY-PREDICATE-TYPE-INS", 5, 0, false );
    SubLFiles.declareFunction( me, "handle_composite_activity_fn", "HANDLE-COMPOSITE-ACTIVITY-FN", 3, 0, false );
    SubLFiles.declareFunction( me, "handle_collection_intersection_2_fn", "HANDLE-COLLECTION-INTERSECTION-2-FN", 3, 0, false );
    SubLFiles.declareFunction( me, "handle_plausibility_of_isa_sentence", "HANDLE-PLAUSIBILITY-OF-ISA-SENTENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "map_likelihood_to_numbers", "MAP-LIKELIHOOD-TO-NUMBERS", 1, 0, false );
    SubLFiles.declareFunction( me, "combined_evidence", "COMBINED-EVIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_min_likelihood", "FIND-MIN-LIKELIHOOD", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_do_tva_query_type_type", "CLEAR-DO-TVA-QUERY-TYPE-TYPE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_do_tva_query_type_type", "REMOVE-DO-TVA-QUERY-TYPE-TYPE", 5, 0, false );
    SubLFiles.declareFunction( me, "do_tva_query_type_type_internal", "DO-TVA-QUERY-TYPE-TYPE-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "do_tva_query_type_type", "DO-TVA-QUERY-TYPE-TYPE", 5, 0, false );
    SubLFiles.declareFunction( me, "clear_do_tva_query_type_disjoint_with", "CLEAR-DO-TVA-QUERY-TYPE-DISJOINT-WITH", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_do_tva_query_type_disjoint_with", "REMOVE-DO-TVA-QUERY-TYPE-DISJOINT-WITH", 5, 0, false );
    SubLFiles.declareFunction( me, "do_tva_query_type_disjoint_with_internal", "DO-TVA-QUERY-TYPE-DISJOINT-WITH-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "do_tva_query_type_disjoint_with", "DO-TVA-QUERY-TYPE-DISJOINT-WITH", 5, 0, false );
    SubLFiles.declareFunction( me, "do_tva_query_ins_not_in_col", "DO-TVA-QUERY-INS-NOT-IN-COL", 5, 0, false );
    SubLFiles.declareFunction( me, "do_tva_query_type_ins", "DO-TVA-QUERY-TYPE-INS", 5, 0, false );
    SubLFiles.declareFunction( me, "do_tva_query_ins_type", "DO-TVA-QUERY-INS-TYPE", 5, 0, false );
    SubLFiles.declareFunction( me, "simple_nartP", "SIMPLE-NART?", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_get_atomic_collection", "POSSIBLY-GET-ATOMIC-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "answers_for", "ANSWERS-FOR", 1, 0, false );
    SubLFiles.declareFunction( me, "find_distance_between_term_sets", "FIND-DISTANCE-BETWEEN-TERM-SETS", 3, 1, false );
    SubLFiles.declareFunction( me, "find_distance_between_detected_and_predicted_features", "FIND-DISTANCE-BETWEEN-DETECTED-AND-PREDICTED-FEATURES", 3, 1, false );
    SubLFiles.declareFunction( me, "find_distance_between_parse_features_and_features", "FIND-DISTANCE-BETWEEN-PARSE-FEATURES-AND-FEATURES", 4, 0, false );
    SubLFiles.declareFunction( me, "find_apriori_score_for_collection", "FIND-APRIORI-SCORE-FOR-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "find_apriori_score_for_predicate", "FIND-APRIORI-SCORE-FOR-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "coefficient_of_generalization", "COEFFICIENT-OF-GENERALIZATION", 2, 0, false );
    SubLFiles.declareFunction( me, "coefficient_of_generalization_pred", "COEFFICIENT-OF-GENERALIZATION-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "coefficient_of_specialization", "COEFFICIENT-OF-SPECIALIZATION", 2, 0, false );
    SubLFiles.declareFunction( me, "find_lowest_common_ancestor", "FIND-LOWEST-COMMON-ANCESTOR", 3, 1, false );
    SubLFiles.declareFunction( me, "find_lowest_common_ancestor_of_predicates", "FIND-LOWEST-COMMON-ANCESTOR-OF-PREDICATES", 3, 1, false );
    SubLFiles.declareFunction( me, "find_associations_between_objects", "FIND-ASSOCIATIONS-BETWEEN-OBJECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "find_distance_between_collections", "FIND-DISTANCE-BETWEEN-COLLECTIONS", 3, 1, false );
    SubLFiles.declareFunction( me, "find_distance_between_collections_hierarchy", "FIND-DISTANCE-BETWEEN-COLLECTIONS-HIERARCHY", 3, 1, false );
    SubLFiles.declareFunction( me, "find_reinforcement_of_node", "FIND-REINFORCEMENT-OF-NODE", 4, 0, false );
    SubLFiles.declareFunction( me, "find_common_genls", "FIND-COMMON-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "find_common_genlpreds", "FIND-COMMON-GENLPREDS", 2, 0, false );
    SubLFiles.declareFunction( me, "check_genl_associations", "CHECK-GENL-ASSOCIATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "check_genlpred_associations", "CHECK-GENLPRED-ASSOCIATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "check_isa_associations", "CHECK-ISA-ASSOCIATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_elements_of_set", "GET-ELEMENTS-OF-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "find_distance_between_collections_sym", "FIND-DISTANCE-BETWEEN-COLLECTIONS-SYM", 3, 0, false );
    SubLFiles.declareFunction( me, "find_distance_between_predicates_sym", "FIND-DISTANCE-BETWEEN-PREDICATES-SYM", 3, 0, false );
    SubLFiles.declareFunction( me, "find_distance_between_individuals_sym", "FIND-DISTANCE-BETWEEN-INDIVIDUALS-SYM", 3, 0, false );
    SubLFiles.declareFunction( me, "find_distance_between_assertions", "FIND-DISTANCE-BETWEEN-ASSERTIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "find_distance_between_terms_sym", "FIND-DISTANCE-BETWEEN-TERMS-SYM", 3, 0, false );
    SubLFiles.declareFunction( me, "distance_between_two_strings", "DISTANCE-BETWEEN-TWO-STRINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "best_concept_match_for_string", "BEST-CONCEPT-MATCH-FOR-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "find_definite_descriptions_match", "FIND-DEFINITE-DESCRIPTIONS-MATCH", 1, 0, false );
    SubLFiles.declareFunction( me, "find_all_aura_concepts", "FIND-ALL-AURA-CONCEPTS", 0, 0, false );
    SubLFiles.declareFunction( me, "find_namestring_match", "FIND-NAMESTRING-MATCH", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_too_common_strings", "REPLACE-TOO-COMMON-STRINGS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_plausible_narts_file()
  {
    $default_nart_plausibility$ = SubLFiles.deflexical( "*DEFAULT-NART-PLAUSIBILITY*", ( maybeDefault( $sym0$_DEFAULT_NART_PLAUSIBILITY_, $default_nart_plausibility$, $list1 ) ) );
    $too_general_cols_for_plausibility$ = SubLFiles.deflexical( "*TOO-GENERAL-COLS-FOR-PLAUSIBILITY*", ( maybeDefault( $sym2$_TOO_GENERAL_COLS_FOR_PLAUSIBILITY_, $too_general_cols_for_plausibility$, $list3 ) ) );
    $nart_functions$ = SubLFiles.deflexical( "*NART-FUNCTIONS*", ( maybeDefault( $sym4$_NART_FUNCTIONS_, $nart_functions$, $list5 ) ) );
    $default_plausibility_mt$ = SubLFiles.defparameter( "*DEFAULT-PLAUSIBILITY-MT*", $const6$EverythingPSC );
    $not_useful_cols_for_similarity_computations$ = SubLFiles.defparameter( "*NOT-USEFUL-COLS-FOR-SIMILARITY-COMPUTATIONS*", $list7 );
    $do_tva_query_type_type_caching_state$ = SubLFiles.deflexical( "*DO-TVA-QUERY-TYPE-TYPE-CACHING-STATE*", NIL );
    $do_tva_query_type_disjoint_with_caching_state$ = SubLFiles.deflexical( "*DO-TVA-QUERY-TYPE-DISJOINT-WITH-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_plausible_narts_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_DEFAULT_NART_PLAUSIBILITY_ );
    subl_macro_promotions.declare_defglobal( $sym2$_TOO_GENERAL_COLS_FOR_PLAUSIBILITY_ );
    subl_macro_promotions.declare_defglobal( $sym4$_NART_FUNCTIONS_ );
    memoization_state.note_globally_cached_function( $sym57$DO_TVA_QUERY_TYPE_TYPE );
    memoization_state.note_globally_cached_function( $sym62$DO_TVA_QUERY_TYPE_DISJOINT_WITH );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_plausible_narts_file();
  }

  @Override
  public void initializeVariables()
  {
    init_plausible_narts_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_plausible_narts_file();
  }
  static
  {
    me = new plausible_narts();
    $default_nart_plausibility$ = null;
    $too_general_cols_for_plausibility$ = null;
    $nart_functions$ = null;
    $default_plausibility_mt$ = null;
    $not_useful_cols_for_similarity_computations$ = null;
    $do_tva_query_type_type_caching_state$ = null;
    $do_tva_query_type_disjoint_with_caching_state$ = null;
    $sym0$_DEFAULT_NART_PLAUSIBILITY_ = makeSymbol( "*DEFAULT-NART-PLAUSIBILITY*" );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NumericLikelihoodFn" ) ), makeDouble( 0.5 ) );
    $sym2$_TOO_GENERAL_COLS_FOR_PLAUSIBILITY_ = makeSymbol( "*TOO-GENERAL-COLS-FOR-PLAUSIBILITY*" );
    $list3 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Situation" ) ) );
    $sym4$_NART_FUNCTIONS_ = makeSymbol( "*NART-FUNCTIONS*" );
    $list5 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SitTypeSpecWithTypeRestrictionOnRolePlayerFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "SubcollectionOfWithRelationToTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "SubcollectionOfWithRelationFromFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CompositeActivityFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                "CollectionIntersection2Fn" ) ), constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ) );
    $const6$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owl:Thing" ) ), constant_handles.reader_make_constant_shell( makeString( "BiologySCGTemplateAdmittedIndividual" ) ), constant_handles
        .reader_make_constant_shell( makeString( "PartiallyIntangibleIndividual" ) ), constant_handles.reader_make_constant_shell( makeString( "differentSymbols" ) ), constant_handles.reader_make_constant_shell(
            makeString( "different" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionUnionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "TheSet" ) ), constant_handles.reader_make_constant_shell( makeString( "Action" ) ), Vectors.vector( new SubLObject[]
                { constant_handles.reader_make_constant_shell( makeString( "CollectionUnionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles
                    .reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "MultiPersonAgent" ) ) )
    } ) ) ) );
    $kw8$OPAQUE = makeKeyword( "OPAQUE" );
    $const9$sentencePlausibilityScore = constant_handles.reader_make_constant_shell( makeString( "sentencePlausibilityScore" ) );
    $const10$NumericLikelihoodFn = constant_handles.reader_make_constant_shell( makeString( "NumericLikelihoodFn" ) );
    $float11$0_5 = makeDouble( 0.5 );
    $const12$equalSymbols = constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) );
    $const13$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const14$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym15$_X = makeSymbol( "?X" );
    $kw16$IGNORE = makeKeyword( "IGNORE" );
    $const17$relationInstanceExists = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) );
    $const18$biologicalFunction = constant_handles.reader_make_constant_shell( makeString( "biologicalFunction" ) );
    $const19$definitionalDisplaySentence = constant_handles.reader_make_constant_shell( makeString( "definitionalDisplaySentence" ) );
    $list20 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TypeCapableFn" ) ), constant_handles.reader_make_constant_shell( makeString( "behaviorCapable" ) ) );
    $const21$sentenceJustifications_ProofViewS = constant_handles.reader_make_constant_shell( makeString( "sentenceJustifications-ProofViewSummary" ) );
    $const22$relationExistsInstance = constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) );
    $const23$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const24$GroupFn = constant_handles.reader_make_constant_shell( makeString( "GroupFn" ) );
    $const25$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const26$SitTypeSpecWithTypeRestrictionOnR = constant_handles.reader_make_constant_shell( makeString( "SitTypeSpecWithTypeRestrictionOnRolePlayerFn" ) );
    $const27$SubcollectionOfWithRelationToType = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToTypeFn" ) );
    $const28$SubcollectionOfWithRelationFromTy = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromTypeFn" ) );
    $const29$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) );
    $const30$CompositeActivityFn = constant_handles.reader_make_constant_shell( makeString( "CompositeActivityFn" ) );
    $const31$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) );
    $const32$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) );
    $const33$compositeActivities = constant_handles.reader_make_constant_shell( makeString( "compositeActivities" ) );
    $const34$plausibleCollectionIntersections = constant_handles.reader_make_constant_shell( makeString( "plausibleCollectionIntersections" ) );
    $const35$VeryHighAmountFn = constant_handles.reader_make_constant_shell( makeString( "VeryHighAmountFn" ) );
    $float36$0_95 = makeDouble( 0.95 );
    $const37$HighToVeryHighAmountFn = constant_handles.reader_make_constant_shell( makeString( "HighToVeryHighAmountFn" ) );
    $float38$0_85 = makeDouble( 0.85 );
    $const39$HighAmountFn = constant_handles.reader_make_constant_shell( makeString( "HighAmountFn" ) );
    $float40$0_75 = makeDouble( 0.75 );
    $const41$MediumToVeryHighAmountFn = constant_handles.reader_make_constant_shell( makeString( "MediumToVeryHighAmountFn" ) );
    $float42$0_65 = makeDouble( 0.65 );
    $const43$MediumToHighAmountFn = constant_handles.reader_make_constant_shell( makeString( "MediumToHighAmountFn" ) );
    $float44$0_55 = makeDouble( 0.55 );
    $const45$MediumAmountFn = constant_handles.reader_make_constant_shell( makeString( "MediumAmountFn" ) );
    $const46$LowToMediumAmountFn = constant_handles.reader_make_constant_shell( makeString( "LowToMediumAmountFn" ) );
    $float47$0_45 = makeDouble( 0.45 );
    $const48$LowAmountFn = constant_handles.reader_make_constant_shell( makeString( "LowAmountFn" ) );
    $float49$0_35 = makeDouble( 0.35 );
    $const50$VeryLowToLowAmountFn = constant_handles.reader_make_constant_shell( makeString( "VeryLowToLowAmountFn" ) );
    $float51$0_25 = makeDouble( 0.25 );
    $const52$VeryLowAmountFn = constant_handles.reader_make_constant_shell( makeString( "VeryLowAmountFn" ) );
    $float53$0_15 = makeDouble( 0.15 );
    $const54$NoAmountFn = constant_handles.reader_make_constant_shell( makeString( "NoAmountFn" ) );
    $sym55$_ = makeSymbol( "*" );
    $sym56$MIN = makeSymbol( "MIN" );
    $sym57$DO_TVA_QUERY_TYPE_TYPE = makeSymbol( "DO-TVA-QUERY-TYPE-TYPE" );
    $const58$likelihoodOfArguments_TypeType = constant_handles.reader_make_constant_shell( makeString( "likelihoodOfArguments-TypeType" ) );
    $sym59$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_ = makeSymbol( "*DO-TVA-QUERY-TYPE-TYPE-CACHING-STATE*" );
    $int60$4096 = makeInteger( 4096 );
    $sym61$CLEAR_DO_TVA_QUERY_TYPE_TYPE = makeSymbol( "CLEAR-DO-TVA-QUERY-TYPE-TYPE" );
    $sym62$DO_TVA_QUERY_TYPE_DISJOINT_WITH = makeSymbol( "DO-TVA-QUERY-TYPE-DISJOINT-WITH" );
    $const63$likelihoodOfArgumentsWhenArg2NotI = constant_handles.reader_make_constant_shell( makeString( "likelihoodOfArgumentsWhenArg2NotInCollection" ) );
    $kw64$NONE = makeKeyword( "NONE" );
    $list65 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "JUSTIFICATION" ) );
    $sym66$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_ = makeSymbol( "*DO-TVA-QUERY-TYPE-DISJOINT-WITH-CACHING-STATE*" );
    $sym67$CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH = makeSymbol( "CLEAR-DO-TVA-QUERY-TYPE-DISJOINT-WITH" );
    $str68$____a__a_ = makeString( "~% ~a ~a " );
    $str69$____a_ = makeString( "~% ~a " );
    $str70$___Detected_Feature___a__a_ = makeString( "~% Detected Feature: ~a ~a " );
    $str71$_________ = makeString( "~& ------" );
    $float72$19403_06 = makeDouble( 19403.06 );
    $const73$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $const74$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $const75$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const76$nearestCommonGenls = constant_handles.reader_make_constant_shell( makeString( "nearestCommonGenls" ) );
    $list77 = ConsesLow.list( makeSymbol( "?X" ) );
    $list78 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ), constant_handles
        .reader_make_constant_shell( makeString( "AnytimePSC" ) ) );
    $kw79$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $kw80$MINIMAL = makeKeyword( "MINIMAL" );
    $kw81$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw82$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $kw83$COMPUTE_INTERSECTION = makeKeyword( "COMPUTE-INTERSECTION" );
    $kw84$TRANSFORMATION_ALLOWED_ = makeKeyword( "TRANSFORMATION-ALLOWED?" );
    $kw85$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw86$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw87$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $kw88$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw89$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $float90$1_0 = makeDouble( 1.0 );
    $kw91$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $kw92$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw93$HL = makeKeyword( "HL" );
    $kw94$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw95$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $int96$20000000 = makeInteger( 20000000 );
    $const97$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $sym98$_ABC = makeSymbol( "?ABC" );
    $const99$SetExtentFn = constant_handles.reader_make_constant_shell( makeString( "SetExtentFn" ) );
    $const100$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $int101$1000 = makeInteger( 1000 );
    $str102$ = makeString( "" );
    $sym103$STRING_ = makeSymbol( "STRING=" );
    $int104$_5 = makeInteger( -5 );
    $str105$____a__a__a__a = makeString( "~% ~a ~a ~a ~a" );
    $float106$0_8 = makeDouble( 0.8 );
    $const107$IntelligentAgent = constant_handles.reader_make_constant_shell( makeString( "IntelligentAgent" ) );
    $const108$owl_Class = constant_handles.reader_make_constant_shell( makeString( "owl:Class" ) );
    $const109$definiteDescriptions = constant_handles.reader_make_constant_shell( makeString( "definiteDescriptions" ) );
    $const110$BiologySCGTemplateAdmittedThing = constant_handles.reader_make_constant_shell( makeString( "BiologySCGTemplateAdmittedThing" ) );
    $sym111$_ = makeSymbol( "<" );
    $sym112$FORMULA_ARG1 = makeSymbol( "FORMULA-ARG1" );
    $list113 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TermFromOntologyFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheAURABiologyOntology" ) ) );
    $const114$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const115$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $str116$_ = makeString( " " );
    $str117$_does_ = makeString( " does " );
    $str118$_with_ = makeString( " with " );
    $str119$_where_ = makeString( " where " );
    $str120$_and_ = makeString( " and " );
    $str121$_do_ = makeString( " do " );
    $str122$_ = makeString( "?" );
    $str123$_why_ = makeString( " why " );
    $str124$_how_ = makeString( " how " );
    $str125$_what_ = makeString( " what " );
    $str126$_to_ = makeString( " to " );
    $str127$_of_ = makeString( " of " );
    $str128$_is_ = makeString( " is " );
    $str129$_the_ = makeString( " the " );
    $str130$_a_ = makeString( " a " );
    $str131$_an_ = makeString( " an " );
  }
}
/*
 * 
 * Total time: 586 ms
 * 
 */