package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.harness.conjunctive_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subcollection_unwinder
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subcollection_unwinder";
  public static final String myFingerPrint = "9b861224aeffb9754ab4abeee053f65141390ac4df0572394219c55f0f813c82";
  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 882L)
  private static SubLSymbol $subcol_unwind_existential_variables$;
  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 9358L)
  private static SubLSymbol $isa_subcol_unwind_patterns$;
  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 9925L)
  private static SubLSymbol $isa_subcol_unwind_patterns_complex$;
  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 22723L)
  private static SubLSymbol $isa_subcol_unwind_template_map$;
  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 34305L)
  private static SubLSymbol $existential_unwind_patterns$;
  private static final SubLSymbol $kw0$UNINITIALIZED;
  private static final SubLSymbol $sym1$PIF;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CLET;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$PROGN;
  private static final SubLSymbol $sym6$_EXIT;
  private static final SubLSymbol $sym7$SUBCOL_UNWIND_LITERAL_INT;
  private static final SubLSymbol $kw8$EXISTS;
  private static final SubLObject $const9$isa;
  private static final SubLObject $const10$equals;
  private static final SubLObject $const11$equalSymbols;
  private static final SubLObject $const12$Kappa;
  private static final SubLObject $const13$TheSetOf;
  private static final SubLSymbol $sym14$DMR_SUBCOL_EXPAND_SIGNATURE;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$CAAR;
  private static final SubLObject $const17$subcollectionFunctionClassificati;
  private static final SubLSymbol $sym18$EL_VAR_;
  private static final SubLSymbol $sym19$EL_VAR_TO_KEYWORD;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$_ISA_SUBCOL_UNWIND_PATTERNS_;
  private static final SubLSymbol $sym22$IS_SUBCOLLECTION_PATTERN_PREDICATE_ASSERTION;
  private static final SubLSymbol $sym23$FORMULA_ARG0;
  private static final SubLObject $list24;
  private static final SubLSymbol $sym25$_ISA_SUBCOL_UNWIND_TEMPLATE_MAP_;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$META_VARIABLE_P;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$OBJ;
  private static final SubLSymbol $kw30$BIND;
  private static final SubLSymbol $kw31$VALUE;
  private static final SubLSymbol $kw32$TEMPLATE;
  private static final SubLObject $const33$Thing;
  private static final SubLObject $const34$CollectionIntersection2Fn;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLObject $const37$elementOf;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$CAADR;
  private static final SubLList $list41;

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 1150L)
  public static SubLObject with_existential_variable_tracking(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym1$PIF, $list2, ConsesLow.listS( $sym3$CLET, $list4, ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym5$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 1394L)
  public static SubLObject subcol_unwind_literal(final SubLObject literal)
  {
    return subcol_unwind_literals( ConsesLow.list( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 1491L)
  public static SubLObject subcol_unwind_literals(final SubLObject literals)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $subcol_unwind_existential_variables$.getDynamicValue( thread ).eql( $kw0$UNINITIALIZED ) )
    {
      final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding( thread );
      try
      {
        $subcol_unwind_existential_variables$.bind( NIL, thread );
        SubLObject unwound_literals = NIL;
        SubLObject v_variables = NIL;
        unwound_literals = subcol_unwind_literals_int( literals );
        v_variables = Sequences.reverse( $subcol_unwind_existential_variables$.getDynamicValue( thread ) );
        unwound_literals = Sequences.delete_duplicates( unwound_literals, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        unwound_literals = kb_utilities.sort_terms( unwound_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return Values.values( unwound_literals, v_variables );
      }
      finally
      {
        $subcol_unwind_existential_variables$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject unwound_literals2 = NIL;
    SubLObject v_variables2 = NIL;
    unwound_literals2 = subcol_unwind_literals_int( literals );
    v_variables2 = Sequences.reverse( $subcol_unwind_existential_variables$.getDynamicValue( thread ) );
    unwound_literals2 = Sequences.delete_duplicates( unwound_literals2, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    unwound_literals2 = kb_utilities.sort_terms( unwound_literals2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Values.values( unwound_literals2, v_variables2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 1961L)
  public static SubLObject subcol_unwind_literals_int(final SubLObject literals)
  {
    SubLObject unwindings;
    for( unwindings = ConsesLow.list( Mapping.mapcar( Symbols.symbol_function( $sym7$SUBCOL_UNWIND_LITERAL_INT ), literals ) ); ONE_INTEGER.numE( Sequences.length( unwindings ) ); unwindings = unwindings.first() )
    {
    }
    return unwindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 2283L)
  public static SubLObject subcol_unwind_literal_int(final SubLObject literal)
  {
    SubLObject result = literal;
    if( NIL != isa_naut_literalP( literal ) )
    {
      final SubLObject operator = cycl_utilities.formula_operator( cycl_utilities.formula_arg2( literal, UNPROVIDED ) );
      final SubLObject template = subcol_unwind_template_lookup( operator );
      if( NIL != template )
      {
        final SubLObject unwindings = formula_pattern_match.pattern_transform_formula( template, literal, UNPROVIDED );
        result = subcol_unwind_literals_int( unwindings );
      }
    }
    else if( NIL != existential_introduction_literalP( literal ) )
    {
      final SubLObject operator = cycl_utilities.formula_operator( literal );
      final SubLObject template = subcol_existential_unwind_template_lookup( operator );
      if( NIL != template )
      {
        final SubLObject variable = subcol_unwind_allocate_existential_variable();
        final SubLObject v_bindings = ConsesLow.list( reader.bq_cons( $kw8$EXISTS, variable ) );
        final SubLObject unwindings2 = formula_pattern_match.pattern_transform_formula( template, literal, v_bindings );
        result = subcol_unwind_literals_int( unwindings2 );
      }
    }
    else if( NIL != el_utilities.kappa_asent_p( literal ) )
    {
      final SubLObject kappa_predicate = cycl_utilities.formula_operator( literal );
      final SubLObject kappa_predicate_vars = el_utilities.kappa_predicate_formal_args( kappa_predicate );
      final SubLObject kappa_asent_args = cycl_utilities.formula_args( literal, UNPROVIDED );
      SubLObject var_subs = NIL;
      SubLObject cdolist_list_var = kappa_predicate_vars;
      SubLObject kappa_var = NIL;
      kappa_var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        var_subs = ConsesLow.cons( reader.bq_cons( kappa_var, cycl_variables.make_el_var( Symbols.gensym( UNPROVIDED ) ) ), var_subs );
        cdolist_list_var = cdolist_list_var.rest();
        kappa_var = cdolist_list_var.first();
      }
      result = reader.bq_cons( conses_high.sublis( var_subs, kappa_predicate, UNPROVIDED, UNPROVIDED ), ConsesLow.append( kappa_asent_args, NIL ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 3678L)
  public static SubLObject isa_naut_literalP(final SubLObject v_object)
  {
    return binary_pred_arg2_naut_literalP( v_object, $const9$isa );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 3777L)
  public static SubLObject equals_naut_literalP(final SubLObject v_object)
  {
    return binary_pred_arg2_naut_literalP( v_object, $const10$equals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 3882L)
  public static SubLObject equal_symbols_naut_literalP(final SubLObject v_object)
  {
    return binary_pred_arg2_naut_literalP( v_object, $const11$equalSymbols );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 4000L)
  public static SubLObject binary_pred_arg2_naut_literalP(final SubLObject v_object, final SubLObject pred)
  {
    return makeBoolean( NIL != el_utilities.el_formula_with_operator_p( v_object, pred ) && NIL != el_utilities.el_binary_formula_p( v_object ) && NIL != el_utilities.possibly_naut_p( cycl_utilities.el_formula_arg2(
        v_object, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 4203L)
  public static SubLObject subcollection_kappa_expansion(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != constrained_parsing.subcollection_naut_p( sentence ) )
    {
      if( $subcol_unwind_existential_variables$.getDynamicValue( thread ).eql( $kw0$UNINITIALIZED ) )
      {
        final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding( thread );
        try
        {
          $subcol_unwind_existential_variables$.bind( NIL, thread );
          thread.resetMultipleValues();
          final SubLObject unwound_sentence = scg_subcl_expand_signature_int( sentence );
          final SubLObject v_variables = thread.secondMultipleValue();
          thread.resetMultipleValues();
          final SubLObject variable = subcol_unwind_allocate_existential_variable();
          final SubLObject existentially_wrapped_sentence = conjunctive_strategist.el_wrap_existentials( v_variables, unwound_sentence );
          return el_utilities.make_binary_formula( $const12$Kappa, ConsesLow.list( variable ), existentially_wrapped_sentence );
        }
        finally
        {
          $subcol_unwind_existential_variables$.rebind( _prev_bind_0, thread );
        }
      }
      thread.resetMultipleValues();
      final SubLObject unwound_sentence2 = scg_subcl_expand_signature_int( sentence );
      final SubLObject v_variables2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject variable2 = subcol_unwind_allocate_existential_variable();
      final SubLObject existentially_wrapped_sentence2 = conjunctive_strategist.el_wrap_existentials( v_variables2, unwound_sentence2 );
      return el_utilities.make_binary_formula( $const12$Kappa, ConsesLow.list( variable2 ), existentially_wrapped_sentence2 );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 5441L)
  public static SubLObject subcollection_the_set_of_expansion(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != constrained_parsing.subcollection_naut_p( sentence ) )
    {
      if( $subcol_unwind_existential_variables$.getDynamicValue( thread ).eql( $kw0$UNINITIALIZED ) )
      {
        final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding( thread );
        try
        {
          $subcol_unwind_existential_variables$.bind( NIL, thread );
          thread.resetMultipleValues();
          final SubLObject unwound_sentence = scg_subcl_expand_signature_int( sentence );
          final SubLObject v_variables = thread.secondMultipleValue();
          thread.resetMultipleValues();
          final SubLObject variable = subcol_unwind_allocate_existential_variable();
          final SubLObject existentially_wrapped_sentence = conjunctive_strategist.el_wrap_existentials( v_variables, unwound_sentence );
          return el_utilities.make_binary_formula( $const13$TheSetOf, variable, existentially_wrapped_sentence );
        }
        finally
        {
          $subcol_unwind_existential_variables$.rebind( _prev_bind_0, thread );
        }
      }
      thread.resetMultipleValues();
      final SubLObject unwound_sentence2 = scg_subcl_expand_signature_int( sentence );
      final SubLObject v_variables2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject variable2 = subcol_unwind_allocate_existential_variable();
      final SubLObject existentially_wrapped_sentence2 = conjunctive_strategist.el_wrap_existentials( v_variables2, unwound_sentence2 );
      return el_utilities.make_binary_formula( $const13$TheSetOf, variable2, existentially_wrapped_sentence2 );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 5943L)
  public static SubLObject scg_subcol_expand_to_existential_sentence(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $subcol_unwind_existential_variables$.getDynamicValue( thread ).eql( $kw0$UNINITIALIZED ) )
    {
      final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding( thread );
      try
      {
        $subcol_unwind_existential_variables$.bind( NIL, thread );
        thread.resetMultipleValues();
        final SubLObject unwound_sentence = scg_subcol_expand_signature( sentence );
        final SubLObject v_variables = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return conjunctive_strategist.el_wrap_existentials( kb_utilities.sort_terms( v_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), unwound_sentence );
      }
      finally
      {
        $subcol_unwind_existential_variables$.rebind( _prev_bind_0, thread );
      }
    }
    thread.resetMultipleValues();
    final SubLObject unwound_sentence2 = scg_subcol_expand_signature( sentence );
    final SubLObject v_variables2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return conjunctive_strategist.el_wrap_existentials( kb_utilities.sort_terms( v_variables2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), unwound_sentence2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 6222L)
  public static SubLObject scg_subcol_expand_signature(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $subcol_unwind_existential_variables$.getDynamicValue( thread ).eql( $kw0$UNINITIALIZED ) )
    {
      final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding( thread );
      try
      {
        $subcol_unwind_existential_variables$.bind( NIL, thread );
        if( NIL != equals_naut_literalP( sentence ) || NIL != equal_symbols_naut_literalP( sentence ) )
        {
          return scg_subcl_expand_signature_int( cycl_utilities.formula_arg2( sentence, UNPROVIDED ) );
        }
        if( NIL != isa_naut_literalP( sentence ) )
        {
          return scg_subcl_expand_signature_int( cycl_utilities.formula_arg2( sentence, UNPROVIDED ) );
        }
        if( NIL != el_utilities.el_conjunction_p( sentence ) )
        {
          final SubLObject conjuncts = sentence.rest();
          SubLObject unwound_literals = NIL;
          SubLObject v_variables = NIL;
          SubLObject cdolist_list_var = conjuncts;
          SubLObject conjunct = NIL;
          conjunct = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            thread.resetMultipleValues();
            final SubLObject unwound_sentence = scg_subcol_expand_signature( conjunct );
            final SubLObject conjunct_variables = thread.secondMultipleValue();
            thread.resetMultipleValues();
            unwound_literals = ConsesLow.append( unwound_literals, ConsesLow.list( unwound_sentence ) );
            v_variables = conses_high.union( v_variables, conjunct_variables, Symbols.symbol_function( EQUAL ), UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
          }
          return subl_promotions.values2( simplifier.simplify_cycl_sentence_syntax( el_utilities.make_conjunction( unwound_literals ), UNPROVIDED ), v_variables );
        }
      }
      finally
      {
        $subcol_unwind_existential_variables$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      if( NIL != equals_naut_literalP( sentence ) || NIL != equal_symbols_naut_literalP( sentence ) )
      {
        return scg_subcl_expand_signature_int( cycl_utilities.formula_arg2( sentence, UNPROVIDED ) );
      }
      if( NIL != isa_naut_literalP( sentence ) )
      {
        return scg_subcl_expand_signature_int( cycl_utilities.formula_arg2( sentence, UNPROVIDED ) );
      }
      if( NIL != el_utilities.el_conjunction_p( sentence ) )
      {
        final SubLObject conjuncts2 = sentence.rest();
        SubLObject unwound_literals2 = NIL;
        SubLObject v_variables2 = NIL;
        SubLObject cdolist_list_var2 = conjuncts2;
        SubLObject conjunct2 = NIL;
        conjunct2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          thread.resetMultipleValues();
          final SubLObject unwound_sentence2 = scg_subcol_expand_signature( conjunct2 );
          final SubLObject conjunct_variables2 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          unwound_literals2 = ConsesLow.append( unwound_literals2, ConsesLow.list( unwound_sentence2 ) );
          v_variables2 = conses_high.union( v_variables2, conjunct_variables2, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          cdolist_list_var2 = cdolist_list_var2.rest();
          conjunct2 = cdolist_list_var2.first();
        }
        return subl_promotions.values2( simplifier.simplify_cycl_sentence_syntax( el_utilities.make_conjunction( unwound_literals2 ), UNPROVIDED ), v_variables2 );
      }
    }
    return subl_promotions.values2( sentence, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 7231L)
  public static SubLObject scg_subcl_expand_signature_int(final SubLObject subcol)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $subcol_unwind_existential_variables$.getDynamicValue( thread ).eql( $kw0$UNINITIALIZED ) )
    {
      final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding( thread );
      try
      {
        $subcol_unwind_existential_variables$.bind( NIL, thread );
        if( NIL == subcol_unwind_template_lookup( cycl_utilities.formula_arg0( subcol ) ) )
        {
          return subl_promotions.values2( simplifier.simplify_cycl_sentence_syntax( subcol, UNPROVIDED ), NIL );
        }
        final SubLObject variable = subcol_unwind_allocate_existential_variable();
        final SubLObject literal = el_utilities.make_binary_formula( $const9$isa, variable, subcol );
        thread.resetMultipleValues();
        final SubLObject unwound_literal = subcol_unwind_literal( literal );
        final SubLObject v_variables = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2( simplifier.simplify_cycl_sentence_syntax( unwound_literal, UNPROVIDED ), v_variables );
      }
      finally
      {
        $subcol_unwind_existential_variables$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL == subcol_unwind_template_lookup( cycl_utilities.formula_arg0( subcol ) ) )
    {
      return subl_promotions.values2( simplifier.simplify_cycl_sentence_syntax( subcol, UNPROVIDED ), NIL );
    }
    final SubLObject variable2 = subcol_unwind_allocate_existential_variable();
    final SubLObject literal2 = el_utilities.make_binary_formula( $const9$isa, variable2, subcol );
    thread.resetMultipleValues();
    final SubLObject unwound_literal2 = subcol_unwind_literal( literal2 );
    final SubLObject v_variables2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return subl_promotions.values2( simplifier.simplify_cycl_sentence_syntax( unwound_literal2, UNPROVIDED ), v_variables2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 7868L)
  public static SubLObject dmr_subcol_expand_signature(final SubLObject sentence)
  {
    return scg_subcol_expand_signature( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 8019L)
  public static SubLObject scg_sentence_fully_unwoundP(final SubLObject scg_sentence)
  {
    final SubLObject match_patterns = Mapping.mapcar( Symbols.symbol_function( $sym16$CAAR ), $isa_subcol_unwind_patterns$.getGlobalValue() );
    final SubLObject flat_scg_sent = list_utilities.flatten( scg_sentence );
    final SubLObject unwound_terms = conses_high.intersection( match_patterns, flat_scg_sent, UNPROVIDED, UNPROVIDED );
    if( NIL != unwound_terms )
    {
      return Values.values( NIL, unwound_terms );
    }
    return Values.values( T, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 8603L)
  public static SubLObject is_subcollection_pattern_predicate_assertion(final SubLObject arg0)
  {
    return Equality.eql( arg0, $const17$subcollectionFunctionClassificati );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 8739L)
  public static SubLObject create_subcollection_unwind_template(final SubLObject subcollection_assertion)
  {
    final SubLObject subcollection_operator = cycl_utilities.formula_arg1( subcollection_assertion, UNPROVIDED );
    final SubLObject subcollection_kappa = cycl_utilities.formula_arg2( subcollection_assertion, UNPROVIDED );
    final SubLObject var_list = cycl_utilities.formula_arg1( subcollection_kappa, UNPROVIDED );
    final SubLObject body = cycl_utilities.formula_arg2( subcollection_kappa, UNPROVIDED );
    final SubLObject unwind_pattern_el = ConsesLow.list( conses_high.adjoin( subcollection_operator, var_list.rest(), UNPROVIDED, UNPROVIDED ), body );
    SubLObject unwind_pattern = cycl_utilities.formula_transform( unwind_pattern_el, $sym18$EL_VAR_, $sym19$EL_VAR_TO_KEYWORD, UNPROVIDED, UNPROVIDED );
    unwind_pattern = conses_high.nsublis( $list20, unwind_pattern, UNPROVIDED, UNPROVIDED );
    return unwind_pattern;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 9411L)
  public static SubLObject get_subcollection_patterns_from_kb()
  {
    if( NIL == $isa_subcol_unwind_patterns$.getGlobalValue() )
    {
      final SubLObject all_assertions = kb_accessors.all_term_assertions( $const17$subcollectionFunctionClassificati, UNPROVIDED );
      SubLObject cdolist_list_var;
      final SubLObject subcollection_assertions = cdolist_list_var = list_utilities.remove_if_not( Symbols.symbol_function( $sym22$IS_SUBCOLLECTION_PATTERN_PREDICATE_ASSERTION ), all_assertions, Symbols.symbol_function(
          $sym23$FORMULA_ARG0 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject subcol_assert = NIL;
      subcol_assert = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        $isa_subcol_unwind_patterns$.setGlobalValue( ConsesLow.cons( create_subcollection_unwind_template( subcol_assert ), $isa_subcol_unwind_patterns$.getGlobalValue() ) );
        cdolist_list_var = cdolist_list_var.rest();
        subcol_assert = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 30978L)
  public static SubLObject subcol_unwind_template_lookup(final SubLObject operator)
  {
    get_subcollection_patterns_from_kb();
    possibly_initialize_isa_subcol_unwind_template_map();
    return Hashtables.gethash_without_values( operator, $isa_subcol_unwind_template_map$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 31232L)
  public static SubLObject possibly_initialize_isa_subcol_unwind_template_map()
  {
    if( NIL == $isa_subcol_unwind_template_map$.getGlobalValue() )
    {
      $isa_subcol_unwind_template_map$.setGlobalValue( Hashtables.make_hash_table( Sequences.length( $isa_subcol_unwind_patterns$.getGlobalValue() ), Symbols.symbol_function( EQL ), UNPROVIDED ) );
      return rebuild_isa_subcol_unwind_template_map();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 31507L)
  public static SubLObject rebuild_isa_subcol_unwind_template_map()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Hashtables.clrhash( $isa_subcol_unwind_template_map$.getGlobalValue() );
    SubLObject cdolist_list_var = ConsesLow.append( $isa_subcol_unwind_patterns$.getGlobalValue(), $isa_subcol_unwind_patterns_complex$.getDynamicValue( thread ) );
    SubLObject one_pattern = NIL;
    one_pattern = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = one_pattern;
      SubLObject match_pattern = NIL;
      SubLObject substitute_pattern = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
      match_pattern = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
      substitute_pattern = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject operator = cycl_utilities.formula_operator( match_pattern );
        final SubLObject template = compute_isa_subcol_unwind_template( match_pattern, substitute_pattern );
        Hashtables.sethash( operator, $isa_subcol_unwind_template_map$.getGlobalValue(), template );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      one_pattern = cdolist_list_var.first();
    }
    return Hashtables.hash_table_size( $isa_subcol_unwind_template_map$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 32083L)
  public static SubLObject compute_isa_subcol_unwind_template(SubLObject match_pattern, SubLObject substitute_pattern)
  {
    SubLObject meta_variables = cycl_utilities.expression_gather( match_pattern, Symbols.symbol_function( $sym27$META_VARIABLE_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject bind_mapping = NIL;
    SubLObject value_mapping = NIL;
    meta_variables = conses_high.nset_difference( meta_variables, $list28, UNPROVIDED, UNPROVIDED );
    final SubLObject item_var = $kw29$OBJ;
    if( NIL == conses_high.member( item_var, meta_variables, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      meta_variables = ConsesLow.cons( item_var, meta_variables );
    }
    SubLObject cdolist_list_var = meta_variables;
    SubLObject meta_variable = NIL;
    meta_variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pattern_symbol = Packages.intern( Symbols.symbol_name( meta_variable ), control_vars.$cyc_package$.getGlobalValue() );
      bind_mapping = ConsesLow.cons( ConsesLow.cons( meta_variable, ConsesLow.list( $kw30$BIND, pattern_symbol ) ), bind_mapping );
      value_mapping = ConsesLow.cons( ConsesLow.cons( meta_variable, ConsesLow.list( $kw31$VALUE, pattern_symbol ) ), value_mapping );
      cdolist_list_var = cdolist_list_var.rest();
      meta_variable = cdolist_list_var.first();
    }
    match_pattern = ConsesLow.list( $const9$isa, $kw29$OBJ, match_pattern );
    match_pattern = conses_high.sublis( bind_mapping, match_pattern, UNPROVIDED, UNPROVIDED );
    substitute_pattern = conses_high.sublis( value_mapping, substitute_pattern, UNPROVIDED, UNPROVIDED );
    final SubLObject template = ConsesLow.list( $kw32$TEMPLATE, match_pattern, substitute_pattern );
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 33133L)
  public static SubLObject subcol_unwind_collection_intersection_set(final SubLObject el_set)
  {
    final SubLObject elements = el_utilities.extensional_set_elements( el_set );
    return subcol_unwind_collection_intersection_set_recursive( elements );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 33365L)
  public static SubLObject subcol_unwind_collection_intersection_set_recursive(final SubLObject elements)
  {
    if( NIL == elements )
    {
      return $const33$Thing;
    }
    if( NIL != list_utilities.singletonP( elements ) )
    {
      return elements.first();
    }
    if( NIL != list_utilities.doubletonP( elements ) )
    {
      return el_utilities.make_binary_formula( $const34$CollectionIntersection2Fn, elements.first(), conses_high.second( elements ) );
    }
    SubLObject first = NIL;
    SubLObject second = NIL;
    SubLObject third = NIL;
    SubLObject rest = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( elements, elements, $list35 );
    first = elements.first();
    SubLObject current = elements.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, elements, $list35 );
    second = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, elements, $list35 );
    third = current.first();
    current = ( rest = current.rest() );
    final SubLObject subsolution = subcol_unwind_collection_intersection_set_recursive( ConsesLow.listS( second, third, rest ) );
    return el_utilities.make_binary_formula( $const34$CollectionIntersection2Fn, first, subsolution );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 33919L)
  public static SubLObject subcol_unwind_the_set(final SubLObject elements, final SubLObject predicate, final SubLObject outer_existential)
  {
    final SubLObject existential = subcol_unwind_allocate_existential_variable();
    SubLObject result = ConsesLow.list( ConsesLow.listS( $const9$isa, existential, $list36 ), ConsesLow.list( predicate, outer_existential, existential ) );
    SubLObject cdolist_list_var = elements;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( ConsesLow.list( $const37$elementOf, elem, existential ), result );
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return el_utilities.make_conjunction( Sequences.nreverse( result ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 35126L)
  public static SubLObject subcol_substitute_pattern_existential(final SubLObject var, final SubLObject allocated_existential, final SubLObject body)
  {
    return conses_high.sublis( ConsesLow.list( reader.bq_cons( var, allocated_existential ) ), body, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 35356L)
  public static SubLObject existential_introduction_literalP(final SubLObject v_object)
  {
    return el_utilities.el_formula_with_any_of_operators_p( v_object, $list39 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 35550L)
  public static SubLObject subcol_existential_unwind_template_lookup(final SubLObject operator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.find( operator, $existential_unwind_patterns$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym40$CAADR ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwinder.lisp", position = 35730L)
  public static SubLObject subcol_unwind_allocate_existential_variable()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject num_alloc = Sequences.length( $subcol_unwind_existential_variables$.getDynamicValue( thread ) );
    final SubLObject new_var = ConsesLow.nth( num_alloc, $list41 );
    $subcol_unwind_existential_variables$.setDynamicValue( ConsesLow.cons( new_var, $subcol_unwind_existential_variables$.getDynamicValue( thread ) ), thread );
    return new_var;
  }

  public static SubLObject declare_subcollection_unwinder_file()
  {
    SubLFiles.declareMacro( me, "with_existential_variable_tracking", "WITH-EXISTENTIAL-VARIABLE-TRACKING" );
    SubLFiles.declareFunction( me, "subcol_unwind_literal", "SUBCOL-UNWIND-LITERAL", 1, 0, false );
    SubLFiles.declareFunction( me, "subcol_unwind_literals", "SUBCOL-UNWIND-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "subcol_unwind_literals_int", "SUBCOL-UNWIND-LITERALS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "subcol_unwind_literal_int", "SUBCOL-UNWIND-LITERAL-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_naut_literalP", "ISA-NAUT-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "equals_naut_literalP", "EQUALS-NAUT-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "equal_symbols_naut_literalP", "EQUAL-SYMBOLS-NAUT-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "binary_pred_arg2_naut_literalP", "BINARY-PRED-ARG2-NAUT-LITERAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "subcollection_kappa_expansion", "SUBCOLLECTION-KAPPA-EXPANSION", 1, 0, false );
    SubLFiles.declareFunction( me, "subcollection_the_set_of_expansion", "SUBCOLLECTION-THE-SET-OF-EXPANSION", 1, 0, false );
    SubLFiles.declareFunction( me, "scg_subcol_expand_to_existential_sentence", "SCG-SUBCOL-EXPAND-TO-EXISTENTIAL-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "scg_subcol_expand_signature", "SCG-SUBCOL-EXPAND-SIGNATURE", 1, 0, false );
    SubLFiles.declareFunction( me, "scg_subcl_expand_signature_int", "SCG-SUBCL-EXPAND-SIGNATURE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "dmr_subcol_expand_signature", "DMR-SUBCOL-EXPAND-SIGNATURE", 1, 0, false );
    SubLFiles.declareFunction( me, "scg_sentence_fully_unwoundP", "SCG-SENTENCE-FULLY-UNWOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_subcollection_pattern_predicate_assertion", "IS-SUBCOLLECTION-PATTERN-PREDICATE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "create_subcollection_unwind_template", "CREATE-SUBCOLLECTION-UNWIND-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_subcollection_patterns_from_kb", "GET-SUBCOLLECTION-PATTERNS-FROM-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "subcol_unwind_template_lookup", "SUBCOL-UNWIND-TEMPLATE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_initialize_isa_subcol_unwind_template_map", "POSSIBLY-INITIALIZE-ISA-SUBCOL-UNWIND-TEMPLATE-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "rebuild_isa_subcol_unwind_template_map", "REBUILD-ISA-SUBCOL-UNWIND-TEMPLATE-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_isa_subcol_unwind_template", "COMPUTE-ISA-SUBCOL-UNWIND-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "subcol_unwind_collection_intersection_set", "SUBCOL-UNWIND-COLLECTION-INTERSECTION-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "subcol_unwind_collection_intersection_set_recursive", "SUBCOL-UNWIND-COLLECTION-INTERSECTION-SET-RECURSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "subcol_unwind_the_set", "SUBCOL-UNWIND-THE-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "subcol_substitute_pattern_existential", "SUBCOL-SUBSTITUTE-PATTERN-EXISTENTIAL", 3, 0, false );
    SubLFiles.declareFunction( me, "existential_introduction_literalP", "EXISTENTIAL-INTRODUCTION-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "subcol_existential_unwind_template_lookup", "SUBCOL-EXISTENTIAL-UNWIND-TEMPLATE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "subcol_unwind_allocate_existential_variable", "SUBCOL-UNWIND-ALLOCATE-EXISTENTIAL-VARIABLE", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_subcollection_unwinder_file()
  {
    $subcol_unwind_existential_variables$ = SubLFiles.defparameter( "*SUBCOL-UNWIND-EXISTENTIAL-VARIABLES*", $kw0$UNINITIALIZED );
    $isa_subcol_unwind_patterns$ = SubLFiles.deflexical( "*ISA-SUBCOL-UNWIND-PATTERNS*", ( maybeDefault( $sym21$_ISA_SUBCOL_UNWIND_PATTERNS_, $isa_subcol_unwind_patterns$, NIL ) ) );
    $isa_subcol_unwind_patterns_complex$ = SubLFiles.defparameter( "*ISA-SUBCOL-UNWIND-PATTERNS-COMPLEX*", $list24 );
    $isa_subcol_unwind_template_map$ = SubLFiles.deflexical( "*ISA-SUBCOL-UNWIND-TEMPLATE-MAP*", ( maybeDefault( $sym25$_ISA_SUBCOL_UNWIND_TEMPLATE_MAP_, $isa_subcol_unwind_template_map$, NIL ) ) );
    $existential_unwind_patterns$ = SubLFiles.defparameter( "*EXISTENTIAL-UNWIND-PATTERNS*", $list38 );
    return NIL;
  }

  public static SubLObject setup_subcollection_unwinder_file()
  {
    access_macros.define_obsolete_register( $sym14$DMR_SUBCOL_EXPAND_SIGNATURE, $list15 );
    subl_macro_promotions.declare_defglobal( $sym21$_ISA_SUBCOL_UNWIND_PATTERNS_ );
    subl_macro_promotions.declare_defglobal( $sym25$_ISA_SUBCOL_UNWIND_TEMPLATE_MAP_ );
    return NIL;
  }

  private static SubLObject _constant_24_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionIntersectionFn" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword(
        "SET" ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "ANYTHING" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "isa" ) ), makeKeyword( "OBJ" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SUBCOL-UNWIND-COLLECTION-INTERSECTION-SET" ), makeKeyword( "SET" ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "SitTypeSpecWithTypeRestrictionOnRolePlayerFn" ) ), makeKeyword( "COL" ), makeKeyword( "ROLE" ), makeKeyword( "TYPE" ) ), ConsesLow.list( ConsesLow
                    .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "SubcollectionOfWithRelationToTypeFn" ) ), makeKeyword( "COL" ), makeKeyword( "ROLE" ), makeKeyword( "TYPE" ) ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                            makeString( "GenreFn" ) ), makeKeyword( "COL1" ), makeKeyword( "COL2" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
                                "OBJ" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) ), makeKeyword( "COL1" ), makeKeyword( "COL2" ) ) ) ) ), ConsesLow.list(
                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionUnionFn" ) ), makeKeyword( "SET" ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "thereExists" ) ), makeKeyword( "COL" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow
                                            .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), makeKeyword( "COL" ) ), ConsesLow.list( constant_handles
                                                .reader_make_constant_shell( makeString( "elementOf" ) ), makeKeyword( "COL" ), makeKeyword( "SET" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                    .reader_make_constant_shell( makeString( "GroupFn" ) ), makeKeyword( "COL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
                                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell( makeString(
                                                            "Group" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), constant_handles
                                                                .reader_make_constant_shell( makeString( "groupMembers" ) ), makeKeyword( "OBJ" ), makeKeyword( "COL" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                    constant_handles.reader_make_constant_shell( makeString( "TransportViaFn" ) ), makeKeyword( "COL" ) ), ConsesLow.list( constant_handles
                                                                        .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
                                                                            "OBJ" ), constant_handles.reader_make_constant_shell( makeString( "TransportationEvent" ) ) ), ConsesLow.list( constant_handles
                                                                                .reader_make_constant_shell( makeString( "relationInstanceExists" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                    "transporter" ) ), makeKeyword( "OBJ" ), makeKeyword( "COL" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                        .reader_make_constant_shell( makeString( "StockInFn" ) ), makeKeyword( "CORPORATION" ) ), ConsesLow.list( constant_handles
                                                                                            .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                "isa" ) ), makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell( makeString( "Stock" ) ) ), ConsesLow.list(
                                                                                                    constant_handles.reader_make_constant_shell( makeString( "stockIssuedBy" ) ), makeKeyword( "OBJ" ), makeKeyword(
                                                                                                        "CORPORATION" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                            "WholeTypeForPartTypeFn" ) ), makeKeyword( "PART-TYPE" ), makeKeyword( "WHOLE-TYPE" ) ), ConsesLow.list(
                                                                                                                constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), makeKeyword( "WHOLE-TYPE" ) ),
                                                                                                                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ),
                                                                                                                    constant_handles.reader_make_constant_shell( makeString( "properPhysicalParts" ) ), makeKeyword(
                                                                                                                        "PART-TYPE" ), makeKeyword( "OBJ" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                            .reader_make_constant_shell( makeString( "VideoClipOfSubjectFn" ) ), makeKeyword( "SUBJECT" ) ),
                                                                                                                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow
                                                                                                                                .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
                                                                                                                                    "OBJ" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                        "VideoRecordedObject" ) ) ), ConsesLow.list( constant_handles
                                                                                                                                            .reader_make_constant_shell( makeString( "containsInformationAbout" ) ),
                                                                                                                                            makeKeyword( "OBJ" ), makeKeyword( "SUBJECT" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                                .list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                    "VideoClipTypeOfSubjectTypeFn" ) ), makeKeyword( "SUBJECT-TYPE" ) ),
                                                                                                                                                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                    "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                        makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles
                                                                                                                                                            .reader_make_constant_shell( makeString(
                                                                                                                                                                "VideoRecordedObject" ) ) ), ConsesLow.list(
                                                                                                                                                                    constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                        "containsInformationAbout" ) ), makeKeyword(
                                                                                                                                                                            "OBJ" ), makeKeyword( "SUBJECT-TYPE" ) ) ) ),
      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IssuingCredentialTypeFn" ) ), makeKeyword( "COL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell( makeString(
              "GrantingPermission" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "permissionsGranted" ) ), makeKeyword( "OBJ" ), makeKeyword( "COL" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RecreationalFn" ) ), makeKeyword(
                      "ACTION-TYPE" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) ), makeKeyword( "ACTION-TYPE" ), constant_handles.reader_make_constant_shell( makeString(
                              "RecreationalActivity" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlayerOfInstrumentFn" ) ), makeKeyword( "TYPE" ) ), ConsesLow
                                  .list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ),
                                      constant_handles.reader_make_constant_shell( makeString( "MusicalInstrumentPlayer" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                          "skillCapableOf" ) ), makeKeyword( "OBJ" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InstrumentPlayingFn" ) ), makeKeyword( "TYPE" ) ),
                                          constant_handles.reader_make_constant_shell( makeString( "performedBy" ) ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                              "ModelFn" ) ), makeKeyword( "OBJ-TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell( makeString( "Model-Artifact" ) ) ), ConsesLow.list(
                                                      constant_handles.reader_make_constant_shell( makeString( "visuallyDepicts-Type" ) ), makeKeyword( "OBJ" ), makeKeyword( "OBJ-TYPE" ) ) ) ), ConsesLow.list( ConsesLow
                                                          .list( constant_handles.reader_make_constant_shell( makeString( "ProductionOfFn" ) ), makeKeyword( "TYPE" ) ), ConsesLow.list( constant_handles
                                                              .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ),
                                                                  constant_handles.reader_make_constant_shell( makeString( "Production-Generic" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                      makeString( "relationInstanceExists" ) ), constant_handles.reader_make_constant_shell( makeString( "outputsCreated" ) ), makeKeyword( "OBJ" ),
                                                                      makeKeyword( "TYPE" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                          "RoleWithResponsibilityForFn" ) ), makeKeyword( "TYPE" ), makeKeyword( "ACTIVITY" ) ), ConsesLow.list( constant_handles
                                                                              .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                  makeKeyword( "OBJ" ), makeKeyword( "TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                      "relationInstanceExists" ) ), constant_handles.reader_make_constant_shell( makeString( "responsibleFor" ) ), makeKeyword( "OBJ" ),
                                                                                      makeKeyword( "ACTIVITY" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                          "CitizenFn" ) ), makeKeyword( "GEOPOLITICAL-ENTITY" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                              "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ),
                                                                                                  constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ), ConsesLow.list( constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "citizens" ) ), makeKeyword( "GEOPOLITICAL-ENTITY" ), makeKeyword(
                                                                                                          "OBJ" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                              "ProfessionalFn" ) ), makeKeyword( "TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                  makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                                                      makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "PersonWithOccupation" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                              makeString( "occupation" ) ), makeKeyword( "OBJ" ), makeKeyword( "TYPE" ) ) ) ), ConsesLow
                                                                                                                                  .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "ResidentFn" ) ), makeKeyword( "REGION" ) ), ConsesLow.list( constant_handles
                                                                                                                                          .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                                                                                                              constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                                                                              makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                  "Individual" ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "residesInRegion" ) ),
                                                                                                                                                      makeKeyword( "OBJ" ), makeKeyword( "REGION" ) ) ) ), ConsesLow.list(
                                                                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                              makeString( "FrequentPerformerFn" ) ), makeKeyword(
                                                                                                                                                                  "TYPE" ) ), ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString( "and" ) ),
                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "isa" ) ), makeKeyword( "OBJ" ),
                                                                                                                                                                          constant_handles.reader_make_constant_shell(
                                                                                                                                                                              makeString( "Person" ) ) ), ConsesLow.list(
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString(
                                                                                                                                                                                              "playsRoleInTypeWithFrequency" ) ),
                                                                                                                                                                                  makeKeyword( "OBJ" ), makeKeyword(
                                                                                                                                                                                      "TYPE" ), constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "performedBy" ) ),
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "Often" ) ) ) ) ),
      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UsingAFn" ) ), makeKeyword( "TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell( makeString( "UsingADevice" ) ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), constant_handles.reader_make_constant_shell( makeString( "deviceUsed" ) ), makeKeyword( "OBJ" ), makeKeyword(
                  "TYPE" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BelieverFn" ) ), makeKeyword( "BELIEF-SYSTEM" ) ), ConsesLow.list( constant_handles
                      .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles
                          .reader_make_constant_shell( makeString( "IntelligentAgent" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hasBeliefSystems" ) ), makeKeyword( "OBJ" ),
                              makeKeyword( "BELIEF-SYSTEM" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MaleFn" ) ), makeKeyword( "TYPE" ) ), ConsesLow.list(
                                  constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ),
                                      constant_handles.reader_make_constant_shell( makeString( "MaleAnimal" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ),
                                          makeKeyword( "TYPE" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "FemaleFn" ) ), makeKeyword( "TYPE" ) ), ConsesLow.list(
                                              constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ),
                                                  constant_handles.reader_make_constant_shell( makeString( "FemaleAnimal" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                      makeKeyword( "OBJ" ), makeKeyword( "TYPE" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UsingAForFn" ) ),
                                                          makeKeyword( "OBJ-TYPE" ), makeKeyword( "ACT-TYPE" ), makeKeyword( "ROLE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), makeKeyword( "ACT-TYPE" ) ), ConsesLow.list(
                                                                  constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), makeKeyword( "ROLE" ), makeKeyword( "OBJ" ), makeKeyword(
                                                                      "OBJ-TYPE" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GlobalOrganizationFn" ) ), makeKeyword(
                                                                          "TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                              .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), makeKeyword( "TYPE" ) ), ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                      "InternationalOrganization" ) ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                          "ExperiencingEmotionFn" ) ), makeKeyword( "TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                              "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ),
                                                                                                  constant_handles.reader_make_constant_shell( makeString( "ExperiencingEmotion" ) ) ), ConsesLow.list( constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "feelingTypeExperienced" ) ), makeKeyword( "OBJ" ), makeKeyword(
                                                                                                          "TYPE" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                              "GroupOfMinSizeFn" ) ), makeKeyword( "N" ), makeKeyword( "TYPE" ) ), ConsesLow.list( constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "Group" ) ) ), ConsesLow.list( constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "groupCardinalityMin" ) ), makeKeyword( "OBJ" ),
                                                                                                                              makeKeyword( "N" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                  "relationInstanceExists" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "groupMembers" ) ), makeKeyword( "OBJ" ), makeKeyword( "TYPE" ) ) ) ), ConsesLow.list(
                                                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                              "CharacteristicSoundTypeFromActionTypeFn" ) ), makeKeyword( "TYPE" ) ),
                                                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                              "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                  makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "AudibleSound" ) ) ),
                                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                  "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                      makeString( "soundEmitted" ) ), makeKeyword( "TYPE" ), makeKeyword(
                                                                                                                                                          "OBJ" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "MilitaryFn" ) ),
                                                                                                                                                              makeKeyword( "COUNTRY" ) ), ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "and" ) ),
                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString( "isa" ) ),
                                                                                                                                                                      makeKeyword( "OBJ" ), constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "GovernmentMilitaryOrganization" ) ) ),
                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "officialArmedForces" ) ), makeKeyword( "OBJ" ),
                                                                                                                                                                      makeKeyword( "COUNTRY" ) ) ) ), ConsesLow.list(
                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "SubcollectionOfWithCapabilityFn" ) ),
                                                                                                                                                                              makeKeyword( "COL" ), makeKeyword(
                                                                                                                                                                                  "SIT-TYPE" ), makeKeyword( "ROLE" ) ),
                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "and" ) ), ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "isa" ) ),
                                                                                                                                                                                      makeKeyword( "OBJ" ), makeKeyword(
                                                                                                                                                                                          "COL" ) ), ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "behaviorCapable" ) ),
                                                                                                                                                                                              makeKeyword( "OBJ" ),
                                                                                                                                                                                              makeKeyword( "SIT-TYPE" ),
                                                                                                                                                                                              makeKeyword( "ROLE" ) ) ) ),
      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GroupActivityFn" ) ), makeKeyword( "TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "CollectionIntersection2Fn" ) ), makeKeyword( "TYPE" ), constant_handles.reader_make_constant_shell( makeString( "SingleDoerAction" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                  makeString( "relationInstanceExists" ) ), constant_handles.reader_make_constant_shell( makeString( "doneBy" ) ), makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell( makeString(
                      "Agent-PartiallyTangible" ) ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AcquiringFn" ) ), makeKeyword( "TYPE" ) ), ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles
                              .reader_make_constant_shell( makeString( "AcquiringAnObject" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), constant_handles
                                  .reader_make_constant_shell( makeString( "objectOfPossessionTransfer" ) ), makeKeyword( "OBJ" ), makeKeyword( "TYPE" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "SubCollectionNamedFn" ) ), makeKeyword( "STRING" ), makeKeyword( "TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                          makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), makeKeyword( "TYPE" ) ), ConsesLow.list(
                                              constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), makeKeyword( "OBJ" ), makeKeyword( "STRING" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                  constant_handles.reader_make_constant_shell( makeString( "ProperSubcollectionNamedFn-Ternary" ) ), makeKeyword( "STRING" ), makeKeyword( "COL" ), makeKeyword( "GUID" ) ),
                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                      makeKeyword( "OBJ" ), makeKeyword( "COL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nameString" ) ), makeKeyword( "OBJ" ),
                                                          makeKeyword( "STRING" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TechnologyForUseContextsOfTypeFn" ) ),
                                                              makeKeyword( "SIT-TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                  .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell( makeString(
                                                                      "Artifact-Generic" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "intendedPrimaryFunction" ) ), makeKeyword(
                                                                          "OBJ" ), makeKeyword( "SIT-TYPE" ), constant_handles.reader_make_constant_shell( makeString( "deviceUsed" ) ) ) ) ), ConsesLow.list( ConsesLow
                                                                              .list( constant_handles.reader_make_constant_shell( makeString( "JuvenileFn" ) ), makeKeyword( "TYPE" ) ), ConsesLow.list( ConsesLow.list(
                                                                                  constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), ConsesLow.list( constant_handles
                                                                                      .reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                          "JuvenileAnimal" ) ), makeKeyword( "TYPE" ) ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                              makeString( "ProperSubSituationTypeFn" ) ), makeKeyword( "SIT-TYPE" ), makeKeyword( "SUB-SIT-TYPE" ) ), ConsesLow.list(
                                                                                                  constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ), constant_handles.reader_make_constant_shell(
                                                                                                          makeString( "Situation" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                                              makeKeyword( "OBJ" ), makeKeyword( "SUB-SIT-TYPE" ) ), ConsesLow.list( constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "relationInstanceExists" ) ), constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "properSubSituations" ) ), makeKeyword( "OBJ" ), makeKeyword(
                                                                                                                          "SIT-TYPE" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                              makeString( "SensorTypeByTargetSituationTypeFn" ) ), makeKeyword( "SIT-TYPE" ) ), ConsesLow
                                                                                                                                  .list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
                                                                                                                                          "OBJ" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                              "Sensor-Device" ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "intendedPrimaryFunction" ) ),
                                                                                                                                                  makeKeyword( "OBJ" ), makeKeyword( "SIT-TYPE" ), constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "detector" ) ) ) ) ),
      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheFn" ) ), makeKeyword( "COL" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "isa" ) ), makeKeyword( "OBJ" ), makeKeyword( "COL" ) ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheSet" ) ), makeKeyword( "BIND" ), makeSymbol(
              "ELEMENTS" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SUBCOL-UNWIND-THE-SET" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ELEMENTS" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "OBJ" ) ) ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_subcollection_unwinder_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subcollection_unwinder_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subcollection_unwinder_file();
  }
  static
  {
    me = new subcollection_unwinder();
    $subcol_unwind_existential_variables$ = null;
    $isa_subcol_unwind_patterns$ = null;
    $isa_subcol_unwind_patterns_complex$ = null;
    $isa_subcol_unwind_template_map$ = null;
    $existential_unwind_patterns$ = null;
    $kw0$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym1$PIF = makeSymbol( "PIF" );
    $list2 = ConsesLow.list( EQL, makeSymbol( "*SUBCOL-UNWIND-EXISTENTIAL-VARIABLES*" ), makeKeyword( "UNINITIALIZED" ) );
    $sym3$CLET = makeSymbol( "CLET" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SUBCOL-UNWIND-EXISTENTIAL-VARIABLES*" ), NIL ) );
    $sym5$PROGN = makeSymbol( "PROGN" );
    $sym6$_EXIT = makeSymbol( "%EXIT" );
    $sym7$SUBCOL_UNWIND_LITERAL_INT = makeSymbol( "SUBCOL-UNWIND-LITERAL-INT" );
    $kw8$EXISTS = makeKeyword( "EXISTS" );
    $const9$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const10$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $const11$equalSymbols = constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) );
    $const12$Kappa = constant_handles.reader_make_constant_shell( makeString( "Kappa" ) );
    $const13$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $sym14$DMR_SUBCOL_EXPAND_SIGNATURE = makeSymbol( "DMR-SUBCOL-EXPAND-SIGNATURE" );
    $list15 = ConsesLow.list( makeSymbol( "SCG-SUBCOL-EXPAND-SIGNATURE" ) );
    $sym16$CAAR = makeSymbol( "CAAR" );
    $const17$subcollectionFunctionClassificati = constant_handles.reader_make_constant_shell( makeString( "subcollectionFunctionClassificationPredicate" ) );
    $sym18$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym19$EL_VAR_TO_KEYWORD = makeSymbol( "EL-VAR-TO-KEYWORD" );
    $list20 = ConsesLow.list( ConsesLow.cons( makeKeyword( "TERM" ), makeKeyword( "OBJ" ) ) );
    $sym21$_ISA_SUBCOL_UNWIND_PATTERNS_ = makeSymbol( "*ISA-SUBCOL-UNWIND-PATTERNS*" );
    $sym22$IS_SUBCOLLECTION_PATTERN_PREDICATE_ASSERTION = makeSymbol( "IS-SUBCOLLECTION-PATTERN-PREDICATE-ASSERTION" );
    $sym23$FORMULA_ARG0 = makeSymbol( "FORMULA-ARG0" );
    $list24 = _constant_24_initializer();
    $sym25$_ISA_SUBCOL_UNWIND_TEMPLATE_MAP_ = makeSymbol( "*ISA-SUBCOL-UNWIND-TEMPLATE-MAP*" );
    $list26 = ConsesLow.list( makeSymbol( "MATCH-PATTERN" ), makeSymbol( "SUBSTITUTE-PATTERN" ) );
    $sym27$META_VARIABLE_P = makeSymbol( "META-VARIABLE-P" );
    $list28 = ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "OR" ), makeKeyword( "NOT" ), makeKeyword( "BIND" ) );
    $kw29$OBJ = makeKeyword( "OBJ" );
    $kw30$BIND = makeKeyword( "BIND" );
    $kw31$VALUE = makeKeyword( "VALUE" );
    $kw32$TEMPLATE = makeKeyword( "TEMPLATE" );
    $const33$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const34$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) );
    $list35 = ConsesLow.listS( makeSymbol( "FIRST" ), makeSymbol( "SECOND" ), makeSymbol( "THIRD" ), makeSymbol( "REST" ) );
    $list36 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Set-Mathematical" ) ) );
    $const37$elementOf = constant_handles.reader_make_constant_shell( makeString( "elementOf" ) );
    $list38 = ConsesLow.list( ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), ConsesLow.list( makeKeyword( "BIND" ),
        makeSymbol( "PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "OBJ" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeKeyword( "EXISTS" ) ), ConsesLow.list( makeKeyword(
                "VALUE" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OBJ" ) ), ConsesLow.list(
                    makeKeyword( "VALUE" ), makeKeyword( "EXISTS" ) ) ) ) ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "relationExistsInstance" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TYPE" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                            makeSymbol( "OBJ" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                ConsesLow.list( makeKeyword( "VALUE" ), makeKeyword( "EXISTS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                                    makeSymbol( "PRED" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeKeyword( "EXISTS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "OBJ" ) ) ) ) ), ConsesLow.list(
                                        makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VAR" ) ),
                                            ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BODY" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SUBCOL-SUBSTITUTE-PATTERN-EXISTENTIAL" ), ConsesLow.list(
                                                makeKeyword( "VALUE" ), makeSymbol( "VAR" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeKeyword( "EXISTS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                                    "BODY" ) ) ) ) );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ), constant_handles
        .reader_make_constant_shell( makeString( "thereExists" ) ) );
    $sym40$CAADR = makeSymbol( "CAADR" );
    $list41 = ConsesLow.list( new SubLObject[] { makeSymbol( "?X" ), makeSymbol( "?Y" ), makeSymbol( "?Z-0" ), makeSymbol( "?Z-1" ), makeSymbol( "?Z-2" ), makeSymbol( "?Z-3" ), makeSymbol( "?Z-4" ), makeSymbol( "?Z-5" ),
      makeSymbol( "?Z-6" ), makeSymbol( "?Z-7" ), makeSymbol( "?Z-8" ), makeSymbol( "?Z-9" )
    } );
  }
}
/*
 * 
 * Total time: 242 ms
 * 
 */