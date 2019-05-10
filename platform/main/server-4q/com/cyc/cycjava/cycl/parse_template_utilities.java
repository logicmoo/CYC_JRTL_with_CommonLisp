package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.rtp.rtp_type_checkers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parse_template_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.parse_template_utilities";
  public static final String myFingerPrint = "3e7f7488288049754d5079a49ba9b077c8d994340a8ad14d3dd58506431e6ba8";
  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 1303L)
  private static SubLSymbol $apply_old_template_transforms$;
  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 1495L)
  private static SubLSymbol $apply_new_template_transforms$;
  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 1611L)
  private static SubLSymbol $question_mark_expression$;
  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 1756L)
  private static SubLSymbol $who_what_expression$;
  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 1884L)
  private static SubLSymbol $be_wordforms$;
  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 2062L)
  private static SubLSymbol $do_wordforms$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$_BE_WORDFORMS_;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$_DO_WORDFORMS_;
  private static final SubLList $list5;
  private static final SubLObject $const6$Be_TheWord;
  private static final SubLObject $const7$BeAux;
  private static final SubLObject $const8$AuxVerb;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$STRING_EQUAL;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLObject $const22$Verb;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$FORM_OF_AUXILIARY_VERB_;
  private static final SubLSymbol $sym25$FORM_OF_MODAL_VERB_;
  private static final SubLSymbol $sym26$FORM_OF_BE_VERB_;
  private static final SubLSymbol $sym27$FORM_OF_DO_VERB_;
  private static final SubLSymbol $sym28$FORM_OF_ANY_VERB_;
  private static final SubLSymbol $kw29$SUBJECT;
  private static final SubLObject $const30$TheSentenceSubject;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$IS_SUBJECT_;
  private static final SubLSymbol $sym33$_WHAT;
  private static final SubLObject $const34$NPTemplate;
  private static final SubLList $list35;
  private static final SubLObject $const36$STemplate;
  private static final SubLSymbol $kw37$ERROR;
  private static final SubLObject $const38$VPTemplate;
  private static final SubLString $str39$syntactic_template____s__;
  private static final SubLObject $const40$queryTemplate_Reln;
  private static final SubLObject $const41$QuestionTemplate;
  private static final SubLString $str42$formula1____s__;
  private static final SubLString $str43$formula2____s__;

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 2161L)
  public static SubLObject transformed_word_form(final SubLObject word_form)
  {
    final SubLObject word = word_form.first();
    final SubLObject modification = conses_high.second( word_form );
    return ConsesLow.list( word, word.eql( $const6$Be_TheWord ) ? $const7$BeAux : $const8$AuxVerb );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 3343L)
  public static SubLObject simple_auxiliary_to_yXn_query(final SubLObject formula)
  {
    final SubLObject word_form = formula.first();
    SubLObject query = formula.rest();
    query = ConsesLow.cons( $list9, query );
    if( word_form.isList() )
    {
      query = ConsesLow.cons( transformed_word_form( word_form ), query );
    }
    else
    {
      query = ConsesLow.cons( word_form, query );
    }
    query = ConsesLow.append( query, ConsesLow.list( $question_mark_expression$.getGlobalValue() ) );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 3819L)
  public static SubLObject simple_non_auxiliary_to_yXn_query(final SubLObject formula)
  {
    SubLObject query = ConsesLow.cons( $list9, formula );
    query = ConsesLow.cons( $list10, query );
    query = ConsesLow.append( query, ConsesLow.list( $question_mark_expression$.getGlobalValue() ) );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 4177L)
  public static SubLObject simple_auxiliary_to_who_query(final SubLObject formula)
  {
    final SubLObject aux_word_form = formula.first();
    SubLObject query = formula.rest();
    query = ConsesLow.cons( aux_word_form, query );
    query = ConsesLow.cons( $who_what_expression$.getGlobalValue(), query );
    query = ConsesLow.append( query, ConsesLow.list( $question_mark_expression$.getGlobalValue() ) );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 4569L)
  public static SubLObject simple_auxiliary_to_does_query(final SubLObject formula)
  {
    final SubLObject aux_word_form = formula.first();
    SubLObject query = formula.rest();
    query = ConsesLow.cons( $list9, query );
    query = ConsesLow.cons( $list11, query );
    query = ConsesLow.append( query, ConsesLow.list( $question_mark_expression$.getGlobalValue() ) );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 5016L)
  public static SubLObject form_of_to_beP(final SubLObject head)
  {
    return Equality.eql( $const6$Be_TheWord, head.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 5280L)
  public static SubLObject form_of_auxiliary_verbP(final SubLObject form)
  {
    if( form.isList() )
    {
      return makeBoolean( NIL != subl_promotions.memberP( form.first(), $list12, UNPROVIDED, UNPROVIDED ) && NIL != subl_promotions.memberP( conses_high.second( form ), $list13, UNPROVIDED, UNPROVIDED ) );
    }
    if( form.isString() )
    {
      return subl_promotions.memberP( form, $list14, Symbols.symbol_function( $sym15$STRING_EQUAL ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 5792L)
  public static SubLObject form_of_modal_verbP(final SubLObject form)
  {
    if( form.isList() )
    {
      return makeBoolean( NIL != subl_promotions.memberP( form.first(), $list16, UNPROVIDED, UNPROVIDED ) && NIL != subl_promotions.memberP( conses_high.second( form ), $list17, UNPROVIDED, UNPROVIDED ) );
    }
    if( form.isString() )
    {
      return subl_promotions.memberP( form, $list18, Symbols.symbol_function( $sym15$STRING_EQUAL ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 6178L)
  public static SubLObject form_of_be_verbP(final SubLObject form)
  {
    if( form.isList() )
    {
      return makeBoolean( form.equal( $list19 ) || form.equal( $list20 ) );
    }
    if( form.isString() )
    {
      return subl_promotions.memberP( form, $be_wordforms$.getGlobalValue(), Symbols.symbol_function( $sym15$STRING_EQUAL ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 6509L)
  public static SubLObject form_of_do_verbP(final SubLObject form)
  {
    if( form.isList() )
    {
      return makeBoolean( form.equal( $list21 ) || form.equal( $list10 ) );
    }
    if( form.isString() )
    {
      return subl_promotions.memberP( form, $do_wordforms$.getGlobalValue(), Symbols.symbol_function( $sym15$STRING_EQUAL ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 6838L)
  public static SubLObject form_of_any_verbP(final SubLObject form)
  {
    if( form.isList() )
    {
      return Equality.equal( conses_high.second( form ), $const22$Verb );
    }
    if( form.isString() )
    {
      return form_of_verbP( form );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 7078L)
  public static SubLObject form_of_verbP(final SubLObject form)
  {
    return rkf_string_weeders.rkf_verb_stringP( form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 7200L)
  public static SubLObject form_of_adverbP(final SubLObject form)
  {
    return rkf_string_weeders.rkf_adverb_stringP( form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 7328L)
  public static SubLObject old_compute_query_template(final SubLObject template)
  {
    final SubLObject head_form = template.first();
    SubLObject new_templates = NIL;
    if( head_form.isString() )
    {
      if( NIL != form_of_auxiliary_verbP( head_form ) )
      {
        new_templates = ConsesLow.cons( simple_auxiliary_to_yXn_query( template ), new_templates );
      }
      else if( NIL != form_of_verbP( head_form ) )
      {
        new_templates = ConsesLow.cons( simple_non_auxiliary_to_yXn_query( template ), new_templates );
      }
      else if( NIL != form_of_adverbP( head_form ) )
      {
        new_templates = ConsesLow.cons( simple_non_auxiliary_to_yXn_query( template ), new_templates );
      }
    }
    else if( NIL != rtp_type_checkers.rtp_word_itemP( head_form ) )
    {
      if( NIL != form_of_to_beP( head_form ) )
      {
        new_templates = ConsesLow.cons( simple_auxiliary_to_yXn_query( template ), new_templates );
      }
      else
      {
        new_templates = ConsesLow.cons( simple_non_auxiliary_to_yXn_query( template ), new_templates );
      }
    }
    else if( NIL != rtp_type_checkers.rtp_require_one_itemP( head_form ) )
    {
      final SubLObject one_required = conses_high.second( head_form );
      if( NIL != rtp_type_checkers.rtp_word_itemP( one_required ) )
      {
        new_templates = ConsesLow.cons( simple_non_auxiliary_to_yXn_query( template ), new_templates );
      }
    }
    else
    {
      if( NIL == rtp_type_checkers.rtp_optional_one_itemP( head_form ) )
      {
        return NIL;
      }
      final SubLObject one_optional = conses_high.second( head_form );
      if( one_optional.isString() && NIL != rkf_string_weeders.rkf_adverb_stringP( one_optional ) )
      {
        new_templates = ConsesLow.cons( simple_non_auxiliary_to_yXn_query( template ), new_templates );
      }
    }
    return new_templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 8760L)
  public static SubLObject is_element_xP(final SubLObject element, final SubLObject x_typeP)
  {
    if( element.isList() && NIL != conses_high.member( element.first(), $list23, UNPROVIDED, UNPROVIDED ) )
    {
      return Sequences.find_if( x_typeP, element.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return Functions.funcall( x_typeP, element );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 9238L)
  public static SubLObject is_aux_elementP(final SubLObject element)
  {
    return is_element_xP( element, Symbols.symbol_function( $sym24$FORM_OF_AUXILIARY_VERB_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 9401L)
  public static SubLObject is_modal_elementP(final SubLObject element)
  {
    return is_element_xP( element, Symbols.symbol_function( $sym25$FORM_OF_MODAL_VERB_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 9562L)
  public static SubLObject is_be_elementP(final SubLObject element)
  {
    return is_element_xP( element, Symbols.symbol_function( $sym26$FORM_OF_BE_VERB_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 9717L)
  public static SubLObject is_do_elementP(final SubLObject element)
  {
    return is_element_xP( element, Symbols.symbol_function( $sym27$FORM_OF_DO_VERB_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 9864L)
  public static SubLObject is_verb_elementP(final SubLObject element)
  {
    return is_element_xP( element, Symbols.symbol_function( $sym28$FORM_OF_ANY_VERB_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 10022L)
  public static SubLObject compute_query_template(final SubLObject template)
  {
    final SubLObject head_form = template.first();
    final SubLObject other_forms = template.rest();
    final SubLObject starts_with_auxP = is_aux_elementP( head_form );
    final SubLObject starts_with_modalP = is_modal_elementP( head_form );
    final SubLObject starts_with_beP = is_be_elementP( head_form );
    SubLObject new_templates = NIL;
    if( NIL != $apply_old_template_transforms$.getGlobalValue() )
    {
      new_templates = ConsesLow.append( new_templates, old_compute_query_template( template ) );
    }
    if( NIL == $apply_new_template_transforms$.getGlobalValue() )
    {
      return new_templates;
    }
    if( NIL != starts_with_modalP )
    {
      new_templates = ConsesLow.cons( simple_auxiliary_to_who_query( template ), new_templates );
    }
    if( NIL != starts_with_auxP && NIL == starts_with_beP && NIL != is_verb_elementP( other_forms.first() ) )
    {
      new_templates = ConsesLow.cons( simple_auxiliary_to_does_query( template ), new_templates );
    }
    return new_templates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 11032L)
  public static SubLObject compute_query_semantics(final SubLObject semantics)
  {
    return conses_high.subst( $kw29$SUBJECT, $const30$TheSentenceSubject, semantics, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 11227L)
  public static SubLObject wh_question_style_formula(final SubLObject formula)
  {
    SubLObject rule = NIL;
    SubLObject category = NIL;
    SubLObject predicate = NIL;
    SubLObject pattern = NIL;
    SubLObject semantics = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list31 );
    rule = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list31 );
    category = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list31 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list31 );
    pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list31 );
    semantics = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != is_do_elementP( pattern.first() ) )
      {
        pattern = pattern.rest();
      }
      pattern = ConsesLow.cons( $who_what_expression$.getGlobalValue(), pattern );
      pattern = list_utilities.tree_remove_all_if( $sym32$IS_SUBJECT_, pattern, UNPROVIDED );
      semantics = conses_high.subst( $sym33$_WHAT, $kw29$SUBJECT, semantics, UNPROVIDED, UNPROVIDED );
      return ConsesLow.list( rule, category, predicate, pattern, semantics );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list31 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 11863L)
  public static SubLObject is_subjectP(final SubLObject x)
  {
    return Equality.equalp( x, $list9 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 12003L)
  public static SubLObject is_an_np_formP(final SubLObject expression)
  {
    return makeBoolean( expression.isList() && expression.first().eql( $const34$NPTemplate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 12200L)
  public static SubLObject convert_s_template_to_vp_template(final SubLObject formula)
  {
    SubLObject new_formula = formula;
    SubLObject first_np = NIL;
    SubLObject new_expression = NIL;
    SubLObject new_semantics = NIL;
    SubLObject v_class = NIL;
    SubLObject category = NIL;
    SubLObject predicate = NIL;
    SubLObject expression = NIL;
    SubLObject semantics = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list35 );
    v_class = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list35 );
    category = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list35 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list35 );
    expression = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list35 );
    semantics = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( !category.eql( $const36$STemplate ) || !expression.isList() || NIL == is_an_np_formP( expression.first() ) )
      {
        return $kw37$ERROR;
      }
      final SubLObject datum_evaluated_var = expression;
      first_np = datum_evaluated_var.first();
      expression = datum_evaluated_var.rest();
      if( NIL != is_an_np_formP( first_np ) )
      {
        final SubLObject argument = conses_high.second( first_np );
        new_expression = Sequences.remove( first_np, expression, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        new_semantics = conses_high.subst( $const30$TheSentenceSubject, argument, semantics, UNPROVIDED, UNPROVIDED );
        new_formula = ConsesLow.list( v_class, $const38$VPTemplate, predicate, new_expression, new_semantics );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( formula, $list35 );
    }
    return new_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parse-template-utilities.lisp", position = 13358L)
  public static SubLObject convert_assert_to_query_template(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject normalized_formula = convert_s_template_to_vp_template( formula );
    SubLObject new_formulas = NIL;
    if( NIL != el_utilities.el_formula_p( normalized_formula ) )
    {
      final SubLObject predicate = cycl_utilities.formula_arg2( normalized_formula, UNPROVIDED );
      final SubLObject template = cycl_utilities.formula_arg3( normalized_formula, UNPROVIDED );
      final SubLObject semantics = cycl_utilities.formula_arg4( normalized_formula, UNPROVIDED );
      final SubLObject new_syntactic_templates = compute_query_template( template );
      final SubLObject new_semantics = compute_query_semantics( semantics );
      if( NIL != new_semantics )
      {
        SubLObject cdolist_list_var = new_syntactic_templates;
        SubLObject syntactic_template = NIL;
        syntactic_template = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
              .getGlobalValue() ) ) )
          {
            PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str39$syntactic_template____s__, syntactic_template );
            streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
          }
          final SubLObject formula_$1 = ConsesLow.list( $const40$queryTemplate_Reln, $const41$QuestionTemplate, predicate, syntactic_template, new_semantics );
          if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
              .getGlobalValue() ) ) )
          {
            PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str42$formula1____s__, formula_$1 );
            streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
          }
          new_formulas = ConsesLow.cons( formula_$1, new_formulas );
          if( NIL == subl_promotions.memberP( $who_what_expression$.getGlobalValue(), syntactic_template, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
          {
            new_formulas = ConsesLow.cons( wh_question_style_formula( formula_$1 ), new_formulas );
            if( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$.getDynamicValue( thread ), lexification_utilities.$lex_verbose$
                .getGlobalValue() ) ) )
            {
              PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str43$formula2____s__, wh_question_style_formula( formula_$1 ) );
              streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          syntactic_template = cdolist_list_var.first();
        }
      }
    }
    return new_formulas;
  }

  public static SubLObject declare_parse_template_utilities_file()
  {
    SubLFiles.declareFunction( me, "transformed_word_form", "TRANSFORMED-WORD-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_auxiliary_to_yXn_query", "SIMPLE-AUXILIARY-TO-Y/N-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_non_auxiliary_to_yXn_query", "SIMPLE-NON-AUXILIARY-TO-Y/N-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_auxiliary_to_who_query", "SIMPLE-AUXILIARY-TO-WHO-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_auxiliary_to_does_query", "SIMPLE-AUXILIARY-TO-DOES-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "form_of_to_beP", "FORM-OF-TO-BE?", 1, 0, false );
    SubLFiles.declareFunction( me, "form_of_auxiliary_verbP", "FORM-OF-AUXILIARY-VERB?", 1, 0, false );
    SubLFiles.declareFunction( me, "form_of_modal_verbP", "FORM-OF-MODAL-VERB?", 1, 0, false );
    SubLFiles.declareFunction( me, "form_of_be_verbP", "FORM-OF-BE-VERB?", 1, 0, false );
    SubLFiles.declareFunction( me, "form_of_do_verbP", "FORM-OF-DO-VERB?", 1, 0, false );
    SubLFiles.declareFunction( me, "form_of_any_verbP", "FORM-OF-ANY-VERB?", 1, 0, false );
    SubLFiles.declareFunction( me, "form_of_verbP", "FORM-OF-VERB?", 1, 0, false );
    SubLFiles.declareFunction( me, "form_of_adverbP", "FORM-OF-ADVERB?", 1, 0, false );
    SubLFiles.declareFunction( me, "old_compute_query_template", "OLD-COMPUTE-QUERY-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "is_element_xP", "IS-ELEMENT-X?", 2, 0, false );
    SubLFiles.declareFunction( me, "is_aux_elementP", "IS-AUX-ELEMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_modal_elementP", "IS-MODAL-ELEMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_be_elementP", "IS-BE-ELEMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_do_elementP", "IS-DO-ELEMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_verb_elementP", "IS-VERB-ELEMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_query_template", "COMPUTE-QUERY-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_query_semantics", "COMPUTE-QUERY-SEMANTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "wh_question_style_formula", "WH-QUESTION-STYLE-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "is_subjectP", "IS-SUBJECT?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_an_np_formP", "IS-AN-NP-FORM?", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_s_template_to_vp_template", "CONVERT-S-TEMPLATE-TO-VP-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_assert_to_query_template", "CONVERT-ASSERT-TO-QUERY-TEMPLATE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_parse_template_utilities_file()
  {
    $apply_old_template_transforms$ = SubLFiles.deflexical( "*APPLY-OLD-TEMPLATE-TRANSFORMS*", T );
    $apply_new_template_transforms$ = SubLFiles.deflexical( "*APPLY-NEW-TEMPLATE-TRANSFORMS*", T );
    $question_mark_expression$ = SubLFiles.deflexical( "*QUESTION-MARK-EXPRESSION*", $list0 );
    $who_what_expression$ = SubLFiles.deflexical( "*WHO-WHAT-EXPRESSION*", $list1 );
    $be_wordforms$ = SubLFiles.deflexical( "*BE-WORDFORMS*", ( maybeDefault( $sym2$_BE_WORDFORMS_, $be_wordforms$, $list3 ) ) );
    $do_wordforms$ = SubLFiles.deflexical( "*DO-WORDFORMS*", ( maybeDefault( $sym4$_DO_WORDFORMS_, $do_wordforms$, $list5 ) ) );
    return NIL;
  }

  public static SubLObject setup_parse_template_utilities_file()
  {
    subl_macro_promotions.declare_defglobal( $sym2$_BE_WORDFORMS_ );
    subl_macro_promotions.declare_defglobal( $sym4$_DO_WORDFORMS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_parse_template_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_parse_template_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_parse_template_utilities_file();
  }
  static
  {
    me = new parse_template_utilities();
    $apply_old_template_transforms$ = null;
    $apply_new_template_transforms$ = null;
    $question_mark_expression$ = null;
    $who_what_expression$ = null;
    $be_wordforms$ = null;
    $do_wordforms$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "OptionalOne" ) ), constant_handles.reader_make_constant_shell( makeString( "TemplateQuestionMarkMarker" ) ) );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RequireOne" ) ), makeString( "who" ), makeString( "what" ) );
    $sym2$_BE_WORDFORMS_ = makeSymbol( "*BE-WORDFORMS*" );
    $list3 = ConsesLow.list( new SubLObject[] { makeString( "is" ), makeString( "was" ), makeString( "am" ), makeString( "will be" ), makeString( "were" ), makeString( "are" ), makeString( "being" ), makeString(
        "been" ), makeString( "be" )
    } );
    $sym4$_DO_WORDFORMS_ = makeSymbol( "*DO-WORDFORMS*" );
    $list5 = ConsesLow.list( makeString( "do" ), makeString( "does" ) );
    $const6$Be_TheWord = constant_handles.reader_make_constant_shell( makeString( "Be-TheWord" ) );
    $const7$BeAux = constant_handles.reader_make_constant_shell( makeString( "BeAux" ) );
    $const8$AuxVerb = constant_handles.reader_make_constant_shell( makeString( "AuxVerb" ) );
    $list9 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NPTemplate" ) ), makeKeyword( "SUBJECT" ) );
    $list10 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Do-TheWord" ) ), constant_handles.reader_make_constant_shell( makeString( "DoAux" ) ) );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RequireOne" ) ), makeString( "does" ), makeString( "do" ) );
    $list12 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Be-TheWord" ) ), constant_handles.reader_make_constant_shell( makeString( "Can-TheWord" ) ), constant_handles
        .reader_make_constant_shell( makeString( "May-TheWord" ) ) );
    $list13 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BeAux" ) ), constant_handles.reader_make_constant_shell( makeString( "AuxVerb" ) ), constant_handles.reader_make_constant_shell(
        makeString( "Modal" ) ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) );
    $list14 = ConsesLow.list( makeString( "can" ), makeString( "is" ), makeString( "are" ), makeString( "may" ) );
    $sym15$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $list16 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Can-TheWord" ) ), constant_handles.reader_make_constant_shell( makeString( "May-TheWord" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Might-TheWord" ) ) );
    $list17 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AuxVerb" ) ), constant_handles.reader_make_constant_shell( makeString( "Modal" ) ), constant_handles.reader_make_constant_shell(
        makeString( "Verb" ) ) );
    $list18 = ConsesLow.list( makeString( "can" ), makeString( "may" ), makeString( "might" ) );
    $list19 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Be-TheWord" ) ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) );
    $list20 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Be-TheWord" ) ), constant_handles.reader_make_constant_shell( makeString( "BeAux" ) ) );
    $list21 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Do-TheWord" ) ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ) );
    $const22$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $list23 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "OptionalOne" ) ), constant_handles.reader_make_constant_shell( makeString( "OptionalSome" ) ), constant_handles
        .reader_make_constant_shell( makeString( "RequireOne" ) ), constant_handles.reader_make_constant_shell( makeString( "RequireSome" ) ) );
    $sym24$FORM_OF_AUXILIARY_VERB_ = makeSymbol( "FORM-OF-AUXILIARY-VERB?" );
    $sym25$FORM_OF_MODAL_VERB_ = makeSymbol( "FORM-OF-MODAL-VERB?" );
    $sym26$FORM_OF_BE_VERB_ = makeSymbol( "FORM-OF-BE-VERB?" );
    $sym27$FORM_OF_DO_VERB_ = makeSymbol( "FORM-OF-DO-VERB?" );
    $sym28$FORM_OF_ANY_VERB_ = makeSymbol( "FORM-OF-ANY-VERB?" );
    $kw29$SUBJECT = makeKeyword( "SUBJECT" );
    $const30$TheSentenceSubject = constant_handles.reader_make_constant_shell( makeString( "TheSentenceSubject" ) );
    $list31 = ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "CATEGORY" ), makeSymbol( "PREDICATE" ), makeSymbol( "PATTERN" ), makeSymbol( "SEMANTICS" ) );
    $sym32$IS_SUBJECT_ = makeSymbol( "IS-SUBJECT?" );
    $sym33$_WHAT = makeSymbol( "?WHAT" );
    $const34$NPTemplate = constant_handles.reader_make_constant_shell( makeString( "NPTemplate" ) );
    $list35 = ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "CATEGORY" ), makeSymbol( "PREDICATE" ), makeSymbol( "EXPRESSION" ), makeSymbol( "SEMANTICS" ) );
    $const36$STemplate = constant_handles.reader_make_constant_shell( makeString( "STemplate" ) );
    $kw37$ERROR = makeKeyword( "ERROR" );
    $const38$VPTemplate = constant_handles.reader_make_constant_shell( makeString( "VPTemplate" ) );
    $str39$syntactic_template____s__ = makeString( "syntactic-template = ~s~%" );
    $const40$queryTemplate_Reln = constant_handles.reader_make_constant_shell( makeString( "queryTemplate-Reln" ) );
    $const41$QuestionTemplate = constant_handles.reader_make_constant_shell( makeString( "QuestionTemplate" ) );
    $str42$formula1____s__ = makeString( "formula1 = ~s~%" );
    $str43$formula2____s__ = makeString( "formula2 = ~s~%" );
  }
}
/*
 * 
 * Total time: 226 ms
 * 
 */