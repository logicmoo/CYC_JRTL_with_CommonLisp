package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class backward_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.backward_utilities";
  public static final String myFingerPrint = "5b334b45c18a83f24240e844d6c4bc21b6e7188fd0915d99a7d0e8272064dbd0";
  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 756L)
  public static SubLSymbol $inference_recursive_query_overhead$;
  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 1088L)
  private static SubLSymbol $directions_for_forward_inference$;
  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 1268L)
  private static SubLSymbol $directions_for_backward_inference$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$ASSERTION_P;
  private static final SubLSymbol $sym3$VARIABLE_P;
  private static final SubLObject $const4$isa;
  private static final SubLObject $const5$genls;
  private static final SubLObject $const6$TheList;
  private static final SubLList $list7;
  private static final SubLObject $const8$abnormal;
  private static final SubLSymbol $kw9$NEG;
  private static final SubLSymbol $kw10$POS;
  private static final SubLSymbol $sym11$LISTP;
  private static final SubLSymbol $sym12$INFERENCE_CANONICALIZE_HL_SUPPORT_LITERAL;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$INFERENCE_MAKE_COMMUTATIVE_LITERAL;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$CYC_VAR_;

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 865L)
  public static SubLObject rule_relevant_to_proof(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == control_vars.$proof_checking_enabled$.getDynamicValue( thread ) || NIL != conses_high.member( assertion, control_vars.$proof_checker_rules$.getDynamicValue( thread ), UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 1356L)
  public static SubLObject relevant_directions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_control_vars.within_forward_inferenceP() && NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue( thread ) )
    {
      return $directions_for_forward_inference$.getGlobalValue();
    }
    return $directions_for_backward_inference$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 1646L)
  public static SubLObject direction_is_relevant(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject direction = assertions_high.assertion_direction( assertion );
    if( NIL != kb_control_vars.within_forward_inferenceP() && NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue( thread ) )
    {
      return conses_high.member( direction, $directions_for_forward_inference$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    return conses_high.member( direction, $directions_for_backward_inference$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 2082L)
  public static SubLObject duplicate_literal_cleanup(SubLObject literals, SubLObject exclude_set)
  {
    if( exclude_set == UNPROVIDED )
    {
      exclude_set = NIL;
    }
    if( NIL != literals )
    {
      literals = Sequences.delete_duplicates( literals, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != exclude_set )
      {
        literals = conses_high.nset_difference( literals, exclude_set, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
      return literals;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 2426L)
  public static SubLObject additional_source_variable_pos_lits(final SubLObject literal, final SubLObject dependent_dnf, final SubLObject support)
  {
    final SubLObject literal_vars = list_utilities.tree_gather( literal, Symbols.symbol_function( $sym3$VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject unintroduced_literal_vars = NIL;
    if( NIL == literal_vars )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = literal_vars;
    SubLObject literal_var = NIL;
    literal_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == list_utilities.tree_find( literal_var, dependent_dnf, UNPROVIDED, UNPROVIDED ) )
      {
        unintroduced_literal_vars = ConsesLow.cons( literal_var, unintroduced_literal_vars );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal_var = cdolist_list_var.first();
    }
    if( NIL == unintroduced_literal_vars )
    {
      return NIL;
    }
    SubLObject support_cnf = NIL;
    SubLObject additional_pos_lits = NIL;
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      final SubLObject cnf = assertions_high.assertion_cnf( support );
      support_cnf = ( ( NIL != clause_utilities.neg_atomic_clause_p( cnf ) ) ? clause_utilities.make_gaf_cnf( clauses.neg_lits( cnf ).first() ) : cnf );
    }
    else
    {
      support_cnf = clause_utilities.make_gaf_cnf( literal );
    }
    SubLObject cdolist_list_var2 = unintroduced_literal_vars;
    SubLObject unintroduced_literal_var = NIL;
    unintroduced_literal_var = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != list_utilities.tree_find( unintroduced_literal_var, support_cnf, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject some_additional_pos_lits = constraint_sentences_for_transformation_variable( unintroduced_literal_var, support_cnf );
        additional_pos_lits = ConsesLow.nconc( some_additional_pos_lits, additional_pos_lits );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      unintroduced_literal_var = cdolist_list_var2.first();
    }
    return Sequences.nreverse( additional_pos_lits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 3890L)
  public static SubLObject constraint_sentences_for_transformation_variable(final SubLObject var, final SubLObject support_cnf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject additional_pos_lits = NIL;
    final SubLObject isa_constraints = genls.min_cols( at_var_types.cnf_variable_isa_constraints( var, support_cnf, mt_relevance_macros.$mt$.getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED );
    final SubLObject genl_constraints = genls.min_cols( at_var_types.cnf_variable_genl_constraints( var, support_cnf, mt_relevance_macros.$mt$.getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = isa_constraints;
    SubLObject isa_constraint = NIL;
    isa_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      additional_pos_lits = ConsesLow.cons( ConsesLow.list( $const4$isa, var, isa_constraint ), additional_pos_lits );
      cdolist_list_var = cdolist_list_var.rest();
      isa_constraint = cdolist_list_var.first();
    }
    cdolist_list_var = genl_constraints;
    SubLObject genl_constraint = NIL;
    genl_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      additional_pos_lits = ConsesLow.cons( ConsesLow.list( $const5$genls, var, genl_constraint ), additional_pos_lits );
      cdolist_list_var = cdolist_list_var.rest();
      genl_constraint = cdolist_list_var.first();
    }
    if( NIL == isa_constraints && NIL == genl_constraints )
    {
      if( NIL != el_utilities.occurs_as_sequence_variable_in_clauseP( var, support_cnf ) )
      {
        additional_pos_lits = ConsesLow.cons( ConsesLow.listS( $const4$isa, reader.bq_cons( $const6$TheList, var ), $list7 ), additional_pos_lits );
      }
      if( NIL != el_utilities.occurs_as_term_variable_in_clauseP( var, support_cnf ) )
      {
        additional_pos_lits = ConsesLow.cons( ConsesLow.listS( $const4$isa, var, $list7 ), additional_pos_lits );
      }
    }
    return Sequences.nreverse( additional_pos_lits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 4856L)
  public static SubLObject inference_backchain_impossible(final SubLObject literal, final SubLObject sense, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    if( NIL == forts.fort_p( predicate ) )
    {
      return NIL;
    }
    if( NIL != inference_trampolines.inference_backchain_forbiddenP( predicate, mt ) )
    {
      return T;
    }
    if( $const4$isa.eql( predicate ) )
    {
      if( NIL != control_vars.$hl_failure_backchaining$.getDynamicValue( thread ) || NIL != control_vars.$unbound_rule_backchain_enabled$.getDynamicValue( thread ) )
      {
        return NIL;
      }
      final SubLObject arg2 = el_utilities.literal_arg2( literal, UNPROVIDED );
      if( NIL != forts.fort_p( arg2 ) && NIL != inference_trampolines.inference_collection_backchain_encouragedP( arg2, mt ) )
      {
        return NIL;
      }
      return T;
    }
    else
    {
      if( NIL != hl_supports.hl_predicate_p( predicate ) )
      {
        return makeBoolean( NIL == control_vars.$hl_failure_backchaining$.getDynamicValue( thread ) );
      }
      if( NIL != inference_trampolines.inference_evaluatable_predicateP( predicate ) )
      {
        return makeBoolean( NIL == control_vars.$evaluatable_backchain_enabled$.getDynamicValue( thread ) );
      }
      if( predicate.eql( $const8$abnormal ) )
      {
        return Equality.eq( $kw9$NEG, sense );
      }
      if( kb_indexing.num_predicate_rule_index( predicate, $kw10$POS, UNPROVIDED, UNPROVIDED ).isPositive() || kb_indexing.num_predicate_rule_index( predicate, $kw9$NEG, UNPROVIDED, UNPROVIDED ).isPositive()
          || NIL != inference_trampolines.inference_some_spec_pred_or_inverseP( predicate ) || NIL != inference_trampolines.inference_some_genl_pred_or_inverseP( predicate ) )
      {
        return NIL;
      }
      return makeBoolean( NIL == control_vars.$unbound_rule_backchain_enabled$.getDynamicValue( thread ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 6124L)
  public static SubLObject transformation_backchain_for_predicateP(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != forts.fort_p( predicate ) && ( NIL != control_vars.$hl_failure_backchaining$.getDynamicValue( thread ) || NIL == hl_supports.hl_predicate_p( predicate ) )
        && ( NIL != control_vars.$evaluatable_backchain_enabled$.getDynamicValue( thread ) || NIL == inference_trampolines.inference_evaluatable_predicateP( predicate ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 6506L)
  public static SubLObject inference_canonicalize_hl_support_asent(final SubLObject asent)
  {
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    if( NIL == inference_trampolines.inference_commutative_relationP( predicate ) )
    {
      return asent;
    }
    return inference_make_commutative_asent( predicate, cycl_utilities.atomic_sentence_args( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7016L)
  public static SubLObject inference_make_commutative_asent(final SubLObject predicate, SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    args = inference_canonicalize_commutative_args( args );
    return reader.bq_cons( predicate, ConsesLow.append( args, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7203L)
  public static SubLObject inference_canonicalize_commutative_args(final SubLObject args)
  {
    assert NIL != Types.listp( args ) : args;
    return kb_utilities.sort_terms( args, T, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7330L)
  public static SubLObject inference_canonicalize_hl_support_literal(final SubLObject asent)
  {
    return inference_canonicalize_hl_support_asent( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7513L)
  public static SubLObject inference_make_commutative_literal(final SubLObject predicate, final SubLObject args)
  {
    return inference_make_commutative_asent( predicate, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7693L)
  public static SubLObject inference_term_free_variables(final SubLObject v_term)
  {
    if( NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym3$VARIABLE_P ), v_term, UNPROVIDED ) )
    {
      return NIL;
    }
    return temp_term_free_variables( v_term, Symbols.symbol_function( $sym3$VARIABLE_P ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 7886L)
  public static SubLObject inference_literal_free_variables(final SubLObject literal)
  {
    if( NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym3$VARIABLE_P ), literal, UNPROVIDED ) )
    {
      return NIL;
    }
    return el_utilities.literal_free_variables( literal, NIL, Symbols.symbol_function( $sym3$VARIABLE_P ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 8092L)
  public static SubLObject inference_clause_free_variables(final SubLObject clause)
  {
    if( NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym3$VARIABLE_P ), clause, UNPROVIDED ) )
    {
      return NIL;
    }
    return clause_utilities.clause_free_variables( clause, Symbols.symbol_function( $sym3$VARIABLE_P ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 8289L)
  public static SubLObject temp_term_free_variables(final SubLObject function_expression, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym16$CYC_VAR_;
    }
    if( NIL != el_utilities.el_relation_expressionP( function_expression ) )
    {
      return el_utilities.literal_free_variables( function_expression, NIL, varP, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 8501L)
  public static SubLObject inference_closed_termP(final SubLObject v_term)
  {
    return makeBoolean( NIL != forts.fort_p( v_term ) || ( v_term.isAtom() && NIL == variables.variable_p( v_term ) ) || NIL == inference_term_free_variables( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 8729L)
  public static SubLObject inference_closed_literalP(final SubLObject literal)
  {
    return Types.sublisp_null( inference_literal_free_variables( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/backward-utilities.lisp", position = 8861L)
  public static SubLObject inference_closed_clauseP(final SubLObject clause)
  {
    return Types.sublisp_null( inference_clause_free_variables( clause ) );
  }

  public static SubLObject declare_backward_utilities_file()
  {
    SubLFiles.declareFunction( me, "rule_relevant_to_proof", "RULE-RELEVANT-TO-PROOF", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_directions", "RELEVANT-DIRECTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "direction_is_relevant", "DIRECTION-IS-RELEVANT", 1, 0, false );
    SubLFiles.declareFunction( me, "duplicate_literal_cleanup", "DUPLICATE-LITERAL-CLEANUP", 1, 1, false );
    SubLFiles.declareFunction( me, "additional_source_variable_pos_lits", "ADDITIONAL-SOURCE-VARIABLE-POS-LITS", 3, 0, false );
    SubLFiles.declareFunction( me, "constraint_sentences_for_transformation_variable", "CONSTRAINT-SENTENCES-FOR-TRANSFORMATION-VARIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_backchain_impossible", "INFERENCE-BACKCHAIN-IMPOSSIBLE", 3, 0, false );
    SubLFiles.declareFunction( me, "transformation_backchain_for_predicateP", "TRANSFORMATION-BACKCHAIN-FOR-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_canonicalize_hl_support_asent", "INFERENCE-CANONICALIZE-HL-SUPPORT-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_make_commutative_asent", "INFERENCE-MAKE-COMMUTATIVE-ASENT", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_canonicalize_commutative_args", "INFERENCE-CANONICALIZE-COMMUTATIVE-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_canonicalize_hl_support_literal", "INFERENCE-CANONICALIZE-HL-SUPPORT-LITERAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_make_commutative_literal", "INFERENCE-MAKE-COMMUTATIVE-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_term_free_variables", "INFERENCE-TERM-FREE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_literal_free_variables", "INFERENCE-LITERAL-FREE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_clause_free_variables", "INFERENCE-CLAUSE-FREE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "temp_term_free_variables", "TEMP-TERM-FREE-VARIABLES", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_closed_termP", "INFERENCE-CLOSED-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_closed_literalP", "INFERENCE-CLOSED-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_closed_clauseP", "INFERENCE-CLOSED-CLAUSE?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_backward_utilities_file()
  {
    $inference_recursive_query_overhead$ = SubLFiles.defparameter( "*INFERENCE-RECURSIVE-QUERY-OVERHEAD*", TWENTY_INTEGER );
    $directions_for_forward_inference$ = SubLFiles.deflexical( "*DIRECTIONS-FOR-FORWARD-INFERENCE*", $list0 );
    $directions_for_backward_inference$ = SubLFiles.deflexical( "*DIRECTIONS-FOR-BACKWARD-INFERENCE*", $list1 );
    return NIL;
  }

  public static SubLObject setup_backward_utilities_file()
  {
    access_macros.define_obsolete_register( $sym12$INFERENCE_CANONICALIZE_HL_SUPPORT_LITERAL, $list13 );
    access_macros.define_obsolete_register( $sym14$INFERENCE_MAKE_COMMUTATIVE_LITERAL, $list15 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_backward_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_backward_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_backward_utilities_file();
  }
  static
  {
    me = new backward_utilities();
    $inference_recursive_query_overhead$ = null;
    $directions_for_forward_inference$ = null;
    $directions_for_backward_inference$ = null;
    $list0 = ConsesLow.list( makeKeyword( "FORWARD" ) );
    $list1 = ConsesLow.list( makeKeyword( "BACKWARD" ), makeKeyword( "FORWARD" ) );
    $sym2$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym3$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $const4$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const5$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const6$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) );
    $const8$abnormal = constant_handles.reader_make_constant_shell( makeString( "abnormal" ) );
    $kw9$NEG = makeKeyword( "NEG" );
    $kw10$POS = makeKeyword( "POS" );
    $sym11$LISTP = makeSymbol( "LISTP" );
    $sym12$INFERENCE_CANONICALIZE_HL_SUPPORT_LITERAL = makeSymbol( "INFERENCE-CANONICALIZE-HL-SUPPORT-LITERAL" );
    $list13 = ConsesLow.list( makeSymbol( "INFERENCE-CANONICALIZE-HL-SUPPORT-ASENT" ) );
    $sym14$INFERENCE_MAKE_COMMUTATIVE_LITERAL = makeSymbol( "INFERENCE-MAKE-COMMUTATIVE-LITERAL" );
    $list15 = ConsesLow.list( makeSymbol( "INFERENCE-MAKE-COMMUTATIVE-ASENT" ) );
    $sym16$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
  }
}
/*
 * 
 * Total time: 178 ms
 * 
 */