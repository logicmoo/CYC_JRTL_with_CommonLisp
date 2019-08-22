package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class proof_view_residual
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.proof_view_residual";
  public static final String myFingerPrint = "3624112c1fcb0d981d33d01e3dffd442ca7036703096b7dd94e3ff78e7f903d4";
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 818L)
  private static SubLSymbol $proof_view_relocated_proofs$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 875L)
  private static SubLSymbol $residual_proof_view_recursion_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 11634L)
  public static SubLSymbol $residual_proof_view_check_fitP$;
  private static final SubLString $str0$__Residual_recursion_depth___D__;
  private static final SubLString $str1$__Adding_residual_transformation_;
  private static final SubLSymbol $sym2$EL_SENTENCE_P;
  private static final SubLSymbol $kw3$IRRELEVANT;
  private static final SubLSymbol $kw4$TRIVIAL;
  private static final SubLSymbol $kw5$FN;
  private static final SubLSymbol $sym6$PROOF_VIEW_ADD_ENTRIES_FOR_RESIDUAL_TRANSFORMATION_PROOF;
  private static final SubLSymbol $kw7$PROOF;
  private static final SubLSymbol $sym8$FORT_P;
  private static final SubLString $str9$__Adding_entry_for_subproof____S_;
  private static final SubLString $str10$__Attaching_residual_subproof__S_;
  private static final SubLSymbol $sym11$_EXIT;
  private static final SubLString $str12$__Suppressing_proof_conclusion___;
  private static final SubLSymbol $kw13$RESIDUAL_PROOF_ATTACHMENT_POINTS;
  private static final SubLString $str14$__Reconsidering_placement_of__S__;
  private static final SubLString $str15$__Found_lower_residual_transforma;
  private static final SubLString $str16$__Push_down____S___under__S___int;
  private static final SubLString $str17$__Reconsidered_point___S__;
  private static final SubLString $str18$__Picking_attachment_point_for__S;
  private static final SubLString $str19$__Non_conjunction_parent_non_foca;
  private static final SubLString $str20$__Couldn_t_find__S___in__S__;
  private static final SubLString $str21$__Placing__S___under__S__;
  private static final SubLString $str22$__Highest_good_fit___S__;
  private static final SubLString $str23$__Moving__S___up_under__S__;
  private static final SubLString $str24$__Assuming__S___fits_under__S__;
  private static final SubLString $str25$__Bad_fit___S___not_in__S__;
  private static final SubLString $str26$__Good_fit___S___in__S__;
  private static final SubLString $str27$__Found_proof__S___of__S__;
  private static final SubLString $str28$Found_double_duty_residiual_trans;
  private static final SubLString $str29$Found_double_duty_conjunctive_rem;
  private static final SubLString $str30$Couldn_t_find_subproof_of____S___;

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 939L)
  public static SubLObject proof_view_add_entries_for_residual_transformation_proof(final SubLObject v_proof_view, final SubLObject residual_transformation_proof, final SubLObject parent_proof_view_entry,
      final SubLObject mt, final SubLObject inference_answer, final SubLObject proof_index_string, final SubLObject pph_relevance_safe_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $residual_proof_view_recursion_depth$.currentBinding( thread );
    try
    {
      $residual_proof_view_recursion_depth$.bind( number_utilities.f_1X( $residual_proof_view_recursion_depth$.getDynamicValue( thread ) ), thread );
      if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str0$__Residual_recursion_depth___D__, $residual_proof_view_recursion_depth$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED );
      }
      if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str1$__Adding_residual_transformation_, residual_transformation_proof, parent_proof_view_entry, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject proof_conclusion = pph_residual_transformation_proof_conclusion( residual_transformation_proof, mt );
      final SubLObject rule = inference_worker_residual_transformation.residual_transformation_proof_rule_assertion( residual_transformation_proof );
      final SubLObject label = proof_view.$proof_view_inferred_label$.getDynamicValue( thread );
      final SubLObject object_type = $sym2$EL_SENTENCE_P;
      final SubLObject _prev_bind_0_$1 = $proof_view_relocated_proofs$.currentBinding( thread );
      try
      {
        $proof_view_relocated_proofs$.bind( NIL, thread );
        SubLObject quasi_transformation_entry = NIL;
        if( NIL != pph_proof.pph_irrelevant_formulaP( proof_conclusion, pph_relevance_safe_list, pph_proof.pph_irrelevance_check_mt() ) )
        {
          proof_view.proof_view_note_filtered_item( v_proof_view, proof_conclusion, $kw3$IRRELEVANT );
        }
        else if( NIL != pph_proof.pph_trivial_sentenceP( proof_conclusion, pph_proof.pph_triviality_check_mt() ) )
        {
          proof_view.proof_view_note_filtered_item( v_proof_view, proof_conclusion, $kw4$TRIVIAL );
        }
        else if( NIL == proof_view.proof_view_has_entry_for_objectP( v_proof_view, proof_conclusion, parent_proof_view_entry ) )
        {
          if( NIL == proof_view_suppress_proof_conclusionP( v_proof_view, residual_transformation_proof, proof_conclusion ) )
          {
            quasi_transformation_entry = proof_view_populator.proof_view_add_new_entry( v_proof_view, label, parent_proof_view_entry, object_type, proof_conclusion, ConsesLow.list( $kw5$FN,
                $sym6$PROOF_VIEW_ADD_ENTRIES_FOR_RESIDUAL_TRANSFORMATION_PROOF, $kw7$PROOF, residual_transformation_proof ) );
            if( NIL != pph_proof.pph_irrelevant_supportP( rule, NIL, UNPROVIDED ) )
            {
              proof_view.proof_view_note_filtered_item( v_proof_view, rule, $kw3$IRRELEVANT );
            }
            else
            {
              proof_view_populator.proof_view_add_support_tree( v_proof_view, rule, quasi_transformation_entry, mt, UNPROVIDED, UNPROVIDED );
            }
            thread.resetMultipleValues();
            final SubLObject conclusion_subproofs = pph_residual_transformation_proof_subproofs_for_conclusion( residual_transformation_proof, mt );
            final SubLObject double_duty_subproofs = thread.secondMultipleValue();
            final SubLObject supported_asents = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject asents_to_support = supported_asents;
            final SubLObject v_forts = list_utilities.tree_gather( asents_to_support, $sym8$FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = conclusion_subproofs;
            SubLObject subproof = NIL;
            subproof = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != proof_view_conjunctive_removal_proof_p( subproof, mt ) )
              {
                final SubLObject supports = pph_proof.pph_sub_isomorphic_assertions_into_supports( pph_proof.pph_displayworthy_supports( subproof, NIL, mt, v_forts, UNPROVIDED ) );
                final SubLObject suppressed = proof_view_populator.proof_view_proof_literals_to_suppress( residual_transformation_proof, v_proof_view );
                SubLObject cdolist_list_var_$2 = pph_proof.pph_prune_meta_supports( supports, suppressed );
                SubLObject support = NIL;
                support = cdolist_list_var_$2.first();
                while ( NIL != cdolist_list_var_$2)
                {
                  if( NIL != subl_promotions.memberP( arguments.support_sentence( support ), asents_to_support, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
                  {
                    final SubLObject support_entry = proof_view_populator.proof_view_add_support_tree( v_proof_view, support, quasi_transformation_entry, mt, UNPROVIDED, UNPROVIDED );
                    if( NIL != support_entry )
                    {
                      proof_view.proof_view_entry_set_proof( support_entry, subproof );
                    }
                  }
                  cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                  support = cdolist_list_var_$2.first();
                }
              }
              else
              {
                if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
                {
                  format_nil.force_format( T, $str0$__Residual_recursion_depth___D__, $residual_proof_view_recursion_depth$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
                if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
                {
                  format_nil.force_format( T, $str9$__Adding_entry_for_subproof____S_, subproof, quasi_transformation_entry, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                construct_inference_proof_view_int2( subproof, inference_answer, mt, proof_index_string, v_proof_view, quasi_transformation_entry, pph_relevance_safe_list );
              }
              proof_view_populator.proof_view_note_already_handled( v_proof_view, subproof );
              if( NIL == subl_promotions.memberP( subproof, double_duty_subproofs, UNPROVIDED, UNPROVIDED ) )
              {
                proof_view_add_relocated_proof( subproof );
              }
              cdolist_list_var = cdolist_list_var.rest();
              subproof = cdolist_list_var.first();
            }
          }
        }
        final SubLObject subproof2 = inference_worker_residual_transformation.residual_transformation_proof_subproof( residual_transformation_proof );
        final SubLObject attachment_point = pick_residual_proof_subproof_attachment_point( subproof2, parent_proof_view_entry, mt );
        if( NIL != proof_view.proof_view_entry_p( attachment_point ) )
        {
          if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
          {
            format_nil.force_format( T, $str0$__Residual_recursion_depth___D__, $residual_proof_view_recursion_depth$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED );
          }
          if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
          {
            format_nil.force_format( T, $str10$__Attaching_residual_subproof__S_, subproof2, attachment_point, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          proof_view_populator.construct_inference_proof_view_int( subproof2, inference_answer, mt, proof_index_string, v_proof_view, attachment_point, pph_relevance_safe_list );
        }
        return quasi_transformation_entry;
      }
      finally
      {
        $proof_view_relocated_proofs$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      $residual_proof_view_recursion_depth$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 5427L)
  public static SubLObject proof_view_suppress_proof_conclusionP(final SubLObject v_proof_view, final SubLObject proof, final SubLObject proof_conclusion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject conclusion_sentence = proof_view.proof_view_fact_sentence( proof_conclusion );
    SubLObject cdolist_list_var = inference_datastructures_proof.proof_dependent_proofs( proof, UNPROVIDED );
    SubLObject parent_proof = NIL;
    parent_proof = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lits_to_suppress = proof_view_populator.proof_view_proof_literals_to_suppress( parent_proof, v_proof_view );
      if( NIL != subl_promotions.memberP( conclusion_sentence, lits_to_suppress, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
        {
          format_nil.force_format( T, $str12$__Suppressing_proof_conclusion___, proof_conclusion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      parent_proof = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 5921L)
  public static SubLObject proof_view_add_relocated_proof(final SubLObject relocated_proof)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == conses_high.member( relocated_proof, $proof_view_relocated_proofs$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $proof_view_relocated_proofs$.setDynamicValue( ConsesLow.cons( relocated_proof, $proof_view_relocated_proofs$.getDynamicValue( thread ) ), thread );
    }
    return relocated_proof;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 6199L)
  public static SubLObject proof_view_proof_relocated_p(final SubLObject proof)
  {
    return subl_promotions.memberP( proof, proof_view_get_relocated_proofs(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 6314L)
  public static SubLObject proof_view_get_relocated_proofs()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $proof_view_relocated_proofs$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 6405L)
  public static SubLObject pick_residual_proof_subproof_attachment_point(final SubLObject subproof, final SubLObject parent_proof_view_entry, final SubLObject mt)
  {
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( parent_proof_view_entry );
    SubLObject done = proof_view.proof_view_get_property( v_proof_view, $kw13$RESIDUAL_PROOF_ATTACHMENT_POINTS, UNPROVIDED );
    if( NIL == done )
    {
      done = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
      proof_view.proof_view_set_property( v_proof_view, $kw13$RESIDUAL_PROOF_ATTACHMENT_POINTS, done );
    }
    final SubLObject key = ConsesLow.list( subproof, parent_proof_view_entry );
    if( NIL != dictionary_utilities.dictionary_has_keyP( done, key ) )
    {
      return NIL;
    }
    final SubLObject attachment_point = pick_residual_proof_subproof_attachment_point_internal( subproof, parent_proof_view_entry, mt );
    dictionary.dictionary_enter( done, key, attachment_point );
    return attachment_point;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 7131L)
  public static SubLObject maybe_reconsider_parent_proof_view_entry(SubLObject parent_proof_view_entry, final SubLObject proof)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( parent_proof_view_entry );
    if( NIL != parent_proof_view_entry && NIL != proof_view_populator.proof_view_get_justification_root_entry( v_proof_view ) && NIL != proof_view.proof_view_entry_has_ancestorP( parent_proof_view_entry,
        proof_view_populator.proof_view_get_justification_root_entry( v_proof_view ), T ) )
    {
      SubLObject last_found;
      SubLObject child = last_found = proof_view_child_with_residual_transformation_dependent_proof( proof, parent_proof_view_entry );
      if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str14$__Reconsidering_placement_of__S__, proof, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      while ( NIL != child)
      {
        child = proof_view_child_with_residual_transformation_dependent_proof( proof, child );
        if( NIL != child )
        {
          if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
          {
            format_nil.force_format( T, $str15$__Found_lower_residual_transforma, child, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          last_found = child;
        }
      }
      if( NIL != last_found )
      {
        if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
        {
          format_nil.force_format( T, $str16$__Push_down____S___under__S___int, proof, parent_proof_view_entry, last_found, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        final SubLObject reconsidered = reconsider_residual_proof_subproof_attachment_point( proof, last_found );
        if( !reconsidered.eql( parent_proof_view_entry ) )
        {
          if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
          {
            format_nil.force_format( T, $str17$__Reconsidered_point___S__, reconsidered, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          parent_proof_view_entry = reconsidered;
        }
      }
    }
    return parent_proof_view_entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 8396L)
  public static SubLObject proof_view_child_with_residual_transformation_dependent_proof(final SubLObject proof, final SubLObject parent_proof_view_entry)
  {
    SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children( parent_proof_view_entry );
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject child_proof = proof_view.proof_view_entry_get_proof( child, UNPROVIDED );
      if( NIL != inference_worker_residual_transformation.residual_transformation_proof_p( child_proof ) && NIL != conses_high.member( proof, inference_datastructures_proof.all_proof_subproofs( child_proof ), UNPROVIDED,
          UNPROVIDED ) )
      {
        return child;
      }
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 8792L)
  public static SubLObject reconsider_residual_proof_subproof_attachment_point(final SubLObject subproof, final SubLObject parent_proof_view_entry)
  {
    final SubLObject mt = proof_view.proof_view_get_domain_mt( proof_view.proof_view_entry_get_proof_view( parent_proof_view_entry ) );
    return pick_residual_proof_subproof_attachment_point_internal( subproof, parent_proof_view_entry, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 9101L)
  public static SubLObject pick_residual_proof_subproof_attachment_point_internal(final SubLObject subproof, final SubLObject parent_proof_view_entry, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
    {
      format_nil.force_format( T, $str18$__Picking_attachment_point_for__S, subproof, parent_proof_view_entry, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject parent_proof = proof_view.proof_view_entry_get_proof( parent_proof_view_entry, UNPROVIDED );
    final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( parent_proof_view_entry );
    SubLObject attachment_point = parent_proof_view_entry;
    if( NIL != inference_worker_residual_transformation.residual_transformation_proof_p( subproof ) )
    {
      final SubLObject subproof_conclusion = pph_residual_transformation_proof_conclusion( subproof, mt );
      SubLObject doneP = NIL;
      while ( NIL == doneP && NIL != inference_worker_residual_transformation.residual_transformation_proof_p( parent_proof ))
      {
        final SubLObject non_focal_conclusion = pph_residual_transformation_proof_non_focal_conclusion( parent_proof );
        if( NIL == el_utilities.el_conjunction_p( non_focal_conclusion ) )
        {
          if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
          {
            format_nil.force_format( T, $str19$__Non_conjunction_parent_non_foca, non_focal_conclusion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          doneP = T;
        }
        else if( NIL == subl_promotions.memberP( subproof_conclusion, cycl_utilities.formula_args( non_focal_conclusion, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
          {
            format_nil.force_format( T, $str20$__Couldn_t_find__S___in__S__, subproof_conclusion, non_focal_conclusion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          doneP = T;
        }
        else
        {
          final SubLObject parent_id = proof_view.proof_view_entry_get_parent_id( attachment_point );
          if( parent_id.isInteger() )
          {
            attachment_point = proof_view.find_proof_view_entry_by_id( v_proof_view, parent_id );
            parent_proof = proof_view.proof_view_entry_get_proof( attachment_point, UNPROVIDED );
            if( NIL == proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
            {
              continue;
            }
            format_nil.force_format( T, $str21$__Placing__S___under__S__, subproof, attachment_point, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            doneP = T;
          }
        }
      }
    }
    else
    {
      SubLObject doneP2 = NIL;
      SubLObject highest_good_fit = attachment_point;
      while ( NIL == doneP2 && NIL != inference_worker_residual_transformation.residual_transformation_proof_p( parent_proof ))
      {
        if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
        {
          format_nil.force_format( T, $str22$__Highest_good_fit___S__, highest_good_fit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        final SubLObject parent_id2 = proof_view.proof_view_entry_get_parent_id( attachment_point );
        if( parent_id2.isInteger() )
        {
          final SubLObject attachment_point_candidate = attachment_point = proof_view.find_proof_view_entry_by_id( v_proof_view, parent_id2 );
          parent_proof = proof_view.proof_view_entry_get_proof( attachment_point, UNPROVIDED );
          if( NIL == residual_transformation_proof_entry_good_fitP( subproof, attachment_point ) )
          {
            continue;
          }
          highest_good_fit = attachment_point;
        }
        else
        {
          doneP2 = T;
        }
      }
      attachment_point = highest_good_fit;
      if( !attachment_point.eql( parent_proof_view_entry ) && NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str23$__Moving__S___up_under__S__, subproof, attachment_point, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return attachment_point;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 11687L)
  public static SubLObject residual_transformation_proof_entry_good_fitP(final SubLObject subproof, final SubLObject attachment_point)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $residual_proof_view_check_fitP$.getDynamicValue( thread ) )
    {
      return T;
    }
    if( NIL != inference_worker_transformation.transformation_proof_p( proof_view.proof_view_entry_get_proof( attachment_point, UNPROVIDED ) ) && NIL != conses_high.member( subproof, inference_datastructures_proof
        .all_proof_subproofs( proof_view.proof_view_entry_get_proof( attachment_point, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str24$__Assuming__S___fits_under__S__, subproof, attachment_point, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else if( NIL != inference_worker_removal.removal_proof_p( subproof ) )
    {
      final SubLObject conclusion = proof_view.proof_view_fact_sentence( pph_proof.pph_proof_conclusion( subproof, UNPROVIDED ) );
      final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view( attachment_point );
      if( !attachment_point.eql( proof_view_populator.proof_view_get_justification_root_entry( v_proof_view ) ) )
      {
        return NIL;
      }
      if( NIL == cycl_utilities.expression_find( conclusion, proof_view.proof_view_fact_sentence( pph_proof.pph_proof_conclusion( proof_view.proof_view_get_proof( v_proof_view ), UNPROVIDED ) ), NIL, Symbols
          .symbol_function( EQUAL ), UNPROVIDED ) )
      {
        if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
        {
          format_nil.force_format( T, $str25$__Bad_fit___S___not_in__S__, conclusion, proof_view.proof_view_fact_sentence( pph_proof.pph_proof_conclusion( proof_view.proof_view_get_proof( v_proof_view ), UNPROVIDED ) ),
              UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        return NIL;
      }
      if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
      {
        format_nil.force_format( T, $str26$__Good_fit___S___in__S__, conclusion, proof_view.proof_view_fact_sentence( pph_proof.pph_proof_conclusion( proof_view.proof_view_get_proof( v_proof_view ), UNPROVIDED ) ),
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      return T;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 12928L)
  public static SubLObject proof_view_conjunctive_removal_proof_p(final SubLObject proof, final SubLObject mt)
  {
    return makeBoolean( NIL != inference_worker_removal.removal_proof_p( proof ) && NIL != el_utilities.el_conjunction_p( pph_proof.pph_proof_conclusion( proof, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 13094L)
  public static SubLObject pph_residual_transformation_proof_conclusion(final SubLObject residual_transformation_proof, final SubLObject mt)
  {
    final SubLObject residual_transformation_link = inference_datastructures_proof.proof_link( residual_transformation_proof );
    final SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link( residual_transformation_link );
    final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem( jo_link );
    final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( focal_mapped_problem );
    final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem( focal_mapped_problem );
    final SubLObject focal_ist_literal = inference_datastructures_problem.problem_formula( focal_problem );
    final SubLObject v_bindings = inference_datastructures_proof.proof_bindings( residual_transformation_proof );
    final SubLObject converted_ist_literal = bindings.apply_bindings( variable_map, focal_ist_literal );
    final SubLObject proof_conclusion = bindings.apply_bindings( v_bindings, cycl_utilities.formula_arg2( converted_ist_literal, UNPROVIDED ) );
    return proof_conclusion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 14009L)
  public static SubLObject pph_residual_transformation_proof_non_focal_conclusion(final SubLObject residual_transformation_proof)
  {
    final SubLObject residual_transformation_link = inference_datastructures_proof.proof_link( residual_transformation_proof );
    final SubLObject jo_link = inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link( residual_transformation_link );
    final SubLObject non_focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem( jo_link );
    final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( non_focal_mapped_problem );
    final SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem( non_focal_mapped_problem );
    final SubLObject non_focal_ist_literal = inference_datastructures_problem.problem_formula( non_focal_problem );
    final SubLObject v_bindings = inference_datastructures_proof.proof_bindings( residual_transformation_proof );
    final SubLObject converted_ist_literal = bindings.apply_bindings( variable_map, non_focal_ist_literal );
    final SubLObject conclusion = bindings.apply_bindings( v_bindings, cycl_utilities.formula_arg2( converted_ist_literal, UNPROVIDED ) );
    return conclusion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 14825L)
  public static SubLObject residual_transformation_proof_proved_transformed_conjuncts(final SubLObject residual_transformation_proof, final SubLObject mt)
  {
    final SubLObject proved_transformed_conjunction = pph_proof.pph_proof_conclusion( inference_worker_residual_transformation.residual_transformation_proof_subproof( residual_transformation_proof ), mt );
    return cycl_utilities.formula_args( proved_transformed_conjunction, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 15134L)
  public static SubLObject pph_residual_transformation_proof_subproofs_for_conclusion(final SubLObject residual_transformation_proof, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject proved_conjunction = pph_proof.pph_proof_conclusion( residual_transformation_proof, mt );
    final SubLObject proved_conjuncts = cycl_utilities.formula_args( proved_conjunction, UNPROVIDED );
    final SubLObject proved_transformed_conjuncts = residual_transformation_proof_proved_transformed_conjuncts( residual_transformation_proof, mt );
    SubLObject remaining_conjuncts = conses_high.copy_list( proved_transformed_conjuncts );
    SubLObject supported_asents = NIL;
    SubLObject subproofs = NIL;
    SubLObject double_duty_subproofs = NIL;
    final SubLObject queue = queues.create_queue( UNPROVIDED );
    SubLObject cdolist_list_var = proved_conjuncts;
    SubLObject proved_conjunct = NIL;
    proved_conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject n = Sequences.position( proved_conjunct, remaining_conjuncts, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != n )
      {
        remaining_conjuncts = list_utilities.delete_nth( n, remaining_conjuncts );
        n = Sequences.position( proved_conjunct, remaining_conjuncts, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      proved_conjunct = cdolist_list_var.first();
    }
    queues.enqueue( inference_worker_residual_transformation.residual_transformation_proof_subproof( residual_transformation_proof ), queue );
    while ( NIL == queues.queue_empty_p( queue ) && NIL == list_utilities.empty_list_p( remaining_conjuncts ))
    {
      final SubLObject current_subproof = queues.dequeue( queue );
      SubLObject current_subproof_conclusion = NIL;
      if( NIL == inference_worker.structural_proof_p( current_subproof ) )
      {
        if( NIL != inference_worker_residual_transformation.residual_transformation_proof_p( current_subproof ) )
        {
          current_subproof_conclusion = pph_residual_transformation_proof_conclusion( current_subproof, mt );
        }
        else
        {
          current_subproof_conclusion = cycl_utilities.formula_arg2( inference_worker.proof_proven_sentence( current_subproof ), UNPROVIDED );
        }
      }
      if( NIL != subl_promotions.memberP( current_subproof_conclusion, remaining_conjuncts, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
        {
          format_nil.force_format( T, $str27$__Found_proof__S___of__S__, current_subproof, current_subproof_conclusion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != inference_worker_residual_transformation.residual_transformation_proof_p( current_subproof ) )
        {
          subproofs = list_utilities.add_to_end( current_subproof, subproofs );
        }
        else
        {
          subproofs = ConsesLow.cons( current_subproof, subproofs );
        }
        if( NIL != subl_promotions.memberP( current_subproof_conclusion, proved_conjuncts, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
          {
            format_nil.force_format( T, $str28$Found_double_duty_residiual_trans, current_subproof, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          double_duty_subproofs = ConsesLow.cons( current_subproof, double_duty_subproofs );
        }
        remaining_conjuncts = Sequences.remove( current_subproof_conclusion, remaining_conjuncts, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        supported_asents = ConsesLow.cons( current_subproof_conclusion, supported_asents );
      }
      else if( NIL != el_utilities.el_conjunction_p( current_subproof_conclusion ) && NIL != list_utilities.non_empty_list_p( conses_high.intersection( cycl_utilities.formula_args( current_subproof_conclusion,
          UNPROVIDED ), remaining_conjuncts, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) )
      {
        if( NIL != inference_worker_residual_transformation.residual_transformation_proof_p( current_subproof ) )
        {
          subproofs = list_utilities.add_to_end( current_subproof, subproofs );
        }
        else
        {
          subproofs = ConsesLow.cons( current_subproof, subproofs );
        }
        if( NIL != list_utilities.non_empty_list_p( conses_high.intersection( cycl_utilities.formula_args( current_subproof_conclusion, UNPROVIDED ), proved_conjuncts, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) )
        {
          if( NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
          {
            format_nil.force_format( T, $str29$Found_double_duty_conjunctive_rem, current_subproof, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          double_duty_subproofs = ConsesLow.cons( current_subproof, double_duty_subproofs );
        }
        final SubLObject items_var = conses_high.intersection( remaining_conjuncts, cycl_utilities.formula_args( current_subproof_conclusion, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
        if( items_var.isVector() )
        {
          final SubLObject vector_var = items_var;
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject item;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            item = Vectors.aref( vector_var, element_num );
            supported_asents = ConsesLow.cons( item, supported_asents );
          }
        }
        else
        {
          SubLObject cdolist_list_var2 = items_var;
          SubLObject item2 = NIL;
          item2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            supported_asents = ConsesLow.cons( item2, supported_asents );
            cdolist_list_var2 = cdolist_list_var2.rest();
            item2 = cdolist_list_var2.first();
          }
        }
        remaining_conjuncts = conses_high.set_difference( remaining_conjuncts, cycl_utilities.formula_args( current_subproof_conclusion, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
      SubLObject cdolist_list_var3 = inference_datastructures_proof.proof_direct_subproofs( current_subproof );
      SubLObject subproof = NIL;
      subproof = cdolist_list_var3.first();
      while ( NIL != cdolist_list_var3)
      {
        queues.enqueue( subproof, queue );
        cdolist_list_var3 = cdolist_list_var3.rest();
        subproof = cdolist_list_var3.first();
      }
    }
    if( NIL == list_utilities.empty_list_p( remaining_conjuncts ) && NIL != proof_view.$proof_view_debugP$.getDynamicValue( thread ) )
    {
      Errors.warn( $str30$Couldn_t_find_subproof_of____S___, residual_transformation_proof, remaining_conjuncts );
    }
    return Values.values( subproofs, double_duty_subproofs, supported_asents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/proof-view-residual.lisp", position = 18942L)
  public static SubLObject construct_inference_proof_view_int2(final SubLObject subproof, final SubLObject inference_answer, final SubLObject mt, final SubLObject proof_index_string, final SubLObject v_proof_view,
      final SubLObject parent_proof_view_entry, final SubLObject pph_relevance_safe_list)
  {
    return proof_view_populator.construct_inference_proof_view_int( subproof, inference_answer, mt, proof_index_string, v_proof_view, parent_proof_view_entry, pph_relevance_safe_list );
  }

  public static SubLObject declare_proof_view_residual_file()
  {
    SubLFiles.declareFunction( me, "proof_view_add_entries_for_residual_transformation_proof", "PROOF-VIEW-ADD-ENTRIES-FOR-RESIDUAL-TRANSFORMATION-PROOF", 7, 0, false );
    SubLFiles.declareFunction( me, "proof_view_suppress_proof_conclusionP", "PROOF-VIEW-SUPPRESS-PROOF-CONCLUSION?", 3, 0, false );
    SubLFiles.declareFunction( me, "proof_view_add_relocated_proof", "PROOF-VIEW-ADD-RELOCATED-PROOF", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_proof_relocated_p", "PROOF-VIEW-PROOF-RELOCATED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proof_view_get_relocated_proofs", "PROOF-VIEW-GET-RELOCATED-PROOFS", 0, 0, false );
    SubLFiles.declareFunction( me, "pick_residual_proof_subproof_attachment_point", "PICK-RESIDUAL-PROOF-SUBPROOF-ATTACHMENT-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "maybe_reconsider_parent_proof_view_entry", "MAYBE-RECONSIDER-PARENT-PROOF-VIEW-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_child_with_residual_transformation_dependent_proof", "PROOF-VIEW-CHILD-WITH-RESIDUAL-TRANSFORMATION-DEPENDENT-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "reconsider_residual_proof_subproof_attachment_point", "RECONSIDER-RESIDUAL-PROOF-SUBPROOF-ATTACHMENT-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "pick_residual_proof_subproof_attachment_point_internal", "PICK-RESIDUAL-PROOF-SUBPROOF-ATTACHMENT-POINT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "residual_transformation_proof_entry_good_fitP", "RESIDUAL-TRANSFORMATION-PROOF-ENTRY-GOOD-FIT?", 2, 0, false );
    SubLFiles.declareFunction( me, "proof_view_conjunctive_removal_proof_p", "PROOF-VIEW-CONJUNCTIVE-REMOVAL-PROOF-P", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_residual_transformation_proof_conclusion", "PPH-RESIDUAL-TRANSFORMATION-PROOF-CONCLUSION", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_residual_transformation_proof_non_focal_conclusion", "PPH-RESIDUAL-TRANSFORMATION-PROOF-NON-FOCAL-CONCLUSION", 1, 0, false );
    SubLFiles.declareFunction( me, "residual_transformation_proof_proved_transformed_conjuncts", "RESIDUAL-TRANSFORMATION-PROOF-PROVED-TRANSFORMED-CONJUNCTS", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_residual_transformation_proof_subproofs_for_conclusion", "PPH-RESIDUAL-TRANSFORMATION-PROOF-SUBPROOFS-FOR-CONCLUSION", 2, 0, false );
    SubLFiles.declareFunction( me, "construct_inference_proof_view_int2", "CONSTRUCT-INFERENCE-PROOF-VIEW-INT2", 7, 0, false );
    return NIL;
  }

  public static SubLObject init_proof_view_residual_file()
  {
    $proof_view_relocated_proofs$ = SubLFiles.defparameter( "*PROOF-VIEW-RELOCATED-PROOFS*", NIL );
    $residual_proof_view_recursion_depth$ = SubLFiles.defparameter( "*RESIDUAL-PROOF-VIEW-RECURSION-DEPTH*", ZERO_INTEGER );
    $residual_proof_view_check_fitP$ = SubLFiles.defparameter( "*RESIDUAL-PROOF-VIEW-CHECK-FIT?*", NIL );
    return NIL;
  }

  public static SubLObject setup_proof_view_residual_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_proof_view_residual_file();
  }

  @Override
  public void initializeVariables()
  {
    init_proof_view_residual_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_proof_view_residual_file();
  }
  static
  {
    me = new proof_view_residual();
    $proof_view_relocated_proofs$ = null;
    $residual_proof_view_recursion_depth$ = null;
    $residual_proof_view_check_fitP$ = null;
    $str0$__Residual_recursion_depth___D__ = makeString( "~&Residual recursion depth: ~D~%" );
    $str1$__Adding_residual_transformation_ = makeString( "~&Adding residual transformation entry for~% ~S~% under ~S~%" );
    $sym2$EL_SENTENCE_P = makeSymbol( "EL-SENTENCE-P" );
    $kw3$IRRELEVANT = makeKeyword( "IRRELEVANT" );
    $kw4$TRIVIAL = makeKeyword( "TRIVIAL" );
    $kw5$FN = makeKeyword( "FN" );
    $sym6$PROOF_VIEW_ADD_ENTRIES_FOR_RESIDUAL_TRANSFORMATION_PROOF = makeSymbol( "PROOF-VIEW-ADD-ENTRIES-FOR-RESIDUAL-TRANSFORMATION-PROOF" );
    $kw7$PROOF = makeKeyword( "PROOF" );
    $sym8$FORT_P = makeSymbol( "FORT-P" );
    $str9$__Adding_entry_for_subproof____S_ = makeString( "~&Adding entry for subproof~% ~S~% under ~S" );
    $str10$__Attaching_residual_subproof__S_ = makeString( "~&Attaching residual subproof ~S~% under ~S~%" );
    $sym11$_EXIT = makeSymbol( "%EXIT" );
    $str12$__Suppressing_proof_conclusion___ = makeString( "~&Suppressing proof-conclusion~% ~S~%" );
    $kw13$RESIDUAL_PROOF_ATTACHMENT_POINTS = makeKeyword( "RESIDUAL-PROOF-ATTACHMENT-POINTS" );
    $str14$__Reconsidering_placement_of__S__ = makeString( "~&Reconsidering placement of ~S~%" );
    $str15$__Found_lower_residual_transforma = makeString( "~&Found lower residual transformation entry ~S~%" );
    $str16$__Push_down____S___under__S___int = makeString( "~&Push down?? ~S~% under ~S~% into ~S~%" );
    $str17$__Reconsidered_point___S__ = makeString( "~&Reconsidered point: ~S~%" );
    $str18$__Picking_attachment_point_for__S = makeString( "~&Picking attachment point for ~S~% under ~S~%" );
    $str19$__Non_conjunction_parent_non_foca = makeString( "~&Non-conjunction parent non-focal conclusion:~% ~S~%" );
    $str20$__Couldn_t_find__S___in__S__ = makeString( "~&Couldn't find ~S~% in ~S~%" );
    $str21$__Placing__S___under__S__ = makeString( "~&Placing ~S~% under ~S~%" );
    $str22$__Highest_good_fit___S__ = makeString( "~&Highest good fit: ~S~%" );
    $str23$__Moving__S___up_under__S__ = makeString( "~&Moving ~S~% up under ~S~%" );
    $str24$__Assuming__S___fits_under__S__ = makeString( "~&Assuming ~S~% fits under ~S~%" );
    $str25$__Bad_fit___S___not_in__S__ = makeString( "~&Bad fit: ~S~% not in ~S~%" );
    $str26$__Good_fit___S___in__S__ = makeString( "~&Good fit: ~S~% in ~S~%" );
    $str27$__Found_proof__S___of__S__ = makeString( "~&Found proof ~S~% of ~S~%" );
    $str28$Found_double_duty_residiual_trans = makeString( "Found double-duty residiual transformation proof:~% ~S" );
    $str29$Found_double_duty_conjunctive_rem = makeString( "Found double-duty conjunctive removal proof:~% ~S" );
    $str30$Couldn_t_find_subproof_of____S___ = makeString( "Couldn't find subproof of~% ~S~% for ~S" );
  }
}
/*
 * 
 * Total time: 152 ms
 * 
 */