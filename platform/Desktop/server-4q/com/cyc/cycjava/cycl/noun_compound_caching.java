package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class noun_compound_caching
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.noun_compound_caching";
  public static final String myFingerPrint = "f1e006ca2a4ebd8375fbd08deb8cbf1b9a6030b3a5fc5e1ed2a01413e34c8d81";
  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 2053L)
  private static SubLSymbol $nc_rule_semantic_mappings$;
  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 2823L)
  private static SubLSymbol $nc_rule_semantic_constraint_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 2971L)
  private static SubLSymbol $current_nc_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 10984L)
  private static SubLSymbol $ncr_inference_rule_var_table$;
  private static final SubLSymbol $kw0$DEFAULT;
  private static final SubLSymbol $kw1$BACKWARD;
  private static final SubLObject $const2$inferenceRuleForNounCompoundRule;
  private static final SubLObject $const3$pragmaticRequirement;
  private static final SubLSymbol $kw4$FORWARD;
  private static final SubLObject $const5$forwardParseNounCompound;
  private static final SubLObject $const6$GeneralEnglishMt;
  private static final SubLSymbol $sym7$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const8$EverythingPSC;
  private static final SubLSymbol $kw9$GAF;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLObject $const12$TheNCArgIsas;
  private static final SubLString $str13$Couldn_t_construct_inference_rule;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$_HEAD_WORD;
  private static final SubLObject $const17$Noun;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$_HEAD_DENOT;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$_HEAD_POS;
  private static final SubLObject $const22$speechPartPreds;
  private static final SubLList $list23;
  private static final SubLObject $const24$parsedNounCompound;
  private static final SubLSymbol $sym25$_MOD_STRING;
  private static final SubLSymbol $sym26$_HEAD_STRING;
  private static final SubLObject $const27$NounCompoundParseFn;
  private static final SubLString $str28$Pragma_var__S_not_in_____S;
  private static final SubLSymbol $sym29$EL_VAR_;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$PATTERN_MATCHES_FORMULA;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$_MOD_DENOT;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLString $str40$No_semantic_literals_for__S;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$TERM;
  private static final SubLObject $const43$TheNCHead;
  private static final SubLObject $const44$TheNCModifier;
  private static final SubLSymbol $kw45$TERM;
  private static final SubLString $str46$Incompatible_constraint_mts_for__;
  private static final SubLObject $const47$ncRuleConstraint;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$VALUE;
  private static final SubLSymbol $sym51$FN;
  private static final SubLObject $const52$NCPOSConstraintFn;
  private static final SubLObject $const53$NCPOSPredConstraintFn;
  private static final SubLObject $const54$NCWordUnitConstraintFn;
  private static final SubLSymbol $kw55$MODIFIER;
  private static final SubLSymbol $kw56$HEAD;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$WORD;
  private static final SubLSymbol $sym60$PRED;
  private static final SubLSymbol $kw61$STRING;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$POS;
  private static final SubLObject $const64$wordForms;
  private static final SubLSymbol $kw65$PRED;
  private static final SubLSymbol $sym66$_SPEC_POS;
  private static final SubLObject $const67$genls;
  private static final SubLList $list68;
  private static final SubLObject $const69$wordStrings;
  private static final SubLList $list70;
  private static final SubLObject $const71$termPhrases;
  private static final SubLSymbol $kw72$DENOT;
  private static final SubLList $list73;
  private static final SubLList $list74;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLObject $const77$termStrings;
  private static final SubLSymbol $kw78$POS;
  private static final SubLList $list79;
  private static final SubLSymbol $kw80$WORD;
  private static final SubLString $str81$Can_t_get_literals_from__S;
  private static final SubLString $str82$_S_already_has_value__D___S;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$CONSTRAINT;
  private static final SubLString $str85$_S_is_not_compatible_with__S;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$WORD_UNIT;
  private static final SubLString $str88$_S_has_both__S_and__S;
  private static final SubLList $list89;
  private static final SubLString $str90$Disconnected_var_____S_in__S;
  private static final SubLSymbol $sym91$EL_IMPLICATION_P;
  private static final SubLObject $const92$EnglishMt;
  private static final SubLObject $const93$parseFodder;
  private static final SubLSymbol $sym94$FILE_EXISTS_;
  private static final SubLString $str95$Gathering_bigram_fodder___;
  private static final SubLSymbol $kw96$INPUT;
  private static final SubLString $str97$Unable_to_open__S;
  private static final SubLList $list98;
  private static final SubLObject $const99$nonPlural_Generic;
  private static final SubLString $str100$_;

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 855L)
  public static SubLObject assert_inference_rule_for_ncr(final SubLObject ncr_fort, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject inference_rule = construct_inference_rule_for_ncr( ncr_fort );
    final SubLObject pragmatic_requirements = thread.secondMultipleValue();
    final SubLObject mt = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != inference_rule && NIL != mt )
    {
      final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( NIL, thread );
        operation_communication.set_the_cyclist( cyclist );
        ke.ke_assert( inference_rule, mt, $kw0$DEFAULT, $kw1$BACKWARD );
        ke.ke_assert( ConsesLow.list( $const2$inferenceRuleForNounCompoundRule, ncr_fort, inference_rule ), mt, UNPROVIDED, UNPROVIDED );
        SubLObject cdolist_list_var = pragmatic_requirements;
        SubLObject pragmatic_requirement = NIL;
        pragmatic_requirement = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          ke.ke_assert( ConsesLow.list( $const3$pragmaticRequirement, pragmatic_requirement, inference_rule ), mt, $kw0$DEFAULT, $kw1$BACKWARD );
          cdolist_list_var = cdolist_list_var.rest();
          pragmatic_requirement = cdolist_list_var.first();
        }
        ke.ke_assert( inference_rule, mt, $kw0$DEFAULT, $kw4$FORWARD );
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
      }
    }
    return ncr_fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 1676L)
  public static SubLObject precache_noun_compound(final SubLObject modifier_string, final SubLObject head_string, SubLObject ncr_fort)
  {
    if( ncr_fort == UNPROVIDED )
    {
      ncr_fort = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ncr_fort )
    {
      ke.ke_assert( ConsesLow.list( $const5$forwardParseNounCompound, modifier_string, head_string ), $const6$GeneralEnglishMt, UNPROVIDED, UNPROVIDED );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
        SubLObject rule = NIL;
        final SubLObject pred_var = $const2$inferenceRuleForNounCompoundRule;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( ncr_fort, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( ncr_fort, ONE_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, NIL, NIL );
                SubLObject done_var_$1 = NIL;
                final SubLObject token_var_$2 = NIL;
                while ( NIL == done_var_$1)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                  final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
                  if( NIL != valid_$3 )
                  {
                    rule = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                    ke.ke_repropagate_assertion( rule );
                  }
                  done_var_$1 = makeBoolean( NIL == valid_$3 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return ncr_fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 3029L)
  public static SubLObject construct_inference_rule_for_ncr(final SubLObject ncr_fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject inference_rule = NIL;
    SubLObject pragmatic_requirements = NIL;
    SubLObject assert_mt = NIL;
    final SubLObject _prev_bind_0 = $current_nc_rule$.currentBinding( thread );
    try
    {
      $current_nc_rule$.bind( ncr_fort, thread );
      thread.resetMultipleValues();
      final SubLObject antecedent_literals = accumulate_nc_rule_antecedent_literals( ncr_fort );
      final SubLObject mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != mt )
      {
        assert_mt = mt;
        final SubLObject head_pos = find_head_pos_for_ncr( ncr_fort, antecedent_literals );
        final SubLObject denot = find_denot_for_ncr( ncr_fort, mt );
        if( NIL != denot && NIL == cycl_utilities.expression_find( $const12$TheNCArgIsas, denot, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject head_word = find_head_word_for_ncr( ncr_fort, antecedent_literals );
          thread.resetMultipleValues();
          final SubLObject inference_rule_$5 = construct_inference_rule_for_ncr_internal( antecedent_literals, head_word, head_pos, denot, ncr_fort );
          final SubLObject pragmatic_requirements_$6 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          inference_rule = inference_rule_$5;
          pragmatic_requirements = pragmatic_requirements_$6;
          if( NIL == inference_rule )
          {
            Errors.sublisp_break( $str13$Couldn_t_construct_inference_rule, new SubLObject[] { ncr_fort
            } );
          }
        }
      }
    }
    finally
    {
      $current_nc_rule$.rebind( _prev_bind_0, thread );
    }
    return Values.values( inference_rule, pragmatic_requirements, assert_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 3951L)
  public static SubLObject construct_inference_rule_for_ncr_internal(SubLObject antecedent_literals, SubLObject head_word, SubLObject head_pos, final SubLObject denot, final SubLObject ncr)
  {
    SubLObject inference_rule = NIL;
    SubLObject pragmatic_requirements = $list14;
    if( NIL != antecedent_literals && NIL != denot )
    {
      if( NIL == head_word )
      {
        final SubLObject item_var = $list15;
        if( NIL == conses_high.member( item_var, antecedent_literals, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          antecedent_literals = ConsesLow.cons( item_var, antecedent_literals );
        }
        head_word = $sym16$_HEAD_WORD;
      }
      if( head_pos.eql( $const17$Noun ) || NIL == head_pos )
      {
        SubLObject cdolist_list_var = $list18;
        SubLObject new_literal = NIL;
        new_literal = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var2 = new_literal;
          if( NIL == conses_high.member( item_var2, antecedent_literals, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            antecedent_literals = ConsesLow.cons( item_var2, antecedent_literals );
          }
          cdolist_list_var = cdolist_list_var.rest();
          new_literal = cdolist_list_var.first();
        }
        if( NIL != cycl_utilities.expression_find( $sym19$_HEAD_DENOT, denot, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject item_var = $list20;
          if( NIL == conses_high.member( item_var, antecedent_literals, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            antecedent_literals = ConsesLow.cons( item_var, antecedent_literals );
          }
        }
        head_pos = $sym21$_HEAD_POS;
      }
      else
      {
        final SubLObject item_var = ConsesLow.listS( $const22$speechPartPreds, head_pos, $list23 );
        if( NIL == conses_high.member( item_var, antecedent_literals, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          antecedent_literals = ConsesLow.cons( item_var, antecedent_literals );
        }
        pragmatic_requirements = conses_high.subst( head_pos, $sym21$_HEAD_POS, conses_high.copy_tree( pragmatic_requirements ), UNPROVIDED, UNPROVIDED );
      }
      final SubLObject consequent = ConsesLow.list( $const24$parsedNounCompound, ncr, $sym25$_MOD_STRING, $sym26$_HEAD_STRING, ConsesLow.list( $const27$NounCompoundParseFn, head_word, head_pos, denot ) );
      antecedent_literals = add_term_strings_literals( antecedent_literals, consequent );
      SubLObject cdolist_list_var2 = pragmatic_requirements;
      SubLObject pragma = NIL;
      pragma = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject cdolist_list_var_$7 = cycl_utilities.expression_gather( pragma, $sym29$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject var = NIL;
        var = cdolist_list_var_$7.first();
        while ( NIL != cdolist_list_var_$7)
        {
          if( NIL == list_utilities.tree_find( var, antecedent_literals, UNPROVIDED, UNPROVIDED ) )
          {
            Errors.sublisp_break( $str28$Pragma_var__S_not_in_____S, new SubLObject[] { var, antecedent_literals
            } );
          }
          cdolist_list_var_$7 = cdolist_list_var_$7.rest();
          var = cdolist_list_var_$7.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        pragma = cdolist_list_var2.first();
      }
      if( NIL != no_disconnected_ncr_varsP( antecedent_literals, consequent ) )
      {
        inference_rule = el_utilities.make_implication( el_utilities.make_conjunction( antecedent_literals ), consequent );
      }
    }
    return Values.values( inference_rule, pragmatic_requirements );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 5721L)
  public static SubLObject add_term_strings_literals(SubLObject antecedent_literals, final SubLObject consequent)
  {
    if( NIL == conses_high.member( $list30, antecedent_literals, $sym31$PATTERN_MATCHES_FORMULA, UNPROVIDED ) && NIL == conses_high.member( $list32, antecedent_literals, $sym31$PATTERN_MATCHES_FORMULA, UNPROVIDED )
        && ( NIL == conses_high.member( $list33, antecedent_literals, $sym31$PATTERN_MATCHES_FORMULA, UNPROVIDED ) || NIL != cycl_utilities.expression_find( $sym34$_MOD_DENOT, consequent, UNPROVIDED, UNPROVIDED,
            UNPROVIDED ) ) )
    {
      final SubLObject item_var = $list35;
      if( NIL == conses_high.member( item_var, antecedent_literals, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        antecedent_literals = ConsesLow.cons( item_var, antecedent_literals );
      }
    }
    if( NIL == conses_high.member( $list36, antecedent_literals, $sym31$PATTERN_MATCHES_FORMULA, UNPROVIDED ) && NIL == conses_high.member( $list37, antecedent_literals, $sym31$PATTERN_MATCHES_FORMULA, UNPROVIDED )
        && ( NIL == conses_high.member( $list38, antecedent_literals, $sym31$PATTERN_MATCHES_FORMULA, UNPROVIDED ) || NIL != cycl_utilities.expression_find( $sym19$_HEAD_DENOT, consequent, UNPROVIDED, UNPROVIDED,
            UNPROVIDED ) ) )
    {
      final SubLObject item_var = $list39;
      if( NIL == conses_high.member( item_var, antecedent_literals, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        antecedent_literals = ConsesLow.cons( item_var, antecedent_literals );
      }
    }
    return antecedent_literals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 6829L)
  public static SubLObject current_nc_ruleP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.equal( v_object, $current_nc_rule$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 6914L)
  public static SubLObject accumulate_nc_rule_antecedent_literals(final SubLObject ncr_fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject semantic_literals = accumulate_nc_rule_semantic_antecedent_literals( ncr_fort );
    final SubLObject mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject literals = NIL;
    SubLObject final_mt = NIL;
    if( NIL == semantic_literals )
    {
      Errors.warn( $str40$No_semantic_literals_for__S, ncr_fort );
    }
    if( NIL != semantic_literals )
    {
      thread.resetMultipleValues();
      final SubLObject syntactic_literals = accumulate_nc_rule_syntactic_antecedent_literals( ncr_fort, mt );
      final SubLObject new_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != new_mt )
      {
        literals = ConsesLow.append( syntactic_literals, semantic_literals );
        final_mt = new_mt;
      }
    }
    return Values.values( literals, final_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 7510L)
  public static SubLObject accumulate_nc_rule_semantic_antecedent_literals(final SubLObject ncr_fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject literals = NIL;
    SubLObject mt = NIL;
    SubLObject abortP = NIL;
    final SubLObject _prev_bind_0 = $current_nc_rule$.currentBinding( thread );
    try
    {
      $current_nc_rule$.bind( ncr_fort, thread );
      if( NIL == abortP )
      {
        SubLObject csome_list_var = $nc_rule_semantic_constraint_preds$.getGlobalValue();
        SubLObject pred = NIL;
        pred = csome_list_var.first();
        while ( NIL == abortP && NIL != csome_list_var)
        {
          final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
            final SubLObject pred_var = pred;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( ncr_fort, NIL, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( ncr_fort, NIL, pred_var );
              SubLObject done_var = abortP;
              final SubLObject token_var = NIL;
              while ( NIL == done_var)
              {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                if( NIL != valid )
                {
                  SubLObject final_index_iterator = NIL;
                  try
                  {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, NIL, NIL );
                    SubLObject done_var_$9 = abortP;
                    final SubLObject token_var_$10 = NIL;
                    while ( NIL == done_var_$9)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$10 );
                      final SubLObject valid_$11 = makeBoolean( !token_var_$10.eql( gaf ) );
                      if( NIL != valid_$11 )
                      {
                        SubLObject cdolist_list_var = $nc_rule_semantic_mappings$.getGlobalValue();
                        SubLObject pair = NIL;
                        pair = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          SubLObject current;
                          final SubLObject datum = current = pair;
                          SubLObject pattern = NIL;
                          SubLObject transform = NIL;
                          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                          pattern = current.first();
                          current = current.rest();
                          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                          transform = current.first();
                          current = current.rest();
                          if( NIL == current )
                          {
                            thread.resetMultipleValues();
                            final SubLObject success = formula_pattern_match.formula_matches_pattern( assertions_high.gaf_hl_formula( gaf ), pattern );
                            final SubLObject v_bindings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if( NIL != success )
                            {
                              SubLObject v_term = list_utilities.alist_lookup_without_values( v_bindings, $sym42$TERM, UNPROVIDED, UNPROVIDED );
                              thread.resetMultipleValues();
                              final SubLObject mt_$12 = check_ncr_constraint_mt( ncr_fort, gaf, mt );
                              final SubLObject abortP_$13 = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              mt = mt_$12;
                              abortP = abortP_$13;
                              if( NIL == abortP )
                              {
                                final SubLObject pcase_var = v_term;
                                if( pcase_var.eql( $const43$TheNCHead ) )
                                {
                                  v_term = $sym19$_HEAD_DENOT;
                                }
                                else if( pcase_var.eql( $const44$TheNCModifier ) )
                                {
                                  v_term = $sym34$_MOD_DENOT;
                                }
                                literals = ConsesLow.cons( conses_high.subst( v_term, $kw45$TERM, el_utilities.copy_expression( transform ), UNPROVIDED, UNPROVIDED ), literals );
                              }
                            }
                          }
                          else
                          {
                            cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          pair = cdolist_list_var.first();
                        }
                      }
                      done_var_$9 = makeBoolean( NIL == valid_$11 || NIL != abortP );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      if( NIL != final_index_iterator )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                      }
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid || NIL != abortP );
              }
            }
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$8, thread );
          }
          csome_list_var = csome_list_var.rest();
          pred = csome_list_var.first();
        }
      }
    }
    finally
    {
      $current_nc_rule$.rebind( _prev_bind_0, thread );
    }
    return ( NIL != abortP ) ? Values.values( NIL, NIL ) : Values.values( literals, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 8367L)
  public static SubLObject check_ncr_constraint_mt(final SubLObject ncr_fort, final SubLObject gaf, final SubLObject mt)
  {
    SubLObject new_mt = mt;
    SubLObject abortP = NIL;
    if( NIL == new_mt )
    {
      new_mt = assertions_high.assertion_mt( gaf );
    }
    else if( NIL != genl_mts.genl_mtP( assertions_high.assertion_mt( gaf ), new_mt, UNPROVIDED, UNPROVIDED ) )
    {
      new_mt = assertions_high.assertion_mt( gaf );
    }
    else if( NIL == genl_mts.genl_mtP( new_mt, assertions_high.assertion_mt( gaf ), UNPROVIDED, UNPROVIDED ) )
    {
      Errors.warn( $str46$Incompatible_constraint_mts_for__, ncr_fort, assertions_high.assertion_mt( gaf ), new_mt );
      abortP = T;
    }
    return Values.values( new_mt, abortP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 8850L)
  public static SubLObject accumulate_nc_rule_syntactic_antecedent_literals(final SubLObject ncr_fort, final SubLObject semantic_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject literals = NIL;
    SubLObject abortP = NIL;
    SubLObject head_constraint = NIL;
    SubLObject mod_constraint = NIL;
    thread.resetMultipleValues();
    final SubLObject head_constraint_$15 = head_syntactic_constraint_for_ncr( ncr_fort, semantic_mt );
    final SubLObject abortP_$16 = thread.secondMultipleValue();
    final SubLObject mt_$17 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    head_constraint = head_constraint_$15;
    abortP = abortP_$16;
    SubLObject mt = mt_$17;
    if( NIL == abortP )
    {
      thread.resetMultipleValues();
      final SubLObject mod_constraint_$18 = mod_syntactic_constraint_for_ncr( ncr_fort, mt );
      final SubLObject abortP_$17 = thread.secondMultipleValue();
      final SubLObject mt_$18 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      mod_constraint = mod_constraint_$18;
      abortP = abortP_$17;
      mt = mt_$18;
      if( NIL == abortP )
      {
        literals = ncr_syntactic_antecedent_literals_from_constraints( mod_constraint, head_constraint, mt );
      }
    }
    return ( NIL != abortP ) ? Values.values( NIL, NIL ) : Values.values( literals, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 9462L)
  public static SubLObject head_syntactic_constraint_for_ncr(final SubLObject ncr_fort, final SubLObject mt)
  {
    final SubLObject indexical = $const43$TheNCHead;
    return syntactic_constraint_for_ncr( ncr_fort, indexical, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 9626L)
  public static SubLObject mod_syntactic_constraint_for_ncr(final SubLObject ncr_fort, final SubLObject mt)
  {
    final SubLObject indexical = $const44$TheNCModifier;
    return syntactic_constraint_for_ncr( ncr_fort, indexical, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 9793L)
  public static SubLObject syntactic_constraint_for_ncr(final SubLObject ncr_fort, final SubLObject indexical, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraint = ConsesLow.make_list( THREE_INTEGER, NIL );
    SubLObject new_mt = mt;
    SubLObject abortP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
      final SubLObject pred_var = $const47$ncRuleConstraint;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( ncr_fort, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( ncr_fort, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, NIL, NIL );
              SubLObject done_var_$21 = NIL;
              final SubLObject token_var_$22 = NIL;
              while ( NIL == done_var_$21)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$22 );
                final SubLObject valid_$23 = makeBoolean( !token_var_$22.eql( gaf ) );
                if( NIL != valid_$23 )
                {
                  thread.resetMultipleValues();
                  final SubLObject success = formula_pattern_match.formula_matches_pattern( cycl_utilities.hl_to_el( assertions_high.gaf_arg2( gaf ) ), ConsesLow.listS( $list48, indexical, $list49 ) );
                  final SubLObject v_bindings = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != success )
                  {
                    final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym50$VALUE, UNPROVIDED, UNPROVIDED );
                    final SubLObject fn = list_utilities.alist_lookup_without_values( v_bindings, $sym51$FN, UNPROVIDED, UNPROVIDED );
                    thread.resetMultipleValues();
                    final SubLObject new_mt_$24 = check_ncr_constraint_mt( ncr_fort, gaf, new_mt );
                    final SubLObject abortP_$25 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    new_mt = new_mt_$24;
                    abortP = abortP_$25;
                    if( NIL == abortP )
                    {
                      final SubLObject pcase_var = fn;
                      if( pcase_var.eql( $const52$NCPOSConstraintFn ) )
                      {
                        set_ncr_constraint_value( constraint, ZERO_INTEGER, value );
                      }
                      else if( pcase_var.eql( $const53$NCPOSPredConstraintFn ) )
                      {
                        set_ncr_constraint_value( constraint, ONE_INTEGER, value );
                      }
                      else if( pcase_var.eql( $const54$NCWordUnitConstraintFn ) )
                      {
                        set_ncr_constraint_value( constraint, TWO_INTEGER, value );
                      }
                    }
                  }
                }
                done_var_$21 = makeBoolean( NIL == valid_$23 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Values.values( constraint, abortP, new_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 10697L)
  public static SubLObject ncr_syntactic_antecedent_literals_from_constraints(final SubLObject mod_constraint, final SubLObject head_constraint, final SubLObject mt)
  {
    return ConsesLow.append( ncr_syntactic_antecedent_literals_from_constraint( mod_constraint, $kw55$MODIFIER, mt ), ncr_syntactic_antecedent_literals_from_constraint( head_constraint, $kw56$HEAD, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 11326L)
  public static SubLObject get_ncr_var(final SubLObject indexical, final SubLObject type)
  {
    return list_utilities.alist_lookup_without_values( list_utilities.alist_lookup_without_values( $ncr_inference_rule_var_table$.getGlobalValue(), indexical, UNPROVIDED, UNPROVIDED ), type, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 11488L)
  public static SubLObject ncr_syntactic_antecedent_literals_from_constraint(final SubLObject constraint, final SubLObject type, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject literals = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( mt, thread );
      thread.resetMultipleValues();
      SubLObject success = pattern_match.tree_matches_pattern( constraint, $list58 );
      SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject word = list_utilities.alist_lookup_without_values( v_bindings, $sym59$WORD, UNPROVIDED, UNPROVIDED );
        final SubLObject pred = list_utilities.alist_lookup_without_values( v_bindings, $sym60$PRED, UNPROVIDED, UNPROVIDED );
        literals = ConsesLow.list( ConsesLow.list( pred, word, get_ncr_var( type, $kw61$STRING ) ) );
      }
      thread.resetMultipleValues();
      success = pattern_match.tree_matches_pattern( constraint, $list62 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject word = list_utilities.alist_lookup_without_values( v_bindings, $sym59$WORD, UNPROVIDED, UNPROVIDED );
        final SubLObject pos = list_utilities.alist_lookup_without_values( v_bindings, $sym63$POS, UNPROVIDED, UNPROVIDED );
        literals = ConsesLow.list( ConsesLow.list( $const64$wordForms, word, get_ncr_var( type, $kw65$PRED ), get_ncr_var( type, $kw61$STRING ) ), ConsesLow.list( $const22$speechPartPreds, $sym66$_SPEC_POS, get_ncr_var(
            type, $kw65$PRED ) ), ConsesLow.list( $const67$genls, $sym66$_SPEC_POS, pos ) );
      }
      thread.resetMultipleValues();
      success = pattern_match.tree_matches_pattern( constraint, $list68 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject word = list_utilities.alist_lookup_without_values( v_bindings, $sym59$WORD, UNPROVIDED, UNPROVIDED );
        literals = ConsesLow.list( ConsesLow.list( $const69$wordStrings, word, get_ncr_var( type, $kw61$STRING ) ) );
      }
      thread.resetMultipleValues();
      success = pattern_match.tree_matches_pattern( constraint, $list70 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject pred2 = list_utilities.alist_lookup_without_values( v_bindings, $sym60$PRED, UNPROVIDED, UNPROVIDED );
        literals = ConsesLow.list( ConsesLow.list( $const71$termPhrases, get_ncr_var( type, $kw72$DENOT ), pred2, get_ncr_var( type, $kw61$STRING ) ) );
      }
      thread.resetMultipleValues();
      success = pattern_match.tree_matches_pattern( constraint, $list73 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject pred2 = list_utilities.alist_lookup_without_values( v_bindings, $sym60$PRED, UNPROVIDED, UNPROVIDED );
        final SubLObject pos = list_utilities.alist_lookup_without_values( v_bindings, $sym63$POS, UNPROVIDED, UNPROVIDED );
        literals = ConsesLow.list( ConsesLow.list( $const71$termPhrases, get_ncr_var( type, $kw72$DENOT ), pred2, get_ncr_var( type, $kw61$STRING ) ), ConsesLow.list( $const71$termPhrases, get_ncr_var( type,
            $kw72$DENOT ), pos, get_ncr_var( type, $kw61$STRING ) ) );
      }
      thread.resetMultipleValues();
      success = pattern_match.tree_matches_pattern( constraint, $list74 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject pred2 = list_utilities.alist_lookup_without_values( v_bindings, $sym60$PRED, UNPROVIDED, UNPROVIDED );
        literals = ConsesLow.list( ConsesLow.list( pred2, get_ncr_var( type, $kw72$DENOT ), get_ncr_var( type, $kw61$STRING ) ) );
      }
      thread.resetMultipleValues();
      success = pattern_match.tree_matches_pattern( constraint, $list75 );
      v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject pos2 = list_utilities.alist_lookup_without_values( v_bindings, $sym63$POS, UNPROVIDED, UNPROVIDED );
        literals = ConsesLow.list( ConsesLow.list( $const71$termPhrases, get_ncr_var( type, $kw72$DENOT ), pos2, get_ncr_var( type, $kw61$STRING ) ) );
      }
      if( constraint.equal( $list76 ) )
      {
        literals = ConsesLow.list( ConsesLow.list( $const77$termStrings, get_ncr_var( type, $kw72$DENOT ), get_ncr_var( type, $kw61$STRING ) ) );
        if( $kw56$HEAD == type )
        {
          literals = ConsesLow.cons( ConsesLow.listS( $const67$genls, get_ncr_var( type, $kw78$POS ), $list79 ), literals );
          literals = ConsesLow.cons( ConsesLow.list( $const64$wordForms, get_ncr_var( type, $kw80$WORD ), get_ncr_var( type, $kw65$PRED ), get_ncr_var( type, $kw61$STRING ) ), literals );
          literals = ConsesLow.cons( ConsesLow.list( $const22$speechPartPreds, get_ncr_var( type, $kw78$POS ), get_ncr_var( type, $kw65$PRED ) ), literals );
        }
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL != list_utilities.empty_list_p( literals ) )
    {
      Errors.sublisp_break( $str81$Can_t_get_literals_from__S, new SubLObject[] { constraint
      } );
    }
    return literals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 14193L)
  public static SubLObject set_ncr_constraint_value(final SubLObject constraint, final SubLObject n, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !ConsesLow.nth( n, constraint ).equal( value ) )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != ConsesLow.nth( n, constraint ) )
      {
        Errors.error( $str82$_S_already_has_value__D___S, constraint, n, ConsesLow.nth( n, constraint ) );
      }
      ConsesLow.set_nth( n, constraint, value );
    }
    return constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 14462L)
  public static SubLObject find_head_pos_for_ncr(final SubLObject ncr_fort, final SubLObject antecedent_literals)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject head_pos = $const17$Noun;
    SubLObject abortP = NIL;
    if( NIL == abortP )
    {
      SubLObject csome_list_var = antecedent_literals;
      SubLObject literal = NIL;
      literal = csome_list_var.first();
      while ( NIL == abortP && NIL != csome_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern( literal, $list83 );
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != success )
        {
          final SubLObject constraint = list_utilities.alist_lookup_without_values( v_bindings, $sym84$CONSTRAINT, UNPROVIDED, UNPROVIDED );
          final SubLObject pos = ( NIL != lexicon_accessors.speech_part_predP( constraint, UNPROVIDED ) ) ? lexicon_accessors.pos_of_pred( constraint )
              : ( ( NIL != lexicon_accessors.speech_partP( constraint, UNPROVIDED ) ) ? constraint : NIL );
          if( NIL != lexicon_accessors.genl_posP( pos, head_pos, UNPROVIDED ) )
          {
            head_pos = pos;
          }
          else if( NIL != pos )
          {
            if( NIL == lexicon_accessors.genl_posP( head_pos, pos, UNPROVIDED ) )
            {
              Errors.sublisp_break( $str85$_S_is_not_compatible_with__S, new SubLObject[] { pos, head_pos
              } );
              abortP = T;
            }
          }
        }
        csome_list_var = csome_list_var.rest();
        literal = csome_list_var.first();
      }
    }
    return ( NIL != abortP ) ? NIL : head_pos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 15211L)
  public static SubLObject find_head_word_for_ncr(final SubLObject ncr_fort, final SubLObject antecedent_literals)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject head_word = NIL;
    SubLObject abortP = NIL;
    if( NIL == abortP )
    {
      SubLObject csome_list_var = antecedent_literals;
      SubLObject literal = NIL;
      literal = csome_list_var.first();
      while ( NIL == abortP && NIL != csome_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern( literal, $list86 );
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != success )
        {
          final SubLObject word_unit = list_utilities.alist_lookup_without_values( v_bindings, $sym87$WORD_UNIT, UNPROVIDED, UNPROVIDED );
          if( NIL == head_word )
          {
            head_word = word_unit;
          }
          else if( !head_word.equal( word_unit ) )
          {
            Errors.warn( $str88$_S_has_both__S_and__S, ncr_fort, head_word, word_unit );
            abortP = T;
          }
        }
        csome_list_var = csome_list_var.rest();
        literal = csome_list_var.first();
      }
    }
    return ( NIL != abortP ) ? NIL : head_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 15798L)
  public static SubLObject no_disconnected_ncr_varsP(final SubLObject antecedent_juncts, final SubLObject consequent)
  {
    SubLObject okP = T;
    SubLObject cdolist_list_var = antecedent_juncts;
    SubLObject junct = NIL;
    junct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = ncr_junct_find_disconnected_var( junct, antecedent_juncts, consequent );
      if( NIL != var && NIL == conses_high.member( var, $list89, UNPROVIDED, UNPROVIDED ) )
      {
        okP = NIL;
        Errors.sublisp_break( $str90$Disconnected_var_____S_in__S, new SubLObject[] { var, junct
        } );
      }
      cdolist_list_var = cdolist_list_var.rest();
      junct = cdolist_list_var.first();
    }
    if( NIL != okP && NIL != ncr_junct_find_disconnected_var( consequent, antecedent_juncts, UNPROVIDED ) )
    {
      okP = NIL;
      Errors.sublisp_break( $str90$Disconnected_var_____S_in__S, new SubLObject[] { ncr_junct_find_disconnected_var( consequent, antecedent_juncts, UNPROVIDED ), consequent
      } );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 16402L)
  public static SubLObject ncr_junct_find_disconnected_var(final SubLObject junct, final SubLObject antecedent_juncts, SubLObject consequent)
  {
    if( consequent == UNPROVIDED )
    {
      consequent = NIL;
    }
    SubLObject disconnected_var = NIL;
    final SubLObject other_antecedent_juncts = Sequences.remove( junct, antecedent_juncts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject vars = obsolete.formula_free_variables( junct, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == disconnected_var )
    {
      SubLObject csome_list_var = vars;
      SubLObject var = NIL;
      var = csome_list_var.first();
      while ( NIL == disconnected_var && NIL != csome_list_var)
      {
        if( NIL != ncr_disconnected_varP( var, other_antecedent_juncts, consequent ) )
        {
          disconnected_var = var;
        }
        csome_list_var = csome_list_var.rest();
        var = csome_list_var.first();
      }
    }
    return disconnected_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 16808L)
  public static SubLObject ncr_implication_disconnected_varP(final SubLObject var, final SubLObject implication)
  {
    assert NIL != el_utilities.el_implication_p( implication ) : implication;
    SubLObject ans = NIL;
    final SubLObject antecedent = cycl_utilities.formula_arg1( implication, UNPROVIDED );
    final SubLObject antecedent_juncts = cycl_utilities.formula_args( antecedent, UNPROVIDED );
    final SubLObject consequent = cycl_utilities.formula_arg2( implication, UNPROVIDED );
    if( NIL == ans )
    {
      SubLObject csome_list_var = antecedent_juncts;
      SubLObject junct = NIL;
      junct = csome_list_var.first();
      while ( NIL == ans && NIL != csome_list_var)
      {
        if( NIL != cycl_utilities.expression_find( var, junct, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != ncr_disconnected_varP( var, Sequences.remove( junct, antecedent_juncts, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ), consequent ) )
        {
          ans = T;
        }
        csome_list_var = csome_list_var.rest();
        junct = csome_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 17272L)
  public static SubLObject ncr_disconnected_varP(final SubLObject var, final SubLObject other_antecedent_juncts, final SubLObject consequent)
  {
    return makeBoolean( NIL == list_utilities.tree_find( var, other_antecedent_juncts, UNPROVIDED, UNPROVIDED ) && ( NIL == el_utilities.el_formula_p( consequent ) || NIL == cycl_utilities.expression_find( var,
        consequent, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 17487L)
  public static SubLObject find_denot_for_ncr(final SubLObject ncr_fort, final SubLObject mt)
  {
    final SubLObject keywordy_template = noun_compound_parser.rbp_rule_cycl_semx( ncr_fort, mt );
    return cycl_utilities.expression_subst( $sym19$_HEAD_DENOT, $kw56$HEAD, cycl_utilities.expression_subst( $sym34$_MOD_DENOT, $kw55$MODIFIER, keywordy_template, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 17723L)
  public static SubLObject precache_noun_compound_parses(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const92$EnglishMt;
    }
    return ke.ke_assert( ConsesLow.list( $const93$parseFodder, string ), mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/noun-compound-caching.lisp", position = 17894L)
  public static SubLObject find_bigram_fodder(final SubLObject filename, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const92$EnglishMt;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != file_utilities.file_existsP( filename ) : filename;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str95$Gathering_bigram_fodder___ );
        SubLObject stream = NIL;
        try
        {
          final SubLObject _prev_bind_0_$27 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream = compatibility.open_text( filename, $kw96$INPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$27, thread );
          }
          if( !stream.isStream() )
          {
            Errors.error( $str97$Unable_to_open__S, filename );
          }
          final SubLObject stream_var = stream;
          if( stream_var.isStream() )
          {
            final SubLObject length_var = streams_high.file_length( stream_var );
            final SubLObject stream_var_$28 = stream_var;
            SubLObject line_number_var = NIL;
            SubLObject line = NIL;
            line_number_var = ZERO_INTEGER;
            for( line = file_utilities.do_stream_lines_get_next_line( stream_var_$28 ); NIL != line; line = file_utilities.do_stream_lines_get_next_line( stream_var_$28 ) )
            {
              final SubLObject strings = string_utilities.string_tokenize( line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              if( NIL != list_utilities.lengthGE( strings, TWO_INTEGER, UNPROVIDED ) )
              {
                SubLObject current;
                final SubLObject datum = current = list_utilities.first_n( TWO_INTEGER, strings );
                SubLObject mod_string = NIL;
                SubLObject head_string = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
                mod_string = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
                head_string = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  if( NIL != lexicon_accessors.string_is_posP( head_string, $const17$Noun, NIL, mt, UNPROVIDED ) && ( NIL != list_utilities.non_empty_list_p( lexicon_accessors.denots_of_stringXpred( mod_string,
                      $const99$nonPlural_Generic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) || NIL != list_utilities.non_empty_list_p( lexicon_accessors.denots_of_name_string( mod_string,
                          UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) )
                  {
                    precache_noun_compound_parses( Sequences.cconcatenate( mod_string, new SubLObject[] { $str100$_, head_string
                    } ), UNPROVIDED );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list98 );
                }
              }
              utilities_macros.note_percent_progress( streams_high.file_position( stream_var, UNPROVIDED ), length_var );
              line_number_var = number_utilities.f_1X( line_number_var );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( stream.isStream() )
            {
              streams_high.close( stream, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  public static SubLObject declare_noun_compound_caching_file()
  {
    SubLFiles.declareFunction( me, "assert_inference_rule_for_ncr", "ASSERT-INFERENCE-RULE-FOR-NCR", 1, 1, false );
    SubLFiles.declareFunction( me, "precache_noun_compound", "PRECACHE-NOUN-COMPOUND", 2, 1, false );
    SubLFiles.declareFunction( me, "construct_inference_rule_for_ncr", "CONSTRUCT-INFERENCE-RULE-FOR-NCR", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_inference_rule_for_ncr_internal", "CONSTRUCT-INFERENCE-RULE-FOR-NCR-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "add_term_strings_literals", "ADD-TERM-STRINGS-LITERALS", 2, 0, false );
    SubLFiles.declareFunction( me, "current_nc_ruleP", "CURRENT-NC-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "accumulate_nc_rule_antecedent_literals", "ACCUMULATE-NC-RULE-ANTECEDENT-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "accumulate_nc_rule_semantic_antecedent_literals", "ACCUMULATE-NC-RULE-SEMANTIC-ANTECEDENT-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "check_ncr_constraint_mt", "CHECK-NCR-CONSTRAINT-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "accumulate_nc_rule_syntactic_antecedent_literals", "ACCUMULATE-NC-RULE-SYNTACTIC-ANTECEDENT-LITERALS", 2, 0, false );
    SubLFiles.declareFunction( me, "head_syntactic_constraint_for_ncr", "HEAD-SYNTACTIC-CONSTRAINT-FOR-NCR", 2, 0, false );
    SubLFiles.declareFunction( me, "mod_syntactic_constraint_for_ncr", "MOD-SYNTACTIC-CONSTRAINT-FOR-NCR", 2, 0, false );
    SubLFiles.declareFunction( me, "syntactic_constraint_for_ncr", "SYNTACTIC-CONSTRAINT-FOR-NCR", 3, 0, false );
    SubLFiles.declareFunction( me, "ncr_syntactic_antecedent_literals_from_constraints", "NCR-SYNTACTIC-ANTECEDENT-LITERALS-FROM-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "get_ncr_var", "GET-NCR-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "ncr_syntactic_antecedent_literals_from_constraint", "NCR-SYNTACTIC-ANTECEDENT-LITERALS-FROM-CONSTRAINT", 3, 0, false );
    SubLFiles.declareFunction( me, "set_ncr_constraint_value", "SET-NCR-CONSTRAINT-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "find_head_pos_for_ncr", "FIND-HEAD-POS-FOR-NCR", 2, 0, false );
    SubLFiles.declareFunction( me, "find_head_word_for_ncr", "FIND-HEAD-WORD-FOR-NCR", 2, 0, false );
    SubLFiles.declareFunction( me, "no_disconnected_ncr_varsP", "NO-DISCONNECTED-NCR-VARS?", 2, 0, false );
    SubLFiles.declareFunction( me, "ncr_junct_find_disconnected_var", "NCR-JUNCT-FIND-DISCONNECTED-VAR", 2, 1, false );
    SubLFiles.declareFunction( me, "ncr_implication_disconnected_varP", "NCR-IMPLICATION-DISCONNECTED-VAR?", 2, 0, false );
    SubLFiles.declareFunction( me, "ncr_disconnected_varP", "NCR-DISCONNECTED-VAR?", 3, 0, false );
    SubLFiles.declareFunction( me, "find_denot_for_ncr", "FIND-DENOT-FOR-NCR", 2, 0, false );
    SubLFiles.declareFunction( me, "precache_noun_compound_parses", "PRECACHE-NOUN-COMPOUND-PARSES", 1, 1, false );
    SubLFiles.declareFunction( me, "find_bigram_fodder", "FIND-BIGRAM-FODDER", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_noun_compound_caching_file()
  {
    $nc_rule_semantic_mappings$ = SubLFiles.deflexical( "*NC-RULE-SEMANTIC-MAPPINGS*", $list10 );
    $nc_rule_semantic_constraint_preds$ = SubLFiles.deflexical( "*NC-RULE-SEMANTIC-CONSTRAINT-PREDS*", $list11 );
    $current_nc_rule$ = SubLFiles.defparameter( "*CURRENT-NC-RULE*", misc_utilities.uninitialized() );
    $ncr_inference_rule_var_table$ = SubLFiles.deflexical( "*NCR-INFERENCE-RULE-VAR-TABLE*", $list57 );
    return NIL;
  }

  public static SubLObject setup_noun_compound_caching_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_noun_compound_caching_file();
  }

  @Override
  public void initializeVariables()
  {
    init_noun_compound_caching_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_noun_compound_caching_file();
  }
  static
  {
    me = new noun_compound_caching();
    $nc_rule_semantic_mappings$ = null;
    $nc_rule_semantic_constraint_preds$ = null;
    $current_nc_rule$ = null;
    $ncr_inference_rule_var_table$ = null;
    $kw0$DEFAULT = makeKeyword( "DEFAULT" );
    $kw1$BACKWARD = makeKeyword( "BACKWARD" );
    $const2$inferenceRuleForNounCompoundRule = constant_handles.reader_make_constant_shell( makeString( "inferenceRuleForNounCompoundRule" ) );
    $const3$pragmaticRequirement = constant_handles.reader_make_constant_shell( makeString( "pragmaticRequirement" ) );
    $kw4$FORWARD = makeKeyword( "FORWARD" );
    $const5$forwardParseNounCompound = constant_handles.reader_make_constant_shell( makeString( "forwardParseNounCompound" ) );
    $const6$GeneralEnglishMt = constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) );
    $sym7$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const8$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw9$GAF = makeKeyword( "GAF" );
    $list10 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlsConstraintForNCR" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
        "CURRENT-NC-RULE?" ) ), constant_handles.reader_make_constant_shell( makeString( "TheNCModifier" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?MOD-DENOT" ), makeKeyword( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "genlsConstraintForNCR" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CURRENT-NC-RULE?" ) ), constant_handles.reader_make_constant_shell( makeString( "TheNCHead" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?HEAD-DENOT" ), makeKeyword( "TERM" ) ) ), ConsesLow
                        .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isaConstraintForNCR" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CURRENT-NC-RULE?" ) ),
                            constant_handles.reader_make_constant_shell( makeString( "TheNCModifier" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?MOD-DENOT" ), makeKeyword( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                    makeString( "isaConstraintForNCR" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CURRENT-NC-RULE?" ) ), constant_handles.reader_make_constant_shell( makeString(
                                        "TheNCHead" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
                                            "?HEAD-DENOT" ), makeKeyword( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalsConstraintForNCR" ) ), ConsesLow
                                                .list( makeKeyword( "TEST" ), makeSymbol( "CURRENT-NC-RULE?" ) ), constant_handles.reader_make_constant_shell( makeString( "TheNCModifier" ) ), ConsesLow.list( makeKeyword(
                                                    "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?MOD-DENOT" ), makeKeyword(
                                                        "TERM" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalsConstraintForNCR" ) ), ConsesLow.list( makeKeyword(
                                                            "TEST" ), makeSymbol( "CURRENT-NC-RULE?" ) ), constant_handles.reader_make_constant_shell( makeString( "TheNCHead" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                                                                makeSymbol( "TERM" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?HEAD-DENOT" ), makeKeyword(
                                                                    "TERM" ) ) ) );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equalsConstraintForNCR" ) ), constant_handles.reader_make_constant_shell( makeString( "genlsConstraintForNCR" ) ), constant_handles
        .reader_make_constant_shell( makeString( "isaConstraintForNCR" ) ) );
    $const12$TheNCArgIsas = constant_handles.reader_make_constant_shell( makeString( "TheNCArgIsas" ) );
    $str13$Couldn_t_construct_inference_rule = makeString( "Couldn't construct inference rule for ~S" );
    $list14 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "forwardParseNounCompound" ) ), makeSymbol( "?MOD-STRING" ), makeSymbol( "?HEAD-STRING" ) ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mostSpecificSpeechPartPreds" ) ), makeSymbol(
            "?HEAD-POS" ), makeSymbol( "?HEAD-PRED" ) ) ) );
    $list15 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeSymbol( "?HEAD-WORD" ), makeSymbol( "?HEAD-PRED" ), makeSymbol( "?HEAD-STRING" ) );
    $sym16$_HEAD_WORD = makeSymbol( "?HEAD-WORD" );
    $const17$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $list18 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?HEAD-POS" ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), makeSymbol( "?HEAD-POS" ), makeSymbol( "?HEAD-PRED" ) ) );
    $sym19$_HEAD_DENOT = makeSymbol( "?HEAD-DENOT" );
    $list20 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), makeSymbol( "?HEAD-DENOT" ), makeSymbol( "?HEAD-POS" ), makeSymbol( "?HEAD-STRING" ) );
    $sym21$_HEAD_POS = makeSymbol( "?HEAD-POS" );
    $const22$speechPartPreds = constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) );
    $list23 = ConsesLow.list( makeSymbol( "?HEAD-PRED" ) );
    $const24$parsedNounCompound = constant_handles.reader_make_constant_shell( makeString( "parsedNounCompound" ) );
    $sym25$_MOD_STRING = makeSymbol( "?MOD-STRING" );
    $sym26$_HEAD_STRING = makeSymbol( "?HEAD-STRING" );
    $const27$NounCompoundParseFn = constant_handles.reader_make_constant_shell( makeString( "NounCompoundParseFn" ) );
    $str28$Pragma_var__S_not_in_____S = makeString( "Pragma var ~S not in ~% ~S" );
    $sym29$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $list30 = ConsesLow.list( ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ) ),
        makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeSymbol( "?MOD-STRING" ) );
    $sym31$PATTERN_MATCHES_FORMULA = makeSymbol( "PATTERN-MATCHES-FORMULA" );
    $list32 = ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NAME-STRING-PRED?" ) ), makeSymbol( "?MOD-DENOT" ), makeSymbol( "?MOD-STRING" ) );
    $list33 = ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SPEECH-PART-PRED?" ) ), makeKeyword( "ANYTHING" ), makeSymbol( "?MOD-STRING" ) );
    $sym34$_MOD_DENOT = makeSymbol( "?MOD-DENOT" );
    $list35 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeSymbol( "?MOD-DENOT" ), makeSymbol( "?MOD-STRING" ) );
    $list36 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), makeSymbol( "?HEAD-DENOT" ), makeKeyword( "ANYTHING" ), makeSymbol( "?HEAD-STRING" ) );
    $list37 = ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NAME-STRING-PRED?" ) ), makeSymbol( "?HEAD-DENOT" ), makeSymbol( "?HEAD-STRING" ) );
    $list38 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeSymbol( "?HEAD-STRING" ) );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeSymbol( "?HEAD-DENOT" ), makeSymbol( "?HEAD-STRING" ) );
    $str40$No_semantic_literals_for__S = makeString( "No semantic literals for ~S" );
    $list41 = ConsesLow.list( makeSymbol( "PATTERN" ), makeSymbol( "TRANSFORM" ) );
    $sym42$TERM = makeSymbol( "TERM" );
    $const43$TheNCHead = constant_handles.reader_make_constant_shell( makeString( "TheNCHead" ) );
    $const44$TheNCModifier = constant_handles.reader_make_constant_shell( makeString( "TheNCModifier" ) );
    $kw45$TERM = makeKeyword( "TERM" );
    $str46$Incompatible_constraint_mts_for__ = makeString( "Incompatible constraint mts for ~S:~% ~S and ~S" );
    $const47$ncRuleConstraint = constant_handles.reader_make_constant_shell( makeString( "ncRuleConstraint" ) );
    $list48 = ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FN" ) ), ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString(
        "NCPOSConstraintFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NCPOSPredConstraintFn" ) ), constant_handles.reader_make_constant_shell( makeString( "NCWordUnitConstraintFn" ) ) ) );
    $list49 = ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VALUE" ) ) );
    $sym50$VALUE = makeSymbol( "VALUE" );
    $sym51$FN = makeSymbol( "FN" );
    $const52$NCPOSConstraintFn = constant_handles.reader_make_constant_shell( makeString( "NCPOSConstraintFn" ) );
    $const53$NCPOSPredConstraintFn = constant_handles.reader_make_constant_shell( makeString( "NCPOSPredConstraintFn" ) );
    $const54$NCWordUnitConstraintFn = constant_handles.reader_make_constant_shell( makeString( "NCWordUnitConstraintFn" ) );
    $kw55$MODIFIER = makeKeyword( "MODIFIER" );
    $kw56$HEAD = makeKeyword( "HEAD" );
    $list57 = ConsesLow.list( ConsesLow.list( makeKeyword( "HEAD" ), ConsesLow.cons( makeKeyword( "DENOT" ), makeSymbol( "?HEAD-DENOT" ) ), ConsesLow.cons( makeKeyword( "STRING" ), makeSymbol( "?HEAD-STRING" ) ),
        ConsesLow.cons( makeKeyword( "PRED" ), makeSymbol( "?HEAD-PRED" ) ), ConsesLow.cons( makeKeyword( "WORD" ), makeSymbol( "?HEAD-WORD" ) ), ConsesLow.cons( makeKeyword( "POS" ), makeSymbol( "?HEAD-POS" ) ) ),
        ConsesLow.list( makeKeyword( "MODIFIER" ), ConsesLow.cons( makeKeyword( "DENOT" ), makeSymbol( "?MOD-DENOT" ) ), ConsesLow.cons( makeKeyword( "STRING" ), makeSymbol( "?MOD-STRING" ) ), ConsesLow.cons(
            makeKeyword( "PRED" ), makeSymbol( "?MOD-PRED" ) ), ConsesLow.cons( makeKeyword( "POS" ), makeSymbol( "?MOD-POS" ) ) ) );
    $list58 = ConsesLow.list( NIL, ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SPEECH-PART-PRED?" ) ) ),
        ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "WORD" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FORT-P" ) ) ) );
    $sym59$WORD = makeSymbol( "WORD" );
    $sym60$PRED = makeSymbol( "PRED" );
    $kw61$STRING = makeKeyword( "STRING" );
    $list62 = ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "POS" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SPEECH-PART?" ) ) ), NIL, ConsesLow
        .list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "WORD" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "QUICK-LEXICAL-WORD?" ) ) ) );
    $sym63$POS = makeSymbol( "POS" );
    $const64$wordForms = constant_handles.reader_make_constant_shell( makeString( "wordForms" ) );
    $kw65$PRED = makeKeyword( "PRED" );
    $sym66$_SPEC_POS = makeSymbol( "?SPEC-POS" );
    $const67$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list68 = ConsesLow.list( NIL, NIL, ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "WORD" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FORT-P" ) ) ) );
    $const69$wordStrings = constant_handles.reader_make_constant_shell( makeString( "wordStrings" ) );
    $list70 = ConsesLow.list( NIL, ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SPEECH-PART-PRED?" ) ) ), NIL );
    $const71$termPhrases = constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) );
    $kw72$DENOT = makeKeyword( "DENOT" );
    $list73 = ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "POS" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SPEECH-PART?" ) ) ), ConsesLow.list(
        makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SPEECH-PART-PRED?" ) ) ), NIL );
    $list74 = ConsesLow.list( NIL, ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NAME-STRING-PRED?" ) ) ), NIL );
    $list75 = ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "POS" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SPEECH-PART?" ) ) ), NIL, NIL );
    $list76 = ConsesLow.list( NIL, NIL, NIL );
    $const77$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $kw78$POS = makeKeyword( "POS" );
    $list79 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) );
    $kw80$WORD = makeKeyword( "WORD" );
    $str81$Can_t_get_literals_from__S = makeString( "Can't get literals from ~S" );
    $str82$_S_already_has_value__D___S = makeString( "~S already has value ~D: ~S" );
    $list83 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), makeSymbol( "?HEAD-DENOT" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ),
        makeSymbol( "FORT-P" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CONSTRAINT" ) ) ), makeKeyword( "ANYTHING" ) );
    $sym84$CONSTRAINT = makeSymbol( "CONSTRAINT" );
    $str85$_S_is_not_compatible_with__S = makeString( "~S is not compatible with ~S" );
    $list86 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "QUICK-LEXICAL-WORD?" ) ),
        ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "WORD-UNIT" ) ) ), makeSymbol( "?HEAD-PRED" ), makeKeyword( "ANYTHING" ) );
    $sym87$WORD_UNIT = makeSymbol( "WORD-UNIT" );
    $str88$_S_has_both__S_and__S = makeString( "~S has both ~S and ~S" );
    $list89 = ConsesLow.list( makeSymbol( "?HEAD-STRING" ), makeSymbol( "?MOD-STRING" ) );
    $str90$Disconnected_var_____S_in__S = makeString( "Disconnected var:~% ~S in ~S" );
    $sym91$EL_IMPLICATION_P = makeSymbol( "EL-IMPLICATION-P" );
    $const92$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $const93$parseFodder = constant_handles.reader_make_constant_shell( makeString( "parseFodder" ) );
    $sym94$FILE_EXISTS_ = makeSymbol( "FILE-EXISTS?" );
    $str95$Gathering_bigram_fodder___ = makeString( "Gathering bigram fodder..." );
    $kw96$INPUT = makeKeyword( "INPUT" );
    $str97$Unable_to_open__S = makeString( "Unable to open ~S" );
    $list98 = ConsesLow.list( makeSymbol( "MOD-STRING" ), makeSymbol( "HEAD-STRING" ) );
    $const99$nonPlural_Generic = constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) );
    $str100$_ = makeString( " " );
  }
}
/*
 * 
 * Total time: 427 ms
 * 
 */