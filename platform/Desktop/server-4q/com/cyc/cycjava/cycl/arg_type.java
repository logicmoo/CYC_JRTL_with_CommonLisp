package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class arg_type
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.arg_type";
  public static final String myFingerPrint = "a2cc20e96c305bec09d5ce6083f739898b4e893fe0cb3e19cd976e2a2161b0af";
  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 6716L)
  private static SubLSymbol $relation_arg_ok_argnum$;
  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 8538L)
  private static SubLSymbol $cached_relation_arg_okP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 59094L)
  private static SubLSymbol $cached_format_okP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLSymbol $dtp_arg_constraint$;
  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 78389L)
  private static SubLSymbol $arg_constraint_struct_printing_verboseP$;
  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 82125L)
  private static SubLSymbol $sorted_arg_constraint_predicates_caching_state$;
  private static final SubLObject $const0$forAll;
  private static final SubLObject $const1$thereExists;
  private static final SubLSymbol $kw2$INHIBITED_SEQUENCE_VARIABLE;
  private static final SubLSymbol $sym3$CACHED_RELATION_ARG_OK_;
  private static final SubLSymbol $sym4$_CACHED_RELATION_ARG_OK__CACHING_STATE_;
  private static final SubLInteger $int5$1024;
  private static final SubLSymbol $sym6$CLEAR_CACHED_RELATION_ARG_OK_;
  private static final SubLList $list7;
  private static final SubLObject $const8$not;
  private static final SubLObject $const9$ist;
  private static final SubLObject $const10$termOfUnit;
  private static final SubLSymbol $sym11$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const12$EverythingPSC;
  private static final SubLSymbol $sym13$_EXIT;
  private static final SubLSymbol $kw14$WEAK_FORT;
  private static final SubLSymbol $kw15$NOT_ISA_DISJOINT;
  private static final SubLSymbol $kw16$NOT_QUOTED_ISA_DISJOINT;
  private static final SubLSymbol $kw17$NOT_ISA;
  private static final SubLSymbol $kw18$NOT_GENLS_DISJOINT;
  private static final SubLSymbol $kw19$GENLS;
  private static final SubLSymbol $kw20$NOT_GENLS;
  private static final SubLSymbol $kw21$GENL_ISA;
  private static final SubLSymbol $kw22$ISA_GENL;
  private static final SubLSymbol $kw23$DIFFERENT;
  private static final SubLSymbol $kw24$FORMAT;
  private static final SubLSymbol $sym25$POSSIBLY_NAUT_P;
  private static final SubLSymbol $kw26$NAUT;
  private static final SubLSymbol $sym27$VARIABLE_TERM_WRT_ARG_TYPE_;
  private static final SubLSymbol $kw28$ISA;
  private static final SubLSymbol $kw29$QUOTED_ISA;
  private static final SubLObject $const30$Collection;
  private static final SubLObject $const31$CollectionDenotingFunction;
  private static final SubLObject $const32$Thing;
  private static final SubLSymbol $kw33$OPAQUE;
  private static final SubLSymbol $kw34$STRONG_FORT;
  private static final SubLSymbol $sym35$INTEGERP;
  private static final SubLObject $const36$genls;
  private static final SubLObject $const37$Quote;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLString $str40$invalid_at_test__s_in_mal_intra_a;
  private static final SubLString $str41$invalid_at_test__s_in_mal_inter_a;
  private static final SubLSymbol $sym42$MEMOIZED_DEFINING_MTS_OK_;
  private static final SubLString $str43$__at_test_fails___s_in__s_fails__;
  private static final SubLSymbol $kw44$DEFINING_MT_VIOLATION;
  private static final SubLSymbol $kw45$ASYMMETRIC_PREDICATE;
  private static final SubLSymbol $kw46$ANTI_SYMMETRIC_PREDICATE;
  private static final SubLSymbol $kw47$IRREFLEXIVE_PREDICATE;
  private static final SubLSymbol $kw48$ANTI_TRANSITIVE_PREDICATE;
  private static final SubLSymbol $kw49$NEGATION_PREDS;
  private static final SubLSymbol $kw50$NEGATION_INVERSES;
  private static final SubLString $str51$unknown_predicate_constraint___s;
  private static final SubLObject $const52$isa;
  private static final SubLObject $const53$AsymmetricBinaryPredicate;
  private static final SubLSymbol $kw54$TRUE;
  private static final SubLList $list55;
  private static final SubLSymbol $kw56$AT_MAPPING_DONE;
  private static final SubLSymbol $kw57$PREDICATE_EXTENT;
  private static final SubLSymbol $sym58$SELECT_ASYMMETRIC_PRED_VIOLATION;
  private static final SubLSymbol $kw59$GAF_ARG;
  private static final SubLString $str60$Ignore_it;
  private static final SubLString $str61$Unexpected_index_type_when_gather;
  private static final SubLObject $const62$AntiSymmetricBinaryPredicate;
  private static final SubLObject $const63$IrreflexiveBinaryPredicate;
  private static final SubLSymbol $kw64$COMPLETES_CYCLE_;
  private static final SubLSymbol $kw65$WHY_COMPLETES_CYCLE_;
  private static final SubLObject $const66$TransitiveBinaryPredicate;
  private static final SubLObject $const67$AntiTransitiveBinaryPredicate;
  private static final SubLSymbol $sym68$SELECT_ANTI_TRANSITIVE_PRED_VIOLATION_VIA_PRED;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$SEARCH_FOR_ANTI_TRANSITIVE_PRED_VIOLATION;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$SELECT_ANTI_TRANSITIVE_PRED_VIOLATION;
  private static final SubLSymbol $sym74$UNREIFIED_SKOLEM_TERM_;
  private static final SubLSymbol $sym75$RELEVANT_PRED_IS_SPEC_PRED;
  private static final SubLSymbol $kw76$GAF;
  private static final SubLSymbol $kw77$OVERLAP;
  private static final SubLObject $const78$negationPreds;
  private static final SubLObject $const79$negationInverse;
  private static final SubLSymbol $sym80$CACHED_FORMAT_OK_;
  private static final SubLSymbol $sym81$_CACHED_FORMAT_OK__CACHING_STATE_;
  private static final SubLInteger $int82$128;
  private static final SubLSymbol $sym83$MEMOIZED_FORMAT_OK_;
  private static final SubLObject $const84$SingleEntry;
  private static final SubLObject $const85$IntervalEntry;
  private static final SubLObject $const86$SetTheFormat;
  private static final SubLObject $const87$singleEntryFormatInArgs;
  private static final SubLObject $const88$intervalEntryFormatInArgs;
  private static final SubLObject $const89$openEntryFormatInArgs;
  private static final SubLObject $const90$temporallyIntersectingEntryFormat;
  private static final SubLObject $const91$spatiallyIntersectingEntryFormatI;
  private static final SubLObject $const92$spatioTemporallyIntersectingEntry;
  private static final SubLString $str93$unknown_entry_format___s;
  private static final SubLObject $const94$IndeterminateTerm;
  private static final SubLObject $const95$natFunction;
  private static final SubLObject $const96$natArgument;
  private static final SubLSymbol $sym97$VARIABLE_P;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$ARG_CONSTRAINT;
  private static final SubLSymbol $sym100$ARG_CONSTRAINT_P;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLList $list103;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$PRINT_ARG_CONSTRAINT;
  private static final SubLSymbol $sym106$ARG_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$ARGCONST_SENTENCE;
  private static final SubLSymbol $sym109$_CSETF_ARGCONST_SENTENCE;
  private static final SubLSymbol $sym110$ARGCONST_MT;
  private static final SubLSymbol $sym111$_CSETF_ARGCONST_MT;
  private static final SubLSymbol $sym112$ARGCONST_TEST_FUNCTION;
  private static final SubLSymbol $sym113$_CSETF_ARGCONST_TEST_FUNCTION;
  private static final SubLSymbol $sym114$ARGCONST_TEST_ARGS;
  private static final SubLSymbol $sym115$_CSETF_ARGCONST_TEST_ARGS;
  private static final SubLSymbol $sym116$ARGCONST_CLOSED_;
  private static final SubLSymbol $sym117$_CSETF_ARGCONST_CLOSED_;
  private static final SubLSymbol $sym118$ARGCONST_ATOMIC_;
  private static final SubLSymbol $sym119$_CSETF_ARGCONST_ATOMIC_;
  private static final SubLSymbol $kw120$SENTENCE;
  private static final SubLSymbol $kw121$MT;
  private static final SubLSymbol $kw122$TEST_FUNCTION;
  private static final SubLSymbol $kw123$TEST_ARGS;
  private static final SubLSymbol $kw124$CLOSED_;
  private static final SubLSymbol $kw125$ATOMIC_;
  private static final SubLString $str126$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw127$BEGIN;
  private static final SubLSymbol $sym128$MAKE_ARG_CONSTRAINT;
  private static final SubLSymbol $kw129$SLOT;
  private static final SubLSymbol $kw130$END;
  private static final SubLSymbol $sym131$VISIT_DEFSTRUCT_OBJECT_ARG_CONSTRAINT_METHOD;
  private static final SubLString $str132$__a_ARG_CONSTRAINT__a__a__a__a_;
  private static final SubLString $str133$_ARG_CONSTRAINT__a__a_;
  private static final SubLString $str134$GAF;
  private static final SubLString $str135$GNAF;
  private static final SubLString $str136$OAF;
  private static final SubLString $str137$ONAF;
  private static final SubLSymbol $kw138$UNKNOWN;
  private static final SubLSymbol $sym139$ISA_;
  private static final SubLSymbol $sym140$GENLS_;
  private static final SubLSymbol $sym141$SORTED_ARG_CONSTRAINT_PREDICATES;
  private static final SubLList $list142;
  private static final SubLObject $const143$ArgTypePredicate;
  private static final SubLSymbol $sym144$NO_PREDICATE_EXTENT_P;
  private static final SubLObject $const145$ArgConstraintPredicate;
  private static final SubLSymbol $sym146$_SORTED_ARG_CONSTRAINT_PREDICATES_CACHING_STATE_;
  private static final SubLSymbol $kw147$IGNORE;
  private static final SubLSymbol $sym148$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym149$LISTP;
  private static final SubLObject $const150$Relation;
  private static final SubLObject $const151$argIsa;
  private static final SubLObject $const152$argGenl;

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 1315L)
  public static SubLObject at_gaf_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertions_high.gaf_assertionP( assertion ) && NIL == assertion_utilities.excepted_assertionP( assertion, NIL, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 1769L)
  public static SubLObject formula_args_ok_wrt_typeP(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != el_utilities.mt_designating_literalP( formula ) )
    {
      return mt_literal_args_ok_wrt_typeP( formula, mt );
    }
    return formula_args_ok_wrt_type_intP( formula, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 2015L)
  public static SubLObject why_not_formula_args_ok_wrt_typeP(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    wff.reset_wff_state();
    final SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding( thread );
    final SubLObject _prev_bind_2 = wff_vars.$wff_original_formula$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$noting_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_vars.$noting_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = wff_vars.$accumulating_wff_violationsP$.currentBinding( thread );
    try
    {
      wff_vars.$wff_formula$.bind( formula, thread );
      wff_vars.$wff_original_formula$.bind( ( NIL != wff_macros.within_wffP() && NIL != wff_vars.wff_original_formula() ) ? wff_vars.wff_original_formula() : formula, thread );
      at_vars.$noting_at_violationsP$.bind( T, thread );
      at_vars.$accumulating_at_violationsP$.bind( T, thread );
      wff_vars.$noting_wff_violationsP$.bind( T, thread );
      wff_vars.$accumulating_wff_violationsP$.bind( T, thread );
      formula_args_ok_wrt_typeP( formula, mt );
    }
    finally
    {
      wff_vars.$accumulating_wff_violationsP$.rebind( _prev_bind_6, thread );
      wff_vars.$noting_wff_violationsP$.rebind( _prev_bind_5, thread );
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_4, thread );
      at_vars.$noting_at_violationsP$.rebind( _prev_bind_3, thread );
      wff_vars.$wff_original_formula$.rebind( _prev_bind_2, thread );
      wff_vars.$wff_formula$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( at_vars.$at_violations$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 2253L)
  public static SubLObject mt_literal_args_ok_wrt_typeP(final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_arg = cycl_utilities.reify_when_closed_naut( el_utilities.designated_mt( literal ) );
    if( NIL != hlmt.hlmtP( mt_arg ) )
    {
      return formula_args_ok_wrt_type_intP( literal, mt_arg );
    }
    if( NIL == cycl_variables.cyc_varP( mt_arg ) )
    {
      return formula_args_ok_wrt_type_intP( literal, mt );
    }
    if( NIL != control_vars.within_askP() )
    {
      return T;
    }
    if( NIL != control_vars.within_assertP() )
    {
      return formula_args_ok_wrt_type_intP( literal, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    }
    return formula_args_ok_wrt_type_intP( literal, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 3121L)
  public static SubLObject seqvars_inhibited_by_relation_expression(final SubLObject relation)
  {
    if( NIL != el_utilities.scoping_relation_expressionP( relation ) && NIL == el_utilities.el_formula_with_operator_p( relation, $const0$forAll ) && NIL == el_utilities.el_formula_with_operator_p( relation,
        $const1$thereExists ) )
    {
      return el_utilities.scoped_vars( relation, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 3534L)
  public static SubLObject new_inhibited_seqvars(final SubLObject relation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.append( czer_vars.$variables_that_cannot_be_sequence_variables$.getDynamicValue( thread ), seqvars_inhibited_by_relation_expression( relation ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 3831L)
  public static SubLObject at_considering_atomic_sentence_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == at_vars.$appraising_disjunctP$.getDynamicValue( thread ) && NIL == at_vars.$within_functionP$.getDynamicValue( thread ) && NIL == at_vars.$within_predicateP$.getDynamicValue( thread )
        && NIL == czer_utilities.within_negationP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 3987L)
  public static SubLObject formula_args_ok_wrt_type_intP(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject args = cycl_utilities.formula_args( formula, UNPROVIDED );
    final SubLObject seqvar = el_utilities.sequence_var( formula, UNPROVIDED );
    SubLObject okP = T;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = at_vars.$fag_search_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_argnum$.currentBinding( thread );
    try
    {
      at_vars.$fag_search_limit$.bind( at_vars.$at_gaf_search_limit$.getDynamicValue( thread ), thread );
      at_vars.$at_argnum$.bind( ZERO_INTEGER, thread );
      final SubLObject groundP = Types.sublisp_null( el_utilities.sentence_free_variables( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      final SubLObject _prev_bind_0_$1 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
      final SubLObject _prev_bind_1_$2 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = at_vars.$at_formula$.currentBinding( thread );
      final SubLObject _prev_bind_4 = at_vars.$at_reln$.currentBinding( thread );
      final SubLObject _prev_bind_5 = czer_vars.$variables_that_cannot_be_sequence_variables$.currentBinding( thread );
      try
      {
        at_vars.$at_check_arg_formatP$.bind( ( NIL != at_vars.$at_check_arg_formatP$.getDynamicValue( thread ) ) ? ( ( NIL != at_vars.$appraising_disjunctP$.getDynamicValue( thread ) || NIL != at_vars.$within_functionP$
            .getDynamicValue( thread ) || NIL != at_vars.$within_predicateP$.getDynamicValue( thread ) || NIL != czer_utilities.within_negationP() ) ? NIL : groundP ) : NIL, thread );
        at_vars.$at_check_relator_constraintsP$.bind( ( NIL != at_vars.$at_check_relator_constraintsP$.getDynamicValue( thread ) ) ? ( ( NIL != at_vars.$appraising_disjunctP$.getDynamicValue( thread )
            || NIL != at_vars.$within_functionP$.getDynamicValue( thread ) || NIL != at_vars.$within_predicateP$.getDynamicValue( thread ) || NIL != czer_utilities.within_negationP() ) ? NIL : groundP ) : NIL, thread );
        at_vars.$at_formula$.bind( formula, thread );
        at_vars.$at_reln$.bind( cycl_utilities.reify_when_closed_naut( cycl_utilities.formula_arg0( formula ) ), thread );
        czer_vars.$variables_that_cannot_be_sequence_variables$.bind( new_inhibited_seqvars( formula ), thread );
        if( NIL != subl_promotions.memberP( seqvar, czer_vars.$variables_that_cannot_be_sequence_variables$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
        {
          wff.note_wff_violation( ConsesLow.list( $kw2$INHIBITED_SEQUENCE_VARIABLE, seqvar, formula ) );
          okP = NIL;
        }
        if( NIL != forts.fort_p( at_vars.$at_reln$.getDynamicValue( thread ) ) )
        {
          okP = makeBoolean( NIL != defining_mts_okP( at_vars.$at_reln$.getDynamicValue( thread ), mt ) && NIL != relator_constraints_okP( formula, UNPROVIDED ) && NIL != okP );
          doneP = at_utilities.at_finishedP( makeBoolean( NIL == okP ) );
          final SubLObject _prev_bind_0_$2 = czer_vars.$distributing_meta_knowledgeP$.currentBinding( thread );
          try
          {
            czer_vars.$distributing_meta_knowledgeP$.bind( czer_utilities.distributing_meta_predP( at_vars.$at_reln$.getDynamicValue( thread ) ), thread );
            if( NIL == doneP )
            {
              SubLObject csome_list_var = args;
              SubLObject arg = NIL;
              arg = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                at_vars.$at_argnum$.setDynamicValue( Numbers.add( at_vars.$at_argnum$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                final SubLObject _prev_bind_0_$3 = czer_vars.$within_negationP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$3 = at_vars.$within_functionP$.currentBinding( thread );
                final SubLObject _prev_bind_2_$6 = at_vars.$within_predicateP$.currentBinding( thread );
                final SubLObject _prev_bind_3_$7 = at_vars.$within_disjunctionP$.currentBinding( thread );
                final SubLObject _prev_bind_4_$8 = wff_utilities.$check_arityP$.currentBinding( thread );
                final SubLObject _prev_bind_6 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
                final SubLObject _prev_bind_7 = at_vars.$at_check_defining_mtsP$.currentBinding( thread );
                final SubLObject _prev_bind_8 = at_vars.$appraising_disjunctP$.currentBinding( thread );
                final SubLObject _prev_bind_9 = at_vars.$within_decontextualizedP$.currentBinding( thread );
                try
                {
                  czer_vars.$within_negationP$.bind( at_within_negationP( at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ) ), thread );
                  at_vars.$within_functionP$.bind( at_within_functionP( at_vars.$at_reln$.getDynamicValue( thread ) ), thread );
                  at_vars.$within_predicateP$.bind( at_within_predicateP( at_vars.$at_reln$.getDynamicValue( thread ) ), thread );
                  at_vars.$within_disjunctionP$.bind( at_within_disjunctP( formula, at_vars.$at_argnum$.getDynamicValue( thread ) ), thread );
                  wff_utilities.$check_arityP$.bind( wff.check_arityP( at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ) ), thread );
                  at_vars.$at_check_arg_typesP$.bind( at_check_arg_typesP( at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue( thread ), mt ), thread );
                  at_vars.$at_check_defining_mtsP$.bind( at_check_defining_mtsP( formula, at_vars.$at_argnum$.getDynamicValue( thread ) ), thread );
                  at_vars.$appraising_disjunctP$.bind( appraising_disjunctP( formula, mt ), thread );
                  at_vars.$within_decontextualizedP$.bind( at_within_decontextualizedP( formula ), thread );
                  okP = makeBoolean( NIL != relation_arg_okP( at_vars.$at_reln$.getDynamicValue( thread ), arg, at_vars.$at_argnum$.getDynamicValue( thread ), at_utilities.arg_type_mt( at_vars.$at_reln$.getDynamicValue(
                      thread ), args, at_vars.$at_argnum$.getDynamicValue( thread ), mt ) ) && NIL != okP );
                }
                finally
                {
                  at_vars.$within_decontextualizedP$.rebind( _prev_bind_9, thread );
                  at_vars.$appraising_disjunctP$.rebind( _prev_bind_8, thread );
                  at_vars.$at_check_defining_mtsP$.rebind( _prev_bind_7, thread );
                  at_vars.$at_check_arg_typesP$.rebind( _prev_bind_6, thread );
                  wff_utilities.$check_arityP$.rebind( _prev_bind_4_$8, thread );
                  at_vars.$within_disjunctionP$.rebind( _prev_bind_3_$7, thread );
                  at_vars.$within_predicateP$.rebind( _prev_bind_2_$6, thread );
                  at_vars.$within_functionP$.rebind( _prev_bind_1_$3, thread );
                  czer_vars.$within_negationP$.rebind( _prev_bind_0_$3, thread );
                }
                doneP = at_utilities.at_finishedP( makeBoolean( NIL == okP ) );
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
              }
            }
          }
          finally
          {
            czer_vars.$distributing_meta_knowledgeP$.rebind( _prev_bind_0_$2, thread );
          }
        }
      }
      finally
      {
        czer_vars.$variables_that_cannot_be_sequence_variables$.rebind( _prev_bind_5, thread );
        at_vars.$at_reln$.rebind( _prev_bind_4, thread );
        at_vars.$at_formula$.rebind( _prev_bind_3, thread );
        at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_1_$2, thread );
        at_vars.$at_check_arg_formatP$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      at_vars.$at_argnum$.rebind( _prev_bind_2, thread );
      at_vars.$fag_search_limit$.rebind( _prev_bind_0, thread );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 6859L)
  public static SubLObject relation_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != wff_macros.within_wffP() && NIL != fort_types_interface.logical_connective_p( relation ) )
    {
      return T;
    }
    SubLObject okP = NIL;
    final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = wff_vars.$permit_generic_arg_variablesP$.currentBinding( thread );
    try
    {
      wff_vars.$permit_keyword_variablesP$.bind( makeBoolean( NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue( thread ) || NIL != czer_utilities.arg_permits_keyword_variablesP( relation, argnum, mt ) ),
          thread );
      wff_vars.$permit_generic_arg_variablesP$.bind( makeBoolean( NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue( thread ) || NIL != czer_utilities.arg_permits_generic_arg_variablesP( relation, argnum,
          mt ) ), thread );
      if( NIL != variable_wrt_arg_typeP( arg ) )
      {
        okP = variable_arg_okP( relation, arg, argnum, mt );
      }
      if( NIL == okP )
      {
        okP = relation_arg_ok_intP( relation, arg, argnum, mt );
      }
    }
    finally
    {
      wff_vars.$permit_generic_arg_variablesP$.rebind( _prev_bind_2, thread );
      wff_vars.$permit_keyword_variablesP$.rebind( _prev_bind_0, thread );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 8538L)
  public static SubLObject clear_cached_relation_arg_okP()
  {
    final SubLObject cs = $cached_relation_arg_okP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 8538L)
  public static SubLObject remove_cached_relation_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt, final SubLObject mt_info, final SubLObject at_parameter_state)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_relation_arg_okP_caching_state$.getGlobalValue(), ConsesLow.list( relation, arg, argnum, mt, mt_info, at_parameter_state ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 8538L)
  public static SubLObject cached_relation_arg_okP_internal(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt, final SubLObject mt_info, final SubLObject at_parameter_state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return relation_arg_ok_intP( relation, arg, $relation_arg_ok_argnum$.getDynamicValue( thread ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 8538L)
  public static SubLObject cached_relation_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt, final SubLObject mt_info, final SubLObject at_parameter_state)
  {
    SubLObject caching_state = $cached_relation_arg_okP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym3$CACHED_RELATION_ARG_OK_, $sym4$_CACHED_RELATION_ARG_OK__CACHING_STATE_, $int5$1024, EQUAL, SIX_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym6$CLEAR_CACHED_RELATION_ARG_OK_ );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_6( relation, arg, argnum, mt, mt_info, at_parameter_state );
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
        if( relation.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( arg.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( argnum.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( mt_info.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( NIL != cached_args && NIL == cached_args.rest() && at_parameter_state.equal( cached_args.first() ) )
                  {
                    return memoization_state.caching_results( results2 );
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_relation_arg_okP_internal( relation, arg, argnum, mt, mt_info, at_parameter_state ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( relation, arg, argnum, mt, mt_info, at_parameter_state ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 9380L)
  public static SubLObject relation_arg_ok_intP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_reln$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$at_argnum$.currentBinding( thread );
    try
    {
      at_vars.$at_reln$.bind( relation, thread );
      at_vars.$at_arg$.bind( arg, thread );
      at_vars.$at_argnum$.bind( argnum, thread );
      okP = defining_mts_okP( arg, mt );
      if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == okP ) ) )
      {
        if( NIL != list_utilities.member_kbeqP( relation, $list7 ) )
        {
          okP = T;
        }
        else if( NIL != tou_wrt_arg_typeP( arg ) )
        {
          okP = makeBoolean( NIL != tou_arg_okP( arg, argnum ) && NIL != okP );
        }
        else if( NIL != weak_fort_wrt_arg_typeP( arg ) )
        {
          okP = makeBoolean( NIL != weak_fort_arg_okP( relation, arg, argnum, mt ) && NIL != okP );
        }
        else if( NIL != lenient_fort_wrt_arg_typeP( arg ) )
        {
          okP = makeBoolean( NIL != lenient_fort_arg_okP( relation, arg, argnum, mt ) && NIL != okP );
        }
        else if( NIL != nat_function_wrt_arg_typeP( arg ) )
        {
          okP = makeBoolean( NIL != nat_function_arg_okP( arg, argnum ) && NIL != okP );
        }
        else if( NIL != nat_argument_wrt_arg_typeP( arg ) )
        {
          okP = makeBoolean( NIL != nat_argument_arg_okP( arg, argnum ) && NIL != okP );
        }
        else if( NIL != naut_wrt_arg_typeP( arg, mt ) )
        {
          okP = makeBoolean( NIL != naut_arg_okP( relation, arg, argnum, mt ) && NIL != okP );
        }
        else if( NIL != strong_fort_wrt_arg_typeP( arg, UNPROVIDED ) )
        {
          okP = makeBoolean( NIL != strong_fort_arg_okP( relation, arg, argnum, mt ) && NIL != okP );
        }
        else
        {
          okP = makeBoolean( NIL != opaque_arg_okP( relation, arg, argnum, mt ) && NIL != okP );
        }
      }
    }
    finally
    {
      at_vars.$at_argnum$.rebind( _prev_bind_3, thread );
      at_vars.$at_arg$.rebind( _prev_bind_2, thread );
      at_vars.$at_reln$.rebind( _prev_bind_0, thread );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 10843L)
  public static SubLObject at_within_negationP(final SubLObject formula_arg0, final SubLObject arg)
  {
    return ( formula_arg0.eql( $const8$not ) || ( NIL != at_utilities.implication_opP( formula_arg0 ) && arg.eql( ONE_INTEGER ) ) ) ? makeBoolean( NIL == czer_utilities.within_negationP() )
        : czer_utilities.within_negationP();
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 11095L)
  public static SubLObject at_within_predicateP(final SubLObject formula_arg0)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $const9$ist.eql( formula_arg0 ) )
    {
      return NIL;
    }
    return makeBoolean( NIL != at_vars.$within_predicateP$.getDynamicValue( thread ) || NIL != el_utilities.predicate_specP( formula_arg0, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 11374L)
  public static SubLObject at_within_functionP(SubLObject formula_arg0)
  {
    if( formula_arg0 == UNPROVIDED )
    {
      formula_arg0 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != at_vars.$within_functionP$.getDynamicValue( thread ) || NIL != fort_types_interface.functorP( formula_arg0 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 11534L)
  public static SubLObject at_check_arg_typesP(SubLObject relation, SubLObject argnum, SubLObject mt)
  {
    if( relation == UNPROVIDED )
    {
      relation = NIL;
    }
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != at_vars.$at_check_arg_typesP$.getDynamicValue( thread ) && ( NIL == czer_utilities.expression_argP( relation, argnum, mt ) || NIL == czer_utilities.askable_expression_argP( relation,
        argnum, mt ) || NIL != czer_utilities.assertible_expression_argP( relation, argnum, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 11908L)
  public static SubLObject at_check_defining_mtsP(final SubLObject formula, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$at_possibly_check_defining_mtsP$.getDynamicValue( thread ) && NIL != at_vars.at_check_arg_types_p() )
    {
      final SubLObject relation = cycl_utilities.formula_arg0( formula );
      if( NIL == forts.fort_p( relation ) )
      {
        return T;
      }
      if( NIL == kb_accessors.quoted_argumentP( relation, argnum ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 12479L)
  public static SubLObject appraising_disjunctP(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$relax_arg_constraints_for_disjunctionsP$.getDynamicValue( thread ) && NIL == czer_utilities.reifiable_function_termP( formula, mt ) )
    {
      return makeBoolean( NIL != at_vars.$appraising_disjunctP$.getDynamicValue( thread ) || NIL != czer_utilities.within_disjunctionP() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 12798L)
  public static SubLObject at_within_disjunctP(final SubLObject formula, final SubLObject argnum)
  {
    return makeBoolean( NIL != czer_utilities.within_disjunctionP() || ( NIL != el_utilities.formula_arityGE( formula, TWO_INTEGER, UNPROVIDED ) && NIL != ( ( NIL != czer_utilities.within_negationP() ) ? makeBoolean(
        NIL != el_utilities.el_conjunction_p( formula ) || ( NIL != el_utilities.el_implication_p( formula ) && argnum.eql( ONE_INTEGER ) ) )
        : makeBoolean( NIL != el_utilities.el_disjunction_p( formula ) || NIL != el_utilities.el_implication_p( formula ) || NIL != el_utilities.holds_in_litP( formula ) || NIL != el_utilities.el_exception_p(
            formula ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 13220L)
  public static SubLObject appraising_disjunct_cnfP(final SubLObject cnf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$relax_arg_constraints_for_disjunctionsP$.getDynamicValue( thread ) )
    {
      return makeBoolean( NIL != at_vars.$appraising_disjunctP$.getDynamicValue( thread ) || ( NIL != clauses.pos_lits( cnf ) && NIL != clauses.neg_lits( cnf ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 13438L)
  public static SubLObject at_within_decontextualizedP(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != at_vars.$within_decontextualizedP$.getDynamicValue( thread ) || NIL != kb_accessors.decontextualized_literalP( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 13577L)
  public static SubLObject variable_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( relation.eql( $const10$termOfUnit ) )
    {
      return tou_arg_okP( arg, argnum );
    }
    if( NIL == term.first_order_nautP( arg ) || NIL != term.unreified_skolem_termP( arg ) )
    {
      return T;
    }
    if( NIL != naut_arg_okP( relation, arg, argnum, mt ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 14213L)
  public static SubLObject weak_fort_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return weak_fort_types_okP( relation, arg, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 14337L)
  public static SubLObject lenient_fort_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return lenient_fort_types_okP( relation, arg, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 14467L)
  public static SubLObject naut_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt)
  {
    SubLObject okP = naut_functor_okP( arg, mt );
    if( NIL != okP )
    {
      okP = naut_args_okP( arg, mt );
    }
    else if( NIL == at_utilities.at_finishedP( T ) )
    {
      naut_args_okP( arg, mt );
    }
    if( NIL != okP )
    {
      okP = naut_arg_types_okP( relation, arg, argnum, mt );
    }
    else if( NIL == at_utilities.at_finishedP( T ) )
    {
      naut_arg_types_okP( relation, arg, argnum, mt );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 15026L)
  public static SubLObject at_nat_okP(final SubLObject nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject okP = nat_functor_okP( nat, mt );
    if( NIL != okP )
    {
      okP = nat_args_okP( nat, mt );
    }
    else if( NIL == at_utilities.at_finishedP( T ) )
    {
      nat_args_okP( nat, mt );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 15283L)
  public static SubLObject nat_functor_okP(final SubLObject nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != nart_handles.nart_p( nat ) )
    {
      return naut_functor_okP( narts_high.nart_hl_formula( nat ), mt );
    }
    return naut_functor_okP( nat, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 15467L)
  public static SubLObject nat_args_okP(final SubLObject nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != nart_handles.nart_p( nat ) )
    {
      return naut_args_okP( narts_high.nart_hl_formula( nat ), mt );
    }
    return naut_args_okP( nat, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 15628L)
  public static SubLObject nart_or_reify_forward_nautP(final SubLObject v_object, final SubLObject mt)
  {
    return makeBoolean( NIL != nart_handles.nart_p( v_object ) || ( NIL != kb_control_vars.within_forward_inferenceP() && NIL != el_utilities.possibly_naut_p( v_object ) && NIL != kb_accessors.skolemize_forwardP(
        cycl_utilities.nat_functor( v_object ), mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 15861L)
  public static SubLObject tou_arg_okP(final SubLObject nat, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( argnum.eql( ONE_INTEGER ) )
    {
      if( NIL != nart_handles.nart_p( nat ) )
      {
        return T;
      }
      if( NIL != cycl_variables.cyc_varP( nat ) )
      {
        return makeBoolean( NIL != control_vars.within_askP() || NIL != czer_utilities.within_disjunctionP() || NIL != at_vars.$appraising_disjunctP$.getDynamicValue( thread ) );
      }
      if( NIL != term.nautP( nat, UNPROVIDED ) )
      {
        return tou_naut_okP( nat );
      }
    }
    else if( argnum.eql( TWO_INTEGER ) )
    {
      if( NIL != term.nautP( nat, UNPROVIDED ) )
      {
        return tou_naut_okP( nat );
      }
      if( NIL != cycl_variables.cyc_varP( nat ) )
      {
        return makeBoolean( NIL != control_vars.within_askP() || NIL != czer_utilities.within_disjunctionP() || NIL != at_vars.$appraising_disjunctP$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 16291L)
  public static SubLObject nat_function_arg_okP(final SubLObject arg, final SubLObject argnum)
  {
    if( argnum.eql( ONE_INTEGER ) )
    {
      if( NIL != nart_handles.nart_p( arg ) )
      {
        return T;
      }
      if( NIL != cycl_variables.cyc_varP( arg ) )
      {
        return T;
      }
      if( NIL != term.nautP( arg, UNPROVIDED ) )
      {
        return tou_naut_okP( arg );
      }
    }
    else if( argnum.eql( TWO_INTEGER ) )
    {
      if( NIL != cycl_variables.cyc_varP( arg ) )
      {
        return T;
      }
      if( NIL != czer_utilities.reifiable_functorP( arg, UNPROVIDED ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 16600L)
  public static SubLObject nat_argument_arg_okP(final SubLObject arg, final SubLObject argnum)
  {
    if( argnum.eql( ONE_INTEGER ) )
    {
      if( NIL != nart_handles.nart_p( arg ) )
      {
        return T;
      }
      if( NIL != cycl_variables.cyc_varP( arg ) )
      {
        return T;
      }
      if( NIL != term.nautP( arg, UNPROVIDED ) )
      {
        return tou_naut_okP( arg );
      }
    }
    else
    {
      if( argnum.eql( TWO_INTEGER ) )
      {
        return collection_defns.cyc_non_negative_integer( arg );
      }
      if( argnum.eql( THREE_INTEGER ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 16883L)
  public static SubLObject tou_naut_okP(final SubLObject naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject functor = cycl_utilities.nat_functor( naut );
    SubLObject okP = cycl_variables.cyc_varP( functor );
    if( NIL == okP )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
        okP = czer_utilities.reifiable_functorP( cycl_utilities.nat_functor( naut ), UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 17097L)
  public static SubLObject strong_fort_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt)
  {
    return strong_fort_arg_types_okP( relation, arg, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 17391L)
  public static SubLObject opaque_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt)
  {
    return opaque_arg_types_okP( relation, arg, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 17732L)
  public static SubLObject naut_functor_okP(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.function_termP( naut ) )
    {
      final SubLObject okP = T;
      final SubLObject functor = cycl_utilities.nat_functor( naut );
      if( NIL != at_vars.$at_check_fn_symbolP$.getDynamicValue( thread ) )
      {
        if( NIL != forts.fort_p( functor ) )
        {
          return T;
        }
        if( NIL != term.nautP( functor, UNPROVIDED ) )
        {
          return makeBoolean( NIL != naut_functor_okP( functor, mt ) && NIL != naut_args_okP( functor, mt ) );
        }
      }
      return okP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 18215L)
  public static SubLObject naut_args_okP(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != term.function_termP( naut ) )
    {
      return naut_args_ok_wrt_typeP( naut, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 18344L)
  public static SubLObject naut_args_ok_wrt_typeP(final SubLObject naut, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == at_vars.at_check_arg_types_p() )
    {
      return T;
    }
    if( NIL != term.function_termP( naut ) )
    {
      SubLObject okP = NIL;
      final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding( thread );
      try
      {
        wff_vars.$recognize_variablesP$.bind( T, thread );
        okP = formula_args_ok_wrt_typeP( naut, mt );
      }
      finally
      {
        wff_vars.$recognize_variablesP$.rebind( _prev_bind_0, thread );
      }
      return okP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 18683L)
  public static SubLObject weak_fort_types_okP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    try
    {
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      return lenient_fort_types_okP( reln, arg, argnum, mt );
    }
    finally
    {
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 18887L)
  public static SubLObject lenient_fort_types_okP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject isa_okP = makeBoolean( NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue( thread ) );
    SubLObject quoted_isa_okP = makeBoolean( NIL == at_vars.$at_check_not_quoted_isa_disjointP$.getDynamicValue( thread ) );
    SubLObject not_isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue( thread ) );
    SubLObject genls_okP = makeBoolean( NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue( thread ) );
    SubLObject not_genls_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue( thread ) );
    SubLObject genl_isa_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue( thread ) );
    SubLObject isa_genl_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue( thread ) );
    SubLObject different_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue( thread ) );
    SubLObject format_okP = makeBoolean( NIL == at_vars.$at_check_arg_formatP$.getDynamicValue( thread ) );
    final SubLObject nat = ( NIL != el_utilities.arg_types_prescribe_unreifiedP( reln, argnum ) ) ? NIL : cycl_utilities.find_closed_naut( arg );
    final SubLObject admit_consistent_fortP = makeBoolean( NIL != wff_vars.wff_lenientP() || ( NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue( thread ) && NIL != nart_handles.nart_p( arg ) ) );
    if( NIL != nart_handles.nart_p( nat ) )
    {
      return relation_arg_okP( reln, nat, argnum, mt );
    }
    if( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP || NIL == different_okP || NIL == format_okP )
    {
      final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding( thread );
      try
      {
        at_vars.$noting_at_violationsP$.bind( NIL, thread );
        at_vars.$accumulating_at_violationsP$.bind( NIL, thread );
        wff_vars.$noting_wff_violationsP$.bind( NIL, thread );
        wff_vars.$accumulating_wff_violationsP$.bind( NIL, thread );
        if( NIL != strong_fort_arg_types_okP( reln, arg, argnum, mt ) )
        {
          return T;
        }
      }
      finally
      {
        wff_vars.$accumulating_wff_violationsP$.rebind( _prev_bind_4, thread );
        wff_vars.$noting_wff_violationsP$.rebind( _prev_bind_3, thread );
        at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_2, thread );
        at_vars.$noting_at_violationsP$.rebind( _prev_bind_0, thread );
      }
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_7 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      final SubLObject _prev_bind_8 = at_vars.$at_arg_type$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        at_vars.$at_arg_type$.bind( $kw14$WEAK_FORT, thread );
        if( NIL == isa_okP )
        {
          if( NIL != admit_consistent_fortP || NIL != isa.isa( arg, mt, UNPROVIDED ) )
          {
            isa_okP = arg_test_okP( reln, arg, argnum, $kw15$NOT_ISA_DISJOINT );
          }
          else
          {
            final SubLObject _prev_bind_0_$9 = at_vars.$at_check_arg_quoted_isaP$.currentBinding( thread );
            final SubLObject _prev_bind_1_$10 = at_vars.$at_check_arg_genlsP$.currentBinding( thread );
            final SubLObject _prev_bind_2_$11 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
            try
            {
              at_vars.$at_check_arg_quoted_isaP$.bind( NIL, thread );
              at_vars.$at_check_arg_genlsP$.bind( NIL, thread );
              at_vars.$at_check_arg_formatP$.bind( NIL, thread );
              isa_okP = opaque_arg_types_okP( reln, arg, argnum, mt );
            }
            finally
            {
              at_vars.$at_check_arg_formatP$.rebind( _prev_bind_2_$11, thread );
              at_vars.$at_check_arg_genlsP$.rebind( _prev_bind_1_$10, thread );
              at_vars.$at_check_arg_quoted_isaP$.rebind( _prev_bind_0_$9, thread );
            }
          }
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP ) ) && NIL == quoted_isa_okP )
        {
          if( NIL != admit_consistent_fortP || NIL != isa.quoted_isa( arg, mt, UNPROVIDED ) )
          {
            quoted_isa_okP = arg_test_okP( reln, arg, argnum, $kw16$NOT_QUOTED_ISA_DISJOINT );
          }
          else
          {
            final SubLObject _prev_bind_0_$10 = at_vars.$at_check_arg_isaP$.currentBinding( thread );
            final SubLObject _prev_bind_1_$11 = at_vars.$at_check_arg_genlsP$.currentBinding( thread );
            final SubLObject _prev_bind_2_$12 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
            try
            {
              at_vars.$at_check_arg_isaP$.bind( NIL, thread );
              at_vars.$at_check_arg_genlsP$.bind( NIL, thread );
              at_vars.$at_check_arg_formatP$.bind( NIL, thread );
              quoted_isa_okP = opaque_arg_types_okP( reln, arg, argnum, mt );
            }
            finally
            {
              at_vars.$at_check_arg_formatP$.rebind( _prev_bind_2_$12, thread );
              at_vars.$at_check_arg_genlsP$.rebind( _prev_bind_1_$11, thread );
              at_vars.$at_check_arg_isaP$.rebind( _prev_bind_0_$10, thread );
            }
          }
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP ) ) && NIL == not_isa_okP )
        {
          not_isa_okP = arg_test_okP( reln, arg, argnum, $kw17$NOT_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP ) ) && NIL == genls_okP )
        {
          if( NIL != admit_consistent_fortP || NIL != genls.genls( arg, mt, UNPROVIDED ) )
          {
            genls_okP = arg_test_okP( reln, arg, argnum, $kw18$NOT_GENLS_DISJOINT );
          }
          else
          {
            genls_okP = arg_test_okP( reln, arg, argnum, $kw19$GENLS );
          }
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP ) ) && NIL == not_genls_okP )
        {
          not_genls_okP = arg_test_okP( reln, arg, argnum, $kw20$NOT_GENLS );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP ) ) && NIL == genl_isa_okP )
        {
          genl_isa_okP = arg_test_okP( reln, arg, argnum, $kw21$GENL_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP ) ) && NIL == isa_genl_okP )
        {
          isa_genl_okP = arg_test_okP( reln, arg, argnum, $kw22$ISA_GENL );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP ) )
            && NIL == different_okP )
        {
          different_okP = arg_test_okP( reln, arg, argnum, $kw23$DIFFERENT );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP
            || NIL == different_okP ) ) && NIL == format_okP )
        {
          format_okP = arg_test_okP( reln, arg, argnum, $kw24$FORMAT );
        }
      }
      finally
      {
        at_vars.$at_arg_type$.rebind( _prev_bind_8, thread );
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_7, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_6, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_5, thread );
      }
    }
    return makeBoolean( NIL != isa_okP && NIL != quoted_isa_okP && NIL != not_isa_okP && NIL != genls_okP && NIL != not_genls_okP && NIL != genl_isa_okP && NIL != isa_genl_okP && NIL != different_okP
        && NIL != format_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 22507L)
  public static SubLObject naut_arg_types_okP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_utilities.possibly_naut_p( arg ) : arg;
    if( NIL != at_vars.$at_admit_consistent_nautsP$.getDynamicValue( thread ) )
    {
      return naut_arg_types_consistentP( reln, arg, argnum, mt );
    }
    return naut_arg_types_trueP( reln, arg, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 22759L)
  public static SubLObject naut_arg_types_consistentP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject isa_okP = makeBoolean( NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue( thread ) );
    SubLObject quoted_isa_okP = makeBoolean( NIL == at_vars.$at_check_not_quoted_isa_disjointP$.getDynamicValue( thread ) );
    SubLObject not_isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue( thread ) );
    SubLObject genls_okP = makeBoolean( NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue( thread ) );
    SubLObject not_genls_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue( thread ) );
    SubLObject genl_isa_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue( thread ) );
    SubLObject isa_genl_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue( thread ) );
    SubLObject different_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue( thread ) );
    SubLObject format_okP = makeBoolean( NIL == at_vars.$at_check_arg_formatP$.getDynamicValue( thread ) );
    SubLObject functor = cycl_utilities.nat_functor( arg );
    final SubLObject nat = ( NIL != el_utilities.arg_types_prescribe_unreifiedP( reln, argnum ) ) ? NIL : cycl_utilities.find_closed_naut( arg );
    if( NIL != nart_handles.nart_p( nat ) )
    {
      return relation_arg_okP( reln, nat, argnum, mt );
    }
    if( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP || NIL == different_okP || NIL == format_okP )
    {
      if( !functor.isAtom() )
      {
        functor = narts_high.nart_substitute( functor );
      }
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      final SubLObject _prev_bind_4 = at_vars.$at_arg_type$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        at_vars.$at_arg_type$.bind( $kw26$NAUT, thread );
        if( NIL == isa_okP )
        {
          if( NIL != kb_accessors.result_isaP( functor, mt ) || NIL != kb_accessors.result_isa_argP( functor, mt ) || NIL != kb_accessors.result_isa_arg_arg_isaP( arg, mt ) )
          {
            isa_okP = arg_test_okP( reln, arg, argnum, $kw15$NOT_ISA_DISJOINT );
          }
          else
          {
            final SubLObject _prev_bind_0_$15 = at_vars.$at_check_arg_quoted_isaP$.currentBinding( thread );
            final SubLObject _prev_bind_1_$16 = at_vars.$at_check_arg_genlsP$.currentBinding( thread );
            final SubLObject _prev_bind_2_$17 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
            try
            {
              at_vars.$at_check_arg_quoted_isaP$.bind( NIL, thread );
              at_vars.$at_check_arg_genlsP$.bind( NIL, thread );
              at_vars.$at_check_arg_formatP$.bind( NIL, thread );
              isa_okP = opaque_arg_types_okP( reln, arg, argnum, UNPROVIDED );
            }
            finally
            {
              at_vars.$at_check_arg_formatP$.rebind( _prev_bind_2_$17, thread );
              at_vars.$at_check_arg_genlsP$.rebind( _prev_bind_1_$16, thread );
              at_vars.$at_check_arg_quoted_isaP$.rebind( _prev_bind_0_$15, thread );
            }
          }
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP ) ) && NIL == quoted_isa_okP )
        {
          if( NIL != czer_utilities.reifiable_functorP( functor, mt ) || NIL != kb_accessors.evaluation_result_quoted_isaP( functor, mt ) || NIL != kb_accessors.result_quoted_isaP( functor, mt ) )
          {
            quoted_isa_okP = arg_test_okP( reln, arg, argnum, $kw16$NOT_QUOTED_ISA_DISJOINT );
          }
          else
          {
            final SubLObject _prev_bind_0_$16 = at_vars.$at_check_arg_isaP$.currentBinding( thread );
            final SubLObject _prev_bind_1_$17 = at_vars.$at_check_arg_genlsP$.currentBinding( thread );
            final SubLObject _prev_bind_2_$18 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
            try
            {
              at_vars.$at_check_arg_isaP$.bind( NIL, thread );
              at_vars.$at_check_arg_genlsP$.bind( NIL, thread );
              at_vars.$at_check_arg_formatP$.bind( NIL, thread );
              quoted_isa_okP = opaque_arg_types_okP( reln, arg, argnum, UNPROVIDED );
            }
            finally
            {
              at_vars.$at_check_arg_formatP$.rebind( _prev_bind_2_$18, thread );
              at_vars.$at_check_arg_genlsP$.rebind( _prev_bind_1_$17, thread );
              at_vars.$at_check_arg_isaP$.rebind( _prev_bind_0_$16, thread );
            }
          }
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP ) ) && NIL == not_isa_okP )
        {
          not_isa_okP = arg_test_okP( reln, arg, argnum, $kw17$NOT_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP ) ) && NIL == genls_okP )
        {
          if( NIL != cycl_utilities.expression_find_if( $sym27$VARIABLE_TERM_WRT_ARG_TYPE_, arg, UNPROVIDED, UNPROVIDED ) )
          {
            genls_okP = T;
          }
          else
          {
            genls_okP = arg_test_okP( reln, arg, argnum, $kw18$NOT_GENLS_DISJOINT );
          }
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP ) ) && NIL == not_genls_okP )
        {
          not_genls_okP = arg_test_okP( reln, arg, argnum, $kw20$NOT_GENLS );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP ) ) && NIL == genl_isa_okP )
        {
          genl_isa_okP = arg_test_okP( reln, arg, argnum, $kw21$GENL_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP ) ) && NIL == isa_genl_okP )
        {
          isa_genl_okP = arg_test_okP( reln, arg, argnum, $kw20$NOT_GENLS );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP ) )
            && NIL == different_okP )
        {
          different_okP = arg_test_okP( reln, arg, argnum, $kw23$DIFFERENT );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP
            || NIL == different_okP ) ) && NIL == format_okP )
        {
          format_okP = arg_test_okP( reln, arg, argnum, $kw24$FORMAT );
        }
      }
      finally
      {
        at_vars.$at_arg_type$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return makeBoolean( NIL != isa_okP && NIL != quoted_isa_okP && NIL != not_isa_okP && NIL != genls_okP && NIL != not_genls_okP && NIL != genl_isa_okP && NIL != isa_genl_okP && NIL != different_okP
        && NIL != format_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 26681L)
  public static SubLObject naut_arg_types_trueP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_isaP$.getDynamicValue( thread ) );
    SubLObject quoted_isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue( thread ) );
    SubLObject not_isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue( thread ) );
    SubLObject genls_okP = makeBoolean( NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue( thread ) );
    SubLObject not_genls_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue( thread ) );
    SubLObject genl_isa_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue( thread ) );
    SubLObject isa_genl_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue( thread ) );
    SubLObject different_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue( thread ) );
    SubLObject format_okP = makeBoolean( NIL == at_vars.$at_check_arg_formatP$.getDynamicValue( thread ) );
    SubLObject functor = cycl_utilities.nat_functor( arg );
    final SubLObject nat = ( NIL == el_utilities.arg_types_prescribe_unreifiedP( reln, argnum ) ) ? NIL : cycl_utilities.find_closed_naut( arg );
    if( NIL != nart_handles.nart_p( nat ) )
    {
      return relation_arg_okP( reln, nat, argnum, mt );
    }
    if( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP || NIL == different_okP || NIL == format_okP )
    {
      if( !functor.isAtom() )
      {
        functor = narts_high.nart_substitute( functor );
      }
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      final SubLObject _prev_bind_4 = at_vars.$at_arg_type$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        at_vars.$at_arg_type$.bind( $kw26$NAUT, thread );
        if( NIL == isa_okP )
        {
          if( NIL != kb_accessors.result_isaP( functor, mt ) || NIL != kb_accessors.result_isa_argP( functor, mt ) || NIL != kb_accessors.result_isa_arg_arg_isaP( arg, mt ) )
          {
            isa_okP = arg_test_okP( reln, arg, argnum, $kw28$ISA );
          }
          else
          {
            final SubLObject _prev_bind_0_$21 = at_vars.$at_check_arg_quoted_isaP$.currentBinding( thread );
            final SubLObject _prev_bind_1_$22 = at_vars.$at_check_arg_genlsP$.currentBinding( thread );
            final SubLObject _prev_bind_2_$23 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
            try
            {
              at_vars.$at_check_arg_quoted_isaP$.bind( NIL, thread );
              at_vars.$at_check_arg_genlsP$.bind( NIL, thread );
              at_vars.$at_check_arg_formatP$.bind( NIL, thread );
              isa_okP = opaque_arg_types_okP( reln, arg, argnum, UNPROVIDED );
            }
            finally
            {
              at_vars.$at_check_arg_formatP$.rebind( _prev_bind_2_$23, thread );
              at_vars.$at_check_arg_genlsP$.rebind( _prev_bind_1_$22, thread );
              at_vars.$at_check_arg_quoted_isaP$.rebind( _prev_bind_0_$21, thread );
            }
          }
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP ) ) && NIL == quoted_isa_okP )
        {
          if( NIL != kb_accessors.evaluation_result_quoted_isaP( functor, mt ) || NIL != kb_accessors.result_quoted_isaP( functor, mt ) )
          {
            quoted_isa_okP = arg_test_okP( reln, arg, argnum, $kw29$QUOTED_ISA );
          }
          else
          {
            final SubLObject _prev_bind_0_$22 = at_vars.$at_check_arg_isaP$.currentBinding( thread );
            final SubLObject _prev_bind_1_$23 = at_vars.$at_check_arg_genlsP$.currentBinding( thread );
            final SubLObject _prev_bind_2_$24 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
            try
            {
              at_vars.$at_check_arg_isaP$.bind( NIL, thread );
              at_vars.$at_check_arg_genlsP$.bind( NIL, thread );
              at_vars.$at_check_arg_formatP$.bind( NIL, thread );
              quoted_isa_okP = opaque_arg_types_okP( reln, arg, argnum, UNPROVIDED );
            }
            finally
            {
              at_vars.$at_check_arg_formatP$.rebind( _prev_bind_2_$24, thread );
              at_vars.$at_check_arg_genlsP$.rebind( _prev_bind_1_$23, thread );
              at_vars.$at_check_arg_isaP$.rebind( _prev_bind_0_$22, thread );
            }
          }
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP ) ) && NIL == not_isa_okP )
        {
          not_isa_okP = arg_test_okP( reln, arg, argnum, $kw17$NOT_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP ) ) && NIL == genls_okP )
        {
          if( NIL != kb_accessors.result_genlP( functor, UNPROVIDED ) || NIL != kb_accessors.result_genl_argP( functor, UNPROVIDED ) || NIL != kb_accessors.result_genl_arg_arg_genlP( arg, mt ) )
          {
            genls_okP = arg_test_okP( reln, arg, argnum, $kw19$GENLS );
          }
          else if( NIL != cycl_utilities.formula_find_if( $sym27$VARIABLE_TERM_WRT_ARG_TYPE_, arg, UNPROVIDED, UNPROVIDED ) )
          {
            genls_okP = T;
          }
          else
          {
            final SubLObject collectionP = makeBoolean( NIL != genls.genlsP( nat, $const30$Collection, mt, UNPROVIDED ) || NIL != isa.isaP( functor, $const31$CollectionDenotingFunction, mt, UNPROVIDED ) );
            final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0_$23 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
            final SubLObject _prev_bind_1_$24 = sbhl_marking_vars.$sbhl_table$.currentBinding( thread );
            try
            {
              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( NIL, thread );
              sbhl_marking_vars.$sbhl_table$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
              try
              {
                final SubLObject _prev_bind_0_$24 = at_vars.$at_genls_space$.currentBinding( thread );
                final SubLObject _prev_bind_1_$25 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                try
                {
                  at_vars.$at_genls_space$.bind( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ), thread );
                  sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( resourcing_p, thread );
                  if( NIL != collectionP )
                  {
                    sbhl_marking_methods.sbhl_record_node( $const32$Thing, UNPROVIDED );
                  }
                  final SubLObject _prev_bind_0_$25 = at_vars.$at_arg_type$.currentBinding( thread );
                  try
                  {
                    at_vars.$at_arg_type$.bind( $kw33$OPAQUE, thread );
                    genls_okP = arg_test_okP( reln, arg, argnum, $kw19$GENLS );
                  }
                  finally
                  {
                    at_vars.$at_arg_type$.rebind( _prev_bind_0_$25, thread );
                  }
                }
                finally
                {
                  sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_1_$25, thread );
                  at_vars.$at_genls_space$.rebind( _prev_bind_0_$24, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ) );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
                }
              }
            }
            finally
            {
              sbhl_marking_vars.$sbhl_table$.rebind( _prev_bind_1_$24, thread );
              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_0_$23, thread );
            }
          }
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP ) ) && NIL == not_genls_okP )
        {
          not_genls_okP = arg_test_okP( reln, arg, argnum, $kw20$NOT_GENLS );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP ) ) && NIL == genl_isa_okP )
        {
          genl_isa_okP = arg_test_okP( reln, arg, argnum, $kw21$GENL_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP ) ) && NIL == isa_genl_okP )
        {
          isa_genl_okP = arg_test_okP( reln, arg, argnum, $kw22$ISA_GENL );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP ) )
            && NIL == different_okP )
        {
          different_okP = arg_test_okP( reln, arg, argnum, $kw23$DIFFERENT );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP
            || NIL == different_okP ) ) && NIL == format_okP )
        {
          format_okP = arg_test_okP( reln, arg, argnum, $kw24$FORMAT );
        }
      }
      finally
      {
        at_vars.$at_arg_type$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return makeBoolean( NIL != isa_okP && NIL != quoted_isa_okP && NIL != not_isa_okP && NIL != genls_okP && NIL != not_genls_okP && NIL != genl_isa_okP && NIL != isa_genl_okP && NIL != different_okP
        && NIL != format_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 30911L)
  public static SubLObject strong_fort_arg_types_okP(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = at_vars.$at_reln$.getDynamicValue();
    }
    if( arg == UNPROVIDED )
    {
      arg = at_vars.$at_arg$.getDynamicValue();
    }
    if( argnum == UNPROVIDED )
    {
      argnum = at_vars.$at_argnum$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_isaP$.getDynamicValue( thread ) );
    SubLObject quoted_isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue( thread ) );
    SubLObject not_isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue( thread ) );
    SubLObject genls_okP = makeBoolean( NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue( thread ) );
    SubLObject not_genls_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue( thread ) );
    SubLObject genl_isa_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue( thread ) );
    SubLObject isa_genl_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue( thread ) );
    SubLObject format_okP = makeBoolean( NIL == at_vars.$at_check_arg_formatP$.getDynamicValue( thread ) );
    SubLObject different_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue( thread ) );
    if( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP || NIL == format_okP || NIL == different_okP )
    {
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      final SubLObject _prev_bind_4 = at_vars.$at_arg_type$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        at_vars.$at_arg_type$.bind( $kw34$STRONG_FORT, thread );
        if( NIL == isa_okP )
        {
          isa_okP = arg_test_okP( reln, arg, argnum, $kw28$ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP ) ) && NIL == quoted_isa_okP )
        {
          quoted_isa_okP = arg_test_okP( reln, arg, argnum, $kw29$QUOTED_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP ) ) && NIL == not_isa_okP )
        {
          not_isa_okP = arg_test_okP( reln, arg, argnum, $kw17$NOT_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP ) ) && NIL == genls_okP )
        {
          genls_okP = arg_test_okP( reln, arg, argnum, $kw19$GENLS );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP ) ) && NIL == not_genls_okP )
        {
          not_genls_okP = arg_test_okP( reln, arg, argnum, $kw20$NOT_GENLS );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP ) ) && NIL == genl_isa_okP )
        {
          genl_isa_okP = arg_test_okP( reln, arg, argnum, $kw21$GENL_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP ) ) && NIL == isa_genl_okP )
        {
          isa_genl_okP = arg_test_okP( reln, arg, argnum, $kw22$ISA_GENL );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP ) )
            && NIL == format_okP )
        {
          format_okP = arg_test_okP( reln, arg, argnum, $kw24$FORMAT );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP
            || NIL == format_okP ) ) && NIL == different_okP )
        {
          different_okP = arg_test_okP( reln, arg, argnum, $kw23$DIFFERENT );
        }
      }
      finally
      {
        at_vars.$at_arg_type$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return makeBoolean( NIL != isa_okP && NIL != quoted_isa_okP && NIL != not_isa_okP && NIL != genls_okP && NIL != not_genls_okP && NIL != isa_genl_okP && NIL != genl_isa_okP && NIL != format_okP && NIL != different_okP
        && ( NIL == at_vars.$at_ensure_consistencyP$.getDynamicValue( thread ) || NIL != weak_fort_types_okP( reln, arg, argnum, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 33569L)
  public static SubLObject opaque_arg_types_okP(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = at_vars.$at_reln$.getDynamicValue();
    }
    if( arg == UNPROVIDED )
    {
      arg = at_vars.$at_arg$.getDynamicValue();
    }
    if( argnum == UNPROVIDED )
    {
      argnum = at_vars.$at_argnum$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_isaP$.getDynamicValue( thread ) );
    SubLObject quoted_isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue( thread ) );
    SubLObject not_isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue( thread ) );
    SubLObject genls_okP = makeBoolean( NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue( thread ) );
    SubLObject not_genls_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue( thread ) );
    SubLObject genl_isa_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue( thread ) );
    SubLObject isa_genl_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue( thread ) );
    SubLObject format_okP = makeBoolean( NIL == at_vars.$at_check_arg_formatP$.getDynamicValue( thread ) );
    SubLObject different_okP = makeBoolean( NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue( thread ) );
    if( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP || NIL == format_okP || NIL == different_okP )
    {
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      final SubLObject _prev_bind_4 = at_vars.$at_arg_type$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        at_vars.$at_arg_type$.bind( $kw33$OPAQUE, thread );
        if( NIL == isa_okP )
        {
          isa_okP = arg_test_okP( reln, arg, argnum, $kw28$ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP ) ) && NIL == quoted_isa_okP )
        {
          quoted_isa_okP = arg_test_okP( reln, arg, argnum, $kw29$QUOTED_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP ) ) && NIL == not_isa_okP )
        {
          not_isa_okP = arg_test_okP( reln, arg, argnum, $kw17$NOT_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP ) ) && NIL == genls_okP )
        {
          final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
          final SubLObject _prev_bind_0_$33 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          final SubLObject _prev_bind_1_$34 = sbhl_marking_vars.$sbhl_table$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( NIL, thread );
            sbhl_marking_vars.$sbhl_table$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject _prev_bind_0_$34 = at_vars.$at_genls_space$.currentBinding( thread );
              final SubLObject _prev_bind_1_$35 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
              try
              {
                at_vars.$at_genls_space$.bind( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ), thread );
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( resourcing_p, thread );
                genls_okP = arg_test_okP( reln, arg, argnum, $kw19$GENLS );
              }
              finally
              {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_1_$35, thread );
                at_vars.$at_genls_space$.rebind( _prev_bind_0_$34, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_table$.rebind( _prev_bind_1_$34, thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_0_$33, thread );
          }
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP ) ) && NIL == not_genls_okP )
        {
          not_genls_okP = arg_test_okP( reln, arg, argnum, $kw20$NOT_GENLS );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP ) ) && NIL == genl_isa_okP )
        {
          genl_isa_okP = arg_test_okP( reln, arg, argnum, $kw21$GENL_ISA );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP ) ) && NIL == isa_genl_okP )
        {
          isa_genl_okP = arg_test_okP( reln, arg, argnum, $kw22$ISA_GENL );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP ) )
            && NIL == format_okP )
        {
          format_okP = arg_test_okP( reln, arg, argnum, $kw24$FORMAT );
        }
        if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP || NIL == not_isa_okP || NIL == genls_okP || NIL == not_genls_okP || NIL == genl_isa_okP || NIL == isa_genl_okP
            || NIL == format_okP ) ) && NIL == different_okP )
        {
          different_okP = arg_test_okP( reln, arg, argnum, $kw23$DIFFERENT );
        }
      }
      finally
      {
        at_vars.$at_arg_type$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return makeBoolean( NIL != isa_okP && NIL != quoted_isa_okP && NIL != not_isa_okP && NIL != genls_okP && NIL != not_genls_okP && NIL != genls_okP && NIL != isa_genl_okP && NIL != format_okP && NIL != different_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 36177L)
  public static SubLObject arg_isa_arg_types_okP(SubLObject reln, SubLObject arg_isa, SubLObject argnum, SubLObject mt)
  {
    if( reln == UNPROVIDED )
    {
      reln = at_vars.$at_reln$.getDynamicValue();
    }
    if( arg_isa == UNPROVIDED )
    {
      arg_isa = at_vars.$at_arg$.getDynamicValue();
    }
    if( argnum == UNPROVIDED )
    {
      argnum = at_vars.$at_argnum$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_isaP$.getDynamicValue( thread ) );
    SubLObject quoted_isa_okP = makeBoolean( NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue( thread ) );
    SubLObject genls_okP = makeBoolean( NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue( thread ) );
    if( NIL == isa_okP || NIL == quoted_isa_okP || NIL == genls_okP )
    {
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject genl_somethingP = ( NIL != forts.fort_p( reln ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( reln, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( reln, UNPROVIDED,
            UNPROVIDED ) ) : NIL;
        final SubLObject _prev_bind_0_$38 = at_vars.$at_reln$.currentBinding( thread );
        final SubLObject _prev_bind_1_$39 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
        final SubLObject _prev_bind_2_$40 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
        final SubLObject _prev_bind_4 = at_vars.$at_arg$.currentBinding( thread );
        try
        {
          at_vars.$at_reln$.bind( reln, thread );
          at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          at_vars.$at_arg$.bind( arg_isa, thread );
          assert NIL != Types.integerp( argnum ) : argnum;
          final SubLObject _prev_bind_0_$39 = at_vars.$at_argnum$.currentBinding( thread );
          final SubLObject _prev_bind_1_$40 = at_vars.$defn_fn_history$.currentBinding( thread );
          final SubLObject _prev_bind_2_$41 = at_vars.$quoted_defn_fn_history$.currentBinding( thread );
          final SubLObject _prev_bind_3_$44 = at_vars.$defn_col_history$.currentBinding( thread );
          final SubLObject _prev_bind_5 = at_vars.$quoted_defn_col_history$.currentBinding( thread );
          try
          {
            at_vars.$at_argnum$.bind( argnum, thread );
            at_vars.$defn_fn_history$.bind( at_macros.make_defn_fn_history_table(), thread );
            at_vars.$quoted_defn_fn_history$.bind( at_macros.make_quoted_defn_fn_history_table(), thread );
            at_vars.$defn_col_history$.bind( at_macros.make_defn_col_history_table(), thread );
            at_vars.$quoted_defn_col_history$.bind( at_macros.make_quoted_defn_col_history_table(), thread );
            try
            {
              final SubLObject _prev_bind_0_$40 = at_vars.$at_arg_type$.currentBinding( thread );
              try
              {
                at_vars.$at_arg_type$.bind( $kw34$STRONG_FORT, thread );
                if( NIL == isa_okP )
                {
                  final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                  final SubLObject _prev_bind_0_$41 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$41 = sbhl_marking_vars.$sbhl_table$.currentBinding( thread );
                  try
                  {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( NIL, thread );
                    sbhl_marking_vars.$sbhl_table$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                    try
                    {
                      final SubLObject _prev_bind_0_$42 = at_vars.$at_isa_space$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$42 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                      try
                      {
                        at_vars.$at_isa_space$.bind( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ), thread );
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( resourcing_p, thread );
                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const36$genls ), arg_isa, UNPROVIDED, UNPROVIDED );
                        isa_okP = arg_test_okP( reln, arg_isa, argnum, $kw28$ISA );
                      }
                      finally
                      {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_1_$42, thread );
                        at_vars.$at_isa_space$.rebind( _prev_bind_0_$42, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ) );
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_marking_vars.$sbhl_table$.rebind( _prev_bind_1_$41, thread );
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_0_$41, thread );
                  }
                }
                if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP ) ) && NIL == quoted_isa_okP )
                {
                  quoted_isa_okP = arg_test_okP( reln, arg_isa, argnum, $kw29$QUOTED_ISA );
                }
                if( NIL == at_utilities.at_finishedP( makeBoolean( NIL == isa_okP || NIL == quoted_isa_okP ) ) && NIL == genls_okP )
                {
                  final SubLObject collectionP = fort_types_interface.collectionP( arg_isa );
                  final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                  final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$43 = sbhl_marking_vars.$sbhl_table$.currentBinding( thread );
                  try
                  {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( NIL, thread );
                    sbhl_marking_vars.$sbhl_table$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                    try
                    {
                      final SubLObject _prev_bind_0_$45 = at_vars.$at_genls_space$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$44 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                      try
                      {
                        at_vars.$at_genls_space$.bind( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ), thread );
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( resourcing_p2, thread );
                        if( NIL != collectionP )
                        {
                          sbhl_marking_methods.sbhl_record_all_forward_true_nodes( sbhl_module_vars.get_sbhl_module( $const36$genls ), arg_isa, UNPROVIDED, UNPROVIDED );
                        }
                        genls_okP = arg_test_okP( reln, arg_isa, argnum, $kw19$GENLS );
                      }
                      finally
                      {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_1_$44, thread );
                        at_vars.$at_genls_space$.rebind( _prev_bind_0_$45, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_table$.getDynamicValue( thread ) );
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_marking_vars.$sbhl_table$.rebind( _prev_bind_1_$43, thread );
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_0_$44, thread );
                  }
                }
              }
              finally
              {
                at_vars.$at_arg_type$.rebind( _prev_bind_0_$40, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values3 = Values.getValuesAsVector();
                at_defns.clear_defn_space();
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$47, thread );
              }
            }
          }
          finally
          {
            at_vars.$quoted_defn_col_history$.rebind( _prev_bind_5, thread );
            at_vars.$defn_col_history$.rebind( _prev_bind_3_$44, thread );
            at_vars.$quoted_defn_fn_history$.rebind( _prev_bind_2_$41, thread );
            at_vars.$defn_fn_history$.rebind( _prev_bind_1_$40, thread );
            at_vars.$at_argnum$.rebind( _prev_bind_0_$39, thread );
          }
        }
        finally
        {
          at_vars.$at_arg$.rebind( _prev_bind_4, thread );
          at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_2_$40, thread );
          at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$39, thread );
          at_vars.$at_reln$.rebind( _prev_bind_0_$38, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return makeBoolean( NIL != isa_okP && NIL != quoted_isa_okP && NIL != genls_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 37679L)
  public static SubLObject arg_test_okP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = $kw28$ISA;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject not_okP = NIL;
    if( reln.eql( $const37$Quote ) )
    {
      final SubLObject _prev_bind_0 = cycl_grammar.$within_quote_form$.currentBinding( thread );
      try
      {
        cycl_grammar.$within_quote_form$.bind( T, thread );
        if( $kw33$OPAQUE != at_vars.$at_arg_type$.getDynamicValue( thread ) || NIL == at_vars.$at_relax_arg_constraints_for_opaque_expansion_natsP$.getDynamicValue( thread ) || NIL == wff_vars.validating_expansionP()
            || NIL == verbosifier.expansion_nautP( arg, UNPROVIDED ) )
        {
          if( NIL != subl_promotions.memberP( test, $list38, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) )
            {
              not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
            }
          }
          else if( NIL != at_vars.$at_check_inter_arg_not_isaP$.getDynamicValue( thread ) && test.eql( $kw17$NOT_ISA ) )
          {
            not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
          }
          else if( NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue( thread ) && NIL != subl_promotions.memberP( test, $list39, UNPROVIDED, UNPROVIDED ) )
          {
            not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
          }
          else if( NIL != at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue( thread ) && test.eql( $kw20$NOT_GENLS ) )
          {
            not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
          }
          else if( NIL != at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue( thread ) && test.eql( $kw21$GENL_ISA ) )
          {
            not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
          }
          else if( NIL != at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue( thread ) && test.eql( $kw22$ISA_GENL ) )
          {
            not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
          }
          else if( NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue( thread ) && test.eql( $kw24$FORMAT ) )
          {
            clear_cached_format_okP();
            not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
          }
          else if( NIL != at_vars.$at_check_inter_arg_differentP$.getDynamicValue( thread ) && test.eql( $kw23$DIFFERENT ) )
          {
            not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
          }
          if( NIL == at_utilities.at_finishedP( not_okP ) )
          {
            not_okP = makeBoolean( NIL != mal_intra_argP( reln, arg, argnum, test ) || NIL != not_okP );
          }
        }
      }
      finally
      {
        cycl_grammar.$within_quote_form$.rebind( _prev_bind_0, thread );
      }
    }
    else if( $kw33$OPAQUE != at_vars.$at_arg_type$.getDynamicValue( thread ) || NIL == at_vars.$at_relax_arg_constraints_for_opaque_expansion_natsP$.getDynamicValue( thread ) || NIL == wff_vars.validating_expansionP()
        || NIL == verbosifier.expansion_nautP( arg, UNPROVIDED ) )
    {
      if( NIL != subl_promotions.memberP( test, $list38, UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) )
        {
          not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
        }
      }
      else if( NIL != at_vars.$at_check_inter_arg_not_isaP$.getDynamicValue( thread ) && test.eql( $kw17$NOT_ISA ) )
      {
        not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
      }
      else if( NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue( thread ) && NIL != subl_promotions.memberP( test, $list39, UNPROVIDED, UNPROVIDED ) )
      {
        not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
      }
      else if( NIL != at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue( thread ) && test.eql( $kw20$NOT_GENLS ) )
      {
        not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
      }
      else if( NIL != at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue( thread ) && test.eql( $kw21$GENL_ISA ) )
      {
        not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
      }
      else if( NIL != at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue( thread ) && test.eql( $kw22$ISA_GENL ) )
      {
        not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
      }
      else if( NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue( thread ) && test.eql( $kw24$FORMAT ) )
      {
        clear_cached_format_okP();
        not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
      }
      else if( NIL != at_vars.$at_check_inter_arg_differentP$.getDynamicValue( thread ) && test.eql( $kw23$DIFFERENT ) )
      {
        not_okP = inter_arg_test_failsP( reln, arg, argnum, test );
      }
      if( NIL == at_utilities.at_finishedP( not_okP ) )
      {
        not_okP = makeBoolean( NIL != mal_intra_argP( reln, arg, argnum, test ) || NIL != not_okP );
      }
    }
    return makeBoolean( NIL == not_okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 39266L)
  public static SubLObject inter_arg_test_failsP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = $kw28$ISA;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ind_argnum = ZERO_INTEGER;
    SubLObject not_okP = NIL;
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = cycl_utilities.formula_args( at_vars.$at_formula$.getDynamicValue( thread ), UNPROVIDED );
      SubLObject ind_arg = NIL;
      ind_arg = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        ind_argnum = Numbers.add( ind_argnum, ONE_INTEGER );
        if( !argnum.eql( ind_argnum ) )
        {
          not_okP = makeBoolean( NIL != mal_inter_argP( reln, ind_arg, ind_argnum, arg, argnum, test ) || NIL != not_okP );
          doneP = at_utilities.at_finishedP( not_okP );
        }
        csome_list_var = csome_list_var.rest();
        ind_arg = csome_list_var.first();
      }
    }
    return not_okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 39651L)
  public static SubLObject mal_intra_argP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject test)
  {
    if( test.eql( $kw28$ISA ) )
    {
      return at_routines.mal_arg_isaP( reln, arg, argnum );
    }
    if( test.eql( $kw17$NOT_ISA ) )
    {
      return at_routines.mal_arg_not_isaP( reln, arg, argnum );
    }
    if( test.eql( $kw29$QUOTED_ISA ) )
    {
      return at_routines.mal_arg_quoted_isaP( reln, arg, argnum );
    }
    if( test.eql( $kw19$GENLS ) )
    {
      return at_routines.mal_arg_genlsP( reln, arg, argnum );
    }
    if( test.eql( $kw15$NOT_ISA_DISJOINT ) )
    {
      return at_routines.mal_arg_not_isa_disjointP( reln, arg, argnum );
    }
    if( test.eql( $kw16$NOT_QUOTED_ISA_DISJOINT ) )
    {
      return at_routines.mal_arg_not_quoted_isa_disjointP( reln, arg, argnum );
    }
    if( test.eql( $kw18$NOT_GENLS_DISJOINT ) )
    {
      return at_routines.mal_arg_not_genls_disjointP( reln, arg, argnum );
    }
    if( test.eql( $kw24$FORMAT ) )
    {
      return at_routines.mal_arg_formatP( reln, arg, argnum );
    }
    if( test.eql( $kw23$DIFFERENT ) )
    {
      return NIL;
    }
    el_utilities.el_error( THREE_INTEGER, $str40$invalid_at_test__s_in_mal_intra_a, test, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 40622L)
  public static SubLObject mal_inter_argP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum, final SubLObject test)
  {
    if( test.eql( $kw28$ISA ) )
    {
      return at_routines.mal_inter_arg_isaP( reln, ind_arg, ind_argnum, dep_arg, dep_argnum );
    }
    if( test.eql( $kw17$NOT_ISA ) )
    {
      return at_routines.mal_inter_arg_not_isaP( reln, ind_arg, ind_argnum, dep_arg, dep_argnum );
    }
    if( test.eql( $kw15$NOT_ISA_DISJOINT ) )
    {
      return at_routines.mal_inter_arg_not_isa_disjointP( reln, ind_arg, ind_argnum, dep_arg, dep_argnum );
    }
    if( test.eql( $kw19$GENLS ) )
    {
      return at_routines.mal_inter_arg_genlP( reln, ind_arg, ind_argnum, dep_arg, dep_argnum );
    }
    if( test.eql( $kw20$NOT_GENLS ) )
    {
      return at_routines.mal_inter_arg_not_genlP( reln, ind_arg, ind_argnum, dep_arg, dep_argnum );
    }
    if( test.eql( $kw18$NOT_GENLS_DISJOINT ) )
    {
      return at_routines.mal_inter_arg_not_genl_disjointP( reln, ind_arg, ind_argnum, dep_arg, dep_argnum );
    }
    if( test.eql( $kw21$GENL_ISA ) )
    {
      return at_routines.mal_inter_arg_genl_isaP( reln, ind_arg, ind_argnum, dep_arg, dep_argnum );
    }
    if( test.eql( $kw22$ISA_GENL ) )
    {
      return at_routines.mal_inter_arg_isa_genlP( reln, ind_arg, ind_argnum, dep_arg, dep_argnum );
    }
    if( test.eql( $kw24$FORMAT ) )
    {
      return at_routines.mal_inter_arg_formatP( reln, ind_arg, ind_argnum, dep_arg, dep_argnum );
    }
    if( test.eql( $kw23$DIFFERENT ) )
    {
      return makeBoolean( ind_argnum.numG( dep_argnum ) && NIL != at_routines.mal_inter_arg_differentP( reln, ind_arg, ind_argnum, dep_arg, dep_argnum ) );
    }
    el_utilities.el_error( THREE_INTEGER, $str41$invalid_at_test__s_in_mal_inter_a, test, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 42324L)
  public static SubLObject defining_mts_okP(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL == forts.fort_p( fort ) || NIL == at_vars.at_check_defining_mts_p() )
    {
      return T;
    }
    if( NIL != wff_macros.within_wffP() )
    {
      return memoized_defining_mts_okP( fort, mt );
    }
    return defining_mts_ok_intP( fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 42664L)
  public static SubLObject memoized_defining_mts_okP_internal(final SubLObject fort, final SubLObject mt)
  {
    return defining_mts_ok_intP( fort, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 42664L)
  public static SubLObject memoized_defining_mts_okP(final SubLObject fort, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_defining_mts_okP_internal( fort, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym42$MEMOIZED_DEFINING_MTS_OK_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym42$MEMOIZED_DEFINING_MTS_OK_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym42$MEMOIZED_DEFINING_MTS_OK_, caching_state );
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
        if( fort.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_defining_mts_okP_internal( fort, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( fort, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 42778L)
  public static SubLObject defining_mts_ok_intP(final SubLObject fort, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = T;
    final SubLObject mts = ( NIL != at_vars.$at_check_defining_mtsP$.getDynamicValue( thread ) ) ? ConsesLow.list( kb_accessors.defining_mt( fort ) ) : NIL;
    if( NIL != mts && NIL == genl_mts.any_genl_mtP( mt, mts, UNPROVIDED, UNPROVIDED ) )
    {
      okP = NIL;
      if( NIL != at_vars.$noting_at_violationsP$.getDynamicValue( thread ) )
      {
        at_utilities.at_note( THREE_INTEGER, $str43$__at_test_fails___s_in__s_fails__, fort, mt, mts, UNPROVIDED, UNPROVIDED );
        if( NIL != at_vars.$at_break_on_failureP$.getDynamicValue( thread ) )
        {
          at_utilities.at_error( ONE_INTEGER, $str43$__at_test_fails___s_in__s_fails__, fort, mt, mts, UNPROVIDED, UNPROVIDED );
        }
        at_utilities.note_at_violation( ConsesLow.list( $kw44$DEFINING_MT_VIOLATION, fort, mt, mts ) );
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 43332L)
  public static SubLObject relator_constraints_okP(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject relator = cycl_utilities.formula_arg0( relation );
    SubLObject okP = T;
    if( NIL != at_vars.$at_check_relator_constraintsP$.getDynamicValue( thread ) )
    {
      if( NIL != forts.fort_p( relator ) )
      {
        if( NIL != term.kb_predicateP( relator ) )
        {
          okP = predicate_constraints_okP( relation, mt );
        }
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 43673L)
  public static SubLObject predicate_constraints_okP(final SubLObject literal, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = T;
    final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = at_vars.$at_pred_constraints$.getDynamicValue( thread );
      final SubLObject _prev_bind_0 = at_vars.$at_mode$.currentBinding( thread );
      try
      {
        at_vars.$at_mode$.bind( NIL, thread );
        at_vars.$at_mode$.setDynamicValue( csome_list_var.first(), thread );
        while ( NIL == doneP && NIL != csome_list_var)
        {
          final SubLObject pcase_var = at_vars.$at_mode$.getDynamicValue( thread );
          if( pcase_var.eql( $kw45$ASYMMETRIC_PREDICATE ) )
          {
            if( NIL != kb_accessors.asymmetric_predicateP( predicate ) )
            {
              final SubLObject _prev_bind_0_$57 = at_vars.$gather_at_predicate_violationsP$.currentBinding( thread );
              final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding( thread );
              try
              {
                at_vars.$gather_at_predicate_violationsP$.bind( T, thread );
                at_vars.$at_predicate_violations$.bind( NIL, thread );
                okP = makeBoolean( NIL != gaf_ok_wrt_asymmetric_predP( literal, mt ) && NIL != okP );
              }
              finally
              {
                at_vars.$at_predicate_violations$.rebind( _prev_bind_2, thread );
                at_vars.$gather_at_predicate_violationsP$.rebind( _prev_bind_0_$57, thread );
              }
            }
          }
          else if( pcase_var.eql( $kw46$ANTI_SYMMETRIC_PREDICATE ) )
          {
            if( NIL != kb_accessors.anti_symmetric_predicateP( predicate ) )
            {
              final SubLObject _prev_bind_0_$58 = at_vars.$gather_at_predicate_violationsP$.currentBinding( thread );
              final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding( thread );
              try
              {
                at_vars.$gather_at_predicate_violationsP$.bind( T, thread );
                at_vars.$at_predicate_violations$.bind( NIL, thread );
                okP = makeBoolean( NIL != gaf_ok_wrt_anti_symmetric_predP( literal, mt ) && NIL != okP );
              }
              finally
              {
                at_vars.$at_predicate_violations$.rebind( _prev_bind_2, thread );
                at_vars.$gather_at_predicate_violationsP$.rebind( _prev_bind_0_$58, thread );
              }
            }
          }
          else if( pcase_var.eql( $kw47$IRREFLEXIVE_PREDICATE ) )
          {
            if( NIL != kb_accessors.irreflexive_predicateP( predicate ) )
            {
              final SubLObject _prev_bind_0_$59 = at_vars.$gather_at_predicate_violationsP$.currentBinding( thread );
              final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding( thread );
              try
              {
                at_vars.$gather_at_predicate_violationsP$.bind( T, thread );
                at_vars.$at_predicate_violations$.bind( NIL, thread );
                okP = makeBoolean( NIL != gaf_ok_wrt_irreflexive_predP( literal, mt ) && NIL != okP );
              }
              finally
              {
                at_vars.$at_predicate_violations$.rebind( _prev_bind_2, thread );
                at_vars.$gather_at_predicate_violationsP$.rebind( _prev_bind_0_$59, thread );
              }
            }
          }
          else if( pcase_var.eql( $kw48$ANTI_TRANSITIVE_PREDICATE ) )
          {
            if( NIL != kb_accessors.anti_transitive_predicateP( predicate ) )
            {
              final SubLObject _prev_bind_0_$60 = at_vars.$gather_at_predicate_violationsP$.currentBinding( thread );
              final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding( thread );
              try
              {
                at_vars.$gather_at_predicate_violationsP$.bind( T, thread );
                at_vars.$at_predicate_violations$.bind( NIL, thread );
                okP = makeBoolean( NIL != gaf_ok_wrt_anti_transitive_predP( literal, mt ) && NIL != okP );
              }
              finally
              {
                at_vars.$at_predicate_violations$.rebind( _prev_bind_2, thread );
                at_vars.$gather_at_predicate_violationsP$.rebind( _prev_bind_0_$60, thread );
              }
            }
          }
          else if( pcase_var.eql( $kw49$NEGATION_PREDS ) )
          {
            final SubLObject _prev_bind_0_$61 = at_vars.$gather_at_predicate_violationsP$.currentBinding( thread );
            final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding( thread );
            try
            {
              at_vars.$gather_at_predicate_violationsP$.bind( T, thread );
              at_vars.$at_predicate_violations$.bind( NIL, thread );
              okP = makeBoolean( NIL != gaf_ok_wrt_negation_predsP( literal, mt ) && NIL != okP );
            }
            finally
            {
              at_vars.$at_predicate_violations$.rebind( _prev_bind_2, thread );
              at_vars.$gather_at_predicate_violationsP$.rebind( _prev_bind_0_$61, thread );
            }
          }
          else if( pcase_var.eql( $kw50$NEGATION_INVERSES ) )
          {
            final SubLObject _prev_bind_0_$62 = at_vars.$gather_at_predicate_violationsP$.currentBinding( thread );
            final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding( thread );
            try
            {
              at_vars.$gather_at_predicate_violationsP$.bind( T, thread );
              at_vars.$at_predicate_violations$.bind( NIL, thread );
              okP = makeBoolean( NIL != gaf_ok_wrt_negation_inversesP( literal, mt ) && NIL != okP );
            }
            finally
            {
              at_vars.$at_predicate_violations$.rebind( _prev_bind_2, thread );
              at_vars.$gather_at_predicate_violationsP$.rebind( _prev_bind_0_$62, thread );
            }
          }
          else
          {
            el_utilities.el_error( THREE_INTEGER, $str51$unknown_predicate_constraint___s, at_vars.$at_mode$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          }
          if( NIL == okP && NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
          {
            doneP = T;
          }
          csome_list_var = csome_list_var.rest();
          at_vars.$at_mode$.setDynamicValue( csome_list_var.first(), thread );
        }
      }
      finally
      {
        at_vars.$at_mode$.rebind( _prev_bind_0, thread );
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 45058L)
  public static SubLObject gaf_ok_wrt_asymmetric_predP(final SubLObject gaf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject violations = asymmetric_violations( gaf, mt );
    if( NIL != violations )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_pred$.currentBinding( thread );
      try
      {
        at_vars.$at_pred$.bind( $const52$isa, thread );
        if( NIL != at_vars.$at_pred$.getDynamicValue( thread ) )
        {
          at_utilities.at_handle_mal_constraint( $const53$AsymmetricBinaryPredicate );
        }
      }
      finally
      {
        at_vars.$at_pred$.rebind( _prev_bind_0, thread );
      }
    }
    return Types.sublisp_null( violations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 45387L)
  public static SubLObject asymmetric_violations(final SubLObject gaf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.reify_arg_when_closed_naut( gaf, ZERO_INTEGER );
    final SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut( gaf, ONE_INTEGER );
    final SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut( gaf, TWO_INTEGER );
    SubLObject violations = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
      violations = gather_asymmetric_violations( pred, arg1, arg2 );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 45728L)
  public static SubLObject gather_asymmetric_violations(final SubLObject pred, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject violations = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_arg1$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$at_arg2$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      at_vars.$at_arg1$.bind( arg1, thread );
      at_vars.$at_arg2$.bind( arg2, thread );
      final SubLObject lookup_index = best_gaf_lookup_index_for_anti_transitive( el_utilities.make_binary_formula( pred, arg2, arg1 ), $kw54$TRUE, $list55 );
      final SubLObject index_type = kb_indexing.lookup_index_get_type( lookup_index );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw56$AT_MAPPING_DONE );
        final SubLObject _prev_bind_0_$63 = at_vars.$within_at_mappingP$.currentBinding( thread );
        try
        {
          at_vars.$within_at_mappingP$.bind( T, thread );
          if( index_type == $kw57$PREDICATE_EXTENT )
          {
            final SubLObject predicate = kb_indexing.lookup_index_predicate_extent_value( lookup_index );
            if( NIL != check_inter_assert_format_wXo_arg_indexP( at_vars.$at_formula$.getDynamicValue( thread ) ) )
            {
              kb_mapping.map_predicate_extent_index( $sym58$SELECT_ASYMMETRIC_PRED_VIOLATION, predicate, UNPROVIDED, UNPROVIDED );
            }
          }
          else if( index_type == $kw59$GAF_ARG )
          {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values( lookup_index );
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            kb_gp_mapping.gp_map_arg_index( $sym58$SELECT_ASYMMETRIC_PRED_VIOLATION, v_term, argnum, predicate2 );
          }
          else
          {
            Errors.cerror( $str60$Ignore_it, $str61$Unexpected_index_type_when_gather );
          }
        }
        finally
        {
          at_vars.$within_at_mappingP$.rebind( _prev_bind_0_$63, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw56$AT_MAPPING_DONE );
      }
      finally
      {
        thread.throwStack.pop();
      }
      violations = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      at_vars.$at_arg2$.rebind( _prev_bind_3, thread );
      at_vars.$at_arg1$.rebind( _prev_bind_2, thread );
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 46754L)
  public static SubLObject select_asymmetric_pred_violation(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_gaf_assertionP( assertion ) )
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      if( at_vars.$at_arg1$.getDynamicValue( thread ).equal( el_utilities.literal_arg( gaf, TWO_INTEGER, UNPROVIDED ) ) && at_vars.$at_arg2$.getDynamicValue( thread ).equal( el_utilities.literal_arg( gaf, ONE_INTEGER,
          UNPROVIDED ) ) )
      {
        control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertion, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
        if( NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue( thread ) && NIL == conses_high.member( assertion, at_vars.$at_predicate_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ),
            Symbols.symbol_function( IDENTITY ) ) )
        {
          at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.cons( assertion, at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
        }
        if( NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
        {
          at_utilities.at_mapping_finished();
        }
      }
    }
    return control_vars.$mapping_answer$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 47219L)
  public static SubLObject gaf_ok_wrt_anti_symmetric_predP(final SubLObject gaf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject violations = anti_symmetric_violations( gaf, mt );
    if( NIL != violations )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_pred$.currentBinding( thread );
      try
      {
        at_vars.$at_pred$.bind( $const52$isa, thread );
        if( NIL != at_vars.$at_pred$.getDynamicValue( thread ) )
        {
          at_utilities.at_handle_mal_constraint( $const62$AntiSymmetricBinaryPredicate );
        }
      }
      finally
      {
        at_vars.$at_pred$.rebind( _prev_bind_0, thread );
      }
    }
    return Types.sublisp_null( violations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 47571L)
  public static SubLObject anti_symmetric_violations(final SubLObject gaf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.reify_arg_when_closed_naut( gaf, ZERO_INTEGER );
    final SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut( gaf, ONE_INTEGER );
    final SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut( gaf, TWO_INTEGER );
    SubLObject violations = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
      if( NIL == equals.equalsP( arg1, arg2, UNPROVIDED, UNPROVIDED ) )
      {
        violations = gather_asymmetric_violations( pred, arg1, arg2 );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 47947L)
  public static SubLObject gaf_ok_wrt_irreflexive_predP(final SubLObject gaf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = T;
    final SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut( gaf, ONE_INTEGER );
    final SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut( gaf, TWO_INTEGER );
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != equals.equalsP( arg1, arg2, UNPROVIDED, UNPROVIDED ) )
      {
        okP = NIL;
        final SubLObject _prev_bind_0_$64 = at_vars.$at_pred$.currentBinding( thread );
        try
        {
          at_vars.$at_pred$.bind( $const52$isa, thread );
          if( NIL != at_vars.$at_pred$.getDynamicValue( thread ) )
          {
            at_utilities.at_handle_mal_constraint( $const63$IrreflexiveBinaryPredicate );
          }
        }
        finally
        {
          at_vars.$at_pred$.rebind( _prev_bind_0_$64, thread );
        }
      }
      if( NIL != okP || NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
      {
        final SubLObject pred = cycl_utilities.reify_arg_when_closed_naut( gaf, ZERO_INTEGER );
        if( NIL != kb_accessors.transitive_predicateP( pred ) && NIL == kb_accessors.symmetric_predicateP( pred ) && NIL != transitivity.gtm( pred, $kw64$COMPLETES_CYCLE_, arg1, arg2, mt, UNPROVIDED, UNPROVIDED ) )
        {
          okP = NIL;
          if( NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue( thread ) )
          {
            at_vars.$at_predicate_violations$.setDynamicValue( transitivity.gtm( pred, $kw65$WHY_COMPLETES_CYCLE_, arg1, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
            if( NIL != at_vars.$at_predicate_violations$.getDynamicValue( thread ) )
            {
              at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.nconc( hl_supports.gaf_axioms_genl_mts( isa.why_isaP( pred, $const66$TransitiveBinaryPredicate, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
                  mt_relevance_macros.$mt$.getDynamicValue( thread ) ), at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
            }
          }
          final SubLObject _prev_bind_0_$65 = at_vars.$at_pred$.currentBinding( thread );
          try
          {
            at_vars.$at_pred$.bind( $const52$isa, thread );
            if( NIL != at_vars.$at_pred$.getDynamicValue( thread ) )
            {
              at_utilities.at_handle_mal_constraint( $const63$IrreflexiveBinaryPredicate );
            }
          }
          finally
          {
            at_vars.$at_pred$.rebind( _prev_bind_0_$65, thread );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 49156L)
  public static SubLObject gaf_ok_wrt_anti_transitive_predP(final SubLObject gaf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject violations = anti_transitive_violations( gaf, mt );
    if( NIL != violations && NIL != wff_macros.within_wffP() )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_pred$.currentBinding( thread );
      try
      {
        at_vars.$at_pred$.bind( $const52$isa, thread );
        if( NIL != at_vars.$at_pred$.getDynamicValue( thread ) )
        {
          final SubLObject _prev_bind_0_$66 = at_vars.$at_argnum$.currentBinding( thread );
          final SubLObject _prev_bind_2 = at_vars.$at_result$.currentBinding( thread );
          try
          {
            at_vars.$at_argnum$.bind( ZERO_INTEGER, thread );
            at_vars.$at_result$.bind( NIL, thread );
            at_utilities.at_handle_mal_constraint( $const67$AntiTransitiveBinaryPredicate );
          }
          finally
          {
            at_vars.$at_result$.rebind( _prev_bind_2, thread );
            at_vars.$at_argnum$.rebind( _prev_bind_0_$66, thread );
          }
        }
      }
      finally
      {
        at_vars.$at_pred$.rebind( _prev_bind_0, thread );
      }
    }
    return Types.sublisp_null( violations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 49575L)
  public static SubLObject anti_transitive_violations(final SubLObject gaf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject violations = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_reln$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_arg1$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$at_arg2$.currentBinding( thread );
    try
    {
      at_vars.$at_reln$.bind( cycl_utilities.reify_when_closed_naut( cycl_utilities.formula_arg0( gaf ) ), thread );
      at_vars.$at_arg1$.bind( cycl_utilities.reify_arg_when_closed_naut( gaf, ONE_INTEGER ), thread );
      at_vars.$at_arg2$.bind( cycl_utilities.reify_arg_when_closed_naut( gaf, TWO_INTEGER ), thread );
      final SubLObject _prev_bind_0_$67 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$68 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$69 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        violations = gather_anti_transitive_violations( at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_arg1$.getDynamicValue( thread ), at_vars.$at_arg2$.getDynamicValue( thread ) );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$69, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$68, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$67, thread );
      }
    }
    finally
    {
      at_vars.$at_arg2$.rebind( _prev_bind_3, thread );
      at_vars.$at_arg1$.rebind( _prev_bind_2, thread );
      at_vars.$at_reln$.rebind( _prev_bind_0, thread );
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 49977L)
  public static SubLObject gather_anti_transitive_violations(final SubLObject pred, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject violations = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding( thread );
    try
    {
      control_vars.$mapping_answer$.bind( NIL, thread );
      final SubLObject lookup_index = best_gaf_lookup_index_for_anti_transitive( el_utilities.make_binary_formula( pred, arg1, arg2 ), $kw54$TRUE, $list55 );
      final SubLObject index_type = kb_indexing.lookup_index_get_type( lookup_index );
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw56$AT_MAPPING_DONE );
        final SubLObject _prev_bind_0_$70 = at_vars.$within_at_mappingP$.currentBinding( thread );
        try
        {
          at_vars.$within_at_mappingP$.bind( T, thread );
          final SubLObject pcase_var = index_type;
          if( pcase_var.eql( $kw57$PREDICATE_EXTENT ) )
          {
            final SubLObject predicate = kb_indexing.lookup_index_predicate_extent_value( lookup_index );
            final SubLObject _prev_bind_0_$71 = control_vars.$mapping_pred$.currentBinding( thread );
            try
            {
              control_vars.$mapping_pred$.bind( predicate, thread );
              if( NIL != check_inter_assert_format_wXo_arg_indexP( at_vars.$at_formula$.getDynamicValue( thread ) ) )
              {
                final SubLObject _prev_bind_0_$72 = control_vars.$mapping_data_1$.currentBinding( thread );
                final SubLObject _prev_bind_2 = control_vars.$mapping_data_2$.currentBinding( thread );
                try
                {
                  control_vars.$mapping_data_1$.bind( NIL, thread );
                  control_vars.$mapping_data_2$.bind( NIL, thread );
                  kb_mapping.map_predicate_extent_index( $sym68$SELECT_ANTI_TRANSITIVE_PRED_VIOLATION_VIA_PRED, predicate, UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  control_vars.$mapping_data_2$.rebind( _prev_bind_2, thread );
                  control_vars.$mapping_data_1$.rebind( _prev_bind_0_$72, thread );
                }
              }
            }
            finally
            {
              control_vars.$mapping_pred$.rebind( _prev_bind_0_$71, thread );
            }
          }
          else if( pcase_var.eql( $kw59$GAF_ARG ) )
          {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values( lookup_index );
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$73 = control_vars.$mapping_pred$.currentBinding( thread );
            try
            {
              control_vars.$mapping_pred$.bind( predicate2, thread );
              final SubLObject pcase_var_$74 = argnum;
              if( pcase_var_$74.eql( ONE_INTEGER ) )
              {
                final SubLObject _prev_bind_0_$74 = control_vars.$mapping_target$.currentBinding( thread );
                try
                {
                  control_vars.$mapping_target$.bind( arg2, thread );
                  SubLObject cdolist_list_var = $list71;
                  SubLObject arg_binds = NIL;
                  arg_binds = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    SubLObject current;
                    final SubLObject datum = current = arg_binds;
                    final SubLObject _prev_bind_0_$75 = control_vars.$mapping_index_arg$.currentBinding( thread );
                    final SubLObject _prev_bind_3 = control_vars.$mapping_pivot_arg$.currentBinding( thread );
                    final SubLObject _prev_bind_4 = control_vars.$mapping_target_arg$.currentBinding( thread );
                    try
                    {
                      control_vars.$mapping_index_arg$.bind( NIL, thread );
                      control_vars.$mapping_pivot_arg$.bind( NIL, thread );
                      control_vars.$mapping_target_arg$.bind( NIL, thread );
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
                      control_vars.$mapping_index_arg$.setDynamicValue( current.first(), thread );
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
                      control_vars.$mapping_pivot_arg$.setDynamicValue( current.first(), thread );
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
                      control_vars.$mapping_target_arg$.setDynamicValue( current.first(), thread );
                      current = current.rest();
                      if( NIL == current )
                      {
                        kb_gp_mapping.gp_map_arg_index( $sym70$SEARCH_FOR_ANTI_TRANSITIVE_PRED_VIOLATION, v_term, control_vars.$mapping_index_arg$.getDynamicValue( thread ), control_vars.$mapping_pred$.getDynamicValue(
                            thread ) );
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum, $list69 );
                      }
                    }
                    finally
                    {
                      control_vars.$mapping_target_arg$.rebind( _prev_bind_4, thread );
                      control_vars.$mapping_pivot_arg$.rebind( _prev_bind_3, thread );
                      control_vars.$mapping_index_arg$.rebind( _prev_bind_0_$75, thread );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg_binds = cdolist_list_var.first();
                  }
                }
                finally
                {
                  control_vars.$mapping_target$.rebind( _prev_bind_0_$74, thread );
                }
              }
              else if( pcase_var_$74.eql( TWO_INTEGER ) )
              {
                final SubLObject _prev_bind_0_$76 = control_vars.$mapping_target$.currentBinding( thread );
                try
                {
                  control_vars.$mapping_target$.bind( arg1, thread );
                  SubLObject cdolist_list_var = $list72;
                  SubLObject arg_binds = NIL;
                  arg_binds = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    SubLObject current;
                    final SubLObject datum = current = arg_binds;
                    final SubLObject _prev_bind_0_$77 = control_vars.$mapping_index_arg$.currentBinding( thread );
                    final SubLObject _prev_bind_3 = control_vars.$mapping_pivot_arg$.currentBinding( thread );
                    final SubLObject _prev_bind_4 = control_vars.$mapping_target_arg$.currentBinding( thread );
                    try
                    {
                      control_vars.$mapping_index_arg$.bind( NIL, thread );
                      control_vars.$mapping_pivot_arg$.bind( NIL, thread );
                      control_vars.$mapping_target_arg$.bind( NIL, thread );
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
                      control_vars.$mapping_index_arg$.setDynamicValue( current.first(), thread );
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
                      control_vars.$mapping_pivot_arg$.setDynamicValue( current.first(), thread );
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
                      control_vars.$mapping_target_arg$.setDynamicValue( current.first(), thread );
                      current = current.rest();
                      if( NIL == current )
                      {
                        kb_gp_mapping.gp_map_arg_index( $sym70$SEARCH_FOR_ANTI_TRANSITIVE_PRED_VIOLATION, v_term, control_vars.$mapping_index_arg$.getDynamicValue( thread ), control_vars.$mapping_pred$.getDynamicValue(
                            thread ) );
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum, $list69 );
                      }
                    }
                    finally
                    {
                      control_vars.$mapping_target_arg$.rebind( _prev_bind_4, thread );
                      control_vars.$mapping_pivot_arg$.rebind( _prev_bind_3, thread );
                      control_vars.$mapping_index_arg$.rebind( _prev_bind_0_$77, thread );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg_binds = cdolist_list_var.first();
                  }
                }
                finally
                {
                  control_vars.$mapping_target$.rebind( _prev_bind_0_$76, thread );
                }
              }
            }
            finally
            {
              control_vars.$mapping_pred$.rebind( _prev_bind_0_$73, thread );
            }
          }
        }
        finally
        {
          at_vars.$within_at_mappingP$.rebind( _prev_bind_0_$70, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw56$AT_MAPPING_DONE );
      }
      finally
      {
        thread.throwStack.pop();
      }
      violations = control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    finally
    {
      control_vars.$mapping_answer$.rebind( _prev_bind_0, thread );
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 51632L)
  public static SubLObject best_gaf_lookup_index_for_anti_transitive(final SubLObject asent, final SubLObject truth, final SubLObject v_methods)
  {
    return kb_indexing.best_gaf_lookup_index( asent, truth, v_methods );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 52193L)
  public static SubLObject search_for_anti_transitive_pred_violation(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue( thread ) )
    {
      return search_for_anti_transitive_pred_violation_swap( assertion );
    }
    return search_for_anti_transitive_pred_violation_pivot( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 52437L)
  public static SubLObject search_for_anti_transitive_pred_violation_pivot(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_gaf_assertionP( assertion ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$mapping_path$.currentBinding( thread );
      try
      {
        control_vars.$mapping_path$.bind( assertion, thread );
        final SubLObject pivot_constant = assertions_high.gaf_arg( assertion, misc_utilities.other_binary_arg( control_vars.$mapping_index_arg$.getDynamicValue( thread ) ) );
        if( NIL != forts.fort_p( pivot_constant ) )
        {
          kb_gp_mapping.gp_map_arg_index( $sym73$SELECT_ANTI_TRANSITIVE_PRED_VIOLATION, pivot_constant, control_vars.$mapping_pivot_arg$.getDynamicValue( thread ), control_vars.$mapping_pred$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        control_vars.$mapping_path$.rebind( _prev_bind_0, thread );
      }
      return control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 52850L)
  public static SubLObject search_for_anti_transitive_pred_violation_swap(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_gaf_assertionP( assertion ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$mapping_path$.currentBinding( thread );
      try
      {
        control_vars.$mapping_path$.bind( assertion, thread );
        final SubLObject pivot_constant = assertions_high.gaf_arg( assertion, control_vars.$mapping_index_arg$.getDynamicValue( thread ) );
        final SubLObject pivot_index = misc_utilities.other_binary_arg( control_vars.$mapping_pivot_arg$.getDynamicValue( thread ) );
        if( NIL != forts.fort_p( pivot_constant ) )
        {
          kb_gp_mapping.gp_map_arg_index( $sym73$SELECT_ANTI_TRANSITIVE_PRED_VIOLATION, pivot_constant, pivot_index, control_vars.$mapping_pred$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        control_vars.$mapping_path$.rebind( _prev_bind_0, thread );
      }
      return control_vars.$mapping_answer$.getDynamicValue( thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 53362L)
  public static SubLObject select_anti_transitive_pred_violation(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_gaf_assertionP( assertion ) )
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject target_arg = ( NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue( thread ) ) ? misc_utilities.other_binary_arg( control_vars.$mapping_target_arg$.getDynamicValue( thread ) )
          : control_vars.$mapping_target_arg$.getDynamicValue( thread );
      if( control_vars.$mapping_target$.getDynamicValue( thread ).equal( el_utilities.literal_arg( gaf, target_arg, UNPROVIDED ) ) )
      {
        control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertion, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
        if( NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue( thread ) )
        {
          if( !control_vars.$mapping_pred$.getDynamicValue( thread ).equal( el_utilities.literal_predicate( gaf, UNPROVIDED ) ) )
          {
            SubLObject cdolist_list_var;
            final SubLObject accomplices = cdolist_list_var = hl_supports.gaf_axioms_genl_mts( genl_predicates.why_genl_predicateP( el_utilities.literal_predicate( gaf, UNPROVIDED ), control_vars.$mapping_pred$
                .getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), mt_relevance_macros.$mt$.getDynamicValue( thread ) );
            SubLObject accomplice = NIL;
            accomplice = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != term.kb_assertionP( accomplice ) )
              {
                final SubLObject item_var = accomplice;
                if( NIL == conses_high.member( item_var, at_vars.$at_predicate_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.cons( item_var, at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              accomplice = cdolist_list_var.first();
            }
          }
          if( NIL == conses_high.member( assertion, at_vars.$at_predicate_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.cons( assertion, at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
          }
          final SubLObject item_var2 = control_vars.$mapping_path$.getDynamicValue( thread );
          if( NIL == conses_high.member( item_var2, at_vars.$at_predicate_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.cons( item_var2, at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
          }
        }
        if( NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
        {
          at_utilities.at_mapping_finished();
        }
      }
    }
    return control_vars.$mapping_answer$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 54330L)
  public static SubLObject select_anti_transitive_pred_violation_via_pred(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_gaf_assertionP( assertion ) )
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject pred = el_utilities.literal_arg0( gaf, UNPROVIDED );
      final SubLObject arg1 = el_utilities.literal_arg1( gaf, UNPROVIDED );
      final SubLObject arg2 = el_utilities.literal_arg2( gaf, UNPROVIDED );
      if( arg1.equal( at_vars.$at_arg1$.getDynamicValue( thread ) ) )
      {
        control_vars.$mapping_data_1$.setDynamicValue( ConsesLow.cons( arg2, control_vars.$mapping_data_1$.getDynamicValue( thread ) ), thread );
        if( NIL != subl_promotions.memberP( arg2, control_vars.$mapping_data_2$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertion, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
          if( NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue( thread ) )
          {
            if( NIL == conses_high.member( assertion, at_vars.$at_predicate_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.cons( assertion, at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
            }
            final SubLObject _prev_bind_0 = at_vars.$fag_search_limit$.currentBinding( thread );
            try
            {
              at_vars.$fag_search_limit$.bind( NIL, thread );
              final SubLObject accomplice = find_accessible_gaf( ConsesLow.list( pred, arg2, at_vars.$at_arg2$.getDynamicValue( thread ) ), ZERO_INTEGER, UNPROVIDED, UNPROVIDED );
              if( NIL != accomplice )
              {
                final SubLObject item_var = accomplice;
                if( NIL == conses_high.member( item_var, at_vars.$at_predicate_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.cons( item_var, at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
                }
              }
            }
            finally
            {
              at_vars.$fag_search_limit$.rebind( _prev_bind_0, thread );
            }
          }
          if( NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
          {
            at_utilities.at_mapping_finished();
          }
        }
      }
      if( arg2.equal( at_vars.$at_arg2$.getDynamicValue( thread ) ) )
      {
        control_vars.$mapping_data_2$.setDynamicValue( ConsesLow.cons( arg1, control_vars.$mapping_data_2$.getDynamicValue( thread ) ), thread );
        if( NIL != subl_promotions.memberP( arg1, control_vars.$mapping_data_1$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          control_vars.$mapping_answer$.setDynamicValue( ConsesLow.cons( assertion, control_vars.$mapping_answer$.getDynamicValue( thread ) ), thread );
          if( NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue( thread ) )
          {
            if( NIL == conses_high.member( assertion, at_vars.$at_predicate_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.cons( assertion, at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
            }
            final SubLObject _prev_bind_0 = at_vars.$fag_search_limit$.currentBinding( thread );
            try
            {
              at_vars.$fag_search_limit$.bind( NIL, thread );
              final SubLObject accomplice = find_accessible_gaf( ConsesLow.list( pred, at_vars.$at_arg1$.getDynamicValue( thread ), arg1 ), ZERO_INTEGER, UNPROVIDED, UNPROVIDED );
              if( NIL != accomplice )
              {
                final SubLObject item_var = accomplice;
                if( NIL == conses_high.member( item_var, at_vars.$at_predicate_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.cons( item_var, at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
                }
              }
            }
            finally
            {
              at_vars.$fag_search_limit$.rebind( _prev_bind_0, thread );
            }
          }
          if( NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
          {
            at_utilities.at_mapping_finished();
          }
        }
      }
    }
    return control_vars.$mapping_answer$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 55606L)
  public static SubLObject find_accessible_gaf(final SubLObject gaf_formula, SubLObject index, SubLObject mt, SubLObject truth)
  {
    if( index == UNPROVIDED )
    {
      index = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw54$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertion = NIL;
    final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding( thread );
    try
    {
      control_vars.$mapping_target$.bind( gaf_formula, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$79 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        final SubLObject obfuscated_formula = removal_modules_genlpreds_lookup.obfuscate_predicate( gaf_formula );
        if( NIL == cycl_utilities.expression_find_if( $sym74$UNREIFIED_SKOLEM_TERM_, gaf_formula, NIL, UNPROVIDED ) )
        {
          final SubLObject _prev_bind_0_$80 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$81 = pred_relevance_macros.$pred$.currentBinding( thread );
          try
          {
            pred_relevance_macros.$relevant_pred_function$.bind( $sym75$RELEVANT_PRED_IS_SPEC_PRED, thread );
            pred_relevance_macros.$pred$.bind( cycl_utilities.atomic_sentence_predicate( gaf_formula ), thread );
            final SubLObject l_index = kb_indexing.best_gaf_lookup_index( obfuscated_formula, truth, NIL );
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
            if( pcase_var.eql( $kw59$GAF_ARG ) )
            {
              thread.resetMultipleValues();
              final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
              final SubLObject argnum = thread.secondMultipleValue();
              final SubLObject predicate = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              if( NIL != argnum )
              {
                if( NIL != predicate )
                {
                  final SubLObject pred_var = predicate;
                  if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
                  {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
                    SubLObject done_var = assertion;
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw76$GAF, truth, NIL );
                          SubLObject done_var_$82 = assertion;
                          final SubLObject token_var_$83 = NIL;
                          while ( NIL == done_var_$82)
                          {
                            final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$83 );
                            final SubLObject valid_$84 = makeBoolean( !token_var_$83.eql( as ) );
                            if( NIL != valid_$84 )
                            {
                              assertion = select_target_gaf( as );
                            }
                            done_var_$82 = makeBoolean( NIL == valid_$84 || NIL != assertion );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$81, thread );
                          }
                        }
                      }
                      done_var = makeBoolean( NIL == valid || NIL != assertion );
                    }
                  }
                }
                else
                {
                  final SubLObject pred_var = NIL;
                  if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
                  {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
                    SubLObject done_var = assertion;
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw76$GAF, truth, NIL );
                          SubLObject done_var_$83 = assertion;
                          final SubLObject token_var_$84 = NIL;
                          while ( NIL == done_var_$83)
                          {
                            final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$84 );
                            final SubLObject valid_$85 = makeBoolean( !token_var_$84.eql( as ) );
                            if( NIL != valid_$85 )
                            {
                              assertion = select_target_gaf( as );
                            }
                            done_var_$83 = makeBoolean( NIL == valid_$85 || NIL != assertion );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if( NIL != final_index_iterator )
                            {
                              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                            }
                            Values.restoreValuesFromVector( _values2 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$82, thread );
                          }
                        }
                      }
                      done_var = makeBoolean( NIL == valid || NIL != assertion );
                    }
                  }
                }
              }
              else if( NIL != predicate )
              {
                final SubLObject pred_var = predicate;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
                  SubLObject done_var = assertion;
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw76$GAF, truth, NIL );
                        SubLObject done_var_$84 = assertion;
                        final SubLObject token_var_$85 = NIL;
                        while ( NIL == done_var_$84)
                        {
                          final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$85 );
                          final SubLObject valid_$86 = makeBoolean( !token_var_$85.eql( as ) );
                          if( NIL != valid_$86 )
                          {
                            assertion = select_target_gaf( as );
                          }
                          done_var_$84 = makeBoolean( NIL == valid_$86 || NIL != assertion );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values3 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                          }
                          Values.restoreValuesFromVector( _values3 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$83, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid || NIL != assertion );
                  }
                }
              }
              else
              {
                final SubLObject pred_var = NIL;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
                  SubLObject done_var = assertion;
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw76$GAF, truth, NIL );
                        SubLObject done_var_$85 = assertion;
                        final SubLObject token_var_$86 = NIL;
                        while ( NIL == done_var_$85)
                        {
                          final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$86 );
                          final SubLObject valid_$87 = makeBoolean( !token_var_$86.eql( as ) );
                          if( NIL != valid_$87 )
                          {
                            assertion = select_target_gaf( as );
                          }
                          done_var_$85 = makeBoolean( NIL == valid_$87 || NIL != assertion );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values4 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                          }
                          Values.restoreValuesFromVector( _values4 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$84, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid || NIL != assertion );
                  }
                }
              }
            }
            else if( pcase_var.eql( $kw57$PREDICATE_EXTENT ) )
            {
              final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
              if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
              {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$85 = utilities_macros.$progress_start_time$.currentBinding( thread );
                final SubLObject _prev_bind_1_$82 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
                try
                {
                  utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
                  utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
                  utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
                  utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
                  utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
                  utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
                  utilities_macros.$is_noting_progressP$.bind( T, thread );
                  utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
                  utilities_macros.noting_progress_preamble( str );
                  final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
                  SubLObject done_var2 = assertion;
                  final SubLObject token_var2 = NIL;
                  while ( NIL == done_var2)
                  {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                    final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                    if( NIL != valid2 )
                    {
                      utilities_macros.note_progress();
                      SubLObject final_index_iterator2 = NIL;
                      try
                      {
                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw76$GAF, truth, NIL );
                        SubLObject done_var_$86 = assertion;
                        final SubLObject token_var_$87 = NIL;
                        while ( NIL == done_var_$86)
                        {
                          final SubLObject as2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$87 );
                          final SubLObject valid_$88 = makeBoolean( !token_var_$87.eql( as2 ) );
                          if( NIL != valid_$88 )
                          {
                            assertion = select_target_gaf( as2 );
                          }
                          done_var_$86 = makeBoolean( NIL == valid_$88 || NIL != assertion );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values5 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator2 )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                          }
                          Values.restoreValuesFromVector( _values5 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$86, thread );
                        }
                      }
                    }
                    done_var2 = makeBoolean( NIL == valid2 || NIL != assertion );
                  }
                  utilities_macros.noting_progress_postamble();
                }
                finally
                {
                  utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
                  utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
                  utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
                  utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
                  utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
                  utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
                  utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$82, thread );
                  utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$85, thread );
                }
              }
            }
            else if( pcase_var.eql( $kw77$OVERLAP ) )
            {
              SubLObject rest;
              SubLObject as3;
              for( rest = NIL, rest = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED ); NIL == assertion && NIL != rest; rest = rest.rest() )
              {
                as3 = rest.first();
                if( NIL == truth || NIL != assertions_high.assertion_has_truth( as3, truth ) )
                {
                  assertion = select_target_gaf( as3 );
                }
              }
            }
            else
            {
              kb_mapping_macros.do_gli_method_error( l_index, method );
            }
          }
          finally
          {
            pred_relevance_macros.$pred$.rebind( _prev_bind_1_$81, thread );
            pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0_$80, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$79, thread );
      }
    }
    finally
    {
      control_vars.$mapping_target$.rebind( _prev_bind_0, thread );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 56276L)
  public static SubLObject select_target_gaf(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_gaf_assertionP( assertion ) )
    {
      final SubLObject gaf_formula = assertions_high.gaf_formula( assertion );
      if( el_utilities.literal_args( control_vars.$mapping_target$.getDynamicValue( thread ), UNPROVIDED ).equal( el_utilities.literal_args( gaf_formula, UNPROVIDED ) ) && ( el_utilities.literal_predicate(
          control_vars.$mapping_target$.getDynamicValue( thread ), UNPROVIDED ).equal( el_utilities.literal_predicate( gaf_formula, UNPROVIDED ) ) || NIL != genl_predicates.genl_predicateP( el_utilities
              .literal_predicate( control_vars.$mapping_target$.getDynamicValue( thread ), UNPROVIDED ), el_utilities.literal_predicate( gaf_formula, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) ) )
      {
        return assertion;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 56719L)
  public static SubLObject gaf_ok_wrt_negation_predsP(final SubLObject gaf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.reify_arg_when_closed_naut( gaf, ZERO_INTEGER );
    final SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut( gaf, ONE_INTEGER );
    final SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut( gaf, TWO_INTEGER );
    SubLObject violations = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      violations = negation_pred_violations( pred, arg1, arg2 );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Types.sublisp_null( violations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 57221L)
  public static SubLObject negation_pred_violations(final SubLObject pred, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject doneP = NIL;
    SubLObject violations = NIL;
    final SubLObject args = Sequences.remove( NIL, ConsesLow.list( arg1, arg2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == doneP )
    {
      SubLObject csome_list_var = negation_predicate.max_negation_preds( pred, UNPROVIDED );
      SubLObject negation_pred = NIL;
      negation_pred = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        final SubLObject assertion = find_accessible_gaf( czer_main.canonicalize_literal_commutative_terms( el_utilities.make_el_literal( negation_pred, args, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != term.kb_assertionP( assertion ) )
        {
          final SubLObject _prev_bind_0 = at_vars.$gather_at_predicate_violationsP$.currentBinding( thread );
          final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding( thread );
          try
          {
            at_vars.$gather_at_predicate_violationsP$.bind( T, thread );
            at_vars.$at_predicate_violations$.bind( NIL, thread );
            final SubLObject item_var = assertion;
            if( NIL == conses_high.member( item_var, at_vars.$at_predicate_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.cons( item_var, at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
            }
            final SubLObject _prev_bind_0_$104 = at_vars.$at_pred$.currentBinding( thread );
            try
            {
              at_vars.$at_pred$.bind( $const78$negationPreds, thread );
              if( NIL != at_vars.$at_pred$.getDynamicValue( thread ) )
              {
                at_utilities.at_handle_mal_constraint( negation_pred );
              }
            }
            finally
            {
              at_vars.$at_pred$.rebind( _prev_bind_0_$104, thread );
            }
          }
          finally
          {
            at_vars.$at_predicate_violations$.rebind( _prev_bind_2, thread );
            at_vars.$gather_at_predicate_violationsP$.rebind( _prev_bind_0, thread );
          }
          violations = ConsesLow.cons( negation_pred, violations );
          if( NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
          {
            doneP = T;
          }
        }
        csome_list_var = csome_list_var.rest();
        negation_pred = csome_list_var.first();
      }
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 57937L)
  public static SubLObject gaf_ok_wrt_negation_inversesP(final SubLObject gaf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.reify_arg_when_closed_naut( gaf, ZERO_INTEGER );
    final SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut( gaf, ONE_INTEGER );
    final SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut( gaf, TWO_INTEGER );
    SubLObject violations = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      violations = negation_inverse_violations( pred, arg1, arg2 );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Types.sublisp_null( violations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 58368L)
  public static SubLObject negation_inverse_violations(final SubLObject pred, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject doneP = NIL;
    SubLObject violations = NIL;
    if( NIL != arg1 && NIL != arg2 )
    {
      final SubLObject args = ConsesLow.list( arg2, arg1 );
      if( NIL == doneP )
      {
        SubLObject csome_list_var = negation_predicate.max_negation_inverses( pred, UNPROVIDED );
        SubLObject negation_inverse = NIL;
        negation_inverse = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          final SubLObject assertion = find_accessible_gaf( czer_main.canonicalize_literal_commutative_terms( el_utilities.make_el_literal( negation_inverse, args, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL != term.kb_assertionP( assertion ) )
          {
            final SubLObject _prev_bind_0 = at_vars.$gather_at_predicate_violationsP$.currentBinding( thread );
            final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding( thread );
            try
            {
              at_vars.$gather_at_predicate_violationsP$.bind( T, thread );
              at_vars.$at_predicate_violations$.bind( NIL, thread );
              final SubLObject item_var = assertion;
              if( NIL == conses_high.member( item_var, at_vars.$at_predicate_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                at_vars.$at_predicate_violations$.setDynamicValue( ConsesLow.cons( item_var, at_vars.$at_predicate_violations$.getDynamicValue( thread ) ), thread );
              }
              final SubLObject _prev_bind_0_$105 = at_vars.$at_pred$.currentBinding( thread );
              try
              {
                at_vars.$at_pred$.bind( $const79$negationInverse, thread );
                if( NIL != at_vars.$at_pred$.getDynamicValue( thread ) )
                {
                  at_utilities.at_handle_mal_constraint( negation_inverse );
                }
              }
              finally
              {
                at_vars.$at_pred$.rebind( _prev_bind_0_$105, thread );
              }
            }
            finally
            {
              at_vars.$at_predicate_violations$.rebind( _prev_bind_2, thread );
              at_vars.$gather_at_predicate_violationsP$.rebind( _prev_bind_0, thread );
            }
            violations = ConsesLow.cons( negation_inverse, violations );
            if( NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
            {
              doneP = T;
            }
          }
          csome_list_var = csome_list_var.rest();
          negation_inverse = csome_list_var.first();
        }
      }
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 59094L)
  public static SubLObject clear_cached_format_okP()
  {
    final SubLObject cs = $cached_format_okP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 59094L)
  public static SubLObject remove_cached_format_okP(final SubLObject format)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_format_okP_caching_state$.getGlobalValue(), ConsesLow.list( format ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 59094L)
  public static SubLObject cached_format_okP_internal(final SubLObject format)
  {
    return at_format_okP( format, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 59094L)
  public static SubLObject cached_format_okP(final SubLObject format)
  {
    SubLObject caching_state = $cached_format_okP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym80$CACHED_FORMAT_OK_, $sym81$_CACHED_FORMAT_OK__CACHING_STATE_, $int82$128, EQL, ONE_INTEGER, EIGHT_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, format, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_format_okP_internal( format ) ) );
      memoization_state.caching_state_put( caching_state, format, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 59283L)
  public static SubLObject memoized_format_okP_internal(final SubLObject format, final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    return at_format_okP( format, literal, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 59283L)
  public static SubLObject memoized_format_okP(final SubLObject format, final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_format_okP_internal( format, literal, argnum, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym83$MEMOIZED_FORMAT_OK_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym83$MEMOIZED_FORMAT_OK_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym83$MEMOIZED_FORMAT_OK_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( format, literal, argnum, mt );
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
        if( format.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( literal.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( argnum.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_format_okP_internal( format, literal, argnum, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( format, literal, argnum, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 59466L)
  public static SubLObject at_format_okP(final SubLObject format, SubLObject literal, SubLObject argnum, SubLObject mt)
  {
    if( literal == UNPROVIDED )
    {
      literal = at_vars.$at_formula$.getDynamicValue();
    }
    if( argnum == UNPROVIDED )
    {
      argnum = at_vars.$at_argnum$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( format.eql( $const84$SingleEntry ) )
    {
      return single_entry_okP( literal, argnum, mt );
    }
    if( format.eql( $const85$IntervalEntry ) )
    {
      return interval_entry_okP( literal, argnum, mt );
    }
    if( format.eql( $const86$SetTheFormat ) )
    {
      return set_entry_okP( literal, argnum, mt );
    }
    if( format.eql( $const87$singleEntryFormatInArgs ) )
    {
      return single_entry_okP( literal, argnum, mt );
    }
    if( format.eql( $const88$intervalEntryFormatInArgs ) )
    {
      return interval_entry_okP( literal, argnum, mt );
    }
    if( format.eql( $const89$openEntryFormatInArgs ) )
    {
      return set_entry_okP( literal, argnum, mt );
    }
    if( format.eql( $const90$temporallyIntersectingEntryFormat ) )
    {
      return temporally_intersecting_okP( literal, argnum, mt );
    }
    if( format.eql( $const91$spatiallyIntersectingEntryFormatI ) )
    {
      return spatially_intersecting_okP( literal, argnum, mt );
    }
    if( format.eql( $const92$spatioTemporallyIntersectingEntry ) )
    {
      return spatio_temporally__intersecting_okP( literal, argnum, mt );
    }
    el_utilities.el_error( THREE_INTEGER, $str93$unknown_entry_format___s, format, UNPROVIDED, UNPROVIDED );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 60560L)
  public static SubLObject single_entry_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    return Types.sublisp_null( sef_violations( literal, argnum, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 60927L)
  public static SubLObject literal_single_entry_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    return single_entry_okP( literal, argnum, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 61195L)
  public static SubLObject why_not_literal_single_entry_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt, SubLObject assertion)
  {
    if( assertion == UNPROVIDED )
    {
      assertion = czer_meta.find_assertion_cycl( literal, mt );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject violations = NIL;
    final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    try
    {
      at_vars.$accumulating_at_violationsP$.bind( T, thread );
      violations = sef_violations( literal, argnum, mt );
    }
    finally
    {
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != violations )
    {
      final SubLObject var = assertion;
      if( NIL != var )
      {
        violations = ConsesLow.cons( var, violations );
      }
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 61568L)
  public static SubLObject sef_violations(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject violations = NIL;
    final SubLObject find_formula = list_utilities.replace_nth( argnum, variables.find_variable_by_id( ZERO_INTEGER ), literal );
    final SubLObject arg = cycl_utilities.reify_arg_when_closed_naut( literal, argnum );
    if( NIL == wff_vars.validating_expansionP() || NIL == unification_utilities.asent_unify( wff_vars.unexpanded_formula(), find_formula, T, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        final SubLObject lookup_index = kb_indexing.best_gaf_lookup_index( find_formula, $kw54$TRUE, $list55 );
        final SubLObject index_type = kb_indexing.lookup_index_get_type( lookup_index );
        SubLObject doneP = NIL;
        SubLObject catch_var = NIL;
        try
        {
          thread.throwStack.push( $kw56$AT_MAPPING_DONE );
          final SubLObject _prev_bind_0_$106 = at_vars.$within_at_mappingP$.currentBinding( thread );
          try
          {
            at_vars.$within_at_mappingP$.bind( T, thread );
            final SubLObject pcase_var = index_type;
            if( pcase_var.eql( $kw57$PREDICATE_EXTENT ) )
            {
              final SubLObject predicate = kb_indexing.lookup_index_predicate_extent_value( lookup_index );
              if( NIL != check_inter_assert_format_wXo_arg_indexP( find_formula ) )
              {
                final SubLObject pred_var = predicate;
                if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
                {
                  final SubLObject str = NIL;
                  final SubLObject _prev_bind_0_$107 = utilities_macros.$progress_start_time$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$108 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$109 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
                  final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
                  final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
                  final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
                  final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
                    utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$is_noting_progressP$.bind( T, thread );
                    utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
                    utilities_macros.noting_progress_preamble( str );
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
                    SubLObject done_var = doneP;
                    final SubLObject token_var = NIL;
                    while ( NIL == done_var)
                    {
                      final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                      final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                      if( NIL != valid )
                      {
                        utilities_macros.note_progress();
                        SubLObject final_index_iterator = NIL;
                        try
                        {
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw76$GAF, NIL, NIL );
                          SubLObject done_var_$110 = doneP;
                          final SubLObject token_var_$111 = NIL;
                          while ( NIL == done_var_$110)
                          {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$111 );
                            final SubLObject valid_$112 = makeBoolean( !token_var_$111.eql( assertion ) );
                            if( NIL != valid_$112 && NIL != sef_violating_assertionP( assertion, find_formula, arg, argnum ) )
                            {
                              violations = ConsesLow.cons( assertion, violations );
                              if( NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
                              {
                                doneP = T;
                              }
                            }
                            done_var_$110 = makeBoolean( NIL == valid_$112 || NIL != doneP );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$108 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$108, thread );
                          }
                        }
                      }
                      done_var = makeBoolean( NIL == valid || NIL != doneP );
                    }
                    utilities_macros.noting_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
                    utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
                    utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
                    utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$109, thread );
                    utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$108, thread );
                    utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$107, thread );
                  }
                }
              }
            }
            else if( pcase_var.eql( $kw59$GAF_ARG ) )
            {
              thread.resetMultipleValues();
              final SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values( lookup_index );
              final SubLObject largnum = thread.secondMultipleValue();
              final SubLObject predicate2 = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              final SubLObject pred_var2 = predicate2;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, largnum, pred_var2 ) )
              {
                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, largnum, pred_var2 );
                SubLObject done_var2 = doneP;
                final SubLObject token_var2 = NIL;
                while ( NIL == done_var2)
                {
                  final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                  final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                  if( NIL != valid2 )
                  {
                    SubLObject final_index_iterator2 = NIL;
                    try
                    {
                      final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw76$GAF, NIL, NIL );
                      SubLObject done_var_$111 = doneP;
                      final SubLObject token_var_$112 = NIL;
                      while ( NIL == done_var_$111)
                      {
                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$112 );
                        final SubLObject valid_$113 = makeBoolean( !token_var_$112.eql( assertion2 ) );
                        if( NIL != valid_$113 && NIL != sef_violating_assertionP( assertion2, find_formula, arg, argnum ) )
                        {
                          violations = ConsesLow.cons( assertion2, violations );
                          if( NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
                          {
                            doneP = T;
                          }
                        }
                        done_var_$111 = makeBoolean( NIL == valid_$113 || NIL != doneP );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if( NIL != final_index_iterator2 )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                        }
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$109, thread );
                      }
                    }
                  }
                  done_var2 = makeBoolean( NIL == valid2 || NIL != doneP );
                }
              }
            }
          }
          finally
          {
            at_vars.$within_at_mappingP$.rebind( _prev_bind_0_$106, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          catch_var = Errors.handleThrowable( ccatch_env_var, $kw56$AT_MAPPING_DONE );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 63654L)
  public static SubLObject check_inter_assert_format_wXo_arg_indexP(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_vars.$at_check_inter_assert_format_wXo_arg_indexP$.getDynamicValue( thread ) && NIL != formula )
    {
      if( !at_vars.$at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$.getDynamicValue( thread ).isNumber() )
      {
        return T;
      }
      final SubLObject predicate = el_utilities.literal_predicate( formula, UNPROVIDED );
      final SubLObject gaf_count = ( NIL != forts.fort_p( predicate ) ) ? kb_indexing.relevant_num_predicate_extent_index( predicate ) : NIL;
      if( gaf_count.isNumber() )
      {
        return Numbers.numGE( at_vars.$at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$.getDynamicValue( thread ), gaf_count );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 64153L)
  public static SubLObject sef_violating_assertionP(final SubLObject assertion, final SubLObject find_formula, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_gaf_assertionP( assertion ) && NIL != assertion_utilities.true_assertionP( assertion ) )
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      if( NIL != unification_utilities.asent_unify( find_formula, gaf, T, UNPROVIDED ) )
      {
        if( NIL != wff_vars.wff_assertiveP() && NIL != isa.quoted_isaP( arg, $const94$IndeterminateTerm, UNPROVIDED, UNPROVIDED ) && NIL == equals.differentP_binary( arg, assertions_high.gaf_arg( assertion, argnum ),
            UNPROVIDED ) )
        {
          return NIL;
        }
        if( NIL == equals.equalsP( arg, cycl_utilities.reify_arg_when_closed_naut( gaf, argnum ), UNPROVIDED, UNPROVIDED ) )
        {
          if( NIL != at_vars.$gather_at_format_violationsP$.getDynamicValue( thread ) && NIL == conses_high.member( assertion, at_vars.$at_format_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ),
              Symbols.symbol_function( IDENTITY ) ) )
          {
            at_vars.$at_format_violations$.setDynamicValue( ConsesLow.cons( assertion, at_vars.$at_format_violations$.getDynamicValue( thread ) ), thread );
          }
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 64783L)
  public static SubLObject temporally_intersecting_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    return Types.sublisp_null( tief_violations( literal, argnum, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 64900L)
  public static SubLObject tief_violations(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject violations = NIL;
    final SubLObject find_formula = list_utilities.replace_nth( argnum, variables.find_variable_by_id( ZERO_INTEGER ), literal );
    final SubLObject arg = cycl_utilities.reify_arg_when_closed_naut( literal, argnum );
    if( NIL == wff_vars.validating_expansionP() || NIL == unification_utilities.asent_unify( wff_vars.unexpanded_formula(), find_formula, T, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
        final SubLObject lookup_index = kb_indexing.best_gaf_lookup_index( find_formula, $kw54$TRUE, $list55 );
        final SubLObject index_type = kb_indexing.lookup_index_get_type( lookup_index );
        SubLObject doneP = NIL;
        final SubLObject pcase_var = index_type;
        if( pcase_var.eql( $kw57$PREDICATE_EXTENT ) )
        {
          final SubLObject predicate = kb_indexing.lookup_index_predicate_extent_value( lookup_index );
          if( NIL != check_inter_assert_format_wXo_arg_indexP( find_formula ) )
          {
            final SubLObject pred_var = predicate;
            if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
            {
              final SubLObject str = NIL;
              final SubLObject _prev_bind_0_$118 = utilities_macros.$progress_start_time$.currentBinding( thread );
              final SubLObject _prev_bind_1_$119 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
              final SubLObject _prev_bind_2_$120 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
              final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
              final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
              final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
              final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
              final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
              try
              {
                utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
                utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
                utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
                utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
                utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
                utilities_macros.$is_noting_progressP$.bind( T, thread );
                utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
                utilities_macros.noting_progress_preamble( str );
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
                SubLObject done_var = doneP;
                final SubLObject token_var = NIL;
                while ( NIL == done_var)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                  final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid )
                  {
                    utilities_macros.note_progress();
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw76$GAF, NIL, NIL );
                      SubLObject done_var_$121 = doneP;
                      final SubLObject token_var_$122 = NIL;
                      while ( NIL == done_var_$121)
                      {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$122 );
                        final SubLObject valid_$123 = makeBoolean( !token_var_$122.eql( assertion ) );
                        if( NIL != valid_$123 && NIL != tief_violating_assertionP( assertion, find_formula, arg, argnum ) )
                        {
                          violations = ConsesLow.cons( assertion, violations );
                          if( NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
                          {
                            doneP = T;
                          }
                        }
                        done_var_$121 = makeBoolean( NIL == valid_$123 || NIL != doneP );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$119 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$119, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid || NIL != doneP );
                }
                utilities_macros.noting_progress_postamble();
              }
              finally
              {
                utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
                utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
                utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
                utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
                utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$120, thread );
                utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$119, thread );
                utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$118, thread );
              }
            }
          }
        }
        else if( pcase_var.eql( $kw59$GAF_ARG ) )
        {
          thread.resetMultipleValues();
          final SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values( lookup_index );
          final SubLObject largnum = thread.secondMultipleValue();
          final SubLObject predicate2 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          final SubLObject pred_var2 = predicate2;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, largnum, pred_var2 ) )
          {
            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, largnum, pred_var2 );
            SubLObject done_var2 = doneP;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw76$GAF, NIL, NIL );
                  SubLObject done_var_$122 = doneP;
                  final SubLObject token_var_$123 = NIL;
                  while ( NIL == done_var_$122)
                  {
                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$123 );
                    final SubLObject valid_$124 = makeBoolean( !token_var_$123.eql( assertion2 ) );
                    if( NIL != valid_$124 && NIL != tief_violating_assertionP( assertion2, find_formula, arg, argnum ) )
                    {
                      violations = ConsesLow.cons( assertion2, violations );
                      if( NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue( thread ) )
                      {
                        doneP = T;
                      }
                    }
                    done_var_$122 = makeBoolean( NIL == valid_$124 || NIL != doneP );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$120 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$120, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 || NIL != doneP );
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return violations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 66817L)
  public static SubLObject tief_violating_assertionP(final SubLObject assertion, final SubLObject find_formula, final SubLObject arg, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != at_gaf_assertionP( assertion ) )
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      if( NIL != unification_utilities.asent_unify( find_formula, gaf, T, UNPROVIDED ) && NIL != sbhl_time_modules.temporally_disjointP( arg, el_utilities.literal_arg( gaf, argnum, UNPROVIDED ), UNPROVIDED ) )
      {
        if( NIL != at_vars.$gather_at_format_violationsP$.getDynamicValue( thread ) && NIL == conses_high.member( assertion, at_vars.$at_format_violations$.getDynamicValue( thread ), Symbols.symbol_function( EQL ),
            Symbols.symbol_function( IDENTITY ) ) )
        {
          at_vars.$at_format_violations$.setDynamicValue( ConsesLow.cons( assertion, at_vars.$at_format_violations$.getDynamicValue( thread ) ), thread );
        }
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 67217L)
  public static SubLObject spatially_intersecting_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    return Types.sublisp_null( sief_violations( literal, argnum, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 67334L)
  public static SubLObject sief_violations(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 69334L)
  public static SubLObject sief_violating_assertionP(final SubLObject assertion, final SubLObject find_formula, final SubLObject arg, final SubLObject argnum)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 69784L)
  public static SubLObject spatio_temporally__intersecting_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    return Types.sublisp_null( stief_violations( literal, argnum, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 69910L)
  public static SubLObject stief_violations(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    final SubLObject tief_violations = tief_violations( literal, argnum, mt );
    final SubLObject sief_violations = sief_violations( literal, argnum, mt );
    return ConsesLow.append( tief_violations, sief_violations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 70139L)
  public static SubLObject interval_entry_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 70289L)
  public static SubLObject set_entry_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 70378L)
  public static SubLObject variable_wrt_arg_typeP(final SubLObject arg)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == wff_vars.$recognize_variablesP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( NIL != variable_term_wrt_arg_typeP( arg ) )
    {
      return T;
    }
    if( NIL != term.first_order_nautP( arg ) && ( NIL != kb_accessors.result_isaP( cycl_utilities.nat_functor( arg ), UNPROVIDED ) || NIL != kb_accessors.result_isa_argP( cycl_utilities.nat_functor( arg ), UNPROVIDED )
        || NIL != kb_accessors.result_isa_arg_arg_isaP( arg, UNPROVIDED ) ) )
    {
      return NIL;
    }
    if( NIL != term.nautP( arg, UNPROVIDED ) && NIL != cycl_utilities.formula_find_if( $sym27$VARIABLE_TERM_WRT_ARG_TYPE_, arg, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 71546L)
  public static SubLObject variable_term_wrt_arg_typeP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != cycl_variables.el_varP( v_term ) || NIL != cycl_variables.kb_varP( v_term ) || ( NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue( thread ) && NIL != at_admitted
        .generic_arg_p( v_term ) ) || ( NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue( thread ) && v_term.isKeyword() ) || NIL != term.reified_skolem_termP( v_term ) || NIL != term.unreified_skolem_termP(
            v_term ) || ( NIL != kb_control_vars.$relax_type_restrictions_for_nats$.getDynamicValue( thread ) && NIL != nart_handles.nart_p( v_term ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 72293L)
  public static SubLObject naut_wrt_arg_typeP(final SubLObject v_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( ( NIL != at_vars.$within_decontextualizedP$.getDynamicValue( thread ) && NIL != narts_high.naut_p( v_term ) ) || ( NIL == nart_handles.nart_p( v_term ) && NIL != term.function_termP( v_term )
        && ( NIL != forts.fort_p( cycl_utilities.nat_functor( v_term ) ) || NIL == czer_utilities.leave_some_terms_at_el_for_argP( at_vars.$at_reln$.getDynamicValue( thread ), at_vars.$at_argnum$.getDynamicValue(
            thread ), mt ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 72916L)
  public static SubLObject tou_wrt_arg_typeP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eql( at_vars.$at_reln$.getDynamicValue( thread ), $const10$termOfUnit );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 73012L)
  public static SubLObject nat_function_wrt_arg_typeP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eql( at_vars.$at_reln$.getDynamicValue( thread ), $const95$natFunction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 73118L)
  public static SubLObject nat_argument_wrt_arg_typeP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eql( at_vars.$at_reln$.getDynamicValue( thread ), $const96$natArgument );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 73224L)
  public static SubLObject strong_fort_wrt_arg_typeP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return forts.fort_p( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 73324L)
  public static SubLObject lenient_fort_wrt_arg_typeP(final SubLObject v_term)
  {
    return makeBoolean( NIL != forts.fort_p( v_term ) && NIL != wff_vars.wff_lenientP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 73517L)
  public static SubLObject weak_fort_wrt_arg_typeP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( ( ( NIL != at_vars.$appraising_disjunctP$.getDynamicValue( thread ) || NIL != at_vars.$within_decontextualizedP$.getDynamicValue( thread ) ) && NIL != forts.fort_p( v_term ) )
        || ( NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue( thread ) && ( NIL != nart_handles.nart_p( v_term ) || ( NIL != czer_utilities.reifiable_nautP( v_term, UNPROVIDED, UNPROVIDED )
            && NIL != narts_high.find_nart( v_term ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 73791L)
  public static SubLObject semantically_valid_dnfP(final SubLObject dnf, SubLObject mt, SubLObject varP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym97$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != dnf )
    {
      at_utilities.reset_semantic_violations( UNPROVIDED );
      SubLObject neg_lits = NIL;
      SubLObject pos_lits = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( dnf, dnf, $list98 );
      neg_lits = dnf.first();
      SubLObject current = dnf.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, dnf, $list98 );
      pos_lits = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject invalidP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
        final SubLObject _prev_bind_2 = wff_vars.$provide_wff_suggestionsP$.currentBinding( thread );
        try
        {
          at_vars.$accumulating_at_violationsP$.bind( NIL, thread );
          wff_vars.$provide_wff_suggestionsP$.bind( NIL, thread );
          if( NIL == neg_lits )
          {
            if( NIL == invalidP )
            {
              SubLObject csome_list_var = pos_lits;
              SubLObject lit = NIL;
              lit = csome_list_var.first();
              while ( NIL == invalidP && NIL != csome_list_var)
              {
                if( NIL == semantically_valid_literal_intP( lit, mt, varP ) )
                {
                  invalidP = T;
                }
                csome_list_var = csome_list_var.rest();
                lit = csome_list_var.first();
              }
            }
            if( NIL == invalidP && NIL != wff_utilities.$check_var_typesP$.getDynamicValue( thread ) )
            {
              invalidP = makeBoolean( NIL == at_var_types.dnfs_variables_arg_constraints_okP( ConsesLow.list( dnf ), mt, varP ) );
            }
          }
        }
        finally
        {
          wff_vars.$provide_wff_suggestionsP$.rebind( _prev_bind_2, thread );
          at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_0, thread );
        }
        return makeBoolean( NIL == invalidP );
      }
      cdestructuring_bind.cdestructuring_bind_error( dnf, $list98 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 75130L)
  public static SubLObject semantically_valid_dnf_type_literalsP(final SubLObject dnf, SubLObject mt, SubLObject varP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym97$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject invalidP = NIL;
    final SubLObject _prev_bind_0 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
    try
    {
      wff_utilities.$check_arg_typesP$.bind( NIL, thread );
      if( NIL == invalidP )
      {
        SubLObject csome_list_var;
        SubLObject literal;
        for( csome_list_var = clauses.pos_lits( dnf ), literal = NIL, literal = csome_list_var.first(); NIL == invalidP && NIL != csome_list_var; invalidP = makeBoolean( NIL == semantically_valid_literal_intP( literal,
            mt, varP ) ), csome_list_var = csome_list_var.rest(), literal = csome_list_var.first() )
        {
        }
      }
    }
    finally
    {
      wff_utilities.$check_arg_typesP$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL == invalidP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 75515L)
  public static SubLObject semantically_valid_literalP(final SubLObject literal, SubLObject mt, SubLObject varP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym97$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject validP = NIL;
    final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    try
    {
      at_vars.$accumulating_at_violationsP$.bind( NIL, thread );
      validP = semantically_valid_literal_intP( literal, mt, varP );
    }
    finally
    {
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != validP && NIL != wff_utilities.$check_var_typesP$.getDynamicValue( thread ) )
    {
      validP = at_var_types.dnfs_variables_arg_constraints_okP( ConsesLow.list( clauses.make_dnf( NIL, ConsesLow.list( literal ) ) ), mt, varP );
    }
    return validP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 75944L)
  public static SubLObject semantically_valid_literal_intP(final SubLObject literal, SubLObject mt, SubLObject varP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym97$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject validP = makeBoolean( NIL == wff_utilities.$check_arg_typesP$.getDynamicValue( thread ) || NIL != formula_args_ok_wrt_typeP( literal, mt ) );
    if( NIL != validP && NIL != at_vars.$semantic_dnf_hl_filtering_enabled$.getDynamicValue( thread ) )
    {
      if( NIL != el_utilities.isa_litP( literal ) )
      {
        if( NIL != el_utilities.closedP( literal, varP ) )
        {
          validP = makeBoolean( NIL != term.el_fort_p( el_utilities.literal_arg2( literal, UNPROVIDED ) ) && NIL != isa.isaP( el_utilities.literal_arg1( literal, UNPROVIDED ), el_utilities.literal_arg2( literal,
              UNPROVIDED ), mt, UNPROVIDED ) );
        }
      }
      else if( NIL != el_utilities.genls_litP( literal ) && NIL != el_utilities.closedP( literal, varP ) )
      {
        validP = makeBoolean( NIL != term.el_fort_p( el_utilities.literal_arg1( literal, UNPROVIDED ) ) && NIL != term.el_fort_p( el_utilities.literal_arg2( literal, UNPROVIDED ) ) && NIL != genls.genlsP( el_utilities
            .literal_arg1( literal, UNPROVIDED ), el_utilities.literal_arg2( literal, UNPROVIDED ), mt, UNPROVIDED ) );
      }
    }
    return validP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 76812L)
  public static SubLObject why_not_assertion_semantically_validP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    wff.reset_wff_state();
    at_utilities.reset_semantic_violations( UNPROVIDED );
    final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    try
    {
      at_vars.$accumulating_at_violationsP$.bind( T, thread );
      if( NIL != at_gaf_assertionP( assertion ) )
      {
        semantically_valid_literalP( assertions_high.gaf_hl_formula( assertion ), assertions_high.assertion_mt( assertion ), UNPROVIDED );
      }
      else
      {
        why_not_cnf_semantically_valid_int( assertions_high.assertion_cnf( assertion ), assertions_high.assertion_mt( assertion ) );
      }
    }
    finally
    {
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return at_utilities.semantic_violations();
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77234L)
  public static SubLObject why_not_cnf_semantically_validP(final SubLObject cnf, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    wff.reset_wff_state();
    at_utilities.reset_semantic_violations( UNPROVIDED );
    final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    try
    {
      at_vars.$accumulating_at_violationsP$.bind( T, thread );
      why_not_cnf_semantically_valid_int( cnf, mt );
    }
    finally
    {
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return at_utilities.semantic_violations();
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77491L)
  public static SubLObject why_not_cnf_semantically_valid_int(final SubLObject cnf, final SubLObject mt)
  {
    SubLObject cdolist_list_var = clauses.neg_lits( cnf );
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      semantically_valid_literalP( literal, mt, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    cdolist_list_var = clauses.pos_lits( cnf );
    literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      semantically_valid_literalP( literal, mt, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77721L)
  public static SubLObject why_not_literal_semantically_validP(final SubLObject literal, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    wff.reset_wff_state();
    final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    try
    {
      at_vars.$accumulating_at_violationsP$.bind( T, thread );
      semantically_valid_literalP( literal, mt, UNPROVIDED );
    }
    finally
    {
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return at_utilities.semantic_violations();
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject arg_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_arg_constraint( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject arg_constraint_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $arg_constraint_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject argconst_sentence(final SubLObject v_object)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject argconst_mt(final SubLObject v_object)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject argconst_test_function(final SubLObject v_object)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject argconst_test_args(final SubLObject v_object)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject argconst_closedP(final SubLObject v_object)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject argconst_atomicP(final SubLObject v_object)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject _csetf_argconst_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject _csetf_argconst_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject _csetf_argconst_test_function(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject _csetf_argconst_test_args(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject _csetf_argconst_closedP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject _csetf_argconst_atomicP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != arg_constraint_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject make_arg_constraint(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $arg_constraint_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw120$SENTENCE ) )
      {
        _csetf_argconst_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw121$MT ) )
      {
        _csetf_argconst_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw122$TEST_FUNCTION ) )
      {
        _csetf_argconst_test_function( v_new, current_value );
      }
      else if( pcase_var.eql( $kw123$TEST_ARGS ) )
      {
        _csetf_argconst_test_args( v_new, current_value );
      }
      else if( pcase_var.eql( $kw124$CLOSED_ ) )
      {
        _csetf_argconst_closedP( v_new, current_value );
      }
      else if( pcase_var.eql( $kw125$ATOMIC_ ) )
      {
        _csetf_argconst_atomicP( v_new, current_value );
      }
      else
      {
        Errors.error( $str126$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject visit_defstruct_arg_constraint(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw127$BEGIN, $sym128$MAKE_ARG_CONSTRAINT, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw129$SLOT, $kw120$SENTENCE, argconst_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw129$SLOT, $kw121$MT, argconst_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw129$SLOT, $kw122$TEST_FUNCTION, argconst_test_function( obj ) );
    Functions.funcall( visitor_fn, obj, $kw129$SLOT, $kw123$TEST_ARGS, argconst_test_args( obj ) );
    Functions.funcall( visitor_fn, obj, $kw129$SLOT, $kw124$CLOSED_, argconst_closedP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw129$SLOT, $kw125$ATOMIC_, argconst_atomicP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw130$END, $sym128$MAKE_ARG_CONSTRAINT, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 77939L)
  public static SubLObject visit_defstruct_object_arg_constraint_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_arg_constraint( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 78459L)
  public static SubLObject print_arg_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sentence = arg_constraint_sentence( v_object );
    final SubLObject mt = arg_constraint_mt( v_object );
    if( NIL != $arg_constraint_struct_printing_verboseP$.getDynamicValue( thread ) )
    {
      final SubLObject test_function = arg_constraint_test_function( v_object );
      final SubLObject test_args = arg_constraint_test_args( v_object );
      final SubLObject type_string = arg_constraint_type_string( v_object );
      PrintLow.format( stream, $str132$__a_ARG_CONSTRAINT__a__a__a__a_, new SubLObject[] { type_string, sentence, mt, test_function, test_args
      } );
    }
    else
    {
      PrintLow.format( stream, $str133$_ARG_CONSTRAINT__a__a_, sentence, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 79011L)
  public static SubLObject arg_constraint_sentence(final SubLObject arg_constraint)
  {
    assert NIL != arg_constraint_p( arg_constraint ) : arg_constraint;
    return argconst_sentence( arg_constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 79184L)
  public static SubLObject arg_constraint_mt(final SubLObject arg_constraint)
  {
    assert NIL != arg_constraint_p( arg_constraint ) : arg_constraint;
    return argconst_mt( arg_constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 79321L)
  public static SubLObject arg_constraint_test_function(final SubLObject arg_constraint)
  {
    assert NIL != arg_constraint_p( arg_constraint ) : arg_constraint;
    return argconst_test_function( arg_constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 79480L)
  public static SubLObject arg_constraint_test_args(final SubLObject arg_constraint)
  {
    assert NIL != arg_constraint_p( arg_constraint ) : arg_constraint;
    return argconst_test_args( arg_constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 79631L)
  public static SubLObject arg_constraint_open_p(final SubLObject arg_constraint)
  {
    return makeBoolean( NIL == argconst_closedP( arg_constraint ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 79736L)
  public static SubLObject arg_constraint_closed_p(final SubLObject arg_constraint)
  {
    return argconst_closedP( arg_constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 79836L)
  public static SubLObject arg_constraint_atomic_p(final SubLObject arg_constraint)
  {
    return argconst_atomicP( arg_constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 79936L)
  public static SubLObject arg_constraint_non_atomic_p(final SubLObject arg_constraint)
  {
    return makeBoolean( NIL == argconst_atomicP( arg_constraint ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 80047L)
  public static SubLObject arg_constraint_gaf_p(final SubLObject arg_constraint)
  {
    return makeBoolean( NIL != arg_constraint_closed_p( arg_constraint ) && NIL != arg_constraint_atomic_p( arg_constraint ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 80205L)
  public static SubLObject arg_constraint_type_string(final SubLObject arg_constraint)
  {
    if( NIL != arg_constraint_gaf_p( arg_constraint ) )
    {
      return $str134$GAF;
    }
    if( NIL != arg_constraint_closed_p( arg_constraint ) )
    {
      return $str135$GNAF;
    }
    if( NIL != arg_constraint_atomic_p( arg_constraint ) )
    {
      return $str136$OAF;
    }
    return $str137$ONAF;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 80475L)
  public static SubLObject new_arg_constraint(final SubLObject sentence, final SubLObject mt, final SubLObject test_function, final SubLObject test_args, SubLObject closedP, SubLObject atomicP)
  {
    if( closedP == UNPROVIDED )
    {
      closedP = $kw138$UNKNOWN;
    }
    if( atomicP == UNPROVIDED )
    {
      atomicP = $kw138$UNKNOWN;
    }
    final SubLObject arg_constraint = make_arg_constraint( UNPROVIDED );
    final SubLObject arg_constraint_closedP = determine_arg_constraint_closedP( sentence, closedP );
    final SubLObject arg_constraint_atomicP = determine_arg_constraint_atomicP( sentence, atomicP );
    _csetf_argconst_sentence( arg_constraint, sentence );
    _csetf_argconst_mt( arg_constraint, mt );
    _csetf_argconst_test_function( arg_constraint, test_function );
    _csetf_argconst_test_args( arg_constraint, test_args );
    _csetf_argconst_closedP( arg_constraint, arg_constraint_closedP );
    _csetf_argconst_atomicP( arg_constraint, arg_constraint_atomicP );
    return arg_constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 81193L)
  public static SubLObject determine_arg_constraint_closedP(final SubLObject sentence, final SubLObject closedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject resultP = NIL;
    if( NIL != Types.booleanp( closedP ) )
    {
      resultP = closedP;
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
        resultP = el_utilities.closedP( sentence, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return resultP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 81547L)
  public static SubLObject determine_arg_constraint_atomicP(final SubLObject sentence, final SubLObject atomicP)
  {
    SubLObject resultP = NIL;
    if( NIL != Types.booleanp( atomicP ) )
    {
      resultP = atomicP;
    }
    else
    {
      resultP = makeBoolean( NIL == el_utilities.el_logical_operator_formula_p( sentence ) );
    }
    return resultP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 81837L)
  public static SubLObject new_isa_arg_constraint(final SubLObject ins, final SubLObject col, final SubLObject mt)
  {
    return new_arg_constraint( ConsesLow.list( $const52$isa, ins, col ), mt, $sym139$ISA_, ConsesLow.list( ins, col ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 81987L)
  public static SubLObject new_genls_arg_constraint(final SubLObject spec, final SubLObject genl, final SubLObject mt)
  {
    return new_arg_constraint( ConsesLow.list( $const36$genls, spec, genl ), mt, $sym140$GENLS_, ConsesLow.list( spec, genl ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 82125L)
  public static SubLObject clear_sorted_arg_constraint_predicates()
  {
    final SubLObject cs = $sorted_arg_constraint_predicates_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 82125L)
  public static SubLObject remove_sorted_arg_constraint_predicates()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $sorted_arg_constraint_predicates_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 82125L)
  public static SubLObject sorted_arg_constraint_predicates_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
      final SubLObject beginning_of_list = $list142;
      final SubLObject all_arg_type_predicates = isa.all_fort_instances( $const143$ArgTypePredicate, UNPROVIDED, UNPROVIDED );
      final SubLObject useful_arg_type_predicates = Sequences.delete_if( $sym144$NO_PREDICATE_EXTENT_P, all_arg_type_predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject middle_of_list = conses_high.set_difference( useful_arg_type_predicates, beginning_of_list, UNPROVIDED, UNPROVIDED );
      final SubLObject all_arg_constraint_predicates = isa.all_fort_instances( $const145$ArgConstraintPredicate, UNPROVIDED, UNPROVIDED );
      final SubLObject useful_arg_constraint_predicates = Sequences.delete_if( $sym144$NO_PREDICATE_EXTENT_P, all_arg_constraint_predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject end_of_list = conses_high.set_difference( useful_arg_constraint_predicates, ConsesLow.append( beginning_of_list, middle_of_list ), UNPROVIDED, UNPROVIDED );
      result = ConsesLow.append( beginning_of_list, middle_of_list, end_of_list );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 82125L)
  public static SubLObject sorted_arg_constraint_predicates()
  {
    SubLObject caching_state = $sorted_arg_constraint_predicates_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym141$SORTED_ARG_CONSTRAINT_PREDICATES, $sym146$_SORTED_ARG_CONSTRAINT_PREDICATES_CACHING_STATE_, NIL, EQ, ZERO_INTEGER, ONE_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sorted_arg_constraint_predicates_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 83028L)
  public static SubLObject sorted_top_level_arg_constraints_on_formula(final SubLObject formula)
  {
    final SubLObject operator = cycl_utilities.formula_operator( formula );
    if( NIL != cycl_variables.cyc_varP( operator ) )
    {
      return arg_constraints_on_formula_with_variable_operator( formula );
    }
    if( NIL == forts.fort_p( operator ) )
    {
      return NIL;
    }
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject ac_preds = cdolist_list_var = sorted_arg_constraint_predicates();
    SubLObject ac_pred = NIL;
    ac_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred_var = ac_pred;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( operator, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( operator, ONE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw76$GAF, $kw54$TRUE, NIL );
              SubLObject done_var_$129 = NIL;
              final SubLObject token_var_$130 = NIL;
              while ( NIL == done_var_$129)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$130 );
                final SubLObject valid_$131 = makeBoolean( !token_var_$130.eql( ass ) );
                if( NIL != valid_$131 )
                {
                  final SubLObject constraint = compute_constraint_for_assertion_and_formula( ass, formula );
                  if( NIL != constraint )
                  {
                    constraints = ConsesLow.cons( constraint, constraints );
                  }
                }
                done_var_$129 = makeBoolean( NIL == valid_$131 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      ac_pred = cdolist_list_var.first();
    }
    return Sequences.nreverse( constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 84025L)
  public static SubLObject inside_out_arg_constraints_on_formula(final SubLObject formula)
  {
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw147$IGNORE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_formula_p( arg ) )
      {
        final SubLObject new_constraints = inside_out_arg_constraints_on_formula( arg );
        constraints = ConsesLow.append( constraints, new_constraints );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    final SubLObject top_level_constraints = sorted_top_level_arg_constraints_on_formula( formula );
    constraints = ConsesLow.append( constraints, top_level_constraints );
    return constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 84970L)
  public static SubLObject arg_constraint_satisfiedP(final SubLObject arg_constraint)
  {
    assert NIL != arg_constraint_p( arg_constraint ) : arg_constraint;
    final SubLObject test_func = arg_constraint_test_function( arg_constraint );
    final SubLObject test_args = arg_constraint_test_args( arg_constraint );
    assert NIL != Types.function_spec_p( test_func ) : test_func;
    assert NIL != Types.listp( test_args ) : test_args;
    return Functions.apply( test_func, test_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 85397L)
  public static SubLObject arg_constraints_on_formula_with_variable_operator(final SubLObject formula)
  {
    SubLObject constraints = NIL;
    final SubLObject variable_operator = cycl_utilities.formula_operator( formula );
    final SubLObject relation_constraint = new_isa_arg_constraint( variable_operator, $const150$Relation, mt_vars.$relation_defining_mt$.getGlobalValue() );
    constraints = ConsesLow.cons( relation_constraint, constraints );
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw147$IGNORE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == cycl_variables.cyc_varP( arg ) )
      {
        final SubLObject constraint = new_isa_arg_constraint( arg, $const32$Thing, mt_vars.$thing_defining_mt$.getGlobalValue() );
        constraints = ConsesLow.cons( constraint, constraints );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/arg-type.lisp", position = 85934L)
  public static SubLObject compute_constraint_for_assertion_and_formula(final SubLObject ass, final SubLObject formula)
  {
    final SubLObject constraint_pred = assertions_high.gaf_predicate( ass );
    final SubLObject mt = assertions_high.assertion_mt( ass );
    final SubLObject pcase_var = constraint_pred;
    if( pcase_var.eql( $const151$argIsa ) )
    {
      final SubLObject constrained_argnum = assertions_high.gaf_arg2( ass );
      final SubLObject col = assertions_high.gaf_arg3( ass );
      final SubLObject constrained_arg = cycl_utilities.formula_arg( formula, constrained_argnum, UNPROVIDED );
      final SubLObject constraint = new_isa_arg_constraint( constrained_arg, col, mt );
      return constraint;
    }
    if( pcase_var.eql( $const152$argGenl ) )
    {
      final SubLObject constrained_argnum = assertions_high.gaf_arg2( ass );
      final SubLObject col = assertions_high.gaf_arg3( ass );
      final SubLObject constrained_arg = cycl_utilities.formula_arg( formula, constrained_argnum, UNPROVIDED );
      final SubLObject constraint = new_genls_arg_constraint( constrained_arg, col, mt );
      return constraint;
    }
    return NIL;
  }

  public static SubLObject declare_arg_type_file()
  {
    SubLFiles.declareFunction( me, "at_gaf_assertionP", "AT-GAF-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_args_ok_wrt_typeP", "FORMULA-ARGS-OK-WRT-TYPE?", 1, 1, false );
    SubLFiles.declareFunction( me, "why_not_formula_args_ok_wrt_typeP", "WHY-NOT-FORMULA-ARGS-OK-WRT-TYPE?", 1, 1, false );
    SubLFiles.declareFunction( me, "mt_literal_args_ok_wrt_typeP", "MT-LITERAL-ARGS-OK-WRT-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "seqvars_inhibited_by_relation_expression", "SEQVARS-INHIBITED-BY-RELATION-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "new_inhibited_seqvars", "NEW-INHIBITED-SEQVARS", 1, 0, false );
    SubLFiles.declareFunction( me, "at_considering_atomic_sentence_p", "AT-CONSIDERING-ATOMIC-SENTENCE-P", 0, 0, false );
    SubLFiles.declareFunction( me, "formula_args_ok_wrt_type_intP", "FORMULA-ARGS-OK-WRT-TYPE-INT?", 1, 1, false );
    SubLFiles.declareFunction( me, "relation_arg_okP", "RELATION-ARG-OK?", 3, 1, false );
    SubLFiles.declareFunction( me, "clear_cached_relation_arg_okP", "CLEAR-CACHED-RELATION-ARG-OK?", 0, 0, false );
    new $clear_cached_relation_arg_okP$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_cached_relation_arg_okP", "REMOVE-CACHED-RELATION-ARG-OK?", 6, 0, false );
    SubLFiles.declareFunction( me, "cached_relation_arg_okP_internal", "CACHED-RELATION-ARG-OK?-INTERNAL", 6, 0, false );
    SubLFiles.declareFunction( me, "cached_relation_arg_okP", "CACHED-RELATION-ARG-OK?", 6, 0, false );
    SubLFiles.declareFunction( me, "relation_arg_ok_intP", "RELATION-ARG-OK-INT?", 3, 1, false );
    SubLFiles.declareFunction( me, "at_within_negationP", "AT-WITHIN-NEGATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "at_within_predicateP", "AT-WITHIN-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "at_within_functionP", "AT-WITHIN-FUNCTION?", 0, 1, false );
    SubLFiles.declareFunction( me, "at_check_arg_typesP", "AT-CHECK-ARG-TYPES?", 0, 3, false );
    SubLFiles.declareFunction( me, "at_check_defining_mtsP", "AT-CHECK-DEFINING-MTS?", 2, 0, false );
    SubLFiles.declareFunction( me, "appraising_disjunctP", "APPRAISING-DISJUNCT?", 1, 1, false );
    SubLFiles.declareFunction( me, "at_within_disjunctP", "AT-WITHIN-DISJUNCT?", 2, 0, false );
    SubLFiles.declareFunction( me, "appraising_disjunct_cnfP", "APPRAISING-DISJUNCT-CNF?", 1, 0, false );
    SubLFiles.declareFunction( me, "at_within_decontextualizedP", "AT-WITHIN-DECONTEXTUALIZED?", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_arg_okP", "VARIABLE-ARG-OK?", 3, 1, false );
    SubLFiles.declareFunction( me, "weak_fort_arg_okP", "WEAK-FORT-ARG-OK?", 3, 1, false );
    SubLFiles.declareFunction( me, "lenient_fort_arg_okP", "LENIENT-FORT-ARG-OK?", 3, 1, false );
    SubLFiles.declareFunction( me, "naut_arg_okP", "NAUT-ARG-OK?", 4, 0, false );
    SubLFiles.declareFunction( me, "at_nat_okP", "AT-NAT-OK?", 1, 1, false );
    SubLFiles.declareFunction( me, "nat_functor_okP", "NAT-FUNCTOR-OK?", 1, 1, false );
    SubLFiles.declareFunction( me, "nat_args_okP", "NAT-ARGS-OK?", 1, 1, false );
    SubLFiles.declareFunction( me, "nart_or_reify_forward_nautP", "NART-OR-REIFY-FORWARD-NAUT?", 2, 0, false );
    SubLFiles.declareFunction( me, "tou_arg_okP", "TOU-ARG-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "nat_function_arg_okP", "NAT-FUNCTION-ARG-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "nat_argument_arg_okP", "NAT-ARGUMENT-ARG-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "tou_naut_okP", "TOU-NAUT-OK?", 1, 0, false );
    SubLFiles.declareFunction( me, "strong_fort_arg_okP", "STRONG-FORT-ARG-OK?", 4, 0, false );
    SubLFiles.declareFunction( me, "opaque_arg_okP", "OPAQUE-ARG-OK?", 4, 0, false );
    SubLFiles.declareFunction( me, "naut_functor_okP", "NAUT-FUNCTOR-OK?", 1, 1, false );
    SubLFiles.declareFunction( me, "naut_args_okP", "NAUT-ARGS-OK?", 1, 1, false );
    SubLFiles.declareFunction( me, "naut_args_ok_wrt_typeP", "NAUT-ARGS-OK-WRT-TYPE?", 1, 1, false );
    SubLFiles.declareFunction( me, "weak_fort_types_okP", "WEAK-FORT-TYPES-OK?", 3, 1, false );
    SubLFiles.declareFunction( me, "lenient_fort_types_okP", "LENIENT-FORT-TYPES-OK?", 3, 1, false );
    SubLFiles.declareFunction( me, "naut_arg_types_okP", "NAUT-ARG-TYPES-OK?", 4, 0, false );
    SubLFiles.declareFunction( me, "naut_arg_types_consistentP", "NAUT-ARG-TYPES-CONSISTENT?", 4, 0, false );
    SubLFiles.declareFunction( me, "naut_arg_types_trueP", "NAUT-ARG-TYPES-TRUE?", 4, 0, false );
    SubLFiles.declareFunction( me, "strong_fort_arg_types_okP", "STRONG-FORT-ARG-TYPES-OK?", 0, 4, false );
    SubLFiles.declareFunction( me, "opaque_arg_types_okP", "OPAQUE-ARG-TYPES-OK?", 0, 4, false );
    SubLFiles.declareFunction( me, "arg_isa_arg_types_okP", "ARG-ISA-ARG-TYPES-OK?", 0, 4, false );
    SubLFiles.declareFunction( me, "arg_test_okP", "ARG-TEST-OK?", 3, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_test_failsP", "INTER-ARG-TEST-FAILS?", 3, 1, false );
    SubLFiles.declareFunction( me, "mal_intra_argP", "MAL-INTRA-ARG?", 4, 0, false );
    SubLFiles.declareFunction( me, "mal_inter_argP", "MAL-INTER-ARG?", 6, 0, false );
    SubLFiles.declareFunction( me, "defining_mts_okP", "DEFINING-MTS-OK?", 1, 1, false );
    SubLFiles.declareFunction( me, "memoized_defining_mts_okP_internal", "MEMOIZED-DEFINING-MTS-OK?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "memoized_defining_mts_okP", "MEMOIZED-DEFINING-MTS-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "defining_mts_ok_intP", "DEFINING-MTS-OK-INT?", 1, 1, false );
    SubLFiles.declareFunction( me, "relator_constraints_okP", "RELATOR-CONSTRAINTS-OK?", 1, 1, false );
    SubLFiles.declareFunction( me, "predicate_constraints_okP", "PREDICATE-CONSTRAINTS-OK?", 1, 1, false );
    SubLFiles.declareFunction( me, "gaf_ok_wrt_asymmetric_predP", "GAF-OK-WRT-ASYMMETRIC-PRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "asymmetric_violations", "ASYMMETRIC-VIOLATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_asymmetric_violations", "GATHER-ASYMMETRIC-VIOLATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "select_asymmetric_pred_violation", "SELECT-ASYMMETRIC-PRED-VIOLATION", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_ok_wrt_anti_symmetric_predP", "GAF-OK-WRT-ANTI-SYMMETRIC-PRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "anti_symmetric_violations", "ANTI-SYMMETRIC-VIOLATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "gaf_ok_wrt_irreflexive_predP", "GAF-OK-WRT-IRREFLEXIVE-PRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "gaf_ok_wrt_anti_transitive_predP", "GAF-OK-WRT-ANTI-TRANSITIVE-PRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "anti_transitive_violations", "ANTI-TRANSITIVE-VIOLATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_anti_transitive_violations", "GATHER-ANTI-TRANSITIVE-VIOLATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "best_gaf_lookup_index_for_anti_transitive", "BEST-GAF-LOOKUP-INDEX-FOR-ANTI-TRANSITIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "search_for_anti_transitive_pred_violation", "SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION", 1, 0, false );
    SubLFiles.declareFunction( me, "search_for_anti_transitive_pred_violation_pivot", "SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION-PIVOT", 1, 0, false );
    SubLFiles.declareFunction( me, "search_for_anti_transitive_pred_violation_swap", "SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION-SWAP", 1, 0, false );
    SubLFiles.declareFunction( me, "select_anti_transitive_pred_violation", "SELECT-ANTI-TRANSITIVE-PRED-VIOLATION", 1, 0, false );
    SubLFiles.declareFunction( me, "select_anti_transitive_pred_violation_via_pred", "SELECT-ANTI-TRANSITIVE-PRED-VIOLATION-VIA-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "find_accessible_gaf", "FIND-ACCESSIBLE-GAF", 1, 3, false );
    SubLFiles.declareFunction( me, "select_target_gaf", "SELECT-TARGET-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "gaf_ok_wrt_negation_predsP", "GAF-OK-WRT-NEGATION-PREDS?", 1, 1, false );
    SubLFiles.declareFunction( me, "negation_pred_violations", "NEGATION-PRED-VIOLATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "gaf_ok_wrt_negation_inversesP", "GAF-OK-WRT-NEGATION-INVERSES?", 1, 1, false );
    SubLFiles.declareFunction( me, "negation_inverse_violations", "NEGATION-INVERSE-VIOLATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_format_okP", "CLEAR-CACHED-FORMAT-OK?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_format_okP", "REMOVE-CACHED-FORMAT-OK?", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_format_okP_internal", "CACHED-FORMAT-OK?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_format_okP", "CACHED-FORMAT-OK?", 1, 0, false );
    SubLFiles.declareFunction( me, "memoized_format_okP_internal", "MEMOIZED-FORMAT-OK?-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "memoized_format_okP", "MEMOIZED-FORMAT-OK?", 4, 0, false );
    SubLFiles.declareFunction( me, "at_format_okP", "AT-FORMAT-OK?", 1, 3, false );
    SubLFiles.declareFunction( me, "single_entry_okP", "SINGLE-ENTRY-OK?", 3, 0, false );
    SubLFiles.declareFunction( me, "literal_single_entry_okP", "LITERAL-SINGLE-ENTRY-OK?", 3, 0, false );
    SubLFiles.declareFunction( me, "why_not_literal_single_entry_okP", "WHY-NOT-LITERAL-SINGLE-ENTRY-OK?", 3, 1, false );
    SubLFiles.declareFunction( me, "sef_violations", "SEF-VIOLATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "check_inter_assert_format_wXo_arg_indexP", "CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?", 1, 0, false );
    SubLFiles.declareFunction( me, "sef_violating_assertionP", "SEF-VIOLATING-ASSERTION?", 4, 0, false );
    SubLFiles.declareFunction( me, "temporally_intersecting_okP", "TEMPORALLY-INTERSECTING-OK?", 3, 0, false );
    SubLFiles.declareFunction( me, "tief_violations", "TIEF-VIOLATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "tief_violating_assertionP", "TIEF-VIOLATING-ASSERTION?", 4, 0, false );
    SubLFiles.declareFunction( me, "spatially_intersecting_okP", "SPATIALLY-INTERSECTING-OK?", 3, 0, false );
    SubLFiles.declareFunction( me, "sief_violations", "SIEF-VIOLATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "sief_violating_assertionP", "SIEF-VIOLATING-ASSERTION?", 4, 0, false );
    SubLFiles.declareFunction( me, "spatio_temporally__intersecting_okP", "SPATIO-TEMPORALLY--INTERSECTING-OK?", 3, 0, false );
    SubLFiles.declareFunction( me, "stief_violations", "STIEF-VIOLATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "interval_entry_okP", "INTERVAL-ENTRY-OK?", 3, 0, false );
    SubLFiles.declareFunction( me, "set_entry_okP", "SET-ENTRY-OK?", 3, 0, false );
    SubLFiles.declareFunction( me, "variable_wrt_arg_typeP", "VARIABLE-WRT-ARG-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_term_wrt_arg_typeP", "VARIABLE-TERM-WRT-ARG-TYPE?", 1, 0, false );
    new $variable_term_wrt_arg_typeP$UnaryFunction();
    SubLFiles.declareFunction( me, "naut_wrt_arg_typeP", "NAUT-WRT-ARG-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "tou_wrt_arg_typeP", "TOU-WRT-ARG-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "nat_function_wrt_arg_typeP", "NAT-FUNCTION-WRT-ARG-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "nat_argument_wrt_arg_typeP", "NAT-ARGUMENT-WRT-ARG-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "strong_fort_wrt_arg_typeP", "STRONG-FORT-WRT-ARG-TYPE?", 1, 1, false );
    SubLFiles.declareFunction( me, "lenient_fort_wrt_arg_typeP", "LENIENT-FORT-WRT-ARG-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "weak_fort_wrt_arg_typeP", "WEAK-FORT-WRT-ARG-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "semantically_valid_dnfP", "SEMANTICALLY-VALID-DNF?", 1, 2, false );
    SubLFiles.declareFunction( me, "semantically_valid_dnf_type_literalsP", "SEMANTICALLY-VALID-DNF-TYPE-LITERALS?", 1, 2, false );
    SubLFiles.declareFunction( me, "semantically_valid_literalP", "SEMANTICALLY-VALID-LITERAL?", 1, 2, false );
    SubLFiles.declareFunction( me, "semantically_valid_literal_intP", "SEMANTICALLY-VALID-LITERAL-INT?", 1, 2, false );
    SubLFiles.declareFunction( me, "why_not_assertion_semantically_validP", "WHY-NOT-ASSERTION-SEMANTICALLY-VALID?", 1, 0, false );
    SubLFiles.declareFunction( me, "why_not_cnf_semantically_validP", "WHY-NOT-CNF-SEMANTICALLY-VALID?", 1, 1, false );
    SubLFiles.declareFunction( me, "why_not_cnf_semantically_valid_int", "WHY-NOT-CNF-SEMANTICALLY-VALID-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "why_not_literal_semantically_validP", "WHY-NOT-LITERAL-SEMANTICALLY-VALID?", 1, 1, false );
    SubLFiles.declareFunction( me, "arg_constraint_print_function_trampoline", "ARG-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_p", "ARG-CONSTRAINT-P", 1, 0, false );
    new $arg_constraint_p$UnaryFunction();
    SubLFiles.declareFunction( me, "argconst_sentence", "ARGCONST-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "argconst_mt", "ARGCONST-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "argconst_test_function", "ARGCONST-TEST-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "argconst_test_args", "ARGCONST-TEST-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "argconst_closedP", "ARGCONST-CLOSED?", 1, 0, false );
    SubLFiles.declareFunction( me, "argconst_atomicP", "ARGCONST-ATOMIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_argconst_sentence", "_CSETF-ARGCONST-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_argconst_mt", "_CSETF-ARGCONST-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_argconst_test_function", "_CSETF-ARGCONST-TEST-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_argconst_test_args", "_CSETF-ARGCONST-TEST-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_argconst_closedP", "_CSETF-ARGCONST-CLOSED?", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_argconst_atomicP", "_CSETF-ARGCONST-ATOMIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_arg_constraint", "MAKE-ARG-CONSTRAINT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_arg_constraint", "VISIT-DEFSTRUCT-ARG-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_arg_constraint_method", "VISIT-DEFSTRUCT-OBJECT-ARG-CONSTRAINT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_arg_constraint", "PRINT-ARG-CONSTRAINT", 3, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_sentence", "ARG-CONSTRAINT-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_mt", "ARG-CONSTRAINT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_test_function", "ARG-CONSTRAINT-TEST-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_test_args", "ARG-CONSTRAINT-TEST-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_open_p", "ARG-CONSTRAINT-OPEN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_closed_p", "ARG-CONSTRAINT-CLOSED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_atomic_p", "ARG-CONSTRAINT-ATOMIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_non_atomic_p", "ARG-CONSTRAINT-NON-ATOMIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_gaf_p", "ARG-CONSTRAINT-GAF-P", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_type_string", "ARG-CONSTRAINT-TYPE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "new_arg_constraint", "NEW-ARG-CONSTRAINT", 4, 2, false );
    SubLFiles.declareFunction( me, "determine_arg_constraint_closedP", "DETERMINE-ARG-CONSTRAINT-CLOSED?", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_arg_constraint_atomicP", "DETERMINE-ARG-CONSTRAINT-ATOMIC?", 2, 0, false );
    SubLFiles.declareFunction( me, "new_isa_arg_constraint", "NEW-ISA-ARG-CONSTRAINT", 3, 0, false );
    SubLFiles.declareFunction( me, "new_genls_arg_constraint", "NEW-GENLS-ARG-CONSTRAINT", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_sorted_arg_constraint_predicates", "CLEAR-SORTED-ARG-CONSTRAINT-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sorted_arg_constraint_predicates", "REMOVE-SORTED-ARG-CONSTRAINT-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "sorted_arg_constraint_predicates_internal", "SORTED-ARG-CONSTRAINT-PREDICATES-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "sorted_arg_constraint_predicates", "SORTED-ARG-CONSTRAINT-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "sorted_top_level_arg_constraints_on_formula", "SORTED-TOP-LEVEL-ARG-CONSTRAINTS-ON-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "inside_out_arg_constraints_on_formula", "INSIDE-OUT-ARG-CONSTRAINTS-ON-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraint_satisfiedP", "ARG-CONSTRAINT-SATISFIED?", 1, 0, false );
    SubLFiles.declareFunction( me, "arg_constraints_on_formula_with_variable_operator", "ARG-CONSTRAINTS-ON-FORMULA-WITH-VARIABLE-OPERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_constraint_for_assertion_and_formula", "COMPUTE-CONSTRAINT-FOR-ASSERTION-AND-FORMULA", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_arg_type_file()
  {
    $relation_arg_ok_argnum$ = SubLFiles.defparameter( "*RELATION-ARG-OK-ARGNUM*", NIL );
    $cached_relation_arg_okP_caching_state$ = SubLFiles.deflexical( "*CACHED-RELATION-ARG-OK?-CACHING-STATE*", NIL );
    $cached_format_okP_caching_state$ = SubLFiles.deflexical( "*CACHED-FORMAT-OK?-CACHING-STATE*", NIL );
    $dtp_arg_constraint$ = SubLFiles.defconstant( "*DTP-ARG-CONSTRAINT*", $sym99$ARG_CONSTRAINT );
    $arg_constraint_struct_printing_verboseP$ = SubLFiles.defparameter( "*ARG-CONSTRAINT-STRUCT-PRINTING-VERBOSE?*", NIL );
    $sorted_arg_constraint_predicates_caching_state$ = SubLFiles.deflexical( "*SORTED-ARG-CONSTRAINT-PREDICATES-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_arg_type_file()
  {
    memoization_state.note_globally_cached_function( $sym3$CACHED_RELATION_ARG_OK_ );
    memoization_state.note_memoized_function( $sym42$MEMOIZED_DEFINING_MTS_OK_ );
    memoization_state.note_globally_cached_function( $sym80$CACHED_FORMAT_OK_ );
    memoization_state.note_memoized_function( $sym83$MEMOIZED_FORMAT_OK_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_arg_constraint$.getGlobalValue(), Symbols.symbol_function( $sym106$ARG_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list107 );
    Structures.def_csetf( $sym108$ARGCONST_SENTENCE, $sym109$_CSETF_ARGCONST_SENTENCE );
    Structures.def_csetf( $sym110$ARGCONST_MT, $sym111$_CSETF_ARGCONST_MT );
    Structures.def_csetf( $sym112$ARGCONST_TEST_FUNCTION, $sym113$_CSETF_ARGCONST_TEST_FUNCTION );
    Structures.def_csetf( $sym114$ARGCONST_TEST_ARGS, $sym115$_CSETF_ARGCONST_TEST_ARGS );
    Structures.def_csetf( $sym116$ARGCONST_CLOSED_, $sym117$_CSETF_ARGCONST_CLOSED_ );
    Structures.def_csetf( $sym118$ARGCONST_ATOMIC_, $sym119$_CSETF_ARGCONST_ATOMIC_ );
    Equality.identity( $sym99$ARG_CONSTRAINT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_arg_constraint$.getGlobalValue(), Symbols.symbol_function( $sym131$VISIT_DEFSTRUCT_OBJECT_ARG_CONSTRAINT_METHOD ) );
    memoization_state.note_globally_cached_function( $sym141$SORTED_ARG_CONSTRAINT_PREDICATES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_arg_type_file();
  }

  @Override
  public void initializeVariables()
  {
    init_arg_type_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_arg_type_file();
  }
  static
  {
    me = new arg_type();
    $relation_arg_ok_argnum$ = null;
    $cached_relation_arg_okP_caching_state$ = null;
    $cached_format_okP_caching_state$ = null;
    $dtp_arg_constraint$ = null;
    $arg_constraint_struct_printing_verboseP$ = null;
    $sorted_arg_constraint_predicates_caching_state$ = null;
    $const0$forAll = constant_handles.reader_make_constant_shell( makeString( "forAll" ) );
    $const1$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $kw2$INHIBITED_SEQUENCE_VARIABLE = makeKeyword( "INHIBITED-SEQUENCE-VARIABLE" );
    $sym3$CACHED_RELATION_ARG_OK_ = makeSymbol( "CACHED-RELATION-ARG-OK?" );
    $sym4$_CACHED_RELATION_ARG_OK__CACHING_STATE_ = makeSymbol( "*CACHED-RELATION-ARG-OK?-CACHING-STATE*" );
    $int5$1024 = makeInteger( 1024 );
    $sym6$CLEAR_CACHED_RELATION_ARG_OK_ = makeSymbol( "CLEAR-CACHED-RELATION-ARG-OK?" );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Quote" ) ), constant_handles.reader_make_constant_shell( makeString( "QuasiQuote" ) ) );
    $const8$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $const9$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const10$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $sym11$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const12$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym13$_EXIT = makeSymbol( "%EXIT" );
    $kw14$WEAK_FORT = makeKeyword( "WEAK-FORT" );
    $kw15$NOT_ISA_DISJOINT = makeKeyword( "NOT-ISA-DISJOINT" );
    $kw16$NOT_QUOTED_ISA_DISJOINT = makeKeyword( "NOT-QUOTED-ISA-DISJOINT" );
    $kw17$NOT_ISA = makeKeyword( "NOT-ISA" );
    $kw18$NOT_GENLS_DISJOINT = makeKeyword( "NOT-GENLS-DISJOINT" );
    $kw19$GENLS = makeKeyword( "GENLS" );
    $kw20$NOT_GENLS = makeKeyword( "NOT-GENLS" );
    $kw21$GENL_ISA = makeKeyword( "GENL-ISA" );
    $kw22$ISA_GENL = makeKeyword( "ISA-GENL" );
    $kw23$DIFFERENT = makeKeyword( "DIFFERENT" );
    $kw24$FORMAT = makeKeyword( "FORMAT" );
    $sym25$POSSIBLY_NAUT_P = makeSymbol( "POSSIBLY-NAUT-P" );
    $kw26$NAUT = makeKeyword( "NAUT" );
    $sym27$VARIABLE_TERM_WRT_ARG_TYPE_ = makeSymbol( "VARIABLE-TERM-WRT-ARG-TYPE?" );
    $kw28$ISA = makeKeyword( "ISA" );
    $kw29$QUOTED_ISA = makeKeyword( "QUOTED-ISA" );
    $const30$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $const31$CollectionDenotingFunction = constant_handles.reader_make_constant_shell( makeString( "CollectionDenotingFunction" ) );
    $const32$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $kw33$OPAQUE = makeKeyword( "OPAQUE" );
    $kw34$STRONG_FORT = makeKeyword( "STRONG-FORT" );
    $sym35$INTEGERP = makeSymbol( "INTEGERP" );
    $const36$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const37$Quote = constant_handles.reader_make_constant_shell( makeString( "Quote" ) );
    $list38 = ConsesLow.list( makeKeyword( "ISA" ), makeKeyword( "NOT-ISA-DISJOINT" ) );
    $list39 = ConsesLow.list( makeKeyword( "GENLS" ), makeKeyword( "NOT-GENLS-DISJOINT" ) );
    $str40$invalid_at_test__s_in_mal_intra_a = makeString( "invalid at test ~s in mal-intra-arg?" );
    $str41$invalid_at_test__s_in_mal_inter_a = makeString( "invalid at test ~s in mal-inter-arg?" );
    $sym42$MEMOIZED_DEFINING_MTS_OK_ = makeSymbol( "MEMOIZED-DEFINING-MTS-OK?" );
    $str43$__at_test_fails___s_in__s_fails__ = makeString( "~%at test fails: ~s in ~s fails #$definingMt constraint: ~s" );
    $kw44$DEFINING_MT_VIOLATION = makeKeyword( "DEFINING-MT-VIOLATION" );
    $kw45$ASYMMETRIC_PREDICATE = makeKeyword( "ASYMMETRIC-PREDICATE" );
    $kw46$ANTI_SYMMETRIC_PREDICATE = makeKeyword( "ANTI-SYMMETRIC-PREDICATE" );
    $kw47$IRREFLEXIVE_PREDICATE = makeKeyword( "IRREFLEXIVE-PREDICATE" );
    $kw48$ANTI_TRANSITIVE_PREDICATE = makeKeyword( "ANTI-TRANSITIVE-PREDICATE" );
    $kw49$NEGATION_PREDS = makeKeyword( "NEGATION-PREDS" );
    $kw50$NEGATION_INVERSES = makeKeyword( "NEGATION-INVERSES" );
    $str51$unknown_predicate_constraint___s = makeString( "unknown predicate constraint: ~s" );
    $const52$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const53$AsymmetricBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "AsymmetricBinaryPredicate" ) );
    $kw54$TRUE = makeKeyword( "TRUE" );
    $list55 = ConsesLow.list( makeKeyword( "PREDICATE-EXTENT" ), makeKeyword( "GAF-ARG" ) );
    $kw56$AT_MAPPING_DONE = makeKeyword( "AT-MAPPING-DONE" );
    $kw57$PREDICATE_EXTENT = makeKeyword( "PREDICATE-EXTENT" );
    $sym58$SELECT_ASYMMETRIC_PRED_VIOLATION = makeSymbol( "SELECT-ASYMMETRIC-PRED-VIOLATION" );
    $kw59$GAF_ARG = makeKeyword( "GAF-ARG" );
    $str60$Ignore_it = makeString( "Ignore it" );
    $str61$Unexpected_index_type_when_gather = makeString( "Unexpected index type when gathering asymmetric violations" );
    $const62$AntiSymmetricBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "AntiSymmetricBinaryPredicate" ) );
    $const63$IrreflexiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "IrreflexiveBinaryPredicate" ) );
    $kw64$COMPLETES_CYCLE_ = makeKeyword( "COMPLETES-CYCLE?" );
    $kw65$WHY_COMPLETES_CYCLE_ = makeKeyword( "WHY-COMPLETES-CYCLE?" );
    $const66$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "TransitiveBinaryPredicate" ) );
    $const67$AntiTransitiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "AntiTransitiveBinaryPredicate" ) );
    $sym68$SELECT_ANTI_TRANSITIVE_PRED_VIOLATION_VIA_PRED = makeSymbol( "SELECT-ANTI-TRANSITIVE-PRED-VIOLATION-VIA-PRED" );
    $list69 = ConsesLow.list( makeSymbol( "*MAPPING-INDEX-ARG*" ), makeSymbol( "*MAPPING-PIVOT-ARG*" ), makeSymbol( "*MAPPING-TARGET-ARG*" ) );
    $sym70$SEARCH_FOR_ANTI_TRANSITIVE_PRED_VIOLATION = makeSymbol( "SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION" );
    $list71 = ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER, ONE_INTEGER ), ConsesLow.list( TWO_INTEGER, ONE_INTEGER, TWO_INTEGER ), ConsesLow.list( ONE_INTEGER, ONE_INTEGER, TWO_INTEGER ) );
    $list72 = ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER, ONE_INTEGER ), ConsesLow.list( TWO_INTEGER, ONE_INTEGER, TWO_INTEGER ), ConsesLow.list( TWO_INTEGER, TWO_INTEGER, ONE_INTEGER ) );
    $sym73$SELECT_ANTI_TRANSITIVE_PRED_VIOLATION = makeSymbol( "SELECT-ANTI-TRANSITIVE-PRED-VIOLATION" );
    $sym74$UNREIFIED_SKOLEM_TERM_ = makeSymbol( "UNREIFIED-SKOLEM-TERM?" );
    $sym75$RELEVANT_PRED_IS_SPEC_PRED = makeSymbol( "RELEVANT-PRED-IS-SPEC-PRED" );
    $kw76$GAF = makeKeyword( "GAF" );
    $kw77$OVERLAP = makeKeyword( "OVERLAP" );
    $const78$negationPreds = constant_handles.reader_make_constant_shell( makeString( "negationPreds" ) );
    $const79$negationInverse = constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) );
    $sym80$CACHED_FORMAT_OK_ = makeSymbol( "CACHED-FORMAT-OK?" );
    $sym81$_CACHED_FORMAT_OK__CACHING_STATE_ = makeSymbol( "*CACHED-FORMAT-OK?-CACHING-STATE*" );
    $int82$128 = makeInteger( 128 );
    $sym83$MEMOIZED_FORMAT_OK_ = makeSymbol( "MEMOIZED-FORMAT-OK?" );
    $const84$SingleEntry = constant_handles.reader_make_constant_shell( makeString( "SingleEntry" ) );
    $const85$IntervalEntry = constant_handles.reader_make_constant_shell( makeString( "IntervalEntry" ) );
    $const86$SetTheFormat = constant_handles.reader_make_constant_shell( makeString( "SetTheFormat" ) );
    $const87$singleEntryFormatInArgs = constant_handles.reader_make_constant_shell( makeString( "singleEntryFormatInArgs" ) );
    $const88$intervalEntryFormatInArgs = constant_handles.reader_make_constant_shell( makeString( "intervalEntryFormatInArgs" ) );
    $const89$openEntryFormatInArgs = constant_handles.reader_make_constant_shell( makeString( "openEntryFormatInArgs" ) );
    $const90$temporallyIntersectingEntryFormat = constant_handles.reader_make_constant_shell( makeString( "temporallyIntersectingEntryFormatInArgs" ) );
    $const91$spatiallyIntersectingEntryFormatI = constant_handles.reader_make_constant_shell( makeString( "spatiallyIntersectingEntryFormatInArgs" ) );
    $const92$spatioTemporallyIntersectingEntry = constant_handles.reader_make_constant_shell( makeString( "spatioTemporallyIntersectingEntryFormatInArgs" ) );
    $str93$unknown_entry_format___s = makeString( "unknown entry format: ~s" );
    $const94$IndeterminateTerm = constant_handles.reader_make_constant_shell( makeString( "IndeterminateTerm" ) );
    $const95$natFunction = constant_handles.reader_make_constant_shell( makeString( "natFunction" ) );
    $const96$natArgument = constant_handles.reader_make_constant_shell( makeString( "natArgument" ) );
    $sym97$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $list98 = ConsesLow.list( makeSymbol( "NEG-LITS" ), makeSymbol( "POS-LITS" ) );
    $sym99$ARG_CONSTRAINT = makeSymbol( "ARG-CONSTRAINT" );
    $sym100$ARG_CONSTRAINT_P = makeSymbol( "ARG-CONSTRAINT-P" );
    $list101 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "TEST-FUNCTION" ), makeSymbol( "TEST-ARGS" ), makeSymbol( "CLOSED?" ), makeSymbol( "ATOMIC?" ) );
    $list102 = ConsesLow.list( makeKeyword( "SENTENCE" ), makeKeyword( "MT" ), makeKeyword( "TEST-FUNCTION" ), makeKeyword( "TEST-ARGS" ), makeKeyword( "CLOSED?" ), makeKeyword( "ATOMIC?" ) );
    $list103 = ConsesLow.list( makeSymbol( "ARGCONST-SENTENCE" ), makeSymbol( "ARGCONST-MT" ), makeSymbol( "ARGCONST-TEST-FUNCTION" ), makeSymbol( "ARGCONST-TEST-ARGS" ), makeSymbol( "ARGCONST-CLOSED?" ), makeSymbol(
        "ARGCONST-ATOMIC?" ) );
    $list104 = ConsesLow.list( makeSymbol( "_CSETF-ARGCONST-SENTENCE" ), makeSymbol( "_CSETF-ARGCONST-MT" ), makeSymbol( "_CSETF-ARGCONST-TEST-FUNCTION" ), makeSymbol( "_CSETF-ARGCONST-TEST-ARGS" ), makeSymbol(
        "_CSETF-ARGCONST-CLOSED?" ), makeSymbol( "_CSETF-ARGCONST-ATOMIC?" ) );
    $sym105$PRINT_ARG_CONSTRAINT = makeSymbol( "PRINT-ARG-CONSTRAINT" );
    $sym106$ARG_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ARG-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE" );
    $list107 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ARG-CONSTRAINT-P" ) );
    $sym108$ARGCONST_SENTENCE = makeSymbol( "ARGCONST-SENTENCE" );
    $sym109$_CSETF_ARGCONST_SENTENCE = makeSymbol( "_CSETF-ARGCONST-SENTENCE" );
    $sym110$ARGCONST_MT = makeSymbol( "ARGCONST-MT" );
    $sym111$_CSETF_ARGCONST_MT = makeSymbol( "_CSETF-ARGCONST-MT" );
    $sym112$ARGCONST_TEST_FUNCTION = makeSymbol( "ARGCONST-TEST-FUNCTION" );
    $sym113$_CSETF_ARGCONST_TEST_FUNCTION = makeSymbol( "_CSETF-ARGCONST-TEST-FUNCTION" );
    $sym114$ARGCONST_TEST_ARGS = makeSymbol( "ARGCONST-TEST-ARGS" );
    $sym115$_CSETF_ARGCONST_TEST_ARGS = makeSymbol( "_CSETF-ARGCONST-TEST-ARGS" );
    $sym116$ARGCONST_CLOSED_ = makeSymbol( "ARGCONST-CLOSED?" );
    $sym117$_CSETF_ARGCONST_CLOSED_ = makeSymbol( "_CSETF-ARGCONST-CLOSED?" );
    $sym118$ARGCONST_ATOMIC_ = makeSymbol( "ARGCONST-ATOMIC?" );
    $sym119$_CSETF_ARGCONST_ATOMIC_ = makeSymbol( "_CSETF-ARGCONST-ATOMIC?" );
    $kw120$SENTENCE = makeKeyword( "SENTENCE" );
    $kw121$MT = makeKeyword( "MT" );
    $kw122$TEST_FUNCTION = makeKeyword( "TEST-FUNCTION" );
    $kw123$TEST_ARGS = makeKeyword( "TEST-ARGS" );
    $kw124$CLOSED_ = makeKeyword( "CLOSED?" );
    $kw125$ATOMIC_ = makeKeyword( "ATOMIC?" );
    $str126$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw127$BEGIN = makeKeyword( "BEGIN" );
    $sym128$MAKE_ARG_CONSTRAINT = makeSymbol( "MAKE-ARG-CONSTRAINT" );
    $kw129$SLOT = makeKeyword( "SLOT" );
    $kw130$END = makeKeyword( "END" );
    $sym131$VISIT_DEFSTRUCT_OBJECT_ARG_CONSTRAINT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ARG-CONSTRAINT-METHOD" );
    $str132$__a_ARG_CONSTRAINT__a__a__a__a_ = makeString( "<~a ARG-CONSTRAINT:~a:~a:~a:~a>" );
    $str133$_ARG_CONSTRAINT__a__a_ = makeString( "<ARG-CONSTRAINT:~a:~a>" );
    $str134$GAF = makeString( "GAF" );
    $str135$GNAF = makeString( "GNAF" );
    $str136$OAF = makeString( "OAF" );
    $str137$ONAF = makeString( "ONAF" );
    $kw138$UNKNOWN = makeKeyword( "UNKNOWN" );
    $sym139$ISA_ = makeSymbol( "ISA?" );
    $sym140$GENLS_ = makeSymbol( "GENLS?" );
    $sym141$SORTED_ARG_CONSTRAINT_PREDICATES = makeSymbol( "SORTED-ARG-CONSTRAINT-PREDICATES" );
    $list142 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argGenl" ) ) );
    $const143$ArgTypePredicate = constant_handles.reader_make_constant_shell( makeString( "ArgTypePredicate" ) );
    $sym144$NO_PREDICATE_EXTENT_P = makeSymbol( "NO-PREDICATE-EXTENT-P" );
    $const145$ArgConstraintPredicate = constant_handles.reader_make_constant_shell( makeString( "ArgConstraintPredicate" ) );
    $sym146$_SORTED_ARG_CONSTRAINT_PREDICATES_CACHING_STATE_ = makeSymbol( "*SORTED-ARG-CONSTRAINT-PREDICATES-CACHING-STATE*" );
    $kw147$IGNORE = makeKeyword( "IGNORE" );
    $sym148$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym149$LISTP = makeSymbol( "LISTP" );
    $const150$Relation = constant_handles.reader_make_constant_shell( makeString( "Relation" ) );
    $const151$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $const152$argGenl = constant_handles.reader_make_constant_shell( makeString( "argGenl" ) );
  }

  public static final class $clear_cached_relation_arg_okP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_cached_relation_arg_okP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-CACHED-RELATION-ARG-OK?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_cached_relation_arg_okP();
    }
  }

  public static final class $variable_term_wrt_arg_typeP$UnaryFunction
      extends
        UnaryFunction
  {
    public $variable_term_wrt_arg_typeP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VARIABLE-TERM-WRT-ARG-TYPE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return variable_term_wrt_arg_typeP( arg1 );
    }
  }

  public static final class $arg_constraint_native
      extends
        SubLStructNative
  {
    public SubLObject $sentence;
    public SubLObject $mt;
    public SubLObject $test_function;
    public SubLObject $test_args;
    public SubLObject $closedP;
    public SubLObject $atomicP;
    private static final SubLStructDeclNative structDecl;

    public $arg_constraint_native()
    {
      this.$sentence = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$test_function = CommonSymbols.NIL;
      this.$test_args = CommonSymbols.NIL;
      this.$closedP = CommonSymbols.NIL;
      this.$atomicP = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $arg_constraint_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$sentence;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$test_function;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$test_args;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$closedP;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$atomicP;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$sentence = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$test_function = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$test_args = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$closedP = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$atomicP = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $arg_constraint_native.class, $sym99$ARG_CONSTRAINT, $sym100$ARG_CONSTRAINT_P, $list101, $list102, new String[] { "$sentence", "$mt", "$test_function", "$test_args",
        "$closedP", "$atomicP"
      }, $list103, $list104, $sym105$PRINT_ARG_CONSTRAINT );
    }
  }

  public static final class $arg_constraint_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $arg_constraint_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ARG-CONSTRAINT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return arg_constraint_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2749 ms
 * 
 */