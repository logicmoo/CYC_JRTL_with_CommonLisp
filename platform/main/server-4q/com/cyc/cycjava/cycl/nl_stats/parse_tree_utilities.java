package com.cyc.cycjava.cycl.nl_stats;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.lexification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parse_tree_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities";
  public static final String myFingerPrint = "990bbcc4faf1827edd531dd6a1754f0acbc5cff82fea5e75706b4188c46435e0";
  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 1358L)
  private static SubLSymbol $parse_tree_utilities_use_this_parser$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 1655L)
  private static SubLSymbol $parse_tree_utilities_parser_constructor$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 2274L)
  private static SubLSymbol $tolerate_phraseless_charniak_heads$;
  private static final SubLSymbol $sym0$NEW_CHARNIAK_PARSER;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$_PARSE_TREE_UTILITIES_USE_THIS_PARSER_;
  private static final SubLSymbol $sym4$FIF;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$NOMINAL_PHRASE_TREE_P;
  private static final SubLSymbol $sym9$GET_HEAD;
  private static final SubLSymbol $sym10$GET_DAUGHTER;
  private static final SubLSymbol $sym11$DAUGHTER_COUNT;
  private static final SubLSymbol $sym12$GET_STRING;
  private static final SubLSymbol $sym13$GET_SISTER;
  private static final SubLString $str14$of;
  private static final SubLSymbol $sym15$STRING_DOWNCASE;
  private static final SubLSymbol $sym16$WORD_TREE_P;
  private static final SubLString $str17$_A__A;
  private static final SubLSymbol $sym18$GET_CATEGORY;
  private static final SubLString $str19$;
  private static final SubLSymbol $kw20$NPS;
  private static final SubLSymbol $kw21$NNPS;
  private static final SubLSymbol $kw22$PHRASELESS;
  private static final SubLSymbol $sym23$FIND_LAST;
  private static final SubLSymbol $sym24$COORDINATE_WORD_TREE_P;
  private static final SubLSymbol $sym25$GET_HEAD_DAUGHTER;
  private static final SubLSymbol $sym26$FIND_FIRST;
  private static final SubLSymbol $sym27$DETERMINER_WORD_TREE_P;
  private static final SubLSymbol $sym28$CARDINAL_WORD_TREE_P;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$PARSE;
  private static final SubLSymbol $sym31$FIND_ALL;
  private static final SubLSymbol $sym32$NP_TREE_P;
  private static final SubLSymbol $kw33$NOUN;
  private static final SubLSymbol $sym34$STRING_EQUAL;
  private static final SubLObject $const35$CountNoun;
  private static final SubLSymbol $kw36$SUBJECT;
  private static final SubLSymbol $kw37$OBJECT;
  private static final SubLSymbol $sym38$LISTP;
  private static final SubLString $str39$extract_verbal_match_from_source_;
  private static final SubLString $str40$don_t_know_what_to_do_with__S__sk;
  private static final SubLSymbol $sym41$CHARNIAK_PARSER_P;
  private static final SubLString $str42$_S_is_neither_a_STRINGP_nor_a_PAR;
  private static final SubLString $str43$Role__S_not_understood;
  private static final SubLSymbol $sym44$VP_TREE_P;
  private static final SubLSymbol $sym45$DUMMY_TO_P;
  private static final SubLSymbol $sym46$COPULA_P;
  private static final SubLSymbol $sym47$GET_SEMANTIC_SUBJECT;
  private static final SubLSymbol $sym48$GET_SUBJECT;
  private static final SubLSymbol $kw49$PROBLEM;
  private static final SubLSymbol $kw50$SUBJ;
  private static final SubLSymbol $sym51$GET_SEMANTIC_OBJECTS;
  private static final SubLSymbol $kw52$DOUBLE;
  private static final SubLSymbol $kw53$SINGLE;
  private static final SubLObject $const54$Date;
  private static final SubLSymbol $kw55$QP_TREE;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$PRT_TREE_P;
  private static final SubLString $str58$_A_A_VB;
  private static final SubLSymbol $kw59$VERB;
  private static final SubLString $str60$__A;
  private static final SubLList $list61;
  private static final SubLString $str62$P;
  private static final SubLString $str63$_A_NP;
  private static final SubLString $str64$_A_NN;
  private static final SubLSymbol $kw65$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym66$IGNORE_ERRORS_HANDLER;
  private static final SubLList $list67;
  private static final SubLSymbol $kw68$DFR2L;
  private static final SubLSymbol $kw69$DFL2R;
  private static final SubLString $str70$_S_is_not_one_of__S;
  private static final SubLSymbol $kw71$ALL;

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 1742L)
  public static SubLObject new_parse_tree_utilities_parser()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Functions.funcall( $parse_tree_utilities_parser_constructor$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 1855L)
  public static SubLObject get_parse_tree_utilities_parser()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $parse_tree_utilities_use_this_parser$.getDynamicValue( thread ) ) ? $parse_tree_utilities_use_this_parser$.getDynamicValue( thread ) : new_parse_tree_utilities_parser();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 2043L)
  public static SubLObject with_parse_tree_utilities_parser(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_parser = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    v_parser = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym3$_PARSE_TREE_UTILITIES_USE_THIS_PARSER_, ConsesLow.list( $sym4$FIF, ConsesLow.listS( EQL, v_parser, $list5 ), $list6, v_parser ) ) ), ConsesLow
        .append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 2410L)
  public static SubLObject while_tolerating_phraseless_heads(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list7, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 2545L)
  public static SubLObject get_complex_noun_from_phrase_tree(final SubLObject the_tree, SubLObject skip_downcaseP)
  {
    if( skip_downcaseP == UNPROVIDED )
    {
      skip_downcaseP = NIL;
    }
    assert NIL != parse_tree.nominal_phrase_tree_p( the_tree ) : the_tree;
    final SubLObject the_head = methods.funcall_instance_method_with_0_args( the_tree, $sym9$GET_HEAD );
    if( NIL == the_head )
    {
      return NIL;
    }
    final SubLObject possible_pp = methods.funcall_instance_method_with_1_args( the_tree, $sym10$GET_DAUGHTER, number_utilities.f_1_( methods.funcall_instance_method_with_0_args( the_tree, $sym11$DAUGHTER_COUNT ) ) );
    final SubLObject pp_head = ( NIL != parse_tree.prepositional_phrase_tree_p( possible_pp ) ) ? methods.funcall_instance_method_with_0_args( possible_pp, $sym9$GET_HEAD ) : NIL;
    SubLObject the_compound = ConsesLow.list( methods.funcall_instance_method_with_0_args( the_head, $sym12$GET_STRING ) );
    SubLObject lefty;
    for( lefty = NIL, lefty = methods.funcall_instance_method_with_1_args( the_head, $sym13$GET_SISTER, MINUS_ONE_INTEGER ); NIL != lefty && ( NIL != word_tree.adjectival_word_tree_p( lefty ) || NIL != word_tree
        .nominal_word_tree_p( lefty ) ); lefty = methods.funcall_instance_method_with_1_args( lefty, $sym13$GET_SISTER, MINUS_ONE_INTEGER ) )
    {
      if( NIL != word_tree.adjectival_word_tree_p( lefty ) || NIL != word_tree.nominal_word_tree_p( lefty ) )
      {
        the_compound = ConsesLow.cons( methods.funcall_instance_method_with_0_args( lefty, $sym12$GET_STRING ), the_compound );
      }
    }
    if( NIL != pp_head && NIL != Strings.string_equal( methods.funcall_instance_method_with_0_args( pp_head, $sym12$GET_STRING ), $str14$of, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      the_compound = ConsesLow.append( the_compound, ConsesLow.list( methods.funcall_instance_method_with_0_args( possible_pp, $sym12$GET_STRING ) ) );
    }
    if( Sequences.length( the_compound ).numL( TWO_INTEGER ) )
    {
      return NIL;
    }
    if( NIL != skip_downcaseP )
    {
      return the_compound;
    }
    if( NIL != word_tree.name_word_tree_p( the_head ) )
    {
      return the_compound;
    }
    return Mapping.mapcar( Symbols.symbol_function( $sym15$STRING_DOWNCASE ), the_compound );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 4477L)
  public static SubLObject combine_head_string_and_category(final SubLObject the_tree, SubLObject normalizeP)
  {
    if( normalizeP == UNPROVIDED )
    {
      normalizeP = NIL;
    }
    if( NIL != parse_tree.phrase_tree_p( the_tree ) )
    {
      final SubLObject the_head = methods.funcall_instance_method_with_0_args( the_tree, $sym9$GET_HEAD );
      return ( NIL != the_head ) ? combine_head_string_and_category( the_head, normalizeP ) : NIL;
    }
    assert NIL != word_tree.word_tree_p( the_tree ) : the_tree;
    return PrintLow.format( NIL, $str17$_A__A, ( NIL != normalizeP ) ? get_normalized_head_string( the_tree ) : methods.funcall_instance_method_with_0_args( the_tree, $sym12$GET_STRING ), methods
        .funcall_instance_method_with_0_args( the_tree, $sym18$GET_CATEGORY ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 5250L)
  public static SubLObject get_normalized_head_string(final SubLObject the_tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == the_tree )
    {
      return NIL;
    }
    final SubLObject head_element = methods.funcall_instance_method_with_0_args( the_tree, $sym9$GET_HEAD );
    if( NIL == head_element )
    {
      return $str19$;
    }
    if( NIL != word_tree.nominal_word_tree_p( head_element ) )
    {
      if( NIL == word_tree.name_word_tree_p( head_element ) )
      {
        return lexification_utilities.singularize_word( methods.funcall_instance_method_with_0_args( head_element, $sym12$GET_STRING ), UNPROVIDED );
      }
      final SubLObject pcase_var = methods.funcall_instance_method_with_0_args( head_element, $sym18$GET_CATEGORY );
      if( pcase_var.eql( $kw20$NPS ) || pcase_var.eql( $kw21$NNPS ) )
      {
        SubLObject word = NIL;
        final SubLObject _prev_bind_0 = morphology.$preserve_case_in_singular_regP$.currentBinding( thread );
        try
        {
          morphology.$preserve_case_in_singular_regP$.bind( T, thread );
          word = lexification_utilities.singularize_word( methods.funcall_instance_method_with_0_args( head_element, $sym12$GET_STRING ), UNPROVIDED );
        }
        finally
        {
          morphology.$preserve_case_in_singular_regP$.rebind( _prev_bind_0, thread );
        }
        return word;
      }
      return methods.funcall_instance_method_with_0_args( head_element, $sym12$GET_STRING );
    }
    else
    {
      if( NIL != parse_tree.nominal_phrase_tree_p( the_tree ) )
      {
        return get_normalized_head_string( head_element );
      }
      if( NIL != word_tree.verbal_word_tree_p( head_element ) )
      {
        return morphology.get_root( methods.funcall_instance_method_with_0_args( head_element, $sym12$GET_STRING ), UNPROVIDED );
      }
      if( NIL != parse_tree.verbal_phrase_tree_p( the_tree ) )
      {
        return get_normalized_head_string( head_element );
      }
      return methods.funcall_instance_method_with_0_args( head_element, $sym12$GET_STRING );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 6408L)
  public static SubLObject get_head_string_if_any(final SubLObject the_tree, SubLObject normalizeP)
  {
    if( normalizeP == UNPROVIDED )
    {
      normalizeP = NIL;
    }
    final SubLObject the_head = methods.funcall_instance_method_with_0_args( the_tree, $sym9$GET_HEAD );
    if( NIL == the_head )
    {
      return $str19$;
    }
    if( NIL != normalizeP )
    {
      return get_normalized_head_string( the_head );
    }
    return methods.funcall_instance_method_with_0_args( the_head, $sym12$GET_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 6950L)
  public static SubLObject get_nominal_head_strings(final SubLObject the_nominal, SubLObject with_posP, SubLObject normalizeP)
  {
    if( with_posP == UNPROVIDED )
    {
      with_posP = NIL;
    }
    if( normalizeP == UNPROVIDED )
    {
      normalizeP = with_posP;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $tolerate_phraseless_charniak_heads$.getDynamicValue( thread ) && NIL != word_tree.nominal_word_tree_p( the_nominal ) )
    {
      return Values.values( ConsesLow.list( ConsesLow.list( ( NIL != with_posP ) ? combine_head_string_and_category( the_nominal, normalizeP ) : get_head_string_if_any( the_nominal, normalizeP ), methods
          .funcall_instance_method_with_0_args( the_nominal, $sym12$GET_STRING ), $str19$ ) ), $kw22$PHRASELESS );
    }
    assert NIL != parse_tree.nominal_phrase_tree_p( the_nominal ) : the_nominal;
    final SubLObject det_string = get_nominal_tree_determiner_string( the_nominal );
    if( NIL != methods.funcall_instance_method_with_1_args( the_nominal, $sym23$FIND_LAST, $sym24$COORDINATE_WORD_TREE_P ) )
    {
      SubLObject the_results = NIL;
      final SubLObject vector_var = parse_tree.get_phrase_tree_daughters( the_nominal );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject this_daughter;
      SubLObject this_det_string;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        this_daughter = Vectors.aref( vector_var, element_num );
        if( NIL != word_tree.nominal_word_tree_p( this_daughter ) )
        {
          the_results = ConsesLow.cons( ConsesLow.list( ( NIL != with_posP ) ? combine_head_string_and_category( this_daughter, normalizeP ) : get_head_string_if_any( this_daughter, normalizeP ), methods
              .funcall_instance_method_with_0_args( this_daughter, $sym12$GET_STRING ), det_string ), the_results );
        }
        else if( NIL != parse_tree.nominal_phrase_tree_p( this_daughter ) )
        {
          this_det_string = ( NIL != string_utilities.empty_string_p( det_string ) ) ? ( ( NIL != get_nominal_tree_determiner_string( this_daughter ) ) ? get_nominal_tree_determiner_string( this_daughter ) : $str19$ )
              : det_string;
          the_results = ConsesLow.cons( ConsesLow.list( ( NIL != with_posP ) ? combine_head_string_and_category( this_daughter, normalizeP ) : get_head_string_if_any( this_daughter, normalizeP ),
              get_longest_nominal_string( this_daughter ), this_det_string ), the_results );
        }
      }
      return Values.values( Sequences.reverse( the_results ), NIL );
    }
    final SubLObject complex_string = get_longest_nominal_string( the_nominal );
    final SubLObject head_string = ( NIL != with_posP ) ? combine_head_string_and_category( the_nominal, normalizeP ) : get_head_string_if_any( the_nominal, normalizeP );
    return Values.values( ConsesLow.list( ConsesLow.list( head_string, complex_string, det_string ) ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 9635L)
  public static SubLObject get_nominal_tree_determiner_string(final SubLObject the_nominal)
  {
    assert NIL != parse_tree.nominal_phrase_tree_p( the_nominal ) : the_nominal;
    final SubLObject true_head = methods.funcall_instance_method_with_0_args( the_nominal, $sym25$GET_HEAD_DAUGHTER );
    if( NIL != parse_tree.nominal_phrase_tree_p( true_head ) )
    {
      final SubLObject the_det = get_nominal_tree_determiner_string( true_head );
      if( NIL == string_utilities.empty_string_p( the_det ) )
      {
        return the_det;
      }
    }
    final SubLObject the_det = ( NIL != methods.funcall_instance_method_with_1_args( the_nominal, $sym26$FIND_FIRST, $sym27$DETERMINER_WORD_TREE_P ) ) ? methods.funcall_instance_method_with_1_args( the_nominal,
        $sym26$FIND_FIRST, $sym27$DETERMINER_WORD_TREE_P ) : methods.funcall_instance_method_with_1_args( the_nominal, $sym26$FIND_FIRST, $sym28$CARDINAL_WORD_TREE_P );
    return ( NIL != the_det ) ? Strings.string_downcase( methods.funcall_instance_method_with_0_args( the_det, $sym12$GET_STRING ), UNPROVIDED, UNPROVIDED ) : $str19$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 10368L)
  public static SubLObject get_longest_nominal_string(final SubLObject the_tree)
  {
    final SubLObject head_dtr = methods.funcall_instance_method_with_0_args( the_tree, $sym25$GET_HEAD_DAUGHTER );
    if( NIL == head_dtr )
    {
      return $str19$;
    }
    if( NIL != parse_tree.qp_tree_p( head_dtr ) )
    {
      return NIL;
    }
    return ( NIL != get_complex_noun_from_phrase_tree( the_tree, T ) ) ? get_complex_noun_from_phrase_tree( the_tree, T )
        : ( ( NIL != word_tree.word_tree_p( head_dtr ) ) ? get_head_string_if_any( the_tree, UNPROVIDED ) : get_longest_nominal_string( head_dtr ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 11211L)
  public static SubLObject extract_all_complex_nouns_from_text(final SubLObject the_text, SubLObject key_string, SubLObject mergeP)
  {
    if( key_string == UNPROVIDED )
    {
      key_string = $str19$;
    }
    if( mergeP == UNPROVIDED )
    {
      mergeP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == key_string )
    {
      key_string = $str19$;
    }
    thread.resetMultipleValues();
    final SubLObject headed = extract_matching_complex_nouns_from_text( the_text, key_string );
    final SubLObject unheaded = thread.secondMultipleValue();
    final SubLObject the_parse = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject head_matches = NIL;
    SubLObject nonhead_matches = NIL;
    SubLObject cdolist_list_var = headed;
    SubLObject this_pair = NIL;
    this_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = this_pair;
      SubLObject the_strings = NIL;
      SubLObject the_head = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      the_strings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      the_head = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != mergeP )
        {
          head_matches = ConsesLow.cons( ConsesLow.list( string_utilities.bunge( the_strings, UNPROVIDED ), the_head ), head_matches );
        }
        else
        {
          head_matches = ConsesLow.cons( the_strings, head_matches );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_pair = cdolist_list_var.first();
    }
    cdolist_list_var = unheaded;
    this_pair = NIL;
    this_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = this_pair;
      SubLObject the_strings = NIL;
      SubLObject the_head = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      the_strings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      the_head = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != mergeP )
        {
          head_matches = ConsesLow.cons( ConsesLow.list( string_utilities.bunge( the_strings, UNPROVIDED ), the_head ), head_matches );
        }
        else
        {
          nonhead_matches = ConsesLow.cons( the_strings, nonhead_matches );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_pair = cdolist_list_var.first();
    }
    return ( NIL != mergeP ) ? Values.values( head_matches, the_parse ) : Values.values( head_matches, nonhead_matches, the_parse );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 12425L)
  public static SubLObject extract_matching_complex_nouns_from_text(final SubLObject the_text, final SubLObject key_string)
  {
    final SubLObject my_parser = get_parse_tree_utilities_parser();
    final SubLObject the_parse = methods.funcall_instance_method_with_1_args( my_parser, $sym30$PARSE, the_text );
    final SubLObject the_nps = ( NIL != the_parse ) ? methods.funcall_instance_method_with_1_args( the_parse, $sym31$FIND_ALL, $sym32$NP_TREE_P ) : NIL;
    SubLObject headed_matches = NIL;
    SubLObject other_matches = NIL;
    if( NIL == the_nps )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = the_nps;
    SubLObject this_np = NIL;
    this_np = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject the_strings = get_complex_noun_from_phrase_tree( this_np, UNPROVIDED );
      final SubLObject head_string = get_head_string_if_any( this_np, UNPROVIDED );
      if( NIL != the_strings )
      {
        if( NIL != string_utilities.empty_string_p( key_string ) )
        {
          headed_matches = ConsesLow.cons( ConsesLow.list( the_strings, head_string ), headed_matches );
        }
        else
        {
          final SubLObject variants = acceptable_variations_for_extraction( key_string, $kw33$NOUN, this_np );
          SubLObject doneP = NIL;
          if( NIL != subl_promotions.memberP( head_string, variants, Symbols.symbol_function( $sym34$STRING_EQUAL ), UNPROVIDED ) )
          {
            headed_matches = ConsesLow.cons( ConsesLow.list( the_strings, head_string ), headed_matches );
          }
          else if( NIL == doneP )
          {
            SubLObject csome_list_var = variants;
            SubLObject this_variant = NIL;
            this_variant = csome_list_var.first();
            while ( NIL == doneP && NIL != csome_list_var)
            {
              if( NIL == doneP )
              {
                SubLObject csome_list_var_$1 = the_strings;
                SubLObject this_string = NIL;
                this_string = csome_list_var_$1.first();
                while ( NIL == doneP && NIL != csome_list_var_$1)
                {
                  if( NIL != Strings.string_equal( this_string, this_variant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                  {
                    other_matches = ConsesLow.cons( ConsesLow.list( the_strings, head_string ), other_matches );
                    doneP = T;
                  }
                  csome_list_var_$1 = csome_list_var_$1.rest();
                  this_string = csome_list_var_$1.first();
                }
              }
              csome_list_var = csome_list_var.rest();
              this_variant = csome_list_var.first();
            }
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_np = cdolist_list_var.first();
    }
    return Values.values( headed_matches, other_matches, the_parse );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 14285L)
  public static SubLObject acceptable_variations_for_extraction(final SubLObject base_string, final SubLObject pos, SubLObject tree)
  {
    if( tree == UNPROVIDED )
    {
      tree = NIL;
    }
    if( !pos.eql( $kw33$NOUN ) )
    {
      return NIL;
    }
    if( NIL != tree && NIL != word_tree.name_word_tree_p( methods.funcall_instance_method_with_0_args( tree, $sym9$GET_HEAD ) ) )
    {
      return ConsesLow.list( base_string, lexification_utilities.singularize_word( base_string, UNPROVIDED ), lexification_utilities.pluralize_word( base_string, UNPROVIDED ) );
    }
    if( NIL != subl_promotions.memberP( $const35$CountNoun, lexicon_accessors.pos_of_string( base_string, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
    {
      return lexicon_utilities.word_variants( base_string, $kw33$NOUN, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return ConsesLow.list( lexification_utilities.singularize_word( base_string, UNPROVIDED ), lexification_utilities.pluralize_word( base_string, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 14997L)
  public static SubLObject extract_verbal_matches_from_source(final SubLObject the_source, SubLObject list_of_roles)
  {
    if( list_of_roles == UNPROVIDED )
    {
      list_of_roles = ConsesLow.list( $kw36$SUBJECT, $kw37$OBJECT );
    }
    assert NIL != Types.listp( list_of_roles ) : list_of_roles;
    SubLObject the_lists = NIL;
    final SubLObject v_parser = the_source.isString() ? get_parse_tree_utilities_parser() : NIL;
    final SubLObject the_parse = ( NIL != v_parser ) ? methods.funcall_instance_method_with_1_args( v_parser, $sym30$PARSE, the_source ) : the_source;
    SubLObject cdolist_list_var = list_of_roles;
    SubLObject this_role = NIL;
    this_role = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject ret_value = extract_verbal_matches_from_source_int( the_parse, this_role );
      if( ret_value.isList() )
      {
        the_lists = ConsesLow.cons( ret_value, the_lists );
      }
      else if( ret_value.isString() )
      {
        Errors.error( $str39$extract_verbal_match_from_source_, ret_value );
      }
      else if( NIL == ret_value )
      {
        Errors.warn( $str40$don_t_know_what_to_do_with__S__sk, ret_value );
      }
      else
      {
        the_lists = ConsesLow.cons( NIL, the_lists );
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_role = cdolist_list_var.first();
    }
    return Sequences.reverse( the_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 16139L)
  public static SubLObject extract_verbal_matches_downcase_first_word(final SubLObject sentence_or_parse_tree, SubLObject v_parser)
  {
    if( v_parser == UNPROVIDED )
    {
      v_parser = NIL;
    }
    SubLObject sentence = NIL;
    SubLObject v_parse_tree = NIL;
    if( sentence_or_parse_tree.isString() )
    {
      if( NIL != v_parser )
      {
        assert NIL != parser.charniak_parser_p( v_parser ) : v_parser;
      }
      else
      {
        v_parser = parser.new_charniak_parser( UNPROVIDED, UNPROVIDED );
      }
      sentence = sentence_or_parse_tree;
      v_parse_tree = methods.funcall_instance_method_with_1_args( v_parser, $sym30$PARSE, sentence );
    }
    else if( NIL != parse_tree.parse_tree_p( sentence_or_parse_tree ) )
    {
      v_parse_tree = sentence_or_parse_tree;
      sentence = methods.funcall_instance_method_with_0_args( v_parse_tree, $sym12$GET_STRING );
    }
    else
    {
      Errors.error( $str42$_S_is_neither_a_STRINGP_nor_a_PAR, sentence_or_parse_tree );
    }
    final SubLObject first_word = string_utilities.first_word( sentence, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject matches = cdolist_list_var = extract_verbal_matches_from_source( v_parse_tree, UNPROVIDED );
    SubLObject matches_for_role = NIL;
    matches_for_role = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$2 = matches_for_role;
      SubLObject match = NIL;
      match = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        final SubLObject whole_noun = ConsesLow.nth( TWO_INTEGER, match );
        if( whole_noun.equal( first_word ) )
        {
          ConsesLow.set_nth( TWO_INTEGER, match, Strings.string_downcase( whole_noun, UNPROVIDED, UNPROVIDED ) );
        }
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        match = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      matches_for_role = cdolist_list_var.first();
    }
    return matches;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 17270L)
  public static SubLObject extract_verbal_matches_from_source_int(final SubLObject the_source, final SubLObject the_role)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !the_source.isString() && NIL == parse_tree.phrase_tree_p( the_source ) )
    {
      return NIL;
    }
    if( NIL == subl_promotions.memberP( the_role, ConsesLow.list( $kw36$SUBJECT, $kw37$OBJECT ), UNPROVIDED, UNPROVIDED ) )
    {
      return PrintLow.format( NIL, $str43$Role__S_not_understood, the_role );
    }
    final SubLObject my_parser = the_source.isString() ? get_parse_tree_utilities_parser() : NIL;
    final SubLObject the_parse = ( NIL != my_parser ) ? methods.funcall_instance_method_with_1_args( my_parser, $sym30$PARSE, the_source ) : the_source;
    final SubLObject the_vps = ( NIL != the_parse ) ? methods.funcall_instance_method_with_1_args( the_parse, $sym31$FIND_ALL, $sym44$VP_TREE_P ) : NIL;
    SubLObject the_matches = NIL;
    SubLObject this_subject = NIL;
    SubLObject preserve_subject = NIL;
    if( NIL == the_vps )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = the_vps;
    SubLObject this_vp = NIL;
    this_vp = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == methods.funcall_instance_method_with_0_args( this_vp, $sym45$DUMMY_TO_P ) && NIL != methods.funcall_instance_method_with_0_args( this_vp, $sym9$GET_HEAD ) && ( NIL == word_tree.aux_verb_tree_p( methods
          .funcall_instance_method_with_0_args( this_vp, $sym9$GET_HEAD ) ) || NIL != methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( this_vp, $sym9$GET_HEAD ),
              $sym46$COPULA_P ) ) && NIL == methods.funcall_instance_method_with_1_args( this_vp, $sym26$FIND_FIRST, $sym24$COORDINATE_WORD_TREE_P ) )
      {
        if( the_role.eql( $kw36$SUBJECT ) )
        {
          this_subject = ( NIL != methods.funcall_instance_method_with_0_args( this_vp, $sym47$GET_SEMANTIC_SUBJECT ) ) ? methods.funcall_instance_method_with_0_args( this_vp, $sym47$GET_SEMANTIC_SUBJECT )
              : ( ( NIL != methods.funcall_instance_method_with_0_args( this_vp, $sym48$GET_SUBJECT ) ) ? NIL : preserve_subject );
          if( NIL != ( preserve_subject = this_subject ) )
          {
            final SubLObject _prev_bind_0 = $tolerate_phraseless_charniak_heads$.currentBinding( thread );
            try
            {
              $tolerate_phraseless_charniak_heads$.bind( T, thread );
              thread.resetMultipleValues();
              final SubLObject the_strings = get_nominal_head_strings( this_subject, T, UNPROVIDED );
              final SubLObject problemP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              SubLObject cdolist_list_var_$3 = extract_verbal_matches_get_triples( this_vp, the_strings );
              SubLObject this_match = NIL;
              this_match = cdolist_list_var_$3.first();
              while ( NIL != cdolist_list_var_$3)
              {
                the_matches = ConsesLow.cons( list_utilities.flatten( ConsesLow.list( this_match, ( NIL != problemP ) ? $kw49$PROBLEM : $kw50$SUBJ ) ), the_matches );
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                this_match = cdolist_list_var_$3.first();
              }
            }
            finally
            {
              $tolerate_phraseless_charniak_heads$.rebind( _prev_bind_0, thread );
            }
          }
        }
        else if( the_role.eql( $kw37$OBJECT ) )
        {
          final SubLObject all_objects = punt_date_adjuncts( methods.funcall_instance_method_with_0_args( this_vp, $sym51$GET_SEMANTIC_OBJECTS ) );
          final SubLObject subcat_frame = Sequences.length( all_objects ).numG( ONE_INTEGER ) ? $kw52$DOUBLE : $kw53$SINGLE;
          final SubLObject key_object = all_objects.first();
          if( NIL != key_object )
          {
            final SubLObject _prev_bind_2 = $tolerate_phraseless_charniak_heads$.currentBinding( thread );
            try
            {
              $tolerate_phraseless_charniak_heads$.bind( T, thread );
              thread.resetMultipleValues();
              final SubLObject the_strings2 = get_nominal_head_strings( key_object, T, UNPROVIDED );
              final SubLObject problemP2 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              SubLObject cdolist_list_var_$4 = extract_verbal_matches_get_triples( this_vp, the_strings2 );
              SubLObject this_match2 = NIL;
              this_match2 = cdolist_list_var_$4.first();
              while ( NIL != cdolist_list_var_$4)
              {
                the_matches = ConsesLow.cons( list_utilities.flatten( ConsesLow.list( this_match2, keyword_for_verbal_triple( subcat_frame, problemP2, key_object ) ) ), the_matches );
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                this_match2 = cdolist_list_var_$4.first();
              }
            }
            finally
            {
              $tolerate_phraseless_charniak_heads$.rebind( _prev_bind_2, thread );
            }
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_vp = cdolist_list_var.first();
    }
    return Sequences.reverse( the_matches );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 20226L)
  public static SubLObject punt_date_adjuncts(final SubLObject the_objects)
  {
    SubLObject not_dates = NIL;
    SubLObject cdolist_list_var = the_objects;
    SubLObject this_object = NIL;
    this_object = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject the_head = get_head_string_if_any( this_object, UNPROVIDED );
      SubLObject dateP = NIL;
      if( NIL != the_head )
      {
        if( NIL == dateP )
        {
          SubLObject csome_list_var;
          SubLObject this_denot;
          for( csome_list_var = lexicon_accessors.denots_of_string( the_head, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED ), this_denot = NIL, this_denot = csome_list_var.first(); NIL == dateP && NIL != csome_list_var; dateP = makeBoolean( NIL != pph_utilities.pph_genlP( this_denot, $const54$Date, UNPROVIDED )
                  || NIL != pph_utilities.pph_isaP( this_denot, $const54$Date, UNPROVIDED ) ), csome_list_var = csome_list_var.rest(), this_denot = csome_list_var.first() )
          {
          }
        }
        if( NIL == dateP )
        {
          not_dates = ConsesLow.cons( this_object, not_dates );
        }
        else if( NIL != parse_tree.np_tree_p( methods.funcall_instance_method_with_1_args( this_object, $sym10$GET_DAUGHTER, ZERO_INTEGER ) ) )
        {
          not_dates = ConsesLow.cons( methods.funcall_instance_method_with_1_args( this_object, $sym10$GET_DAUGHTER, ZERO_INTEGER ), not_dates );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_object = cdolist_list_var.first();
    }
    return Sequences.reverse( not_dates );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 22115L)
  public static SubLObject keyword_for_verbal_triple(final SubLObject preferred, final SubLObject problemP, SubLObject check_tree)
  {
    if( check_tree == UNPROVIDED )
    {
      check_tree = NIL;
    }
    final SubLObject its_dtr = ( NIL != parse_tree.phrase_tree_p( check_tree ) ) ? methods.funcall_instance_method_with_0_args( check_tree, $sym25$GET_HEAD_DAUGHTER ) : NIL;
    return ( NIL != ( ( NIL != problemP ) ? ( problemP.isKeyword() ? problemP : $kw49$PROBLEM ) : NIL ) ) ? ( ( NIL != problemP ) ? ( problemP.isKeyword() ? problemP : $kw49$PROBLEM ) : NIL )
        : ( ( NIL != ( ( NIL != parse_tree.phrase_tree_p( its_dtr ) ) ? keyword_for_verbal_triple( preferred, problemP, its_dtr ) : NIL ) ) ? ( ( NIL != parse_tree.phrase_tree_p( its_dtr ) ) ? keyword_for_verbal_triple(
            preferred, problemP, its_dtr ) : NIL )
            : ( ( NIL != ( ( NIL != parse_tree.qp_tree_p( check_tree ) ) ? $kw55$QP_TREE : NIL ) ) ? ( ( NIL != parse_tree.qp_tree_p( check_tree ) ) ? $kw55$QP_TREE : NIL ) : preferred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 22967L)
  public static SubLObject extract_verbal_matches_get_triples(final SubLObject vp, final SubLObject the_nps)
  {
    SubLObject the_triples = NIL;
    SubLObject cdolist_list_var = the_nps;
    SubLObject this_np = NIL;
    this_np = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = this_np;
      SubLObject the_head = NIL;
      SubLObject all_strings = NIL;
      SubLObject the_det = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
      the_head = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
      all_strings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
      the_det = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != the_head )
        {
          final SubLObject head_suf = just_the_nn_or_np_suffix( the_head );
          final SubLObject vstring = get_head_string_if_any( vp, UNPROVIDED );
          final SubLObject the_particle = methods.funcall_instance_method_with_1_args( vp, $sym26$FIND_FIRST, $sym57$PRT_TREE_P );
          the_triples = ConsesLow.cons( ConsesLow.list( head_suf.isList() ? head_suf.first() : head_suf, PrintLow.format( NIL, $str58$_A_A_VB, morphology.get_root_of_head( vstring, $kw59$VERB ), ( NIL != the_particle )
              ? PrintLow.format( NIL, $str60$__A, methods.funcall_instance_method_with_0_args( the_particle, $sym12$GET_STRING ) )
              : $str19$ ), all_strings.isList() ? string_utilities.bunge( all_strings, UNPROVIDED ) : all_strings, the_det ), the_triples );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      this_np = cdolist_list_var.first();
    }
    return Sequences.reverse( the_triples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 23689L)
  public static SubLObject just_the_nn_or_np_suffix(final SubLObject string_cat)
  {
    SubLObject current;
    final SubLObject datum = current = string_utilities.split_string( string_cat, ConsesLow.list( Characters.CHAR_underbar ) );
    SubLObject the_string = NIL;
    SubLObject the_cat = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    the_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    the_cat = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list61 );
      return NIL;
    }
    if( NIL != string_utilities.substringP( $str62$P, the_cat, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return PrintLow.format( NIL, $str63$_A_NP, the_string );
    }
    return PrintLow.format( NIL, $str64$_A_NN, Strings.string_downcase( the_string, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 23960L)
  public static SubLObject syntactic_xps(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == parser.stanford_parser_availableP( UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject xps = NIL;
    final SubLObject v_parser = parser.new_stanford_parser( UNPROVIDED, UNPROVIDED );
    final SubLObject tree = methods.funcall_instance_method_with_1_args( v_parser, $sym30$PARSE, string );
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw65$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym66$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject categories_var = $list67;
          final SubLObject stack = stacks.create_stack();
          final SubLObject order_var = $kw68$DFR2L;
          final SubLObject possible_orders = ConsesLow.list( $kw69$DFL2R, $kw68$DFR2L );
          SubLObject daughter = NIL;
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
          {
            Errors.error( $str70$_S_is_not_one_of__S, order_var, possible_orders );
          }
          stacks.stack_push( tree, stack );
          while ( NIL == stacks.stack_empty_p( stack ))
          {
            daughter = stacks.stack_pop( stack );
            if( categories_var == $kw71$ALL || NIL != subl_promotions.memberP( methods.funcall_instance_method_with_0_args( daughter, $sym18$GET_CATEGORY ), categories_var, UNPROVIDED, UNPROVIDED ) )
            {
              xps = ConsesLow.cons( daughter, xps );
            }
            if( NIL != parse_tree.phrase_tree_p( daughter ) )
            {
              final SubLObject vector_var = parse_tree.get_phrase_tree_daughters( daughter );
              final SubLObject backwardP_var = Equality.eq( order_var, $kw69$DFL2R );
              SubLObject length;
              SubLObject v_iteration;
              SubLObject element_num;
              SubLObject daughter_$5;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                daughter_$5 = Vectors.aref( vector_var, element_num );
                stacks.stack_push( daughter_$5, stack );
              }
            }
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw65$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Values.values( xps, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 24421L)
  public static SubLObject parse_tree_string(final SubLObject tree)
  {
    return methods.funcall_instance_method_with_0_args( tree, $sym12$GET_STRING );
  }

  public static SubLObject declare_parse_tree_utilities_file()
  {
    SubLFiles.declareFunction( me, "new_parse_tree_utilities_parser", "NEW-PARSE-TREE-UTILITIES-PARSER", 0, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_utilities_parser", "GET-PARSE-TREE-UTILITIES-PARSER", 0, 0, false );
    SubLFiles.declareMacro( me, "with_parse_tree_utilities_parser", "WITH-PARSE-TREE-UTILITIES-PARSER" );
    SubLFiles.declareMacro( me, "while_tolerating_phraseless_heads", "WHILE-TOLERATING-PHRASELESS-HEADS" );
    SubLFiles.declareFunction( me, "get_complex_noun_from_phrase_tree", "GET-COMPLEX-NOUN-FROM-PHRASE-TREE", 1, 1, false );
    SubLFiles.declareFunction( me, "combine_head_string_and_category", "COMBINE-HEAD-STRING-AND-CATEGORY", 1, 1, false );
    SubLFiles.declareFunction( me, "get_normalized_head_string", "GET-NORMALIZED-HEAD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_head_string_if_any", "GET-HEAD-STRING-IF-ANY", 1, 1, false );
    SubLFiles.declareFunction( me, "get_nominal_head_strings", "GET-NOMINAL-HEAD-STRINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "get_nominal_tree_determiner_string", "GET-NOMINAL-TREE-DETERMINER-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_longest_nominal_string", "GET-LONGEST-NOMINAL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_all_complex_nouns_from_text", "EXTRACT-ALL-COMPLEX-NOUNS-FROM-TEXT", 1, 2, false );
    SubLFiles.declareFunction( me, "extract_matching_complex_nouns_from_text", "EXTRACT-MATCHING-COMPLEX-NOUNS-FROM-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "acceptable_variations_for_extraction", "ACCEPTABLE-VARIATIONS-FOR-EXTRACTION", 2, 1, false );
    SubLFiles.declareFunction( me, "extract_verbal_matches_from_source", "EXTRACT-VERBAL-MATCHES-FROM-SOURCE", 1, 1, false );
    SubLFiles.declareFunction( me, "extract_verbal_matches_downcase_first_word", "EXTRACT-VERBAL-MATCHES-DOWNCASE-FIRST-WORD", 1, 1, false );
    SubLFiles.declareFunction( me, "extract_verbal_matches_from_source_int", "EXTRACT-VERBAL-MATCHES-FROM-SOURCE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "punt_date_adjuncts", "PUNT-DATE-ADJUNCTS", 1, 0, false );
    SubLFiles.declareFunction( me, "keyword_for_verbal_triple", "KEYWORD-FOR-VERBAL-TRIPLE", 2, 1, false );
    SubLFiles.declareFunction( me, "extract_verbal_matches_get_triples", "EXTRACT-VERBAL-MATCHES-GET-TRIPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "just_the_nn_or_np_suffix", "JUST-THE-NN-OR-NP-SUFFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "syntactic_xps", "SYNTACTIC-XPS", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_string", "PARSE-TREE-STRING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_parse_tree_utilities_file()
  {
    $parse_tree_utilities_use_this_parser$ = SubLFiles.defparameter( "*PARSE-TREE-UTILITIES-USE-THIS-PARSER*", NIL );
    $parse_tree_utilities_parser_constructor$ = SubLFiles.defparameter( "*PARSE-TREE-UTILITIES-PARSER-CONSTRUCTOR*", Symbols.symbol_function( $sym0$NEW_CHARNIAK_PARSER ) );
    $tolerate_phraseless_charniak_heads$ = SubLFiles.defparameter( "*TOLERATE-PHRASELESS-CHARNIAK-HEADS*", NIL );
    return NIL;
  }

  public static SubLObject setup_parse_tree_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_parse_tree_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_parse_tree_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_parse_tree_utilities_file();
  }
  static
  {
    me = new parse_tree_utilities();
    $parse_tree_utilities_use_this_parser$ = null;
    $parse_tree_utilities_parser_constructor$ = null;
    $tolerate_phraseless_charniak_heads$ = null;
    $sym0$NEW_CHARNIAK_PARSER = makeSymbol( "NEW-CHARNIAK-PARSER" );
    $list1 = ConsesLow.list( makeSymbol( "PARSER" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$_PARSE_TREE_UTILITIES_USE_THIS_PARSER_ = makeSymbol( "*PARSE-TREE-UTILITIES-USE-THIS-PARSER*" );
    $sym4$FIF = makeSymbol( "FIF" );
    $list5 = ConsesLow.list( makeKeyword( "NEW" ) );
    $list6 = ConsesLow.list( makeSymbol( "NEW-PARSE-TREE-UTILITIES-PARSER" ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "*TOLERATE-PHRASELESS-CHARNIAK-HEADS*" ), T ) );
    $sym8$NOMINAL_PHRASE_TREE_P = makeSymbol( "NOMINAL-PHRASE-TREE-P" );
    $sym9$GET_HEAD = makeSymbol( "GET-HEAD" );
    $sym10$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym11$DAUGHTER_COUNT = makeSymbol( "DAUGHTER-COUNT" );
    $sym12$GET_STRING = makeSymbol( "GET-STRING" );
    $sym13$GET_SISTER = makeSymbol( "GET-SISTER" );
    $str14$of = makeString( "of" );
    $sym15$STRING_DOWNCASE = makeSymbol( "STRING-DOWNCASE" );
    $sym16$WORD_TREE_P = makeSymbol( "WORD-TREE-P" );
    $str17$_A__A = makeString( "~A_~A" );
    $sym18$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $str19$ = makeString( "" );
    $kw20$NPS = makeKeyword( "NPS" );
    $kw21$NNPS = makeKeyword( "NNPS" );
    $kw22$PHRASELESS = makeKeyword( "PHRASELESS" );
    $sym23$FIND_LAST = makeSymbol( "FIND-LAST" );
    $sym24$COORDINATE_WORD_TREE_P = makeSymbol( "COORDINATE-WORD-TREE-P" );
    $sym25$GET_HEAD_DAUGHTER = makeSymbol( "GET-HEAD-DAUGHTER" );
    $sym26$FIND_FIRST = makeSymbol( "FIND-FIRST" );
    $sym27$DETERMINER_WORD_TREE_P = makeSymbol( "DETERMINER-WORD-TREE-P" );
    $sym28$CARDINAL_WORD_TREE_P = makeSymbol( "CARDINAL-WORD-TREE-P" );
    $list29 = ConsesLow.list( makeSymbol( "THE-STRINGS" ), makeSymbol( "THE-HEAD" ) );
    $sym30$PARSE = makeSymbol( "PARSE" );
    $sym31$FIND_ALL = makeSymbol( "FIND-ALL" );
    $sym32$NP_TREE_P = makeSymbol( "NP-TREE-P" );
    $kw33$NOUN = makeKeyword( "NOUN" );
    $sym34$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $const35$CountNoun = constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) );
    $kw36$SUBJECT = makeKeyword( "SUBJECT" );
    $kw37$OBJECT = makeKeyword( "OBJECT" );
    $sym38$LISTP = makeSymbol( "LISTP" );
    $str39$extract_verbal_match_from_source_ = makeString( "extract-verbal-match-from-source-int returned ~S" );
    $str40$don_t_know_what_to_do_with__S__sk = makeString( "don't know what to do with ~S, skipping" );
    $sym41$CHARNIAK_PARSER_P = makeSymbol( "CHARNIAK-PARSER-P" );
    $str42$_S_is_neither_a_STRINGP_nor_a_PAR = makeString( "~S is neither a STRINGP nor a PARSE-TREE-P." );
    $str43$Role__S_not_understood = makeString( "Role ~S not understood" );
    $sym44$VP_TREE_P = makeSymbol( "VP-TREE-P" );
    $sym45$DUMMY_TO_P = makeSymbol( "DUMMY-TO-P" );
    $sym46$COPULA_P = makeSymbol( "COPULA-P" );
    $sym47$GET_SEMANTIC_SUBJECT = makeSymbol( "GET-SEMANTIC-SUBJECT" );
    $sym48$GET_SUBJECT = makeSymbol( "GET-SUBJECT" );
    $kw49$PROBLEM = makeKeyword( "PROBLEM" );
    $kw50$SUBJ = makeKeyword( "SUBJ" );
    $sym51$GET_SEMANTIC_OBJECTS = makeSymbol( "GET-SEMANTIC-OBJECTS" );
    $kw52$DOUBLE = makeKeyword( "DOUBLE" );
    $kw53$SINGLE = makeKeyword( "SINGLE" );
    $const54$Date = constant_handles.reader_make_constant_shell( makeString( "Date" ) );
    $kw55$QP_TREE = makeKeyword( "QP-TREE" );
    $list56 = ConsesLow.list( makeSymbol( "THE-HEAD" ), makeSymbol( "ALL-STRINGS" ), makeSymbol( "THE-DET" ) );
    $sym57$PRT_TREE_P = makeSymbol( "PRT-TREE-P" );
    $str58$_A_A_VB = makeString( "~A~A_VB" );
    $kw59$VERB = makeKeyword( "VERB" );
    $str60$__A = makeString( "_~A" );
    $list61 = ConsesLow.list( makeSymbol( "THE-STRING" ), makeSymbol( "THE-CAT" ) );
    $str62$P = makeString( "P" );
    $str63$_A_NP = makeString( "~A_NP" );
    $str64$_A_NN = makeString( "~A_NN" );
    $kw65$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym66$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $list67 = ConsesLow.list( makeKeyword( "NP" ), makeKeyword( "VP" ) );
    $kw68$DFR2L = makeKeyword( "DFR2L" );
    $kw69$DFL2R = makeKeyword( "DFL2R" );
    $str70$_S_is_not_one_of__S = makeString( "~S is not one of ~S" );
    $kw71$ALL = makeKeyword( "ALL" );
  }
}
/*
 * 
 * Total time: 201 ms
 * 
 */