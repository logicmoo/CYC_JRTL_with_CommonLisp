package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mt_relevance_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.mt_relevance_macros";
  public static final String myFingerPrint = "94aed547e114a738d6c16f7423e3ef87df9d555b0fb83b8edd7cb05b182ecc7d";
  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 812L)
  public static SubLSymbol $relevant_mt_function$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1423L)
  public static SubLSymbol $mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1749L)
  public static SubLSymbol $relevant_mts$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$_RELEVANT_MT_FUNCTION_;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$_MT_;
  private static final SubLSymbol $sym6$IN_MT_LIST;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$_RELEVANT_MTS_;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$HLMT_EQUAL;
  private static final SubLSymbol $sym12$SPECIAL_CORE_LOOP_MT_P;
  private static final SubLSymbol $sym13$CORE_MICROTHEORY_P;
  private static final SubLObject $const14$TimePoint;
  private static final SubLSymbol $sym15$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym16$RELEVANT_MT_IS_ANY_MT;
  private static final SubLSymbol $sym17$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLSymbol $sym18$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $sym19$RELEVANT_MT_IS_IN_LIST;
  private static final SubLSymbol $sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
  private static final SubLSymbol $sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME;
  private static final SubLSymbol $kw22$ALL;
  private static final SubLSymbol $kw23$UNABLE_TO_DETERMINE;
  private static final SubLSymbol $sym24$RELEVANT_MT_IS_SPEC_MT;
  private static final SubLSymbol $sym25$WITH_MT_FUNCTION;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$IN_MT;
  private static final SubLSymbol $sym28$WITH_GENL_MTS;
  private static final SubLString $str29$MT_and_all_its_genl_mts_are_relev;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$CANONICALIZE_HLMT;
  private static final SubLSymbol $sym32$WITH_MT;
  private static final SubLList $list33;
  private static final SubLObject $const34$EverythingPSC;
  private static final SubLSymbol $sym35$WITH_ALL_MTS;
  private static final SubLList $list36;
  private static final SubLString $str37$All_mts_are_relevant_within_BODY_;
  private static final SubLList $list38;
  private static final SubLObject $const39$InferencePSC;
  private static final SubLSymbol $sym40$WITH_ANY_MT;
  private static final SubLString $str41$Any_mt_can_be_used_for_relevance_;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$WITH_JUST_MT;
  private static final SubLString $str44$Only_MT_is_relevant_within_BODY__;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$WITH_MT_LIST;
  private static final SubLString $str47$Each_mt_in_the_list_MT_LIST_is_re;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$WITH_MT_LIST_AND_GENL_MTS;
  private static final SubLSymbol $sym51$MT_UNION_MTS;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$PROGN;
  private static final SubLSymbol $sym55$MT_VAR;
  private static final SubLSymbol $sym56$POSSIBLY_IN_MT_DETERMINE_FUNCTION;
  private static final SubLSymbol $sym57$POSSIBLY_IN_MT_DETERMINE_MT;
  private static final SubLSymbol $sym58$POSSIBLY_IN_MT;
  private static final SubLSymbol $sym59$MT_VAR;
  private static final SubLSymbol $sym60$POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION;
  private static final SubLSymbol $sym61$POSSIBLY_WITH_JUST_MT_DETERMINE_MT;
  private static final SubLSymbol $sym62$POSSIBLY_WITH_JUST_MT;
  private static final SubLSymbol $sym63$HLMT_P;
  private static final SubLSymbol $sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL;
  private static final SubLSymbol $sym65$WITH_INFERENCE_MT_RELEVANCE_VALIDATE;
  private static final SubLSymbol $sym66$WITH_INFERENCE_MT_RELEVANCE;
  private static final SubLString $str67$BODY_evaluated_with_the_same_rele;
  private static final SubLSymbol $sym68$DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC;
  private static final SubLString $str69$No_microtheory_was_specified_;
  private static final SubLSymbol $sym70$WITH_INFERENCE_MT_RELEVANCE_EL;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$MT_VAR;
  private static final SubLSymbol $sym73$UPDATE_INFERENCE_MT_RELEVANCE_MT;
  private static final SubLSymbol $sym74$UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION;
  private static final SubLSymbol $sym75$UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST;
  private static final SubLSymbol $sym76$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE;
  private static final SubLSymbol $sym77$POSSIBLY_HLMT_P;
  private static final SubLSymbol $sym78$DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$WITH_INFERENCE_ANY_MT_RELEVANCE_;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$PSC_INFERENCE;
  private static final SubLSymbol $sym83$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_;
  private static final SubLSymbol $sym84$ALL_MTS_INFERENCE;
  private static final SubLSymbol $sym85$WITH_MT_UNION_RELEVANCE_;
  private static final SubLSymbol $sym86$MT_UNION_INFERENCE;
  private static final SubLSymbol $sym87$WITH_INFERENCE_ANYTIME_RELEVANCE_;
  private static final SubLSymbol $sym88$ANYTIME_PSC_INFERENCE;
  private static final SubLObject $const89$MtUnionFn;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$PCOND;
  private static final SubLSymbol $sym92$MT_FUNCTION_EQ;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$MT_UNION_NAUT_P;
  private static final SubLSymbol $sym96$WITH_GENL_MTS_OF_UNION;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$DO_ALL_FORT_INSTANCES;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$MAP_MTS;
  private static final SubLString $str101$Iterate_over_all_microtheories__b;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 865L)
  public static SubLObject with_mt_function(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    function = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym3$_RELEVANT_MT_FUNCTION_, function ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1059L)
  public static SubLObject mt_function_eq(final SubLObject mt_function, final SubLObject symbol)
  {
    return Equality.eq( mt_function, symbol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1230L)
  public static SubLObject relevant_mt_function_eq(final SubLObject symbol)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return mt_function_eq( $relevant_mt_function$.getDynamicValue( thread ), symbol );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1623L)
  public static SubLObject in_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym5$_MT_, mt ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1795L)
  public static SubLObject in_mt_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    mt_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym9$_RELEVANT_MTS_, mt_list ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2062L)
  public static SubLObject current_mt_relevance_mt_context()
  {
    return mt_vars.$mt_mt$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2239L)
  public static SubLObject current_mt_relevance_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2325L)
  public static SubLObject current_mt_relevance_mt_list()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $relevant_mts$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2400L)
  public static SubLObject current_mt_relevance_test()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $relevant_mt_function$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2789L)
  public static SubLObject relevant_mt_is_everything(final SubLObject mt)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2862L)
  public static SubLObject relevant_mt_is_any_mt(final SubLObject mt)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 3154L)
  public static SubLObject relevant_mt_is_eq(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return hlmt.hlmt_equal( $mt$.getDynamicValue( thread ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 3532L)
  public static SubLObject relevant_mt_is_in_list(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( mt, $relevant_mts$.getDynamicValue( thread ), $sym11$HLMT_EQUAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 3626L)
  public static SubLObject relevant_mt_is_genl_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != hlmt.hlmt_equal( mt, $mt$.getDynamicValue( thread ) ) )
    {
      return T;
    }
    final SubLObject spec_coreP = mt_vars.core_microtheory_p( $mt$.getDynamicValue( thread ) );
    final SubLObject genl_coreP = mt_vars.core_microtheory_p( mt );
    if( NIL != spec_coreP && NIL != genl_coreP )
    {
      return mt_vars.core_genl_mtP( mt, $mt$.getDynamicValue( thread ) );
    }
    if( NIL != genl_coreP )
    {
      return T;
    }
    if( NIL != spec_coreP )
    {
      return NIL;
    }
    return mt_relevance_cache.basemtP( $mt$.getDynamicValue( thread ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 4276L)
  public static SubLObject relevant_mt_is_spec_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != hlmt.hlmt_equal( mt, $mt$.getDynamicValue( thread ) ) )
    {
      return T;
    }
    final SubLObject spec_coreP = mt_vars.core_microtheory_p( $mt$.getDynamicValue( thread ) );
    final SubLObject genl_coreP = mt_vars.core_microtheory_p( mt );
    if( NIL != spec_coreP && NIL != genl_coreP )
    {
      if( NIL != mt_vars.special_core_loop_mt_p( mt ) && NIL != mt_vars.special_core_loop_mt_p( $mt$.getDynamicValue( thread ) ) )
      {
        return T;
      }
      return mt_vars.core_microtheory_L( mt, $mt$.getDynamicValue( thread ) );
    }
    else
    {
      if( NIL != spec_coreP )
      {
        return T;
      }
      if( NIL != genl_coreP )
      {
        return NIL;
      }
      return mt_relevance_cache.basemtP( mt, $mt$.getDynamicValue( thread ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 5077L)
  public static SubLObject relevant_mt_is_genl_mt_of_list_member(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_vars.special_core_loop_mt_p( mt ) && NIL != Sequences.find_if( $sym12$SPECIAL_CORE_LOOP_MT_P, $relevant_mts$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != mt_vars.core_microtheory_p( mt ) )
    {
      if( NIL != $relevant_mts$.getDynamicValue( thread ) && NIL != list_utilities.find_if_not( $sym13$CORE_MICROTHEORY_P, $relevant_mts$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      SubLObject cdolist_list_var = $relevant_mts$.getDynamicValue( thread );
      SubLObject relevant_mt = NIL;
      relevant_mt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != mt_vars.core_microtheory_L( relevant_mt, mt ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        relevant_mt = cdolist_list_var.first();
      }
    }
    SubLObject cdolist_list_var = $relevant_mts$.getDynamicValue( thread );
    SubLObject relevant_mt = NIL;
    relevant_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != mt_relevance_cache.basemtP( relevant_mt, mt ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      relevant_mt = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 5660L)
  public static SubLObject relevant_mt_is_genl_mt_with_any_time(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject monad_mt = hlmt.hlmt_monad_mt( mt );
    if( NIL == relevant_mt_is_genl_mt( monad_mt ) )
    {
      return NIL;
    }
    final SubLObject anytime = hlmt.hlmt_temporal_mt( $mt$.getDynamicValue( thread ) );
    if( NIL != hlmt.anytime_psc_p( anytime ) )
    {
      return T;
    }
    final SubLObject time_mt = hlmt.hlmt_temporal_mt( mt );
    if( NIL != time_mt )
    {
      final SubLObject base_time = hlmt.anytime_during_psc_fn_time_interval( anytime );
      final SubLObject base_mt = hlmt.new_time_dimension( base_time, $const14$TimePoint );
      return hlmt_relevance.temporal_mts_intersectP( time_mt, base_mt );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 6214L)
  public static SubLObject relevant_mtP(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject function = $relevant_mt_function$.getDynamicValue( thread );
    if( NIL == function )
    {
      return relevant_mt_is_genl_mt( mt );
    }
    final SubLObject pcase_var = function;
    if( pcase_var.eql( $sym15$RELEVANT_MT_IS_GENL_MT ) )
    {
      return relevant_mt_is_genl_mt( mt );
    }
    if( pcase_var.eql( $sym16$RELEVANT_MT_IS_ANY_MT ) )
    {
      return relevant_mt_is_any_mt( mt );
    }
    if( pcase_var.eql( $sym17$RELEVANT_MT_IS_EVERYTHING ) )
    {
      return relevant_mt_is_everything( mt );
    }
    if( pcase_var.eql( $sym18$RELEVANT_MT_IS_EQ ) )
    {
      return relevant_mt_is_eq( mt );
    }
    if( pcase_var.eql( $sym19$RELEVANT_MT_IS_IN_LIST ) )
    {
      return relevant_mt_is_in_list( mt );
    }
    if( pcase_var.eql( $sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER ) )
    {
      return relevant_mt_is_genl_mt_of_list_member( mt );
    }
    if( pcase_var.eql( $sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME ) )
    {
      return relevant_mt_is_genl_mt_with_any_time( mt );
    }
    return Functions.funcall( function, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 7352L)
  public static SubLObject all_possibly_relevant_mts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject function = $relevant_mt_function$.getDynamicValue( thread );
    final SubLObject mt = $mt$.getDynamicValue( thread );
    if( NIL == function )
    {
      if( NIL != mt )
      {
        return genl_mts.all_genl_mts( mt, UNPROVIDED, UNPROVIDED );
      }
      return $kw22$ALL;
    }
    else
    {
      final SubLObject pcase_var = function;
      if( pcase_var.eql( $sym15$RELEVANT_MT_IS_GENL_MT ) )
      {
        return genl_mts.all_genl_mts( mt, UNPROVIDED, UNPROVIDED );
      }
      if( pcase_var.eql( $sym16$RELEVANT_MT_IS_ANY_MT ) )
      {
        return $kw22$ALL;
      }
      if( pcase_var.eql( $sym17$RELEVANT_MT_IS_EVERYTHING ) )
      {
        return $kw22$ALL;
      }
      if( pcase_var.eql( $sym18$RELEVANT_MT_IS_EQ ) )
      {
        return ConsesLow.list( mt );
      }
      if( pcase_var.eql( $sym19$RELEVANT_MT_IS_IN_LIST ) )
      {
        return $relevant_mts$.getDynamicValue( thread );
      }
      if( pcase_var.eql( $sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER ) )
      {
        return $kw23$UNABLE_TO_DETERMINE;
      }
      if( pcase_var.eql( $sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME ) )
      {
        return $kw23$UNABLE_TO_DETERMINE;
      }
      return $kw23$UNABLE_TO_DETERMINE;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 8564L)
  public static SubLObject relevant_assertionP(final SubLObject assertion)
  {
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      return makeBoolean( NIL != any_or_all_mts_are_relevantP() || NIL != relevant_mtP( assertions_high.assertion_mt( assertion ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 8836L)
  public static SubLObject mt_relevance_unspecifiedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $relevant_mt_function$.getDynamicValue( thread ) )
    {
      return T;
    }
    return makeBoolean( NIL != relevant_mt_function_eq( $sym15$RELEVANT_MT_IS_GENL_MT ) && $mt$.getDynamicValue( thread ).eql( mt_vars.$assertible_theory_mt_root$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9048L)
  public static SubLObject genl_mts_are_relevantP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == $relevant_mt_function$.getDynamicValue( thread ) || NIL != relevant_mt_function_eq( $sym15$RELEVANT_MT_IS_GENL_MT ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9193L)
  public static SubLObject any_mt_is_relevantP()
  {
    return relevant_mt_function_eq( $sym16$RELEVANT_MT_IS_ANY_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9293L)
  public static SubLObject all_mts_are_relevantP()
  {
    return relevant_mt_function_eq( $sym17$RELEVANT_MT_IS_EVERYTHING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9399L)
  public static SubLObject any_or_all_mts_are_relevantP()
  {
    return makeBoolean( NIL != relevant_mt_function_eq( $sym17$RELEVANT_MT_IS_EVERYTHING ) || NIL != relevant_mt_function_eq( $sym16$RELEVANT_MT_IS_ANY_MT ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9572L)
  public static SubLObject listed_mts_are_relevantP()
  {
    return relevant_mt_function_eq( $sym19$RELEVANT_MT_IS_IN_LIST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9678L)
  public static SubLObject genl_mts_of_listed_mts_are_relevantP()
  {
    return relevant_mt_function_eq( $sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9811L)
  public static SubLObject any_time_is_relevantP()
  {
    return relevant_mt_function_eq( $sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9928L)
  public static SubLObject spec_mts_are_relevantP()
  {
    return relevant_mt_function_eq( $sym24$RELEVANT_MT_IS_SPEC_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10032L)
  public static SubLObject only_specified_mt_is_relevantP()
  {
    return relevant_mt_function_eq( $sym18$RELEVANT_MT_IS_EQ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10139L)
  public static SubLObject with_genl_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym25$WITH_MT_FUNCTION, $list26, ConsesLow.listS( $sym27$IN_MT, mt, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10410L)
  public static SubLObject with_genl_mts_el(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject elmt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    elmt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym28$WITH_GENL_MTS, ConsesLow.list( $sym31$CANONICALIZE_HLMT, elmt ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10644L)
  public static SubLObject with_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym28$WITH_GENL_MTS, mt, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10808L)
  public static SubLObject with_all_mts(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym25$WITH_MT_FUNCTION, $list33, ConsesLow.listS( $sym27$IN_MT, $const34$EverythingPSC, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10982L)
  public static SubLObject with_any_mt(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym25$WITH_MT_FUNCTION, $list38, ConsesLow.listS( $sym27$IN_MT, $const39$InferencePSC, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 11215L)
  public static SubLObject with_just_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym25$WITH_MT_FUNCTION, $list42, ConsesLow.listS( $sym27$IN_MT, mt, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 11386L)
  public static SubLObject with_mt_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    mt_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym25$WITH_MT_FUNCTION, $list45, ConsesLow.listS( $sym6$IN_MT_LIST, mt_list, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 11596L)
  public static SubLObject with_mt_list_and_genl_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    mt_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym25$WITH_MT_FUNCTION, $list48, ConsesLow.listS( $sym6$IN_MT_LIST, mt_list, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 11849L)
  public static SubLObject with_genl_mts_of_union(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt_union = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    mt_union = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym50$WITH_MT_LIST_AND_GENL_MTS, ConsesLow.list( $sym51$MT_UNION_MTS, mt_union ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 12072L)
  public static SubLObject with_any_time_relevance(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym25$WITH_MT_FUNCTION, $list52, ConsesLow.listS( $sym27$IN_MT, mt, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 12293L)
  public static SubLObject with_spec_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym25$WITH_MT_FUNCTION, $list53, ConsesLow.listS( $sym27$IN_MT, mt, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 12571L)
  public static SubLObject possibly_in_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL == mt )
    {
      return reader.bq_cons( $sym54$PROGN, ConsesLow.append( body, NIL ) );
    }
    final SubLObject mt_var = $sym55$MT_VAR;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( mt_var, mt ) ), ConsesLow.list( $sym25$WITH_MT_FUNCTION, ConsesLow.list( $sym56$POSSIBLY_IN_MT_DETERMINE_FUNCTION, mt_var ), ConsesLow.listS(
        $sym27$IN_MT, ConsesLow.list( $sym57$POSSIBLY_IN_MT_DETERMINE_MT, mt_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 12952L)
  public static SubLObject possibly_in_mt_determine_function(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mt || NIL != with_inference_any_mt_relevanceP( mt ) || NIL != with_inference_mt_relevance_all_mtsP( mt ) || NIL != genl_mts_of_listed_mts_are_relevantP() || NIL != any_time_is_relevantP() )
    {
      return $relevant_mt_function$.getDynamicValue( thread );
    }
    return $sym15$RELEVANT_MT_IS_GENL_MT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 13340L)
  public static SubLObject possibly_in_mt_determine_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != mt ) ? mt : $mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 13550L)
  public static SubLObject possibly_with_just_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL == mt )
    {
      return reader.bq_cons( $sym54$PROGN, ConsesLow.append( body, NIL ) );
    }
    final SubLObject mt_var = $sym59$MT_VAR;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( mt_var, mt ) ), ConsesLow.list( $sym25$WITH_MT_FUNCTION, ConsesLow.list( $sym60$POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION, mt_var ), ConsesLow.listS(
        $sym27$IN_MT, ConsesLow.list( $sym61$POSSIBLY_WITH_JUST_MT_DETERMINE_MT, mt_var ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 14017L)
  public static SubLObject possibly_with_just_mt_determine_function(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mt )
    {
      return $relevant_mt_function$.getDynamicValue( thread );
    }
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    return $sym18$RELEVANT_MT_IS_EQ;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 14231L)
  public static SubLObject possibly_with_just_mt_determine_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != mt ) ? mt : $mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 14352L)
  public static SubLObject with_inference_mt_relevance(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, ConsesLow.list( $sym65$WITH_INFERENCE_MT_RELEVANCE_VALIDATE, mt ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 14933L)
  public static SubLObject with_inference_mt_relevance_el(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject elmt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    elmt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym66$WITH_INFERENCE_MT_RELEVANCE, ConsesLow.list( $sym68$DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC, elmt ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 15202L)
  public static SubLObject with_inference_mt_relevance_validate(final SubLObject mt)
  {
    return ( NIL != mt ) ? mt : Errors.error( $str69$No_microtheory_was_specified_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 15380L)
  public static SubLObject determine_inference_mt_relevance_el_spec(final SubLObject elmt)
  {
    return ( NIL != hlmt.possibly_mt_p( elmt ) ) ? hlmt_czer.canonicalize_hlmt( elmt ) : elmt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 15568L)
  public static SubLObject possibly_with_inference_mt_relevance(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, mt, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 15832L)
  public static SubLObject possibly_with_inference_mt_relevance_internal(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    mt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL == mt )
    {
      return reader.bq_cons( $sym54$PROGN, ConsesLow.append( body, NIL ) );
    }
    final SubLObject mt_var = $sym72$MT_VAR;
    return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( mt_var, mt ) ), ConsesLow.list( $sym27$IN_MT, ConsesLow.list( $sym73$UPDATE_INFERENCE_MT_RELEVANCE_MT, mt_var ), ConsesLow.list(
        $sym25$WITH_MT_FUNCTION, ConsesLow.list( $sym74$UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION, mt_var ), ConsesLow.listS( $sym6$IN_MT_LIST, ConsesLow.list( $sym75$UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST, mt_var ),
            ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 16714L)
  public static SubLObject possibly_with_inference_mt_relevance_el(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject elmt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    elmt = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym76$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, ConsesLow.list( $sym31$CANONICALIZE_HLMT, elmt ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 16928L)
  public static SubLObject update_inference_mt_relevance_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt && !assertionsDisabledSynth && NIL == hlmt.possibly_hlmt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    if( NIL == mt )
    {
      return $mt$.getDynamicValue( thread );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 17157L)
  public static SubLObject update_inference_mt_relevance_function(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mt )
    {
      return $relevant_mt_function$.getDynamicValue( thread );
    }
    if( NIL != with_inference_any_mt_relevanceP( mt ) )
    {
      return $sym16$RELEVANT_MT_IS_ANY_MT;
    }
    if( NIL != with_inference_mt_relevance_all_mtsP( mt ) )
    {
      return $sym17$RELEVANT_MT_IS_EVERYTHING;
    }
    if( NIL != with_mt_union_relevanceP( mt ) )
    {
      return $sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
    }
    if( NIL != with_inference_anytime_relevanceP( mt ) )
    {
      return $sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME;
    }
    return $sym15$RELEVANT_MT_IS_GENL_MT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 17702L)
  public static SubLObject update_inference_mt_relevance_mt_list(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mt )
    {
      return $relevant_mts$.getDynamicValue( thread );
    }
    if( NIL != with_mt_union_relevanceP( mt ) )
    {
      return hlmt.mt_union_mts( mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 17951L)
  public static SubLObject determine_possibly_with_inference_mt_relevance_mt_and_spec(final SubLObject mt)
  {
    return Values.values( update_inference_mt_relevance_function( mt ), update_inference_mt_relevance_mt( mt ), update_inference_mt_relevance_mt_list( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 18337L)
  public static SubLObject with_inference_any_mt_relevanceP(final SubLObject mt)
  {
    return Equality.eq( $sym82$PSC_INFERENCE, psc.mt_inference_function( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 19137L)
  public static SubLObject with_inference_mt_relevance_all_mtsP(final SubLObject mt)
  {
    return Equality.eq( $sym84$ALL_MTS_INFERENCE, psc.mt_inference_function( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 19335L)
  public static SubLObject with_mt_union_relevanceP(final SubLObject mt)
  {
    return Equality.eq( $sym86$MT_UNION_INFERENCE, psc.mt_inference_function( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 19522L)
  public static SubLObject with_inference_anytime_relevanceP(final SubLObject mt)
  {
    return Equality.eq( $sym88$ANYTIME_PSC_INFERENCE, psc.mt_inference_function( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 19721L)
  public static SubLObject inference_relevant_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != all_mts_are_relevantP() )
    {
      return $const34$EverythingPSC;
    }
    if( NIL != any_mt_is_relevantP() )
    {
      return $const39$InferencePSC;
    }
    if( NIL != genl_mts_of_listed_mts_are_relevantP() )
    {
      return el_utilities.make_formula( $const89$MtUnionFn, $relevant_mts$.getDynamicValue( thread ), UNPROVIDED );
    }
    if( NIL != genl_mts_are_relevantP() )
    {
      return $mt$.getDynamicValue( thread );
    }
    return $mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 20277L)
  public static SubLObject mt_info(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != all_mts_are_relevantP() )
    {
      return $relevant_mt_function$.getDynamicValue( thread );
    }
    if( NIL != any_mt_is_relevantP() )
    {
      return $relevant_mt_function$.getDynamicValue( thread );
    }
    if( NIL != genl_mts_of_listed_mts_are_relevantP() )
    {
      return el_utilities.make_formula( $const89$MtUnionFn, $relevant_mts$.getDynamicValue( thread ), UNPROVIDED );
    }
    if( NIL != mt )
    {
      return mt;
    }
    if( NIL != $mt$.getDynamicValue( thread ) )
    {
      return $mt$.getDynamicValue( thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 20598L)
  public static SubLObject mt_to_mt_info(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt_info = NIL;
    final SubLObject mt_var = with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = $mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding( thread );
    try
    {
      $mt$.bind( update_inference_mt_relevance_mt( mt_var ), thread );
      $relevant_mt_function$.bind( update_inference_mt_relevance_function( mt_var ), thread );
      $relevant_mts$.bind( update_inference_mt_relevance_mt_list( mt_var ), thread );
      mt_info = mt_info( UNPROVIDED );
    }
    finally
    {
      $relevant_mts$.rebind( _prev_bind_3, thread );
      $relevant_mt_function$.rebind( _prev_bind_2, thread );
      $mt$.rebind( _prev_bind_0, thread );
    }
    return mt_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 20787L)
  public static SubLObject mt_info_to_mt(final SubLObject mt_info)
  {
    if( NIL != mt_function_eq( mt_info, $sym17$RELEVANT_MT_IS_EVERYTHING ) )
    {
      return $const34$EverythingPSC;
    }
    if( NIL != mt_function_eq( mt_info, $sym16$RELEVANT_MT_IS_ANY_MT ) )
    {
      return $const39$InferencePSC;
    }
    return mt_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 21019L)
  public static SubLObject with_mt_info(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mt_info = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    mt_info = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym91$PCOND, ConsesLow.list( ConsesLow.listS( $sym92$MT_FUNCTION_EQ, mt_info, $list93 ), reader.bq_cons( $sym35$WITH_ALL_MTS, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( ConsesLow
        .listS( $sym92$MT_FUNCTION_EQ, mt_info, $list94 ), reader.bq_cons( $sym40$WITH_ANY_MT, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( ConsesLow.list( $sym95$MT_UNION_NAUT_P, mt_info ), ConsesLow.listS(
            $sym96$WITH_GENL_MTS_OF_UNION, mt_info, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( T, ConsesLow.listS( $sym28$WITH_GENL_MTS, mt_info, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 21485L)
  public static SubLObject in_one_of_these_mtsP(final SubLObject ass, final SubLObject mts)
  {
    return subl_promotions.memberP( assertions_high.assertion_mt( ass ), mts, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 21577L)
  public static SubLObject any_or_all_mts_relevant_to_mtP(final SubLObject mt)
  {
    return makeBoolean( NIL != with_inference_any_mt_relevanceP( mt ) || NIL != with_inference_mt_relevance_all_mtsP( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 21729L)
  public static SubLObject conservative_constraint_mt(final SubLObject mt)
  {
    if( NIL != any_or_all_mts_relevant_to_mtP( mt ) )
    {
      return mt_vars.$core_mt_floor$.getGlobalValue();
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 22061L)
  public static SubLObject mt_relevant_to_mtP(final SubLObject mt, final SubLObject possibly_relevant_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject relevantP = NIL;
    final SubLObject mt_var = with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = $mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $relevant_mts$.currentBinding( thread );
    try
    {
      $mt$.bind( update_inference_mt_relevance_mt( mt_var ), thread );
      $relevant_mt_function$.bind( update_inference_mt_relevance_function( mt_var ), thread );
      $relevant_mts$.bind( update_inference_mt_relevance_mt_list( mt_var ), thread );
      relevantP = relevant_mtP( possibly_relevant_mt );
    }
    finally
    {
      $relevant_mts$.rebind( _prev_bind_3, thread );
      $relevant_mt_function$.rebind( _prev_bind_2, thread );
      $mt$.rebind( _prev_bind_0, thread );
    }
    return relevantP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 22305L)
  public static SubLObject any_relevant_mtP(final SubLObject mts)
  {
    SubLObject relevantP = NIL;
    if( NIL == relevantP )
    {
      SubLObject csome_list_var = mts;
      SubLObject mt = NIL;
      mt = csome_list_var.first();
      while ( NIL == relevantP && NIL != csome_list_var)
      {
        if( NIL != relevant_mtP( mt ) )
        {
          relevantP = T;
        }
        csome_list_var = csome_list_var.rest();
        mt = csome_list_var.first();
      }
    }
    return relevantP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 22470L)
  public static SubLObject map_mts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym35$WITH_ALL_MTS, ConsesLow.listS( $sym98$DO_ALL_FORT_INSTANCES, reader.bq_cons( var, $list99 ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list97 );
    return NIL;
  }

  public static SubLObject declare_mt_relevance_macros_file()
  {
    SubLFiles.declareMacro( me, "with_mt_function", "WITH-MT-FUNCTION" );
    SubLFiles.declareFunction( me, "mt_function_eq", "MT-FUNCTION-EQ", 2, 0, false );
    SubLFiles.declareFunction( me, "relevant_mt_function_eq", "RELEVANT-MT-FUNCTION-EQ", 1, 0, false );
    SubLFiles.declareMacro( me, "in_mt", "IN-MT" );
    SubLFiles.declareMacro( me, "in_mt_list", "IN-MT-LIST" );
    SubLFiles.declareFunction( me, "current_mt_relevance_mt_context", "CURRENT-MT-RELEVANCE-MT-CONTEXT", 0, 0, false );
    SubLFiles.declareFunction( me, "current_mt_relevance_mt", "CURRENT-MT-RELEVANCE-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "current_mt_relevance_mt_list", "CURRENT-MT-RELEVANCE-MT-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "current_mt_relevance_test", "CURRENT-MT-RELEVANCE-TEST", 0, 0, false );
    SubLFiles.declareFunction( me, "relevant_mt_is_everything", "RELEVANT-MT-IS-EVERYTHING", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_mt_is_any_mt", "RELEVANT-MT-IS-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_mt_is_eq", "RELEVANT-MT-IS-EQ", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_mt_is_in_list", "RELEVANT-MT-IS-IN-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_mt_is_genl_mt", "RELEVANT-MT-IS-GENL-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_mt_is_spec_mt", "RELEVANT-MT-IS-SPEC-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_mt_is_genl_mt_of_list_member", "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_mt_is_genl_mt_with_any_time", "RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_mtP", "RELEVANT-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "all_possibly_relevant_mts", "ALL-POSSIBLY-RELEVANT-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "relevant_assertionP", "RELEVANT-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_relevance_unspecifiedP", "MT-RELEVANCE-UNSPECIFIED?", 0, 0, false );
    SubLFiles.declareFunction( me, "genl_mts_are_relevantP", "GENL-MTS-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "any_mt_is_relevantP", "ANY-MT-IS-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "all_mts_are_relevantP", "ALL-MTS-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "any_or_all_mts_are_relevantP", "ANY-OR-ALL-MTS-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "listed_mts_are_relevantP", "LISTED-MTS-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "genl_mts_of_listed_mts_are_relevantP", "GENL-MTS-OF-LISTED-MTS-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "any_time_is_relevantP", "ANY-TIME-IS-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "spec_mts_are_relevantP", "SPEC-MTS-ARE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "only_specified_mt_is_relevantP", "ONLY-SPECIFIED-MT-IS-RELEVANT?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_genl_mts", "WITH-GENL-MTS" );
    SubLFiles.declareMacro( me, "with_genl_mts_el", "WITH-GENL-MTS-EL" );
    SubLFiles.declareMacro( me, "with_mt", "WITH-MT" );
    SubLFiles.declareMacro( me, "with_all_mts", "WITH-ALL-MTS" );
    SubLFiles.declareMacro( me, "with_any_mt", "WITH-ANY-MT" );
    SubLFiles.declareMacro( me, "with_just_mt", "WITH-JUST-MT" );
    SubLFiles.declareMacro( me, "with_mt_list", "WITH-MT-LIST" );
    SubLFiles.declareMacro( me, "with_mt_list_and_genl_mts", "WITH-MT-LIST-AND-GENL-MTS" );
    SubLFiles.declareMacro( me, "with_genl_mts_of_union", "WITH-GENL-MTS-OF-UNION" );
    SubLFiles.declareMacro( me, "with_any_time_relevance", "WITH-ANY-TIME-RELEVANCE" );
    SubLFiles.declareMacro( me, "with_spec_mts", "WITH-SPEC-MTS" );
    SubLFiles.declareMacro( me, "possibly_in_mt", "POSSIBLY-IN-MT" );
    SubLFiles.declareFunction( me, "possibly_in_mt_determine_function", "POSSIBLY-IN-MT-DETERMINE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_in_mt_determine_mt", "POSSIBLY-IN-MT-DETERMINE-MT", 1, 0, false );
    SubLFiles.declareMacro( me, "possibly_with_just_mt", "POSSIBLY-WITH-JUST-MT" );
    SubLFiles.declareFunction( me, "possibly_with_just_mt_determine_function", "POSSIBLY-WITH-JUST-MT-DETERMINE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_with_just_mt_determine_mt", "POSSIBLY-WITH-JUST-MT-DETERMINE-MT", 1, 0, false );
    SubLFiles.declareMacro( me, "with_inference_mt_relevance", "WITH-INFERENCE-MT-RELEVANCE" );
    SubLFiles.declareMacro( me, "with_inference_mt_relevance_el", "WITH-INFERENCE-MT-RELEVANCE-EL" );
    SubLFiles.declareFunction( me, "with_inference_mt_relevance_validate", "WITH-INFERENCE-MT-RELEVANCE-VALIDATE", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_inference_mt_relevance_el_spec", "DETERMINE-INFERENCE-MT-RELEVANCE-EL-SPEC", 1, 0, false );
    SubLFiles.declareMacro( me, "possibly_with_inference_mt_relevance", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE" );
    SubLFiles.declareMacro( me, "possibly_with_inference_mt_relevance_internal", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL" );
    SubLFiles.declareMacro( me, "possibly_with_inference_mt_relevance_el", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-EL" );
    SubLFiles.declareFunction( me, "update_inference_mt_relevance_mt", "UPDATE-INFERENCE-MT-RELEVANCE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "update_inference_mt_relevance_function", "UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "update_inference_mt_relevance_mt_list", "UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_possibly_with_inference_mt_relevance_mt_and_spec", "DETERMINE-POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-MT-AND-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "with_inference_any_mt_relevanceP", "WITH-INFERENCE-ANY-MT-RELEVANCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "with_inference_mt_relevance_all_mtsP", "WITH-INFERENCE-MT-RELEVANCE-ALL-MTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "with_mt_union_relevanceP", "WITH-MT-UNION-RELEVANCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "with_inference_anytime_relevanceP", "WITH-INFERENCE-ANYTIME-RELEVANCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_relevant_mt", "INFERENCE-RELEVANT-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "mt_info", "MT-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "mt_to_mt_info", "MT-TO-MT-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_info_to_mt", "MT-INFO-TO-MT", 1, 0, false );
    SubLFiles.declareMacro( me, "with_mt_info", "WITH-MT-INFO" );
    SubLFiles.declareFunction( me, "in_one_of_these_mtsP", "IN-ONE-OF-THESE-MTS?", 2, 0, false );
    SubLFiles.declareFunction( me, "any_or_all_mts_relevant_to_mtP", "ANY-OR-ALL-MTS-RELEVANT-TO-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "conservative_constraint_mt", "CONSERVATIVE-CONSTRAINT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_relevant_to_mtP", "MT-RELEVANT-TO-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "any_relevant_mtP", "ANY-RELEVANT-MT?", 1, 0, false );
    SubLFiles.declareMacro( me, "map_mts", "MAP-MTS" );
    return NIL;
  }

  public static SubLObject init_mt_relevance_macros_file()
  {
    $relevant_mt_function$ = SubLFiles.defparameter( "*RELEVANT-MT-FUNCTION*", NIL );
    $mt$ = SubLFiles.defparameter( "*MT*", mt_vars.$assertible_theory_mt_root$.getGlobalValue() );
    $relevant_mts$ = SubLFiles.defparameter( "*RELEVANT-MTS*", NIL );
    return NIL;
  }

  public static SubLObject setup_mt_relevance_macros_file()
  {
    SubLSpecialOperatorDeclarations.proclaim( $list0 );
    mt_vars.note_mt_var( $mt$.getDynamicValue(), UNPROVIDED );
    access_macros.register_macro_helper( $sym6$IN_MT_LIST, $list7 );
    SubLSpecialOperatorDeclarations.proclaim( $list10 );
    utilities_macros.register_cyc_api_macro( $sym28$WITH_GENL_MTS, $list4, $str29$MT_and_all_its_genl_mts_are_relev );
    utilities_macros.register_cyc_api_macro( $sym32$WITH_MT, $list4, $str29$MT_and_all_its_genl_mts_are_relev );
    utilities_macros.register_cyc_api_macro( $sym35$WITH_ALL_MTS, $list36, $str37$All_mts_are_relevant_within_BODY_ );
    utilities_macros.register_cyc_api_macro( $sym40$WITH_ANY_MT, $list36, $str41$Any_mt_can_be_used_for_relevance_ );
    utilities_macros.register_cyc_api_macro( $sym43$WITH_JUST_MT, $list4, $str44$Only_MT_is_relevant_within_BODY__ );
    utilities_macros.register_cyc_api_macro( $sym46$WITH_MT_LIST, $list8, $str47$Each_mt_in_the_list_MT_LIST_is_re );
    access_macros.register_macro_helper( $sym56$POSSIBLY_IN_MT_DETERMINE_FUNCTION, $sym58$POSSIBLY_IN_MT );
    access_macros.register_macro_helper( $sym57$POSSIBLY_IN_MT_DETERMINE_MT, $sym58$POSSIBLY_IN_MT );
    access_macros.register_macro_helper( $sym60$POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION, $sym62$POSSIBLY_WITH_JUST_MT );
    access_macros.register_macro_helper( $sym61$POSSIBLY_WITH_JUST_MT_DETERMINE_MT, $sym62$POSSIBLY_WITH_JUST_MT );
    utilities_macros.register_cyc_api_macro( $sym66$WITH_INFERENCE_MT_RELEVANCE, $list4, $str67$BODY_evaluated_with_the_same_rele );
    access_macros.register_macro_helper( $sym65$WITH_INFERENCE_MT_RELEVANCE_VALIDATE, $sym66$WITH_INFERENCE_MT_RELEVANCE );
    access_macros.register_macro_helper( $sym68$DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC, $sym70$WITH_INFERENCE_MT_RELEVANCE_EL );
    access_macros.register_macro_helper( $sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, $list71 );
    access_macros.register_macro_helper( $sym73$UPDATE_INFERENCE_MT_RELEVANCE_MT, $sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL );
    access_macros.register_macro_helper( $sym74$UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION, $sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL );
    access_macros.register_macro_helper( $sym75$UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST, $sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL );
    access_macros.define_obsolete_register( $sym78$DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC, $list79 );
    access_macros.register_macro_helper( $sym80$WITH_INFERENCE_ANY_MT_RELEVANCE_, $list81 );
    access_macros.register_macro_helper( $sym83$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_, $list81 );
    access_macros.register_macro_helper( $sym85$WITH_MT_UNION_RELEVANCE_, $list81 );
    access_macros.register_macro_helper( $sym87$WITH_INFERENCE_ANYTIME_RELEVANCE_, $list81 );
    utilities_macros.register_cyc_api_macro( $sym100$MAP_MTS, $list97, $str101$Iterate_over_all_microtheories__b );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_mt_relevance_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_mt_relevance_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_mt_relevance_macros_file();
  }
  static
  {
    me = new mt_relevance_macros();
    $relevant_mt_function$ = null;
    $mt$ = null;
    $relevant_mts$ = null;
    $list0 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "MT-FUNCTION-EQ" ), makeSymbol( "RELEVANT-MT-FUNCTION-EQ" ) );
    $list1 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$_RELEVANT_MT_FUNCTION_ = makeSymbol( "*RELEVANT-MT-FUNCTION*" );
    $list4 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym5$_MT_ = makeSymbol( "*MT*" );
    $sym6$IN_MT_LIST = makeSymbol( "IN-MT-LIST" );
    $list7 = ConsesLow.list( makeSymbol( "WITH-MT-LIST" ), makeSymbol( "WITH-MT-LIST-AND-GENL-MTS" ), makeSymbol( "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL" ) );
    $list8 = ConsesLow.list( makeSymbol( "MT-LIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym9$_RELEVANT_MTS_ = makeSymbol( "*RELEVANT-MTS*" );
    $list10 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "RELEVANT-MT-IS-EVERYTHING" ), makeSymbol( "RELEVANT-MT-IS-ANY-MT" ), makeSymbol( "RELEVANT-MT-IS-EQ" ), makeSymbol( "RELEVANT-MT-IS-IN-LIST" ),
        makeSymbol( "RELEVANT-MT-IS-GENL-MT" ), makeSymbol( "RELEVANT-MT-IS-SPEC-MT" ), makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" ) );
    $sym11$HLMT_EQUAL = makeSymbol( "HLMT-EQUAL" );
    $sym12$SPECIAL_CORE_LOOP_MT_P = makeSymbol( "SPECIAL-CORE-LOOP-MT-P" );
    $sym13$CORE_MICROTHEORY_P = makeSymbol( "CORE-MICROTHEORY-P" );
    $const14$TimePoint = constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) );
    $sym15$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym16$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $sym17$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $sym18$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $sym19$RELEVANT_MT_IS_IN_LIST = makeSymbol( "RELEVANT-MT-IS-IN-LIST" );
    $sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" );
    $sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME = makeSymbol( "RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME" );
    $kw22$ALL = makeKeyword( "ALL" );
    $kw23$UNABLE_TO_DETERMINE = makeKeyword( "UNABLE-TO-DETERMINE" );
    $sym24$RELEVANT_MT_IS_SPEC_MT = makeSymbol( "RELEVANT-MT-IS-SPEC-MT" );
    $sym25$WITH_MT_FUNCTION = makeSymbol( "WITH-MT-FUNCTION" );
    $list26 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-MT-IS-GENL-MT" ) );
    $sym27$IN_MT = makeSymbol( "IN-MT" );
    $sym28$WITH_GENL_MTS = makeSymbol( "WITH-GENL-MTS" );
    $str29$MT_and_all_its_genl_mts_are_relev = makeString( "MT and all its genl mts are relevant within BODY." );
    $list30 = ConsesLow.list( makeSymbol( "ELMT" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym31$CANONICALIZE_HLMT = makeSymbol( "CANONICALIZE-HLMT" );
    $sym32$WITH_MT = makeSymbol( "WITH-MT" );
    $list33 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-MT-IS-EVERYTHING" ) );
    $const34$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym35$WITH_ALL_MTS = makeSymbol( "WITH-ALL-MTS" );
    $list36 = ConsesLow.list( makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str37$All_mts_are_relevant_within_BODY_ = makeString( "All mts are relevant within BODY." );
    $list38 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-MT-IS-ANY-MT" ) );
    $const39$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym40$WITH_ANY_MT = makeSymbol( "WITH-ANY-MT" );
    $str41$Any_mt_can_be_used_for_relevance_ = makeString( "Any mt can be used for relevance for a particular inference within &BODY." );
    $list42 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-MT-IS-EQ" ) );
    $sym43$WITH_JUST_MT = makeSymbol( "WITH-JUST-MT" );
    $str44$Only_MT_is_relevant_within_BODY__ = makeString( "Only MT is relevant within BODY (no genl mts)." );
    $list45 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-MT-IS-IN-LIST" ) );
    $sym46$WITH_MT_LIST = makeSymbol( "WITH-MT-LIST" );
    $str47$Each_mt_in_the_list_MT_LIST_is_re = makeString( "Each mt in the list MT-LIST is relevant within BODY (no genl mts)." );
    $list48 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" ) );
    $list49 = ConsesLow.list( makeSymbol( "MT-UNION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym50$WITH_MT_LIST_AND_GENL_MTS = makeSymbol( "WITH-MT-LIST-AND-GENL-MTS" );
    $sym51$MT_UNION_MTS = makeSymbol( "MT-UNION-MTS" );
    $list52 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME" ) );
    $list53 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-MT-IS-SPEC-MT" ) );
    $sym54$PROGN = makeSymbol( "PROGN" );
    $sym55$MT_VAR = makeUninternedSymbol( "MT-VAR" );
    $sym56$POSSIBLY_IN_MT_DETERMINE_FUNCTION = makeSymbol( "POSSIBLY-IN-MT-DETERMINE-FUNCTION" );
    $sym57$POSSIBLY_IN_MT_DETERMINE_MT = makeSymbol( "POSSIBLY-IN-MT-DETERMINE-MT" );
    $sym58$POSSIBLY_IN_MT = makeSymbol( "POSSIBLY-IN-MT" );
    $sym59$MT_VAR = makeUninternedSymbol( "MT-VAR" );
    $sym60$POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION = makeSymbol( "POSSIBLY-WITH-JUST-MT-DETERMINE-FUNCTION" );
    $sym61$POSSIBLY_WITH_JUST_MT_DETERMINE_MT = makeSymbol( "POSSIBLY-WITH-JUST-MT-DETERMINE-MT" );
    $sym62$POSSIBLY_WITH_JUST_MT = makeSymbol( "POSSIBLY-WITH-JUST-MT" );
    $sym63$HLMT_P = makeSymbol( "HLMT-P" );
    $sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL = makeSymbol( "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL" );
    $sym65$WITH_INFERENCE_MT_RELEVANCE_VALIDATE = makeSymbol( "WITH-INFERENCE-MT-RELEVANCE-VALIDATE" );
    $sym66$WITH_INFERENCE_MT_RELEVANCE = makeSymbol( "WITH-INFERENCE-MT-RELEVANCE" );
    $str67$BODY_evaluated_with_the_same_rele = makeString(
        "BODY evaluated with the same relevance used for inferences in MT.\n   This is like @xref with-genl-mts, except it is special-cased to\n   @xref with-all-mts when the mt is #$EverythingPSC,\n   @xref with-any-mt when the mt is #$InferencePSC.\n   Also, with-inference-mt-relevance errors if passed NIL for an mt." );
    $sym68$DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC = makeSymbol( "DETERMINE-INFERENCE-MT-RELEVANCE-EL-SPEC" );
    $str69$No_microtheory_was_specified_ = makeString( "No microtheory was specified." );
    $sym70$WITH_INFERENCE_MT_RELEVANCE_EL = makeSymbol( "WITH-INFERENCE-MT-RELEVANCE-EL" );
    $list71 = ConsesLow.list( makeSymbol( "WITH-INFERENCE-MT-RELEVANCE" ), makeSymbol( "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE" ) );
    $sym72$MT_VAR = makeUninternedSymbol( "MT-VAR" );
    $sym73$UPDATE_INFERENCE_MT_RELEVANCE_MT = makeSymbol( "UPDATE-INFERENCE-MT-RELEVANCE-MT" );
    $sym74$UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION = makeSymbol( "UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION" );
    $sym75$UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST = makeSymbol( "UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST" );
    $sym76$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = makeSymbol( "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE" );
    $sym77$POSSIBLY_HLMT_P = makeSymbol( "POSSIBLY-HLMT-P" );
    $sym78$DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC = makeSymbol( "DETERMINE-POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-MT-AND-SPEC" );
    $list79 = ConsesLow.list( makeSymbol( "UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION" ), makeSymbol( "UPDATE-INFERENCE-MT-RELEVANCE-MT" ), makeSymbol( "UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST" ) );
    $sym80$WITH_INFERENCE_ANY_MT_RELEVANCE_ = makeSymbol( "WITH-INFERENCE-ANY-MT-RELEVANCE?" );
    $list81 = ConsesLow.list( makeSymbol( "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL" ), makeSymbol( "POSSIBLY-IN-MT" ) );
    $sym82$PSC_INFERENCE = makeSymbol( "PSC-INFERENCE" );
    $sym83$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_ = makeSymbol( "WITH-INFERENCE-MT-RELEVANCE-ALL-MTS?" );
    $sym84$ALL_MTS_INFERENCE = makeSymbol( "ALL-MTS-INFERENCE" );
    $sym85$WITH_MT_UNION_RELEVANCE_ = makeSymbol( "WITH-MT-UNION-RELEVANCE?" );
    $sym86$MT_UNION_INFERENCE = makeSymbol( "MT-UNION-INFERENCE" );
    $sym87$WITH_INFERENCE_ANYTIME_RELEVANCE_ = makeSymbol( "WITH-INFERENCE-ANYTIME-RELEVANCE?" );
    $sym88$ANYTIME_PSC_INFERENCE = makeSymbol( "ANYTIME-PSC-INFERENCE" );
    $const89$MtUnionFn = constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) );
    $list90 = ConsesLow.list( makeSymbol( "MT-INFO" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym91$PCOND = makeSymbol( "PCOND" );
    $sym92$MT_FUNCTION_EQ = makeSymbol( "MT-FUNCTION-EQ" );
    $list93 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-MT-IS-EVERYTHING" ) ) );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RELEVANT-MT-IS-ANY-MT" ) ) );
    $sym95$MT_UNION_NAUT_P = makeSymbol( "MT-UNION-NAUT-P" );
    $sym96$WITH_GENL_MTS_OF_UNION = makeSymbol( "WITH-GENL-MTS-OF-UNION" );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym98$DO_ALL_FORT_INSTANCES = makeSymbol( "DO-ALL-FORT-INSTANCES" );
    $list99 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ) );
    $sym100$MAP_MTS = makeSymbol( "MAP-MTS" );
    $str101$Iterate_over_all_microtheories__b = makeString( "Iterate over all microtheories, binding VAR to an mt and executing BODY." );
  }
}
/*
 * 
 * Total time: 278 ms synthetic
 */