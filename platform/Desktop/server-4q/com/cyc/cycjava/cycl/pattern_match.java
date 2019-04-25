package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pattern_match
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pattern_match";
  public static final String myFingerPrint = "57f74d5232215c437181a29fccc023b458d7985e877d92c91fc579d24342fe10";
  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 1408L)
  private static SubLSymbol $pattern_matches_tree_bindings$;
  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 1565L)
  public static SubLSymbol $pattern_matches_tree_atomic_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 1847L)
  public static SubLSymbol $pattern_matches_tree_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 10015L)
  private static SubLSymbol $pattern_transform_tree_bindings$;
  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 10182L)
  public static SubLSymbol $pattern_transform_match_method$;
  private static final SubLSymbol $kw0$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym1$IGNORE_ERRORS_HANDLER;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw5$MATCH_METHOD;
  private static final SubLSymbol $sym6$TREE_MATCHES_PATTERN;
  private static final SubLSymbol $sym7$SUCCESS;
  private static final SubLSymbol $sym8$BINDINGS;
  private static final SubLSymbol $sym9$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym10$PWHEN;
  private static final SubLSymbol $sym11$CLET;
  private static final SubLSymbol $sym12$IGNORE;
  private static final SubLSymbol $sym13$ALIST_LOOKUP_WITHOUT_VALUES;
  private static final SubLSymbol $sym14$QUOTE;
  private static final SubLSymbol $kw15$ANYTHING;
  private static final SubLSymbol $kw16$NOTHING;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$BIND;
  private static final SubLSymbol $kw20$VALUE;
  private static final SubLSymbol $kw21$AND;
  private static final SubLSymbol $kw22$OR;
  private static final SubLSymbol $kw23$NOT;
  private static final SubLList $list24;
  private static final SubLSymbol $kw25$TEST;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$TREE_FIND;
  private static final SubLSymbol $kw31$TREE_FIND_IF;
  private static final SubLSymbol $kw32$QUOTE;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$PATTERN_MATCHES_TREE_RECURSIVE;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$KEYWORDP;
  private static final SubLSymbol $kw37$INPUT;
  private static final SubLSymbol $kw38$BINDINGS;
  private static final SubLList $list39;
  private static final SubLSymbol $kw40$TUPLE;
  private static final SubLSymbol $kw41$TEMPLATE;
  private static final SubLSymbol $kw42$CALL;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$WITH_TREE_PATTERN_BINDINGS;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$PATTERN_MATCHES_TREE;
  private static final SubLSymbol $kw52$OWNER;
  private static final SubLSymbol $kw53$CLASSES;
  private static final SubLSymbol $kw54$KB;
  private static final SubLSymbol $kw55$TINY;
  private static final SubLSymbol $kw56$WORKING_;
  private static final SubLList $list57;

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 2125L)
  public static SubLObject pattern_matches_tree(final SubLObject pattern, final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject success = NIL;
    SubLObject v_bindings = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw0$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym1$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject _prev_bind_0_$1 = $pattern_matches_tree_bindings$.currentBinding( thread );
          try
          {
            $pattern_matches_tree_bindings$.bind( NIL, thread );
            if( NIL != pattern_matches_tree_internal( pattern, tree ) )
            {
              success = T;
              v_bindings = Sequences.nreverse( $pattern_matches_tree_bindings$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            $pattern_matches_tree_bindings$.rebind( _prev_bind_0_$1, thread );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw0$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return subl_promotions.values2( success, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 2558L)
  public static SubLObject pattern_matches_tree_without_bindings(final SubLObject pattern, final SubLObject tree)
  {
    return pattern_matches_tree_internal( pattern, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 2890L)
  public static SubLObject tree_matches_pattern(final SubLObject tree, final SubLObject pattern)
  {
    return pattern_matches_tree( pattern, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 3026L)
  public static SubLObject with_tree_pattern_bindings(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_variables = NIL;
    SubLObject tree = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    v_variables = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    tree = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    pattern = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list2 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list2 );
      if( NIL == conses_high.member( current_$2, $list3, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw4$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
    }
    final SubLObject match_method_tail = cdestructuring_bind.property_list_member( $kw5$MATCH_METHOD, current );
    SubLObject match_method = ( NIL != match_method_tail ) ? conses_high.cadr( match_method_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == match_method )
    {
      match_method = $sym6$TREE_MATCHES_PATTERN;
    }
    final SubLObject success = $sym7$SUCCESS;
    final SubLObject v_bindings = $sym8$BINDINGS;
    final SubLObject variable_specs = pattern_bindings_variable_specs( v_variables, v_bindings );
    return ConsesLow.listS( $sym9$CMULTIPLE_VALUE_BIND, ConsesLow.list( success, v_bindings ), ConsesLow.list( match_method, tree, pattern ), ConsesLow.append( ( NIL != variable_specs ) ? ConsesLow.list( ConsesLow.list(
        $sym10$PWHEN, success, ConsesLow.listS( $sym11$CLET, variable_specs, ConsesLow.append( body, NIL ) ) ) )
        : ConsesLow.list( ConsesLow.list( $sym12$IGNORE, v_bindings ), ConsesLow.listS( $sym10$PWHEN, success, ConsesLow.append( body, NIL ) ) ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 3804L)
  public static SubLObject pattern_bindings_variable_specs(final SubLObject v_variables, final SubLObject bindings_var)
  {
    SubLObject variable_specs = NIL;
    SubLObject cdolist_list_var = v_variables;
    SubLObject variable = NIL;
    variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject variable_spec = ConsesLow.list( variable, ConsesLow.list( $sym13$ALIST_LOOKUP_WITHOUT_VALUES, bindings_var, ConsesLow.list( $sym14$QUOTE, variable ) ) );
      variable_specs = ConsesLow.cons( variable_spec, variable_specs );
      cdolist_list_var = cdolist_list_var.rest();
      variable = cdolist_list_var.first();
    }
    return variable_specs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 4107L)
  public static SubLObject pattern_matches_tree_internal(final SubLObject pattern, final SubLObject tree)
  {
    return pattern_matches_tree_recursive( pattern, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 4293L)
  public static SubLObject pattern_matches_tree_atomic_method_funcall(final SubLObject method, final SubLObject tree)
  {
    return Functions.funcall( method, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 4412L)
  public static SubLObject pattern_matches_tree_method_funcall(final SubLObject method, final SubLObject pattern, final SubLObject tree)
  {
    return Functions.funcall( method, pattern, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 4526L)
  public static SubLObject pattern_matches_tree_recursive(final SubLObject pattern, final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( pattern.isAtom() )
    {
      if( pattern.eql( $kw15$ANYTHING ) )
      {
        return T;
      }
      if( pattern.eql( $kw16$NOTHING ) )
      {
        return NIL;
      }
      SubLObject cdolist_list_var = $pattern_matches_tree_atomic_methods$.getDynamicValue( thread );
      SubLObject method_info = NIL;
      method_info = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = method_info;
        SubLObject method_operator = NIL;
        SubLObject method = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
        method_operator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
        method = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( method_operator.eql( pattern ) )
          {
            return pattern_matches_tree_atomic_method_funcall( method, tree );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        method_info = cdolist_list_var.first();
      }
      return Equality.equal( pattern, tree );
    }
    else
    {
      SubLObject pattern_operator = NIL;
      SubLObject pattern_args = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list18 );
      pattern_operator = pattern.first();
      final SubLObject current2 = pattern_args = pattern.rest();
      final SubLObject pcase_var = pattern_operator;
      if( pcase_var.eql( $kw19$BIND ) )
      {
        return pattern_matches_tree_bind( pattern, tree );
      }
      if( pcase_var.eql( $kw20$VALUE ) )
      {
        return pattern_matches_tree_value( pattern, tree );
      }
      if( pcase_var.eql( $kw21$AND ) )
      {
        return pattern_matches_tree_and( pattern, tree );
      }
      if( pcase_var.eql( $kw22$OR ) )
      {
        return pattern_matches_tree_or( pattern, tree );
      }
      if( pcase_var.eql( $kw23$NOT ) )
      {
        SubLObject current_$4;
        final SubLObject datum_$3 = current_$4 = pattern_args;
        SubLObject sub_pattern = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$4, datum_$3, $list24 );
        sub_pattern = current_$4.first();
        current_$4 = current_$4.rest();
        if( NIL == current_$4 )
        {
          return makeBoolean( NIL == pattern_matches_tree_recursive( sub_pattern, tree ) );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum_$3, $list24 );
      }
      else if( pcase_var.eql( $kw25$TEST ) )
      {
        final SubLObject extra_arg_count = Numbers.subtract( Sequences.length( pattern_args ), ONE_INTEGER );
        if( ZERO_INTEGER.eql( extra_arg_count ) )
        {
          SubLObject current_$5;
          final SubLObject datum_$4 = current_$5 = pattern_args;
          SubLObject test = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$5, datum_$4, $list26 );
          test = current_$5.first();
          current_$5 = current_$5.rest();
          if( NIL == current_$5 )
          {
            return list_utilities.sublisp_boolean( pattern_matches_tree_test_funcall( test, tree ) );
          }
          cdestructuring_bind.cdestructuring_bind_error( datum_$4, $list26 );
        }
        else if( ONE_INTEGER.eql( extra_arg_count ) )
        {
          SubLObject current_$6;
          final SubLObject datum_$5 = current_$6 = pattern_args;
          SubLObject test = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$6, datum_$5, $list27 );
          test = current_$6.first();
          current_$6 = current_$6.rest();
          final SubLObject arg2 = current_$6.isCons() ? current_$6.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current_$6, datum_$5, $list27 );
          current_$6 = current_$6.rest();
          if( NIL == current_$6 )
          {
            return list_utilities.sublisp_boolean( pattern_matches_tree_test_funcall_2( test, tree, arg2 ) );
          }
          cdestructuring_bind.cdestructuring_bind_error( datum_$5, $list27 );
        }
        else if( TWO_INTEGER.eql( extra_arg_count ) )
        {
          SubLObject current_$7;
          final SubLObject datum_$6 = current_$7 = pattern_args;
          SubLObject test = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list28 );
          test = current_$7.first();
          current_$7 = current_$7.rest();
          final SubLObject arg2 = current_$7.isCons() ? current_$7.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current_$7, datum_$6, $list28 );
          current_$7 = current_$7.rest();
          final SubLObject arg3 = current_$7.isCons() ? current_$7.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current_$7, datum_$6, $list28 );
          current_$7 = current_$7.rest();
          if( NIL == current_$7 )
          {
            return list_utilities.sublisp_boolean( pattern_matches_tree_test_funcall_3( test, tree, arg2, arg3 ) );
          }
          cdestructuring_bind.cdestructuring_bind_error( datum_$6, $list28 );
        }
        else if( THREE_INTEGER.eql( extra_arg_count ) )
        {
          SubLObject current_$8;
          final SubLObject datum_$7 = current_$8 = pattern_args;
          SubLObject test = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list29 );
          test = current_$8.first();
          current_$8 = current_$8.rest();
          final SubLObject arg2 = current_$8.isCons() ? current_$8.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current_$8, datum_$7, $list29 );
          current_$8 = current_$8.rest();
          final SubLObject arg3 = current_$8.isCons() ? current_$8.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current_$8, datum_$7, $list29 );
          current_$8 = current_$8.rest();
          final SubLObject arg4 = current_$8.isCons() ? current_$8.first() : NIL;
          cdestructuring_bind.destructuring_bind_must_listp( current_$8, datum_$7, $list29 );
          current_$8 = current_$8.rest();
          if( NIL == current_$8 )
          {
            return list_utilities.sublisp_boolean( pattern_matches_tree_test_funcall_4( test, tree, arg2, arg3, arg4 ) );
          }
          cdestructuring_bind.cdestructuring_bind_error( datum_$7, $list29 );
        }
      }
      else if( pcase_var.eql( $kw30$TREE_FIND ) )
      {
        SubLObject current_$9;
        final SubLObject datum_$8 = current_$9 = pattern_args;
        SubLObject sub_pattern = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$9, datum_$8, $list24 );
        sub_pattern = current_$9.first();
        current_$9 = current_$9.rest();
        if( NIL == current_$9 )
        {
          return pattern_matches_tree_tree_find( sub_pattern, tree );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum_$8, $list24 );
      }
      else if( pcase_var.eql( $kw31$TREE_FIND_IF ) )
      {
        SubLObject current_$10;
        final SubLObject datum_$9 = current_$10 = pattern_args;
        SubLObject sub_pattern = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$10, datum_$9, $list24 );
        sub_pattern = current_$10.first();
        current_$10 = current_$10.rest();
        if( NIL == current_$10 )
        {
          return pattern_matches_tree_tree_find_if( sub_pattern, tree );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum_$9, $list24 );
      }
      else
      {
        if( !pcase_var.eql( $kw32$QUOTE ) )
        {
          SubLObject cdolist_list_var2 = $pattern_matches_tree_methods$.getDynamicValue( thread );
          SubLObject method_info2 = NIL;
          method_info2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            SubLObject current_$11;
            final SubLObject datum_$10 = current_$11 = method_info2;
            SubLObject method_operator2 = NIL;
            SubLObject method2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$11, datum_$10, $list17 );
            method_operator2 = current_$11.first();
            current_$11 = current_$11.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$11, datum_$10, $list17 );
            method2 = current_$11.first();
            current_$11 = current_$11.rest();
            if( NIL == current_$11 )
            {
              if( method_operator2.eql( pattern_operator ) )
              {
                return pattern_matches_tree_method_funcall( method2, pattern, tree );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$10, $list17 );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            method_info2 = cdolist_list_var2.first();
          }
          return pattern_matches_tree_cons( pattern, tree );
        }
        SubLObject current_$12;
        final SubLObject datum_$11 = current_$12 = pattern_args;
        SubLObject quoted_object = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$11, $list33 );
        quoted_object = current_$12.first();
        current_$12 = current_$12.rest();
        if( NIL == current_$12 )
        {
          return Equality.equal( quoted_object, tree );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum_$11, $list33 );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 7086L)
  public static SubLObject pattern_matches_tree_bind(final SubLObject pattern, final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject variable = conses_high.second( pattern );
    $pattern_matches_tree_bindings$.setDynamicValue( list_utilities.alist_enter_without_values( $pattern_matches_tree_bindings$.getDynamicValue( thread ), variable, tree, Symbols.symbol_function( EQL ) ), thread );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 7353L)
  public static SubLObject pattern_matches_tree_value(final SubLObject pattern, final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject variable = conses_high.second( pattern );
    thread.resetMultipleValues();
    final SubLObject value = list_utilities.alist_lookup( $pattern_matches_tree_bindings$.getDynamicValue( thread ), variable, Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject presentP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != presentP )
    {
      return pattern_matches_tree_recursive( value, tree );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 7633L)
  public static SubLObject pattern_matches_tree_and(final SubLObject pattern, final SubLObject tree)
  {
    SubLObject cdolist_list_var = pattern.rest();
    SubLObject sub_pattern = NIL;
    sub_pattern = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == pattern_matches_tree_recursive( sub_pattern, tree ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      sub_pattern = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 7822L)
  public static SubLObject pattern_matches_tree_or(final SubLObject pattern, final SubLObject tree)
  {
    SubLObject cdolist_list_var = pattern.rest();
    SubLObject sub_pattern = NIL;
    sub_pattern = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != pattern_matches_tree_recursive( sub_pattern, tree ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      sub_pattern = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8008L)
  public static SubLObject pattern_matches_tree_test_funcall(final SubLObject test, final SubLObject tree)
  {
    if( NIL != eval_in_api.possibly_cyc_api_function_spec_p( test ) )
    {
      return eval_in_api.possibly_cyc_api_funcall_1( test, tree );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8171L)
  public static SubLObject pattern_matches_tree_test_funcall_2(final SubLObject test, final SubLObject tree, final SubLObject arg2)
  {
    if( NIL != eval_in_api.possibly_cyc_api_function_spec_p( test ) )
    {
      return eval_in_api.possibly_cyc_api_funcall_2( test, tree, arg2 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8346L)
  public static SubLObject pattern_matches_tree_test_funcall_3(final SubLObject test, final SubLObject tree, final SubLObject arg2, final SubLObject arg3)
  {
    if( NIL != eval_in_api.possibly_cyc_api_function_spec_p( test ) )
    {
      return eval_in_api.possibly_cyc_api_funcall_3( test, tree, arg2, arg3 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8531L)
  public static SubLObject pattern_matches_tree_test_funcall_4(final SubLObject test, final SubLObject tree, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4)
  {
    if( NIL != eval_in_api.possibly_cyc_api_function_spec_p( test ) )
    {
      return eval_in_api.possibly_cyc_api_funcall_4( test, tree, arg2, arg3, arg4 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8726L)
  public static SubLObject pattern_matches_tree_tree_find(final SubLObject sub_pattern, final SubLObject tree)
  {
    return list_utilities.tree_find( sub_pattern, tree, Symbols.symbol_function( $sym34$PATTERN_MATCHES_TREE_RECURSIVE ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8864L)
  public static SubLObject pattern_matches_tree_tree_find_if(final SubLObject sub_pattern, final SubLObject tree)
  {
    return list_utilities.tree_find_if( sub_pattern, tree, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 8975L)
  public static SubLObject pattern_matches_tree_cons(final SubLObject pattern, final SubLObject tree)
  {
    if( tree.isAtom() )
    {
      return NIL;
    }
    SubLObject pattern_operator = NIL;
    SubLObject pattern_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list18 );
    pattern_operator = pattern.first();
    final SubLObject current = pattern_args = pattern.rest();
    SubLObject tree_operator = NIL;
    SubLObject tree_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tree, tree, $list35 );
    tree_operator = tree.first();
    final SubLObject current_$22 = tree_args = tree.rest();
    if( NIL == pattern_matches_tree_recursive( pattern_operator, tree_operator ) )
    {
      return NIL;
    }
    if( NIL != possibly_match_pattern_p( pattern_args ) )
    {
      return pattern_matches_tree_recursive( pattern_args, tree_args );
    }
    SubLObject rest_pattern_args;
    SubLObject rest_tree_args;
    SubLObject next_pattern_arg;
    SubLObject next_tree_arg;
    for( rest_pattern_args = NIL, rest_tree_args = NIL, rest_pattern_args = pattern_args, rest_tree_args = tree_args; !rest_pattern_args.isAtom() && !rest_tree_args.isAtom(); rest_pattern_args = rest_pattern_args
        .rest(), rest_tree_args = rest_tree_args.rest() )
    {
      next_pattern_arg = rest_pattern_args.first();
      next_tree_arg = rest_tree_args.first();
      if( NIL == pattern_matches_tree_recursive( next_pattern_arg, next_tree_arg ) )
      {
        return NIL;
      }
    }
    return pattern_matches_tree_recursive( rest_pattern_args, rest_tree_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 9888L)
  public static SubLObject possibly_match_pattern_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isList() && NIL != cycl_utilities.expression_find_if( Symbols.symbol_function( $sym36$KEYWORDP ), v_object, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 10242L)
  public static SubLObject pattern_transform_tree(final SubLObject pattern, final SubLObject tree, SubLObject v_bindings)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject new_bindings = NIL;
    final SubLObject _prev_bind_0 = $pattern_transform_tree_bindings$.currentBinding( thread );
    try
    {
      $pattern_transform_tree_bindings$.bind( v_bindings, thread );
      v_answer = pattern_transform_tree_internal( pattern, tree );
      new_bindings = $pattern_transform_tree_bindings$.getDynamicValue( thread );
    }
    finally
    {
      $pattern_transform_tree_bindings$.rebind( _prev_bind_0, thread );
    }
    return subl_promotions.values2( v_answer, new_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 10682L)
  public static SubLObject tree_pattern_transform(final SubLObject tree, final SubLObject pattern, SubLObject v_bindings)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    return pattern_transform_tree( pattern, tree, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 10918L)
  public static SubLObject pattern_transform_tree_internal(final SubLObject pattern, final SubLObject tree)
  {
    return pattern_transform_tree_recursive( pattern, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 11112L)
  public static SubLObject pattern_transform_tree_recursive(final SubLObject pattern, final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !pattern.isAtom() )
    {
      SubLObject pattern_operator = NIL;
      SubLObject pattern_args = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list18 );
      pattern_operator = pattern.first();
      final SubLObject current = pattern_args = pattern.rest();
      final SubLObject pcase_var = pattern_operator;
      if( pcase_var.eql( $kw20$VALUE ) )
      {
        SubLObject current_$24;
        final SubLObject datum_$23 = current_$24 = pattern_args;
        SubLObject variable = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$24, datum_$23, $list39 );
        variable = current_$24.first();
        current_$24 = current_$24.rest();
        if( NIL == current_$24 )
        {
          return list_utilities.alist_lookup_without_values( $pattern_transform_tree_bindings$.getDynamicValue( thread ), variable, Symbols.symbol_function( EQL ), NIL );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum_$23, $list39 );
      }
      else
      {
        if( pcase_var.eql( $kw40$TUPLE ) )
        {
          return pattern_transform_tuple( pattern, tree );
        }
        if( pcase_var.eql( $kw41$TEMPLATE ) )
        {
          return pattern_transform_template( pattern, tree );
        }
        if( pcase_var.eql( $kw42$CALL ) )
        {
          return pattern_transform_call( pattern, tree );
        }
        if( !pcase_var.eql( $kw32$QUOTE ) )
        {
          return pattern_transform_cons( pattern, tree );
        }
        SubLObject current_$25;
        final SubLObject datum_$24 = current_$25 = pattern_args;
        SubLObject quoted_object = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$25, datum_$24, $list33 );
        quoted_object = current_$25.first();
        current_$25 = current_$25.rest();
        if( NIL == current_$25 )
        {
          return quoted_object;
        }
        cdestructuring_bind.cdestructuring_bind_error( datum_$24, $list33 );
      }
      return NIL;
    }
    if( pattern.eql( $kw37$INPUT ) )
    {
      return tree;
    }
    if( pattern.eql( $kw38$BINDINGS ) )
    {
      return $pattern_transform_tree_bindings$.getDynamicValue( thread );
    }
    return pattern;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 12111L)
  public static SubLObject pattern_transform_tuple(final SubLObject pattern, final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject v_variables = NIL;
    SubLObject subpattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list43 );
    operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list43 );
    v_variables = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list43 );
    subpattern = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( pattern, $list43 );
      return NIL;
    }
    if( !tree.isList() || !v_variables.isList() || NIL == list_utilities.lengthE( tree, Sequences.length( v_variables ), UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject variable = NIL;
    SubLObject variable_$27 = NIL;
    SubLObject subtree = NIL;
    SubLObject subtree_$28 = NIL;
    variable = v_variables;
    variable_$27 = variable.first();
    subtree = tree;
    subtree_$28 = subtree.first();
    while ( NIL != subtree || NIL != variable)
    {
      $pattern_transform_tree_bindings$.setDynamicValue( list_utilities.alist_enter_without_values( $pattern_transform_tree_bindings$.getDynamicValue( thread ), variable_$27, subtree_$28, Symbols.symbol_function(
          EQL ) ), thread );
      variable = variable.rest();
      variable_$27 = variable.first();
      subtree = subtree.rest();
      subtree_$28 = subtree.first();
    }
    return pattern_transform_tree_recursive( subpattern, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 12749L)
  public static SubLObject pattern_transform_template(final SubLObject pattern, final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operator = NIL;
    SubLObject match_pattern = NIL;
    SubLObject subpattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list44 );
    operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list44 );
    match_pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list44 );
    subpattern = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( pattern, $list44 );
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject success = ( NIL != $pattern_transform_match_method$.getDynamicValue( thread ) ) ? Functions.funcall( $pattern_transform_match_method$.getDynamicValue( thread ), match_pattern, tree )
        : pattern_matches_tree( match_pattern, tree );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == success )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$30;
      final SubLObject datum_$29 = current_$30 = binding;
      SubLObject variable = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$30, datum_$29, $list45 );
      variable = current_$30.first();
      current_$30 = ( value = current_$30.rest() );
      $pattern_transform_tree_bindings$.setDynamicValue( list_utilities.alist_enter_without_values( $pattern_transform_tree_bindings$.getDynamicValue( thread ), variable, value, Symbols.symbol_function( EQL ) ),
          thread );
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return pattern_transform_tree_recursive( subpattern, tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 13432L)
  public static SubLObject pattern_transform_call(final SubLObject pattern, final SubLObject tree)
  {
    SubLObject operator = NIL;
    SubLObject method = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list46 );
    operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list46 );
    method = current.first();
    SubLObject method_args;
    current = ( method_args = current.rest() );
    final SubLObject arg_count = Sequences.length( method_args );
    if( !arg_count.numLE( FOUR_INTEGER ) || NIL == Symbols.fboundp( method ) )
    {
      method_args = conses_high.copy_list( method_args );
      SubLObject rest_args;
      SubLObject next_arg;
      for( rest_args = NIL, rest_args = method_args; !rest_args.isAtom(); rest_args = rest_args.rest() )
      {
        next_arg = rest_args.first();
        ConsesLow.rplaca( rest_args, pattern_transform_tree_recursive( next_arg, tree ) );
      }
      return eval_in_api.possibly_cyc_api_apply( method, method_args );
    }
    SubLObject current_$32;
    final SubLObject datum_$31 = current_$32 = method_args;
    SubLObject arg1 = current_$32.isCons() ? current_$32.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current_$32, datum_$31, $list47 );
    current_$32 = current_$32.rest();
    SubLObject arg2 = current_$32.isCons() ? current_$32.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current_$32, datum_$31, $list47 );
    current_$32 = current_$32.rest();
    SubLObject arg3 = current_$32.isCons() ? current_$32.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current_$32, datum_$31, $list47 );
    current_$32 = current_$32.rest();
    SubLObject arg4 = current_$32.isCons() ? current_$32.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current_$32, datum_$31, $list47 );
    current_$32 = current_$32.rest();
    if( NIL != current_$32 )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum_$31, $list47 );
      return NIL;
    }
    if( ZERO_INTEGER.numL( arg_count ) )
    {
      arg1 = pattern_transform_tree_recursive( arg1, tree );
      if( ONE_INTEGER.numL( arg_count ) )
      {
        arg2 = pattern_transform_tree_recursive( arg2, tree );
        if( TWO_INTEGER.numL( arg_count ) )
        {
          arg3 = pattern_transform_tree_recursive( arg3, tree );
          if( THREE_INTEGER.numL( arg_count ) )
          {
            arg4 = pattern_transform_tree_recursive( arg4, tree );
          }
        }
      }
    }
    final SubLObject pcase_var = arg_count;
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return Functions.funcall( method );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return Functions.funcall( method, arg1 );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return Functions.funcall( method, arg1, arg2 );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return Functions.funcall( method, arg1, arg2, arg3 );
    }
    return Functions.funcall( method, arg1, arg2, arg3, arg4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 14728L)
  public static SubLObject pattern_transform_cons(final SubLObject pattern, final SubLObject tree)
  {
    final SubLObject v_answer = conses_high.copy_list( pattern );
    SubLObject rest_answer;
    for( rest_answer = NIL, rest_answer = v_answer; !rest_answer.rest().isAtom(); rest_answer = rest_answer.rest() )
    {
      ConsesLow.rplaca( rest_answer, pattern_transform_tree_recursive( rest_answer.first(), tree ) );
    }
    ConsesLow.rplaca( rest_answer, pattern_transform_tree_recursive( rest_answer.first(), tree ) );
    if( NIL != rest_answer.rest() )
    {
      ConsesLow.rplacd( rest_answer, pattern_transform_tree_recursive( rest_answer.rest(), tree ) );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pattern-match.lisp", position = 15197L)
  public static SubLObject with_formula_pattern_bindings(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_variables = NIL;
    SubLObject formula = NIL;
    SubLObject pattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    v_variables = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    formula = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    pattern = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym49$WITH_TREE_PATTERN_BINDINGS, ConsesLow.listS( v_variables, formula, pattern, $list50 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list48 );
    return NIL;
  }

  public static SubLObject declare_pattern_match_file()
  {
    SubLFiles.declareFunction( me, "pattern_matches_tree", "PATTERN-MATCHES-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_without_bindings", "PATTERN-MATCHES-TREE-WITHOUT-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "tree_matches_pattern", "TREE-MATCHES-PATTERN", 2, 0, false );
    SubLFiles.declareMacro( me, "with_tree_pattern_bindings", "WITH-TREE-PATTERN-BINDINGS" );
    SubLFiles.declareFunction( me, "pattern_bindings_variable_specs", "PATTERN-BINDINGS-VARIABLE-SPECS", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_internal", "PATTERN-MATCHES-TREE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_atomic_method_funcall", "PATTERN-MATCHES-TREE-ATOMIC-METHOD-FUNCALL", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_method_funcall", "PATTERN-MATCHES-TREE-METHOD-FUNCALL", 3, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_recursive", "PATTERN-MATCHES-TREE-RECURSIVE", 2, 0, false );
    new $pattern_matches_tree_recursive$BinaryFunction();
    SubLFiles.declareFunction( me, "pattern_matches_tree_bind", "PATTERN-MATCHES-TREE-BIND", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_value", "PATTERN-MATCHES-TREE-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_and", "PATTERN-MATCHES-TREE-AND", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_or", "PATTERN-MATCHES-TREE-OR", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_test_funcall", "PATTERN-MATCHES-TREE-TEST-FUNCALL", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_test_funcall_2", "PATTERN-MATCHES-TREE-TEST-FUNCALL-2", 3, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_test_funcall_3", "PATTERN-MATCHES-TREE-TEST-FUNCALL-3", 4, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_test_funcall_4", "PATTERN-MATCHES-TREE-TEST-FUNCALL-4", 5, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_tree_find", "PATTERN-MATCHES-TREE-TREE-FIND", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_tree_find_if", "PATTERN-MATCHES-TREE-TREE-FIND-IF", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_tree_cons", "PATTERN-MATCHES-TREE-CONS", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_match_pattern_p", "POSSIBLY-MATCH-PATTERN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pattern_transform_tree", "PATTERN-TRANSFORM-TREE", 2, 1, false );
    SubLFiles.declareFunction( me, "tree_pattern_transform", "TREE-PATTERN-TRANSFORM", 2, 1, false );
    SubLFiles.declareFunction( me, "pattern_transform_tree_internal", "PATTERN-TRANSFORM-TREE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_transform_tree_recursive", "PATTERN-TRANSFORM-TREE-RECURSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_transform_tuple", "PATTERN-TRANSFORM-TUPLE", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_transform_template", "PATTERN-TRANSFORM-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_transform_call", "PATTERN-TRANSFORM-CALL", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_transform_cons", "PATTERN-TRANSFORM-CONS", 2, 0, false );
    SubLFiles.declareMacro( me, "with_formula_pattern_bindings", "WITH-FORMULA-PATTERN-BINDINGS" );
    return NIL;
  }

  public static SubLObject init_pattern_match_file()
  {
    $pattern_matches_tree_bindings$ = SubLFiles.defparameter( "*PATTERN-MATCHES-TREE-BINDINGS*", NIL );
    $pattern_matches_tree_atomic_methods$ = SubLFiles.defparameter( "*PATTERN-MATCHES-TREE-ATOMIC-METHODS*", NIL );
    $pattern_matches_tree_methods$ = SubLFiles.defparameter( "*PATTERN-MATCHES-TREE-METHODS*", NIL );
    $pattern_transform_tree_bindings$ = SubLFiles.defparameter( "*PATTERN-TRANSFORM-TREE-BINDINGS*", NIL );
    $pattern_transform_match_method$ = SubLFiles.defparameter( "*PATTERN-TRANSFORM-MATCH-METHOD*", NIL );
    return NIL;
  }

  public static SubLObject setup_pattern_match_file()
  {
    generic_testing.define_test_case_table_int( $sym51$PATTERN_MATCHES_TREE, ConsesLow.list( new SubLObject[] { $kw25$TEST, Symbols.symbol_function( EQUAL ), $kw52$OWNER, NIL, $kw53$CLASSES, NIL, $kw54$KB, $kw55$TINY,
      $kw56$WORKING_, T
    } ), $list57 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pattern_match_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pattern_match_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pattern_match_file();
  }
  static
  {
    me = new pattern_match();
    $pattern_matches_tree_bindings$ = null;
    $pattern_matches_tree_atomic_methods$ = null;
    $pattern_matches_tree_methods$ = null;
    $pattern_transform_tree_bindings$ = null;
    $pattern_transform_match_method$ = null;
    $kw0$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym1$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "VARIABLES" ), makeSymbol( "TREE" ), makeSymbol( "PATTERN" ), makeSymbol( "&KEY" ), makeSymbol( "MATCH-METHOD" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list3 = ConsesLow.list( makeKeyword( "MATCH-METHOD" ) );
    $kw4$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw5$MATCH_METHOD = makeKeyword( "MATCH-METHOD" );
    $sym6$TREE_MATCHES_PATTERN = makeSymbol( "TREE-MATCHES-PATTERN" );
    $sym7$SUCCESS = makeUninternedSymbol( "SUCCESS" );
    $sym8$BINDINGS = makeUninternedSymbol( "BINDINGS" );
    $sym9$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym10$PWHEN = makeSymbol( "PWHEN" );
    $sym11$CLET = makeSymbol( "CLET" );
    $sym12$IGNORE = makeSymbol( "IGNORE" );
    $sym13$ALIST_LOOKUP_WITHOUT_VALUES = makeSymbol( "ALIST-LOOKUP-WITHOUT-VALUES" );
    $sym14$QUOTE = makeSymbol( "QUOTE" );
    $kw15$ANYTHING = makeKeyword( "ANYTHING" );
    $kw16$NOTHING = makeKeyword( "NOTHING" );
    $list17 = ConsesLow.list( makeSymbol( "METHOD-OPERATOR" ), makeSymbol( "METHOD" ) );
    $list18 = ConsesLow.cons( makeSymbol( "PATTERN-OPERATOR" ), makeSymbol( "PATTERN-ARGS" ) );
    $kw19$BIND = makeKeyword( "BIND" );
    $kw20$VALUE = makeKeyword( "VALUE" );
    $kw21$AND = makeKeyword( "AND" );
    $kw22$OR = makeKeyword( "OR" );
    $kw23$NOT = makeKeyword( "NOT" );
    $list24 = ConsesLow.list( makeSymbol( "SUB-PATTERN" ) );
    $kw25$TEST = makeKeyword( "TEST" );
    $list26 = ConsesLow.list( makeSymbol( "TEST" ) );
    $list27 = ConsesLow.list( makeSymbol( "TEST" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ARG2" ) );
    $list28 = ConsesLow.list( makeSymbol( "TEST" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ARG2" ), makeSymbol( "ARG3" ) );
    $list29 = ConsesLow.list( makeSymbol( "TEST" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ARG2" ), makeSymbol( "ARG3" ), makeSymbol( "ARG4" ) );
    $kw30$TREE_FIND = makeKeyword( "TREE-FIND" );
    $kw31$TREE_FIND_IF = makeKeyword( "TREE-FIND-IF" );
    $kw32$QUOTE = makeKeyword( "QUOTE" );
    $list33 = ConsesLow.list( makeSymbol( "QUOTED-OBJECT" ) );
    $sym34$PATTERN_MATCHES_TREE_RECURSIVE = makeSymbol( "PATTERN-MATCHES-TREE-RECURSIVE" );
    $list35 = ConsesLow.cons( makeSymbol( "TREE-OPERATOR" ), makeSymbol( "TREE-ARGS" ) );
    $sym36$KEYWORDP = makeSymbol( "KEYWORDP" );
    $kw37$INPUT = makeKeyword( "INPUT" );
    $kw38$BINDINGS = makeKeyword( "BINDINGS" );
    $list39 = ConsesLow.list( makeSymbol( "VARIABLE" ) );
    $kw40$TUPLE = makeKeyword( "TUPLE" );
    $kw41$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw42$CALL = makeKeyword( "CALL" );
    $list43 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "VARIABLES" ), makeSymbol( "SUBPATTERN" ) );
    $list44 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "MATCH-PATTERN" ), makeSymbol( "SUBPATTERN" ) );
    $list45 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "VALUE" ) );
    $list46 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "METHOD" ), makeSymbol( "&REST" ), makeSymbol( "METHOD-ARGS" ) );
    $list47 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "ARG3" ), makeSymbol( "ARG4" ) );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "VARIABLES" ), makeSymbol( "FORMULA" ), makeSymbol( "PATTERN" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym49$WITH_TREE_PATTERN_BINDINGS = makeSymbol( "WITH-TREE-PATTERN-BINDINGS" );
    $list50 = ConsesLow.list( makeKeyword( "MATCH-METHOD" ), makeSymbol( "FORMULA-MATCHES-PATTERN" ) );
    $sym51$PATTERN_MATCHES_TREE = makeSymbol( "PATTERN-MATCHES-TREE" );
    $kw52$OWNER = makeKeyword( "OWNER" );
    $kw53$CLASSES = makeKeyword( "CLASSES" );
    $kw54$KB = makeKeyword( "KB" );
    $kw55$TINY = makeKeyword( "TINY" );
    $kw56$WORKING_ = makeKeyword( "WORKING?" );
    $list57 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons( makeKeyword( "DIFFERENT" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "BIND" ),
        makeSymbol( "ASENT" ) ) ), ConsesLow.list( makeKeyword( "DIFFERENT" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ), T, ConsesLow.list( ConsesLow.list( makeSymbol( "ASENT" ), makeKeyword( "DIFFERENT" ),
            ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "DIFFERENT" ), makeKeyword( "ANYTHING" ), makeKeyword(
                "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ARG" ) ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ) ), ConsesLow.list( makeKeyword( "DIFFERENT" ), ONE_INTEGER,
                    TWO_INTEGER, THREE_INTEGER ) ), T, ConsesLow.list( ConsesLow.cons( makeSymbol( "ARG" ), THREE_INTEGER ), ConsesLow.list( makeSymbol( "ASENT" ), makeKeyword( "DIFFERENT" ), ONE_INTEGER, TWO_INTEGER,
                        THREE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "DIFFERENT" ), makeKeyword( "BIND" ), makeSymbol( "ARGS" ) ), ConsesLow
                            .list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ) ), ConsesLow.list( makeKeyword( "DIFFERENT" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ), T, ConsesLow.list( ConsesLow.list( makeSymbol(
                                "ARGS" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ), ConsesLow.list( makeSymbol( "ASENT" ), makeKeyword( "DIFFERENT" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ) ), ConsesLow.list(
                                    ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "DIFFERENT" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ARG1" ) ), ConsesLow.list(
                                        makeKeyword( "BIND" ), makeSymbol( "ARG2" ) ), makeKeyword( "BIND" ), makeSymbol( "ARGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ) ), ConsesLow.list(
                                            makeKeyword( "DIFFERENT" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER ) ), T, ConsesLow.list( ConsesLow.cons( makeSymbol( "ARG1" ), ONE_INTEGER ),
                                                ConsesLow.cons( makeSymbol( "ARG2" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "ARGS" ), THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER ), ConsesLow.list( makeSymbol(
                                                    "ASENT" ), makeKeyword( "DIFFERENT" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER ) ) ) );
  }

  public static final class $pattern_matches_tree_recursive$BinaryFunction
      extends
        BinaryFunction
  {
    public $pattern_matches_tree_recursive$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PATTERN-MATCHES-TREE-RECURSIVE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return pattern_matches_tree_recursive( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 248 ms
 * 
 */