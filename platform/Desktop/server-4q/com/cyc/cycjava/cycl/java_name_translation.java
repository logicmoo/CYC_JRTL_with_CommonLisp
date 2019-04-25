package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class java_name_translation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.java_name_translation";
  public static final String myFingerPrint = "0ff41c2c6ccff129135f314a8ab46b0125ed11d9d6535409d2d605b0adfeb23c";
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 1132L)
  private static SubLSymbol $java_backend_reserved_words$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 2580L)
  private static SubLSymbol $java_backend_defined_function_class_data$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 13507L)
  private static SubLSymbol $java_backend_defined_function_name_exceptions$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 14821L)
  private static SubLSymbol $java_backend_undefined_function_name_data$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 32495L)
  private static SubLSymbol $java_backend_function_arity_version_table$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 34433L)
  private static SubLSymbol $java_backend_undefined_arity_function_name_data$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 40620L)
  private static SubLSymbol $java_backend_function_boolean_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 41921L)
  private static SubLSymbol $java_backend_function_boolean_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 43132L)
  private static SubLSymbol $java_backend_function_to_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 43479L)
  private static SubLSymbol $java_backend_function_to_method_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 44152L)
  private static SubLSymbol $java_backend_function_class_table$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 44438L)
  private static SubLSymbol $java_backend_function_name_table$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 48680L)
  private static SubLSymbol $java_backend_function_arglist_table$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 50128L)
  private static SubLSymbol $java_backend_predefined_constant_table$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 55282L)
  private static SubLSymbol $java_backend_defined_global_name_data$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 60768L)
  private static SubLSymbol $java_backend_undefined_global_name_data$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 63625L)
  private static SubLSymbol $java_backend_global_class_table$;
  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 63902L)
  private static SubLSymbol $java_backend_global_name_table$;
  private static final SubLList $list0;
  private static final SubLObject $list1;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLObject $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLObject $list7;
  private static final SubLSymbol $sym8$_DTB;
  private static final SubLSymbol $sym9$_BTD;
  private static final SubLSymbol $sym10$___;
  private static final SubLSymbol $sym11$NULL;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$_METHOD;
  private static final SubLSymbol $sym14$_NOT____;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$UNINITIALIZED;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLInteger $int21$500;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$JAVA_BACKEND_COMPUTED_FUNCTION_NAME;
  private static final SubLString $str25$f;
  private static final SubLString $str26$sublisp_;
  private static final SubLString $str27$f_;
  private static final SubLSymbol $kw28$UNSPECIFIED;
  private static final SubLObject $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$JAVA_BACKEND_COMPUTED_GLOBAL_NAME;
  private static final SubLString $str34$_g;
  private static final SubLString $str35$_;

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 2351L)
  public static SubLObject java_backend_reserved_word_p(final SubLObject v_object)
  {
    if( v_object.isString() )
    {
      SubLObject cdolist_list_var = $java_backend_reserved_words$.getGlobalValue();
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != Strings.stringE( v_object, word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 13145L)
  public static SubLObject java_backend_defined_function_p(final SubLObject function)
  {
    SubLObject cdolist_list_var = $java_backend_defined_function_class_data$.getGlobalValue();
    SubLObject datum = NIL;
    datum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum_$1 = current = datum;
      SubLObject class_name = NIL;
      SubLObject symbols = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum_$1, $list2 );
      class_name = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum_$1, $list2 );
      symbols = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$2 = symbols;
        SubLObject symbol = NIL;
        symbol = cdolist_list_var_$2.first();
        while ( NIL != cdolist_list_var_$2)
        {
          if( function.eql( symbol ) )
          {
            return T;
          }
          cdolist_list_var_$2 = cdolist_list_var_$2.rest();
          symbol = cdolist_list_var_$2.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$1, $list2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      datum = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 14653L)
  public static SubLObject java_backend_defined_function_name_exception_lookup(final SubLObject function)
  {
    return conses_high.second( conses_high.assoc( function, $java_backend_defined_function_name_exceptions$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 31868L)
  public static SubLObject java_backend_function_call_arity_transform(final SubLObject function_call_form)
  {
    if( function_call_form.isCons() )
    {
      SubLObject operator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( function_call_form, function_call_form, $list5 );
      operator = function_call_form.first();
      final SubLObject args;
      final SubLObject current = args = function_call_form.rest();
      final SubLObject call_arity = Sequences.length( args );
      final SubLObject call_arity_operator = java_backend_function_call_arity_lookup( operator, call_arity );
      if( NIL != call_arity_operator )
      {
        return reader.bq_cons( call_arity_operator, ConsesLow.append( args, NIL ) );
      }
    }
    return function_call_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 39408L)
  public static SubLObject java_backend_function_call_arity_lookup(final SubLObject operator, final SubLObject call_arity)
  {
    final SubLObject operator_arity_versions = list_utilities.alist_lookup_without_values( $java_backend_function_arity_version_table$.getGlobalValue(), operator, Symbols.symbol_function( EQ ), UNPROVIDED );
    if( NIL != operator_arity_versions )
    {
      return list_utilities.alist_lookup_without_values( operator_arity_versions, call_arity, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 39748L)
  public static SubLObject java_backend_simplify_Xdtb_transform(final SubLObject dtb_form)
  {
    if( dtb_form.isCons() && $sym8$_DTB == dtb_form.first() )
    {
      final SubLObject subform = conses_high.second( dtb_form );
      if( subform.isCons() )
      {
        SubLObject current;
        final SubLObject datum = current = subform;
        SubLObject operator = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
        operator = current.first();
        final SubLObject args;
        current = ( args = current.rest() );
        if( operator == $sym9$_BTD )
        {
          return args.first();
        }
        if( operator == EQ )
        {
          return reader.bq_cons( $sym10$___, ConsesLow.append( args, NIL ) );
        }
        if( operator == $sym11$NULL )
        {
          return ConsesLow.list( $sym10$___, $list12, args.first() );
        }
        final SubLObject boolean_method = java_backend_boolean_method_lookup( operator );
        if( NIL != boolean_method )
        {
          return ConsesLow.listS( $sym13$_METHOD, args.first(), boolean_method, ConsesLow.append( args.rest(), NIL ) );
        }
      }
      return ConsesLow.list( $sym14$_NOT____, $list12, subform );
    }
    return dtb_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 42003L)
  public static SubLObject initialize_java_backend_function_boolean_hash()
  {
    final SubLObject table = Hashtables.make_hash_table( Sequences.length( $java_backend_function_boolean_method_table$.getGlobalValue() ), Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = $java_backend_function_boolean_method_table$.getGlobalValue();
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject function = NIL;
      SubLObject boolean_method = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
      function = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
      boolean_method = current.first();
      current = current.rest();
      if( NIL == current )
      {
        Hashtables.sethash( function, table, boolean_method );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    $java_backend_function_boolean_hash$.setGlobalValue( table );
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 42459L)
  public static SubLObject java_backend_boolean_method_lookup(final SubLObject operator)
  {
    return Hashtables.gethash_without_values( operator, $java_backend_function_boolean_hash$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 42606L)
  public static SubLObject java_backend_function_to_method_transform(final SubLObject expression)
  {
    if( expression.isCons() )
    {
      SubLObject operator = NIL;
      SubLObject args = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( expression, expression, $list18 );
      operator = expression.first();
      final SubLObject current = args = expression.rest();
      final SubLObject method = java_backend_function_to_method_lookup( operator );
      if( NIL != method )
      {
        return ConsesLow.listS( $sym13$_METHOD, args.first(), method, ConsesLow.append( args.rest(), NIL ) );
      }
    }
    return expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 43563L)
  public static SubLObject initialize_java_backend_function_to_method_hash()
  {
    final SubLObject table = Hashtables.make_hash_table( Sequences.length( $java_backend_function_to_method_table$.getGlobalValue() ), Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = $java_backend_function_to_method_table$.getGlobalValue();
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject function = NIL;
      SubLObject method = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
      function = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
      method = current.first();
      current = current.rest();
      if( NIL == current )
      {
        Hashtables.sethash( function, table, method );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    $java_backend_function_to_method_hash$.setGlobalValue( table );
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 43999L)
  public static SubLObject java_backend_function_to_method_lookup(final SubLObject operator)
  {
    return Hashtables.gethash_without_values( operator, $java_backend_function_to_method_hash$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 44518L)
  public static SubLObject java_backend_predefined_function_p(final SubLObject function)
  {
    return list_utilities.sublisp_boolean( Hashtables.gethash_without_values( function, $java_backend_function_name_table$.getGlobalValue(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 44745L)
  public static SubLObject java_backend_function_class_lookup(final SubLObject function)
  {
    return Hashtables.gethash_without_values( function, $java_backend_function_class_table$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 44952L)
  public static SubLObject java_backend_function_name_lookup(final SubLObject function)
  {
    return Hashtables.gethash_without_values( function, $java_backend_function_name_table$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 45156L)
  public static SubLObject initialize_java_backend_function_tables()
  {
    $java_backend_function_name_table$.setGlobalValue( Hashtables.make_hash_table( $int21$500, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    $java_backend_function_class_table$.setGlobalValue( Hashtables.make_hash_table( $int21$500, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    SubLObject cdolist_list_var = $java_backend_defined_function_class_data$.getGlobalValue();
    SubLObject class_spec = NIL;
    class_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = class_spec;
      SubLObject class_name = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
      class_name = current.first();
      current = current.rest();
      final SubLObject symbols = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list22 );
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$3 = symbols;
        SubLObject symbol = NIL;
        symbol = cdolist_list_var_$3.first();
        while ( NIL != cdolist_list_var_$3)
        {
          final SubLObject java_backend_name = java_backend_compute_defined_function_name( symbol );
          Hashtables.sethash( symbol, $java_backend_function_name_table$.getGlobalValue(), java_backend_name );
          Hashtables.sethash( symbol, $java_backend_function_class_table$.getGlobalValue(), class_name );
          cdolist_list_var_$3 = cdolist_list_var_$3.rest();
          symbol = cdolist_list_var_$3.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      class_spec = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2;
    final SubLObject data = cdolist_list_var2 = ConsesLow.nconc( conses_high.copy_list( $java_backend_undefined_function_name_data$.getGlobalValue() ), conses_high.copy_list(
        $java_backend_undefined_arity_function_name_data$.getGlobalValue() ) );
    SubLObject item = NIL;
    item = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject current2;
      final SubLObject datum2 = current2 = item;
      SubLObject symbol2 = NIL;
      SubLObject class_name2 = NIL;
      SubLObject java_backend_name2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list23 );
      symbol2 = current2.first();
      current2 = current2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list23 );
      class_name2 = current2.first();
      current2 = current2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list23 );
      java_backend_name2 = current2.first();
      current2 = current2.rest();
      final SubLObject arglist = current2.isCons() ? current2.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current2, datum2, $list23 );
      current2 = current2.rest();
      if( NIL == current2 )
      {
        Hashtables.sethash( symbol2, $java_backend_function_name_table$.getGlobalValue(), java_backend_name2 );
        Hashtables.sethash( symbol2, $java_backend_function_class_table$.getGlobalValue(), class_name2 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum2, $list23 );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      item = cdolist_list_var2.first();
    }
    return Hashtables.hash_table_count( $java_backend_function_name_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 46253L)
  public static SubLObject java_backend_compute_defined_function_name(final SubLObject function)
  {
    final SubLObject exception_name = java_backend_defined_function_name_exception_lookup( function );
    if( NIL != exception_name )
    {
      return exception_name;
    }
    return java_backend_computed_function_name( function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 46525L)
  public static SubLObject java_backend_computed_function_name_internal(final SubLObject function)
  {
    final SubLObject secure_method_id = java_backend_secure_method_id( function );
    if( NIL != secure_method_id )
    {
      return Sequences.cconcatenate( $str25$f, format_nil.format_nil_s_no_copy( secure_method_id ) );
    }
    final SubLObject name_basis = java_backend_symbol_name_basis( function );
    if( NIL != java_backend_reserved_word_p( name_basis ) )
    {
      return Sequences.cconcatenate( $str26$sublisp_, format_nil.format_nil_a_no_copy( name_basis ) );
    }
    if( NIL != Characters.digit_char_p( Strings.sublisp_char( name_basis, ZERO_INTEGER ), UNPROVIDED ) )
    {
      return Sequences.cconcatenate( $str27$f_, format_nil.format_nil_a_no_copy( name_basis ) );
    }
    return name_basis;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 46525L)
  public static SubLObject java_backend_computed_function_name(final SubLObject function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return java_backend_computed_function_name_internal( function );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym24$JAVA_BACKEND_COMPUTED_FUNCTION_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym24$JAVA_BACKEND_COMPUTED_FUNCTION_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym24$JAVA_BACKEND_COMPUTED_FUNCTION_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, function, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( java_backend_computed_function_name_internal( function ) ) );
      memoization_state.caching_state_put( caching_state, function, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 47064L)
  public static SubLObject java_backend_secure_method_id(final SubLObject function)
  {
    if( control_vars.$cyc_package$.getGlobalValue().eql( Symbols.symbol_package( function ) ) && NIL == java_backend_predefined_function_p( function ) )
    {
      final SubLObject sys_tran = system_translation.current_system_translation();
      if( NIL != sys_tran )
      {
        return system_translation.sys_tran_secure_method_id( sys_tran, function );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 47366L)
  public static SubLObject java_backend_symbol_name_basis(final SubLObject variable)
  {
    final SubLObject name = Symbols.symbol_name( variable );
    return java_backend_convert_identifier_name( name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 47523L)
  public static SubLObject java_backend_convert_identifier_name(final SubLObject name)
  {
    return c_backend.c_backed_convert_identifier_name( name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 47678L)
  public static SubLObject java_backend_function_class(final SubLObject function)
  {
    final SubLObject predefined_name = java_backend_function_class_lookup( function );
    if( NIL != predefined_name )
    {
      return predefined_name;
    }
    final SubLObject module = xref_database.xref_method_defining_module( function );
    if( NIL != module )
    {
      final SubLObject class_name = java_backend.java_backend_module_class_name( module );
      return class_name;
    }
    return $kw28$UNSPECIFIED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 48385L)
  public static SubLObject java_backend_function_name(final SubLObject function)
  {
    final SubLObject predefined_name = java_backend_function_name_lookup( function );
    if( NIL != predefined_name )
    {
      return predefined_name;
    }
    return java_backend_computed_function_name( function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 48966L)
  public static SubLObject java_backend_function_arglist_lookup(final SubLObject function)
  {
    return Hashtables.gethash_without_values( function, $java_backend_function_arglist_table$.getGlobalValue(), $kw28$UNSPECIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 49124L)
  public static SubLObject initialize_java_backend_function_arglist_table()
  {
    final SubLObject table = Hashtables.make_hash_table( $int21$500, Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = $java_backend_defined_function_class_data$.getGlobalValue();
    SubLObject class_spec = NIL;
    class_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = class_spec;
      SubLObject class_name = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
      class_name = current.first();
      current = current.rest();
      final SubLObject symbols = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list22 );
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$4 = symbols;
        SubLObject symbol = NIL;
        symbol = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL != subl_promotions.function_symbol_p( symbol ) )
          {
            final SubLObject arglist = subl_promotions.function_symbol_arglist( symbol );
            Hashtables.sethash( symbol, table, arglist );
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          symbol = cdolist_list_var_$4.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      class_spec = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2;
    final SubLObject data = cdolist_list_var2 = ConsesLow.nconc( conses_high.copy_list( $java_backend_undefined_function_name_data$.getGlobalValue() ), conses_high.copy_list(
        $java_backend_undefined_arity_function_name_data$.getGlobalValue() ) );
    SubLObject item = NIL;
    item = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject current2;
      final SubLObject datum2 = current2 = item;
      SubLObject symbol2 = NIL;
      SubLObject class_name2 = NIL;
      SubLObject java_backend_name = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list23 );
      symbol2 = current2.first();
      current2 = current2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list23 );
      class_name2 = current2.first();
      current2 = current2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list23 );
      java_backend_name = current2.first();
      current2 = current2.rest();
      final SubLObject arglist = current2.isCons() ? current2.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current2, datum2, $list23 );
      current2 = current2.rest();
      if( NIL == current2 )
      {
        Hashtables.sethash( symbol2, table, arglist );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum2, $list23 );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      item = cdolist_list_var2.first();
    }
    $java_backend_function_arglist_table$.setGlobalValue( table );
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 55119L)
  public static SubLObject java_backend_predefined_constant_name(final SubLObject constant)
  {
    return list_utilities.alist_lookup_without_values( $java_backend_predefined_constant_table$.getGlobalValue(), constant, Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 63464L)
  public static SubLObject java_backend_undefined_variable_binding_type_lookup(final SubLObject variable)
  {
    return conses_high.fourth( conses_high.assoc( variable, $java_backend_undefined_global_name_data$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 63980L)
  public static SubLObject java_backend_predefined_global_p(final SubLObject global)
  {
    return list_utilities.sublisp_boolean( Hashtables.gethash_without_values( global, $java_backend_global_name_table$.getGlobalValue(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 64194L)
  public static SubLObject java_backend_global_class_lookup(final SubLObject global)
  {
    return Hashtables.gethash_without_values( global, $java_backend_global_class_table$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 64331L)
  public static SubLObject java_backend_global_name_lookup(final SubLObject global)
  {
    return Hashtables.gethash_without_values( global, $java_backend_global_name_table$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 64466L)
  public static SubLObject initialize_java_backend_global_tables()
  {
    final SubLObject data = ConsesLow.nconc( conses_high.copy_list( $java_backend_defined_global_name_data$.getGlobalValue() ), conses_high.copy_list( $java_backend_undefined_global_name_data$.getGlobalValue() ) );
    final SubLObject class_table = Hashtables.make_hash_table( Sequences.length( data ), Symbols.symbol_function( EQ ), UNPROVIDED );
    final SubLObject name_table = Hashtables.make_hash_table( Sequences.length( data ), Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = data;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = item;
      SubLObject symbol = NIL;
      SubLObject class_name = NIL;
      SubLObject java_backend_name = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
      symbol = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
      class_name = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
      java_backend_name = current.first();
      current = current.rest();
      final SubLObject binding_type = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list32 );
      current = current.rest();
      if( NIL == current )
      {
        Hashtables.sethash( symbol, class_table, class_name );
        Hashtables.sethash( symbol, name_table, java_backend_name );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list32 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    $java_backend_global_class_table$.setGlobalValue( class_table );
    $java_backend_global_name_table$.setGlobalValue( name_table );
    return Hashtables.hash_table_count( name_table );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 65201L)
  public static SubLObject java_backend_global_class(final SubLObject global)
  {
    final SubLObject predefined_name = java_backend_global_class_lookup( global );
    if( NIL != predefined_name )
    {
      return predefined_name;
    }
    final SubLObject module = xref_database.xref_global_defining_module( global );
    if( NIL != module )
    {
      final SubLObject class_name = java_backend.java_backend_module_class_name( module );
      return class_name;
    }
    return $kw28$UNSPECIFIED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 65892L)
  public static SubLObject java_backend_global_name(final SubLObject global)
  {
    final SubLObject predefined_name = java_backend_global_name_lookup( global );
    if( NIL != predefined_name )
    {
      return predefined_name;
    }
    return java_backend_computed_global_name( global );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 66173L)
  public static SubLObject java_backend_computed_global_name_internal(final SubLObject global)
  {
    final SubLObject secure_global_id = java_backend_secure_global_id( global );
    if( NIL != secure_global_id )
    {
      return Sequences.cconcatenate( $str34$_g, new SubLObject[] { format_nil.format_nil_s_no_copy( secure_global_id ), $str35$_
      } );
    }
    final SubLObject name_basis = java_backend_symbol_name_basis( global );
    return Sequences.cconcatenate( $str35$_, new SubLObject[] { format_nil.format_nil_a_no_copy( name_basis ), $str35$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 66173L)
  public static SubLObject java_backend_computed_global_name(final SubLObject global)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return java_backend_computed_global_name_internal( global );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym33$JAVA_BACKEND_COMPUTED_GLOBAL_NAME, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym33$JAVA_BACKEND_COMPUTED_GLOBAL_NAME, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym33$JAVA_BACKEND_COMPUTED_GLOBAL_NAME, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, global, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( java_backend_computed_global_name_internal( global ) ) );
      memoization_state.caching_state_put( caching_state, global, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-name-translation.lisp", position = 66534L)
  public static SubLObject java_backend_secure_global_id(final SubLObject global)
  {
    if( control_vars.$cyc_package$.getGlobalValue().eql( Symbols.symbol_package( global ) ) && NIL == java_backend_predefined_global_p( global ) )
    {
      final SubLObject sys_tran = system_translation.current_system_translation();
      if( NIL != sys_tran )
      {
        return system_translation.sys_tran_secure_global_id( sys_tran, global );
      }
    }
    return NIL;
  }

  public static SubLObject declare_java_name_translation_file()
  {
    SubLFiles.declareFunction( me, "java_backend_reserved_word_p", "JAVA-BACKEND-RESERVED-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_defined_function_p", "JAVA-BACKEND-DEFINED-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_defined_function_name_exception_lookup", "JAVA-BACKEND-DEFINED-FUNCTION-NAME-EXCEPTION-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_function_call_arity_transform", "JAVA-BACKEND-FUNCTION-CALL-ARITY-TRANSFORM", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_function_call_arity_lookup", "JAVA-BACKEND-FUNCTION-CALL-ARITY-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "java_backend_simplify_Xdtb_transform", "JAVA-BACKEND-SIMPLIFY-%DTB-TRANSFORM", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_java_backend_function_boolean_hash", "INITIALIZE-JAVA-BACKEND-FUNCTION-BOOLEAN-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "java_backend_boolean_method_lookup", "JAVA-BACKEND-BOOLEAN-METHOD-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_function_to_method_transform", "JAVA-BACKEND-FUNCTION-TO-METHOD-TRANSFORM", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_java_backend_function_to_method_hash", "INITIALIZE-JAVA-BACKEND-FUNCTION-TO-METHOD-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "java_backend_function_to_method_lookup", "JAVA-BACKEND-FUNCTION-TO-METHOD-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_predefined_function_p", "JAVA-BACKEND-PREDEFINED-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_function_class_lookup", "JAVA-BACKEND-FUNCTION-CLASS-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_function_name_lookup", "JAVA-BACKEND-FUNCTION-NAME-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_java_backend_function_tables", "INITIALIZE-JAVA-BACKEND-FUNCTION-TABLES", 0, 0, false );
    SubLFiles.declareFunction( me, "java_backend_compute_defined_function_name", "JAVA-BACKEND-COMPUTE-DEFINED-FUNCTION-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_computed_function_name_internal", "JAVA-BACKEND-COMPUTED-FUNCTION-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_computed_function_name", "JAVA-BACKEND-COMPUTED-FUNCTION-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_secure_method_id", "JAVA-BACKEND-SECURE-METHOD-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_symbol_name_basis", "JAVA-BACKEND-SYMBOL-NAME-BASIS", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_convert_identifier_name", "JAVA-BACKEND-CONVERT-IDENTIFIER-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_function_class", "JAVA-BACKEND-FUNCTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_function_name", "JAVA-BACKEND-FUNCTION-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_function_arglist_lookup", "JAVA-BACKEND-FUNCTION-ARGLIST-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_java_backend_function_arglist_table", "INITIALIZE-JAVA-BACKEND-FUNCTION-ARGLIST-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "java_backend_predefined_constant_name", "JAVA-BACKEND-PREDEFINED-CONSTANT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_undefined_variable_binding_type_lookup", "JAVA-BACKEND-UNDEFINED-VARIABLE-BINDING-TYPE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_predefined_global_p", "JAVA-BACKEND-PREDEFINED-GLOBAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_global_class_lookup", "JAVA-BACKEND-GLOBAL-CLASS-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_global_name_lookup", "JAVA-BACKEND-GLOBAL-NAME-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_java_backend_global_tables", "INITIALIZE-JAVA-BACKEND-GLOBAL-TABLES", 0, 0, false );
    SubLFiles.declareFunction( me, "java_backend_global_class", "JAVA-BACKEND-GLOBAL-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_global_name", "JAVA-BACKEND-GLOBAL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_computed_global_name_internal", "JAVA-BACKEND-COMPUTED-GLOBAL-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_computed_global_name", "JAVA-BACKEND-COMPUTED-GLOBAL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "java_backend_secure_global_id", "JAVA-BACKEND-SECURE-GLOBAL-ID", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_java_name_translation_file()
  {
    $java_backend_reserved_words$ = SubLFiles.deflexical( "*JAVA-BACKEND-RESERVED-WORDS*", $list0 );
    $java_backend_defined_function_class_data$ = SubLFiles.deflexical( "*JAVA-BACKEND-DEFINED-FUNCTION-CLASS-DATA*", $list1 );
    $java_backend_defined_function_name_exceptions$ = SubLFiles.deflexical( "*JAVA-BACKEND-DEFINED-FUNCTION-NAME-EXCEPTIONS*", $list3 );
    $java_backend_undefined_function_name_data$ = SubLFiles.deflexical( "*JAVA-BACKEND-UNDEFINED-FUNCTION-NAME-DATA*", $list4 );
    $java_backend_function_arity_version_table$ = SubLFiles.deflexical( "*JAVA-BACKEND-FUNCTION-ARITY-VERSION-TABLE*", $list6 );
    $java_backend_undefined_arity_function_name_data$ = SubLFiles.deflexical( "*JAVA-BACKEND-UNDEFINED-ARITY-FUNCTION-NAME-DATA*", $list7 );
    $java_backend_function_boolean_method_table$ = SubLFiles.deflexical( "*JAVA-BACKEND-FUNCTION-BOOLEAN-METHOD-TABLE*", $list15 );
    $java_backend_function_boolean_hash$ = SubLFiles.deflexical( "*JAVA-BACKEND-FUNCTION-BOOLEAN-HASH*", $kw16$UNINITIALIZED );
    $java_backend_function_to_method_table$ = SubLFiles.deflexical( "*JAVA-BACKEND-FUNCTION-TO-METHOD-TABLE*", $list19 );
    $java_backend_function_to_method_hash$ = SubLFiles.deflexical( "*JAVA-BACKEND-FUNCTION-TO-METHOD-HASH*", $kw16$UNINITIALIZED );
    $java_backend_function_class_table$ = SubLFiles.deflexical( "*JAVA-BACKEND-FUNCTION-CLASS-TABLE*", $kw16$UNINITIALIZED );
    $java_backend_function_name_table$ = SubLFiles.deflexical( "*JAVA-BACKEND-FUNCTION-NAME-TABLE*", $kw16$UNINITIALIZED );
    $java_backend_function_arglist_table$ = SubLFiles.deflexical( "*JAVA-BACKEND-FUNCTION-ARGLIST-TABLE*", $kw16$UNINITIALIZED );
    $java_backend_predefined_constant_table$ = SubLFiles.deflexical( "*JAVA-BACKEND-PREDEFINED-CONSTANT-TABLE*", $list29 );
    $java_backend_defined_global_name_data$ = SubLFiles.deflexical( "*JAVA-BACKEND-DEFINED-GLOBAL-NAME-DATA*", $list30 );
    $java_backend_undefined_global_name_data$ = SubLFiles.deflexical( "*JAVA-BACKEND-UNDEFINED-GLOBAL-NAME-DATA*", $list31 );
    $java_backend_global_class_table$ = SubLFiles.deflexical( "*JAVA-BACKEND-GLOBAL-CLASS-TABLE*", $kw16$UNINITIALIZED );
    $java_backend_global_name_table$ = SubLFiles.deflexical( "*JAVA-BACKEND-GLOBAL-NAME-TABLE*", $kw16$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_java_name_translation_file()
  {
    initialize_java_backend_function_boolean_hash();
    initialize_java_backend_function_to_method_hash();
    memoization_state.note_memoized_function( $sym24$JAVA_BACKEND_COMPUTED_FUNCTION_NAME );
    initialize_java_backend_function_tables();
    initialize_java_backend_function_arglist_table();
    initialize_java_backend_global_tables();
    memoization_state.note_memoized_function( $sym33$JAVA_BACKEND_COMPUTED_GLOBAL_NAME );
    return NIL;
  }

  private static SubLObject _constant_1_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "IMPORTED" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "LIST" ), makeSymbol( "LIST*" ) ) ), ConsesLow.list( makeString( "Alien" ),
        ConsesLow.list( makeSymbol( "ALIEN-NULL-PTR?", "SUBLISP" ) ) ), ConsesLow.list( makeString( "Characters" ), ConsesLow.list( new SubLObject[]
        { makeSymbol( "ALPHA-CHAR-P" ), makeSymbol( "ALPHANUMERICP" ), makeSymbol( "BOTH-CASE-P" ), makeSymbol( "CHAR-CODE" ), makeSymbol( "CHAR-DOWNCASE" ), makeSymbol( "CHAR-EQUAL" ), makeSymbol( "CHAR-GREATERP" ),
          makeSymbol( "CHAR-LESSP" ), makeSymbol( "CHAR-NOT-EQUAL" ), makeSymbol( "CHAR-NOT-GREATERP" ), makeSymbol( "CHAR-NOT-LESSP" ), makeSymbol( "CHAR-UPCASE" ), makeSymbol( "CHAR/=" ), makeSymbol( "CHAR<" ),
          makeSymbol( "CHAR<=" ), makeSymbol( "CHAR=" ), makeSymbol( "CHAR>" ), makeSymbol( "CHAR>=" ), makeSymbol( "CODE-CHAR" ), makeSymbol( "DIGIT-CHAR" ), makeSymbol( "DIGIT-CHAR-P" ), makeSymbol( "LOWER-CASE-P" ),
          makeSymbol( "UPPER-CASE-P" ), makeSymbol( "NAME-CHARACTER", "SUBLISP" )
        } ) ), ConsesLow.list( makeString( "ConsesLow" ), ConsesLow.list( new SubLObject[] { makeSymbol( "APPEND" ), makeSymbol( "CAR" ), makeSymbol( "CDR" ), makeSymbol( "MAKE-LIST" ), makeSymbol( "NCONC" ), makeSymbol(
            "NTH" ), makeSymbol( "RPLACA" ), makeSymbol( "RPLACD" ), makeSymbol( "SET-NTH" )
        } ) ), ConsesLow.list( makeString( "Dynamic" ), ConsesLow.list( makeSymbol( "THROW" ) ) ), ConsesLow.list( makeString( "Environment" ), ConsesLow.list( new SubLObject[] { makeSymbol( "GET-MACHINE-NAME" ),
          makeSymbol( "GET-NETWORK-NAME" ), makeSymbol( "GET-PROCESS-ID" ), makeSymbol( "GET-USER-NAME" ), makeSymbol( "LISP-IMPLEMENTATION-TYPE" ), makeSymbol( "LISP-IMPLEMENTATION-VERSION" ), makeSymbol(
              "LONG-SITE-NAME" ), makeSymbol( "MACHINE-INSTANCE" ), makeSymbol( "MACHINE-TYPE" ), makeSymbol( "MACHINE-VERSION" ), makeSymbol( "SHORT-SITE-NAME" ), makeSymbol( "SOFTWARE-TYPE" ), makeSymbol(
                  "SOFTWARE-VERSION" )
        } ) ), ConsesLow.list( makeString( "Equality" ), ConsesLow.list( EQ, EQL, EQUAL, EQUALP, IDENTITY ) ), ConsesLow.list( makeString( "Errors" ), ConsesLow.list( makeSymbol( "BREAK" ), makeSymbol( "CERROR" ),
            makeSymbol( "DEBUG" ), makeSymbol( "ERROR" ), makeSymbol( "WARN" ) ) ), ConsesLow.list( makeString( "Eval" ), ConsesLow.list( makeSymbol( "CONSTANTP" ), makeSymbol( "EVAL" ), makeSymbol(
                "FUNCTION-INFORMATION" ), makeSymbol( "LOAD" ), makeSymbol( "MACROEXPAND" ), makeSymbol( "MACROEXPAND-1" ), makeSymbol( "VARIABLE-INFORMATION" ) ) ), ConsesLow.list( makeString( "Filesys" ), ConsesLow
                    .list( new SubLObject[]
                    { makeSymbol( "CONSTRUCT-FILENAME" ), makeSymbol( "DELETE-DIRECTORY" ), makeSymbol( "DELETE-FILE" ), makeSymbol( "DIRECTORY" ), makeSymbol( "DIRECTORY-P" ), makeSymbol( "FILE-AUTHOR" ), makeSymbol(
                        "FILE-WRITE-DATE" ), makeSymbol( "MAKE-DIRECTORY" ), makeSymbol( "PROBE-FILE" ), makeSymbol( "RENAME-FILE" ), makeSymbol( "COPY-FILE" )
        } ) ), ConsesLow.list( makeString( "Functions" ), ConsesLow.list( makeSymbol( "APPLY" ), makeSymbol( "FUNCALL" ) ) ), ConsesLow.list( makeString( "Guids" ), ConsesLow.list( new SubLObject[] { makeSymbol(
            "ASSEMBLE-FIXNUMS-TO-GUID" ), makeSymbol( "CRACK-DATE-RELATIVE-GUID" ), makeSymbol( "DATE-RELATIVE-GUID-P" ), makeSymbol( "DISASSEMBLE-GUID-TO-FIXNUMS" ), makeSymbol( "GUID-P" ), makeSymbol(
                "GUID-STRING-P" ), makeSymbol( "GUID-TO-STRING" ), makeSymbol( "GUID/=" ), makeSymbol( "GUID<" ), makeSymbol( "GUID<=" ), makeSymbol( "GUID=" ), makeSymbol( "GUID>" ), makeSymbol( "GUID>=" ), makeSymbol(
                    "MAKE-DATE-RELATIVE-GUID" ), makeSymbol( "NEW-GUID" ), makeSymbol( "STRING-TO-GUID" )
        } ) ), ConsesLow.list( makeString( "Hashtables" ), ConsesLow.list( new SubLObject[] { makeSymbol( "CLRHASH" ), makeSymbol( "GETHASH" ), makeSymbol( "GETHASH-WITHOUT-VALUES" ), makeSymbol( "HASH-TABLE-COUNT" ),
          makeSymbol( "HASH-TABLE-SIZE" ), makeSymbol( "HASH-TABLE-TEST" ), makeSymbol( "MAKE-HASH-TABLE" ), makeSymbol( "MAPHASH" ), makeSymbol( "REMHASH" ), makeSymbol( "SETHASH" ), makeSymbol( "GETHASH-BUCKET",
              "SUBLISP" )
        } ) ), ConsesLow.list( makeString( "JavaLink" ), ConsesLow.list( makeSymbol( "JAVA-CALL" ), makeSymbol( "JAVA-CLASS" ), makeSymbol( "JAVA-CONSTRUCTOR" ), makeSymbol( "JAVA-METHOD" ), makeSymbol( "JAVA-NEW" ),
            makeSymbol( "JAVA-OBJECT-P" ), makeSymbol( "JAVA-STATIC" ) ) ), ConsesLow.list( makeString( "Locks" ), ConsesLow.list( makeSymbol( "LOCK-IDLE-P" ), makeSymbol( "LOCK-LOCKER" ), makeSymbol( "LOCK-NAME" ),
                makeSymbol( "MAKE-LOCK" ) ) ), ConsesLow.list( makeString( "Mapper" ), ConsesLow.list( makeSymbol( "WRITE-IMAGE" ) ) ), ConsesLow.list( makeString( "Mapping" ), ConsesLow.list( makeSymbol( "MAPC" ),
                    makeSymbol( "MAPCAN" ), makeSymbol( "MAPCAR" ), makeSymbol( "MAPCON" ), makeSymbol( "MAPL" ), makeSymbol( "MAPLIST" ) ) ), ConsesLow.list( makeString( "Numbers" ), ConsesLow.list( new SubLObject[]
                    { makeSymbol( "*" ), makeSymbol( "+" ), makeSymbol( "-" ), makeSymbol( "/" ), makeSymbol( "/=" ), makeSymbol( "<" ), makeSymbol( "<=" ), makeSymbol( "=" ), makeSymbol( ">" ), makeSymbol( ">=" ),
                      makeSymbol( "ABS" ), makeSymbol( "ACOS" ), makeSymbol( "ASH" ), makeSymbol( "ASIN" ), makeSymbol( "ASSEMBLE-FIXNUMS-TO-INTEGER" ), makeSymbol( "ATAN" ), makeSymbol( "BOOLE" ), makeSymbol(
                          "CEILING" ), makeSymbol( "COS" ), makeSymbol( "DECODE-FLOAT" ), makeSymbol( "DISASSEMBLE-INTEGER-TO-FIXNUMS" ), makeSymbol( "EVENP" ), makeSymbol( "EXP" ), makeSymbol( "EXPT" ), makeSymbol(
                              "FIXNUM*" ), makeSymbol( "FLOAT" ), makeSymbol( "FLOAT-DIGITS" ), makeSymbol( "FLOAT-RADIX" ), makeSymbol( "FLOAT-SIGN" ), makeSymbol( "FLOOR" ), makeSymbol( "INFINITY-P" ), makeSymbol(
                                  "INT/" ), makeSymbol( "INTEGER-DECODE-FLOAT" ), makeSymbol( "INTEGER-LENGTH" ), makeSymbol( "ISQRT" ), makeSymbol( "LOG" ), makeSymbol( "LOGAND" ), makeSymbol( "LOGANDC1" ), makeSymbol(
                                      "LOGANDC2" ), makeSymbol( "LOGBITP" ), makeSymbol( "LOGCOUNT" ), makeSymbol( "LOGEQV" ), makeSymbol( "LOGIOR" ), makeSymbol( "LOGNAND" ), makeSymbol( "LOGNOR" ), makeSymbol(
                                          "LOGNOT" ), makeSymbol( "LOGORC1" ), makeSymbol( "LOGORC2" ), makeSymbol( "LOGTEST" ), makeSymbol( "LOGXOR" ), makeSymbol( "MAX" ), makeSymbol( "MIN" ), makeSymbol( "MINUSP" ),
                      makeSymbol( "MOD" ), makeSymbol( "NOT-A-NUMBER-P" ), makeSymbol( "ODDP" ), makeSymbol( "PLUSP" ), makeSymbol( "REM" ), makeSymbol( "ROUND" ), makeSymbol( "SCALE-FLOAT" ), makeSymbol( "SIN" ),
                      makeSymbol( "SQRT" ), makeSymbol( "TAN" ), makeSymbol( "TRUNCATE" ), makeSymbol( "ZEROP" )
        } ) ), ConsesLow.list( makeString( "Packages" ), ConsesLow.list( new SubLObject[] { makeSymbol( "APROPOS" ), makeSymbol( "EXPORT" ), makeSymbol( "FIND-PACKAGE" ), makeSymbol( "FIND-SYMBOL" ), makeSymbol(
            "IMPORT" ), makeSymbol( "INTERN" ), makeSymbol( "LIST-ALL-PACKAGES" ), makeSymbol( "LOCK-PACKAGE" ), makeSymbol( "MAKE-PACKAGE" ), makeSymbol( "PACKAGE-LOCKED-P" ), makeSymbol( "PACKAGE-NAME" ), makeSymbol(
                "PACKAGE-NICKNAMES" ), makeSymbol( "PACKAGE-SHADOWING-SYMBOLS" ), makeSymbol( "PACKAGE-USE-LIST" ), makeSymbol( "PACKAGE-USED-BY-LIST" ), makeSymbol( "UNEXPORT" ), makeSymbol( "UNINTERN" )
        } ) ), ConsesLow.list( makeString( "PrintLow" ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "WRITE" ), makeSymbol( "WRITE-TO-STRING" ) ) ), ConsesLow.list( makeString( "Processes" ), ConsesLow.list(
            makeSymbol( "EXIT" ), makeSymbol( "FORK-PROCESS" ), makeSymbol( "RESTART-PROCESS" ) ) ), ConsesLow.list( makeString( "Regex" ), ConsesLow.list( makeSymbol( "IS-REGEX-IMPLEMENTATION-AVAILABLE?" ), makeSymbol(
                "REGEX-VERSION" ), makeSymbol( "REGEX-PATTERN-P-IMPL" ), makeSymbol( "COMPILE-REGULAR-EXPRESSION-IMPL" ), makeSymbol( "DISCARD-REGULAR-EXPRESSION-PATTERN-IMPL" ), makeSymbol( "GET-REGEX-ERRORMSG" ),
                makeSymbol( "MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS-IMPL" ) ) ), ConsesLow.list( makeString( "Sequences" ), ConsesLow.list( new SubLObject[]
                { makeSymbol( "CCONCATENATE" ), makeSymbol( "COPY-SEQ" ), makeSymbol( "COUNT" ), makeSymbol( "COUNT-IF" ), makeSymbol( "CREDUCE" ), makeSymbol( "DELETE" ), makeSymbol( "DELETE-DUPLICATES" ), makeSymbol(
                    "DELETE-IF" ), makeSymbol( "ELT" ), makeSymbol( "FILL" ), makeSymbol( "FIND" ), makeSymbol( "FIND-IF" ), makeSymbol( "LENGTH" ), makeSymbol( "MISMATCH" ), makeSymbol( "NREVERSE" ), makeSymbol(
                        "NSUBSTITUTE" ), makeSymbol( "NSUBSTITUTE-IF" ), makeSymbol( "POSITION" ), makeSymbol( "POSITION-IF" ), makeSymbol( "REMOVE" ), makeSymbol( "REMOVE-DUPLICATES" ), makeSymbol( "REMOVE-IF" ),
                  makeSymbol( "REPLACE" ), makeSymbol( "REVERSE" ), makeSymbol( "SEARCH" ), makeSymbol( "SUBSEQ" ), makeSymbol( "SUBSTITUTE" ), makeSymbol( "SUBSTITUTE-IF" )
        } ) ), ConsesLow.list( makeString( "Sort" ), ConsesLow.list( makeSymbol( "CMERGE" ), makeSymbol( "SORT" ), makeSymbol( "STABLE-SORT" ) ) ), ConsesLow.list( makeString( "Storage" ), ConsesLow.list(
            new SubLObject[]
            { makeSymbol( "DEREGISTER-LOW-MEMORY-CALLBACK" ), makeSymbol( "GC" ), makeSymbol( "GC-DYNAMIC" ), makeSymbol( "GC-EPHEMERAL" ), makeSymbol( "GC-FULL" ), makeSymbol( "LOW-MEMORY-CALLBACKS" ), makeSymbol(
                "REGISTER-LOW-MEMORY-CALLBACK" ), makeSymbol( "ROOM" ), makeSymbol( "DUMP-HEAP" )
            } ) ), ConsesLow.list( makeString( "StreamsLow" ), NIL ), ConsesLow.list( makeString( "Strings" ), ConsesLow.list( new SubLObject[] { makeSymbol( "CHAR" ), makeSymbol( "MAKE-STRING" ), makeSymbol(
                "NSTRING-CAPITALIZE" ), makeSymbol( "NSTRING-DOWNCASE" ), makeSymbol( "NSTRING-UPCASE" ), makeSymbol( "SET-CHAR" ), makeSymbol( "STRING" ), makeSymbol( "STRING-CAPITALIZE" ), makeSymbol(
                    "STRING-DOWNCASE" ), makeSymbol( "STRING-EQUAL" ), makeSymbol( "STRING-GREATERP" ), makeSymbol( "STRING-LEFT-TRIM" ), makeSymbol( "STRING-LESSP" ), makeSymbol( "STRING-NOT-EQUAL" ), makeSymbol(
                        "STRING-NOT-GREATERP" ), makeSymbol( "STRING-NOT-LESSP" ), makeSymbol( "STRING-RIGHT-TRIM" ), makeSymbol( "STRING-TRIM" ), makeSymbol( "STRING-UPCASE" ), makeSymbol( "STRING/=" ), makeSymbol(
                            "STRING<" ), makeSymbol( "STRING<=" ), makeSymbol( "STRING=" ), makeSymbol( "STRING>" ), makeSymbol( "STRING>=" )
        } ) ), ConsesLow.list( makeString( "Sxhash" ), ConsesLow.list( makeSymbol( "SXHASH" ), makeSymbol( "SXHASH-ROT", "SUBLISP" ) ) ), ConsesLow.list( makeString( "Symbols" ), ConsesLow.list( new SubLObject[] {
          makeSymbol( "BOUNDP" ), makeSymbol( "FBOUNDP" ), makeSymbol( "FMAKUNBOUND" ), makeSymbol( "GENSYM" ), makeSymbol( "GENTEMP" ), makeSymbol( "GET" ), makeSymbol( "MAKE-KEYWORD" ), makeSymbol( "MAKE-SYMBOL" ),
          makeSymbol( "MAKUNBOUND" ), makeSymbol( "PUT" ), makeSymbol( "REMPROP" ), makeSymbol( "SET" ), makeSymbol( "SYMBOL-FUNCTION" ), makeSymbol( "SYMBOL-NAME" ), makeSymbol( "SYMBOL-PACKAGE" ), makeSymbol(
              "SYMBOL-PLIST" ), makeSymbol( "SYMBOL-VALUE" )
        } ) ), ConsesLow.list( makeString( "Tcp" ), ConsesLow.list( makeSymbol( "OPEN-TCP-STREAM" ) ) ), ConsesLow.list( makeString( "Threads" ), ConsesLow.list( new SubLObject[] { makeSymbol( "ALL-PROCESSES" ),
          makeSymbol( "CURRENT-PROCESS" ), makeSymbol( "DEBUG-PROCESS" ), makeSymbol( "INTERRUPT-PROCESS" ), makeSymbol( "KILL-PROCESS" ), makeSymbol( "MAKE-PROCESS" ), makeSymbol( "NOTIFY" ), makeSymbol(
              "PROCESS-ACTIVE-P" ), makeSymbol( "PROCESS-BLOCK" ), makeSymbol( "PROCESS-NAME" ), makeSymbol( "PROCESS-PRIORITY" ), makeSymbol( "PROCESS-STATE" ), makeSymbol( "PROCESS-UNBLOCK" ), makeSymbol(
                  "PROCESS-WAIT" ), makeSymbol( "PROCESS-WAIT-WITH-TIMEOUT" ), makeSymbol( "PROCESS-WHOSTATE" ), makeSymbol( "SET-PROCESS-PRIORITY" ), makeSymbol( "SHOW-PROCESSES" ), makeSymbol( "SLEEP" ), makeSymbol(
                      "VALID-PROCESS-P" )
        } ) ), ConsesLow.list( makeString( "Time" ), ConsesLow.list( makeSymbol( "DECODE-UNIVERSAL-TIME" ), makeSymbol( "ENCODE-UNIVERSAL-TIME" ), makeSymbol( "GET-DECODED-TIME" ), makeSymbol( "GET-INTERNAL-REAL-TIME" ),
            makeSymbol( "GET-INTERNAL-RUN-TIME" ), makeSymbol( "GET-UNIVERSAL-TIME" ), makeSymbol( "INTERNAL-REAL-TIME-HAS-ARRIVED?" ), makeSymbol( "TIME-HAS-ARRIVED?" ) ) ), ConsesLow.list( makeString( "Types" ),
                ConsesLow.list( new SubLObject[]
                { makeSymbol( "ATOM" ), makeSymbol( "CHARACTERP" ), makeSymbol( "CONSP" ), makeSymbol( "FALSE" ), makeSymbol( "FIXNUMP" ), makeSymbol( "FLOATP" ), makeSymbol( "FUNCTION-SPEC-P" ), makeSymbol(
                    "FUNCTIONP" ), makeSymbol( "HASH-TABLE-P" ), makeSymbol( "INTEGERP" ), makeSymbol( "KEYWORDP" ), makeSymbol( "LISTP" ), makeSymbol( "LOCK-P" ), makeSymbol( "MACRO-OPERATOR-P" ), makeSymbol( "NULL" ),
                  makeSymbol( "NUMBERP" ), makeSymbol( "PACKAGEP" ), makeSymbol( "PROCESSP" ), makeSymbol( "SEQUENCEP" ), makeSymbol( "STREAMP" ), makeSymbol( "STRINGP" ), makeSymbol( "SYMBOLP" ), makeSymbol( "TRUE" ),
                  makeSymbol( "TYPE-OF" ), makeSymbol( "VECTORP" )
                } ) ), ConsesLow.list( makeString( "UserIO" ), ConsesLow.list( makeSymbol( "ALERT-USER" ), makeSymbol( "GET-STRING-FROM-USER" ), makeSymbol( "LOG-MESSAGE" ), makeSymbol( "NOTIFY-USER" ), makeSymbol(
                    "REPORT-ERROR" ), makeSymbol( "USER-CONFIRM" ) ) ), ConsesLow.list( makeString( "Values" ) ), ConsesLow.list( makeString( "Vectors" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol(
                        "MAKE-VECTOR" ), makeSymbol( "SET-AREF" ), makeSymbol( "VECTOR" ) ) ), ConsesLow.list( makeString( "bytes" ), ConsesLow.list( makeSymbol( "BYTE" ), makeSymbol( "DPB" ), makeSymbol( "LDB" ) ) ),
      ConsesLow.list( makeString( "character_names" ), ConsesLow.list( makeSymbol( "CHARACTER-NAMES", "SUBLISP" ) ) ), ConsesLow.list( makeString( "compatibility" ), ConsesLow.list( makeSymbol(
          "DEFAULT-STRUCT-PRINT-FUNCTION" ), makeSymbol( "GET-FILE-POSITION" ), makeSymbol( "OPEN-BINARY" ), makeSymbol( "OPEN-TEXT" ), makeSymbol( "SET-FILE-POSITION" ) ) ), ConsesLow.list( makeString(
              "complex_special_forms" ), ConsesLow.list( makeSymbol( "DEFSTRUCT-ANALYZE", "SUBLISP" ), makeSymbol( "POSSIBLY-NOTE-FUNCTION-ENTRY", "SUBLISP" ) ) ), ConsesLow.list( makeString( "conses_high" ), ConsesLow
                  .list( new SubLObject[]
                  { makeSymbol( "ACONS" ), makeSymbol( "ADJOIN" ), makeSymbol( "ASSOC" ), makeSymbol( "ASSOC-IF" ), makeSymbol( "BUTLAST" ), makeSymbol( "CAAR" ), makeSymbol( "CADR" ), makeSymbol( "CDAR" ), makeSymbol(
                      "CDDR" ), makeSymbol( "CIRCULAR-LIST-P" ), makeSymbol( "COPY-ALIST" ), makeSymbol( "COPY-LIST" ), makeSymbol( "COPY-TREE" ), makeSymbol( "EIGHTH" ), makeSymbol( "ENDP" ), makeSymbol( "FIFTH" ),
                    makeSymbol( "FIRST" ), makeSymbol( "FOURTH" ), makeSymbol( "GETF" ), makeSymbol( "INTERSECTION" ), makeSymbol( "LAST" ), makeSymbol( "LDIFF" ), makeSymbol( "LIST-LENGTH" ), makeSymbol( "MEMBER" ),
                    makeSymbol( "MEMBER-IF" ), makeSymbol( "NBUTLAST" ), makeSymbol( "NINTERSECTION" ), makeSymbol( "NINTH" ), makeSymbol( "NON-CIRCULAR-LIST-P" ), makeSymbol( "NRECONC" ), makeSymbol(
                        "NSET-DIFFERENCE" ), makeSymbol( "NSET-EXCLUSIVE-OR" ), makeSymbol( "NSUBLIS" ), makeSymbol( "NSUBST" ), makeSymbol( "NSUBST-IF" ), makeSymbol( "NTHCDR" ), makeSymbol( "NUNION" ), makeSymbol(
                            "PAIRLIS" ), makeSymbol( "PUTF" ), makeSymbol( "RASSOC" ), makeSymbol( "RASSOC-IF" ), makeSymbol( "REMF" ), makeSymbol( "REST" ), makeSymbol( "REVAPPEND" ), makeSymbol( "SECOND" ), makeSymbol(
                                "SET-DIFFERENCE" ), makeSymbol( "SET-EXCLUSIVE-OR" ), makeSymbol( "SEVENTH" ), makeSymbol( "SIXTH" ), makeSymbol( "SUBLIS" ), makeSymbol( "SUBSETP" ), makeSymbol( "SUBST" ), makeSymbol(
                                    "SUBST-IF" ), makeSymbol( "TAILP" ), makeSymbol( "TENTH" ), makeSymbol( "THIRD" ), makeSymbol( "TREE-EQUAL" ), makeSymbol( "UNION" )
      } ) ), ConsesLow.list( makeString( "foreign" ), ConsesLow.list( makeSymbol( "DECLARE-FOREIGN-SHARED-LIBRARY", "SUBLISP" ), makeSymbol( "DEFINE-FOREIGN-FUNCTION-INTERNAL", "SUBLISP" ), makeSymbol(
          "ENSURE-FOREIGN-SHARED-LIBRARY-LOADED", "SUBLISP" ), makeSymbol( "FOREIGN-SHARED-LIBRARY-INSTALLED?", "SUBLISP" ), makeSymbol( "VECTOR-FOR-MARSHALLING", "SUBLISP" ) ) ), ConsesLow.list( makeString(
              "hashtables_high" ), ConsesLow.list( makeSymbol( "HASH-TABLE-ITERATOR-P" ), makeSymbol( "MAKE-HASH-TABLE-ITERATOR" ), makeSymbol( "DESTROY-HASH-TABLE-ITERATOR" ), makeSymbol(
                  "HASH-TABLE-ITERATOR-HASH-TABLE" ), makeSymbol( "HASH-TABLE-ITERATOR-DONE-P" ), makeSymbol( "HASH-TABLE-ITERATOR-KEY" ), makeSymbol( "HASH-TABLE-ITERATOR-VALUE" ), makeSymbol(
                      "HASH-TABLE-ITERATOR-NEXT" ) ) ), ConsesLow.list( makeString( "math_utilities" ), ConsesLow.list( makeSymbol( "BELLEROPHON", "SUBLISP" ), makeSymbol( "FLONUM-DIGIT-LIST", "SUBLISP" ) ) ), ConsesLow
                          .list( makeString( "print_high" ), ConsesLow.list( makeSymbol( "PRIN1" ), makeSymbol( "PRIN1-TO-STRING" ), makeSymbol( "PRINC" ), makeSymbol( "PRINC-TO-STRING" ), makeSymbol( "PRINT" ),
                              makeSymbol( "PRINT-OBJECT" ) ) ), ConsesLow.list( makeString( "print_macros" ), ConsesLow.list( makeSymbol( "PRINT-UNREADABLE-OBJECT-PREAMBLE", "SUBLISP" ), makeSymbol(
                                  "PRINT-UNREADABLE-OBJECT-POSTAMBLE", "SUBLISP" ) ) ), ConsesLow.list( makeString( "random" ), ConsesLow.list( makeSymbol( "RANDOM" ), makeSymbol( "SEED-RANDOM" ) ) ), ConsesLow.list(
                                      makeString( "reader" ), ConsesLow.list( new SubLObject[]
                                      { makeSymbol( "COPY-READTABLE" ), makeSymbol( "GET-DISPATCH-MACRO-CHARACTER" ), makeSymbol( "GET-MACRO-CHARACTER" ), makeSymbol( "MAKE-DISPATCH-MACRO-CHARACTER" ), makeSymbol(
                                          "PARSE-INTEGER" ), makeSymbol( "READ" ), makeSymbol( "READ-DELIMITED-LIST" ), makeSymbol( "READ-FROM-STRING" ), makeSymbol( "READ-FROM-STRING-IGNORING-ERRORS" ), makeSymbol(
                                              "READ-IGNORING-ERRORS" ), makeSymbol( "READ-PRESERVING-WHITESPACE" ), makeSymbol( "READTABLE-CASE" ), makeSymbol( "READTABLEP" ), makeSymbol( "READTABLE-P", "SUBLISP" ),
                                        makeSymbol( "SET-DISPATCH-MACRO-CHARACTER" ), makeSymbol( "SET-MACRO-CHARACTER" ), makeSymbol( "SET-SYNTAX-FROM-CHAR" ), makeSymbol( "SIMPLE-READER-ERROR" ), makeSymbol(
                                            "END-OF-FILE-ERROR", "SUBLISP" ), makeSymbol( "SINGLE-ESCAPE-SYNTAXP", "SUBLISP" ), makeSymbol( "SYMBOL-ESCAPEP", "SUBLISP" ), makeSymbol( "WHITESPACE-1-CHAR-P", "SUBLISP" ),
                                        makeSymbol( "WHITESPACE-2-CHAR-P", "SUBLISP" ), makeSymbol( "BQ-CONS" ), makeSymbol( "BQ-VECTOR" )
                                      } ) ), ConsesLow.list( makeString( "cdestructuring_bind" ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND-ERROR", "SUBLISP" ), makeSymbol( "DESTRUCTURING-BIND-MUST-CONSP",
                                          "SUBLISP" ), makeSymbol( "DESTRUCTURING-BIND-MUST-LISTP", "SUBLISP" ), makeSymbol( "PROPERTY-LIST-MEMBER", "SUBLISP" ) ) ), ConsesLow.list( makeString( "visitation" ), ConsesLow
                                              .list( makeSymbol( "VISIT-DEFSTRUCT" ) ) ), ConsesLow.list( makeString( "streams_high" ), ConsesLow.list( new SubLObject[]
                                              { makeSymbol( "BROADCAST-STREAM-STREAMS" ), makeSymbol( "CLEAR-INPUT" ), makeSymbol( "CLEAR-OUTPUT" ), makeSymbol( "CLOSE" ), makeSymbol( "CONCATENATED-STREAM-STREAMS" ),
                                                makeSymbol( "ECHO-STREAM-INPUT-STREAM" ), makeSymbol( "ECHO-STREAM-OUTPUT-STREAM" ), makeSymbol( "FILE-LENGTH" ), makeSymbol( "FILE-POSITION" ), makeSymbol(
                                                    "FILE-STRING-LENGTH" ), makeSymbol( "FINISH-OUTPUT" ), makeSymbol( "FORCE-OUTPUT" ), makeSymbol( "FRESH-LINE" ), makeSymbol( "GET-OUTPUT-STREAM-STRING" ), makeSymbol(
                                                        "INPUT-STREAM-P" ), makeSymbol( "INTERACTIVE-STREAM-P" ), makeSymbol( "LISTEN" ), makeSymbol( "MAKE-BROADCAST-STREAM" ), makeSymbol( "MAKE-CONCATENATED-STREAM" ),
                                                makeSymbol( "MAKE-ECHO-STREAM" ), makeSymbol( "MAKE-PRIVATE-BROADCAST-STREAM" ), makeSymbol( "MAKE-PRIVATE-CONCATENATED-STREAM" ), makeSymbol( "MAKE-PRIVATE-ECHO-STREAM" ),
                                                makeSymbol( "MAKE-PRIVATE-STRING-INPUT-STREAM" ), makeSymbol( "MAKE-PRIVATE-STRING-OUTPUT-STREAM" ), makeSymbol( "MAKE-PRIVATE-SYNONYM-STREAM" ), makeSymbol(
                                                    "MAKE-PRIVATE-TWO-WAY-STREAM" ), makeSymbol( "MAKE-STRING-INPUT-STREAM" ), makeSymbol( "MAKE-STRING-OUTPUT-STREAM" ), makeSymbol( "MAKE-SYNONYM-STREAM" ), makeSymbol(
                                                        "MAKE-TWO-WAY-STREAM" ), makeSymbol( "OPEN-STREAM-P" ), makeSymbol( "OUTPUT-STREAM-P" ), makeSymbol( "PEEK-CHAR" ), makeSymbol( "READ-BYTE" ), makeSymbol(
                                                            "READ-CHAR" ), makeSymbol( "READ-CHAR-NO-HANG" ), makeSymbol( "READ-LINE" ), makeSymbol( "READ-SEQUENCE" ), makeSymbol( "STREAM-ELEMENT-TYPE" ), makeSymbol(
                                                                "SYNONYM-STREAM-SYMBOL" ), makeSymbol( "TERPRI" ), makeSymbol( "TWO-WAY-STREAM-INPUT-STREAM" ), makeSymbol( "TWO-WAY-STREAM-OUTPUT-STREAM" ), makeSymbol(
                                                                    "UNREAD-CHAR" ), makeSymbol( "WRITE-BYTE" ), makeSymbol( "WRITE-CHAR" ), makeSymbol( "WRITE-LINE" ), makeSymbol( "WRITE-SEQUENCE" ), makeSymbol(
                                                                        "WRITE-STRING" ), makeSymbol( "STREAM-LINE-COLUMN", "SUBLISP" )
      } ) )
    } );
  }

  private static SubLObject _constant_4_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "OPEN" ), makeString( "StreamsLow" ), makeString( "open" ), ConsesLow.list( makeSymbol( "FILESPEC" ), makeSymbol( "&REST" ), makeSymbol(
        "KEYS" ) ) ), ConsesLow.list( makeSymbol( "%BTD" ), makeKeyword( "IMPORTED" ), makeString( "makeBoolean" ), ConsesLow.list( makeSymbol( "OBJ" ) ) ), ConsesLow.list( makeSymbol( "%CBIG" ), makeKeyword(
            "IMPORTED" ), makeString( "makeInteger" ), ConsesLow.list( makeSymbol( "STRING-REP" ) ) ), ConsesLow.list( makeSymbol( "%CCHAR" ), makeKeyword( "IMPORTED" ), makeString( "makeChar" ), ConsesLow.list(
                makeSymbol( "CODE" ) ) ), ConsesLow.list( makeSymbol( "%CFIX" ), makeKeyword( "IMPORTED" ), makeString( "makeInteger" ), ConsesLow.list( makeSymbol( "FIXNUM" ) ) ), ConsesLow.list( makeSymbol(
                    "%CFLOAT" ), makeKeyword( "IMPORTED" ), makeString( "makeDouble" ), ConsesLow.list( makeSymbol( "FLOAT" ) ) ), ConsesLow.list( makeSymbol( "%CGUID" ), makeKeyword( "IMPORTED" ), makeString(
                        "makeGuid" ), ConsesLow.list( makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "%CINTERN" ), makeKeyword( "IMPORTED" ), makeString( "makeSymbol" ), ConsesLow.list( makeSymbol(
                            "STRING" ) ) ), ConsesLow.list( makeSymbol( "%CKEYWORD" ), makeKeyword( "IMPORTED" ), makeString( "makeKeyword" ), ConsesLow.list( makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol(
                                "%CMAKE-SYMBOL" ), makeKeyword( "IMPORTED" ), makeString( "makeUninternedSymbol" ), ConsesLow.list( makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "%CSTRING" ), makeKeyword(
                                    "IMPORTED" ), makeString( "makeString" ), ConsesLow.list( makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "%CSYMBOL" ), makeKeyword( "IMPORTED" ), makeString( "makeSymbol" ),
                                        ConsesLow.list( makeSymbol( "SYMBOL-NAME" ), makeSymbol( "PACKAGE-NAME" ) ) ), ConsesLow.list( makeSymbol( "%DTB" ), makeString( "SubLNil" ), makeString( "toBool" ), ConsesLow
                                            .list( makeSymbol( "OBJ" ) ) ), ConsesLow.list( makeSymbol( "%DYN" ), makeString( "Symbols" ), makeString( "symbol_value" ), ConsesLow.list( makeSymbol( "VAR" ) ) ), ConsesLow
                                                .list( makeSymbol( "%GET-RESULT" ), makeString( "Dynamic" ), makeString( "getResult" ), ConsesLow.list( makeSymbol( "CATCHABLE-THROW" ) ) ), ConsesLow.list( makeSymbol(
                                                    "%GET-TARGET" ), makeString( "Dynamic" ), makeString( "getTarget" ), ConsesLow.list( makeSymbol( "CATCHABLE-THROW" ) ) ), ConsesLow.list( makeSymbol( "%HASH-INDEX-KEY",
                                                        "SUBLISP" ), makeString( "Hashtables" ), makeString( "hash_index_key" ), ConsesLow.list( makeSymbol( "TABLE" ), makeSymbol( "INDEX" ) ) ), ConsesLow.list(
                                                            makeSymbol( "%HASH-INDEX-OBJ", "SUBLISP" ), makeString( "Hashtables" ), makeString( "hash_index_obj" ), ConsesLow.list( makeSymbol( "TABLE" ), makeSymbol(
                                                                "INDEX" ) ) ), ConsesLow.list( makeSymbol( "%LEX" ), makeString( "Symbols" ), makeString( "symbol_value" ), ConsesLow.list( makeSymbol( "VAR" ) ) ),
      ConsesLow.list( makeSymbol( "%MVAL" ), makeString( "SubLProcess" ), makeString( "nthMultipleValue" ), ConsesLow.list( makeSymbol( "N" ) ) ), ConsesLow.list( makeSymbol( "%PROCLAIM" ), makeString(
          "SubLSpecialOperatorDeclarations" ), makeString( "proclaim" ), ConsesLow.list( makeSymbol( "DECL" ) ) ), ConsesLow.list( makeSymbol( "%NEXT-HASH-INDEX", "SUBLISP" ), makeString( "Hashtables" ), makeString(
              "next_hash_index" ), ConsesLow.list( makeSymbol( "TABLE" ), makeSymbol( "INDEX" ) ) ), ConsesLow.list( makeSymbol( "PRINT-NOT-READABLE" ), makeString( "print_high" ), makeString( "print_not_readable" ),
                  ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "%SET-DYN" ), makeString( "Symbols" ), makeString( "set" ), ConsesLow.list( makeSymbol( "VAR" ),
                      makeSymbol( "VAL" ) ) ), ConsesLow.list( makeSymbol( "%SET-LEX" ), makeString( "Symbols" ), makeString( "set" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "VAL" ) ) ), ConsesLow.list(
                          makeSymbol( "%GET-INITIAL-CONTINUATION", "SUBLISP" ), makeString( "Eval" ), makeString( "get_initial_continuation" ), NIL ), ConsesLow.list( makeSymbol( "%GET-RED-OBJECT", "SUBLISP" ),
                              makeString( "SubLMain" ), makeString( "get_red_object" ), NIL ), ConsesLow.list( makeSymbol( "%SET-INITIAL-CONTINUATION", "SUBLISP" ), makeString( "Eval" ), makeString(
                                  "set_initial_continuation" ), ConsesLow.list( makeSymbol( "FUNCTIONSPEC" ) ) ), ConsesLow.list( makeSymbol( "ALIEN-AS-STRING", "SUBLISP" ), makeString( "Alien" ), makeString(
                                      "alien_as_string" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "ALIEN-P", "SUBLISP" ), makeString( "Alien" ), makeString( "alien_p" ), ConsesLow.list(
                                          makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "CIRCULAR-REFERENCE-P", "SUBLISP" ), makeString( "print_high" ), makeString( "circular_reference_p" ), ConsesLow.list(
                                              makeSymbol( "OBJECT" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "DEF-FOREIGN-FUNCTION", "SUBLISP" ), makeString( "Alien" ), makeString(
                                                  "def_foreign_function" ), ConsesLow.list( makeSymbol( "FOREIGN-SHARED-LIBRARY" ), makeSymbol( "FOREIGN-NAME" ), makeSymbol( "SYMBOL" ), makeSymbol( "ARG-CONVERSION" ),
                                                      makeSymbol( "RET-TYPE" ), makeSymbol( "CALLING-CONVENTION" ), makeSymbol( "NULL-DEFAULT-RETURN" ) ) ), ConsesLow.list( makeSymbol( "DESCRIPTOR-STREAM-CLOSE",
                                                          "SUBLISP" ), makeString( "StreamsLow" ), makeString( "descriptor_stream_close" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "ABORT" ) ) ), ConsesLow
                                                              .list( makeSymbol( "DESCRIPTOR-STREAM-FILE-LENGTH", "SUBLISP" ), makeString( "StreamsLow" ), makeString( "descriptor_stream_file_length" ), ConsesLow.list(
                                                                  makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "DESCRIPTOR-STREAM-FILE-POSITION", "SUBLISP" ), makeString( "StreamsLow" ), makeString(
                                                                      "descriptor_stream_file_position" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "DESCRIPTOR-STREAM-NEXT-INPUT-BUFFER",
                                                                          "SUBLISP" ), makeString( "StreamsLow" ), makeString( "descriptor_stream_next_input_buffer" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol(
                                                                              "WAITP" ) ) ), ConsesLow.list( makeSymbol( "DESCRIPTOR-STREAM-SEND-OUTPUT-BUFFER", "SUBLISP" ), makeString( "StreamsLow" ), makeString(
                                                                                  "descriptor_stream_send_output_buffer" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol(
                                                                                      "DESCRIPTOR-STREAM-SET-FILE-POSITION", "SUBLISP" ), makeString( "StreamsLow" ), makeString( "descriptor_stream_set_file_position" ),
                                                                                      ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "POSITION-SPEC" ) ) ), ConsesLow.list( makeSymbol( "FILE-POINTER-STREAM-CLOSE",
                                                                                          "SUBLISP" ), makeString( "StreamsLow" ), makeString( "file_pointer_stream_close" ), ConsesLow.list( makeSymbol( "STREAM" ),
                                                                                              makeSymbol( "ABORT" ) ) ), ConsesLow.list( makeSymbol( "FILE-POINTER-STREAM-FILE-LENGTH", "SUBLISP" ), makeString(
                                                                                                  "StreamsLow" ), makeString( "file_pointer_stream_file_length" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow
                                                                                                      .list( makeSymbol( "FILE-POINTER-STREAM-FILE-POSITION", "SUBLISP" ), makeString( "StreamsLow" ), makeString(
                                                                                                          "file_pointer_stream_file_position" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                              "FILE-POINTER-STREAM-NEXT-INPUT-BUFFER", "SUBLISP" ), makeString( "StreamsLow" ), makeString(
                                                                                                                  "file_pointer_stream_next_input_buffer" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol(
                                                                                                                      "WAITP" ) ) ), ConsesLow.list( makeSymbol( "FILE-POINTER-STREAM-SEND-OUTPUT-BUFFER", "SUBLISP" ),
                                                                                                                          makeString( "StreamsLow" ), makeString( "file_pointer_stream_send_output_buffer" ), ConsesLow
                                                                                                                              .list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                  "FILE-POINTER-STREAM-SET-FILE-POSITION", "SUBLISP" ), makeString( "StreamsLow" ),
                                                                                                                                  makeString( "file_pointer_stream_set_file_position" ), ConsesLow.list( makeSymbol(
                                                                                                                                      "STREAM" ), makeSymbol( "POSITION-SPEC" ) ) ), ConsesLow.list( makeSymbol( "GET-TIME",
                                                                                                                                          "SUBLISP" ), makeString( "Time" ), makeString( "get_time" ), NIL ), ConsesLow
                                                                                                                                              .list( makeSymbol( "GET-TIMEZONE", "SUBLISP" ), makeString( "Time" ),
                                                                                                                                                  makeString( "get_timezone" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ),
                                                                                                                                                      makeSymbol( "UNIVERSAL-TIME" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                          "%COMPUTE-WITH-PROCESS-RESOURCE-TRACKING-RESULTS" ), makeString(
                                                                                                                                                              "Time" ), makeString(
                                                                                                                                                                  "compute_with_process_resource_tracking_results" ),
                                                                                                                                                          ConsesLow.list( makeSymbol( "ENV-VAR" ) ) ), ConsesLow.list(
                                                                                                                                                              makeSymbol( "LOAD-SHARED-OBJECT", "SUBLISP" ), makeString(
                                                                                                                                                                  "Alien" ), makeString( "load_shared_object" ), ConsesLow
                                                                                                                                                                      .list( makeSymbol( "MONIKER" ), makeSymbol(
                                                                                                                                                                          "PATHNAME" ), makeSymbol( "OPTIONS" ) ) ),
      ConsesLow.list( makeSymbol( "OPEN-DESCRIPTOR", "SUBLISP" ), makeString( "StreamsLow" ), makeString( "open_descriptor" ), ConsesLow.list( makeSymbol( "FILESPEC" ), makeSymbol( "DIRECTION" ), makeSymbol(
          "ELEMENT-TYPE" ), makeSymbol( "IF-EXISTS" ), makeSymbol( "IF-DOES-NOT-EXIST" ), makeSymbol( "EXTERNAL-FORMAT" ) ) ), ConsesLow.list( makeSymbol( "POINTER", "SUBLISP" ), makeString( "Equality" ), makeString(
              "pointer" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "PRINT-CHARACTER", "SUBLISP" ), makeString( "print_functions" ), makeString( "print_character" ), ConsesLow.list(
                  makeSymbol( "CHAR" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-CONS-CELLS", "SUBLISP" ), makeString( "print_functions" ), makeString( "print_cons_cells" ), ConsesLow.list(
                      makeSymbol( "CONS" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-FLONUM", "SUBLISP" ), makeString( "print_functions" ), makeString( "print_flonum" ), ConsesLow.list( makeSymbol(
                          "FLONUM" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-FUNCTION", "SUBLISP" ), makeString( "Functions" ), makeString( "print_function" ), ConsesLow.list( makeSymbol(
                              "FUNCTION" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-HASHTABLE", "SUBLISP" ), makeString( "print_functions" ), makeString( "print_hashtable" ), ConsesLow.list(
                                  makeSymbol( "HASHTABLE" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-INTEGER", "SUBLISP" ), makeString( "print_functions" ), makeString( "print_integer" ), ConsesLow
                                      .list( makeSymbol( "INTEGER" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-SYMBOL", "SUBLISP" ), makeString( "print_functions" ), makeString( "print_symbol" ),
                                          ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-STRING", "SUBLISP" ), makeString( "print_functions" ), makeString(
                                              "print_string" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-VECTOR", "SUBLISP" ), makeString(
                                                  "print_functions" ), makeString( "print_vector" ), ConsesLow.list( makeSymbol( "VECTOR" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "RELEASE-LOCK",
                                                      "SUBLISP" ), makeString( "Locks" ), makeString( "release_lock" ), ConsesLow.list( makeSymbol( "LOCK" ) ) ), ConsesLow.list( makeSymbol( "SEIZE-LOCK", "SUBLISP" ),
                                                          makeString( "Locks" ), makeString( "seize_lock" ), ConsesLow.list( makeSymbol( "LOCK" ) ) ), ConsesLow.list( makeSymbol( "STREAM-INPUT-INDEX", "SUBLISP" ),
                                                              makeString( "streams_high" ), makeString( "stream_input_index" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol(
                                                                  "READ-BYTE-SEQUENCE-TO-POSITIVE-INTEGER", "SUBLISP" ), makeString( "streams_high" ), makeString( "read_byte_sequence_to_positive_integer" ), ConsesLow
                                                                      .list( makeSymbol( "BYTES" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "STREAM" ), makeSymbol( "EOF-ERROR-P" ), makeSymbol( "EOF-VALUE" ), makeSymbol(
                                                                          "NETWORK-BYTE-ORDER?" ) ) ), ConsesLow.list( makeSymbol( "WRITE-POSITIVE-INTEGER-TO-BYTE-SEQUENCE", "SUBLISP" ), makeString( "streams_high" ),
                                                                              makeString( "write_positive_integer_as_byte_sequence" ), ConsesLow.list( makeSymbol( "INT" ), makeSymbol( "BYTES" ), makeSymbol(
                                                                                  "&OPTIONAL" ), makeSymbol( "STREAM" ), makeSymbol( "NETWORK-BYTE-ORDER?" ) ) ), ConsesLow.list( makeSymbol(
                                                                                      "READ-BYTE-SEQUENCE-INTO-STRING", "SUBLISP" ), makeString( "streams_high" ), makeString( "read_byte_sequence_into_string" ), ConsesLow
                                                                                          .list( makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "STREAM" ), makeSymbol( "EOF-ERROR-P" ), makeSymbol(
                                                                                              "EOF-VALUE" ) ) ), ConsesLow.list( makeSymbol( "WRITE-STRING-TO-BYTE-SEQUENCE", "SUBLISP" ), makeString( "streams_high" ),
                                                                                                  makeString( "write_string_to_byte_sequence" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ),
                                                                                                      makeSymbol( "STREAM" ), makeSymbol( "OFFSET" ), makeSymbol( "LENGTH" ) ) ), ConsesLow.list( makeSymbol( "UNREAD-BYTE",
                                                                                                          "SUBLISP" ), makeString( "streams_high" ), makeString( "unread_byte" ), ConsesLow.list( makeSymbol( "BYTE" ),
                                                                                                              makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "EXTERNAL-PROCESSES-SUPPORTED?" ), makeString(
                                                                                                                  "Processes" ), makeString( "external_processes_supportedP" ), NIL ), ConsesLow.list( makeSymbol(
                                                                                                                      "BIGNUMP" ), makeString( "Types" ), makeString( "bignump" ), ConsesLow.list( makeSymbol(
                                                                                                                          "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "BOOLEANP" ), makeString( "Types" ), makeString(
                                                                                                                              "booleanp" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                  "READER-WRITER-LOCK-P" ), makeString( "ReadWriteLocks" ), makeString( "rw_lock_p" ),
                                                                                                                                  ConsesLow.list( makeSymbol( "POSSIBLE-RW-LOCK" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                      "RW-LOCK-P" ), makeString( "ReadWriteLocks" ), makeString( "rw_lock_p" ), ConsesLow
                                                                                                                                          .list( makeSymbol( "POSSIBLE-RW-LOCK" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                              "NEW-RW-LOCK" ), makeString( "ReadWriteLocks" ), makeString( "new_rw_lock" ),
                                                                                                                                              ConsesLow.list( makeSymbol( "NAME" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                  "RW-LOCK-NAME" ), makeString( "ReadWriteLocks" ), makeString(
                                                                                                                                                      "rw_lock_name" ), ConsesLow.list( makeSymbol( "RW-LOCK" ) ) ),
      ConsesLow.list( makeSymbol( "RW-LOCK-SEIZE-READ-LOCK" ), makeString( "ReadWriteLocks" ), makeString( "rw_lock_seize_read_lock" ), ConsesLow.list( makeSymbol( "RW-LOCK" ) ) ), ConsesLow.list( makeSymbol(
          "RW-LOCK-SEIZE-WRITE-LOCK" ), makeString( "ReadWriteLocks" ), makeString( "rw_lock_seize_write_lock" ), ConsesLow.list( makeSymbol( "RW-LOCK" ) ) ), ConsesLow.list( makeSymbol( "RW-LOCK-RELEASE-READ-LOCK" ),
              makeString( "ReadWriteLocks" ), makeString( "rw_lock_release_read_lock" ), ConsesLow.list( makeSymbol( "RW-LOCK" ) ) ), ConsesLow.list( makeSymbol( "RW-LOCK-RELEASE-WRITE-LOCK" ), makeString(
                  "ReadWriteLocks" ), makeString( "rw_lock_release_write_lock" ), ConsesLow.list( makeSymbol( "RW-LOCK" ) ) ), ConsesLow.list( makeSymbol( "RW-LOCK-WRITER" ), makeString( "ReadWriteLocks" ), makeString(
                      "rw_lock_writer" ), ConsesLow.list( makeSymbol( "RW-LOCK" ) ) ), ConsesLow.list( makeSymbol( "RW-LOCK-WAITERS" ), makeString( "ReadWriteLocks" ), makeString( "rw_lock_waiters" ), ConsesLow.list(
                          makeSymbol( "RW-LOCK" ) ) ), ConsesLow.list( makeSymbol( "SEMAPHORE-P" ), makeString( "Semaphores" ), makeString( "semaphore_p" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list(
                              makeSymbol( "NEW-SEMAPHORE" ), makeString( "Semaphores" ), makeString( "new_semaphore" ), ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "COUNT" ) ) ),
      ConsesLow.list( makeSymbol( "SEMAPHORE-NAME" ), makeString( "Semaphores" ), makeString( "semaphore_name" ), ConsesLow.list( makeSymbol( "SEMAPHORE" ) ) ), ConsesLow.list( makeSymbol( "SEMAPHORE-SIGNAL" ),
          makeString( "Semaphores" ), makeString( "semaphore_signal" ), ConsesLow.list( makeSymbol( "SEMAPHORE" ) ) ), ConsesLow.list( makeSymbol( "SEMAPHORE-CURRENT-COUNT" ), makeString( "Semaphores" ), makeString(
              "semaphore_current_count" ), ConsesLow.list( makeSymbol( "SEMAPHORE" ) ) ), ConsesLow.list( makeSymbol( "SEMAPHORE-WAIT" ), makeString( "Semaphores" ), makeString( "semaphore_wait" ), ConsesLow.list(
                  makeSymbol( "SEMAPHORE" ) ) ), ConsesLow.list( makeSymbol( "SEMAPHORE-DRAIN" ), makeString( "Semaphores" ), makeString( "semaphore_drain" ), ConsesLow.list( makeSymbol( "SEMAPHORE" ) ) ), ConsesLow
                      .list( makeSymbol( "SEMAPHORE-WAIT-WITH-TIMEOUT" ), makeString( "Semaphores" ), makeString( "semaphore_wait_with_timeout" ), ConsesLow.list( makeSymbol( "SEMAPHORE" ), makeSymbol(
                          "MAX-SECS-TO-WAIT" ) ) ), ConsesLow.list( makeSymbol( "SXHASH-ROT" ), makeString( "Sxhash" ), makeString( "sxhash_rot" ), ConsesLow.list( makeSymbol( "FIXNUM" ), makeSymbol( "HIGH-BITS" ) ) ),
      ConsesLow.list( makeSymbol( "UNLOAD-SHARED-OBJECT", "SUBLISP" ), makeString( "Alien" ), makeString( "unload_shared_object" ), ConsesLow.list( makeSymbol( "PATHNAME" ) ) ), ConsesLow.list( makeSymbol(
          "WIDE-NEWLINE-STREAM-P", "SUBLISP" ), makeString( "StreamsLow" ), makeString( "wide_newline_stream_p" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "MEMORY-MAPPED-STREAM-P",
              "SUBLISP" ), makeString( "StreamsLow" ), makeString( "isMemoryMappedStream" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "VALUES" ), makeString( "Values" ), makeString(
                  "values" ), ConsesLow.list( makeSymbol( "&REST" ), makeSymbol( "MORE-VALUES" ) ) ), ConsesLow.list( makeSymbol( "%RESET-MVAL" ), makeString( "Values" ), makeString( "resetMultipleValues" ), NIL ),
      ConsesLow.list( makeSymbol( "%ARG2" ), makeString( "Values" ), makeString( "arg2" ), ConsesLow.list( makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) ) ), ConsesLow.list( makeSymbol( "%MULTIPLE-VALUE-LIST" ), makeString(
          "Values" ), makeString( "multiple_value_list" ), ConsesLow.list( makeSymbol( "EXPRESSION" ) ) ), ConsesLow.list( makeSymbol( "%NTH-VALUE-STEP-1" ), makeString( "Values" ), makeString( "nth_value_step_1" ),
              ConsesLow.list( makeSymbol( "N" ) ) ), ConsesLow.list( makeSymbol( "%NTH-VALUE-STEP-2" ), makeString( "Values" ), makeString( "nth_value_step_2" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol(
                  "EXPRESSION" ) ) ), ConsesLow.list( makeSymbol( "%VALUES-AS-VECTOR" ), makeString( "Values" ), makeString( "getValuesAsVector" ), NIL ), ConsesLow.list( makeSymbol( "%RESTORE-VALUES-FROM-VECTOR" ),
                      makeString( "Values" ), makeString( "restoreValuesFromVector" ), ConsesLow.list( makeSymbol( "VALUES" ) ) ), ConsesLow.list( makeSymbol( "EXTERNAL-PROCESSES-SUPPORTED?", "SUBLISP" ), makeString(
                          "Processes" ), makeString( "external_processes_supportedP" ), NIL ), ConsesLow.list( makeSymbol( "GET-EXTERNAL-PROCESS-STATUS", "SUBLISP" ), makeString( "Processes" ), makeString(
                              "get_external_process_status" ), ConsesLow.list( makeSymbol( "PROCESS-ID" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "WAIT-UNTIL-DONE?" ) ) ), ConsesLow.list( makeSymbol(
                                  "KILL-EXTERNAL-PROCESS", "SUBLISP" ), makeString( "Processes" ), makeString( "kill_external_process" ), ConsesLow.list( makeSymbol( "PROCESS-ID" ) ) ), ConsesLow.list( makeSymbol(
                                      "RUN-EXTERNAL-PROCESS", "SUBLISP" ), makeString( "Processes" ), makeString( "run_external_process" ), ConsesLow.list( makeSymbol( "PROGRAM" ), makeSymbol( "&OPTIONAL" ), makeSymbol(
                                          "ARGS" ), makeSymbol( "STDIN-SPEC" ), makeSymbol( "STDOUT-SPEC" ), makeSymbol( "STDERR-SPEC" ) ) ), ConsesLow.list( makeSymbol( "CANONICAL-NULL-FILE-STREAM-PATH", "SUBLISP" ),
                                              makeString( "Filesys" ), makeString( "canonical_null_file_stream_path" ), NIL ), ConsesLow.list( makeSymbol( "%CURRENT-THREAD" ), makeString( "SubLProcess" ), makeString(
                                                  "currentSubLThread" ), NIL ), ConsesLow.list( makeSymbol( "%THREAD-RESET-MVAL" ), makeString( "Values" ), makeString( "resetMultipleValues" ), ConsesLow.list( makeSymbol(
                                                      "THREAD" ) ) ), ConsesLow.list( makeSymbol( "%THREAD-MVAL-1" ), makeString( "Values" ), makeString( "firstMultipleValue" ), ConsesLow.list( makeSymbol(
                                                          "THREAD" ) ) ), ConsesLow.list( makeSymbol( "%THREAD-MVAL-2" ), makeString( "Values" ), makeString( "secondMultipleValue" ), ConsesLow.list( makeSymbol(
                                                              "THREAD" ) ) ), ConsesLow.list( makeSymbol( "%THREAD-MVAL-3" ), makeString( "Values" ), makeString( "thirdMultipleValue" ), ConsesLow.list( makeSymbol(
                                                                  "THREAD" ) ) ), ConsesLow.list( makeSymbol( "%THREAD-MVAL-4" ), makeString( "Values" ), makeString( "fourthMultipleValue" ), ConsesLow.list( makeSymbol(
                                                                      "THREAD" ) ) ), ConsesLow.list( makeSymbol( "%THREAD-MVAL-5" ), makeString( "Values" ), makeString( "fifthMultipleValue" ), ConsesLow.list(
                                                                          makeSymbol( "THREAD" ) ) ), ConsesLow.list( makeSymbol( "%THREAD-MVAL-6" ), makeString( "Values" ), makeString( "sixthMultipleValue" ), ConsesLow
                                                                              .list( makeSymbol( "THREAD" ) ) ), ConsesLow.list( makeSymbol( "%THREAD-MVAL-7" ), makeString( "Values" ), makeString(
                                                                                  "seventhMultipleValue" ), ConsesLow.list( makeSymbol( "THREAD" ) ) ), ConsesLow.list( makeSymbol( "%THREAD-MVAL-8" ), makeString(
                                                                                      "Values" ), makeString( "eighthMultipleValue" ), ConsesLow.list( makeSymbol( "THREAD" ) ) ), ConsesLow.list( makeSymbol(
                                                                                          "%THREAD-MVAL" ), makeString( "Values" ), makeString( "nthMultipleValue" ), ConsesLow.list( makeSymbol( "THREAD" ), makeSymbol(
                                                                                              "N" ) ) ), ConsesLow.list( makeSymbol( "_STRUCTURES-BAG-P", "SUBLISP" ), makeString( "Structures" ), makeString(
                                                                                                  "structures_bag_p" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "_NEW-STRUCTURE", "SUBLISP" ),
                                                                                                      makeString( "Structures" ), makeString( "new_structure" ), ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol(
                                                                                                          "SIZE" ) ) ), ConsesLow.list( makeSymbol( "_CLEAR-STRUCTURE", "SUBLISP" ), makeString( "Structures" ), makeString(
                                                                                                              "clear_structure" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "SIZE" ) ) ), ConsesLow.list(
                                                                                                                  makeSymbol( "_CLEAR-SUB-STRUCTURE", "SUBLISP" ), makeString( "Structures" ), makeString(
                                                                                                                      "clear_sub_structure" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "SIZE" ), makeSymbol(
                                                                                                                          "TYPE" ) ) ), ConsesLow.list( makeSymbol( "_STRUCTURE-TYPE", "SUBLISP" ), makeString(
                                                                                                                              "Structures" ), makeString( "structure_type" ), ConsesLow.list( makeSymbol( "OBJECT" ),
                                                                                                                                  makeSymbol( "TYPE" ) ) ), ConsesLow.list( makeSymbol( "_STRUCTURE-SLOT", "SUBLISP" ),
                                                                                                                                      makeString( "Structures" ), makeString( "structure_slot" ), ConsesLow.list(
                                                                                                                                          makeSymbol( "OBJECT" ), makeSymbol( "SLOT" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                              "_SET-STRUCTURE-SLOT", "SUBLISP" ), makeString( "Structures" ), makeString(
                                                                                                                                                  "set_structure_slot" ), ConsesLow.list( makeSymbol( "OBJECT" ),
                                                                                                                                                      makeSymbol( "SLOT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list(
                                                                                                                                                          makeSymbol( "_REGISTER-DEFSTRUCT", "SUBLISP" ), makeString(
                                                                                                                                                              "Structures" ), makeString( "register_defstruct" ), ConsesLow
                                                                                                                                                                  .list( makeSymbol( "NAME" ), makeSymbol( "TYPE" ),
                                                                                                                                                                      makeSymbol( "SIZE" ), makeSymbol( "PRINT-FUNCTION" ),
                                                                                                                                                                      makeSymbol( "SLOTS" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                          "_DEF-CSETF", "SUBLISP" ), makeString(
                                                                                                                                                                              "Structures" ), makeString( "def_csetf" ),
                                                                                                                                                                          ConsesLow.list( makeSymbol( "ACCESSOR" ),
                                                                                                                                                                              makeSymbol( "SETTER" ) ) ), ConsesLow.list(
                                                                                                                                                                                  makeSymbol( "%MAKE-STRUCT-DECL-NATIVE" ),
                                                                                                                                                                                  makeString( "Structures" ), makeString(
                                                                                                                                                                                      "makeStructDeclNative" ), ConsesLow
                                                                                                                                                                                          .list( new SubLObject[]
                                                                                                                                                                                          { makeSymbol( "CLASS" ),
                                                                                                                                                                                            makeSymbol( "TYPE" ),
                                                                                                                                                                                            makeSymbol( "PREDICATE" ),
                                                                                                                                                                                            makeSymbol( "SLOTS" ),
                                                                                                                                                                                            makeSymbol( "SLOT-KEYWORDS" ),
                                                                                                                                                                                            makeSymbol(
                                                                                                                                                                                                "FIELD-NAMES-ARRAY" ),
                                                                                                                                                                                            makeSymbol( "GETTERS" ),
                                                                                                                                                                                            makeSymbol( "SETTERS" ),
                                                                                                                                                                                            makeSymbol( "PRINT-METHOD" )
                                                                                                                                                                                  } ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                                      "_METHOD", "SUBLISP" ), makeString(
                                                                                                                                                                                          "Structures" ), makeString(
                                                                                                                                                                                              "method_func" ), ConsesLow
                                                                                                                                                                                                  .list( makeSymbol(
                                                                                                                                                                                                      "OBJECT" ),
                                                                                                                                                                                                      makeSymbol(
                                                                                                                                                                                                          "METHOD-TABLE" ) ) ),
      ConsesLow.list( makeSymbol( "_REGISTER-METHOD", "SUBLISP" ), makeString( "Structures" ), makeString( "register_method" ), ConsesLow.list( makeSymbol( "METHOD-TABLE" ), makeSymbol( "TYPE" ), makeSymbol(
          "FUNCTION" ) ) ), ConsesLow.list( makeSymbol( "%HANDLE-CATCHABLE-THROW" ), makeString( "Dynamic" ), makeString( "handleCatchableThrow" ), ConsesLow.list( makeSymbol( "CT" ), makeSymbol( "TAG" ) ) ), ConsesLow
              .list( makeSymbol( "%CDOHASH-GET-ENTRY-SET-ITERATOR" ), makeString( "Hashtables" ), makeString( "getEntrySetIterator" ), ConsesLow.list( makeSymbol( "TABLE" ) ) ), ConsesLow.list( makeSymbol(
                  "%CDOHASH-ITERATOR-HAS-NEXT" ), makeString( "Hashtables" ), makeString( "iteratorHasNext" ), ConsesLow.list( makeSymbol( "ITERATOR" ) ) ), ConsesLow.list( makeSymbol( "%CDOHASH-ITERATOR-NEXT-ENTRY" ),
                      makeString( "Hashtables" ), makeString( "iteratorNextEntry" ), ConsesLow.list( makeSymbol( "ITERATOR" ) ) ), ConsesLow.list( makeSymbol( "%CDOHASH-GET-ENTRY-KEY" ), makeString( "Hashtables" ),
                          makeString( "getEntryKey" ), ConsesLow.list( makeSymbol( "ENTRY" ) ) ), ConsesLow.list( makeSymbol( "%CDOHASH-GET-ENTRY-VALUE" ), makeString( "Hashtables" ), makeString( "getEntryValue" ),
                              ConsesLow.list( makeSymbol( "ENTRY" ) ) ), ConsesLow.list( makeSymbol( "%CDOHASH-RELEASE-ENTRY-SET-ITERATOR" ), makeString( "Hashtables" ), makeString( "releaseEntrySetIterator" ), ConsesLow
                                  .list( makeSymbol( "ITERATOR" ) ) ), ConsesLow.list( makeSymbol( "%CDO-SYMBOLS-MAKE-ITERATOR" ), makeString( "Packages" ), makeString( "makeSymbolIterator" ), ConsesLow.list( makeSymbol(
                                      "PACKAGE" ) ) ), ConsesLow.list( makeSymbol( "%CDO-SYMBOLS-ITERATOR-HAS-NEXT" ), makeString( "Packages" ), makeString( "symbolIteratorHasNext" ), ConsesLow.list( makeSymbol(
                                          "ITERATOR" ) ) ), ConsesLow.list( makeSymbol( "%CDO-SYMBOLS-ITERATOR-NEXT-VALUE" ), makeString( "Packages" ), makeString( "symbolIteratorNext" ), ConsesLow.list( makeSymbol(
                                              "ITERATOR" ) ) ), ConsesLow.list( makeSymbol( "%CURRENT-BINDING" ), makeString( "Dynamic" ), makeString( "currentBinding" ), ConsesLow.list( makeSymbol( "VAR" ) ) ),
      ConsesLow.list( makeSymbol( "%BIND" ), makeString( "Dynamic" ), makeString( "bind" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "NEW-VALUE" ) ) ), ConsesLow.list( makeSymbol( "%REBIND" ), makeString(
          "Dynamic" ), makeString( "rebind" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "OLD-VALUE" ) ) ), ConsesLow.list( makeSymbol( "%EXTRACT-DYNAMIC-VALUES" ), makeString( "Dynamic" ), makeString(
              "extract_dynamic_values" ), ConsesLow.list( makeSymbol( "DYNAMIC-VARS" ) ) ), ConsesLow.list( makeSymbol( "%BIND-DYNAMIC-VARS" ), makeString( "Dynamic" ), makeString( "bind_dynamic_vars" ), ConsesLow.list(
                  makeSymbol( "DYNAMIC-VARS" ), makeSymbol( "BINDINGS" ) ) ), ConsesLow.list( makeSymbol( "%REBIND-DYNAMIC-VARS" ), makeString( "Dynamic" ), makeString( "rebind_dynamic_vars" ), ConsesLow.list(
                      makeSymbol( "DYNAMIC-VARS" ), makeSymbol( "OLD-VALUES-ARRAY" ) ) ), ConsesLow.list( makeSymbol( "_JRTL-PARSE-INTEGER", "SUBLISP" ), makeString( "Numbers" ), makeString( "jrtl_parse_integer" ),
                          ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "START" ), makeSymbol( "END" ), makeSymbol( "RADIX" ) ) ), ConsesLow.list( makeSymbol( "START-TCP-SERVER",
                              "SUBLISP" ), makeString( "Tcp" ), makeString( "start_tcp_server" ), ConsesLow.list( makeSymbol( "PORT" ), makeSymbol( "HANDLER" ) ) ), ConsesLow.list( makeSymbol( "START-TCP-SERVER",
                                  "SUBLISP" ), makeString( "Tcp" ), makeString( "stop_tcp_server" ), ConsesLow.list( makeSymbol( "PORT" ) ) ), ConsesLow.list( makeSymbol( "%HANDLE-RUNTIME-EXCEPTION" ), makeString(
                                      "Errors" ), makeString( "handleRuntimeException" ), ConsesLow.list( makeSymbol( "RTE" ) ) ), ConsesLow.list( makeSymbol( "%HANDLE-THROWABLE" ), makeString( "Errors" ), makeString(
                                          "handleThrowable" ), ConsesLow.list( makeSymbol( "THROWABLE" ), makeSymbol( "TAG" ) ) ), ConsesLow.list( makeSymbol( "%COMPUTE-WITH-PROCESS-RESOURCE-TRACKING-RESULTS" ),
                                              makeString( "Time" ), makeString( "compute_with_process_resource_tracking_results" ), ConsesLow.list( makeSymbol( "ENV" ) ) ), ConsesLow.list( makeSymbol(
                                                  "GET-STATIC-AREA" ), makeString( "Storage" ), makeString( "get_static_area" ), NIL ), ConsesLow.list( makeSymbol( "GET-THREAD-PRIVATE-AREA" ), makeString( "Storage" ),
                                                      makeString( "get_thread_private_area" ), NIL ), ConsesLow.list( makeSymbol( "GET-WORKING-AREA" ), makeString( "Storage" ), makeString( "get_working_area" ), NIL ),
      ConsesLow.list( makeSymbol( "%SCHEDULE-CURRENT-PROCESS-FOR-TIMEOUT" ), makeString( "Time" ), makeString( "schedule_current_process_for_timeout" ), ConsesLow.list( makeSymbol( "TAG" ), makeSymbol( "TIME" ) ) ),
      ConsesLow.list( makeSymbol( "%ENSURE-CURRENT-PROCESS-TIMEOUT-IS-CANCELLED" ), makeString( "Time" ), makeString( "ensure_current_process_timeout_is_cancelled" ), NIL ), ConsesLow.list( makeSymbol(
          "_CSETF-READTABLE-CASE", "SUBLISP" ), makeString( "reader" ), makeString( "_csetf_readtable_case" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol(
              "_CSETF-READTABLE-CHARACTER-SYNTAX", "SUBLISP" ), makeString( "reader" ), makeString( "_csetf_readtable_character_syntax" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow
                  .list( makeSymbol( "_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX", "SUBLISP" ), makeString( "reader" ), makeString( "_csetf_readtable_single_byte_char_syntax" ), ConsesLow.list( makeSymbol( "OBJECT" ),
                      makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "_CSETF-READTABLE-MACRO-FUNCTIONS", "SUBLISP" ), makeString( "reader" ), makeString( "_csetf_readtable_macro_functions" ), ConsesLow.list(
                          makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", "SUBLISP" ), makeString( "reader" ), makeString(
                              "_csetf_readtable_single_byte_macro_functions" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "_CSETF-READTABLE-CONSTITUENT-TRAITS",
                                  "SUBLISP" ), makeString( "reader" ), makeString( "_csetf_readtable_constituent_traits" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol(
                                      "_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", "SUBLISP" ), makeString( "reader" ), makeString( "_csetf_readtable_single_byte_constit_traits" ), ConsesLow.list( makeSymbol(
                                          "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "_CSETF-READTABLE-DISPATCH-TABLES", "SUBLISP" ), makeString( "reader" ), makeString(
                                              "_csetf_readtable_dispatch_tables" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "IS-REGEX-IMPLEMENTATION-AVAILABLE?",
                                                  "SUBLISP" ), makeString( "Regex" ), makeString( "is_regex_implementation_availableP" ), NIL ), ConsesLow.list( makeSymbol( "REGEX-VERSION", "SUBLISP" ), makeString(
                                                      "Regex" ), makeString( "regex_version" ), NIL ), ConsesLow.list( makeSymbol( "REGEX-PATTERN-P-IMPL", "SUBLISP" ), makeString( "Regex" ), makeString(
                                                          "regex_pattern_p_impl" ), ConsesLow.list( makeSymbol( "PATTERN" ) ) ), ConsesLow.list( makeSymbol( "COMPILE-REGULAR-EXPRESSION-IMPL", "SUBLISP" ), makeString(
                                                              "Regex" ), makeString( "compile_regular_expression_impl" ), ConsesLow.list( makeSymbol( "EXPRESSION" ), makeSymbol( "OPTION-VALUE" ) ) ), ConsesLow.list(
                                                                  makeSymbol( "MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS-IMPL", "SUBLISP" ), makeString( "Regex" ), makeString(
                                                                      "match_regular_expression_pattern_offsets_impl" ), ConsesLow.list( makeSymbol( "PATTERN" ), makeSymbol( "STRING" ), makeSymbol( "MATCHES" ),
                                                                          makeSymbol( "OPTION-VALUE" ), makeSymbol( "START" ), makeSymbol( "END" ) ) ), ConsesLow.list( makeSymbol(
                                                                              "DISCARD-REGULAR-EXPRESSION-PATTERN-IMPL", "SUBLISP" ), makeString( "Regex" ), makeString( "discard_regular_expression_pattern_impl" ),
                                                                              ConsesLow.list( makeSymbol( "PATTERN" ) ) ), ConsesLow.list( makeSymbol( "GET-REGEX-ERRORMSG", "SUBLISP" ), makeString( "Regex" ), makeString(
                                                                                  "get_regex_errormsg" ), ConsesLow.list( makeSymbol( "CODE" ) ) ), ConsesLow.list( makeSymbol( "%UNIMPLEMENTED-METHOD" ), makeString(
                                                                                      "Errors" ), makeString( "unimplementedMethod" ), ConsesLow.list( makeSymbol( "NAME" ) ) )
    } );
  }

  private static SubLObject _constant_7_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "%ADD2" ), makeString( "Numbers" ), makeString( "add" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list(
        makeSymbol( "%ADD3" ), makeString( "Numbers" ), makeString( "add" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ), makeSymbol( "NUM3" ) ) ), ConsesLow.list( makeSymbol( "%APPEND2" ), makeString(
            "ConsesLow" ), makeString( "append" ), ConsesLow.list( makeSymbol( "LIST1" ), makeSymbol( "LIST2" ) ) ), ConsesLow.list( makeSymbol( "%APPEND3" ), makeString( "ConsesLow" ), makeString( "append" ), ConsesLow
                .list( makeSymbol( "LIST1" ), makeSymbol( "LIST2" ), makeSymbol( "LIST3" ) ) ), ConsesLow.list( makeSymbol( "%APPEND4" ), makeString( "ConsesLow" ), makeString( "append" ), ConsesLow.list( makeSymbol(
                    "LIST1" ), makeSymbol( "LIST2" ), makeSymbol( "LIST3" ), makeSymbol( "LIST4" ) ) ), ConsesLow.list( makeSymbol( "%APPLY2" ), makeString( "Functions" ), makeString( "apply" ), ConsesLow.list(
                        makeSymbol( "FUNC" ), makeSymbol( "ARG1" ) ) ), ConsesLow.list( makeSymbol( "%APPLY3" ), makeString( "Functions" ), makeString( "apply" ), ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol(
                            "ARG1" ), makeSymbol( "ARG2" ) ) ), ConsesLow.list( makeSymbol( "%BREAK1" ), makeString( "Errors" ), makeString( "sublisp_break" ), ConsesLow.list( makeSymbol( "FORMAT-STRING" ) ) ), ConsesLow
                                .list( makeSymbol( "%CERROR2" ), makeString( "Errors" ), makeString( "cerror" ), ConsesLow.list( makeSymbol( "CONTINUE-STRING" ), makeSymbol( "FORMAT-STRING" ) ) ), ConsesLow.list(
                                    makeSymbol( "%CERROR3" ), makeString( "Errors" ), makeString( "cerror" ), ConsesLow.list( makeSymbol( "CONTINUE-STRING" ), makeSymbol( "FORMAT-STRING" ), makeSymbol( "ARG1" ) ) ),
      ConsesLow.list( makeSymbol( "%CERROR4" ), makeString( "Errors" ), makeString( "cerror" ), ConsesLow.list( makeSymbol( "CONTINUE-STRING" ), makeSymbol( "FORMAT-STRING" ), makeSymbol( "ARG1" ), makeSymbol(
          "ARG2" ) ) ), ConsesLow.list( makeSymbol( "%CERROR5" ), makeString( "Errors" ), makeString( "cerror" ), ConsesLow.list( makeSymbol( "CONTINUE-STRING" ), makeSymbol( "FORMAT-STRING" ), makeSymbol( "ARG1" ),
              makeSymbol( "ARG2" ), makeSymbol( "ARG3" ) ) ), ConsesLow.list( makeSymbol( "%CONCAT2" ), makeString( "Sequences" ), makeString( "cconcatenate" ), ConsesLow.list( makeSymbol( "SEQUENCE1" ), makeSymbol(
                  "SEQUENCE2" ) ) ), ConsesLow.list( makeSymbol( "%DIV2" ), makeString( "Numbers" ), makeString( "divide" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol(
                      "%ERROR1" ), makeString( "Errors" ), makeString( "error" ), ConsesLow.list( makeSymbol( "FORMAT-STRING" ) ) ), ConsesLow.list( makeSymbol( "%ERROR2" ), makeString( "Errors" ), makeString( "error" ),
                          ConsesLow.list( makeSymbol( "FORMAT-STRING" ), makeSymbol( "ARG1" ) ) ), ConsesLow.list( makeSymbol( "%ERROR3" ), makeString( "Errors" ), makeString( "error" ), ConsesLow.list( makeSymbol(
                              "FORMAT-STRING" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) ) ), ConsesLow.list( makeSymbol( "%ERROR4" ), makeString( "Errors" ), makeString( "error" ), ConsesLow.list( makeSymbol(
                                  "FORMAT-STRING" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "ARG3" ) ) ), ConsesLow.list( makeSymbol( "%FALSE0" ), makeString( "Types" ), makeString( "sublisp_false" ),
                                      NIL ), ConsesLow.list( makeSymbol( "%FALSE1" ), makeString( "Types" ), makeString( "sublisp_false" ), ConsesLow.list( makeSymbol( "ARG" ) ) ), ConsesLow.list( makeSymbol(
                                          "%FALSE2" ), makeString( "Types" ), makeString( "sublisp_false" ), ConsesLow.list( makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) ) ), ConsesLow.list( makeSymbol( "%FORMAT2" ),
                                              makeString( "PrintLow" ), makeString( "format" ), ConsesLow.list( makeSymbol( "DESTINATION" ), makeSymbol( "FORMAT-CONTROL" ) ) ), ConsesLow.list( makeSymbol( "%FORMAT3" ),
                                                  makeString( "PrintLow" ), makeString( "format" ), ConsesLow.list( makeSymbol( "DESTINATION" ), makeSymbol( "FORMAT-CONTROL" ), makeSymbol( "ARG1" ) ) ), ConsesLow.list(
                                                      makeSymbol( "%FORMAT4" ), makeString( "PrintLow" ), makeString( "format" ), ConsesLow.list( makeSymbol( "DESTINATION" ), makeSymbol( "FORMAT-CONTROL" ), makeSymbol(
                                                          "ARG1" ), makeSymbol( "ARG2" ) ) ), ConsesLow.list( makeSymbol( "%FUNCALL1" ), makeString( "Functions" ), makeString( "funcall" ), ConsesLow.list( makeSymbol(
                                                              "FUNCTION" ) ) ), ConsesLow.list( makeSymbol( "%FUNCALL2" ), makeString( "Functions" ), makeString( "funcall" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
                                                                  makeSymbol( "ARG1" ) ) ), ConsesLow.list( makeSymbol( "%FUNCALL3" ), makeString( "Functions" ), makeString( "funcall" ), ConsesLow.list( makeSymbol(
                                                                      "FUNCTION" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) ) ), ConsesLow.list( makeSymbol( "%FUNCALL4" ), makeString( "Functions" ), makeString(
                                                                          "funcall" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "ARG3" ) ) ), ConsesLow.list(
                                                                              makeSymbol( "%FUNCALL5" ), makeString( "Functions" ), makeString( "funcall" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ARG1" ),
                                                                                  makeSymbol( "ARG2" ), makeSymbol( "ARG3" ), makeSymbol( "ARG4" ) ) ), ConsesLow.list( makeSymbol( "%FUNCALL6" ), makeString(
                                                                                      "Functions" ), makeString( "funcall" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ),
                                                                                          makeSymbol( "ARG3" ), makeSymbol( "ARG4" ), makeSymbol( "ARG5" ) ) ), ConsesLow.list( makeSymbol( "%FUNCALL7" ), makeString(
                                                                                              "Functions" ), makeString( "funcall" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ),
                                                                                                  makeSymbol( "ARG3" ), makeSymbol( "ARG4" ), makeSymbol( "ARG5" ), makeSymbol( "ARG6" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                      "%INVERT" ), makeString( "Numbers" ), makeString( "invert" ), ConsesLow.list( makeSymbol( "NUM" ) ) ), ConsesLow.list(
                                                                                                          makeSymbol( "%LIST*1" ), makeKeyword( "IMPORTED" ), makeString( "listS" ), ConsesLow.list( makeSymbol(
                                                                                                              "FINAL-CDR" ) ) ), ConsesLow.list( makeSymbol( "%LIST*2" ), makeKeyword( "IMPORTED" ), makeString( "listS" ),
                                                                                                                  ConsesLow.list( makeSymbol( "OBJECT1" ), makeSymbol( "FINAL-CDR" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                      "%LIST*3" ), makeKeyword( "IMPORTED" ), makeString( "listS" ), ConsesLow.list( makeSymbol(
                                                                                                                          "OBJECT1" ), makeSymbol( "OBJECT2" ), makeSymbol( "FINAL-CDR" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                              "%LIST*4" ), makeKeyword( "IMPORTED" ), makeString( "listS" ), ConsesLow.list( makeSymbol(
                                                                                                                                  "OBJECT1" ), makeSymbol( "OBJECT2" ), makeSymbol( "OBJECT3" ), makeSymbol(
                                                                                                                                      "FINAL-CDR" ) ) ), ConsesLow.list( makeSymbol( "%LIST*5" ), makeKeyword( "IMPORTED" ),
                                                                                                                                          makeString( "listS" ), ConsesLow.list( makeSymbol( "OBJECT1" ), makeSymbol(
                                                                                                                                              "OBJECT2" ), makeSymbol( "OBJECT3" ), makeSymbol( "OBJECT4" ), makeSymbol(
                                                                                                                                                  "FINAL-CDR" ) ) ), ConsesLow.list( makeSymbol( "%LIST*6" ), makeKeyword(
                                                                                                                                                      "IMPORTED" ), makeString( "listS" ), ConsesLow.list( makeSymbol(
                                                                                                                                                          "OBJECT1" ), makeSymbol( "OBJECT2" ), makeSymbol( "OBJECT3" ),
                                                                                                                                                          makeSymbol( "OBJECT4" ), makeSymbol( "OBJECT5" ), makeSymbol(
                                                                                                                                                              "FINAL-CDR" ) ) ), ConsesLow.list( makeSymbol( "%LIST1" ),
                                                                                                                                                                  makeKeyword( "IMPORTED" ), makeString( "list" ), ConsesLow
                                                                                                                                                                      .list( makeSymbol( "OBJECT1" ) ) ), ConsesLow.list(
                                                                                                                                                                          makeSymbol( "%LIST2" ), makeKeyword( "IMPORTED" ),
                                                                                                                                                                          makeString( "list" ), ConsesLow.list( makeSymbol(
                                                                                                                                                                              "OBJECT1" ), makeSymbol( "OBJECT2" ) ) ),
      ConsesLow.list( makeSymbol( "%LIST3" ), makeKeyword( "IMPORTED" ), makeString( "list" ), ConsesLow.list( makeSymbol( "OBJECT1" ), makeSymbol( "OBJECT2" ), makeSymbol( "OBJECT3" ) ) ), ConsesLow.list( makeSymbol(
          "%LIST4" ), makeKeyword( "IMPORTED" ), makeString( "list" ), ConsesLow.list( makeSymbol( "OBJECT1" ), makeSymbol( "OBJECT2" ), makeSymbol( "OBJECT3" ), makeSymbol( "OBJECT4" ) ) ), ConsesLow.list( makeSymbol(
              "%LIST5" ), makeKeyword( "IMPORTED" ), makeString( "list" ), ConsesLow.list( makeSymbol( "OBJECT1" ), makeSymbol( "OBJECT2" ), makeSymbol( "OBJECT3" ), makeSymbol( "OBJECT4" ), makeSymbol( "OBJECT5" ) ) ),
      ConsesLow.list( makeSymbol( "%LIST6" ), makeKeyword( "IMPORTED" ), makeString( "list" ), ConsesLow.list( makeSymbol( "OBJECT1" ), makeSymbol( "OBJECT2" ), makeSymbol( "OBJECT3" ), makeSymbol( "OBJECT4" ),
          makeSymbol( "OBJECT5" ), makeSymbol( "OBJECT6" ) ) ), ConsesLow.list( makeSymbol( "%LIST7" ), makeKeyword( "IMPORTED" ), makeString( "list" ), ConsesLow.list( makeSymbol( "OBJECT1" ), makeSymbol( "OBJECT2" ),
              makeSymbol( "OBJECT3" ), makeSymbol( "OBJECT4" ), makeSymbol( "OBJECT5" ), makeSymbol( "OBJECT6" ), makeSymbol( "OBJECT7" ) ) ), ConsesLow.list( makeSymbol( "%LIST8" ), makeKeyword( "IMPORTED" ),
                  makeString( "list" ), ConsesLow.list( makeSymbol( "OBJECT1" ), makeSymbol( "OBJECT2" ), makeSymbol( "OBJECT3" ), makeSymbol( "OBJECT4" ), makeSymbol( "OBJECT5" ), makeSymbol( "OBJECT6" ), makeSymbol(
                      "OBJECT7" ), makeSymbol( "OBJECT8" ) ) ), ConsesLow.list( makeSymbol( "%LOGAND2" ), makeString( "Numbers" ), makeString( "logand" ), ConsesLow.list( makeSymbol( "INT1" ), makeSymbol( "INT2" ) ) ),
      ConsesLow.list( makeSymbol( "%LOGIOR2" ), makeString( "Numbers" ), makeString( "logior" ), ConsesLow.list( makeSymbol( "INT1" ), makeSymbol( "INT2" ) ) ), ConsesLow.list( makeSymbol( "%LOGIOR3" ), makeString(
          "Numbers" ), makeString( "logior" ), ConsesLow.list( makeSymbol( "INT1" ), makeSymbol( "INT2" ), makeSymbol( "INT3" ) ) ), ConsesLow.list( makeSymbol( "%LOGXOR2" ), makeString( "Numbers" ), makeString(
              "logxor" ), ConsesLow.list( makeSymbol( "INT1" ), makeSymbol( "INT2" ) ) ), ConsesLow.list( makeSymbol( "%MAPCAR2" ), makeString( "Mapping" ), makeString( "mapcar" ), ConsesLow.list( makeSymbol(
                  "FUNCTION-SPEC" ), makeSymbol( "LIST" ) ) ), ConsesLow.list( makeSymbol( "%MAX2" ), makeString( "Numbers" ), makeString( "max" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ),
      ConsesLow.list( makeSymbol( "%MIN2" ), makeString( "Numbers" ), makeString( "min" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%MINUS" ), makeString( "Numbers" ),
          makeString( "minus" ), ConsesLow.list( makeSymbol( "NUM" ) ) ), ConsesLow.list( makeSymbol( "%MULT2" ), makeString( "Numbers" ), makeString( "multiply" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol(
              "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%MULT3" ), makeString( "Numbers" ), makeString( "multiply" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ), makeSymbol( "NUM3" ) ) ), ConsesLow.list(
                  makeSymbol( "%NCONC2" ), makeString( "ConsesLow" ), makeString( "nconc" ), ConsesLow.list( makeSymbol( "LIST1" ), makeSymbol( "LIST2" ) ) ), ConsesLow.list( makeSymbol( "%NCONC3" ), makeString(
                      "ConsesLow" ), makeString( "nconc" ), ConsesLow.list( makeSymbol( "LIST1" ), makeSymbol( "LIST2" ), makeSymbol( "LIST3" ) ) ), ConsesLow.list( makeSymbol( "%STRING<=2" ), makeString( "Strings" ),
                          makeString( "stringLE" ), ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ) ) ), ConsesLow.list( makeSymbol( "%SUB2" ), makeString( "Numbers" ), makeString( "subtract" ),
                              ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%SUB3" ), makeString( "Numbers" ), makeString( "subtract" ), ConsesLow.list( makeSymbol(
                                  "NUM1" ), makeSymbol( "NUM2" ), makeSymbol( "NUM3" ) ) ), ConsesLow.list( makeSymbol( "%TRUE0" ), makeString( "Types" ), makeString( "sublisp_true" ), NIL ), ConsesLow.list( makeSymbol(
                                      "%TRUE1" ), makeString( "Types" ), makeString( "sublisp_true" ), ConsesLow.list( makeSymbol( "ARG" ) ) ), ConsesLow.list( makeSymbol( "%TRUE2" ), makeString( "Types" ), makeString(
                                          "sublisp_true" ), ConsesLow.list( makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) ) ), ConsesLow.list( makeSymbol( "%VALUES1" ), makeString( "Values" ), makeString( "values" ),
                                              ConsesLow.list( makeSymbol( "VALUE1" ) ) ), ConsesLow.list( makeSymbol( "%VALUES2" ), makeString( "Values" ), makeString( "values" ), ConsesLow.list( makeSymbol( "VALUE1" ),
                                                  makeSymbol( "VALUE2" ) ) ), ConsesLow.list( makeSymbol( "%VALUES3" ), makeString( "Values" ), makeString( "values" ), ConsesLow.list( makeSymbol( "VALUE1" ), makeSymbol(
                                                      "VALUE2" ), makeSymbol( "VALUE3" ) ) ), ConsesLow.list( makeSymbol( "%VALUES4" ), makeString( "Values" ), makeString( "values" ), ConsesLow.list( makeSymbol(
                                                          "VALUE1" ), makeSymbol( "VALUE2" ), makeSymbol( "VALUE3" ), makeSymbol( "VALUE4" ) ) ), ConsesLow.list( makeSymbol( "%VALUES5" ), makeString( "Values" ),
                                                              makeString( "values" ), ConsesLow.list( makeSymbol( "VALUE1" ), makeSymbol( "VALUE2" ), makeSymbol( "VALUE3" ), makeSymbol( "VALUE4" ), makeSymbol(
                                                                  "VALUE5" ) ) ), ConsesLow.list( makeSymbol( "%VALUES6" ), makeString( "Values" ), makeString( "values" ), ConsesLow.list( makeSymbol( "VALUE1" ),
                                                                      makeSymbol( "VALUE2" ), makeSymbol( "VALUE3" ), makeSymbol( "VALUE4" ), makeSymbol( "VALUE5" ), makeSymbol( "VALUE6" ) ) ), ConsesLow.list(
                                                                          makeSymbol( "%VALUES7" ), makeString( "Values" ), makeString( "values" ), ConsesLow.list( makeSymbol( "VALUE1" ), makeSymbol( "VALUE2" ),
                                                                              makeSymbol( "VALUE3" ), makeSymbol( "VALUE4" ), makeSymbol( "VALUE5" ), makeSymbol( "VALUE6" ), makeSymbol( "VALUE7" ) ) ), ConsesLow.list(
                                                                                  makeSymbol( "%VALUES8" ), makeString( "Values" ), makeString( "values" ), ConsesLow.list( makeSymbol( "VALUE1" ), makeSymbol( "VALUE2" ),
                                                                                      makeSymbol( "VALUE3" ), makeSymbol( "VALUE4" ), makeSymbol( "VALUE5" ), makeSymbol( "VALUE6" ), makeSymbol( "VALUE7" ), makeSymbol(
                                                                                          "VALUE8" ) ) ), ConsesLow.list( makeSymbol( "%WARN1" ), makeString( "Errors" ), makeString( "warn" ), ConsesLow.list( makeSymbol(
                                                                                              "FORMAT-STRING" ) ) ), ConsesLow.list( makeSymbol( "%WARN2" ), makeString( "Errors" ), makeString( "warn" ), ConsesLow.list(
                                                                                                  makeSymbol( "FORMAT-STRING" ), makeSymbol( "ARG1" ) ) ), ConsesLow.list( makeSymbol( "%WARN3" ), makeString( "Errors" ),
                                                                                                      makeString( "warn" ), ConsesLow.list( makeSymbol( "FORMAT-STRING" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) ) ),
      ConsesLow.list( makeSymbol( "%WARN4" ), makeString( "Errors" ), makeString( "warn" ), ConsesLow.list( makeSymbol( "FORMAT-STRING" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "ARG3" ) ) )
    } );
  }

  private static SubLObject _constant_29_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.cons( T, makeString( "T" ) ), ConsesLow.cons( NIL, makeString( "NIL" ) ), ConsesLow.cons( EQ, makeString( "EQ" ) ), ConsesLow.cons( EQL, makeString( "EQL" ) ),
      ConsesLow.cons( EQUAL, makeString( "EQUAL" ) ), ConsesLow.cons( EQUALP, makeString( "EQUALP" ) ), ConsesLow.cons( IDENTITY, makeString( "IDENTITY" ) ), ConsesLow.cons( MINUS_ONE_INTEGER, makeString(
          "MINUS_ONE_INTEGER" ) ), ConsesLow.cons( ZERO_INTEGER, makeString( "ZERO_INTEGER" ) ), ConsesLow.cons( ONE_INTEGER, makeString( "ONE_INTEGER" ) ), ConsesLow.cons( TWO_INTEGER, makeString( "TWO_INTEGER" ) ),
      ConsesLow.cons( THREE_INTEGER, makeString( "THREE_INTEGER" ) ), ConsesLow.cons( FOUR_INTEGER, makeString( "FOUR_INTEGER" ) ), ConsesLow.cons( FIVE_INTEGER, makeString( "FIVE_INTEGER" ) ), ConsesLow.cons(
          SIX_INTEGER, makeString( "SIX_INTEGER" ) ), ConsesLow.cons( SEVEN_INTEGER, makeString( "SEVEN_INTEGER" ) ), ConsesLow.cons( EIGHT_INTEGER, makeString( "EIGHT_INTEGER" ) ), ConsesLow.cons( NINE_INTEGER,
              makeString( "NINE_INTEGER" ) ), ConsesLow.cons( TEN_INTEGER, makeString( "TEN_INTEGER" ) ), ConsesLow.cons( ELEVEN_INTEGER, makeString( "ELEVEN_INTEGER" ) ), ConsesLow.cons( TWELVE_INTEGER, makeString(
                  "TWELVE_INTEGER" ) ), ConsesLow.cons( THIRTEEN_INTEGER, makeString( "THIRTEEN_INTEGER" ) ), ConsesLow.cons( FOURTEEN_INTEGER, makeString( "FOURTEEN_INTEGER" ) ), ConsesLow.cons( FIFTEEN_INTEGER,
                      makeString( "FIFTEEN_INTEGER" ) ), ConsesLow.cons( SIXTEEN_INTEGER, makeString( "SIXTEEN_INTEGER" ) ), ConsesLow.cons( SEVENTEEN_INTEGER, makeString( "SEVENTEEN_INTEGER" ) ), ConsesLow.cons(
                          EIGHTEEN_INTEGER, makeString( "EIGHTEEN_INTEGER" ) ), ConsesLow.cons( NINETEEN_INTEGER, makeString( "NINETEEN_INTEGER" ) ), ConsesLow.cons( TWENTY_INTEGER, makeString( "TWENTY_INTEGER" ) ),
      ConsesLow.cons( Characters.CHAR_null, makeString( "Characters.CHAR_null" ) ), ConsesLow.cons( Characters.CHAR_backspace, makeString( "Characters.CHAR_backspace" ) ), ConsesLow.cons( Characters.CHAR_tab, makeString(
          "Characters.CHAR_tab" ) ), ConsesLow.cons( Characters.CHAR_newline, makeString( "Characters.CHAR_newline" ) ), ConsesLow.cons( Characters.CHAR_return, makeString( "Characters.CHAR_return" ) ), ConsesLow.cons(
              Characters.CHAR_page, makeString( "Characters.CHAR_page" ) ), ConsesLow.cons( Characters.CHAR_escape, makeString( "Characters.CHAR_escape" ) ), ConsesLow.cons( Characters.CHAR_space, makeString(
                  "Characters.CHAR_space" ) ), ConsesLow.cons( Characters.CHAR_exclamation, makeString( "Characters.CHAR_exclamation" ) ), ConsesLow.cons( Characters.CHAR_quotation, makeString(
                      "Characters.CHAR_quotation" ) ), ConsesLow.cons( Characters.CHAR_hash, makeString( "Characters.CHAR_hash" ) ), ConsesLow.cons( Characters.CHAR_dollar, makeString( "Characters.CHAR_dollar" ) ),
      ConsesLow.cons( Characters.CHAR_percent, makeString( "Characters.CHAR_percent" ) ), ConsesLow.cons( Characters.CHAR_ampersand, makeString( "Characters.CHAR_ampersand" ) ), ConsesLow.cons( Characters.CHAR_quote,
          makeString( "Characters.CHAR_quote" ) ), ConsesLow.cons( Characters.CHAR_lparen, makeString( "Characters.CHAR_lparen" ) ), ConsesLow.cons( Characters.CHAR_rparen, makeString( "Characters.CHAR_rparen" ) ),
      ConsesLow.cons( Characters.CHAR_asterisk, makeString( "Characters.CHAR_asterisk" ) ), ConsesLow.cons( Characters.CHAR_plus, makeString( "Characters.CHAR_plus" ) ), ConsesLow.cons( Characters.CHAR_comma, makeString(
          "Characters.CHAR_comma" ) ), ConsesLow.cons( Characters.CHAR_hyphen, makeString( "Characters.CHAR_hyphen" ) ), ConsesLow.cons( Characters.CHAR_period, makeString( "Characters.CHAR_period" ) ), ConsesLow.cons(
              Characters.CHAR_slash, makeString( "Characters.CHAR_slash" ) ), ConsesLow.cons( Characters.CHAR_0, makeString( "Characters.CHAR_0" ) ), ConsesLow.cons( Characters.CHAR_1, makeString(
                  "Characters.CHAR_1" ) ), ConsesLow.cons( Characters.CHAR_2, makeString( "Characters.CHAR_2" ) ), ConsesLow.cons( Characters.CHAR_3, makeString( "Characters.CHAR_3" ) ), ConsesLow.cons(
                      Characters.CHAR_4, makeString( "Characters.CHAR_4" ) ), ConsesLow.cons( Characters.CHAR_5, makeString( "Characters.CHAR_5" ) ), ConsesLow.cons( Characters.CHAR_6, makeString(
                          "Characters.CHAR_6" ) ), ConsesLow.cons( Characters.CHAR_7, makeString( "Characters.CHAR_7" ) ), ConsesLow.cons( Characters.CHAR_8, makeString( "Characters.CHAR_8" ) ), ConsesLow.cons(
                              Characters.CHAR_9, makeString( "Characters.CHAR_9" ) ), ConsesLow.cons( Characters.CHAR_colon, makeString( "Characters.CHAR_colon" ) ), ConsesLow.cons( Characters.CHAR_semicolon, makeString(
                                  "Characters.CHAR_semicolon" ) ), ConsesLow.cons( Characters.CHAR_less, makeString( "Characters.CHAR_less" ) ), ConsesLow.cons( Characters.CHAR_equal, makeString(
                                      "Characters.CHAR_equal" ) ), ConsesLow.cons( Characters.CHAR_greater, makeString( "Characters.CHAR_greater" ) ), ConsesLow.cons( Characters.CHAR_question, makeString(
                                          "Characters.CHAR_question" ) ), ConsesLow.cons( Characters.CHAR_at, makeString( "Characters.CHAR_at" ) ), ConsesLow.cons( Characters.CHAR_A, makeString( "Characters.CHAR_A" ) ),
      ConsesLow.cons( Characters.CHAR_B, makeString( "Characters.CHAR_B" ) ), ConsesLow.cons( Characters.CHAR_C, makeString( "Characters.CHAR_C" ) ), ConsesLow.cons( Characters.CHAR_D, makeString(
          "Characters.CHAR_D" ) ), ConsesLow.cons( Characters.CHAR_E, makeString( "Characters.CHAR_E" ) ), ConsesLow.cons( Characters.CHAR_F, makeString( "Characters.CHAR_F" ) ), ConsesLow.cons( Characters.CHAR_G,
              makeString( "Characters.CHAR_G" ) ), ConsesLow.cons( Characters.CHAR_H, makeString( "Characters.CHAR_H" ) ), ConsesLow.cons( Characters.CHAR_I, makeString( "Characters.CHAR_I" ) ), ConsesLow.cons(
                  Characters.CHAR_J, makeString( "Characters.CHAR_J" ) ), ConsesLow.cons( Characters.CHAR_K, makeString( "Characters.CHAR_K" ) ), ConsesLow.cons( Characters.CHAR_L, makeString( "Characters.CHAR_L" ) ),
      ConsesLow.cons( Characters.CHAR_M, makeString( "Characters.CHAR_M" ) ), ConsesLow.cons( Characters.CHAR_N, makeString( "Characters.CHAR_N" ) ), ConsesLow.cons( Characters.CHAR_O, makeString(
          "Characters.CHAR_O" ) ), ConsesLow.cons( Characters.CHAR_P, makeString( "Characters.CHAR_P" ) ), ConsesLow.cons( Characters.CHAR_Q, makeString( "Characters.CHAR_Q" ) ), ConsesLow.cons( Characters.CHAR_R,
              makeString( "Characters.CHAR_R" ) ), ConsesLow.cons( Characters.CHAR_S, makeString( "Characters.CHAR_S" ) ), ConsesLow.cons( Characters.CHAR_T, makeString( "Characters.CHAR_T" ) ), ConsesLow.cons(
                  Characters.CHAR_U, makeString( "Characters.CHAR_U" ) ), ConsesLow.cons( Characters.CHAR_V, makeString( "Characters.CHAR_V" ) ), ConsesLow.cons( Characters.CHAR_W, makeString( "Characters.CHAR_W" ) ),
      ConsesLow.cons( Characters.CHAR_X, makeString( "Characters.CHAR_X" ) ), ConsesLow.cons( Characters.CHAR_Y, makeString( "Characters.CHAR_Y" ) ), ConsesLow.cons( Characters.CHAR_Z, makeString(
          "Characters.CHAR_Z" ) ), ConsesLow.cons( Characters.CHAR_lbracket, makeString( "Characters.CHAR_lbracket" ) ), ConsesLow.cons( Characters.CHAR_backslash, makeString( "Characters.CHAR_backslash" ) ), ConsesLow
              .cons( Characters.CHAR_rbracket, makeString( "Characters.CHAR_rbracket" ) ), ConsesLow.cons( Characters.CHAR_caret, makeString( "Characters.CHAR_caret" ) ), ConsesLow.cons( Characters.CHAR_underbar,
                  makeString( "Characters.CHAR_underbar" ) ), ConsesLow.cons( Characters.CHAR_backquote, makeString( "Characters.CHAR_backquote" ) ), ConsesLow.cons( Characters.CHAR_a, makeString(
                      "Characters.CHAR_a" ) ), ConsesLow.cons( Characters.CHAR_b, makeString( "Characters.CHAR_b" ) ), ConsesLow.cons( Characters.CHAR_c, makeString( "Characters.CHAR_c" ) ), ConsesLow.cons(
                          Characters.CHAR_d, makeString( "Characters.CHAR_d" ) ), ConsesLow.cons( Characters.CHAR_e, makeString( "Characters.CHAR_e" ) ), ConsesLow.cons( Characters.CHAR_f, makeString(
                              "Characters.CHAR_f" ) ), ConsesLow.cons( Characters.CHAR_g, makeString( "Characters.CHAR_g" ) ), ConsesLow.cons( Characters.CHAR_h, makeString( "Characters.CHAR_h" ) ), ConsesLow.cons(
                                  Characters.CHAR_i, makeString( "Characters.CHAR_i" ) ), ConsesLow.cons( Characters.CHAR_j, makeString( "Characters.CHAR_j" ) ), ConsesLow.cons( Characters.CHAR_k, makeString(
                                      "Characters.CHAR_k" ) ), ConsesLow.cons( Characters.CHAR_l, makeString( "Characters.CHAR_l" ) ), ConsesLow.cons( Characters.CHAR_m, makeString( "Characters.CHAR_m" ) ), ConsesLow
                                          .cons( Characters.CHAR_n, makeString( "Characters.CHAR_n" ) ), ConsesLow.cons( Characters.CHAR_o, makeString( "Characters.CHAR_o" ) ), ConsesLow.cons( Characters.CHAR_p,
                                              makeString( "Characters.CHAR_p" ) ), ConsesLow.cons( Characters.CHAR_q, makeString( "Characters.CHAR_q" ) ), ConsesLow.cons( Characters.CHAR_r, makeString(
                                                  "Characters.CHAR_r" ) ), ConsesLow.cons( Characters.CHAR_s, makeString( "Characters.CHAR_s" ) ), ConsesLow.cons( Characters.CHAR_t, makeString( "Characters.CHAR_t" ) ),
      ConsesLow.cons( Characters.CHAR_u, makeString( "Characters.CHAR_u" ) ), ConsesLow.cons( Characters.CHAR_v, makeString( "Characters.CHAR_v" ) ), ConsesLow.cons( Characters.CHAR_w, makeString(
          "Characters.CHAR_w" ) ), ConsesLow.cons( Characters.CHAR_x, makeString( "Characters.CHAR_x" ) ), ConsesLow.cons( Characters.CHAR_y, makeString( "Characters.CHAR_y" ) ), ConsesLow.cons( Characters.CHAR_z,
              makeString( "Characters.CHAR_z" ) ), ConsesLow.cons( Characters.CHAR_lbrace, makeString( "Characters.CHAR_lbrace" ) ), ConsesLow.cons( Characters.CHAR_vertical, makeString( "Characters.CHAR_vertical" ) ),
      ConsesLow.cons( Characters.CHAR_rbrace, makeString( "Characters.CHAR_rbrace" ) ), ConsesLow.cons( Characters.CHAR_tilde, makeString( "Characters.CHAR_tilde" ) ), ConsesLow.cons( Characters.CHAR_rubout, makeString(
          "Characters.CHAR_rubout" ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_java_name_translation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_java_name_translation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_java_name_translation_file();
  }
  static
  {
    me = new java_name_translation();
    $java_backend_reserved_words$ = null;
    $java_backend_defined_function_class_data$ = null;
    $java_backend_defined_function_name_exceptions$ = null;
    $java_backend_undefined_function_name_data$ = null;
    $java_backend_function_arity_version_table$ = null;
    $java_backend_undefined_arity_function_name_data$ = null;
    $java_backend_function_boolean_method_table$ = null;
    $java_backend_function_boolean_hash$ = null;
    $java_backend_function_to_method_table$ = null;
    $java_backend_function_to_method_hash$ = null;
    $java_backend_function_class_table$ = null;
    $java_backend_function_name_table$ = null;
    $java_backend_function_arglist_table$ = null;
    $java_backend_predefined_constant_table$ = null;
    $java_backend_defined_global_name_data$ = null;
    $java_backend_undefined_global_name_data$ = null;
    $java_backend_global_class_table$ = null;
    $java_backend_global_name_table$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { makeString( "abstract" ), makeString( "assert" ), makeString( "boolean" ), makeString( "break" ), makeString( "byte" ), makeString( "case" ), makeString( "catch" ),
      makeString( "char" ), makeString( "class" ), makeString( "const" ), makeString( "continue" ), makeString( "default" ), makeString( "do" ), makeString( "double" ), makeString( "else" ), makeString( "enum" ),
      makeString( "extends" ), makeString( "false" ), makeString( "final" ), makeString( "finally" ), makeString( "float" ), makeString( "for" ), makeString( "goto" ), makeString( "if" ), makeString( "implements" ),
      makeString( "import" ), makeString( "instanceof" ), makeString( "int" ), makeString( "interface" ), makeString( "long" ), makeString( "native" ), makeString( "new" ), makeString( "null" ), makeString( "package" ),
      makeString( "private" ), makeString( "protected" ), makeString( "public" ), makeString( "return" ), makeString( "short" ), makeString( "static" ), makeString( "strictfp" ), makeString( "super" ), makeString(
          "switch" ), makeString( "synchronized" ), makeString( "this" ), makeString( "throw" ), makeString( "throws" ), makeString( "transient" ), makeString( "true" ), makeString( "try" ), makeString( "void" ),
      makeString( "volatile" ), makeString( "while" )
    } );
    $list1 = _constant_1_initializer();
    $list2 = ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "SYMBOLS" ) );
    $list3 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "*" ), makeString( "multiply" ) ), ConsesLow.list( makeSymbol( "+" ), makeString( "add" ) ), ConsesLow.list( makeSymbol( "-" ), makeString(
        "subtract" ) ), ConsesLow.list( makeSymbol( "/" ), makeString( "divide" ) ), ConsesLow.list( makeSymbol( "INT/" ), makeString( "integerDivide" ) ), ConsesLow.list( makeSymbol( "FIXNUM*" ), makeString(
            "fixnumMultiply" ) ), ConsesLow.list( makeSymbol( "/=" ), makeString( "numNE" ) ), ConsesLow.list( makeSymbol( "<" ), makeString( "numL" ) ), ConsesLow.list( makeSymbol( "<=" ), makeString( "numLE" ) ),
      ConsesLow.list( makeSymbol( "=" ), makeString( "numE" ) ), ConsesLow.list( makeSymbol( ">" ), makeString( "numG" ) ), ConsesLow.list( makeSymbol( ">=" ), makeString( "numGE" ) ), ConsesLow.list( makeSymbol(
          "CHAR/=" ), makeString( "charNE" ) ), ConsesLow.list( makeSymbol( "CHAR<" ), makeString( "charL" ) ), ConsesLow.list( makeSymbol( "CHAR<=" ), makeString( "charLE" ) ), ConsesLow.list( makeSymbol( "CHAR=" ),
              makeString( "charE" ) ), ConsesLow.list( makeSymbol( "CHAR>" ), makeString( "charG" ) ), ConsesLow.list( makeSymbol( "CHAR>=" ), makeString( "charGE" ) ), ConsesLow.list( makeSymbol( "GUID/=" ), makeString(
                  "guidNE" ) ), ConsesLow.list( makeSymbol( "GUID<" ), makeString( "guidL" ) ), ConsesLow.list( makeSymbol( "GUID<=" ), makeString( "guidLE" ) ), ConsesLow.list( makeSymbol( "GUID=" ), makeString(
                      "guidE" ) ), ConsesLow.list( makeSymbol( "GUID>" ), makeString( "guidG" ) ), ConsesLow.list( makeSymbol( "GUID>=" ), makeString( "guidGE" ) ), ConsesLow.list( makeSymbol( "NULL" ), makeString(
                          "sublisp_null" ) ), ConsesLow.list( makeSymbol( "STRING/=" ), makeString( "stringNE" ) ), ConsesLow.list( makeSymbol( "STRING<" ), makeString( "stringL" ) ), ConsesLow.list( makeSymbol(
                              "STRING<=" ), makeString( "stringLE" ) ), ConsesLow.list( makeSymbol( "STRING=" ), makeString( "stringE" ) ), ConsesLow.list( makeSymbol( "STRING>" ), makeString( "stringG" ) ), ConsesLow
                                  .list( makeSymbol( "STRING>=" ), makeString( "stringGE" ) ), ConsesLow.list( makeSymbol( "LIST*" ), makeString( "listS" ) ), ConsesLow.list( makeSymbol( "BQ-LIST*" ), makeString(
                                      "bq_listS" ) )
    } );
    $list4 = _constant_4_initializer();
    $list5 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $list6 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "*" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%MULT2" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol( "%MULT3" ) ) ), ConsesLow.list(
        makeSymbol( "+" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%ADD2" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol( "%ADD3" ) ) ), ConsesLow.list( makeSymbol( "-" ), ConsesLow.cons( ONE_INTEGER, makeSymbol(
            "%MINUS" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%SUB2" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol( "%SUB3" ) ) ), ConsesLow.list( makeSymbol( "/" ), ConsesLow.cons( ONE_INTEGER, makeSymbol(
                "%INVERT" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%DIV2" ) ) ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%APPEND2" ) ), ConsesLow.cons( THREE_INTEGER,
                    makeSymbol( "%APPEND3" ) ), ConsesLow.cons( FOUR_INTEGER, makeSymbol( "%APPEND4" ) ) ), ConsesLow.list( makeSymbol( "APPLY" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%APPLY2" ) ), ConsesLow.cons(
                        THREE_INTEGER, makeSymbol( "%APPLY3" ) ) ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%CONCAT2" ) ) ), ConsesLow.list( makeSymbol( "CERROR" ),
                            ConsesLow.cons( TWO_INTEGER, makeSymbol( "%CERROR2" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol( "%CERROR3" ) ), ConsesLow.cons( FOUR_INTEGER, makeSymbol( "%CERROR4" ) ), ConsesLow.cons(
                                FIVE_INTEGER, makeSymbol( "%CERROR5" ) ) ), ConsesLow.list( makeSymbol( "ERROR" ), ConsesLow.cons( ONE_INTEGER, makeSymbol( "%ERROR1" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol(
                                    "%ERROR2" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol( "%ERROR3" ) ), ConsesLow.cons( FOUR_INTEGER, makeSymbol( "%ERROR4" ) ) ), ConsesLow.list( makeSymbol( "FALSE" ), ConsesLow
                                        .cons( ZERO_INTEGER, makeSymbol( "%FALSE0" ) ), ConsesLow.cons( ONE_INTEGER, makeSymbol( "%FALSE1" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%FALSE2" ) ) ), ConsesLow.list(
                                            makeSymbol( "FORMAT" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%FORMAT2" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol( "%FORMAT3" ) ), ConsesLow.cons( FOUR_INTEGER,
                                                makeSymbol( "%FORMAT4" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL" ), ConsesLow.cons( ONE_INTEGER, makeSymbol( "%FUNCALL1" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol(
                                                    "%FUNCALL2" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol( "%FUNCALL3" ) ), ConsesLow.cons( FOUR_INTEGER, makeSymbol( "%FUNCALL4" ) ), ConsesLow.cons( FIVE_INTEGER,
                                                        makeSymbol( "%FUNCALL5" ) ), ConsesLow.cons( SIX_INTEGER, makeSymbol( "%FUNCALL6" ) ), ConsesLow.cons( SEVEN_INTEGER, makeSymbol( "%FUNCALL7" ) ) ), ConsesLow.list(
                                                            new SubLObject[]
                                                            { makeSymbol( "LIST" ), ConsesLow.cons( ONE_INTEGER, makeSymbol( "%LIST1" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%LIST2" ) ), ConsesLow.cons(
                                                                THREE_INTEGER, makeSymbol( "%LIST3" ) ), ConsesLow.cons( FOUR_INTEGER, makeSymbol( "%LIST4" ) ), ConsesLow.cons( FIVE_INTEGER, makeSymbol( "%LIST5" ) ),
                                                              ConsesLow.cons( SIX_INTEGER, makeSymbol( "%LIST6" ) ), ConsesLow.cons( SEVEN_INTEGER, makeSymbol( "%LIST7" ) ), ConsesLow.cons( EIGHT_INTEGER, makeSymbol(
                                                                  "%LIST8" ) )
                                                            } ), ConsesLow.list( makeSymbol( "LIST*" ), ConsesLow.cons( ONE_INTEGER, makeSymbol( "%LIST*1" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%LIST*2" ) ),
                                                                ConsesLow.cons( THREE_INTEGER, makeSymbol( "%LIST*3" ) ), ConsesLow.cons( FOUR_INTEGER, makeSymbol( "%LIST*4" ) ), ConsesLow.cons( FIVE_INTEGER, makeSymbol(
                                                                    "%LIST*5" ) ), ConsesLow.cons( SIX_INTEGER, makeSymbol( "%LIST*6" ) ) ), ConsesLow.list( makeSymbol( "LOGAND" ), ConsesLow.cons( TWO_INTEGER,
                                                                        makeSymbol( "%LOGAND2" ) ) ), ConsesLow.list( makeSymbol( "LOGIOR" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%LOGIOR2" ) ), ConsesLow.cons(
                                                                            THREE_INTEGER, makeSymbol( "%LOGIOR3" ) ) ), ConsesLow.list( makeSymbol( "LOGXOR" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%LOGXOR2" ) ) ),
      ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%MAPCAR2" ) ) ), ConsesLow.list( makeSymbol( "MAX" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%MAX2" ) ) ), ConsesLow.list(
          makeSymbol( "MIN" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%MIN2" ) ) ), ConsesLow.list( makeSymbol( "NCONC" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%NCONC2" ) ), ConsesLow.cons( THREE_INTEGER,
              makeSymbol( "%NCONC3" ) ) ), ConsesLow.list( makeSymbol( "STRING<=" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%STRING<=2" ) ) ), ConsesLow.list( makeSymbol( "TRUE" ), ConsesLow.cons( ZERO_INTEGER,
                  makeSymbol( "%TRUE0" ) ), ConsesLow.cons( ONE_INTEGER, makeSymbol( "%TRUE1" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%TRUE2" ) ) ), ConsesLow.list( new SubLObject[]
                  { makeSymbol( "VALUES" ), ConsesLow.cons( ONE_INTEGER, makeSymbol( "%VALUES1" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%VALUES2" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol( "%VALUES3" ) ),
                    ConsesLow.cons( FOUR_INTEGER, makeSymbol( "%VALUES4" ) ), ConsesLow.cons( FIVE_INTEGER, makeSymbol( "%VALUES5" ) ), ConsesLow.cons( SIX_INTEGER, makeSymbol( "%VALUES6" ) ), ConsesLow.cons(
                        SEVEN_INTEGER, makeSymbol( "%VALUES7" ) ), ConsesLow.cons( EIGHT_INTEGER, makeSymbol( "%VALUES8" ) )
      } ), ConsesLow.list( makeSymbol( "WARN" ), ConsesLow.cons( ONE_INTEGER, makeSymbol( "%WARN1" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%WARN2" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol( "%WARN3" ) ),
          ConsesLow.cons( FOUR_INTEGER, makeSymbol( "%WARN4" ) ) )
    } );
    $list7 = _constant_7_initializer();
    $sym8$_DTB = makeSymbol( "%DTB" );
    $sym9$_BTD = makeSymbol( "%BTD" );
    $sym10$___ = makeSymbol( "%==" );
    $sym11$NULL = makeSymbol( "NULL" );
    $list12 = ConsesLow.list( makeSymbol( "%PC" ), NIL );
    $sym13$_METHOD = makeSymbol( "%METHOD" );
    $sym14$_NOT____ = makeSymbol( "%NOT-%==" );
    $list15 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "ATOM" ), makeString( "isAtom" ) ), ConsesLow.list( makeSymbol( "BIGNUMP" ), makeString( "isBignum" ) ), ConsesLow.list( makeSymbol(
        "CHARACTERP" ), makeString( "isChar" ) ), ConsesLow.list( makeSymbol( "CONSP" ), makeString( "isCons" ) ), ConsesLow.list( makeSymbol( "FIXNUMP" ), makeString( "isFixnum" ) ), ConsesLow.list( makeSymbol(
            "FLOATP" ), makeString( "isDouble" ) ), ConsesLow.list( makeSymbol( "FUNCTION-SPEC-P" ), makeString( "isFunctionSpec" ) ), ConsesLow.list( makeSymbol( "FUNCTIONP" ), makeString( "isFunction" ) ), ConsesLow
                .list( makeSymbol( "HASH-TABLE-P" ), makeString( "isHashtable" ) ), ConsesLow.list( makeSymbol( "INTEGERP" ), makeString( "isInteger" ) ), ConsesLow.list( makeSymbol( "KEYWORDP" ), makeString(
                    "isKeyword" ) ), ConsesLow.list( makeSymbol( "LISTP" ), makeString( "isList" ) ), ConsesLow.list( makeSymbol( "LOCK-P" ), makeString( "isLock" ) ), ConsesLow.list( makeSymbol( "MACRO-OPERATOR-P" ),
                        makeString( "isMacroOperator" ) ), ConsesLow.list( makeSymbol( "NULL" ), makeString( "isNil" ) ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeString( "isNumber" ) ), ConsesLow.list( makeSymbol(
                            "PACKAGEP" ), makeString( "isPackage" ) ), ConsesLow.list( makeSymbol( "PROCESS" ), makeString( "isProcess" ) ), ConsesLow.list( makeSymbol( "SEQUENCEP" ), makeString( "isSequence" ) ),
      ConsesLow.list( makeSymbol( "STREAMP" ), makeString( "isStream" ) ), ConsesLow.list( makeSymbol( "STRINGP" ), makeString( "isString" ) ), ConsesLow.list( makeSymbol( "STRUCTURE-P" ), makeString( "isStructure" ) ),
      ConsesLow.list( makeSymbol( "SYMBOLP" ), makeString( "isSymbol" ) ), ConsesLow.list( makeSymbol( "VECTORP" ), makeString( "isVector" ) ), ConsesLow.list( makeSymbol( "PLUSP" ), makeString( "isPositive" ) ),
      ConsesLow.list( makeSymbol( "MINUSP" ), makeString( "isNegative" ) ), ConsesLow.list( makeSymbol( "ZEROP" ), makeString( "isZero" ) ), ConsesLow.list( EQL, makeString( "eql" ) ), ConsesLow.list( EQUAL, makeString(
          "equal" ) ), ConsesLow.list( EQUALP, makeString( "equalp" ) ), ConsesLow.list( makeSymbol( "<" ), makeString( "numL" ) ), ConsesLow.list( makeSymbol( "<=" ), makeString( "numLE" ) ), ConsesLow.list( makeSymbol(
              ">" ), makeString( "numG" ) ), ConsesLow.list( makeSymbol( ">=" ), makeString( "numGE" ) ), ConsesLow.list( makeSymbol( "=" ), makeString( "numE" ) )
    } );
    $kw16$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $list17 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "BOOLEAN-METHOD" ) );
    $list18 = ConsesLow.cons( makeSymbol( "OPERATOR" ), makeSymbol( "ARGS" ) );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "CAR" ), makeString( "first" ) ), ConsesLow.list( makeSymbol( "FIRST" ), makeString( "first" ) ), ConsesLow.list( makeSymbol( "CDR" ), makeString( "rest" ) ),
        ConsesLow.list( makeSymbol( "REST" ), makeString( "rest" ) ) );
    $list20 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "METHOD" ) );
    $int21$500 = makeInteger( 500 );
    $list22 = ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "SYMBOLS" ) );
    $list23 = ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "CLASS-NAME" ), makeSymbol( "JAVA-BACKEND-NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ARGLIST" ) );
    $sym24$JAVA_BACKEND_COMPUTED_FUNCTION_NAME = makeSymbol( "JAVA-BACKEND-COMPUTED-FUNCTION-NAME" );
    $str25$f = makeString( "f" );
    $str26$sublisp_ = makeString( "sublisp_" );
    $str27$f_ = makeString( "f_" );
    $kw28$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $list29 = _constant_29_initializer();
    $list30 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "*BREAK-ON-ERROR?*" ), makeString( "Errors" ), makeString( "$break_on_errorP$" ) ), ConsesLow.list( makeSymbol( "*BREAK-ON-WARN?*" ),
        makeString( "Errors" ), makeString( "$break_on_warnP$" ) ), ConsesLow.list( makeSymbol( "*CONTINUE-CERROR?*" ), makeString( "Errors" ), makeString( "$continue_cerrorP$" ) ), ConsesLow.list( makeSymbol(
            "*ERROR-ABORT-HANDLER*" ), makeString( "Errors" ), makeString( "$error_abort_handler$" ) ), ConsesLow.list( makeSymbol( "*ERROR-HANDLER*" ), makeString( "Errors" ), makeString( "$error_handler$" ) ),
      ConsesLow.list( makeSymbol( "*ERROR-MESSAGE*" ), makeString( "Errors" ), makeString( "$error_message$" ) ), ConsesLow.list( makeSymbol( "*IGNORE-BREAKS?*" ), makeString( "Errors" ), makeString(
          "$ignore_breaksP$" ) ), ConsesLow.list( makeSymbol( "*IGNORE-MUSTS?*" ), makeString( "Errors" ), makeString( "$ignore_mustsP$" ) ), ConsesLow.list( makeSymbol( "*IGNORE-WARNS?*" ), makeString( "Errors" ),
              makeString( "$ignore_warnsP$" ) ), ConsesLow.list( makeSymbol( "*" ), makeString( "Eval" ), makeString( "$star$" ) ), ConsesLow.list( makeSymbol( "**" ), makeString( "Eval" ), makeString( "$star_star$" ) ),
      ConsesLow.list( makeSymbol( "***" ), makeString( "Eval" ), makeString( "$star_star_star$" ) ), ConsesLow.list( makeSymbol( "CALL-ARGUMENTS-LIMIT" ), makeString( "Functions" ), makeString(
          "$call_arguments_limit$" ) ), ConsesLow.list( makeSymbol( "*EXP1*" ), makeString( "Numbers" ), makeString( "$exp1$" ) ), ConsesLow.list( makeSymbol( "*MOST-NEGATIVE-FIXNUM*" ), makeString( "Numbers" ),
              makeString( "$most_negative_fixnum$" ) ), ConsesLow.list( makeSymbol( "*MOST-POSITIVE-FIXNUM*" ), makeString( "Numbers" ), makeString( "$most_positive_fixnum$" ) ), ConsesLow.list( makeSymbol( "*PI*" ),
                  makeString( "Numbers" ), makeString( "$pi$" ) ), ConsesLow.list( makeSymbol( "BOOLE-1" ), makeString( "Numbers" ), makeString( "$boole_1$" ) ), ConsesLow.list( makeSymbol( "BOOLE-2" ), makeString(
                      "Numbers" ), makeString( "$boole_2$" ) ), ConsesLow.list( makeSymbol( "BOOLE-AND" ), makeString( "Numbers" ), makeString( "$boole_and$" ) ), ConsesLow.list( makeSymbol( "BOOLE-ANDC1" ), makeString(
                          "Numbers" ), makeString( "$boole_andc1$" ) ), ConsesLow.list( makeSymbol( "BOOLE-ANDC2" ), makeString( "Numbers" ), makeString( "$boole_andc2$" ) ), ConsesLow.list( makeSymbol( "BOOLE-C1" ),
                              makeString( "Numbers" ), makeString( "$boole_c1$" ) ), ConsesLow.list( makeSymbol( "BOOLE-C2" ), makeString( "Numbers" ), makeString( "$boole_c2$" ) ), ConsesLow.list( makeSymbol(
                                  "BOOLE-CLR" ), makeString( "Numbers" ), makeString( "$boole_clr$" ) ), ConsesLow.list( makeSymbol( "BOOLE-EQV" ), makeString( "Numbers" ), makeString( "$boole_eqv$" ) ), ConsesLow.list(
                                      makeSymbol( "BOOLE-IOR" ), makeString( "Numbers" ), makeString( "$boole_ior$" ) ), ConsesLow.list( makeSymbol( "BOOLE-NAND" ), makeString( "Numbers" ), makeString(
                                          "$boole_nand$" ) ), ConsesLow.list( makeSymbol( "BOOLE-NOR" ), makeString( "Numbers" ), makeString( "$boole_nor$" ) ), ConsesLow.list( makeSymbol( "BOOLE-ORC1" ), makeString(
                                              "Numbers" ), makeString( "$boole_orc1$" ) ), ConsesLow.list( makeSymbol( "BOOLE-ORC2" ), makeString( "Numbers" ), makeString( "$boole_orc2$" ) ), ConsesLow.list( makeSymbol(
                                                  "BOOLE-SET" ), makeString( "Numbers" ), makeString( "$boole_set$" ) ), ConsesLow.list( makeSymbol( "BOOLE-XOR" ), makeString( "Numbers" ), makeString( "$boole_xor$" ) ),
      ConsesLow.list( makeSymbol( "*PACKAGE*" ), makeString( "Packages" ), makeString( "$package$" ) ), ConsesLow.list( makeSymbol( "*RAND-MAX*" ), makeString( "random" ), makeString( "$rand_max$" ) ), ConsesLow.list(
          makeSymbol( "*DEBUG-IO*" ), makeString( "StreamsLow" ), makeString( "$debug_io$" ) ), ConsesLow.list( makeSymbol( "*ERROR-OUTPUT*" ), makeString( "StreamsLow" ), makeString( "$error_output$" ) ), ConsesLow
              .list( makeSymbol( "*NULL-INPUT*" ), makeString( "StreamsLow" ), makeString( "$null_input$" ) ), ConsesLow.list( makeSymbol( "*NULL-OUTPUT*" ), makeString( "StreamsLow" ), makeString( "$null_output$" ) ),
      ConsesLow.list( makeSymbol( "*QUERY-IO*" ), makeString( "StreamsLow" ), makeString( "$query_io$" ) ), ConsesLow.list( makeSymbol( "*STANDARD-INPUT*" ), makeString( "StreamsLow" ), makeString(
          "$standard_input$" ) ), ConsesLow.list( makeSymbol( "*STANDARD-OUTPUT*" ), makeString( "StreamsLow" ), makeString( "$standard_output$" ) ), ConsesLow.list( makeSymbol( "*STREAM-INITIAL-INPUT-BUFFER-SIZE*" ),
              makeString( "StreamsLow" ), makeString( "$stream_initial_input_buffer_size$" ) ), ConsesLow.list( makeSymbol( "*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*" ), makeString( "StreamsLow" ), makeString(
                  "$stream_initial_output_buffer_size$" ) ), ConsesLow.list( makeSymbol( "*TERMINAL-IO*" ), makeString( "StreamsLow" ), makeString( "$terminal_io$" ) ), ConsesLow.list( makeSymbol( "*TRACE-OUTPUT*" ),
                      makeString( "StreamsLow" ), makeString( "$trace_output$" ) ), ConsesLow.list( makeSymbol( "*GENSYM-COUNTER*" ), makeString( "Symbols" ), makeString( "$gensym_counter$" ) ), ConsesLow.list(
                          makeSymbol( "*RETAIN-CLIENT-SOCKET?*" ), makeString( "Tcp" ), makeString( "$retain_client_socketP$" ) ), ConsesLow.list( makeSymbol( "*TCP-LOCALHOST-ONLY?*" ), makeString( "Tcp" ), makeString(
                              "$tcp_localhost_onlyP$" ) ), ConsesLow.list( makeSymbol( "*PROCESS-MAX-PRIORITY*" ), makeString( "Threads" ), makeString( "$process_max_priority$" ) ), ConsesLow.list( makeSymbol(
                                  "*PROCESS-CRITICAL-PRIORITY*" ), makeString( "Threads" ), makeString( "$process_critical_priority$" ) ), ConsesLow.list( makeSymbol( "*PROCESS-NORMAL-PRIORITY*" ), makeString(
                                      "Threads" ), makeString( "$process_normal_priority$" ) ), ConsesLow.list( makeSymbol( "*PROCESS-BACKGROUND-PRIORITY*" ), makeString( "Threads" ), makeString(
                                          "$process_background_priority$" ) ), ConsesLow.list( makeSymbol( "*PROCESS-MIN-PRIORITY*" ), makeString( "Threads" ), makeString( "$process_min_priority$" ) ), ConsesLow.list(
                                              makeSymbol( "*SUSPEND-TYPE-CHECKING?*" ), makeString( "Types" ), makeString( "$suspend_type_checkingP$" ) ), ConsesLow.list( makeSymbol( "*MULTIPLE-VALUES-LIMIT*" ),
                                                  makeString( "Values" ), makeString( "$multiple_values_limit$" ) ), ConsesLow.list( makeSymbol( "*CALL-PROFILING-ENABLED?*", "SUBLISP" ), makeString(
                                                      "complex_special_forms" ), makeString( "$call_profiling_enabledP$" ) ), ConsesLow.list( makeSymbol( "*CALL-PROFILING-TABLE*", "SUBLISP" ), makeString(
                                                          "complex_special_forms" ), makeString( "$call_profiling_table$" ) ), ConsesLow.list( makeSymbol( "*PRINT-ARRAY*" ), makeString( "print_high" ), makeString(
                                                              "$print_array$" ) ), ConsesLow.list( makeSymbol( "*PRINT-BASE*" ), makeString( "print_high" ), makeString( "$print_base$" ) ), ConsesLow.list( makeSymbol(
                                                                  "*PRINT-CASE*" ), makeString( "print_high" ), makeString( "$print_case$" ) ), ConsesLow.list( makeSymbol( "*PRINT-CIRCLE*" ), makeString( "print_high" ),
                                                                      makeString( "$print_circle$" ) ), ConsesLow.list( makeSymbol( "*PRINT-ESCAPE*" ), makeString( "print_high" ), makeString( "$print_escape$" ) ),
      ConsesLow.list( makeSymbol( "*PRINT-GENSYM*" ), makeString( "print_high" ), makeString( "$print_gensym$" ) ), ConsesLow.list( makeSymbol( "*PRINT-LENGTH*" ), makeString( "print_high" ), makeString(
          "$print_length$" ) ), ConsesLow.list( makeSymbol( "*PRINT-LEVEL*" ), makeString( "print_high" ), makeString( "$print_level$" ) ), ConsesLow.list( makeSymbol( "*PRINT-LINES*" ), makeString( "print_high" ),
              makeString( "$print_lines$" ) ), ConsesLow.list( makeSymbol( "*PRINT-MISER-WIDTH*" ), makeString( "print_high" ), makeString( "$print_miser_width$" ) ), ConsesLow.list( makeSymbol(
                  "*PRINT-PPRINT-DISPATCH*" ), makeString( "print_high" ), makeString( "$print_pprint_dispatch$" ) ), ConsesLow.list( makeSymbol( "*PRINT-PRETTY*" ), makeString( "print_high" ), makeString(
                      "$print_pretty$" ) ), ConsesLow.list( makeSymbol( "*PRINT-RADIX*" ), makeString( "print_high" ), makeString( "$print_radix$" ) ), ConsesLow.list( makeSymbol( "*PRINT-READABLY*" ), makeString(
                          "print_high" ), makeString( "$print_readably$" ) ), ConsesLow.list( makeSymbol( "*PRINT-RIGHT-MARGIN*" ), makeString( "print_high" ), makeString( "$print_right_margin$" ) ), ConsesLow.list(
                              makeSymbol( "*FEATURES*" ), makeString( "reader" ), makeString( "$features$" ) ), ConsesLow.list( makeSymbol( "*READ-BASE*" ), makeString( "reader" ), makeString( "$read_base$" ) ),
      ConsesLow.list( makeSymbol( "*READ-DEFAULT-FLOAT-FORMAT*" ), makeString( "reader" ), makeString( "$read_default_float_format$" ) ), ConsesLow.list( makeSymbol( "*READ-EVAL*" ), makeString( "reader" ), makeString(
          "$read_eval$" ) ), ConsesLow.list( makeSymbol( "*READ-SUPPRESS*" ), makeString( "reader" ), makeString( "$read_suppress$" ) ), ConsesLow.list( makeSymbol( "*READTABLE*" ), makeString( "reader" ), makeString(
              "$readtable$" ) ), ConsesLow.list( makeSymbol( "*STREAM-REQUIRES-LOCKING*", "SUBLISP" ), makeString( "stream_macros" ), makeString( "$stream_requires_locking$" ) ), ConsesLow.list( makeSymbol(
                  "*INTERNAL-TIME-UNITS-PER-SECOND*" ), makeString( "time_high" ), makeString( "$internal_time_units_per_second$" ) )
    } );
    $list31 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "*IS-THREAD-PERFORMING-CLEANUP?*", "SUBLISP" ), makeString( "Threads" ), makeString( "$is_thread_performing_cleanupP$" ), makeKeyword(
        "DYNAMIC" ) ), ConsesLow.list( makeSymbol( "*PRINT-OBJECT-METHOD-TABLE*", "SUBLISP" ), makeString( "print_high" ), makeString( "$print_object_method_table$" ), makeKeyword( "LEXICAL" ) ), ConsesLow.list(
            makeSymbol( "*SXHASH-METHOD-TABLE*" ), makeString( "Sxhash" ), makeString( "$sxhash_method_table$" ), makeKeyword( "LEXICAL" ) ), ConsesLow.list( makeSymbol( "*VISIT-DEFSTRUCT-OBJECT-METHOD-TABLE*",
                "SUBLISP" ), makeString( "visitation" ), makeString( "$visit_defstruct_object_method_table$" ), makeKeyword( "LEXICAL" ) ), ConsesLow.list( makeSymbol( "*DTP-SYMBOL*" ), makeString( "Types" ), makeString(
                    "$dtp_symbol$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-CONS*" ), makeString( "Types" ), makeString( "$dtp_cons$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol(
                        "*DTP-FIXNUM*" ), makeString( "Types" ), makeString( "$dtp_fixnum$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-FLOAT*" ), makeString( "Types" ), makeString( "$dtp_float$" ),
                            makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-CHARACTER*" ), makeString( "Types" ), makeString( "$dtp_character$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol(
                                "*DTP-STRING*" ), makeString( "Types" ), makeString( "$dtp_string$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-VECTOR*" ), makeString( "Types" ), makeString(
                                    "$dtp_vector$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-FUNCTION*" ), makeString( "Types" ), makeString( "$dtp_function$" ), makeKeyword( "CONSTANT" ) ),
      ConsesLow.list( makeSymbol( "*DTP-HASH-TABLE*" ), makeString( "Types" ), makeString( "$dtp_hash_table$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-PACKAGE*" ), makeString( "Types" ),
          makeString( "$dtp_package$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-STREAM*" ), makeString( "Types" ), makeString( "$dtp_stream$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list(
              makeSymbol( "*DTP-BIGNUM*" ), makeString( "Types" ), makeString( "$dtp_bignum$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-LOCK*" ), makeString( "Types" ), makeString( "$dtp_lock$" ),
                  makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-PROCESS*" ), makeString( "Types" ), makeString( "$dtp_process$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-GUID*" ),
                      makeString( "Guids" ), makeString( "$dtp_guid$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-STRUCTURES-BAG*" ), makeString( "Structures" ), makeString(
                          "$dtp_structures_bag$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*REMOTE-ADDRESS*", "SUBLISP" ), makeString( "Tcp" ), makeString( "$remote_address$" ), makeKeyword(
                              "DYNAMIC" ) ), ConsesLow.list( makeSymbol( "*REMOTE-HOSTNAME*", "SUBLISP" ), makeString( "Tcp" ), makeString( "$remote_hostname$" ), makeKeyword( "DYNAMIC" ) ), ConsesLow.list( makeSymbol(
                                  "*%EVALUATOR-METHOD*", "SUBLISP" ), makeString( "Eval" ), makeString( "$evaluator_method$" ), makeKeyword( "DYNAMIC" ) ), ConsesLow.list( makeSymbol( "*DOUBLE-FLOAT-MINIMUM-EXPONENT*" ),
                                      makeString( "Numbers" ), makeString( "$double_float_minimum_exponent$" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*SYSTEM-INFO*", "SUBLISP" ), makeString(
                                          "SystemInfo" ), makeString( "$system_info$" ), makeKeyword( "LEXICAL" ) ), ConsesLow.list( makeSymbol( "*CURRENT-AREA*" ), makeString( "Storage" ), makeString(
                                              "$current_area$" ), makeKeyword( "DYNAMIC" ) ), ConsesLow.list( makeSymbol( "*SHOULD-MEMORY-MAP-FILES?*", "SUBLISP" ), makeString( "StreamsLow" ), makeString(
                                                  "$should_memory_map_files$" ), makeKeyword( "DYNAMIC" ) ), ConsesLow.list( makeSymbol( "*RESTARTS*", "SUBLISP" ), makeString( "Errors" ), makeString( "$restarts$" ),
                                                      makeKeyword( "DYNAMIC" ) )
    } );
    $list32 = ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "CLASS-NAME" ), makeSymbol( "JAVA-BACKEND-NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "BINDING-TYPE" ) );
    $sym33$JAVA_BACKEND_COMPUTED_GLOBAL_NAME = makeSymbol( "JAVA-BACKEND-COMPUTED-GLOBAL-NAME" );
    $str34$_g = makeString( "$g" );
    $str35$_ = makeString( "$" );
  }
}
/*
 * 
 * Total time: 643 ms
 * 
 */