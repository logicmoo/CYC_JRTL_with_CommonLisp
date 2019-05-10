package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class decision_tree
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.decision_tree";
  public static final String myFingerPrint = "ce0849fd3eccc3f6809999090d58edbe6963fa55b758e73fa2a5a9511dd36a07";
  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 2807L)
  public static SubLSymbol $decision_tree_parser_transform_field_stringP$;
  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 3286L)
  public static SubLSymbol $decision_tree_parser_keep_countsP$;
  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 3463L)
  public static SubLSymbol $decision_tree_parser_output_infixP$;
  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 3711L)
  public static SubLSymbol $decision_tree_parse_numbers_as_integersP$;
  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 10515L)
  public static SubLSymbol $decision_tree_lookup_function$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLString $str2$_;
  private static final SubLSymbol $kw3$GT;
  private static final SubLString $str4$__;
  private static final SubLSymbol $kw5$GE;
  private static final SubLString $str6$_;
  private static final SubLSymbol $kw7$LT;
  private static final SubLString $str8$__;
  private static final SubLSymbol $kw9$LE;
  private static final SubLString $str10$_;
  private static final SubLSymbol $kw11$EQ;
  private static final SubLString $str12$__;
  private static final SubLSymbol $kw13$NE;
  private static final SubLString $str14$Unexpected_decision_tree_comparat;
  private static final SubLString $str15$Unexpected_decision_tree_comparat;
  private static final SubLString $str16$Dont_know_how_to_negate_decision_;
  private static final SubLSymbol $sym17$STRINGP;
  private static final SubLSymbol $sym18$DECISION_TREE_COMPARATOR_STRING_P;
  private static final SubLSymbol $sym19$DECISION_TREE_NODE_P;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$READ_FROM_STRING_IGNORING_ERRORS;
  private static final SubLSymbol $sym22$NUMBERP;
  private static final SubLSymbol $sym23$DECISION_TREE_LEAF_NODE_P;
  private static final SubLString $str24$_;
  private static final SubLString $str25$_;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$DECISION_TREE_P;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$UNPROVIDED;
  private static final SubLString $str30$A_value_for__s_must_be_provided_i;
  private static final SubLSymbol $sym31$GETF;
  private static final SubLSymbol $sym32$HIERARCHICAL_VISITOR_P;
  private static final SubLSymbol $kw33$VISIT;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$FINISH;
  private static final SubLList $list36;
  private static final SubLString $str37$Cannot_determine_the_node_type_fo;
  private static final SubLString $str38$Invalid_state_transition__A_in_vi;

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 1150L)
  public static SubLObject decision_tree_comparison_operator_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $list0, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 1279L)
  public static SubLObject decision_tree_comparator_string_p(final SubLObject v_object)
  {
    return list_utilities.member_equalP( v_object, $list1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 1401L)
  public static SubLObject decision_tree_canonicalize_comparator_string(final SubLObject comparator_string)
  {
    if( $str2$_.equal( comparator_string ) )
    {
      return $kw3$GT;
    }
    if( $str4$__.equal( comparator_string ) )
    {
      return $kw5$GE;
    }
    if( $str6$_.equal( comparator_string ) )
    {
      return $kw7$LT;
    }
    if( $str8$__.equal( comparator_string ) )
    {
      return $kw9$LE;
    }
    if( $str10$_.equal( comparator_string ) )
    {
      return $kw11$EQ;
    }
    if( $str12$__.equal( comparator_string ) )
    {
      return $kw13$NE;
    }
    return Errors.error( $str14$Unexpected_decision_tree_comparat, comparator_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 1880L)
  public static SubLObject decision_tree_compare(final SubLObject comparator, final SubLObject field_value, final SubLObject comparison_value)
  {
    if( comparator.eql( $kw3$GT ) )
    {
      return Numbers.numG( field_value, comparison_value );
    }
    if( comparator.eql( $kw5$GE ) )
    {
      return Numbers.numGE( field_value, comparison_value );
    }
    if( comparator.eql( $kw7$LT ) )
    {
      return Numbers.numL( field_value, comparison_value );
    }
    if( comparator.eql( $kw9$LE ) )
    {
      return Numbers.numLE( field_value, comparison_value );
    }
    if( comparator.eql( $kw11$EQ ) )
    {
      return Equality.equal( field_value, comparison_value );
    }
    if( comparator.eql( $kw13$NE ) )
    {
      return makeBoolean( NIL == decision_tree_compare( $kw11$EQ, field_value, comparison_value ) );
    }
    return Errors.error( $str15$Unexpected_decision_tree_comparat, comparator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 2431L)
  public static SubLObject decision_tree_operator_negate(final SubLObject operator)
  {
    if( operator.eql( $kw3$GT ) )
    {
      return $kw9$LE;
    }
    if( operator.eql( $kw5$GE ) )
    {
      return $kw7$LT;
    }
    if( operator.eql( $kw9$LE ) )
    {
      return $kw3$GT;
    }
    if( operator.eql( $kw7$LT ) )
    {
      return $kw5$GE;
    }
    if( operator.eql( $kw11$EQ ) )
    {
      return $kw13$NE;
    }
    if( operator.eql( $kw13$NE ) )
    {
      return $kw11$EQ;
    }
    return Errors.error( $str16$Dont_know_how_to_negate_decision_, operator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 3000L)
  public static SubLObject decision_tree_field_from_field_name(final SubLObject field_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.sublisp_boolean( $decision_tree_parser_transform_field_stringP$.getDynamicValue( thread ) ) )
    {
      return Symbols.make_keyword( Strings.string_upcase( field_string, UNPROVIDED, UNPROVIDED ) );
    }
    return field_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 3927L)
  public static SubLObject new_decision_tree_non_leaf_node(final SubLObject field_string, final SubLObject comparator_string, final SubLObject comparison_value_string, final SubLObject if_node,
      final SubLObject else_node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( field_string ) : field_string;
    assert NIL != decision_tree_comparator_string_p( comparator_string ) : comparator_string;
    assert NIL != Types.stringp( comparison_value_string ) : comparison_value_string;
    assert NIL != decision_tree_node_p( if_node ) : if_node;
    assert NIL != decision_tree_node_p( else_node ) : else_node;
    final SubLObject field = decision_tree_field_from_field_name( field_string );
    final SubLObject comparator = decision_tree_canonicalize_comparator_string( comparator_string );
    SubLObject comparison_value = decision_tree_string_to_number( comparison_value_string );
    if( NIL == comparison_value )
    {
      comparison_value = decision_tree_field_from_field_name( comparison_value_string );
    }
    if( NIL != $decision_tree_parser_output_infixP$.getDynamicValue( thread ) )
    {
      return ConsesLow.list( field, comparator, comparison_value, if_node, else_node );
    }
    return ConsesLow.list( comparator, field, comparison_value, if_node, else_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 4972L)
  public static SubLObject decision_tree_string_to_number(final SubLObject value_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject raw_result = string_utilities.string_to_number( value_string );
    if( NIL != $decision_tree_parse_numbers_as_integersP$.getDynamicValue( thread ) && raw_result.isDouble() )
    {
      thread.resetMultipleValues();
      final SubLObject integer = Numbers.truncate( raw_result, UNPROVIDED );
      final SubLObject scrap = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return integer;
    }
    return raw_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 5531L)
  public static SubLObject decision_tree_non_leaf_node_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, FIVE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 5696L)
  public static SubLObject new_decision_tree_leaf_node(final SubLObject return_value_string, SubLObject count_string)
  {
    if( count_string == UNPROVIDED )
    {
      count_string = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.sublisp_boolean( $decision_tree_parser_transform_field_stringP$.getDynamicValue( thread ) ) )
    {
      final SubLObject return_value = reader.read_from_string_ignoring_errors( return_value_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return ConsesLow.list( return_value );
    }
    if( NIL == list_utilities.sublisp_boolean( $decision_tree_parser_keep_countsP$.getDynamicValue( thread ) ) )
    {
      return ConsesLow.list( return_value_string );
    }
    final SubLObject pieces = string_utilities.string_tokenize( count_string, $list20, NIL, NIL, T, UNPROVIDED, UNPROVIDED );
    final SubLObject numbers = Mapping.mapcar( $sym21$READ_FROM_STRING_IGNORING_ERRORS, pieces );
    return ConsesLow.cons( return_value_string, numbers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 6327L)
  public static SubLObject decision_tree_leaf_node_p(final SubLObject v_object)
  {
    if( NIL != list_utilities.singletonP( v_object ) )
    {
      return T;
    }
    return makeBoolean( v_object.isCons() && v_object.first().isString() && NIL != list_utilities.list_of_type_p( $sym22$NUMBERP, v_object.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 6666L)
  public static SubLObject decision_tree_leaf_node_return_value(final SubLObject leaf_node)
  {
    assert NIL != decision_tree_leaf_node_p( leaf_node ) : leaf_node;
    return leaf_node.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 6811L)
  public static SubLObject decision_tree_node_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != decision_tree_non_leaf_node_p( v_object ) || NIL != decision_tree_leaf_node_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 6961L)
  public static SubLObject new_decision_tree_from_root_node(final SubLObject root_node)
  {
    assert NIL != decision_tree_node_p( root_node ) : root_node;
    return root_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 7097L)
  public static SubLObject decision_tree_p(final SubLObject v_object)
  {
    return decision_tree_node_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 7178L)
  public static SubLObject decision_tree_root_node(final SubLObject tree)
  {
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 7240L)
  public static SubLObject new_decision_tree_from_weka_j48_format(final SubLObject decision_tree_string)
  {
    SubLObject tree = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_input_stream( decision_tree_string, ZERO_INTEGER, NIL );
      final SubLObject root_node = new_decision_tree_node_from_weka_j48_format( stream, NIL );
      tree = new_decision_tree_from_root_node( root_node );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 7583L)
  public static SubLObject new_decision_tree_node_from_weka_j48_format(final SubLObject stream, final SubLObject else_depth)
  {
    final SubLObject line = string_utilities.network_read_line( stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject tokens = string_utilities.string_tokenize( line, ConsesLow.cons( Characters.CHAR_colon, string_utilities.whitespace_chars() ), NIL, NIL, T, UNPROVIDED, UNPROVIDED );
    SubLObject depth = ZERO_INTEGER;
    while ( NIL != Strings.string_equal( tokens.first(), $str24$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ))
    {
      depth = Numbers.add( depth, ONE_INTEGER );
      tokens = tokens.rest();
    }
    SubLObject field = tokens.first();
    SubLObject comparator_string;
    for( comparator_string = conses_high.second( tokens ), tokens = tokens.rest().rest(); NIL == decision_tree_comparator_string_p( comparator_string ); comparator_string = tokens.first(), tokens = tokens.rest() )
    {
      field = Sequences.cconcatenate( field, new SubLObject[] { $str25$_, comparator_string
      } );
    }
    SubLObject current;
    final SubLObject datum = current = tokens;
    SubLObject comparison_value_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
    comparison_value_string = current.first();
    current = current.rest();
    final SubLObject return_value = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list26 );
    current = current.rest();
    final SubLObject counts_string = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list26 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
      return NIL;
    }
    if( !depth.eql( else_depth ) )
    {
      final SubLObject if_node = ( NIL != return_value ) ? new_decision_tree_leaf_node( return_value, counts_string ) : new_decision_tree_node_from_weka_j48_format( stream, NIL );
      final SubLObject else_node = new_decision_tree_node_from_weka_j48_format( stream, depth );
      return new_decision_tree_non_leaf_node( field, comparator_string, comparison_value_string, if_node, else_node );
    }
    if( NIL != return_value )
    {
      return new_decision_tree_leaf_node( return_value, counts_string );
    }
    return new_decision_tree_node_from_weka_j48_format( stream, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 9609L)
  public static SubLObject evaluate_decision_tree(final SubLObject tree, final SubLObject plist)
  {
    assert NIL != decision_tree_p( tree ) : tree;
    return evaluate_decision_tree_node( decision_tree_root_node( tree ), plist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 9909L)
  public static SubLObject evaluate_decision_tree_node(final SubLObject node, final SubLObject plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != decision_tree_leaf_node_p( node ) )
    {
      return decision_tree_leaf_node_return_value( node );
    }
    SubLObject field = NIL;
    SubLObject comparator = NIL;
    SubLObject comparison_value = NIL;
    SubLObject if_node = NIL;
    SubLObject else_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( node, node, $list28 );
    field = node.first();
    SubLObject current = node.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, node, $list28 );
    comparator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, node, $list28 );
    comparison_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, node, $list28 );
    if_node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, node, $list28 );
    else_node = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( node, $list28 );
      return NIL;
    }
    final SubLObject field_value = decision_tree_retrieve_value( plist, field, $kw29$UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw29$UNPROVIDED == field_value )
    {
      Errors.error( $str30$A_value_for__s_must_be_provided_i, field, plist );
    }
    if( NIL != decision_tree_compare( comparator, field_value, comparison_value ) )
    {
      return evaluate_decision_tree_node( if_node, plist );
    }
    return evaluate_decision_tree_node( else_node, plist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 10579L)
  public static SubLObject decision_tree_retrieve_value(final SubLObject data, final SubLObject key, SubLObject unprovided_value, SubLObject decision_tree_value_lookup_function)
  {
    if( unprovided_value == UNPROVIDED )
    {
      unprovided_value = NIL;
    }
    if( decision_tree_value_lookup_function == UNPROVIDED )
    {
      decision_tree_value_lookup_function = $decision_tree_lookup_function$.getDynamicValue();
    }
    return Functions.funcall( decision_tree_value_lookup_function, data, key, unprovided_value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 10820L)
  public static SubLObject decision_tree_properties(final SubLObject tree)
  {
    final SubLObject properties_set = set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
    return set.set_element_list( decision_tree_properties_recursive( decision_tree_root_node( tree ), properties_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 11030L)
  public static SubLObject decision_tree_properties_recursive(final SubLObject node, final SubLObject v_set)
  {
    if( NIL != decision_tree_leaf_node_p( node ) )
    {
      return v_set;
    }
    SubLObject field = NIL;
    SubLObject comparator = NIL;
    SubLObject comparison_value = NIL;
    SubLObject if_node = NIL;
    SubLObject else_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( node, node, $list28 );
    field = node.first();
    SubLObject current = node.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, node, $list28 );
    comparator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, node, $list28 );
    comparison_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, node, $list28 );
    if_node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, node, $list28 );
    else_node = current.first();
    current = current.rest();
    if( NIL == current )
    {
      set.set_add( field, v_set );
      decision_tree_properties_recursive( if_node, v_set );
      return decision_tree_properties_recursive( else_node, v_set );
    }
    cdestructuring_bind.cdestructuring_bind_error( node, $list28 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 11411L)
  public static SubLObject visit_decision_tree_hierarchically(final SubLObject dec_tree, final SubLObject visitor)
  {
    assert NIL != hierarchical_visitor.hierarchical_visitor_p( visitor ) : visitor;
    hierarchical_visitor.hierarchical_visitor_begin_visit( visitor );
    final SubLObject stack = stacks.create_stack();
    stacks.stack_push( ConsesLow.list( $kw33$VISIT, NIL, dec_tree ), stack );
    while ( NIL == stacks.stack_empty_p( stack ))
    {
      final SubLObject current_task = stacks.stack_pop( stack );
      SubLObject current;
      final SubLObject datum = current = current_task;
      SubLObject task = NIL;
      SubLObject path = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
      task = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
      path = current.first();
      current = current.rest();
      final SubLObject node = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list34 );
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject pcase_var = task;
        if( pcase_var.eql( $kw33$VISIT ) )
        {
          hierarchical_visitor.show_hierarchical_visitor_path_begin( visitor, path );
          stacks.stack_push( ConsesLow.list( $kw35$FINISH, path ), stack );
          if( NIL != decision_tree_non_leaf_node_p( node ) )
          {
            SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = node;
            SubLObject elem1 = NIL;
            SubLObject elem2 = NIL;
            SubLObject elem3 = NIL;
            SubLObject if_clause = NIL;
            SubLObject else_clause = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list36 );
            elem1 = current_$2.first();
            current_$2 = current_$2.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list36 );
            elem2 = current_$2.first();
            current_$2 = current_$2.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list36 );
            elem3 = current_$2.first();
            current_$2 = current_$2.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list36 );
            if_clause = current_$2.first();
            current_$2 = current_$2.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list36 );
            else_clause = current_$2.first();
            current_$2 = current_$2.rest();
            if( NIL == current_$2 )
            {
              final SubLObject comparison = ConsesLow.list( elem1, elem2, elem3 );
              final SubLObject if_path = ConsesLow.cons( comparison, path );
              final SubLObject negated_comparison = visit_dectree_negate_comparison( comparison );
              final SubLObject else_path = ConsesLow.cons( negated_comparison, path );
              stacks.stack_push( ConsesLow.list( $kw33$VISIT, if_path, if_clause ), stack );
              stacks.stack_push( ConsesLow.list( $kw33$VISIT, else_path, else_clause ), stack );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$1, $list36 );
            }
          }
          else if( NIL != decision_tree_leaf_node_p( node ) )
          {
            hierarchical_visitor.show_hierarchical_visitor_node( visitor, node );
          }
          else
          {
            Errors.error( $str37$Cannot_determine_the_node_type_fo, node );
          }
        }
        else if( pcase_var.eql( $kw35$FINISH ) )
        {
          hierarchical_visitor.show_hierarchical_visitor_path_end( visitor, path );
        }
        else
        {
          Errors.error( $str38$Invalid_state_transition__A_in_vi, current_task );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
      }
    }
    hierarchical_visitor.hierarchical_visitor_end_visit( visitor );
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/decision-tree.lisp", position = 13409L)
  public static SubLObject visit_dectree_negate_comparison(final SubLObject comparison)
  {
    SubLObject negated_comparison = NIL;
    SubLObject cdolist_list_var = comparison;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != decision_tree_comparison_operator_p( v_term ) )
      {
        final SubLObject flipped_operator = decision_tree_operator_negate( v_term );
        negated_comparison = ConsesLow.cons( flipped_operator, negated_comparison );
      }
      else
      {
        negated_comparison = ConsesLow.cons( v_term, negated_comparison );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.nreverse( negated_comparison );
  }

  public static SubLObject declare_decision_tree_file()
  {
    SubLFiles.declareFunction( me, "decision_tree_comparison_operator_p", "DECISION-TREE-COMPARISON-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_comparator_string_p", "DECISION-TREE-COMPARATOR-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_canonicalize_comparator_string", "DECISION-TREE-CANONICALIZE-COMPARATOR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_compare", "DECISION-TREE-COMPARE", 3, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_operator_negate", "DECISION-TREE-OPERATOR-NEGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_field_from_field_name", "DECISION-TREE-FIELD-FROM-FIELD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "new_decision_tree_non_leaf_node", "NEW-DECISION-TREE-NON-LEAF-NODE", 5, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_string_to_number", "DECISION-TREE-STRING-TO-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_non_leaf_node_p", "DECISION-TREE-NON-LEAF-NODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_decision_tree_leaf_node", "NEW-DECISION-TREE-LEAF-NODE", 1, 1, false );
    SubLFiles.declareFunction( me, "decision_tree_leaf_node_p", "DECISION-TREE-LEAF-NODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_leaf_node_return_value", "DECISION-TREE-LEAF-NODE-RETURN-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_node_p", "DECISION-TREE-NODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_decision_tree_from_root_node", "NEW-DECISION-TREE-FROM-ROOT-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_p", "DECISION-TREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_root_node", "DECISION-TREE-ROOT-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_decision_tree_from_weka_j48_format", "NEW-DECISION-TREE-FROM-WEKA-J48-FORMAT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_decision_tree_node_from_weka_j48_format", "NEW-DECISION-TREE-NODE-FROM-WEKA-J48-FORMAT", 2, 0, false );
    SubLFiles.declareFunction( me, "evaluate_decision_tree", "EVALUATE-DECISION-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "evaluate_decision_tree_node", "EVALUATE-DECISION-TREE-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_retrieve_value", "DECISION-TREE-RETRIEVE-VALUE", 2, 2, false );
    SubLFiles.declareFunction( me, "decision_tree_properties", "DECISION-TREE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "decision_tree_properties_recursive", "DECISION-TREE-PROPERTIES-RECURSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_decision_tree_hierarchically", "VISIT-DECISION-TREE-HIERARCHICALLY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_dectree_negate_comparison", "VISIT-DECTREE-NEGATE-COMPARISON", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_decision_tree_file()
  {
    $decision_tree_parser_transform_field_stringP$ = SubLFiles.defparameter( "*DECISION-TREE-PARSER-TRANSFORM-FIELD-STRING?*", T );
    $decision_tree_parser_keep_countsP$ = SubLFiles.defparameter( "*DECISION-TREE-PARSER-KEEP-COUNTS?*", NIL );
    $decision_tree_parser_output_infixP$ = SubLFiles.defparameter( "*DECISION-TREE-PARSER-OUTPUT-INFIX?*", T );
    $decision_tree_parse_numbers_as_integersP$ = SubLFiles.defparameter( "*DECISION-TREE-PARSE-NUMBERS-AS-INTEGERS?*", NIL );
    $decision_tree_lookup_function$ = SubLFiles.defparameter( "*DECISION-TREE-LOOKUP-FUNCTION*", $sym31$GETF );
    return NIL;
  }

  public static SubLObject setup_decision_tree_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_decision_tree_file();
  }

  @Override
  public void initializeVariables()
  {
    init_decision_tree_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_decision_tree_file();
  }
  static
  {
    me = new decision_tree();
    $decision_tree_parser_transform_field_stringP$ = null;
    $decision_tree_parser_keep_countsP$ = null;
    $decision_tree_parser_output_infixP$ = null;
    $decision_tree_parse_numbers_as_integersP$ = null;
    $decision_tree_lookup_function$ = null;
    $list0 = ConsesLow.list( makeKeyword( "GT" ), makeKeyword( "LT" ), makeKeyword( "GE" ), makeKeyword( "LE" ), makeKeyword( "EQ" ), makeKeyword( "NE" ) );
    $list1 = ConsesLow.list( makeString( ">" ), makeString( ">=" ), makeString( "<" ), makeString( "<=" ), makeString( "=" ), makeString( "!=" ) );
    $str2$_ = makeString( ">" );
    $kw3$GT = makeKeyword( "GT" );
    $str4$__ = makeString( ">=" );
    $kw5$GE = makeKeyword( "GE" );
    $str6$_ = makeString( "<" );
    $kw7$LT = makeKeyword( "LT" );
    $str8$__ = makeString( "<=" );
    $kw9$LE = makeKeyword( "LE" );
    $str10$_ = makeString( "=" );
    $kw11$EQ = makeKeyword( "EQ" );
    $str12$__ = makeString( "!=" );
    $kw13$NE = makeKeyword( "NE" );
    $str14$Unexpected_decision_tree_comparat = makeString( "Unexpected decision tree comparator-string ~s" );
    $str15$Unexpected_decision_tree_comparat = makeString( "Unexpected decision tree comparator ~s" );
    $str16$Dont_know_how_to_negate_decision_ = makeString( "Dont know how to negate decision tree operator ~A." );
    $sym17$STRINGP = makeSymbol( "STRINGP" );
    $sym18$DECISION_TREE_COMPARATOR_STRING_P = makeSymbol( "DECISION-TREE-COMPARATOR-STRING-P" );
    $sym19$DECISION_TREE_NODE_P = makeSymbol( "DECISION-TREE-NODE-P" );
    $list20 = ConsesLow.list( Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_slash );
    $sym21$READ_FROM_STRING_IGNORING_ERRORS = makeSymbol( "READ-FROM-STRING-IGNORING-ERRORS" );
    $sym22$NUMBERP = makeSymbol( "NUMBERP" );
    $sym23$DECISION_TREE_LEAF_NODE_P = makeSymbol( "DECISION-TREE-LEAF-NODE-P" );
    $str24$_ = makeString( "|" );
    $str25$_ = makeString( " " );
    $list26 = ConsesLow.list( makeSymbol( "COMPARISON-VALUE-STRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "RETURN-VALUE" ), makeSymbol( "COUNTS-STRING" ) );
    $sym27$DECISION_TREE_P = makeSymbol( "DECISION-TREE-P" );
    $list28 = ConsesLow.list( makeSymbol( "FIELD" ), makeSymbol( "COMPARATOR" ), makeSymbol( "COMPARISON-VALUE" ), makeSymbol( "IF-NODE" ), makeSymbol( "ELSE-NODE" ) );
    $kw29$UNPROVIDED = makeKeyword( "UNPROVIDED" );
    $str30$A_value_for__s_must_be_provided_i = makeString( "A value for ~s must be provided in ~s" );
    $sym31$GETF = makeSymbol( "GETF" );
    $sym32$HIERARCHICAL_VISITOR_P = makeSymbol( "HIERARCHICAL-VISITOR-P" );
    $kw33$VISIT = makeKeyword( "VISIT" );
    $list34 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "PATH" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "NODE" ) );
    $kw35$FINISH = makeKeyword( "FINISH" );
    $list36 = ConsesLow.list( makeSymbol( "ELEM1" ), makeSymbol( "ELEM2" ), makeSymbol( "ELEM3" ), makeSymbol( "IF-CLAUSE" ), makeSymbol( "ELSE-CLAUSE" ) );
    $str37$Cannot_determine_the_node_type_fo = makeString( "Cannot determine the node-type for ~A." );
    $str38$Invalid_state_transition__A_in_vi = makeString( "Invalid state transition ~A in visiting of DECISION-TREE" );
  }
}
/*
 * 
 * Total time: 185 ms
 * 
 */