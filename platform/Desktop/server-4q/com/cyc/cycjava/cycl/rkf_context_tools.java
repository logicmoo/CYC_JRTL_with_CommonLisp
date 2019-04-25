package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_context_tools
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_context_tools";
  public static final String myFingerPrint = "e0dd98aad1940dbdd963b84c00768e3974a24a8146133fe1b3d07a0f8a167346";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 991L)
  private static SubLSymbol $rkf_interaction_context_stem$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 1162L)
  private static SubLSymbol $rkf_scenario_interaction_context_stem$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 1252L)
  private static SubLSymbol $rkf_parsing_interaction_context_stem$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 1340L)
  private static SubLSymbol $rkf_generation_interaction_context_stem$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 1434L)
  private static SubLSymbol $rkf_lexical_interaction_context_stem$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 9877L)
  private static SubLSymbol $rkf_topic_mt_indicator_predicates$;
  private static final SubLSymbol $sym0$FORT_P;
  private static final SubLString $str1$InteractionContext;
  private static final SubLString $str2$ScenarioInteractionContext;
  private static final SubLString $str3$ParsingInteractionContext;
  private static final SubLString $str4$GenerationInteractionContext;
  private static final SubLString $str5$LexicalInteractionContext;
  private static final SubLObject $const6$ScenarioDescriptionMt;
  private static final SubLObject $const7$Language_SpecificMicrotheory;
  private static final SubLObject $const8$TemporaryLexicalMicrotheory;
  private static final SubLList $list9;
  private static final SubLObject $const10$isa;
  private static final SubLList $list11;
  private static final SubLObject $const12$genlMt;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$MT;
  private static final SubLObject $const15$lexicalRootMtForLanguage;
  private static final SubLObject $const16$InferencePSC;
  private static final SubLObject $const17$templateParsingRootMtForLanguage;
  private static final SubLObject $const18$paraphraseRootMtForLanguage;
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$GENL;
  private static final SubLObject $const21$and;
  private static final SubLSymbol $sym22$_MT;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLObject $const25$mtRefinementDomainBasis;
  private static final SubLString $str26$TemporaryLexificationMt;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 804L)
  public static SubLObject rkf_set_context(final SubLObject microtheory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( microtheory ) : microtheory;
    control_vars.$rkf_mt$.setDynamicValue( microtheory, thread );
    return control_vars.$rkf_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 1522L)
  public static SubLObject rkf_create_interaction_context(final SubLObject genl_microtheory)
  {
    assert NIL != forts.fort_p( genl_microtheory ) : genl_microtheory;
    return rkf_create_interaction_context_int( ConsesLow.list( genl_microtheory ), $rkf_interaction_context_stem$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 1729L)
  public static SubLObject rkf_create_scenario_interaction_context(final SubLObject genl_microtheory)
  {
    assert NIL != forts.fort_p( genl_microtheory ) : genl_microtheory;
    return rkf_create_interaction_context_int( ConsesLow.list( genl_microtheory, $const6$ScenarioDescriptionMt ), $rkf_scenario_interaction_context_stem$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 1979L)
  public static SubLObject rkf_create_parsing_interaction_context(final SubLObject genl_microtheory, final SubLObject parsing_mt, final SubLObject lexical_mt)
  {
    assert NIL != forts.fort_p( genl_microtheory ) : genl_microtheory;
    return rkf_create_specialized_interaction_context_int( ConsesLow.list( genl_microtheory, parsing_mt, lexical_mt ), $rkf_parsing_interaction_context_stem$.getGlobalValue(), ConsesLow.list( ConsesLow.list(
        $const7$Language_SpecificMicrotheory, mt_vars.$mt_mt$.getGlobalValue() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 2330L)
  public static SubLObject rkf_create_generation_interaction_context(final SubLObject genl_microtheory, final SubLObject generation_mt, final SubLObject lexical_mt)
  {
    assert NIL != forts.fort_p( genl_microtheory ) : genl_microtheory;
    return rkf_create_specialized_interaction_context_int( ConsesLow.list( genl_microtheory, generation_mt, lexical_mt ), $rkf_generation_interaction_context_stem$.getGlobalValue(), ConsesLow.list( ConsesLow.list(
        $const7$Language_SpecificMicrotheory, mt_vars.$mt_mt$.getGlobalValue() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 2692L)
  public static SubLObject rkf_create_lexical_interaction_context(final SubLObject genl_microtheory, final SubLObject lexical_mt)
  {
    assert NIL != forts.fort_p( genl_microtheory ) : genl_microtheory;
    return rkf_create_specialized_interaction_context_int( ConsesLow.list( genl_microtheory, lexical_mt ), $rkf_lexical_interaction_context_stem$.getGlobalValue(), ConsesLow.list( ConsesLow.list(
        $const7$Language_SpecificMicrotheory, mt_vars.$mt_mt$.getGlobalValue() ), ConsesLow.list( $const8$TemporaryLexicalMicrotheory, mt_vars.$mt_mt$.getGlobalValue() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 3086L)
  public static SubLObject rkf_potentially_is_domain_interaction_contextP(final SubLObject fort)
  {
    return makeBoolean( NIL != rkf_potentially_is_an_interaction_contextP( fort ) && NIL == rkf_potentially_is_scenario_interaction_contextP( fort ) && NIL == rkf_potentially_is_parsing_interaction_contextP( fort )
        && NIL == rkf_potentially_is_generation_interaction_contextP( fort ) && NIL == rkf_potentially_is_lexical_interaction_contextP( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 3953L)
  public static SubLObject rkf_potentially_is_an_interaction_contextP(final SubLObject fort)
  {
    return rkf_potentially_is_any_interaction_contextP( fort, $rkf_interaction_context_stem$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 4120L)
  public static SubLObject rkf_potentially_is_scenario_interaction_contextP(final SubLObject fort)
  {
    return rkf_potentially_is_any_interaction_contextP( fort, $rkf_scenario_interaction_context_stem$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 4301L)
  public static SubLObject rkf_potentially_is_parsing_interaction_contextP(final SubLObject fort)
  {
    return rkf_potentially_is_any_interaction_contextP( fort, $rkf_parsing_interaction_context_stem$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 4480L)
  public static SubLObject rkf_potentially_is_generation_interaction_contextP(final SubLObject fort)
  {
    return rkf_potentially_is_any_interaction_contextP( fort, $rkf_generation_interaction_context_stem$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 4665L)
  public static SubLObject rkf_potentially_is_lexical_interaction_contextP(final SubLObject fort)
  {
    return rkf_potentially_is_any_interaction_contextP( fort, $rkf_lexical_interaction_context_stem$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 4844L)
  public static SubLObject rkf_potentially_is_any_interaction_contextP(final SubLObject fort, final SubLObject stem)
  {
    final SubLObject name = kb_paths.fort_name( fort );
    return list_utilities.sublisp_boolean( Sequences.search( stem, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 5057L)
  public static SubLObject rkf_create_specialized_interaction_context_int(final SubLObject v_genl_mts, final SubLObject name, final SubLObject aspects)
  {
    final SubLObject v_context = rkf_create_interaction_context_int( v_genl_mts, name );
    SubLObject cdolist_list_var = aspects;
    SubLObject aspect = NIL;
    aspect = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = aspect;
      SubLObject collection = NIL;
      SubLObject mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      collection = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      mt = current.first();
      current = current.rest();
      if( NIL == current )
      {
        rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const10$isa, v_context, collection ), mt, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      aspect = cdolist_list_var.first();
    }
    return v_context;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 5520L)
  public static SubLObject rkf_create_interaction_context_int(final SubLObject v_genl_mts, final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_context = NIL;
    final SubLObject genl_mt_1 = v_genl_mts.first();
    final SubLObject _prev_bind_0 = control_vars.$rkf_mt$.currentBinding( thread );
    try
    {
      control_vars.$rkf_mt$.bind( genl_mt_1, thread );
      v_context = rkf_term_utilities.rkf_create( name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      control_vars.$rkf_mt$.rebind( _prev_bind_0, thread );
    }
    rkf_assertion_utilities.rkf_assert( ConsesLow.listS( $const10$isa, v_context, $list11 ), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = v_genl_mts;
    SubLObject genl_mt = NIL;
    genl_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const12$genlMt, v_context, genl_mt ), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      genl_mt = cdolist_list_var.first();
    }
    return v_context;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 6127L)
  public static SubLObject rkf_instantiate_interaction_context(final SubLObject genl_microtheory, final SubLObject external_id)
  {
    assert NIL != forts.fort_p( genl_microtheory ) : genl_microtheory;
    return rkf_instantiate_interaction_context_int( ConsesLow.list( genl_microtheory ), $rkf_interaction_context_stem$.getGlobalValue(), external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 6468L)
  public static SubLObject rkf_instantiate_scenario_interaction_context(final SubLObject genl_microtheory, final SubLObject external_id)
  {
    assert NIL != forts.fort_p( genl_microtheory ) : genl_microtheory;
    return rkf_instantiate_interaction_context_int( ConsesLow.list( genl_microtheory, $const6$ScenarioDescriptionMt ), $rkf_scenario_interaction_context_stem$.getGlobalValue(), external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 6761L)
  public static SubLObject rkf_instantiate_parsing_interaction_context(final SubLObject genl_microtheory, final SubLObject parsing_mt, final SubLObject lexical_interaction_mt, final SubLObject external_id)
  {
    assert NIL != forts.fort_p( genl_microtheory ) : genl_microtheory;
    return rkf_instantiate_interaction_context_int( ConsesLow.list( genl_microtheory, parsing_mt, lexical_interaction_mt ), $rkf_parsing_interaction_context_stem$.getGlobalValue(), external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 7102L)
  public static SubLObject rkf_instantiate_generation_interaction_context(final SubLObject genl_microtheory, final SubLObject generation_mt, final SubLObject lexical_interaction_mt, final SubLObject external_id)
  {
    assert NIL != forts.fort_p( genl_microtheory ) : genl_microtheory;
    return rkf_instantiate_interaction_context_int( ConsesLow.list( genl_microtheory, generation_mt, lexical_interaction_mt ), $rkf_generation_interaction_context_stem$.getGlobalValue(), external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 7455L)
  public static SubLObject rkf_instantiate_lexical_interaction_context(final SubLObject genl_microtheory, final SubLObject lexical_mt, final SubLObject external_id)
  {
    assert NIL != forts.fort_p( genl_microtheory ) : genl_microtheory;
    return rkf_instantiate_interaction_context_int( ConsesLow.list( genl_microtheory, lexical_mt ), $rkf_lexical_interaction_context_stem$.getGlobalValue(), external_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 7750L)
  public static SubLObject rkf_instantiate_interaction_context_int(final SubLObject v_genl_mts, final SubLObject name, final SubLObject external_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_context = NIL;
    final SubLObject genl_mt_1 = v_genl_mts.first();
    final SubLObject _prev_bind_0 = control_vars.$rkf_mt$.currentBinding( thread );
    try
    {
      control_vars.$rkf_mt$.bind( genl_mt_1, thread );
      v_context = rkf_term_utilities.rkf_re_create( name, external_id, UNPROVIDED );
    }
    finally
    {
      control_vars.$rkf_mt$.rebind( _prev_bind_0, thread );
    }
    rkf_assertion_utilities.rkf_assert( ConsesLow.listS( $const10$isa, v_context, $list13 ), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = v_genl_mts;
    SubLObject genl_mt = NIL;
    genl_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const12$genlMt, v_context, genl_mt ), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      genl_mt = cdolist_list_var.first();
    }
    return v_context;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 8259L)
  public static SubLObject rkf_determine_language_lexical_mt(final SubLObject language)
  {
    final SubLObject mt_list = backward.removal_ask_variable( $kw14$MT, ConsesLow.list( $const15$lexicalRootMtForLanguage, $kw14$MT, language ), $const16$InferencePSC, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.singletonP( mt_list ) )
    {
      return mt_list.first();
    }
    if( mt_list.isCons() )
    {
      return mt_list.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 8939L)
  public static SubLObject rkf_determine_language_parsing_mt(final SubLObject language)
  {
    final SubLObject mt_list = backward.removal_ask_variable( $kw14$MT, ConsesLow.list( $const17$templateParsingRootMtForLanguage, $kw14$MT, language ), $const16$InferencePSC, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.singletonP( mt_list ) )
    {
      return mt_list.first();
    }
    if( mt_list.isCons() )
    {
      return mt_list.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 9407L)
  public static SubLObject rkf_determine_language_generation_mt(final SubLObject language)
  {
    final SubLObject mt_list = backward.removal_ask_variable( $kw14$MT, ConsesLow.list( $const18$paraphraseRootMtForLanguage, $kw14$MT, language ), $const16$InferencePSC, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.singletonP( mt_list ) )
    {
      return mt_list.first();
    }
    if( mt_list.isCons() )
    {
      return mt_list.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 10046L)
  public static SubLObject rkf_determine_domain_mt(final SubLObject topic)
  {
    SubLObject mt = NIL;
    if( NIL == mt )
    {
      SubLObject csome_list_var = $rkf_topic_mt_indicator_predicates$.getGlobalValue();
      SubLObject predicate = NIL;
      predicate = csome_list_var.first();
      while ( NIL == mt && NIL != csome_list_var)
      {
        final SubLObject mt_list = backward.removal_ask_variable( $kw14$MT, ConsesLow.list( predicate, $kw14$MT, topic ), $const16$InferencePSC, UNPROVIDED, UNPROVIDED );
        if( NIL != list_utilities.singletonP( mt_list ) )
        {
          mt = mt_list.first();
        }
        else if( mt_list.isCons() )
        {
          mt = mt_list.first();
        }
        csome_list_var = csome_list_var.rest();
        predicate = csome_list_var.first();
      }
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 10548L)
  public static SubLObject rkf_determine_language_domain_refinement_mt(final SubLObject language_mt, final SubLObject domain_mt)
  {
    final SubLObject mt_list = ask_utilities.ask_variable( $kw20$GENL, ConsesLow.listS( $const21$and, ConsesLow.list( $const12$genlMt, $sym22$_MT, language_mt ), ConsesLow.listS( $const12$genlMt, domain_mt, $list23 ),
        $list24 ), $const16$InferencePSC, ZERO_INTEGER, NIL, NIL, NIL );
    if( NIL == mt_list )
    {
      return language_mt;
    }
    final SubLObject min_mts = genl_mts.min_mts( mt_list, UNPROVIDED );
    SubLObject min_mt = NIL;
    if( NIL != list_utilities.singletonP( min_mts ) )
    {
      min_mt = min_mts.first();
    }
    else
    {
      min_mt = min_mts.first();
    }
    final SubLObject refinement_mts = ask_utilities.ask_variable( $kw14$MT, ConsesLow.list( $const21$and, ConsesLow.list( $const12$genlMt, $kw14$MT, language_mt ), ConsesLow.list( $const12$genlMt, domain_mt, min_mt ),
        ConsesLow.list( $const25$mtRefinementDomainBasis, $kw14$MT, min_mt ) ), $const16$InferencePSC, ZERO_INTEGER, NIL, NIL, NIL );
    if( NIL == refinement_mts )
    {
      return language_mt;
    }
    final SubLObject min_refinement_mts = genl_mts.min_mts( refinement_mts, UNPROVIDED );
    if( NIL != list_utilities.singletonP( min_refinement_mts ) )
    {
      return min_refinement_mts.first();
    }
    return min_refinement_mts.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 11862L)
  public static SubLObject rkf_determine_lexification_mt(final SubLObject language_mt, final SubLObject domain_interaction_mt)
  {
    final SubLObject existing_mt = rkf_check_lexification_mt( language_mt, domain_interaction_mt );
    if( NIL != existing_mt )
    {
      return existing_mt;
    }
    return rkf_create_interaction_context_int( ConsesLow.list( language_mt, domain_interaction_mt ), $str26$TemporaryLexificationMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-context-tools.lisp", position = 12820L)
  public static SubLObject rkf_check_lexification_mt(final SubLObject language_mt, final SubLObject domain_interaction_mt)
  {
    final SubLObject mt_list = ask_utilities.ask_variable( $kw14$MT, ConsesLow.list( $const21$and, ConsesLow.list( $const12$genlMt, $kw14$MT, language_mt ), ConsesLow.list( $const12$genlMt, $kw14$MT,
        domain_interaction_mt ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return genl_mts.min_mts( mt_list, UNPROVIDED ).first();
  }

  public static SubLObject declare_rkf_context_tools_file()
  {
    SubLFiles.declareFunction( me, "rkf_set_context", "RKF-SET-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_create_interaction_context", "RKF-CREATE-INTERACTION-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_create_scenario_interaction_context", "RKF-CREATE-SCENARIO-INTERACTION-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_create_parsing_interaction_context", "RKF-CREATE-PARSING-INTERACTION-CONTEXT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_create_generation_interaction_context", "RKF-CREATE-GENERATION-INTERACTION-CONTEXT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_create_lexical_interaction_context", "RKF-CREATE-LEXICAL-INTERACTION-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_potentially_is_domain_interaction_contextP", "RKF-POTENTIALLY-IS-DOMAIN-INTERACTION-CONTEXT?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_potentially_is_an_interaction_contextP", "RKF-POTENTIALLY-IS-AN-INTERACTION-CONTEXT?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_potentially_is_scenario_interaction_contextP", "RKF-POTENTIALLY-IS-SCENARIO-INTERACTION-CONTEXT?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_potentially_is_parsing_interaction_contextP", "RKF-POTENTIALLY-IS-PARSING-INTERACTION-CONTEXT?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_potentially_is_generation_interaction_contextP", "RKF-POTENTIALLY-IS-GENERATION-INTERACTION-CONTEXT?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_potentially_is_lexical_interaction_contextP", "RKF-POTENTIALLY-IS-LEXICAL-INTERACTION-CONTEXT?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_potentially_is_any_interaction_contextP", "RKF-POTENTIALLY-IS-ANY-INTERACTION-CONTEXT?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_create_specialized_interaction_context_int", "RKF-CREATE-SPECIALIZED-INTERACTION-CONTEXT-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_create_interaction_context_int", "RKF-CREATE-INTERACTION-CONTEXT-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_instantiate_interaction_context", "RKF-INSTANTIATE-INTERACTION-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_instantiate_scenario_interaction_context", "RKF-INSTANTIATE-SCENARIO-INTERACTION-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_instantiate_parsing_interaction_context", "RKF-INSTANTIATE-PARSING-INTERACTION-CONTEXT", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_instantiate_generation_interaction_context", "RKF-INSTANTIATE-GENERATION-INTERACTION-CONTEXT", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_instantiate_lexical_interaction_context", "RKF-INSTANTIATE-LEXICAL-INTERACTION-CONTEXT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_instantiate_interaction_context_int", "RKF-INSTANTIATE-INTERACTION-CONTEXT-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_determine_language_lexical_mt", "RKF-DETERMINE-LANGUAGE-LEXICAL-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_determine_language_parsing_mt", "RKF-DETERMINE-LANGUAGE-PARSING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_determine_language_generation_mt", "RKF-DETERMINE-LANGUAGE-GENERATION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_determine_domain_mt", "RKF-DETERMINE-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_determine_language_domain_refinement_mt", "RKF-DETERMINE-LANGUAGE-DOMAIN-REFINEMENT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_determine_lexification_mt", "RKF-DETERMINE-LEXIFICATION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_check_lexification_mt", "RKF-CHECK-LEXIFICATION-MT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_context_tools_file()
  {
    $rkf_interaction_context_stem$ = SubLFiles.deflexical( "*RKF-INTERACTION-CONTEXT-STEM*", $str1$InteractionContext );
    $rkf_scenario_interaction_context_stem$ = SubLFiles.deflexical( "*RKF-SCENARIO-INTERACTION-CONTEXT-STEM*", $str2$ScenarioInteractionContext );
    $rkf_parsing_interaction_context_stem$ = SubLFiles.deflexical( "*RKF-PARSING-INTERACTION-CONTEXT-STEM*", $str3$ParsingInteractionContext );
    $rkf_generation_interaction_context_stem$ = SubLFiles.deflexical( "*RKF-GENERATION-INTERACTION-CONTEXT-STEM*", $str4$GenerationInteractionContext );
    $rkf_lexical_interaction_context_stem$ = SubLFiles.deflexical( "*RKF-LEXICAL-INTERACTION-CONTEXT-STEM*", $str5$LexicalInteractionContext );
    $rkf_topic_mt_indicator_predicates$ = SubLFiles.deflexical( "*RKF-TOPIC-MT-INDICATOR-PREDICATES*", $list19 );
    return NIL;
  }

  public static SubLObject setup_rkf_context_tools_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_context_tools_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_context_tools_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_context_tools_file();
  }
  static
  {
    me = new rkf_context_tools();
    $rkf_interaction_context_stem$ = null;
    $rkf_scenario_interaction_context_stem$ = null;
    $rkf_parsing_interaction_context_stem$ = null;
    $rkf_generation_interaction_context_stem$ = null;
    $rkf_lexical_interaction_context_stem$ = null;
    $rkf_topic_mt_indicator_predicates$ = null;
    $sym0$FORT_P = makeSymbol( "FORT-P" );
    $str1$InteractionContext = makeString( "InteractionContext" );
    $str2$ScenarioInteractionContext = makeString( "ScenarioInteractionContext" );
    $str3$ParsingInteractionContext = makeString( "ParsingInteractionContext" );
    $str4$GenerationInteractionContext = makeString( "GenerationInteractionContext" );
    $str5$LexicalInteractionContext = makeString( "LexicalInteractionContext" );
    $const6$ScenarioDescriptionMt = constant_handles.reader_make_constant_shell( makeString( "ScenarioDescriptionMt" ) );
    $const7$Language_SpecificMicrotheory = constant_handles.reader_make_constant_shell( makeString( "Language-SpecificMicrotheory" ) );
    $const8$TemporaryLexicalMicrotheory = constant_handles.reader_make_constant_shell( makeString( "TemporaryLexicalMicrotheory" ) );
    $list9 = ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "MT" ) );
    $const10$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RKFInteractionContextMicrotheory" ) ) );
    $const12$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $list13 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ) );
    $kw14$MT = makeKeyword( "MT" );
    $const15$lexicalRootMtForLanguage = constant_handles.reader_make_constant_shell( makeString( "lexicalRootMtForLanguage" ) );
    $const16$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $const17$templateParsingRootMtForLanguage = constant_handles.reader_make_constant_shell( makeString( "templateParsingRootMtForLanguage" ) );
    $const18$paraphraseRootMtForLanguage = constant_handles.reader_make_constant_shell( makeString( "paraphraseRootMtForLanguage" ) );
    $list19 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "uiaDemoEnvironmentTopic" ) ), constant_handles.reader_make_constant_shell( makeString( "mtTopic" ) ) );
    $kw20$GENL = makeKeyword( "GENL" );
    $const21$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $sym22$_MT = makeSymbol( "?MT" );
    $list23 = ConsesLow.list( makeKeyword( "GENL" ) );
    $list24 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mtRefinementDomainBasis" ) ), makeSymbol( "?MT" ), makeKeyword( "GENL" ) ) );
    $const25$mtRefinementDomainBasis = constant_handles.reader_make_constant_shell( makeString( "mtRefinementDomainBasis" ) );
    $str26$TemporaryLexificationMt = makeString( "TemporaryLexificationMt" );
  }
}
/*
 * 
 * Total time: 77 ms
 * 
 */