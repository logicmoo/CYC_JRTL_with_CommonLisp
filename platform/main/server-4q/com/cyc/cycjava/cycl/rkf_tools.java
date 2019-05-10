package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_tools
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_tools";
  public static final String myFingerPrint = "0306fc2db5938977c869c794562c8a9d4ea153e39708508c829716a11856fedc";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 743L)
  private static SubLSymbol $rkf_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 7710L)
  public static SubLSymbol $rkf_max_arity$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 7872L)
  public static SubLSymbol $rkf_common_sentences_recurseP$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$VALID_CONSTANT_;
  private static final SubLObject $const2$genls;
  private static final SubLObject $const3$isa;
  private static final SubLSymbol $kw4$IGNORE;
  private static final SubLSymbol $sym5$__TERM;
  private static final SubLObject $const6$Thing;
  private static final SubLSymbol $sym7$RKF_CH_PARSING_SURROGATE_P;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$_OBJ;
  private static final SubLObject $const10$TheSetOf;
  private static final SubLObject $const11$and;
  private static final SubLSymbol $kw12$TERM;
  private static final SubLSymbol $sym13$RKF_TERM_REFERENCE_P;
  private static final SubLSymbol $sym14$RKF_GENERAL_REFERENCE_FORMULA_EQUAL;
  private static final SubLSymbol $sym15$RKF_LOCAL_TERM_REFERENCE_P;
  private static final SubLSymbol $sym16$RKF_LOCAL_TERM_EQUAL;
  private static final SubLObject $const17$or;
  private static final SubLObject $const18$implies;
  private static final SubLSymbol $kw19$DEFAULT;
  private static final SubLSymbol $sym20$FORT_P;
  private static final SubLSymbol $sym21$STRINGP;
  private static final SubLSymbol $sym22$HLMT_P;
  private static final SubLObject $const23$preferredTermStrings;
  private static final SubLSymbol $sym24$PREDICATE_P;
  private static final SubLList $list25;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 1008L)
  public static SubLObject initialize_rkf_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym1$VALID_CONSTANT_, $rkf_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_rkf_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_rkf_kb_loaded();
    }
    return kb_control_vars.rkf_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 1349L)
  public static SubLObject rkf_compare_terms(final SubLObject term1, final SubLObject term2, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject include_nartsP = $rkf_common_sentences_recurseP$.getDynamicValue( thread );
    final SubLObject all1 = cycl_utilities.hl_to_el( rkf_concept_summarizer.rkf_summarize( term1, domain_mt, include_nartsP ) );
    final SubLObject all2 = cycl_utilities.hl_to_el( rkf_concept_summarizer.rkf_summarize( term2, domain_mt, include_nartsP ) );
    thread.resetMultipleValues();
    final SubLObject common1 = rkf_sentences_in_common( term1, term2, all1, all2, domain_mt );
    final SubLObject common2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject unique1 = list_utilities.fast_set_difference( all1, common1, Symbols.symbol_function( EQUAL ) );
    final SubLObject unique2 = list_utilities.fast_set_difference( all2, common2, Symbols.symbol_function( EQUAL ) );
    return Values.values( common1, unique1, unique2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 2118L)
  public static SubLObject rkf_sentences_in_common(final SubLObject term1, final SubLObject term2, final SubLObject sentences1, final SubLObject sentences2, final SubLObject domain_mt)
  {
    SubLObject common1 = NIL;
    SubLObject common2 = NIL;
    SubLObject cdolist_list_var = sentences1;
    SubLObject sentence1 = NIL;
    sentence1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_sentence = rkf_substitute_terms_in_sentence( term2, term1, sentence1 );
      if( NIL != rkf_relevant_and_knownP( new_sentence, term2, sentences2, domain_mt ) )
      {
        common2 = ConsesLow.cons( new_sentence, common2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence1 = cdolist_list_var.first();
    }
    cdolist_list_var = common2;
    SubLObject common3 = NIL;
    common3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_sentence = rkf_substitute_terms_in_sentence( term1, term2, common3 );
      common1 = ConsesLow.cons( new_sentence, common1 );
      cdolist_list_var = cdolist_list_var.rest();
      common3 = cdolist_list_var.first();
    }
    cdolist_list_var = sentences2;
    SubLObject sentence2 = NIL;
    sentence2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_sentence = rkf_substitute_terms_in_sentence( term1, term2, sentence2 );
      if( NIL == subl_promotions.memberP( new_sentence, common1, Symbols.symbol_function( EQUAL ), UNPROVIDED ) && NIL != rkf_relevant_and_knownP( new_sentence, term1, sentences1, domain_mt ) )
      {
        common1 = ConsesLow.cons( new_sentence, common1 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence2 = cdolist_list_var.first();
    }
    cdolist_list_var = common1;
    common3 = NIL;
    common3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var;
      final SubLObject new_sentence = item_var = rkf_substitute_terms_in_sentence( term2, term1, common3 );
      if( NIL == conses_high.member( item_var, common2, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        common2 = ConsesLow.cons( item_var, common2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      common3 = cdolist_list_var.first();
    }
    final SubLObject common_isas = isa.min_ceiling_isa( ConsesLow.list( term1, term2 ), NIL, domain_mt, UNPROVIDED );
    SubLObject cdolist_list_var2;
    final SubLObject common_genls = cdolist_list_var2 = genls.min_ceiling_cols( ConsesLow.list( term1, term2 ), NIL, domain_mt, UNPROVIDED );
    SubLObject col = NIL;
    col = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject sentence3 = ConsesLow.list( $const2$genls, term1, col );
      final SubLObject sentence4 = ConsesLow.list( $const2$genls, term2, col );
      SubLObject item_var2 = sentence3;
      if( NIL == conses_high.member( item_var2, common1, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        common1 = ConsesLow.cons( item_var2, common1 );
      }
      item_var2 = sentence4;
      if( NIL == conses_high.member( item_var2, common2, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        common2 = ConsesLow.cons( item_var2, common2 );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      col = cdolist_list_var2.first();
    }
    cdolist_list_var2 = common_isas;
    col = NIL;
    col = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject sentence3 = ConsesLow.list( $const3$isa, term1, col );
      final SubLObject sentence4 = ConsesLow.list( $const3$isa, term2, col );
      SubLObject item_var2 = sentence3;
      if( NIL == conses_high.member( item_var2, common1, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        common1 = ConsesLow.cons( item_var2, common1 );
      }
      item_var2 = sentence4;
      if( NIL == conses_high.member( item_var2, common2, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        common2 = ConsesLow.cons( item_var2, common2 );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      col = cdolist_list_var2.first();
    }
    return Values.values( common1, common2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 4129L)
  public static SubLObject rkf_relevant_and_knownP(final SubLObject sentence, final SubLObject v_term, final SubLObject sentences, final SubLObject domain_mt)
  {
    return makeBoolean( NIL != cycl_utilities.expression_find( v_term, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && ( NIL != subl_promotions.memberP( sentence, sentences, Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) || NIL != rkf_query_utilities.rkf_known( sentence, domain_mt, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 4409L)
  public static SubLObject rkf_remove_unmentioned_constraints(final SubLObject v_term, final SubLObject constraints)
  {
    SubLObject result_conjuncts = NIL;
    if( NIL != el_utilities.el_conjunction_p( constraints ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( constraints, $kw4$IGNORE );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( v_term.equal( cycl_utilities.formula_arg1( conjunct, UNPROVIDED ) ) )
        {
          result_conjuncts = ConsesLow.cons( conjunct, result_conjuncts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
    }
    else if( v_term.equal( cycl_utilities.formula_arg1( constraints, UNPROVIDED ) ) )
    {
      result_conjuncts = ConsesLow.cons( constraints, result_conjuncts );
    }
    if( NIL != result_conjuncts )
    {
      return simplifier.nconjoin( Sequences.nreverse( result_conjuncts ), T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 5137L)
  public static SubLObject rkf_explicit_constraints(final SubLObject sentence, final SubLObject v_term)
  {
    if( NIL != el_utilities.el_conjunction_p( sentence ) )
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw4$IGNORE );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( NIL != cycl_utilities.atomic_sentence_with_pred_p( conjunct, $const3$isa ) || NIL != cycl_utilities.atomic_sentence_with_pred_p( conjunct, $const2$genls ) ) && v_term.equal( cycl_utilities.formula_arg1(
            conjunct, UNPROVIDED ) ) )
        {
          result = ConsesLow.cons( conjunct, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      return simplifier.nconjoin( result, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 5701L)
  public static SubLObject rkf_type_constraints(final SubLObject v_term, final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject var_formula = conses_high.subst( $sym5$__TERM, v_term, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject clean_formula = conses_high.subst_if( $const6$Thing, $sym7$RKF_CH_PARSING_SURROGATE_P, var_formula, UNPROVIDED );
    final SubLObject _prev_bind_0 = wff_vars.$validate_expansionsP$.currentBinding( thread );
    try
    {
      wff_vars.$validate_expansionsP$.bind( T, thread );
      final SubLObject implicit_constraints = at_var_types.formula_variables_arg_constraints( clean_formula, mt, UNPROVIDED );
      final SubLObject filtered_constraints = rkf_remove_unmentioned_constraints( $sym5$__TERM, implicit_constraints );
      final SubLObject fixed_constraints = ( NIL != filtered_constraints ) ? filtered_constraints : $list8;
      final SubLObject constraint_set = result = conses_high.subst( v_term, $sym5$__TERM, fixed_constraints, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    finally
    {
      wff_vars.$validate_expansionsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 6515L)
  public static SubLObject rkf_type_constraint_set(final SubLObject v_term, final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLObject constraint_formula = rkf_type_constraints( v_term, formula, mt );
    final SubLObject normalized_formula = conses_high.subst( $sym9$_OBJ, v_term, constraint_formula, UNPROVIDED, UNPROVIDED );
    final SubLObject set_formula = ConsesLow.list( $const10$TheSetOf, $sym9$_OBJ, normalized_formula );
    return set_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 6960L)
  public static SubLObject rkf_type_constraint_isas_and_genls(final SubLObject v_term, final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    SubLObject constraint_formula = rkf_type_constraints( v_term, formula, mt );
    SubLObject isas = NIL;
    SubLObject v_genls = NIL;
    if( !cycl_utilities.formula_arg0( constraint_formula ).eql( $const11$and ) )
    {
      constraint_formula = el_utilities.make_unary_formula( $const11$and, constraint_formula );
    }
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( constraint_formula, $kw4$IGNORE );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( var.isList() )
      {
        if( cycl_utilities.formula_arg0( var ).eql( $const2$genls ) )
        {
          v_genls = ConsesLow.cons( cycl_utilities.formula_arg2( var, UNPROVIDED ), v_genls );
        }
        else if( cycl_utilities.formula_arg0( var ).eql( $const3$isa ) )
        {
          isas = ConsesLow.cons( cycl_utilities.formula_arg2( var, UNPROVIDED ), isas );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return Values.values( isas, v_genls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 8160L)
  public static SubLObject rkf_substitute_terms_in_sentence(final SubLObject in_term, final SubLObject out_term, SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $rkf_common_sentences_recurseP$.getDynamicValue( thread ) )
    {
      final SubLObject swap_alist = ConsesLow.list( ConsesLow.cons( out_term, in_term ) );
      return cycl_utilities.expression_sublis( swap_alist, sentence, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    if( NIL != el_utilities.formula_with_sequence_termP( sentence ) )
    {
      sentence = el_utilities.strip_sequence_var( sentence );
    }
    return Sequences.substitute( in_term, out_term, sentence, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 8677L)
  public static SubLObject rkf_general_reference_formula_equal(final SubLObject reference, final SubLObject formula)
  {
    if( reference.eql( formula ) )
    {
      return T;
    }
    if( !formula.isCons() )
    {
      return NIL;
    }
    if( !reference.isCons() )
    {
      return NIL;
    }
    if( reference.first() == $kw12$TERM && formula.first() == $kw12$TERM )
    {
      if( NIL != reference.rest() && NIL != formula.rest() )
      {
        return makeBoolean( conses_high.cadr( reference ).equal( conses_high.cadr( formula ) ) || NIL != Strings.string_equal( conses_high.cadr( reference ), conses_high.cadr( formula ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ) );
      }
      return Equality.equal( reference.rest(), formula.rest() );
    }
    else
    {
      if( formula.first() == $kw12$TERM && NIL != formula.rest() && conses_high.cadr( formula ).equal( reference ) )
      {
        return T;
      }
      return Equality.equal( reference, formula );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 9429L)
  public static SubLObject rkf_gather_term_references(final SubLObject formula)
  {
    return list_utilities.tree_gather( formula, Symbols.symbol_function( $sym13$RKF_TERM_REFERENCE_P ), Symbols.symbol_function( $sym14$RKF_GENERAL_REFERENCE_FORMULA_EQUAL ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 9574L)
  public static SubLObject rkf_gather_local_term_references(final SubLObject formula)
  {
    return list_utilities.tree_gather( formula, Symbols.symbol_function( $sym15$RKF_LOCAL_TERM_REFERENCE_P ), Symbols.symbol_function( $sym16$RKF_LOCAL_TERM_EQUAL ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 9716L)
  public static SubLObject rkf_gather_term_references_as_bindings(final SubLObject formula)
  {
    if( formula.isAtom() )
    {
      return NIL;
    }
    final SubLObject functor = formula.first();
    final SubLObject args = formula.rest();
    if( functor.eql( $const2$genls ) )
    {
      if( NIL != cycl_variables.el_varP( args.first() ) && NIL != rkf_term_reference_p( conses_high.cadr( args ) ) )
      {
        return ConsesLow.list( ConsesLow.cons( args.first(), conses_high.cadr( conses_high.cadr( args ) ) ) );
      }
      return NIL;
    }
    else if( functor.eql( $const3$isa ) )
    {
      if( NIL != cycl_variables.el_varP( args.first() ) && NIL != rkf_term_reference_p( conses_high.cadr( args ) ) )
      {
        return ConsesLow.list( ConsesLow.cons( args.first(), conses_high.cadr( conses_high.cadr( args ) ) ) );
      }
      return NIL;
    }
    else
    {
      if( functor.eql( $const11$and ) )
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.nconc( result, rkf_gather_term_references_as_bindings( arg ) );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        return result;
      }
      if( functor.eql( $const17$or ) )
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.nconc( result, rkf_gather_term_references_as_bindings( arg ) );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        return result;
      }
      if( functor.eql( $const18$implies ) )
      {
        return ConsesLow.nconc( rkf_gather_term_references_as_bindings( args.first() ), rkf_gather_term_references_as_bindings( conses_high.cadr( args ) ) );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 10910L)
  public static SubLObject rkf_term_reference_p(final SubLObject obj)
  {
    if( NIL != list_utilities.proper_list_p( obj ) )
    {
      final SubLObject length = Sequences.length( obj );
      return makeBoolean( $kw12$TERM == obj.first() && ( length.numE( TWO_INTEGER ) || length.numE( THREE_INTEGER ) ) && conses_high.second( obj ).isString() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 11147L)
  public static SubLObject rkf_local_term_reference_p(final SubLObject obj)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( obj ) && Sequences.length( obj ).numE( THREE_INTEGER ) && conses_high.second( obj ).isString() && conses_high.third( obj ).isNumber() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 11299L)
  public static SubLObject rkf_term_reference_term(final SubLObject obj)
  {
    if( NIL != rkf_term_reference_p( obj ) )
    {
      return conses_high.second( obj );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 11421L)
  public static SubLObject rkf_preferred_reference(final SubLObject fort, final SubLObject string, final SubLObject lexification_mt, SubLObject pred)
  {
    if( pred == UNPROVIDED )
    {
      pred = $kw19$DEFAULT;
    }
    assert NIL != forts.fort_p( fort ) : fort;
    assert NIL != Types.stringp( string ) : string;
    assert NIL != hlmt.hlmt_p( lexification_mt ) : lexification_mt;
    if( pred == $kw19$DEFAULT )
    {
      pred = $const23$preferredTermStrings;
    }
    assert NIL != fort_types_interface.predicate_p( pred ) : pred;
    rkf_assertion_utilities.rkf_assert( ConsesLow.list( pred, fort, string ), lexification_mt, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 11868L)
  public static SubLObject rkf_phrase_candidate_terms(final SubLObject phrase, final SubLObject parsing_mt, final SubLObject domain_mt, SubLObject parse_template)
  {
    if( parse_template == UNPROVIDED )
    {
      parse_template = NIL;
    }
    assert NIL != Types.stringp( phrase ) : phrase;
    SubLObject candidate_terms = NIL;
    final SubLObject parses = rkf_text_processors.rkf_term_reader( phrase, parsing_mt, domain_mt, parse_template );
    if( NIL != parses )
    {
      SubLObject current;
      final SubLObject datum = current = parses.first();
      SubLObject span = NIL;
      SubLObject interpretations = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
      span = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
      interpretations = current.first();
      current = current.rest();
      if( NIL == current )
      {
        candidate_terms = interpretations;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
      }
    }
    candidate_terms = rkf_relevance_utilities.rkf_filter_irrelevant_terms( candidate_terms, domain_mt );
    return candidate_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 12538L)
  public static SubLObject rkf_phrase_candidate_terms_in_sentence(final SubLObject phrase, final SubLObject parsing_mt, final SubLObject domain_mt)
  {
    assert NIL != Types.stringp( phrase ) : phrase;
    SubLObject candidate_terms = NIL;
    final SubLObject parses = rkf_text_processors.rkf_term_in_sentence_reader( phrase, parsing_mt, domain_mt, UNPROVIDED );
    final SubLObject token_count = Sequences.length( rkf_concept_harvester.rkf_ch_string_tokenize( phrase ) );
    final SubLObject full_span = rkf_phrase_candidate_helper_generate_span( ZERO_INTEGER, Numbers.subtract( token_count, ONE_INTEGER ) );
    SubLObject cdolist_list_var = parses;
    SubLObject parse_for_span = NIL;
    parse_for_span = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = parse_for_span;
      SubLObject span = NIL;
      SubLObject interpretations = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
      span = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
      interpretations = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( full_span.equalp( span ) )
        {
          candidate_terms = Sequences.cconcatenate( candidate_terms, interpretations );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parse_for_span = cdolist_list_var.first();
    }
    candidate_terms = rkf_relevance_utilities.rkf_filter_irrelevant_terms( candidate_terms, domain_mt );
    return candidate_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-tools.lisp", position = 13519L)
  public static SubLObject rkf_phrase_candidate_helper_generate_span(final SubLObject lower, final SubLObject upper)
  {
    final SubLObject count = Numbers.add( Numbers.subtract( upper, lower ), ONE_INTEGER );
    SubLObject span = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      span = ConsesLow.cons( Numbers.subtract( upper, i ), span );
    }
    return span;
  }

  public static SubLObject declare_rkf_tools_file()
  {
    SubLFiles.declareFunction( me, "initialize_rkf_kb_feature", "INITIALIZE-RKF-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_compare_terms", "RKF-COMPARE-TERMS", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_sentences_in_common", "RKF-SENTENCES-IN-COMMON", 5, 0, false );
    SubLFiles.declareFunction( me, "rkf_relevant_and_knownP", "RKF-RELEVANT-AND-KNOWN?", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_remove_unmentioned_constraints", "RKF-REMOVE-UNMENTIONED-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_explicit_constraints", "RKF-EXPLICIT-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_type_constraints", "RKF-TYPE-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_type_constraint_set", "RKF-TYPE-CONSTRAINT-SET", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_type_constraint_isas_and_genls", "RKF-TYPE-CONSTRAINT-ISAS-AND-GENLS", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_substitute_terms_in_sentence", "RKF-SUBSTITUTE-TERMS-IN-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_general_reference_formula_equal", "RKF-GENERAL-REFERENCE-FORMULA-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_gather_term_references", "RKF-GATHER-TERM-REFERENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_gather_local_term_references", "RKF-GATHER-LOCAL-TERM-REFERENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_gather_term_references_as_bindings", "RKF-GATHER-TERM-REFERENCES-AS-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_term_reference_p", "RKF-TERM-REFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_local_term_reference_p", "RKF-LOCAL-TERM-REFERENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_term_reference_term", "RKF-TERM-REFERENCE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_preferred_reference", "RKF-PREFERRED-REFERENCE", 3, 1, false );
    SubLFiles.declareFunction( me, "rkf_phrase_candidate_terms", "RKF-PHRASE-CANDIDATE-TERMS", 3, 1, false );
    SubLFiles.declareFunction( me, "rkf_phrase_candidate_terms_in_sentence", "RKF-PHRASE-CANDIDATE-TERMS-IN-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_phrase_candidate_helper_generate_span", "RKF-PHRASE-CANDIDATE-HELPER-GENERATE-SPAN", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_tools_file()
  {
    $rkf_core_constants$ = SubLFiles.deflexical( "*RKF-CORE-CONSTANTS*", $list0 );
    $rkf_max_arity$ = SubLFiles.deflexical( "*RKF-MAX-ARITY*", FIVE_INTEGER );
    $rkf_common_sentences_recurseP$ = SubLFiles.defparameter( "*RKF-COMMON-SENTENCES-RECURSE?*", NIL );
    return NIL;
  }

  public static SubLObject setup_rkf_tools_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_tools_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_tools_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_tools_file();
  }
  static
  {
    me = new rkf_tools();
    $rkf_core_constants$ = null;
    $rkf_max_arity$ = null;
    $rkf_common_sentences_recurseP$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inheritedTermSentences" ) ), constant_handles.reader_make_constant_shell( makeString( "termDependsOn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "ScenarioInstanceFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TheNthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "scenarioTerms" ) ), constant_handles.reader_make_constant_shell( makeString( "mtTopic" ) ) );
    $sym1$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $const2$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const3$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw4$IGNORE = makeKeyword( "IGNORE" );
    $sym5$__TERM = makeSymbol( "??TERM" );
    $const6$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $sym7$RKF_CH_PARSING_SURROGATE_P = makeSymbol( "RKF-CH-PARSING-SURROGATE-P" );
    $list8 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "??TERM" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) );
    $sym9$_OBJ = makeSymbol( "?OBJ" );
    $const10$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $const11$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $kw12$TERM = makeKeyword( "TERM" );
    $sym13$RKF_TERM_REFERENCE_P = makeSymbol( "RKF-TERM-REFERENCE-P" );
    $sym14$RKF_GENERAL_REFERENCE_FORMULA_EQUAL = makeSymbol( "RKF-GENERAL-REFERENCE-FORMULA-EQUAL" );
    $sym15$RKF_LOCAL_TERM_REFERENCE_P = makeSymbol( "RKF-LOCAL-TERM-REFERENCE-P" );
    $sym16$RKF_LOCAL_TERM_EQUAL = makeSymbol( "RKF-LOCAL-TERM-EQUAL" );
    $const17$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $const18$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $kw19$DEFAULT = makeKeyword( "DEFAULT" );
    $sym20$FORT_P = makeSymbol( "FORT-P" );
    $sym21$STRINGP = makeSymbol( "STRINGP" );
    $sym22$HLMT_P = makeSymbol( "HLMT-P" );
    $const23$preferredTermStrings = constant_handles.reader_make_constant_shell( makeString( "preferredTermStrings" ) );
    $sym24$PREDICATE_P = makeSymbol( "PREDICATE-P" );
    $list25 = ConsesLow.list( makeSymbol( "SPAN" ), makeSymbol( "INTERPRETATIONS" ) );
  }
}
/*
 * 
 * Total time: 181 ms
 * 
 */