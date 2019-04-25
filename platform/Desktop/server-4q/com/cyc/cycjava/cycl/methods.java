package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class methods
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.methods";
  public static final String myFingerPrint = "53b4844d01e9bbdde0a4bed450d7ab9f07ccfc3b82f667dfec297e43a712783c";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2591L)
  public static SubLSymbol $methods_insert_trace_code_p$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2645L)
  public static SubLSymbol $methods_block_tracing$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2698L)
  private static SubLSymbol $methods_tracing_format_strings_vector_size$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2768L)
  private static SubLSymbol $methods_tracing_format_strings$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2881L)
  public static SubLSymbol $methods_trace_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6171L)
  private static SubLSymbol $methods_protection_levels$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6992L)
  private static SubLSymbol $methods_scope_levels$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7196L)
  private static SubLSymbol $valid_method_listener_types$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7294L)
  private static SubLSymbol $methods_scope_special_forms$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15555L)
  public static SubLSymbol $report_default_method_callsP$;
  private static final SubLString $str0$__S__S__;
  private static final SubLString $str1$_S;
  private static final SubLString $str2$__S;
  private static final SubLString $str3$_;
  private static final SubLString $str4$_S___enter__;
  private static final SubLString $str5$_S___exit____S__S______S;
  private static final SubLString $str6$__;
  private static final SubLSymbol $sym7$_OPTIONAL;
  private static final SubLSymbol $sym8$PUNLESS;
  private static final SubLSymbol $sym9$_METHODS_BLOCK_TRACING_;
  private static final SubLSymbol $sym10$CUNWIND_PROTECT;
  private static final SubLSymbol $sym11$PROGN;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$FORMAT;
  private static final SubLSymbol $sym16$_STANDARD_OUTPUT_;
  private static final SubLSymbol $sym17$_METHODS_TRACE_DEPTH_;
  private static final SubLSymbol $sym18$QUOTE;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$METHOD_LISTENER_TYPE;
  private static final SubLString $str28$_S___S_is_not_a_member_of_the__S_;
  private static final SubLSymbol $sym29$ENCODE_METHOD_LISTENER_TYPE;
  private static final SubLString $str30$_S___S_is_not_a_valid_encoding_of;
  private static final SubLSymbol $sym31$DECODE_METHOD_LISTENER_TYPE;
  private static final SubLString $str32$_S___S_was_expected_to_be_a_membe;
  private static final SubLSymbol $sym33$METHOD_LISTENER_TYPE_P;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$PRIVATE;
  private static final SubLSymbol $kw36$PROTECTED;
  private static final SubLSymbol $kw37$PUBLIC;
  private static final SubLSymbol $kw38$FILE_SCOPE;
  private static final SubLSymbol $kw39$SYSTEM_SCOPE;
  private static final SubLSymbol $kw40$GLOBAL_SCOPE;
  private static final SubLSymbol $kw41$AUTO_UPDATE;
  private static final SubLSymbol $kw42$NO_MEMBER_VARIABLES;
  private static final SubLSymbol $kw43$READ_ONLY;
  private static final SubLSymbol $kw44$BEFORE_LISTENERS;
  private static final SubLSymbol $kw45$AFTER_LISTENERS;
  private static final SubLSymbol $kw46$INSTANTIATE_TEMPLATE;
  private static final SubLSymbol $kw47$DEFAULT;
  private static final SubLString $str48$_;
  private static final SubLString $str49$_METHOD;
  private static final SubLString $str50$_S___S_is_not_a_valid_method_spec;
  private static final SubLString $str51$_S___S_is_not_a_valid_method_name;
  private static final SubLString $str52$_S__While_defining_method__S___S_;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$DEF_INSTANCE_METHOD;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$METHODS_INCORPORATE_INSTANCE_METHOD;
  private static final SubLSymbol $sym57$SUBLOOP_REGISTER_INSTANCE_METHOD;
  private static final SubLSymbol $sym58$PWHEN;
  private static final SubLSymbol $sym59$_REPORT_DEFAULT_METHOD_CALLS__;
  private static final SubLSymbol $sym60$WARN;
  private static final SubLString $str61$Default_method_call__a_on_class__;
  private static final SubLString $str62$DEF_INSTANCE_METHOD___S_is_not_th;
  private static final SubLSymbol $sym63$DEF_CLASS_METHOD;
  private static final SubLSymbol $sym64$METHODS_INCORPORATE_CLASS_METHOD;
  private static final SubLSymbol $sym65$SUBLOOP_REGISTER_CLASS_METHOD;
  private static final SubLString $str66$DEF_CLASS_METHOD___S_is_not_the_n;
  private static final SubLString $str67$FUNCALL_CLASS_METHOD___S_is_not_a;
  private static final SubLString $str68$FUNCALL_CLASS_METHOD___S_is_not_a;
  private static final SubLString $str69$FUNCALL_CLASS_SUPER_METHOD___S_is;
  private static final SubLString $str70$FUNCALL_CLASS_SUPER_METHOD___S_is;
  private static final SubLSymbol $kw71$TARGET_NOT_A_CLASS;
  private static final SubLSymbol $kw72$INVALID_METHOD_NAME;
  private static final SubLSymbol $kw73$UNDECLARED_METHOD;
  private static final SubLSymbol $kw74$ACCESS_LEVEL_CONFLICT;
  private static final SubLSymbol $kw75$UNDEFINED_METHOD;
  private static final SubLString $str76$__FUNCALL_INSTANCE_METHOD__either;
  private static final SubLString $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO;
  private static final SubLString $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_;
  private static final SubLSymbol $kw79$TARGET_NOT_AN_INSTANCE;
  private static final SubLString $str80$RESOLVE_METHOD___S_is_not_a_defin;
  private static final SubLString $str81$RESOLVE_METHOD___S_is_not_a_defin;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$FUNCALL_INSTANCE_METHOD;
  private static final SubLSymbol $sym85$FUNCALL_INSTANCE_SUPER_METHOD;
  private static final SubLSymbol $sym86$SELF;
  private static final SubLSymbol $sym87$INLINE_METHOD;
  private static final SubLSymbol $sym88$SUPER;
  private static final SubLSymbol $sym89$INLINE_SUPER_METHOD;
  private static final SubLSymbol $sym90$CSETQ;
  private static final SubLSymbol $sym91$CMULTIPLE_VALUE_SETQ;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$CPOP;
  private static final SubLList $list94;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$RET;
  private static final SubLSymbol $sym97$THROW;
  private static final SubLSymbol $sym98$LIST;
  private static final SubLString $str99$OUTER_CATCH_FOR_;
  private static final SubLString $str100$METHOD;
  private static final SubLString $str101$CATCH_VAR_FOR_;
  private static final SubLString $str102$LISTED_ARGS;
  private static final SubLSymbol $sym103$CLET;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$CCATCH;
  private static final SubLSymbol $sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS;
  private static final SubLSymbol $sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS;
  private static final SubLSymbol $sym108$DEFINE_PUBLIC;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$DEFINE_PRIVATE;
  private static final SubLSymbol $sym111$DEFINE_PROTECTED;
  private static final SubLList $list112;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2930L)
  public static SubLObject methods_generate_format_string_for_tracing(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg_count = Sequences.length( args );
    SubLObject existing_string = NIL;
    if( arg_count.numL( $methods_tracing_format_strings_vector_size$.getGlobalValue() ) )
    {
      existing_string = Vectors.aref( $methods_tracing_format_strings$.getDynamicValue( thread ), arg_count );
      if( NIL != existing_string )
      {
        return existing_string;
      }
    }
    existing_string = $str0$__S__S__;
    if( arg_count.numG( ZERO_INTEGER ) )
    {
      existing_string = Sequences.cconcatenate( existing_string, $str1$_S );
      if( arg_count.numG( ONE_INTEGER ) )
      {
        SubLObject cdotimes_end_var;
        SubLObject i;
        for( cdotimes_end_var = Numbers.subtract( arg_count, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          existing_string = Sequences.cconcatenate( existing_string, $str2$__S );
        }
      }
    }
    existing_string = Sequences.cconcatenate( existing_string, $str3$_ );
    if( arg_count.numL( $methods_tracing_format_strings_vector_size$.getGlobalValue() ) )
    {
      Vectors.set_aref( $methods_tracing_format_strings$.getDynamicValue( thread ), arg_count, existing_string );
    }
    return existing_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3771L)
  public static SubLObject methods_generate_method_enter_format_string(final SubLObject args)
  {
    final SubLObject format_string = methods_generate_format_string_for_tracing( args );
    return Sequences.cconcatenate( $str4$_S___enter__, format_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3981L)
  public static SubLObject methods_generate_method_exit_format_string()
  {
    return $str5$_S___exit____S__S______S;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4080L)
  public static SubLObject methods_tracing_tab(final SubLObject stream, final SubLObject depth)
  {
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( depth ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      PrintLow.format( stream, $str6$__ );
    }
    return depth;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4197L)
  public static SubLObject methods_filter_option_words_from_lambda_list(final SubLObject lambda_list)
  {
    SubLObject vars = NIL;
    SubLObject cdolist_list_var = lambda_list;
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( param != $sym7$_OPTIONAL )
      {
        if( param.isSymbol() )
        {
          vars = ConsesLow.cons( param, vars );
        }
        else if( param.isCons() && param.first().isSymbol() )
        {
          vars = ConsesLow.cons( param.first(), vars );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    return Sequences.nreverse( vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4529L)
  public static SubLObject expand_methods_insert_tracing_enter_code(final SubLObject method_name, final SubLObject instance, final SubLObject args)
  {
    final SubLObject filtered_args = methods_filter_option_words_from_lambda_list( args );
    final SubLObject enter_string = methods_generate_method_enter_format_string( filtered_args );
    return ConsesLow.listS( $sym8$PUNLESS, $sym9$_METHODS_BLOCK_TRACING_, ConsesLow.listS( $sym10$CUNWIND_PROTECT, ConsesLow.list( $sym11$PROGN, $list12, $list13, $list14, ConsesLow.listS( $sym15$FORMAT,
        new SubLObject[]
        { $sym16$_STANDARD_OUTPUT_, enter_string, $sym17$_METHODS_TRACE_DEPTH_, ConsesLow.list( $sym18$QUOTE, method_name ), instance, ConsesLow.append( filtered_args, NIL )
        } ) ), $list19 ), $list20 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5179L)
  public static SubLObject methods_insert_tracing_enter_code(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_name = NIL;
    SubLObject instance = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    args = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
      return NIL;
    }
    if( NIL != $methods_insert_trace_code_p$.getDynamicValue( thread ) )
    {
      return expand_methods_insert_tracing_enter_code( method_name, instance, args );
    }
    return ConsesLow.list( $sym11$PROGN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5400L)
  public static SubLObject expand_methods_insert_tracing_exit_code(final SubLObject method_name, final SubLObject instance, final SubLObject result)
  {
    final SubLObject exit_string = methods_generate_method_exit_format_string();
    return ConsesLow.list( $sym8$PUNLESS, $sym9$_METHODS_BLOCK_TRACING_, $list22, ConsesLow.listS( $sym10$CUNWIND_PROTECT, ConsesLow.list( $sym11$PROGN, $list12, $list13, $list14, ConsesLow.list( $sym15$FORMAT,
        $sym16$_STANDARD_OUTPUT_, exit_string, $sym17$_METHODS_TRACE_DEPTH_, ConsesLow.list( $sym18$QUOTE, method_name ), instance, result ) ), $list19 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5948L)
  public static SubLObject methods_insert_tracing_exit_code(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_name = NIL;
    SubLObject instance = NIL;
    SubLObject result = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    result = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
      return NIL;
    }
    if( NIL != $methods_insert_trace_code_p$.getDynamicValue( thread ) )
    {
      return expand_methods_insert_tracing_exit_code( method_name, instance, result );
    }
    return ConsesLow.list( $sym11$PROGN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6872L)
  public static SubLObject methods_protection_level_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != conses_high.member( v_object, $methods_protection_levels$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7086L)
  public static SubLObject methods_scope_level_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != conses_high.member( v_object, $methods_scope_levels$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7196L)
  public static SubLObject valid_method_listener_types()
  {
    return $valid_method_listener_types$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7196L)
  public static SubLObject method_listener_type_p(final SubLObject v_object)
  {
    return ( NIL != conses_high.member( v_object, $valid_method_listener_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7196L)
  public static SubLObject encode_method_listener_type(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos = Sequences.position( value, $valid_method_listener_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == pos )
    {
      Errors.error( $str28$_S___S_is_not_a_member_of_the__S_, $sym29$ENCODE_METHOD_LISTENER_TYPE, value, $sym27$METHOD_LISTENER_TYPE );
    }
    return pos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7196L)
  public static SubLObject decode_method_listener_type(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject element = ConsesLow.nth( value, $valid_method_listener_types$.getGlobalValue() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == element )
    {
      Errors.error( $str30$_S___S_is_not_a_valid_encoding_of, $sym31$DECODE_METHOD_LISTENER_TYPE, value, $sym27$METHOD_LISTENER_TYPE );
    }
    return element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7196L)
  public static SubLObject method_listener_type_less_p(final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method_listener_type_p( value1 ) )
    {
      Errors.error( $str32$_S___S_was_expected_to_be_a_membe, $sym33$METHOD_LISTENER_TYPE_P, value1, $sym27$METHOD_LISTENER_TYPE );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method_listener_type_p( value2 ) )
    {
      Errors.error( $str32$_S___S_was_expected_to_be_a_membe, $sym33$METHOD_LISTENER_TYPE_P, value2, $sym27$METHOD_LISTENER_TYPE );
    }
    SubLObject cdolist_list_var = $valid_method_listener_types$.getGlobalValue();
    SubLObject value3 = NIL;
    value3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( value3.eql( value1 ) )
      {
        return makeBoolean( !value3.eql( value2 ) );
      }
      if( value3.eql( value2 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      value3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7196L)
  public static SubLObject method_listener_type_greater_p(final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method_listener_type_p( value1 ) )
    {
      Errors.error( $str32$_S___S_was_expected_to_be_a_membe, $sym33$METHOD_LISTENER_TYPE_P, value1, $sym27$METHOD_LISTENER_TYPE );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method_listener_type_p( value2 ) )
    {
      Errors.error( $str32$_S___S_was_expected_to_be_a_membe, $sym33$METHOD_LISTENER_TYPE_P, value2, $sym27$METHOD_LISTENER_TYPE );
    }
    SubLObject cdolist_list_var = $valid_method_listener_types$.getGlobalValue();
    SubLObject value3 = NIL;
    value3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( value3.eql( value2 ) )
      {
        return makeBoolean( !value3.eql( value1 ) );
      }
      if( value3.eql( value1 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      value3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7401L)
  public static SubLObject methods_special_form_given_scope_level(final SubLObject scope_level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject scopes = $methods_scope_levels$.getDynamicValue( thread );
    SubLObject specials = $methods_scope_special_forms$.getDynamicValue( thread );
    SubLObject scope = NIL;
    while ( NIL != scopes && NIL != specials)
    {
      scope = scopes.first();
      if( scope.eql( scope_level ) )
      {
        return specials.first();
      }
      scopes = scopes.rest();
      specials = specials.rest();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7773L)
  public static SubLObject method_assoc(final SubLObject method_name, final SubLObject method_list)
  {
    SubLObject cdolist_list_var = method_list;
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( subloop_structures.method_name( method ).eql( method_name ) )
      {
        return method;
      }
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7940L)
  public static SubLObject method_shadowed_assoc(final SubLObject method_name, final SubLObject method_list)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = method_list;
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( subloop_structures.method_name( method ).eql( method_name ) )
      {
        if( count.numE( ONE_INTEGER ) )
        {
          return method;
        }
        count = Numbers.add( count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8181L)
  public static SubLObject method_class_assoc(final SubLObject method_name, final SubLObject class_name, final SubLObject method_list)
  {
    SubLObject cdolist_list_var = method_list;
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( subloop_structures.method_name( method ).eql( method_name ) && subloop_structures.method_class_name( method ).eql( class_name ) )
      {
        return method;
      }
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8424L)
  public static SubLObject method_class_shadowed_assoc(final SubLObject method_name, final SubLObject class_name, final SubLObject method_list)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = method_list;
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( subloop_structures.method_name( method ).eql( method_name ) && subloop_structures.method_class_name( method ).eql( class_name ) )
      {
        if( count.numE( ONE_INTEGER ) )
        {
          return method;
        }
        count = Numbers.add( count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8737L)
  public static SubLObject methods_protection_level_of_method_decl(final SubLObject v_properties)
  {
    if( !v_properties.isCons() )
    {
      return NIL;
    }
    if( NIL != conses_high.member( $kw35$PRIVATE, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw35$PRIVATE;
    }
    if( NIL != conses_high.member( $kw36$PROTECTED, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw36$PROTECTED;
    }
    if( NIL != conses_high.member( $kw37$PUBLIC, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw37$PUBLIC;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9057L)
  public static SubLObject methods_scope_level_of_method_decl(final SubLObject v_properties)
  {
    if( !v_properties.isCons() )
    {
      return NIL;
    }
    if( NIL != conses_high.member( $kw38$FILE_SCOPE, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw38$FILE_SCOPE;
    }
    if( NIL != conses_high.member( $kw39$SYSTEM_SCOPE, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw39$SYSTEM_SCOPE;
    }
    if( NIL != conses_high.member( $kw40$GLOBAL_SCOPE, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw40$GLOBAL_SCOPE;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9396L)
  public static SubLObject methods_update_type_of_method_decl(final SubLObject v_properties)
  {
    if( !v_properties.isCons() )
    {
      return NIL;
    }
    if( NIL != conses_high.member( $kw41$AUTO_UPDATE, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw41$AUTO_UPDATE;
    }
    if( NIL != conses_high.member( $kw42$NO_MEMBER_VARIABLES, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw42$NO_MEMBER_VARIABLES;
    }
    if( NIL != conses_high.member( $kw43$READ_ONLY, v_properties, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw43$READ_ONLY;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9745L)
  public static SubLObject methods_before_listeners_p(final SubLObject v_properties)
  {
    return makeBoolean( v_properties.isCons() && NIL != conses_high.member( $kw44$BEFORE_LISTENERS, v_properties, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9877L)
  public static SubLObject methods_after_listeners_p(final SubLObject v_properties)
  {
    return makeBoolean( v_properties.isCons() && NIL != conses_high.member( $kw45$AFTER_LISTENERS, v_properties, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10007L)
  public static SubLObject method_instantiate_template_p(final SubLObject v_properties)
  {
    return ( NIL != conses_high.member( $kw46$INSTANTIATE_TEMPLATE, v_properties, UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10132L)
  public static SubLObject new_method(final SubLObject new_name, final SubLObject new_class_name, final SubLObject new_lambda_list)
  {
    final SubLObject method;
    final SubLObject new_method = method = subloop_structures.make_method( UNPROVIDED );
    SubLObject name = subloop_structures.method_name( method );
    SubLObject class_name = subloop_structures.method_class_name( method );
    SubLObject lambda_list = subloop_structures.method_lambda_list( method );
    SubLObject body = subloop_structures.method_body( method );
    SubLObject protection = subloop_structures.method_protection( method );
    SubLObject scope = subloop_structures.method_scope( method );
    SubLObject update_type = subloop_structures.method_update_type( method );
    SubLObject function_name = subloop_structures.method_function_name( method );
    SubLObject function_def = subloop_structures.method_function_def( method );
    try
    {
      name = new_name;
      class_name = new_class_name;
      lambda_list = conses_high.copy_tree( new_lambda_list );
      body = NIL;
      protection = $kw37$PUBLIC;
      scope = $kw40$GLOBAL_SCOPE;
      update_type = $kw47$DEFAULT;
      function_name = Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( class_name ), new SubLObject[] { $str48$_, Symbols.symbol_name( new_name ), $str49$_METHOD
      } ), UNPROVIDED );
      function_def = NIL;
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        subloop_structures._csetf_method_name( method, name );
        subloop_structures._csetf_method_class_name( method, class_name );
        subloop_structures._csetf_method_lambda_list( method, lambda_list );
        subloop_structures._csetf_method_body( method, body );
        subloop_structures._csetf_method_protection( method, protection );
        subloop_structures._csetf_method_scope( method, scope );
        subloop_structures._csetf_method_update_type( method, update_type );
        subloop_structures._csetf_method_function_name( method, function_name );
        subloop_structures._csetf_method_function_def( method, function_def );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return new_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10626L)
  public static SubLObject methods_intern_method(final SubLObject new_name, final SubLObject new_class_name, final SubLObject new_lambda_list, final SubLObject v_properties, final SubLObject table)
  {
    final SubLObject new_protection_level = methods_protection_level_of_method_decl( v_properties );
    final SubLObject new_scope_level = methods_scope_level_of_method_decl( v_properties );
    final SubLObject new_update_type = methods_update_type_of_method_decl( v_properties );
    final SubLObject new_instantiate_template_p = method_instantiate_template_p( v_properties );
    SubLObject cdolist_list_var = table;
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject method_$1 = method;
      final SubLObject name = subloop_structures.method_name( method_$1 );
      final SubLObject class_name = subloop_structures.method_class_name( method_$1 );
      if( new_name.eql( name ) && new_class_name.eql( class_name ) )
      {
        subloop_structures._csetf_method_lambda_list( method, new_lambda_list );
        if( NIL != new_protection_level )
        {
          subloop_structures._csetf_method_protection( method, new_protection_level );
        }
        if( NIL != new_scope_level )
        {
          subloop_structures._csetf_method_scope( method, new_scope_level );
        }
        if( NIL != new_update_type )
        {
          subloop_structures._csetf_method_update_type( method, new_update_type );
        }
        subloop_structures._csetf_method_instantiate_template( method, new_instantiate_template_p );
        return Values.values( table, method );
      }
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    final SubLObject method2 = new_method( new_name, new_class_name, new_lambda_list );
    subloop_structures._csetf_method_protection( method2, ( NIL != new_protection_level ) ? new_protection_level : $kw37$PUBLIC );
    subloop_structures._csetf_method_scope( method2, ( NIL != new_scope_level ) ? new_scope_level : $kw40$GLOBAL_SCOPE );
    subloop_structures._csetf_method_update_type( method2, ( NIL != new_update_type ) ? new_update_type : $kw47$DEFAULT );
    subloop_structures._csetf_method_instantiate_template( method2, new_instantiate_template_p );
    return Values.values( ConsesLow.cons( method2, table ), method2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12488L)
  public static SubLObject method_set_function_definition(final SubLObject method_name, final SubLObject class_name, final SubLObject function_definition, final SubLObject v_methods)
  {
    final SubLObject method = method_class_assoc( method_name, class_name, v_methods );
    if( NIL != method )
    {
      final SubLObject function_name = ( function_definition.isCons() && function_definition.rest().isCons() ) ? conses_high.cadr( function_definition ) : NIL;
      if( NIL != function_name )
      {
        subloop_structures._csetf_method_function_name( method, function_name );
      }
      subloop_structures._csetf_method_function_def( method, function_definition );
      return method;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13006L)
  public static SubLObject methods_check_method_spec(final SubLObject defining_form, final SubLObject method_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !method_spec.isCons() )
    {
      Errors.error( $str50$_S___S_is_not_a_valid_method_spec, defining_form, method_spec );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_spec.first() || !method_spec.first().isSymbol() ) )
    {
      Errors.error( $str51$_S___S_is_not_a_valid_method_name, defining_form, method_spec.first() );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !method_spec.rest().isCons() )
    {
      Errors.error( $str50$_S___S_is_not_a_valid_method_spec, defining_form, method_spec );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == conses_high.cadr( method_spec ) || !conses_high.cadr( method_spec ).isSymbol() ) )
    {
      Errors.error( $str52$_S__While_defining_method__S___S_, defining_form, method_spec.first(), conses_high.cadr( method_spec ) );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !conses_high.cddr( method_spec ).isList() )
    {
      Errors.error( $str50$_S___S_is_not_a_valid_method_spec, defining_form, method_spec );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14202L)
  public static SubLObject def_instance_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_spec = NIL;
    SubLObject lambda_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    method_spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    lambda_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    methods_check_method_spec( $sym54$DEF_INSTANCE_METHOD, method_spec );
    SubLObject current_$3;
    final SubLObject datum_$2 = current_$3 = method_spec;
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    SubLObject method_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$3, datum_$2, $list55 );
    method_name = current_$3.first();
    current_$3 = current_$3.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current_$3, datum_$2, $list55 );
    class_name = current_$3.first();
    current_$3 = ( method_properties = current_$3.rest() );
    methods_incorporate_instance_method( method_name, class_name, method_properties, lambda_list, body );
    final SubLObject method_def = methods_retrieve_instance_method_definition( method_name, class_name );
    final SubLObject function_name = conses_high.cadr( method_def );
    return ConsesLow.list( $sym11$PROGN, ConsesLow.list( $sym56$METHODS_INCORPORATE_INSTANCE_METHOD, ConsesLow.list( $sym18$QUOTE, method_name ), ConsesLow.list( $sym18$QUOTE, class_name ), ConsesLow.list( $sym18$QUOTE,
        method_properties ), ConsesLow.list( $sym18$QUOTE, lambda_list ), ConsesLow.list( $sym18$QUOTE, body ) ), ConsesLow.append( ConsesLow.list( method_def.first(), function_name ), conses_high.cddr( method_def ) ),
        ConsesLow.list( $sym57$SUBLOOP_REGISTER_INSTANCE_METHOD, ConsesLow.list( $sym18$QUOTE, class_name ), ConsesLow.list( $sym18$QUOTE, method_name ), ConsesLow.list( $sym18$QUOTE, function_name ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15175L)
  public static SubLObject subloop_register_instance_method(final SubLObject class_name, final SubLObject method_name, final SubLObject function_name)
  {
    final SubLObject v_class_$4;
    final SubLObject v_class = v_class_$4 = classes.classes_retrieve_class( class_name );
    final SubLObject instance_method_decls = subloop_structures.class_instance_method_decls( v_class_$4 );
    final SubLObject method = method_assoc( method_name, instance_method_decls );
    subloop_structures._csetf_method_function_name( method, function_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15613L)
  public static SubLObject def_default_instance_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_spec = NIL;
    SubLObject lambda_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    method_spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    lambda_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym54$DEF_INSTANCE_METHOD, method_spec, lambda_list, body.first(), ConsesLow.list( $sym58$PWHEN, $sym59$_REPORT_DEFAULT_METHOD_CALLS__, ConsesLow.list( $sym60$WARN,
        $str61$Default_method_call__a_on_class__, ConsesLow.list( $sym18$QUOTE, method_spec.first() ), ConsesLow.list( $sym18$QUOTE, conses_high.second( method_spec ) ) ) ), ConsesLow.append( body.rest(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15938L)
  public static SubLObject methods_retrieve_instance_method_definition(final SubLObject method_name, final SubLObject class_name)
  {
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    SubLObject result = NIL;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject v_class_$5 = v_class;
      final SubLObject instance_method_decls = subloop_structures.class_instance_method_decls( v_class_$5 );
      final SubLObject method = method_assoc( method_name, instance_method_decls );
      if( NIL != method )
      {
        result = subloop_structures.method_function_def( method );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16344L)
  public static SubLObject methods_incorporate_instance_method(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    SubLObject result = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str62$DEF_INSTANCE_METHOD___S_is_not_th, class_name );
    }
    if( NIL != methods_update_instance_method_decl( method_name, class_name, method_properties, lambda_list, body ) )
    {
      result = methods_compile_method_access_alists( class_name );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16872L)
  public static SubLObject methods_update_instance_method_decl(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject v_class_$6 = v_class;
      SubLObject instance_method_decls = subloop_structures.class_instance_method_decls( v_class_$6 );
      try
      {
        thread.resetMultipleValues();
        final SubLObject new_decls = methods_intern_method( method_name, class_name, lambda_list, method_properties, instance_method_decls );
        final SubLObject method = thread.secondMultipleValue();
        thread.resetMultipleValues();
        instance_method_decls = new_decls;
        subloop_structures._csetf_method_body( method, body );
        methods_generate_instance_function_definition( method, method_properties, body );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_structures._csetf_class_instance_method_decls( v_class_$6, instance_method_decls );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      return method_name;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17462L)
  public static SubLObject def_class_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method_spec = NIL;
    SubLObject lambda_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    method_spec = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    lambda_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    methods_check_method_spec( $sym63$DEF_CLASS_METHOD, method_spec );
    SubLObject current_$8;
    final SubLObject datum_$7 = current_$8 = method_spec;
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    SubLObject method_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list55 );
    method_name = current_$8.first();
    current_$8 = current_$8.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list55 );
    class_name = current_$8.first();
    current_$8 = ( method_properties = current_$8.rest() );
    methods_incorporate_class_method( method_name, class_name, method_properties, lambda_list, body );
    final SubLObject method_def = methods_retrieve_class_method_definition( method_name, class_name );
    final SubLObject function_name = conses_high.cadr( method_def );
    return ConsesLow.list( $sym11$PROGN, ConsesLow.list( $sym64$METHODS_INCORPORATE_CLASS_METHOD, ConsesLow.list( $sym18$QUOTE, method_name ), ConsesLow.list( $sym18$QUOTE, class_name ), ConsesLow.list( $sym18$QUOTE,
        method_properties ), ConsesLow.list( $sym18$QUOTE, lambda_list ), ConsesLow.list( $sym18$QUOTE, body ) ), ConsesLow.append( ConsesLow.list( method_def.first(), function_name ), conses_high.cddr( method_def ) ),
        ConsesLow.list( $sym65$SUBLOOP_REGISTER_CLASS_METHOD, ConsesLow.list( $sym18$QUOTE, class_name ), ConsesLow.list( $sym18$QUOTE, method_name ), ConsesLow.list( $sym18$QUOTE, function_name ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18416L)
  public static SubLObject subloop_register_class_method(final SubLObject class_name, final SubLObject method_name, final SubLObject function_name)
  {
    final SubLObject v_class_$9;
    final SubLObject v_class = v_class_$9 = classes.classes_retrieve_class( class_name );
    final SubLObject class_method_decls = subloop_structures.class_class_method_decls( v_class_$9 );
    final SubLObject method = method_assoc( method_name, class_method_decls );
    subloop_structures._csetf_method_function_name( method, function_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18787L)
  public static SubLObject methods_retrieve_class_method_definition(final SubLObject method_name, final SubLObject class_name)
  {
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject v_class_$10 = v_class;
      final SubLObject class_method_decls = subloop_structures.class_class_method_decls( v_class_$10 );
      final SubLObject method = method_assoc( method_name, class_method_decls );
      if( NIL != method )
      {
        return subloop_structures.method_function_def( method );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19118L)
  public static SubLObject methods_incorporate_class_method(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    SubLObject result = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str66$DEF_CLASS_METHOD___S_is_not_the_n, class_name );
    }
    if( NIL != methods_update_class_method_decl( method_name, class_name, method_properties, lambda_list, body ) )
    {
      result = methods_compile_method_access_alists( class_name );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19629L)
  public static SubLObject methods_update_class_method_decl(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject v_class_$11 = v_class;
      SubLObject class_method_decls = subloop_structures.class_class_method_decls( v_class_$11 );
      try
      {
        thread.resetMultipleValues();
        final SubLObject new_decls = methods_intern_method( method_name, class_name, lambda_list, method_properties, class_method_decls );
        final SubLObject method = thread.secondMultipleValue();
        thread.resetMultipleValues();
        class_method_decls = new_decls;
        subloop_structures._csetf_method_body( method, body );
        methods_generate_instance_function_definition( method, method_properties, body );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_structures._csetf_class_class_method_decls( v_class_$11, class_method_decls );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      return method_name;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20210L)
  public static SubLObject methods_method_name_given_method_decl(final SubLObject method_decl)
  {
    return method_decl.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20325L)
  public static SubLObject methods_function_name_given_method_decl(final SubLObject method_decl)
  {
    return conses_high.cadr( method_decl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20443L)
  public static SubLObject methods_function_def_given_method_decl(final SubLObject method_decl)
  {
    return conses_high.cddr( method_decl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20560L)
  public static SubLObject methods_set_function_def_of_method_decl(final SubLObject method_decl, final SubLObject function_def)
  {
    ConsesLow.rplacd( method_decl.rest(), conses_high.copy_tree( function_def ) );
    return function_def;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20739L)
  public static SubLObject methods_add_method_decl(final SubLObject method_decl, final SubLObject method_dcls)
  {
    return ConsesLow.cons( method_decl, method_dcls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20865L)
  public static SubLObject methods_retrieve_method_decl(final SubLObject method_name, final SubLObject method_decls)
  {
    return conses_high.assoc( method_name, method_decls, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20999L)
  public static SubLObject methods_compile_method_access_alists(final SubLObject class_name_or_class)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      methods_compile_class_method_access_alist( v_class );
      methods_compile_instance_method_access_alist( v_class );
      return v_class;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21387L)
  public static SubLObject methods_compile_class_method_access_alist_upwards(final SubLObject class_name_or_class, SubLObject recompile_parent)
  {
    if( recompile_parent == UNPROVIDED )
    {
      recompile_parent = NIL;
    }
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      SubLObject super_class_compiled_class_method_access_alist = NIL;
      final SubLObject v_class_$12 = v_class;
      final SubLObject parent = subloop_structures.class_parent( v_class_$12 );
      final SubLObject class_method_decls = subloop_structures.class_class_method_decls( v_class_$12 );
      SubLObject compiled_class_method_access_alist = subloop_structures.class_compiled_class_method_access_alist( v_class_$12 );
      try
      {
        if( NIL != parent )
        {
          final SubLObject parent_class = classes.classes_retrieve_class( parent );
          if( NIL != parent_class )
          {
            if( NIL != recompile_parent )
            {
              methods_compile_class_method_access_alist_upwards( parent_class, recompile_parent );
            }
            super_class_compiled_class_method_access_alist = subloop_structures.class_compiled_class_method_access_alist( parent_class );
          }
        }
        compiled_class_method_access_alist = super_class_compiled_class_method_access_alist;
        SubLObject cdolist_list_var = class_method_decls;
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          compiled_class_method_access_alist = ConsesLow.cons( method, compiled_class_method_access_alist );
          cdolist_list_var = cdolist_list_var.rest();
          method = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_structures._csetf_class_parent( v_class_$12, parent );
          subloop_structures._csetf_class_class_method_decls( v_class_$12, class_method_decls );
          subloop_structures._csetf_class_compiled_class_method_access_alist( v_class_$12, compiled_class_method_access_alist );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
      return v_class;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22338L)
  public static SubLObject methods_compile_class_method_access_alist(final SubLObject class_name_or_class)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject v_class_$13 = v_class;
      final SubLObject subclasses = subloop_structures.class_subclasses( v_class_$13 );
      methods_compile_class_method_access_alist_upwards( class_name_or_class, NIL );
      SubLObject cdolist_list_var = subclasses;
      SubLObject subclass = NIL;
      subclass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        methods_compile_class_method_access_alist( subclass );
        cdolist_list_var = cdolist_list_var.rest();
        subclass = cdolist_list_var.first();
      }
      return v_class;
    }
    return v_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22807L)
  public static SubLObject methods_compile_instance_method_access_alist_upwards(final SubLObject class_name_or_class, SubLObject recompile_parent)
  {
    if( recompile_parent == UNPROVIDED )
    {
      recompile_parent = NIL;
    }
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      SubLObject super_class_compiled_instance_method_access_alist = NIL;
      final SubLObject v_class_$14 = v_class;
      final SubLObject parent = subloop_structures.class_parent( v_class_$14 );
      final SubLObject instance_method_decls = subloop_structures.class_instance_method_decls( v_class_$14 );
      SubLObject compiled_instance_method_access_alist = subloop_structures.class_compiled_instance_method_access_alist( v_class_$14 );
      SubLObject tablified_instance_methods = subloop_structures.class_tablified_instance_methods( v_class_$14 );
      try
      {
        if( NIL != parent )
        {
          final SubLObject parent_class = classes.classes_retrieve_class( parent );
          if( NIL != parent_class )
          {
            if( NIL != recompile_parent )
            {
              methods_compile_instance_method_access_alist_upwards( parent_class, recompile_parent );
            }
            super_class_compiled_instance_method_access_alist = subloop_structures.class_compiled_instance_method_access_alist( parent_class );
          }
        }
        compiled_instance_method_access_alist = super_class_compiled_instance_method_access_alist;
        SubLObject cdolist_list_var = instance_method_decls;
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          compiled_instance_method_access_alist = ConsesLow.cons( method, compiled_instance_method_access_alist );
          cdolist_list_var = cdolist_list_var.rest();
          method = cdolist_list_var.first();
        }
        tablified_instance_methods = subloop_structures.tablify_method_list( compiled_instance_method_access_alist );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_structures._csetf_class_parent( v_class_$14, parent );
          subloop_structures._csetf_class_instance_method_decls( v_class_$14, instance_method_decls );
          subloop_structures._csetf_class_compiled_instance_method_access_alist( v_class_$14, compiled_instance_method_access_alist );
          subloop_structures._csetf_class_tablified_instance_methods( v_class_$14, tablified_instance_methods );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
      return v_class;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23890L)
  public static SubLObject methods_compile_instance_method_access_alist(final SubLObject class_name_or_class)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject v_class_$15 = v_class;
      final SubLObject subclasses = subloop_structures.class_subclasses( v_class_$15 );
      methods_compile_instance_method_access_alist_upwards( class_name_or_class, NIL );
      SubLObject cdolist_list_var = subclasses;
      SubLObject subclass = NIL;
      subclass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        methods_compile_instance_method_access_alist( subclass );
        cdolist_list_var = cdolist_list_var.rest();
        subclass = cdolist_list_var.first();
      }
      return v_class;
    }
    return v_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_0_args(final SubLObject class_name_or_class, final SubLObject method_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_1_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_2_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_3_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_4_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1, arg2, arg3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_5_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1, arg2, arg3, arg4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_6_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_7_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_8_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_9_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_10_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_11_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_12_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_13_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_14_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_15_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_16_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_17_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_18_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
      arg17
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_19_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
      arg17, arg18
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24368L)
  public static SubLObject funcall_class_method_with_20_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str67$FUNCALL_CLASS_METHOD___S_is_not_a, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str68$FUNCALL_CLASS_METHOD___S_is_not_a, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
      arg17, arg18, arg19
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_0_args(final SubLObject class_name_or_class, final SubLObject method_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_1_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_2_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_3_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_4_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1, arg2, arg3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_5_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1, arg2, arg3, arg4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_6_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_7_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_8_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_9_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_10_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_11_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_12_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_13_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_14_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_15_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_16_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_17_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_18_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
      arg17
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_19_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
      arg17, arg18
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25018L)
  public static SubLObject funcall_class_super_method_with_20_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str69$FUNCALL_CLASS_SUPER_METHOD___S_is, class_name_or_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str70$FUNCALL_CLASS_SUPER_METHOD___S_is, method_name, subloop_structures.class_name( v_class ) );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( classes_utilities.$classes_utilities_undefined_class_super_method_message$.getGlobalValue(), method_name, v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
      arg17, arg18, arg19
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_0_args(final SubLObject class_name_or_class, final SubLObject method_name)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_1_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class, arg0 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_2_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_3_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1, arg2 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_4_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1, arg2, arg3 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_5_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1, arg2, arg3, arg4 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_6_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_7_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_8_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_9_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_10_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_11_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_12_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_13_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_14_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_15_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_16_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_17_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_18_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_19_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25734L)
  public static SubLObject safe_funcall_class_method_with_20_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_0_args(final SubLObject class_name_or_class, final SubLObject method_name)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_1_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class, arg0 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_2_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_3_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1, arg2 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_4_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1, arg2, arg3 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_5_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1, arg2, arg3, arg4 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_6_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_7_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_8_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_9_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_10_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_11_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_12_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_13_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_14_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_15_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_16_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_17_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_18_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_19_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26431L)
  public static SubLObject safe_funcall_class_super_method_with_20_args(final SubLObject class_name_or_class, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class )
        : ( ( NIL != subloop_structures.instance_p( class_name_or_class ) ) ? subloop_structures.instance_class( class_name_or_class ) : class_name_or_class );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return Values.values( NIL, $kw73$UNDECLARED_METHOD );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_0_args(final SubLObject instance, final SubLObject method_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance );
    }
    return funcall_class_method_with_0_args( v_class, method_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_1_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance, arg0 );
    }
    return funcall_class_method_with_1_args( v_class, method_name, arg0 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_2_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance, arg0, arg1 );
    }
    return funcall_class_method_with_2_args( v_class, method_name, arg0, arg1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_3_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance, arg0, arg1, arg2 );
    }
    return funcall_class_method_with_3_args( v_class, method_name, arg0, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_4_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance, arg0, arg1, arg2, arg3 );
    }
    return funcall_class_method_with_4_args( v_class, method_name, arg0, arg1, arg2, arg3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_5_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance, arg0, arg1, arg2, arg3, arg4 );
    }
    return funcall_class_method_with_5_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_6_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5
      } );
    }
    return funcall_class_method_with_6_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_7_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6
      } );
    }
    return funcall_class_method_with_7_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_8_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
      } );
    }
    return funcall_class_method_with_8_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_9_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
      } );
    }
    return funcall_class_method_with_9_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_10_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
      } );
    }
    return funcall_class_method_with_10_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_11_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
      } );
    }
    return funcall_class_method_with_11_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_12_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
      } );
    }
    return funcall_class_method_with_12_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_13_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
      } );
    }
    return funcall_class_method_with_13_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_14_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
      } );
    }
    return funcall_class_method_with_14_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_15_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
      } );
    }
    return funcall_class_method_with_15_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_16_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
      } );
    }
    return funcall_class_method_with_16_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_17_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
      } );
    }
    return funcall_class_method_with_17_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_18_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
        arg17
      } );
    }
    return funcall_class_method_with_18_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_19_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
        arg17, arg18
      } );
    }
    return funcall_class_method_with_19_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27212L)
  public static SubLObject funcall_instance_method_with_20_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
        arg17, arg18, arg19
      } );
    }
    return funcall_class_method_with_20_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_0_args(final SubLObject instance, final SubLObject method_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance );
    }
    return funcall_class_super_method_with_0_args( v_class, method_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_1_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance, arg0 );
    }
    return funcall_class_super_method_with_1_args( v_class, method_name, arg0 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_2_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance, arg0, arg1 );
    }
    return funcall_class_super_method_with_2_args( v_class, method_name, arg0, arg1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_3_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance, arg0, arg1, arg2 );
    }
    return funcall_class_super_method_with_3_args( v_class, method_name, arg0, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_4_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance, arg0, arg1, arg2, arg3 );
    }
    return funcall_class_super_method_with_4_args( v_class, method_name, arg0, arg1, arg2, arg3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_5_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), instance, arg0, arg1, arg2, arg3, arg4 );
    }
    return funcall_class_super_method_with_5_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_6_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5
      } );
    }
    return funcall_class_super_method_with_6_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_7_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6
      } );
    }
    return funcall_class_super_method_with_7_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_8_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
      } );
    }
    return funcall_class_super_method_with_8_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_9_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
      } );
    }
    return funcall_class_super_method_with_9_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_10_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
      } );
    }
    return funcall_class_super_method_with_10_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_11_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
      } );
    }
    return funcall_class_super_method_with_11_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_12_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
      } );
    }
    return funcall_class_super_method_with_12_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_13_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
      } );
    }
    return funcall_class_super_method_with_13_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_14_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
      } );
    }
    return funcall_class_super_method_with_14_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_15_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
      } );
    }
    return funcall_class_super_method_with_15_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_16_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
      } );
    }
    return funcall_class_super_method_with_16_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_17_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
      } );
    }
    return funcall_class_super_method_with_17_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_18_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
        arg17
      } );
    }
    return funcall_class_super_method_with_18_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_19_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
        arg17, arg18
      } );
    }
    return funcall_class_super_method_with_19_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27953L)
  public static SubLObject funcall_instance_super_method_with_20_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str76$__FUNCALL_INSTANCE_METHOD__either, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
        arg17, arg18, arg19
      } );
    }
    return funcall_class_super_method_with_20_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_0_args(final SubLObject class_or_instance, final SubLObject method_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), v_class );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), class_or_instance );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_1_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0 );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), class_or_instance, arg0 );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_2_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1 );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), class_or_instance, arg0, arg1 );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_3_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1, arg2 );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), class_or_instance, arg0, arg1, arg2 );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_4_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1, arg2, arg3 );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), class_or_instance, arg0, arg1, arg2, arg3 );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_5_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), v_class, arg0, arg1, arg2, arg3, arg4 );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), class_or_instance, arg0, arg1, arg2, arg3, arg4 );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_6_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_7_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_8_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_9_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_10_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_11_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_12_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_13_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_14_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_15_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_16_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14,
        arg15
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_17_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14,
        arg15, arg16
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_18_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
        arg17
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14,
        arg15, arg16, arg17
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_19_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
        arg17, arg18
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14,
        arg15, arg16, arg17, arg18
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28763L)
  public static SubLObject funcall_class_or_instance_method_with_20_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    }
    if( NIL == subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
      {
        Errors.error( $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
      {
        Errors.error( classes_utilities.$classes_utilities_undefined_class_method_message$.getGlobalValue(), method_name, v_class );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16,
        arg17, arg18, arg19
      } );
    }
    final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Errors.error( classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
      }
      return Functions.funcall( subloop_structures.method_function_name( method ), new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14,
        arg15, arg16, arg17, arg18, arg19
      } );
    }
    Errors.error( $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO, method_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_0_args(final SubLObject instance, final SubLObject method_name)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_0_args( v_class, method_name );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_1_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_1_args( v_class, method_name, arg0 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance, arg0 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_2_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_2_args( v_class, method_name, arg0, arg1 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance, arg0, arg1 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_3_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_3_args( v_class, method_name, arg0, arg1, arg2 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance, arg0, arg1, arg2 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_4_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_4_args( v_class, method_name, arg0, arg1, arg2, arg3 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance, arg0, arg1, arg2, arg3 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_5_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_5_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance, arg0, arg1, arg2, arg3, arg4 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_6_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_6_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_7_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_7_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_8_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_8_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_9_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_9_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_10_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_10_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_11_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_11_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_12_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_12_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_13_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_13_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_14_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_14_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_15_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_15_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_16_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_16_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_17_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_17_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_18_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_18_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_19_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_19_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28868L)
  public static SubLObject safe_funcall_instance_method_with_20_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3,
      final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11, final SubLObject arg12,
      final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == method )
    {
      return safe_funcall_class_method_with_20_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_0_args(final SubLObject instance, final SubLObject method_name)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_0_args( v_class, method_name );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_1_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_1_args( v_class, method_name, arg0 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance, arg0 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_2_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_2_args( v_class, method_name, arg0, arg1 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance, arg0, arg1 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_3_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_3_args( v_class, method_name, arg0, arg1, arg2 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance, arg0, arg1, arg2 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_4_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_4_args( v_class, method_name, arg0, arg1, arg2, arg3 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance, arg0, arg1, arg2, arg3 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_5_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_5_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, instance, arg0, arg1, arg2, arg3, arg4 ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_6_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_6_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_7_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_7_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_8_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_8_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_9_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_9_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_10_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_10_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_11_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_11_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_12_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_12_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_13_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_13_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_14_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_14_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_15_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_15_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_16_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_16_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_17_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_17_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_18_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_18_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_19_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_19_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29658L)
  public static SubLObject safe_funcall_instance_super_method_with_20_args(final SubLObject instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19)
  {
    if( NIL == subloop_structures.instance_p( instance ) )
    {
      return Values.values( NIL, $kw79$TARGET_NOT_AN_INSTANCE );
    }
    if( !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL == method )
    {
      return safe_funcall_class_super_method_with_20_args( v_class, method_name, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19 );
    }
    if( NIL == instances.instances_access_check_method( v_class, method ) )
    {
      return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
    }
    final SubLObject function_ref = subloop_structures.method_function_name( method );
    if( NIL == Symbols.fboundp( function_ref ) )
    {
      return Values.values( NIL, $kw75$UNDEFINED_METHOD );
    }
    return Values.values( Functions.funcall( function_ref, new SubLObject[] { instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19
    } ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_0_args(final SubLObject class_or_instance, final SubLObject method_name)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, class_or_instance ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, v_class ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_1_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, class_or_instance, arg0 ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, v_class, arg0 ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_2_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, class_or_instance, arg0, arg1 ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1 ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_3_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, class_or_instance, arg0, arg1, arg2 ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1, arg2 ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_4_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, class_or_instance, arg0, arg1, arg2, arg3 ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1, arg2, arg3 ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_5_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, class_or_instance, arg0, arg1, arg2, arg3, arg4 ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, v_class, arg0, arg1, arg2, arg3, arg4 ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_6_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_7_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_8_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_9_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_10_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_11_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_12_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_13_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_14_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_15_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_16_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_17_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_18_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_19_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30538L)
  public static SubLObject safe_funcall_class_or_instance_method_with_20_args(final SubLObject class_or_instance, final SubLObject method_name, final SubLObject arg0, final SubLObject arg1, final SubLObject arg2,
      final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7, final SubLObject arg8, final SubLObject arg9, final SubLObject arg10, final SubLObject arg11,
      final SubLObject arg12, final SubLObject arg13, final SubLObject arg14, final SubLObject arg15, final SubLObject arg16, final SubLObject arg17, final SubLObject arg18, final SubLObject arg19)
  {
    if( NIL == method_name || !method_name.isSymbol() )
    {
      return Values.values( NIL, $kw72$INVALID_METHOD_NAME );
    }
    if( NIL != subloop_structures.instance_p( class_or_instance ) )
    {
      final SubLObject v_class = subloop_structures.instance_class( class_or_instance );
      final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
      if( NIL == method )
      {
        return Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        return Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { class_or_instance, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17,
        arg18, arg19
      } ), NIL );
    }
    else
    {
      final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance : classes.classes_retrieve_class( class_or_instance );
      final SubLObject method = ( NIL != v_class ) ? method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) ) : NIL;
      if( NIL == subloop_structures.class_p( v_class ) )
      {
        return Values.values( NIL, $kw71$TARGET_NOT_A_CLASS );
      }
      if( NIL == method )
      {
        Values.values( NIL, $kw73$UNDECLARED_METHOD );
      }
      if( NIL == instances.instances_access_check_method( v_class, method ) )
      {
        Values.values( NIL, $kw74$ACCESS_LEVEL_CONFLICT );
      }
      final SubLObject function_ref = subloop_structures.method_function_name( method );
      if( NIL == Symbols.fboundp( function_ref ) )
      {
        return Values.values( NIL, $kw75$UNDEFINED_METHOD );
      }
      return Values.values( Functions.funcall( function_ref, new SubLObject[] { v_class, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19
      } ), NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30653L)
  public static SubLObject resolve_method(final SubLObject method_name, final SubLObject class_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_class )
    {
      Errors.error( $str80$RESOLVE_METHOD___S_is_not_a_defin, class_name );
    }
    final SubLObject v_class_$16 = v_class;
    final SubLObject compiled_class_method_access_alist = subloop_structures.class_compiled_class_method_access_alist( v_class_$16 );
    final SubLObject tablified_instance_methods = subloop_structures.class_tablified_instance_methods( v_class_$16 );
    SubLObject method = Hashtables.gethash( method_name, tablified_instance_methods, UNPROVIDED );
    if( NIL == method )
    {
      method = method_assoc( method_name, compiled_class_method_access_alist );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( $str81$RESOLVE_METHOD___S_is_not_a_defin, method_name, class_name );
    }
    return subloop_structures.method_function_name( method );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31195L)
  public static SubLObject quote_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    class_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      if( NIL == current )
      {
        return ConsesLow.list( $sym18$QUOTE, resolve_method( method_name, class_name ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31298L)
  public static SubLObject fquote_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    class_name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      if( NIL == current )
      {
        final SubLObject resolved_method = resolve_method( method_name, class_name );
        if( resolved_method.isFunction() )
        {
          return ConsesLow.list( $sym18$QUOTE, Symbols.symbol_function( resolved_method ) );
        }
        return ConsesLow.list( $sym18$QUOTE, resolved_method );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31530L)
  public static SubLObject method_name_to_function_name(final SubLObject method_name, final SubLObject class_name)
  {
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return NIL;
    }
    SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      return subloop_structures.method_function_name( method );
    }
    method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL != method )
    {
      return subloop_structures.method_function_name( method );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32037L)
  public static SubLObject inline_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    class_name = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list83 );
      return NIL;
    }
    current = temp;
    SubLObject class_or_instance = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    class_or_instance = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return ConsesLow.listS( $sym84$FUNCALL_INSTANCE_METHOD, class_or_instance, ConsesLow.list( $sym18$QUOTE, method_name ), args );
    }
    SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL != method )
    {
      return ConsesLow.listS( subloop_structures.method_function_name( method ), class_or_instance, args );
    }
    method = method_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL != method )
    {
      return ConsesLow.listS( subloop_structures.method_function_name( method ), class_or_instance, args );
    }
    return ConsesLow.listS( $sym84$FUNCALL_INSTANCE_METHOD, class_or_instance, ConsesLow.list( $sym18$QUOTE, method_name ), args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32729L)
  public static SubLObject inline_super_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject class_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    class_name = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list83 );
      return NIL;
    }
    current = temp;
    SubLObject class_or_instance = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    class_or_instance = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    if( NIL == subloop_structures.class_p( v_class ) )
    {
      return ConsesLow.listS( $sym85$FUNCALL_INSTANCE_SUPER_METHOD, class_or_instance, ConsesLow.list( $sym18$QUOTE, method_name ), args );
    }
    SubLObject method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_instance_method_access_alist( v_class ) );
    if( NIL != method )
    {
      return ConsesLow.listS( subloop_structures.method_function_name( method ), class_or_instance, args );
    }
    method = method_shadowed_assoc( method_name, subloop_structures.class_compiled_class_method_access_alist( v_class ) );
    if( NIL != method )
    {
      return ConsesLow.listS( subloop_structures.method_function_name( method ), class_or_instance, args );
    }
    return ConsesLow.listS( $sym85$FUNCALL_INSTANCE_SUPER_METHOD, class_or_instance, ConsesLow.list( $sym18$QUOTE, method_name ), args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33486L)
  public static SubLObject methods_inline_method_calls_internal(final SubLObject body, final SubLObject v_class, final SubLObject class_name, final SubLObject method_list, SubLObject inside_backquote)
  {
    if( inside_backquote == UNPROVIDED )
    {
      inside_backquote = NIL;
    }
    if( NIL == body )
    {
      return NIL;
    }
    if( body.isAtom() )
    {
      return body;
    }
    if( body.first().isSymbol() )
    {
      if( !body.rest().isCons() )
      {
        return body;
      }
      if( body.first() == $sym18$QUOTE )
      {
        return body;
      }
      final SubLObject method = method_assoc( body.first(), method_list );
      if( NIL == method )
      {
        return ConsesLow.cons( body.first(), methods_inline_method_calls_internal( body.rest(), v_class, class_name, method_list, UNPROVIDED ) );
      }
      final SubLObject first_arg = conses_high.cadr( body );
      final SubLObject args = conses_high.cddr( body );
      if( first_arg == $sym86$SELF )
      {
        SubLObject transformed_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          transformed_args = ConsesLow.cons( methods_inline_method_calls_internal( arg, v_class, class_name, method_list, UNPROVIDED ), transformed_args );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        return ConsesLow.listS( $sym87$INLINE_METHOD, ConsesLow.list( body.first(), class_name ), $sym86$SELF, Sequences.nreverse( transformed_args ) );
      }
      if( first_arg == $sym88$SUPER )
      {
        SubLObject transformed_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          transformed_args = ConsesLow.cons( methods_inline_method_calls_internal( arg, v_class, class_name, method_list, UNPROVIDED ), transformed_args );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        return ConsesLow.listS( $sym89$INLINE_SUPER_METHOD, ConsesLow.list( body.first(), class_name ), $sym86$SELF, Sequences.nreverse( transformed_args ) );
      }
      return ConsesLow.cons( body.first(), methods_inline_method_calls_internal( body.rest(), v_class, class_name, method_list, UNPROVIDED ) );
    }
    else
    {
      if( body.first().isAtom() )
      {
        return ConsesLow.cons( body.first(), methods_inline_method_calls_internal( body.rest(), v_class, class_name, method_list, UNPROVIDED ) );
      }
      return ConsesLow.cons( methods_inline_method_calls_internal( body.first(), v_class, class_name, method_list, UNPROVIDED ), methods_inline_method_calls_internal( body.rest(), v_class, class_name, method_list,
          UNPROVIDED ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38136L)
  public static SubLObject methods_inline_method_calls(final SubLObject body, final SubLObject class_name_or_class)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject class_name = subloop_structures.class_name( v_class );
      return methods_inline_method_calls_internal( methods_inline_method_calls_internal( body, v_class, class_name, instances.instances_filter_methods_per_access( v_class, subloop_structures
          .class_compiled_class_method_access_alist( v_class ) ), UNPROVIDED ), v_class, class_name, instances.instances_filter_methods_per_access( v_class, subloop_structures.class_compiled_instance_method_access_alist(
              v_class ) ), UNPROVIDED );
    }
    return body;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38784L)
  public static SubLObject methods_transform_setq_for_auto_update_private(final SubLObject setq_form, final SubLObject v_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject setq_pairs = setq_form.rest();
    SubLObject new_forms = NIL;
    SubLObject transformed = NIL;
    SubLObject remainder;
    SubLObject var;
    SubLObject form;
    SubLObject getter;
    SubLObject setter;
    for( remainder = NIL, remainder = setq_pairs; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      var = remainder.first();
      form = conses_high.cadr( remainder );
      thread.resetMultipleValues();
      getter = slots.get_instance_slot_accessors( v_class, var );
      setter = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != setter )
      {
        transformed = T;
        new_forms = ConsesLow.cons( conses_high.copy_list( ConsesLow.list( $sym90$CSETQ, var, methods_transform_setqs_for_auto_update_private( form, v_class ) ) ), new_forms );
        new_forms = ConsesLow.cons( conses_high.copy_list( ConsesLow.list( setter, $sym86$SELF, var ) ), new_forms );
      }
      else
      {
        new_forms = ConsesLow.cons( conses_high.copy_list( ConsesLow.list( $sym90$CSETQ, var, form ) ), new_forms );
      }
    }
    if( NIL != transformed )
    {
      return ConsesLow.cons( $sym11$PROGN, Sequences.nreverse( new_forms ) );
    }
    return setq_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39470L)
  public static SubLObject methods_transform_cinc_or_cdec_for_auto_update_private(final SubLObject setq_form, final SubLObject v_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !setq_form.isCons() || !setq_form.rest().isCons() )
    {
      return setq_form;
    }
    final SubLObject var = conses_high.cadr( setq_form );
    final SubLObject other_forms = methods_transform_setqs_for_auto_update_private( conses_high.cddr( setq_form ), v_class );
    thread.resetMultipleValues();
    final SubLObject getter = slots.get_instance_slot_accessors( v_class, var );
    final SubLObject setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != setter )
    {
      return conses_high.copy_list( ConsesLow.list( $sym11$PROGN, ConsesLow.listS( setq_form.first(), var, other_forms ), ConsesLow.list( setter, $sym86$SELF, var ) ) );
    }
    return setq_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40010L)
  public static SubLObject methods_transform_cpop_for_auto_update_private(final SubLObject setq_form, final SubLObject v_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !setq_form.isCons() || !setq_form.rest().isCons() )
    {
      return setq_form;
    }
    final SubLObject var = conses_high.cadr( setq_form );
    thread.resetMultipleValues();
    final SubLObject getter = slots.get_instance_slot_accessors( v_class, var );
    final SubLObject setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != setter )
    {
      return conses_high.copy_list( ConsesLow.list( $sym11$PROGN, setq_form, ConsesLow.list( setter, $sym86$SELF, var ) ) );
    }
    return setq_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40413L)
  public static SubLObject methods_transform_cpush_or_cpushnew_for_auto_update_private(final SubLObject setq_form, final SubLObject v_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !setq_form.isCons() || !setq_form.rest().isCons() || !conses_high.cddr( setq_form ).isCons() )
    {
      return setq_form;
    }
    final SubLObject item = methods_transform_setqs_for_auto_update_private( conses_high.cadr( setq_form ), v_class );
    final SubLObject var = conses_high.cddr( setq_form ).first();
    final SubLObject rest = conses_high.cddr( setq_form ).rest();
    thread.resetMultipleValues();
    final SubLObject getter = slots.get_instance_slot_accessors( v_class, var );
    final SubLObject setter = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != setter )
    {
      return conses_high.copy_list( ConsesLow.list( $sym11$PROGN, ConsesLow.listS( setq_form.first(), item, var, rest ), ConsesLow.list( setter, $sym86$SELF, var ) ) );
    }
    return setq_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41021L)
  public static SubLObject methods_transform_cmultiple_value_setq_for_auto_update_private(final SubLObject setq_form, final SubLObject v_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !setq_form.isCons() || NIL == Types.sublisp_true( setq_form.first() ) || !setq_form.rest().isCons() || !setq_form.rest().first().isCons() || !setq_form.rest().rest().isCons() || NIL == Types.sublisp_true(
        setq_form.rest().rest().first() ) || !setq_form.rest().rest().rest().isList() )
    {
      return setq_form;
    }
    final SubLObject var_list = conses_high.cadr( setq_form );
    final SubLObject form = methods_transform_setqs_for_auto_update_private( conses_high.cddr( setq_form ).first(), v_class );
    final SubLObject body = methods_transform_setqs_for_auto_update_private( conses_high.cddr( setq_form ).rest(), v_class );
    SubLObject update_forms = NIL;
    SubLObject cdolist_list_var = var_list;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject getter = slots.get_instance_slot_accessors( v_class, var );
      final SubLObject setter = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != setter )
      {
        update_forms = ConsesLow.cons( conses_high.copy_list( ConsesLow.list( setter, $sym86$SELF, var ) ), update_forms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    if( NIL != update_forms )
    {
      return conses_high.copy_list( ConsesLow.listS( $sym91$CMULTIPLE_VALUE_SETQ, var_list, form, ConsesLow.append( Sequences.nreverse( update_forms ), body, NIL ) ) );
    }
    return conses_high.copy_list( ConsesLow.listS( $sym91$CMULTIPLE_VALUE_SETQ, var_list, form, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41888L)
  public static SubLObject methods_transform_setqs_for_auto_update_private(final SubLObject body, final SubLObject v_class)
  {
    if( NIL == body )
    {
      return NIL;
    }
    if( !body.isCons() )
    {
      return body;
    }
    final SubLObject first_element = body.first();
    final SubLObject rest_of_body = body.rest();
    if( NIL != conses_high.member( first_element, $list92, UNPROVIDED, UNPROVIDED ) )
    {
      return methods_transform_setq_for_auto_update_private( body, v_class );
    }
    if( first_element == $sym93$CPOP )
    {
      return methods_transform_cpop_for_auto_update_private( body, v_class );
    }
    if( NIL != conses_high.member( first_element, $list94, UNPROVIDED, UNPROVIDED ) )
    {
      return methods_transform_cinc_or_cdec_for_auto_update_private( body, v_class );
    }
    if( NIL != conses_high.member( first_element, $list95, UNPROVIDED, UNPROVIDED ) )
    {
      return methods_transform_cpush_or_cpushnew_for_auto_update_private( body, v_class );
    }
    if( first_element == $sym91$CMULTIPLE_VALUE_SETQ )
    {
      return methods_transform_cmultiple_value_setq_for_auto_update_private( body, v_class );
    }
    return ConsesLow.cons( methods_transform_setqs_for_auto_update_private( first_element, v_class ), methods_transform_setqs_for_auto_update_private( rest_of_body, v_class ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42897L)
  public static SubLObject methods_transform_setqs_for_auto_update(final SubLObject body, final SubLObject class_name_or_class)
  {
    final SubLObject v_class = class_name_or_class.isSymbol() ? classes.classes_retrieve_class( class_name_or_class ) : class_name_or_class;
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      return methods_transform_setqs_for_auto_update_private( body, v_class );
    }
    return body;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43234L)
  public static SubLObject methods_substitute_ret_forms_with_throw_to_tag(final SubLObject body, final SubLObject tag, SubLObject inside_backquote)
  {
    if( inside_backquote == UNPROVIDED )
    {
      inside_backquote = NIL;
    }
    if( NIL == body )
    {
      return NIL;
    }
    if( body.isAtom() )
    {
      return body;
    }
    if( body.first() == $sym18$QUOTE )
    {
      return conses_high.copy_tree( body );
    }
    if( body.first() != $sym96$RET )
    {
      return ConsesLow.cons( methods_substitute_ret_forms_with_throw_to_tag( body.first(), tag, UNPROVIDED ), methods_substitute_ret_forms_with_throw_to_tag( body.rest(), tag, UNPROVIDED ) );
    }
    if( body.rest().isCons() )
    {
      return ConsesLow.list( $sym97$THROW, ConsesLow.list( $sym18$QUOTE, tag ), methods_substitute_ret_forms_with_throw_to_tag( conses_high.cadr( body ), tag, UNPROVIDED ) );
    }
    return ConsesLow.list( $sym97$THROW, ConsesLow.list( $sym18$QUOTE, tag ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45104L)
  public static SubLObject methods_lambda_list_to_listed_arg_value_expression(final SubLObject lambda_list)
  {
    return ConsesLow.cons( $sym98$LIST, methods_filter_option_words_from_lambda_list( lambda_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45269L)
  public static SubLObject generate_instance_variable_bindings_for_instance(final SubLObject var, final SubLObject class_name, final SubLObject method_name, final SubLObject lambda_list,
      final SubLObject method_properties, final SubLObject instance_variables, final SubLObject body, SubLObject read_only)
  {
    if( read_only == UNPROVIDED )
    {
      read_only = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject var_bindings = NIL;
    final SubLObject v_class = classes.classes_retrieve_class( class_name );
    SubLObject update_expressions = NIL;
    final SubLObject preprocessed_conc_name = Sequences.cconcatenate( Symbols.symbol_name( class_name ), $str48$_ );
    final SubLObject catch_tag = Symbols.make_symbol( Sequences.cconcatenate( $str99$OUTER_CATCH_FOR_, new SubLObject[] { preprocessed_conc_name, $str100$METHOD
    } ) );
    final SubLObject catch_var = Symbols.make_symbol( Sequences.cconcatenate( $str101$CATCH_VAR_FOR_, new SubLObject[] { preprocessed_conc_name, $str100$METHOD
    } ) );
    final SubLObject listed_args_var = Symbols.make_symbol( $str102$LISTED_ARGS );
    SubLObject preprocessed_body = methods_inline_method_calls( body, class_name );
    final SubLObject before_listeners_p = classes.classes_before_listeners_p( method_properties );
    final SubLObject after_listeners_p = classes.classes_after_listeners_p( method_properties );
    SubLObject variable = NIL;
    SubLObject explicit_getter = NIL;
    SubLObject explicit_setter = NIL;
    if( NIL != classes.classes_no_member_variables_p( method_properties ) && NIL == $methods_insert_trace_code_p$.getDynamicValue( thread ) )
    {
      return reader.bq_cons( $sym11$PROGN, preprocessed_body );
    }
    if( NIL != classes.classes_auto_update_p( method_properties ) )
    {
      preprocessed_body = methods_transform_setqs_for_auto_update( preprocessed_body, class_name );
      read_only = T;
    }
    if( NIL != classes.classes_read_only_p( method_properties ) )
    {
      read_only = T;
    }
    SubLObject cdolist_list_var = instance_variables;
    SubLObject instance_variable_form = NIL;
    instance_variable_form = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( instance_variable_form.isCons() )
      {
        variable = instance_variable_form.first();
        explicit_getter = conses_high.cadr( instance_variable_form );
        explicit_setter = conses_high.cddr( instance_variable_form ).first();
      }
      else
      {
        variable = instance_variable_form;
        thread.resetMultipleValues();
        final SubLObject explicit_getter_$17 = slots.get_instance_slot_accessors( v_class, variable );
        final SubLObject explicit_setter_$18 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        explicit_getter = explicit_getter_$17;
        explicit_setter = explicit_setter_$18;
      }
      if( NIL != utilities_macros.unquoted_symbol_in_tree_p( variable, preprocessed_body ) )
      {
        var_bindings = ConsesLow.cons( ConsesLow.list( variable, ConsesLow.list( explicit_getter, var ) ), var_bindings );
        if( NIL == read_only )
        {
          update_expressions = ConsesLow.cons( ConsesLow.list( explicit_setter, var, variable ), update_expressions );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      instance_variable_form = cdolist_list_var.first();
    }
    if( NIL != var_bindings || NIL != $methods_insert_trace_code_p$.getDynamicValue( thread ) )
    {
      if( NIL == read_only || NIL != $methods_insert_trace_code_p$.getDynamicValue( thread ) )
      {
        return ConsesLow.listS( $sym103$CLET, reader.bq_cons( reader.bq_cons( catch_var, $list104 ), ConsesLow.append( ( NIL != before_listeners_p || NIL != after_listeners_p ) ? ConsesLow.list( ConsesLow.list(
            listed_args_var, ( NIL != lambda_list ) ? methods_lambda_list_to_listed_arg_value_expression( lambda_list ) : NIL ) ) : NIL, Sequences.reverse( var_bindings ) ) ), ConsesLow.list( $sym105$CCATCH, ConsesLow
                .list( $sym18$QUOTE, catch_tag ), catch_var, ConsesLow.listS( $sym10$CUNWIND_PROTECT, reader.bq_cons( $sym11$PROGN, ConsesLow.append( ( NIL != before_listeners_p ) ? ConsesLow.list( ConsesLow.list(
                    $sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS, ConsesLow.list( $sym18$QUOTE, method_name ), var, listed_args_var ) ) : NIL, methods_substitute_ret_forms_with_throw_to_tag( preprocessed_body,
                        catch_tag, UNPROVIDED ) ) ), ConsesLow.append( ( NIL != $methods_insert_trace_code_p$.getDynamicValue( thread ) ) ? ConsesLow.list( expand_methods_insert_tracing_exit_code( method_name,
                            $sym86$SELF, catch_var ) ) : NIL, ( NIL != read_only ) ? NIL : Sequences.reverse( update_expressions ), NIL ) ) ), ConsesLow.append( ( NIL != after_listeners_p ) ? ConsesLow.list( ConsesLow
                                .list( $sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS, ConsesLow.list( $sym18$QUOTE, method_name ), var, listed_args_var, catch_var ) ) : NIL, ConsesLow.list( ConsesLow.list( $sym96$RET,
                                    catch_var ) ) ) );
      }
      if( NIL != after_listeners_p )
      {
        if( NIL != before_listeners_p )
        {
          return ConsesLow.list( $sym103$CLET, ConsesLow.listS( reader.bq_cons( catch_var, $list104 ), ConsesLow.list( listed_args_var, ( NIL != lambda_list ) ? methods_lambda_list_to_listed_arg_value_expression(
              lambda_list ) : NIL ), Sequences.reverse( var_bindings ) ), ConsesLow.listS( $sym105$CCATCH, ConsesLow.list( $sym18$QUOTE, catch_tag ), catch_var, ConsesLow.list(
                  $sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS, ConsesLow.list( $sym18$QUOTE, method_name ), var, listed_args_var ), methods_substitute_ret_forms_with_throw_to_tag( preprocessed_body, catch_tag,
                      UNPROVIDED ) ), ConsesLow.list( $sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS, ConsesLow.list( $sym18$QUOTE, method_name ), var, listed_args_var, catch_var ), ConsesLow.list( $sym96$RET,
                          catch_var ) );
        }
        return ConsesLow.list( $sym103$CLET, ConsesLow.listS( reader.bq_cons( catch_var, $list104 ), ConsesLow.list( listed_args_var, ( NIL != lambda_list ) ? methods_lambda_list_to_listed_arg_value_expression(
            lambda_list ) : NIL ), Sequences.reverse( var_bindings ) ), ConsesLow.listS( $sym105$CCATCH, ConsesLow.list( $sym18$QUOTE, catch_tag ), catch_var, methods_substitute_ret_forms_with_throw_to_tag(
                preprocessed_body, catch_tag, UNPROVIDED ) ), ConsesLow.list( $sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS, ConsesLow.list( $sym18$QUOTE, method_name ), var, listed_args_var, catch_var ), ConsesLow
                    .list( $sym96$RET, catch_var ) );
      }
      else
      {
        if( NIL != before_listeners_p )
        {
          return ConsesLow.listS( $sym103$CLET, reader.bq_cons( ConsesLow.list( listed_args_var, ( NIL != lambda_list ) ? methods_lambda_list_to_listed_arg_value_expression( lambda_list ) : NIL ), Sequences.reverse(
              var_bindings ) ), ConsesLow.list( $sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS, ConsesLow.list( $sym18$QUOTE, method_name ), var, listed_args_var ), preprocessed_body );
        }
        return ConsesLow.listS( $sym103$CLET, Sequences.reverse( var_bindings ), preprocessed_body );
      }
    }
    else if( NIL != after_listeners_p )
    {
      if( NIL != before_listeners_p )
      {
        return ConsesLow.list( $sym103$CLET, ConsesLow.listS( reader.bq_cons( catch_var, $list104 ), ConsesLow.list( listed_args_var, ( NIL != lambda_list ) ? methods_lambda_list_to_listed_arg_value_expression(
            lambda_list ) : NIL ), Sequences.reverse( var_bindings ) ), ConsesLow.listS( $sym105$CCATCH, ConsesLow.list( $sym18$QUOTE, catch_tag ), catch_var, ConsesLow.list(
                $sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS, ConsesLow.list( $sym18$QUOTE, method_name ), var, listed_args_var ), methods_substitute_ret_forms_with_throw_to_tag( preprocessed_body, catch_tag,
                    UNPROVIDED ) ), ConsesLow.list( $sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS, ConsesLow.list( $sym18$QUOTE, method_name ), var, listed_args_var, catch_var ), ConsesLow.list( $sym96$RET,
                        catch_var ) );
      }
      return reader.bq_cons( $sym11$PROGN, preprocessed_body );
    }
    else
    {
      if( NIL != before_listeners_p )
      {
        return ConsesLow.listS( $sym103$CLET, reader.bq_cons( ConsesLow.list( listed_args_var, ( NIL != lambda_list ) ? methods_lambda_list_to_listed_arg_value_expression( lambda_list ) : NIL ), Sequences.reverse(
            var_bindings ) ), ConsesLow.list( $sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS, ConsesLow.list( $sym18$QUOTE, method_name ), var, listed_args_var ), preprocessed_body );
      }
      return reader.bq_cons( $sym11$PROGN, preprocessed_body );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51425L)
  public static SubLObject methods_create_instance_method_decl(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body)
  {
    final SubLObject function_name = Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( class_name ), new SubLObject[] { $str48$_, Symbols.symbol_name( method_name ), $str49$_METHOD
    } ), UNPROVIDED );
    final SubLObject new_body = generate_instance_variable_bindings_for_instance( $sym86$SELF, class_name, method_name, lambda_list, method_properties, instances.instances_filter_slots_per_access( classes
        .classes_retrieve_class( class_name ), classes.classes_all_slots( class_name, UNPROVIDED ) ), body, NIL );
    final SubLObject self_in_bodyP = makeBoolean( NIL != utilities_macros.unquoted_symbol_in_tree_p( $sym86$SELF, new_body ) || NIL != utilities_macros.unquoted_symbol_in_tree_p( $sym88$SUPER, new_body ) );
    final SubLObject function_def = conses_high.copy_tree( ConsesLow.listS( $sym108$DEFINE_PUBLIC, function_name, reader.bq_cons( $sym86$SELF, lambda_list ), ConsesLow.append( ( NIL != self_in_bodyP ) ? NIL
        : conses_high.copy_tree( $list109 ), ConsesLow.list( new_body ) ) ) );
    return ConsesLow.listS( method_name, function_name, function_def );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52265L)
  public static SubLObject methods_generate_instance_function_definition(final SubLObject method, final SubLObject method_properties, final SubLObject method_body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subloop_structures.method_p( method ) )
    {
      final SubLObject name = subloop_structures.method_name( method );
      final SubLObject class_name = subloop_structures.method_class_name( method );
      final SubLObject lambda_list = subloop_structures.method_lambda_list( method );
      final SubLObject scope = subloop_structures.method_scope( method );
      final SubLObject function_name = subloop_structures.method_function_name( method );
      SubLObject function_def = subloop_structures.method_function_def( method );
      try
      {
        SubLObject preprocessed_body = method_body;
        SubLObject documentation_string = NIL;
        if( method_body.isCons() && method_body.first().isString() )
        {
          preprocessed_body = method_body.rest();
          documentation_string = method_body.first();
        }
        final SubLObject new_body = generate_instance_variable_bindings_for_instance( $sym86$SELF, class_name, name, lambda_list, method_properties, instances.instances_filter_slots_per_access( classes
            .classes_retrieve_class( class_name ), classes.classes_all_slots( class_name, UNPROVIDED ) ), preprocessed_body, NIL );
        final SubLObject self_in_bodyP = makeBoolean( NIL != utilities_macros.unquoted_symbol_in_tree_p( $sym86$SELF, new_body ) || NIL != utilities_macros.unquoted_symbol_in_tree_p( $sym88$SUPER, new_body ) );
        SubLObject special_form = $sym108$DEFINE_PUBLIC;
        final SubLObject pcase_var = scope;
        if( pcase_var.eql( $kw38$FILE_SCOPE ) )
        {
          special_form = $sym110$DEFINE_PRIVATE;
        }
        else if( pcase_var.eql( $kw39$SYSTEM_SCOPE ) )
        {
          special_form = $sym111$DEFINE_PROTECTED;
        }
        else if( pcase_var.eql( $kw40$GLOBAL_SCOPE ) )
        {
          special_form = $sym108$DEFINE_PUBLIC;
        }
        function_def = ConsesLow.listS( special_form, function_name, reader.bq_cons( $sym86$SELF, lambda_list ), ConsesLow.append( ( NIL != documentation_string ) ? ConsesLow.list( documentation_string ) : NIL,
            ( NIL != $methods_insert_trace_code_p$.getDynamicValue( thread ) ) ? ConsesLow.list( expand_methods_insert_tracing_enter_code( name, $sym86$SELF, lambda_list ) ) : NIL, ( NIL != self_in_bodyP ) ? NIL
                : conses_high.copy_tree( $list109 ), ConsesLow.list( new_body ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_structures._csetf_method_name( method, name );
          subloop_structures._csetf_method_class_name( method, class_name );
          subloop_structures._csetf_method_lambda_list( method, lambda_list );
          subloop_structures._csetf_method_scope( method, scope );
          subloop_structures._csetf_method_function_name( method, function_name );
          subloop_structures._csetf_method_function_def( method, function_def );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      return method;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53694L)
  public static SubLObject methods_create_class_method_decl(final SubLObject method_name, final SubLObject class_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body)
  {
    final SubLObject function_name = Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( class_name ), new SubLObject[] { $str48$_, Symbols.symbol_name( method_name ), $str49$_METHOD
    } ), UNPROVIDED );
    final SubLObject new_body = generate_instance_variable_bindings_for_instance( $sym86$SELF, class_name, method_name, lambda_list, method_properties, instances.instances_filter_slots_per_access( classes
        .classes_retrieve_class( class_name ), classes.classes_all_class_slots( class_name, UNPROVIDED ) ), body, NIL );
    final SubLObject function_def = conses_high.copy_tree( ConsesLow.list( $sym108$DEFINE_PUBLIC, function_name, reader.bq_cons( $sym86$SELF, lambda_list ), $list112, new_body ) );
    return ConsesLow.listS( method_name, function_name, function_def );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54434L)
  public static SubLObject methods_generate_class_function_definition(final SubLObject method, final SubLObject method_properties, final SubLObject method_body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subloop_structures.method_p( method ) )
    {
      final SubLObject name = subloop_structures.method_name( method );
      final SubLObject class_name = subloop_structures.method_class_name( method );
      final SubLObject lambda_list = subloop_structures.method_lambda_list( method );
      final SubLObject scope = subloop_structures.method_scope( method );
      final SubLObject function_name = subloop_structures.method_function_name( method );
      SubLObject function_def = subloop_structures.method_function_def( method );
      try
      {
        SubLObject preprocessed_body = method_body;
        SubLObject documentation_string = NIL;
        if( method_body.isCons() && method_body.first().isString() )
        {
          preprocessed_body = method_body.rest();
          documentation_string = method_body.first();
        }
        final SubLObject new_body = generate_instance_variable_bindings_for_instance( $sym86$SELF, class_name, name, lambda_list, method_properties, instances.instances_filter_slots_per_access( classes
            .classes_retrieve_class( class_name ), classes.classes_all_class_slots( class_name, UNPROVIDED ) ), preprocessed_body, NIL );
        SubLObject special_form = $sym108$DEFINE_PUBLIC;
        final SubLObject pcase_var = scope;
        if( pcase_var.eql( $kw38$FILE_SCOPE ) )
        {
          special_form = $sym110$DEFINE_PRIVATE;
        }
        else if( pcase_var.eql( $kw39$SYSTEM_SCOPE ) )
        {
          special_form = $sym111$DEFINE_PROTECTED;
        }
        else if( pcase_var.eql( $kw40$GLOBAL_SCOPE ) )
        {
          special_form = $sym108$DEFINE_PUBLIC;
        }
        function_def = conses_high.copy_tree( ConsesLow.listS( special_form, function_name, reader.bq_cons( $sym86$SELF, lambda_list ), ConsesLow.append( ( NIL != documentation_string ) ? ConsesLow.list(
            documentation_string ) : NIL, ( NIL != $methods_insert_trace_code_p$.getDynamicValue( thread ) ) ? ConsesLow.list( expand_methods_insert_tracing_enter_code( name, $sym86$SELF, lambda_list ) ) : NIL, ConsesLow
                .list( $list112, new_body ) ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_structures._csetf_method_name( method, name );
          subloop_structures._csetf_method_class_name( method, class_name );
          subloop_structures._csetf_method_lambda_list( method, lambda_list );
          subloop_structures._csetf_method_scope( method, scope );
          subloop_structures._csetf_method_function_name( method, function_name );
          subloop_structures._csetf_method_function_def( method, function_def );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      return method;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55801L)
  public static SubLObject methods_get_method(final SubLObject v_class, final SubLObject method_name)
  {
    if( NIL != subloop_structures.class_p( v_class ) )
    {
      final SubLObject compiled_instance_method_access_alist = subloop_structures.class_compiled_instance_method_access_alist( v_class );
      final SubLObject compiled_class_method_access_alist = subloop_structures.class_compiled_class_method_access_alist( v_class );
      SubLObject method = method_assoc( method_name, compiled_instance_method_access_alist );
      if( NIL != method )
      {
        return method;
      }
      method = method_assoc( method_name, compiled_class_method_access_alist );
      if( NIL != method )
      {
        return method;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56176L)
  public static SubLObject methods_get_all_method_names(final SubLObject class_or_instance)
  {
    final SubLObject v_class = ( NIL != subloop_structures.class_p( class_or_instance ) ) ? class_or_instance
        : ( ( NIL != subloop_structures.instance_p( class_or_instance ) ) ? subloop_structures.instance_class( class_or_instance ) : NIL );
    if( NIL != v_class )
    {
      SubLObject collected_methods = NIL;
      final SubLObject v_class_$22 = v_class;
      final SubLObject compiled_instance_method_access_alist = subloop_structures.class_compiled_instance_method_access_alist( v_class_$22 );
      SubLObject cdolist_list_var;
      final SubLObject compiled_class_method_access_alist = cdolist_list_var = subloop_structures.class_compiled_class_method_access_alist( v_class_$22 );
      SubLObject method = NIL;
      method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = subloop_structures.method_name( method );
        if( NIL == conses_high.member( item_var, collected_methods, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          collected_methods = ConsesLow.cons( item_var, collected_methods );
        }
        cdolist_list_var = cdolist_list_var.rest();
        method = cdolist_list_var.first();
      }
      cdolist_list_var = compiled_instance_method_access_alist;
      method = NIL;
      method = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = subloop_structures.method_name( method );
        if( NIL == conses_high.member( item_var, collected_methods, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          collected_methods = ConsesLow.cons( item_var, collected_methods );
        }
        cdolist_list_var = cdolist_list_var.rest();
        method = cdolist_list_var.first();
      }
      return Sequences.nreverse( collected_methods );
    }
    return NIL;
  }

  public static SubLObject declare_methods_file()
  {
    SubLFiles.declareFunction( me, "methods_generate_format_string_for_tracing", "METHODS-GENERATE-FORMAT-STRING-FOR-TRACING", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_generate_method_enter_format_string", "METHODS-GENERATE-METHOD-ENTER-FORMAT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_generate_method_exit_format_string", "METHODS-GENERATE-METHOD-EXIT-FORMAT-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "methods_tracing_tab", "METHODS-TRACING-TAB", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_filter_option_words_from_lambda_list", "METHODS-FILTER-OPTION-WORDS-FROM-LAMBDA-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_methods_insert_tracing_enter_code", "EXPAND-METHODS-INSERT-TRACING-ENTER-CODE", 3, 0, false );
    SubLFiles.declareMacro( me, "methods_insert_tracing_enter_code", "METHODS-INSERT-TRACING-ENTER-CODE" );
    SubLFiles.declareFunction( me, "expand_methods_insert_tracing_exit_code", "EXPAND-METHODS-INSERT-TRACING-EXIT-CODE", 3, 0, false );
    SubLFiles.declareMacro( me, "methods_insert_tracing_exit_code", "METHODS-INSERT-TRACING-EXIT-CODE" );
    SubLFiles.declareFunction( me, "methods_protection_level_p", "METHODS-PROTECTION-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_scope_level_p", "METHODS-SCOPE-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_method_listener_types", "VALID-METHOD-LISTENER-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "method_listener_type_p", "METHOD-LISTENER-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_method_listener_type", "ENCODE-METHOD-LISTENER-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_method_listener_type", "DECODE-METHOD-LISTENER-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "method_listener_type_less_p", "METHOD-LISTENER-TYPE-LESS-P", 2, 0, false );
    SubLFiles.declareFunction( me, "method_listener_type_greater_p", "METHOD-LISTENER-TYPE-GREATER-P", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_special_form_given_scope_level", "METHODS-SPECIAL-FORM-GIVEN-SCOPE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "method_assoc", "METHOD-ASSOC", 2, 0, false );
    SubLFiles.declareFunction( me, "method_shadowed_assoc", "METHOD-SHADOWED-ASSOC", 2, 0, false );
    SubLFiles.declareFunction( me, "method_class_assoc", "METHOD-CLASS-ASSOC", 3, 0, false );
    SubLFiles.declareFunction( me, "method_class_shadowed_assoc", "METHOD-CLASS-SHADOWED-ASSOC", 3, 0, false );
    SubLFiles.declareFunction( me, "methods_protection_level_of_method_decl", "METHODS-PROTECTION-LEVEL-OF-METHOD-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_scope_level_of_method_decl", "METHODS-SCOPE-LEVEL-OF-METHOD-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_update_type_of_method_decl", "METHODS-UPDATE-TYPE-OF-METHOD-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_before_listeners_p", "METHODS-BEFORE-LISTENERS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_after_listeners_p", "METHODS-AFTER-LISTENERS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "method_instantiate_template_p", "METHOD-INSTANTIATE-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_method", "NEW-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "methods_intern_method", "METHODS-INTERN-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "method_set_function_definition", "METHOD-SET-FUNCTION-DEFINITION", 4, 0, false );
    SubLFiles.declareFunction( me, "methods_check_method_spec", "METHODS-CHECK-METHOD-SPEC", 2, 0, false );
    SubLFiles.declareMacro( me, "def_instance_method", "DEF-INSTANCE-METHOD" );
    SubLFiles.declareFunction( me, "subloop_register_instance_method", "SUBLOOP-REGISTER-INSTANCE-METHOD", 3, 0, false );
    SubLFiles.declareMacro( me, "def_default_instance_method", "DEF-DEFAULT-INSTANCE-METHOD" );
    SubLFiles.declareFunction( me, "methods_retrieve_instance_method_definition", "METHODS-RETRIEVE-INSTANCE-METHOD-DEFINITION", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_incorporate_instance_method", "METHODS-INCORPORATE-INSTANCE-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "methods_update_instance_method_decl", "METHODS-UPDATE-INSTANCE-METHOD-DECL", 5, 0, false );
    SubLFiles.declareMacro( me, "def_class_method", "DEF-CLASS-METHOD" );
    SubLFiles.declareFunction( me, "subloop_register_class_method", "SUBLOOP-REGISTER-CLASS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "methods_retrieve_class_method_definition", "METHODS-RETRIEVE-CLASS-METHOD-DEFINITION", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_incorporate_class_method", "METHODS-INCORPORATE-CLASS-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "methods_update_class_method_decl", "METHODS-UPDATE-CLASS-METHOD-DECL", 5, 0, false );
    SubLFiles.declareFunction( me, "methods_method_name_given_method_decl", "METHODS-METHOD-NAME-GIVEN-METHOD-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_function_name_given_method_decl", "METHODS-FUNCTION-NAME-GIVEN-METHOD-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_function_def_given_method_decl", "METHODS-FUNCTION-DEF-GIVEN-METHOD-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_set_function_def_of_method_decl", "METHODS-SET-FUNCTION-DEF-OF-METHOD-DECL", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_add_method_decl", "METHODS-ADD-METHOD-DECL", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_retrieve_method_decl", "METHODS-RETRIEVE-METHOD-DECL", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_compile_method_access_alists", "METHODS-COMPILE-METHOD-ACCESS-ALISTS", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_compile_class_method_access_alist_upwards", "METHODS-COMPILE-CLASS-METHOD-ACCESS-ALIST-UPWARDS", 1, 1, false );
    SubLFiles.declareFunction( me, "methods_compile_class_method_access_alist", "METHODS-COMPILE-CLASS-METHOD-ACCESS-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "methods_compile_instance_method_access_alist_upwards", "METHODS-COMPILE-INSTANCE-METHOD-ACCESS-ALIST-UPWARDS", 1, 1, false );
    SubLFiles.declareFunction( me, "methods_compile_instance_method_access_alist", "METHODS-COMPILE-INSTANCE-METHOD-ACCESS-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_0_args", "FUNCALL-CLASS-METHOD-WITH-0-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_1_args", "FUNCALL-CLASS-METHOD-WITH-1-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_2_args", "FUNCALL-CLASS-METHOD-WITH-2-ARGS", 4, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_3_args", "FUNCALL-CLASS-METHOD-WITH-3-ARGS", 5, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_4_args", "FUNCALL-CLASS-METHOD-WITH-4-ARGS", 6, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_5_args", "FUNCALL-CLASS-METHOD-WITH-5-ARGS", 7, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_6_args", "FUNCALL-CLASS-METHOD-WITH-6-ARGS", 8, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_7_args", "FUNCALL-CLASS-METHOD-WITH-7-ARGS", 9, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_8_args", "FUNCALL-CLASS-METHOD-WITH-8-ARGS", 10, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_9_args", "FUNCALL-CLASS-METHOD-WITH-9-ARGS", 11, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_10_args", "FUNCALL-CLASS-METHOD-WITH-10-ARGS", 12, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_11_args", "FUNCALL-CLASS-METHOD-WITH-11-ARGS", 13, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_12_args", "FUNCALL-CLASS-METHOD-WITH-12-ARGS", 14, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_13_args", "FUNCALL-CLASS-METHOD-WITH-13-ARGS", 15, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_14_args", "FUNCALL-CLASS-METHOD-WITH-14-ARGS", 16, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_15_args", "FUNCALL-CLASS-METHOD-WITH-15-ARGS", 17, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_16_args", "FUNCALL-CLASS-METHOD-WITH-16-ARGS", 18, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_17_args", "FUNCALL-CLASS-METHOD-WITH-17-ARGS", 19, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_18_args", "FUNCALL-CLASS-METHOD-WITH-18-ARGS", 20, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_19_args", "FUNCALL-CLASS-METHOD-WITH-19-ARGS", 21, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_method_with_20_args", "FUNCALL-CLASS-METHOD-WITH-20-ARGS", 22, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_0_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-0-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_1_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-1-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_2_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-2-ARGS", 4, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_3_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-3-ARGS", 5, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_4_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-4-ARGS", 6, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_5_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-5-ARGS", 7, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_6_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-6-ARGS", 8, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_7_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-7-ARGS", 9, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_8_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-8-ARGS", 10, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_9_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-9-ARGS", 11, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_10_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-10-ARGS", 12, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_11_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-11-ARGS", 13, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_12_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-12-ARGS", 14, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_13_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-13-ARGS", 15, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_14_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-14-ARGS", 16, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_15_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-15-ARGS", 17, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_16_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-16-ARGS", 18, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_17_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-17-ARGS", 19, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_18_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-18-ARGS", 20, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_19_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-19-ARGS", 21, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_super_method_with_20_args", "FUNCALL-CLASS-SUPER-METHOD-WITH-20-ARGS", 22, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_0_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-0-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_1_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-1-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_2_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-2-ARGS", 4, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_3_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-3-ARGS", 5, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_4_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-4-ARGS", 6, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_5_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-5-ARGS", 7, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_6_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-6-ARGS", 8, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_7_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-7-ARGS", 9, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_8_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-8-ARGS", 10, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_9_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-9-ARGS", 11, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_10_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-10-ARGS", 12, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_11_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-11-ARGS", 13, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_12_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-12-ARGS", 14, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_13_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-13-ARGS", 15, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_14_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-14-ARGS", 16, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_15_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-15-ARGS", 17, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_16_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-16-ARGS", 18, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_17_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-17-ARGS", 19, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_18_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-18-ARGS", 20, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_19_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-19-ARGS", 21, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_method_with_20_args", "SAFE-FUNCALL-CLASS-METHOD-WITH-20-ARGS", 22, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_0_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-0-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_1_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-1-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_2_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-2-ARGS", 4, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_3_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-3-ARGS", 5, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_4_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-4-ARGS", 6, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_5_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-5-ARGS", 7, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_6_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-6-ARGS", 8, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_7_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-7-ARGS", 9, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_8_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-8-ARGS", 10, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_9_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-9-ARGS", 11, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_10_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-10-ARGS", 12, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_11_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-11-ARGS", 13, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_12_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-12-ARGS", 14, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_13_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-13-ARGS", 15, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_14_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-14-ARGS", 16, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_15_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-15-ARGS", 17, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_16_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-16-ARGS", 18, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_17_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-17-ARGS", 19, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_18_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-18-ARGS", 20, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_19_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-19-ARGS", 21, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_super_method_with_20_args", "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-20-ARGS", 22, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_0_args", "FUNCALL-INSTANCE-METHOD-WITH-0-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_1_args", "FUNCALL-INSTANCE-METHOD-WITH-1-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_2_args", "FUNCALL-INSTANCE-METHOD-WITH-2-ARGS", 4, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_3_args", "FUNCALL-INSTANCE-METHOD-WITH-3-ARGS", 5, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_4_args", "FUNCALL-INSTANCE-METHOD-WITH-4-ARGS", 6, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_5_args", "FUNCALL-INSTANCE-METHOD-WITH-5-ARGS", 7, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_6_args", "FUNCALL-INSTANCE-METHOD-WITH-6-ARGS", 8, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_7_args", "FUNCALL-INSTANCE-METHOD-WITH-7-ARGS", 9, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_8_args", "FUNCALL-INSTANCE-METHOD-WITH-8-ARGS", 10, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_9_args", "FUNCALL-INSTANCE-METHOD-WITH-9-ARGS", 11, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_10_args", "FUNCALL-INSTANCE-METHOD-WITH-10-ARGS", 12, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_11_args", "FUNCALL-INSTANCE-METHOD-WITH-11-ARGS", 13, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_12_args", "FUNCALL-INSTANCE-METHOD-WITH-12-ARGS", 14, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_13_args", "FUNCALL-INSTANCE-METHOD-WITH-13-ARGS", 15, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_14_args", "FUNCALL-INSTANCE-METHOD-WITH-14-ARGS", 16, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_15_args", "FUNCALL-INSTANCE-METHOD-WITH-15-ARGS", 17, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_16_args", "FUNCALL-INSTANCE-METHOD-WITH-16-ARGS", 18, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_17_args", "FUNCALL-INSTANCE-METHOD-WITH-17-ARGS", 19, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_18_args", "FUNCALL-INSTANCE-METHOD-WITH-18-ARGS", 20, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_19_args", "FUNCALL-INSTANCE-METHOD-WITH-19-ARGS", 21, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_method_with_20_args", "FUNCALL-INSTANCE-METHOD-WITH-20-ARGS", 22, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_0_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-0-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_1_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-1-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_2_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-2-ARGS", 4, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_3_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-3-ARGS", 5, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_4_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-4-ARGS", 6, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_5_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-5-ARGS", 7, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_6_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-6-ARGS", 8, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_7_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-7-ARGS", 9, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_8_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-8-ARGS", 10, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_9_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-9-ARGS", 11, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_10_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-10-ARGS", 12, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_11_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-11-ARGS", 13, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_12_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-12-ARGS", 14, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_13_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-13-ARGS", 15, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_14_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-14-ARGS", 16, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_15_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-15-ARGS", 17, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_16_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-16-ARGS", 18, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_17_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-17-ARGS", 19, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_18_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-18-ARGS", 20, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_19_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-19-ARGS", 21, 0, false );
    SubLFiles.declareFunction( me, "funcall_instance_super_method_with_20_args", "FUNCALL-INSTANCE-SUPER-METHOD-WITH-20-ARGS", 22, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_0_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-0-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_1_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-1-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_2_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-2-ARGS", 4, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_3_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-3-ARGS", 5, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_4_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-4-ARGS", 6, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_5_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-5-ARGS", 7, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_6_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-6-ARGS", 8, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_7_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-7-ARGS", 9, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_8_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-8-ARGS", 10, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_9_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-9-ARGS", 11, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_10_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-10-ARGS", 12, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_11_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-11-ARGS", 13, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_12_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-12-ARGS", 14, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_13_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-13-ARGS", 15, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_14_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-14-ARGS", 16, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_15_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-15-ARGS", 17, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_16_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-16-ARGS", 18, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_17_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-17-ARGS", 19, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_18_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-18-ARGS", 20, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_19_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-19-ARGS", 21, 0, false );
    SubLFiles.declareFunction( me, "funcall_class_or_instance_method_with_20_args", "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-20-ARGS", 22, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_0_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-0-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_1_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-1-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_2_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-2-ARGS", 4, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_3_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-3-ARGS", 5, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_4_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-4-ARGS", 6, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_5_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-5-ARGS", 7, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_6_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-6-ARGS", 8, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_7_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-7-ARGS", 9, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_8_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-8-ARGS", 10, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_9_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-9-ARGS", 11, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_10_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-10-ARGS", 12, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_11_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-11-ARGS", 13, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_12_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-12-ARGS", 14, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_13_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-13-ARGS", 15, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_14_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-14-ARGS", 16, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_15_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-15-ARGS", 17, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_16_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-16-ARGS", 18, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_17_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-17-ARGS", 19, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_18_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-18-ARGS", 20, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_19_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-19-ARGS", 21, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_method_with_20_args", "SAFE-FUNCALL-INSTANCE-METHOD-WITH-20-ARGS", 22, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_0_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-0-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_1_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-1-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_2_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-2-ARGS", 4, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_3_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-3-ARGS", 5, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_4_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-4-ARGS", 6, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_5_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-5-ARGS", 7, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_6_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-6-ARGS", 8, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_7_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-7-ARGS", 9, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_8_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-8-ARGS", 10, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_9_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-9-ARGS", 11, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_10_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-10-ARGS", 12, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_11_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-11-ARGS", 13, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_12_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-12-ARGS", 14, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_13_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-13-ARGS", 15, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_14_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-14-ARGS", 16, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_15_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-15-ARGS", 17, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_16_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-16-ARGS", 18, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_17_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-17-ARGS", 19, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_18_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-18-ARGS", 20, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_19_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-19-ARGS", 21, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_instance_super_method_with_20_args", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-20-ARGS", 22, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_0_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-0-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_1_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-1-ARGS", 3, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_2_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-2-ARGS", 4, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_3_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-3-ARGS", 5, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_4_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-4-ARGS", 6, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_5_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-5-ARGS", 7, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_6_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-6-ARGS", 8, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_7_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-7-ARGS", 9, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_8_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-8-ARGS", 10, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_9_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-9-ARGS", 11, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_10_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-10-ARGS", 12, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_11_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-11-ARGS", 13, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_12_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-12-ARGS", 14, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_13_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-13-ARGS", 15, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_14_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-14-ARGS", 16, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_15_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-15-ARGS", 17, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_16_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-16-ARGS", 18, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_17_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-17-ARGS", 19, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_18_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-18-ARGS", 20, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_19_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-19-ARGS", 21, 0, false );
    SubLFiles.declareFunction( me, "safe_funcall_class_or_instance_method_with_20_args", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-20-ARGS", 22, 0, false );
    SubLFiles.declareFunction( me, "resolve_method", "RESOLVE-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "quote_method", "QUOTE-METHOD" );
    SubLFiles.declareMacro( me, "fquote_method", "FQUOTE-METHOD" );
    SubLFiles.declareFunction( me, "method_name_to_function_name", "METHOD-NAME-TO-FUNCTION-NAME", 2, 0, false );
    SubLFiles.declareMacro( me, "inline_method", "INLINE-METHOD" );
    SubLFiles.declareMacro( me, "inline_super_method", "INLINE-SUPER-METHOD" );
    SubLFiles.declareFunction( me, "methods_inline_method_calls_internal", "METHODS-INLINE-METHOD-CALLS-INTERNAL", 4, 1, false );
    SubLFiles.declareFunction( me, "methods_inline_method_calls", "METHODS-INLINE-METHOD-CALLS", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_transform_setq_for_auto_update_private", "METHODS-TRANSFORM-SETQ-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_transform_cinc_or_cdec_for_auto_update_private", "METHODS-TRANSFORM-CINC-OR-CDEC-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_transform_cpop_for_auto_update_private", "METHODS-TRANSFORM-CPOP-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_transform_cpush_or_cpushnew_for_auto_update_private", "METHODS-TRANSFORM-CPUSH-OR-CPUSHNEW-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_transform_cmultiple_value_setq_for_auto_update_private", "METHODS-TRANSFORM-CMULTIPLE-VALUE-SETQ-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_transform_setqs_for_auto_update_private", "METHODS-TRANSFORM-SETQS-FOR-AUTO-UPDATE-PRIVATE", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_transform_setqs_for_auto_update", "METHODS-TRANSFORM-SETQS-FOR-AUTO-UPDATE", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_substitute_ret_forms_with_throw_to_tag", "METHODS-SUBSTITUTE-RET-FORMS-WITH-THROW-TO-TAG", 2, 1, false );
    SubLFiles.declareFunction( me, "methods_lambda_list_to_listed_arg_value_expression", "METHODS-LAMBDA-LIST-TO-LISTED-ARG-VALUE-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_instance_variable_bindings_for_instance", "GENERATE-INSTANCE-VARIABLE-BINDINGS-FOR-INSTANCE", 7, 1, false );
    SubLFiles.declareFunction( me, "methods_create_instance_method_decl", "METHODS-CREATE-INSTANCE-METHOD-DECL", 5, 0, false );
    SubLFiles.declareFunction( me, "methods_generate_instance_function_definition", "METHODS-GENERATE-INSTANCE-FUNCTION-DEFINITION", 3, 0, false );
    SubLFiles.declareFunction( me, "methods_create_class_method_decl", "METHODS-CREATE-CLASS-METHOD-DECL", 5, 0, false );
    SubLFiles.declareFunction( me, "methods_generate_class_function_definition", "METHODS-GENERATE-CLASS-FUNCTION-DEFINITION", 3, 0, false );
    SubLFiles.declareFunction( me, "methods_get_method", "METHODS-GET-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "methods_get_all_method_names", "METHODS-GET-ALL-METHOD-NAMES", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_methods_file()
  {
    $methods_insert_trace_code_p$ = SubLFiles.defvar( "*METHODS-INSERT-TRACE-CODE-P*", NIL );
    $methods_block_tracing$ = SubLFiles.defparameter( "*METHODS-BLOCK-TRACING*", NIL );
    $methods_tracing_format_strings_vector_size$ = SubLFiles.defconstant( "*METHODS-TRACING-FORMAT-STRINGS-VECTOR-SIZE*", ELEVEN_INTEGER );
    $methods_tracing_format_strings$ = SubLFiles.defvar( "*METHODS-TRACING-FORMAT-STRINGS*", Vectors.make_vector( $methods_tracing_format_strings_vector_size$.getGlobalValue(), UNPROVIDED ) );
    $methods_trace_depth$ = SubLFiles.defparameter( "*METHODS-TRACE-DEPTH*", ZERO_INTEGER );
    $methods_protection_levels$ = SubLFiles.defparameter( "*METHODS-PROTECTION-LEVELS*", $list24 );
    $methods_scope_levels$ = SubLFiles.defparameter( "*METHODS-SCOPE-LEVELS*", $list25 );
    $valid_method_listener_types$ = SubLFiles.defconstant( "*VALID-METHOD-LISTENER-TYPES*", $list26 );
    $methods_scope_special_forms$ = SubLFiles.defparameter( "*METHODS-SCOPE-SPECIAL-FORMS*", $list34 );
    $report_default_method_callsP$ = SubLFiles.defparameter( "*REPORT-DEFAULT-METHOD-CALLS?*", NIL );
    return NIL;
  }

  public static SubLObject setup_methods_file()
  {
    enumerations.enumerations_incorporate_definition( $sym27$METHOD_LISTENER_TYPE, $list26 );
    access_macros.register_macro_helper( $sym57$SUBLOOP_REGISTER_INSTANCE_METHOD, $sym54$DEF_INSTANCE_METHOD );
    access_macros.register_macro_helper( $sym65$SUBLOOP_REGISTER_CLASS_METHOD, $sym63$DEF_CLASS_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_methods_file();
  }

  @Override
  public void initializeVariables()
  {
    init_methods_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_methods_file();
  }
  static
  {
    me = new methods();
    $methods_insert_trace_code_p$ = null;
    $methods_block_tracing$ = null;
    $methods_tracing_format_strings_vector_size$ = null;
    $methods_tracing_format_strings$ = null;
    $methods_trace_depth$ = null;
    $methods_protection_levels$ = null;
    $methods_scope_levels$ = null;
    $valid_method_listener_types$ = null;
    $methods_scope_special_forms$ = null;
    $report_default_method_callsP$ = null;
    $str0$__S__S__ = makeString( "(~S ~S)(" );
    $str1$_S = makeString( "~S" );
    $str2$__S = makeString( " ~S" );
    $str3$_ = makeString( ")" );
    $str4$_S___enter__ = makeString( "~S: <enter> " );
    $str5$_S___exit____S__S______S = makeString( "~S: <exit> (~S ~S) -> ~S" );
    $str6$__ = makeString( "  " );
    $sym7$_OPTIONAL = makeSymbol( "&OPTIONAL" );
    $sym8$PUNLESS = makeSymbol( "PUNLESS" );
    $sym9$_METHODS_BLOCK_TRACING_ = makeSymbol( "*METHODS-BLOCK-TRACING*" );
    $sym10$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym11$PROGN = makeSymbol( "PROGN" );
    $list12 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*METHODS-BLOCK-TRACING*" ), T );
    $list13 = ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "*STANDARD-OUTPUT*" ) );
    $list14 = ConsesLow.list( makeSymbol( "METHODS-TRACING-TAB" ), makeSymbol( "*STANDARD-OUTPUT*" ), makeSymbol( "*METHODS-TRACE-DEPTH*" ) );
    $sym15$FORMAT = makeSymbol( "FORMAT" );
    $sym16$_STANDARD_OUTPUT_ = makeSymbol( "*STANDARD-OUTPUT*" );
    $sym17$_METHODS_TRACE_DEPTH_ = makeSymbol( "*METHODS-TRACE-DEPTH*" );
    $sym18$QUOTE = makeSymbol( "QUOTE" );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*METHODS-BLOCK-TRACING*" ), NIL ) );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "*METHODS-TRACE-DEPTH*" ) ) );
    $list21 = ConsesLow.list( makeSymbol( "METHOD-NAME" ), makeSymbol( "INSTANCE" ), makeSymbol( "ARGS" ) );
    $list22 = ConsesLow.list( makeSymbol( "CDEC" ), makeSymbol( "*METHODS-TRACE-DEPTH*" ) );
    $list23 = ConsesLow.list( makeSymbol( "METHOD-NAME" ), makeSymbol( "INSTANCE" ), makeSymbol( "RESULT" ) );
    $list24 = ConsesLow.list( makeKeyword( "PRIVATE" ), makeKeyword( "PROTECTED" ), makeKeyword( "PUBLIC" ) );
    $list25 = ConsesLow.list( makeKeyword( "FILE-SCOPE" ), makeKeyword( "SYSTEM-SCOPE" ), makeKeyword( "GLOBAL-SCOPE" ) );
    $list26 = ConsesLow.list( makeKeyword( "BEFORE-LISTENERS" ), makeKeyword( "AFTER-LISTENERS" ) );
    $sym27$METHOD_LISTENER_TYPE = makeSymbol( "METHOD-LISTENER-TYPE" );
    $str28$_S___S_is_not_a_member_of_the__S_ = makeString( "~S: ~S is not a member of the ~S enumeration." );
    $sym29$ENCODE_METHOD_LISTENER_TYPE = makeSymbol( "ENCODE-METHOD-LISTENER-TYPE" );
    $str30$_S___S_is_not_a_valid_encoding_of = makeString( "~S: ~S is not a valid encoding of the ~S enumeration." );
    $sym31$DECODE_METHOD_LISTENER_TYPE = makeSymbol( "DECODE-METHOD-LISTENER-TYPE" );
    $str32$_S___S_was_expected_to_be_a_membe = makeString( "~S: ~S was expected to be a member of the enumeration ~S." );
    $sym33$METHOD_LISTENER_TYPE_P = makeSymbol( "METHOD-LISTENER-TYPE-P" );
    $list34 = ConsesLow.list( makeSymbol( "DEFINE-PRIVATE" ), makeSymbol( "DEFINE-PROTECTED" ), makeSymbol( "DEFINE-PUBLIC" ) );
    $kw35$PRIVATE = makeKeyword( "PRIVATE" );
    $kw36$PROTECTED = makeKeyword( "PROTECTED" );
    $kw37$PUBLIC = makeKeyword( "PUBLIC" );
    $kw38$FILE_SCOPE = makeKeyword( "FILE-SCOPE" );
    $kw39$SYSTEM_SCOPE = makeKeyword( "SYSTEM-SCOPE" );
    $kw40$GLOBAL_SCOPE = makeKeyword( "GLOBAL-SCOPE" );
    $kw41$AUTO_UPDATE = makeKeyword( "AUTO-UPDATE" );
    $kw42$NO_MEMBER_VARIABLES = makeKeyword( "NO-MEMBER-VARIABLES" );
    $kw43$READ_ONLY = makeKeyword( "READ-ONLY" );
    $kw44$BEFORE_LISTENERS = makeKeyword( "BEFORE-LISTENERS" );
    $kw45$AFTER_LISTENERS = makeKeyword( "AFTER-LISTENERS" );
    $kw46$INSTANTIATE_TEMPLATE = makeKeyword( "INSTANTIATE-TEMPLATE" );
    $kw47$DEFAULT = makeKeyword( "DEFAULT" );
    $str48$_ = makeString( "-" );
    $str49$_METHOD = makeString( "-METHOD" );
    $str50$_S___S_is_not_a_valid_method_spec = makeString( "~S: ~S is not a valid method specification.~%~\n     A valid method specification matches the pattern (<method name> <class name> . <method properties>)." );
    $str51$_S___S_is_not_a_valid_method_name = makeString( "~S: ~S is not a valid method name.  Only a non-null symbol is a valid method name." );
    $str52$_S__While_defining_method__S___S_ = makeString( "~S: While defining method ~S, ~S is not a valid class name.  Only a non-null symbol is a valid class name." );
    $list53 = ConsesLow.list( makeSymbol( "METHOD-SPEC" ), makeSymbol( "LAMBDA-LIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym54$DEF_INSTANCE_METHOD = makeSymbol( "DEF-INSTANCE-METHOD" );
    $list55 = ConsesLow.listS( makeSymbol( "METHOD-NAME" ), makeSymbol( "CLASS-NAME" ), makeSymbol( "METHOD-PROPERTIES" ) );
    $sym56$METHODS_INCORPORATE_INSTANCE_METHOD = makeSymbol( "METHODS-INCORPORATE-INSTANCE-METHOD" );
    $sym57$SUBLOOP_REGISTER_INSTANCE_METHOD = makeSymbol( "SUBLOOP-REGISTER-INSTANCE-METHOD" );
    $sym58$PWHEN = makeSymbol( "PWHEN" );
    $sym59$_REPORT_DEFAULT_METHOD_CALLS__ = makeSymbol( "*REPORT-DEFAULT-METHOD-CALLS?*" );
    $sym60$WARN = makeSymbol( "WARN" );
    $str61$Default_method_call__a_on_class__ = makeString( "Default method call ~a on class ~a" );
    $str62$DEF_INSTANCE_METHOD___S_is_not_th = makeString( "DEF-INSTANCE-METHOD: ~S is not the name of a class." );
    $sym63$DEF_CLASS_METHOD = makeSymbol( "DEF-CLASS-METHOD" );
    $sym64$METHODS_INCORPORATE_CLASS_METHOD = makeSymbol( "METHODS-INCORPORATE-CLASS-METHOD" );
    $sym65$SUBLOOP_REGISTER_CLASS_METHOD = makeSymbol( "SUBLOOP-REGISTER-CLASS-METHOD" );
    $str66$DEF_CLASS_METHOD___S_is_not_the_n = makeString( "DEF-CLASS-METHOD: ~S is not the name of a class." );
    $str67$FUNCALL_CLASS_METHOD___S_is_not_a = makeString( "FUNCALL-CLASS-METHOD: ~S is not a defined class." );
    $str68$FUNCALL_CLASS_METHOD___S_is_not_a = makeString( "FUNCALL-CLASS-METHOD: ~S is not a method of class ~S." );
    $str69$FUNCALL_CLASS_SUPER_METHOD___S_is = makeString( "FUNCALL-CLASS-SUPER-METHOD: ~S is not a defined class." );
    $str70$FUNCALL_CLASS_SUPER_METHOD___S_is = makeString( "FUNCALL-CLASS-SUPER-METHOD: ~S is not a method of class ~S." );
    $kw71$TARGET_NOT_A_CLASS = makeKeyword( "TARGET-NOT-A-CLASS" );
    $kw72$INVALID_METHOD_NAME = makeKeyword( "INVALID-METHOD-NAME" );
    $kw73$UNDECLARED_METHOD = makeKeyword( "UNDECLARED-METHOD" );
    $kw74$ACCESS_LEVEL_CONFLICT = makeKeyword( "ACCESS-LEVEL-CONFLICT" );
    $kw75$UNDEFINED_METHOD = makeKeyword( "UNDEFINED-METHOD" );
    $str76$__FUNCALL_INSTANCE_METHOD__either = makeString( "~%FUNCALL-INSTANCE-METHOD: either instance ~S or method ~S are invalid." );
    $str77$__FUNCALL_CLASS_OR_INSTANCE_METHO = makeString( "~%FUNCALL-CLASS-OR-INSTANCE-METHOD: Method ~S is invalid." );
    $str78$FUNCALL_CLASS_OR_INSTANCE_METHOD_ = makeString( "FUNCALL-CLASS-OR-INSTANCE-METHOD: ~S is not a valid class." );
    $kw79$TARGET_NOT_AN_INSTANCE = makeKeyword( "TARGET-NOT-AN-INSTANCE" );
    $str80$RESOLVE_METHOD___S_is_not_a_defin = makeString( "RESOLVE-METHOD: ~S is not a defined class." );
    $str81$RESOLVE_METHOD___S_is_not_a_defin = makeString( "RESOLVE-METHOD: ~S is not a defined method of class ~S." );
    $list82 = ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD-NAME" ), makeSymbol( "CLASS-NAME" ) ) );
    $list83 = ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD-NAME" ), makeSymbol( "CLASS-NAME" ) ), makeSymbol( "CLASS-OR-INSTANCE" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym84$FUNCALL_INSTANCE_METHOD = makeSymbol( "FUNCALL-INSTANCE-METHOD" );
    $sym85$FUNCALL_INSTANCE_SUPER_METHOD = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD" );
    $sym86$SELF = makeSymbol( "SELF" );
    $sym87$INLINE_METHOD = makeSymbol( "INLINE-METHOD" );
    $sym88$SUPER = makeSymbol( "SUPER" );
    $sym89$INLINE_SUPER_METHOD = makeSymbol( "INLINE-SUPER-METHOD" );
    $sym90$CSETQ = makeSymbol( "CSETQ" );
    $sym91$CMULTIPLE_VALUE_SETQ = makeSymbol( "CMULTIPLE-VALUE-SETQ" );
    $list92 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CSETF" ) );
    $sym93$CPOP = makeSymbol( "CPOP" );
    $list94 = ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "CDEC" ) );
    $list95 = ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "CPUSHNEW" ) );
    $sym96$RET = makeSymbol( "RET" );
    $sym97$THROW = makeSymbol( "THROW" );
    $sym98$LIST = makeSymbol( "LIST" );
    $str99$OUTER_CATCH_FOR_ = makeString( "OUTER-CATCH-FOR-" );
    $str100$METHOD = makeString( "METHOD" );
    $str101$CATCH_VAR_FOR_ = makeString( "CATCH-VAR-FOR-" );
    $str102$LISTED_ARGS = makeString( "LISTED-ARGS" );
    $sym103$CLET = makeSymbol( "CLET" );
    $list104 = ConsesLow.list( NIL );
    $sym105$CCATCH = makeSymbol( "CCATCH" );
    $sym106$METHOD_LISTENERS_INVOKE_BEFORE_LISTENERS = makeSymbol( "METHOD-LISTENERS-INVOKE-BEFORE-LISTENERS" );
    $sym107$METHOD_LISTENERS_INVOKE_AFTER_LISTENERS = makeSymbol( "METHOD-LISTENERS-INVOKE-AFTER-LISTENERS" );
    $sym108$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $list109 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "SELF" ) ) );
    $sym110$DEFINE_PRIVATE = makeSymbol( "DEFINE-PRIVATE" );
    $sym111$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $list112 = ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ) );
  }
}
/*
 * 
 * Total time: 1740 ms
 * 
 */